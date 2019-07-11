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
    //public static final WorldType HELHEIM_WORLD_TYPE = new WorldTypeHELHEIM(); // although instance isn't used, must create the instance to register the WorldType

    /**
     * Register dimensions.
     */
    public static final void registerDimensions() {
        DimensionManager.registerDimension(HELHEIM_DIM_ID, HELHEIM_DIM_TYPE);
    }
}