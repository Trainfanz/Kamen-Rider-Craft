package KamenRiderCraftV3.item.deno;


import KamenRiderCraftV3.KamenRiderCraftV3_core;
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
import net.minecraft.item.EnumAction;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.world.World;

public class Itemdenkamen_sword extends ItemSword
{
	private float weaponDamage;

	public float ENT;
	private final ToolMaterial toolMaterial;

	public Itemdenkamen_sword(ToolMaterial par2EnumToolMaterial)
	{

		super(par2EnumToolMaterial);
		this.toolMaterial = par2EnumToolMaterial;
		this.maxStackSize = 1;
		this.setMaxDamage(par2EnumToolMaterial.getMaxUses());
		this.setCreativeTab(CreativeTabs.tabCombat);
		this.weaponDamage = 4.0F + par2EnumToolMaterial.getDamageVsEntity();
	}


	/**
	 * Called whenever this item is equipped and the right mouse button is pressed. Args: itemStack, world, entityPlayer
	 */
	public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
	{



		if (par3EntityPlayer.getEquipmentInSlot(1)!= null){

			if (par3EntityPlayer.getEquipmentInSlot(1).getItem() == RiderItems.den_odriver){
				if (par3EntityPlayer.isSneaking()){

					if (par3EntityPlayer.inventory.hasItem(RiderItems.ktaros)&par3EntityPlayer.inventory.hasItem(RiderItems.rider_ticket)){

							item_den_odriver.set_core(par3EntityPlayer.getEquipmentInSlot(1), 8);	
					


				
						
					}

		
				
				}
			}
		}



		return par1ItemStack;
	}



}