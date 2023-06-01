package com.kelco.kamenridercraft.Items.w;

import com.kelco.kamenridercraft.Items.rider_armor_base.RiderDriverItem;

import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.registries.RegistryObject;

public class WDriverItem extends RiderDriverItem{


	public WDriverItem (ArmorMaterial material, String rider,RegistryObject<Item> baseFormItem,RegistryObject<Item> head,RegistryObject<Item>torso,RegistryObject<Item> legs, Properties properties)
	{
		super(material, rider, baseFormItem, head, torso, legs, properties);
	}


	public String GET_TEXT(ItemStack itemstack, EquipmentSlot equipmentSlot)
	{
		if (equipmentSlot == EquipmentSlot.FEET) {
			
			return "belts/"+get_Form_Item(itemstack,1).getBeltTex();
		}
		else if (equipmentSlot == EquipmentSlot.HEAD) return get_Form_Item(itemstack,1).getFormName();
			
		else {
			if (get_Form_Item(itemstack,1).getFormName()=="_fang") return "_fang"+get_Form_Item(itemstack,2).getFormName();
			else return get_Form_Item(itemstack,2).getFormName();
		}
	}


	public  boolean getPartsForSlot(EquipmentSlot currentSlot,String  part) {

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

	public static void set_Form_Item(ItemStack itemstack, Item ITEM,int SLOT)
	{
		if (!itemstack.hasTag())
		{
			itemstack.setTag(new CompoundTag());
		}
		if (itemstack.getItem() instanceof RiderDriverItem) {
			itemstack.getTag().putInt("slot"+SLOT, Item.getId(ITEM));
		}
	}

}