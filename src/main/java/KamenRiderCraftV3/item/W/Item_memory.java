package KamenRiderCraftV3.item.W;

import KamenRiderCraftV3.RiderItems;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;


public class Item_memory extends Item
{

	public int num;
	public String num2;


	public Item_memory(int NUM ,String NUM2)
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

			if (par3EntityPlayer.getEquipmentInSlot(1).getItem() == RiderItems.Wdriver){

				if (num != 3){
					item_Wdriver.set_core(par3EntityPlayer.getEquipmentInSlot(1), num, num2);

				}else if (par3EntityPlayer.inventory.hasItem(RiderItems.joker_memory)){
					item_Wdriver.set_core(par3EntityPlayer.getEquipmentInSlot(1), num, num2);

					item_Wdriver.set_core(par3EntityPlayer.getEquipmentInSlot(1), 0, "1");


				}
				if (num2 == "2"){

					item_Wdriver.set_core(par3EntityPlayer.getEquipmentInSlot(1), 0, "1");
					item_Wdriver.set_core(par3EntityPlayer.getEquipmentInSlot(1), 0, "3");	
				}

				item_Wdriver.set_core(par3EntityPlayer.getEquipmentInSlot(1), num, num2);

				if (num2 != "1"){
					item_Wdriver.set_core(par3EntityPlayer.getEquipmentInSlot(1), item_Wdriver.get_core(par3EntityPlayer.getEquipmentInSlot(1), "1"), "1");

				}

				if (num2 != "2"){
					item_Wdriver.set_core(par3EntityPlayer.getEquipmentInSlot(1), item_Wdriver.get_core(par3EntityPlayer.getEquipmentInSlot(1), "1"), "1");
					item_Wdriver.set_core(par3EntityPlayer.getEquipmentInSlot(1), 0, "2");

				}

				if (num2 != "3"){

					item_Wdriver.set_core(par3EntityPlayer.getEquipmentInSlot(1), item_Wdriver.get_core(par3EntityPlayer.getEquipmentInSlot(1), "3"), "3");

				}
			}
			if (par3EntityPlayer.getEquipmentInSlot(1).getItem() == RiderItems.lostdriver){
				if (num2 == "4"){

					item_Wdriver.set_core(par3EntityPlayer.getEquipmentInSlot(1), num, "1");
					item_Wdriver.set_core(par3EntityPlayer.getEquipmentInSlot(1), num, "2");
					item_Wdriver.set_core(par3EntityPlayer.getEquipmentInSlot(1), num, "3");
				}
				if (num2 == "1" & num ==0){
					item_Wdriver.set_core(par3EntityPlayer.getEquipmentInSlot(1), 0, "1");
					item_Wdriver.set_core(par3EntityPlayer.getEquipmentInSlot(1), 0, "2");
					item_Wdriver.set_core(par3EntityPlayer.getEquipmentInSlot(1), 0, "3");

				}
				if (num2 == "3" & num ==0){
					item_Wdriver.set_core(par3EntityPlayer.getEquipmentInSlot(1), 4, "1");
					item_Wdriver.set_core(par3EntityPlayer.getEquipmentInSlot(1), 4, "2");
					item_Wdriver.set_core(par3EntityPlayer.getEquipmentInSlot(1), 4, "3");

				}

			}
			if (par3EntityPlayer.getEquipmentInSlot(1).getItem() == RiderItems.accel_driver){
				if (num2 == "5"){

					item_Wdriver.set_core(par3EntityPlayer.getEquipmentInSlot(1), num, "1");
					item_Wdriver.set_core(par3EntityPlayer.getEquipmentInSlot(1), num, "2");
					item_Wdriver.set_core(par3EntityPlayer.getEquipmentInSlot(1), num, "3");
				}
				

			}
		}



		return par1ItemStack;
	}



}
