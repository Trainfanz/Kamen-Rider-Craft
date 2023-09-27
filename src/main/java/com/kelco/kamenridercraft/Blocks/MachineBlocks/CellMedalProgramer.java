package com.kelco.kamenridercraft.Blocks.MachineBlocks;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.kelco.kamenridercraft.Items.OOO_Rider_Items;

import net.minecraft.world.level.block.Block;
import net.minecraft.core.BlockPos;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.phys.BlockHitResult;


public class CellMedalProgramer extends MachineBlock {
	
	  public static List<Item> CELL_MEDAL= new ArrayList<Item>();
		 
    public static final DirectionProperty FACING = BlockStateProperties.HORIZONTAL_FACING;

    public CellMedalProgramer(Properties properties) {
        super(properties);
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

     private Item getCellMedalDrop(int num) {
 		Random generator = new Random();
 			int rand = generator.nextInt(CELL_MEDAL.size());
 			return CELL_MEDAL.get(rand);
 		}
   
    @Override
    public InteractionResult use(BlockState pState, Level pLevel, BlockPos pPos,
    		Player pPlayer, InteractionHand pHand, BlockHitResult pHit) {
    	
        if (!pLevel.isClientSide()) {
            if (pPlayer.getItemInHand(pHand).getItem() == OOO_Rider_Items.CELL_MEDAL.get()) process(pPlayer, pLevel, pPos, pHand, getCellMedalDrop(0));
            return  InteractionResult.sidedSuccess(true);
        }
        return InteractionResult.sidedSuccess(false);
    }



	public CellMedalProgramer AddToTabList(List<Block> TabList) {
		TabList.add(this);
		return this;
	}

}