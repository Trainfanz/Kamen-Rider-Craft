package Kamen_Rider_Craft_4TH.item.wizard;


import javax.annotation.Nullable;

import com.google.common.collect.Lists;

import Kamen_Rider_Craft_4TH.ReiwaRiderItems;
import Kamen_Rider_Craft_4TH.RiderItems;
import Kamen_Rider_Craft_4TH.TokuCraft_core;
import Kamen_Rider_Craft_4TH.util.IHasModel;
import Kamen_Rider_Craft_4TH.world.gen.NorthernBaseTeleporter;
import Kamen_Rider_Craft_4TH.world.gen.SandsOfTimeTeleporter;
import Kamen_Rider_Craft_4TH.world.gen.modDimensionWorldGen;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.util.ITooltipFlag;
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
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArrow;
import net.minecraft.item.ItemBow;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.potion.PotionEffect;
import net.minecraft.stats.StatList;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import net.minecraft.world.chunk.Chunk;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.ArrowNockEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class item_unknown_wizard_ring extends Item  implements IHasModel
{

	public static final List<Item> amber_wizard_ring = new ArrayList<Item>();
	public static final List<Item> red_wizard_ring = new ArrayList<Item>();
	public static final List<Item> blue_wizard_ring = new ArrayList<Item>();
	public static final List<Item> yellow_wizard_ring = new ArrayList<Item>();
	public static final List<Item> green_wizard_ring = new ArrayList<Item>();
	public static final List<Item> cyan_wizard_ring = new ArrayList<Item>();
	public static final List<Item> violet_wizard_ring = new ArrayList<Item>();
	public static final List<Item> black_wizard_ring = new ArrayList<Item>();

	public item_unknown_wizard_ring(String name)
	{
		super();
		this.setMaxDamage(20);
		setTranslationKey(name);
		setRegistryName(name);
		TokuCraft_core.ITEMS.add(this);


	}

		@Override
	public void registerModels() {
		TokuCraft_core.proxy.registerItemRender(this,0,"inventory");
	}

		private Item getRing(Item num) {
			Random generator = new Random();
			if (num==RiderItems.unknown_amber_ring){
				int rand = generator.nextInt(amber_wizard_ring.size());
				return amber_wizard_ring.get(rand);
			} else if (num==RiderItems.unknown_black_ring){
				int rand = generator.nextInt(black_wizard_ring.size());
				return black_wizard_ring.get(rand);
			} else if (num==RiderItems.unknown_blue_ring){
				int rand = generator.nextInt(blue_wizard_ring.size());
				return blue_wizard_ring.get(rand);
			} else if (num==RiderItems.unknown_cyan_ring){
				int rand = generator.nextInt(cyan_wizard_ring.size());
				return cyan_wizard_ring.get(rand);
			} else if (num==RiderItems.unknown_green_ring){
				int rand = generator.nextInt(green_wizard_ring.size());
				return green_wizard_ring.get(rand);
			} else if (num==RiderItems.unknown_red_ring){
				int rand = generator.nextInt(red_wizard_ring.size());
				return red_wizard_ring.get(rand);
			} else if (num==RiderItems.unknown_violet_ring){
				int rand = generator.nextInt(violet_wizard_ring.size());
				return violet_wizard_ring.get(rand);
			} else if (num==RiderItems.unknown_yellow_ring){
				int rand = generator.nextInt(yellow_wizard_ring.size());
				return yellow_wizard_ring.get(rand);
			} else {
				int rand = generator.nextInt(amber_wizard_ring.size());
				return amber_wizard_ring.get(rand);
			} 
		}


	public void onUpdate(ItemStack par1ItemStack, World par2World, Entity par3Entity, int par4, boolean par5) {

		
		if (par3Entity instanceof  EntityPlayer){
			EntityPlayer player = ((EntityPlayer)par3Entity);
			Item ring = getRing(par1ItemStack.getItem());
			if (! par2World.isRemote)
			{
			player.dropItem(ring,1);

			par1ItemStack.shrink(1);
			}	
	}
		}



}