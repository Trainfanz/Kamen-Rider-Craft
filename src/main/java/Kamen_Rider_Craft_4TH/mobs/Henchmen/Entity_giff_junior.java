package Kamen_Rider_Craft_4TH.mobs.Henchmen;


import java.util.Calendar;
import java.util.UUID;

import Kamen_Rider_Craft_4TH.ReiwaRiderItems;
import Kamen_Rider_Craft_4TH.mobs.Boss.EntityBossBase;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_Calibur;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_Evil;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_Falchion;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_Para_dx;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_Red_Poppy;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_daiouika_deadman;
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

public class Entity_giff_junior extends Entity_base_henchmen
{
	public Entity_giff_junior(World par1World)
	{
		super(par1World);	
	}

	/**
	 * Returns the item that this EntityLiving is holding, if any.
	 */
	@Override
	public ItemStack getHeldItemMainhand()
	{
		return new ItemStack(ReiwaRiderItems.giff_junior_sword);
	}

	public void onDeath(DamageSource cause)
	{
		if (!this.world.isRemote){

			if (this.getAttackTarget()instanceof EntityPlayer){
				EntityPlayer playerIn=	(EntityPlayer) this.getAttackTarget();
				 EntityBossBase entityboss  = new Entity_Evil(world);
				 EntityBossBase entityboss2  = new Entity_daiouika_deadman(world);
			switch (this.rand.nextInt(20))
			{
			case 0:
				playerIn.sendMessage( new TextComponentString(TextFormatting.AQUA+"Versus Up! Madness! Hopeless! Darkness! Bat! Hehe! Kamen Rider Evil! Yeah-haha!"));
				entityboss.setLocationAndAngles(this.posX, this.posY, this.posZ, 0, 0.0F);
				world.spawnEntity(entityboss);
				break;
			case 1:
				playerIn.sendMessage( new TextComponentString(TextFormatting.LIGHT_PURPLE+"Daiouika!"));
				entityboss2.setLocationAndAngles(this.posX, this.posY, this.posZ, 0, 0.0F);
				world.spawnEntity(entityboss2);
				break;
			}
			}
			
			this.dropItem(ReiwaRiderItems.proto_vistamp, 1);
			switch (this.rand.nextInt(20))
			{
			case 0:
				this.dropItem(ReiwaRiderItems.rex_vistamp, 1);
				break;
			case 1:
				this.dropItem(ReiwaRiderItems.rex_vistamp_metal, 1);
				break;
			case 2:
				this.dropItem(ReiwaRiderItems.megalodon_vistamp, 1);
				break;
			case 3:
				this.dropItem(ReiwaRiderItems.eagle_vistamp, 1); 
				break;
			case 4:
				this.dropItem(ReiwaRiderItems.giff_junior_vistamp, 1); 
				break;
			}
			
			
			
		}
	}	
}
