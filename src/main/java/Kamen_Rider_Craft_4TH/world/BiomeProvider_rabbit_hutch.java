package Kamen_Rider_Craft_4TH.world;


import Kamen_Rider_Craft_4TH.biome.riderBiomes;
import net.minecraft.world.biome.BiomeProviderSingle;

public class BiomeProvider_rabbit_hutch extends BiomeProviderSingle
{
    
    /**
     * Instantiates a new biome provider cloud.
     */
    public BiomeProvider_rabbit_hutch()
    {
        super(riderBiomes.RABBIT_HUTCH);
        
        // DEBUG
        System.out.println("Constructing BiomeProvider_rabbit_hutch");
    }
}