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

public class Blade_Rider_Items {

	
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, KamenRiderCraftCore.MODID);

	public static final RegistryObject<Item> BLADE_LOGO = ITEMS.register("blade_logo",
    		() -> new BaseItem(new Item.Properties()).AddToTabList(RiderTabs.BLADE_TAB_ITEM));
	
	
	public static final RegistryObject<Item> BLADECARD = ITEMS.register("bladecard",
			() -> new BaseItem(new Item.Properties()).AddToTabList(RiderTabs.BLADE_TAB_ITEM));
    	    	
    public static final RegistryObject<Item> CHANGE_BEETLE = ITEMS.register("change_beetle",
            () -> new RiderFormChangeItem(new Item.Properties(),0,"","blade","bladedriver_belt",
            		new MobEffectInstance(MobEffects.DIG_SPEED, 40, 1,true,false),
            		new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 1,true,false)).AddToTabList(RiderTabs.BLADE_TAB_ITEM));
    
    public static final RegistryObject<Item> FUSION_EAGLE = ITEMS.register("fusion_eagle",
            () -> new RiderFormChangeItem(new Item.Properties(),0,"_jack","blade","bladedriver_belt",
            		new MobEffectInstance(MobEffects.DIG_SPEED, 40, 0,true,false),
            		new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 1,true,false),
            		new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 0,true,false),
            		new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 2,true,false),
            		new MobEffectInstance(Effect_core.FLYING.get(), 400, 0,true,false)).AddToTabList(RiderTabs.BLADE_TAB_ITEM));
    
	public static final RegistryObject<Item> ABSORB_CAPRICORN = ITEMS.register("absorb_capricorn",
    		() -> new BaseItem(new Item.Properties()).AddToTabList(RiderTabs.BLADE_TAB_ITEM));
    
    public static final RegistryObject<Item> EVOLUTION_CAUCASUS = ITEMS.register("evolution_caucasus",
            () -> new RiderFormChangeItem(new Item.Properties(),0,"_king","blade","bladedriver_belt",
            		new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 3,true,false),
            		new MobEffectInstance(MobEffects.JUMP, 40, 2,true,false),
            		new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 40, 0,true,false),
            		new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 4,true,false)).AddToTabList(RiderTabs.BLADE_TAB_ITEM));
    
    public static final RegistryObject<Item> CHANGE_STAG = ITEMS.register("change_stag",
            () -> new RiderFormChangeItem(new Item.Properties(),0,"","garren","garrenbuckle_belt",
            		new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 1,true,false),
            		new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 0,true,false)).AddToTabList(RiderTabs.BLADE_TAB_ITEM));
    
    public static final RegistryObject<Item> FUSION_PEACOCK = ITEMS.register("fusion_peacock",
            () -> new RiderFormChangeItem(new Item.Properties(),0,"_jack","garren","garrenbuckle_belt",
            		new MobEffectInstance(MobEffects.DIG_SPEED, 40, 0,true,false),
            		new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 2,true,false),
            		new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 0,true,false),
            		new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 1,true,false),
            		new MobEffectInstance(Effect_core.FLYING.get(), 400, 0,true,false)).AddToTabList(RiderTabs.BLADE_TAB_ITEM));
    
	public static final RegistryObject<Item> ABSORB_SERPENT = ITEMS.register("absorb_serpent",
    		() -> new BaseItem(new Item.Properties()).AddToTabList(RiderTabs.BLADE_TAB_ITEM));
    
    public static final RegistryObject<Item> EVOLUTION_GIRAFFA = ITEMS.register("evolution_giraffa",
            () -> new RiderFormChangeItem(new Item.Properties(),0,"_king","garren","garrenbuckle_belt",
            		new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 3,true,false),
            		new MobEffectInstance(MobEffects.JUMP, 40, 2,true,false),
            		new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 40, 0,true,false),
            		new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 4,true,false)).AddToTabList(RiderTabs.BLADE_TAB_ITEM));
    
    public static final RegistryObject<Item> CHANGE_SPIDER = ITEMS.register("change_spider",
            () -> new RiderFormChangeItem(new Item.Properties(),0,"","leangle","leanglebuckle_belt",
            		new MobEffectInstance(MobEffects.DIG_SPEED, 40, 1,true,false),
            		new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 1,true,false)).AddToTabList(RiderTabs.BLADE_TAB_ITEM));
    
    public static final RegistryObject<Item> FUSION_ELEPHANT = ITEMS.register("fusion_elephant",
            () -> new RiderFormChangeItem(new Item.Properties(),0,"_jack","leangle","leanglebuckle_belt",
            		new MobEffectInstance(MobEffects.DIG_SPEED, 40, 1,true,false),
            		new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 2,true,false),
            		new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 0,true,false),
            		new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 1,true,false)).AddToTabList(RiderTabs.BLADE_TAB_ITEM));
    
	public static final RegistryObject<Item> ABSORB_TIGER = ITEMS.register("absorb_tiger",
    		() -> new BaseItem(new Item.Properties()).AddToTabList(RiderTabs.BLADE_TAB_ITEM));
    
	public static final RegistryObject<Item> EVOLUTION_TARANTULA = ITEMS.register("evolution_tarantula",
    		() -> new BaseItem(new Item.Properties()).AddToTabList(RiderTabs.BLADE_TAB_ITEM));
	
	public static final RegistryObject<Item> CHANGE_MANTIS = ITEMS.register("change_mantis",
            () -> new RiderFormChangeItem(new Item.Properties(),0,"","chalice","chalicerouzer_belt",
            		new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 1,true,false),
            		new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 1,true,false),
            		new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 2,true,false)).AddToTabList(RiderTabs.BLADE_TAB_ITEM));
    
    public static final RegistryObject<Item> EVOLUTION_PARADOXA = ITEMS.register("evolution_paradoxa",
            () -> new RiderFormChangeItem(new Item.Properties(),0,"_wild","chalice","chalicerouzer_belt",
            		new MobEffectInstance(MobEffects.DIG_SPEED, 40, 0,true,false),
            		new MobEffectInstance(MobEffects.JUMP, 40, 0,true,false),
            		new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 4,true,false),
            		new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 3,true,false)).AddToTabList(RiderTabs.BLADE_TAB_ITEM));
    
    public static final RegistryObject<Item> CHANGE_KERBEROS_GLAIVE = ITEMS.register("change_kerberos_glaive",
            () -> new RiderFormChangeItem(new Item.Properties(),0,"","glaive","glaivebuckle_belt",
            		new MobEffectInstance(MobEffects.DIG_SPEED, 40, 1,true,false),
            		new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 0,true,false)).AddToTabList(RiderTabs.BLADE_TAB_ITEM));
    public static final RegistryObject<Item> CHANGE_KERBEROS_LARC = ITEMS.register("change_kerberos_larc",
            () -> new RiderFormChangeItem(new Item.Properties(),0,"","larc","larcbuckle_belt",
            		new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 0,true,false),
            		new MobEffectInstance(MobEffects.JUMP, 40, 0,true,false),
            		new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 1,true,false)).AddToTabList(RiderTabs.BLADE_TAB_ITEM));
    public static final RegistryObject<Item> CHANGE_KERBEROS_LANCE = ITEMS.register("change_kerberos_lance",
            () -> new RiderFormChangeItem(new Item.Properties(),0,"","lance","lancebuckle_belt",
            		new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 0,true,false),
            		new MobEffectInstance(MobEffects.JUMP, 40, 1,true,false),
            		new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 1,true,false),
            		new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 0,true,false)).AddToTabList(RiderTabs.BLADE_TAB_ITEM));
	
	public static final RegistryObject<Item> BLADEHELMET = ITEMS.register("bladehead",
            () -> new RiderArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.HELMET, new Item.Properties()).AddToTabList(RiderTabs.BLADE_TAB_ITEM).ChangeRepairItem(BLADECARD.get()));
    public static final RegistryObject<Item> BLADECHESTPLATE = ITEMS.register("bladetroso",
            () -> new RiderArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.CHESTPLATE, new Item.Properties()).AddToTabList(RiderTabs.BLADE_TAB_ITEM).ChangeRepairItem(BLADECARD.get()));
    public static final RegistryObject<Item> BLADELEGGINGS = ITEMS.register("bladelegs",
            () -> new RiderArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.LEGGINGS, new Item.Properties()).AddToTabList(RiderTabs.BLADE_TAB_ITEM).ChangeRepairItem(BLADECARD.get()));

    
    public static final RegistryObject<Item> BLAYBUCKLE = ITEMS.register("blay_buckle",
    		() -> new RiderDriverItem(ArmorMaterials.DIAMOND,"blade",CHANGE_BEETLE ,BLADEHELMET, BLADECHESTPLATE,BLADELEGGINGS , new Item.Properties()).AddToTabList(RiderTabs.BLADE_TAB_ITEM).ChangeRepairItem(BLADECARD.get()));
    public static final RegistryObject<Item> GARRENBUCKLE = ITEMS.register("garren_buckle",
    		() -> new RiderDriverItem(ArmorMaterials.DIAMOND,"garren",CHANGE_STAG ,BLADEHELMET, BLADECHESTPLATE,BLADELEGGINGS , new Item.Properties()).AddToTabList(RiderTabs.BLADE_TAB_ITEM).ChangeRepairItem(BLADECARD.get()));
    public static final RegistryObject<Item> LEANGLEBUCKLE = ITEMS.register("leangle_buckle",
    		() -> new RiderDriverItem(ArmorMaterials.DIAMOND,"leangle",CHANGE_SPIDER ,BLADEHELMET, BLADECHESTPLATE,BLADELEGGINGS , new Item.Properties()).AddToTabList(RiderTabs.BLADE_TAB_ITEM).ChangeRepairItem(BLADECARD.get()));
    public static final RegistryObject<Item> CHALICEROUZER = ITEMS.register("chalice_rouzer",
    		() -> new RiderDriverItem(ArmorMaterials.DIAMOND,"blade",CHANGE_MANTIS ,BLADEHELMET, BLADECHESTPLATE,BLADELEGGINGS , new Item.Properties()).AddToTabList(RiderTabs.BLADE_TAB_ITEM).ChangeRepairItem(BLADECARD.get()));
    public static final RegistryObject<Item> GLAIVEBUCKLE = ITEMS.register("glaive_buckle",
    		() -> new RiderDriverItem(ArmorMaterials.DIAMOND,"glaive",CHANGE_KERBEROS_GLAIVE ,BLADEHELMET, BLADECHESTPLATE,BLADELEGGINGS , new Item.Properties()).AddToTabList(RiderTabs.BLADE_TAB_ITEM).ChangeRepairItem(BLADECARD.get()));
    public static final RegistryObject<Item> LARCBUCKLE = ITEMS.register("larc_buckle",
    		() -> new RiderDriverItem(ArmorMaterials.DIAMOND,"larc",CHANGE_KERBEROS_LARC ,BLADEHELMET, BLADECHESTPLATE,BLADELEGGINGS , new Item.Properties()).AddToTabList(RiderTabs.BLADE_TAB_ITEM).ChangeRepairItem(BLADECARD.get()));
    public static final RegistryObject<Item> LANCEBUCKLE = ITEMS.register("lance_buckle",
    		() -> new RiderDriverItem(ArmorMaterials.DIAMOND,"lance",CHANGE_KERBEROS_LANCE ,BLADEHELMET, BLADECHESTPLATE,BLADELEGGINGS , new Item.Properties()).AddToTabList(RiderTabs.BLADE_TAB_ITEM).ChangeRepairItem(BLADECARD.get()));
 
	public static final RegistryObject<Item> ROUZE_ABSORBER = ITEMS.register("rouze_absorber",
    		() -> new BaseItem(new Item.Properties()).AddToTabList(RiderTabs.BLADE_TAB_ITEM));

    public static final RegistryObject<SwordItem> BLAYROUZER = ITEMS.register("blayrouzer",
            () -> new BaseSwordItem(Tiers.DIAMOND, 5, 3.5f, new Item.Properties()).AddToTabList(RiderTabs.BLADE_TAB_ITEM).ChangeRepairItem(BLADECARD.get()));
    public static final RegistryObject<SwordItem> KINGROUZER = ITEMS.register("kingrouzer",
            () -> new BaseSwordItem(Tiers.DIAMOND, 5, 3.5f, new Item.Properties()).AddToTabList(RiderTabs.BLADE_TAB_ITEM).ChangeRepairItem(BLADECARD.get()));
    public static final RegistryObject<BaseBlasterItem> GARRENROUZER = ITEMS.register("garrenrouzer",
    		() -> new BaseBlasterItem(Tiers.DIAMOND, 4, 3.5f, new Item.Properties()).AddToTabList(RiderTabs.BLADE_TAB_ITEM).ChangeRepairItem(BLADECARD.get()));
    public static final RegistryObject<SwordItem> LEANGLEROUZER = ITEMS.register("leanglerouzer",
            () -> new BaseSwordItem(Tiers.DIAMOND, 5, 3.5f, new Item.Properties()).AddToTabList(RiderTabs.BLADE_TAB_ITEM).ChangeRepairItem(BLADECARD.get()));
    public static final RegistryObject<SwordItem> GLAIVEROUZER = ITEMS.register("glaiverouzer",
            () -> new BaseSwordItem(Tiers.DIAMOND, 5, 3.5f, new Item.Properties()).AddToTabList(RiderTabs.BLADE_TAB_ITEM).ChangeRepairItem(BLADECARD.get()));
    public static final RegistryObject<SwordItem> LANCEROUZER = ITEMS.register("lancerouzer",
            () -> new BaseSwordItem(Tiers.DIAMOND, 5, 3.5f, new Item.Properties()).AddToTabList(RiderTabs.BLADE_TAB_ITEM).ChangeRepairItem(BLADECARD.get()));
    public static final RegistryObject<BaseBlasterItem> LARCROUZER = ITEMS.register("larcrouzer",
    		() -> new BaseBlasterItem(Tiers.DIAMOND, 4, 3.5f, new Item.Properties()).AddToTabList(RiderTabs.BLADE_TAB_ITEM).ChangeRepairItem(BLADECARD.get()));
    
    public static final RegistryObject<BaseBlasterItem> CHALICE_ARROW = ITEMS.register("chalice_arrow",
    		() -> new BaseBlasterItem(Tiers.DIAMOND, 4, 3.5f, new Item.Properties()).AddToTabList(RiderTabs.BLADE_TAB_ITEM).ChangeRepairItem(BLADECARD.get()));
    public static final RegistryObject<SwordItem> WILD_SLASHER = ITEMS.register("wild_slasher",
            () -> new BaseSwordItem(Tiers.DIAMOND, 5, 3.5f, new Item.Properties()).AddToTabList(RiderTabs.BLADE_TAB_ITEM).ChangeRepairItem(BLADECARD.get()));
    public static final RegistryObject<BaseBlasterItem> WILD_CHALICE_ARROW = ITEMS.register("wild_chalice_arrow",
    		() -> new BaseBlasterItem(Tiers.DIAMOND, 4, 3.5f, new Item.Properties()).setProjectileFireball().AddToTabList(RiderTabs.BLADE_TAB_ITEM).ChangeRepairItem(BLADECARD.get()));
 
    
    public static void register(IEventBus eventBus) {
		ITEMS.register(eventBus);
	}
}
