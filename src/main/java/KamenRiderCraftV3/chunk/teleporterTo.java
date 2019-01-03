package KamenRiderCraftV3.chunk;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import net.minecraft.block.state.pattern.BlockPattern;
import net.minecraft.entity.Entity;
import net.minecraft.init.Blocks;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.LongHashMap;
import net.minecraft.util.MathHelper;
import net.minecraft.world.ChunkCoordIntPair;
import net.minecraft.world.Teleporter;
import net.minecraft.world.WorldServer;

public class teleporterTo extends Teleporter {

	private final WorldServer worldServerInstance;
	private final Random random; 

	/** Stores successful portal placement locations for rapid lookup. */
	private final LongHashMap destinationCoordinateCache2 = new LongHashMap();

	/**
	 * A list of valid keys for the destinationCoordainteCache. These are based on the X & Z of the players initial
	 * location.
	 */
	private final List destinationCoordinateKeys2 = new ArrayList();

	public teleporterTo(WorldServer par1WorldServer) {
		super(par1WorldServer);


		this.worldServerInstance = par1WorldServer;
		this.random = new Random(par1WorldServer.getSeed());
	}
	@Override
	 public void placeInPortal(Entity entityIn, float rotationYaw)
    {
		if (this.worldServerInstance.provider.getDimensionId() != 1)
		{
			 if (!this.placeInExistingPortal(entityIn, rotationYaw))
	            {
				this.makePortal(entityIn);
				 this.placeInExistingPortal(entityIn, rotationYaw);
			}
		}
		else
		{
			   int i = MathHelper.floor_double(entityIn.posX);
	            int j = MathHelper.floor_double(entityIn.posY) - 1;
	            int k = MathHelper.floor_double(entityIn.posZ);
	            int l = 1;
	            int i1 = 0;

	            for (int j1 = -2; j1 <= 2; ++j1)
	            {
	                for (int k1 = -2; k1 <= 2; ++k1)
	                {
	                    for (int l1 = -1; l1 < 3; ++l1)
	                    {
	                        int i2 = i + k1 * l + j1 * i1;
	                        int j2 = j + l1;
	                        int k2 = k + k1 * i1 - j1 * l;
	                        boolean flag = l1 < 0;
						this.worldServerInstance.setBlockState(new BlockPos(i2, j2, k2),Blocks.air.getDefaultState());
					}
				}
			}

			entityIn.setLocationAndAngles((double)i, (double)j, (double)k, entityIn.rotationYaw, 0.0F);
			entityIn.motionX = entityIn.motionY = entityIn.motionZ = 0.0D;
		}
	}


