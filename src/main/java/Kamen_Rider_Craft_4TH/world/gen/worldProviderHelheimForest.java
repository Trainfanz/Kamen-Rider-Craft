package Kamen_Rider_Craft_4TH.world.gen;



import net.minecraft.util.math.BlockPos;
import net.minecraft.world.DimensionType;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.chunk.Chunk;
import net.minecraft.world.gen.IChunkGenerator;


public class worldProviderHelheimForest extends WorldProvider
{

    @Override
    public DimensionType getDimensionType()
    {
        return modDimensionWorldGen.HELHEIM_DIM_TYPE;
    }
    

    
    /**
     * Returns 'true' if in the "main surface world", but 'false' if in the Nether or End dimensions.
     *
     * @return true, if is surface world
     */
    @Override
    public boolean isSurfaceWorld()
    {
        return true;
    }

    @Override
    public boolean canDoLightning(net.minecraft.world.chunk.Chunk chunk)
    {
        return true;
    }
    

    @Override
    public boolean canDoRainSnowIce(Chunk chunk)
    {
        return false;
    }

    @Override
    public boolean canSnowAt(BlockPos pos, boolean checkLight)
    {
        return false; 
    }
}