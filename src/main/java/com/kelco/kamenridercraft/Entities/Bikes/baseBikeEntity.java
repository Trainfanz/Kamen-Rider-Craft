package com.kelco.kamenridercraft.Entities.Bikes;


import javax.annotation.Nullable;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.AgeableMob;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityDimensions;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Pose;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.Vec3;
import software.bernie.geckolib.animatable.GeoEntity;
import software.bernie.geckolib.core.animatable.instance.AnimatableInstanceCache;
import software.bernie.geckolib.core.animation.*;
import software.bernie.geckolib.util.GeckoLibUtil;


public class baseBikeEntity extends Animal implements GeoEntity {
	
	

	
	private final AnimatableInstanceCache cache = GeckoLibUtil.createInstanceCache(this);
	public String NAME ="hardboilder";
	public String NAME_MODEL ="hardboilder";
	
	public baseBikeEntity(EntityType<? extends Animal> entityType, Level level) {
		super(entityType, level);
		}


	public static AttributeSupplier setAttributes() {
		return Mob.createMobAttributes().add(Attributes.MOVEMENT_SPEED, (double)0.3F).add(Attributes.MAX_HEALTH, 40.0D).add(Attributes.ATTACK_DAMAGE, 2.0D).build();
	}

	// Let the player ride the entity
	@Override
	public InteractionResult mobInteract(Player player, InteractionHand hand) {
		if (!this.isVehicle()) {
			player.startRiding(this);

			return super.mobInteract(player, hand);
		}

		return super.mobInteract(player, hand);
	}

	// Turn off step sounds since it's a bike
	@Override
	protected void playStepSound(BlockPos pos, BlockState block) {}

	// Apply player-controlled movement
	@Override
	public void travel(Vec3 pos) {
		if (this.isAlive()) {
			if (this.isVehicle()) {
				LivingEntity passenger = (LivingEntity)getControllingPassenger();
				this.yRotO = getYRot();
				this.xRotO = getXRot();

				setYRot(passenger.getYRot());
				setXRot(passenger.getXRot() * 0.1f);
				setRot(getYRot(), getXRot());

				this.yBodyRot = this.getYRot();
				this.yHeadRot = this.yBodyRot;
				float x = passenger.xxa * 0.5F;
				float z = passenger.zza;

				if (z <= 0)
					z *= 0.25f;

				this.setSpeed(0.6f);
				super.travel(new Vec3(x, pos.y, z));
			}
		}
	}

	// Get the controlling passenger
	@Nullable
	@Override
	public LivingEntity getControllingPassenger() {
		return getFirstPassenger() instanceof LivingEntity entity ? entity : null;
	}

	@Override
	public boolean isControlledByLocalInstance() {
		return true;
	}

	// Adjust the rider's position while riding
	@Override
	public void positionRider(Entity entity, MoveFunction moveFunction) {
		if (entity instanceof LivingEntity passenger) {
			moveFunction.accept(entity, getX(), getY() + 0.3f, getZ());

			this.xRotO = passenger.xRotO;
		}
	}


	@Override
	public AgeableMob getBreedOffspring(ServerLevel world, AgeableMob entity) {
		return null;
	}

	@Override
	protected float getStandingEyeHeight(Pose pose, EntityDimensions dimensions) {
		return 0.5F;
	}
	
		@Override
		public AnimatableInstanceCache getAnimatableInstanceCache() {
			return this.cache;
		}
		
		
		// Add our generic idle animation controller
		@Override
		public void registerControllers(AnimatableManager.ControllerRegistrar controllers) {
			
			RawAnimation IDLE = RawAnimation.begin().thenLoop("animation.model.idle");
			RawAnimation WALK = RawAnimation.begin().thenLoop("animation.model.walk");
			
			controllers.add(new AnimationController<baseBikeEntity>(this, "Walk/Idle", 0, state -> state.setAndContinue(state.isMoving() ? WALK : IDLE )));
		}


}
