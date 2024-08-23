package com.kelco.kamenridercraft.events;

import com.kelco.kamenridercraft.KamenRiderCraftCore;
import com.kelco.kamenridercraft.Blocks.Rider_Blocks;
import com.kelco.kamenridercraft.Effect.Effect_core;
import com.kelco.kamenridercraft.Entities.MobsCore;
import com.kelco.kamenridercraft.Entities.Bikes.baseBikeEntity;
import com.kelco.kamenridercraft.Entities.Villager.RiderVillagers;
import com.kelco.kamenridercraft.Entities.allies.AnkhEntity;
import com.kelco.kamenridercraft.Entities.allies.MomotarosEntity;
import com.kelco.kamenridercraft.Entities.allies.UratarosEntity;
import com.kelco.kamenridercraft.Entities.allies.KintarosEntity;
import com.kelco.kamenridercraft.Entities.allies.RyutarosEntity;
import com.kelco.kamenridercraft.Entities.bosses.AbaddonCommanderEntity;
import com.kelco.kamenridercraft.Entities.bosses.AncientOOOEntity;
import com.kelco.kamenridercraft.Entities.bosses.AnkhCompleteEntity;
import com.kelco.kamenridercraft.Entities.bosses.AnkhLostEntity;
import com.kelco.kamenridercraft.Entities.bosses.AnotherAgitoEntity;
import com.kelco.kamenridercraft.Entities.bosses.ArkZeroEntity;
import com.kelco.kamenridercraft.Entities.bosses.CaucasusEntity;
import com.kelco.kamenridercraft.Entities.bosses.ClayDollDopantEntity;
import com.kelco.kamenridercraft.Entities.bosses.CommanderDopantEntity;
import com.kelco.kamenridercraft.Entities.bosses.CoreEntity;
import com.kelco.kamenridercraft.Entities.bosses.CronusEntity;
import com.kelco.kamenridercraft.Entities.bosses.DireWolfSoldMagiaEntity;
import com.kelco.kamenridercraft.Entities.bosses.DodoMagiaEntity;
import com.kelco.kamenridercraft.Entities.bosses.EdenEntity;
import com.kelco.kamenridercraft.Entities.bosses.ElOfTheWaterEntity;
import com.kelco.kamenridercraft.Entities.bosses.EternalEntity;
import com.kelco.kamenridercraft.Entities.bosses.GamelEntity;
import com.kelco.kamenridercraft.Entities.bosses.GaohEntity;
import com.kelco.kamenridercraft.Entities.bosses.GenmEntity;
import com.kelco.kamenridercraft.Entities.bosses.GigerEntity;
import com.kelco.kamenridercraft.Entities.bosses.GodaEntity;
import com.kelco.kamenridercraft.Entities.bosses.GraphiteBugsterEntity;
import com.kelco.kamenridercraft.Entities.bosses.HorobiEntity;
import com.kelco.kamenridercraft.Entities.bosses.IkazuchiEntity;
import com.kelco.kamenridercraft.Entities.bosses.JinEntity;
import com.kelco.kamenridercraft.Entities.bosses.JyamatoRiderEntity;
import com.kelco.kamenridercraft.Entities.bosses.KazariEntity;
import com.kelco.kamenridercraft.Entities.bosses.MagiaEntity;
import com.kelco.kamenridercraft.Entities.bosses.MezoolEntity;
import com.kelco.kamenridercraft.Entities.bosses.MuchiriEntity;
import com.kelco.kamenridercraft.Entities.bosses.NakiEntity;
import com.kelco.kamenridercraft.Entities.bosses.NazcaDopantEntity;
import com.kelco.kamenridercraft.Entities.bosses.NewMoleImaginEntity;
import com.kelco.kamenridercraft.Entities.bosses.OrgaEntity;
import com.kelco.kamenridercraft.Entities.bosses.ParaDxEntity;
import com.kelco.kamenridercraft.Entities.bosses.PoppyRedEntity;
import com.kelco.kamenridercraft.Entities.bosses.PoseidonEntity;
import com.kelco.kamenridercraft.Entities.bosses.PoweredUpCoreEntity;
import com.kelco.kamenridercraft.Entities.bosses.RaiderEntity;
import com.kelco.kamenridercraft.Entities.bosses.ServalTigerSoldMagiaEntity;
import com.kelco.kamenridercraft.Entities.bosses.ShadowmoonEntity;
import com.kelco.kamenridercraft.Entities.bosses.ShockerRidersEntity;
import com.kelco.kamenridercraft.Entities.bosses.SmilodonDopantEntity;
import com.kelco.kamenridercraft.Entities.bosses.TerrorDopantEntity;
import com.kelco.kamenridercraft.Entities.bosses.UvaEntity;
import com.kelco.kamenridercraft.Entities.bosses.WeatherDopantEntity;
import com.kelco.kamenridercraft.Entities.bosses.ZaiaEntity;
import com.kelco.kamenridercraft.Entities.footSoldiers.AbaddonEntity;
import com.kelco.kamenridercraft.Entities.footSoldiers.AnguisMasculusEntity;
import com.kelco.kamenridercraft.Entities.footSoldiers.AriCommandoEntity;
import com.kelco.kamenridercraft.Entities.footSoldiers.BattleRaiderEntity;
import com.kelco.kamenridercraft.Entities.footSoldiers.BlackSatanSoldierEntity;
import com.kelco.kamenridercraft.Entities.footSoldiers.BugsterVirusEntity;
import com.kelco.kamenridercraft.Entities.footSoldiers.ChapEntity;
import com.kelco.kamenridercraft.Entities.footSoldiers.ChapGreyEntity;
import com.kelco.kamenridercraft.Entities.footSoldiers.CombatRoidEntity;
import com.kelco.kamenridercraft.Entities.footSoldiers.DestronCombatmanEntity;
import com.kelco.kamenridercraft.Entities.footSoldiers.DodoMagiaChickEntity;
import com.kelco.kamenridercraft.Entities.footSoldiers.DogmaFighterEntity;
import com.kelco.kamenridercraft.Entities.footSoldiers.FoundationXMasqueradeEntity;
import com.kelco.kamenridercraft.Entities.footSoldiers.GODWarfareAgentEntity;
import com.kelco.kamenridercraft.Entities.footSoldiers.GmRiderEntity;
import com.kelco.kamenridercraft.Entities.footSoldiers.KnightSoldierEntity;
import com.kelco.kamenridercraft.Entities.footSoldiers.MasqueradeEntity;
import com.kelco.kamenridercraft.Entities.footSoldiers.NeotrooperEntity;
import com.kelco.kamenridercraft.Entities.footSoldiers.NewMoleImaginSandEntity;
import com.kelco.kamenridercraft.Entities.footSoldiers.PantherasLuteusEntity;
import com.kelco.kamenridercraft.Entities.footSoldiers.PawnJyamatoEntity;
import com.kelco.kamenridercraft.Entities.footSoldiers.RedFollowerEntity;
import com.kelco.kamenridercraft.Entities.footSoldiers.RideplayerEntity;
import com.kelco.kamenridercraft.Entities.footSoldiers.RiotrooperEntity;
import com.kelco.kamenridercraft.Entities.footSoldiers.ShadowTrooperEntity;
import com.kelco.kamenridercraft.Entities.footSoldiers.ShockerCombatmanEntity;
import com.kelco.kamenridercraft.Entities.footSoldiers.TrilobiteMagiaEntity;
import com.kelco.kamenridercraft.Entities.footSoldiers.YummyEntity;
import com.kelco.kamenridercraft.Entities.footSoldiers.ZectrooperEntity;
import com.kelco.kamenridercraft.Entities.footSoldiers.ZuGumunBaEntity;
import com.kelco.kamenridercraft.Entities.summons.ParaDXSummonEntity;
import com.kelco.kamenridercraft.Entities.summons.RiderSummonEntity;
import com.kelco.kamenridercraft.Items.Ichigo_Rider_Items;
import com.kelco.kamenridercraft.Items.Kuuga_Rider_Items;
import com.kelco.kamenridercraft.Items.Miscellaneous_Rider_Items;
import com.kelco.kamenridercraft.Items.Modded_item_core;
import com.kelco.kamenridercraft.Items.Zero_One_Rider_Items;
import com.kelco.kamenridercraft.Items.rider_armor_base.RiderDriverItem;

