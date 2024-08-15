package com.kelco.kamenridercraft.Items;

import java.util.ArrayList;
import java.util.List;

import com.kelco.kamenridercraft.KamenRiderCraftCore;
import com.kelco.kamenridercraft.Effect.Effect_core;
import com.kelco.kamenridercraft.Items.geats.MissionBoxItem;
import com.kelco.kamenridercraft.Items.geats.DesireDriverItem;
import com.kelco.kamenridercraft.Items.geats.FeverSlotItem;
import com.kelco.kamenridercraft.Items.geats.LaserRaiseRiserItem;
import com.kelco.kamenridercraft.Items.rider_armor_base.BaseBlasterItem;
import com.kelco.kamenridercraft.Items.rider_armor_base.BaseItem;
import com.kelco.kamenridercraft.Items.rider_armor_base.BaseShieldItem;
import com.kelco.kamenridercraft.Items.rider_armor_base.BaseSwordItem;
import com.kelco.kamenridercraft.Items.rider_armor_base.RiderArmorItem;
import com.kelco.kamenridercraft.Items.rider_armor_base.RiderDriverItem;
import com.kelco.kamenridercraft.Items.rider_armor_base.RiderFormChangeItem;
import com.kelco.kamenridercraft.events.ModClientEvents;

import net.minecraft.client.gui.font.glyphs.BakedGlyph.Effect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterials;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ShieldItem;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tiers;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class Geats_Rider_Items {

	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, KamenRiderCraftCore.MODID);

	public static String[] BaseDesireDriverUsers = new String[] {"geats","tycoon","na_go","buffa","punkjack","nudge_sparrow","shirowe","ginpen","mary"
			,"da_paan","keirou","letter","lopo","hakubi","turbon","brali","gya_go","seeker","butchi","geats_revi","geats_vice","groovy","the_end_riders"
			,"keibi_riders","gm_chirami","gm","jyamato"};
	
	public static String[] FeverUsers = new String[] {"geats","tycoon","na_go","buffa","punkjack","nudge_sparrow","shirowe","ginpen","mary"
			,"da_paan","keirou","letter","lopo","hakubi","turbon","brali","gya_go","seeker","butchi","geats_revi","geats_vice","groovy"};
	
	public static final RegistryObject<Item> GEATS_LOGO = ITEMS.register("geats_logo",
			() -> new BaseItem(new Item.Properties()).AddToTabList(RiderTabs.GEATS_TAB_ITEM));

	public static final RegistryObject<Item> BIKKURI_MISSION_BOX = ITEMS.register("bikkuri_mission_box",
		    () -> new MissionBoxItem(new Item.Properties()).AddToTabList(RiderTabs.GEATS_TAB_ITEM));
	public static final RegistryObject<Item> HATENA_MISSION_BOX = ITEMS.register("hatena_mission_box",
		    () -> new MissionBoxItem(new Item.Properties()).AddToTabList(RiderTabs.GEATS_TAB_ITEM));
	public static final RegistryObject<Item> SUPPORT_MISSION_BOX_TYPE_GEATS = ITEMS.register("gigant_mission_box",
		    () -> new MissionBoxItem(new Item.Properties()).AddToTabList(RiderTabs.GEATS_TAB_ITEM));

	public static final RegistryObject<Item> BLANK_CORE_ID = ITEMS.register("blank_rider_core_id",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"","keibi_riders","desire_driver_belt_keibi",
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 0,true,false))
			.alsoChange3rdSlot(Modded_item_core.BLANK_FORM.get()).alsoChange2ndSlot(Modded_item_core.BLANK_FORM.get()).AddCompatibilityList(new String[] {"the_end_riders"}).AddToTabList(RiderTabs.GEATS_TAB_ITEM));

	public static final RegistryObject<Item> GEATS_CORE_ID = ITEMS.register("geats_rider_core_id",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"","geats","desire_driver_belt_geats",
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 0,true,false))
			.alsoChange3rdSlot(Modded_item_core.BLANK_FORM.get()).alsoChange2ndSlot(Modded_item_core.BLANK_FORM.get()).AddToTabList(MissionBoxItem.CORE_ID, 10).AddToTabList(RiderTabs.GEATS_TAB_ITEM));

	public static final RegistryObject<Item> GEATS_ONENESS_CORE_ID = ITEMS.register("geats_oneness_rider_core_id",
			() -> new BaseItem(new Item.Properties()).AddToTabList(RiderTabs.GEATS_TAB_ITEM));
	

	public static final RegistryObject<Item> TYCOON_CORE_ID = ITEMS.register("tycoon_rider_core_id",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"","tycoon","desire_driver_belt_tycoon",
					new MobEffectInstance(MobEffects.LUCK, 40, 0,true,false))
			.alsoChange3rdSlot(Modded_item_core.BLANK_FORM.get()).alsoChange2ndSlot(Modded_item_core.BLANK_FORM.get()).AddToTabList(MissionBoxItem.CORE_ID, 5).AddToTabList(RiderTabs.GEATS_TAB_ITEM));

	public static final RegistryObject<Item> NA_GO_CORE_ID = ITEMS.register("na_go_rider_core_id",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"","na_go","desire_driver_belt_na_go",
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 0,true,false))
			.alsoChange3rdSlot(Modded_item_core.BLANK_FORM.get()).alsoChange2ndSlot(Modded_item_core.BLANK_FORM.get()).AddToTabList(MissionBoxItem.CORE_ID, 5).AddToTabList(RiderTabs.GEATS_TAB_ITEM));

	public static final RegistryObject<Item> BUFFA_CORE_ID = ITEMS.register("buffa_rider_core_id",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"","buffa","desire_driver_belt_buffa",
					new MobEffectInstance(Effect_core.ANTIPOISON.get(), 40, 0,true,false))
			.alsoChange3rdSlot(Modded_item_core.BLANK_FORM.get()).alsoChange2ndSlot(Modded_item_core.BLANK_FORM.get()).AddToTabList(MissionBoxItem.CORE_ID, 5).AddToTabList(RiderTabs.GEATS_TAB_ITEM));

	public static final RegistryObject<Item> BUFFA_CORE_ID_CRACKED = ITEMS.register("buffa_rider_core_id_cracked",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_jyamato","buffa","desire_driver_belt_buffa",
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 1,true,false),
					new MobEffectInstance(MobEffects.JUMP, 40, 1,true,false),
					new MobEffectInstance(Effect_core.ANTIPOISON.get(), 40, 0,true,false))
			.alsoChange3rdSlot(Modded_item_core.BLANK_FORM.get()).alsoChange2ndSlot(Modded_item_core.BLANK_FORM.get()).AddToTabList(RiderTabs.GEATS_TAB_ITEM));

	public static final RegistryObject<Item> PUNKJACK_CORE_ID = ITEMS.register("punkjack_rider_core_id",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"","punkjack","desire_driver_belt_punkjack",
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 1,true,false),
					new MobEffectInstance(MobEffects.JUMP, 40, 0,true,false))
			.alsoChange3rdSlot(Modded_item_core.BLANK_FORM.get()).alsoChange2ndSlot(Modded_item_core.BLANK_FORM.get()).AddToTabList(MissionBoxItem.CORE_ID).AddToTabList(RiderTabs.GEATS_TAB_ITEM));

	public static final RegistryObject<Item> NUGE_SPARROW_CORE_ID = ITEMS.register("nudge_sparrow_rider_core_id",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"","nudge_sparrow","desire_driver_belt_nadge_sparrow",
					new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 0,true,false))
			.alsoChange3rdSlot(Modded_item_core.BLANK_FORM.get()).alsoChange2ndSlot(Modded_item_core.BLANK_FORM.get()).AddToTabList(MissionBoxItem.CORE_ID, 3).AddToTabList(RiderTabs.GEATS_TAB_ITEM));

	public static final RegistryObject<Item> SHIROWE_CORE_ID = ITEMS.register("shirowe_rider_core_id",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"","shirowe","desire_driver_belt_shirowe",
					new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 0,true,false))
			.alsoChange3rdSlot(Modded_item_core.BLANK_FORM.get()).alsoChange2ndSlot(Modded_item_core.BLANK_FORM.get()).AddToTabList(MissionBoxItem.CORE_ID).AddToTabList(RiderTabs.GEATS_TAB_ITEM));

	public static final RegistryObject<Item> GINPEN_CORE_ID = ITEMS.register("ginpen_rider_core_id",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"","ginpen","desire_driver_belt_ginpen",
					new MobEffectInstance(MobEffects.DOLPHINS_GRACE, 40, 0,true,false))
			.alsoChange3rdSlot(Modded_item_core.BLANK_FORM.get()).alsoChange2ndSlot(Modded_item_core.BLANK_FORM.get()).AddToTabList(MissionBoxItem.CORE_ID).AddToTabList(RiderTabs.GEATS_TAB_ITEM));

	public static final RegistryObject<Item> MARY_CORE_ID = ITEMS.register("mary_rider_core_id",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"","mary","desire_driver_belt_mary",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 0,true,false))
			.alsoChange3rdSlot(Modded_item_core.BLANK_FORM.get()).alsoChange2ndSlot(Modded_item_core.BLANK_FORM.get()).AddToTabList(MissionBoxItem.CORE_ID, 3).AddToTabList(RiderTabs.GEATS_TAB_ITEM));

	public static final RegistryObject<Item> DA_PAAN_CORE_ID = ITEMS.register("da_paan_rider_core_id",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"","da_paan","desire_driver_belt_da_paan",
					new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 0,true,false))
			.alsoChange3rdSlot(Modded_item_core.BLANK_FORM.get()).alsoChange2ndSlot(Modded_item_core.BLANK_FORM.get()).AddToTabList(MissionBoxItem.CORE_ID).AddToTabList(RiderTabs.GEATS_TAB_ITEM));

	public static final RegistryObject<Item> KEIROU_CORE_ID = ITEMS.register("keirou_rider_core_id",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"","keirou","desire_driver_belt_keilow",
					new MobEffectInstance(MobEffects.SLOW_FALLING, 40, 0,true,false))
			.alsoChange3rdSlot(Modded_item_core.BLANK_FORM.get()).alsoChange2ndSlot(Modded_item_core.BLANK_FORM.get()).AddToTabList(MissionBoxItem.CORE_ID, 2).AddToTabList(RiderTabs.GEATS_TAB_ITEM));

	public static final RegistryObject<Item> LETTER_CORE_ID = ITEMS.register("letter_rider_core_id",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"","letter","desire_driver_belt_letter",
					new MobEffectInstance(MobEffects.UNLUCK, 40, 0,true,false),
					new MobEffectInstance(MobEffects.JUMP, 40, 1,true,false))
			.alsoChange3rdSlot(Modded_item_core.BLANK_FORM.get()).alsoChange2ndSlot(Modded_item_core.BLANK_FORM.get()).AddToTabList(MissionBoxItem.CORE_ID).AddToTabList(RiderTabs.GEATS_TAB_ITEM));

	public static final RegistryObject<Item> LOPO_CORE_ID = ITEMS.register("lopo_rider_core_id",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"","lopo","desire_driver_belt_lopo",
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 2,true,false))
			.alsoChange3rdSlot(Modded_item_core.BLANK_FORM.get()).alsoChange2ndSlot(Modded_item_core.BLANK_FORM.get()).AddToTabList(MissionBoxItem.CORE_ID, 3).AddToTabList(RiderTabs.GEATS_TAB_ITEM));

	public static final RegistryObject<Item> GROOVY_CORE_ID = ITEMS.register("groovy_rider_core_id",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"","groovy","desire_driver_belt_groovy",
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 0,true,false))
			.alsoChange3rdSlot(Modded_item_core.BLANK_FORM.get()).alsoChange2ndSlot(Modded_item_core.BLANK_FORM.get()).AddToTabList(MissionBoxItem.CORE_ID).AddToTabList(RiderTabs.GEATS_TAB_ITEM));

	public static final RegistryObject<Item> HAKUBI_CORE_ID = ITEMS.register("hakubi_rider_core_id",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"","hakubi","desire_driver_belt_ginpen",
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 0,true,false))
			.alsoChange3rdSlot(Modded_item_core.BLANK_FORM.get()).alsoChange2ndSlot(Modded_item_core.BLANK_FORM.get()).AddToTabList(MissionBoxItem.CORE_ID).AddToTabList(RiderTabs.GEATS_TAB_ITEM));

	public static final RegistryObject<Item> TURBON_CORE_ID = ITEMS.register("turbon_rider_core_id",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"","turbon","desire_driver_belt_turbon",
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 0,true,false))
			.alsoChange3rdSlot(Modded_item_core.BLANK_FORM.get()).alsoChange2ndSlot(Modded_item_core.BLANK_FORM.get()).AddToTabList(MissionBoxItem.CORE_ID).AddToTabList(RiderTabs.GEATS_TAB_ITEM));

	public static final RegistryObject<Item> BRALI_CORE_ID = ITEMS.register("brali_rider_core_id",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"","brali","desire_driver_belt_brali",
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 0,true,false))
			.alsoChange3rdSlot(Modded_item_core.BLANK_FORM.get()).alsoChange2ndSlot(Modded_item_core.BLANK_FORM.get()).AddToTabList(MissionBoxItem.CORE_ID).AddToTabList(RiderTabs.GEATS_TAB_ITEM));

	public static final RegistryObject<Item> GYA_GO_CORE_ID = ITEMS.register("gya_go_rider_core_id",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"","gya_go","desire_driver_belt_gya_go",
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 0,true,false))
			.alsoChange3rdSlot(Modded_item_core.BLANK_FORM.get()).alsoChange2ndSlot(Modded_item_core.BLANK_FORM.get()).AddToTabList(MissionBoxItem.CORE_ID).AddToTabList(RiderTabs.GEATS_TAB_ITEM));

	public static final RegistryObject<Item> SEEKER_CORE_ID = ITEMS.register("seeker_rider_core_id",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"","seeker","desire_driver_belt_seeker",
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 0,true,false))
			.alsoChange3rdSlot(Modded_item_core.BLANK_FORM.get()).alsoChange2ndSlot(Modded_item_core.BLANK_FORM.get()).AddToTabList(MissionBoxItem.CORE_ID, 3).AddToTabList(RiderTabs.GEATS_TAB_ITEM));

	public static final RegistryObject<Item> BUTCHI_CORE_ID = ITEMS.register("butchi_rider_core_id",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"","butchi","desire_driver_belt_da_paan",
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 0,true,false))
			.alsoChange3rdSlot(Modded_item_core.BLANK_FORM.get()).alsoChange2ndSlot(Modded_item_core.BLANK_FORM.get()).AddToTabList(MissionBoxItem.CORE_ID).AddToTabList(RiderTabs.GEATS_TAB_ITEM));

	public static final RegistryObject<Item> REVI_CORE_ID = ITEMS.register("revi_rider_core_id",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"","geats_revi","desire_driver_belt_revi",
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 0,true,false))
			.alsoChange3rdSlot(Modded_item_core.BLANK_FORM.get()).alsoChange2ndSlot(Modded_item_core.BLANK_FORM.get()).AddToTabList(MissionBoxItem.CORE_ID).AddToTabList(RiderTabs.GEATS_TAB_ITEM));

	public static final RegistryObject<Item> VICE_CORE_ID = ITEMS.register("vice_rider_core_id",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"","geats_vice","desire_driver_belt_vice",
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 0,true,false))
			.alsoChange3rdSlot(Modded_item_core.BLANK_FORM.get()).alsoChange2ndSlot(Modded_item_core.BLANK_FORM.get()).AddToTabList(MissionBoxItem.CORE_ID).AddToTabList(RiderTabs.GEATS_TAB_ITEM));

	public static final RegistryObject<Item> CHUTA_CORE_ID = ITEMS.register("chuta_rider_core_id",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"","gm","desire_driver_belt_keibi",
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 0,true,false))
			.alsoChange3rdSlot(Modded_item_core.BLANK_FORM.get()).alsoChange2ndSlot(Modded_item_core.BLANK_FORM.get()).AddToTabList(RiderTabs.GEATS_TAB_ITEM));

	public static final RegistryObject<Item> GESSY_CORE_ID = ITEMS.register("gesshi_rider_core_id",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"","gm_chirami","desire_driver_belt_keibi",
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 0,true,false))
			.alsoChange3rdSlot(Modded_item_core.BLANK_FORM.get()).alsoChange2ndSlot(Modded_item_core.BLANK_FORM.get()).AddToTabList(RiderTabs.GEATS_TAB_ITEM));

	public static final RegistryObject<Item> X_GEATS_CORE_ID = ITEMS.register("x_geats_rider_core_id",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"","x_geats","desire_driver_belt_vice",
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 0,true,false))
			.ChangeModel("cyclonehopper_wingsarmor.geo.json").AddToTabList(RiderTabs.GEATS_TAB_ITEM));

	public static final RegistryObject<Item> DOOMS_GEATS_CORE_ID = ITEMS.register("dooms_geats_rider_core_id",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"","dooms_geats","desire_driver_belt_dooms_geats",
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 0,true,false))
			.ChangeModel("cyclonehopper_wingsarmor.geo.json").AddToTabList(RiderTabs.GEATS_TAB_ITEM));

	public static final RegistryObject<Item> DISCORE_ID = ITEMS.register("discore_id",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"","jyamato","desire_driver_belt_jyamato",
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 0,true,false))
			.alsoChange3rdSlot(Modded_item_core.BLANK_FORM.get()).alsoChange2ndSlot(Modded_item_core.BLANK_FORM.get()).AddToTabList(RiderTabs.GEATS_TAB_ITEM));

	public static final RegistryObject<Item> TOGECHI_CORE_ID = ITEMS.register("togechi_rider_core_id",
			() -> new BaseItem(new Item.Properties()).AddToTabList(RiderTabs.GEATS_TAB_ITEM));
	
	public static final RegistryObject<Item> LANCER_CORE_ID = ITEMS.register("lancer_rider_core_id",
			() -> new BaseItem(new Item.Properties()).AddToTabList(RiderTabs.GEATS_TAB_ITEM));
	
	public static final RegistryObject<Item> GARUN_CORE_ID = ITEMS.register("garun_rider_core_id",
			() -> new BaseItem(new Item.Properties()).AddToTabList(RiderTabs.GEATS_TAB_ITEM));
	
	
	public static final RegistryObject<Item> TOGECHI_CORE_ID_CRACKED = ITEMS.register("togechi_rider_core_id_cracked",
			() -> new BaseItem(new Item.Properties()).AddToTabList(RiderTabs.GEATS_TAB_ITEM));
	
	public static final RegistryObject<Item> LETTER_CORE_ID_CRACKED = ITEMS.register("letter_rider_core_id_cracked",
			() -> new BaseItem(new Item.Properties()).AddToTabList(RiderTabs.GEATS_TAB_ITEM));
	
	public static final RegistryObject<Item> GINPEN_CORE_ID_CRACKED = ITEMS.register("ginpen_rider_core_id_cracked",
			() -> new BaseItem(new Item.Properties()).AddToTabList(RiderTabs.GEATS_TAB_ITEM));
	
	public static final RegistryObject<Item> SHIROWE_CORE_ID_CRACKED = ITEMS.register("shirowe_rider_core_id_cracked",
			() -> new BaseItem(new Item.Properties()).AddToTabList(RiderTabs.GEATS_TAB_ITEM));
	
	public static final RegistryObject<Item> NUDGESPARROW_CORE_ID_CRACKED = ITEMS.register("nudge_sparrow_rider_core_id_cracked",
			() -> new BaseItem(new Item.Properties()).AddToTabList(RiderTabs.GEATS_TAB_ITEM));
	

	public static final RegistryObject<Item> MAGNUM_RAISE_BUCKLE = ITEMS.register("magnum_raise_buckle",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_magnum","geats","desire_driver_belt_geats",
					new MobEffectInstance(Effect_core.FIRE_SHOT.get(), 40, 0,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 0,true,false))
			.ChangeSlot(2).SetOffhandSlot(3).AddCompatibilityList(BaseDesireDriverUsers).AddToTabList(MissionBoxItem.RAISE_BUCKLE, 5).AddToTabList(RiderTabs.GEATS_TAB_ITEM));

	public static final RegistryObject<Item> BOOST_RAISE_BUCKLE = ITEMS.register("boost_raise_buckle",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_boost","geats","desire_driver_belt_geats",
					new MobEffectInstance(Effect_core.BOOST.get(), 40, 0,true,false))
			.ChangeSlot(2).SetOffhandSlot(3).AddCompatibilityList(BaseDesireDriverUsers).AddToTabList(MissionBoxItem.RAISE_BUCKLE, 5).AddToTabList(RiderTabs.GEATS_TAB_ITEM));

	public static final RegistryObject<Item> ZOMBIE_RAISE_BUCKLE = ITEMS.register("zombie_raise_buckle",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_zombie","geats","desire_driver_belt_geats",
					new MobEffectInstance(Effect_core.ANTIPOISON.get(), 40, 0,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 1,true,false))
			.ChangeSlot(2).SetOffhandSlot(3).AddCompatibilityList(BaseDesireDriverUsers).AddToTabList(MissionBoxItem.RAISE_BUCKLE, 4).AddToTabList(RiderTabs.GEATS_TAB_ITEM));

	public static final RegistryObject<Item> NINJA_RAISE_BUCKLE = ITEMS.register("ninja_raise_buckle",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_ninja","geats","desire_driver_belt_geats",
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 2,true,false),
					new MobEffectInstance(MobEffects.JUMP, 40, 4,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 1,true,false))
			.ChangeSlot(2).SetOffhandSlot(3).AddCompatibilityList(BaseDesireDriverUsers).AddToTabList(MissionBoxItem.RAISE_BUCKLE, 4).AddToTabList(RiderTabs.GEATS_TAB_ITEM));

	public static final RegistryObject<Item> MONSTER_RAISE_BUCKLE = ITEMS.register("monster_raise_buckle",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_monster","geats","desire_driver_belt_geats",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 1,true,false),
					new MobEffectInstance(Effect_core.PUNCH.get(), 40, 4,true,false))
			.ChangeSlot(2).SetOffhandSlot(3).AddCompatibilityList(BaseDesireDriverUsers).AddToTabList(MissionBoxItem.RAISE_BUCKLE, 3).AddToTabList(RiderTabs.GEATS_TAB_ITEM));

	public static final RegistryObject<Item> BEAT_RAISE_BUCKLE = ITEMS.register("beat_raise_buckle",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_beat","geats","desire_driver_belt_geats",
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 1,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 1,true,false),
					new MobEffectInstance(MobEffects.JUMP, 40, 1,true,false))
			.ChangeSlot(2).SetOffhandSlot(3).AddCompatibilityList(BaseDesireDriverUsers).AddToTabList(MissionBoxItem.RAISE_BUCKLE, 3).AddToTabList(RiderTabs.GEATS_TAB_ITEM));


	public static final RegistryObject<Item> POWERED_BUILDER_RAISE_BUCKLE_GEATS = ITEMS.register("powered_builder_raise_buckle_geats",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_poweredbuilder","geats","desire_driver_belt_geats",
					new MobEffectInstance(Effect_core.EXPLOSION_SHOT.get(), 40, 0,true,false),
					new MobEffectInstance(Effect_core.FIRE_PUNCH.get(), 40, 1,true,false),
					new MobEffectInstance(Effect_core.SLASH.get(), 40, 1,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 1,true,false))
			.ChangeSlot(2).SetOffhandSlot(3).AddCompatibilityList(BaseDesireDriverUsers));

	public static final RegistryObject<Item> POWERED_BUILDER_RAISE_BUCKLE = ITEMS.register("powered_builder_raise_buckle",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_poweredbuilder_seeker","seeker","desire_driver_belt_geats",
					new MobEffectInstance(Effect_core.EXPLOSION_SHOT.get(), 40, 0,true,false),
					new MobEffectInstance(Effect_core.FIRE_PUNCH.get(), 40, 1,true,false),
					new MobEffectInstance(Effect_core.SLASH.get(), 40, 1,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 1,true,false))
			.ChangeSlot(2).SetOffhandSlot(3).addAlternative(POWERED_BUILDER_RAISE_BUCKLE_GEATS.get()).AddToTabList(MissionBoxItem.GIGANT_BUCKLE).AddToTabList(RiderTabs.GEATS_TAB_ITEM));

	public static final RegistryObject<Item> FANTASY_RAISE_BUCKLE_GYA_GO = ITEMS.register("fantasy_raise_buckle_gya_go",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_fantasy_gya_go","geats","desire_driver_belt_geats",
					new MobEffectInstance(Effect_core.REFLECT.get(), 40, 1,true,false),
					new MobEffectInstance(Effect_core.SLASH.get(), 40, 1,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 1,true,false))
			.ChangeSlot(2).SetOffhandSlot(3).AddCompatibilityList(BaseDesireDriverUsers));

	public static final RegistryObject<Item> FANTASY_RAISE_BUCKLE = ITEMS.register("fantasy_raise_buckle",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_fantasy","na_go","desire_driver_belt_geats",
					new MobEffectInstance(Effect_core.REFLECT.get(), 40, 1,true,false),
					new MobEffectInstance(Effect_core.SLASH.get(), 40, 1,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 1,true,false))
			.ChangeSlot(2).SetOffhandSlot(3).addAlternative(FANTASY_RAISE_BUCKLE_GYA_GO.get()).AddToTabList(MissionBoxItem.RAISE_BUCKLE).AddToTabList(RiderTabs.GEATS_TAB_ITEM));

	public static final RegistryObject<Item> SHARK_RAISE_BUCKLE = ITEMS.register("shark_raise_buckle",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_shark","geats","desire_driver_belt_geats",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 1,true,false),
					new MobEffectInstance(Effect_core.PUNCH.get(), 40, 4,true,false))
			.ChangeSlot(2).AddCompatibilityList(BaseDesireDriverUsers).AddToTabList(RiderTabs.GEATS_TAB_ITEM));

	
	public static final RegistryObject<Item> MAGNUM_RAISE_BUCKLE_FEVER = ITEMS.register("magnum_raise_buckle_fever",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_magnum_slot","geats","desire_driver_belt_geats",
					new MobEffectInstance(Effect_core.FIRE_SHOT.get(), 40, 0,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 0,true,false))
			.ChangeSlot(2).SetOffhandSlot(3).AddCompatibilityList(BaseDesireDriverUsers).AddToTabList(FeverSlotItem.FEVER_SLOT));

	public static final RegistryObject<Item> BOOST_RAISE_BUCKLE_FEVER = ITEMS.register("boost_raise_buckle_fever",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_boost_slot","geats","desire_driver_belt_geats",
					new MobEffectInstance(Effect_core.BOOST.get(), 40, 0,true,false))
			.ChangeSlot(2).SetOffhandSlot(3).AddCompatibilityList(BaseDesireDriverUsers).AddToTabList(FeverSlotItem.FEVER_SLOT));

	public static final RegistryObject<Item> ZOMBIE_RAISE_BUCKLE_FEVER = ITEMS.register("zombie_raise_buckle_fever",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_zombie_slot","geats","desire_driver_belt_geats",
					new MobEffectInstance(Effect_core.ANTIPOISON.get(), 40, 0,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 1,true,false))
			.ChangeSlot(2).SetOffhandSlot(3).AddCompatibilityList(BaseDesireDriverUsers).AddToTabList(FeverSlotItem.FEVER_SLOT));

	public static final RegistryObject<Item> NINJA_RAISE_BUCKLE_FEVER = ITEMS.register("ninja_raise_buckle_fever",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_ninja_slot","geats","desire_driver_belt_geats",
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 2,true,false),
					new MobEffectInstance(MobEffects.JUMP, 40, 4,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 1,true,false))
			.ChangeSlot(2).SetOffhandSlot(3).AddCompatibilityList(BaseDesireDriverUsers).AddToTabList(FeverSlotItem.FEVER_SLOT));

	public static final RegistryObject<Item> MONSTER_RAISE_BUCKLE_FEVER = ITEMS.register("monster_raise_buckle_fever",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_monster_slot","geats","desire_driver_belt_geats",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 1,true,false),
					new MobEffectInstance(Effect_core.PUNCH.get(), 40, 4,true,false))
			.ChangeSlot(2).SetOffhandSlot(3).AddCompatibilityList(BaseDesireDriverUsers).AddToTabList(FeverSlotItem.FEVER_SLOT));

	public static final RegistryObject<Item> BEAT_RAISE_BUCKLE_FEVER = ITEMS.register("beat_raise_buckle_fever",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_beat_slot","geats","desire_driver_belt_geats",
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 1,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 1,true,false),
					new MobEffectInstance(MobEffects.JUMP, 40, 1,true,false))
			.ChangeSlot(2).SetOffhandSlot(3).AddCompatibilityList(BaseDesireDriverUsers).AddToTabList(FeverSlotItem.FEVER_SLOT));

	public static final RegistryObject<Item> ARROW_RAISE_BUCKLE_FEVER = ITEMS.register("arrow_raise_buckle_fever",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_arrow_slot","geats","desire_driver_belt_geats",
					new MobEffectInstance(Effect_core.EXPLOSION_SHOT.get(), 40, 0,true,false))
			.ChangeSlot(2).SetOffhandSlot(3).AddCompatibilityList(BaseDesireDriverUsers).AddToTabList(FeverSlotItem.FEVER_SLOT));

	public static final RegistryObject<Item> WATER_RAISE_BUCKLE_FEVER = ITEMS.register("water_raise_buckle_fever",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_water_slot","geats","desire_driver_belt_geats",
					new MobEffectInstance(MobEffects.WATER_BREATHING, 40, 0,true,false))
			.ChangeSlot(2).SetOffhandSlot(3).AddCompatibilityList(BaseDesireDriverUsers).AddToTabList(FeverSlotItem.FEVER_SLOT));

	public static final RegistryObject<Item> HAMMER_RAISE_BUCKLE_FEVER = ITEMS.register("hammer_raise_buckle_fever",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_hammer_slot","geats","desire_driver_belt_geats",
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 1,true,false))
			.ChangeSlot(2).SetOffhandSlot(3).AddCompatibilityList(BaseDesireDriverUsers).AddToTabList(FeverSlotItem.FEVER_SLOT));

	public static final RegistryObject<Item> SHIELD_RAISE_BUCKLE_FEVER = ITEMS.register("shield_raise_buckle_fever",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_shield_slot","geats","desire_driver_belt_geats",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 0,true,false))
			.ChangeSlot(2).SetOffhandSlot(3).AddCompatibilityList(BaseDesireDriverUsers).AddToTabList(FeverSlotItem.FEVER_SLOT));

	public static final RegistryObject<Item> CHAIN_ARRAY_RAISE_BUCKLE_FEVER = ITEMS.register("chain_array_raise_buckle_fever",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_chain_array_slot","geats","desire_driver_belt_geats",
					new MobEffectInstance(MobEffects.DIG_SLOWDOWN, 40, 0,true,false),
					new MobEffectInstance(Effect_core.SLASH.get(), 40, 1,true,false))
			.ChangeSlot(2).SetOffhandSlot(3).AddCompatibilityList(BaseDesireDriverUsers).AddToTabList(FeverSlotItem.FEVER_SLOT));

	public static final RegistryObject<Item> CLAW_RAISE_BUCKLE_FEVER = ITEMS.register("claw_raise_buckle_fever",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_claw_slot","geats","desire_driver_belt_geats",
					new MobEffectInstance(Effect_core.SLASH.get(), 40, 0,true,false))
			.ChangeSlot(2).SetOffhandSlot(3).AddCompatibilityList(BaseDesireDriverUsers).AddToTabList(FeverSlotItem.FEVER_SLOT));

	public static final RegistryObject<Item> DRILL_RAISE_BUCKLE_FEVER = ITEMS.register("drill_raise_buckle_fever",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_drill_slot","geats","desire_driver_belt_geats",
					new MobEffectInstance(Effect_core.PUNCH.get(), 40, 2,true,false))
			.ChangeSlot(2).SetOffhandSlot(3).ChangeModel("geats_rider_drill.geo.json")
			.AddCompatibilityList(BaseDesireDriverUsers).AddToTabList(FeverSlotItem.FEVER_SLOT));

	public static final RegistryObject<Item> PROPELLER_RAISE_BUCKLE_FEVER = ITEMS.register("propeller_raise_buckle_fever",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_propeller_slot","geats","desire_driver_belt_geats",
					new MobEffectInstance(MobEffects.JUMP, 40, 6,true,false),
					new MobEffectInstance(MobEffects.SLOW_FALLING, 40, 6,true,false))
			.ChangeSlot(2).SetOffhandSlot(3).AddCompatibilityList(BaseDesireDriverUsers).AddToTabList(FeverSlotItem.FEVER_SLOT));

	
	public static final RegistryObject<Item> FEVER_SLOT_RAISE_BUCKLE = ITEMS.register("fever_slot_raise_buckle",
			() -> new FeverSlotItem(new Item.Properties()).AddToTabList(RiderTabs.GEATS_TAB_ITEM));

	
	  public static List<Item> NEED_ITEM_COMMAND_TWIN= new ArrayList<Item>();
	  
	public static final RegistryObject<Item> COMMAND_TWIN_BUCKLE_JET = ITEMS.register("command_twin_buckle_jet",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_raising","geats","desire_driver_belt_geats",
					new MobEffectInstance(Effect_core.SLASH.get(), 40, 2,true,false))
			.ChangeSlot(2).SetOffhandSlot(3).AddCompatibilityList(new String[] {"buffa","tycoon"}
					).AddToTabList(NEED_ITEM_COMMAND_TWIN).AddToTabList(RiderTabs.GEATS_TAB_ITEM));

	public static final RegistryObject<Item> COMMAND_TWIN_BUCKLE_CANNON_l = ITEMS.register("command_twin_buckle_cannon_l",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_cannon","geats","desire_driver_belt_geats",
					new MobEffectInstance(Effect_core.FLYING.get(), 40, 0,true,false),
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 3,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
					new MobEffectInstance(MobEffects.JUMP, 40, 3,true,false))
			.ChangeSlot(3).AddCompatibilityList(new String[] {"buffa","tycoon"}
					).addNeedForm(COMMAND_TWIN_BUCKLE_JET.get(), 2));

	public static final RegistryObject<Item> COMMAND_TWIN_BUCKLE_CANNON = ITEMS.register("command_twin_buckle_cannon",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_cannon","geats","desire_driver_belt_geats",
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 2,true,false),
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 3,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 3,true,false),
					new MobEffectInstance(MobEffects.JUMP, 40, 3,true,false))
			.ChangeSlot(2).AddCompatibilityList(new String[] {"buffa","tycoon"})
			.addNeedForm(COMMAND_TWIN_BUCKLE_JET.get(), 3).addAlternative(COMMAND_TWIN_BUCKLE_CANNON_l.get()).AddToTabList(RiderTabs.GEATS_TAB_ITEM));

	
	public static final RegistryObject<Item> BOOST_MKII_RAISE_BUCKLE = ITEMS.register("boost_mkii_raise_buckle",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_boost_mkii","geats","desire_driver_belt_geats",
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 3,true,false),
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 4,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 3,true,false),
					new MobEffectInstance(MobEffects.JUMP, 40, 3,true,false),
					new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 40, 0,true,false),
					new MobEffectInstance(Effect_core.FIRE_PUNCH.get(), 40, 3,true,false),
					new MobEffectInstance(Effect_core.BOOST.get(), 40, 2,true,false))
			.ChangeSlot(2).AddCompatibilityList(new String[] {"tycoon"}).alsoChange3rdSlot(Modded_item_core.BLANK_FORM.get()).AddToTabList(RiderTabs.GEATS_TAB_ITEM));

	public static final RegistryObject<Item> UNITE_GRIP = ITEMS.register("unite_grip",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_laser_boost","geats","desire_driver_belt_geats",
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 4,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 3,true,false),
					new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 40, 0,true,false),
					new MobEffectInstance(Effect_core.FIRE_SHOT.get(), 40, 3,true,false),
					new MobEffectInstance(Effect_core.FLYING.get(), 40, 3,true,false))
			.ChangeSlot(2).addNeedForm(BOOST_MKII_RAISE_BUCKLE.get(), 2).alsoChange3rdSlot(BOOST_MKII_RAISE_BUCKLE.get()).AddToTabList(RiderTabs.GEATS_TAB_ITEM));

	public static final RegistryObject<Item> BOOST_MKIII_RAISE_BUCKLE = ITEMS.register("boost_mkiii_raise_buckle",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_boost_mkiii","geats","desire_driver_belt_geats",
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 5,true,false),
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 6,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 4,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 3,true,false),
					new MobEffectInstance(MobEffects.JUMP, 40, 5,true,false),
					new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 40, 0,true,false),
					new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 0,true,false),
					new MobEffectInstance(Effect_core.FIRE_PUNCH.get(), 40, 4,true,false),
					new MobEffectInstance(Effect_core.BOOST.get(), 40, 4,true,false))
			.ChangeSlot(2).SetOffhandSlot(3).AddToTabList(RiderTabs.GEATS_TAB_ITEM));
	
	public static final RegistryObject<Item> ONENESS_RAISE_BUCKLE = ITEMS.register("oneness_raise_buckle",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_oneness","geats","desire_driver_belt_geats",
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 6,true,false),
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 7,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 4,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 3,true,false),
					new MobEffectInstance(MobEffects.JUMP, 40, 5,true,false),
					new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 40, 0,true,false),
					new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 0,true,false),
					new MobEffectInstance(MobEffects.LUCK, 40, 1,true,false),
					new MobEffectInstance(MobEffects.SLOW_FALLING, 40, 0,true,false),
					new MobEffectInstance(Effect_core.ANTIPOISON.get(), 40, 0,true,false),
					new MobEffectInstance(Effect_core.FIRE_PUNCH.get(), 40, 4,true,false),
					new MobEffectInstance(Effect_core.BOOST.get(), 40, 4,true,false))
			.ChangeSlot(2).addNeedItem(GEATS_ONENESS_CORE_ID.get()).addNeedForm(BOOST_MKIII_RAISE_BUCKLE.get(), 3).AddToTabList(RiderTabs.GEATS_TAB_ITEM));

	public static final RegistryObject<Item> XGEATS_RAISE_BUCKLE = ITEMS.register("x_geats_raise_buckle",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_x_geats","x_geats","desire_driver_belt_vice",
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 5,true,false),
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 6,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 3,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 3,true,false),
					new MobEffectInstance(MobEffects.JUMP, 40, 5,true,false),
					new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 0,true,false),
					new MobEffectInstance(MobEffects.LUCK, 40, 0,true,false),
					new MobEffectInstance(Effect_core.SLASH.get(), 40, 4,true,false),
					new MobEffectInstance(Effect_core.BOOST.get(), 40, 4,true,false))
			.ChangeSlot(2).SetOffhandSlot(3).AddToTabList(RiderTabs.GEATS_TAB_ITEM));

	public static final RegistryObject<Item> DOOMS_GEATS_RAISE_BUCKLE = ITEMS.register("dooms_geats_raise_buckle",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_dooms_geats","dooms_geats","desire_driver_belt_dooms_geats",
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 5,true,false),
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 6,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 4,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 3,true,false),
					new MobEffectInstance(MobEffects.JUMP, 40, 5,true,false),
					new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 40, 0,true,false),
					new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 0,true,false),
					new MobEffectInstance(Effect_core.FIRE_PUNCH.get(), 40, 4,true,false),
					new MobEffectInstance(Effect_core.BOOST.get(), 40, 4,true,false))
			.ChangeSlot(2).SetOffhandSlot(3).AddToTabList(RiderTabs.GEATS_TAB_ITEM));

	public static final RegistryObject<Item> BUJIN_SWORD_RAISE_BUCKLE = ITEMS.register("bujin_sword_raise_buckle",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_bujin_sword","tycoon","desire_driver_belt_geats",
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 4,true,false),
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 4,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 3,true,false),
					new MobEffectInstance(MobEffects.JUMP, 40, 3,true,false),
					new MobEffectInstance(Effect_core.SLASH.get(), 40, 4,true,false))
			.ChangeSlot(3).alsoChange2ndSlot(Modded_item_core.BLANK_FORM.get()).AddToTabList(RiderTabs.GEATS_TAB_ITEM));

	public static final RegistryObject<Item> PLOSION_RAGE_RAISE_BUCKLE = ITEMS.register("plosion_rage_raise_buckle",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_plosion_rage_2","buffa","desire_driver_belt_geats",
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 3,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 5,true,false),
					new MobEffectInstance(MobEffects.JUMP, 40, 1,true,false),
					new MobEffectInstance(Effect_core.ANTIPOISON.get(), 40, 0,true,false))
			.ChangeSlot(3).alsoChange1stSlot(BUFFA_CORE_ID.get()).alsoChange2ndSlot(Modded_item_core.BLANK_FORM.get()).AddToTabList(RiderTabs.GEATS_TAB_ITEM));

	public static final RegistryObject<Item> JYAMATO_BUCKLE_BUFFA = ITEMS.register("jyamato_buckle_buffa",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_jyamato","buffa","desire_driver_belt_geats",
					new MobEffectInstance(MobEffects.WITHER, 40, 0,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 1,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 3,true,false))
			.addNeedForm(BUFFA_CORE_ID_CRACKED.get(),1).ChangeSlot(2).SetOffhandSlot(3));


	public static final RegistryObject<Item> JYAMATO_BUCKLE = ITEMS.register("jyamato_buckle",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_jyamato","jyamato","desire_driver_belt_geats",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 1,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 3,true,false))
			.ChangeSlot(2).SetOffhandSlot(3).addAlternative(JYAMATO_BUCKLE_BUFFA.get()).AddCompatibilityList(new String[] {"gm_chirami"}
					).AddToTabList(RiderTabs.GEATS_TAB_ITEM));

	//Armed 
	public static final RegistryObject<Item> ARROW_RAISE_BUCKLE = ITEMS.register("arrow_raise_buckle",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_arrow","geats","desire_driver_belt_geats",
					new MobEffectInstance(Effect_core.EXPLOSION_SHOT.get(), 40, 0,true,false))
			.ChangeSlot(2).SetOffhandSlot(3).AddCompatibilityList(BaseDesireDriverUsers).AddToTabList(MissionBoxItem.RAISE_BUCKLE, 10).AddToTabList(RiderTabs.GEATS_TAB_ITEM));

	public static final RegistryObject<Item> WATER_RAISE_BUCKLE = ITEMS.register("water_raise_buckle",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_water","geats","desire_driver_belt_geats",
					new MobEffectInstance(MobEffects.WATER_BREATHING, 40, 0,true,false))
			.ChangeSlot(2).SetOffhandSlot(3).AddCompatibilityList(BaseDesireDriverUsers).AddToTabList(MissionBoxItem.RAISE_BUCKLE, 10).AddToTabList(RiderTabs.GEATS_TAB_ITEM));

	public static final RegistryObject<Item> HAMMER_RAISE_BUCKLE = ITEMS.register("hammer_raise_buckle",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_hammer","geats","desire_driver_belt_geats",
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 1,true,false))
			.ChangeSlot(2).SetOffhandSlot(3).AddCompatibilityList(BaseDesireDriverUsers).AddToTabList(MissionBoxItem.RAISE_BUCKLE, 10).AddToTabList(RiderTabs.GEATS_TAB_ITEM));

	public static final RegistryObject<Item> SHIELD_RAISE_BUCKLE = ITEMS.register("shield_raise_buckle",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_shield","geats","desire_driver_belt_geats",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 0,true,false))
			.ChangeSlot(2).SetOffhandSlot(3).AddCompatibilityList(BaseDesireDriverUsers).AddToTabList(MissionBoxItem.RAISE_BUCKLE, 10).AddToTabList(RiderTabs.GEATS_TAB_ITEM));

	public static final RegistryObject<Item> CHAIN_ARRAY_RAISE_BUCKLE = ITEMS.register("chain_array_raise_buckle",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_chain_array","geats","desire_driver_belt_geats",
					new MobEffectInstance(MobEffects.DIG_SLOWDOWN, 40, 0,true,false),
			new MobEffectInstance(Effect_core.SLASH.get(), 40, 1,true,false))
			.ChangeSlot(2).SetOffhandSlot(3).AddCompatibilityList(BaseDesireDriverUsers).AddToTabList(MissionBoxItem.RAISE_BUCKLE, 8).AddToTabList(RiderTabs.GEATS_TAB_ITEM));

	public static final RegistryObject<Item> CLAW_RAISE_BUCKLE = ITEMS.register("claw_raise_buckle",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_claw","geats","desire_driver_belt_geats",
					new MobEffectInstance(Effect_core.SLASH.get(), 40, 0,true,false))
			.ChangeSlot(2).SetOffhandSlot(3).AddCompatibilityList(BaseDesireDriverUsers).AddToTabList(MissionBoxItem.RAISE_BUCKLE, 8).AddToTabList(RiderTabs.GEATS_TAB_ITEM));

	public static final RegistryObject<Item> DRILL_RAISE_BUCKLE = ITEMS.register("drill_raise_buckle",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_drill","geats","desire_driver_belt_geats",
					new MobEffectInstance(Effect_core.PUNCH.get(), 40, 2,true,false))
			.ChangeSlot(2).SetOffhandSlot(3).ChangeModel("geats_rider_drill.geo.json").AddCompatibilityList(BaseDesireDriverUsers).AddToTabList(MissionBoxItem.RAISE_BUCKLE, 5).AddToTabList(RiderTabs.GEATS_TAB_ITEM));

	public static final RegistryObject<Item> PROPELLER_RAISE_BUCKLE = ITEMS.register("propeller_raise_buckle",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_propeller","geats","desire_driver_belt_geats",
					new MobEffectInstance(MobEffects.JUMP, 40, 6,true,false),
					new MobEffectInstance(MobEffects.SLOW_FALLING, 40, 6,true,false))
			.ChangeSlot(2).SetOffhandSlot(3).AddCompatibilityList(BaseDesireDriverUsers).AddToTabList(MissionBoxItem.RAISE_BUCKLE, 5).AddToTabList(RiderTabs.GEATS_TAB_ITEM));

	public static final RegistryObject<Item> GIGANT_CONTAINER_BUCKLE = ITEMS.register("gigant_container_buckle",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_gigant_container","geats","desire_driver_belt_geats",
					new MobEffectInstance(Effect_core.FLYING.get(), 40, 0,true,false))
			.ChangeSlot(2).SetOffhandSlot(3).AddCompatibilityList(BaseDesireDriverUsers).AddToTabList(RiderTabs.GEATS_TAB_ITEM));

	public static final RegistryObject<Item> GIGANT_SWORD_BUCKLE = ITEMS.register("gigant_sword_buckle",
			() -> new BaseItem(new Item.Properties()).AddToTabList(MissionBoxItem.GIGANT_BUCKLE).AddToTabList(RiderTabs.GEATS_TAB_ITEM));

	public static final RegistryObject<Item> GIGANT_HAMMER_BUCKLE = ITEMS.register("gigant_hammer_buckle",
			() -> new BaseItem(new Item.Properties()).AddToTabList(MissionBoxItem.GIGANT_BUCKLE).AddToTabList(RiderTabs.GEATS_TAB_ITEM));

	public static final RegistryObject<Item> GIGANT_BLASTER_BUCKLE = ITEMS.register("gigant_blaster_buckle",
			() -> new BaseItem(new Item.Properties()).AddToTabList(MissionBoxItem.GIGANT_BUCKLE).AddToTabList(RiderTabs.GEATS_TAB_ITEM));

	public static final RegistryObject<Item> MAGNUM_SHOOTER_40X_RAISE_BUCKLE = ITEMS.register("magnum_shooter_40x_raise_buckle",
			() -> new BaseItem(new Item.Properties()).AddToTabList(MissionBoxItem.GIGANT_BUCKLE).AddToTabList(RiderTabs.GEATS_TAB_ITEM));

	public static final RegistryObject<Item> NINJA_DUELER_RAISE_BUCKLE = ITEMS.register("ninja_dueler_raise_buckle",
			() -> new BaseItem(new Item.Properties()).AddToTabList(MissionBoxItem.GIGANT_BUCKLE).AddToTabList(RiderTabs.GEATS_TAB_ITEM));

	public static final RegistryObject<Item> ZOMBIE_BREAKER_RAISE_BUCKLE = ITEMS.register("zombie_breaker_raise_buckle",
			() -> new BaseItem(new Item.Properties()).AddToTabList(MissionBoxItem.GIGANT_BUCKLE).AddToTabList(RiderTabs.GEATS_TAB_ITEM));

	public static final RegistryObject<Item> BEAT_AXE_RAISE_BUCKLE = ITEMS.register("beat_axe_raise_buckle",
			() -> new BaseItem(new Item.Properties()).AddToTabList(MissionBoxItem.GIGANT_BUCKLE).AddToTabList(RiderTabs.GEATS_TAB_ITEM));

	public static final RegistryObject<Item> CHRISTMAS_BUCKLE = ITEMS.register("christmas_buckle",
			() -> new BaseItem(new Item.Properties()).AddToTabList(MissionBoxItem.RAISE_BUCKLE).AddToTabList(RiderTabs.GEATS_TAB_ITEM));

	public static final RegistryObject<Item> GOLD_HAMMER_RAISE_BUCKLE = ITEMS.register("golden_hammer_raise_buckle",
			() -> new BaseItem(new Item.Properties()).AddToTabList(MissionBoxItem.RAISE_BUCKLE).AddToTabList(RiderTabs.GEATS_TAB_ITEM));

	public static final RegistryObject<Item> SILVER_ARROW_RAISE_BUCKLE = ITEMS.register("silver_arrow_raise_buckle",
			() -> new BaseItem(new Item.Properties()).AddToTabList(MissionBoxItem.RAISE_BUCKLE).AddToTabList(RiderTabs.GEATS_TAB_ITEM));

	public static final RegistryObject<Item> CLEAR_ARROW_RAISE_BUCKLE = ITEMS.register("clear_arrow_raise_buckle",
			() -> new BaseItem(new Item.Properties()).AddToTabList(MissionBoxItem.RAISE_BUCKLE).AddToTabList(RiderTabs.GEATS_TAB_ITEM));

	public static final RegistryObject<Item> BEAT_RAISE_BUCKLE_THEME = ITEMS.register("beat_raise_buckle_theme",
			() -> new BaseItem(new Item.Properties()).AddToTabList(MissionBoxItem.RAISE_BUCKLE).AddToTabList(RiderTabs.GEATS_TAB_ITEM));

	public static final RegistryObject<Item> SHINOBI_RAISE_BUCKLE = ITEMS.register("shinobi_raise_buckle",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_shinobi","geats","desire_driver_belt_geats",
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 2,true,false),
					new MobEffectInstance(MobEffects.JUMP, 40, 4,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 1,true,false))
			.ChangeSlot(2).AddCompatibilityList(BaseDesireDriverUsers).AddToTabList(RiderTabs.GEATS_TAB_ITEM));

	// Legend Rider
	public static final RegistryObject<Item> REVICE_DRIVER_RAISE_BUCKLE_GEATS = ITEMS.register("revice_driver_raise_buckle_geats",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_revice","geats","desire_driver_belt_geats",
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 0,true,false),
					new MobEffectInstance(MobEffects.JUMP, 40, 0,true,false))
			.ChangeSlot(2).SetOffhandSlot(3).AddCompatibilityList(BaseDesireDriverUsers));
	public static final RegistryObject<Item> REVICE_DRIVER_RAISE_BUCKLE_VICE = ITEMS.register("revice_driver_raise_buckle_vice",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"","geats_vice","desire_driver_belt_geats",
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 0,true,false),
					new MobEffectInstance(MobEffects.JUMP, 40, 0,true,false))
			.addAlternative(REVICE_DRIVER_RAISE_BUCKLE_GEATS.get()).ChangeSlot(2).alsoChange3rdSlot(Modded_item_core.BLANK_FORM.get()));
	public static final RegistryObject<Item> REVICE_DRIVER_RAISE_BUCKLE = ITEMS.register("revice_driver_raise_buckle",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"","geats_revi","desire_driver_belt_geats",
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 0,true,false),
					new MobEffectInstance(MobEffects.JUMP, 40, 0,true,false))
			.addAlternative(REVICE_DRIVER_RAISE_BUCKLE_VICE.get()).ChangeSlot(2).alsoChange3rdSlot(Modded_item_core.BLANK_FORM.get()).AddToTabList(RiderTabs.GEATS_TAB_ITEM));

	public static final RegistryObject<Item> TWO_SI_DRIVER_RAISE_BUCKLE = ITEMS.register("two_si_driver_raise_buckle",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_live","geats","desire_driver_belt_geats",
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 0,true,false),
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 0,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 0,true,false))
			.ChangeSlot(2).SetOffhandSlot(3).AddCompatibilityList(BaseDesireDriverUsers).AddToTabList(RiderTabs.GEATS_TAB_ITEM));

	public static final RegistryObject<Item> LIBERA_DRIVER_RAISE_BUCKLE = ITEMS.register("libera_driver_raise_buckle",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_jeanne","geats","desire_driver_belt_geats",
					new MobEffectInstance(Effect_core.PUNCH.get(), 40, 5,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 1,true,false),
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 1,true,false),
					new MobEffectInstance(Effect_core.ANTIPOISON.get(), 40, 0,true,false))
			.ChangeSlot(2).SetOffhandSlot(3).AddCompatibilityList(BaseDesireDriverUsers).AddToTabList(RiderTabs.GEATS_TAB_ITEM));

	public static final RegistryObject<Item> DEMONS_DRIVER_RAISE_BUCKLE = ITEMS.register("demons_driver_raise_buckle",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_demons","geats","desire_driver_belt_geats",
					new MobEffectInstance(MobEffects.POISON, 40, 0,true,false),
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 1,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 1,true,false))
			.ChangeSlot(2).SetOffhandSlot(3).AddCompatibilityList(BaseDesireDriverUsers).AddToTabList(RiderTabs.GEATS_TAB_ITEM));

	public static final RegistryObject<Item> SEIKEN_SWORDRIVER_RAISE_BUCKLE = ITEMS.register("seiken_swordriver_raise_buckle",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_saber","geats","desire_driver_belt_geats",
					new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 40, 0,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 0,true,false))
			.ChangeSlot(2).SetOffhandSlot(3).AddCompatibilityList(BaseDesireDriverUsers).AddToTabList(RiderTabs.GEATS_TAB_ITEM));

	public static final RegistryObject<Item> ZERO_ONE_DRIVER_RAISE_BUCKLE = ITEMS.register("zero_one_driver_raise_buckle",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_zero_one","geats","desire_driver_belt_geats",
					new MobEffectInstance(MobEffects.JUMP, 40, 3,true,false))
			.ChangeSlot(2).SetOffhandSlot(3).AddCompatibilityList(BaseDesireDriverUsers).AddToTabList(RiderTabs.GEATS_TAB_ITEM));

	public static final RegistryObject<Item> ZIKUU_DRIVER_RAISE_BUCKLE = ITEMS.register("zikuu_driver_raise_buckle",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_zi_o","geats","desire_driver_belt_geats",
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 1,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 0,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 0,true,false))
			.ChangeSlot(2).SetOffhandSlot(3).AddCompatibilityList(BaseDesireDriverUsers).AddToTabList(RiderTabs.GEATS_TAB_ITEM));

	public static final RegistryObject<Item> BUILD_DRIVER_RAISE_BUCKLE = ITEMS.register("build_driver_raise_buckle",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_build","geats","desire_driver_belt_geats",
					new MobEffectInstance(MobEffects.JUMP, 40, 2,true,false),
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 0,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 0,true,false))
			.ChangeSlot(2).SetOffhandSlot(3).AddCompatibilityList(BaseDesireDriverUsers).AddToTabList(RiderTabs.GEATS_TAB_ITEM));

	public static final RegistryObject<Item> GAMER_DRIVER_RAISE_BUCKLE = ITEMS.register("gamer_driver_raise_buckle",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_ex_aid","geats","desire_driver_belt_geats",
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 0,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 0,true,false))
			.ChangeSlot(2).SetOffhandSlot(3).AddCompatibilityList(BaseDesireDriverUsers).AddToTabList(RiderTabs.GEATS_TAB_ITEM));

	public static final RegistryObject<Item> GHOST_DRIVER_RAISE_BUCKLE = ITEMS.register("ghost_driver_raise_buckle",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_ghost","geats","desire_driver_belt_geats",
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 0,true,false))
			.ChangeSlot(2).SetOffhandSlot(3).AddCompatibilityList(BaseDesireDriverUsers).AddToTabList(RiderTabs.GEATS_TAB_ITEM));

	public static final RegistryObject<Item> DRIVE_DRIVER_RAISE_BUCKLE = ITEMS.register("drive_driver_raise_buckle",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_drive","geats","desire_driver_belt_geats",
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 1,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 1,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 0,true,false))
			.ChangeSlot(2).SetOffhandSlot(3).AddCompatibilityList(BaseDesireDriverUsers).AddToTabList(RiderTabs.GEATS_TAB_ITEM));

	public static final RegistryObject<Item> SENGOKU_DRIVER_RAISE_BUCKLE = ITEMS.register("sengoku_driver_raise_buckle",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_gaim","geats","desire_driver_belt_geats",
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 0,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 0,true,false))
			.ChangeSlot(2).SetOffhandSlot(3).AddCompatibilityList(BaseDesireDriverUsers).AddToTabList(RiderTabs.GEATS_TAB_ITEM));

	public static final RegistryObject<Item> WIZARDRIVER_RAISE_BUCKLE = ITEMS.register("wizardriver_raise_buckle",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_wizard","geats","desire_driver_belt_geats",
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 0,true,false),
					new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 40, 0,true,false))
			.ChangeSlot(2).SetOffhandSlot(3).AddCompatibilityList(BaseDesireDriverUsers).AddToTabList(RiderTabs.GEATS_TAB_ITEM));

	public static final RegistryObject<Item> FOURZE_DRIVER_RAISE_BUCKLE = ITEMS.register("fourze_driver_raise_buckle",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_fourze","geats","desire_driver_belt_geats",
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 0,true,false),
					new MobEffectInstance(MobEffects.JUMP, 40, 1,true,false),
					new MobEffectInstance(Effect_core.BOOST.get(), 40, 0,true,false))
			.ChangeSlot(2).SetOffhandSlot(3).AddCompatibilityList(BaseDesireDriverUsers).AddToTabList(RiderTabs.GEATS_TAB_ITEM));

	public static final RegistryObject<Item> OOO_DRIVER_RAISE_BUCKLE = ITEMS.register("ooo_driver_raise_buckle",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_ooo","geats","desire_driver_belt_geats",
					new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 0,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 1,true,false),
					new MobEffectInstance(MobEffects.JUMP, 40, 2,true,false))
			.ChangeSlot(2).SetOffhandSlot(3).AddCompatibilityList(BaseDesireDriverUsers).AddToTabList(RiderTabs.GEATS_TAB_ITEM));

	public static final RegistryObject<Item> DOUBLE_DRIVER_RAISE_BUCKLE = ITEMS.register("double_driver_raise_buckle",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_w","geats","desire_driver_belt_geats",
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 1,true,false),
					new MobEffectInstance(MobEffects.JUMP, 40, 0,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 1,true,false))
			.ChangeSlot(2).SetOffhandSlot(3).AddCompatibilityList(BaseDesireDriverUsers).AddToTabList(RiderTabs.GEATS_TAB_ITEM));

	public static final RegistryObject<Item> DECA_DRIVER_RAISE_BUCKLE = ITEMS.register("deca_driver_raise_buckle",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_decade","geats","desire_driver_belt_geats",
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 1,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 0,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 0,true,false))
			.ChangeSlot(2).SetOffhandSlot(3).AddCompatibilityList(BaseDesireDriverUsers).AddToTabList(RiderTabs.GEATS_TAB_ITEM));

	public static final RegistryObject<Item> KIVAT_BELT_RAISE_BUCKLE = ITEMS.register("kivat_belt_raise_buckle",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_kiva","geats","desire_driver_belt_geats",
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 0,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 0,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 0,true,false))
			.ChangeSlot(2).SetOffhandSlot(3).AddCompatibilityList(BaseDesireDriverUsers).AddToTabList(RiderTabs.GEATS_TAB_ITEM));

	public static final RegistryObject<Item> DEN_O_BELT_RAISE_BUCKLE = ITEMS.register("den_o_belt_raise_buckle",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_den_o","geats","desire_driver_belt_geats",
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 1,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 0,true,false))
			.ChangeSlot(2).SetOffhandSlot(3).AddCompatibilityList(BaseDesireDriverUsers).AddToTabList(RiderTabs.GEATS_TAB_ITEM));

	public static final RegistryObject<Item> KABUTO_ZECTOR_RAISE_BUCKLE = ITEMS.register("kabuto_zector_raise_buckle",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_kabuto","geats","desire_driver_belt_geats",
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 3,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 3,true,false))
			.ChangeSlot(2).SetOffhandSlot(3).AddCompatibilityList(BaseDesireDriverUsers).AddToTabList(RiderTabs.GEATS_TAB_ITEM));

	public static final RegistryObject<Item> ONGEKIKO_KAENTSUZUMI_RAISE_BUCKLE = ITEMS.register("ongekiko_kaentsuzumi_raise_buckle",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_hibiki","geats","desire_driver_belt_geats",
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 0,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 1,true,false),
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 0,true,false))
			.ChangeSlot(2).SetOffhandSlot(3).AddCompatibilityList(BaseDesireDriverUsers).AddToTabList(RiderTabs.GEATS_TAB_ITEM));

	public static final RegistryObject<Item> BLAY_BUCKLE_RAISE_BUCKLE = ITEMS.register("blay_buckle_raise_buckle",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_blade","geats","desire_driver_belt_geats",
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 1,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 0,true,false))
			.ChangeSlot(2).SetOffhandSlot(3).AddCompatibilityList(BaseDesireDriverUsers).AddToTabList(RiderTabs.GEATS_TAB_ITEM));

	public static final RegistryObject<Item> FAIZ_DRIVER_RAISE_BUCKLE = ITEMS.register("faiz_driver_raise_buckle",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_faiz","geats","desire_driver_belt_geats",
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 1,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 0,true,false),
					new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 0,true,false))
			.ChangeSlot(2).SetOffhandSlot(3).AddCompatibilityList(BaseDesireDriverUsers).AddToTabList(RiderTabs.GEATS_TAB_ITEM));

	public static final RegistryObject<Item> V_BUCKLE_RAISE_BUCKLE = ITEMS.register("v_buckle_raise_buckle",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_ryuki","geats","desire_driver_belt_geats",
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 0,true,false),
					new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 40, 0,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 0,true,false))
			.ChangeSlot(2).SetOffhandSlot(3).AddCompatibilityList(BaseDesireDriverUsers).AddToTabList(RiderTabs.GEATS_TAB_ITEM));

	public static final RegistryObject<Item> ALTER_RING_RAISE_BUCKLE = ITEMS.register("alter_ring_raise_buckle",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_agito","geats","desire_driver_belt_geats",
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 0,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 0,true,false))
			.ChangeSlot(2).SetOffhandSlot(3).AddCompatibilityList(BaseDesireDriverUsers).AddToTabList(RiderTabs.GEATS_TAB_ITEM));

	public static final RegistryObject<Item> ARCLE_RAISE_BUCKLE = ITEMS.register("arcle_raise_buckle",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_kuuga","geats","desire_driver_belt_geats",
					new MobEffectInstance(Effect_core.PUNCH.get(), 40, 4,true,false))
			.ChangeSlot(2).SetOffhandSlot(3).AddCompatibilityList(BaseDesireDriverUsers).AddToTabList(RiderTabs.GEATS_TAB_ITEM));

	public static final RegistryObject<Item> KING_STONE_RAISE_BUCKLE = ITEMS.register("king_stone_raise_buckle",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_black","geats","desire_driver_belt_geats",
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 1,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 1,true,false),
					new MobEffectInstance(Effect_core.PUNCH.get(), 40, 4,true,false))
			.ChangeSlot(2).SetOffhandSlot(3).AddCompatibilityList(BaseDesireDriverUsers).AddToTabList(RiderTabs.GEATS_TAB_ITEM));

	public static final RegistryObject<Item> DOUBLE_TYPHOON_RAISE_BUCKLE = ITEMS.register("double_typhoon_raise_buckle",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_v3","geats","desire_driver_belt_geats",
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 1,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 1,true,false),
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 1,true,false),
					new MobEffectInstance(MobEffects.JUMP, 40, 2,true,false),
					new MobEffectInstance(Effect_core.PUNCH.get(), 40, 4,true,false))
			.ChangeSlot(2).SetOffhandSlot(3).AddCompatibilityList(BaseDesireDriverUsers).AddToTabList(RiderTabs.GEATS_TAB_ITEM));

	public static final RegistryObject<Item> TYPHOON_RAISE_BUCKLE = ITEMS.register("typhoon_raise_buckle",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_ichigo","geats","desire_driver_belt_geats",
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 1,true,false),
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 1,true,false),
					new MobEffectInstance(MobEffects.JUMP, 40, 2,true,false),
					new MobEffectInstance(Effect_core.PUNCH.get(), 40, 4,true,false))
			.ChangeSlot(2).SetOffhandSlot(3).AddCompatibilityList(BaseDesireDriverUsers).AddToTabList(RiderTabs.GEATS_TAB_ITEM));

	public static final RegistryObject<Item> OUJA_V_BUCKLE_RAISE_BUCKLE = ITEMS.register("ouja_v_buckle_raise_buckle",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_ouja","geats","desire_driver_belt_geats",
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 2,true,false),
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 0,true,false))
			.ChangeSlot(2).SetOffhandSlot(3).AddCompatibilityList(BaseDesireDriverUsers).AddToTabList(RiderTabs.GEATS_TAB_ITEM));
	
	public static final RegistryObject<Item> KING_OHGER_RAISE_BUCKLE = ITEMS.register("king_ohger_raise_buckle",
			() -> new BaseItem(new Item.Properties()).AddToTabList(RiderTabs.GEATS_TAB_ITEM));

	public static final RegistryObject<Item> ZIIN_RAISE_RISER_CARD = ITEMS.register("ziin_raise_riser_card",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"","ziin","raise_riser_belt",
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 0,true,false),
					new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 0,true,false),
					new MobEffectInstance(MobEffects.SLOW_FALLING, 40, 3,true,false),
					new MobEffectInstance(MobEffects.JUMP, 40, 5,true,false))
			.ChangeModel("geo/ziin.geo.json").AddToTabList(RiderTabs.GEATS_TAB_ITEM));

	public static final RegistryObject<Item> BEROBA_RAISE_RISER_CARD = ITEMS.register("beroba_raise_riser_card",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"","beroba","raise_riser_belt",
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 1,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 0,true,false),
					new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 0,true,false),
					new MobEffectInstance(Effect_core.BIG.get(), 40, 2,true,false),
					new MobEffectInstance(MobEffects.JUMP, 40, 5,true,false))
			.ChangeModel("geo/beroba.geo.json").SetPalyerModelInvisible().AddToTabList(RiderTabs.GEATS_TAB_ITEM));

	public static final RegistryObject<Item> BEROBA_BLACK_RAISE_RISER_CARD = ITEMS.register("beroba_black_raise_riser_card",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_premium","beroba","raise_riser_belt_premium",
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 1,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 0,true,false),
					new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 0,true,false),
					new MobEffectInstance(MobEffects.JUMP, 40, 5,true,false))
			.AddToTabList(RiderTabs.GEATS_TAB_ITEM));

	public static final RegistryObject<Item> KEKERA_RAISE_RISER_CARD = ITEMS.register("kekera_raise_riser_card",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"","kekera","blank",
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 0,true,false),
					new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 0,true,false),
					new MobEffectInstance(Effect_core.BIG.get(), 40, 1,true,false),
					new MobEffectInstance(MobEffects.JUMP, 40, 8,true,false))
			.ChangeModel("geo/kekera.geo.json").SetPalyerModelInvisible().AddToTabList(RiderTabs.GEATS_TAB_ITEM));

	public static final RegistryObject<Item> KYUUN_RAISE_RISER_CARD = ITEMS.register("kyuun_raise_riser_card",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"","kyuun","blank",
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 0,true,false),
					new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 0,true,false),
					new MobEffectInstance(Effect_core.BIG.get(), 40, 1,true,false),
					new MobEffectInstance(Effect_core.FLYING.get(), 40, 0,true,false))
			.ChangeModel("geo/kyuun.geo.json").SetPalyerModelInvisible().AddToTabList(RiderTabs.GEATS_TAB_ITEM));

	public static final RegistryObject<Item> KEKERA_BLACK_RAISE_RISER_CARD = ITEMS.register("kekera_black_raise_riser_card",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_premium","kekera","raise_riser_belt_premium_kekera",
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 0,true,false),
					new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 0,true,false),
					new MobEffectInstance(MobEffects.JUMP, 40, 8,true,false))
			.AddToTabList(RiderTabs.GEATS_TAB_ITEM));

	
	public static final RegistryObject<Item> PROVIDENCE_CARD_GLARE = ITEMS.register("providence_card_glare",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"","glare","vision_driver_belt",
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 3,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 3,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
					new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 0,true,false),
					new MobEffectInstance(MobEffects.SLOW_FALLING, 40, 3,true,false),
					new MobEffectInstance(MobEffects.JUMP, 40, 5,true,false))
			.AddToTabList(RiderTabs.GEATS_TAB_ITEM));

	public static final RegistryObject<Item> PROVIDENCE_CARD_GLARE2 = ITEMS.register("providence_card_glare2",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"","glare2","vision_driver_belt",
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 3,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 3,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
					new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 0,true,false),
					new MobEffectInstance(MobEffects.SLOW_FALLING, 40, 3,true,false),
					new MobEffectInstance(MobEffects.JUMP, 40, 5,true,false))
			.AddToTabList(RiderTabs.GEATS_TAB_ITEM));

	public static final RegistryObject<Item> PROVIDENCE_CARD_GAZER = ITEMS.register("providence_card_gazer",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"","gazer","vision_driver_belt_gazer",
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 3,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 3,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
					new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 0,true,false),
					new MobEffectInstance(MobEffects.SLOW_FALLING, 40, 3,true,false),
					new MobEffectInstance(MobEffects.JUMP, 40, 5,true,false))
			.AddToTabList(RiderTabs.GEATS_TAB_ITEM));
	
	public static final RegistryObject<Item> SIRIUS_CARD_OMEGA = ITEMS.register("sirius_card_omega",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_omega","regad","zillion_driver_omega_belt",
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 3,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 3,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
					new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 0,true,false),
					new MobEffectInstance(MobEffects.SLOW_FALLING, 40, 3,true,false),
					new MobEffectInstance(MobEffects.JUMP, 40, 5,true,false)));
	
	public static final RegistryObject<Item> SIRIUS_CARD = ITEMS.register("sirius_card",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"","regad","zillion_driver_belt",
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 3,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 3,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
					new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 0,true,false),
					new MobEffectInstance(MobEffects.SLOW_FALLING, 40, 3,true,false),
					new MobEffectInstance(MobEffects.JUMP, 40, 5,true,false))
			.addSwitchForm(SIRIUS_CARD_OMEGA.get()).AddToTabList(RiderTabs.GEATS_TAB_ITEM));

	public static final RegistryObject<Item> SIRIUS_CARD_GAZER_ZERO = ITEMS.register("sirius_card_gazer_zero",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"","gazer_zero","zillion_driver_gazer_zero_belt",
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 3,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 3,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
					new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 0,true,false),
					new MobEffectInstance(MobEffects.SLOW_FALLING, 40, 3,true,false),
					new MobEffectInstance(MobEffects.JUMP, 40, 5,true,false))
			.AddToTabList(RiderTabs.GEATS_TAB_ITEM));



	public static final RegistryObject<Item> GEATS_HELMET = ITEMS.register("geatshead",
			() -> new RiderArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.HELMET, new Item.Properties()).AddToTabList(RiderTabs.GEATS_TAB_ITEM).ChangeRepairItem(BLANK_CORE_ID.get()));
	public static final RegistryObject<Item> GEATS_CHESTPLATE = ITEMS.register("geatstroso",
			() -> new RiderArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.CHESTPLATE, new Item.Properties()).AddToTabList(RiderTabs.GEATS_TAB_ITEM).ChangeRepairItem(BLANK_CORE_ID.get()));
	public static final RegistryObject<Item> GEATS_LEGGINGS = ITEMS.register("geatslegs",
			() -> new RiderArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.LEGGINGS, new Item.Properties()).AddToTabList(RiderTabs.GEATS_TAB_ITEM).ChangeRepairItem(BLANK_CORE_ID.get()));


	public static final RegistryObject<Item> DESIRE_DRIVER_GEATS = ITEMS.register("desire_driver_geats",
			() -> new  DesireDriverItem(ArmorMaterials.DIAMOND,"geats",GEATS_CORE_ID ,GEATS_HELMET, GEATS_CHESTPLATE,GEATS_LEGGINGS , new Item.Properties())
			.Add_Extra_Base_Form_Items(Modded_item_core.BLANK_FORM,Modded_item_core.BLANK_FORM).AddToTabList(RiderTabs.GEATS_TAB_ITEM).ChangeRepairItem(BLANK_CORE_ID.get()));

	public static final RegistryObject<Item> DESIRE_DRIVER_TYCOON = ITEMS.register("desire_driver_tycoon",
			() -> new  DesireDriverItem(ArmorMaterials.DIAMOND,"tycoon",TYCOON_CORE_ID ,GEATS_HELMET, GEATS_CHESTPLATE,GEATS_LEGGINGS , new Item.Properties())
			.Add_Extra_Base_Form_Items(Modded_item_core.BLANK_FORM,Modded_item_core.BLANK_FORM).AddToTabList(RiderTabs.GEATS_TAB_ITEM).ChangeRepairItem(BLANK_CORE_ID.get()));

	public static final RegistryObject<Item> DESIRE_DRIVER_NA_GO = ITEMS.register("desire_driver_na_go",
			() -> new  DesireDriverItem(ArmorMaterials.DIAMOND,"na_go",NA_GO_CORE_ID ,GEATS_HELMET, GEATS_CHESTPLATE,GEATS_LEGGINGS , new Item.Properties())
			.Add_Extra_Base_Form_Items(Modded_item_core.BLANK_FORM,Modded_item_core.BLANK_FORM).AddToTabList(RiderTabs.GEATS_TAB_ITEM).ChangeRepairItem(BLANK_CORE_ID.get()));

	public static final RegistryObject<Item> DESIRE_DRIVER_BUFFA = ITEMS.register("desire_driver_buffa",
			() -> new  DesireDriverItem(ArmorMaterials.DIAMOND,"buffa",BUFFA_CORE_ID ,GEATS_HELMET, GEATS_CHESTPLATE,GEATS_LEGGINGS , new Item.Properties())
			.Add_Extra_Base_Form_Items(Modded_item_core.BLANK_FORM,Modded_item_core.BLANK_FORM).AddToTabList(RiderTabs.GEATS_TAB_ITEM).ChangeRepairItem(BLANK_CORE_ID.get()));

	public static final RegistryObject<Item> DESIRE_DRIVER_PUNKJACK = ITEMS.register("desire_driver_punkjack",
			() -> new  DesireDriverItem(ArmorMaterials.DIAMOND,"punkjack",PUNKJACK_CORE_ID ,GEATS_HELMET, GEATS_CHESTPLATE,GEATS_LEGGINGS , new Item.Properties())
			.Add_Extra_Base_Form_Items(Modded_item_core.BLANK_FORM,Modded_item_core.BLANK_FORM).AddToTabList(RiderTabs.GEATS_TAB_ITEM).ChangeRepairItem(BLANK_CORE_ID.get()));

	public static final RegistryObject<Item> DESIRE_DRIVER_NUGE_SPARROW = ITEMS.register("desire_driver_nudge_sparrow",
			() -> new  DesireDriverItem(ArmorMaterials.DIAMOND,"nudge_sparrow",NUGE_SPARROW_CORE_ID ,GEATS_HELMET, GEATS_CHESTPLATE,GEATS_LEGGINGS , new Item.Properties())
			.Add_Extra_Base_Form_Items(Modded_item_core.BLANK_FORM,Modded_item_core.BLANK_FORM).AddToTabList(RiderTabs.GEATS_TAB_ITEM).ChangeRepairItem(BLANK_CORE_ID.get()));

	public static final RegistryObject<Item> DESIRE_DRIVER_SHIROWE = ITEMS.register("desire_driver_shirowe",
			() -> new  DesireDriverItem(ArmorMaterials.DIAMOND,"shirowe",SHIROWE_CORE_ID ,GEATS_HELMET, GEATS_CHESTPLATE,GEATS_LEGGINGS , new Item.Properties())
			.Add_Extra_Base_Form_Items(Modded_item_core.BLANK_FORM,Modded_item_core.BLANK_FORM).AddToTabList(RiderTabs.GEATS_TAB_ITEM).ChangeRepairItem(BLANK_CORE_ID.get()));

	public static final RegistryObject<Item> DESIRE_DRIVER_GINPEN = ITEMS.register("desire_driver_ginpen",
			() -> new  DesireDriverItem(ArmorMaterials.DIAMOND,"ginpen",GINPEN_CORE_ID ,GEATS_HELMET, GEATS_CHESTPLATE,GEATS_LEGGINGS , new Item.Properties())
			.Add_Extra_Base_Form_Items(Modded_item_core.BLANK_FORM,Modded_item_core.BLANK_FORM).AddToTabList(RiderTabs.GEATS_TAB_ITEM).ChangeRepairItem(BLANK_CORE_ID.get()));

	public static final RegistryObject<Item> DESIRE_DRIVER_MARY = ITEMS.register("desire_driver_mary",
			() -> new  DesireDriverItem(ArmorMaterials.DIAMOND,"mary",MARY_CORE_ID ,GEATS_HELMET, GEATS_CHESTPLATE,GEATS_LEGGINGS , new Item.Properties())
			.Add_Extra_Base_Form_Items(Modded_item_core.BLANK_FORM,Modded_item_core.BLANK_FORM).AddToTabList(RiderTabs.GEATS_TAB_ITEM).ChangeRepairItem(BLANK_CORE_ID.get()));

	public static final RegistryObject<Item> DESIRE_DRIVER_DA_PAAN = ITEMS.register("desire_driver_da_paan",
			() -> new  DesireDriverItem(ArmorMaterials.DIAMOND,"da_paan",DA_PAAN_CORE_ID ,GEATS_HELMET, GEATS_CHESTPLATE,GEATS_LEGGINGS , new Item.Properties())
			.Add_Extra_Base_Form_Items(Modded_item_core.BLANK_FORM,Modded_item_core.BLANK_FORM).AddToTabList(RiderTabs.GEATS_TAB_ITEM).ChangeRepairItem(BLANK_CORE_ID.get()));

	public static final RegistryObject<Item> DESIRE_DRIVER_KEIROU = ITEMS.register("desire_driver_keirou",
			() -> new  DesireDriverItem(ArmorMaterials.DIAMOND,"keirou",KEIROU_CORE_ID ,GEATS_HELMET, GEATS_CHESTPLATE,GEATS_LEGGINGS , new Item.Properties())
			.Add_Extra_Base_Form_Items(Modded_item_core.BLANK_FORM,Modded_item_core.BLANK_FORM).AddToTabList(RiderTabs.GEATS_TAB_ITEM).ChangeRepairItem(BLANK_CORE_ID.get()));

	public static final RegistryObject<Item> DESIRE_DRIVER_LETTER = ITEMS.register("desire_driver_letter",
			() -> new  DesireDriverItem(ArmorMaterials.DIAMOND,"letter",LETTER_CORE_ID ,GEATS_HELMET, GEATS_CHESTPLATE,GEATS_LEGGINGS , new Item.Properties())
			.Add_Extra_Base_Form_Items(Modded_item_core.BLANK_FORM,Modded_item_core.BLANK_FORM).AddToTabList(RiderTabs.GEATS_TAB_ITEM).ChangeRepairItem(BLANK_CORE_ID.get()));

	public static final RegistryObject<Item> DESIRE_DRIVER_LOPO = ITEMS.register("desire_driver_lopo",
			() -> new  DesireDriverItem(ArmorMaterials.DIAMOND,"lopo",LOPO_CORE_ID ,GEATS_HELMET, GEATS_CHESTPLATE,GEATS_LEGGINGS , new Item.Properties())
			.Add_Extra_Base_Form_Items(Modded_item_core.BLANK_FORM,Modded_item_core.BLANK_FORM).AddToTabList(RiderTabs.GEATS_TAB_ITEM).ChangeRepairItem(BLANK_CORE_ID.get()));

	public static final RegistryObject<Item> DESIRE_DRIVER_GROOVY = ITEMS.register("desire_driver_groovy",
			() -> new  DesireDriverItem(ArmorMaterials.DIAMOND,"groovy",GROOVY_CORE_ID ,GEATS_HELMET, GEATS_CHESTPLATE,GEATS_LEGGINGS , new Item.Properties())
			.Add_Extra_Base_Form_Items(Modded_item_core.BLANK_FORM,Modded_item_core.BLANK_FORM).AddToTabList(RiderTabs.GEATS_TAB_ITEM).ChangeRepairItem(BLANK_CORE_ID.get()));

	public static final RegistryObject<Item> DESIRE_DRIVER_HAKUBI = ITEMS.register("desire_driver_hakubi",
			() -> new  DesireDriverItem(ArmorMaterials.DIAMOND,"hakubi",HAKUBI_CORE_ID ,GEATS_HELMET, GEATS_CHESTPLATE,GEATS_LEGGINGS , new Item.Properties())
			.Add_Extra_Base_Form_Items(Modded_item_core.BLANK_FORM,Modded_item_core.BLANK_FORM).AddToTabList(RiderTabs.GEATS_TAB_ITEM).ChangeRepairItem(BLANK_CORE_ID.get()));

	public static final RegistryObject<Item> DESIRE_DRIVER_TURBON = ITEMS.register("desire_driver_turbon",
			() -> new  DesireDriverItem(ArmorMaterials.DIAMOND,"turbon",TURBON_CORE_ID ,GEATS_HELMET, GEATS_CHESTPLATE,GEATS_LEGGINGS , new Item.Properties())
			.Add_Extra_Base_Form_Items(Modded_item_core.BLANK_FORM,Modded_item_core.BLANK_FORM).AddToTabList(RiderTabs.GEATS_TAB_ITEM).ChangeRepairItem(BLANK_CORE_ID.get()));

	public static final RegistryObject<Item> DESIRE_DRIVER_BRALI = ITEMS.register("desire_driver_brali",
			() -> new  DesireDriverItem(ArmorMaterials.DIAMOND,"brali",BRALI_CORE_ID ,GEATS_HELMET, GEATS_CHESTPLATE,GEATS_LEGGINGS , new Item.Properties())
			.Add_Extra_Base_Form_Items(Modded_item_core.BLANK_FORM,Modded_item_core.BLANK_FORM).AddToTabList(RiderTabs.GEATS_TAB_ITEM).ChangeRepairItem(BLANK_CORE_ID.get()));

	public static final RegistryObject<Item> DESIRE_DRIVER_GYA_GO = ITEMS.register("desire_driver_gya_go",
			() -> new  DesireDriverItem(ArmorMaterials.DIAMOND,"gya_go",GYA_GO_CORE_ID ,GEATS_HELMET, GEATS_CHESTPLATE,GEATS_LEGGINGS , new Item.Properties())
			.Add_Extra_Base_Form_Items(Modded_item_core.BLANK_FORM,Modded_item_core.BLANK_FORM).AddToTabList(RiderTabs.GEATS_TAB_ITEM).ChangeRepairItem(BLANK_CORE_ID.get()));

	public static final RegistryObject<Item> DESIRE_DRIVER_SEEKER = ITEMS.register("desire_driver_seeker",
			() -> new  DesireDriverItem(ArmorMaterials.DIAMOND,"seeker",SEEKER_CORE_ID ,GEATS_HELMET, GEATS_CHESTPLATE,GEATS_LEGGINGS , new Item.Properties())
			.Add_Extra_Base_Form_Items(Modded_item_core.BLANK_FORM,Modded_item_core.BLANK_FORM).AddToTabList(RiderTabs.GEATS_TAB_ITEM).ChangeRepairItem(BLANK_CORE_ID.get()));

	public static final RegistryObject<Item> DESIRE_DRIVER_BUTCHI = ITEMS.register("desire_driver_butchi",
			() -> new  DesireDriverItem(ArmorMaterials.DIAMOND,"butchi",BUTCHI_CORE_ID ,GEATS_HELMET, GEATS_CHESTPLATE,GEATS_LEGGINGS , new Item.Properties())
			.Add_Extra_Base_Form_Items(Modded_item_core.BLANK_FORM,Modded_item_core.BLANK_FORM).AddToTabList(RiderTabs.GEATS_TAB_ITEM).ChangeRepairItem(BLANK_CORE_ID.get()));

	public static final RegistryObject<Item> DESIRE_DRIVER_REVI = ITEMS.register("desire_driver_revi",
			() -> new  DesireDriverItem(ArmorMaterials.DIAMOND,"geats_revi",REVI_CORE_ID ,GEATS_HELMET, GEATS_CHESTPLATE,GEATS_LEGGINGS , new Item.Properties())
			.Add_Extra_Base_Form_Items(Modded_item_core.BLANK_FORM,Modded_item_core.BLANK_FORM).AddToTabList(RiderTabs.GEATS_TAB_ITEM).ChangeRepairItem(BLANK_CORE_ID.get()));

	public static final RegistryObject<Item> DESIRE_DRIVER_VICE = ITEMS.register("desire_driver_vice",
			() -> new  DesireDriverItem(ArmorMaterials.DIAMOND,"geats_vice",VICE_CORE_ID ,GEATS_HELMET, GEATS_CHESTPLATE,GEATS_LEGGINGS , new Item.Properties())
			.Add_Extra_Base_Form_Items(Modded_item_core.BLANK_FORM,Modded_item_core.BLANK_FORM).AddToTabList(RiderTabs.GEATS_TAB_ITEM).ChangeRepairItem(BLANK_CORE_ID.get()));

	public static final RegistryObject<Item> DESIRE_DRIVER_JYAMATO = ITEMS.register("desire_driver_jyamato",
			() -> new  DesireDriverItem(ArmorMaterials.DIAMOND,"jyamato",DISCORE_ID ,GEATS_HELMET, GEATS_CHESTPLATE,GEATS_LEGGINGS , new Item.Properties())
			.Add_Extra_Base_Form_Items(Modded_item_core.BLANK_FORM,JYAMATO_BUCKLE).AddToTabList(RiderTabs.GEATS_TAB_ITEM).ChangeRepairItem(BLANK_CORE_ID.get()));

	public static final RegistryObject<Item> DESIRE_DRIVER_GM= ITEMS.register("desire_driver_gm",
			() -> new  DesireDriverItem(ArmorMaterials.DIAMOND,"gm",CHUTA_CORE_ID ,GEATS_HELMET, GEATS_CHESTPLATE,GEATS_LEGGINGS , new Item.Properties())
			.Add_Extra_Base_Form_Items(Modded_item_core.BLANK_FORM,Modded_item_core.BLANK_FORM).AddToTabList(RiderTabs.GEATS_TAB_ITEM).ChangeRepairItem(BLANK_CORE_ID.get()));

	public static final RegistryObject<Item> DESIRE_DRIVER_GM_CHIRAMI= ITEMS.register("desire_driver_gm_chirami",
			() -> new  DesireDriverItem(ArmorMaterials.DIAMOND,"gm_chirami",GESSY_CORE_ID ,GEATS_HELMET, GEATS_CHESTPLATE,GEATS_LEGGINGS , new Item.Properties())
			.Add_Extra_Base_Form_Items(Modded_item_core.BLANK_FORM,Modded_item_core.BLANK_FORM).AddToTabList(RiderTabs.GEATS_TAB_ITEM).ChangeRepairItem(BLANK_CORE_ID.get()));

	public static final RegistryObject<Item> DESIRE_DRIVER_KEIDI_RIDER = ITEMS.register("desire_driver_keibi_riders",
			() -> new  DesireDriverItem(ArmorMaterials.DIAMOND,"keibi_riders",BLANK_CORE_ID ,GEATS_HELMET, GEATS_CHESTPLATE,GEATS_LEGGINGS , new Item.Properties())
			.Add_Extra_Base_Form_Items(Modded_item_core.BLANK_FORM,Modded_item_core.BLANK_FORM).AddToTabList(RiderTabs.GEATS_TAB_ITEM).ChangeRepairItem(BLANK_CORE_ID.get()));

	public static final RegistryObject<Item> DESIRE_DRIVER_THE_END_RIDER = ITEMS.register("desire_driver_the_end_riders",
			() -> new  DesireDriverItem(ArmorMaterials.DIAMOND,"the_end_riders",BLANK_CORE_ID ,GEATS_HELMET, GEATS_CHESTPLATE,GEATS_LEGGINGS , new Item.Properties())
			.Add_Extra_Base_Form_Items(Modded_item_core.BLANK_FORM,Modded_item_core.BLANK_FORM).AddToTabList(RiderTabs.GEATS_TAB_ITEM).ChangeRepairItem(BLANK_CORE_ID.get()));

	public static final RegistryObject<Item> DESIRE_DRIVER_X_GEATS = ITEMS.register("desire_driver_x_geats",
			() -> new  DesireDriverItem(ArmorMaterials.DIAMOND,"x_geats",X_GEATS_CORE_ID ,GEATS_HELMET, GEATS_CHESTPLATE,GEATS_LEGGINGS , new Item.Properties())
			.Add_Extra_Base_Form_Items(XGEATS_RAISE_BUCKLE,XGEATS_RAISE_BUCKLE).AddToTabList(RiderTabs.GEATS_TAB_ITEM).ChangeRepairItem(BLANK_CORE_ID.get()));

	public static final RegistryObject<Item> DESIRE_DRIVER_DOOMS_GEATS = ITEMS.register("desire_driver_dooms_geats",
			() -> new  DesireDriverItem(ArmorMaterials.DIAMOND,"dooms_geats",DOOMS_GEATS_CORE_ID ,GEATS_HELMET, GEATS_CHESTPLATE,GEATS_LEGGINGS , new Item.Properties())
			.Add_Extra_Base_Form_Items(DOOMS_GEATS_RAISE_BUCKLE,DOOMS_GEATS_RAISE_BUCKLE).AddToTabList(RiderTabs.GEATS_TAB_ITEM).ChangeRepairItem(BLANK_CORE_ID.get()));

	
	public static final RegistryObject<Item> RAISE_RISER_BELT_ZIIN = ITEMS.register("raise_riser_belt_ziin",
            () -> new RiderDriverItem(ArmorMaterials.DIAMOND,"ziin",ZIIN_RAISE_RISER_CARD ,GEATS_HELMET, GEATS_CHESTPLATE,GEATS_LEGGINGS, 
          		  new Item.Properties()).AddToTabList(RiderTabs.GEATS_TAB_ITEM));

	public static final RegistryObject<Item> RAISE_RISER_BELT_KEKERA = ITEMS.register("raise_riser_belt_kekera",
            () -> new RiderDriverItem(ArmorMaterials.DIAMOND,"kekera",KEKERA_RAISE_RISER_CARD ,GEATS_HELMET, GEATS_CHESTPLATE,GEATS_LEGGINGS, 
          		  new Item.Properties()).AddToTabList(RiderTabs.GEATS_TAB_ITEM));

	public static final RegistryObject<Item> RAISE_RISER_BELT_KYUUN = ITEMS.register("raise_riser_belt_kyuun",
            () -> new RiderDriverItem(ArmorMaterials.DIAMOND,"kyuun",KYUUN_RAISE_RISER_CARD ,GEATS_HELMET, GEATS_CHESTPLATE,GEATS_LEGGINGS, 
          		  new Item.Properties()).AddToTabList(RiderTabs.GEATS_TAB_ITEM));

	public static final RegistryObject<Item> RAISE_RISER_BELT_BEROBA = ITEMS.register("raise_riser_belt_beroba",
            () -> new RiderDriverItem(ArmorMaterials.DIAMOND,"beroba",BEROBA_RAISE_RISER_CARD ,GEATS_HELMET, GEATS_CHESTPLATE,GEATS_LEGGINGS, 
          		  new Item.Properties()).AddToTabList(RiderTabs.GEATS_TAB_ITEM));

	 public static final RegistryObject<Item> VISION_DRIVER_GLARE = ITEMS.register("vision_driver_glare",
             () -> new RiderDriverItem(ArmorMaterials.DIAMOND,"glare",PROVIDENCE_CARD_GLARE ,GEATS_HELMET, GEATS_CHESTPLATE,GEATS_LEGGINGS, 
           		  new Item.Properties()).AddToTabList(RiderTabs.GEATS_TAB_ITEM));
 
	 public static final RegistryObject<Item> VISION_DRIVER_GLARE2 = ITEMS.register("vision_driver_glare2",
             () -> new RiderDriverItem(ArmorMaterials.DIAMOND,"glare2",PROVIDENCE_CARD_GLARE ,GEATS_HELMET, GEATS_CHESTPLATE,GEATS_LEGGINGS, 
           		  new Item.Properties()).AddToTabList(RiderTabs.GEATS_TAB_ITEM));
 
	 public static final RegistryObject<Item> VISION_DRIVER_GAZER = ITEMS.register("vision_driver_gazer",
             () -> new RiderDriverItem(ArmorMaterials.DIAMOND,"gazer",PROVIDENCE_CARD_GAZER ,GEATS_HELMET, GEATS_CHESTPLATE,GEATS_LEGGINGS, 
           		  new Item.Properties()).AddToTabList(RiderTabs.GEATS_TAB_ITEM));
 
	 public static final RegistryObject<Item> VISION_DRIVER_GAZER_SUEL = ITEMS.register("vision_driver_gazer_suel",
             () -> new RiderDriverItem(ArmorMaterials.DIAMOND,"gazer_suel",PROVIDENCE_CARD_GAZER ,GEATS_HELMET, GEATS_CHESTPLATE,GEATS_LEGGINGS, 
           		  new Item.Properties()).AddToTabList(RiderTabs.GEATS_TAB_ITEM));
 
	 public static final RegistryObject<Item> VISION_DRIVER_JYAMATO_GAZER = ITEMS.register("vision_driver_jyamato_glare",
             () -> new RiderDriverItem(ArmorMaterials.DIAMOND,"jyamato_glare",PROVIDENCE_CARD_GAZER ,GEATS_HELMET, GEATS_CHESTPLATE,GEATS_LEGGINGS, 
           		  new Item.Properties()).AddToTabList(RiderTabs.GEATS_TAB_ITEM));
 
	 public static final RegistryObject<Item> ZILLION_DRIVER = ITEMS.register("zillion_driver",
             () -> new RiderDriverItem(ArmorMaterials.DIAMOND,"regad",SIRIUS_CARD ,GEATS_HELMET, GEATS_CHESTPLATE,GEATS_LEGGINGS, 
           		  new Item.Properties()).AddToTabList(RiderTabs.GEATS_TAB_ITEM));
 
	 public static final RegistryObject<Item> ZILLION_DRIVER_GAZER_ZERO = ITEMS.register("zillion_driver_gazer_zero",
             () -> new RiderDriverItem(ArmorMaterials.DIAMOND,"gazer_zero",SIRIUS_CARD_GAZER_ZERO ,GEATS_HELMET, GEATS_CHESTPLATE,GEATS_LEGGINGS, 
           		  new Item.Properties()).AddToTabList(RiderTabs.GEATS_TAB_ITEM));
 
 
	
	public static final RegistryObject<BaseBlasterItem> MAGNUM_SHOOTER_40X = ITEMS.register("magnum_shooter_40x",
			() -> new BaseBlasterItem(Tiers.DIAMOND, 3, -2.4F, new Item.Properties()).AddToTabList(RiderTabs.GEATS_TAB_ITEM)
			.ChangeRepairItem(BLANK_CORE_ID.get()));
	public static final RegistryObject<BaseBlasterItem> MAGNUM_SHOOTER_40X_RIFLE = ITEMS.register("magnum_shooter_40x_rifle",
			() -> new BaseBlasterItem(Tiers.DIAMOND, 8, -2.4F, new Item.Properties()).AddToTabList(RiderTabs.GEATS_TAB_ITEM)
			.ChangeRepairItem(BLANK_CORE_ID.get()));

	public static final RegistryObject<SwordItem> ZOMBIE_BREAKER = ITEMS.register("zombie_breaker",
			() -> new BaseSwordItem(Tiers.DIAMOND, 5, -2F, new Item.Properties()).AddToTabList(RiderTabs.GEATS_TAB_ITEM)
			.ChangeRepairItem(BLANK_CORE_ID.get()));
	public static final RegistryObject<SwordItem> ZOMBIE_BREAKER_POISON_CHARGE = ITEMS.register("zombie_breaker_poison_charge",
			() -> new BaseSwordItem(Tiers.DIAMOND, 9, -2F, new Item.Properties()).AddToTabList(RiderTabs.GEATS_TAB_ITEM)
			.ChangeRepairItem(BLANK_CORE_ID.get()));

	public static final RegistryObject<SwordItem> BEAT_AXE = ITEMS.register("beat_axe",
			() -> new BaseSwordItem(Tiers.DIAMOND, 5, -2F, new Item.Properties()).AddToTabList(RiderTabs.GEATS_TAB_ITEM)
			.ChangeRepairItem(BLANK_CORE_ID.get()));

	public static final RegistryObject<SwordItem> NINJA_DUELER_TWIN_BLADE_MODE = ITEMS.register("ninja_dueler_twin_blade_mode",
			() -> new BaseSwordItem(Tiers.DIAMOND, 5, -2F, new Item.Properties()).AddToTabList(RiderTabs.GEATS_TAB_ITEM)
			.ChangeRepairItem(BLANK_CORE_ID.get()));
	public static final RegistryObject<SwordItem> NINJA_DUELER_TWIN_BLADE_MODE2 = ITEMS.register("ninja_dueler_twin_blade_mode2",
			() -> new BaseSwordItem(Tiers.DIAMOND, 5, -2F, new Item.Properties()).AddToTabList(RiderTabs.GEATS_TAB_ITEM)
			.ChangeRepairItem(BLANK_CORE_ID.get()));
	public static final RegistryObject<SwordItem> NINJA_DUELER = ITEMS.register("ninja_dueler",
			() -> new BaseSwordItem(Tiers.DIAMOND, 9, -2F, new Item.Properties()).AddToTabList(RiderTabs.GEATS_TAB_ITEM)
			.ChangeRepairItem(BLANK_CORE_ID.get()));

	public static final RegistryObject<SwordItem> RAISING_SWORD = ITEMS.register("raising_sword",
			() -> new BaseSwordItem(Tiers.DIAMOND, 7, -2F, new Item.Properties()).AddToTabList(RiderTabs.GEATS_TAB_ITEM)
			.ChangeRepairItem(BLANK_CORE_ID.get()));

	public static final RegistryObject<BaseBlasterItem> GEATS_BUSTER_QB9 = ITEMS.register("geats_buster_qb9",
			() -> new BaseBlasterItem(Tiers.DIAMOND, 12, -2.4F, new Item.Properties()).IsSwordGun().AddToTabList(RiderTabs.GEATS_TAB_ITEM)
			.ChangeRepairItem(BLANK_CORE_ID.get()));
			
	public static final RegistryObject<BaseBlasterItem> GEATS_BUSTER_X = ITEMS.register("geats_buster_x",
			() -> new BaseBlasterItem(Tiers.DIAMOND, 12, -2.4F, new Item.Properties()).IsSwordGun().AddToTabList(RiderTabs.GEATS_TAB_ITEM)
			.ChangeRepairItem(BLANK_CORE_ID.get()));
	public static final RegistryObject<SwordItem> X_RAISING_SWORD = ITEMS.register("x_raising_sword",
			() -> new BaseSwordItem(Tiers.DIAMOND, 9, -2F, new Item.Properties()).AddToTabList(RiderTabs.GEATS_TAB_ITEM)
			.ChangeRepairItem(BLANK_CORE_ID.get()));

	public static final RegistryObject<BaseBlasterItem> DOOMS_GEATS_BUSTER = ITEMS.register("dooms_geats_buster",
			() -> new BaseBlasterItem(Tiers.DIAMOND, 12, -2.4F, new Item.Properties()).IsSwordGun().AddToTabList(RiderTabs.GEATS_TAB_ITEM)
			.ChangeRepairItem(BLANK_CORE_ID.get()));

	public static final RegistryObject<SwordItem> BUJIN = ITEMS.register("bujin",
			() -> new BaseSwordItem(Tiers.DIAMOND, 7, -2F, new Item.Properties()).AddToTabList(RiderTabs.GEATS_TAB_ITEM)
			.ChangeRepairItem(BLANK_CORE_ID.get()));

	public static final RegistryObject<BaseShieldItem> PLOSION_RAGE_SHIELD = ITEMS.register("plosion_rage_shield",
			() -> new BaseShieldItem(new Item.Properties()).AddToTabList(RiderTabs.GEATS_TAB_ITEM)
			.ChangeRepairItem(BLANK_CORE_ID.get()));

	public static final RegistryObject<SwordItem> GIGANT_SWORD = ITEMS.register("gigant_sword",
			() -> new BaseSwordItem(Tiers.DIAMOND, 5, -2F, new Item.Properties()).AddToTabList(RiderTabs.GEATS_TAB_ITEM)
			.ChangeRepairItem(BLANK_CORE_ID.get()));
	public static final RegistryObject<SwordItem> GIGANT_HAMMER = ITEMS.register("gigant_hammer",
			() -> new BaseSwordItem(Tiers.DIAMOND, 5, -2F, new Item.Properties()).AddToTabList(RiderTabs.GEATS_TAB_ITEM)
			.ChangeRepairItem(BLANK_CORE_ID.get()));
	public static final RegistryObject<BaseBlasterItem> GIGANT_BLASTER = ITEMS.register("gigant_blaster",
			() -> new BaseBlasterItem(Tiers.DIAMOND, 8, -2.4F, new Item.Properties()).AddToTabList(RiderTabs.GEATS_TAB_ITEM)
			.ChangeRepairItem(BLANK_CORE_ID.get()));
			
	public static final RegistryObject<SwordItem> RAISE_HAMMER = ITEMS.register("raise_hammer",
			() -> new BaseSwordItem(Tiers.DIAMOND, 5, -2F, new Item.Properties()).AddToTabList(RiderTabs.GEATS_TAB_ITEM)
			.ChangeRepairItem(BLANK_CORE_ID.get()));
	public static final RegistryObject<BaseBlasterItem> RAISE_ARROW = ITEMS.register("raise_arrow",
			() -> new BaseBlasterItem(Tiers.DIAMOND, 3, -2.4F, new Item.Properties()).AddToTabList(RiderTabs.GEATS_TAB_ITEM)
			.ChangeRepairItem(BLANK_CORE_ID.get()));
	public static final RegistryObject<BaseBlasterItem> RAISE_WATER = ITEMS.register("raise_water",
			() -> new BaseBlasterItem(Tiers.DIAMOND, 3, -2.4F, new Item.Properties()).AddToTabList(RiderTabs.GEATS_TAB_ITEM)
			.ChangeRepairItem(BLANK_CORE_ID.get()));
	public static final RegistryObject<ShieldItem> RAISE_SHIELD = ITEMS.register("raise_shield",
			() -> new BaseShieldItem(new Item.Properties()).AddToTabList(RiderTabs.GEATS_TAB_ITEM)
			.ChangeRepairItem(BLANK_CORE_ID.get()));
	public static final RegistryObject<SwordItem> RAISE_CHAIN_ARRAY = ITEMS.register("raise_chain_array",
			() -> new BaseSwordItem(Tiers.DIAMOND, 5, -2F, new Item.Properties()).AddToTabList(RiderTabs.GEATS_TAB_ITEM)
			.ChangeRepairItem(BLANK_CORE_ID.get()));
	public static final RegistryObject<SwordItem> RAISE_CLAW = ITEMS.register("raise_claw",
			() -> new BaseSwordItem(Tiers.DIAMOND, 5, -2F, new Item.Properties()).AddToTabList(RiderTabs.GEATS_TAB_ITEM)
			.ChangeRepairItem(BLANK_CORE_ID.get()));
	public static final RegistryObject<SwordItem> RAISE_PROPELLER = ITEMS.register("raise_propeller",
			() -> new BaseSwordItem(Tiers.DIAMOND, 5, -2F, new Item.Properties()).AddToTabList(RiderTabs.GEATS_TAB_ITEM)
			.ChangeRepairItem(BLANK_CORE_ID.get()));

	public static final RegistryObject<BaseBlasterItem> LASER_RAISE_RISER = ITEMS.register("laser_raise_riser",
			() -> new LaserRaiseRiserItem(Tiers.DIAMOND, 3, -2.4F, new Item.Properties()).AddToTabList(RiderTabs.GEATS_TAB_ITEM)
			.AddToTabList(ModClientEvents.RAISE_RISER_ITEM).ChangeRepairItem(BLANK_CORE_ID.get()));


	public static final RegistryObject<Item> GEATS_CORE_ID_OSAKA = ITEMS.register("geats_rider_core_id_osaka",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_osaka","geats","desire_driver_belt_geats",
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 0,true,false),
					new MobEffectInstance(MobEffects.SATURATION, 40, 0,true,false))
			.addNeedForm(MAGNUM_RAISE_BUCKLE.get(), 2).AddToTabList(MissionBoxItem.CORE_ID).AddToTabList(RiderTabs.GEATS_TAB_ITEM));
	
	public static final RegistryObject<Item> GEATS_CORE_ID_FUKUOKA = ITEMS.register("geats_rider_core_id_fukuoka",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_fukuoka","geats","desire_driver_belt_geats",
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 0,true,false),
					new MobEffectInstance(MobEffects.SATURATION, 40, 0,true,false))
			.addNeedForm(MAGNUM_RAISE_BUCKLE.get(), 2).AddToTabList(MissionBoxItem.CORE_ID).AddToTabList(RiderTabs.GEATS_TAB_ITEM));
	
	public static final RegistryObject<Item> GEATS_CORE_ID_NAGOYA = ITEMS.register("geats_rider_core_id_nagoya",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_nagoya","geats","desire_driver_belt_geats",
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 0,true,false),
					new MobEffectInstance(MobEffects.SATURATION, 40, 0,true,false))
			.addNeedForm(MAGNUM_RAISE_BUCKLE.get(), 2).AddToTabList(MissionBoxItem.CORE_ID).AddToTabList(RiderTabs.GEATS_TAB_ITEM));
	
	public static final RegistryObject<Item> GEATS_CORE_ID_TOKYO = ITEMS.register("geats_rider_core_id_tokyo",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_tokyo","geats","desire_driver_belt_geats",
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 0,true,false),
					new MobEffectInstance(MobEffects.SATURATION, 40, 0,true,false))
			.addNeedForm(MAGNUM_RAISE_BUCKLE.get(), 2).AddToTabList(RiderTabs.GEATS_TAB_ITEM));

	public static final RegistryObject<Item> JYAMASHIN_WISH_CARD = ITEMS.register("jyamashin_wish_card",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_jyamashin","buffa","desire_driver_belt_geats",
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 3,true,false),
					new MobEffectInstance(MobEffects.JUMP, 40, 1,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
					new MobEffectInstance(Effect_core.ANTIPOISON.get(), 40, 0,true,false))
			.alsoChange3rdSlot(Modded_item_core.BLANK_FORM.get()).alsoChange2ndSlot(Modded_item_core.BLANK_FORM.get()).AddToTabList(RiderTabs.GEATS_TAB_ITEM));
	

	public static void register(IEventBus eventBus) {
		ITEMS.register(eventBus);
	}

}
