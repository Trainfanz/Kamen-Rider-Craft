package KamenRiderCraftV3.item.gaim;


import KamenRiderCraftV3.RiderItems;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;


public class Item_lockseed extends Item
{

	public int num;
	public int num2;
	public static String[] ARMS= new String[] {"","matsubokkuri_arms","kurumi_arms", "donguri_arms","melon_arms","pine_arms", "ichigo_arms", "orange_arms", "banana_arms", "budou_arms", "mango_arms", "durian_arms", "kiwi_arms", "energy_lemon_arms", "energy_cherry_arms", "energy_peach_arms", "energy_melon_arms","jimbar_lemon_arms","jimbar_cherry_arms","jimbar_peach_arms","jimbar_melon_arms", "energy_matsubokkuri_arms", "kachidoki_arms", "kiwami_arms", "yomotsu_heguri_arms", "blood_orange_arms", "fifteen_arms", "golden_arms", "silver_arms", "darkness_arms", "watermelon_arms", "ringo_arms","baron_ringo_arms","jimbar_black_arms", "wizard_arms", "fourze_arms", "ooo_arms", "w_arms", "decade_arms", "rider_ichigo_arms","suika_arms","lemon_arms","energy_dragon_fruits_arms","energy_prototype_dragon_fruits_arms","fresh_orange_arms","drive_arms","jimbar_marron_arms","blood_zakuro_arms","kuuga_arms","agito_arms","ryuki_arms","faiz_arms","blade_arms","hibiki_arms","kabuto_arms","den_o_arms","kiva_arms","gaim_arms","kabi_orange_arms","maja_arms","jimbar_dragon_arms","jimbar_melon_arms_zangetsu","jimbar_melon_arms_barvo","natsumikan_arms","black_baron_arms"};



	public Item_lockseed(int NUM ,int arms)
	{
		super();
		this.setHasSubtypes(true);
		this.setMaxDamage(0);

		num=NUM;

		num2=arms;

	}



