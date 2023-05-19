package com.kelco.kamenridercraft.client.models;


import net.minecraft.client.model.AnimationUtils;
import net.minecraft.client.model.PlayerModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.item.TieredItem;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class BasicMobModel<T extends Mob> extends PlayerModel<T> {
	
	  private final PartPose bodyDefault = this.body.storePose();
	   private final PartPose headDefault = this.head.storePose();
	   private final PartPose leftArmDefault = this.leftArm.storePose();
	   private final PartPose rightArmDefault = this.rightArm.storePose();

	
   public BasicMobModel(ModelPart p_171090_) {
	   super(p_171090_, false);
   }
   
   public void setupAnim(T p_103366_, float p_103367_, float p_103368_, float p_103369_, float p_103370_, float p_103371_) {
	      this.body.loadPose(this.bodyDefault);
	      this.head.loadPose(this.headDefault);
	      this.leftArm.loadPose(this.leftArmDefault);
	      this.rightArm.loadPose(this.rightArmDefault);
	      super.setupAnim(p_103366_, p_103367_, p_103368_, p_103369_, p_103370_, p_103371_);
	      
	          if (p_103366_.isAggressive() && p_103366_.getMainHandItem().getItem() instanceof TieredItem) {
	            this.holdWeaponHigh(p_103366_);
	         }

	      this.leftPants.copyFrom(this.leftLeg);
	      this.rightPants.copyFrom(this.rightLeg);
	      this.leftSleeve.copyFrom(this.leftArm);
	      this.rightSleeve.copyFrom(this.rightArm);
	      this.jacket.copyFrom(this.body);
	      this.hat.copyFrom(this.head);
	   }

	   protected void setupAttackAnimation(T p_103363_, float p_103364_) {
	      if (this.attackTime > 0.0F) {
	         AnimationUtils.swingWeaponDown(this.rightArm, this.leftArm, p_103363_, this.attackTime, p_103364_);
	      } else {
	         super.setupAttackAnimation(p_103363_, p_103364_);
	      }
	   }

	   private void holdWeaponHigh(T p_103361_) {
	      if (p_103361_.isLeftHanded()) {
	         this.leftArm.xRot = -1F;
	      } else {
	         this.rightArm.xRot = -1F;
	      }

	   }
      
}