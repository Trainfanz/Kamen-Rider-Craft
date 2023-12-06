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

	
	public static final RegistryObject<Item> MIGHTY_ACTION_X_GASHAT = ITEMS.register("mighty_action_x_gashat",
            () -> new RiderFormChangeItem(new Item.Properties(),0,"","ex_aid","gamer_driver_mighty_action_x",
            		new MobEffectInstance(MobEffects.JUMP, 40, 2,true,false)).alsoChange2ndSlot(Modded_item_core.BLANK_FORM.get()).AddToTabList(RiderTabs.EX_AID_TAB_ITEM));
	    
	public static final RegistryObject<Item> GEKITOTSU_ROBOTS_GASHAT = ITEMS.register("gekitotsu_robots_gashat",
            () -> new RiderFormChangeItem(new Item.Properties(),0,"robotgamer","ex_aid","gamer_driver_mighty_action_x",
            		new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 1,true,false)).ChangeSlot(2).AddToTabList(RiderTabs.EX_AID_TAB_ITEM));
	    
	
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