package Kamen_Rider_Craft_4TH.item.fourze;


import javax.annotation.Nullable;

import Kamen_Rider_Craft_4TH.RiderItems;
import Kamen_Rider_Craft_4TH.TokuCraft_core;
import Kamen_Rider_Craft_4TH.util.IHasModel;
import Kamen_Rider_Craft_4TH.world.gen.NorthernBaseTeleporter;
import Kamen_Rider_Craft_4TH.world.gen.RabbitHutchTeleporter;
import Kamen_Rider_Craft_4TH.world.gen.SandsOfTimeTeleporter;
import Kamen_Rider_Craft_4TH.world.gen.modDimensionWorldGen;

import java.util.List;
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

public class item_gate_switch extends ItemBow  implements IHasModel
{



	public item_gate_switch(String name)
	{
		super();
		this.setMaxDamage(20);
		this.maxStackSize = 1;
		setTranslationKey(name);
		setRegistryName(name);
		TokuCraft_core.ITEMS.add(this);


	}

	/**
	 * returns the action that specifies what animation to play when the items is being used
	 */
	public EnumAction getItemUseAction(ItemStack par1ItemStack)
	{
		return EnumAction.BOW;
	}

	@Override
	public void registerModels() {
		TokuCraft_core.proxy.registerItemRender(this,0,"inventory");
	}


	/**
	 * allows items to add custom lines of information to the mouseover description
	 */
	@Override
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack stack, @Nullable World worldIn, List<String> tooltip, ITooltipFlag flagIn)
	{
		tooltip.add(TextFormatting.GOLD + "Charge : "+ get_ammo(stack)+"%");
	}

	public static int get_ammo(ItemStack itemstack)
	{
		return itemstack.hasTagCompound() ? itemstack.getTagCompound().getInteger("Ammo") : 0;
	}

	public static void set_ammo(ItemStack itemstack, int flag)
	{
		if (!itemstack.hasTagCompound())
		{
			itemstack.setTagCompound(new NBTTagCompound());
		}
		itemstack.getTagCompound().setInteger("Ammo", flag);
	}

	public static int get_pos(ItemStack itemstack,String XYZ)
	{
		return itemstack.hasTagCompound() ? itemstack.getTagCompound().getInteger("POS"+XYZ) : 0;
	}

	public static void set_pos(ItemStack itemstack, double pos, String XYZ)
	{
		if (!itemstack.hasTagCompound())
		{
			itemstack.setTagCompound(new NBTTagCompound());
		}
		itemstack.getTagCompound().setDouble("POS"+XYZ, pos);
	}


	public void onUpdate(ItemStack par1ItemStack, World par2World, Entity par3Entity, int par4, boolean par5) {

		if (this.get_ammo(par1ItemStack)<100){
			this.set_ammo(par1ItemStack, this.get_ammo(par1ItemStack)+1);
		}
	}

	@SideOnly(Side.CLIENT)
	public boolean hasEffect(ItemStack par1ItemStack)
	{
		if (this.get_ammo(par1ItemStack)==100){
			return true;
		}else{
			return !true;
		}
	}


	/**
	 * Called when the player stops using an Item (stops holding the right mouse button).
	 */
	public void onPlayerStoppedUsing(ItemStack stack, World worldIn, EntityLivingBase entityLiving, int timeLeft)
	{
		if (entityLiving instanceof EntityPlayer)
		{
			EntityPlayer playerIn = (EntityPlayer)entityLiving;

			if (!worldIn.isRemote)
			{

				if (get_ammo(stack)==100){


					if (!entityLiving.isRiding() && !entityLiving.isBeingRidden() && entityLiving.isNonBoss())
					{
					}
					if (entityLiving.dimension==modDimensionWorldGen.RABBIT_HUTCH_DIM_ID){
						if (get_pos(stack,"SET")==1){


							entityLiving.setPosition(get_pos(stack,"X"),get_pos(stack,"Y"),get_pos(stack,"Z"));
							entityLiving.changeDimension(0, new RabbitHutchTeleporter());;	
						}else{
							entityLiving.setPosition(worldIn.getSpawnPoint().getX(),calculateGenerationHeightAir(worldIn, worldIn.getSpawnPoint().getX(), worldIn.getSpawnPoint().getZ()),worldIn.getSpawnPoint().getZ());
							entityLiving.changeDimension(0, new RabbitHutchTeleporter());
						}
						set_ammo(stack,0);

					}else{

						set_pos(stack,1,"SET");
						set_pos(stack,entityLiving.posX,"X");
						set_pos(stack,entityLiving.posY,"Y");
						set_pos(stack,entityLiving.posZ,"Z");

						
						Chunk chunk = worldIn.getChunk(new BlockPos(worldIn.getSpawnPoint().getX(),worldIn.getSpawnPoint().getY(),worldIn.getSpawnPoint().getZ()));
						
					
						entityLiving.setPosition((chunk.x*16)+7,82,(chunk.z*16)+4);
						entityLiving.changeDimension(modDimensionWorldGen.RABBIT_HUTCH_DIM_ID, new RabbitHutchTeleporter());
						set_ammo(stack,0);

					}

				}
			}
			playerIn.addStat(StatList.getObjectUseStats(this));
		}
	}


	private static int calculateGenerationHeightAir(World world, int x, int z) {
		int y = world.getHeight();
		boolean foundGround = false;
			
		while(!foundGround && y-- >= 0) {
			Block block = world.getBlockState(new BlockPos(x,y,z)).getBlock();
			
			foundGround = block != Blocks.AIR;
		}

		return y;
	}


	/**
	 * Called when the equipped item is right clicked.
	 */
	public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn)
	{
		ItemStack itemstack = playerIn.getHeldItem(handIn);
		boolean flag = true;

		ActionResult<ItemStack> ret = net.minecraftforge.event.ForgeEventFactory.onArrowNock(itemstack, worldIn, playerIn, handIn, flag);
		if (ret != null) return ret;

		if (!playerIn.capabilities.isCreativeMode && !flag)
		{
			return flag ? new ActionResult(EnumActionResult.PASS, itemstack) : new ActionResult(EnumActionResult.FAIL, itemstack);
		}
		else
		{
			playerIn.setActiveHand(handIn);
			return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemstack);
		}
	}

	public boolean getIsRepairable(ItemStack toRepair, ItemStack repair) 
	{
		return RiderItems.astroswitch== repair.getItem() ? true : super.getIsRepairable(toRepair, repair);
	}
}