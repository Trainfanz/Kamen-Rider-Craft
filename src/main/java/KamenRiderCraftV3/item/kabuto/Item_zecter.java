package KamenRiderCraftV3.item.kabuto;


import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import KamenRiderCraftV3.KamenRiderCraftV3_core;
import KamenRiderCraftV3.RiderItems;

public class Item_zecter extends Item
{

	public String num;


	public Item_zecter(String string)
	{
		super();
		this.setHasSubtypes(true);
		this.setMaxDamage(0);

		num=string;


	}



	/**
	 * Called whenever this item is equipped and the right mouse button is pressed. Args: itemStack, world, entityPlayer
	 */
	public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
	{



		if (par3EntityPlayer.getEquipmentInSlot(1)!= null){

			if (par3EntityPlayer.getEquipmentInSlot(1).getItem() instanceof item_kabutodriver){

				if (num == ((item_kabutodriver)par3EntityPlayer.getEquipmentInSlot(1).getItem()).Rider){
					if(item_kabutodriver.get_core(par3EntityPlayer.getEquipmentInSlot(1))==1){
						item_kabutodriver.set_core(par3EntityPlayer.getEquipmentInSlot(1),0);
					}else{
						item_kabutodriver.set_core(par3EntityPlayer.getEquipmentInSlot(1),1);
					}
				}else if(num =="hyper"&((item_kabutodriver)par3EntityPlayer.getEquipmentInSlot(1).getItem()).Rider=="kabuto"||num =="hyper"&((item_kabutodriver)par3EntityPlayer.getEquipmentInSlot(1).getItem()).Rider=="gatack"){
					if(item_kabutodriver.get_core(par3EntityPlayer.getEquipmentInSlot(1))==0){
						item_kabutodriver.set_core(par3EntityPlayer.getEquipmentInSlot(1),2);
					}else{
						item_kabutodriver.set_core(par3EntityPlayer.getEquipmentInSlot(1),0);
					}
				}
			}
		}



		return par1ItemStack;
	}




}
