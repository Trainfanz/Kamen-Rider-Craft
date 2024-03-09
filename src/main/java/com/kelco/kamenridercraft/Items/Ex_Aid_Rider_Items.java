package com.kelco.kamenridercraft.Items;

import com.kelco.kamenridercraft.KamenRiderCraftCore;
import com.kelco.kamenridercraft.Blocks.MachineBlocks.GameCreator;
import com.kelco.kamenridercraft.Effect.Effect_core;
import com.kelco.kamenridercraft.Items.ex_aid.ExAidEnergyItem;
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

	

	public static final RegistryObject<Item> MIGHTY_ACTION_X_GASHAT_LV_1 = ITEMS.register("mighty_action_x_gashat_lv_1",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_lv1","ex_aid","gamer_driver_mighty_action_x_lv_1",
					new MobEffectInstance(MobEffects.JUMP, 40, 3,true,false)).ChangeModel("geo/lv_1.geo.json").ChangeBeltModel("geo/lv_1_belt.geo.json").alsoChange2ndSlot(Modded_item_core.BLANK_FORM.get()));

	public static final RegistryObject<Item> MIGHTY_ACTION_X_GASHAT = ITEMS.register("mighty_action_x_gashat",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"","ex_aid","gamer_driver_mighty_action_x",
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 0,true,false),
					new MobEffectInstance(MobEffects.JUMP, 40, 1,true,false)).addSwitchForm(MIGHTY_ACTION_X_GASHAT_LV_1.get()).alsoChange2ndSlot(Modded_item_core.BLANK_FORM.get()).AddToTabList(RiderTabs.EX_AID_TAB_ITEM).AddToTabList(GameCreator.BLANK_GASHAT, 20));

	public static final RegistryObject<Item> TADDLE_QUEST_GASHAT_LV_1 = ITEMS.register("taddle_quest_gashat_lv_1",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_lv1","brave","gamer_driver_taddle_quest_lv_1",
					new MobEffectInstance(MobEffects.JUMP, 40, 2,true,false)).ChangeModel("geo/lv_1.geo.json").ChangeBeltModel("geo/lv_1_belt.geo.json").alsoChange2ndSlot(Modded_item_core.BLANK_FORM.get()));

	public static final RegistryObject<Item> TADDLE_QUEST_X_GASHAT = ITEMS.register("taddle_quest_gashat",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"","brave","gamer_driver_taddle_quest",
					new MobEffectInstance(MobEffects.JUMP, 40, 2,true,false)).addSwitchForm(TADDLE_QUEST_GASHAT_LV_1.get()).alsoChange2ndSlot(Modded_item_core.BLANK_FORM.get()).AddToTabList(RiderTabs.EX_AID_TAB_ITEM).AddToTabList(GameCreator.BLANK_GASHAT, 15));

	public static final RegistryObject<Item> BANG_BANG_SHOOTING_GASHAT_LV_1 = ITEMS.register("bang_bang_shooting_gashat_lv_1",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_lv1","snipe","gamer_driver_bang_bang_shooting_lv_1",
					new MobEffectInstance(MobEffects.JUMP, 40, 2,true,false)).ChangeModel("geo/lv_1.geo.json").ChangeBeltModel("geo/lv_1_belt.geo.json").alsoChange2ndSlot(Modded_item_core.BLANK_FORM.get()));

	public static final RegistryObject<Item> BANG_BANG_SHOOTING_GASHAT = ITEMS.register("bang_bang_shooting_gashat",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"","snipe","gamer_driver_bang_bang_shooting",
					new MobEffectInstance(MobEffects.JUMP, 40, 2,true,false)).addSwitchForm(BANG_BANG_SHOOTING_GASHAT_LV_1.get()).alsoChange2ndSlot(Modded_item_core.BLANK_FORM.get()).AddToTabList(RiderTabs.EX_AID_TAB_ITEM).AddToTabList(GameCreator.BLANK_GASHAT, 15));

	public static final RegistryObject<Item> BAKUSOU_BIKE_GASHAT_LV_1 = ITEMS.register("bakusou_bike_gashat_lv_1",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_lv1","lazer","gamer_driver_bakusou_bike_lv_1",
					new MobEffectInstance(MobEffects.JUMP, 40, 2,true,false)).ChangeModel("geo/lv_1.geo.json").ChangeBeltModel("geo/lv_1_belt.geo.json").alsoChange2ndSlot(Modded_item_core.BLANK_FORM.get()));

	public static final RegistryObject<Item> BAKUSOU_BIKE_GASHAT_UNDER = ITEMS.register("bakusou_bike_gashat_under",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"","lazer","gamer_driver_bakusou_bike",
					new MobEffectInstance(MobEffects.JUMP, 40, 2,true,false)));
	
	public static final RegistryObject<Item> BAKUSOU_BIKE_GASHAT = ITEMS.register("bakusou_bike_gashat",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_lv2_bike","lazer","blank",
					new MobEffectInstance(MobEffects.JUMP, 40, 2,true,false)).addSwitchForm(BAKUSOU_BIKE_GASHAT_LV_1.get())
			.ChangeModel("geo/lazer_lv2.geo.json","lazer_lv2.animation.json").alsoChange2ndSlot(Modded_item_core.BLANK_FORM.get()).AddToTabList(RiderTabs.EX_AID_TAB_ITEM).AddToTabList(GameCreator.BLANK_GASHAT, 15));

	public static final RegistryObject<Item> BAKUSOU_BIKE_GASHAT_TURBO = ITEMS.register("bakusou_bike_gashat_turbo",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_turbo","lazer","gamer_driver_bakusou_bike",
					new MobEffectInstance(MobEffects.JUMP, 40, 2,true,false),
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 1,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 0,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 1,true,false)).addSwitchForm(BAKUSOU_BIKE_GASHAT_LV_1.get())
			.alsoChange2ndSlot(Modded_item_core.BLANK_FORM.get()).AddToTabList(RiderTabs.EX_AID_TAB_ITEM).AddToTabList(GameCreator.BLANK_GASHAT, 15));



	public static String[] BaseGamerDriverUsers = new String[] {"ex_aid","genm","brave","snipe"};


	public static final RegistryObject<Item> GEKITOTSU_ROBOTS_GASHAT = ITEMS.register("gekitotsu_robots_gashat",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"robot_gamer","ex_aid","gamer_driver_mighty_action_x",
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 1,true,false)).ResetFormToBase().AddCompatibilityList(BaseGamerDriverUsers).ChangeSlot(2).AddToTabList(RiderTabs.EX_AID_TAB_ITEM).AddToTabList(GameCreator.BLANK_GASHAT, 10));

	public static final RegistryObject<Item> DOREMIFA_BEAT_GASHAT = ITEMS.register("doremifa_beat_gashat",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"beat_gamer","ex_aid","gamer_driver_mighty_action_x",
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false)).ResetFormToBase().AddCompatibilityList(BaseGamerDriverUsers).ChangeSlot(2).AddToTabList(RiderTabs.EX_AID_TAB_ITEM).AddToTabList(GameCreator.BLANK_GASHAT, 10));

	public static final RegistryObject<Item> JET_COMBAT_GASHAT = ITEMS.register("jet_combat_gashat",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"combat_gamer","ex_aid","gamer_driver_mighty_action_x",
					new MobEffectInstance(Effect_core.BOOST.get(), 40, 1,true,false)).ResetFormToBase().AddCompatibilityList(BaseGamerDriverUsers).ChangeSlot(2).AddToTabList(RiderTabs.EX_AID_TAB_ITEM).AddToTabList(GameCreator.BLANK_GASHAT, 10));

	public static final RegistryObject<Item> GIRI_GIRI_CHAMBARA_GASHAT = ITEMS.register("giri_giri_chambara_gashat",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"chambara_gamer","lazer","gamer_driver_bakusou_bike",
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 1,true,false),
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 1,true,false)).ChangeSlot(2)
			.alsoChange1stSlot(BAKUSOU_BIKE_GASHAT_UNDER.get()).AddToTabList(RiderTabs.EX_AID_TAB_ITEM).AddToTabList(GameCreator.BLANK_GASHAT, 10));

	public static final RegistryObject<Item> SHAKARIKI_SPORTS_GASHAT = ITEMS.register("shakariki_sports_gashat",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"sports_gamer","ex_aid","gamer_driver_mighty_action_x",
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 1,true,false),
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 1,true,false)).ResetFormToBase().AddCompatibilityList(BaseGamerDriverUsers).ChangeSlot(2).AddToTabList(RiderTabs.EX_AID_TAB_ITEM).AddToTabList(GameCreator.BLANK_GASHAT, 10));


	public static final RegistryObject<Item> DRAGO_KNIGHT_HUNTER_Z_GASHAT_CLAW = ITEMS.register("gekitotsu_robots_gashat_claw",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"hunter_gamer_claw","lazer","gamer_driver_mighty_action_x",
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 1,true,false)).alsoChange1stSlot(BAKUSOU_BIKE_GASHAT_UNDER.get()).ChangeSlot(2));

	public static final RegistryObject<Item> DRAGO_KNIGHT_HUNTER_Z_GASHAT_GUN = ITEMS.register("gekitotsu_robots_gashat_gun",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"hunter_gamer_gun","snipe","gamer_driver_mighty_action_x",
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 1,true,false)).ResetFormToBase().addAlternative(DRAGO_KNIGHT_HUNTER_Z_GASHAT_CLAW.get()).ChangeSlot(2));

	public static final RegistryObject<Item> DRAGO_KNIGHT_HUNTER_Z_GASHAT_BLADE = ITEMS.register("gekitotsu_robots_gashat_blade",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"hunter_gamer_blade","brave","gamer_driver_mighty_action_x",
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 1,true,false)).ResetFormToBase().addAlternative(DRAGO_KNIGHT_HUNTER_Z_GASHAT_GUN.get()).ChangeSlot(2));

	public static final RegistryObject<Item> DRAGO_KNIGHT_HUNTER_Z_GASHAT_FANG = ITEMS.register("gekitotsu_robots_gashat_fang",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"hunter_gamer_fang","ex_aid","gamer_driver_mighty_action_x",
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 1,true,false)).ResetFormToBase().addAlternative(DRAGO_KNIGHT_HUNTER_Z_GASHAT_BLADE.get()).ChangeSlot(2));

	public static final RegistryObject<Item> DRAGO_KNIGHT_HUNTER_Z_GASHAT = ITEMS.register("drago_knight_hunter_z_gashat",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"hunter_gamer","ex_aid","gamer_driver_mighty_action_x",
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 1,true,false),
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 1,true,false)).ResetFormToBase().addShiftForm(DRAGO_KNIGHT_HUNTER_Z_GASHAT_FANG.get())
			.AddCompatibilityList(BaseGamerDriverUsers).ChangeSlot(2).AddToTabList(RiderTabs.EX_AID_TAB_ITEM).AddToTabList(GameCreator.BLANK_GASHAT, 5));


	public static final RegistryObject<Item> PROTO_MIGHTY_ACTION_X_GASHAT_LV_1 = ITEMS.register("proto_mighty_action_x_gashat_lv_1",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_lv1","genm","gamer_driver_proto_mighty_action_x_lv_1",
					new MobEffectInstance(MobEffects.JUMP, 40, 2,true,false)).ChangeModel("geo/lv_1.geo.json").ChangeBeltModel("geo/lv_1_belt.geo.json").alsoChange2ndSlot(Modded_item_core.BLANK_FORM.get()));

	public static final RegistryObject<Item> PROTO_MIGHTY_ACTION_X_GASHAT = ITEMS.register("proto_mighty_action_x_gashat",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"","genm","gamer_driver_proto_mighty_action_x",
					new MobEffectInstance(MobEffects.JUMP, 40, 2,true,false)).addSwitchForm(PROTO_MIGHTY_ACTION_X_GASHAT_LV_1.get()).alsoChange2ndSlot(Modded_item_core.BLANK_FORM.get()).AddToTabList(RiderTabs.EX_AID_TAB_ITEM));

	public static final RegistryObject<Item> PROTO_TADDLE_QUEST_GASHAT_LV_1 = ITEMS.register("proto_taddle_quest_gashat_lv_1",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_proto_brave_lv1","brave","gamer_driver_proto_bang_bang_shooting_lv_1",
					new MobEffectInstance(MobEffects.JUMP, 40, 2,true,false)).ChangeModel("geo/lv_1.geo.json").ChangeBeltModel("geo/lv_1_belt.geo.json").alsoChange2ndSlot(Modded_item_core.BLANK_FORM.get()));

	public static final RegistryObject<Item> PROTO_TADDLE_QUEST_X_GASHAT = ITEMS.register("proto_taddle_quest_gashat",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_proto_brave","brave","gamer_driver_proto_taddle_quest",
					new MobEffectInstance(MobEffects.JUMP, 40, 2,true,false)).addSwitchForm(PROTO_TADDLE_QUEST_GASHAT_LV_1.get()).alsoChange2ndSlot(Modded_item_core.BLANK_FORM.get()).AddToTabList(RiderTabs.EX_AID_TAB_ITEM));

	public static final RegistryObject<Item> PROTO_BANG_BANG_SHOOTING_GASHAT_LV_1 = ITEMS.register("proto_bang_bang_shooting_gashat_lv_1",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_proto_snipe_lv1","snipe","gamer_driver_proto_bang_bang_shooting_lv_1",
					new MobEffectInstance(MobEffects.JUMP, 40, 2,true,false)).ChangeModel("geo/lv_1.geo.json").ChangeBeltModel("geo/lv_1_belt.geo.json").alsoChange2ndSlot(Modded_item_core.BLANK_FORM.get()));

	public static final RegistryObject<Item> PROTO_BANG_BANG_SHOOTING_GASHAT = ITEMS.register("proto_bang_bang_shooting_gashat",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_proto_snipe","snipe","gamer_driver_proto_bang_bang_shooting",
					new MobEffectInstance(MobEffects.JUMP, 40, 2,true,false)).addSwitchForm(PROTO_BANG_BANG_SHOOTING_GASHAT_LV_1.get()).alsoChange2ndSlot(Modded_item_core.BLANK_FORM.get())
			.AddToTabList(RiderTabs.EX_AID_TAB_ITEM));

	
	public static final RegistryObject<Item> PROTO_BAKUSOU_BIKE_GASHAT_LV_1 = ITEMS.register("proto_bakusou_bike_gashat",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_proto_lazer_lv1","lazer","gamer_driver_proto_bakusou_bike_lv_1",
					new MobEffectInstance(MobEffects.JUMP, 40, 2,true,false)).ChangeModel("geo/lv_1.geo.json").ChangeBeltModel("geo/lv_1_belt.geo.json")
			.alsoChange2ndSlot(Modded_item_core.BLANK_FORM.get()).AddToTabList(RiderTabs.EX_AID_TAB_ITEM));


	public static final RegistryObject<Item> PROTO_GEKITOTSU_ROBOTS_GASHAT = ITEMS.register("proto_gekitotsu_robots_gashat",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"proto_robot_gamer","ex_aid","gamer_driver_mighty_action_x",
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 2,true,false)).ResetFormToBase().AddCompatibilityList(BaseGamerDriverUsers)
			.ChangeSlot(2).AddToTabList(RiderTabs.EX_AID_TAB_ITEM));

	public static final RegistryObject<Item> PROTO_DOREMIFA_BEAT_GASHAT = ITEMS.register("proto_doremifa_beat_gashat",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"proto_beat_gamer","ex_aid","gamer_driver_mighty_action_x",
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 1,true,false)).ResetFormToBase().AddCompatibilityList(BaseGamerDriverUsers)
			.ChangeSlot(2).AddToTabList(RiderTabs.EX_AID_TAB_ITEM));

	
	public static final RegistryObject<Item> PROTO_JET_COMBAT_GASHAT_LAZER = ITEMS.register("proto_jet_combat_gashat_lazer",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"proto_combat_gamer","lazer","gamer_driver_mighty_action_x",
					new MobEffectInstance(Effect_core.BOOST.get(), 40, 1,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 1,true,false)).addNeedForm(BAKUSOU_BIKE_GASHAT_TURBO.get(), 1).ChangeSlot(2));

	public static final RegistryObject<Item> PROTO_JET_COMBAT_GASHAT = ITEMS.register("proto_jet_combat_gashat",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"proto_combat_gamer","ex_aid","gamer_driver_mighty_action_x",
					new MobEffectInstance(Effect_core.BOOST.get(), 40, 1,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 1,true,false))
			.addAlternative(PROTO_JET_COMBAT_GASHAT_LAZER.get()).ResetFormToBase().AddCompatibilityList(BaseGamerDriverUsers).ChangeSlot(2).AddToTabList(RiderTabs.EX_AID_TAB_ITEM));

	public static final RegistryObject<Item> PROTO_GIRI_GIRI_CHAMBARA_GASHAT = ITEMS.register("proto_giri_giri_chambara_gashat",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"proto_chambara_gamer","lazer","gamer_driver_bakusou_bike",
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 2,true,false),
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 1,true,false)).ChangeSlot(2)
			.alsoChange1stSlot(BAKUSOU_BIKE_GASHAT_UNDER.get()).AddToTabList(RiderTabs.EX_AID_TAB_ITEM));

	
	public static final RegistryObject<Item> PROTO_SHAKARIKI_SPORTS_GASHAT_LAZER = ITEMS.register("proto_shakariki_sports_gashat_lazer",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"proto_sports_gamer","lazer","gamer_driver_mighty_action_x",
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 1,true,false),
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 1,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 1,true,false))
			.addNeedForm(BAKUSOU_BIKE_GASHAT_TURBO.get(), 1).ChangeSlot(2));


	public static final RegistryObject<Item> PROTO_SHAKARIKI_SPORTS_GASHAT = ITEMS.register("proto_shakariki_sports_gashat",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"proto_sports_gamer","ex_aid","gamer_driver_mighty_action_x",
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 1,true,false),
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 1,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 1,true,false)).ResetFormToBase().AddCompatibilityList(BaseGamerDriverUsers)
			.addAlternative(PROTO_SHAKARIKI_SPORTS_GASHAT_LAZER.get()).ChangeSlot(2).AddToTabList(RiderTabs.EX_AID_TAB_ITEM));

	
	public static final RegistryObject<Item> PROTO_DRAGO_KNIGHT_HUNTER_Z_GASHAT_CLAW = ITEMS.register("proto_gekitotsu_robots_gashat_claw",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"proto_hunter_gamer_claw","lazer","gamer_driver_mighty_action_x",
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 2,true,false),
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 2,true,false)).ChangeSlot(2)
			.alsoChange1stSlot(BAKUSOU_BIKE_GASHAT_UNDER.get()));

	public static final RegistryObject<Item> PROTO_DRAGO_KNIGHT_HUNTER_Z_GASHAT_GUN = ITEMS.register("proto_gekitotsu_robots_gashat_gun",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"proto_hunter_gamer_gun","snipe","gamer_driver_mighty_action_x",
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 2,true,false),
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 2,true,false)).ResetFormToBase()
			.addAlternative(PROTO_DRAGO_KNIGHT_HUNTER_Z_GASHAT_CLAW.get()).ChangeSlot(2));

	public static final RegistryObject<Item> PROTO_DRAGO_KNIGHT_HUNTER_Z_GASHAT_BLADE = ITEMS.register("proto_gekitotsu_robots_gashat_blade",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"proto_hunter_gamer_blade","brave","gamer_driver_mighty_action_x",
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 2,true,false),
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 2,true,false)).ResetFormToBase()
			.addAlternative(PROTO_DRAGO_KNIGHT_HUNTER_Z_GASHAT_GUN.get()).ChangeSlot(2));

	public static final RegistryObject<Item> PROTO_DRAGO_KNIGHT_HUNTER_Z_GASHAT_FANG = ITEMS.register("proto_gekitotsu_robots_gashat_fang",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"proto_hunter_gamer_fang","ex_aid","gamer_driver_mighty_action_x",
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 2,true,false)).ResetFormToBase()
			.addAlternative(PROTO_DRAGO_KNIGHT_HUNTER_Z_GASHAT_BLADE.get()).ChangeSlot(2));

	public static final RegistryObject<Item> PROTO_DRAGO_KNIGHT_HUNTER_Z_GASHAT = ITEMS.register("proto_drago_knight_hunter_z_gashat",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"proto_hunter_gamer","ex_aid","gamer_driver_mighty_action_x",
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 1,true,false),
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 1,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 1,true,false)).ResetFormToBase()
			.addShiftForm(PROTO_DRAGO_KNIGHT_HUNTER_Z_GASHAT_FANG.get()).AddCompatibilityList(BaseGamerDriverUsers).ChangeSlot(2).AddToTabList(RiderTabs.EX_AID_TAB_ITEM));

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
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 1,true,false)).ResetFormToBase()
			.alsoChange2ndSlot(Modded_item_core.BLANK_FORM.get()).AddToTabList(RiderTabs.EX_AID_TAB_ITEM));


	public static final RegistryObject<Item> DANGEROUS_ZOBIE_GASHAT_BD= ITEMS.register("dangerous_zombie_gashat_bd",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_lvx","genm_bugvisor","gamer_driver_dangerous_zombie",
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 1,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 1,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 1,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 2,true,false),
					new MobEffectInstance(MobEffects.REGENERATION, 40, 3,true,false)).alsoChange2ndSlot(Modded_item_core.BLANK_FORM.get()));

	
	public static final RegistryObject<Item> DANGEROUS_ZOBIE_GASHAT= ITEMS.register("dangerous_zombie_gashat",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_lvx","genm","gamer_driver_dangerous_zombie",
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 1,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 1,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 1,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 2,true,false),
					new MobEffectInstance(MobEffects.REGENERATION, 40, 3,true,false)).addAlternative(DANGEROUS_ZOBIE_GASHAT_BD.get())
			.addNeedForm(PROTO_MIGHTY_ACTION_X_GASHAT_ORIGIN.get(),1).alsoChange2ndSlot(Modded_item_core.BLANK_FORM.get()).AddToTabList(RiderTabs.EX_AID_TAB_ITEM));

	public static final RegistryObject<Item> UNFINISHED_KAMEN_RIDER_CHRONICLE_GASHAT = ITEMS.register("unfinished_kamen_rider_chronicle_gashat",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"","ride_player","ride_player_belt",
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 0,true,false),
					new MobEffectInstance(MobEffects.JUMP, 40, 1,true,false)).alsoChange2ndSlot(Modded_item_core.BLANK_FORM.get()).AddToTabList(RiderTabs.EX_AID_TAB_ITEM));

	
	public static final RegistryObject<Item> KAMEN_RIDER_CHRONICLE_GASHAT= ITEMS.register("kamen_rider_chronicle_gashat",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_cronus","snipe","gamer_driver_chronicle",
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 4,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 3,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 3,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 3,true,false),
					new MobEffectInstance(MobEffects.JUMP, 40, 3,true,false)).AddCompatibilityList(new String[] {"cronus"}).alsoChange2ndSlot(Modded_item_core.BLANK_FORM.get()).AddToTabList(RiderTabs.EX_AID_TAB_ITEM).AddToTabList(GameCreator.BLANK_CHRONICLE_GASHAT, 20));

	public static final RegistryObject<Item> TOKI_MEKI_CRISIS_GASHAT_RED_EYES= ITEMS.register("toki_meki_crisis_gashat_red_eyes",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_red","poppy","gashacon_bugvisor_ii_poppy",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 3,true,false),
					new MobEffectInstance(MobEffects.JUMP, 40, 2,true,false)));

	public static final RegistryObject<Item> TOKI_MEKI_CRISIS_GASHAT= ITEMS.register("toki_meki_crisis_gashat",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"","poppy","gashacon_bugvisor_ii_poppy",
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

	public static final RegistryObject<Item> MIGHTY_NOVEL_GASHAT = ITEMS.register("mighty_novel_x_gashat",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_novel","ex_aid","gamer_driver_mighty_novel_x",
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 4,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 4,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 3,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 2,true,false),
					new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 0,true,false)).alsoChange2ndSlot(Modded_item_core.BLANK_FORM.get()).AddToTabList(RiderTabs.EX_AID_TAB_ITEM));

	public static final RegistryObject<Item> JU_JU_BURGER_GASHAT = ITEMS.register("ju_ju_burger_gashat",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"burger_gamer","ex_aid","gamer_driver_mighty_action_x",
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 4,true,false)).ResetFormToBase().AddCompatibilityList(BaseGamerDriverUsers).ChangeSlot(2).AddToTabList(RiderTabs.EX_AID_TAB_ITEM).AddToTabList(GameCreator.BLANK_GASHAT, 5));

	public static final RegistryObject<Item> NIGHT_OF_SAFARI_GASHAT = ITEMS.register("night_of_safari_gashat",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"safari_gamer","ex_aid","gamer_driver_mighty_action_x",
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 1,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false)).ResetFormToBase().AddCompatibilityList(BaseGamerDriverUsers).ChangeSlot(2).AddToTabList(RiderTabs.EX_AID_TAB_ITEM).AddToTabList(GameCreator.BLANK_GASHAT, 5));
	
	public static final RegistryObject<Item> BANG_BANG_TANK_GASHAT = ITEMS.register("bang_bang_tank_gashat",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"tank_gamer","ex_aid","gamer_driver_mighty_action_x",
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 1,true,false)).ResetFormToBase().AddCompatibilityList(BaseGamerDriverUsers).ChangeSlot(2).AddToTabList(RiderTabs.EX_AID_TAB_ITEM).AddToTabList(GameCreator.BLANK_GASHAT, 5));

	public static final RegistryObject<Item> TADDLE_LEGACY_GASHAT = ITEMS.register("taddle_legacy_gashat",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"legacy_gamer","brave","gamer_driver_taddle_legacy",
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 5,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 4,true,false)).ResetFormToBase().ChangeSlot(2).AddToTabList(RiderTabs.EX_AID_TAB_ITEM).AddToTabList(GameCreator.BLANK_GASHAT, 5));
	
	public static final RegistryObject<Item> HURRICANE_NINJA_GASHAT = ITEMS.register("hurricane_ninja_gashat",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"","fuma","gamer_driver_hurricane_ninja",
					new MobEffectInstance(MobEffects.JUMP, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 3,true,false)).AddToTabList(RiderTabs.EX_AID_TAB_ITEM).AddToTabList(GameCreator.BLANK_GASHAT, 5));

	public static final RegistryObject<Item> PAC_ADVENTURE_GASHAT = ITEMS.register("pac_adventure_gashat",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"pac_gamer","ex_aid","gamer_driver_mighty_action_x",
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 2,true,false)).ResetFormToBase().AddCompatibilityList(BaseGamerDriverUsers).ChangeSlot(2).AddToTabList(RiderTabs.EX_AID_TAB_ITEM));
	
	public static final RegistryObject<Item> FAMITSA_GASHAT = ITEMS.register("famitsa_gashat",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"famista_gamer","ex_aid","gamer_driver_mighty_action_x",
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false)).ResetFormToBase().AddCompatibilityList(BaseGamerDriverUsers).ChangeSlot(2).AddToTabList(RiderTabs.EX_AID_TAB_ITEM));

	public static final RegistryObject<Item> XEVIOUS_GASHAT = ITEMS.register("xevious_gashat",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"xevious_gamer","ex_aid","gamer_driver_mighty_action_x",
					new MobEffectInstance(Effect_core.FLYING.get(), 40, 0,true,false)).ResetFormToBase().AddCompatibilityList(BaseGamerDriverUsers).ChangeSlot(2).AddToTabList(RiderTabs.EX_AID_TAB_ITEM));
	
	public static final RegistryObject<Item> GALAXIAN_GASHAT = ITEMS.register("galaxian_gashat",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"galaxian_gamer","ex_aid","gamer_driver_mighty_action_x",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 1,true,false)).ResetFormToBase().AddCompatibilityList(BaseGamerDriverUsers).ChangeSlot(2).AddToTabList(RiderTabs.EX_AID_TAB_ITEM));

	public static final RegistryObject<Item> TAIKO_NO_TATSUJIN_GASHAT = ITEMS.register("taiko_no_tatsujin_gashat",
			() -> new BaseItem(new Item.Properties()).AddToTabList(RiderTabs.EX_AID_TAB_ITEM));

	public static final RegistryObject<Item> GANBERIZING_GASHAT = ITEMS.register("ganbarizing_gashat",
			() -> new BaseItem(new Item.Properties()).AddToTabList(RiderTabs.EX_AID_TAB_ITEM));

	public static final RegistryObject<Item> POPPY_DOREMIFA_BEAT_GASHAT_GASHAT = ITEMS.register("poppy_doremifa_beat_gashat",
			() -> new BaseItem(new Item.Properties()).AddToTabList(RiderTabs.EX_AID_TAB_ITEM));

	public static final RegistryObject<Item> MIGHTY_BROTHERS_XX_UNFINISHED_GASHAT = ITEMS.register("mighty_brothers_xx_unfinished_gashat",
			() -> new BaseItem(new Item.Properties()).AddToTabList(RiderTabs.EX_AID_TAB_ITEM));

	
	public static final RegistryObject<Item>  MIGHTY_BROTHERS_XX_GASHAT_L = ITEMS.register("mighty_brothers_xx_gashat_l",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_lvxxl","ex_aid","gamer_driver_mighty_brothers_xx",
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 1,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 1,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 0,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 3,true,false)).alsoChange2ndSlot(Modded_item_core.BLANK_FORM.get()));
	
	public static final RegistryObject<Item>  MIGHTY_BROTHERS_XX_GASHAT_R = ITEMS.register("mighty_brothers_xx_gashat_r",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_lvxxr","ex_aid","gamer_driver_mighty_brothers_xx",
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 1,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 1,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 2,true,false),
					new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 0,true,false)).addSwitchForm(MIGHTY_BROTHERS_XX_GASHAT_L.get()).alsoChange2ndSlot(Modded_item_core.BLANK_FORM.get()));

	public static final RegistryObject<Item> MIGHTY_BROTHERS_XX_GASHAT = ITEMS.register("mighty_brothers_xx_gashat",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_lvx","ex_aid","gamer_driver_mighty_brothers_x",
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 1,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 1,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 2,true,false),
					new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 0,true,false)).ChangeModel("geo/lv_1.geo.json").ChangeBeltModel("geo/lv_1_belt.geo.json").addShiftForm(MIGHTY_BROTHERS_XX_GASHAT_R.get()).alsoChange2ndSlot(Modded_item_core.BLANK_FORM.get()).AddToTabList(RiderTabs.EX_AID_TAB_ITEM).AddToTabList(GameCreator.BLANK_DOUBLE_GASHAT, 20));

	public static final RegistryObject<Item> DOCTOR_MIGHTY_XX_GASHAT = ITEMS.register("doctor_mighty_xx_gashat",
			() -> new BaseItem(new Item.Properties()).AddToTabList(RiderTabs.EX_AID_TAB_ITEM).AddToTabList(GameCreator.BLANK_DOUBLE_GASHAT, 5));

	public static final RegistryObject<Item> KNOCK_OUT_FIGHTER_2_GASHAT = ITEMS.register("knock_out_fighter_2_gashat",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_lv39","ex_aid","gamer_driver_knock_out_fighter_2",
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 4,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 4,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 3,true,false),
					new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 0,true,false)).AddCompatibilityList(new String[] {"para_dx_lv99"}).alsoChange2ndSlot(Modded_item_core.BLANK_FORM.get()).AddToTabList(RiderTabs.EX_AID_TAB_ITEM).AddToTabList(GameCreator.BLANK_DOUBLE_GASHAT, 5));

	public static final RegistryObject<Item> TADDLE_FANTASY_GASHAT = ITEMS.register("taddle_fantasy_gashat",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"fantasy_gamer","brave","gamer_driver_taddle_fantasy",
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 1,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 3,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false)).ResetFormToBase().ChangeSlot(2).AddToTabList(RiderTabs.EX_AID_TAB_ITEM).AddToTabList(GameCreator.BLANK_DOUBLE_GASHAT, 15));
	
	public static final RegistryObject<Item> BANG_BANG_SIMULATION_GASHAT = ITEMS.register("bang_bang_simulation_gashat",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"simulation_gamer","snipe","gamer_driver_taddle_fantasy",
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 1,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 3,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false)).ResetFormToBase().ChangeSlot(2).AddToTabList(RiderTabs.EX_AID_TAB_ITEM).AddToTabList(GameCreator.BLANK_DOUBLE_GASHAT, 15));
	
	
	public static final RegistryObject<Item> GASHAT_GEAR_DUAL = ITEMS.register("gashat_gear_dual",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"","para_dx_lv99","gamer_driver_gashat_gear_dual",
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 3,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
					new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 0,true,false)).alsoChange2ndSlot(Modded_item_core.BLANK_FORM.get()));

	
	public static final RegistryObject<Item> PERFECT_PUZZLE_GASHAT = ITEMS.register("perfect_puzzle_gashat",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"","para_dx","paradoxbelt",
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 0,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 0,true,false),
					new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 0,true,false)).addAlternative(GASHAT_GEAR_DUAL.get()).alsoChange2ndSlot(Modded_item_core.BLANK_FORM.get()).AddToTabList(RiderTabs.EX_AID_TAB_ITEM).AddToTabList(GameCreator.BLANK_DOUBLE_GASHAT, 10));

	public static final RegistryObject<Item> KNOCK_OUT_FIGHTER_GASHAT = ITEMS.register("knock_out_fighter_gashat",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_fighter","para_dx","paradoxbelt",
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 0,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 0,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 3,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 1,true,false)).addAlternative(GASHAT_GEAR_DUAL.get()).alsoChange2ndSlot(Modded_item_core.BLANK_FORM.get()).AddToTabList(RiderTabs.EX_AID_TAB_ITEM).AddToTabList(GameCreator.BLANK_DOUBLE_GASHAT, 10));

	public static final RegistryObject<Item> GASHAT_GEAR_DUAL_ANOTHER = ITEMS.register("gashat_gear_dual_another",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"","another_para_dx","gamer_driver_gashat_gear_dual_another",
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 3,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
					new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 0,true,false)).alsoChange2ndSlot(Modded_item_core.BLANK_FORM.get()).AddToTabList(RiderTabs.EX_AID_TAB_ITEM).AddToTabList(GameCreator.BLANK_DOUBLE_GASHAT, 5));

	public static final RegistryObject<Item> GENM_MUSOU_GASHAT = ITEMS.register("genm_musou_gashat",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_musou","genm","gamer_driver_genm_musou",
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 4,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 4,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 5,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 6,true,false),
					new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 40, 0,true,false),
					new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 0,true,false),
					new MobEffectInstance(MobEffects.SATURATION, 40, 2,true,false),
					new MobEffectInstance(MobEffects.JUMP, 40, 3,true,false)).alsoChange2ndSlot(Modded_item_core.BLANK_FORM.get()).AddToTabList(RiderTabs.EX_AID_TAB_ITEM));

	public static final RegistryObject<Item> UNFINISHED_MAXIMUN_MIGHTY_X_GASHAT = ITEMS.register("unfinished_maximum_mighty_x_gashat",
			() -> new BaseItem(new Item.Properties()).AddToTabList(RiderTabs.EX_AID_TAB_ITEM));
	
	public static final RegistryObject<Item> MAXIMUN_MIGHTY_X_GASHAT_lv2 = ITEMS.register("mighty_action_x_gashat_lv2",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"","ex_aid","gamer_driver_maximum_mighty_x_lv2",
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 1,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 1,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 1,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 3,true,false)).alsoChange2ndSlot(Modded_item_core.BLANK_FORM.get()));

	
	public static final RegistryObject<Item> MAXIMUN_MIGHTY_X_GASHAT = ITEMS.register("maximum_mighty_x_gashat",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_lv99","ex_aid","gamer_driver_maximum_mighty_x",
					new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 40, 1,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 1,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 4,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 4,true,false)).addSwitchForm(MAXIMUN_MIGHTY_X_GASHAT_lv2.get())
			.ChangeModel("geo/lv_max.geo.json").ChangeBeltModel("geo/lv_1_belt.geo.json").alsoChange2ndSlot(Modded_item_core.BLANK_FORM.get()).AddToTabList(RiderTabs.EX_AID_TAB_ITEM).AddToTabList(GameCreator.BLANK_MAXIMUM_GASHAT, 20));

	
	public static final RegistryObject<Item> GOD_MAXIMUN_MIGHTY_X_GASHAT_lv0 = ITEMS.register("god_mighty_action_x_gashat_lv0",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_lv0","genm","gamer_driver_god_maximum_mighty_x_lv0",
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 3,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 4,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 3,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 4,true,false),
					new MobEffectInstance(MobEffects.JUMP, 40, 3,true,false),
					new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 1,true,false),
					new MobEffectInstance(MobEffects.REGENERATION, 40, 4,true,false),
					new MobEffectInstance(MobEffects.SATURATION, 40, 2,true,false)).alsoChange2ndSlot(Modded_item_core.BLANK_FORM.get()));

	
	public static final RegistryObject<Item> GOD_MAXIMUN_MIGHTY_X_GASHAT = ITEMS.register("god_maximum_mighty_x_gashat",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_lv_billion","genm","gamer_driver_god_maximum_mighty_x",
					new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 40, 1,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 1,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 6,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 4,true,false),
					new MobEffectInstance(MobEffects.JUMP, 40, 3,true,false),
					new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 1,true,false),
					new MobEffectInstance(MobEffects.REGENERATION, 40, 4,true,false),
					new MobEffectInstance(MobEffects.SATURATION, 40, 2,true,false)).addSwitchForm(MAXIMUN_MIGHTY_X_GASHAT_lv2.get())
			.ChangeModel("geo/lv_max.geo.json").ChangeBeltModel("geo/lv_1_belt.geo.json").alsoChange2ndSlot(Modded_item_core.BLANK_FORM.get()).AddToTabList(RiderTabs.EX_AID_TAB_ITEM).AddToTabList(GameCreator.BLANK_MAXIMUM_GASHAT, 5));

	public static final RegistryObject<Item> UNFINISHED_HYPER_MUTEKI_GASHAT= ITEMS.register("unfinished_hyper_muteki_gashat",
			() -> new BaseItem(new Item.Properties()).AddToTabList(RiderTabs.EX_AID_TAB_ITEM));

	public static final RegistryObject<Item> HYPER_MUTEKI_GASHAT = ITEMS.register("hyper_muteki_gashat",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_muteki","ex_aid","gamer_driver_hyper_muteki",
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 3,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 4,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 4,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 6,true,false),
					new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 40, 0,true,false),
					new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 0,true,false),
					new MobEffectInstance(MobEffects.SATURATION, 40, 2,true,false),
					new MobEffectInstance(MobEffects.JUMP, 40, 3,true,false)).addNeedForm(MAXIMUN_MIGHTY_X_GASHAT.get(), 1).alsoChange2ndSlot(Modded_item_core.BLANK_FORM.get()).AddToTabList(RiderTabs.EX_AID_TAB_ITEM).AddToTabList(GameCreator.BLANK_HYPER_GASHAT, 20));

	public static final RegistryObject<Item> GEMEDEUS_HYPER_MUTEKI_GASHAT = ITEMS.register("gamedeus_hyper_muteki_gashat",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"","gamedeus_muteki","gamer_driver_gamedeus_hyper_muteki",
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 3,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 4,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 4,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 6,true,false),
					new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 40, 0,true,false),
					new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 0,true,false),
					new MobEffectInstance(MobEffects.SATURATION, 40, 2,true,false),
					new MobEffectInstance(MobEffects.JUMP, 40, 3,true,false)).addNeedForm(MAXIMUN_MIGHTY_X_GASHAT.get(), 1).alsoChange2ndSlot(Modded_item_core.BLANK_FORM.get()).AddToTabList(RiderTabs.EX_AID_TAB_ITEM).AddToTabList(GameCreator.BLANK_HYPER_GASHAT, 5));

	//hyper_fumetsu_gashat Still needs .addNeedForm(MAXIMUN_MIGHTY_X_GASHAT.get(), 1)
	
	public static final RegistryObject<Item> HYPER_FUMESTU_GASHAT = ITEMS.register("hyper_fumetsu_gashat",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_hyper_fumetsu","genm","gamer_driver_hyper_fumetsu",
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 3,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 4,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 4,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 6,true,false),
					new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 40, 0,true,false),
					new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 0,true,false),
					new MobEffectInstance(MobEffects.SATURATION, 40, 2,true,false),
					new MobEffectInstance(MobEffects.JUMP, 40, 3,true,false)).alsoChange2ndSlot(Modded_item_core.BLANK_FORM.get()).AddToTabList(RiderTabs.EX_AID_TAB_ITEM).AddToTabList(GameCreator.BLANK_HYPER_GASHAT, 20));

	
	public static final RegistryObject<Item> THE_UNBEATABLE_GAME= ITEMS.register("the_unbeatable_game",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_totema","genm_bugvisor","gamer_driver_dangerous_zombie",
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 1,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 1,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 1,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 2,true,false),
					new MobEffectInstance(MobEffects.REGENERATION, 40, 3,true,false)).ChangeModel("geo/cyclonehopper_wingsarmor.geo.json").alsoChange2ndSlot(Modded_item_core.BLANK_FORM.get()).AddToTabList(RiderTabs.EX_AID_TAB_ITEM));

	
	public static final RegistryObject<Item> KAMEN_RIDER_BUILD_GASHAT = ITEMS.register("kamen_rider_build_gashat",
			() -> new BaseItem(new Item.Properties()).AddToTabList(RiderTabs.EX_AID_TAB_ITEM));

	public static final RegistryObject<Item> KAIGEN_GHOST_GASHAT_LV_1 = ITEMS.register("kaigan_ghost_gashat_lv_1",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_ghost_lv1","ex_aid","gamer_driver_kaigan_ghost_lv_1",
					new MobEffectInstance(MobEffects.JUMP, 40, 3,true,false)).ChangeModel("geo/lv_1.geo.json").ChangeBeltModel("geo/lv_1_belt.geo.json").alsoChange2ndSlot(Modded_item_core.BLANK_FORM.get()));

	public static final RegistryObject<Item> KAIGEN_GHOST_GASHAT = ITEMS.register("kaigan_ghost_gashat",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_ghost","ex_aid","gamer_driver_kaigan_ghost",
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 0,true,false),
					new MobEffectInstance(MobEffects.JUMP, 40, 1,true,false)).addSwitchForm(KAIGEN_GHOST_GASHAT_LV_1.get()).alsoChange2ndSlot(Modded_item_core.BLANK_FORM.get()).AddToTabList(RiderTabs.EX_AID_TAB_ITEM));

	public static final RegistryObject<Item> FULL_THROTTLE_DRIVE_GASHAT = ITEMS.register("full_throttle_drive_gashat",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_drive","ex_aid","gamer_driver_full_throttle_drive",
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 0,true,false),
					new MobEffectInstance(MobEffects.JUMP, 40, 1,true,false)).alsoChange2ndSlot(Modded_item_core.BLANK_FORM.get()).AddToTabList(RiderTabs.EX_AID_TAB_ITEM));

	public static final RegistryObject<Item> TOUKENDEN_GAIM_GASHAT = ITEMS.register("toukenden_gaim_gashat",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_gaim","ex_aid","gamer_driver_toukenden_gaim",
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 0,true,false),
					new MobEffectInstance(MobEffects.JUMP, 40, 1,true,false)).alsoChange2ndSlot(Modded_item_core.BLANK_FORM.get()).AddToTabList(RiderTabs.EX_AID_TAB_ITEM));

	public static final RegistryObject<Item> MAGIC_THE_WIZARD_GASHAT_LV_1 = ITEMS.register("magic_the_wizard_gashat_lv_1",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_wizard_lv1","genm","gamer_driver_magic_the_wizard_lv_1",
					new MobEffectInstance(MobEffects.JUMP, 40, 3,true,false)).ChangeModel("geo/lv_1.geo.json").ChangeBeltModel("geo/lv_1_belt.geo.json").alsoChange2ndSlot(Modded_item_core.BLANK_FORM.get()));

	public static final RegistryObject<Item> MAGIC_THE_WIZARD_GASHAT = ITEMS.register("magic_the_wizard_gashat",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_wizard","genm","gamer_driver_magic_the_wizard",
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 0,true,false),
					new MobEffectInstance(MobEffects.JUMP, 40, 1,true,false)).addSwitchForm(MAGIC_THE_WIZARD_GASHAT_LV_1.get()).alsoChange2ndSlot(Modded_item_core.BLANK_FORM.get()).AddToTabList(RiderTabs.EX_AID_TAB_ITEM));

	public static final RegistryObject<Item> SPACE_GALAXY_FOUZE_GASHAT = ITEMS.register("space_galaxy_fourze_gashat",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_fourze","genm","gamer_driver_space_galaxy_fourze",
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 0,true,false),
					new MobEffectInstance(MobEffects.JUMP, 40, 1,true,false)).alsoChange2ndSlot(Modded_item_core.BLANK_FORM.get()).AddToTabList(RiderTabs.EX_AID_TAB_ITEM));

	public static final RegistryObject<Item> JUNGLE_OOO_GASHAT = ITEMS.register("jungle_ooo_gashat",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_ooo","genm","gamer_driver_jungle_ooo",
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 0,true,false),
					new MobEffectInstance(MobEffects.JUMP, 40, 1,true,false)).alsoChange2ndSlot(Modded_item_core.BLANK_FORM.get()).AddToTabList(RiderTabs.EX_AID_TAB_ITEM));

	public static final RegistryObject<Item> DETECTICE_DOUBLE_GASHAT = ITEMS.register("detective_double_gashat",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_w","ex_aid","gamer_driver_detective_double",
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 0,true,false),
					new MobEffectInstance(MobEffects.JUMP, 40, 1,true,false)).alsoChange2ndSlot(Modded_item_core.BLANK_FORM.get()).AddToTabList(RiderTabs.EX_AID_TAB_ITEM));
	
	public static final RegistryObject<Item> BERCODE_WARRIOR_DECADE_GASHAT = ITEMS.register("barcode_warrior_decade_gashat",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_decade","ex_aid","gamer_driver_barcode_warrior_decade",
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 0,true,false),
					new MobEffectInstance(MobEffects.JUMP, 40, 1,true,false)).AddCompatibilityList(new String[] {"genm"})
			.alsoChange2ndSlot(Modded_item_core.BLANK_FORM.get()).AddToTabList(RiderTabs.EX_AID_TAB_ITEM));

	public static final RegistryObject<Item> DOKIDOKI_MAKAI_CASTLE_KIVA_GASHAT = ITEMS.register("dokidoki_makai_castle_kiva_gashat",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_kiva","ex_aid","gamer_driver_dokidoki_makai_castle_kiva",
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 0,true,false),
					new MobEffectInstance(MobEffects.JUMP, 40, 1,true,false)).alsoChange2ndSlot(Modded_item_core.BLANK_FORM.get()).AddToTabList(RiderTabs.EX_AID_TAB_ITEM));
	
	public static final RegistryObject<Item> TIME_EXPRESS_DEN_O_GASHAT = ITEMS.register("time_express_den_o_gashat",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_den_o","genm","gamer_driver_time_express_den_o",
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 0,true,false),
					new MobEffectInstance(MobEffects.JUMP, 40, 1,true,false)).alsoChange2ndSlot(Modded_item_core.BLANK_FORM.get()).AddToTabList(RiderTabs.EX_AID_TAB_ITEM));

	public static final RegistryObject<Item> INSECT_WARS_KABUTO_GASHAT = ITEMS.register("insect_wars_kabuto_gashat",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_kabuto","ex_aid","gamer_driver_insect_wars_kabuto",
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 0,true,false),
					new MobEffectInstance(MobEffects.JUMP, 40, 1,true,false)).alsoChange2ndSlot(Modded_item_core.BLANK_FORM.get()).AddToTabList(RiderTabs.EX_AID_TAB_ITEM));
	
	public static final RegistryObject<Item> TAIKO_MASTER_HIBIKI_GASHAT = ITEMS.register("taiko_master_hibiki_gashat",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_hibiki","genm","gamer_driver_taiko_master_hibiki",
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 0,true,false),
					new MobEffectInstance(MobEffects.JUMP, 40, 1,true,false)).alsoChange2ndSlot(Modded_item_core.BLANK_FORM.get()).AddToTabList(RiderTabs.EX_AID_TAB_ITEM));

	public static final RegistryObject<Item> KING_OF_POKER_BLADE_GASHAT = ITEMS.register("king_of_poker_blade_gashat",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_blade","genm","gamer_driver_king_of_poker_blade",
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 0,true,false),
					new MobEffectInstance(MobEffects.JUMP, 40, 1,true,false)).alsoChange2ndSlot(Modded_item_core.BLANK_FORM.get()).AddToTabList(RiderTabs.EX_AID_TAB_ITEM));

	public static final RegistryObject<Item> MOSHI_MOSHI_FAIZ_GASHAT = ITEMS.register("moshi_moshi_faiz_gashat",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_faiz","genm","gamer_driver_moshi_moshi_faiz",
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 0,true,false),
					new MobEffectInstance(MobEffects.JUMP, 40, 1,true,false)).alsoChange2ndSlot(Modded_item_core.BLANK_FORM.get()).AddToTabList(RiderTabs.EX_AID_TAB_ITEM));

	public static final RegistryObject<Item> MIRROR_LABRYINTH_RYUKI_GASHAT = ITEMS.register("mirror_labryinth_ryuki_gashat",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_ryuki","ex_aid","gamer_driver_mirror_labryinth_ryuki",
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 0,true,false),
					new MobEffectInstance(MobEffects.JUMP, 40, 1,true,false)).alsoChange2ndSlot(Modded_item_core.BLANK_FORM.get()).AddToTabList(RiderTabs.EX_AID_TAB_ITEM));

	public static final RegistryObject<Item> AGITO_OF_THE_SUN_GASHAT = ITEMS.register("agito_of_the_sun_gashat",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_agito","genm","gamer_driver_agito_of_the_sun",
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 0,true,false),
					new MobEffectInstance(MobEffects.JUMP, 40, 1,true,false)).alsoChange2ndSlot(Modded_item_core.BLANK_FORM.get()).AddToTabList(RiderTabs.EX_AID_TAB_ITEM));

	public static final RegistryObject<Item> ADVENTURE_GUY_KUUGA_GASHAT = ITEMS.register("adventure_guy_kuuga_gashat",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_kuuga","ex_aid","gamer_driver_adventure_guy_kuuga",
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 0,true,false),
					new MobEffectInstance(MobEffects.JUMP, 40, 1,true,false)).alsoChange2ndSlot(Modded_item_core.BLANK_FORM.get()).AddToTabList(RiderTabs.EX_AID_TAB_ITEM));
	
	public static final RegistryObject<Item> LETS_GO_ICHIGOU_GASHAT = ITEMS.register("lets_go_ichigou_gashat",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_ichigou","ex_aid","gamer_driver_lets_go_ichigou",
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 0,true,false),
					new MobEffectInstance(MobEffects.JUMP, 40, 1,true,false)).alsoChange2ndSlot(Modded_item_core.BLANK_FORM.get()).AddToTabList(RiderTabs.EX_AID_TAB_ITEM));

	
	public static final RegistryObject<Item> MIGHTY_ACTION_X_GASHA_TROPHY = ITEMS.register("mighty_action_x_gasha_trophy",
			() -> new BaseItem(new Item.Properties()).AddToTabList(RiderTabs.EX_AID_TAB_ITEM));
	
	public static final RegistryObject<Item> TADDLE_QUEST_GASHA_TROPHY = ITEMS.register("taddle_quest_gasha_trophy",
			() -> new BaseItem(new Item.Properties()).AddToTabList(RiderTabs.EX_AID_TAB_ITEM));
	
	public static final RegistryObject<Item> BANG_BANG_SHOOTING_GASHA_TROPHY = ITEMS.register("bang_bang_shooting_gasha_trophy",
			() -> new BaseItem(new Item.Properties()).AddToTabList(RiderTabs.EX_AID_TAB_ITEM));
	
	public static final RegistryObject<Item> BAKUSOU_BIKE_GASHA_TROPHY = ITEMS.register("bakusou_bike_gasha_trophy",
			() -> new BaseItem(new Item.Properties()).AddToTabList(RiderTabs.EX_AID_TAB_ITEM));
	
	public static final RegistryObject<Item> GEKITOTSU_ROBOTS_GASHA_TROPHY = ITEMS.register("gekitotsu_robots_gasha_trophy",
			() -> new BaseItem(new Item.Properties()).AddToTabList(RiderTabs.EX_AID_TAB_ITEM));
	
	public static final RegistryObject<Item> DOREMIFA_BEAT_GASHA_TROPHY = ITEMS.register("doremifa_beat_gasha_trophy",
			() -> new BaseItem(new Item.Properties()).AddToTabList(RiderTabs.EX_AID_TAB_ITEM));
	
	public static final RegistryObject<Item> JET_COMBAT_GASHA_TROPHY = ITEMS.register("jet_combat_gasha_trophy",
			() -> new BaseItem(new Item.Properties()).AddToTabList(RiderTabs.EX_AID_TAB_ITEM));
	
	public static final RegistryObject<Item> GIRI_GIRI_CHAMBARA_GASHA_TROPHY = ITEMS.register("giri_giri_chambara_gasha_trophy",
			() -> new BaseItem(new Item.Properties()).AddToTabList(RiderTabs.EX_AID_TAB_ITEM));
	
	public static final RegistryObject<Item> SHAKARIKI_SPORTS_GASHA_TROPHY = ITEMS.register("shakariki_sports_gasha_trophy",
			() -> new BaseItem(new Item.Properties()).AddToTabList(RiderTabs.EX_AID_TAB_ITEM));
	
	public static final RegistryObject<Item> DRAGO_KNIGHT_HUNTER_Z_GASHA_TROPHY = ITEMS.register("drago_knight_hunter_z_gasha_trophy",
			() -> new BaseItem(new Item.Properties()).AddToTabList(RiderTabs.EX_AID_TAB_ITEM));
	
	public static final RegistryObject<Item> PERFECT_PUZZLE_GASHA_TROPHY = ITEMS.register("perfect_puzzle_gasha_trophy",
			() -> new BaseItem(new Item.Properties()).AddToTabList(RiderTabs.EX_AID_TAB_ITEM));
	
	public static final RegistryObject<Item> KNOCK_OUT_FIGHTER_GASHA_TROPHY = ITEMS.register("knockout_fighter_gasha_trophy",
			() -> new BaseItem(new Item.Properties()).AddToTabList(RiderTabs.EX_AID_TAB_ITEM));
	
	public static final RegistryObject<Item> TOKI_MEKI_CRISIS_GASHA_TROPHY = ITEMS.register("toki_meki_crisis_gasha_trophy",
			() -> new BaseItem(new Item.Properties()).AddToTabList(RiderTabs.EX_AID_TAB_ITEM));

	
	
	public static final RegistryObject<Item> SPEED_ENERGY_ITEM = ITEMS.register("speed_energy_item",
			() -> new ExAidEnergyItem(new Item.Properties(),new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 500, 20,true,false)).AddToTabList(RiderTabs.EX_AID_TAB_ITEM));

	public static final RegistryObject<Item> IRON_ENERGY_ITEM = ITEMS.register("iron_energy_item",
			() -> new ExAidEnergyItem(new Item.Properties(),new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 500, 5,true,false)).AddToTabList(RiderTabs.EX_AID_TAB_ITEM));

	public static final RegistryObject<Item> INSTIGATE_ENERGY_ITEM = ITEMS.register("instigate_energy_item",
			() -> new ExAidEnergyItem(new Item.Properties(),new MobEffectInstance(MobEffects.GLOWING, 500, 0,true,false)).AddToTabList(RiderTabs.EX_AID_TAB_ITEM));

	public static final RegistryObject<Item> JUMP_ENERGY_ITEM = ITEMS.register("jump_energy_item",
			() -> new ExAidEnergyItem(new Item.Properties(),new MobEffectInstance(MobEffects.JUMP, 500, 10,true,false)).AddToTabList(RiderTabs.EX_AID_TAB_ITEM));

	public static final RegistryObject<Item> MUSCLE_ENERGY_ITEM = ITEMS.register("muscle_energy_item",
			() -> new ExAidEnergyItem(new Item.Properties(),new MobEffectInstance(MobEffects.DAMAGE_BOOST, 500, 5,true,false)).AddToTabList(RiderTabs.EX_AID_TAB_ITEM));

	public static final RegistryObject<Item> SHRINK_ENERGY_ITEM = ITEMS.register("shrink_energy_item",
			() -> new ExAidEnergyItem(new Item.Properties(),new MobEffectInstance(Effect_core.SMALL.get(), 500, 2,true,false)).AddToTabList(RiderTabs.EX_AID_TAB_ITEM));

	//christmas_energy_item

	public static final RegistryObject<Item> STRETCH_ENERGY_ITEM = ITEMS.register("stretch_energy_item",
			() -> new ExAidEnergyItem(new Item.Properties(),new MobEffectInstance(Effect_core.STRETCH.get(), 500, 2,true,false)).AddToTabList(RiderTabs.EX_AID_TAB_ITEM));

	
	public static final RegistryObject<Item> INVISIBLE_ENERGY_ITEM = ITEMS.register("invisible_energy_item",
			() -> new ExAidEnergyItem(new Item.Properties(),new MobEffectInstance(MobEffects.INVISIBILITY, 500, 0,true,false)).AddToTabList(RiderTabs.EX_AID_TAB_ITEM));

	public static final RegistryObject<Item> CONFUSION_ENERGY_ITEM = ITEMS.register("confusion_energy_item",
			() -> new ExAidEnergyItem(new Item.Properties(),new MobEffectInstance(MobEffects.CONFUSION, 500, 0,true,false)).AddToTabList(RiderTabs.EX_AID_TAB_ITEM));

	public static final RegistryObject<Item> RECOVER_ITEM = ITEMS.register("recover_energy_item",
			() -> new ExAidEnergyItem(new Item.Properties(),new MobEffectInstance(MobEffects.HEAL, 1, 10,true,false)).AddToTabList(RiderTabs.EX_AID_TAB_ITEM));

	//seperation_energy_item
	
	public static final RegistryObject<Item> EMISSION_ENERGY_ITEM = ITEMS.register("emission_energy_item",
			() -> new ExAidEnergyItem(new Item.Properties(),new MobEffectInstance(MobEffects.NIGHT_VISION, 500, 0,true,false)).AddToTabList(RiderTabs.EX_AID_TAB_ITEM));
	
	//reflect_energy_item
	//save_energy_item
	
	public static final RegistryObject<Item> REVERSE_ITEM = ITEMS.register("reverse_energy_item",
			() -> new ExAidEnergyItem(new Item.Properties(),new MobEffectInstance(MobEffects.HEAL, 1, 10,true,false)).AddToTabList(RiderTabs.EX_AID_TAB_ITEM));
	
	public static final RegistryObject<Item> GIANT_ENERGY_ITEM = ITEMS.register("giant_energy_item",
			() -> new ExAidEnergyItem(new Item.Properties(),new MobEffectInstance(Effect_core.BIG.get(), 500, 2,true,false)).AddToTabList(RiderTabs.EX_AID_TAB_ITEM));

	//disguise_energy_item
	
	public static final RegistryObject<Item> LIQUID_ENERGY_ITEM = ITEMS.register("liquid_energy_item",
			() -> new ExAidEnergyItem(new Item.Properties(),new MobEffectInstance(MobEffects.WATER_BREATHING, 500, 0,true,false)).AddToTabList(RiderTabs.EX_AID_TAB_ITEM));

	
	public static final RegistryObject<Item> DARK_ENERGY_ITEM = ITEMS.register("dark_energy_item",
			() -> new ExAidEnergyItem(new Item.Properties(),new MobEffectInstance(MobEffects.BLINDNESS, 500, 0,true,false)).AddToTabList(RiderTabs.EX_AID_TAB_ITEM));

	//sleep_energy_item
	
	public static final RegistryObject<Item> LUCK_ENERGY_ITEM = ITEMS.register("luck_energy_item",
			() -> new ExAidEnergyItem(new Item.Properties(),new MobEffectInstance(MobEffects.LUCK, 500, 0,true,false)).AddToTabList(RiderTabs.EX_AID_TAB_ITEM));

	public static final RegistryObject<Item> FLATTEN_ENERGY_ITEM = ITEMS.register("flatten_energy_item",
			() -> new ExAidEnergyItem(new Item.Properties(),new MobEffectInstance(Effect_core.FLAT.get(), 500, 2,true,false)).AddToTabList(RiderTabs.EX_AID_TAB_ITEM));

	public static final RegistryObject<Item> BALLOON_ENERGY_ITEM = ITEMS.register("balloon_energy_item",
			() -> new ExAidEnergyItem(new Item.Properties(),new MobEffectInstance(Effect_core.WIDE.get(), 500, 2,true,false)).AddToTabList(RiderTabs.EX_AID_TAB_ITEM));


	//gag_energy_item
	//fascination_energy_item
	//partner_energy_item
	//prediction_energy_item
	public static final RegistryObject<Item> HALT_ENERGY_ITEM = ITEMS.register("halt_energy_item",
			() -> new ExAidEnergyItem(new Item.Properties(),new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 500, 100,true,false)).AddToTabList(RiderTabs.EX_AID_TAB_ITEM));

	//end_energy_item
	//random_energy_item
	//bug_energy_item
	public static final RegistryObject<Item> BUG_ENERGY_ITEM = ITEMS.register("bug_energy_item",
			() -> new ExAidEnergyItem(new Item.Properties(),new MobEffectInstance(Effect_core.BUGSTER.get(), 500, 1,true,false)).AddToTabList(RiderTabs.EX_AID_TAB_ITEM));

	
	// no plan to add these but adding just in case
	
	//Senior
	//Memory
	//Desire
	//Friendship
	//Veteran
	//Succession
	
	//Continue
	//Rampage
	//Afterimage
	//Geniusization
	//Barrier
	//Gravity-Manipulation
	//Weathering
	//Thunder-Strike
	//Cyclone
	//Joker
	//Destroyer
	//Negativeization
	//Calming
	//Passion
	//Deadly-Poison
	//Knight
	//War God
	//Justice
	//Oblivion
	//Lost
	//Ending
	//Mechanization
	//United-Fight
	//Mortality
	//Fusion A
	//Fusion B
	//Sorrow
	//Fury
	//Survive 
	//Breakout
	//Freezing
	//Seal
	//Love & Peace
	//Eye
	//Sliding
	//Enjoyment
	
	//Aries
	//Taurus
	//Gemini
	//Cancer
	//Leo
	//Virgo
	//Libra
	//Scorpio
	//Sagittarius
	//Capricorn
	//Aquarius
	//Pisces
	
	//Supernova
	
	//Sonic Speeding-Up
	//Diamond-Body
	//Abetting
	//Flight
	//Rigidification
	//Full-Recover
	//Minimize
	//Maximize
	//Disappearance
	//Chaos
	
	//State Change
	//Multiplication
	//Jet Black
	//Flexible
	//Hypnosis
	//Ironclad
	//Resuscitation
	//Heisei
	//Fortune
	//Paper
	//Expansion
	//Very Funny
	//Captivation
	//Unique
	//Wisdom
	//Demise
	//Inheritance
	//Uncontrollable
	//Second Coming
	//Full Stop
	
	//Tomorrow
	//Wind
	//Forest
	//Fire
	//Shadow
	//Mountain
	//Thunder
	
	// Ghost x Ex-Aid maybe use for the Ex-Aid Ghost Eyecon
	
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

	public static final RegistryObject<Item> GAMER_DRIVER_LAZER = ITEMS.register("gamer_driver_lazer",
			() -> new GamerDriverItem(ArmorMaterials.DIAMOND,"lazer",BAKUSOU_BIKE_GASHAT ,EX_AIDHELMET, EX_AIDCHESTPLATE,EX_AIDLEGGINGS , new Item.Properties())
			.AddToTabList(RiderTabs.EX_AID_TAB_ITEM).ChangeRepairItem(BLANK_GASHAT.get()));

	public static final RegistryObject<Item> GAMER_DRIVER_GENM = ITEMS.register("gamer_driver_genmu",
			() -> new GamerDriverItem(ArmorMaterials.DIAMOND,"genm",PROTO_MIGHTY_ACTION_X_GASHAT ,EX_AIDHELMET, EX_AIDCHESTPLATE,EX_AIDLEGGINGS , new Item.Properties())
			.AddToTabList(RiderTabs.EX_AID_TAB_ITEM).ChangeRepairItem(BLANK_GASHAT.get()));

	public static final RegistryObject<Item> GAMER_DRIVER_PARA_DX = ITEMS.register("gamer_driver_paradx",
			() -> new GamerDriverItem(ArmorMaterials.DIAMOND,"para_dx_lv99",GASHAT_GEAR_DUAL ,EX_AIDHELMET, EX_AIDCHESTPLATE,EX_AIDLEGGINGS , new Item.Properties())
			.AddToTabList(RiderTabs.EX_AID_TAB_ITEM).ChangeRepairItem(BLANK_GASHAT.get()));

	public static final RegistryObject<Item> GAMER_DRIVER_TRUE_BRAVE = ITEMS.register("gamer_driver_truebrave",
			() -> new GamerDriverItem(ArmorMaterials.DIAMOND,"truebrave",TADDLE_LEGACY_GASHAT ,EX_AIDHELMET, EX_AIDCHESTPLATE,EX_AIDLEGGINGS , new Item.Properties())
			.AddToTabList(RiderTabs.EX_AID_TAB_ITEM).ChangeRepairItem(BLANK_GASHAT.get()));
	
	public static final RegistryObject<Item> GAMER_DRIVER_FUMA = ITEMS.register("gamer_driver_fuuma",
			() -> new GamerDriverItem(ArmorMaterials.DIAMOND,"fuma",HURRICANE_NINJA_GASHAT ,EX_AIDHELMET, EX_AIDCHESTPLATE,EX_AIDLEGGINGS , new Item.Properties())
			.AddToTabList(RiderTabs.EX_AID_TAB_ITEM).ChangeRepairItem(BLANK_GASHAT.get()));
	
	public static final RegistryObject<Item> GAMER_DRIVER_ANOTHER_PARA_DX = ITEMS.register("gamer_driver_anotherparadox",
			() -> new GamerDriverItem(ArmorMaterials.DIAMOND,"another_para_dx",GASHAT_GEAR_DUAL_ANOTHER ,EX_AIDHELMET, EX_AIDCHESTPLATE,EX_AIDLEGGINGS , new Item.Properties())
			.AddToTabList(RiderTabs.EX_AID_TAB_ITEM).ChangeRepairItem(BLANK_GASHAT.get()));

	public static final RegistryObject<Item> GAMER_DRIVER_SNIPE_NICO = ITEMS.register("gamer_driver_nico_snipe",
			() -> new GamerDriverItem(ArmorMaterials.DIAMOND,"snipe_nico",BANG_BANG_SHOOTING_GASHAT ,EX_AIDHELMET, EX_AIDCHESTPLATE,EX_AIDLEGGINGS , new Item.Properties())
			.AddToTabList(RiderTabs.EX_AID_TAB_ITEM).ChangeRepairItem(BLANK_GASHAT.get()));

	public static final RegistryObject<Item> GAMER_DRIVER_GEMEDEUS_MUTEKI = ITEMS.register("gamer_driver_gamedeus_muteki",
			() -> new GamerDriverItem(ArmorMaterials.DIAMOND,"gamedeus_muteki",GEMEDEUS_HYPER_MUTEKI_GASHAT ,EX_AIDHELMET, EX_AIDCHESTPLATE,EX_AIDLEGGINGS , new Item.Properties())
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
			.Override_belt_text("gashacon_bugvisor_ii_lazer").AddToTabList(RiderTabs.EX_AID_TAB_ITEM).ChangeRepairItem(BLANK_GASHAT.get()));

	public static final RegistryObject<Item> GASHACON_BUGVISOR_II_CHRONICLE_BUGTER = ITEMS.register("gashacon_bugvisor_ii_chronicle_bugster",
			() -> new GamerDriverItem(ArmorMaterials.DIAMOND,"chronicle_bugster",KAMEN_RIDER_CHRONICLE_GASHAT ,EX_AIDHELMET, EX_AIDCHESTPLATE,EX_AIDLEGGINGS , new Item.Properties())
			.Override_belt_text("gashacon_bugvisor_ii_lazer").AddToTabList(RiderTabs.EX_AID_TAB_ITEM).ChangeRepairItem(BLANK_GASHAT.get()));

	
	public static final RegistryObject<Item> PARA_DX_BELT = ITEMS.register("paradoxbelt",
			() -> new GamerDriverItem(ArmorMaterials.DIAMOND,"para_dx",PERFECT_PUZZLE_GASHAT ,EX_AIDHELMET, EX_AIDCHESTPLATE,EX_AIDLEGGINGS , new Item.Properties())
			.AddToTabList(RiderTabs.EX_AID_TAB_ITEM).ChangeRepairItem(BLANK_GASHAT.get()));

	public static final RegistryObject<Item> RIDE_PLAYER_BELT = ITEMS.register("rideplayerbelt",
			() -> new GamerDriverItem(ArmorMaterials.DIAMOND,"ride_player",UNFINISHED_KAMEN_RIDER_CHRONICLE_GASHAT ,EX_AIDHELMET, EX_AIDCHESTPLATE,EX_AIDLEGGINGS , new Item.Properties())
			.AddToTabList(RiderTabs.EX_AID_TAB_ITEM).ChangeRepairItem(BLANK_GASHAT.get()));

	public static final RegistryObject<Item> RIDE_PLAYER_BELT_NICO = ITEMS.register("rideplayerbelt_nico",
			() -> new GamerDriverItem(ArmorMaterials.DIAMOND,"ride_player_nico",UNFINISHED_KAMEN_RIDER_CHRONICLE_GASHAT ,EX_AIDHELMET, EX_AIDCHESTPLATE,EX_AIDLEGGINGS , new Item.Properties())
			.AddToTabList(RiderTabs.EX_AID_TAB_ITEM).ChangeRepairItem(BLANK_GASHAT.get()));

	public static final RegistryObject<Item> NINjA_PLAYER_BELT = ITEMS.register("ninjaplayerbelt",
			() -> new GamerDriverItem(ArmorMaterials.DIAMOND,"ninja_player",UNFINISHED_KAMEN_RIDER_CHRONICLE_GASHAT ,EX_AIDHELMET, EX_AIDCHESTPLATE,EX_AIDLEGGINGS , new Item.Properties())
			.Override_belt_text("ninja_player_belt").AddToTabList(RiderTabs.EX_AID_TAB_ITEM).ChangeRepairItem(BLANK_GASHAT.get()));

	public static void register(IEventBus eventBus) {
		ITEMS.register(eventBus);
	}

}