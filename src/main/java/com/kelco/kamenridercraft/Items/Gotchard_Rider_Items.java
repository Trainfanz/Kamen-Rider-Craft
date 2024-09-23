package com.kelco.kamenridercraft.Items;

import java.util.ArrayList;
import java.util.List;

import com.kelco.kamenridercraft.KamenRiderCraftCore;
import com.kelco.kamenridercraft.Effect.Effect_core;
import com.kelco.kamenridercraft.Items.gotchard.ValvaradItem;
import com.kelco.kamenridercraft.Items.rider_armor_base.BaseBlasterItem;
import com.kelco.kamenridercraft.Items.rider_armor_base.BaseItem;
import com.kelco.kamenridercraft.Items.rider_armor_base.CopyFormChangeItem;
import com.kelco.kamenridercraft.Items.rider_armor_base.RiderArmorItem;
import com.kelco.kamenridercraft.Items.rider_armor_base.RiderDriverItem;
import com.kelco.kamenridercraft.Items.rider_armor_base.RiderFormChangeItem;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterials;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Tiers;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class Gotchard_Rider_Items {

	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, KamenRiderCraftCore.MODID);
    
	public static List<Item> NEED_ITEM_SteamHopper= new ArrayList<Item>();
	public static List<Item> NEED_ITEM_AppareSkebow= new ArrayList<Item>();
	public static List<Item> NEED_ITEM_VenomMariner= new ArrayList<Item>();
	public static List<Item> NEED_ITEM_AntWrestler= new ArrayList<Item>();
	public static List<Item> NEED_ITEM_BurningGorilla= new ArrayList<Item>();
	public static List<Item> NEED_ITEM_NeedleHawk= new ArrayList<Item>();
	public static List<Item> NEED_ITEM_DokkiriShovel= new ArrayList<Item>();
	public static List<Item> NEED_ITEM_GoldMechanichor= new ArrayList<Item>();
	public static List<Item> NEED_ITEM_HiikesuRose= new ArrayList<Item>();
	public static List<Item> NEED_ITEM_LightningJungle= new ArrayList<Item>();

	public static List<Item> NEED_ITEM_ExceedMighty= new ArrayList<Item>();
	public static List<Item> NEED_ITEM_CycloneTaToBa= new ArrayList<Item>();
	public static List<Item> NEED_ITEM_FullFullRocket= new ArrayList<Item>();

	public static final RegistryObject<Item> GOTCHARD_LOGO = ITEMS.register("gotchard_logo",
    		() -> new BaseItem(new Item.Properties()).AddToTabList(RiderTabs.GOTCHARD_TAB_ITEM));

	public static final RegistryObject<Item> BLANK_RIDE_CHEMY_CARD = ITEMS.register("blank_ride_chemy_card",
    		() -> new BaseItem(new Item.Properties()).AddToTabList(RiderTabs.GOTCHARD_TAB_ITEM));
	   
    public static final RegistryObject<Item> HOPPER1_RIDE_CHEMY_CARD = ITEMS.register("hopper1_ride_chemy_card",
            () -> new RiderFormChangeItem(new Item.Properties(),0,"","gotchard","gotchardriver_belt",
            		new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 1,true,false),
            		new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 1,true,false),
            		new MobEffectInstance(MobEffects.JUMP, 40, 1,true,false)).AddNeedItemList(NEED_ITEM_SteamHopper)
            .AddToTabList(NEED_ITEM_SteamHopper).AddToTabList(RiderTabs.GOTCHARD_TAB_ITEM));
    /* pikahotaru
     * gengenchoucho
     * bakuonzemi
     */
    
    public static final RegistryObject<Item> ANTROOPER_RIDE_CHEMY_CARD = ITEMS.register("antrooper_ride_chemy_card",
            () -> new RiderFormChangeItem(new Item.Properties(),0,"_ant_wrestler","gotchard","gotchardriver_belt",
            		new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 2,true,false),
            		new MobEffectInstance(Effect_core.PUNCH.get(), 40, 2,true,false))
            .AddNeedItemList(NEED_ITEM_AntWrestler).AddToTabList(NEED_ITEM_AntWrestler).AddToTabList(RiderTabs.GOTCHARD_TAB_ITEM));
    
    /* greatonbo
     * stagvine
     * kaiserbee
     * kamantis
     * beetlx
     * 
     * odorippa
     */
    
    public static final RegistryObject<Item> DOKKIRIMAJIN_RIDE_CHEMY_CARD = ITEMS.register("dokkirimajin_ride_chemy_card",
            () -> new RiderFormChangeItem(new Item.Properties(),0,"_dokkiri_shovel","gotchard","gotchardriver_belt",
            		new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 2,true,false),
            		new MobEffectInstance(MobEffects.DIG_SPEED, 40, 1,true,false))
            .AddNeedItemList(NEED_ITEM_DokkiriShovel).AddToTabList(NEED_ITEM_DokkiriShovel).AddToTabList(RiderTabs.GOTCHARD_TAB_ITEM));
    
     /* doctorkozo
     * pilets
     */
    
    public static final RegistryObject<Item> WRESTLER_G_RIDE_CHEMY_CARD = ITEMS.register("wrestler_g_ride_chemy_card",
            () -> new CopyFormChangeItem(new Item.Properties(),ANTROOPER_RIDE_CHEMY_CARD.get()).AddToTabList(NEED_ITEM_AntWrestler)
            .AddToTabList(RiderTabs.GOTCHARD_TAB_ITEM));
    
     /* sasukemaru
     * bulletbaang
     */
    
    public static final RegistryObject<Item> APPAREBUSHIDO_RIDE_CHEMY_CARD = ITEMS.register("apparebushido_ride_chemy_card",
            () -> new RiderFormChangeItem(new Item.Properties(),0,"_appare_skebow","gotchard","gotchardriver_belt",
            		new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 2,true,false),
            		new MobEffectInstance(MobEffects.JUMP, 40, 2,true,false),
            		new MobEffectInstance(Effect_core.SLASH.get(), 40, 2,true,false))
            .ChangeModel("geo/gotchard_appare_skebow.geo.json")
            .AddNeedItemList(NEED_ITEM_AppareSkebow).AddToTabList(NEED_ITEM_AppareSkebow).AddToTabList(RiderTabs.GOTCHARD_TAB_ITEM));
    
    /* karyudos
     * x wizard
     * 
     * spicle
     */
    
    public static final RegistryObject<Item> SKEBOWS_RIDE_CHEMY_CARD = ITEMS.register("skebows_ride_chemy_card",
            () -> new CopyFormChangeItem(new Item.Properties(),APPAREBUSHIDO_RIDE_CHEMY_CARD.get()).AddToTabList(NEED_ITEM_AppareSkebow)
            .AddToTabList(RiderTabs.GOTCHARD_TAB_ITEM));
    
    public static final RegistryObject<Item> HIIKESCUE_RIDE_CHEMY_CARD = ITEMS.register("hiikescue_ride_chemy_card",
            () -> new RiderFormChangeItem(new Item.Properties(),0,"_hiikesu_rose","gotchard","gotchardriver_belt",
            		new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 40, 1,true,false),
            		new MobEffectInstance(Effect_core.REFLECT.get(), 40, 1,true,false))
            .AddNeedItemList(NEED_ITEM_HiikesuRose).AddToTabList(NEED_ITEM_HiikesuRose).AddToTabList(RiderTabs.GOTCHARD_TAB_ITEM));
    
    public static final RegistryObject<Item> GEKIOCOPTER_RIDE_CHEMY_CARD = ITEMS.register("gekiocopter_ride_chemy_card",
            () -> new RiderFormChangeItem(new Item.Properties(),0,"","valvarad","",
            		new MobEffectInstance(Effect_core.FLYING.get(), 40, 1,true,false),
            		new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 2,true,false))
            .ChangeSlot(2).addSwitchForm(Modded_item_core.BLANK_FORM.get()).AddToTabList(RiderTabs.GOTCHARD_TAB_ITEM));
    
    public static final RegistryObject<Item> DEEPMARINER_RIDE_CHEMY_CARD = ITEMS.register("deepmariner_ride_chemy_card",
            () -> new RiderFormChangeItem(new Item.Properties(),0,"_venom_mariner","gotchard","gotchardriver_belt",
            		new MobEffectInstance(MobEffects.WATER_BREATHING, 40, 1,true,false),
            		new MobEffectInstance(Effect_core.ANTIPOISON.get(), 40, 1,true,false))
            .AddNeedItemList(NEED_ITEM_VenomMariner).AddToTabList(NEED_ITEM_VenomMariner).AddToTabList(RiderTabs.GOTCHARD_TAB_ITEM));
    
    public static final RegistryObject<Item> MADWHEEL_RIDE_CHEMY_CARD = ITEMS.register("madwheel_ride_chemy_card",
            () -> new RiderFormChangeItem(new Item.Properties(),0,"","valvarad","valvaradraw_buckle_belt",
            		new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 1,true,false),
            		new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 1,true,false)).AddToTabList(RiderTabs.GOTCHARD_TAB_ITEM));
    
    public static final RegistryObject<Item> GOLDDASH_RIDE_CHEMY_CARD = ITEMS.register("golddash_ride_chemy_card",
            () -> new RiderFormChangeItem(new Item.Properties(),0,"_gold_mechanichor","gotchard","gotchardriver_belt_big",
            		new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 1,true,false),
            		new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 4,true,false),
            		new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 3,true,false))
            .ChangeModel("geo/gotchard_gold_mechanichor.geo.json").ChangeBeltModel("geo/lv_1_belt.geo.json")
            .AddNeedItemList(NEED_ITEM_GoldMechanichor).AddToTabList(NEED_ITEM_GoldMechanichor).AddToTabList(RiderTabs.GOTCHARD_TAB_ITEM));
    
    public static final RegistryObject<Item> GUTSSHOVEL_RIDE_CHEMY_CARD = ITEMS.register("gutsshovel_ride_chemy_card",
            () -> new RiderFormChangeItem(new Item.Properties(),0,"","valvarad","",
            		new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 3,true,false),
            		new MobEffectInstance(Effect_core.PUNCH.get(), 40, 3,true,false))
            .ChangeSlot(3).addAlternative(DOKKIRIMAJIN_RIDE_CHEMY_CARD.get()).addSwitchForm(Modded_item_core.BLANK_FORM.get()).AddToTabList(NEED_ITEM_DokkiriShovel).AddToTabList(RiderTabs.GOTCHARD_TAB_ITEM));
    
    public static final RegistryObject<Item> STEAMLINER_RIDE_CHEMY_CARD = ITEMS.register("steamliner_ride_chemy_card",
            () -> new CopyFormChangeItem(new Item.Properties(),HOPPER1_RIDE_CHEMY_CARD.get()).AddToTabList(NEED_ITEM_SteamHopper)
            .AddToTabList(RiderTabs.GOTCHARD_TAB_ITEM));
	
    /* exceedfighter
     * 
     * yamibat
     * catchula
     */
    
    public static final RegistryObject<Item> MECHANICHANI_RIDE_CHEMY_CARD = ITEMS.register("mechanichani_ride_chemy_card",
            () -> new CopyFormChangeItem(new Item.Properties(),GOLDDASH_RIDE_CHEMY_CARD.get()).AddToTabList(NEED_ITEM_GoldMechanichor)
            .AddToTabList(RiderTabs.GOTCHARD_TAB_ITEM));
    
     /* bussasorry
     * bountybunny
     */
	   
    public static final RegistryObject<Item> HAWKSTAR_RIDE_CHEMY_CARD = ITEMS.register("hawkstar_ride_chemy_card",
         () -> new RiderFormChangeItem(new Item.Properties(),0,"_needle_hawk","gotchard","gotchardriver_belt",
         		new MobEffectInstance(Effect_core.FLYING.get(), 40, 1,true,false),
         		new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 1,true,false))
         .ifFlyingModelResource("geo/gotchard_needle_hawk.geo.json").AddNeedItemList(NEED_ITEM_NeedleHawk)
         .AddToTabList(NEED_ITEM_NeedleHawk).AddToTabList(RiderTabs.GOTCHARD_TAB_ITEM));
 
     /* tsupparihebi
     */
    
    public static final RegistryObject<Item> GORILLASENSEI_RIDE_CHEMY_CARD = ITEMS.register("gorillasensei_ride_chemy_card",
            () -> new RiderFormChangeItem(new Item.Properties(),0,"_burning_gorilla","gotchard","gotchardriver_belt",
            		new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 4,true,false),
            		new MobEffectInstance(Effect_core.PUNCH.get(), 40, 4,true,false),
            		new MobEffectInstance(Effect_core.FIRE_PUNCH.get(), 40, 4,true,false))
            .AddNeedItemList(NEED_ITEM_BurningGorilla).AddToTabList(NEED_ITEM_BurningGorilla).AddToTabList(RiderTabs.GOTCHARD_TAB_ITEM));
    
    /* ganvhale
     * lixion
     */
    
   public static final RegistryObject<Item> RAIDENJI_RIDE_CHEMY_CARD = ITEMS.register("raidenji_ride_chemy_card",
           () -> new RiderFormChangeItem(new Item.Properties(),0,"_lightning_jungle","gotchard","gotchardriver_belt_big",
           		new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 1,true,false))
           .ChangeModel("geo/gotchard_lightning_jungle.geo.json").ChangeBeltModel("geo/lv_1_belt.geo.json")
           .AddNeedItemList(NEED_ITEM_LightningJungle).AddToTabList(NEED_ITEM_LightningJungle).AddToTabList(RiderTabs.GOTCHARD_TAB_ITEM));
    
     /* kesuzo
     * mitemirror
     * energyl
     * panpakaparka
     * televi
     * timelord
     * smaphone
     * renkingrobo
     * x_fortress
     * 
     * happyclover
     */
    
    public static final RegistryObject<Item> BURNINGNERO_RIDE_CHEMY_CARD = ITEMS.register("burningnero_ride_chemy_card",
            () -> new CopyFormChangeItem(new Item.Properties(),GORILLASENSEI_RIDE_CHEMY_CARD.get()).AddToTabList(NEED_ITEM_BurningGorilla)
            .AddToTabList(RiderTabs.GOTCHARD_TAB_ITEM));
    
    /* bambamboo
     */
    
    public static final RegistryObject<Item> SABONEEDLE_RIDE_CHEMY_CARD = ITEMS.register("saboneedle_ride_chemy_card",
            () -> new CopyFormChangeItem(new Item.Properties(),HAWKSTAR_RIDE_CHEMY_CARD.get()).AddToTabList(NEED_ITEM_NeedleHawk)
            .AddToTabList(RiderTabs.GOTCHARD_TAB_ITEM));
    
    public static final RegistryObject<Item> VENOMDAKE_RIDE_CHEMY_CARD = ITEMS.register("venomdake_ride_chemy_card",
            () -> new CopyFormChangeItem(new Item.Properties(),DEEPMARINER_RIDE_CHEMY_CARD.get()).AddToTabList(NEED_ITEM_VenomMariner)
            .AddToTabList(RiderTabs.GOTCHARD_TAB_ITEM));
    
     /* utsubocchama
     */
    
    public static final RegistryObject<Item> FLAYROSE_RIDE_CHEMY_CARD = ITEMS.register("flayrose_ride_chemy_card",
            () -> new CopyFormChangeItem(new Item.Properties(),HIIKESCUE_RIDE_CHEMY_CARD.get()).AddToTabList(NEED_ITEM_HiikesuRose)
            .AddToTabList(RiderTabs.GOTCHARD_TAB_ITEM));
    
     /* buglesia
     */
    
    public static final RegistryObject<Item> JUNGLEJAN_RIDE_CHEMY_CARD = ITEMS.register("junglejan_ride_chemy_card",
            () -> new CopyFormChangeItem(new Item.Properties(),RAIDENJI_RIDE_CHEMY_CARD.get()).AddToTabList(NEED_ITEM_LightningJungle)
            .AddToTabList(RiderTabs.GOTCHARD_TAB_ITEM));
    
     /* xeggdrasil
     * 
     * carery
     * berosol
     * sayzombie
     * angelead
     * zukyumpire
     * daiohni
     * mackraken
     * jyamatanoorochi
     * ninetail
     * ufo_x
     * 
     * nanmonite
     * akumanocaris
     * pakuraptor
     * ojilacanth
     * sabeliger
     * warptera
     * gigalodon
     * tricera
     * blizzammoth
     * x_rex
     * 
     * mercurin
     * kinkiravina
     * gokigenmeteon
     * neminemoon
     * firemars
     * grandsaturn
     * the_sun
     * jupitta
     * kuroana
     * gaiard
     * 
     * gigabaham
     * macentaurus
     * unicon
     * vanfenrir
     * inphoenix
     * yoacerberus
     * haodin
     * gingriffon
     * donposeidon
     * dragonalos
     */

    public static final RegistryObject<Item> STEAMLINER_REPLI_CHEMY_CARD = ITEMS.register("steamliner_repli_chemy_card",
            () -> new RiderFormChangeItem(new Item.Properties(),0,"","dread","dreadriver_belt",
            		new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 1,true,false),
            		new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 1,true,false),
            		new MobEffectInstance(MobEffects.JUMP, 40, 1,true,false)).AddToTabList(RiderTabs.GOTCHARD_TAB_ITEM));	   
    
    public static final RegistryObject<Item> LEGEND_RIDE_CHEMY_CARD = ITEMS.register("legend_ride_chemy_card",
    		() -> new RiderFormChangeItem(new Item.Properties(),0,"","legend","legendriver_belt",
    				new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 1,true,false),
    				new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 0,true,false),
    				new MobEffectInstance(MobEffects.JUMP, 40, 2,true,false)).AddToTabList(RiderTabs.GOTCHARD_TAB_ITEM));

    public static final RegistryObject<Item> KUUGA_RIDE_CHEMY_CARD = ITEMS.register("kuuga_ride_chemy_card",
            () -> new RiderFormChangeItem(new Item.Properties(),0,"_exceed_mighty","gotchard","gotchardriver_belt",
            		new MobEffectInstance(Effect_core.PUNCH.get(), 40, 2,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 0,true,false),
					new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 0,true,false)).AddNeedItemList(NEED_ITEM_ExceedMighty)
            .AddToTabList(NEED_ITEM_ExceedMighty).AddToTabList(RiderTabs.GOTCHARD_TAB_ITEM));
    
    /*agito
     * ryuki
     */
    
    public static final RegistryObject<Item> FAIZ_RIDE_CHEMY_CARD = ITEMS.register("faiz_ride_chemy_card",
            () -> new CopyFormChangeItem(new Item.Properties(),KUUGA_RIDE_CHEMY_CARD.get()).AddToTabList(NEED_ITEM_ExceedMighty)
            .AddToTabList(RiderTabs.GOTCHARD_TAB_ITEM));
    
    /*blade
     * hibiki
     * kabuto
     * den-o
     * kiva
     * decade
     */

    public static final RegistryObject<Item> W_RIDE_CHEMY_CARD = ITEMS.register("w_ride_chemy_card",
            () -> new RiderFormChangeItem(new Item.Properties(),0,"_cyclone_tatoba","gotchard","gotchardriver_belt",
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 1,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 1,true,false),
					new MobEffectInstance(Effect_core.PUNCH.get(), 40, 0,true,false),
					new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 1,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 1,true,false),
					new MobEffectInstance(MobEffects.JUMP, 40, 2,true,false)).AddNeedItemList(NEED_ITEM_CycloneTaToBa)
            .AddToTabList(NEED_ITEM_CycloneTaToBa).AddToTabList(RiderTabs.GOTCHARD_TAB_ITEM));
    
    public static final RegistryObject<Item> OOO_RIDE_CHEMY_CARD = ITEMS.register("ooo_ride_chemy_card",
            () -> new CopyFormChangeItem(new Item.Properties(),W_RIDE_CHEMY_CARD.get()).AddToTabList(NEED_ITEM_CycloneTaToBa)
            .AddToTabList(RiderTabs.GOTCHARD_TAB_ITEM));

    public static final RegistryObject<Item> FOURZE_RIDE_CHEMY_CARD = ITEMS.register("fourze_ride_chemy_card",
            () -> new RiderFormChangeItem(new Item.Properties(),0,"_full_full_rocket","gotchard","gotchardriver_belt",
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 0,true,false),
					new MobEffectInstance(MobEffects.JUMP, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 0,true,false),
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 0,true,false)).AddNeedItemList(NEED_ITEM_FullFullRocket)
            .AddToTabList(NEED_ITEM_FullFullRocket).AddToTabList(RiderTabs.GOTCHARD_TAB_ITEM));
    
    /*wizard
     * gaim
     * drive
     * ghost
     * ex-aid
     */
    
    public static final RegistryObject<Item> BUILD_RIDE_CHEMY_CARD = ITEMS.register("build_ride_chemy_card",
            () -> new CopyFormChangeItem(new Item.Properties(),FOURZE_RIDE_CHEMY_CARD.get()).AddToTabList(NEED_ITEM_FullFullRocket)
            .AddToTabList(RiderTabs.GOTCHARD_TAB_ITEM));
    
    
	public static final RegistryObject<Item> GOTCHARD_HELMET = ITEMS.register("gotchard_head",
            () -> new RiderArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.HELMET, new Item.Properties()).AddToTabList(RiderTabs.GOTCHARD_TAB_ITEM).ChangeRepairItem(BLANK_RIDE_CHEMY_CARD.get()));
    public static final RegistryObject<Item> GOTCHARD_CHESTPLATE = ITEMS.register("gotchard_torso",
            () -> new RiderArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.CHESTPLATE, new Item.Properties()).AddToTabList(RiderTabs.GOTCHARD_TAB_ITEM).ChangeRepairItem(BLANK_RIDE_CHEMY_CARD.get()));
    public static final RegistryObject<Item> GOTCHARD_LEGGINGS = ITEMS.register("gotchard_legs",
            () -> new RiderArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.LEGGINGS, new Item.Properties()).AddToTabList(RiderTabs.GOTCHARD_TAB_ITEM).ChangeRepairItem(BLANK_RIDE_CHEMY_CARD.get()));

    
    public static final RegistryObject<Item> GOTCHARDRIVER = ITEMS.register("gotchardriver",
    		() -> new RiderDriverItem(ArmorMaterials.DIAMOND,"gotchard", HOPPER1_RIDE_CHEMY_CARD ,GOTCHARD_HELMET, GOTCHARD_CHESTPLATE,GOTCHARD_LEGGINGS , new Item.Properties()).AddToTabList(RiderTabs.GOTCHARD_TAB_ITEM).ChangeRepairItem(BLANK_RIDE_CHEMY_CARD.get()));
    
    public static final RegistryObject<Item> VALVARADRAW_BUCKLE = ITEMS.register("valvaradraw_buckle",
    		() -> new ValvaradItem(ArmorMaterials.DIAMOND,"valvarad", MADWHEEL_RIDE_CHEMY_CARD ,GOTCHARD_HELMET, GOTCHARD_CHESTPLATE,GOTCHARD_LEGGINGS , new Item.Properties())
    		.AddToTabList(RiderTabs.GOTCHARD_TAB_ITEM).ChangeRepairItem(BLANK_RIDE_CHEMY_CARD.get()));
    
    public static final RegistryObject<Item> DREADRIVER = ITEMS.register("dreadriver",
    		() -> new RiderDriverItem(ArmorMaterials.DIAMOND,"dread", STEAMLINER_REPLI_CHEMY_CARD ,GOTCHARD_HELMET, GOTCHARD_CHESTPLATE,GOTCHARD_LEGGINGS , new Item.Properties()).AddToTabList(RiderTabs.GOTCHARD_TAB_ITEM).ChangeRepairItem(BLANK_RIDE_CHEMY_CARD.get()));
    
    public static final RegistryObject<Item> LEGENDRIVER = ITEMS.register("legendriver",
    		() -> new RiderDriverItem(ArmorMaterials.DIAMOND,"legend", LEGEND_RIDE_CHEMY_CARD ,GOTCHARD_HELMET, GOTCHARD_CHESTPLATE,GOTCHARD_LEGGINGS , new Item.Properties()).AddToTabList(RiderTabs.GOTCHARD_TAB_ITEM).ChangeRepairItem(BLANK_RIDE_CHEMY_CARD.get()));
    
    
	public static final RegistryObject<BaseBlasterItem> GOTCHARGE_GUN = ITEMS.register("gotcharge_gun",
			() -> new BaseBlasterItem(Tiers.DIAMOND, 3, -2.4F, new Item.Properties()).AddToTabList(RiderTabs.GOTCHARD_TAB_ITEM).ChangeRepairItem(BLANK_RIDE_CHEMY_CARD.get()));
	
	public static final RegistryObject<BaseBlasterItem> GOTCHAR_TORNADO = ITEMS.register("gotchar_tornado",
			() -> new BaseBlasterItem(Tiers.DIAMOND, 5, -2.4F, new Item.Properties()).AddToTabList(RiderTabs.GOTCHARD_TAB_ITEM).ChangeRepairItem(BLANK_RIDE_CHEMY_CARD.get()));
	
	public static final RegistryObject<BaseBlasterItem> VALVARUSHER = ITEMS.register("valvarusher",
			() -> new BaseBlasterItem(Tiers.DIAMOND, 5, -2.4F, new Item.Properties()).IsSwordGun().IsHenshinItem(VALVARADRAW_BUCKLE.get()).AddToTabList(RiderTabs.GOTCHARD_TAB_ITEM).ChangeRepairItem(BLANK_RIDE_CHEMY_CARD.get()));
	
	public static final RegistryObject<BaseBlasterItem> CHEMY_RISER = ITEMS.register("chemy_riser",
			() -> new BaseBlasterItem(Tiers.DIAMOND, 3, -2.4F, new Item.Properties()).AddToTabList(RiderTabs.GOTCHARD_TAB_ITEM).ChangeRepairItem(BLANK_RIDE_CHEMY_CARD.get()));
	
	public static final RegistryObject<BaseBlasterItem> CHEMY_RISER_SUPANA = ITEMS.register("chemy_riser_supana",
			() -> new BaseBlasterItem(Tiers.DIAMOND, 3, -2.4F, new Item.Properties()).AddToTabList(RiderTabs.GOTCHARD_TAB_ITEM).ChangeRepairItem(BLANK_RIDE_CHEMY_CARD.get()));

    public static void register(IEventBus eventBus) {
		ITEMS.register(eventBus);
	}

}
