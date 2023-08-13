package com.kelco.kamenridercraft.Items;

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

public class Kuuga_Rider_Items {

	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, KamenRiderCraftCore.MODID);
    
    public static final RegistryObject<Item> KUUGA_GROWING = ITEMS.register("kuuga_growing",
            () -> new RiderFormChangeItem(new Item.Properties(),0,"_growing","kuuga","arcle_belt",
            		new MobEffectInstance(MobEffects.WEAKNESS, 40, 2,true,false)).AddToTabList(RiderTabs.KUUGA_TAB_ITEM));
	
    
    public static final RegistryObject<SwordItem> DRAGON_ROD = ITEMS.register("dragon_rod",
            () -> new BaseSwordItem(Tiers.DIAMOND, 5, 3.5f, new Item.Properties()).AddToTabList(RiderTabs.KUUGA_TAB_ITEM).ChangeRepairItem(KUUGA_GROWING.get()));
	public static final RegistryObject<BaseBlasterItem> PEGASUS_BOWGUN = ITEMS.register("pegasus_bowgun",
	        () -> new BaseBlasterItem(Tiers.DIAMOND, 4, 3.5f, new Item.Properties()).AddToTabList(RiderTabs.KUUGA_TAB_ITEM).ChangeRepairItem(KUUGA_GROWING.get()));
	public static final RegistryObject<SwordItem> TITAN_SWORD = ITEMS.register("titan_sword",
	        () -> new BaseSwordItem(Tiers.DIAMOND, 5, 3.5f, new Item.Properties()).AddToTabList(RiderTabs.KUUGA_TAB_ITEM).ChangeRepairItem(KUUGA_GROWING.get()));
    
	
	public static final RegistryObject<Item> KUUGAHELMET = ITEMS.register("kuugahead",
            () -> new RiderArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.HELMET, new Item.Properties()).AddToTabList(RiderTabs.KUUGA_TAB_ITEM).ChangeRepairItem(KUUGA_GROWING.get()));
    public static final RegistryObject<Item> KUUGACHESTPLATE = ITEMS.register("kuugatroso",
            () -> new RiderArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.CHESTPLATE, new Item.Properties()).AddToTabList(RiderTabs.KUUGA_TAB_ITEM).ChangeRepairItem(KUUGA_GROWING.get()));
    public static final RegistryObject<Item> KUUGALEGGINGS = ITEMS.register("kuugalegs",
            () -> new RiderArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.LEGGINGS, new Item.Properties()).AddToTabList(RiderTabs.KUUGA_TAB_ITEM).ChangeRepairItem(KUUGA_GROWING.get()));
    
    
    public static final RegistryObject<Item> KUUGA_MIGHTY = ITEMS.register("kuuga_mighty",
            () -> new RiderFormChangeItem(new Item.Properties(),0,"","kuuga","arcle_belt",
            		new MobEffectInstance(Effect_core.PUNCH.get(), 40, 2,true,false)).AddToTabList(RiderTabs.KUUGA_TAB_ITEM));

    public static final RegistryObject<Item> KUUGA_DRAGON = ITEMS.register("kuuga_dragon",
            () -> new RiderFormChangeItem(new Item.Properties(),0,"_dragon","kuuga","arcle_belt_d",
            		new MobEffectInstance(MobEffects.DIG_SPEED, 40, 0,true,false),
            		new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 0,true,false)).AddToTabList(RiderTabs.KUUGA_TAB_ITEM));

    public static final RegistryObject<Item> KUUGA_PEGASUS = ITEMS.register("kuuga_pegasus",
            () -> new RiderFormChangeItem(new Item.Properties(),0,"_pegasus","kuuga","arcle_belt_p",
            		new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 0,true,false),
            		new MobEffectInstance(MobEffects.JUMP, 40, 2,true,false)).AddToTabList(RiderTabs.KUUGA_TAB_ITEM));

    public static final RegistryObject<Item> KUUGA_TITAN = ITEMS.register("kuuga_titan",
            () -> new RiderFormChangeItem(new Item.Properties(),0,"_titan","kuuga","arcle_belt_t",
            		new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 0,true,false),
            		new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 40, 0,true,false),
            		new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 0,true,false)).AddToTabList(RiderTabs.KUUGA_TAB_ITEM));

    public static final RegistryObject<Item> KUUGA_RISING_MIGHTY = ITEMS.register("kuuga_rising_mighty",
            () -> new RiderFormChangeItem(new Item.Properties(),0,"_rising_mighty","kuuga","arcle_belt_r",
            		new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 0,true,false),
            		new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 0,true,false),
            		new MobEffectInstance(Effect_core.PUNCH.get(), 40, 3,true,false)).AddToTabList(RiderTabs.KUUGA_TAB_ITEM));

    public static final RegistryObject<Item> KUUGA_RISING_DRAGON = ITEMS.register("kuuga_rising_dragon",
            () -> new RiderFormChangeItem(new Item.Properties(),0,"_rising_dragon","kuuga","arcle_belt_r",
            		new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
            		new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 1,true,false),
            		new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 0,true,false)).AddToTabList(RiderTabs.KUUGA_TAB_ITEM));

    public static final RegistryObject<Item> KUUGA_RISING_PEGASUS = ITEMS.register("kuuga_rising_pegasus",
            () -> new RiderFormChangeItem(new Item.Properties(),0,"_rising_pegasus","kuuga","arcle_belt_r",
            		new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 0,true,false),
            		new MobEffectInstance(MobEffects.JUMP, 40, 4,true,false),
            		new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 1,true,false),
            		new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 0,true,false)).AddToTabList(RiderTabs.KUUGA_TAB_ITEM));

    public static final RegistryObject<Item> KUUGA_RISING_TITAN = ITEMS.register("kuuga_rising_titan",
            () -> new RiderFormChangeItem(new Item.Properties(),0,"_rising_titan","kuuga","arcle_belt_r",
            		new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
            		new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 40, 0,true,false),
            		new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 2,true,false)).AddToTabList(RiderTabs.KUUGA_TAB_ITEM));

    public static final RegistryObject<Item> KUUGA_AMAZING_MIGHTY = ITEMS.register("kuuga_amazing_mighty",
            () -> new RiderFormChangeItem(new Item.Properties(),0,"_amazing_mighty","kuuga","arcle_belt_r",
            		new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
            		new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 2,true,false),
            		new MobEffectInstance(MobEffects.JUMP, 40, 1,true,false),
            		new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 2,true,false),
            		new MobEffectInstance(Effect_core.PUNCH.get(), 40, 4,true,false)).AddToTabList(RiderTabs.KUUGA_TAB_ITEM));

    public static final RegistryObject<Item> KUUGA_ULTIMATE = ITEMS.register("kuuga_ultimate",
            () -> new RiderFormChangeItem(new Item.Properties(),0,"_ultimate","kuuga","arcle_belt_u",
            		new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 4,true,false),
            		new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 3,true,false),
            		new MobEffectInstance(MobEffects.JUMP, 40, 3,true,false),
            		new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 4,true,false),
            		new MobEffectInstance(Effect_core.PUNCH.get(), 40, 5,true,false)).AddToTabList(RiderTabs.KUUGA_TAB_ITEM));

    public static final RegistryObject<Item> KUUGA_RISING_ULTIMATE = ITEMS.register("kuuga_rising_ultimate",
            () -> new RiderFormChangeItem(new Item.Properties(),0,"_rising_ultimate","kuuga","arcle_belt_ru",
            		new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 6,true,false),
            		new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 4,true,false),
            		new MobEffectInstance(MobEffects.JUMP, 40, 4,true,false),
            		new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 5,true,false),
            		new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 0,true,false),
            		new MobEffectInstance(Effect_core.PUNCH.get(), 40, 5,true,false)).AddToTabList(RiderTabs.KUUGA_TAB_ITEM));

    public static final RegistryObject<Item> KUUGA_SUPER_RISING_ULTIMATE = ITEMS.register("kuuga_super_rising_ultimate",
    		() -> new RiderFormChangeItem(new Item.Properties(),0,"_super_rising_ultimate","kuuga","arcle_belt_ru",
            		new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 8,true,false),
            		new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 5,true,false),
            		new MobEffectInstance(MobEffects.JUMP, 40, 6,true,false),
            		new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 7,true,false),
            		new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 0,true,false),
            		new MobEffectInstance(Effect_core.PUNCH.get(), 40, 6,true,false)).AddToTabList(RiderTabs.KUUGA_TAB_ITEM));

    
    public static final RegistryObject<Item> ARCLE = ITEMS.register("arcle",
    		() -> new RiderDriverItem(ArmorMaterials.DIAMOND,"kuuga",KUUGA_MIGHTY ,KUUGAHELMET, KUUGACHESTPLATE,KUUGALEGGINGS , new Item.Properties()).AddToTabList(RiderTabs.KUUGA_TAB_ITEM).ChangeRepairItem(KUUGA_GROWING.get()));

    public static final RegistryObject<Item> KUUGA_LOGO = ITEMS.register("kuuga_logo",
    		() -> new BaseItem(new Item.Properties()).AddToTabList(RiderTabs.KUUGA_TAB_ITEM));

	public static void register(IEventBus eventBus) {
		ITEMS.register(eventBus);
	}

}