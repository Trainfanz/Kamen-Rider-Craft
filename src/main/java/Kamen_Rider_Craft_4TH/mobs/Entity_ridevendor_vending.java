package Kamen_Rider_Craft_4TH.mobs;


import java.util.Calendar;
import java.util.Random;
import java.util.UUID;

import Kamen_Rider_Craft_4TH.RiderItems;
import Kamen_Rider_Craft_4TH.mobs.bikes.EntityBikeBase;
import Kamen_Rider_Craft_4TH.mobs.bikes.EntityRidevendor;
import Kamen_Rider_Craft_4TH.mobs.bikes.EntityToridevendor;
import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
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
import net.minecraft.entity.passive.AbstractHorse;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.passive.EntityDonkey;
import net.minecraft.entity.passive.EntityHorse;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.entity.passive.HorseArmorType;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.pathfinding.PathNavigateGround;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumHand;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;

public class Entity_ridevendor_vending extends EntityBikeBase
{



	private String texture;
	public Entity_ridevendor_vending(World par1World)
	{
		super(par1World);

		this.setSize(1F, 2.5F);
	}

	private Item get_candroid_Drop() {
		Random generator = new Random();
		int rand = generator.nextInt(9);
		Item[] birth_core = new Item[] {RiderItems.taka_candroid,RiderItems.tora_candroid,RiderItems.batta_candroid,RiderItems.denkiunagi_candroid
				,RiderItems.kujaku_candroid,RiderItems.gorilla_candroid,RiderItems.ptera_candroid,RiderItems.tako_candroid,RiderItems.torikera_candroid};
		return birth_core[rand];
	}

	@Override 
	public boolean processInteract(EntityPlayer player, EnumHand hand)
	{
		ItemStack itemstack = player.getHeldItem(hand);
		if (!this.world.isRemote && !this.isDead)
		{
			if(itemstack.getItem()== RiderItems.cellmedal){

					player.dropItem(get_candroid_Drop(), 1);
					if (!player.capabilities.isCreativeMode){
						player.getHeldItem(hand).shrink(1);
					}
					return true;


				} else if(player.isSneaking()){
				EntityRidevendor entity = new EntityRidevendor(this.world);
				entity.setLocationAndAngles(this.posX, this.posY, this.posZ, this.rotationYaw, this.rotationPitch);

				if (this.hasCustomName())
				{
					entity.setCustomNameTag(this.getCustomNameTag());
					entity.setAlwaysRenderNameTag(this.getAlwaysRenderNameTag());
				}
				this.setDead();
				this.world.spawnEntity(entity);
				return true;
			}   
			
		}
		return true;
	}

	public void onDeath(DamageSource cause)
	{
		if (!this.world.isRemote){

			this.dropItem(RiderItems.ride_vendor, 1);


		}

	}
}
