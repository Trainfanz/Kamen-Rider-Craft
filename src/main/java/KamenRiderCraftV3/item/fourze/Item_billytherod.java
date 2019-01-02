package KamenRiderCraftV3.item.fourze;


import KamenRiderCraftV3.item.ooo.item_OOOdriver;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.ArrowNockEvent;

public class Item_billytherod extends ItemSword
{
    private float weaponDamage;

    public float ENT;
    private final ToolMaterial toolMaterial;

    public Item_billytherod(ToolMaterial par2EnumToolMaterial)
    {
    	
        super(par2EnumToolMaterial);
        this.toolMaterial = par2EnumToolMaterial;
        this.maxStackSize = 1;
        this.setMaxDamage(par2EnumToolMaterial.getMaxUses());
        this.setCreativeTab(CreativeTabs.tabCombat);
        this.weaponDamage = 4.0F + par2EnumToolMaterial.getDamageVsEntity();
    }
    
    
    public void onUpdate(ItemStack par1ItemStack, World par2World, Entity par3Entity, int par4, boolean par5) {
    	
    
    	EntityPlayer Player = (EntityPlayer) par3Entity;
		ItemStack item = Player.getCurrentEquippedItem();
 
    	if (par1ItemStack == item){
    	par3Entity.fallDistance=0;
    	if(item_OOOdriver.get_eftTime(par1ItemStack)<100){

			item_OOOdriver.set_eftTime(par1ItemStack,item_OOOdriver.get_eftTime(par1ItemStack)+1);
			
			
    	}
		}
    	
    }
    
    /**
     * Called whenever this item is equipped and the right mouse button is pressed. Args: itemStack, world, entityPlayer
     */
    public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
    {
    	if(item_OOOdriver.get_eftTime(par1ItemStack)==100){
    		Vec3 look = par3EntityPlayer.getLookVec();
			par2World.spawnEntityInWorld(new EntityLightningBolt(par2World,  par3EntityPlayer.posX + look.xCoord * 8,  -1 + par3EntityPlayer.posY + look.yCoord * 5,  par3EntityPlayer.posZ + look.zCoord * 8));

			par1ItemStack.damageItem(2, par3EntityPlayer);
    			item_OOOdriver.set_eftTime(par1ItemStack,0);
    		
			
    	}
    	
        return par1ItemStack;
    }
    
}