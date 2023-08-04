package com.kelco.kamenridercraft.Potion;

import com.kelco.kamenridercraft.KamenRiderCraftCore;
import net.minecraft.world.item.alchemy.Potion;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class Potion_core {

	public static final DeferredRegister<Potion> POTIONS = DeferredRegister.create(ForgeRegistries.POTIONS, KamenRiderCraftCore.MODID);

/**
	public static final RegistryObject<Potion> BOOST_POTION = POTIONS.register("boost_potion", 
			() -> new Potion (new MobEffectInstance(effects)))
	**/
	
	public static void register(IEventBus eventBus) {
		POTIONS.register(eventBus);
	}

}