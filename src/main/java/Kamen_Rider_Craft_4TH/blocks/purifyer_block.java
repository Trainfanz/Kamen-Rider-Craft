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

public class purifyer_block extends BlockFurnace implements IHasModel
{

	 public static final PropertyDirection FACING = BlockHorizontal.FACING;
	public purifyer_block(String string, Material par3Material,int lv)
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
	
	public Item getBottleDrop(Item bottle){
		Random generator = new Random();
		
		
		if (bottle==RiderItems.smash_bottle){
			
			int rand = generator.nextInt(420);
			if (rand<30){
				return RiderItems.rabbit_full_bottle;
			}else if (rand<40){
				return RiderItems.tank_full_bottle;
			}else if (rand<50){
				return RiderItems.gorilla_full_bottle;
			}else if (rand<60){
				return RiderItems.diamond_full_bottle;
			}else if (rand<70){
				return RiderItems.taka_full_bottle;
			}else if (rand<80){
				return RiderItems.gatling_full_bottle;
			}else if (rand<90){
				return RiderItems.ninjya_full_bottle;
			}else if (rand<100){
				return RiderItems.comic_full_bottle;
			}else if (rand<110){
				return RiderItems.rocket_full_bottle;
			}else if (rand<120){
				return RiderItems.panda_full_bottle;
			}else if (rand<130){
				return RiderItems.harinezumi_full_bottle;
			}else if (rand<140){
				return RiderItems.shoubousha_full_bottle;
			}else if (rand<150){
				return RiderItems.lion_full_bottle;
			}else if (rand<160){
				return RiderItems.soujiki_full_bottle;
			}else if (rand<170){
				return RiderItems.lock_full_bottle;
			}else if (rand<180){
				return RiderItems.dragon_full_bottle;
			}else if (rand<190){
				return RiderItems.ressha_full_bottle;
			}else if (rand<200){
				return RiderItems.kaizoku_full_bottle;
			}else if (rand<210){
				return RiderItems.octopus_full_bottle;
			}else if (rand<220){
				return RiderItems.light_full_bottle;
			}else if (rand<225){
				return RiderItems.sai_full_bottle;
			}else if (rand<230){
				return RiderItems.dryer_full_bottle;
			}else if (rand<235){
				return RiderItems.kuma_full_bottle;
			}else if (rand<240){
				return RiderItems.televi_full_bottle;
			}else if (rand<245){
				return RiderItems.wolf_full_bottle;
			}else if (rand<250){
				return RiderItems.smartphone_full_bottle;
			}else if (rand<255){
				return RiderItems.phoenix_full_bottle;
			}else if (rand<260){
				return RiderItems.robo_full_bottle;
			}else if (rand<265){
				return RiderItems.cake_full_bottle;
			}else if (rand<270){
				return RiderItems.santa_full_bottle;
			}else if (rand<275){
				return RiderItems.dog_full_bottle;
			}else if (rand<280){
				return RiderItems.mic_full_bottle;
			}else if (rand<285){
				return RiderItems.beetle_full_bottle;
			}else if (rand<290){
				return RiderItems.camera_full_bottle;
			}else if (rand<295){
				return RiderItems.helicopter_full_bottle;
			}else if (rand<300){
				return RiderItems.rose_full_bottle;
			}else if (rand<305){
				return RiderItems.turtle_full_bottle;
			}else if (rand<310){
				return RiderItems.watch_full_bottle;
			}else if (rand<315){
				return RiderItems.unicorn_full_bottle;
			}else if (rand<320){
				return RiderItems.eraser_full_bottle;
			}else if (rand<325){
				return RiderItems.spider_full_bottle;
			}else if (rand<330){
				return RiderItems.fridge_full_bottle;
			}else if (rand<335){
				return RiderItems.tora_full_bottle;
			}else if (rand<340){
				return RiderItems.ufo_full_bottle;
			}else if (rand<345){
				return RiderItems.kujira_full_bottle;
			}else if (rand<350){
				return RiderItems.jet_full_bottle;
			}else if (rand<355){
				return RiderItems.kirin_full_bottle;
			}else if (rand<360){
				return RiderItems.cyclone_full_bottle;		
			}else if (rand<365){
				return RiderItems.bat_full_bottle_2;
			}else if (rand<370){
				return RiderItems.engine_full_bottle;
			}else if (rand<375){
				return RiderItems.obake_full_bottle;
			}else if (rand<380){
				return RiderItems.same_full_bottle;
			}else if (rand<385){
				return RiderItems.bike_full_bottle;
			}else if (rand<390){
				return RiderItems.magnet_full_bottle;
			}else if (rand<395){
				return RiderItems.hachi_full_bottle;
			}else if (rand<400){
				return RiderItems.submarine_full_bottle;
			}else if (rand<405){
				return RiderItems.penguin_full_bottle;
			}else if (rand<410){
				return RiderItems.skateboard_full_bottle;
			}else if (rand<415){
				return RiderItems.deer_full_bottle;
			}else if (rand<420){
				return RiderItems.pyramid_full_bottle;
			}{
				return bottle;
			}
			}
		return RiderItems.rabbit_full_bottle;
	}
	
	

    /**
     * Returns a new instance of a block's tile entity class. Called on placing the block.
     */
    public TileEntity createNewTileEntity(World worldIn, int meta)
    {
        return null;
    }
    /**
     * Called when the block is right clicked by a player.
     */
    public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ)
    {
    	
    	if (!worldIn.isRemote)
	    {
    	if (playerIn.getHeldItem(hand).getItem()==RiderItems.smash_bottle){
    	      worldIn.playSound((double)pos.getX() + 0.5D, (double)pos.getY(), (double)pos.getZ() + 0.5D, SoundEvents.BLOCK_NOTE_BELL, SoundCategory.BLOCKS, 1.0F, 1.0F, false);
              
    		playerIn.dropItem(getBottleDrop(playerIn.getHeldItem(hand).getItem()), 1);	
    		playerIn.getHeldItem(hand).shrink(1);
    		  return true;
    	}else if (playerIn.getHeldItem(hand).getItem()==RiderItems.ex_aid_full_bottle){
  	      worldIn.playSound((double)pos.getX() + 0.5D, (double)pos.getY(), (double)pos.getZ() + 0.5D, SoundEvents.BLOCK_NOTE_BELL, SoundCategory.BLOCKS, 1.0F, 1.0F, false);
          
  		playerIn.dropItem(RiderItems.doctor_full_bottle, 1);	
  		playerIn.dropItem(RiderItems.game_full_bottle, 1);
  		playerIn.getHeldItem(hand).shrink(1);
  		  return true;
  	}
    	  return true;
	    }
    	
        return false;
    }
}