package Kamen_Rider_Craft_4TH.mobs.Henchmen;


import java.util.Calendar;
import java.util.UUID;

import Kamen_Rider_Craft_4TH.RiderItems;
import Kamen_Rider_Craft_4TH.mobs.Boss.EntityBossBase;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_EngineBros;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_Kaiser;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_KaiserReverse;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_Para_dx;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_Red_Poppy;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_RemoconBros;
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

public class EntityRidePlayer extends Entity_base_henchmen
{
	public EntityRidePlayer(World par1World)
	{
		super(par1World);
		this.setItemStackToSlot(EntityEquipmentSlot.MAINHAND,new ItemStack(RiderItems.ride_weapon));
		this.setItemStackToSlot(EntityEquipmentSlot.CHEST,new ItemStack(RiderItems.ex_aidtroso));
		this.setItemStackToSlot(EntityEquipmentSlot.HEAD,new ItemStack(RiderItems.ex_aidhead));
		this.setItemStackToSlot(EntityEquipmentSlot.FEET,new ItemStack(RiderItems.rideplayerbelt));
		this.setItemStackToSlot(EntityEquipmentSlot.LEGS,new ItemStack(RiderItems.ex_aidlegs));
	}

	protected void applyEntityAttributes()
	{
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(8.0D);
	}

	public void onDeath(DamageSource cause)
	{
		if (!this.world.isRemote){

			this.dropItem(RiderItems.xx_bugster_virus_dna, 1);
				if (this.getAttackTarget()instanceof EntityPlayer){
					EntityPlayer playerIn=	(EntityPlayer) this.getAttackTarget();
					 EntityBossBase entityboss  = new Entity_Para_dx(world);
					 EntityBossBase entityboss2  = new Entity_Red_Poppy(world);
				switch (this.rand.nextInt(25))
				{
				case 0:
					playerIn.sendMessage( new TextComponentString(TextFormatting.RED+"Gachan! Mazaru Up! Akai kobushi tsuyosa!"+TextFormatting.BLUE+" Aoi Puzzle rensa! Aka to ao no kousa! Perfect Knock Out!"));
					
					entityboss.setItemStackToSlot(EntityEquipmentSlot.MAINHAND,new ItemStack(RiderItems.parabragun_axe));
					entityboss.setItemStackToSlot(EntityEquipmentSlot.CHEST,new ItemStack(RiderItems.ex_aidtroso));
					entityboss.setItemStackToSlot(EntityEquipmentSlot.HEAD,new ItemStack(RiderItems.ex_aidhead));
					entityboss.setItemStackToSlot(EntityEquipmentSlot.FEET,new ItemStack(RiderItems.gamer_driver_paradox));
					entityboss.setItemStackToSlot(EntityEquipmentSlot.LEGS,new ItemStack(RiderItems.ex_aidlegs));
					
					
					entityboss.setLocationAndAngles(this.posX, this.posY, this.posZ, 0, 0.0F);
					world.spawnEntity(entityboss);
					break;
				case 1:
					playerIn.sendMessage( new TextComponentString(TextFormatting.YELLOW+"Buggle Up! "+TextFormatting.WHITE+"Dreaming Girl! "+TextFormatting.LIGHT_PURPLE+"Koi no Simulation!"+TextFormatting.WHITE+" Otome wa itsumo "+TextFormatting.LIGHT_PURPLE+"Toki Meki Crisis! "));
					
					entityboss2.setItemStackToSlot(EntityEquipmentSlot.MAINHAND,new ItemStack(RiderItems.gashacon_bugvisor_ii));
					entityboss2.setItemStackToSlot(EntityEquipmentSlot.CHEST,new ItemStack(RiderItems.ex_aidtroso));
					entityboss2.setItemStackToSlot(EntityEquipmentSlot.HEAD,new ItemStack(RiderItems.ex_aidhead));
					entityboss2.setItemStackToSlot(EntityEquipmentSlot.FEET,new ItemStack(RiderItems.gashacon_bugvisor_ii_poppy_red));
					entityboss2.setItemStackToSlot(EntityEquipmentSlot.LEGS,new ItemStack(RiderItems.ex_aidlegs));
					
					entityboss2.setLocationAndAngles(this.posX, this.posY, this.posZ, 0, 0.0F);
					world.spawnEntity(entityboss2);
					break;
				}
			switch (this.rand.nextInt(25))
			{
			case 0:
				this.dropItem(RiderItems.kamen_rider_chronicle_gashat, 1);
				break;
			case 1:
				this.dropItem(RiderItems.unfinished_kamen_rider_chronicle_gashat, 1);
				break;
			case 2:
				this.dropItem(RiderItems.kamen_rider_chronicle_gashat, 1);
				break;
			case 3:
				this.dropItem(RiderItems.unfinished_kamen_rider_chronicle_gashat, 1); 
				break;
			case 4:
				this.dropItem(RiderItems.unfinished_kamen_rider_chronicle_gashat, 1);
				break;
				}
			}
		}
	}
}	
