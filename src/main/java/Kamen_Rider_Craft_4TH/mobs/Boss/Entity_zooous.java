package Kamen_Rider_Craft_4TH.mobs.Boss;


import java.util.Calendar;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.UUID;

import com.google.common.base.Predicates;
import com.google.common.collect.Sets;

import Kamen_Rider_Craft_4TH.RiderItems;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.ai.EntityAIBreakDoor;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMoveThroughVillage;
import net.minecraft.entity.ai.EntityAIMoveTowardsRestriction;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.ai.attributes.IAttributeInstance;
import net.minecraft.entity.ai.attributes.RangedAttribute;
import net.minecraft.entity.monster.EntityEnderman;
import net.minecraft.entity.monster.EntityEndermite;
import net.minecraft.entity.monster.EntityIronGolem;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.monster.EntityPigZombie;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.init.MobEffects;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.pathfinding.PathNavigateGround;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EntityDamageSource;
import net.minecraft.util.EntityDamageSourceIndirect;
import net.minecraft.util.EntitySelectors;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.BossInfo;
import net.minecraft.world.BossInfoServer;
import net.minecraft.world.EnumDifficulty;
import net.minecraft.world.World;

public class Entity_zooous extends EntityBossBase
{
	public Entity_zooous(World par1World)
	{
		super(par1World);

	}

	protected void applyEntityAttributes()
	{
		super.applyEntityAttributes();

		this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(10.0D);
		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(100.0D);
		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.4000000238418579D);
		this.getEntityAttribute(SharedMonsterAttributes.FOLLOW_RANGE).setBaseValue(40.0D);
		this.getEntityAttribute(SharedMonsterAttributes.ARMOR).setBaseValue(3.0D);

	}

	public void onEntityUpdate(){
		super.onEntityUpdate();
		if (this.getAttackTarget()instanceof EntityPlayer){
			EntityPlayer playerIn=	(EntityPlayer) this.getAttackTarget();
			if (this.getHealth()<50) {
			
					if (playerIn.inventory.hasItemStack(new ItemStack(RiderItems.tenkuu_no_pegasus_wonderride_book))&playerIn.inventory.hasItemStack(new ItemStack(RiderItems.peter_fantasista_wonderride_book))&playerIn.inventory.hasItemStack(new ItemStack(RiderItems.lion_senki_wonderride_book))&!playerIn.inventory.hasItemStack(new ItemStack(RiderItems.king_lion_daisenki_wonderride_book))){
						playerIn.inventory.addItemStackToInventory(new ItemStack(RiderItems.king_lion_daisenki_wonderride_book));
						playerIn.sendMessage( new TextComponentString(TextFormatting.DARK_BLUE+"King Lion Daisenki!"));
					}
					this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.3);
					this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(7.0D);
				}
			}
	}
	
	protected boolean shouldBurnInDay()
	{
		return false;
	}
	public void onDeath(DamageSource cause)
	{
		if (!this.world.isRemote){

			this.dropItem(RiderItems.blank_wonder_world_story_wonder_ride_book, 1);
			this.dropItem(RiderItems.blank_wonder_ride_book, 10);
			
			switch (this.rand.nextInt(10))
			{
			case 0:
				this.dropItem(RiderItems.great_book_fragment, 1);
				break;
			}
			
			if (this.getAttackTarget()instanceof EntityPlayer){
				EntityPlayer playerIn=	(EntityPlayer) this.getAttackTarget();
				if (playerIn.inventory.hasItemStack(new ItemStack(RiderItems.tategami_hyoujuu_senki_wonderride_book))){

					EntityBossBase entityboss  = new  Entity_zooous_predator(world);
					entityboss.setLocationAndAngles(this.posX, this.posY, this.posZ, 0, 0.0F);
					world.spawnEntity(entityboss);

				}

			}
		}
	}
} 
