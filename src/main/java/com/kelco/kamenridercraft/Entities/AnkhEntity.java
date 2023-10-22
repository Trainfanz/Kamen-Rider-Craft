package com.kelco.kamenridercraft.Entities;



import javax.annotation.Nullable;

import com.kelco.kamenridercraft.Entities.bosses.AnkhCompleteEntity;
import com.kelco.kamenridercraft.Entities.footSoldiers.BaseHenchmenEntity;
import com.kelco.kamenridercraft.Entities.footSoldiers.YummyEntity;
import com.kelco.kamenridercraft.Items.Modded_item_core;
import com.kelco.kamenridercraft.Items.OOO_Rider_Items;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.AgeableMob;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.BreedGoal;
import net.minecraft.world.entity.ai.goal.FloatGoal;
import net.minecraft.world.entity.ai.goal.FollowOwnerGoal;
import net.minecraft.world.entity.ai.goal.LeapAtTargetGoal;
import net.minecraft.world.entity.ai.goal.LookAtPlayerGoal;
import net.minecraft.world.entity.ai.goal.MeleeAttackGoal;
import net.minecraft.world.entity.ai.goal.PanicGoal;
import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
import net.minecraft.world.entity.ai.goal.SitWhenOrderedToGoal;
import net.minecraft.world.entity.ai.goal.WaterAvoidingRandomStrollGoal;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.ai.goal.target.OwnerHurtByTargetGoal;
import net.minecraft.world.entity.ai.goal.target.OwnerHurtTargetGoal;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.entity.animal.Wolf;
import net.minecraft.world.entity.monster.Creeper;
import net.minecraft.world.entity.monster.Enemy;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.gameevent.GameEvent;
import software.bernie.geckolib.animatable.GeoEntity;
import software.bernie.geckolib.core.animatable.GeoAnimatable;
import software.bernie.geckolib.core.animatable.instance.AnimatableInstanceCache;
import software.bernie.geckolib.core.animatable.instance.SingletonAnimatableInstanceCache;
import software.bernie.geckolib.core.animation.*;
import software.bernie.geckolib.core.object.PlayState;

public class AnkhEntity extends Wolf implements GeoEntity {
	
	private AnimatableInstanceCache cache = new SingletonAnimatableInstanceCache(this);

	
	public AnkhEntity(EntityType<? extends Wolf> entityType, Level level) {
		super(entityType, level);
		
		}

	public static AttributeSupplier setAttributes() {
		return Mob.createMobAttributes().add(Attributes.MOVEMENT_SPEED, (double)0.3F).add(Attributes.MAX_HEALTH, 40.0D).add(Attributes.ATTACK_DAMAGE, 2.0D).build();
	}


	protected void registerGoals() {
		this.goalSelector.addGoal(1, new FloatGoal(this));
		this.goalSelector.addGoal(1, new PanicGoal(this, 1.4D));
		this.goalSelector.addGoal(2, new SitWhenOrderedToGoal(this));
		this.goalSelector.addGoal(4, new LeapAtTargetGoal(this, 0.4F));
		this.goalSelector.addGoal(5, new MeleeAttackGoal(this, 1.0D, true));
		this.goalSelector.addGoal(6, new FollowOwnerGoal(this, 1.0D, 10.0F, 2.0F, false));
		this.goalSelector.addGoal(7, new BreedGoal(this, 1.0D));
		this.goalSelector.addGoal(8, new WaterAvoidingRandomStrollGoal(this, 1.0D));
		this.goalSelector.addGoal(10, new LookAtPlayerGoal(this, Player.class, 8.0F));
		this.goalSelector.addGoal(10, new RandomLookAroundGoal(this));
		this.targetSelector.addGoal(1, new OwnerHurtByTargetGoal(this));
		this.targetSelector.addGoal(2, new OwnerHurtTargetGoal(this));
		this.targetSelector.addGoal(3, new NearestAttackableTargetGoal<>(this, Mob.class, 5, false, false, (p_28879_) -> {
			if (isTame()) {
				return p_28879_ instanceof Enemy && !(p_28879_ instanceof Creeper)&& !(p_28879_ instanceof AnkhCompleteEntity);
			}else return false;
		}));
		this.targetSelector.addGoal(7, new NearestAttackableTargetGoal<>(this, YummyEntity.class, false));

	}

	@Override
	public void registerControllers(AnimatableManager.ControllerRegistrar controllerRegistrar) {
		controllerRegistrar.add(new AnimationController<>(this, "controller", 0, this::predicate));
	}