	/**
	 * Called whenever this item is equipped and the right mouse button is pressed. Args: itemStack, world, entityPlayer
	 */
	public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
	{



		if (par3EntityPlayer.getEquipmentInSlot(1)!= null){

			if (par3EntityPlayer.getEquipmentInSlot(1).getItem() instanceof item_Gaimdriver){
				item_Gaimdriver belt = (item_Gaimdriver) par3EntityPlayer.getEquipmentInSlot(1).getItem();

				if (num == 1){

					if (belt.DRIVER==0){

						if (ARMS[num2] == "ringo_arms" &par3EntityPlayer.getEquipmentInSlot(1).getItem()== RiderItems.sengoku_driver_baron){
							item_Gaimdriver.set_core(par3EntityPlayer.getEquipmentInSlot(1),0, "1");
							item_Gaimdriver.set_lock(par3EntityPlayer.getEquipmentInSlot(1),32);	
						}else if (ARMS[num2] == "fresh_orange_arms" &par3EntityPlayer.getEquipmentInSlot(1).getItem()== RiderItems.sengoku_driver_gaim){
							item_Gaimdriver.set_core(par3EntityPlayer.getEquipmentInSlot(1),5, "1");
							item_Gaimdriver.set_lock(par3EntityPlayer.getEquipmentInSlot(1),num2);	
						}else if (ARMS[num2] == "blood_zakuro_arms"){
							if (par3EntityPlayer.inventory.hasItem(RiderItems.blood_orange_lockseed) &par3EntityPlayer.getEquipmentInSlot(1).getItem()== RiderItems.sengoku_driver_savior){
								item_Gaimdriver.set_lock(par3EntityPlayer.getEquipmentInSlot(1),num2);	
							}
						}else{

							item_Gaimdriver.set_core(par3EntityPlayer.getEquipmentInSlot(1),0, "1");
							item_Gaimdriver.set_lock(par3EntityPlayer.getEquipmentInSlot(1),num2);
						}
					}



				}else if (num == 2){
					if (belt.DRIVER==1){
						if (ARMS[num2] != "jimbar_marron_arms"){

							if (ARMS[num2] == "energy_dragon_fruits_arms" &par3EntityPlayer.getEquipmentInSlot(1).getItem()== RiderItems.genesis_driver_tyrant){
								item_Gaimdriver.set_core(par3EntityPlayer.getEquipmentInSlot(1),0, "1");
								item_Gaimdriver.set_lock(par3EntityPlayer.getEquipmentInSlot(1),num2+1);	
							}else{
								item_Gaimdriver.set_lock(par3EntityPlayer.getEquipmentInSlot(1),num2);
							}
						}
					}else if(par3EntityPlayer.getEquipmentInSlot(1).getItem()== RiderItems.sengoku_driver_gaim){


						if (par3EntityPlayer.inventory.hasItem(RiderItems.orange_lockseed)){

							int jimbar;
							if (ARMS[num2] == "energy_lemon_arms"||ARMS[num2] == "energy_cherry_arms"||ARMS[num2] == "energy_peach_arms"||ARMS[num2] == "energy_melon_arms"){
								jimbar = num2+4;
							}
							else {
								jimbar = 99;
							}

							if (jimbar != 99){
								item_Gaimdriver.set_core(par3EntityPlayer.getEquipmentInSlot(1),1, "1");

								item_Gaimdriver.set_lock(par3EntityPlayer.getEquipmentInSlot(1),jimbar);
							}
						}
					}else if(par3EntityPlayer.getEquipmentInSlot(1).getItem()== RiderItems.sengoku_driver_knuckle){
						if (par3EntityPlayer.inventory.hasItem(RiderItems.kurumi_lockseed)){
							if (ARMS[num2] == "jimbar_marron_arms"){
								item_Gaimdriver.set_lock(par3EntityPlayer.getEquipmentInSlot(1),num2);

							}	
						}
						}else if(par3EntityPlayer.getEquipmentInSlot(1).getItem()== RiderItems.sengoku_driver_ryugen){
							if (par3EntityPlayer.inventory.hasItem(RiderItems.budou_lockseed)){
								if (ARMS[num2] == "energy_dragon_fruits_arms"){
									item_Gaimdriver.set_lock(par3EntityPlayer.getEquipmentInSlot(1),60);

								}	
							}
						}else if(par3EntityPlayer.getEquipmentInSlot(1).getItem()== RiderItems.sengoku_driver_barvo){
							if (par3EntityPlayer.inventory.hasItem(RiderItems.durian_lockseed)){
								if (ARMS[num2] == "energy_melon_arms"){
									item_Gaimdriver.set_lock(par3EntityPlayer.getEquipmentInSlot(1),62);

								}	
							}
						}else if(par3EntityPlayer.getEquipmentInSlot(1).getItem()== RiderItems.sengoku_driver_zangetsu){
							if (par3EntityPlayer.inventory.hasItem(RiderItems.melon_lockseed)){
								if (ARMS[num2] == "energy_melon_arms"){
									item_Gaimdriver.set_lock(par3EntityPlayer.getEquipmentInSlot(1),61);

								}	
							
						}

						}

					}else if (num == 3){

						if(par3EntityPlayer.getEquipmentInSlot(1).getItem()== RiderItems.sengoku_driver_gaim){

							if (ARMS[num2] == "kiwami_arms"){
								if (item_Gaimdriver.get_lock(par3EntityPlayer.getEquipmentInSlot(1))=="kachidoki_arms"){
									item_Gaimdriver.set_core(par3EntityPlayer.getEquipmentInSlot(1),3, "1");
									item_Gaimdriver.set_lock(par3EntityPlayer.getEquipmentInSlot(1),num2);
								}
							}else if (ARMS[num2] == "jimbar_black_arms"){
								//if (par3EntityPlayer.inventory.hasItem(KamenRiderCraft2_core.dark_orange_lockseed) & par3EntityPlayer.inventory.hasItem(KamenRiderCraft2_core.dark_lemon_energy_lockseed)){
								item_Gaimdriver.set_core(par3EntityPlayer.getEquipmentInSlot(1),4, "1");
								item_Gaimdriver.set_lock(par3EntityPlayer.getEquipmentInSlot(1),num2);
								//}
							}else{
								item_Gaimdriver.set_core(par3EntityPlayer.getEquipmentInSlot(1),2, "1");
								item_Gaimdriver.set_lock(par3EntityPlayer.getEquipmentInSlot(1),num2);
							}
						}
					}
					else if (num == 4){

						if (ARMS[num2] == "drive_arms" &par3EntityPlayer.getEquipmentInSlot(1).getItem()== RiderItems.sengoku_driver_gaim){
							item_Gaimdriver.set_core(par3EntityPlayer.getEquipmentInSlot(1),6, "1");
							item_Gaimdriver.set_lock(par3EntityPlayer.getEquipmentInSlot(1),num2);	
						}else{

							item_Gaimdriver.set_core(par3EntityPlayer.getEquipmentInSlot(1),0, "1");



							item_Gaimdriver.set_lock(par3EntityPlayer.getEquipmentInSlot(1),num2);
						}
					}
				}
			}






			return par1ItemStack;
		}


	}
