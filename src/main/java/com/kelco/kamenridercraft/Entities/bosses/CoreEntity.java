package com.kelco.kamenridercraft.Entities.bosses;

import java.util.EnumSet;
import com.kelco.kamenridercraft.Entities.footSoldiers.BaseHenchmenEntity;
import com.kelco.kamenridercraft.Items.OOO_Rider_Items;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.EntityDimensions;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Pose;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.Goal;
import net.minecraft.world.entity.ai.goal.LookAtPlayerGoal;
import net.minecraft.world.entity.ai.goal.MeleeAttackGoal;
import net.minecraft.world.entity.ai.goal.MoveThroughVillageGoal;
import net.minecraft.world.entity.ai.goal.MoveTowardsRestrictionGoal;
import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
import net.minecraft.world.entity.ai.goal.WaterAvoidingRandomStrollGoal;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.animal.IronGolem;
import net.minecraft.world.entity.animal.Turtle;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.monster.Zombie;
import net.minecraft.world.entity.npc.AbstractVillager;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.SmallFireball;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.pathfinder.BlockPathTypes;

public class CoreEntity extends BaseHenchmenEntity {


	  private static final EntityDataAccessor<Byte> DATA_FLAGS_ID = SynchedEntityData.defineId(CoreEntity.class, EntityDataSerializers.BYTE);

    public CoreEntity(EntityType<? extends Zombie> type, Level level) {
        super(type, level);
        NAME="core";
        this.setPathfindingMalus(BlockPathTypes.WATER, -1.0F);
        this.setPathfindingMalus(BlockPathTypes.LAVA, 8.0F);
        this.setPathfindingMalus(BlockPathTypes.DANGER_FIRE, 0.0F);
        this.setPathfindingMalus(BlockPathTypes.DAMAGE_FIRE, 0.0F);

        this.setItemSlot(EquipmentSlot.HEAD, new ItemStack(OOO_Rider_Items.OOOHELMET.get()));
        this.setItemSlot(EquipmentSlot.CHEST, new ItemStack(OOO_Rider_Items.OOOCHESTPLATE.get()));
        this.setItemSlot(EquipmentSlot.LEGS, new ItemStack(OOO_Rider_Items.OOOLEGGINGS.get()));
        this.setItemSlot(EquipmentSlot.FEET, new ItemStack(OOO_Rider_Items.CORE_DRIVER.get()));
   Scale= 3;
    }


    public void aiStep() {

        if (level().isClientSide) {
           if (this.random.nextInt(24) == 0 && !this.isSilent()) {
              this.level().playLocalSound(this.getX() + 0.5D, this.getY() + 0.5D, this.getZ() + 0.5D, SoundEvents.BLAZE_BURN, this.getSoundSource(), 1.0F + this.random.nextFloat(), this.random.nextFloat() * 0.7F + 0.3F, false);
           }

           for(int i = 0; i < 2; ++i) {
              this.level().addParticle(ParticleTypes.FLAME, this.getRandomX(0.5D), this.getRandomY(), this.getRandomZ(0.5D), 0.0D, 0.0D, 0.0D);
           }
        }

        super.aiStep();
     }

    protected void addBehaviourGoals() {

        this.goalSelector.addGoal(3, new CoreEntityAttackGoal(this, 1.0D, false));
        this.goalSelector.addGoal(5, new MoveTowardsRestrictionGoal(this, 1.0D));
        this.goalSelector.addGoal(6, new MoveThroughVillageGoal(this, 1.0D, true, 4, this::canBreakDoors));
        this.goalSelector.addGoal(7, new WaterAvoidingRandomStrollGoal(this, 1.0D, 0.0F));
        this.goalSelector.addGoal(8, new LookAtPlayerGoal(this, Player.class, 8.0F));
        this.goalSelector.addGoal(8, new RandomLookAroundGoal(this));
        this.targetSelector.addGoal(1, (new HurtByTargetGoal(this)).setAlertOthers());
        this.targetSelector.addGoal(2, new NearestAttackableTargetGoal<>(this, Player.class, true));
        this.targetSelector.addGoal(3, new NearestAttackableTargetGoal<>(this, AbstractVillager.class, false));
        this.targetSelector.addGoal(3, new NearestAttackableTargetGoal<>(this, IronGolem.class, true));
        this.targetSelector.addGoal(5, new NearestAttackableTargetGoal<>(this, Turtle.class, 10, true, false, Turtle.BABY_ON_LAND_SELECTOR));
     }

    public static AttributeSupplier setAttributes() {

        return Monster.createMonsterAttributes()
        		.add(Attributes.FOLLOW_RANGE, 135.0D)
        		.add(Attributes.MOVEMENT_SPEED,(double)0.23F)
        		.add(Attributes.ATTACK_DAMAGE, 9.0D)
        		.add(Attributes.ARMOR, 3.0D)
        		.add(Attributes.MAX_HEALTH, 180.0D)
        		.add(Attributes.SPAWN_REINFORCEMENTS_CHANCE)
        		.build();
       
     }
    
