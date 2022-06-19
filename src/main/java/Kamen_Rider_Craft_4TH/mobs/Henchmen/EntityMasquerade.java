package Kamen_Rider_Craft_4TH.mobs.Henchmen;


import java.util.Calendar;
import java.util.UUID;

import Kamen_Rider_Craft_4TH.RiderBlocks;
import Kamen_Rider_Craft_4TH.RiderItems;
import Kamen_Rider_Craft_4TH.mobs.Boss.EntityBossBase;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_clay_doll_dopant;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_grease;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_nazca_dopant;
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
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.pathfinding.PathNavigateGround;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;

public class EntityMasquerade extends Entity_base_henchmen
{
	public EntityMasquerade(World par1World)
	{
		super(par1World);    
	}

	public void onDeath(DamageSource cause)
	{
		if (!this.world.isRemote){
			this.dropItem(RiderItems.gaiamemory, 1);
			if (this.getAttackTarget()instanceof EntityPlayer){
				 EntityPlayer playerIn=	(EntityPlayer) this.getAttackTarget();
				 EntityBossBase entityboss  = new Entity_clay_doll_dopant(world);
				 EntityBossBase entityboss2  = new Entity_nazca_dopant(world);
			switch (this.rand.nextInt(10))
			{
			case 0:
				 playerIn.sendStatusMessage(new TextComponentString(TextFormatting.YELLOW+"Claydoll!"), true);
				entityboss.setLocationAndAngles(this.posX, this.posY, this.posZ, 0, 0.0F);
				world.spawnEntity(entityboss);
				break;
				
			case 1:
				 playerIn.sendStatusMessage(new TextComponentString(TextFormatting.AQUA+"Nazca!"), true);
				entityboss2.setLocationAndAngles(this.posX, this.posY, this.posZ, 0, 0.0F);
				world.spawnEntity(entityboss2);
				break;
				
				}
			}switch (this.rand.nextInt(25))
			{
			case 0:
				this.dropItem(RiderItems.cyclone_memory, 1);
				break;

			case 1:
				this.dropItem(RiderItems.luna_memory, 1);
				break;

			case 2:
				this.dropItem(RiderItems.heat_memory, 1);
				break;
			case 3:
				this.dropItem(RiderItems.joker_memory, 1); 
				break;
			case 4:
				this.dropItem(RiderItems.metal_memory, 1);
				break;
			case 5:
				this.dropItem(RiderItems.trigger_memory, 1);
				break;		
			case 6:
				this.entityDropItem(new ItemStack(RiderBlocks.taboo_bossblock), 1);
				break;
			}
		}
	}


}
