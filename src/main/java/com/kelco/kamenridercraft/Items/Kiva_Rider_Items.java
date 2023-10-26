package com.kelco.kamenridercraft.Items;

import com.kelco.kamenridercraft.KamenRiderCraftCore;
import com.kelco.kamenridercraft.Blocks.MachineBlocks.GSystemChipProgrammer;
import com.kelco.kamenridercraft.Items.rider_armor_base.BaseBlasterItem;
import com.kelco.kamenridercraft.Items.rider_armor_base.BaseItem;
import com.kelco.kamenridercraft.Items.rider_armor_base.BaseShieldItem;
import com.kelco.kamenridercraft.Items.rider_armor_base.BaseSwordItem;
import com.kelco.kamenridercraft.Items.rider_armor_base.RiderArmorItem;
import com.kelco.kamenridercraft.Items.rider_armor_base.RiderDriverItem;
import com.kelco.kamenridercraft.Items.rider_armor_base.RiderFormChangeItem;
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

public class Kiva_Rider_Items {

	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, KamenRiderCraftCore.MODID);

	public static final RegistryObject<Item> KIVA_LOGO = ITEMS.register("kiva_logo",
    		() -> new BaseItem(new Item.Properties()).AddToTabList(RiderTabs.KIVA_TAB_ITEM));
 
	public static final RegistryObject<Item> FUESTLE = ITEMS.register("fuestle",
			() -> new BaseItem(new Item.Properties()).AddToTabList(RiderTabs.KIVA_TAB_ITEM));
	public static final RegistryObject<Item> FAKE_FUESTLE = ITEMS.register("fuestlefake",
			() -> new BaseItem(new Item.Properties()).AddToTabList(RiderTabs.KIVA_TAB_ITEM));
	
    	    
    public static final RegistryObject<Item> WAKE_UP_FUESTLE = ITEMS.register("wakeupfuestle",
            () -> new RiderFormChangeItem(new Item.Properties(),0,"","kiva","kivat_belt",
            		new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 0,true,false),
            		new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 0,true,false)).AddToTabList(RiderTabs.KIVA_TAB_ITEM));
    
	
	public static final RegistryObject<Item> KIVAHELMET = ITEMS.register("kivahead",
            () -> new RiderArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.HELMET, new Item.Properties()).AddToTabList(RiderTabs.KIVA_TAB_ITEM).ChangeRepairItem(FUESTLE.get()));
    public static final RegistryObject<Item> KIVACHESTPLATE = ITEMS.register("kivatroso",
            () -> new RiderArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.CHESTPLATE, new Item.Properties()).AddToTabList(RiderTabs.KIVA_TAB_ITEM).ChangeRepairItem(FUESTLE.get()));
    public static final RegistryObject<Item> KIVALEGGINGS = ITEMS.register("kivalegs",
            () -> new RiderArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.LEGGINGS, new Item.Properties()).AddToTabList(RiderTabs.KIVA_TAB_ITEM).ChangeRepairItem(FUESTLE.get()));

    
    public static final RegistryObject<Item> KIVAT_BELT = ITEMS.register("kivadriver",
    		() -> new RiderDriverItem(ArmorMaterials.DIAMOND,"kiva", WAKE_UP_FUESTLE,KIVAHELMET, KIVACHESTPLATE, KIVALEGGINGS, new Item.Properties()).AddToTabList(RiderTabs.KIVA_TAB_ITEM).ChangeRepairItem(FUESTLE.get()));
    
    /***
    public static final RegistryObject<SwordItem> FLAME_SABER = ITEMS.register("flame_saber",
         	() -> new BaseSwordItem(Tiers.DIAMOND, 5, 3.5f, new Item.Properties()).AddToTabList(RiderTabs.AGITO_TAB_ITEM).ChangeRepairItem(SEED_OF_AGITO.get()));
	public static final RegistryObject<BaseBlasterItem> GM_01_SCORPION = ITEMS.register("gm_01_scorpion",
			() -> new BaseBlasterItem(Tiers.DIAMOND, 4, 3.5f, new Item.Properties()).AddToTabList(RiderTabs.AGITO_TAB_ITEM).ChangeRepairItem(SEED_OF_AGITO.get()));
***/
    public static void register(IEventBus eventBus) {
		ITEMS.register(eventBus);
	}

}