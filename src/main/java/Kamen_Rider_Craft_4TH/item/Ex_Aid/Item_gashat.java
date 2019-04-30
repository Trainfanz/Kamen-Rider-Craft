package Kamen_Rider_Craft_4TH.item.Ex_Aid;


import Kamen_Rider_Craft_4TH.RiderItems;
import Kamen_Rider_Craft_4TH.TokuCraft_core;
import Kamen_Rider_Craft_4TH.blocks.GameCreatorBlock;
import Kamen_Rider_Craft_4TH.blocks.gaia_memory_refiner_block;
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


public class Item_gashat extends Item implements IHasModel
{

	public int num;
	public int num2;
	public static String[] ARMS= new String[] {"blank","robotgamer","protorobotgamer","beatgamer","protobeatgamer","combatgamer","protocombatgamer","sportsgamer","protosportsgamer","huntergamerfull","huntergamerfang","huntergamerblade","huntergamergun","huntergamerclaw","chambaragamer","protochambaragamer","bikeactiongamer","burgergamer","pacgamer","famistagamer","xeviousgamer","safarigamer","fantasygamer","legacygamer","simulationgamer","zombie_gamer","xxr_gamer","xxl_gamer","galaxiangamer","creatorgamer","knock_out_fighter_2_gamer"};



	public Item_gashat(int NUM ,int arms,String name)
	{
		super();
		
		this.setMaxDamage(0);

		num=NUM;

		num2=arms;

		
	    setUnlocalizedName(name);
        setRegistryName(name);
        TokuCraft_core.ITEMS.add(this);

	}

    public Item AddGashatToBlockList(int num)
    {
    	for (int i1 = 0; i1 < num; ++i1)
		{
    		GameCreatorBlock.gashat.add(this);
		}
        return this;
    }
    
    public Item AddBugvisorGashatToBlockList(int num)
    {
    	for (int i1 = 0; i1 < num; ++i1)
		{
    		GameCreatorBlock.gashatBugvisor.add(this);
		}
        return this;
    }
    
