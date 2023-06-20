package com.kelco.kamenridercraft.Items;

import com.kelco.kamenridercraft.KamenRiderCraftCore;
import com.kelco.kamenridercraft.Effect.Effect_core;
import com.kelco.kamenridercraft.Items.rider_armor_base.BaseItem;
import com.kelco.kamenridercraft.Items.rider_armor_base.BaseSwordItem;
import com.kelco.kamenridercraft.Items.rider_armor_base.RiderArmorItem;
import com.kelco.kamenridercraft.Items.rider_armor_base.RiderDriverItem;
import com.kelco.kamenridercraft.Items.rider_armor_base.RiderFormChangeItem;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterials;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tiers;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class Reboot_Rider_Items {
	
	  public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, KamenRiderCraftCore.MODID);
	    	     
	  
		//Amazon
	    
	    public static final RegistryObject<Item> AMAZONSHELMET = ITEMS.register("amazonshead",
	            () -> new RiderArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.HELMET, new Item.Properties()).AddToTabList(RiderTabs.AMAZONS_TAB_ITEM));
	    public static final RegistryObject<Item> AMAZONSCHESTPLATE = ITEMS.register("amazonstroso",
	            () -> new RiderArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.CHESTPLATE, new Item.Properties()).AddToTabList(RiderTabs.AMAZONS_TAB_ITEM));
	    public static final RegistryObject<Item> AMAZONSLEGGINGS = ITEMS.register("amazonslegs",
	            () -> new RiderArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.LEGGINGS, new Item.Properties()).AddToTabList(RiderTabs.AMAZONS_TAB_ITEM));

	    public static final RegistryObject<Item> CONDORER_CORE_ALPHA = ITEMS.register("condorer_core_alpha",
	            () -> new RiderFormChangeItem(new Item.Properties(),0,"","amazon_alpha","amazons_driver_alpha_belt",
	            		new MobEffectInstance(Effect_core.PUNCH.get(), 40, 4,true,false),new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE,200, 1,true,false)
	            		,new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 1,true,false),new MobEffectInstance(MobEffects.JUMP, 40, 1,true,false)).AddToTabList(RiderTabs.AMAZONS_TAB_ITEM));
	 
	    public static final RegistryObject<Item> CONDORER_CORE_ALPHA_BLIND = ITEMS.register("condorer_core_alpha_blind",
	            () -> new RiderFormChangeItem(new Item.Properties(),0,"_blind","amazon_alpha","amazons_driver_alpha_belt",
	            		new MobEffectInstance(Effect_core.PUNCH.get(), 40, 6,true,false),new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE,200, 2,true,false)
	            		,new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 0,true,false),new MobEffectInstance(MobEffects.JUMP, 40, 0,true,false)
	            		,new MobEffectInstance(MobEffects.BLINDNESS, 40, 0,true,false)).AddToTabList(RiderTabs.AMAZONS_TAB_ITEM));
	
	    
	    public static final RegistryObject<Item> CONDORER_CORE_OMEGA = ITEMS.register("condorer_core_omega",
	            () -> new RiderFormChangeItem(new Item.Properties(),0,"","amazon_omega","amazons_driver_omega_belt",
	            		new MobEffectInstance(Effect_core.PUNCH.get(), 40, 3,true,false),new MobEffectInstance(MobEffects.REGENERATION,200, 1,true,false)
	            		,new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 1,true,false),new MobEffectInstance(MobEffects.JUMP, 40, 1,true,false)).AddToTabList(RiderTabs.AMAZONS_TAB_ITEM));
	 
	    public static final RegistryObject<Item> CONDORER_CORE_SIGMA = ITEMS.register("condorer_core_sigma",
	            () -> new RiderFormChangeItem(new Item.Properties(),0,"","amazon_sigma","amazons_driver_sigma_belt",
	            		new MobEffectInstance(Effect_core.PUNCH.get(), 40, 6,true,false),new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE,200, 1,true,false)
	            		,new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 2,true,false),new MobEffectInstance(MobEffects.JUMP, 40, 2,true,false)).AddToTabList(RiderTabs.AMAZONS_TAB_ITEM));
	 
	    public static final RegistryObject<Item> AMAZON_INJECTOR_NEO = ITEMS.register("amazon_injector_neo",
	            () -> new RiderFormChangeItem(new Item.Properties(),0,"","amazon_neo","neo_amazons_driver_neo_belt",
	            		new MobEffectInstance(Effect_core.PUNCH.get(), 40, 6,true,false),new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE,200, 1,true,false)
	            		,new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 3,true,false),new MobEffectInstance(MobEffects.JUMP, 40, 3,true,false)
	            		,new MobEffectInstance(MobEffects.REGENERATION,200, 1,true,false)).AddToTabList(RiderTabs.AMAZONS_TAB_ITEM));
	 
	    public static final RegistryObject<Item> AMAZON_INJECTOR_NEW_OMEGA = ITEMS.register("amazon_injector_new_omega",
	            () -> new RiderFormChangeItem(new Item.Properties(),0,"","amazon_alpha","neo_amazons_driver_omega_belt",
	             		new MobEffectInstance(Effect_core.PUNCH.get(), 40, 7,true,false),new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE,200, 1,true,false)
	            		,new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 1,true,false),new MobEffectInstance(MobEffects.JUMP, 40, 0,true,false)
	            		,new MobEffectInstance(MobEffects.REGENERATION,200, 2,true,false)).AddToTabList(RiderTabs.AMAZONS_TAB_ITEM));
	 
	    public static final RegistryObject<Item> AMAZON_INJECTOR_NEO_ALPHA = ITEMS.register("amazon_injector_neo_alpha",
	            () -> new RiderFormChangeItem(new Item.Properties(),0,"","amazon_neo_alpha","neo_amazons_driver_neo_belt",
	            		new MobEffectInstance(Effect_core.PUNCH.get(), 40, 7,true,false),new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE,200, 1,true,false)
	            		,new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 1,true,false),new MobEffectInstance(MobEffects.JUMP, 40, 0,true,false)
	            		,new MobEffectInstance(MobEffects.REGENERATION,200, 2,true,false)).AddToTabList(RiderTabs.AMAZONS_TAB_ITEM));
	 
	    
	    public static final RegistryObject<Item> AMAZONS_DRIVER_ALPHA = ITEMS.register("amazons_driver_alpha",
		           () -> new RiderDriverItem(ArmorMaterials.DIAMOND,"amazon_alpha",CONDORER_CORE_ALPHA ,AMAZONSHELMET,AMAZONSCHESTPLATE,AMAZONSLEGGINGS , new Item.Properties()).AddToTabList(RiderTabs.AMAZONS_TAB_ITEM));

	    public static final RegistryObject<Item> AMAZONS_DRIVER_OMEGA = ITEMS.register("amazons_driver_omega",
		           () -> new RiderDriverItem(ArmorMaterials.DIAMOND,"amazon_omega",CONDORER_CORE_OMEGA ,AMAZONSHELMET,AMAZONSCHESTPLATE,AMAZONSLEGGINGS , new Item.Properties()).AddToTabList(RiderTabs.AMAZONS_TAB_ITEM));

	    public static final RegistryObject<Item> AMAZONS_DRIVER_SIGMA = ITEMS.register("amazons_driver_sigma",
		           () -> new RiderDriverItem(ArmorMaterials.DIAMOND,"amazon_sigma",CONDORER_CORE_SIGMA ,AMAZONSHELMET,AMAZONSCHESTPLATE,AMAZONSLEGGINGS , new Item.Properties()).AddToTabList(RiderTabs.AMAZONS_TAB_ITEM));

	    public static final RegistryObject<Item> NEO_AMAZONS_DRIVER_OMEGA = ITEMS.register("neo_amazons_driver_omega",
		           () -> new RiderDriverItem(ArmorMaterials.DIAMOND,"amazon_new_omega",AMAZON_INJECTOR_NEW_OMEGA ,AMAZONSHELMET,AMAZONSCHESTPLATE,AMAZONSLEGGINGS , new Item.Properties()).AddToTabList(RiderTabs.AMAZONS_TAB_ITEM));

	    public static final RegistryObject<Item> NEO_AMAZONS_DRIVER_NEO = ITEMS.register("neo_amazons_driver_neo",
		           () -> new RiderDriverItem(ArmorMaterials.DIAMOND,"amazon_neo",AMAZON_INJECTOR_NEO ,AMAZONSHELMET,AMAZONSCHESTPLATE,AMAZONSLEGGINGS , new Item.Properties()).AddToTabList(RiderTabs.AMAZONS_TAB_ITEM));

	    public static final RegistryObject<Item> NEO_AMAZONS_DRIVER_NEO_ALPHA = ITEMS.register("neo_amazons_driver_neo_alpha",
		           () -> new RiderDriverItem(ArmorMaterials.DIAMOND,"amazon_neo_alpha",AMAZON_INJECTOR_NEO_ALPHA ,AMAZONSHELMET,AMAZONSCHESTPLATE,AMAZONSLEGGINGS , new Item.Properties()).AddToTabList(RiderTabs.AMAZONS_TAB_ITEM));


	    
	 
	    
	    public static void register(IEventBus eventBus) {
	        ITEMS.register(eventBus);
	    }
	    
	}