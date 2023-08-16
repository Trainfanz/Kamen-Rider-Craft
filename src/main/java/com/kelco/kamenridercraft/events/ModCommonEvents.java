package com.kelco.kamenridercraft.events;

import com.kelco.kamenridercraft.KamenRiderCraftCore;
import com.kelco.kamenridercraft.Entities.MobsCore;
import com.kelco.kamenridercraft.Entities.Villager.RiderVillagers;
import com.kelco.kamenridercraft.Entities.bosses.AnotherAgitoEntity;
import com.kelco.kamenridercraft.Entities.bosses.ClayDollDopantEntity;
import com.kelco.kamenridercraft.Entities.bosses.CommanderDopantEntity;
import com.kelco.kamenridercraft.Entities.bosses.ElOfTheWaterEntity;
import com.kelco.kamenridercraft.Entities.bosses.EternalEntity;
import com.kelco.kamenridercraft.Entities.bosses.NazcaDopantEntity;
import com.kelco.kamenridercraft.Entities.bosses.OrgaEntity;
import com.kelco.kamenridercraft.Entities.bosses.ShadowmoonEntity;
import com.kelco.kamenridercraft.Entities.bosses.ShockerRidersEntity;
import com.kelco.kamenridercraft.Entities.bosses.SmilodonDopantEntity;
import com.kelco.kamenridercraft.Entities.bosses.TerrorDopantEntity;
import com.kelco.kamenridercraft.Entities.bosses.WeatherDopantEntity;
import com.kelco.kamenridercraft.Entities.footSoldiers.AnguisMasculusEntity;
import com.kelco.kamenridercraft.Entities.footSoldiers.AriCommandoEntity;
import com.kelco.kamenridercraft.Entities.footSoldiers.BlackSatanSoldierEntity;
import com.kelco.kamenridercraft.Entities.footSoldiers.ChapEntity;
import com.kelco.kamenridercraft.Entities.footSoldiers.ChapGreyEntity;
import com.kelco.kamenridercraft.Entities.footSoldiers.CombatRoidEntity;
import com.kelco.kamenridercraft.Entities.footSoldiers.DestronCombatmanEntity;
import com.kelco.kamenridercraft.Entities.footSoldiers.DogmaFighterEntity;
import com.kelco.kamenridercraft.Entities.footSoldiers.FoundationXMasqueradeEntity;
import com.kelco.kamenridercraft.Entities.footSoldiers.GODWarfareAgentEntity;
import com.kelco.kamenridercraft.Entities.footSoldiers.MasqueradeEntity;
import com.kelco.kamenridercraft.Entities.footSoldiers.PantherasLuteusEntity;
import com.kelco.kamenridercraft.Entities.footSoldiers.RedFollowerEntity;
import com.kelco.kamenridercraft.Entities.footSoldiers.RiotrooperEntity;
import com.kelco.kamenridercraft.Entities.footSoldiers.ShockerCombatmanEntity;
import com.kelco.kamenridercraft.Entities.footSoldiers.ZuGumunBaEntity;
import com.kelco.kamenridercraft.Items.Ichigo_Rider_Items;
import com.kelco.kamenridercraft.Items.Modded_item_core;
import java.util.List;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import net.minecraft.world.entity.SpawnPlacements;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraft.world.entity.npc.VillagerTrades;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.trading.MerchantOffer;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.event.entity.SpawnPlacementRegisterEvent;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;


@Mod.EventBusSubscriber(modid = KamenRiderCraftCore.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)

public class ModCommonEvents {
 
	  @Mod.EventBusSubscriber(modid = KamenRiderCraftCore.MODID)
	    public static class ForgeEvents {
	  @SubscribeEvent
	    public static void addCustomTrades(VillagerTradesEvent event) {
	       if(event.getType() == VillagerProfession.LIBRARIAN) {
               Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
               ItemStack stack = new ItemStack(Ichigo_Rider_Items.RIDER3_VS_THE_DEMON_OF_GENERAL_BLACK.get(), 1);
               int villagerLevel = 1;

               trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                       new ItemStack(Items.EMERALD, 2),
                       stack,10,8,0.02F));
           }

