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

public class Ichigo_Rider_Items {
	
	  public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, KamenRiderCraftCore.MODID);
	    	     
	    public static final RegistryObject<Item> ICHIGOHELMET = ITEMS.register("ichigohead",
	            () -> new RiderArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.HELMET, new Item.Properties()).AddToTabList(RiderTabs.ICHIGO_TAB_ITEM));
	    public static final RegistryObject<Item> ICHIGOCHESTPLATE = ITEMS.register("ichigotroso",
	            () -> new RiderArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.CHESTPLATE, new Item.Properties()).AddToTabList(RiderTabs.ICHIGO_TAB_ITEM));
	    public static final RegistryObject<Item> ICHIGOLEGGINGS = ITEMS.register("ichigolegs",
	            () -> new RiderArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.LEGGINGS, new Item.Properties()).AddToTabList(RiderTabs.ICHIGO_TAB_ITEM));
	    
	    

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
	            		,new MobEffectInstance(MobEffects.JUMP, 40, 2,true,false)).AddToTabList(RiderTabs.ICHIGO_TAB_ITEM).addAlternative(ORIGINAL_TYPHOON_CORE_NIGO.get()));

	    
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
	    
	    
	    //V3
	    
	    public static final RegistryObject<Item> V3HELMET = ITEMS.register("v3head",
	            () -> new RiderArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.HELMET, new Item.Properties()).AddToTabList(RiderTabs.V3_TAB_ITEM));
	    public static final RegistryObject<Item> V3CHESTPLATE = ITEMS.register("v3troso",
	            () -> new RiderArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.CHESTPLATE, new Item.Properties()).AddToTabList(RiderTabs.V3_TAB_ITEM));
	    public static final RegistryObject<Item> V3LEGGINGS = ITEMS.register("v3legs",
	            () -> new RiderArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.LEGGINGS, new Item.Properties()).AddToTabList(RiderTabs.V3_TAB_ITEM));
	    
	    

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

	    
	    public static final RegistryObject<Item> DOUBLE_TYPHOON = ITEMS.register("double_typhoon",
		           () -> new RiderDriverItem(ArmorMaterials.DIAMOND,"v3",DOUBLE_TYPHOON_CORE ,V3HELMET,V3CHESTPLATE,V3LEGGINGS , new Item.Properties()).AddToTabList(RiderTabs.V3_TAB_ITEM));


	    public static final RegistryObject<Item> RIDERMAN_BELT = ITEMS.register("riderman_belt",
		           () -> new RiderDriverItem(ArmorMaterials.DIAMOND,"riderman",RIDERMAN_BELT_CORE ,V3HELMET,V3CHESTPLATE,V3LEGGINGS , new Item.Properties()).AddToTabList(RiderTabs.V3_TAB_ITEM));


	    //X
	    
	    public static final RegistryObject<SwordItem> RIDOL_STICK = ITEMS.register("ridol_stick",
	            () -> new BaseSwordItem(Tiers.DIAMOND, 5, 3.5f, new Item.Properties()).AddToTabList(RiderTabs.X_TAB_ITEM));
	    
	    public static final RegistryObject<Item> XHELMET = ITEMS.register("xhead",
	            () -> new RiderArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.HELMET, new Item.Properties()).AddToTabList(RiderTabs.X_TAB_ITEM));
	    public static final RegistryObject<Item> XCHESTPLATE = ITEMS.register("xtroso",
	            () -> new RiderArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.CHESTPLATE, new Item.Properties()).AddToTabList(RiderTabs.X_TAB_ITEM));
	    public static final RegistryObject<Item> XLEGGINGS = ITEMS.register("xlegs",
	            () -> new RiderArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.LEGGINGS, new Item.Properties()).AddToTabList(RiderTabs.X_TAB_ITEM));


	    public static final RegistryObject<Item> RIDOL_CORE = ITEMS.register("ridol_core",
	            () -> new RiderFormChangeItem(new Item.Properties(),0,"","x","ridol_belt",
	            		new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 1,true,false),new MobEffectInstance(MobEffects.REGENERATION,200, 0,true,false)
	            		,new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 2,true,false),new MobEffectInstance(MobEffects.JUMP, 40, 2,true,false)).AddToTabList(RiderTabs.X_TAB_ITEM));
	 
	    public static final RegistryObject<Item> RIDOL = ITEMS.register("ridol",
		           () -> new RiderDriverItem(ArmorMaterials.DIAMOND,"x",RIDOL_CORE ,XHELMET,XCHESTPLATE,XLEGGINGS , new Item.Properties()).AddToTabList(RiderTabs.X_TAB_ITEM));

		//Amazon
	    
	    public static final RegistryObject<Item> AMAZONHELMET = ITEMS.register("amazonhead",
	            () -> new RiderArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.HELMET, new Item.Properties()).AddToTabList(RiderTabs.AMAZON_TAB_ITEM));
	    public static final RegistryObject<Item> AMAZONCHESTPLATE = ITEMS.register("amazontroso",
	            () -> new RiderArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.CHESTPLATE, new Item.Properties()).AddToTabList(RiderTabs.AMAZON_TAB_ITEM));
	    public static final RegistryObject<Item> AMAZONLEGGINGS = ITEMS.register("amazonlegs",
	            () -> new RiderArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.LEGGINGS, new Item.Properties()).AddToTabList(RiderTabs.AMAZON_TAB_ITEM));

	    public static final RegistryObject<Item> CONDORER_WHEEL = ITEMS.register("condorer_wheel",
	            () -> new RiderFormChangeItem(new Item.Properties(),0,"","amazon","condorer_belt",
	            		new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 1,true,false),new MobEffectInstance(MobEffects.REGENERATION,200, 1,true,false)
	            		,new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 2,true,false),new MobEffectInstance(MobEffects.JUMP, 40, 2,true,false)).AddToTabList(RiderTabs.AMAZON_TAB_ITEM));
	 
	    public static final RegistryObject<Item> CONDORER = ITEMS.register("condorer",
		           () -> new RiderDriverItem(ArmorMaterials.DIAMOND,"amazon",CONDORER_WHEEL ,AMAZONHELMET,AMAZONCHESTPLATE,AMAZONLEGGINGS , new Item.Properties()).AddToTabList(RiderTabs.AMAZON_TAB_ITEM));

	    public static final RegistryObject<Item> GIGI_ARMLET = ITEMS.register("gigi_armlet",
	    		  () -> new BaseItem(new Item.Properties()).AddToTabList(RiderTabs.AMAZON_TAB_ITEM));
	    
	    public static final RegistryObject<Item> GAGA_ARMLET = ITEMS.register("gaga_armlet",
	    		  () -> new BaseItem(new Item.Properties()).AddToTabList(RiderTabs.AMAZON_TAB_ITEM));
	    
	    
	    //Stronger
	    public static final RegistryObject<Item> STRONGERHELMET = ITEMS.register("strongerhead",
	            () -> new RiderArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.HELMET, new Item.Properties()).AddToTabList(RiderTabs.STRONGER_TAB_ITEM));
	    public static final RegistryObject<Item> STRONGERCHESTPLATE = ITEMS.register("strongertroso",
	            () -> new RiderArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.CHESTPLATE, new Item.Properties()).AddToTabList(RiderTabs.STRONGER_TAB_ITEM));
	    public static final RegistryObject<Item> STRONGERLEGGINGS = ITEMS.register("strongerlegs",
	            () -> new RiderArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.LEGGINGS, new Item.Properties()).AddToTabList(RiderTabs.STRONGER_TAB_ITEM));
	
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
	 
	    
	    public static final RegistryObject<Item> ELECTRER = ITEMS.register("electrer",
		           () -> new RiderDriverItem(ArmorMaterials.DIAMOND,"stronger",ELECTRER_CORE ,STRONGERHELMET,STRONGERCHESTPLATE,STRONGERLEGGINGS , new Item.Properties()).AddToTabList(RiderTabs.STRONGER_TAB_ITEM));
	   
	    public static final RegistryObject<Item> TACKLE_BELT = ITEMS.register("tackle_belt",
		           () -> new RiderDriverItem(ArmorMaterials.DIAMOND,"tackle",TACKLE_CORE ,STRONGERHELMET,STRONGERCHESTPLATE,STRONGERLEGGINGS , new Item.Properties()).AddToTabList(RiderTabs.STRONGER_TAB_ITEM));

	    
	    //Skyrider    
	    public static final RegistryObject<Item> SKYRIDERHELMET = ITEMS.register("skyriderhead",
	            () -> new RiderArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.HELMET, new Item.Properties()).AddToTabList(RiderTabs.SKYRIDER_TAB_ITEM));
	    public static final RegistryObject<Item> SKYRIDERCHESTPLATE = ITEMS.register("skyridertroso",
	            () -> new RiderArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.CHESTPLATE, new Item.Properties()).AddToTabList(RiderTabs.SKYRIDER_TAB_ITEM));
	    public static final RegistryObject<Item> SKYRIDERLEGGINGS = ITEMS.register("skyriderlegs",
	            () -> new RiderArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.LEGGINGS, new Item.Properties()).AddToTabList(RiderTabs.SKYRIDER_TAB_ITEM));

	    public static final RegistryObject<Item> TORNADO_CORE = ITEMS.register("tornado_core",
	            () -> new RiderFormChangeItem(new Item.Properties(),0,"","skyrider","tornado_belt",
	            		new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 1,true,false),new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 1,true,false),
	            		new MobEffectInstance(MobEffects.JUMP, 40, 5,true,false)).AddToTabList(RiderTabs.SKYRIDER_TAB_ITEM));
	 
	    
	    public static final RegistryObject<Item> TORNADO = ITEMS.register("tornado",
		           () -> new RiderDriverItem(ArmorMaterials.DIAMOND,"skyrider",TORNADO_CORE ,SKYRIDERHELMET,SKYRIDERCHESTPLATE,SKYRIDERLEGGINGS , new Item.Properties()).AddToTabList(RiderTabs.SKYRIDER_TAB_ITEM));

	    //Super 1
	    public static final RegistryObject<Item> SUPER1HELMET = ITEMS.register("super_1head",
	            () -> new RiderArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.HELMET, new Item.Properties()).AddToTabList(RiderTabs.SUPER1_TAB_ITEM));
	    public static final RegistryObject<Item> SUPER1CHESTPLATE = ITEMS.register("super_1troso",
	            () -> new RiderArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.CHESTPLATE, new Item.Properties()).AddToTabList(RiderTabs.SUPER1_TAB_ITEM));
	    public static final RegistryObject<Item> SUPER1LEGGINGS = ITEMS.register("super_1legs",
	            () -> new RiderArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.LEGGINGS, new Item.Properties()).AddToTabList(RiderTabs.SUPER1_TAB_ITEM));
	
	    public static final RegistryObject<Item> CYCLODE_CORE = ITEMS.register("cyclode_core",
	            () -> new RiderFormChangeItem(new Item.Properties(),0,"","super_1","cyclode_belt",
	            		new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 1,true,false),new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 40, 1,true,false)
	            		,new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 2,true,false),new MobEffectInstance(MobEffects.JUMP, 40, 1,true,false)).AddToTabList(RiderTabs.SUPER1_TAB_ITEM));

	    public static final RegistryObject<Item> CYCLODE = ITEMS.register("cyclode",
		           () -> new RiderDriverItem(ArmorMaterials.DIAMOND,"super_1",CYCLODE_CORE ,SUPER1HELMET,SUPER1CHESTPLATE,SUPER1LEGGINGS , new Item.Properties()).AddToTabList(RiderTabs.SUPER1_TAB_ITEM));

	    
	    //ZX
	    public static final RegistryObject<Item> ZXHELMET = ITEMS.register("zxhead",
	            () -> new RiderArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.HELMET, new Item.Properties()).AddToTabList(RiderTabs.ZX_TAB_ITEM));
	    public static final RegistryObject<Item> ZXCHESTPLATE = ITEMS.register("zxtroso",
	            () -> new RiderArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.CHESTPLATE, new Item.Properties()).AddToTabList(RiderTabs.ZX_TAB_ITEM));
	    public static final RegistryObject<Item> ZXLEGGINGS = ITEMS.register("zxlegs",
	            () -> new RiderArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.LEGGINGS, new Item.Properties()).AddToTabList(RiderTabs.ZX_TAB_ITEM));


	    public static final RegistryObject<Item> ZX_BELT_CORE = ITEMS.register("zx_belt_core",
	            () -> new RiderFormChangeItem(new Item.Properties(),0,"","zx","zx_belt_belt",
	            		new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 1,true,false),new MobEffectInstance(MobEffects.REGENERATION,200, 0,true,false)
	            		,new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 2,true,false),new MobEffectInstance(MobEffects.JUMP, 40, 1,true,false)).AddToTabList(RiderTabs.ZX_TAB_ITEM));
	 
	    public static final RegistryObject<Item> ZX_BELT = ITEMS.register("zx_belt",
		           () -> new RiderDriverItem(ArmorMaterials.DIAMOND,"zx",ZX_BELT_CORE ,ZXHELMET,ZXCHESTPLATE,ZXLEGGINGS , new Item.Properties()).AddToTabList(RiderTabs.ZX_TAB_ITEM));

	    public static final RegistryObject<Item> SUSANOO_BELT = ITEMS.register("susanoo_belt",
		           () -> new RiderDriverItem(ArmorMaterials.DIAMOND,"susanoo_zx",ZX_BELT_CORE ,ZXHELMET,ZXCHESTPLATE,ZXLEGGINGS , new Item.Properties()).AddToTabList(RiderTabs.ZX_TAB_ITEM));

	    public static final RegistryObject<Item> TSUKUYOMI_BELT = ITEMS.register("tsukuyomi_belt",
		           () -> new RiderDriverItem(ArmorMaterials.DIAMOND,"tsukuyomi_zx",ZX_BELT_CORE ,ZXHELMET,ZXCHESTPLATE,ZXLEGGINGS , new Item.Properties()).AddToTabList(RiderTabs.ZX_TAB_ITEM));

	    public static final RegistryObject<Item> AMATERASU_BELT = ITEMS.register("amaterasu_belt",
		           () -> new RiderDriverItem(ArmorMaterials.DIAMOND,"amaterasu_zx",ZX_BELT_CORE ,ZXHELMET,ZXCHESTPLATE,ZXLEGGINGS , new Item.Properties()).AddToTabList(RiderTabs.ZX_TAB_ITEM));
	    
	    
	    //Black
	    
	    public static final RegistryObject<SwordItem> SATANSABER = ITEMS.register("satansaber",
	            () -> new BaseSwordItem(Tiers.DIAMOND, 5, 3.5f, new Item.Properties()).AddToTabList(RiderTabs.BLACK_TAB_ITEM));
	    
	    public static final RegistryObject<Item> BLACKHELMET = ITEMS.register("blackhead",
	            () -> new RiderArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.HELMET, new Item.Properties()).AddToTabList(RiderTabs.BLACK_TAB_ITEM));
	    public static final RegistryObject<Item> BLACKCHESTPLATE = ITEMS.register("blacktorso",
	            () -> new RiderArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.CHESTPLATE, new Item.Properties()).AddToTabList(RiderTabs.BLACK_TAB_ITEM));
	    public static final RegistryObject<Item> BLACKLEGGINGS = ITEMS.register("blacklegs",
	            () -> new RiderArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.LEGGINGS, new Item.Properties()).AddToTabList(RiderTabs.BLACK_TAB_ITEM));

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
	    	
	    
	    public static final RegistryObject<Item> VITAL_CHARGER = ITEMS.register("vital_charger",
		           () -> new RiderDriverItem(ArmorMaterials.DIAMOND,"black",RED_KING_STONE ,BLACKHELMET,BLACKCHESTPLATE,BLACKLEGGINGS , new Item.Properties()).AddToTabList(RiderTabs.BLACK_TAB_ITEM));

	    public static final RegistryObject<Item> SHADOW_CHARGER = ITEMS.register("shadow_charger",
		           () -> new RiderDriverItem(ArmorMaterials.DIAMOND,"shadow_moon",GREEN_KING_STONE ,BLACKHELMET,BLACKCHESTPLATE,BLACKLEGGINGS , new Item.Properties()).AddToTabList(RiderTabs.BLACK_TAB_ITEM));
 
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