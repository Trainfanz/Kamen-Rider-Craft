package Kamen_Rider_Craft_4TH.mobs.Henchmen;


import java.util.Calendar;
import java.util.Random;
import java.util.UUID;

import Kamen_Rider_Craft_4TH.RiderItems;
import Kamen_Rider_Craft_4TH.mobs.Boss.EntityBossBase;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_EngineBros;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_Kaiser;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_KaiserReverse;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_Para_dx;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_Red_Poppy;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_RemoconBros;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_jin;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_magia;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_naki;
import Kamen_Rider_Craft_4TH.mobs.Boss.entity_abaddon_high;
import Kamen_Rider_Craft_4TH.mobs.Boss.entity_blood;
import Kamen_Rider_Craft_4TH.mobs.Boss.entity_dire_wolf_sold_magia;
import Kamen_Rider_Craft_4TH.mobs.Boss.entity_eden;
import Kamen_Rider_Craft_4TH.mobs.Boss.entity_killbus;
import Kamen_Rider_Craft_4TH.mobs.Boss.entity_metal_build;
import Kamen_Rider_Craft_4TH.mobs.Boss.entity_raider;
import Kamen_Rider_Craft_4TH.mobs.Boss.entity_serval_tiger_sold_magia;
import Kamen_Rider_Craft_4TH.mobs.Boss.entity_zaia;
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

public class entity_battle_raider extends Entity_base_henchmen
{
	public entity_battle_raider(World par1World)
	{
		super(par1World);
		
		this.setItemStackToSlot(EntityEquipmentSlot.CHEST,new ItemStack(RiderItems.zero_onetroso));
		this.setItemStackToSlot(EntityEquipmentSlot.HEAD,new ItemStack(RiderItems.zero_onehead));
		this.setItemStackToSlot(EntityEquipmentSlot.FEET,new ItemStack(RiderItems.raidriser_battle));
		this.setItemStackToSlot(EntityEquipmentSlot.LEGS,new ItemStack(RiderItems.zero_onelegs));
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
			this.dropItem(RiderItems.humagear_progrise_key, 1);
	   		this.dropItem(RiderItems.hiden_metal, 2);

	   		switch (this.rand.nextInt(5))
			{
			case 0:
				this.dropItem(this.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem(), 1);
				break;
			}
	   		
	   		switch (this.rand.nextInt(10))
			{
			case 0:
				this.dropItem(RiderItems.invading_horseshoe_crab_progrise_key, 1);
				break;
			}

			if (!this.world.isRemote){

				if (this.getAttackTarget()instanceof EntityPlayer){
					EntityPlayer playerIn=	(EntityPlayer) this.getAttackTarget();
					EntityBossBase entityboss  = new entity_raider(world);

					EntityBossBase entity_naki  = new Entity_naki(world);

					EntityBossBase entity_zaia  = new entity_zaia(world);
					EntityBossBase entity_wolf  = new entity_dire_wolf_sold_magia(world);
					EntityBossBase entity_tiger  = new entity_serval_tiger_sold_magia(world);
					
					switch (this.rand.nextInt(25))
					{
					case 0:
						playerIn.sendMessage( new TextComponentString(TextFormatting.DARK_RED+"RaidRise!"));
						entityboss.setLocationAndAngles(this.posX, this.posY, this.posZ, 0, 0.0F);
						world.spawnEntity(entityboss);
						break;
					case 1:
						playerIn.sendMessage( new TextComponentString(TextFormatting.DARK_RED+"RaidRise!"));
						entityboss.setLocationAndAngles(this.posX, this.posY, this.posZ, 0, 0.0F);
						world.spawnEntity(entityboss);
						break;
					case 2:
						playerIn.sendMessage( new TextComponentString(TextFormatting.DARK_RED+"RaidRise!"));
						entityboss.setLocationAndAngles(this.posX, this.posY, this.posZ, 0, 0.0F);
						world.spawnEntity(entityboss);
						break;
					case 3:
						playerIn.sendMessage( new TextComponentString(TextFormatting.WHITE+"Forcerise! Japanese Wolf! Break down."));
						entity_naki.setLocationAndAngles(this.posX, this.posY, this.posZ, 0, 0.0F);
						world.spawnEntity(entity_naki);
						break;
					case 4:
						playerIn.sendMessage( new TextComponentString(TextFormatting.RED+"PerfectRise! When the five weapons cross!"));
						playerIn.sendMessage( new TextComponentString(TextFormatting.RED+"The jet-black Soldier ZAIA is born!"));
						playerIn.sendMessage( new TextComponentString(TextFormatting.RED+"I AM THE PRESIDENT!"));
						entity_zaia.setLocationAndAngles(this.posX, this.posY, this.posZ, 0, 0.0F);
						world.spawnEntity(entity_zaia);
						break;
					case 5:
						playerIn.sendMessage( new TextComponentString(TextFormatting.BLUE+"Dire Wolf!"));
						entity_wolf.setLocationAndAngles(this.posX, this.posY, this.posZ, 0, 0.0F);
						world.spawnEntity(entity_wolf);
						break;
					case 6:
						playerIn.sendMessage( new TextComponentString(TextFormatting.GOLD+"Serval Tiger!"));
						entity_tiger.setLocationAndAngles(this.posX, this.posY, this.posZ, 0, 0.0F);
						world.spawnEntity(entity_tiger);
						break;
					}
				}
			}
		}
	}
}	
