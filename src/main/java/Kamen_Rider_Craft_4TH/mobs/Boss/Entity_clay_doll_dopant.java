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

public class Entity_clay_doll_dopant extends EntityBossBase
//implements IBossDisplayData
{
	public Entity_clay_doll_dopant(World par1World)
	{
		super(par1World);
		
	}
	
    protected void applyEntityAttributes()
    {
        super.applyEntityAttributes();

        this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(10.0D);
        this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(60.0D);
        this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.2000000238418579D);
        this.getEntityAttribute(SharedMonsterAttributes.FOLLOW_RANGE).setBaseValue(40.0D);
        this.getEntityAttribute(SharedMonsterAttributes.ARMOR).setBaseValue(3.0D);
        
    }

 	protected boolean shouldBurnInDay()
    {
        return false;
    }
    public void onDeath(DamageSource cause)
    {
if (!this.world.isRemote){

	switch (this.rand.nextInt(4))
	{   		   	    		
	case 0:
		if (this.getAttackTarget()instanceof EntityPlayer){
			 EntityPlayer playerIn=	(EntityPlayer) this.getAttackTarget();
			 EntityBossBase entityboss  = new Entity_clay_doll_dopant(world);
			 playerIn.sendStatusMessage(new TextComponentString(TextFormatting.YELLOW+"Claydoll!"), true);
		entityboss.setLocationAndAngles(this.posX, this.posY, this.posZ, 0, 0.0F);
		world.spawnEntity(entityboss);
		break;
		}
	case 3:
		if (this.getAttackTarget()instanceof EntityPlayer){
			 EntityPlayer playerIn=	(EntityPlayer) this.getAttackTarget();
			 EntityBossBase entityboss  = new Entity_clay_doll_dopant(world);
			 playerIn.sendStatusMessage(new TextComponentString(TextFormatting.YELLOW+"Claydoll!"), true);
		entityboss.setLocationAndAngles(this.posX, this.posY, this.posZ, 0, 0.0F);
		world.spawnEntity(entityboss);
		break;
		}
	case 2:
		if (this.getAttackTarget()instanceof EntityPlayer){
			 EntityPlayer playerIn=	(EntityPlayer) this.getAttackTarget();
			 EntityBossBase entityboss  = new Entity_clay_doll_dopant(world);
			 playerIn.sendStatusMessage(new TextComponentString(TextFormatting.YELLOW+"Claydoll!"), true);
		entityboss.setLocationAndAngles(this.posX, this.posY, this.posZ, 0, 0.0F);
		world.spawnEntity(entityboss);
		break;
		}
	case 1:
	
	this.dropItem(RiderItems.claydoll_memory, 1);
	this.dropItem(RiderItems.gaiamemory, 4);
	switch (this.rand.nextInt(3))
	{   		   	    		
	case 0:
		this.dropItem(RiderItems.unrefined_memory_g, 2);
		break;
		
	case 1:
		this.dropItem(RiderItems.unrefined_memory_s, 2);
		break;
		
	case 2:				
		break;
	}
			}
   		}
    }
} 
    