package Kamen_Rider_Craft_4TH.item;


import java.util.List;

import Kamen_Rider_Craft_4TH.TokuCraft_core;
import Kamen_Rider_Craft_4TH.item.rider_armor_base.Item_form_change;
import Kamen_Rider_Craft_4TH.item.wizard.Item_wizard_ring;
import Kamen_Rider_Craft_4TH.util.IHasModel;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;


public class Item_ore extends Item implements IHasModel
{

    public Item_ore(String name)
    {
        super();
        this.setMaxDamage(0);
        maxStackSize = 64;
        setTranslationKey(name);
        setRegistryName(name);
        TokuCraft_core.ITEMS.add(this);

    }
    
	public  Item_ore keep_item()
	{
		this.setContainerItem(this);
		getContainerItem();
		return this;
	}
	
	public  Item_ore keep_item(Item item)
	{
		this.setContainerItem(item);
		getContainerItem();
		return this;
	}
	
	public Item_ore AddToList(List<Item> list,int num)
	{
		for (int i1 = 0; i1 < num; ++i1)
		{
			list.add(this);
		}
		return this;
	}


	@Override
	public void registerModels() {
		TokuCraft_core.proxy.registerItemRender(this,0,"inventory");
	}

	}
