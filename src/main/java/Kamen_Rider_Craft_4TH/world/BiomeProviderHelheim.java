package Kamen_Rider_Craft_4TH.world;


import Kamen_Rider_Craft_4TH.biome.riderBiomes;
import net.minecraft.world.biome.BiomeProviderSingle;

public class BiomeProviderHelheim extends BiomeProviderSingle
{
    
    /**
     * Instantiates a new biome provider cloud.
     */
    public BiomeProviderHelheim()
    {
        super(riderBiomes.Helheim);
        
        // DEBUG
        System.out.println("Constructing BiomeProviderHelheim");
    }
}