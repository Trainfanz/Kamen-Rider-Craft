package com.kelco.kamenridercraft.Items;

import com.kelco.kamenridercraft.KamenRiderCraftCore;
import com.kelco.kamenridercraft.Effect.Effect_core;
import com.kelco.kamenridercraft.Items.rider_armor_base.BaseBlasterItem;
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

public class Faiz_Rider_Items {

	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, KamenRiderCraftCore.MODID);
	
	public static final RegistryObject<Item> BLANK_MISSION_MEMORY = ITEMS.register("blank_mission_memory",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"","riotrooper","smart_buckle_belt",
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 0,true,false),
					new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 0,true,false)).AddToTabList(RiderTabs.FAIZ_TAB_ITEM));

	
	public static final RegistryObject<SwordItem> FAIZ_EDGE = ITEMS.register("faiz_edge",
			() -> new BaseSwordItem(Tiers.DIAMOND, 5, 3.5f, new Item.Properties()).AddToTabList(RiderTabs.FAIZ_TAB_ITEM).ChangeRepairItem(BLANK_MISSION_MEMORY.get()));
	public static final RegistryObject<BaseBlasterItem> FAIZ_BLASTER = ITEMS.register("faiz_blaster",
			() -> new BaseBlasterItem(Tiers.DIAMOND, 4, 3.5f, new Item.Properties()).AddToTabList(RiderTabs.FAIZ_TAB_ITEM).ChangeRepairItem(BLANK_MISSION_MEMORY.get()));
	
	public static final RegistryObject<SwordItem> KAIXA_BLAYGUN = ITEMS.register("kaixa_blaygun",
			() -> new BaseSwordItem(Tiers.DIAMOND, 5, 3.5f, new Item.Properties()).AddToTabList(RiderTabs.FAIZ_TAB_ITEM).ChangeRepairItem(BLANK_MISSION_MEMORY.get()));
	
		
	public static final RegistryObject<BaseBlasterItem> DELTA_BLASTER = ITEMS.register("delta_blaster",
			() -> new BaseBlasterItem(Tiers.DIAMOND, 4, 3.5f, new Item.Properties()).AddToTabList(RiderTabs.FAIZ_TAB_ITEM).ChangeRepairItem(BLANK_MISSION_MEMORY.get()));
		
	public static final RegistryObject<SwordItem> PSYGA_TONFA_EDGE = ITEMS.register("psyga_tonfa_edge",
			() -> new BaseSwordItem(Tiers.DIAMOND, 5, 3.5f, new Item.Properties()).AddToTabList(RiderTabs.FAIZ_TAB_ITEM).ChangeRepairItem(BLANK_MISSION_MEMORY.get()));
	   
	public static final RegistryObject<SwordItem> ORGA_STLANZER = ITEMS.register("orga_stlanzer",
			() -> new BaseSwordItem(Tiers.DIAMOND, 5, 3.5f, new Item.Properties()).AddToTabList(RiderTabs.FAIZ_TAB_ITEM).ChangeRepairItem(BLANK_MISSION_MEMORY.get()));

	public static final RegistryObject<SwordItem> AXEL_RAY_GUN = ITEMS.register("axel_ray_gun",
			() -> new BaseSwordItem(Tiers.DIAMOND, 5, 3.5f, new Item.Properties()).AddToTabList(RiderTabs.FAIZ_TAB_ITEM).ChangeRepairItem(BLANK_MISSION_MEMORY.get()));

	public static final RegistryObject<Item> FAIZHELMET = ITEMS.register("faizhead",
			() -> new RiderArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.HELMET, new Item.Properties()).AddToTabList(RiderTabs.FAIZ_TAB_ITEM).ChangeRepairItem(BLANK_MISSION_MEMORY.get()));
	public static final RegistryObject<Item> FAIZCHESTPLATE = ITEMS.register("faiztroso",
			() -> new RiderArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.CHESTPLATE, new Item.Properties()).AddToTabList(RiderTabs.FAIZ_TAB_ITEM).ChangeRepairItem(BLANK_MISSION_MEMORY.get()));
	public static final RegistryObject<Item> FAIZLEGGINGS = ITEMS.register("faizlegs",
			() -> new RiderArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.LEGGINGS, new Item.Properties()).AddToTabList(RiderTabs.FAIZ_TAB_ITEM).ChangeRepairItem(BLANK_MISSION_MEMORY.get()));
	 
	
	public static final RegistryObject<Item> FAIZ_MISSION_MEMORY = ITEMS.register("faiz_mission_memory",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"","faiz","faiz_driver_belt",
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 0,true,false),
					new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 0,true,false)).AddToTabList(RiderTabs.FAIZ_TAB_ITEM));
	    
	public static final RegistryObject<Item> FAIZ_AXEL_MISSION_MEMORY = ITEMS.register("faiz_axel_mission_memory",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_axel","faiz","faiz_driver_belt_a",
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 2,true,false),
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 5,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 4,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
					new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 0,true,false)).AddToTabList(RiderTabs.FAIZ_TAB_ITEM));
	    
	public static final RegistryObject<Item> FAIZ_BLASTER_MISSION_MEMORY = ITEMS.register("faiz_blaster_mission_memory",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_blaster","faiz","faiz_driver_belt_b",
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 4,true,false),
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 3,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 3,true,false),
					new MobEffectInstance(MobEffects.JUMP, 40, 3,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
					new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 0,true,false),
					new MobEffectInstance(Effect_core.FLYING.get(), 40, 1,true,false)).AddToTabList(RiderTabs.FAIZ_TAB_ITEM));
	    
	public static final RegistryObject<Item> KAIXA_MISSION_MEMORY = ITEMS.register("kaixa_mission_memory",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"","kaixa","kaixa_driver_belt",
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 3,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 1,true,false),
					new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 0,true,false)).AddToTabList(RiderTabs.FAIZ_TAB_ITEM));
	    
	public static final RegistryObject<Item> DELTA_MISSION_MEMORY = ITEMS.register("delta_mission_memory",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"","delta","delta_driver_belt",
					new MobEffectInstance(MobEffects.JUMP, 40, 1,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 3,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 2,true,false),
					new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 0,true,false)).AddToTabList(RiderTabs.FAIZ_TAB_ITEM));
	    
	public static final RegistryObject<Item> PSYGA_MISSION_MEMORY = ITEMS.register("psyga_mission_memory",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"","psyga","psyga_driver_belt",
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 3,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 3,true,false),
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 3,true,false),
					new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 0,true,false)).AddToTabList(RiderTabs.FAIZ_TAB_ITEM));
	    
	public static final RegistryObject<Item> ORGA_MISSION_MEMORY = ITEMS.register("orga_mission_memory",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"","orga","orga_driver_belt",
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 4,true,false),
					new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 40, 1,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 4,true,false),
					new MobEffectInstance(MobEffects.REGENERATION, 40, 0,true,false),
					new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 0,true,false)).AddToTabList(RiderTabs.FAIZ_TAB_ITEM));
	        
	
	public static final RegistryObject<Item> FAIZ_DRIVER = ITEMS.register("faiz_driver",
			() -> new RiderDriverItem(ArmorMaterials.DIAMOND,"faiz",FAIZ_MISSION_MEMORY ,FAIZHELMET, FAIZCHESTPLATE, FAIZLEGGINGS , new Item.Properties()).AddToTabList(RiderTabs.FAIZ_TAB_ITEM).ChangeRepairItem(BLANK_MISSION_MEMORY.get()));

	public static final RegistryObject<Item> KAIXA_DRIVER = ITEMS.register("kaixa_driver",
			() -> new RiderDriverItem(ArmorMaterials.DIAMOND,"kaixa",KAIXA_MISSION_MEMORY ,FAIZHELMET, FAIZCHESTPLATE, FAIZLEGGINGS , new Item.Properties()).AddToTabList(RiderTabs.FAIZ_TAB_ITEM).ChangeRepairItem(BLANK_MISSION_MEMORY.get()));
	    
	public static final RegistryObject<Item> DELTA_DRIVER = ITEMS.register("delta_driver",
			() -> new RiderDriverItem(ArmorMaterials.DIAMOND,"delta",DELTA_MISSION_MEMORY ,FAIZHELMET, FAIZCHESTPLATE, FAIZLEGGINGS , new Item.Properties()).AddToTabList(RiderTabs.FAIZ_TAB_ITEM).ChangeRepairItem(BLANK_MISSION_MEMORY.get()));
	
	public static final RegistryObject<Item> PSYGA_DRIVER = ITEMS.register("psyga_driver",
			() -> new RiderDriverItem(ArmorMaterials.DIAMOND,"psyga",PSYGA_MISSION_MEMORY ,FAIZHELMET, FAIZCHESTPLATE, FAIZLEGGINGS , new Item.Properties()).AddToTabList(RiderTabs.FAIZ_TAB_ITEM).ChangeRepairItem(BLANK_MISSION_MEMORY.get()));
	
	public static final RegistryObject<Item> ORGA_DRIVER = ITEMS.register("orga_driver",
			() -> new RiderDriverItem(ArmorMaterials.DIAMOND,"orga",ORGA_MISSION_MEMORY ,FAIZHELMET, FAIZCHESTPLATE, FAIZLEGGINGS , new Item.Properties()).AddToTabList(RiderTabs.FAIZ_TAB_ITEM).ChangeRepairItem(BLANK_MISSION_MEMORY.get()));
	
	public static final RegistryObject<Item> SMARTBUCKLE = ITEMS.register("smartbuckle",
			() -> new RiderDriverItem(ArmorMaterials.DIAMOND,"riotrooper",BLANK_MISSION_MEMORY ,FAIZHELMET, FAIZCHESTPLATE, FAIZLEGGINGS , new Item.Properties()).AddToTabList(RiderTabs.FAIZ_TAB_ITEM).ChangeRepairItem(BLANK_MISSION_MEMORY.get()));
	
	public static void register(IEventBus eventBus) {
		ITEMS.register(eventBus);
	}

}
