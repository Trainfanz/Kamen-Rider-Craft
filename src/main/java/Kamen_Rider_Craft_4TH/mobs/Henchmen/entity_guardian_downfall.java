package Kamen_Rider_Craft_4TH.mobs.Henchmen;


import java.util.Calendar;
import java.util.UUID;

import Kamen_Rider_Craft_4TH.RiderItems;
import Kamen_Rider_Craft_4TH.mobs.Boss.EntityBossBase;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_BloodStalk;
import Kamen_Rider_Craft_4TH.mobs.Boss.entity_blood;
import Kamen_Rider_Craft_4TH.mobs.Boss.entity_killbus;
import Kamen_Rider_Craft_4TH.mobs.Boss.entity_metal_build;
import Kamen_Rider_Craft_4TH.mobs.bikes.EntityMachineBuilder;
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
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;

public class entity_guardian_downfall extends Entity_base_henchmen
{
	public entity_guardian_downfall(World par1World)
	{
		super(par1World);
	}
	public void onDeath(DamageSource cause)
	{
		if (!this.world.isRemote){
			this.dropItem(RiderItems.full_bottle, 1);
			if (this.getAttackTarget()instanceof EntityPlayer){
				 EntityPlayer playerIn=	(EntityPlayer) this.getAttackTarget();
				 Entity_base_henchmen entitymob  = new entity_phantom_crusher(world);
				 EntityBossBase entityboss  = new entity_blood(world);
				 EntityBossBase entityboss1  = new entity_killbus(world);
				 EntityBossBase entityboss2  = new entity_metal_build(world);
			switch (this.rand.nextInt(25))
			{
			case 0:
				playerIn.sendMessage( new TextComponentString(TextFormatting.RED+"Overflow! Wake Up Cross-Z! Get Great Dragon! Yabei! Bura-bura-bura-bura-Blood!"));
				entityboss.setLocationAndAngles(this.posX, this.posY, this.posZ, 0, 0.0F);
				world.spawnEntity(entityboss);
				break;
			case 1:
				playerIn.sendMessage( new TextComponentString(TextFormatting.DARK_RED+"Spider! Spider! Killbus Spider!"));
				entityboss1.setLocationAndAngles(this.posX, this.posY, this.posZ, 0, 0.0F);
				world.spawnEntity(entityboss1);
				break;
			case 2:
				playerIn.sendMessage( new TextComponentString(TextFormatting.DARK_GRAY+"Uncontrolled Switch! Black Hazard! Yabei!"));
				entityboss2.setLocationAndAngles(this.posX, this.posY, this.posZ, 0, 0.0F);
				world.spawnEntity(entityboss2);
				break;
			case 3:
				entitymob.setLocationAndAngles(this.posX, this.posY, this.posZ, 0, 0.0F);
				world.spawnEntity(entitymob);
				break;
			case 4:
				entitymob.setLocationAndAngles(this.posX, this.posY, this.posZ, 0, 0.0F);
				world.spawnEntity(entitymob);
				break;
			case 5:
				entitymob.setLocationAndAngles(this.posX, this.posY, this.posZ, 0, 0.0F);
				world.spawnEntity(entitymob);
				break;
			case 6:
				entitymob.setLocationAndAngles(this.posX, this.posY, this.posZ, 0, 0.0F);
				world.spawnEntity(entitymob);
				break;
			case 7:
				entitymob.setLocationAndAngles(this.posX, this.posY, this.posZ, 0, 0.0F);
				world.spawnEntity(entitymob);
				break;
			case 8:
				entitymob.setLocationAndAngles(this.posX, this.posY, this.posZ, 0, 0.0F);
				world.spawnEntity(entitymob);
				break;
			case 9:
				entitymob.setLocationAndAngles(this.posX, this.posY, this.posZ, 0, 0.0F);
				world.spawnEntity(entitymob);
				break;
			}
		}
			switch (this.rand.nextInt(10))
			{
			case 0:
				this.dropItem(RiderItems.nebula_gas_sample, 1);
				break;
			case 1:
				this.dropItem(RiderItems.full_bottle, 2);
				break;
			}
		}
	}
}
