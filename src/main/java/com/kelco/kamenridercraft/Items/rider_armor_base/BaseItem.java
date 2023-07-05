package com.kelco.kamenridercraft.Items.rider_armor_base;


import java.util.List;



import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
public class BaseItem extends Item {

	
	   private Item craftingRemainingItem = null;
	
	public BaseItem(Properties prop) {
		super(prop);
	
	}


	
	public BaseItem KeepItem() {
		craftingRemainingItem=this;
		return this;
	}
	
	@SuppressWarnings("deprecation")
	public ItemStack getCraftingRemainingItem(ItemStack stack)
    { 
		if (stack.getItem() instanceof BaseItem) {
        if (!hasCraftingRemainingItem(stack))
        {
            return ItemStack.EMPTY;
        }
        return new ItemStack(craftingRemainingItem);
		} else  return new ItemStack(this.getCraftingRemainingItem());
    }


	public boolean hasCraftingRemainingItem(ItemStack stack)
    {
        return ((BaseItem)stack.getItem()).craftingRemainingItem!=null;
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