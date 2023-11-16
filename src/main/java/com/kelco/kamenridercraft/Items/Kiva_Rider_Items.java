package com.kelco.kamenridercraft.Items;

import java.util.ArrayList;
import java.util.List;

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

public class Kiva_Rider_Items {

	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, KamenRiderCraftCore.MODID);

	public static final RegistryObject<Item> KIVA_LOGO = ITEMS.register("kiva_logo",
    		() -> new BaseItem(new Item.Properties()).AddToTabList(RiderTabs.KIVA_TAB_ITEM));
 
	public static final RegistryObject<Item> FUESTLE = ITEMS.register("fuestle",
			() -> new BaseItem(new Item.Properties()).AddToTabList(RiderTabs.KIVA_TAB_ITEM));
	
	public static final RegistryObject<Item> FAKE_FUESTLE = ITEMS.register("fuestlefake",
			() -> new BaseItem(new Item.Properties()).AddToTabList(RiderTabs.KIVA_TAB_ITEM));
	
    	  
	   public static List<Item> NEED_ITEM_DOGABAKI= new ArrayList<Item>();
	   
	
	public static final RegistryObject<Item> DOGABAKI = ITEMS.register("dogabaki",
            () -> new RiderFormChangeItem(new Item.Properties(),0,"_dogabaki","kiva","kivat_belt",
            		new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 1,true,false),
            		new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 1,true,false),
            		new MobEffectInstance(MobEffects.DIG_SPEED, 40, 0,true,false),
            		new MobEffectInstance(MobEffects.JUMP, 40, 0,true,false),
            		new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 1,true,false),
            		new MobEffectInstance(MobEffects.WITHER, 40, 0,true,false)).AddNeedItemList(NEED_ITEM_DOGABAKI));
    
    public static final RegistryObject<Item> WAKE_UP_FUESTLE = ITEMS.register("wakeupfuestle",
            () -> new RiderFormChangeItem(new Item.Properties(),0,"","kiva","kivat_belt",
            		new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 0,true,false),
            		new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 0,true,false),
            		new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 0,true,false)).addShiftForm(DOGABAKI.get())
            .AddToTabList(NEED_ITEM_DOGABAKI).AddToTabList(RiderTabs.KIVA_TAB_ITEM));
    
    public static final RegistryObject<Item> GARULU_FUESTLE = ITEMS.register("garulufuestle",
            () -> new RiderFormChangeItem(new Item.Properties(),0,"_garulu","kiva","kivat_belt_g",
            		new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 1,true,false),
            		new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 0,true,false),
            		new MobEffectInstance(MobEffects.JUMP, 40, 1,true,false)).addShiftForm(DOGABAKI.get())
            .AddToTabList(NEED_ITEM_DOGABAKI).AddToTabList(RiderTabs.KIVA_TAB_ITEM));
    
    public static final RegistryObject<Item> BASSHAA_FUESTLE = ITEMS.register("basshaafuestle",
            () -> new RiderFormChangeItem(new Item.Properties(),0,"_basshaa","kiva","kivat_belt_b",
            		new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 0,true,false),
            		new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 0,true,false),
            		new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false)).addShiftForm(DOGABAKI.get())
            .AddToTabList(NEED_ITEM_DOGABAKI).AddToTabList(RiderTabs.KIVA_TAB_ITEM));
    
    public static final RegistryObject<Item> DOGGA_FUESTLE = ITEMS.register("doggafuestle",
            () -> new RiderFormChangeItem(new Item.Properties(),0,"_dogga","kiva","kivat_belt_d",
            		new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 1,true,false),
            		new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 1,true,false),
            		new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 40, 0,true,false)).addShiftForm(DOGABAKI.get())
            .AddToTabList(NEED_ITEM_DOGABAKI).AddToTabList(RiderTabs.KIVA_TAB_ITEM));
    
    public static final RegistryObject<Item> DOGABAKI_EMPEROR = ITEMS.register("dogabaki_emperor",
            () -> new RiderFormChangeItem(new Item.Properties(),0,"_dogabaki_emperor","kiva","kivat_belt_e",
            		new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 4,true,false),
            		new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 3,true,false),
            		new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
            		new MobEffectInstance(MobEffects.JUMP, 40, 1,true,false),
            		new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 4,true,false),
            		new MobEffectInstance(MobEffects.REGENERATION, 40, 0,true,false),
            		new MobEffectInstance(MobEffects.WITHER, 40, 1,true,false)).addNeedItem(WAKE_UP_FUESTLE.get()).addNeedItem(GARULU_FUESTLE.get()).addNeedItem(BASSHAA_FUESTLE.get()).addNeedItem(DOGGA_FUESTLE.get()));
    
    public static final RegistryObject<Item> TATSULOT = ITEMS.register("tatsulot",
            () -> new RiderFormChangeItem(new Item.Properties(),0,"_emperor","kiva","kivat_belt_e",
            		new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 2,true,false),
            		new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
            		new MobEffectInstance(MobEffects.DIG_SPEED, 40, 1,true,false),
            		new MobEffectInstance(MobEffects.JUMP, 40, 1,true,false),
            		new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 2,true,false),
            		new MobEffectInstance(MobEffects.REGENERATION, 40, 1,true,false)).addShiftForm(DOGABAKI_EMPEROR.get()).AddToTabList(RiderTabs.KIVA_TAB_ITEM));
    
    public static final RegistryObject<Item> KIVATTE_FUESTLE = ITEMS.register("kiva_says_fuestle",
            () -> new RiderFormChangeItem(new Item.Properties(),0,"_red_emperor","kiva","kivat_belt_e",
            		new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 2,true,false),
            		new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
            		new MobEffectInstance(MobEffects.DIG_SPEED, 40, 1,true,false),
            		new MobEffectInstance(MobEffects.JUMP, 40, 1,true,false),
            		new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 2,true,false),
            		new MobEffectInstance(MobEffects.REGENERATION, 40, 1,true,false)).AddToTabList(RiderTabs.KIVA_TAB_ITEM));
    
    
    public static final RegistryObject<Item> KNUCKLE_FUESTLE_BURST = ITEMS.register("knucklefuestle_burst",
            () -> new RiderFormChangeItem(new Item.Properties(),0,"_burst","ixa","ixa_belt",
            		new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 1,true,false),
            		new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 40, 0,true,false),
            		new MobEffectInstance(MobEffects.DIG_SPEED, 40, 1,true,false),
            		new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 0,true,false)));
	
    public static final RegistryObject<Item> KNUCKLE_FUESTLE = ITEMS.register("knucklefuestle",
            () -> new RiderFormChangeItem(new Item.Properties(),0,"_save","ixa","ixa_belt",
            		new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 0,true,false),
            		new MobEffectInstance(MobEffects.DIG_SPEED, 40, 0,true,false),
            		new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 0,true,false)).addSwitchForm(KNUCKLE_FUESTLE_BURST.get()).AddToTabList(RiderTabs.KIVA_TAB_ITEM));
	
	public static final RegistryObject<Item> CALIBUR_FUESTLE = ITEMS.register("caliburfuestle",
			() -> new BaseItem(new Item.Properties()).AddToTabList(RiderTabs.KIVA_TAB_ITEM));
    
    public static final RegistryObject<Item> RISER_FUESTLE = ITEMS.register("risingfuestle",
            () -> new RiderFormChangeItem(new Item.Properties(),0,"_rising","ixa","ixa_belt",
            		new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 2,true,false),
            		new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 40, 0,true,false),
            		new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 1,true,false),
            		new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 1,true,false),
            		new MobEffectInstance(MobEffects.DIG_SPEED, 40, 0,true,false)).AddToTabList(RiderTabs.KIVA_TAB_ITEM));
	
    
    public static final RegistryObject<Item> WAKE_UP_FUESTLE_SAGA = ITEMS.register("sagafuestle",
            () -> new RiderFormChangeItem(new Item.Properties(),0,"","saga","sagarc_belt",
            		new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 1,true,false),
            		new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 1,true,false),
            		new MobEffectInstance(MobEffects.DIG_SPEED, 40, 0,true,false),
            		new MobEffectInstance(MobEffects.JUMP, 40, 2,true,false)).AddToTabList(RiderTabs.KIVA_TAB_ITEM));
	
    
    public static final RegistryObject<Item> WAKE_UP_FUESTLE_DARK_KIVA = ITEMS.register("darkwakeupfuestle",
            () -> new RiderFormChangeItem(new Item.Properties(),0,"","dark_kiva","dark_kivat_belt",
            		new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 3,true,false),
            		new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
            		new MobEffectInstance(MobEffects.DIG_SPEED, 40, 0,true,false),
            		new MobEffectInstance(MobEffects.JUMP, 40, 1,true,false),
            		new MobEffectInstance(MobEffects.REGENERATION, 40, 2,true,false)).AddToTabList(RiderTabs.KIVA_TAB_ITEM));
	
    
    public static final RegistryObject<Item> WAKE_UP_FUESTLE_NEW_KIVA = ITEMS.register("newwakeupfuestle",
            () -> new RiderFormChangeItem(new Item.Properties(),0,"","kiva","new_kivat_belt",
            		new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 0,true,false),
            		new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 0,true,false),
            		new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 0,true,false)).AddToTabList(RiderTabs.KIVA_TAB_ITEM));
    
    
    public static final RegistryObject<Item> WAKE_UP_FUESTLE_ARC = ITEMS.register("keyfuestle_arc",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"","arc","arc_kivat_belt",
					new MobEffectInstance(Effect_core.BIG.get(), 40, 1,true,false),
            		new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 2,true,false),
            		new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 3,true,false),
            		new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 1,true,false),
            		new MobEffectInstance(MobEffects.DIG_SPEED, 40, 0,true,false)));
    
    
    public static final RegistryObject<Item> WAKE_UP_FUESTLE_ARC_LEGEND = ITEMS.register("keyfuestle_arc_legend",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_legend","arc","arc_kivat_belt_mecha",
					new MobEffectInstance(Effect_core.BIG.get(), 40, 1,true,false),
					new MobEffectInstance(Effect_core.FLYING.get(), 40, 0,true,false),
            		new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 2,true,false),
            		new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 3,true,false),
            		new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 1,true,false),
            		new MobEffectInstance(MobEffects.DIG_SPEED, 40, 0,true,false))
			.ChangeModel("geo/arc_legend.geo.json"));
    
    public static final RegistryObject<Item> WAKE_UP_FUESTLE_REY = ITEMS.register("keyfuestle",
            () -> new RiderFormChangeItem(new Item.Properties(),0,"","rey","rey_kivat_belt",
            		new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 2,true,false),
            		new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 3,true,false),
            		new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 1,true,false),
            		new MobEffectInstance(MobEffects.DIG_SPEED, 40, 0,true,false)).addAlternative(WAKE_UP_FUESTLE_ARC.get()).AddToTabList(RiderTabs.KIVA_TAB_ITEM));
    
    
    public static final RegistryObject<Item> WAKE_UP_FUESTLE_KIVALA = ITEMS.register("kivalafuestle",
            () -> new RiderFormChangeItem(new Item.Properties(),0,"","kivala","kivala_belt",
            		new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 0,true,false),
            		new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 0,true,false),
            		new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 0,true,false)).AddToTabList(RiderTabs.KIVA_TAB_ITEM));
    
    
    public static final RegistryObject<Item> KIVAHELMET = ITEMS.register("kivahead",
            () -> new RiderArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.HELMET, new Item.Properties()).AddToTabList(RiderTabs.KIVA_TAB_ITEM).ChangeRepairItem(FUESTLE.get()));
    public static final RegistryObject<Item> KIVACHESTPLATE = ITEMS.register("kivatroso",
            () -> new RiderArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.CHESTPLATE, new Item.Properties()).AddToTabList(RiderTabs.KIVA_TAB_ITEM).ChangeRepairItem(FUESTLE.get()));
    public static final RegistryObject<Item> KIVALEGGINGS = ITEMS.register("kivalegs",
            () -> new RiderArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.LEGGINGS, new Item.Properties()).AddToTabList(RiderTabs.KIVA_TAB_ITEM).ChangeRepairItem(FUESTLE.get()));

    
    public static final RegistryObject<Item> KIVAT_BELT = ITEMS.register("kivadriver",
    		() -> new RiderDriverItem(ArmorMaterials.DIAMOND,"kiva", WAKE_UP_FUESTLE,KIVAHELMET, KIVACHESTPLATE, KIVALEGGINGS, new Item.Properties()).AddToTabList(RiderTabs.KIVA_TAB_ITEM).ChangeRepairItem(FUESTLE.get()));

    public static final RegistryObject<Item> IXA_BELT = ITEMS.register("ixa_belt",
    		() -> new RiderDriverItem(ArmorMaterials.DIAMOND,"ixa", KNUCKLE_FUESTLE,KIVAHELMET, KIVACHESTPLATE, KIVALEGGINGS, new Item.Properties()).AddToTabList(RiderTabs.KIVA_TAB_ITEM).ChangeRepairItem(FUESTLE.get()));
    
    public static final RegistryObject<Item> SAGARC_BELT = ITEMS.register("sagarc_belt",
    		() -> new RiderDriverItem(ArmorMaterials.DIAMOND,"saga", WAKE_UP_FUESTLE_SAGA, KIVAHELMET, KIVACHESTPLATE, KIVALEGGINGS, new Item.Properties()).AddToTabList(RiderTabs.KIVA_TAB_ITEM).ChangeRepairItem(FUESTLE.get()));
    
    public static final RegistryObject<Item> DARK_KIVAT_BELT = ITEMS.register("darkkivadriver",
    		() -> new RiderDriverItem(ArmorMaterials.DIAMOND,"dark_kiva", WAKE_UP_FUESTLE_DARK_KIVA,KIVAHELMET, KIVACHESTPLATE, KIVALEGGINGS, new Item.Properties()).AddToTabList(RiderTabs.KIVA_TAB_ITEM).ChangeRepairItem(FUESTLE.get()));

    public static final RegistryObject<Item> NEW_KIVAT_BELT = ITEMS.register("newkivadriver",
    		() -> new RiderDriverItem(ArmorMaterials.DIAMOND,"kiva", WAKE_UP_FUESTLE_NEW_KIVA,KIVAHELMET, KIVACHESTPLATE, KIVALEGGINGS, new Item.Properties()).AddToTabList(RiderTabs.KIVA_TAB_ITEM).ChangeRepairItem(FUESTLE.get()));

    public static final RegistryObject<Item> REY_KIVAT_BELT = ITEMS.register("reydriver",
    		() -> new RiderDriverItem(ArmorMaterials.DIAMOND,"rey", WAKE_UP_FUESTLE_REY,KIVAHELMET, KIVACHESTPLATE, KIVALEGGINGS, new Item.Properties()).AddToTabList(RiderTabs.KIVA_TAB_ITEM).ChangeRepairItem(FUESTLE.get()));

    public static final RegistryObject<Item> ARC_KIVAT_BELT = ITEMS.register("arcdriver",
    		() -> new RiderDriverItem(ArmorMaterials.DIAMOND,"arc", WAKE_UP_FUESTLE_ARC,KIVAHELMET, KIVACHESTPLATE, KIVALEGGINGS, new Item.Properties()).AddToTabList(RiderTabs.KIVA_TAB_ITEM).ChangeRepairItem(FUESTLE.get()));

    public static final RegistryObject<Item> KIVALA_BELT = ITEMS.register("kivaladriver",
    		() -> new RiderDriverItem(ArmorMaterials.DIAMOND,"kivala", WAKE_UP_FUESTLE_KIVALA,KIVAHELMET, KIVACHESTPLATE, KIVALEGGINGS, new Item.Properties()).AddToTabList(RiderTabs.KIVA_TAB_ITEM).ChangeRepairItem(FUESTLE.get()));

    
    public static final RegistryObject<SwordItem> GARULU_SABER = ITEMS.register("garulu_saber",
         	() -> new BaseSwordItem(Tiers.DIAMOND, 5, 3.5f, new Item.Properties()).AddToTabList(RiderTabs.KIVA_TAB_ITEM).ChangeRepairItem(FUESTLE.get()));
    
	public static final RegistryObject<BaseBlasterItem> BASSHAA_MAGNUM = ITEMS.register("basshaamagnum",
			() -> new BaseBlasterItem(Tiers.DIAMOND, 3, 3.5f, new Item.Properties()).AddToTabList(RiderTabs.KIVA_TAB_ITEM).ChangeRepairItem(FUESTLE.get()));

	public static final RegistryObject<SwordItem> DOGGA_HAMMER = ITEMS.register("dogga_hammer",
         	() -> new BaseSwordItem(Tiers.DIAMOND, 7, 1.5f, new Item.Properties()).AddToTabList(RiderTabs.KIVA_TAB_ITEM).ChangeRepairItem(FUESTLE.get()));
    
	public static final RegistryObject<SwordItem> GARULU_SABER_TATSULOT = ITEMS.register("garulu_saber_tatsulot",
         	() -> new BaseSwordItem(Tiers.DIAMOND, 7, 3.5f, new Item.Properties()).AddToTabList(RiderTabs.KIVA_TAB_ITEM).ChangeRepairItem(FUESTLE.get()));
    
	public static final RegistryObject<BaseBlasterItem> BASSHAA_MAGNUM_TATSULOT = ITEMS.register("basshaa_magnum_tatsulot",
			() -> new BaseBlasterItem(Tiers.DIAMOND, 6, 3.5f, new Item.Properties()).AddToTabList(RiderTabs.KIVA_TAB_ITEM).ChangeRepairItem(FUESTLE.get()));

	public static final RegistryObject<SwordItem> DOGGA_HAMMER_TATSULOT = ITEMS.register("dogga_hammer_tatsulot",
         	() -> new BaseSwordItem(Tiers.DIAMOND, 9, 1.5f, new Item.Properties()).AddToTabList(RiderTabs.KIVA_TAB_ITEM).ChangeRepairItem(FUESTLE.get()));

	public static final RegistryObject<SwordItem> ZANVAT_SWORD = ITEMS.register("zanbatsword",
         	() -> new BaseSwordItem(Tiers.DIAMOND, 9, 3.5f, new Item.Properties()).AddToTabList(RiderTabs.KIVA_TAB_ITEM).ChangeRepairItem(FUESTLE.get()));
    
	public static final RegistryObject<SwordItem> ZANVAT_SWORD_PAST = ITEMS.register("zanbatsword_core",
         	() -> new BaseSwordItem(Tiers.DIAMOND, 5, 3.5f, new Item.Properties()).AddToTabList(RiderTabs.KIVA_TAB_ITEM).ChangeRepairItem(FUESTLE.get()));
	
	public static final RegistryObject<SwordItem> IXA_KNUCKLE = ITEMS.register("ixa_knuckle",
         	() -> new BaseSwordItem(Tiers.DIAMOND, 3, 4.5f, new Item.Properties()).AddToTabList(RiderTabs.KIVA_TAB_ITEM).ChangeRepairItem(FUESTLE.get()));
    
	public static final RegistryObject<BaseBlasterItem> IXA_CALIBER = ITEMS.register("ixa_caliber",
         	() -> new BaseBlasterItem(Tiers.DIAMOND, 9, 3.5f, new Item.Properties()).IsSwordGun().AddToTabList(RiderTabs.KIVA_TAB_ITEM).ChangeRepairItem(FUESTLE.get()));
    
	public static final RegistryObject<BaseBlasterItem> IXA_RISER = ITEMS.register("ixariser",
			() -> new BaseBlasterItem(Tiers.DIAMOND, 4, 3.5f, new Item.Properties()).AddToTabList(RiderTabs.KIVA_TAB_ITEM).ChangeRepairItem(FUESTLE.get()));

	public static final RegistryObject<SwordItem> JACORDER = ITEMS.register("jacorder",
         	() -> new BaseSwordItem(Tiers.DIAMOND, 6, 3.5f, new Item.Properties()).AddToTabList(RiderTabs.KIVA_TAB_ITEM).ChangeRepairItem(FUESTLE.get()));
    
	public static final RegistryObject<SwordItem> ARC_TRIDENT = ITEMS.register("arc_trident",
         	() -> new BaseSwordItem(Tiers.DIAMOND, 8, 3.5f, new Item.Properties()).AddToTabList(RiderTabs.KIVA_TAB_ITEM).ChangeRepairItem(FUESTLE.get()));
    
	public static final RegistryObject<SwordItem> FANGIRE_SLAYER = ITEMS.register("fangire_slayer",
         	() -> new BaseSwordItem(Tiers.DIAMOND, 3, 3.5f, new Item.Properties()).AddToTabList(RiderTabs.KIVA_TAB_ITEM).ChangeRepairItem(FUESTLE.get()));
    
	public static final RegistryObject<BaseBlasterItem> FANGIRE_BUSTER = ITEMS.register("fangire_buster",
			() -> new BaseBlasterItem(Tiers.DIAMOND, 2, 3.5f, new Item.Properties()).AddToTabList(RiderTabs.KIVA_TAB_ITEM).ChangeRepairItem(FUESTLE.get()));

	public static void register(IEventBus eventBus) {
		ITEMS.register(eventBus);
	}
}