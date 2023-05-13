package Kamen_Rider_Craft_4TH.mobs.Henchmen;


import java.util.Calendar;
import java.util.Random;
import java.util.UUID;

import javax.annotation.Nullable;

import Kamen_Rider_Craft_4TH.ReiwaRiderItems;
import Kamen_Rider_Craft_4TH.RiderItems;
import Kamen_Rider_Craft_4TH.item.geats.item_desire_driver;
import Kamen_Rider_Craft_4TH.mobs.Boss.EntityBossBase;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_EngineBros;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_Kaiser;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_KaiserReverse;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_Para_dx;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_Red_Poppy;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_RemoconBros;
import Kamen_Rider_Craft_4TH.mobs.Boss.entity_guren_graphite_bugster;
import net.minecraft.block.Block;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.IEntityLivingData;
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
import net.minecraft.entity.monster.EntityIronGolem;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.monster.EntityPigZombie;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.pathfinding.PathNavigateGround;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.World;

public class EntityGMRider extends Entity_pawn_jyamato
{
	public EntityGMRider(World par1World)
	{
		super(par1World);
		
		
		
	}

	@Override
	 public IEntityLivingData onInitialSpawn(DifficultyInstance difficulty, @Nullable IEntityLivingData livingdata)
	    {
		
		ItemStack belt = new ItemStack(ReiwaRiderItems.desire_driver_gm);
		 
		switch (this.rand.nextInt(9))
		{
		case 0:
			item_desire_driver.set_lock(belt,"l",3);	
			this.setItemStackToSlot(EntityEquipmentSlot.MAINHAND,new ItemStack(ReiwaRiderItems.raise_hammer));
			break;
		case 1:
			item_desire_driver.set_lock(belt,"l",4);	
			this.setItemStackToSlot(EntityEquipmentSlot.MAINHAND,new ItemStack(ReiwaRiderItems.raise_water));
			break;
		case 2:
			item_desire_driver.set_lock(belt,"l",5);	
			this.setItemStackToSlot(EntityEquipmentSlot.MAINHAND,new ItemStack(ReiwaRiderItems.raise_arrow));
			break;
		case 3:
			item_desire_driver.set_lock(belt,"l",6);	
			this.setItemStackToSlot(EntityEquipmentSlot.MAINHAND,new ItemStack(ReiwaRiderItems.raise_shield));
			break;
		case 4:
			item_desire_driver.set_lock(belt,"l",10);	
			this.setItemStackToSlot(EntityEquipmentSlot.MAINHAND,new ItemStack(ReiwaRiderItems.raise_chain_array));
			break;
		case 5:
			item_desire_driver.set_lock(belt,"l",11);	
			this.setItemStackToSlot(EntityEquipmentSlot.MAINHAND,new ItemStack(ReiwaRiderItems.raise_claw));
			this.setItemStackToSlot(EntityEquipmentSlot.OFFHAND,new ItemStack(ReiwaRiderItems.raise_claw));
			break;
		case 6:
			item_desire_driver.set_lock(belt,"l",16);	
			this.setItemStackToSlot(EntityEquipmentSlot.MAINHAND,new ItemStack(ReiwaRiderItems.raise_propeller));
			break;
		case 7:
			item_desire_driver.set_lock(belt,"l",17);	
			this.setItemStackToSlot(EntityEquipmentSlot.MAINHAND,new ItemStack(Items.AIR));
			break;
		case 8:
			item_desire_driver.set_lock(belt,"l",18);	
			this.setItemStackToSlot(EntityEquipmentSlot.MAINHAND,new ItemStack(Items.AIR));
			break;
			
		}
		
		this.setItemStackToSlot(EntityEquipmentSlot.CHEST,new ItemStack(ReiwaRiderItems.geatstroso));
		this.setItemStackToSlot(EntityEquipmentSlot.HEAD,new ItemStack(ReiwaRiderItems.geatshead));
		this.setItemStackToSlot(EntityEquipmentSlot.FEET,belt);
		this.setItemStackToSlot(EntityEquipmentSlot.LEGS,new ItemStack(ReiwaRiderItems.geatslegs));
		super.onInitialSpawn( difficulty,  livingdata);
		 
	        return livingdata;
	    }
	
	protected void applyEntityAttributes()
	{
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(8.0D);
	}

	 /**
     * Checks to make sure the light is not too bright where the mob is spawning
     */
    protected boolean isValidLightLevel()
    {
        return true;
    }
    
	public void onDeath(DamageSource cause)
	{
		if (!this.world.isRemote){

			
			this.dropItem(ReiwaRiderItems.blank_rider_core_id, 2);
				this.dropItem(ReiwaRiderItems.hatena_mission_box, 1);
			
			switch (this.rand.nextInt(7))
			{
			case 0:
				this.dropItem(ReiwaRiderItems.command_twin_buckle_jet, 1);
				break;
			case 1:
				this.dropItem(ReiwaRiderItems.command_twin_buckle_cannon, 1);
				break;
			case 2:
				this.dropItem(ReiwaRiderItems.desire_driver_gm, 1);
				break;
			case 3:
				this.dropItem(ReiwaRiderItems.gigant_mission_box, 1);
				break;
		
			
				}
			
		}
	}
}	
