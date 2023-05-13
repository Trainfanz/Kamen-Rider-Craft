package Kamen_Rider_Craft_4TH.mobs.Henchmen;


import java.util.Calendar;
import java.util.UUID;

import Kamen_Rider_Craft_4TH.ReiwaRiderItems;
import Kamen_Rider_Craft_4TH.mobs.Boss.EntityBossBase;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_Calibur;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_Falchion;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_Para_dx;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_Red_Poppy;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_genm;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_legeiel;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_storious;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_zooous;
import Kamen_Rider_Craft_4TH.mobs.Boss.entity_desast;
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

public class EntityShimi extends Entity_base_henchmen
{
	public EntityShimi(World par1World)
	{
		super(par1World);	
	}

	/**
	 * Returns the item that this EntityLiving is holding, if any.
	 */
	@Override
	public ItemStack getHeldItemMainhand()
	{
		return new ItemStack(ReiwaRiderItems.shimi_lot);
	}

	public void onDeath(DamageSource cause)
	{
		if (!this.world.isRemote){

			if (this.getAttackTarget()instanceof EntityPlayer){
				EntityPlayer playerIn=	(EntityPlayer) this.getAttackTarget();
				 EntityBossBase entityboss  = new Entity_Calibur(world);
				 EntityBossBase entityboss2  = new Entity_legeiel(world);
				 EntityBossBase entityboss3  = new Entity_storious(world);
				 EntityBossBase entityboss4  = new Entity_zooous(world);
				 EntityBossBase entityboss5  = new entity_desast(world);
				 
			switch (this.rand.nextInt(20))
			{
			case 0:
				playerIn.sendMessage( new TextComponentString(TextFormatting.DARK_PURPLE+"Jaaku Dragon!"));
				entityboss.setLocationAndAngles(this.posX, this.posY, this.posZ, 0, 0.0F);
				world.spawnEntity(entityboss);
				break;
			case 1:
				playerIn.sendMessage( new TextComponentString(TextFormatting.DARK_RED+"Legeiel!"));
				entityboss2.setLocationAndAngles(this.posX, this.posY, this.posZ, 0, 0.0F);
				world.spawnEntity(entityboss2);
				break;

			case 2:
				playerIn.sendMessage( new TextComponentString(TextFormatting.DARK_GREEN+"Storious!"));
				entityboss3.setLocationAndAngles(this.posX, this.posY, this.posZ, 0, 0.0F);
				world.spawnEntity(entityboss3);
				break;

			case 3:
				playerIn.sendMessage( new TextComponentString(TextFormatting.DARK_BLUE+"Zooous!"));
				entityboss4.setLocationAndAngles(this.posX, this.posY, this.posZ, 0, 0.0F);
				world.spawnEntity(entityboss4);
				break;
				
			case 4:
				playerIn.sendMessage( new TextComponentString(TextFormatting.DARK_RED+"Desast!"));
				entityboss5.setLocationAndAngles(this.posX, this.posY, this.posZ, 0, 0.0F);
				world.spawnEntity(entityboss5);
				break;
			}
			}
			
			this.dropItem(ReiwaRiderItems.blank_wonder_ride_book, 1);
			switch (this.rand.nextInt(20))
			{
			case 0:
				this.dropItem(ReiwaRiderItems.brave_dragon_wonderride_book, 1);
				break;
			case 1:
				this.dropItem(ReiwaRiderItems.lion_senki_wonderride_book, 1);
				break;
			case 2:
				this.dropItem(ReiwaRiderItems.lamp_do_alngina_wonderride_book, 1);
				break;
			case 3:
				this.dropItem(ReiwaRiderItems.jackun_to_domamenoki_wonderride_book, 1); 
				break;
			case 4:
				this.dropItem(ReiwaRiderItems.book_gate_wonder_ride_book, 1); 
				break;
			}
			
			
			
		}
	}	
}
