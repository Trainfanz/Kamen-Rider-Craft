package Kamen_Rider_Craft_4TH;

import Kamen_Rider_Craft_4TH.biome.riderBiomes;
import Kamen_Rider_Craft_4TH.mobs.EntityAnkh;
import Kamen_Rider_Craft_4TH.mobs.EntityKintaros;
import Kamen_Rider_Craft_4TH.mobs.EntityLazer;
import Kamen_Rider_Craft_4TH.mobs.EntityMomotaros;
import Kamen_Rider_Craft_4TH.mobs.EntityPoppy;
import Kamen_Rider_Craft_4TH.mobs.EntityRyutaros;
import Kamen_Rider_Craft_4TH.mobs.EntityUrataros;
import Kamen_Rider_Craft_4TH.mobs.Entity_kodama_suika_arms;
import Kamen_Rider_Craft_4TH.mobs.Entityaccel;
import Kamen_Rider_Craft_4TH.mobs.Boss.EntityChronos;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_BloodStalk;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_Build_RT;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_Duke;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_EngineBros;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_Ginga;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_HellBros;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_Kaiser;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_KaiserReverse;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_Marika;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_NightRogue;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_Para_dx;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_Red_Poppy;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_RemoconBros;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_Sigurd;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_White_Woz;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_ZangetsuShin;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_another_build;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_bikaiser;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_clay_doll_dopant;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_demushu;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_evolt;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_evolt_2;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_evolt_3;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_gaoh;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_genm;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_grease;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_lord_baron;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_magia;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_nazca_dopant;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_red_nazca_dopant;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_redyue;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_roshuo;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_taboo_dopant;
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
import Kamen_Rider_Craft_4TH.mobs.Henchmen.Entity_hard_guardian;
import Kamen_Rider_Craft_4TH.mobs.Henchmen.Entity_needle_smash;
import Kamen_Rider_Craft_4TH.mobs.Henchmen.Entity_trilobite_magia;
import Kamen_Rider_Craft_4TH.mobs.Henchmen.Entitygamma_commando;
import Kamen_Rider_Craft_4TH.mobs.Henchmen.Entityguardian;
import Kamen_Rider_Craft_4TH.mobs.Henchmen.Entityguardian_hokuto;
import Kamen_Rider_Craft_4TH.mobs.Henchmen.Entityguardian_seito;
import Kamen_Rider_Craft_4TH.mobs.Henchmen.Entitynew_mole_imagin;
import Kamen_Rider_Craft_4TH.mobs.Henchmen.Entitynew_mole_imagin_sand;
import Kamen_Rider_Craft_4TH.mobs.Henchmen.Entityshocker_combatman;
import Kamen_Rider_Craft_4TH.mobs.bikes.EntityAcrobatter;
import Kamen_Rider_Craft_4TH.mobs.bikes.EntityExaidBike;
import Kamen_Rider_Craft_4TH.mobs.bikes.EntityMachineBuilder;
import Kamen_Rider_Craft_4TH.mobs.bikes.EntityRoseAttacker;
import Kamen_Rider_Craft_4TH.mobs.bikes.EntitySakuraHurricane;
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
import net.minecraftforge.common.BiomeManager.BiomeType;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class mobsCore {

	public static int MobID = 500;
	
	public static void Addmob(){
		
		//Biome.getBiome(8)
		
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
	
		
		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":Ankhmob"),EntityAnkh.class, "Ankhmob", newMobID(), TokuCraft_core.instance, 80, 3, false, 0xFF0000, 0x1FFF2E);
		EntityRegistry.addSpawn(EntityAnkh.class,  1, 1, 1, EnumCreatureType.CREATURE,Biome.getBiome(1),Biome.getBiome(2),Biome.getBiome(3),Biome.getBiome(4),Biome.getBiome(5),Biome.getBiome(6),Biome.getBiome(7),Biome.getBiome(10),Biome.getBiome(11),Biome.getBiome(12),Biome.getBiome(13));
	
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
		
		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":ShockerCombatmanMob"),Entityshocker_combatman.class, "ShockerCombatmanMob", newMobID(), TokuCraft_core.instance, 80, 3, false, 000000,0xFFFFFF);
		EntityRegistry.addSpawn(Entityshocker_combatman.class,  15, 1, 4, EnumCreatureType.MONSTER,Biome.getBiome(1),Biome.getBiome(2),Biome.getBiome(3),Biome.getBiome(4),Biome.getBiome(5),Biome.getBiome(6),Biome.getBiome(7),Biome.getBiome(10),Biome.getBiome(11),Biome.getBiome(12),Biome.getBiome(14),Biome.getBiome(15),Biome.getBiome(16),Biome.getBiome(17),Biome.getBiome(18),Biome.getBiome(19),Biome.getBiome(20),Biome.getBiome(21),Biome.getBiome(22),Biome.getBiome(23),Biome.getBiome(24),Biome.getBiome(25),Biome.getBiome(26),Biome.getBiome(27),Biome.getBiome(28),Biome.getBiome(29),Biome.getBiome(30),Biome.getBiome(31),Biome.getBiome(32),Biome.getBiome(33),Biome.getBiome(34),Biome.getBiome(35),Biome.getBiome(36),Biome.getBiome(37),Biome.getBiome(38),Biome.getBiome(39),Biome.getBiome(129),Biome.getBiome(130),Biome.getBiome(131),Biome.getBiome(132),Biome.getBiome(133),Biome.getBiome(134),Biome.getBiome(140),Biome.getBiome(149),Biome.getBiome(151),Biome.getBiome(155),Biome.getBiome(156),Biome.getBiome(157),Biome.getBiome(158),Biome.getBiome(160),Biome.getBiome(161),Biome.getBiome(162),Biome.getBiome(163),Biome.getBiome(164),Biome.getBiome(165),Biome.getBiome(166),Biome.getBiome(167));
		
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
		
		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":Model_lazer_bike"),EntityLazer.class, "LazerMob", newMobID(), TokuCraft_core.instance, 80, 3, false, 0xFDE800,0xEE3F87);
		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":Model_exaid_bike"),EntityExaidBike.class, "exaidBikeMob", newMobID(), TokuCraft_core.instance, 80, 3, false, 0xFDE800,0xEE3F87);
		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":Model_machine_builder"),EntityMachineBuilder.class, "machine_builder", newMobID(), TokuCraft_core.instance, 80, 3, false,0xD7CF00,0xDD0202);
		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":Model_Acrobatter"),EntityAcrobatter.class, "Acrobatter", newMobID(), TokuCraft_core.instance, 80, 3, false, 0x0600ef,0xfae000);
		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":Model_hardboilder"),Entityhardboilder.class, "hardboilder", newMobID(), TokuCraft_core.instance, 80, 3, false, 0x30df00,0x000000);
		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":Model_skullboilder"),Entityskullboilder.class, "skullboilder", newMobID(), TokuCraft_core.instance, 80, 3, false, 0x2f2f2f,0x000000);
		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":Model_ridoron"),Entity_ridoron.class, "ridoron", newMobID(), TokuCraft_core.instance, 80, 3, false, 0xc20202,0x0e0e0e);
		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":SakuraHurricane"),EntitySakuraHurricane.class, "SakuraHurricaneMob", newMobID(), TokuCraft_core.instance, 80, 3, false, 0xd90491,0xf1f1f1);
		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":RoseAttacker"),EntityRoseAttacker.class, "RoseAttackerMob", newMobID(), TokuCraft_core.instance, 80, 3, false, 0xc50000,0x0f7801);
		
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
		
		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":kodama_suika_armsMob"),Entity_kodama_suika_arms.class, "kodama_suika_armsMob", newMobID(), TokuCraft_core.instance, 80, 3, false, 0x008000,0x242424);
		
		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":ClayDollDopantMob"),Entity_clay_doll_dopant.class, "ClayDollDopantMob", newMobID(), TokuCraft_core.instance, 80, 3, false, 0x161616,0x0092BB);
		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":NazcaDopantMob"),Entity_nazca_dopant.class, "NazcaDopantMob", newMobID(), TokuCraft_core.instance, 80, 3, false, 0x161616,0x0092BB);
		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":RedNazcaDopantMob"),Entity_red_nazca_dopant.class, "RedNazcaDopantMob", newMobID(), TokuCraft_core.instance, 80, 3, false, 0x161616,0x0092BB);
		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":TabooDopantMob"),Entity_taboo_dopant.class, "TabooDopantMob", newMobID(), TokuCraft_core.instance, 80, 3, false, 0x161616,0x0092BB);
	
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
		
		EntityRegistry.registerModEntity(new  ResourceLocation(Refercence.MODID+":MagiaMob"),Entity_magia.class, "MagiaMob", newMobID(), TokuCraft_core.instance, 80, 3, false,0x060606,0xa2a2a2);
		
		
	}
	
	
public static int newMobID(){
	MobID=MobID+1; 
	return MobID;
}
	
}
