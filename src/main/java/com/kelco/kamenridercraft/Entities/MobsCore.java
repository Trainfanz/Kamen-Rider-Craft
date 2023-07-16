package com.kelco.kamenridercraft.Entities;


import com.kelco.kamenridercraft.KamenRiderCraftCore;
import com.kelco.kamenridercraft.Entities.bosses.ClayDollDopantEntity;
import com.kelco.kamenridercraft.Entities.bosses.CommanderDopantEntity;
import com.kelco.kamenridercraft.Entities.bosses.EternalEntity;
import com.kelco.kamenridercraft.Entities.bosses.NazcaDopantEntity;
import com.kelco.kamenridercraft.Entities.bosses.RedNazcaDopantEntity;
import com.kelco.kamenridercraft.Entities.bosses.ShadowmoonEntity;
import com.kelco.kamenridercraft.Entities.bosses.ShockerRidersEntity;
import com.kelco.kamenridercraft.Entities.bosses.SmilodonDopantEntity;
import com.kelco.kamenridercraft.Entities.bosses.TerrorDopantEntity;
import com.kelco.kamenridercraft.Entities.bosses.WeatherDopantEntity;
import com.kelco.kamenridercraft.Entities.footSoldiers.AriCommandoEntity;
import com.kelco.kamenridercraft.Entities.footSoldiers.BlackSatanSoldierEntity;
import com.kelco.kamenridercraft.Entities.footSoldiers.ChapEntity;
import com.kelco.kamenridercraft.Entities.footSoldiers.ChapGreyEntity;
import com.kelco.kamenridercraft.Entities.footSoldiers.CombatRoidEntity;
import com.kelco.kamenridercraft.Entities.footSoldiers.DestronCombatmanEntity;
import com.kelco.kamenridercraft.Entities.footSoldiers.DogmaFighterEntity;
import com.kelco.kamenridercraft.Entities.footSoldiers.FoundationXMasqueradeEntity;
import com.kelco.kamenridercraft.Entities.footSoldiers.GODWarfareAgentEntity;
import com.kelco.kamenridercraft.Entities.footSoldiers.MasqueradeEntity;
import com.kelco.kamenridercraft.Entities.footSoldiers.RedFollowerEntity;
import com.kelco.kamenridercraft.Entities.footSoldiers.ShockerCombatmanEntity;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.item.Item;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class MobsCore {
	 public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, KamenRiderCraftCore.MODID);
	public static final DeferredRegister<EntityType<?>> MOBLIST = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, KamenRiderCraftCore.MODID);
    
	
    public static final RegistryObject<EntityType<ShockerCombatmanEntity>> SHOCKER_COMBATMAN = MOBLIST.register("shocker_combatman",
            () -> EntityType.Builder.of(ShockerCombatmanEntity::new, MobCategory.MONSTER).sized(0.6F, 1.95F).clientTrackingRange(8).build( KamenRiderCraftCore.MODID + ":shocker_combatman"));
    
    public static final RegistryObject<ForgeSpawnEggItem> SHOCKER_COMBATMAN_SPAWN_EGG = ITEMS.register("shocker_combatman_spawn_egg",
            () -> new ForgeSpawnEggItem(SHOCKER_COMBATMAN, 000000,0xFFFFFF, new Item.Properties()));
 
    public static final RegistryObject<EntityType<ShockerRidersEntity>> SHOCKER_RIDER = MOBLIST.register("shocker_riders",
            () -> EntityType.Builder.of(ShockerRidersEntity::new, MobCategory.MONSTER).sized(0.6F, 1.95F).clientTrackingRange(8).build( KamenRiderCraftCore.MODID + ":shocker_riders"));
    
    public static final RegistryObject<ForgeSpawnEggItem> SHOCKER_RIDER_SPAWN_EGG = ITEMS.register("shocker_riders_spawn_egg",
            () -> new ForgeSpawnEggItem(SHOCKER_RIDER, 0x53aa8e,0xd6b500, new Item.Properties()));
 
    
    
    public static final RegistryObject<EntityType<DestronCombatmanEntity>> DESTRON_COMBATMAN = MOBLIST.register("destron_combatman",
            () -> EntityType.Builder.of(DestronCombatmanEntity::new, MobCategory.MONSTER).sized(0.6F, 1.95F).clientTrackingRange(8).build( KamenRiderCraftCore.MODID + ":destron_combatman"));
    
    public static final RegistryObject<ForgeSpawnEggItem> DESTRON_COMBATMAN_SPAWN_EGG = ITEMS.register("destron_combatman_spawn_egg",
            () -> new ForgeSpawnEggItem(DESTRON_COMBATMAN, 000000,0xFFFFFF, new Item.Properties()));
 
    

    public static final RegistryObject<EntityType<GODWarfareAgentEntity>> GOD_WARFARE_AGENT = MOBLIST.register("god_warfare_agent",
            () -> EntityType.Builder.of(GODWarfareAgentEntity::new, MobCategory.MONSTER).sized(0.6F, 1.95F).clientTrackingRange(8).build( KamenRiderCraftCore.MODID + ":god_warfare_agent"));
    
    public static final RegistryObject<ForgeSpawnEggItem> GOD_WARFARE_AGENT_SPAWN_EGG = ITEMS.register("god_warfare_agent_spawn_egg",
            () -> new ForgeSpawnEggItem(GOD_WARFARE_AGENT, 000000,0x7e0000, new Item.Properties()));
 
    
    
    public static final RegistryObject<EntityType<RedFollowerEntity>> RED_FOLLWER = MOBLIST.register("red_follower",
            () -> EntityType.Builder.of(RedFollowerEntity::new, MobCategory.MONSTER).sized(0.6F, 1.95F).clientTrackingRange(8).build( KamenRiderCraftCore.MODID + ":red_follower"));
    
    public static final RegistryObject<ForgeSpawnEggItem> RED_FOLLWER_SPAWN_EGG = ITEMS.register("red_follower_spawn_egg",
            () -> new ForgeSpawnEggItem(RED_FOLLWER,  0x7e0000,0xcacaca, new Item.Properties()));

    
    
    public static final RegistryObject<EntityType<BlackSatanSoldierEntity>> BLACK_SATAN_SOLDIER = MOBLIST.register("black_satan_soldier",
            () -> EntityType.Builder.of(BlackSatanSoldierEntity::new, MobCategory.MONSTER).sized(0.6F, 1.95F).clientTrackingRange(8).build( KamenRiderCraftCore.MODID + ":black_satan_soldier"));
    
    public static final RegistryObject<ForgeSpawnEggItem> BLACK_SATAN_SOLDIER_SPAWN_EGG = ITEMS.register("black_satan_soldier_spawn_egg",
            () -> new ForgeSpawnEggItem(BLACK_SATAN_SOLDIER, 000000,0x7e0000, new Item.Properties()));

    
    
    public static final RegistryObject<EntityType<AriCommandoEntity>> ARI_COMMANDO = MOBLIST.register("ari_commando",
            () -> EntityType.Builder.of(AriCommandoEntity::new, MobCategory.MONSTER).sized(0.6F, 1.95F).clientTrackingRange(8).build( KamenRiderCraftCore.MODID + ":ari_commando"));
    
    public static final RegistryObject<ForgeSpawnEggItem> ARI_COMMANDO_SPAWN_EGG = ITEMS.register("ari_commando_spawn_egg",
            () -> new ForgeSpawnEggItem(ARI_COMMANDO, 000000,0x121212, new Item.Properties()));

    
    
    public static final RegistryObject<EntityType<DogmaFighterEntity>> DOGMA_FIGHTER = MOBLIST.register("dogma_fighter",
            () -> EntityType.Builder.of(DogmaFighterEntity::new, MobCategory.MONSTER).sized(0.6F, 1.95F).clientTrackingRange(8).build( KamenRiderCraftCore.MODID + ":dogma_fighter"));
    
    public static final RegistryObject<ForgeSpawnEggItem> DOGMA_FIGHTER_SPAWN_EGG = ITEMS.register("dogma_fighter_spawn_egg",
            () -> new ForgeSpawnEggItem(DOGMA_FIGHTER, 0x730000,0xa5a5a5, new Item.Properties()));
 
    
    
    public static final RegistryObject<EntityType<CombatRoidEntity>> COMBAT_ROID = MOBLIST.register("combat_roid",
            () -> EntityType.Builder.of(CombatRoidEntity::new, MobCategory.MONSTER).sized(0.6F, 1.95F).clientTrackingRange(8).build( KamenRiderCraftCore.MODID + ":combat_roid"));
    
    public static final RegistryObject<ForgeSpawnEggItem> COMBAT_ROID_SPAWN_EGG = ITEMS.register("combat_roid_spawn_egg",
            () -> new ForgeSpawnEggItem(COMBAT_ROID, 0xa5a5a5,0x8c0000, new Item.Properties()));
 

    
    public static final RegistryObject<EntityType<ChapEntity>> CHAP = MOBLIST.register("chap",
           () -> EntityType.Builder.of(ChapEntity::new, MobCategory.MONSTER).sized(0.6F, 1.95F).clientTrackingRange(8).build( KamenRiderCraftCore.MODID + ":chap"));
    
    public static final RegistryObject<ForgeSpawnEggItem> CHAP_SPAWN_EGG = ITEMS.register("chap_spawn_egg",
           () -> new ForgeSpawnEggItem(CHAP,  000000,0xFFFFFF, new Item.Properties()));
 
    public static final RegistryObject<EntityType<ShadowmoonEntity>> SHADOWMOON = MOBLIST.register("shadowmoon",
            () -> EntityType.Builder.of(ShadowmoonEntity::new, MobCategory.MONSTER).sized(0.6F, 1.95F).clientTrackingRange(8).build( KamenRiderCraftCore.MODID + ":shadowmoon"));
     
     public static final RegistryObject<ForgeSpawnEggItem> SHADOWMOON_SPAWN_EGG = ITEMS.register("shadowmoon_spawn_egg",
            () -> new ForgeSpawnEggItem(SHADOWMOON,  0xbabab6,0x00a01c, new Item.Properties()));
     
     public static final RegistryObject<EntityType<ChapGreyEntity>> CHAP_GREY = MOBLIST.register("chap_grey",
             () -> EntityType.Builder.of(ChapGreyEntity::new, MobCategory.MONSTER).sized(0.6F, 1.95F).clientTrackingRange(8).build( KamenRiderCraftCore.MODID + ":chap_grey"));
      
      public static final RegistryObject<ForgeSpawnEggItem> CHAP_GREY_SPAWN_EGG = ITEMS.register("chap_grey_spawn_egg",
             () -> new ForgeSpawnEggItem(CHAP_GREY,  0x919191,0xFFFFFF, new Item.Properties()));
     
     
     
     public static final RegistryObject<EntityType<MasqueradeEntity>> MASQUERADE = MOBLIST.register("masquerade",
             () -> EntityType.Builder.of(MasqueradeEntity::new, MobCategory.MONSTER).sized(0.6F, 1.95F).clientTrackingRange(8).build( KamenRiderCraftCore.MODID + ":masquerade"));

     public static final RegistryObject<ForgeSpawnEggItem> MASQUERADE_SPAWN_EGG = ITEMS.register("masquerade_spawn_egg",
             () -> new ForgeSpawnEggItem(MASQUERADE,  000000,0xFFFFFF, new Item.Properties()));
      
     public static final RegistryObject<EntityType<FoundationXMasqueradeEntity>> FOUNDATION_X_MASQUERADE = MOBLIST.register("foundation_x_masquerade",
             () -> EntityType.Builder.of(FoundationXMasqueradeEntity::new, MobCategory.MONSTER).sized(0.6F, 1.95F).clientTrackingRange(8).build( KamenRiderCraftCore.MODID + ":foundation_x_masquerade"));

     public static final RegistryObject<ForgeSpawnEggItem> FOUNDATION_X_MASQUERADE_SPAWN_EGG = ITEMS.register("foundation_x_masquerade_spawn_egg",
             () -> new ForgeSpawnEggItem(FOUNDATION_X_MASQUERADE,  000000,0xFFFFFF, new Item.Properties()));

   
     public static final RegistryObject<EntityType<ClayDollDopantEntity>> CLAYDOLL_DOPANT = MOBLIST.register("claydoll_dopant",
            () -> EntityType.Builder.of(ClayDollDopantEntity::new, MobCategory.MONSTER).sized(0.6F, 1.95F).clientTrackingRange(8).build( KamenRiderCraftCore.MODID + ":claydoll_dopant"));

     public static final RegistryObject<ForgeSpawnEggItem> CLAYDOLL_DOPANT_SPAWN_EGG = ITEMS.register("claydoll_dopant_spawn_egg",
             () -> new ForgeSpawnEggItem(CLAYDOLL_DOPANT, 0x161616,0x0092BB, new Item.Properties()));

     public static final RegistryObject<EntityType<NazcaDopantEntity>> NASCA_DOPANT = MOBLIST.register("nazca_dopant",
             () -> EntityType.Builder.of(NazcaDopantEntity::new, MobCategory.MONSTER).sized(0.6F, 1.95F).clientTrackingRange(8).build( KamenRiderCraftCore.MODID + ":nazca_dopant"));

      public static final RegistryObject<ForgeSpawnEggItem> NASCA_DOPANT_SPAWN_EGG = ITEMS.register("nazca_dopant_spawn_egg",
              () -> new ForgeSpawnEggItem(NASCA_DOPANT, 0x161616,0x0092BB, new Item.Properties()));

      /**
      public static final RegistryObject<EntityType<RedNazcaDopantEntity>> RED_NASCA_DOPANT = MOBLIST.register("red_nazca_dopant",
              () -> EntityType.Builder.of(RedNazcaDopantEntity::new, MobCategory.MONSTER).sized(0.6F, 1.95F).clientTrackingRange(8).build( KamenRiderCraftCore.MODID + ":red_nazca_dopant"));

       public static final RegistryObject<ForgeSpawnEggItem> RED_NASCA_DOPANT_SPAWN_EGG = ITEMS.register("red_nazca_dopant_spawn_egg",
               () -> new ForgeSpawnEggItem(RED_NASCA_DOPANT, 0x161616,0x0092BB, new Item.Properties()));


       public static final RegistryObject<EntityType<TabooDopantEntity>> TABOO_DOPANT = MOBLIST.register("taboo_dopant",
               () -> EntityType.Builder.of(TabooDopantEntity::new, MobCategory.MONSTER).sized(0.6F, 1.95F).clientTrackingRange(8).build( KamenRiderCraftCore.MODID + ":taboo_dopant"));

        public static final RegistryObject<ForgeSpawnEggItem> TABOO_DOPANT_SPAWN_EGG = ITEMS.register("taboo_dopant_spawn_egg",
                () -> new ForgeSpawnEggItem(TABOO_DOPANT_MASQUERADE, 0x161616,0x0092BB, new Item.Properties()));
**/
        public static final RegistryObject<EntityType<WeatherDopantEntity>> WEATHER_DOPANT = MOBLIST.register("weather_dopant",
                () -> EntityType.Builder.of(WeatherDopantEntity::new, MobCategory.MONSTER).sized(0.6F, 1.95F).clientTrackingRange(8).build( KamenRiderCraftCore.MODID + ":weather_dopant"));

         public static final RegistryObject<ForgeSpawnEggItem> WEATHER_DOPANT_SPAWN_EGG = ITEMS.register("weather_dopant_spawn_egg",
                 () -> new ForgeSpawnEggItem(WEATHER_DOPANT, 0xffffff,0xc1c1c1, new Item.Properties()));

         public static final RegistryObject<EntityType<SmilodonDopantEntity>> SMILODON_DOPANT = MOBLIST.register("smilodon_dopant",
                 () -> EntityType.Builder.of(SmilodonDopantEntity::new, MobCategory.MONSTER).sized(0.6F, 1.95F).clientTrackingRange(8).build( KamenRiderCraftCore.MODID + ":smilodon_dopant"));

          public static final RegistryObject<ForgeSpawnEggItem> SMILODON_DOPANT_SPAWN_EGG = ITEMS.register("smilodon_dopant_spawn_egg",
                  () -> new ForgeSpawnEggItem(SMILODON_DOPANT, 0xc7b372,0x727272, new Item.Properties()));

           public static final RegistryObject<EntityType<TerrorDopantEntity>> TERROR_DOPANT = MOBLIST.register("terror_dopant",
                   () -> EntityType.Builder.of(TerrorDopantEntity::new, MobCategory.MONSTER).sized(0.6F, 1.95F).clientTrackingRange(8).build( KamenRiderCraftCore.MODID + ":terror_dopant"));

            public static final RegistryObject<ForgeSpawnEggItem> TERROR_DOPANT_SPAWN_EGG = ITEMS.register("terror_dopant_spawn_egg",
                    () -> new ForgeSpawnEggItem(TERROR_DOPANT, 0x161616,0x0092BB, new Item.Properties()));


     public static final RegistryObject<EntityType<CommanderDopantEntity>> COMMANDER_DOPANT = MOBLIST.register("commander_dopant",
             () -> EntityType.Builder.of(CommanderDopantEntity::new, MobCategory.MONSTER).sized(0.6F, 1.95F).clientTrackingRange(8).build( KamenRiderCraftCore.MODID + ":commander_dopant"));

      public static final RegistryObject<ForgeSpawnEggItem> COMMANDER_DOPANT_SPAWN_EGG = ITEMS.register("commander_dopant_spawn_egg",
              () -> new ForgeSpawnEggItem(COMMANDER_DOPANT, 0xc7b372,0x727272, new Item.Properties()));

     
     public static final RegistryObject<EntityType<EternalEntity>> ETERNAL = MOBLIST.register("eternal_mob",
             () -> EntityType.Builder.of(EternalEntity::new, MobCategory.MONSTER).sized(0.6F, 1.95F).clientTrackingRange(8).build( KamenRiderCraftCore.MODID + ":eternal_mob"));

      public static final RegistryObject<ForgeSpawnEggItem> ETERNAL_SPAWN_EGG = ITEMS.register("eternal_spawn_egg",
              () -> new ForgeSpawnEggItem(ETERNAL, 0xffe892, 0xFFFFFF, new Item.Properties()));

     //Eternal 0xffe892, 0xFFFFFF
    
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
