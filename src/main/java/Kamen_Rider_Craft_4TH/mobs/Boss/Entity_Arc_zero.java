package Kamen_Rider_Craft_4TH.mobs.Boss;


import java.util.Calendar;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.UUID;

import javax.annotation.Nullable;

import com.google.common.collect.Sets;

import Kamen_Rider_Craft_4TH.RiderItems;
import Kamen_Rider_Craft_4TH.item.zero_one.item_zero_onedriver;
import Kamen_Rider_Craft_4TH.item.zi_o.item_zikudriver;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIBase;
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
import net.minecraft.entity.ai.attributes.IAttributeInstance;
import net.minecraft.entity.ai.attributes.RangedAttribute;
import net.minecraft.entity.monster.EntityEnderman;
import net.minecraft.entity.monster.EntityEndermite;
import net.minecraft.entity.monster.EntityIronGolem;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.monster.EntityPigZombie;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.pathfinding.PathNavigateGround;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EntityDamageSource;
import net.minecraft.util.EntityDamageSourceIndirect;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.World;

public class Entity_Arc_zero extends EntityBossBase
//implements IBossDisplayData
{
    
	private String texture;
	public Entity_Arc_zero(World par1World)
	{
		super(par1World);
		this.setItemStackToSlot(EntityEquipmentSlot.CHEST,new ItemStack(RiderItems.zero_onetroso));
		this.setItemStackToSlot(EntityEquipmentSlot.HEAD,new ItemStack(RiderItems.zero_onehead));
		this.setItemStackToSlot(EntityEquipmentSlot.FEET,new ItemStack(RiderItems.ark_driver_zero));
		this.setItemStackToSlot(EntityEquipmentSlot.LEGS,new ItemStack(RiderItems.zero_onelegs));
		
	}
    
	public void onEntityUpdate(){
		super.onEntityUpdate();
		
		if (this.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem()==RiderItems.ark_driver_zero){
			if (this.getHealth()<100&item_zero_onedriver.get_core(this.getItemStackFromSlot(EntityEquipmentSlot.FEET), "1")!=6) {
				if (this.getAttackTarget()instanceof EntityPlayer){
				EntityPlayer playerIn=	(EntityPlayer) this.getAttackTarget();
				playerIn.sendMessage( new TextComponentString(TextFormatting.DARK_RED+"Singurize!"));
				}
				 this.world.spawnParticle(EnumParticleTypes.SMOKE_LARGE, this.posX + (this.rand.nextDouble() - 0.5D) * (double)this.width, this.posY + this.rand.nextDouble() * (double)this.height, this.posZ + (this.rand.nextDouble() +2) * (double)this.width, 0.0D, 0.0D, 0.0D);
				 this.world.spawnParticle(EnumParticleTypes.SMOKE_LARGE, this.posX + (this.rand.nextDouble() - 0.5D) * (double)this.width, this.posY + this.rand.nextDouble() * (double)this.height, this.posZ + (this.rand.nextDouble() +2) * (double)this.width, 0.0D, 0.0D, 0.0D);
		          
			item_zero_onedriver.set_core(this.getItemStackFromSlot(EntityEquipmentSlot.FEET),6, "1");			
			}
				
			
		switch (this.rand.nextInt(200))
		{
		case 0:
			this.setItemStackToSlot(EntityEquipmentSlot.MAINHAND,new ItemStack(RiderItems.attache_shotgun));
			break;
		case 1:
			this.setItemStackToSlot(EntityEquipmentSlot.MAINHAND,new ItemStack(RiderItems.shot_riser_gun));
			break;
		case 2:
			this.setItemStackToSlot(EntityEquipmentSlot.MAINHAND,new ItemStack(RiderItems.thousand_jacker));
			break;
		
		case 3|4|5|6|7:
			this.setItemStackToSlot(EntityEquipmentSlot.MAINHAND,new ItemStack(RiderItems.attache_arrow));
			break;
		}
		}
	}
    protected void applyEntityAttributes()
    {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(200.0D);
        this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.30000001192092896D);
        this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(10.0D);
        this.getEntityAttribute(SharedMonsterAttributes.FOLLOW_RANGE).setBaseValue(128.0D);
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

   		this.dropItem(RiderItems.ark_driver_zero, 1);
   		this.dropItem(RiderItems.ark_one_progrise_key, 1);
   		this.dropItem(RiderItems.blank_progrise_key, 10);
		this.dropItem(RiderItems.hiden_metal, 20);
		
   		
       }
       
   }


}
    