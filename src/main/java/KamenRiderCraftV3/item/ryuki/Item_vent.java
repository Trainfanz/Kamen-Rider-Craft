package KamenRiderCraftV3.item.ryuki;


import KamenRiderCraftV3.RiderItems;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;


public class Item_vent extends Item
{

	public String RIDER;
	public Item WEP;
	public int FORM;
	public Item WEP2;
	
	public Item_vent(String rider ,Item wepon, int num,Item visors)
	{
		super();
		this.setHasSubtypes(true);
		this.setMaxDamage(0);

		RIDER=rider;
		WEP=wepon;
		FORM=num;
		WEP2=visors;
	}






	/**
	 * Called whenever this item is equipped and the right mouse button is pressed. Args: itemStack, world, entityPlayer
	 */
	public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
	{

if (par3EntityPlayer.inventory.hasItem(WEP2)){

		if (par3EntityPlayer.getEquipmentInSlot(1)!= null){
			if (par3EntityPlayer.getEquipmentInSlot(2).getItem() == RiderItems.ryukilegs){
				if (par3EntityPlayer.getEquipmentInSlot(3).getItem() == RiderItems.ryukitroso){
					if (par3EntityPlayer.getEquipmentInSlot(4).getItem() == RiderItems.ryukihead){
						if (par3EntityPlayer.getEquipmentInSlot(1).getItem() instanceof item_ryukidriver){
							if (RIDER == ((item_ryukidriver)par3EntityPlayer.getEquipmentInSlot(1).getItem()).Rider){
								if (!par2World.isRemote)
								{
								par3EntityPlayer.dropItem(WEP, 1);
								
								 if (!par3EntityPlayer.capabilities.isCreativeMode){
									 
							      		par3EntityPlayer.inventory.consumeInventoryItem(this);
												
							      	}
							}}

						}
						}
					}
				}}
			}



			return par1ItemStack;
		}

	}
