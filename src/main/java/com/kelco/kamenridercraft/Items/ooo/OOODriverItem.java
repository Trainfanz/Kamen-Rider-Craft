package com.kelco.kamenridercraft.Items.ooo;

import com.kelco.kamenridercraft.KamenRiderCraftCore;
import com.kelco.kamenridercraft.Items.OOO_Rider_Items;
import com.kelco.kamenridercraft.Items.rider_armor_base.RiderArmorItem;
import com.kelco.kamenridercraft.Items.rider_armor_base.RiderDriverItem;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.registries.RegistryObject;

public class OOODriverItem extends RiderDriverItem{


	public OOODriverItem (ArmorMaterial material, String rider,RegistryObject<Item> baseFormItem,RegistryObject<Item> head,RegistryObject<Item>torso,RegistryObject<Item> legs, Properties properties)
	{
		super(material, rider, baseFormItem, head, torso, legs, properties);
		
	}

	@Override
	public String GET_TEXT(ItemStack itemstack, EquipmentSlot equipmentSlot, LivingEntity rider)
	{
		boolean fly = !rider.onGround();
		if (equipmentSlot == EquipmentSlot.FEET) {
			
			return "belts/"+get_Form_Item(itemstack,1).getBeltTex();
		}
		else if (equipmentSlot == EquipmentSlot.HEAD&get_Form_Item(itemstack,1)==OOO_Rider_Items.TAKA_MEDAL.get()&get_Form_Item(itemstack,2)==OOO_Rider_Items.KUJAKU_MEDAL.get()&get_Form_Item(itemstack,3)==OOO_Rider_Items.CONDOR_MEDAL.get()) return "_taka_tajado";
		else if (equipmentSlot == EquipmentSlot.HEAD) return get_Form_Item(itemstack,1).getFormName(fly);
		else if (equipmentSlot == EquipmentSlot.CHEST) return get_Form_Item(itemstack,2).getFormName(fly);
		else return get_Form_Item(itemstack,3).getFormName(fly);

	}



	public ResourceLocation getModelResource(ItemStack itemstack,RiderArmorItem animatable, EquipmentSlot slot, LivingEntity rider) {
		int num = 1;
		if (slot == EquipmentSlot.CHEST)num=2;
		if (slot == EquipmentSlot.LEGS)num=3;
		
		if (get_Form_Item(itemstack, num).HasWingsIfFlying() & !rider.onGround()){
			return new ResourceLocation(KamenRiderCraftCore.MODID, get_Form_Item(itemstack, num).get_FlyingModel());
	 }else if (get_Form_Item(itemstack, num).get_Model()=="geo/ichigo.geo.json") {
			return new ResourceLocation(KamenRiderCraftCore.MODID, "geo/rider_plusbelt.geo.json");
		 }else   
			 return new ResourceLocation(KamenRiderCraftCore.MODID, get_Form_Item(itemstack, num).get_Model());

	}
	
	public  boolean getPartsForSlot(EquipmentSlot currentSlot,String  part) {

		switch (currentSlot) {
		case HEAD ->{ 
			if (part =="head") return true;
			if (part =="body") return true;
			
		}
		case CHEST -> {
			if (part =="body") return true;
			if (part =="rightArm") return true;
			if (part =="leftArm") return true;
			
		}
		case LEGS -> {
			if (part =="body") return true;
			if (part =="leftLeg") return true;
			if (part =="rightLeg") return true;
			
		
		}
		default -> {}
		}
		return false;
	}

}