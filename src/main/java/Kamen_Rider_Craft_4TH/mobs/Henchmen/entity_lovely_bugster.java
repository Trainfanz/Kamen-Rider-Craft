package Kamen_Rider_Craft_4TH.mobs.Henchmen;


import java.util.Calendar;
import java.util.UUID;

import Kamen_Rider_Craft_4TH.RiderItems;
import Kamen_Rider_Craft_4TH.mobs.Boss.EntityBossBase;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_Para_dx;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_Red_Poppy;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_genm;
import Kamen_Rider_Craft_4TH.mobs.Boss.entity_lovelica_bugster;
import Kamen_Rider_Craft_4TH.mobs.Boss.entity_revol_bugster;
import Kamen_Rider_Craft_4TH.mobs.Boss.entity_salty_bugster;
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

public class entity_lovely_bugster extends Entity_base_henchmen
{
	public entity_lovely_bugster(World par1World)
	{
		super(par1World);	
	}

	public void onDeath(DamageSource cause)
	{
		if (!this.world.isRemote){

			this.dropItem(RiderItems.xx_bugster_virus_dna, 1);
			if (this.getAttackTarget()instanceof EntityPlayer){
				EntityPlayer playerIn=	(EntityPlayer) this.getAttackTarget();
				 EntityBossBase entityboss  = new entity_lovelica_bugster(world);
				 EntityBossBase entityboss2  = new Entity_Red_Poppy(world);
			switch (this.rand.nextInt(25))
			{
			case 0:
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
				this.dropItem(RiderItems.toki_meki_crisis_gashat, 1);
				break;
			}
		}
		}
		}
}
