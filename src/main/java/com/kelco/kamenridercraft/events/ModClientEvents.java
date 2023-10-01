package com.kelco.kamenridercraft.events;


import com.kelco.kamenridercraft.Items.Faiz_Rider_Items;
import com.kelco.kamenridercraft.Items.Kuuga_Rider_Items;
import com.kelco.kamenridercraft.Items.RiderTabs;
import com.kelco.kamenridercraft.Items.W_Rider_Items;
import com.kelco.kamenridercraft.Items.rider_armor_base.RiderDriverItem;
import com.kelco.kamenridercraft.client.renderer.AnkhRenderer;
import com.kelco.kamenridercraft.client.renderer.BasicEntityRenderer;

import java.util.ArrayList;
import java.util.List;

import com.kelco.kamenridercraft.KamenRiderCraftCore;
import com.kelco.kamenridercraft.Entities.MobsCore;

import net.minecraft.client.renderer.item.ItemProperties;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = KamenRiderCraftCore.MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ModClientEvents {


	private static ResourceLocation BLOCKING_PROPERTY_RESLOC = new ResourceLocation(KamenRiderCraftCore.MODID, "blocking");

	public static List<Item> SWORD_GUN_ITEM= new ArrayList<Item>();
	
	public static List<Item> KUUGA_CHANGING_ITEM= new ArrayList<Item>();

	public static List<Item> SHIELD_ITEM= new ArrayList<Item>();

	@SubscribeEvent
	public static void onClientSetup(final FMLClientSetupEvent event) {

		event.enqueueWork(() -> {


		
			
			for (int i = 0; i < SHIELD_ITEM.size(); i++)
			{
		
			ItemProperties.register(SHIELD_ITEM.get(i), BLOCKING_PROPERTY_RESLOC, ($itemStack, $level, $entity, $seed) -> {
				return $entity != null && $entity.isUsingItem() && $entity.getUseItem() == $itemStack ? 1.0F : 0.0F;
			});
		}



			for (int i = 0; i < KUUGA_CHANGING_ITEM.size(); i++)
			{
				ItemProperties.register(KUUGA_CHANGING_ITEM.get(i), new ResourceLocation("pull"), (p_174635_, p_174636_, p_174637_, p_174638_) -> {
					if (p_174637_ == null) {
						return 0.0F;
					}
						else if (p_174637_.getItemBySlot(EquipmentSlot.FEET)!= null){

							if (p_174637_.getItemBySlot(EquipmentSlot.FEET).getItem() == Kuuga_Rider_Items.ARCLE.get()){
								ItemStack belt = p_174637_.getItemBySlot(EquipmentSlot.FEET);
								if (RiderDriverItem.get_Form_Item(belt, 1).getBeltTex()=="arcle_belt_r") return 1;
								if (RiderDriverItem.get_Form_Item(belt, 1).getBeltTex()=="arcle_belt_u") return 2;
								if (RiderDriverItem.get_Form_Item(belt, 1).getBeltTex()=="arcle_belt_ru") return 2;
							}else {
								return 0;
							}
							return 0;
						}
						return 0;
						//return p_174637_.getUseItem() != p_174635_ ? 0.0F : (float)(p_174635_.getUseDuration() - p_174637_.getUseItemRemainingTicks()) / 1.0F;
					}
				);
			}
	
	

			for (int i = 0; i < SWORD_GUN_ITEM.size(); i++)
			{
				ItemProperties.register(SWORD_GUN_ITEM.get(i), new ResourceLocation("pull"), (p_174635_, p_174636_, p_174637_, p_174638_) -> {
					if (p_174637_ == null) {
						return 0.0F;
					} else {
						return p_174637_.getUseItem() != p_174635_ ? 0.0F : (float)(p_174635_.getUseDuration() - p_174637_.getUseItemRemainingTicks()) / 1.0F;
					}
				});
			}
		});

	}


	@SubscribeEvent
	public static void entityRenderers(EntityRenderersEvent.RegisterRenderers event) {

		event.registerEntityRenderer(MobsCore.SHOCKER_COMBATMAN.get(), BasicEntityRenderer::new);
		event.registerEntityRenderer(MobsCore.SHOCKER_RIDER.get(), BasicEntityRenderer::new);

		event.registerEntityRenderer(MobsCore.DESTRON_COMBATMAN.get(), BasicEntityRenderer::new);
		event.registerEntityRenderer(MobsCore.GOD_WARFARE_AGENT.get(), BasicEntityRenderer::new);
		event.registerEntityRenderer(MobsCore.RED_FOLLWER.get(), BasicEntityRenderer::new);
		event.registerEntityRenderer(MobsCore.BLACK_SATAN_SOLDIER.get(), BasicEntityRenderer::new);
		event.registerEntityRenderer(MobsCore.ARI_COMMANDO.get(), BasicEntityRenderer::new);
		event.registerEntityRenderer(MobsCore.DOGMA_FIGHTER.get(), BasicEntityRenderer::new);
		event.registerEntityRenderer(MobsCore.COMBAT_ROID.get(), BasicEntityRenderer::new);
		event.registerEntityRenderer(MobsCore.CHAP.get(), BasicEntityRenderer::new);
		event.registerEntityRenderer(MobsCore.CHAP_GREY.get(), BasicEntityRenderer::new);
		event.registerEntityRenderer(MobsCore.SHADOWMOON.get(), BasicEntityRenderer::new);

		event.registerEntityRenderer(MobsCore.ZU_GUMUN_BA.get(), BasicEntityRenderer::new);

		event.registerEntityRenderer(MobsCore.PANTHERAS_LUTEUS.get(), BasicEntityRenderer::new);
		event.registerEntityRenderer(MobsCore.EL_OF_THE_WATER.get(), BasicEntityRenderer::new);
		event.registerEntityRenderer(MobsCore.ANGUIS_MASCULUS.get(), BasicEntityRenderer::new);
		event.registerEntityRenderer(MobsCore.ANOTHER_AGITO.get(), BasicEntityRenderer::new);

		event.registerEntityRenderer(MobsCore.RIOTROOPER.get(), BasicEntityRenderer::new);
		event.registerEntityRenderer(MobsCore.ORGA.get(), BasicEntityRenderer::new);

		event.registerEntityRenderer(MobsCore.MASQUERADE.get(), BasicEntityRenderer::new);
		event.registerEntityRenderer(MobsCore.WEATHER_DOPANT.get(), BasicEntityRenderer::new);
		event.registerEntityRenderer(MobsCore.CLAYDOLL_DOPANT.get(), BasicEntityRenderer::new);
		event.registerEntityRenderer(MobsCore.TERROR_DOPANT.get(), BasicEntityRenderer::new);
		event.registerEntityRenderer(MobsCore.NASCA_DOPANT.get(), BasicEntityRenderer::new);
		//event.registerEntityRenderer(MobsCore.RED_NASCA_DOPANT.get(), BasicEntityRenderer::new);
		event.registerEntityRenderer(MobsCore.SMILODON_DOPANT.get(), BasicEntityRenderer::new);

		event.registerEntityRenderer(MobsCore.FOUNDATION_X_MASQUERADE.get(), BasicEntityRenderer::new);
		event.registerEntityRenderer(MobsCore.ETERNAL.get(), BasicEntityRenderer::new);
		event.registerEntityRenderer(MobsCore.COMMANDER_DOPANT.get(), BasicEntityRenderer::new);
		event.registerEntityRenderer(MobsCore.MUCHIRI.get(), BasicEntityRenderer::new);

		event.registerEntityRenderer(MobsCore.YUMMY.get(), BasicEntityRenderer::new);
		event.registerEntityRenderer(MobsCore.ANKHCOMPLETE.get(), BasicEntityRenderer::new);
		event.registerEntityRenderer(MobsCore.UVA.get(), BasicEntityRenderer::new);
		event.registerEntityRenderer(MobsCore.KAZARI.get(), BasicEntityRenderer::new);
		event.registerEntityRenderer(MobsCore.MEZOOL.get(), BasicEntityRenderer::new);
		event.registerEntityRenderer(MobsCore.GAMEL.get(), BasicEntityRenderer::new);
		event.registerEntityRenderer(MobsCore.ANKH_LOST.get(), BasicEntityRenderer::new);
		event.registerEntityRenderer(MobsCore.ANKH.get(), AnkhRenderer::new);
		event.registerEntityRenderer(MobsCore.POSEIDON.get(), BasicEntityRenderer::new);
		event.registerEntityRenderer(MobsCore.CORE.get(), BasicEntityRenderer::new);
		//event.registerEntityRenderer(MobsCore.POWERED_UP_CORE.get(), BasicEntityRenderer::new);
		//event.registerEntityRenderer(MobsCore.ANCIENT_OOO.get(), BasicEntityRenderer::new);
		//event.registerEntityRenderer(MobsCore.GODA.get(), BasicEntityRenderer::new);
	}


}