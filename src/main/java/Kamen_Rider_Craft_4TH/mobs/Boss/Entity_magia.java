package Kamen_Rider_Craft_4TH.mobs.Boss;


import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.UUID;

import javax.annotation.Nullable;

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
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.pathfinding.PathNavigateGround;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EntityDamageSource;
import net.minecraft.util.EntityDamageSourceIndirect;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.World;

public class Entity_magia extends EntityBossBase
//implements IBossDisplayData
{
    
	public static final Item[] belt = new Item[] {RiderItems.zetsumeriser_berothra,RiderItems.zetsumeriser_ekal,RiderItems.zetsumeriser_kuehne,RiderItems.zetsumeriser_berothra
			,RiderItems.zetsumeriser_neohi};
	
	private String texture;
	public Entity_magia(World par1World)
	{
		super(par1World);
		this.setItemStackToSlot(EntityEquipmentSlot.CHEST,new ItemStack(RiderItems.zero_onetroso));
		this.setItemStackToSlot(EntityEquipmentSlot.HEAD,new ItemStack(RiderItems.zero_onehead));
		Random generator = new Random();
		int rand = generator.nextInt(belt.length);
		this.setItemStackToSlot(EntityEquipmentSlot.FEET,new ItemStack(belt[rand]));
		this.setItemStackToSlot(EntityEquipmentSlot.LEGS,new ItemStack(RiderItems.zero_onelegs));
		
	}
  
    protected void applyEntityAttributes()
    {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(40.0D);
        this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.30000001192092896D);
        this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(10.0D);
        this.getEntityAttribute(SharedMonsterAttributes.FOLLOW_RANGE).setBaseValue(128.0D);
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

   		this.dropItem(RiderItems.humagear_progrise_key, 1);
   		this.dropItem(RiderItems.hiden_metal, 4);

   		switch (this.rand.nextInt(5))
		{
		case 0:
			this.dropItem(this.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem(), 1);
			break;
		}
   		
   		switch (this.rand.nextInt(25))
		{
		case 0:
			this.dropItem(RiderItems.berothamagia_zetsumerisekey, 1);
			break;
		case 1:
			this.dropItem(RiderItems.kuehnemagia_zetsumerisekey, 1);
			break;
		case 2:
			this.dropItem(RiderItems.ekalmagia_zetsumerisekey, 1);
			break;
		case 3:
			this.dropItem(RiderItems.neohimagia_zetsumerisekey, 1); 
			break;
		case 4:
			this.dropItem(RiderItems.onychomagia_zetsumerisekey, 1);
			break;
		case 5:
			this.dropItem(RiderItems.vicaryamagia_zetsumerisekey, 1);
			break;
		case 6:
			this.dropItem(RiderItems.gaerumagia_zetsumerisekey, 1); 
			break;
		case 7:
			this.dropItem(RiderItems.mammothmagia_zetsumerisekey, 1);
			break;
		case 8:
			this.dropItem(RiderItems.arsinomagia_zetsumerisekey, 1);
			break;
		}
   		
       }
       
   }


}
    