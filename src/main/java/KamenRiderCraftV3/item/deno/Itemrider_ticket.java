package KamenRiderCraftV3.item.deno;


import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import KamenRiderCraftV3.RiderItems;

public class Itemrider_ticket extends Item
{

	public int num;

	public int num2;

	public Itemrider_ticket(int NUM, int  NUM2)
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

			if (par3EntityPlayer.getEquipmentInSlot(1).getItem() == RiderItems.den_odriver& num2 == 0){
				if (par3EntityPlayer.isSneaking()){
					if (num == 5 ){
						if (par3EntityPlayer.inventory.hasItem(RiderItems.ktaros)&par3EntityPlayer.inventory.hasItem(RiderItems.rider_ticket_wing)){

							if (item_den_odriver.get_core(par3EntityPlayer.getEquipmentInSlot(1))==6){
								item_den_odriver.set_core(par3EntityPlayer.getEquipmentInSlot(1), 7);	
							}else{

								item_den_odriver.set_core(par3EntityPlayer.getEquipmentInSlot(1), 5);
							}

						}else{
							item_den_odriver.set_core(par3EntityPlayer.getEquipmentInSlot(1), num);
						}
					}else{
						item_den_odriver.set_core(par3EntityPlayer.getEquipmentInSlot(1), num);
					}

				}else{
					item_den_odriver.set_core(par3EntityPlayer.getEquipmentInSlot(1), num);
				}
			} 

			else if (par3EntityPlayer.getEquipmentInSlot(1).getItem() == RiderItems.zeronosbelt& num2 == 1){
				item_den_odriver.set_core(par3EntityPlayer.getEquipmentInSlot(1), num);
			}

			else if (par3EntityPlayer.getEquipmentInSlot(1).getItem() == RiderItems.newden_obelt& num2 == 2||par3EntityPlayer.getEquipmentInSlot(1).getItem()== RiderItems.newden_obelt& this==RiderItems.rider_ticket||par3EntityPlayer.getEquipmentInSlot(1).getItem()== RiderItems.newden_obelt& this==RiderItems.zeronos_vega_card){
				item_den_odriver.set_core(par3EntityPlayer.getEquipmentInSlot(1), num);	

			}
		}
			return par1ItemStack;
		}

	


	
}
