package KamenRiderCraftV3.item.gaim;

import KamenRiderCraftV3.RiderItems;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
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
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBow;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.BlockPos;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.ArrowNockEvent;

public class fake_donguri extends ItemBow
{


	
    public fake_donguri(ToolMaterial par2EnumToolMaterial)
    {
        super();
        this.maxStackSize = 1;
        this.setMaxDamage(par2EnumToolMaterial.getMaxUses());

        
    }
    
    /**
     * returns the action that specifies what animation to play when the items is being used
     */
    public EnumAction getItemUseAction(ItemStack par1ItemStack)
    {
        return EnumAction.BOW;
    }

	
    
    public void onPlayerStoppedUsing(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer, int par4)
    {
        
    	if (!par2World.isRemote)
        {
    		if (par3EntityPlayer.getEquipmentInSlot(1).getItem()  instanceof item_Gaimdriver){

    		
			par3EntityPlayer.addChatComponentMessage(new ChatComponentText(EnumChatFormatting.GOLD +"NINCOMPOOP! Never Give Up!"));
			par2World.setBlockState(new BlockPos(par3EntityPlayer.posX,par3EntityPlayer.posY+5, par3EntityPlayer.posZ), Blocks.anvil.getDefaultState());
			if (!par3EntityPlayer.capabilities.isCreativeMode){
    		par3EntityPlayer.inventory.consumeInventoryItem(RiderItems.fake_donguri_lockseed);
			}
        }
    		}
    }

    /**
     * Called whenever this item is equipped and the right mouse button is pressed. Args: itemStack, world, entityPlayer
     */
    public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
    {
    	
 
        ArrowNockEvent event = new ArrowNockEvent(par3EntityPlayer, par1ItemStack);
        MinecraftForge.EVENT_BUS.post(event);

        if (event.isCanceled())
        {
        	
            return event.result;
        }
        
            par3EntityPlayer.setItemInUse(par1ItemStack, this.getMaxItemUseDuration(par1ItemStack));
    	

        return par1ItemStack;
    }


    
}