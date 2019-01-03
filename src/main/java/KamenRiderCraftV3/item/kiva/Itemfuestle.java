package KamenRiderCraftV3.item.kiva;


import KamenRiderCraftV3.RiderItems;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class Itemfuestle extends Item
{

	public int num;
	public int num2;


	public Itemfuestle(int NUM,int NUM2)
	{
		super();
		this.setHasSubtypes(true);
		this.setMaxDamage(0);

		num2=NUM2;
		num=NUM;

	}





	/**
	 * Called whenever this item is equipped and the right mouse button is pressed. Args: itemStack, world, entityPlayer
	 */
	public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
	{



		if (par3EntityPlayer.getEquipmentInSlot(1)!= null){
			if (num==0){
				if (par3EntityPlayer.getEquipmentInSlot(1).getItem() == RiderItems.kivadriver){
					if (par3EntityPlayer.isSneaking()){
						if (num2 == 1||num2 == 2||num2 == 3 ){
							if (par3EntityPlayer.inventory.hasItem(RiderItems.wakeupfuestle)&par3EntityPlayer.inventory.hasItem(RiderItems.garulufuestle)&par3EntityPlayer.inventory.hasItem(RiderItems.basshaafuestle)&par3EntityPlayer.inventory.hasItem(RiderItems.doggafuestle)){

								if (item_kivadriver.get_core(par3EntityPlayer.getEquipmentInSlot(1))==5){
									item_kivadriver.set_core(par3EntityPlayer.getEquipmentInSlot(1), 6);	
								}else{

									item_kivadriver.set_core(par3EntityPlayer.getEquipmentInSlot(1), 4);
								}

							}else{
								item_kivadriver.set_core(par3EntityPlayer.getEquipmentInSlot(1), num2);
							}
						}else{
							item_kivadriver.set_core(par3EntityPlayer.getEquipmentInSlot(1), num2);
						}

					}else{
						item_kivadriver.set_core(par3EntityPlayer.getEquipmentInSlot(1), num2);
					}
				}
			}
		}if (num==1){
			if (par3EntityPlayer.getEquipmentInSlot(1).getItem() == RiderItems.ixa_belt){
				if (num2==1){
					if (item_kivadriver.get_core(par3EntityPlayer.getEquipmentInSlot(1))==1){
						item_kivadriver.set_core(par3EntityPlayer.getEquipmentInSlot(1), 0);
					}else {
						item_kivadriver.set_core(par3EntityPlayer.getEquipmentInSlot(1), 1);
					}
				}else{
				item_kivadriver.set_core(par3EntityPlayer.getEquipmentInSlot(1), num2);
				}
			}
			}




		return par1ItemStack;
	}

}
