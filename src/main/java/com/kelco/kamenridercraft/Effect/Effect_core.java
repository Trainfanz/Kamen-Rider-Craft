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

	public static final RegistryObject<MobEffect> ANTIPOISON = EFFECT.register("anti_poison",
			() -> new 	AntiPoisonEffect(MobEffectCategory.BENEFICIAL, 0x8532a8));

	public static final RegistryObject<MobEffect> SLASH= EFFECT.register("slash",
			() -> new 	SlashEffect(MobEffectCategory.BENEFICIAL, 0x21daff));

	public static final RegistryObject<MobEffect> PUNCH= EFFECT.register("punch",
			() -> new 	PunchEffect(MobEffectCategory.BENEFICIAL, 0x1d8519));


	//FLY_POTION
	//FIRE_PUNCH_POTION

	//BIG_POTION
	//SMALL_POTION 

	//BUGSTER_POTION 

	

	public static void register(IEventBus eventBus) {
		EFFECT.register(eventBus);
	}

}