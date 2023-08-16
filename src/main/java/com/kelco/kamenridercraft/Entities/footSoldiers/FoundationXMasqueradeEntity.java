package com.kelco.kamenridercraft.Entities.footSoldiers;

import com.kelco.kamenridercraft.Entities.MobsCore;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.monster.Zombie;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;

public class FoundationXMasqueradeEntity extends BaseHenchmenEntity {

	public FoundationXMasqueradeEntity(EntityType<? extends Zombie> type, Level level) {
		super(type, level);
		NAME="foundation_x_masquerade";
	}


	public void remove(Entity.RemovalReason p_149847_) {

		if ( this.isDeadOrDying()) {
			if (this.random.nextInt(10) == 1) {
				BaseHenchmenEntity boss = MobsCore.ETERNAL.get().create(this.level());
				if (boss != null) {
					boss.moveTo(this.getX(), this.getY(), this.getZ(), this.getYRot(), 0.0F);
					this.level().addFreshEntity(boss);

					if (this.getLastAttacker()instanceof Player){
						Player playerIn=	(Player) this.getLastAttacker();
						playerIn.sendSystemMessage(Component.translatable("<Kamen Rider Eternal>Henshin!").withStyle(ChatFormatting.YELLOW));
						playerIn.sendSystemMessage(Component.translatable("Eternal!"));
					}
				}
			} else if (this.random.nextInt(9) == 1) {
				BaseHenchmenEntity boss = MobsCore.COMMANDER_DOPANT.get().create(this.level());
				if (boss != null) {
					boss.moveTo(this.getX(), this.getY(), this.getZ(), this.getYRot(), 0.0F);
					this.level().addFreshEntity(boss);

					if (this.getLastAttacker()instanceof Player){
						Player playerIn=	(Player) this.getLastAttacker();
						playerIn.sendSystemMessage(Component.translatable("Commander!").withStyle(ChatFormatting.GREEN));
					}
				}
			} else if (this.random.nextInt(9) == 1) {
				BaseHenchmenEntity boss = MobsCore.MUCHIRI.get().create(this.level());
				if (boss != null) {
					boss.moveTo(this.getX(), this.getY(), this.getZ(), this.getYRot(), 0.0F);
					this.level().addFreshEntity(boss);

					if (this.getLastAttacker()instanceof Player){
						Player playerIn=	(Player) this.getLastAttacker();
						playerIn.sendSystemMessage(Component.translatable("Mukade! Hachi! Ari!").withStyle(ChatFormatting.YELLOW));
					}
				}
			}
		}
		super.remove(p_149847_);
	}

	public static AttributeSupplier setAttributes() {

		return Monster.createMonsterAttributes()
				.add(Attributes.FOLLOW_RANGE, 35.0D)
				.add(Attributes.MOVEMENT_SPEED,(double)0.23F)
				.add(Attributes.ATTACK_DAMAGE, 4.0D)
				.add(Attributes.ARMOR, 3.0D)
				.add(Attributes.MAX_HEALTH, 30.0D)
				.add(Attributes.SPAWN_REINFORCEMENTS_CHANCE)
				.build();
	}
}