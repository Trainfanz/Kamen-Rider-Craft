package Kamen_Rider_Craft_4TH.item.drive;

import Kamen_Rider_Craft_4TH.RiderItems;
import Kamen_Rider_Craft_4TH.TokuCraft_core;
import Kamen_Rider_Craft_4TH.util.IHasModel;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;

public class Item_shift_car extends Item implements IHasModel
{

	public int num;
	public int num2;


	public Item_shift_car(int NUM ,int NUM2,String name)
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
  * Called when the equipped item is right clicked.
  */
 public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn)
 {
	Item_shift_car par1ItemStack = this;
		if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET)!= null){

			if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() instanceof item_drivedriver){

				item_drivedriver belt = (item_drivedriver) playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem();

				if (belt == RiderItems.drivedriver){
					if (num == 1){

						item_drivedriver.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num2);

						if (par1ItemStack== RiderItems.wildshift ){
							item_drivedriver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),1);

						}else if (par1ItemStack== RiderItems.highspeedshift ){
							item_drivedriver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),2);

						}else if (par1ItemStack== RiderItems.dead_heat ){
							item_drivedriver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),6);

						}else if (par1ItemStack== RiderItems.proto_speedshift ){
							if ( playerIn.inventory.hasItemStack(new ItemStack(RiderItems.speedshift))&playerIn.isSneaking() ){
								item_drivedriver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),11);
							}else{
								item_drivedriver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),3);
							}
						}else if (par1ItemStack== RiderItems.techniqueshift ){
							item_drivedriver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),4);

						}else if (par1ItemStack== RiderItems.fruitsshift ){
							item_drivedriver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),5);

						}else if (par1ItemStack== RiderItems.formulashift ){
							item_drivedriver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),7);

						}else if (par1ItemStack== RiderItems.tridoronshift ){
							//& item_drivedriver.get_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET))==8&playerIn.inventory.hasItem(RiderItems.maxflare)&playerIn.inventory.hasItem(RiderItems.funkyspike)&playerIn.inventory.hasItem(RiderItems.midnightshadow)&playerIn.inventory.hasItem(RiderItems.mad_doctor)&playerIn.inventory.hasItem(RiderItems.justice_hunter)&playerIn.inventory.hasItem(RiderItems.fire_braver)&playerIn.inventory.hasItem(RiderItems.rumble_dump)&playerIn.inventory.hasItem(RiderItems.spin_mixer)&playerIn.inventory.hasItem(RiderItems.rolling_gravity)&playerIn.inventory.hasItem(RiderItems.amazing_circus)&playerIn.inventory.hasItem(RiderItems.dimension_cab)&playerIn.inventory.hasItem(RiderItems.dream_vegas)&playerIn.inventory.hasItem( RiderItems.hooking_wrecker)&playerIn.inventory.hasItem( RiderItems.deco_traveller)&playerIn.inventory.hasItem(RiderItems.massive_monster)&playerIn.inventory.hasItem(RiderItems.burning_solar)&playerIn.inventory.hasItem( RiderItems.road_winter)&playerIn.inventory.hasItem(RiderItems.colorful_commercial)&playerIn.inventory.hasItem(RiderItems.mantarn_f01)&playerIn.inventory.hasItem( RiderItems.jacky_f02)&playerIn.inventory.hasItem( RiderItems.sparner_f03)
							if ( playerIn.isSneaking()& item_drivedriver.get_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET))==8&playerIn.inventory.hasItemStack(new ItemStack(RiderItems.maxflare))&playerIn.inventory.hasItemStack(new ItemStack(RiderItems.funkyspike))&playerIn.inventory.hasItemStack(new ItemStack(RiderItems.midnightshadow))&playerIn.inventory.hasItemStack(new ItemStack(RiderItems.mad_doctor))&playerIn.inventory.hasItemStack(new ItemStack(RiderItems.justice_hunter))&playerIn.inventory.hasItemStack(new ItemStack(RiderItems.fire_braver))&playerIn.inventory.hasItemStack(new ItemStack(RiderItems.rumble_dump))&playerIn.inventory.hasItemStack(new ItemStack(RiderItems.spin_mixer))&playerIn.inventory.hasItemStack(new ItemStack(RiderItems.rolling_gravity))&playerIn.inventory.hasItemStack(new ItemStack(RiderItems.amazing_circus))&playerIn.inventory.hasItemStack(new ItemStack(RiderItems.dimension_cab))&playerIn.inventory.hasItemStack(new ItemStack(RiderItems.dream_vegas))&playerIn.inventory.hasItemStack( new ItemStack(RiderItems.hooking_wrecker))&playerIn.inventory.hasItemStack( new ItemStack(RiderItems.deco_traveller))&playerIn.inventory.hasItemStack(new ItemStack(RiderItems.massive_monster))&playerIn.inventory.hasItemStack(new ItemStack(RiderItems.burning_solar))&playerIn.inventory.hasItemStack( new ItemStack(RiderItems.road_winter))&playerIn.inventory.hasItemStack(new ItemStack(RiderItems.colorful_commercial))&playerIn.inventory.hasItemStack(new ItemStack(RiderItems.mantarn_f01))&playerIn.inventory.hasItemStack( new ItemStack(RiderItems.jacky_f02))&playerIn.inventory.hasItemStack( new ItemStack(RiderItems.sparner_f03))){
								item_drivedriver.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),34);
							}
							item_drivedriver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),8);

						}else if (par1ItemStack== RiderItems.shift_next ){
							item_drivedriver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),9);

						}else if (par1ItemStack== RiderItems.shift_special ){
							item_drivedriver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),10);

						}else if (par1ItemStack== RiderItems.heartronshift ){
							item_drivedriver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),12);

						}else if (par1ItemStack== RiderItems.speedwildtechnicshift ){
							item_drivedriver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),13);

						}else{
							item_drivedriver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),0);
						}




					}

					else if (num ==2) {

						//item_drivedriver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),0, "1");

						if (item_drivedriver.get_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET))==8){
							if (par1ItemStack== RiderItems.maxflare|| par1ItemStack== RiderItems.funkyspike||par1ItemStack== RiderItems.midnightshadow){
								if (playerIn.inventory.hasItemStack(new ItemStack(RiderItems.maxflare))&playerIn.inventory.hasItemStack(new ItemStack(RiderItems.funkyspike))&playerIn.inventory.hasItemStack(new ItemStack(RiderItems.midnightshadow))){


									item_drivedriver.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),25);
								}
							}else if (par1ItemStack== RiderItems.mad_doctor|| par1ItemStack== RiderItems.justice_hunter||par1ItemStack== RiderItems.fire_braver){
								if (playerIn.inventory.hasItemStack(new ItemStack(RiderItems.mad_doctor))&playerIn.inventory.hasItemStack(new ItemStack(RiderItems.justice_hunter))&playerIn.inventory.hasItemStack(new ItemStack(RiderItems.fire_braver))){


									item_drivedriver.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),26);
								}
							}else if (par1ItemStack== RiderItems.rumble_dump|| par1ItemStack== RiderItems.spin_mixer||par1ItemStack== RiderItems.rolling_gravity){
								if (playerIn.inventory.hasItemStack(new ItemStack(RiderItems.rumble_dump))&playerIn.inventory.hasItemStack(new ItemStack(RiderItems.spin_mixer))&playerIn.inventory.hasItemStack(new ItemStack(RiderItems.rolling_gravity))){


									item_drivedriver.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),27);
								}
							}			
						}


						else	if (item_drivedriver.get_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET))==7){

							if (num2 == 31||num2 == 32||num2 == 33){
								item_drivedriver.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num2);
							}
						}

						else{
							if (num2 != 31 & num2 != 32 & num2 != 33){
								item_drivedriver.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num2);
							}}
					}
				}else if (belt == RiderItems.break_gunner_2){
					if (num == 4){
						
						item_drivedriver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),1);
	
					}
						
				}
					else if (belt == RiderItems.mach_driver_honoh){
						if (num == 4){
							item_drivedriver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),7);
						} else if (num == 1){
						if (par1ItemStack== RiderItems.dead_heat ){

							if ( playerIn.inventory.hasItemStack(new ItemStack(RiderItems.speedshift))&playerIn.isSneaking() ){
								item_drivedriver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),4);
								item_drivedriver.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num2);
							}else{
								item_drivedriver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),1);
								item_drivedriver.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num2);
							}
						}


					}
					if (item_drivedriver.get_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET))==1&par1ItemStack!= RiderItems.signal_mach&par1ItemStack!= RiderItems.signal_chaser){
						if (num ==2) {

							//item_drivedriver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),0, "1");



							item_drivedriver.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num2);
						}
					}
					
						
						else if (num ==3) {
							if (par1ItemStack== RiderItems.signal_mach ){
								item_drivedriver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),0);

							}else if (par1ItemStack== RiderItems.tridoron_key){
								item_drivedriver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),5);

							}else if (par1ItemStack== RiderItems.shift_ride_crosser){
								item_drivedriver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),6);

							}else if (par1ItemStack== RiderItems.signal_chaser ){
								if (playerIn.isSneaking()&playerIn.inventory.hasItemStack(new ItemStack(RiderItems.signal_mach))){
									item_drivedriver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),3);
								}else{
									item_drivedriver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),2);
								}
							}
							item_drivedriver.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num2);
						}
					}
				}

			}
	      playerIn.setActiveHand(handIn);
	        return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, playerIn.getHeldItem(handIn));
	    }

	}