    protected float getStandingEyeHeight(Pose p_32794_, EntityDimensions p_32795_) {
        return 5.22F;
     }

    protected void defineSynchedData() {
        super.defineSynchedData();
        this.entityData.define(DATA_FLAGS_ID, (byte)0);
     }
    

  

     void setCharged(boolean p_32241_) {
        byte b0 = this.entityData.get(DATA_FLAGS_ID);
        if (p_32241_) {
           b0 = (byte)(b0 | 1);
        } else {
           b0 = (byte)(b0 & -2);
        }

        this.entityData.set(DATA_FLAGS_ID, b0);
     }


    static class CoreEntityAttackGoal extends MeleeAttackGoal {
        private final CoreEntity CoreEntity;
        private int attackStep;
        private int attackTime;
        private int lastSeen;

        public CoreEntityAttackGoal(CoreEntity p_26019_, double p_26020_, boolean p_26021_) {
            super(p_26019_, p_26020_, p_26021_);
           this.CoreEntity = p_26019_;
           this.setFlags(EnumSet.of(Goal.Flag.MOVE, Goal.Flag.LOOK));
        }

        public boolean canUse() {
           LivingEntity livingentity = this.CoreEntity.getTarget();
           return livingentity != null && livingentity.isAlive() && this.CoreEntity.canAttack(livingentity);
        }

        public void start() {
           this.attackStep = 0;
        }

        public void stop() {
           this.CoreEntity.setCharged(false);
           this.lastSeen = 0;
        }

        public boolean requiresUpdateEveryTick() {
           return true;
        }

        public void tick() {
           --this.attackTime;
           LivingEntity livingentity = this.CoreEntity.getTarget();
           if (livingentity != null) {
              boolean flag = this.CoreEntity.getSensing().hasLineOfSight(livingentity);
              if (flag) {
                 this.lastSeen = 0;
              } else {
                 ++this.lastSeen;
              }

              double d0 = this.CoreEntity.distanceToSqr(livingentity);
              if (d0 < 4.0D) {
                 if (!flag) {
                    return;
                 }

                 if (this.attackTime <= 0) {
                    this.attackTime = 20;
                    this.CoreEntity.doHurtTarget(livingentity);
                 }

                 this.CoreEntity.getMoveControl().setWantedPosition(livingentity.getX(), livingentity.getY(), livingentity.getZ(), 1.0D);
              } else if (d0 < this.getFollowDistance() * this.getFollowDistance() && flag) {
                 double d1 = livingentity.getX() - this.CoreEntity.getX();
                 double d2 = livingentity.getY(0.5D) - this.CoreEntity.getY(0.5D);
                 double d3 = livingentity.getZ() - this.CoreEntity.getZ();
                 if (this.attackTime <= 0) {
                    ++this.attackStep;
                    if (this.attackStep == 1) {
                       this.attackTime = 60;
                       this.CoreEntity.setCharged(true);
                    } else if (this.attackStep <= 4) {
                       this.attackTime = 6;
                    } else {
                       this.attackTime = 100;
                       this.attackStep = 0;
                       this.CoreEntity.setCharged(false);
                    }

                    if (this.attackStep > 1) {
                       double d4 = Math.sqrt(Math.sqrt(d0)) * 0.5D;
                       if (!this.CoreEntity.isSilent()) {
                          this.CoreEntity.level().levelEvent((Player)null, 1018, this.CoreEntity.blockPosition(), 0);
                       }

                       for(int i = 0; i < 1; ++i) {
                          SmallFireball smallfireball = new SmallFireball(this.CoreEntity.level(), this.CoreEntity, this.CoreEntity.getRandom().triangle(d1, 2.297D * d4), d2, this.CoreEntity.getRandom().triangle(d3, 2.297D * d4));
                          smallfireball.setPos(smallfireball.getX(), this.CoreEntity.getY(0.5D) + 0.5D, smallfireball.getZ());
                          this.CoreEntity.level().addFreshEntity(smallfireball);
                       }
                    }
                 }

                 this.CoreEntity.getLookControl().setLookAt(livingentity, 10.0F, 10.0F);
              } else if (this.lastSeen < 5) {
                 this.CoreEntity.getMoveControl().setWantedPosition(livingentity.getX(), livingentity.getY(), livingentity.getZ(), 1.0D);
              }

              super.tick();
           }
        }

        private double getFollowDistance() {
           return this.CoreEntity.getAttributeValue(Attributes.FOLLOW_RANGE);
        }
     }
  }
