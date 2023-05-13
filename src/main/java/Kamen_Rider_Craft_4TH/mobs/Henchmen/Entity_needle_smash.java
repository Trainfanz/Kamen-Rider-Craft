package Kamen_Rider_Craft_4TH.mobs.Henchmen;


import java.util.Calendar;
import java.util.UUID;

import Kamen_Rider_Craft_4TH.RiderItems;
import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
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
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.pathfinding.PathNavigateGround;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

public class Entity_needle_smash extends Entity_base_henchmen
{
	public Entity_needle_smash(World par1World)
	{
		super(par1World);
	}

	protected void applyEntityAttributes()
	{
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(8.0D);
		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(60.0D);	     
		this.getEntityAttribute(SharedMonsterAttributes.ARMOR).setBaseValue(2.0D);
	}

	public void onDeath(DamageSource cause)
	{
		if (!this.world.isRemote){

			this.dropItem(RiderItems.smash_bottle, 1);
			switch (this.rand.nextInt(3))
			{   		   	    		
			case 0:
				this.dropItem(RiderItems.smash_bottle, 1);
				break;
				
			case 1:
				this.dropItem(RiderItems.smash_bottle, 2);
				break;
				
			case 2:				
				break;
			}	
			
		}
	}
}
