package KamenRiderCraftV3.item.wizard;


import KamenRiderCraftV3.RiderItems;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;


public class Item_wizard_ring extends Item
{

	public int num;
	public String num2;


	public Item_wizard_ring(int NUM ,String NUM2)
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

			if (par3EntityPlayer.getEquipmentInSlot(1).getItem() == RiderItems.wizardriver){


				if (num2=="3"){
					if (this == RiderItems.falco_ring&par3EntityPlayer.inventory.hasItem(RiderItems.beastdriver)&par3EntityPlayer.inventory.hasItem(RiderItems.buffa_ring)||this == RiderItems.buffa_ring&par3EntityPlayer.inventory.hasItem(RiderItems.beastdriver)&par3EntityPlayer.inventory.hasItem(RiderItems.falco_ring)){
						item_wizarddriver.set_core(par3EntityPlayer.getEquipmentInSlot(1), 0, "2");
						item_wizarddriver.set_core(par3EntityPlayer.getEquipmentInSlot(1), 10, "1");
					}
				}
			else if (num2=="1"){
					item_wizarddriver.set_core(par3EntityPlayer.getEquipmentInSlot(1), item_wizarddriver.get_core(par3EntityPlayer.getEquipmentInSlot(1), "1"), "1");
					item_wizarddriver.set_core(par3EntityPlayer.getEquipmentInSlot(1), 0, "2");
					item_wizarddriver.set_core(par3EntityPlayer.getEquipmentInSlot(1), num, num2);

				}else{
					if (num==2){
						item_wizarddriver.set_core(par3EntityPlayer.getEquipmentInSlot(1), item_wizarddriver.get_core(par3EntityPlayer.getEquipmentInSlot(1), "1"), num2);
					}else if (num==3){
						if (item_wizarddriver.get_core(par3EntityPlayer.getEquipmentInSlot(1), "1")==8){
							if (par3EntityPlayer.inventory.hasItem(RiderItems.hope_ring)){
								item_wizarddriver.set_core(par3EntityPlayer.getEquipmentInSlot(1), 8, "2");
								item_wizarddriver.set_core(par3EntityPlayer.getEquipmentInSlot(1), 9, "1");
							}else{
								item_wizarddriver.set_core(par3EntityPlayer.getEquipmentInSlot(1), 3, "2");
							}
						}
					}else if (item_wizarddriver.get_core(par3EntityPlayer.getEquipmentInSlot(1), "1")==4){
						item_wizarddriver.set_core(par3EntityPlayer.getEquipmentInSlot(1), num, num2);
					}
				}
			}
			if (par3EntityPlayer.getEquipmentInSlot(1).getItem() == RiderItems.beastdriver){
				
				if (this == RiderItems.land_ring_dragon&par3EntityPlayer.inventory.hasItem(RiderItems.wizardriver)){
					item_wizarddriver.set_core(par3EntityPlayer.getEquipmentInSlot(1), 6, "2");
					item_wizarddriver.set_core(par3EntityPlayer.getEquipmentInSlot(1), 6, "1");
				}
				else if (num2=="3"){
					item_wizarddriver.set_core(par3EntityPlayer.getEquipmentInSlot(1), item_wizarddriver.get_core(par3EntityPlayer.getEquipmentInSlot(1), "1"), "1");
					item_wizarddriver.set_core(par3EntityPlayer.getEquipmentInSlot(1), 0, "2");
					item_wizarddriver.set_core(par3EntityPlayer.getEquipmentInSlot(1), num, "1");

				}
			}
		}
		return par1ItemStack;
	}



}
