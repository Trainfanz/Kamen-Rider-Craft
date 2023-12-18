package com.kelco.kamenridercraft.Items;

import com.kelco.kamenridercraft.KamenRiderCraftCore;
import com.kelco.kamenridercraft.Effect.Effect_core;
import com.kelco.kamenridercraft.Items.ex_aid.GamerDriverItem;
import com.kelco.kamenridercraft.Items.rider_armor_base.BaseBlasterItem;
import com.kelco.kamenridercraft.Items.rider_armor_base.BaseItem;
import com.kelco.kamenridercraft.Items.rider_armor_base.BaseSwordItem;
import com.kelco.kamenridercraft.Items.rider_armor_base.RiderArmorItem;
import com.kelco.kamenridercraft.Items.rider_armor_base.RiderDriverItem;
import com.kelco.kamenridercraft.Items.rider_armor_base.RiderFormChangeItem;
import com.kelco.kamenridercraft.events.ModClientEvents;

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


	public static final RegistryObject<Item> MIGHTY_ACTION_X_GASHAT = ITEMS.register("mighty_action_x_gashat",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"","ex_aid","gamer_driver_mighty_action_x",
					new MobEffectInstance(MobEffects.JUMP, 40, 2,true,false)).alsoChange2ndSlot(Modded_item_core.BLANK_FORM.get()).AddToTabList(RiderTabs.EX_AID_TAB_ITEM));
	/**
	taddle_quest_gashat
	bang_bang_shooting_gashat
	bakusou_bike_gashat

	 */

	public static final RegistryObject<Item> GEKITOTSU_ROBOTS_GASHAT = ITEMS.register("gekitotsu_robots_gashat",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"robotgamer","ex_aid","gamer_driver_mighty_action_x",
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 1,true,false)).ChangeSlot(2).AddToTabList(RiderTabs.EX_AID_TAB_ITEM));
	/**    
	gekitotsu_robots_gashat
	doremifa_beat_gashat
	jet_combat_gashat
	giri_giri_chambara_gashat
	shakariki_sports_gashat
	drago_knight_hunter_z_gashat


	proto_mighty_action_x_gashat
	proto_taddle_quest_gashat
	proto_bang_bang_shooting_gashat
	proto_bakusou_bike_gashat
	proto_gekitotsu_robots_gashat
	proto_doremifa_beat_gashat
	proto_jet_combat_gashat
	proto_giri_giri_chambara_gashat
	proto_shakariki_sports_gashat
	proto_drago_knight_hunter_z_gashat
	proto_mighty_action_x_gashat_origin
	proto_bakusou_bike_combi_fukkatsu_gashat

	dangerous_zombie_gashat
	kamen_rider_chronicle_gashat
	toki_meki_crisis_gashat
	mighty_creator_vrx_gashat
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
	gabarizing_gashat

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
			() -> new GamerDriverItem(ArmorMaterials.DIAMOND,"ex_aid",MIGHTY_ACTION_X_GASHAT ,EX_AIDHELMET, EX_AIDCHESTPLATE,EX_AIDLEGGINGS , new Item.Properties()).AddToTabList(RiderTabs.EX_AID_TAB_ITEM).ChangeRepairItem(BLANK_GASHAT.get()));



	public static void register(IEventBus eventBus) {
		ITEMS.register(eventBus);
	}

}