	       if(event.getType() == RiderVillagers.SHOCKER_VILLAGER.get()) {
               Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
               ItemStack stack = new ItemStack(Modded_item_core.SHOCKER_EMBLEM.get(), 1);
               int villagerLevel = 1;

               trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                       new ItemStack(Items.EMERALD, 2),
                       stack,10,8,0.02F));
           }
	       
	       if(event.getType() == RiderVillagers.SHOCKER_VILLAGER.get()) {
               Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
               ItemStack stack = new ItemStack(Ichigo_Rider_Items.J_STONE.get(), 1);
               int villagerLevel = 1;

               trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                       new ItemStack(Items.EMERALD, 2),
                       stack,10,8,0.02F));
           }
	       
	       if(event.getType() == RiderVillagers.SHOCKER_VILLAGER.get()) {
               Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
               ItemStack stack = new ItemStack(Ichigo_Rider_Items.ZO_STONE.get(), 1);
               int villagerLevel = 1;

               trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                       new ItemStack(Items.EMERALD, 2),
                       stack,10,8,0.02F));
           }
	       
	       if(event.getType() == RiderVillagers.SHOCKER_VILLAGER.get()) {
               Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
               ItemStack stack = new ItemStack(Ichigo_Rider_Items.GRASSHOPPER_DNA.get(), 1);
               int villagerLevel = 1;

               trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
                       new ItemStack(Items.EMERALD, 2),
                       stack,10,8,0.02F));
           }
	    }
	  }
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
	        event.register(MobsCore.CHAP_GREY.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, Monster::checkMonsterSpawnRules, SpawnPlacementRegisterEvent.Operation.REPLACE);
	      
	        event.register(MobsCore.ZU_GUMUN_BA.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, Monster::checkMonsterSpawnRules, SpawnPlacementRegisterEvent.Operation.REPLACE);

	        event.register(MobsCore.PANTHERAS_LUTEUS.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, Monster::checkMonsterSpawnRules, SpawnPlacementRegisterEvent.Operation.REPLACE);
	        event.register(MobsCore.ANGUIS_MASCULUS.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, Monster::checkMonsterSpawnRules, SpawnPlacementRegisterEvent.Operation.REPLACE);

	        event.register(MobsCore.RIOTROOPER.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, Monster::checkMonsterSpawnRules, SpawnPlacementRegisterEvent.Operation.REPLACE);
	        
	        event.register(MobsCore.MASQUERADE.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, Monster::checkMonsterSpawnRules, SpawnPlacementRegisterEvent.Operation.REPLACE);
	        event.register(MobsCore.FOUNDATION_X_MASQUERADE.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, Monster::checkMonsterSpawnRules, SpawnPlacementRegisterEvent.Operation.REPLACE);
	        event.register(MobsCore.YUMMY.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, Monster::checkMonsterSpawnRules, SpawnPlacementRegisterEvent.Operation.REPLACE);
	  	  
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
        event.put(MobsCore.CHAP_GREY.get(), ChapGreyEntity.setAttributes());
        event.put(MobsCore.SHADOWMOON.get(), ShadowmoonEntity.setAttributes());
        
        event.put(MobsCore.ZU_GUMUN_BA.get(), ZuGumunBaEntity.setAttributes());

        event.put(MobsCore.PANTHERAS_LUTEUS.get(), PantherasLuteusEntity.setAttributes());
        event.put(MobsCore.EL_OF_THE_WATER.get(), ElOfTheWaterEntity.setAttributes());
        event.put(MobsCore.ANGUIS_MASCULUS.get(), AnguisMasculusEntity.setAttributes());
        event.put(MobsCore.ANOTHER_AGITO.get(), AnotherAgitoEntity.setAttributes());

        event.put(MobsCore.RIOTROOPER.get(), RiotrooperEntity.setAttributes());
        event.put(MobsCore.ORGA.get(), OrgaEntity.setAttributes());
        
        event.put(MobsCore.MASQUERADE.get(), MasqueradeEntity.setAttributes());
        event.put(MobsCore.CLAYDOLL_DOPANT.get(), ClayDollDopantEntity.setAttributes());        
        event.put(MobsCore.TERROR_DOPANT.get(), TerrorDopantEntity.setAttributes());        
        event.put(MobsCore.NASCA_DOPANT.get(), NazcaDopantEntity.setAttributes());        
       // event.put(MobsCore.RED_NASCA_DOPANT.get(),RedNazcaDopantEntity.setAttributes());        
        event.put(MobsCore.SMILODON_DOPANT.get(), SmilodonDopantEntity.setAttributes());        
        event.put(MobsCore.WEATHER_DOPANT.get(), WeatherDopantEntity.setAttributes());
        
        event.put(MobsCore.FOUNDATION_X_MASQUERADE.get(), FoundationXMasqueradeEntity.setAttributes());
        event.put(MobsCore.COMMANDER_DOPANT.get(), CommanderDopantEntity.setAttributes());
        event.put(MobsCore.ETERNAL.get(), EternalEntity.setAttributes());
        event.put(MobsCore.MUCHIRI.get(), EternalEntity.setAttributes());
        
        event.put(MobsCore.YUMMY.get(), EternalEntity.setAttributes());
      //  event.put(MobsCore.ANKH.get(), EternalEntity.setAttributes());
        event.put(MobsCore.ANKHCOMPLETE.get(), EternalEntity.setAttributes());
        event.put(MobsCore.ANKH_LOST.get(), EternalEntity.setAttributes());
        event.put(MobsCore.UVA.get(), EternalEntity.setAttributes());
        event.put(MobsCore.KAZARI.get(), EternalEntity.setAttributes());
        event.put(MobsCore.MEZOOL.get(), EternalEntity.setAttributes());
        event.put(MobsCore.GAMEL.get(), EternalEntity.setAttributes());
    }

}