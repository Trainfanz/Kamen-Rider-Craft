package com.kelco.kamenridercraft.Items;

import com.kelco.kamenridercraft.KamenRiderCraftCore;
import com.kelco.kamenridercraft.Blocks.MachineBlocks.GaiaMemoryRefinerBlock;
import com.kelco.kamenridercraft.Effect.Effect_core;
import com.kelco.kamenridercraft.Items.rider_armor_base.BaseBlasterItem;
import com.kelco.kamenridercraft.Items.rider_armor_base.BaseItem;
import com.kelco.kamenridercraft.Items.rider_armor_base.BaseShieldItem;
import com.kelco.kamenridercraft.Items.rider_armor_base.BaseSwordItem;
import com.kelco.kamenridercraft.Items.rider_armor_base.RiderArmorItem;
import com.kelco.kamenridercraft.Items.rider_armor_base.RiderDriverItem;
import com.kelco.kamenridercraft.Items.rider_armor_base.RiderFormChangeItem;
import com.kelco.kamenridercraft.Items.w.MetalShaftItem;
import com.kelco.kamenridercraft.Items.w.WDriverItem;
import com.kelco.kamenridercraft.Potion.Potion_core;

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

public class Agito_Rider_Items {

	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, KamenRiderCraftCore.MODID);

	public static final RegistryObject<Item> SEED_OF_AGITO = ITEMS.register("agito_of_seed",
			() -> new BaseItem(new Item.Properties()).AddToTabList(RiderTabs.AGITO_TAB_ITEM));
    
    public static final RegistryObject<SwordItem> FLAME_SABER = ITEMS.register("flame_saber",
            () -> new BaseSwordItem(Tiers.DIAMOND, 5, 3.5f, new Item.Properties()).AddToTabList(RiderTabs.AGITO_TAB_ITEM).ChangeRepairItem(SEED_OF_AGITO.get()));
	public static final RegistryObject<SwordItem> STORM_HALBERD = ITEMS.register("storm_halberd",
	        () -> new BaseSwordItem(Tiers.DIAMOND, 5, 3.5f, new Item.Properties()).AddToTabList(RiderTabs.AGITO_TAB_ITEM).ChangeRepairItem(SEED_OF_AGITO.get()));
    
	public static final RegistryObject<SwordItem> SHINING_CALIBER = ITEMS.register("shining_caliber_summoned",
            () -> new BaseSwordItem(Tiers.DIAMOND, 5, 3.5f, new Item.Properties()).AddToTabList(RiderTabs.AGITO_TAB_ITEM).ChangeRepairItem(SEED_OF_AGITO.get()));
	public static final RegistryObject<SwordItem> SHINING_CALIBER_TWIN = ITEMS.register("shining_caliber",
            () -> new BaseSwordItem(Tiers.DIAMOND, 5, 3.5f, new Item.Properties()).AddToTabList(RiderTabs.AGITO_TAB_ITEM).ChangeRepairItem(SEED_OF_AGITO.get()));
	
	public static final RegistryObject<SwordItem> GUARD_ACCELLER = ITEMS.register("guard_acceller",
            () -> new BaseSwordItem(Tiers.DIAMOND, 5, 3.5f, new Item.Properties()).AddToTabList(RiderTabs.AGITO_TAB_ITEM).ChangeRepairItem(SEED_OF_AGITO.get()));
	public static final RegistryObject<BaseBlasterItem> GM_01_SCORPION = ITEMS.register("gm_01_scorpion",
			() -> new BaseBlasterItem(Tiers.DIAMOND, 4, 3.5f, new Item.Properties()).AddToTabList(RiderTabs.AGITO_TAB_ITEM).ChangeRepairItem(SEED_OF_AGITO.get()));
	public static final RegistryObject<BaseBlasterItem> GG_02_SALAMANDER = ITEMS.register("gg_02_salamander",
			() -> new BaseBlasterItem(Tiers.DIAMOND, 4, 3.5f, new Item.Properties()).AddToTabList(RiderTabs.AGITO_TAB_ITEM).ChangeRepairItem(SEED_OF_AGITO.get()));
	public static final RegistryObject<SwordItem> GS_03_DESTROYER = ITEMS.register("gs_03_destroyer",
            () -> new BaseSwordItem(Tiers.DIAMOND, 5, 3.5f, new Item.Properties()).AddToTabList(RiderTabs.AGITO_TAB_ITEM).ChangeRepairItem(SEED_OF_AGITO.get()));
	public static final RegistryObject<SwordItem> GA_04_ANTARES = ITEMS.register("ga_04_antares",
            () -> new BaseSwordItem(Tiers.DIAMOND, 5, 3.5f, new Item.Properties()).AddToTabList(RiderTabs.AGITO_TAB_ITEM).ChangeRepairItem(SEED_OF_AGITO.get()));
	public static final RegistryObject<BaseBlasterItem> GX_05_KERBEROS = ITEMS.register("gx_05_kerberos",
			() -> new BaseBlasterItem(Tiers.DIAMOND, 4, 3.5f, new Item.Properties()).AddToTabList(RiderTabs.AGITO_TAB_ITEM).ChangeRepairItem(SEED_OF_AGITO.get()));
	public static final RegistryObject<BaseBlasterItem> GX_LAUNCHER = ITEMS.register("gx_launcher",
			() -> new BaseBlasterItem(Tiers.DIAMOND, 4, 3.5f, new Item.Properties()).AddToTabList(RiderTabs.AGITO_TAB_ITEM).ChangeRepairItem(SEED_OF_AGITO.get()));
	public static final RegistryObject<SwordItem> GK_06_UNICORN = ITEMS.register("gk_06_unicorn",
            () -> new BaseSwordItem(Tiers.DIAMOND, 5, 3.5f, new Item.Properties()).AddToTabList(RiderTabs.AGITO_TAB_ITEM).ChangeRepairItem(SEED_OF_AGITO.get()));
	public static final RegistryObject<ShieldItem> G3_SHIELD = ITEMS.register("g3_shield",
            () -> new BaseShieldItem(new Item.Properties()).AddToTabList(RiderTabs.AGITO_TAB_ITEM).ChangeRepairItem(SEED_OF_AGITO.get()));
	public static final RegistryObject<ShieldItem> G3_X_SHIELD = ITEMS.register("g3x_shield",
            () -> new BaseShieldItem(new Item.Properties()).AddToTabList(RiderTabs.AGITO_TAB_ITEM).ChangeRepairItem(SEED_OF_AGITO.get()));

	public static final RegistryObject<BaseBlasterItem> G4_GIGANT = ITEMS.register("g4_gigant",
			() -> new BaseBlasterItem(Tiers.DIAMOND, 4, 3.5f, new Item.Properties()).AddToTabList(RiderTabs.AGITO_TAB_ITEM).ChangeRepairItem(SEED_OF_AGITO.get()));
	
	public static final RegistryObject<BaseBlasterItem> V1_SHOT = ITEMS.register("v1_shot",
			() -> new BaseBlasterItem(Tiers.DIAMOND, 4, 3.5f, new Item.Properties()).AddToTabList(RiderTabs.AGITO_TAB_ITEM).ChangeRepairItem(SEED_OF_AGITO.get()));
	
	public static final RegistryObject<SwordItem> JUDGEMENT_STAFF = ITEMS.register("judgment_staff",
            () -> new BaseSwordItem(Tiers.DIAMOND, 5, 3.5f, new Item.Properties()).AddToTabList(RiderTabs.AGITO_TAB_ITEM).ChangeRepairItem(SEED_OF_AGITO.get()));
	public static final RegistryObject<SwordItem> RESENTMENT_DU_SANGA = ITEMS.register("el_of_the_water_staff",
            () -> new BaseSwordItem(Tiers.DIAMOND, 5, 3.5f, new Item.Properties()).AddToTabList(RiderTabs.AGITO_TAB_ITEM).ChangeRepairItem(SEED_OF_AGITO.get()));
	
	
	public static final RegistryObject<Item> AGITOHELMET = ITEMS.register("agitohead",
            () -> new RiderArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.HELMET, new Item.Properties()).AddToTabList(RiderTabs.AGITO_TAB_ITEM).ChangeRepairItem(SEED_OF_AGITO.get()));
    public static final RegistryObject<Item> AGITOCHESTPLATE = ITEMS.register("agitotroso",
            () -> new RiderArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.CHESTPLATE, new Item.Properties()).AddToTabList(RiderTabs.AGITO_TAB_ITEM).ChangeRepairItem(SEED_OF_AGITO.get()));
    public static final RegistryObject<Item> AGITOLEGGINGS = ITEMS.register("agitolegs",
            () -> new RiderArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.LEGGINGS, new Item.Properties()).AddToTabList(RiderTabs.AGITO_TAB_ITEM).ChangeRepairItem(SEED_OF_AGITO.get()));
    

    public static final RegistryObject<Item> AGITO_GROUND = ITEMS.register("agito_ground",
            () -> new RiderFormChangeItem(new Item.Properties(),0,"","agito","alter_ring_belt",
            		new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 0,true,false),
            		new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 0,true,false)).AddToTabList(RiderTabs.AGITO_TAB_ITEM));

    public static final RegistryObject<Item> AGITO_STORM = ITEMS.register("agito_storm",
            () -> new RiderFormChangeItem(new Item.Properties(),0,"_storm","agito","alter_ring_belt_s",
            		new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 1,true,false),
            		new MobEffectInstance(MobEffects.JUMP, 40, 0,true,false)).AddToTabList(RiderTabs.AGITO_TAB_ITEM));

    public static final RegistryObject<Item> AGITO_FLAME = ITEMS.register("agito_flame",
            () -> new RiderFormChangeItem(new Item.Properties(),0,"_flame","agito","alter_ring_belt_f",
            		new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 0,true,false),
            		new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 40, 0,true,false)).AddToTabList(RiderTabs.AGITO_TAB_ITEM));

    public static final RegistryObject<Item> AGITO_TRINITY = ITEMS.register("agito_trinity",
            () -> new RiderFormChangeItem(new Item.Properties(),0,"_trinity","agito","alter_ring_belt",
            		new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 1,true,false),
            		new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 40, 0,true,false),
            		new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 0,true,false),
            		new MobEffectInstance(MobEffects.JUMP, 40, 0,true,false)).AddToTabList(RiderTabs.AGITO_TAB_ITEM));

    public static final RegistryObject<Item> AGITO_BURNING = ITEMS.register("agito_burning",
            () -> new RiderFormChangeItem(new Item.Properties(),0,"_burning","agito","alter_ring_belt_b",
            		new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 1,true,false),
            		new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 40, 0,true,false),
            		new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 2,true,false),
            		new MobEffectInstance(MobEffects.JUMP, 40, 2,true,false),
            		new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false)).AddToTabList(RiderTabs.AGITO_TAB_ITEM));

    public static final RegistryObject<Item> AGITO_SHINING = ITEMS.register("agito_shining",
            () -> new RiderFormChangeItem(new Item.Properties(),0,"_shining","agito","alter_ring_belt_b",
            		new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 3,true,false),
            		new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 40, 0,true,false),
            		new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 4,true,false),
            		new MobEffectInstance(MobEffects.JUMP, 40, 3,true,false),
            		new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 3,true,false)).AddToTabList(RiderTabs.AGITO_TAB_ITEM));

    
    public static final RegistryObject<Item> ALTERING = ITEMS.register("alter_ring",
    		() -> new RiderDriverItem(ArmorMaterials.DIAMOND,"agito",AGITO_GROUND ,AGITOHELMET, AGITOCHESTPLATE,AGITOLEGGINGS , new Item.Properties()).AddToTabList(RiderTabs.AGITO_TAB_ITEM).ChangeRepairItem(SEED_OF_AGITO.get()));
    
    public static final RegistryObject<Item> ALTERING_REIKO = ITEMS.register("alter_ring_reiko",
    		() -> new RiderDriverItem(ArmorMaterials.DIAMOND,"female_agito",AGITO_TRINITY ,AGITOHELMET, AGITOCHESTPLATE,AGITOLEGGINGS , new Item.Properties()).AddToTabList(RiderTabs.AGITO_TAB_ITEM).ChangeRepairItem(SEED_OF_AGITO.get()));

	public static void register(IEventBus eventBus) {
		ITEMS.register(eventBus);
	}

}