package com.kelco.kamenridercraft.Items.client;

import com.kelco.kamenridercraft.Items.rider_armor_base.RiderArmorItem;

import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class RiderArmorRenderer extends GeoArmorRenderer<RiderArmorItem> {
	
    public RiderArmorRenderer(LivingEntity livingEntity, EquipmentSlot equipmentSlot) {
    
        super(new RiderArmorModel(livingEntity, equipmentSlot));
    }
    
    

	protected void applyBoneVisibilityBySlot(EquipmentSlot currentSlot) {
		setAllVisible(false);

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