package Kamen_Rider_Craft_4TH.item.build;

import Kamen_Rider_Craft_4TH.RiderItems;
import Kamen_Rider_Craft_4TH.TokuCraft_core;
import Kamen_Rider_Craft_4TH.blocks.purifyer_block;
import Kamen_Rider_Craft_4TH.util.IHasModel;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;


public class Item_full_bottle extends Item implements IHasModel
{

	public int num;
	public String num2;


	public Item_full_bottle(int NUM ,String NUM2,String name,int NUM3)
	{
		super();
		this.setMaxDamage(0);
		num=NUM;
		num2=NUM2;
	    setTranslationKey(name);
        setRegistryName(name);
        TokuCraft_core.ITEMS.add(this);

        for (int i1 = 0; i1 < NUM3; ++i1)
        {
        	purifyer_block.BOTTLE.add(this);
        }
	}

	public Item_full_bottle(int NUM ,String NUM2,String name)
	{
		super();
		this.setMaxDamage(0);

		num=NUM;
		num2=NUM2;
	    setTranslationKey(name);
        setRegistryName(name);
        TokuCraft_core.ITEMS.add(this);
	}
	
	@Override
	public void registerModels() {
		TokuCraft_core.proxy.registerItemRender(this,0,"inventory");
	}


	/**
	 * Called whenever this item is equipped and the right mouse button is pressed. Args: itemStack, world, entityPlayer
	 */
	
