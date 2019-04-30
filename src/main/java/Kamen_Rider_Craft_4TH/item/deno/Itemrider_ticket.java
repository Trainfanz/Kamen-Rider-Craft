package Kamen_Rider_Craft_4TH.item.deno;


import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;
import Kamen_Rider_Craft_4TH.RiderItems;
import Kamen_Rider_Craft_4TH.TokuCraft_core;
import Kamen_Rider_Craft_4TH.util.IHasModel;

public class Itemrider_ticket extends Item implements IHasModel
{

	public int num;

	public int num2;

	public Itemrider_ticket(int NUM, int  NUM2,String name)
	{
		super();
		
		this.setMaxDamage(0);

		num=NUM;
		num2=NUM2;
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

			if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.den_odriver& num2 == 0){
				if (playerIn.isSneaking()){
					if (num == 5 ){
						if (playerIn.inventory.hasItemStack(new ItemStack(RiderItems.ktaros))&playerIn.inventory.hasItemStack(new ItemStack(RiderItems.rider_ticket_wing))){

							if (item_den_odriver.get_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET))==6){
								item_den_odriver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET), 7);	
							}else{

								item_den_odriver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET), 5);
							}

						}else{
							item_den_odriver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET), num);
						}
					}else{
						item_den_odriver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET), num);
					}

				}else{
					item_den_odriver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET), num);
				}
			} 

			else if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.zeronosbelt& num2 == 1){
				item_den_odriver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET), num);
			}

			else if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.newden_obelt& num2 == 2||playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem()== RiderItems.newden_obelt& this==RiderItems.rider_ticket||playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem()== RiderItems.newden_obelt& this==RiderItems.zeronos_vega_card){
				item_den_odriver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET), num);	

			}
		}
		  playerIn.setActiveHand(handIn);
	        return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, playerIn.getHeldItem(handIn));
	    }
}
