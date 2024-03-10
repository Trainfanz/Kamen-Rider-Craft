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

	public static final RegistryObject<MobEffect> FLYING= EFFECT.register("flying",
			() -> new 	FlyingEffect(MobEffectCategory.BENEFICIAL, 0x1d8519));

	public static final RegistryObject<MobEffect> SMALL= EFFECT.register("small",
			() -> new 	SmallEffect(MobEffectCategory.NEUTRAL, 0x1d8519));

	public static final RegistryObject<MobEffect> BIG= EFFECT.register("big",
			() -> new 	BigEffect(MobEffectCategory.NEUTRAL, 0x1d8519));

	public static final RegistryObject<MobEffect> FLAT= EFFECT.register("flat",
			() -> new 	BigEffect(MobEffectCategory.NEUTRAL, 0xf7fada));

	public static final RegistryObject<MobEffect> STRETCH= EFFECT.register("stretch",
			() -> new 	StretchEffect(MobEffectCategory.NEUTRAL, 0xf78d95));

	public static final RegistryObject<MobEffect> WIDE= EFFECT.register("wide",
			() -> new 	WideEffect(MobEffectCategory.NEUTRAL, 0x87ce87));


	public static final RegistryObject<MobEffect> EXPLODE= EFFECT.register("explode",
			() -> new 	ExplodeEffect(MobEffectCategory.HARMFUL, 0x565656));

	
	//FIRE_PUNCH_POTION

	//BUGSTER_POTION 

	public static final RegistryObject<MobEffect> BUGSTER= EFFECT.register("bug",
			() -> new 	BugEffect(MobEffectCategory.HARMFUL, 0xe8842e));

	

	public static void register(IEventBus eventBus) {
		EFFECT.register(eventBus);
	}

}