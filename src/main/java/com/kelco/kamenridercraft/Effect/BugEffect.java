package com.kelco.kamenridercraft.Effect;

import java.util.Random;

import com.kelco.kamenridercraft.Entities.MobsCore;
import com.kelco.kamenridercraft.Entities.footSoldiers.BaseHenchmenEntity;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.LivingEntity;


public class BugEffect extends MobEffect {


	public BugEffect(MobEffectCategory mobEffectCategory, int color) {
		super(mobEffectCategory, color);
	}

	@Override
	public void applyEffectTick(LivingEntity pLivingEntity, int pAmplifier) {

		BaseHenchmenEntity boss  =   MobsCore.BUGSTERVIRUS.get().create(pLivingEntity.level());
		Random rand = new Random();


		switch (rand.nextInt(500))
		{
		case 0:

			if (boss != null) {
				boss.moveTo(pLivingEntity.getX()+(rand.nextInt(8)-4), pLivingEntity.getY(), pLivingEntity.getZ()+(rand.nextInt(8)-4),0.0f, 0.0F);
				pLivingEntity.level().addFreshEntity(boss);
				break;


			}
		}

	}

	@Override
	public boolean isDurationEffectTick(int pDuration, int pAmplifier) {
		return true;
	}
}