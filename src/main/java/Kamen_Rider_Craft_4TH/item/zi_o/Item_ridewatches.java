package Kamen_Rider_Craft_4TH.item.zi_o;


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


public class Item_ridewatches extends Item implements IHasModel
{

	public int num;
	public int num2;
	public static String[] ARMS= new String[] {"base","build","exaid","ghost","drive","gaim","wizard","fourze","ooo","w","kiva","deno","kabuto","hibiki","blade","faiz","ryuki","agito","kuuga","genm"};



	public Item_ridewatches(int NUM ,int arms,String name)
	{
		super();
		this.setHasSubtypes(true);
		this.setMaxDamage(0);

		num=NUM;

		num2=arms;


		setUnlocalizedName(name);
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

		if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET)!= null){

			if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.ziku_driver_zi_o||playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.ziku_driver_geiz){
				item_zikudriver belt = (item_zikudriver) playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem();

				if (belt.DRIVER==0){

					if (num == 0){

						if (belt.Rider=="zi_o"){

							if (this == RiderItems.zi_o_ridewatch){

								item_zikudriver.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num2);
								item_zikudriver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),0, "1");

							}
						}else if (belt.Rider=="geiz"){

								if (this == RiderItems.geiz_ridewatch){

									item_zikudriver.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num2);
									item_zikudriver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),0, "1");									
							}		
						}

					}
						else if (num==1){
							item_zikudriver.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num2);

						
					}
				}
			}
		}
		playerIn.setActiveHand(handIn);
		return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, playerIn.getHeldItem(handIn));
	}
}