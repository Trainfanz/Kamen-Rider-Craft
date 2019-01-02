package KamenRiderCraftV3.item.ooo;



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

public class Item_madagburyu extends ItemSword
{
    private float weaponDamage;

    public float ENT;
    private final ToolMaterial toolMaterial;



    public Item_madagburyu(ToolMaterial par2EnumToolMaterial)
    {
    	
        super(par2EnumToolMaterial);
        this.toolMaterial = par2EnumToolMaterial;
        this.maxStackSize = 1;
        this.setMaxDamage(par2EnumToolMaterial.getMaxUses());
        this.setCreativeTab(CreativeTabs.tabCombat);
        this.weaponDamage = 4.0F + par2EnumToolMaterial.getDamageVsEntity();
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

            Vec3 look = par3EntityPlayer.getLookVec();
            EntityWitherSkull WitherSkull = new EntityWitherSkull(par2World, par3EntityPlayer, 1, 1, 1);
            WitherSkull.setPosition(
            par3EntityPlayer.posX + look.xCoord * 1.6,
            par3EntityPlayer.posY + 1,
            par3EntityPlayer.posZ + look.zCoord * 1.6);
            WitherSkull.accelerationX = look.xCoord * 0.1;
            WitherSkull.accelerationY = look.yCoord * 0.1;
            WitherSkull.accelerationZ = look.zCoord * 0.1;
            par2World.spawnEntityInWorld(WitherSkull);
            par1ItemStack.damageItem(2, par3EntityPlayer);
        	if (!par3EntityPlayer.capabilities.isCreativeMode){
        		par3EntityPlayer.inventory.consumeInventoryItem(RiderItems.energy);
        				
        	}
        	    
            set_gun(par1ItemStack, 0);
        }
    }

    /**
     * Called whenever this item is equipped and the right mouse button is pressed. Args: itemStack, world, entityPlayer
     */
    public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
    {
    	
    	if ( par3EntityPlayer.capabilities.isCreativeMode ||par3EntityPlayer.inventory.hasItem(RiderItems.energy)){
    	set_gun(par1ItemStack, 1);
        ArrowNockEvent event = new ArrowNockEvent(par3EntityPlayer, par1ItemStack);
        MinecraftForge.EVENT_BUS.post(event);

        if (event.isCanceled())
        {
        	 set_gun(par1ItemStack, 0);
            return event.result;
        }
        
            par3EntityPlayer.setItemInUse(par1ItemStack, this.getMaxItemUseDuration(par1ItemStack));
    	}

        return par1ItemStack;
    }

    @Override
	public ModelResourceLocation getModel(ItemStack item, EntityPlayer playerIn, int useRemaining){


		ModelResourceLocation modelresourcelocation = new ModelResourceLocation("kamenridercraftv3"+":"+item.getUnlocalizedName().substring(5),"inventory");
		
		int is_OP = this.get_gun(item);
		
		if(is_OP==0){modelresourcelocation = new ModelResourceLocation("kamenridercraftv3"+":"+item.getUnlocalizedName().substring(5),"inventory");
		}
		else{modelresourcelocation = new ModelResourceLocation("kamenridercraftv3"+":"+RiderItems.medagaburyu_gun.getUnlocalizedName().substring(5),"inventory");
		
		}
	

		return modelresourcelocation;
	}
    
}