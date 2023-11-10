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

public class Ichigo_Rider_Items {
	
	  public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, KamenRiderCraftCore.MODID);
	    	     
	    public static final RegistryObject<Item> KAMEN_RIDER_LOGO = ITEMS.register("kamen_rider_logo",
	    		() -> new BaseItem(new Item.Properties()).AddToTabList(RiderTabs.ICHIGO_TAB_ITEM));
	    
	    
	    public static final RegistryObject<Item> TYPHOON_CORE = ITEMS.register("typhoon_core",
	            () -> new RiderFormChangeItem(new Item.Properties(),0,"","ichigo","typhoon_belt",
	            		new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 1,true,false),new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 1,true,false)
	            		,new MobEffectInstance(MobEffects.JUMP, 40, 2,true,false)).AddToTabList(RiderTabs.ICHIGO_TAB_ITEM));
	    
	    public static final RegistryObject<Item> TYPHOON_CORE_NIGO = ITEMS.register("typhoon_core_nigo",
	            () -> new RiderFormChangeItem(new Item.Properties(),0,"","nigo","typhoon_belt",
	            		new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 1,true,false),new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 1,true,false)
	            		,new MobEffectInstance(MobEffects.JUMP, 40, 2,true,false)).AddToTabList(RiderTabs.ICHIGO_TAB_ITEM));
	    

	    public static final RegistryObject<Item> ORIGINAL_TYPHOON_CORE_NIGO = ITEMS.register("original_typhoon_core_nigo",
	            () -> new RiderFormChangeItem(new Item.Properties(),0,"_original","nigo","typhoon_belt",
	            		new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 1,true,false),new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 1,true,false)
	            		,new MobEffectInstance(MobEffects.JUMP, 40, 2,true,false)));

	    public static final RegistryObject<Item> ORIGINAL_TYPHOON_CORE = ITEMS.register("original_typhoon_core",
	            () -> new RiderFormChangeItem(new Item.Properties(),0,"_original","ichigo","typhoon_belt_original",
	            		new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 1,true,false),new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 1,true,false)
	            		,new MobEffectInstance(MobEffects.JUMP, 40, 2,true,false)).addAlternative(ORIGINAL_TYPHOON_CORE_NIGO.get()).AddToTabList(RiderTabs.ICHIGO_TAB_ITEM));

	    
	    public static final RegistryObject<Item> SAKURAJIMA_TYPHOON_CORE = ITEMS.register("sakurajima_typhoon_core",
	            () -> new RiderFormChangeItem(new Item.Properties(),0,"_sakurajima","ichigo","typhoon_belt_original",
	            		new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 1,true,false),new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 1,true,false)
	            		,new MobEffectInstance(MobEffects.JUMP, 40, 2,true,false)).AddToTabList(RiderTabs.ICHIGO_TAB_ITEM));

	    public static final RegistryObject<Item> TYPHOON_CORE_SANGO = ITEMS.register("typhoon_core_sango",
	            () -> new RiderFormChangeItem(new Item.Properties(),0,"","sango","typhoon_belt_sango",
	            		new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 1,true,false),new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 1,true,false)
	            		,new MobEffectInstance(MobEffects.JUMP, 40, 2,true,false)).AddToTabList(RiderTabs.ICHIGO_TAB_ITEM));
	    
	    public static final RegistryObject<Item> RIDER3_VS_THE_DEMON_OF_GENERAL_BLACK = ITEMS.register("rider3_vs_the_demon_of_general_black",
	            () -> new RiderFormChangeItem(new Item.Properties(),0,"_manga","sango","typhoon_belt_original",
	            		new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 1,true,false),new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 1,true,false)
	            		,new MobEffectInstance(MobEffects.JUMP, 40, 2,true,false)).AddToTabList(RiderTabs.ICHIGO_TAB_ITEM));
	    
	    public static final RegistryObject<Item> TYPHOON_CORE_YONGO = ITEMS.register("typhoon_core_yongo",
	            () -> new RiderFormChangeItem(new Item.Properties(),0,"","yongo","typhoon_belt_yongo",
	            		new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 1,true,false),new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 1,true,false)
	            		,new MobEffectInstance(MobEffects.JUMP, 40, 2,true,false)).AddToTabList(RiderTabs.ICHIGO_TAB_ITEM));
	    
	    public static final RegistryObject<Item> NEW_TYPHOON_CORE = ITEMS.register("new_typhoon_core",
	            () -> new RiderFormChangeItem(new Item.Properties(),0,"_new","ichigo","new_typhoon_belt",
	            		new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 1,true,false),new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 1,true,false)
	            		,new MobEffectInstance(MobEffects.JUMP, 40, 2,true,false)).AddToTabList(RiderTabs.ICHIGO_TAB_ITEM));
	    
	    public static final RegistryObject<Item> SHOCKER_RIDER_TYPHOON_CORE = ITEMS.register("shocker_rider_typhoon_core",
	            () -> new RiderFormChangeItem(new Item.Properties(),0,"","shocker_rider","shocker_rider_typhoon_belt",
	            		new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 1,true,false),new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 1,true,false)
	            		,new MobEffectInstance(MobEffects.JUMP, 40, 2,true,false)).AddToTabList(RiderTabs.ICHIGO_TAB_ITEM));
	    
	    public static final RegistryObject<Item> NOPHOON_CORE = ITEMS.register("nophoon_core",
	            () -> new RiderFormChangeItem(new Item.Properties(),0,"","ichigo","nophoon_belt",
	            		new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 1,true,false),new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 1,true,false)
	            		,new MobEffectInstance(MobEffects.JUMP, 40, 2,true,false)).AddToTabList(RiderTabs.ICHIGO_TAB_ITEM));
	

	    public static final RegistryObject<Item> ICHIGOHELMET = ITEMS.register("ichigohead",
	            () -> new RiderArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.HELMET, new Item.Properties()).AddToTabList(RiderTabs.ICHIGO_TAB_ITEM));
	    public static final RegistryObject<Item> ICHIGOCHESTPLATE = ITEMS.register("ichigotroso",
	            () -> new RiderArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.CHESTPLATE, new Item.Properties()).AddToTabList(RiderTabs.ICHIGO_TAB_ITEM));
	    public static final RegistryObject<Item> ICHIGOLEGGINGS = ITEMS.register("ichigolegs",
	            () -> new RiderArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.LEGGINGS, new Item.Properties()).AddToTabList(RiderTabs.ICHIGO_TAB_ITEM));
	    
	    

	    public static final RegistryObject<Item> TYPHOON_ICHIGO = ITEMS.register("typhoon_ichigo",
	           () -> new RiderDriverItem(ArmorMaterials.DIAMOND,"ichigo",TYPHOON_CORE ,ICHIGOHELMET, ICHIGOCHESTPLATE,ICHIGOLEGGINGS , new Item.Properties()).AddToTabList(RiderTabs.ICHIGO_TAB_ITEM));

	    public static final RegistryObject<Item> TYPHOON_NIGO = ITEMS.register("typhoon_nigo",
	            () -> new RiderDriverItem(ArmorMaterials.DIAMOND,"nigo",TYPHOON_CORE,ICHIGOHELMET, ICHIGOCHESTPLATE,ICHIGOLEGGINGS , new Item.Properties()).AddToTabList(RiderTabs.ICHIGO_TAB_ITEM));
	    
	    public static final RegistryObject<Item> TYPHOON_SANGO = ITEMS.register("typhoon_sango",
	            () -> new RiderDriverItem(ArmorMaterials.DIAMOND,"sango",TYPHOON_CORE_SANGO,ICHIGOHELMET, ICHIGOCHESTPLATE,ICHIGOLEGGINGS , new Item.Properties()).AddToTabList(RiderTabs.ICHIGO_TAB_ITEM));


	    public static final RegistryObject<Item> TYPHOON_YONGO = ITEMS.register("typhoon_yongo",
	            () -> new RiderDriverItem(ArmorMaterials.DIAMOND,"yongo",TYPHOON_CORE_YONGO,ICHIGOHELMET, ICHIGOCHESTPLATE,ICHIGOLEGGINGS , new Item.Properties()).AddToTabList(RiderTabs.ICHIGO_TAB_ITEM));

	    public static final RegistryObject<Item> TYPHOON_SHOCKER_RIDER_1 = ITEMS.register("typhoon_shocker_rider_1",
	            () -> new RiderDriverItem(ArmorMaterials.DIAMOND,"shocker_rider_1",TYPHOON_CORE ,ICHIGOHELMET, ICHIGOCHESTPLATE,ICHIGOLEGGINGS , new Item.Properties()).AddToTabList(RiderTabs.ICHIGO_TAB_ITEM));

	    public static final RegistryObject<Item> TYPHOON_SHOCKER_RIDER_2 = ITEMS.register("typhoon_shocker_rider_2",
	            () -> new RiderDriverItem(ArmorMaterials.DIAMOND,"shocker_rider_2",TYPHOON_CORE ,ICHIGOHELMET, ICHIGOCHESTPLATE,ICHIGOLEGGINGS , new Item.Properties()).AddToTabList(RiderTabs.ICHIGO_TAB_ITEM));


	    public static final RegistryObject<Item> TYPHOON_SHOCKER_RIDER_3 = ITEMS.register("typhoon_shocker_rider_3",
	            () -> new RiderDriverItem(ArmorMaterials.DIAMOND,"shocker_rider_3",TYPHOON_CORE ,ICHIGOHELMET, ICHIGOCHESTPLATE,ICHIGOLEGGINGS , new Item.Properties()).AddToTabList(RiderTabs.ICHIGO_TAB_ITEM));


	    public static final RegistryObject<Item> TYPHOON_SHOCKER_RIDER_4 = ITEMS.register("typhoon_shocker_rider_4",
	            () -> new RiderDriverItem(ArmorMaterials.DIAMOND,"shocker_rider_4",TYPHOON_CORE ,ICHIGOHELMET, ICHIGOCHESTPLATE,ICHIGOLEGGINGS , new Item.Properties()).AddToTabList(RiderTabs.ICHIGO_TAB_ITEM));


	    public static final RegistryObject<Item> TYPHOON_SHOCKER_RIDER_5 = ITEMS.register("typhoon_shocker_rider_5",
	            () -> new RiderDriverItem(ArmorMaterials.DIAMOND,"shocker_rider_5",TYPHOON_CORE ,ICHIGOHELMET, ICHIGOCHESTPLATE,ICHIGOLEGGINGS , new Item.Properties()).AddToTabList(RiderTabs.ICHIGO_TAB_ITEM));


	    public static final RegistryObject<Item> TYPHOON_SHOCKER_RIDER_6 = ITEMS.register("typhoon_shocker_rider_6",
	            () -> new RiderDriverItem(ArmorMaterials.DIAMOND,"shocker_rider_6",TYPHOON_CORE ,ICHIGOHELMET, ICHIGOCHESTPLATE,ICHIGOLEGGINGS , new Item.Properties()).AddToTabList(RiderTabs.ICHIGO_TAB_ITEM));


	    public static final RegistryObject<Item> TYPHOON_SHOCKER_RIDER_7 = ITEMS.register("typhoon_shocker_rider_7",
	            () -> new RiderDriverItem(ArmorMaterials.DIAMOND,"shocker_rider_7",TYPHOON_CORE ,ICHIGOHELMET, ICHIGOCHESTPLATE,ICHIGOLEGGINGS , new Item.Properties()).AddToTabList(RiderTabs.ICHIGO_TAB_ITEM));


	    public static final RegistryObject<Item> TYPHOON_SHOCKER_RIDER_8 = ITEMS.register("typhoon_shocker_rider_8",
	            () -> new RiderDriverItem(ArmorMaterials.DIAMOND,"shocker_rider_8",TYPHOON_CORE ,ICHIGOHELMET, ICHIGOCHESTPLATE,ICHIGOLEGGINGS , new Item.Properties()).AddToTabList(RiderTabs.ICHIGO_TAB_ITEM));


	    public static final RegistryObject<Item> TYPHOON_SHOCKER_RIDER_9 = ITEMS.register("typhoon_shocker_rider_9",
	            () -> new RiderDriverItem(ArmorMaterials.DIAMOND,"shocker_rider_9",TYPHOON_CORE ,ICHIGOHELMET, ICHIGOCHESTPLATE,ICHIGOLEGGINGS , new Item.Properties()).AddToTabList(RiderTabs.ICHIGO_TAB_ITEM));


	    public static final RegistryObject<Item> TYPHOON_SHOCKER_RIDER_10 = ITEMS.register("typhoon_shocker_rider_10",
	            () -> new RiderDriverItem(ArmorMaterials.DIAMOND,"shocker_rider_10",TYPHOON_CORE ,ICHIGOHELMET, ICHIGOCHESTPLATE,ICHIGOLEGGINGS , new Item.Properties()).AddToTabList(RiderTabs.ICHIGO_TAB_ITEM));


	    public static final RegistryObject<Item> TYPHOON_SHOCKER_RIDER_11 = ITEMS.register("typhoon_shocker_rider_11",
	            () -> new RiderDriverItem(ArmorMaterials.DIAMOND,"shocker_rider_11",TYPHOON_CORE ,ICHIGOHELMET, ICHIGOCHESTPLATE,ICHIGOLEGGINGS , new Item.Properties()).AddToTabList(RiderTabs.ICHIGO_TAB_ITEM));

	    public static final RegistryObject<Item> TYPHOON_SHOCKER_RIDER_12 = ITEMS.register("typhoon_shocker_rider_12",
	            () -> new RiderDriverItem(ArmorMaterials.DIAMOND,"shocker_rider_12",TYPHOON_CORE ,ICHIGOHELMET, ICHIGOCHESTPLATE,ICHIGOLEGGINGS , new Item.Properties()).AddToTabList(RiderTabs.ICHIGO_TAB_ITEM));
	    
	    public static final RegistryObject<Item> NOPHOON_KAMEN_NORIDER = ITEMS.register("nophoon_kamen_norider",
	            () -> new RiderDriverItem(ArmorMaterials.DIAMOND,"kamen_norider",NOPHOON_CORE ,ICHIGOHELMET, ICHIGOCHESTPLATE,ICHIGOLEGGINGS , new Item.Properties()).AddToTabList(RiderTabs.ICHIGO_TAB_ITEM));

	    public static final RegistryObject<Item> TYPHOON_DARK_ICHIGO = ITEMS.register("typhoon_dark_ichigo",
		           () -> new RiderDriverItem(ArmorMaterials.DIAMOND,"dark_ichigo",TYPHOON_CORE ,ICHIGOHELMET, ICHIGOCHESTPLATE,ICHIGOLEGGINGS , new Item.Properties())
		           .Override_belt_text("dark_typhoon_belt").AddToTabList(RiderTabs.ICHIGO_TAB_ITEM));

	    public static final RegistryObject<Item> TYPHOON_DARK_NIGO = ITEMS.register("typhoon_dark_nigo",
		           () -> new RiderDriverItem(ArmorMaterials.DIAMOND,"dark_nigo",TYPHOON_CORE ,ICHIGOHELMET, ICHIGOCHESTPLATE,ICHIGOLEGGINGS , new Item.Properties())
		           .Override_belt_text("dark_typhoon_belt").AddToTabList(RiderTabs.ICHIGO_TAB_ITEM));

	    //V3
	    
	    public static final RegistryObject<Item> V3_LOGO = ITEMS.register("v3_logo",
	    		() -> new BaseItem(new Item.Properties()).AddToTabList(RiderTabs.V3_TAB_ITEM));
	    public static final RegistryObject<Item> RIDERMAN_LOGO = ITEMS.register("riderman_logo",
	    		() -> new BaseItem(new Item.Properties()).AddToTabList(RiderTabs.V3_TAB_ITEM));

	    public static final RegistryObject<Item> DOUBLE_TYPHOON_CORE = ITEMS.register("double_typhoon_core",
	            () -> new RiderFormChangeItem(new Item.Properties(),0,"","v3","double_typhoon_belt",
	            		new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 1,true,false),new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 1,true,false)
	            		,new MobEffectInstance(MobEffects.JUMP, 40, 2,true,false),new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 1,true,false)).AddToTabList(RiderTabs.V3_TAB_ITEM));
	    
	    public static final RegistryObject<Item> BLUE_DOUBLE_TYPHOON_CORE = ITEMS.register("blue_double_typhoon_core",
	            () -> new RiderFormChangeItem(new Item.Properties(),0,"_blue","v3","double_typhoon_belt",
	            		new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 1,true,false),new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 2,true,false)
	            		,new MobEffectInstance(MobEffects.JUMP, 40, 2,true,false),new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false)).AddToTabList(RiderTabs.V3_TAB_ITEM));

	    public static final RegistryObject<Item> RIDERMAN_BELT_CORE = ITEMS.register("riderman_belt_core",
	            () -> new RiderFormChangeItem(new Item.Properties(),0,"","riderman","riderman_belt",
	            		new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 1,true,false),new MobEffectInstance(MobEffects.REGENERATION,200, 0,true,false)
	            		,new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false)).AddToTabList(RiderTabs.V3_TAB_ITEM));

	    public static final RegistryObject<Item> V3HELMET = ITEMS.register("v3head",
	            () -> new RiderArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.HELMET, new Item.Properties()).AddToTabList(RiderTabs.V3_TAB_ITEM));
	    public static final RegistryObject<Item> V3CHESTPLATE = ITEMS.register("v3troso",
	            () -> new RiderArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.CHESTPLATE, new Item.Properties()).AddToTabList(RiderTabs.V3_TAB_ITEM));
	    public static final RegistryObject<Item> V3LEGGINGS = ITEMS.register("v3legs",
	            () -> new RiderArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.LEGGINGS, new Item.Properties()).AddToTabList(RiderTabs.V3_TAB_ITEM));
	    
	    public static final RegistryObject<Item> DOUBLE_TYPHOON = ITEMS.register("double_typhoon",
		           () -> new RiderDriverItem(ArmorMaterials.DIAMOND,"v3",DOUBLE_TYPHOON_CORE ,V3HELMET,V3CHESTPLATE,V3LEGGINGS , new Item.Properties()).AddToTabList(RiderTabs.V3_TAB_ITEM));

	    public static final RegistryObject<Item> RIDERMAN_BELT = ITEMS.register("riderman_belt",
		           () -> new RiderDriverItem(ArmorMaterials.DIAMOND,"riderman",RIDERMAN_BELT_CORE ,V3HELMET,V3CHESTPLATE,V3LEGGINGS , new Item.Properties()).AddToTabList(RiderTabs.V3_TAB_ITEM));

	    public static final RegistryObject<Item> DARK_DOUBLE_TYPHOON = ITEMS.register("dark_double_typhoon",
		           () -> new RiderDriverItem(ArmorMaterials.DIAMOND,"dark_v3",DOUBLE_TYPHOON_CORE ,V3HELMET,V3CHESTPLATE,V3LEGGINGS , new Item.Properties())
		           .Override_belt_text("dark_double_typhoon_belt").AddToTabList(RiderTabs.V3_TAB_ITEM));

	    public static final RegistryObject<Item> DARK_RIDERMAN_BELT = ITEMS.register("dark_riderman_belt",
		           () -> new RiderDriverItem(ArmorMaterials.DIAMOND,"dark_riderman",RIDERMAN_BELT_CORE ,V3HELMET,V3CHESTPLATE,V3LEGGINGS , new Item.Properties())
		           .Override_belt_text("dark_riderman_belt").AddToTabList(RiderTabs.V3_TAB_ITEM));

	    //X
	    
	    public static final RegistryObject<Item> X_LOGO = ITEMS.register("x_logo",
	    		() -> new BaseItem(new Item.Properties()).AddToTabList(RiderTabs.X_TAB_ITEM));

		public static final RegistryObject<Item> RIDOL_CORE = ITEMS.register("ridol_core",
	            () -> new RiderFormChangeItem(new Item.Properties(),0,"","x","ridol_belt",
	            		new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 1,true,false),new MobEffectInstance(MobEffects.REGENERATION,200, 0,true,false)
	            		,new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 2,true,false),new MobEffectInstance(MobEffects.JUMP, 40, 2,true,false)).AddToTabList(RiderTabs.X_TAB_ITEM));
	 
	    public static final RegistryObject<Item> XHELMET = ITEMS.register("xhead",
	            () -> new RiderArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.HELMET, new Item.Properties()).AddToTabList(RiderTabs.X_TAB_ITEM));
	    public static final RegistryObject<Item> XCHESTPLATE = ITEMS.register("xtroso",
	            () -> new RiderArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.CHESTPLATE, new Item.Properties()).AddToTabList(RiderTabs.X_TAB_ITEM));
	    public static final RegistryObject<Item> XLEGGINGS = ITEMS.register("xlegs",
	            () -> new RiderArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.LEGGINGS, new Item.Properties()).AddToTabList(RiderTabs.X_TAB_ITEM));

	    public static final RegistryObject<Item> RIDOL = ITEMS.register("ridol",
		           () -> new RiderDriverItem(ArmorMaterials.DIAMOND,"x",RIDOL_CORE ,XHELMET,XCHESTPLATE,XLEGGINGS , new Item.Properties()).AddToTabList(RiderTabs.X_TAB_ITEM));

	    public static final RegistryObject<Item> DARK_RIDOL = ITEMS.register("dark_ridol",
		           () -> new RiderDriverItem(ArmorMaterials.DIAMOND,"dark_x",RIDOL_CORE ,XHELMET,XCHESTPLATE,XLEGGINGS , new Item.Properties())
		           .Override_belt_text("dark_ridol_belt").AddToTabList(RiderTabs.X_TAB_ITEM));

	   // public static ToolMaterial ridol_stick = EnumHelper.addToolMaterial("ridol_stick", 10, 6000, 12.0F, 3.0F, 22);

	    public static final RegistryObject<SwordItem> RIDOL_STICK = ITEMS.register("ridol_stick",
	            () -> new BaseSwordItem(Tiers.DIAMOND, 5, 3.5f, new Item.Properties()).AddToTabList(RiderTabs.X_TAB_ITEM));
	    
	    //Amazon
	    
	    public static final RegistryObject<Item> AMAZON_LOGO = ITEMS.register("amazon_logo",
	    		() -> new BaseItem(new Item.Properties()).AddToTabList(RiderTabs.AMAZON_TAB_ITEM));

	    
	    public static final RegistryObject<Item> CONDORER_WHEEL = ITEMS.register("condorer_wheel",
	            () -> new RiderFormChangeItem(new Item.Properties(),0,"","amazon","condorer_belt",
	            		new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 1,true,false),new MobEffectInstance(MobEffects.REGENERATION,200, 1,true,false)
	            		,new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 2,true,false),new MobEffectInstance(MobEffects.JUMP, 40, 2,true,false)).AddToTabList(RiderTabs.AMAZON_TAB_ITEM));
	 
	    public static final RegistryObject<Item> GIGI_ARMLET = ITEMS.register("gigi_armlet",
	    		  () -> new BaseItem(new Item.Properties()).AddToTabList(RiderTabs.AMAZON_TAB_ITEM));
	    
	    public static final RegistryObject<Item> GAGA_ARMLET = ITEMS.register("gaga_armlet",
	    		  () -> new BaseItem(new Item.Properties()).AddToTabList(RiderTabs.AMAZON_TAB_ITEM));

	    public static final RegistryObject<Item> AMAZONHELMET = ITEMS.register("amazonhead",
	            () -> new RiderArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.HELMET, new Item.Properties()).AddToTabList(RiderTabs.AMAZON_TAB_ITEM));
	    public static final RegistryObject<Item> AMAZONCHESTPLATE = ITEMS.register("amazontroso",
	            () -> new RiderArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.CHESTPLATE, new Item.Properties()).AddToTabList(RiderTabs.AMAZON_TAB_ITEM));
	    public static final RegistryObject<Item> AMAZONLEGGINGS = ITEMS.register("amazonlegs",
	            () -> new RiderArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.LEGGINGS, new Item.Properties()).AddToTabList(RiderTabs.AMAZON_TAB_ITEM));

	    public static final RegistryObject<Item> CONDORER = ITEMS.register("condorer",
		           () -> new RiderDriverItem(ArmorMaterials.DIAMOND,"amazon",CONDORER_WHEEL ,AMAZONHELMET,AMAZONCHESTPLATE,AMAZONLEGGINGS , new Item.Properties()).AddToTabList(RiderTabs.AMAZON_TAB_ITEM));

	    public static final RegistryObject<Item> DARK_CONDORER = ITEMS.register("dark_condorer",
		           () -> new RiderDriverItem(ArmorMaterials.DIAMOND,"dark_amazon",CONDORER_WHEEL ,AMAZONHELMET,AMAZONCHESTPLATE,AMAZONLEGGINGS , new Item.Properties())
		           .Override_belt_text("dark_condorer_belt").AddToTabList(RiderTabs.AMAZON_TAB_ITEM));

	    
	    //Stronger
	    public static final RegistryObject<Item> STRONGER_LOGO = ITEMS.register("stronger_logo",
	    		() -> new BaseItem(new Item.Properties()).AddToTabList(RiderTabs.STRONGER_TAB_ITEM));

	    
	    public static final RegistryObject<Item> ELECTRER_CORE = ITEMS.register("electrer_core",
	            () -> new RiderFormChangeItem(new Item.Properties(),0,"","stronger","electrer_belt",
	            		new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 1,true,false),new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 40, 1,true,false)
	            		,new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 2,true,false),new MobEffectInstance(MobEffects.JUMP, 40, 1,true,false)).AddToTabList(RiderTabs.STRONGER_TAB_ITEM));
	 
	    public static final RegistryObject<Item> CHARGE_UP = ITEMS.register("charge_up",
	            () -> new RiderFormChangeItem(new Item.Properties(),0,"_charge_up","stronger","electrer_belt",
	            		new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 3,true,false),new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 40, 1,true,false)
	            		,new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 2,true,false),new MobEffectInstance(MobEffects.JUMP, 40, 1,true,false)).AddToTabList(RiderTabs.STRONGER_TAB_ITEM));

	    public static final RegistryObject<Item> TACKLE_CORE = ITEMS.register("tackle_core",
	            () -> new RiderFormChangeItem(new Item.Properties(),0,"","tackle","tackle_belt",
	            		new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 1,true,false),new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 40, 1,true,false)
	            		,new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 2,true,false),new MobEffectInstance(MobEffects.JUMP, 40, 1,true,false)).AddToTabList(RiderTabs.STRONGER_TAB_ITEM));
	 
	    
	    public static final RegistryObject<Item> STRONGERHELMET = ITEMS.register("strongerhead",
	            () -> new RiderArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.HELMET, new Item.Properties()).AddToTabList(RiderTabs.STRONGER_TAB_ITEM));
	    public static final RegistryObject<Item> STRONGERCHESTPLATE = ITEMS.register("strongertroso",
	            () -> new RiderArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.CHESTPLATE, new Item.Properties()).AddToTabList(RiderTabs.STRONGER_TAB_ITEM));
	    public static final RegistryObject<Item> STRONGERLEGGINGS = ITEMS.register("strongerlegs",
	            () -> new RiderArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.LEGGINGS, new Item.Properties()).AddToTabList(RiderTabs.STRONGER_TAB_ITEM));
	
	    public static final RegistryObject<Item> ELECTRER = ITEMS.register("electrer",
		           () -> new RiderDriverItem(ArmorMaterials.DIAMOND,"stronger",ELECTRER_CORE ,STRONGERHELMET,STRONGERCHESTPLATE,STRONGERLEGGINGS , new Item.Properties()).AddToTabList(RiderTabs.STRONGER_TAB_ITEM));
	   
	    public static final RegistryObject<Item> DARK_ELECTRER = ITEMS.register("dark_electrer",
		           () -> new RiderDriverItem(ArmorMaterials.DIAMOND,"dark_stronger",ELECTRER_CORE ,STRONGERHELMET,STRONGERCHESTPLATE,STRONGERLEGGINGS , new Item.Properties())
		           .Override_belt_text("dark_electrer_belt").AddToTabList(RiderTabs.STRONGER_TAB_ITEM));
	   
	    
	    public static final RegistryObject<Item> TACKLE_BELT = ITEMS.register("tackle_belt",
		           () -> new RiderDriverItem(ArmorMaterials.DIAMOND,"tackle",TACKLE_CORE ,STRONGERHELMET,STRONGERCHESTPLATE,STRONGERLEGGINGS , new Item.Properties()).AddToTabList(RiderTabs.STRONGER_TAB_ITEM));

	    //Skyrider    
	    public static final RegistryObject<Item> SKYRIDER_LOGO = ITEMS.register("skyrider_logo",
	    		() -> new BaseItem(new Item.Properties()).AddToTabList(RiderTabs.SKYRIDER_TAB_ITEM));

	    public static final RegistryObject<Item> TORNADO_CORE = ITEMS.register("tornado_core",
	            () -> new RiderFormChangeItem(new Item.Properties(),0,"","skyrider","tornado_belt",
	            		new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 1,true,false),new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 1,true,false),
	            		new MobEffectInstance(MobEffects.JUMP, 40, 5,true,false),
						new MobEffectInstance(Effect_core.FLYING.get(), 40, 4,true,false)).AddToTabList(RiderTabs.SKYRIDER_TAB_ITEM));
	 
	    
	    public static final RegistryObject<Item> SKYRIDERHELMET = ITEMS.register("skyriderhead",
	            () -> new RiderArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.HELMET, new Item.Properties()).AddToTabList(RiderTabs.SKYRIDER_TAB_ITEM));
	    public static final RegistryObject<Item> SKYRIDERCHESTPLATE = ITEMS.register("skyridertroso",
	            () -> new RiderArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.CHESTPLATE, new Item.Properties()).AddToTabList(RiderTabs.SKYRIDER_TAB_ITEM));
	    public static final RegistryObject<Item> SKYRIDERLEGGINGS = ITEMS.register("skyriderlegs",
	            () -> new RiderArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.LEGGINGS, new Item.Properties()).AddToTabList(RiderTabs.SKYRIDER_TAB_ITEM));

	    public static final RegistryObject<Item> TORNADO = ITEMS.register("tornado",
		           () -> new RiderDriverItem(ArmorMaterials.DIAMOND,"skyrider",TORNADO_CORE ,SKYRIDERHELMET,SKYRIDERCHESTPLATE,SKYRIDERLEGGINGS , new Item.Properties()).AddToTabList(RiderTabs.SKYRIDER_TAB_ITEM));

	    //Super 1
	    public static final RegistryObject<Item> SUPER_1_LOGO = ITEMS.register("super_1_logo",
	    		() -> new BaseItem(new Item.Properties()).AddToTabList(RiderTabs.SUPER1_TAB_ITEM));

	    
	    public static final RegistryObject<Item> CYCLODE_CORE = ITEMS.register("cyclode_core",
	            () -> new RiderFormChangeItem(new Item.Properties(),0,"","super_1","cyclode_belt",
	            		new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 1,true,false),new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 40, 1,true,false)
	            		,new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 2,true,false),new MobEffectInstance(MobEffects.JUMP, 40, 1,true,false)).AddToTabList(RiderTabs.SUPER1_TAB_ITEM));

	    public static final RegistryObject<Item> SUPER1HELMET = ITEMS.register("super_1head",
	            () -> new RiderArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.HELMET, new Item.Properties()).AddToTabList(RiderTabs.SUPER1_TAB_ITEM));
	    public static final RegistryObject<Item> SUPER1CHESTPLATE = ITEMS.register("super_1troso",
	            () -> new RiderArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.CHESTPLATE, new Item.Properties()).AddToTabList(RiderTabs.SUPER1_TAB_ITEM));
	    public static final RegistryObject<Item> SUPER1LEGGINGS = ITEMS.register("super_1legs",
	            () -> new RiderArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.LEGGINGS, new Item.Properties()).AddToTabList(RiderTabs.SUPER1_TAB_ITEM));
	
	    public static final RegistryObject<Item> CYCLODE = ITEMS.register("cyclode",
		           () -> new RiderDriverItem(ArmorMaterials.DIAMOND,"super_1",CYCLODE_CORE ,SUPER1HELMET,SUPER1CHESTPLATE,SUPER1LEGGINGS , new Item.Properties()).AddToTabList(RiderTabs.SUPER1_TAB_ITEM));

	    //ZX
	    public static final RegistryObject<Item> ZX_LOGO = ITEMS.register("zx_logo",
	    		() -> new BaseItem(new Item.Properties()).AddToTabList(RiderTabs.ZX_TAB_ITEM));

	    
	    public static final RegistryObject<Item> ZX_BELT_CORE = ITEMS.register("zx_belt_core",
	            () -> new RiderFormChangeItem(new Item.Properties(),0,"","zx","zx_belt_belt",
	            		new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 1,true,false),new MobEffectInstance(MobEffects.REGENERATION,200, 0,true,false)
	            		,new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 2,true,false),new MobEffectInstance(MobEffects.JUMP, 40, 1,true,false)).AddToTabList(RiderTabs.ZX_TAB_ITEM));
	 
	    public static final RegistryObject<Item> ZXHELMET = ITEMS.register("zxhead",
	            () -> new RiderArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.HELMET, new Item.Properties()).AddToTabList(RiderTabs.ZX_TAB_ITEM));
	    public static final RegistryObject<Item> ZXCHESTPLATE = ITEMS.register("zxtroso",
	            () -> new RiderArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.CHESTPLATE, new Item.Properties()).AddToTabList(RiderTabs.ZX_TAB_ITEM));
	    public static final RegistryObject<Item> ZXLEGGINGS = ITEMS.register("zxlegs",
	            () -> new RiderArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.LEGGINGS, new Item.Properties()).AddToTabList(RiderTabs.ZX_TAB_ITEM));


	    public static final RegistryObject<Item> ZX_BELT = ITEMS.register("zx_belt",
		           () -> new RiderDriverItem(ArmorMaterials.DIAMOND,"zx",ZX_BELT_CORE ,ZXHELMET,ZXCHESTPLATE,ZXLEGGINGS , new Item.Properties()).AddToTabList(RiderTabs.ZX_TAB_ITEM));

	    public static final RegistryObject<Item> SUSANOO_BELT = ITEMS.register("susanoo_belt",
		           () -> new RiderDriverItem(ArmorMaterials.DIAMOND,"susanoo_zx",ZX_BELT_CORE ,ZXHELMET,ZXCHESTPLATE,ZXLEGGINGS , new Item.Properties()).AddToTabList(RiderTabs.ZX_TAB_ITEM));

	    public static final RegistryObject<Item> TSUKUYOMI_BELT = ITEMS.register("tsukuyomi_belt",
		           () -> new RiderDriverItem(ArmorMaterials.DIAMOND,"tsukuyomi_zx",ZX_BELT_CORE ,ZXHELMET,ZXCHESTPLATE,ZXLEGGINGS , new Item.Properties()).AddToTabList(RiderTabs.ZX_TAB_ITEM));

	    public static final RegistryObject<Item> AMATERASU_BELT = ITEMS.register("amaterasu_belt",
		           () -> new RiderDriverItem(ArmorMaterials.DIAMOND,"amaterasu_zx",ZX_BELT_CORE ,ZXHELMET,ZXCHESTPLATE,ZXLEGGINGS , new Item.Properties()).AddToTabList(RiderTabs.ZX_TAB_ITEM));

	    //Black
	   
	    
	    public static final RegistryObject<Item> BLACK_LOGO = ITEMS.register("black_logo",
	    		() -> new BaseItem(new Item.Properties()).AddToTabList(RiderTabs.BLACK_TAB_ITEM));

	    
	    public static final RegistryObject<Item> RED_KING_STONE = ITEMS.register("red_king_stone",
	            () -> new RiderFormChangeItem(new Item.Properties(),0,"","black","vital_charger_belt",
	            		new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 1,true,false),new MobEffectInstance(MobEffects.DIG_SPEED,40, 0,true,false)
	            		,new MobEffectInstance(MobEffects.JUMP, 40, 1,true,false),new MobEffectInstance(Effect_core.PUNCH.get(), 40, 1,true,false)).AddToTabList(RiderTabs.BLACK_TAB_ITEM));
	    
	    public static final RegistryObject<Item> BATTA_MAN_KING_STONE = ITEMS.register("batta_man_king_stone",
	            () -> new RiderFormChangeItem(new Item.Properties(),0,"_batta_man","black","vital_charger_belt",
	            		new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 1,true,false),new MobEffectInstance(MobEffects.DIG_SPEED,40, 0,true,false)
	            		,new MobEffectInstance(MobEffects.JUMP, 40, 1,true,false)).AddToTabList(RiderTabs.BLACK_TAB_ITEM));
	    
	    
	    public static final RegistryObject<Item> GREEN_KING_STONE = ITEMS.register("green_king_stone",
	            () -> new RiderFormChangeItem(new Item.Properties(),0,"","shadow_moon","shadow_charger_belt",
	            		new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 1,true,false),new MobEffectInstance(MobEffects.DIG_SPEED,40, 0,true,false)
	            		,new MobEffectInstance(MobEffects.JUMP, 40, 1,true,false))
	            .AddToTabList(RiderTabs.BLACK_TAB_ITEM));
	    	
	    public static final RegistryObject<Item> CREATION_KING_STONE = ITEMS.register("creation_king_stone",
	            () -> new RiderFormChangeItem(new Item.Properties(),0,"_red","shadow_moon","shadow_charger_belt",
	            		new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 1,true,false),new MobEffectInstance(MobEffects.DIG_SPEED,40, 0,true,false)
	            		,new MobEffectInstance(MobEffects.JUMP, 40, 1,true,false))
	            .AddToTabList(RiderTabs.BLACK_TAB_ITEM));
	    	
	    
	    public static final RegistryObject<Item> BLACKHELMET = ITEMS.register("blackhead",
	            () -> new RiderArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.HELMET, new Item.Properties()).AddToTabList(RiderTabs.BLACK_TAB_ITEM));
	    public static final RegistryObject<Item> BLACKCHESTPLATE = ITEMS.register("blacktorso",
	            () -> new RiderArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.CHESTPLATE, new Item.Properties()).AddToTabList(RiderTabs.BLACK_TAB_ITEM));
	    public static final RegistryObject<Item> BLACKLEGGINGS = ITEMS.register("blacklegs",
	            () -> new RiderArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.LEGGINGS, new Item.Properties()).AddToTabList(RiderTabs.BLACK_TAB_ITEM));
	    
	    public static final RegistryObject<Item> VITAL_CHARGER = ITEMS.register("vital_charger",
		           () -> new RiderDriverItem(ArmorMaterials.DIAMOND,"black",RED_KING_STONE ,BLACKHELMET,BLACKCHESTPLATE,BLACKLEGGINGS , new Item.Properties()).AddToTabList(RiderTabs.BLACK_TAB_ITEM));

	    public static final RegistryObject<Item> SHADOW_CHARGER = ITEMS.register("shadow_charger",
		           () -> new RiderDriverItem(ArmorMaterials.DIAMOND,"shadow_moon",GREEN_KING_STONE ,BLACKHELMET,BLACKCHESTPLATE,BLACKLEGGINGS , new Item.Properties()).AddToTabList(RiderTabs.BLACK_TAB_ITEM));

	    public static final RegistryObject<SwordItem> SATANSABER = ITEMS.register("satansaber",
	            () -> new BaseSwordItem(Tiers.DIAMOND, 5, 3.5f, new Item.Properties()).AddToTabList(RiderTabs.BLACK_TAB_ITEM));

	    //Black RX
	    public static final RegistryObject<Item> BLACK_RX_LOGO = ITEMS.register("black_rx_logo",
	    		() -> new BaseItem(new Item.Properties()).AddToTabList(RiderTabs.RX_TAB_ITEM));

	    public static final RegistryObject<Item> SPLIT_KING_STONE = ITEMS.register("split_king_stone",
	    		() -> new BaseItem(new Item.Properties()).AddToTabList(RiderTabs.RX_TAB_ITEM));
	    
	    public static final RegistryObject<Item> RX_CORE = ITEMS.register("rx_core",
	            () -> new RiderFormChangeItem(new Item.Properties(),0,"","black_rx","sun_riser_belt",
	            		new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 1,true,false),new MobEffectInstance(MobEffects.DIG_SPEED,40, 0,true,false)
	            		,new MobEffectInstance(MobEffects.JUMP, 40, 1,true,false),new MobEffectInstance(Effect_core.PUNCH.get(), 40, 1,true,false)).AddToTabList(RiderTabs.RX_TAB_ITEM));
	    
	    public static final RegistryObject<Item> BIO_CORE = ITEMS.register("bio_core",
	            () -> new RiderFormChangeItem(new Item.Properties(),0,"_bio","black_rx","sun_riser_belt_bio",
	            		new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 1,true,false),new MobEffectInstance(MobEffects.WATER_BREATHING,40, 0,true,false)
	            		,new MobEffectInstance(MobEffects.DOLPHINS_GRACE, 40, 1,true,false),new MobEffectInstance(Effect_core.PUNCH.get(), 40, 1,true,false)).AddToTabList(RiderTabs.RX_TAB_ITEM));

	    public static final RegistryObject<Item> ROBO_CORE = ITEMS.register("robo_core",
	            () -> new RiderFormChangeItem(new Item.Properties(),0,"_robo","black_rx","sun_riser_belt_robo",
	            		new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 1,true,false),new MobEffectInstance(MobEffects.DIG_SPEED,40, 0,true,false)
	            		,new MobEffectInstance(MobEffects.JUMP, 40, 1,true,false),new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 1,true,false)).AddToTabList(RiderTabs.RX_TAB_ITEM));
	    
	    public static final RegistryObject<Item> MOON_RX_CORE = ITEMS.register("moon_rx_core",
	            () -> new RiderFormChangeItem(new Item.Properties(),0,"","white_rx","moon_riser",
	            		new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 1,true,false),new MobEffectInstance(MobEffects.DIG_SPEED,40, 0,true,false)
	            		,new MobEffectInstance(MobEffects.JUMP, 40, 1,true,false),new MobEffectInstance(Effect_core.PUNCH.get(), 40, 1,true,false)).AddToTabList(RiderTabs.RX_TAB_ITEM));
	 
	    
	    public static final RegistryObject<Item> RXHELMET = ITEMS.register("rxhead",
	            () -> new RiderArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.HELMET, new Item.Properties()).AddToTabList(RiderTabs.RX_TAB_ITEM));
	    public static final RegistryObject<Item> RXCHESTPLATE = ITEMS.register("rxtroso",
	            () -> new RiderArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.CHESTPLATE, new Item.Properties()).AddToTabList(RiderTabs.RX_TAB_ITEM));
	    public static final RegistryObject<Item> RXLEGGINGS = ITEMS.register("rxlegs",
	            () -> new RiderArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.LEGGINGS, new Item.Properties()).AddToTabList(RiderTabs.RX_TAB_ITEM));

	    public static final RegistryObject<Item> SUN_RISER = ITEMS.register("sun_riser",
		           () -> new RiderDriverItem(ArmorMaterials.DIAMOND,"black_rx",RX_CORE ,RXHELMET,RXCHESTPLATE,RXLEGGINGS , new Item.Properties()).AddToTabList(RiderTabs.RX_TAB_ITEM));
    
	    public static final RegistryObject<Item> MOON_RISER = ITEMS.register("moon_riser",
		           () -> new RiderDriverItem(ArmorMaterials.DIAMOND,"white_rx",MOON_RX_CORE ,RXHELMET,RXCHESTPLATE,RXLEGGINGS , new Item.Properties()).AddToTabList(RiderTabs.RX_TAB_ITEM));
	    
	    
	    public static final RegistryObject<SwordItem> REVOLCANE = ITEMS.register("revolcane",
	            () -> new BaseSwordItem(Tiers.DIAMOND, 5, 3.5f, new Item.Properties()).AddToTabList(RiderTabs.RX_TAB_ITEM));
	    
		public static final RegistryObject<BaseBlasterItem> VORTECHSHOOTER = ITEMS.register("vortech_shooter",
		        () -> new BaseBlasterItem(Tiers.DIAMOND, 4, 3.5f, new Item.Properties()).AddToTabList(RiderTabs.RX_TAB_ITEM));
		 
		public static final RegistryObject<SwordItem> BIOBLADE = ITEMS.register("bio_blade",
		        () -> new BaseSwordItem(Tiers.DIAMOND, 5, 3.5f, new Item.Properties()).AddToTabList(RiderTabs.RX_TAB_ITEM));
	    
		public static final RegistryObject<SwordItem> SHADOWSABER = ITEMS.register("shadow_saber",
		        () -> new BaseSwordItem(Tiers.DIAMOND, 5, 3.5f, new Item.Properties()).AddToTabList(RiderTabs.RX_TAB_ITEM));
	
	    // Shin
	   
	    public static final RegistryObject<Item> SHIN_LOGO = ITEMS.register("shin_logo",
	    		() -> new BaseItem(new Item.Properties()).AddToTabList(RiderTabs.SHIN_TAB_ITEM));

	    public static final RegistryObject<Item> SHIN_STONE = ITEMS.register("shin_stone",
	            () -> new RiderFormChangeItem(new Item.Properties(),0,"","shin","blank",
	            		new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 1,true,false),new MobEffectInstance(MobEffects.DIG_SPEED,40, 0,true,false)
	            		,new MobEffectInstance(MobEffects.JUMP, 40, 1,true,false),new MobEffectInstance(Effect_core.PUNCH.get(), 40, 1,true,false)).AddToTabList(RiderTabs.SHIN_TAB_ITEM).KeepItem());

	    public static final RegistryObject<Item> SHINHELMET = ITEMS.register("shinhead",
	            () -> new RiderArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.HELMET, new Item.Properties()).AddToTabList(RiderTabs.SHIN_TAB_ITEM));
	    public static final RegistryObject<Item> SHINCHESTPLATE = ITEMS.register("shintroso",
	            () -> new RiderArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.CHESTPLATE, new Item.Properties()).AddToTabList(RiderTabs.SHIN_TAB_ITEM));
	    public static final RegistryObject<Item> SHINLEGGINGS = ITEMS.register("shinlegs",
	            () -> new RiderArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.LEGGINGS, new Item.Properties()).AddToTabList(RiderTabs.SHIN_TAB_ITEM));
	    
	    public static final RegistryObject<Item> GRASSHOPPER_DNA = ITEMS.register("grasshopper_dna",
		           () -> new RiderDriverItem(ArmorMaterials.DIAMOND,"shin",SHIN_STONE ,SHINHELMET,SHINCHESTPLATE,SHINLEGGINGS , new Item.Properties()).AddToTabList(RiderTabs.SHIN_TAB_ITEM));

	    // J
	    public static final RegistryObject<Item> J_LOGO = ITEMS.register("j_logo",
	    		() -> new BaseItem(new Item.Properties()).AddToTabList(RiderTabs.J_TAB_ITEM));

	    public static final RegistryObject<Item> J_STONE = ITEMS.register("j_stone",
	            () -> new RiderFormChangeItem(new Item.Properties(),0,"","j","blank",
	            		new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 1,true,false),new MobEffectInstance(MobEffects.DIG_SPEED,40, 0,true,false)
	            		,new MobEffectInstance(MobEffects.JUMP, 40, 1,true,false),new MobEffectInstance(Effect_core.PUNCH.get(), 40, 1,true,false)).AddToTabList(RiderTabs.J_TAB_ITEM).KeepItem());

	    public static final RegistryObject<Item> JHELMET = ITEMS.register("jhead",
	            () -> new RiderArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.HELMET, new Item.Properties()).AddToTabList(RiderTabs.J_TAB_ITEM));
	    public static final RegistryObject<Item> JCHESTPLATE = ITEMS.register("jtroso",
	            () -> new RiderArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.CHESTPLATE, new Item.Properties()).AddToTabList(RiderTabs.J_TAB_ITEM));
	    public static final RegistryObject<Item> JLEGGINGS = ITEMS.register("jlegs",
	            () -> new RiderArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.LEGGINGS, new Item.Properties()).AddToTabList(RiderTabs.J_TAB_ITEM));

	    public static final RegistryObject<Item> J_SPIRIT = ITEMS.register("j_spirit",
		           () -> new RiderDriverItem(ArmorMaterials.DIAMOND,"j",J_STONE ,JHELMET,JCHESTPLATE,JLEGGINGS , new Item.Properties()).AddToTabList(RiderTabs.J_TAB_ITEM));

	    // ZO
	    public static final RegistryObject<Item> ZO_LOGO = ITEMS.register("zo_logo",
	    		() -> new BaseItem(new Item.Properties()).AddToTabList(RiderTabs.ZO_TAB_ITEM));

	    public static final RegistryObject<Item> ZO_STONE = ITEMS.register("zo_stone",
	            () -> new RiderFormChangeItem(new Item.Properties(),0,"","zo","blank",
	            		new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 1,true,false),new MobEffectInstance(MobEffects.DIG_SPEED,40, 0,true,false)
	            		,new MobEffectInstance(MobEffects.JUMP, 40, 1,true,false),new MobEffectInstance(Effect_core.PUNCH.get(), 40, 1,true,false)).AddToTabList(RiderTabs.ZO_TAB_ITEM).KeepItem());

	    public static final RegistryObject<Item> ZOHELMET = ITEMS.register("zohead",
	            () -> new RiderArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.HELMET, new Item.Properties()).AddToTabList(RiderTabs.ZO_TAB_ITEM));
	    public static final RegistryObject<Item> ZOCHESTPLATE = ITEMS.register("zotroso",
	            () -> new RiderArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.CHESTPLATE, new Item.Properties()).AddToTabList(RiderTabs.ZO_TAB_ITEM));
	    public static final RegistryObject<Item> ZOLEGGINGS = ITEMS.register("zolegs",
	            () -> new RiderArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.LEGGINGS, new Item.Properties()).AddToTabList(RiderTabs.ZO_TAB_ITEM));
	    
	    public static final RegistryObject<Item> ZO_CORE = ITEMS.register("zo_core",
		           () -> new RiderDriverItem(ArmorMaterials.DIAMOND,"zo",ZO_STONE ,ZOHELMET,ZOCHESTPLATE,ZOLEGGINGS , new Item.Properties()).AddToTabList(RiderTabs.ZO_TAB_ITEM));

	    
	    
	    /**
	    public static final RegistryObject<Item> HELMET = ITEMS.register("head",
	            () -> new RiderArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.HELMET, new Item.Properties()).AddToTabList(RiderTabs._TAB_ITEM));
	    public static final RegistryObject<Item> CHESTPLATE = ITEMS.register("troso",
	            () -> new RiderArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.CHESTPLATE, new Item.Properties()).AddToTabList(RiderTabs._TAB_ITEM));
	    public static final RegistryObject<Item> LEGGINGS = ITEMS.register("legs",
	            () -> new RiderArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.LEGGINGS, new Item.Properties()).AddToTabList(RiderTabs._TAB_ITEM));
	    **/
	    
	    
	    
	    public static void register(IEventBus eventBus) {
	        ITEMS.register(eventBus);
	    }
	    
	}