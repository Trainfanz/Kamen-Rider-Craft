package com.kelco.kamenridercraft.Items.geats;

import java.util.List;

import com.kelco.kamenridercraft.KamenRiderCraftCore;
import com.kelco.kamenridercraft.Items.Geats_Rider_Items;
import com.kelco.kamenridercraft.Items.Modded_item_core;
import com.kelco.kamenridercraft.Items.rider_armor_base.RiderArmorItem;
import com.kelco.kamenridercraft.Items.rider_armor_base.RiderDriverItem;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraftforge.registries.RegistryObject;

public class DesireDriverItem  extends RiderDriverItem{


	public DesireDriverItem (ArmorMaterial material, String rider,RegistryObject<Item> baseFormItem,RegistryObject<Item> head,RegistryObject<Item>torso,RegistryObject<Item> legs, Properties properties)
	{
		super(material, rider, baseFormItem, head, torso, legs, properties);
		
	}

	@Override
	public String GET_TEXT(ItemStack itemstack, EquipmentSlot equipmentSlot, LivingEntity rider,String riderName)
	{
		boolean fly = rider instanceof Player player && player.getAbilities().flying;
		
		Boolean isBujin= false;
		if (get_Form_Item(itemstack,2)==Geats_Rider_Items.BOOST_RAISE_BUCKLE.get()||get_Form_Item(itemstack,2)==Modded_item_core.BLANK_FORM.get())  isBujin = true;
		
		if (equipmentSlot == EquipmentSlot.FEET) {
			
			
				String belt = ((RiderDriverItem)itemstack.getItem()).BELT_TEXT;
				if (get_Form_Item(itemstack,2)==Geats_Rider_Items.REVICE_DRIVER_RAISE_BUCKLE.get()) {
					belt = "revice_driver_belt";
				} else if (get_Form_Item(itemstack,2)==Geats_Rider_Items.REVICE_DRIVER_RAISE_BUCKLE_VICE.get()) {
					belt = "buddy_buckle_belt";
				} else if (((RiderDriverItem)itemstack.getItem()).BELT_TEXT==null) {
					belt = get_Form_Item(itemstack,1).getBeltTex();
				}
				return "belts/"+belt;
			
		}

		else if (equipmentSlot == EquipmentSlot.HEAD&get_Form_Item(itemstack,3)==Geats_Rider_Items.PLOSION_RAGE_RAISE_BUCKLE.get()) return riderName+"_base_over_plosion_rage";
		
		else if (equipmentSlot == EquipmentSlot.HEAD&isRaising(itemstack,riderName)) return riderName+"_base_over_raising"+ get_Form_Item(itemstack,1).getFormName(fly);
		else if (equipmentSlot == EquipmentSlot.HEAD&isFever(itemstack,riderName)) return riderName+"_base_over_fever"+ get_Form_Item(itemstack,1).getFormName(fly);
		
		else if (equipmentSlot == EquipmentSlot.HEAD&get_Form_Item(itemstack,2)==Geats_Rider_Items.ONENESS_RAISE_BUCKLE.get()) return riderName+"_base_over_oneness";
		
		else if (equipmentSlot == EquipmentSlot.HEAD&get_Form_Item(itemstack,3)==Geats_Rider_Items.BUJIN_SWORD_RAISE_BUCKLE.get()) return riderName+"_base_over_bujin";
		
		else if (equipmentSlot == EquipmentSlot.HEAD&get_Form_Item(itemstack,2)==Geats_Rider_Items.BOOST_MKII_RAISE_BUCKLE.get()) return riderName+"_base_over_boost_mkii";
		else if (equipmentSlot == EquipmentSlot.HEAD&get_Form_Item(itemstack,2)==Geats_Rider_Items.UNITE_GRIP.get()) return "geats_base_over_laser_boost";
		else if (equipmentSlot == EquipmentSlot.CHEST&get_Form_Item(itemstack,2)==Modded_item_core.BLANK_FORM.get()&&get_Form_Item(itemstack,3).getFormName(fly)=="_jyamato") return "geats_rider_jyamato_no_belt";
		
		else if (equipmentSlot == EquipmentSlot.CHEST&get_Form_Item(itemstack,2)==Geats_Rider_Items.MAGNUM_RAISE_BUCKLE.get()&&get_Form_Item(itemstack,1)==Geats_Rider_Items.GEATS_CORE_ID_OSAKA.get()) return "geats_rider_magnum_osaka";
		else if (equipmentSlot == EquipmentSlot.CHEST&get_Form_Item(itemstack,2)==Geats_Rider_Items.MAGNUM_RAISE_BUCKLE.get()&&get_Form_Item(itemstack,1)==Geats_Rider_Items.GEATS_CORE_ID_FUKUOKA.get()) return "geats_rider_magnum_fukuoka";
		else if (equipmentSlot == EquipmentSlot.CHEST&get_Form_Item(itemstack,2)==Geats_Rider_Items.MAGNUM_RAISE_BUCKLE.get()&&get_Form_Item(itemstack,1)==Geats_Rider_Items.GEATS_CORE_ID_NAGOYA.get()) return "geats_rider_magnum_nagoya";
		else if (equipmentSlot == EquipmentSlot.CHEST&get_Form_Item(itemstack,2)==Geats_Rider_Items.MAGNUM_RAISE_BUCKLE.get()&&get_Form_Item(itemstack,1)==Geats_Rider_Items.GEATS_CORE_ID_TOKYO.get()) return "geats_rider_magnum_tokyo";
		
		
		else if (equipmentSlot == EquipmentSlot.HEAD&get_Form_Item(itemstack,3)==Geats_Rider_Items.BOOST_MKIII_RAISE_BUCKLE.get()&&get_Form_Item(itemstack,2)==Geats_Rider_Items.BOOST_MKIII_RAISE_BUCKLE.get()) return riderName+"_ix_base_over";
		else if (equipmentSlot == EquipmentSlot.CHEST&get_Form_Item(itemstack,2)==Geats_Rider_Items.BOOST_MKIII_RAISE_BUCKLE.get()&&get_Form_Item(itemstack,3)==Geats_Rider_Items.BOOST_MKIII_RAISE_BUCKLE.get()) return "geats_rider_geats_ix";
		else if (equipmentSlot == EquipmentSlot.LEGS&get_Form_Item(itemstack,3)==Geats_Rider_Items.BOOST_MKIII_RAISE_BUCKLE.get()&&get_Form_Item(itemstack,2)==Geats_Rider_Items.BOOST_MKIII_RAISE_BUCKLE.get()) return "geats_rider_geats_ix_2";
		
		else if (equipmentSlot == EquipmentSlot.LEGS&get_Form_Item(itemstack,3)==Geats_Rider_Items.BOOST_MKII_RAISE_BUCKLE.get()&&get_Form_Item(itemstack,2)==Geats_Rider_Items.UNITE_GRIP.get()) return "geats_rider_laser_boost_2";
		
		else if (equipmentSlot == EquipmentSlot.CHEST&get_Form_Item(itemstack,2)==Modded_item_core.BLANK_FORM.get()&&get_Form_Item(itemstack,3)==Geats_Rider_Items.PLOSION_RAGE_RAISE_BUCKLE.get())  return "geats_rider_plosion_rage";
		else if (equipmentSlot == EquipmentSlot.CHEST&get_Form_Item(itemstack,2)==Modded_item_core.BLANK_FORM.get()&&get_Form_Item(itemstack,3)==Geats_Rider_Items.PLOSION_RAGE_RAISE_BUCKLE.get())  return "geats_rider_plosion_rage";
		
		else if (equipmentSlot == EquipmentSlot.CHEST&get_Form_Item(itemstack,2)==Modded_item_core.BLANK_FORM.get()&&get_Form_Item(itemstack,3)==Geats_Rider_Items.BUJIN_SWORD_RAISE_BUCKLE.get())  return "geats_rider_bujin_sword_top";
		else if (equipmentSlot == EquipmentSlot.CHEST&get_Form_Item(itemstack,3)==Geats_Rider_Items.BUJIN_SWORD_RAISE_BUCKLE.get()&isBujin)  return "geats_rider"+get_Form_Item(itemstack,2).getFormName(fly)+"_bujin_sword";
		else if (equipmentSlot == EquipmentSlot.LEGS&get_Form_Item(itemstack,2)!=Modded_item_core.BLANK_FORM.get()&&get_Form_Item(itemstack,3)==Geats_Rider_Items.BUJIN_SWORD_RAISE_BUCKLE.get())  return "geats_rider_bujin_sword_combo";
		
		else if (equipmentSlot == EquipmentSlot.LEGS&get_Form_Item(itemstack,3)==Geats_Rider_Items.XGEATS_RAISE_BUCKLE.get()&&get_Form_Item(itemstack,2)==Geats_Rider_Items.XGEATS_RAISE_BUCKLE.get()) return "geats_rider_x_geats_2";
		else if (equipmentSlot == EquipmentSlot.LEGS&get_Form_Item(itemstack,3)==Geats_Rider_Items.DOOMS_GEATS_RAISE_BUCKLE.get()&&get_Form_Item(itemstack,2)==Geats_Rider_Items.DOOMS_GEATS_RAISE_BUCKLE.get()) return "geats_rider_dooms_geats_2";
		
		else if (equipmentSlot == EquipmentSlot.CHEST&get_Form_Item(itemstack,2)==Geats_Rider_Items.COMMAND_TWIN_BUCKLE_JET.get()&&get_Form_Item(itemstack,3)==Geats_Rider_Items.COMMAND_TWIN_BUCKLE_CANNON_l.get()) return "geats_rider_jet";
		else if (equipmentSlot == EquipmentSlot.LEGS&get_Form_Item(itemstack,3)==Geats_Rider_Items.COMMAND_TWIN_BUCKLE_JET.get()&&get_Form_Item(itemstack,2)==Geats_Rider_Items.COMMAND_TWIN_BUCKLE_CANNON.get()) return "geats_rider_jet";
		else if (equipmentSlot == EquipmentSlot.LEGS&get_Form_Item(itemstack,2)==Geats_Rider_Items.BOOST_MKII_RAISE_BUCKLE.get()) return "geats_rider_boost_mkii_nobelt";

		else if (get_Form_Item(itemstack,2)==Geats_Rider_Items.REVICE_DRIVER_RAISE_BUCKLE.get()) return "geats_rider_revi";
		else if (get_Form_Item(itemstack,2)==Geats_Rider_Items.REVICE_DRIVER_RAISE_BUCKLE_VICE.get()) return "geats_rider_vice";
		
		else if (equipmentSlot == EquipmentSlot.HEAD) return riderName+"_base_over"+ get_Form_Item(itemstack,1).getFormName(fly);
		else if (equipmentSlot == EquipmentSlot.CHEST) return "geats_rider"+get_Form_Item(itemstack,2).getFormName(fly);
		else return "geats_rider"+get_Form_Item(itemstack,3).getFormName(fly);

	}

