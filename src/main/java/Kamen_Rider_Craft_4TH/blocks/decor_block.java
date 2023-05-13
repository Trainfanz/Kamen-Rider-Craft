package Kamen_Rider_Craft_4TH.blocks;

import Kamen_Rider_Craft_4TH.TokuCraft_core;
import Kamen_Rider_Craft_4TH.util.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class decor_block extends Block implements IHasModel {
	public decor_block(String string, Material par3Material,int lv) {
		super(par3Material);
		this.setHarvestLevel("pickaxe", lv);
		setTranslationKey(string);
		setRegistryName(string);

        TokuCraft_core.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
        TokuCraft_core.BLOCKS.add(this);
	}


	@Override
	public void registerModels() {
		TokuCraft_core.proxy.registerItemRender(Item.getItemFromBlock(this),0,"inventory");
	}

}