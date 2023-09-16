package com.kelco.kamenridercraft.Items.w;

import com.kelco.kamenridercraft.KamenRiderCraftCore;
import com.kelco.kamenridercraft.Items.W_Rider_Items;
import com.kelco.kamenridercraft.Items.rider_armor_base.RiderArmorItem;
import com.kelco.kamenridercraft.Items.rider_armor_base.RiderDriverItem;
import com.kelco.kamenridercraft.Items.rider_armor_base.RiderFormChangeItem;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraftforge.registries.RegistryObject;

public class WDriverItem extends RiderDriverItem{


	public WDriverItem (ArmorMaterial material, String rider,RegistryObject<Item> baseFormItem,RegistryObject<Item> head,RegistryObject<Item>torso,RegistryObject<Item> legs, Properties properties)
	{
		super(material, rider, baseFormItem, head, torso, legs, properties);
	}

	
	@Override
	public void onArmorTick(ItemStack stack, Level level, Player player)
	{
		super.onArmorTick(stack, level, player);
		if (RiderDriverItem.get_Form_Item(stack, 1)==W_Rider_Items.XTREME_MEMORY.get()&player.fallDistance>10) {
			
			RiderFormChangeItem alternativeItem_form_change = (RiderFormChangeItem) W_Rider_Items.XTREME_GOLD_MEMORY.get();
			
			alternativeItem_form_change.use(level, player, InteractionHand.MAIN_HAND);
	
			}
	}
	@Override
	public String GET_TEXT(ItemStack itemstack, EquipmentSlot equipmentSlot, LivingEntity rider)
	{
		boolean fly = !rider.onGround();
		if (equipmentSlot == EquipmentSlot.FEET) {
			
			return "belts/"+get_Form_Item(itemstack,1).getBeltTex();
		}
		else if (equipmentSlot == EquipmentSlot.HEAD) return get_Form_Item(itemstack,1).getFormName(fly);
			
		
		else {
			if (get_Form_Item(itemstack,1).getFormName(fly)=="_fang") return "_fang"+get_Form_Item(itemstack,2).getFormName(fly);
			else if (get_Form_Item(itemstack,1).getFormName(fly)=="_cyclone_xtreme") return get_Form_Item(itemstack,2).getFormName(fly)+"_xtreme";
			else if (get_Form_Item(itemstack,1).getFormName(fly)=="_cyclone_xtreme_gold") return get_Form_Item(itemstack,2).getFormName(fly)+"_xtreme_gold";
			else if (get_Form_Item(itemstack,1).getFormName(fly)=="_cyclone_xtreme_accel") return "_accel_xtreme";
			else return get_Form_Item(itemstack,2).getFormName(fly);
		}
	}


	public ResourceLocation getModelResource(ItemStack itemstack,RiderArmorItem animatable, EquipmentSlot slot, LivingEntity rider) {
		
		if (slot!= EquipmentSlot.HEAD) {
			return new ResourceLocation(KamenRiderCraftCore.MODID, "geo/rider_plusbelt.geo.json");
		}else
		return super.getModelResource(itemstack, animatable, slot,rider);
	}
	
	@Override
	public  boolean getPartsForSlot(ItemStack itemstack,EquipmentSlot currentSlot,String  part) {

		switch (currentSlot) {
		case HEAD ->{ 
			if (part =="head") return true;
			if (part =="body") return true;
			if (part =="rightArm") return true;
			if (part =="rightLeg") return true;
			
		}
		case CHEST -> {

		}
		case LEGS -> {
			if (part =="head") return true;
			if (part =="body") return true;
			if (part =="leftLeg") return true;
			if (part =="leftArm") return true;
		
		}
		default -> {}
		}
		return false;
	}

	
	public void Extra_set_Form_Item(ItemStack itemstack, Item ITEM,int SLOT)
	{
	if (get_Form_Item(itemstack, 1)==W_Rider_Items.XTREME_MEMORY.get()||get_Form_Item(itemstack, 1)==W_Rider_Items.XTREME_GOLD_MEMORY.get()||get_Form_Item(itemstack, 1)==W_Rider_Items.XTREME_ACCEL_MEMORY.get()) {
		itemstack.getTag().putInt("slot"+1, Item.getId(W_Rider_Items.CYCLONE_MEMORY.get()));
	}
	}

}