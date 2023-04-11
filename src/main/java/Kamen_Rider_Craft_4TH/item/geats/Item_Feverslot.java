package Kamen_Rider_Craft_4TH.item.geats;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.annotation.Nullable;

import Kamen_Rider_Craft_4TH.ReiwaRiderItems;
import Kamen_Rider_Craft_4TH.RiderItems;
import Kamen_Rider_Craft_4TH.TokuCraft_core;
import Kamen_Rider_Craft_4TH.blocks.hiden_3d_printing;
import Kamen_Rider_Craft_4TH.blocks.vistamp_bar;
import Kamen_Rider_Craft_4TH.blocks.zaia_3d_printing;
import Kamen_Rider_Craft_4TH.blocks.wood.BlockHelheimVine;
import Kamen_Rider_Craft_4TH.item.Item_ore;
import Kamen_Rider_Craft_4TH.item.saber.Item_wonder_ride_book;
import Kamen_Rider_Craft_4TH.item.zero_one.Item_progrise_keys;
import Kamen_Rider_Craft_4TH.util.IHasModel;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.IItemPropertyGetter;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;


public class Item_Feverslot extends Item implements IHasModel
{


	

	public Item_Feverslot(String name)
	{
		super();
		this.setMaxDamage(0);
		setTranslationKey(name);
		setRegistryName(name);
		TokuCraft_core.ITEMS.add(this);

	}
	

	@Override
	public void registerModels() {
		TokuCraft_core.proxy.registerItemRender(this,0,"inventory");
	}

	public static int get_ammo(ItemStack itemstack)
	{
		return itemstack.hasTagCompound() ? itemstack.getTagCompound().getInteger("Ammo") : 0;
	}
	
	public static void set_ammo(ItemStack itemstack, int flag)
	{
		if (!itemstack.hasTagCompound())
		{
			itemstack.setTagCompound(new NBTTagCompound());
		}
		itemstack.getTagCompound().setInteger("Ammo", flag);
	}
	
	@SideOnly(Side.CLIENT)
	public boolean hasEffect(ItemStack par1ItemStack)
	{
		if (this.get_ammo(par1ItemStack)==200){
			return true;
		}else{
			return !true;
		}
	}
	
	public void onUpdate(ItemStack par1ItemStack, World worldIn, Entity par3Entity, int par4, boolean par5) {

		if (this.get_ammo(par1ItemStack)<200){
			this.set_ammo(par1ItemStack, this.get_ammo(par1ItemStack)+1);
		}
	}
	
	public  Item_Feverslot keep_item()
	{
		this.setContainerItem(this);
		getContainerItem();
		return this;
	}
	
	public  int randForm(ItemStack belt)
	{
		 int[] GoldenFever = new int[]{2,3,4,5,6,10,11,16,17};

		Random rand = new Random();
		switch (rand.nextInt(10))
		{
		case 0:
			return 1;
		case 1:
			return 8;
		case 2:
			return 15;
		case 3:
			return 18;
		case 4:
			return 19;
		case 5:
			return 2;
	
		} 
		return GoldenFever[rand.nextInt(GoldenFever.length)];
	}
	
	
	
	/**
	 * Called when the equipped item is right clicked.
	 */
	public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn)
	{
		if (!worldIn.isRemote)
		{
		if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET)!= null){

			if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() instanceof item_desire_driver){
				item_desire_driver belt = (item_desire_driver) playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem();
				if (item_desire_driver.get_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),"f")>1){
					item_desire_driver.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),"r",0);	
					item_desire_driver.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),"l",0);	
					item_desire_driver.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),"f",0);
				}
				if(handIn == EnumHand.MAIN_HAND){
					if (this.get_ammo(playerIn.getHeldItem(handIn))==200){
					item_desire_driver.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),"l",randForm(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET)));	
					item_desire_driver.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),"f",1);	
					this.set_ammo(playerIn.getHeldItem(handIn), 0);
					}
				}else if(handIn == EnumHand.OFF_HAND&belt.Rider!="jyamato"){
					if (this.get_ammo(playerIn.getHeldItem(handIn))==200){
						item_desire_driver.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),"r",randForm(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET)));	
						item_desire_driver.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),"f2",1);	
						this.set_ammo(playerIn.getHeldItem(handIn), 0);
				}
				}
			}
					}
		}
		playerIn.setActiveHand(handIn);
		return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, playerIn.getHeldItem(handIn));
	}
}