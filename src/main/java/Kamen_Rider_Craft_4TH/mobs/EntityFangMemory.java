package Kamen_Rider_Craft_4TH.mobs;

import javax.annotation.Nullable;

import com.google.common.base.Predicate;

import Kamen_Rider_Craft_4TH.RiderItems;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackMelee;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMoveThroughVillage;
import net.minecraft.entity.ai.EntityAIMoveTowardsRestriction;
import net.minecraft.entity.ai.EntityAIMoveTowardsTarget;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAIWanderAvoidWater;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.entity.monster.EntityGolem;
import net.minecraft.entity.monster.IMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class EntityFangMemory extends EntityGolem {
	private int attackTimer;

	public EntityFangMemory(World worldIn) {
		super(worldIn);
		this.setSize(2F, 0.7F);
		this.tasks.addTask(1, new EntityAIAttackMelee(this, 1.0D, true));
		this.tasks.addTask(2, new EntityAIMoveTowardsTarget(this, 0.9D, 32.0F));
		this.tasks.addTask(3, new EntityAIMoveThroughVillage(this, 0.6D, true));
		this.tasks.addTask(4, new EntityAIMoveTowardsRestriction(this, 1.0D));
		this.tasks.addTask(5, new EntityAIWanderAvoidWater(this, 0.6D));
		this.tasks.addTask(6, new EntityAIWatchClosest(this, EntityPlayer.class, 6.0F));
		this.tasks.addTask(7, new EntityAILookIdle(this));
		this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, false, new Class[0]));
		this.targetTasks.addTask(3, new EntityAINearestAttackableTarget(this, EntityLiving.class, 10, false, true,
				new Predicate<EntityLiving>() {
					public boolean apply(@Nullable EntityLiving p_apply_1_) {
						return p_apply_1_ != null && IMob.VISIBLE_MOB_SELECTOR.apply(p_apply_1_)
								&& !(p_apply_1_ instanceof EntityCreeper);
					}
				}));
	}
	
	/**
	 * Returns true if the newer Entity AI code should be run
	 */
	public boolean isAIEnabled() {
		return true;
	}

	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(10.0D);
		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.4D);

	}

	/**
	 * Called frequently so the entity can update its state every tick as required.
	 * For example, zombies and skeletons use this to react to sunlight and start to
	 * burn.
	 */
	public void onLivingUpdate() {
		super.onLivingUpdate();

		if (this.attackTimer > 0) {
			--this.attackTimer;
		}
	}

	public boolean attackEntityAsMob(Entity entityIn) {
		this.attackTimer = 10;
		this.world.setEntityState(this, (byte) 4);
		boolean flag = entityIn.attackEntityFrom(DamageSource.causeMobDamage(this),
				(float) (7 + this.rand.nextInt(15)));

		if (flag) {
			entityIn.motionY += 0.4000000059604645D;
			this.applyEnchantments(this, entityIn);
		}

		this.playSound(SoundEvents.ENTITY_IRONGOLEM_ATTACK, 1.0F, 1.0F);
		return flag;
	}

	@SideOnly(Side.CLIENT)
	public int getAttackTimer() {
		return this.attackTimer;
	}

	protected boolean shouldBurnInDay() {
		return false;
	}
	
	public boolean processInteract(EntityPlayer player, EnumHand hand)
	{
		
       
        //else
        //{
		world.removeEntity(this);
		this.dropItem(RiderItems.fang_memory, 1);
		//world.spawnEntity(new entityitem)
        return super.processInteract(player, hand);
        //}
    }
	
	public void onDeath(DamageSource cause) {
		if (!this.world.isRemote) {
			this.dropItem(RiderItems.fang_memory, 1);
		}
	}

	protected void collideWithEntity(Entity entityIn) {
		if (entityIn instanceof IMob && !(entityIn instanceof EntityCreeper) && this.getRNG().nextInt(20) == 0) {
			this.setAttackTarget((EntityLivingBase) entityIn);
		}

		super.collideWithEntity(entityIn);
	}

}
