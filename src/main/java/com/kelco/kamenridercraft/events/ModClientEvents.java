package com.kelco.kamenridercraft.events;


import com.kelco.kamenridercraft.Items.W_Rider_Items;
import com.kelco.kamenridercraft.client.renderer.BasicEntityRenderer;
import com.kelco.kamenridercraft.KamenRiderCraftCore;
import com.kelco.kamenridercraft.Entities.MobsCore;

import net.minecraft.client.renderer.item.ItemProperties;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = KamenRiderCraftCore.MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ModClientEvents {


	private static ResourceLocation BLOCKING_PROPERTY_RESLOC = new ResourceLocation(KamenRiderCraftCore.MODID, "blocking");
	
	@SubscribeEvent
    public static void onClientSetup(final FMLClientSetupEvent event) {

		event.enqueueWork(() -> {
			
	    	ItemProperties.register(W_Rider_Items.SHIELD_PRISM_BICKER.get(), BLOCKING_PROPERTY_RESLOC, ($itemStack, $level, $entity, $seed) -> {
	    		return $entity != null && $entity.isUsingItem() && $entity.getUseItem() == $itemStack ? 1.0F : 0.0F;
	    	});
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

        //event.registerEntityRenderer(MobsCore.RIOTROOPER.get(), BasicEntityRenderer::new);
        //event.registerEntityRenderer(MobsCore.ORGA.get(), BasicEntityRenderer::new);
        
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
    }
   

}