	public  boolean isFever(ItemStack itemstack,String riderName) {
		
		if (CanFever(riderName)) {
			if (get_Form_Item(itemstack,2)==Geats_Rider_Items.BOOST_RAISE_BUCKLE_FEVER.get()&get_Form_Item(itemstack,3)==Geats_Rider_Items.BOOST_RAISE_BUCKLE.get()) return true;
			if (get_Form_Item(itemstack,2)==Geats_Rider_Items.MAGNUM_RAISE_BUCKLE_FEVER.get()&get_Form_Item(itemstack,3)==Geats_Rider_Items.MAGNUM_RAISE_BUCKLE.get()) return true;
			if (get_Form_Item(itemstack,2)==Geats_Rider_Items.ZOMBIE_RAISE_BUCKLE_FEVER.get()&get_Form_Item(itemstack,3)==Geats_Rider_Items.ZOMBIE_RAISE_BUCKLE.get()) return true;
			if (get_Form_Item(itemstack,2)==Geats_Rider_Items.NINJA_RAISE_BUCKLE_FEVER.get()&get_Form_Item(itemstack,3)==Geats_Rider_Items.NINJA_RAISE_BUCKLE.get()) return true;
			if (get_Form_Item(itemstack,2)==Geats_Rider_Items.BEAT_RAISE_BUCKLE_FEVER.get()&get_Form_Item(itemstack,3)==Geats_Rider_Items.BEAT_RAISE_BUCKLE.get()) return true;
			if (get_Form_Item(itemstack,2)==Geats_Rider_Items.MONSTER_RAISE_BUCKLE_FEVER.get()&get_Form_Item(itemstack,3)==Geats_Rider_Items.MONSTER_RAISE_BUCKLE.get()) return true;
			
			if (get_Form_Item(itemstack,2)==Geats_Rider_Items.BOOST_RAISE_BUCKLE.get()&get_Form_Item(itemstack,3)==Geats_Rider_Items.BOOST_RAISE_BUCKLE_FEVER.get()) return true;
			if (get_Form_Item(itemstack,2)==Geats_Rider_Items.MAGNUM_RAISE_BUCKLE.get()&get_Form_Item(itemstack,3)==Geats_Rider_Items.MAGNUM_RAISE_BUCKLE_FEVER.get()) return true;
			if (get_Form_Item(itemstack,2)==Geats_Rider_Items.ZOMBIE_RAISE_BUCKLE.get()&get_Form_Item(itemstack,3)==Geats_Rider_Items.ZOMBIE_RAISE_BUCKLE_FEVER.get()) return true;
			if (get_Form_Item(itemstack,2)==Geats_Rider_Items.NINJA_RAISE_BUCKLE.get()&get_Form_Item(itemstack,3)==Geats_Rider_Items.NINJA_RAISE_BUCKLE_FEVER.get()) return true;
			if (get_Form_Item(itemstack,2)==Geats_Rider_Items.BEAT_RAISE_BUCKLE.get()&get_Form_Item(itemstack,3)==Geats_Rider_Items.BEAT_RAISE_BUCKLE_FEVER.get()) return true;
			if (get_Form_Item(itemstack,2)==Geats_Rider_Items.MONSTER_RAISE_BUCKLE.get()&get_Form_Item(itemstack,3)==Geats_Rider_Items.MONSTER_RAISE_BUCKLE_FEVER.get()) return true;

		}
		return false;
	}
	
