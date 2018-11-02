package Kamen_Rider_Craft_4TH.item.agito;

import javax.annotation.Nullable;

import Kamen_Rider_Craft_4TH.item.Item_driver;
import org.lwjgl.opengl.GL11;

import Kamen_Rider_Craft_4TH.RiderItems;
import Kamen_Rider_Craft_4TH.TokuCraft_core;
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

public class item_agitodriver extends Item_driver {
	private static final int[] maxDamageArray = new int[] {11, 16, 15, 13};
	public String armorNamePrefix;
	public ArmorMaterial material;

	public String Rider;

	public item_agitodriver (String name,ArmorMaterial par2EnumArmorMaterial, int par3, String rider)
	{
		super(par2EnumArmorMaterial, par3, RiderItems.agitohead, RiderItems.agitotroso, RiderItems.agitolegs);
		this.material = par2EnumArmorMaterial;
		this.setMaxDamage(par2EnumArmorMaterial.getDurability(EntityEquipmentSlot.FEET));
		this.maxStackSize = 1;
		Rider=rider;
		setUnlocalizedName(name);
		setRegistryName(name);
		TokuCraft_core.ITEMS.add(this);
	}


	@Override
	@SideOnly(Side.CLIENT)
	@Nullable
	public ModelBiped getArmorModel(EntityLivingBase living, ItemStack stack, EntityEquipmentSlot slot, ModelBiped defaultModel) {
		if(!stack.isEmpty()) {
			if(stack.getItem() instanceof ItemArmor) {
				model_belt armorModel = new model_belt();
				int core = get_core(stack);

				switch (this.Rider) {
					case "agito":
						switch (core) {
							case 1: armorModel.belt = new ItemStack(RiderItems.alter_ring_st);
							case 2: armorModel.belt = new ItemStack(RiderItems.alter_ring_fl);
							case 4: armorModel.belt = new ItemStack(RiderItems.alter_ring_shining);
							case 5: armorModel.belt = new ItemStack(RiderItems.alter_ring_shining);
							default: armorModel.belt = stack;
						}
						break;
					case "gills":
						switch (core) {
							case 1: armorModel.belt = new ItemStack(RiderItems.meta_factor_exceed);
							default: armorModel.belt = stack;
						}
						break;
					default:
						armorModel.belt = stack;
						break;
				}

				//armorModel.bipedRightLeg.showModel = slot == EntityEquipmentSlot.FEET;
				//armorModel.bipedLeftLeg.showModel = slot == EntityEquipmentSlot.FEET;

				armorModel.isSneak = defaultModel.isSneak;
				armorModel.isRiding = defaultModel.isRiding;
				armorModel.isChild = defaultModel.isChild;

				armorModel.rightArmPose = defaultModel.rightArmPose;
				armorModel.leftArmPose = defaultModel.leftArmPose;

				return armorModel;
			}
		}
		return null;
	}

	@Override
	public void process(EntityPlayer player, Item feet, int core) {
		if (feet == RiderItems.alter_ring) {
			switch (core) {
				case 0:
					player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 0, true, false));
					player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 0, true, false));
					break;
				case 1:
					player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 1, true, false));
					player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 5, 0, true, false));
					break;
				case 2:
					player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 0, true, false));
					player.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE, 5, 0, true, false));
					break;
				case 3:
					player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 1, true, false));
					player.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE, 5, 0, true, false));
					player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 0, true, false));
					player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 5, 0, true, false));
					break;
				case 4:
					player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 1, true, false));
					player.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE, 5, 0, true, false));
					player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 2, true, false));
					player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 5, 2, true, false));
					player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 2, true, false));
					break;
				case 5:
					player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 3, true, false));
					player.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE, 5, 0, true, false));
					player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 4, true, false));
					player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 5, 3, true, false));
					player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 3, true, false));
					break;
			}
		} else if (feet == RiderItems.meta_factor) {
			switch (core) {
				case 0:
					player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 1, true, false));
					player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 0, true, false));
					player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 5, 0, true, false));
					break;
				case 1:
					player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 3, true, false));
					player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 2, true, false));
					player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 5, 3, true, false));
					player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 1, true, false));
					break;
			}
		} else if (feet == RiderItems.ank_point) {
			player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 1, true, false));
			player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 1, true, false));
			player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 5, 3, true, false));
		} else if (feet == RiderItems.ank_point_burning) {
			player.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE, 5, 0, true, false));
			player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 4, true, false));
			player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 5, 5, true, false));
			player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 4, true, false));
		} else if (feet == RiderItems.alter_ring_miracle) {
			player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 4, true, false));
			player.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE, 5, 0, true, false));
			player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 4, true, false));
			player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 5, 2, true, false));
			player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 4, true, false));
		} else if (feet == RiderItems.g1_belt) {
			switch (core) {
				case 0:
					player.addPotionEffect(new PotionEffect(MobEffects.WEAKNESS, 5, 0, true, false));
					break;
			}
		} else if (feet == RiderItems.g3_mild_belt) {
			switch (core) {
				case 0:
					player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 0, true, false));
					break;
			}
		} else if (feet == RiderItems.g3_belt) {
			switch (core) {
				case 0:
					player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 0, true, false));
					player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 0, true, false));
					player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 0, true, false));
					break;
			}
		} else if (feet == RiderItems.g3_x_belt) {
			switch (core) {
				case 0:
					player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 1, true, false));
					player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 2, true, false));
					player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 0, true, false));
					break;
			}
		} else if (feet == RiderItems.g4_belt) {
			switch (core) {
				case 0:
					player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 2, true, false));
					player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 1, true, false));
					player.addPotionEffect(new PotionEffect(MobEffects.POISON, 5, 0, true, false));
					break;
			}
		}
		if (feet == RiderItems.g4_x_belt) {
			switch (core) {
				case 0:
					player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 1, true, false));
					player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 2, true, false));
					player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 0, true, false));
					break;
			}
		}
	}
}