package com.kelco.kamenridercraft.Items.rider_armor_base;


import java.util.List;


import com.kelco.kamenridercraft.Items.Modded_item_core;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ShieldItem;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
public class BaseShieldItem extends ShieldItem {

	private Item RepairItem = Modded_item_core.RIDER_CIRCUIT.get();
	
	public BaseShieldItem(Properties prop) {
		super(prop);

	}

	public BaseShieldItem ChangeRepairItem(Item item) {
		RepairItem = item;
		return this;
	}
	
	public boolean isValidRepairItem(ItemStack p_40392_, ItemStack p_40393_) {
		return p_40393_.getItem()== RepairItem;
	}

	public BaseShieldItem AddToTabList(List<Item> TabList) {
		TabList.add(this);
		return this;
	}

	   @Override
	   public boolean canPerformAction(ItemStack stack, net.minecraftforge.common.ToolAction toolAction) {
	      return net.minecraftforge.common.ToolActions.DEFAULT_SHIELD_ACTIONS.contains(toolAction);
	   }
}