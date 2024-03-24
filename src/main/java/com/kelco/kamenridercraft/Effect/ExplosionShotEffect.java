package com.kelco.kamenridercraft.Effect;



import javax.annotation.Nullable;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;


public class ExplosionShotEffect extends MobEffect {


	public ExplosionShotEffect(MobEffectCategory mobEffectCategory, int color) {
		super(mobEffectCategory, color);
	}



	public void applyEffectTick(LivingEntity pLivingEntity, int pAmplifier) {

	}
	
	@Override
	public void applyInstantenousEffect(@Nullable Entity p_19462_, @Nullable Entity p_19463_, LivingEntity p_19464_, int p_19465_, double p_19466_) {

	}



	@Override
	public boolean isDurationEffectTick(int pDuration, int pAmplifier) {
		return true;
	}
}