package KamenRiderCraftV3.item.hibiki;


import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import KamenRiderCraftV3.KamenRiderCraftV3_core;
import KamenRiderCraftV3.RiderItems;

public class Itemhibiki_stone extends Item
{

	public int num;


	public Itemhibiki_stone(int NUM)
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

			if (par3EntityPlayer.getEquipmentInSlot(1).getItem() == RiderItems.hibikidriver){


				
					item_hibikidriver.set_core(par3EntityPlayer.getEquipmentInSlot(1), num);
				


			}

		}
			return par1ItemStack;
		}

	

	}
