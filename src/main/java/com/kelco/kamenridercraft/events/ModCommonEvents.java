package com.kelco.kamenridercraft.events;

import com.kelco.kamenridercraft.KamenRiderCraftCore;
import com.kelco.kamenridercraft.Entities.AriCommandoEntity;
import com.kelco.kamenridercraft.Entities.BlackSatanSoldierEntity;
import com.kelco.kamenridercraft.Entities.ChapEntity;
import com.kelco.kamenridercraft.Entities.CombatRoidEntity;
import com.kelco.kamenridercraft.Entities.DestronCombatmanEntity;
import com.kelco.kamenridercraft.Entities.DogmaFighterEntity;
import com.kelco.kamenridercraft.Entities.GODWarfareAgentEntity;
import com.kelco.kamenridercraft.Entities.MobsCore;
import com.kelco.kamenridercraft.Entities.RedFollowerEntity;
import com.kelco.kamenridercraft.Entities.ShockerCombatmanEntity;
import com.kelco.kamenridercraft.Entities.bosses.ShockerRidersEntity;

import net.minecraft.world.entity.SpawnPlacements;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.event.entity.SpawnPlacementRegisterEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = KamenRiderCraftCore.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)

public class ModCommonEvents {
 
	  @SubscribeEvent
	    public static void entitySpawnRestriction(SpawnPlacementRegisterEvent event) {
	        event.register(MobsCore.SHOCKER_COMBATMAN.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, Monster::checkMonsterSpawnRules, SpawnPlacementRegisterEvent.Operation.REPLACE);	      
	        event.register(MobsCore.DESTRON_COMBATMAN.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, Monster::checkMonsterSpawnRules, SpawnPlacementRegisterEvent.Operation.REPLACE);
	        event.register(MobsCore.GOD_WARFARE_AGENT.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, Monster::checkMonsterSpawnRules, SpawnPlacementRegisterEvent.Operation.REPLACE);
	        event.register(MobsCore.RED_FOLLWER.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, Monster::checkMonsterSpawnRules, SpawnPlacementRegisterEvent.Operation.REPLACE);
	        event.register(MobsCore.BLACK_SATAN_SOLDIER.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, Monster::checkMonsterSpawnRules, SpawnPlacementRegisterEvent.Operation.REPLACE);
	        event.register(MobsCore.ARI_COMMANDO.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, Monster::checkMonsterSpawnRules, SpawnPlacementRegisterEvent.Operation.REPLACE);
	        event.register(MobsCore.DOGMA_FIGHTER.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, Monster::checkMonsterSpawnRules, SpawnPlacementRegisterEvent.Operation.REPLACE);
	        event.register(MobsCore.COMBAT_ROID.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, Monster::checkMonsterSpawnRules, SpawnPlacementRegisterEvent.Operation.REPLACE);
	        event.register(MobsCore.CHAP.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, Monster::checkMonsterSpawnRules, SpawnPlacementRegisterEvent.Operation.REPLACE);
	    	
	  }
	  
    @SubscribeEvent
    public static void entityAttributeEvent(EntityAttributeCreationEvent event) {
        event.put(MobsCore.SHOCKER_COMBATMAN.get(), ShockerCombatmanEntity.setAttributes());
        event.put(MobsCore.SHOCKER_RIDER.get(), ShockerRidersEntity.setAttributes());
        
        event.put(MobsCore.DESTRON_COMBATMAN.get(), DestronCombatmanEntity.setAttributes());
        event.put(MobsCore.GOD_WARFARE_AGENT.get(), GODWarfareAgentEntity.setAttributes());
        event.put(MobsCore.RED_FOLLWER.get(), RedFollowerEntity.setAttributes());
        event.put(MobsCore.BLACK_SATAN_SOLDIER.get(), BlackSatanSoldierEntity.setAttributes());
        event.put(MobsCore.ARI_COMMANDO.get(), AriCommandoEntity.setAttributes());
        event.put(MobsCore.DOGMA_FIGHTER.get(), DogmaFighterEntity.setAttributes());
        event.put(MobsCore.COMBAT_ROID.get(), CombatRoidEntity.setAttributes());
        event.put(MobsCore.CHAP.get(), ChapEntity.setAttributes());
        event.put(MobsCore.SHADOWMOON.get(), ChapEntity.setAttributes());

    }

}