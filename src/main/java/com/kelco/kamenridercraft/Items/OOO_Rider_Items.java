package com.kelco.kamenridercraft.Items;

import com.kelco.kamenridercraft.KamenRiderCraftCore;
import com.kelco.kamenridercraft.Blocks.MachineBlocks.CellMedalProgramer;
import com.kelco.kamenridercraft.Effect.Effect_core;
import com.kelco.kamenridercraft.Items.ooo.BirthDriverItem;
import com.kelco.kamenridercraft.Items.ooo.Item_Purple_Medals;
import com.kelco.kamenridercraft.Items.ooo.OOODriverItem;
import com.kelco.kamenridercraft.Items.ooo.oScannerItem;
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

public class OOO_Rider_Items {

	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, KamenRiderCraftCore.MODID);

	public static final RegistryObject<Item> OOO_LOGO = ITEMS.register("ooo_logo",
			() -> new BaseItem(new Item.Properties()).AddToTabList(RiderTabs.OOO_TAB_ITEM));

	public static final RegistryObject<Item> CELL_MEDAL = ITEMS.register("cellmedal",
			() -> new BaseItem(new Item.Properties()).AddToTabList(RiderTabs.OOO_TAB_ITEM));

	public static final RegistryObject<Item> CELL_ALLOY_INGOT = ITEMS.register("cell_alloy_ingot",
			() -> new BaseItem(new Item.Properties()).AddToTabList(RiderTabs.OOO_TAB_ITEM));


	public static final RegistryObject<Item> TAKA_MEDAL = ITEMS.register("taka_medal",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_taka","ooo","ooodriver_belt",
					new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 1,true,false))
			.AddToTabList(RiderTabs.OOO_TAB_ITEM));

	public static final RegistryObject<Item> KUJAKU_MEDAL = ITEMS.register("kujaku_medal",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_kujaku","ooo","ooodriver_belt",
					new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 40, 0,true,false))
			.ChangeSlot(2).ifFlyingModelResource( "geo/rider_plusbelt_and_wings.geo.json").AddToTabList(RiderTabs.OOO_TAB_ITEM));

	public static final RegistryObject<Item> CONDOR_MEDAL = ITEMS.register("condor_medal",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_condor","ooo","ooodriver_belt",
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 1,true,false))
			.ChangeSlot(3).AddToTabList(RiderTabs.OOO_TAB_ITEM));

	public static final RegistryObject<Item> TAKA_ANKH_MEDAL = ITEMS.register("taka_ankh_medal",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_taka","ooo","ooodriver_belt",
					new MobEffectInstance(MobEffects.REGENERATION, 40, 0,true,false),
					new MobEffectInstance(MobEffects.JUMP, 40, 0,true,false),
					new MobEffectInstance(Effect_core.FLYING.get(), 40, 0,true,false))
			.ChangeSlot(1).AddToTabList(RiderTabs.OOO_TAB_ITEM));


	public static final RegistryObject<Item> LION_MEDAL = ITEMS.register("lion_medal",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_lion","ooo","ooodriver_belt",
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 1,true,false),
					new MobEffectInstance(MobEffects.JUMP, 40, 0,true,false))
			.AddToTabList(RiderTabs.OOO_TAB_ITEM));

	public static final RegistryObject<Item> TORA_MEDAL = ITEMS.register("tora_medal",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_tora","ooo","ooodriver_belt",
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 1,true,false))
			.ChangeSlot(2).AddToTabList(RiderTabs.OOO_TAB_ITEM));

	public static final RegistryObject<Item> CHEETAH_MEDAL = ITEMS.register("cheetah_medal",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_cheetah","ooo","ooodriver_belt",
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 1,true,false))
			.ChangeSlot(3).AddToTabList(RiderTabs.OOO_TAB_ITEM));


	public static final RegistryObject<Item> KUWAGATA_MEDAL = ITEMS.register("kuwagata_medal",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_kuwagata","ooo","ooodriver_belt",
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 1,true,false),
					new MobEffectInstance(MobEffects.JUMP, 40, 0,true,false))
			.AddToTabList(RiderTabs.OOO_TAB_ITEM));

	public static final RegistryObject<Item> KAMAKIRI_MEDAL = ITEMS.register("kamakiri_medal",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_kamakiri","ooo","ooodriver_belt",
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 1,true,false))
			.ChangeSlot(2).AddToTabList(RiderTabs.OOO_TAB_ITEM));

	public static final RegistryObject<Item> BATTA_MEDAL = ITEMS.register("batta_medal",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_batta","ooo","ooodriver_belt",
					new MobEffectInstance(MobEffects.JUMP, 40, 2,true,false))
			.ChangeSlot(3).AddToTabList(RiderTabs.OOO_TAB_ITEM));


	public static final RegistryObject<Item> SAI_MEDAL = ITEMS.register("sai_medal",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_sai","ooo","ooodriver_belt",
					new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 40, 1,true,false))
			.ChangeSlot(1).AddToTabList(RiderTabs.OOO_TAB_ITEM));

	public static final RegistryObject<Item> GORILLA_MEDAL = ITEMS.register("gorilla_medal",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_gorilla","ooo","ooodriver_belt",
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 0,true,false),
					new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 40, 1,true,false))
			.ChangeSlot(2).AddToTabList(RiderTabs.OOO_TAB_ITEM));

	public static final RegistryObject<Item> ZOU_MEDAL = ITEMS.register("zou_medal",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_zou","ooo","ooodriver_belt",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 0,true,false),
					new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 40, 1,true,false))
			.ChangeSlot(3).AddToTabList(RiderTabs.OOO_TAB_ITEM));


	public static final RegistryObject<Item> SHACHI_MEDAL = ITEMS.register("shachi_medal",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_shachi","ooo","ooodriver_belt",
					new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 0,true,false))
			.ChangeSlot(1).AddToTabList(RiderTabs.OOO_TAB_ITEM));

	public static final RegistryObject<Item> UNAGI_MEDAL = ITEMS.register("unagi_medal",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_unagi","ooo","ooodriver_belt",
					new MobEffectInstance(MobEffects.WATER_BREATHING, 400, 0,true,false))
			.ChangeSlot(2).AddToTabList(RiderTabs.OOO_TAB_ITEM));

	public static final RegistryObject<Item> TAKO_MEDAL = ITEMS.register("tako_medal",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_tako","ooo","ooodriver_belt",
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 1,true,false)
					)
			.ChangeSlot(3).AddToTabList(RiderTabs.OOO_TAB_ITEM));


	public static final RegistryObject<Item> PTERA_MEDAL = ITEMS.register("ptera_medal",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_ptera","ooo","ooodriver_belt",
					new MobEffectInstance(MobEffects.JUMP, 40, 2,true,false))
			.ChangeSlot(1).AddToTabList(RiderTabs.OOO_TAB_ITEM));

	public static final RegistryObject<Item> TRICERA_MEDAL = ITEMS.register("tricera_medal",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_tricera","ooo","ooodriver_belt",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40	, 3,true,false))
			.ChangeSlot(2).AddToTabList(RiderTabs.OOO_TAB_ITEM));

	public static final RegistryObject<Item> TYRANNO_MEDAL = ITEMS.register("tyranno_medal",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_tyranno","ooo","ooodriver_belt",
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 2,true,false))
			.ChangeSlot(3).AddToTabList(RiderTabs.OOO_TAB_ITEM));


	public static final RegistryObject<Item> COBRA_MEDAL = ITEMS.register("cobra_medal",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_cobra","ooo","ooodriver_belt",
					new MobEffectInstance(MobEffects.REGENERATION, 40, 0,true,false))
			.ChangeSlot(1).AddToTabList(RiderTabs.OOO_TAB_ITEM));

	public static final RegistryObject<Item> KAME_MEDAL = ITEMS.register("kame_medal",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_kame","ooo","ooodriver_belt",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false))
			.ChangeSlot(2).AddToTabList(RiderTabs.OOO_TAB_ITEM));

	public static final RegistryObject<Item> WANI_MEDAL = ITEMS.register("wani_medal",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_wani","ooo","ooodriver_belt",
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 0,true,false))
			.ChangeSlot(3).AddToTabList(RiderTabs.OOO_TAB_ITEM));


	public static final RegistryObject<Item> SASORI_MEDAL = ITEMS.register("sasori_medal",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"","core","core_driver_belt",
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 0,true,false),
					new MobEffectInstance(MobEffects.INVISIBILITY, 40, 0,true,false)).ChangeSlot(1).AddToTabList(RiderTabs.OOO_TAB_ITEM));

	public static final RegistryObject<Item> KANI_MEDAL = ITEMS.register("kani_medal",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"","core","core_driver_belt",
					new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 40, 2,true,false)).ChangeSlot(2).AddToTabList(RiderTabs.OOO_TAB_ITEM));

	public static final RegistryObject<Item> EBI_MEDAL = ITEMS.register("ebi_medal",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"","core","core_driver_belt",
					new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 0,true,false)).ChangeSlot(3).AddToTabList(RiderTabs.OOO_TAB_ITEM));


	public static final RegistryObject<Item> MUKADE_MEDAL = ITEMS.register("mukade_medal",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_mukade","ooo","ooodriver_belt",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 1,true,false),new MobEffectInstance(MobEffects.INVISIBILITY, 40, 0,true,false))
			.ChangeSlot(1).AddToTabList(RiderTabs.OOO_TAB_ITEM));

	public static final RegistryObject<Item> HACHI_MEDAL = ITEMS.register("hachi_medal",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_hachi","ooo","ooodriver_belt",
					new MobEffectInstance(MobEffects.JUMP, 40, 2,true,false))
			.ChangeSlot(2).AddToTabList(RiderTabs.OOO_TAB_ITEM));

	public static final RegistryObject<Item> ARI_MEDAL = ITEMS.register("ari_medal",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_ari","ooo","ooodriver_belt",
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false))
			.ChangeSlot(3).AddToTabList(RiderTabs.OOO_TAB_ITEM));


	public static final RegistryObject<Item> EBI_NEW_MEDAL = ITEMS.register("ebi_new_medal",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_ebi","ooo","ooodriver_belt",
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 1,true,false))
			.ChangeSlot(1).AddToTabList(RiderTabs.OOO_TAB_ITEM));

	public static final RegistryObject<Item> KANI_NEW_MEDAL = ITEMS.register("kani_new_medal",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_kani","ooo","ooodriver_belt",
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 1,true,false))
			.ChangeSlot(2).AddToTabList(RiderTabs.OOO_TAB_ITEM));

	public static final RegistryObject<Item> SASORI_NEW_MEDAL = ITEMS.register("sasori_new_medal",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_sasori","ooo","ooodriver_belt",
					new MobEffectInstance(MobEffects.WATER_BREATHING, 400, 0,true,false))
			.ChangeSlot(3).AddToTabList(RiderTabs.OOO_TAB_ITEM));


	public static final RegistryObject<Item> SAME_MEDAL = ITEMS.register("same_medal",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_same","ooo","ooodriver_belt",
					new MobEffectInstance(MobEffects.WATER_BREATHING, 400, 0,true,false))
			.ChangeSlot(1).AddToTabList(RiderTabs.OOO_TAB_ITEM));

	public static final RegistryObject<Item> KUJIRA_MEDAL = ITEMS.register("kujira_medal",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_kujira","ooo","ooodriver_belt",
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 1,true,false))
			.ChangeSlot(2).AddToTabList(RiderTabs.OOO_TAB_ITEM));

	public static final RegistryObject<Item> OOKAMIUO_MEDAL = ITEMS.register("ookamiuo_medal",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_ookamiuo","ooo","ooodriver_belt",
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 2,true,false))
			.ChangeSlot(3).AddToTabList(RiderTabs.OOO_TAB_ITEM));


	public static final RegistryObject<Item> SHIKA_MEDAL = ITEMS.register("shika_medal",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_shika","ooo","ooodriver_belt",
					new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 0,true,false))
			.ChangeSlot(1).AddToTabList(RiderTabs.OOO_TAB_ITEM));

	public static final RegistryObject<Item> GAZELLE_MEDAL = ITEMS.register("gazelle_medal",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_gazelle","ooo","ooodriver_belt",
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 1,true,false))
			.ChangeSlot(2).AddToTabList(RiderTabs.OOO_TAB_ITEM));

	public static final RegistryObject<Item> USHI_MEDAL = ITEMS.register("ushi_medal",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_ushi","ooo","ooodriver_belt",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 1,true,false))
			.ChangeSlot(3).AddToTabList(RiderTabs.OOO_TAB_ITEM));


	public static final RegistryObject<Item> SEIUCHI_MEDAL = ITEMS.register("seiuchi_medal",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_seiuchi","ooo","ooodriver_belt",
					new MobEffectInstance(MobEffects.SATURATION, 40, 1,true,false))
			.ChangeSlot(1).AddToTabList(RiderTabs.OOO_TAB_ITEM));

	public static final RegistryObject<Item> SHIROKUMA_MEDAL = ITEMS.register("shirokuma_medal",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_shirokuma","ooo","ooodriver_belt",
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 1,true,false))
			.ChangeSlot(2).AddToTabList(RiderTabs.OOO_TAB_ITEM));

	public static final RegistryObject<Item> PENGUIN_MEDAL = ITEMS.register("penguin_medal",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_penguin","ooo","ooodriver_belt",
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 2,true,false))
			.ChangeSlot(3).AddToTabList(RiderTabs.OOO_TAB_ITEM));


	public static final RegistryObject<Item> PANDA_MEDAL = ITEMS.register("panda_medal",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_panda","ooo","ooodriver_belt",
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 1,true,false))
			.ChangeSlot(2).AddToTabList(RiderTabs.OOO_TAB_ITEM));


	public static final RegistryObject<Item> KANGAROO_MEDAL_LEG = ITEMS.register("kangaroo_medal_leg",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_kangaroo_leg","ooo","ooodriver_belt",
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 1,true,false))
			.ChangeSlot(3));


	public static final RegistryObject<Item> KANGAROO_MEDAL = ITEMS.register("kangaroo_medal",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_kangaroo","ooo","ooodriver_belt",
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 1,true,false))
			.ChangeSlot(2).addShiftForm(KANGAROO_MEDAL_LEG.get()).AddToTabList(RiderTabs.OOO_TAB_ITEM));


	public static final RegistryObject<Item> YADOKARI_MEDAL = ITEMS.register("yadokari_medal",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_yadokari","ooo","ooodriver_belt",
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 2,true,false))
			.ChangeSlot(2).AddToTabList(RiderTabs.OOO_TAB_ITEM));


	public static final RegistryObject<Item> SUPER_TAKA_MEDAL = ITEMS.register("super_taka_medal",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_super_taka","ooo","ooodriver_belt",
					new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 0,true,false),
					new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 40, 0,true,false),
					new MobEffectInstance(MobEffects.REGENERATION, 40, 3,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 4,true,false),
					new MobEffectInstance(Effect_core.BOOST.get(), 40, 0,true,false))
			.ChangeSlot(1).AddToTabList(RiderTabs.OOO_TAB_ITEM));

	public static final RegistryObject<Item> SUPER_TORA_MEDAL = ITEMS.register("super_tora_medal",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_super_tora","ooo","ooodriver_belt",
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 5,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 3,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 3,true,false))
			.ChangeSlot(2).ifFlyingModelResource( "geo/rider_plusbelt_and_wings.geo.json").AddToTabList(RiderTabs.OOO_TAB_ITEM));

	public static final RegistryObject<Item> SUPER_BATTA_MEDAL = ITEMS.register("super_batta_medal",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_super_batta","ooo","ooodriver_belt",
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 2,true,false),
					new MobEffectInstance(MobEffects.JUMP, 40, 4,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 4,true,false))
			.ChangeSlot(3).AddToTabList(RiderTabs.OOO_TAB_ITEM));


	public static final RegistryObject<Item> TAKA_ETERNITY_MEDAL = ITEMS.register("taka_eternity_medal",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_taka_eternity","ooo","ooodriver_belt",
					new MobEffectInstance(MobEffects.SATURATION, 40, 1,true,false))
			.ChangeSlot(1).AddToTabList(RiderTabs.OOO_TAB_ITEM));

	public static final RegistryObject<Item> KUJAKU_ETERNITY_MEDAL = ITEMS.register("kujaku_eternity_medal",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_kujaku_eternity","ooo","ooodriver_belt",
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 1,true,false))
			.ChangeSlot(2).ifFlyingModelResource( "geo/rider_plusbelt_and_wings.geo.json").AddToTabList(RiderTabs.OOO_TAB_ITEM));

	public static final RegistryObject<Item> CONDOR_ETERNITY_MEDAL = ITEMS.register("condor_eternity_medal",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_condor_eternity","ooo","ooodriver_belt",
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 2,true,false))
			.ChangeSlot(3).AddToTabList(RiderTabs.OOO_TAB_ITEM));


	public static final RegistryObject<Item> ANCIENT_TAKA_MEDAL = ITEMS.register("ancient_taka_medal",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_taka","ooo","ooodriver_belt",
					new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 0,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 6,true,false),
					new MobEffectInstance(Effect_core.FLYING.get(), 40, 6,true,false))
			.ChangeSlot(1).AddToTabList(RiderTabs.OOO_TAB_ITEM));

	public static final RegistryObject<Item> ANCIENT_TORA_MEDAL = ITEMS.register("ancient_tora_medal",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_tora","ooo","ooodriver_belt",
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 1,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 3,true,false))
			.ChangeSlot(2).AddCompatibilityList(new String[] {"ooo_ancient"}).AddToTabList(RiderTabs.OOO_TAB_ITEM));

	public static final RegistryObject<Item> ANCIENT_BATTA_MEDAL = ITEMS.register("ancient_batta_medal",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_batta","ooo","ooodriver_belt",
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 3,true,false),
					new MobEffectInstance(MobEffects.JUMP, 40, 2,true,false))
			.ChangeSlot(3).AddToTabList(RiderTabs.OOO_TAB_ITEM));


	public static final RegistryObject<Item> MUKADE_GODA_MEDAL = ITEMS.register("mukade_goda_medal",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_mukade","goda","ooodriver_belt",
					new MobEffectInstance(MobEffects.REGENERATION, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 4,true,false),
					new MobEffectInstance(Effect_core.ANTIPOISON.get(), 400, 0,true,false))
			.ChangeSlot(1).AddToTabList(RiderTabs.OOO_TAB_ITEM));

	public static final RegistryObject<Item> HACHI_GODA_MEDAL = ITEMS.register("hachi_goda_medal",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_hachi","goda","ooodriver_belt",
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 3,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 3,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 5,true,false))
			.ChangeSlot(2).ChangeModel("geo/ooo_imagin.geo.json").AddToTabList(RiderTabs.OOO_TAB_ITEM));

	public static final RegistryObject<Item> ARI_GODA_MEDAL = ITEMS.register("ari_goda_medal",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_ari","goda","ooodriver_belt",
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 2,true,false),
					new MobEffectInstance(MobEffects.JUMP, 40, 4,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 4,true,false))
			.ChangeSlot(3).AddToTabList(RiderTabs.OOO_TAB_ITEM));


	public static final RegistryObject<Item> LOVE_CORE_MEDAL = ITEMS.register("love_core_medal",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_love_1","ooo","ooodriver_belt",
					new MobEffectInstance(MobEffects.REGENERATION, 40, 1,true,false))
			.ChangeSlot(1).AddToTabList(RiderTabs.OOO_TAB_ITEM));

	public static final RegistryObject<Item> LOVE_CORE2_MEDAL = ITEMS.register("love_core2_medal",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_love_2","ooo","ooodriver_belt",
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 1,true,false))
			.ChangeSlot(2).AddToTabList(RiderTabs.OOO_TAB_ITEM));

	public static final RegistryObject<Item> LOVE_CORE3_MEDAL = ITEMS.register("love_core3_medal",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_love_3","ooo","ooodriver_belt",
					new MobEffectInstance(MobEffects.SATURATION, 40, 1,true,false))
			.ChangeSlot(3).AddToTabList(RiderTabs.OOO_TAB_ITEM));



	public static final RegistryObject<Item> FOUNDATION_X_TAKA_MEDAL = ITEMS.register("foundation_x_taka_medal",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_taka","ooo","ooodriver_belt",
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 1,true,false),
					new MobEffectInstance(MobEffects.JUMP, 40, 0,true,false))
			.AddToTabList(RiderTabs.OOO_TAB_ITEM));

	public static final RegistryObject<Item> FOUNDATION_X_KUJAKU_MEDAL = ITEMS.register("foundation_x_kujaku_medal",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_kujaku","ooo","ooodriver_belt",
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 1,true,false),
					new MobEffectInstance(Effect_core.PUNCH.get(), 40, 0,true,false))
			.ChangeSlot(2).ifFlyingModelResource( "geo/rider_plusbelt_and_wings.geo.json").AddToTabList(RiderTabs.OOO_TAB_ITEM));

	public static final RegistryObject<Item> FOUNDATION_X_CONDOR_MEDAL = ITEMS.register("foundation_x_condor_medal",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_condor","ooo","ooodriver_belt",
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 1,true,false),
					new MobEffectInstance(Effect_core.PUNCH.get(), 40, 0,true,false))
			.ChangeSlot(3).AddToTabList(RiderTabs.OOO_TAB_ITEM));


	public static final RegistryObject<Item> FOUNDATION_X_LION_MEDAL = ITEMS.register("foundation_x_lion_medal",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_lion","ooo","ooodriver_belt",
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 1,true,false),
					new MobEffectInstance(MobEffects.JUMP, 40, 0,true,false))
			.AddToTabList(RiderTabs.OOO_TAB_ITEM));

	public static final RegistryObject<Item> FOUNDATION_X_TORA_MEDAL = ITEMS.register("foundation_x_tora_medal",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_tora","ooo","ooodriver_belt",
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 1,true,false),
					new MobEffectInstance(Effect_core.PUNCH.get(), 40, 0,true,false))
			.ChangeSlot(2).AddToTabList(RiderTabs.OOO_TAB_ITEM));

	public static final RegistryObject<Item> FOUNDATION_X_CHEETAH_MEDAL = ITEMS.register("foundation_x_cheetah_medal",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_cheetah","ooo","ooodriver_belt",
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 1,true,false),
					new MobEffectInstance(Effect_core.PUNCH.get(), 40, 0,true,false))
			.ChangeSlot(3).AddToTabList(RiderTabs.OOO_TAB_ITEM));


	public static final RegistryObject<Item> FOUNDATION_X_KUWAGATA_MEDAL = ITEMS.register("foundation_x_kuwagata_medal",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_kuwagata","ooo","ooodriver_belt",
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 1,true,false),
					new MobEffectInstance(MobEffects.JUMP, 40, 0,true,false))
			.AddToTabList(RiderTabs.OOO_TAB_ITEM));

	public static final RegistryObject<Item> FOUNDATION_X_KAMAKIRI_MEDAL = ITEMS.register("foundation_x_kamakiri_medal",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_kamakiri","ooo","ooodriver_belt",
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 1,true,false),
					new MobEffectInstance(Effect_core.PUNCH.get(), 40, 0,true,false))
			.ChangeSlot(2).AddToTabList(RiderTabs.OOO_TAB_ITEM));

	public static final RegistryObject<Item> FOUNDATION_X_BATTA_MEDAL = ITEMS.register("foundation_x_batta_medal",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_batta","ooo","ooodriver_belt",
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 1,true,false),
					new MobEffectInstance(Effect_core.PUNCH.get(), 40, 0,true,false))
			.ChangeSlot(3).AddToTabList(RiderTabs.OOO_TAB_ITEM));


	public static final RegistryObject<Item> FOUNDATION_X_SAI_MEDAL = ITEMS.register("foundation_x_sai_medal",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_sai","ooo","ooodriver_belt",
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 0,true,false),
					new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 40, 1,true,false))
			.ChangeSlot(1).AddToTabList(RiderTabs.OOO_TAB_ITEM));

	public static final RegistryObject<Item> FOUNDATION_X_GORILLA_MEDAL = ITEMS.register("foundation_x_gorilla_medal",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_gorilla","ooo","ooodriver_belt",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 0,true,false),
					new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 40, 1,true,false))
			.ChangeSlot(2).AddToTabList(RiderTabs.OOO_TAB_ITEM));

	public static final RegistryObject<Item> FOUNDATION_X_ZOU_MEDAL = ITEMS.register("foundation_x_zou_medal",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_zou","ooo","ooodriver_belt",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 1,true,false),
					new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 40, 1,true,false))
			.ChangeSlot(3).AddToTabList(RiderTabs.OOO_TAB_ITEM));


	public static final RegistryObject<Item> FOUNDATION_X_SHACHI_MEDAL = ITEMS.register("foundation_x_shachi_medal",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_shachi","ooo","ooodriver_belt",
					new MobEffectInstance(MobEffects.WATER_BREATHING, 400, 0,true,false),
					new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 0,true,false))
			.ChangeSlot(1).AddToTabList(RiderTabs.OOO_TAB_ITEM));

	public static final RegistryObject<Item> FOUNDATION_X_UNAGI_MEDAL = ITEMS.register("foundation_x_unagi_medal",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_unagi","ooo","ooodriver_belt",
					new MobEffectInstance(MobEffects.REGENERATION, 40, 0,true,false))
			.ChangeSlot(2).AddToTabList(RiderTabs.OOO_TAB_ITEM));

	public static final RegistryObject<Item> FOUNDATION_X_TAKO_MEDAL = ITEMS.register("foundation_x_tako_medal",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_tako","ooo","ooodriver_belt",
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 1,true,false),
					new MobEffectInstance(MobEffects.DOLPHINS_GRACE, 400, 0,true,false))
			.ChangeSlot(3).AddToTabList(RiderTabs.OOO_TAB_ITEM));



	public static final RegistryObject<Item> ZEUS_TAKA_MEDAL = ITEMS.register("zeus_taka_medal",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_taka","ooo","ooodriver_belt",
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 1,true,false),
					new MobEffectInstance(MobEffects.JUMP, 40, 0,true,false))
			.AddToTabList(RiderTabs.OOO_TAB_ITEM));

	public static final RegistryObject<Item> ZEUS_KUJAKU_MEDAL = ITEMS.register("zeus_kujaku_medal",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_kujaku","ooo","ooodriver_belt",
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 1,true,false),
					new MobEffectInstance(Effect_core.PUNCH.get(), 40, 0,true,false))
			.ChangeSlot(2).ifFlyingModelResource( "geo/rider_plusbelt_and_wings.geo.json").AddToTabList(RiderTabs.OOO_TAB_ITEM));

	public static final RegistryObject<Item> ZEUS_CONDOR_MEDAL = ITEMS.register("zeus_condor_medal",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_condor","ooo","ooodriver_belt",
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 1,true,false),
					new MobEffectInstance(Effect_core.PUNCH.get(), 40, 0,true,false))
			.ChangeSlot(3).AddToTabList(RiderTabs.OOO_TAB_ITEM));


	public static final RegistryObject<Item> ZEUS_LION_MEDAL = ITEMS.register("zeus_lion_medal",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_lion","ooo","ooodriver_belt",
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 1,true,false),
					new MobEffectInstance(MobEffects.JUMP, 40, 0,true,false))
			.AddToTabList(RiderTabs.OOO_TAB_ITEM));

	public static final RegistryObject<Item> ZEUS_TORA_MEDAL = ITEMS.register("zeus_tora_medal",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_tora","ooo","ooodriver_belt",
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 1,true,false),
					new MobEffectInstance(Effect_core.PUNCH.get(), 40, 0,true,false))
			.ChangeSlot(2).AddToTabList(RiderTabs.OOO_TAB_ITEM));

	public static final RegistryObject<Item> ZEUS_CHEETAH_MEDAL = ITEMS.register("zeus_cheetah_medal",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_cheetah","ooo","ooodriver_belt",
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 1,true,false),
					new MobEffectInstance(Effect_core.PUNCH.get(), 40, 0,true,false))
			.ChangeSlot(3).AddToTabList(RiderTabs.OOO_TAB_ITEM));


	public static final RegistryObject<Item> ZEUS_KUWAGATA_MEDAL = ITEMS.register("zeus_kuwagata_medal",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_kuwagata","ooo","ooodriver_belt",
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 1,true,false),
					new MobEffectInstance(MobEffects.JUMP, 40, 0,true,false))
			.AddToTabList(RiderTabs.OOO_TAB_ITEM));

	public static final RegistryObject<Item> ZEUS_KAMAKIRI_MEDAL = ITEMS.register("zeus_kamakiri_medal",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_kamakiri","ooo","ooodriver_belt",
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 1,true,false),
					new MobEffectInstance(Effect_core.PUNCH.get(), 40, 0,true,false))
			.ChangeSlot(2).AddToTabList(RiderTabs.OOO_TAB_ITEM));

	public static final RegistryObject<Item> ZEUS_BATTA_MEDAL = ITEMS.register("zeus_batta_medal",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_batta","ooo","ooodriver_belt",
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 1,true,false),
					new MobEffectInstance(Effect_core.PUNCH.get(), 40, 0,true,false))
			.ChangeSlot(3).AddToTabList(RiderTabs.OOO_TAB_ITEM));


	public static final RegistryObject<Item> ZEUS_SAI_MEDAL = ITEMS.register("zeus_sai_medal",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_sai","ooo","ooodriver_belt",
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 0,true,false),
					new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 40, 1,true,false))
			.ChangeSlot(1).AddToTabList(RiderTabs.OOO_TAB_ITEM));

	public static final RegistryObject<Item> ZEUS_GORILLA_MEDAL = ITEMS.register("zeus_gorilla_medal",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_gorilla","ooo","ooodriver_belt",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 0,true,false),
					new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 40, 1,true,false))
			.ChangeSlot(2).AddToTabList(RiderTabs.OOO_TAB_ITEM));

	public static final RegistryObject<Item> ZEUS_ZOU_MEDAL = ITEMS.register("zeus_zou_medal",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_zou","ooo","ooodriver_belt",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 1,true,false),
					new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 40, 1,true,false))
			.ChangeSlot(3).AddToTabList(RiderTabs.OOO_TAB_ITEM));


	public static final RegistryObject<Item> ZEUS_SHACHI_MEDAL = ITEMS.register("zeus_shachi_medal",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_shachi","ooo","ooodriver_belt",
					new MobEffectInstance(MobEffects.WATER_BREATHING, 400, 0,true,false),
					new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 0,true,false))
			.ChangeSlot(1).AddToTabList(RiderTabs.OOO_TAB_ITEM));

	public static final RegistryObject<Item> ZEUS_UNAGI_MEDAL = ITEMS.register("zeus_unagi_medal",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_unagi","ooo","ooodriver_belt",
					new MobEffectInstance(MobEffects.REGENERATION, 40, 0,true,false))
			.ChangeSlot(2).AddToTabList(RiderTabs.OOO_TAB_ITEM));

	public static final RegistryObject<Item> ZEUS_TAKO_MEDAL = ITEMS.register("zeus_tako_medal",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_tako","ooo","ooodriver_belt",
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 1,true,false),
					new MobEffectInstance(MobEffects.DOLPHINS_GRACE, 400, 0,true,false))
			.ChangeSlot(3).AddToTabList(RiderTabs.OOO_TAB_ITEM));


	public static final RegistryObject<Item> ZEUS_PTERA_MEDAL = ITEMS.register("zeus_ptera_medal",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_ptera","ooo","ooodriver_belt",
					new MobEffectInstance(MobEffects.JUMP, 40, 2,true,false))
			.ChangeSlot(1).AddToTabList(RiderTabs.OOO_TAB_ITEM));

	public static final RegistryObject<Item> ZEUS_TRICERA_MEDAL = ITEMS.register("zeus_tricera_medal",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_tricera","ooo","ooodriver_belt",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40	, 3,true,false))
			.ChangeSlot(2).AddToTabList(RiderTabs.OOO_TAB_ITEM));

	public static final RegistryObject<Item> ZEUS_TYRANNO_MEDAL = ITEMS.register("zeus_tyranno_medal",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_tyranno","ooo","ooodriver_belt",
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 2,true,false))
			.ChangeSlot(3).AddToTabList(RiderTabs.OOO_TAB_ITEM));


	public static final RegistryObject<Item> ZEUS_MUKADE_MEDAL = ITEMS.register("zeus_mukade_medal",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_mukade","ooo","ooodriver_belt",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 1,true,false))
			.ChangeSlot(1).AddToTabList(RiderTabs.OOO_TAB_ITEM));

	public static final RegistryObject<Item> ZEUS_HACHI_MEDAL = ITEMS.register("zeus_hachi_medal",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_hachi","ooo","ooodriver_belt",
					new MobEffectInstance(MobEffects.JUMP, 40, 2,true,false))
			.ChangeSlot(2).AddToTabList(RiderTabs.OOO_TAB_ITEM));

	public static final RegistryObject<Item> ZEUS_ARI_MEDAL = ITEMS.register("zeus_ari_medal",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_ari","ooo","ooodriver_belt",
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false))
			.ChangeSlot(3).AddToTabList(RiderTabs.OOO_TAB_ITEM));


	public static final RegistryObject<Item> X_MEDAL = ITEMS.register("x_medal",
			() -> new BaseItem(new Item.Properties()).AddToTabList(RiderTabs.OOO_TAB_ITEM));

	public static final RegistryObject<Item> AMAZON_MEDAL = ITEMS.register("amazon_medal",
			() -> new BaseItem(new Item.Properties()).AddToTabList(RiderTabs.OOO_TAB_ITEM));

	public static final RegistryObject<Item> STRONGER_MEDAL = ITEMS.register("stronger_medal",
			() -> new BaseItem(new Item.Properties()).AddToTabList(RiderTabs.OOO_TAB_ITEM));


	public static final RegistryObject<Item> HABATAKI_MEDAL = ITEMS.register("habataki_medal",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_habataki","ooo","ooodriver_belt",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 1,true,false))
			.ChangeSlot(1).AddToTabList(RiderTabs.OOO_TAB_ITEM));

	public static final RegistryObject<Item> TAIGA_MEDAL = ITEMS.register("taiga_medal",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_tiger","ooo","ooodriver_belt",
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 2,true,false))
			.ChangeSlot(2).AddToTabList(RiderTabs.OOO_TAB_ITEM));

	public static final RegistryObject<Item> ICHIGO_MEDAL = ITEMS.register("ichigo_medal",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_ichigo","ooo","ooodriver_belt",
					new MobEffectInstance(MobEffects.JUMP, 40, 2,true,false))
			.ChangeSlot(3).AddToTabList(RiderTabs.OOO_TAB_ITEM));


	public static final RegistryObject<Item> IMAGIN_MEDAL = ITEMS.register("imagin_medal",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_imagin","ooo","ooodriver_belt",
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 1,true,false),
					new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 400, 0,true,false))
			.ChangeSlot(2).ChangeModel("geo/ooo_imagin.geo.json").AddToTabList(RiderTabs.OOO_TAB_ITEM));

	public static final RegistryObject<Item> SHOCKER_MEDAL = ITEMS.register("shocker_medal",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_shocker","ooo","ooodriver_belt",
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 1,true,false))
			.ChangeSlot(3).AddToTabList(RiderTabs.OOO_TAB_ITEM));

	public static final RegistryObject<Item> GEL_SHOCKER_MEDAL = ITEMS.register("gel_shocker_medal",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_gel_shocker","shocker_ooo","ooodriver_belt",
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 1,true,false))
			.ChangeSlot(2).AddToTabList(RiderTabs.OOO_TAB_ITEM));

	public static final RegistryObject<Item> DESTRON_MEDAL = ITEMS.register("destron_medal",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_destron","shocker_ooo","ooodriver_belt",
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 1,true,false))
			.ChangeSlot(3).AddToTabList(RiderTabs.OOO_TAB_ITEM));

	public static final RegistryObject<Item> GOD_MEDAL = ITEMS.register("god_medal",
			() -> new BaseItem(new Item.Properties()).AddToTabList(RiderTabs.OOO_TAB_ITEM));

	public static final RegistryObject<Item> GARANDA_MEDAL = ITEMS.register("garanda_medal",
			() -> new BaseItem(new Item.Properties()).AddToTabList(RiderTabs.OOO_TAB_ITEM));

	public static final RegistryObject<Item> DELZA_MEDAL = ITEMS.register("delza_medal",
			() -> new BaseItem(new Item.Properties()).AddToTabList(RiderTabs.OOO_TAB_ITEM));

	public static final RegistryObject<Item> NEO_SHOCKER_MEDAL = ITEMS.register("neo_shocker_medal",
			() -> new BaseItem(new Item.Properties()).AddToTabList(RiderTabs.OOO_TAB_ITEM));

	public static final RegistryObject<Item> JIN_DOGMA_MEDAL = ITEMS.register("jin_dogma_medal",
			() -> new BaseItem(new Item.Properties()).AddToTabList(RiderTabs.OOO_TAB_ITEM));

	public static final RegistryObject<Item> BADAN_MEDAL = ITEMS.register("badan_medal",
			() -> new BaseItem(new Item.Properties()).AddToTabList(RiderTabs.OOO_TAB_ITEM));

	
	

	public static final RegistryObject<Item> BIRTH_CORE = ITEMS.register("birth_core",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"","birth","birth_driver_belt",
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 0,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 0,true,false))
			.AddToTabList(RiderTabs.OOO_TAB_ITEM));

	public static final RegistryObject<Item> PROTO_BIRTH_CORE = ITEMS.register("proto_birth_core",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"","birth_prototype","birth_driver_belt",
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 0,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 0,true,false))
			.AddToTabList(RiderTabs.OOO_TAB_ITEM));

	public static final RegistryObject<Item> BIRTH_CORE_EYES = ITEMS.register("birth_core_eyes",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_eyes","birth","birth_driver_belt",
					new MobEffectInstance(MobEffects.NIGHT_VISION, 4000, 1,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 0,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 0,true,false))
			.addSwitchForm(OOO_Rider_Items.BIRTH_CORE.get())
			.AddCompatibilityList(new String[] {"birth_prototype"}).AddToTabList(CellMedalProgramer.CELL_MEDAL).AddToTabList(RiderTabs.OOO_TAB_ITEM));

	public static final RegistryObject<Item> BIRTH_CORE_BREAST_CANNON = ITEMS.register("birth_core_breast_cannon",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"","birth","",
					new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 40, 1,true,false))
			.ChangeSlot(2).addSwitchForm(Modded_item_core.BLANK_FORM.get())
			.AddCompatibilityList(new String[] {"birth_prototype"}).AddToTabList(CellMedalProgramer.CELL_MEDAL).AddToTabList(RiderTabs.OOO_TAB_ITEM));

	public static final RegistryObject<Item> BIRTH_CORE_CRANE_ARM = ITEMS.register("birth_core_crane_arm",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"","birth","",
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false))
			.ChangeSlot(3).addSwitchForm(Modded_item_core.BLANK_FORM.get())
			.AddCompatibilityList(new String[] {"birth_prototype"}).AddToTabList(CellMedalProgramer.CELL_MEDAL).AddToTabList(RiderTabs.OOO_TAB_ITEM));

	public static final RegistryObject<Item> BIRTH_CORE_SHOVEL_ARM = ITEMS.register("birth_core_shovel_arm",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"","birth","",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false))
			.ChangeSlot(4).addSwitchForm(Modded_item_core.BLANK_FORM.get())
			.AddToTabList(CellMedalProgramer.CELL_MEDAL).AddToTabList(RiderTabs.OOO_TAB_ITEM));
	
	public static final RegistryObject<Item> BIRTH_CORE_CATEPTLLAR_LEG = ITEMS.register("birth_core_catepillar_leg",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"","birth","",
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 3,true,false))
			.ChangeSlot(5).addSwitchForm(Modded_item_core.BLANK_FORM.get())
			.AddToTabList(CellMedalProgramer.CELL_MEDAL).AddToTabList(RiderTabs.OOO_TAB_ITEM));

	public static final RegistryObject<Item> BIRTH_CORE_DRILL_ARM = ITEMS.register("birth_core_drill_arm",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"","birth","",
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 2,true,false))
			.ChangeSlot(6).addSwitchForm(Modded_item_core.BLANK_FORM.get())
			.AddToTabList(CellMedalProgramer.CELL_MEDAL).AddToTabList(RiderTabs.OOO_TAB_ITEM));

	
	public static final RegistryObject<Item> BIRTH_CORE_CUTTER_WING = ITEMS.register("birth_core_cutter_wing",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"","birth","",
					new MobEffectInstance(Effect_core.FLYING.get(), 40, 0,true,false))
			.ChangeSlot(7).addSwitchForm(Modded_item_core.BLANK_FORM.get())
			.AddCompatibilityList(new String[] {"birth_prototype"}).AddToTabList(CellMedalProgramer.CELL_MEDAL).AddToTabList(RiderTabs.OOO_TAB_ITEM));

	public static final RegistryObject<Item> GREEED_ABSORPTION_CORE = ITEMS.register("greeed_absorption_core",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_tora_greeed_absorption","ooo_ancient","ooodriver_belt",
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 1,true,false))
			.ChangeSlot(2).ChangeModel("geo/ooo_imagin.geo.json").AddToTabList(RiderTabs.OOO_TAB_ITEM));

	
	  public static final RegistryObject<Item> AQUA_CORE = ITEMS.register("aqua_core",
	            () -> new RiderFormChangeItem(new Item.Properties(),0,"","aqua","aqua_driver_belt",
	            		new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 1,true,false),new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 1,true,false)
	            		,new MobEffectInstance(MobEffects.JUMP, 40, 2,true,false),new MobEffectInstance(MobEffects.WATER_BREATHING, 40, 2,true,false)).AddToTabList(RiderTabs.OOO_TAB_ITEM));
	


	public static final RegistryObject<Item> PURPLE_MEDALS_SEALED = ITEMS.register("purple_medals_sealed",
			() -> new BaseItem(new Item.Properties()).AddToTabList(RiderTabs.OOO_TAB_ITEM));
	public static final RegistryObject<BaseItem> PURPLE_MEDALS_OPENED = ITEMS.register("purple_medals_opened",
			() -> new Item_Purple_Medals(new Item.Properties()).AddToTabList(RiderTabs.OOO_TAB_ITEM));
	public static final RegistryObject<Item> PURPLE_MEDALS_EMPTY = ITEMS.register("purple_medals_empty",
			() -> new BaseItem(new Item.Properties()).AddToTabList(RiderTabs.OOO_TAB_ITEM));

	public static final RegistryObject<Item> OOOHELMET = ITEMS.register("ooohead",
			() -> new RiderArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.HELMET, new Item.Properties()).AddToTabList(RiderTabs.OOO_TAB_ITEM).ChangeRepairItem(CELL_MEDAL.get()));
	public static final RegistryObject<Item> OOOCHESTPLATE = ITEMS.register("oootroso",
			() -> new RiderArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.CHESTPLATE, new Item.Properties()).AddToTabList(RiderTabs.OOO_TAB_ITEM).ChangeRepairItem(CELL_MEDAL.get()));
	public static final RegistryObject<Item> OOOLEGGINGS = ITEMS.register("ooolegs",
			() -> new RiderArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.LEGGINGS, new Item.Properties()).AddToTabList(RiderTabs.OOO_TAB_ITEM).ChangeRepairItem(CELL_MEDAL.get()));


	public static final RegistryObject<Item> OOODRIVER = ITEMS.register("ooodriver",
			() -> new OOODriverItem(ArmorMaterials.DIAMOND,"ooo",TAKA_MEDAL ,OOOHELMET,OOOCHESTPLATE,OOOLEGGINGS , new Item.Properties())
			.Add_Extra_Base_Form_Items(TORA_MEDAL,BATTA_MEDAL).ChangeRepairItem(CELL_MEDAL.get()).AddToTabList(RiderTabs.OOO_TAB_ITEM));


	public static final RegistryObject<Item> BIRTH_DRIVER = ITEMS.register("birth_driver",
			() -> new BirthDriverItem(ArmorMaterials.DIAMOND,"birth",BIRTH_CORE ,OOOHELMET,OOOCHESTPLATE,OOOLEGGINGS , new Item.Properties())
			.ChangeRepairItem(CELL_MEDAL.get()).AddToTabList(RiderTabs.OOO_TAB_ITEM));

	public static final RegistryObject<Item> PROTO_BIRTH_DRIVER = ITEMS.register("proto_birth_driver",
			() -> new BirthDriverItem(ArmorMaterials.DIAMOND,"birth_prototype",BIRTH_CORE ,OOOHELMET,OOOCHESTPLATE,OOOLEGGINGS , new Item.Properties())
			.ChangeRepairItem(CELL_MEDAL.get()).AddToTabList(RiderTabs.OOO_TAB_ITEM));

	public static final RegistryObject<Item> BIRTH_DRIVER_X = ITEMS.register("birth_driver_x",
			() -> new RiderDriverItem(ArmorMaterials.DIAMOND,"birth_x",EBI_NEW_MEDAL ,OOOHELMET,OOOCHESTPLATE,OOOLEGGINGS , new Item.Properties())
			.Add_Extra_Base_Form_Items(KANI_NEW_MEDAL, SASORI_NEW_MEDAL).Override_belt_text("birth_driver_x_belt").ChangeRepairItem(CELL_MEDAL.get()).AddToTabList(RiderTabs.OOO_TAB_ITEM));

	public static final RegistryObject<Item> REBIRTH_DRIVER_X = ITEMS.register("rebirth_driver",
			() -> new RiderDriverItem(ArmorMaterials.DIAMOND,"re_birth",Modded_item_core.BLANK_FORM ,OOOHELMET,OOOCHESTPLATE,OOOLEGGINGS , new Item.Properties())
			.Override_belt_text("rebirth_driver_belt").ChangeRepairItem(CELL_MEDAL.get()).AddToTabList(RiderTabs.OOO_TAB_ITEM));

	
	public static final RegistryObject<Item> AQUA_DRIVER = ITEMS.register("aqua_driver",
			() -> new RiderDriverItem(ArmorMaterials.DIAMOND,"aqua",AQUA_CORE ,OOOHELMET,OOOCHESTPLATE,OOOLEGGINGS , new Item.Properties())
			.ChangeRepairItem(CELL_MEDAL.get()).AddToTabList(RiderTabs.OOO_TAB_ITEM));
	
	public static final RegistryObject<Item> POSEIDONDRIVER = ITEMS.register("poseidon_driver",
			() -> new RiderDriverItem(ArmorMaterials.DIAMOND,"poseidon",SAME_MEDAL ,OOOHELMET,OOOCHESTPLATE,OOOLEGGINGS , new Item.Properties())
			.Add_Extra_Base_Form_Items(KUJIRA_MEDAL,OOKAMIUO_MEDAL).Override_belt_text("poseidon_driver_belt").ChangeRepairItem(CELL_MEDAL.get()).AddToTabList(RiderTabs.OOO_TAB_ITEM));

	public static final RegistryObject<Item> ANCIENT_OOODRIVER = ITEMS.register("ancient_ooodriver",
			() -> new OOODriverItem(ArmorMaterials.DIAMOND,"ooo_ancient",ANCIENT_TAKA_MEDAL ,OOOHELMET,OOOCHESTPLATE,OOOLEGGINGS , new Item.Properties())
			.Add_Extra_Base_Form_Items(ANCIENT_TORA_MEDAL,ANCIENT_BATTA_MEDAL).ChangeRepairItem(CELL_MEDAL.get()).AddToTabList(RiderTabs.OOO_TAB_ITEM));

	public static final RegistryObject<Item> GODA_OOODRIVER = ITEMS.register("goda_ooodriver",
			() -> new OOODriverItem(ArmorMaterials.DIAMOND,"goda",MUKADE_GODA_MEDAL ,OOOHELMET,OOOCHESTPLATE,OOOLEGGINGS , new Item.Properties())
			.Add_Extra_Base_Form_Items(HACHI_GODA_MEDAL,ARI_GODA_MEDAL).ChangeRepairItem(CELL_MEDAL.get()).AddToTabList(RiderTabs.OOO_TAB_ITEM));

	public static final RegistryObject<Item> SHOCKER_OOODRIVER = ITEMS.register("shocker_ooodriver",
			() -> new OOODriverItem(ArmorMaterials.DIAMOND,"shocker_ooo",SHOCKER_MEDAL ,OOOHELMET,OOOCHESTPLATE,OOOLEGGINGS , new Item.Properties())
			.Add_Extra_Base_Form_Items(GEL_SHOCKER_MEDAL,DESTRON_MEDAL).ChangeRepairItem(CELL_MEDAL.get()).AddToTabList(RiderTabs.OOO_TAB_ITEM));

	public static final RegistryObject<Item> CORE_DRIVER = ITEMS.register("core_driver",
			() -> new RiderDriverItem(ArmorMaterials.DIAMOND,"core",EBI_MEDAL ,OOOHELMET,OOOCHESTPLATE,OOOLEGGINGS , new Item.Properties())
			.Add_Extra_Base_Form_Items(KANI_MEDAL,SASORI_MEDAL,Modded_item_core.BLANK_FORM).Override_belt_text("gaia_core_typhoon_belt").ChangeRepairItem(CELL_MEDAL.get()).AddToTabList(RiderTabs.OOO_TAB_ITEM));
	
	public static final RegistryObject<Item> POWERED_UP_CORE_DRIVER = ITEMS.register("powered_up_core_driver",
			() -> new RiderDriverItem(ArmorMaterials.DIAMOND,"powered_up_core",EBI_MEDAL ,OOOHELMET,OOOCHESTPLATE,OOOLEGGINGS , new Item.Properties())
			.Add_Extra_Base_Form_Items(KANI_MEDAL,SASORI_MEDAL).Override_belt_text("powered_up_gaia_core_typhoon_belt").ChangeRepairItem(CELL_MEDAL.get()).AddToTabList(RiderTabs.OOO_TAB_ITEM));
	

	public static final RegistryObject<Item> GREEED_BLET_ANKH_LOST = ITEMS.register("greeed_blet_ankh_lost",
			() -> new RiderDriverItem(ArmorMaterials.DIAMOND,"ankh_lost",TAKA_MEDAL ,OOOHELMET,OOOCHESTPLATE,OOOLEGGINGS , new Item.Properties())
			.Add_Extra_Base_Form_Items(KUJAKU_MEDAL,CONDOR_MEDAL).Override_belt_text("ankh_lost_belt").ChangeRepairItem(CELL_MEDAL.get()).AddToTabList(RiderTabs.OOO_TAB_ITEM));

	public static final RegistryObject<Item> GREEED_BLET_ANKH = ITEMS.register("greeed_blet_ankh",
			() -> new RiderDriverItem(ArmorMaterials.DIAMOND,"ankh_complete",TAKA_ANKH_MEDAL ,OOOHELMET,OOOCHESTPLATE,OOOLEGGINGS , new Item.Properties())
			.Add_Extra_Base_Form_Items(KUJAKU_MEDAL,CONDOR_MEDAL).Override_belt_text("ankh_belt").ChangeRepairItem(CELL_MEDAL.get()).AddToTabList(RiderTabs.OOO_TAB_ITEM));

	public static final RegistryObject<Item> GREEED_BLET_UVA = ITEMS.register("greeed_blet_uva",
			() -> new RiderDriverItem(ArmorMaterials.DIAMOND,"uva_complete",KUWAGATA_MEDAL ,OOOHELMET,OOOCHESTPLATE,OOOLEGGINGS , new Item.Properties())
			.Add_Extra_Base_Form_Items(KAMAKIRI_MEDAL,BATTA_MEDAL).Override_belt_text("ankh_belt").ChangeRepairItem(CELL_MEDAL.get()).AddToTabList(RiderTabs.OOO_TAB_ITEM));

	public static final RegistryObject<Item> GREEED_BLET_KAZARI = ITEMS.register("greeed_blet_kazari",
			() -> new RiderDriverItem(ArmorMaterials.DIAMOND,"kazari_complete",LION_MEDAL ,OOOHELMET,OOOCHESTPLATE,OOOLEGGINGS , new Item.Properties())
			.Add_Extra_Base_Form_Items(TORA_MEDAL,CHEETAH_MEDAL).Override_belt_text("ankh_belt").ChangeRepairItem(CELL_MEDAL.get()).AddToTabList(RiderTabs.OOO_TAB_ITEM));

	public static final RegistryObject<Item> GREEED_BLET_MEZOOL = ITEMS.register("greeed_blet_mezool",
			() -> new RiderDriverItem(ArmorMaterials.DIAMOND,"mezool_complete",SHACHI_MEDAL ,OOOHELMET,OOOCHESTPLATE,OOOLEGGINGS , new Item.Properties())
			.Add_Extra_Base_Form_Items(UNAGI_MEDAL,TAKO_MEDAL).Override_belt_text("ankh_belt").ChangeRepairItem(CELL_MEDAL.get()).AddToTabList(RiderTabs.OOO_TAB_ITEM));

	public static final RegistryObject<Item> GREEED_BLET_GAMEL = ITEMS.register("greeed_blet_gamel",
			() -> new RiderDriverItem(ArmorMaterials.DIAMOND,"gamel_complete",SAI_MEDAL ,OOOHELMET,OOOCHESTPLATE,OOOLEGGINGS , new Item.Properties())
			.Add_Extra_Base_Form_Items(GORILLA_MEDAL,ZOU_MEDAL).Override_belt_text("ankh_belt").ChangeRepairItem(CELL_MEDAL.get()).AddToTabList(RiderTabs.OOO_TAB_ITEM));

	public static final RegistryObject<Item> GREEED_BLET_MUCHIRI = ITEMS.register("greeed_blet_muchiri",
			() -> new RiderDriverItem(ArmorMaterials.DIAMOND,"muchiri_complete",MUKADE_MEDAL ,OOOHELMET,OOOCHESTPLATE,OOOLEGGINGS , new Item.Properties())
			.Add_Extra_Base_Form_Items(HACHI_MEDAL,ARI_MEDAL).Override_belt_text("ankh_belt").ChangeRepairItem(CELL_MEDAL.get()).AddToTabList(RiderTabs.OOO_TAB_ITEM));

	public static final RegistryObject<Item> O_SCANNER = ITEMS.register("o_scanner",
			() -> new oScannerItem(new Item.Properties()).AddToTabList(RiderTabs.OOO_TAB_ITEM));


	public static final RegistryObject<SwordItem> MEDAJALIBUR = ITEMS.register("medajalibur",
			() -> new BaseSwordItem(Tiers.DIAMOND, 5, 3.5f, new Item.Properties()).AddToTabList(RiderTabs.OOO_TAB_ITEM).ChangeRepairItem(CELL_MEDAL.get()));

	public static final RegistryObject<BaseBlasterItem> TAJASPINNER = ITEMS.register("tajaspinner",
			() -> new BaseBlasterItem(Tiers.DIAMOND, 5, 3.5f, new Item.Properties()).IsSwordGun().setProjectileFireball().AddToTabList(RiderTabs.OOO_TAB_ITEM).ChangeRepairItem(CELL_MEDAL.get()));

	public static final RegistryObject<BaseBlasterItem> MEDAGABURYU = ITEMS.register("medagaburyu",
			() -> new BaseBlasterItem(Tiers.DIAMOND, 12, 3.5f, new Item.Properties()).IsSwordGun().setProjectileWitherSkull().AddToTabList(RiderTabs.OOO_TAB_ITEM).ChangeRepairItem(CELL_MEDAL.get()));

	public static final RegistryObject<BaseBlasterItem> TAJASPINNER_ETERNITY = ITEMS.register("tajaspinner_eternity",
			() -> new BaseBlasterItem(Tiers.DIAMOND, 9, 3.5f, new Item.Properties()).IsSwordGun().setProjectileLargeFireball(1).AddToTabList(RiderTabs.OOO_TAB_ITEM).ChangeRepairItem(CELL_MEDAL.get()));


	public static final RegistryObject<SwordItem> DEEPEST_HARPOON = ITEMS.register("deepest_harpoon",
			() -> new BaseSwordItem(Tiers.DIAMOND, 9, 3.5f, new Item.Properties()).AddToTabList(RiderTabs.OOO_TAB_ITEM).ChangeRepairItem(CELL_MEDAL.get()));

	public static final RegistryObject<SwordItem> ANICENT_OOO_GREEED_SWORD = ITEMS.register("ancient_ooo_greeed_sword",
			() -> new BaseSwordItem(Tiers.DIAMOND, 11, 3.5f, new Item.Properties()).AddToTabList(RiderTabs.OOO_TAB_ITEM).ChangeRepairItem(CELL_MEDAL.get()));

	public static final RegistryObject<BaseBlasterItem> BIRTH_BUSTER = ITEMS.register("birth_buster",
			() -> new BaseBlasterItem(Tiers.DIAMOND, 5, 3.5f, new Item.Properties()).AddToTabList(RiderTabs.OOO_TAB_ITEM).ChangeRepairItem(CELL_MEDAL.get()));
	

	public static void register(IEventBus eventBus) {
		ITEMS.register(eventBus);
	}

}