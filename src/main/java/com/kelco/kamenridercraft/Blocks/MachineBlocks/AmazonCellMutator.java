package com.kelco.kamenridercraft.Blocks.MachineBlocks;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.kelco.kamenridercraft.Items.Reboot_Rider_Items;

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


public class AmazonCellMutator extends MachineBlock {
	
	  public static List<Item> AMAZON_CELL= new ArrayList<Item>();
		 
    public static final DirectionProperty FACING = BlockStateProperties.HORIZONTAL_FACING;

    public AmazonCellMutator(Properties properties) {
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

     private Item getcellDrop (int num) {
 		Random generator = new Random();
 		if (num==1){
 			int rand = generator.nextInt(AMAZON_CELL.size());
 			return AMAZON_CELL.get(rand);
 		}
		return null;
 	}
   
    @Override
    public InteractionResult use(BlockState pState, Level pLevel, BlockPos pPos,
    		Player pPlayer, InteractionHand pHand, BlockHitResult pHit) {
    	
        if (!pLevel.isClientSide()) {
            if (pPlayer.getItemInHand(pHand).getItem() == Reboot_Rider_Items.AMAZON_CELL_VIAL.get()) process(pPlayer, pLevel, pPos, pHand, getcellDrop(0));
            return  InteractionResult.sidedSuccess(true);
        }
        return InteractionResult.sidedSuccess(false);
    }



	public AmazonCellMutator AddToTabList(List<Block> TabList) {
		TabList.add(this);
		return this;
	}

}