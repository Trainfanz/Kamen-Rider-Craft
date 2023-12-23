package com.kelco.kamenridercraft.Items.client;


import com.kelco.kamenridercraft.KamenRiderCraftCore;
import com.kelco.kamenridercraft.Items.rider_armor_base.RiderArmorItem;
import com.kelco.kamenridercraft.Items.rider_armor_base.RiderDriverItem;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import software.bernie.geckolib.model.GeoModel;

public class RiderArmorModel extends GeoModel<RiderArmorItem> {

	private static LivingEntity RIDER;
	private EquipmentSlot slot;

	public RiderArmorModel(LivingEntity livingEntity, EquipmentSlot equipmentSlot) {

		RIDER =  livingEntity;
		slot =  equipmentSlot;
	}

	@Override
	public ResourceLocation getModelResource(RiderArmorItem animatable) {
		if (slot== EquipmentSlot.FEET) {
			
			RiderDriverItem BELT = ((RiderDriverItem)RIDER.getItemBySlot(EquipmentSlot.FEET).getItem()); 
			
			return BELT.getBeltModelResource(RIDER.getItemBySlot(EquipmentSlot.FEET),animatable,slot,RIDER);
		}else {
			
			if (RIDER.getItemBySlot(EquipmentSlot.FEET).getItem() instanceof RiderDriverItem) {
				RiderDriverItem BELT = ((RiderDriverItem)RIDER.getItemBySlot(EquipmentSlot.FEET).getItem()); 
				
				return BELT.getModelResource(RIDER.getItemBySlot(EquipmentSlot.FEET),animatable,slot,RIDER);
				
			}else return new ResourceLocation(KamenRiderCraftCore.MODID, "geo/ichigo.geo.json");
		}
	}

	@Override
	public ResourceLocation getTextureResource(RiderArmorItem animatable) {


		String FORM="blank";
		ItemStack BELT = RIDER.getItemBySlot(EquipmentSlot.FEET); 
		if (BELT.getItem() instanceof RiderDriverItem) {
			FORM=((RiderDriverItem) BELT.getItem()).GET_TEXT(BELT,slot,RIDER,((RiderDriverItem) BELT.getItem()).Rider );
			if (slot == EquipmentSlot.FEET) {

				FORM=((RiderDriverItem) BELT.getItem()).GET_TEXT(BELT,slot ,RIDER,((RiderDriverItem) BELT.getItem()).Rider);
			}else if ( ((RiderDriverItem) BELT.getItem()).HEAD.asItem()!=RIDER.getItemBySlot(EquipmentSlot.HEAD).getItem()||
					 ((RiderDriverItem) BELT.getItem()).TORSO.asItem()!=RIDER.getItemBySlot(EquipmentSlot.CHEST).getItem()||
					 ((RiderDriverItem) BELT.getItem()).LEGS.asItem()!=RIDER.getItemBySlot(EquipmentSlot.LEGS).getItem()) {
				 FORM="blank";
			}
	

		}
		return new ResourceLocation(KamenRiderCraftCore.MODID, "textures/armor/"+FORM+".png");
	}



@Override
public ResourceLocation getAnimationResource(RiderArmorItem animatable) {
	if (slot== EquipmentSlot.FEET) {
		return new ResourceLocation(KamenRiderCraftCore.MODID, "animations/riderbelt.animation.json");
	}else {
		
		if (RIDER.getItemBySlot(EquipmentSlot.FEET).getItem() instanceof RiderDriverItem) {
			RiderDriverItem BELT = ((RiderDriverItem)RIDER.getItemBySlot(EquipmentSlot.FEET).getItem()); 
			
			return BELT.getAnimationResource(RIDER.getItemBySlot(EquipmentSlot.FEET),animatable,slot);
			
		}else return new ResourceLocation(KamenRiderCraftCore.MODID, "animations/ichigo.animation.json");
	}

}
}