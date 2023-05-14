package com.kelco.kamenridercraft;


import com.kelco.kamenridercraft.Items.Ichigo_Rider_Items;
import com.kelco.kamenridercraft.Items.Modded_item_core;
import com.kelco.kamenridercraft.Items.RiderTabs;

import net.minecraft.world.effect.MobEffectInstance;
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

		MinecraftForge.EVENT_BUS.register(this);
		modEventBus.addListener(this::addCreative);
	}



	private void addCreative(CreativeModeTabEvent.BuildContents event) {


		if(event.getTab() == RiderTabs.IchigoTab) {


			for (int i = 0; i < RiderTabs.ICHIGO_TAB_ITEM.size(); i++)
			{
				event.accept( RiderTabs.ICHIGO_TAB_ITEM.get(i));
			}

		}

		if(event.getTab() == RiderTabs.V3Tab) {
			for (int i = 0; i < RiderTabs.V3_TAB_ITEM.size(); i++)
			{
				event.accept( RiderTabs.V3_TAB_ITEM.get(i));
			}
		}

		if(event.getTab() == RiderTabs.XTab) {
			event.accept(Ichigo_Rider_Items.RIDOL_STICK);
			
			for (int i = 0; i < RiderTabs.X_TAB_ITEM.size(); i++)
			{
				event.accept( RiderTabs.X_TAB_ITEM.get(i));
			}

		}

		if(event.getTab() == RiderTabs.RiderMiscTab) {
			event.accept(Modded_item_core.RIDER_CIRCUIT);
			event.accept(Modded_item_core.BASE_SWORD);
			event.accept(Modded_item_core.BASE_BIKE);
			event.accept(Modded_item_core.SHOCKER_EMBLEM);
			event.accept(Modded_item_core.DONUT);
		}


	}



	@Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
	public static class ClientModEvents {
		@SubscribeEvent
		public static void onClientSetup(FMLClientSetupEvent event) {
		}
	}
}