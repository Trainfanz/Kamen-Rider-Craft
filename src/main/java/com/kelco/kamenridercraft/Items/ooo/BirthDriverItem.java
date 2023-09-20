package com.kelco.kamenridercraft.Items.ooo;

import com.google.common.collect.Lists;
import com.kelco.kamenridercraft.KamenRiderCraftCore;
import com.kelco.kamenridercraft.Items.Modded_item_core;
import com.kelco.kamenridercraft.Items.OOO_Rider_Items;
import com.kelco.kamenridercraft.Items.rider_armor_base.RiderArmorItem;
import com.kelco.kamenridercraft.Items.rider_armor_base.RiderDriverItem;
import com.kelco.kamenridercraft.Items.rider_armor_base.RiderFormChangeItem;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.registries.RegistryObject;

public class BirthDriverItem extends RiderDriverItem{


	public BirthDriverItem (ArmorMaterial material, String rider,RegistryObject<Item> baseFormItem,RegistryObject<Item> head,RegistryObject<Item>torso,RegistryObject<Item> legs, Properties properties)
	{
		super(material, rider, baseFormItem, head, torso, legs, properties);
 
		Extra_Base_Form_Item= Lists.newArrayList((RiderFormChangeItem)Modded_item_core.BLANK_FORM.get(),(RiderFormChangeItem)Modded_item_core.BLANK_FORM.get(),(RiderFormChangeItem)Modded_item_core.BLANK_FORM.get(),(RiderFormChangeItem)Modded_item_core.BLANK_FORM.get(),(RiderFormChangeItem)Modded_item_core.BLANK_FORM.get(),(RiderFormChangeItem)Modded_item_core.BLANK_FORM.get(),(RiderFormChangeItem)Modded_item_core.BLANK_FORM.get());
		Num_Base_Form_Item=7;
	}

	@Override
	public String GET_TEXT(ItemStack itemstack, EquipmentSlot equipmentSlot, LivingEntity rider)
	{
			if (equipmentSlot == EquipmentSlot.FEET) {


			String belt = ((RiderDriverItem)itemstack.getItem()).BELT_TEXT;
			if (((RiderDriverItem)itemstack.getItem()).BELT_TEXT==null) {
				belt = get_Form_Item(itemstack,1).getBeltTex();
			}
			return "belts/"+belt;

		}

		else if (equipmentSlot == EquipmentSlot.CHEST) return "_claws_1";
		else if (equipmentSlot == EquipmentSlot.LEGS) return "_claws_2";
		else return get_Form_Item(itemstack,1).getFormName(false);

	}



	public ResourceLocation getModelResource(ItemStack itemstack,RiderArmorItem animatable, EquipmentSlot slot, LivingEntity rider) {

		switch (slot) {
		case HEAD ->{ 
			return new ResourceLocation(KamenRiderCraftCore.MODID, get_Form_Item(itemstack, 1).get_Model());
		}
		case CHEST -> {
			return new ResourceLocation(KamenRiderCraftCore.MODID, "geo/claws_1.geo.json");

		}
		case LEGS -> {
			if (get_Form_Item(itemstack, 3)==OOO_Rider_Items.BIRTH_CORE_CRANE_ARM.get()) 
				return new ResourceLocation(KamenRiderCraftCore.MODID, "geo/claws_2_crane.geo.json");
			else return new ResourceLocation(KamenRiderCraftCore.MODID, "geo/claws_2.geo.json");

		}
		default -> {}
		}

			return new ResourceLocation(KamenRiderCraftCore.MODID, get_Form_Item(itemstack, 1).get_Model());

	}

	@Override
	public  boolean getPartsForSlot(ItemStack itemstack,EquipmentSlot currentSlot,String  part) {

		switch (currentSlot) {
		case HEAD ->{ 
			if (part =="head") return true;
			if (part =="body") return true;
			if (part =="rightArm") return true;
			if (part =="leftArm") return true;
			if (part =="leftLeg") return true;
			if (part =="rightLeg") return true;
			
		}
		case CHEST -> {
			if (part =="body") return get_Form_Item(itemstack, 2)==OOO_Rider_Items.BIRTH_CORE_BREAST_CANNON.get();
			if (part =="rightArm") return get_Form_Item(itemstack, 3)==OOO_Rider_Items.BIRTH_CORE_CRANE_ARM.get();
			if (part =="leftArm") return get_Form_Item(itemstack, 4)==OOO_Rider_Items.BIRTH_CORE_SHOVEL_ARM.get();
			if (part =="leftLeg"||part =="rightLeg") return get_Form_Item(itemstack, 5)==OOO_Rider_Items.BIRTH_CORE_CATEPTLLAR_LEG.get();
		
		}
		case LEGS -> {
			if (part =="rightArm") return get_Form_Item(itemstack, 6)==OOO_Rider_Items.BIRTH_CORE_DRILL_ARM.get();
			if (part =="body") return get_Form_Item(itemstack, 7)==OOO_Rider_Items.BIRTH_CORE_CUTTER_WING.get();
		}
		default -> {}
		}
		return false;
	}

}