import java.util.List;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.SpawnPlacements;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraft.world.entity.npc.VillagerTrades;
import net.minecraft.world.entity.npc.VillagerTrades.ItemListing;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.trading.MerchantOffer;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.RenderLivingEvent;
import net.minecraftforge.client.event.RenderPlayerEvent;
import net.minecraftforge.common.ForgeMod;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.event.entity.EntityEvent;
import net.minecraftforge.event.entity.SpawnPlacementRegisterEvent;
import net.minecraftforge.event.entity.living.LivingDamageEvent;
import net.minecraftforge.event.entity.living.LivingEquipmentChangeEvent;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.event.village.WandererTradesEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;


@Mod.EventBusSubscriber(modid = KamenRiderCraftCore.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)

public class ModCommonEvents {




	@Mod.EventBusSubscriber(Dist.CLIENT)
	public static class ForgeClientEvents {

		@SubscribeEvent
		public static void addInvisibleCheck(RenderLivingEvent.Pre event) {
			
			if (event.getEntity().getItemBySlot(EquipmentSlot.FEET).getItem() instanceof RiderDriverItem belt) {
				
		
			if (event.getEntity().getItemBySlot(EquipmentSlot.HEAD).getItem() ==  belt.HEAD) {
				if (event.getEntity().getItemBySlot(EquipmentSlot.CHEST).getItem() ==  belt.TORSO) {
					if (event.getEntity().getItemBySlot(EquipmentSlot.LEGS).getItem() ==  belt.LEGS) {
							if (RiderDriverItem.get_Form_Item(event.getEntity().getItemBySlot(EquipmentSlot.FEET), 1).get_PalyerModelInvisible())event.getEntity().setInvisible(true);
						}
					}
				}
			}
			
		}

