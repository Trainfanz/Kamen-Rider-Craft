package com.kelco.kamenridercraft.Entities.summons;

import com.kelco.kamenridercraft.KamenRiderCraftCore;
import com.kelco.kamenridercraft.Entities.allies.BaseAllyEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.Difficulty;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.FlyingMob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.NeutralMob;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.FloatGoal;
import net.minecraft.world.entity.ai.goal.FollowOwnerGoal;
import net.minecraft.world.entity.ai.goal.Goal;
import net.minecraft.world.entity.ai.goal.LookAtPlayerGoal;
import net.minecraft.world.entity.ai.goal.MeleeAttackGoal;
import net.minecraft.world.entity.ai.goal.RangedBowAttackGoal;
import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
import net.minecraft.world.entity.ai.goal.WaterAvoidingRandomStrollGoal;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.ai.goal.target.NonTameRandomTargetGoal;
import net.minecraft.world.entity.ai.goal.target.OwnerHurtByTargetGoal;
import net.minecraft.world.entity.ai.goal.target.OwnerHurtTargetGoal;
import net.minecraft.world.entity.ai.goal.target.ResetUniversalAngerTargetGoal;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.entity.animal.Wolf;
import net.minecraft.world.entity.animal.horse.AbstractHorse;
import net.minecraft.world.entity.monster.Creeper;
import net.minecraft.world.entity.monster.Enemy;
import net.minecraft.world.entity.monster.Ghast;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.monster.RangedAttackMob;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.projectile.ProjectileUtil;
import net.minecraft.world.item.BowItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ProjectileWeaponItem;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;

public class RiderSummonEntity extends BaseSummonEntity implements RangedAttackMob {
   private boolean swordgunMelee = false;
   private final RangedBowAttackGoal<RiderSummonEntity> bowGoal = new RangedBowAttackGoal<>(this, 1.0D, 20, 15.0F);
   private final MeleeAttackGoal meleeGoal = new MeleeAttackGoal(this, 1.2D, false) {
      public void stop() {
         super.stop();
         RiderSummonEntity.this.stopBeingAngry();
         RiderSummonEntity.this.startPersistentAngerTimer();
		 RiderSummonEntity.this.setAggressive(false);
      }

      public void start() {
         super.start();
		 RiderSummonEntity.this.setAggressive(true);
      }
   };
   private boolean swordgunMeleeOnly;

	public RiderSummonEntity(EntityType<? extends RiderSummonEntity> type, Level level) {
		super(type, level);
		NAME="rider_summon";
        this.reassessWeaponGoal();
	}

	public static AttributeSupplier setAttributes() {
		return Mob.createMobAttributes().add(Attributes.MOVEMENT_SPEED, (double)0.3F).add(Attributes.MAX_HEALTH, 20.0D).add(Attributes.ARMOR, -10.0D).add(Attributes.ATTACK_DAMAGE, 4.0D).build();
	}


	protected void registerGoals() {
		this.goalSelector.addGoal(1, new FloatGoal(this));
		this.goalSelector.addGoal(3, new FollowOwnerGoal(this, 1.0D, 20.0F, 2.0F, false));
		this.goalSelector.addGoal(4, new WaterAvoidingRandomStrollGoal(this, 1.0D));
		this.goalSelector.addGoal(5, new LookAtPlayerGoal(this, Player.class, 8.0F));
		this.goalSelector.addGoal(5, new RandomLookAroundGoal(this));
        this.targetSelector.addGoal(1, (new HurtByTargetGoal(this, BaseAllyEntity.class, BaseSummonEntity.class)).setAlertOthers());
		this.targetSelector.addGoal(1, new OwnerHurtByTargetGoal(this));
		this.targetSelector.addGoal(2, new OwnerHurtTargetGoal(this));
		this.targetSelector.addGoal(3, new NearestAttackableTargetGoal<>(this, Monster.class, 5, false, false, (p_28879_) -> {
			if (isTame()) {
				return p_28879_ instanceof Enemy && !(p_28879_ instanceof NeutralMob neutral && !neutral.isAngry());
			}else return false;
		}));
      	this.targetSelector.addGoal(4, new ResetUniversalAngerTargetGoal<>(this, true));

	}

	public void aiStep() {
		ItemStack itemstack = this.getItemInHand(ProjectileUtil.getWeaponHoldingHand(this, item -> item instanceof BowItem));
		if (this.getTarget() != null && (itemstack.getItem() instanceof BowItem && itemstack.getItem() instanceof SwordItem || itemstack.is(ItemTags.create(new ResourceLocation(KamenRiderCraftCore.MODID, "arsenal/all_swordguns"))))) {
         boolean swordgunMeleeCheck = (((this.getTarget() instanceof Player player && player.getAbilities().flying && player.distanceToSqr(this) < 10.0D)
         || (this.getTarget() instanceof FlyingMob fly && fly.distanceToSqr(this) < 20.0D)
         || this.getTarget().distanceToSqr(this) < 40.0D));

         if (swordgunMeleeOnly) this.setSwordgunMelee(true);
         else if (swordgunMelee != swordgunMeleeCheck) this.setSwordgunMelee(swordgunMeleeCheck);
      }

		super.aiStep();
	}

    public void setMeleeOnly(boolean p_21840_) {
       this.swordgunMeleeOnly = p_21840_;
    }

	protected SoundEvent getAmbientSound() {
		return SoundEvents.VILLAGER_AMBIENT;
	}

	protected void playStepSound(BlockPos p_30415_, BlockState p_30416_) {

	}

