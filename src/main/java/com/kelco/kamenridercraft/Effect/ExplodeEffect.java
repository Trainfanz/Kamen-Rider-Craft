package com.kelco.kamenridercraft.Effect;



import javax.annotation.Nullable;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Pose;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;


public class ExplodeEffect extends MobEffect {


	public ExplodeEffect(MobEffectCategory mobEffectCategory, int color) {
		super(mobEffectCategory, color);
	}



	public void applyEffectTick(LivingEntity pLivingEntity, int pAmplifier) {

	
		if (!pLivingEntity.level().isClientSide) {
			
				if(pLivingEntity.getEffect(Effect_core.EXPLODE.get()).getDuration()<5) {
				// TODO 1.19.3: The creation of Level.ExplosionInteraction means this code path will fire EntityMobGriefingEvent twice. Should we try and fix it? -SS
				boolean flag = net.minecraftforge.event.ForgeEventFactory.getMobGriefingEvent(pLivingEntity.level(), pLivingEntity);
				pLivingEntity.level().explode(null, pLivingEntity.getX(), pLivingEntity.getY()+2, pLivingEntity.getZ(),2f, flag, Level.ExplosionInteraction.MOB);
				
				}
				}
	}
	
	@Override
	public void applyInstantenousEffect(@Nullable Entity p_19462_, @Nullable Entity p_19463_, LivingEntity p_19464_, int p_19465_, double p_19466_) {

	}



	@Override
	public boolean isDurationEffectTick(int pDuration, int pAmplifier) {
		return true;
	}
}