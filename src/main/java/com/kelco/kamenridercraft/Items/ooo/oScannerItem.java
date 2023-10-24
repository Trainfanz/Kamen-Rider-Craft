package com.kelco.kamenridercraft.Items.ooo;


import com.kelco.kamenridercraft.Effect.Effect_core;
import com.kelco.kamenridercraft.Items.OOO_Rider_Items;
import com.kelco.kamenridercraft.Items.rider_armor_base.BaseItem;
import com.kelco.kamenridercraft.Items.rider_armor_base.RiderDriverItem;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class oScannerItem extends BaseItem {




	public oScannerItem(Properties prop) {
		super(prop);


	}

	public void inventoryTick(ItemStack p_41404_, Level p_41405_, Entity p_41406_, int p_41407_, boolean p_41408_) {

		if (p_41406_ instanceof Player player){
			if (player.getItemBySlot(EquipmentSlot.FEET).getItem() == OOO_Rider_Items.OOODRIVER.get()){
				if (player.getItemBySlot(EquipmentSlot.LEGS).getItem() == OOO_Rider_Items.OOOLEGGINGS.get()){
					if (player.getItemBySlot(EquipmentSlot.CHEST).getItem() == OOO_Rider_Items.OOOCHESTPLATE.get()){
						if (player.getItemBySlot(EquipmentSlot.HEAD).getItem() == OOO_Rider_Items.OOOHELMET.get()){
							ItemStack Belt = player.getItemBySlot(EquipmentSlot.FEET);

							if (RiderDriverItem.get_Form_Item(Belt,1).getFormName(false)=="_taka"&
									RiderDriverItem.get_Form_Item(Belt,2).getFormName(false)=="_kujaku"&
									RiderDriverItem.get_Form_Item(Belt,3).getFormName(false)=="_condor") {
								player.addEffect(new MobEffectInstance(Effect_core.FLYING.get(),400,0,true,false));

							} else  if (RiderDriverItem.get_Form_Item(Belt,1).getFormName(false)=="_lion"&
									RiderDriverItem.get_Form_Item(Belt,2).getFormName(false)=="_tora"&
									RiderDriverItem.get_Form_Item(Belt,3).getFormName(false)=="_cheetah") {
								player.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED,40,6,true,false));	

							} else  if (RiderDriverItem.get_Form_Item(Belt,1).getFormName(false)=="_kuwagata"&
									RiderDriverItem.get_Form_Item(Belt,2).getFormName(false)=="_kamakiri"&
									RiderDriverItem.get_Form_Item(Belt,3).getFormName(false)=="_batta") {
								player.addEffect(new MobEffectInstance(MobEffects.JUMP,40,6,true,false));	

							}  else  if (RiderDriverItem.get_Form_Item(Belt,1).getFormName(false)=="_sai"&
									RiderDriverItem.get_Form_Item(Belt,2).getFormName(false)=="_gorilla"&
									RiderDriverItem.get_Form_Item(Belt,3).getFormName(false)=="_zou") {
								player.addEffect(new MobEffectInstance(Effect_core.PUNCH.get(),40,5,true,false));	

							}  else  if (RiderDriverItem.get_Form_Item(Belt,1).getFormName(false)=="_shachi"&
									RiderDriverItem.get_Form_Item(Belt,2).getFormName(false)=="_unagi"&
									RiderDriverItem.get_Form_Item(Belt,3).getFormName(false)=="_tako") {
								player.addEffect(new MobEffectInstance(MobEffects.DOLPHINS_GRACE,40,0,true,false));	

							}  else  if (RiderDriverItem.get_Form_Item(Belt,1).getFormName(false)=="_ptera"&
									RiderDriverItem.get_Form_Item(Belt,2).getFormName(false)=="_tricera"&
									RiderDriverItem.get_Form_Item(Belt,3).getFormName(false)=="_tyranno") {
								player.addEffect(new MobEffectInstance(Effect_core.FLYING.get(),400,0,true,false));

							}  

						}
					}
				}
			}
		}
	}
}

