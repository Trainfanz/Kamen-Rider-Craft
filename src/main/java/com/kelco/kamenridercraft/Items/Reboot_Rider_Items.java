package com.kelco.kamenridercraft.Items;

import com.kelco.kamenridercraft.KamenRiderCraftCore;
import com.kelco.kamenridercraft.Blocks.MachineBlocks.AmazonCellExtractor;
import com.kelco.kamenridercraft.Blocks.MachineBlocks.AmazonCellMutator;
import com.kelco.kamenridercraft.Blocks.MachineBlocks.KaijinStoneGenerator;
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

	    public static final RegistryObject<Item> EMPTY_VIAL = ITEMS.register("empty_vial",
	    		() -> new BaseItem(new Item.Properties()).AddToTabList(RiderTabs.AMAZONS_TAB_ITEM));
	    
	    public static final RegistryObject<Item> AMAZON_CELL_VIAL = ITEMS.register("amazon_cell_vial",
	    		() -> new BaseItem(new Item.Properties()).AddToTabList(RiderTabs.AMAZONS_TAB_ITEM).AddToTabList(AmazonCellExtractor.CELL_EXTRACTOR, 5));
	    
	    public static final RegistryObject<Item> OMEGA_AMAZON_CELL_VIAL = ITEMS.register("omega_amazon_cell_vial",
	    		() -> new BaseItem(new Item.Properties()).AddToTabList(RiderTabs.AMAZONS_TAB_ITEM).AddToTabList(AmazonCellMutator.AMAZON_CELL, 5));
	    
	    public static final RegistryObject<Item> ALPHA_AMAZON_CELL_VIAL = ITEMS.register("alpha_amazon_cell_vial",
	    		() -> new BaseItem(new Item.Properties()).AddToTabList(RiderTabs.AMAZONS_TAB_ITEM).AddToTabList(AmazonCellMutator.AMAZON_CELL, 5));

	    public static final RegistryObject<Item> SIGMA_AMAZON_CELL_VIAL = ITEMS.register("sigma_amazon_cell_vial",
	    		() -> new BaseItem(new Item.Properties()).AddToTabList(RiderTabs.AMAZONS_TAB_ITEM).AddToTabList(AmazonCellMutator.AMAZON_CELL, 2));
	    
	    public static final RegistryObject<Item> NEO_AMAZON_CELL_VIAL = ITEMS.register("neo_amazon_cell_vial",
	    		() -> new BaseItem(new Item.Properties()).AddToTabList(RiderTabs.AMAZONS_TAB_ITEM).AddToTabList(AmazonCellMutator.AMAZON_CELL, 1));
	    
	    
	    // BLack Sun
	    
	    public static final RegistryObject<Item> BLACKSUNHELMET = ITEMS.register("blacksunhead",
	            () -> new RiderArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.HELMET, new Item.Properties()).AddToTabList(RiderTabs.BLACK_SUN_TAB_ITEM));
	    public static final RegistryObject<Item> BLACKSUNCHESTPLATE = ITEMS.register("blacksuntroso",
	            () -> new RiderArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.CHESTPLATE, new Item.Properties()).AddToTabList(RiderTabs.BLACK_SUN_TAB_ITEM));
	    public static final RegistryObject<Item> BLACKSUNLEGGINGS = ITEMS.register("blacksunlegs",
	            () -> new RiderArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.LEGGINGS, new Item.Properties()).AddToTabList(RiderTabs.BLACK_SUN_TAB_ITEM));
	    
	    public static final RegistryObject<SwordItem> CENTURY_KING_BLACK_BLADE = ITEMS.register("century_king_black_blade",
	            () -> new BaseSwordItem(Tiers.DIAMOND, 5, 3.5f, new Item.Properties()).AddToTabList(RiderTabs.BLACK_SUN_TAB_ITEM));
	    public static final RegistryObject<SwordItem> CENTURY_KING_SHADOW_BLADE = ITEMS.register("century_king_shadow_blade",
	            () -> new BaseSwordItem(Tiers.DIAMOND, 5, 3.5f, new Item.Properties()).AddToTabList(RiderTabs.BLACK_SUN_TAB_ITEM));
	    public static final RegistryObject<SwordItem> SATANSABRE = ITEMS.register("satansabre",
	            () -> new BaseSwordItem(Tiers.DIAMOND, 8, 3.5f, new Item.Properties()).AddToTabList(RiderTabs.BLACK_SUN_TAB_ITEM));


	    public static final RegistryObject<Item> KING_STONE_SUN = ITEMS.register("king_stone_sun",
	            () -> new RiderFormChangeItem(new Item.Properties(),0,"","black_sun","century_king_sun_driver_belt",
	            		new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 1,true,false),new MobEffectInstance(MobEffects.DIG_SPEED,40, 0,true,false)
	            		,new MobEffectInstance(MobEffects.JUMP, 40, 1,true,false),new MobEffectInstance(Effect_core.PUNCH.get(), 40, 1,true,false)).AddToTabList(RiderTabs.BLACK_SUN_TAB_ITEM).AddToTabList(KaijinStoneGenerator.KING_STONE, 10));

	    public static final RegistryObject<Item> GLOWING_KING_STONE_SUN = ITEMS.register("glowing_king_stone_sun",
	            () -> new RiderFormChangeItem(new Item.Properties(),0,"_revived","black_sun","century_king_sun_driver_belt",
	            		new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 1,true,false),new MobEffectInstance(MobEffects.DIG_SPEED,40, 0,true,false)
	            		,new MobEffectInstance(MobEffects.JUMP, 40, 1,true,false),new MobEffectInstance(Effect_core.PUNCH.get(), 40, 1,true,false)).AddToTabList(RiderTabs.BLACK_SUN_TAB_ITEM).AddToTabList(KaijinStoneGenerator.KING_STONE, 1));

	    public static final RegistryObject<Item> KING_STONE_MOON = ITEMS.register("king_stone_moon",
	            () -> new RiderFormChangeItem(new Item.Properties(),0,"","shadowmoon","century_king_moon_driver_belt",
	            		new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 1,true,false),new MobEffectInstance(MobEffects.DIG_SPEED,40, 0,true,false)
	            		,new MobEffectInstance(MobEffects.JUMP, 40, 1,true,false))
	            .AddToTabList(RiderTabs.BLACK_SUN_TAB_ITEM).AddToTabList(KaijinStoneGenerator.KING_STONE, 5));
	
	    public static final RegistryObject<Item> GLOWING_KING_STONE_MOON = ITEMS.register("glowing_king_stone_moon",
	            () -> new RiderFormChangeItem(new Item.Properties(),0,"_revived","shadowmoon","century_king_moon_driver_belt",
	            		new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 1,true,false),new MobEffectInstance(MobEffects.DIG_SPEED,40, 0,true,false)
	            		,new MobEffectInstance(MobEffects.JUMP, 40, 1,true,false))
	            .AddToTabList(RiderTabs.BLACK_SUN_TAB_ITEM).AddToTabList(KaijinStoneGenerator.KING_STONE, 1));

	    
	    public static final RegistryObject<Item> CENTURY_KING_SUN_DRIVER = ITEMS.register("century_king_sun_driver",
		           () -> new RiderDriverItem(ArmorMaterials.DIAMOND,"black_sun",KING_STONE_SUN ,BLACKSUNHELMET,BLACKSUNCHESTPLATE,BLACKSUNLEGGINGS , new Item.Properties()).AddToTabList(RiderTabs.BLACK_SUN_TAB_ITEM));

	    public static final RegistryObject<Item> CENTURY_KING_MOON_DRIVER = ITEMS.register("century_king_moon_driver",
		           () -> new RiderDriverItem(ArmorMaterials.DIAMOND,"shadowmoon",KING_STONE_MOON ,BLACKSUNHELMET,BLACKSUNCHESTPLATE,BLACKSUNLEGGINGS , new Item.Properties()).AddToTabList(RiderTabs.BLACK_SUN_TAB_ITEM));

	    public static final RegistryObject<Item> KAIJIN_STONE = ITEMS.register("kaijin_stone",
	    		() -> new BaseItem(new Item.Properties()).AddToTabList(RiderTabs.BLACK_SUN_TAB_ITEM).AddToTabList(KaijinStoneGenerator.KING_STONE, 20));
	    
	    public static final RegistryObject<Item> CREATION_KING_EXTRACT_VIAL = ITEMS.register("creation_king_extract_vial",
	    		() -> new BaseItem(new Item.Properties()).AddToTabList(RiderTabs.BLACK_SUN_TAB_ITEM));

	    

	    
	    public static void register(IEventBus eventBus) {
	        ITEMS.register(eventBus);
	    }
	    
	}