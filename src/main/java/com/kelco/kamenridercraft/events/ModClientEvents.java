package com.kelco.kamenridercraft.events;


import com.kelco.kamenridercraft.Entities.DestronCombatmanEntity;
import com.kelco.kamenridercraft.Entities.MobsCore;
import com.kelco.kamenridercraft.Entities.ShockerCombatmanEntity;
import com.kelco.kamenridercraft.client.renderer.BasicEntityRenderer;
import com.kelco.kamenridercraft.KamenRiderCraftCore;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = KamenRiderCraftCore.MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ModClientEvents {


    @SubscribeEvent
    public static void entityAttributeEvent(EntityAttributeCreationEvent event) {
        event.put(MobsCore.SHOCKER_COMBATMAN.get(), ShockerCombatmanEntity.setAttributes());
        event.put(MobsCore.DESTRON_COMBATMAN.get(), DestronCombatmanEntity.setAttributes());
        event.put(MobsCore.GOD_WARFARE_AGENT.get(), DestronCombatmanEntity.setAttributes());
        event.put(MobsCore.RED_FOLLWER.get(), ShockerCombatmanEntity.setAttributes());
        event.put(MobsCore.BLACK_SATAN_SOLDIER.get(), DestronCombatmanEntity.setAttributes());
        event.put(MobsCore.ARI_COMMANDO.get(), DestronCombatmanEntity.setAttributes());
        event.put(MobsCore.DOGMA_FIGHTER.get(), DestronCombatmanEntity.setAttributes());
        event.put(MobsCore.COMBAT_ROID.get(), DestronCombatmanEntity.setAttributes());
        event.put(MobsCore.CHAP.get(), DestronCombatmanEntity.setAttributes());

    }
	 
    @SubscribeEvent
    public static void entityRenderers(EntityRenderersEvent.RegisterRenderers event) {
    	
        event.registerEntityRenderer(MobsCore.SHOCKER_COMBATMAN.get(), BasicEntityRenderer::new);
        event.registerEntityRenderer(MobsCore.DESTRON_COMBATMAN.get(), BasicEntityRenderer::new);
        event.registerEntityRenderer(MobsCore.GOD_WARFARE_AGENT.get(), BasicEntityRenderer::new);
        event.registerEntityRenderer(MobsCore.RED_FOLLWER.get(), BasicEntityRenderer::new);
        event.registerEntityRenderer(MobsCore.BLACK_SATAN_SOLDIER.get(), BasicEntityRenderer::new);
        event.registerEntityRenderer(MobsCore.ARI_COMMANDO.get(), BasicEntityRenderer::new);
        event.registerEntityRenderer(MobsCore.DOGMA_FIGHTER.get(), BasicEntityRenderer::new);
        event.registerEntityRenderer(MobsCore.COMBAT_ROID.get(), BasicEntityRenderer::new);
        event.registerEntityRenderer(MobsCore.CHAP.get(), BasicEntityRenderer::new);
    }
   

}