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
import Kamen_Rider_Craft_4TH.ShowaRiderItems;
import Kamen_Rider_Craft_4TH.miscellaneousRiderItems;
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

public class Entity_shocker_riders extends EntityBossBase
//implements IBossDisplayData
{
    
	public static final Item[] belt = new Item[] {ShowaRiderItems.typhoon_shocker_rider_1,ShowaRiderItems.typhoon_shocker_rider_2,ShowaRiderItems.typhoon_shocker_rider_3,ShowaRiderItems.typhoon_shocker_rider_4,ShowaRiderItems.typhoon_shocker_rider_5,
			ShowaRiderItems.typhoon_shocker_rider_6,ShowaRiderItems.typhoon_shocker_rider_7,ShowaRiderItems.typhoon_shocker_rider_8,ShowaRiderItems.typhoon_shocker_rider_9,ShowaRiderItems.typhoon_shocker_rider_10,ShowaRiderItems.typhoon_shocker_rider_11,
			ShowaRiderItems.typhoon_shocker_rider_12,ShowaRiderItems.typhoon_shocker_rider_12,};
	
	private String texture;
	public Entity_shocker_riders(World par1World)
	{
		super(par1World);
		this.setItemStackToSlot(EntityEquipmentSlot.CHEST,new ItemStack(ShowaRiderItems.ichigotroso));
		this.setItemStackToSlot(EntityEquipmentSlot.HEAD,new ItemStack(ShowaRiderItems.ichigohead));
		Random generator = new Random();
		int rand = generator.nextInt(belt.length);
		this.setItemStackToSlot(EntityEquipmentSlot.FEET,new ItemStack(belt[rand]));
		this.setItemStackToSlot(EntityEquipmentSlot.LEGS,new ItemStack(ShowaRiderItems.ichigolegs));
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

   		this.dropItem(miscellaneousRiderItems.shocker_emblem, 1);
   		this.dropItem(ShowaRiderItems.rider_circuit, 4);

   		switch (this.rand.nextInt(5))
		{
		case 0:
			this.dropItem(this.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem(), 1);
			break;
		}
   		
       }
       
   }


}
    