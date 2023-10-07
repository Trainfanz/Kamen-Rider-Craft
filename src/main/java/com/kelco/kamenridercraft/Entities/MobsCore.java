package com.kelco.kamenridercraft.Entities;


import com.kelco.kamenridercraft.KamenRiderCraftCore;
import com.kelco.kamenridercraft.Entities.bosses.AncientOOOEntity;
import com.kelco.kamenridercraft.Entities.bosses.AnkhCompleteEntity;
import com.kelco.kamenridercraft.Entities.bosses.AnkhLostEntity;
import com.kelco.kamenridercraft.Entities.bosses.AnotherAgitoEntity;
import com.kelco.kamenridercraft.Entities.bosses.ClayDollDopantEntity;
import com.kelco.kamenridercraft.Entities.bosses.CommanderDopantEntity;
import com.kelco.kamenridercraft.Entities.bosses.CoreEntity;
import com.kelco.kamenridercraft.Entities.bosses.ElOfTheWaterEntity;
import com.kelco.kamenridercraft.Entities.bosses.EternalEntity;
import com.kelco.kamenridercraft.Entities.bosses.GamelEntity;
import com.kelco.kamenridercraft.Entities.bosses.GodaEntity;
import com.kelco.kamenridercraft.Entities.bosses.KazariEntity;
import com.kelco.kamenridercraft.Entities.bosses.MezoolEntity;
import com.kelco.kamenridercraft.Entities.bosses.MuchiriEntity;
import com.kelco.kamenridercraft.Entities.bosses.NazcaDopantEntity;
import com.kelco.kamenridercraft.Entities.bosses.OrgaEntity;
import com.kelco.kamenridercraft.Entities.bosses.PoseidonEntity;
import com.kelco.kamenridercraft.Entities.bosses.PoweredUpCoreEntity;
import com.kelco.kamenridercraft.Entities.bosses.RedNazcaDopantEntity;
import com.kelco.kamenridercraft.Entities.bosses.ShadowmoonEntity;
import com.kelco.kamenridercraft.Entities.bosses.ShockerRidersEntity;
import com.kelco.kamenridercraft.Entities.bosses.SmilodonDopantEntity;
import com.kelco.kamenridercraft.Entities.bosses.TerrorDopantEntity;
import com.kelco.kamenridercraft.Entities.bosses.UvaEntity;
import com.kelco.kamenridercraft.Entities.bosses.WeatherDopantEntity;
import com.kelco.kamenridercraft.Entities.footSoldiers.AnguisMasculusEntity;
import com.kelco.kamenridercraft.Entities.footSoldiers.AriCommandoEntity;
import com.kelco.kamenridercraft.Entities.footSoldiers.BlackSatanSoldierEntity;
import com.kelco.kamenridercraft.Entities.footSoldiers.ChapEntity;
import com.kelco.kamenridercraft.Entities.footSoldiers.ChapGreyEntity;
import com.kelco.kamenridercraft.Entities.footSoldiers.CombatRoidEntity;
import com.kelco.kamenridercraft.Entities.footSoldiers.DestronCombatmanEntity;
import com.kelco.kamenridercraft.Entities.footSoldiers.DogmaFighterEntity;
import com.kelco.kamenridercraft.Entities.footSoldiers.FoundationXMasqueradeEntity;
import com.kelco.kamenridercraft.Entities.footSoldiers.GODWarfareAgentEntity;
import com.kelco.kamenridercraft.Entities.footSoldiers.KnightSoldierEntity;
import com.kelco.kamenridercraft.Entities.footSoldiers.MasqueradeEntity;
import com.kelco.kamenridercraft.Entities.footSoldiers.PantherasLuteusEntity;
import com.kelco.kamenridercraft.Entities.footSoldiers.RedFollowerEntity;
import com.kelco.kamenridercraft.Entities.footSoldiers.RiotrooperEntity;
import com.kelco.kamenridercraft.Entities.footSoldiers.ShockerCombatmanEntity;
import com.kelco.kamenridercraft.Entities.footSoldiers.YummyEntity;
import com.kelco.kamenridercraft.Entities.footSoldiers.ZuGumunBaEntity;

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
     
     
     
     public static final RegistryObject<EntityType<ZuGumunBaEntity>> ZU_GUMUN_BA = MOBLIST.register("zu_gumun_ba",
             () -> EntityType.Builder.of(ZuGumunBaEntity::new, MobCategory.MONSTER).sized(0.6F, 1.95F).clientTrackingRange(8).build( KamenRiderCraftCore.MODID + ":zu_gumun_ba"));

     public static final RegistryObject<ForgeSpawnEggItem> ZU_GUMUN_BA_SPAWN_EGG = ITEMS.register("zu_gumun_ba_spawn_egg",
             () -> new ForgeSpawnEggItem(ZU_GUMUN_BA,  0xf8ba57,0xaf8e59, new Item.Properties()));
     
     
     public static final RegistryObject<EntityType<PantherasLuteusEntity>> PANTHERAS_LUTEUS = MOBLIST.register("pantheras_luteus",
             () -> EntityType.Builder.of(PantherasLuteusEntity::new, MobCategory.MONSTER).sized(0.6F, 1.95F).clientTrackingRange(8).build( KamenRiderCraftCore.MODID + ":pantheras_luteus"));

     public static final RegistryObject<ForgeSpawnEggItem> PANTHERAS_LUTEUS_SPAWN_EGG = ITEMS.register("pantheras_luteus_spawn_egg",
             () -> new ForgeSpawnEggItem(PANTHERAS_LUTEUS,  0xffbe2e, 0xff3333, new Item.Properties()));
     
     public static final RegistryObject<EntityType<ElOfTheWaterEntity>> EL_OF_THE_WATER = MOBLIST.register("el_of_the_water",
             () -> EntityType.Builder.of(ElOfTheWaterEntity::new, MobCategory.MONSTER).sized(0.6F, 1.95F).clientTrackingRange(8).build( KamenRiderCraftCore.MODID + ":el_of_the_water"));

     public static final RegistryObject<ForgeSpawnEggItem> EL_OF_THE_WATER_SPAWN_EGG = ITEMS.register("el_of_the_water_spawn_egg",
             () -> new ForgeSpawnEggItem(EL_OF_THE_WATER,  0x27262d, 0xd1cfda, new Item.Properties()));
     
     public static final RegistryObject<EntityType<AnguisMasculusEntity>> ANGUIS_MASCULUS = MOBLIST.register("anguis_masculus",
             () -> EntityType.Builder.of(AnguisMasculusEntity::new, MobCategory.MONSTER).sized(0.6F, 1.95F).clientTrackingRange(8).build( KamenRiderCraftCore.MODID + ":anguis_masculus"));

     public static final RegistryObject<ForgeSpawnEggItem> ANGUIS_MASCULUS_SPAWN_EGG = ITEMS.register("anguis_masculus_spawn_egg",
             () -> new ForgeSpawnEggItem(ANGUIS_MASCULUS,  0x445a94, 0xceb42b, new Item.Properties()));
     
     public static final RegistryObject<EntityType<AnotherAgitoEntity>> ANOTHER_AGITO = MOBLIST.register("another_agito",
             () -> EntityType.Builder.of(AnotherAgitoEntity::new, MobCategory.MONSTER).sized(0.6F, 1.95F).clientTrackingRange(8).build( KamenRiderCraftCore.MODID + ":another_agito"));

     public static final RegistryObject<ForgeSpawnEggItem> ANOTHER_AGITO_SPAWN_EGG = ITEMS.register("another_agito_spawn_egg",
             () -> new ForgeSpawnEggItem(ANOTHER_AGITO,  0x273d31, 0x131313, new Item.Properties()));
     
     
     public static final RegistryObject<EntityType<RiotrooperEntity>> RIOTROOPER = MOBLIST.register("riotrooper",
             () -> EntityType.Builder.of(RiotrooperEntity::new, MobCategory.MONSTER).sized(0.6F, 1.95F).clientTrackingRange(8).build( KamenRiderCraftCore.MODID + ":riotrooper"));

     public static final RegistryObject<ForgeSpawnEggItem> RIOTROOPER_SPAWN_EGG = ITEMS.register("riotrooper_spawn_egg",
             () -> new ForgeSpawnEggItem(RIOTROOPER,  0x11110e,0xfc911e, new Item.Properties()));
     
     public static final RegistryObject<EntityType<OrgaEntity>> ORGA = MOBLIST.register("orga",
             () -> EntityType.Builder.of(OrgaEntity::new, MobCategory.MONSTER).sized(0.6F, 1.95F).clientTrackingRange(8).build( KamenRiderCraftCore.MODID + ":orga"));

     public static final RegistryObject<ForgeSpawnEggItem> ORGA_SPAWN_EGG = ITEMS.register("orga_spawn_egg",
             () -> new ForgeSpawnEggItem(ORGA,  0x11110e,0xd5ba4c, new Item.Properties()));
     

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
             () -> new ForgeSpawnEggItem(CLAYDOLL_DOPANT, 0x783f04,0xf7dabc, new Item.Properties()));

     public static final RegistryObject<EntityType<NazcaDopantEntity>> NASCA_DOPANT = MOBLIST.register("nazca_dopant",
             () -> EntityType.Builder.of(NazcaDopantEntity::new, MobCategory.MONSTER).sized(0.6F, 1.95F).clientTrackingRange(8).build( KamenRiderCraftCore.MODID + ":nazca_dopant"));

      public static final RegistryObject<ForgeSpawnEggItem> NASCA_DOPANT_SPAWN_EGG = ITEMS.register("nazca_dopant_spawn_egg",
              () -> new ForgeSpawnEggItem(NASCA_DOPANT, 0x0092BB,0xff9f00, new Item.Properties()));

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
              () -> new ForgeSpawnEggItem(ETERNAL, 0xFFFFFF, 0x0092BB, new Item.Properties()));

      //Eternal 0xffe892, 0xFFFFFF
      
      public static final RegistryObject<EntityType<YummyEntity>> YUMMY = MOBLIST.register("yummy_mob",
              () -> EntityType.Builder.of(YummyEntity::new, MobCategory.MONSTER).sized(0.6F, 1.95F).clientTrackingRange(8).build( KamenRiderCraftCore.MODID + ":yummy_mob"));

       public static final RegistryObject<ForgeSpawnEggItem> YUMMY_SPAWN_EGG = ITEMS.register("yummy_spawn_egg",
               () -> new ForgeSpawnEggItem(YUMMY, 0xE7E6B2, 0x959586, new Item.Properties()));

       public static final RegistryObject<EntityType<KnightSoldierEntity>> KNIGHT_SOLDIER = MOBLIST.register("knight_soldier_mob",
               () -> EntityType.Builder.of(KnightSoldierEntity::new, MobCategory.MONSTER).sized(0.6F, 1.95F).clientTrackingRange(8).build( KamenRiderCraftCore.MODID + ":knight_soldier_mob"));

        public static final RegistryObject<ForgeSpawnEggItem> KNIGHT_SOLDIER_SPAWN_EGG = ITEMS.register("knight_soldier_spawn_egg",
                () -> new ForgeSpawnEggItem(KNIGHT_SOLDIER, 0xca570f,0x919191, new Item.Properties()));

    
       public static final RegistryObject<EntityType<AnkhEntity>> ANKH = MOBLIST.register("ankh_mob",
              () -> EntityType.Builder.of(AnkhEntity::new, MobCategory.MONSTER).sized(0.6F, 1.95F).clientTrackingRange(8).build( KamenRiderCraftCore.MODID + ":ankh_mob"));

       public static final RegistryObject<ForgeSpawnEggItem> ANKH_SPAWN_EGG = ITEMS.register("ankh_spawn_egg",
                () -> new ForgeSpawnEggItem(ANKH, 0xFF2300, 0x42FF00, new Item.Properties()));
       
       public static final RegistryObject<EntityType<AnkhCompleteEntity>> ANKHCOMPLETE = MOBLIST.register("ankh_complete_mob",
               () -> EntityType.Builder.of(AnkhCompleteEntity::new, MobCategory.MONSTER).sized(0.6F, 1.95F).clientTrackingRange(8).build( KamenRiderCraftCore.MODID + ":ankh_complete_mob"));

        public static final RegistryObject<ForgeSpawnEggItem> ANKH_COMPLETE_SPAWN_EGG = ITEMS.register("ankh_complete_spawn_egg",
                () -> new ForgeSpawnEggItem(ANKHCOMPLETE, 0x000000, 0xFF0000, new Item.Properties()));
        
        public static final RegistryObject<EntityType<AnkhLostEntity>> ANKH_LOST = MOBLIST.register("ankh_lost_mob",
                () -> EntityType.Builder.of(AnkhLostEntity::new, MobCategory.MONSTER).sized(0.6F, 1.95F).clientTrackingRange(8).build( KamenRiderCraftCore.MODID + ":ankh_lost_mob"));

        public static final RegistryObject<ForgeSpawnEggItem> ANKH_LOST_SPAWN_EGG = ITEMS.register("ankh_lost_spawn_egg",
                 () -> new ForgeSpawnEggItem(ANKH_LOST, 0x000000, 0xC61500, new Item.Properties()));
         
        
        public static final RegistryObject<EntityType<UvaEntity>> UVA = MOBLIST.register("uva_mob",
                () -> EntityType.Builder.of(UvaEntity::new, MobCategory.MONSTER).sized(0.6F, 1.95F).clientTrackingRange(8).build( KamenRiderCraftCore.MODID + ":uva_mob"));

         public static final RegistryObject<ForgeSpawnEggItem> UVA_SPAWN_EGG = ITEMS.register("uva_spawn_egg",
                 () -> new ForgeSpawnEggItem(UVA, 0x000000, 0x00FF1F, new Item.Properties()));
        
         
         public static final RegistryObject<EntityType<KazariEntity>> KAZARI = MOBLIST.register("kazari_mob",
                 () -> EntityType.Builder.of(KazariEntity::new, MobCategory.MONSTER).sized(0.6F, 1.95F).clientTrackingRange(8).build( KamenRiderCraftCore.MODID + ":kazari_mob"));

          public static final RegistryObject<ForgeSpawnEggItem> KAZARI_SPAWN_EGG = ITEMS.register("kazari_spawn_egg",
                  () -> new ForgeSpawnEggItem(KAZARI, 0x000000, 0xFFDC00, new Item.Properties()));
          
         
          public static final RegistryObject<EntityType<MezoolEntity>> MEZOOL = MOBLIST.register("mezool_mob",
                  () -> EntityType.Builder.of(MezoolEntity::new, MobCategory.MONSTER).sized(0.6F, 1.95F).clientTrackingRange(8).build( KamenRiderCraftCore.MODID + ":mezool_mob"));

          public static final RegistryObject<ForgeSpawnEggItem> MEZOOL_SPAWN_EGG = ITEMS.register("mezool_spawn_egg",
                   () -> new ForgeSpawnEggItem(MEZOOL, 0x000000, 0x0000FF, new Item.Properties()));
          
          
          public static final RegistryObject<EntityType<GamelEntity>> GAMEL = MOBLIST.register("gamel_mob",
                  () -> EntityType.Builder.of(GamelEntity::new, MobCategory.MONSTER).sized(0.6F, 1.95F).clientTrackingRange(8).build( KamenRiderCraftCore.MODID + ":gamel_mob"));

          public static final RegistryObject<ForgeSpawnEggItem> GAMEL_SPAWN_EGG = ITEMS.register("gamel_spawn_egg",
                   () -> new ForgeSpawnEggItem(GAMEL, 0x000000, 0xBFBFBF, new Item.Properties()));
          
          
          public static final RegistryObject<EntityType<MuchiriEntity>> MUCHIRI = MOBLIST.register("muchiri_mob",
                  () -> EntityType.Builder.of(MuchiriEntity::new, MobCategory.MONSTER).sized(0.6F, 1.95F).clientTrackingRange(8).build( KamenRiderCraftCore.MODID + ":muchiri_mob"));

          public static final RegistryObject<ForgeSpawnEggItem> MUCHIRI_SPAWN_EGG = ITEMS.register("muchiri_spawn_egg",
                   () -> new ForgeSpawnEggItem(MUCHIRI, 0x000000, 0xFF9E00, new Item.Properties()));
          
          public static final RegistryObject<EntityType<PoseidonEntity>> POSEIDON = MOBLIST.register("poseidon",
                  () -> EntityType.Builder.of(PoseidonEntity::new, MobCategory.MONSTER).sized(0.6F, 1.95F).clientTrackingRange(8).build( KamenRiderCraftCore.MODID + ":poseidon"));

          public static final RegistryObject<ForgeSpawnEggItem> POSEIDON_SPAWN_EGG = ITEMS.register("poseidon_spawn_egg",
                   () -> new ForgeSpawnEggItem(POSEIDON, 0xD11B1E, 0x30BBEC, new Item.Properties()));
         
          public static final RegistryObject<EntityType<CoreEntity>> CORE = MOBLIST.register("core",
                  () -> EntityType.Builder.of(CoreEntity::new, MobCategory.MONSTER).sized(0.6F, 1.95F).clientTrackingRange(8).build( KamenRiderCraftCore.MODID + ":core"));

          public static final RegistryObject<ForgeSpawnEggItem> CORE_SPAWN_EGG = ITEMS.register("core_spawn_egg",
                   () -> new ForgeSpawnEggItem(CORE, 0x312511, 0xF97012, new Item.Properties()));
         
          /***
          public static final RegistryObject<EntityType<PoweredUpCoreEntity>> POWERED_UP_CORE = MOBLIST.register("powered_up_core",
                  () -> EntityType.Builder.of(PoweredUpCoreEntity::new, MobCategory.MONSTER).sized(0.6F, 1.95F).clientTrackingRange(8).build( KamenRiderCraftCore.MODID + ":powered_up_core"));

          public static final RegistryObject<ForgeSpawnEggItem> POWERED_UP_CORE_SPAWN_EGG = ITEMS.register("powered_up_core_spawn_egg",
                   () -> new ForgeSpawnEggItem(POWERED_UP_CORE, 0x51115D, 0xB419D1, new Item.Properties()));
          
          public static final RegistryObject<EntityType<AncientOOOEntity>> ANCIENT_OOO = MOBLIST.register("ancient_ooo",
                  () -> EntityType.Builder.of(AncientOOOEntity::new, MobCategory.MONSTER).sized(0.6F, 1.95F).clientTrackingRange(8).build( KamenRiderCraftCore.MODID + ":ancient_ooo"));

          public static final RegistryObject<ForgeSpawnEggItem> ANCIENT_OOO_SPAWN_EGG = ITEMS.register("ancient_ooo_spawn_egg",
                   () -> new ForgeSpawnEggItem(ANCIENT_OOO, 0x262320, 0xE5B216, new Item.Properties()));
          
          public static final RegistryObject<EntityType<GodaEntity>> GODA = MOBLIST.register("goda",
                  () -> EntityType.Builder.of(GodaEntity::new, MobCategory.MONSTER).sized(0.6F, 1.95F).clientTrackingRange(8).build( KamenRiderCraftCore.MODID + ":goda"));

          public static final RegistryObject<ForgeSpawnEggItem> GODA_SPAWN_EGG = ITEMS.register("goda_spawn_egg",
                   () -> new ForgeSpawnEggItem(GODA, 0x000000, 0xB200FF, new Item.Properties()));
          **/
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
