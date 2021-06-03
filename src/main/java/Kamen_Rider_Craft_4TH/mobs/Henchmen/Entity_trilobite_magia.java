package Kamen_Rider_Craft_4TH.mobs.Henchmen;


import java.util.Calendar;
import java.util.UUID;

import Kamen_Rider_Craft_4TH.RiderItems;
import Kamen_Rider_Craft_4TH.mobs.Boss.EntityBossBase;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_Para_dx;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_Red_Poppy;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_genm;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_jin;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_magia;
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

public class Entity_trilobite_magia extends Entity_base_henchmen
{
	public Entity_trilobite_magia(World par1World)
	{
		super(par1World);	
	}


	public void onDeath(DamageSource cause)
	{
		if (!this.world.isRemote){

			if (this.getAttackTarget()instanceof EntityPlayer){
				EntityPlayer playerIn=	(EntityPlayer) this.getAttackTarget();
				EntityBossBase entityboss  = new Entity_magia(world);

				EntityBossBase entity_jin  = new Entity_jin(world);
				switch (this.rand.nextInt(25))
				{
				case 0:
					playerIn.sendMessage( new TextComponentString(TextFormatting.DARK_RED+"Zetsumerise!"));
					entityboss.setLocationAndAngles(this.posX, this.posY, this.posZ, 0, 0.0F);
					world.spawnEntity(entityboss);
					break;
				case 1:
					playerIn.sendMessage( new TextComponentString(TextFormatting.DARK_RED+"Zetsumerise!"));
					entityboss.setLocationAndAngles(this.posX, this.posY, this.posZ, 0, 0.0F);
					world.spawnEntity(entityboss);
					break;
				case 2:
					playerIn.sendMessage( new TextComponentString(TextFormatting.DARK_RED+"Zetsumerise!"));
					entityboss.setLocationAndAngles(this.posX, this.posY, this.posZ, 0, 0.0F);
					world.spawnEntity(entityboss);
					break;
				case 3:
					playerIn.sendMessage( new TextComponentString(TextFormatting.LIGHT_PURPLE+"Forcerise! Flying Falcon! Break down."));
					entity_jin.setLocationAndAngles(this.posX, this.posY, this.posZ, 0, 0.0F);
					world.spawnEntity(entity_jin);
					break;
				}
			}
		}
		this.dropItem(RiderItems.blank_progrise_key, 1);
		this.dropItem(RiderItems.hiden_metal, 2);
		switch (this.rand.nextInt(25))
		{
		case 0:
			this.dropItem(RiderItems.rising_hopper_progrise_key, 1);
			break;
		case 1:
			this.dropItem(RiderItems.shooting_wolf_progrise_key, 1);
			break;
		case 2:
			this.dropItem(RiderItems.rushing_cheetah_progrise_key, 1);
			break;
		case 3:
			this.dropItem(RiderItems.humagear_progrise_key, 1); 
			break;
		}
	}


}
