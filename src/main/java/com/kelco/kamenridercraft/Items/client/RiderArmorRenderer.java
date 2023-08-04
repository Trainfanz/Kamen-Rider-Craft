package com.kelco.kamenridercraft.Items.client;

import com.kelco.kamenridercraft.Items.rider_armor_base.RiderArmorItem;
import com.kelco.kamenridercraft.Items.rider_armor_base.RiderDriverItem;

import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class RiderArmorRenderer extends GeoArmorRenderer<RiderArmorItem> {
	 
	private static LivingEntity RIDER;
	
    public RiderArmorRenderer(LivingEntity livingEntity, EquipmentSlot equipmentSlot) {
    
        super(new RiderArmorModel(livingEntity, equipmentSlot));
        RIDER =  livingEntity;
    }
    
    

	protected void applyBoneVisibilityBySlot(EquipmentSlot currentSlot) {
		setAllVisible(false);

		if (RIDER.getItemBySlot(EquipmentSlot.FEET).getItem() instanceof RiderDriverItem) {
			RiderDriverItem BELT = ((RiderDriverItem)RIDER.getItemBySlot(EquipmentSlot.FEET).getItem()); 
		
				setBoneVisible(this.head, BELT.getPartsForSlot(currentSlot,"head"));
				setBoneVisible(this.body,  BELT.getPartsForSlot(currentSlot,"body"));
				setBoneVisible(this.rightArm,  BELT.getPartsForSlot(currentSlot,"rightArm"));
				setBoneVisible(this.leftArm,  BELT.getPartsForSlot(currentSlot,"leftArm"));
				setBoneVisible(this.rightLeg,  BELT.getPartsForSlot(currentSlot,"rightLeg"));
				setBoneVisible(this.leftLeg,  BELT.getPartsForSlot(currentSlot,"leftLeg"));
				setBoneVisible(this.body, true);

			
		}else {
			
			switch (currentSlot) {
			case HEAD ->{ 
				setBoneVisible(this.head, true);
			}
			case CHEST -> {
				setBoneVisible(this.body, true);
				setBoneVisible(this.rightArm, true);
				setBoneVisible(this.leftArm, true);
			}
			case LEGS -> {
				setBoneVisible(this.rightLeg, true);
				setBoneVisible(this.leftLeg, true);
			}
			case FEET -> {
				setBoneVisible(this.body, true);
			}
			default -> {}
		}
	
		}
	}

}