		@SubscribeEvent
		public static void addRenderLivingEvent(RenderLivingEvent.Pre event) {

			float size = 1;
			boolean Tall = event.getEntity().hasEffect(Effect_core.BIG.get())||event.getEntity().hasEffect(Effect_core.STRETCH.get());

			if (event.getEntity().hasEffect(Effect_core.STRETCH.get())&!event.getEntity().hasEffect(Effect_core.SMALL.get())) { 
				size= size*((event.getEntity().getEffect(Effect_core.STRETCH.get()).getAmplifier())+1);
			}else if (event.getEntity().hasEffect(Effect_core.BIG.get())&!event.getEntity().hasEffect(Effect_core.SMALL.get())) { 
				size= size*((event.getEntity().getEffect(Effect_core.BIG.get()).getAmplifier())+1);
			}else  if (!event.getEntity().hasEffect(Effect_core.BIG.get())&event.getEntity().hasEffect(Effect_core.SMALL.get())) {
				size=(float) (size/2);
			}


			float size2 = event.getEntity().hasEffect(Effect_core.STRETCH.get())? 1:size;

			if (event.getEntity().hasEffect(Effect_core.FLAT.get())) { 
				size2= 0.1f;
			}
			if (event.getEntity() instanceof Player player) {

				player.self().getAttributeValue(ForgeMod.BLOCK_REACH.get());

			}
			float size3 = event.getEntity().hasEffect(Effect_core.STRETCH.get())? 1:size;

			if (event.getEntity().hasEffect(Effect_core.WIDE.get())) {
				size2=(float) (size2*3);
				size3=(float) (size3*3);
			}


			event.getPoseStack().scale(size3,size,size2);
		}

		@SubscribeEvent
		public static void addRenderPlayerEvent(RenderPlayerEvent.Pre event) {


		}
	}
	@Mod.EventBusSubscriber(modid = KamenRiderCraftCore.MODID)
	public static class ForgeCommonEvents {
		
