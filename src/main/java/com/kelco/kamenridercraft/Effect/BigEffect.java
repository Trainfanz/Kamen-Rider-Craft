package com.kelco.kamenridercraft.Effect;



import javax.annotation.Nullable;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Pose;
import net.minecraft.world.entity.player.Player;


public class BigEffect extends MobEffect {


	public BigEffect(MobEffectCategory mobEffectCategory, int color) {
		super(mobEffectCategory, color);
	}

	@Override
	public void applyEffectTick(LivingEntity pLivingEntity, int pAmplifier) {
		/**
		if (!pLivingEntity.level().isClientSide()) {
			if (pLivingEntity instanceof Player player) {

				if (Player.DEFAULT_BB_HEIGHT==player.getDimensionsForge(player.getPose()).height) {
					player.setPose(Pose.CROUCHING);;
				}
			}
		}
		**/
	}



	@Override
	public boolean isDurationEffectTick(int pDuration, int pAmplifier) {
		return false;
	}
}