	public  boolean isRaising(ItemStack itemstack,String riderName) {
			if (get_Form_Item(itemstack,2)==Geats_Rider_Items.COMMAND_TWIN_BUCKLE_JET.get()||get_Form_Item(itemstack,3)==Geats_Rider_Items.COMMAND_TWIN_BUCKLE_JET.get()) return true;
		return false;
	}
	
	
	public Boolean CanFever(String rider) {
		String[] feverRiderList = Geats_Rider_Items.FeverUsers;
		for (int i = 0; i < feverRiderList.length; i++)
		{
			if (feverRiderList[i]==rider){
				return true;
			}
		}

		return false;
	}
	
	@Override
	public void OnformChange(ItemStack belt, Player player) {
		
		if (get_Form_Item(belt,2)==Geats_Rider_Items.COMMAND_TWIN_BUCKLE_CANNON.get()&get_Form_Item(belt,3)!=Geats_Rider_Items.COMMAND_TWIN_BUCKLE_JET.get())set_Form_Item(belt, Modded_item_core.BLANK_FORM.get(), 2);
		if (get_Form_Item(belt,3)==Geats_Rider_Items.COMMAND_TWIN_BUCKLE_CANNON_l.get()&get_Form_Item(belt,2)!=Geats_Rider_Items.COMMAND_TWIN_BUCKLE_JET.get())set_Form_Item(belt, Modded_item_core.BLANK_FORM.get(), 3);
		
		if (get_Form_Item(belt,1)==Geats_Rider_Items.JYAMASHIN_WISH_CARD.get()&get_Form_Item(belt,2)==Geats_Rider_Items.COMMAND_TWIN_BUCKLE_JET.get())set_Form_Item(belt, Geats_Rider_Items.BUFFA_CORE_ID.get(), 1);
		if (get_Form_Item(belt,1)==Geats_Rider_Items.JYAMASHIN_WISH_CARD.get()&get_Form_Item(belt,3)==Geats_Rider_Items.COMMAND_TWIN_BUCKLE_JET.get())set_Form_Item(belt, Geats_Rider_Items.BUFFA_CORE_ID.get(), 1);
			
		if (get_Form_Item(belt,2)==Geats_Rider_Items.BOOST_MKII_RAISE_BUCKLE.get()&get_Form_Item(belt,3)!=Modded_item_core.BLANK_FORM.get())set_Form_Item(belt, Modded_item_core.BLANK_FORM.get(), 2);
		
		if (get_Form_Item(belt,3)==Geats_Rider_Items.BOOST_MKII_RAISE_BUCKLE.get()&get_Form_Item(belt,2)!=Geats_Rider_Items.UNITE_GRIP.get())set_Form_Item(belt, Modded_item_core.BLANK_FORM.get(), 3);
		if (get_Form_Item(belt,2)==Geats_Rider_Items.UNITE_GRIP.get()&get_Form_Item(belt,3)!=Geats_Rider_Items.BOOST_MKII_RAISE_BUCKLE.get())set_Form_Item(belt, Modded_item_core.BLANK_FORM.get(), 2);
		
		if (get_Form_Item(belt,2)==Geats_Rider_Items.ONENESS_RAISE_BUCKLE.get()&get_Form_Item(belt,3)!=Geats_Rider_Items.BOOST_MKIII_RAISE_BUCKLE.get())set_Form_Item(belt, Modded_item_core.BLANK_FORM.get(), 2);
		
		if (get_Form_Item(belt,1)==Geats_Rider_Items.GEATS_CORE_ID_OSAKA.get()&get_Form_Item(belt,2)!=Geats_Rider_Items.MAGNUM_RAISE_BUCKLE.get())set_Form_Item(belt, Geats_Rider_Items.GEATS_CORE_ID.get(), 1);
		
		Boolean isBujin= true;
		if (get_Form_Item(belt,2)==Geats_Rider_Items.BOOST_RAISE_BUCKLE.get()) isBujin = false;
		else if (get_Form_Item(belt,2)==Geats_Rider_Items.MONSTER_RAISE_BUCKLE.get())  isBujin = false;
		else if (get_Form_Item(belt,2)==Modded_item_core.BLANK_FORM.get())  isBujin = false;
				
		if (get_Form_Item(belt,3)==Geats_Rider_Items.BUJIN_SWORD_RAISE_BUCKLE.get()&isBujin)set_Form_Item(belt, Modded_item_core.BLANK_FORM.get(), 3);
		
		if (get_Form_Item(belt,3)==Geats_Rider_Items.PLOSION_RAGE_RAISE_BUCKLE.get()&get_Form_Item(belt,2)!=Modded_item_core.BLANK_FORM.get())set_Form_Item(belt, Modded_item_core.BLANK_FORM.get(), 3);
		
		if (get_Form_Item(belt,2)==Geats_Rider_Items.REVICE_DRIVER_RAISE_BUCKLE.get()&get_Form_Item(belt,3)!=Modded_item_core.BLANK_FORM.get())set_Form_Item(belt, Modded_item_core.BLANK_FORM.get(), 2);
		if (get_Form_Item(belt,2)==Geats_Rider_Items.REVICE_DRIVER_RAISE_BUCKLE_VICE.get()&get_Form_Item(belt,3)!=Modded_item_core.BLANK_FORM.get())set_Form_Item(belt, Modded_item_core.BLANK_FORM.get(), 2);
		
		belt.getTag().putBoolean("Update_form", false);
	}
	
