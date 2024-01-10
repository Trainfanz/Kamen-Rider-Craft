package com.kelco.kamenridercraft.Items;

import com.kelco.kamenridercraft.KamenRiderCraftCore;
import com.kelco.kamenridercraft.Effect.Effect_core;
import com.kelco.kamenridercraft.Items.ex_aid.GamerDriverItem;
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

public class Ex_Aid_Rider_Items {

	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, KamenRiderCraftCore.MODID);

	public static final RegistryObject<Item> EX_AID_LOGO = ITEMS.register("ex_aid_logo",
			() -> new BaseItem(new Item.Properties()).AddToTabList(RiderTabs.EX_AID_TAB_ITEM));

	public static final RegistryObject<Item> BLANK_GASHAT = ITEMS.register("blank_gashat",
			() -> new BaseItem(new Item.Properties()).AddToTabList(RiderTabs.EX_AID_TAB_ITEM));

	//mighty_brothers_xx_unfinished_gashat
	//unfinished_maximum_mighty_x_gashat
	//unfinished_hyper_muteki_gashat 
	//unfinished_kamen_rider_chronicle_gashat

	public static final RegistryObject<Item> MIGHTY_ACTION_X_GASHAT_LV_1 = ITEMS.register("mighty_action_x_gashat_lv_1",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_lv1","ex_aid","gamer_driver_mighty_action_x_lv_1",
					new MobEffectInstance(MobEffects.JUMP, 40, 3,true,false)).ChangeModel("geo/lv_1.geo.json").ChangeBeltModel("geo/lv_1_belt.geo.json").alsoChange2ndSlot(Modded_item_core.BLANK_FORM.get()));

	public static final RegistryObject<Item> MIGHTY_ACTION_X_GASHAT = ITEMS.register("mighty_action_x_gashat",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"","ex_aid","gamer_driver_mighty_action_x",
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 0,true,false),
					new MobEffectInstance(MobEffects.JUMP, 40, 1,true,false)).addSwitchForm(MIGHTY_ACTION_X_GASHAT_LV_1.get()).alsoChange2ndSlot(Modded_item_core.BLANK_FORM.get()).AddToTabList(RiderTabs.EX_AID_TAB_ITEM));

	public static final RegistryObject<Item> TADDLE_QUEST_GASHAT_LV_1 = ITEMS.register("taddle_quest_gashat_lv_1",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_lv1","brave","gamer_driver_taddle_quest_lv_1",
					new MobEffectInstance(MobEffects.JUMP, 40, 2,true,false)).ChangeModel("geo/lv_1.geo.json").ChangeBeltModel("geo/lv_1_belt.geo.json").alsoChange2ndSlot(Modded_item_core.BLANK_FORM.get()));

	public static final RegistryObject<Item> TADDLE_QUEST_X_GASHAT = ITEMS.register("taddle_quest_gashat",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"","brave","gamer_driver_taddle_quest",
					new MobEffectInstance(MobEffects.JUMP, 40, 2,true,false)).addSwitchForm(TADDLE_QUEST_GASHAT_LV_1.get()).alsoChange2ndSlot(Modded_item_core.BLANK_FORM.get()).AddToTabList(RiderTabs.EX_AID_TAB_ITEM));

	public static final RegistryObject<Item> BANG_BANG_SHOOTING_GASHAT_LV_1 = ITEMS.register("bang_bang_shooting_gashat_lv_1",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_lv1","snipe","gamer_driver_bang_bang_shooting_lv_1",
					new MobEffectInstance(MobEffects.JUMP, 40, 2,true,false)).ChangeModel("geo/lv_1.geo.json").ChangeBeltModel("geo/lv_1_belt.geo.json").alsoChange2ndSlot(Modded_item_core.BLANK_FORM.get()));

	public static final RegistryObject<Item> BANG_BANG_SHOOTING_GASHAT = ITEMS.register("bang_bang_shooting_gashat",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"","snipe","gamer_driver_bang_bang_shooting",
					new MobEffectInstance(MobEffects.JUMP, 40, 2,true,false)).addSwitchForm(BANG_BANG_SHOOTING_GASHAT_LV_1.get()).alsoChange2ndSlot(Modded_item_core.BLANK_FORM.get()).AddToTabList(RiderTabs.EX_AID_TAB_ITEM));

	/**
	bakusou_bike_gashat
	 */

	public static String[] BaseGamerDriverUsers = new String[] {"ex_aid","genm","brave","snipe","proto_snipe","proto_brave"};


	public static final RegistryObject<Item> GEKITOTSU_ROBOTS_GASHAT = ITEMS.register("gekitotsu_robots_gashat",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"robot_gamer","ex_aid","gamer_driver_mighty_action_x",
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 1,true,false)).ResetFormToBase().AddCompatibilityList(BaseGamerDriverUsers).ChangeSlot(2).AddToTabList(RiderTabs.EX_AID_TAB_ITEM));

	public static final RegistryObject<Item> DOREMIFA_BEAT_GASHAT = ITEMS.register("doremifa_beat_gashat",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"beat_gamer","ex_aid","gamer_driver_mighty_action_x",
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false)).AddCompatibilityList(BaseGamerDriverUsers).ChangeSlot(2).AddToTabList(RiderTabs.EX_AID_TAB_ITEM));

	public static final RegistryObject<Item> JET_COMBAT_GASHAT = ITEMS.register("jet_combat_gashat",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"combat_gamer","ex_aid","gamer_driver_mighty_action_x",
					new MobEffectInstance(Effect_core.BOOST.get(), 40, 1,true,false)).AddCompatibilityList(BaseGamerDriverUsers).ChangeSlot(2).AddToTabList(RiderTabs.EX_AID_TAB_ITEM));

	public static final RegistryObject<Item> GIRI_GIRI_CHAMBARA_GASHAT = ITEMS.register("giri_giri_chambara_gashat",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"chambara_gamer","lazer","gamer_driver_doremifa",
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 1,true,false),
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 1,true,false)).ChangeSlot(2).AddToTabList(RiderTabs.EX_AID_TAB_ITEM));

	public static final RegistryObject<Item> SHAKARIKI_SPORTS_GASHAT = ITEMS.register("shakariki_sports_gashat",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"sports_gamer","ex_aid","gamer_driver_mighty_action_x",
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 1,true,false),
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 1,true,false)).AddCompatibilityList(BaseGamerDriverUsers).ChangeSlot(2).AddToTabList(RiderTabs.EX_AID_TAB_ITEM));


	public static final RegistryObject<Item> DRAGO_KNIGHT_HUNTER_Z_GASHAT_CLAW = ITEMS.register("gekitotsu_robots_gashat_claw",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"hunter_gamer_claw","lazer","gamer_driver_mighty_action_x",
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 1,true,false)).ChangeSlot(2));

	public static final RegistryObject<Item> DRAGO_KNIGHT_HUNTER_Z_GASHAT_GUN = ITEMS.register("gekitotsu_robots_gashat_gun",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"hunter_gamer_gun","snipe","gamer_driver_mighty_action_x",
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 1,true,false)).addAlternative(DRAGO_KNIGHT_HUNTER_Z_GASHAT_CLAW.get()).ChangeSlot(2));

	public static final RegistryObject<Item> DRAGO_KNIGHT_HUNTER_Z_GASHAT_BLADE = ITEMS.register("gekitotsu_robots_gashat_blade",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"hunter_gamer_blade","brave","gamer_driver_mighty_action_x",
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 1,true,false)).addAlternative(DRAGO_KNIGHT_HUNTER_Z_GASHAT_GUN.get()).ChangeSlot(2));

	public static final RegistryObject<Item> DRAGO_KNIGHT_HUNTER_Z_GASHAT_FANG = ITEMS.register("gekitotsu_robots_gashat_fang",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"hunter_gamer_fang","ex_aid","gamer_driver_mighty_action_x",
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 1,true,false)).addAlternative(DRAGO_KNIGHT_HUNTER_Z_GASHAT_BLADE.get()).ChangeSlot(2));

	public static final RegistryObject<Item> DRAGO_KNIGHT_HUNTER_Z_GASHAT = ITEMS.register("drago_knight_hunter_z_gashat",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"hunter_gamer","ex_aid","gamer_driver_mighty_action_x",
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 1,true,false),
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 1,true,false)).addShiftForm(DRAGO_KNIGHT_HUNTER_Z_GASHAT_FANG.get()).AddCompatibilityList(BaseGamerDriverUsers).ChangeSlot(2).AddToTabList(RiderTabs.EX_AID_TAB_ITEM));


	public static final RegistryObject<Item> PROTO_MIGHTY_ACTION_X_GASHAT_LV_1 = ITEMS.register("proto_mighty_action_x_gashat_lv_1",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_lv1","genm","gamer_driver_proto_mighty_action_x_lv_1",
					new MobEffectInstance(MobEffects.JUMP, 40, 2,true,false)).ChangeModel("geo/lv_1.geo.json").ChangeBeltModel("geo/lv_1_belt.geo.json").alsoChange2ndSlot(Modded_item_core.BLANK_FORM.get()));

	public static final RegistryObject<Item> PROTO_MIGHTY_ACTION_X_GASHAT = ITEMS.register("proto_mighty_action_x_gashat",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"","genm","gamer_driver_proto_mighty_action_x",
					new MobEffectInstance(MobEffects.JUMP, 40, 2,true,false)).addSwitchForm(PROTO_MIGHTY_ACTION_X_GASHAT_LV_1.get()).alsoChange2ndSlot(Modded_item_core.BLANK_FORM.get()).AddToTabList(RiderTabs.EX_AID_TAB_ITEM));

	public static final RegistryObject<Item> PROTO_TADDLE_QUEST_GASHAT_LV_1 = ITEMS.register("proto_taddle_quest_gashat_lv_1",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_lv1","proto_brave","gamer_driver_proto_taddle_quest_lv_1",
					new MobEffectInstance(MobEffects.JUMP, 40, 2,true,false)).ChangeModel("geo/lv_1.geo.json").ChangeBeltModel("geo/lv_1_belt.geo.json").alsoChange2ndSlot(Modded_item_core.BLANK_FORM.get()));

	public static final RegistryObject<Item> PROTO_TADDLE_QUEST_X_GASHAT = ITEMS.register("proto_taddle_quest_gashat",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"","proto_brave","gamer_driver_proto_taddle_quest",
					new MobEffectInstance(MobEffects.JUMP, 40, 2,true,false)).addSwitchForm(PROTO_TADDLE_QUEST_GASHAT_LV_1.get()).alsoChange2ndSlot(Modded_item_core.BLANK_FORM.get()).AddToTabList(RiderTabs.EX_AID_TAB_ITEM));

	public static final RegistryObject<Item> PROTO_BANG_BANG_SHOOTING_GASHAT_LV_1 = ITEMS.register("proto_bang_bang_shooting_gashat_lv_1",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_lv1","proto_snipe","gamer_driver_proto_bang_bang_shooting_lv_1",
					new MobEffectInstance(MobEffects.JUMP, 40, 2,true,false)).ChangeModel("geo/lv_1.geo.json").ChangeBeltModel("geo/lv_1_belt.geo.json").alsoChange2ndSlot(Modded_item_core.BLANK_FORM.get()));

	public static final RegistryObject<Item> PROTO_BANG_BANG_SHOOTING_GASHAT = ITEMS.register("proto_bang_bang_shooting_gashat",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"","proto_snipe","gamer_driver_proto_bang_bang_shooting",
					new MobEffectInstance(MobEffects.JUMP, 40, 2,true,false)).addSwitchForm(PROTO_BANG_BANG_SHOOTING_GASHAT_LV_1.get()).alsoChange2ndSlot(Modded_item_core.BLANK_FORM.get()).AddToTabList(RiderTabs.EX_AID_TAB_ITEM));

	//proto_bakusou_bike_gashat

	public static final RegistryObject<Item> PROTO_GEKITOTSU_ROBOTS_GASHAT = ITEMS.register("proto_gekitotsu_robots_gashat",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"proto_robot_gamer","ex_aid","gamer_driver_mighty_action_x",
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 2,true,false)).AddCompatibilityList(BaseGamerDriverUsers).ChangeSlot(2).AddToTabList(RiderTabs.EX_AID_TAB_ITEM));

	public static final RegistryObject<Item> PROTO_DOREMIFA_BEAT_GASHAT = ITEMS.register("proto_doremifa_beat_gashat",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"proto_beat_gamer","ex_aid","gamer_driver_mighty_action_x",
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 1,true,false)).AddCompatibilityList(BaseGamerDriverUsers).ChangeSlot(2).AddToTabList(RiderTabs.EX_AID_TAB_ITEM));

	public static final RegistryObject<Item> PROTO_JET_COMBAT_GASHAT = ITEMS.register("proto_jet_combat_gashat",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"proto_combat_gamer","ex_aid","gamer_driver_mighty_action_x",
					new MobEffectInstance(Effect_core.BOOST.get(), 40, 1,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 1,true,false)).AddCompatibilityList(BaseGamerDriverUsers).ChangeSlot(2).AddToTabList(RiderTabs.EX_AID_TAB_ITEM));

	public static final RegistryObject<Item> PROTO_GIRI_GIRI_CHAMBARA_GASHAT = ITEMS.register("proto_giri_giri_chambara_gashat",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"proto_chambara_gamer","lazer","gamer_driver_doremifa",
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 2,true,false),
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 1,true,false)).ChangeSlot(2).AddToTabList(RiderTabs.EX_AID_TAB_ITEM));

	public static final RegistryObject<Item> PROTO_SHAKARIKI_SPORTS_GASHAT = ITEMS.register("proto_shakariki_sports_gashat",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"proto_sports_gamer","ex_aid","gamer_driver_mighty_action_x",
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 1,true,false),
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 1,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 1,true,false)).AddCompatibilityList(BaseGamerDriverUsers).ChangeSlot(2).AddToTabList(RiderTabs.EX_AID_TAB_ITEM));

	public static final RegistryObject<Item> PROTO_DRAGO_KNIGHT_HUNTER_Z_GASHAT_CLAW = ITEMS.register("proto_gekitotsu_robots_gashat_claw",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"proto_hunter_gamer_claw","lazer","gamer_driver_mighty_action_x",
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 2,true,false),
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 2,true,false)).ChangeSlot(2));

	public static final RegistryObject<Item> PROTO_DRAGO_KNIGHT_HUNTER_Z_GASHAT_GUN = ITEMS.register("proto_gekitotsu_robots_gashat_gun",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"proto_hunter_gamer_gun","snipe","gamer_driver_mighty_action_x",
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 2,true,false),
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 2,true,false)).addAlternative(PROTO_DRAGO_KNIGHT_HUNTER_Z_GASHAT_CLAW.get()).ChangeSlot(2));

	public static final RegistryObject<Item> PROTO_DRAGO_KNIGHT_HUNTER_Z_GASHAT_BLADE = ITEMS.register("proto_gekitotsu_robots_gashat_blade",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"proto_hunter_gamer_blade","brave","gamer_driver_mighty_action_x",
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 2,true,false),
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 2,true,false)).addAlternative(PROTO_DRAGO_KNIGHT_HUNTER_Z_GASHAT_GUN.get()).ChangeSlot(2));

	public static final RegistryObject<Item> PROTO_DRAGO_KNIGHT_HUNTER_Z_GASHAT_FANG = ITEMS.register("proto_gekitotsu_robots_gashat_fang",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"proto_hunter_gamer_fang","ex_aid","gamer_driver_mighty_action_x",
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 2,true,false)).addAlternative(PROTO_DRAGO_KNIGHT_HUNTER_Z_GASHAT_BLADE.get()).ChangeSlot(2));

	public static final RegistryObject<Item> PROTO_DRAGO_KNIGHT_HUNTER_Z_GASHAT = ITEMS.register("proto_drago_knight_hunter_z_gashat",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"proto_hunter_gamer","ex_aid","gamer_driver_mighty_action_x",
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 1,true,false),
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 1,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 1,true,false)).addShiftForm(PROTO_DRAGO_KNIGHT_HUNTER_Z_GASHAT_FANG.get()).AddCompatibilityList(BaseGamerDriverUsers).ChangeSlot(2).AddToTabList(RiderTabs.EX_AID_TAB_ITEM));

	public static final RegistryObject<Item> PROTO_MIGHTY_ACTION_X_GASHAT_ORIGIN = ITEMS.register("proto_mighty_action_x_gashat_origin",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_lv0","genm","gamer_driver_proto_mighty_action_x_origin",
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 1,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 0,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 1,true,false)).addSwitchForm(PROTO_MIGHTY_ACTION_X_GASHAT_LV_1.get()).alsoChange2ndSlot(Modded_item_core.BLANK_FORM.get()).AddToTabList(RiderTabs.EX_AID_TAB_ITEM));

	public static final RegistryObject<Item> PROTO_BAKUSOU_BIKE_COMBI_FUKKATSU_GASHAT = ITEMS.register("proto_bakusou_bike_combi_fukkatsu_gashat",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_lv0","ex_aid","gamer_driver_proto_bakusou_bike_combi_fukkatsu",
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 1,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 0,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 1,true,false)).alsoChange2ndSlot(Modded_item_core.BLANK_FORM.get()).AddToTabList(RiderTabs.EX_AID_TAB_ITEM));

	public static final RegistryObject<Item> DANGEROUS_ZOBIE_GASHAT= ITEMS.register("dangerous_zombie_gashat",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_lvx","genm","gamer_driver_dangerous_zombie_gashat",
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 1,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 1,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 1,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 2,true,false),
					new MobEffectInstance(MobEffects.REGENERATION, 40, 3,true,false)).addNeedForm(PROTO_MIGHTY_ACTION_X_GASHAT_ORIGIN.get(),1).alsoChange2ndSlot(Modded_item_core.BLANK_FORM.get()).AddToTabList(RiderTabs.EX_AID_TAB_ITEM));

	public static final RegistryObject<Item> KAMEN_RIDER_CHRONICLE_GASHAT= ITEMS.register("kamen_rider_chronicle_gashat",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_cronus","snipe","gamer_driver_chronicle_gashat",
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 4,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 3,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 3,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 3,true,false),
					new MobEffectInstance(MobEffects.JUMP, 40, 3,true,false)).AddCompatibilityList(new String[] {"cronus"}).alsoChange2ndSlot(Modded_item_core.BLANK_FORM.get()).AddToTabList(RiderTabs.EX_AID_TAB_ITEM));

	public static final RegistryObject<Item> TOKI_MEKI_CRISIS_GASHAT_RED_EYES= ITEMS.register("toki_meki_crisis_gashat_red_eyes",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_red","poppy","gashacon_bugvisor_ii",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 3,true,false),
					new MobEffectInstance(MobEffects.JUMP, 40, 2,true,false)));

	public static final RegistryObject<Item> TOKI_MEKI_CRISIS_GASHAT= ITEMS.register("toki_meki_crisis_gashat",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"","poppy","gashacon_bugvisor_ii",
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 1,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 1,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 1,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 1,true,false),
					new MobEffectInstance(MobEffects.JUMP, 40, 2,true,false)).addSwitchForm(TOKI_MEKI_CRISIS_GASHAT_RED_EYES.get()).AddToTabList(RiderTabs.EX_AID_TAB_ITEM));

	public static final RegistryObject<Item> MIGHTY_CREATOR_VRX_GASHAT = ITEMS.register("mighty_creator_vrx_gashat",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_creator","ex_aid","gamer_driver_mighty_creator_vrx",
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 4,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 4,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 3,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 2,true,false),
					new MobEffectInstance(MobEffects.NIGHT_VISION, 40, 2,true,false)).alsoChange2ndSlot(Modded_item_core.BLANK_FORM.get()).AddToTabList(RiderTabs.EX_AID_TAB_ITEM));

	/**
	mighty_novel_x_gashat
	ju_ju_burger_gashat
	night_of_safari_gashat

	taddle_legacy_gashat
	hurricane_ninja_gashat
	bang_bang_tank_gashat

	mighty_brothers_xx_gashat
	doctor_mighty_xx_gashat
	knock_out_fighter_2_gashat

	maximum_mighty_x_gashat
	god_maximum_mighty_x_gashat

	hyper_muteki_gashat
	gamedeus_hyper_muteki_gashat

	taddle_fantasy_gashat
	bang_bang_simulation_gashat
	perfect_puzzle_gashat
	knock_out_fighter_gashat
	gashat_gear_dual_another

	genm_musou_gashat

	pac_adventure_gashat
	famitsa_gashat
	xevious_gashat
	galaxian_gashat
	taiko_no_tatsujin_gashat
	ganbarizing_gashat

	poppy_doremifa_beat_gashat

	kamen_rider_build_gashat
	kaigan_ghost_gashat
	full_throttle_drive_gashat
	toukenden_gaim_gashat
	magic_the_wizard_gashat
	space_galaxy_fourze_gashat
	jungle_ooo_gashat
	detective_double_gashat
	barcode_warrior_decade_gashat
	dokidoki_makai_castle_kiva_gashat
	time_express_den_o_gashat
	insect_wars_kabuto_gashat
	taiko_master_hibik_gashat
	king_of_poker_blade_gashat
	moshi_moshi_faiz_gashat
	mirror_labryinth_ryuki_gashat
	agito_of_the_sun_gashat
	adventure_guy_kuuga_gashat
	lets_go_ichigou_gashat
	 **/

	public static final RegistryObject<Item> EX_AIDHELMET = ITEMS.register("ex_aidhead",
			() -> new RiderArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.HELMET, new Item.Properties()).AddToTabList(RiderTabs.EX_AID_TAB_ITEM).ChangeRepairItem(BLANK_GASHAT.get()));
	public static final RegistryObject<Item> EX_AIDCHESTPLATE = ITEMS.register("ex_aidtroso",
			() -> new RiderArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.CHESTPLATE, new Item.Properties()).AddToTabList(RiderTabs.EX_AID_TAB_ITEM).ChangeRepairItem(BLANK_GASHAT.get()));
	public static final RegistryObject<Item> EX_AIDLEGGINGS = ITEMS.register("ex_aidlegs",
			() -> new RiderArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.LEGGINGS, new Item.Properties()).AddToTabList(RiderTabs.EX_AID_TAB_ITEM).ChangeRepairItem(BLANK_GASHAT.get()));

	public static final RegistryObject<Item> GAMER_DRIVER_EX_AID = ITEMS.register("gamer_driver_ex_aid",
			() -> new GamerDriverItem(ArmorMaterials.DIAMOND,"ex_aid",MIGHTY_ACTION_X_GASHAT ,EX_AIDHELMET, EX_AIDCHESTPLATE,EX_AIDLEGGINGS , new Item.Properties())
			.AddToTabList(RiderTabs.EX_AID_TAB_ITEM).ChangeRepairItem(BLANK_GASHAT.get()));

	public static final RegistryObject<Item> GAMER_DRIVER_BRAVE = ITEMS.register("gamer_driver_brave",
			() -> new GamerDriverItem(ArmorMaterials.DIAMOND,"brave",TADDLE_QUEST_X_GASHAT ,EX_AIDHELMET, EX_AIDCHESTPLATE,EX_AIDLEGGINGS , new Item.Properties())
			.AddToTabList(RiderTabs.EX_AID_TAB_ITEM).ChangeRepairItem(BLANK_GASHAT.get()));

	public static final RegistryObject<Item> GAMER_DRIVER_SNIPE = ITEMS.register("gamer_driver_snipe",
			() -> new GamerDriverItem(ArmorMaterials.DIAMOND,"snipe",BANG_BANG_SHOOTING_GASHAT ,EX_AIDHELMET, EX_AIDCHESTPLATE,EX_AIDLEGGINGS , new Item.Properties())
			.AddToTabList(RiderTabs.EX_AID_TAB_ITEM).ChangeRepairItem(BLANK_GASHAT.get()));

	public static final RegistryObject<Item> GAMER_DRIVER_GENM = ITEMS.register("gamer_driver_genm",
			() -> new GamerDriverItem(ArmorMaterials.DIAMOND,"genm",PROTO_MIGHTY_ACTION_X_GASHAT ,EX_AIDHELMET, EX_AIDCHESTPLATE,EX_AIDLEGGINGS , new Item.Properties())
			.AddToTabList(RiderTabs.EX_AID_TAB_ITEM).ChangeRepairItem(BLANK_GASHAT.get()));



	public static final RegistryObject<Item> GAMER_DRIVER_PROTO_BRAVE = ITEMS.register("gamer_driver_proto_brave",
			() -> new GamerDriverItem(ArmorMaterials.DIAMOND,"proto_brave",PROTO_TADDLE_QUEST_X_GASHAT ,EX_AIDHELMET, EX_AIDCHESTPLATE,EX_AIDLEGGINGS , new Item.Properties())
			.AddToTabList(RiderTabs.EX_AID_TAB_ITEM).ChangeRepairItem(BLANK_GASHAT.get()));

	public static final RegistryObject<Item> GAMER_DRIVER_PROTO_SNIPE = ITEMS.register("gamer_driver_proto_snipe",
			() -> new GamerDriverItem(ArmorMaterials.DIAMOND,"proto_snipe",PROTO_BANG_BANG_SHOOTING_GASHAT ,EX_AIDHELMET, EX_AIDCHESTPLATE,EX_AIDLEGGINGS , new Item.Properties())
			.AddToTabList(RiderTabs.EX_AID_TAB_ITEM).ChangeRepairItem(BLANK_GASHAT.get()));


	public static final RegistryObject<Item> GASHACON_BUGVISOR_GENM = ITEMS.register("gashacon_bugvisor_genmu",
			() -> new GamerDriverItem(ArmorMaterials.DIAMOND,"genm_bugvisor",DANGEROUS_ZOBIE_GASHAT ,EX_AIDHELMET, EX_AIDCHESTPLATE,EX_AIDLEGGINGS , new Item.Properties())
			.Override_belt_text("gashacon_bugvisor").AddToTabList(RiderTabs.EX_AID_TAB_ITEM).ChangeRepairItem(BLANK_GASHAT.get()));

	public static final RegistryObject<Item> GASHACON_BUGVISOR_II_CHRONOS = ITEMS.register("gashacon_bugvisor_ii_chronos",
			() -> new GamerDriverItem(ArmorMaterials.DIAMOND,"chronos",KAMEN_RIDER_CHRONICLE_GASHAT ,EX_AIDHELMET, EX_AIDCHESTPLATE,EX_AIDLEGGINGS , new Item.Properties())
			.Override_belt_text("gashacon_bugvisor_ii").AddToTabList(RiderTabs.EX_AID_TAB_ITEM).ChangeRepairItem(BLANK_GASHAT.get()));

	public static final RegistryObject<Item> GASHACON_BUGVISOR_II_POPPY = ITEMS.register("gashacon_bugvisor_ii_poppy",
			() -> new GamerDriverItem(ArmorMaterials.DIAMOND,"poppy",TOKI_MEKI_CRISIS_GASHAT ,EX_AIDHELMET, EX_AIDCHESTPLATE,EX_AIDLEGGINGS , new Item.Properties())
			.AddToTabList(RiderTabs.EX_AID_TAB_ITEM).ChangeRepairItem(BLANK_GASHAT.get()));


	public static final RegistryObject<Item> GASHACON_BUGVISOR_II_LAZER = ITEMS.register("gashacon_bugvisor_ii_lazer",
			() -> new GamerDriverItem(ArmorMaterials.DIAMOND,"lazer_lvx_",GIRI_GIRI_CHAMBARA_GASHAT ,EX_AIDHELMET, EX_AIDCHESTPLATE,EX_AIDLEGGINGS , new Item.Properties())
			.Override_belt_text("gashacon_bugvisor_ii").AddToTabList(RiderTabs.EX_AID_TAB_ITEM).ChangeRepairItem(BLANK_GASHAT.get()));


	public static void register(IEventBus eventBus) {
		ITEMS.register(eventBus);
	}

}