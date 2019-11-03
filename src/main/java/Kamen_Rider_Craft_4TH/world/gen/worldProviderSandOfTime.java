package Kamen_Rider_Craft_4TH.world.gen;


import Kamen_Rider_Craft_4TH.world.BiomeProviderSandOfTime;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.DimensionType;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.biome.BiomeProvider;
import net.minecraft.world.chunk.Chunk;


public class worldProviderSandOfTime extends WorldProvider {
    @Override
    public DimensionType getDimensionType()
    {
        return modDimensionWorldGen.SANDSOFTIME_DIM_TYPE;
    }

    @Override
    protected void init() {
        super.init();
        biomeProvider = new BiomeProviderSandOfTime();
    }

    @Override
    public BiomeProvider getBiomeProvider()     {
        return biomeProvider;
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