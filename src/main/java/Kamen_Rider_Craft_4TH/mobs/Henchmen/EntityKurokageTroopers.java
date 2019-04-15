package Kamen_Rider_Craft_4TH.mobs.Henchmen;


import java.util.Calendar;
import java.util.UUID;

import Kamen_Rider_Craft_4TH.RiderItems;
import Kamen_Rider_Craft_4TH.mobs.Boss.EntityBossBase;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_Duke;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_EngineBros;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_Kaiser;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_KaiserReverse;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_Marika;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_Para_dx;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_Red_Poppy;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_RemoconBros;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_Sigurd;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_ZangetsuShin;
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

public class EntityKurokageTroopers extends Entity_base_henchmen
{
	public EntityKurokageTroopers(World par1World)
	{
		super(par1World);
		this.setItemStackToSlot(EntityEquipmentSlot.MAINHAND,new ItemStack(RiderItems.kagematsu));
		this.setItemStackToSlot(EntityEquipmentSlot.CHEST,new ItemStack(RiderItems.Gaimtroso));
		this.setItemStackToSlot(EntityEquipmentSlot.HEAD,new ItemStack(RiderItems.Gaimhead));
		this.setItemStackToSlot(EntityEquipmentSlot.FEET,new ItemStack(RiderItems.sengoku_driver_kurokage_troopers));
		this.setItemStackToSlot(EntityEquipmentSlot.LEGS,new ItemStack(RiderItems.Gaimlegs));
	}

	protected void applyEntityAttributes()
	{
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(8.0D);
	}

	public void onDeath(DamageSource cause)
	{
		if (!this.world.isRemote){

			this.dropItem(RiderItems.himawari_lockseed, this.rand.nextInt(4));
				if (this.getAttackTarget()instanceof EntityPlayer){
					EntityPlayer playerIn=	(EntityPlayer) this.getAttackTarget();
					 EntityBossBase entityboss  = new Entity_ZangetsuShin(world);
					 EntityBossBase entityboss2  = new Entity_Marika(world);
					 EntityBossBase entityboss3  = new Entity_Sigurd(world);
					 EntityBossBase entityboss4  = new Entity_Duke(world);
					 
				switch (this.rand.nextInt(35))
				{
				case 0:
					playerIn.sendMessage( new TextComponentString(TextFormatting.GREEN+"Soda! Melon Energy Arms!"));
					entityboss.setLocationAndAngles(this.posX, this.posY, this.posZ, 0, 0.0F);
					world.spawnEntity(entityboss);
					break;
				case 1:
					playerIn.sendMessage( new TextComponentString(TextFormatting.LIGHT_PURPLE+"Soda! Peach Energy Arms!"));
					entityboss2.setLocationAndAngles(this.posX, this.posY, this.posZ, 0, 0.0F);
					world.spawnEntity(entityboss2);
					break;
				case 2:
					playerIn.sendMessage( new TextComponentString(TextFormatting.RED+"Soda! Cherry Energy Arms!"));
					entityboss3.setLocationAndAngles(this.posX, this.posY, this.posZ, 0, 0.0F);
					world.spawnEntity(entityboss3);
					break;
				case 3:
					playerIn.sendMessage( new TextComponentString(TextFormatting.YELLOW+"Soda! Lemon Energy Arms! Fight, Power! Fight, Power! Fight! Fight! Fight! Fight! Fi-Fi-Fi-Fi-Fight"));
					entityboss4.setLocationAndAngles(this.posX, this.posY, this.posZ, 0, 0.0F);
					world.spawnEntity(entityboss4);
					break;
				}
				switch (this.rand.nextInt(25))
				{
				case 0:
					this.dropItem(RiderItems.matsubokkuri_energy_lockseed, 1);
					break;
					}
				
				
			switch (this.rand.nextInt(25))
			{
			case 0:
				this.dropItem(RiderItems.sengoku_driver_kurokage_troopers, 1);
				break;
			case 1:
				this.dropItem(RiderItems.sengoku_driver_kurokage_troopers, 1);
				break;
			case 2:
				this.dropItem(RiderItems.sengoku_driver_kurokage_troopers, 1);
				break;
			case 3:
				this.dropItem(RiderItems.sengoku_driver_kurokage_troopers, 1); 
				break;
			case 4:
				this.dropItem(RiderItems.sengoku_driver_kurokage_troopers, 1);
				break;
				}
			}
		}
	}
}	
