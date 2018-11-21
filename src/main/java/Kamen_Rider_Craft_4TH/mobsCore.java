package Kamen_Rider_Craft_4TH;

import Kamen_Rider_Craft_4TH.mobs.EntityAnkh;
import Kamen_Rider_Craft_4TH.mobs.EntityChronos;
import Kamen_Rider_Craft_4TH.mobs.EntityLazer;
import Kamen_Rider_Craft_4TH.mobs.EntityPoppy;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_BloodStalk;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_EngineBros;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_HellBros;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_Kaiser;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_KaiserReverse;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_NightRogue;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_RemoconBros;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_another_build;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_bikaiser;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_evolt;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_grease;
import Kamen_Rider_Craft_4TH.mobs.Henchmen.EntityBugsterVirus;
import Kamen_Rider_Craft_4TH.mobs.Henchmen.EntityMasquerade;
import Kamen_Rider_Craft_4TH.mobs.Henchmen.EntityNebulaBugsterVirus;
import Kamen_Rider_Craft_4TH.mobs.Henchmen.Entity_hard_guardian;
import Kamen_Rider_Craft_4TH.mobs.Henchmen.Entity_needle_smash;
import Kamen_Rider_Craft_4TH.mobs.Henchmen.Entitygamma_commando;
import Kamen_Rider_Craft_4TH.mobs.Henchmen.Entityguardian;
import Kamen_Rider_Craft_4TH.mobs.Henchmen.Entityguardian_hokuto;
import Kamen_Rider_Craft_4TH.mobs.Henchmen.Entityguardian_seito;
import Kamen_Rider_Craft_4TH.mobs.Henchmen.Entityshocker_combatman;
import Kamen_Rider_Craft_4TH.mobs.bikes.EntityExaidBike;
import Kamen_Rider_Craft_4TH.mobs.bikes.EntityMachineBuilder;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EntityList.EntityEggInfo;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.common.BiomeManager.BiomeType;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class mobsCore {

	public static void Addmob(){
		
		//Biome.getBiome(8)
		
		EntityRegistry.registerModEntity(new ResourceLocation("MasqueradeMob"), EntityMasquerade.class, "MasqueradeMob", 500, TokuCraft_core.instance, 80, 3, false,000000, 0xFFFFFF);
		EntityRegistry.addSpawn(EntityMasquerade.class, 10, 4, 4 ,EnumCreatureType.CREATURE,Biome.getBiome(1),Biome.getBiome(2),Biome.getBiome(3),Biome.getBiome(4),Biome.getBiome(5),Biome.getBiome(6),Biome.getBiome(7),Biome.getBiome(10),Biome.getBiome(11),Biome.getBiome(12),Biome.getBiome(13));
	
		
		EntityRegistry.registerModEntity(new ResourceLocation("Ankhmob"),EntityAnkh.class, "Ankhmob", 501, TokuCraft_core.instance, 80, 3, false, 0xFF0000, 0x1FFF2E);
		EntityRegistry.addSpawn(EntityAnkh.class,  1, 1, 1, EnumCreatureType.CREATURE,Biome.getBiome(1),Biome.getBiome(2),Biome.getBiome(3),Biome.getBiome(4),Biome.getBiome(5),Biome.getBiome(6),Biome.getBiome(7),Biome.getBiome(10),Biome.getBiome(11),Biome.getBiome(12),Biome.getBiome(13));
	
		EntityRegistry.registerModEntity(new ResourceLocation( "BugsterVirusMob"),EntityBugsterVirus.class, "BugsterVirusMob", 502, TokuCraft_core.instance, 80, 3, false, 0xe88936,000000);
		EntityRegistry.addSpawn(EntityBugsterVirus.class,  10, 4, 4, EnumCreatureType.CREATURE,Biome.getBiome(1),Biome.getBiome(2),Biome.getBiome(3),Biome.getBiome(4),Biome.getBiome(5),Biome.getBiome(6),Biome.getBiome(7),Biome.getBiome(10),Biome.getBiome(11),Biome.getBiome(12),Biome.getBiome(13));
	
		EntityRegistry.registerModEntity(new ResourceLocation( "nebula_BugsterVirusMob"),EntityNebulaBugsterVirus.class, "nebula_BugsterVirusMob", 508, TokuCraft_core.instance, 80, 3, false, 0x4DD1E4,0xE9E9E9);
		EntityRegistry.addSpawn(EntityNebulaBugsterVirus.class,  10, 4, 4, EnumCreatureType.MONSTER,Biome.getBiome(8));
	
		
		EntityRegistry.registerModEntity(new ResourceLocation("GammaCommandoMob"),Entitygamma_commando.class, "GammaCommandoMob", 503, TokuCraft_core.instance, 80, 3, false,000000, 0x6f6f6f);
		EntityRegistry.addSpawn(Entitygamma_commando.class,  10, 4, 4, EnumCreatureType.CREATURE,Biome.getBiome(1),Biome.getBiome(2),Biome.getBiome(3),Biome.getBiome(4),Biome.getBiome(5),Biome.getBiome(6),Biome.getBiome(7),Biome.getBiome(10),Biome.getBiome(11),Biome.getBiome(12),Biome.getBiome(13));
	
		EntityRegistry.registerModEntity(new ResourceLocation("PoppyMob"),EntityPoppy.class, "PoppyMob", 504, TokuCraft_core.instance, 80, 3, false, 0xfcfb81,0xff84ac);
		
		EntityRegistry.registerModEntity(new ResourceLocation("ChronosMob"),EntityChronos.class, "ChronosMob", 505, TokuCraft_core.instance, 80, 3, false,000000, 0x44df00);
		
		EntityRegistry.registerModEntity(new ResourceLocation("ShockerCombatmanMob"),Entityshocker_combatman.class, "ShockerCombatmanMob", 506, TokuCraft_core.instance, 80, 3, false, 000000,0xFFFFFF);
		EntityRegistry.addSpawn(Entityshocker_combatman.class,  10, 4, 4, EnumCreatureType.CREATURE,Biome.getBiome(1),Biome.getBiome(2),Biome.getBiome(3),Biome.getBiome(4),Biome.getBiome(5),Biome.getBiome(6),Biome.getBiome(7),Biome.getBiome(10),Biome.getBiome(11),Biome.getBiome(12),Biome.getBiome(13));				
		
		EntityRegistry.registerModEntity(new ResourceLocation("AnotherBuildMob"),Entity_another_build.class, "AnotherBuildMob", 509, TokuCraft_core.instance, 80, 3, false, 0x610101,0x0808d1);
		
		EntityRegistry.registerModEntity(new ResourceLocation("EvoltMob"),Entity_evolt.class, "EvoltMob", 510, TokuCraft_core.instance, 80, 3, false, 0xB90025,0xE6BFDF);
		
		EntityRegistry.registerModEntity(new ResourceLocation("GuardianMob"),Entityguardian.class, "GuardianMob", 507, TokuCraft_core.instance, 80, 3, false, 0x5C5C5C,0x466382);
		EntityRegistry.addSpawn(Entityguardian.class,  10, 4, 4, EnumCreatureType.CREATURE,Biome.getBiome(1),Biome.getBiome(4),Biome.getBiome(5),Biome.getBiome(6),Biome.getBiome(7),Biome.getBiome(11));
		
		EntityRegistry.registerModEntity(new ResourceLocation("HokutoGuardianMob"),Entityguardian_hokuto.class, "HokutoGuardianMob", 512, TokuCraft_core.instance, 80, 3, false, 0x5C5C5C,0x466382);
		EntityRegistry.addSpawn(Entityguardian_hokuto.class,  10, 4, 4, EnumCreatureType.CREATURE,Biome.getBiome(3),Biome.getBiome(5),Biome.getBiome(11),Biome.getBiome(12),Biome.getBiome(13),Biome.getBiome(140));
		
		EntityRegistry.registerModEntity(new ResourceLocation("SeitoGuardianMob"),Entityguardian_seito.class, "SeitoGuardianMob", 513, TokuCraft_core.instance, 80, 3, false, 0x5C5C5C,0x466382);
		EntityRegistry.addSpawn(Entityguardian_seito.class,  10, 4, 4, EnumCreatureType.CREATURE,Biome.getBiome(1),Biome.getBiome(2),Biome.getBiome(17),Biome.getBiome(35),Biome.getBiome(37),Biome.getBiome(130));
		
		EntityRegistry.registerModEntity(new ResourceLocation("HardGuardianMob"),Entity_hard_guardian.class, "HardGuardianMob", 511, TokuCraft_core.instance, 80, 3, false, 0x195734,0xEACA00);
		
		EntityRegistry.registerModEntity(new ResourceLocation("Model_lazer_bike"),EntityLazer.class, "LazerMob", 514, TokuCraft_core.instance, 80, 3, false, 0xFDE800,0xEE3F87);
		EntityRegistry.registerModEntity(new ResourceLocation("Model_exaid_bike"),EntityExaidBike.class, "exaidBikeMob", 515, TokuCraft_core.instance, 80, 3, false, 0xFDE800,0xEE3F87);
		EntityRegistry.registerModEntity(new ResourceLocation("Model_machine_builder"),EntityMachineBuilder.class, "machine_builder", 516, TokuCraft_core.instance, 80, 3, false,0xD7CF00,0xDD0202);
		
		EntityRegistry.registerModEntity(new ResourceLocation("NightRogueMob"),Entity_NightRogue.class, "NightRogueMob", 517, TokuCraft_core.instance, 80, 3, false, 0x131313,0xDDC862);
		EntityRegistry.registerModEntity(new ResourceLocation("BloodStalkMob"),Entity_BloodStalk.class, "BloodStalkMob", 518, TokuCraft_core.instance, 80, 3, false, 0x7F100F,0x50C5CA);
		
		EntityRegistry.registerModEntity(new ResourceLocation("KaiserMob"),Entity_Kaiser.class, "KaiserMob", 519, TokuCraft_core.instance, 80, 3, false, 0x161616,0xC40000);
		EntityRegistry.registerModEntity(new ResourceLocation("KaiserReverseMob"),Entity_KaiserReverse.class, "KaiserReverseMob", 520, TokuCraft_core.instance, 80, 3, false, 0x161616,0x003EBA);
		EntityRegistry.registerModEntity(new ResourceLocation("BikaiserMob"),Entity_bikaiser.class, "BikaiserMob", 521, TokuCraft_core.instance, 80, 3, false, 0x161616,0x003EBA);
	
		EntityRegistry.registerModEntity(new ResourceLocation("RemoconBrosMob"),Entity_RemoconBros.class, "RemoconBrosMob", 522, TokuCraft_core.instance, 80, 3, false, 0x161616,0x0092BB);
		EntityRegistry.registerModEntity(new ResourceLocation("EngineBrosMob"),Entity_EngineBros.class, "EngineBrosMob", 523, TokuCraft_core.instance, 80, 3, false, 0x161616,0xDFDFDF);
		EntityRegistry.registerModEntity(new ResourceLocation("HellBrosMob"),Entity_HellBros.class, "HellBrosMob", 524, TokuCraft_core.instance, 80, 3, false, 0x161616,0xDFDFDF);
	
		EntityRegistry.registerModEntity(new ResourceLocation("NeedleSmashMob"),Entity_needle_smash.class, "NeedleSmashMob", 525, TokuCraft_core.instance, 80, 3, false, 0xFFFFFF,0x0074D9);
		EntityRegistry.registerModEntity(new ResourceLocation("greaseMob"),Entity_grease.class, "greaseMob", 526, TokuCraft_core.instance, 80, 3, false, 0xe8c439,0x604e46);
		
	}
}
