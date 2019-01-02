package KamenRiderCraftV3.item.ooo;


import KamenRiderCraftV3.RiderItems;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;


public class Itemmedal extends Item
{

	public int num;
	public String num2;
	
	
    public Itemmedal(int NUM ,String NUM2)
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

			if (par3EntityPlayer.getEquipmentInSlot(1).getItem() == RiderItems.OOOdriver){
			
				item_OOOdriver.set_core(par3EntityPlayer.getEquipmentInSlot(1), num, num2);
				
				if (num2 != "1"){
					item_OOOdriver.set_core(par3EntityPlayer.getEquipmentInSlot(1), item_OOOdriver.get_core(par3EntityPlayer.getEquipmentInSlot(1), "1"), "1");
				}

				if (num2 != "2"){
					item_OOOdriver.set_core(par3EntityPlayer.getEquipmentInSlot(1), item_OOOdriver.get_core(par3EntityPlayer.getEquipmentInSlot(1), "2"), "2");
				}

				if (num2 != "3"){
					item_OOOdriver.set_core(par3EntityPlayer.getEquipmentInSlot(1), item_OOOdriver.get_core(par3EntityPlayer.getEquipmentInSlot(1), "3"), "3");
				}
			}
			}

			
		
		return par1ItemStack;
	}
	
	
    
   
	}
