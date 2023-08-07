package com.kelco.kamenridercraft;


import com.kelco.kamenridercraft.Blocks.Rider_Blocks;
import com.kelco.kamenridercraft.Effect.Effect_core;
import com.kelco.kamenridercraft.Entities.MobsCore;
import com.kelco.kamenridercraft.Entities.Villager.RiderVillagers;
import com.kelco.kamenridercraft.Items.Agito_Rider_Items;
import com.kelco.kamenridercraft.Items.Faiz_Rider_Items;
import com.kelco.kamenridercraft.Items.Ichigo_Rider_Items;
import com.kelco.kamenridercraft.Items.Kuuga_Rider_Items;
import com.kelco.kamenridercraft.Items.Modded_item_core;
import com.kelco.kamenridercraft.Items.OOO_Rider_Items;
import com.kelco.kamenridercraft.Items.Reboot_Rider_Items;
import com.kelco.kamenridercraft.Items.RiderTabs;
import com.kelco.kamenridercraft.Items.W_Rider_Items;
import com.kelco.kamenridercraft.Potion.Potion_core;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;



@Mod(KamenRiderCraftCore.MODID)
public class KamenRiderCraftCore {

	public static final String MODID="kamenridercraft";

	public KamenRiderCraftCore() {
		IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
		RiderTabs.register(modEventBus);
		Modded_item_core.register(modEventBus);
		Ichigo_Rider_Items.register(modEventBus);
		Kuuga_Rider_Items.register(modEventBus);
		Agito_Rider_Items.register(modEventBus);
		Faiz_Rider_Items.register(modEventBus);
		W_Rider_Items.register(modEventBus);
		OOO_Rider_Items.register(modEventBus);
		Reboot_Rider_Items.register(modEventBus);
		MobsCore.register(modEventBus);
		MobsCore.MOBLIST.register(modEventBus);
		Effect_core.register(modEventBus);
		Potion_core.register(modEventBus);
		Rider_Blocks.register(modEventBus);
		MinecraftForge.EVENT_BUS.register(this);
		RiderVillagers.register(modEventBus);
		modEventBus.addListener(this::addCreative);
		//modEventBus.addListener(this::commonSetup);
	}


	/** private void commonSetup(final FMLCommonSetupEvent event) {

	        event.enqueueWork(() -> {
	        	//((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(Rider_Blocks.BLUE_ROSE.getId(), Rider_Blocks.POTTED_BLUE_ROSE);
	            RiderVillagers.registerPOIs();
	        });
	    }**/

	private void addCreative(BuildCreativeModeTabContentsEvent event) {

		RiderTabs.AddItemsToTabs(event);

	}



	@Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
	public static class ClientModEvents {
		@SubscribeEvent
		public static void onClientSetup(FMLClientSetupEvent event) {
				       
		}
	}
}