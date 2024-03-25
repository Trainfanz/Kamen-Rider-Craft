package com.kelco.kamenridercraft.Effect;


import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;


public class SaveEffect extends MobEffect {


	public SaveEffect(MobEffectCategory mobEffectCategory, int color) {
		super(mobEffectCategory, color);
	}

	@Override
	public void applyEffectTick(LivingEntity pLivingEntity, int pAmplifier) {
	 if (!pLivingEntity.level().isClientSide()) {

			pLivingEntity.removeEffect(MobEffects.POISON);
			pLivingEntity.removeEffect(MobEffects.BLINDNESS);
			pLivingEntity.removeEffect(MobEffects.CONFUSION);
			pLivingEntity.removeEffect(MobEffects.DARKNESS);
			pLivingEntity.removeEffect(MobEffects.DIG_SLOWDOWN);
			pLivingEntity.removeEffect(MobEffects.HARM);
			pLivingEntity.removeEffect(MobEffects.HUNGER);
			pLivingEntity.removeEffect(MobEffects.MOVEMENT_SLOWDOWN);
			pLivingEntity.removeEffect(MobEffects.UNLUCK);
			pLivingEntity.removeEffect(MobEffects.WEAKNESS); 
			pLivingEntity.removeEffect(MobEffects.WITHER);
			pLivingEntity.removeEffect(Effect_core.EXPLODE.get());
			pLivingEntity.removeEffect(Effect_core.RESET.get());
	}
	 }

	@Override
	public boolean isDurationEffectTick(int pDuration, int pAmplifier) {
		return true;
	}
}