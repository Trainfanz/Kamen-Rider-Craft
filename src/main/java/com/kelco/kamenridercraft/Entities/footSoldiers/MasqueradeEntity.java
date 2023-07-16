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

public class MasqueradeEntity extends BaseHenchmenEntity {
	
    public MasqueradeEntity(EntityType<? extends Zombie> type, Level level) {
        super(type, level);
        NAME="masquerade";
    }


    public void remove(Entity.RemovalReason p_149847_) {

		if ( this.isDeadOrDying()) {
			if (this.random.nextInt(10) == 1) {
				BaseHenchmenEntity boss = MobsCore.NASCA_DOPANT.get().create(this.level);
				if (boss != null) {
					boss.moveTo(this.getX(), this.getY(), this.getZ(), this.getYRot(), 0.0F);
					this.level.addFreshEntity(boss);

					if (this.getLastAttacker()instanceof Player){
						Player playerIn=	(Player) this.getLastAttacker();
						playerIn.sendSystemMessage(Component.translatable("Nasca!").withStyle(ChatFormatting.BLUE));
					}
				}
			} else if (this.random.nextInt(9) == 1) {
				BaseHenchmenEntity boss = MobsCore.CLAYDOLL_DOPANT.get().create(this.level);
				if (boss != null) {
					boss.moveTo(this.getX(), this.getY(), this.getZ(), this.getYRot(), 0.0F);
					this.level.addFreshEntity(boss);

					if (this.getLastAttacker()instanceof Player){
						Player playerIn=	(Player) this.getLastAttacker();
						playerIn.sendSystemMessage(Component.translatable("Claydoll!").withStyle(ChatFormatting.GOLD));
					}
				}
			}else if (this.random.nextInt(8) == 1) {
				BaseHenchmenEntity boss = MobsCore.SMILODON_DOPANT.get().create(this.level);
				if (boss != null) {
					boss.moveTo(this.getX(), this.getY(), this.getZ(), this.getYRot(), 0.0F);
					this.level.addFreshEntity(boss);

					if (this.getLastAttacker()instanceof Player){
						Player playerIn=	(Player) this.getLastAttacker();
						playerIn.sendSystemMessage(Component.translatable("Smilodon!").withStyle(ChatFormatting.GOLD));
					}
				}
			}else if (this.random.nextInt(9) == 1) {
				BaseHenchmenEntity boss = MobsCore.WEATHER_DOPANT.get().create(this.level);
				if (boss != null) {
					boss.moveTo(this.getX(), this.getY(), this.getZ(), this.getYRot(), 0.0F);
					this.level.addFreshEntity(boss);

					if (this.getLastAttacker()instanceof Player){
						Player playerIn=	(Player) this.getLastAttacker();
						playerIn.sendSystemMessage(Component.translatable("Weather!").withStyle(ChatFormatting.GRAY));
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