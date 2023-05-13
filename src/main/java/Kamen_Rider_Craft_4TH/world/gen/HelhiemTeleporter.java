package Kamen_Rider_Craft_4TH.world.gen;

import Kamen_Rider_Craft_4TH.RiderItems;
import net.minecraft.block.Block;
import net.minecraft.block.state.pattern.BlockPattern;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.Blocks;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.Teleporter;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;
import net.minecraftforge.common.util.ITeleporter;

public class HelhiemTeleporter implements ITeleporter {
	
    /**
     * Finds a portal near the entity's current coordinates and places the entity there, creating it if necessary.
     */
    public void placeInPortal(Entity entityIn, float rotationYaw, World world)
    {
            if (!this.placeInExistingPortal(entityIn, rotationYaw,world))
            {
                this.makePortal(entityIn,world);
                this.placeInExistingPortal(entityIn, rotationYaw,world);
            }
    }
    

	public boolean placeInExistingPortal(Entity entityIn, float rotationYaw, World world)
    {
        int i = 128;
        double d0 = -1.0D;
        int j = MathHelper.floor(entityIn.posX);
        int k = MathHelper.floor(entityIn.posZ);
        boolean flag = true;
        BlockPos blockpos = BlockPos.ORIGIN;
        long l = ChunkPos.asLong(j, k);

       
            BlockPos blockpos3 = new BlockPos(entityIn);

            for (int i1 = -128; i1 <= 128; ++i1)
            {
                BlockPos blockpos2;

                for (int j1 = -128; j1 <= 128; ++j1)
                {
                    for (BlockPos blockpos1 = blockpos3.add(i1, world.getActualHeight() - 1 - blockpos3.getY(), j1); blockpos1.getY() >= 0; blockpos1 = blockpos2)
                    {
                        blockpos2 = blockpos1.down();

                        if (world.getBlockState(blockpos1).getBlock() == RiderItems.helheim_crack)
                        {
                            for (blockpos2 = blockpos1.down();world.getBlockState(blockpos2).getBlock() == RiderItems.helheim_crack; blockpos2 = blockpos2.down())
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
            if (d0 >= 0.0D)
            {
            
                float f = 0.0F;
                float f1 = 0.0F;
                float f2 = 0.0F;
                float f3 = 0.0F;

                double d5 = (double)blockpos.getX() + 0.5D;
                double d7 = (double)blockpos.getZ() + 0.5D;
                double d6 = (double)blockpos.getY()+ 0.5D;

            double d3 = entityIn.motionX;
            double d4 = entityIn.motionZ;
            entityIn.motionX = d3 * (double)f + d4 * (double)f3;
            entityIn.motionZ = d3 * (double)f2 + d4 * (double)f1;
            entityIn.rotationYaw = rotationYaw;

            if (entityIn instanceof EntityPlayerMP)
            {
                ((EntityPlayerMP)entityIn).connection.setPlayerLocation(d5, calculateGenerationHeight(world,entityIn.posX, entityIn.posZ-2)+2, d7-2, entityIn.rotationYaw, entityIn.rotationPitch);
                return true;
            }
            else
            {
                entityIn.setLocationAndAngles(d5, calculateGenerationHeight(world,entityIn.posX, entityIn.posZ-2)+2, d7-2, entityIn.rotationYaw, entityIn.rotationPitch);
                return true;
            }
            }
            else
            {
                return false;
            }
        }
			
        

    public boolean makePortal(Entity entityIn, World world)
    {
    	int Y = calculateGenerationHeight(world,entityIn.posX, entityIn.posZ);
    	 world.setBlockState(new BlockPos(entityIn.posX,Y+1, entityIn.posZ), RiderItems.helheim_crack.getDefaultState());
		return true;
        }

    @Override
    public void placeEntity(World world, Entity entity, float yaw) {
        placeInPortal(entity, yaw,world);
        //entity.setPosition(entity.posX, 100, entity.posZ);
    }
    
    private static int calculateGenerationHeight(World world, double posX, double posZ) {
		int y = world.getHeight();
		boolean foundGround = false;
			
		while(!foundGround && y-- >= 0) {
			Block block = world.getBlockState(new BlockPos(posX,y,posZ)).getBlock();
			
			foundGround = block != Blocks.AIR;
		}

		return y;
	}
}