    public Item AddMaxGashatToBlockList(int num)
    {
    	for (int i1 = 0; i1 < num; ++i1)
		{
    		GameCreatorBlock.gashatMaximum.add(this);
		}
        return this;
    }
    public Item AddDualGashatToBlockList(int num)
    {
    	for (int i1 = 0; i1 < num; ++i1)
		{
    		GameCreatorBlock.gashatDual.add(this);
		}
        return this;
    }
    public Item AddHyperGashatToBlockList(int num)
    {
    	for (int i1 = 0; i1 < num; ++i1)
		{
    		GameCreatorBlock.gashatHyper.add(this);
		}
        return this;
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

		if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET)!= null){

			if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() instanceof item_ex_aiddriver){
				item_ex_aiddriver belt = (item_ex_aiddriver) playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem();

				if (num == 0){

					if (belt.DRIVER==0){
						
						if (belt.Rider=="ex_aid"){

							if (this == RiderItems.mighty_action_x_gashat){
								if (item_ex_aiddriver.get_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET), "1")==0){
									item_ex_aiddriver.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num2);
									item_ex_aiddriver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),4, "1");
								}else{
									item_ex_aiddriver.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num2);
									item_ex_aiddriver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),0, "1");
								}

							}else if (this == RiderItems.proto_bakusou_bike_combi_fukkatsu_gashat){

								item_ex_aiddriver.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num2);
								item_ex_aiddriver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),1, "1");


							}else if (this == RiderItems.mighty_brothers_xx_gashat){

								if(item_ex_aiddriver.get_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET), "1")==2){
									item_ex_aiddriver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),3, "1");
									item_ex_aiddriver.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num2+1);
								}
								else if(item_ex_aiddriver.get_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET), "1")==5){
									item_ex_aiddriver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),2, "1");
									item_ex_aiddriver.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num2);
								}
								else{
									item_ex_aiddriver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),5, "1");
									item_ex_aiddriver.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),0);
								}

							}else if (this == RiderItems.maximum_mighty_x_gashat){

								item_ex_aiddriver.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num2);
								item_ex_aiddriver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),6, "1");


							}else if (this == RiderItems.kaigan_ghost_gashat){
								if (item_ex_aiddriver.get_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET), "1")==7){
									item_ex_aiddriver.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num2);
									item_ex_aiddriver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),8, "1");
								}else{
									item_ex_aiddriver.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num2);
									item_ex_aiddriver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),7, "1");
								}
							}else if (this == RiderItems.full_throttle_drive_gashat){

								item_ex_aiddriver.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num2);
								item_ex_aiddriver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),9, "1");


							}else if (this == RiderItems.full_throttle_drive_gashat){

								item_ex_aiddriver.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num2);
								item_ex_aiddriver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),9, "1");


							}else if (this == RiderItems.toukenden_gaim_gashat){

								item_ex_aiddriver.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num2);
								item_ex_aiddriver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),10, "1");


							}else if (this == RiderItems.magic_the_wizard_gashat){

								item_ex_aiddriver.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num2);
								item_ex_aiddriver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),11, "1");


							}else if (this == RiderItems.space_galaxy_fourze_gashat){

								item_ex_aiddriver.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num2);
								item_ex_aiddriver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),12, "1");


							}else if (this == RiderItems.jungle_ooo_gashat){

								item_ex_aiddriver.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num2);
								item_ex_aiddriver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),13, "1");


							}else if (this == RiderItems.detective_double_gashat){

								item_ex_aiddriver.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num2);
								item_ex_aiddriver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),14, "1");


							}else if (this == RiderItems.barcode_warrior_decade_gashat){

								item_ex_aiddriver.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num2);
								item_ex_aiddriver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),15, "1");


							}else if (this == RiderItems.dokidoki_makai_castle_kiva_gashat){

								item_ex_aiddriver.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num2);
								item_ex_aiddriver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),16, "1");


							}else if (this == RiderItems.time_express_den_o_gashat){

								item_ex_aiddriver.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num2);
								item_ex_aiddriver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),17, "1");


							}else if (this == RiderItems.insect_wars_kabuto_gashat){

								item_ex_aiddriver.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num2);
								item_ex_aiddriver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),18, "1");


							}else if (this == RiderItems.taiko_master_hibik_gashat){

								item_ex_aiddriver.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num2);
								item_ex_aiddriver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),19, "1");


							}else if (this == RiderItems.king_of_poker_blade_gashat){

								item_ex_aiddriver.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num2);
								item_ex_aiddriver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),20, "1");


							}else if (this == RiderItems.moshi_moshi_faiz_gashat){

								item_ex_aiddriver.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num2);
								item_ex_aiddriver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),21, "1");


							}else if (this == RiderItems.mirror_labryinth_ryuki_gashat){

								item_ex_aiddriver.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num2);
								item_ex_aiddriver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),22, "1");


							}else if (this == RiderItems.agito_of_the_sun_gashat){

								item_ex_aiddriver.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num2);
								item_ex_aiddriver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),23, "1");


							}else if (this == RiderItems.adventure_guy_kuuga_gashat){

								item_ex_aiddriver.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num2);
								item_ex_aiddriver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),24, "1");


							}else if (this == RiderItems.lets_go_ichigou_gashat){

								item_ex_aiddriver.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num2);
								item_ex_aiddriver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),25, "1");


							}else if (this == RiderItems.hyper_muteki_gashat&item_ex_aiddriver.get_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET), "1")==6){

								item_ex_aiddriver.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num2);
								item_ex_aiddriver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),26, "1");


							}else if (this == RiderItems.mighty_creator_vrx_gashat){

								item_ex_aiddriver.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num2);
								item_ex_aiddriver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),27, "1");


							}else if (this == RiderItems.knock_out_fighter_2_gashat){

								item_ex_aiddriver.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num2);
								item_ex_aiddriver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),28, "1");


							}else if (this == RiderItems.mighty_novel_x_gashat){

								item_ex_aiddriver.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num2);
								item_ex_aiddriver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),29, "1");


							}
						}
						else if (belt.Rider=="brave"& this == RiderItems.taddle_quest_gashat){
							if (item_ex_aiddriver.get_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET), "1")==0){
								item_ex_aiddriver.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num2);
								item_ex_aiddriver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),4, "1");
							}else{
								item_ex_aiddriver.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num2);
								item_ex_aiddriver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),0, "1");
							}
						}else if (belt.Rider=="lazer_turbo"& this == RiderItems.bakusou_bike_gashat){
							
								item_ex_aiddriver.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num2);
								item_ex_aiddriver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),0, "1");
							
						}else if (belt.Rider=="snipe"& this == RiderItems.bang_bang_shooting_gashat){
							if (item_ex_aiddriver.get_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET), "1")==0){
								item_ex_aiddriver.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num2);
								item_ex_aiddriver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),4, "1");
							}else{
								item_ex_aiddriver.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num2);
								item_ex_aiddriver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),0, "1");
							}
						}else if (belt.Rider=="proto_brave"& this == RiderItems.proto_taddle_quest_gashat||belt.Rider=="proto_snipe"& this == RiderItems.proto_bang_bang_shooting_gashat){
							if (item_ex_aiddriver.get_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET), "1")==0){
								item_ex_aiddriver.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num2);
								item_ex_aiddriver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),4, "1");
							}else{
								item_ex_aiddriver.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num2);
								item_ex_aiddriver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),0, "1");
							}
						}else if (belt.Rider=="genmu"){
							if (this == RiderItems.proto_mighty_action_x_gashat){
								if (item_ex_aiddriver.get_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET), "1")==0){
									item_ex_aiddriver.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num2);
									item_ex_aiddriver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),4, "1");
								}else{
									item_ex_aiddriver.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num2);
									item_ex_aiddriver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),0, "1");
								}
							}else if (this == RiderItems.god_maximum_mighty_x_gashat){

								item_ex_aiddriver.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num2);
								item_ex_aiddriver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),6, "1");


							}
							else if (this == RiderItems.proto_mighty_action_x_gashat_origin){
								item_ex_aiddriver.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num2);
								item_ex_aiddriver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),1, "1");

							}else if (this == RiderItems.dangerous_zombie_gashat&item_ex_aiddriver.get_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET), "1")==1){
								item_ex_aiddriver.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num2);
								item_ex_aiddriver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),2, "1");
							}else if (this == RiderItems.magic_the_wizard_gashat){

								item_ex_aiddriver.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num2);
								item_ex_aiddriver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),11, "1");


							}else if (this == RiderItems.space_galaxy_fourze_gashat){

								item_ex_aiddriver.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num2);
								item_ex_aiddriver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),12, "1");


							}else if (this == RiderItems.jungle_ooo_gashat){

								item_ex_aiddriver.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num2);
								item_ex_aiddriver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),13, "1");


							}else if (this == RiderItems.barcode_warrior_decade_gashat){

								item_ex_aiddriver.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num2);
								item_ex_aiddriver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),15, "1");


							}else if (this == RiderItems.time_express_den_o_gashat){

								item_ex_aiddriver.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num2);
								item_ex_aiddriver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),17, "1");


							}else if (this == RiderItems.taiko_master_hibik_gashat){

								item_ex_aiddriver.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num2);
								item_ex_aiddriver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),19, "1");


							}else if (this == RiderItems.king_of_poker_blade_gashat){

								item_ex_aiddriver.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num2);
								item_ex_aiddriver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),20, "1");


							}else if (this == RiderItems.moshi_moshi_faiz_gashat){

								item_ex_aiddriver.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num2);
								item_ex_aiddriver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),21, "1");


							}else if (this == RiderItems.agito_of_the_sun_gashat){

								item_ex_aiddriver.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num2);
								item_ex_aiddriver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),23, "1");


							}
						}

					}
					else if (belt.Rider=="paradox99"&belt.DRIVER==2){
						if ( this == RiderItems.perfect_puzzle_gashat|| this == RiderItems.knock_out_fighter_gashat){

						item_ex_aiddriver.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),0);
						item_ex_aiddriver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),0, "1");
						}else if (this == RiderItems.knock_out_fighter_2_gashat){

							item_ex_aiddriver.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),0);
							item_ex_aiddriver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),1, "1");
						}
						
					}
					else if (belt.DRIVER==1){

						if (this == RiderItems.bakusou_bike_gashat){
							if (item_ex_aiddriver.get_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET), "1")==0){
								item_ex_aiddriver.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num2);
								item_ex_aiddriver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),4, "1");
							}else{
								item_ex_aiddriver.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num2);
								item_ex_aiddriver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),0, "1");
							}
						}else if (item_ex_aiddriver.get_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET), "1")==0){
							 if (this == RiderItems.giri_giri_chambara_gashat){
							
							item_ex_aiddriver.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num2);
							//item_ex_aiddriver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),0, "1");
						}else if (this == RiderItems.proto_giri_giri_chambara_gashat){
							item_ex_aiddriver.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num2);
							//item_ex_aiddriver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),0, "1");
						}}
					}else if (belt.DRIVER==3){
						if (this == RiderItems.perfect_puzzle_gashat){
							item_ex_aiddriver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),0, "1");
						}else if (this == RiderItems.knock_out_fighter_gashat){
							item_ex_aiddriver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),1, "1");
						}
					}
				}
				else if (num == 1){

					if (item_ex_aiddriver.get_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET), "1")==0){

					if (belt.DRIVER==1){

						if (this== RiderItems.drago_knight_hunter_z_gashat){

							item_ex_aiddriver.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),13);

						}

					}
					else if (belt.DRIVER==0){


						if (this== RiderItems.drago_knight_hunter_z_gashat){
							if(playerIn.isSneaking()){
								item_ex_aiddriver.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num2);
							}else{
								if (belt.Rider=="ex_aid"||belt.Rider=="genmu"){
									item_ex_aiddriver.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),10);
								}else if (belt.Rider=="brave"){
									item_ex_aiddriver.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),11);
								}else if (belt.Rider=="snipe"){
									item_ex_aiddriver.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),12);
								}
							}
						}else{

							item_ex_aiddriver.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num2);
						}
					}
					}
				}

			}
		}
        playerIn.setActiveHand(handIn);
        return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, playerIn.getHeldItem(handIn));
    }
}