		@SubscribeEvent
		public static void EquipmentChange(LivingEquipmentChangeEvent event) {
			event.getEntity().setInvisible(false);
		}

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

				}
			}
		}


		// /effect give @e kamenridercraft:big infinite 3

		@SubscribeEvent
		public static void addLivingDamageEvent(LivingDamageEvent event) {

			if ( event.getSource().getEntity() instanceof LivingEntity _livEnt) {
				if(event.getSource().is(DamageTypes.PLAYER_ATTACK)||event.getSource().is(DamageTypes.MOB_ATTACK)||event.getSource().is(DamageTypes.MOB_ATTACK_NO_AGGRO)) {

					if (_livEnt.hasEffect(Effect_core.FIRE_PUNCH.get())){
						event.getEntity().setSecondsOnFire(_livEnt.getEffect(Effect_core.FIRE_PUNCH.get()).getAmplifier()+1);
					}
					
					if (event.getEntity().hasEffect(Effect_core.FIRE_ARMOR.get())){
						_livEnt.setSecondsOnFire(event.getEntity().getEffect(Effect_core.FIRE_ARMOR.get()).getAmplifier()+1);
					}

					if (_livEnt.hasEffect(Effect_core.EXPLOSION_PUNCH.get())){
						boolean flag = net.minecraftforge.event.ForgeEventFactory.getMobGriefingEvent(_livEnt.level(), _livEnt);
						event.getEntity().level().explode(null, event.getEntity().getX(), event.getEntity().getY(), event.getEntity().getZ(),_livEnt.getEffect(Effect_core.EXPLOSION_PUNCH.get()).getAmplifier(), flag, Level.ExplosionInteraction.MOB);
					}
					
					if (event.getEntity().hasEffect(Effect_core.REFLECT.get())){
						event.getSource().getEntity().hurt(event.getSource(), (event.getAmount())*(1+event.getEntity().getEffect(Effect_core.REFLECT.get()).getAmplifier()+1));
					}

				}else if(event.getSource().is(DamageTypes.ARROW)||event.getSource().is(DamageTypes.MOB_PROJECTILE)) {
					if (_livEnt.hasEffect(Effect_core.FIRE_SHOT.get())){
						event.getEntity().setSecondsOnFire(_livEnt.getEffect(Effect_core.FIRE_SHOT.get()).getAmplifier()+1);
					}

					if (_livEnt.hasEffect(Effect_core.EXPLOSION_SHOT.get())){
						boolean flag = net.minecraftforge.event.ForgeEventFactory.getMobGriefingEvent(_livEnt.level(), _livEnt);
						event.getEntity().level().explode(null, event.getEntity().getX(), event.getEntity().getY(), event.getEntity().getZ(),_livEnt.getEffect(Effect_core.EXPLOSION_SHOT.get()).getAmplifier(), flag, Level.ExplosionInteraction.MOB);
					}
					}
				
				if (event.getEntity().hasEffect(Effect_core.REFLECT.get())){
					event.getSource().getEntity().hurt(event.getSource(), (event.getAmount())*(1+event.getEntity().getEffect(Effect_core.REFLECT.get()).getAmplifier()+1));
				}
				}

			


			
			//event.getEntity().hasEffect(Effect_core.BIG.get())||event.getEntity().hasEffect(Effect_core.STRETCH.get());

		}
		
		@SubscribeEvent
		public static void addCustomWandererTrades(WandererTradesEvent event) {
			List<ItemListing> trades = event.getGenericTrades();
			ItemStack stack = new ItemStack(Rider_Blocks.GINGA_METEOR.get(), 1);
			trades.add((trader, rand) -> new MerchantOffer(
					new ItemStack(Items.EMERALD, 2),
					stack,10,8,0.02F));
			
			trades.add((trader, rand) -> new MerchantOffer(
					new ItemStack(Items.EMERALD, 2),
					new ItemStack(Miscellaneous_Rider_Items.KUUGA_AMAZING_MIGHTY_ARTIST.get(), 1),10,8,0.02F));
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
			if(event.getType() == VillagerProfession.LIBRARIAN) {
				Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
				ItemStack stack = new ItemStack(Modded_item_core.CARD_WARRIOR_KAMEN_RIDER_MANGA.get(), 1);
				int villagerLevel = 2;

				trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
						new ItemStack(Items.EMERALD, 2),
						stack,10,8,0.02F));
			}
			
			if(event.getType() == RiderVillagers.SHOCKER_VILLAGER.get()) {
				Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
				ItemStack stack = new ItemStack(Ichigo_Rider_Items.PREFECTER.get(), 1);
				int villagerLevel = 1;

				trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
						new ItemStack(Ichigo_Rider_Items.RIDOL_CORE.get(), 1),
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
				ItemStack stack = new ItemStack(Miscellaneous_Rider_Items.GORO_WINE_BOTTLE.get(), 1);
				int villagerLevel = 2;

				trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
						new ItemStack(Items.EMERALD, 2),
						stack,10,8,0.02F));
			} 

			if(event.getType() == RiderVillagers.SHOCKER_VILLAGER.get()) {
				Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
				ItemStack stack = new ItemStack(Rider_Blocks.ICHIGO_CHAIR.get(), 1);
				int villagerLevel = 3;

				trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
						new ItemStack(Items.EMERALD, 2),
						stack,10,8,0.02F));
			} 

			if(event.getType() == RiderVillagers.SHOCKER_VILLAGER.get()) {
				Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
				ItemStack stack = new ItemStack(Ichigo_Rider_Items.NOPHOON_CORE.get(), 1);
				int villagerLevel = 3;

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
			
			if(event.getType() == RiderVillagers.HUMAGEAR_VILLAGER.get()) {
				Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
				ItemStack stack = new ItemStack(Zero_One_Rider_Items.BLANK_PROGRISEKEY.get(), 3);
				int villagerLevel = 1;

				trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
						new ItemStack(Items.EMERALD, 1),
						stack,10,8,0.02F));
			}
			if(event.getType() == RiderVillagers.HUMAGEAR_VILLAGER.get()) {
				Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
				ItemStack stack = new ItemStack(Items.EMERALD, 1);
				int villagerLevel = 1;

				trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
						new ItemStack(Zero_One_Rider_Items.HIDEN_METAL.get(), 3),
						stack,10,8,0.02F));
			}
			if(event.getType() == RiderVillagers.HUMAGEAR_VILLAGER.get()) {
				Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
				ItemStack stack = new ItemStack(Zero_One_Rider_Items.HUMAGEAR_PROGRISEKEY.get(), 3);
				int villagerLevel = 2;

				trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
						new ItemStack(Items.EMERALD, 2),
						stack,10,8,0.02F));
			}
			if(event.getType() == RiderVillagers.HUMAGEAR_VILLAGER.get()) {
				Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
				ItemStack stack = new ItemStack(Zero_One_Rider_Items.THOUSAND_KEY.get(), 1);
				int villagerLevel = 3;

				trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
						new ItemStack(Items.EMERALD, 12),
						stack,10,8,0.02F));
			}
			
			if(event.getType() == RiderVillagers.KAMEN_CAFE_BUTLER.get()) {
				Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
				ItemStack stack = new ItemStack(Miscellaneous_Rider_Items.CANDY.get(), 3);
				int villagerLevel = 1;

				trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
						new ItemStack(Items.EMERALD, 1),
						stack,10,8,0.02F));
			}
			if(event.getType() == RiderVillagers.KAMEN_CAFE_BUTLER.get()) {
				Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
				ItemStack stack = new ItemStack(Miscellaneous_Rider_Items.CONTRACT_CHAOSTONE.get(), 1);
				int villagerLevel = 1;

				trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
						new ItemStack(Items.EMERALD, 2),
						stack,10,8,0.02F));
			}
			if(event.getType() == RiderVillagers.KAMEN_CAFE_BUTLER.get()) {
				Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
				ItemStack stack = new ItemStack(Miscellaneous_Rider_Items.GASHA_TICKET.get(), 1);
				int villagerLevel = 2;

				trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(
						new ItemStack(Items.EMERALD, 6),
						stack,10,8,0.02F));
			}
			if(event.getType() == RiderVillagers.KAMEN_CAFE_BUTLER.get()) {
				Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
				ItemStack stack = new ItemStack(Miscellaneous_Rider_Items.ENERGY_DRINK.get(), 1);
				int villagerLevel = 2;

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

		event.register(MobsCore.ZECTROOPER.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, Monster::checkMonsterSpawnRules, SpawnPlacementRegisterEvent.Operation.REPLACE);
		event.register(MobsCore.SHADOW_TROOPER.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, Monster::checkMonsterSpawnRules, SpawnPlacementRegisterEvent.Operation.REPLACE);
		event.register(MobsCore.NEOTROOPER.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, Monster::checkMonsterSpawnRules, SpawnPlacementRegisterEvent.Operation.REPLACE);

		event.register(MobsCore.NEW_MOLE_IMAGIN_SAND.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, Monster::checkMonsterSpawnRules, SpawnPlacementRegisterEvent.Operation.REPLACE);

		event.register(MobsCore.MASQUERADE.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, Monster::checkMonsterSpawnRules, SpawnPlacementRegisterEvent.Operation.REPLACE);
		event.register(MobsCore.FOUNDATION_X_MASQUERADE.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, Monster::checkMonsterSpawnRules, SpawnPlacementRegisterEvent.Operation.REPLACE);
		event.register(MobsCore.YUMMY.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, Monster::checkMonsterSpawnRules, SpawnPlacementRegisterEvent.Operation.REPLACE);

		event.register(MobsCore.BUGSTERVIRUS.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, Monster::checkMonsterSpawnRules, SpawnPlacementRegisterEvent.Operation.REPLACE);
	//	event.register(MobsCore.LOVELY_BUGSTER.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, Monster::checkMonsterSpawnRules, SpawnPlacementRegisterEvent.Operation.REPLACE);
		event.register(MobsCore.RIDEPLAYER.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, Monster::checkMonsterSpawnRules, SpawnPlacementRegisterEvent.Operation.REPLACE);
		
		event.register(MobsCore.TRILOBITE_MAGIA.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, Monster::checkMonsterSpawnRules, SpawnPlacementRegisterEvent.Operation.REPLACE);
		event.register(MobsCore.DODO_MAGIA_CHICK.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, Monster::checkMonsterSpawnRules, SpawnPlacementRegisterEvent.Operation.REPLACE);
		event.register(MobsCore.BATTLE_RAIDER.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, Monster::checkMonsterSpawnRules, SpawnPlacementRegisterEvent.Operation.REPLACE);
		event.register(MobsCore.ABADDON.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, Monster::checkMonsterSpawnRules, SpawnPlacementRegisterEvent.Operation.REPLACE);

		event.register(MobsCore.PAWN_JYAMATO.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, Monster::checkMonsterSpawnRules, SpawnPlacementRegisterEvent.Operation.REPLACE);
		event.register(MobsCore.JYAMATO_RIDER.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, Monster::checkMonsterSpawnRules, SpawnPlacementRegisterEvent.Operation.REPLACE);
		event.register(MobsCore.GM_RIDER.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, Monster::checkMonsterSpawnRules, SpawnPlacementRegisterEvent.Operation.REPLACE);

		
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

		event.put(MobsCore.ZECTROOPER.get(), ZectrooperEntity.setAttributes());
		event.put(MobsCore.SHADOW_TROOPER.get(), ShadowTrooperEntity.setAttributes());
		event.put(MobsCore.NEOTROOPER.get(), NeotrooperEntity.setAttributes());
		event.put(MobsCore.CAUCASUS.get(), CaucasusEntity.setAttributes());

		event.put(MobsCore.NEW_MOLE_IMAGIN.get(), NewMoleImaginEntity.setAttributes());
		event.put(MobsCore.NEW_MOLE_IMAGIN_SAND.get(), NewMoleImaginSandEntity.setAttributes());
		event.put(MobsCore.GAOH.get(), GaohEntity.setAttributes());
		event.put(MobsCore.MOMOTAROS.get(), MomotarosEntity.setAttributes());
		event.put(MobsCore.URATAROS.get(), UratarosEntity.setAttributes());
		event.put(MobsCore.KINTAROS.get(), KintarosEntity.setAttributes());
		event.put(MobsCore.RYUTAROS.get(), RyutarosEntity.setAttributes());

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

		event.put(MobsCore.BUGSTERVIRUS.get(), BugsterVirusEntity.setAttributes());
		//event.put(MobsCore.MIGHTY_BUGSTER.get(), GodaEntity.setAttributes());
		//event.put(MobsCore.TADDLE_BUGSTER.get(), GodaEntity.setAttributes());
		//event.put(MobsCore.BANG_BANG_BUGSTER.get(), GodaEntity.setAttributes());
	//	event.put(MobsCore.LOVELY_BUGSTER.get(), LovelyBugsterEntity.setAttributes());
		//event.put(MobsCore.SALTY_BUGSTER.get(), GodaEntity.setAttributes());
		//event.put(MobsCore.CHARLIE_BUGSTER.get(), GodaEntity.setAttributes());
		//event.put(MobsCore.VERNIER_BUGSTER.get(), GodaEntity.setAttributes());
		//event.put(MobsCore.GATTON_BUGSTER.get(), GodaEntity.setAttributes());
		//event.put(MobsCore.KAIDEN_BUGSTER.get(), GodaEntity.setAttributes());
		//event.put(MobsCore.MOTORS_BUGSTER.get(), GodaEntity.setAttributes());
		event.put(MobsCore.GRAPHITE_BUGSTER.get(), GraphiteBugsterEntity.setAttributes());
		//event.put(MobsCore.ARANBURA_BUGSTER.get(), GodaEntity.setAttributes());
		//event.put(MobsCore.REVOL_BUGSTER.get(), GodaEntity.setAttributes());
		//event.put(MobsCore.LOVELICA_BUGSTER.get(), LovelicaBugsterEntity.setAttributes());
		event.put(MobsCore.GENM.get(), GenmEntity.setAttributes());
		event.put(MobsCore.POPPY_RED.get(), PoppyRedEntity.setAttributes());
		event.put(MobsCore.RIDEPLAYER.get(), RideplayerEntity.setAttributes());
		event.put(MobsCore.PARADX.get(), ParaDxEntity.setAttributes());
		event.put(MobsCore.CRONUS.get(), CronusEntity.setAttributes());
		
		event.put(MobsCore.TRILOBITE_MAGIA.get(), TrilobiteMagiaEntity.setAttributes());
		event.put(MobsCore.DODO_MAGIA_CHICK.get(), DodoMagiaChickEntity.setAttributes());
		event.put(MobsCore.BATTLE_RAIDER.get(), BattleRaiderEntity.setAttributes());
		event.put(MobsCore.ABADDON.get(), AbaddonEntity.setAttributes());
		event.put(MobsCore.MAGIA.get(), MagiaEntity.setAttributes());
		event.put(MobsCore.GIGER.get(), GigerEntity.setAttributes());
		event.put(MobsCore.HOROBI.get(), HorobiEntity.setAttributes());
		event.put(MobsCore.JIN.get(), JinEntity.setAttributes());
		event.put(MobsCore.IKAZUCHI.get(), IkazuchiEntity.setAttributes());
		event.put(MobsCore.NAKI.get(), NakiEntity.setAttributes());
		event.put(MobsCore.DODO_MAGIA.get(), DodoMagiaEntity.setAttributes());
		event.put(MobsCore.RAIDER.get(), RaiderEntity.setAttributes());
		event.put(MobsCore.ARK_ZERO.get(), ArkZeroEntity.setAttributes());
		event.put(MobsCore.ABADDON_COMMANDER.get(), AbaddonCommanderEntity.setAttributes());
		event.put(MobsCore.EDEN.get(), EdenEntity.setAttributes());
		event.put(MobsCore.ZAIA.get(), ZaiaEntity.setAttributes());
		event.put(MobsCore.DIRE_WOLF_SOLD_MAGIA.get(), DireWolfSoldMagiaEntity.setAttributes());
		event.put(MobsCore.SERVAL_TIGER_SOLD_MAGIA.get(), ServalTigerSoldMagiaEntity.setAttributes());
		
		event.put(MobsCore.PAWN_JYAMATO.get(), PawnJyamatoEntity.setAttributes());
		event.put(MobsCore.JYAMATO_RIDER.get(), JyamatoRiderEntity.setAttributes());
		event.put(MobsCore.GM_RIDER.get(), GmRiderEntity.setAttributes());

		event.put(MobsCore.MACEHINE_TORADOR.get(), baseBikeEntity.setAttributes());
		event.put(MobsCore.HARDBOILER.get(), baseBikeEntity.setAttributes());
		event.put(MobsCore.SKULLBOILER.get(), baseBikeEntity.setAttributes());

		event.put(MobsCore.RIDER_SUMMON.get(), RiderSummonEntity.setAttributes());
		event.put(MobsCore.PARADX_SUMMON.get(), ParaDXSummonEntity.setAttributes());

	}

}
