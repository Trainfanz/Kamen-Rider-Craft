package Kamen_Rider_Craft_4TH.mobs.Henchmen;


import java.util.Calendar;
import java.util.Random;
import java.util.UUID;

import Kamen_Rider_Craft_4TH.ReiwaRiderItems;
import Kamen_Rider_Craft_4TH.mobs.Boss.EntityBossBase;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_EngineBros;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_Kaiser;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_KaiserReverse;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_Para_dx;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_Red_Poppy;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_RemoconBros;
import Kamen_Rider_Craft_4TH.mobs.Boss.entity_abaddon_high;
import Kamen_Rider_Craft_4TH.mobs.Boss.entity_blood;
import Kamen_Rider_Craft_4TH.mobs.Boss.entity_eden;
import Kamen_Rider_Craft_4TH.mobs.Boss.entity_killbus;
import Kamen_Rider_Craft_4TH.mobs.Boss.entity_metal_build;
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

public class entity_abaddon_low extends Entity_base_henchmen
{
	public static final Item[] belt = new Item[] {ReiwaRiderItems.shot_abaddo_riser,ReiwaRiderItems.slash_abaddo_riser};
	
	public entity_abaddon_low(World par1World)
	{
		super(par1World);
		
		this.setItemStackToSlot(EntityEquipmentSlot.CHEST,new ItemStack(ReiwaRiderItems.zero_onetroso));
		this.setItemStackToSlot(EntityEquipmentSlot.HEAD,new ItemStack(ReiwaRiderItems.zero_onehead));
		
		Random generator = new Random();
		int rand = generator.nextInt(belt.length);
		this.setItemStackToSlot(EntityEquipmentSlot.FEET,new ItemStack(belt[rand]));
		
		this.setItemStackToSlot(EntityEquipmentSlot.LEGS,new ItemStack(ReiwaRiderItems.zero_onelegs));
		
		if (this.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem()==ReiwaRiderItems.shot_abaddo_riser)
		{
			this.setItemStackToSlot(EntityEquipmentSlot.MAINHAND,new ItemStack(ReiwaRiderItems.shot_abaddo_gun));
		}
		if (this.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem()==ReiwaRiderItems.slash_abaddo_riser)
		{
			this.setItemStackToSlot(EntityEquipmentSlot.MAINHAND,new ItemStack(ReiwaRiderItems.slash_abaddo_sword));
		}
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
		if (!this.world.isRemote)
		{
			this.dropItem(ReiwaRiderItems.blank_progrise_key, 1);
			this.dropItem(ReiwaRiderItems.hiden_metal, 2);

			if (this.getAttackTarget()instanceof EntityPlayer)
			{
				 EntityPlayer playerIn=	(EntityPlayer) this.getAttackTarget();
				 EntityBossBase entitymob  = new entity_abaddon_high(world);
				 EntityBossBase entityboss  = new entity_eden(world);
				 switch (this.rand.nextInt(25))
				 {
				 	case 0:
				 		playerIn.sendMessage( new TextComponentString(TextFormatting.RED+"Progrise ARK! Imagine! Ideal! Illusion! Eden the Kamen Rider!"));
				 		entityboss.setLocationAndAngles(this.posX, this.posY, this.posZ, 0, 0.0F);
				 		world.spawnEntity(entityboss);
				 		break;
				 	case 1:
				 		playerIn.sendMessage( new TextComponentString(TextFormatting.GOLD+"ThinkNet Rise! Crowding Hopper!"));
				 		entitymob.setLocationAndAngles(this.posX, this.posY, this.posZ, 0, 0.0F);
				 		world.spawnEntity(entitymob);
				 		break;
				 	case 2:
				 		playerIn.sendMessage( new TextComponentString(TextFormatting.GOLD+"ThinkNet Rise! Crowding Hopper!"));
				 		entitymob.setLocationAndAngles(this.posX, this.posY, this.posZ, 0, 0.0F);
				 		world.spawnEntity(entitymob);
				 		break;
				 	case 3:
				 		playerIn.sendMessage( new TextComponentString(TextFormatting.GOLD+"ThinkNet Rise! Crowding Hopper!"));
				 		entitymob.setLocationAndAngles(this.posX, this.posY, this.posZ, 0, 0.0F);
				 		world.spawnEntity(entitymob);
				 		break;
				 	case 4:
				 		playerIn.sendMessage( new TextComponentString(TextFormatting.GOLD+"ThinkNet Rise! Crowding Hopper!"));
				 		entitymob.setLocationAndAngles(this.posX, this.posY, this.posZ, 0, 0.0F);
				 		world.spawnEntity(entitymob);
				 		break;
				 	case 5:
				 		playerIn.sendMessage( new TextComponentString(TextFormatting.GOLD+"ThinkNet Rise! Crowding Hopper!"));
				 		entitymob.setLocationAndAngles(this.posX, this.posY, this.posZ, 0, 0.0F);
				 		world.spawnEntity(entitymob);
				 		break;
				 	case 6:
				 		playerIn.sendMessage( new TextComponentString(TextFormatting.GOLD+"ThinkNet Rise! Crowding Hopper!"));
				 		entitymob.setLocationAndAngles(this.posX, this.posY, this.posZ, 0, 0.0F);
				 		world.spawnEntity(entitymob);
				 		break;
				 	case 7:
				 		playerIn.sendMessage( new TextComponentString(TextFormatting.GOLD+"ThinkNet Rise! Crowding Hopper!"));
				 		entitymob.setLocationAndAngles(this.posX, this.posY, this.posZ, 0, 0.0F);
				 		world.spawnEntity(entitymob);
				 		break;
				 	case 8:
				 		playerIn.sendMessage( new TextComponentString(TextFormatting.GOLD+"ThinkNet Rise! Crowding Hopper!"));
				 		entitymob.setLocationAndAngles(this.posX, this.posY, this.posZ, 0, 0.0F);
				 		world.spawnEntity(entitymob);
				 		break;
				}
			}
		}
	}
}	
