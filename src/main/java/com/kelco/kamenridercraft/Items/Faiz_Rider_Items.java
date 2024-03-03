package com.kelco.kamenridercraft.Items;

import com.kelco.kamenridercraft.KamenRiderCraftCore;
import com.kelco.kamenridercraft.Effect.Effect_core;
import com.kelco.kamenridercraft.Items.rider_armor_base.BaseBlasterItem;
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

public class Faiz_Rider_Items {

	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, KamenRiderCraftCore.MODID);
	
	public static final RegistryObject<Item> FAIZ_LOGO = ITEMS.register("faiz_logo",
    		() -> new BaseItem(new Item.Properties()).AddToTabList(RiderTabs.FAIZ_TAB_ITEM));

	public static final RegistryObject<Item> BLANK_MISSION_MEMORY = ITEMS.register("blank_mission_memory",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"","riotrooper","smart_buckle_belt",
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 0,true,false),
					new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 0,true,false)).AddToTabList(RiderTabs.FAIZ_TAB_ITEM));

	
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
	    
	public static final RegistryObject<Item> FAIZ_GOLD_BLASTER_MISSION_MEMORY = ITEMS.register("faiz_gold_blaster_mission_memory",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_gold_blaster","faiz","faiz_driver_belt_g_b",
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
	        
	
	public static final RegistryObject<Item> NEO_ALPA_MISSION_MEMORY = ITEMS.register("neo_alpa_mission_memory",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"","neo_alpa","neo_alpa_driver_belt",
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 0,true,false),
					new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 0,true,false)).AddToTabList(RiderTabs.FAIZ_TAB_ITEM));
	
	public static final RegistryObject<Item> PYRON_MISSION_MEMORY = ITEMS.register("pyron_mission_memory",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"","pyron","pyron_driver_belt",
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 0,true,false),
					new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 0,true,false)).AddToTabList(RiderTabs.FAIZ_TAB_ITEM));
	
	public static final RegistryObject<Item> SEEDA_MISSION_MEMORY = ITEMS.register("seeda_mission_memory",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"","seeda","seeda_driver_belt",
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 0,true,false),
					new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 0,true,false)).AddToTabList(RiderTabs.FAIZ_TAB_ITEM));
	
	
	public static final RegistryObject<Item> FAIZHELMET = ITEMS.register("faizhead",
			() -> new RiderArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.HELMET, new Item.Properties()).AddToTabList(RiderTabs.FAIZ_TAB_ITEM).ChangeRepairItem(BLANK_MISSION_MEMORY.get()));
	public static final RegistryObject<Item> FAIZCHESTPLATE = ITEMS.register("faiztroso",
			() -> new RiderArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.CHESTPLATE, new Item.Properties()).AddToTabList(RiderTabs.FAIZ_TAB_ITEM).ChangeRepairItem(BLANK_MISSION_MEMORY.get()));
	public static final RegistryObject<Item> FAIZLEGGINGS = ITEMS.register("faizlegs",
			() -> new RiderArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.LEGGINGS, new Item.Properties()).AddToTabList(RiderTabs.FAIZ_TAB_ITEM).ChangeRepairItem(BLANK_MISSION_MEMORY.get()));
	 
	
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

	public static final RegistryObject<Item> NEO_ALPA_DRIVER = ITEMS.register("neo_alpa_driver",
			() -> new RiderDriverItem(ArmorMaterials.DIAMOND,"neo_alpa",NEO_ALPA_MISSION_MEMORY ,FAIZHELMET, FAIZCHESTPLATE, FAIZLEGGINGS , new Item.Properties()).AddToTabList(RiderTabs.FAIZ_TAB_ITEM).ChangeRepairItem(BLANK_MISSION_MEMORY.get()));

	public static final RegistryObject<Item> PYRON_DRIVER = ITEMS.register("pyron_driver",
			() -> new RiderDriverItem(ArmorMaterials.DIAMOND,"pyron",PYRON_MISSION_MEMORY ,FAIZHELMET, FAIZCHESTPLATE, FAIZLEGGINGS , new Item.Properties()).AddToTabList(RiderTabs.FAIZ_TAB_ITEM).ChangeRepairItem(BLANK_MISSION_MEMORY.get()));

	public static final RegistryObject<Item> PYRON_DRIVER_SR = ITEMS.register("pyron_driver_sr",
			() -> new RiderDriverItem(ArmorMaterials.DIAMOND,"pyron_sonia_red",PYRON_MISSION_MEMORY ,FAIZHELMET, FAIZCHESTPLATE, FAIZLEGGINGS , new Item.Properties()).AddToTabList(RiderTabs.FAIZ_TAB_ITEM).ChangeRepairItem(BLANK_MISSION_MEMORY.get()));

	public static final RegistryObject<Item> PYRON_DRIVER_MB = ITEMS.register("pyron_driver_mb",
			() -> new RiderDriverItem(ArmorMaterials.DIAMOND,"pyron_midnight_black",PYRON_MISSION_MEMORY ,FAIZHELMET, FAIZCHESTPLATE, FAIZLEGGINGS , new Item.Properties()).AddToTabList(RiderTabs.FAIZ_TAB_ITEM).ChangeRepairItem(BLANK_MISSION_MEMORY.get()));

	public static final RegistryObject<Item> SEEDA_DRIVER = ITEMS.register("seeda_driver",
			() -> new RiderDriverItem(ArmorMaterials.DIAMOND,"seeda",SEEDA_MISSION_MEMORY ,FAIZHELMET, FAIZCHESTPLATE, FAIZLEGGINGS , new Item.Properties()).AddToTabList(RiderTabs.FAIZ_TAB_ITEM).ChangeRepairItem(BLANK_MISSION_MEMORY.get()));

	public static final RegistryObject<Item> SEEDA_DRIVER_GB = ITEMS.register("seeda_driver_gb",
			() -> new RiderDriverItem(ArmorMaterials.DIAMOND,"seeda_gb",SEEDA_MISSION_MEMORY ,FAIZHELMET, FAIZCHESTPLATE, FAIZLEGGINGS , new Item.Properties()).AddToTabList(RiderTabs.FAIZ_TAB_ITEM).ChangeRepairItem(BLANK_MISSION_MEMORY.get()));

	public static final RegistryObject<Item> SEEDA_DRIVER_RO = ITEMS.register("seeda_driver_ro",
			() -> new RiderDriverItem(ArmorMaterials.DIAMOND,"seeda_ro",SEEDA_MISSION_MEMORY ,FAIZHELMET, FAIZCHESTPLATE, FAIZLEGGINGS , new Item.Properties()).AddToTabList(RiderTabs.FAIZ_TAB_ITEM).ChangeRepairItem(BLANK_MISSION_MEMORY.get()));

	public static final RegistryObject<Item> SEEDA_DRIVER_UW = ITEMS.register("seeda_driver_uw",
			() -> new RiderDriverItem(ArmorMaterials.DIAMOND,"seeda_uw",SEEDA_MISSION_MEMORY ,FAIZHELMET, FAIZCHESTPLATE, FAIZLEGGINGS , new Item.Properties()).AddToTabList(RiderTabs.FAIZ_TAB_ITEM).ChangeRepairItem(BLANK_MISSION_MEMORY.get()));

	
	
	public static final RegistryObject<SwordItem> FAIZ_EDGE = ITEMS.register("faiz_edge",
			() -> new BaseSwordItem(Tiers.DIAMOND, 5, 3.5f, new Item.Properties()).AddToTabList(RiderTabs.FAIZ_TAB_ITEM).ChangeRepairItem(BLANK_MISSION_MEMORY.get()));
	public static final RegistryObject<BaseBlasterItem> FAIZ_PHONE = ITEMS.register("faiz_phone",
			() -> new BaseBlasterItem(Tiers.DIAMOND, 4, 3.5f, new Item.Properties()).AddToTabList(RiderTabs.FAIZ_TAB_ITEM).ChangeRepairItem(BLANK_MISSION_MEMORY.get()));
	public static final RegistryObject<BaseBlasterItem> FAIZ_PHONE_POINTER = ITEMS.register("faiz_phone_pointer",
			() -> new BaseBlasterItem(Tiers.DIAMOND, 4, 3.5f, new Item.Properties()).AddToTabList(RiderTabs.FAIZ_TAB_ITEM).ChangeRepairItem(BLANK_MISSION_MEMORY.get()));
	public static final RegistryObject<SwordItem> FAIZ_SHOT = ITEMS.register("faiz_shot",
			() -> new BaseSwordItem(Tiers.DIAMOND, 3, 4.5f, new Item.Properties()).AddToTabList(RiderTabs.FAIZ_TAB_ITEM).ChangeRepairItem(BLANK_MISSION_MEMORY.get()));
	public static final RegistryObject<BaseBlasterItem> FAIZ_BLASTER = ITEMS.register("faiz_blaster",
			() -> new BaseBlasterItem(Tiers.DIAMOND, 12, 3f, new Item.Properties()).IsSwordGun().AddToTabList(RiderTabs.FAIZ_TAB_ITEM).ChangeRepairItem(BLANK_MISSION_MEMORY.get()));
	
	public static final RegistryObject<BaseBlasterItem> KAIXA_BLAYGUN = ITEMS.register("kaixa_blaygun",
			() -> new BaseBlasterItem(Tiers.DIAMOND, 9, 3.5f, new Item.Properties()).IsSwordGun().AddToTabList(RiderTabs.FAIZ_TAB_ITEM).ChangeRepairItem(BLANK_MISSION_MEMORY.get()));
	public static final RegistryObject<BaseBlasterItem> KAIXA_PHONE = ITEMS.register("kaixa_phone",
			() -> new BaseBlasterItem(Tiers.DIAMOND, 4, 3.5f, new Item.Properties()).AddToTabList(RiderTabs.FAIZ_TAB_ITEM).ChangeRepairItem(BLANK_MISSION_MEMORY.get()));
	public static final RegistryObject<SwordItem> KAIXA_SHOT = ITEMS.register("kaixa_shot",
			() -> new BaseSwordItem(Tiers.DIAMOND, 3, 4.5f, new Item.Properties()).AddToTabList(RiderTabs.FAIZ_TAB_ITEM).ChangeRepairItem(BLANK_MISSION_MEMORY.get()));
	
		
	public static final RegistryObject<BaseBlasterItem> DELTA_BLASTER = ITEMS.register("delta_blaster",
			() -> new BaseBlasterItem(Tiers.DIAMOND, 4, 3.5f, new Item.Properties()).AddToTabList(RiderTabs.FAIZ_TAB_ITEM).ChangeRepairItem(BLANK_MISSION_MEMORY.get()));
		
	public static final RegistryObject<SwordItem> PSYGA_TONFA_EDGE = ITEMS.register("psyga_tonfa_edge",
			() -> new BaseSwordItem(Tiers.DIAMOND, 6, 3.5f, new Item.Properties()).AddToTabList(RiderTabs.FAIZ_TAB_ITEM).ChangeRepairItem(BLANK_MISSION_MEMORY.get()));
	   
	public static final RegistryObject<SwordItem> ORGA_STLANZER = ITEMS.register("orga_stlanzer",
			() -> new BaseSwordItem(Tiers.DIAMOND, 7, 3.5f, new Item.Properties()).AddToTabList(RiderTabs.FAIZ_TAB_ITEM).ChangeRepairItem(BLANK_MISSION_MEMORY.get()));

	public static final RegistryObject<BaseBlasterItem> AXEL_RAY_GUN = ITEMS.register("axel_ray_gun",
			() -> new BaseBlasterItem(Tiers.DIAMOND, 6, 3.5f, new Item.Properties()).IsSwordGun().AddToTabList(RiderTabs.FAIZ_TAB_ITEM).ChangeRepairItem(BLANK_MISSION_MEMORY.get()));

	
    public static void register(IEventBus eventBus) {
		ITEMS.register(eventBus);
	}

}
