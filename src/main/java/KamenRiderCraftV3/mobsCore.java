package KamenRiderCraftV3;

import KamenRiderCraftV3.mobs.EntityAnkh;
import KamenRiderCraftV3.mobs.EntityBugsterVirus;
import KamenRiderCraftV3.mobs.EntityChronos;
import KamenRiderCraftV3.mobs.EntityMasquerade;
import KamenRiderCraftV3.mobs.EntityPoppy;
import KamenRiderCraftV3.mobs.Entitygamma_commando;
import KamenRiderCraftV3.mobs.Entityguardian;
import KamenRiderCraftV3.mobs.Entityshocker_combatman;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EntityList.EntityEggInfo;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class mobsCore {

	public static void Addmob(){
		/**
		   * Register the mod entity type with FML
		     * This will also register a spawn egg.

		     * @param entityClass The entity class
		     * @param entityName A unique name for the entity
		     * @param id A mod specific ID for the entity
		     * @param mod The mod
		     * @param trackingRange The range at which MC will send tracking updates
		     * @param updateFrequency The frequency of tracking updates
		     * @param sendsVelocityUpdates Whether to send velocity information packets as well
		     * @param eggPrimary Primary egg color
		     * @param eggSecondary Secondary egg color
		   **/  
		EntityRegistry.registerModEntity(EntityMasquerade.class, "MasqueradeMob", getUniqueID(), KamenRiderCraftV3_core.instance, 80, 3, false,000000, 0xFFFFFF);
		EntityRegistry.addSpawn(EntityMasquerade.class,  6, 2, 3, EnumCreatureType.MONSTER, BiomeGenBase.beach, BiomeGenBase.desert, BiomeGenBase.extremeHills, BiomeGenBase.forest, BiomeGenBase.jungle, BiomeGenBase.plains, BiomeGenBase.taiga, BiomeGenBase.taigaHills);
	
		EntityRegistry.registerModEntity(EntityAnkh.class, "Ankhmob", getUniqueID()+1, KamenRiderCraftV3_core.instance, 80, 3, false, 0xFF0000, 0x1FFF2E);
		EntityRegistry.addSpawn(EntityAnkh.class,  1, 1, 1, EnumCreatureType.CREATURE, BiomeGenBase.beach, BiomeGenBase.desert, BiomeGenBase.extremeHills, BiomeGenBase.forest, BiomeGenBase.jungle, BiomeGenBase.plains, BiomeGenBase.taiga, BiomeGenBase.taigaHills);
	
		EntityRegistry.registerModEntity(EntityBugsterVirus.class, "BugsterVirusMob", getUniqueID()+2, KamenRiderCraftV3_core.instance, 80, 3, false, 0xe88936,000000);
		EntityRegistry.addSpawn(EntityBugsterVirus.class,  6, 2, 3, EnumCreatureType.MONSTER, BiomeGenBase.beach, BiomeGenBase.desert, BiomeGenBase.extremeHills, BiomeGenBase.forest, BiomeGenBase.jungle, BiomeGenBase.plains, BiomeGenBase.taiga, BiomeGenBase.taigaHills);
	
		EntityRegistry.registerModEntity(Entitygamma_commando.class, "GammaCommandoMob", getUniqueID()+3, KamenRiderCraftV3_core.instance, 80, 3, false, 0xe88936,000000);
		EntityRegistry.addSpawn(Entitygamma_commando.class,  6, 2, 3, EnumCreatureType.MONSTER, BiomeGenBase.beach, BiomeGenBase.desert, BiomeGenBase.extremeHills, BiomeGenBase.forest, BiomeGenBase.jungle, BiomeGenBase.plains, BiomeGenBase.taiga, BiomeGenBase.taigaHills);
	
		EntityRegistry.registerModEntity(EntityPoppy.class, "PoppyMob", getUniqueID()+4, KamenRiderCraftV3_core.instance, 80, 3, false, 0xfcfb81,0xff84ac);
		
		EntityRegistry.registerModEntity(EntityChronos.class, "ChronosMob", getUniqueID()+5, KamenRiderCraftV3_core.instance, 80, 3, false, 0xe88936,000000);
		
		EntityRegistry.registerModEntity(Entityshocker_combatman.class, "ShockerCombatmanMob", getUniqueID()+6, KamenRiderCraftV3_core.instance, 80, 3, false, 0xe88936,000000);
		EntityRegistry.addSpawn(Entityshocker_combatman.class,  6, 2, 3, EnumCreatureType.MONSTER, BiomeGenBase.beach, BiomeGenBase.desert, BiomeGenBase.extremeHills, BiomeGenBase.forest, BiomeGenBase.jungle, BiomeGenBase.plains, BiomeGenBase.taiga, BiomeGenBase.taigaHills);
		
		EntityRegistry.registerModEntity(Entityguardian.class, "GuardianMob", getUniqueID()+7, KamenRiderCraftV3_core.instance, 80, 3, false, 0xe88936,000000);
		EntityRegistry.addSpawn(Entityguardian.class,  6, 2, 3, EnumCreatureType.MONSTER, BiomeGenBase.beach, BiomeGenBase.desert, BiomeGenBase.extremeHills, BiomeGenBase.forest, BiomeGenBase.jungle, BiomeGenBase.plains, BiomeGenBase.taiga, BiomeGenBase.taigaHills);
		
	}
	
	public static int getUniqueID(){
		int EntityId = 300;
		do{
			EntityId++;
		} while(EntityList.getStringFromID(EntityId) != null);
		return EntityId;
	}

}
