package KamenRiderCraftV3.item.ryuki;


import KamenRiderCraftV3.RiderItems;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;


public class Item_advent_cards extends Item
{

	public int num;
	public String num2;


	public Item_advent_cards(int NUM ,String NUM2)
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

			if (par3EntityPlayer.getEquipmentInSlot(1).getItem() == RiderItems.v_buckle_ryuki){

				if (num2 == "1"){
					item_ryukidriver.set_core(par3EntityPlayer.getEquipmentInSlot(1), num);
				}
			}else if (par3EntityPlayer.getEquipmentInSlot(1).getItem() == RiderItems.v_buckle_ryuga){
				if (this==RiderItems.survive_advent){
					item_ryukidriver.set_core(par3EntityPlayer.getEquipmentInSlot(1), num);
				}else if (num2 == "3"){
					item_ryukidriver.set_core(par3EntityPlayer.getEquipmentInSlot(1), num);
				}
			}

			
			else if (par3EntityPlayer.getEquipmentInSlot(1).getItem() == RiderItems.v_buckle_knight){

			if (num2 == "2")
				item_ryukidriver.set_core(par3EntityPlayer.getEquipmentInSlot(1), num);
		}

		}




		return par1ItemStack;
	}

}
