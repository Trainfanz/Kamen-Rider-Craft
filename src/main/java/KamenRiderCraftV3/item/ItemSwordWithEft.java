package KamenRiderCraftV3.item;



import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemSwordWithEft extends ItemSword
{
    private float weaponDamage;

    public float ENT;
    private final ToolMaterial toolMaterial;

	private PotionEffect EFT;

    public ItemSwordWithEft(ToolMaterial par2EnumToolMaterial,PotionEffect eft)
    {
    	
        super(par2EnumToolMaterial);
        this.toolMaterial = par2EnumToolMaterial;
        this.maxStackSize = 1;
        this.setMaxDamage(par2EnumToolMaterial.getMaxUses());
        this.setCreativeTab(CreativeTabs.tabCombat);
        this.weaponDamage = 4.0F + par2EnumToolMaterial.getDamageVsEntity();
        EFT=eft;
    }
    
    public void onUpdate(ItemStack par1ItemStack, World par2World, Entity par3Entity, int par4, boolean par5) {



		EntityPlayer Player = (EntityPlayer) par3Entity;
		ItemStack item = Player.getCurrentEquippedItem();

		if (par1ItemStack == item){

				Player.addPotionEffect(EFT);			
		}

	}
    
}