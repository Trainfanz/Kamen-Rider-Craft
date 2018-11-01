package Kamen_Rider_Craft_4TH.item;



import Kamen_Rider_Craft_4TH.TokuCraft_core;
import Kamen_Rider_Craft_4TH.util.IHasModel;
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
import net.minecraft.item.ItemShield;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.util.text.translation.I18n;
import net.minecraft.world.World;

public class ItemBaseShield extends ItemShield implements IHasModel
{
    public ItemBaseShield(String name)
    {
    	
        super();
        this.maxStackSize = 1;
        setUnlocalizedName(name);
        setRegistryName(name);
        TokuCraft_core.ITEMS.add(this);
    }
    
    public String getItemStackDisplayName(ItemStack stack)
    {
            return I18n.translateToLocal(getUnlocalizedName() + ".name");
    }
    
	@Override
	public void registerModels() {
		TokuCraft_core.proxy.registerItemRender(this,0,"inventory");
	}
    
}