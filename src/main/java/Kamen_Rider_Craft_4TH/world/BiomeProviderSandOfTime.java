package Kamen_Rider_Craft_4TH.world;


import Kamen_Rider_Craft_4TH.biome.riderBiomes;
import net.minecraft.world.biome.BiomeProviderSingle;

public class BiomeProviderSandOfTime extends BiomeProviderSingle
{
    
    /**
     * Instantiates a new biome provider cloud.
     */
    public BiomeProviderSandOfTime()
    {
        super(riderBiomes.SandOfTime);
        
        // DEBUG
        System.out.println("Constructing BiomeProviderSandOfTime");
    }
}