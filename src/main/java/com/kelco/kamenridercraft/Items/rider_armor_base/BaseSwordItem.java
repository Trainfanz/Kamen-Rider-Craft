package com.kelco.kamenridercraft.Items.rider_armor_base;


import java.util.List;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
public class BaseSwordItem extends SwordItem {

		public BaseSwordItem(Tier toolTier, int Atk, float Spd, Properties prop) {
		super(toolTier, Atk, Spd, prop);
		
	}

	public BaseSwordItem AddToTabList(List<Item> TabList) {
		TabList.add(this);
		return this;
	}

}