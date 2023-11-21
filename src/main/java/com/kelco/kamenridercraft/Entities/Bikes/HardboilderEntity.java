package com.kelco.kamenridercraft.Entities.Bikes;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.level.Level;

public class HardboilderEntity extends baseBikeEntity {
	

	public HardboilderEntity(EntityType<? extends Animal> entityType, Level level) {
		super(entityType, level);
		NAME ="hardboilder";
		}


	public static AttributeSupplier setAttributes() {
		return Mob.createMobAttributes().add(Attributes.MOVEMENT_SPEED, (double)0.3F).add(Attributes.MAX_HEALTH, 10.0D).add(Attributes.ATTACK_DAMAGE, 2.0D).build();
	}
}