	@Override
	public void onArmorTick(ItemStack stack, Level level, Player player)
	{

		if (player.getItemBySlot(EquipmentSlot.LEGS).getItem() == LEGS){
			if (player.getItemBySlot(EquipmentSlot.CHEST).getItem() == TORSO){
				if (player.getItemBySlot(EquipmentSlot.HEAD).getItem() == HEAD){
					if (player.getItemBySlot(EquipmentSlot.FEET).getItem() == this){
						for (int n = 0; n < Num_Base_Form_Item; n++)
						{
							ItemStack belt = player.getItemBySlot(EquipmentSlot.FEET);
							
							if (stack.getTag().getBoolean("Update_form"))OnformChange(stack, player);
			
							List<MobEffectInstance> potionEffectList = get_Form_Item(belt,n+1).getPotionEffectList();
							for (int i = 0; i < potionEffectList.size(); i++)
							{
								boolean Fever=  isFever(belt,this.Rider);
								int Amplifier = Fever? (potionEffectList.get(i).getAmplifier()+2):(potionEffectList.get(i).getAmplifier());
								player.addEffect(new MobEffectInstance(potionEffectList.get(i).getEffect(),potionEffectList.get(i).getDuration(),Amplifier,true,false));
							}
						}
					}
				}
			}
		}

	}
	public  boolean getGlowForSlot(ItemStack itemstack,EquipmentSlot currentSlot, LivingEntity livingEntity) {
		return false;
	}

