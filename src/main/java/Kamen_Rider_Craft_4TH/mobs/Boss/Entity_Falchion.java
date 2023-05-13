package Kamen_Rider_Craft_4TH.mobs.Boss;


import java.util.Calendar;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.UUID;

import javax.annotation.Nullable;

import com.google.common.collect.Sets;

import Kamen_Rider_Craft_4TH.ReiwaRiderItems;
import Kamen_Rider_Craft_4TH.item.saber.item_saberdriver;
import Kamen_Rider_Craft_4TH.item.zero_one.item_zero_onedriver;
import Kamen_Rider_Craft_4TH.item.zi_o.item_zikudriver;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.IEntityLivingData;
import net.minecraft.entity.IRangedAttackMob;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackMelee;
import net.minecraft.entity.ai.EntityAIAttackRangedBow;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.ai.EntityAIBreakDoor;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMoveThroughVillage;
import net.minecraft.entity.ai.EntityAIMoveTowardsRestriction;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWanderAvoidWater;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.ai.EntityAIZombieAttack;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.ai.attributes.IAttributeInstance;
import net.minecraft.entity.ai.attributes.RangedAttribute;
import net.minecraft.entity.monster.AbstractSkeleton;
import net.minecraft.entity.monster.EntityBlaze;
import net.minecraft.entity.monster.EntityEnderman;
import net.minecraft.entity.monster.EntityEndermite;
import net.minecraft.entity.monster.EntityIronGolem;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.monster.EntityPigZombie;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.entity.projectile.EntitySmallFireball;
import net.minecraft.entity.projectile.EntityWitherSkull;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.init.MobEffects;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArrow;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.pathfinding.PathNavigateGround;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EntityDamageSource;
import net.minecraft.util.EntityDamageSourceIndirect;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.EnumDifficulty;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class Entity_Falchion extends EntityBossBase
{

	private String texture;
	public Entity_Falchion(World par1World)
	{
		super(par1World);
		this.setItemStackToSlot(EntityEquipmentSlot.CHEST,new ItemStack(ReiwaRiderItems.sabertroso));
		this.setItemStackToSlot(EntityEquipmentSlot.HEAD,new ItemStack(ReiwaRiderItems.saberhead));
		this.setItemStackToSlot(EntityEquipmentSlot.FEET,new ItemStack(ReiwaRiderItems.seiken_swordriver_falchion));
		this.setItemStackToSlot(EntityEquipmentSlot.LEGS,new ItemStack(ReiwaRiderItems.saberlegs));


	}

	protected void applyEntityAttributes()
	{
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(70.0D);
		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.2D);
		this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(2.0D);
		this.getEntityAttribute(SharedMonsterAttributes.FOLLOW_RANGE).setBaseValue(128.0D);
	}


	@Override
	public ItemStack getHeldItemMainhand()
	{
		return new ItemStack(ReiwaRiderItems.mumeiken_kyomu);
	}

	public void onEntityUpdate(){
		super.onEntityUpdate();
		if (this.getAttackTarget()instanceof EntityPlayer){
			EntityPlayer playerIn=	(EntityPlayer) this.getAttackTarget();

			if (!playerIn.inventory.hasItemStack(new ItemStack(ReiwaRiderItems.emotional_dragon_wonder_ride_book))) {
				this.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 3,true,false));
			}
			if (playerIn.inventory.hasItemStack(new ItemStack(ReiwaRiderItems.wonder_world_story_of_raimeiken_ikazuchi_wonderride_book))) {
				if (item_saberdriver.get_core_for_forms(this.getItemStackFromSlot(EntityEquipmentSlot.FEET), "f")!=16) {
					playerIn.sendMessage( new TextComponentString(TextFormatting.GOLD+"Battou!"));
					playerIn.sendMessage( new TextComponentString(TextFormatting.BLACK+"Eternal Power!"));
					playerIn.sendMessage( new TextComponentString(TextFormatting.WHITE+"Kyomu! Shinjuu no hono de subete ga mu ni kisu!"));
					if (!this.world.isRemote){
				
							
						}
				
					this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.4);
					this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(12.0D);

					item_zero_onedriver.set_core(this.getItemStackFromSlot(EntityEquipmentSlot.FEET),16, "f");		
				}	
			}



			if (this.getHealth()<60) {

				if (playerIn.inventory.hasItemStack(new ItemStack(ReiwaRiderItems.brave_dragon_wonderride_book))&!playerIn.inventory.hasItemStack(new ItemStack(ReiwaRiderItems.emotional_dragon_wonder_ride_book))){
					playerIn.inventory.addItemStackToInventory(new ItemStack(ReiwaRiderItems.emotional_dragon_wonder_ride_book));
					playerIn.sendMessage( new TextComponentString(TextFormatting.DARK_RED+"Emotional Dragon!"));
				}
				
				if (playerIn.inventory.hasItemStack(new ItemStack(ReiwaRiderItems.lamp_do_alngina_wonderride_book))){
					if (playerIn.inventory.hasItemStack(new ItemStack(ReiwaRiderItems.wonder_world_story_of_raimeiken_ikazuchi_wonderride_book))) {
					playerIn.sendMessage( new TextComponentString(TextFormatting.GOLD+"Arabiana Night!"));
					playerIn.inventory.addItemStackToInventory(new ItemStack(ReiwaRiderItems.arabiana_night_wonderride_book));
					playerIn.inventory.clearMatchingItems(ReiwaRiderItems.wonder_world_story_of_raimeiken_ikazuchi_wonderride_book, -1, 1, null);
					playerIn.inventory.clearMatchingItems(ReiwaRiderItems.lamp_do_alngina_wonderride_book, -1, 1, null);
					}
				}
				
				this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.3);
				this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(7.0D);
			}
		}
	}



	public EnumCreatureAttribute getCreatureAttribute()
	{
		return EnumCreatureAttribute.UNDEAD;
	}

	protected boolean shouldBurnInDay()
	{
		return false;
	}
	public void onDeath(DamageSource cause)
	{
		if (!this.world.isRemote){

			this.dropItem(ReiwaRiderItems.eternal_phoenix_wonderride_book, 1);
			this.dropItem(ReiwaRiderItems.seiken_swordriver_falchion, 1);
			this.dropItem(ReiwaRiderItems.mumeiken_kyomu, 1);
			this.dropItem(ReiwaRiderItems.blank_wonder_world_story_wonder_ride_book, 1);
			this.dropItem(ReiwaRiderItems.blank_wonder_ride_book, 10);
			

			if (this.getAttackTarget()instanceof EntityPlayer){
				EntityPlayer playerIn=	(EntityPlayer) this.getAttackTarget();
				if (playerIn.inventory.hasItemStack(new ItemStack(ReiwaRiderItems.arabiana_night_wonderride_book))){
					this.dropItem(ReiwaRiderItems.amazing_siren_wonderride_book, 1);
				}
						
				if (playerIn.inventory.hasItemStack(new ItemStack(ReiwaRiderItems.ankokuken_kurayami))&
						playerIn.inventory.hasItemStack(new ItemStack(ReiwaRiderItems.dogouken_gekido))&
						playerIn.inventory.hasItemStack(new ItemStack(ReiwaRiderItems.eneiken_noroshi))&
						playerIn.inventory.hasItemStack(new ItemStack(ReiwaRiderItems.fuusouken_hayate_ittouryu))&
						playerIn.inventory.hasItemStack(new ItemStack(ReiwaRiderItems.jikokuken_kaiji))&
						playerIn.inventory.hasItemStack(new ItemStack(ReiwaRiderItems.kaenken_rekka))&
						playerIn.inventory.hasItemStack(new ItemStack(ReiwaRiderItems.kougouken_saikou))&
						playerIn.inventory.hasItemStack(new ItemStack(ReiwaRiderItems.onjuuken_suzune))&
						playerIn.inventory.hasItemStack(new ItemStack(ReiwaRiderItems.raimeiken_ikazuchi))&
						playerIn.inventory.hasItemStack(new ItemStack(ReiwaRiderItems.suiseiken_nagare))&
						!playerIn.inventory.hasItemStack(new ItemStack(ReiwaRiderItems.haouken_xross_saber))){

					playerIn.inventory.addItemStackToInventory(new ItemStack(ReiwaRiderItems.haouken_xross_saber));
					playerIn.sendMessage( new TextComponentString(TextFormatting.BLUE+"Haouken Xross Saber!"));
				}
			}
		}
	}
}
