package com.kelco.kamenridercraft.Items.rider_armor_base;


import java.util.List;


import net.minecraft.world.item.Item;
public class BaseItem extends Item {

	public BaseItem(Properties prop) {
		super(prop);
		
	}

	public BaseItem AddToTabList(List<Item> TabList,int num) {
		for (int i = 0; i < num; i++)
		{
		TabList.add(this);
		}
		return this;
	}
	
	public BaseItem AddToTabList(List<Item> TabList) {
		TabList.add(this);
		return this;
	}



}