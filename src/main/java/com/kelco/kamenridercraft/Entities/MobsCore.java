package com.kelco.kamenridercraft.Entities;


import com.kelco.kamenridercraft.KamenRiderCraftCore;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class MobsCore {
	public static final DeferredRegister<EntityType<?>> MOBLIST = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, KamenRiderCraftCore.MODID);
    
    public static final RegistryObject<EntityType<ShockerCombatmanEntity>> SHOCKER_COMBATMAN = MOBLIST.register("shocker_combatman",
            () -> EntityType.Builder.of(ShockerCombatmanEntity::new, MobCategory.MONSTER).sized(0.6F, 1.95F).clientTrackingRange(8).build( KamenRiderCraftCore.MODID + ":shocker_combatman"));
    
}
