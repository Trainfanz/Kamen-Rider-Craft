package com.kelco.kamenridercraft.Items;

import com.kelco.kamenridercraft.KamenRiderCraftCore;
import com.kelco.kamenridercraft.Items.ooo.OOODriverItem;
import com.kelco.kamenridercraft.Items.rider_armor_base.BaseItem;
import com.kelco.kamenridercraft.Items.rider_armor_base.RiderArmorItem;
import com.kelco.kamenridercraft.Items.rider_armor_base.RiderFormChangeItem;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterials;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class Ryuki_Rider_Items {
	
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, KamenRiderCraftCore.MODID);
	
	public static final RegistryObject<Item> RYUKI_LOGO = ITEMS.register("ryuki_logo",
			() -> new BaseItem(new Item.Properties()).AddToTabList(RiderTabs.RYUKI_TAB_ITEM));

	public static final RegistryObject<Item> ADVENT_CARD = ITEMS.register("advent_card",
			() -> new BaseItem(new Item.Properties()).AddToTabList(RiderTabs.RYUKI_TAB_ITEM));
	
	
	  public static final RegistryObject<Item> DRAGREDER_ADVENT = ITEMS.register("dragreder_advent",
	            () -> new RiderFormChangeItem(new Item.Properties(),0,"","ryuki","ryuki_v_buckle",
	            		new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 40, 0,true,false),new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 0,true,false)
	            		,new MobEffectInstance(MobEffects.DIG_SPEED, 40, 0,true,false)).AddToTabList(RiderTabs.RYUKI_TAB_ITEM));
	  
	  public static final RegistryObject<Item> DARKWING_ADVENT = ITEMS.register("darkwing_advent",
	            () -> new RiderFormChangeItem(new Item.Properties(),0,"","knight","knight_v_buckle",
	            		new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 0,true,false),new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 0,true,false)
	            		,new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 0,true,false)).AddToTabList(RiderTabs.RYUKI_TAB_ITEM));
	
	  public static final RegistryObject<Item> VOLCANCER_ADVENT = ITEMS.register("volcancer_advent",
	            () -> new RiderFormChangeItem(new Item.Properties(),0,"","scissors","scissors_v_buckle",
	            		new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 0,true,false),new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 40, 0,true,false)
	            		,new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 1,true,false)).AddToTabList(RiderTabs.RYUKI_TAB_ITEM));
	  
	  public static final RegistryObject<Item> MAGNUGIGA_ADVENT = ITEMS.register("magnugiga_advent",
	            () -> new RiderFormChangeItem(new Item.Properties(),0,"","zolda","zolda_v_buckle",
	            		new MobEffectInstance(MobEffects.NIGHT_VISION, 40, 0,true,false),new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 0,true,false)
	            		,new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 0,true,false)).AddToTabList(RiderTabs.RYUKI_TAB_ITEM));
	  
	  public static final RegistryObject<Item> EVILDIVER_ADVENT = ITEMS.register("evildiver_advent",
	            () -> new RiderFormChangeItem(new Item.Properties(),0,"","raia","raia_v_buckle",
	            		new MobEffectInstance(MobEffects.DIG_SPEED, 40, 1,true,false),new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 2,true,false)
	            		,new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 1,true,false)).AddToTabList(RiderTabs.RYUKI_TAB_ITEM));
	  
	  public static final RegistryObject<Item> METALGELAS_ADVENT = ITEMS.register("metalgelas_advent",
	            () -> new RiderFormChangeItem(new Item.Properties(),0,"","gai","gai_v_buckle",
	            		new MobEffectInstance(MobEffects.DIG_SLOWDOWN, 40, 0,true,false),
	            		new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 3,true,false)).AddToTabList(RiderTabs.RYUKI_TAB_ITEM));
	  
	  public static final RegistryObject<Item> VENOSNAKER_ADVENT = ITEMS.register("venosnaker_advent",
	            () -> new RiderFormChangeItem(new Item.Properties(),0,"","ouja","ouja_v_buckle",
	            		new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 0,true,false)
	            		,new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 2,true,false)).AddToTabList(RiderTabs.RYUKI_TAB_ITEM));
	  
	  public static final RegistryObject<Item> DESTWILDER_ADVENT = ITEMS.register("destwilder_advent",
	            () -> new RiderFormChangeItem(new Item.Properties(),0,"","tiger","tiger_v_buckle",
	            		new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 0,true,false),new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 1,true,false)
	            		,new MobEffectInstance(MobEffects.DIG_SPEED, 40, 1,true,false)).AddToTabList(RiderTabs.RYUKI_TAB_ITEM));
	  
	  public static final RegistryObject<Item> GIGAZELLE_ADVENT = ITEMS.register("gigazelle_advent",
	            () -> new RiderFormChangeItem(new Item.Properties(),0,"","imperer","imperer_v_buckle",
	            		new MobEffectInstance(MobEffects.JUMP, 40, 3,true,false),new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 2,true,false)
	            		,new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 1,true,false)).AddToTabList(RiderTabs.RYUKI_TAB_ITEM));
	  
	  public static final RegistryObject<Item> BIOGREEZA_ADVENT = ITEMS.register("biogreeza_advent",
	            () -> new RiderFormChangeItem(new Item.Properties(),0,"","verde","verde_v_buckle",
	            		new MobEffectInstance(MobEffects.JUMP, 40, 5,true,false),new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 2,true,false)
	            		,new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 1,true,false)).AddToTabList(RiderTabs.RYUKI_TAB_ITEM));
	  
	  public static final RegistryObject<Item> BLANCWING_ADVENT = ITEMS.register("blancwing_advent",
	            () -> new RiderFormChangeItem(new Item.Properties(),0,"","femme","femme_v_buckle",
	            		new MobEffectInstance(MobEffects.JUMP, 40, 3,true,false),new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 1,true,false)
	            		,new MobEffectInstance(MobEffects.DIG_SPEED, 40, 1,true,false),new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 0,true,false)).AddToTabList(RiderTabs.RYUKI_TAB_ITEM));
	  
	  public static final RegistryObject<Item> GOLDPHOENIX_ADVENT = ITEMS.register("goldphoenix_advent",
	            () -> new RiderFormChangeItem(new Item.Properties(),0,"","odin","odin_v_buckle",
	            		new MobEffectInstance(MobEffects.JUMP, 40, 4,true,false),new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 2,true,false)
	            		,new MobEffectInstance(MobEffects.DIG_SPEED, 40, 0,true,false),new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 5,true,false)
	            		,new MobEffectInstance (MobEffects.DAMAGE_RESISTANCE, 40, 4,true,false)).AddToTabList(RiderTabs.RYUKI_TAB_ITEM));
	  
	  public static final RegistryObject<Item> ABYSSLASHER_ADVENT = ITEMS.register("abysslasher_advent",
	            () -> new RiderFormChangeItem(new Item.Properties(),0,"","abyss","abyss_v_buckle",
	            		new MobEffectInstance(MobEffects.WATER_BREATHING, 40, 0,true,false),new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 1,true,false)
	            		,new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 1,true,false)).AddToTabList(RiderTabs.RYUKI_TAB_ITEM));
	  
	  public static final RegistryObject<Item> DRAGBLACKER_ADVENT = ITEMS.register("dragblacker_advent",
	            () -> new RiderFormChangeItem(new Item.Properties(),0,"","ryuga","ryuga_v_buckle",
	            		new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 40, 0,true,false),new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 0,true,false)
	            		,new MobEffectInstance(MobEffects.DIG_SPEED, 40, 0,true,false)).AddToTabList(RiderTabs.RYUKI_TAB_ITEM));
	  
	  //psycorogue
	  
	public static final RegistryObject<Item> RYUKIHELMET = ITEMS.register("ryukihead",
			() -> new RiderArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.HELMET, new Item.Properties()).AddToTabList(RiderTabs.RYUKI_TAB_ITEM).ChangeRepairItem(ADVENT_CARD.get()));
	public static final RegistryObject<Item> RTUKICHESTPLATE = ITEMS.register("ryukitroso",
			() -> new RiderArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.CHESTPLATE, new Item.Properties()).AddToTabList(RiderTabs.RYUKI_TAB_ITEM).ChangeRepairItem(ADVENT_CARD.get()));
	public static final RegistryObject<Item> RYUKILEGGINGS = ITEMS.register("ryukilegs",
			() -> new RiderArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.LEGGINGS, new Item.Properties()).AddToTabList(RiderTabs.RYUKI_TAB_ITEM).ChangeRepairItem(ADVENT_CARD.get()));

	public static final RegistryObject<Item> RYUKIDRIVER = ITEMS.register("ryuki_v_buckle",
			() -> new OOODriverItem(ArmorMaterials.DIAMOND,"ryuki",DRAGREDER_ADVENT ,RYUKIHELMET,RTUKICHESTPLATE,RYUKILEGGINGS , new Item.Properties())
			.ChangeRepairItem(ADVENT_CARD.get()).AddToTabList(RiderTabs.RYUKI_TAB_ITEM));

	public static final RegistryObject<Item> KNIGHTDRIVER = ITEMS.register("knight_v_buckle",
			() -> new OOODriverItem(ArmorMaterials.DIAMOND,"knight",DARKWING_ADVENT ,RYUKIHELMET,RTUKICHESTPLATE,RYUKILEGGINGS , new Item.Properties())
			.ChangeRepairItem(ADVENT_CARD.get()).AddToTabList(RiderTabs.RYUKI_TAB_ITEM));
	
	public static final RegistryObject<Item> SCISSORSDRIVER = ITEMS.register("scissors_v_buckle",
			() -> new OOODriverItem(ArmorMaterials.DIAMOND,"scissors",VOLCANCER_ADVENT ,RYUKIHELMET,RTUKICHESTPLATE,RYUKILEGGINGS , new Item.Properties())
			.ChangeRepairItem(ADVENT_CARD.get()).AddToTabList(RiderTabs.RYUKI_TAB_ITEM));
	
	public static final RegistryObject<Item> ZOLDADRIVER = ITEMS.register("zolda_v_buckle",
			() -> new OOODriverItem(ArmorMaterials.DIAMOND,"zolda",MAGNUGIGA_ADVENT ,RYUKIHELMET,RTUKICHESTPLATE,RYUKILEGGINGS , new Item.Properties())
			.ChangeRepairItem(ADVENT_CARD.get()).AddToTabList(RiderTabs.RYUKI_TAB_ITEM));
	
	public static final RegistryObject<Item> RAIADRIVER = ITEMS.register("raia_v_buckle",
			() -> new OOODriverItem(ArmorMaterials.DIAMOND,"raia",EVILDIVER_ADVENT ,RYUKIHELMET,RTUKICHESTPLATE,RYUKILEGGINGS , new Item.Properties())
			.ChangeRepairItem(ADVENT_CARD.get()).AddToTabList(RiderTabs.RYUKI_TAB_ITEM));
	
	public static final RegistryObject<Item> GAIDRIVER = ITEMS.register("gai_v_buckle",
			() -> new OOODriverItem(ArmorMaterials.DIAMOND,"gai",METALGELAS_ADVENT ,RYUKIHELMET,RTUKICHESTPLATE,RYUKILEGGINGS , new Item.Properties())
			.ChangeRepairItem(ADVENT_CARD.get()).AddToTabList(RiderTabs.RYUKI_TAB_ITEM));
	
	public static final RegistryObject<Item> OUJADRIVER = ITEMS.register("ouja_v_buckle",
			() -> new OOODriverItem(ArmorMaterials.DIAMOND,"ouja",VENOSNAKER_ADVENT ,RYUKIHELMET,RTUKICHESTPLATE,RYUKILEGGINGS , new Item.Properties())
			.ChangeRepairItem(ADVENT_CARD.get()).AddToTabList(RiderTabs.RYUKI_TAB_ITEM));
	
	public static final RegistryObject<Item> TIGERDRIVER = ITEMS.register("tiger_v_buckle",
			() -> new OOODriverItem(ArmorMaterials.DIAMOND,"tiger",DESTWILDER_ADVENT ,RYUKIHELMET,RTUKICHESTPLATE,RYUKILEGGINGS , new Item.Properties())
			.ChangeRepairItem(ADVENT_CARD.get()).AddToTabList(RiderTabs.RYUKI_TAB_ITEM));
	
	public static final RegistryObject<Item> IMPERERDRIVER = ITEMS.register("imperer_v_buckle",
			() -> new OOODriverItem(ArmorMaterials.DIAMOND,"imperer",GIGAZELLE_ADVENT ,RYUKIHELMET,RTUKICHESTPLATE,RYUKILEGGINGS , new Item.Properties())
			.ChangeRepairItem(ADVENT_CARD.get()).AddToTabList(RiderTabs.RYUKI_TAB_ITEM));
	
	public static final RegistryObject<Item> VERDEDRIVER = ITEMS.register("verde_v_buckle",
			() -> new OOODriverItem(ArmorMaterials.DIAMOND,"verde",BIOGREEZA_ADVENT ,RYUKIHELMET,RTUKICHESTPLATE,RYUKILEGGINGS , new Item.Properties())
			.ChangeRepairItem(ADVENT_CARD.get()).AddToTabList(RiderTabs.RYUKI_TAB_ITEM));
	
	public static final RegistryObject<Item> FEMMEDRIVER = ITEMS.register("femme_v_buckle",
			() -> new OOODriverItem(ArmorMaterials.DIAMOND,"femme",BLANCWING_ADVENT ,RYUKIHELMET,RTUKICHESTPLATE,RYUKILEGGINGS , new Item.Properties())
			.ChangeRepairItem(ADVENT_CARD.get()).AddToTabList(RiderTabs.RYUKI_TAB_ITEM));
	
	public static final RegistryObject<Item> ODINDRIVER = ITEMS.register("odin_v_buckle",
			() -> new OOODriverItem(ArmorMaterials.DIAMOND,"odin",GOLDPHOENIX_ADVENT ,RYUKIHELMET,RTUKICHESTPLATE,RYUKILEGGINGS , new Item.Properties())
			.ChangeRepairItem(ADVENT_CARD.get()).AddToTabList(RiderTabs.RYUKI_TAB_ITEM));
	
	public static final RegistryObject<Item> ABYSSDRIVER = ITEMS.register("abyss_v_buckle",
			() -> new OOODriverItem(ArmorMaterials.DIAMOND,"abyss",ABYSSLASHER_ADVENT ,RYUKIHELMET,RTUKICHESTPLATE,RYUKILEGGINGS , new Item.Properties())
			.ChangeRepairItem(ADVENT_CARD.get()).AddToTabList(RiderTabs.RYUKI_TAB_ITEM));
	
	public static final RegistryObject<Item> RYUGADRIVER = ITEMS.register("ryuga_v_buckle",
			() -> new OOODriverItem(ArmorMaterials.DIAMOND,"ryuga",DRAGBLACKER_ADVENT ,RYUKIHELMET,RTUKICHESTPLATE,RYUKILEGGINGS , new Item.Properties())
			.ChangeRepairItem(ADVENT_CARD.get()).AddToTabList(RiderTabs.RYUKI_TAB_ITEM));
	
	
	public static void register(IEventBus eventBus) {
		ITEMS.register(eventBus);
	}
}
