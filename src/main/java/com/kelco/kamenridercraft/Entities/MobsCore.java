package com.kelco.kamenridercraft.Entities;


import com.kelco.kamenridercraft.KamenRiderCraftCore;
import com.kelco.kamenridercraft.Entities.bosses.ShockerRidersEntity;

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
 

    
    //public static final RegistryObject<EntityType<ChapEntity>> CHAP = MOBLIST.register("chap",
    //        () -> EntityType.Builder.of(ChapEntity::new, MobCategory.MONSTER).sized(0.6F, 1.95F).clientTrackingRange(8).build( KamenRiderCraftCore.MODID + ":chap"));
    
   // public static final RegistryObject<ForgeSpawnEggItem> CHAP_SPAWN_EGG = ITEMS.register("chap_spawn_egg",
    //        () -> new ForgeSpawnEggItem(CHAP,  000000,0xFFFFFF, new Item.Properties()));
 
    
    
    
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
