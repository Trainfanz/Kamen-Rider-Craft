package com.kelco.kamenridercraft.Blocks;


import java.util.List;
import net.minecraft.world.level.block.Block;
public class BaseBlock extends Block {



	public BaseBlock(Properties prop) {
		super(prop);
		
	}

	public BaseBlock AddToTabList(List<Block> TabList) {
		TabList.add(this);
		return this;
	}

}