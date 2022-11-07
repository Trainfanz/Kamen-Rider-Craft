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


public class Item_Beltpart extends Item implements IHasModel
{

    public Item_Beltpart(String name)
    {
        super();
        this.setMaxDamage(0);
        setTranslationKey(name);
        setRegistryName(name);
        TokuCraft_core.ITEMS.add(this);

    }
    
	@Override
	public void registerModels() {
		TokuCraft_core.proxy.registerItemRender(this,0,"inventory");
	}

	}
