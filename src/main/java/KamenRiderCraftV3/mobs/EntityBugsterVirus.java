package KamenRiderCraftV3.mobs;


import java.util.Calendar;
import java.util.UUID;

import KamenRiderCraftV3.RiderItems;
import net.minecraft.block.Block;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
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
import net.minecraft.entity.monster.EntityIronGolem;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.monster.EntityPigZombie;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.pathfinding.PathNavigateGround;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

public class EntityBugsterVirus extends EntityZombie
{



	private String texture;
	public EntityBugsterVirus(World par1World)
	{
		super(par1World);
		 ((PathNavigateGround)this.getNavigator()).setBreakDoors(true);
	        this.tasks.addTask(0, new EntityAISwimming(this));
	        this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityPlayer.class, 1.0D, false));
	        this.tasks.addTask(5, new EntityAIMoveTowardsRestriction(this, 1.0D));
	        this.tasks.addTask(7, new EntityAIWander(this, 1.0D));
	        this.tasks.addTask(8, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
	        this.tasks.addTask(8, new EntityAILookIdle(this));
	        this.applyEntityAI();
	        this.setSize(0.6F, 1.95F);
	        //this.captureDrops=true;
	        
	}
    protected void applyEntityAI()
    {
        this.tasks.addTask(4, new EntityAIAttackOnCollide(this, EntityVillager.class, 1.0D, true));
        this.tasks.addTask(4, new EntityAIAttackOnCollide(this, EntityIronGolem.class, 1.0D, true));
        this.tasks.addTask(6, new EntityAIMoveThroughVillage(this, 1.0D, false));
        this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, true, new Class[] {EntityPigZombie.class}));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityPlayer.class, true));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityVillager.class, false));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityIronGolem.class, true));
    }
	
    /**
     * Returns the item that this EntityLiving is holding, if any.
     */
    public ItemStack getHeldItem()
    {
        return new ItemStack(RiderItems.bugster_trident);
    }
    

	public EnumCreatureAttribute getCreatureAttribute()
	{
		return EnumCreatureAttribute.UNDEAD;
	}

	

	 /**
     * Drop 0-2 items of this living's type. @param par1 - Whether this entity has recently been hit by a player. @param
     * par2 - Level of Looting used to kill this mob.
     */
    protected void dropFewItems(boolean par1, int par2)
    {
     

    		this.dropItem(RiderItems.blank_gashat, 2);
    		switch (this.rand.nextInt(25))
    		{
    		case 0:
    			this.dropItem(RiderItems.mighty_action_x_gashat, 1);
    			break;

    		case 1:
    			this.dropItem(RiderItems.taddle_quest_gashat, 1);
    			break;

    		case 2:
    			this.dropItem(RiderItems.taddle_quest_gashat, 1);
    			break;
    		case 3:
    			this.dropItem(RiderItems.bang_bang_shooting_gashat, 1); 
    			break;
    		case 4:
    			this.dropItem(RiderItems.bang_bang_shooting_gashat, 1);
    			break;
    		case 5:
    			this.dropItem(RiderItems.bakusou_bike_gashat, 1);
    			break;
    		case 6:
    			this.dropItem(RiderItems.mighty_action_x_gashat, 1);
    			break;

    		case 7:
    			this.dropItem(RiderItems.bakusou_bike_gashat, 1);
    			break;
    		case 8:
    			this.dropItem(RiderItems.mighty_action_x_gashat, 1);
    			break;

    		case 9:
    			this.dropItem(RiderItems.proto_mighty_action_x_gashat, 1);
    			break;
    		case 10:
    			this.dropItem(RiderItems.mighty_action_x_gashat, 1);
    			break;

    		case 11:
    			this.dropItem(RiderItems.blank_gashat, 4);
    			break;
    			
    	
        
        }
    }




}
