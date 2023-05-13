package Kamen_Rider_Craft_4TH.world;


import Kamen_Rider_Craft_4TH.biome.riderBiomes;
import net.minecraft.world.biome.BiomeProviderSingle;

public class BiomeProvider_northern_base extends BiomeProviderSingle
{
    
    /**
     * Instantiates a new biome provider cloud.
     */
    public BiomeProvider_northern_base()
    {
        super(riderBiomes.NORTHERN_BASE);
        
        // DEBUG
        System.out.println("Constructing BiomeProviderNorthernBase");
    }
}