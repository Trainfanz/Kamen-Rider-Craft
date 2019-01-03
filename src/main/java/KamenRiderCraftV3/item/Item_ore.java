package KamenRiderCraftV3.item;



import KamenRiderCraftV3.KamenRiderCraftV3_core;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;


public class Item_ore extends Item
{

	
	
    public Item_ore()
    {
        super();
        this.setHasSubtypes(true);
        this.setMaxDamage(0);
        maxStackSize = 64;
       

    }
/**
	 public void registerIcons(IIconRegister par1IconRegister)
	    {
	        this.itemIcon = par1IconRegister.registerIcon("kamenridercraft2" + ":" + this.getUnlocalizedName());
	    }
    
   **/
	}
