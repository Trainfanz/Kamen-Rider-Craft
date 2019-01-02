package KamenRiderCraftV3.item.blade;

import KamenRiderCraftV3.RiderItems;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;


public class ItemRouze_Cards extends Item
{

	public int num;
	private String RIDER;


	public ItemRouze_Cards(int NUM,String rider)
	{
		super();
		this.setHasSubtypes(true);
		this.setMaxDamage(0);
		
		num=NUM;
RIDER=rider;

	}



	/**
	 * Called whenever this item is equipped and the right mouse button is pressed. Args: itemStack, world, entityPlayer
	 */
	public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
	{



		if (par3EntityPlayer.getEquipmentInSlot(1)!= null){

			if (par3EntityPlayer.getEquipmentInSlot(1).getItem() == RiderItems.bladedriver & RIDER == "blade"){


				if (num==1||num==2){
					if (par3EntityPlayer.inventory.hasItem(RiderItems.rouze_absorber)){
						item_bladedriver.set_core(par3EntityPlayer.getEquipmentInSlot(1), num);
					}
				}else{

					item_bladedriver.set_core(par3EntityPlayer.getEquipmentInSlot(1), num);
				}		



			}	if (par3EntityPlayer.getEquipmentInSlot(1).getItem() == RiderItems.garrendriver & RIDER == "garren"){


				if (num==1||num==2){
					if (par3EntityPlayer.inventory.hasItem(RiderItems.garren_absorber)){
						item_bladedriver.set_core(par3EntityPlayer.getEquipmentInSlot(1), num);
					}
				}else{

					item_bladedriver.set_core(par3EntityPlayer.getEquipmentInSlot(1), num);
				}	
			}	
				if (par3EntityPlayer.getEquipmentInSlot(1)!= null){

					if (par3EntityPlayer.getEquipmentInSlot(1).getItem() == RiderItems.chalicerouzer & RIDER == "chalice"){


						if (num==3){							
								item_bladedriver.set_core(par3EntityPlayer.getEquipmentInSlot(1), num);
							
						}else{

							item_bladedriver.set_core(par3EntityPlayer.getEquipmentInSlot(1), num);
						}		

					}

			}

		}
			return par1ItemStack;
		}

	}
