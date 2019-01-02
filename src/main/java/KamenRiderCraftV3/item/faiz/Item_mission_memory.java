package KamenRiderCraftV3.item.faiz;


import KamenRiderCraftV3.RiderItems;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;


public class Item_mission_memory extends Item
{

	public int num;


	public Item_mission_memory(int NUM)
	{
		super();
		this.setHasSubtypes(true);
		this.setMaxDamage(0);
		
		num=NUM;


	}



	/**
	 * Called whenever this item is equipped and the right mouse button is pressed. Args: itemStack, world, entityPlayer
	 */
	public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
	{



		if (par3EntityPlayer.getEquipmentInSlot(1)!= null){

			if (par3EntityPlayer.getEquipmentInSlot(1).getItem() == RiderItems.faizdriver){
				


					item_faizdriver.set_core(par3EntityPlayer.getEquipmentInSlot(1), num);
				
			}
		}



		return par1ItemStack;
	}

	

}
