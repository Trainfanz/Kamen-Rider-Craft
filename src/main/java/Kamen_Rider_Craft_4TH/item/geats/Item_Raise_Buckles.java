package Kamen_Rider_Craft_4TH.item.geats;


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
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;


public class Item_Raise_Buckles extends Item implements IHasModel
{


	public int num2;

	public int setBase = 0;

	public boolean CanUseL = false;
	public boolean CanUseR = false;


	public Item_Raise_Buckles(int arms,String name)
	{
		super();
		this.setMaxDamage(0);
		num2=arms;
		setTranslationKey(name);
		setRegistryName(name);
		TokuCraft_core.ITEMS.add(this);

	}

	public Item_Raise_Buckles(String name)
	{
		super();
		this.setMaxDamage(0);
		setTranslationKey(name);
		setRegistryName(name);
		TokuCraft_core.ITEMS.add(this);
		num2=10;

	}

	@Override
	public void registerModels() {
		TokuCraft_core.proxy.registerItemRender(this,0,"inventory");
	}


	public Item_Raise_Buckles AddCanUseL()
	{
		CanUseL=true;
		return this;
	}

	public Item_Raise_Buckles AddCanUseR()
	{
		CanUseR=true;
		return this;
	}

	public Item_Raise_Buckles changeForm(int num)
	{
		setBase=num;
		return this;
	}

	public Item_Raise_Buckles AddToMissionBox(int num)
	{
		for (int i1 = 0; i1 < num; ++i1)
		{
			Item_mission_box.raise_buckle.add(this);
		}
		return this;
	}

	public Item_Raise_Buckles AddToGigantMissionBox(int num)
	{
		for (int i1 = 0; i1 < num; ++i1)
		{
			Item_mission_box.gigant_buckle.add(this);
		}
		return this;
	}

	public  Item_Raise_Buckles keep_item()
	{
		this.setContainerItem(this);
		getContainerItem();
		return this;
	}

	/**
	 * Called when the equipped item is right clicked.
	 */
	public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn)
	{

		if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET)!= null){

			if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() instanceof item_desire_driver){
				item_desire_driver belt = (item_desire_driver) playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem();

				if (this==ReiwaRiderItems.command_twin_buckle_cannon){
					if(belt.Rider=="geats"||belt.Rider=="tycoon")
						if (item_desire_driver.get_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),"f")==2){
							if(handIn == EnumHand.MAIN_HAND&CanUseL){
								item_desire_driver.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),"l",21);	
								item_desire_driver.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),"r",20);	

							}else if(handIn == EnumHand.OFF_HAND&CanUseR){
								item_desire_driver.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),"l",20);	
								item_desire_driver.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),"r",21);	
							}
						}
				}else if (this==ReiwaRiderItems.jyamato_buckle){
					if(belt.Rider=="buffa"){
						item_desire_driver.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),"r",num2);	
						item_desire_driver.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),"l",num2);	
						item_desire_driver.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),"f",setBase);
					}
				}


				else if (belt.DRIVER == 0){
					if (item_desire_driver.get_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),"f")>1){
						item_desire_driver.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),"r",0);	
						item_desire_driver.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),"l",0);	
						item_desire_driver.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),"f",0);
					}

					if(handIn == EnumHand.MAIN_HAND&CanUseL){
						item_desire_driver.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),"l",num2);	
						item_desire_driver.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),"f",setBase);
					}else if(handIn == EnumHand.OFF_HAND&CanUseR){
						item_desire_driver.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),"r",num2);	
					}
				}

			}
		}
		playerIn.setActiveHand(handIn);
		return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, playerIn.getHeldItem(handIn));
	}
}