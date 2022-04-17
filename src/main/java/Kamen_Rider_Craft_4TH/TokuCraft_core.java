package Kamen_Rider_Craft_4TH;

import Kamen_Rider_Craft_4TH.biome.riderBiomes;
import Kamen_Rider_Craft_4TH.potion.PotionCore;
import Kamen_Rider_Craft_4TH.util.Refercence;
import Kamen_Rider_Craft_4TH.world.gen.WorldGenCustomStructures;
import Kamen_Rider_Craft_4TH.world.gen.modDimensionWorldGen;
import net.minecraft.block.Block;
import net.minecraft.entity.IMerchant;
import net.minecraft.entity.passive.EntityVillager.ITradeList;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.village.MerchantRecipe;
import net.minecraft.village.MerchantRecipeList;
import net.minecraft.world.WorldType;
import net.minecraft.world.storage.loot.LootEntry;
import net.minecraft.world.storage.loot.LootEntryItem;
import net.minecraft.world.storage.loot.LootEntryTable;
import net.minecraft.world.storage.loot.LootPool;
import net.minecraft.world.storage.loot.LootTableList;
import net.minecraft.world.storage.loot.conditions.LootCondition;
import net.minecraft.world.storage.loot.functions.LootFunction;
import net.minecraftforge.common.DimensionManager;
import net.minecraftforge.event.LootTableLoadEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


@Mod(modid = Refercence.MODID, name = Refercence.NAME, version = Refercence.VERSION)
public class TokuCraft_core {
	public static final List<Item> ITEMS = new ArrayList<Item>();
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	@Instance
	public static TokuCraft_core instance;

	@SidedProxy(clientSide = Refercence.CLIENT_PROXY_CLASS, serverSide = Refercence.COMMON_PROXY_CLASS)
	public static CommonProxyRider proxy;

	@EventHandler
	public static void preInit(FMLPreInitializationEvent event) {
		RiderBlocks.init();
		ShowaRiderItems.init();
		RiderItems.init();
		ReiwaRiderItems.init();
		kikaiderItems.init();
		DimensionManager.registerDimension(modDimensionWorldGen.HELHEIM_DIM_ID, modDimensionWorldGen.HELHEIM_DIM_TYPE);
		DimensionManager.registerDimension(modDimensionWorldGen.SANDSOFTIME_DIM_ID, modDimensionWorldGen.SANDSOFTIME_DIM_TYPE);
		DimensionManager.registerDimension(modDimensionWorldGen.NORTHERN_BASE_DIM_ID, modDimensionWorldGen.NORTHERN_BASE_DIM_TYPE);
		DimensionManager.registerDimension(modDimensionWorldGen.RABBIT_HUTCH_DIM_ID, modDimensionWorldGen.RABBIT_HUTCH_DIM_TYPE);
	}

	@EventHandler
	public static void init(FMLInitializationEvent event) {
		//GameRegistry.registerWorldGenerator()
		proxy.preInit();
		riderBiomes.initBiomeManagerAndDictionary();
		PotionCore.init(event);
	}

	@EventHandler
	public static void postInit(FMLPostInitializationEvent event) {
		
	}
	
	

	@EventHandler
	public void load(FMLInitializationEvent event) {
		proxy.registerRenderThings();
		GameRegistry.registerWorldGenerator(new oreworldgen(), 0);
		GameRegistry.registerWorldGenerator(new WorldGenCustomStructures(), 0);
		CraftingRecipeForRider.Crafrting();
		mobsCore.Addmob();
	}
	
	
	
}


