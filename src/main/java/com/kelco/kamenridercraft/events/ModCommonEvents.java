package com.kelco.kamenridercraft.events;

import com.kelco.kamenridercraft.KamenRiderCraftCore;
import com.kelco.kamenridercraft.Effect.Effect_core;
import com.kelco.kamenridercraft.Entities.AnkhEntity;
import com.kelco.kamenridercraft.Entities.MobsCore;
import com.kelco.kamenridercraft.Entities.Villager.RiderVillagers;
import com.kelco.kamenridercraft.Entities.bosses.AncientOOOEntity;
import com.kelco.kamenridercraft.Entities.bosses.AnkhCompleteEntity;
import com.kelco.kamenridercraft.Entities.bosses.AnkhLostEntity;
import com.kelco.kamenridercraft.Entities.bosses.AnotherAgitoEntity;
import com.kelco.kamenridercraft.Entities.bosses.ClayDollDopantEntity;
import com.kelco.kamenridercraft.Entities.bosses.CommanderDopantEntity;
import com.kelco.kamenridercraft.Entities.bosses.CoreEntity;
import com.kelco.kamenridercraft.Entities.bosses.ElOfTheWaterEntity;
import com.kelco.kamenridercraft.Entities.bosses.EternalEntity;
import com.kelco.kamenridercraft.Entities.bosses.GamelEntity;
import com.kelco.kamenridercraft.Entities.bosses.GodaEntity;
import com.kelco.kamenridercraft.Entities.bosses.KazariEntity;
import com.kelco.kamenridercraft.Entities.bosses.MezoolEntity;
import com.kelco.kamenridercraft.Entities.bosses.MuchiriEntity;
import com.kelco.kamenridercraft.Entities.bosses.NazcaDopantEntity;
import com.kelco.kamenridercraft.Entities.bosses.OrgaEntity;
import com.kelco.kamenridercraft.Entities.bosses.PoseidonEntity;
import com.kelco.kamenridercraft.Entities.bosses.PoweredUpCoreEntity;
import com.kelco.kamenridercraft.Entities.bosses.ShadowmoonEntity;
import com.kelco.kamenridercraft.Entities.bosses.ShockerRidersEntity;
import com.kelco.kamenridercraft.Entities.bosses.SmilodonDopantEntity;
import com.kelco.kamenridercraft.Entities.bosses.TerrorDopantEntity;
import com.kelco.kamenridercraft.Entities.bosses.UvaEntity;
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
import com.kelco.kamenridercraft.Entities.footSoldiers.KnightSoldierEntity;
import com.kelco.kamenridercraft.Entities.footSoldiers.MasqueradeEntity;
import com.kelco.kamenridercraft.Entities.footSoldiers.PantherasLuteusEntity;
import com.kelco.kamenridercraft.Entities.footSoldiers.RedFollowerEntity;
import com.kelco.kamenridercraft.Entities.footSoldiers.RiotrooperEntity;
import com.kelco.kamenridercraft.Entities.footSoldiers.ShockerCombatmanEntity;
import com.kelco.kamenridercraft.Entities.footSoldiers.YummyEntity;
import com.kelco.kamenridercraft.Entities.footSoldiers.ZuGumunBaEntity;
import com.kelco.kamenridercraft.Items.Ichigo_Rider_Items;
import com.kelco.kamenridercraft.Items.Kuuga_Rider_Items;
import com.kelco.kamenridercraft.Items.Modded_item_core;
import java.util.List;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import net.minecraft.world.entity.SpawnPlacements;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraft.world.entity.npc.VillagerTrades;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.trading.MerchantOffer;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraftforge.client.event.RenderLivingEvent;
import net.minecraftforge.client.event.RenderPlayerEvent;
import net.minecraftforge.common.ForgeMod;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.event.entity.EntityEvent;
import net.minecraftforge.event.entity.SpawnPlacementRegisterEvent;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;


@Mod.EventBusSubscriber(modid = KamenRiderCraftCore.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)

public class ModCommonEvents {




	@Mod.EventBusSubscriber(modid = KamenRiderCraftCore.MODID)
	public static class ForgeEvents {

