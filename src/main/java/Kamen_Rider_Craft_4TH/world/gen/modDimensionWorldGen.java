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
   
    /**
     * Register dimensions.
     */
    public static final void registerDimensions() {
        DimensionManager.registerDimension(HELHEIM_DIM_ID, HELHEIM_DIM_TYPE);
        DimensionManager.registerDimension(SANDSOFTIME_DIM_ID, SANDSOFTIME_DIM_TYPE);
    }
}