package com.kelco.kamenridercraft.Blocks;


import java.util.List;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.state.BlockState;
public class BaseStairsBlock extends StairBlock {


	public BaseStairsBlock(BlockState state ,Properties prop) {
		super(state, prop);
		
		
	}

	public BaseStairsBlock AddToTabList(List<Block> TabList) {
		TabList.add(this);
		return this;
	}

}