	 public boolean placeInExistingPortal(Entity entityIn, float rotationYaw)
	    {
	        int i = 128;
	        double d0 = -1.0D;
	        int j = MathHelper.floor_double(entityIn.posX);
	        int k = MathHelper.floor_double(entityIn.posZ);
	        boolean flag = true;
	        BlockPos blockpos = BlockPos.ORIGIN;
	        long l = ChunkCoordIntPair.chunkXZ2Int(j, k);

	        
	     
	        {
	            BlockPos blockpos3 = new BlockPos(entityIn);

	            for (int i1 = -128; i1 <= 128; ++i1)
	            {
	                BlockPos blockpos2;

	                for (int j1 = -128; j1 <= 128; ++j1)
	                {
	                    for (BlockPos blockpos1 = blockpos3.add(i1, this.worldServerInstance.getActualHeight() - 1 - blockpos3.getY(), j1); blockpos1.getY() >= 0; blockpos1 = blockpos2)
	                    {
	                        blockpos2 = blockpos1.down();

	                        if (this.worldServerInstance.getBlockState(blockpos1).getBlock() == Blocks.portal)
	                        {
	                            while (this.worldServerInstance.getBlockState(blockpos2 = blockpos1.down()).getBlock() == Blocks.portal)
	                            {
	                                blockpos1 = blockpos2;
	                            }

	                            double d1 = blockpos1.distanceSq(blockpos3);

	                            if (d0 < 0.0D || d1 < d0)
	                            {
	                                d0 = d1;
	                                blockpos = blockpos1;
	                            }
	                        }
	                    }
	                }
	            }
	        }

	        if (d0 >= 0.0D)
	        {
	          

	            double d5 = (double)blockpos.getX() + 0.5D;
	            double d6 = (double)blockpos.getY() + 0.5D;
	            double d7 = (double)blockpos.getZ() + 0.5D;
	            BlockPattern.PatternHelper blockpattern$patternhelper = Blocks.portal.func_181089_f(this.worldServerInstance, blockpos);
	            boolean flag1 = blockpattern$patternhelper.getFinger().rotateY().getAxisDirection() == EnumFacing.AxisDirection.NEGATIVE;
	            double d2 = blockpattern$patternhelper.getFinger().getAxis() == EnumFacing.Axis.X ? (double)blockpattern$patternhelper.func_181117_a().getZ() : (double)blockpattern$patternhelper.func_181117_a().getX();
	            d6 = (double)(blockpattern$patternhelper.func_181117_a().getY() + 1) - entityIn.func_181014_aG().yCoord * (double)blockpattern$patternhelper.func_181119_e();

	            if (flag1)
	            {
	                ++d2;
	            }

	            if (blockpattern$patternhelper.getFinger().getAxis() == EnumFacing.Axis.X)
	            {
	                d7 = d2 + (1.0D - entityIn.func_181014_aG().xCoord) * (double)blockpattern$patternhelper.func_181118_d() * (double)blockpattern$patternhelper.getFinger().rotateY().getAxisDirection().getOffset();
	            }
	            else
	            {
	                d5 = d2 + (1.0D - entityIn.func_181014_aG().xCoord) * (double)blockpattern$patternhelper.func_181118_d() * (double)blockpattern$patternhelper.getFinger().rotateY().getAxisDirection().getOffset();
	            }

	            float f = 0.0F;
	            float f1 = 0.0F;
	            float f2 = 0.0F;
	            float f3 = 0.0F;

	            if (blockpattern$patternhelper.getFinger().getOpposite() == entityIn.func_181012_aH())
	            {
	                f = 1.0F;
	                f1 = 1.0F;
	            }
	            else if (blockpattern$patternhelper.getFinger().getOpposite() == entityIn.func_181012_aH().getOpposite())
	            {
	                f = -1.0F;
	                f1 = -1.0F;
	            }
	            else if (blockpattern$patternhelper.getFinger().getOpposite() == entityIn.func_181012_aH().rotateY())
	            {
	                f2 = 1.0F;
	                f3 = -1.0F;
	            }
	            else
	            {
	                f2 = -1.0F;
	                f3 = 1.0F;
	            }

	            double d3 = entityIn.motionX;
	            double d4 = entityIn.motionZ;
	            entityIn.motionX = d3 * (double)f + d4 * (double)f3;
	            entityIn.motionZ = d3 * (double)f2 + d4 * (double)f1;
	            entityIn.rotationYaw = rotationYaw - (float)(entityIn.func_181012_aH().getOpposite().getHorizontalIndex() * 90) + (float)(blockpattern$patternhelper.getFinger().getHorizontalIndex() * 90);
	            entityIn.setLocationAndAngles(d5, d6, d7, entityIn.rotationYaw, entityIn.rotationPitch);
	            return true;
	        }
	        else
	        {
	            return false;
	        }
	    }
	@Override
	public boolean makePortal(Entity par1Entity)
	{
		byte b0 = 16;
		double d0 = -1.0D;
		int i = MathHelper.floor_double(par1Entity.posX);
		int j = MathHelper.floor_double(par1Entity.posY);
		int k = MathHelper.floor_double(par1Entity.posZ);

		for (int n = 0; n < 50; ++n)
		{
			if (this.worldServerInstance.isAirBlock(new BlockPos(i, j+n, k))){
				
					
					this.worldServerInstance.setBlockState( new BlockPos(i, j+n-1, k), Blocks.air.getDefaultState());
					n=50;
				
			} 
		}
			
	



		return true;
	}




}
