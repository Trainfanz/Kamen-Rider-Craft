package com.kelco.kamenridercraft.Effect;

import com.kelco.kamenridercraft.KamenRiderCraftCore;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class Effect_core {

	public static final DeferredRegister<MobEffect> EFFECT = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, KamenRiderCraftCore.MODID);


	 public static final RegistryObject<MobEffect> BOOST = EFFECT.register("boost",
	            () -> new 	BoostEffect(MobEffectCategory.BENEFICIAL, 0xff0015));


	
	public static void register(IEventBus eventBus) {
		 EFFECT.register(eventBus);
	}

}