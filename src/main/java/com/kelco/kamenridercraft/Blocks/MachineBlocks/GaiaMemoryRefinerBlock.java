package com.kelco.kamenridercraft.Blocks.MachineBlocks;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.kelco.kamenridercraft.Items.W_Rider_Items;

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


public class GaiaMemoryRefinerBlock extends MachineBlock {
	
	  public static List<Item> GAIA_MEMORY_G= new ArrayList<Item>();
	  public static List<Item> GAIA_MEMORY_S= new ArrayList<Item>();
	  public static List<Item> GAIA_MEMORY_T2= new ArrayList<Item>();
		 
    public static final DirectionProperty FACING = BlockStateProperties.HORIZONTAL_FACING;

    public GaiaMemoryRefinerBlock(Properties properties) {
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

     private Item getmemoryDrop(int num) {
 		Random generator = new Random();
 		if (num==1){
 			int rand = generator.nextInt(GAIA_MEMORY_S.size());
 			return GAIA_MEMORY_S.get(rand);
 		} else if (num==2){
 			int rand = generator.nextInt(GAIA_MEMORY_T2.size());
 			return GAIA_MEMORY_T2.get(rand);
 		} else{
 			int rand = generator.nextInt(GAIA_MEMORY_G.size());
 			return GAIA_MEMORY_G.get(rand);
 		}
 	}
   
    @Override
    public InteractionResult use(BlockState pState, Level pLevel, BlockPos pPos,
    		Player pPlayer, InteractionHand pHand, BlockHitResult pHit) {
    	
        if (!pLevel.isClientSide()) {
            if (pPlayer.getItemInHand(pHand).getItem() == W_Rider_Items.UNREFINED_MEMORY_G.get()) process(pPlayer, pLevel, pPos, pHand, getmemoryDrop(0));
			else if (pPlayer.getItemInHand(pHand).getItem() == W_Rider_Items.UNREFINED_MEMORY_S.get()) process(pPlayer, pLevel, pPos, pHand, getmemoryDrop(1));
			else if (pPlayer.getItemInHand(pHand).getItem() == W_Rider_Items.UNREFINED_MEMORY_T2.get()) process(pPlayer, pLevel, pPos, pHand, getmemoryDrop(2));
            return  InteractionResult.sidedSuccess(true);
        }
        return InteractionResult.sidedSuccess(false);
    }



	public GaiaMemoryRefinerBlock AddToTabList(List<Block> TabList) {
		TabList.add(this);
		return this;
	}

}