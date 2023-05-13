package Kamen_Rider_Craft_4TH.mobs.Boss;


import java.util.Calendar;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.UUID;

import javax.annotation.Nullable;

import com.google.common.collect.Sets;

import Kamen_Rider_Craft_4TH.ReiwaRiderItems;
import Kamen_Rider_Craft_4TH.item.zero_one.item_zero_onedriver;
import Kamen_Rider_Craft_4TH.item.zi_o.item_zikudriver;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.IEntityLivingData;
import net.minecraft.entity.IRangedAttackMob;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackMelee;
import net.minecraft.entity.ai.EntityAIAttackRangedBow;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.ai.EntityAIBreakDoor;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMoveThroughVillage;
import net.minecraft.entity.ai.EntityAIMoveTowardsRestriction;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWanderAvoidWater;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.ai.EntityAIZombieAttack;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.ai.attributes.IAttributeInstance;
import net.minecraft.entity.ai.attributes.RangedAttribute;
import net.minecraft.entity.monster.AbstractSkeleton;
import net.minecraft.entity.monster.EntityBlaze;
import net.minecraft.entity.monster.EntityEnderman;
import net.minecraft.entity.monster.EntityEndermite;
import net.minecraft.entity.monster.EntityIronGolem;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.monster.EntityPigZombie;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.entity.projectile.EntitySmallFireball;
import net.minecraft.entity.projectile.EntityWitherSkull;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArrow;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.pathfinding.PathNavigateGround;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EntityDamageSource;
import net.minecraft.util.EntityDamageSourceIndirect;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.EnumDifficulty;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class Entity_Arc_zero extends EntityBossBase
//implements IBossDisplayData
{


	private String texture;
	public Entity_Arc_zero(World par1World)
	{
		super(par1World);
		this.setItemStackToSlot(EntityEquipmentSlot.CHEST,new ItemStack(ReiwaRiderItems.zero_onetroso));
		this.setItemStackToSlot(EntityEquipmentSlot.HEAD,new ItemStack(ReiwaRiderItems.zero_onehead));
		this.setItemStackToSlot(EntityEquipmentSlot.FEET,new ItemStack(ReiwaRiderItems.ark_driver_zero));
		this.setItemStackToSlot(EntityEquipmentSlot.LEGS,new ItemStack(ReiwaRiderItems.zero_onelegs));


	}

	protected void applyEntityAttributes()
	{
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(200.0D);
		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.30000001192092896D);
		this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(10.0D);
		this.getEntityAttribute(SharedMonsterAttributes.FOLLOW_RANGE).setBaseValue(128.0D);
	}


	protected void initEntityAI()
	{
		this.tasks.addTask(0, new EntityAISwimming(this));
		this.tasks.addTask(4, new Entity_Arc_zero.AIFireballAttack(this));
		this.tasks.addTask(5, new EntityAIMoveTowardsRestriction(this, 1.0D));
		this.tasks.addTask(7, new EntityAIWanderAvoidWater(this, 1.0D, 0.0F));
		this.tasks.addTask(8, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
		this.tasks.addTask(8, new EntityAILookIdle(this));
		this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, true, new Class[0]));
		this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityPlayer.class, true));
	}

    /**
     * Sets or removes EntityAIBreakDoor task
     */
    public void setBreakDoorsAItask(boolean enabled)
    {
       
    }
	public void onEntityUpdate(){
		super.onEntityUpdate();

		if (this.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem()==ReiwaRiderItems.ark_driver_zero){
			if (this.getHealth()<100&item_zero_onedriver.get_core(this.getItemStackFromSlot(EntityEquipmentSlot.FEET), "1")!=6) {
				if (this.getAttackTarget()instanceof EntityPlayer){
					EntityPlayer playerIn=	(EntityPlayer) this.getAttackTarget();
					playerIn.sendMessage( new TextComponentString(TextFormatting.DARK_RED+"Singurize!"));

					this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.5);
					this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(15.0D);
					this.getEntityAttribute(SharedMonsterAttributes.FOLLOW_RANGE).setBaseValue(128.0D);
				}
				this.world.spawnParticle(EnumParticleTypes.SMOKE_LARGE, this.posX + (this.rand.nextDouble() - 0.5D) * (double)this.width, this.posY + this.rand.nextDouble() * (double)this.height, this.posZ + (this.rand.nextDouble() +2) * (double)this.width, 0.0D, 0.0D, 0.0D);
				this.world.spawnParticle(EnumParticleTypes.SMOKE_LARGE, this.posX + (this.rand.nextDouble() - 0.5D) * (double)this.width, this.posY + this.rand.nextDouble() * (double)this.height, this.posZ + (this.rand.nextDouble() +2) * (double)this.width, 0.0D, 0.0D, 0.0D);

				item_zero_onedriver.set_core(this.getItemStackFromSlot(EntityEquipmentSlot.FEET),6, "1");			
			}


			switch (this.rand.nextInt(200))
			{
			case 0:
				this.setItemStackToSlot(EntityEquipmentSlot.MAINHAND,new ItemStack(ReiwaRiderItems.attache_shotgun));
				break;
			case 1:
				this.setItemStackToSlot(EntityEquipmentSlot.MAINHAND,new ItemStack(ReiwaRiderItems.shot_riser_gun));
				break;
			case 2:
				this.setItemStackToSlot(EntityEquipmentSlot.MAINHAND,new ItemStack(ReiwaRiderItems.thousand_jacker));
				break;

			case 3|4|5|6|7:
				this.setItemStackToSlot(EntityEquipmentSlot.MAINHAND,new ItemStack(ReiwaRiderItems.attache_arrow));
				break;
			}
		}
	}



	public EnumCreatureAttribute getCreatureAttribute()
	{
		return EnumCreatureAttribute.UNDEAD;
	}

	protected boolean shouldBurnInDay()
	{
		return false;
	}
	public void onDeath(DamageSource cause)
	{
		if (!this.world.isRemote){

			this.dropItem(ReiwaRiderItems.ark_driver_zero, 1);
			this.dropItem(ReiwaRiderItems.ark_one_progrise_key, 1);
			this.dropItem(ReiwaRiderItems.blank_progrise_key, 10);
			this.dropItem(ReiwaRiderItems.hiden_metal, 20);
			this.dropItem(ReiwaRiderItems.ark_scorpion_progrise_key, 1);
			this.dropItem(ReiwaRiderItems.ark_zero_one_progrise_key, 1);
		}

	}


	static class AIFireballAttack extends EntityAIBase
	{
		private final Entity_Arc_zero blaze;
		private int attackStep;
		private int attackTime;

		public AIFireballAttack(Entity_Arc_zero blazeIn)
		{
			this.blaze = blazeIn;
			this.setMutexBits(3);
		}

		/**
		 * Returns whether the EntityAIBase should begin execution.
		 */
		public boolean shouldExecute()
		{       
			EntityLivingBase entitylivingbase = this.blaze.getAttackTarget();
			return entitylivingbase != null && entitylivingbase.isEntityAlive();
		}



		/**
		 * Execute a one shot task or start executing a continuous task
		 */
		public void startExecuting()
		{
			this.attackStep = 0;
		}


		/**
		 * Keep ticking a continuous task that has already been started
		 */
		public void updateTask()
		{
			--this.attackTime;
			EntityLivingBase entitylivingbase = this.blaze.getAttackTarget();
			double d0 = this.blaze.getDistanceSq(entitylivingbase);
			ItemStack itemstack = blaze.getHeldItemMainhand();
			
			if (d0 < 10.0D)
			{
				if (this.attackTime <= 0)
				{
					this.attackTime = 20;
					this.blaze.attackEntityAsMob(entitylivingbase);
				}

				this.blaze.getMoveHelper().setMoveTo(entitylivingbase.posX, entitylivingbase.posY, entitylivingbase.posZ, 1.0D);
			}
			
			else if (itemstack.getItem() == ReiwaRiderItems.attache_arrow||itemstack.getItem() == ReiwaRiderItems.attache_shotgun||itemstack.getItem() == ReiwaRiderItems.shot_riser_gun)
			{ if (d0 < this.getFollowDistance() * this.getFollowDistance()) 
			{
				double d1 = entitylivingbase.posX - this.blaze.posX;
				double d2 = entitylivingbase.getEntityBoundingBox().minY + (double)(entitylivingbase.height / 2.0F) - (this.blaze.posY + (double)(this.blaze.height / 2.0F));
				double d3 = entitylivingbase.posZ - this.blaze.posZ;

				if (this.attackTime <= 0)
				{
					++this.attackStep;

					if (this.attackStep == 1)
					{
						this.attackTime = 60;
					}
					else if (this.attackStep <= 4)
					{
						this.attackTime = 6;
					}
					else
					{
						this.attackTime = 100;
						this.attackStep = 0;
					}

					if (this.attackStep > 1)
					{
						float f = MathHelper.sqrt(MathHelper.sqrt(d0)) * 0.5F;
						this.blaze.world.playEvent((EntityPlayer)null, 1018, new BlockPos((int)this.blaze.posX, (int)this.blaze.posY, (int)this.blaze.posZ), 0);

						for (int i = 0; i < 1; ++i)
						{
							EntityWitherSkull entitysmallfireball = new EntityWitherSkull(this.blaze.world, this.blaze, d1 + this.blaze.getRNG().nextGaussian() * (double)f, d2, d3 + this.blaze.getRNG().nextGaussian() * (double)f);
							entitysmallfireball.posY = this.blaze.posY + (double)(this.blaze.height / 2.0F) + 0.5D;
							this.blaze.world.spawnEntity(entitysmallfireball);
						}
					}
				
				}
			}
			this.blaze.getLookHelper().setLookPositionWithEntity(entitylivingbase, 10.0F, 10.0F);
			}
			else
			{
				this.blaze.getNavigator().clearPath();
				this.blaze.getMoveHelper().setMoveTo(entitylivingbase.posX, entitylivingbase.posY, entitylivingbase.posZ, 1.0D);
			}

			super.updateTask();
		}

		private double getFollowDistance()
		{
			IAttributeInstance iattributeinstance = this.blaze.getEntityAttribute(SharedMonsterAttributes.FOLLOW_RANGE);
			return iattributeinstance == null ? 40.0D : iattributeinstance.getAttributeValue();
		}
	}
}