	public ResourceLocation getModelResource(ItemStack itemstack,RiderArmorItem animatable, EquipmentSlot slot, LivingEntity rider) {
		int num = 1;
		if (slot == EquipmentSlot.CHEST)num=2; 
		if (slot == EquipmentSlot.LEGS)num=3;
		
		 if (slot == EquipmentSlot.CHEST) {
			 if (get_Form_Item(itemstack, num).get_Model()=="geo/ichigo.geo.json")return new ResourceLocation(KamenRiderCraftCore.MODID, "geo/geats_rider_plusbelt.geo.json");
			 else return new ResourceLocation(KamenRiderCraftCore.MODID, "geo/"+get_Form_Item(itemstack, num).get_Model()); 
			
		 }else if (slot == EquipmentSlot.LEGS) {
			 if (get_Form_Item(itemstack, num).get_Model()=="geo/ichigo.geo.json")return new ResourceLocation(KamenRiderCraftCore.MODID, "geo/revo_geats_rider_plusbelt.geo.json");
			 else return new ResourceLocation(KamenRiderCraftCore.MODID, "geo/revo_"+get_Form_Item(itemstack, num).get_Model()); 

			 }else 
				 
				 if (get_Form_Item(itemstack,3)==Geats_Rider_Items.BOOST_MKIII_RAISE_BUCKLE.get()&&get_Form_Item(itemstack,2)==Geats_Rider_Items.BOOST_MKIII_RAISE_BUCKLE.get()) return new ResourceLocation(KamenRiderCraftCore.MODID, "geo/cyclonehopper_wingsarmor.geo.json");
				
				 if (get_Form_Item(itemstack, num).get_Model()=="geo/ichigo.geo.json")return new ResourceLocation(KamenRiderCraftCore.MODID, "geo/geats.geo.json");
				 else return new ResourceLocation(KamenRiderCraftCore.MODID, "geo/"+get_Form_Item(itemstack, num).get_Model()); 
				

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
			if (part =="head") return true;
			if (part =="body") return true;
			if (part =="rightArm") return true;
			if (part =="leftArm") return true;
			
		}
		case LEGS -> {

			if (part =="head") return true;
			if (part =="body") return true;
			if (part =="rightArm") return true;
			if (part =="leftArm") return true;
			if (part =="leftLeg") return true;
			if (part =="rightLeg") return true;
			
		
		}
		default -> {}
		}
		return false;
	}

}