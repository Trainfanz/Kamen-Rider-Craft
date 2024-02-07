package com.kelco.kamenridercraft.Items;

import com.kelco.kamenridercraft.KamenRiderCraftCore;
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

public class Ryuki_Rider_Items {
	
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, KamenRiderCraftCore.MODID);
	
	public static final RegistryObject<Item> RYUKI_LOGO = ITEMS.register("ryuki_logo",
			() -> new BaseItem(new Item.Properties()).AddToTabList(RiderTabs.RYUKI_TAB_ITEM));

	public static final RegistryObject<Item> ADVENT_CARD = ITEMS.register("advent_card",
            () -> new RiderFormChangeItem(new Item.Properties(),0,"_blank","ryuki","v_buckle_belt",
            		new MobEffectInstance(MobEffects.WEAKNESS, 400, 0,true,false)).AddCompatibilityList(new String[] {"ouja","knight"}).AddToTabList(RiderTabs.RYUKI_TAB_ITEM));

	  public static final RegistryObject<Item> DRAGREDER_ADVENT = ITEMS.register("dragreder_advent",
	            () -> new RiderFormChangeItem(new Item.Properties(),0,"","ryuki","v_buckle_belt_ryuki",
	            		new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 40, 0,true,false),new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 0,true,false)
	            		,new MobEffectInstance(MobEffects.DIG_SPEED, 40, 0,true,false)).AddToTabList(RiderTabs.RYUKI_TAB_ITEM));
	  
	  public static final RegistryObject<Item> DARKWING_ADVENT = ITEMS.register("darkwing_advent",
	            () -> new RiderFormChangeItem(new Item.Properties(),0,"","knight","v_buckle_belt_knight",
	            		new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 0,true,false),new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 0,true,false)
	            		,new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 0,true,false)).AddToTabList(RiderTabs.RYUKI_TAB_ITEM));
	
	  public static final RegistryObject<Item> VOLCANCER_ADVENT = ITEMS.register("volcancer_advent",
	            () -> new RiderFormChangeItem(new Item.Properties(),0,"","scissors","v_buckle_belt_scissors",
	            		new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 0,true,false),new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 40, 0,true,false)
	            		,new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 1,true,false)).AddToTabList(RiderTabs.RYUKI_TAB_ITEM));
	  
	  public static final RegistryObject<Item> MAGNUGIGA_ADVENT = ITEMS.register("magnugiga_advent",
	            () -> new RiderFormChangeItem(new Item.Properties(),0,"","zolda","v_buckle_belt_zolda",
	            		new MobEffectInstance(MobEffects.NIGHT_VISION, 40, 0,true,false),new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 0,true,false)
	            		,new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 0,true,false)).AddToTabList(RiderTabs.RYUKI_TAB_ITEM));
	  
	  public static final RegistryObject<Item> EVILDIVER_ADVENT = ITEMS.register("evildiver_advent",
	            () -> new RiderFormChangeItem(new Item.Properties(),0,"","raia","v_buckle_belt_raia",
	            		new MobEffectInstance(MobEffects.DIG_SPEED, 40, 1,true,false),new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 2,true,false)
	            		,new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 1,true,false)).AddToTabList(RiderTabs.RYUKI_TAB_ITEM));
	  
	  public static final RegistryObject<Item> METALGELAS_ADVENT = ITEMS.register("metalgelas_advent",
	            () -> new RiderFormChangeItem(new Item.Properties(),0,"","gai","v_buckle_belt_gai",
	            		new MobEffectInstance(MobEffects.DIG_SLOWDOWN, 40, 0,true,false),
	            		new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 3,true,false)).AddToTabList(RiderTabs.RYUKI_TAB_ITEM));
	  
	  public static final RegistryObject<Item> VENOSNAKER_ADVENT = ITEMS.register("venosnaker_advent",
	            () -> new RiderFormChangeItem(new Item.Properties(),0,"","ouja","v_buckle_belt_ouja",
	            		new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 0,true,false)
	            		,new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 2,true,false)).AddToTabList(RiderTabs.RYUKI_TAB_ITEM));
	  
	  public static final RegistryObject<Item> GOLDPHOENIX_ADVENT = ITEMS.register("goldphoenix_advent",
	            () -> new RiderFormChangeItem(new Item.Properties(),0,"","odin","v_buckle_belt_odin",
	            		new MobEffectInstance(MobEffects.JUMP, 40, 4,true,false),new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 2,true,false)
	            		,new MobEffectInstance(MobEffects.DIG_SPEED, 40, 0,true,false),new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 5,true,false)
	            		,new MobEffectInstance (MobEffects.DAMAGE_RESISTANCE, 40, 4,true,false)).AddToTabList(RiderTabs.RYUKI_TAB_ITEM));
	  
	  public static final RegistryObject<Item> DESTWILDER_ADVENT = ITEMS.register("destwilder_advent",
	            () -> new RiderFormChangeItem(new Item.Properties(),0,"","tiger","v_buckle_belt_tiger",
	            		new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 0,true,false),new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 1,true,false)
	            		,new MobEffectInstance(MobEffects.DIG_SPEED, 40, 1,true,false)).AddToTabList(RiderTabs.RYUKI_TAB_ITEM));
	  
	  public static final RegistryObject<Item> GIGAZELLE_ADVENT = ITEMS.register("gigazelle_advent",
	            () -> new RiderFormChangeItem(new Item.Properties(),0,"","imperer","v_buckle_belt_imperer",
	            		new MobEffectInstance(MobEffects.JUMP, 40, 3,true,false),new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 2,true,false)
	            		,new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 1,true,false)).AddToTabList(RiderTabs.RYUKI_TAB_ITEM));
	  
	  public static final RegistryObject<Item> BLANCWING_ADVENT = ITEMS.register("blancwing_advent",
	            () -> new RiderFormChangeItem(new Item.Properties(),0,"","femme","v_buckle_belt_femme",
	            		new MobEffectInstance(MobEffects.JUMP, 40, 3,true,false),new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 1,true,false)
	            		,new MobEffectInstance(MobEffects.DIG_SPEED, 40, 1,true,false),new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 0,true,false)).AddToTabList(RiderTabs.RYUKI_TAB_ITEM));
	  
	  public static final RegistryObject<Item> DRAGBLACKER_ADVENT = ITEMS.register("dragblacker_advent",
	            () -> new RiderFormChangeItem(new Item.Properties(),0,"","ryuga","v_buckle_belt_ryuga",
	            		new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 40, 0,true,false),new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 0,true,false)
	            		,new MobEffectInstance(MobEffects.DIG_SPEED, 40, 0,true,false)).AddToTabList(RiderTabs.RYUKI_TAB_ITEM));
	  
	  public static final RegistryObject<Item> BIOGREEZA_ADVENT = ITEMS.register("biogreeza_advent",
	            () -> new RiderFormChangeItem(new Item.Properties(),0,"","verde","v_buckle_belt_verde",
	            		new MobEffectInstance(MobEffects.JUMP, 40, 5,true,false),new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 2,true,false)
	            		,new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 1,true,false)).AddToTabList(RiderTabs.RYUKI_TAB_ITEM));
	  
	  public static final RegistryObject<Item> ABYSSLASHER_ADVENT = ITEMS.register("abysslasher_advent",
	            () -> new RiderFormChangeItem(new Item.Properties(),0,"","abyss","v_buckle_belt_abyss",
	            		new MobEffectInstance(MobEffects.WATER_BREATHING, 40, 0,true,false),new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 1,true,false)
	            		,new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 1,true,false)).AddToTabList(RiderTabs.RYUKI_TAB_ITEM));
	  
	  public static final RegistryObject<Item> PSYCOROGUE_ADVENT = ITEMS.register("psycorogue_advent",
	            () -> new RiderFormChangeItem(new Item.Properties(),0,"","alternative","alternative_belt",
	            		new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 0,true,false)
	            		,new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 2,true,false)).AddToTabList(RiderTabs.RYUKI_TAB_ITEM));
	  
	  public static final RegistryObject<Item> SURVIVE_REKKA_RYUGA = ITEMS.register("survive_rekka_ryuga",
	            () -> new RiderFormChangeItem(new Item.Properties(),0,"_survive","ryuga","v_buckle_belt_ryuga_survive",
	            		new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 40, 0,true,false),new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 1,true,false)
	            		,new MobEffectInstance(MobEffects.DIG_SPEED, 40, 1,true,false),new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 4,true,false)
	            		,new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false)));

	  public static final RegistryObject<Item> SURVIVE_REKKA = ITEMS.register("survive_rekka",
	            () -> new RiderFormChangeItem(new Item.Properties(),0,"_survive","ryuki","v_buckle_belt_ryuki_survive",
	            		new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 40, 0,true,false),new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 1,true,false)
	            		,new MobEffectInstance(MobEffects.DIG_SPEED, 40, 1,true,false),new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 4,true,false)
	            		,new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false)).addAlternative(SURVIVE_REKKA_RYUGA.get()).AddToTabList(RiderTabs.RYUKI_TAB_ITEM));

	  public static final RegistryObject<Item> SURVIVE_SHIPPU_RAIA = ITEMS.register("survive_shippu_raia",
	            () -> new RiderFormChangeItem(new Item.Properties(),0,"_survive","raia","v_buckle_belt_raia_survive",
	            		new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 0,true,false),new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 1,true,false)
	            		,new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 5,true,false),new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false)
	            		,new MobEffectInstance(MobEffects.DIG_SPEED, 40, 0,true,false)));

	  public static final RegistryObject<Item> SURVIVE_SHIPPU_OUJA = ITEMS.register("survive_shippu_ouja",
	            () -> new RiderFormChangeItem(new Item.Properties(),0,"_survive","ouja","v_buckle_belt_ouja_survive",
	            		new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 0,true,false),new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 1,true,false)
	            		,new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 5,true,false),new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false)
	            		,new MobEffectInstance(MobEffects.DIG_SPEED, 40, 0,true,false)));
	  
	  public static final RegistryObject<Item> SURVIVE_SHIPPU = ITEMS.register("survive_shippu",
	            () -> new RiderFormChangeItem(new Item.Properties(),0,"_survive","knight","v_buckle_belt_knight_survive",
	            		new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 0,true,false),new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 1,true,false)
	            		,new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 5,true,false),new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false)
	            		,new MobEffectInstance(MobEffects.DIG_SPEED, 40, 0,true,false)).AddToTabList(RiderTabs.RYUKI_TAB_ITEM));

	  public static final RegistryObject<Item> SURVIVE_MUGEN = ITEMS.register("survive_mugen",
	            () -> new RiderFormChangeItem(new Item.Properties(),0,"_survive","ouja","v_buckle_belt_ouja_survive",
	            		new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 0,true,false),new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 1,true,false)
	            		,new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 5,true,false),new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false)
	            		,new MobEffectInstance(MobEffects.DIG_SPEED, 40, 0,true,false)).addAlternative(SURVIVE_SHIPPU_RAIA.get()).addAlternative(SURVIVE_SHIPPU_OUJA.get()).AddToTabList(RiderTabs.RYUKI_TAB_ITEM));
	  
	  public static final RegistryObject<Item> SURVIVE_BLACK = ITEMS.register("survive_black",
	            () -> new RiderFormChangeItem(new Item.Properties(),0,"_survive_black","ryuki","v_buckle_belt_ryuki",
	            		new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 40, 0,true,false),new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 1,true,false)
	            		,new MobEffectInstance(MobEffects.DIG_SPEED, 40, 1,true,false),new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 4,true,false)
	            		,new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false)).AddToTabList(RiderTabs.RYUKI_TAB_ITEM));
	  
	  
	public static final RegistryObject<Item> RYUKIHELMET = ITEMS.register("ryukihead",
			() -> new RiderArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.HELMET, new Item.Properties()).AddToTabList(RiderTabs.RYUKI_TAB_ITEM).ChangeRepairItem(ADVENT_CARD.get()));
	public static final RegistryObject<Item> RTUKICHESTPLATE = ITEMS.register("ryukitroso",
			() -> new RiderArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.CHESTPLATE, new Item.Properties()).AddToTabList(RiderTabs.RYUKI_TAB_ITEM).ChangeRepairItem(ADVENT_CARD.get()));
	public static final RegistryObject<Item> RYUKILEGGINGS = ITEMS.register("ryukilegs",
			() -> new RiderArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.LEGGINGS, new Item.Properties()).AddToTabList(RiderTabs.RYUKI_TAB_ITEM).ChangeRepairItem(ADVENT_CARD.get()));

	public static final RegistryObject<Item> RYUKIDRIVER = ITEMS.register("v_buckle_ryuki",
			() -> new RiderDriverItem(ArmorMaterials.DIAMOND,"ryuki",DRAGREDER_ADVENT ,RYUKIHELMET,RTUKICHESTPLATE,RYUKILEGGINGS , new Item.Properties())
			.ChangeRepairItem(ADVENT_CARD.get()).AddToTabList(RiderTabs.RYUKI_TAB_ITEM));

	public static final RegistryObject<Item> KNIGHTDRIVER = ITEMS.register("v_buckle_knight",
			() -> new RiderDriverItem(ArmorMaterials.DIAMOND,"knight",DARKWING_ADVENT ,RYUKIHELMET,RTUKICHESTPLATE,RYUKILEGGINGS , new Item.Properties())
			.ChangeRepairItem(ADVENT_CARD.get()).AddToTabList(RiderTabs.RYUKI_TAB_ITEM));
	
	public static final RegistryObject<Item> SCISSORSDRIVER = ITEMS.register("v_buckle_scissors",
			() -> new RiderDriverItem(ArmorMaterials.DIAMOND,"scissors",VOLCANCER_ADVENT ,RYUKIHELMET,RTUKICHESTPLATE,RYUKILEGGINGS , new Item.Properties())
			.ChangeRepairItem(ADVENT_CARD.get()).AddToTabList(RiderTabs.RYUKI_TAB_ITEM));
	
	public static final RegistryObject<Item> ZOLDADRIVER = ITEMS.register("v_buckle_zolda",
			() -> new RiderDriverItem(ArmorMaterials.DIAMOND,"zolda",MAGNUGIGA_ADVENT ,RYUKIHELMET,RTUKICHESTPLATE,RYUKILEGGINGS , new Item.Properties())
			.ChangeRepairItem(ADVENT_CARD.get()).AddToTabList(RiderTabs.RYUKI_TAB_ITEM));
	
	public static final RegistryObject<Item> RAIADRIVER = ITEMS.register("v_buckle_raia",
			() -> new RiderDriverItem(ArmorMaterials.DIAMOND,"raia",EVILDIVER_ADVENT ,RYUKIHELMET,RTUKICHESTPLATE,RYUKILEGGINGS , new Item.Properties())
			.ChangeRepairItem(ADVENT_CARD.get()).AddToTabList(RiderTabs.RYUKI_TAB_ITEM));
	
	public static final RegistryObject<Item> GAIDRIVER = ITEMS.register("v_buckle_gai",
			() -> new RiderDriverItem(ArmorMaterials.DIAMOND,"gai",METALGELAS_ADVENT ,RYUKIHELMET,RTUKICHESTPLATE,RYUKILEGGINGS , new Item.Properties())
			.ChangeRepairItem(ADVENT_CARD.get()).AddToTabList(RiderTabs.RYUKI_TAB_ITEM));
	
	public static final RegistryObject<Item> OUJADRIVER = ITEMS.register("v_buckle_ouja",
			() -> new RiderDriverItem(ArmorMaterials.DIAMOND,"ouja",VENOSNAKER_ADVENT ,RYUKIHELMET,RTUKICHESTPLATE,RYUKILEGGINGS , new Item.Properties())
			.ChangeRepairItem(ADVENT_CARD.get()).AddToTabList(RiderTabs.RYUKI_TAB_ITEM));
	
	public static final RegistryObject<Item> ODINDRIVER = ITEMS.register("v_buckle_odin",
			() -> new RiderDriverItem(ArmorMaterials.DIAMOND,"odin",GOLDPHOENIX_ADVENT ,RYUKIHELMET,RTUKICHESTPLATE,RYUKILEGGINGS , new Item.Properties())
			.ChangeRepairItem(ADVENT_CARD.get()).AddToTabList(RiderTabs.RYUKI_TAB_ITEM));
	
	public static final RegistryObject<Item> TIGERDRIVER = ITEMS.register("v_buckle_tiger",
			() -> new RiderDriverItem(ArmorMaterials.DIAMOND,"tiger",DESTWILDER_ADVENT ,RYUKIHELMET,RTUKICHESTPLATE,RYUKILEGGINGS , new Item.Properties())
			.ChangeRepairItem(ADVENT_CARD.get()).AddToTabList(RiderTabs.RYUKI_TAB_ITEM));
	
	public static final RegistryObject<Item> IMPERERDRIVER = ITEMS.register("v_buckle_imperer",
			() -> new RiderDriverItem(ArmorMaterials.DIAMOND,"imperer",GIGAZELLE_ADVENT ,RYUKIHELMET,RTUKICHESTPLATE,RYUKILEGGINGS , new Item.Properties())
			.ChangeRepairItem(ADVENT_CARD.get()).AddToTabList(RiderTabs.RYUKI_TAB_ITEM));
	
	public static final RegistryObject<Item> FEMMEDRIVER = ITEMS.register("v_buckle_femme",
			() -> new RiderDriverItem(ArmorMaterials.DIAMOND,"femme",BLANCWING_ADVENT ,RYUKIHELMET,RTUKICHESTPLATE,RYUKILEGGINGS , new Item.Properties())
			.ChangeRepairItem(ADVENT_CARD.get()).AddToTabList(RiderTabs.RYUKI_TAB_ITEM));
	
	public static final RegistryObject<Item> RYUGADRIVER = ITEMS.register("v_buckle_ryuga",
			() -> new RiderDriverItem(ArmorMaterials.DIAMOND,"ryuga",DRAGBLACKER_ADVENT ,RYUKIHELMET,RTUKICHESTPLATE,RYUKILEGGINGS , new Item.Properties())
			.ChangeRepairItem(ADVENT_CARD.get()).AddToTabList(RiderTabs.RYUKI_TAB_ITEM));
	
	public static final RegistryObject<Item> VERDEDRIVER = ITEMS.register("v_buckle_verde",
			() -> new RiderDriverItem(ArmorMaterials.DIAMOND,"verde",BIOGREEZA_ADVENT ,RYUKIHELMET,RTUKICHESTPLATE,RYUKILEGGINGS , new Item.Properties())
			.ChangeRepairItem(ADVENT_CARD.get()).AddToTabList(RiderTabs.RYUKI_TAB_ITEM));
	
	public static final RegistryObject<Item> ABYSSDRIVER = ITEMS.register("v_buckle_abyss",
			() -> new RiderDriverItem(ArmorMaterials.DIAMOND,"abyss",ABYSSLASHER_ADVENT ,RYUKIHELMET,RTUKICHESTPLATE,RYUKILEGGINGS , new Item.Properties())
			.ChangeRepairItem(ADVENT_CARD.get()).AddToTabList(RiderTabs.RYUKI_TAB_ITEM));
	
	public static final RegistryObject<Item> ALTERNATIVEDRIVER = ITEMS.register("alternative_v_buckle",
			() -> new RiderDriverItem(ArmorMaterials.DIAMOND,"alternative",PSYCOROGUE_ADVENT ,RYUKIHELMET,RTUKICHESTPLATE,RYUKILEGGINGS , new Item.Properties())
			.ChangeRepairItem(ADVENT_CARD.get()).AddToTabList(RiderTabs.RYUKI_TAB_ITEM));
	
	public static final RegistryObject<Item> ALTERNATIVEZERODRIVER = ITEMS.register("alternative_zero_v_buckle",
			() -> new RiderDriverItem(ArmorMaterials.DIAMOND,"alternative_zero",PSYCOROGUE_ADVENT ,RYUKIHELMET,RTUKICHESTPLATE,RYUKILEGGINGS , new Item.Properties())
			.ChangeRepairItem(ADVENT_CARD.get()).AddToTabList(RiderTabs.RYUKI_TAB_ITEM));

	
	public static final RegistryObject<Item> RIDE_VISOR = ITEMS.register("ride_visor",
			() -> new BaseItem(new Item.Properties()).AddToTabList(RiderTabs.RYUKI_TAB_ITEM));
	
    public static final RegistryObject<SwordItem> RIDE_SABER = ITEMS.register("ride_saber",
            () -> new BaseSwordItem(Tiers.DIAMOND, 3, 3.5f, new Item.Properties()).AddToTabList(RiderTabs.RYUKI_TAB_ITEM).ChangeRepairItem(ADVENT_CARD.get()));
	
    public static final RegistryObject<Item> DRAG_VISOR = ITEMS.register("drag_visor",
			() -> new BaseItem(new Item.Properties()).AddToTabList(RiderTabs.RYUKI_TAB_ITEM));
	
    public static final RegistryObject<SwordItem> DARK_VISOR = ITEMS.register("dark_visor",
            () -> new BaseSwordItem(Tiers.DIAMOND, 3, 3.5f, new Item.Properties()).AddToTabList(RiderTabs.RYUKI_TAB_ITEM).ChangeRepairItem(ADVENT_CARD.get()));
	
    public static final RegistryObject<SwordItem> WING_LANCER = ITEMS.register("wing_lancer",
            () -> new BaseSwordItem(Tiers.DIAMOND, 3, 3.5f, new Item.Properties()).AddToTabList(RiderTabs.RYUKI_TAB_ITEM).ChangeRepairItem(ADVENT_CARD.get()));
	
    /**
	drag_saber
	drag_claw
	drag_shield
	drag_visor_zwei
	dark_blade
	scissors_visor
	scissors_pincer 
	incisor_guard
	magna_visor
	torque_guard
	evil_visor
	metal_visor
	hetal_horn
	veno_visor
	veno_saber
	veno_visor_zwei
	dest_visor
	dest_claws
	gazelle_visor
	gold_visor
	gold_sabers
	gold_shield
	wing_slasher
	wing_shield
	dark_drag_visor
	drag_saber_ryuga
	ryuga_drag_claw
	ryuga_drag_shield
	blanc_visor
	bio_visor
	abyss_visor
	abyss_saber
	abyssmash
	slash_visor
	alternative_sword
	**/
	public static void register(IEventBus eventBus) {
		ITEMS.register(eventBus);
	}
}
