package Kamen_Rider_Craft_4TH.item.gaim;

import Kamen_Rider_Craft_4TH.RiderItems;
import Kamen_Rider_Craft_4TH.TokuCraft_core;
import Kamen_Rider_Craft_4TH.blocks.GameCreatorBlock;
import Kamen_Rider_Craft_4TH.blocks.wood.BlockHelheimVine;
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


public class Item_lockseed extends Item implements IHasModel
{

	public int num;
	public int num2;
	public static String[] ARMS= new String[] {"","matsubokkuri_arms","kurumi_arms", "donguri_arms","melon_arms","pine_arms", "ichigo_arms", "orange_arms", "banana_arms", "budou_arms", "mango_arms", "durian_arms", "kiwi_arms", "energy_lemon_arms", "energy_cherry_arms", "energy_peach_arms", "energy_melon_arms","jimbar_lemon_arms","jimbar_cherry_arms","jimbar_peach_arms","jimbar_melon_arms", "energy_matsubokkuri_arms", "kachidoki_arms", "kiwami_arms", "yomotsu_heguri_arms", "blood_orange_arms", "fifteen_arms", "golden_arms", "silver_arms", "darkness_arms", "watermelon_arms", "ringo_arms","baron_ringo_arms","jimbar_black_arms", "wizard_arms", "fourze_arms", "ooo_arms", "w_arms", "decade_arms", "rider_ichigo_arms","suika_arms","lemon_arms","energy_dragon_fruits_arms","energy_prototype_dragon_fruits_arms","fresh_orange_arms","drive_arms","jimbar_marron_arms","blood_zakuro_arms","kuuga_arms","agito_arms","ryuki_arms","faiz_arms","blade_arms","hibiki_arms","kabuto_arms","den_o_arms","kiva_arms","gaim_arms","kabi_orange_arms","maja_arms","jimbar_dragon_arms","jimbar_melon_arms_zangetsu","jimbar_melon_arms_barvo","natsumikan_arms","black_baron_arms", "zangetsu_kachidoki_arms"};



	public Item_lockseed(int NUM ,int arms,String name)
	{
		super();
		
		this.setMaxDamage(0);

		num=NUM;

		num2=arms;

	    setTranslationKey(name);
        setRegistryName(name);
        TokuCraft_core.ITEMS.add(this);

	}

	@Override
	public void registerModels() {
		TokuCraft_core.proxy.registerItemRender(this,0,"inventory");
	}

	 public Item AddlockseedToHelheimVine(int num)
	    {
	    	for (int i1 = 0; i1 < num; ++i1)
			{
	    		 BlockHelheimVine.LOCKSEED.add(this);
			}
	        return this;
	    }
	 
	   /**
  * Called when the equipped item is right clicked.
  */
 public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn)
 {
 
		if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET)!= null){

			if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() instanceof item_Gaimdriver){
				item_Gaimdriver belt = (item_Gaimdriver) playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem();

				if (num == 1){

					if (belt.DRIVER==0){

						if (ARMS[num2] == "ringo_arms" &playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem()== RiderItems.sengoku_driver_baron){
							item_Gaimdriver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),0, "1");
							item_Gaimdriver.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),32);	
						}else if (ARMS[num2] == "fresh_orange_arms" &playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem()== RiderItems.sengoku_driver_gaim){
							item_Gaimdriver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),5, "1");
							item_Gaimdriver.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num2);	
						}else if (ARMS[num2] == "blood_zakuro_arms"){
							if (playerIn.inventory.hasItemStack(new ItemStack(RiderItems.blood_orange_lockseed)) &playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem()== RiderItems.sengoku_driver_savior){
								item_Gaimdriver.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num2);	
							}
						}else{

							item_Gaimdriver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),0, "1");
							item_Gaimdriver.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num2);
						}
					}



				}else if (num == 2){
					if (belt.DRIVER==1){
						if (ARMS[num2] != "jimbar_marron_arms"){

							if (ARMS[num2] == "energy_dragon_fruits_arms" &playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem()== RiderItems.genesis_driver_tyrant){
								item_Gaimdriver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),0, "1");
								item_Gaimdriver.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num2+1);	
							}else{
								item_Gaimdriver.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num2);
							}
						}
					}else if(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem()== RiderItems.sengoku_driver_gaim){


						if (playerIn.inventory.hasItemStack(new ItemStack(RiderItems.orange_lockseed))){

							int jimbar;
							if (ARMS[num2] == "energy_lemon_arms"||ARMS[num2] == "energy_cherry_arms"||ARMS[num2] == "energy_peach_arms"||ARMS[num2] == "energy_melon_arms"){
								jimbar = num2+4;
							}
							else {
								jimbar = 99;
							}

							if (jimbar != 99){
								item_Gaimdriver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),1, "1");

								item_Gaimdriver.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),jimbar);
							}
						}
					}else if(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem()== RiderItems.sengoku_driver_knuckle){
						if (playerIn.inventory.hasItemStack(new ItemStack(RiderItems.kurumi_lockseed))){
							if (ARMS[num2] == "jimbar_marron_arms"){
								item_Gaimdriver.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num2);

							}	
						}
						}else if(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem()== RiderItems.sengoku_driver_ryugen){
							if (playerIn.inventory.hasItemStack(new ItemStack(RiderItems.budou_lockseed))){
								if (ARMS[num2] == "energy_dragon_fruits_arms"){
									item_Gaimdriver.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),60);

								}	
							}
						}else if(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem()== RiderItems.sengoku_driver_barvo){
							if (playerIn.inventory.hasItemStack(new ItemStack(RiderItems.durian_lockseed))){
								if (ARMS[num2] == "energy_melon_arms"){
									item_Gaimdriver.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),62);

								}	
							}
						}else if(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem()== RiderItems.sengoku_driver_zangetsu){
							if (playerIn.inventory.hasItemStack(new ItemStack(RiderItems.melon_lockseed))){
								if (ARMS[num2] == "energy_melon_arms"){
									item_Gaimdriver.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),61);

								}	
							
						}

						}

					}else if (num == 3){

						if(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem()== RiderItems.sengoku_driver_zangetsu){
							if (ARMS[num2] == "zangetsu_kachidoki_arms"){
								item_Gaimdriver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),2, "1");
								item_Gaimdriver.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num2);
							}
						}
						if(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem()== RiderItems.sengoku_driver_gaim){

							if (ARMS[num2] == "kiwami_arms"){
								if (item_Gaimdriver.get_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET))=="kachidoki_arms"){
									item_Gaimdriver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),3, "1");
									item_Gaimdriver.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num2);
								}
							}else if (ARMS[num2] == "jimbar_black_arms"){
								//if (playerIn.inventory.hasItem(KamenRiderCraft2_core.dark_orange_lockseed) & playerIn.inventory.hasItem(KamenRiderCraft2_core.dark_lemon_energy_lockseed)){
								item_Gaimdriver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),4, "1");
								item_Gaimdriver.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num2);
								//}
							}else if (ARMS[num2] != "zangetsu_kachidoki_arms"){
								item_Gaimdriver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),2, "1");
								item_Gaimdriver.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num2);
							}
						}
					}
					else if (num == 4){

						if (ARMS[num2] == "drive_arms" &playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem()== RiderItems.sengoku_driver_gaim){
							item_Gaimdriver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),6, "1");
							item_Gaimdriver.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num2);	
						}else{

							item_Gaimdriver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),0, "1");



							item_Gaimdriver.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num2);
						}
					}
				}
			}
		
        playerIn.setActiveHand(handIn);
        return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, playerIn.getHeldItem(handIn));
    }
}