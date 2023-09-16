package com.kelco.kamenridercraft.Items;

import com.kelco.kamenridercraft.KamenRiderCraftCore;
import com.kelco.kamenridercraft.Items.rider_armor_base.BaseItem;
import com.kelco.kamenridercraft.Items.rider_armor_base.RiderFormChangeItem;

import net.minecraft.world.food.Foods;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class Modded_item_core {
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, KamenRiderCraftCore.MODID);

	public static final RegistryObject<Item> BLANK_FORM = ITEMS.register("blank_form",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"","",""));

	
	public static final RegistryObject<Item> RIDER_CIRCUIT = ITEMS.register("rider_circuit",
			() -> new BaseItem(new Item.Properties()).AddToTabList(RiderTabs.Misc_TAB_ITEM));

	public static final RegistryObject<Item> BASE_SWORD = ITEMS.register("base_sword",
			() -> new BaseItem(new Item.Properties()).AddToTabList(RiderTabs.Misc_TAB_ITEM));

	public static final RegistryObject<Item> BASE_BIKE = ITEMS.register("base_bike",
			() -> new BaseItem(new Item.Properties()).AddToTabList(RiderTabs.Misc_TAB_ITEM));

	public static final RegistryObject<Item> SHOCKER_EMBLEM = ITEMS.register("shocker_emblem",
			() -> new BaseItem(new Item.Properties()).AddToTabList(RiderTabs.Misc_TAB_ITEM));


	public static final RegistryObject<Item> DONUT = ITEMS.register("donut",
			() -> new BaseItem(new Item.Properties().food(Foods.BREAD)).AddToTabList(RiderTabs.Misc_TAB_ITEM));


	//Dragreder
	//Stagtornador
	//Herculespader
	//Darkwing
	//Greywolch
	
	//GrandGouram
	//Exbeeter
	//Chaosdile
	//Leatheraider
	public static final RegistryObject<Item> FLARESALAMANDER = ITEMS.register("flaresalamander",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_flaresalamander","v3","double_typhoon_belt").ChangeModel("geo/v3_flaresalamander.geo.json").AddToTabList(RiderTabs.Misc_TAB_ITEM));

	//Dragranzer
	//Scissorbeeter
	//Akanetaka
	//Shadowmantis
	public static final RegistryObject<Item> CYCLONEHOPPER = ITEMS.register("cyclonehopper",
		() -> new RiderFormChangeItem(new Item.Properties(),0,"_cyclonehopper","ichigo","typhoon_belt_original").ChangeModel("geo/cyclonehopper_wingsarmor.geo.json").AddToTabList(RiderTabs.Misc_TAB_ITEM));

	//Bakuen no senshi
	//Jinrai no senshi
	
	public static void register(IEventBus eventBus) {
		ITEMS.register(eventBus);
	}

}