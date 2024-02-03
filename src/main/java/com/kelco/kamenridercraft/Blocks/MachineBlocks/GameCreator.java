package com.kelco.kamenridercraft.Blocks.MachineBlocks;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.kelco.kamenridercraft.Items.Ex_Aid_Rider_Items;

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


public class GameCreator extends MachineBlock {
	
	  public static List<Item> BLANK_GASHAT= new ArrayList<Item>();
	  public static List<Item> BLANK_DOUBLE_GASHAT= new ArrayList<Item>();
	  public static List<Item> BLANK_MAXIMUM_GASHAT= new ArrayList<Item>();
	  public static List<Item> BLANK_HYPER_GASHAT= new ArrayList<Item>();
	  public static List<Item> BLANK_CHRONICLE_GASHAT= new ArrayList<Item>();
		 
    public static final DirectionProperty FACING = BlockStateProperties.HORIZONTAL_FACING;

    public GameCreator(Properties properties) {
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

     private Item getgashatDrop(int num) {
 		Random generator = new Random();
 		if (num==1){
 			int rand = generator.nextInt(BLANK_GASHAT.size());
 			return BLANK_GASHAT.get(rand);
 		} else if (num==2){
 			int rand = generator.nextInt(BLANK_DOUBLE_GASHAT.size());
 			return BLANK_DOUBLE_GASHAT.get(rand);
 		} else if (num==3){
 			int rand = generator.nextInt(BLANK_HYPER_GASHAT.size());
 			return BLANK_HYPER_GASHAT.get(rand);
 		} else if (num==4){
 			int rand = generator.nextInt(BLANK_CHRONICLE_GASHAT.size());
 			return BLANK_CHRONICLE_GASHAT.get(rand);
 		} else{
 			int rand = generator.nextInt(BLANK_MAXIMUM_GASHAT.size());
 			return BLANK_MAXIMUM_GASHAT.get(rand);
 		}
 	}
   
    @Override
    public InteractionResult use(BlockState pState, Level pLevel, BlockPos pPos,
    		Player pPlayer, InteractionHand pHand, BlockHitResult pHit) {
    	
        if (!pLevel.isClientSide()) {
            if (pPlayer.getItemInHand(pHand).getItem() == Ex_Aid_Rider_Items.UNFINISHED_MAXIMUN_MIGHTY_X_GASHAT.get()) process(pPlayer, pLevel, pPos, pHand, getgashatDrop(0));
			else if (pPlayer.getItemInHand(pHand).getItem() == Ex_Aid_Rider_Items.BLANK_GASHAT.get()) process(pPlayer, pLevel, pPos, pHand, getgashatDrop(1));
			else if (pPlayer.getItemInHand(pHand).getItem() == Ex_Aid_Rider_Items.MIGHTY_BROTHERS_XX_UNFINISHED_GASHAT.get()) process(pPlayer, pLevel, pPos, pHand, getgashatDrop(2));
			else if (pPlayer.getItemInHand(pHand).getItem() == Ex_Aid_Rider_Items.UNFINISHED_HYPER_MUTEKI_GASHAT.get()) process(pPlayer, pLevel, pPos, pHand, getgashatDrop(3));
			else if (pPlayer.getItemInHand(pHand).getItem() == Ex_Aid_Rider_Items.UNFINISHED_KAMEN_RIDER_CHRONICLE_GASHAT.get()) process(pPlayer, pLevel, pPos, pHand, getgashatDrop(4));
            return  InteractionResult.sidedSuccess(true);
        }
        return InteractionResult.sidedSuccess(false);
    }



	public GameCreator AddToTabList(List<Block> TabList) {
		TabList.add(this);
		return this;
	}

}