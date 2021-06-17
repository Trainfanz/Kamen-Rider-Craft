package Kamen_Rider_Craft_4TH.biome;

import Kamen_Rider_Craft_4TH.util.Refercence;
import Kamen_Rider_Craft_4TH.world.gen.modDimensionWorldGen;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.common.BiomeManager.BiomeEntry;
import net.minecraftforge.common.BiomeManager.BiomeType;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;
import net.minecraftforge.registries.IForgeRegistry;

@ObjectHolder(Refercence.MODID)
public class riderBiomes
{
    // instantiate Biomes
    public final static biomeHelheim Helheim = new biomeHelheim();
    public final static biomeSandOfTime SandOfTime = new biomeSandOfTime();
    public final static biome_northern_base NORTHERN_BASE = new biome_northern_base();
    
    @Mod.EventBusSubscriber(modid = Refercence.MODID)
    public static class RegistrationHandler {
        /**
         * Register this mod's {@link Biome}s.
         *
         * @param event The event
         */
        @SubscribeEvent
        public static void onEvent(final RegistryEvent.Register<Biome> event) {
            final IForgeRegistry<Biome> registry = event.getRegistry();

            System.out.println("Registering biomes");
            
            registry.register(Helheim.setRegistryName(Refercence.MODID, modDimensionWorldGen.HELHEIM_NAME));
            registry.register(SandOfTime.setRegistryName(Refercence.MODID, modDimensionWorldGen.SANDSOFTIME_NAME));
            registry.register(NORTHERN_BASE.setRegistryName(Refercence.MODID, modDimensionWorldGen.NORTHERN_BASE_NAME));
        }
    }
    
    /**
     * This method should be called during the "init" FML lifecycle 
     * because it must happen after object handler injection.
     */
    public static void initBiomeManagerAndDictionary() {
        BiomeManager.addBiome(BiomeType.WARM, new BiomeEntry(Helheim, 10));
        BiomeManager.addSpawnBiome(Helheim);
        BiomeDictionary.addTypes(Helheim, 
                BiomeDictionary.Type.LUSH,
                BiomeDictionary.Type.MAGICAL
                );
    }
}