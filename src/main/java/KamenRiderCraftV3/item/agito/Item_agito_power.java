package KamenRiderCraftV3.item.agito;

import KamenRiderCraftV3.RiderItems;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;


public class Item_agito_power extends Item
{

	public int num;


	public Item_agito_power(int NUM)
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

			if (par3EntityPlayer.getEquipmentInSlot(1).getItem() == RiderItems.alter_ring & num != -1){


				item_agitodriver.set_core(par3EntityPlayer.getEquipmentInSlot(1), num);

			} else if (par3EntityPlayer.getEquipmentInSlot(1).getItem() == RiderItems.meta_factor){

				if (par1ItemStack.getItem()== RiderItems.exceed_gills){
					item_agitodriver.set_core(par3EntityPlayer.getEquipmentInSlot(1), 1);
				}else if (par1ItemStack.getItem()== RiderItems.gills){
					item_agitodriver.set_core(par3EntityPlayer.getEquipmentInSlot(1), 0);
				}
			}

		}
		return par1ItemStack;
	}




}
