package KamenRiderCraftV3;



import KamenRiderCraftV3.biome.helheim_Biome;
import KamenRiderCraftV3.chunk.World_Provide_Helheim;
import KamenRiderCraftV3.item.Item_ore;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
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
import net.minecraft.world.biome.BiomeGenBase;
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



@Mod(modid = "KamenRiderCraftV3", name = "Kamen Rider Craft Expanded", version = "1.8.9")
public class KamenRiderCraftV3_core
{

	// The instance of your mod that Forge uses, in my case tutorial.
    @Instance("KamenRiderCraftV3")
    public static KamenRiderCraftV3_core instance;


	static int startEntityId = 300;

	@SidedProxy(clientSide = "KamenRiderCraftV3.ClientProxyRider", serverSide = "KamenRiderCraftV3.CommonProxyRider")
	public static CommonProxyRider proxy;

	@EventHandler
	public static void preInit(FMLPreInitializationEvent event)
	{
		
		
		RiderItems.init();
		RiderItems.register();
		
	}

	@EventHandler
	public static void init(FMLInitializationEvent event)
	{
	}

	@EventHandler
	public static void postInit(FMLPostInitializationEvent event)
	{
	}
	
	public static final int dimensionID_Helheim = 1555;
	public static BiomeGenBase Helheim;

	@EventHandler
	public void load(FMLInitializationEvent event)
	{
		proxy.registerRenderThings();

		//biomes
				Helheim = new helheim_Biome(55).setBiomeName("Helheim").setColor(0x000000).setTemperatureRainfall(2.0F, 0.0F);


				BiomeDictionary.registerBiomeType(Helheim, Type.FOREST);


				DimensionManager.registerProviderType(dimensionID_Helheim, World_Provide_Helheim.class, false);
				DimensionManager.registerDimension(dimensionID_Helheim, dimensionID_Helheim);

		GameRegistry.registerWorldGenerator(new oreworldgen(), 0);
		
		CraftingRecipeForRider.Crafrting();
		mobsCore.Addmob();
	}

}


