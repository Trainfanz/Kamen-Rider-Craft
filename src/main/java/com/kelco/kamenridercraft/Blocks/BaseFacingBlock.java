package com.kelco.kamenridercraft.Blocks;


import java.util.List;

import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.material.PushReaction;
public class BaseFacingBlock extends Block {


	public static final DirectionProperty FACING = BlockStateProperties.HORIZONTAL_FACING;

	public BaseFacingBlock(Properties prop) {
		super(prop);
		
	}

	  protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> p_53681_) {
	        p_53681_.add(FACING);
	     }

	     public BlockState getStateForPlacement(BlockPlaceContext p_53679_) {
	        return this.defaultBlockState().setValue(FACING, p_53679_.getHorizontalDirection().getOpposite());
	     }

	     public PushReaction getPistonPushReaction(BlockState p_53683_) {
	        return PushReaction.PUSH_ONLY;
	     }

	
	public BaseFacingBlock AddToTabList(List<Block> TabList) {
		TabList.add(this);
		return this;
	}

}