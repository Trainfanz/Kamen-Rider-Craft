package com.kelco.kamenridercraft.Items;

import com.kelco.kamenridercraft.KamenRiderCraftCore;

import net.minecraft.world.food.Foods;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class Modded_item_core {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, KamenRiderCraftCore.MODID);
    
    public static final RegistryObject<Item> RIDER_CIRCUIT = ITEMS.register("rider_circuit",
    		  () -> new Item(new Item.Properties()));
    
    public static final RegistryObject<Item> BASE_SWORD = ITEMS.register("base_sword",
  		  () -> new Item(new Item.Properties()));
  
    public static final RegistryObject<Item> BASE_BIKE = ITEMS.register("base_bike",
    		  () -> new Item(new Item.Properties()));
    
    public static final RegistryObject<Item> SHOCKER_EMBLEM = ITEMS.register("shocker_emblem",
    		  () -> new Item(new Item.Properties()));
    

    public static final RegistryObject<Item> DONUT = ITEMS.register("donut",
    		  () -> new Item(new Item.Properties().food(Foods.BREAD)));
    
  
    // public static final RegistryObject<Item> CYCLONEHOPPER = ITEMS.register("cyclonehopper",
	   //        () -> new RiderFormChangeItem(new Item.Properties(),0,"_cyclonehopper","ichigo","typhoon_belt_original"));

    
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
    
}