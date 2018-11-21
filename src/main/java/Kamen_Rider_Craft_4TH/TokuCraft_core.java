package Kamen_Rider_Craft_4TH;

import Kamen_Rider_Craft_4TH.util.Refercence;
import Kamen_Rider_Craft_4TH.world.gen.WorldGenCustomStructures;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

import java.util.ArrayList;
import java.util.List;


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
		RiderItems.init();
	}

	@EventHandler
	public static void init(FMLInitializationEvent event) {
		proxy.preInit();
	}

	@EventHandler
	public static void postInit(FMLPostInitializationEvent event) {}

	@EventHandler
	public void load(FMLInitializationEvent event) {
		proxy.registerRenderThings();
		GameRegistry.registerWorldGenerator(new oreworldgen(), 0);
		GameRegistry.registerWorldGenerator(new WorldGenCustomStructures(), 0);
		CraftingRecipeForRider.Crafrting();
		mobsCore.Addmob();
	}

}


