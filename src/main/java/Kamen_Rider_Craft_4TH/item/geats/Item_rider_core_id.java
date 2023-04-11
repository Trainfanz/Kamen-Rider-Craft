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
import Kamen_Rider_Craft_4TH.item.revice.Item_Vistamps;
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


public class Item_rider_core_id extends Item implements IHasModel
{

	public String Name;
	public int setCracked = 0;
	
	public Item_rider_core_id(String name,String ridrName)
	{
		super();
		this.setMaxDamage(0);
		setTranslationKey(name);
		setRegistryName(name);
		TokuCraft_core.ITEMS.add(this);
		Name=ridrName;
	}

	@Override
	public void registerModels() {
		TokuCraft_core.proxy.registerItemRender(this,0,"inventory");
	}



	public  Item_rider_core_id keep_item()
	{
		this.setContainerItem(this);
		getContainerItem();
		return this;
	}
	public Item_rider_core_id changeCracked(int num)
	{
		setCracked=num;
		return this;
	}
	
	public Item_rider_core_id AddToMissionBox(int num)
	{
		for (int i1 = 0; i1 < num; ++i1)
		{
			Item_mission_box.core_id.add(this);
		}
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

				if (belt.Rider==Name){
					item_desire_driver.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),"l",0);	
					item_desire_driver.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),"r",0);		
					item_desire_driver.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),"f",0);	
					item_desire_driver.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),"f2",0);	
					item_desire_driver.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),"c",setCracked);	
					item_desire_driver.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),"h",0);	
				}
			}
		}
		playerIn.setActiveHand(handIn);
		return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, playerIn.getHeldItem(handIn));
	}
}