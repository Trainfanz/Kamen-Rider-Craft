package Kamen_Rider_Craft_4TH.blocks.wood;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.annotation.Nullable;

import Kamen_Rider_Craft_4TH.TokuCraft_core;
import Kamen_Rider_Craft_4TH.util.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.block.BlockVine;
import net.minecraft.block.state.BlockFaceShape;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class BlockHelheimVine extends BlockVine implements IHasModel {
	public static final List<Item> LOCKSEED = new ArrayList<Item>();

	public BlockHelheimVine(String string) {
		super();
		setTranslationKey(string);
		setRegistryName(string);

		TokuCraft_core.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
		TokuCraft_core.BLOCKS.add(this);
	}


	private Item getLockseed() {
		Random generator = new Random();
		int rand = generator.nextInt(LOCKSEED.size());
		return LOCKSEED.get(rand);
	}

	/**
     * Get the Item that this Block should drop when harvested.
     */
	@Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune)
    {
        return getLockseed();
    }
	
	/**
	 * Spawns the block's drops in the world. By the time this is called the Block has possibly been set to air via
	 * Block.removedByPlayer
	 */
	@Override
	public void harvestBlock(World worldIn, EntityPlayer player, BlockPos pos, IBlockState state, @Nullable TileEntity te, ItemStack stack) {
		spawnAsEntity(worldIn, pos, new ItemStack(getLockseed(), 1, 0));
	}

	/**
     * Returns the quantity of items to drop on block destruction.
	 */
    public int quantityDropped(Random random)
    {
        return 1;
    }

    @Override
	public boolean canAttachTo(World world, BlockPos pos, EnumFacing facing) {
    	Block block = world.getBlockState(pos.up()).getBlock();
    	return this.isAcceptableNeighbor(world, pos.offset(facing.getOpposite()), facing) && (block == Blocks.AIR || block == this || block == Blocks.VINE || this.isAcceptableNeighbor(world, pos.up(), EnumFacing.UP));
    }
	
    private boolean isAcceptableNeighbor(World world, BlockPos pos, EnumFacing facing) {
    	IBlockState iblockstate = world.getBlockState(pos);
    	return iblockstate.getBlockFaceShape(world, pos, facing) == BlockFaceShape.SOLID && !isExceptBlockForAttaching(iblockstate.getBlock());
    }

	@Override
	public void registerModels() {
		TokuCraft_core.proxy.registerItemRender(Item.getItemFromBlock(this),0,"inventory");
	}
}