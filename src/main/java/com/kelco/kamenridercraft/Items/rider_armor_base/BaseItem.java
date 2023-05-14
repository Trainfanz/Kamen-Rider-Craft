package com.kelco.kamenridercraft.Items.rider_armor_base;


import java.util.List;

import net.minecraft.world.item.Item;
public class BaseItem extends Item {

	public BaseItem(Properties prop) {
		super(prop);
		
	}

	public BaseItem AddToTabList(List<Item> TabList) {
		TabList.add(this);
		return this;
	}

}