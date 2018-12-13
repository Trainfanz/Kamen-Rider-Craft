package Kamen_Rider_Craft_4TH.item.agito;

import javax.annotation.Nullable;

import org.lwjgl.opengl.GL11;

import Kamen_Rider_Craft_4TH.RiderItems;
import Kamen_Rider_Craft_4TH.TokuCraft_core;
import Kamen_Rider_Craft_4TH.item.rider_armor_base.Item_form_change;
import Kamen_Rider_Craft_4TH.item.rider_armor_base.item_rider_driver;
import Kamen_Rider_Craft_4TH.model.model_belt;
import Kamen_Rider_Craft_4TH.util.IHasModel;
import Kamen_Rider_Craft_4TH.util.Refercence;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

public class item_agitodriver extends item_rider_driver implements IHasModel
{

	private static final int[] maxDamageArray = new int[] {11, 16, 15, 13};
	public String armorNamePrefix;
	public ArmorMaterial material;

	public String Rider;

	public item_agitodriver (String name,ArmorMaterial par2EnumArmorMaterial, int par3, String rider,Item_form_change baseFormItem)
	{
		super(name,par2EnumArmorMaterial,par3,rider,baseFormItem,RiderItems.agitohead,RiderItems.agitotroso,RiderItems.agitolegs);
	}


/**	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack armor) {


		if (player.getItemStackFromSlot(EntityEquipmentSlot.HEAD)!= null){
			if (player.getItemStackFromSlot(EntityEquipmentSlot.CHEST)!= null){
				if (player.getItemStackFromSlot(EntityEquipmentSlot.LEGS)!= null){
					if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET)!= null){
						if (player.getItemStackFromSlot(EntityEquipmentSlot.LEGS).getItem() == RiderItems.agitolegs){
							if (player.getItemStackFromSlot(EntityEquipmentSlot.CHEST).getItem() == RiderItems.agitotroso){
								if (player.getItemStackFromSlot(EntityEquipmentSlot.HEAD).getItem() == RiderItems.agitohead){

									if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.alter_ring){

										if (this.get_core(armor)==0){
											player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 0,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 0,true,false));
										}else if (this.get_core(armor)==1){
											player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 1,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 5, 0,true,false));
										}else if (this.get_core(armor)==2){
											player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 0,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE, 5, 0,true,false));
										}else if (this.get_core(armor)==3){
											player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 1,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE, 5, 0,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 0,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 5, 0,true,false));
										}else if (this.get_core(armor)==4){
											player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 1,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE, 5, 0,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 2,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 5, 2,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 2,true,false));
										}else if (this.get_core(armor)==5){
											player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 3,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE, 5, 0,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 4,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 5, 3,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 3,true,false));
										}

									}else if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.meta_factor){
										if (this.get_core(armor)==0){
											player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 1,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 0,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 5, 0,true,false));
										}else if (this.get_core(armor)==1){
											player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 3,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 2,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 5, 3,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 1,true,false));
										}
									}else if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.ank_point){
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 1,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 1,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 5, 3,true,false));

									}else if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.ank_point_burning){
										player.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE, 5, 0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 4,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 5, 5,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 4,true,false));;

									}else if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.alter_ring_miracle){

										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 4,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE, 5, 0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 4,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 5, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 4,true,false));;

									}
								}
								if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.g1_belt){

									if (this.get_core(armor)==0){
										player.addPotionEffect(new PotionEffect(MobEffects.WEAKNESS, 5, 0,true,false));
									}
								}
								if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.g3_mild_belt){

									if (this.get_core(armor)==0){
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 0,true,false));
									}
								}
								if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.g3_belt){

									if (this.get_core(armor)==0){
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 0,true,false));
									}
								}
								if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.g3_x_belt){

									if (this.get_core(armor)==0){
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 1,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 0,true,false));
									}
								}
								if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.g4_belt){

									if (this.get_core(armor)==0){
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 1,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.POISON, 5, 0,true,false));
									}
								}
								if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.g4_x_belt){

									if (this.get_core(armor)==0){
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 1,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 0,true,false));
									}
								}
							}	
						}
					}
				}	
			}
		}	
	}
	**/
}