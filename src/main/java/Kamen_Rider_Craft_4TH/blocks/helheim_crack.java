package Kamen_Rider_Craft_4TH.blocks;

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
import net.minecraft.item.ItemBlock;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.Explosion;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class helheim_crack extends BlockHorizontal {
	protected static final AxisAlignedBB CACTUS_COLLISION_AABB = new AxisAlignedBB(0.0625D, 0.0D, 0.0625D, 0.9375D, 0.9375D, 0.9375D);

	public helheim_crack() {
		super(Material.GROUND);
		setRegistryName(Refercence.MODID, "helheim_crack");
		setTranslationKey("helheim_crack");
		TokuCraft_core.BLOCKS.add(this);
		TokuCraft_core.ITEMS.add(new ItemBlock(this).setRegistryName(getRegistryName()));
	}

	public AxisAlignedBB getCollisionBoundingBox(IBlockState blockState, IBlockAccess worldIn, BlockPos pos) {
		return CACTUS_COLLISION_AABB;
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
	public void onEntityCollision(World worldIn, BlockPos pos, IBlockState state, Entity entityIn) {
		if(!worldIn.isRemote) {
			if (!entityIn.isRiding() && !entityIn.isBeingRidden() && entityIn.isNonBoss())
			{
			}
			if (entityIn.dimension==modDimensionWorldGen.HELHEIM_DIM_ID){
				entityIn.changeDimension(0, new HelhiemTeleporter());
			}else{
				entityIn.changeDimension(modDimensionWorldGen.HELHEIM_DIM_ID, new HelhiemTeleporter());
			}
		}
	}
}