	public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer par3EntityPlayer, EnumHand handIn)
	{		
	
		if (par3EntityPlayer.getItemStackFromSlot(EntityEquipmentSlot.FEET)!= null){

			if (par3EntityPlayer.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.build_driver_grease){

				if (num2=="8"){
					item_builddriver.set_core(par3EntityPlayer.getItemStackFromSlot(EntityEquipmentSlot.FEET), num, "1");
				}
				
			}else if (par3EntityPlayer.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.transteamgun_2){

				if (num2=="4"){
					item_builddriver.set_core(par3EntityPlayer.getItemStackFromSlot(EntityEquipmentSlot.FEET), num, "1");
				}
				
			}else if (par3EntityPlayer.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.evol_driver_evol){

				if (num2=="6"){
					
					item_builddriver.set_core(par3EntityPlayer.getItemStackFromSlot(EntityEquipmentSlot.FEET), num, "1");
					
					if (par3EntityPlayer.isSneaking()){
						if (this==RiderItems.evol_trigger){
							item_builddriver.set_core(par3EntityPlayer.getItemStackFromSlot(EntityEquipmentSlot.FEET), 4, "1");
						}else
							item_builddriver.set_core(par3EntityPlayer.getItemStackFromSlot(EntityEquipmentSlot.FEET), num, "1");	
					}
				}
			}else
			if (par3EntityPlayer.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.nebulasteamgun_2){

				if (num2=="5"){

					if (par3EntityPlayer.isSneaking()){
						if (this==RiderItems.gear_red&par3EntityPlayer.inventory.hasItemStack(new ItemStack(RiderItems.gear_blue))||this==RiderItems.gear_blue&par3EntityPlayer.inventory.hasItemStack(new ItemStack(RiderItems.gear_red))){
							item_builddriver.set_core(par3EntityPlayer.getItemStackFromSlot(EntityEquipmentSlot.FEET), 5, "1");
						}
						else if (this==RiderItems.gear_remocon&par3EntityPlayer.inventory.hasItemStack(new ItemStack(RiderItems.gear_engine))||this==RiderItems.gear_engine&par3EntityPlayer.inventory.hasItemStack(new ItemStack(RiderItems.gear_remocon))){
							item_builddriver.set_core(par3EntityPlayer.getItemStackFromSlot(EntityEquipmentSlot.FEET), 4, "1");
						}else
						item_builddriver.set_core(par3EntityPlayer.getItemStackFromSlot(EntityEquipmentSlot.FEET), num, "1");
					}else{
						item_builddriver.set_core(par3EntityPlayer.getItemStackFromSlot(EntityEquipmentSlot.FEET), num, "1");
						}
					}
				}else
			if (par3EntityPlayer.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.build_driver_cross_z){

				if (num2 == "7"){
					item_builddriver.set_core(par3EntityPlayer.getItemStackFromSlot(EntityEquipmentSlot.FEET), num, "1");
				}
					if (this==RiderItems.dragon_full_bottle) {
						item_builddriver.set_core(par3EntityPlayer.getItemStackFromSlot(EntityEquipmentSlot.FEET), 0, "1");
					}
				}
				if (par3EntityPlayer.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.build_driver){

					if (num2 == "2"){
						if (num==1){
							item_builddriver.set_core(par3EntityPlayer.getItemStackFromSlot(EntityEquipmentSlot.FEET), num, "2");
							item_builddriver.set_core(par3EntityPlayer.getItemStackFromSlot(EntityEquipmentSlot.FEET), 0, "1");
							item_builddriver.set_core(par3EntityPlayer.getItemStackFromSlot(EntityEquipmentSlot.FEET), 0, "3");
						}if (num==2&item_builddriver.get_core(par3EntityPlayer.getItemStackFromSlot(EntityEquipmentSlot.FEET), "1")==0&item_builddriver.get_core(par3EntityPlayer.getItemStackFromSlot(EntityEquipmentSlot.FEET), "3")==0
								||num==2&item_builddriver.get_core(par3EntityPlayer.getItemStackFromSlot(EntityEquipmentSlot.FEET), "1")==18&item_builddriver.get_core(par3EntityPlayer.getItemStackFromSlot(EntityEquipmentSlot.FEET), "3")==21
								||num==2&item_builddriver.get_core(par3EntityPlayer.getItemStackFromSlot(EntityEquipmentSlot.FEET), "1")==2&item_builddriver.get_core(par3EntityPlayer.getItemStackFromSlot(EntityEquipmentSlot.FEET), "3")==2
								||num==2&item_builddriver.get_core(par3EntityPlayer.getItemStackFromSlot(EntityEquipmentSlot.FEET), "1")==13&item_builddriver.get_core(par3EntityPlayer.getItemStackFromSlot(EntityEquipmentSlot.FEET), "3")==14
								||num==2&item_builddriver.get_core(par3EntityPlayer.getItemStackFromSlot(EntityEquipmentSlot.FEET), "1")==18&item_builddriver.get_core(par3EntityPlayer.getItemStackFromSlot(EntityEquipmentSlot.FEET), "3")==21
								||num==2&item_builddriver.get_core(par3EntityPlayer.getItemStackFromSlot(EntityEquipmentSlot.FEET), "1")==7&item_builddriver.get_core(par3EntityPlayer.getItemStackFromSlot(EntityEquipmentSlot.FEET), "3")==7){
							
							item_builddriver.set_core(par3EntityPlayer.getItemStackFromSlot(EntityEquipmentSlot.FEET), num, "2");
						}
						else if (num==3) {
							if (par3EntityPlayer.inventory.hasItemStack(new ItemStack(RiderItems.hazard_trigger))){
							item_builddriver.set_core(par3EntityPlayer.getItemStackFromSlot(EntityEquipmentSlot.FEET), num, "2");
							item_builddriver.set_core(par3EntityPlayer.getItemStackFromSlot(EntityEquipmentSlot.FEET), 0, "1");
							item_builddriver.set_core(par3EntityPlayer.getItemStackFromSlot(EntityEquipmentSlot.FEET), 0, "3");
							}
						}
						else if (num==4) {
							if (par3EntityPlayer.inventory.hasItemStack(new ItemStack(RiderItems.hazard_trigger))){
							item_builddriver.set_core(par3EntityPlayer.getItemStackFromSlot(EntityEquipmentSlot.FEET), num, "2");
							item_builddriver.set_core(par3EntityPlayer.getItemStackFromSlot(EntityEquipmentSlot.FEET), 0, "1");
							item_builddriver.set_core(par3EntityPlayer.getItemStackFromSlot(EntityEquipmentSlot.FEET), 0, "3");
							}
						}
						else if (num==5) {
							item_builddriver.set_core(par3EntityPlayer.getItemStackFromSlot(EntityEquipmentSlot.FEET), num, "2");
							item_builddriver.set_core(par3EntityPlayer.getItemStackFromSlot(EntityEquipmentSlot.FEET), 0, "1");
							item_builddriver.set_core(par3EntityPlayer.getItemStackFromSlot(EntityEquipmentSlot.FEET), 0, "3");
							}	
						else if (num==6) {
							item_builddriver.set_core(par3EntityPlayer.getItemStackFromSlot(EntityEquipmentSlot.FEET), num, "2");
							item_builddriver.set_core(par3EntityPlayer.getItemStackFromSlot(EntityEquipmentSlot.FEET), 0, "1");
							item_builddriver.set_core(par3EntityPlayer.getItemStackFromSlot(EntityEquipmentSlot.FEET), 0, "3");
							}			
					}else if (num2 == "1"||num2 == "3"){
						item_builddriver.set_core(par3EntityPlayer.getItemStackFromSlot(EntityEquipmentSlot.FEET), 0, "2");
						item_builddriver.set_core(par3EntityPlayer.getItemStackFromSlot(EntityEquipmentSlot.FEET), num, num2);
					}

				}
				
				}
		par3EntityPlayer.setActiveHand(handIn);
        return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, par3EntityPlayer.getHeldItem(handIn));
    }
}