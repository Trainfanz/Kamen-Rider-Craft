package com.kelco.kamenridercraft.Effect;

import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.phys.Vec3;


public class BoostEffect extends MobEffect {


	public BoostEffect(MobEffectCategory mobEffectCategory, int color) {
		super(mobEffectCategory, color);
	}

	@Override
	public void applyEffectTick(LivingEntity pLivingEntity, int pAmplifier) {

		if (pLivingEntity.isCrouching()) {
			if (!pLivingEntity.level().isClientSide()) {

				pLivingEntity.fallDistance = 0.0f;
				Vec3 look = pLivingEntity.getLookAngle();
				pLivingEntity.setDeltaMovement(pLivingEntity.getDeltaMovement().add(look.x*(0.1*(1+pAmplifier)), look.y*0.2, look.z*(0.1*(1+pAmplifier))));
				if ( pLivingEntity instanceof Player) {
					((Player)pLivingEntity).hurtMarked=true;
				}
				}	
			pLivingEntity.level().addParticle(ParticleTypes.CAMPFIRE_SIGNAL_SMOKE,pLivingEntity.getX(), pLivingEntity.getY(),pLivingEntity.getZ(), 0.0D, 0.0D, 0.0D);
			pLivingEntity.level().addParticle(ParticleTypes.CAMPFIRE_SIGNAL_SMOKE,pLivingEntity.getX(), pLivingEntity.getY()+1,pLivingEntity.getZ(), 0.0D, 0.0D, 0.0D);
			pLivingEntity.level().addParticle(ParticleTypes.CAMPFIRE_SIGNAL_SMOKE,pLivingEntity.getX(), pLivingEntity.getY()+0.5,pLivingEntity.getZ(), 0.0D, 0.0D, 0.0D);
		
		}
	}

	@Override
	public boolean isDurationEffectTick(int pDuration, int pAmplifier) {
		return true;
	}
}