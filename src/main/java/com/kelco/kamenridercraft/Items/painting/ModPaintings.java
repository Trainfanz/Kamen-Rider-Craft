package com.kelco.kamenridercraft.Items.painting;

import com.kelco.kamenridercraft.KamenRiderCraftCore;
import net.minecraft.world.entity.decoration.PaintingVariant;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModPaintings {
    public static final DeferredRegister<PaintingVariant> PAINTING_VARIANTS =
            DeferredRegister.create(ForgeRegistries.PAINTING_VARIANTS, KamenRiderCraftCore.MODID);

    public static final RegistryObject<PaintingVariant> SHADOW_MOON = PAINTING_VARIANTS.register("shadow_moon",
            () -> new PaintingVariant(32, 16));
    
    public static final RegistryObject<PaintingVariant> KUUGA_GUN = PAINTING_VARIANTS.register("kuuga_gun",
            () -> new PaintingVariant(32, 32));
    
    public static final RegistryObject<PaintingVariant> FAIZG = PAINTING_VARIANTS.register("faiz_g",
            () -> new PaintingVariant(32, 32));
    
    public static final RegistryObject<PaintingVariant> GARREN = PAINTING_VARIANTS.register("garren",
            () -> new PaintingVariant(32, 32));
    
    public static final RegistryObject<PaintingVariant> OOO_BIKE = PAINTING_VARIANTS.register("ooo_bike",
            () -> new PaintingVariant(32, 32));
    
    public static final RegistryObject<PaintingVariant> SABER_RUN = PAINTING_VARIANTS.register("saber_run",
            () -> new PaintingVariant(32, 32));

    public static final RegistryObject<PaintingVariant> FOURZE_CLUB = PAINTING_VARIANTS.register("fourze_club",
            () -> new PaintingVariant(64, 32));
    
    public static void register(IEventBus eventBus) {
        PAINTING_VARIANTS.register(eventBus);
    }
}