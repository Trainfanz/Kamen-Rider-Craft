package KamenRiderCraftV3.item.decade;

import KamenRiderCraftV3.RiderItems;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class Itemrider_cards extends Item
{

	public int num;
	public int num2;

	public Itemrider_cards(int NUM,int NUM2)
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

			if (par3EntityPlayer.getEquipmentInSlot(1).getItem() == RiderItems.decadedriver&par1ItemStack.getItem()!=RiderItems.k_touch_diend||par3EntityPlayer.getEquipmentInSlot(1).getItem() == RiderItems.dark_decadedriver&par1ItemStack.getItem()!=RiderItems.k_touch_diend&par1ItemStack.getItem()!=RiderItems.k_touch& par1ItemStack.getItem()!=RiderItems.decadecard_violent_emotion &par1ItemStack.getItem()!=RiderItems.diendcard){

				item_decadedriver.set_core(par3EntityPlayer.getEquipmentInSlot(1), num,num2);
				
			}else if (par3EntityPlayer.getEquipmentInSlot(1).getItem() == RiderItems.dienddriver){
				if (par1ItemStack.getItem()==RiderItems.k_touch_diend){
					item_decadedriver.set_core(par3EntityPlayer.getEquipmentInSlot(1), 0,1);
				}else if (par1ItemStack.getItem()==RiderItems.diendcard){
					item_decadedriver.set_core(par3EntityPlayer.getEquipmentInSlot(1), 0,0);
				}

			}

		}

			return par1ItemStack;
		}

	}
