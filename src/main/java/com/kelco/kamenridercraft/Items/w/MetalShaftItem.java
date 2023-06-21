package com.kelco.kamenridercraft.Items.w;


import java.util.List;

import com.kelco.kamenridercraft.Items.Modded_item_core;
import com.kelco.kamenridercraft.Items.W_Rider_Items;
import com.kelco.kamenridercraft.Items.rider_armor_base.BaseSwordItem;
import com.kelco.kamenridercraft.Items.rider_armor_base.RiderDriverItem;
import com.kelco.kamenridercraft.Items.rider_armor_base.RiderFormChangeItem;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.minecraftforge.event.entity.living.MobEffectEvent;
public class MetalShaftItem extends BaseSwordItem {

	public MetalShaftItem(Tier toolTier, int Atk, float Spd, Properties prop) {
		super(toolTier, Atk, Spd, prop);

	}

	
	   public boolean hurtEnemy(ItemStack p_43278_, LivingEntity p_43279_, LivingEntity p_43280_) {
		      p_43278_.hurtAndBreak(1, p_43280_, (p_43296_) -> {
		         p_43296_.broadcastBreakEvent(EquipmentSlot.MAINHAND);
		         
		      });
		    
		  	ItemStack belt = p_43280_.getItemBySlot(EquipmentSlot.FEET);

			if (belt.getItem() instanceof RiderDriverItem) {

				if (((RiderDriverItem)belt.getItem())==W_Rider_Items.WDRIVER.get()) {
					if (RiderDriverItem.get_Form_Item(belt, 1)==W_Rider_Items.HEAT_MEMORY.get()) {
				      p_43279_.setSharedFlagOnFire(true);
				      p_43279_.setRemainingFireTicks(200);
					} else if (RiderDriverItem.get_Form_Item(belt, 1)==W_Rider_Items.CYCLONE_MEMORY.get()) {
					      p_43279_.addEffect(new MobEffectInstance(MobEffects.LEVITATION, 80, 0,true,false));
							
						}
				}
				
			}
		      

		      
		      return true;
		   }
	
	public MetalShaftItem AddToTabList(List<Item> TabList) {
		TabList.add(this);
		return this;
	}

}