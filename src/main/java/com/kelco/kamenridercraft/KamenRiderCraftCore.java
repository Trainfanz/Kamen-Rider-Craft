package com.kelco.kamenridercraft;


import com.kelco.kamenridercraft.Entities.MobsCore;
import com.kelco.kamenridercraft.Items.Ichigo_Rider_Items;
import com.kelco.kamenridercraft.Items.Modded_item_core;
import com.kelco.kamenridercraft.Items.RiderTabs;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;



@Mod(KamenRiderCraftCore.MODID)
public class KamenRiderCraftCore {

	public static final String MODID="kamenridercraft";

	public KamenRiderCraftCore() {
		IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
		Modded_item_core.register(modEventBus);
		Ichigo_Rider_Items.register(modEventBus);
		MobsCore.register(modEventBus);
MobsCore.MOBLIST.register(modEventBus);
		MinecraftForge.EVENT_BUS.register(this);
		modEventBus.addListener(this::addCreative);
	}



	private void addCreative(CreativeModeTabEvent.BuildContents event) {

		RiderTabs.AddItemsToTabs(event);

	}



	@Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
	public static class ClientModEvents {
		@SubscribeEvent
		public static void onClientSetup(FMLClientSetupEvent event) {
		}
	}
}