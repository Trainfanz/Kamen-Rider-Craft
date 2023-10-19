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


	public void applyEffectTick(LivingEntity pLivingEntity, int pAmplifier) {
		
		if (!pLivingEntity.level().isClientSide()) {
			if (pLivingEntity instanceof Player player) {

				if (Player.DEFAULT_BB_HEIGHT==player.getDimensionsForge(player.getPose()).height) {
					player.setPose(Pose.CROUCHING);;
				}
			}
		}
		
	}
	@Override
	   public void applyInstantenousEffect(@Nullable Entity p_19462_, @Nullable Entity p_19463_, LivingEntity p_19464_, int p_19465_, double p_19466_) {
		  
		   }
	
	 public boolean isInstantenous() {
	      return true;
	   }
	 
	@Override
	public boolean isDurationEffectTick(int pDuration, int pAmplifier) {
		return true;
	}
}