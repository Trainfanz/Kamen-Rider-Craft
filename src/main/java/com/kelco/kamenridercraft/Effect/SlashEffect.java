package com.kelco.kamenridercraft.Effect;


import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.SwordItem;


public class SlashEffect extends MobEffect {


	public SlashEffect(MobEffectCategory mobEffectCategory, int color) {
		super(mobEffectCategory, color);
	}

	@Override
	public void applyEffectTick(LivingEntity pLivingEntity, int pAmplifier) {
	 if (!pLivingEntity.level.isClientSide()) {

			if (pLivingEntity.getMainHandItem().getItem() instanceof SwordItem) {
				pLivingEntity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 30, pAmplifier,true,false));
			}
		
			
	}
	 }

	@Override
	public boolean isDurationEffectTick(int pDuration, int pAmplifier) {
		return true;
	}
}