		@SuppressWarnings({ "removal", "deprecation" })
		@SubscribeEvent
		public static void addChangeSize(EntityEvent.Size event) {

			if (event.getEntity() instanceof Player entity) {

				if (entity.isAddedToWorld()) { 
					float size = 1;
					if (entity.hasEffect(Effect_core.BIG.get())&!entity.hasEffect(Effect_core.SMALL.get())) { 
						size= size*((entity.getEffect(Effect_core.BIG.get()).getAmplifier())+1);
					}else  if (!entity.hasEffect(Effect_core.BIG.get())&entity.hasEffect(Effect_core.SMALL.get())) {
						size=(float) (size/2);
					}
					event.setNewSize(entity.getDimensions(entity.getPose()).scale(size),true);
					event.setNewEyeHeight(((float)entity.getEyeHeight(entity.getPose())*size));
					//event.setNewEyeHeight(((float)Player.DEFAULT_EYE_HEIGHT*size));
				}
			}
		}



		// /effect give @e kamenridercraft:big infinite 3

		@SubscribeEvent
		public static void addRenderLivingEvent(RenderLivingEvent.Pre event) {

			float size = 1;
			if (event.getEntity().hasEffect(Effect_core.BIG.get())&!event.getEntity().hasEffect(Effect_core.SMALL.get())) { 
				size= size*((event.getEntity().getEffect(Effect_core.BIG.get()).getAmplifier())+1);
			}else  if (!event.getEntity().hasEffect(Effect_core.BIG.get())&event.getEntity().hasEffect(Effect_core.SMALL.get())) {
				size=(float) (size/2);
			}
			float size2 = size;
			if (event.getEntity().hasEffect(Effect_core.FLAT.get())) { 
				size2= 0.1f;
			}
			if (event.getEntity() instanceof Player player) {

				player.self().getAttributeValue(ForgeMod.BLOCK_REACH.get());

			}


			event.getPoseStack().scale(size,size,size2);
		}

		@SubscribeEvent
		public static void addRenderPlayerEvent(RenderPlayerEvent.Pre event) {


		}

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
			if(event.getType() == VillagerProfession.LIBRARIAN) {
				Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
				ItemStack stack = new ItemStack(Kuuga_Rider_Items.KUUGA_MANGA.get(), 1);
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
				ItemStack stack = new ItemStack(Ichigo_Rider_Items.SHIN_STONE.get(), 1);
				int villagerLevel = 1;

				trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
						new ItemStack(Items.EMERALD, 2),
						stack,10,8,0.02F));
			}
			if(event.getType() == RiderVillagers.SHOCKER_VILLAGER.get()) {
				Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
				ItemStack stack = new ItemStack(Modded_item_core.SINISTER_PACHINKO_BALL.get(), 1);
				int villagerLevel = 2;

				trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
						new ItemStack(Items.EMERALD, 4),
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

		event.register(MobsCore.ANKH.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, AnkhEntity::checkAnkhSpawnRules, SpawnPlacementRegisterEvent.Operation.REPLACE);

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
		event.put(MobsCore.MUCHIRI.get(), MuchiriEntity.setAttributes());

		event.put(MobsCore.YUMMY.get(), YummyEntity.setAttributes());
		event.put(MobsCore.KNIGHT_SOLDIER.get(), KnightSoldierEntity.setAttributes());
		event.put(MobsCore.ANKH.get(), AnkhEntity.setAttributes());
		event.put(MobsCore.ANKHCOMPLETE.get(), AnkhCompleteEntity.setAttributes());
		event.put(MobsCore.ANKH_LOST.get(), AnkhLostEntity.setAttributes());
		event.put(MobsCore.UVA.get(), UvaEntity.setAttributes());
		event.put(MobsCore.KAZARI.get(), KazariEntity.setAttributes());
		event.put(MobsCore.MEZOOL.get(), MezoolEntity.setAttributes());
		event.put(MobsCore.GAMEL.get(), GamelEntity.setAttributes());
		event.put(MobsCore.POSEIDON.get(), PoseidonEntity.setAttributes());
		event.put(MobsCore.CORE.get(), CoreEntity.setAttributes());
		event.put(MobsCore.POWERED_UP_CORE.get(), PoweredUpCoreEntity.setAttributes());
		event.put(MobsCore.ANCIENT_OOO.get(), AncientOOOEntity.setAttributes());
		event.put(MobsCore.GODA.get(), GodaEntity.setAttributes());

	}

}
