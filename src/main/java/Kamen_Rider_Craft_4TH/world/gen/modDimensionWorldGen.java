package Kamen_Rider_Craft_4TH.world.gen;

import javax.annotation.Nullable;

//import com.blogspot.jabelarminecraft.examplemod.worldgen.WorldTypeHELHEIM;

import net.minecraft.world.DimensionType;
import net.minecraft.world.WorldType;
import net.minecraftforge.common.DimensionManager;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.registry.VillagerRegistry.IVillageCreationHandler;

// TODO: Auto-generated Javadoc
public class modDimensionWorldGen
{  
    public static final String HELHEIM_NAME = "helheim";
    public static final int HELHEIM_DIM_ID = DimensionManager.getNextFreeDimId();
    public static final DimensionType HELHEIM_DIM_TYPE = DimensionType.register(HELHEIM_NAME, "_"+HELHEIM_NAME, HELHEIM_DIM_ID, worldProviderHelheimForest.class, true);
    

    public static final String SANDSOFTIME_NAME = "sand_of_time";
    public static final int SANDSOFTIME_DIM_ID = DimensionManager.getNextFreeDimId()+1;
    public static final DimensionType SANDSOFTIME_DIM_TYPE = DimensionType.register(SANDSOFTIME_NAME, "_"+SANDSOFTIME_NAME, SANDSOFTIME_DIM_ID, worldProviderSandOfTime.class, true);
   
    public static final String NORTHERN_BASE_NAME = "northern_base";
    public static final int NORTHERN_BASE_DIM_ID = DimensionManager.getNextFreeDimId()+2;
    public static final DimensionType NORTHERN_BASE_DIM_TYPE = DimensionType.register(NORTHERN_BASE_NAME, "_"+NORTHERN_BASE_NAME, NORTHERN_BASE_DIM_ID, worldProvider_northern_base.class, true);
    
    public static final String RABBIT_HUTCH_NAME = "rabbit_hutch";
    public static final int RABBIT_HUTCH_DIM_ID = DimensionManager.getNextFreeDimId()+4;
    public static final DimensionType RABBIT_HUTCH_DIM_TYPE = DimensionType.register(RABBIT_HUTCH_NAME, "_"+RABBIT_HUTCH_NAME, RABBIT_HUTCH_DIM_ID, worldProvider_rabbit_hutch.class, true);
  
    /**
     * Register dimensions.
     */
    public static final void registerDimensions() {
        DimensionManager.registerDimension(HELHEIM_DIM_ID, HELHEIM_DIM_TYPE);
        DimensionManager.registerDimension(SANDSOFTIME_DIM_ID, SANDSOFTIME_DIM_TYPE);
        DimensionManager.registerDimension(NORTHERN_BASE_DIM_ID, NORTHERN_BASE_DIM_TYPE);
        DimensionManager.registerDimension(RABBIT_HUTCH_DIM_ID, RABBIT_HUTCH_DIM_TYPE);
    }
}