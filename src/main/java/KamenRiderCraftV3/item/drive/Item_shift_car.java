package KamenRiderCraftV3.item.drive;

import KamenRiderCraftV3.RiderItems;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class Item_shift_car extends Item
{

	public int num;
	public int num2;


	public Item_shift_car(int NUM ,int NUM2)
	{
		super();
		this.setHasSubtypes(true);
		this.setMaxDamage(0);

		num=NUM;
		num2=NUM2;

	}



	/**
	 * Called whenever this item is equipped and the right mouse button is pressed. Args: itemStack, world, entityPlayer
	 */
	public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
	{



		if (par3EntityPlayer.getEquipmentInSlot(1)!= null){

			if (par3EntityPlayer.getEquipmentInSlot(1).getItem() instanceof item_drivedriver){

				item_drivedriver belt = (item_drivedriver) par3EntityPlayer.getEquipmentInSlot(1).getItem();

				if (belt == RiderItems.drivedriver){
					if (num == 1){

						item_drivedriver.set_lock(par3EntityPlayer.getEquipmentInSlot(1),num2);

						if (par1ItemStack.getItem()== RiderItems.wildshift ){
							item_drivedriver.set_core(par3EntityPlayer.getEquipmentInSlot(1),1);

						}else if (par1ItemStack.getItem()== RiderItems.highspeedshift ){
							item_drivedriver.set_core(par3EntityPlayer.getEquipmentInSlot(1),2);

						}else if (par1ItemStack.getItem()== RiderItems.dead_heat ){
							item_drivedriver.set_core(par3EntityPlayer.getEquipmentInSlot(1),6);

						}else if (par1ItemStack.getItem()== RiderItems.proto_speedshift ){
							if ( par3EntityPlayer.inventory.hasItem(RiderItems.speedshift)&par3EntityPlayer.isSneaking() ){
								item_drivedriver.set_core(par3EntityPlayer.getEquipmentInSlot(1),11);
							}else{
								item_drivedriver.set_core(par3EntityPlayer.getEquipmentInSlot(1),3);
							}
						}else if (par1ItemStack.getItem()== RiderItems.techniqueshift ){
							item_drivedriver.set_core(par3EntityPlayer.getEquipmentInSlot(1),4);

						}else if (par1ItemStack.getItem()== RiderItems.fruitsshift ){
							item_drivedriver.set_core(par3EntityPlayer.getEquipmentInSlot(1),5);

						}else if (par1ItemStack.getItem()== RiderItems.formulashift ){
							item_drivedriver.set_core(par3EntityPlayer.getEquipmentInSlot(1),7);

						}else if (par1ItemStack.getItem()== RiderItems.tridoronshift ){
							//& item_drivedriver.get_core(par3EntityPlayer.getEquipmentInSlot(1))==8&par3EntityPlayer.inventory.hasItem(RiderItems.maxflare)&par3EntityPlayer.inventory.hasItem(RiderItems.funkyspike)&par3EntityPlayer.inventory.hasItem(RiderItems.midnightshadow)&par3EntityPlayer.inventory.hasItem(RiderItems.mad_doctor)&par3EntityPlayer.inventory.hasItem(RiderItems.justice_hunter)&par3EntityPlayer.inventory.hasItem(RiderItems.fire_braver)&par3EntityPlayer.inventory.hasItem(RiderItems.rumble_dump)&par3EntityPlayer.inventory.hasItem(RiderItems.spin_mixer)&par3EntityPlayer.inventory.hasItem(RiderItems.rolling_gravity)&par3EntityPlayer.inventory.hasItem(RiderItems.amazing_circus)&par3EntityPlayer.inventory.hasItem(RiderItems.dimension_cab)&par3EntityPlayer.inventory.hasItem(RiderItems.dream_vegas)&par3EntityPlayer.inventory.hasItem( RiderItems.hooking_wrecker)&par3EntityPlayer.inventory.hasItem( RiderItems.deco_traveller)&par3EntityPlayer.inventory.hasItem(RiderItems.massive_monster)&par3EntityPlayer.inventory.hasItem(RiderItems.burning_solar)&par3EntityPlayer.inventory.hasItem( RiderItems.road_winter)&par3EntityPlayer.inventory.hasItem(RiderItems.colorful_commercial)&par3EntityPlayer.inventory.hasItem(RiderItems.mantarn_f01)&par3EntityPlayer.inventory.hasItem( RiderItems.jacky_f02)&par3EntityPlayer.inventory.hasItem( RiderItems.sparner_f03)
							if ( par3EntityPlayer.isSneaking()& item_drivedriver.get_core(par3EntityPlayer.getEquipmentInSlot(1))==8&par3EntityPlayer.inventory.hasItem(RiderItems.maxflare)&par3EntityPlayer.inventory.hasItem(RiderItems.funkyspike)&par3EntityPlayer.inventory.hasItem(RiderItems.midnightshadow)&par3EntityPlayer.inventory.hasItem(RiderItems.mad_doctor)&par3EntityPlayer.inventory.hasItem(RiderItems.justice_hunter)&par3EntityPlayer.inventory.hasItem(RiderItems.fire_braver)&par3EntityPlayer.inventory.hasItem(RiderItems.rumble_dump)&par3EntityPlayer.inventory.hasItem(RiderItems.spin_mixer)&par3EntityPlayer.inventory.hasItem(RiderItems.rolling_gravity)&par3EntityPlayer.inventory.hasItem(RiderItems.amazing_circus)&par3EntityPlayer.inventory.hasItem(RiderItems.dimension_cab)&par3EntityPlayer.inventory.hasItem(RiderItems.dream_vegas)&par3EntityPlayer.inventory.hasItem( RiderItems.hooking_wrecker)&par3EntityPlayer.inventory.hasItem( RiderItems.deco_traveller)&par3EntityPlayer.inventory.hasItem(RiderItems.massive_monster)&par3EntityPlayer.inventory.hasItem(RiderItems.burning_solar)&par3EntityPlayer.inventory.hasItem( RiderItems.road_winter)&par3EntityPlayer.inventory.hasItem(RiderItems.colorful_commercial)&par3EntityPlayer.inventory.hasItem(RiderItems.mantarn_f01)&par3EntityPlayer.inventory.hasItem( RiderItems.jacky_f02)&par3EntityPlayer.inventory.hasItem( RiderItems.sparner_f03)){
								item_drivedriver.set_lock(par3EntityPlayer.getEquipmentInSlot(1),34);
							}
							item_drivedriver.set_core(par3EntityPlayer.getEquipmentInSlot(1),8);

						}else if (par1ItemStack.getItem()== RiderItems.shift_next ){
							item_drivedriver.set_core(par3EntityPlayer.getEquipmentInSlot(1),9);

						}else if (par1ItemStack.getItem()== RiderItems.shift_special ){
							item_drivedriver.set_core(par3EntityPlayer.getEquipmentInSlot(1),10);

						}else if (par1ItemStack.getItem()== RiderItems.heartronshift ){
							item_drivedriver.set_core(par3EntityPlayer.getEquipmentInSlot(1),12);

						}else if (par1ItemStack.getItem()== RiderItems.speedwildtechnicshift ){
							item_drivedriver.set_core(par3EntityPlayer.getEquipmentInSlot(1),13);

						}else{
							item_drivedriver.set_core(par3EntityPlayer.getEquipmentInSlot(1),0);
						}




					}

					else if (num ==2) {

						//item_drivedriver.set_core(par3EntityPlayer.getEquipmentInSlot(1),0, "1");

						if (item_drivedriver.get_core(par3EntityPlayer.getEquipmentInSlot(1))==8){
							if (par1ItemStack.getItem()== RiderItems.maxflare|| par1ItemStack.getItem()== RiderItems.funkyspike||par1ItemStack.getItem()== RiderItems.midnightshadow){
								if (par3EntityPlayer.inventory.hasItem(RiderItems.maxflare)&par3EntityPlayer.inventory.hasItem(RiderItems.funkyspike)&par3EntityPlayer.inventory.hasItem(RiderItems.midnightshadow)){


									item_drivedriver.set_lock(par3EntityPlayer.getEquipmentInSlot(1),25);
								}
							}else if (par1ItemStack.getItem()== RiderItems.mad_doctor|| par1ItemStack.getItem()== RiderItems.justice_hunter||par1ItemStack.getItem()== RiderItems.fire_braver){
								if (par3EntityPlayer.inventory.hasItem(RiderItems.mad_doctor)&par3EntityPlayer.inventory.hasItem(RiderItems.justice_hunter)&par3EntityPlayer.inventory.hasItem(RiderItems.fire_braver)){


									item_drivedriver.set_lock(par3EntityPlayer.getEquipmentInSlot(1),26);
								}
							}else if (par1ItemStack.getItem()== RiderItems.rumble_dump|| par1ItemStack.getItem()== RiderItems.spin_mixer||par1ItemStack.getItem()== RiderItems.rolling_gravity){
								if (par3EntityPlayer.inventory.hasItem(RiderItems.rumble_dump)&par3EntityPlayer.inventory.hasItem(RiderItems.spin_mixer)&par3EntityPlayer.inventory.hasItem(RiderItems.rolling_gravity)){


									item_drivedriver.set_lock(par3EntityPlayer.getEquipmentInSlot(1),27);
								}
							}			
						}


						else	if (item_drivedriver.get_core(par3EntityPlayer.getEquipmentInSlot(1))==7){

							if (num2 == 31||num2 == 32||num2 == 33){
								item_drivedriver.set_lock(par3EntityPlayer.getEquipmentInSlot(1),num2);
							}
						}

						else{
							if (num2 != 31 & num2 != 32 & num2 != 33){
								item_drivedriver.set_lock(par3EntityPlayer.getEquipmentInSlot(1),num2);
							}}
					}
				}else if (belt == RiderItems.break_gunner_2){
					if (num == 4){
						
						item_drivedriver.set_core(par3EntityPlayer.getEquipmentInSlot(1),1);
	
					}
						
				}
					else if (belt == RiderItems.mach_driver_honoh){
						if (num == 4){
							item_drivedriver.set_core(par3EntityPlayer.getEquipmentInSlot(1),7);
						} else if (num == 1){
						if (par1ItemStack.getItem()== RiderItems.dead_heat ){

							if ( par3EntityPlayer.inventory.hasItem(RiderItems.speedshift)&par3EntityPlayer.isSneaking() ){
								item_drivedriver.set_core(par3EntityPlayer.getEquipmentInSlot(1),4);
								item_drivedriver.set_lock(par3EntityPlayer.getEquipmentInSlot(1),num2);
							}else{
								item_drivedriver.set_core(par3EntityPlayer.getEquipmentInSlot(1),1);
								item_drivedriver.set_lock(par3EntityPlayer.getEquipmentInSlot(1),num2);
							}
						}


					}
					if (item_drivedriver.get_core(par3EntityPlayer.getEquipmentInSlot(1))==1&par1ItemStack.getItem()!= RiderItems.signal_mach&par1ItemStack.getItem()!= RiderItems.signal_chaser){
						if (num ==2) {

							//item_drivedriver.set_core(par3EntityPlayer.getEquipmentInSlot(1),0, "1");



							item_drivedriver.set_lock(par3EntityPlayer.getEquipmentInSlot(1),num2);
						}
					}
					
						
						else if (num ==3) {
							if (par1ItemStack.getItem()== RiderItems.signal_mach ){
								item_drivedriver.set_core(par3EntityPlayer.getEquipmentInSlot(1),0);

							}else if (par1ItemStack.getItem()== RiderItems.tridoron_key){
								item_drivedriver.set_core(par3EntityPlayer.getEquipmentInSlot(1),5);

							}else if (par1ItemStack.getItem()== RiderItems.shift_ride_crosser){
								item_drivedriver.set_core(par3EntityPlayer.getEquipmentInSlot(1),6);

							}else if (par1ItemStack.getItem()== RiderItems.signal_chaser ){
								if (par3EntityPlayer.isSneaking()&par3EntityPlayer.inventory.hasItem(RiderItems.signal_mach)){
									item_drivedriver.set_core(par3EntityPlayer.getEquipmentInSlot(1),3);
								}else{
									item_drivedriver.set_core(par3EntityPlayer.getEquipmentInSlot(1),2);
								}
							}
							item_drivedriver.set_lock(par3EntityPlayer.getEquipmentInSlot(1),num2);
						}
					}
				}

			}
		






		return par1ItemStack;
	}

}
