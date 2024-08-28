package com.kelco.kamenridercraft.Entities.footSoldiers;

import javax.annotation.Nullable;

import com.kelco.kamenridercraft.KamenRiderCraftCore;
import com.kelco.kamenridercraft.Entities.MobsCore;
import com.kelco.kamenridercraft.Entities.summons.BaseSummonEntity;
import com.kelco.kamenridercraft.Items.Zero_One_Rider_Items;

import net.minecraft.ChatFormatting;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.Difficulty;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.FlyingMob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.SpawnGroupData;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.FloatGoal;
import net.minecraft.world.entity.ai.goal.LookAtPlayerGoal;
import net.minecraft.world.entity.ai.goal.MeleeAttackGoal;
import net.minecraft.world.entity.ai.goal.MoveThroughVillageGoal;
import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
import net.minecraft.world.entity.ai.goal.RangedBowAttackGoal;
import net.minecraft.world.entity.ai.goal.WaterAvoidingRandomStrollGoal;
import net.minecraft.world.entity.ai.goal.ZombieAttackGoal;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.animal.IronGolem;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.monster.RangedAttackMob;
import net.minecraft.world.entity.monster.Zombie;
import net.minecraft.world.entity.monster.ZombifiedPiglin;
import net.minecraft.world.entity.npc.AbstractVillager;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.projectile.ProjectileUtil;
import net.minecraft.world.item.BowItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ProjectileWeaponItem;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.ServerLevelAccessor;

public class AbaddonEntity extends BaseHenchmenEntity implements RangedAttackMob {
   private boolean swordgunMelee = false;
   private final RangedBowAttackGoal<AbaddonEntity> bowGoal = new RangedBowAttackGoal<>(this, 1.0D, 30, 15.0F);
   private final MeleeAttackGoal meleeGoal = new ZombieAttackGoal(this, 1.0D, false) {
      public void stop() {
         super.stop();
		 AbaddonEntity.this.setAggressive(false);
      }

      public void start() {
         super.start();
		 AbaddonEntity.this.setAggressive(true);
      }
   };

	public AbaddonEntity(EntityType<? extends Zombie> type, Level level) {
		super(type, level);
		NAME="abaddon";
	    this.setItemSlot(EquipmentSlot.HEAD, new ItemStack(Zero_One_Rider_Items.ZERO_ONE_HELMET.get()));
	    this.setItemSlot(EquipmentSlot.CHEST, new ItemStack(Zero_One_Rider_Items.ZERO_ONE_CHESTPLATE.get()));
	    this.setItemSlot(EquipmentSlot.LEGS, new ItemStack(Zero_One_Rider_Items.ZERO_ONE_LEGGINGS.get()));
	    this.setItemSlot(EquipmentSlot.FEET, new ItemStack(Zero_One_Rider_Items.SHOT_ABADDO_RISER.get()));
	    this.setItemSlot(EquipmentSlot.MAINHAND, new ItemStack(Zero_One_Rider_Items.SHOTABADDORISER_GUN.get()));
        this.reassessWeaponGoal();
    }


    public void remove(Entity.RemovalReason p_149847_) {

		if ( this.isDeadOrDying()) {
			
			if (this.random.nextInt(10) == 1) {
				BaseHenchmenEntity boss = MobsCore.ABADDON_COMMANDER.get().create(this.level());
				if (boss != null) {
					boss.moveTo(this.getX(), this.getY(), this.getZ(), this.getYRot(), 0.0F);
					this.level().addFreshEntity(boss);
					if (this.getLastAttacker()instanceof Player){
						Player playerIn=	(Player) this.getLastAttacker();
						playerIn.sendSystemMessage(Component.translatable("ThinkNet Rise! Crowding Hopper!").withStyle(ChatFormatting.GOLD));
					}
				}
			} else if (this.random.nextInt(9) == 1) {
				BaseHenchmenEntity boss = MobsCore.EDEN.get().create(this.level());
				if (boss != null) {
					boss.moveTo(this.getX(), this.getY(), this.getZ(), this.getYRot(), 0.0F);
					this.level().addFreshEntity(boss);
					if (this.getLastAttacker()instanceof Player){
						Player playerIn=	(Player) this.getLastAttacker();
						playerIn.sendSystemMessage(Component.translatable("Progrise Ark! Imagine! Ideal! Illusion! Eden the Kamen Rider!").withStyle(ChatFormatting.RED));
					}
				}
			}
		}
		super.remove(p_149847_);
	}
    
    @Override
    protected void registerGoals() {
    	 this.goalSelector.addGoal(1, new FloatGoal(this));
        this.goalSelector.addGoal(8, new LookAtPlayerGoal(this, Player.class, 8.0F));
        this.goalSelector.addGoal(8, new RandomLookAroundGoal(this));
        this.addBehaviourGoals();
    }
    