	protected SoundEvent getHurtSound(DamageSource p_30424_) {
		return SoundEvents.VILLAGER_HURT;
	}

	protected SoundEvent getDeathSound() {
		return SoundEvents.VILLAGER_HURT;
	}

    public void reassessWeaponGoal() {
       if (this.level() != null && !this.level().isClientSide) {
          this.goalSelector.removeGoal(this.meleeGoal);
          this.goalSelector.removeGoal(this.bowGoal);
          ItemStack itemstack = this.getItemInHand(ProjectileUtil.getWeaponHoldingHand(this, item -> item instanceof net.minecraft.world.item.BowItem));
          if (itemstack.getItem() instanceof BowItem) {
             this.bowGoal.setMinAttackInterval(30);
             this.goalSelector.addGoal(2, this.bowGoal);
          } else {
             this.goalSelector.addGoal(2, this.meleeGoal);
          }

       }
    }

    public void setSwordgunMelee(boolean melee) {
       if (this.level() != null && !this.level().isClientSide) {
         if (melee) {
           this.goalSelector.removeGoal(this.bowGoal);
           this.goalSelector.addGoal(2, this.meleeGoal);
         } else {
           int i = 30;

           this.bowGoal.setMinAttackInterval(i);
			  this.goalSelector.removeGoal(this.meleeGoal);
           this.goalSelector.addGoal(2, this.bowGoal);
         }
         swordgunMelee = melee;
		}
    }

    public void addAdditionalSaveData(CompoundTag p_30418_) {
       super.addAdditionalSaveData(p_30418_);
       p_30418_.putBoolean("SwordgunMeleeOnly", this.swordgunMeleeOnly);
    }

    public void readAdditionalSaveData(CompoundTag p_32152_) {
       super.readAdditionalSaveData(p_32152_);
       this.reassessWeaponGoal();
       this.swordgunMeleeOnly = p_32152_.getBoolean("SwordgunMeleeOnly");
    }
	
    public void setItemSlot(EquipmentSlot p_32138_, ItemStack p_32139_) {
       super.setItemSlot(p_32138_, p_32139_);
       if (this.level() != null && !this.level().isClientSide) this.reassessWeaponGoal();
    }

    public void performRangedAttack(LivingEntity p_32141_, float p_32142_) {
        ItemStack itemstack = this.getProjectile(this.getItemInHand(ProjectileUtil.getWeaponHoldingHand(this, item -> item instanceof net.minecraft.world.item.BowItem)));
        AbstractArrow abstractarrow = this.getArrow(itemstack, p_32142_);
        if (this.getMainHandItem().getItem() instanceof net.minecraft.world.item.BowItem)
            abstractarrow = ((net.minecraft.world.item.BowItem)this.getMainHandItem().getItem()).customArrow(abstractarrow);
        double d0 = p_32141_.getX() - this.getX();
        double d1 = p_32141_.getY(0.3333333333333333D) - abstractarrow.getY();
        double d2 = p_32141_.getZ() - this.getZ();
        double d3 = Math.sqrt(d0 * d0 + d2 * d2);
        abstractarrow.shoot(d0, d1 + d3 * (double)0.2F, d2, 1.6F, (float)(14 - this.level().getDifficulty().getId() * 4));
        this.playSound(SoundEvents.BLAZE_SHOOT, 1.0F, 1.0F / (this.getRandom().nextFloat() * 0.4F + 0.8F));
        this.level().addFreshEntity(abstractarrow);
    }

   protected AbstractArrow getArrow(ItemStack p_32156_, float p_32157_) {
      return ProjectileUtil.getMobArrow(this, p_32156_, p_32157_);
   }

   public boolean canFireProjectileWeapon(ProjectileWeaponItem p_32144_) {
      return p_32144_ instanceof BowItem;
   }

	public boolean wantsToAttack(LivingEntity p_30389_, LivingEntity p_30390_) {
		if (!(p_30389_ instanceof Creeper)&&!(p_30389_ instanceof Ghast)) {
            if (p_30389_ instanceof BaseAllyEntity) {
                BaseAllyEntity illusion = (BaseAllyEntity)p_30389_;
                return !illusion.isTame() || illusion.getOwner() != p_30390_;
		    } else if (p_30389_ instanceof BaseSummonEntity) {
		    	BaseSummonEntity illusion = (BaseSummonEntity)p_30389_;
		    	return !illusion.isTame() || illusion.getOwner() != p_30390_;
		    } else if (p_30389_ instanceof Player player2 && p_30390_ instanceof Player player1 && !player1.canHarmPlayer(player2)) {
		    	return false;
		    } else if (p_30389_ instanceof AbstractHorse horse && horse.isTamed()) {
		    	return false;
		    } else {
		    	return !(p_30389_ instanceof TamableAnimal) || !((TamableAnimal)p_30389_).isTame();
		    }
        } else if (this.getItemBySlot(EquipmentSlot.MAINHAND).getItem() instanceof BowItem) {
            if (this.getItemBySlot(EquipmentSlot.MAINHAND).getItem() instanceof SwordItem
            || this.getItemBySlot(EquipmentSlot.MAINHAND).is(ItemTags.create(new ResourceLocation(KamenRiderCraftCore.MODID, "arsenal/all_swordguns")))) return !this.swordgunMeleeOnly;
            else return true;
        } else return false;
	}

	public boolean isBaby() {
		return false;
	}

	public boolean canMate(Animal p_30392_) {
		return false;
	}
}