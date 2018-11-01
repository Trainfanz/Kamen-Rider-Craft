package Kamen_Rider_Craft_4TH;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.google.common.collect.Maps;

import Kamen_Rider_Craft_4TH.util.Refercence;
import Kamen_Rider_Craft_4TH.world.gen.WorldGenCustomStructures;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EntityList.EntityEggInfo;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.DimensionManager;
import net.minecraftforge.common.BiomeDictionary.Type;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;

import net.minecraft.client.renderer.color.IItemColor;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IStringSerializable;
import net.minecraft.world.biome.Biome;


@Mod(modid = Refercence.MODID, name = Refercence.NAME, version = Refercence.VERSION)
public class TokuCraft_core
{

	public static final List <Item>ITEMS= new ArrayList<Item>();
	public static final List <Block>BLOCKS= new ArrayList<Block>();

	@Instance
	public static TokuCraft_core instance;


	@SidedProxy(clientSide = Refercence.CLIENT_PROXY_CLASS, serverSide = Refercence.COMMON_PROXY_CLASS)
	public static CommonProxyRider proxy;

	@EventHandler
	public static void preInit(FMLPreInitializationEvent event)
	{
		RiderItems.init();

		

	}

	@EventHandler
	public static void init(FMLInitializationEvent event)
	{

	}

	@EventHandler
	public static void postInit(FMLPostInitializationEvent event)
	{
		

	}


	@EventHandler
	public void load(FMLInitializationEvent event)
	{
		proxy.registerRenderThings();
		GameRegistry.registerWorldGenerator(new oreworldgen(), 0);
		GameRegistry.registerWorldGenerator(new WorldGenCustomStructures(), 0);
		CraftingRecipeForRider.Crafrting();
		mobsCore.Addmob();
	}

}


