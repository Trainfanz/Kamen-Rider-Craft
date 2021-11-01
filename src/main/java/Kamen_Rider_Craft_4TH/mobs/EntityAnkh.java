package Kamen_Rider_Craft_4TH.mobs;

import com.google.common.base.Predicate;

import Kamen_Rider_Craft_4TH.RiderItems;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_ankh_complete;
import Kamen_Rider_Craft_4TH.mobs.bikes.EntityRidevendor;

import java.util.UUID;
import javax.annotation.Nullable;
import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackMelee;
import net.minecraft.entity.ai.EntityAIAvoidEntity;
import net.minecraft.entity.ai.EntityAIBeg;
import net.minecraft.entity.ai.EntityAIFollowOwner;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILeapAtTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMate;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAIOwnerHurtByTarget;
import net.minecraft.entity.ai.EntityAIOwnerHurtTarget;
import net.minecraft.entity.ai.EntityAISit;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAITargetNonTamed;
import net.minecraft.entity.ai.EntityAIWanderAvoidWater;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.AbstractSkeleton;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.entity.monster.EntityGhast;
import net.minecraft.entity.passive.AbstractHorse;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.passive.EntityLlama;
import net.minecraft.entity.passive.EntityRabbit;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.entity.passive.EntityTameable;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.init.Items;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumHand;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.datafix.DataFixer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;
import net.minecraft.world.storage.loot.LootTableList;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class EntityAnkh extends EntityTameable
{
	private static final DataParameter<Float> DATA_HEALTH_ID = EntityDataManager.<Float>createKey(EntityAnkh.class, DataSerializers.FLOAT);

	public EntityAnkh(World worldIn)
	{
		super(worldIn);
		this.setSize(0.7F, 1.5F);
		this.setTamed(false);
	}

	/**
	 * Returns true if the newer Entity AI code should be run
	 */
	public boolean isAIEnabled()
	{
		return true;
	}




	protected boolean shouldBurnInDay()
	{
		return false;
	}
	public void onDeath(DamageSource cause)
	{
		if (!this.world.isRemote){

			this.dropItem(RiderItems.cellmedal, 5);
			switch (this.rand.nextInt(5))
			{   		   	    		
			case 0:
				this.dropItem(RiderItems.taka_ankh, 1);
				break;
			}
		}
	}

	protected void initEntityAI()
	{
		this.aiSit = new EntityAISit(this);
		this.tasks.addTask(1, new EntityAISwimming(this));
		this.tasks.addTask(2, this.aiSit);
		this.tasks.addTask(3, new EntityAnkh.AIAvoidEntity(this, EntityLlama.class, 24.0F, 1.5D, 1.5D));
		this.tasks.addTask(4, new EntityAILeapAtTarget(this, 0.4F));
		this.tasks.addTask(5, new EntityAIAttackMelee(this, 1.0D, true));
		this.tasks.addTask(6, new EntityAIFollowOwner(this, 1.0D, 10.0F, 2.0F));
		this.tasks.addTask(7, new EntityAIMate(this, 1.0D));
		this.tasks.addTask(8, new EntityAIWanderAvoidWater(this, 1.0D));
		this.tasks.addTask(9, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
		this.tasks.addTask(9, new EntityAILookIdle(this));
		this.targetTasks.addTask(1, new EntityAIOwnerHurtByTarget(this));
		this.targetTasks.addTask(2, new EntityAIOwnerHurtTarget(this));
		this.targetTasks.addTask(3, new EntityAIHurtByTarget(this, true, new Class[0]));
		this.targetTasks.addTask(4, new EntityAINearestAttackableTarget(this, AbstractSkeleton.class, false));
	}

	protected void applyEntityAttributes()
	{
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.30000001192092896D);

		if (this.isTamed())
		{
			this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(80.0D);
		}
		else
		{
			this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(20.0D);
		}

		this.getAttributeMap().registerAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(4.0D);
	}

	/**
	 * Sets the active target the Task system uses for tracking
	 */
	public void setAttackTarget(@Nullable EntityLivingBase entitylivingbaseIn)
	{
		super.setAttackTarget(entitylivingbaseIn);

		if (entitylivingbaseIn == null)
		{
			this.setAngry(false);
		}
		else if (!this.isTamed())
		{
			this.setAngry(true);
		}
	}

	protected void updateAITasks()
	{
		this.dataManager.set(DATA_HEALTH_ID, Float.valueOf(this.getHealth()));
	}

	protected void entityInit()
	{
		super.entityInit();
		this.dataManager.register(DATA_HEALTH_ID, Float.valueOf(this.getHealth()));
	}

	protected void playStepSound(BlockPos pos, Block blockIn)
	{
		this.playSound(SoundEvents.ENTITY_WOLF_STEP, 0.15F, 1.0F);
	}

	public static void registerFixesWolf(DataFixer fixer)
	{
		EntityLiving.registerFixesMob(fixer, EntityAnkh.class);
	}

	/**
	 * (abstract) Protected helper method to write subclass entity data to NBT.
	 */
	public void writeEntityToNBT(NBTTagCompound compound)
	{
		super.writeEntityToNBT(compound);
		compound.setBoolean("Angry", this.isAngry());
	}

	/**
	 * (abstract) Protected helper method to read subclass entity data from NBT.
	 */
	public void readEntityFromNBT(NBTTagCompound compound)
	{
		super.readEntityFromNBT(compound);
		this.setAngry(compound.getBoolean("Angry"));
	}

	protected SoundEvent getAmbientSound()
	{
		if (this.isAngry())
		{
			return SoundEvents.ENTITY_WOLF_GROWL;
		}
		else if (this.rand.nextInt(3) == 0)
		{
			return this.isTamed() && ((Float)this.dataManager.get(DATA_HEALTH_ID)).floatValue() < 10.0F ? SoundEvents.ENTITY_WOLF_WHINE : SoundEvents.ENTITY_WOLF_PANT;
		}
		else
		{
			return SoundEvents.ENTITY_WOLF_AMBIENT;
		}
	}

	protected SoundEvent getHurtSound(DamageSource damageSourceIn)
	{
		return SoundEvents.ENTITY_WOLF_HURT;
	}

	protected SoundEvent getDeathSound()
	{
		return SoundEvents.ENTITY_WOLF_DEATH;
	}

	/**
	 * Returns the volume for the sounds this mob makes.
	 */
	protected float getSoundVolume()
	{
		return 0.4F;
	}

	@Nullable
	protected ResourceLocation getLootTable()
	{
		return LootTableList.ENTITIES_WOLF;
	}

	/**
	 * Called frequently so the entity can update its state every tick as required. For example, zombies and skeletons
	 * use this to react to sunlight and start to burn.
	 */
	public void onLivingUpdate()
	{
		super.onLivingUpdate();

		if (!this.world.isRemote && !this.hasPath() && this.onGround)
		{
			this.world.setEntityState(this, (byte)8);
		}

		if (!this.world.isRemote && this.getAttackTarget() == null && this.isAngry())
		{
			this.setAngry(false);
		}
	}

	/**
	 * Called to update the entity's position/logic.
	 */
	public void onUpdate()
	{
		super.onUpdate();

	}


	public float getEyeHeight()
	{
		return this.height * 0.8F;
	}

	/**
	 * The speed it takes to move the entityliving's rotationPitch through the faceEntity method. This is only currently
	 * use in wolves.
	 */
	public int getVerticalFaceSpeed()
	{
		return this.isSitting() ? 20 : super.getVerticalFaceSpeed();
	}

	/**
	 * Called when the entity is attacked.
	 */
	public boolean attackEntityFrom(DamageSource source, float amount)
	{
		if (this.isEntityInvulnerable(source))
		{
			return false;
		}
		else
		{
			Entity entity = source.getTrueSource();

			if (this.aiSit != null)
			{
				this.aiSit.setSitting(false);
			}

			if (entity != null && !(entity instanceof EntityPlayer) && !(entity instanceof EntityArrow))
			{
				amount = (amount + 1.0F) / 2.0F;
			}

			return super.attackEntityFrom(source, amount);
		}
	}

	public boolean attackEntityAsMob(Entity entityIn)
	{
		boolean flag = entityIn.attackEntityFrom(DamageSource.causeMobDamage(this), (float)((int)this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).getAttributeValue()));

		if (flag)
		{
			this.applyEnchantments(this, entityIn);
		}

		return flag;
	}

	public void setTamed(boolean tamed)
	{
		super.setTamed(tamed);

		if (tamed)
		{
			this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(20.0D);
		}
		else
		{
			this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(8.0D);
		}

		this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(4.0D);
	}

	public boolean processInteract(EntityPlayer player, EnumHand hand)
	{
		ItemStack itemstack = player.getHeldItem(hand);

		if (this.isTamed())
		{
			if (!itemstack.isEmpty())
			{
				if (itemstack.getItem() instanceof ItemFood)
				{
					ItemFood itemfood = (ItemFood)itemstack.getItem();

					if (itemfood.isWolfsFavoriteMeat() && ((Float)this.dataManager.get(DATA_HEALTH_ID)).floatValue() < 20.0F)
					{
						if (!player.capabilities.isCreativeMode)
						{
							itemstack.shrink(1);
						}

						this.heal((float)itemfood.getHealAmount(itemstack));
						return true;
					}
				}
			}

			if (this.isOwner(player) && !this.world.isRemote && !this.isBreedingItem(itemstack))
			{
				this.aiSit.setSitting(!this.isSitting());
				this.isJumping = false;
				this.navigator.clearPath();
				this.setAttackTarget((EntityLivingBase)null);
			}
		}
		else if (itemstack.getItem() == RiderItems.greeed_blet_ankh_lost && !this.isAngry())
		{
			if (!this.world.isRemote && !this.isDead)
			{
				Entity_ankh_complete entity = new Entity_ankh_complete(this.world);
				entity.setLocationAndAngles(this.posX, this.posY, this.posZ, this.rotationYaw, this.rotationPitch);

				if (this.hasCustomName())
				{
					entity.setCustomNameTag(this.getCustomNameTag());
					entity.setAlwaysRenderNameTag(this.getAlwaysRenderNameTag());
				}
				this.setDead();
				this.world.spawnEntity(entity);
				return true;
			}
		}
		else if (itemstack.getItem() == RiderItems.icepop1 && !this.isAngry()||itemstack.getItem() == RiderItems.icepop2 && !this.isAngry()||itemstack.getItem() == RiderItems.icepop3 && !this.isAngry())
		{
			if (!player.capabilities.isCreativeMode)
			{
				itemstack.shrink(1);
			}

			if (!this.world.isRemote)
			{
				if (this.rand.nextInt(3) == 0 && !net.minecraftforge.event.ForgeEventFactory.onAnimalTame(this, player))
				{
					this.setTamedBy(player);
					this.navigator.clearPath();
					this.setAttackTarget((EntityLivingBase)null);
					this.aiSit.setSitting(true);
					this.setHealth(20.0F);
					this.playTameEffect(true);
					this.world.setEntityState(this, (byte)7);
				}
				else
				{
					this.playTameEffect(false);
					this.world.setEntityState(this, (byte)6);
				}
			}

			return true;
		}

		return super.processInteract(player, hand);
	}

	/**
	 * Handler for {@link World#setEntityState}
	 */
	@SideOnly(Side.CLIENT)
	public void handleStatusUpdate(byte id)
	{
		if (id == 8)
		{

		}
		else
		{
			super.handleStatusUpdate(id);
		}
	}

	@SideOnly(Side.CLIENT)
	public float getTailRotation()
	{
		if (this.isAngry())
		{
			return 1.5393804F;
		}
		else
		{
			return this.isTamed() ? (0.55F - (this.getMaxHealth() - ((Float)this.dataManager.get(DATA_HEALTH_ID)).floatValue()) * 0.02F) * (float)Math.PI : ((float)Math.PI / 5F);
		}
	}

	/**
	 * Checks if the parameter is an item which this animal can be fed to breed it (wheat, carrots or seeds depending on
	 * the animal type)
	 */
	public boolean isBreedingItem(ItemStack stack)
	{
		return stack.getItem() instanceof ItemFood && ((ItemFood)stack.getItem()).isWolfsFavoriteMeat();
	}

	/**
	 * Will return how many at most can spawn in a chunk at once.
	 */
	public int getMaxSpawnedInChunk()
	{
		return 8;
	}

	/**
	 * Determines whether this wolf is angry or not.
	 */
	public boolean isAngry()
	{
		return (((Byte)this.dataManager.get(TAMED)).byteValue() & 2) != 0;
	}

	/**
	 * Sets whether this wolf is angry or not.
	 */
	public void setAngry(boolean angry)
	{
		byte b0 = ((Byte)this.dataManager.get(TAMED)).byteValue();

		if (angry)
		{
			this.dataManager.set(TAMED, Byte.valueOf((byte)(b0 | 2)));
		}
		else
		{
			this.dataManager.set(TAMED, Byte.valueOf((byte)(b0 & -3)));
		}
	}


	public EntityAnkh createChild(EntityAgeable ageable)
	{
		EntityAnkh entitywolf = new EntityAnkh(this.world);
		UUID uuid = this.getOwnerId();

		if (uuid != null)
		{
			entitywolf.setOwnerId(uuid);
			entitywolf.setTamed(true);
		}

		return entitywolf;
	}



	/**
	 * Returns true if the mob is currently able to mate with the specified mob.
	 */
	public boolean canMateWith(EntityAnimal otherAnimal)
	{
		if (otherAnimal == this)
		{
			return false;
		}
		else if (!this.isTamed())
		{
			return false;
		}
		else if (!(otherAnimal instanceof EntityAnkh))
		{
			return false;
		}
		else
		{
			EntityAnkh entitywolf = (EntityAnkh)otherAnimal;

			if (!entitywolf.isTamed())
			{
				return false;
			}
			else if (entitywolf.isSitting())
			{
				return false;
			}
			else
			{
				return this.isInLove() && entitywolf.isInLove();
			}
		}
	}



	public boolean shouldAttackEntity(EntityLivingBase target, EntityLivingBase owner)
	{
		if (!(target instanceof EntityCreeper) && !(target instanceof EntityGhast))
		{
			if (target instanceof EntityAnkh)
			{
				EntityAnkh entitywolf = (EntityAnkh)target;

				if (entitywolf.isTamed() && entitywolf.getOwner() == owner)
				{
					return false;
				}
			}

			if (target instanceof EntityPlayer && owner instanceof EntityPlayer && !((EntityPlayer)owner).canAttackPlayer((EntityPlayer)target))
			{
				return false;
			}
			else
			{
				return !(target instanceof AbstractHorse) || !((AbstractHorse)target).isTame();
			}
		}
		else
		{
			return false;
		}
	}

	public boolean canBeLeashedTo(EntityPlayer player)
	{
		return !this.isAngry() && super.canBeLeashedTo(player);
	}

	class AIAvoidEntity<T extends Entity> extends EntityAIAvoidEntity<T>
	{
		private final EntityAnkh wolf;

		public AIAvoidEntity(EntityAnkh wolfIn, Class<T> p_i47251_3_, float p_i47251_4_, double p_i47251_5_, double p_i47251_7_)
		{
			super(wolfIn, p_i47251_3_, p_i47251_4_, p_i47251_5_, p_i47251_7_);
			this.wolf = wolfIn;
		}

		/**
		 * Returns whether the EntityAIBase should begin execution.
		 */
		public boolean shouldExecute()
		{
			if (super.shouldExecute() && this.closestLivingEntity instanceof EntityLlama)
			{
				return !this.wolf.isTamed() && this.avoidLlama((EntityLlama)this.closestLivingEntity);
			}
			else
			{
				return false;
			}
		}

		private boolean avoidLlama(EntityLlama p_190854_1_)
		{
			return p_190854_1_.getStrength() >= EntityAnkh.this.rand.nextInt(5);
		}

		/**
		 * Execute a one shot task or start executing a continuous task
		 */
		public void startExecuting()
		{
			EntityAnkh.this.setAttackTarget((EntityLivingBase)null);
			super.startExecuting();
		}

		/**
		 * Keep ticking a continuous task that has already been started
		 */
		public void updateTask()
		{
			EntityAnkh.this.setAttackTarget((EntityLivingBase)null);
			super.updateTask();
		}
	}
}