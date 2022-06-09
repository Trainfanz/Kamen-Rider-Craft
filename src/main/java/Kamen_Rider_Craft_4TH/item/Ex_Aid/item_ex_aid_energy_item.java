package Kamen_Rider_Craft_4TH.item.Ex_Aid;


import javax.annotation.Nullable;

import com.google.common.collect.Lists;

import Kamen_Rider_Craft_4TH.RiderItems;
import Kamen_Rider_Craft_4TH.TokuCraft_core;
import Kamen_Rider_Craft_4TH.util.IHasModel;
import Kamen_Rider_Craft_4TH.world.gen.NorthernBaseTeleporter;
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

public class item_ex_aid_energy_item extends Item  implements IHasModel
{


	private List<PotionEffect> potionEffectList;

	public item_ex_aid_energy_item(String name,PotionEffect... effects)
	{
		super();
		this.setMaxDamage(20);
		setTranslationKey(name);
		setRegistryName(name);
		TokuCraft_core.ITEMS.add(this);
		potionEffectList = Lists.newArrayList(effects);


	}

		@Override
	public void registerModels() {
		TokuCraft_core.proxy.registerItemRender(this,0,"inventory");
	}

		public List<PotionEffect> getPotionEffectList() {
			return potionEffectList;
		}


	public void onUpdate(ItemStack par1ItemStack, World par2World, Entity par3Entity, int par4, boolean par5) {

		
		if (par3Entity instanceof  EntityPlayer){
			EntityPlayer player = ((EntityPlayer)par3Entity);
		List<PotionEffect> potionEffectList = getPotionEffectList();
		for (int i = 0; i < potionEffectList.size(); i++)
		{
			player.addPotionEffect(new PotionEffect(potionEffectList.get(i).getPotion(),potionEffectList.get(i).getDuration(),potionEffectList.get(i).getAmplifier(),true,false));
		}
		
		par1ItemStack.shrink(1);		
	}
		}



}