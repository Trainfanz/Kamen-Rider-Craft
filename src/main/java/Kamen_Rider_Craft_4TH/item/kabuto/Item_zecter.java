package Kamen_Rider_Craft_4TH.item.kabuto;


import com.google.common.collect.Lists;

import Kamen_Rider_Craft_4TH.RiderItems;
import Kamen_Rider_Craft_4TH.TokuCraft_core;
import Kamen_Rider_Craft_4TH.item.Ichigo.item_Ichigodriver;
import Kamen_Rider_Craft_4TH.item.rider_armor_base.Item_form_change;
import Kamen_Rider_Craft_4TH.item.rider_armor_base.item_rider_driver;
import Kamen_Rider_Craft_4TH.util.IHasModel;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;


public class Item_zecter extends Item_form_change 
{

	public Item num;


	public Item_zecter(Item NUM,String name,Class<? extends item_rider_driver> beltClass,Item belt,String formName,String ridername,PotionEffect... effects)
	{
		super(name,beltClass, belt,formName,ridername,effects);
		num = NUM;
	}



	
	/**
     * Called when the equipped item is right clicked.
     */
    public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn) {
    	if (!playerIn.inventory.armorInventory.get(1).isEmpty()) {
			if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem().getClass()==BELTCLASS) {
				 if(((item_rider_driver) playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem()).Rider.equals(RIDER_NAME)){
					if (item_rider_driver.get_Form_Item_tex(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET), 1)==this){
						item_rider_driver.set_Form_Item(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num, 1);
					}else{
						return super.onItemRightClick(worldIn,playerIn,handIn);
					}
				}
			}

    	}
        playerIn.setActiveHand(handIn);

    	return new ActionResult<>(EnumActionResult.SUCCESS, playerIn.getHeldItem(handIn));
    }
	
	
}
