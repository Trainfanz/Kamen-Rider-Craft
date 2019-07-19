package Kamen_Rider_Craft_4TH.world.gen.generators;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockBush;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

public class WorldGenblocks extends WorldGenerator
{
    private final Block block;

    public WorldGenblocks(Block helheim_crack)
    {
        this.block = helheim_crack;
    }

    private static int calculateGenerationHeight(World world, int x, int z) {
		int y = world.getHeight();
		boolean foundGround = false;
			
		while(!foundGround && y-- >= 0) {
			Block block = world.getBlockState(new BlockPos(x,y,z)).getBlock();
			
			foundGround = block != Blocks.AIR&&block != Blocks.TALLGRASS&&block != Blocks.LEAVES&&block != Blocks.LEAVES2;
		}

		return y+1;
	}
    
    public boolean generate(World worldIn, Random rand, BlockPos position)
    {
    	int X =position.getX()+(rand.nextInt(8) - rand.nextInt(8));
    	int Z=position.getZ()+(rand.nextInt(8) - rand.nextInt(8));
    	int Y = calculateGenerationHeight(worldIn, X, Z); 
            BlockPos blockpos = new BlockPos(X,Y,Z);
            if (worldIn.isAirBlock(blockpos) && (!worldIn.provider.isNether())|| blockpos.getY() < worldIn.getHeight() - 1)
            {
                worldIn.setBlockState(blockpos, this.block.getDefaultState());
                worldIn.setBlockState(blockpos.up(1), Blocks.AIR.getDefaultState());
            
            }

        return true;
            }
}