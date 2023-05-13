package Kamen_Rider_Craft_4TH.mobs.bikes;


import java.util.Calendar;
import java.util.UUID;

import Kamen_Rider_Craft_4TH.RiderItems;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.SharedMonsterAttributes;
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
import net.minecraft.entity.ai.attributes.RangedAttribute;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.passive.AbstractHorse;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.passive.EntityDonkey;
import net.minecraft.entity.passive.EntityHorse;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.entity.passive.HorseArmorType;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.pathfinding.PathNavigateGround;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumHand;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;
import net.minecraft.world.storage.loot.LootTableList;

public class EntityBikeBase extends EntityHorse
{



	private String texture;
	public EntityBikeBase(World par1World)
	{
		super(par1World);

        this.setSize(0.7964844F, 1F);
	}
	protected void initEntityAI()
    {
        this.tasks.addTask(0, new EntityAISwimming(this));
    }
	
	
	  protected void applyEntityAttributes()
	    {
	        super.applyEntityAttributes();
	       
	        this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.6D);

	    }
	   /**
     * If Animal, checks if the age timer is negative
     */
    public boolean isChild()
    {
    	 return false;
    }
    /**
     * Returns true if the mob is currently able to mate with the specified mob.
     */
    public boolean canMateWith(EntityAnimal otherAnimal)
    {
            return false;
    }
    
    public boolean isTame()
    {
        return true;
    }
    
    public boolean wearsArmor()
    {
        return false;
    }
   
    public boolean isArmor(ItemStack stack)
    {
        return false;
    }
    public boolean isHorseSaddled()
    {
        return true;
    }
    
    protected boolean handleEating(EntityPlayer player, ItemStack stack)
    {
        return  false;
    }
    
   
    protected void playGallopSound(SoundType p_190680_1_)
    {
    }
    
    protected SoundEvent getAmbientSound()
    {
       
        return null;
    }

    protected SoundEvent getDeathSound()
    {
        
        return SoundEvents.BLOCK_METAL_BREAK;
    }

    protected SoundEvent getHurtSound(DamageSource damageSourceIn)
    {
        
        return null;
    }

    protected SoundEvent getAngrySound()
    {
       
        return null;
    }

    public boolean processInteract(EntityPlayer player, EnumHand hand)
    {
        ItemStack itemstack = player.getHeldItem(hand);
        boolean flag = !itemstack.isEmpty();

                this.mountTo(player);
                return true;   
    }
   
	/**
	 * Get this Entity's EnumCreatureAttribute
	 */
	public EnumCreatureAttribute getCreatureAttribute()
	{
		return EnumCreatureAttribute.UNDEFINED;
	}

    public void onDeath(DamageSource cause)
    {
         

    }
}