	private <T extends GeoAnimatable> PlayState predicate(AnimationState<T> tAnimationState) {
		if(tAnimationState.isMoving()) {
			tAnimationState.getController().setAnimation(RawAnimation.begin().then("animation.ankh.walk", Animation.LoopType.LOOP));
			return PlayState.CONTINUE;
		}else if(this.isInSittingPose()) {
			tAnimationState.getController().setAnimation(RawAnimation.begin().then("animation.ankh.sit", Animation.LoopType.LOOP));
			return PlayState.CONTINUE;
		}

		tAnimationState.getController().setAnimation(RawAnimation.begin().then("animation.ankh.idle", Animation.LoopType.LOOP));
		return PlayState.CONTINUE;
	}

	@Override
	public AnimatableInstanceCache getAnimatableInstanceCache() {
		return cache;
	}

	public InteractionResult mobInteract(Player p_30412_, InteractionHand p_30413_) {
	      ItemStack itemstack = p_30412_.getItemInHand(p_30413_);
	      Item item = itemstack.getItem();
	      if (this.level().isClientSide) {
	         boolean flag = this.isOwnedBy(p_30412_) || this.isTame() || itemstack.is(OOO_Rider_Items.GREEED_BLET_ANKH_LOST.get())|| itemstack.is(Modded_item_core.ICE_POP.get()) && !this.isTame()
	        		 || itemstack.is(Modded_item_core.ICE_POP2.get()) && !this.isTame()|| itemstack.is(Modded_item_core.ICE_POP3.get()) && !this.isTame()&& !this.isAngry();
	         return flag ? InteractionResult.CONSUME : InteractionResult.PASS;
	      } else if (this.isTame()) {
	         if (this.isFood(itemstack) && this.getHealth() < this.getMaxHealth()) {
	            this.heal((float)itemstack.getFoodProperties(this).getNutrition());
	            if (!p_30412_.getAbilities().instabuild) {
	               itemstack.shrink(1);
	            }

	            this.gameEvent(GameEvent.EAT, this);
	            return InteractionResult.SUCCESS;
	         } else {
	            if (item == OOO_Rider_Items.GREEED_BLET_ANKH_LOST.get()) {
	            	
	            	//p_30412_.sendSystemMessage(Component.translatable("TEST NOT FINISHED").withStyle(ChatFormatting.YELLOW));
	            	BaseHenchmenEntity boss = MobsCore.ANKHCOMPLETE.get().create(this.level());
	    			if (boss != null) {
	    				boss.moveTo(this.getX(), this.getY(), this.getZ(), this.getYRot(), this.getXRot());
	    				this.level().addFreshEntity(boss);
	    			}
	            	this.discard();
	                   }

	            InteractionResult interactionresult = super.mobInteract(p_30412_, p_30413_);
	            if ((!interactionresult.consumesAction() || this.isBaby()) && this.isOwnedBy(p_30412_)) {
	               this.setOrderedToSit(!this.isOrderedToSit());
	               this.jumping = false;
	               this.navigation.stop();
	               this.setTarget((LivingEntity)null);
	               return InteractionResult.SUCCESS;
	            } else {
	               return interactionresult;
	            }
	         }
	      } else if (itemstack.is(Modded_item_core.ICE_POP.get()) && !this.isAngry()
	    		  ||itemstack.is(Modded_item_core.ICE_POP2.get()) && !this.isAngry()
	    		  ||itemstack.is(Modded_item_core.ICE_POP3.get()) && !this.isAngry()) {
	         if (!p_30412_.getAbilities().instabuild) {
	            itemstack.shrink(1);
	         }

	         if (this.random.nextInt(3) == 0 && !net.minecraftforge.event.ForgeEventFactory.onAnimalTame(this, p_30412_)) {
	            this.tame(p_30412_);
	            this.navigation.stop();
	            this.setTarget((LivingEntity)null);
	            this.setOrderedToSit(true);
	            this.level().broadcastEntityEvent(this, (byte)7);
	         } else {
	            this.level().broadcastEntityEvent(this, (byte)6);
	         }

	         return InteractionResult.SUCCESS;
	      } else {
	         return super.mobInteract(p_30412_, p_30413_);
	      }
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

	   public boolean isBaby() {
		      return false;
		   }
	   
	public boolean canMate(Animal p_30392_) {
	            return false;
	   }

	   @Nullable
	   public Wolf getBreedOffspring(ServerLevel p_149088_, AgeableMob p_149089_) {
	
	      return null;
	   }

	   public boolean isFood(ItemStack p_30440_) {
		      Item item = p_30440_.getItem();

		    	  
		      
		      return item ==Modded_item_core.ICE_POP.get()||item ==Modded_item_core.ICE_POP2.get()||item ==Modded_item_core.ICE_POP3.get();
		   }

}
