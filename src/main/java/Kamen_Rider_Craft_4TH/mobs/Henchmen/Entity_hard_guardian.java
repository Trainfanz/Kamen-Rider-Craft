package Kamen_Rider_Craft_4TH.mobs.Henchmen;


import java.util.Calendar;
import java.util.UUID;

import Kamen_Rider_Craft_4TH.RiderItems;
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
import net.minecraft.world.World;

public class Entity_hard_guardian extends Entity_base_henchmen
{
	public Entity_hard_guardian(World par1World)
	{
		super(par1World);
	}

	protected void applyEntityAttributes()
	{
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(17.0D);
		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(60.0D);	     
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
		if (!this.world.isRemote){

			this.dropItem(RiderItems.full_bottle, 2);
			switch (this.rand.nextInt(25))
			{
			case 0:
				this.dropItem(RiderItems.lost_bat_full_bottle, 1);
				break;
			case 1:
				this.dropItem(RiderItems.lost_cobra_full_bottle, 1);
				break;
			case 2:
				this.dropItem(RiderItems.lost_castle_full_bottle, 1);
				break;
			case 3:
				this.dropItem(RiderItems.lost_kuwagata_full_bottle, 1); 
				break;
			case 4:
				this.dropItem(RiderItems.lost_fukurou_full_bottle, 1);
				break;
			case 5:
				this.dropItem(RiderItems.lost_hammer_full_bottle, 1);
				break;
			case 6:
				this.dropItem(RiderItems.lost_shimauma_full_bottle, 1);
				break;
			case 7:
				this.dropItem(RiderItems.lost_spanner_full_bottle, 1);
				break;
			case 8:
				this.dropItem(RiderItems.lost_hasami_full_bottle, 1);
				break;
			case 9:
				this.dropItem(RiderItems.lost_cd_full_bottle, 1);
				break;    
			case 10:
				this.dropItem(RiderItems.dragon_evol_bottle_gold, 1);
				break;   
			}
		}
	}
}
