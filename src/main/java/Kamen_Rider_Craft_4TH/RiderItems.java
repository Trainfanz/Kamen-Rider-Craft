package Kamen_Rider_Craft_4TH;

import Kamen_Rider_Craft_4TH.blocks.*;
import Kamen_Rider_Craft_4TH.blocks.portals.*;
import Kamen_Rider_Craft_4TH.blocks.wood.BlockHelheimPlant;
import Kamen_Rider_Craft_4TH.blocks.custom.BlockType;
import Kamen_Rider_Craft_4TH.blocks.custom.CustomBlock;
import Kamen_Rider_Craft_4TH.item.*;
import Kamen_Rider_Craft_4TH.item.Ex_Aid.Item_gashacon_breaker;
import Kamen_Rider_Craft_4TH.item.Ex_Aid.Item_gashat;
import Kamen_Rider_Craft_4TH.item.Ex_Aid.item_ex_aid_energy_item;
import Kamen_Rider_Craft_4TH.item.Ex_Aid.item_ex_aiddriver;
import Kamen_Rider_Craft_4TH.item.Ex_Aid.item_poppy_gashat;
import Kamen_Rider_Craft_4TH.item.W.Item_memory;
import Kamen_Rider_Craft_4TH.item.W.Item_metal_shaft;
import Kamen_Rider_Craft_4TH.item.W.item_Wdriver;
import Kamen_Rider_Craft_4TH.item.agito.item_agitodriver;
import Kamen_Rider_Craft_4TH.item.amazons.item_amazonsdriver;
import Kamen_Rider_Craft_4TH.item.build.Item_full_bottle;
import Kamen_Rider_Craft_4TH.item.build.Item_nebulasteamgun;
import Kamen_Rider_Craft_4TH.item.build.Item_transteamgun;
import Kamen_Rider_Craft_4TH.item.build.item_builddriver;
import Kamen_Rider_Craft_4TH.item.build.item_buildphone;
import Kamen_Rider_Craft_4TH.item.decade.Item_dienddriver;
import Kamen_Rider_Craft_4TH.item.decade.Itemrider_cards;
import Kamen_Rider_Craft_4TH.item.decade.item_decadedriver;
import Kamen_Rider_Craft_4TH.item.deno.Itemdenkamen_sword;
import Kamen_Rider_Craft_4TH.item.deno.item_RiderPass;
import Kamen_Rider_Craft_4TH.item.drive.Item_break_gunner;
import Kamen_Rider_Craft_4TH.item.drive.Item_lupin_gunner;
import Kamen_Rider_Craft_4TH.item.drive.Item_shift_car;
import Kamen_Rider_Craft_4TH.item.drive.item_drivedriver;
import Kamen_Rider_Craft_4TH.item.fourze.Item_astroswitch;
import Kamen_Rider_Craft_4TH.item.fourze.item_Fourzedriver;
import Kamen_Rider_Craft_4TH.item.fourze.item_gate_switch;
import Kamen_Rider_Craft_4TH.item.gaim.Item_lockseed;
import Kamen_Rider_Craft_4TH.item.gaim.Item_lockseed_Bike;
import Kamen_Rider_Craft_4TH.item.gaim.item_Gaimdriver;
import Kamen_Rider_Craft_4TH.item.gaim.item_Sid_lockseed;
import Kamen_Rider_Craft_4TH.item.gaim.item_fake_donguri;
import Kamen_Rider_Craft_4TH.item.ghost.Item_ghost_Icons;
import Kamen_Rider_Craft_4TH.item.ghost.item_ghostdriver;
import Kamen_Rider_Craft_4TH.item.hibiki.Itemarmed_saber;
import Kamen_Rider_Craft_4TH.item.kabuto.Item_clock_up_pad;
import Kamen_Rider_Craft_4TH.item.kabuto.Item_hyper_zecter;
import Kamen_Rider_Craft_4TH.item.kabuto.Item_zecter;
import Kamen_Rider_Craft_4TH.item.kiva.Itemfuestle;
import Kamen_Rider_Craft_4TH.item.kiva.item_kivaarmor;
import Kamen_Rider_Craft_4TH.item.kiva.item_kivaarmor2;
import Kamen_Rider_Craft_4TH.item.kiva.item_kivadriver;
import Kamen_Rider_Craft_4TH.item.kuuga.Item_kuuga_mode_change_gun_im;
import Kamen_Rider_Craft_4TH.item.kuuga.Item_kuuga_mode_change_sword_im;
import Kamen_Rider_Craft_4TH.item.ooo.Item_purple_medals;
import Kamen_Rider_Craft_4TH.item.ooo.Itemmedal;
import Kamen_Rider_Craft_4TH.item.ooo.Itemo_scanner;
import Kamen_Rider_Craft_4TH.item.ooo.item_OOOdriver;
import Kamen_Rider_Craft_4TH.item.ooo.item_candroid;
import Kamen_Rider_Craft_4TH.item.revice.Item_Vistamps;
import Kamen_Rider_Craft_4TH.item.revice.item_revicedriver;
import Kamen_Rider_Craft_4TH.item.rider_armor_base.Item_form_change;
import Kamen_Rider_Craft_4TH.item.rider_armor_base.item_rider_armor;
import Kamen_Rider_Craft_4TH.item.rider_armor_base.item_rider_driver;
import Kamen_Rider_Craft_4TH.item.ryuki.Item_vent;
import Kamen_Rider_Craft_4TH.item.wizard.Item_wizard_ring;
import Kamen_Rider_Craft_4TH.item.wizard.Item_wizard_rings_efts;
import Kamen_Rider_Craft_4TH.item.wizard.item_unknown_wizard_ring;
import Kamen_Rider_Craft_4TH.item.wizard.item_wizarddriver;
import Kamen_Rider_Craft_4TH.item.zero_one.Item_progrise_keys;
import Kamen_Rider_Craft_4TH.item.zero_one.item_risephone;
import Kamen_Rider_Craft_4TH.item.zero_one.item_zero_onedriver;
import Kamen_Rider_Craft_4TH.item.zi_o.Item_blank_ridewatches2;
import Kamen_Rider_Craft_4TH.item.zi_o.Item_ridewatches;
import Kamen_Rider_Craft_4TH.item.zi_o.item_kodamawatch;
import Kamen_Rider_Craft_4TH.item.zi_o.item_ohma_advent_calendar;
import Kamen_Rider_Craft_4TH.item.zi_o.item_zikudriver;
import Kamen_Rider_Craft_4TH.mobs.EntityLazer;
import Kamen_Rider_Craft_4TH.mobs.Entityaccel;
import Kamen_Rider_Craft_4TH.mobs.entity_batta_can;
import Kamen_Rider_Craft_4TH.mobs.entity_gorilla_can;
import Kamen_Rider_Craft_4TH.mobs.entity_kujaku_can;
import Kamen_Rider_Craft_4TH.mobs.entity_ptera_can;
import Kamen_Rider_Craft_4TH.mobs.entity_taka_can;
import Kamen_Rider_Craft_4TH.mobs.entity_tako_can;
import Kamen_Rider_Craft_4TH.mobs.entity_tora_can;
import Kamen_Rider_Craft_4TH.mobs.entity_tricera_can;
import Kamen_Rider_Craft_4TH.mobs.entity_unagi_can;
import Kamen_Rider_Craft_4TH.mobs.Boss.*;
import Kamen_Rider_Craft_4TH.mobs.bikes.EntityAcrobatter;
import Kamen_Rider_Craft_4TH.mobs.bikes.EntityExaidBike;
import Kamen_Rider_Craft_4TH.mobs.bikes.EntityRidevendor;
import Kamen_Rider_Craft_4TH.mobs.bikes.EntitySakuraHurricane;
import Kamen_Rider_Craft_4TH.mobs.bikes.Entity_machine_denbird;
import Kamen_Rider_Craft_4TH.mobs.bikes.Entity_ridoron;
import Kamen_Rider_Craft_4TH.mobs.bikes.Entityhardboilder;
import Kamen_Rider_Craft_4TH.mobs.bikes.Entitymachine_tornador;
import Kamen_Rider_Craft_4TH.mobs.bikes.Entityskullboilder;
import Kamen_Rider_Craft_4TH.potion.PotionCore;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.MobEffects;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.potion.PotionEffect;

import static Kamen_Rider_Craft_4TH.blocks.custom.Property.TRANSPARENT;
import static Kamen_Rider_Craft_4TH.item.item_panel.PanelColor.*;

public class RiderItems {



	public static Item energy = new Item_ore("energy").setCreativeTab(Tabs.tabmisc);

		//ore blocks
	public static Item agito_of_seed = new Item_ore("agito_of_seed").setCreativeTab(Tabs.tabagito);
	public static Block stone_agito= new ore_block("stone_agito",Material.ROCK, agito_of_seed, 2).setHardness(9.9F).setCreativeTab(Tabs.tabagito);

	public static Item fuestlefake = new Item_ore("fuestlefake").setCreativeTab(Tabs.tabkiva);
	public static Block fuestlehellrock = new ore_block("fuestlehellrock",Material.ROCK, fuestlefake, 3).setHardness(9.9F).setCreativeTab(Tabs.tabkiva);

	public static Item blankcard = new Item_ore("blankcard").setCreativeTab(Tabs.tabdecade);
	public static Block card_stone = new ore_block("card_stone",Material.ROCK,blankcard, 2).setHardness(9.9F).setCreativeTab(Tabs.tabdecade);

	public static Item diendcard = new Itemrider_cards(0,0,"diendcard").setCreativeTab(Tabs.tabdecade);
	public static Block card_hellrock = new ore_block("card_hellrock",Material.ROCK,diendcard, 3).setHardness(9.9F).setCreativeTab(Tabs.tabdecade);


	public static Item proto_speedshift  = new Item_shift_car(1, 11,"proto_speedshift").setCreativeTab(Tabs.tabdrive);
	public static Block drive_stone = new ore_block("drive_stone",Material.ROCK, proto_speedshift, 2).setHardness(9.9F).setLightLevel(0.1f).setCreativeTab(Tabs.tabdrive);

	public static Item signal_chaser  = new Item_shift_car(3, 5,"signal_chaser").setCreativeTab(Tabs.tabdrive);
	public static Block hellrock_drive = new ore_block("hellrock_drive",Material.ROCK, signal_chaser, 3).setHardness(9.9F).setCreativeTab(Tabs.tabdrive);

	public static Item ghost_icons = new Item_ore("ghost_icons").setCreativeTab(Tabs.tabghost);
	public static Block ghost_iconsblock = new ore_block("ghost_iconsblock",Material.ROCK, ghost_icons, 2).setHardness(9.9F).setCreativeTab(Tabs.tabghost);

	public static Item ghost_gammaicons = new Item_ore("ghost_gammaicons").setCreativeTab(Tabs.tabghost);
	public static Block ghost_icons_hellrock = new ore_block("ghost_icons_hellrock",Material.ROCK, ghost_gammaicons, 3).setHardness(9.9F).setCreativeTab(Tabs.tabghost);

	public static Item bugster_virus_dna = new Item_ore("bugster_virus_dna").setCreativeTab(Tabs.tabex_aid);
	public static Block bugsters_stone = new ore_block("bugsters_stone",Material.ROCK, bugster_virus_dna, 2).setHardness(9.9F).setCreativeTab(Tabs.tabex_aid);

	public static Item xx_bugster_virus_dna = new Item_ore("xx_bugster_virus_dna").setCreativeTab(Tabs.tabex_aid);
	public static Block gemdeus_stone = new ore_block("gemdeus_stone",Material.ROCK, xx_bugster_virus_dna, 3).setHardness(9.9F).setCreativeTab(Tabs.tabex_aid);

	public static Item gamedeus_virus_dna = new Item_ore("gamedeus_virus_dna").setCreativeTab(Tabs.tabex_aid);
	public static Item paradx_bugster_virus_dna = new Item_ore("paradx_bugster_virus_dna").setCreativeTab(Tabs.tabex_aid);

	
	//helheim blocks
	public static Block helheim_crack = new helheim_crack().setLightLevel(1f);

	//decor blocks

	

	//kuuga
	public static Item dragon_rod = new Item_kuuga_mode_change_sword_im ("dragon_rod",Tabs.medajalibur).setMaxStackSize(1).setCreativeTab(Tabs.tabkuuga);
	public static Item pegasus_bowgun = new Item_kuuga_mode_change_gun_im("pegasus_bowgun",Tabs.birth_buster).setMaxStackSize(1).setCreativeTab(Tabs.tabkuuga);
	public static Item titan_sword = new Item_kuuga_mode_change_sword_im("titan_sword",Tabs.gashacon_sparrow_arrow).setMaxStackSize(1).setCreativeTab(Tabs.tabkuuga);

	public static Item kuuga_growing  = new Item_form_change("kuuga_growing",item_rider_driver.class,0,"_growing"
			,"kuuga",new PotionEffect(MobEffects.WEAKNESS, 5, 2,true,false)).setCreativeTab(Tabs.tabkuuga);

	public static Item kuuga_mighty = new Item_form_change("kuuga_mighty",item_rider_driver.class,0,"","kuuga"
			,new PotionEffect(PotionCore.PUNCH_BOOST_POTION, 5, 4,true,false)).setCreativeTab(Tabs.tabkuuga);

	public static Item kuuga_dragon = new Item_form_change("kuuga_dragon",item_rider_driver.class,1,"_dragon","kuuga"
			,new PotionEffect(MobEffects.HASTE, 5, 0,true,false)
			,new PotionEffect(MobEffects.SPEED, 5, 0,true,false)).setCreativeTab(Tabs.tabkuuga);

	public static Item kuuga_pegasus = new Item_form_change("kuuga_pegasus",item_rider_driver.class,2,"_pegasus","kuuga"
			,new PotionEffect(MobEffects.NIGHT_VISION, 250, 0,true,false)
			,new PotionEffect(MobEffects.JUMP_BOOST, 5, 2,true,false)).setCreativeTab(Tabs.tabkuuga);

	public static Item kuuga_titan = new Item_form_change("kuuga_titan",item_rider_driver.class,3,"_titan","kuuga"
			,new PotionEffect(MobEffects.RESISTANCE, 5, 0,true,false)
			,new PotionEffect(MobEffects.SLOWNESS, 5, 0,true,false)
			,new PotionEffect(MobEffects.STRENGTH, 5, 0,true,false)).setCreativeTab(Tabs.tabkuuga);

	public static Item kuuga_rising_mighty = new Item_form_change("kuuga_rising_mighty",item_rider_driver.class,4,"_rising_mighty","kuuga"
			,new PotionEffect(MobEffects.RESISTANCE, 5, 0,true,false)
			,new PotionEffect(MobEffects.SPEED, 5, 0,true,false)
			,new PotionEffect(PotionCore.PUNCH_BOOST_POTION, 5, 6,true,false)).setCreativeTab(Tabs.tabkuuga);

	public static Item kuuga_rising_dragon = new Item_form_change("kuuga_rising_dragon",item_rider_driver.class,4,"_rising_dragon","kuuga"
			,new PotionEffect(MobEffects.HASTE, 5, 2,true,false)
			,new PotionEffect(MobEffects.SPEED, 5, 1,true,false)
			,new PotionEffect(MobEffects.STRENGTH, 5, 0,true,false)).setCreativeTab(Tabs.tabkuuga);

	public static Item kuuga_rising_pegasus = new Item_form_change("kuuga_rising_pegasus",item_rider_driver.class,4,"_rising_pegasus","kuuga"
			,new PotionEffect(MobEffects.NIGHT_VISION, 250, 0,true,false)
			,new PotionEffect(MobEffects.JUMP_BOOST, 5, 4,true,false)
			,new PotionEffect(MobEffects.SPEED, 5, 1,true,false)
			,new PotionEffect(MobEffects.STRENGTH, 5, 0,true,false)).setCreativeTab(Tabs.tabkuuga);

	public static Item kuuga_rising_titan = new Item_form_change("kuuga_rising_titan",item_rider_driver.class,4,"_rising_titan","kuuga"
			,new PotionEffect(MobEffects.RESISTANCE, 5, 2,true,false)
			,new PotionEffect(MobEffects.SLOWNESS, 5, 0,true,false)
			,new PotionEffect(MobEffects.STRENGTH, 5, 2,true,false)).setCreativeTab(Tabs.tabkuuga);

	public static Item kuuga_amazing_mighty = new Item_form_change("kuuga_amazing_mighty",item_rider_driver.class,4,"_amazing_mighty","kuuga"
			,new PotionEffect(MobEffects.RESISTANCE, 5, 2,true,false)
			,new PotionEffect(MobEffects.SPEED, 5, 2,true,false)
			,new PotionEffect(MobEffects.JUMP_BOOST, 5, 1,true,false)
			,new PotionEffect(MobEffects.STRENGTH, 5, 2,true,false)
			,new PotionEffect(PotionCore.PUNCH_BOOST_POTION, 5, 8,true,false)).setCreativeTab(Tabs.tabkuuga);

	public static Item kuuga_ultimate = new Item_form_change("kuuga_ultimate",item_rider_driver.class,4,"_ultimate","kuuga"
			,new PotionEffect(MobEffects.RESISTANCE, 5, 4,true,false)
			,new PotionEffect(MobEffects.SPEED, 5, 3,true,false)
			,new PotionEffect(MobEffects.JUMP_BOOST, 5, 3,true,false)
			,new PotionEffect(MobEffects.STRENGTH, 5, 4,true,false)
			,new PotionEffect(PotionCore.PUNCH_BOOST_POTION, 5, 9,true,false)
			,new PotionEffect(PotionCore.FIRE_PUNCH_POTION, 5, 4,true,false)).setCreativeTab(Tabs.tabkuuga);

	public static Item kuuga_rising_ultimate = new Item_form_change("kuuga_rising_ultimate",item_rider_driver.class,5,"_rising_ultimate","kuuga"
			,new PotionEffect(MobEffects.RESISTANCE, 5, 6,true,false)
			,new PotionEffect(MobEffects.SPEED, 5, 4,true,false)
			,new PotionEffect(MobEffects.JUMP_BOOST, 5, 4,true,false)
			,new PotionEffect(MobEffects.STRENGTH, 5, 5,true,false)
			,new PotionEffect(MobEffects.NIGHT_VISION, 250, 0,true,false)
			,new PotionEffect(PotionCore.PUNCH_BOOST_POTION, 5, 10,true,false)).setCreativeTab(Tabs.tabkuuga);

	public static Item kuuga_super_rising_ultimate = new Item_form_change("kuuga_super_rising_ultimate",item_rider_driver.class,5,"_super_rising_ultimate","kuuga"
			,new PotionEffect(MobEffects.RESISTANCE, 5, 8,true,false)
			,new PotionEffect(MobEffects.SPEED, 5, 5,true,false)
			,new PotionEffect(MobEffects.JUMP_BOOST, 5, 6,true,false)
			,new PotionEffect(MobEffects.STRENGTH, 5, 7,true,false)
			,new PotionEffect(MobEffects.NIGHT_VISION, 250, 0,true,false)
			,new PotionEffect(PotionCore.PUNCH_BOOST_POTION, 5, 12,true,false)).setCreativeTab(Tabs.tabkuuga);

	public static Item kuugahead = new item_rider_armor("kuugahead",item_rider_driver.class,ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.HEAD, RiderItems.kuuga_growing).setMaxStackSize(1).setCreativeTab(Tabs.tabkuuga);
	public static Item kuugatroso = new item_rider_armor("kuugatroso",item_rider_driver.class,ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.CHEST, RiderItems.kuuga_growing).setMaxStackSize(1).setCreativeTab(Tabs.tabkuuga);
	public static Item kuugalegs = new item_rider_armor("kuugalegs",item_rider_driver.class,ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.LEGS, RiderItems.kuuga_growing).setMaxStackSize(1).setCreativeTab(Tabs.tabkuuga);

	public static Item arcle = new item_rider_driver("arcle",ArmorMaterial.DIAMOND, 4,"kuuga",(Item_form_change) kuuga_mighty, kuugahead, kuugatroso, kuugalegs, RiderItems.kuuga_growing).setMaxStackSize(1).setCreativeTab(Tabs.tabkuuga);

	public static Block stone_kuuga= new ore_block("stone_kuuga",Material.ROCK, kuuga_growing, 2).setHardness(9.9F).setCreativeTab(Tabs.tabkuuga);


	//agito
	public static Item flame_saber_charge = new Item_ore("flame_saber_charge");
	public static Item flame_saber = new ItemChargeSword("flame_saber",Tabs.medajalibur, RiderItems.agito_of_seed).setMaxStackSize(1).setCreativeTab(Tabs.tabagito);
	public static Item storm_halberd = new ItemBaseSword("storm_halberd",ToolMaterial.DIAMOND, RiderItems.agito_of_seed).setMaxStackSize(1).setCreativeTab(Tabs.tabagito);

	public static Item shining_caliber_summoned = new ItemBaseSword("shining_caliber_summoned",ToolMaterial.DIAMOND, RiderItems.agito_of_seed).setMaxStackSize(1).setCreativeTab(Tabs.tabagito);
	public static Item shining_caliber = new ItemBaseSword("shining_caliber",ToolMaterial.DIAMOND, RiderItems.agito_of_seed).setMaxStackSize(1).setCreativeTab(Tabs.tabagito);

	public static Item agitohead = new item_rider_armor("agitohead",item_agitodriver.class,ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.HEAD, RiderItems.agito_of_seed).setMaxStackSize(1).setCreativeTab(Tabs.tabagito);
	public static Item agitotroso = new item_rider_armor("agitotroso",item_agitodriver.class,ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.CHEST, RiderItems.agito_of_seed).setMaxStackSize(1).setCreativeTab(Tabs.tabagito);
	public static Item agitolegs = new item_rider_armor("agitolegs",item_agitodriver.class,ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.LEGS, RiderItems.agito_of_seed).setMaxStackSize(1).setCreativeTab(Tabs.tabagito);

	public static Item alter_ring_gr = new Item_ore("alter_ring_gr");
	public static Item alter_ring_fl = new Item_ore("alter_ring_fl");
	public static Item alter_ring_st = new Item_ore("alter_ring_st");
	public static Item alter_ring_shining = new Item_ore("alter_ring_shining");

	public static Item agito_ground = new Item_form_change("agito_ground",item_agitodriver.class,0,"","agito"
			,new PotionEffect(MobEffects.SPEED, 5, 0,true,false)
			,new PotionEffect(MobEffects.STRENGTH, 5, 0,true,false)).setCreativeTab(Tabs.tabagito);

	public static Item agito_storm = new Item_form_change("agito_storm",item_agitodriver.class,1,"_storm","agito"
			,new PotionEffect(MobEffects.SPEED, 5, 1,true,false)
			,new PotionEffect(MobEffects.JUMP_BOOST, 5, 0,true,false)).setCreativeTab(Tabs.tabagito);

	public static Item agito_flame = new Item_form_change("agito_flame",item_agitodriver.class,2,"_flame","agito"
			,new PotionEffect(MobEffects.SPEED, 5, 0,true,false)
			,new PotionEffect(MobEffects.FIRE_RESISTANCE, 5, 0,true,false)).setCreativeTab(Tabs.tabagito);

	public static Item agito_trinity = new Item_form_change("agito_trinity",item_agitodriver.class,0,"_trinity","agito"
			,new PotionEffect(MobEffects.SPEED, 5, 1,true,false)
			,new PotionEffect(MobEffects.FIRE_RESISTANCE, 5, 0,true,false)
			,new PotionEffect(MobEffects.STRENGTH, 5, 0,true,false)
			,new PotionEffect(MobEffects.JUMP_BOOST, 5, 0,true,false)).setCreativeTab(Tabs.tabagito);

	public static Item agito_burning = new Item_form_change("agito_burning",item_agitodriver.class,3,"_burning","agito"
			,new PotionEffect(MobEffects.SPEED, 5, 1,true,false)
			,new PotionEffect(MobEffects.FIRE_RESISTANCE, 5, 0,true,false)
			,new PotionEffect(MobEffects.STRENGTH, 5, 2,true,false)
			,new PotionEffect(MobEffects.JUMP_BOOST, 5, 2,true,false)
			,new PotionEffect(MobEffects.RESISTANCE, 5, 2,true,false)).setCreativeTab(Tabs.tabagito);

	public static Item agito_shining = new Item_form_change("agito_shining",item_agitodriver.class,3,"_shining","agito"
			,new PotionEffect(MobEffects.SPEED, 5, 3,true,false)
			,new PotionEffect(MobEffects.FIRE_RESISTANCE, 5, 0,true,false)
			,new PotionEffect(MobEffects.STRENGTH, 5, 4,true,false)
			,new PotionEffect(MobEffects.JUMP_BOOST, 5, 3,true,false)
			,new PotionEffect(MobEffects.RESISTANCE, 5, 3,true,false)).setCreativeTab(Tabs.tabagito);

	public static Item alter_ring = new item_agitodriver("alter_ring",ArmorMaterial.DIAMOND, 4,"agito",(Item_form_change) agito_ground).setMaxStackSize(1).setCreativeTab(Tabs.tabagito);

	public static Item alter_ring_reiko = new item_agitodriver("alter_ring_reiko",ArmorMaterial.DIAMOND, 4,"female_agito",(Item_form_change) agito_trinity).setMaxStackSize(1).setCreativeTab(Tabs.tabagito);


	public static Item gills = new Item_form_change("gills",item_agitodriver.class,0,"","gills"
			,new PotionEffect(MobEffects.SPEED, 5, 1,true,false)
			,new PotionEffect(MobEffects.STRENGTH, 5, 0,true,false)
			,new PotionEffect(MobEffects.JUMP_BOOST, 5, 0,true,false)).setCreativeTab(Tabs.tabagito);

	public static Item exceed_gills = new Item_form_change("exceed_gills",item_agitodriver.class,1,"_exceed","gills"
			,new PotionEffect(MobEffects.SPEED, 5, 3,true,false)
			,new PotionEffect(MobEffects.STRENGTH, 5, 2,true,false)
			,new PotionEffect(MobEffects.JUMP_BOOST, 5, 3,true,false)
			,new PotionEffect(MobEffects.RESISTANCE, 5, 1,true,false)).setCreativeTab(Tabs.tabagito);

	public static Item meta_factor = new item_agitodriver("meta_factor",ArmorMaterial.DIAMOND, 4,"gills",(Item_form_change) gills).setMaxStackSize(1).setCreativeTab(Tabs.tabagito);


	public static Item another_agito = new Item_form_change("another_agito",item_agitodriver.class,0,"",""
			,new PotionEffect(MobEffects.SPEED, 5, 1,true,false)
			,new PotionEffect(MobEffects.STRENGTH, 5, 1,true,false)
			,new PotionEffect(MobEffects.JUMP_BOOST, 5, 3,true,false)).setCreativeTab(Tabs.tabagito);

	public static Item ank_point = new item_agitodriver("ank_point",ArmorMaterial.DIAMOND, 4,"another_agito",(Item_form_change) another_agito).setMaxStackSize(1).setCreativeTab(Tabs.tabagito);

	public static Item g3core = new Item_ore("g3core").setCreativeTab(Tabs.tabagito);

	public static Item g3 = new Item_form_change("g3",item_agitodriver.class,0,"",""
			,new PotionEffect(MobEffects.SPEED, 5, 0,true,false)
			,new PotionEffect(MobEffects.STRENGTH, 5, 0,true,false)).AddToList( g_chip_programer_block.g_chip, 10).setCreativeTab(Tabs.tabagito);

	public static Item g3_belt = new item_agitodriver("g3_belt",ArmorMaterial.DIAMOND, 4,"g3",(Item_form_change) g3).setMaxStackSize(1).setCreativeTab(Tabs.tabagito);


	public static Item g3x = new Item_form_change("g3x",item_agitodriver.class,0,"",""
			,new PotionEffect(MobEffects.SPEED, 5, 0,true,false)
			,new PotionEffect(MobEffects.RESISTANCE, 5, 2,true,false)
			,new PotionEffect(MobEffects.STRENGTH, 5, 1,true,false)).AddToList(g_chip_programer_block.g_chip, 3).setCreativeTab(Tabs.tabagito);

	public static Item g3_x_belt = new item_agitodriver("g3_x_belt",ArmorMaterial.DIAMOND, 4,"g3_x",(Item_form_change) g3x).setMaxStackSize(1).setCreativeTab(Tabs.tabagito);	


	public static Item g3mild = new Item_form_change("g3mild",item_agitodriver.class,0,"",""
			,new PotionEffect(MobEffects.STRENGTH, 5, 0,true,false)).AddToList( g_chip_programer_block.g_chip, 2).setCreativeTab(Tabs.tabagito);

	public static Item g3_mild_belt = new item_agitodriver("g3_mild_belt",ArmorMaterial.DIAMOND, 4,"g3_mild",(Item_form_change) g3mild).setMaxStackSize(1).setCreativeTab(Tabs.tabagito);	


	public static Item g4 = new Item_form_change("g4",item_agitodriver.class,0,"",""
			,new PotionEffect(MobEffects.STRENGTH, 5, 2,true,false)
			,new PotionEffect(MobEffects.RESISTANCE, 5, 1,true,false)
			,new PotionEffect(MobEffects.POISON, 5, 0,true,false)).AddToList( g_chip_programer_block.g_chip, 1).setCreativeTab(Tabs.tabagito);

	public static Item g4_belt = new item_agitodriver("g4_belt",ArmorMaterial.DIAMOND, 4,"g4",(Item_form_change) g4).setMaxStackSize(1).setCreativeTab(Tabs.tabagito);	


	public static Item g4x = new Item_form_change("g4x",item_agitodriver.class,0,"",""
			,new PotionEffect(MobEffects.STRENGTH, 5, 1,true,false)
			,new PotionEffect(MobEffects.RESISTANCE, 5, 2,true,false)
			,new PotionEffect(MobEffects.SPEED, 5, 0,true,false)).setCreativeTab(Tabs.tabagito);

	public static Item g4_x_belt = new item_agitodriver("g4_x_belt",ArmorMaterial.DIAMOND, 4,"g4_x",(Item_form_change) g4x).setMaxStackSize(1).setCreativeTab(Tabs.tabagito);	


	public static Item g1 = new Item_form_change("g1",item_agitodriver.class,0,"",""
			,new PotionEffect(MobEffects.WEAKNESS, 5, 0,true,false)).AddToList( g_chip_programer_block.g_chip, 10).setCreativeTab(Tabs.tabagito);

	public static Item g1_belt = new item_agitodriver("g1_belt",ArmorMaterial.DIAMOND, 4,"g1",(Item_form_change) g1).setMaxStackSize(1).setCreativeTab(Tabs.tabagito);	

	public static Item v1 = new Item_form_change("v1",item_agitodriver.class,0,"",""
			,new PotionEffect(MobEffects.SPEED, 5, 0,true,false)
			,new PotionEffect(MobEffects.STRENGTH, 5, 0,true,false)).AddToList( g_chip_programer_block.g_chip, 10).setCreativeTab(Tabs.tabagito);

	public static Item v1_belt = new item_agitodriver("v1_belt",ArmorMaterial.DIAMOND, 4,"v1",(Item_form_change) v1).belt(true).setMaxStackSize(1).setCreativeTab(Tabs.tabagito);


	public static Item agito_miracle = new Item_form_change("agito_miracle",item_agitodriver.class,0,"",""
			,new PotionEffect(MobEffects.SPEED, 5, 4,true,false)
			,new PotionEffect(MobEffects.FIRE_RESISTANCE, 5, 0,true,false)
			,new PotionEffect(MobEffects.STRENGTH, 5, 4,true,false)
			,new PotionEffect(MobEffects.JUMP_BOOST, 5, 2,true,false)
			,new PotionEffect(MobEffects.RESISTANCE, 5, 4,true,false)).setCreativeTab(Tabs.tabagito);

	public static Item alter_ring_miracle = new item_agitodriver("alter_ring_miracle",ArmorMaterial.DIAMOND, 4,"agito_miracle",(Item_form_change) agito_miracle).setMaxStackSize(1).setCreativeTab(Tabs.tabagito);	


	public static Item another_agito_burning_form = new Item_form_change("another_agito_burning_form",item_agitodriver.class,0,"",""
			,new PotionEffect(MobEffects.FIRE_RESISTANCE, 5, 0,true,false)
			,new PotionEffect(MobEffects.STRENGTH, 5, 4,true,false)
			,new PotionEffect(MobEffects.JUMP_BOOST, 5, 5,true,false)
			,new PotionEffect(MobEffects.RESISTANCE, 5, 4,true,false)).setCreativeTab(Tabs.tabagito);

	public static Item ank_point_burning = new item_agitodriver("ank_point_burning",ArmorMaterial.DIAMOND, 4,"another_agito_burning",(Item_form_change) another_agito_burning_form).setMaxStackSize(1).setCreativeTab(Tabs.tabagito);	

	public static Item tornader = new item_bikes("tornader",Entitymachine_tornador::new).setMaxStackSize(1).setCreativeTab(Tabs.tabagito);

	//ryuki
	public static Item blank_knight_advent = new Item_form_change("blank_knight_advent",item_rider_driver.class,2,"_blank","knight"
			,new PotionEffect(MobEffects.WEAKNESS, 5, 1,true,false));
	
	public static Item blank_ouja_advent = new Item_form_change("blank_ouja_advent",item_rider_driver.class,2,"_blank","ouja"
			,new PotionEffect(MobEffects.WEAKNESS, 5, 1,true,false));

	public static Item contract_advent = new Item_form_change("contract_advent",item_rider_driver.class,2,"_blank","ryuki"
			,new PotionEffect(MobEffects.WEAKNESS, 5, 1,true,false)).addAlternative((Item_form_change) blank_knight_advent).addAlternative((Item_form_change) blank_ouja_advent).setCreativeTab(Tabs.tabryuki);


	public static Item drag_visor = new Item_ore("drag_visor").setCreativeTab(Tabs.tabryuki);
	public static Item ride_saber = new ItemBaseSword("ride_saber",Tabs.den_denso, RiderItems.contract_advent).setMaxStackSize(1).setCreativeTab(Tabs.tabryuki);
	public static Item drag_saber = new ItemBaseSword("drag_saber",Tabs.den_denso, RiderItems.contract_advent).setMaxStackSize(1).setTranslationKey("drag_saber").setCreativeTab(Tabs.tabryuki);
	public static Item drag_claw = new ItemBaseSword("drag_claw",Tabs.den_denro, RiderItems.contract_advent).setMaxStackSize(1).setTranslationKey("drag_claw").setCreativeTab(Tabs.tabryuki);

	public static Item drag_shield = new ItemBaseShield("drag_shield", RiderItems.contract_advent).setMaxStackSize(1).setCreativeTab(Tabs.tabryuki);
	public static Item drag_visor_zwei = new ItemBaseSword("drag_visor_zwei",Tabs.denkamen_sword, RiderItems.contract_advent).setMaxStackSize(1).setCreativeTab(Tabs.tabryuki);

	public static Item dark_visor = new ItemBaseSword("dark_visor",Tabs.den_denso, RiderItems.contract_advent).setMaxStackSize(1).setCreativeTab(Tabs.tabryuki);
	public static Item wing_lancer = new ItemBaseSword("wing_lancer",Tabs.den_denaxe, RiderItems.contract_advent).setMaxStackSize(1).setCreativeTab(Tabs.tabryuki);

	public static Item dark_blade = new ItemBaseSword("dark_blade",Tabs.denkamen_sword, RiderItems.contract_advent).setMaxStackSize(1).setCreativeTab(Tabs.tabryuki);
	
	public static Item scissors_visor = new Item_ore("scissors_visor").setCreativeTab(Tabs.tabryuki);
	public static Item scissors_pincer = new ItemBaseSword("scissors_pincer",Tabs.den_denro, RiderItems.contract_advent).setMaxStackSize(1).setCreativeTab(Tabs.tabryuki);
	public static Item incisor_guard = new ItemBaseShield("incisor_guard", RiderItems.contract_advent).setMaxStackSize(1).setCreativeTab(Tabs.tabryuki);

	public static Item magna_visor = new Item_gun("magna_visor",Tabs.den_dengu, RiderItems.contract_advent).setCreativeTab(Tabs.tabryuki);
	public static Item torque_guard = new ItemBaseShield("torque_guard", RiderItems.contract_advent).setCreativeTab(Tabs.tabryuki);

	public static Item evil_visor = new Item_ore("evil_visor").setCreativeTab(Tabs.tabryuki);

	public static Item metal_visor = new ItemBaseSword("metal_visor",Tabs.den_denso, RiderItems.contract_advent).setMaxStackSize(1).setCreativeTab(Tabs.tabryuki);
	public static Item hetal_horn = new ItemBaseSword("hetal_horn",Tabs.den_denaxe, RiderItems.contract_advent).setMaxStackSize(1).setCreativeTab(Tabs.tabryuki);

	public static Item veno_visor = new ItemBaseSword("veno_visor",Tabs.den_denro, RiderItems.contract_advent).setCreativeTab(Tabs.tabryuki);
	public static Item veno_saber = new ItemBaseSword("veno_saber",Tabs.den_denso, RiderItems.contract_advent).setMaxStackSize(1).setCreativeTab(Tabs.tabryuki);
	public static Item veno_visor_zwei = new ItemBaseSword("veno_visor_zwei",Tabs.denkamen_sword, RiderItems.contract_advent).setMaxStackSize(1).setCreativeTab(Tabs.tabryuki);
	
	public static Item dest_visor = new ItemBaseSword("dest_visor",Tabs.den_denaxe, RiderItems.contract_advent).setCreativeTab(Tabs.tabryuki);
	public static Item dest_claws = new ItemBaseSword("dest_claws",Tabs.den_denro, RiderItems.contract_advent).setMaxStackSize(1).setCreativeTab(Tabs.tabryuki);

	public static Item gazelle_visor = new Item_ore("gazelle_visor").setCreativeTab(Tabs.tabryuki);

	public static Item gold_visor = new ItemBaseSword("gold_visor",Tabs.den_denro, RiderItems.contract_advent).setCreativeTab(Tabs.tabryuki);
	public static Item gold_sabers = new ItemBaseSword("gold_sabers",Tabs.den_denso, RiderItems.contract_advent).setMaxStackSize(1).setCreativeTab(Tabs.tabryuki);
	public static Item gold_shield = new ItemBaseShield("gold_shield", RiderItems.contract_advent).setCreativeTab(Tabs.tabryuki);

	public static Item wing_slasher = new ItemBaseSword("wing_slasher",Tabs.den_denso, RiderItems.contract_advent).setMaxStackSize(1).setCreativeTab(Tabs.tabryuki);
	public static Item wing_shield = new ItemBaseShield("wing_shield", RiderItems.contract_advent).setCreativeTab(Tabs.tabryuki);

	public static Item dark_drag_visor = new Item_ore("dark_drag_visor").setCreativeTab(Tabs.tabryuki);
	public static Item drag_saber_ryuga = new ItemBaseSword("drag_saber_ryuga",Tabs.den_denso, RiderItems.contract_advent).setMaxStackSize(1).setCreativeTab(Tabs.tabryuki);
	public static Item ryuga_drag_claw = new ItemBaseSword("ryuga_drag_claw",Tabs.den_denro, RiderItems.contract_advent).setMaxStackSize(1).setCreativeTab(Tabs.tabryuki);
	public static Item ryuga_drag_shield = new ItemBaseShield("ryuga_drag_shield", RiderItems.contract_advent).setCreativeTab(Tabs.tabryuki);

	public static Item blanc_visor = new ItemBaseSword("blanc_visor",ToolMaterial.DIAMOND, RiderItems.contract_advent).setMaxStackSize(1).setCreativeTab(Tabs.tabryuki);

	public static Item bio_visor = new Item_ore("bio_visor").setCreativeTab(Tabs.tabryuki);

	public static Item abyss_visor = new Item_ore("abyss_visor").setCreativeTab(Tabs.tabryuki);
	public static Item abyss_saber = new ItemBaseSword("abyss_saber",Tabs.den_denso, RiderItems.contract_advent).setMaxStackSize(1).setCreativeTab(Tabs.tabryuki);
	public static Item abyssmash = new ItemBaseSword("abyssmash",Tabs.den_denro, RiderItems.contract_advent).setMaxStackSize(1).setCreativeTab(Tabs.tabryuki);

	public static Item slash_visor = new Item_ore("slash_visor").setCreativeTab(Tabs.tabryuki);
	public static Item alternative_sword = new ItemBaseSword("alternative_sword",Tabs.den_denso, RiderItems.contract_advent).setMaxStackSize(1).setCreativeTab(Tabs.tabryuki);

	public static Item ryukihead = new item_rider_armor("ryukihead",item_rider_driver.class,ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.HEAD, contract_advent).setMaxStackSize(1).setCreativeTab(Tabs.tabryuki);
	public static Item ryukitroso = new item_rider_armor("ryukitroso",item_rider_driver.class,ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.CHEST, contract_advent).setMaxStackSize(1).setCreativeTab(Tabs.tabryuki);
	public static Item ryukilegs = new item_rider_armor("ryukilegs",item_rider_driver.class,ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.LEGS, contract_advent).setMaxStackSize(1).setCreativeTab(Tabs.tabryuki);
	
	public static Item dragreder_advent = new Item_form_change("dragreder_advent",item_rider_driver.class,0,"","ryuki"
			,new PotionEffect(MobEffects.SPEED, 5, 0,true,false),new PotionEffect(MobEffects.FIRE_RESISTANCE, 5, 0,true,false)
			,new PotionEffect(MobEffects.HASTE, 5, 0,true,false)).setCreativeTab(Tabs.tabryuki);
	
	
	public static Item darkwing_advent = new Item_form_change("darkwing_advent",item_rider_driver.class,0,"","knight"
			,new PotionEffect(MobEffects.SPEED, 5, 0,true,false),new PotionEffect(MobEffects.NIGHT_VISION, 250, 0,true,false),
			new PotionEffect(MobEffects.STRENGTH, 5, 0,true,false)).setCreativeTab(Tabs.tabryuki);
	
	public static Item volcancer_advent = new Item_form_change("volcancer_advent",item_rider_driver.class,0,"","scissors"
			,new PotionEffect(MobEffects.SLOWNESS, 5, 0,true,false),new PotionEffect(MobEffects.RESISTANCE, 5, 0,true,false),
			new PotionEffect(MobEffects.STRENGTH, 5, 1,true,false)).setCreativeTab(Tabs.tabryuki);
	
	public static Item magnugiga_advent = new Item_form_change("magnugiga_advent",item_rider_driver.class,0,"","zolda"
			,new PotionEffect(MobEffects.SPEED, 5, 0,true,false),new PotionEffect(MobEffects.NIGHT_VISION, 5, 0,true,false),
			new PotionEffect(MobEffects.STRENGTH, 5, 0,true,false)).setCreativeTab(Tabs.tabryuki);
	
	public static Item evildiver_advent = new Item_form_change("evildiver_advent",item_rider_driver.class,0,"","raia"
			,new PotionEffect(MobEffects.SPEED, 5, 2,true,false),new PotionEffect(MobEffects.STRENGTH, 5, 1,true,false),
			new PotionEffect(MobEffects.HASTE, 5, 1,true,false)).setCreativeTab(Tabs.tabryuki);
	
	public static Item metalgelas_advent = new Item_form_change("metalgelas_advent",item_rider_driver.class,0,"","gai"
			,new PotionEffect(MobEffects.STRENGTH, 5, 3,true,false),new PotionEffect(MobEffects.MINING_FATIGUE, 5, 0,true,false)).setCreativeTab(Tabs.tabryuki);
	
	public static Item venosnaker_advent = new Item_form_change("venosnaker_advent",item_rider_driver.class,0,"","ouja"
			,new PotionEffect(MobEffects.STRENGTH, 5, 2,true,false),new PotionEffect(MobEffects.SPEED, 5, 0,true,false)).setCreativeTab(Tabs.tabryuki);
	
	public static Item destwilder_advent = new Item_form_change("destwilder_advent",item_rider_driver.class,0,"","tiger"
			,new PotionEffect(MobEffects.STRENGTH, 5, 0,true,false),new PotionEffect(MobEffects.SPEED, 5, 1,true,false)
			,new PotionEffect(MobEffects.HASTE, 5, 1,true,false)).setCreativeTab(Tabs.tabryuki);
	
	public static Item gigazelle_advent = new Item_form_change("gigazelle_advent",item_rider_driver.class,0,"","imperer"
			,new PotionEffect(MobEffects.STRENGTH, 5, 0,true,false),new PotionEffect(MobEffects.SPEED, 5, 1,true,false)
					,new PotionEffect(MobEffects.JUMP_BOOST, 5, 3,true,false)).setCreativeTab(Tabs.tabryuki);
	
	public static Item biogreeza_advent = new Item_form_change("biogreeza_advent",item_rider_driver.class,0,"","verde"
			,new PotionEffect(MobEffects.STRENGTH, 5, 1,true,false),new PotionEffect(MobEffects.SPEED, 5, 2,true,false),
			new PotionEffect(MobEffects.JUMP_BOOST, 5, 5,true,false)).setCreativeTab(Tabs.tabryuki);
	
	public static Item blancwing_advent = new Item_form_change("blancwing_advent",item_rider_driver.class,0,"","femme"
			,new PotionEffect(MobEffects.STRENGTH, 5, 0,true,false),new PotionEffect(MobEffects.SPEED, 5, 1,true,false),new PotionEffect(MobEffects.HASTE, 5, 1,true,false)
			,new PotionEffect(MobEffects.JUMP_BOOST, 5, 3,true,false)).setCreativeTab(Tabs.tabryuki);
	
	public static Item goldphoenix_advent  = new Item_form_change("goldphoenix_advent",item_rider_driver.class,0,"","odin"
			,new PotionEffect(MobEffects.STRENGTH, 5, 5,true,false),new PotionEffect(MobEffects.JUMP_BOOST, 250, 4,true,false)
			,new PotionEffect(MobEffects.HASTE, 5, 0,true,false),new PotionEffect(MobEffects.RESISTANCE, 5, 4,true,false),
			new PotionEffect(MobEffects.SPEED, 5, 2,true,false)).setCreativeTab(Tabs.tabryuki);
	
	public static Item abysslasher_advent = new Item_form_change("abysslasher_advent",item_rider_driver.class,0,"","abyss"
			,new PotionEffect(MobEffects.STRENGTH, 5, 1,true,false),new PotionEffect(MobEffects.SPEED, 5, 2,true,false),
			new PotionEffect(MobEffects.WATER_BREATHING, 5, 0,true,false)).setCreativeTab(Tabs.tabryuki);
	
	public static Item psycorogue_advent = new Item_form_change("psycorogue_advent",item_rider_driver.class,0,"","alternative"
			,new PotionEffect(MobEffects.STRENGTH, 5, 2,true,false),new PotionEffect(MobEffects.SPEED, 5, 0,true,false)
			,new PotionEffect(MobEffects.RESISTANCE, 5, 2,true,false)).setCreativeTab(Tabs.tabryuki);


	public static Item dragblacker_advent = new Item_form_change("dragblacker_advent",item_rider_driver.class,0,"","ryuga"
			,new PotionEffect(MobEffects.SPEED, 5, 0,true,false),new PotionEffect(MobEffects.FIRE_RESISTANCE, 5, 0,true,false)
			,new PotionEffect(MobEffects.HASTE, 5, 0,true,false)).setCreativeTab(Tabs.tabryuki);


	public static Item survive_ryuga_advent = new Item_form_change("survive_ryuga_advent",item_rider_driver.class,1,"_survive","ryuga"
			,new PotionEffect(MobEffects.STRENGTH, 5, 5,true,false),new PotionEffect(MobEffects.NIGHT_VISION, 250, 0,true,false),
			new PotionEffect(MobEffects.HASTE, 5, 0,true,false),new PotionEffect(MobEffects.RESISTANCE, 5, 2,true,false),
			new PotionEffect(MobEffects.SPEED, 5, 1,true,false));
	
	public static Item survive_raia_advent = new Item_form_change("survive_raia_advent",item_rider_driver.class,1,"_survive","raia"
			,new PotionEffect(MobEffects.STRENGTH, 5, 5,true,false),new PotionEffect(MobEffects.NIGHT_VISION, 250, 0,true,false),
			new PotionEffect(MobEffects.HASTE, 5, 0,true,false),new PotionEffect(MobEffects.RESISTANCE, 5, 2,true,false),
			new PotionEffect(MobEffects.SPEED, 5, 1,true,false));

	public static Item survive_ouja_advent = new Item_form_change("survive_ouja_advent",item_rider_driver.class,0,"_survive","ouja"
			,new PotionEffect(MobEffects.STRENGTH, 5, 5,true,false),new PotionEffect(MobEffects.NIGHT_VISION, 250, 0,true,false),
			new PotionEffect(MobEffects.HASTE, 5, 0,true,false),new PotionEffect(MobEffects.RESISTANCE, 5, 2,true,false),
			new PotionEffect(MobEffects.SPEED, 5, 1,true,false));


	
	public static Item survive_shippu_advent = new Item_form_change("survive_shippu_advent",item_rider_driver.class,1,"_survive","knight"
			,new PotionEffect(MobEffects.STRENGTH, 5, 5,true,false),new PotionEffect(MobEffects.NIGHT_VISION, 250, 0,true,false),
			new PotionEffect(MobEffects.HASTE, 5, 0,true,false),new PotionEffect(MobEffects.RESISTANCE, 5, 2,true,false),
			new PotionEffect(MobEffects.SPEED, 5, 1,true,false)).addAlternative((Item_form_change) survive_raia_advent).addAlternative((Item_form_change) survive_ouja_advent).setCreativeTab(Tabs.tabryuki);
	
	public static Item survive_mugen_advent = new Item_form_change("survive_mugen_advent",item_rider_driver.class,1,"_survive_mugen","ouja"
			,new PotionEffect(MobEffects.STRENGTH, 5, 5,true,false),new PotionEffect(MobEffects.NIGHT_VISION, 250, 0,true,false),
			new PotionEffect(MobEffects.HASTE, 5, 0,true,false),new PotionEffect(MobEffects.RESISTANCE, 5, 2,true,false),
			new PotionEffect(MobEffects.SPEED, 5, 1,true,false)).setCreativeTab(Tabs.tabryuki);
	
	public static Item survive_advent = new Item_form_change("survive_advent",item_rider_driver.class,1,"_survive","ryuki"
			,new PotionEffect(MobEffects.STRENGTH, 5, 4,true,false),new PotionEffect(MobEffects.FIRE_RESISTANCE, 5, 0,true,false)
			,new PotionEffect(MobEffects.HASTE, 5, 1,true,false),new PotionEffect(MobEffects.RESISTANCE, 5, 2,true,false),
			new PotionEffect(MobEffects.SPEED, 5, 1,true,false)).addAlternative((Item_form_change) survive_ryuga_advent).setCreativeTab(Tabs.tabryuki);
	
	public static Item survive_ryuki_advent_black = new Item_form_change("survive_ryuki_advent_black",item_rider_driver.class,0,"_survive_black","ryuki"
			,new PotionEffect(MobEffects.STRENGTH, 5, 4,true,false),new PotionEffect(MobEffects.FIRE_RESISTANCE, 5, 0,true,false)
			,new PotionEffect(MobEffects.HASTE, 5, 1,true,false),new PotionEffect(MobEffects.RESISTANCE, 5, 2,true,false),
			new PotionEffect(MobEffects.SPEED, 5, 1,true,false)).setCreativeTab(Tabs.tabryuki);

	
	public static Item v_buckle_ryuki = new item_rider_driver("v_buckle_ryuki",ArmorMaterial.DIAMOND, 4,"ryuki", (Item_form_change) dragreder_advent, ryukihead, ryukitroso, ryukilegs, RiderItems.contract_advent).setMaxStackSize(1).setCreativeTab(Tabs.tabryuki);
	public static Item v_buckle_knight = new item_rider_driver("v_buckle_knight",ArmorMaterial.DIAMOND, 4,"knight", (Item_form_change) darkwing_advent, ryukihead, ryukitroso, ryukilegs, RiderItems.contract_advent).setMaxStackSize(1).setCreativeTab(Tabs.tabryuki);
	public static Item v_buckle_scissors = new item_rider_driver("v_buckle_scissors",ArmorMaterial.DIAMOND, 4,"scissors", (Item_form_change) volcancer_advent, ryukihead, ryukitroso, ryukilegs, RiderItems.contract_advent).setMaxStackSize(1).setCreativeTab(Tabs.tabryuki);
	public static Item v_buckle_zolda = new item_rider_driver("v_buckle_zolda",ArmorMaterial.DIAMOND, 4,"zolda", (Item_form_change) magnugiga_advent, ryukihead, ryukitroso, ryukilegs, RiderItems.contract_advent).setMaxStackSize(1).setCreativeTab(Tabs.tabryuki);
	public static Item v_buckle_raia = new item_rider_driver("v_buckle_raia",ArmorMaterial.DIAMOND, 4,"raia", (Item_form_change) evildiver_advent, ryukihead, ryukitroso, ryukilegs, RiderItems.contract_advent).setMaxStackSize(1).setCreativeTab(Tabs.tabryuki);
	public static Item v_buckle_gai = new item_rider_driver("v_buckle_gai",ArmorMaterial.DIAMOND, 4,"gai", (Item_form_change) metalgelas_advent, ryukihead, ryukitroso, ryukilegs, RiderItems.contract_advent).setMaxStackSize(1).setCreativeTab(Tabs.tabryuki);
	public static Item v_buckle_ouja = new item_rider_driver("v_buckle_ouja",ArmorMaterial.DIAMOND, 4,"ouja", (Item_form_change) venosnaker_advent, ryukihead, ryukitroso, ryukilegs, RiderItems.contract_advent).setMaxStackSize(1).setCreativeTab(Tabs.tabryuki);
	public static Item v_buckle_tiger = new item_rider_driver("v_buckle_tiger",ArmorMaterial.DIAMOND, 4,"tiger", (Item_form_change) destwilder_advent, ryukihead, ryukitroso, ryukilegs, RiderItems.contract_advent).setMaxStackSize(1).setCreativeTab(Tabs.tabryuki);
	public static Item v_buckle_imperer = new item_rider_driver("v_buckle_imperer",ArmorMaterial.DIAMOND, 4,"imperer", (Item_form_change) gigazelle_advent, ryukihead, ryukitroso, ryukilegs, RiderItems.contract_advent).setMaxStackSize(1).setCreativeTab(Tabs.tabryuki);
	public static Item v_buckle_odin = new item_rider_driver("v_buckle_odin",ArmorMaterial.DIAMOND, 4,"odin", (Item_form_change) goldphoenix_advent, ryukihead, ryukitroso, ryukilegs, RiderItems.contract_advent).setMaxStackSize(1).setCreativeTab(Tabs.tabryuki);
	public static Item v_buckle_femme = new item_rider_driver("v_buckle_femme",ArmorMaterial.DIAMOND, 4,"femme", (Item_form_change) blancwing_advent, ryukihead, ryukitroso, ryukilegs, RiderItems.contract_advent).setMaxStackSize(1).setCreativeTab(Tabs.tabryuki);
	public static Item v_buckle_verde = new item_rider_driver("v_buckle_verde",ArmorMaterial.DIAMOND, 4,"verde", (Item_form_change) biogreeza_advent , ryukihead, ryukitroso, ryukilegs, RiderItems.contract_advent).setMaxStackSize(1).setCreativeTab(Tabs.tabryuki);
	public static Item v_buckle_ryuga = new item_rider_driver("v_buckle_ryuga",ArmorMaterial.DIAMOND, 4,"ryuga", (Item_form_change) dragblacker_advent, ryukihead, ryukitroso, ryukilegs, RiderItems.contract_advent).setMaxStackSize(1).setCreativeTab(Tabs.tabryuki);
	public static Item v_buckle_abyss = new item_rider_driver("v_buckle_abyss",ArmorMaterial.DIAMOND, 4,"abyss", (Item_form_change) abysslasher_advent, ryukihead, ryukitroso, ryukilegs, RiderItems.contract_advent).setMaxStackSize(1).setCreativeTab(Tabs.tabryuki);
	public static Item alternativebelt = new item_rider_driver("alternativebelt",ArmorMaterial.DIAMOND, 4,"alternative", (Item_form_change) psycorogue_advent, ryukihead, ryukitroso, ryukilegs, RiderItems.contract_advent).setMaxStackSize(1).setCreativeTab(Tabs.tabryuki);
	public static Item alternativezerobelt = new item_rider_driver("alternativezerobelt",ArmorMaterial.DIAMOND, 4,"alternativezero", (Item_form_change) psycorogue_advent, ryukihead, ryukitroso, ryukilegs, RiderItems.contract_advent).setMaxStackSize(1).setCreativeTab(Tabs.tabryuki);
	

	public static Item blank_sword_vent = new Item_vent("blank_sword_vent","ryuki",ride_saber,2,drag_visor).setCreativeTab(Tabs.tabryuki);
	public static Item drag_saber_vent = new Item_vent("drag_saber_vent","ryuki",drag_saber,0,drag_visor).setCreativeTab(Tabs.tabryuki);
	public static Item wing_lancer_vent = new Item_vent("wing_lancer_vent","knight",wing_lancer,0,dark_visor).setCreativeTab(Tabs.tabryuki);
	public static Item veno_saber_vent = new Item_vent("veno_saber_vent","ouja",veno_saber,0,veno_visor).setCreativeTab(Tabs.tabryuki);
	public static Item wing_slasher_vent = new Item_vent("wing_slasher_vent","femme",wing_slasher,0,blanc_visor).setCreativeTab(Tabs.tabryuki);
	public static Item ryuga_drag_saber_vent = new Item_vent("ryuga_drag_saber_vent","ryuga",drag_saber_ryuga,0,dark_drag_visor).setCreativeTab(Tabs.tabryuki);
	public static Item gold_sabers_vent = new Item_vent("gold_sabers_vent","odin",gold_sabers,0,gold_visor).setCreativeTab(Tabs.tabryuki);
	public static Item drag_visor_zwei_sword_mode_vent = new Item_vent("drag_visor_zwei_sword_mode_vent","ryuki",drag_visor_zwei,1,drag_visor).setCreativeTab(Tabs.tabryuki);
	public static Item dark_blade_vent = new Item_vent("dark_blade_vent","knight",dark_blade,1,dark_visor).setCreativeTab(Tabs.tabryuki);
	public static Item veno_visor_zwei_sword_mode_vent = new Item_vent("veno_visor_zwei_sword_mode_vent","ouja",veno_visor_zwei,1,veno_visor).setCreativeTab(Tabs.tabryuki);
	
	public static Item abyss_saber_vent = new Item_vent("abyss_saber_vent","abyss",abyss_saber,0,abyss_visor).setCreativeTab(Tabs.tabryuki);
	public static Item alternative_sword_vent = new Item_vent("alternative_sword_vent","alternative",alternative_sword,0,slash_visor).setCreativeTab(Tabs.tabryuki);


	public static Item drag_claw_vent = new Item_vent("drag_claw_vent","ryuki",drag_claw,0,drag_visor).setCreativeTab(Tabs.tabryuki);
	public static Item scissors_pincer_vent = new Item_vent("scissors_pincer_vent","scissors",scissors_pincer,0,scissors_visor).setCreativeTab(Tabs.tabryuki);
	public static Item metal_horn_vent = new Item_vent("metal_horn_vent","gai",hetal_horn,0,metal_visor).setCreativeTab(Tabs.tabryuki);
	public static Item dest_claws_vent = new Item_vent("dest_claws_vent","tiger",dest_claws,0,dest_visor).setCreativeTab(Tabs.tabryuki);
	public static Item ryuga_drag_claw_vent = new Item_vent("ryuga_drag_claw_vent","ryuga",ryuga_drag_claw,0,dark_drag_visor).setCreativeTab(Tabs.tabryuki);
	public static Item abyssmash_vent = new Item_vent("abyssmash_vent","abyss",abyssmash,1,abyss_visor).setCreativeTab(Tabs.tabryuki);

	public static Item drag_shield_vent = new Item_vent("drag_shield_vent","ryuki",drag_shield,0,drag_visor).setCreativeTab(Tabs.tabryuki);
	public static Item shell_defense_vent = new Item_vent("shell_defense_vent","scissors",incisor_guard,0,scissors_visor).setCreativeTab(Tabs.tabryuki);
	public static Item giga_armor_vent = new Item_vent("giga_armor_vent","zolda",torque_guard,0,magna_visor).setCreativeTab(Tabs.tabryuki);
	public static Item wing_shield_vent = new Item_vent("wing_shield_vent","femme",wing_shield,0,blanc_visor).setCreativeTab(Tabs.tabryuki);
	public static Item ryuga_drag_shield_vent = new Item_vent("ryuga_drag_shield_vent","ryuga",ryuga_drag_shield,0,dark_drag_visor).setCreativeTab(Tabs.tabryuki);
	public static Item gold_shield_vent = new Item_vent("gold_shield_vent","odin",gold_shield,1,gold_visor).setCreativeTab(Tabs.tabryuki);

	public static Block advent_glass= new glass_ore_block("advent_glass",Material.ROCK, contract_advent, 2).setHardness(9.9F).setCreativeTab(Tabs.tabryuki);
	public static Block hell_advent_glass= new glass_ore_block("hell_advent_glass",Material.ROCK, dragblacker_advent, 3).setHardness(9.9F).setCreativeTab(Tabs.tabryuki);

	//faiz
	
	public static Item blank_mission_memory = new Item_ore("blank_mission_memory").setCreativeTab(Tabs.tabfaiz);
	
	public static Item faiz_edge = new ItemBaseSword("faiz_edge",Tabs.faiz_edge, RiderItems.blank_mission_memory).setMaxStackSize(1).setCreativeTab(Tabs.tabfaiz);

	public static Item faiz_blaster = new Item_sword_gun("faiz_blaster",Tabs.faiz_blaster, RiderItems.blank_mission_memory).setMaxStackSize(1).setCreativeTab(Tabs.tabfaiz);		
	public static Item orga_stlanzer = new ItemBaseSword("orga_stlanzer",Tabs.orga_stlanzer, RiderItems.blank_mission_memory).setMaxStackSize(1).setCreativeTab(Tabs.tabfaiz);
	public static Item axel_ray_gun = new Item_sword_gun("axel_ray_gun",Tabs.axel_ray_gun, RiderItems.blank_mission_memory).setMaxStackSize(1).setCreativeTab(Tabs.tabfaiz);

	public static Item kaixa_blaygun = new Item_sword_gun("kaixa_blaygun",Tabs.kaixa_blaygun, RiderItems.blank_mission_memory).setMaxStackSize(1).setCreativeTab(Tabs.tabfaiz);

	public static Item deltablaster = new Item_gun("deltablaster",Tabs.deltablaster, RiderItems.blank_mission_memory).setMaxStackSize(1).setCreativeTab(Tabs.tabfaiz);

	public static Item psyga_tonfa_edge = new ItemBaseSword("psyga_tonfa_edge",Tabs.psyga_tonfa_edge, RiderItems.blank_mission_memory).setMaxStackSize(1).setCreativeTab(Tabs.tabfaiz);

	public static Item faiz_mission_memory = new Item_form_change("faiz_mission_memory",item_rider_driver.class,0,"","faiz"
			,new PotionEffect(MobEffects.STRENGTH, 5, 1,true,false),new PotionEffect(MobEffects.RESISTANCE, 5, 0,true,false)
			,new PotionEffect(MobEffects.NIGHT_VISION, 5, 0,true,false)).setCreativeTab(Tabs.tabfaiz);
	
	public static Item faiz_axel_mission_memory = new Item_form_change("faiz_axel_mission_memory",item_rider_driver.class,1,"_accel","faiz"
			,new PotionEffect(MobEffects.STRENGTH, 5, 2,true,false),new PotionEffect(MobEffects.SPEED, 5, 5,true,false)
			,new PotionEffect(MobEffects.HASTE, 5, 4,true,false),new PotionEffect(MobEffects.RESISTANCE, 5, 1,true,false)
			,new PotionEffect(MobEffects.NIGHT_VISION, 5, 0,true,false)).setCreativeTab(Tabs.tabfaiz);
	
	public static Item faiz_blaster_mission_memory = new Item_form_change("faiz_blaster_mission_memory",item_rider_driver.class,2,"_blaster","faiz"
			,new PotionEffect(MobEffects.STRENGTH, 5, 4,true,false),new PotionEffect(MobEffects.SPEED, 5, 3,true,false),
			new PotionEffect(MobEffects.HASTE, 5, 3,true,false),new PotionEffect(MobEffects.JUMP_BOOST, 5, 3,true,false),
			new PotionEffect(MobEffects.RESISTANCE, 5, 2,true,false),new PotionEffect(MobEffects.NIGHT_VISION, 5, 0,true,false)
			,new PotionEffect(PotionCore.FLY_POTION, 5, 1,true,false)).setCreativeTab(Tabs.tabfaiz);
	
	public static Item kaixa_mission_memory = new Item_form_change("kaixa_mission_memory",item_rider_driver.class,0,"","kaixa"
			,new PotionEffect(MobEffects.STRENGTH, 5, 3,true,false),new PotionEffect(MobEffects.RESISTANCE, 5, 1,true,false),
			new PotionEffect(MobEffects.NIGHT_VISION, 5, 0,true,false)).setCreativeTab(Tabs.tabfaiz);
	
	public static Item delta_mission_memory = new Item_form_change("delta_mission_memory",item_rider_driver.class,0,"","kaixa"
			,new PotionEffect(MobEffects.JUMP_BOOST, 5, 1,true,false),new PotionEffect(MobEffects.RESISTANCE, 5, 3,true,false)
			,new PotionEffect(MobEffects.STRENGTH, 5, 2,true,false),new PotionEffect(MobEffects.NIGHT_VISION, 5, 0,true,false)).setCreativeTab(Tabs.tabfaiz);
	
	public static Item psyga_mission_memory = new Item_form_change("psyga_mission_memory",item_rider_driver.class,0,"","kaixa"
			,new PotionEffect(MobEffects.STRENGTH, 5, 3,true,false),new PotionEffect(MobEffects.RESISTANCE, 5, 3,true,false),
			new PotionEffect(MobEffects.SPEED, 5, 3,true,false),new PotionEffect(MobEffects.NIGHT_VISION, 5, 0,true,false)).setCreativeTab(Tabs.tabfaiz);
	
	public static Item orga_mission_memory = new Item_form_change("orga_mission_memory",item_rider_driver.class,0,"","kaixa"
			,new PotionEffect(MobEffects.STRENGTH, 5, 4,true,false),new PotionEffect(MobEffects.SLOWNESS, 5, 1,true,false),
			new PotionEffect(MobEffects.RESISTANCE, 5, 4,true,false),new PotionEffect(MobEffects.REGENERATION, 5, 0,true,false),
			new PotionEffect(MobEffects.NIGHT_VISION, 5, 0,true,false)).setCreativeTab(Tabs.tabfaiz);
	
	
	public static Item faizhead = new item_rider_armor("faizhead",item_rider_driver.class,ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.HEAD, blank_mission_memory).setMaxStackSize(1).setCreativeTab(Tabs.tabfaiz);
	public static Item faiztroso = new item_rider_armor("faiztroso",item_rider_driver.class,ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.CHEST, blank_mission_memory).setMaxStackSize(1).setCreativeTab(Tabs.tabfaiz);
	public static Item faizlegs = new item_rider_armor("faizlegs",item_rider_driver.class,ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.LEGS, blank_mission_memory).setMaxStackSize(1).setCreativeTab(Tabs.tabfaiz);

	public static Item faizdriver = new item_rider_driver("faizdriver",ArmorMaterial.DIAMOND, 4,"faiz", (Item_form_change) faiz_mission_memory, faizhead, faiztroso, faizlegs, RiderItems.blank_mission_memory).setMaxStackSize(1).setCreativeTab(Tabs.tabfaiz);
	public static Item kaixadriver = new item_rider_driver("kaixadriver",ArmorMaterial.DIAMOND, 4,"kaixa", (Item_form_change) kaixa_mission_memory, faizhead, faiztroso, faizlegs, RiderItems.blank_mission_memory).setMaxStackSize(1).setCreativeTab(Tabs.tabfaiz);
	public static Item deltadriver = new item_rider_driver("deltadriver",ArmorMaterial.DIAMOND, 4,"delta", (Item_form_change) delta_mission_memory, faizhead, faiztroso, faizlegs, RiderItems.blank_mission_memory).setMaxStackSize(1).setCreativeTab(Tabs.tabfaiz);
	public static Item psygadriver = new item_rider_driver("psygadriver",ArmorMaterial.DIAMOND, 4,"psyga", (Item_form_change) psyga_mission_memory, faizhead, faiztroso, faizlegs, RiderItems.blank_mission_memory).setMaxStackSize(1).setCreativeTab(Tabs.tabfaiz);
	public static Item orgadriver = new item_rider_driver("orgadriver",ArmorMaterial.DIAMOND, 4,"orga", (Item_form_change) orga_mission_memory, faizhead, faiztroso, faizlegs, RiderItems.blank_mission_memory).setMaxStackSize(1).setCreativeTab(Tabs.tabfaiz);
	public static Item smartbulke = new item_rider_driver("smartbulke",ArmorMaterial.DIAMOND, 4,"riotrooper", (Item_form_change) faiz_mission_memory, faizhead, faiztroso, faizlegs, RiderItems.blank_mission_memory).setMaxStackSize(1).setCreativeTab(Tabs.tabfaiz);
	

	//blade
public static Item bladecard = new Item_ore("bladecard").setCreativeTab(Tabs.tabblade);

public static Item blade_jack_wings = new Item_ore("blade_jack_wings");
public static Item garren_jack_wings = new Item_ore("garren_jack_wings");

	public static Item blayrouzer = new ItemBaseSword("blayrouzer",ToolMaterial.DIAMOND, RiderItems.bladecard).setMaxStackSize(1).setCreativeTab(Tabs.tabblade);
	public static Item kingrouzer = new ItemBaseSword("kingrouzer",ToolMaterial.DIAMOND, RiderItems.bladecard).setMaxStackSize(1).setCreativeTab(Tabs.tabblade);
	public static Item leanglerouzer = new ItemBaseSword("leanglerouzer",Tabs.leanglerouzer, RiderItems.bladecard).setMaxStackSize(1).setCreativeTab(Tabs.tabblade);
	public static Item garrenrouzer = new Item_gun("garrenrouzer",Tabs.den_dengu, RiderItems.bladecard).setMaxStackSize(1).setCreativeTab(Tabs.tabblade);
	public static Item chalice_arrow = new Item_gun("chalice_arrow",ToolMaterial.DIAMOND, RiderItems.bladecard).setMaxStackSize(1).setCreativeTab(Tabs.tabblade);
	public static Item wild_slasher = new ItemBaseSword("wild_slasher",ToolMaterial.DIAMOND, RiderItems.bladecard).setMaxStackSize(1).setCreativeTab(Tabs.tabblade);
	public static Item wild_chalice_arrow = new Item_gun("wild_chalice_arrow",ToolMaterial.DIAMOND, RiderItems.bladecard).setMaxStackSize(1).setCreativeTab(Tabs.tabblade);

	public static Item rouze_absorber = new Item_ore("rouze_absorber").setCreativeTab(Tabs.tabblade);
	public static Item garren_absorber = new Item_ore("garren_absorber").setCreativeTab(Tabs.tabblade);

	
	public static Item changebeetle = new Item_form_change("changebeetle",item_rider_driver.class,0,"","blade"
			,new PotionEffect(MobEffects.STRENGTH, 5, 1,true,false),new PotionEffect(MobEffects.HASTE, 5, 0,true,false)).setCreativeTab(Tabs.tabblade);

	public static Item fusion_eagle = new Item_form_change("fusion_eagle",item_rider_driver.class,0,"_jack","blade"
			,new PotionEffect(MobEffects.STRENGTH, 5, 2,true,false),new PotionEffect(MobEffects.HASTE, 5, 0,true,false),
			new PotionEffect(MobEffects.SPEED, 5, 1,true,false),new PotionEffect(MobEffects.RESISTANCE, 5, 0,true,false)
			,new PotionEffect(PotionCore.FLY_POTION, 5, 1,true,false)).addWing(blade_jack_wings).addNeedItem(rouze_absorber).setCreativeTab(Tabs.tabblade);

	public static Item absorb_capricorn = new Item_ore("absorb_capricorn").setCreativeTab(Tabs.tabblade);
	
	public static Item evolution_caucasus = new Item_form_change("evolution_caucasus",item_rider_driver.class,0,"_king","blade"
			,new PotionEffect(MobEffects.STRENGTH, 5, 4,true,false),new PotionEffect(MobEffects.SLOWNESS, 5, 0,true,false),new PotionEffect(MobEffects.RESISTANCE, 5, 3,true,false)
			,new PotionEffect(MobEffects.JUMP_BOOST, 5, 2,true,false)).addNeedItem(rouze_absorber).setCreativeTab(Tabs.tabblade);

	
	public static Item change_stag = new Item_form_change("change_stag",item_rider_driver.class,0,"","garren"
			,new PotionEffect(MobEffects.STRENGTH, 5, 0,true,false),new PotionEffect(MobEffects.SPEED, 5, 1,true,false)).setCreativeTab(Tabs.tabblade);

	public static Item fusion_peacock = new Item_form_change("fusion_peacock",item_rider_driver.class,0,"_jack","garren"
			,new PotionEffect(MobEffects.STRENGTH, 5, 1,true,false),new PotionEffect(MobEffects.HASTE, 5, 0,true,false),
			new PotionEffect(MobEffects.SPEED, 5, 2,true,false),new PotionEffect(MobEffects.RESISTANCE, 5, 0,true,false)
			,new PotionEffect(PotionCore.FLY_POTION, 5, 1,true,false)).addNeedItem(garren_absorber).addWing(garren_jack_wings).setCreativeTab(Tabs.tabblade);

	public static Item absorb_serpent = new Item_ore("absorb_serpent").setCreativeTab(Tabs.tabblade);
	
	public static Item evolution_giraffa = new Item_form_change("evolution_giraffa",item_rider_driver.class,0,"_king","garren"
			,new PotionEffect(MobEffects.STRENGTH, 5, 4,true,false),new PotionEffect(MobEffects.SLOWNESS, 5, 0,true,false),new PotionEffect(MobEffects.RESISTANCE, 5, 3,true,false)
			,new PotionEffect(MobEffects.JUMP_BOOST, 5, 2,true,false)).addNeedItem(garren_absorber).setCreativeTab(Tabs.tabblade);

	public static Item change_spider = new Item_form_change("change_spider",item_rider_driver.class,0,"","leangle"
			,new PotionEffect(MobEffects.STRENGTH, 5, 1,true,false),new PotionEffect(MobEffects.HASTE, 5, 1,true,false)).setCreativeTab(Tabs.tabblade);

	public static Item fusion_elephant = new Item_form_change("fusion_elephant",item_rider_driver.class,0,"_jack","leangle"
			,new PotionEffect(MobEffects.STRENGTH, 5, 1,true,false),new PotionEffect(MobEffects.HASTE, 5, 1,true,false),
			new PotionEffect(MobEffects.SPEED, 5, 2,true,false),new PotionEffect(MobEffects.RESISTANCE, 5, 0,true,false)).setCreativeTab(Tabs.tabblade);

	public static Item absorb_tiger = new Item_ore("absorb_tiger").setCreativeTab(Tabs.tabblade);

	public static Item change_mantis = new Item_form_change("change_mantis",item_rider_driver.class,0,"","chalice"
			,new PotionEffect(MobEffects.STRENGTH, 5, 2,true,false),new PotionEffect(MobEffects.SPEED, 5, 1,true,false)
			,new PotionEffect(MobEffects.RESISTANCE, 5, 1,true,false)).setCreativeTab(Tabs.tabblade);

	public static Item evolution_paradoxa = new Item_form_change("evolution_paradoxa",item_rider_driver.class,0,"_wild","chalice"
			,new PotionEffect(MobEffects.STRENGTH, 5, 3,true,false),new PotionEffect(MobEffects.HASTE, 5, 0,true,false),
			new PotionEffect(MobEffects.RESISTANCE, 5, 4,true,false),new PotionEffect(MobEffects.JUMP_BOOST, 5, 0,true,false)).setCreativeTab(Tabs.tabblade);

	public static Item changekerberoslance = new Item_form_change("changekerberoslance",item_rider_driver.class,0,"","lance"
			,new PotionEffect(MobEffects.STRENGTH, 5, 0,true,false),new PotionEffect(MobEffects.SPEED, 5, 1,true,false),new PotionEffect(MobEffects.JUMP_BOOST, 5, 1,true,false),
			new PotionEffect(MobEffects.RESISTANCE, 5, 0,true,false)).setCreativeTab(Tabs.tabblade);

	public static Item changekerberoslarc = new Item_form_change("changekerberoslarc",item_rider_driver.class,0,"","larc"
			,new PotionEffect(MobEffects.STRENGTH, 5, 1,true,false),new PotionEffect(MobEffects.SPEED, 5, 0,true,false)
			,new PotionEffect(MobEffects.JUMP_BOOST, 5, 0,true,false)).setCreativeTab(Tabs.tabblade);

	public static Item changekerberosglaive = new Item_form_change("changekerberosglaive",item_rider_driver.class,0,"","glaive"
			,new PotionEffect(MobEffects.STRENGTH, 5, 0,true,false),new PotionEffect(MobEffects.HASTE, 5, 1,true,false)).setCreativeTab(Tabs.tabblade);

	

	public static Item bladehead = new item_rider_armor("bladehead",item_rider_driver.class,ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.HEAD, bladecard).setMaxStackSize(1).setCreativeTab(Tabs.tabblade);
	public static Item bladetroso = new item_rider_armor("bladetroso",item_rider_driver.class,ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.CHEST, bladecard).setMaxStackSize(1).setCreativeTab(Tabs.tabblade);
	public static Item bladelegs = new item_rider_armor("bladelegs",item_rider_driver.class,ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.LEGS, bladecard).setMaxStackSize(1).setCreativeTab(Tabs.tabblade);

	public static Item bladedriver = new item_rider_driver("bladedriver",ArmorMaterial.DIAMOND, 4,"blade", (Item_form_change) changebeetle, bladehead, bladetroso, bladelegs, RiderItems.bladecard).setMaxStackSize(1).setCreativeTab(Tabs.tabblade);
	public static Item garrendriver = new item_rider_driver("garrendriver",ArmorMaterial.DIAMOND, 4,"garren", (Item_form_change) change_stag, bladehead, bladetroso, bladelegs, RiderItems.bladecard).setMaxStackSize(1).setCreativeTab(Tabs.tabblade);
	public static Item leangle_belt = new item_rider_driver("leangle_belt",ArmorMaterial.DIAMOND, 4,"leangle", (Item_form_change) change_spider, bladehead, bladetroso, bladelegs, RiderItems.bladecard).setMaxStackSize(1).setCreativeTab(Tabs.tabblade);
	public static Item chalicerouzer = new item_rider_driver("chalicerouzer",ArmorMaterial.DIAMOND, 4,"chalice", (Item_form_change) change_mantis, bladehead, bladetroso, bladelegs, RiderItems.bladecard).setMaxStackSize(1).setCreativeTab(Tabs.tabblade);
	public static Item glaive_buckle = new item_rider_driver("glaive_buckle",ArmorMaterial.DIAMOND, 4,"glaive", (Item_form_change) changekerberoslance, bladehead, bladetroso, bladelegs, RiderItems.bladecard).setMaxStackSize(1).setCreativeTab(Tabs.tabblade);
	public static Item larc_buckle = new item_rider_driver("larc_buckle",ArmorMaterial.DIAMOND, 4,"larc", (Item_form_change) changekerberoslarc, bladehead, bladetroso, bladelegs, RiderItems.bladecard).setMaxStackSize(1).setCreativeTab(Tabs.tabblade);
	public static Item lance_buckle = new item_rider_driver("lance_buckle",ArmorMaterial.DIAMOND, 4,"lance", (Item_form_change) changekerberosglaive, bladehead, bladetroso, bladelegs, RiderItems.bladecard).setMaxStackSize(1).setCreativeTab(Tabs.tabblade);

	
	public static Block bladecard_block = new ore_block("bladecard_block",Material.ROCK, bladecard, 2).setHardness(9.9F).setCreativeTab(Tabs.tabblade);
	public static Block bladecard_hellrock = new ore_block("bladecard_hellrock",Material.ROCK, changekerberosglaive, 3).setHardness(9.9f).setCreativeTab(Tabs.tabblade);

	
	//hibiki
	
public static Item oni_ore = new Item_ore("oni_ore").setCreativeTab(Tabs.tabhibiki);
	
	public static Item oni_orehell = new Item_ore("oni_orehell").setCreativeTab(Tabs.tabhibiki);

	
	public static Item ongekibo_rekka = new ItemBaseSword("ongekibo_rekka",Tabs.ongekibo, RiderItems.oni_ore).setMaxStackSize(1).setCreativeTab(Tabs.tabhibiki);

	public static Item unfinished_armed_saber = new Item_ore("unfinished_armed_saber").setCreativeTab(Tabs.tabhibiki);
	public static Item armed_saber = new Itemarmed_saber("armed_saber",Tabs.armedsaber).setMaxStackSize(1).setCreativeTab(Tabs.tabhibiki);
	public static Item ongekibo_yamase = new ItemBaseSword("ongekibo_yamase",Tabs.ongekibo, RiderItems.oni_ore).setMaxStackSize(1).setCreativeTab(Tabs.tabhibiki);
	public static Item ongekibo_rakurai = new ItemBaseSword("ongekibo_rakurai",Tabs.ongekibo, RiderItems.oni_ore).setMaxStackSize(1).setCreativeTab(Tabs.tabhibiki);
	public static Item ongekibo_shakubyoushi = new ItemBaseSword("ongekibo_shakubyoushi",Tabs.ongekibo, RiderItems.oni_ore).setMaxStackSize(1).setCreativeTab(Tabs.tabhibiki);
	public static Item ongekibo_nachiguro = new ItemBaseSword("ongekibo_nachiguro",Tabs.ongekibo, RiderItems.oni_ore).setMaxStackSize(1).setCreativeTab(Tabs.tabhibiki);
	public static Item ongekibo_rokushou = new ItemBaseSword("ongekibo_rokushou",Tabs.ongekibo, RiderItems.oni_ore).setMaxStackSize(1).setCreativeTab(Tabs.tabhibiki);
	public static Item ongekibo_gouriki = new ItemBaseSword("ongekibo_gouriki",Tabs.ongekibo, RiderItems.oni_ore).setMaxStackSize(1).setCreativeTab(Tabs.tabhibiki);
	public static Item ongekibo_ressui = new ItemBaseSword("ongekibo_ressui",Tabs.ongekibo, RiderItems.oni_ore).setMaxStackSize(1).setCreativeTab(Tabs.tabhibiki);

	public static Item ongekikan_reppuu = new Item_gun("ongekikan_reppuu",Tabs.den_dengu, RiderItems.oni_ore).setMaxStackSize(1).setCreativeTab(Tabs.tabhibiki);

	public static Item ongekigen_retsurai = new ItemBaseSword("ongekigen_retsurai",Tabs.den_denaxe, RiderItems.oni_ore).setMaxStackSize(1).setCreativeTab(Tabs.tabhibiki);
	public static Item ongeki_shingen_retsuzan = new ItemBaseSword("ongeki_shingen_retsuzan",Tabs.den_denaxe, RiderItems.oni_ore).setMaxStackSize(1).setCreativeTab(Tabs.tabhibiki);
	public static Item ongekigen_enma = new ItemBaseSword("ongekigen_enma",Tabs.den_denaxe, RiderItems.oni_ore).setMaxStackSize(1).setCreativeTab(Tabs.tabhibiki);
	public static Item ongekigen_togenkyo = new ItemBaseSword("ongekigen_togenkyo",Tabs.den_denaxe, RiderItems.oni_ore).setMaxStackSize(1).setCreativeTab(Tabs.tabhibiki);

	public static Item echo_sword_onsaken = new ItemBaseSword("echo_sword_onsaken",Tabs.den_denso, RiderItems.oni_ore).setMaxStackSize(1).setCreativeTab(Tabs.tabhibiki);
	public static Item ongekikanabo_retto = new ItemBaseSword("ongekikanabo_retto",Tabs.den_denaxe, RiderItems.oni_ore).setMaxStackSize(1).setCreativeTab(Tabs.tabhibiki);
	public static Item ongekisankaku_ressetsu = new ItemBaseSword("ongekisankaku_ressetsu",Tabs.den_denro, RiderItems.oni_ore).setMaxStackSize(1).setCreativeTab(Tabs.tabhibiki);
	public static Item ongeki_shincho_retsuban = new ItemBaseSword("ongeki_shincho_retsuban",Tabs.den_denro, RiderItems.oni_ore).setMaxStackSize(1).setCreativeTab(Tabs.tabhibiki);

	
	public static Item henshin_onsa = new Item_form_change("henshin_onsa",item_rider_driver.class,0,"","hibiki"
			,new PotionEffect(MobEffects.STRENGTH, 5, 0,true,false),new PotionEffect(MobEffects.HASTE, 5, 1,true,false)
			,new PotionEffect(MobEffects.SPEED, 5, 0,true,false)).setCreativeTab(Tabs.tabhibiki);
	
	public static Item henshin_onsa_kurenai = new Item_form_change("henshin_onsa_kurenai",item_rider_driver.class,0,"_kurenai","hibiki"
			,new PotionEffect(MobEffects.STRENGTH, 5, 1,true,false),new PotionEffect(MobEffects.HASTE, 5, 3,true,false),
			new PotionEffect(MobEffects.RESISTANCE, 5, 0,true,false),new PotionEffect(MobEffects.SPEED, 5, 1,true,false)).setCreativeTab(Tabs.tabhibiki);
	
	public static Item henshin_onsa_armed = new Item_form_change("henshin_onsa_armed",item_rider_driver.class,0,"_armed","hibiki"
			,new PotionEffect(MobEffects.STRENGTH, 5, 2,true,false),new PotionEffect(MobEffects.HASTE, 5, 3,true,false),
			new PotionEffect(MobEffects.RESISTANCE, 5, 2,true,false),new PotionEffect(MobEffects.SPEED, 5, 1,true,false)
			,new PotionEffect(MobEffects.REGENERATION, 5, 0,true,false));	

	public static Item henshin_onsa_danki = new Item_form_change("henshin_onsa_danki",item_rider_driver.class,0,"","danki"
			,new PotionEffect(MobEffects.HASTE, 5, 1,true,false),new PotionEffect(MobEffects.SPEED, 5, 1,true,false)).setCreativeTab(Tabs.tabhibiki);
	
	public static Item henshin_onsa_eiki = new Item_form_change("henshin_onsa_eiki",item_rider_driver.class,0,"","eiki"
			,new PotionEffect(MobEffects.WATER_BREATHING, 5, 0,true,false),new PotionEffect(MobEffects.FIRE_RESISTANCE, 5, 0,true,false),
			new PotionEffect(MobEffects.SPEED, 5, 1,true,false)).setCreativeTab(Tabs.tabhibiki);
	
	public static Item henshin_onsa_gouki = new Item_form_change("henshin_onsa_gouki",item_rider_driver.class,0,"","gouki"
			,new PotionEffect(MobEffects.STRENGTH, 5, 2,true,false),new PotionEffect(MobEffects.RESISTANCE, 5, 1,true,false),
			new PotionEffect(MobEffects.FIRE_RESISTANCE, 5, 0,true,false)).setCreativeTab(Tabs.tabhibiki);
	
	public static Item henshin_onsa_kyoki = new Item_form_change("henshin_onsa_kyoki",item_rider_driver.class,0,"","kyoki"
			,new PotionEffect(MobEffects.STRENGTH, 5, 0,true,false),new PotionEffect(MobEffects.HASTE, 5, 1,true,false)
			,new PotionEffect(MobEffects.SPEED, 5, 0,true,false)).setCreativeTab(Tabs.tabhibiki);
	
	public static Item henshin_onsa_kabuki = new Item_form_change("henshin_onsa_kabuki",item_rider_driver.class,0,"","kabuki"
			,new PotionEffect(MobEffects.STRENGTH, 5, 3,true,false),new PotionEffect(MobEffects.HASTE, 5, 1,true,false)
			,new PotionEffect(MobEffects.RESISTANCE, 5, 2,true,false),new PotionEffect(MobEffects.JUMP_BOOST, 5, 1,true,false),
			new PotionEffect(MobEffects.SPEED, 5, 0,true,false),new PotionEffect(MobEffects.FIRE_RESISTANCE, 5, 0,true,false)).setCreativeTab(Tabs.tabhibiki);
	
	public static Item henshin_onsa_touki = new Item_form_change("henshin_onsa_touki",item_rider_driver.class,0,"","touki"
			,new PotionEffect(MobEffects.STRENGTH, 5, 2,true,false),new PotionEffect(MobEffects.RESISTANCE, 5, 2,true,false),
			new PotionEffect(MobEffects.SPEED, 5, 0,true,false),new PotionEffect(MobEffects.HASTE, 5, 0,true,false),
			new PotionEffect(MobEffects.NIGHT_VISION, 5, 0,true,false)).setCreativeTab(Tabs.tabhibiki);
	
	public static Item henshin_onsa_habataki = new Item_form_change("henshin_onsa_habataki",item_rider_driver.class,0,"","habataki"
			,new PotionEffect(MobEffects.STRENGTH, 5, 1,true,false),new PotionEffect(MobEffects.HASTE, 5, 0,true,false)
			,new PotionEffect(MobEffects.RESISTANCE, 5, 0,true,false),new PotionEffect(MobEffects.SPEED, 5, 2,true,false)
			,new PotionEffect(MobEffects.FIRE_RESISTANCE, 5, 0,true,false),new PotionEffect(MobEffects.NIGHT_VISION, 5, 0,true,false)).setCreativeTab(Tabs.tabhibiki);
	
	public static Item henshin_onsa_kirameki = new Item_form_change("henshin_onsa_kirameki",item_rider_driver.class,0,"","kirameki"
			,new PotionEffect(MobEffects.STRENGTH, 5, 1,true,false),new PotionEffect(MobEffects.RESISTANCE, 5, 1,true,false)
			,new PotionEffect(MobEffects.SPEED, 5, 1,true,false),new PotionEffect(MobEffects.HASTE, 5, 2,true,false)
			,new PotionEffect(MobEffects.NIGHT_VISION, 5, 0,true,false)).setCreativeTab(Tabs.tabhibiki);
	
	public static Item henshin_onsa_nishiki = new Item_form_change("henshin_onsa_nishiki",item_rider_driver.class,0,"","nishiki"
			,new PotionEffect(MobEffects.STRENGTH, 5, 0,true,false),new PotionEffect(MobEffects.HASTE, 5, 3,true,false)
			,new PotionEffect(MobEffects.SPEED, 5, 0,true,false),new PotionEffect(MobEffects.FIRE_RESISTANCE, 5, 0,true,false)
			,new PotionEffect(MobEffects.RESISTANCE, 5, 1,true,false),new PotionEffect(MobEffects.WATER_BREATHING, 5, 0,true,false)).setCreativeTab(Tabs.tabhibiki);

	
	public static Item henshin_onibue_ibuki = new Item_form_change("henshin_onibue_ibuki",item_rider_driver.class,0,"","danki"
			,new PotionEffect(MobEffects.STRENGTH, 5, 1,true,false),new PotionEffect(MobEffects.SPEED, 5, 1,true,false)
			,new PotionEffect(MobEffects.HASTE, 5, 0,true,false)).setCreativeTab(Tabs.tabhibiki);
	
	public static Item henshin_onibue_toki = new Item_form_change("henshin_onibue_toki",item_rider_driver.class,0,"","danki"
			,new PotionEffect(MobEffects.STRENGTH, 5, 1,true,false),new PotionEffect(MobEffects.SPEED, 5, 2,true,false),
			new PotionEffect(MobEffects.JUMP_BOOST, 5, 1,true,false)).setCreativeTab(Tabs.tabhibiki);
	
	public static Item henshin_onibue_shouki = new Item_form_change("henshin_onibue_shouki",item_rider_driver.class,0,"","danki"
			,new PotionEffect(MobEffects.HASTE, 5, 2,true,false),new PotionEffect(MobEffects.NIGHT_VISION, 5, 0,true,false),
			new PotionEffect(MobEffects.STRENGTH, 5, 0,true,false),new PotionEffect(MobEffects.SPEED, 5, 0,true,false)).setCreativeTab(Tabs.tabhibiki);
	
	public static Item henshin_onibue_amaki = new Item_form_change("henshin_onibue_amaki",item_rider_driver.class,0,"","danki"
			,new PotionEffect(MobEffects.STRENGTH, 5, 1,true,false),new PotionEffect(MobEffects.SPEED, 5, 1,true,false),
			new PotionEffect(MobEffects.HASTE, 5, 1,true,false),new PotionEffect(MobEffects.WATER_BREATHING, 5, 0,true,false)).setCreativeTab(Tabs.tabhibiki);
	
	public static Item henshin_onibue_fubuki = new Item_form_change("henshin_onibue_fubuki",item_rider_driver.class,0,"","danki"
			,new PotionEffect(MobEffects.STRENGTH, 5, 1,true,false),new PotionEffect(MobEffects.HASTE, 5, 0,true,false)
			,new PotionEffect(MobEffects.RESISTANCE, 5, 0,true,false),new PotionEffect(MobEffects.SPEED, 5, 2,true,false)
			,new PotionEffect(MobEffects.FIRE_RESISTANCE, 5, 0,true,false),new PotionEffect(MobEffects.NIGHT_VISION, 5, 0,true,false)).setCreativeTab(Tabs.tabhibiki);
	

	public static Item henshin_kigen_todoroki = new Item_form_change("henshin_kigen_todoroki",item_rider_driver.class,0,"","todoroki"
			,new PotionEffect(MobEffects.STRENGTH, 5, 2,true,false),new PotionEffect(MobEffects.HASTE, 5, 1,true,false)).setCreativeTab(Tabs.tabhibiki);
	
	public static Item henshin_kigen_zanki = new Item_form_change("henshin_kigen_zanki",item_rider_driver.class,0,"","zanki"
			,new PotionEffect(MobEffects.STRENGTH, 5, 1,true,false),new PotionEffect(MobEffects.SPEED, 5, 0,true,false),
			new PotionEffect(MobEffects.RESISTANCE, 5, 1,true,false)).setCreativeTab(Tabs.tabhibiki);
	
	public static Item henshin_kigen_shuki = new Item_form_change("henshin_kigen_shuki",item_rider_driver.class,0,"","shuki"
			,new PotionEffect(MobEffects.STRENGTH, 5, 1,true,false),new PotionEffect(MobEffects.SPEED, 5, 1,true,false)
			,new PotionEffect(MobEffects.RESISTANCE, 5, 0,true,false),new PotionEffect(MobEffects.FIRE_RESISTANCE, 5, 0,true,false),
			new PotionEffect(MobEffects.REGENERATION, 5, 0,true,false)).setCreativeTab(Tabs.tabhibiki);
	
	public static Item henshin_kigen_banki = new Item_form_change("henshin_kigen_banki",item_rider_driver.class,0,"","banki"
			,new PotionEffect(MobEffects.NIGHT_VISION, 5, 0,true,false),new PotionEffect(MobEffects.STRENGTH, 5, 0,true,false)
			,new PotionEffect(MobEffects.HASTE, 5, 1,true,false),new PotionEffect(MobEffects.SPEED, 5, 1,true,false)
			,new PotionEffect(MobEffects.RESISTANCE, 5, 1,true,false),new PotionEffect(MobEffects.FIRE_RESISTANCE, 5, 0,true,false)).setCreativeTab(Tabs.tabhibiki);
	
	public static Item henshin_kigen_sabaki = new Item_form_change("henshin_kigen_sabaki",item_rider_driver.class,0,"","sabaki"
			,new PotionEffect(MobEffects.WEAKNESS, 5, 0,true,false),new PotionEffect(MobEffects.RESISTANCE, 5, 1,true,false)
			,new PotionEffect(MobEffects.SPEED, 5, 0,true,false)).setCreativeTab(Tabs.tabhibiki);

	
	public static Item hibikihead = new item_rider_armor("hibikihead",item_rider_driver.class,ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.HEAD, oni_ore).setMaxStackSize(1).setCreativeTab(Tabs.tabhibiki);
	public static Item hibikitroso = new item_rider_armor("hibikitroso",item_rider_driver.class,ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.CHEST, oni_ore).setMaxStackSize(1).setCreativeTab(Tabs.tabhibiki);
	public static Item hibikilegs = new item_rider_armor("hibikilegs",item_rider_driver.class,ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.LEGS, oni_ore).setMaxStackSize(1).setCreativeTab(Tabs.tabhibiki);

	public static Item hibikidriver = new item_rider_driver("hibikidriver",ArmorMaterial.DIAMOND, 4,"hibiki", (Item_form_change) henshin_onsa, hibikihead, hibikitroso, hibikilegs, RiderItems.oni_ore).setMaxStackSize(1).setCreativeTab(Tabs.tabhibiki);
	public static Item ibukidriver = new item_rider_driver("ibukidriver",ArmorMaterial.DIAMOND, 4,"ibuki", (Item_form_change) henshin_onibue_ibuki, hibikihead, hibikitroso, hibikilegs, RiderItems.oni_ore).setMaxStackSize(1).setCreativeTab(Tabs.tabhibiki);
	public static Item todorokidriver = new item_rider_driver("todorokidriver",ArmorMaterial.DIAMOND, 4,"todoroki", (Item_form_change) henshin_kigen_todoroki, hibikihead, hibikitroso, hibikilegs, RiderItems.oni_ore).setMaxStackSize(1).setCreativeTab(Tabs.tabhibiki);
	public static Item zankidriver = new item_rider_driver("zankidriver",ArmorMaterial.DIAMOND, 4,"zanki", (Item_form_change) henshin_kigen_zanki, hibikihead, hibikitroso, hibikilegs, RiderItems.oni_ore).setMaxStackSize(1).setCreativeTab(Tabs.tabhibiki);
	public static Item eikidriver = new item_rider_driver("eikidriver",ArmorMaterial.DIAMOND, 4,"eiki", (Item_form_change) henshin_onsa_eiki, hibikihead, hibikitroso, hibikilegs, RiderItems.oni_ore).setMaxStackSize(1).setCreativeTab(Tabs.tabhibiki);
	public static Item dankidriver = new item_rider_driver("dankidriver",ArmorMaterial.DIAMOND, 4,"danki", (Item_form_change) henshin_onsa_danki, hibikihead, hibikitroso, hibikilegs, RiderItems.oni_ore).setMaxStackSize(1).setCreativeTab(Tabs.tabhibiki);
	public static Item sabakidriver = new item_rider_driver("sabakidriver",ArmorMaterial.DIAMOND, 4,"sabaki", (Item_form_change) henshin_kigen_sabaki, hibikihead, hibikitroso, hibikilegs, RiderItems.oni_ore).setMaxStackSize(1).setCreativeTab(Tabs.tabhibiki);
	public static Item shukidriver = new item_rider_driver("shukidriver",ArmorMaterial.DIAMOND, 4,"shuki", (Item_form_change) henshin_kigen_shuki, hibikihead, hibikitroso, hibikilegs, RiderItems.oni_ore).setMaxStackSize(1).setCreativeTab(Tabs.tabhibiki);
	public static Item goukidriver = new item_rider_driver("goukidriver",ArmorMaterial.DIAMOND, 4,"gouki", (Item_form_change) henshin_onsa_gouki, hibikihead, hibikitroso, hibikilegs, RiderItems.oni_ore).setMaxStackSize(1).setCreativeTab(Tabs.tabhibiki);
	public static Item tokidriver = new item_rider_driver("tokidriver",ArmorMaterial.DIAMOND, 4,"toki", (Item_form_change) henshin_onibue_toki, hibikihead, hibikitroso, hibikilegs, RiderItems.oni_ore).setMaxStackSize(1).setCreativeTab(Tabs.tabhibiki);
	public static Item shoukidriver = new item_rider_driver("shoukidriver",ArmorMaterial.DIAMOND, 4,"shouki", (Item_form_change) henshin_onibue_shouki, hibikihead, hibikitroso, hibikilegs, RiderItems.oni_ore).setMaxStackSize(1).setCreativeTab(Tabs.tabhibiki);
	public static Item bankidriver = new item_rider_driver("bankidriver",ArmorMaterial.DIAMOND, 4,"banki", (Item_form_change) henshin_kigen_banki, hibikihead, hibikitroso, hibikilegs, RiderItems.oni_ore).setMaxStackSize(1).setCreativeTab(Tabs.tabhibiki);
	public static Item amakidriver = new item_rider_driver("amakidriver",ArmorMaterial.DIAMOND, 4,"amaki", (Item_form_change) henshin_onibue_amaki, hibikihead, hibikitroso, hibikilegs, RiderItems.oni_ore).setMaxStackSize(1).setCreativeTab(Tabs.tabhibiki);
	public static Item kyosukedriver = new item_rider_driver("kyosukedriver",ArmorMaterial.DIAMOND, 4,"kyosuke", (Item_form_change) henshin_onsa_kyoki, hibikihead, hibikitroso, hibikilegs, RiderItems.oni_ore).setMaxStackSize(1).setCreativeTab(Tabs.tabhibiki);
	public static Item kabukidriver = new item_rider_driver("kabukidriver",ArmorMaterial.DIAMOND, 4,"kabuki", (Item_form_change) henshin_onsa_kabuki, hibikihead, hibikitroso, hibikilegs, RiderItems.oni_ore).setMaxStackSize(1).setCreativeTab(Tabs.tabhibiki);
	public static Item toukidriver = new item_rider_driver("toukidriver",ArmorMaterial.DIAMOND, 4,"touki", (Item_form_change) henshin_onsa_touki, hibikihead, hibikitroso, hibikilegs, RiderItems.oni_ore).setMaxStackSize(1).setCreativeTab(Tabs.tabhibiki);
	public static Item kiramekidriver = new item_rider_driver("kiramekidriver",ArmorMaterial.DIAMOND, 4,"kirameki", (Item_form_change) henshin_onsa_kirameki, hibikihead, hibikitroso, hibikilegs, RiderItems.oni_ore).setMaxStackSize(1).setCreativeTab(Tabs.tabhibiki);
	public static Item nishikidriver = new item_rider_driver("nishikidriver",ArmorMaterial.DIAMOND, 4,"nishiki", (Item_form_change) henshin_onsa_nishiki, hibikihead, hibikitroso, hibikilegs, RiderItems.oni_ore).setMaxStackSize(1).setCreativeTab(Tabs.tabhibiki);
	public static Item habatakidriver = new item_rider_driver("habatakidriver",ArmorMaterial.DIAMOND, 4,"habataki", (Item_form_change) henshin_onsa_habataki, hibikihead, hibikitroso, hibikilegs, RiderItems.oni_ore).setMaxStackSize(1).setCreativeTab(Tabs.tabhibiki);
	public static Item fubukidriver = new item_rider_driver("fubukidriver",ArmorMaterial.DIAMOND, 4,"fubuki", (Item_form_change) henshin_onibue_fubuki, hibikihead, hibikitroso, hibikilegs, RiderItems.oni_ore).setMaxStackSize(1).setCreativeTab(Tabs.tabhibiki);

	public static Block oni_ore_block = new ore_block("oni_ore_block",Material.ROCK, oni_ore, 2).setHardness(9.9F).setCreativeTab(Tabs.tabhibiki);
	public static Block oni_ore_hellrock = new ore_block("oni_ore_hellrock",Material.ROCK, oni_orehell, 3).setHardness(9.9F).setCreativeTab(Tabs.tabhibiki);

	
	//kabuto
	
	public static Item mini_zecter = new Item_ore("mini_zecter").setCreativeTab(Tabs.tabkabuto);
	public static Item unfinished_kabutick_zecter = new Item_ore("unfinished_kabutick_zecter").setCreativeTab(Tabs.tabkabuto);
	
	
	public static Item kabuto_kunai = new Item_sword_gun("kabuto_kunai",Tabs.den_denaxe, RiderItems.mini_zecter).setMaxStackSize(1).setCreativeTab(Tabs.tabkabuto);
	public static Item kabuto_kunai_kunai = new ItemBaseSword("kabuto_kunai_kunai",Tabs.den_denso, RiderItems.mini_zecter).setMaxStackSize(1).setCreativeTab(Tabs.tabkabuto);
	public static Item zect_mizer = new Item_fireball_gun("zect_mizer",ToolMaterial.WOOD, RiderItems.mini_zecter).setMaxStackSize(1).setCreativeTab(Tabs.tabkabuto);
	public static Item perfect_zecter = new ItemBaseSword("perfect_zecter",Tabs.denkamen_sword, RiderItems.mini_zecter).setMaxStackSize(1).setCreativeTab(Tabs.tabkabuto);

	public static Item drake_grip = new Item_gun("drake_grip",Tabs.den_dengu, RiderItems.mini_zecter).setMaxStackSize(1).setCreativeTab(Tabs.tabkabuto);

	public static Item sasword_yaiver = new ItemBaseSword("sasword_yaiver",Tabs.den_denso, RiderItems.mini_zecter).setMaxStackSize(1).setCreativeTab(Tabs.tabkabuto);

	public static Item gatack_double_calibur = new ItemBaseSword("gatack_double_calibur",Tabs.den_denso, RiderItems.mini_zecter).setMaxStackSize(1).setCreativeTab(Tabs.tabkabuto);
	public static Item gatack_double_calibur_minus = new ItemBaseSword("gatack_double_calibur_minus",Tabs.den_denso, RiderItems.mini_zecter).setMaxStackSize(1).setCreativeTab(Tabs.tabkabuto);
	public static Item gatack_double_calibur_twin = new ItemBaseSword("gatack_double_calibur_twin",Tabs.den_denaxe, RiderItems.mini_zecter).setMaxStackSize(1).setCreativeTab(Tabs.tabkabuto);

	public static Item zect_kunai = new Item_sword_gun("zect_kunai",Tabs.den_denaxe, RiderItems.mini_zecter).setMaxStackSize(1).setCreativeTab(Tabs.tabkabuto);
	public static Item zect_kunai_kunai = new ItemBaseSword("zect_kunai_kunai",Tabs.den_denso, RiderItems.mini_zecter).setMaxStackSize(1).setCreativeTab(Tabs.tabkabuto);

	public static Item machinegun_blade = new Item_sword_gun("machinegun_blade",Tabs.den_denaxe, RiderItems.mini_zecter).setMaxStackSize(1).setCreativeTab(Tabs.tabkabuto);
	
	public static Item kabuto_zecter_cast = new Item_form_change("kabuto_zecter_cast",item_rider_driver.class,1,"_mask","kabuto"
			,new PotionEffect(MobEffects.RESISTANCE, 5, 1,true,false),new PotionEffect(MobEffects.SLOWNESS, 5, 0,true,false));

	public static Item kabuto_zecter = new Item_zecter(kabuto_zecter_cast,"kabuto_zecter",item_rider_driver.class,0,"","kabuto"
			,new PotionEffect(MobEffects.SPEED, 5, 3,true,false),new PotionEffect(MobEffects.HASTE, 5, 3,true,false)).setCreativeTab(Tabs.tabkabuto);


	public static Item hyper_zecter = new Item_hyper_zecter("hyper_zecter").setCreativeTab(Tabs.tabkabuto);
	
	public static Item kabuto_hyper_zecter = new Item_form_change("kabuto_hyper_zecter",item_rider_driver.class,0,"_hyper","kabuto"
			,new PotionEffect(MobEffects.HASTE, 5, 3,true,false),new PotionEffect(MobEffects.SPEED, 5, 7,true,false),
			new PotionEffect(MobEffects.STRENGTH, 5, 4,true,false),new PotionEffect(MobEffects.RESISTANCE, 5, 4,true,false)
			,new PotionEffect(MobEffects.JUMP_BOOST, 5, 4,true,false),new PotionEffect(MobEffects.NIGHT_VISION, 500, 0,true,false));
 
	public static Item thebee_zecter_cast = new Item_form_change("thebee_zecter_cast",item_rider_driver.class,0,"_mask","thebee"
			,new PotionEffect(MobEffects.RESISTANCE, 5, 1,true,false),new PotionEffect(MobEffects.SLOWNESS, 5, 0,true,false));

	public static Item thebee_zecter = new Item_zecter(thebee_zecter_cast,"thebee_zecter",item_rider_driver.class,0,"","thebee"
			,new PotionEffect(MobEffects.SPEED, 5, 3,true,false),new PotionEffect(MobEffects.HASTE, 5, 3,true,false),
					new PotionEffect(MobEffects.JUMP_BOOST, 5, 4,true,false)).setCreativeTab(Tabs.tabkabuto);

	public static Item drake_zecter_cast = new Item_form_change("drake_zecter_cast",item_rider_driver.class,0,"_mask","drake"
			,new PotionEffect(MobEffects.RESISTANCE, 5, 1,true,false),new PotionEffect(MobEffects.SLOWNESS, 5, 0,true,false));

	public static Item drake_zecter = new Item_zecter(drake_zecter_cast,"drake_zecter",item_rider_driver.class,0,"","drake"
			,new PotionEffect(MobEffects.SPEED, 5, 3,true,false),new PotionEffect(MobEffects.HASTE, 5, 3,true,false)
			,new PotionEffect(MobEffects.NIGHT_VISION, 5, 0,true,false)).setCreativeTab(Tabs.tabkabuto);


	public static Item sasword_zecter_cast = new Item_form_change("sasword_zecter_cast",item_rider_driver.class,0,"_mask","sasword"
			,new PotionEffect(MobEffects.RESISTANCE, 5, 1,true,false),new PotionEffect(MobEffects.SLOWNESS, 5, 0,true,false));

	public static Item sasword_zecter = new Item_zecter(sasword_zecter_cast,"sasword_zecter",item_rider_driver.class,0,"","sasword"
			,new PotionEffect(MobEffects.SPEED, 5, 3,true,false),new PotionEffect(MobEffects.HASTE, 5, 3,true,false),
			new PotionEffect(MobEffects.STRENGTH, 5, 2,true,false)).setCreativeTab(Tabs.tabkabuto);

	public static Item gatack_zecter_cast = new Item_form_change("gatack_zecter_cast",item_rider_driver.class,1,"_mask","gatack"
			,new PotionEffect(MobEffects.RESISTANCE, 5, 1,true,false),new PotionEffect(MobEffects.SLOWNESS, 5, 0,true,false));

	public static Item gatack_zecter = new Item_zecter(gatack_zecter_cast,"gatack_zecter",item_rider_driver.class,0,"","gatack"
			,new PotionEffect(MobEffects.SPEED, 5, 3,true,false),new PotionEffect(MobEffects.HASTE, 5, 3,true,false)
			,new PotionEffect(MobEffects.STRENGTH, 5, 1,true,false)).setCreativeTab(Tabs.tabkabuto);

	public static Item gatack_hyper_zecter = new Item_form_change("gatack_hyper_zecter",item_rider_driver.class,0,"_hyper","gatack"
			,new PotionEffect(MobEffects.HASTE, 5, 3,true,false),new PotionEffect(MobEffects.SPEED, 5, 7,true,false),
			new PotionEffect(MobEffects.STRENGTH, 5, 4,true,false),new PotionEffect(MobEffects.RESISTANCE, 5, 4,true,false)
			,new PotionEffect(MobEffects.JUMP_BOOST, 5, 4,true,false),new PotionEffect(MobEffects.NIGHT_VISION, 500, 0,true,false));
 
	public static Item kickhopper_zecter = new Item_form_change("kickhopper_zecter",item_rider_driver.class,0,"","kickhopper"
			,new PotionEffect(MobEffects.RESISTANCE, 5,2,true,false),new PotionEffect(MobEffects.SPEED, 5, 3,true,false),
			new PotionEffect(MobEffects.STRENGTH, 5, 3,true,false),new PotionEffect(MobEffects.HASTE, 5, 4,true,false),
			new PotionEffect(MobEffects.JUMP_BOOST, 5, 7,true,false)).setCreativeTab(Tabs.tabkabuto);

	public static Item punchhopper_zecter = new Item_form_change("punchhopper_zecter",item_rider_driver.class,0,"","punchhopper"
			,new PotionEffect(MobEffects.RESISTANCE, 5,2,true,false),new PotionEffect(MobEffects.SPEED, 5, 3,true,false),
			new PotionEffect(MobEffects.STRENGTH, 5, 4,true,false),new PotionEffect(MobEffects.HASTE, 5, 4,true,false),
			new PotionEffect(MobEffects.JUMP_BOOST, 5, 4,true,false)).setCreativeTab(Tabs.tabkabuto);

	
	public static Item dark_kabuto_zecter_cast = new Item_form_change("dark_kabuto_zecter_cast",item_rider_driver.class,1,"_mask","dark_kabuto"
			,new PotionEffect(MobEffects.RESISTANCE, 5, 1,true,false),new PotionEffect(MobEffects.SLOWNESS, 5, 0,true,false));

	public static Item dark_kabuto_zecter = new Item_zecter(dark_kabuto_zecter_cast,"dark_kabuto_zecter",item_rider_driver.class,0,"","dark_kabuto"
			,new PotionEffect(MobEffects.SPEED, 5, 3,true,false),new PotionEffect(MobEffects.HASTE, 5, 3,true,false)).setCreativeTab(Tabs.tabkabuto);

	public static Item dark_hyper_zecter = new Item_form_change("dark_hyper_zecter",item_rider_driver.class,0,"_hyper","dark_kabuto"
			,new PotionEffect(MobEffects.HASTE, 5, 3,true,false),new PotionEffect(MobEffects.SPEED, 5, 7,true,false),
			new PotionEffect(MobEffects.STRENGTH, 5, 4,true,false),new PotionEffect(MobEffects.RESISTANCE, 5, 4,true,false)
			,new PotionEffect(MobEffects.JUMP_BOOST, 5, 4,true,false),new PotionEffect(MobEffects.NIGHT_VISION, 500, 0,true,false));
 
	
	public static Item caucasus_zecter_cast = new Item_form_change("caucasus_zecter_cast",item_rider_driver.class,0,"_mask","caucasus"
			,new PotionEffect(MobEffects.RESISTANCE, 5, 1,true,false),new PotionEffect(MobEffects.SLOWNESS, 5, 0,true,false));

	public static Item caucasus_zecter = new Item_zecter(caucasus_zecter_cast,"caucasus_zecter",item_rider_driver.class,0,"","caucasus"
			,new PotionEffect(MobEffects.HASTE, 5, 3,true,false),new PotionEffect(MobEffects.SPEED, 5, 7,true,false)
			,new PotionEffect(MobEffects.STRENGTH, 5, 4,true,false),new PotionEffect(MobEffects.RESISTANCE, 5, 4,true,false)
			,new PotionEffect(MobEffects.JUMP_BOOST, 5, 4,true,false),new PotionEffect(MobEffects.NIGHT_VISION, 500, 0,true,false)).setCreativeTab(Tabs.tabkabuto);


	public static Item hercus_zecter_cast = new Item_form_change("hercus_zecter_cast",item_rider_driver.class,0,"_mask","hercus"
			,new PotionEffect(MobEffects.RESISTANCE, 5, 1,true,false),new PotionEffect(MobEffects.SLOWNESS, 5, 0,true,false));

	public static Item hercus_zecter = new Item_zecter(hercus_zecter_cast,"hercus_zecter",item_rider_driver.class,0,"","hercus"
			,new PotionEffect(MobEffects.STRENGTH, 5, 1,true,false),new PotionEffect(MobEffects.SPEED, 5, 3,true,false),
			new PotionEffect(MobEffects.HASTE, 5, 3,true,false)).setCreativeTab(Tabs.tabkabuto);

	public static Item ketaros_zecter_cast = new Item_form_change("ketaros_zecter_cast",item_rider_driver.class,0,"_mask","ketaros"
			,new PotionEffect(MobEffects.RESISTANCE, 5, 1,true,false),new PotionEffect(MobEffects.SLOWNESS, 5, 0,true,false));

	public static Item ketaros_zecter = new Item_zecter(ketaros_zecter_cast,"ketaros_zecter",item_rider_driver.class,0,"","ketaros"
			,new PotionEffect(MobEffects.STRENGTH, 5, 1,true,false),new PotionEffect(MobEffects.SPEED, 5, 3,true,false),
			new PotionEffect(MobEffects.HASTE, 5, 3,true,false)).setCreativeTab(Tabs.tabkabuto);

	public static Item lady_zecter = new Item_form_change("lady_zecter",item_rider_driver.class,0,"","lady"
			,new PotionEffect(MobEffects.STRENGTH, 5, 1,true,false),new PotionEffect(MobEffects.SPEED, 5, 3,true,false),
			new PotionEffect(MobEffects.HASTE, 5, 3,true,false)).setCreativeTab(Tabs.tabkabuto);

	
	public static Item perfectthebee_zecter = new Item_ore("perfectthebee_zecter").setCreativeTab(Tabs.tabkabuto);
	public static Item perfectdrake_zecter = new Item_ore("perfectdrake_zecter").setCreativeTab(Tabs.tabkabuto);
	public static Item perfectsasword_zecter = new Item_ore("perfectsasword_zecter").setCreativeTab(Tabs.tabkabuto);


	public static Item kabutohead = new item_rider_armor("kabutohead",item_rider_driver.class,ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.HEAD, mini_zecter).setMaxStackSize(1).setCreativeTab(Tabs.tabkabuto);
	public static Item kabutotroso = new item_rider_armor("kabutotroso",item_rider_driver.class,ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.CHEST, mini_zecter).setMaxStackSize(1).setCreativeTab(Tabs.tabkabuto);
	public static Item kabutolegs = new item_rider_armor("kabutolegs",item_rider_driver.class,ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.LEGS, mini_zecter).setMaxStackSize(1).setCreativeTab(Tabs.tabkabuto);


	public static Item kabuto_rider_belt = new item_rider_driver("kabuto_rider_belt",ArmorMaterial.DIAMOND, 4,"kabuto", (Item_form_change) kabuto_zecter, kabutohead, kabutotroso, kabutolegs, RiderItems.mini_zecter).setMaxStackSize(1).setCreativeTab(Tabs.tabkabuto);
	public static Item gatack_rider_belt = new item_rider_driver("gatack_rider_belt",ArmorMaterial.DIAMOND, 4,"gatack", (Item_form_change) gatack_zecter, kabutohead, kabutotroso, kabutolegs, RiderItems.mini_zecter).setMaxStackSize(1).setCreativeTab(Tabs.tabkabuto);
	public static Item thebee_rider_belt = new item_rider_driver("thebee_rider_belt",ArmorMaterial.DIAMOND, 4,"thebee", (Item_form_change) thebee_zecter, kabutohead, kabutotroso, kabutolegs, RiderItems.mini_zecter).setMaxStackSize(1).setCreativeTab(Tabs.tabkabuto);
	public static Item drake_rider_belt = new item_rider_driver("drake_rider_belt",ArmorMaterial.DIAMOND, 4,"drake", (Item_form_change) drake_zecter, kabutohead, kabutotroso, kabutolegs, RiderItems.mini_zecter).setMaxStackSize(1).setCreativeTab(Tabs.tabkabuto);
	public static Item sasword_rider_belt = new item_rider_driver("sasword_rider_belt",ArmorMaterial.DIAMOND, 4,"sasword", (Item_form_change) sasword_zecter, kabutohead, kabutotroso, kabutolegs, RiderItems.mini_zecter).setMaxStackSize(1).setCreativeTab(Tabs.tabkabuto);
	public static Item kickhopper_rider_belt = new item_rider_driver("kickhopper_rider_belt",ArmorMaterial.DIAMOND, 4,"kickhopper", (Item_form_change) kickhopper_zecter, kabutohead, kabutotroso, kabutolegs, RiderItems.mini_zecter).setMaxStackSize(1).setCreativeTab(Tabs.tabkabuto);
	public static Item puchhopper_rider_belt = new item_rider_driver("puchhopper_rider_belt",ArmorMaterial.DIAMOND, 4,"puchhopper", (Item_form_change) punchhopper_zecter, kabutohead, kabutotroso, kabutolegs, RiderItems.mini_zecter).setMaxStackSize(1).setCreativeTab(Tabs.tabkabuto);
	public static Item dark_kabuto_rider_belt = new item_rider_driver("dark_kabuto_rider_belt",ArmorMaterial.DIAMOND, 4,"dark_kabuto", (Item_form_change) dark_kabuto_zecter, kabutohead, kabutotroso, kabutolegs, RiderItems.mini_zecter).setMaxStackSize(1).setCreativeTab(Tabs.tabkabuto);

	public static Item caucasus_rider_belt = new item_rider_driver("caucasus_rider_belt",ArmorMaterial.DIAMOND, 4,"caucasus", (Item_form_change) caucasus_zecter, kabutohead, kabutotroso, kabutolegs, RiderItems.mini_zecter).setMaxStackSize(1).setCreativeTab(Tabs.tabkabuto);

	public static Item hercus_rider_belt = new item_rider_driver("hercus_rider_belt",ArmorMaterial.DIAMOND, 4,"hercus", (Item_form_change) hercus_zecter, kabutohead, kabutotroso, kabutolegs, RiderItems.mini_zecter).setMaxStackSize(1).setCreativeTab(Tabs.tabkabuto);

	public static Item ketaros_rider_belt = new item_rider_driver("ketaros_rider_belt",ArmorMaterial.DIAMOND, 4,"ketaros", (Item_form_change) ketaros_zecter, kabutohead, kabutotroso, kabutolegs, RiderItems.mini_zecter).setMaxStackSize(1).setCreativeTab(Tabs.tabkabuto);

	public static Item lady_rider_belt = new item_rider_driver("lady_rider_belt",ArmorMaterial.DIAMOND, 4,"lady", (Item_form_change) lady_zecter, kabutohead, kabutotroso, kabutolegs, RiderItems.mini_zecter).setMaxStackSize(1).setCreativeTab(Tabs.tabkabuto);

	public static Item zectrooper_belt = new item_rider_driver("zectrooper_belt",ArmorMaterial.DIAMOND, 4,"zectrooper", (Item_form_change) faiz_mission_memory, kabutohead, kabutotroso, kabutolegs, RiderItems.mini_zecter).setMaxStackSize(1).setCreativeTab(Tabs.tabkabuto);
	public static Item shadow_trooper_belt = new item_rider_driver("shadow_trooper_belt",ArmorMaterial.DIAMOND, 4,"shadow_trooper", (Item_form_change) faiz_mission_memory, kabutohead, kabutotroso, kabutolegs, RiderItems.mini_zecter).setMaxStackSize(1).setCreativeTab(Tabs.tabkabuto);
	public static Item brightrooper_belt = new item_rider_driver("brightrooper_belt",ArmorMaterial.DIAMOND, 4,"brightrooper", (Item_form_change) faiz_mission_memory, kabutohead, kabutotroso, kabutolegs, RiderItems.mini_zecter).setMaxStackSize(1).setCreativeTab(Tabs.tabkabuto);
	public static Item neotrooper_belt = new item_rider_driver("neotrooper_belt",ArmorMaterial.DIAMOND, 4,"neotrooper", (Item_form_change) faiz_mission_memory, kabutohead, kabutotroso, kabutolegs, RiderItems.mini_zecter).setMaxStackSize(1).setCreativeTab(Tabs.tabkabuto);
	
	public static Item clock_up_pad = new Item_clock_up_pad("clock_up_pad").setCreativeTab(Tabs.tabkabuto);

	public static Block blue_rose = new BlockHelheimPlant("blue_rose").setCreativeTab(Tabs.tabmisc);
	
	//den_o
	
	public static Item imaginsand = new Item_ore("imaginsand").setCreativeTab(Tabs.tabden_o);
	public static Block imaginsandblock = new ore_block("imaginsandblock",Material.ROCK, imaginsand, 2).setHardness(9.9F).setCreativeTab(Tabs.tabden_o);
	
	public static Item den_denso = new ItemBaseSword("den_denso",Tabs.den_denso, RiderItems.imaginsand).setMaxStackSize(1).setCreativeTab(Tabs.tabden_o);
	public static Item den_denro = new ItemBaseSword("den_denro",Tabs.den_denro, RiderItems.imaginsand).setMaxStackSize(1).setCreativeTab(Tabs.tabden_o);
	public static Item den_denaxe = new ItemBaseSword("den_denaxe",Tabs.den_denaxe, RiderItems.imaginsand).setMaxStackSize(1).setCreativeTab(Tabs.tabden_o);
	public static Item den_dengu = new Item_gun("den_dengu",Tabs.den_dengu, RiderItems.imaginsand).setMaxStackSize(1).setCreativeTab(Tabs.tabden_o);
	public static Item denkamen_sword = new Itemdenkamen_sword("denkamen_sword",Tabs.denkamen_sword).setMaxStackSize(1).setCreativeTab(Tabs.tabden_o);
	public static Item den_denhandaxe = new ItemBaseSword("den_denhandaxe",Tabs.den_denhandaxe, RiderItems.imaginsand).setMaxStackSize(1).setCreativeTab(Tabs.tabden_o);
	public static Item den_denboomerang = new ItemBaseSword("den_denboomerang",Tabs.den_denboomerang, RiderItems.imaginsand).setMaxStackSize(1).setCreativeTab(Tabs.tabden_o);
	public static Item den_denhijack = new ItemBaseSword("den_denhijack",Tabs.den_denhijack, RiderItems.imaginsand).setMaxStackSize(1).setCreativeTab(Tabs.tabden_o);
	public static Item momotaken = new ItemBaseSword("momotaken",Tabs.momotaken, RiderItems.imaginsand).setMaxStackSize(1).setCreativeTab(Tabs.tabden_o);
	public static Item uratazao = new ItemBaseSword("uratazao",Tabs.uratazao, RiderItems.imaginsand).setMaxStackSize(1).setCreativeTab(Tabs.tabden_o);
	public static Item kintaono = new ItemBaseSword("kintaono",Tabs.kintaono, RiderItems.imaginsand).setMaxStackSize(1).setCreativeTab(Tabs.tabden_o);
	public static Item gden_denjutte = new ItemBaseSword("gden_denjutte",Tabs.gden_denjutte, RiderItems.imaginsand).setMaxStackSize(1).setCreativeTab(Tabs.tabden_o);
	public static Item macheteddy = new ItemBaseSword("macheteddy",Tabs.macheteddy, RiderItems.imaginsand).setMaxStackSize(1).setCreativeTab(Tabs.tabden_o);
	public static Item gden_dengu = new Item_gun("gden_dengu",Tabs.gden_dengu, RiderItems.imaginsand).setMaxStackSize(1).setCreativeTab(Tabs.tabden_o);

	public static Item nega_den_gasher = new ItemBaseSword("nega_den_gasher",Tabs.nega_den_gasher, RiderItems.imaginsand).setMaxStackSize(1).setCreativeTab(Tabs.tabden_o);
	public static Item gaoh_gasher = new ItemBaseSword("gaoh_gasher",Tabs.gaoh_gasher, RiderItems.imaginsand).setMaxStackSize(1).setCreativeTab(Tabs.tabden_o);
	public static Item den_gasher_vega = new ItemBaseSword("den_gasher_vega",Tabs.den_gasher_vega, RiderItems.imaginsand).setMaxStackSize(1).setCreativeTab(Tabs.tabden_o);
	public static Item den_den_pudding = new ItemBaseSword("den_den_pudding",Tabs.den_denro, RiderItems.imaginsand).setMaxStackSize(1).setCreativeTab(Tabs.tabden_o);

	public static Item momotaro_sword = new ItemBaseSword("momotaro_sword",Tabs.momotaken, RiderItems.imaginsand).setMaxStackSize(1).setCreativeTab(Tabs.tabden_o);
	public static Item uratarod = new ItemBaseSword("uratarod",Tabs.uratazao, RiderItems.imaginsand).setMaxStackSize(1).setCreativeTab(Tabs.tabden_o);
	public static Item kintaros_ax = new ItemBaseSword("kintaros_ax",Tabs.kintaono, RiderItems.imaginsand).setMaxStackSize(1).setCreativeTab(Tabs.tabden_o);
	public static Item ryu_volver = new Item_gun("ryu_volver",Tabs.gden_dengu, RiderItems.imaginsand).setMaxStackSize(1).setCreativeTab(Tabs.tabden_o);
	
	public static Item zerogasher = new ItemBaseSword("zerogasher",Tabs.zerogasher, RiderItems.imaginsand).setMaxStackSize(1).setCreativeTab(Tabs.tabden_o);
	
	public static Item chou_climax_wings = new Item_ore("chou_climax_wings");

	public static Item ktaros = new Item_form_change("ktaros",item_rider_driver.class,5,"_climax_form","deno"
			,new PotionEffect(MobEffects.HASTE, 5, 2,true,false),new PotionEffect(MobEffects.SPEED, 5, 1,true,false),
			new PotionEffect(MobEffects.STRENGTH, 5, 3,true,false),new PotionEffect(MobEffects.JUMP_BOOST, 5, 1,true,false)
			,new PotionEffect(MobEffects.RESISTANCE, 5, 1,true,false)).setCreativeTab(Tabs.tabden_o);
	
	public static Item rider_ticket_newdeno = new Item_form_change("rider_ticket_newdeno",item_rider_driver.class,1,"_plat_form","newdeno"
			,new PotionEffect(MobEffects.WEAKNESS, 5, 0,true,false));
	
	public static Item rider_ticket = new Item_form_change("rider_ticket",item_rider_driver.class,1,"_plat_form","deno"
			,new PotionEffect(MobEffects.WEAKNESS, 5, 0,true,false)).addAlternative((Item_form_change) rider_ticket_newdeno).setCreativeTab(Tabs.tabden_o);
	
	public static Item rider_ticket_sword = new Item_form_change("rider_ticket_sword",item_rider_driver.class,0,"_sword_form","deno"
			,new PotionEffect(MobEffects.STRENGTH, 5, 1,true,false),new PotionEffect(MobEffects.HASTE, 5, 0,true,false)).setCreativeTab(Tabs.tabden_o);

	public static Item rider_ticket_rod = new Item_form_change("rider_ticket_rod",item_rider_driver.class,2,"_rod_form","deno"
			,new PotionEffect(MobEffects.STRENGTH, 5, 0,true,false),new PotionEffect(MobEffects.HASTE, 5, 2,true,false)).setCreativeTab(Tabs.tabden_o);

	public static Item rider_ticket_ax = new Item_form_change("rider_ticket_ax",item_rider_driver.class,3,"_ax_form","deno"
			,new PotionEffect(MobEffects.RESISTANCE, 5, 2,true,false),new PotionEffect(MobEffects.STRENGTH, 5, 1,true,false)).setCreativeTab(Tabs.tabden_o);

	public static Item rider_ticket_gun = new Item_form_change("rider_ticket_gun",item_rider_driver.class,4,"_gun_form","deno"
			,new PotionEffect(MobEffects.SPEED, 5, 1,true,false),new PotionEffect(MobEffects.HASTE, 5, 0,true,false)
			,new PotionEffect(MobEffects.JUMP_BOOST, 5, 1,true,false)).setCreativeTab(Tabs.tabden_o);

	
	public static Item super_ktaros = new Item_form_change("super_ktaros",item_rider_driver.class,5,"_climax_form","deno"
			,new PotionEffect(MobEffects.HASTE, 5, 2,true,false),new PotionEffect(MobEffects.SPEED, 5, 1,true,false),
			new PotionEffect(MobEffects.STRENGTH, 5, 3,true,false),new PotionEffect(MobEffects.JUMP_BOOST, 5, 1,true,false)
			,new PotionEffect(MobEffects.RESISTANCE, 5, 1,true,false),new PotionEffect(MobEffects.WEAKNESS, 5, 0,true,false))
			.addNeedItem(ktaros).addWing(chou_climax_wings);

	
	public static Item rider_ticket_wing = new Item_form_change("rider_ticket_wing",item_rider_driver.class,7,"_wing_form","deno"
			,new PotionEffect(MobEffects.SPEED, 5, 2,true,false),new PotionEffect(MobEffects.HASTE, 5, 1,true,false),new PotionEffect(MobEffects.JUMP_BOOST, 5, 2,true,false)
			,new PotionEffect(MobEffects.WEAKNESS, 5, 0,true,false),new PotionEffect(PotionCore.FLY_POTION, 5, 1,true,false))
			.ShiftForm(super_ktaros).setCreativeTab(Tabs.tabden_o);

	public static Item rider_ticket_nega = new Item_form_change("rider_ticket_nega",item_rider_driver.class,0,"_nega_form","nega_deno"
			,new PotionEffect(MobEffects.STRENGTH, 5, 2,true,false),new PotionEffect(MobEffects.SPEED, 5, 1,true,false)
			,new PotionEffect(MobEffects.HASTE, 5, 0,true,false),new PotionEffect(MobEffects.RESISTANCE, 5, 1,true,false)).setCreativeTab(Tabs.tabden_o);

	public static Item rider_ticket_yuuki = new Item_form_change("rider_ticket_yuuki",item_rider_driver.class,0,"_form","yuuki"
			,new PotionEffect(MobEffects.STRENGTH, 5, 3,true,false),new PotionEffect(MobEffects.RESISTANCE, 5, 4,true,false),
			new PotionEffect(MobEffects.SLOWNESS, 5, 0,true,false),new PotionEffect(MobEffects.REGENERATION, 5, 2,true,false),
			new PotionEffect(MobEffects.FIRE_RESISTANCE, 5, 0,true,false)).setCreativeTab(Tabs.tabden_o);

	public static Item rider_ticket_g = new Item_form_change("rider_ticket_g",item_rider_driver.class,0,"","gdeno"
			,new PotionEffect(MobEffects.STRENGTH, 5,0,true,false),new PotionEffect(MobEffects.SPEED, 5, 2,true,false)
			,new PotionEffect(MobEffects.RESISTANCE, 5, 0,true,false),new PotionEffect(MobEffects.REGENERATION, 5, 0,true,false)
			,new PotionEffect(MobEffects.NIGHT_VISION, 5, 0,true,false)).setCreativeTab(Tabs.tabden_o);

	public static Item rider_ticket_gaoh = new Item_form_change("rider_ticket_gaoh",item_rider_driver.class,0,"","gaoh"
			,new PotionEffect(MobEffects.STRENGTH, 5,0,true,false),new PotionEffect(MobEffects.SPEED, 5, 2,true,false)
			,new PotionEffect(MobEffects.RESISTANCE, 5, 0,true,false),new PotionEffect(MobEffects.REGENERATION, 5, 0,true,false)
			,new PotionEffect(MobEffects.NIGHT_VISION, 5, 0,true,false)).setCreativeTab(Tabs.tabden_o);

	public static Item rider_ticket_strike = new Item_form_change("rider_ticket_strike",item_rider_driver.class,0,"_strike_form","newdeno"
			,new PotionEffect(MobEffects.STRENGTH, 5,0,true,false),new PotionEffect(MobEffects.SPEED, 5, 2,true,false)
			,new PotionEffect(MobEffects.RESISTANCE, 5, 0,true,false),new PotionEffect(MobEffects.REGENERATION, 5, 0,true,false)
			,new PotionEffect(MobEffects.NIGHT_VISION, 5, 0,true,false)).setCreativeTab(Tabs.tabden_o);

	public static Item rider_ticket_pudding = new Item_form_change("rider_ticket_pudding",item_rider_driver.class,6,"_pudding_form","deno"
			,new PotionEffect(MobEffects.STRENGTH, 5, 0,true,false),new PotionEffect(MobEffects.HASTE, 5, 2,true,false)).setCreativeTab(Tabs.tabden_o);

	
	public static Item deno_liner_form = new Item_form_change("deno_liner_form",item_rider_driver.class,5,"_liner_form","deno"
			,new PotionEffect(MobEffects.HASTE, 5, 2,true,false),new PotionEffect(MobEffects.SPEED, 5, 1,true,false),
			new PotionEffect(MobEffects.STRENGTH, 5, 3,true,false),new PotionEffect(MobEffects.JUMP_BOOST, 5, 1,true,false)
			,new PotionEffect(MobEffects.RESISTANCE, 5, 1,true,false),new PotionEffect(MobEffects.WEAKNESS, 5, 0,true,false))
			.addNeedItem(ktaros);

	
	public static Item zeronos_plat_card = new Item_form_change("zeronos_plat_card",item_rider_driver.class,1,"_plat_form","zeronos"
			,new PotionEffect(MobEffects.WEAKNESS, 5, 0,true,false)).setCreativeTab(Tabs.tabden_o);
	
	public static Item zeronos_altair_card = new Item_form_change("zeronos_altair_card",item_rider_driver.class,0,"_altair_form","zeronos"
			,new PotionEffect(MobEffects.SPEED, 5, 2,true,false),new PotionEffect(MobEffects.HASTE, 5, 0,true,false)
					,new PotionEffect(MobEffects.STRENGTH, 5, 1,true,false),new PotionEffect(MobEffects.RESISTANCE, 5, 0,true,false)).setCreativeTab(Tabs.tabden_o);
	
	
	public static Item newdeno_vega_card = new Item_form_change("newdeno_vega_card",item_rider_driver.class,2,"_vega_form","newdeno"
			,new PotionEffect(MobEffects.SPEED, 5, 0,true,false),new PotionEffect(MobEffects.STRENGTH, 5, 2,true,false)
			,new PotionEffect(MobEffects.RESISTANCE, 5, 1,true,false),new PotionEffect(MobEffects.FIRE_RESISTANCE, 5, 0,true,false));
	
	
	public static Item zeronos_vega_card = new Item_form_change("zeronos_vega_card",item_rider_driver.class,2,"_vega_form","zeronos"
			,new PotionEffect(MobEffects.SPEED, 5, 0,true,false),new PotionEffect(MobEffects.STRENGTH, 5, 2,true,false)
			,new PotionEffect(MobEffects.RESISTANCE, 5, 1,true,false),new PotionEffect(MobEffects.FIRE_RESISTANCE, 5, 0,true,false))
			.addAlternative((Item_form_change) newdeno_vega_card).setCreativeTab(Tabs.tabden_o);
	
	public static Item zeronos_zero_card = new Item_form_change("zeronos_zero_card",item_rider_driver.class,3,"_zero_form","zeronos"
			,new PotionEffect(MobEffects.SPEED, 5, 2,true,false),new PotionEffect(MobEffects.STRENGTH, 5, 2,true,false)
			,new PotionEffect(MobEffects.RESISTANCE, 5, 1,true,false),new PotionEffect(MobEffects.HASTE, 5, 1,true,false)
			,new PotionEffect(MobEffects.FIRE_RESISTANCE, 5, 0,true,false),new PotionEffect(MobEffects.REGENERATION, 5, 1,true,false)).setCreativeTab(Tabs.tabden_o);
	
	
	public static Item den_ohead = new item_rider_armor("den_ohead",item_rider_driver.class,ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.HEAD, RiderItems.imaginsand).setCreativeTab(Tabs.tabden_o);
	public static Item den_otroso = new item_rider_armor("den_otroso",item_rider_driver.class,ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.CHEST, RiderItems.imaginsand).setCreativeTab(Tabs.tabden_o);
	public static Item den_olegs = new item_rider_armor("den_olegs",item_rider_driver.class,ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.LEGS, RiderItems.imaginsand).setCreativeTab(Tabs.tabden_o);

	
	public static Item den_odriver = new item_rider_driver("den_odriver",ArmorMaterial.DIAMOND, 4,"deno", (Item_form_change) rider_ticket_sword, den_ohead, den_otroso, den_olegs, RiderItems.imaginsand).setMaxStackSize(1).setCreativeTab(Tabs.tabden_o);
	
	public static Item zeronosbelt = new item_rider_driver("zeronosbelt",ArmorMaterial.DIAMOND, 4,"zeronos", (Item_form_change) zeronos_altair_card, den_ohead, den_otroso, den_olegs, RiderItems.imaginsand).setMaxStackSize(1).setCreativeTab(Tabs.tabden_o);
	public static Item nega_den_odriver = new item_rider_driver("nega_den_odriver",ArmorMaterial.DIAMOND, 4,"nega_deno", (Item_form_change) rider_ticket_nega, den_ohead, den_otroso, den_olegs, RiderItems.imaginsand).setMaxStackSize(1).setCreativeTab(Tabs.tabden_o);
	public static Item newden_obelt = new item_rider_driver("newden_obelt",ArmorMaterial.DIAMOND, 4,"newdeno", (Item_form_change) rider_ticket_strike, den_ohead, den_otroso, den_olegs, RiderItems.imaginsand).setMaxStackSize(1).setCreativeTab(Tabs.tabden_o);
	public static Item gaohbelt = new item_rider_driver("gaohbelt",ArmorMaterial.DIAMOND, 4,"gaoh", (Item_form_change) kabuto_zecter, den_ohead, den_otroso, den_olegs, RiderItems.imaginsand).setMaxStackSize(1).setCreativeTab(Tabs.tabden_o);
	public static Item yuukibelt_skull = new item_rider_driver("yuukibelt_skull",ArmorMaterial.DIAMOND, 4,"yuuki-skull", (Item_form_change) rider_ticket_yuuki, den_ohead, den_otroso, den_olegs, RiderItems.imaginsand).setMaxStackSize(1).setCreativeTab(Tabs.tabden_o);
	public static Item yuukibelt_hijack = new item_rider_driver("yuukibelt_hijack",ArmorMaterial.DIAMOND, 4,"yuuki-hijack", (Item_form_change) rider_ticket_yuuki, den_ohead, den_otroso, den_olegs, RiderItems.imaginsand).setMaxStackSize(1).setCreativeTab(Tabs.tabden_o);
	public static Item gden_odriver = new item_rider_driver("gden_odriver",ArmorMaterial.DIAMOND, 4,"gdeno", (Item_form_change) rider_ticket_gaoh, den_ohead, den_otroso, den_olegs, RiderItems.imaginsand).setMaxStackSize(1).setCreativeTab(Tabs.tabden_o);
	public static Item pretty_den_odriver = new item_rider_driver("pretty_den_odriver",ArmorMaterial.DIAMOND, 4,"pretty_deno", (Item_form_change) rider_ticket_sword, den_ohead, den_otroso, den_olegs, RiderItems.imaginsand).setMaxStackSize(1).setCreativeTab(Tabs.tabden_o);
	
	public static Item den_oriderpass = new item_RiderPass("den_oriderpass").setMaxStackSize(1).setCreativeTab(Tabs.tabden_o);
	public static Item den_o_master_pass = new item_RiderPass("den_o_master_pass").setMaxStackSize(1).setCreativeTab(Tabs.tabden_o);
	public static Item gden_oriderpass = new item_RiderPass("gden_oriderpass").setMaxStackSize(1).setCreativeTab(Tabs.tabden_o);

	
	public static Item den_bird = new item_bikes("den_bird",Entity_machine_denbird::new).setMaxStackSize(1).setCreativeTab(Tabs.tabden_o);

	//kiva	
	public static Item fuestle = new Item_ore("fuestle").setCreativeTab(Tabs.tabkiva);
	
	public static Item garulu_saber = new ItemBaseSword("garulu_saber",Tabs.garulu_saber, fuestle).setMaxStackSize(1).setCreativeTab(Tabs.tabkiva);
	public static Item basshaamagnum = new Item_gun("basshaamagnum",Tabs.bashaamagnum, fuestle).setMaxStackSize(1).setCreativeTab(Tabs.tabkiva);
	public static Item dogga_hammer = new ItemBaseSword("dogga_hammer",Tabs.dogga_hammer, fuestle).setMaxStackSize(1).setCreativeTab(Tabs.tabkiva);
	public static Item ixa_caliber = new Item_sword_gun("ixa_caliber",Tabs.garulu_saber, fuestle).setMaxStackSize(1).setCreativeTab(Tabs.tabkiva);
	public static Item ixariser = new Item_gun("ixariser",Tabs.bashaamagnum, fuestle).setMaxStackSize(1).setCreativeTab(Tabs.tabkiva);
	public static Item jacorder = new ItemBaseSword("jacorder",Tabs.jacorder, fuestle).setMaxStackSize(1).setCreativeTab(Tabs.tabkiva);

	public static Item zanbatsword_charge = new Item_ore("zanbatsword_charge");	
	public static Item zanbatsword = new ItemBaseSword("zanbatsword",Tabs.zanbatsword, fuestle).setMaxStackSize(1).setCreativeTab(Tabs.tabkiva);
	public static Item zanbatsword_core = new ItemBaseSword("zanbatsword_core",Tabs.zanbatsword_core, fuestle).setMaxStackSize(1).setCreativeTab(Tabs.tabkiva);

	public static Item kivadriver_garulu = new Item_ore("kivadriver_garulu");
	public static Item kivadriver_basshaa = new Item_ore("kivadriver_basshaa");
	public static Item kivadriver_dogga = new Item_ore("kivadriver_dogga");
	public static Item kivadriver_emperor = new Item_ore("kivadriver_emperor");
	
	public static Item dogabaki = new Item_form_change("dogabaki",item_rider_driver.class,0,"_dogabaki","kiva"
			,new PotionEffect(MobEffects.STRENGTH, 5, 1,true,false),new PotionEffect(MobEffects.RESISTANCE, 5, 1,true,false),
			new PotionEffect(MobEffects.HASTE, 5, 0,true,false),new PotionEffect(MobEffects.JUMP_BOOST, 5, 0,true,false),
			new PotionEffect(MobEffects.SPEED, 5, 1,true,false),new PotionEffect(MobEffects.WITHER, 5, 0,true,false));
	
	public static Item wakeupfuestle = new Item_form_change("wakeupfuestle",item_rider_driver.class,0,"","kiva"
			,new PotionEffect(MobEffects.SPEED, 5, 0,true,false),new PotionEffect(MobEffects.STRENGTH, 5, 0,true,false)
			,new PotionEffect(MobEffects.RESISTANCE, 5, 0,true,false)).ShiftForm((Item_form_change) dogabaki).setCreativeTab(Tabs.tabkiva);
	
	
	public static Item garulufuestle = new Item_form_change("garulufuestle",item_rider_driver.class,1,"_garulu","kiva"
			,new PotionEffect(MobEffects.SPEED, 5, 1,true,false),new PotionEffect(MobEffects.STRENGTH, 5, 0,true,false)
			,new PotionEffect(MobEffects.JUMP_BOOST, 5, 1,true,false)).ShiftForm((Item_form_change) dogabaki).setCreativeTab(Tabs.tabkiva);
	
	public static Item basshaafuestle = new Item_form_change("basshaafuestle",item_rider_driver.class,2,"_basshaa","kiva"
			,new PotionEffect(MobEffects.SPEED, 5, 0,true,false),new PotionEffect(MobEffects.RESISTANCE, 5, 0,true,false),
			new PotionEffect(MobEffects.HASTE, 5, 2,true,false)).ShiftForm((Item_form_change) dogabaki).setCreativeTab(Tabs.tabkiva);
	
	public static Item doggafuestle = new Item_form_change("doggafuestle",item_rider_driver.class,3,"_dogga","kiva"
			,new PotionEffect(MobEffects.STRENGTH, 5, 1,true,false),new PotionEffect(MobEffects.RESISTANCE, 5, 1,true,false),
			new PotionEffect(MobEffects.SLOWNESS, 5, 0,true,false)).ShiftForm((Item_form_change) dogabaki).setCreativeTab(Tabs.tabkiva);
	
	public static Item dogabaki_emperor = new Item_form_change("dogabaki_emperor",item_rider_driver.class,4,"_dogabaki_emperor","kiva"
			,new PotionEffect(MobEffects.STRENGTH, 5, 4,true,false),new PotionEffect(MobEffects.RESISTANCE, 5, 3,true,false),new PotionEffect(MobEffects.HASTE, 5, 2,true,false)
			,new PotionEffect(MobEffects.JUMP_BOOST, 5, 1,true,false),new PotionEffect(MobEffects.SPEED, 5, 4,true,false),new PotionEffect(MobEffects.REGENERATION, 5, 0,true,false)
			,new PotionEffect(MobEffects.WITHER, 5, 1,true,false)).addNeedItem(wakeupfuestle).addNeedItem(garulufuestle).addNeedItem(basshaafuestle).addNeedItem(basshaafuestle);
	
	
	public static Item tatsulot = new Item_form_change("tatsulot",item_rider_driver.class,4,"_emperor","kiva"
			,new PotionEffect(MobEffects.STRENGTH, 5, 2,true,false),new PotionEffect(MobEffects.RESISTANCE, 5, 2,true,false),
			new PotionEffect(MobEffects.HASTE, 5, 1,true,false),new PotionEffect(MobEffects.JUMP_BOOST, 5, 1,true,false),
			new PotionEffect(MobEffects.SPEED, 5, 2,true,false),new PotionEffect(MobEffects.REGENERATION, 5, 1,true,false)).ShiftForm(dogabaki_emperor).setCreativeTab(Tabs.tabkiva);
	

	public static Item kiva_says_fuestle = new Item_form_change("kiva_says_fuestle",item_rider_driver.class,0,"_red_emperor","kiva"
			,new PotionEffect(MobEffects.STRENGTH, 5, 2,true,false),new PotionEffect(MobEffects.RESISTANCE, 5, 2,true,false),
			new PotionEffect(MobEffects.HASTE, 5, 1,true,false),new PotionEffect(MobEffects.JUMP_BOOST, 5, 1,true,false),
			new PotionEffect(MobEffects.SPEED, 5, 2,true,false),new PotionEffect(MobEffects.REGENERATION, 5, 1,true,false)).setCreativeTab(Tabs.tabkiva);
	

	public static Item knucklefuestle_burst  = new Item_form_change("knucklefuestle_burst",item_rider_driver.class,0,"_burst","ixa"
			,new PotionEffect(MobEffects.STRENGTH, 5, 1,true,false),new PotionEffect(MobEffects.FIRE_RESISTANCE, 5, 0,true,false),
			new PotionEffect(MobEffects.HASTE, 5, 1,true,false),new PotionEffect(MobEffects.SPEED, 5, 0,true,false));
	
	public static Item knucklefuestle  = new Item_zecter(knucklefuestle_burst,"knucklefuestle",item_rider_driver.class,0,"_save","ixa"
			,new PotionEffect(MobEffects.STRENGTH, 5, 0,true,false),new PotionEffect(MobEffects.HASTE, 5, 0,true,false),
			new PotionEffect(MobEffects.RESISTANCE, 5, 0,true,false)).setCreativeTab(Tabs.tabkiva);
	
	public static Item risingfuestle  = new Item_form_change("risingfuestle",item_rider_driver.class,0,"_rising","ixa"
			,new PotionEffect(MobEffects.STRENGTH, 5, 2,true,false),new PotionEffect(MobEffects.FIRE_RESISTANCE, 5, 0,true,false),
			new PotionEffect(MobEffects.RESISTANCE, 5, 1,true,false),new PotionEffect(MobEffects.SPEED, 5, 1,true,false),
			new PotionEffect(MobEffects.HASTE, 5, 0,true,false)).setCreativeTab(Tabs.tabkiva);
	
	public static Item sagafuestle = new Item_form_change("sagafuestle",item_rider_driver.class,0,"","saga"
			,new PotionEffect(MobEffects.STRENGTH, 5, 1,true,false),new PotionEffect(MobEffects.SPEED, 5, 1,true,false)
					,new PotionEffect(MobEffects.HASTE, 5, 0,true,false),new PotionEffect(MobEffects.JUMP_BOOST, 5, 2,true,false)).setCreativeTab(Tabs.tabkiva);
	
	public static Item darkwakeupfuestle = new Item_form_change("darkwakeupfuestle",item_rider_driver.class,0,"","dark_kiva"
			,new PotionEffect(MobEffects.STRENGTH, 5, 3,true,false),new PotionEffect(MobEffects.RESISTANCE, 5, 2,true,false)
			,new PotionEffect(MobEffects.HASTE, 5, 0,true,false),new PotionEffect(MobEffects.JUMP_BOOST, 5, 1,true,false),
			new PotionEffect(MobEffects.REGENERATION, 5, 2,true,false)).setCreativeTab(Tabs.tabkiva);
	
	public static Item newwakeupfuestle = new Item_form_change("newwakeupfuestle",item_rider_driver.class,0,"","new_kiva"
			,new PotionEffect(MobEffects.SPEED, 5, 0,true,false),new PotionEffect(MobEffects.STRENGTH, 5, 0,true,false)
			,new PotionEffect(MobEffects.RESISTANCE, 5, 0,true,false)).setCreativeTab(Tabs.tabkiva);
	
	public static Item keyfuestle = new Item_form_change("keyfuestle",item_rider_driver.class,0,"","arc"
			,new PotionEffect(MobEffects.STRENGTH, 5, 2,true,false),new PotionEffect(MobEffects.RESISTANCE, 5, 3,true,false),new PotionEffect(MobEffects.SPEED, 5, 1,true,false)
			,new PotionEffect(MobEffects.HASTE, 5, 0,true,false)).setCreativeTab(Tabs.tabkiva);
	
	public static Item kivahead = new item_rider_armor("kivahead",item_rider_driver.class,ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.HEAD, fuestle).setCreativeTab(Tabs.tabkiva);
	public static Item kivatroso = new item_rider_armor("kivatroso",item_rider_driver.class,ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.CHEST, fuestle).setCreativeTab(Tabs.tabkiva);
	public static Item kivalegs = new item_rider_armor("kivalegs",item_rider_driver.class,ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.LEGS, fuestle).setCreativeTab(Tabs.tabkiva);
	
	public static Item kivadriver = new item_rider_driver("kivadriver",ArmorMaterial.DIAMOND, 4,"kiva", (Item_form_change) wakeupfuestle, kivahead, kivatroso, kivalegs, fuestle).setMaxStackSize(1).setCreativeTab(Tabs.tabkiva);
	public static Item ixa_belt = new item_rider_driver("ixa_belt",ArmorMaterial.DIAMOND, 4,"ixa", (Item_form_change) knucklefuestle, kivahead, kivatroso, kivalegs, fuestle).setMaxStackSize(1).setCreativeTab(Tabs.tabkiva);
	public static Item sagarc_belt = new item_rider_driver("sagarc_belt",ArmorMaterial.DIAMOND, 4,"saga", (Item_form_change) sagafuestle, kivahead, kivatroso, kivalegs, fuestle).setMaxStackSize(1).setCreativeTab(Tabs.tabkiva);
	public static Item darkkivadriver = new item_rider_driver("darkkivadriver",ArmorMaterial.DIAMOND, 4,"dark_kiva", (Item_form_change) darkwakeupfuestle, kivahead, kivatroso, kivalegs, fuestle).setMaxStackSize(1).setCreativeTab(Tabs.tabkiva);
	public static Item newkivadriver = new item_rider_driver("newkivadriver",ArmorMaterial.DIAMOND, 4,"new_kiva", (Item_form_change) newwakeupfuestle, kivahead, kivatroso, kivalegs, fuestle).setMaxStackSize(1).setCreativeTab(Tabs.tabkiva);

	public static Item arcdriver = new item_rider_driver("arcdriver",ArmorMaterial.DIAMOND, 4,"arc", (Item_form_change) keyfuestle, kivahead, kivatroso, kivalegs, fuestle).setMaxStackSize(1).setCreativeTab(Tabs.tabkiva);
	public static Item reydriver = new item_rider_driver("reydriver",ArmorMaterial.DIAMOND, 4,"rey", (Item_form_change) keyfuestle, kivahead, kivatroso, kivalegs, fuestle).setMaxStackSize(1).setCreativeTab(Tabs.tabkiva);
	public static Item kivaladriver = new item_rider_driver("kivaladriver",ArmorMaterial.DIAMOND, 4,"kivala", (Item_form_change) keyfuestle, kivahead, kivatroso, kivalegs, fuestle).setMaxStackSize(1).setCreativeTab(Tabs.tabkiva);

	public static Block fuestleblock = new ore_block("fuestleblock",Material.ROCK, fuestle, 2).setHardness(9.9F).setCreativeTab(Tabs.tabkiva);



	//decade
	public static Item ride_booker = new Item_sword_gun("ride_booker",ToolMaterial.DIAMOND, RiderItems.blankcard).setMaxStackSize(1).setCreativeTab(Tabs.tabdecade);
	public static Item diend_driver = new Item_dienddriver("diend_driver",Tabs.den_dengu).setMaxStackSize(1).setCreativeTab(Tabs.tabdecade);
	public static Item neo_diend_driver = new Item_dienddriver("neo_diend_driver",Tabs.den_dengu).setMaxStackSize(1).setCreativeTab(Tabs.tabdecade);


	public static Item ongekibo_rekka_decade = new ItemBaseSword("ongekibo_rekka_decade",Tabs.ongekibo, RiderItems.blankcard).setMaxStackSize(1).setCreativeTab(Tabs.tabdecade);
	public static Item ongekibo_rekka_diend = new ItemBaseSword("ongekibo_rekka_diend",Tabs.ongekibo, RiderItems.blankcard).setMaxStackSize(1).setCreativeTab(Tabs.tabdecade);

	public static Item decadehead = new item_rider_armor("decadehead",item_decadedriver.class,ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.HEAD, RiderItems.blankcard).setCreativeTab(Tabs.tabdecade);
	public static Item decadetroso = new item_rider_armor("decadetroso",item_decadedriver.class,ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.CHEST, RiderItems.blankcard).setCreativeTab(Tabs.tabdecade);
	public static Item decadelegs = new item_rider_armor("decadelegs",item_decadedriver.class,ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.LEGS, RiderItems.blankcard).setCreativeTab(Tabs.tabdecade);

	public static Item decadedriver = new item_decadedriver("decadedriver",ArmorMaterial.DIAMOND,"decade").setMaxStackSize(1).setCreativeTab(Tabs.tabdecade);
	public static Item dienddriver = new item_decadedriver("dienddriver",ArmorMaterial.DIAMOND,"diend").setMaxStackSize(1).setCreativeTab(Tabs.tabdecade);
	public static Item dark_decadedriver = new item_decadedriver("dark_decadedriver",ArmorMaterial.DIAMOND,"dark_decade").setMaxStackSize(1).setCreativeTab(Tabs.tabdecade);
	public static Item new_decadriver = new item_decadedriver("new_decadriver",ArmorMaterial.DIAMOND,"decade").setMaxStackSize(1).setCreativeTab(Tabs.tabdecade);

	public static Item decadecard = new Itemrider_cards(0,0,"decadecard").setCreativeTab(Tabs.tabdecade);
	public static Item k_touch = new Itemrider_cards(0,1,"k_touch").setCreativeTab(Tabs.tabdecade);
	public static Item decadecard_violent_emotion = new Itemrider_cards(0,2,"decadecard_violent_emotion").setCreativeTab(Tabs.tabdecade);
	public static Item neo_k_touch = new Itemrider_cards(0,4,"neo_k_touch").setCreativeTab(Tabs.tabdecade);

	public static Item darkdecadecard = new Item_ore("darkdecadecard").setCreativeTab(Tabs.tabdecade);

	public static Item kivacard = new Itemrider_cards(1,0,"kivacard").setCreativeTab(Tabs.tabdecade);
	public static Item den_ocard = new Itemrider_cards(2,1,"den_ocard").setCreativeTab(Tabs.tabdecade);
	public static Item kabutocard = new Itemrider_cards(3,0,"kabutocard").setCreativeTab(Tabs.tabdecade);
	public static Item hibikicard = new Itemrider_cards(4,0,"hibikicard").setCreativeTab(Tabs.tabdecade);
	public static Item bladecard_de = new Itemrider_cards(5,0,"bladecard_de").setCreativeTab(Tabs.tabdecade);
	public static Item faizcard = new Itemrider_cards(6,0,"faizcard").setCreativeTab(Tabs.tabdecade);
	public static Item ryukicard = new Itemrider_cards(7,0,"ryukicard").setCreativeTab(Tabs.tabdecade);
	public static Item agitocard = new Itemrider_cards(8,0,"agitocard").setCreativeTab(Tabs.tabdecade);
	public static Item kuugacard = new Itemrider_cards(9,1,"kuugacard").setCreativeTab(Tabs.tabdecade);


	public static Item k_touch_diend = new Itemrider_cards(0,1,"k_touch_diend").setCreativeTab(Tabs.tabdecade);

	public static Item garulu_kivacard = new Itemrider_cards(1,1,"garulu_kivacard").setCreativeTab(Tabs.tabdecade);
	public static Item basshaa_kivacard = new Itemrider_cards(1,2,"basshaa_kivacard").setCreativeTab(Tabs.tabdecade);
	public static Item dogga_kivacard = new Itemrider_cards(1,3,"dogga_kivacard").setCreativeTab(Tabs.tabdecade);

	public static Item rod_den_ocard = new Itemrider_cards(2,2,"rod_den_ocard").setCreativeTab(Tabs.tabdecade);
	public static Item axe_den_ocard = new Itemrider_cards(2,3,"axe_den_ocard").setCreativeTab(Tabs.tabdecade);
	public static Item gun_den_ocard = new Itemrider_cards(2,4,"gun_den_ocard").setCreativeTab(Tabs.tabdecade);
	public static Item wing_den_ocard = new Itemrider_cards(2,5,"wing_den_ocard").setCreativeTab(Tabs.tabdecade);

	public static Item axel_faizcard = new Itemrider_cards(6,1,"axel_faizcard").setCreativeTab(Tabs.tabdecade);

	public static Item flame_agitocard= new Itemrider_cards(8,2,"flame_agitocard").setCreativeTab(Tabs.tabdecade);
	public static Item storm_agitocard = new Itemrider_cards(8,1,"storm_agitocard").setCreativeTab(Tabs.tabdecade);

	public static Item dragon_kuugacard= new Itemrider_cards(9,2,"dragon_kuugacard").setCreativeTab(Tabs.tabdecade);
	public static Item pegasus_kuugacard = new Itemrider_cards(9,3,"pegasus_kuugacard").setCreativeTab(Tabs.tabdecade);
	public static Item titan_kuugacard = new Itemrider_cards(9,4,"titan_kuugacard").setCreativeTab(Tabs.tabdecade);

	public static Item emperor_kivacard = new Item_ore("emperor_kivacard").setCreativeTab(Tabs.tabdecade);
	public static Item liner_den_ocard = new Item_ore("liner_den_ocard").setCreativeTab(Tabs.tabdecade);
	public static Item hyper_kabutocard = new Item_ore("hyper_kabutocard").setCreativeTab(Tabs.tabdecade);
	public static Item armed_hibikicard = new Item_ore("armed_hibikicard").setCreativeTab(Tabs.tabdecade);
	public static Item king_bladecard = new Item_ore("king_bladecard").setCreativeTab(Tabs.tabdecade);
	public static Item blaster_faizcard = new Item_ore("blaster_faizcard").setCreativeTab(Tabs.tabdecade);
	public static Item survive_ryukicard = new Item_ore("survive_ryukicard").setCreativeTab(Tabs.tabdecade);
	public static Item shining_agitocard = new Item_ore("shining_agitocard").setCreativeTab(Tabs.tabdecade);
	public static Item ultimate_kuugacard = new Item_ore("ultimate_kuugacard").setCreativeTab(Tabs.tabdecade);

	public static Item ichigocard = new Itemrider_cards(10,0,"ichigocard").setCreativeTab(Tabs.tabdecade);
	public static Item nigocard = new Itemrider_cards(10,1,"nigocard").setCreativeTab(Tabs.tabdecade);
	public static Item v3card = new Itemrider_cards(10,2,"v3card").setCreativeTab(Tabs.tabdecade);
	public static Item ridermancard = new Itemrider_cards(10,3,"ridermancard").setCreativeTab(Tabs.tabdecade);
	public static Item xcard = new Itemrider_cards(10,4,"xcard").setCreativeTab(Tabs.tabdecade);
	public static Item amazoncard = new Itemrider_cards(10,5,"amazoncard").setCreativeTab(Tabs.tabdecade);
	public static Item strongercard = new Itemrider_cards(10,6,"strongercard").setCreativeTab(Tabs.tabdecade);
	public static Item skyridercard = new Itemrider_cards(10,7,"skyridercard").setCreativeTab(Tabs.tabdecade);
	public static Item super1card = new Itemrider_cards(10,8,"super1card").setCreativeTab(Tabs.tabdecade);
	public static Item zxcard = new Itemrider_cards(10,9,"zxcard").setCreativeTab(Tabs.tabdecade);
	public static Item blackcard = new Itemrider_cards(10,10,"blackcard").setCreativeTab(Tabs.tabdecade);
	public static Item blackrxcard = new Itemrider_cards(10,11,"blackrxcard").setCreativeTab(Tabs.tabdecade);
	public static Item shincard = new Itemrider_cards(10,12,"shincard").setCreativeTab(Tabs.tabdecade);
	public static Item zocard = new Itemrider_cards(10,13,"zocard").setCreativeTab(Tabs.tabdecade);
	public static Item jcard = new Itemrider_cards(10,14,"jcard").setCreativeTab(Tabs.tabdecade);

	public static Item g4card = new Item_ore("g4card").setCreativeTab(Tabs.tabdecade);
	public static Item ryugacard = new Item_ore("ryugacard").setCreativeTab(Tabs.tabdecade);
	public static Item orgacard = new Item_ore("orgacard").setCreativeTab(Tabs.tabdecade);
	public static Item glaivecard = new Item_ore("glaivecard").setCreativeTab(Tabs.tabdecade);
	public static Item kabukicard = new Item_ore("kabukicard").setCreativeTab(Tabs.tabdecade);
	public static Item caucasuscard = new Item_ore("caucasuscard").setCreativeTab(Tabs.tabdecade);
	public static Item arccard = new Item_ore("arccard").setCreativeTab(Tabs.tabdecade);
	public static Item skullcard = new Item_ore("skullcard").setCreativeTab(Tabs.tabdecade);

	public static Item wcard = new Itemrider_cards(11,0,"wcard").setCreativeTab(Tabs.tabdecade);
	public static Item ooocard = new Itemrider_cards(11,1,"ooocard").setCreativeTab(Tabs.tabdecade);
	public static Item fourzecard = new Itemrider_cards(11,2,"fourzecard").setCreativeTab(Tabs.tabdecade);
	public static Item wizardcard = new Itemrider_cards(11,3,"wizardcard").setCreativeTab(Tabs.tabdecade);
	public static Item gaimcard = new Itemrider_cards(11,4,"gaimcard").setCreativeTab(Tabs.tabdecade);
	public static Item drivecard = new Itemrider_cards(11,5,"drivecard").setCreativeTab(Tabs.tabdecade);
	public static Item ghostcard = new Itemrider_cards(11,6,"ghostcard").setCreativeTab(Tabs.tabdecade);
	public static Item exaidcard = new Itemrider_cards(11,7,"exaidcard").setCreativeTab(Tabs.tabdecade);
	public static Item buildcard = new Itemrider_cards(11,8,"buildcard").setCreativeTab(Tabs.tabdecade);
	public static Item zi_ocard = new Itemrider_cards(11,9,"zi_ocard").setCreativeTab(Tabs.tabdecade);


	public static Item rekka_daizantou_card = new Item_ore("rekka_daizantou_card").setCreativeTab(Tabs.tabdecade);

	//W
	public static Item gaiamemory = new Item_ore("gaiamemory").setCreativeTab(Tabs.tabW);
	public static Block gaiamemoryblock = new ore_block("gaiamemoryblock",Material.ROCK, gaiamemory, 2).setHardness(9.9F).setCreativeTab(Tabs.tabW);

	
	public static Item trigger_magnum = new Item_gun("trigger_magnum",Tabs.den_dengu, RiderItems.gaiamemory).setMaxStackSize(1).setCreativeTab(Tabs.tabW);	
	public static Item metal_shaft = new Item_metal_shaft("metal_shaft",Tabs.den_denro).setMaxStackSize(1).setCreativeTab(Tabs.tabW);
	public static Item prism_bicker = new ItemChargeSword("prism_bicker",Tabs.denkamen_sword, RiderItems.gaiamemory).setMaxStackSize(1).setCreativeTab(Tabs.tabW);
	public static Item shield_prism_bicker = new ItemBaseShield("shield_prism_bicker", RiderItems.gaiamemory).setMaxStackSize(1).setCreativeTab(Tabs.tabW);

	public static Item eternal_edge = new ItemBaseSword("eternal_edge",Tabs.den_denso, RiderItems.gaiamemory).setMaxStackSize(1).setCreativeTab(Tabs.tabW);
	public static Item skull_magnum = new Item_gun("skull_magnum",Tabs.den_dengu, RiderItems.gaiamemory).setMaxStackSize(1).setCreativeTab(Tabs.tabW);
	public static Item engine_blade = new ItemBaseSword("engine_blade",Tabs.den_denso, RiderItems.gaiamemory).setMaxStackSize(1).setCreativeTab(Tabs.tabW);
	public static Item bomb_magnum = new Item_gun("bomb_magnum",Tabs.den_dengu, RiderItems.gaiamemory).setMaxStackSize(1).setCreativeTab(Tabs.tabW);
	
	public static Item nasca_blade = new ItemBaseSword("nasca_blade",Tabs.den_denso, RiderItems.gaiamemory).setMaxStackSize(1).setCreativeTab(Tabs.tabW);
	
	public static Item akiko_no_slipper = new Item_ore("akiko_no_slipper").setCreativeTab(Tabs.tabW);
	
	public static Item whead = new item_rider_armor("whead",item_Wdriver.class,ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.HEAD, gaiamemory).setCreativeTab(Tabs.tabW);
	public static Item wtroso = new item_rider_armor("wtroso",item_Wdriver.class,ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.CHEST, gaiamemory).setCreativeTab(Tabs.tabW);
	public static Item wlegs = new item_rider_armor("wlegs",item_Wdriver.class,ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.LEGS, gaiamemory).setCreativeTab(Tabs.tabW);

	public static Item wdriver = new item_Wdriver("wdriver",ArmorMaterial.DIAMOND,"w").setMaxStackSize(1).setCreativeTab(Tabs.tabW);

	public static Item cyclone_joker_gold_xtreme_wings = new Item_ore("cyclone_joker_gold_xtreme_wings");

	public static Item wdriverj = new Item_ore("wdriverj");
	public static Item wdriverc = new Item_ore("wdriverc");
	public static Item wdrivert = new Item_ore("wdrivert");
	public static Item wdriverh = new Item_ore("wdriverh");
	public static Item wdriverm = new Item_ore("wdriverm");
	public static Item wdriverl = new Item_ore("wdriverl");
	public static Item wdriverx = new Item_ore("wdriverx");
	public static Item wdriverxca = new Item_ore("wdriverxca");
	public static Item wdriverjj = new Item_ore("wdriverjj");
	public static Item wdrivercc = new Item_ore("wdrivercc");
	public static Item wdriverf = new Item_ore("wdriverf");
	public static Item wdriversh = new Item_ore("wdriversh");
	public static Item wdriverki = new Item_ore("wdriverki");

	public static Item accel_driverb = new Item_ore("accel_driverb");
	public static Item accel_drivert = new Item_ore("accel_drivert");

	public static Item lostdriverc = new Item_ore("lostdriverc");
	public static Item lostdrivere = new Item_ore("lostdrivere");
	public static Item lostdriverj = new Item_ore("lostdriverj");

	public static Item accel_driver = new item_Wdriver("accel_driver",ArmorMaterial.DIAMOND, "accel").setMaxStackSize(1).setCreativeTab(Tabs.tabW);

	public static Item lostdriver = new item_Wdriver("lostdriver",ArmorMaterial.DIAMOND, "joker").setMaxStackSize(1).setCreativeTab(Tabs.tabW);
	public static Item lostdriver_skull = new item_Wdriver("lostdriver_skull",ArmorMaterial.DIAMOND, "skull").setMaxStackSize(1).setCreativeTab(Tabs.tabW);
	public static Item lostdriver_eternal = new item_Wdriver("lostdriver_eternal",ArmorMaterial.DIAMOND, "eternal").setMaxStackSize(1).setCreativeTab(Tabs.tabW);
	public static Item lostdriver_cyclone = new item_Wdriver("lostdriver_cyclone",ArmorMaterial.DIAMOND, "cyclone").setMaxStackSize(1).setCreativeTab(Tabs.tabW);

	public static Item cyclone_memory = new Item_memory(0, "3","cyclone_memory",1,20).setCreativeTab(Tabs.tabW);
	public static Item heat_memory = new Item_memory(1, "3","heat_memory",1,10).setCreativeTab(Tabs.tabW);
	public static Item luna_memory = new Item_memory(2, "3","luna_memory",1,10).setCreativeTab(Tabs.tabW);
	public static Item fang_memory = new Item_memory(3, "3","fang_memory").setCreativeTab(Tabs.tabW);

	public static Item joker_memory = new Item_memory(0, "1","joker_memory",0,20).setCreativeTab(Tabs.tabW);
	public static Item metal_memory = new Item_memory(1, "1","metal_memory",0,10).setCreativeTab(Tabs.tabW);
	public static Item trigger_memory = new Item_memory(2, "1","trigger_memory",0,10).setCreativeTab(Tabs.tabW);

	public static Item xtreme_memory = new Item_memory(1, "2","xtreme_memory").setCreativeTab(Tabs.tabW);
	public static Item xtreme_gold_memory = new Item_memory(2, "2","xtreme_gold_memory").setCreativeTab(Tabs.tabW);
	public static Item xtreme_accel_memory = new Item_memory(3, "2","xtreme_accel_memory").setCreativeTab(Tabs.tabW);

	public static Item cyclonecyclone_memory = new Item_memory(3, "1","cyclonecyclone_memory").setCreativeTab(Tabs.tabW);
	public static Item jokerjoker_memory = new Item_memory(4, "3","jokerjoker_memory").setCreativeTab(Tabs.tabW);

	public static Item joker_t2_memory = new Item_memory("joker_t2_memory",2,5).setCreativeTab(Tabs.tabW);
	public static Item skull_memory = new Item_memory("skull_memory",1,5).setCreativeTab(Tabs.tabW);
	
	public static Item eternal_t2_memory = new Item_memory(0, "4","eternal_t2_memory",2,5).setCreativeTab(Tabs.tabW);
	public static Item eternal_memory = new Item_memory(1, "4","eternal_memory",1,1).setCreativeTab(Tabs.tabW);

	public static Item accel_memory = new Item_memory(0, "5","accel_memory",0,5).setCreativeTab(Tabs.tabW);
	public static Item trial_memory = new Item_memory(1, "5","trial_memory").setCreativeTab(Tabs.tabW);
	public static Item accel_booster_memory = new Item_memory(2, "5","accel_booster_memory").setCreativeTab(Tabs.tabW);

	public static Item prism_memory = new Item_memory("prism_memory",1,5).setCreativeTab(Tabs.tabW);
	public static Item engine_memory = new Item_memory("engine_memory",1,5).setCreativeTab(Tabs.tabW);

	public static Item shippu_memory = new Item_memory(0, "3","shippu_memory").setCreativeTab(Tabs.tabW);
	public static Item kirifuda_memory = new Item_memory(0, "1","kirifuda_memory").setCreativeTab(Tabs.tabW);

	public static Item trial_memory_un = new Item_memory("trial_memory_un",0,2).setCreativeTab(Tabs.tabW);
	public static Item fang_memory_un = new Item_memory("fang_memory_un",1,5).setCreativeTab(Tabs.tabW);
	public static Item bomb_memory = new Item_memory("bomb_memory",1,1).setCreativeTab(Tabs.tabW);

	public static Item xtreme_memory_g = new Item_memory("xtreme_memory_g",0,1).setCreativeTab(Tabs.tabW);
	public static Item xtreme_memory_s = new Item_memory("xtreme_memory_s",1,1).setCreativeTab(Tabs.tabW);

	public static Item accel_t2_memory = new Item_memory("accel_t2_memory",2,1).setCreativeTab(Tabs.tabW);
	public static Item bird_t2_memory = new Item_memory("bird_t2_memory",2,1).setCreativeTab(Tabs.tabW);
	public static Item cyclone_t2_memory = new Item_memory("cyclone_t2_memory",2,1).setCreativeTab(Tabs.tabW);
	public static Item dummy_memory = new Item_memory("dummy_memory",2,1).setCreativeTab(Tabs.tabW);
	public static Item fang_t2_memory = new Item_memory("fang_t2_memory",2,1).setCreativeTab(Tabs.tabW);
	public static Item gene_t2_memory = new Item_memory("gene_t2_memory",2,1).setCreativeTab(Tabs.tabW);
	public static Item heat_t2_memory = new Item_memory("heat_t2_memory",2,1).setCreativeTab(Tabs.tabW);
	public static Item iceage_t2_memory = new Item_memory("iceage_t2_memory",2,1).setCreativeTab(Tabs.tabW);
	public static Item key_t2_memory = new Item_memory("key_t2_memory",2,1).setCreativeTab(Tabs.tabW);
	public static Item luna_t2_memory = new Item_memory("luna_t2_memory",2,1).setCreativeTab(Tabs.tabW);
	public static Item metal_t2_memory = new Item_memory("metal_t2_memory",2,1).setCreativeTab(Tabs.tabW);
	public static Item nasca_t2_memory = new Item_memory("nasca_t2_memory",2,1).setCreativeTab(Tabs.tabW);
	public static Item ocean_t2_memory = new Item_memory("ocean_t2_memory",2,1).setCreativeTab(Tabs.tabW);
	public static Item puppeteer_t2_memory = new Item_memory("puppeteer_t2_memory",2,1).setCreativeTab(Tabs.tabW);
	public static Item queen_t2_memory = new Item_memory("queen_t2_memory",2,1).setCreativeTab(Tabs.tabW);
	public static Item rocket_t2_memory = new Item_memory("rocket_t2_memory",2,1).setCreativeTab(Tabs.tabW);
	public static Item skull_t2_memory = new Item_memory("skull_t2_memory",2,1).setCreativeTab(Tabs.tabW);
	//public static Item trial_t2_memory = new Item_memory("trial_t2_memory",2,1).setCreativeTab(Tabs.tabW);
	public static Item trigger_t2_memory = new Item_memory("trigger_t2_memory",2,1).setCreativeTab(Tabs.tabW);
	public static Item unicorn_t2_memory = new Item_memory("unicorn_t2_memory",2,1).setCreativeTab(Tabs.tabW);
	public static Item violence_t2_memory = new Item_memory("violence_t2_memory",2,1).setCreativeTab(Tabs.tabW);
	public static Item weather_t2_memory = new Item_memory("weather_t2_memory",2,1).setCreativeTab(Tabs.tabW);
	public static Item xtreme_t2_memory = new Item_memory("xtreme_t2_memory",2,1).setCreativeTab(Tabs.tabW);
	public static Item yesterday_t2_memory = new Item_memory("yesterday_t2_memory",2,1).setCreativeTab(Tabs.tabW);
	public static Item zone_t2_memory  = new Item_memory(2, "4","zone_t2_memory",2,1).setCreativeTab(Tabs.tabW);

	public static Item unrefined_memory_g = new Item_ore("unrefined_memory_g").setCreativeTab(Tabs.tabW);
	public static Item unrefined_memory_s = new Item_ore("unrefined_memory_s").setCreativeTab(Tabs.tabW);
	public static Item unrefined_memory_t2 = new Item_ore("unrefined_memory_t2").setCreativeTab(Tabs.tabW);

	public static Item terror_memory = new Item_ore("terror_memory").setCreativeTab(Tabs.tabW);
	public static Item taboo_memory = new Item_ore("taboo_memory").setCreativeTab(Tabs.tabW);
	public static Item claydoll_memory = new Item_ore("claydoll_memory").setCreativeTab(Tabs.tabW);
	public static Item nasca_memory = new Item_ore("nasca_memory").setCreativeTab(Tabs.tabW);
	public static Item smilodon_memory = new Item_ore("smilodon_memory").setCreativeTab(Tabs.tabW);
	public static Item weather_memory = new Item_ore("weather_memory").setCreativeTab(Tabs.tabW);
	public static Item quetzalcoatlus_memory = new Item_ore("quetzalcoatlus_memory").setCreativeTab(Tabs.tabW);
	public static Item quetzalcoatlus_memory_prototype = new Item_ore("quetzalcoatlus_memory_prototype").setCreativeTab(Tabs.tabW);
	public static Item utopia_memory = new Item_ore("utopia_memory").setCreativeTab(Tabs.tabW);
	
	public static Item unicorn_memory = new Item_ore("unicorn_memory").setCreativeTab(Tabs.tabW);
	
	public static Item magma_memory = new Item_ore("magma_memory").setCreativeTab(Tabs.tabW);
	public static Item unicorn_memory_enhancing_adapter = new Item_ore("unicorn_memory_enhancing_adapter").setContainerItem(unicorn_memory).setCreativeTab(Tabs.tabW);
	
	public static Item commander_memory = new Item_ore("commander_memory").setCreativeTab(Tabs.tabW);
	public static Item commander_memory_enhancing_adapter = new Item_ore("commander_memory_enhancing_adapter").setContainerItem(commander_memory).setCreativeTab(Tabs.tabW);
	
	
	public static Item memory_memory = new Item_ore("memory_memory").setCreativeTab(Tabs.tabW);
	public static Item egg_chicken_memory = new Item_ore("egg_chicken_memory").setCreativeTab(Tabs.tabW);

	public static Item stag_memory = new Item_ore("stag_memory").setCreativeTab(Tabs.tabW);
	public static Item spider_memory = new Item_ore("spider_memory").setCreativeTab(Tabs.tabW);
	public static Item bat_memory = new Item_ore("bat_memory").setCreativeTab(Tabs.tabW);
	public static Item beetle_memory = new Item_ore("beetle_memory").setCreativeTab(Tabs.tabW);
	public static Item frog_memory = new Item_ore("frog_memory").setCreativeTab(Tabs.tabW);
	public static Item denden_memory = new Item_ore("denden_memory").setCreativeTab(Tabs.tabW);
	
	
	public static Item hard_boilder = new item_bikes("hard_boilder",Entityhardboilder::new).setMaxStackSize(1).setCreativeTab(Tabs.tabW);
	public static Item accel_bike = new item_bikes("accel_bike",Entityaccel::new).setMaxStackSize(1).setCreativeTab(Tabs.tabW);
	public static Item skull_boilder = new item_bikes("skull_boilder",Entityskullboilder::new).setMaxStackSize(1).setCreativeTab(Tabs.tabW);


	//OOO
	public static Item cellmedal = new Item_ore("cellmedal").setCreativeTab(Tabs.tabOOO);
	
	public static Item medajalibur = new ItemChargeSword("medajalibur",Tabs.medajalibur, RiderItems.cellmedal).setMaxStackSize(1).setCreativeTab(Tabs.tabOOO);

	public static Item tajaspinner = new Item_fireball_gun("tajaspinner",Tabs.tajaspinner, RiderItems.cellmedal).setMaxStackSize(1).setCreativeTab(Tabs.tabOOO);
	public static Item tajaspinner_eternity = new Item_fireball_gun("tajaspinner_eternity",Tabs.tajaspinner, RiderItems.cellmedal).setMaxStackSize(1).setCreativeTab(Tabs.tabOOO);

	public static Item medagaburyu = new Item_sword_gun("medagaburyu",Tabs.medagaburyu, RiderItems.cellmedal).setMaxStackSize(1).setCreativeTab(Tabs.tabOOO);

	public static Item birth_buster = new Item_gun("birth_buster",Tabs.birth_buster, RiderItems.cellmedal).setMaxStackSize(1).setCreativeTab(Tabs.tabOOO);
	public static Item deepest_harpoon = new ItemBaseSword("deepest_harpoon",Tabs.medagaburyu, RiderItems.cellmedal).setMaxStackSize(1).setCreativeTab(Tabs.tabOOO);

	public static Item ancient_ooo_greeed_sword = new ItemBaseSword("ancient_ooo_greeed_sword",Tabs.medagaburyu, RiderItems.cellmedal).setMaxStackSize(1).setCreativeTab(Tabs.tabOOO);

	
	public static Item OOOhead = new item_rider_armor("ooohead",item_Wdriver.class,ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.HEAD, cellmedal).setCreativeTab(Tabs.tabOOO);
	public static Item OOOtroso = new item_rider_armor("oootroso",item_Wdriver.class,ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.CHEST, cellmedal).setCreativeTab(Tabs.tabOOO);
	public static Item OOOlegs = new item_rider_armor("ooolegs",item_Wdriver.class,ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.LEGS, cellmedal).setCreativeTab(Tabs.tabOOO);

	public static Item taka_OOOdriver = new Item_ore("taka_ooodriver");
	public static Item kuwagata_OOOdriver = new Item_ore("kuwagata_ooodriver");
	public static Item lion_OOOdriver = new Item_ore("lion_ooodriver");
	public static Item sai_OOOdriver = new Item_ore("sai_ooodriver");
	public static Item shachi_OOOdriver = new Item_ore("shachi_ooodriver");
	public static Item ptera_OOOdriver = new Item_ore("ptera_ooodriver");
	public static Item cobra_OOOdriver = new Item_ore("cobra_ooodriver");
	public static Item super_taka_OOOdriver = new Item_ore("super_taka_ooodriver");
	public static Item same_OOOdriver = new Item_ore("same_ooodriver");
	public static Item shika_OOOdriver = new Item_ore("shika_ooodriver");
	public static Item seiuchi_OOOdriver = new Item_ore("seiuchi_ooodriver");
	public static Item mukade_OOOdriver = new Item_ore("mukade_ooodriver");
	public static Item sasori_new_OOOdriver = new Item_ore("sasori_new_ooodriver");

	public static Item tora_OOOdriver = new Item_ore("tora_ooodriver");
	public static Item kamakiri_OOOdriver = new Item_ore("kamakiri_ooodriver");
	public static Item gorilla_OOOdriver = new Item_ore("gorilla_ooodriver");
	public static Item kujaku_OOOdriver = new Item_ore("kujaku_ooodriver");
	public static Item unagi_OOOdriver = new Item_ore("unagi_ooodriver");
	public static Item tricera_OOOdriver = new Item_ore("tricera_ooodriver");
	public static Item kame_OOOdriver = new Item_ore("kame_ooodriver");
	public static Item imagin_OOOdriver = new Item_ore("imagin_ooodriver");
	public static Item panda_OOOdriver = new Item_ore("panda_ooodriver");
	public static Item super_tora_OOOdriver = new Item_ore("super_tora_ooodriver");
	public static Item kangaroo_OOOdriver = new Item_ore("kangaroo_ooodriver");
	public static Item kujira_OOOdriver = new Item_ore("kujira_ooodriver");
	public static Item gazelle_OOOdriver = new Item_ore("gazelle_ooodriver");
	public static Item shirokuma_OOOdriver = new Item_ore("shirokuma_ooodriver");
	public static Item hachi_OOOdriver = new Item_ore("hachi_ooodriver");
	public static Item kani_new_OOOdriver = new Item_ore("kani_new_ooodriver");
	public static Item yadokari_OOOdriver = new Item_ore("yadokari_ooodriver");

	public static Item batta_OOOdriver = new Item_ore("batta_ooodriver");
	public static Item cheetah_OOOdriver = new Item_ore("cheetah_ooodriver");
	public static Item zou_OOOdriver = new Item_ore("zou_ooodriver");
	public static Item condor_OOOdriver = new Item_ore("condor_ooodriver");
	public static Item tako_OOOdriver = new Item_ore("tako_ooodriver");
	public static Item tyranno_OOOdriver = new Item_ore("tyranno_ooodriver");
	public static Item wani_OOOdriver = new Item_ore("wani_ooodriver");
	public static Item shocker_OOOdriver = new Item_ore("shocker_ooodriver");
	public static Item super_batta_OOOdriver = new Item_ore("super_batta_ooodriver");
	public static Item kangaroo2_OOOdriver = new Item_ore("kangaroo2_ooodriver");
	public static Item ookamiuo_OOOdriver = new Item_ore("ookamiuo_ooodriver");
	public static Item ushi_OOOdriver = new Item_ore("ushi_ooodriver");
	public static Item penguin_OOOdriver = new Item_ore("penguin_ooodriver");
	public static Item ari_OOOdriver = new Item_ore("ari_ooodriver");
	public static Item ebi_new_OOOdriver = new Item_ore("ebi_new_ooodriver");

	public static Item love_OOOdriver = new Item_ore("love_ooodriver");
	public static Item love2_OOOdriver = new Item_ore("love2_ooodriver");
	public static Item love3_OOOdriver = new Item_ore("love3_ooodriver");

	public static Item tajador_wings = new Item_ore("tajador_wings");
	public static Item condor_wings = new Item_ore("condor_wings");

	public static Item OOOdriver = new item_OOOdriver("ooodriver",ArmorMaterial.DIAMOND, 4,"ooo").setMaxStackSize(1).setCreativeTab(Tabs.tabOOO);
	public static Item birth_driver = new item_OOOdriver("birth_driver",ArmorMaterial.DIAMOND, 4,"birth").setMaxStackSize(1).setCreativeTab(Tabs.tabOOO);
	public static Item birth_driver_prototype = new item_OOOdriver("birth_driver_prototype",ArmorMaterial.DIAMOND, 4,"birth_prototype").setMaxStackSize(1).setCreativeTab(Tabs.tabOOO);
	public static Item rebirth_driver = new item_OOOdriver("rebirth_driver",ArmorMaterial.DIAMOND, 4,"rebirth").setMaxStackSize(1).setCreativeTab(Tabs.tabOOO);
	public static Item birth_x_driver = new item_OOOdriver("birth_x_driver",ArmorMaterial.DIAMOND, 4,"birth_x").setMaxStackSize(1).setCreativeTab(Tabs.tabOOO);
	public static Item poseidon_driver = new item_OOOdriver("poseidon_driver",ArmorMaterial.DIAMOND, 4,"poseidon").setMaxStackSize(1).setCreativeTab(Tabs.tabOOO);
	public static Item aqua_driver = new item_OOOdriver("aqua_driver",ArmorMaterial.DIAMOND, 4,"aqua").setMaxStackSize(1).setCreativeTab(Tabs.tabOOO);

	public static Item core_driver = new item_OOOdriver("core_driver",ArmorMaterial.DIAMOND, 4,"core").setMaxStackSize(1).setCreativeTab(Tabs.tabOOO);
	public static Item core_driver_power_up = new item_OOOdriver("core_driver_power_up",ArmorMaterial.DIAMOND, 4,"core_power_up").setMaxStackSize(1).setCreativeTab(Tabs.tabOOO);

	public static Item greeed_blet_ankh = new item_OOOdriver("greeed_blet_ankh",ArmorMaterial.DIAMOND, 4,"ankh_complete").setMaxStackSize(1).setCreativeTab(Tabs.tabOOO);
	public static Item greeed_blet_ankh_lost = new item_OOOdriver("greeed_blet_ankh_lost",ArmorMaterial.DIAMOND, 4,"ankh_lost").setMaxStackSize(1).setCreativeTab(Tabs.tabOOO);
	public static Item greeed_blet_uva = new item_OOOdriver("greeed_blet_uva",ArmorMaterial.DIAMOND, 4,"uva_complete").setMaxStackSize(1).setCreativeTab(Tabs.tabOOO);
	public static Item greeed_blet_kazari = new item_OOOdriver("greeed_blet_kazari",ArmorMaterial.DIAMOND, 4,"kazari_complete").setMaxStackSize(1).setCreativeTab(Tabs.tabOOO);
	public static Item greeed_blet_mezool = new item_OOOdriver("greeed_blet_mezool",ArmorMaterial.DIAMOND, 4,"mezool_complete").setMaxStackSize(1).setCreativeTab(Tabs.tabOOO);
	public static Item greeed_blet_gamel = new item_OOOdriver("greeed_blet_gamel",ArmorMaterial.DIAMOND, 4,"gamel_complete").setMaxStackSize(1).setCreativeTab(Tabs.tabOOO);
    public static Item greeed_blet_muchiri = new item_OOOdriver("greeed_blet_muchiri",ArmorMaterial.DIAMOND, 4,"muchiri_complete").setMaxStackSize(1).setCreativeTab(Tabs.tabOOO);

	public static Item taka = new Itemmedal(0, "1","taka").setCreativeTab(Tabs.tabOOO);
	public static Item kuwagata = new Itemmedal(1, "1","kuwagata").setCreativeTab(Tabs.tabOOO);
	public static Item lion = new Itemmedal(2, "1","lion").setCreativeTab(Tabs.tabOOO);
	public static Item sai = new Itemmedal(3, "1","sai").setCreativeTab(Tabs.tabOOO);
	public static Item shachi = new Itemmedal(4, "1","shachi").setCreativeTab(Tabs.tabOOO);
	public static Item ptera = new Itemmedal(5, "1","ptera").setCreativeTab(Tabs.tabOOO);
	public static Item cobra = new Itemmedal(6, "1","cobra").setCreativeTab(Tabs.tabOOO);
	public static Item super_taka = new Itemmedal(7, "1","super_taka").setCreativeTab(Tabs.tabOOO);
	public static Item same = new Itemmedal(9, "1","same").setCreativeTab(Tabs.tabOOO);
	public static Item shika = new Itemmedal(10, "1","shika").setCreativeTab(Tabs.tabOOO);
	public static Item seiuchi = new Itemmedal(11, "1","seiuchi").setCreativeTab(Tabs.tabOOO);
	public static Item mukade = new Itemmedal(12, "1","mukade").setCreativeTab(Tabs.tabOOO);
	public static Item ebi_new = new Itemmedal(13, "1","ebi_new").setCreativeTab(Tabs.tabOOO);
	public static Item habataki = new Itemmedal(14, "1","habataki").setCreativeTab(Tabs.tabOOO);
	public static Item taka_ankh = new Itemmedal(15, "1","taka_ankh").setCreativeTab(Tabs.tabOOO);

	public static Item tora = new Itemmedal(0, "2","tora").setCreativeTab(Tabs.tabOOO);
	public static Item kamakiri = new Itemmedal(1, "2","kamakiri").setCreativeTab(Tabs.tabOOO);
	public static Item gorilla = new Itemmedal(2, "2","gorilla").setCreativeTab(Tabs.tabOOO);
	public static Item kujaku = new Itemmedal(3, "2","kujaku").setCreativeTab(Tabs.tabOOO);
	public static Item unagi = new Itemmedal(4, "2","unagi").setCreativeTab(Tabs.tabOOO);
	public static Item tricera = new Itemmedal(5, "2","tricera").setCreativeTab(Tabs.tabOOO);
	public static Item kame = new Itemmedal(6, "2","kame").setCreativeTab(Tabs.tabOOO);
	public static Item imagin = new Itemmedal(7, "2","imagin").setCreativeTab(Tabs.tabOOO);
	public static Item panda = new Itemmedal(8, "2","panda").setCreativeTab(Tabs.tabOOO);
	public static Item super_tora = new Itemmedal(9, "2","super_tora").setCreativeTab(Tabs.tabOOO);
	public static Item kangaroo = new Itemmedal(10, "2","kangaroo").Shift_form(9, "3").setCreativeTab(Tabs.tabOOO);
	public static Item kujira = new Itemmedal(12, "2","kujira").setCreativeTab(Tabs.tabOOO);
	public static Item gazelle = new Itemmedal(13, "2","gazelle").setCreativeTab(Tabs.tabOOO);
	public static Item shirokuma = new Itemmedal(14, "2","shirokuma").setCreativeTab(Tabs.tabOOO);
	public static Item hachi = new Itemmedal(15, "2","hachi").setCreativeTab(Tabs.tabOOO);
	public static Item kani_new = new Itemmedal(16, "2","kani_new").setCreativeTab(Tabs.tabOOO);
	public static Item yadokari = new Itemmedal(17, "2","yadokari").setCreativeTab(Tabs.tabOOO);
	public static Item taiga = new Itemmedal(18, "2","taiga").setCreativeTab(Tabs.tabOOO);

	public static Item batta = new Itemmedal(0, "3","batta").setCreativeTab(Tabs.tabOOO);
	public static Item cheetah = new Itemmedal(1, "3","cheetah").setCreativeTab(Tabs.tabOOO);
	public static Item zou = new Itemmedal(2, "3","zou").setCreativeTab(Tabs.tabOOO);
	public static Item condor = new Itemmedal(3, "3","condor").setCreativeTab(Tabs.tabOOO);
	public static Item tako = new Itemmedal(4, "3","tako").setCreativeTab(Tabs.tabOOO);
	public static Item tyranno = new Itemmedal(5, "3","tyranno").setCreativeTab(Tabs.tabOOO);
	public static Item wani = new Itemmedal(6, "3","wani").setCreativeTab(Tabs.tabOOO);
	public static Item shocker = new Itemmedal(7, "3","shocker").Shift_form(16, "1").setCreativeTab(Tabs.tabOOO);
	public static Item super_batta = new Itemmedal(8, "3","super_batta").setCreativeTab(Tabs.tabOOO);
	public static Item ookamiuo = new Itemmedal(11, "3","ookamiuo").setCreativeTab(Tabs.tabOOO);
	public static Item ushi = new Itemmedal(12, "3","ushi").setCreativeTab(Tabs.tabOOO);
	public static Item penguin = new Itemmedal(13, "3","penguin").setCreativeTab(Tabs.tabOOO);
	public static Item ari = new Itemmedal(14, "3","ari").setCreativeTab(Tabs.tabOOO);
	public static Item sasori_new = new Itemmedal(15, "3","sasori_new").setCreativeTab(Tabs.tabOOO);
	public static Item ichigo = new Itemmedal(16, "3","ichigo").setCreativeTab(Tabs.tabOOO);


	public static Item taka_eternity = new Itemmedal(17, "1","taka_eternity").setCreativeTab(Tabs.tabOOO);
	public static Item kujaku_eternity = new Itemmedal(20, "2","kujaku_eternity").setCreativeTab(Tabs.tabOOO);
	public static Item condor_eternity = new Itemmedal(18, "3","condor_eternity").setCreativeTab(Tabs.tabOOO);
	
	public static Item ancient_taka = new Itemmedal(18, "1","ancient_taka").setCreativeTab(Tabs.tabOOO);
	public static Item ancient_tora = new Itemmedal(21, "2","ancient_tora").setCreativeTab(Tabs.tabOOO);
	public static Item ancient_batta = new Itemmedal(19, "3","ancient_batta").setCreativeTab(Tabs.tabOOO);
	
	public static Item mukade_goda = new Itemmedal(20, "1","mukade_goda").setCreativeTab(Tabs.tabOOO);
	public static Item hachi_goda = new Itemmedal(23, "2","hachi_goda").setCreativeTab(Tabs.tabOOO);
	public static Item ari_goda = new Itemmedal(21, "3","ari_goda").setCreativeTab(Tabs.tabOOO);
	
	
	public static Item love_core = new Itemmedal(8, "1","love_core").setCreativeTab(Tabs.tabOOO);
	public static Item love_core2 = new Itemmedal(11, "2","love_core2").setCreativeTab(Tabs.tabOOO);
	public static Item love_core3 = new Itemmedal(10, "3","love_core3").setCreativeTab(Tabs.tabOOO);

	public static Item sasori = new Item_ore("sasori").setCreativeTab(Tabs.tabOOO);
	public static Item kani = new Item_ore("kani").setCreativeTab(Tabs.tabOOO);
	public static Item ebi = new Item_ore("ebi").setCreativeTab(Tabs.tabOOO);

	public static Item x_core = new Item_ore("x_core").setCreativeTab(Tabs.tabOOO);
	public static Item amazon_core = new Item_ore("amazon_core").setCreativeTab(Tabs.tabOOO);
	public static Item stronger_core = new Item_ore("stronger_core").setCreativeTab(Tabs.tabOOO);

	public static Item foundation_x_taka = new Itemmedal(0, "1","foundation_x_taka").setCreativeTab(Tabs.tabOOO);
	public static Item foundation_x_kuwagata = new Itemmedal(1, "1","foundation_x_kuwagata").setCreativeTab(Tabs.tabOOO);
	public static Item foundation_x_lion = new Itemmedal(2, "1","foundation_x_lion").setCreativeTab(Tabs.tabOOO);
	public static Item foundation_x_sai = new Itemmedal(3, "1","foundation_x_sai").setCreativeTab(Tabs.tabOOO);
	public static Item foundation_x_shachi = new Itemmedal(4, "1","foundation_x_shachi").setCreativeTab(Tabs.tabOOO);

	public static Item foundation_x_tora = new Itemmedal(0, "2","foundation_x_tora").setCreativeTab(Tabs.tabOOO);
	public static Item foundation_x_kamakiri = new Itemmedal(1, "2","foundation_x_kamakiri").setCreativeTab(Tabs.tabOOO);
	public static Item foundation_x_gorilla = new Itemmedal(2, "2","foundation_x_gorilla").setCreativeTab(Tabs.tabOOO);
	public static Item foundation_x_kujaku = new Itemmedal(3, "2","foundation_x_kujaku").setCreativeTab(Tabs.tabOOO);
	public static Item foundation_x_unagi = new Itemmedal(4, "2","foundation_x_unagi").setCreativeTab(Tabs.tabOOO);

	public static Item foundation_x_batta = new Itemmedal(0, "3","foundation_x_batta").setCreativeTab(Tabs.tabOOO);
	public static Item foundation_x_cheetah = new Itemmedal(1, "3","foundation_x_cheetah").setCreativeTab(Tabs.tabOOO);
	public static Item foundation_x_zou = new Itemmedal(2, "3","foundation_x_zou").setCreativeTab(Tabs.tabOOO);
	public static Item foundation_x_condor = new Itemmedal(3, "3","foundation_x_condor").setCreativeTab(Tabs.tabOOO);
	public static Item foundation_x_tako = new Itemmedal(4, "3","foundation_x_tako").setCreativeTab(Tabs.tabOOO);

	public static Item zeus_taka = new Itemmedal(0, "1","zeus_taka").setCreativeTab(Tabs.tabOOO);
	public static Item zeus_kuwagata = new Itemmedal(1, "1","zeus_kuwagata").setCreativeTab(Tabs.tabOOO);
	public static Item zeus_lion = new Itemmedal(2, "1","zeus_lion").setCreativeTab(Tabs.tabOOO);
	public static Item zeus_sai = new Itemmedal(3, "1","zeus_sai").setCreativeTab(Tabs.tabOOO);
	public static Item zeus_shachi = new Itemmedal(4, "1","zeus_shachi").setCreativeTab(Tabs.tabOOO);
	public static Item zeus_ptera = new Itemmedal(5, "1","zeus_ptera").setCreativeTab(Tabs.tabOOO);
	public static Item zeus_mukade = new Itemmedal(12, "1","zeus_mukade").setCreativeTab(Tabs.tabOOO);

	public static Item zeus_tora = new Itemmedal(0, "2","zeus_tora").setCreativeTab(Tabs.tabOOO);
	public static Item zeus_kamakiri = new Itemmedal(1, "2","zeus_kamakiri").setCreativeTab(Tabs.tabOOO);
	public static Item zeus_gorilla = new Itemmedal(2, "2","zeus_gorilla").setCreativeTab(Tabs.tabOOO);
	public static Item zeus_kujaku = new Itemmedal(3, "2","zeus_kujaku").setCreativeTab(Tabs.tabOOO);
	public static Item zeus_unagi = new Itemmedal(4, "2","zeus_unagi").setCreativeTab(Tabs.tabOOO);
	public static Item zeus_tricera = new Itemmedal(5, "2","zeus_tricera").setCreativeTab(Tabs.tabOOO);
	public static Item zeus_hachi = new Itemmedal(15, "2","zeus_hachi").setCreativeTab(Tabs.tabOOO);

	public static Item zeus_batta = new Itemmedal(0, "3","zeus_batta").setCreativeTab(Tabs.tabOOO);
	public static Item zeus_cheetah = new Itemmedal(1, "3","zeus_cheetah").setCreativeTab(Tabs.tabOOO);
	public static Item zeus_zou = new Itemmedal(2, "3","zeus_zou").setCreativeTab(Tabs.tabOOO);
	public static Item zeus_condor = new Itemmedal(3, "3","zeus_condor").setCreativeTab(Tabs.tabOOO);
	public static Item zeus_tako = new Itemmedal(4, "3","zeus_tako").setCreativeTab(Tabs.tabOOO);
	public static Item zeus_tyranno = new Itemmedal(5, "3","zeus_tyranno").setCreativeTab(Tabs.tabOOO);
	public static Item zeus_ari = new Itemmedal(14, "3","zeus_ari").setCreativeTab(Tabs.tabOOO);

	public static Item gel_shocker_core = new Itemmedal(19, "2","gel_shocker_core").setCreativeTab(Tabs.tabOOO);
	public static Item destron_core = new Itemmedal(17, "3","destron_core").setCreativeTab(Tabs.tabOOO);
	public static Item god_core = new Item_ore("god_core").setCreativeTab(Tabs.tabOOO);
	public static Item garanda_core = new Item_ore("garanda_core").setCreativeTab(Tabs.tabOOO);
	public static Item delza_core = new Item_ore("delza_core").setCreativeTab(Tabs.tabOOO);
	public static Item neo_shocker_core = new Item_ore("neo_shocker_core").setCreativeTab(Tabs.tabOOO);
	public static Item jin_dogma_core = new Item_ore("jin_dogma_core").setCreativeTab(Tabs.tabOOO);
	public static Item badan_core = new Item_ore("badan_core").setCreativeTab(Tabs.tabOOO);

	public static Item birth_core= new Item_ore("birth_core").setCreativeTab(Tabs.tabOOO);
	public static Item proto_birth_core = new Item_ore("proto_birth_core").setCreativeTab(Tabs.tabOOO);

	public static Item birth_core_cutter_wing= new Itemmedal(1, "birth","birth_core_cutter_wing").setCreativeTab(Tabs.tabOOO);
	public static Item cutter_wing= new Item_ore("cutter_wing");
	public static Item birth_core_catepillar_leg= new Itemmedal(2, "birth","birth_core_catepillar_leg").setCreativeTab(Tabs.tabOOO);
	public static Item birth_core_crane_arm= new Itemmedal(3, "birth","birth_core_crane_arm").setCreativeTab(Tabs.tabOOO);
	public static Item birth_core_drill_arm= new Itemmedal(4, "birth","birth_core_drill_arm").setCreativeTab(Tabs.tabOOO);
	public static Item birth_core_shovel_arm= new Itemmedal(5, "birth","birth_core_shovel_arm").setCreativeTab(Tabs.tabOOO);
	public static Item birth_core_breast_cannon= new Itemmedal(6, "birth","birth_core_breast_cannon").setCreativeTab(Tabs.tabOOO);
	public static Item birth_core_eyes= new Itemmedal(7, "birth","birth_core_eyes").setCreativeTab(Tabs.tabOOO);
	
	public static Item cell_alloy_ingot= new Item_ore("cell_alloy_ingot").setCreativeTab(Tabs.tabOOO);
	
	public static Item taka_candroid= new item_candroid("taka_candroid", entity_taka_can::new).setCreativeTab(Tabs.tabOOO);
	public static Item tako_candroid= new item_candroid("tako_candroid", entity_tako_can::new).setCreativeTab(Tabs.tabOOO);
	public static Item batta_candroid= new item_candroid("batta_candroid", entity_batta_can::new).setCreativeTab(Tabs.tabOOO);
	public static Item tora_candroid= new item_candroid("tora_candroid", entity_tora_can::new).setCreativeTab(Tabs.tabOOO);
	public static Item denkiunagi_candroid= new item_candroid("denkiunagi_candroid", entity_unagi_can::new).setCreativeTab(Tabs.tabOOO);
	public static Item gorilla_candroid= new item_candroid("gorilla_candroid", entity_gorilla_can::new).setCreativeTab(Tabs.tabOOO);
	public static Item kujaku_candroid= new item_candroid("kujaku_candroid", entity_kujaku_can::new).setCreativeTab(Tabs.tabOOO);
	public static Item ptera_candroid= new item_candroid("ptera_candroid", entity_ptera_can::new).setCreativeTab(Tabs.tabOOO);
	public static Item torikera_candroid= new item_candroid("torikera_candroid", entity_tricera_can::new).setCreativeTab(Tabs.tabOOO);
	public static Item furifuri_candroid= new Item_ore("furifuri_candroid").setCreativeTab(Tabs.tabOOO);
	
	public static Item purple_medals_sealed = new Item_ore("purple_medals_sealed").setCreativeTab(Tabs.tabOOO);
	public static Item purple_medals_opened = new Item_purple_medals("purple_medals_opened").setCreativeTab(Tabs.tabOOO);
	public static Item purple_medals_empty = new Item_ore("purple_medals_empty").setCreativeTab(Tabs.tabOOO);
	
	public static Item greeed_absorption_core = new Item_ore("greeed_absorption_core").setCreativeTab(Tabs.tabOOO);
	
	public static Item o_scanner = new Itemo_scanner("o_scanner").setCreativeTab(Tabs.tabOOO);
	
	public static Item ride_vendor = new item_bikes("ride_vendor",EntityRidevendor::new).setMaxStackSize(1).setCreativeTab(Tabs.tabOOO);
	

	
	//Fourze
	
	public static Item astroswitch = new Item_ore("astroswitch").setCreativeTab(Tabs.tabFourze);

	public static Item billytherod = new ItemBaseSword("billytherod",ToolMaterial.DIAMOND, RiderItems.astroswitch).setMaxStackSize(1).setCreativeTab(Tabs.tabFourze);
	public static Item hee_hackgun = new Item_fireball_gun("hee_hackgun", ToolMaterial.DIAMOND, RiderItems.astroswitch).setMaxStackSize(1).setCreativeTab(Tabs.tabFourze);
	public static Item barizun_sword = new ItemChargeSword("barizun_sword",ToolMaterial.DIAMOND, RiderItems.astroswitch).setMaxStackSize(1).setCreativeTab(Tabs.tabFourze);
	
	public static Item shield_module = new ItemBaseShield("shield_module", RiderItems.astroswitch).setMaxStackSize(1).setCreativeTab(Tabs.tabFourze);
	
	
	public static Item meteor_storm_shaft = new ItemBaseSword("meteor_storm_shaft",ToolMaterial.DIAMOND, RiderItems.astroswitch).setMaxStackSize(1).setCreativeTab(Tabs.tabFourze);

	public static Item Fourzehead = new item_rider_armor("fourzehead",item_Fourzedriver.class,ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.HEAD, astroswitch).setCreativeTab(Tabs.tabFourze);
	public static Item Fourzetroso = new item_rider_armor("fourzetroso",item_Fourzedriver.class,ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.CHEST, astroswitch).setCreativeTab(Tabs.tabFourze);
	public static Item Fourzelegs = new item_rider_armor("fourzelegs",item_Fourzedriver.class,ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.LEGS, astroswitch).setCreativeTab(Tabs.tabFourze);
	
	public static Item Fourzedriver = new item_Fourzedriver("fourzedriver",ArmorMaterial.DIAMOND, "fourze").setMaxStackSize(1).setCreativeTab(Tabs.tabFourze);
	public static Item meteor_driver = new item_Fourzedriver("meteor_driver",ArmorMaterial.DIAMOND, "meteor").setMaxStackSize(1).setCreativeTab(Tabs.tabFourze);
	public static Item nadeshikodriver = new item_Fourzedriver("nadeshikodriver",ArmorMaterial.DIAMOND, "nadeshiko").setMaxStackSize(1).setCreativeTab(Tabs.tabFourze);

	public static Item ikaros_wing = new Item_ore("ikaros_wing");
	public static Item ikarosdriver = new item_Fourzedriver("ikarosdriver",ArmorMaterial.DIAMOND, "ikaros").setMaxStackSize(1).setCreativeTab(Tabs.tabFourze);
	
	public static Item ginga_oh_driver = new item_Fourzedriver("ginga_oh_driver",ArmorMaterial.DIAMOND, "super_gingaoh").setMaxStackSize(1).setCreativeTab(Tabs.tabFourze);


	public static Item rocket_swich = new Item_astroswitch(0, "1","circle",1,"rocket_swich").AddToAstroSwitchProgrammer(20).setCreativeTab(Tabs.tabFourze);
	public static Item launcher_switch = new Item_astroswitch(0,"0","cross",1,"launcher_switch").AddToAstroSwitchProgrammer(20).setCreativeTab(Tabs.tabFourze);
	public static Item drill_switch = new Item_astroswitch(0, "0","triangle",1,"drill_switch").AddToAstroSwitchProgrammer(20).setCreativeTab(Tabs.tabFourze);
	public static Item radar_switch = new Item_astroswitch(0, "0","square",1,"radar_switch").AddToAstroSwitchProgrammer(20).setCreativeTab(Tabs.tabFourze);
	public static Item magic_hand_switch = new Item_astroswitch(0, "0","circle",2,"magic_hand_switch").AddToAstroSwitchProgrammer(15).setCreativeTab(Tabs.tabFourze);
	public static Item camera_switch = new Item_astroswitch(0, "0","square",2,"camera_switch").AddToAstroSwitchProgrammer(15).setCreativeTab(Tabs.tabFourze);
	public static Item parachute_switch = new Item_astroswitch(0, "0","square",3,"parachute_switch").AddToAstroSwitchProgrammer(15).setCreativeTab(Tabs.tabFourze);
	public static Item chainsaw_switch = new Item_astroswitch(0,"0","cross",2,"chainsaw_switch").AddToAstroSwitchProgrammer(15).setCreativeTab(Tabs.tabFourze);
	public static Item hopping_switch = new Item_astroswitch(0, "0","triangle",2,"hopping_switch").AddToAstroSwitchProgrammer(15).setCreativeTab(Tabs.tabFourze);

	public static Item elek_swich = new Item_astroswitch(1, "1","circle",3,"elek_swich").AddToAstroSwitchProgrammer(15).setCreativeTab(Tabs.tabFourze);
	public static Item scissors_switch = new Item_astroswitch(0, "0","square",4,"scissors_switch").AddToAstroSwitchProgrammer(10).setCreativeTab(Tabs.tabFourze);
	public static Item beat_switch = new Item_astroswitch(0,"0","cross",3,"beat_switch").AddToAstroSwitchProgrammer(10).setCreativeTab(Tabs.tabFourze);
	public static Item chain_array_switch = new Item_astroswitch(0, "0","circle",4,"chain_array_switch").AddToAstroSwitchProgrammer(10).setCreativeTab(Tabs.tabFourze);
	public static Item smoke_switch = new Item_astroswitch(0,"0","cross",4,"smoke_switch").AddToAstroSwitchProgrammer(10).setCreativeTab(Tabs.tabFourze);
	public static Item spike_switch = new Item_astroswitch(0, "0","triangle",3,"spike_switch").AddToAstroSwitchProgrammer(10).setCreativeTab(Tabs.tabFourze);
	public static Item winch_switch = new Item_astroswitch(0, "0","square",5,"winch_switch").AddToAstroSwitchProgrammer(10).setCreativeTab(Tabs.tabFourze);
	public static Item flash_switch = new Item_astroswitch(0, "0","circle",5,"flash_switch").AddToAstroSwitchProgrammer(10).setCreativeTab(Tabs.tabFourze);
	public static Item shield_switch = new Item_astroswitch(0, "0","square",6,"shield_switch").AddToAstroSwitchProgrammer(10).setCreativeTab(Tabs.tabFourze);
	public static Item gatling_switch = new Item_astroswitch(0, "0","triangle",4,"gatling_switch").AddToAstroSwitchProgrammer(10).setCreativeTab(Tabs.tabFourze);

	public static Item fire_swich = new Item_astroswitch(2, "1","circle",6,"fire_swich").AddToAstroSwitchProgrammer(10).setCreativeTab(Tabs.tabFourze);
	public static Item stealth_switch = new Item_astroswitch(0,"0","cross",5,"stealth_switch").AddToAstroSwitchProgrammer(5).setCreativeTab(Tabs.tabFourze);
	public static Item hammer_switch = new Item_astroswitch(0, "0","square",7,"hammer_switch").AddToAstroSwitchProgrammer(5).setCreativeTab(Tabs.tabFourze);
	public static Item water_switch = new Item_astroswitch(0, "0","triangle",5,"water_switch").AddToAstroSwitchProgrammer(5).setCreativeTab(Tabs.tabFourze);
	public static Item medical_switch = new Item_astroswitch(0, "0","square",8,"medical_switch").AddToAstroSwitchProgrammer(5).setCreativeTab(Tabs.tabFourze);
	public static Item pen_switch = new Item_astroswitch(0,"0","cross",6,"pen_switch").AddToAstroSwitchProgrammer(5).setCreativeTab(Tabs.tabFourze);
	public static Item wheel_switch = new Item_astroswitch(0, "0","triangle",6,"wheel_switch").AddToAstroSwitchProgrammer(5).setCreativeTab(Tabs.tabFourze);
	public static Item screw_switch = new Item_astroswitch(0, "0","triangle",7,"screw_switch").AddToAstroSwitchProgrammer(5).setCreativeTab(Tabs.tabFourze);
	public static Item hand_switch = new Item_astroswitch(0,"0","cross",7,"hand_switch").AddToAstroSwitchProgrammer(5).setCreativeTab(Tabs.tabFourze);
	public static Item schop_switch = new Item_astroswitch(0, "0","circle",7,"schop_switch").AddToAstroSwitchProgrammer(5).setCreativeTab(Tabs.tabFourze);

	public static Item magnet_swich_n = new Item_astroswitch(3, "1","circle",8,"magnet_swich_n").AddToAstroSwitchProgrammer(5).setCreativeTab(Tabs.tabFourze);
	public static Item magnet_swich_s = new Item_astroswitch(3, "1","square",0,"magnet_swich_s").AddToAstroSwitchProgrammer(5).setCreativeTab(Tabs.tabFourze);
	public static Item freeze_switch = new Item_astroswitch(0,"0","cross",8,"freeze_switch").AddToAstroSwitchProgrammer(2).setCreativeTab(Tabs.tabFourze);
	public static Item claw_switch = new Item_astroswitch(0, "0","circle",9,"claw_switch").AddToAstroSwitchProgrammer(2).setCreativeTab(Tabs.tabFourze);
	public static Item board_switch = new Item_astroswitch(0, "0","triangle",8,"board_switch").AddToAstroSwitchProgrammer(2).setCreativeTab(Tabs.tabFourze);
	public static Item giantfoot_switch = new Item_astroswitch(0,"0","cross",9,"giantfoot_switch").AddToAstroSwitchProgrammer(2).setCreativeTab(Tabs.tabFourze);
	public static Item aero_switch = new Item_astroswitch(0, "0","triangle",9,"aero_switch").AddToAstroSwitchProgrammer(2).setCreativeTab(Tabs.tabFourze);
	public static Item gyro_switch = new Item_astroswitch(0, "0","square",10,"gyro_switch").AddToAstroSwitchProgrammer(2).setCreativeTab(Tabs.tabFourze);
	public static Item net_switch = new Item_astroswitch(0,"0","cross",10,"net_switch").AddToAstroSwitchProgrammer(2).setCreativeTab(Tabs.tabFourze);
	public static Item stamper_switch = new Item_astroswitch(0, "0","triangle",10,"stamper_switch").AddToAstroSwitchProgrammer(2).setCreativeTab(Tabs.tabFourze);

	public static Item cosmic_swich = new Item_astroswitch(4, "1","circle",10,"cosmic_swich").AddToAstroSwitchProgrammer(1).setCreativeTab(Tabs.tabFourze);

	public static Item super_rocket_swich = new Item_astroswitch(5, "1","circle",1,"super_rocket_swich").setCreativeTab(Tabs.tabFourze);
	public static Item super_launcher_swich = new Item_astroswitch(9, "1","circle",14,"super_launcher_swich").setCreativeTab(Tabs.tabFourze);
	public static Item super_drill_swich = new Item_ore("super_drill_swich").setCreativeTab(Tabs.tabFourze);

	public static Item clear_drill_swich = new Item_astroswitch(6, "1","circle",13,"clear_drill_swich").setCreativeTab(Tabs.tabFourze);
	public static Item fusion_swich = new Item_astroswitch(7, "1","circle",11,"fusion_swich").setCreativeTab(Tabs.tabFourze);

	public static Item meteor_swich = new Item_astroswitch(0, "2","meteor",0,"meteor_swich").setCreativeTab(Tabs.tabFourze);
	public static Item meteor_storm_swich = new Item_astroswitch(1, "2","meteor",0,"meteor_storm_swich").setCreativeTab(Tabs.tabFourze);

	public static Item nadeshiko_switch = new Item_ore("nadeshiko_switch").setCreativeTab(Tabs.tabFourze);

	public static Item solu_switch = new Item_ore("solu_switch").setCreativeTab(Tabs.tabFourze);
	public static Item core_switch = new Item_ore("core_switch").setCreativeTab(Tabs.tabFourze);
	public static Item gate_switch = new item_gate_switch("gate_switch").setCreativeTab(Tabs.tabFourze);
	public static Item rocket_swich_christmas_ver = new Item_ore("rocket_swich_christmas_ver").setCreativeTab(Tabs.tabFourze);
	
	public static Item rider1_switch = new Item_astroswitch(0,"0","cross",13,"rider1_switch").AddLegendCrafting(ShowaRiderItems.typhoon_ichigo).setCreativeTab(Tabs.tabFourze);
	public static Item rider2_switch = new Item_astroswitch(0, "0","square",14,"rider2_switch").AddLegendCrafting(ShowaRiderItems.typhoon_nigo).setCreativeTab(Tabs.tabFourze);
	public static Item v3_switch = new Item_astroswitch(0, "0","triangle",13,"v3_switch").AddLegendCrafting(ShowaRiderItems.double_typhoon_core).setCreativeTab(Tabs.tabFourze);
	public static Item riderman_switch = new Item_astroswitch(0, "0","circle",15,"riderman_switch").AddLegendCrafting(ShowaRiderItems.riderman_belt_core).setCreativeTab(Tabs.tabFourze);
	public static Item x_switch = new Item_astroswitch(0,"0","cross",14,"x_switch").AddLegendCrafting(ShowaRiderItems.ridol_core).setCreativeTab(Tabs.tabFourze);
	public static Item amazon_switch = new Item_astroswitch(0, "0","square",15,"amazon_switch").AddLegendCrafting(ShowaRiderItems.condorer_wheel).setCreativeTab(Tabs.tabFourze);
	public static Item stronger_switch = new Item_astroswitch(0, "0","circle",16,"stronger_switch").AddLegendCrafting(ShowaRiderItems.electrer_core).setCreativeTab(Tabs.tabFourze);
	public static Item skyrider_switch = new Item_astroswitch(0, "0","cross",18,"skyrider_switch").AddLegendCrafting(ShowaRiderItems.tornado_core).setCreativeTab(Tabs.tabFourze);
	public static Item super_1_switch = new Item_astroswitch(0, "0","square",19,"super_1_switch").AddLegendCrafting(ShowaRiderItems.cyclode_core).setCreativeTab(Tabs.tabFourze);
	public static Item zx_switch = new Item_astroswitch(0, "0","circle",19,"zx_switch").AddLegendCrafting(ShowaRiderItems.zx_belt_core).setCreativeTab(Tabs.tabFourze);
	public static Item black_switch = new Item_astroswitch(0, "0","triangle",18,"black_switch").AddLegendCrafting(ShowaRiderItems.king_stone_core).setCreativeTab(Tabs.tabFourze);
	public static Item rx_switch = new Item_astroswitch(0, "0","circle",20,"rx_switch").AddLegendCrafting(ShowaRiderItems.king_stone_split).setCreativeTab(Tabs.tabFourze);
	public static Item kuuga_switch = new Item_astroswitch(0,"0","cross",15,"kuuga_switch").AddLegendCrafting(kuuga_mighty).setCreativeTab(Tabs.tabFourze);
	public static Item agito_switch = new Item_astroswitch(0, "0","triangle",14,"agito_switch").AddLegendCrafting(agito_ground).setCreativeTab(Tabs.tabFourze);
	public static Item ryuki_switch = new Item_astroswitch(0, "0","circle",17,"ryuki_switch").AddLegendCrafting(dragreder_advent).setCreativeTab(Tabs.tabFourze);
	public static Item faiz_switch = new Item_astroswitch(0,"0","cross",16,"faiz_switch").AddLegendCrafting(faiz_mission_memory).setCreativeTab(Tabs.tabFourze);
	public static Item blade_switch = new Item_astroswitch(0,"0","cross",17,"blade_switch").AddLegendCrafting(changebeetle).setCreativeTab(Tabs.tabFourze);
	public static Item hibiki_switch = new Item_astroswitch(0, "0","square",16,"hibiki_switch").AddLegendCrafting(henshin_onsa).setCreativeTab(Tabs.tabFourze);
	public static Item kabuto_switch = new Item_astroswitch(0, "0","triangle",15,"kabuto_switch").AddLegendCrafting(kabuto_zecter).setCreativeTab(Tabs.tabFourze);
	public static Item den_o_switch = new Item_astroswitch(0, "0","circle",18,"den_o_switch").AddLegendCrafting(rider_ticket_sword).setCreativeTab(Tabs.tabFourze);
	public static Item kiva_switch = new Item_astroswitch(0, "0","triangle",16,"kiva_switch").AddLegendCrafting(wakeupfuestle).setCreativeTab(Tabs.tabFourze);
	public static Item decade_switch = new Item_astroswitch(0, "0","triangle",17,"decade_switch").AddLegendCrafting(decadecard).setCreativeTab(Tabs.tabFourze);
	public static Item double_switch = new Item_astroswitch(0, "0","square",17,"double_switch").AddLegendCrafting(joker_memory).setCreativeTab(Tabs.tabFourze);
	public static Item ooo_switch = new Item_astroswitch(0, "0","square",18,"ooo_switch").AddLegendCrafting(taka).setCreativeTab(Tabs.tabFourze);
	
	// Wizard
	public static Item wizardgem = new Item_ore("wizardgem").setCreativeTab(Tabs.tabwizard);
	public static Block wizardgemblock = new ore_block("wizardgemblock",Material.ROCK, wizardgem, 2).setHardness(9.9F).setCreativeTab(Tabs.tabwizard);

	
	public static Item wizarswordgun = new Item_sword_gun("wizarswordgun",Tabs.wizarswordgun, RiderItems.wizardgem).setMaxStackSize(1).setCreativeTab(Tabs.tabwizard);
	public static Item axcalibur = new ItemChargeSword("axcalibur",Tabs.axcalibur, RiderItems.wizardgem).setMaxStackSize(1).setCreativeTab(Tabs.tabwizard);
	public static Item wizarswordgun_mage = new Item_sword_gun("wizarswordgun_mage",Tabs.wizarswordgun, RiderItems.wizardgem).setMaxStackSize(1).setCreativeTab(Tabs.tabwizard);
	public static Item hammelcane = new ItemBaseSword("hammelcane",Tabs.hammelcane, RiderItems.wizardgem).setMaxStackSize(1).setCreativeTab(Tabs.tabwizard);
	public static Item dis_halberd = new ItemBaseSword("dis_halberd",Tabs.dis_halberd, RiderItems.wizardgem).setMaxStackSize(1).setCreativeTab(Tabs.tabwizard);
	public static Item mirage_magnum = new Item_gun("mirage_magnum",Tabs.den_dengu, RiderItems.wizardgem).setMaxStackSize(1).setCreativeTab(Tabs.tabwizard);
	public static Item dice_saber = new ItemBaseSword("dice_saber",Tabs.den_denso, RiderItems.wizardgem).setMaxStackSize(1).setCreativeTab(Tabs.tabwizard);

	public static Item wizardhead = new item_rider_armor("wizardhead",item_wizarddriver.class,ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.HEAD, wizardgem).setCreativeTab(Tabs.tabwizard);
	public static Item wizardtroso = new item_rider_armor("wizardtroso",item_wizarddriver.class,ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.CHEST, wizardgem).setCreativeTab(Tabs.tabwizard);
	public static Item wizardlegs = new item_rider_armor("wizardlegs",item_wizarddriver.class,ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.LEGS, wizardgem).setCreativeTab(Tabs.tabwizard);

	public static Item wizardriver = new item_wizarddriver("wizardriver",ArmorMaterial.DIAMOND, "wizard").setMaxStackSize(1).setCreativeTab(Tabs.tabwizard);
	public static Item beastdriver = new item_wizarddriver("beastdriver",ArmorMaterial.DIAMOND, "beast").setMaxStackSize(1).setCreativeTab(Tabs.tabwizard);
	public static Item whitewizardriver = new item_wizarddriver("whitewizardriver",ArmorMaterial.DIAMOND, "wiseman").setMaxStackSize(1).setCreativeTab(Tabs.tabwizard);
	public static Item magewizardriver = new item_wizarddriver("magewizardriver",ArmorMaterial.DIAMOND, "mage").setMaxStackSize(1).setCreativeTab(Tabs.tabwizard);
	public static Item magewizardriver_b = new item_wizarddriver("magewizardriver_b",ArmorMaterial.DIAMOND, "mage_b").setMaxStackSize(1).setCreativeTab(Tabs.tabwizard);
	public static Item magewizardriver_g = new item_wizarddriver("magewizardriver_g",ArmorMaterial.DIAMOND, "mage_g").setMaxStackSize(1).setCreativeTab(Tabs.tabwizard);
	public static Item magewizardriver_foot_soldiers = new item_wizarddriver("magewizardriver_foot_soldiers",ArmorMaterial.DIAMOND, "mage_foot_soldiers").setMaxStackSize(1).setCreativeTab(Tabs.tabwizard);
	public static Item magewizardriver_captain = new item_wizarddriver("magewizardriver_captain",ArmorMaterial.DIAMOND, "mage_captain").setMaxStackSize(1).setCreativeTab(Tabs.tabwizard);
	
	public static Item sorcererdriver = new item_wizarddriver("sorcererdriver",ArmorMaterial.DIAMOND, "sorcerer").setMaxStackSize(1).setCreativeTab(Tabs.tabwizard);
	public static Item whitewizardriverf = new item_wizarddriver("whitewizardriverf",ArmorMaterial.DIAMOND, "wiseman_f").setMaxStackSize(1).setCreativeTab(Tabs.tabwizard);

	public static Item darkwizardriver = new item_wizarddriver("darkwizardriver",ArmorMaterial.DIAMOND, "dark_wizard").setMaxStackSize(1).setCreativeTab(Tabs.tabwizard);
	public static Item blackwizardriver = new item_wizarddriver("blackwizardriver",ArmorMaterial.DIAMOND, "black_wizard").setMaxStackSize(1).setCreativeTab(Tabs.tabwizard);

	public static Item flame_ring = new Item_wizard_ring(0, "1","flame_ring").AddToList(item_unknown_wizard_ring.red_wizard_ring, 5).setCreativeTab(Tabs.tabwizard);
	public static Item water_ring = new Item_wizard_ring(1, "1","water_ring").AddToList(item_unknown_wizard_ring.blue_wizard_ring, 5).setCreativeTab(Tabs.tabwizard);
	public static Item hurricane_ring = new Item_wizard_ring(2, "1","hurricane_ring").AddToList(item_unknown_wizard_ring.green_wizard_ring, 5).setCreativeTab(Tabs.tabwizard);
	public static Item land_ring = new Item_wizard_ring(3, "1","land_ring").AddToList(item_unknown_wizard_ring.yellow_wizard_ring, 5).setCreativeTab(Tabs.tabwizard);
	public static Item flame_ring_dragon = new Item_wizard_ring(4, "1","flame_ring_dragon").AddToList(item_unknown_wizard_ring.red_wizard_ring, 1).setCreativeTab(Tabs.tabwizard);
	public static Item water_ring_dragon = new Item_wizard_ring(5, "1","water_ring_dragon").AddToList(item_unknown_wizard_ring.blue_wizard_ring, 1).setCreativeTab(Tabs.tabwizard);
	public static Item hurricane_ring_dragon = new Item_wizard_ring(6, "1","hurricane_ring_dragon").AddToList(item_unknown_wizard_ring.green_wizard_ring, 1).setCreativeTab(Tabs.tabwizard);
	public static Item land_ring_dragon = new Item_wizard_ring(7, "1","land_ring_dragon").AddToList(item_unknown_wizard_ring.yellow_wizard_ring, 1).setCreativeTab(Tabs.tabwizard);
	public static Item infinity_ring = new Item_wizard_ring(8, "1","infinity_ring").setCreativeTab(Tabs.tabwizard);

	public static Item drago_timer = new Item_wizard_ring(1, "2","drago_timer").setCreativeTab(Tabs.tabwizard);
	public static Item special_ring = new Item_wizard_ring(2, "2","special_ring").AddToList(item_unknown_wizard_ring.red_wizard_ring, 1).setCreativeTab(Tabs.tabwizard);
	public static Item finish_strike_ring = new Item_wizard_ring(3 , "2","finish_strike_ring").setCreativeTab(Tabs.tabwizard);
	public static Item hope_ring = new Item_ore("hope_ring").setCreativeTab(Tabs.tabwizard);
	public static Item special_rush_ring = new Item_wizard_ring(9 , "2","special_rush_ring").AddToList(item_unknown_wizard_ring.amber_wizard_ring, 1).setCreativeTab(Tabs.tabwizard);
	
	public static Item beast_ring = new Item_wizard_ring(0, "3","beast_ring").AddToList(item_unknown_wizard_ring.beast_wizard_ring,5).setCreativeTab(Tabs.tabwizard);
	public static Item falco_ring = new Item_wizard_ring(1, "3","falco_ring").AddToList(item_unknown_wizard_ring.beast_wizard_ring,3).setCreativeTab(Tabs.tabwizard);
	public static Item chameleo_ring = new Item_wizard_ring(2, "3","chameleo_ring").AddToList(item_unknown_wizard_ring.beast_wizard_ring,3).setCreativeTab(Tabs.tabwizard);
	public static Item buffa_ring = new Item_wizard_ring(3, "3","buffa_ring").AddToList(item_unknown_wizard_ring.beast_wizard_ring,3).setCreativeTab(Tabs.tabwizard);
	public static Item dolphi_ring = new Item_wizard_ring(4, "3","dolphi_ring").AddToList(item_unknown_wizard_ring.beast_wizard_ring,3).setCreativeTab(Tabs.tabwizard);
	public static Item hyper_ring = new Item_wizard_ring(5, "3","hyper_ring").AddToList(item_unknown_wizard_ring.beast_wizard_ring,1).setCreativeTab(Tabs.tabwizard);

	
	public static Item wiseman_ring = new Item_ore("wiseman_ring").setCreativeTab(Tabs.tabwizard);
	public static Item mage_o_ring = new Item_ore("mage_o_ring").AddToList(item_unknown_wizard_ring.amber_wizard_ring, 1).setCreativeTab(Tabs.tabwizard);
	public static Item mage_b_ring = new Item_ore("mage_b_ring").AddToList(item_unknown_wizard_ring.blue_wizard_ring, 1).setCreativeTab(Tabs.tabwizard);
	public static Item mage_g_ring = new Item_ore("mage_g_ring").AddToList(item_unknown_wizard_ring.green_wizard_ring, 1).setCreativeTab(Tabs.tabwizard);
	public static Item sorcerer_ring = new Item_ore("sorcerer_ring").AddToList(item_unknown_wizard_ring.black_wizard_ring, 1).setCreativeTab(Tabs.tabwizard);
	public static Item black_ring = new Item_ore("black_ring").AddToList(item_unknown_wizard_ring.black_wizard_ring, 1).setCreativeTab(Tabs.tabwizard);
	public static Item dark_ring = new Item_ore("dark_ring").AddToList(item_unknown_wizard_ring.violet_wizard_ring, 1).setCreativeTab(Tabs.tabwizard);

	public static Item light_ring = new Item_wizard_rings_efts(1 , "0","light_ring").AddToList(item_unknown_wizard_ring.amber_wizard_ring, 1).setMaxStackSize(1).setCreativeTab(Tabs.tabwizard);
	public static Item excite_ring = new Item_wizard_rings_efts(2 , "0","excite_ring").AddToList(item_unknown_wizard_ring.amber_wizard_ring, 1).setMaxStackSize(1).setCreativeTab(Tabs.tabwizard);
	public static Item defend_ring = new Item_wizard_rings_efts(3 , "0","defend_ring").AddToList(item_unknown_wizard_ring.amber_wizard_ring, 1).setMaxStackSize(1).setCreativeTab(Tabs.tabwizard);
	public static Item thunder_ring = new Item_wizard_rings_efts(4 , "0","thunder_ring").AddToList(item_unknown_wizard_ring.green_wizard_ring, 1).setMaxStackSize(1).setCreativeTab(Tabs.tabwizard);
	public static Item explosion_ring = new Item_wizard_rings_efts(5 , "0","explosion_ring").AddToList(item_unknown_wizard_ring.violet_wizard_ring, 1).setMaxStackSize(1).setCreativeTab(Tabs.tabwizard);
	public static Item sleep_ring = new Item_wizard_rings_efts(6 , "0","sleep_ring").AddToList(item_unknown_wizard_ring.amber_wizard_ring, 1).setMaxStackSize(1).setCreativeTab(Tabs.tabwizard);
	public static Item bind_ring = new Item_wizard_rings_efts(7 , "0","bind_ring").AddToList(item_unknown_wizard_ring.amber_wizard_ring, 1).setMaxStackSize(1).setCreativeTab(Tabs.tabwizard);
	public static Item teleport_ring = new Item_wizard_rings_efts(8 , "0","teleport_ring").AddToList(item_unknown_wizard_ring.violet_wizard_ring, 1).setMaxStackSize(1).setCreativeTab(Tabs.tabwizard);
	public static Item fall_ring = new Item_wizard_rings_efts(9 , "0","fall_ring").AddToList(item_unknown_wizard_ring.cyan_wizard_ring, 1).setMaxStackSize(1).setCreativeTab(Tabs.tabwizard);
	public static Item connect_ring = new Item_wizard_rings_efts(10 , "0","connect_ring").AddToList(item_unknown_wizard_ring.amber_wizard_ring, 1).setMaxStackSize(1).setCreativeTab(Tabs.tabwizard);
	public static Item kick_strike_ring = new Item_wizard_rings_efts(11 , "0","kick_strike_ring").AddToList(item_unknown_wizard_ring.amber_wizard_ring, 1).setMaxStackSize(1).setCreativeTab(Tabs.tabwizard);
	public static Item eclipse_ring = new Item_wizard_rings_efts(12 , "0","eclipse_ring").AddToList(item_unknown_wizard_ring.violet_wizard_ring, 1).setMaxStackSize(1).setCreativeTab(Tabs.tabwizard);
	public static Item liquid_ring = new Item_wizard_rings_efts(13 , "0","liquid_ring").AddToList(item_unknown_wizard_ring.amber_wizard_ring, 1).setMaxStackSize(1).setCreativeTab(Tabs.tabwizard);
	public static Item drill_ring = new Item_wizard_rings_efts(14 , "0","drill_ring").AddToList(item_unknown_wizard_ring.amber_wizard_ring, 1).setMaxStackSize(1).setCreativeTab(Tabs.tabwizard);
	public static Item big_ring = new Item_wizard_rings_efts(15 , "0","big_ring").AddToList(item_unknown_wizard_ring.amber_wizard_ring, 1).setMaxStackSize(1).setCreativeTab(Tabs.tabwizard);
	public static Item small_ring = new Item_wizard_rings_efts(16 , "0","small_ring").AddToList(item_unknown_wizard_ring.amber_wizard_ring, 1).setMaxStackSize(1).setCreativeTab(Tabs.tabwizard);
	public static Item dress_up_ring = new Item_wizard_ring(11, "1","dress_up_ring").AddToList(item_unknown_wizard_ring.amber_wizard_ring, 1).setCreativeTab(Tabs.tabwizard);


	public static Item engage_ring = new Item_ore("engage_ring").AddToList(item_unknown_wizard_ring.amber_wizard_ring, 1).setMaxStackSize(1).setCreativeTab(Tabs.tabwizard);
	public static Item please_ring = new Item_ore("please_ring").AddToList(item_unknown_wizard_ring.amber_wizard_ring, 1).setMaxStackSize(1).setCreativeTab(Tabs.tabwizard);

	public static Item driver_on_ring = new Item_ore("driver_on_ring").setMaxStackSize(1).setCreativeTab(Tabs.tabwizard);
	public static Item driver_on_ring_white_wizard = new Item_ore("driver_on_ring_white_wizard").setMaxStackSize(1).setCreativeTab(Tabs.tabwizard);
	
	public static Item common_wizard_ring = new Item_ore("common_wizard_ring").AddToList(item_unknown_wizard_ring.amber_wizard_ring, 1).setMaxStackSize(1).setCreativeTab(Tabs.tabwizard);
	public static Item chichin_pui_pui_ring = new Item_ore("chichin_pui_pui_ring").AddToList(item_unknown_wizard_ring.amber_wizard_ring, 1).setMaxStackSize(1).setCreativeTab(Tabs.tabwizard);
	public static Item create_ring = new Item_ore("create_ring").AddToList(item_unknown_wizard_ring.black_wizard_ring, 1).setMaxStackSize(1).setCreativeTab(Tabs.tabwizard);
	
	public static Item copy_ring = new Item_ore("copy_ring").AddToList(item_unknown_wizard_ring.amber_wizard_ring, 1).setMaxStackSize(1).setCreativeTab(Tabs.tabwizard);
	public static Item smell_ring = new Item_ore("smell_ring").AddToList(item_unknown_wizard_ring.amber_wizard_ring, 1).setMaxStackSize(1).setCreativeTab(Tabs.tabwizard);
	public static Item extend_ring = new Item_ore("extend_ring").AddToList(item_unknown_wizard_ring.amber_wizard_ring, 1).setMaxStackSize(1).setCreativeTab(Tabs.tabwizard);
	public static Item merry_christmas_ring = new Item_ore("merry_christmas_ring").AddToList(item_unknown_wizard_ring.amber_wizard_ring, 1).setMaxStackSize(1).setCreativeTab(Tabs.tabwizard);			
	public static Item blizzard_ring = new Item_ore("blizzard_ring").AddToList(item_unknown_wizard_ring.blue_wizard_ring, 1).setMaxStackSize(1).setCreativeTab(Tabs.tabwizard);
	public static Item gravity_ring = new Item_ore("gravity_ring").AddToList(item_unknown_wizard_ring.yellow_wizard_ring, 1).setMaxStackSize(1).setCreativeTab(Tabs.tabwizard);
	public static Item miracle_ring = new Item_ore("miracle_ring").AddToList(item_unknown_wizard_ring.cyan_wizard_ring, 1).setMaxStackSize(1).setCreativeTab(Tabs.tabwizard);
	public static Item flower_ring = new Item_ore("flower_ring").AddToList(item_unknown_wizard_ring.amber_wizard_ring, 1).setMaxStackSize(1).setCreativeTab(Tabs.tabwizard);
	public static Item dance_ring = new Item_ore("dance_ring").setMaxStackSize(1).setCreativeTab(Tabs.tabwizard);
	public static Item time_ring = new Item_ore("time_ring").AddToList(item_unknown_wizard_ring.cyan_wizard_ring, 1).setMaxStackSize(1).setCreativeTab(Tabs.tabwizard);
	public static Item holy_ring = new Item_ore("holy_ring").setMaxStackSize(1).setCreativeTab(Tabs.tabwizard);
	
	
	public static Item beast_engage_ring = new Item_ore("beast_engage_ring").AddToList(item_unknown_wizard_ring.beast_wizard_ring,1).setCreativeTab(Tabs.tabwizard);
	public static Item chimarise_ring = new Item_ore("chimarise_ring").AddToList(item_unknown_wizard_ring.beast_wizard_ring,1).setCreativeTab(Tabs.tabwizard);
	public static Item beast_driver_on_ring = new Item_ore("beast_driver_on_ring").setCreativeTab(Tabs.tabwizard);
	
	
	public static Item fourze_engage_ring = new Item_ore("fourze_engage_ring").setMaxStackSize(1).setCreativeTab(Tabs.tabwizard);
	public static Item super_sentai_ring = new Item_ore("super_sentai_ring").setMaxStackSize(1).setCreativeTab(Tabs.tabwizard);

	public static Item unknown_amber_ring = new item_unknown_wizard_ring("unknown_amber_ring").setCreativeTab(Tabs.tabwizard);
	public static Item unknown_red_ring = new item_unknown_wizard_ring("unknown_red_ring").setCreativeTab(Tabs.tabwizard);
	public static Item unknown_blue_ring = new item_unknown_wizard_ring("unknown_blue_ring").setCreativeTab(Tabs.tabwizard);
	public static Item unknown_green_ring = new item_unknown_wizard_ring("unknown_green_ring").setCreativeTab(Tabs.tabwizard);
	public static Item unknown_yellow_ring = new item_unknown_wizard_ring("unknown_yellow_ring").setCreativeTab(Tabs.tabwizard);
	public static Item unknown_violet_ring = new item_unknown_wizard_ring("unknown_violet_ring").setCreativeTab(Tabs.tabwizard);
	public static Item unknown_black_ring = new item_unknown_wizard_ring("unknown_black_ring").setCreativeTab(Tabs.tabwizard);
	public static Item unknown_cyan_ring = new item_unknown_wizard_ring("unknown_cyan_ring").setCreativeTab(Tabs.tabwizard);
	public static Item unknown_beast_ring = new item_unknown_wizard_ring("unknown_beast_ring").setCreativeTab(Tabs.tabwizard);

	public static Item wizard_gem_crafting_chisel = new Item_ore("wizard_gem_crafting_chisel").keep_item().setCreativeTab(Tabs.tabwizard);
	
	
	public static Item wizardgem_red = new Item_ore("wizardgem_red").setCreativeTab(Tabs.tabwizard);
	public static Item wizardgem_blue = new Item_ore("wizardgem_blue").setCreativeTab(Tabs.tabwizard);
	public static Item wizardgem_green = new Item_ore("wizardgem_green").setCreativeTab(Tabs.tabwizard);
	public static Item wizardgem_yellow = new Item_ore("wizardgem_yellow").setCreativeTab(Tabs.tabwizard);
	public static Item wizardgem_violet = new Item_ore("wizardgem_violet").setCreativeTab(Tabs.tabwizard);
	public static Item wizardgem_black = new Item_ore("wizardgem_black").setCreativeTab(Tabs.tabwizard);
	public static Item wizardgem_cyan = new Item_ore("wizardgem_cyan").setCreativeTab(Tabs.tabwizard);
	public static Item philosophers_stone = new Item_ore("philosophers_stone").setCreativeTab(Tabs.tabwizard);
	
	//Gaim
	public static Item himawari_lockseed = new Item_ore("himawari_lockseed").setCreativeTab(Tabs.tabGaim);
	public static Item himawari_energy_lockseed = new Item_ore("himawari_energy_lockseed").setCreativeTab(Tabs.tabGaim);

	
	public static Item musou_saber = new ItemBaseSword("musou_saber",Tabs.musou_saber, RiderItems.himawari_lockseed).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
	public static Item musou_saber_naginata = new ItemBaseSword("musou_saber_naginata",Tabs.musou_saber_naginata, RiderItems.himawari_lockseed).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
	public static Item blood_musou_saber_naginata = new ItemBaseSword("blood_musou_saber_naginata",Tabs.musou_saber_naginata, RiderItems.himawari_lockseed).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
	public static Item musou_saber_kusarigama = new ItemBaseSword("musou_saber_kusarigama",Tabs.musou_saber_kusarigama, RiderItems.himawari_lockseed).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
	public static Item dj_gun = new Item_gun("dj_gun",Tabs.dj_gun, RiderItems.himawari_lockseed).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);

	public static Item dj_gun_taiken_mode = new ItemBaseSword("dj_gun_taiken_mode",Tabs.dj_gun_taiken_mode, RiderItems.himawari_lockseed).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);

	public static Item zangetsu_dj_gun = new Item_gun("zangetsu_dj_gun",Tabs.dj_gun, RiderItems.himawari_lockseed).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
	public static Item zangetsu_dj_gun_taiken_mode = new ItemBaseSword("zangetsu_dj_gun_taiken_mode",Tabs.dj_gun_taiken_mode, RiderItems.himawari_lockseed).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);


	public static Item joeshuimu = new ItemBaseSword("joeshuimu",Tabs.dj_gun_taiken_mode, RiderItems.himawari_lockseed).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
	public static Item sheimu = new ItemBaseSword("sheimu",Tabs.dj_gun_taiken_mode, RiderItems.himawari_lockseed).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
	public static Item dau = new ItemBaseSword("dau",Tabs.dj_gun_taiken_mode, RiderItems.himawari_lockseed).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
	public static Item guronbaryamu = new ItemBaseSword("guronbaryamu",Tabs.dj_gun_taiken_mode, RiderItems.himawari_lockseed).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);

	public static Item shine_donkachi= new ItemBaseSword("shine_donkachi",Tabs.donkachi, RiderItems.himawari_lockseed).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
	public static Item shine_lychee_sword = new ItemBaseSword("shine_lychee_sword",Tabs.dj_gun_taiken_mode, RiderItems.himawari_lockseed).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
	public static Item hells_cane = new ItemBaseSword("hells_cane",Tabs.dj_gun_taiken_mode, RiderItems.himawari_lockseed).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);

	public static Item kagematsu = new ItemBaseSword("kagematsu",Tabs.kagematsu, RiderItems.himawari_lockseed).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
	public static Item donkachi= new ItemBaseSword("donkachi",Tabs.donkachi, RiderItems.himawari_lockseed).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
	public static Item melon_defender = new ItemBaseShield("melon_defender", RiderItems.himawari_lockseed).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
	public static Item pine_iron = new ItemBaseSword("pine_iron",Tabs.pine_iron, RiderItems.himawari_lockseed).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
	public static Item ichigo_kunai = new ItemBaseSword("ichigo_kunai",Tabs.ichigo_kunai, RiderItems.himawari_lockseed).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
	public static Item daidaimaru = new ItemBaseSword("daidaimaru",Tabs.daidaimaru, RiderItems.himawari_lockseed).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
	public static Item banana_spear= new ItemBaseSword("banana_spear",Tabs.banana_spear, RiderItems.himawari_lockseed).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
	public static Item budou_ryuhou = new Item_gun("budou_ryuhou",Tabs.budou_ryuhou, RiderItems.himawari_lockseed).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
	public static Item mango_punisher = new ItemBaseSword("mango_punisher",Tabs.mango_punisher, RiderItems.himawari_lockseed).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
	public static Item duri_noko = new ItemBaseSword("duri_noko",Tabs.duri_noko, RiderItems.himawari_lockseed).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
	public static Item kiwi_gekirin = new ItemBaseSword("kiwi_gekirin",Tabs.kiwi_gekirin, RiderItems.himawari_lockseed).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
	public static Item sonic_arrow = new Item_gun("sonic_arrow",Tabs.sonic_arrow, RiderItems.himawari_lockseed).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
	public static Item kagematsu_shin = new ItemBaseSword("kagematsu_shin",Tabs.kagematsu_shin, RiderItems.himawari_lockseed).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
	public static Item suika_sojinto = new ItemBaseSword("suika_sojinto",Tabs.suika_sojinto, RiderItems.himawari_lockseed).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
	public static Item suika_sojinto_baron_ver = new ItemBaseSword("suika_sojinto_baron_ver",Tabs.suika_sojinto_baron_ver, RiderItems.himawari_lockseed).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
	public static Item suika_sojinto_knuckle_ver = new ItemBaseSword("suika_sojinto_knuckle_ver",Tabs.suika_sojinto_baron_ver, RiderItems.himawari_lockseed).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);

	public static Item king_duri_noko = new ItemBaseSword("king_duri_noko",Tabs.duri_noko, RiderItems.himawari_lockseed).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);

	public static Item blood_daidaimaru = new ItemBaseSword("blood_daidaimaru",Tabs.daidaimaru, RiderItems.himawari_lockseed).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
	public static Item yomimaru = new ItemBaseSword("yomimaru",Tabs.yomimaru, RiderItems.himawari_lockseed).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
	public static Item sword_bringer = new ItemBaseSword("sword_bringer",Tabs.sword_bringer, RiderItems.himawari_lockseed).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
	public static Item apple_reflecter = new ItemBaseShield("apple_reflecter", RiderItems.himawari_lockseed).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);

	public static Item lemon_rapier = new ItemBaseSword("lemon_rapier",Tabs.daidaimaru, RiderItems.himawari_lockseed).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);

	public static Item souginjou = new ItemBaseSword("souginjou",Tabs.souginjou, RiderItems.himawari_lockseed).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
	public static Item dark_daidaimaru = new ItemBaseSword("dark_daidaimaru",Tabs.daidaimaru, RiderItems.himawari_lockseed).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
	public static Item watermelon_defender = new ItemBaseShield("watermelon_defender", RiderItems.himawari_lockseed).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
	public static Item savior_arrow = new Item_gun("savior_arrow",Tabs.savior_arrow, RiderItems.himawari_lockseed).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);

	public static Item kabi_daidaimaru = new ItemBaseSword("kabi_daidaimaru",ToolMaterial.WOOD, RiderItems.himawari_lockseed).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
	public static Item maja_yomimaru = new ItemBaseSword("maja_yomimaru",Tabs.yomimaru, RiderItems.himawari_lockseed).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);

	public static Item Gaimhead = new item_rider_armor("gaimhead",item_Gaimdriver.class,ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.HEAD, himawari_lockseed).setCreativeTab(Tabs.tabGaim);
	public static Item Gaimtroso = new item_rider_armor("gaimtroso",item_Gaimdriver.class,ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.CHEST, himawari_lockseed).setCreativeTab(Tabs.tabGaim);
	public static Item Gaimlegs = new item_rider_armor("gaimlegs",item_Gaimdriver.class,ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.LEGS, himawari_lockseed).setCreativeTab(Tabs.tabGaim);


	public static Item sengoku_driver_matsubokkuri  = new Item_ore("sengoku_driver_matsubokkuri");
	public static Item sengoku_driver_kurumi  = new Item_ore("sengoku_driver_kurumi");
	public static Item sengoku_driver_donguri  = new Item_ore("sengoku_driver_donguri");
	public static Item sengoku_driver_melon  = new Item_ore("sengoku_driver_melon");
	public static Item sengoku_driver_pine  = new Item_ore("sengoku_driver_pine");
	public static Item sengoku_driver_ichigo  = new Item_ore("sengoku_driver_ichigo");
	public static Item sengoku_driver_orange  = new Item_ore("sengoku_driver_orange");
	public static Item sengoku_driver_banana  = new Item_ore("sengoku_driver_banana");
	public static Item sengoku_driver_budou = new Item_ore("sengoku_driver_budou");
	public static Item sengoku_driver_suika  = new Item_ore("sengoku_driver_suika");
	public static Item sengoku_driver_mango  = new Item_ore("sengoku_driver_mango");
	public static Item sengoku_driver_durian  = new Item_ore("sengoku_driver_durian");
	public static Item sengoku_driver_kiwi  = new Item_ore("sengoku_driver_kiwi");
	public static Item sengoku_driver_lemon  = new Item_ore("sengoku_driver_lemon");

	public static Item sengoku_driver_lemon_energy  = new Item_ore("sengoku_driver_lemon_energy");
	public static Item sengoku_driver_jinba_lemon = new Item_ore("sengoku_driver_jinba_lemon");
	public static Item lemon_energy_lockseed = new Item_lockseed(2,13,"lemon_energy_lockseed").setCreativeTab(Tabs.tabGaim);

	public static Item sengoku_driver_cherry_energy  = new Item_ore("sengoku_driver_cherry_energy");
	public static Item sengoku_driver_jinba_cherry = new Item_ore("sengoku_driver_jinba_cherry");
	public static Item cherry_energy_lockseed = new Item_lockseed(2,14,"cherry_energy_lockseed").setCreativeTab(Tabs.tabGaim);

	public static Item sengoku_driver_peach_energy  = new Item_ore("sengoku_driver_peach_energy");
	public static Item sengoku_driver_jinba_peach = new Item_ore("sengoku_driver_jinba_peach");
	public static Item peach_energy_lockseed = new Item_lockseed(2,15,"peach_energy_lockseed").setCreativeTab(Tabs.tabGaim);

	public static Item sengoku_driver_melon_energy = new Item_ore("sengoku_driver_melon_energy");
	public static Item sengoku_driver_jinba_melon = new Item_ore("sengoku_driver_jinba_melon");
	public static Item sengoku_driver_jinba_melon_melon = new Item_ore("sengoku_driver_jinba_melon_melon");
	public static Item sengoku_driver_jinba_melon_durian = new Item_ore("sengoku_driver_jinba_melon_durian");
	public static Item melon_energy_lockseed = new Item_lockseed(2,16,"melon_energy_lockseed").setCreativeTab(Tabs.tabGaim);

	public static Item sengoku_driver_matsubokkuri_energy  = new Item_ore("sengoku_driver_matsubokkuri_energy");
	public static Item matsubokkuri_energy_lockseed = new Item_lockseed(2,21,"matsubokkuri_energy_lockseed").setCreativeTab(Tabs.tabGaim);

	public static Item sengoku_driver_jinba_dragon = new Item_ore("sengoku_driver_jinba_dragon");
	public static Item sengoku_driver_dragon_fruits_energy  = new Item_ore("sengoku_driver_dragon_fruits_energy");
	public static Item dragon_fruits_energy_lockseed = new Item_lockseed(2,42,"dragon_fruits_energy_lockseed").setCreativeTab(Tabs.tabGaim);

	public static Item sengoku_driver_jinba_marron = new Item_ore("sengoku_driver_jinba_marron");
	public static Item marron_energy_lockseed = new Item_lockseed(2,46,"marron_energy_lockseed").setCreativeTab(Tabs.tabGaim);

	public static Item sengoku_driver_kachidoki  = new Item_ore("sengoku_driver_kachidoki");
	public static Item kachidoki_lockseed  = new Item_lockseed(3,22,"kachidoki_lockseed").setCreativeTab(Tabs.tabGaim);
	public static Item sengoku_driver_kiwami = new Item_ore("sengoku_driver_kiwami");
	public static Item kiwami_lockseed  = new Item_lockseed(3,23,"kiwami_lockseed").setCreativeTab(Tabs.tabGaim);
	public static Item sengoku_driver_yomotsu_heguri  = new Item_ore("sengoku_driver_yomotsu_heguri");
	public static Item yomotsu_heguri_lockseed = new Item_lockseed(1,24,"yomotsu_heguri_lockseed").setCreativeTab(Tabs.tabGaim);

	public static Item sengoku_driver_blood_orange  = new Item_ore("sengoku_driver_blood_orange");
	public static Item blood_orange_lockseed = new Item_lockseed(1,25,"blood_orange_lockseed").setCreativeTab(Tabs.tabGaim);
	public static Item sengoku_driver_fifteen_lock  = new Item_ore("sengoku_driver_fifteen_lock");
	public static Item fifteen_lockseed = new Item_lockseed(1,26,"fifteen_lockseed").setCreativeTab(Tabs.tabGaim);
	public static Item sengoku_driver_golden_ringo  = new Item_ore("sengoku_driver_golden_ringo");
	public static Item golden_ringo_lockseed = new Item_lockseed(1,27,"golden_ringo_lockseed").setCreativeTab(Tabs.tabGaim);
	public static Item sengoku_driver_silver_ringo  = new Item_ore("sengoku_driver_silver_ringo");
	public static Item silver_ringo_lockseed = new Item_lockseed(1,28,"silver_ringo_lockseed").setCreativeTab(Tabs.tabGaim);
	public static Item sengoku_driver_black_ringo  = new Item_ore("sengoku_driver_black_ringo");
	public static Item black_ringo_lockseed = new Item_lockseed(1,29,"black_ringo_lockseed").setCreativeTab(Tabs.tabGaim);
	public static Item sengoku_driver_watermelon  = new Item_ore("sengoku_driver_watermelon");
	public static Item watermelon_lockseed = new Item_lockseed(1,30,"watermelon_lockseed").setCreativeTab(Tabs.tabGaim);
	public static Item sengoku_driver_forbidden_ringo  = new Item_ore("sengoku_driver_forbidden_ringo");
	public static Item forbidden_ringo_lockseed = new Item_lockseed(1,31,"forbidden_ringo_lockseed").setCreativeTab(Tabs.tabGaim);
	public static Item sengoku_driver_blood_zakuro  = new Item_ore("sengoku_driver_blood_zakuro");
	public static Item zakuro_lockseed = new Item_lockseed(1,47,"zakuro_lockseed").setCreativeTab(Tabs.tabGaim);
	public static Item sengoku_driver_black_baron  = new Item_ore("sengoku_driver_black_baron");
	public static Item black_baron_lockseed  = new Item_lockseed(1,8,"black_baron_lockseed").setCreativeTab(Tabs.tabGaim);

	public static Item sengoku_driver_zangetsu_kachidoki  = new Item_ore("sengoku_driver_zangetsu_kachidoki");
	public static Item zangetsu_kachidoki_lockseed  = new Item_lockseed(3,65,"zangetsu_kachidoki_lockseed").setCreativeTab(Tabs.tabGaim);

	public static Item sengoku_driver_jinba_black  = new Item_ore("sengoku_driver_jinba_black");
	public static Item dark_orange_lockseed = new Item_lockseed(3,33,"dark_orange_lockseed").setCreativeTab(Tabs.tabGaim);
	public static Item dark_lemon_energy_lockseed = new Item_lockseed(3,33,"dark_lemon_energy_lockseed").setCreativeTab(Tabs.tabGaim);

	public static Item sengoku_driver_orange_fr  = new Item_ore("sengoku_driver_orange_fr");
	public static Item fresh_orange_lockseed = new Item_lockseed(1,44,"fresh_orange_lockseed").setCreativeTab(Tabs.tabGaim);
	public static Item fresh_pine_lockseed = new Item_ore("fresh_pine_lockseed").setCreativeTab(Tabs.tabGaim);

	public static Item sengoku_driver_natsumikan  = new Item_ore("sengoku_driver_natsumikan");
	public static Item natsumikan_lockseed = new Item_lockseed(1,63,"natsumikan_lockseed").setCreativeTab(Tabs.tabGaim);

	public static Item sengoku_driver_drive  = new Item_ore("sengoku_driver_drive");
	public static Item drive_lockseed  = new Item_lockseed(4,45,"drive_lockseed").setCreativeTab(Tabs.tabGaim);
	public static Item sengoku_driver_wizard  = new Item_ore("sengoku_driver_wizard");
	public static Item wizard_lockseed  = new Item_lockseed(4,34,"wizard_lockseed").setCreativeTab(Tabs.tabGaim);
	public static Item sengoku_driver_fourze  = new Item_ore("sengoku_driver_fourze");
	public static Item fourze_lockseed  = new Item_lockseed(4,35,"fourze_lockseed").setCreativeTab(Tabs.tabGaim);
	public static Item sengoku_driver_ooo  = new Item_ore("sengoku_driver_ooo");
	public static Item ooo_lockseed  = new Item_lockseed(4,36,"ooo_lockseed").setCreativeTab(Tabs.tabGaim);
	public static Item sengoku_driver_w  = new Item_ore("sengoku_driver_w");
	public static Item w_lockseed  = new Item_lockseed(4,37,"w_lockseed").setCreativeTab(Tabs.tabGaim);
	public static Item sengoku_driver_decade  = new Item_ore("sengoku_driver_decade");
	public static Item decade_lockseed  = new Item_lockseed(4,38,"decade_lockseed").setCreativeTab(Tabs.tabGaim);

	public static Item sengoku_driver_kuuga  = new Item_ore("sengoku_driver_kuuga");
	public static Item kuuga_lockseed  = new Item_lockseed(4,48,"kuuga_lockseed").setCreativeTab(Tabs.tabGaim);

	public static Item sengoku_driver_agito  = new Item_ore("sengoku_driver_agito");
	public static Item agito_lockseed  = new Item_lockseed(4,49,"agito_lockseed").setCreativeTab(Tabs.tabGaim);

	public static Item sengoku_driver_ryuki  = new Item_ore("sengoku_driver_ryuki");
	public static Item ryuki_lockseed  = new Item_lockseed(4,50,"ryuki_lockseed").setCreativeTab(Tabs.tabGaim);

	public static Item sengoku_driver_faiz  = new Item_ore("sengoku_driver_faiz");
	public static Item faiz_lockseed  = new Item_lockseed(4,51,"faiz_lockseed").setCreativeTab(Tabs.tabGaim);

	public static Item sengoku_driver_blade  = new Item_ore("sengoku_driver_blade");
	public static Item blade_lockseed  = new Item_lockseed(4,52,"blade_lockseed").setCreativeTab(Tabs.tabGaim);

	public static Item sengoku_driver_hibiki  = new Item_ore("sengoku_driver_hibiki");
	public static Item hibiki_lockseed  = new Item_lockseed(4,53,"hibiki_lockseed").setCreativeTab(Tabs.tabGaim);

	public static Item sengoku_driver_kaubuto  = new Item_ore("sengoku_driver_kabuto");
	public static Item kaubuto_lockseed  = new Item_lockseed(4,54,"kaubuto_lockseed").setCreativeTab(Tabs.tabGaim);

	public static Item sengoku_driver_den_o  = new Item_ore("sengoku_driver_den_o");
	public static Item den_o_lockseed  = new Item_lockseed(4,55,"den_o_lockseed").setCreativeTab(Tabs.tabGaim);

	public static Item sengoku_driver_kiva  = new Item_ore("sengoku_driver_kiva");
	public static Item kiva_lockseed  = new Item_lockseed(4,56,"kiva_lockseed").setCreativeTab(Tabs.tabGaim);

	public static Item sengoku_driver_gaim_lock  = new Item_ore("sengoku_driver_gaim_lock");
	public static Item gaim_lockseed  = new Item_lockseed(4,57,"gaim_lockseed").setCreativeTab(Tabs.tabGaim);
	public static Item gaim_lockseed_movie_special  = new Item_lockseed(4,57,"gaim_lockseed_movie_special").setCreativeTab(Tabs.tabGaim);

	public static Item sengoku_driver_rider_ichigo  = new Item_ore("sengoku_driver_rider_ichigo");
	public static Item rider_ichigo_lockseed  = new Item_lockseed(4,39,"rider_ichigo_lockseed").setCreativeTab(Tabs.tabGaim);

	public static Item showa_rider_lockseed  = new Item_lockseed(4,39,"showa_rider_lockseed").setCreativeTab(Tabs.tabGaim);
	public static Item heisei_rider_lockseed  = new Item_lockseed(4,57,"heisei_rider_lockseed").setCreativeTab(Tabs.tabGaim);

	public static Item sengoku_driver_ryugen_yomi  = new Item_ore("sengoku_driver_ryugen_yomi");
	public static Item sengoku_driver_zangetsu_watermelon  = new Item_ore("sengoku_driver_zangetsu_watermelon");

	public static Item sengoku_driver_kabi_orange  = new Item_ore("sengoku_driver_kabi_orange");
	public static Item kabi_orange_lockseed  = new Item_lockseed(1,58,"kabi_orange_lockseed").setCreativeTab(Tabs.tabGaim);

	public static Item sengoku_driver_maja_lock  = new Item_ore("sengoku_driver_maja_lock");
	public static Item maja_lockseed  = new Item_lockseed(1,59,"maja_lockseed").setCreativeTab(Tabs.tabGaim);

	public static Item sengoku_driver_lychee  = new Item_ore("sengoku_driver_lychee");
	public static Item lychee_lockseed  = new Item_lockseed(1,66,"lychee_lockseed").setCreativeTab(Tabs.tabGaim);

	public static Item sengoku_driver_king_durian  = new Item_ore("sengoku_driver_king_durian");
	public static Item king_durian_lockseed  = new Item_lockseed(1,67,"king_durian_lockseed").setCreativeTab(Tabs.tabGaim);

	public static Item sengoku_driver_hells  = new Item_ore("sengoku_driver_hells");
	public static Item helheim_lockseed  = new Item_lockseed(1,68,"helheim_lockseed").setCreativeTab(Tabs.tabGaim);


	public static Item sengoku_driver_gaim = new item_Gaimdriver("sengoku_driver_gaim",ArmorMaterial.DIAMOND, 4, 3,"gaim","orange_arms",0,sengoku_driver_orange).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
	public static Item sengoku_driver_zangetsu = new item_Gaimdriver("sengoku_driver_zangetsu",ArmorMaterial.DIAMOND, 4, 3,"zangetsu","melon_arms",0,sengoku_driver_melon).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
	public static Item sengoku_driver_ryugen = new item_Gaimdriver("sengoku_driver_ryugen",ArmorMaterial.DIAMOND, 4, 3,"ryugen","budou_arms",0,sengoku_driver_budou).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
	public static Item sengoku_driver_baron = new item_Gaimdriver("sengoku_driver_baron",ArmorMaterial.DIAMOND, 4, 3,"baron","banana_arms",0,sengoku_driver_banana).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
	public static Item sengoku_driver_kurokage = new item_Gaimdriver("sengoku_driver_kurokage",ArmorMaterial.DIAMOND, 4, 3,"kurokage","matsubokkuri_arms",0,sengoku_driver_matsubokkuri).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
	public static Item sengoku_driver_gridon = new item_Gaimdriver("sengoku_driver_gridon",ArmorMaterial.DIAMOND, 4, 3,"gridon","donguri_arms",0,sengoku_driver_donguri).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
	public static Item sengoku_driver_barvo = new item_Gaimdriver("sengoku_driver_barvo",ArmorMaterial.DIAMOND, 4, 3,"barvo","durian_arms",0,sengoku_driver_durian ).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
	public static Item sengoku_driver_knuckle = new item_Gaimdriver("sengoku_driver_knuckle",ArmorMaterial.DIAMOND, 4, 3,"knuckle","kurumi_arms",0,sengoku_driver_kurumi).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
	public static Item sengoku_driver_bujin_gaim = new item_Gaimdriver("sengoku_driver_bujin_gaim",ArmorMaterial.DIAMOND, 4, 3,"bujin_gaim","blood_orange_arms",0,sengoku_driver_blood_orange).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
	public static Item sengoku_driver_fifteen = new item_Gaimdriver("sengoku_driver_fifteen",ArmorMaterial.DIAMOND, 4, 3,"fifteen","fifteen_arms",0,sengoku_driver_fifteen_lock).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
	public static Item sengoku_driver_mars = new item_Gaimdriver("sengoku_driver_mars",ArmorMaterial.DIAMOND, 4, 3,"mars","golden_arms",0,sengoku_driver_golden_ringo).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
	public static Item sengoku_driver_kamuro = new item_Gaimdriver("sengoku_driver_kamuro",ArmorMaterial.DIAMOND, 4, 3,"kamuro","silver_arms",0,sengoku_driver_silver_ringo).setCreativeTab(Tabs.tabGaim);
	public static Item sengoku_driver_jam = new item_Gaimdriver("sengoku_driver_jam",ArmorMaterial.DIAMOND, 4, 3,"jam","darkness_arms",0,sengoku_driver_black_ringo).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);

	public static Item sengoku_driver_kurokage_troopers = new item_Gaimdriver("sengoku_driver_kurokage_troopers",ArmorMaterial.DIAMOND, 4, 3,"kurokage_shin","matsubokkuri_arms",0,sengoku_driver_matsubokkuri).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
	public static Item sengoku_driver_idunn = new item_Gaimdriver("sengoku_driver_idunn",ArmorMaterial.DIAMOND, 4, 3,"idunn","ringo_arms",0,sengoku_driver_forbidden_ringo).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
	public static Item sengoku_driver_duke = new item_Gaimdriver("sengoku_driver_duke",ArmorMaterial.DIAMOND, 4, 3,"sengoku_duke","lemon_arms",0,sengoku_driver_lemon).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
	public static Item sengoku_driver_baron_black = new item_Gaimdriver("sengoku_driver_baron_black",ArmorMaterial.DIAMOND, 4, 3,"baron_black","banana_arms",0,sengoku_driver_banana).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
	public static Item sengoku_driver_savior = new item_Gaimdriver("sengoku_driver_savior",ArmorMaterial.DIAMOND, 4, 3,"savior","blood_zakuro_arms",0,sengoku_driver_blood_zakuro).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);

	public static Item sengoku_driver_maja = new item_Gaimdriver("sengoku_driver_maja",ArmorMaterial.DIAMOND, 4, 3,"maja","maja_arms",0,sengoku_driver_maja_lock).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);

	public static Item sengoku_driver_proto_gaim = new item_Gaimdriver("sengoku_driver_proto_gaim",ArmorMaterial.DIAMOND, 4, 3,"proto_gaim","orange_arms",0,sengoku_driver_orange).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
	public static Item sengoku_driver_proto_ryugen = new item_Gaimdriver("sengoku_driver_proto_ryugen",ArmorMaterial.DIAMOND, 4, 3,"proto_ryugen","budou_arms",0,sengoku_driver_budou).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
	public static Item sengoku_driver_proto_baron = new item_Gaimdriver("sengoku_driver_proto_baron",ArmorMaterial.DIAMOND, 4, 3,"proto_baron","banana_arms",0,sengoku_driver_banana).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
	public static Item sengoku_driver_proto_gridon = new item_Gaimdriver("sengoku_driver_proto_gridon",ArmorMaterial.DIAMOND, 4, 3,"proto_gridon","donguri_arms",0,sengoku_driver_donguri).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
	public static Item sengoku_driver_proto_barvo = new item_Gaimdriver("sengoku_driver_proto_barvo",ArmorMaterial.DIAMOND, 4, 3,"proto_barvo","durian_arms",0,sengoku_driver_durian ).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);

	public static Item sengoku_driver_sylphi = new item_Gaimdriver("sengoku_driver_sylphi",ArmorMaterial.DIAMOND, 4, 3,"sylphi","hells_arms",0,sengoku_driver_hells).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);

	public static Item sengoku_driver_gaim_natsumikan = new item_Gaimdriver("sengoku_driver_gaim_natsumikan",ArmorMaterial.DIAMOND, 4, 3,"gaim_natsumikan","natsumikan_arms",0,sengoku_driver_natsumikan).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);

	public static Item genesis_driver_zangetsu_shin = new item_Gaimdriver("genesis_driver_zangetsu_shin",ArmorMaterial.DIAMOND, 4, 3,"zangetsu_shin","energy_melon_arms",1,sengoku_driver_melon_energy).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
	public static Item genesis_driver_duke = new item_Gaimdriver("genesis_driver_duke",ArmorMaterial.DIAMOND, 4, 3,"duke","energy_lemon_arms",1,sengoku_driver_lemon_energy).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
	public static Item genesis_driver_sigurd = new item_Gaimdriver("genesis_driver_sigurd",ArmorMaterial.DIAMOND, 4, 3,"sigurd","energy_cherry_arms",1,sengoku_driver_cherry_energy).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
	public static Item genesis_driver_marika = new item_Gaimdriver("genesis_driver_marika",ArmorMaterial.DIAMOND, 4, 3,"marika","energy_peach_arms",1,sengoku_driver_peach_energy).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
	public static Item genesis_driver_baron = new item_Gaimdriver("genesis_driver_baron",ArmorMaterial.DIAMOND, 4, 3,"baron_shin","energy_lemon_arms",1,sengoku_driver_lemon_energy).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
	public static Item genesis_driver_kurokage_shin = new item_Gaimdriver("genesis_driver_kurokage_shin",ArmorMaterial.DIAMOND, 4, 3,"kurokage_shin","energy_matsubokkuri_arms",1,sengoku_driver_matsubokkuri_energy).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
	public static Item genesis_driver_tyrant = new item_Gaimdriver("genesis_driver_tyrant",ArmorMaterial.DIAMOND, 4, 3,"tyrant","energy_prototype_dragon_fruits_arms",1,sengoku_driver_dragon_fruits_energy).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);

	public static Item matsubokkuri_lockseed = new Item_lockseed(1,1,"matsubokkuri_lockseed").AddlockseedToHelheimVine(20).setCreativeTab(Tabs.tabGaim);
	public static Item kurumi_lockseed = new Item_lockseed(1,2,"kurumi_lockseed").AddlockseedToHelheimVine(20).setCreativeTab(Tabs.tabGaim);
	public static Item donguri_lockseed = new Item_lockseed(1,3,"donguri_lockseed").AddlockseedToHelheimVine(20).setCreativeTab(Tabs.tabGaim);
	public static Item melon_lockseed = new Item_lockseed(1,4,"melon_lockseed").AddlockseedToHelheimVine(10).setCreativeTab(Tabs.tabGaim);
	public static Item pine_lockseed = new Item_lockseed(1,5,"pine_lockseed").AddlockseedToHelheimVine(10).setCreativeTab(Tabs.tabGaim);
	public static Item ichigo_lockseed = new Item_lockseed(1,6,"ichigo_lockseed").AddlockseedToHelheimVine(7).setCreativeTab(Tabs.tabGaim);
	public static Item orange_lockseed = new Item_lockseed(1,7,"orange_lockseed").AddlockseedToHelheimVine(10).setCreativeTab(Tabs.tabGaim);
	public static Item banana_lockseed = new Item_lockseed(1,8,"banana_lockseed").AddlockseedToHelheimVine(10).setCreativeTab(Tabs.tabGaim);
	public static Item budou_lockseed = new Item_lockseed(1,9,"budou_lockseed").AddlockseedToHelheimVine(10).setCreativeTab(Tabs.tabGaim);
	public static Item suika_lockseed = new Item_lockseed(1,40,"suika_lockseed").AddlockseedToHelheimVine(1).setCreativeTab(Tabs.tabGaim);
	public static Item mango_lockseed = new Item_lockseed(1,10,"mango_lockseed").AddlockseedToHelheimVine(3).setCreativeTab(Tabs.tabGaim);
	public static Item durian_lockseed = new Item_lockseed(1,11,"durian_lockseed").AddlockseedToHelheimVine(6).setCreativeTab(Tabs.tabGaim);
	public static Item kiwi_lockseed = new Item_lockseed(1,12,"kiwi_lockseed").AddlockseedToHelheimVine(3).setCreativeTab(Tabs.tabGaim);
	public static Item lemon_lockseed = new Item_lockseed(1,41,"lemon_lockseed").setCreativeTab(Tabs.tabGaim);

	public static Item sakura_hurricane = new Item_lockseed_Bike("sakura_hurricane",0).AddlockseedToHelheimVine(3).setCreativeTab(Tabs.tabGaim);
	public static Item rose_attacker = new Item_lockseed_Bike("rose_attacker",1).AddlockseedToHelheimVine(3).setCreativeTab(Tabs.tabGaim);
	public static Item dandeliner = new Item_ore("dandeliner").setCreativeTab(Tabs.tabGaim);
	public static Item tulip_hopper = new Item_ore("tulip_hopper").setCreativeTab(Tabs.tabGaim);

	public static Item christmas_lockseed = new Item_ore("christmas_lockseed").setCreativeTab(Tabs.tabGaim);
	public static Item roulette_lockseed = new Item_ore("roulette_lockseed").setCreativeTab(Tabs.tabGaim);

	public static Item fake_donguri_lockseed = new item_fake_donguri("fake_donguri_lockseed").setCreativeTab(Tabs.tabGaim);

	public static Item sid_lockseed = new item_Sid_lockseed("sid_lockseed").setCreativeTab(Tabs.tabGaim);

	public static Item xiaolongbao_lockseed = new Item_ore("xiaolongbao_lockseed").setCreativeTab(Tabs.tabGaim);
	public static Item hsiao_lung_pao_lockseed = new Item_ore("hsiao_lung_pao_lockseed").setCreativeTab(Tabs.tabGaim);
	public static Item tom_yum_kung_lockseed = new Item_ore("tom_yum_kung_lockseed").setCreativeTab(Tabs.tabGaim);
	public static Item yummy_lockseed = new Item_ore("yummy_lockseed").setCreativeTab(Tabs.tabGaim);	
	public static Item hero_lockseed = new Item_ore("hero_lockseed").setCreativeTab(Tabs.tabGaim);

	public static Item drained_suika_lockseed = new Item_ore("drained_suika_lockseed").setCreativeTab(Tabs.tabGaim);

	public static Item lord_baron_boss_block_part1 = new Item_ore("lord_baron_boss_block_part1").setCreativeTab(Tabs.tabGaim);
	public static Item lord_baron_boss_block_part2 = new Item_ore("lord_baron_boss_block_part2").setCreativeTab(Tabs.tabGaim);
	public static Item lord_baron_boss_block_part3 = new Item_ore("lord_baron_boss_block_part3").setCreativeTab(Tabs.tabGaim);

	//drive
	public static Item handle_sword = new ItemBaseSword("handle_sword",ToolMaterial.DIAMOND, RiderItems.proto_speedshift).setMaxStackSize(1).setCreativeTab(Tabs.tabdrive);
	public static Item door_ju = new Item_gun("door_ju",ToolMaterial.DIAMOND, RiderItems.proto_speedshift).setMaxStackSize(1).setCreativeTab(Tabs.tabdrive);
	public static Item trailer_hou = new Item_gun("trailer_hou",ToolMaterial.DIAMOND, RiderItems.proto_speedshift).setMaxStackSize(1).setCreativeTab(Tabs.tabdrive);

	public static Item zenrin_shooter = new Item_gun("zenrin_shooter",ToolMaterial.DIAMOND, RiderItems.proto_speedshift).setMaxStackSize(1).setCreativeTab(Tabs.tabdrive);

	public static Item break_gunner = new Item_break_gunner("break_gunner",ToolMaterial.DIAMOND).setMaxStackSize(1).setCreativeTab(Tabs.tabdrive);
	public static Item shingouax = new ItemBaseSword("shingouax",ToolMaterial.DIAMOND, RiderItems.proto_speedshift).setMaxStackSize(1).setCreativeTab(Tabs.tabdrive);

	public static Item lupin_gunner = new Item_lupin_gunner("lupin_gunner",ToolMaterial.DIAMOND).setMaxStackSize(1).setCreativeTab(Tabs.tabdrive);
	public static Item blade_gunner = new ItemBaseSword("blade_gunner",ToolMaterial.DIAMOND, RiderItems.proto_speedshift).setMaxStackSize(1).setCreativeTab(Tabs.tabdrive);

	public static Item brain_sword = new ItemBaseSword("brain_sword",ToolMaterial.DIAMOND, RiderItems.proto_speedshift).setMaxStackSize(1).setCreativeTab(Tabs.tabdrive);

	public static Item drivehead = new item_rider_armor("drivehead",item_drivedriver.class,ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.HEAD, wizardgem).setCreativeTab(Tabs.tabdrive);
	public static Item drivetroso = new item_rider_armor("drivetroso",item_drivedriver.class,ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.CHEST, wizardgem).setCreativeTab(Tabs.tabdrive);
	public static Item drivelegs = new item_rider_armor("drivelegs",item_drivedriver.class,ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.LEGS, wizardgem).setCreativeTab(Tabs.tabdrive);

	
	public static Item drivedriver = new item_drivedriver("drivedriver",ArmorMaterial.DIAMOND, "drive").setMaxStackSize(1).setCreativeTab(Tabs.tabdrive);
	public static Item proto_drivedriver = new item_drivedriver("proto_drivedriver",ArmorMaterial.DIAMOND, "drive_proto").setMaxStackSize(1).setCreativeTab(Tabs.tabdrive);
	public static Item mach_driver_honoh = new item_drivedriver("mach_driver_honoh",ArmorMaterial.DIAMOND, "mach").setMaxStackSize(1).setCreativeTab(Tabs.tabdrive);
	public static Item mach_driver_honoh_chaser = new item_drivedriver("mach_driver_honoh_chaser",ArmorMaterial.DIAMOND, "chaser").setMaxStackSize(1).setCreativeTab(Tabs.tabdrive);
	public static Item mach_driver_honoh_drive = new item_drivedriver("mach_driver_honoh_drive",ArmorMaterial.DIAMOND, "mach_dead_heat_drive").setMaxStackSize(1).setCreativeTab(Tabs.tabdrive);
	public static Item drivedrivergold = new item_drivedriver("drivedrivergold",ArmorMaterial.DIAMOND, "drive_gold").setMaxStackSize(1).setCreativeTab(Tabs.tabdrive);
	public static Item metro_pd_driver_honoh = new item_drivedriver("metro_pd_driver_honoh",ArmorMaterial.DIAMOND, "mach_metro-pd").setMaxStackSize(1).setCreativeTab(Tabs.tabdrive);
	public static Item break_gunner_2 = new item_drivedriver("break_gunner_2",ArmorMaterial.DIAMOND, "mashin_chaser").setMaxStackSize(1).setCreativeTab(Tabs.tabdrive);
	public static Item lupin_belt = new item_drivedriver("lupin_belt",ArmorMaterial.DIAMOND, "lupin").setMaxStackSize(1).setCreativeTab(Tabs.tabdrive);
	public static Item drivedriver_dark = new item_drivedriver("drivedriver_dark",ArmorMaterial.DIAMOND, "drive_next").setMaxStackSize(1).setCreativeTab(Tabs.tabdrive);
	public static Item drivedriverbrain = new item_drivedriver("drivedriverbrain",ArmorMaterial.DIAMOND, "brain").setMaxStackSize(1).setCreativeTab(Tabs.tabdrive);

	public static Item drivedriverhart = new item_drivedriver("drivedriverhart",ArmorMaterial.DIAMOND, "drive_miracle").setMaxStackSize(1).setCreativeTab(Tabs.tabdrive);

	
	public static Item speedshift  = new Item_shift_car(1, 0,"speedshift").setCreativeTab(Tabs.tabdrive);
	public static Item wildshift  = new Item_shift_car(1, 1,"wildshift").setCreativeTab(Tabs.tabdrive);
	public static Item techniqueshift  = new Item_shift_car(1, 13,"techniqueshift").setCreativeTab(Tabs.tabdrive);
	public static Item dead_heat  = new Item_shift_car(1, 21,"dead_heat").setCreativeTab(Tabs.tabdrive);
	public static Item formulashift  = new Item_shift_car(1, 23,"formulashift").setCreativeTab(Tabs.tabdrive);
	public static Item tridoronshift  = new Item_shift_car(1, 24,"tridoronshift").setCreativeTab(Tabs.tabdrive);

	public static Item fruitsshift  = new Item_shift_car(1, 20,"fruitsshift").setCreativeTab(Tabs.tabdrive);
	public static Item highspeedshift  = new Item_shift_car(1, 10,"highspeedshift").setCreativeTab(Tabs.tabdrive);

	public static Item shift_next  = new Item_shift_car(1, 29,"shift_next").setCreativeTab(Tabs.tabdrive);
	public static Item shift_special  = new Item_shift_car(1, 30,"shift_special").setCreativeTab(Tabs.tabdrive);

	public static Item heartronshift  = new Item_shift_car(1, 35,"heartronshift").setCreativeTab(Tabs.tabdrive);
	public static Item speedwildtechnicshift  = new Item_shift_car(1, 36,"speedwildtechnicshift").setCreativeTab(Tabs.tabdrive);

	public static Item maxflare = new Item_shift_car(2, 2,"maxflare").setCreativeTab(Tabs.tabdrive);
	public static Item funkyspike = new Item_shift_car(2, 3,"funkyspike").setCreativeTab(Tabs.tabdrive);
	public static Item midnightshadow  = new Item_shift_car(2, 4,"midnightshadow").setCreativeTab(Tabs.tabdrive);
	public static Item justice_hunter  = new Item_shift_car(2, 5,"justice_hunter").setCreativeTab(Tabs.tabdrive);
	public static Item dream_vegas  = new Item_shift_car(2, 6,"dream_vegas").setCreativeTab(Tabs.tabdrive);
	public static Item dimension_cab  = new Item_shift_car(2, 7,"dimension_cab").setCreativeTab(Tabs.tabdrive);
	public static Item massive_monster  = new Item_shift_car(2, 8,"massive_monster").setCreativeTab(Tabs.tabdrive);
	public static Item spin_mixer  = new Item_shift_car(2, 9,"spin_mixer").setCreativeTab(Tabs.tabdrive);
	public static Item rumble_dump  = new Item_shift_car(2, 14,"rumble_dump").setCreativeTab(Tabs.tabdrive);
	public static Item mad_doctor  = new Item_shift_car(2, 15,"mad_doctor").setCreativeTab(Tabs.tabdrive);
	public static Item hooking_wrecker  = new Item_shift_car(2, 16,"hooking_wrecker").setCreativeTab(Tabs.tabdrive);

	public static Item fire_braver  = new Item_shift_car(2, 17,"fire_braver").setCreativeTab(Tabs.tabdrive);
	public static Item rolling_gravity  = new Item_shift_car(2, 18,"rolling_gravity").setCreativeTab(Tabs.tabdrive);
	public static Item road_winter  = new Item_shift_car(2, 19,"road_winter").setCreativeTab(Tabs.tabdrive);

	public static Item mantarn_f01  = new Item_shift_car(2, 31,"mantarn_f01").setCreativeTab(Tabs.tabdrive);
	public static Item jacky_f02  = new Item_shift_car(2, 32,"jacky_f02").setCreativeTab(Tabs.tabdrive);
	public static Item sparner_f03  = new Item_shift_car(2, 33,"sparner_f03").setCreativeTab(Tabs.tabdrive);


	public static Item mega_maxflare  = new Item_shift_car(2, 12,"mega_maxflare").setCreativeTab(Tabs.tabdrive);

	public static Item signal_mach  = new Item_shift_car(3, 0,"signal_mach").setCreativeTab(Tabs.tabdrive);
	public static Item signal_magarl  = new Item_shift_car(3, 1,"signal_magarl").setCreativeTab(Tabs.tabdrive);
	public static Item signal_kaksarn  = new Item_shift_car(3, 2,"signal_kaksarn").setCreativeTab(Tabs.tabdrive);
	public static Item signal_tomarle  = new Item_shift_car(3, 3,"signal_tomarle").setCreativeTab(Tabs.tabdrive);
	public static Item signal_kikern  = new Item_shift_car(3, 4,"signal_kikern").setCreativeTab(Tabs.tabdrive);
	public static Item shift_ride_crosser  = new Item_shift_car(3, 7,"shift_ride_crosser").setCreativeTab(Tabs.tabdrive);

	public static Item tridoron_key  = new Item_shift_car(5, 11,"tridoron_key").setCreativeTab(Tabs.tabdrive);

	public static Item rhino_super  = new Item_shift_car(4, 6,"rhino_super").setCreativeTab(Tabs.tabdrive);


	public static Item burning_solar = new Item_ore("burning_solar").setCreativeTab(Tabs.tabdrive);
	public static Item colorful_commercial = new Item_ore("colorful_commercial").setCreativeTab(Tabs.tabdrive);
	public static Item deco_traveller = new Item_ore("deco_traveller").setCreativeTab(Tabs.tabdrive);
	public static Item amazing_circus = new Item_ore("amazing_circus").setCreativeTab(Tabs.tabdrive);

	public static Item next_hunter = new Item_ore("next_hunter").setCreativeTab(Tabs.tabdrive);
	public static Item next_traveller = new Item_ore("next_traveller").setCreativeTab(Tabs.tabdrive);
	public static Item next_builder = new Item_ore("next_builder").setCreativeTab(Tabs.tabdrive);
	public static Item tokujoka_key = new Item_ore("tokujoka_key").setCreativeTab(Tabs.tabdrive);


	//ghost

	public static Item gan_gun_saber_blade  = new ItemBaseSword("gan_gun_saber_blade",Tabs.gan_gun_saber_blade, RiderItems.ghost_icons).setMaxStackSize(1).setCreativeTab(Tabs.tabghost);
	public static Item gan_gun_saber_nitouryu = new ItemBaseSword("gan_gun_saber_nitouryu",Tabs.gan_gun_saber_nitouryu, RiderItems.ghost_icons).setMaxStackSize(1).setCreativeTab(Tabs.tabghost);
	public static Item gan_gun_saber_nitouryu_2 = new ItemBaseSword("gan_gun_saber_nitouryu_2",Tabs.gan_gun_saber_nitouryu, RiderItems.ghost_icons).setMaxStackSize(1).setCreativeTab(Tabs.tabghost);
	public static Item gan_gun_saber_gun = new Item_gun("gan_gun_saber_gun",Tabs.gan_gun_saber_gun, RiderItems.ghost_icons).setMaxStackSize(1).setCreativeTab(Tabs.tabghost);
	public static Item gan_gun_saber_naginata  = new ItemBaseSword("gan_gun_saber_naginata",Tabs.gan_gun_saber_naginata, RiderItems.ghost_icons).setMaxStackSize(1).setCreativeTab(Tabs.tabghost);
	public static Item gan_gun_saber_condor_denwor = new Item_gun("gan_gun_saber_condor_denwor",Tabs.gan_gun_saber_condor_denwor, RiderItems.ghost_icons).setMaxStackSize(1).setCreativeTab(Tabs.tabghost);
	public static Item gan_gun_saber_rifle = new Item_gun("gan_gun_saber_rifle",Tabs.gan_gun_saber_rifle, RiderItems.ghost_icons).setMaxStackSize(1).setCreativeTab(Tabs.tabghost);
	public static Item gan_gun_saber_hammer  = new ItemBaseSword("gan_gun_saber_hammer",Tabs.gan_gun_saber_hammer, RiderItems.ghost_icons).setMaxStackSize(1).setCreativeTab(Tabs.tabghost);

	public static Item sunglasseslasher_sword = new Item_sword_gun("sunglasseslasher_sword",Tabs.sunglasseslasher_sword, RiderItems.ghost_icons).setMaxStackSize(1).setCreativeTab(Tabs.tabghost);

	public static Item gan_gun_hand_rod = new Item_sword_gun("gan_gun_hand_rod",Tabs.gan_gun_hand_rod, RiderItems.ghost_icons).setMaxStackSize(1).setCreativeTab(Tabs.tabghost);

	public static Item gan_gun_hand_kama = new ItemBaseSword("gan_gun_hand_kama",Tabs.gan_gun_hand_kama, RiderItems.ghost_icons).setMaxStackSize(1).setCreativeTab(Tabs.tabghost);

	public static Item deep_slasher_sword = new Item_sword_gun("deep_slasher_sword",Tabs.deep_slasher_sword, RiderItems.ghost_icons).setMaxStackSize(1).setCreativeTab(Tabs.tabghost);

	public static Item gan_gun_catcher_rod = new Item_sword_gun("gan_gun_catcher_rod",Tabs.gan_gun_catcher_rod, RiderItems.ghost_icons).setMaxStackSize(1).setCreativeTab(Tabs.tabghost);

	
	public static Item ghosthead = new item_rider_armor("ghosthead",item_ghostdriver.class,ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.HEAD, ghost_icons).setCreativeTab(Tabs.tabghost);
	public static Item ghosttroso = new item_rider_armor("ghosttroso",item_ghostdriver.class,ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.CHEST, ghost_icons).setCreativeTab(Tabs.tabghost);
	public static Item ghostlegs = new item_rider_armor("ghostlegs",item_ghostdriver.class,ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.LEGS, ghost_icons).setCreativeTab(Tabs.tabghost);

	public static Item ghostdriver = new item_ghostdriver("ghostdriver",ArmorMaterial.DIAMOND, 4, 3,"ghost","ore",1).setMaxStackSize(1).setCreativeTab(Tabs.tabghost);
	public static Item specterdriver = new item_ghostdriver("specterdriver",ArmorMaterial.DIAMOND, 4, 3,"specter","specter",2).setMaxStackSize(1).setCreativeTab(Tabs.tabghost);
	public static Item mega_ulorder = new item_ghostdriver("mega_ulorder",ArmorMaterial.DIAMOND, 4, 3,"necrom","necrom",0).setMaxStackSize(1).setCreativeTab(Tabs.tabghost);

	public static Item unfinished_eyecon_driver_g = new Item_ore("unfinished_eyecon_driver_g").setCreativeTab(Tabs.tabghost);
	public static Item eyecon_driver_g = new item_ghostdriver("eyecon_driver_g",ArmorMaterial.DIAMOND, 4, 3,"ghost_grateful","grateful",4).setMaxStackSize(1).setCreativeTab(Tabs.tabghost);

	public static Item dark_ghostdriver = new item_ghostdriver("dark_ghostdriver",ArmorMaterial.DIAMOND, 4, 3,"dark_ghost","dark",1).setMaxStackSize(1).setCreativeTab(Tabs.tabghost);
	public static Item zero_specterdriver = new item_ghostdriver("zero_specterdriver",ArmorMaterial.DIAMOND, 4, 3,"zero_specter","zero_specter",2).setMaxStackSize(1).setCreativeTab(Tabs.tabghost);
	public static Item proto_mega_ulorder_r = new item_ghostdriver("proto_mega_ulorder_r",ArmorMaterial.DIAMOND, 4, 3,"dark_necrom","dark_necrom_red",0).setMaxStackSize(1).setCreativeTab(Tabs.tabghost);
	public static Item proto_mega_ulorder_b = new item_ghostdriver("proto_mega_ulorder_b",ArmorMaterial.DIAMOND, 4, 3,"dark_necrom","dark_necrom_blue",0).setMaxStackSize(1).setCreativeTab(Tabs.tabghost);
	public static Item proto_mega_ulorder_y = new item_ghostdriver("proto_mega_ulorder_y",ArmorMaterial.DIAMOND, 4, 3,"dark_necrom","dark_necrom_yellow",0).setMaxStackSize(1).setCreativeTab(Tabs.tabghost);
	public static Item proto_mega_ulorder_p = new item_ghostdriver("proto_mega_ulorder_p",ArmorMaterial.DIAMOND, 4, 3,"dark_necrom","dark_necrom_pink",0).setMaxStackSize(1).setCreativeTab(Tabs.tabghost);

	public static Item extremer_driver = new item_ghostdriver("extremer_driver",ArmorMaterial.DIAMOND, 4, 3,"extremer","extremer",4).setMaxStackSize(1).setCreativeTab(Tabs.tabghost);

	public static Item new_ghostdriver = new item_ghostdriver("new_ghostdriver",ArmorMaterial.DIAMOND, 4, 3,"dark_ghost","new_ore",1).setMaxStackSize(1).setCreativeTab(Tabs.tabghost);

	public static Item kanonghostdriver = new item_ghostdriver("kanonghostdriver",ArmorMaterial.DIAMOND, 4, 3,"kanon","kanon",2).setMaxStackSize(1).setCreativeTab(Tabs.tabghost);

	public static Item ore_ghost_icon  = new Item_ghost_Icons(0, 0,1,"ore_ghost_icon").setCreativeTab(Tabs.tabghost);
	public static Item new_ore_ghost_icon  = new Item_ghost_Icons(0, 64,1,"new_ore_ghost_icon").setCreativeTab(Tabs.tabghost);

	public static Item toucon_boost_icon  = new Item_ghost_Icons(1, 13,3,"toucon_boost_icon").setCreativeTab(Tabs.tabghost);
	public static Item mugen_icon  = new Item_ghost_Icons(2, 35,5,"mugen_icon").setCreativeTab(Tabs.tabghost);

	public static Item specter_ghost_icon  = new Item_ghost_Icons(0, 5,2,"specter_ghost_icon").setCreativeTab(Tabs.tabghost);
	public static Item deep_specter_ghost_icon  = new Item_ghost_Icons(1, 24,4,"deep_specter_ghost_icon").setCreativeTab(Tabs.tabghost);
	public static Item sin_specter_icon  = new Item_ghost_Icons(2, 38,4,"sin_specter_icon").setCreativeTab(Tabs.tabghost);

	public static Item necrom_ghost_icon  = new Item_ghost_Icons(0, 19,0,"necrom_ghost_icon").setCreativeTab(Tabs.tabghost);
	public static Item yujou_burst_icon  = new Item_ghost_Icons(1, 41,0,"yujou_burst_icon").setCreativeTab(Tabs.tabghost);

	public static Item dark_ghost_icon  = new Item_ghost_Icons(0, 25,1,"dark_ghost_icon").setCreativeTab(Tabs.tabghost);
	public static Item zero_specter_ghost_icon  = new Item_ghost_Icons(0, 30,0,"zero_specter_ghost_icon").setCreativeTab(Tabs.tabghost);
	public static Item dark_necrom_red_ghost_icon  = new Item_ghost_Icons(0, 26,0,"dark_necrom_red_ghost_icon").setCreativeTab(Tabs.tabghost);
	public static Item dark_necrom_blue_ghost_icon  = new Item_ghost_Icons(0, 27,0,"dark_necrom_blue_ghost_icon").setCreativeTab(Tabs.tabghost);
	public static Item dark_necrom_yellow_ghost_icon  = new Item_ghost_Icons(0, 28,0,"dark_necrom_yellow_ghost_icon").setCreativeTab(Tabs.tabghost);
	public static Item dark_necrom_pink_ghost_icon  = new Item_ghost_Icons(0, 29,0,"dark_necrom_pink_ghost_icon").setCreativeTab(Tabs.tabghost);

	public static Item kanon_specter_ghost_icon  = new Item_ghost_Icons(0, 65,0,"kanon_specter_ghost_icon").setCreativeTab(Tabs.tabghost);


	public static Item edison_ghost_icon  = new Item_ghost_Icons(0, 1,1,"edison_ghost_icon").setCreativeTab(Tabs.tabghost);
	public static Item newton_ghost_icon  = new Item_ghost_Icons(0, 2,1,"newton_ghost_icon").setCreativeTab(Tabs.tabghost);
	public static Item musashi_ghost_icon  = new Item_ghost_Icons(0, 3,1,"musashi_ghost_icon").setCreativeTab(Tabs.tabghost);
	public static Item robin_ghost_icon  = new Item_ghost_Icons(0, 4,1,"robin_ghost_icon").setCreativeTab(Tabs.tabghost);

	public static Item billy_the_kid_icon  = new Item_ghost_Icons(0, 6,1,"billy_the_kid_icon").setCreativeTab(Tabs.tabghost);
	public static Item beethoven_icon  = new Item_ghost_Icons(0, 7,1,"beethoven_icon").setCreativeTab(Tabs.tabghost);
	public static Item benkei_icon  = new Item_ghost_Icons(0, 8,1,"benkei_icon").setCreativeTab(Tabs.tabghost);

	public static Item goemon_icon  = new Item_ghost_Icons(0, 14,3,"goemon_icon").setCreativeTab(Tabs.tabghost);
	public static Item ryoma_icon  = new Item_ghost_Icons(0, 15,3,"ryoma_icon").setCreativeTab(Tabs.tabghost);
	public static Item himiko_ghost_icon  = new Item_ghost_Icons(0, 20,3,"himiko_ghost_icon").setCreativeTab(Tabs.tabghost);

	public static Item tutankhamun_icon  = new Item_ghost_Icons(0, 9,2,"tutankhamun_icon").setCreativeTab(Tabs.tabghost);
	public static Item nobunaga_icon  = new Item_ghost_Icons(0, 10,2,"nobunaga_icon").setCreativeTab(Tabs.tabghost);
	public static Item houdini_icon  = new Item_ghost_Icons(0, 21,2,"houdini_icon").setCreativeTab(Tabs.tabghost);

	public static Item grimm_icon  = new Item_ghost_Icons(0, 22,0,"grimm_icon").setCreativeTab(Tabs.tabghost);
	public static Item sanzo_icon  = new Item_ghost_Icons(0, 23,0,"sanzo_icon").setCreativeTab(Tabs.tabghost);

	public static Item napoleon_icon  = new Item_ghost_Icons(0, 36,1,"napoleon_icon").setCreativeTab(Tabs.tabghost);
	public static Item darwin_icon  = new Item_ghost_Icons(0, 37,1,"darwin_icon").setCreativeTab(Tabs.tabghost);

	public static Item ikkyu_icon  = new Item_ghost_Icons(0, 11,1,"ikkyu_icon").setCreativeTab(Tabs.tabghost);
	public static Item pythagoras_icon  = new Item_ghost_Icons(0, 16,2,"pythagoras_icon").setCreativeTab(Tabs.tabghost);
	public static Item santa_icon  = new Item_ghost_Icons(0, 12,1,"santa_icon").setCreativeTab(Tabs.tabghost);
	public static Item nightingale_icon  = new Item_ghost_Icons(0, 32,1,"nightingale_icon").setCreativeTab(Tabs.tabghost);
	public static Item special_ore_icon  = new Item_ghost_Icons(0, 18,1,"special_ore_icon").setCreativeTab(Tabs.tabghost);
	public static Item ore_specter_ghost_icon  = new Item_ghost_Icons(0, 62,1,"ore_specter_ghost_icon").setCreativeTab(Tabs.tabghost);
	public static Item ishinomori_ghost_icon  = new Item_ore("ishinomori_ghost_icon").setCreativeTab(Tabs.tabghost);

	public static Item columbus_icon  = new Item_ghost_Icons(0, 34,1,"columbus_icon").setCreativeTab(Tabs.tabghost);
	public static Item shakespeare_icon  = new Item_ghost_Icons(0, 31,1,"shakespeare_icon").setCreativeTab(Tabs.tabghost);
	public static Item kamehameha_icon  = new Item_ghost_Icons(0, 17,1,"kamehameha_icon").setCreativeTab(Tabs.tabghost);
	public static Item galileo_icon  = new Item_ghost_Icons(0, 33,1,"galileo_icon").setCreativeTab(Tabs.tabghost);
	public static Item da_vinci_ghost_icon  = new Item_ghost_Icons(0, 42,1,"da_vinci_ghost_icon").setCreativeTab(Tabs.tabghost);

	public static Item tenkatoitsu_icon  = new Item_ghost_Icons(0, 39,1,"tenkatoitsu_icon").setCreativeTab(Tabs.tabghost);
	public static Item shinsengumi_icon  = new Item_ghost_Icons(0, 40,1,"shinsengumi_icon").setCreativeTab(Tabs.tabghost);

	public static Item showa_ghost_icon  = new Item_ghost_Icons(0, 43,1,"showa_ghost_icon").setCreativeTab(Tabs.tabghost);
	public static Item kuuga_ghost_icon  = new Item_ghost_Icons(0, 44,1,"kuuga_ghost_icon").setCreativeTab(Tabs.tabghost);
	public static Item agito_ghost_icon  = new Item_ghost_Icons(0, 45,1,"agito_ghost_icon").setCreativeTab(Tabs.tabghost);
	public static Item ryuki_ghost_icon  = new Item_ghost_Icons(0, 46,1,"ryuki_ghost_icon").setCreativeTab(Tabs.tabghost);
	public static Item faiz_ghost_icon  = new Item_ghost_Icons(0, 47,1,"faiz_ghost_icon").setCreativeTab(Tabs.tabghost);
	public static Item blade_ghost_icon  = new Item_ghost_Icons(0, 48,1,"blade_ghost_icon").setCreativeTab(Tabs.tabghost);
	public static Item hibiki_ghost_icon  = new Item_ghost_Icons(0, 49,1,"hibiki_ghost_icon").setCreativeTab(Tabs.tabghost);
	public static Item kabuto_ghost_icon  = new Item_ghost_Icons(0, 50,1,"kabuto_ghost_icon").setCreativeTab(Tabs.tabghost);
	public static Item den_o_ghost_icon  = new Item_ghost_Icons(0, 51,1,"den_o_ghost_icon").setCreativeTab(Tabs.tabghost);
	public static Item kiva_ghost_icon  = new Item_ghost_Icons(0, 52,1,"kiva_ghost_icon").setCreativeTab(Tabs.tabghost);
	public static Item decade_ghost_icon  = new Item_ghost_Icons(0, 53,1,"decade_ghost_icon").setCreativeTab(Tabs.tabghost);
	public static Item double_ghost_icon  = new Item_ghost_Icons(0, 54,1,"double_ghost_icon").setCreativeTab(Tabs.tabghost);
	public static Item ooo_ghost_icon  = new Item_ghost_Icons(0, 55,1,"ooo_ghost_icon").setCreativeTab(Tabs.tabghost);
	public static Item fourze_ghost_icon  = new Item_ghost_Icons(0, 56,1,"fourze_ghost_icon").setCreativeTab(Tabs.tabghost);
	public static Item wizard_ghost_icon  = new Item_ghost_Icons(0, 57,1,"wizard_ghost_icon").setCreativeTab(Tabs.tabghost);
	public static Item gaim_ghost_icon  = new Item_ghost_Icons(0, 58,1,"gaim_ghost_icon").setCreativeTab(Tabs.tabghost);
	public static Item drive_ghost_icon  = new Item_ghost_Icons(0, 59,1,"drive_ghost_icon").setCreativeTab(Tabs.tabghost);
	public static Item ghost_ghost_icon  = new Item_ghost_Icons(0, 0,1,"ghost_ghost_icon").setCreativeTab(Tabs.tabghost);
	public static Item ex_aid_ghost_icon  = new Item_ghost_Icons(0, 60,1,"ex_aid_ghost_icon").setCreativeTab(Tabs.tabghost);

	public static Item unfinished_fourtyfive_heisei_ghost_icon  = new Item_ore("unfinished_fourtyfive_heisei_ghost_icon").setCreativeTab(Tabs.tabghost);
	public static Item fourtyfive_heisei_ghost_icon  = new Item_ghost_Icons(3, 63,6,"fourtyfive_heisei_ghost_icon").setCreativeTab(Tabs.tabghost);
	public static Item fourtyfive_showa_ghost_icon  = new Item_ghost_Icons(0, 61,1,"fourtyfive_showa_ghost_icon").setCreativeTab(Tabs.tabghost);

	public static Item royalty_gamma_icon  = new Item_ore("royalty_gamma_icon").setCreativeTab(Tabs.tabghost);
	public static Item transform_gamma_icon  = new Item_ore("transform_gamma_icon").setCreativeTab(Tabs.tabghost);
	public static Item knife_gamma_icon  = new Item_ore("knife_gamma_icon").setCreativeTab(Tabs.tabghost);

	public static Item yurusen_gamma_icon  = new Item_ore("yurusen_gamma_icon").setCreativeTab(Tabs.tabghost);
	public static Item sister_gamma_icon  = new Item_ore("sister_gamma_icon").setCreativeTab(Tabs.tabghost);



	// Ex-Aid
	public static Item blank_gashat = new Item_ore("blank_gashat").setCreativeTab(Tabs.tabex_aid);
	
	public static Item gashacon_breaker = new Item_gashacon_breaker("gashacon_breaker",Tabs.gashacon_breaker, RiderItems.blank_gashat).setMaxStackSize(1).setCreativeTab(Tabs.tabex_aid);
	//public static Item gashacon_breaker_ham = new ItemBaseSword("gashacon_breaker_ham",Tabs.gashacon_breaker_ham).setMaxStackSize(1).setCreativeTab(Tabs.tabex_aid);

	public static Item gashacon_key_slasher = new ItemBaseSword("gashacon_key_slasher",Tabs.gashacon_key_slasher, RiderItems.blank_gashat).setMaxStackSize(1).setCreativeTab(Tabs.tabex_aid);

	public static Item gashacon_sword = new Item_gashacon_breaker("gashacon_sword",Tabs.gashacon_sword, RiderItems.blank_gashat).setMaxStackSize(1).setCreativeTab(Tabs.tabex_aid);
	//public static Item gashacon_sword_ice = new ItemBaseSword("gashacon_sword_ice",Tabs.gashacon_sword).setMaxStackSize(1).setCreativeTab(Tabs.tabex_aid);

	public static Item gashacon_magnum_gun = new Item_gun("gashacon_magnum_gun",Tabs.gashacon_magnum_gun, RiderItems.blank_gashat).setMaxStackSize(1).setCreativeTab(Tabs.tabex_aid);

	public static Item gashacon_sparrow_sickle_a = new ItemBaseSword("gashacon_sparrow_sickle_a",Tabs.gashacon_sparrow_sickle, RiderItems.blank_gashat).setMaxStackSize(1).setCreativeTab(Tabs.tabex_aid);
	public static Item gashacon_sparrow_sickle_b = new ItemBaseSword("gashacon_sparrow_sickle_b",Tabs.gashacon_sparrow_sickle, RiderItems.blank_gashat).setMaxStackSize(1).setCreativeTab(Tabs.tabex_aid);
	public static Item gashacon_sparrow_arrow = new Item_gun("gashacon_sparrow_arrow",Tabs.gashacon_sparrow_arrow, RiderItems.blank_gashat).setMaxStackSize(1).setCreativeTab(Tabs.tabex_aid);

	public static Item gashacon_bugvisor = new Item_sword_gun("gashacon_bugvisor",Tabs.parabragun_axe, RiderItems.blank_gashat).setMaxStackSize(1).setCreativeTab(Tabs.tabex_aid);

	public static Item gashacon_bugvisor_ii = new Item_sword_gun("gashacon_bugvisor_ii",Tabs.parabragun_axe, RiderItems.blank_gashat).setMaxStackSize(1).setCreativeTab(Tabs.tabex_aid);

	public static Item gashacon_bugvisor_g = new Item_sword_gun("gashacon_bugvisor_g",Tabs.parabragun_axe, RiderItems.blank_gashat).setMaxStackSize(1).setCreativeTab(Tabs.tabex_aid);


	public static Item parabragun_axe = new Item_sword_gun("parabragun_axe",Tabs.parabragun_axe, RiderItems.blank_gashat).setMaxStackSize(1).setCreativeTab(Tabs.tabex_aid);

	public static Item ride_weapon = new Item_sword_gun("ride_weapon",ToolMaterial.DIAMOND, RiderItems.blank_gashat).setMaxStackSize(1).setCreativeTab(Tabs.tabex_aid);

	public static Item true_brave_sword = new ItemBaseSword("true_brave_sword",Tabs.true_brave_sword, RiderItems.blank_gashat).setMaxStackSize(1).setCreativeTab(Tabs.tabex_aid);
	public static Item fuuma_sword = new ItemBaseSword("fuuma_sword",Tabs.fuuma_sword, RiderItems.blank_gashat).setMaxStackSize(1).setCreativeTab(Tabs.tabex_aid);

	public static Item bugster_trident = new ItemBaseSword("bugster_trident",ToolMaterial.DIAMOND, RiderItems.blank_gashat).setMaxStackSize(1).setCreativeTab(Tabs.tabex_aid);

	public static Item deus_rusher = new ItemBaseSword("deus_rusher",Tabs.gashacon_key_slasher, RiderItems.blank_gashat).setMaxStackSize(1).setCreativeTab(Tabs.tabex_aid);
	public static Item deus_rusher_red = new ItemBaseSword("deus_rusher_red",Tabs.gashacon_key_slasher, RiderItems.blank_gashat).setMaxStackSize(1).setCreativeTab(Tabs.tabex_aid);

	public static Item ex_aidhead = new item_rider_armor("ex_aidhead",item_ex_aiddriver.class,ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.HEAD, blank_gashat).setCreativeTab(Tabs.tabex_aid);
	public static Item ex_aidtroso = new item_rider_armor("ex_aidtroso",item_ex_aiddriver.class,ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.CHEST, blank_gashat).setCreativeTab(Tabs.tabex_aid);
	public static Item ex_aidlegs = new item_rider_armor("ex_aidlegs",item_ex_aiddriver.class,ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.LEGS, blank_gashat).setCreativeTab(Tabs.tabex_aid);

	public static Item gamer_driver_ex_aid = new item_ex_aiddriver("gamer_driver_ex_aid",ArmorMaterial.DIAMOND, 4, 3,"ex_aid",0).setMaxStackSize(1).setCreativeTab(Tabs.tabex_aid);
	public static Item gamer_driver_brave = new item_ex_aiddriver("gamer_driver_brave",ArmorMaterial.DIAMOND, 4, 3,"brave",0).setMaxStackSize(1).setCreativeTab(Tabs.tabex_aid);
	public static Item gamer_driver_snipe = new item_ex_aiddriver("gamer_driver_snipe",ArmorMaterial.DIAMOND, 4, 3,"snipe",0).setMaxStackSize(1).setCreativeTab(Tabs.tabex_aid);
	public static Item gamer_driver_lazer = new item_ex_aiddriver("gamer_driver_lazer",ArmorMaterial.DIAMOND, 4, 3,"lazer",1).setMaxStackSize(1).setCreativeTab(Tabs.tabex_aid);
	public static Item gamer_driver_lazer_turbo = new item_ex_aiddriver("gamer_driver_lazer_turbo",ArmorMaterial.DIAMOND, 4, 3,"lazer_turbo",0).setMaxStackSize(1).setCreativeTab(Tabs.tabex_aid);
	public static Item gamer_driver_paradox = new item_ex_aiddriver("gamer_driver_paradox",ArmorMaterial.DIAMOND, 4, 3,"paradox99",2).setMaxStackSize(1).setCreativeTab(Tabs.tabex_aid);
	public static Item gamer_driver_chronos = new item_ex_aiddriver("gamer_driver_chronos",ArmorMaterial.DIAMOND, 4, 3,"chronos",2).setMaxStackSize(1).setCreativeTab(Tabs.tabex_aid);

	public static Item gamer_driver_truebrave = new item_ex_aiddriver("gamer_driver_truebrave",ArmorMaterial.DIAMOND, 4, 3,"truebrave",2).setMaxStackSize(1).setCreativeTab(Tabs.tabex_aid);
	public static Item gamer_driver_fuuma = new item_ex_aiddriver("gamer_driver_fuuma",ArmorMaterial.DIAMOND, 4, 3,"fuuma",2).setMaxStackSize(1).setCreativeTab(Tabs.tabex_aid);
	public static Item gamer_driver_proto_brave = new item_ex_aiddriver("gamer_driver_proto_brave",ArmorMaterial.DIAMOND, 4, 3,"proto_brave",0).setMaxStackSize(1).setCreativeTab(Tabs.tabex_aid);
	public static Item gamer_driver_proto_snipe = new item_ex_aiddriver("gamer_driver_proto_snipe",ArmorMaterial.DIAMOND, 4, 3,"proto_snipe",0).setMaxStackSize(1).setCreativeTab(Tabs.tabex_aid);
	public static Item gamer_driver_proto_lazer = new item_ex_aiddriver("gamer_driver_proto_lazer",ArmorMaterial.DIAMOND, 4, 3,"proto_lazer_lvl_1",1).setMaxStackSize(1).setCreativeTab(Tabs.tabex_aid);
	public static Item gamer_driver_anotherparadox = new item_ex_aiddriver("gamer_driver_anotherparadox",ArmorMaterial.DIAMOND, 4, 3,"anotherparadox",2).setMaxStackSize(1).setCreativeTab(Tabs.tabex_aid);
	public static Item gamer_driver_gamedeus_muteki = new item_ex_aiddriver("gamer_driver_gamedeus_muteki",ArmorMaterial.DIAMOND, 4, 3,"gamedeus_muteki",2).setMaxStackSize(1).setCreativeTab(Tabs.tabex_aid);
	public static Item gamer_driver_nico_snipe = new item_ex_aiddriver("gamer_driver_nico_snipe",ArmorMaterial.DIAMOND, 4, 3,"nico_snipe",0).setMaxStackSize(1).setCreativeTab(Tabs.tabex_aid);

	public static Item gamer_driver_genmu = new item_ex_aiddriver("gamer_driver_genmu",ArmorMaterial.DIAMOND, 4, 3,"genmu",0).setMaxStackSize(1).setCreativeTab(Tabs.tabex_aid);
	public static Item gashacon_bugvisor_genmu = new item_ex_aiddriver("gashacon_bugvisor_genmu",ArmorMaterial.DIAMOND, 4, 3,"zombie_genmu",2).setMaxStackSize(1).setCreativeTab(Tabs.tabex_aid);
	public static Item gashacon_bugvisor_genmu_totema = new item_ex_aiddriver("gashacon_bugvisor_genmu_totema",ArmorMaterial.DIAMOND, 4, 3,"zombie_genmu",2).setMaxStackSize(1).setCreativeTab(Tabs.tabex_aid);

	public static Item gashacon_bugvisor_ii_poppy = new item_ex_aiddriver("gashacon_bugvisor_ii_poppy",ArmorMaterial.DIAMOND, 4, 3,"poppy",2).setCreativeTab(Tabs.tabex_aid);
	public static Item gashacon_bugvisor_ii_poppy_red = new item_ex_aiddriver("gashacon_bugvisor_ii_poppy_red",ArmorMaterial.DIAMOND, 4, 3,"poppy_red",2).setCreativeTab(Tabs.tabex_aid);

	public static Item gashacon_bugvisor_ii_chronos = new item_ex_aiddriver("gashacon_bugvisor_ii_chronos",ArmorMaterial.DIAMOND, 4, 3,"chronos",2).setMaxStackSize(1).setCreativeTab(Tabs.tabex_aid);
	public static Item gashacon_bugvisor_ii_chronos_gemdeus = new item_ex_aiddriver("gashacon_bugvisor_ii_chronos_gemdeus",ArmorMaterial.DIAMOND, 4, 3,"chronos_gemdeus",2).setMaxStackSize(1).setCreativeTab(Tabs.tabex_aid);
	public static Item gashacon_bugvisor_ii_lazer = new item_ex_aiddriver("gashacon_bugvisor_ii_lazer",ArmorMaterial.DIAMOND, 4, 3,"lazer_x",2).setMaxStackSize(1).setCreativeTab(Tabs.tabex_aid);
	public static Item gashacon_bugvisor_ii_chronicle_bugster = new item_ex_aiddriver("gashacon_bugvisor_ii_chronicle_bugster",ArmorMaterial.DIAMOND, 4, 3,"chronicle_bugster",2).setMaxStackSize(1).setCreativeTab(Tabs.tabex_aid);

	public static Item bugster_buckle = new Item_ore("bugster_buckle");
	public static Item bugster_buckle_ii = new Item_ore("bugster_buckle_ii");

	public static Item paradoxbelt = new item_ex_aiddriver("paradoxbelt",ArmorMaterial.DIAMOND, 4, 3,"paradox",3).setMaxStackSize(1).setCreativeTab(Tabs.tabex_aid);
	public static Item rideplayerbelt = new item_ex_aiddriver("rideplayerbelt",ArmorMaterial.DIAMOND, 4, 3,"ride_player",3).setMaxStackSize(1).setCreativeTab(Tabs.tabex_aid);
	public static Item rideplayerbelt_nico = new item_ex_aiddriver("rideplayerbelt_nico",ArmorMaterial.DIAMOND, 4, 3,"ride_player_nico",3).setMaxStackSize(1).setCreativeTab(Tabs.tabex_aid);
	public static Item ninjaplayerbelt = new item_ex_aiddriver("ninjaplayerbelt",ArmorMaterial.DIAMOND, 4, 3,"ninjaplayer",3).setMaxStackSize(1).setCreativeTab(Tabs.tabex_aid);

	public static Item mighty_brothers_xx_unfinished_gashat = new Item_ore("mighty_brothers_xx_unfinished_gashat").setCreativeTab(Tabs.tabex_aid);
	public static Item unfinished_maximum_mighty_x_gashat = new Item_ore("unfinished_maximum_mighty_x_gashat").setCreativeTab(Tabs.tabex_aid);
	public static Item unfinished_hyper_muteki_gashat = new Item_ore("unfinished_hyper_muteki_gashat").setCreativeTab(Tabs.tabex_aid);

	public static Item unfinished_kamen_rider_chronicle_gashat = new Item_ore("unfinished_kamen_rider_chronicle_gashat").setCreativeTab(Tabs.tabex_aid);

	public static Item mighty_action_x_gashat = new Item_gashat(0, 0,"mighty_action_x_gashat").AddGashatToBlockList(25).setCreativeTab(Tabs.tabex_aid);
	public static Item taddle_quest_gashat = new Item_gashat(0, 0,"taddle_quest_gashat").AddGashatToBlockList(10).setCreativeTab(Tabs.tabex_aid);
	public static Item bang_bang_shooting_gashat = new Item_gashat(0, 0,"bang_bang_shooting_gashat").AddGashatToBlockList(10).setCreativeTab(Tabs.tabex_aid);
	public static Item bakusou_bike_gashat = new Item_gashat(0, 0,"bakusou_bike_gashat").AddGashatToBlockList(10).setCreativeTab(Tabs.tabex_aid);
	public static Item proto_mighty_action_x_gashat = new Item_gashat(0, 0,"proto_mighty_action_x_gashat").setCreativeTab(Tabs.tabex_aid);
	public static Item proto_taddle_quest_gashat = new Item_gashat(0, 0,"proto_taddle_quest_gashat").setCreativeTab(Tabs.tabex_aid);
	public static Item proto_bang_bang_shooting_gashat = new Item_gashat(0, 0,"proto_bang_bang_shooting_gashat").setCreativeTab(Tabs.tabex_aid);
	public static Item proto_bakusou_bike_gashat = new Item_gashat(4, 0,"proto_bakusou_bike_gashat").setCreativeTab(Tabs.tabex_aid);

	public static Item proto_mighty_action_x_gashat_origin = new Item_gashat(0, 0,"proto_mighty_action_x_gashat_origin").AddGashatToBlockList(4).setCreativeTab(Tabs.tabex_aid);
	public static Item dangerous_zombie_gashat = new Item_gashat(0, 25,"dangerous_zombie_gashat").AddBugvisorGashatToBlockList(5).setCreativeTab(Tabs.tabex_aid);
	public static Item kamen_rider_chronicle_gashat = new Item_gashat(4, 0,"kamen_rider_chronicle_gashat").AddBugvisorGashatToBlockList(10).setCreativeTab(Tabs.tabex_aid);
	public static Item toki_meki_crisis_gashat = new Item_gashat(4, 0,"toki_meki_crisis_gashat").AddBugvisorGashatToBlockList(5).setCreativeTab(Tabs.tabex_aid);

	public static Item mighty_brothers_xx_gashat = new Item_gashat(0, 26,"mighty_brothers_xx_gashat").AddDualGashatToBlockList(20).setCreativeTab(Tabs.tabex_aid);
	public static Item maximum_mighty_x_gashat = new Item_gashat(0, 0,"maximum_mighty_x_gashat").AddMaxGashatToBlockList(10).setCreativeTab(Tabs.tabex_aid);
	public static Item hyper_muteki_gashat = new Item_gashat(0, 0,"hyper_muteki_gashat").AddHyperGashatToBlockList(10).setCreativeTab(Tabs.tabex_aid);
	public static Item mighty_creator_vrx_gashat = new Item_gashat(0, 29,"mighty_creator_vrx_gashat").AddGashatToBlockList(4).setCreativeTab(Tabs.tabex_aid);

	public static Item mighty_novel_x_gashat = new Item_gashat(0, 0,"mighty_novel_x_gashat").setCreativeTab(Tabs.tabex_aid);

	public static Item knock_out_fighter_2_gashat = new Item_gashat(0, 30,"knock_out_fighter_2_gashat").AddDualGashatToBlockList(2).setCreativeTab(Tabs.tabex_aid);
	public static Item gashat_gear_dual_another = new Item_gashat(4, 0,"gashat_gear_dual_another").AddDualGashatToBlockList(1).setCreativeTab(Tabs.tabex_aid);

	public static Item gamedeus_hyper_muteki_gashat = new Item_gashat(4, 0,"gamedeus_hyper_muteki_gashat").AddHyperGashatToBlockList(1).setCreativeTab(Tabs.tabex_aid);

	public static Item kamen_rider_build_gashat = new Item_gashat(4, 0,"kamen_rider_build_gashat").AddLegendGashatToBlockList(1).setCreativeTab(Tabs.tabex_aid);
	public static Item kaigan_ghost_gashat = new Item_gashat(0, 0,"kaigan_ghost_gashat").AddLegendGashatToBlockList(1).setCreativeTab(Tabs.tabex_aid);
	public static Item full_throttle_drive_gashat = new Item_gashat(0, 0,"full_throttle_drive_gashat").AddLegendGashatToBlockList(1).setCreativeTab(Tabs.tabex_aid);
	public static Item toukenden_gaim_gashat = new Item_gashat(0, 0,"toukenden_gaim_gashat").AddLegendGashatToBlockList(1).setCreativeTab(Tabs.tabex_aid);
	public static Item magic_the_wizard_gashat = new Item_gashat(0, 0,"magic_the_wizard_gashat").AddLegendGashatToBlockList(1).setCreativeTab(Tabs.tabex_aid);
	public static Item space_galaxy_fourze_gashat = new Item_gashat(0, 0,"space_galaxy_fourze_gashat").AddLegendGashatToBlockList(1).setCreativeTab(Tabs.tabex_aid);
	public static Item jungle_ooo_gashat = new Item_gashat(0, 0,"jungle_ooo_gashat").AddLegendGashatToBlockList(1).setCreativeTab(Tabs.tabex_aid);
	public static Item detective_double_gashat = new Item_gashat(0, 0,"detective_double_gashat").AddLegendGashatToBlockList(1).setCreativeTab(Tabs.tabex_aid);
	public static Item barcode_warrior_decade_gashat = new Item_gashat(0, 0,"barcode_warrior_decade_gashat").AddLegendGashatToBlockList(1).setCreativeTab(Tabs.tabex_aid);
	public static Item dokidoki_makai_castle_kiva_gashat = new Item_gashat(0, 0,"dokidoki_makai_castle_kiva_gashat").AddLegendGashatToBlockList(1).setCreativeTab(Tabs.tabex_aid);
	public static Item time_express_den_o_gashat = new Item_gashat(0, 0,"time_express_den_o_gashat").AddLegendGashatToBlockList(1).setCreativeTab(Tabs.tabex_aid);
	public static Item insect_wars_kabuto_gashat = new Item_gashat(0, 0,"insect_wars_kabuto_gashat").AddLegendGashatToBlockList(1).setCreativeTab(Tabs.tabex_aid);
	public static Item taiko_master_hibik_gashat = new Item_gashat(0, 0,"taiko_master_hibik_gashat").AddLegendGashatToBlockList(1).setCreativeTab(Tabs.tabex_aid);
	public static Item king_of_poker_blade_gashat = new Item_gashat(0, 0,"king_of_poker_blade_gashat").AddLegendGashatToBlockList(1).setCreativeTab(Tabs.tabex_aid);
	public static Item moshi_moshi_faiz_gashat = new Item_gashat(0, 0,"moshi_moshi_faiz_gashat").AddLegendGashatToBlockList(1).setCreativeTab(Tabs.tabex_aid);
	public static Item mirror_labryinth_ryuki_gashat = new Item_gashat(0, 0,"mirror_labryinth_ryuki_gashat").AddLegendGashatToBlockList(1).setCreativeTab(Tabs.tabex_aid);
	public static Item agito_of_the_sun_gashat = new Item_gashat(0, 0,"agito_of_the_sun_gashat").AddLegendGashatToBlockList(1).setCreativeTab(Tabs.tabex_aid);
	public static Item adventure_guy_kuuga_gashat = new Item_gashat(0, 0,"adventure_guy_kuuga_gashat").AddLegendGashatToBlockList(1).setCreativeTab(Tabs.tabex_aid);
	public static Item lets_go_ichigou_gashat = new Item_gashat(0, 0,"lets_go_ichigou_gashat").AddLegendGashatToBlockList(1).setCreativeTab(Tabs.tabex_aid);

	public static Item gekitotsu_robots_gashat = new Item_gashat(1, 1,"gekitotsu_robots_gashat").AddGashatToBlockList(10).setCreativeTab(Tabs.tabex_aid);
	public static Item proto_gekitotsu_robots_gashat = new Item_gashat(1, 2,"proto_gekitotsu_robots_gashat").setCreativeTab(Tabs.tabex_aid);

	public static Item doremifa_beat_gashat = new Item_gashat(1, 3,"doremifa_beat_gashat").AddGashatToBlockList(10).setCreativeTab(Tabs.tabex_aid);
	public static Item proto_doremifa_beat_gashat = new Item_gashat(1, 4,"proto_doremifa_beat_gashat").setCreativeTab(Tabs.tabex_aid);

	public static Item jet_combat_gashat = new Item_gashat(1, 5,"jet_combat_gashat").AddGashatToBlockList(10).setCreativeTab(Tabs.tabex_aid);
	public static Item proto_jet_combat_gashat = new Item_gashat(1, 6,"proto_jet_combat_gashat").setCreativeTab(Tabs.tabex_aid);

	public static Item giri_giri_chambara_gashat = new Item_gashat(0, 14,"giri_giri_chambara_gashat").AddGashatToBlockList(10).setCreativeTab(Tabs.tabex_aid);
	public static Item proto_giri_giri_chambara_gashat = new Item_gashat(0, 15,"proto_giri_giri_chambara_gashat").setCreativeTab(Tabs.tabex_aid);

	public static Item shakariki_sports_gashat = new Item_gashat(1, 7,"shakariki_sports_gashat").AddGashatToBlockList(10).setCreativeTab(Tabs.tabex_aid);
	public static Item proto_shakariki_sports_gashat = new Item_gashat(1, 8,"proto_shakariki_sports_gashat").setCreativeTab(Tabs.tabex_aid);


	public static Item drago_knight_hunter_z_gashat = new Item_gashat(1, 9,"drago_knight_hunter_z_gashat").AddGashatToBlockList(5).setCreativeTab(Tabs.tabex_aid);
	public static Item proto_drago_knight_hunter_z_gashat = new Item_gashat(4, 0,"proto_drago_knight_hunter_z_gashat").setCreativeTab(Tabs.tabex_aid);

	public static Item ju_ju_burger_gashat = new Item_gashat(1, 17,"ju_ju_burger_gashat").AddGashatToBlockList(7).setCreativeTab(Tabs.tabex_aid);
	public static Item night_of_safari_gashat = new Item_gashat(1, 21,"night_of_safari_gashat").AddGashatToBlockList(7).setCreativeTab(Tabs.tabex_aid);

	public static Item taddle_fantasy_gashat = new Item_gashat(1, 22,"taddle_fantasy_gashat").AddDualGashatToBlockList(5).setCreativeTab(Tabs.tabex_aid);
	public static Item bang_bang_simulation_gashat = new Item_gashat(1, 24,"bang_bang_simulation_gashat").AddDualGashatToBlockList(5).setCreativeTab(Tabs.tabex_aid);

	public static Item perfect_puzzle_gashat = new Item_gashat(0, 0,"perfect_puzzle_gashat").AddDualGashatToBlockList(5).setCreativeTab(Tabs.tabex_aid);
	public static Item knock_out_fighter_gashat = new Item_gashat(0, 1,"knock_out_fighter_gashat").AddDualGashatToBlockList(5).setCreativeTab(Tabs.tabex_aid);


	public static Item taddle_legacy_gashat = new Item_gashat(1, 23,"taddle_legacy_gashat").AddGashatToBlockList(2).setCreativeTab(Tabs.tabex_aid);
	public static Item hurricane_ninja_gashat = new Item_gashat(4, 0,"hurricane_ninja_gashat").AddGashatToBlockList(4).setCreativeTab(Tabs.tabex_aid);

	public static Item bang_bang_tank_gashat = new Item_gashat(1,31,"bang_bang_tank_gashat").AddGashatToBlockList(2).setCreativeTab(Tabs.tabex_aid);
	public static Item doctor_mighty_xx_gashat = new Item_gashat(4, 0,"doctor_mighty_xx_gashat").AddDualGashatToBlockList(2).setCreativeTab(Tabs.tabex_aid);
	public static Item god_maximum_mighty_x_gashat = new Item_gashat(0, 0,"god_maximum_mighty_x_gashat").AddMaxGashatToBlockList(1).setCreativeTab(Tabs.tabex_aid);
	public static Item genm_musou_gashat = new Item_gashat(0, 0,"genm_musou_gashat").setCreativeTab(Tabs.tabex_aid);

	public static Item proto_bakusou_bike_combi_fukkatsu_gashat = new Item_gashat(0, 16,"proto_bakusou_bike_combi_fukkatsu_gashat").AddGashatToBlockList(5).setCreativeTab(Tabs.tabex_aid);

	public static Item pac_adventure_gashat = new Item_gashat(1, 18,"pac_adventure_gashat").AddGashatToBlockList(6).setCreativeTab(Tabs.tabex_aid);
	public static Item famitsa_gashat = new Item_gashat(1, 19,"famitsa_gashat").AddGashatToBlockList(6).setCreativeTab(Tabs.tabex_aid);
	public static Item xevious_gashat = new Item_gashat(1, 20,"xevious_gashat").AddGashatToBlockList(6).setCreativeTab(Tabs.tabex_aid);
	public static Item galaxian_gashat = new Item_gashat(1, 28,"galaxian_gashat").AddGashatToBlockList(6).setCreativeTab(Tabs.tabex_aid);
	public static Item taiko_no_tatsujin_gashat = new Item_gashat(4, 0,"taiko_no_tatsujin_gashat").AddGashatToBlockList(4).setCreativeTab(Tabs.tabex_aid);
	public static Item gabarizing_gashat = new Item_gashat(4, 0,"gabarizing_gashat").AddGashatToBlockList(4).setCreativeTab(Tabs.tabex_aid);

	public static Item poppy_doremifa_beat_gashat = new item_poppy_gashat("poppy_doremifa_beat_gashat").setCreativeTab(Tabs.tabex_aid);

	public static Item lazer_bike = new item_bikes("lazer_bike",EntityLazer::new).setMaxStackSize(1).setCreativeTab(Tabs.tabex_aid);
	public static Item bike_gamer = new item_bikes("bike_gamer",EntityExaidBike::new).setMaxStackSize(1).setCreativeTab(Tabs.tabex_aid);
	
	public static Item speed_energy_item = new item_ex_aid_energy_item("speed_energy_item",new PotionEffect(MobEffects.SPEED, 500, 20,true,false)).setCreativeTab(Tabs.tabex_aid);
	public static Item iron_energy_item = new item_ex_aid_energy_item("iron_energy_item",new PotionEffect(MobEffects.RESISTANCE, 500, 5,true,false)).setCreativeTab(Tabs.tabex_aid);
	public static Item instigate_energy_item = new item_ex_aid_energy_item("instigate_energy_item",new PotionEffect(MobEffects.GLOWING, 500, 0,true,false)).setCreativeTab(Tabs.tabex_aid);
	public static Item jump_energy_item = new item_ex_aid_energy_item("jump_energy_item",new PotionEffect(MobEffects.JUMP_BOOST, 500, 10,true,false)).setCreativeTab(Tabs.tabex_aid);
	public static Item muscle_energy_item = new item_ex_aid_energy_item("muscle_energy_item",new PotionEffect(MobEffects.STRENGTH, 500, 5,true,false)).setCreativeTab(Tabs.tabex_aid);
	public static Item recover_energy_item = new item_ex_aid_energy_item("recover_energy_item",new PotionEffect(MobEffects.INSTANT_HEALTH, 1, 10,true,false)).setCreativeTab(Tabs.tabex_aid);
	public static Item shrink_energy_item = new item_ex_aid_energy_item("shrink_energy_item",new PotionEffect(PotionCore.SMALL_POTION, 500, 0,true,false)).setCreativeTab(Tabs.tabex_aid);
	public static Item giant_energy_item = new item_ex_aid_energy_item("giant_energy_item",new PotionEffect(PotionCore.BIG_POTION, 500, 0,true,false)).setCreativeTab(Tabs.tabex_aid);
	public static Item invisible_energy_item = new item_ex_aid_energy_item("invisible_energy_item",new PotionEffect(MobEffects.INVISIBILITY, 500, 0,true,false)).setCreativeTab(Tabs.tabex_aid);
	public static Item confusion_energy_item = new item_ex_aid_energy_item("confusion_energy_item",new PotionEffect(MobEffects.NAUSEA, 500, 0,true,false)).setCreativeTab(Tabs.tabex_aid);
	
	public static Item christmas_energy_item = new Item_ore("christmas_energy_item").setCreativeTab(Tabs.tabex_aid);
	public static Item emission_energy_item  = new item_ex_aid_energy_item("emission_energy_item",new PotionEffect(MobEffects.NIGHT_VISION, 1000, 0,true,false)).setCreativeTab(Tabs.tabex_aid);
	public static Item liquid_energy_item = new item_ex_aid_energy_item("liquid_energy_item",new PotionEffect(MobEffects.WATER_BREATHING, 1000, 0,true,false)).setCreativeTab(Tabs.tabex_aid);

	public static Item seperation_energy_item = new Item_ore("seperation_energy_item").setCreativeTab(Tabs.tabex_aid);
	public static Item dark_energy_item = new item_ex_aid_energy_item("dark_energy_item",new PotionEffect(MobEffects.BLINDNESS, 500, 0,true,false)).setCreativeTab(Tabs.tabex_aid);

	public static Item stretch_energy_item = new Item_ore("stretch_energy_item").setCreativeTab(Tabs.tabex_aid);
	public static Item sleep_energy_item = new Item_ore("sleep_energy_item").setCreativeTab(Tabs.tabex_aid);
	public static Item reflect_energy_item = new Item_ore("reflect_energy_item").setCreativeTab(Tabs.tabex_aid);
	public static Item reverse_energy_item  = new item_ex_aid_energy_item("reverse_energy_item",new PotionEffect(MobEffects.INSTANT_HEALTH, 1, 10,true,false)).setCreativeTab(Tabs.tabex_aid);
	//Senior
	public static Item lucky_energy_item = new item_ex_aid_energy_item("lucky_energy_item",new PotionEffect(MobEffects.LUCK, 500, 0,true,false)).setCreativeTab(Tabs.tabex_aid);
	
	public static Item flatten_energy_item = new Item_ore("flatten_energy_item").setCreativeTab(Tabs.tabex_aid);
	public static Item balloon_energy_item = new Item_ore("balloon_energy_item").setCreativeTab(Tabs.tabex_aid);
	public static Item gag_energy_item = new Item_ore("gag_energy_item").setCreativeTab(Tabs.tabex_aid);
	//Memory
	//Desire
	//Friendship
	//Veteran
	public static Item disguise_energy_item = new Item_ore("disguise_energy_item").setCreativeTab(Tabs.tabex_aid);
	public static Item fascination_energy_item = new Item_ore("fascination_energy_item").setCreativeTab(Tabs.tabex_aid);
	public static Item partner_energy_item = new Item_ore("partner_energy_item").setCreativeTab(Tabs.tabex_aid);
	public static Item prediction_energy_item = new Item_ore("prediction_energy_item").setCreativeTab(Tabs.tabex_aid);
	public static Item halt_energy_item = new item_ex_aid_energy_item("halt_energy_item",new PotionEffect(MobEffects.SLOWNESS, 500, 100,true,false)).setCreativeTab(Tabs.tabex_aid);
	
	public static Item end_energy_item = new Item_ore("end_energy_item").setCreativeTab(Tabs.tabex_aid);
	//Succession
	public static Item bug_energy_item = new item_ex_aid_energy_item("bug_energy_item",new PotionEffect(PotionCore.BUGSTER_POTION, 500, 0,true,false)).setCreativeTab(Tabs.tabex_aid);

	public static Item random_energy_item = new Item_ore("random_energy_item").setCreativeTab(Tabs.tabex_aid);
	public static Item save_energy_item = new Item_ore("save_energy_item").setCreativeTab(Tabs.tabex_aid);
	//Continue
	
	
	public static Item mighty_action_x_gasha_trophy = new Item_ore("mighty_action_x_gasha_trophy").setCreativeTab(Tabs.tabex_aid);
	public static Item taddle_quest_gasha_trophy = new Item_ore("taddle_quest_gasha_trophy").setCreativeTab(Tabs.tabex_aid);
	public static Item bang_bang_shooting_gasha_trophy = new Item_ore("bang_bang_shooting_gasha_trophy").setCreativeTab(Tabs.tabex_aid);
	public static Item bakusou_bike_gasha_trophy = new Item_ore("bakusou_bike_gasha_trophy").setCreativeTab(Tabs.tabex_aid);
	public static Item shakariki_sports_gasha_trophy = new Item_ore("shakariki_sports_gasha_trophy").setCreativeTab(Tabs.tabex_aid);
	public static Item gekitotsu_robots_gasha_trophy = new Item_ore("gekitotsu_robots_gasha_trophy").setCreativeTab(Tabs.tabex_aid);
	public static Item doremifa_beat_gasha_trophy = new Item_ore("doremifa_beat_gasha_trophy").setCreativeTab(Tabs.tabex_aid);
	public static Item giri_giri_chambara_gasha_trophy = new Item_ore("giri_giri_chambara_gasha_trophy").setCreativeTab(Tabs.tabex_aid);
	public static Item jet_combat_gasha_trophy = new Item_ore("jet_combat_gasha_trophy").setCreativeTab(Tabs.tabex_aid);
	public static Item drago_knight_hunter_z_gasha_trophy = new Item_ore("drago_knight_hunter_z_gasha_trophy").setCreativeTab(Tabs.tabex_aid);
	public static Item perfect_puzzle_gasha_trophy = new Item_ore("perfect_puzzle_gasha_trophy").setCreativeTab(Tabs.tabex_aid);
	public static Item knockout_fighter_gasha_trophy = new Item_ore("knockout_fighter_gasha_trophy").setCreativeTab(Tabs.tabex_aid);
	public static Item toki_meki_crisis_gasha_trophy = new Item_ore("toki_meki_crisis_gasha_trophy").setCreativeTab(Tabs.tabex_aid);
	
	public static Item gamer_driver_mighty = new Item_ore("gamer_driver_mighty");
	public static Item gamer_driver_taddle = new Item_ore("gamer_driver_taddle");
	public static Item gamer_driver_bang = new Item_ore("gamer_driver_bang");
	public static Item gamer_driver_protomighty = new Item_ore("gamer_driver_protomighty");
	public static Item gamer_driver_robots = new Item_ore("gamer_driver_robots");
	public static Item gamer_driver_protorobots = new Item_ore("gamer_driver_protorobots");
	public static Item gamer_driver_doremifa = new Item_ore("gamer_driver_doremifa");
	public static Item gamer_driver_protodoremifa = new Item_ore("gamer_driver_protodoremifa");
	public static Item gamer_driver_combat = new Item_ore("gamer_driver_combat");
	public static Item gamer_driver_protocombat = new Item_ore("gamer_driver_protocombat");
	public static Item gamer_driver_shakariki = new Item_ore("gamer_driver_shakariki");
	public static Item gamer_driver_protoshakariki = new Item_ore("gamer_driver_protoshakariki");
	public static Item gamer_driver_dragoknightfull = new Item_ore("gamer_driver_dragoknightfull");
	public static Item gamer_driver_dragoknightfang = new Item_ore("gamer_driver_dragoknightfang");
	public static Item gamer_driver_dragoknightblade = new Item_ore("gamer_driver_dragoknightblade");
	public static Item gamer_driver_dragoknightgun= new Item_ore("gamer_driver_dragoknightgun");
	public static Item gamer_driver_dragoknightclaw = new Item_ore("gamer_driver_dragoknightclaw");
	public static Item gamer_driver_girigiri = new Item_ore("gamer_driver_girigiri");
	public static Item gamer_driver_protogirigiri = new Item_ore("gamer_driver_protogirigiri");
	public static Item gamer_driver_bikecombi = new Item_ore("gamer_driver_bikecombi");
	public static Item gamer_driver_burger = new Item_ore("gamer_driver_burger");
	public static Item gamer_driver_pacman = new Item_ore("gamer_driver_pacman");
	public static Item gamer_driver_famista = new Item_ore("gamer_driver_famista");
	public static Item gamer_driver_xevious = new Item_ore("gamer_driver_xevious");
	public static Item gamer_driver_safari = new Item_ore("gamer_driver_safari");
	public static Item gamer_driver_fantasy = new Item_ore("gamer_driver_fantasy");
	public static Item gamer_driver_legacy = new Item_ore("gamer_driver_legacy");
	public static Item gamer_driver_simulation = new Item_ore("gamer_driver_simulation");
	public static Item gamer_driver_zombie = new Item_ore("gamer_driver_zombie");
	public static Item gamer_driver_mightybros = new Item_ore("gamer_driver_mightybros");
	public static Item gamer_driver_galaxian = new Item_ore("gamer_driver_galaxian");
	public static Item gamer_driver_creator = new Item_ore("gamer_driver_creator");
	public static Item gamer_driver_knockout2 = new Item_ore("gamer_driver_knockout2");
	public static Item gamer_driver_maximum = new Item_ore("gamer_driver_maximum");
	public static Item gamer_driver_godmaximum = new Item_ore("gamer_driver_godmaximum");
	public static Item gamer_driver_muteki = new Item_ore("gamer_driver_muteki");
	public static Item gamer_driver_origin = new Item_ore("gamer_driver_origin");
	public static Item gamer_driver_musou = new Item_ore("gamer_driver_musou");
	public static Item gamer_driver_novel = new Item_ore("gamer_driver_novel");
	public static Item gamer_driver_tank = new Item_ore("gamer_driver_tank");

	public static Item gamer_driver = new Item_ore("gamer_driver");
	public static Item gamer_driver_ex_aid_lv1 = new Item_ore("gamer_driver_ex_aid_lv1");
	public static Item gamer_driver_brave_lv1 = new Item_ore("gamer_driver_brave_lv1");
	public static Item gamer_driver_snipe_lv1 = new Item_ore("gamer_driver_snipe_lv1");
	public static Item gamer_driver_lazer_lv1 = new Item_ore("gamer_driver_lazer_lv1");
	public static Item gamer_driver_genm_lv1 = new Item_ore("gamer_driver_genm_lv1");
	public static Item gamer_driver_protobrave_lv1 = new Item_ore("gamer_driver_protobrave_lv1");
	public static Item gamer_driver_protosnipe_lv1 = new Item_ore("gamer_driver_protosnipe_lv1");
	public static Item gamer_driver_lv99 = new Item_ore("gamer_driver_lv99");

	public static Item gamer_driver_ghost = new Item_ore("gamer_driver_ghost");
	public static Item gamer_driver_ghost_lv1 = new Item_ore("gamer_driver_ghost_lv1");
	public static Item gamer_driver_drive = new Item_ore("gamer_driver_drive");
	public static Item gamer_driver_gaim = new Item_ore("gamer_driver_gaim");
	public static Item gamer_driver_wizard = new Item_ore("gamer_driver_wizard");
	public static Item gamer_driver_fourze = new Item_ore("gamer_driver_fourze");
	public static Item gamer_driver_ooo = new Item_ore("gamer_driver_ooo");
	public static Item gamer_driver_w = new Item_ore("gamer_driver_w");
	public static Item gamer_driver_decade = new Item_ore("gamer_driver_decade");
	public static Item gamer_driver_kiva = new Item_ore("gamer_driver_kiva");
	public static Item gamer_driver_den_o = new Item_ore("gamer_driver_den_o");
	public static Item gamer_driver_kabuto = new Item_ore("gamer_driver_kabuto");
	public static Item gamer_driver_hibiki = new Item_ore("gamer_driver_hibiki");
	public static Item gamer_driver_blade = new Item_ore("gamer_driver_blade");
	public static Item gamer_driver_faiz = new Item_ore("gamer_driver_faiz");
	public static Item gamer_driver_ryuki = new Item_ore("gamer_driver_ryuki");
	public static Item gamer_driver_agito = new Item_ore("gamer_driver_agito");
	public static Item gamer_driver_kuuga = new Item_ore("gamer_driver_kuuga");
	public static Item gamer_driver_ichigo = new Item_ore("gamer_driver_ichigo");

	public static Item totema_wings = new Item_ore("totema_wings");
	public static Item chronus_clock = new Item_ore("chronus_clock").setCreativeTab(Tabs.tabex_aid);


	//build
	public static Item full_bottle = new Item_full_bottle(0, "0","full_bottle").setCreativeTab(Tabs.tabbuild);
	public static Block pandora_box = new ore_block("pandora_box",Material.ROCK, full_bottle, 2).setHardness(9.9F).setCreativeTab(Tabs.tabbuild);

	public static Item sclashjelly = new Item_full_bottle(0, "0","sclashjelly").setCreativeTab(Tabs.tabbuild);
	public static Item unfinished_gear = new Item_ore("unfinished_gear").setCreativeTab(Tabs.tabbuild);
	public static Item smash_bottle = new Item_full_bottle(0, "0","smash_bottle").setCreativeTab(Tabs.tabbuild);

	public static Item drill_crusher = new Item_sword_gun("drill_crusher",Tabs.musou_saber, RiderItems.full_bottle).setMaxStackSize(1).setCreativeTab(Tabs.tabbuild);
	public static Item hawk_gatlinger = new Item_gun("hawk_gatlinger",Tabs.gashacon_magnum_gun, RiderItems.full_bottle).setMaxStackSize(1).setCreativeTab(Tabs.tabbuild);
	public static Item koma_ninpoutou = new ItemBaseSword("koma_ninpoutou",Tabs.gashacon_breaker, RiderItems.full_bottle).setMaxStackSize(1).setCreativeTab(Tabs.tabbuild);
	public static Item kaizoku_hassha = new Item_gun("kaizoku_hassha",Tabs.kaizoku_hassha, RiderItems.full_bottle).setMaxStackSize(1).setCreativeTab(Tabs.tabbuild);
	public static Item twinbreaker_sword = new Item_sword_gun("twinbreaker_sword",Tabs.musou_saber, RiderItems.full_bottle).setMaxStackSize(1).setCreativeTab(Tabs.tabbuild);
	public static Item beat_crosser = new ItemBaseSword("beat_crosser",Tabs.gashacon_breaker, RiderItems.full_bottle).setMaxStackSize(1).setCreativeTab(Tabs.tabbuild);
	public static Item full_bottle_buster = new Item_sword_gun("full_bottle_buster",Tabs.faiz_blaster, RiderItems.full_bottle).setMaxStackSize(1).setCreativeTab(Tabs.tabbuild);
	public static Item magma_knuckle = new ItemBaseSword("magma_knuckle",Tabs.dogga_hammer, RiderItems.full_bottle).setMaxStackSize(1).setCreativeTab(Tabs.tabbuild);
	public static Item blizzard_knuckle = new ItemBaseSword("blizzard_knuckle",Tabs.dogga_hammer, RiderItems.full_bottle).setMaxStackSize(1).setCreativeTab(Tabs.tabbuild);

	public static Item pandora_panel_green = new item_panel("pandora_panel_green", Green).setCreativeTab(Tabs.tabbuild);
	public static Item pandora_panel_red = new item_panel("pandora_panel_red", Red).setCreativeTab(Tabs.tabbuild);
	public static Item pandora_panel_blue = new item_panel("pandora_panel_blue", Blue).setCreativeTab(Tabs.tabbuild);
	public static Item pandora_panel_black = new item_panel("pandora_panel_black", Black).setCreativeTab(Tabs.tabbuild);
	public static Item pandora_panel_white = new item_panel("pandora_panel_white", White).setCreativeTab(Tabs.tabbuild);

	public static Item buildhead = new item_rider_armor("buildhead",item_builddriver.class,ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.HEAD, full_bottle).setCreativeTab(Tabs.tabbuild);
	public static Item buildtroso = new item_rider_armor("buildtroso",item_builddriver.class,ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.CHEST, full_bottle).setCreativeTab(Tabs.tabbuild);
	public static Item buildlegs = new item_rider_armor("buildlegs",item_builddriver.class,ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.LEGS, full_bottle).setCreativeTab(Tabs.tabbuild);

	
	public static Item build_driver = new item_builddriver("build_driver",ArmorMaterial.DIAMOND, 4,"build").setMaxStackSize(1).setCreativeTab(Tabs.tabbuild);
	public static Item build_driver_cross_z = new item_builddriver("build_driver_cross_z",ArmorMaterial.DIAMOND, 4,"cross_z").setMaxStackSize(1).setCreativeTab(Tabs.tabbuild);
	public static Item build_driver_grease = new item_builddriver("build_driver_grease",ArmorMaterial.DIAMOND, 4,"grease").setMaxStackSize(1).setCreativeTab(Tabs.tabbuild);
	public static Item build_driver_rogue = new item_builddriver("build_driver_rogue",ArmorMaterial.DIAMOND, 4,"prime_rogue").setMaxStackSize(1).setCreativeTab(Tabs.tabbuild);
	public static Item build_driver_blood = new item_builddriver("build_driver_blood",ArmorMaterial.DIAMOND, 4,"blood").setMaxStackSize(1).setCreativeTab(Tabs.tabbuild);
	public static Item build_driver_killbas = new item_builddriver("build_driver_killbas",ArmorMaterial.DIAMOND, 4,"killbas").setMaxStackSize(1).setCreativeTab(Tabs.tabbuild);
	public static Item build_driver_build_metal = new item_builddriver("build_driver_build_metal",ArmorMaterial.DIAMOND, 4,"build_metal").setMaxStackSize(1).setCreativeTab(Tabs.tabbuild);
	public static Item build_driver_build_phantom = new item_builddriver("build_driver_build_phantom",ArmorMaterial.DIAMOND, 4,"build_phantom").setMaxStackSize(1).setCreativeTab(Tabs.tabbuild);

	public static Item sclash_driver_grease = new item_builddriver("sclash_driver_grease",ArmorMaterial.DIAMOND, 4,"grease").setMaxStackSize(1).setCreativeTab(Tabs.tabbuild);
	public static Item sclash_driver_cross_z_charge = new item_builddriver("sclash_driver_cross_z_charge",ArmorMaterial.DIAMOND, 4,"cross_z_charge").setMaxStackSize(1).setCreativeTab(Tabs.tabbuild);
	public static Item sclash_driver_rogue = new item_builddriver("sclash_driver_rogue",ArmorMaterial.DIAMOND, 4,"rogue").setMaxStackSize(1).setCreativeTab(Tabs.tabbuild);

	public static Item evol_driver_evol = new item_builddriver("evol_driver_evol",ArmorMaterial.DIAMOND, 4,"evol").setMaxStackSize(1).setCreativeTab(Tabs.tabbuild);
	public static Item evol_driver_mad_rogue = new item_builddriver("evol_driver_mad_rogue",ArmorMaterial.DIAMOND, 4,"mad_rogue").setMaxStackSize(1).setCreativeTab(Tabs.tabbuild);


	public static Item transteamgun = new Item_transteamgun("transteamgun",Tabs.den_dengu).setMaxStackSize(1).setCreativeTab(Tabs.tabbuild);
	public static Item transteamgun_2 = new item_builddriver("transteamgun_2",ArmorMaterial.DIAMOND, 4,"blood_stalk").setMaxStackSize(1);
	public static Item transteamgun_rifle = new Item_gun("transteamgun_rifle",Tabs.den_denro, RiderItems.full_bottle).setMaxStackSize(1).setCreativeTab(Tabs.tabbuild);

	public static Item steam_blade = new ItemBaseSword("steam_blade",Tabs.den_denso, RiderItems.full_bottle).setMaxStackSize(1).setCreativeTab(Tabs.tabbuild);

	public static Item nebulasteamgun = new Item_nebulasteamgun("nebulasteamgun",Tabs.den_dengu).setMaxStackSize(1).setCreativeTab(Tabs.tabbuild);
	public static Item nebulasteamgun_2 = new item_builddriver("nebulasteamgun_2",ArmorMaterial.DIAMOND, 4,"kaiser").setMaxStackSize(1);
	public static Item nebulasteamgun_rifle = new Item_gun("nebulasteamgun_rifle",Tabs.den_dengu, RiderItems.full_bottle).setMaxStackSize(1).setCreativeTab(Tabs.tabbuild);

	public static Item build_phone = new item_buildphone("build_phone").setCreativeTab(Tabs.tabbuild);

	public static Item rabbit_full_bottle = new Item_full_bottle(0, "3","rabbit_full_bottle",10).setCreativeTab(Tabs.tabbuild);
	public static Item gorilla_full_bottle = new Item_full_bottle(1, "3","gorilla_full_bottle",5).setCreativeTab(Tabs.tabbuild);
	public static Item taka_full_bottle = new Item_full_bottle(2, "3","taka_full_bottle",5).setCreativeTab(Tabs.tabbuild);
	public static Item harinezumi_full_bottle = new Item_full_bottle(3, "3","harinezumi_full_bottle",5).setCreativeTab(Tabs.tabbuild);
	public static Item ninjya_full_bottle = new Item_full_bottle(4, "3","ninjya_full_bottle",5).setCreativeTab(Tabs.tabbuild);
	public static Item panda_full_bottle = new Item_full_bottle(5, "3","panda_full_bottle",5).setCreativeTab(Tabs.tabbuild);
	public static Item lion_full_bottle = new Item_full_bottle(6, "3","lion_full_bottle",5).setCreativeTab(Tabs.tabbuild);
	public static Item dragon_full_bottle = new Item_full_bottle(7, "3","dragon_full_bottle",5).setCreativeTab(Tabs.tabbuild);
	public static Item kaizoku_full_bottle = new Item_full_bottle(14, "3","kaizoku_full_bottle",5).setCreativeTab(Tabs.tabbuild);
	public static Item octopus_full_bottle = new Item_full_bottle(15, "3","octopus_full_bottle",5).setCreativeTab(Tabs.tabbuild);
	public static Item phoenix_full_bottle = new Item_full_bottle(16, "3","phoenix_full_bottle",2).setCreativeTab(Tabs.tabbuild);
	public static Item rose_full_bottle = new Item_full_bottle(24, "3","rose_full_bottle",2).setCreativeTab(Tabs.tabbuild);
	public static Item tora_full_bottle = new Item_full_bottle(25, "3","tora_full_bottle",2).setCreativeTab(Tabs.tabbuild);
	public static Item kujira_full_bottle = new Item_full_bottle(26, "3","kujira_full_bottle",2).setCreativeTab(Tabs.tabbuild);
	public static Item kirin_full_bottle = new Item_full_bottle(27, "3","kirin_full_bottle",2).setCreativeTab(Tabs.tabbuild);
	public static Item unicorn_full_bottle = new Item_full_bottle(28, "3","unicorn_full_bottle",2).setCreativeTab(Tabs.tabbuild);
	public static Item turtle_full_bottle = new Item_full_bottle(29, "3","turtle_full_bottle",2).setCreativeTab(Tabs.tabbuild);
	public static Item deer_full_bottle = new Item_full_bottle(30, "3","deer_full_bottle",2).setCreativeTab(Tabs.tabbuild);
	public static Item penguin_full_bottle = new Item_full_bottle(31, "3","penguin_full_bottle",2).setCreativeTab(Tabs.tabbuild);
	public static Item spider_full_bottle = new Item_full_bottle(32, "3","spider_full_bottle",2).setCreativeTab(Tabs.tabbuild);
	public static Item rabbit_gold_full_bottle = new Item_full_bottle(33, "3","rabbit_gold_full_bottle",1).setCreativeTab(Tabs.tabbuild);
	public static Item bat_full_bottle_2 = new Item_full_bottle(34, "3","bat_full_bottle_2",2).setCreativeTab(Tabs.tabbuild);
	public static Item same_full_bottle = new Item_full_bottle(35, "3","same_full_bottle",2).setCreativeTab(Tabs.tabbuild);
	public static Item hachi_full_bottle = new Item_full_bottle(36, "3","hachi_full_bottle",2).setCreativeTab(Tabs.tabbuild);
	public static Item sai_full_bottle = new Item_full_bottle(37, "3","sai_full_bottle",2).setCreativeTab(Tabs.tabbuild);
	public static Item scorpion_full_bottle = new Item_full_bottle(38, "3","scorpion_full_bottle",1).setCreativeTab(Tabs.tabbuild);

	public static Item dog_full_bottle = new Item_full_bottle(11, "3","dog_full_bottle",2).setCreativeTab(Tabs.tabbuild);
	public static Item santa_full_bottle = new Item_full_bottle(8, "3","santa_full_bottle",2).setCreativeTab(Tabs.tabbuild);
	public static Item kuma_full_bottle = new Item_full_bottle(17, "3","kuma_full_bottle",2).setCreativeTab(Tabs.tabbuild);
	public static Item wolf_full_bottle = new Item_full_bottle(21, "3","wolf_full_bottle",2).setCreativeTab(Tabs.tabbuild);
	public static Item beetle_full_bottle = new Item_full_bottle(22, "3","beetle_full_bottle",2).setCreativeTab(Tabs.tabbuild);

	public static Item doctor_full_bottle = new Item_full_bottle(10, "3","doctor_full_bottle",0).setCreativeTab(Tabs.tabbuild);
	public static Item orange_full_bottle = new Item_full_bottle(9, "3","orange_full_bottle",0).setCreativeTab(Tabs.tabbuild);
	public static Item mahoutskai_full_bottle = new Item_full_bottle(12, "3","mahoutskai_full_bottle",0).setCreativeTab(Tabs.tabbuild);
	public static Item tantei_full_bottle = new Item_full_bottle(13, "3","tantei_full_bottle",0).setCreativeTab(Tabs.tabbuild);
	public static Item momotaros_full_bottle = new Item_full_bottle(18, "3","momotaros_full_bottle",0).setCreativeTab(Tabs.tabbuild);
	public static Item yujou_full_bottle = new Item_full_bottle(19, "3","yujou_full_bottle",0).setCreativeTab(Tabs.tabbuild);
	public static Item obake_full_bottle = new Item_full_bottle(20, "3","obake_full_bottle",2).setCreativeTab(Tabs.tabbuild);
	public static Item card_full_bottle = new Item_full_bottle(23, "3","card_full_bottle",0).setCreativeTab(Tabs.tabbuild);

	public static Item tank_full_bottle = new Item_full_bottle(0, "1","tank_full_bottle",10).setCreativeTab(Tabs.tabbuild);
	public static Item diamond_full_bottle = new Item_full_bottle(1, "1","diamond_full_bottle",5).setCreativeTab(Tabs.tabbuild);
	public static Item gatling_full_bottle = new Item_full_bottle(2, "1","gatling_full_bottle",5).setCreativeTab(Tabs.tabbuild);
	public static Item soujiki_full_bottle = new Item_full_bottle(3, "1","soujiki_full_bottle",5).setCreativeTab(Tabs.tabbuild);
	public static Item comic_full_bottle = new Item_full_bottle(4, "1","comic_full_bottle",5).setCreativeTab(Tabs.tabbuild);
	public static Item rocket_full_bottle = new Item_full_bottle(5, "1","rocket_full_bottle",5).setCreativeTab(Tabs.tabbuild);
	public static Item shoubousha_full_bottle = new Item_full_bottle(6, "1","shoubousha_full_bottle",5).setCreativeTab(Tabs.tabbuild);
	public static Item lock_full_bottle = new Item_full_bottle(7, "1","lock_full_bottle",5).setCreativeTab(Tabs.tabbuild);
	public static Item ressha_full_bottle = new Item_full_bottle(13, "1","ressha_full_bottle",5).setCreativeTab(Tabs.tabbuild);
	public static Item light_full_bottle = new Item_full_bottle(14, "1","light_full_bottle",5).setCreativeTab(Tabs.tabbuild);
	public static Item robo_full_bottle = new Item_full_bottle(15, "1","robo_full_bottle",2).setCreativeTab(Tabs.tabbuild);
	public static Item helicopter_full_bottle = new Item_full_bottle(20, "1","helicopter_full_bottle",2).setCreativeTab(Tabs.tabbuild);
	public static Item ufo_full_bottle = new Item_full_bottle(21, "1","ufo_full_bottle",2).setCreativeTab(Tabs.tabbuild);
	public static Item jet_full_bottle = new Item_full_bottle(22, "1","jet_full_bottle",2).setCreativeTab(Tabs.tabbuild);
	public static Item cyclone_full_bottle = new Item_full_bottle(23, "1","cyclone_full_bottle",2).setCreativeTab(Tabs.tabbuild);
	public static Item eraser_full_bottle = new Item_full_bottle(24, "1","eraser_full_bottle",2).setCreativeTab(Tabs.tabbuild);
	public static Item watch_full_bottle = new Item_full_bottle(25, "1","watch_full_bottle",2).setCreativeTab(Tabs.tabbuild);
	public static Item pyramid_full_bottle = new Item_full_bottle(26, "1","pyramid_full_bottle",2).setCreativeTab(Tabs.tabbuild);
	public static Item skateboard_full_bottle = new Item_full_bottle(27, "1","skateboard_full_bottle",2).setCreativeTab(Tabs.tabbuild);
	public static Item fridge_full_bottle = new Item_full_bottle(28, "1","fridge_full_bottle",2).setCreativeTab(Tabs.tabbuild);
	public static Item dragon_silver_full_bottle = new Item_full_bottle(29, "1","dragon_silver_full_bottle",1).setCreativeTab(Tabs.tabbuild);
	public static Item engine_full_bottle = new Item_full_bottle(30, "1","engine_full_bottle",2).setCreativeTab(Tabs.tabbuild);
	public static Item bike_full_bottle = new Item_full_bottle(31, "1","bike_full_bottle",2).setCreativeTab(Tabs.tabbuild);
	public static Item magnet_full_bottle = new Item_full_bottle(32, "1","magnet_full_bottle",2).setCreativeTab(Tabs.tabbuild);
	public static Item submarine_full_bottle = new Item_full_bottle(33, "1","submarine_full_bottle",2).setCreativeTab(Tabs.tabbuild);
	public static Item dryer_full_bottle = new Item_full_bottle(34, "1","dryer_full_bottle",2).setCreativeTab(Tabs.tabbuild);
	public static Item gold_full_bottle = new Item_full_bottle(35, "1","gold_full_bottle",1).setCreativeTab(Tabs.tabbuild);

	public static Item rabbittank_sparkling_full_bottle = new Item_full_bottle(1, "2","rabbittank_sparkling_full_bottle",0).setCreativeTab(Tabs.tabbuild);
	public static Item hazard_trigger = new Item_full_bottle(2, "2","hazard_trigger",0).setCreativeTab(Tabs.tabbuild);
	public static Item fullfull_bottle_rabbit = new Item_full_bottle(3, "2","fullfull_bottle_rabbit",0).setCreativeTab(Tabs.tabbuild);
	public static Item fullfull_bottle_tank = new Item_full_bottle(4, "2","fullfull_bottle_tank",0).setCreativeTab(Tabs.tabbuild);
	public static Item genius_full_bottle = new Item_full_bottle(5, "2","genius_full_bottle",0).setCreativeTab(Tabs.tabbuild);
	public static Item cross_z_build_can = new Item_full_bottle(6, "2","cross_z_build_can",0).setCreativeTab(Tabs.tabbuild);

	public static Item mic_full_bottle = new Item_full_bottle(11, "1","mic_full_bottle",2).setCreativeTab(Tabs.tabbuild);
	public static Item cake_full_bottle = new Item_full_bottle(8, "1","cake_full_bottle",2).setCreativeTab(Tabs.tabbuild);
	public static Item televi_full_bottle = new Item_full_bottle(16, "1","televi_full_bottle",2).setCreativeTab(Tabs.tabbuild);
	public static Item smartphone_full_bottle = new Item_full_bottle(18, "1","smartphone_full_bottle",2).setCreativeTab(Tabs.tabbuild);
	public static Item camera_full_bottle = new Item_full_bottle(19, "1","camera_full_bottle",2).setCreativeTab(Tabs.tabbuild);

	public static Item game_full_bottle = new Item_full_bottle(10, "1","game_full_bottle",0).setCreativeTab(Tabs.tabbuild);
	public static Item medal_full_bottle = new Item_full_bottle(9, "1","medal_full_bottle",0).setCreativeTab(Tabs.tabbuild);
	public static Item usb_memory_full_bottle = new Item_full_bottle(12, "1","usb_memory_full_bottle",0).setCreativeTab(Tabs.tabbuild);
	public static Item parka_full_bottle = new Item_full_bottle(17, "1","parka_full_bottle",0).setCreativeTab(Tabs.tabbuild);
	public static Item low_rabbit_full_bottle = new Item_full_bottle(0, "0","low_rabbit_full_bottle").setCreativeTab(Tabs.tabbuild);

	public static Item ex_aid_full_bottle = new Item_full_bottle(0, "0","ex_aid_full_bottle").setCreativeTab(Tabs.tabbuild);
	public static Item ghost_full_bottle = new Item_full_bottle(0, "0","ghost_full_bottle").setCreativeTab(Tabs.tabbuild);
	public static Item drive_full_bottle = new Item_full_bottle(0, "0","drive_full_bottle").setCreativeTab(Tabs.tabbuild);
	public static Item gaim_full_bottle = new Item_full_bottle(0, "0","gaim_full_bottle").setCreativeTab(Tabs.tabbuild);
	public static Item wizard_full_bottle = new Item_full_bottle(0, "0","wizard_full_bottle").setCreativeTab(Tabs.tabbuild);
	public static Item fourze_full_bottle = new Item_full_bottle(0, "0","fourze_full_bottle").setCreativeTab(Tabs.tabbuild);

	public static Item dragon_sclashjelly = new Item_full_bottle(0, "0","dragon_sclashjelly").setCreativeTab(Tabs.tabbuild);
	public static Item robot_sclashjelly = new Item_full_bottle(0, "0","robot_sclashjelly").setCreativeTab(Tabs.tabbuild);
	public static Item crocodile_crack_full_bottle = new Item_full_bottle(0, "0","crocodile_crack_full_bottle").setCreativeTab(Tabs.tabbuild);

	public static Item bat_full_bottle = new Item_full_bottle(0, "4","bat_full_bottle",0).setCreativeTab(Tabs.tabbuild);
	public static Item cobra_full_bottle = new Item_full_bottle(1, "4","cobra_full_bottle",0).setCreativeTab(Tabs.tabbuild);
	public static Item fukurou_full_bottle = new Item_full_bottle(0, "0","fukurou_full_bottle").setCreativeTab(Tabs.tabbuild);
	public static Item kuwagata_full_bottle = new Item_full_bottle(0, "0","kuwagata_full_bottle").setCreativeTab(Tabs.tabbuild);
	public static Item castle_full_bottle = new Item_full_bottle(0, "0","castle_full_bottle").setCreativeTab(Tabs.tabbuild);

	public static Item gear_engine = new Item_full_bottle(0, "5","gear_engine",0).setCreativeTab(Tabs.tabbuild);
	public static Item gear_remocon = new Item_full_bottle(1, "5","gear_remocon",0).setCreativeTab(Tabs.tabbuild);
	public static Item gear_red = new Item_full_bottle(2, "5","gear_red",0).setCreativeTab(Tabs.tabbuild);
	public static Item gear_blue = new Item_full_bottle(3, "5","gear_blue",0).setCreativeTab(Tabs.tabbuild);

	public static Item cobra_evol_bottle = new Item_full_bottle(0, "6","cobra_evol_bottle",0).setCreativeTab(Tabs.tabbuild);
	public static Item rider_system_evol_bottle = new Item_full_bottle(0, "0","rider_system_evol_bottle").setCreativeTab(Tabs.tabbuild);
	public static Item dragon_evol_bottle = new Item_full_bottle(1, "6","dragon_evol_bottle",0).setCreativeTab(Tabs.tabbuild);
	public static Item rabbit_evol_bottle = new Item_full_bottle(2, "6","rabbit_evol_bottle",0).setCreativeTab(Tabs.tabbuild);

	public static Item dragon_magma_full_bottle = new Item_full_bottle(1, "7","dragon_magma_full_bottle",0).setCreativeTab(Tabs.tabbuild);
	public static Item dragon_evol_bottle_gold = new Item_full_bottle(2, "7","dragon_evol_bottle_gold",0).setCreativeTab(Tabs.tabbuild);
	public static Item muscle_galaxy_full_bottle = new Item_full_bottle(3, "7","muscle_galaxy_full_bottle",0).setCreativeTab(Tabs.tabbuild);
	public static Item north_blizzard_full_bottle = new Item_full_bottle(0, "8","north_blizzard_full_bottle").setCreativeTab(Tabs.tabbuild);
	public static Item grease_full_bottle = new Item_full_bottle(1, "8","grease_full_bottle").setCreativeTab(Tabs.tabbuild);
	public static Item prime_rogue_full_bottle = new Item_full_bottle(0, "0","prime_rogue_full_bottle").setCreativeTab(Tabs.tabbuild);
	public static Item killbas_spider_full_bottle = new Item_full_bottle(0, "0","killbas_spider_full_bottle").setCreativeTab(Tabs.tabbuild);
	public static Item metal_tanktank_full_bottle = new Item_full_bottle(0, "0","metal_tanktank_full_bottle").setCreativeTab(Tabs.tabbuild);

	public static Item evol_trigger = new Item_full_bottle(3, "6","evol_trigger",0).setCreativeTab(Tabs.tabbuild);

	public static Item lost_bat_full_bottle = new Item_full_bottle(0, "0","lost_bat_full_bottle").setCreativeTab(Tabs.tabbuild);
	public static Item lost_cobra_full_bottle = new Item_full_bottle(0, "0","lost_cobra_full_bottle").setCreativeTab(Tabs.tabbuild);
	public static Item lost_castle_full_bottle = new Item_full_bottle(0, "0","lost_castle_full_bottle").setCreativeTab(Tabs.tabbuild);
	public static Item lost_kuwagata_full_bottle = new Item_full_bottle(0, "0","lost_kuwagata_full_bottle").setCreativeTab(Tabs.tabbuild);
	public static Item lost_fukurou_full_bottle = new Item_full_bottle(0, "0","lost_fukurou_full_bottle").setCreativeTab(Tabs.tabbuild);
	public static Item lost_hammer_full_bottle = new Item_full_bottle(0, "0","lost_hammer_full_bottle").setCreativeTab(Tabs.tabbuild);
	public static Item lost_shimauma_full_bottle = new Item_full_bottle(0, "0","lost_shimauma_full_bottle").setCreativeTab(Tabs.tabbuild);
	public static Item lost_spanner_full_bottle = new Item_full_bottle(0, "0","lost_spanner_full_bottle").setCreativeTab(Tabs.tabbuild);
	public static Item lost_hasami_full_bottle = new Item_full_bottle(0, "0","lost_hasami_full_bottle").setCreativeTab(Tabs.tabbuild);
	public static Item lost_cd_full_bottle = new Item_full_bottle(0, "0","lost_cd_full_bottle").setCreativeTab(Tabs.tabbuild);

	public static Item buttobasoul_full_bottle = new Item_full_bottle(0, "0","buttobasoul_full_bottle").setCreativeTab(Tabs.tabbuild);
	public static Item ganbarizing_full_bottle = new Item_full_bottle(0, "0","ganbarizing_full_bottle").setCreativeTab(Tabs.tabbuild);
	public static Item super_sentai_full_bottle = new Item_full_bottle(0, "0","super_sentai_full_bottle").setCreativeTab(Tabs.tabbuild);
	public static Item kamen_rider_full_bottle = new Item_full_bottle(0, "0","kamen_rider_full_bottle").setCreativeTab(Tabs.tabbuild);


	public static Item golden_bangle = new Item_ore("golden_bangle").setCreativeTab(Tabs.tabbuild);
	public static Item Pandora_bottle = new Item_full_bottle(0, "0","pandora_bottle").setCreativeTab(Tabs.tabbuild);
	public static Item nebula_gas_sample = new Item_ore("nebula_gas_sample").setCreativeTab(Tabs.tabbuild);
	public static Item genius_full_bottle_blank = new Item_full_bottle(0, "0","genius_full_bottle_blank").setCreativeTab(Tabs.tabbuild);
	public static Item metal_full_bottle = new Item_ore("metal_full_bottle").setCreativeTab(Tabs.tabbuild);




	//Zi-O
	public static Item blank_watch = new Item_blank_ridewatches2("blank_watch").setCreativeTab(Tabs.tabzi_o);
	public static Item blank_miridewatch = new Item_ore("blank_miridewatch").setCreativeTab(Tabs.tabzi_o);

	public static Item gaim_armor_wings = new Item_ore("gaim_armor_wings");

	public static Item zi_ohead = new item_rider_armor("zi_ohead",item_zikudriver.class,ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.HEAD, blank_watch).setCreativeTab(Tabs.tabzi_o);
	public static Item zi_otroso = new item_rider_armor("zi_otroso",item_zikudriver.class,ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.CHEST, blank_watch).setCreativeTab(Tabs.tabzi_o);
	public static Item zi_olegs = new item_rider_armor("zi_olegs",item_zikudriver.class,ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.LEGS, blank_watch).setCreativeTab(Tabs.tabzi_o);

	public static Item ziku_driver_zi_o = new item_zikudriver("ziku_driver_zi_o",ArmorMaterial.DIAMOND, 4, "zi_o",0).setMaxStackSize(1).setCreativeTab(Tabs.tabzi_o);
	public static Item ziku_driver_geiz = new item_zikudriver("ziku_driver_geiz",ArmorMaterial.DIAMOND, 4, "geiz",0).setMaxStackSize(1).setCreativeTab(Tabs.tabzi_o);
	public static Item oma_ziku_driver = new item_zikudriver("oma_ziku_driver",ArmorMaterial.DIAMOND, 4, "oma_zi_o",0).setMaxStackSize(1).setCreativeTab(Tabs.tabzi_o);
	public static Item beyondriver = new item_zikudriver("beyondriver",ArmorMaterial.DIAMOND, 4, "woz",0).setMaxStackSize(1).setCreativeTab(Tabs.tabzi_o);
	public static Item ziku_driver_zi_o_mirror = new item_zikudriver("ziku_driver_zi_o_mirror",ArmorMaterial.DIAMOND, 4, "zi_o_mirror",0).setMaxStackSize(1).setCreativeTab(Tabs.tabzi_o);

	public static Item ziku_driver_tsukuyomi = new item_zikudriver("ziku_driver_tsukuyomi",ArmorMaterial.DIAMOND, 4, "zio_tsukuyomi",0).setMaxStackSize(1).setCreativeTab(Tabs.tabzi_o);

	public static Item ziku_driver_barlckxs = new item_zikudriver("ziku_driver_barlckxs",ArmorMaterial.DIAMOND, 4, "barx",0).setMaxStackSize(1).setCreativeTab(Tabs.tabzi_o);
	public static Item ziku_driver_zonjis = new item_zikudriver("ziku_driver_zonjis",ArmorMaterial.DIAMOND, 4, "zonjis",0).setMaxStackSize(1).setCreativeTab(Tabs.tabzi_o);
	public static Item ziku_driver_zamonas = new item_zikudriver("ziku_driver_zamonas",ArmorMaterial.DIAMOND, 4, "zamonas",0).setMaxStackSize(1).setCreativeTab(Tabs.tabzi_o);

	public static Item shinobi_driver = new item_zikudriver("shinobi_driver",ArmorMaterial.DIAMOND, 4, "shinobi",0).setMaxStackSize(1).setCreativeTab(Tabs.tabzi_o);
	public static Item hattari_driver = new item_zikudriver("hattari_driver",ArmorMaterial.DIAMOND, 4, "hattari",0).setMaxStackSize(1).setCreativeTab(Tabs.tabzi_o);
	public static Item quiz_driver = new item_zikudriver("quiz_driver",ArmorMaterial.DIAMOND, 4, "quiz",0).setMaxStackSize(1).setCreativeTab(Tabs.tabzi_o);
	public static Item kikai_driver = new item_zikudriver("kikai_driver",ArmorMaterial.DIAMOND, 4, "kikai",0).setMaxStackSize(1).setCreativeTab(Tabs.tabzi_o);
	public static Item ginga_driver = new item_zikudriver("ginga_driver",ArmorMaterial.DIAMOND, 4, "ginga",0).setMaxStackSize(1).setCreativeTab(Tabs.tabzi_o);

	public static Item another_build_driver = new item_zikudriver("another_build_driver",ArmorMaterial.DIAMOND, 4, "another_build",0).setMaxStackSize(1).setCreativeTab(Tabs.tabzi_o);
	public static Item another_exaid_driver = new item_zikudriver("another_exaid_driver",ArmorMaterial.DIAMOND, 4, "another_ex_aid",0).setMaxStackSize(1).setCreativeTab(Tabs.tabzi_o);
	public static Item another_ghost_driver = new item_zikudriver("another_ghost_driver",ArmorMaterial.DIAMOND, 4, "another_ghost",0).setMaxStackSize(1).setCreativeTab(Tabs.tabzi_o);
	public static Item another_gaim_driver = new item_zikudriver("another_gaim_driver",ArmorMaterial.DIAMOND, 4, "another_gaim",0).setMaxStackSize(1).setCreativeTab(Tabs.tabzi_o);
	public static Item another_wizard_driver = new item_zikudriver("another_wizard_driver",ArmorMaterial.DIAMOND, 4, "another_wizard",0).setMaxStackSize(1).setCreativeTab(Tabs.tabzi_o);
	public static Item another_fourze_driver = new item_zikudriver("another_fourze_driver",ArmorMaterial.DIAMOND, 4, "another_fourze",0).setMaxStackSize(1).setCreativeTab(Tabs.tabzi_o);
	public static Item another_ooo_driver = new item_zikudriver("another_ooo_driver",ArmorMaterial.DIAMOND, 4, "another_ooo",0).setMaxStackSize(1).setCreativeTab(Tabs.tabzi_o);
	public static Item another_w_driver = new item_zikudriver("another_w_driver",ArmorMaterial.DIAMOND, 4, "another_w",0).setMaxStackSize(1).setCreativeTab(Tabs.tabzi_o);
	public static Item another_faiz_driver = new item_zikudriver("another_faiz_driver",ArmorMaterial.DIAMOND, 4, "another_faiz",0).setMaxStackSize(1).setCreativeTab(Tabs.tabzi_o);
	public static Item another_altering = new item_zikudriver("another_altering",ArmorMaterial.DIAMOND, 4, "another_agito_zio",0).setMaxStackSize(1).setCreativeTab(Tabs.tabzi_o);

	public static Item another_shinobi_driver = new item_zikudriver("another_shinobi_driver",ArmorMaterial.DIAMOND, 4, "another_shinobi",0).setMaxStackSize(1).setCreativeTab(Tabs.tabzi_o);

	public static Item zikan_grade = new Item_sword_gun("zikan_grade",Tabs.musou_saber, RiderItems.blank_watch).setMaxStackSize(1).setCreativeTab(Tabs.tabzi_o);
	public static Item zikan_zax = new Item_sword_gun("zikan_zax",Tabs.musou_saber, RiderItems.blank_watch).setMaxStackSize(1).setCreativeTab(Tabs.tabzi_o);
	public static Item drill_crusher_crusher = new ItemBaseSword("drill_crusher_crusher",Tabs.den_denaxe, RiderItems.blank_watch).setMaxStackSize(1).setCreativeTab(Tabs.tabzi_o);
	public static Item faiz_phone_x = new Item_gun("faiz_phone_x",Tabs.den_dengu, RiderItems.blank_watch).setMaxStackSize(1).setCreativeTab(Tabs.tabzi_o);
	public static Item ride_heisaber = new ItemBaseSword("ride_heisaber",Tabs.den_denaxe, RiderItems.blank_watch).setMaxStackSize(1).setCreativeTab(Tabs.tabzi_o);
	public static Item saikyo_girade = new ItemBaseSword("saikyo_girade",Tabs.den_denaxe, RiderItems.blank_watch).setMaxStackSize(1).setCreativeTab(Tabs.tabzi_o);
	public static Item saikyo_zikan_girade = new ItemBaseSword("saikyo_zikan_girade",Tabs.sunglasseslasher_sword, RiderItems.blank_watch).setMaxStackSize(1).setCreativeTab(Tabs.tabzi_o);
	public static Item zikan_despear = new ItemBaseSword("zikan_despear",Tabs.den_denso, RiderItems.blank_watch).setMaxStackSize(1).setCreativeTab(Tabs.tabzi_o);
	public static Item zikan_despear_kama = new ItemBaseSword("zikan_despear_kama",Tabs.den_denaxe, RiderItems.blank_watch).setMaxStackSize(1).setCreativeTab(Tabs.tabzi_o);
	public static Item zikan_despear_tsue = new ItemBaseSword("zikan_despear_tsue",Tabs.den_denro, RiderItems.blank_watch).setMaxStackSize(1).setCreativeTab(Tabs.tabzi_o);
	public static Item zikan_zaclaw = new Item_gashacon_breaker("zikan_zaclaw",Tabs.den_denaxe, RiderItems.blank_watch).setMaxStackSize(1).setCreativeTab(Tabs.tabzi_o);

	public static Item zamonas_bow = new Item_gun("zamonas_bow",Tabs.den_dengu, RiderItems.blank_watch).setMaxStackSize(1).setCreativeTab(Tabs.tabzi_o);
	public static Item barlckxs_sword = new ItemBaseSword("barlckxs_sword",Tabs.den_denaxe, RiderItems.blank_watch).setMaxStackSize(1).setCreativeTab(Tabs.tabzi_o);
	
	
	public static Item zi_o_ridewatch = new Item_ridewatches(0, 0,"zi_o_ridewatch").setCreativeTab(Tabs.tabzi_o);
	public static Item zi_o_ii_ridewatch = new Item_ridewatches(0, 0,"zi_o_ii_ridewatch").setCreativeTab(Tabs.tabzi_o);
	public static Item trinity_ridewatch = new Item_ridewatches(0, 0,"trinity_ridewatch").setCreativeTab(Tabs.tabzi_o);
	public static Item grandzi_o_ridewatch = new Item_ridewatches(0, 0,"grandzi_o_ridewatch").setCreativeTab(Tabs.tabzi_o);
	public static Item ohmazi_o_ridewatch = new Item_ridewatches(0, 0,"ohmazi_o_ridewatch").setCreativeTab(Tabs.tabzi_o);

	public static Item geiz_ridewatch = new Item_ridewatches(0, 0,"geiz_ridewatch").setCreativeTab(Tabs.tabzi_o);
	public static Item geizrevive_ridewatch = new Item_ridewatches(0, 25,"geizrevive_ridewatch").setCreativeTab(Tabs.tabzi_o);
	public static Item bibiru_geiz_ridewatch = new Item_ridewatches(0, 0,"bibiru_geiz_ridewatch").setCreativeTab(Tabs.tabzi_o);
	public static Item geiz_majesty_ridewatch = new Item_ridewatches(0, 0,"geiz_majesty_ridewatch").setCreativeTab(Tabs.tabzi_o);

	public static Item build_ridewatch = new Item_ridewatches(1, 1,"build_ridewatch",true).setCreativeTab(Tabs.tabzi_o);
	public static Item cross_z_ridewatch = new Item_ore("cross_z_ridewatch").setCreativeTab(Tabs.tabzi_o);
	public static Item exaid_ridewatch = new Item_ridewatches(1, 2,"exaid_ridewatch",true).setCreativeTab(Tabs.tabzi_o);
	public static Item genm_ridewatch = new Item_ridewatches(1, 19,"genm_ridewatch").setCreativeTab(Tabs.tabzi_o);
	public static Item ghost_ridewatch = new Item_ridewatches(1, 3,"ghost_ridewatch",true).setCreativeTab(Tabs.tabzi_o);
	public static Item drive_ridewatch = new Item_ridewatches(1, 4,"drive_ridewatch").setCreativeTab(Tabs.tabzi_o);
	public static Item mach_ridewatch = new Item_ore("mach_ridewatch").setCreativeTab(Tabs.tabzi_o);
	public static Item gaim_ridewatch = new Item_ridewatches(1, 5,"gaim_ridewatch").setCreativeTab(Tabs.tabzi_o);
	public static Item wizard_ridewatch = new Item_ridewatches(1, 6,"wizard_ridewatch").setCreativeTab(Tabs.tabzi_o);
	public static Item beast_ridewatch = new Item_ore("beast_ridewatch").setCreativeTab(Tabs.tabzi_o);
	public static Item fourze_ridewatch = new Item_ridewatches(1, 7,"fourze_ridewatch").setCreativeTab(Tabs.tabzi_o);
	public static Item ooo_ridewatch = new Item_ridewatches(1, 8,"ooo_ridewatch",true).setCreativeTab(Tabs.tabzi_o);
	public static Item w_ridewatch = new Item_ridewatches(1, 9,"w_ridewatch").setCreativeTab(Tabs.tabzi_o);
	public static Item decade_ridewatch = new Item_ridewatches(0, 20,"decade_ridewatch").setCreativeTab(Tabs.tabzi_o);
	public static Item kiva_ridewatch = new Item_ridewatches(1, 10,"kiva_ridewatch").setCreativeTab(Tabs.tabzi_o);
	public static Item deno_ridewatch = new Item_ridewatches(1, 11,"deno_ridewatch").setCreativeTab(Tabs.tabzi_o);
	public static Item kabuto_ridewatch = new Item_ridewatches(1, 12,"kabuto_ridewatch").setCreativeTab(Tabs.tabzi_o);
	public static Item hibiki_ridewatch = new Item_ridewatches(1, 13,"hibiki_ridewatch").setCreativeTab(Tabs.tabzi_o);
	public static Item blade_ridewatch = new Item_ridewatches(1, 14,"blade_ridewatch").setCreativeTab(Tabs.tabzi_o);
	public static Item chalice_ridewatch = new Item_ore("chalice_ridewatch").setCreativeTab(Tabs.tabzi_o);
	public static Item faiz_ridewatch = new Item_ridewatches(1, 15,"faiz_ridewatch",true).setCreativeTab(Tabs.tabzi_o);
	public static Item ryuki_ridewatch = new Item_ridewatches(1, 16,"ryuki_ridewatch",true).setCreativeTab(Tabs.tabzi_o);
	public static Item knight_ridewatch = new Item_ore("knight_ridewatch").setCreativeTab(Tabs.tabzi_o);
	public static Item agito_ridewatch = new Item_ridewatches(1, 17,"agito_ridewatch").setCreativeTab(Tabs.tabzi_o);
	public static Item kuuga_ridewatch = new Item_ridewatches(1, 18,"kuuga_ridewatch").setCreativeTab(Tabs.tabzi_o);

	public static Item build_genius_ridewatch = new Item_ore("build_genius_ridewatch").setCreativeTab(Tabs.tabzi_o);
	public static Item exaid_muteki_ridewatch = new Item_ore("exaid_muteki_ridewatch").setCreativeTab(Tabs.tabzi_o);
	public static Item ghost_mugen_ridewatch = new Item_ore("ghost_mugen_ridewatch").setCreativeTab(Tabs.tabzi_o);
	public static Item drive_tridron_ridewatch = new Item_ore("drive_tridron_ridewatch").setCreativeTab(Tabs.tabzi_o);
	public static Item gaim_kiwami_ridewatch = new Item_ore("gaim_kiwami_ridewatch").setCreativeTab(Tabs.tabzi_o);
	public static Item wizard_infinity_ridewatch = new Item_ore("wizard_infinity_ridewatch").setCreativeTab(Tabs.tabzi_o);
	public static Item fourze_cosmic_ridewatch = new Item_ore("fourze_cosmic_ridewatch").setCreativeTab(Tabs.tabzi_o);
	public static Item ooo_putotyra_ridewatch = new Item_ore("ooo_putotyra_ridewatch").setCreativeTab(Tabs.tabzi_o);
	public static Item w_extreme_ridewatch = new Item_ore("w_extreme_ridewatch").setCreativeTab(Tabs.tabzi_o);
	public static Item decade_complete_ridewatch = new Item_ore("decade_complete_ridewatch").setCreativeTab(Tabs.tabzi_o);
	public static Item kiva_emperor_ridewatch = new Item_ore("kiva_emperor_ridewatch").setCreativeTab(Tabs.tabzi_o);
	public static Item deno_liner_ridewatch = new Item_ore("deno_liner_ridewatch").setCreativeTab(Tabs.tabzi_o);
	public static Item kabuto_hyper_ridewatch = new Item_ore("kabuto_hyper_ridewatch").setCreativeTab(Tabs.tabzi_o);
	public static Item hibiki_armed_ridewatch = new Item_ore("hibiki_armed_ridewatch").setCreativeTab(Tabs.tabzi_o);
	public static Item blade_king_ridewatch = new Item_ore("blade_king_ridewatch").setCreativeTab(Tabs.tabzi_o);
	public static Item faiz_blaster_ridewatch = new Item_ore("faiz_blaster_ridewatch").setCreativeTab(Tabs.tabzi_o);
	public static Item ryuki_survive_ridewatch = new Item_ore("ryuki_survive_ridewatch").setCreativeTab(Tabs.tabzi_o);
	public static Item agito_shinning_ridewatch = new Item_ore("agito_shinning_ridewatch").setCreativeTab(Tabs.tabzi_o);
	public static Item kuuga_ultimate_ridewatch = new Item_ore("kuuga_ultimate_ridewatch").setCreativeTab(Tabs.tabzi_o);

	public static Item zero_one_ridewatch = new Item_ore("zero_one_ridewatch").setCreativeTab(Tabs.tabzi_o);
	public static Item saber_ridewatch = new Item_ridewatches(1, 30,"saber_ridewatch",true).setCreativeTab(Tabs.tabzi_o);

	public static Item amazon_omega_ridewatch = new Item_ore("amazon_omega_ridewatch").setCreativeTab(Tabs.tabzi_o);
	public static Item amazon_alpha_ridewatch = new Item_ore("amazon_alpha_ridewatch").setCreativeTab(Tabs.tabzi_o);
	public static Item amazon_neo_ridewatch = new Item_ore("amazon_neo_ridewatch").setCreativeTab(Tabs.tabzi_o);

	public static Item j_ridewatch = new Item_ore("j_ridewatch").setCreativeTab(Tabs.tabzi_o);
	public static Item zo_ridewatch = new Item_ore("zo_ridewatch").setCreativeTab(Tabs.tabzi_o);
	public static Item shin_ridewatch = new Item_ore("shin_ridewatch").setCreativeTab(Tabs.tabzi_o);

	public static Item black_rx_ridewatch = new Item_ore("black_rx_ridewatch").setCreativeTab(Tabs.tabzi_o);
	public static Item robo_rider_ridewatch = new Item_ore("robo_rider_ridewatch").setCreativeTab(Tabs.tabzi_o);
	public static Item bio_rider_ridewatch = new Item_ore("bio_rider_ridewatch").setCreativeTab(Tabs.tabzi_o);

	public static Item amazon_ridewatch = new Item_ore("amazon_ridewatch").setCreativeTab(Tabs.tabzi_o);
	public static Item stronger_ridewatch = new Item_ore("stronger_ridewatch").setCreativeTab(Tabs.tabzi_o);
	public static Item x_ridewatch = new Item_ore("x_ridewatch").setCreativeTab(Tabs.tabzi_o);
	public static Item riderman_ridewatch = new Item_ore("riderman_ridewatch").setCreativeTab(Tabs.tabzi_o);
	public static Item v3_ridewatch = new Item_ore("v3_ridewatch").setCreativeTab(Tabs.tabzi_o);
	public static Item nigo_ichigo_ridewatch = new Item_ore("nigo_ridewatch").setCreativeTab(Tabs.tabzi_o);
	public static Item ichigo_ridewatch = new Item_ore("ichigo_ridewatch").setCreativeTab(Tabs.tabzi_o);
	
	
	public static Item woz_miridewatch = new Item_ridewatches(0, 0,"woz_miridewatch").setCreativeTab(Tabs.tabzi_o);
	public static Item quiz_miridewatch = new Item_ridewatches(2, 22,"quiz_miridewatch").setCreativeTab(Tabs.tabzi_o);
	public static Item shinobi_miridewatch = new Item_ridewatches(2, 23,"shinobi_miridewatch").setCreativeTab(Tabs.tabzi_o);
	public static Item kikai_miridewatch = new Item_ridewatches(2, 24,"kikai_miridewatch").setCreativeTab(Tabs.tabzi_o);
	public static Item ginga_miridewatch = new Item_ridewatches(2, 27,"ginga_miridewatch").setCreativeTab(Tabs.tabzi_o);

	public static Item zi_o_mirror_ridewatch = new Item_ore("zi_o_mirror_ridewatch").setCreativeTab(Tabs.tabzi_o);
	public static Item barlckxs_ridewatch = new Item_ore("barlckxs_ridewatch").setCreativeTab(Tabs.tabzi_o);
	public static Item zonjis_ridewatch = new Item_ore("zonjis_ridewatch").setCreativeTab(Tabs.tabzi_o);
	public static Item zamonas_ridewatch = new Item_ore("zamonas_ridewatch").setCreativeTab(Tabs.tabzi_o);
	public static Item tsukuyomi_ridewatch = new Item_ore("tsukuyomi_ridewatch").setCreativeTab(Tabs.tabzi_o);

	public static Item unfinished_grandzi_o_ridewatch_1 = new Item_ore("unfinished_grandzi_o_ridewatch_1").setCreativeTab(Tabs.tabzi_o);
	public static Item unfinished_grandzi_o_ridewatch_2 = new Item_ore("unfinished_grandzi_o_ridewatch_2").setCreativeTab(Tabs.tabzi_o);

	public static Item unfinished_ohma_zi_o_driver_1 = new Item_ore("unfinished_ohma_zi_o_driver_1").setCreativeTab(Tabs.tabzi_o);
	public static Item unfinished_ohma_zi_o_driver_2 = new Item_ore("unfinished_ohma_zi_o_driver_2").setCreativeTab(Tabs.tabzi_o);
	public static Item ohma_advent_calendar = new item_ohma_advent_calendar("ohma_advent_calendar").setCreativeTab(Tabs.tabzi_o);

	public static Item kodama_suika_arms = new item_kodamawatch("kodama_suika_arms").setCreativeTab(Tabs.tabzi_o);
	
	public static Item another_zero_one_ridewatch = new Item_ore("another_zero_one_ridewatch").setCreativeTab(Tabs.tabzi_o);
	public static Item another_zi_o_ridewatch = new Item_ore("another_zi_o_ridewatch").setCreativeTab(Tabs.tabzi_o);
	public static Item another_zi_o_ii_ridewatch = new Item_ore("another_zi_o_ii_ridewatch").setCreativeTab(Tabs.tabzi_o);
	public static Item another_build_ridewatch = new Item_ore("another_build_ridewatch").setCreativeTab(Tabs.tabzi_o);  
	public static Item another_exaid_ridewatch = new Item_ore("another_exaid_ridewatch").setCreativeTab(Tabs.tabzi_o);
	public static Item another_ghost_ridewatch = new Item_ore("another_ghost_ridewatch").setCreativeTab(Tabs.tabzi_o);
	public static Item another_drive_ridewatch = new Item_ore("another_drive_ridewatch").setCreativeTab(Tabs.tabzi_o);
	public static Item another_gaim_ridewatch = new Item_ore("another_gaim_ridewatch").setCreativeTab(Tabs.tabzi_o);
	public static Item another_wizard_ridewatch = new Item_ore("another_wizard_ridewatch").setCreativeTab(Tabs.tabzi_o);
	public static Item another_fourze_ridewatch = new Item_ore("another_fourze_ridewatch").setCreativeTab(Tabs.tabzi_o);
	public static Item another_ooo_ridewatch = new Item_ore("another_ooo_ridewatch").setCreativeTab(Tabs.tabzi_o);
	public static Item another_w_ridewatch = new Item_ore("another_w_ridewatch").setCreativeTab(Tabs.tabzi_o);
	public static Item another_decade_ridewatch = new Item_ore("another_decade_ridewatch").setCreativeTab(Tabs.tabzi_o);
	public static Item another_diend_ridewatch = new Item_ore("another_diend_ridewatch").setCreativeTab(Tabs.tabzi_o);
	public static Item another_kiva_ridewatch = new Item_ore("another_kiva_ridewatch").setCreativeTab(Tabs.tabzi_o);
	public static Item another_deno_ridewatch = new Item_ore("another_deno_ridewatch").setCreativeTab(Tabs.tabzi_o);
	public static Item another_kabuto_ridewatch = new Item_ore("another_kabuto_ridewatch").setCreativeTab(Tabs.tabzi_o);
	public static Item another_hibiki_ridewatch = new Item_ore("another_hibiki_ridewatch").setCreativeTab(Tabs.tabzi_o);
	public static Item another_blade_ridewatch = new Item_ore("another_blade_ridewatch").setCreativeTab(Tabs.tabzi_o);
	public static Item another_faiz_ridewatch = new Item_ore("another_faiz_ridewatch").setCreativeTab(Tabs.tabzi_o);
	public static Item another_ryuki_ridewatch = new Item_ore("another_ryuki_ridewatch").setCreativeTab(Tabs.tabzi_o);
	public static Item another_ryuga_ridewatch = new Item_ore("another_ryuga_ridewatch").setCreativeTab(Tabs.tabzi_o);
	public static Item another_agito_ridewatch = new Item_ore("another_agito_ridewatch").setCreativeTab(Tabs.tabzi_o);
	public static Item another_kuuga_ridewatch = new Item_ore("another_kuuga_ridewatch").setCreativeTab(Tabs.tabzi_o);
	
	public static Item another_ichigo_ridewatch = new Item_ore("another_ichigo_ridewatch").setCreativeTab(Tabs.tabzi_o);
	
	public static Item another_shinobi_ridewatch = new Item_ore("another_shinobi_ridewatch").setCreativeTab(Tabs.tabzi_o);
	public static Item another_quiz_ridewatch = new Item_ore("another_quiz_ridewatch").setCreativeTab(Tabs.tabzi_o);
	public static Item another_kikai_ridewatch = new Item_ore("another_kikai_ridewatch").setCreativeTab(Tabs.tabzi_o);
	
	
	public static Item woz_ridewatch = new Item_ridewatches(0, 0,"woz_ridewatch").setCreativeTab(Tabs.tabzi_o);
	public static Item ryusoulger_ridewatch = new Item_ore("ryusoulger_ridewatch").setCreativeTab(Tabs.tabzi_o);

	public static Item shuriken_starter = new Item_ore("shuriken_starter").setCreativeTab(Tabs.tabzi_o);
	public static Item shuriken_starter_hattari = new Item_ore("shuriken_starter_hattari").setCreativeTab(Tabs.tabzi_o);
	public static Item quiz_topper = new Item_ore("quiz_topper").setCreativeTab(Tabs.tabzi_o);
	public static Item spannerder_screwder = new Item_ore("spannerder_screwder").setCreativeTab(Tabs.tabzi_o);
	public static Item ginga_globe = new Item_ore("ginga_globe").setCreativeTab(Tabs.tabzi_o);



	public static void init() {
		dogabaki = ((Item_form_change)dogabaki).addNeedItem(wakeupfuestle).addNeedItem(garulufuestle).addNeedItem(basshaafuestle).addNeedItem(basshaafuestle);
	
	}
}



