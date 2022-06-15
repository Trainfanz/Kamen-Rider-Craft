package Kamen_Rider_Craft_4TH;

import Kamen_Rider_Craft_4TH.biome.riderBiomes;
import Kamen_Rider_Craft_4TH.mobs.EntityAnkh;
import Kamen_Rider_Craft_4TH.mobs.EntityIS;
import Kamen_Rider_Craft_4TH.mobs.EntityKintaros;
import Kamen_Rider_Craft_4TH.mobs.EntityLazer;
import Kamen_Rider_Craft_4TH.mobs.EntityMomotaros;
import Kamen_Rider_Craft_4TH.mobs.EntityPoppy;
import Kamen_Rider_Craft_4TH.mobs.EntityRyutaros;
import Kamen_Rider_Craft_4TH.mobs.EntityUrataros;
import Kamen_Rider_Craft_4TH.mobs.EntityVice;
import Kamen_Rider_Craft_4TH.mobs.Entity_kodama_suika_arms;
import Kamen_Rider_Craft_4TH.mobs.Entity_ridevendor_vending;
import Kamen_Rider_Craft_4TH.mobs.Entityaccel;
import Kamen_Rider_Craft_4TH.mobs.entity_batta_can;
import Kamen_Rider_Craft_4TH.mobs.entity_gorilla_can;
import Kamen_Rider_Craft_4TH.mobs.entity_kujaku_can;
import Kamen_Rider_Craft_4TH.mobs.entity_ptera_can;
import Kamen_Rider_Craft_4TH.mobs.entity_taka_can;
import Kamen_Rider_Craft_4TH.mobs.entity_tako_can;
import Kamen_Rider_Craft_4TH.mobs.entity_tora_can;
import Kamen_Rider_Craft_4TH.mobs.entity_tricera_can;
import Kamen_Rider_Craft_4TH.mobs.entity_unagi_can;
import Kamen_Rider_Craft_4TH.mobs.Boss.EntityChronos;
import Kamen_Rider_Craft_4TH.mobs.Boss.EntityTerror;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_Arc_zero;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_BloodStalk;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_Build_RT;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_Calibur;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_Duke;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_Durendal;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_EngineBros;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_Eternal;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_Evil;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_Falchion;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_Ginga;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_HellBros;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_Kaiser;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_KaiserReverse;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_Marika;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_NightRogue;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_Para_dx;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_Red_Poppy;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_RemoconBros;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_Sabela;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_Sigurd;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_Solomon;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_White_Woz;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_ZangetsuShin;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_ankh_complete;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_ankh_lost;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_another_build;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_bikaiser;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_clay_doll_dopant;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_commander_dopant;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_core;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_demushu;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_dodomagia;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_evolt;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_evolt_2;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_evolt_3;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_gamel;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_gaoh;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_genm;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_grease;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_horobi;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_ikazuchi;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_jin;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_kazari;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_legeiel;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_legeiel_forbidden;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_lord_baron;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_magia;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_mezool;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_muchiri;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_naki;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_nazca_dopant;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_orga;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_poseidon;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_power_up_core;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_red_nazca_dopant;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_redyue;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_roshuo;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_shocker_riders;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_smilodon_dopant;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_storious;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_super_gingaoh;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_taboo_dopant;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_uva;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_weather_dopant;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_zooous;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_zooous_predator;
import Kamen_Rider_Craft_4TH.mobs.Boss.entity_abaddon_high;
import Kamen_Rider_Craft_4TH.mobs.Boss.entity_aranbura_bugster;
import Kamen_Rider_Craft_4TH.mobs.Boss.entity_blood;
import Kamen_Rider_Craft_4TH.mobs.Boss.entity_charybdis_hercules;
import Kamen_Rider_Craft_4TH.mobs.Boss.entity_desast;
import Kamen_Rider_Craft_4TH.mobs.Boss.entity_dire_wolf_sold_magia;
import Kamen_Rider_Craft_4TH.mobs.Boss.entity_eden;
import Kamen_Rider_Craft_4TH.mobs.Boss.entity_gatton_bugster;
import Kamen_Rider_Craft_4TH.mobs.Boss.entity_killbus;
import Kamen_Rider_Craft_4TH.mobs.Boss.entity_metal_build;
import Kamen_Rider_Craft_4TH.mobs.Boss.entity_motors_bugster;
import Kamen_Rider_Craft_4TH.mobs.Boss.entity_raider;
import Kamen_Rider_Craft_4TH.mobs.Boss.entity_revol_bugster;
import Kamen_Rider_Craft_4TH.mobs.Boss.entity_salty_bugster;
import Kamen_Rider_Craft_4TH.mobs.Boss.entity_serval_tiger_sold_magia;
import Kamen_Rider_Craft_4TH.mobs.Boss.entity_storious_rider;
import Kamen_Rider_Craft_4TH.mobs.Boss.entity_zaia;
import Kamen_Rider_Craft_4TH.mobs.Henchmen.EntityBugsterVirus;
import Kamen_Rider_Craft_4TH.mobs.Henchmen.EntityByakkoInves;
import Kamen_Rider_Craft_4TH.mobs.Henchmen.EntityElementaryInvesBlue;
import Kamen_Rider_Craft_4TH.mobs.Henchmen.EntityElementaryInvesGreen;
import Kamen_Rider_Craft_4TH.mobs.Henchmen.EntityElementaryInvesRed;
import Kamen_Rider_Craft_4TH.mobs.Henchmen.EntityHekijaInves;
import Kamen_Rider_Craft_4TH.mobs.Henchmen.EntityKurokageTroopers;
import Kamen_Rider_Craft_4TH.mobs.Henchmen.EntityMasquerade;
import Kamen_Rider_Craft_4TH.mobs.Henchmen.EntityNebulaBugsterVirus;
import Kamen_Rider_Craft_4TH.mobs.Henchmen.EntityRidePlayer;
import Kamen_Rider_Craft_4TH.mobs.Henchmen.EntityRiotrooper;
import Kamen_Rider_Craft_4TH.mobs.Henchmen.EntityShimi;
import Kamen_Rider_Craft_4TH.mobs.Henchmen.Entity_foundation_x_masquerade;
import Kamen_Rider_Craft_4TH.mobs.Henchmen.Entity_giff_junior;
import Kamen_Rider_Craft_4TH.mobs.Henchmen.Entity_giger;
import Kamen_Rider_Craft_4TH.mobs.Henchmen.Entity_hard_guardian;
import Kamen_Rider_Craft_4TH.mobs.Henchmen.Entity_knight_soldier;
import Kamen_Rider_Craft_4TH.mobs.Henchmen.Entity_magiadodo_chick;
import Kamen_Rider_Craft_4TH.mobs.Henchmen.Entity_needle_smash;
import Kamen_Rider_Craft_4TH.mobs.Henchmen.Entity_trilobite_magia;
import Kamen_Rider_Craft_4TH.mobs.Henchmen.Entity_yummy;
import Kamen_Rider_Craft_4TH.mobs.Henchmen.Entity_zu_gumun_ba;
import Kamen_Rider_Craft_4TH.mobs.Henchmen.Entitydestron_combatman;
import Kamen_Rider_Craft_4TH.mobs.Henchmen.Entitygamma_commando;
import Kamen_Rider_Craft_4TH.mobs.Henchmen.Entitygod_warfare_agent;
import Kamen_Rider_Craft_4TH.mobs.Henchmen.Entityguardian;
import Kamen_Rider_Craft_4TH.mobs.Henchmen.Entityguardian_hokuto;
import Kamen_Rider_Craft_4TH.mobs.Henchmen.Entityguardian_seito;
import Kamen_Rider_Craft_4TH.mobs.Henchmen.Entitynew_mole_imagin;
import Kamen_Rider_Craft_4TH.mobs.Henchmen.Entitynew_mole_imagin_sand;
import Kamen_Rider_Craft_4TH.mobs.Henchmen.Entityred_follower;
import Kamen_Rider_Craft_4TH.mobs.Henchmen.Entityshocker_combatman;
import Kamen_Rider_Craft_4TH.mobs.Henchmen.entity_abaddon_low;
import Kamen_Rider_Craft_4TH.mobs.Henchmen.entity_ari_commando;
import Kamen_Rider_Craft_4TH.mobs.Henchmen.entity_bang_bang_bugster;
import Kamen_Rider_Craft_4TH.mobs.Henchmen.entity_battle_raider;
import Kamen_Rider_Craft_4TH.mobs.Henchmen.entity_black_satan_soldier;
import Kamen_Rider_Craft_4TH.mobs.Henchmen.entity_chap;
import Kamen_Rider_Craft_4TH.mobs.Henchmen.entity_charybdis;
import Kamen_Rider_Craft_4TH.mobs.Henchmen.entity_combat_roid;
import Kamen_Rider_Craft_4TH.mobs.Henchmen.entity_dogma_fighter;
import Kamen_Rider_Craft_4TH.mobs.Henchmen.entity_guardian_downfall;
import Kamen_Rider_Craft_4TH.mobs.Henchmen.entity_mighty_bugster;
import Kamen_Rider_Craft_4TH.mobs.Henchmen.entity_phantom_crusher;
import Kamen_Rider_Craft_4TH.mobs.Henchmen.entity_taddle_bugster;
import Kamen_Rider_Craft_4TH.mobs.bikes.EntityAcrobatter;
import Kamen_Rider_Craft_4TH.mobs.bikes.EntityDiagoSpeedy;
import Kamen_Rider_Craft_4TH.mobs.bikes.EntityExaidBike;
import Kamen_Rider_Craft_4TH.mobs.bikes.EntityMachineBuilder;
import Kamen_Rider_Craft_4TH.mobs.bikes.EntityRidevendor;
import Kamen_Rider_Craft_4TH.mobs.bikes.EntityRiseHopperBike;
import Kamen_Rider_Craft_4TH.mobs.bikes.EntityRoseAttacker;
import Kamen_Rider_Craft_4TH.mobs.bikes.EntitySakuraHurricane;
import Kamen_Rider_Craft_4TH.mobs.bikes.EntityToridevendor;
import Kamen_Rider_Craft_4TH.mobs.bikes.Entity_machine_denbird;
import Kamen_Rider_Craft_4TH.mobs.bikes.Entity_ridoron;
import Kamen_Rider_Craft_4TH.mobs.bikes.Entityhardboilder;
import Kamen_Rider_Craft_4TH.mobs.bikes.Entitymachine_tornador;
import Kamen_Rider_Craft_4TH.mobs.bikes.Entityskullboilder;
import Kamen_Rider_Craft_4TH.util.Refercence;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EntityList.EntityEggInfo;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeBeach;
import net.minecraft.world.biome.BiomeDesert;
import net.minecraft.world.biome.BiomeForest;
import net.minecraft.world.biome.BiomeForestMutated;
import net.minecraft.world.biome.BiomeHills;
import net.minecraft.world.biome.BiomeJungle;
import net.minecraft.world.biome.BiomeMesa;
import net.minecraft.world.biome.BiomeMushroomIsland;
import net.minecraft.world.biome.BiomeOcean;
import net.minecraft.world.biome.BiomePlains;
import net.minecraft.world.biome.BiomeRiver;
import net.minecraft.world.biome.BiomeSavanna;
import net.minecraft.world.biome.BiomeSavannaMutated;
import net.minecraft.world.biome.BiomeSnow;
import net.minecraft.world.biome.BiomeStoneBeach;
import net.minecraft.world.biome.BiomeSwamp;
import net.minecraft.world.biome.BiomeTaiga;
import net.minecraft.world.biome.BiomeVoid;
import net.minecraftforge.common.BiomeManager.BiomeType;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class mobsCore {

	public static int MobID = 500;

	public static void Addmob(){

		//Biome.getBiome(8)

		/**
1, "plains"
2, "desert"
3, "extreme_hills"
4, "forest"
5, "taiga"
6, "swampland"
10, "frozen_ocean"
12, "ice_flats"
13, "ice_mountains"
16, "beaches"
17, "desert_hills"
18, "forest_hills"
19, "taiga_hills"
20, "smaller_extreme_hills"
21, "jungle"
22, "jungle_hills"
27, "birch_forest"
28, "birch_forest_hills"
29, "roofed_forest"
30, "taiga_cold"
31, "taiga_cold_hills"
32, "redwood_taiga"
33, "redwood_taiga_hills"
34, "extreme_hills_with_trees"
35, "savanna"
36, "savanna_rock"
37, "mesa"
38, "mesa_rock"
39, "mesa_clear_rock"
		 **/

		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":ShockerCombatmanMob"),Entityshocker_combatman.class, "ShockerCombatmanMob", newMobID(), TokuCraft_core.instance, 80, 3, false, 000000,0xFFFFFF);
		EntityRegistry.addSpawn(Entityshocker_combatman.class,  15, 1, 4, EnumCreatureType.MONSTER,Biome.getBiome(1),Biome.getBiome(2),Biome.getBiome(3),Biome.getBiome(4),Biome.getBiome(5),Biome.getBiome(6),Biome.getBiome(7),Biome.getBiome(10),Biome.getBiome(11),Biome.getBiome(12),Biome.getBiome(14),Biome.getBiome(15),Biome.getBiome(16),Biome.getBiome(17),Biome.getBiome(18),Biome.getBiome(19),Biome.getBiome(20),Biome.getBiome(21),Biome.getBiome(22),Biome.getBiome(23),Biome.getBiome(24),Biome.getBiome(25),Biome.getBiome(26),Biome.getBiome(27),Biome.getBiome(28),Biome.getBiome(29),Biome.getBiome(30),Biome.getBiome(31),Biome.getBiome(32),Biome.getBiome(33),Biome.getBiome(34),Biome.getBiome(35),Biome.getBiome(36),Biome.getBiome(37),Biome.getBiome(38),Biome.getBiome(39),Biome.getBiome(129),Biome.getBiome(130),Biome.getBiome(131),Biome.getBiome(132),Biome.getBiome(133),Biome.getBiome(134),Biome.getBiome(140),Biome.getBiome(149),Biome.getBiome(151),Biome.getBiome(155),Biome.getBiome(156),Biome.getBiome(157),Biome.getBiome(158),Biome.getBiome(160),Biome.getBiome(161),Biome.getBiome(162),Biome.getBiome(163),Biome.getBiome(164),Biome.getBiome(165),Biome.getBiome(166),Biome.getBiome(167));

		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":shocker_ridersMob"),Entity_shocker_riders.class, "shocker_ridersMob", newMobID(), TokuCraft_core.instance, 80, 3, false, 000000,0xFFFFFF);
		
		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":DestronCombatmanMob"),Entitydestron_combatman.class, "DestronCombatmanMob", newMobID(), TokuCraft_core.instance, 80, 3, false, 000000,0xFFFFFF);
		EntityRegistry.addSpawn(Entitydestron_combatman.class,  15, 1, 4, EnumCreatureType.MONSTER,Biome.getBiome(2),Biome.getBiome(3),Biome.getBiome(4),Biome.getBiome(6),Biome.getBiome(10)
				,Biome.getBiome(28),Biome.getBiome(30),Biome.getBiome(31),Biome.getBiome(32),Biome.getBiome(33),Biome.getBiome(34),Biome.getBiome(39));

		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":GodWarfareAgentMob"),Entitygod_warfare_agent.class, "GodWarfareAgentMob", newMobID(), TokuCraft_core.instance, 80, 3, false, 000000,0x7e0000);
		EntityRegistry.addSpawn(Entitygod_warfare_agent.class,  15, 1, 4, EnumCreatureType.MONSTER,Biome.getBiome(1),Biome.getBiome(2),Biome.getBiome(5),Biome.getBiome(12),Biome.getBiome(13)
				,Biome.getBiome(16),Biome.getBiome(21),Biome.getBiome(27),Biome.getBiome(28),Biome.getBiome(30),Biome.getBiome(33),Biome.getBiome(35));

		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":RedFollowerMob"),Entityred_follower.class, "RedFollowerMob", newMobID(), TokuCraft_core.instance, 80, 3, false, 0x7e0000,0xcacaca);
		EntityRegistry.addSpawn(Entityred_follower.class,  15, 1, 4, EnumCreatureType.MONSTER,Biome.getBiome(2),Biome.getBiome(21),Biome.getBiome(22),Biome.getBiome(35),Biome.getBiome(36)
				,Biome.getBiome(16),Biome.getBiome(37),Biome.getBiome(38),Biome.getBiome(39));

		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":BlackSatanSoldierMob"),entity_black_satan_soldier.class, "BlackSatanSoldierMob", newMobID(), TokuCraft_core.instance, 80, 3, false, 000000,0xcfaf00);
		EntityRegistry.addSpawn(entity_black_satan_soldier.class,  15, 1, 4, EnumCreatureType.MONSTER,Biome.getBiome(1),Biome.getBiome(3),Biome.getBiome(6),Biome.getBiome(10)
				,Biome.getBiome(12),Biome.getBiome(21),Biome.getBiome(27),Biome.getBiome(29),Biome.getBiome(34),Biome.getBiome(36),Biome.getBiome(37));

		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":AriCommandoMob"),entity_ari_commando.class, "AriCommandoMob", newMobID(), TokuCraft_core.instance, 80, 3, false, 000000,0x121212);
		EntityRegistry.addSpawn(entity_ari_commando.class,  15, 1, 4, EnumCreatureType.MONSTER,Biome.getBiome(3),Biome.getBiome(13),Biome.getBiome(17),Biome.getBiome(18),Biome.getBiome(20)
				,Biome.getBiome(29),Biome.getBiome(33),Biome.getBiome(34),Biome.getBiome(39));

		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":DogmaFighterMob"),entity_dogma_fighter.class, "DogmaFighterMob", newMobID(), TokuCraft_core.instance, 80, 3, false, 0x730000,0xa5a5a5);
		EntityRegistry.addSpawn(entity_dogma_fighter.class,  15, 1, 4, EnumCreatureType.MONSTER,Biome.getBiome(4),Biome.getBiome(6),Biome.getBiome(12),Biome.getBiome(13),Biome.getBiome(16)
				,Biome.getBiome(17),Biome.getBiome(18),Biome.getBiome(19),Biome.getBiome(20),Biome.getBiome(22),Biome.getBiome(27),Biome.getBiome(30),Biome.getBiome(31)
				,Biome.getBiome(32),Biome.getBiome(36),Biome.getBiome(37),Biome.getBiome(38));

		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":CombatRoidMob"),entity_combat_roid.class, "CombatRoidMob", newMobID(), TokuCraft_core.instance, 80, 3, false, 0xa5a5a5,0x8c0000);
		EntityRegistry.addSpawn(entity_combat_roid.class,  15, 1, 4, EnumCreatureType.MONSTER,Biome.getBiome(1),Biome.getBiome(4),Biome.getBiome(5),Biome.getBiome(6),Biome.getBiome(10)
				,Biome.getBiome(16),Biome.getBiome(17),Biome.getBiome(18),Biome.getBiome(19),Biome.getBiome(20),Biome.getBiome(27),Biome.getBiome(28),Biome.getBiome(29),Biome.getBiome(31)
				,Biome.getBiome(35),Biome.getBiome(38));

		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":ChapMob"),entity_chap.class, "ChapMob", newMobID(), TokuCraft_core.instance, 80, 3, false, 000000,0xFFFFFF);
		EntityRegistry.addSpawn(entity_chap.class,  15, 1, 4, EnumCreatureType.MONSTER,Biome.getBiome(1),Biome.getBiome(4),Biome.getBiome(5),Biome.getBiome(6),Biome.getBiome(10)
				,Biome.getBiome(16),Biome.getBiome(17),Biome.getBiome(18),Biome.getBiome(19),Biome.getBiome(20),Biome.getBiome(27),Biome.getBiome(28),Biome.getBiome(29),Biome.getBiome(31)
				,Biome.getBiome(35),Biome.getBiome(38));


		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":ZuGumunBaMob"), Entity_zu_gumun_ba.class, "ZuGumunBaMob", newMobID(), TokuCraft_core.instance, 80, 3, false,0xf8ba57, 0xaf8e59);
		EntityRegistry.addSpawn(Entity_zu_gumun_ba.class, 15, 1, 4 ,EnumCreatureType.MONSTER,Biome.getBiome(1),Biome.getBiome(2),Biome.getBiome(3),Biome.getBiome(4),Biome.getBiome(5),Biome.getBiome(6),Biome.getBiome(7),Biome.getBiome(10),Biome.getBiome(11),Biome.getBiome(12),Biome.getBiome(14),Biome.getBiome(15),Biome.getBiome(16),Biome.getBiome(17),Biome.getBiome(18),Biome.getBiome(19),Biome.getBiome(20),Biome.getBiome(21),Biome.getBiome(22),Biome.getBiome(23),Biome.getBiome(24),Biome.getBiome(25),Biome.getBiome(26),Biome.getBiome(27),Biome.getBiome(28),Biome.getBiome(29),Biome.getBiome(30),Biome.getBiome(31),Biome.getBiome(32),Biome.getBiome(33),Biome.getBiome(34),Biome.getBiome(35),Biome.getBiome(36),Biome.getBiome(37),Biome.getBiome(38),Biome.getBiome(39),Biome.getBiome(129),Biome.getBiome(130),Biome.getBiome(131),Biome.getBiome(132),Biome.getBiome(133),Biome.getBiome(134),Biome.getBiome(140),Biome.getBiome(149),Biome.getBiome(151),Biome.getBiome(155),Biome.getBiome(156),Biome.getBiome(157),Biome.getBiome(158),Biome.getBiome(160),Biome.getBiome(161),Biome.getBiome(162),Biome.getBiome(163),Biome.getBiome(164),Biome.getBiome(165),Biome.getBiome(166),Biome.getBiome(167));

		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":RiotrooperMob"),EntityRiotrooper.class, "RiotrooperMob", newMobID(), TokuCraft_core.instance, 80, 3, false,0xf1c192, 0x854303);
		EntityRegistry.addSpawn(EntityRiotrooper.class,  15, 1, 4, EnumCreatureType.MONSTER,Biome.getBiome(8));

		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":OrgaMob"), Entity_orga.class, "OrgaMob", newMobID(), TokuCraft_core.instance, 80, 3, false,0x000000,0xc3ae4c);


		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":GaohMob"), Entity_gaoh.class, "GaohMob", newMobID(), TokuCraft_core.instance, 80, 3, false,0x1d1d1d,0xdea302);

		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":new_mole_imagin_sandMob"), Entitynew_mole_imagin_sand.class, "new_mole_imagin_sandMob", newMobID(), TokuCraft_core.instance, 80, 3, false,0xb7b7b1, 0x92908b);
		EntityRegistry.addSpawn(Entitynew_mole_imagin_sand.class,  15, 1, 4, EnumCreatureType.MONSTER,Biome.getBiome(1),Biome.getBiome(2),Biome.getBiome(3),Biome.getBiome(4),Biome.getBiome(5),Biome.getBiome(6),Biome.getBiome(7),Biome.getBiome(10),Biome.getBiome(11),Biome.getBiome(12),Biome.getBiome(14),Biome.getBiome(15),Biome.getBiome(16),Biome.getBiome(17),Biome.getBiome(18),Biome.getBiome(19),Biome.getBiome(20),Biome.getBiome(21),Biome.getBiome(22),Biome.getBiome(23),Biome.getBiome(24),Biome.getBiome(25),Biome.getBiome(26),Biome.getBiome(27),Biome.getBiome(28),Biome.getBiome(29),Biome.getBiome(30),Biome.getBiome(31),Biome.getBiome(32),Biome.getBiome(33),Biome.getBiome(34),Biome.getBiome(35),Biome.getBiome(36),Biome.getBiome(37),Biome.getBiome(38),Biome.getBiome(39),Biome.getBiome(129),Biome.getBiome(130),Biome.getBiome(131),Biome.getBiome(132),Biome.getBiome(133),Biome.getBiome(134),Biome.getBiome(140),Biome.getBiome(149),Biome.getBiome(151),Biome.getBiome(155),Biome.getBiome(156),Biome.getBiome(157),Biome.getBiome(158),Biome.getBiome(160),Biome.getBiome(161),Biome.getBiome(162),Biome.getBiome(163),Biome.getBiome(164),Biome.getBiome(165),Biome.getBiome(166),Biome.getBiome(167));

		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":new_mole_imaginMob"), Entitynew_mole_imagin.class, "new_mole_imaginMob", newMobID(), TokuCraft_core.instance, 80, 3, false,0xb7b7b1, 0x92908b);

		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":MomotarosMob"), EntityMomotaros.class, "MomotarosMob", newMobID(), TokuCraft_core.instance, 80, 3, false, 0x790000,0xef0000);
		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":UratarosMob"), EntityUrataros.class, "UratarosMob", newMobID(), TokuCraft_core.instance, 80, 3, false, 0x0075ec,0x003d7d);
		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":KintarosMob"), EntityKintaros.class, "KintarosMob", newMobID(), TokuCraft_core.instance, 80, 3, false, 0x212121,0xd2a900);
		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":RyutarosMob"), EntityRyutaros.class, "RyutarosMob", newMobID(), TokuCraft_core.instance, 80, 3, false, 0x3b114e,0x2a0b38);

		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":MasqueradeMob"), EntityMasquerade.class, "MasqueradeMob", newMobID(), TokuCraft_core.instance, 80, 3, false,000000, 0xFFFFFF);
		EntityRegistry.addSpawn(EntityMasquerade.class, 15, 1, 4 ,EnumCreatureType.MONSTER,Biome.getBiome(1),Biome.getBiome(2),Biome.getBiome(3),Biome.getBiome(4),Biome.getBiome(5),Biome.getBiome(6),Biome.getBiome(7),Biome.getBiome(10),Biome.getBiome(11),Biome.getBiome(12),Biome.getBiome(14),Biome.getBiome(15),Biome.getBiome(16),Biome.getBiome(17),Biome.getBiome(18),Biome.getBiome(19),Biome.getBiome(20),Biome.getBiome(21),Biome.getBiome(22),Biome.getBiome(23),Biome.getBiome(24),Biome.getBiome(25),Biome.getBiome(26),Biome.getBiome(27),Biome.getBiome(28),Biome.getBiome(29),Biome.getBiome(30),Biome.getBiome(31),Biome.getBiome(32),Biome.getBiome(33),Biome.getBiome(34),Biome.getBiome(35),Biome.getBiome(36),Biome.getBiome(37),Biome.getBiome(38),Biome.getBiome(39),Biome.getBiome(129),Biome.getBiome(130),Biome.getBiome(131),Biome.getBiome(132),Biome.getBiome(133),Biome.getBiome(134),Biome.getBiome(140),Biome.getBiome(149),Biome.getBiome(151),Biome.getBiome(155),Biome.getBiome(156),Biome.getBiome(157),Biome.getBiome(158),Biome.getBiome(160),Biome.getBiome(161),Biome.getBiome(162),Biome.getBiome(163),Biome.getBiome(164),Biome.getBiome(165),Biome.getBiome(166),Biome.getBiome(167));

		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":FoundationXMasqueradeMob"), Entity_foundation_x_masquerade.class, "FoundationXMasqueradeMob", newMobID(), TokuCraft_core.instance, 80, 3, false,000000, 0xFFFFFF);
		EntityRegistry.addSpawn(Entity_foundation_x_masquerade.class,  15, 1, 4, EnumCreatureType.MONSTER,Biome.getBiome(8));

		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":EternalMob"), Entity_Eternal.class, "EternalMob", newMobID(), TokuCraft_core.instance, 80, 3, false,0xffe892, 0xFFFFFF);


		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":yummyMob"), Entity_yummy.class, "yummyMob", newMobID(), TokuCraft_core.instance, 80, 3, false, 0x9f9789,0x161616);
		EntityRegistry.addSpawn(Entity_yummy.class, 15, 1, 4 ,EnumCreatureType.MONSTER,Biome.getBiome(1),Biome.getBiome(2),Biome.getBiome(3),Biome.getBiome(4),Biome.getBiome(5),Biome.getBiome(6),Biome.getBiome(7),Biome.getBiome(10),Biome.getBiome(11),Biome.getBiome(12),Biome.getBiome(14),Biome.getBiome(15),Biome.getBiome(16),Biome.getBiome(17),Biome.getBiome(18),Biome.getBiome(19),Biome.getBiome(20),Biome.getBiome(21),Biome.getBiome(22),Biome.getBiome(23),Biome.getBiome(24),Biome.getBiome(25),Biome.getBiome(26),Biome.getBiome(27),Biome.getBiome(28),Biome.getBiome(29),Biome.getBiome(30),Biome.getBiome(31),Biome.getBiome(32),Biome.getBiome(33),Biome.getBiome(34),Biome.getBiome(35),Biome.getBiome(36),Biome.getBiome(37),Biome.getBiome(38),Biome.getBiome(39),Biome.getBiome(129),Biome.getBiome(130),Biome.getBiome(131),Biome.getBiome(132),Biome.getBiome(133),Biome.getBiome(134),Biome.getBiome(140),Biome.getBiome(149),Biome.getBiome(151),Biome.getBiome(155),Biome.getBiome(156),Biome.getBiome(157),Biome.getBiome(158),Biome.getBiome(160),Biome.getBiome(161),Biome.getBiome(162),Biome.getBiome(163),Biome.getBiome(164),Biome.getBiome(165),Biome.getBiome(166),Biome.getBiome(167));

		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":knight_soldierMob"), Entity_knight_soldier.class, "knight_soldierMob", newMobID(), TokuCraft_core.instance, 80, 3, false, 0xca570f,0x919191);

		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":Ankhmob"),EntityAnkh.class, "Ankhmob", newMobID(), TokuCraft_core.instance, 80, 3, false, 0xFF0000, 0x1FFF2E);
		EntityRegistry.addSpawn(EntityAnkh.class,  1, 1, 1, EnumCreatureType.CREATURE,Biome.getBiome(1),Biome.getBiome(2),Biome.getBiome(3),Biome.getBiome(4),Biome.getBiome(5),Biome.getBiome(6),Biome.getBiome(7),Biome.getBiome(10),Biome.getBiome(11),Biome.getBiome(12),Biome.getBiome(13));

		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":uvaMob"), Entity_uva.class, "uvaMob", newMobID(), TokuCraft_core.instance, 80, 3, false,0x0a8100,0x0f450c);
		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":kazariMob"), Entity_kazari.class, "kazariMob", newMobID(), TokuCraft_core.instance, 80, 3, false,0xcb9124,0xc3c3c3);
		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":mezoolMob"), Entity_mezool.class, "mezoolMob", newMobID(), TokuCraft_core.instance, 80, 3, false,0x54567f,0xd2d3efc);
		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":gamelMob"), Entity_gamel.class, "gamelMob", newMobID(), TokuCraft_core.instance, 80, 3, false,0xc7c7c7,0x373737);
		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":ankhLostMob"), Entity_ankh_lost.class, "ankhLostMob", newMobID(), TokuCraft_core.instance, 80, 3, false,0xFF0000, 0x1FFF2E);
		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":muchiriMob"), Entity_muchiri.class, "muchiriMob", newMobID(), TokuCraft_core.instance, 80, 3, false,0xeec72b,0xff4000);
		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":ankhcompleteMob"), Entity_ankh_complete .class, "ankhcompleteMob", newMobID(), TokuCraft_core.instance, 80, 3, false,0xFF0000, 0x1FFF2E);

		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":CoreMob"), Entity_core.class, "CoreMob", newMobID(), TokuCraft_core.instance, 80, 3, false,0xe89316, 0xce5207);
		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":CorePowerUpMob"), Entity_power_up_core.class, "CorePowerUpMob", newMobID(), TokuCraft_core.instance, 80, 3, false,0xda0ad5, 0x9107b6);

		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":poseidonMob"), Entity_poseidon.class, "poseidonMob", newMobID(), TokuCraft_core.instance, 80, 3, false,0xff0000, 0x08dfdd);

		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":TakaCanMob"), entity_taka_can.class, "TakaCanMob", newMobID(), TokuCraft_core.instance, 80, 3, false,0xb8b8b8, 0xbd0000);
		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":TakoCanMob"), entity_tako_can.class, "TakoCanMob", newMobID(), TokuCraft_core.instance, 80, 3, false,0xb8b8b8, 0x2b61ea);
		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":BattaCanMob"), entity_batta_can.class, "BattaCanMob", newMobID(), TokuCraft_core.instance, 80, 3, false,0xb8b8b8, 0x089800);
		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":ToraCanMob"), entity_tora_can.class, "ToraCanMob", newMobID(), TokuCraft_core.instance, 80, 3, false,0xb8b8b8, 0xc0a700);
		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":UnagiCanMob"), entity_unagi_can.class, "UnagiCanMob", newMobID(), TokuCraft_core.instance, 80, 3, false,0xb8b8b8, 0x0500c8);
		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":GorillaCanMob"), entity_gorilla_can.class, "GorillaCanMob", newMobID(), TokuCraft_core.instance, 80, 3, false,0xb8b8b8, 0x151515);
		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":KujakuCanMob"), entity_kujaku_can.class, "KujakuCanMob", newMobID(), TokuCraft_core.instance, 80, 3, false,0xb8b8b8, 0xe37b00);
		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":PteraCanMob"), entity_ptera_can.class, "PteraCanMob", newMobID(), TokuCraft_core.instance, 80, 3, false,0xb8b8b8, 0xaa00cf);
		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":TriceraCanMob"), entity_tricera_can.class, "TriceraCanMob", newMobID(), TokuCraft_core.instance, 80, 3, false,0xb8b8b8, 0x246b4e);

		EntityRegistry.registerModEntity(new ResourceLocation( Refercence.MODID+":BugsterVirusMob"),EntityBugsterVirus.class, "BugsterVirusMob", newMobID(), TokuCraft_core.instance, 80, 3, false, 0xe88936,000000);
		EntityRegistry.addSpawn(EntityBugsterVirus.class,  15, 1, 4, EnumCreatureType.MONSTER,Biome.getBiome(1),Biome.getBiome(2),Biome.getBiome(3),Biome.getBiome(4),Biome.getBiome(5),Biome.getBiome(6),Biome.getBiome(7),Biome.getBiome(10),Biome.getBiome(11),Biome.getBiome(12),Biome.getBiome(14),Biome.getBiome(15),Biome.getBiome(16),Biome.getBiome(17),Biome.getBiome(18),Biome.getBiome(19),Biome.getBiome(20),Biome.getBiome(21),Biome.getBiome(22),Biome.getBiome(23),Biome.getBiome(24),Biome.getBiome(25),Biome.getBiome(26),Biome.getBiome(27),Biome.getBiome(28),Biome.getBiome(29),Biome.getBiome(30),Biome.getBiome(31),Biome.getBiome(32),Biome.getBiome(33),Biome.getBiome(34),Biome.getBiome(35),Biome.getBiome(36),Biome.getBiome(37),Biome.getBiome(38),Biome.getBiome(39),Biome.getBiome(129),Biome.getBiome(130),Biome.getBiome(131),Biome.getBiome(132),Biome.getBiome(133),Biome.getBiome(134),Biome.getBiome(140),Biome.getBiome(149),Biome.getBiome(151),Biome.getBiome(155),Biome.getBiome(156),Biome.getBiome(157),Biome.getBiome(158),Biome.getBiome(160),Biome.getBiome(161),Biome.getBiome(162),Biome.getBiome(163),Biome.getBiome(164),Biome.getBiome(165),Biome.getBiome(166),Biome.getBiome(167));

		EntityRegistry.registerModEntity(new ResourceLocation( Refercence.MODID+":nebula_BugsterVirusMob"),EntityNebulaBugsterVirus.class, "nebula_BugsterVirusMob", newMobID(), TokuCraft_core.instance, 80, 3, false, 0x4DD1E4,0xE9E9E9);
		EntityRegistry.addSpawn(EntityNebulaBugsterVirus.class,  15, 1, 4, EnumCreatureType.MONSTER,Biome.getBiome(8));


		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":GammaCommandoMob"),Entitygamma_commando.class, "GammaCommandoMob", newMobID(), TokuCraft_core.instance, 80, 3, false,000000, 0x6f6f6f);
		EntityRegistry.addSpawn(Entitygamma_commando.class,  15, 1, 4, EnumCreatureType.MONSTER,Biome.getBiome(1),Biome.getBiome(2),Biome.getBiome(3),Biome.getBiome(4),Biome.getBiome(5),Biome.getBiome(6),Biome.getBiome(7),Biome.getBiome(10),Biome.getBiome(11),Biome.getBiome(12),Biome.getBiome(14),Biome.getBiome(15),Biome.getBiome(16),Biome.getBiome(17),Biome.getBiome(18),Biome.getBiome(19),Biome.getBiome(20),Biome.getBiome(21),Biome.getBiome(22),Biome.getBiome(23),Biome.getBiome(24),Biome.getBiome(25),Biome.getBiome(26),Biome.getBiome(27),Biome.getBiome(28),Biome.getBiome(29),Biome.getBiome(30),Biome.getBiome(31),Biome.getBiome(32),Biome.getBiome(33),Biome.getBiome(34),Biome.getBiome(35),Biome.getBiome(36),Biome.getBiome(37),Biome.getBiome(38),Biome.getBiome(39),Biome.getBiome(129),Biome.getBiome(130),Biome.getBiome(131),Biome.getBiome(132),Biome.getBiome(133),Biome.getBiome(134),Biome.getBiome(140),Biome.getBiome(149),Biome.getBiome(151),Biome.getBiome(155),Biome.getBiome(156),Biome.getBiome(157),Biome.getBiome(158),Biome.getBiome(160),Biome.getBiome(161),Biome.getBiome(162),Biome.getBiome(163),Biome.getBiome(164),Biome.getBiome(165),Biome.getBiome(166),Biome.getBiome(167));

		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":PoppyMob"),EntityPoppy.class, "PoppyMob", newMobID(), TokuCraft_core.instance, 80, 3, false, 0xfcfb81,0xff84ac);

		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":RidePlayerMob"),EntityRidePlayer.class, "RidePlayerMob", newMobID(), TokuCraft_core.instance, 80, 3, false,0xf1c192, 0x854303);
		EntityRegistry.addSpawn(EntityRidePlayer.class,  15, 1, 4, EnumCreatureType.MONSTER,Biome.getBiome(8));

		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":genmMob"),Entity_genm.class, "genmMob", newMobID(), TokuCraft_core.instance, 80, 3, false,0x262626, 0x9a03d9);

		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":Para_dxMob"),Entity_Para_dx.class, "Para_dxMob", newMobID(), TokuCraft_core.instance, 80, 3, false,0xff0000, 0x2a00ff);
		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":Red_PoppyMob"),Entity_Red_Poppy.class, "Red_PoppyMob", newMobID(), TokuCraft_core.instance, 80, 3, false, 0xfcfb81,0xff84ac);

		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":ChronosMob"),EntityChronos.class, "ChronosMob", newMobID(), TokuCraft_core.instance, 80, 3, false,000000, 0x44df00);

		EntityRegistry.registerModEntity(new ResourceLocation( Refercence.MODID+":MightyBugsterMob"),entity_mighty_bugster.class, "MightyBugsterMob", newMobID(), TokuCraft_core.instance, 80, 3, false, 0xe88936,0xd3d3d3);
		EntityRegistry.registerModEntity(new ResourceLocation( Refercence.MODID+":SaltyBugsterMob"),entity_salty_bugster.class, "SaltyBugsterMob", newMobID(), TokuCraft_core.instance, 80, 3, false, 0x1530a8,0xdcdcdc);
		EntityRegistry.registerModEntity(new ResourceLocation( Refercence.MODID+":TaddleBugsterMob"),entity_taddle_bugster.class, "TaddleBugsterMob", newMobID(), TokuCraft_core.instance, 80, 3, false, 0xe88936,0x621d00);
		EntityRegistry.registerModEntity(new ResourceLocation( Refercence.MODID+":AranburaBugsterMob"),entity_aranbura_bugster.class, "AranburaBugsterMob", newMobID(), TokuCraft_core.instance, 80, 3, false, 0xd6d6d6,0xd90000);
		EntityRegistry.registerModEntity(new ResourceLocation( Refercence.MODID+":BangBangBugsterMob"),entity_bang_bang_bugster.class, "BangBangBugsterMob", newMobID(), TokuCraft_core.instance, 80, 3, false, 0xe88936,0x887b5c);
		EntityRegistry.registerModEntity(new ResourceLocation( Refercence.MODID+":RevolBugsterMob"),entity_revol_bugster.class, "RevolBugsterMob", newMobID(), TokuCraft_core.instance, 80, 3, false, 0x8f9ea5,0x989898);
		EntityRegistry.registerModEntity(new ResourceLocation( Refercence.MODID+":MotorsBugsterMob"),entity_motors_bugster.class, "MotorsBugsterMob", newMobID(), TokuCraft_core.instance, 80, 3, false, 0xc49e01,0x001c9c);
		EntityRegistry.registerModEntity(new ResourceLocation( Refercence.MODID+":GattonBugsterMob"),entity_gatton_bugster.class, "GattonBugsterMob", newMobID(), TokuCraft_core.instance, 80, 3, false, 0x9b0000,0xa800af);
		
		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":AnotherBuildMob"),Entity_another_build.class, "AnotherBuildMob", newMobID(), TokuCraft_core.instance, 80, 3, false, 0x610101,0x0808d1);
		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":WhiteWozMob"),Entity_White_Woz.class, "WhiteWozMob", newMobID(), TokuCraft_core.instance, 80, 3, false,0xdadada, 0x7ffc40);
		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":GingaMob"),Entity_Ginga.class, "GingaMob", newMobID(), TokuCraft_core.instance, 80, 3, false,0xdadada, 0x7600c6);

		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":EvoltMob"),Entity_evolt.class, "EvoltMob", newMobID(), TokuCraft_core.instance, 80, 3, false, 0xB90025,0xE6BFDF);
		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":EvoltMob2"),Entity_evolt_2.class, "EvoltMob2", newMobID(), TokuCraft_core.instance, 80, 3, false, 0xB90025,0xE6BFDF);
		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":EvoltMob3"),Entity_evolt_3.class, "EvoltMob3", newMobID(), TokuCraft_core.instance, 80, 3, false, 0xB90025,0xE6BFDF);

		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":GuardianMob"),Entityguardian.class, "GuardianMob", newMobID(), TokuCraft_core.instance, 80, 3, false, 0x5C5C5C,0x466382);
		EntityRegistry.addSpawn(Entityguardian.class,  15, 1, 4, EnumCreatureType.MONSTER,Biome.getBiome(1),Biome.getBiome(4),Biome.getBiome(5),Biome.getBiome(6),Biome.getBiome(7),Biome.getBiome(11),Biome.getBiome(129),Biome.getBiome(132),Biome.getBiome(155),Biome.getBiome(156),Biome.getBiome(14),Biome.getBiome(15),Biome.getBiome(21),Biome.getBiome(22),Biome.getBiome(23),Biome.getBiome(27),Biome.getBiome(28));

		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":HokutoGuardianMob"),Entityguardian_hokuto.class, "HokutoGuardianMob", newMobID(), TokuCraft_core.instance, 80, 3, false, 0x5C5C5C,0x466382);
		EntityRegistry.addSpawn(Entityguardian_hokuto.class,  15, 1, 4, EnumCreatureType.MONSTER,Biome.getBiome(3),Biome.getBiome(5),Biome.getBiome(11),Biome.getBiome(12),Biome.getBiome(13),Biome.getBiome(140),Biome.getBiome(19),Biome.getBiome(26),Biome.getBiome(30),Biome.getBiome(31),Biome.getBiome(32),Biome.getBiome(33),Biome.getBiome(34),Biome.getBiome(133),Biome.getBiome(158),Biome.getBiome(160),Biome.getBiome(161),Biome.getBiome(162));

		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":SeitoGuardianMob"),Entityguardian_seito.class, "SeitoGuardianMob", newMobID(), TokuCraft_core.instance, 80, 3, false, 0x5C5C5C,0x466382);
		EntityRegistry.addSpawn(Entityguardian_seito.class,  15, 1, 4, EnumCreatureType.MONSTER,Biome.getBiome(1),Biome.getBiome(2),Biome.getBiome(17),Biome.getBiome(35),Biome.getBiome(37),Biome.getBiome(130),Biome.getBiome(16),Biome.getBiome(36),Biome.getBiome(37),Biome.getBiome(38),Biome.getBiome(39),Biome.getBiome(163),Biome.getBiome(164),Biome.getBiome(165),Biome.getBiome(166),Biome.getBiome(167));

		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":HardGuardianMob"),Entity_hard_guardian.class, "HardGuardianMob", newMobID(), TokuCraft_core.instance, 80, 3, false, 0x195734,0xEACA00);
		EntityRegistry.addSpawn(Entity_hard_guardian.class,  15, 1, 4, EnumCreatureType.MONSTER,Biome.getBiome(8));

		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":DownfallGuardianMob"),entity_guardian_downfall.class, "DownfallGuardianMob", newMobID(), TokuCraft_core.instance, 80, 3, false, 0x5C5C5C,0x947d21);
		EntityRegistry.addSpawn(entity_guardian_downfall.class,  15, 1, 4, EnumCreatureType.MONSTER,Biome.getBiome(8));

		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":Model_lazer_bike"),EntityLazer.class, "LazerMob", newMobID(), TokuCraft_core.instance, 80, 3, false, 0xFDE800,0xEE3F87);
		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":Model_exaid_bike"),EntityExaidBike.class, "exaidBikeMob", newMobID(), TokuCraft_core.instance, 80, 3, false, 0xFDE800,0xEE3F87);
		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":Model_machine_builder"),EntityMachineBuilder.class, "machine_builder", newMobID(), TokuCraft_core.instance, 80, 3, false,0xD7CF00,0xDD0202);
		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":Model_Acrobatter"),EntityAcrobatter.class, "Acrobatter", newMobID(), TokuCraft_core.instance, 80, 3, false, 0x0600ef,0xfae000);
		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":Model_hardboilder"),Entityhardboilder.class, "hardboilder", newMobID(), TokuCraft_core.instance, 80, 3, false, 0x30df00,0x000000);
		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":Model_skullboilder"),Entityskullboilder.class, "skullboilder", newMobID(), TokuCraft_core.instance, 80, 3, false, 0x2f2f2f,0x000000);
		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":Model_ridoron"),Entity_ridoron.class, "ridoron", newMobID(), TokuCraft_core.instance, 80, 3, false, 0xc20202,0x0e0e0e);
		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":SakuraHurricane"),EntitySakuraHurricane.class, "SakuraHurricaneMob", newMobID(), TokuCraft_core.instance, 80, 3, false, 0xd90491,0xf1f1f1);
		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":RoseAttacker"),EntityRoseAttacker.class, "RoseAttackerMob", newMobID(), TokuCraft_core.instance, 80, 3, false, 0xc50000,0x0f7801);
		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":RiseHopperBike"),EntityRiseHopperBike.class, "RiseHopperBikeMob", newMobID(), TokuCraft_core.instance, 80, 3, false, 0xe1f000,0x0a0a0a);
		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":Diago_Speedy"),EntityDiagoSpeedy.class, "Diago_SpeedyMob", newMobID(), TokuCraft_core.instance, 80, 3, false, 0xbcbcbc,0xdd0606);
		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":Ridevendor"),EntityRidevendor.class, "RidevendorMob", newMobID(), TokuCraft_core.instance, 80, 3, false, 0x1d211c,0xffd529);
		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":ToRidevendor"),EntityToridevendor.class, "ToRidevendorMob", newMobID(), TokuCraft_core.instance, 80, 3, false, 0x1d211c,0xffd529);
		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":ridevendor_vending"),Entity_ridevendor_vending.class, "ridevendorVendingMob", newMobID(), TokuCraft_core.instance, 80, 3, false, 0x1d211c,0xffd529);


		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":machine_denbird"),Entity_machine_denbird.class, "MachineDenBirdMob", newMobID(), TokuCraft_core.instance, 80, 3, false,0xf8f8f8, 0x435ee6);
		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":Model_machine_tornador"),Entitymachine_tornador.class, "machine_tornador", newMobID(), TokuCraft_core.instance, 80, 3, false, 0xd20023,0xe1c901);

		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":Modelaccel"),Entityaccel.class, "AccelMob", newMobID(), TokuCraft_core.instance, 80, 3, false, 0xdf0000,0xdadada);

		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":NightRogueMob"),Entity_NightRogue.class, "NightRogueMob", newMobID(), TokuCraft_core.instance, 80, 3, false, 0x131313,0xDDC862);
		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":BloodStalkMob"),Entity_BloodStalk.class, "BloodStalkMob", newMobID(), TokuCraft_core.instance, 80, 3, false, 0x7F100F,0x50C5CA);

		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":KaiserMob"),Entity_Kaiser.class, "KaiserMob", newMobID(), TokuCraft_core.instance, 80, 3, false, 0x161616,0xC40000);
		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":KaiserReverseMob"),Entity_KaiserReverse.class, "KaiserReverseMob", newMobID(), TokuCraft_core.instance, 80, 3, false, 0x161616,0x003EBA);
		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":BikaiserMob"),Entity_bikaiser.class, "BikaiserMob", newMobID(), TokuCraft_core.instance, 80, 3, false, 0x161616,0x003EBA);

		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":RemoconBrosMob"),Entity_RemoconBros.class, "RemoconBrosMob", newMobID(), TokuCraft_core.instance, 80, 3, false, 0x161616,0x0092BB);
		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":EngineBrosMob"),Entity_EngineBros.class, "EngineBrosMob", newMobID(), TokuCraft_core.instance, 80, 3, false, 0x161616,0xDFDFDF);
		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":HellBrosMob"),Entity_HellBros.class, "HellBrosMob", newMobID(), TokuCraft_core.instance, 80, 3, false, 0x161616,0xDFDFDF);

		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":NeedleSmashMob"),Entity_needle_smash.class, "NeedleSmashMob", newMobID(), TokuCraft_core.instance, 80, 3, false, 0xFFFFFF,0x0074D9);
		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":greaseMob"),Entity_grease.class, "greaseMob", newMobID(), TokuCraft_core.instance, 80, 3, false, 0xe8c439,0x604e46);

		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":BuildMob"),Entity_Build_RT.class, "BuildMob", newMobID(), TokuCraft_core.instance, 80, 3, false, 0xC70404,0x000DB7);

		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":BloodMob"),entity_blood.class, "BloodMob", newMobID(), TokuCraft_core.instance, 80, 3, false, 0xb40e0e,0x202021);
		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":KillbusMob"),entity_killbus.class, "KillbusMob", newMobID(), TokuCraft_core.instance, 80, 3, false, 0x8e0000,0x060606);
		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":PhantomCrusherMob"),entity_phantom_crusher.class, "PhantomCrusherMob", newMobID(), TokuCraft_core.instance, 80, 3, false, 0x0f4406,0xa77100);
		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":MetalBuildMob"),entity_metal_build.class, "MetalBuildMob", newMobID(), TokuCraft_core.instance, 80, 3, false, 0x333333,0x090909);

		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":kodama_suika_armsMob"),Entity_kodama_suika_arms.class, "kodama_suika_armsMob", newMobID(), TokuCraft_core.instance, 80, 3, false, 0x008000,0x242424);

		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":ClayDollDopantMob"),Entity_clay_doll_dopant.class, "ClayDollDopantMob", newMobID(), TokuCraft_core.instance, 80, 3, false, 0x161616,0x0092BB);
		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":NazcaDopantMob"),Entity_nazca_dopant.class, "NazcaDopantMob", newMobID(), TokuCraft_core.instance, 80, 3, false, 0x161616,0x0092BB);
		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":RedNazcaDopantMob"),Entity_red_nazca_dopant.class, "RedNazcaDopantMob", newMobID(), TokuCraft_core.instance, 80, 3, false, 0x161616,0x0092BB);
		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":TabooDopantMob"),Entity_taboo_dopant.class, "TabooDopantMob", newMobID(), TokuCraft_core.instance, 80, 3, false, 0x161616,0x0092BB);
		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":weatherDopantMob"),Entity_weather_dopant.class, "weatherDopantMob", newMobID(), TokuCraft_core.instance, 80, 3, false, 0xffffff,0xc1c1c1);
		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":smilodonDopantMob"),Entity_smilodon_dopant.class, "smilodonDopantMob", newMobID(), TokuCraft_core.instance, 80, 3, false, 0xc7b372,0x727272);
		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":commanderDopantMob"),Entity_commander_dopant.class, "commanderDopantMob", newMobID(), TokuCraft_core.instance, 80, 3, false, 0x527753,0xc34d36);
		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":TerrorDopantMob"),EntityTerror.class, "TerrorDopantMob", newMobID(), TokuCraft_core.instance, 80, 3, false, 0x527753,0xc34d36);

		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":super_gingaohMob"),Entity_super_gingaoh.class, "super_gingaohMob", newMobID(), TokuCraft_core.instance, 80, 3, false,0x191b32,0x9e6f00);

		
		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":KurokageTroopersMob"),EntityKurokageTroopers.class, "KurokageTroopersMob", newMobID(), TokuCraft_core.instance, 80, 3, false,0x6a4916, 0x333333);

		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":ElementaryInvesGreenMob"),EntityElementaryInvesGreen.class, "ElementaryInvesGreenMob", newMobID(), TokuCraft_core.instance, 80, 3, false,0xefefee,0x007800);
		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":ElementaryInvesRedMob"),EntityElementaryInvesRed.class, "ElementaryInvesRedMob", newMobID(), TokuCraft_core.instance, 80, 3, false,0xefefee,0x750010);
		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":ElementaryInvesBlueMob"),EntityElementaryInvesBlue.class, "ElementaryInvesBlueMob", newMobID(), TokuCraft_core.instance, 80, 3, false,0xefefee,0x002575);

		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":byakkoInvesMob"),EntityByakkoInves.class, "byakkoInvesMob", newMobID(), TokuCraft_core.instance, 80, 3, false,0x68965a,0x007800);
		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":hekijaInvesMob"),EntityHekijaInves.class, "hekijaInvesMob", newMobID(), TokuCraft_core.instance, 80, 3, false,0x68965a,0x007800);

		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":ZangetsuShinMob"),Entity_ZangetsuShin.class, "ZangetsuShinMob", newMobID(), TokuCraft_core.instance, 80, 3, false,0xa0ffa9, 0xfefefe);
		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":MarikaMob"),Entity_Marika.class, "MarikaMob", newMobID(), TokuCraft_core.instance, 80, 3, false,0xfcfb81,0xff84ac);
		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":SigurdMob"),Entity_Sigurd.class, "SigurdMob", newMobID(), TokuCraft_core.instance, 80, 3, false,0xff0000, 0xd2f3e8);
		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":DukeMob"),Entity_Duke.class, "DukeMob", newMobID(), TokuCraft_core.instance, 80, 3, false,0xe5ec25, 0x25c1ec);

		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":roshuoMob"),Entity_roshuo.class, "roshuoMob", newMobID(), TokuCraft_core.instance, 80, 3, false,0xefefef, 0x97c3c5);
		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":redyueMob"),Entity_redyue.class, "redyueMob", newMobID(), TokuCraft_core.instance, 80, 3, false,0xb69d02, 0x277a44);
		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":demushuMob"),Entity_demushu.class, "demushuMob", newMobID(), TokuCraft_core.instance, 80, 3, false,0xb50000, 0x790000);
		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":lord_baronMob"),Entity_lord_baron.class, "lord_baronMob", newMobID(), TokuCraft_core.instance, 80, 3, false,0x970000, 0xb3a500);


		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":TrilobiteMagiaMob"),Entity_trilobite_magia.class, "TrilobiteMagiaMob", newMobID(), TokuCraft_core.instance, 80, 3, false,0x060606,0xa2a2a2);
		EntityRegistry.addSpawn(Entity_trilobite_magia.class,  15, 1, 4, EnumCreatureType.MONSTER,Biome.getBiome(1),Biome.getBiome(4),Biome.getBiome(5),Biome.getBiome(6),Biome.getBiome(7),Biome.getBiome(11),Biome.getBiome(129),Biome.getBiome(132),Biome.getBiome(155),Biome.getBiome(156),Biome.getBiome(14),Biome.getBiome(15),Biome.getBiome(21),Biome.getBiome(22),Biome.getBiome(23),Biome.getBiome(27),Biome.getBiome(28));

		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":dodoChickMob"),Entity_magiadodo_chick.class, "dodoChickMob", newMobID(), TokuCraft_core.instance, 80, 3, false,0x7d0b0a,0x242424);
		EntityRegistry.addSpawn(Entity_magiadodo_chick.class,  15, 1, 4, EnumCreatureType.MONSTER,Biome.getBiome(8));

		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":BattleRaiderMob"),entity_battle_raider.class, "BattleRaiderMob", newMobID(), TokuCraft_core.instance, 80, 3, false, 0x1d1d1d,0x000000);
		EntityRegistry.addSpawn(entity_battle_raider.class,  15, 1, 4, EnumCreatureType.MONSTER,Biome.getBiome(8));

		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":AbaddonMob"),entity_abaddon_low.class, "AbaddonMob", newMobID(), TokuCraft_core.instance, 80, 3, false,0x5d6837,0xc1b810);
		EntityRegistry.addSpawn(entity_abaddon_low.class,  15, 1, 4, EnumCreatureType.MONSTER,Biome.getBiome(8));

		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":MagiaMob"),Entity_magia.class, "MagiaMob", newMobID(), TokuCraft_core.instance, 80, 3, false,0x060606,0xa2a2a2);
		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":horobiMob"),Entity_horobi.class, "horobiMob", newMobID(), TokuCraft_core.instance, 80, 3, false, 0x8a00c3,0x383838);
		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":jinMob"),Entity_jin.class, "jinMob", newMobID(), TokuCraft_core.instance, 80, 3, false, 0xff65b9,0xd5d5d5);
		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":ikazuchiMob"),Entity_ikazuchi.class, "ikazuchiMob", newMobID(), TokuCraft_core.instance, 80, 3, false,0x7d0b0a,0x242424);
		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":NakiMob"),Entity_naki.class, "NakiMob", newMobID(), TokuCraft_core.instance, 80, 3, false,0xcbcbcb,0x0024fe);
		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":dodoMagiaMob"),Entity_dodomagia.class, "dodoMagiaMob", newMobID(), TokuCraft_core.instance, 80, 3, false,0x7d0b0a,0x242424);

		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":RaiderMob"),entity_raider.class, "RaiderMob", newMobID(), TokuCraft_core.instance, 80, 3, false, 0x1d1d1d,0x000000);

		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":gigerMob"),Entity_giger.class, "gigerMob", newMobID(), TokuCraft_core.instance, 80, 3, false,0x9c00b2,0x1f1f1f);

		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":Arc_zeroMob"),Entity_Arc_zero.class, "Arc_zeroMob", newMobID(), TokuCraft_core.instance, 80, 3, false, 0x161616,0xC40000);

		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":EdenMob"),entity_eden.class, "EdenMob", newMobID(), TokuCraft_core.instance, 80, 3, false, 0x0e1257,0x910101);
		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":AbaddonHighMob"),entity_abaddon_high.class, "AbaddonHighMob", newMobID(), TokuCraft_core.instance, 80, 3, false, 0x5d6837,0xc30000);

		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":ZaiaMob"),entity_zaia.class, "ZaiaMob", newMobID(), TokuCraft_core.instance, 80, 3, false, 0x161616,0xc2c2c2);
		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":DireWolfSoldMagiaMob"),entity_dire_wolf_sold_magia.class, "DireWolfSoldMagiaMob", newMobID(), TokuCraft_core.instance, 80, 3, false, 0x454b4b,0x0033c4);
		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":ServalTigerSoldMagiaMob"),entity_serval_tiger_sold_magia.class, "ServalTigerSoldMagiaMob", newMobID(), TokuCraft_core.instance, 80, 3, false, 0x454b4b,0xce7100);

		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":IsMob"),EntityIS.class, "IsMob", newMobID(), TokuCraft_core.instance, 80, 3, false, 0xf7f7f7,0x20cc89);

		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":ShimiMob"), EntityShimi.class, "ShimiMob", newMobID(), TokuCraft_core.instance, 80, 3, false,0x282828, 0xe2e2e2);
		EntityRegistry.addSpawn(EntityShimi.class, 15, 1, 4 ,EnumCreatureType.MONSTER,Biome.getBiome(1),Biome.getBiome(2),Biome.getBiome(3),Biome.getBiome(4),Biome.getBiome(5),Biome.getBiome(6),Biome.getBiome(7),Biome.getBiome(10),Biome.getBiome(11),Biome.getBiome(12),Biome.getBiome(14),Biome.getBiome(15),Biome.getBiome(16),Biome.getBiome(17),Biome.getBiome(18),Biome.getBiome(19),Biome.getBiome(20),Biome.getBiome(21),Biome.getBiome(22),Biome.getBiome(23),Biome.getBiome(24),Biome.getBiome(25),Biome.getBiome(26),Biome.getBiome(27),Biome.getBiome(28),Biome.getBiome(29),Biome.getBiome(30),Biome.getBiome(31),Biome.getBiome(32),Biome.getBiome(33),Biome.getBiome(34),Biome.getBiome(35),Biome.getBiome(36),Biome.getBiome(37),Biome.getBiome(38),Biome.getBiome(39),Biome.getBiome(129),Biome.getBiome(130),Biome.getBiome(131),Biome.getBiome(132),Biome.getBiome(133),Biome.getBiome(134),Biome.getBiome(140),Biome.getBiome(149),Biome.getBiome(151),Biome.getBiome(155),Biome.getBiome(156),Biome.getBiome(157),Biome.getBiome(158),Biome.getBiome(160),Biome.getBiome(161),Biome.getBiome(162),Biome.getBiome(163),Biome.getBiome(164),Biome.getBiome(165),Biome.getBiome(166),Biome.getBiome(167));

		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":CaliburMob"),Entity_Calibur.class, "CaliburMob", newMobID(), TokuCraft_core.instance, 80, 3, false,0x060606,0xa2a2a2);
		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":FalchionMob"),Entity_Falchion.class, "FalchionMob", newMobID(), TokuCraft_core.instance, 80, 3, false,0x0d0d0d,0xff5503);
		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":SabelaMob"),Entity_Sabela.class, "SabelaMob", newMobID(), TokuCraft_core.instance, 80, 3, false,0x8c1f1f,0xe2ab27);
		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":DurendalMob"),Entity_Durendal.class, "DurendalMob", newMobID(), TokuCraft_core.instance, 80, 3, false,0xe181818,0x04b9d5);
		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":SolomonMob"),Entity_Solomon.class, "SolomonMob", newMobID(), TokuCraft_core.instance, 80, 3, false,0xed1d1d1,0xd0a33e);
		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":StoriousRiderMob"),entity_storious_rider.class, "StoriousRiderMob", newMobID(), TokuCraft_core.instance, 80, 3, false,0x00652f,0x870000);

		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":LegeielMob"),Entity_legeiel.class, "LegeielMob", newMobID(), TokuCraft_core.instance, 80, 3, false,0xaa5d43,0xdedede);
		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":LegeielForbiddenMob"),Entity_legeiel_forbidden.class, "LegeielForbiddenMob", newMobID(), TokuCraft_core.instance, 80, 3, false,0xad7c1c,0x8a0000);

		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":ZooousMob"),Entity_zooous.class, "ZooousMob", newMobID(), TokuCraft_core.instance, 80, 3, false,0xf9f9f9,0x004ad8);
		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":ZooousPredatorMob"),Entity_zooous_predator.class, "ZooousPredatorMob", newMobID(), TokuCraft_core.instance, 80, 3, false,0x6b0200,0x060606);

		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":StoriousMob"),Entity_storious.class, "StoriousMob", newMobID(), TokuCraft_core.instance, 80, 3, false,0x00652f,0x870000);

		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":DesastMob"),entity_desast.class, "DesastMob", newMobID(), TokuCraft_core.instance, 80, 3, false,0x131313,0xb40000);

		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":ChaybdisMob"),entity_charybdis.class, "ChaybdisMob", newMobID(), TokuCraft_core.instance, 80, 3, false,0xeaeaea,0xd9a900);
		EntityRegistry.addSpawn(entity_charybdis.class,  15, 1, 4, EnumCreatureType.MONSTER,Biome.getBiome(8));
		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":ChaybdisHerculesMob"),entity_charybdis_hercules.class, "ChaybdisHerculesMob", newMobID(), TokuCraft_core.instance, 80, 3, false,0xeaeaea,0xb43939);
	
		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":ViceMob"),EntityVice.class, "ViceMob", newMobID(), TokuCraft_core.instance, 80, 3, false,0xeaeaea,0xd9a900);
		
		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":GiffJuniorMob"), Entity_giff_junior.class, "giffJuniorMob", newMobID(), TokuCraft_core.instance, 80, 3, false,0x282828, 0xe2e2e2);
		EntityRegistry.addSpawn(Entity_giff_junior.class, 15, 1, 4 ,EnumCreatureType.MONSTER,Biome.getBiome(1),Biome.getBiome(2),Biome.getBiome(3),Biome.getBiome(4),Biome.getBiome(5),Biome.getBiome(6),Biome.getBiome(7),Biome.getBiome(10),Biome.getBiome(11),Biome.getBiome(12),Biome.getBiome(14),Biome.getBiome(15),Biome.getBiome(16),Biome.getBiome(17),Biome.getBiome(18),Biome.getBiome(19),Biome.getBiome(20),Biome.getBiome(21),Biome.getBiome(22),Biome.getBiome(23),Biome.getBiome(24),Biome.getBiome(25),Biome.getBiome(26),Biome.getBiome(27),Biome.getBiome(28),Biome.getBiome(29),Biome.getBiome(30),Biome.getBiome(31),Biome.getBiome(32),Biome.getBiome(33),Biome.getBiome(34),Biome.getBiome(35),Biome.getBiome(36),Biome.getBiome(37),Biome.getBiome(38),Biome.getBiome(39),Biome.getBiome(129),Biome.getBiome(130),Biome.getBiome(131),Biome.getBiome(132),Biome.getBiome(133),Biome.getBiome(134),Biome.getBiome(140),Biome.getBiome(149),Biome.getBiome(151),Biome.getBiome(155),Biome.getBiome(156),Biome.getBiome(157),Biome.getBiome(158),Biome.getBiome(160),Biome.getBiome(161),Biome.getBiome(162),Biome.getBiome(163),Biome.getBiome(164),Biome.getBiome(165),Biome.getBiome(166),Biome.getBiome(167));

		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":EvilMob"),Entity_Evil.class, "EvilMob", newMobID(), TokuCraft_core.instance, 80, 3, false,0x03c8a9,0xa7a7a7);
		
	}


	public static int newMobID(){
		MobID=MobID+1; 
		return MobID;
	}

}
