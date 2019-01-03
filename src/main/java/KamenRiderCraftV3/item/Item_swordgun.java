package KamenRiderCraftV3.item;



import KamenRiderCraftV3.RiderItems;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.entity.projectile.EntitySmallFireball;
import net.minecraft.entity.projectile.EntityWitherSkull;
import net.minecraft.init.Items;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.nbt.NBTTagCompound;

import net.minecraft.util.Vec3;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.ArrowNockEvent;

public class Item_swordgun extends ItemSword
{
    private float weaponDamage;

    public float ENT;
    private final ToolMaterial toolMaterial;


	private Item ORE;
	private Item Imcharge;
    public Item_swordgun(ToolMaterial par2EnumToolMaterial,Item ore, Item gun)
    {
    	
        super(par2EnumToolMaterial);
        this.toolMaterial = par2EnumToolMaterial;
        this.maxStackSize = 1;
        this.setMaxDamage(par2EnumToolMaterial.getMaxUses());
        this.setCreativeTab(CreativeTabs.tabCombat);
        this.weaponDamage = 4.0F + par2EnumToolMaterial.getDamageVsEntity();
        ORE = ore;
        Imcharge=gun;
    }
    
    /**
     * returns the action that specifies what animation to play when the items is being used
     */
    public EnumAction getItemUseAction(ItemStack par1ItemStack)
    {
        return EnumAction.BOW;
    }

	public static int get_gun(ItemStack itemstack)
	{
		return itemstack.hasTagCompound() ? itemstack.getTagCompound().getInteger("gun") : 0;
	}

	public static void set_gun(ItemStack itemstack, int flag)
	{
		if (!itemstack.hasTagCompound())
		{
			itemstack.setTagCompound(new NBTTagCompound());
		}
		itemstack.getTagCompound().setInteger("gun", flag);
	}
    
    public void onPlayerStoppedUsing(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer, int par4)
    {
        
    	if (!par2World.isRemote)
        {
    		if ( par3EntityPlayer.capabilities.isCreativeMode ||par3EntityPlayer.inventory.hasItem(ORE)){
    	    	

  			  Vec3 look = par3EntityPlayer.getLookVec();
                EntityArrow fireball = new EntityArrow(par2World, par3EntityPlayer, 5);
                fireball.canBePickedUp=0;

                par2World.spawnEntityInWorld(fireball);
          if (!par3EntityPlayer.capabilities.isCreativeMode){
      		par3EntityPlayer.inventory.consumeInventoryItem(ORE);
      				
      	}
  		}
    		 set_gun(par1ItemStack, 0);
        }
    }

    /**
     * Called whenever this item is equipped and the right mouse button is pressed. Args: itemStack, world, entityPlayer
     */
    public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
    {
    	
    	set_gun(par1ItemStack, 1);
        ArrowNockEvent event = new ArrowNockEvent(par3EntityPlayer, par1ItemStack);
        MinecraftForge.EVENT_BUS.post(event);

        if (event.isCanceled())
        {
        	 set_gun(par1ItemStack, 0);
            return event.result;
        }
        
            par3EntityPlayer.setItemInUse(par1ItemStack, this.getMaxItemUseDuration(par1ItemStack));
    	

        return par1ItemStack;
    }

    @Override
   	public ModelResourceLocation getModel(ItemStack item, EntityPlayer playerIn, int useRemaining){


   		ModelResourceLocation modelresourcelocation = new ModelResourceLocation("kamenridercraftv3"+":"+item.getUnlocalizedName().substring(5),"inventory");
   		
   		int is_OP = this.get_gun(item);
   		
   		if(is_OP==0){modelresourcelocation = new ModelResourceLocation("kamenridercraftv3"+":"+item.getUnlocalizedName().substring(5),"inventory");
   		}
   		else{modelresourcelocation = new ModelResourceLocation("kamenridercraftv3"+":"+ Imcharge.getUnlocalizedName().substring(5),"inventory");
   		
   		}
   	

   		return modelresourcelocation;
   	}
   /**
   
    @Override
	public IIcon getIcon(ItemStack stack, int renderPass){
    	
    	if (get_gun(stack)==0){
		return itemIcon;
    	}else{
    		return itemIcon2; 
    	}
    }
    **/
    
}