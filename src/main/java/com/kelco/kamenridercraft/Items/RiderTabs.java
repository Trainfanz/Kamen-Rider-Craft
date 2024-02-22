package com.kelco.kamenridercraft.Items;


import java.util.ArrayList;
import java.util.List;

import com.kelco.kamenridercraft.KamenRiderCraftCore;
import com.kelco.kamenridercraft.Blocks.Rider_Blocks;
import com.kelco.kamenridercraft.Entities.MobsCore;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class RiderTabs {
	
	public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB,
			KamenRiderCraftCore.MODID) ;
	
    public static RegistryObject<CreativeModeTab> RiderMiscTab = CREATIVE_MODE_TABS.register("krc_998_misc_tab", () -> 
    		CreativeModeTab.builder().icon(() -> new ItemStack(Modded_item_core.RIDER_CIRCUIT.get())).withBackgroundLocation(new ResourceLocation(KamenRiderCraftCore.MODID+":textures/gui/tab_iichigo_items.png"))
    		.title(Component.literal("Misc Rider Items")).build());
    public static RegistryObject<CreativeModeTab> RiderblockTab = CREATIVE_MODE_TABS.register("krc_999_blocks_tab", () -> 
			CreativeModeTab.builder().icon(() -> new ItemStack(Rider_Blocks.PURE_GAIA_MEMORY_BLOCK.get())).withBackgroundLocation(new ResourceLocation(KamenRiderCraftCore.MODID+":textures/gui/tab_iichigo_items.png"))
			.title(Component.literal("Rider Blocks")).build());
    public static RegistryObject<CreativeModeTab> IchigoTab = CREATIVE_MODE_TABS.register("krc_010_ichigo_tab", () -> 
			CreativeModeTab.builder().icon(() -> new ItemStack(Ichigo_Rider_Items.ICHIGOHELMET.get())).withBackgroundLocation(new ResourceLocation(KamenRiderCraftCore.MODID+":textures/gui/tab_iichigo_items.png"))
			.title(Component.literal("Ichigo Rider Items")).build());
    public static RegistryObject<CreativeModeTab> V3Tab = CREATIVE_MODE_TABS.register("krc_020_v3_tab", () -> 
			CreativeModeTab.builder().icon(() -> new ItemStack(Ichigo_Rider_Items.V3HELMET.get())).withBackgroundLocation(new ResourceLocation(KamenRiderCraftCore.MODID+":textures/gui/tab_iichigo_items.png"))
			.title(Component.literal("V3 Rider Items")).build());
    public static RegistryObject<CreativeModeTab> XTab = CREATIVE_MODE_TABS.register("krc_030_x_tab", () -> 
			CreativeModeTab.builder().icon(() -> new ItemStack(Ichigo_Rider_Items.XHELMET.get())).withBackgroundLocation(new ResourceLocation(KamenRiderCraftCore.MODID+":textures/gui/tab_iichigo_items.png"))
			.title(Component.literal("X Rider Items")).build());
    public static RegistryObject<CreativeModeTab> AMAZONTab = CREATIVE_MODE_TABS.register("krc_040_amazon_tab", () -> 
			CreativeModeTab.builder().icon(() -> new ItemStack(Ichigo_Rider_Items.AMAZONHELMET.get())).withBackgroundLocation(new ResourceLocation(KamenRiderCraftCore.MODID+":textures/gui/tab_iichigo_items.png"))
			.title(Component.literal("Amazon Rider Items")).build());
    public static RegistryObject<CreativeModeTab> STRONGERTab = CREATIVE_MODE_TABS.register("krc_050_stronger_tab", () -> 
			CreativeModeTab.builder().icon(() -> new ItemStack(Ichigo_Rider_Items.STRONGERHELMET.get())).withBackgroundLocation(new ResourceLocation(KamenRiderCraftCore.MODID+":textures/gui/tab_iichigo_items.png"))
			.title(Component.literal("Stronger Rider Items")).build());
    public static RegistryObject<CreativeModeTab> SKYRIDERTab = CREATIVE_MODE_TABS.register("krc_060_skyrider_tab", () -> 
			CreativeModeTab.builder().icon(() -> new ItemStack(Ichigo_Rider_Items.SKYRIDERHELMET.get())).withBackgroundLocation(new ResourceLocation(KamenRiderCraftCore.MODID+":textures/gui/tab_iichigo_items.png"))
			.title(Component.literal("Skyrider Rider Items")).build());
    public static RegistryObject<CreativeModeTab> SUPER1Tab = CREATIVE_MODE_TABS.register("krc_070_super_1_tab", () -> 
			CreativeModeTab.builder().icon(() -> new ItemStack(Ichigo_Rider_Items.SUPER1HELMET.get())).withBackgroundLocation(new ResourceLocation(KamenRiderCraftCore.MODID+":textures/gui/tab_iichigo_items.png"))
			.title(Component.literal("Super 1 Rider Items")).build());
    public static RegistryObject<CreativeModeTab> ZXTab = CREATIVE_MODE_TABS.register("krc_090_zx_tab", () -> 
			CreativeModeTab.builder().icon(() -> new ItemStack(Ichigo_Rider_Items.ZXHELMET.get())).withBackgroundLocation(new ResourceLocation(KamenRiderCraftCore.MODID+":textures/gui/tab_iichigo_items.png"))
			.title(Component.literal("ZX Rider Items")).build());
    public static RegistryObject<CreativeModeTab> BLACKTab = CREATIVE_MODE_TABS.register("krc_100_black_tab", () -> 
			CreativeModeTab.builder().icon(() -> new ItemStack(Ichigo_Rider_Items.BLACKHELMET.get())).withBackgroundLocation(new ResourceLocation(KamenRiderCraftCore.MODID+":textures/gui/tab_iichigo_items.png"))
			.title(Component.literal("Black Rider Items")).build());
    public static RegistryObject<CreativeModeTab> RXTab = CREATIVE_MODE_TABS.register("krc_101_rx_tab", () -> 
			CreativeModeTab.builder().icon(() -> new ItemStack(Ichigo_Rider_Items.RXHELMET.get())).withBackgroundLocation(new ResourceLocation(KamenRiderCraftCore.MODID+":textures/gui/tab_iichigo_items.png"))
			.title(Component.literal("RX Rider Items")).build());
    public static RegistryObject<CreativeModeTab> SHINTab = CREATIVE_MODE_TABS.register("krc_110_shin_tab", () -> 
			CreativeModeTab.builder().icon(() -> new ItemStack(Ichigo_Rider_Items.SHINHELMET.get())).withBackgroundLocation(new ResourceLocation(KamenRiderCraftCore.MODID+":textures/gui/tab_iichigo_items.png"))
			.title(Component.literal("Shin Rider Items")).build());
    public static RegistryObject<CreativeModeTab> JTab = CREATIVE_MODE_TABS.register("krc_120_j_tab", () -> 
			CreativeModeTab.builder().icon(() -> new ItemStack(Ichigo_Rider_Items.JHELMET.get())).withBackgroundLocation(new ResourceLocation(KamenRiderCraftCore.MODID+":textures/gui/tab_iichigo_items.png"))
			.title(Component.literal("J Rider Items")).build());
    public static RegistryObject<CreativeModeTab> ZOTab = CREATIVE_MODE_TABS.register("krc_130_zo_tab", () -> 
			CreativeModeTab.builder().icon(() -> new ItemStack(Ichigo_Rider_Items.ZOHELMET.get())).withBackgroundLocation(new ResourceLocation(KamenRiderCraftCore.MODID+":textures/gui/tab_iichigo_items.png"))
			.title(Component.literal("ZO Rider Items")).build());
    
    public static RegistryObject<CreativeModeTab> KuugaTab = CREATIVE_MODE_TABS.register("krc_210_kuuga_tab", () -> 
			CreativeModeTab.builder().icon(() -> new ItemStack(Kuuga_Rider_Items.KUUGAHELMET.get())).withBackgroundLocation(new ResourceLocation(KamenRiderCraftCore.MODID+":textures/gui/tab_kuuga_items.png"))
			.title(Component.literal("Kuuga Rider Items")).build());
    public static RegistryObject<CreativeModeTab> AgitoTab = CREATIVE_MODE_TABS.register("krc_220_agito_tab", () -> 
	CreativeModeTab.builder().icon(() -> new ItemStack(Agito_Rider_Items.AGITOHELMET.get())).withBackgroundLocation(new ResourceLocation(KamenRiderCraftCore.MODID+":textures/gui/tab_agito_items.png"))
			.title(Component.literal("Agito Rider Items")).build());
    public static RegistryObject<CreativeModeTab> RyukiTab = CREATIVE_MODE_TABS.register("krc_230_ryuki_tab", () -> 
	CreativeModeTab.builder().icon(() -> new ItemStack(Ryuki_Rider_Items.RYUKIHELMET.get())).withBackgroundLocation(new ResourceLocation(KamenRiderCraftCore.MODID+":textures/gui/tab_ryuki_items.png"))
			.title(Component.literal("Ryuki Rider Items")).build());
    public static RegistryObject<CreativeModeTab> FaizTab = CREATIVE_MODE_TABS.register("krc_240_faiz_tab", () -> 
 			CreativeModeTab.builder().icon(() -> new ItemStack(Faiz_Rider_Items.FAIZHELMET.get())).withBackgroundLocation(new ResourceLocation(KamenRiderCraftCore.MODID+":textures/gui/tab_faiz_items.png"))
 			.title(Component.literal("Faiz Rider Items")).build());
    public static RegistryObject<CreativeModeTab> BladeTab = CREATIVE_MODE_TABS.register("krc_250_blade_tab", () -> 
		CreativeModeTab.builder().icon(() -> new ItemStack(Blade_Rider_Items.BLADEHELMET.get())).withBackgroundLocation(new ResourceLocation(KamenRiderCraftCore.MODID+":textures/gui/tab_blade_items.png"))
		.title(Component.literal("Blade Rider Items")).build());
    public static RegistryObject<CreativeModeTab> KivaTab = CREATIVE_MODE_TABS.register("krc_290_kiva_tab", () -> 
		CreativeModeTab.builder().icon(() -> new ItemStack(Kiva_Rider_Items.KIVAHELMET.get())).withBackgroundLocation(new ResourceLocation(KamenRiderCraftCore.MODID+":textures/gui/tab_kiva_items.png"))
		.title(Component.literal("Kiva Rider Items")).build());
    public static RegistryObject<CreativeModeTab> WTab = CREATIVE_MODE_TABS.register("krc_310_w_tab", () -> 
			CreativeModeTab.builder().icon(() -> new ItemStack(W_Rider_Items.WHELMET.get())).withBackgroundLocation(new ResourceLocation(KamenRiderCraftCore.MODID+":textures/gui/tab_w_items.png"))
			.title(Component.literal("W Rider Items")).build());
    public static RegistryObject<CreativeModeTab> OOOTab = CREATIVE_MODE_TABS.register("krc_320_ooo_tab", () -> 
	CreativeModeTab.builder().icon(() -> new ItemStack(OOO_Rider_Items.OOOHELMET.get())).withBackgroundLocation(new ResourceLocation(KamenRiderCraftCore.MODID+":textures/gui/tab_ooo_items.png"))
	.title(Component.literal("OOO Rider Items")).build());

    public static RegistryObject<CreativeModeTab> EX_AIDTab = CREATIVE_MODE_TABS.register("krc_380_exaid_tab", () -> 
   	CreativeModeTab.builder().icon(() -> new ItemStack(Ex_Aid_Rider_Items.EX_AIDHELMET.get())).withBackgroundLocation(new ResourceLocation(KamenRiderCraftCore.MODID+":textures/gui/tab_ex_aid_items.png"))
   	.title(Component.literal("Ex-Aid Rider Items")).build());

    
    public static RegistryObject<CreativeModeTab> AMAZONSTab = CREATIVE_MODE_TABS.register("krc_041_amazons_tab", () -> 
			CreativeModeTab.builder().icon(() -> new ItemStack(Reboot_Rider_Items.AMAZONSHELMET.get())).withBackgroundLocation(new ResourceLocation(KamenRiderCraftCore.MODID+":textures/gui/tab_amazons_items.png"))
			.title(Component.literal("Amazons Rider Items")).build());
    public static RegistryObject<CreativeModeTab> BLACKSUNTab = CREATIVE_MODE_TABS.register("krc_102_black_sun_tab", () -> 
			CreativeModeTab.builder().icon(() -> new ItemStack(Reboot_Rider_Items.BLACKSUNHELMET.get())).withBackgroundLocation(new ResourceLocation(KamenRiderCraftCore.MODID+":textures/gui/tab_black_sun_items.png"))
			.title(Component.literal("Black Sun Rider Items")).build());
    
    public static List<Item> ICHIGO_TAB_ITEM= new ArrayList<Item>();
    public static List<Item> V3_TAB_ITEM= new ArrayList<Item>();
    public static List<Item> X_TAB_ITEM= new ArrayList<Item>();
    public static List<Item> AMAZON_TAB_ITEM= new ArrayList<Item>();
    public static List<Item> STRONGER_TAB_ITEM= new ArrayList<Item>();
    public static List<Item> SKYRIDER_TAB_ITEM= new ArrayList<Item>();
    public static List<Item> SUPER1_TAB_ITEM= new ArrayList<Item>();
    public static List<Item> ZX_TAB_ITEM= new ArrayList<Item>();
    public static List<Item> BLACK_TAB_ITEM= new ArrayList<Item>();
    public static List<Item> RX_TAB_ITEM= new ArrayList<Item>();
    public static List<Item> SHIN_TAB_ITEM= new ArrayList<Item>();
    public static List<Item> J_TAB_ITEM= new ArrayList<Item>();
    public static List<Item> ZO_TAB_ITEM= new ArrayList<Item>();
    
    public static List<Item> KUUGA_TAB_ITEM= new ArrayList<Item>();
    public static List<Item> AGITO_TAB_ITEM= new ArrayList<Item>();
    public static List<Item> RYUKI_TAB_ITEM= new ArrayList<Item>();
    public static List<Item> FAIZ_TAB_ITEM= new ArrayList<Item>();
    public static List<Item> BLADE_TAB_ITEM= new ArrayList<Item>();
    public static List<Item> KIVA_TAB_ITEM= new ArrayList<Item>();
    public static List<Item> W_TAB_ITEM= new ArrayList<Item>();
    public static List<Item> OOO_TAB_ITEM= new ArrayList<Item>();
    
    public static List<Item> EX_AID_TAB_ITEM= new ArrayList<Item>();
    
    public static List<Item> AMAZONS_TAB_ITEM= new ArrayList<Item>();
    public static List<Item> BLACK_SUN_TAB_ITEM= new ArrayList<Item>();
    
    public static List<Block> RIDER_BLOCK= new ArrayList<Block>();
    
    public static List<Item> Misc_TAB_ITEM= new ArrayList<Item>();
    
    public static void register(IEventBus eventBus) {
    	CREATIVE_MODE_TABS.register(eventBus);
    }
    
    public static void AddItemsToTabs(BuildCreativeModeTabContentsEvent event){

		if(event.getTab() == RiderTabs.IchigoTab.get()) {
			for (int i = 0; i < RiderTabs.ICHIGO_TAB_ITEM.size(); i++)
			{
				event.accept( RiderTabs.ICHIGO_TAB_ITEM.get(i));
			}

		}else if(event.getTab() == RiderTabs.V3Tab.get()) {
			for (int i = 0; i < RiderTabs.V3_TAB_ITEM.size(); i++)
			{
				event.accept( RiderTabs.V3_TAB_ITEM.get(i));
			}
		}else if(event.getTab() == RiderTabs.XTab.get()) {
			for (int i = 0; i < RiderTabs.X_TAB_ITEM.size(); i++)
			{
				event.accept( RiderTabs.X_TAB_ITEM.get(i));
			}

		}else if(event.getTab() == RiderTabs.AMAZONTab.get()) {
			for (int i = 0; i < RiderTabs.AMAZON_TAB_ITEM.size(); i++)
			{
				event.accept( RiderTabs.AMAZON_TAB_ITEM.get(i));
			}

		}else if(event.getTab() == RiderTabs.STRONGERTab.get()) {
			for (int i = 0; i < RiderTabs.STRONGER_TAB_ITEM.size(); i++)
			{
				event.accept( RiderTabs.STRONGER_TAB_ITEM.get(i));
			}

		}else if(event.getTab() == RiderTabs.SKYRIDERTab.get()) {
			for (int i = 0; i < RiderTabs.SKYRIDER_TAB_ITEM.size(); i++)
			{
				event.accept( RiderTabs.SKYRIDER_TAB_ITEM.get(i));
			}

		}else if(event.getTab() == RiderTabs.SUPER1Tab.get()) {
			for (int i = 0; i < RiderTabs.SUPER1_TAB_ITEM.size(); i++)
			{
				event.accept( RiderTabs.SUPER1_TAB_ITEM.get(i));
			}

		}else if(event.getTab() == RiderTabs.ZXTab.get()) {
			for (int i = 0; i < RiderTabs.ZX_TAB_ITEM.size(); i++)
			{
				event.accept( RiderTabs.ZX_TAB_ITEM.get(i));
			}
			
		}else if(event.getTab() == RiderTabs.BLACKTab.get()) {
			for (int i = 0; i < RiderTabs.BLACK_TAB_ITEM.size(); i++)
			{
				event.accept( RiderTabs.BLACK_TAB_ITEM.get(i));
			}
			
		}else if(event.getTab() == RiderTabs.RXTab.get()) {
			for (int i = 0; i < RiderTabs.RX_TAB_ITEM.size(); i++)
			{
				event.accept( RiderTabs.RX_TAB_ITEM.get(i));
			}
			
		}else if(event.getTab() == RiderTabs.SHINTab.get()) {
			for (int i = 0; i < RiderTabs.SHIN_TAB_ITEM.size(); i++)
			{
				event.accept( RiderTabs.SHIN_TAB_ITEM.get(i));
			}
			
		}else if(event.getTab() == RiderTabs.JTab.get()) {
			for (int i = 0; i < RiderTabs.J_TAB_ITEM.size(); i++)
			{
				event.accept( RiderTabs.J_TAB_ITEM.get(i));
			}

		}else if(event.getTab() == RiderTabs.ZOTab.get()) {
			for (int i = 0; i < RiderTabs.ZO_TAB_ITEM.size(); i++)
			{
				event.accept( RiderTabs.ZO_TAB_ITEM.get(i));
			}



		}
		
		
		else if(event.getTab() == RiderTabs.KuugaTab.get()) {
			for (int i = 0; i < RiderTabs.KUUGA_TAB_ITEM.size(); i++)
			{
				event.accept( RiderTabs.KUUGA_TAB_ITEM.get(i));
			}
		}else if(event.getTab() == RiderTabs.AgitoTab.get()) {
			for (int i = 0; i < RiderTabs.AGITO_TAB_ITEM.size(); i++)
			{
				event.accept( RiderTabs.AGITO_TAB_ITEM.get(i));
			}
		}else if(event.getTab() == RiderTabs.RyukiTab.get()) {
			for (int i = 0; i < RiderTabs.RYUKI_TAB_ITEM.size(); i++)
			{
				event.accept( RiderTabs.RYUKI_TAB_ITEM.get(i));
			}
		}else if(event.getTab() == RiderTabs.FaizTab.get()) {
			for (int i = 0; i < RiderTabs.FAIZ_TAB_ITEM.size(); i++)
			{
				event.accept( RiderTabs.FAIZ_TAB_ITEM.get(i));
			}
		}else if(event.getTab() == RiderTabs.BladeTab.get()) {
			for (int i = 0; i < RiderTabs.BLADE_TAB_ITEM.size(); i++)
			{
				event.accept( RiderTabs.BLADE_TAB_ITEM.get(i));
			}
		}else if(event.getTab() == RiderTabs.KivaTab.get()) {
			for (int i = 0; i < RiderTabs.KIVA_TAB_ITEM.size(); i++)
			{
				event.accept( RiderTabs.KIVA_TAB_ITEM.get(i));
			}
		}else if(event.getTab() == RiderTabs.WTab.get()) {
			for (int i = 0; i < RiderTabs.W_TAB_ITEM.size(); i++)
			{
				event.accept( RiderTabs.W_TAB_ITEM.get(i));
			}

		}else if(event.getTab() == RiderTabs.OOOTab.get()) {
			for (int i = 0; i < RiderTabs.OOO_TAB_ITEM.size(); i++)
			{
				event.accept( RiderTabs.OOO_TAB_ITEM.get(i));
			}

		}else if(event.getTab() == RiderTabs.EX_AIDTab.get()) {
			for (int i = 0; i < RiderTabs.EX_AID_TAB_ITEM.size(); i++)
			{
				event.accept( RiderTabs.EX_AID_TAB_ITEM.get(i));
			}

		}else if(event.getTab() == RiderTabs.AMAZONSTab.get()) {
			for (int i = 0; i < RiderTabs.AMAZONS_TAB_ITEM.size(); i++)
			{
				event.accept( RiderTabs.AMAZONS_TAB_ITEM.get(i));
			}

		}else if(event.getTab() == RiderTabs.BLACKSUNTab.get()) {
			for (int i = 0; i < RiderTabs.BLACK_SUN_TAB_ITEM.size(); i++)
			{
				event.accept( RiderTabs.BLACK_SUN_TAB_ITEM.get(i));
			}

		}
		else if(event.getTab() == RiderTabs.RiderblockTab.get()) {
			for (int i = 0; i < RiderTabs.RIDER_BLOCK.size(); i++)
			{
				event.accept( RiderTabs.RIDER_BLOCK.get(i));
			}

		}

		else if(event.getTab() == RiderTabs.RiderMiscTab.get()) {

			event.accept(MobsCore.SHOCKER_COMBATMAN_SPAWN_EGG);
			event.accept(MobsCore.SHOCKER_RIDER_SPAWN_EGG);
			
			event.accept(MobsCore.DESTRON_COMBATMAN_SPAWN_EGG);
			event.accept(MobsCore.GOD_WARFARE_AGENT_SPAWN_EGG);
			event.accept(MobsCore.RED_FOLLWER_SPAWN_EGG);
			event.accept(MobsCore.BLACK_SATAN_SOLDIER_SPAWN_EGG);
			event.accept(MobsCore.ARI_COMMANDO_SPAWN_EGG);	
			event.accept(MobsCore.DOGMA_FIGHTER_SPAWN_EGG);
			event.accept(MobsCore.COMBAT_ROID_SPAWN_EGG);
			event.accept(MobsCore.CHAP_SPAWN_EGG);
			event.accept(MobsCore.CHAP_GREY_SPAWN_EGG);
			event.accept(MobsCore.SHADOWMOON_SPAWN_EGG);
			
			event.accept(MobsCore.ZU_GUMUN_BA_SPAWN_EGG);

			event.accept(MobsCore.PANTHERAS_LUTEUS_SPAWN_EGG);
			event.accept(MobsCore.EL_OF_THE_WATER_SPAWN_EGG);
			event.accept(MobsCore.ANGUIS_MASCULUS_SPAWN_EGG);
			event.accept(MobsCore.ANOTHER_AGITO_SPAWN_EGG);
			
			event.accept(MobsCore.RIOTROOPER_SPAWN_EGG);
			event.accept(MobsCore.ORGA_SPAWN_EGG);
			
			event.accept(MobsCore.MASQUERADE_SPAWN_EGG);
			event.accept(MobsCore.CLAYDOLL_DOPANT_SPAWN_EGG);
			event.accept(MobsCore.TERROR_DOPANT_SPAWN_EGG);
			event.accept(MobsCore.NASCA_DOPANT_SPAWN_EGG);
			//event.accept(MobsCore.RED_NASCA_DOPANT_SPAWN_EGG);
			event.accept(MobsCore.SMILODON_DOPANT_SPAWN_EGG);
			event.accept(MobsCore.WEATHER_DOPANT_SPAWN_EGG);

			event.accept(MobsCore.FOUNDATION_X_MASQUERADE_SPAWN_EGG);
			event.accept(MobsCore.COMMANDER_DOPANT_SPAWN_EGG);
			event.accept(MobsCore.ETERNAL_SPAWN_EGG);
			
			event.accept(MobsCore.YUMMY_SPAWN_EGG);
			event.accept(MobsCore.KNIGHT_SOLDIER_SPAWN_EGG);
			event.accept(MobsCore.ANKH_SPAWN_EGG);
			event.accept(MobsCore.ANKH_COMPLETE_SPAWN_EGG);
			event.accept(MobsCore.ANKH_LOST_SPAWN_EGG);
			event.accept(MobsCore.UVA_SPAWN_EGG);
			event.accept(MobsCore.KAZARI_SPAWN_EGG);
			event.accept(MobsCore.MEZOOL_SPAWN_EGG);
			event.accept(MobsCore.GAMEL_SPAWN_EGG);
			event.accept(MobsCore.MUCHIRI_SPAWN_EGG);
			event.accept(MobsCore.POSEIDON_SPAWN_EGG);
			event.accept(MobsCore.CORE_SPAWN_EGG);
			event.accept(MobsCore.POWERED_UP_CORE_SPAWN_EGG);
			event.accept(MobsCore.ANCIENT_OOO_SPAWN_EGG);
			event.accept(MobsCore.GODA_SPAWN_EGG);
			
			event.accept(MobsCore.BUGSTERVIRUS_SPAWN_EGG);
			event.accept(MobsCore.MIGHTY_BUGSTER_SPAWN_EGG);
			event.accept(MobsCore.TADDLE_BUGSTER_SPAWN_EGG);
			event.accept(MobsCore.BANG_BANG_BUGSTER_SPAWN_EGG);
			event.accept(MobsCore.LOVELY_BUGSTER_SPAWN_EGG);
			
			event.accept(MobsCore.MACEHINE_TORADOR_SPAWN_EGG);
			event.accept(MobsCore.HARDBOILER_SPAWN_EGG);
			event.accept(MobsCore.SKULLBOILER_SPAWN_EGG);
			
			for (int i = 0; i < RiderTabs.Misc_TAB_ITEM.size(); i++)
			{
				event.accept( RiderTabs.Misc_TAB_ITEM.get(i));
			}
		}


    	
    }
    
}