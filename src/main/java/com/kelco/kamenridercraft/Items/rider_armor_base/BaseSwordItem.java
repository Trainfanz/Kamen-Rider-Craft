package com.kelco.kamenridercraft.Items.rider_armor_base;


import java.util.List;

import com.kelco.kamenridercraft.Items.Modded_item_core;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
public class BaseSwordItem extends SwordItem {

	public BaseSwordItem(Tier toolTier, int Atk, float Spd, Properties prop) {
		super(toolTier, Atk, Spd, prop);

	}

	public boolean isValidRepairItem(ItemStack p_40392_, ItemStack p_40393_) {
		return p_40393_.getItem()== Modded_item_core.RIDER_CIRCUIT.get();
	}

	public BaseSwordItem AddToTabList(List<Item> TabList) {
		TabList.add(this);
		return this;
	}

}