package Kamen_Rider_Craft_4TH.blocks;

import java.util.Random;

import Kamen_Rider_Craft_4TH.RiderItems;
import Kamen_Rider_Craft_4TH.TokuCraft_core;
import Kamen_Rider_Craft_4TH.util.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.block.BlockFalling;
import net.minecraft.block.BlockFence;
import net.minecraft.block.BlockFurnace;
import net.minecraft.block.BlockHorizontal;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityFurnace;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class solidifyer_block extends BlockFurnace implements IHasModel
{

	 public static final PropertyDirection FACING = BlockHorizontal.FACING;
	public solidifyer_block(String string, Material par3Material,int lv)
	{
		
		super(false);
		this.setHarvestLevel("pickaxe", lv);
		setHardness(9.9F);
		setLightLevel(0.1f);
		setUnlocalizedName(string);
		setRegistryName(string);
		//this.setDefaultState(this.blockState.getBaseState().withProperty(FACING, EnumFacing.NORTH));
        TokuCraft_core.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
        TokuCraft_core.BLOCKS.add(this);
	}

     
    public void onBlockAdded(World worldIn, BlockPos pos, IBlockState state)
    {
        this.setDefaultFacing(worldIn, pos, state);
    }
	
	  private void setDefaultFacing(World worldIn, BlockPos pos, IBlockState state)
	    {
	        if (!worldIn.isRemote)
	        {
	            IBlockState iblockstate = worldIn.getBlockState(pos.north());
	            IBlockState iblockstate1 = worldIn.getBlockState(pos.south());
	            IBlockState iblockstate2 = worldIn.getBlockState(pos.west());
	            IBlockState iblockstate3 = worldIn.getBlockState(pos.east());
	            EnumFacing enumfacing = (EnumFacing)state.getValue(FACING);

	            if (enumfacing == EnumFacing.NORTH && iblockstate.isFullBlock() && !iblockstate1.isFullBlock())
	            {
	                enumfacing = EnumFacing.SOUTH;
	            }
	            else if (enumfacing == EnumFacing.SOUTH && iblockstate1.isFullBlock() && !iblockstate.isFullBlock())
	            {
	                enumfacing = EnumFacing.NORTH;
	            }
	            else if (enumfacing == EnumFacing.WEST && iblockstate2.isFullBlock() && !iblockstate3.isFullBlock())
	            {
	                enumfacing = EnumFacing.EAST;
	            }
	            else if (enumfacing == EnumFacing.EAST && iblockstate3.isFullBlock() && !iblockstate2.isFullBlock())
	            {
	                enumfacing = EnumFacing.WEST;
	            }

	            worldIn.setBlockState(pos, state.withProperty(FACING, enumfacing), 2);
	        }
	    }

	
	@Override
	public void registerModels() {
		TokuCraft_core.proxy.registerItemRender(Item.getItemFromBlock(this),0,"inventory");
	}
	

    /**
     * Called when the block is right clicked by a player.
     */
    public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ)
    {
    	
    	if (!worldIn.isRemote)
	    {
    	if (playerIn.getHeldItem(hand).getItem()==RiderItems.full_bottle){
    	      worldIn.playSound((double)pos.getX() + 0.5D, (double)pos.getY(), (double)pos.getZ() + 0.5D, SoundEvents.BLOCK_NOTE_BELL, SoundCategory.BLOCKS, 1.0F, 1.0F, false);
              
    		playerIn.dropItem(RiderItems.sclashjelly, 1);	
    		playerIn.getHeldItem(hand).shrink(1);
    		  return true;
    	}else if (playerIn.getHeldItem(hand).getItem()==RiderItems.dragon_full_bottle){
  	      worldIn.playSound((double)pos.getX() + 0.5D, (double)pos.getY(), (double)pos.getZ() + 0.5D, SoundEvents.BLOCK_NOTE_BELL, SoundCategory.BLOCKS, 1.0F, 1.0F, false);
          
  		playerIn.dropItem(RiderItems.dragon_sclashjelly, 1);	
  		playerIn.getHeldItem(hand).shrink(1);
  		  return true;
  	}else if (playerIn.getHeldItem(hand).getItem()==RiderItems.robo_full_bottle){
	      worldIn.playSound((double)pos.getX() + 0.5D, (double)pos.getY(), (double)pos.getZ() + 0.5D, SoundEvents.BLOCK_NOTE_BELL, SoundCategory.BLOCKS, 1.0F, 1.0F, false);
          
		playerIn.dropItem(RiderItems.robot_sclashjelly, 1);	
		playerIn.getHeldItem(hand).shrink(1);
		  return true;
	}
    	  return true;
	    }
    	
        return false;
    }

}