package Kamen_Rider_Craft_4TH.blocks.portals;

import java.util.Random;

import Kamen_Rider_Craft_4TH.TokuCraft_core;
import Kamen_Rider_Craft_4TH.util.Refercence;
import Kamen_Rider_Craft_4TH.world.gen.HelhiemTeleporter;
import Kamen_Rider_Craft_4TH.world.gen.modDimensionWorldGen;
import net.minecraft.block.BlockGlass;
import net.minecraft.block.BlockHorizontal;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityTNTPrimed;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.Explosion;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class helheim_crack extends BlockHorizontal {
	protected static final AxisAlignedBB TallBlock = new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 2.0D, 1.0D);

	public helheim_crack() {
		super(Material.GROUND);
		setRegistryName(Refercence.MODID, "helheim_crack");
		setTranslationKey("helheim_crack");
		TokuCraft_core.BLOCKS.add(this);
		TokuCraft_core.ITEMS.add(new ItemBlock(this).setRegistryName(getRegistryName()));
	}



	@SideOnly(Side.CLIENT)
	public BlockRenderLayer getRenderLayer()
	{
		return BlockRenderLayer.CUTOUT;
	}

	@Override
	public void breakBlock(World worldIn, BlockPos pos, IBlockState state) {
		super.breakBlock(worldIn, pos, state);
		Explosion explosion = worldIn.newExplosion(null, pos.getX(), pos.getY(), pos.getY(), 10, false, false);
		explosion.doExplosionA();
		explosion.doExplosionB(true);
	}

	@Override
	public boolean isOpaqueCube(IBlockState state) {
		return false;
	}
	

    @Override
    public boolean isFullCube(IBlockState state)
    {
        return true;
    }
	
    public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos)
    {
        return TallBlock;
    }

	  /**
     * Returns the quantity of items to drop on block destruction.
     */
    public int quantityDropped(Random random)
    {
        return 0;
    }

    /**
     * Called when the block is right clicked by a player.
     */
    public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
    	if(!worldIn.isRemote) {
			if (!playerIn.isRiding() && !playerIn.isBeingRidden() && playerIn.isNonBoss())
			{
			}
			if (playerIn.dimension==modDimensionWorldGen.HELHEIM_DIM_ID){
				playerIn.changeDimension(0, new HelhiemTeleporter());
			}else{
				playerIn.changeDimension(modDimensionWorldGen.HELHEIM_DIM_ID, new HelhiemTeleporter());
			}
            return true;
        }
    	
        return false;
    }
}
