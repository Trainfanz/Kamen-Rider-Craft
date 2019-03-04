package Kamen_Rider_Craft_4TH.mobs.Henchmen;


import java.util.Calendar;
import java.util.UUID;

import Kamen_Rider_Craft_4TH.RiderItems;
import Kamen_Rider_Craft_4TH.mobs.Boss.EntityBossBase;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_EngineBros;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_Kaiser;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_KaiserReverse;
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

public class EntityNebulaBugsterVirus extends Entity_base_henchmen
{
	public EntityNebulaBugsterVirus(World par1World)
	{
		super(par1World);
	}

	/**
	 * Returns the item that this EntityLiving is holding, if any.
	 */
	@Override
	public ItemStack getHeldItemMainhand()
	{
		return new ItemStack(RiderItems.bugster_trident);
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
					 Entity_base_henchmen entitymob  = new Entity_needle_smash(world);
					 EntityBossBase entityboss  = new Entity_Kaiser(world);
					 EntityBossBase entityboss2  = new Entity_KaiserReverse(world);
				switch (this.rand.nextInt(25))
				{
				case 0:
					playerIn.sendMessage( new TextComponentString(TextFormatting.BLUE+"Gear Remocon! Funky! Remote Control Gear!"));
					entityboss.setLocationAndAngles(this.posX, this.posY, this.posZ, 0, 0.0F);
					world.spawnEntity(entityboss);
					break;
				case 1:
					playerIn.sendMessage( new TextComponentString(TextFormatting.RED+"Gear Engine! Funky! Engine Running Gear!"));
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
				this.dropItem(RiderItems.toki_meki_crisis_gashat, 1);
				break;
			case 2:
				this.dropItem(RiderItems.perfect_puzzle_gashat, 1);
				break;
			case 3:
				this.dropItem(RiderItems.knock_out_fighter_gashat, 1); 
				break;
			case 4:
				this.dropItem(RiderItems.dangerous_zombie_gashat, 1);
				break;
				}
			}
		}
	}
}	