    @Override
    protected void addBehaviourGoals() {
        this.goalSelector.addGoal(6, new MoveThroughVillageGoal(this, 1.0D, true, 4, this::canBreakDoors));
        this.goalSelector.addGoal(7, new WaterAvoidingRandomStrollGoal(this, 1.0D));
        this.targetSelector.addGoal(1, (new HurtByTargetGoal(this, BaseHenchmenEntity.class)).setAlertOthers(ZombifiedPiglin.class));
        this.targetSelector.addGoal(2, new NearestAttackableTargetGoal<>(this, Player.class, true));
        this.targetSelector.addGoal(3, new NearestAttackableTargetGoal<>(this, AbstractVillager.class, false));
        this.targetSelector.addGoal(3, new NearestAttackableTargetGoal<>(this, IronGolem.class, true));
        this.targetSelector.addGoal(3, new NearestAttackableTargetGoal<>(this, BaseSummonEntity.class, true));
     }

	public void aiStep() {
		ItemStack itemstack = this.getItemInHand(ProjectileUtil.getWeaponHoldingHand(this, item -> item instanceof BowItem));
		
		if (this.getTarget() != null && (itemstack.getItem() instanceof BowItem && itemstack.getItem() instanceof SwordItem || itemstack.is(ItemTags.create(new ResourceLocation(KamenRiderCraftCore.MODID, "arsenal/all_swordguns"))))) {
         boolean swordgunMeleeCheck = (((this.getTarget() instanceof Player player && player.getAbilities().flying && player.distanceToSqr(this) < 10.0D)
         || (this.getTarget() instanceof FlyingMob fly && fly.distanceToSqr(this) < 20.0D)
         || this.getTarget().distanceToSqr(this) < 40.0D));

         if (swordgunMelee != swordgunMeleeCheck) this.setSwordgunMelee(swordgunMeleeCheck);
      }

		super.aiStep();
	}




	public static AttributeSupplier setAttributes() {

		return Monster.createMonsterAttributes()
				.add(Attributes.FOLLOW_RANGE, 35.0D)
				.add(Attributes.MOVEMENT_SPEED,(double)0.23F)
				.add(Attributes.ATTACK_DAMAGE, 8.0D)
				.add(Attributes.ARMOR, 3.0D)
				.add(Attributes.MAX_HEALTH, 30.0D)
				.add(Attributes.SPAWN_REINFORCEMENTS_CHANCE)
				.build();
	}

    public void reassessWeaponGoal() {
       if (this.level() != null && !this.level().isClientSide) {
          ItemStack itemstack = this.getItemInHand(ProjectileUtil.getWeaponHoldingHand(this, item -> item instanceof BowItem));
          if (itemstack.getItem() instanceof BowItem) {
             int i = 20;
             if (this.level().getDifficulty() != Difficulty.HARD) {
                i = 40;
             }

             this.bowGoal.setMinAttackInterval(i);
			 this.goalSelector.removeGoal(this.meleeGoal);
             this.goalSelector.addGoal(2, this.bowGoal);
          } else {
			 this.goalSelector.removeGoal(this.bowGoal);
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
           int i = 20;
           if (this.level().getDifficulty() != Difficulty.HARD) {
              i = 40;
           }

           this.bowGoal.setMinAttackInterval(i);
			  this.goalSelector.removeGoal(this.meleeGoal);
           this.goalSelector.addGoal(2, this.bowGoal);
         }
         swordgunMelee = melee;
		}
    }

    public void readAdditionalSaveData(CompoundTag p_32152_) {
       super.readAdditionalSaveData(p_32152_);
       this.reassessWeaponGoal();
    }
	
    public void setItemSlot(EquipmentSlot p_32138_, ItemStack p_32139_) {
       super.setItemSlot(p_32138_, p_32139_);
	   Level level = this.level();
       if (!level.isClientSide) this.reassessWeaponGoal();
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
   
   @Nullable
   public SpawnGroupData finalizeSpawn(ServerLevelAccessor p_34297_, DifficultyInstance p_34298_, MobSpawnType p_34299_, @Nullable SpawnGroupData p_34300_, @Nullable CompoundTag p_34301_) {
      p_34300_ = super.finalizeSpawn(p_34297_, p_34298_, p_34299_, p_34300_, p_34301_);
	  
	  if (p_34297_.getRandom().nextInt(2) == 1) {
		this.setItemSlot(EquipmentSlot.FEET, new ItemStack(Zero_One_Rider_Items.SLASH_ABADDO_RISER.get()));
		this.setItemSlot(EquipmentSlot.MAINHAND, new ItemStack(Zero_One_Rider_Items.SLASHABADDORISER_SWORD.get()));
		this.reassessWeaponGoal();
	  }
      return p_34300_;
   }
}