package com.kelco.kamenridercraft.Items;


import java.util.ArrayList;
import java.util.List;

import com.kelco.kamenridercraft.KamenRiderCraftCore;

import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = KamenRiderCraftCore.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class RiderTabs {
    public static CreativeModeTab RiderMiscTab;
    public static CreativeModeTab IchigoTab;
    public static CreativeModeTab V3Tab;
    public static CreativeModeTab XTab;
    public static CreativeModeTab AMAZONTab;

    public static List<Item> ICHIGO_TAB_ITEM= new ArrayList<Item>();
    public static List<Item> V3_TAB_ITEM= new ArrayList<Item>();
    public static List<Item> X_TAB_ITEM= new ArrayList<Item>();
    public static List<Item> AMAZON_TAB_ITEM= new ArrayList<Item>();
    public static List<Item> Misc_TAB_ITEM= new ArrayList<Item>();
    
    
    @SubscribeEvent
    public static void registerCreativeModeTabs(CreativeModeTabEvent.Register event) {
    	
    	IchigoTab = event.registerCreativeModeTab(new ResourceLocation(KamenRiderCraftCore.MODID, "rider_ichigo_tab"),
                builder-> builder.icon(() -> new ItemStack(Ichigo_Rider_Items.ICHIGOHELMET.get())).withBackgroundLocation(new ResourceLocation(KamenRiderCraftCore.MODID+":textures/gui/tab_iichigo_items.png")).title(Component.literal("Ichigo Rider Items")).build());
 
    	V3Tab = event.registerCreativeModeTab(new ResourceLocation(KamenRiderCraftCore.MODID, "rider_v3_tab"),
                builder-> builder.icon(() -> new ItemStack(Ichigo_Rider_Items.V3HELMET.get())).withBackgroundLocation(new ResourceLocation(KamenRiderCraftCore.MODID+":textures/gui/tab_iichigo_items.png")).title(Component.literal("V3 Rider Items")).build());
 
    	XTab = event.registerCreativeModeTab(new ResourceLocation(KamenRiderCraftCore.MODID, "rider_x_tab"),
                builder-> builder.icon(() -> new ItemStack(Ichigo_Rider_Items.XHELMET.get())).withBackgroundLocation(new ResourceLocation(KamenRiderCraftCore.MODID+":textures/gui/tab_iichigo_items.png")).title(Component.literal("X Rider Items")).build());
    	
    	AMAZONTab = event.registerCreativeModeTab(new ResourceLocation(KamenRiderCraftCore.MODID, "rider_amazon_tab"),
                builder-> builder.icon(() -> new ItemStack(Ichigo_Rider_Items.AMAZONHELMET.get())).withBackgroundLocation(new ResourceLocation(KamenRiderCraftCore.MODID+":textures/gui/tab_iichigo_items.png")).title(Component.literal("Amazon Rider Items")).build());
 
    	
    	RiderMiscTab = event.registerCreativeModeTab(new ResourceLocation(KamenRiderCraftCore.MODID, "rider_misc_tab"),
                builder-> builder.icon(() -> new ItemStack(Modded_item_core.RIDER_CIRCUIT.get())).withBackgroundLocation(new ResourceLocation(KamenRiderCraftCore.MODID+":textures/gui/tab_iichigo_items.png")).title(Component.literal("Misc Rider Items")).build());
 
    
    }
}