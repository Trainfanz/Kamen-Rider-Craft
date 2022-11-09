package Kamen_Rider_Craft_4TH.mobs.Henchmen;


import java.util.Calendar;
import java.util.UUID;

import Kamen_Rider_Craft_4TH.RiderItems;
import Kamen_Rider_Craft_4TH.mobs.Boss.EntityBossBase;
import Kamen_Rider_Craft_4TH.mobs.Boss.EntitySorcerer;
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

public class EntityMageFootSoldiers extends Entity_base_henchmen
{
	public EntityMageFootSoldiers(World par1World)
	{
		super(par1World);
		//this.setItemStackToSlot(EntityEquipmentSlot.MAINHAND,new ItemStack(RiderItems.wizarswordgun_mage));
		this.setItemStackToSlot(EntityEquipmentSlot.CHEST,new ItemStack(RiderItems.wizardtroso));
		this.setItemStackToSlot(EntityEquipmentSlot.HEAD,new ItemStack(RiderItems.wizardhead));
		this.setItemStackToSlot(EntityEquipmentSlot.FEET,new ItemStack(RiderItems.magewizardriver_foot_soldiers));
		this.setItemStackToSlot(EntityEquipmentSlot.LEGS,new ItemStack(RiderItems.wizardlegs));	
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

			this.dropItem(RiderItems.wizardgem, 2);
			
				if (this.getAttackTarget()instanceof EntityPlayer){
					EntityPlayer playerIn=	(EntityPlayer) this.getAttackTarget();
					 EntityMageCaptain entityboss  = new EntityMageCaptain(world);
					 EntityBossBase entityboss1  = new EntitySorcerer(world);
				switch (this.rand.nextInt(10))
				{
				case 0:
					playerIn.sendMessage( new TextComponentString(TextFormatting.GOLD+"Change, Now!"));
					entityboss1.setLocationAndAngles(this.posX, this.posY, this.posZ, 0, 0.0F);
					world.spawnEntity(entityboss1);
					break;
				case 1:
					playerIn.sendMessage( new TextComponentString(TextFormatting.RED+"Change, Now!"));
					entityboss.setLocationAndAngles(this.posX, this.posY, this.posZ, 0, 0.0F);
					world.spawnEntity(entityboss);
					break;
				}
			switch (this.rand.nextInt(10))
			{
			case 0:
				this.dropItem(RiderItems.magewizardriver_foot_soldiers, 1);
				break;
			
				}
			}
		}
	}
}	
