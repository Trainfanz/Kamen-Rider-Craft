package Kamen_Rider_Craft_4TH.mobs.Henchmen;


import java.util.Calendar;
import java.util.UUID;

import Kamen_Rider_Craft_4TH.RiderItems;
import Kamen_Rider_Craft_4TH.mobs.Boss.EntityBossBase;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_Para_dx;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_Red_Poppy;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_ankh_lost;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_gamel;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_genm;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_kazari;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_mezool;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_uva;
import Kamen_Rider_Craft_4TH.mobs.Boss.entity_gremlin_phantom;
import Kamen_Rider_Craft_4TH.mobs.Boss.entity_medusa_phantom;
import Kamen_Rider_Craft_4TH.mobs.Boss.entity_phoenix_phantom;
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
import net.minecraft.world.World;

public class Entity_ghouls extends Entity_base_henchmen
{
	public Entity_ghouls(World par1World)
	{
		super(par1World);	
	}

	

	public void onDeath(DamageSource cause)
	{
		if (!this.world.isRemote){

			if (this.getAttackTarget()instanceof EntityPlayer){
				EntityPlayer playerIn=	(EntityPlayer) this.getAttackTarget();
				entity_medusa_phantom entityboss  = new entity_medusa_phantom(world);
				entity_phoenix_phantom entityboss2  = new entity_phoenix_phantom(world);
				entity_gremlin_phantom entityboss3  = new entity_gremlin_phantom(world);
				
			switch (this.rand.nextInt(15))
			{
			case 0:
				entityboss.setLocationAndAngles(this.posX, this.posY, this.posZ, 0, 0.0F);
				world.spawnEntity(entityboss);
				break;
			case 1:
				entityboss2.setLocationAndAngles(this.posX, this.posY, this.posZ, 0, 0.0F);
				world.spawnEntity(entityboss2);
				break;
			case 2:
				entityboss3.setLocationAndAngles(this.posX, this.posY, this.posZ, 0, 0.0F);
				world.spawnEntity(entityboss3);
				break;
			}
		
			} 
			this.dropItem(RiderItems.wizardgem, 2);
			
			switch (this.rand.nextInt(10))
			{
			case 0:
				this.dropItem(RiderItems.wizardgem_red, 1);
				break;
			case 1:
				this.dropItem(RiderItems.wizardgem_blue, 1);
				break;
			case 3:
				this.dropItem(RiderItems.wizardgem_green, 1);
				break;
			case 4:
				this.dropItem(RiderItems.wizardgem_yellow, 1);
				break;
			}
		
		}
		}
}
