package com.kelco.kamenridercraft.Items.ex_aid;

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

public class GamerDriverItem extends RiderDriverItem{


	public GamerDriverItem (ArmorMaterial material, String rider,RegistryObject<Item> baseFormItem,RegistryObject<Item> head,RegistryObject<Item>torso,RegistryObject<Item> legs, Properties properties)
	{
		super(material, rider, baseFormItem, head, torso, legs, properties);
 
		Extra_Base_Form_Item= Lists.newArrayList((RiderFormChangeItem)Modded_item_core.BLANK_FORM.get(),(RiderFormChangeItem)Modded_item_core.BLANK_FORM.get());
		Num_Base_Form_Item=2;
	}

	@Override
	public String GET_TEXT(ItemStack itemstack, EquipmentSlot equipmentSlot, LivingEntity rider,String riderName)
	{
			if (equipmentSlot == EquipmentSlot.FEET) {
			String belt = ((RiderDriverItem)itemstack.getItem()).BELT_TEXT;
			if (((RiderDriverItem)itemstack.getItem()).BELT_TEXT==null) {
				belt = get_Form_Item(itemstack,1).getBeltTex();
			}
			return "belts/"+belt;
		}
		else if (equipmentSlot == EquipmentSlot.CHEST) return get_Form_Item(itemstack,2).getFormName(false);
		else return riderName+get_Form_Item(itemstack,1).getFormName(false);

	}



	public ResourceLocation getModelResource(ItemStack itemstack,RiderArmorItem animatable, EquipmentSlot slot, LivingEntity rider) {

		switch (slot) {
	
		case CHEST -> {
			if (get_Form_Item(itemstack, 2).HasWingsIfFlying() & !rider.onGround()){
				return new ResourceLocation(KamenRiderCraftCore.MODID, get_Form_Item(itemstack, 2).get_FlyingModel());
		 }else if (get_Form_Item(itemstack, 2).get_Model()=="geo/ichigo.geo.json") {
				return new ResourceLocation(KamenRiderCraftCore.MODID, "geo/bigger_rider_plusbelt.geo.json");
			 }else   
				 return new ResourceLocation(KamenRiderCraftCore.MODID, get_Form_Item(itemstack, 2).get_Model());
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
			if (get_Form_Item(itemstack, 2)!=Modded_item_core.BLANK_FORM.get()) {
				if (part =="head") return true;
				if (part =="body") return true;
				if (part =="rightArm") return true;
				if (part =="leftArm") return true;
				if (part =="leftLeg") return true;
				if (part =="rightLeg") return true;
			}
		}
		case LEGS -> {
		}
		default -> {}
		}
		return false;
	}

}