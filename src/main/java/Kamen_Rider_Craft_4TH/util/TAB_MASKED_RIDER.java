package Kamen_Rider_Craft_4TH.util;

import Kamen_Rider_Craft_4TH.RiderItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class TAB_MASKED_RIDER extends CreativeTabs{

	public TAB_MASKED_RIDER(String label) {
	super("tab_masked_rider");
		this.setBackgroundImageName("items_masked_rider.png");
	}

	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(RiderItems.agito_of_seed);
	}
	

}
