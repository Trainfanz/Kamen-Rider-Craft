package com.kelco.kamenridercraft.Entities.footSoldiers;

import com.kelco.kamenridercraft.Entities.MobsCore;
import com.kelco.kamenridercraft.Items.Faiz_Rider_Items;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.monster.Zombie;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class RiotrooperEntity extends BaseHenchmenEntity {
	
    public RiotrooperEntity(EntityType<? extends Zombie> type, Level level) {
        super(type, level);
        NAME="horse_orpnoch";
        this.setItemSlot(EquipmentSlot.HEAD, new ItemStack(Faiz_Rider_Items.FAIZHELMET.get()));
        this.setItemSlot(EquipmentSlot.CHEST, new ItemStack(Faiz_Rider_Items.FAIZCHESTPLATE.get()));
        this.setItemSlot(EquipmentSlot.LEGS, new ItemStack(Faiz_Rider_Items.FAIZLEGGINGS.get()));
        this.setItemSlot(EquipmentSlot.FEET, new ItemStack(Faiz_Rider_Items.SMARTBUCKLE.get()));
        this.setItemSlot(EquipmentSlot.MAINHAND, new ItemStack(Faiz_Rider_Items.AXEL_RAY_GUN.get()));
    }
    
	public void remove(Entity.RemovalReason p_149847_) {

		if ( this.isDeadOrDying()) {
			if (this.random.nextInt(10) == 1) {
				BaseHenchmenEntity boss = MobsCore.ORGA.get().create(this.level());
				if (boss != null) {
					boss.moveTo(this.getX(), this.getY(), this.getZ(), this.getYRot(), 0.0F);
					this.level().addFreshEntity(boss);

					if (this.getLastAttacker()instanceof Player){
						Player playerIn=	(Player) this.getLastAttacker();
						playerIn.sendSystemMessage(Component.translatable("<Orga>Do you know? A dream is the same as a curse. Those who fail are forever cursed. Or so I hear...").withStyle(ChatFormatting.RED));
					}
				}
			}
		}
		super.remove(p_149847_);
	}

    public static AttributeSupplier setAttributes() {
    
    	//.add(ForgeMod.ATTACK_RANGE.get(),2)
        return Monster.createMonsterAttributes()
        		.add(Attributes.FOLLOW_RANGE, 35.0D)
        		.add(Attributes.MOVEMENT_SPEED,(double)0.23F)
        		.add(Attributes.ATTACK_DAMAGE, 4.0D)
        		.add(Attributes.MAX_HEALTH, 30.0D)
        		.add(Attributes.SPAWN_REINFORCEMENTS_CHANCE)
        		.build();
     }
}