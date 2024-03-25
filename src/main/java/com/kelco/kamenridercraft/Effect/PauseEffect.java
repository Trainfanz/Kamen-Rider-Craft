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


public class PauseEffect extends MobEffect {


	public PauseEffect(MobEffectCategory mobEffectCategory, int color) {
		super(mobEffectCategory, color);
	}


}