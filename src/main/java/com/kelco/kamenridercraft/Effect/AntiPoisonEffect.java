package com.kelco.kamenridercraft.Effect;


import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;


public class AntiPoisonEffect extends MobEffect {


	public AntiPoisonEffect(MobEffectCategory mobEffectCategory, int color) {
		super(mobEffectCategory, color);
	}

	@Override
	public void applyEffectTick(LivingEntity pLivingEntity, int pAmplifier) {
	 if (!pLivingEntity.level().isClientSide()) {

			pLivingEntity.removeEffect(MobEffects.POISON);
		
			
	}
	 }

	@Override
	public boolean isDurationEffectTick(int pDuration, int pAmplifier) {
		return true;
	}
}