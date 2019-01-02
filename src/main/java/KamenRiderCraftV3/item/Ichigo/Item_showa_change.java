package KamenRiderCraftV3.item.Ichigo;


import KamenRiderCraftV3.RiderItems;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;


public class Item_showa_change extends Item
{

	public int num;
public Item BELT;

	public Item_showa_change(int NUM,Item belt)
	{
		super();
		this.setHasSubtypes(true);
		this.setMaxDamage(0);
		BELT=belt;
		num=NUM;


	}



	/**
	 * Called whenever this item is equipped and the right mouse button is pressed. Args: itemStack, world, entityPlayer
	 */
	public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
	{



		if (par3EntityPlayer.getEquipmentInSlot(1)!= null){

			if (par3EntityPlayer.getEquipmentInSlot(1).getItem() == BELT){


					item_Ichigodriver.set_core(par3EntityPlayer.getEquipmentInSlot(1), num);
		
			}

		}
			return par1ItemStack;
		}



	}
