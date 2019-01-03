package KamenRiderCraftV3;

import KamenRiderCraftV3.item.ItemBaseSword;
import KamenRiderCraftV3.item.ItemChargeSword;
import KamenRiderCraftV3.item.ItemSwordWithEft;
import KamenRiderCraftV3.item.Item_2nd_gun_im;
import KamenRiderCraftV3.item.Item_2nd_sword_im;
import KamenRiderCraftV3.item.Item_fireballgun;
import KamenRiderCraftV3.item.Item_gun;
import KamenRiderCraftV3.item.Item_ore;
import KamenRiderCraftV3.item.Item_swordgun;
import KamenRiderCraftV3.item.riderfood;
import KamenRiderCraftV3.item.Ex_Aid.Item_gashat;
import KamenRiderCraftV3.item.Ex_Aid.item_ex_aidarmor;
import KamenRiderCraftV3.item.Ex_Aid.item_ex_aidarmor2;
import KamenRiderCraftV3.item.Ex_Aid.item_ex_aiddriver;
import KamenRiderCraftV3.item.Ichigo.Item_showa_change;
import KamenRiderCraftV3.item.Ichigo.item_Ichigoarmor;
import KamenRiderCraftV3.item.Ichigo.item_Ichigoarmor2;
import KamenRiderCraftV3.item.Ichigo.item_Ichigodriver;
import KamenRiderCraftV3.item.W.Item_memory;
import KamenRiderCraftV3.item.W.Item_metal_shaft;
import KamenRiderCraftV3.item.W.item_Warmor;
import KamenRiderCraftV3.item.W.item_Wdriver;
import KamenRiderCraftV3.item.W.item_warmor2;
import KamenRiderCraftV3.item.agito.Item_agito_power;
import KamenRiderCraftV3.item.agito.item_agitoarmor;
import KamenRiderCraftV3.item.agito.item_agitoarmor2;
import KamenRiderCraftV3.item.agito.item_agitodriver;
import KamenRiderCraftV3.item.amazons.item_amazonsarmor;
import KamenRiderCraftV3.item.amazons.item_amazonsarmor2;
import KamenRiderCraftV3.item.amazons.item_amazonsdriver;
import KamenRiderCraftV3.item.blade.ItemRouze_Cards;
import KamenRiderCraftV3.item.blade.item_bladearmor;
import KamenRiderCraftV3.item.blade.item_bladearmor2;
import KamenRiderCraftV3.item.blade.item_bladedriver;
import KamenRiderCraftV3.item.build.Item_full_bottle;
import KamenRiderCraftV3.item.build.Item_nebulasteamgun;
import KamenRiderCraftV3.item.build.Item_transteamgun;
import KamenRiderCraftV3.item.build.item_buildarmor;
import KamenRiderCraftV3.item.build.item_buildarmor2;
import KamenRiderCraftV3.item.build.item_builddriver;
import KamenRiderCraftV3.item.decade.Itemrider_cards;
import KamenRiderCraftV3.item.decade.item_decadearmor;
import KamenRiderCraftV3.item.decade.item_decadearmor2;
import KamenRiderCraftV3.item.decade.item_decadedriver;
import KamenRiderCraftV3.item.deno.Item_den_oriderpass;
import KamenRiderCraftV3.item.deno.Itemdenkamen_sword;
import KamenRiderCraftV3.item.deno.Itemrider_ticket;
import KamenRiderCraftV3.item.deno.item_den_oarmor;
import KamenRiderCraftV3.item.deno.item_den_oarmor2;
import KamenRiderCraftV3.item.deno.item_den_odriver;
import KamenRiderCraftV3.item.drive.Item_break_gunner;
import KamenRiderCraftV3.item.drive.Item_shift_car;
import KamenRiderCraftV3.item.drive.item_drivearmor;
import KamenRiderCraftV3.item.drive.item_drivearmor2;
import KamenRiderCraftV3.item.drive.item_drivedriver;
import KamenRiderCraftV3.item.faiz.Item_faiz_blaster;
import KamenRiderCraftV3.item.faiz.Item_mission_memory;
import KamenRiderCraftV3.item.faiz.item_faizarmor;
import KamenRiderCraftV3.item.faiz.item_faizarmor2;
import KamenRiderCraftV3.item.faiz.item_faizdriver;
import KamenRiderCraftV3.item.fourze.Item_astroswitch;
import KamenRiderCraftV3.item.fourze.Item_billytherod;
import KamenRiderCraftV3.item.fourze.Item_hee_hackgun;
import KamenRiderCraftV3.item.fourze.Item_rocket;
import KamenRiderCraftV3.item.fourze.item_Fourzearmor;
import KamenRiderCraftV3.item.fourze.item_Fourzearmor2;
import KamenRiderCraftV3.item.fourze.item_Fourzedriver;
import KamenRiderCraftV3.item.gaim.Item_lockseed;
import KamenRiderCraftV3.item.gaim.fake_donguri;
import KamenRiderCraftV3.item.gaim.item_Gaimarmor;
import KamenRiderCraftV3.item.gaim.item_Gaimarmor2;
import KamenRiderCraftV3.item.gaim.item_Gaimarmor3;
import KamenRiderCraftV3.item.gaim.item_Gaimdriver;
import KamenRiderCraftV3.item.gaim.item_sid_lockseed;
import KamenRiderCraftV3.item.ghost.Item_ghost_Icons;
import KamenRiderCraftV3.item.ghost.item_ghost_armor2;
import KamenRiderCraftV3.item.ghost.item_ghost_armor3;
import KamenRiderCraftV3.item.ghost.item_ghostarmor;
import KamenRiderCraftV3.item.ghost.item_ghostdriver;
import KamenRiderCraftV3.item.hibiki.Itemarmed_saber;
import KamenRiderCraftV3.item.hibiki.Itemhibiki_stone;
import KamenRiderCraftV3.item.hibiki.item_hibikiarmor;
import KamenRiderCraftV3.item.hibiki.item_hibikiarmor2;
import KamenRiderCraftV3.item.hibiki.item_hibikidriver;
import KamenRiderCraftV3.item.kabuto.Item_clock_up_pad;
import KamenRiderCraftV3.item.kabuto.Item_zecter;
import KamenRiderCraftV3.item.kabuto.item_kabutoarmor;
import KamenRiderCraftV3.item.kabuto.item_kabutoarmor2;
import KamenRiderCraftV3.item.kabuto.item_kabutodriver;
import KamenRiderCraftV3.item.kiva.Itemfuestle;
import KamenRiderCraftV3.item.kiva.item_kivaarmor;
import KamenRiderCraftV3.item.kiva.item_kivaarmor2;
import KamenRiderCraftV3.item.kiva.item_kivadriver;
import KamenRiderCraftV3.item.kuuga.Item_dragon_rod;
import KamenRiderCraftV3.item.kuuga.Item_kuuga_power;
import KamenRiderCraftV3.item.kuuga.Item_pegasus_bowgun;
import KamenRiderCraftV3.item.kuuga.Item_titan_sword;
import KamenRiderCraftV3.item.kuuga.item_kuugaarmor;
import KamenRiderCraftV3.item.kuuga.item_kuugaarmor2;
import KamenRiderCraftV3.item.kuuga.item_kuugadriver;
import KamenRiderCraftV3.item.wizard.Item_wizard_ring;
import KamenRiderCraftV3.item.wizard.Item_wizard_rings_efts;
import KamenRiderCraftV3.item.wizard.item_wizardarmor;
import KamenRiderCraftV3.item.wizard.item_wizarddriver;
import KamenRiderCraftV3.item.wizard.item_wizardarmor2;
import KamenRiderCraftV3.item.zi_o.item_ridewatch;
import KamenRiderCraftV3.item.zi_o.item_zi_o_armor;
import KamenRiderCraftV3.item.zi_o.item_zi_o_armor_2;
import KamenRiderCraftV3.item.zi_o.item_zi_o_driver;
import KamenRiderCraftV3.blocks.glass_ore_block;
import KamenRiderCraftV3.blocks.ore_block;
import KamenRiderCraftV3.item.ooo.Item_madagburyu;
import KamenRiderCraftV3.item.ooo.Item_tajaspinner;
import KamenRiderCraftV3.item.ooo.Itemmedal;
import KamenRiderCraftV3.item.ooo.Itemo_scanner;
import KamenRiderCraftV3.item.ooo.item_OOOarmor;
import KamenRiderCraftV3.item.ooo.item_OOOarmor2;
import KamenRiderCraftV3.item.ooo.item_OOOdriver;
import KamenRiderCraftV3.item.ryuki.Item_advent_cards;
import KamenRiderCraftV3.item.ryuki.Item_vent;
import KamenRiderCraftV3.item.ryuki.item_ryukiarmor;
import KamenRiderCraftV3.item.ryuki.item_ryukiarmor2;
import KamenRiderCraftV3.item.ryuki.item_ryukidriver;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.ItemMeshDefinition;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraftforge.client.model.ISmartItemModel;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class RiderItems {

	public static Item energy = new Item_ore().setUnlocalizedName("energy").setCreativeTab(CreativeTabs.tabCombat);
	
	public static Item donut = new riderfood(4, true).setUnlocalizedName("donut").setCreativeTab(CreativeTabs.tabFood);
	public static Item icepop1  = new riderfood(2, true).setUnlocalizedName("icepop1").setCreativeTab(CreativeTabs.tabFood);
	public static Item icepop2  = new riderfood(2, true).setUnlocalizedName("icepop2").setCreativeTab(CreativeTabs.tabFood);
	public static Item icepop3  = new riderfood(2, true).setUnlocalizedName("icepop3").setCreativeTab(CreativeTabs.tabFood);

	public static Item blanknoitem = new Item_ore().setUnlocalizedName("blanknoitem");
	
	public static Item kuuga_growing = new Item_kuuga_power(0).setUnlocalizedName("kuuga_growing").setCreativeTab(Tabs.tabkuuga);
	public static Block stone_kuuga= new ore_block(Material.rock, kuuga_growing, 2).setHardness(9.9F).setLightLevel(0.1f).setUnlocalizedName("stone_kuuga").setCreativeTab(Tabs.tabkuuga);

	public static Item agito_of_seed = new Item_ore().setUnlocalizedName("agito_of_seed").setCreativeTab(Tabs.tabagito);
	public static Block stone_agito= new ore_block(Material.rock, agito_of_seed, 2).setHardness(9.9F).setLightLevel(0.1f).setUnlocalizedName("stone_agito").setCreativeTab(Tabs.tabagito);
	
	public static Item g3core = new Item_ore().setUnlocalizedName("g3core").setCreativeTab(Tabs.tabagito);
	public static Block hellrock_agito= new ore_block(Material.rock, g3core, 2).setHardness(9.9F).setLightLevel(0.1f).setUnlocalizedName("hellrock_agito").setCreativeTab(Tabs.tabagito);
	
	public static Item contract_advent = new Item_advent_cards(2,"1").setUnlocalizedName("contract_advent").setCreativeTab(Tabs.tabryuki);
	public static Block advent_glass= new glass_ore_block(Material.rock, contract_advent, 2).setHardness(9.9F).setLightLevel(0.1f).setUnlocalizedName("advent_glass").setCreativeTab(Tabs.tabryuki);
	
	public static Item dragblacker_advent = new Item_advent_cards(0,"3").setUnlocalizedName("dragblacker_advent").setCreativeTab(Tabs.tabryuki);
	public static Block hell_advent_glass= new glass_ore_block(Material.rock, dragblacker_advent, 3).setHardness(9.9F).setLightLevel(0.1f).setUnlocalizedName("hell_advent_glass").setCreativeTab(Tabs.tabryuki);

	public static Item blank_mission_memory = new Item_ore().setUnlocalizedName("blank_mission_memory").setCreativeTab(Tabs.tabfaiz);
	public static Block mission_memory_block = new ore_block(Material.rock, blank_mission_memory, 2).setHardness(9.9F).setLightLevel(0.1f).setUnlocalizedName("mission_memory_block").setCreativeTab(Tabs.tabfaiz);

	public static Item bladecard = new Item_ore().setUnlocalizedName("bladecard").setCreativeTab(Tabs.tabblade);
	public static Block bladecard_block = new ore_block(Material.rock, bladecard, 2).setHardness(9.9F).setLightLevel(0.1f).setUnlocalizedName("bladecard_block").setCreativeTab(Tabs.tabblade);
	
	public static Item changekerberosglaive = new Item_ore().setUnlocalizedName("changekerberosglaive").setCreativeTab(Tabs.tabblade);
	public static Block bladecard_hellrock = new ore_block(Material.rock, changekerberosglaive, 2).setHardness(9.9F).setLightLevel(0.1f).setUnlocalizedName("bladecard_hellrock").setCreativeTab(Tabs.tabblade);
	
	public static Item oni_ore = new Item_ore().setUnlocalizedName("oni_ore").setCreativeTab(Tabs.tabhibiki);
	public static Block oni_ore_block = new ore_block(Material.rock, oni_ore, 2).setHardness(9.9F).setLightLevel(0.1f).setUnlocalizedName("oni_ore_block").setCreativeTab(Tabs.tabhibiki);
	
	public static Item oni_orehell = new Item_ore().setUnlocalizedName("oni_orehell").setCreativeTab(Tabs.tabhibiki);
	public static Block oni_ore_hellrock = new ore_block(Material.rock, oni_orehell, 2).setHardness(9.9F).setLightLevel(0.1f).setUnlocalizedName("oni_ore_hellrock").setCreativeTab(Tabs.tabhibiki);
	
	public static Item mini_zecter = new Item_ore().setUnlocalizedName("mini_zecter").setCreativeTab(Tabs.tabkabuto);
	public static Block zectblock = new ore_block(Material.rock, mini_zecter, 2).setHardness(9.9F).setLightLevel(0.1f).setUnlocalizedName("zectblock").setCreativeTab(Tabs.tabkabuto);

	public static Item unfinished_kabutick_zecter = new Item_ore().setUnlocalizedName("unfinished_kabutick_zecter").setCreativeTab(Tabs.tabkabuto);
	public static Block neozecthellrock = new ore_block(Material.rock, unfinished_kabutick_zecter, 3).setHardness(9.9F).setLightLevel(0.1f).setUnlocalizedName("neozecthellrock").setCreativeTab(Tabs.tabkabuto);
	
	public static Item imaginsand = new Item_ore().setUnlocalizedName("imaginsand").setCreativeTab(Tabs.tabden_o);
	public static Block imaginsandblock = new ore_block(Material.rock, imaginsand, 2).setHardness(9.9F).setLightLevel(0.1f).setUnlocalizedName("imaginsandblock").setCreativeTab(Tabs.tabden_o);
	
	public static Item rider_ticket_strike = new Itemrider_ticket(1,2).setUnlocalizedName("rider_ticket_strike").setCreativeTab(Tabs.tabden_o);
	public static Block hellimaginsandblock = new ore_block(Material.rock, rider_ticket_strike, 3).setHardness(9.9F).setLightLevel(0.1f).setUnlocalizedName("hellimaginsandblock").setCreativeTab(Tabs.tabden_o);
	
	public static Item fuestle = new Item_ore().setUnlocalizedName("fuestle").setCreativeTab(Tabs.tabkiva);
	public static Block fuestleblock = new ore_block(Material.rock, fuestle, 2).setHardness(9.9F).setLightLevel(0.1f).setUnlocalizedName("fuestleblock").setCreativeTab(Tabs.tabkiva);
	
	public static Item fuestlefake = new Item_ore().setUnlocalizedName("fuestlefake").setCreativeTab(Tabs.tabkiva);
	public static Block fuestlehellrock = new ore_block(Material.rock, fuestlefake, 2).setHardness(9.9F).setLightLevel(0.1f).setUnlocalizedName("fuestlehellrock").setCreativeTab(Tabs.tabkiva);

	public static Item blankcard = new Item_ore().setUnlocalizedName("blankcard").setCreativeTab(Tabs.tabdecade);
	public static Block card_stone = new ore_block(Material.rock,blankcard, 2).setHardness(9.9F).setLightLevel(0.1f).setUnlocalizedName("card_stone").setCreativeTab(Tabs.tabdecade);
	
	public static Item diendcard = new Itemrider_cards(0,3).setUnlocalizedName("diendcard").setCreativeTab(Tabs.tabdecade);
	public static Block card_hellrock = new ore_block(Material.rock,diendcard, 2).setHardness(9.9F).setLightLevel(0.1f).setUnlocalizedName("card_hellrock").setCreativeTab(Tabs.tabdecade);

	public static Item gaiamemory = new Item_ore().setUnlocalizedName("gaiamemory").setCreativeTab(Tabs.tabW);
	public static Block gaiamemoryblock = new ore_block(Material.rock, gaiamemory, 2).setHardness(9.9F).setLightLevel(0.1f).setUnlocalizedName("gaiamemoryblock").setCreativeTab(Tabs.tabW);
	
	public static Item t2gaiamemory = new Item_ore().setUnlocalizedName("t2gaiamemory").setCreativeTab(Tabs.tabW);
	public static Block gaiamemoryhellrock = new ore_block(Material.rock, t2gaiamemory, 2).setHardness(9.9F).setLightLevel(0.1f).setUnlocalizedName("gaiamemoryhellrock").setCreativeTab(Tabs.tabW);

	public static Item cellmedal = new Item_ore().setUnlocalizedName("cellmedal").setCreativeTab(Tabs.tabOOO);
	public static Block cellmedalblock = new ore_block(Material.rock, cellmedal, 2).setUnlocalizedName("cellmedalblock").setHardness(9.9F).setLightLevel(0.1f).setCreativeTab(Tabs.tabOOO);
	
	public static Item birth_core= new Item_ore().setUnlocalizedName("birth_core").setCreativeTab(Tabs.tabOOO);
	public static Block ooo_hellrock = new ore_block(Material.rock, birth_core, 2).setUnlocalizedName("ooo_hellrock").setHardness(9.9F).setLightLevel(0.1f).setCreativeTab(Tabs.tabOOO);

	public static Item astroswitch = new Item_ore().setUnlocalizedName("astroswitch").setCreativeTab(Tabs.tabFourze);
	public static Block astroswitchblock = new ore_block(Material.rock, astroswitch, 2).setHardness(9.9F).setLightLevel(0.1f).setUnlocalizedName("astroswitchblock").setCreativeTab(Tabs.tabFourze);

	public static Item gate_switch = new Item_ore().setUnlocalizedName("gate_switch").setCreativeTab(Tabs.tabFourze);
	public static Block swichhellrock = new ore_block(Material.rock, gate_switch, 2).setHardness(9.9F).setLightLevel(0.1f).setUnlocalizedName("swichhellrock").setCreativeTab(Tabs.tabFourze);
	
	public static Item wizardgem = new Item_ore().setUnlocalizedName("wizardgem").setCreativeTab(Tabs.tabwizard);
	public static Block wizardgemblock = new ore_block(Material.rock, wizardgem, 2).setHardness(9.9F).setLightLevel(0.1f).setUnlocalizedName("wizardgemblock").setCreativeTab(Tabs.tabwizard);
	
	public static Item wizardgem2 = new Item_ore().setUnlocalizedName("wizardgem2").setCreativeTab(Tabs.tabwizard);
	public static Block hellwizardgemblock = new ore_block(Material.rock, wizardgem2, 2).setHardness(9.9F).setLightLevel(0.1f).setUnlocalizedName("hellwizardgemblock").setCreativeTab(Tabs.tabwizard);
	
	
	public static Item himawari_lockseed = new Item_ore().setUnlocalizedName("himawari_lockseed").setCreativeTab(Tabs.tabGaim);
	public static Block himawari_lockseedblock = new ore_block(Material.rock, himawari_lockseed, 2).setHardness(9.9F).setLightLevel(0.1f).setUnlocalizedName("himawari_lockseedblock").setCreativeTab(Tabs.tabGaim);

	public static Item himawari_energy_lockseed = new Item_ore().setUnlocalizedName("himawari_energy_lockseed").setCreativeTab(Tabs.tabGaim);
	public static Block hellrock_lockseedblock = new ore_block(Material.rock, himawari_energy_lockseed, 3).setHardness(9.9F).setLightLevel(0.1f).setUnlocalizedName("hellrock_lockseedblock").setCreativeTab(Tabs.tabGaim);

	public static Item proto_speedshift  = new Item_shift_car(1, 11).setUnlocalizedName("proto_speedshift").setCreativeTab(Tabs.tabdrive);
	public static Block drive_stone = new ore_block(Material.rock, proto_speedshift, 2).setHardness(9.9F).setLightLevel(0.1f).setUnlocalizedName("drive_stone").setCreativeTab(Tabs.tabdrive);

	public static Item signal_chaser  = new Item_shift_car(3, 5).setUnlocalizedName("signal_chaser").setCreativeTab(Tabs.tabdrive);
	public static Block hellrock_drive = new ore_block(Material.rock, signal_chaser, 3).setHardness(9.9F).setLightLevel(0.1f).setUnlocalizedName("hellrock_drive").setCreativeTab(Tabs.tabdrive);
	
	public static Item ghost_Icons = new Item_ore().setUnlocalizedName("ghost_Icons").setCreativeTab(Tabs.tabghost);
	public static Block ghost_Iconsblock = new ore_block(Material.rock, ghost_Icons, 2).setHardness(9.9F).setLightLevel(0.1f).setUnlocalizedName("ghost_Iconsblock").setCreativeTab(Tabs.tabghost);

	public static Item ghost_gammaIcons = new Item_ore().setUnlocalizedName("ghost_gammaIcons").setCreativeTab(Tabs.tabghost);
	public static Block ghost_Icons_hellrock = new ore_block(Material.rock, ghost_gammaIcons, 3).setHardness(9.9F).setLightLevel(0.1f).setUnlocalizedName("ghost_Icons_hellrock").setCreativeTab(Tabs.tabghost);

	public static Item blank_gashat = new Item_ore().setUnlocalizedName("blank_gashat").setCreativeTab(Tabs.tabex_aid);
	public static Block bugsters_stone = new ore_block(Material.rock, blank_gashat, 2).setHardness(9.9F).setLightLevel(0.1f).setUnlocalizedName("bugsters_stone").setCreativeTab(Tabs.tabex_aid);

	public static Item unfinished_kamen_rider_chronicle_gashat = new Item_ore().setUnlocalizedName("unfinished_kamen_rider_chronicle_gashat").setCreativeTab(Tabs.tabex_aid);
	public static Block gemdeus_stone = new ore_block(Material.rock, unfinished_kamen_rider_chronicle_gashat, 3).setHardness(9.9F).setLightLevel(0.1f).setUnlocalizedName("gemdeus_stone").setCreativeTab(Tabs.tabex_aid);

	public static Item full_bottle = new Item_ore().setUnlocalizedName("full_bottle").setCreativeTab(Tabs.tabbuild);
	public static Block pandora_box = new ore_block(Material.rock, full_bottle, 2).setHardness(9.9F).setLightLevel(0.1f).setUnlocalizedName("pandora_box").setCreativeTab(Tabs.tabbuild);
	
	public static Item sclashjelly = new Item_ore().setUnlocalizedName("sclashjelly").setCreativeTab(Tabs.tabbuild);
	public static Block pandora_box_hellrock = new ore_block(Material.rock, sclashjelly, 2).setHardness(9.9F).setLightLevel(0.1f).setUnlocalizedName("pandora_box_hellrock").setCreativeTab(Tabs.tabbuild);
	
	public static Item unfinished_gear = new Item_ore().setUnlocalizedName("unfinished_gear").setCreativeTab(Tabs.tabbuild);
	public static Block pandora_box_hellrock_2 = new ore_block(Material.rock, unfinished_gear, 2).setHardness(9.9F).setLightLevel(0.1f).setUnlocalizedName("pandora_box_hellrock_2").setCreativeTab(Tabs.tabbuild);
	
	public static Item blank_watch = new Item_ore().setUnlocalizedName("blank_watch").setCreativeTab(Tabs.tab_zi_o);
	public static Block watch_stone = new ore_block(Material.rock, blank_watch, 2).setHardness(9.9F).setLightLevel(0.1f).setUnlocalizedName("watch_stone").setCreativeTab(Tabs.tab_zi_o);
	
	public static Item amazon_cell_vial = new Item_ore().setUnlocalizedName("amazon_cell_vial").setCreativeTab(Tabs.tabamazons);
	public static Block amazon_cell_block = new ore_block(Material.rock, amazon_cell_vial, 2).setHardness(9.9F).setLightLevel(0.1f).setUnlocalizedName("amazon_cell_block").setCreativeTab(Tabs.tabamazons);

	public static Item rider_circuit = new Item_ore().setUnlocalizedName("rider_circuit").setCreativeTab(Tabs.tabIchigo);
	
	public static Item ichigohead = new item_Ichigoarmor(ArmorMaterial.DIAMOND, 4, 0).setMaxStackSize(1).setUnlocalizedName("ichigohead").setCreativeTab(Tabs.tabIchigo);
	public static Item ichigotroso = new item_Ichigoarmor2(ArmorMaterial.DIAMOND, 4, 1).setMaxStackSize(1).setUnlocalizedName("ichigotroso").setCreativeTab(Tabs.tabIchigo);
	public static Item ichigolegs = new item_Ichigoarmor2(ArmorMaterial.DIAMOND, 4, 2).setMaxStackSize(1).setUnlocalizedName("ichigolegs").setCreativeTab(Tabs.tabIchigo);
	
	public static Item typhoon_ichigo = new item_Ichigodriver(ArmorMaterial.DIAMOND, 4, 3,"ichigo").setMaxStackSize(1).setUnlocalizedName("typhoon_ichigo").setCreativeTab(Tabs.tabIchigo);
	public static Item typhoon_nigo = new item_Ichigodriver(ArmorMaterial.DIAMOND, 4, 3,"nigo").setMaxStackSize(1).setUnlocalizedName("typhoon_nigo").setCreativeTab(Tabs.tabIchigo);

	public static Item new_typhoon = new item_Ichigodriver(ArmorMaterial.DIAMOND, 4, 3,"new_ichigo").setMaxStackSize(1).setUnlocalizedName("new_typhoon").setCreativeTab(Tabs.tabIchigo);
	
	public static Item typhoon_shocker_rider_1 = new item_Ichigodriver(ArmorMaterial.DIAMOND, 4, 3,"shocker_rider_1").setMaxStackSize(1).setUnlocalizedName("typhoon_shocker_rider_1").setCreativeTab(Tabs.tabIchigo);
	public static Item typhoon_shocker_rider_2 = new item_Ichigodriver(ArmorMaterial.DIAMOND, 4, 3,"shocker_rider_2").setMaxStackSize(1).setUnlocalizedName("typhoon_shocker_rider_2").setCreativeTab(Tabs.tabIchigo);
	public static Item typhoon_shocker_rider_3 = new item_Ichigodriver(ArmorMaterial.DIAMOND, 4, 3,"shocker_rider_3").setMaxStackSize(1).setUnlocalizedName("typhoon_shocker_rider_3").setCreativeTab(Tabs.tabIchigo);
	public static Item typhoon_shocker_rider_4 = new item_Ichigodriver(ArmorMaterial.DIAMOND, 4, 3,"shocker_rider_4").setMaxStackSize(1).setUnlocalizedName("typhoon_shocker_rider_4").setCreativeTab(Tabs.tabIchigo);
	public static Item typhoon_shocker_rider_5 = new item_Ichigodriver(ArmorMaterial.DIAMOND, 4, 3,"shocker_rider_5").setMaxStackSize(1).setUnlocalizedName("typhoon_shocker_rider_5").setCreativeTab(Tabs.tabIchigo);
	public static Item typhoon_shocker_rider_6 = new item_Ichigodriver(ArmorMaterial.DIAMOND, 4, 3,"shocker_rider_6").setMaxStackSize(1).setUnlocalizedName("typhoon_shocker_rider_6").setCreativeTab(Tabs.tabIchigo);
	
	public static Item typhoon_shocker_rider_7 = new item_Ichigodriver(ArmorMaterial.DIAMOND, 4, 3,"shocker_rider_7").setMaxStackSize(1).setUnlocalizedName("typhoon_shocker_rider_7").setCreativeTab(Tabs.tabIchigo);
	public static Item typhoon_shocker_rider_8 = new item_Ichigodriver(ArmorMaterial.DIAMOND, 4, 3,"shocker_rider_8").setMaxStackSize(1).setUnlocalizedName("typhoon_shocker_rider_8").setCreativeTab(Tabs.tabIchigo);
	public static Item typhoon_shocker_rider_9 = new item_Ichigodriver(ArmorMaterial.DIAMOND, 4, 3,"shocker_rider_9").setMaxStackSize(1).setUnlocalizedName("typhoon_shocker_rider_9").setCreativeTab(Tabs.tabIchigo);
	public static Item typhoon_shocker_rider_10 = new item_Ichigodriver(ArmorMaterial.DIAMOND, 4, 3,"shocker_rider_10").setMaxStackSize(1).setUnlocalizedName("typhoon_shocker_rider_10").setCreativeTab(Tabs.tabIchigo);
	public static Item typhoon_shocker_rider_11 = new item_Ichigodriver(ArmorMaterial.DIAMOND, 4, 3,"shocker_rider_11").setMaxStackSize(1).setUnlocalizedName("typhoon_shocker_rider_11").setCreativeTab(Tabs.tabIchigo);
	public static Item typhoon_shocker_rider_12 = new item_Ichigodriver(ArmorMaterial.DIAMOND, 4, 3,"shocker_rider_12").setMaxStackSize(1).setUnlocalizedName("typhoon_shocker_rider_12").setCreativeTab(Tabs.tabIchigo);
	
	public static Item double_typhoon = new item_Ichigodriver(ArmorMaterial.DIAMOND, 4, 3,"v3").setMaxStackSize(1).setUnlocalizedName("double_typhoon").setCreativeTab(Tabs.tabIchigo);
	public static Item riderman_belt = new item_Ichigodriver(ArmorMaterial.DIAMOND, 4, 3,"riderman").setMaxStackSize(1).setUnlocalizedName("riderman_belt").setCreativeTab(Tabs.tabIchigo);
	public static Item ridol = new item_Ichigodriver(ArmorMaterial.DIAMOND, 4, 3,"x").setMaxStackSize(1).setUnlocalizedName("ridol").setCreativeTab(Tabs.tabIchigo);
	public static Item condorer = new item_Ichigodriver(ArmorMaterial.DIAMOND, 4, 3,"amazon").setMaxStackSize(1).setUnlocalizedName("condorer").setCreativeTab(Tabs.tabIchigo);
	
	public static Item electrer = new item_Ichigodriver(ArmorMaterial.DIAMOND, 4, 3,"stronger").setMaxStackSize(1).setUnlocalizedName("electrer").setCreativeTab(Tabs.tabIchigo);
	
	public static Item charge_up = new Item_showa_change(1,electrer).setUnlocalizedName("charge_up").setCreativeTab(Tabs.tabIchigo);
	
	public static Item tornado = new item_Ichigodriver(ArmorMaterial.DIAMOND, 4, 3,"skyrider").setMaxStackSize(1).setUnlocalizedName("tornado").setCreativeTab(Tabs.tabIchigo);
	public static Item cyclode = new item_Ichigodriver(ArmorMaterial.DIAMOND, 4, 3,"super1").setMaxStackSize(1).setUnlocalizedName("cyclode").setCreativeTab(Tabs.tabIchigo);	
	public static Item zx_belt = new item_Ichigodriver(ArmorMaterial.DIAMOND, 4, 3,"zx").setMaxStackSize(1).setUnlocalizedName("zx_belt").setCreativeTab(Tabs.tabIchigo);
	public static Item king_stone = new item_Ichigodriver(ArmorMaterial.DIAMOND, 4, 3,"black").setMaxStackSize(1).setUnlocalizedName("king_stone").setCreativeTab(Tabs.tabIchigo);
	public static Item king_stone_shadow_moon = new item_Ichigodriver(ArmorMaterial.DIAMOND, 4, 3,"shadow_moon").setMaxStackSize(1).setUnlocalizedName("king_stone_shadow_moon").setCreativeTab(Tabs.tabIchigo);
	
	public static Item sunriser = new item_Ichigodriver(ArmorMaterial.DIAMOND, 4, 3,"black_rx").setMaxStackSize(1).setUnlocalizedName("sunriser").setCreativeTab(Tabs.tabIchigo);
	
	public static Item split_king_stone = new Item_showa_change(0,sunriser).setUnlocalizedName("split_king_stone").setCreativeTab(Tabs.tabIchigo);
	public static Item bio_rider = new Item_showa_change(1,sunriser).setUnlocalizedName("bio_rider").setCreativeTab(Tabs.tabIchigo);
	public static Item robo_rider = new Item_showa_change(2,sunriser).setUnlocalizedName("robo_rider").setCreativeTab(Tabs.tabIchigo);
	
	public static Item bio_rider_belt = new Item_ore().setUnlocalizedName("bio_rider_belt");
	public static Item robo_rider_belt = new Item_ore().setUnlocalizedName("robo_rider_belt");
	
	public static Item ridol_stick_l  = new Item_ore().setUnlocalizedName("ridol_stick_l");
	public static Item ridol_stick = new Item_2nd_sword_im(Tabs.ridol_stick, ridol_stick_l).setMaxStackSize(1).setUnlocalizedName("ridol_stick").setCreativeTab(Tabs.tabIchigo);
	
	public static Item revolcane = new ItemBaseSword(ToolMaterial.EMERALD).setMaxStackSize(1).setUnlocalizedName("revolcane").setCreativeTab(Tabs.tabIchigo);
	public static Item vortech_shooter = new Item_gun(Tabs.den_dengu,RiderItems.energy).setUnlocalizedName("vortech_shooter").setCreativeTab(Tabs.tabIchigo);
	public static Item bio_blade = new ItemBaseSword(ToolMaterial.EMERALD).setMaxStackSize(1).setUnlocalizedName("bio_blade").setCreativeTab(Tabs.tabIchigo);
	
	public static Item typhoon_sango = new item_Ichigodriver(ArmorMaterial.DIAMOND, 4, 3,"sango").setMaxStackSize(1).setUnlocalizedName("typhoon_sango").setCreativeTab(Tabs.tabIchigo);
	public static Item typhoon_yongo = new item_Ichigodriver(ArmorMaterial.DIAMOND, 4, 3,"yongo").setMaxStackSize(1).setUnlocalizedName("typhoon_yongo").setCreativeTab(Tabs.tabIchigo);
	
	public static Item typhoon_akarider = new item_Ichigodriver(ArmorMaterial.DIAMOND, 4, 3,"akarider").setMaxStackSize(1).setUnlocalizedName("typhoon_akarider").setCreativeTab(Tabs.tabIchigo);
	public static Item typhoon_aorider = new item_Ichigodriver(ArmorMaterial.DIAMOND, 4, 3,"aorider").setMaxStackSize(1).setUnlocalizedName("typhoon_aorider").setCreativeTab(Tabs.tabIchigo);
	public static Item typhoon_kirider = new item_Ichigodriver(ArmorMaterial.DIAMOND, 4, 3,"kirider").setMaxStackSize(1).setUnlocalizedName("typhoon_kirider").setCreativeTab(Tabs.tabIchigo);
	public static Item typhoon_momorider = new item_Ichigodriver(ArmorMaterial.DIAMOND, 4, 3,"momorider").setMaxStackSize(1).setUnlocalizedName("typhoon_momorider").setCreativeTab(Tabs.tabIchigo);
	public static Item typhoon_midorider = new item_Ichigodriver(ArmorMaterial.DIAMOND, 4, 3,"midorider").setMaxStackSize(1).setUnlocalizedName("typhoon_midorider").setCreativeTab(Tabs.tabIchigo);
	
	//kuuga
	public static Item dragon_rod_l = new Item_ore().setUnlocalizedName("dragon_rod_l");
	public static Item rising_dragon_rod_l = new Item_ore().setUnlocalizedName("rising_dragon_rod_l");
	public static Item dragon_rod = new Item_dragon_rod(Tabs.medajalibur,dragon_rod_l,rising_dragon_rod_l).setMaxStackSize(1).setUnlocalizedName("dragon_rod").setCreativeTab(Tabs.tabkuuga);
	
	public static Item rising_pegasus_bowgun = new Item_ore().setUnlocalizedName("rising_pegasus_bowgun");
	public static Item pegasus_bowgun = new Item_pegasus_bowgun(Tabs.birth_buster, energy,rising_pegasus_bowgun).setMaxStackSize(1).setUnlocalizedName("pegasus_bowgun").setCreativeTab(Tabs.tabkuuga);
	
	public static Item rising_titan_sword = new Item_ore().setUnlocalizedName("rising_titan_sword");
	public static Item titan_sword = new Item_titan_sword(Tabs.gashacon_sparrow_arrow,rising_titan_sword).setMaxStackSize(1).setUnlocalizedName("titan_sword").setCreativeTab(Tabs.tabkuuga);

	public static Item kuugahead = new item_kuugaarmor(ArmorMaterial.DIAMOND, 4, 0).setMaxStackSize(1).setUnlocalizedName("kuugahead").setCreativeTab(Tabs.tabkuuga);
	public static Item kuugatroso = new item_kuugaarmor2(ArmorMaterial.DIAMOND, 4, 1).setMaxStackSize(1).setUnlocalizedName("kuugatroso").setCreativeTab(Tabs.tabkuuga);
	public static Item kuugalegs = new item_kuugaarmor2(ArmorMaterial.DIAMOND, 4, 2).setMaxStackSize(1).setUnlocalizedName("kuugalegs").setCreativeTab(Tabs.tabkuuga);

	public static Item arcle = new item_kuugadriver(ArmorMaterial.DIAMOND, 4, 3,"kuuga").setMaxStackSize(1).setUnlocalizedName("arcle").setCreativeTab(Tabs.tabkuuga);
	public static Item arcle_b = new Item_ore().setUnlocalizedName("arcle_b");
	public static Item arcle_gr = new Item_ore().setUnlocalizedName("arcle_gr");
	public static Item arcle_p = new Item_ore().setUnlocalizedName("arcle_p");
	public static Item arcle_u = new Item_ore().setUnlocalizedName("arcle_u");
	public static Item arcle_ru = new Item_ore().setUnlocalizedName("arcle_ru");
	
	public static Item kuuga_mighty = new Item_kuuga_power(1).setUnlocalizedName("kuuga_mighty").setCreativeTab(Tabs.tabkuuga);
	public static Item kuuga_dragon = new Item_kuuga_power(2).setUnlocalizedName("kuuga_dragon").setCreativeTab(Tabs.tabkuuga);
	public static Item kuuga_pegasus = new Item_kuuga_power(3).setUnlocalizedName("kuuga_pegasus").setCreativeTab(Tabs.tabkuuga);
	public static Item kuuga_titan = new Item_kuuga_power(4).setUnlocalizedName("kuuga_titan").setCreativeTab(Tabs.tabkuuga);
	public static Item kuuga_rising_mighty = new Item_kuuga_power(5).setUnlocalizedName("kuuga_rising_mighty").setCreativeTab(Tabs.tabkuuga);
	public static Item kuuga_rising_dragon = new Item_kuuga_power(6).setUnlocalizedName("kuuga_rising_dragon").setCreativeTab(Tabs.tabkuuga);
	public static Item kuuga_rising_pegasus = new Item_kuuga_power(7).setUnlocalizedName("kuuga_rising_pegasus").setCreativeTab(Tabs.tabkuuga);
	public static Item kuuga_rising_titan = new Item_kuuga_power(8).setUnlocalizedName("kuuga_rising_titan").setCreativeTab(Tabs.tabkuuga);
	public static Item kuuga_amazing_mighty = new Item_kuuga_power(9).setUnlocalizedName("kuuga_amazing_mighty").setCreativeTab(Tabs.tabkuuga);
	public static Item kuuga_ultimate = new Item_kuuga_power(10).setUnlocalizedName("kuuga_ultimate").setCreativeTab(Tabs.tabkuuga);
	public static Item kuuga_rising_ultimate = new Item_kuuga_power(11).setUnlocalizedName("kuuga_rising_ultimate").setCreativeTab(Tabs.tabkuuga);
	public static Item kuuga_super_rising_ultimate = new Item_kuuga_power(12).setUnlocalizedName("kuuga_super_rising_ultimate").setCreativeTab(Tabs.tabkuuga);
	
	//agito
	public static Item flame_saber_charge = new Item_ore().setUnlocalizedName("flame_saber_charge");
	public static Item flame_saber = new ItemChargeSword(Tabs.medajalibur,Items.apple,flame_saber_charge).setMaxStackSize(1).setUnlocalizedName("flame_saber").setCreativeTab(Tabs.tabagito);
	public static Item storm_halberd = new ItemBaseSword(ToolMaterial.EMERALD).setMaxStackSize(1).setUnlocalizedName("storm_halberd").setCreativeTab(Tabs.tabagito);
		
	public static Item shining_caliber_single_mode = new Item_ore().setUnlocalizedName("shining_caliber_single_mode");
	public static Item shining_caliber_summoned = new Item_2nd_sword_im(ToolMaterial.EMERALD,shining_caliber_single_mode).setMaxStackSize(1).setUnlocalizedName("shining_caliber_summoned").setCreativeTab(Tabs.tabagito);
	public static Item shining_caliber = new ItemBaseSword(ToolMaterial.EMERALD).setMaxStackSize(1).setUnlocalizedName("shining_caliber").setCreativeTab(Tabs.tabagito);
	
	
	public static Item agitohead = new item_agitoarmor(ArmorMaterial.DIAMOND, 4, 0).setMaxStackSize(1).setUnlocalizedName("agitohead").setCreativeTab(Tabs.tabagito);
	public static Item agitotroso = new item_agitoarmor2(ArmorMaterial.DIAMOND, 4, 1).setMaxStackSize(1).setUnlocalizedName("agitotroso").setCreativeTab(Tabs.tabagito);
	public static Item agitolegs = new item_agitoarmor2(ArmorMaterial.DIAMOND, 4, 2).setMaxStackSize(1).setUnlocalizedName("agitolegs").setCreativeTab(Tabs.tabagito);

	public static Item alter_ring = new item_agitodriver(ArmorMaterial.DIAMOND, 4, 3,"agito").setMaxStackSize(1).setUnlocalizedName("alter_ring").setCreativeTab(Tabs.tabagito);
	public static Item alter_ring_fl = new Item_ore().setUnlocalizedName("alter_ring_fl");
	public static Item alter_ring_st = new Item_ore().setUnlocalizedName("alter_ring_st");
	public static Item alter_ring_shining = new Item_ore().setUnlocalizedName("alter_ring_shining");
	
	public static Item meta_factor_exceed = new Item_ore().setUnlocalizedName("meta_factor_exceed");
	public static Item meta_factor = new item_agitodriver(ArmorMaterial.DIAMOND, 4, 3,"gills").setMaxStackSize(1).setUnlocalizedName("meta_factor").setCreativeTab(Tabs.tabagito);
	
	public static Item ank_point = new item_agitodriver(ArmorMaterial.DIAMOND, 4, 3,"another_agito").setMaxStackSize(1).setUnlocalizedName("ank_point").setCreativeTab(Tabs.tabagito);
	
	public static Item g3_belt = new item_agitodriver(ArmorMaterial.DIAMOND, 4, 3,"g3").setMaxStackSize(1).setUnlocalizedName("g3_belt").setCreativeTab(Tabs.tabagito);
	public static Item g3_x_belt = new item_agitodriver(ArmorMaterial.DIAMOND, 4, 3,"g3_x").setMaxStackSize(1).setUnlocalizedName("g3_x_belt").setCreativeTab(Tabs.tabagito);
	public static Item g3_mild_belt = new item_agitodriver(ArmorMaterial.DIAMOND, 4, 3,"g3_mild").setMaxStackSize(1).setUnlocalizedName("g3_mild_belt").setCreativeTab(Tabs.tabagito);
	public static Item g4_belt = new item_agitodriver(ArmorMaterial.DIAMOND, 4, 3,"g4").setMaxStackSize(1).setUnlocalizedName("g4_belt").setCreativeTab(Tabs.tabagito);
	
	public static Item g4_x_belt = new item_agitodriver(ArmorMaterial.DIAMOND, 4, 3,"g4_x").setMaxStackSize(1).setUnlocalizedName("g4_x_belt").setCreativeTab(Tabs.tabagito);
	
	public static Item g1_belt = new item_agitodriver(ArmorMaterial.DIAMOND, 4, 3,"g1").setMaxStackSize(1).setUnlocalizedName("g1_belt").setCreativeTab(Tabs.tabagito);
	
	
	public static Item alter_ring_miracle = new item_agitodriver(ArmorMaterial.DIAMOND, 4, 3,"agito_miracle").setMaxStackSize(1).setUnlocalizedName("alter_ring_miracle").setCreativeTab(Tabs.tabagito);
	public static Item ank_point_burning = new item_agitodriver(ArmorMaterial.DIAMOND, 4, 3,"another_agito_burning").setMaxStackSize(1).setUnlocalizedName("ank_point_burning").setCreativeTab(Tabs.tabagito);
	
	public static Item agito_ground = new Item_agito_power(0).setUnlocalizedName("agito_ground").setCreativeTab(Tabs.tabagito);
	public static Item agito_storm = new Item_agito_power(1).setUnlocalizedName("agito_storm").setCreativeTab(Tabs.tabagito);
	public static Item agito_flame = new Item_agito_power(2).setUnlocalizedName("agito_flame").setCreativeTab(Tabs.tabagito);
	public static Item agito_trinity = new Item_agito_power(3).setUnlocalizedName("agito_trinity").setCreativeTab(Tabs.tabagito);
	public static Item agito_burning = new Item_agito_power(4).setUnlocalizedName("agito_burning").setCreativeTab(Tabs.tabagito);
	public static Item agito_shining = new Item_agito_power(5).setUnlocalizedName("agito_shining").setCreativeTab(Tabs.tabagito);

	public static Item gills = new Item_agito_power(-1).setUnlocalizedName("gills").setCreativeTab(Tabs.tabagito);
	public static Item exceed_gills = new Item_agito_power(-1).setUnlocalizedName("exceed_gills").setCreativeTab(Tabs.tabagito);
	
	public static Item g1 = new Item_ore().setUnlocalizedName("g1").setCreativeTab(Tabs.tabagito);
	public static Item g3 = new Item_ore().setUnlocalizedName("g3").setCreativeTab(Tabs.tabagito);
	public static Item g3x = new Item_ore().setUnlocalizedName("g3x").setCreativeTab(Tabs.tabagito);
	public static Item g3mild = new Item_ore().setUnlocalizedName("g3mild").setCreativeTab(Tabs.tabagito);
	public static Item g4 = new Item_ore().setUnlocalizedName("g4").setCreativeTab(Tabs.tabagito);
	public static Item g4x = new Item_ore().setUnlocalizedName("g4x").setCreativeTab(Tabs.tabagito);

	public static Item another_agito = new Item_agito_power(-1).setUnlocalizedName("another_agito").setCreativeTab(Tabs.tabagito);

	public static Item agito_miracle = new Item_agito_power(-1).setUnlocalizedName("agito_miracle").setCreativeTab(Tabs.tabagito);
	public static Item another_agito_burning_form = new Item_agito_power(-1).setUnlocalizedName("another_agito_burning_form").setCreativeTab(Tabs.tabagito);

	//ryuki
	public static Item drag_visor = new Item_ore().setUnlocalizedName("drag_visor").setCreativeTab(Tabs.tabryuki);
	public static Item ride_saber = new ItemBaseSword(Tabs.den_denso).setMaxStackSize(1).setUnlocalizedName("ride_saber").setCreativeTab(Tabs.tabryuki);
	public static Item drag_saber = new ItemBaseSword(Tabs.den_denso).setMaxStackSize(1).setUnlocalizedName("drag_saber").setCreativeTab(Tabs.tabryuki);
	public static Item drag_claw = new ItemBaseSword(Tabs.den_denro).setMaxStackSize(1).setUnlocalizedName("drag_claw").setCreativeTab(Tabs.tabryuki);
	public static Item drag_shield = new ItemSwordWithEft(ToolMaterial.EMERALD,new PotionEffect(Potion.resistance.id, 25,1)).setMaxStackSize(1).setUnlocalizedName("drag_shield").setCreativeTab(Tabs.tabryuki);
	
	public static Item drag_visor_zwei_big = new Item_ore().setUnlocalizedName("drag_visor_zwei_big");
	public static Item drag_visor_zwei = new Item_2nd_sword_im(Tabs.denkamen_sword,drag_visor_zwei_big).setMaxStackSize(1).setUnlocalizedName("drag_visor_zwei").setCreativeTab(Tabs.tabryuki);
	
	public static Item dark_visor = new ItemBaseSword(Tabs.den_denso).setMaxStackSize(1).setUnlocalizedName("dark_visor").setCreativeTab(Tabs.tabryuki);
	public static Item wing_lancer_big = new Item_ore().setUnlocalizedName("wing_lancer_big");
	public static Item wing_lancer = new Item_2nd_sword_im(Tabs.den_denaxe,wing_lancer_big).setMaxStackSize(1).setUnlocalizedName("wing_lancer").setCreativeTab(Tabs.tabryuki);
		
	public static Item dark_blade = new ItemBaseSword(Tabs.denkamen_sword).setMaxStackSize(1).setUnlocalizedName("dark_blade").setCreativeTab(Tabs.tabryuki);
	
	public static Item scissors_visor = new Item_ore().setUnlocalizedName("scissors_visor").setCreativeTab(Tabs.tabryuki);
	public static Item scissors_pincer = new ItemBaseSword(Tabs.den_denro).setMaxStackSize(1).setUnlocalizedName("scissors_pincer").setCreativeTab(Tabs.tabryuki);
	public static Item incisor_guard = new ItemSwordWithEft(ToolMaterial.EMERALD,new PotionEffect(Potion.resistance.id, 25,1)).setMaxStackSize(1).setUnlocalizedName("incisor_guard").setCreativeTab(Tabs.tabryuki);
	
	public static Item magna_visor = new Item_gun(Tabs.den_dengu,RiderItems.energy).setUnlocalizedName("magna_visor").setCreativeTab(Tabs.tabryuki);
	public static Item torque_guard = new ItemSwordWithEft(ToolMaterial.EMERALD,new PotionEffect(Potion.resistance.id, 25,1)).setMaxStackSize(1).setUnlocalizedName("torque_guard").setCreativeTab(Tabs.tabryuki);
	
	public static Item evil_visor = new Item_ore().setUnlocalizedName("evil_visor").setCreativeTab(Tabs.tabryuki);
	
	public static Item metal_visor = new ItemBaseSword(Tabs.den_denso).setMaxStackSize(1).setUnlocalizedName("metal_visor").setCreativeTab(Tabs.tabryuki);
	public static Item hetal_horn = new ItemBaseSword(Tabs.den_denaxe).setMaxStackSize(1).setUnlocalizedName("hetal_horn").setCreativeTab(Tabs.tabryuki);
	
	public static Item veno_visor = new ItemBaseSword(Tabs.den_denro).setUnlocalizedName("veno_visor").setCreativeTab(Tabs.tabryuki);
	public static Item veno_saber = new ItemBaseSword(Tabs.den_denso).setMaxStackSize(1).setUnlocalizedName("veno_saber").setCreativeTab(Tabs.tabryuki);
	
	public static Item dest_visor = new ItemBaseSword(Tabs.den_denaxe).setUnlocalizedName("dest_visor").setCreativeTab(Tabs.tabryuki);
	public static Item dest_claws = new ItemBaseSword(Tabs.den_denro).setMaxStackSize(1).setUnlocalizedName("dest_claws").setCreativeTab(Tabs.tabryuki);
	
	public static Item gazelle_visor = new Item_ore().setUnlocalizedName("gazelle_visor").setCreativeTab(Tabs.tabryuki);
	
	public static Item gold_visor_big = new Item_ore().setUnlocalizedName("gold_visor_big");
	public static Item gold_visor = new Item_2nd_sword_im(Tabs.den_denro,gold_visor_big).setMaxStackSize(1).setUnlocalizedName("gold_visor").setCreativeTab(Tabs.tabryuki);
	public static Item gold_sabers = new ItemBaseSword(Tabs.den_denso).setMaxStackSize(1).setUnlocalizedName("gold_sabers").setCreativeTab(Tabs.tabryuki);
	public static Item gold_shield = new ItemSwordWithEft(ToolMaterial.EMERALD,new PotionEffect(Potion.resistance.id, 25,1)).setMaxStackSize(1).setUnlocalizedName("gold_shield").setCreativeTab(Tabs.tabryuki);
	
	public static Item wing_slasher_big = new Item_ore().setUnlocalizedName("wing_slasher_big");
	public static Item wing_slasher = new Item_2nd_sword_im(Tabs.den_denso,wing_slasher_big).setMaxStackSize(1).setUnlocalizedName("wing_slasher").setCreativeTab(Tabs.tabryuki);
	public static Item wing_shield = new ItemSwordWithEft(ToolMaterial.EMERALD,new PotionEffect(Potion.resistance.id, 25,1)).setMaxStackSize(1).setUnlocalizedName("wing_shield").setCreativeTab(Tabs.tabryuki);
	
	public static Item dark_drag_visor = new Item_ore().setUnlocalizedName("dark_drag_visor").setCreativeTab(Tabs.tabryuki);
	public static Item drag_saber_ryuga = new ItemBaseSword(Tabs.den_denso).setMaxStackSize(1).setUnlocalizedName("drag_saber_ryuga").setCreativeTab(Tabs.tabryuki);
	public static Item ryuga_drag_claw = new ItemBaseSword(Tabs.den_denro).setMaxStackSize(1).setUnlocalizedName("ryuga_drag_claw").setCreativeTab(Tabs.tabryuki);
	public static Item ryuga_drag_shield = new ItemSwordWithEft(ToolMaterial.EMERALD,new PotionEffect(Potion.resistance.id, 25,1)).setMaxStackSize(1).setUnlocalizedName("ryuga_drag_shield").setCreativeTab(Tabs.tabryuki);
	
	public static Item blanc_visor = new ItemBaseSword(ToolMaterial.EMERALD).setMaxStackSize(1).setUnlocalizedName("blanc_visor").setCreativeTab(Tabs.tabryuki);
	
	public static Item bio_visor = new Item_ore().setUnlocalizedName("bio_visor").setCreativeTab(Tabs.tabryuki);
	
	public static Item abyss_visor = new Item_ore().setUnlocalizedName("abyss_visor").setCreativeTab(Tabs.tabryuki);
	public static Item abyss_saber = new ItemBaseSword(Tabs.den_denso).setMaxStackSize(1).setUnlocalizedName("abyss_saber").setCreativeTab(Tabs.tabryuki);
	public static Item abyssmash = new ItemBaseSword(Tabs.den_denro).setMaxStackSize(1).setUnlocalizedName("abyssmash").setCreativeTab(Tabs.tabryuki);
	
	public static Item slash_visor = new Item_ore().setUnlocalizedName("slash_visor").setCreativeTab(Tabs.tabryuki);
	public static Item alternative_sword = new ItemBaseSword(Tabs.den_denso).setMaxStackSize(1).setUnlocalizedName("alternative_sword").setCreativeTab(Tabs.tabryuki);
	
	
	public static Item ryukihead = new item_ryukiarmor(ArmorMaterial.DIAMOND, 4, 0).setMaxStackSize(1).setUnlocalizedName("ryukihead").setCreativeTab(Tabs.tabryuki);
	public static Item ryukitroso = new item_ryukiarmor2(ArmorMaterial.DIAMOND, 4, 1).setMaxStackSize(1).setUnlocalizedName("ryukitroso").setCreativeTab(Tabs.tabryuki);
	public static Item ryukilegs = new item_ryukiarmor2(ArmorMaterial.DIAMOND, 4, 2).setMaxStackSize(1).setUnlocalizedName("ryukilegs").setCreativeTab(Tabs.tabryuki);
	public static Item v_buckle_ryuki = new item_ryukidriver(ArmorMaterial.DIAMOND, 4, 3,"ryuki").setMaxStackSize(1).setUnlocalizedName("v_buckle_ryuki").setCreativeTab(Tabs.tabryuki);
	public static Item v_buckle = new Item_ore().setUnlocalizedName("v_buckle");
	public static Item v_buckle_ryuki_survive = new Item_ore().setUnlocalizedName("v_buckle_ryuki_survive");
	public static Item v_buckle_knight = new item_ryukidriver(ArmorMaterial.DIAMOND, 4, 3,"knight").setMaxStackSize(1).setUnlocalizedName("v_buckle_knight").setCreativeTab(Tabs.tabryuki);
	public static Item v_buckle_knight_survive = new Item_ore().setUnlocalizedName("v_buckle_knight_survive");
	public static Item v_buckle_scissors = new item_ryukidriver(ArmorMaterial.DIAMOND, 4, 3,"scissors").setMaxStackSize(1).setUnlocalizedName("v_buckle_scissors").setCreativeTab(Tabs.tabryuki);
	
	public static Item v_buckle_zolda = new item_ryukidriver(ArmorMaterial.DIAMOND, 4, 3,"zolda").setMaxStackSize(1).setUnlocalizedName("v_buckle_zolda").setCreativeTab(Tabs.tabryuki);
	public static Item v_buckle_raia = new item_ryukidriver(ArmorMaterial.DIAMOND, 4, 3,"raia").setMaxStackSize(1).setUnlocalizedName("v_buckle_raia").setCreativeTab(Tabs.tabryuki);
	public static Item v_buckle_gai = new item_ryukidriver(ArmorMaterial.DIAMOND, 4, 3,"gai").setMaxStackSize(1).setUnlocalizedName("v_buckle_gai").setCreativeTab(Tabs.tabryuki);
	public static Item v_buckle_ouja = new item_ryukidriver(ArmorMaterial.DIAMOND, 4, 3,"ouja").setMaxStackSize(1).setUnlocalizedName("v_buckle_ouja").setCreativeTab(Tabs.tabryuki);
	public static Item v_buckle_tiger = new item_ryukidriver(ArmorMaterial.DIAMOND, 4, 3,"tiger").setMaxStackSize(1).setUnlocalizedName("v_buckle_tiger").setCreativeTab(Tabs.tabryuki);
	public static Item v_buckle_imperer = new item_ryukidriver(ArmorMaterial.DIAMOND, 4, 3,"imperer").setMaxStackSize(1).setUnlocalizedName("v_buckle_imperer").setCreativeTab(Tabs.tabryuki);
	public static Item v_buckle_odin = new item_ryukidriver(ArmorMaterial.DIAMOND, 4, 3,"odin").setMaxStackSize(1).setUnlocalizedName("v_buckle_odin").setCreativeTab(Tabs.tabryuki);
	public static Item v_buckle_femme = new item_ryukidriver(ArmorMaterial.DIAMOND, 4, 3,"femme").setMaxStackSize(1).setUnlocalizedName("v_buckle_femme").setCreativeTab(Tabs.tabryuki);
	public static Item v_buckle_verde = new item_ryukidriver(ArmorMaterial.DIAMOND, 4, 3,"verde").setMaxStackSize(1).setUnlocalizedName("v_buckle_verde").setCreativeTab(Tabs.tabryuki);
	
	public static Item v_buckle_ryuga_survive = new Item_ore().setUnlocalizedName("v_buckle_ryuga_survive");
	public static Item v_buckle_ryuga = new item_ryukidriver(ArmorMaterial.DIAMOND, 4, 3,"ryuga").setMaxStackSize(1).setUnlocalizedName("v_buckle_ryuga").setCreativeTab(Tabs.tabryuki);
	public static Item v_buckle_abyss = new item_ryukidriver(ArmorMaterial.DIAMOND, 4, 3,"abyss").setMaxStackSize(1).setUnlocalizedName("v_buckle_abyss").setCreativeTab(Tabs.tabryuki);
	
	public static Item alternativebelt = new item_ryukidriver(ArmorMaterial.DIAMOND, 4, 3,"alternative").setMaxStackSize(1).setUnlocalizedName("alternativebelt").setCreativeTab(Tabs.tabryuki);
	public static Item alternativezerobelt = new item_ryukidriver(ArmorMaterial.DIAMOND, 4, 3,"alternativezero").setMaxStackSize(1).setUnlocalizedName("alternativezerobelt").setCreativeTab(Tabs.tabryuki);
	

	
	public static Item dragreder_advent = new Item_advent_cards(0,"1").setUnlocalizedName("dragreder_advent").setCreativeTab(Tabs.tabryuki);
	public static Item darkwing_advent = new Item_advent_cards(0,"2").setUnlocalizedName("darkwing_advent").setCreativeTab(Tabs.tabryuki);
	public static Item volcancer_advent = new Item_ore().setUnlocalizedName("volcancer_advent").setCreativeTab(Tabs.tabryuki);
	public static Item magnugiga_advent = new Item_ore().setUnlocalizedName("magnugiga_advent").setCreativeTab(Tabs.tabryuki);
	public static Item evildiver_advent = new Item_ore().setUnlocalizedName("evildiver_advent").setCreativeTab(Tabs.tabryuki);
	public static Item metalgelas_advent = new Item_ore().setUnlocalizedName("metalgelas_advent").setCreativeTab(Tabs.tabryuki);
	public static Item venosnaker_advent = new Item_ore().setUnlocalizedName("venosnaker_advent").setCreativeTab(Tabs.tabryuki);
	public static Item destwilder_advent = new Item_ore().setUnlocalizedName("destwilder_advent").setCreativeTab(Tabs.tabryuki);
	public static Item gigazelle_advent = new Item_ore().setUnlocalizedName("gigazelle_advent").setCreativeTab(Tabs.tabryuki);
	public static Item biogreeza_advent = new Item_ore().setUnlocalizedName("biogreeza_advent").setCreativeTab(Tabs.tabryuki);
	public static Item blancwing_advent = new Item_ore().setUnlocalizedName("blancwing_advent").setCreativeTab(Tabs.tabryuki);
	
	public static Item goldphoenix_advent = new Item_ore().setUnlocalizedName("goldphoenix_advent").setCreativeTab(Tabs.tabryuki);
	public static Item abysslasher_advent = new Item_ore().setUnlocalizedName("abysslasher_advent").setCreativeTab(Tabs.tabryuki);
	public static Item psycorogue_advent = new Item_ore().setUnlocalizedName("psycorogue_advent").setCreativeTab(Tabs.tabryuki);

	public static Item survive_shippu_advent= new Item_advent_cards(1,"2").setUnlocalizedName("survive_shippu_advent").setCreativeTab(Tabs.tabryuki);
	public static Item survive_mugen_advent = new Item_ore().setUnlocalizedName("survive_mugen_advent").setCreativeTab(Tabs.tabryuki);
	public static Item survive_advent = new Item_advent_cards(1,"1").setUnlocalizedName("survive_advent").setCreativeTab(Tabs.tabryuki);

	public static Item blank_sword_vent = new Item_vent("ryuki",ride_saber,2,drag_visor).setUnlocalizedName("blank_sword_vent").setCreativeTab(Tabs.tabryuki);
	public static Item drag_saber_vent = new Item_vent("ryuki",drag_saber,0,drag_visor).setUnlocalizedName("drag_saber_vent").setCreativeTab(Tabs.tabryuki);
	public static Item wing_lancer_vent = new Item_vent("knight",wing_lancer,0,dark_visor).setUnlocalizedName("wing_lancer_vent").setCreativeTab(Tabs.tabryuki);
	public static Item veno_saber_vent = new Item_vent("ouja",veno_saber,0,veno_visor).setUnlocalizedName("veno_saber_vent").setCreativeTab(Tabs.tabryuki);
	public static Item wing_slasher_vent = new Item_vent("femme",wing_slasher,0,blanc_visor).setUnlocalizedName("wing_slasher_vent").setCreativeTab(Tabs.tabryuki);
	public static Item ryuga_drag_saber_vent = new Item_vent("ryuga",drag_saber_ryuga,0,dark_drag_visor).setUnlocalizedName("ryuga_drag_saber_vent").setCreativeTab(Tabs.tabryuki);
	public static Item gold_sabers_vent = new Item_vent("odin",gold_sabers,0,gold_visor).setUnlocalizedName("gold_sabers_vent").setCreativeTab(Tabs.tabryuki);
	public static Item drag_visor_zwei_sword_mode_vent = new Item_vent("ryuki",drag_visor_zwei,1,drag_visor_zwei).setUnlocalizedName("drag_visor_zwei_sword_mode_vent").setCreativeTab(Tabs.tabryuki);
	public static Item dark_blade_vent = new Item_vent("knight",dark_blade,1,dark_visor).setUnlocalizedName("dark_blade_vent").setCreativeTab(Tabs.tabryuki);
	
	public static Item abyss_saber_vent = new Item_vent("abyss",abyss_saber,0,abyss_visor).setUnlocalizedName("abyss_saber_vent").setCreativeTab(Tabs.tabryuki);
	public static Item alternative_sword_vent = new Item_vent("alternative",alternative_sword,0,slash_visor).setUnlocalizedName("alternative_sword_vent").setCreativeTab(Tabs.tabryuki);
	
	public static Item drag_claw_vent = new Item_vent("ryuki",drag_claw,0,drag_visor).setUnlocalizedName("drag_claw_vent").setCreativeTab(Tabs.tabryuki);
	public static Item scissors_pincer_vent = new Item_vent("scissors",scissors_pincer,0,scissors_visor).setUnlocalizedName("scissors_pincer_vent").setCreativeTab(Tabs.tabryuki);
	public static Item metal_horn_vent = new Item_vent("gai",hetal_horn,0,metal_visor).setUnlocalizedName("metal_horn_vent").setCreativeTab(Tabs.tabryuki);
	public static Item dest_claws_vent = new Item_vent("tiger",dest_claws,0,dest_visor).setUnlocalizedName("dest_claws_vent").setCreativeTab(Tabs.tabryuki);
	public static Item ryuga_drag_claw_vent = new Item_vent("ryuga",ryuga_drag_claw,0,dark_drag_visor).setUnlocalizedName("ryuga_drag_claw_vent").setCreativeTab(Tabs.tabryuki);
	public static Item abyssmash_vent = new Item_vent("abyss",abyssmash,1,abyss_visor).setUnlocalizedName("abyssmash_vent").setCreativeTab(Tabs.tabryuki);
	
	public static Item drag_shield_vent = new Item_vent("ryuki",drag_shield,0,drag_visor).setUnlocalizedName("drag_shield_vent").setCreativeTab(Tabs.tabryuki);
	public static Item shell_defense_vent = new Item_vent("scissors",incisor_guard,0,scissors_visor).setUnlocalizedName("shell_defense_vent").setCreativeTab(Tabs.tabryuki);
	public static Item giga_armor_vent = new Item_vent("zolda",torque_guard,0,magna_visor).setUnlocalizedName("giga_armor_vent").setCreativeTab(Tabs.tabryuki);
	public static Item wing_shield_vent = new Item_vent("femme",wing_shield,0,blanc_visor).setUnlocalizedName("wing_shield_vent").setCreativeTab(Tabs.tabryuki);
	public static Item ryuga_drag_shield_vent = new Item_vent("ryuga",ryuga_drag_shield,0,dark_drag_visor).setUnlocalizedName("ryuga_drag_shield_vent").setCreativeTab(Tabs.tabryuki);
	public static Item gold_shield_vent = new Item_vent("odin",gold_shield,1,gold_visor).setUnlocalizedName("gold_shield_vent").setCreativeTab(Tabs.tabryuki);
	
	
	//faiz
	public static Item faiz_edge = new ItemBaseSword(Tabs.faiz_edge).setMaxStackSize(1).setUnlocalizedName("faiz_edge").setCreativeTab(Tabs.tabfaiz);
	public static Item faiz_blaster = new Item_faiz_blaster(Tabs.faiz_blaster,energy).setMaxStackSize(1).setUnlocalizedName("faiz_blaster").setCreativeTab(Tabs.tabfaiz);
	public static Item faiz_blaster_gun = new Item_ore().setUnlocalizedName("faiz_blaster_gun");	
	public static Item orga_stlanzer = new ItemBaseSword(Tabs.orga_stlanzer).setMaxStackSize(1).setUnlocalizedName("orga_stlanzer").setCreativeTab(Tabs.tabfaiz);
	public static Item axel_ray_gun_gun = new Item_ore().setUnlocalizedName("axel_ray_gun_gun");	
	public static Item axel_ray_gun = new Item_swordgun(Tabs.axel_ray_gun,energy,axel_ray_gun_gun).setMaxStackSize(1).setUnlocalizedName("axel_ray_gun").setCreativeTab(Tabs.tabfaiz);
	
	public static Item kaixa_blaygun_gun = new Item_ore().setUnlocalizedName("kaixa_blaygun_gun");	
	public static Item kaixa_blaygun = new Item_swordgun(Tabs.kaixa_blaygun,energy,kaixa_blaygun_gun).setMaxStackSize(1).setUnlocalizedName("kaixa_blaygun").setCreativeTab(Tabs.tabfaiz);

	public static Item deltablaster = new Item_gun(Tabs.deltablaster, RiderItems.energy).setMaxStackSize(1).setUnlocalizedName("deltablaster").setCreativeTab(Tabs.tabfaiz);
	
	public static Item psyga_tonfa_edge_big  = new Item_ore().setUnlocalizedName("psyga_tonfa_edge_big");
	public static Item psyga_tonfa_edge = new Item_2nd_sword_im(Tabs.psyga_tonfa_edge,psyga_tonfa_edge_big).setMaxStackSize(1).setUnlocalizedName("psyga_tonfa_edge").setCreativeTab(Tabs.tabfaiz);

	public static Item faizhead = new item_faizarmor(ArmorMaterial.DIAMOND, 4, 0).setMaxStackSize(1).setUnlocalizedName("faizhead").setCreativeTab(Tabs.tabfaiz);
	public static Item faiztroso = new item_faizarmor2(ArmorMaterial.DIAMOND, 4, 1).setMaxStackSize(1).setUnlocalizedName("faiztroso").setCreativeTab(Tabs.tabfaiz);
	public static Item faizlegs = new item_faizarmor2(ArmorMaterial.DIAMOND, 4, 2).setMaxStackSize(1).setUnlocalizedName("faizlegs").setCreativeTab(Tabs.tabfaiz);

	public static Item faizdriver = new item_faizdriver(ArmorMaterial.DIAMOND, 4, 3,"faiz").setMaxStackSize(1).setUnlocalizedName("faizdriver").setCreativeTab(Tabs.tabfaiz);
	public static Item kaixadriver = new item_faizdriver(ArmorMaterial.DIAMOND, 4, 3,"kaixa").setMaxStackSize(1).setUnlocalizedName("kaixadriver").setCreativeTab(Tabs.tabfaiz);
	public static Item deltadriver = new item_faizdriver(ArmorMaterial.DIAMOND, 4, 3,"delta").setMaxStackSize(1).setUnlocalizedName("deltadriver").setCreativeTab(Tabs.tabfaiz);
	public static Item psygadriver = new item_faizdriver(ArmorMaterial.DIAMOND, 4, 3,"psyga").setMaxStackSize(1).setUnlocalizedName("psygadriver").setCreativeTab(Tabs.tabfaiz);
	public static Item orgadriver = new item_faizdriver(ArmorMaterial.DIAMOND, 4, 3,"orga").setMaxStackSize(1).setUnlocalizedName("orgadriver").setCreativeTab(Tabs.tabfaiz);
	public static Item smartbulke = new item_faizdriver(ArmorMaterial.DIAMOND, 4, 3,"riotrooper").setMaxStackSize(1).setUnlocalizedName("smartbulke").setCreativeTab(Tabs.tabfaiz);


	public static Item faiz_mission_memory = new Item_mission_memory(0).setUnlocalizedName("faiz_mission_memory").setCreativeTab(Tabs.tabfaiz);
	public static Item faiz_axel_mission_memory = new Item_mission_memory(1).setUnlocalizedName("faiz_axel_mission_memory").setCreativeTab(Tabs.tabfaiz);
	public static Item faiz_blaster_mission_memory = new Item_mission_memory(2).setUnlocalizedName("faiz_blaster_mission_memory").setCreativeTab(Tabs.tabfaiz);

	public static Item kaixa_mission_memory = new Item_ore().setUnlocalizedName("kaixa_mission_memory").setCreativeTab(Tabs.tabfaiz);
	public static Item delta_mission_memory = new Item_ore().setUnlocalizedName("delta_mission_memory").setCreativeTab(Tabs.tabfaiz);
	public static Item psyga_mission_memory = new Item_ore().setUnlocalizedName("psyga_mission_memory").setCreativeTab(Tabs.tabfaiz);
	public static Item orga_mission_memory = new Item_ore().setUnlocalizedName("orga_mission_memory").setCreativeTab(Tabs.tabfaiz);

				
	
	//blade
	public static Item blayrouzer = new ItemBaseSword(ToolMaterial.EMERALD).setMaxStackSize(1).setUnlocalizedName("blayrouzer").setCreativeTab(Tabs.tabblade);
	public static Item kingrouzer = new ItemBaseSword(ToolMaterial.EMERALD).setMaxStackSize(1).setUnlocalizedName("kingrouzer").setCreativeTab(Tabs.tabblade);
	public static Item leanglerouzer_big  = new Item_ore().setUnlocalizedName("leanglerouzer_big");
	public static Item leanglerouzer = new Item_2nd_sword_im(Tabs.leanglerouzer, leanglerouzer_big).setMaxStackSize(1).setUnlocalizedName("leanglerouzer").setCreativeTab(Tabs.tabblade);
	public static Item garrenrouzer = new Item_gun(Tabs.den_dengu, RiderItems.energy).setMaxStackSize(1).setUnlocalizedName("garrenrouzer").setCreativeTab(Tabs.tabblade);

	public static Item chalice_arrow_big  = new Item_ore().setUnlocalizedName("chalice_arrow_big");
	public static Item chalice_arrow = new Item_2nd_gun_im(ToolMaterial.EMERALD, energy, chalice_arrow_big).setMaxStackSize(1).setUnlocalizedName("chalice_arrow").setCreativeTab(Tabs.tabblade);
	public static Item wild_slasher = new ItemBaseSword(ToolMaterial.EMERALD).setMaxStackSize(1).setUnlocalizedName("wild_slasher").setCreativeTab(Tabs.tabblade);
	public static Item wild_chalice_arrow_big  = new Item_ore().setUnlocalizedName("wild_chalice_arrow_big");
	public static Item wild_chalice_arrow = new Item_2nd_gun_im(ToolMaterial.EMERALD, energy, wild_chalice_arrow_big).setMaxStackSize(1).setUnlocalizedName("wild_chalice_arrow").setCreativeTab(Tabs.tabblade);

	public static Item bladehead = new item_bladearmor(ArmorMaterial.DIAMOND, 4, 0).setMaxStackSize(1).setUnlocalizedName("bladehead").setCreativeTab(Tabs.tabblade);
	public static Item bladetroso = new item_bladearmor2(ArmorMaterial.DIAMOND, 4, 1).setMaxStackSize(1).setUnlocalizedName("bladetroso").setCreativeTab(Tabs.tabblade);
	public static Item bladelegs = new item_bladearmor2(ArmorMaterial.DIAMOND, 4, 2).setMaxStackSize(1).setUnlocalizedName("bladelegs").setCreativeTab(Tabs.tabblade);

	public static Item bladedriver = new item_bladedriver(ArmorMaterial.DIAMOND, 4, 3,"blade").setMaxStackSize(1).setUnlocalizedName("bladedriver").setCreativeTab(Tabs.tabblade);
	public static Item garrendriver = new item_bladedriver(ArmorMaterial.DIAMOND, 4, 3,"garren").setMaxStackSize(1).setUnlocalizedName("garrendriver").setCreativeTab(Tabs.tabblade);
	public static Item leangle_belt = new item_bladedriver(ArmorMaterial.DIAMOND, 4, 3,"leangle").setMaxStackSize(1).setUnlocalizedName("leangle_belt").setCreativeTab(Tabs.tabblade);
	public static Item chalicerouzer = new item_bladedriver(ArmorMaterial.DIAMOND, 4, 3,"chalice").setMaxStackSize(1).setUnlocalizedName("chalicerouzer").setCreativeTab(Tabs.tabblade);
	public static Item glaive_buckle = new item_bladedriver(ArmorMaterial.DIAMOND, 4, 3,"glaive").setMaxStackSize(1).setUnlocalizedName("glaive_buckle").setCreativeTab(Tabs.tabblade);
	public static Item larc_buckle = new item_bladedriver(ArmorMaterial.DIAMOND, 4, 3,"larc").setMaxStackSize(1).setUnlocalizedName("larc_buckle").setCreativeTab(Tabs.tabblade);
	public static Item lance_buckle = new item_bladedriver(ArmorMaterial.DIAMOND, 4, 3,"lance").setMaxStackSize(1).setUnlocalizedName("lance_buckle").setCreativeTab(Tabs.tabblade);
	
	public static Item rouze_absorber = new Item_ore().setUnlocalizedName("rouze_absorber").setCreativeTab(Tabs.tabblade);
	public static Item garren_absorber = new Item_ore().setUnlocalizedName("garren_absorber").setCreativeTab(Tabs.tabblade);
	
	public static Item changebeetle = new ItemRouze_Cards(0,"blade").setUnlocalizedName("changebeetle").setCreativeTab(Tabs.tabblade);
	public static Item change_stag = new ItemRouze_Cards(0,"garren").setUnlocalizedName("change_stag").setCreativeTab(Tabs.tabblade);
	public static Item change_spider = new ItemRouze_Cards(0,"leangle").setUnlocalizedName("change_spider").setCreativeTab(Tabs.tabblade);
	public static Item change_mantis = new ItemRouze_Cards(0,"chalice").setUnlocalizedName("change_mantis").setCreativeTab(Tabs.tabblade);	
	public static Item changekerberoslance = new Item_ore().setUnlocalizedName("changekerberoslance").setCreativeTab(Tabs.tabblade);
	public static Item changekerberoslarc = new Item_ore().setUnlocalizedName("changekerberoslarc").setCreativeTab(Tabs.tabblade);
	public static Item fusion_eagle = new ItemRouze_Cards(1,"blade").setUnlocalizedName("fusion_eagle").setCreativeTab(Tabs.tabblade);
	public static Item fusion_peacock = new ItemRouze_Cards(1,"garren").setUnlocalizedName("fusion_peacock").setCreativeTab(Tabs.tabblade);
	public static Item absorb_capricorn = new Item_ore().setUnlocalizedName("absorb_capricorn").setCreativeTab(Tabs.tabblade);
	public static Item absorb_serpent = new Item_ore().setUnlocalizedName("absorb_serpent").setCreativeTab(Tabs.tabblade);
	public static Item evolution_caucasus = new ItemRouze_Cards(2,"blade").setUnlocalizedName("evolution_caucasus").setCreativeTab(Tabs.tabblade);
	public static Item evolution_giraffa = new ItemRouze_Cards(2,"garren").setUnlocalizedName("evolution_giraffa").setCreativeTab(Tabs.tabblade);
	public static Item evolution_paradoxa = new ItemRouze_Cards(3,"chalice").setUnlocalizedName("evolution_paradoxa").setCreativeTab(Tabs.tabblade);
	
	
	//hibiki
	public static Item ongekibo_rekka = new ItemBaseSword(Tabs.ongekibo).setMaxStackSize(1).setUnlocalizedName("ongekibo_rekka").setCreativeTab(Tabs.tabhibiki);
	public static Item unfinished_armed_saber = new Item_ore().setUnlocalizedName("unfinished_armed_saber").setCreativeTab(Tabs.tabhibiki);
	public static Item armed_saber = new Itemarmed_saber(Tabs.armedsaber).setMaxStackSize(1).setUnlocalizedName("armed_saber").setCreativeTab(Tabs.tabhibiki);
	public static Item ongekibo_yamase = new ItemBaseSword(Tabs.ongekibo).setMaxStackSize(1).setUnlocalizedName("ongekibo_yamase").setCreativeTab(Tabs.tabhibiki);
	public static Item ongekibo_rakurai = new ItemBaseSword(Tabs.ongekibo).setMaxStackSize(1).setUnlocalizedName("ongekibo_rakurai").setCreativeTab(Tabs.tabhibiki);
	public static Item ongekibo_shakubyoushi = new ItemBaseSword(Tabs.ongekibo).setMaxStackSize(1).setUnlocalizedName("ongekibo_shakubyoushi").setCreativeTab(Tabs.tabhibiki);
	public static Item ongekibo_nachiguro = new ItemBaseSword(Tabs.ongekibo).setMaxStackSize(1).setUnlocalizedName("ongekibo_nachiguro").setCreativeTab(Tabs.tabhibiki);
	public static Item ongekibo_rokushou = new ItemBaseSword(Tabs.ongekibo).setMaxStackSize(1).setUnlocalizedName("ongekibo_rokushou").setCreativeTab(Tabs.tabhibiki);
	public static Item ongekibo_gouriki = new ItemBaseSword(Tabs.ongekibo).setMaxStackSize(1).setUnlocalizedName("ongekibo_gouriki").setCreativeTab(Tabs.tabhibiki);
	public static Item ongekibo_ressui = new ItemBaseSword(Tabs.ongekibo).setMaxStackSize(1).setUnlocalizedName("ongekibo_ressui").setCreativeTab(Tabs.tabhibiki);
		
	public static Item ongekikan_reppuu = new Item_gun(Tabs.den_dengu, RiderItems.energy).setMaxStackSize(1).setUnlocalizedName("ongekikan_reppuu").setCreativeTab(Tabs.tabhibiki);
	
	public static Item ongekigen_retsurai = new ItemBaseSword(Tabs.den_denaxe).setMaxStackSize(1).setUnlocalizedName("ongekigen_retsurai").setCreativeTab(Tabs.tabhibiki);
	public static Item ongeki_shingen_retsuzan = new ItemBaseSword(Tabs.den_denaxe).setMaxStackSize(1).setUnlocalizedName("ongeki_shingen_retsuzan").setCreativeTab(Tabs.tabhibiki);
	public static Item ongekigen_enma = new ItemBaseSword(Tabs.den_denaxe).setMaxStackSize(1).setUnlocalizedName("ongekigen_enma").setCreativeTab(Tabs.tabhibiki);
	public static Item ongekigen_togenkyo = new ItemBaseSword(Tabs.den_denaxe).setMaxStackSize(1).setUnlocalizedName("ongekigen_togenkyo").setCreativeTab(Tabs.tabhibiki);
	
	public static Item echo_sword_onsaken = new ItemBaseSword(Tabs.den_denso).setMaxStackSize(1).setUnlocalizedName("echo_sword_onsaken").setCreativeTab(Tabs.tabhibiki);
	public static Item ongekikanabo_retto = new ItemBaseSword(Tabs.den_denaxe).setMaxStackSize(1).setUnlocalizedName("ongekikanabo_retto").setCreativeTab(Tabs.tabhibiki);
	public static Item ongekisankaku_ressetsu = new ItemBaseSword(Tabs.den_denro).setMaxStackSize(1).setUnlocalizedName("ongekisankaku_ressetsu").setCreativeTab(Tabs.tabhibiki);
	public static Item ongeki_shincho_retsuban = new ItemBaseSword(Tabs.den_denro).setMaxStackSize(1).setUnlocalizedName("ongeki_shincho_retsuban").setCreativeTab(Tabs.tabhibiki);
				
	public static Item hibikihead = new item_hibikiarmor(ArmorMaterial.DIAMOND, 4, 0).setMaxStackSize(1).setUnlocalizedName("hibikihead").setCreativeTab(Tabs.tabhibiki);
	public static Item hibikitroso = new item_hibikiarmor2(ArmorMaterial.DIAMOND, 4, 1).setMaxStackSize(1).setUnlocalizedName("hibikitroso").setCreativeTab(Tabs.tabhibiki);
	public static Item hibikilegs = new item_hibikiarmor2(ArmorMaterial.DIAMOND, 4, 2).setMaxStackSize(1).setUnlocalizedName("hibikilegs").setCreativeTab(Tabs.tabhibiki);

	public static Item hibikidriver = new item_hibikidriver(ArmorMaterial.DIAMOND, 4, 3,"hibiki").setMaxStackSize(1).setUnlocalizedName("hibikidriver").setCreativeTab(Tabs.tabhibiki);	
	public static Item ibukidriver = new item_hibikidriver(ArmorMaterial.DIAMOND, 4, 3,"ibuki").setMaxStackSize(1).setUnlocalizedName("ibukidriver").setCreativeTab(Tabs.tabhibiki);
	public static Item todorokidriver = new item_hibikidriver(ArmorMaterial.DIAMOND, 4, 3,"todoroki").setMaxStackSize(1).setUnlocalizedName("todorokidriver").setCreativeTab(Tabs.tabhibiki);
	public static Item zankidriver = new item_hibikidriver(ArmorMaterial.DIAMOND, 4, 3,"zanki").setMaxStackSize(1).setUnlocalizedName("zankidriver").setCreativeTab(Tabs.tabhibiki);
	public static Item eikidriver = new item_hibikidriver(ArmorMaterial.DIAMOND, 4, 3,"eiki").setMaxStackSize(1).setUnlocalizedName("eikidriver").setCreativeTab(Tabs.tabhibiki);
	public static Item dankidriver = new item_hibikidriver(ArmorMaterial.DIAMOND, 4, 3,"danki").setMaxStackSize(1).setUnlocalizedName("dankidriver").setCreativeTab(Tabs.tabhibiki);
	public static Item sabakidriver = new item_hibikidriver(ArmorMaterial.DIAMOND, 4, 3,"sabaki").setMaxStackSize(1).setUnlocalizedName("sabakidriver").setCreativeTab(Tabs.tabhibiki);	
	public static Item shukidriver = new item_hibikidriver(ArmorMaterial.DIAMOND, 4, 3,"shuki").setMaxStackSize(1).setUnlocalizedName("shukidriver").setCreativeTab(Tabs.tabhibiki);	
	public static Item goukidriver = new item_hibikidriver(ArmorMaterial.DIAMOND, 4, 3,"gouki").setMaxStackSize(1).setUnlocalizedName("goukidriver").setCreativeTab(Tabs.tabhibiki);	
	public static Item tokidriver = new item_hibikidriver(ArmorMaterial.DIAMOND, 4, 3,"toki").setMaxStackSize(1).setUnlocalizedName("tokidriver").setCreativeTab(Tabs.tabhibiki);	
	public static Item shoukidriver = new item_hibikidriver(ArmorMaterial.DIAMOND, 4, 3,"shouki").setMaxStackSize(1).setUnlocalizedName("shoukidriver").setCreativeTab(Tabs.tabhibiki);	
	public static Item bankidriver = new item_hibikidriver(ArmorMaterial.DIAMOND, 4, 3,"banki").setMaxStackSize(1).setUnlocalizedName("bankidriver").setCreativeTab(Tabs.tabhibiki);
	public static Item amakidriver = new item_hibikidriver(ArmorMaterial.DIAMOND, 4, 3,"amaki").setMaxStackSize(1).setUnlocalizedName("amakidriver").setCreativeTab(Tabs.tabhibiki);	
	public static Item kyosukedriver = new item_hibikidriver(ArmorMaterial.DIAMOND, 4, 3,"kyosuke").setMaxStackSize(1).setUnlocalizedName("kyosukedriver").setCreativeTab(Tabs.tabhibiki);
	public static Item kabukidriver = new item_hibikidriver(ArmorMaterial.DIAMOND, 4, 3,"kabuki").setMaxStackSize(1).setUnlocalizedName("kabukidriver").setCreativeTab(Tabs.tabhibiki);
	public static Item toukidriver = new item_hibikidriver(ArmorMaterial.DIAMOND, 4, 3,"touki").setMaxStackSize(1).setUnlocalizedName("toukidriver").setCreativeTab(Tabs.tabhibiki);
	public static Item kiramekidriver = new item_hibikidriver(ArmorMaterial.DIAMOND, 4, 3,"kirameki").setMaxStackSize(1).setUnlocalizedName("kiramekidriver").setCreativeTab(Tabs.tabhibiki);
	public static Item nishikidriver = new item_hibikidriver(ArmorMaterial.DIAMOND, 4, 3,"nishiki").setMaxStackSize(1).setUnlocalizedName("nishikidriver").setCreativeTab(Tabs.tabhibiki);
	public static Item habatakidriver = new item_hibikidriver(ArmorMaterial.DIAMOND, 4, 3,"habataki").setMaxStackSize(1).setUnlocalizedName("habatakidriver").setCreativeTab(Tabs.tabhibiki);
	public static Item fubukidriver = new item_hibikidriver(ArmorMaterial.DIAMOND, 4, 3,"fubuki").setMaxStackSize(1).setUnlocalizedName("fubukidriver").setCreativeTab(Tabs.tabhibiki);

	public static Item henshin_onsa = new Itemhibiki_stone(0).setUnlocalizedName("henshin_onsa").setCreativeTab(Tabs.tabhibiki);
	public static Item henshin_onsa_kurenai = new Itemhibiki_stone(1).setUnlocalizedName("henshin_onsa_kurenai").setCreativeTab(Tabs.tabhibiki);
	
	public static Item henshin_onsa_danki = new Item_ore().setUnlocalizedName("henshin_onsa_danki").setCreativeTab(Tabs.tabhibiki);
	public static Item henshin_onsa_eiki = new Item_ore().setUnlocalizedName("henshin_onsa_eiki").setCreativeTab(Tabs.tabhibiki);
	public static Item henshin_onsa_gouki = new Item_ore().setUnlocalizedName("henshin_onsa_gouki").setCreativeTab(Tabs.tabhibiki);
	public static Item henshin_onsa_kyoki = new Item_ore().setUnlocalizedName("henshin_onsa_kyoki").setCreativeTab(Tabs.tabhibiki);
	
	public static Item henshin_onsa_kabuki = new Item_ore().setUnlocalizedName("henshin_onsa_kabuki").setCreativeTab(Tabs.tabhibiki);
	public static Item henshin_onsa_touki = new Item_ore().setUnlocalizedName("henshin_onsa_touki").setCreativeTab(Tabs.tabhibiki);
	public static Item henshin_onsa_habataki = new Item_ore().setUnlocalizedName("henshin_onsa_habataki").setCreativeTab(Tabs.tabhibiki);
	public static Item henshin_onsa_kirameki = new Item_ore().setUnlocalizedName("henshin_onsa_kirameki").setCreativeTab(Tabs.tabhibiki);
	public static Item henshin_onsa_nishiki = new Item_ore().setUnlocalizedName("henshin_onsa_nishiki").setCreativeTab(Tabs.tabhibiki);
	
	public static Item henshin_onibue_ibuki = new Item_ore().setUnlocalizedName("henshin_onibue_ibuki").setCreativeTab(Tabs.tabhibiki);
	public static Item henshin_onibue_toki = new Item_ore().setUnlocalizedName("henshin_onibue_toki").setCreativeTab(Tabs.tabhibiki);
	public static Item henshin_onibue_shouki = new Item_ore().setUnlocalizedName("henshin_onibue_shouki").setCreativeTab(Tabs.tabhibiki);
	public static Item henshin_onibue_amaki = new Item_ore().setUnlocalizedName("henshin_onibue_amaki").setCreativeTab(Tabs.tabhibiki);
	public static Item henshin_onibue_fubuki = new Item_ore().setUnlocalizedName("henshin_onibue_fubuki").setCreativeTab(Tabs.tabhibiki);
	
	public static Item henshin_kigen_todoroki = new Item_ore().setUnlocalizedName("henshin_kigen_todoroki").setCreativeTab(Tabs.tabhibiki);
	public static Item henshin_kigen_zanki = new Item_ore().setUnlocalizedName("henshin_kigen_zanki").setCreativeTab(Tabs.tabhibiki);
	public static Item henshin_kigen_shuki = new Item_ore().setUnlocalizedName("henshin_kigen_shuki").setCreativeTab(Tabs.tabhibiki);
	public static Item henshin_kigen_banki = new Item_ore().setUnlocalizedName("henshin_kigen_banki").setCreativeTab(Tabs.tabhibiki);
	public static Item henshin_kigen_sabaki = new Item_ore().setUnlocalizedName("henshin_kigen_sabaki").setCreativeTab(Tabs.tabhibiki);
		
	//kabuto
	public static Item kabuto_kunai_gun = new Item_ore().setUnlocalizedName("kabuto_kunai_gun");	
	public static Item kabuto_kunai = new Item_swordgun(Tabs.den_denaxe,energy,kabuto_kunai_gun).setMaxStackSize(1).setUnlocalizedName("kabuto_kunai").setCreativeTab(Tabs.tabkabuto);
	public static Item kabuto_kunai_kunai = new ItemBaseSword(Tabs.den_denso).setMaxStackSize(1).setUnlocalizedName("kabuto_kunai_kunai").setCreativeTab(Tabs.tabkabuto);
	public static Item zect_mizer = new Item_fireballgun(ToolMaterial.WOOD,energy).setMaxStackSize(1).setUnlocalizedName("zect_mizer").setCreativeTab(Tabs.tabkabuto);
	public static Item perfect_zecter = new ItemBaseSword(Tabs.denkamen_sword).setMaxStackSize(1).setUnlocalizedName("perfect_zecter").setCreativeTab(Tabs.tabkabuto);
	
	public static Item drake_grip = new Item_gun(Tabs.den_dengu,energy).setMaxStackSize(1).setUnlocalizedName("drake_grip").setCreativeTab(Tabs.tabkabuto);
	
	public static Item sasword_yaiver = new ItemBaseSword(Tabs.den_denso).setMaxStackSize(1).setUnlocalizedName("sasword_yaiver").setCreativeTab(Tabs.tabkabuto);
	
	public static Item gatack_double_calibur = new ItemBaseSword(Tabs.den_denso).setMaxStackSize(1).setUnlocalizedName("gatack_double_calibur").setCreativeTab(Tabs.tabkabuto);
	public static Item gatack_double_calibur_twin = new ItemBaseSword(Tabs.den_denaxe).setMaxStackSize(1).setUnlocalizedName("gatack_double_calibur_twin").setCreativeTab(Tabs.tabkabuto);
	
	public static Item zect_kunai_gun = new Item_ore().setUnlocalizedName("zect_kunai_gun");	
	public static Item zect_kunai = new Item_swordgun(Tabs.den_denaxe,energy,zect_kunai_gun).setMaxStackSize(1).setUnlocalizedName("zect_kunai").setCreativeTab(Tabs.tabkabuto);
	public static Item zect_kunai_kunai = new ItemBaseSword(Tabs.den_denso).setMaxStackSize(1).setUnlocalizedName("zect_kunai_kunai").setCreativeTab(Tabs.tabkabuto);
	
	
	public static Item kabutohead = new item_kabutoarmor(ArmorMaterial.DIAMOND, 4, 0).setMaxStackSize(1).setUnlocalizedName("kabutohead").setCreativeTab(Tabs.tabkabuto);
	public static Item kabutotroso = new item_kabutoarmor2(ArmorMaterial.DIAMOND, 4, 1).setMaxStackSize(1).setUnlocalizedName("kabutotroso").setCreativeTab(Tabs.tabkabuto);
	public static Item kabutolegs = new item_kabutoarmor2(ArmorMaterial.DIAMOND, 4, 2).setMaxStackSize(1).setUnlocalizedName("kabutolegs").setCreativeTab(Tabs.tabkabuto);

	public static Item kabuto_rider_belt_cast = new Item_ore().setUnlocalizedName("kabuto_rider_belt_cast");
	public static Item kabuto_rider_belt = new item_kabutodriver(ArmorMaterial.DIAMOND, 4, 3, "kabuto").setMaxStackSize(1).setUnlocalizedName("kabuto_rider_belt").setCreativeTab(Tabs.tabkabuto);
	
	public static Item gatack_rider_belt_cast = new Item_ore().setUnlocalizedName("gatack_rider_belt_cast");
	public static Item gatack_rider_belt = new item_kabutodriver(ArmorMaterial.DIAMOND, 4, 3, "gatack").setMaxStackSize(1).setUnlocalizedName("gatack_rider_belt").setCreativeTab(Tabs.tabkabuto);
	
	public static Item thebee_rider_belt_cast = new Item_ore().setUnlocalizedName("thebee_rider_belt_cast");
	public static Item thebee_rider_belt = new item_kabutodriver(ArmorMaterial.DIAMOND, 4, 3, "thebee").setMaxStackSize(1).setUnlocalizedName("thebee_rider_belt").setCreativeTab(Tabs.tabkabuto);
	
	public static Item drake_rider_belt_cast = new Item_ore().setUnlocalizedName("drake_rider_belt_cast");
	public static Item drake_rider_belt = new item_kabutodriver(ArmorMaterial.DIAMOND, 4, 3, "drake").setMaxStackSize(1).setUnlocalizedName("drake_rider_belt").setCreativeTab(Tabs.tabkabuto);
	
	public static Item sasword_rider_belt_cast = new Item_ore().setUnlocalizedName("sasword_rider_belt_cast");
	public static Item sasword_rider_belt = new item_kabutodriver(ArmorMaterial.DIAMOND, 4, 3, "sasword").setMaxStackSize(1).setUnlocalizedName("sasword_rider_belt").setCreativeTab(Tabs.tabkabuto);
	
	public static Item kickhopper_rider_belt_cast = new Item_ore().setUnlocalizedName("kickhopper_rider_belt_cast");
	public static Item kickhopper_rider_belt = new item_kabutodriver(ArmorMaterial.DIAMOND, 4, 3, "kickhopper").setMaxStackSize(1).setUnlocalizedName("kickhopper_rider_belt").setCreativeTab(Tabs.tabkabuto);
	
	public static Item puchhopper_rider_belt_cast = new Item_ore().setUnlocalizedName("puchhopper_rider_belt_cast");
	public static Item puchhopper_rider_belt = new item_kabutodriver(ArmorMaterial.DIAMOND, 4, 3, "puchhopper").setMaxStackSize(1).setUnlocalizedName("puchhopper_rider_belt").setCreativeTab(Tabs.tabkabuto);
	
	public static Item dark_kabuto_rider_belt_cast = new Item_ore().setUnlocalizedName("dark_kabuto_rider_belt_cast");
	public static Item dark_kabuto_rider_belt = new item_kabutodriver(ArmorMaterial.DIAMOND, 4, 3, "dark_kabuto").setMaxStackSize(1).setUnlocalizedName("dark_kabuto_rider_belt").setCreativeTab(Tabs.tabkabuto);
	
	public static Item caucasus_rider_belt_cast = new Item_ore().setUnlocalizedName("caucasus_rider_belt_cast");
	public static Item caucasus_rider_belt = new item_kabutodriver(ArmorMaterial.DIAMOND, 4, 3, "caucasus").setMaxStackSize(1).setUnlocalizedName("caucasus_rider_belt").setCreativeTab(Tabs.tabkabuto);
	
	public static Item hercus_rider_belt_cast = new Item_ore().setUnlocalizedName("hercus_rider_belt_cast");
	public static Item hercus_rider_belt = new item_kabutodriver(ArmorMaterial.DIAMOND, 4, 3, "hercus").setMaxStackSize(1).setUnlocalizedName("hercus_rider_belt").setCreativeTab(Tabs.tabkabuto);
	
	public static Item ketaros_rider_belt_cast = new Item_ore().setUnlocalizedName("ketaros_belt_cast");
	public static Item ketaros_rider_belt = new item_kabutodriver(ArmorMaterial.DIAMOND, 4, 3, "ketaros").setMaxStackSize(1).setUnlocalizedName("ketaros_rider_belt").setCreativeTab(Tabs.tabkabuto);
	
	
	public static Item kabuto_zecter = new Item_zecter("kabuto").setUnlocalizedName("kabuto_zecter").setCreativeTab(Tabs.tabkabuto);
	public static Item hyper_zecter = new Item_zecter("hyper").setUnlocalizedName("hyper_zecter").setCreativeTab(Tabs.tabkabuto);
	
	public static Item thebee_zecter = new Item_zecter("thebee").setUnlocalizedName("thebee_zecter").setCreativeTab(Tabs.tabkabuto);
	
	public static Item drake_zecter = new Item_zecter("drake").setUnlocalizedName("drake_zecter").setCreativeTab(Tabs.tabkabuto);
	
	public static Item sasword_zecter = new Item_zecter("sasword").setUnlocalizedName("sasword_zecter").setCreativeTab(Tabs.tabkabuto);
	
	public static Item gatack_zecter = new Item_zecter("gatack").setUnlocalizedName("gatack_zecter").setCreativeTab(Tabs.tabkabuto);
	
	public static Item kickhopper_zecter = new Item_ore().setUnlocalizedName("kickhopper_zecter").setCreativeTab(Tabs.tabkabuto);
	public static Item punchhopper_zecter = new Item_ore().setUnlocalizedName("punchhopper_zecter").setCreativeTab(Tabs.tabkabuto);
	
	public static Item dark_kabuto_zecter = new Item_zecter("dark_kabuto").setUnlocalizedName("dark_kabuto_zecter").setCreativeTab(Tabs.tabkabuto);
	
	public static Item caucasus_zecter = new Item_ore().setUnlocalizedName("caucasus_zecter").setCreativeTab(Tabs.tabkabuto);
	public static Item hercus_zecter = new Item_ore().setUnlocalizedName("hercus_zecter").setCreativeTab(Tabs.tabkabuto);
	public static Item ketaros_zecter = new Item_ore().setUnlocalizedName("ketaros_zecter").setCreativeTab(Tabs.tabkabuto);
	
	public static Item perfectthebee_zecter = new Item_ore().setUnlocalizedName("perfectthebee_zecter").setCreativeTab(Tabs.tabkabuto);
	public static Item perfectdrake_zecter = new Item_ore().setUnlocalizedName("perfectdrake_zecter").setCreativeTab(Tabs.tabkabuto);
	public static Item perfectsasword_zecter = new Item_ore().setUnlocalizedName("perfectsasword_zecter").setCreativeTab(Tabs.tabkabuto);
	
	public static Item clock_up_pad = new Item_clock_up_pad().setUnlocalizedName("clock_up_pad").setCreativeTab(Tabs.tabkabuto);
	
			//den_o
	public static Item den_denso = new ItemBaseSword(Tabs.den_denso).setMaxStackSize(1).setUnlocalizedName("den_denso").setCreativeTab(Tabs.tabden_o);
	public static Item den_denro = new ItemBaseSword(Tabs.den_denro).setMaxStackSize(1).setUnlocalizedName("den_denro").setCreativeTab(Tabs.tabden_o);
	public static Item den_denaxe = new ItemBaseSword(Tabs.den_denaxe).setMaxStackSize(1).setUnlocalizedName("den_denaxe").setCreativeTab(Tabs.tabden_o);
	public static Item den_dengu = new Item_gun(Tabs.den_dengu,energy).setMaxStackSize(1).setUnlocalizedName("den_dengu").setCreativeTab(Tabs.tabden_o);
	public static Item denkamen_sword = new Itemdenkamen_sword(Tabs.denkamen_sword).setMaxStackSize(1).setUnlocalizedName("denkamen_sword").setCreativeTab(Tabs.tabden_o);
	public static Item den_denhandaxe = new ItemBaseSword(Tabs.den_denhandaxe).setMaxStackSize(1).setUnlocalizedName("den_denhandaxe").setCreativeTab(Tabs.tabden_o);
	public static Item den_denboomerang = new ItemBaseSword(Tabs.den_denboomerang).setMaxStackSize(1).setUnlocalizedName("den_denboomerang").setCreativeTab(Tabs.tabden_o);
	public static Item den_denhijack = new ItemBaseSword(Tabs.den_denhijack).setMaxStackSize(1).setUnlocalizedName("den_denhijack").setCreativeTab(Tabs.tabden_o);
	public static Item momotaken = new ItemBaseSword(Tabs.momotaken).setMaxStackSize(1).setUnlocalizedName("momotaken").setCreativeTab(Tabs.tabden_o);
	public static Item uratazao = new ItemBaseSword(Tabs.uratazao).setMaxStackSize(1).setUnlocalizedName("uratazao").setCreativeTab(Tabs.tabden_o);
	public static Item kintaono = new ItemBaseSword(Tabs.kintaono).setMaxStackSize(1).setUnlocalizedName("kintaono").setCreativeTab(Tabs.tabden_o);
	public static Item gden_denjutte = new ItemBaseSword(Tabs.gden_denjutte).setMaxStackSize(1).setUnlocalizedName("gden_denjutte").setCreativeTab(Tabs.tabden_o);
	public static Item macheteddy = new ItemBaseSword(Tabs.macheteddy).setMaxStackSize(1).setUnlocalizedName("macheteddy").setCreativeTab(Tabs.tabden_o);
	public static Item gden_dengu = new Item_gun(Tabs.gden_dengu,imaginsand).setMaxStackSize(1).setUnlocalizedName("gden_dengu").setCreativeTab(Tabs.tabden_o);

	public static Item nega_den_gasher = new ItemBaseSword(Tabs.nega_den_gasher).setMaxStackSize(1).setUnlocalizedName("nega_den_gasher").setCreativeTab(Tabs.tabden_o);
	public static Item gaoh_gasher = new ItemBaseSword(Tabs.gaoh_gasher).setMaxStackSize(1).setUnlocalizedName("gaoh_gasher").setCreativeTab(Tabs.tabden_o);
	public static Item den_gasher_vega = new ItemBaseSword(Tabs.den_gasher_vega).setMaxStackSize(1).setUnlocalizedName("den_gasher_vega").setCreativeTab(Tabs.tabden_o);

	public static Item zerogasher_big  = new Item_ore().setUnlocalizedName("zerogasher_big");
	public static Item zerogasher = new Item_2nd_sword_im(Tabs.zerogasher,zerogasher_big).setMaxStackSize(1).setUnlocalizedName("zerogasher").setCreativeTab(Tabs.tabden_o);
	
	public static Item den_ohead = new item_den_oarmor(ArmorMaterial.DIAMOND, 4, 0).setMaxStackSize(1).setUnlocalizedName("den_ohead").setCreativeTab(Tabs.tabden_o);
	public static Item den_otroso = new item_den_oarmor2(ArmorMaterial.DIAMOND, 4, 1).setMaxStackSize(1).setUnlocalizedName("den_otroso").setCreativeTab(Tabs.tabden_o);
	public static Item den_olegs = new item_den_oarmor2(ArmorMaterial.DIAMOND, 4, 2).setMaxStackSize(1).setUnlocalizedName("den_olegs").setCreativeTab(Tabs.tabden_o);

	public static Item den_odriver_bl = new Item_ore().setUnlocalizedName("den_odriver_bl");	
	public static Item den_odriverrod = new Item_ore().setUnlocalizedName("den_odriverrod");
	public static Item den_odriveraxe = new Item_ore().setUnlocalizedName("den_obdriveraxe");
	public static Item den_odrivergun = new Item_ore().setUnlocalizedName("den_odrivergun");
	public static Item den_odriverwing = new Item_ore().setUnlocalizedName("den_odriverwing");
	public static Item den_obeltclimax = new Item_ore().setUnlocalizedName("den_obeltclimax");
			
	public static Item den_odriver = new item_den_odriver(ArmorMaterial.DIAMOND, 4, 3).setMaxStackSize(1).setUnlocalizedName("den_odriver").setCreativeTab(Tabs.tabden_o);
	
	
	public static Item zeronosbelt_p = new Item_ore().setUnlocalizedName("zeronosbelt_p");	
	public static Item zeronosbelt_v = new Item_ore().setUnlocalizedName("zeronosbelt_v");
	public static Item zeronosbelt_z = new Item_ore().setUnlocalizedName("zeronosbelt_z");
			
	public static Item zeronosbelt = new item_den_odriver(ArmorMaterial.DIAMOND, 4, 3).setMaxStackSize(1).setUnlocalizedName("zeronosbelt").setCreativeTab(Tabs.tabden_o);
	
	public static Item newden_obelt = new item_den_odriver(ArmorMaterial.DIAMOND, 4, 3).setMaxStackSize(1).setUnlocalizedName("newden_obelt").setCreativeTab(Tabs.tabden_o);
	public static Item newden_obeltvega = new Item_ore().setUnlocalizedName("newden_obeltvega");
	public static Item newden_obeltbl = new Item_ore().setUnlocalizedName("newden_obeltbl");
	
	public static Item nega_den_odriver = new item_den_odriver(ArmorMaterial.DIAMOND, 4, 3).setMaxStackSize(1).setUnlocalizedName("nega_den_odriver").setCreativeTab(Tabs.tabden_o);
	public static Item gaohbelt = new item_den_odriver(ArmorMaterial.DIAMOND, 4, 3).setMaxStackSize(1).setUnlocalizedName("gaohbelt").setCreativeTab(Tabs.tabden_o);
	public static Item yuukibelt_skull = new item_den_odriver(ArmorMaterial.DIAMOND, 4, 3).setMaxStackSize(1).setUnlocalizedName("yuukibelt_skull").setCreativeTab(Tabs.tabden_o);
	public static Item yuukibelt_hijack = new item_den_odriver(ArmorMaterial.DIAMOND, 4, 3).setMaxStackSize(1).setUnlocalizedName("yuukibelt_hijack").setCreativeTab(Tabs.tabden_o);
		
	public static Item gden_odriver = new item_den_odriver(ArmorMaterial.DIAMOND, 4, 3).setMaxStackSize(1).setUnlocalizedName("gden_odriver").setCreativeTab(Tabs.tabden_o);
	
	public static Item den_oriderpass = new Item_den_oriderpass().setMaxStackSize(1).setUnlocalizedName("den_oriderpass").setCreativeTab(Tabs.tabden_o);
	public static Item den_o_master_pass = new Item_den_oriderpass().setMaxStackSize(1).setUnlocalizedName("den_o_master_pass").setCreativeTab(Tabs.tabden_o);
	public static Item gden_oriderpass = new Item_den_oriderpass().setMaxStackSize(1).setUnlocalizedName("gden_oriderpass").setCreativeTab(Tabs.tabden_o);

	public static Item rider_ticket = new Itemrider_ticket(0,0).setUnlocalizedName("rider_ticket").setCreativeTab(Tabs.tabden_o);
	public static Item rider_ticket_sword = new Itemrider_ticket(1,0).setUnlocalizedName("rider_ticket_sword").setCreativeTab(Tabs.tabden_o);
	public static Item rider_ticket_rod = new Itemrider_ticket(2,0).setUnlocalizedName("rider_ticket_rod").setCreativeTab(Tabs.tabden_o);
	public static Item rider_ticket_ax = new Itemrider_ticket(3,0).setUnlocalizedName("rider_ticket_ax").setCreativeTab(Tabs.tabden_o);
	public static Item rider_ticket_gun = new Itemrider_ticket(4,0).setUnlocalizedName("rider_ticket_gun").setCreativeTab(Tabs.tabden_o);
	public static Item rider_ticket_wing = new Itemrider_ticket(5,0).setUnlocalizedName("rider_ticket_wing").setCreativeTab(Tabs.tabden_o);
	public static Item rider_ticket_nega = new Itemrider_ticket(5,0).setUnlocalizedName("rider_ticket_nega").setCreativeTab(Tabs.tabden_o);
	public static Item rider_ticket_yuuki = new Itemrider_ticket(5,0).setUnlocalizedName("rider_ticket_yuuki").setCreativeTab(Tabs.tabden_o);
	public static Item rider_ticket_g = new Itemrider_ticket(5,0).setUnlocalizedName("rider_ticket_g").setCreativeTab(Tabs.tabden_o);
	public static Item rider_ticket_gaoh = new Itemrider_ticket(5,0).setUnlocalizedName("rider_ticket_gaoh").setCreativeTab(Tabs.tabden_o);
	public static Item ktaros = new Itemrider_ticket(6,0).setUnlocalizedName("ktaros").setCreativeTab(Tabs.tabden_o);
	
	public static Item zeronos_plat_card = new Itemrider_ticket(0,1).setUnlocalizedName("zeronos_plat_card").setCreativeTab(Tabs.tabden_o);
	public static Item zeronos_altair_card = new Itemrider_ticket(1,1).setUnlocalizedName("zeronos_altair_card").setCreativeTab(Tabs.tabden_o);
	public static Item zeronos_vega_card = new Itemrider_ticket(2,1).setUnlocalizedName("zeronos_vega_card").setCreativeTab(Tabs.tabden_o);
	public static Item zeronos_zero_card = new Itemrider_ticket(3,1).setUnlocalizedName("zeronos_zero_card").setCreativeTab(Tabs.tabden_o);
	
	
			//kiva	
	public static Item garulu_saber = new ItemBaseSword(Tabs.garulu_saber).setMaxStackSize(1).setUnlocalizedName("garulu_saber").setCreativeTab(Tabs.tabkiva);
	public static Item basshaamagnum = new Item_gun(Tabs.bashaamagnum,RiderItems.energy).setMaxStackSize(1).setUnlocalizedName("basshaamagnum").setCreativeTab(Tabs.tabkiva);
	public static Item dogga_hammer = new ItemBaseSword(Tabs.dogga_hammer).setMaxStackSize(1).setUnlocalizedName("dogga_hammer").setCreativeTab(Tabs.tabkiva);
	
	public static Item ixa_caliber_gun = new Item_ore().setUnlocalizedName("ixa_caliber_gun");	
	public static Item ixa_caliber = new Item_swordgun(Tabs.garulu_saber,RiderItems.energy, ixa_caliber_gun).setMaxStackSize(1).setUnlocalizedName("ixa_caliber").setCreativeTab(Tabs.tabkiva);
	
	public static Item ixariser = new Item_gun(Tabs.bashaamagnum,RiderItems.energy).setMaxStackSize(1).setUnlocalizedName("ixariser").setCreativeTab(Tabs.tabkiva);
	
	public static Item jacorder_big  = new Item_ore().setUnlocalizedName("jacorder_big");
	public static Item jacorder = new Item_2nd_sword_im(Tabs.jacorder,jacorder_big).setMaxStackSize(1).setUnlocalizedName("jacorder").setCreativeTab(Tabs.tabkiva);
			
	public static Item zanbatsword_charge = new Item_ore().setUnlocalizedName("zanbatsword_charge");	
	public static Item zanbatsword = new ItemChargeSword(Tabs.zanbatsword,fuestle, zanbatsword_charge).setMaxStackSize(1).setUnlocalizedName("zanbatsword").setCreativeTab(Tabs.tabkiva);
	public static Item zanbatsword_core = new ItemBaseSword(Tabs.zanbatsword_core).setMaxStackSize(1).setUnlocalizedName("zanbatsword_core").setCreativeTab(Tabs.tabkiva);

	public static Item kivahead = new item_kivaarmor(ArmorMaterial.DIAMOND, 4, 0).setMaxStackSize(1).setUnlocalizedName("kivahead").setCreativeTab(Tabs.tabkiva);
	public static Item kivatroso = new item_kivaarmor2(ArmorMaterial.DIAMOND, 4, 1).setMaxStackSize(1).setUnlocalizedName("kivatroso").setCreativeTab(Tabs.tabkiva);
	public static Item kivalegs = new item_kivaarmor2(ArmorMaterial.DIAMOND, 4, 2).setMaxStackSize(1).setUnlocalizedName("kivalegs").setCreativeTab(Tabs.tabkiva);

	public static Item kivadriver_garulu = new Item_ore().setUnlocalizedName("kivadriver_garulu");
	public static Item kivadriver_basshaa = new Item_ore().setUnlocalizedName("kivadriver_basshaa");
	public static Item kivadriver_dogga = new Item_ore().setUnlocalizedName("kivadriver_dogga");
	public static Item kivadriver_emperor = new Item_ore().setUnlocalizedName("kivadriver_emperor");
	public static Item kivadriver = new item_kivadriver(ArmorMaterial.DIAMOND, 4, 3).setMaxStackSize(1).setUnlocalizedName("kivadriver").setCreativeTab(Tabs.tabkiva);
	public static Item ixa_belt = new item_kivadriver(ArmorMaterial.DIAMOND, 4, 3).setMaxStackSize(1).setUnlocalizedName("ixa_belt").setCreativeTab(Tabs.tabkiva);
	public static Item sagarc_belt = new item_kivadriver(ArmorMaterial.DIAMOND, 4, 3).setMaxStackSize(1).setUnlocalizedName("sagarc_belt").setCreativeTab(Tabs.tabkiva);
	public static Item darkkivadriver = new item_kivadriver(ArmorMaterial.DIAMOND, 4, 3).setMaxStackSize(1).setUnlocalizedName("darkkivadriver").setCreativeTab(Tabs.tabkiva);
	public static Item newkivadriver = new item_kivadriver(ArmorMaterial.DIAMOND, 4, 3).setMaxStackSize(1).setUnlocalizedName("newkivadriver").setCreativeTab(Tabs.tabkiva);
	
	public static Item arcdriver = new item_kivadriver(ArmorMaterial.DIAMOND, 4, 3).setMaxStackSize(1).setUnlocalizedName("arcdriver").setCreativeTab(Tabs.tabkiva);
	public static Item reydriver = new item_kivadriver(ArmorMaterial.DIAMOND, 4, 3).setMaxStackSize(1).setUnlocalizedName("reydriver").setCreativeTab(Tabs.tabkiva);

	public static Item wakeupfuestle = new Itemfuestle(0,0).setUnlocalizedName("wakeupfuestle").setCreativeTab(Tabs.tabkiva);
	public static Item garulufuestle = new Itemfuestle(0,1).setUnlocalizedName("garulufuestle").setCreativeTab(Tabs.tabkiva);
	public static Item basshaafuestle = new Itemfuestle(0,2).setUnlocalizedName("basshaafuestle").setCreativeTab(Tabs.tabkiva);
	public static Item doggafuestle = new Itemfuestle(0,3).setUnlocalizedName("doggafuestle").setCreativeTab(Tabs.tabkiva);
	
	public static Item knucklefuestle = new Itemfuestle(1,1).setUnlocalizedName("knucklefuestle").setCreativeTab(Tabs.tabkiva);
	public static Item risingfuestle = new Itemfuestle(1,2).setUnlocalizedName("risingfuestle").setCreativeTab(Tabs.tabkiva);
	
	public static Item sagafuestle = new Item_ore().setUnlocalizedName("sagafuestle").setCreativeTab(Tabs.tabkiva);
	
	public static Item keyfuestle = new Item_ore().setUnlocalizedName("keyfuestle").setCreativeTab(Tabs.tabkiva);
	
	public static Item darkwakeupfuestle = new Item_ore().setUnlocalizedName("darkwakeupfuestle").setCreativeTab(Tabs.tabkiva);
	public static Item newwakeupfuestle = new Item_ore().setUnlocalizedName("newwakeupfuestle").setCreativeTab(Tabs.tabkiva);

	public static Item tatsulot = new Itemfuestle(0,5).setUnlocalizedName("tatsulot").setCreativeTab(Tabs.tabkiva);

	//decade
	public static Item ride_booker_gun = new Item_ore().setUnlocalizedName("ride_booker_gun");	
	public static Item ride_booker = new Item_swordgun(ToolMaterial.EMERALD,RiderItems.energy, ride_booker_gun).setMaxStackSize(1).setUnlocalizedName("ride_booker").setCreativeTab(Tabs.tabdecade);
	public static Item diend_driver = new Item_gun(Tabs.den_dengu,RiderItems.energy).setMaxStackSize(1).setUnlocalizedName("diend_driver").setCreativeTab(Tabs.tabdecade);
	
	public static Item ongekibo_rekka_decade = new ItemBaseSword(Tabs.ongekibo).setMaxStackSize(1).setUnlocalizedName("ongekibo_rekka_decade").setCreativeTab(Tabs.tabdecade);
	public static Item ongekibo_rekka_diend = new ItemBaseSword(Tabs.ongekibo).setMaxStackSize(1).setUnlocalizedName("ongekibo_rekka_diend").setCreativeTab(Tabs.tabdecade);
	
	public static Item decadehead = new item_decadearmor(ArmorMaterial.DIAMOND, 4, 0).setMaxStackSize(1).setUnlocalizedName("decadehead").setCreativeTab(Tabs.tabdecade);
	public static Item decadetroso = new item_decadearmor2(ArmorMaterial.DIAMOND, 4, 1).setMaxStackSize(1).setUnlocalizedName("decadetroso").setCreativeTab(Tabs.tabdecade);
	public static Item decadelegs = new item_decadearmor2(ArmorMaterial.DIAMOND, 4, 2).setMaxStackSize(1).setUnlocalizedName("decadelegs").setCreativeTab(Tabs.tabdecade);

	public static Item decadedriver = new item_decadedriver(ArmorMaterial.DIAMOND, 4, 3).setMaxStackSize(1).setUnlocalizedName("decadedriver").setCreativeTab(Tabs.tabdecade);
	public static Item dienddriver = new item_decadedriver(ArmorMaterial.DIAMOND, 4, 3).setMaxStackSize(1).setUnlocalizedName("dienddriver").setCreativeTab(Tabs.tabdecade);
	public static Item dark_decadedriver = new item_decadedriver(ArmorMaterial.DIAMOND, 4, 3).setMaxStackSize(1).setUnlocalizedName("dark_decadedriver").setCreativeTab(Tabs.tabdecade);
	
	public static Item decadecard = new Itemrider_cards(0,0).setUnlocalizedName("decadecard").setCreativeTab(Tabs.tabdecade);
	public static Item k_touch = new Itemrider_cards(0,1).setUnlocalizedName("k_touch").setCreativeTab(Tabs.tabdecade);
	public static Item decadecard_violent_emotion = new Itemrider_cards(0,2).setUnlocalizedName("decadecard_violent_emotion").setCreativeTab(Tabs.tabdecade);
	
	public static Item darkdecadecard = new Item_ore().setUnlocalizedName("darkdecadecard").setCreativeTab(Tabs.tabdecade);
	
	public static Item kivacard = new Itemrider_cards(1,0).setUnlocalizedName("kivacard").setCreativeTab(Tabs.tabdecade);
	public static Item den_ocard = new Itemrider_cards(2,1).setUnlocalizedName("den_ocard").setCreativeTab(Tabs.tabdecade);
	public static Item kabutocard = new Itemrider_cards(3,0).setUnlocalizedName("kabutocard").setCreativeTab(Tabs.tabdecade);
	public static Item hibikicard = new Itemrider_cards(4,0).setUnlocalizedName("hibikicard").setCreativeTab(Tabs.tabdecade);
	public static Item bladecard_de = new Itemrider_cards(5,0).setUnlocalizedName("bladecard_de").setCreativeTab(Tabs.tabdecade);
			
	public static Item faizcard = new Itemrider_cards(6,0).setUnlocalizedName("faizcard").setCreativeTab(Tabs.tabdecade);
	public static Item ryukicard = new Itemrider_cards(7,0).setUnlocalizedName("ryukicard").setCreativeTab(Tabs.tabdecade);
	public static Item agitocard = new Itemrider_cards(8,0).setUnlocalizedName("agitocard").setCreativeTab(Tabs.tabdecade);
	public static Item kuugacard = new Itemrider_cards(9,1).setUnlocalizedName("kuugacard").setCreativeTab(Tabs.tabdecade);
			
	
	public static Item k_touch_diend = new Itemrider_cards(0,1).setUnlocalizedName("k_touch_diend").setCreativeTab(Tabs.tabdecade);
		
	public static Item garulu_kivacard = new Itemrider_cards(1,1).setUnlocalizedName("garulu_kivacard").setCreativeTab(Tabs.tabdecade);
	public static Item basshaa_kivacard = new Itemrider_cards(1,2).setUnlocalizedName("basshaa_kivacard").setCreativeTab(Tabs.tabdecade);
	public static Item dogga_kivacard = new Itemrider_cards(1,3).setUnlocalizedName("dogga_kivacard").setCreativeTab(Tabs.tabdecade);
			
	public static Item rod_den_ocard = new Itemrider_cards(2,2).setUnlocalizedName("rod_den_ocard").setCreativeTab(Tabs.tabdecade);
	public static Item axe_den_ocard = new Itemrider_cards(2,3).setUnlocalizedName("axe_den_ocard").setCreativeTab(Tabs.tabdecade);
	public static Item gun_den_ocard = new Itemrider_cards(2,4).setUnlocalizedName("gun_den_ocard").setCreativeTab(Tabs.tabdecade);
	public static Item wing_den_ocard = new Itemrider_cards(2,5).setUnlocalizedName("wing_den_ocard").setCreativeTab(Tabs.tabdecade);

	public static Item axel_faizcard = new Itemrider_cards(6,1).setUnlocalizedName("axel_faizcard").setCreativeTab(Tabs.tabdecade);
			
	public static Item flame_agitocard= new Itemrider_cards(8,2).setUnlocalizedName("flame_agitocard").setCreativeTab(Tabs.tabdecade);
	public static Item storm_agitocard = new Itemrider_cards(8,1).setUnlocalizedName("storm_agitocard").setCreativeTab(Tabs.tabdecade);
			
	public static Item dragon_kuugacard= new Itemrider_cards(9,2).setUnlocalizedName("dragon_kuugacard").setCreativeTab(Tabs.tabdecade);
	public static Item pegasus_kuugacard = new Itemrider_cards(9,3).setUnlocalizedName("pegasus_kuugacard").setCreativeTab(Tabs.tabdecade);
	public static Item titan_kuugacard = new Itemrider_cards(9,4).setUnlocalizedName("titan_kuugacard").setCreativeTab(Tabs.tabdecade);

	public static Item emperor_kivacard = new Item_ore().setUnlocalizedName("emperor_kivacard").setCreativeTab(Tabs.tabdecade);
	public static Item liner_den_ocard = new Item_ore().setUnlocalizedName("liner_den_ocard").setCreativeTab(Tabs.tabdecade);
	public static Item hyper_kabutocard = new Item_ore().setUnlocalizedName("hyper_kabutocard").setCreativeTab(Tabs.tabdecade);
	public static Item armed_hibikicard = new Item_ore().setUnlocalizedName("armed_hibikicard").setCreativeTab(Tabs.tabdecade);
	public static Item king_bladecard = new Item_ore().setUnlocalizedName("king_bladecard").setCreativeTab(Tabs.tabdecade);
	public static Item blaster_faizcard = new Item_ore().setUnlocalizedName("blaster_faizcard").setCreativeTab(Tabs.tabdecade);
	public static Item survive_ryukicard = new Item_ore().setUnlocalizedName("survive_ryukicard").setCreativeTab(Tabs.tabdecade);
	public static Item shining_agitocard = new Item_ore().setUnlocalizedName("shining_agitocard").setCreativeTab(Tabs.tabdecade);
	public static Item ultimate_kuugacard = new Item_ore().setUnlocalizedName("ultimate_kuugacard").setCreativeTab(Tabs.tabdecade);
	
	public static Item g4card = new Item_ore().setUnlocalizedName("g4card").setCreativeTab(Tabs.tabdecade);
	public static Item ryugacard = new Item_ore().setUnlocalizedName("ryugacard").setCreativeTab(Tabs.tabdecade);
	public static Item orgacard = new Item_ore().setUnlocalizedName("orgacard").setCreativeTab(Tabs.tabdecade);
	public static Item glaivecard = new Item_ore().setUnlocalizedName("glaivecard").setCreativeTab(Tabs.tabdecade);
	public static Item kabukicard = new Item_ore().setUnlocalizedName("kabukicard").setCreativeTab(Tabs.tabdecade);
	public static Item caucasuscard = new Item_ore().setUnlocalizedName("caucasuscard").setCreativeTab(Tabs.tabdecade);
	public static Item arccard = new Item_ore().setUnlocalizedName("arccard").setCreativeTab(Tabs.tabdecade);
	public static Item skullcard = new Item_ore().setUnlocalizedName("skullcard").setCreativeTab(Tabs.tabdecade);
	
	//W
	public static Item trigger_magnum = new Item_gun(Tabs.den_dengu,energy).setMaxStackSize(1).setUnlocalizedName("trigger_magnum").setCreativeTab(Tabs.tabW);
	public static Item metal_shaft_l = new Item_ore().setUnlocalizedName("metal_shaft_l");	
	public static Item metal_shaft = new Item_metal_shaft(Tabs.den_denro).setMaxStackSize(1).setUnlocalizedName("metal_shaft").setCreativeTab(Tabs.tabW);
	public static Item prism_bicker_charge = new Item_ore().setUnlocalizedName("prism_bicker_charge");
	public static Item prism_bicker = new ItemChargeSword(Tabs.denkamen_sword,gaiamemory,prism_bicker_charge).setMaxStackSize(1).setUnlocalizedName("prism_bicker").setCreativeTab(Tabs.tabW);
	public static Item eternal_edge = new ItemBaseSword(Tabs.den_denso).setMaxStackSize(1).setUnlocalizedName("eternal_edge").setCreativeTab(Tabs.tabW);
	public static Item skull_magnum = new Item_gun(Tabs.den_dengu,energy).setMaxStackSize(1).setUnlocalizedName("skull_magnum").setCreativeTab(Tabs.tabW);
	public static Item engine_blade = new ItemBaseSword(Tabs.den_denso).setMaxStackSize(1).setUnlocalizedName("engine_blade").setCreativeTab(Tabs.tabW);

	public static Item Whead = new item_warmor2(ArmorMaterial.DIAMOND, 4, 0).setMaxStackSize(1).setUnlocalizedName("whead").setCreativeTab(Tabs.tabW);
	public static Item Wtroso = new item_Warmor(ArmorMaterial.DIAMOND, 4, 1).setMaxStackSize(1).setUnlocalizedName("wtroso").setCreativeTab(Tabs.tabW);
	public static Item Wlegs = new item_warmor2(ArmorMaterial.DIAMOND, 4, 2).setMaxStackSize(1).setUnlocalizedName("wlegs").setCreativeTab(Tabs.tabW);

	public static Item Wdriver = new item_Wdriver(ArmorMaterial.DIAMOND, 4, 3).setMaxStackSize(1).setUnlocalizedName("wdriver").setCreativeTab(Tabs.tabW);
	
	public static Item wdriverj = new Item_ore().setUnlocalizedName("wdriverj");
	public static Item wdriverc = new Item_ore().setUnlocalizedName("wdriverc");
	public static Item wdrivert = new Item_ore().setUnlocalizedName("wdrivert");
	public static Item wdriverh = new Item_ore().setUnlocalizedName("wdriverh");
	public static Item wdriverm = new Item_ore().setUnlocalizedName("wdriverm");
	public static Item wdriverl = new Item_ore().setUnlocalizedName("wdriverl");
	public static Item wdriverx = new Item_ore().setUnlocalizedName("wdriverx");
	public static Item wdriverjj = new Item_ore().setUnlocalizedName("wdriverjj");
	public static Item wdrivercc = new Item_ore().setUnlocalizedName("wdrivercc");
	public static Item wdriverf = new Item_ore().setUnlocalizedName("wdriverf");
	public static Item wdriversh = new Item_ore().setUnlocalizedName("wdriversh");
	public static Item wdriverki = new Item_ore().setUnlocalizedName("wdriverki");
	
	public static Item accel_driverb = new Item_ore().setUnlocalizedName("accel_driverb");
	public static Item accel_drivert = new Item_ore().setUnlocalizedName("accel_drivert");
	
	public static Item lostdriverc = new Item_ore().setUnlocalizedName("lostdriverc");
	public static Item lostdrivere = new Item_ore().setUnlocalizedName("lostdrivere");
	public static Item lostdriverj = new Item_ore().setUnlocalizedName("lostdriverj");
	
	
	public static Item lostdriver = new item_Wdriver(ArmorMaterial.DIAMOND, 4, 3).setMaxStackSize(1).setUnlocalizedName("lostdriver").setCreativeTab(Tabs.tabW);

	public static Item accel_driver = new item_Wdriver(ArmorMaterial.DIAMOND, 4, 3).setMaxStackSize(1).setUnlocalizedName("accel_driver").setCreativeTab(Tabs.tabW);
	
	public static Item cyclone_memory = new Item_memory(0, "3").setUnlocalizedName("cyclone_memory").setCreativeTab(Tabs.tabW);
	public static Item heat_memory = new Item_memory(1, "3").setUnlocalizedName("heat_memory").setCreativeTab(Tabs.tabW);
	public static Item luna_memory = new Item_memory(2, "3").setUnlocalizedName("luna_memory").setCreativeTab(Tabs.tabW);
	public static Item fang_memory = new Item_memory(3, "3").setUnlocalizedName("fang_memory").setCreativeTab(Tabs.tabW);

	public static Item joker_memory = new Item_memory(0, "1").setUnlocalizedName("joker_memory").setCreativeTab(Tabs.tabW);
	public static Item metal_memory = new Item_memory(1, "1").setUnlocalizedName("metal_memory").setCreativeTab(Tabs.tabW);
	public static Item trigger_memory = new Item_memory(2, "1").setUnlocalizedName("trigger_memory").setCreativeTab(Tabs.tabW);

	public static Item xtreme_memory = new Item_memory(1, "2").setUnlocalizedName("xtreme_memory").setCreativeTab(Tabs.tabW);
	public static Item xtreme_gold_memory = new Item_memory(2, "2").setUnlocalizedName("xtreme_gold_memory").setCreativeTab(Tabs.tabW);
	public static Item xtreme_accel_memory = new Item_memory(3, "2").setUnlocalizedName("xtreme_accel_memory").setCreativeTab(Tabs.tabW);

	public static Item cyclonecyclone_memory = new Item_memory(3, "1").setUnlocalizedName("cyclonecyclone_memory").setCreativeTab(Tabs.tabW);
	public static Item jokerjoker_memory = new Item_memory(4, "3").setUnlocalizedName("jokerjoker_memory").setCreativeTab(Tabs.tabW);

	public static Item joker_t2_memory = new Item_memory(0, "4").setUnlocalizedName("joker_t2_memory").setCreativeTab(Tabs.tabW);
	public static Item skull_memory = new Item_memory(1, "4").setUnlocalizedName("skull_memory").setCreativeTab(Tabs.tabW);
	public static Item eternal_t2_memory = new Item_memory(2, "4").setUnlocalizedName("eternal_t2_memory").setCreativeTab(Tabs.tabW);
	public static Item eternal_memory = new Item_memory(3, "4").setUnlocalizedName("eternal_memory").setCreativeTab(Tabs.tabW);

	public static Item accel_memory = new Item_memory(0, "5").setUnlocalizedName("accel_memory").setCreativeTab(Tabs.tabW);
	public static Item trial_memory = new Item_memory(1, "5").setUnlocalizedName("trial_memory").setCreativeTab(Tabs.tabW);
	public static Item accel_booster_memory = new Item_memory(2, "5").setUnlocalizedName("accel_booster_memory").setCreativeTab(Tabs.tabW);
	
	public static Item prism_memory = new Item_ore().setUnlocalizedName("prism_memory").setCreativeTab(Tabs.tabW);
	public static Item engine_memory = new Item_ore().setUnlocalizedName("engine_memory").setCreativeTab(Tabs.tabW);
	
	public static Item shippu_memory = new Item_memory(0, "3").setUnlocalizedName("shippu_memory").setCreativeTab(Tabs.tabW);
	public static Item kirifuda_memory = new Item_memory(0, "1").setUnlocalizedName("kirifuda_memory").setCreativeTab(Tabs.tabW);

	//OOO
	public static Item medajalibur_charge = new Item_ore().setUnlocalizedName("medajalibur_charge");
	public static Item medajalibur = new ItemChargeSword(Tabs.medajalibur,cellmedal,medajalibur_charge).setMaxStackSize(1).setUnlocalizedName("medajalibur").setCreativeTab(Tabs.tabOOO);

	public static Item tajaspinner = new Item_tajaspinner(Tabs.tajaspinner).setMaxStackSize(1).setUnlocalizedName("tajaspinner").setCreativeTab(Tabs.tabOOO);
	
	public static Item medagaburyu_gun  = new Item_ore().setUnlocalizedName("medagaburyu_gun");
	public static Item medagaburyu = new Item_madagburyu(Tabs.medagaburyu).setMaxStackSize(1).setUnlocalizedName("medagaburyu").setCreativeTab(Tabs.tabOOO);
			
	 
	public static Item birth_buster = new Item_gun(Tabs.birth_buster, energy).setMaxStackSize(1).setUnlocalizedName("birth_buster").setCreativeTab(Tabs.tabOOO);
	public static Item deepest_harpoon = new ItemBaseSword(Tabs.medagaburyu).setMaxStackSize(1).setUnlocalizedName("deepest_harpoon").setCreativeTab(Tabs.tabOOO);
		
	public static Item OOOhead = new item_OOOarmor2(ArmorMaterial.DIAMOND, 4, 0).setMaxStackSize(1).setUnlocalizedName("ooohead").setCreativeTab(Tabs.tabOOO);
	public static Item OOOtroso = new item_OOOarmor(ArmorMaterial.DIAMOND, 4, 1).setMaxStackSize(1).setUnlocalizedName("oootroso").setCreativeTab(Tabs.tabOOO);
	public static Item OOOlegs = new item_OOOarmor(ArmorMaterial.DIAMOND, 4, 2).setMaxStackSize(1).setUnlocalizedName("ooolegs").setCreativeTab(Tabs.tabOOO);

	public static Item OOOdriver = new item_OOOdriver(ArmorMaterial.DIAMOND, 4, 3).setMaxStackSize(1).setUnlocalizedName("ooodriver").setCreativeTab(Tabs.tabOOO);
	public static Item birth_driver = new item_OOOdriver(ArmorMaterial.DIAMOND, 4, 3).setMaxStackSize(1).setUnlocalizedName("birth_driver").setCreativeTab(Tabs.tabOOO);
	public static Item birth_driver_prototype = new item_OOOdriver(ArmorMaterial.DIAMOND, 4, 3).setMaxStackSize(1).setUnlocalizedName("birth_driver_prototype").setCreativeTab(Tabs.tabOOO);

	public static Item poseidon_driver = new item_OOOdriver(ArmorMaterial.DIAMOND, 4, 3).setMaxStackSize(1).setUnlocalizedName("poseidon_driver").setCreativeTab(Tabs.tabOOO);
	public static Item aqua_driver = new item_OOOdriver(ArmorMaterial.DIAMOND, 4, 3).setMaxStackSize(1).setUnlocalizedName("aqua_driver").setCreativeTab(Tabs.tabOOO);

	public static Item o_scanner = new Itemo_scanner().setMaxStackSize(1).setUnlocalizedName("o_scanner").setCreativeTab(Tabs.tabOOO);

	public static Item taka = new Itemmedal(0, "1").setUnlocalizedName("taka").setCreativeTab(Tabs.tabOOO);
	public static Item kuwagata = new Itemmedal(1, "1").setUnlocalizedName("kuwagata").setCreativeTab(Tabs.tabOOO);
	public static Item lion = new Itemmedal(2, "1").setUnlocalizedName("lion").setCreativeTab(Tabs.tabOOO);
	public static Item  sai = new Itemmedal(3, "1").setUnlocalizedName("sai").setCreativeTab(Tabs.tabOOO);
	public static Item  shachi = new Itemmedal(4, "1").setUnlocalizedName("shachi").setCreativeTab(Tabs.tabOOO);
	public static Item  ptera = new Itemmedal(5, "1").setUnlocalizedName("ptera").setCreativeTab(Tabs.tabOOO);
	public static Item  cobra = new Itemmedal(6, "1").setUnlocalizedName("cobra").setCreativeTab(Tabs.tabOOO);
	public static Item  super_taka = new Itemmedal(7, "1").setUnlocalizedName("super_taka").setCreativeTab(Tabs.tabOOO);
	public static Item same = new Itemmedal(9, "1").setUnlocalizedName("same").setCreativeTab(Tabs.tabOOO);
	public static Item shika = new Itemmedal(10, "1").setUnlocalizedName("shika").setCreativeTab(Tabs.tabOOO);
	public static Item seiuchi = new Itemmedal(11, "1").setUnlocalizedName("seiuchi").setCreativeTab(Tabs.tabOOO);
	public static Item mukade = new Itemmedal(12, "1").setUnlocalizedName("mukade").setCreativeTab(Tabs.tabOOO);
	public static Item ebi_new = new Itemmedal(13, "1").setUnlocalizedName("ebi_new").setCreativeTab(Tabs.tabOOO);
	public static Item love_core = new Itemmedal(8, "1").setUnlocalizedName("love_core").setCreativeTab(Tabs.tabOOO);

	public static Item  tora = new Itemmedal(0, "2").setUnlocalizedName("tora").setCreativeTab(Tabs.tabOOO);
	public static Item  kamakiri = new Itemmedal(1, "2").setUnlocalizedName("kamakiri").setCreativeTab(Tabs.tabOOO);
	public static Item  gorilla = new Itemmedal(2, "2").setUnlocalizedName("gorilla").setCreativeTab(Tabs.tabOOO);
	public static Item  kujaku = new Itemmedal(3, "2").setUnlocalizedName("kujaku").setCreativeTab(Tabs.tabOOO);
	public static Item  unagi = new Itemmedal(4, "2").setUnlocalizedName("unagi").setCreativeTab(Tabs.tabOOO);
	public static Item  tricera = new Itemmedal(5, "2").setUnlocalizedName("tricera").setCreativeTab(Tabs.tabOOO);
	public static Item  kame = new Itemmedal(6, "2").setUnlocalizedName("kame").setCreativeTab(Tabs.tabOOO);
	public static Item  imagin = new Itemmedal(7, "2").setUnlocalizedName("imagin").setCreativeTab(Tabs.tabOOO);
	public static Item  panda = new Itemmedal(8, "2").setUnlocalizedName("panda").setCreativeTab(Tabs.tabOOO);
	public static Item  super_tora = new Itemmedal(9, "2").setUnlocalizedName("super_tora").setCreativeTab(Tabs.tabOOO);
	public static Item  kangaroo = new Itemmedal(10, "2").setUnlocalizedName("kangaroo").setCreativeTab(Tabs.tabOOO);
	public static Item  kujira = new Itemmedal(12, "2").setUnlocalizedName("kujira").setCreativeTab(Tabs.tabOOO);
	public static Item  gazelle = new Itemmedal(13, "2").setUnlocalizedName("gazelle").setCreativeTab(Tabs.tabOOO);
	public static Item  shirokuma = new Itemmedal(14, "2").setUnlocalizedName("shirokuma").setCreativeTab(Tabs.tabOOO);
	public static Item  hachi = new Itemmedal(15, "2").setUnlocalizedName("hachi").setCreativeTab(Tabs.tabOOO);
	public static Item  kani_new = new Itemmedal(16, "2").setUnlocalizedName("kani_new").setCreativeTab(Tabs.tabOOO);
	public static Item  love_core2 = new Itemmedal(11, "2").setUnlocalizedName("love_core2").setCreativeTab(Tabs.tabOOO);
	public static Item  yadokari = new Itemmedal(17, "2").setUnlocalizedName("yadokari").setCreativeTab(Tabs.tabOOO);

	public static Item batta = new Itemmedal(0, "3").setUnlocalizedName("batta").setCreativeTab(Tabs.tabOOO);
	public static Item cheetah = new Itemmedal(1, "3").setUnlocalizedName("cheetah").setCreativeTab(Tabs.tabOOO);
	public static Item zou = new Itemmedal(2, "3").setUnlocalizedName("zou").setCreativeTab(Tabs.tabOOO);
	public static Item condor = new Itemmedal(3, "3").setUnlocalizedName("condor").setCreativeTab(Tabs.tabOOO);
	public static Item tako = new Itemmedal(4, "3").setUnlocalizedName("tako").setCreativeTab(Tabs.tabOOO);
	public static Item tyranno = new Itemmedal(5, "3").setUnlocalizedName("tyranno").setCreativeTab(Tabs.tabOOO);
	public static Item wani = new Itemmedal(6, "3").setUnlocalizedName("wani").setCreativeTab(Tabs.tabOOO);
	public static Item shocker = new Itemmedal(7, "3").setUnlocalizedName("shocker").setCreativeTab(Tabs.tabOOO);
	public static Item super_batta = new Itemmedal(8, "3").setUnlocalizedName("super_batta").setCreativeTab(Tabs.tabOOO);
	public static Item kangaroo2 = new Itemmedal(9, "3").setUnlocalizedName("kangaroo2").setCreativeTab(Tabs.tabOOO);
	public static Item ookamiuo = new Itemmedal(11, "3").setUnlocalizedName("ookamiuo").setCreativeTab(Tabs.tabOOO);
	public static Item ushi = new Itemmedal(12, "3").setUnlocalizedName("ushi").setCreativeTab(Tabs.tabOOO);
	public static Item penguin = new Itemmedal(13, "3").setUnlocalizedName("penguin").setCreativeTab(Tabs.tabOOO);
	public static Item ari = new Itemmedal(14, "3").setUnlocalizedName("ari").setCreativeTab(Tabs.tabOOO);
	public static Item sasori_new = new Itemmedal(15, "3").setUnlocalizedName("sasori_new").setCreativeTab(Tabs.tabOOO);
	public static Item love_core3 = new Itemmedal(10, "3").setUnlocalizedName("love_core3").setCreativeTab(Tabs.tabOOO);
	
	public static Item sasori = new Item_ore().setUnlocalizedName("sasori").setCreativeTab(Tabs.tabOOO);
	public static Item kani = new Item_ore().setUnlocalizedName("kani").setCreativeTab(Tabs.tabOOO);
	public static Item ebi = new Item_ore().setUnlocalizedName("ebi").setCreativeTab(Tabs.tabOOO);

	
	public static Item proto_birth_core = new Item_ore().setUnlocalizedName("proto_birth_core").setCreativeTab(Tabs.tabOOO);
	
	//Fourze

		public static Item rocket = new Item_rocket(ToolMaterial.EMERALD).setMaxStackSize(1).setUnlocalizedName("rocket").setCreativeTab(Tabs.tabFourze);
		public static Item billytherod = new Item_billytherod(ToolMaterial.EMERALD).setMaxStackSize(1).setUnlocalizedName("billytherod").setCreativeTab(Tabs.tabFourze);
		public static Item hee_hackgun = new Item_hee_hackgun(ToolMaterial.EMERALD).setMaxStackSize(1).setUnlocalizedName("hee_hackgun").setCreativeTab(Tabs.tabFourze);
		public static Item barizun_sword_charge = new Item_ore().setUnlocalizedName("barizun_sword_charge");
		public static Item barizun_sword = new ItemChargeSword(ToolMaterial.EMERALD,astroswitch,barizun_sword_charge).setMaxStackSize(1).setUnlocalizedName("barizun_sword").setCreativeTab(Tabs.tabFourze);
		
		public static Item meteor_nadeshiko_fusion_rocket = new Item_rocket(ToolMaterial.EMERALD).setMaxStackSize(1).setUnlocalizedName("meteor_nadeshiko_fusion_rocket").setCreativeTab(Tabs.tabFourze);
		

		public static Item Fourzehead = new item_Fourzearmor(ArmorMaterial.DIAMOND, 4, 0).setMaxStackSize(1).setUnlocalizedName("fourzehead").setCreativeTab(Tabs.tabFourze);
		public static Item Fourzetroso = new item_Fourzearmor2(ArmorMaterial.DIAMOND, 4, 1).setMaxStackSize(1).setUnlocalizedName("fourzetroso").setCreativeTab(Tabs.tabFourze);
		public static Item Fourzelegs = new item_Fourzearmor2(ArmorMaterial.DIAMOND, 4, 2).setMaxStackSize(1).setUnlocalizedName("fourzelegs").setCreativeTab(Tabs.tabFourze);

		public static Item Fourzedriver = new item_Fourzedriver(ArmorMaterial.DIAMOND, 4, 3).setMaxStackSize(1).setUnlocalizedName("fourzedriver").setCreativeTab(Tabs.tabFourze);
		public static Item meteor_driver = new item_Fourzedriver(ArmorMaterial.DIAMOND, 4, 3).setMaxStackSize(1).setUnlocalizedName("meteor_driver").setCreativeTab(Tabs.tabFourze);
		public static Item nadeshikodriver = new item_Fourzedriver(ArmorMaterial.DIAMOND, 4, 3).setMaxStackSize(1).setUnlocalizedName("nadeshikodriver").setCreativeTab(Tabs.tabFourze);


		public static Item rocket_swich = new Item_astroswitch(0, "1","circle",1).setUnlocalizedName("rocket_swich").setCreativeTab(Tabs.tabFourze);
		public static Item launcher_switch = new Item_astroswitch(0,"0","cross",1).setUnlocalizedName("launcher_switch").setCreativeTab(Tabs.tabFourze);
		public static Item drill_switch = new Item_astroswitch(0, "0","triangle",1).setUnlocalizedName("drill_switch").setCreativeTab(Tabs.tabFourze);
		public static Item radar_switch = new Item_astroswitch(0, "0","square",1).setUnlocalizedName("radar_switch").setCreativeTab(Tabs.tabFourze);
		public static Item magic_hand_switch = new Item_astroswitch(0, "0","circle",2).setUnlocalizedName("magic_hand_switch").setCreativeTab(Tabs.tabFourze);
		public static Item camera_switch = new Item_astroswitch(0, "0","square",2).setUnlocalizedName("camera_switch").setCreativeTab(Tabs.tabFourze);
		public static Item parachute_switch = new Item_astroswitch(0, "0","square",3).setUnlocalizedName("parachute_switch").setCreativeTab(Tabs.tabFourze);
		public static Item chainsaw_switch = new Item_astroswitch(0,"0","cross",2).setUnlocalizedName("chainsaw_switch").setCreativeTab(Tabs.tabFourze);
		public static Item hopping_switch = new Item_astroswitch(0, "0","triangle",2).setUnlocalizedName("hopping_switch").setCreativeTab(Tabs.tabFourze);
		
		public static Item elek_swich = new Item_astroswitch(1, "1","circle",3).setUnlocalizedName("elek_swich").setCreativeTab(Tabs.tabFourze);
		public static Item scissors_switch = new Item_astroswitch(0, "0","square",4).setUnlocalizedName("scissors_switch").setCreativeTab(Tabs.tabFourze);
		public static Item beat_switch = new Item_astroswitch(0,"0","cross",3).setUnlocalizedName("beat_switch").setCreativeTab(Tabs.tabFourze);
		public static Item chain_array_switch = new Item_astroswitch(0, "0","circle",4).setUnlocalizedName("chain_array_switch").setCreativeTab(Tabs.tabFourze);
		public static Item smoke_switch = new Item_astroswitch(0,"0","cross",4).setUnlocalizedName("smoke_switch").setCreativeTab(Tabs.tabFourze);
		public static Item spike_switch = new Item_astroswitch(0, "0","triangle",3).setUnlocalizedName("spike_switch").setCreativeTab(Tabs.tabFourze);
		public static Item winch_switch = new Item_astroswitch(0, "0","square",5).setUnlocalizedName("winch_switch").setCreativeTab(Tabs.tabFourze);
		public static Item flash_switch = new Item_astroswitch(0, "0","circle",5).setUnlocalizedName("flash_switch").setCreativeTab(Tabs.tabFourze);
		public static Item shield_switch = new Item_astroswitch(0, "0","square",6).setUnlocalizedName("shield_switch").setCreativeTab(Tabs.tabFourze);
		public static Item gatling_switch = new Item_astroswitch(0, "0","triangle",4).setUnlocalizedName("gatling_switch").setCreativeTab(Tabs.tabFourze);
		
		public static Item fire_swich = new Item_astroswitch(2, "1","circle",6).setUnlocalizedName("fire_swich").setCreativeTab(Tabs.tabFourze);
		public static Item stealth_switch = new Item_astroswitch(0,"0","cross",5).setUnlocalizedName("stealth_switch").setCreativeTab(Tabs.tabFourze);
		public static Item hammer_switch = new Item_astroswitch(0, "0","square",7).setUnlocalizedName("hammer_switch").setCreativeTab(Tabs.tabFourze);
		public static Item water_switch = new Item_astroswitch(0, "0","triangle",5).setUnlocalizedName("water_switch").setCreativeTab(Tabs.tabFourze);
		public static Item medical_switch = new Item_astroswitch(0, "0","square",8).setUnlocalizedName("medical_switch").setCreativeTab(Tabs.tabFourze);
		public static Item pen_switch = new Item_astroswitch(0,"0","cross",6).setUnlocalizedName("pen_switch").setCreativeTab(Tabs.tabFourze);
		public static Item wheel_switch = new Item_astroswitch(0, "0","triangle",6).setUnlocalizedName("wheel_switch").setCreativeTab(Tabs.tabFourze);
		public static Item screw_switch = new Item_astroswitch(0, "0","triangle",7).setUnlocalizedName("screw_switch").setCreativeTab(Tabs.tabFourze);
		public static Item hand_switch = new Item_astroswitch(0,"0","cross",7).setUnlocalizedName("hand_switch").setCreativeTab(Tabs.tabFourze);
		public static Item schop_switch = new Item_astroswitch(0, "0","circle",7).setUnlocalizedName("schop_switch").setCreativeTab(Tabs.tabFourze);
		
		public static Item magnet_swich_n = new Item_astroswitch(3, "1","circle",8).setUnlocalizedName("magnet_swich_n").setCreativeTab(Tabs.tabFourze);
		public static Item magnet_swich_s = new Item_astroswitch(3, "1","square",0).setUnlocalizedName("magnet_swich_s").setCreativeTab(Tabs.tabFourze);
		public static Item freeze_switch = new Item_astroswitch(0,"0","cross",8).setUnlocalizedName("freeze_switch").setCreativeTab(Tabs.tabFourze);
		public static Item claw_switch = new Item_astroswitch(0, "0","circle",9).setUnlocalizedName("claw_switch").setCreativeTab(Tabs.tabFourze);
		public static Item board_switch = new Item_astroswitch(0, "0","triangle",8).setUnlocalizedName("board_switch").setCreativeTab(Tabs.tabFourze);
		public static Item giantfoot_switch = new Item_astroswitch(0,"0","cross",9).setUnlocalizedName("giantfoot_switch").setCreativeTab(Tabs.tabFourze);
		public static Item aero_switch = new Item_astroswitch(0, "0","triangle",9).setUnlocalizedName("aero_switch").setCreativeTab(Tabs.tabFourze);
		public static Item gyro_switch = new Item_astroswitch(0, "0","square",10).setUnlocalizedName("gyro_switch").setCreativeTab(Tabs.tabFourze);
		public static Item net_switch = new Item_astroswitch(0,"0","cross",10).setUnlocalizedName("net_switch").setCreativeTab(Tabs.tabFourze);
		public static Item stamper_switch = new Item_astroswitch(0, "0","triangle",10).setUnlocalizedName("stamper_switch").setCreativeTab(Tabs.tabFourze);

		public static Item cosmic_swich = new Item_astroswitch(4, "1","circle",10).setUnlocalizedName("cosmic_swich").setCreativeTab(Tabs.tabFourze);
		
		public static Item super_rocket_swich = new Item_astroswitch(5, "1","circle",1).setUnlocalizedName("super_rocket_swich").setCreativeTab(Tabs.tabFourze);
		public static Item super_drill_swich = new Item_ore().setUnlocalizedName("super_drill_swich").setCreativeTab(Tabs.tabFourze);
		
		public static Item clear_drill_swich = new Item_astroswitch(6, "1","circle",13).setUnlocalizedName("clear_drill_swich").setCreativeTab(Tabs.tabFourze);
		public static Item fusion_swich = new Item_astroswitch(7, "1","circle",11).setUnlocalizedName("fusion_swich").setCreativeTab(Tabs.tabFourze);

		public static Item meteor_swich = new Item_astroswitch(0, "2","meteor",0).setUnlocalizedName("meteor_swich").setCreativeTab(Tabs.tabFourze);
		public static Item meteor_storm_swich = new Item_astroswitch(1, "2","meteor",0).setUnlocalizedName("meteor_storm_swich").setCreativeTab(Tabs.tabFourze);

		public static Item nadeshiko_switch = new Item_ore().setUnlocalizedName("nadeshiko_switch").setCreativeTab(Tabs.tabFourze);

		public static Item solu_switch = new Item_ore().setUnlocalizedName("solu_switch").setCreativeTab(Tabs.tabFourze);
		public static Item core_switch = new Item_ore().setUnlocalizedName("core_switch").setCreativeTab(Tabs.tabFourze);
		
		
		// Wizard
		public static Item wizarswordgun_gun  = new Item_ore().setUnlocalizedName("wizarswordgun_gun");
		public static Item wizarswordgun = new Item_swordgun(Tabs.wizarswordgun, energy, wizarswordgun_gun).setMaxStackSize(1).setUnlocalizedName("wizarswordgun").setCreativeTab(Tabs.tabwizard);
		public static Item axcalibur_charge  = new Item_ore().setUnlocalizedName("axcalibur_charge");
		public static Item axcalibur = new ItemChargeSword(Tabs.axcalibur,wizardgem, axcalibur_charge).setMaxStackSize(1).setUnlocalizedName("axcalibur").setCreativeTab(Tabs.tabwizard);
		public static Item wizarswordgun_mage_gun  = new Item_ore().setUnlocalizedName("wizarswordgun_mage_gun");
		public static Item wizarswordgun_mage = new Item_swordgun(Tabs.wizarswordgun, energy, wizarswordgun_mage_gun).setMaxStackSize(1).setUnlocalizedName("wizarswordgun_mage").setCreativeTab(Tabs.tabwizard);
		public static Item hammelcane = new ItemBaseSword(Tabs.hammelcane).setMaxStackSize(1).setUnlocalizedName("hammelcane").setCreativeTab(Tabs.tabwizard);
		public static Item dis_halberd = new ItemBaseSword(Tabs.dis_halberd).setMaxStackSize(1).setUnlocalizedName("dis_halberd").setCreativeTab(Tabs.tabwizard);
		public static Item mirage_magnum = new Item_gun(Tabs.den_dengu,energy).setMaxStackSize(1).setUnlocalizedName("mirage_magnum").setCreativeTab(Tabs.tabwizard);
		public static Item dice_saber = new ItemBaseSword(Tabs.den_denso).setMaxStackSize(1).setUnlocalizedName("dice_saber").setCreativeTab(Tabs.tabwizard);
		
		public static Item wizardhead = new item_wizardarmor(ArmorMaterial.DIAMOND, 4, 0).setMaxStackSize(1).setUnlocalizedName("wizardhead").setCreativeTab(Tabs.tabwizard);
		public static Item wizardtroso = new item_wizardarmor2(ArmorMaterial.DIAMOND, 4, 1).setMaxStackSize(1).setUnlocalizedName("wizardtroso").setCreativeTab(Tabs.tabwizard);
		public static Item wizardlegs = new item_wizardarmor2(ArmorMaterial.DIAMOND, 4, 2).setMaxStackSize(1).setUnlocalizedName("wizardlegs").setCreativeTab(Tabs.tabwizard);

		public static Item wizardriver = new item_wizarddriver(ArmorMaterial.DIAMOND, 4, 3).setMaxStackSize(1).setUnlocalizedName("wizardriver").setCreativeTab(Tabs.tabwizard);
		public static Item beastdriver = new item_wizarddriver(ArmorMaterial.DIAMOND, 4, 3).setMaxStackSize(1).setUnlocalizedName("beastdriver").setCreativeTab(Tabs.tabwizard);
		public static Item whitewizardriver = new item_wizarddriver(ArmorMaterial.DIAMOND, 4, 3).setMaxStackSize(1).setUnlocalizedName("whitewizardriver").setCreativeTab(Tabs.tabwizard);
		public static Item magewizardriver = new item_wizarddriver(ArmorMaterial.DIAMOND, 4, 3).setMaxStackSize(1).setUnlocalizedName("magewizardriver").setCreativeTab(Tabs.tabwizard);
		public static Item magewizardriver_b = new item_wizarddriver(ArmorMaterial.DIAMOND, 4, 3).setMaxStackSize(1).setUnlocalizedName("magewizardriver_b").setCreativeTab(Tabs.tabwizard);
		public static Item magewizardriver_g = new item_wizarddriver(ArmorMaterial.DIAMOND, 4, 3).setMaxStackSize(1).setUnlocalizedName("magewizardriver_g").setCreativeTab(Tabs.tabwizard);
		public static Item sorcererdriver = new item_wizarddriver(ArmorMaterial.DIAMOND, 4, 3).setMaxStackSize(1).setUnlocalizedName("sorcererdriver").setCreativeTab(Tabs.tabwizard);
		public static Item whitewizardriverf = new item_wizarddriver(ArmorMaterial.DIAMOND, 4, 3).setMaxStackSize(1).setUnlocalizedName("whitewizardriverf").setCreativeTab(Tabs.tabwizard);
		
		public static Item darkwizardriver = new item_wizarddriver(ArmorMaterial.DIAMOND, 4, 3).setMaxStackSize(1).setUnlocalizedName("darkwizardriver").setCreativeTab(Tabs.tabwizard);
		public static Item blackwizardriver = new item_wizarddriver(ArmorMaterial.DIAMOND, 4, 3).setMaxStackSize(1).setUnlocalizedName("blackwizardriver").setCreativeTab(Tabs.tabwizard);
		
		public static Item flame_ring = new Item_wizard_ring(0, "1").setUnlocalizedName("flame_ring").setCreativeTab(Tabs.tabwizard);
		public static Item water_ring = new Item_wizard_ring(1, "1").setUnlocalizedName("water_ring").setCreativeTab(Tabs.tabwizard);
		public static Item hurricane_ring = new Item_wizard_ring(2, "1").setUnlocalizedName("hurricane_ring").setCreativeTab(Tabs.tabwizard);
		public static Item land_ring = new Item_wizard_ring(3, "1").setUnlocalizedName("land_ring").setCreativeTab(Tabs.tabwizard);
		public static Item flame_ring_dragon = new Item_wizard_ring(4, "1").setUnlocalizedName("flame_ring_dragon").setCreativeTab(Tabs.tabwizard);
		public static Item water_ring_dragon = new Item_wizard_ring(5, "1").setUnlocalizedName("water_ring_dragon").setCreativeTab(Tabs.tabwizard);
		public static Item hurricane_ring_dragon = new Item_wizard_ring(6, "1").setUnlocalizedName("hurricane_ring_dragon").setCreativeTab(Tabs.tabwizard);
		public static Item land_ring_dragon = new Item_wizard_ring(7, "1").setUnlocalizedName("land_ring_dragon").setCreativeTab(Tabs.tabwizard);
		public static Item infinity_ring = new Item_wizard_ring(8, "1").setUnlocalizedName("infinity_ring").setCreativeTab(Tabs.tabwizard);

		public static Item drago_timer = new Item_wizard_ring(1, "2").setMaxStackSize(1).setUnlocalizedName("drago_timer").setCreativeTab(Tabs.tabwizard);
		public static Item special_ring = new Item_wizard_ring(2, "2").setUnlocalizedName("special_ring").setCreativeTab(Tabs.tabwizard);
		public static Item finish_strike_ring = new Item_wizard_ring(3 , "2").setUnlocalizedName("finish_strike_ring").setCreativeTab(Tabs.tabwizard);
		public static Item hope_ring = new Item_ore().setUnlocalizedName("hope_ring").setCreativeTab(Tabs.tabwizard);
		public static Item special_rush_ring = new Item_wizard_ring(9 , "2").setUnlocalizedName("special_rush_ring").setCreativeTab(Tabs.tabwizard);

		public static Item beast_ring = new Item_wizard_ring(0, "3").setUnlocalizedName("beast_ring").setCreativeTab(Tabs.tabwizard);
		public static Item falco_ring = new Item_wizard_ring(1, "3").setUnlocalizedName("falco_ring").setCreativeTab(Tabs.tabwizard);
		public static Item chameleo_ring = new Item_wizard_ring(2, "3").setUnlocalizedName("chameleo_ring").setCreativeTab(Tabs.tabwizard);
		public static Item buffa_ring = new Item_wizard_ring(3, "3").setUnlocalizedName("buffa_ring").setCreativeTab(Tabs.tabwizard);
		public static Item dolphi_ring = new Item_wizard_ring(4, "3").setUnlocalizedName("dolphi_ring").setCreativeTab(Tabs.tabwizard);
		public static Item hyper_ring = new Item_wizard_ring(5, "3").setUnlocalizedName("hyper_ring").setCreativeTab(Tabs.tabwizard);

		public static Item wiseman_ring = new Item_ore().setUnlocalizedName("wiseman_ring").setCreativeTab(Tabs.tabwizard);
		public static Item mage_o_ring = new Item_ore().setUnlocalizedName("mage_o_ring").setCreativeTab(Tabs.tabwizard);
		public static Item mage_b_ring = new Item_ore().setUnlocalizedName("mage_b_ring").setCreativeTab(Tabs.tabwizard);
		public static Item mage_g_ring = new Item_ore().setUnlocalizedName("mage_g_ring").setCreativeTab(Tabs.tabwizard);
		public static Item sorcerer_ring = new Item_ore().setUnlocalizedName("sorcerer_ring").setCreativeTab(Tabs.tabwizard);
		public static Item black_ring = new Item_ore().setUnlocalizedName("black_ring").setCreativeTab(Tabs.tabwizard);
		public static Item dark_ring = new Item_ore().setUnlocalizedName("dark_ring").setCreativeTab(Tabs.tabwizard);
		
		public static Item light_ring = new Item_wizard_rings_efts(1 , "0").setUnlocalizedName("light_ring").setMaxStackSize(1).setCreativeTab(Tabs.tabwizard);
		public static Item excite_ring = new Item_wizard_rings_efts(2 , "0").setUnlocalizedName("excite_ring").setMaxStackSize(1).setCreativeTab(Tabs.tabwizard);
		public static Item defend_ring = new Item_wizard_rings_efts(3 , "0").setUnlocalizedName("defend_ring").setMaxStackSize(1).setCreativeTab(Tabs.tabwizard);
		public static Item thunder_ring = new Item_wizard_rings_efts(4 , "0").setUnlocalizedName("thunder_ring").setMaxStackSize(1).setCreativeTab(Tabs.tabwizard);
		public static Item explosion_ring = new Item_wizard_rings_efts(5 , "0").setUnlocalizedName("explosion_ring").setMaxStackSize(1).setCreativeTab(Tabs.tabwizard);
		public static Item sleep_ring = new Item_wizard_rings_efts(6 , "0").setUnlocalizedName("sleep_ring").setMaxStackSize(1).setCreativeTab(Tabs.tabwizard);
		public static Item bind_ring = new Item_wizard_rings_efts(7 , "0").setUnlocalizedName("bind_ring").setMaxStackSize(1).setCreativeTab(Tabs.tabwizard);
		public static Item teleport_ring = new Item_wizard_rings_efts(8 , "0").setUnlocalizedName("teleport_ring").setMaxStackSize(1).setCreativeTab(Tabs.tabwizard);
		public static Item fall_ring = new Item_wizard_rings_efts(9 , "0").setUnlocalizedName("fall_ring").setMaxStackSize(1).setCreativeTab(Tabs.tabwizard);
		public static Item connect_ring = new Item_wizard_rings_efts(10 , "0").setUnlocalizedName("connect_ring").setMaxStackSize(1).setCreativeTab(Tabs.tabwizard);
		public static Item kick_strike_ring = new Item_wizard_rings_efts(11 , "0").setUnlocalizedName("kick_strike_ring").setMaxStackSize(1).setCreativeTab(Tabs.tabwizard);
		public static Item eclipse_ring = new Item_wizard_rings_efts(12 , "0").setUnlocalizedName("eclipse_ring").setMaxStackSize(1).setCreativeTab(Tabs.tabwizard);
		public static Item liquid_ring = new Item_wizard_rings_efts(13 , "0").setUnlocalizedName("liquid_ring").setMaxStackSize(1).setCreativeTab(Tabs.tabwizard);
		public static Item drill_ring = new Item_wizard_rings_efts(14 , "0").setUnlocalizedName("drill_ring").setMaxStackSize(1).setCreativeTab(Tabs.tabwizard);
		
		

		public static Item engage_ring = new Item_ore().setUnlocalizedName("engage_ring").setMaxStackSize(1).setCreativeTab(Tabs.tabwizard);
		public static Item please_ring = new Item_ore().setUnlocalizedName("please_ring").setMaxStackSize(1).setCreativeTab(Tabs.tabwizard);
		public static Item small_ring = new Item_ore().setUnlocalizedName("small_ring").setMaxStackSize(1).setCreativeTab(Tabs.tabwizard);
		public static Item big_ring = new Item_ore().setUnlocalizedName("big_ring").setMaxStackSize(1).setCreativeTab(Tabs.tabwizard);
		
		public static Item copy_ring = new Item_ore().setUnlocalizedName("copy_ring").setMaxStackSize(1).setCreativeTab(Tabs.tabwizard);
		public static Item smell_ring = new Item_ore().setUnlocalizedName("smell_ring").setMaxStackSize(1).setCreativeTab(Tabs.tabwizard);
		public static Item extend_ring = new Item_ore().setUnlocalizedName("extend_ring").setMaxStackSize(1).setCreativeTab(Tabs.tabwizard);
		public static Item merry_christmas_ring = new Item_ore().setUnlocalizedName("merry_christmas_ring").setMaxStackSize(1).setCreativeTab(Tabs.tabwizard);
		public static Item dress_up_ring = new Item_ore().setUnlocalizedName("dress_up_ring").setMaxStackSize(1).setCreativeTab(Tabs.tabwizard);
		public static Item blizzard_ring = new Item_ore().setUnlocalizedName("blizzard_ring").setMaxStackSize(1).setCreativeTab(Tabs.tabwizard);
		public static Item gravity_ring = new Item_ore().setUnlocalizedName("gravity_ring").setMaxStackSize(1).setCreativeTab(Tabs.tabwizard);
		public static Item miracle_ring = new Item_ore().setUnlocalizedName("miracle_ring").setMaxStackSize(1).setCreativeTab(Tabs.tabwizard);
		public static Item flower_ring = new Item_ore().setUnlocalizedName("flower_ring").setMaxStackSize(1).setCreativeTab(Tabs.tabwizard);
		public static Item dance_ring = new Item_ore().setUnlocalizedName("dance_ring").setMaxStackSize(1).setCreativeTab(Tabs.tabwizard);
		public static Item time_ring = new Item_ore().setUnlocalizedName("time_ring").setMaxStackSize(1).setCreativeTab(Tabs.tabwizard);
		
		//Gaim
		public static Item musou_saber = new ItemBaseSword(Tabs.musou_saber).setMaxStackSize(1).setUnlocalizedName("musou_saber").setCreativeTab(Tabs.tabGaim);
		public static Item musou_saber_naginata = new ItemBaseSword(Tabs.musou_saber_naginata).setMaxStackSize(1).setUnlocalizedName("musou_saber_naginata").setCreativeTab(Tabs.tabGaim);
		public static Item blood_musou_saber_naginata = new ItemBaseSword(Tabs.musou_saber_naginata).setMaxStackSize(1).setUnlocalizedName("blood_musou_saber_naginata").setCreativeTab(Tabs.tabGaim);
		public static Item musou_saber_kusarigama = new ItemBaseSword(Tabs.musou_saber_kusarigama).setMaxStackSize(1).setUnlocalizedName("musou_saber_kusarigama").setCreativeTab(Tabs.tabGaim);
		public static Item dj_gun = new Item_gun(Tabs.dj_gun,energy).setMaxStackSize(1).setUnlocalizedName("dj_gun").setCreativeTab(Tabs.tabGaim);
		
		public static Item dj_gun_taiken_mode_big  = new Item_ore().setUnlocalizedName("dj_gun_taiken_mode_big");
		public static Item dj_gun_taiken_mode = new Item_2nd_sword_im(Tabs.dj_gun_taiken_mode,dj_gun_taiken_mode_big).setMaxStackSize(1).setUnlocalizedName("dj_gun_taiken_mode").setCreativeTab(Tabs.tabGaim);
		
		public static Item kagematsu_l  = new Item_ore().setUnlocalizedName("kagematsu_l");
		public static Item kagematsu = new Item_2nd_sword_im(Tabs.kagematsu, kagematsu_l).setMaxStackSize(1).setUnlocalizedName("kagematsu").setCreativeTab(Tabs.tabGaim);
		public static Item donkachi= new ItemBaseSword(Tabs.donkachi).setMaxStackSize(1).setUnlocalizedName("donkachi").setCreativeTab(Tabs.tabGaim);
		public static Item melon_defender = new ItemBaseSword(Tabs.melon_defender).setMaxStackSize(1).setUnlocalizedName("melon_defender").setCreativeTab(Tabs.tabGaim);
		public static Item pine_iron = new ItemBaseSword(Tabs.pine_iron).setMaxStackSize(1).setUnlocalizedName("pine_iron").setCreativeTab(Tabs.tabGaim);
		public static Item ichigo_kunai = new ItemBaseSword(Tabs.ichigo_kunai).setMaxStackSize(1).setUnlocalizedName("ichigo_kunai").setCreativeTab(Tabs.tabGaim);
		public static Item daidaimaru = new ItemBaseSword(Tabs.daidaimaru).setMaxStackSize(1).setUnlocalizedName("daidaimaru").setCreativeTab(Tabs.tabGaim);
		public static Item banana_spear= new ItemBaseSword(Tabs.banana_spear).setMaxStackSize(1).setUnlocalizedName("banana_spear").setCreativeTab(Tabs.tabGaim);
		public static Item budou_ryuhou = new Item_gun(Tabs.budou_ryuhou,energy).setMaxStackSize(1).setUnlocalizedName("budou_ryuhou").setCreativeTab(Tabs.tabGaim);
		public static Item mango_punisher = new ItemBaseSword(Tabs.mango_punisher).setMaxStackSize(1).setUnlocalizedName("mango_punisher").setCreativeTab(Tabs.tabGaim);
		public static Item duri_noko = new ItemBaseSword(Tabs.duri_noko).setMaxStackSize(1).setUnlocalizedName("duri_noko").setCreativeTab(Tabs.tabGaim);
		public static Item kiwi_gekirin = new ItemBaseSword(Tabs.kiwi_gekirin).setMaxStackSize(1).setUnlocalizedName("kiwi_gekirin").setCreativeTab(Tabs.tabGaim);
		public static Item sonic_arrow = new Item_gun(Tabs.sonic_arrow,energy).setMaxStackSize(1).setUnlocalizedName("sonic_arrow").setCreativeTab(Tabs.tabGaim);
		public static Item kagematsu_shin_l  = new Item_ore().setUnlocalizedName("kagematsu_shin_l");
		public static Item kagematsu_shin = new Item_2nd_sword_im(Tabs.kagematsu_shin,kagematsu_shin_l).setMaxStackSize(1).setUnlocalizedName("kagematsu_shin").setCreativeTab(Tabs.tabGaim);
		public static Item suika_sojinto_big  = new Item_ore().setUnlocalizedName("suika_sojinto_big");
		public static Item suika_sojinto = new Item_2nd_sword_im(Tabs.suika_sojinto,suika_sojinto_big).setMaxStackSize(1).setUnlocalizedName("suika_sojinto").setCreativeTab(Tabs.tabGaim);
		public static Item suika_sojinto_baron_ver_big  = new Item_ore().setUnlocalizedName("suika_sojinto_baron_ver_big");
		public static Item suika_sojinto_baron_ver = new Item_2nd_sword_im(Tabs.suika_sojinto_baron_ver,suika_sojinto_baron_ver_big).setMaxStackSize(1).setUnlocalizedName("suika_sojinto_baron_ver").setCreativeTab(Tabs.tabGaim);
		
		public static Item blood_daidaimaru = new ItemBaseSword(Tabs.daidaimaru).setMaxStackSize(1).setUnlocalizedName("blood_daidaimaru").setCreativeTab(Tabs.tabGaim);
		public static Item yomimaru = new ItemBaseSword(Tabs.yomimaru).setMaxStackSize(1).setUnlocalizedName("yomimaru").setCreativeTab(Tabs.tabGaim);
		public static Item sword_bringer = new ItemBaseSword(Tabs.sword_bringer).setMaxStackSize(1).setUnlocalizedName("sword_bringer").setCreativeTab(Tabs.tabGaim);
		public static Item apple_reflecter = new ItemBaseSword(Tabs.apple_reflecter).setMaxStackSize(1).setUnlocalizedName("apple_reflecter").setCreativeTab(Tabs.tabGaim);
		public static Item souginjou_l  = new Item_ore().setUnlocalizedName("souginjou_l");
		public static Item souginjou = new Item_2nd_sword_im(Tabs.souginjou,souginjou_l).setMaxStackSize(1).setUnlocalizedName("souginjou").setCreativeTab(Tabs.tabGaim);
		public static Item dark_daidaimaru = new ItemBaseSword(Tabs.daidaimaru).setMaxStackSize(1).setUnlocalizedName("dark_daidaimaru").setCreativeTab(Tabs.tabGaim);
		public static Item watermelon_defender = new ItemBaseSword(Tabs.watermelon_defender).setMaxStackSize(1).setUnlocalizedName("watermelon_defender").setCreativeTab(Tabs.tabGaim);
		public static Item savior_arrow = new Item_gun(Tabs.savior_arrow,energy).setMaxStackSize(1).setUnlocalizedName("savior_arrow").setCreativeTab(Tabs.tabGaim);
		
		public static Item kabi_daidaimaru = new ItemBaseSword(ToolMaterial.WOOD).setMaxStackSize(1).setUnlocalizedName("kabi_daidaimaru").setCreativeTab(Tabs.tabGaim);
		public static Item maja_yomimaru = new ItemBaseSword(Tabs.yomimaru).setMaxStackSize(1).setUnlocalizedName("maja_yomimaru").setCreativeTab(Tabs.tabGaim);
		
		
		public static Item Gaimhead = new item_Gaimarmor3(ArmorMaterial.DIAMOND, 4, 0).setMaxStackSize(1).setUnlocalizedName("gaimhead").setCreativeTab(Tabs.tabGaim);
		public static Item Gaimtroso = new item_Gaimarmor(ArmorMaterial.DIAMOND, 4, 1).setMaxStackSize(1).setUnlocalizedName("gaimtroso").setCreativeTab(Tabs.tabGaim);
		public static Item Gaimlegs = new item_Gaimarmor2(ArmorMaterial.DIAMOND, 4, 2).setMaxStackSize(1).setUnlocalizedName("gaimlegs").setCreativeTab(Tabs.tabGaim);

		public static Item sengoku_driver_matsubokkuri  = new Item_ore().setUnlocalizedName("sengoku_driver_matsubokkuri");
		public static Item sengoku_driver_kurumi  = new Item_ore().setUnlocalizedName("sengoku_driver_kurumi");
		public static Item sengoku_driver_donguri  = new Item_ore().setUnlocalizedName("sengoku_driver_donguri");
		public static Item sengoku_driver_melon  = new Item_ore().setUnlocalizedName("sengoku_driver_melon");
		public static Item sengoku_driver_pine  = new Item_ore().setUnlocalizedName("sengoku_driver_pine");
		public static Item sengoku_driver_ichigo  = new Item_ore().setUnlocalizedName("sengoku_driver_ichigo");
		public static Item sengoku_driver_orange  = new Item_ore().setUnlocalizedName("sengoku_driver_orange");
		public static Item sengoku_driver_banana  = new Item_ore().setUnlocalizedName("sengoku_driver_banana");
		public static Item sengoku_driver_budou = new Item_ore().setUnlocalizedName("sengoku_driver_budou");
		public static Item sengoku_driver_suika  = new Item_ore().setUnlocalizedName("sengoku_driver_suika");
		public static Item sengoku_driver_mango  = new Item_ore().setUnlocalizedName("sengoku_driver_mango");
		public static Item sengoku_driver_durian  = new Item_ore().setUnlocalizedName("sengoku_driver_durian");
		public static Item sengoku_driver_kiwi  = new Item_ore().setUnlocalizedName("sengoku_driver_kiwi");
		public static Item sengoku_driver_lemon  = new Item_ore().setUnlocalizedName("sengoku_driver_lemon");
	
		public static Item sengoku_driver_lemon_energy  = new Item_ore().setUnlocalizedName("sengoku_driver_lemon_energy");
		public static Item sengoku_driver_jinba_lemon = new Item_ore().setUnlocalizedName("sengoku_driver_jinba_lemon");
		public static Item lemon_energy_lockseed = new Item_lockseed(2,13).setUnlocalizedName("lemon_energy_lockseed").setCreativeTab(Tabs.tabGaim);
		
		public static Item sengoku_driver_cherry_energy  = new Item_ore().setUnlocalizedName("sengoku_driver_cherry_energy");
		public static Item sengoku_driver_jinba_cherry = new Item_ore().setUnlocalizedName("sengoku_driver_jinba_cherry");
		public static Item cherry_energy_lockseed = new Item_lockseed(2,14).setUnlocalizedName("cherry_energy_lockseed").setCreativeTab(Tabs.tabGaim);
		
		public static Item sengoku_driver_peach_energy  = new Item_ore().setUnlocalizedName("sengoku_driver_peach_energy");
		public static Item sengoku_driver_jinba_peach = new Item_ore().setUnlocalizedName("sengoku_driver_jinba_peach");
		public static Item peach_energy_lockseed = new Item_lockseed(2,15).setUnlocalizedName("peach_energy_lockseed").setCreativeTab(Tabs.tabGaim);

		public static Item sengoku_driver_melon_energy = new Item_ore().setUnlocalizedName("sengoku_driver_melon_energy");
		public static Item sengoku_driver_jinba_melon = new Item_ore().setUnlocalizedName("sengoku_driver_jinba_melon");
		public static Item sengoku_driver_jinba_melon_melon = new Item_ore().setUnlocalizedName("sengoku_driver_jinba_melon_melon");
		public static Item sengoku_driver_jinba_melon_durian = new Item_ore().setUnlocalizedName("sengoku_driver_jinba_melon_durian");
		public static Item melon_energy_lockseed = new Item_lockseed(2,16).setUnlocalizedName("melon_energy_lockseed").setCreativeTab(Tabs.tabGaim);
		
		public static Item sengoku_driver_matsubokkuri_energy  = new Item_ore().setUnlocalizedName("sengoku_driver_matsubokkuri_energy");
		public static Item matsubokkuri_energy_lockseed = new Item_lockseed(2,21).setUnlocalizedName("matsubokkuri_energy_lockseed").setCreativeTab(Tabs.tabGaim);
		
		public static Item sengoku_driver_jinba_dragon = new Item_ore().setUnlocalizedName("sengoku_driver_jinba_dragon");
		public static Item sengoku_driver_dragon_fruits_energy  = new Item_ore().setUnlocalizedName("sengoku_driver_dragon_fruits_energy");
		public static Item dragon_fruits_energy_lockseed = new Item_lockseed(2,42).setUnlocalizedName("dragon_fruits_energy_lockseed").setCreativeTab(Tabs.tabGaim);
		
		public static Item sengoku_driver_jinba_marron = new Item_ore().setUnlocalizedName("sengoku_driver_jinba_marron");
		public static Item marron_energy_lockseed = new Item_lockseed(2,46).setUnlocalizedName("marron_energy_lockseed").setCreativeTab(Tabs.tabGaim);
		
		
		
		public static Item sengoku_driver_kachidoki  = new Item_ore().setUnlocalizedName("sengoku_driver_kachidoki");
		public static Item kachidoki_lockseed  = new Item_lockseed(3,22).setUnlocalizedName("kachidoki_lockseed").setCreativeTab(Tabs.tabGaim);
		public static Item sengoku_driver_kiwami = new Item_ore().setUnlocalizedName("sengoku_driver_kiwami");
		public static Item kiwami_lockseed  = new Item_lockseed(3,23).setUnlocalizedName("kiwami_lockseed").setCreativeTab(Tabs.tabGaim);
		public static Item sengoku_driver_yomotsu_heguri  = new Item_ore().setUnlocalizedName("sengoku_driver_yomotsu_heguri");
		public static Item yomotsu_heguri_lockseed = new Item_lockseed(1,24).setUnlocalizedName("yomotsu_heguri_lockseed").setCreativeTab(Tabs.tabGaim);

		
		public static Item sengoku_driver_blood_orange  = new Item_ore().setUnlocalizedName("sengoku_driver_blood_orange");
		public static Item blood_orange_lockseed = new Item_lockseed(1,25).setUnlocalizedName("blood_orange_lockseed").setCreativeTab(Tabs.tabGaim);
		public static Item sengoku_driver_fifteen_lock  = new Item_ore().setUnlocalizedName("sengoku_driver_fifteen_lock");
		public static Item fifteen_lockseed = new Item_lockseed(1,26).setUnlocalizedName("fifteen_lockseed").setCreativeTab(Tabs.tabGaim);
		public static Item sengoku_driver_golden_ringo  = new Item_ore().setUnlocalizedName("sengoku_driver_golden_ringo");
		public static Item golden_ringo_lockseed = new Item_lockseed(1,27).setUnlocalizedName("golden_ringo_lockseed").setCreativeTab(Tabs.tabGaim);
		public static Item sengoku_driver_silver_ringo  = new Item_ore().setUnlocalizedName("sengoku_driver_silver_ringo");
		public static Item silver_ringo_lockseed = new Item_lockseed(1,28).setUnlocalizedName("silver_ringo_lockseed").setCreativeTab(Tabs.tabGaim);
		public static Item sengoku_driver_black_ringo  = new Item_ore().setUnlocalizedName("sengoku_driver_black_ringo");
		public static Item black_ringo_lockseed = new Item_lockseed(1,29).setUnlocalizedName("black_ringo_lockseed").setCreativeTab(Tabs.tabGaim);
		public static Item sengoku_driver_watermelon  = new Item_ore().setUnlocalizedName("sengoku_driver_watermelon");
		public static Item watermelon_lockseed = new Item_lockseed(1,30).setUnlocalizedName("watermelon_lockseed").setCreativeTab(Tabs.tabGaim);
		public static Item sengoku_driver_forbidden_ringo  = new Item_ore().setUnlocalizedName("sengoku_driver_forbidden_ringo");
		public static Item forbidden_ringo_lockseed = new Item_lockseed(1,31).setUnlocalizedName("forbidden_ringo_lockseed").setCreativeTab(Tabs.tabGaim);
		public static Item sengoku_driver_blood_zakuro  = new Item_ore().setUnlocalizedName("sengoku_driver_blood_zakuro");
		public static Item zakuro_lockseed = new Item_lockseed(1,47).setUnlocalizedName("zakuro_lockseed").setCreativeTab(Tabs.tabGaim);
		public static Item sengoku_driver_black_baron  = new Item_ore().setUnlocalizedName("sengoku_driver_black_baron");
		public static Item black_baron_lockseed  = new Item_lockseed(1,8).setUnlocalizedName("black_baron_lockseed").setCreativeTab(Tabs.tabGaim);
		
		public static Item sengoku_driver_jinba_black  = new Item_ore().setUnlocalizedName("sengoku_driver_jinba_black");
		public static Item dark_orange_lockseed = new Item_lockseed(3,33).setUnlocalizedName("dark_orange_lockseed").setCreativeTab(Tabs.tabGaim);
		public static Item dark_lemon_energy_lockseed = new Item_lockseed(3,33).setUnlocalizedName("dark_lemon_energy_lockseed").setCreativeTab(Tabs.tabGaim);
		
		public static Item sengoku_driver_orange_fr  = new Item_ore().setUnlocalizedName("sengoku_driver_orange_fr");
		public static Item fresh_orange_lockseed = new Item_lockseed(1,44).setUnlocalizedName("fresh_orange_lockseed").setCreativeTab(Tabs.tabGaim);
		public static Item fresh_pine_lockseed = new Item_ore().setUnlocalizedName("fresh_pine_lockseed").setCreativeTab(Tabs.tabGaim);
		
		public static Item sengoku_driver_natsumikan  = new Item_ore().setUnlocalizedName("sengoku_driver_natsumikan");
		public static Item natsumikan_lockseed = new Item_lockseed(1,63).setUnlocalizedName("natsumikan_lockseed").setCreativeTab(Tabs.tabGaim);
		
		
		public static Item sengoku_driver_drive  = new Item_ore().setUnlocalizedName("sengoku_driver_drive");
		public static Item drive_lockseed  = new Item_lockseed(4,45).setUnlocalizedName("drive_lockseed").setCreativeTab(Tabs.tabGaim);
		public static Item sengoku_driver_wizard  = new Item_ore().setUnlocalizedName("sengoku_driver_wizard");
		public static Item wizard_lockseed  = new Item_lockseed(4,34).setUnlocalizedName("wizard_lockseed").setCreativeTab(Tabs.tabGaim);
		public static Item sengoku_driver_fourze  = new Item_ore().setUnlocalizedName("sengoku_driver_fourze");
		public static Item fourze_lockseed  = new Item_lockseed(4,35).setUnlocalizedName("fourze_lockseed").setCreativeTab(Tabs.tabGaim);
		public static Item sengoku_driver_ooo  = new Item_ore().setUnlocalizedName("sengoku_driver_ooo");
		public static Item ooo_lockseed  = new Item_lockseed(4,36).setUnlocalizedName("ooo_lockseed").setCreativeTab(Tabs.tabGaim);
		public static Item sengoku_driver_w  = new Item_ore().setUnlocalizedName("sengoku_driver_w");
		public static Item w_lockseed  = new Item_lockseed(4,37).setUnlocalizedName("w_lockseed").setCreativeTab(Tabs.tabGaim);
		public static Item sengoku_driver_decade  = new Item_ore().setUnlocalizedName("sengoku_driver_decade");
		public static Item decade_lockseed  = new Item_lockseed(4,38).setUnlocalizedName("decade_lockseed").setCreativeTab(Tabs.tabGaim);
		
		public static Item sengoku_driver_kuuga  = new Item_ore().setUnlocalizedName("sengoku_driver_kuuga");
		public static Item kuuga_lockseed  = new Item_lockseed(4,48).setUnlocalizedName("kuuga_lockseed").setCreativeTab(Tabs.tabGaim);
		
		public static Item sengoku_driver_agito  = new Item_ore().setUnlocalizedName("sengoku_driver_agito");
		public static Item agito_lockseed  = new Item_lockseed(4,49).setUnlocalizedName("agito_lockseed").setCreativeTab(Tabs.tabGaim);
		
		public static Item sengoku_driver_ryuki  = new Item_ore().setUnlocalizedName("sengoku_driver_ryuki");
		public static Item ryuki_lockseed  = new Item_lockseed(4,50).setUnlocalizedName("ryuki_lockseed").setCreativeTab(Tabs.tabGaim);
		
		public static Item sengoku_driver_faiz  = new Item_ore().setUnlocalizedName("sengoku_driver_faiz");
		public static Item faiz_lockseed  = new Item_lockseed(4,51).setUnlocalizedName("faiz_lockseed").setCreativeTab(Tabs.tabGaim);
		
		public static Item sengoku_driver_blade  = new Item_ore().setUnlocalizedName("sengoku_driver_blade");
		public static Item blade_lockseed  = new Item_lockseed(4,52).setUnlocalizedName("blade_lockseed").setCreativeTab(Tabs.tabGaim);
		
		public static Item sengoku_driver_hibiki  = new Item_ore().setUnlocalizedName("sengoku_driver_hibiki");
		public static Item hibiki_lockseed  = new Item_lockseed(4,53).setUnlocalizedName("hibiki_lockseed").setCreativeTab(Tabs.tabGaim);
		
		public static Item sengoku_driver_kaubuto  = new Item_ore().setUnlocalizedName("sengoku_driver_kabuto");
		public static Item kaubuto_lockseed  = new Item_lockseed(4,54).setUnlocalizedName("kaubuto_lockseed").setCreativeTab(Tabs.tabGaim);
		
		public static Item sengoku_driver_den_o  = new Item_ore().setUnlocalizedName("sengoku_driver_den_o");
		public static Item den_o_lockseed  = new Item_lockseed(4,55).setUnlocalizedName("den_o_lockseed").setCreativeTab(Tabs.tabGaim);
	
		public static Item sengoku_driver_kiva  = new Item_ore().setUnlocalizedName("sengoku_driver_kiva");
		public static Item kiva_lockseed  = new Item_lockseed(4,56).setUnlocalizedName("kiva_lockseed").setCreativeTab(Tabs.tabGaim);
	
		public static Item sengoku_driver_gaim_lock  = new Item_ore().setUnlocalizedName("sengoku_driver_gaim_lock");
		public static Item gaim_lockseed  = new Item_lockseed(4,57).setUnlocalizedName("gaim_lockseed").setCreativeTab(Tabs.tabGaim);
	
		
		public static Item sengoku_driver_rider_ichigo  = new Item_ore().setUnlocalizedName("sengoku_driver_rider_ichigo");
		public static Item rider_ichigo_lockseed  = new Item_lockseed(4,39).setUnlocalizedName("rider_ichigo_lockseed").setCreativeTab(Tabs.tabGaim);

		public static Item sengoku_driver_ryugen_yomi  = new Item_ore().setUnlocalizedName("sengoku_driver_ryugen_yomi");
		public static Item sengoku_driver_zangetsu_watermelon  = new Item_ore().setUnlocalizedName("sengoku_driver_zangetsu_watermelon");
		
		public static Item sengoku_driver_kabi_orange  = new Item_ore().setUnlocalizedName("sengoku_driver_kabi_orange");
		public static Item kabi_orange_lockseed  = new Item_lockseed(4,58).setUnlocalizedName("kabi_orange_lockseed").setCreativeTab(Tabs.tabGaim);
	
		public static Item sengoku_driver_maja_lock  = new Item_ore().setUnlocalizedName("sengoku_driver_maja_lock");
		public static Item maja_lockseed  = new Item_lockseed(4,59).setUnlocalizedName("maja_lockseed").setCreativeTab(Tabs.tabGaim);
		
	
		public static Item sengoku_driver_gaim = new item_Gaimdriver(ArmorMaterial.DIAMOND, 4, 3,"gaim","orange_arms",0,sengoku_driver_orange).setMaxStackSize(1).setUnlocalizedName("sengoku_driver_gaim").setCreativeTab(Tabs.tabGaim);
		public static Item sengoku_driver_zangetsu = new item_Gaimdriver(ArmorMaterial.DIAMOND, 4, 3,"zangetsu","melon_arms",0,sengoku_driver_melon).setMaxStackSize(1).setUnlocalizedName("sengoku_driver_zangetsu").setCreativeTab(Tabs.tabGaim);
		public static Item sengoku_driver_ryugen = new item_Gaimdriver(ArmorMaterial.DIAMOND, 4, 3,"ryugen","budou_arms",0,sengoku_driver_budou).setMaxStackSize(1).setUnlocalizedName("sengoku_driver_ryugen").setCreativeTab(Tabs.tabGaim);
		public static Item sengoku_driver_baron = new item_Gaimdriver(ArmorMaterial.DIAMOND, 4, 3,"baron","banana_arms",0,sengoku_driver_banana).setMaxStackSize(1).setUnlocalizedName("sengoku_driver_baron").setCreativeTab(Tabs.tabGaim);
		public static Item sengoku_driver_kurokage = new item_Gaimdriver(ArmorMaterial.DIAMOND, 4, 3,"kurokage","matsubokkuri_arms",0,sengoku_driver_matsubokkuri).setMaxStackSize(1).setUnlocalizedName("sengoku_driver_kurokage").setCreativeTab(Tabs.tabGaim);
		public static Item sengoku_driver_gridon = new item_Gaimdriver(ArmorMaterial.DIAMOND, 4, 3,"gridon","donguri_arms",0,sengoku_driver_donguri).setMaxStackSize(1).setUnlocalizedName("sengoku_driver_gridon").setCreativeTab(Tabs.tabGaim);
		public static Item sengoku_driver_barvo = new item_Gaimdriver(ArmorMaterial.DIAMOND, 4, 3,"barvo","durian_arms",0,sengoku_driver_durian ).setMaxStackSize(1).setUnlocalizedName("sengoku_driver_barvo").setCreativeTab(Tabs.tabGaim);
		public static Item sengoku_driver_knuckle = new item_Gaimdriver(ArmorMaterial.DIAMOND, 4, 3,"knuckle","kurumi_arms",0,sengoku_driver_kurumi).setMaxStackSize(1).setUnlocalizedName("sengoku_driver_knuckle").setCreativeTab(Tabs.tabGaim);
		public static Item sengoku_driver_bujin_gaim = new item_Gaimdriver(ArmorMaterial.DIAMOND, 4, 3,"bujin_gaim","blood_orange_arms",0,sengoku_driver_blood_orange).setMaxStackSize(1).setUnlocalizedName("sengoku_driver_bujin_gaim").setCreativeTab(Tabs.tabGaim);
		public static Item sengoku_driver_fifteen = new item_Gaimdriver(ArmorMaterial.DIAMOND, 4, 3,"fifteen","fifteen_arms",0,sengoku_driver_fifteen_lock).setMaxStackSize(1).setUnlocalizedName("sengoku_driver_fifteen").setCreativeTab(Tabs.tabGaim);
		public static Item sengoku_driver_mars = new item_Gaimdriver(ArmorMaterial.DIAMOND, 4, 3,"mars","golden_arms",0,sengoku_driver_golden_ringo).setMaxStackSize(1).setUnlocalizedName("sengoku_driver_mars").setCreativeTab(Tabs.tabGaim);
		public static Item sengoku_driver_kamuro = new item_Gaimdriver(ArmorMaterial.DIAMOND, 4, 3,"kamuro","silver_arms",0,sengoku_driver_silver_ringo).setMaxStackSize(1).setUnlocalizedName("sengoku_driver_kamuro").setCreativeTab(Tabs.tabGaim);
		public static Item sengoku_driver_jam = new item_Gaimdriver(ArmorMaterial.DIAMOND, 4, 3,"jam","darkness_arms",0,sengoku_driver_black_ringo).setMaxStackSize(1).setUnlocalizedName("sengoku_driver_jam").setCreativeTab(Tabs.tabGaim);

		public static Item sengoku_driver_kurokage_troopers = new item_Gaimdriver(ArmorMaterial.DIAMOND, 4, 3,"kurokage_shin","matsubokkuri_arms",0,sengoku_driver_matsubokkuri).setMaxStackSize(1).setUnlocalizedName("sengoku_driver_kurokage_troopers").setCreativeTab(Tabs.tabGaim);
		public static Item sengoku_driver_idunn = new item_Gaimdriver(ArmorMaterial.DIAMOND, 4, 3,"idunn","ringo_arms",0,sengoku_driver_forbidden_ringo).setMaxStackSize(1).setUnlocalizedName("sengoku_driver_idunn").setCreativeTab(Tabs.tabGaim);
		public static Item sengoku_driver_duke = new item_Gaimdriver(ArmorMaterial.DIAMOND, 4, 3,"sengoku_duke","lemon_arms",0,sengoku_driver_lemon).setMaxStackSize(1).setUnlocalizedName("sengoku_driver_duke").setCreativeTab(Tabs.tabGaim);
		public static Item sengoku_driver_baron_black = new item_Gaimdriver(ArmorMaterial.DIAMOND, 4, 3,"baron_black","banana_arms",0,sengoku_driver_banana).setMaxStackSize(1).setUnlocalizedName("sengoku_driver_baron_black").setCreativeTab(Tabs.tabGaim);
		public static Item sengoku_driver_savior = new item_Gaimdriver(ArmorMaterial.DIAMOND, 4, 3,"savior","blood_zakuro_arms",0,sengoku_driver_blood_zakuro).setMaxStackSize(1).setUnlocalizedName("sengoku_driver_savior").setCreativeTab(Tabs.tabGaim);

		public static Item sengoku_driver_maja = new item_Gaimdriver(ArmorMaterial.DIAMOND, 4, 3,"maja","maja_arms",0,sengoku_driver_maja_lock).setMaxStackSize(1).setUnlocalizedName("sengoku_driver_maja").setCreativeTab(Tabs.tabGaim);

		public static Item sengoku_driver_gaim_natsumikan = new item_Gaimdriver(ArmorMaterial.DIAMOND, 4, 3,"gaim_natsumikan","natsumikan_arms",0,sengoku_driver_natsumikan).setMaxStackSize(1).setUnlocalizedName("sengoku_driver_gaim_natsumikan").setCreativeTab(Tabs.tabGaim);


		public static Item genesis_driver_zangetsu_shin = new item_Gaimdriver(ArmorMaterial.DIAMOND, 4, 3,"zangetsu_shin","energy_melon_arms",1,sengoku_driver_melon_energy).setMaxStackSize(1).setUnlocalizedName("genesis_driver_zangetsu_shin").setCreativeTab(Tabs.tabGaim);
		public static Item genesis_driver_duke = new item_Gaimdriver(ArmorMaterial.DIAMOND, 4, 3,"duke","energy_lemon_arms",1,sengoku_driver_lemon_energy).setMaxStackSize(1).setUnlocalizedName("genesis_driver_duke").setCreativeTab(Tabs.tabGaim);
		public static Item genesis_driver_sigurd = new item_Gaimdriver(ArmorMaterial.DIAMOND, 4, 3,"sigurd","energy_cherry_arms",1,sengoku_driver_cherry_energy).setMaxStackSize(1).setUnlocalizedName("genesis_driver_sigurd").setCreativeTab(Tabs.tabGaim);
		public static Item genesis_driver_marika = new item_Gaimdriver(ArmorMaterial.DIAMOND, 4, 3,"marika","energy_peach_arms",1,sengoku_driver_peach_energy).setMaxStackSize(1).setUnlocalizedName("genesis_driver_marika").setCreativeTab(Tabs.tabGaim);
		public static Item genesis_driver_baron = new item_Gaimdriver(ArmorMaterial.DIAMOND, 4, 3,"baron_shin","energy_lemon_arms",1,sengoku_driver_lemon_energy).setMaxStackSize(1).setUnlocalizedName("genesis_driver_baron").setCreativeTab(Tabs.tabGaim);
		public static Item genesis_driver_kurokage_shin = new item_Gaimdriver(ArmorMaterial.DIAMOND, 4, 3,"kurokage_shin","energy_matsubokkuri_arms",1,sengoku_driver_matsubokkuri_energy).setMaxStackSize(1).setUnlocalizedName("genesis_driver_kurokage_shin").setCreativeTab(Tabs.tabGaim);
		public static Item genesis_driver_tyrant = new item_Gaimdriver(ArmorMaterial.DIAMOND, 4, 3,"tyrant","energy_prototype_dragon_fruits_arms",1,sengoku_driver_dragon_fruits_energy).setMaxStackSize(1).setUnlocalizedName("genesis_driver_tyrant").setCreativeTab(Tabs.tabGaim);

		
		public static Item matsubokkuri_lockseed = new Item_lockseed(1,1).setUnlocalizedName("matsubokkuri_lockseed").setCreativeTab(Tabs.tabGaim);
		public static Item kurumi_lockseed = new Item_lockseed(1,2).setUnlocalizedName("kurumi_lockseed").setCreativeTab(Tabs.tabGaim);
		public static Item donguri_lockseed = new Item_lockseed(1,3).setUnlocalizedName("donguri_lockseed").setCreativeTab(Tabs.tabGaim);
		public static Item melon_lockseed = new Item_lockseed(1,4).setUnlocalizedName("melon_lockseed").setCreativeTab(Tabs.tabGaim);
		public static Item pine_lockseed = new Item_lockseed(1,5).setUnlocalizedName("pine_lockseed").setCreativeTab(Tabs.tabGaim);
		public static Item ichigo_lockseed = new Item_lockseed(1,6).setUnlocalizedName("ichigo_lockseed").setCreativeTab(Tabs.tabGaim);
		public static Item orange_lockseed = new Item_lockseed(1,7).setUnlocalizedName("orange_lockseed").setCreativeTab(Tabs.tabGaim);
		public static Item banana_lockseed = new Item_lockseed(1,8).setUnlocalizedName("banana_lockseed").setCreativeTab(Tabs.tabGaim);
		public static Item budou_lockseed = new Item_lockseed(1,9).setUnlocalizedName("budou_lockseed").setCreativeTab(Tabs.tabGaim);
		public static Item suika_lockseed = new Item_lockseed(1,40).setUnlocalizedName("suika_lockseed").setCreativeTab(Tabs.tabGaim);
		public static Item mango_lockseed = new Item_lockseed(1,10).setUnlocalizedName("mango_lockseed").setCreativeTab(Tabs.tabGaim);
		public static Item durian_lockseed = new Item_lockseed(1,11).setUnlocalizedName("durian_lockseed").setCreativeTab(Tabs.tabGaim);
		public static Item kiwi_lockseed = new Item_lockseed(1,12).setUnlocalizedName("kiwi_lockseed").setCreativeTab(Tabs.tabGaim);
		public static Item lemon_lockseed = new Item_lockseed(1,41).setUnlocalizedName("lemon_lockseed").setCreativeTab(Tabs.tabGaim);

		public static Item sakura_hurricane = new Item_ore().setUnlocalizedName("sakura_hurricane").setCreativeTab(Tabs.tabGaim);
		public static Item rose_attacker = new Item_ore().setUnlocalizedName("rose_attacker").setCreativeTab(Tabs.tabGaim);
		public static Item dandeliner = new Item_ore().setUnlocalizedName("dandeliner").setCreativeTab(Tabs.tabGaim);
		public static Item tulip_hopper = new Item_ore().setUnlocalizedName("tulip_hopper").setCreativeTab(Tabs.tabGaim);
		
		public static Item christmas_lockseed = new Item_ore().setUnlocalizedName("christmas_lockseed").setCreativeTab(Tabs.tabGaim);
		public static Item roulette_lockseed = new Item_ore().setUnlocalizedName("roulette_lockseed").setCreativeTab(Tabs.tabGaim);
		
		public static Item sid_lockseed = new item_sid_lockseed().setMaxStackSize(1).setUnlocalizedName("sid_lockseed").setCreativeTab(Tabs.tabGaim);
		
		public static Item fake_donguri_lockseed = new fake_donguri(Tabs.apple_reflecter).setUnlocalizedName("fake_donguri_lockseed").setCreativeTab(Tabs.tabGaim);

		//drive
		public static Item handle_sword = new ItemBaseSword(ToolMaterial.EMERALD).setMaxStackSize(1).setUnlocalizedName("handle_sword").setCreativeTab(Tabs.tabdrive);
		public static Item door_ju = new Item_gun(ToolMaterial.EMERALD,energy).setMaxStackSize(1).setUnlocalizedName("door_ju").setCreativeTab(Tabs.tabdrive);
		public static Item trailer_hou = new Item_gun(ToolMaterial.EMERALD,energy).setMaxStackSize(1).setUnlocalizedName("trailer_hou").setCreativeTab(Tabs.tabdrive);
		
		public static Item zenrin_shooter = new Item_gun(ToolMaterial.EMERALD,energy).setMaxStackSize(1).setUnlocalizedName("zenrin_shooter").setCreativeTab(Tabs.tabdrive);
		
		public static Item break_gunner = new Item_break_gunner(ToolMaterial.EMERALD,energy).setMaxStackSize(1).setUnlocalizedName("break_gunner").setCreativeTab(Tabs.tabdrive);
		public static Item shingouax = new ItemBaseSword(ToolMaterial.EMERALD).setMaxStackSize(1).setUnlocalizedName("shingouax").setCreativeTab(Tabs.tabdrive);
		
		public static Item lupin_gunner = new Item_gun(ToolMaterial.EMERALD,energy).setMaxStackSize(1).setUnlocalizedName("lupin_gunner").setCreativeTab(Tabs.tabdrive);
		public static Item blade_gunner = new ItemBaseSword(ToolMaterial.EMERALD).setMaxStackSize(1).setUnlocalizedName("blade_gunner").setCreativeTab(Tabs.tabdrive);
		
		public static Item drivehead = new item_drivearmor(ArmorMaterial.DIAMOND, 4, 0).setMaxStackSize(1).setUnlocalizedName("drivehead").setCreativeTab(Tabs.tabdrive);
		public static Item drivetroso = new item_drivearmor2(ArmorMaterial.DIAMOND, 4, 1).setMaxStackSize(1).setUnlocalizedName("drivetroso").setCreativeTab(Tabs.tabdrive);
		public static Item drivelegs = new item_drivearmor2(ArmorMaterial.DIAMOND, 4, 2).setMaxStackSize(1).setUnlocalizedName("drivelegs").setCreativeTab(Tabs.tabdrive);

		public static Item drivedriver = new item_drivedriver(ArmorMaterial.DIAMOND, 4, 3).setMaxStackSize(1).setUnlocalizedName("drivedriver").setCreativeTab(Tabs.tabdrive);
		public static Item mach_driver_honoh = new item_drivedriver(ArmorMaterial.DIAMOND, 4, 3).setMaxStackSize(1).setUnlocalizedName("mach_driver_honoh").setCreativeTab(Tabs.tabdrive);
		public static Item drivedrivergold = new item_drivedriver(ArmorMaterial.DIAMOND, 4, 3).setMaxStackSize(1).setUnlocalizedName("drivedrivergold").setCreativeTab(Tabs.tabdrive);
		public static Item metro_pd_driver_honoh = new item_drivedriver(ArmorMaterial.DIAMOND, 4, 3).setMaxStackSize(1).setUnlocalizedName("metro_pd_driver_honoh").setCreativeTab(Tabs.tabdrive);
		public static Item break_gunner_2 = new item_drivedriver(ArmorMaterial.DIAMOND, 4, 3).setMaxStackSize(1).setUnlocalizedName("break_gunner_2");
		public static Item lupin_belt = new item_drivedriver(ArmorMaterial.DIAMOND, 4, 3).setMaxStackSize(1).setUnlocalizedName("lupin_belt").setCreativeTab(Tabs.tabdrive);
		
		
		public static Item speedshift  = new Item_shift_car(1, 0).setUnlocalizedName("speedshift").setCreativeTab(Tabs.tabdrive);
		public static Item wildshift  = new Item_shift_car(1, 1).setUnlocalizedName("wildshift").setCreativeTab(Tabs.tabdrive);
		public static Item techniqueshift  = new Item_shift_car(1, 13).setUnlocalizedName("techniqueshift").setCreativeTab(Tabs.tabdrive);
		public static Item dead_heat  = new Item_shift_car(1, 21).setUnlocalizedName("dead_heat").setCreativeTab(Tabs.tabdrive);
		public static Item formulashift  = new Item_shift_car(1, 23).setUnlocalizedName("formulashift").setCreativeTab(Tabs.tabdrive);
		public static Item tridoronshift  = new Item_shift_car(1, 24).setUnlocalizedName("tridoronshift").setCreativeTab(Tabs.tabdrive);
		
		public static Item fruitsshift  = new Item_shift_car(1, 20).setUnlocalizedName("fruitsshift").setCreativeTab(Tabs.tabdrive);
		public static Item highspeedshift  = new Item_shift_car(1, 10).setUnlocalizedName("highspeedshift").setCreativeTab(Tabs.tabdrive);

		public static Item shift_next  = new Item_shift_car(1, 29).setUnlocalizedName("shift_next").setCreativeTab(Tabs.tabdrive);
		public static Item shift_special  = new Item_shift_car(1, 30).setUnlocalizedName("shift_special").setCreativeTab(Tabs.tabdrive);

		public static Item heartronshift  = new Item_shift_car(1, 35).setUnlocalizedName("heartronshift").setCreativeTab(Tabs.tabdrive);
		public static Item speedwildtechnicshift  = new Item_shift_car(1, 36).setUnlocalizedName("speedwildtechnicshift").setCreativeTab(Tabs.tabdrive);
		
		public static Item maxflare = new Item_shift_car(2, 2).setUnlocalizedName("maxflare").setCreativeTab(Tabs.tabdrive);
		public static Item funkyspike = new Item_shift_car(2, 3).setUnlocalizedName("funkyspike").setCreativeTab(Tabs.tabdrive);
		public static Item midnightshadow  = new Item_shift_car(2, 4).setUnlocalizedName("midnightshadow").setCreativeTab(Tabs.tabdrive);
		public static Item justice_hunter  = new Item_shift_car(2, 5).setUnlocalizedName("justice_hunter").setCreativeTab(Tabs.tabdrive);
		public static Item dream_vegas  = new Item_shift_car(2, 6).setUnlocalizedName("dream_vegas").setCreativeTab(Tabs.tabdrive);
		public static Item dimension_cab  = new Item_shift_car(2, 7).setUnlocalizedName("dimension_cab").setCreativeTab(Tabs.tabdrive);
		public static Item massive_monster  = new Item_shift_car(2, 8).setUnlocalizedName("massive_monster").setCreativeTab(Tabs.tabdrive);
		public static Item spin_mixer  = new Item_shift_car(2, 9).setUnlocalizedName("spin_mixer").setCreativeTab(Tabs.tabdrive);
		public static Item rumble_dump  = new Item_shift_car(2, 14).setUnlocalizedName("rumble_dump").setCreativeTab(Tabs.tabdrive);
		public static Item mad_doctor  = new Item_shift_car(2, 15).setUnlocalizedName("mad_doctor").setCreativeTab(Tabs.tabdrive);
		public static Item hooking_wrecker  = new Item_shift_car(2, 16).setUnlocalizedName("hooking_wrecker").setCreativeTab(Tabs.tabdrive);

		public static Item fire_braver  = new Item_shift_car(2, 17).setUnlocalizedName("fire_braver").setCreativeTab(Tabs.tabdrive);
		public static Item rolling_gravity  = new Item_shift_car(2, 18).setUnlocalizedName("rolling_gravity").setCreativeTab(Tabs.tabdrive);
		public static Item road_winter  = new Item_shift_car(2, 19).setUnlocalizedName("road_winter").setCreativeTab(Tabs.tabdrive);

		public static Item mantarn_f01  = new Item_shift_car(2, 31).setUnlocalizedName("mantarn_f01").setCreativeTab(Tabs.tabdrive);
		public static Item jacky_f02  = new Item_shift_car(2, 32).setUnlocalizedName("jacky_f02").setCreativeTab(Tabs.tabdrive);
		public static Item sparner_f03  = new Item_shift_car(2, 33).setUnlocalizedName("sparner_f03").setCreativeTab(Tabs.tabdrive);

		
		public static Item mega_maxflare  = new Item_shift_car(2, 12).setUnlocalizedName("mega_maxflare").setCreativeTab(Tabs.tabdrive);

		public static Item signal_mach  = new Item_shift_car(3, 0).setUnlocalizedName("signal_mach").setCreativeTab(Tabs.tabdrive);
		public static Item signal_magarl  = new Item_shift_car(3, 1).setUnlocalizedName("signal_magarl").setCreativeTab(Tabs.tabdrive);
		public static Item signal_kaksarn  = new Item_shift_car(3, 2).setUnlocalizedName("signal_kaksarn").setCreativeTab(Tabs.tabdrive);
		public static Item signal_tomarle  = new Item_shift_car(3, 3).setUnlocalizedName("signal_tomarle").setCreativeTab(Tabs.tabdrive);
		public static Item signal_kikern  = new Item_shift_car(3, 4).setUnlocalizedName("signal_kikern").setCreativeTab(Tabs.tabdrive);
		public static Item shift_ride_crosser  = new Item_shift_car(3, 7).setUnlocalizedName("shift_ride_crosser").setCreativeTab(Tabs.tabdrive);

		public static Item tridoron_key  = new Item_shift_car(3, 6).setUnlocalizedName("tridoron_key").setCreativeTab(Tabs.tabdrive);
		
		public static Item rhino_super  = new Item_shift_car(4, 6).setUnlocalizedName("rhino_super").setCreativeTab(Tabs.tabdrive);
		
		
		public static Item burning_solar = new Item_ore().setUnlocalizedName("burning_solar").setCreativeTab(Tabs.tabdrive);
		public static Item colorful_commercial = new Item_ore().setUnlocalizedName("colorful_commercial").setCreativeTab(Tabs.tabdrive);
		public static Item deco_traveller = new Item_ore().setUnlocalizedName("deco_traveller").setCreativeTab(Tabs.tabdrive);
		public static Item amazing_circus = new Item_ore().setUnlocalizedName("amazing_circus").setCreativeTab(Tabs.tabdrive);
		
		public static Item next_hunter = new Item_ore().setUnlocalizedName("next_hunter").setCreativeTab(Tabs.tabdrive);
		public static Item next_traveller = new Item_ore().setUnlocalizedName("next_traveller").setCreativeTab(Tabs.tabdrive);
		public static Item next_builder = new Item_ore().setUnlocalizedName("next_builder").setCreativeTab(Tabs.tabdrive);
		public static Item tokujoka_key = new Item_ore().setUnlocalizedName("tokujoka_key").setCreativeTab(Tabs.tabdrive);
	
		//ghost
		
		public static Item gan_gun_saber_blade  = new ItemBaseSword(Tabs.gan_gun_saber_blade).setMaxStackSize(1).setUnlocalizedName("gan_gun_saber_blade").setCreativeTab(Tabs.tabghost);
		public static Item gan_gun_saber_nitouryu = new ItemBaseSword(Tabs.gan_gun_saber_nitouryu).setMaxStackSize(1).setUnlocalizedName("gan_gun_saber_nitouryu").setCreativeTab(Tabs.tabghost);
		public static Item gan_gun_saber_nitouryu_2 = new ItemBaseSword(Tabs.gan_gun_saber_nitouryu).setMaxStackSize(1).setUnlocalizedName("gan_gun_saber_nitouryu_2").setCreativeTab(Tabs.tabghost);
		public static Item gan_gun_saber_gun = new Item_gun(Tabs.gan_gun_saber_gun,energy).setMaxStackSize(1).setUnlocalizedName("gan_gun_saber_gun").setCreativeTab(Tabs.tabghost);
		public static Item gan_gun_saber_naginata  = new ItemBaseSword(Tabs.gan_gun_saber_naginata).setMaxStackSize(1).setUnlocalizedName("gan_gun_saber_naginata").setCreativeTab(Tabs.tabghost);
		public static Item gan_gun_saber_condor_denwor = new Item_gun(Tabs.gan_gun_saber_condor_denwor,energy).setMaxStackSize(1).setUnlocalizedName("gan_gun_saber_condor_denwor").setCreativeTab(Tabs.tabghost);
		public static Item gan_gun_saber_rifle = new Item_gun(Tabs.gan_gun_saber_rifle,energy).setMaxStackSize(1).setUnlocalizedName("gan_gun_saber_rifle").setCreativeTab(Tabs.tabghost);
		public static Item gan_gun_saber_hammer  = new ItemBaseSword(Tabs.gan_gun_saber_hammer).setMaxStackSize(1).setUnlocalizedName("gan_gun_saber_hammer").setCreativeTab(Tabs.tabghost);
		
		public static Item sunglasseslasher_gun  = new Item_ore().setUnlocalizedName("sunglasseslasher_gun");	
		public static Item sunglasseslasher_sword = new Item_swordgun(Tabs.sunglasseslasher_sword,energy,sunglasseslasher_gun).setMaxStackSize(1).setUnlocalizedName("sunglasseslasher_sword").setCreativeTab(Tabs.tabghost);
		
		public static Item gan_gun_hand_gun  = new Item_ore().setUnlocalizedName("gan_gun_hand_gun");
		public static Item gan_gun_hand_rod = new Item_swordgun(Tabs.gan_gun_hand_rod,energy, gan_gun_hand_gun).setMaxStackSize(1).setUnlocalizedName("gan_gun_hand_rod").setCreativeTab(Tabs.tabghost);
		
		public static Item gan_gun_hand_kama = new ItemBaseSword(Tabs.gan_gun_hand_kama).setMaxStackSize(1).setUnlocalizedName("gan_gun_hand_kama").setCreativeTab(Tabs.tabghost);
		
		public static Item deep_slasher_blaster = new Item_ore().setUnlocalizedName("deep_slasher_blaster");	
		public static Item deep_slasher_sword = new Item_swordgun(Tabs.deep_slasher_sword,energy, deep_slasher_blaster).setMaxStackSize(1).setUnlocalizedName("deep_slasher_sword").setCreativeTab(Tabs.tabghost);
		
		public static Item gan_gun_catcher_gun = new Item_ore().setUnlocalizedName("gan_gun_catcher_gun");	
		public static Item gan_gun_catcher_rod = new Item_swordgun(Tabs.gan_gun_catcher_rod,energy, gan_gun_catcher_gun).setMaxStackSize(1).setUnlocalizedName("gan_gun_catcher_rod").setCreativeTab(Tabs.tabghost);
		
		public static Item ghosthead = new item_ghost_armor3(ArmorMaterial.DIAMOND, 4, 0).setMaxStackSize(1).setUnlocalizedName("ghosthead").setCreativeTab(Tabs.tabghost);
		public static Item ghosttroso = new item_ghostarmor(ArmorMaterial.DIAMOND, 4, 1).setMaxStackSize(1).setUnlocalizedName("ghosttroso").setCreativeTab(Tabs.tabghost);
		public static Item ghostlegs = new item_ghost_armor2(ArmorMaterial.DIAMOND, 4, 2).setMaxStackSize(1).setUnlocalizedName("ghostlegs").setCreativeTab(Tabs.tabghost);

		public static Item ghostdriver = new item_ghostdriver(ArmorMaterial.DIAMOND, 4, 3,"ghost","ore",1).setMaxStackSize(1).setUnlocalizedName("ghostdriver").setCreativeTab(Tabs.tabghost);
		public static Item specterdriver = new item_ghostdriver(ArmorMaterial.DIAMOND, 4, 3,"specter","specter",2).setMaxStackSize(1).setUnlocalizedName("specterdriver").setCreativeTab(Tabs.tabghost);
		public static Item mega_ulorder = new item_ghostdriver(ArmorMaterial.DIAMOND, 4, 3,"necrom","necrom",0).setMaxStackSize(1).setUnlocalizedName("mega_ulorder").setCreativeTab(Tabs.tabghost);
		
		public static Item unfinished_eyecon_driver_g = new Item_ore().setUnlocalizedName("unfinished_eyecon_driver_g").setCreativeTab(Tabs.tabghost);
		public static Item eyecon_driver_g = new item_ghostdriver(ArmorMaterial.DIAMOND, 4, 3,"ghost_grateful","grateful",4).setMaxStackSize(1).setUnlocalizedName("eyecon_driver_g").setCreativeTab(Tabs.tabghost);
		
		public static Item dark_ghostdriver = new item_ghostdriver(ArmorMaterial.DIAMOND, 4, 3,"dark_ghost","dark",1).setMaxStackSize(1).setUnlocalizedName("dark_ghostdriver").setCreativeTab(Tabs.tabghost);
		public static Item zero_specterdriver = new item_ghostdriver(ArmorMaterial.DIAMOND, 4, 3,"zero_specter","zero_specter",2).setMaxStackSize(1).setUnlocalizedName("zero_specterdriver").setCreativeTab(Tabs.tabghost);
		public static Item proto_mega_ulorder_r = new item_ghostdriver(ArmorMaterial.DIAMOND, 4, 3,"dark_necrom","dark_necrom_red",0).setMaxStackSize(1).setUnlocalizedName("proto_mega_ulorder_r").setCreativeTab(Tabs.tabghost);
		public static Item proto_mega_ulorder_b = new item_ghostdriver(ArmorMaterial.DIAMOND, 4, 3,"dark_necrom","dark_necrom_blue",0).setMaxStackSize(1).setUnlocalizedName("proto_mega_ulorder_b").setCreativeTab(Tabs.tabghost);
		public static Item proto_mega_ulorder_y = new item_ghostdriver(ArmorMaterial.DIAMOND, 4, 3,"dark_necrom","dark_necrom_yellow",0).setMaxStackSize(1).setUnlocalizedName("proto_mega_ulorder_y").setCreativeTab(Tabs.tabghost);
		public static Item proto_mega_ulorder_p = new item_ghostdriver(ArmorMaterial.DIAMOND, 4, 3,"dark_necrom","dark_necrom_pink",0).setMaxStackSize(1).setUnlocalizedName("proto_mega_ulorder_p").setCreativeTab(Tabs.tabghost);
		
		public static Item extremer_driver = new item_ghostdriver(ArmorMaterial.DIAMOND, 4, 3,"extremer","extremer",4).setMaxStackSize(1).setUnlocalizedName("extremer_driver").setCreativeTab(Tabs.tabghost);
		
		
		public static Item ore_ghost_icon  = new Item_ghost_Icons(0, 0,1).setUnlocalizedName("ore_ghost_icon").setCreativeTab(Tabs.tabghost);
		public static Item toucon_boost_icon  = new Item_ghost_Icons(1, 13,3).setUnlocalizedName("toucon_boost_icon").setCreativeTab(Tabs.tabghost);
		public static Item mugen_icon  = new Item_ghost_Icons(2, 35,5).setUnlocalizedName("mugen_icon").setCreativeTab(Tabs.tabghost);
		
		public static Item specter_ghost_icon  = new Item_ghost_Icons(0, 5,2).setUnlocalizedName("specter_ghost_icon").setCreativeTab(Tabs.tabghost);
		public static Item deep_specter_ghost_icon  = new Item_ghost_Icons(1, 24,4).setUnlocalizedName("deep_specter_ghost_icon").setCreativeTab(Tabs.tabghost);
		public static Item sin_specter_icon  = new Item_ghost_Icons(2, 38,4).setUnlocalizedName("sin_specter_icon").setCreativeTab(Tabs.tabghost);
		
		public static Item necrom_ghost_icon  = new Item_ghost_Icons(0, 19,0).setUnlocalizedName("necrom_ghost_icon").setCreativeTab(Tabs.tabghost);
		public static Item yujou_burst_icon  = new Item_ghost_Icons(1, 41,0).setUnlocalizedName("yujou_burst_icon").setCreativeTab(Tabs.tabghost);
		
		public static Item dark_ghost_icon  = new Item_ghost_Icons(0, 25,1).setUnlocalizedName("dark_ghost_icon").setCreativeTab(Tabs.tabghost);
		public static Item zero_specter_ghost_icon  = new Item_ghost_Icons(0, 30,0).setUnlocalizedName("zero_specter_ghost_icon").setCreativeTab(Tabs.tabghost);
		public static Item dark_necrom_red_ghost_icon  = new Item_ghost_Icons(0, 26,0).setUnlocalizedName("dark_necrom_red_ghost_icon").setCreativeTab(Tabs.tabghost);
		public static Item dark_necrom_blue_ghost_icon  = new Item_ghost_Icons(0, 27,0).setUnlocalizedName("dark_necrom_blue_ghost_icon").setCreativeTab(Tabs.tabghost);
		public static Item dark_necrom_yellow_ghost_icon  = new Item_ghost_Icons(0, 28,0).setUnlocalizedName("dark_necrom_yellow_ghost_icon").setCreativeTab(Tabs.tabghost);
		public static Item dark_necrom_pink_ghost_icon  = new Item_ghost_Icons(0, 29,0).setUnlocalizedName("dark_necrom_pink_ghost_icon").setCreativeTab(Tabs.tabghost);
		
		public static Item edison_ghost_icon  = new Item_ghost_Icons(0, 1,1).setUnlocalizedName("edison_ghost_icon").setCreativeTab(Tabs.tabghost);
		public static Item newton_ghost_icon  = new Item_ghost_Icons(0, 2,1).setUnlocalizedName("newton_ghost_icon").setCreativeTab(Tabs.tabghost);
		public static Item musashi_ghost_icon  = new Item_ghost_Icons(0, 3,1).setUnlocalizedName("musashi_ghost_icon").setCreativeTab(Tabs.tabghost);
		public static Item robin_ghost_icon  = new Item_ghost_Icons(0, 4,1).setUnlocalizedName("robin_ghost_icon").setCreativeTab(Tabs.tabghost);
		
		public static Item billy_the_kid_icon  = new Item_ghost_Icons(0, 6,1).setUnlocalizedName("billy_the_kid_icon").setCreativeTab(Tabs.tabghost);
		public static Item beethoven_icon  = new Item_ghost_Icons(0, 7,1).setUnlocalizedName("beethoven_icon").setCreativeTab(Tabs.tabghost);
		public static Item benkei_icon  = new Item_ghost_Icons(0, 8,1).setUnlocalizedName("benkei_icon").setCreativeTab(Tabs.tabghost);
		
		public static Item goemon_icon  = new Item_ghost_Icons(0, 14,3).setUnlocalizedName("goemon_icon").setCreativeTab(Tabs.tabghost);
		public static Item ryoma_icon  = new Item_ghost_Icons(0, 15,3).setUnlocalizedName("ryoma_icon").setCreativeTab(Tabs.tabghost);
		public static Item himiko_ghost_icon  = new Item_ghost_Icons(0, 20,3).setUnlocalizedName("himiko_ghost_icon").setCreativeTab(Tabs.tabghost);
		
		public static Item tutankhamun_icon  = new Item_ghost_Icons(0, 9,2).setUnlocalizedName("tutankhamun_icon").setCreativeTab(Tabs.tabghost);
		public static Item nobunaga_icon  = new Item_ghost_Icons(0, 10,2).setUnlocalizedName("nobunaga_icon").setCreativeTab(Tabs.tabghost);
		public static Item houdini_icon  = new Item_ghost_Icons(0, 21,2).setUnlocalizedName("houdini_icon").setCreativeTab(Tabs.tabghost);
		
		public static Item grimm_icon  = new Item_ghost_Icons(0, 22,0).setUnlocalizedName("grimm_icon").setCreativeTab(Tabs.tabghost);
		public static Item sanzo_icon  = new Item_ghost_Icons(0, 23,0).setUnlocalizedName("sanzo_icon").setCreativeTab(Tabs.tabghost);
		
		public static Item napoleon_icon  = new Item_ghost_Icons(0, 36,1).setUnlocalizedName("napoleon_icon").setCreativeTab(Tabs.tabghost);
		public static Item darwin_icon  = new Item_ghost_Icons(0, 37,1).setUnlocalizedName("darwin_icon").setCreativeTab(Tabs.tabghost);
		
		public static Item ikkyu_icon  = new Item_ghost_Icons(0, 11,1).setUnlocalizedName("ikkyu_icon").setCreativeTab(Tabs.tabghost);
		public static Item pythagoras_icon  = new Item_ghost_Icons(0, 16,2).setUnlocalizedName("pythagoras_icon").setCreativeTab(Tabs.tabghost);
		public static Item santa_icon  = new Item_ghost_Icons(0, 12,1).setUnlocalizedName("santa_icon").setCreativeTab(Tabs.tabghost);
		public static Item nightingale_icon  = new Item_ghost_Icons(0, 32,1).setUnlocalizedName("nightingale_icon").setCreativeTab(Tabs.tabghost);
		public static Item special_ore_icon  = new Item_ghost_Icons(0, 18,1).setUnlocalizedName("special_ore_icon").setCreativeTab(Tabs.tabghost);
		public static Item ore_specter_ghost_icon  = new Item_ghost_Icons(0, 62,1).setUnlocalizedName("ore_specter_ghost_icon").setCreativeTab(Tabs.tabghost);
		public static Item ishinomori_ghost_icon  = new Item_ore().setUnlocalizedName("ishinomori_ghost_icon").setCreativeTab(Tabs.tabghost);
		
		public static Item columbus_icon  = new Item_ghost_Icons(0, 34,1).setUnlocalizedName("columbus_icon").setCreativeTab(Tabs.tabghost);
		public static Item shakespeare_icon  = new Item_ghost_Icons(0, 31,1).setUnlocalizedName("shakespeare_icon").setCreativeTab(Tabs.tabghost);
		public static Item kamehameha_icon  = new Item_ghost_Icons(0, 17,1).setUnlocalizedName("kamehameha_icon").setCreativeTab(Tabs.tabghost);
		public static Item galileo_icon  = new Item_ghost_Icons(0, 33,1).setUnlocalizedName("galileo_icon").setCreativeTab(Tabs.tabghost);
		public static Item da_vinci_ghost_icon  = new Item_ghost_Icons(0, 42,1).setUnlocalizedName("da_vinci_ghost_icon").setCreativeTab(Tabs.tabghost);
		
		public static Item tenkatoitsu_icon  = new Item_ghost_Icons(0, 39,1).setUnlocalizedName("tenkatoitsu_icon").setCreativeTab(Tabs.tabghost);
		public static Item shinsengumi_icon  = new Item_ghost_Icons(0, 40,1).setUnlocalizedName("shinsengumi_icon").setCreativeTab(Tabs.tabghost);
		
		public static Item showa_ghost_icon  = new Item_ghost_Icons(0, 43,1).setUnlocalizedName("showa_ghost_icon").setCreativeTab(Tabs.tabghost);
		public static Item kuuga_ghost_icon  = new Item_ghost_Icons(0, 44,1).setUnlocalizedName("kuuga_ghost_icon").setCreativeTab(Tabs.tabghost);
		public static Item agito_ghost_icon  = new Item_ghost_Icons(0, 45,1).setUnlocalizedName("agito_ghost_icon").setCreativeTab(Tabs.tabghost);
		public static Item ryuki_ghost_icon  = new Item_ghost_Icons(0, 46,1).setUnlocalizedName("ryuki_ghost_icon").setCreativeTab(Tabs.tabghost);
		public static Item faiz_ghost_icon  = new Item_ghost_Icons(0, 47,1).setUnlocalizedName("faiz_ghost_icon").setCreativeTab(Tabs.tabghost);
		public static Item blade_ghost_icon  = new Item_ghost_Icons(0, 48,1).setUnlocalizedName("blade_ghost_icon").setCreativeTab(Tabs.tabghost);
		public static Item hibiki_ghost_icon  = new Item_ghost_Icons(0, 49,1).setUnlocalizedName("hibiki_ghost_icon").setCreativeTab(Tabs.tabghost);
		public static Item kabuto_ghost_icon  = new Item_ghost_Icons(0, 50,1).setUnlocalizedName("kabuto_ghost_icon").setCreativeTab(Tabs.tabghost);
		public static Item den_o_ghost_icon  = new Item_ghost_Icons(0, 51,1).setUnlocalizedName("den_o_ghost_icon").setCreativeTab(Tabs.tabghost);
		public static Item kiva_ghost_icon  = new Item_ghost_Icons(0, 52,1).setUnlocalizedName("kiva_ghost_icon").setCreativeTab(Tabs.tabghost);
		public static Item decade_ghost_icon  = new Item_ghost_Icons(0, 53,1).setUnlocalizedName("decade_ghost_icon").setCreativeTab(Tabs.tabghost);
		public static Item double_ghost_icon  = new Item_ghost_Icons(0, 54,1).setUnlocalizedName("double_ghost_icon").setCreativeTab(Tabs.tabghost);
		public static Item ooo_ghost_icon  = new Item_ghost_Icons(0, 55,1).setUnlocalizedName("ooo_ghost_icon").setCreativeTab(Tabs.tabghost);
		public static Item fourze_ghost_icon  = new Item_ghost_Icons(0, 56,1).setUnlocalizedName("fourze_ghost_icon").setCreativeTab(Tabs.tabghost);
		public static Item wizard_ghost_icon  = new Item_ghost_Icons(0, 57,1).setUnlocalizedName("wizard_ghost_icon").setCreativeTab(Tabs.tabghost);
		public static Item gaim_ghost_icon  = new Item_ghost_Icons(0, 58,1).setUnlocalizedName("gaim_ghost_icon").setCreativeTab(Tabs.tabghost);
		public static Item drive_ghost_icon  = new Item_ghost_Icons(0, 59,1).setUnlocalizedName("drive_ghost_icon").setCreativeTab(Tabs.tabghost);
		public static Item ghost_ghost_icon  = new Item_ghost_Icons(0, 0,1).setUnlocalizedName("ghost_ghost_icon").setCreativeTab(Tabs.tabghost);
		public static Item ex_aid_ghost_icon  = new Item_ghost_Icons(0, 60,1).setUnlocalizedName("ex_aid_ghost_icon").setCreativeTab(Tabs.tabghost);
		
		public static Item unfinished_fourtyfive_heisei_ghost_icon  = new Item_ore().setUnlocalizedName("unfinished_fourtyfive_heisei_ghost_icon").setCreativeTab(Tabs.tabghost);
		public static Item fourtyfive_heisei_ghost_icon  = new Item_ghost_Icons(3, 63,6).setUnlocalizedName("fourtyfive_heisei_ghost_icon").setCreativeTab(Tabs.tabghost);
		public static Item fourtyfive_showa_ghost_icon  = new Item_ghost_Icons(0, 61,1).setUnlocalizedName("fourtyfive_showa_ghost_icon").setCreativeTab(Tabs.tabghost);
		
		public static Item royalty_gamma_icon  = new Item_ore().setUnlocalizedName("royalty_gamma_icon").setCreativeTab(Tabs.tabghost);
		public static Item transform_gamma_icon  = new Item_ore().setUnlocalizedName("transform_gamma_icon").setCreativeTab(Tabs.tabghost);
		public static Item knife_gamma_icon  = new Item_ore().setUnlocalizedName("knife_gamma_icon").setCreativeTab(Tabs.tabghost);
		
		public static Item yurusen_gamma_icon  = new Item_ore().setUnlocalizedName("yurusen_gamma_icon").setCreativeTab(Tabs.tabghost);
		public static Item sister_gamma_icon  = new Item_ore().setUnlocalizedName("sister_gamma_icon").setCreativeTab(Tabs.tabghost);
		
		
		// Ex-Aid
		public static Item gashacon_breaker = new ItemBaseSword(Tabs.gashacon_breaker).setMaxStackSize(1).setUnlocalizedName("gashacon_breaker").setCreativeTab(Tabs.tabex_aid);
		public static Item gashacon_breaker_ham = new ItemBaseSword(Tabs.gashacon_breaker_ham).setMaxStackSize(1).setUnlocalizedName("gashacon_breaker_ham").setCreativeTab(Tabs.tabex_aid);
		
		public static Item gashacon_key_slasher = new ItemBaseSword(Tabs.gashacon_key_slasher).setMaxStackSize(1).setUnlocalizedName("gashacon_key_slasher").setCreativeTab(Tabs.tabex_aid);

		public static Item gashacon_sword = new ItemBaseSword(Tabs.gashacon_sword).setMaxStackSize(1).setUnlocalizedName("gashacon_sword").setCreativeTab(Tabs.tabex_aid);
		public static Item gashacon_sword_ice = new ItemBaseSword(Tabs.gashacon_sword).setMaxStackSize(1).setUnlocalizedName("gashacon_sword_ice").setCreativeTab(Tabs.tabex_aid);
		
		public static Item gashacon_magnum_gun = new Item_gun(Tabs.gashacon_magnum_gun,energy).setMaxStackSize(1).setUnlocalizedName("gashacon_magnum_gun").setCreativeTab(Tabs.tabex_aid);
		
		public static Item gashacon_sparrow_sickle_a = new ItemBaseSword(Tabs.gashacon_sparrow_sickle).setMaxStackSize(1).setUnlocalizedName("gashacon_sparrow_sickle_a").setCreativeTab(Tabs.tabex_aid);
		public static Item gashacon_sparrow_sickle_b = new ItemBaseSword(Tabs.gashacon_sparrow_sickle).setMaxStackSize(1).setUnlocalizedName("gashacon_sparrow_sickle_b").setCreativeTab(Tabs.tabex_aid);
		public static Item gashacon_sparrow_arrow = new Item_gun(Tabs.gashacon_sparrow_arrow,energy).setMaxStackSize(1).setUnlocalizedName("gashacon_sparrow_arrow").setCreativeTab(Tabs.tabex_aid);
	
		public static Item gashacon_bugvisor_gun = new Item_ore().setMaxStackSize(1).setUnlocalizedName("gashacon_bugvisor_gun");
		public static Item gashacon_bugvisor = new Item_swordgun(Tabs.parabragun_axe,energy,gashacon_bugvisor_gun).setMaxStackSize(1).setUnlocalizedName("gashacon_bugvisor").setCreativeTab(Tabs.tabex_aid);
		
		public static Item gashacon_bugvisor_ii_gun = new Item_ore().setMaxStackSize(1).setUnlocalizedName("gashacon_bugvisor_ii_gun");
		public static Item gashacon_bugvisor_ii = new Item_swordgun(Tabs.parabragun_axe,energy,gashacon_bugvisor_ii_gun).setMaxStackSize(1).setUnlocalizedName("gashacon_bugvisor_ii").setCreativeTab(Tabs.tabex_aid);
		
		
		public static Item parabragun_gun = new Item_ore().setMaxStackSize(1).setUnlocalizedName("parabragun_gun");
		public static Item parabragun_axe = new Item_swordgun(Tabs.parabragun_axe,energy,parabragun_gun).setMaxStackSize(1).setUnlocalizedName("parabragun_axe").setCreativeTab(Tabs.tabex_aid);
		
		public static Item ride_weapon_gun = new Item_ore().setMaxStackSize(1).setUnlocalizedName("ride_weapon_gun");
		public static Item ride_weapon = new Item_swordgun(ToolMaterial.EMERALD,energy,ride_weapon_gun).setMaxStackSize(1).setUnlocalizedName("ride_weapon").setCreativeTab(Tabs.tabex_aid);
		
		public static Item true_brave_sword = new ItemBaseSword(Tabs.true_brave_sword).setMaxStackSize(1).setUnlocalizedName("true_brave_sword").setCreativeTab(Tabs.tabex_aid);
		public static Item fuuma_sword = new ItemBaseSword(Tabs.fuuma_sword).setMaxStackSize(1).setUnlocalizedName("fuuma_sword").setCreativeTab(Tabs.tabex_aid);
		
		public static Item bugster_trident_big  = new Item_ore().setUnlocalizedName("bugster_trident_big");
		public static Item bugster_trident = new Item_2nd_sword_im(ToolMaterial.EMERALD,bugster_trident_big).setMaxStackSize(1).setUnlocalizedName("bugster_trident").setCreativeTab(Tabs.tabex_aid);
		
		public static Item deus_rusher = new ItemBaseSword(Tabs.gashacon_key_slasher).setMaxStackSize(1).setUnlocalizedName("deus_rusher").setCreativeTab(Tabs.tabex_aid);
		public static Item deus_rusher_red = new ItemBaseSword(Tabs.gashacon_key_slasher).setMaxStackSize(1).setUnlocalizedName("deus_rusher_red").setCreativeTab(Tabs.tabex_aid);

		public static Item ex_aidhead = new item_ex_aidarmor(ArmorMaterial.DIAMOND, 4, 0).setMaxStackSize(1).setUnlocalizedName("ex_aidhead").setCreativeTab(Tabs.tabex_aid);
		public static Item ex_aidtroso = new item_ex_aidarmor2(ArmorMaterial.DIAMOND, 4, 1).setMaxStackSize(1).setUnlocalizedName("ex_aidtroso").setCreativeTab(Tabs.tabex_aid);
		public static Item ex_aidlegs = new item_ex_aidarmor2(ArmorMaterial.DIAMOND, 4, 2).setMaxStackSize(1).setUnlocalizedName("ex_aidlegs").setCreativeTab(Tabs.tabex_aid);
		
		public static Item gamer_driver_ex_aid = new item_ex_aiddriver(ArmorMaterial.DIAMOND, 4, 3,"ex_aid",0).setMaxStackSize(1).setUnlocalizedName("gamer_driver_ex_aid").setCreativeTab(Tabs.tabex_aid);
		public static Item gamer_driver_brave = new item_ex_aiddriver(ArmorMaterial.DIAMOND, 4, 3,"brave",0).setMaxStackSize(1).setUnlocalizedName("gamer_driver_brave").setCreativeTab(Tabs.tabex_aid);
		public static Item gamer_driver_snipe = new item_ex_aiddriver(ArmorMaterial.DIAMOND, 4, 3,"snipe",0).setMaxStackSize(1).setUnlocalizedName("gamer_driver_snipe").setCreativeTab(Tabs.tabex_aid);
		public static Item gamer_driver_lazer = new item_ex_aiddriver(ArmorMaterial.DIAMOND, 4, 3,"lazer",1).setMaxStackSize(1).setUnlocalizedName("gamer_driver_lazer").setCreativeTab(Tabs.tabex_aid);
		public static Item gamer_driver_lazer_turbo = new item_ex_aiddriver(ArmorMaterial.DIAMOND, 4, 3,"lazer_turbo",0).setMaxStackSize(1).setUnlocalizedName("gamer_driver_lazer_turbo").setCreativeTab(Tabs.tabex_aid);
		public static Item gamer_driver_paradox = new item_ex_aiddriver(ArmorMaterial.DIAMOND, 4, 3,"paradox99",2).setMaxStackSize(1).setUnlocalizedName("gamer_driver_paradox").setCreativeTab(Tabs.tabex_aid);
		public static Item gamer_driver_chronos = new item_ex_aiddriver(ArmorMaterial.DIAMOND, 4, 3,"chronos",2).setMaxStackSize(1).setUnlocalizedName("gamer_driver_chronos").setCreativeTab(Tabs.tabex_aid);
		
		public static Item gamer_driver_truebrave = new item_ex_aiddriver(ArmorMaterial.DIAMOND, 4, 3,"truebrave",2).setMaxStackSize(1).setUnlocalizedName("gamer_driver_truebrave").setCreativeTab(Tabs.tabex_aid);
		public static Item gamer_driver_fuuma = new item_ex_aiddriver(ArmorMaterial.DIAMOND, 4, 3,"fuuma",2).setMaxStackSize(1).setUnlocalizedName("gamer_driver_fuuma").setCreativeTab(Tabs.tabex_aid);
		public static Item gamer_driver_proto_brave = new item_ex_aiddriver(ArmorMaterial.DIAMOND, 4, 3,"proto_brave",0).setMaxStackSize(1).setUnlocalizedName("gamer_driver_proto_brave").setCreativeTab(Tabs.tabex_aid);
		public static Item gamer_driver_proto_snipe = new item_ex_aiddriver(ArmorMaterial.DIAMOND, 4, 3,"proto_snipe",0).setMaxStackSize(1).setUnlocalizedName("gamer_driver_proto_snipe").setCreativeTab(Tabs.tabex_aid);
		public static Item gamer_driver_anotherparadox = new item_ex_aiddriver(ArmorMaterial.DIAMOND, 4, 3,"anotherparadox",2).setMaxStackSize(1).setUnlocalizedName("gamer_driver_anotherparadox").setCreativeTab(Tabs.tabex_aid);
		public static Item gamer_driver_gamedeus_muteki = new item_ex_aiddriver(ArmorMaterial.DIAMOND, 4, 3,"gamedeus_muteki",2).setMaxStackSize(1).setUnlocalizedName("gamer_driver_gamedeus_muteki").setCreativeTab(Tabs.tabex_aid);
		public static Item gamer_driver_nico_snipe = new item_ex_aiddriver(ArmorMaterial.DIAMOND, 4, 3,"nico_snipe",0).setMaxStackSize(1).setUnlocalizedName("gamer_driver_nico_snipe").setCreativeTab(Tabs.tabex_aid);
		
		public static Item gamer_driver_genmu = new item_ex_aiddriver(ArmorMaterial.DIAMOND, 4, 3,"genmu",0).setMaxStackSize(1).setUnlocalizedName("gamer_driver_genmu").setCreativeTab(Tabs.tabex_aid);
		public static Item gashacon_bugvisor_genmu = new item_ex_aiddriver(ArmorMaterial.DIAMOND, 4, 3,"zombie_genmu",2).setMaxStackSize(1).setUnlocalizedName("gashacon_bugvisor_genmu").setCreativeTab(Tabs.tabex_aid);
		public static Item gashacon_bugvisor_ii_poppy = new item_ex_aiddriver(ArmorMaterial.DIAMOND, 4, 3,"poppy",2).setMaxStackSize(1).setUnlocalizedName("gashacon_bugvisor_ii_poppy").setCreativeTab(Tabs.tabex_aid);
		public static Item gashacon_bugvisor_ii_chronos = new item_ex_aiddriver(ArmorMaterial.DIAMOND, 4, 3,"chronos",2).setMaxStackSize(1).setUnlocalizedName("gashacon_bugvisor_ii_chronos").setCreativeTab(Tabs.tabex_aid);
		public static Item gashacon_bugvisor_ii_chronos_gemdeus = new item_ex_aiddriver(ArmorMaterial.DIAMOND, 4, 3,"chronos_gemdeus",2).setMaxStackSize(1).setUnlocalizedName("gashacon_bugvisor_ii_chronos_gemdeus").setCreativeTab(Tabs.tabex_aid);
		public static Item gashacon_bugvisor_ii_lazer = new item_ex_aiddriver(ArmorMaterial.DIAMOND, 4, 3,"lazer_x",2).setMaxStackSize(1).setUnlocalizedName("gashacon_bugvisor_ii_lazer").setCreativeTab(Tabs.tabex_aid);
		public static Item gashacon_bugvisor_ii_chronicle_bugster = new item_ex_aiddriver(ArmorMaterial.DIAMOND, 4, 3,"chronicle_bugster",2).setMaxStackSize(1).setUnlocalizedName("gashacon_bugvisor_ii_chronicle_bugster").setCreativeTab(Tabs.tabex_aid);
		
		public static Item paradoxbelt = new item_ex_aiddriver(ArmorMaterial.DIAMOND, 4, 3,"paradox",3).setMaxStackSize(1).setUnlocalizedName("paradoxbelt").setCreativeTab(Tabs.tabex_aid);
		public static Item rideplayerbelt = new item_ex_aiddriver(ArmorMaterial.DIAMOND, 4, 3,"ride_player",3).setMaxStackSize(1).setUnlocalizedName("rideplayerbelt").setCreativeTab(Tabs.tabex_aid);
		public static Item rideplayerbelt_nico = new item_ex_aiddriver(ArmorMaterial.DIAMOND, 4, 3,"ride_player_nico",3).setMaxStackSize(1).setUnlocalizedName("rideplayerbelt_nico").setCreativeTab(Tabs.tabex_aid);
		public static Item ninjaplayerbelt = new item_ex_aiddriver(ArmorMaterial.DIAMOND, 4, 3,"ninjaplayer",3).setMaxStackSize(1).setUnlocalizedName("ninjaplayerbelt").setCreativeTab(Tabs.tabex_aid);
		
		
		public static Item mighty_action_x_gashat = new Item_gashat(0, 0).setUnlocalizedName("mighty_action_x_gashat").setCreativeTab(Tabs.tabex_aid);
		public static Item taddle_quest_gashat = new Item_gashat(0, 0).setUnlocalizedName("taddle_quest_gashat").setCreativeTab(Tabs.tabex_aid);
		public static Item bang_bang_shooting_gashat = new Item_gashat(0, 0).setUnlocalizedName("bang_bang_shooting_gashat").setCreativeTab(Tabs.tabex_aid);
		public static Item bakusou_bike_gashat = new Item_gashat(0, 0).setUnlocalizedName("bakusou_bike_gashat").setCreativeTab(Tabs.tabex_aid);
		public static Item proto_mighty_action_x_gashat = new Item_gashat(0, 0).setUnlocalizedName("proto_mighty_action_x_gashat").setCreativeTab(Tabs.tabex_aid);
		public static Item proto_taddle_quest_gashat = new Item_gashat(0, 0).setUnlocalizedName("proto_taddle_quest_gashat").setCreativeTab(Tabs.tabex_aid);
		public static Item proto_bang_bang_shooting_gashat = new Item_gashat(0, 0).setUnlocalizedName("proto_bang_bang_shooting_gashat").setCreativeTab(Tabs.tabex_aid);
		public static Item proto_bakusou_bike_gashat = new Item_gashat(4, 0).setUnlocalizedName("proto_bakusou_bike_gashat").setCreativeTab(Tabs.tabex_aid);
		
		public static Item proto_mighty_action_x_gashat_origin = new Item_gashat(0, 0).setUnlocalizedName("proto_mighty_action_x_gashat_origin").setCreativeTab(Tabs.tabex_aid);
		public static Item dangerous_zombie_gashat = new Item_gashat(0, 25).setUnlocalizedName("dangerous_zombie_gashat").setCreativeTab(Tabs.tabex_aid);
		public static Item kamen_rider_chronicle_gashat = new Item_gashat(4, 0).setUnlocalizedName("kamen_rider_chronicle_gashat").setCreativeTab(Tabs.tabex_aid);
		public static Item toki_meki_crisis_gashat = new Item_gashat(4, 0).setUnlocalizedName("toki_meki_crisis_gashat").setCreativeTab(Tabs.tabex_aid);
		
		public static Item mighty_brothers_xx_gashat = new Item_gashat(0, 26).setUnlocalizedName("mighty_brothers_xx_gashat").setCreativeTab(Tabs.tabex_aid);
		public static Item maximum_mighty_x_gashat = new Item_gashat(0, 0).setUnlocalizedName("maximum_mighty_x_gashat").setCreativeTab(Tabs.tabex_aid);
		public static Item hyper_muteki_gashat = new Item_gashat(0, 0).setUnlocalizedName("hyper_muteki_gashat").setCreativeTab(Tabs.tabex_aid);
		public static Item mighty_creator_vrx_gashat = new Item_gashat(0, 29).setUnlocalizedName("mighty_creator_vrx_gashat").setCreativeTab(Tabs.tabex_aid);
		
		public static Item knock_out_fighter_2_gashat = new Item_gashat(0, 30).setUnlocalizedName("knock_out_fighter_2_gashat").setCreativeTab(Tabs.tabex_aid);
		public static Item gashat_gear_dual_another = new Item_gashat(4, 0).setUnlocalizedName("gashat_gear_dual_another").setCreativeTab(Tabs.tabex_aid);
		
		public static Item gamedeus_hyper_muteki_gashat = new Item_ore().setUnlocalizedName("gamedeus_hyper_muteki_gashat").setCreativeTab(Tabs.tabex_aid);
		
		public static Item kaigan_ghost_gashat = new Item_gashat(0, 0).setUnlocalizedName("kaigan_ghost_gashat").setCreativeTab(Tabs.tabex_aid);
		public static Item full_throttle_drive_gashat = new Item_gashat(0, 0).setUnlocalizedName("full_throttle_drive_gashat").setCreativeTab(Tabs.tabex_aid);
		public static Item toukenden_gaim_gashat = new Item_gashat(0, 0).setUnlocalizedName("toukenden_gaim_gashat").setCreativeTab(Tabs.tabex_aid);
		public static Item magic_the_wizard_gashat = new Item_gashat(0, 0).setUnlocalizedName("magic_the_wizard_gashat").setCreativeTab(Tabs.tabex_aid);
		public static Item space_galaxy_fourze_gashat = new Item_gashat(0, 0).setUnlocalizedName("space_galaxy_fourze_gashat").setCreativeTab(Tabs.tabex_aid);
		public static Item jungle_ooo_gashat = new Item_gashat(0, 0).setUnlocalizedName("jungle_ooo_gashat").setCreativeTab(Tabs.tabex_aid);
		public static Item detective_double_gashat = new Item_gashat(0, 0).setUnlocalizedName("detective_double_gashat").setCreativeTab(Tabs.tabex_aid);
		public static Item barcode_warrior_decade_gashat = new Item_gashat(0, 0).setUnlocalizedName("barcode_warrior_decade_gashat").setCreativeTab(Tabs.tabex_aid);
		public static Item dokidoki_makai_castle_kiva_gashat = new Item_gashat(0, 0).setUnlocalizedName("dokidoki_makai_castle_kiva_gashat").setCreativeTab(Tabs.tabex_aid);
		public static Item time_express_den_o_gashat = new Item_gashat(0, 0).setUnlocalizedName("time_express_den_o_gashat").setCreativeTab(Tabs.tabex_aid);
		public static Item insect_wars_kabuto_gashat = new Item_gashat(0, 0).setUnlocalizedName("insect_wars_kabuto_gashat").setCreativeTab(Tabs.tabex_aid);
		public static Item taiko_master_hibik_gashat = new Item_gashat(0, 0).setUnlocalizedName("taiko_master_hibik_gashat").setCreativeTab(Tabs.tabex_aid);
		public static Item king_of_poker_blade_gashat = new Item_gashat(0, 0).setUnlocalizedName("king_of_poker_blade_gashat").setCreativeTab(Tabs.tabex_aid);
		public static Item moshi_moshi_faiz_gashat = new Item_gashat(0, 0).setUnlocalizedName("moshi_moshi_faiz_gashat").setCreativeTab(Tabs.tabex_aid);
		public static Item mirror_labryinth_ryuki_gashat = new Item_gashat(0, 0).setUnlocalizedName("mirror_labryinth_ryuki_gashat").setCreativeTab(Tabs.tabex_aid);
		public static Item agito_of_the_sun_gashat = new Item_gashat(0, 0).setUnlocalizedName("agito_of_the_sun_gashat").setCreativeTab(Tabs.tabex_aid);
		public static Item adventure_guy_kuuga_gashat = new Item_gashat(0, 0).setUnlocalizedName("adventure_guy_kuuga_gashat").setCreativeTab(Tabs.tabex_aid);
		public static Item lets_go_ichigou_gashat = new Item_gashat(0, 0).setUnlocalizedName("lets_go_ichigou_gashat").setCreativeTab(Tabs.tabex_aid);
		public static Item kamen_rider_build_gashat = new Item_gashat(4, 0).setUnlocalizedName("kamen_rider_build_gashat").setCreativeTab(Tabs.tabex_aid);
		
		
		public static Item gekitotsu_robots_gashat = new Item_gashat(1, 1).setUnlocalizedName("gekitotsu_robots_gashat").setCreativeTab(Tabs.tabex_aid);
		public static Item proto_gekitotsu_robots_gashat = new Item_gashat(1, 2).setUnlocalizedName("proto_gekitotsu_robots_gashat").setCreativeTab(Tabs.tabex_aid);
		
		public static Item doremifa_beat_gashat = new Item_gashat(1, 3).setUnlocalizedName("doremifa_beat_gashat").setCreativeTab(Tabs.tabex_aid);
		public static Item proto_doremifa_beat_gashat = new Item_gashat(1, 4).setUnlocalizedName("proto_doremifa_beat_gashat").setCreativeTab(Tabs.tabex_aid);
		
		public static Item jet_combat_gashat = new Item_gashat(1, 5).setUnlocalizedName("jet_combat_gashat").setCreativeTab(Tabs.tabex_aid);
		public static Item proto_jet_combat_gashat = new Item_gashat(1, 6).setUnlocalizedName("proto_jet_combat_gashat").setCreativeTab(Tabs.tabex_aid);
		
		public static Item giri_giri_chambara_gashat = new Item_gashat(0, 14).setUnlocalizedName("giri_giri_chambara_gashat").setCreativeTab(Tabs.tabex_aid);
		public static Item proto_giri_giri_chambara_gashat = new Item_gashat(0, 15).setUnlocalizedName("proto_giri_giri_chambara_gashat").setCreativeTab(Tabs.tabex_aid);
		
		public static Item shakariki_sports_gashat = new Item_gashat(1, 7).setUnlocalizedName("shakariki_sports_gashat").setCreativeTab(Tabs.tabex_aid);
		public static Item proto_shakariki_sports_gashat = new Item_gashat(1, 8).setUnlocalizedName("proto_shakariki_sports_gashat").setCreativeTab(Tabs.tabex_aid);
		
		
		
		public static Item drago_knight_hunter_z_gashat = new Item_gashat(1, 9).setUnlocalizedName("drago_knight_hunter_z_gashat").setCreativeTab(Tabs.tabex_aid);
		public static Item proto_drago_knight_hunter_z_gashat = new Item_gashat(4, 0).setUnlocalizedName("proto_drago_knight_hunter_z_gashat").setCreativeTab(Tabs.tabex_aid);
		
		public static Item ju_ju_burger_gashat = new Item_gashat(1, 17).setUnlocalizedName("ju_ju_burger_gashat").setCreativeTab(Tabs.tabex_aid);
		public static Item night_of_safari_gashat = new Item_gashat(1, 21).setUnlocalizedName("night_of_safari_gashat").setCreativeTab(Tabs.tabex_aid);
		
		public static Item taddle_fantasy_gashat = new Item_gashat(1, 22).setUnlocalizedName("taddle_fantasy_gashat").setCreativeTab(Tabs.tabex_aid);
		public static Item bang_bang_simulation_gashat = new Item_gashat(1, 24).setUnlocalizedName("bang_bang_simulation_gashat").setCreativeTab(Tabs.tabex_aid);
		
		public static Item perfect_puzzle_gashat = new Item_gashat(0, 0).setUnlocalizedName("perfect_puzzle_gashat").setCreativeTab(Tabs.tabex_aid);
		public static Item knock_out_fighter_gashat = new Item_gashat(0, 1).setUnlocalizedName("knock_out_fighter_gashat").setCreativeTab(Tabs.tabex_aid);
		
		
		public static Item taddle_legacy_gashat = new Item_gashat(1, 23).setUnlocalizedName("taddle_legacy_gashat").setCreativeTab(Tabs.tabex_aid);
		public static Item hurricane_ninja_gashat = new Item_gashat(4, 0).setUnlocalizedName("hurricane_ninja_gashat").setCreativeTab(Tabs.tabex_aid);
		
		public static Item bang_bang_tank_gashat = new Item_gashat(4, 0).setUnlocalizedName("bang_bang_tank_gashat").setCreativeTab(Tabs.tabex_aid);
		public static Item doctor_mighty_xx_gashat = new Item_gashat(4, 0).setUnlocalizedName("doctor_mighty_xx_gashat").setCreativeTab(Tabs.tabex_aid);
		public static Item god_maximum_mighty_x_gashat = new Item_gashat(0, 0).setUnlocalizedName("god_maximum_mighty_x_gashat").setCreativeTab(Tabs.tabex_aid);
		
		public static Item proto_bakusou_bike_combi_fukkatsu_gashat = new Item_gashat(0, 16).setUnlocalizedName("proto_bakusou_bike_combi_fukkatsu_gashat").setCreativeTab(Tabs.tabex_aid);
		
		
		public static Item pac_adventure_gashat = new Item_gashat(1, 18).setUnlocalizedName("pac_adventure_gashat").setCreativeTab(Tabs.tabex_aid);
		public static Item famitsa_gashat = new Item_gashat(1, 19).setUnlocalizedName("famitsa_gashat").setCreativeTab(Tabs.tabex_aid);
		public static Item xevious_gashat = new Item_gashat(1, 20).setUnlocalizedName("xevious_gashat").setCreativeTab(Tabs.tabex_aid);
		public static Item galaxian_gashat = new Item_gashat(1, 28).setUnlocalizedName("galaxian_gashat").setCreativeTab(Tabs.tabex_aid);
		public static Item taiko_no_tatsujin_gashat = new Item_gashat(4, 0).setUnlocalizedName("taiko_no_tatsujin_gashat").setCreativeTab(Tabs.tabex_aid);
		public static Item gabarizing_gashat = new Item_gashat(4, 0).setUnlocalizedName("gabarizing_gashat").setCreativeTab(Tabs.tabex_aid);
		
		//Build
		public static Item smash_bottle = new Item_ore().setUnlocalizedName("smash_bottle").setCreativeTab(Tabs.tabbuild);
		
		public static Item drill_crusher_gun  = new Item_ore().setUnlocalizedName("drill_crusher_gun");
		public static Item drill_crusher = new Item_swordgun(Tabs.musou_saber,energy,drill_crusher_gun).setMaxStackSize(1).setUnlocalizedName("drill_crusher").setCreativeTab(Tabs.tabbuild);
		public static Item hawk_gatlinger = new Item_gun(Tabs.gashacon_magnum_gun,energy).setMaxStackSize(1).setUnlocalizedName("hawk_gatlinger").setCreativeTab(Tabs.tabbuild);
		public static Item koma_ninpoutou = new ItemBaseSword(Tabs.gashacon_breaker).setMaxStackSize(1).setUnlocalizedName("koma_ninpoutou").setCreativeTab(Tabs.tabbuild);
		public static Item kaizoku_hassha = new Item_gun(Tabs.kaizoku_hassha,energy).setMaxStackSize(1).setUnlocalizedName("kaizoku_hassha").setCreativeTab(Tabs.tabbuild);
		public static Item twinbreaker  = new Item_ore().setUnlocalizedName("twinbreaker");
		public static Item twinbreaker_sword = new Item_swordgun(Tabs.musou_saber,energy,twinbreaker).setMaxStackSize(1).setUnlocalizedName("twinbreaker_sword").setCreativeTab(Tabs.tabbuild);
		public static Item beat_crosser = new ItemBaseSword(Tabs.gashacon_breaker).setMaxStackSize(1).setUnlocalizedName("beat_crosser").setCreativeTab(Tabs.tabbuild);
		public static Item full_bottle_buster_gun = new Item_ore().setUnlocalizedName("full_bottle_buster_gun");
		public static Item full_bottle_buster = new Item_swordgun(Tabs.faiz_blaster,RiderItems.energy,full_bottle_buster_gun).setMaxStackSize(1).setUnlocalizedName("full_bottle_buster").setCreativeTab(Tabs.tabbuild);
		public static Item magma_knuckle = new ItemBaseSword(Tabs.dogga_hammer).setMaxStackSize(1).setUnlocalizedName("magma_knuckle").setCreativeTab(Tabs.tabbuild);
		public static Item blizzard_knuckle = new ItemBaseSword(Tabs.dogga_hammer).setMaxStackSize(1).setUnlocalizedName("blizzard_knuckle").setCreativeTab(Tabs.tabbuild);
		
		public static Item buildhead = new item_buildarmor2(ArmorMaterial.DIAMOND, 4, 0).setMaxStackSize(1).setUnlocalizedName("buildhead").setCreativeTab(Tabs.tabbuild);
		public static Item buildtroso = new item_buildarmor(ArmorMaterial.DIAMOND, 4, 1).setMaxStackSize(1).setUnlocalizedName("buildtroso").setCreativeTab(Tabs.tabbuild);
		public static Item buildlegs = new item_buildarmor2(ArmorMaterial.DIAMOND, 4, 2).setMaxStackSize(1).setUnlocalizedName("buildlegs").setCreativeTab(Tabs.tabbuild);

		public static Item build_driver = new item_builddriver(ArmorMaterial.DIAMOND, 4, 3).setMaxStackSize(1).setUnlocalizedName("build_driver").setCreativeTab(Tabs.tabbuild);
		public static Item build_driver_cross_z = new item_builddriver(ArmorMaterial.DIAMOND, 4, 3).setMaxStackSize(1).setUnlocalizedName("build_driver_cross_z").setCreativeTab(Tabs.tabbuild);
		public static Item build_driver_grease = new item_builddriver(ArmorMaterial.DIAMOND, 4, 3).setMaxStackSize(1).setUnlocalizedName("build_driver_grease").setCreativeTab(Tabs.tabbuild);
		public static Item build_driver_rogue = new item_builddriver(ArmorMaterial.DIAMOND, 4, 3).setMaxStackSize(1).setUnlocalizedName("build_driver_rogue").setCreativeTab(Tabs.tabbuild);
		public static Item build_driver_blood = new item_builddriver(ArmorMaterial.DIAMOND, 4, 3).setMaxStackSize(1).setUnlocalizedName("build_driver_blood").setCreativeTab(Tabs.tabbuild);
		public static Item build_driver_killbas = new item_builddriver(ArmorMaterial.DIAMOND, 4, 3).setMaxStackSize(1).setUnlocalizedName("build_driver_killbas").setCreativeTab(Tabs.tabbuild);		
		
		public static Item sclash_driver_grease = new item_builddriver(ArmorMaterial.DIAMOND, 4, 3).setMaxStackSize(1).setUnlocalizedName("sclash_driver_grease").setCreativeTab(Tabs.tabbuild);
		public static Item sclash_driver_cross_z_charge = new item_builddriver(ArmorMaterial.DIAMOND, 4, 3).setMaxStackSize(1).setUnlocalizedName("sclash_driver_cross_z_charge").setCreativeTab(Tabs.tabbuild);
		public static Item sclash_driver_rogue = new item_builddriver(ArmorMaterial.DIAMOND, 4, 3).setMaxStackSize(1).setUnlocalizedName("sclash_driver_rogue").setCreativeTab(Tabs.tabbuild);
		
		public static Item evol_driver_evol = new item_builddriver(ArmorMaterial.DIAMOND, 4, 3).setMaxStackSize(1).setUnlocalizedName("evol_driver_evol").setCreativeTab(Tabs.tabbuild);
		public static Item evol_driver_mad_rogue = new item_builddriver(ArmorMaterial.DIAMOND, 4, 3).setMaxStackSize(1).setUnlocalizedName("evol_driver_mad_rogue").setCreativeTab(Tabs.tabbuild);
		
		public static Item transteamgun = new Item_transteamgun(Tabs.den_dengu,energy).setMaxStackSize(1).setUnlocalizedName("transteamgun").setCreativeTab(Tabs.tabbuild);
		public static Item transteamgun_2 = new item_builddriver(ArmorMaterial.DIAMOND, 4, 3).setMaxStackSize(1).setUnlocalizedName("transteamgun_2");
		public static Item transteamgun_rifle = new Item_gun(Tabs.den_dengu,energy).setMaxStackSize(1).setUnlocalizedName("transteamgun_rifle").setCreativeTab(Tabs.tabbuild);
		
		public static Item steam_blade = new ItemBaseSword(Tabs.den_denso).setMaxStackSize(1).setUnlocalizedName("steam_blade").setCreativeTab(Tabs.tabbuild);
		
		public static Item nebulasteamgun = new Item_nebulasteamgun(Tabs.den_dengu,energy).setMaxStackSize(1).setUnlocalizedName("nebulasteamgun").setCreativeTab(Tabs.tabbuild);
		public static Item nebulasteamgun_2 = new item_builddriver(ArmorMaterial.DIAMOND, 4, 3).setMaxStackSize(1).setUnlocalizedName("nebulasteamgun_2");
		public static Item nebulasteamgun_rifle = new Item_gun(Tabs.den_dengu,energy).setMaxStackSize(1).setUnlocalizedName("nebulasteamgun_rifle").setCreativeTab(Tabs.tabbuild);
		
		public static Item rabbit_full_bottle = new Item_full_bottle(0, "3").setUnlocalizedName("rabbit_full_bottle").setCreativeTab(Tabs.tabbuild);
		public static Item gorilla_full_bottle = new Item_full_bottle(1, "3").setUnlocalizedName("gorilla_full_bottle").setCreativeTab(Tabs.tabbuild);
		public static Item taka_full_bottle = new Item_full_bottle(2, "3").setUnlocalizedName("taka_full_bottle").setCreativeTab(Tabs.tabbuild);
		public static Item harinezumi_full_bottle = new Item_full_bottle(3, "3").setUnlocalizedName("harinezumi_full_bottle").setCreativeTab(Tabs.tabbuild);
		public static Item ninjya_full_bottle = new Item_full_bottle(4, "3").setUnlocalizedName("ninjya_full_bottle").setCreativeTab(Tabs.tabbuild);
		public static Item panda_full_bottle = new Item_full_bottle(5, "3").setUnlocalizedName("panda_full_bottle").setCreativeTab(Tabs.tabbuild);
		public static Item lion_full_bottle = new Item_full_bottle(6, "3").setUnlocalizedName("lion_full_bottle").setCreativeTab(Tabs.tabbuild);
		public static Item dragon_full_bottle = new Item_full_bottle(7, "3").setUnlocalizedName("dragon_full_bottle").setCreativeTab(Tabs.tabbuild);
		public static Item kaizoku_full_bottle = new Item_full_bottle(14, "3").setUnlocalizedName("kaizoku_full_bottle").setCreativeTab(Tabs.tabbuild);
		public static Item octopus_full_bottle = new Item_full_bottle(15, "3").setUnlocalizedName("octopus_full_bottle").setCreativeTab(Tabs.tabbuild);
		public static Item phoenix_full_bottle = new Item_full_bottle(16, "3").setUnlocalizedName("phoenix_full_bottle").setCreativeTab(Tabs.tabbuild);
		public static Item rose_full_bottle = new Item_full_bottle(24, "3").setUnlocalizedName("rose_full_bottle").setCreativeTab(Tabs.tabbuild);
		public static Item tora_full_bottle = new Item_full_bottle(25, "3").setUnlocalizedName("tora_full_bottle").setCreativeTab(Tabs.tabbuild);
		public static Item kujira_full_bottle = new Item_full_bottle(26, "3").setUnlocalizedName("kujira_full_bottle").setCreativeTab(Tabs.tabbuild);
		public static Item kirin_full_bottle = new Item_full_bottle(27, "3").setUnlocalizedName("kirin_full_bottle").setCreativeTab(Tabs.tabbuild);
		public static Item unicorn_full_bottle = new Item_full_bottle(28, "3").setUnlocalizedName("unicorn_full_bottle").setCreativeTab(Tabs.tabbuild);
		public static Item turtle_full_bottle = new Item_full_bottle(29, "3").setUnlocalizedName("turtle_full_bottle").setCreativeTab(Tabs.tabbuild);
		public static Item deer_full_bottle = new Item_full_bottle(30, "3").setUnlocalizedName("deer_full_bottle").setCreativeTab(Tabs.tabbuild);
		public static Item penguin_full_bottle = new Item_full_bottle(31, "3").setUnlocalizedName("penguin_full_bottle").setCreativeTab(Tabs.tabbuild);
		public static Item spider_full_bottle = new Item_full_bottle(32, "3").setUnlocalizedName("spider_full_bottle").setCreativeTab(Tabs.tabbuild);
		public static Item rabbit_gold_full_bottle = new Item_full_bottle(33, "3").setUnlocalizedName("rabbit_gold_full_bottle").setCreativeTab(Tabs.tabbuild);
		public static Item bat_full_bottle_2 = new Item_full_bottle(34, "3").setUnlocalizedName("bat_full_bottle_2").setCreativeTab(Tabs.tabbuild);
		public static Item same_full_bottle = new Item_full_bottle(35, "3").setUnlocalizedName("same_full_bottle").setCreativeTab(Tabs.tabbuild);
		public static Item hachi_full_bottle = new Item_full_bottle(36, "3").setUnlocalizedName("hachi_full_bottle").setCreativeTab(Tabs.tabbuild);
		public static Item sai_full_bottle = new Item_full_bottle(37, "3").setUnlocalizedName("sai_full_bottle").setCreativeTab(Tabs.tabbuild);
		public static Item scorpion_full_bottle = new Item_full_bottle(38, "3").setUnlocalizedName("scorpion_full_bottle").setCreativeTab(Tabs.tabbuild);

		public static Item dog_full_bottle = new Item_full_bottle(11, "3").setUnlocalizedName("dog_full_bottle").setCreativeTab(Tabs.tabbuild);
		public static Item santa_full_bottle = new Item_full_bottle(8, "3").setUnlocalizedName("santa_full_bottle").setCreativeTab(Tabs.tabbuild);
		public static Item kuma_full_bottle = new Item_full_bottle(17, "3").setUnlocalizedName("kuma_full_bottle").setCreativeTab(Tabs.tabbuild);
		public static Item wolf_full_bottle = new Item_full_bottle(21, "3").setUnlocalizedName("wolf_full_bottle").setCreativeTab(Tabs.tabbuild);
		public static Item beetle_full_bottle = new Item_full_bottle(22, "3").setUnlocalizedName("beetle_full_bottle").setCreativeTab(Tabs.tabbuild);
		
		public static Item doctor_full_bottle = new Item_full_bottle(10, "3").setUnlocalizedName("doctor_full_bottle").setCreativeTab(Tabs.tabbuild);
		public static Item orange_full_bottle = new Item_full_bottle(9, "3").setUnlocalizedName("orange_full_bottle").setCreativeTab(Tabs.tabbuild);
		public static Item mahoutskai_full_bottle = new Item_full_bottle(12, "3").setUnlocalizedName("mahoutskai_full_bottle").setCreativeTab(Tabs.tabbuild);
		public static Item tantei_full_bottle = new Item_full_bottle(13, "3").setUnlocalizedName("tantei_full_bottle").setCreativeTab(Tabs.tabbuild);
		public static Item momotaros_full_bottle = new Item_full_bottle(18, "3").setUnlocalizedName("momotaros_full_bottle").setCreativeTab(Tabs.tabbuild);
		public static Item yujou_full_bottle = new Item_full_bottle(19, "3").setUnlocalizedName("yujou_full_bottle").setCreativeTab(Tabs.tabbuild);
		public static Item obake_full_bottle = new Item_full_bottle(20, "3").setUnlocalizedName("obake_full_bottle").setCreativeTab(Tabs.tabbuild);
		public static Item card_full_bottle = new Item_full_bottle(23, "3").setUnlocalizedName("card_full_bottle").setCreativeTab(Tabs.tabbuild);
		
		public static Item tank_full_bottle = new Item_full_bottle(0, "1").setUnlocalizedName("tank_full_bottle").setCreativeTab(Tabs.tabbuild);
		public static Item diamond_full_bottle = new Item_full_bottle(1, "1").setUnlocalizedName("diamond_full_bottle").setCreativeTab(Tabs.tabbuild);
		public static Item gatling_full_bottle = new Item_full_bottle(2, "1").setUnlocalizedName("gatling_full_bottle").setCreativeTab(Tabs.tabbuild);
		public static Item soujiki_full_bottle = new Item_full_bottle(3, "1").setUnlocalizedName("soujiki_full_bottle").setCreativeTab(Tabs.tabbuild);
		public static Item comic_full_bottle = new Item_full_bottle(4, "1").setUnlocalizedName("comic_full_bottle").setCreativeTab(Tabs.tabbuild);
		public static Item rocket_full_bottle = new Item_full_bottle(5, "1").setUnlocalizedName("rocket_full_bottle").setCreativeTab(Tabs.tabbuild);
		public static Item shoubousha_full_bottle = new Item_full_bottle(6, "1").setUnlocalizedName("shoubousha_full_bottle").setCreativeTab(Tabs.tabbuild);
		public static Item lock_full_bottle = new Item_full_bottle(7, "1").setUnlocalizedName("lock_full_bottle").setCreativeTab(Tabs.tabbuild);
		public static Item ressha_full_bottle = new Item_full_bottle(13, "1").setUnlocalizedName("ressha_full_bottle").setCreativeTab(Tabs.tabbuild);
		public static Item light_full_bottle = new Item_full_bottle(14, "1").setUnlocalizedName("light_full_bottle").setCreativeTab(Tabs.tabbuild);
		public static Item robo_full_bottle = new Item_full_bottle(15, "1").setUnlocalizedName("robo_full_bottle").setCreativeTab(Tabs.tabbuild);
		public static Item helicopter_full_bottle = new Item_full_bottle(20, "1").setUnlocalizedName("helicopter_full_bottle").setCreativeTab(Tabs.tabbuild);
		public static Item ufo_full_bottle = new Item_full_bottle(21, "1").setUnlocalizedName("ufo_full_bottle").setCreativeTab(Tabs.tabbuild);
		public static Item jet_full_bottle = new Item_full_bottle(22, "1").setUnlocalizedName("jet_full_bottle").setCreativeTab(Tabs.tabbuild);
		public static Item cyclone_full_bottle = new Item_full_bottle(23, "1").setUnlocalizedName("cyclone_full_bottle").setCreativeTab(Tabs.tabbuild);
		public static Item eraser_full_bottle = new Item_full_bottle(24, "1").setUnlocalizedName("eraser_full_bottle").setCreativeTab(Tabs.tabbuild);
		public static Item watch_full_bottle = new Item_full_bottle(25, "1").setUnlocalizedName("watch_full_bottle").setCreativeTab(Tabs.tabbuild);
		public static Item pyramid_full_bottle = new Item_full_bottle(26, "1").setUnlocalizedName("pyramid_full_bottle").setCreativeTab(Tabs.tabbuild);
		public static Item skateboard_full_bottle = new Item_full_bottle(27, "1").setUnlocalizedName("skateboard_full_bottle").setCreativeTab(Tabs.tabbuild);
		public static Item fridge_full_bottle = new Item_full_bottle(28, "1").setUnlocalizedName("fridge_full_bottle").setCreativeTab(Tabs.tabbuild);
		public static Item dragon_silver_full_bottle = new Item_full_bottle(29, "1").setUnlocalizedName("dragon_silver_full_bottle").setCreativeTab(Tabs.tabbuild);
		public static Item engine_full_bottle = new Item_full_bottle(30, "1").setUnlocalizedName("engine_full_bottle").setCreativeTab(Tabs.tabbuild);
		public static Item bike_full_bottle = new Item_full_bottle(31, "1").setUnlocalizedName("bike_full_bottle").setCreativeTab(Tabs.tabbuild);
		public static Item magnet_full_bottle = new Item_full_bottle(32, "1").setUnlocalizedName("magnet_full_bottle").setCreativeTab(Tabs.tabbuild);
		public static Item submarine_full_bottle = new Item_full_bottle(33, "1").setUnlocalizedName("submarine_full_bottle").setCreativeTab(Tabs.tabbuild);
		public static Item dryer_full_bottle = new Item_full_bottle(34, "1").setUnlocalizedName("dryer_full_bottle").setCreativeTab(Tabs.tabbuild);
		public static Item gold_full_bottle = new Item_full_bottle(35, "1").setUnlocalizedName("gold_full_bottle").setCreativeTab(Tabs.tabbuild);

		public static Item rabbittank_sparkling_full_bottle = new Item_full_bottle(1, "2").setUnlocalizedName("rabbittank_sparkling_full_bottle").setCreativeTab(Tabs.tabbuild);
		public static Item hazard_trigger = new Item_full_bottle(2, "2").setUnlocalizedName("hazard_trigger").setCreativeTab(Tabs.tabbuild);
		public static Item fullfull_bottle_rabbit = new Item_full_bottle(3, "2").setUnlocalizedName("fullfull_bottle_rabbit").setCreativeTab(Tabs.tabbuild);
		public static Item fullfull_bottle_tank = new Item_full_bottle(4, "2").setUnlocalizedName("fullfull_bottle_tank").setCreativeTab(Tabs.tabbuild);
		public static Item genius_full_bottle = new Item_full_bottle(5, "2").setUnlocalizedName("genius_full_bottle").setCreativeTab(Tabs.tabbuild);
		public static Item cross_z_build_can = new Item_full_bottle(6, "2").setUnlocalizedName("cross_z_build_can").setCreativeTab(Tabs.tabbuild);
		
		public static Item mic_full_bottle = new Item_full_bottle(11, "1").setUnlocalizedName("mic_full_bottle").setCreativeTab(Tabs.tabbuild);
		public static Item cake_full_bottle = new Item_full_bottle(8, "1").setUnlocalizedName("cake_full_bottle").setCreativeTab(Tabs.tabbuild);
		public static Item televi_full_bottle = new Item_full_bottle(16, "1").setUnlocalizedName("televi_full_bottle").setCreativeTab(Tabs.tabbuild);
		public static Item smartphone_full_bottle = new Item_full_bottle(18, "1").setUnlocalizedName("smartphone_full_bottle").setCreativeTab(Tabs.tabbuild);	
		public static Item camera_full_bottle = new Item_full_bottle(19, "1").setUnlocalizedName("camera_full_bottle").setCreativeTab(Tabs.tabbuild);	
		
		public static Item game_full_bottle = new Item_full_bottle(10, "1").setUnlocalizedName("game_full_bottle").setCreativeTab(Tabs.tabbuild);
		public static Item medal_full_bottle = new Item_full_bottle(9, "1").setUnlocalizedName("medal_full_bottle").setCreativeTab(Tabs.tabbuild);
		public static Item usb_memory_full_bottle = new Item_full_bottle(12, "1").setUnlocalizedName("usb_memory_full_bottle").setCreativeTab(Tabs.tabbuild);
		public static Item parka_full_bottle = new Item_full_bottle(17, "1").setUnlocalizedName("parka_full_bottle").setCreativeTab(Tabs.tabbuild);
		public static Item low_rabbit_full_bottle = new Item_ore().setUnlocalizedName("low_rabbit_full_bottle").setCreativeTab(Tabs.tabbuild);

		public static Item dragon_sclashjelly = new Item_ore().setUnlocalizedName("dragon_sclashjelly").setCreativeTab(Tabs.tabbuild);
		public static Item robot_sclashjelly = new Item_ore().setUnlocalizedName("robot_sclashjelly").setCreativeTab(Tabs.tabbuild);
		public static Item crocodile_crack_full_bottle = new Item_ore().setUnlocalizedName("crocodile_crack_full_bottle").setCreativeTab(Tabs.tabbuild);
		
		public static Item bat_full_bottle = new Item_full_bottle(0, "4").setUnlocalizedName("bat_full_bottle").setCreativeTab(Tabs.tabbuild);
		public static Item cobra_full_bottle = new Item_full_bottle(1, "4").setUnlocalizedName("cobra_full_bottle").setCreativeTab(Tabs.tabbuild);		
		public static Item fukurou_full_bottle = new Item_ore().setUnlocalizedName("fukurou_full_bottle").setCreativeTab(Tabs.tabbuild);
		public static Item kuwagata_full_bottle = new Item_ore().setUnlocalizedName("kuwagata_full_bottle").setCreativeTab(Tabs.tabbuild);
		public static Item castle_full_bottle = new Item_ore().setUnlocalizedName("castle_full_bottle").setCreativeTab(Tabs.tabbuild);
		
		public static Item gear_engine = new Item_full_bottle(0, "5").setUnlocalizedName("gear_engine").setCreativeTab(Tabs.tabbuild);
		public static Item gear_remocon = new Item_full_bottle(1, "5").setUnlocalizedName("gear_remocon").setCreativeTab(Tabs.tabbuild);
		public static Item gear_red = new Item_full_bottle(2, "5").setUnlocalizedName("gear_red").setCreativeTab(Tabs.tabbuild);
		public static Item gear_blue = new Item_full_bottle(3, "5").setUnlocalizedName("gear_blue").setCreativeTab(Tabs.tabbuild);		
		
		public static Item cobra_evol_bottle = new Item_full_bottle(0, "6").setUnlocalizedName("cobra_evol_bottle").setCreativeTab(Tabs.tabbuild);
		public static Item rider_system_evol_bottle = new Item_ore().setUnlocalizedName("rider_system_evol_bottle").setCreativeTab(Tabs.tabbuild);
		public static Item dragon_evol_bottle = new Item_full_bottle(1, "6").setUnlocalizedName("dragon_evol_bottle").setCreativeTab(Tabs.tabbuild);
		public static Item rabbit_evol_bottle = new Item_full_bottle(2, "6").setUnlocalizedName("rabbit_evol_bottle").setCreativeTab(Tabs.tabbuild);
		
		public static Item dragon_magma_full_bottle = new Item_full_bottle(1, "7").setUnlocalizedName("dragon_magma_full_bottle").setCreativeTab(Tabs.tabbuild);
		public static Item dragon_evol_bottle_gold = new Item_full_bottle(2, "7").setUnlocalizedName("dragon_evol_bottle_gold").setCreativeTab(Tabs.tabbuild);
		public static Item muscle_galaxy_full_bottle = new Item_full_bottle(3, "7").setUnlocalizedName("muscle_galaxy_full_bottle").setCreativeTab(Tabs.tabbuild);
		public static Item north_blizzard_full_bottle = new Item_ore().setUnlocalizedName("north_blizzard_full_bottle").setCreativeTab(Tabs.tabbuild);
		public static Item prime_rogue_full_bottle = new Item_ore().setUnlocalizedName("prime_rogue_full_bottle").setCreativeTab(Tabs.tabbuild);
		
		public static Item evol_trigger = new Item_full_bottle(3, "6").setUnlocalizedName("evol_trigger").setCreativeTab(Tabs.tabbuild);
		
		public static Item lost_bat_full_bottle = new Item_ore().setUnlocalizedName("lost_bat_full_bottle").setCreativeTab(Tabs.tabbuild);
		public static Item lost_cobra_full_bottle = new Item_ore().setUnlocalizedName("lost_cobra_full_bottle").setCreativeTab(Tabs.tabbuild);
		public static Item lost_castle_full_bottle = new Item_ore().setUnlocalizedName("lost_castle_full_bottle").setCreativeTab(Tabs.tabbuild);
		public static Item lost_kuwagata_full_bottle = new Item_ore().setUnlocalizedName("lost_kuwagata_full_bottle").setCreativeTab(Tabs.tabbuild);
		public static Item lost_fukurou_full_bottle = new Item_ore().setUnlocalizedName("lost_fukurou_full_bottle").setCreativeTab(Tabs.tabbuild);
		public static Item lost_hammer_full_bottle = new Item_ore().setUnlocalizedName("lost_hammer_full_bottle").setCreativeTab(Tabs.tabbuild);
		public static Item lost_shimauma_full_bottle = new Item_ore().setUnlocalizedName("lost_shimauma_full_bottle").setCreativeTab(Tabs.tabbuild);
		public static Item lost_spanner_full_bottle = new Item_ore().setUnlocalizedName("lost_spanner_full_bottle").setCreativeTab(Tabs.tabbuild);
		public static Item lost_hasami_full_bottle = new Item_ore().setUnlocalizedName("lost_hasami_full_bottle").setCreativeTab(Tabs.tabbuild);
		public static Item lost_cd_full_bottle = new Item_ore().setUnlocalizedName("lost_cd_full_bottle").setCreativeTab(Tabs.tabbuild);
		
		public static Item build_driver_rabbit = new Item_ore().setUnlocalizedName("build_driver_rabbit");
		public static Item build_driver_gorilla = new Item_ore().setUnlocalizedName("build_driver_gorilla");
		public static Item build_driver_taka = new Item_ore().setUnlocalizedName("build_driver_taka");
		public static Item build_driver_harinezumi = new Item_ore().setUnlocalizedName("build_driver_harinezumi");
		public static Item build_driver_ninja = new Item_ore().setUnlocalizedName("build_driver_ninja");
		public static Item build_driver_panda = new Item_ore().setUnlocalizedName("build_driver_panda");
		public static Item build_driver_lion = new Item_ore().setUnlocalizedName("build_driver_lion");
		public static Item build_driver_dragon = new Item_ore().setUnlocalizedName("build_driver_dragon");
		public static Item build_driver_santa = new Item_ore().setUnlocalizedName("build_driver_santa");
		public static Item build_driver_orange = new Item_ore().setUnlocalizedName("build_driver_orange");
		public static Item build_driver_doctor = new Item_ore().setUnlocalizedName("build_driver_doctor");
		public static Item build_driver_dog = new Item_ore().setUnlocalizedName("build_driver_dog");
		public static Item build_driver_mahoutsukai = new Item_ore().setUnlocalizedName("build_driver_mahoutsukai");
		public static Item build_driver_tantei = new Item_ore().setUnlocalizedName("build_driver_tantei");
		public static Item build_driver_kaizoku = new Item_ore().setUnlocalizedName("build_driver_kaizoku");
		public static Item build_driver_octopus = new Item_ore().setUnlocalizedName("build_driver_octopus");
		public static Item build_driver_phoenix = new Item_ore().setUnlocalizedName("build_driver_phoenix");
		public static Item build_driver_kuma = new Item_ore().setUnlocalizedName("build_driver_kuma");
		public static Item build_driver_momotaros = new Item_ore().setUnlocalizedName("build_driver_momotaros");
		public static Item build_driver_yujou = new Item_ore().setUnlocalizedName("build_driver_yujou");
		public static Item build_driver_obake = new Item_ore().setUnlocalizedName("build_driver_obake");
		public static Item build_driver_wolf = new Item_ore().setUnlocalizedName("build_driver_wolf");
		public static Item build_driver_beetle = new Item_ore().setUnlocalizedName("build_driver_beetle");
		public static Item build_driver_card = new Item_ore().setUnlocalizedName("build_driver_card");
		public static Item build_driver_rose = new Item_ore().setUnlocalizedName("build_driver_rose");
		public static Item build_driver_tora = new Item_ore().setUnlocalizedName("build_driver_tora");
		public static Item build_driver_kujira = new Item_ore().setUnlocalizedName("build_driver_kujira");
		public static Item build_driver_kirin = new Item_ore().setUnlocalizedName("build_driver_kirin");
		public static Item build_driver_unicorn = new Item_ore().setUnlocalizedName("build_driver_unicorn");
		public static Item build_driver_turtle = new Item_ore().setUnlocalizedName("build_driver_turtle");
		public static Item build_driver_deer = new Item_ore().setUnlocalizedName("build_driver_deer");
		public static Item build_driver_penguin = new Item_ore().setUnlocalizedName("build_driver_penguin");
		public static Item build_driver_spider = new Item_ore().setUnlocalizedName("build_driver_spider");
		public static Item build_driver_rabbit_gold = new Item_ore().setUnlocalizedName("build_driver_rabbit_gold");
		public static Item build_driver_scorpion = new Item_ore().setUnlocalizedName("build_driver_scorpion");
		
		public static Item build_driver_tank = new Item_ore().setUnlocalizedName("build_driver_tank");			
		public static Item build_driver_diamond = new Item_ore().setUnlocalizedName("build_driver_diamond");
		public static Item build_driver_gatling = new Item_ore().setUnlocalizedName("build_driver_gatling");
		public static Item build_driver_soujiki = new Item_ore().setUnlocalizedName("build_driver_soujiki");
		public static Item build_driver_comic = new Item_ore().setUnlocalizedName("build_driver_comic");
		public static Item build_driver_rocket = new Item_ore().setUnlocalizedName("build_driver_rocket");
		public static Item build_driver_shoubousha = new Item_ore().setUnlocalizedName("build_driver_shoubousha");
		public static Item build_driver_lock = new Item_ore().setUnlocalizedName("build_driver_lock");
		public static Item build_driver_cake = new Item_ore().setUnlocalizedName("build_driver_cake");
		public static Item build_driver_medal = new Item_ore().setUnlocalizedName("build_driver_medal");
		public static Item build_driver_game = new Item_ore().setUnlocalizedName("build_driver_game");
		public static Item build_driver_mic = new Item_ore().setUnlocalizedName("build_driver_mic");
		public static Item build_driver_usb_memory = new Item_ore().setUnlocalizedName("build_driver_usb_memory");
		public static Item build_driver_densha = new Item_ore().setUnlocalizedName("build_driver_densha");
		public static Item build_driver_light = new Item_ore().setUnlocalizedName("build_driver_light");
		public static Item build_driver_robo = new Item_ore().setUnlocalizedName("build_driver_robo");
		public static Item build_driver_televi = new Item_ore().setUnlocalizedName("build_driver_televi");
		public static Item build_driver_parka = new Item_ore().setUnlocalizedName("build_driver_parka");
		public static Item build_driver_smartphone = new Item_ore().setUnlocalizedName("build_driver_smartphone");
		public static Item build_driver_camera = new Item_ore().setUnlocalizedName("build_driver_camera");
		public static Item build_driver_helicopter = new Item_ore().setUnlocalizedName("build_driver_helicopter");
		public static Item build_driver_ufo = new Item_ore().setUnlocalizedName("build_driver_ufo");
		public static Item build_driver_jet = new Item_ore().setUnlocalizedName("build_driver_jet");
		public static Item build_driver_cyclone = new Item_ore().setUnlocalizedName("build_driver_cyclone");
		public static Item build_driver_eraser = new Item_ore().setUnlocalizedName("build_driver_eraser");
		public static Item build_driver_watch = new Item_ore().setUnlocalizedName("build_driver_watch");
		public static Item build_driver_pyramid = new Item_ore().setUnlocalizedName("build_driver_pyramid");
		public static Item build_driver_skateboard = new Item_ore().setUnlocalizedName("build_driver_skateboard");
		public static Item build_driver_fridge = new Item_ore().setUnlocalizedName("build_driver_fridge");
		public static Item build_driver_dragon_silver = new Item_ore().setUnlocalizedName("build_driver_dragon_silver");
		public static Item build_driver_sai = new Item_ore().setUnlocalizedName("build_driver_sai");
		public static Item build_driver_gold = new Item_ore().setUnlocalizedName("build_driver_gold");
		
		public static Item build_driver_sp = new Item_ore().setUnlocalizedName("build_driver_sp");
		public static Item build_driver_hazard = new Item_ore().setUnlocalizedName("build_driver_hazard");
		public static Item build_driver_hazard_rabbit = new Item_ore().setUnlocalizedName("build_driver_hazard_rabbit");
		public static Item build_driver_hazard_tank = new Item_ore().setUnlocalizedName("build_driver_hazard_tank");
		public static Item build_driver_genius = new Item_ore().setUnlocalizedName("build_driver_genius");
		public static Item build_driver_cross_z_build = new Item_ore().setUnlocalizedName("build_driver_cross_z_build");
		
		public static Item hawk_gatling_wings = new Item_ore().setUnlocalizedName("hawk_gatling_wings");
		public static Item phoenix_robo_wings = new Item_ore().setUnlocalizedName("phoenix_robo_wings");
		
		public static Item evol_driver_cobra = new Item_ore().setUnlocalizedName("evol_driver_cobra");
		public static Item evol_driver_dragon = new Item_ore().setUnlocalizedName("evol_driver_dragon");
		public static Item evol_driver_rabbit = new Item_ore().setUnlocalizedName("evol_driver_rabbit");
		public static Item evol_driver_blackhole = new Item_ore().setUnlocalizedName("evol_driver_blackhole");
		
		public static Item build_driver_cross_z_dragon = new Item_ore().setUnlocalizedName("build_driver_cross_z_dragon");
		public static Item build_driver_magma = new Item_ore().setUnlocalizedName("build_driver_magma");
		public static Item build_driver_cross_z_great = new Item_ore().setUnlocalizedName("build_driver_cross_z_great");
		public static Item build_driver_galaxy = new Item_ore().setUnlocalizedName("build_driver_galaxy");
		
		//Zi-O
		public static Item zi_o_head = new item_zi_o_armor(ArmorMaterial.DIAMOND, 4, 0).setMaxStackSize(1).setUnlocalizedName("zi_o_head").setCreativeTab(Tabs.tab_zi_o);
		public static Item zi_o_torso = new item_zi_o_armor_2(ArmorMaterial.DIAMOND, 4, 1).setMaxStackSize(1).setUnlocalizedName("zi_o_torso").setCreativeTab(Tabs.tab_zi_o);
		public static Item zi_o_legs = new item_zi_o_armor_2(ArmorMaterial.DIAMOND, 4, 2).setMaxStackSize(1).setUnlocalizedName("zi_o_legs").setCreativeTab(Tabs.tab_zi_o);

		public static Item zikuu_driver_zi_o = new item_zi_o_driver(ArmorMaterial.DIAMOND, 4, 3, "zi-o", 0).setMaxStackSize(1).setUnlocalizedName("zikuu_driver_zi_o").setCreativeTab(Tabs.tab_zi_o);
		public static Item zikuu_driver_geiz = new item_zi_o_driver(ArmorMaterial.DIAMOND, 4, 3, "geiz", 0).setMaxStackSize(1).setUnlocalizedName("zikuu_driver_geiz").setCreativeTab(Tabs.tab_zi_o);
				
		public static Item zikuu_driver_ghost = new Item_ore().setUnlocalizedName("zikuu_driver_ghost");
				
		public static Item zi_o_ridewatch = new item_ridewatch(0, 0).setUnlocalizedName("zi_o_ridewatch").setCreativeTab(Tabs.tab_zi_o);
		public static Item geiz_ridewatch = new item_ridewatch(0, 0).setUnlocalizedName("geiz_ridewatch").setCreativeTab(Tabs.tab_zi_o);
				
		public static Item build_ridewatch = new item_ridewatch(1, 1).setUnlocalizedName("build_ridewatch").setCreativeTab(Tabs.tab_zi_o);
		public static Item cross_z_ridewatch = new Item_ore().setUnlocalizedName("cross_z_ridewatch").setCreativeTab(Tabs.tab_zi_o);
		public static Item exaid_ridewatch = new item_ridewatch(1, 2).setUnlocalizedName("exaid_ridewatch").setCreativeTab(Tabs.tab_zi_o);
		public static Item genm_ridewatch = new item_ridewatch(1, 19).setUnlocalizedName("genm_ridewatch").setCreativeTab(Tabs.tab_zi_o);
		public static Item ghost_ridewatch = new item_ridewatch(1, 3).setUnlocalizedName("ghost_ridewatch").setCreativeTab(Tabs.tab_zi_o);
		public static Item drive_ridewatch = new item_ridewatch(1, 4).setUnlocalizedName("drive_ridewatch").setCreativeTab(Tabs.tab_zi_o);
		// public static Item gaim_ridewatch = new item_ridewatch(1, 5).setUnlocalizedName("gaim_ridewatch").setCreativeTab(Tabs.tab_zi_o);
		public static Item wizard_ridewatch = new item_ridewatch(1, 6).setUnlocalizedName("wizard_ridewatch").setCreativeTab(Tabs.tab_zi_o);
		public static Item beast_ridewatch = new Item_ore().setUnlocalizedName("beast_ridewatch").setCreativeTab(Tabs.tab_zi_o);
		public static Item fourze_ridewatch = new item_ridewatch(1, 7).setUnlocalizedName("fourze_ridewatch").setCreativeTab(Tabs.tab_zi_o);
		public static Item ooo_ridewatch = new item_ridewatch(1, 8).setUnlocalizedName("ooo_ridewatch").setCreativeTab(Tabs.tab_zi_o);
		// public static Item w_ridewatch = new item_ridewatch(1, 9).setUnlocalizedName("w_ridewatch").setCreativeTab(Tabs.tab_zi_o);
		// public static Item kiva_ridewatch = new item_ridewatch(1, 10).setUnlocalizedName("kiva_ridewatch").setCreativeTab(Tabs.tab_zi_o);
		public static Item deno_ridewatch = new item_ridewatch(1, 11).setUnlocalizedName("deno_ridewatch").setCreativeTab(Tabs.tab_zi_o);
		public static Item hibiki_ridewatch = new item_ridewatch(1, 12).setUnlocalizedName("hibiki_ridewatch").setCreativeTab(Tabs.tab_zi_o);
		public static Item kabuto_ridewatch = new item_ridewatch(1, 13).setUnlocalizedName("kabuto_ridewatch").setCreativeTab(Tabs.tab_zi_o);
		// public static Item blade_ridewatch = new item_ridewatch(1, 14).setUnlocalizedName("blade_ridewatch").setCreativeTab(Tabs.tab_zi_o);
		public static Item faiz_ridewatch = new item_ridewatch(1, 15).setUnlocalizedName("faiz_ridewatch").setCreativeTab(Tabs.tab_zi_o);
		public static Item ryuki_ridewatch = new item_ridewatch(1, 16).setUnlocalizedName("ryuki_ridewatch").setCreativeTab(Tabs.tab_zi_o);
		// public static Item agito_ridewatch = new item_ridewatch(1, 17).setUnlocalizedName("agito_ridewatch").setCreativeTab(Tabs.tab_zi_o);
		// public static Item kuuga_ridewatch = new item_ridewatch(1, 18).setUnlocalizedName("kuuga_ridewatch").setCreativeTab(Tabs.tab_zi_o);
		
		public static Item amazonshead = new item_amazonsarmor(ArmorMaterial.DIAMOND, 4, 0).setMaxStackSize(1).setUnlocalizedName("amazonshead").setCreativeTab(Tabs.tabamazons);
		public static Item amazonstroso = new item_amazonsarmor2(ArmorMaterial.DIAMOND, 4, 1).setMaxStackSize(1).setUnlocalizedName("amazonstroso").setCreativeTab(Tabs.tabamazons);
		public static Item amazonslegs = new item_amazonsarmor2(ArmorMaterial.DIAMOND, 4, 2).setMaxStackSize(1).setUnlocalizedName("amazonslegs").setCreativeTab(Tabs.tabamazons);

		public static Item amazons_driver_omega = new item_amazonsdriver(ArmorMaterial.DIAMOND, 4, 3,"amazon_omega").setMaxStackSize(1).setUnlocalizedName("amazons_driver_omega").setCreativeTab(Tabs.tabamazons);
		public static Item neo_amazons_driver_omega = new item_amazonsdriver(ArmorMaterial.DIAMOND, 4, 3,"amazon_new_omega").setMaxStackSize(1).setUnlocalizedName("neo_amazons_driver_omega").setCreativeTab(Tabs.tabamazons);
		public static Item amazons_driver_alpha = new item_amazonsdriver(ArmorMaterial.DIAMOND, 4, 3,"amazon_alpha").setMaxStackSize(1).setUnlocalizedName("amazons_driver_alpha").setCreativeTab(Tabs.tabamazons);
		public static Item amazons_driver_blind_alpha = new item_amazonsdriver(ArmorMaterial.DIAMOND, 4, 3,"amazon_alpha_blind").setMaxStackSize(1).setUnlocalizedName("amazons_driver_blind_alpha").setCreativeTab(Tabs.tabamazons);
		public static Item neo_amazons_driver_neo_alpha = new item_amazonsdriver(ArmorMaterial.DIAMOND, 4, 3,"amazon_neo_alpha").setMaxStackSize(1).setUnlocalizedName("neo_amazons_driver_neo_alpha").setCreativeTab(Tabs.tabamazons);
		public static Item amazons_driver_sigma = new item_amazonsdriver(ArmorMaterial.DIAMOND, 4, 3,"amazon_sigma").setMaxStackSize(1).setUnlocalizedName("amazons_driver_sigma").setCreativeTab(Tabs.tabamazons);
		public static Item neo_amazons_driver_neo = new item_amazonsdriver(ArmorMaterial.DIAMOND, 4, 3,"amazon_neo").setMaxStackSize(1).setUnlocalizedName("neo_amazons_driver_neo").setCreativeTab(Tabs.tabamazons);

		public static Item condorer_core_alpha = new Item_ore().setUnlocalizedName("condorer_core_alpha").setCreativeTab(Tabs.tabamazons);
		public static Item condorer_core_omega = new Item_ore().setUnlocalizedName("condorer_core_omega").setCreativeTab(Tabs.tabamazons);
		public static Item condorer_core_sigma = new Item_ore().setUnlocalizedName("condorer_core_sigma").setCreativeTab(Tabs.tabamazons);
		public static Item condorer_core_blind_alpha = new Item_ore().setUnlocalizedName("condorer_core_blind_alpha").setCreativeTab(Tabs.tabamazons);
		
		public static Item amazon_injector_neo = new Item_ore().setUnlocalizedName("amazon_injector_neo").setCreativeTab(Tabs.tabamazons);
		public static Item amazon_injector_new_omega = new Item_ore().setUnlocalizedName("amazon_injector_new_omega").setCreativeTab(Tabs.tabamazons);
		public static Item amazon_injector_neo_alpha = new Item_ore().setUnlocalizedName("amazon_injector_neo_alpha").setCreativeTab(Tabs.tabamazons);
		
			public static void init(){

			

	}


	public static void register(){
		
		
		GameRegistry.registerItem(energy , "energy");
		
		GameRegistry.registerItem(donut , "donut");
		GameRegistry.registerItem(icepop1 , "icepop1");
		GameRegistry.registerItem(icepop2 , "icepop2");
		GameRegistry.registerItem(icepop3 , "icepop3");
		
		GameRegistry.registerBlock(stone_kuuga, "stone_kuuga");
		GameRegistry.registerBlock(stone_agito, "stone_agito");
		GameRegistry.registerBlock(hellrock_agito, "hellrock_agito");
		GameRegistry.registerBlock(advent_glass, "advent_glass");
		GameRegistry.registerBlock(hell_advent_glass, "hell_advent_glass");
		GameRegistry.registerBlock(mission_memory_block, "mission_memory_block");
		GameRegistry.registerBlock(bladecard_block, "bladecard_block");
		GameRegistry.registerBlock(bladecard_hellrock, "bladecard_hellrock");
		GameRegistry.registerBlock(oni_ore_block, "oni_ore_block");
		GameRegistry.registerBlock(oni_ore_hellrock, "oni_ore_hellrock");
		GameRegistry.registerBlock(zectblock, "zectblock");
		GameRegistry.registerBlock(neozecthellrock, "neozecthellrock");
		GameRegistry.registerBlock(imaginsandblock, "imaginsandblock");
		GameRegistry.registerBlock(hellimaginsandblock, "hellimaginsandblock");
		GameRegistry.registerBlock(fuestleblock, "fuestleblock");
		GameRegistry.registerBlock(fuestlehellrock, "fuestlehellrock");
		GameRegistry.registerBlock(card_stone, "card_stone");
		GameRegistry.registerBlock(card_hellrock, "card_hellrock");
		GameRegistry.registerBlock(gaiamemoryblock, "gaiamemoryblock");
		GameRegistry.registerBlock(gaiamemoryhellrock, "gaiamemoryhellrock");
		GameRegistry.registerBlock(cellmedalblock, "cellmedalblock");
		GameRegistry.registerBlock(ooo_hellrock, "ooo_hellrock");
		GameRegistry.registerBlock(astroswitchblock, "astroswitchblock");
		GameRegistry.registerBlock(swichhellrock, "swichhellrock");
		GameRegistry.registerBlock(wizardgemblock, "wizardgemblock");
		GameRegistry.registerBlock(hellwizardgemblock, "hellwizardgemblock");
		GameRegistry.registerBlock(himawari_lockseedblock, "himawari_lockseedblock");
		GameRegistry.registerBlock(hellrock_lockseedblock, "hellrock_lockseedblock");
		GameRegistry.registerBlock(drive_stone, "drive_stone");
		GameRegistry.registerBlock(hellrock_drive, "hellrock_drive");
		GameRegistry.registerBlock(ghost_Iconsblock, "ghost_Iconsblock");
		GameRegistry.registerBlock(ghost_Icons_hellrock, "ghost_Icons_hellrock");
		GameRegistry.registerBlock(bugsters_stone, "bugsters_stone");
		GameRegistry.registerBlock(gemdeus_stone, "gemdeus_stone");
		GameRegistry.registerBlock(pandora_box, "pandora_box");
		GameRegistry.registerBlock(pandora_box_hellrock, "pandora_box_hellrock");
		GameRegistry.registerBlock(pandora_box_hellrock_2, "pandora_box_hellrock_2");
		GameRegistry.registerBlock(watch_stone, "watch_stone");
		GameRegistry.registerBlock(amazon_cell_block, "amazon_cell_block");
		
		GameRegistry.registerItem(agito_of_seed, "agito_of_seed");
		GameRegistry.registerItem(g3core, "g3core");
		GameRegistry.registerItem(blank_mission_memory, "blank_mission_memory");
		GameRegistry.registerItem(bladecard, "bladecard");
		GameRegistry.registerItem(oni_ore, "oni_ore");
		GameRegistry.registerItem(oni_orehell, "oni_orehell");
		GameRegistry.registerItem(imaginsand, "imaginsand");
		GameRegistry.registerItem(mini_zecter, "mini_zecter");
		GameRegistry.registerItem(unfinished_kabutick_zecter, "unfinished_kabutick_zecter");
		GameRegistry.registerItem(fuestle, "fuestle");
		GameRegistry.registerItem(fuestlefake, "fuestlefake");
		GameRegistry.registerItem(blankcard, "blankcard");
		GameRegistry.registerItem(gaiamemory, "gaiamemory");
		GameRegistry.registerItem(t2gaiamemory, "t2gaiamemory");
		GameRegistry.registerItem(cellmedal , "cellmedal");
		GameRegistry.registerItem(astroswitch , "astroswitch");
		GameRegistry.registerItem(wizardgem , "wizardgem");
		GameRegistry.registerItem(wizardgem2 , "wizardgem2");
		GameRegistry.registerItem(himawari_lockseed , "himawari_lockseed");
		GameRegistry.registerItem(himawari_energy_lockseed , "himawari_energy_lockseed");
		GameRegistry.registerItem(ghost_Icons , "ghost_Icons");
		GameRegistry.registerItem(ghost_gammaIcons , "ghost_gammaIcons");
		GameRegistry.registerItem(blank_gashat , "blank_gashat");
		GameRegistry.registerItem(unfinished_kamen_rider_chronicle_gashat , "unfinished_kamen_rider_chronicle_gashat");
		GameRegistry.registerItem(full_bottle , "full_bottle");
		GameRegistry.registerItem(sclashjelly , "sclashjelly");
		GameRegistry.registerItem(unfinished_gear , "unfinished_gear");
		GameRegistry.registerItem(blank_watch , "blank_watch");
		GameRegistry.registerItem(amazon_cell_vial , "amazon_cell_vial");
		
		
		GameRegistry.registerItem(rider_circuit , "rider_circuit");
		
		GameRegistry.registerItem(ichigohead , "ichigohead");
		GameRegistry.registerItem(ichigotroso , "ichigotroso");
		GameRegistry.registerItem(ichigolegs , "ichigolegs");
		
		GameRegistry.registerItem(typhoon_ichigo , "typhoon_ichigo");
		GameRegistry.registerItem(typhoon_nigo , "typhoon_nigo");
		
		GameRegistry.registerItem(typhoon_shocker_rider_1 , "typhoon_shocker_rider_1");
		GameRegistry.registerItem(typhoon_shocker_rider_2 , "typhoon_shocker_rider_2");
		GameRegistry.registerItem(typhoon_shocker_rider_3 , "typhoon_shocker_rider_3");
		GameRegistry.registerItem(typhoon_shocker_rider_4 , "typhoon_shocker_rider_4");
		GameRegistry.registerItem(typhoon_shocker_rider_5 , "typhoon_shocker_rider_5");
		GameRegistry.registerItem(typhoon_shocker_rider_6 , "typhoon_shocker_rider_6");
		GameRegistry.registerItem(typhoon_shocker_rider_7 , "typhoon_shocker_rider_7");
		GameRegistry.registerItem(typhoon_shocker_rider_8 , "typhoon_shocker_rider_8");
		GameRegistry.registerItem(typhoon_shocker_rider_9 , "typhoon_shocker_rider_9");
		GameRegistry.registerItem(typhoon_shocker_rider_10 , "typhoon_shocker_rider_10");
		GameRegistry.registerItem(typhoon_shocker_rider_11 , "typhoon_shocker_rider_11");
		GameRegistry.registerItem(typhoon_shocker_rider_12 , "typhoon_shocker_rider_12");
		
		GameRegistry.registerItem(double_typhoon , "double_typhoon");
		GameRegistry.registerItem(riderman_belt , "riderman_belt");
		GameRegistry.registerItem(ridol , "ridol");
		GameRegistry.registerItem(condorer , "condorer");
		GameRegistry.registerItem(electrer , "electrer");
		GameRegistry.registerItem(charge_up , "charge_up");
		GameRegistry.registerItem(tornado , "tornado");
		GameRegistry.registerItem(cyclode , "cyclode");
		GameRegistry.registerItem(zx_belt , "zx_belt");
		GameRegistry.registerItem(king_stone , "king_stone");
		GameRegistry.registerItem(sunriser , "sunriser");
		GameRegistry.registerItem(bio_rider , "bio_rider");
		GameRegistry.registerItem(robo_rider , "robo_rider");
		
		GameRegistry.registerItem(split_king_stone , "split_king_stone");
		
		GameRegistry.registerItem(bio_rider_belt , "bio_rider_belt");
		GameRegistry.registerItem(robo_rider_belt , "robo_rider_belt");
		
		GameRegistry.registerItem(ridol_stick_l , "ridol_stick_l");
		GameRegistry.registerItem(ridol_stick , "ridol_stick");
		GameRegistry.registerItem(revolcane , "revolcane");
		GameRegistry.registerItem(vortech_shooter , "vortech_shooter");
		GameRegistry.registerItem(bio_blade , "bio_blade");
		
		GameRegistry.registerItem(typhoon_sango , "typhoon_sango");
		GameRegistry.registerItem(typhoon_yongo , "typhoon_yongo");
		
		GameRegistry.registerItem(typhoon_akarider , "typhoon_akarider");
		GameRegistry.registerItem(typhoon_aorider , "typhoon_aorider");
		GameRegistry.registerItem(typhoon_kirider , "typhoon_kirider");
		GameRegistry.registerItem(typhoon_momorider , "typhoon_momorider");
		GameRegistry.registerItem(typhoon_midorider , "typhoon_midorider");
		
		GameRegistry.registerItem(dragon_rod , "dragon_rod");
		GameRegistry.registerItem(dragon_rod_l , "dragon_rod_l");
		GameRegistry.registerItem(rising_dragon_rod_l , "rising_dragon_rod_l");
		
		GameRegistry.registerItem(pegasus_bowgun, "pegasus_bowgun");
		GameRegistry.registerItem(rising_pegasus_bowgun, "rising_pegasus_bowgun");
		
		GameRegistry.registerItem(rising_titan_sword , "rising_titan_sword");
		GameRegistry.registerItem(titan_sword , "titan_sword");
	

		GameRegistry.registerItem(kuugahead , "kuugahead");
		GameRegistry.registerItem(kuugatroso , "kuugatroso");
		GameRegistry.registerItem(kuugalegs , "kuugalegs");
		
		GameRegistry.registerItem(arcle , "arcle");
		GameRegistry.registerItem(arcle_b , "arcle_b");
		GameRegistry.registerItem(arcle_gr , "arcle_gr");
		GameRegistry.registerItem(arcle_p , "arcle_p");
		GameRegistry.registerItem(arcle_u , "arcle_u");
		GameRegistry.registerItem(arcle_ru , "arcle_ru");
		
		GameRegistry.registerItem(kuuga_growing , "kuuga_growing");
		GameRegistry.registerItem(kuuga_mighty , "kuuga_mighty");
		GameRegistry.registerItem(kuuga_dragon , "kuuga_dragon");
		GameRegistry.registerItem(kuuga_pegasus , "kuuga_pegasus");
		GameRegistry.registerItem(kuuga_titan , "kuuga_titan");
		GameRegistry.registerItem(kuuga_rising_mighty , "kuuga_rising_mighty");
		GameRegistry.registerItem(kuuga_rising_dragon , "kuuga_rising_dragon");
		GameRegistry.registerItem(kuuga_rising_pegasus , "kuuga_rising_pegasus");
		GameRegistry.registerItem(kuuga_rising_titan , "kuuga_rising_titan");
		GameRegistry.registerItem(kuuga_amazing_mighty , "kuuga_amazing_mighty");
		GameRegistry.registerItem(kuuga_ultimate, "kuuga_ultimate");
		GameRegistry.registerItem(kuuga_rising_ultimate, "kuuga_rising_ultimate");
		GameRegistry.registerItem(kuuga_super_rising_ultimate, "kuuga_super_rising_ultimate");
		
		GameRegistry.registerItem(flame_saber_charge, "flame_saber_charge");
		GameRegistry.registerItem(flame_saber, "flame_saber");
		GameRegistry.registerItem(storm_halberd, "storm_halberd");
		
		GameRegistry.registerItem(shining_caliber_single_mode, "shining_caliber_single_mode");
		GameRegistry.registerItem(shining_caliber_summoned, "shining_caliber_summoned");
		GameRegistry.registerItem(shining_caliber, "shining_caliber");
		
		GameRegistry.registerItem(agitohead, "agitohead");
		GameRegistry.registerItem(agitotroso, "agitotroso");
		GameRegistry.registerItem(agitolegs, "agitolegs");

		GameRegistry.registerItem(alter_ring, "alter_ring");
		GameRegistry.registerItem(alter_ring_fl, "alter_ring_fl");
		GameRegistry.registerItem(alter_ring_st, "alter_ring_st");
		GameRegistry.registerItem(alter_ring_shining, "alter_ring_shining");
		
		GameRegistry.registerItem(meta_factor, "meta_factor");
		GameRegistry.registerItem(meta_factor_exceed, "meta_factor_exceed");
		
		GameRegistry.registerItem(ank_point, "ank_point");
		
		GameRegistry.registerItem(g3_belt, "g3_belt");
		GameRegistry.registerItem(g3_x_belt, "g3_x_belt");
		GameRegistry.registerItem(g3_mild_belt, "g3_mild_belt");
		GameRegistry.registerItem(g4_belt, "g4_belt");
		GameRegistry.registerItem(g4_x_belt, "g4_x_belt");
		
		GameRegistry.registerItem(g1_belt, "g1_belt");
		
		GameRegistry.registerItem(alter_ring_miracle, "alter_ring_miracle");
		GameRegistry.registerItem(ank_point_burning, "ank_point_burning");
		
		GameRegistry.registerItem(agito_ground, "agito_ground");
		GameRegistry.registerItem(agito_storm, "agito_storm");
		GameRegistry.registerItem(agito_flame, "agito_flame");
		GameRegistry.registerItem(agito_trinity, "agito_trinity");
		GameRegistry.registerItem(agito_burning, "agito_burning");
		GameRegistry.registerItem(agito_shining, "agito_shining");
		
		GameRegistry.registerItem(gills, "gills");
		GameRegistry.registerItem(exceed_gills, "exceed_gills");
		
		GameRegistry.registerItem(another_agito, "another_agito");
		
		GameRegistry.registerItem(g1, "g1");
		GameRegistry.registerItem(g3, "g3");
		GameRegistry.registerItem(g3x, "g3x");
		GameRegistry.registerItem(g3mild, "g3mild");
		GameRegistry.registerItem(g4, "g4");
		GameRegistry.registerItem(g4x, "g4x");



		
		GameRegistry.registerItem(another_agito_burning_form, "another_agito_burning_form");
		GameRegistry.registerItem(agito_miracle, "agito_miracle");
		
		//ryuki
		GameRegistry.registerItem(drag_visor, "drag_visor");
		GameRegistry.registerItem(ride_saber, "ride_saber");
		GameRegistry.registerItem(drag_saber, "drag_saber");
		GameRegistry.registerItem(drag_claw, "drag_claw");
		GameRegistry.registerItem(drag_shield, "drag_shield");
		
		GameRegistry.registerItem(drag_visor_zwei_big, "drag_visor_zwei_big");
		GameRegistry.registerItem(drag_visor_zwei, "drag_visor_zwei");
		
		GameRegistry.registerItem(dark_visor, "dark_visor");
		GameRegistry.registerItem(wing_lancer_big, "wing_lancer_big");
		GameRegistry.registerItem(wing_lancer, "wing_lancer");
		GameRegistry.registerItem(dark_blade, "dark_blade");

		GameRegistry.registerItem(scissors_visor, "scissors_visor");
		GameRegistry.registerItem(scissors_pincer, "scissors_pincer");
		GameRegistry.registerItem(incisor_guard, "incisor_guard");
		
		GameRegistry.registerItem(magna_visor, "magna_visor");
		GameRegistry.registerItem(torque_guard, "torque_guard");
		
		GameRegistry.registerItem(evil_visor, "evil_visor");
		
		GameRegistry.registerItem(metal_visor, "metal_visor");
		GameRegistry.registerItem(hetal_horn, "hetal_horn");
		
		GameRegistry.registerItem(veno_visor, "veno_visor");
		GameRegistry.registerItem(veno_saber, "veno_saber");
		
		GameRegistry.registerItem(dest_visor, "dest_visor");
		GameRegistry.registerItem(dest_claws, "dest_claws");
		
		GameRegistry.registerItem(gazelle_visor, "gazelle_visor");
		
		GameRegistry.registerItem(gold_visor_big, "gold_visor_big");
		GameRegistry.registerItem(gold_visor, "gold_visor");
		GameRegistry.registerItem(gold_sabers, "gold_sabers");
		GameRegistry.registerItem(gold_shield, "gold_shield");
		
		GameRegistry.registerItem(wing_slasher_big, "wing_slasher_big");
		GameRegistry.registerItem(wing_slasher, "wing_slasher");
		GameRegistry.registerItem(wing_shield, "wing_shield");
		
		GameRegistry.registerItem(dark_drag_visor, "dark_drag_visor");
		GameRegistry.registerItem(drag_saber_ryuga, "drag_saber_ryuga");
		GameRegistry.registerItem(ryuga_drag_claw, "ryuga_drag_claw");
		GameRegistry.registerItem(ryuga_drag_shield, "ryuga_drag_shield");
		
		GameRegistry.registerItem(bio_visor, "bio_visor");
		
		GameRegistry.registerItem(blanc_visor, "blanc_visor");
		
		GameRegistry.registerItem(abyss_visor, "abyss_visor");
		GameRegistry.registerItem(abyss_saber, "abyss_saber");
		GameRegistry.registerItem(abyssmash, "abyssmash");
		
		GameRegistry.registerItem(slash_visor, "slash_visor");
		GameRegistry.registerItem(alternative_sword, "alternative_sword");

		GameRegistry.registerItem(ryukihead, "ryukihead");
		GameRegistry.registerItem(ryukitroso, "ryukitroso");
		GameRegistry.registerItem(ryukilegs, "ryukilegs");

		GameRegistry.registerItem(v_buckle, "v_buckle");
		GameRegistry.registerItem(v_buckle_ryuki, "v_buckle_ryuki");
		GameRegistry.registerItem(v_buckle_ryuki_survive, "v_buckle_ryuki_survive");
		GameRegistry.registerItem(v_buckle_knight, "v_buckle_knight");
		GameRegistry.registerItem(v_buckle_knight_survive, "v_buckle_knight_survive");
		GameRegistry.registerItem(v_buckle_scissors, "v_buckle_scissors");
		GameRegistry.registerItem(v_buckle_zolda, "v_buckle_zolda");
		GameRegistry.registerItem(v_buckle_raia, "v_buckle_raia");
		GameRegistry.registerItem(v_buckle_gai, "v_buckle_gai");
		GameRegistry.registerItem(v_buckle_ouja, "v_buckle_ouja");
		GameRegistry.registerItem(v_buckle_tiger, "v_buckle_tiger");
		GameRegistry.registerItem(v_buckle_imperer, "v_buckle_imperer");
		GameRegistry.registerItem(v_buckle_odin, "v_buckle_odin");
		GameRegistry.registerItem(v_buckle_femme, "v_buckle_femme");
		GameRegistry.registerItem(v_buckle_verde, "v_buckle_verde");
		GameRegistry.registerItem(v_buckle_ryuga, "v_buckle_ryuga");
		GameRegistry.registerItem(v_buckle_ryuga_survive, "v_buckle_ryuga_survive");
		GameRegistry.registerItem(v_buckle_abyss, "v_buckle_abyss");
		GameRegistry.registerItem(alternativebelt, "alternativebelt");
		GameRegistry.registerItem(alternativezerobelt, "alternativezerobelt");
		
		GameRegistry.registerItem(contract_advent, "contract_advent");
		
		GameRegistry.registerItem(dragreder_advent, "dragreder_advent");
		GameRegistry.registerItem(darkwing_advent, "darkwing_advent");
		GameRegistry.registerItem(volcancer_advent, "volcancer_advent");
		GameRegistry.registerItem(magnugiga_advent, "magnugiga_advent");
		GameRegistry.registerItem(evildiver_advent, "evildiver_advent");
		GameRegistry.registerItem(metalgelas_advent, "metalgelas_advent");
		GameRegistry.registerItem(venosnaker_advent, "venosnaker_advent");
		GameRegistry.registerItem(destwilder_advent, "destwilder_advent");
		GameRegistry.registerItem(gigazelle_advent, "gigazelle_advent");
		GameRegistry.registerItem(biogreeza_advent, "biogreeza_advent");
		GameRegistry.registerItem(blancwing_advent, "blancwing_advent");
		GameRegistry.registerItem(dragblacker_advent, "dragblacker_advent");
		GameRegistry.registerItem(goldphoenix_advent, "goldphoenix_advent");
		GameRegistry.registerItem(abysslasher_advent, "abysslasher_advent");
		GameRegistry.registerItem(psycorogue_advent, "psycorogue_advent");
		
		
		GameRegistry.registerItem(survive_shippu_advent, "survive_shippu_advent");
		GameRegistry.registerItem(survive_mugen_advent, "survive_mugen_advent");
		GameRegistry.registerItem(survive_advent, "survive_advent");
	
		GameRegistry.registerItem(blank_sword_vent, "blank_sword_vent");
		GameRegistry.registerItem(drag_saber_vent, "drag_saber_vent");
		GameRegistry.registerItem(drag_visor_zwei_sword_mode_vent, "drag_visor_zwei_sword_mode_vent");
		GameRegistry.registerItem(wing_lancer_vent, "wing_lancer_vent");
		GameRegistry.registerItem(dark_blade_vent, "dark_blade_vent");
		GameRegistry.registerItem(veno_saber_vent, "veno_saber_vent");
		GameRegistry.registerItem(wing_slasher_vent, "wing_slasher_vent");
		GameRegistry.registerItem(ryuga_drag_saber_vent, "ryuga_drag_saber_vent");
		GameRegistry.registerItem(gold_sabers_vent, "gold_sabers_vent");
	
		GameRegistry.registerItem(abyss_saber_vent, "abyss_saber_vent");
		GameRegistry.registerItem(alternative_sword_vent, "alternative_sword_vent");
		
		GameRegistry.registerItem(drag_claw_vent, "drag_claw_vent");
		GameRegistry.registerItem(scissors_pincer_vent, "scissors_pincer_vent");
		GameRegistry.registerItem(metal_horn_vent, "metal_horn_vent");
		GameRegistry.registerItem(dest_claws_vent, "dest_claws_vent");
		GameRegistry.registerItem(ryuga_drag_claw_vent, "ryuga_drag_claw_vent");
		GameRegistry.registerItem(abyssmash_vent, "abyssmash_vent");
		
		GameRegistry.registerItem(drag_shield_vent, "drag_shield_vent");
		GameRegistry.registerItem(shell_defense_vent, "shell_defense_vent");
		GameRegistry.registerItem(giga_armor_vent, "giga_armor_vent");
		GameRegistry.registerItem(wing_shield_vent, "wing_shield_vent");
		GameRegistry.registerItem(ryuga_drag_shield_vent, "ryuga_drag_shield_vent");
		GameRegistry.registerItem(gold_shield_vent, "gold_shield_vent");
		
		//faiz
		GameRegistry.registerItem(faiz_edge,"faiz_edge");
		GameRegistry.registerItem(faiz_blaster_gun,"faiz_blaster_gun");
		GameRegistry.registerItem(faiz_blaster,"faiz_blaster");
		GameRegistry.registerItem(kaixa_blaygun_gun,"kaixa_blaygun_gun");
		GameRegistry.registerItem(kaixa_blaygun,"kaixa_blaygun");
		GameRegistry.registerItem(deltablaster,"deltablaster");
		GameRegistry.registerItem(psyga_tonfa_edge_big,"psyga_tonfa_edge_big");
		GameRegistry.registerItem(psyga_tonfa_edge,"psyga_tonfa_edge");
		GameRegistry.registerItem(orga_stlanzer,"orga_stlanzer");
		GameRegistry.registerItem(axel_ray_gun_gun,"axel_ray_gun_gun");
		GameRegistry.registerItem(axel_ray_gun,"axel_ray_gun");

		GameRegistry.registerItem(faizhead,"faizhead");
		GameRegistry.registerItem(faiztroso,"faiztroso");
		GameRegistry.registerItem(faizlegs,"faizlegs");

		GameRegistry.registerItem(faizdriver,"faizdriver");
		GameRegistry.registerItem(kaixadriver,"kaixadriver");
		GameRegistry.registerItem(deltadriver,"deltadriver");
		GameRegistry.registerItem(psygadriver,"psygadriver");
		GameRegistry.registerItem(orgadriver,"orgadriver");
		GameRegistry.registerItem(smartbulke,"smartbulke");


		GameRegistry.registerItem(faiz_mission_memory,"faiz_mission_memory");
		GameRegistry.registerItem(faiz_axel_mission_memory,"faiz_axel_mission_memory");
		GameRegistry.registerItem(faiz_blaster_mission_memory,"faiz_blaster_mission_memory");

		GameRegistry.registerItem(kaixa_mission_memory,"kaixa_mission_memory");
		GameRegistry.registerItem(delta_mission_memory,"delta_mission_memory");
		GameRegistry.registerItem(psyga_mission_memory,"psyga_mission_memory");
		GameRegistry.registerItem(orga_mission_memory,"orga_mission_memory");
		
		//blade
		GameRegistry.registerItem(blayrouzer, "blayrouzer");
		GameRegistry.registerItem(kingrouzer, "kingrouzer");
		GameRegistry.registerItem(leanglerouzer_big, "leanglerouzer_big");
		GameRegistry.registerItem(leanglerouzer, "leanglerouzer");
		GameRegistry.registerItem(garrenrouzer, "garrenrouzer");
		GameRegistry.registerItem(chalice_arrow_big, "chalice_arrow_big");
		GameRegistry.registerItem(chalice_arrow, "chalice_arrow");
		GameRegistry.registerItem(wild_slasher, "wild_slasher");
		GameRegistry.registerItem(wild_chalice_arrow_big, "wild_chalice_arrow_big");
		GameRegistry.registerItem(wild_chalice_arrow, "wild_chalice_arrow");


		GameRegistry.registerItem(bladehead, "bladehead");
		GameRegistry.registerItem(bladetroso, "bladetroso");
		GameRegistry.registerItem(bladelegs, "bladelegs");

		GameRegistry.registerItem(bladedriver, "bladedriver");
		GameRegistry.registerItem(garrendriver, "garrendriver");
		GameRegistry.registerItem(leangle_belt, "leangle_belt");
		GameRegistry.registerItem(chalicerouzer, "chalicerouzer");
		GameRegistry.registerItem(glaive_buckle, "glaive_buckle");
		GameRegistry.registerItem(larc_buckle, "larc_buckle");
		GameRegistry.registerItem(lance_buckle, "lance_buckle");

		
		GameRegistry.registerItem(rouze_absorber, "rouze_absorber");
		GameRegistry.registerItem(garren_absorber, "garren_absorber");

		
		GameRegistry.registerItem(changebeetle, "changebeetle");
		GameRegistry.registerItem(change_stag, "change_stag");
		GameRegistry.registerItem(change_spider, "change_spider");
		GameRegistry.registerItem(change_mantis, "change_mantis");
		GameRegistry.registerItem(changekerberosglaive, "changekerberosglaive");
		GameRegistry.registerItem(changekerberoslance, "changekerberoslance");
		GameRegistry.registerItem(changekerberoslarc, "changekerberoslarc");
		GameRegistry.registerItem(fusion_eagle, "fusion_eagle");
		GameRegistry.registerItem(fusion_peacock, "fusion_peacock");
		GameRegistry.registerItem(absorb_capricorn, "absorb_capricorn");
		GameRegistry.registerItem(absorb_serpent, "absorb_serpent");
		GameRegistry.registerItem(evolution_caucasus, "evolution_caucasus");
		GameRegistry.registerItem(evolution_giraffa, "evolution_giraffa");
		GameRegistry.registerItem(evolution_paradoxa, "evolution_paradoxa");
		
		//hibiki
		GameRegistry.registerItem(ongekibo_rekka , "ongekibo_rekka");
		GameRegistry.registerItem(unfinished_armed_saber , "unfinished_armed_saber");
		GameRegistry.registerItem(armed_saber , "armed_saber");
		GameRegistry.registerItem(ongekibo_yamase , "ongekibo_yamase");
		GameRegistry.registerItem(ongekibo_rakurai , "ongekibo_rakurai");
		GameRegistry.registerItem(ongekibo_shakubyoushi , "ongekibo_shakubyoushi");
		GameRegistry.registerItem(ongekibo_nachiguro , "ongekibo_nachiguro");
		GameRegistry.registerItem(ongekibo_rokushou , "ongekibo_rokushou");
		GameRegistry.registerItem(ongekibo_gouriki , "ongekibo_gouriki");
		GameRegistry.registerItem(ongekibo_ressui , "ongekibo_ressui");		
		
		GameRegistry.registerItem(ongekikan_reppuu , "ongekikan_reppuu");	
		
		GameRegistry.registerItem(ongekigen_retsurai , "ongekigen_retsurai");
		GameRegistry.registerItem(ongeki_shingen_retsuzan , "ongeki_shingen_retsuzan");
		GameRegistry.registerItem(ongekigen_enma , "ongekigen_enma");
		GameRegistry.registerItem(ongekigen_togenkyo , "ongekigen_togenkyo");
		
		GameRegistry.registerItem(echo_sword_onsaken , "echo_sword_onsaken");
		GameRegistry.registerItem(ongekikanabo_retto , "ongekikanabo_retto");
		GameRegistry.registerItem(ongekisankaku_ressetsu , "ongekisankaku_ressetsu");
		GameRegistry.registerItem(ongeki_shincho_retsuban , "ongeki_shincho_retsuban");
		
		GameRegistry.registerItem(hibikihead , "hibikihead");
		GameRegistry.registerItem(hibikitroso , "hibikitroso");
		GameRegistry.registerItem(hibikilegs , "hibikilegs");

		GameRegistry.registerItem(hibikidriver , "hibikidriver");
		GameRegistry.registerItem(ibukidriver , "ibukidriver");
		GameRegistry.registerItem(todorokidriver , "todorokidriver");
		GameRegistry.registerItem(zankidriver , "zankidriver");
		GameRegistry.registerItem(dankidriver , "dankidriver");
		GameRegistry.registerItem(sabakidriver , "sabakidriver");
		GameRegistry.registerItem(eikidriver , "eikidriver");
		GameRegistry.registerItem(shukidriver , "shukidriver");
		GameRegistry.registerItem(goukidriver , "goukidriver");
		GameRegistry.registerItem(tokidriver , "tokidriver");
		GameRegistry.registerItem(shoukidriver , "shoukidriver");
		GameRegistry.registerItem(bankidriver , "bankidriver");
		GameRegistry.registerItem(amakidriver , "amakidriver");
		GameRegistry.registerItem(kyosukedriver , "kyosukedriver");
		GameRegistry.registerItem(kabukidriver , "kabukidriver");
		GameRegistry.registerItem(toukidriver , "toukidriver");
		GameRegistry.registerItem(kiramekidriver , "kiramekidriver");
		GameRegistry.registerItem(nishikidriver , "nishikidriver");
		GameRegistry.registerItem(habatakidriver , "habatakidriver");
		GameRegistry.registerItem(fubukidriver , "fubukidriver");

		GameRegistry.registerItem(henshin_onsa , "henshin_onsa");
		GameRegistry.registerItem(henshin_onsa_kurenai , "henshin_onsa_kurenai");
		GameRegistry.registerItem(henshin_onsa_danki , "henshin_onsa_danki");
		GameRegistry.registerItem(henshin_onsa_eiki , "henshin_onsa_eiki");
		GameRegistry.registerItem(henshin_onsa_gouki , "henshin_onsa_gouki");
		GameRegistry.registerItem(henshin_onsa_kyoki , "henshin_onsa_kyoki");
		
		GameRegistry.registerItem(henshin_onsa_kabuki , "henshin_onsa_kabuki");
		GameRegistry.registerItem(henshin_onsa_touki , "henshin_onsa_touki");
		GameRegistry.registerItem(henshin_onsa_kirameki , "henshin_onsa_kirameki");
		GameRegistry.registerItem(henshin_onsa_nishiki , "henshin_onsa_nishiki");
		GameRegistry.registerItem(henshin_onsa_habataki , "henshin_onsa_habataki");
		
		GameRegistry.registerItem(henshin_onibue_ibuki , "henshin_onibue_ibuki");
		GameRegistry.registerItem(henshin_onibue_toki , "henshin_onibue_toki");
		GameRegistry.registerItem(henshin_onibue_shouki , "henshin_onibue_shouki");
		GameRegistry.registerItem(henshin_onibue_amaki , "henshin_onibue_amaki");
		GameRegistry.registerItem(henshin_onibue_fubuki , "henshin_onibue_fubuki");
		
		GameRegistry.registerItem(henshin_kigen_todoroki , "henshin_kigen_todoroki");
		GameRegistry.registerItem(henshin_kigen_zanki , "henshin_kigen_zanki");
		GameRegistry.registerItem(henshin_kigen_shuki , "henshin_kigen_shuki");
		GameRegistry.registerItem(henshin_kigen_banki , "henshin_kigen_banki");
		GameRegistry.registerItem(henshin_kigen_sabaki , "henshin_kigen_sabaki");
		
		
		//kabuto 
		GameRegistry.registerItem(kabuto_kunai_gun , "kabuto_kunai_gun");
		GameRegistry.registerItem(kabuto_kunai , "kabuto_kunai");
		GameRegistry.registerItem(kabuto_kunai_kunai , "kabuto_kunai_kunai");
		GameRegistry.registerItem(zect_mizer , "zect_mizer");
		GameRegistry.registerItem(perfect_zecter , "perfect_zecter");

		GameRegistry.registerItem(drake_grip , "drake_grip");
		GameRegistry.registerItem(sasword_yaiver , "sasword_yaiver"); 
		
		GameRegistry.registerItem(gatack_double_calibur , "gatack_double_calibur");
		GameRegistry.registerItem(gatack_double_calibur_twin , "gatack_double_calibur_twin");
		
		GameRegistry.registerItem(zect_kunai_gun , "zect_kunai_gun");
		GameRegistry.registerItem(zect_kunai , "zect_kunai");
		GameRegistry.registerItem(zect_kunai_kunai , "zect_kunai_kunai");
		
		GameRegistry.registerItem(kabutohead , "kabutohead");
		GameRegistry.registerItem(kabutotroso , "kabutotroso");
		GameRegistry.registerItem(kabutolegs , "kabutolegs");

		GameRegistry.registerItem(kabuto_rider_belt , "kabuto_rider_belt");
		GameRegistry.registerItem(kabuto_rider_belt_cast , "kabuto_rider_belt_cast");

		GameRegistry.registerItem(thebee_rider_belt , "thebee_rider_belt");
		GameRegistry.registerItem(thebee_rider_belt_cast , "thebee_rider_belt_cast");
		
		GameRegistry.registerItem(drake_rider_belt , "drake_rider_belt");
		GameRegistry.registerItem(drake_rider_belt_cast , "drake_rider_belt_cast");
		
		GameRegistry.registerItem(sasword_rider_belt , "sasword_rider_belt");
		GameRegistry.registerItem(sasword_rider_belt_cast , "sasword_rider_belt_cast");
		
		GameRegistry.registerItem(gatack_rider_belt , "gatack_rider_belt");
		GameRegistry.registerItem(gatack_rider_belt_cast , "gatack_rider_belt_cast");
		
		GameRegistry.registerItem(kickhopper_rider_belt , "kickhopper_rider_belt");
		GameRegistry.registerItem(kickhopper_rider_belt_cast , "kickhopper_rider_belt_cast");
		
		GameRegistry.registerItem(puchhopper_rider_belt , "puchhopper_rider_belt");
		GameRegistry.registerItem(puchhopper_rider_belt_cast , "puchhopper_rider_belt_cast");
		
		GameRegistry.registerItem(dark_kabuto_rider_belt , "dark_kabuto_rider_belt");
		GameRegistry.registerItem(dark_kabuto_rider_belt_cast , "dark_kabuto_rider_belt_cast");
		
		GameRegistry.registerItem(caucasus_rider_belt , "caucasus_rider_belt");
		GameRegistry.registerItem(caucasus_rider_belt_cast , "caucasus_rider_belt_cast");
		
		GameRegistry.registerItem(hercus_rider_belt , "hercus_rider_belt");
		GameRegistry.registerItem(hercus_rider_belt_cast , "hercus_rider_belt_cast");
		
		GameRegistry.registerItem(ketaros_rider_belt , "ketaros_rider_belt");
		GameRegistry.registerItem(ketaros_rider_belt_cast , "ketaros_rider_belt_cast");
		
		GameRegistry.registerItem(kabuto_zecter , "kabuto_zecter");
		GameRegistry.registerItem(hyper_zecter , "hyper_zecter");
		GameRegistry.registerItem(thebee_zecter , "thebee_zecter");
		GameRegistry.registerItem(drake_zecter , "drake_zecter");
		GameRegistry.registerItem(sasword_zecter , "sasword_zecter");
		GameRegistry.registerItem(gatack_zecter , "gatack_zecter");
		GameRegistry.registerItem(kickhopper_zecter , "kickhopper_zecter");
		GameRegistry.registerItem(punchhopper_zecter , "punchhopper_zecter");
		GameRegistry.registerItem(dark_kabuto_zecter , "dark_kabuto_zecter");

		GameRegistry.registerItem(caucasus_zecter , "caucasus_zecter");
		GameRegistry.registerItem(hercus_zecter , "hercus_zecter");
		GameRegistry.registerItem(ketaros_zecter , "ketaros_zecter");
		

		GameRegistry.registerItem(perfectthebee_zecter , "perfectthebee_zecter");
		GameRegistry.registerItem(perfectdrake_zecter , "perfectdrake_zecter");
		GameRegistry.registerItem(perfectsasword_zecter , "perfectsasword_zecter");
		
		GameRegistry.registerItem(clock_up_pad , "clock_up_pad");
		//den-o
		GameRegistry.registerItem(den_denso , "den_denso");
		GameRegistry.registerItem(den_denro , "den_denro");
		GameRegistry.registerItem(den_denaxe , "den_denaxe");
		GameRegistry.registerItem(den_dengu , "den_dengu");
		GameRegistry.registerItem(den_denhandaxe , "den_denhandaxe");
		GameRegistry.registerItem(den_denboomerang , "den_denboomerang");
		GameRegistry.registerItem(denkamen_sword , "denkamen_sword");
		

		GameRegistry.registerItem(nega_den_gasher , "nega_den_gasher");
		GameRegistry.registerItem(gaoh_gasher , "gaoh_gasher");
		GameRegistry.registerItem(den_gasher_vega , "den_gasher_vega");
		GameRegistry.registerItem(den_denhijack , "den_denhijack");
		GameRegistry.registerItem(gden_denjutte , "gden_denjutte");
		GameRegistry.registerItem(gden_dengu , "gden_dengu");
		
		GameRegistry.registerItem(zerogasher_big , "zerogasher_big");
		GameRegistry.registerItem(zerogasher , "zerogasher");
		
		GameRegistry.registerItem(momotaken , "momotaken");
		GameRegistry.registerItem(uratazao , "uratazao");
		GameRegistry.registerItem(kintaono , "kintaono");
		GameRegistry.registerItem(macheteddy , "macheteddy");

		GameRegistry.registerItem(den_ohead , "den_ohead");
		GameRegistry.registerItem(den_otroso , "den_otroso");
		GameRegistry.registerItem(den_olegs , "den_olegs");
		
		GameRegistry.registerItem(den_odriver_bl , "den_odriver_bl");
		GameRegistry.registerItem(den_odriverrod , "den_odriverrod");
		GameRegistry.registerItem(den_odriveraxe , "den_odriveraxe");
		GameRegistry.registerItem(den_odrivergun , "den_odrivergun");
		GameRegistry.registerItem(den_odriverwing , "den_odriverwing");
		GameRegistry.registerItem(den_obeltclimax , "den_obeltclimax");
		GameRegistry.registerItem(den_odriver , "den_odriver");
		
		GameRegistry.registerItem(zeronosbelt_p , "zeronosbelt_p");
		GameRegistry.registerItem(zeronosbelt_v , "zeronosbelt_v");
		GameRegistry.registerItem(zeronosbelt_z , "zeronosbelt_z");
		GameRegistry.registerItem(zeronosbelt , "zeronosbelt");
				
		GameRegistry.registerItem(newden_obelt , "newden_obelt");
		GameRegistry.registerItem(newden_obeltvega , "newden_obeltvega");
		GameRegistry.registerItem(newden_obeltbl , "newden_obeltbl");
		
		GameRegistry.registerItem(nega_den_odriver , "nega_den_odriver");
		GameRegistry.registerItem(gaohbelt , "gaohbelt");
		GameRegistry.registerItem(yuukibelt_skull , "yuukibelt_skull");
		GameRegistry.registerItem(yuukibelt_hijack , "yuukibelt_hijack");
		GameRegistry.registerItem(gden_odriver , "gden_odriver");
		
		GameRegistry.registerItem(den_oriderpass , "den_oriderpass");
		GameRegistry.registerItem(den_o_master_pass , "den_o_master_pass");
		GameRegistry.registerItem(gden_oriderpass , "gden_oriderpass");
		
		GameRegistry.registerItem(rider_ticket , "rider_ticket");
		GameRegistry.registerItem(rider_ticket_sword , "rider_ticket_sword");
		GameRegistry.registerItem(rider_ticket_rod , "rider_ticket_rod");
		GameRegistry.registerItem(rider_ticket_ax, "rider_ticket_ax");
		GameRegistry.registerItem(rider_ticket_gun , "rider_ticket_gun");
		GameRegistry.registerItem(rider_ticket_wing , "rider_ticket_wing");
		GameRegistry.registerItem(rider_ticket_strike , "rider_ticket_strike");
		GameRegistry.registerItem(rider_ticket_nega , "rider_ticket_nega");
		GameRegistry.registerItem(rider_ticket_yuuki , "rider_ticket_yuuki");
		GameRegistry.registerItem(rider_ticket_g , "rider_ticket_g");
		GameRegistry.registerItem(rider_ticket_gaoh , "rider_ticket_gaoh");
		GameRegistry.registerItem(ktaros , "ktaros");

		GameRegistry.registerItem(zeronos_plat_card , "zeronos_plat_card");
		GameRegistry.registerItem(zeronos_altair_card, "zeronos_altair_card");
		GameRegistry.registerItem(zeronos_vega_card , "zeronos_vega_card");
		GameRegistry.registerItem(zeronos_zero_card , "zeronos_zero_card");
		//kiva
		GameRegistry.registerItem(garulu_saber , "garulu_saber");
		GameRegistry.registerItem(basshaamagnum , "basshaamagnum");
		GameRegistry.registerItem(dogga_hammer , "dogga_hammer");
		GameRegistry.registerItem(ixa_caliber_gun , "ixa_caliber_gun");
		GameRegistry.registerItem(ixa_caliber , "ixa_caliber");
		GameRegistry.registerItem(ixariser , "ixariser");
		GameRegistry.registerItem(jacorder_big , "jacorder_big");
		GameRegistry.registerItem(jacorder , "jacorder");
		GameRegistry.registerItem(zanbatsword_charge , "zanbatsword_charge");
		GameRegistry.registerItem(zanbatsword , "zanbatsword");
		GameRegistry.registerItem(zanbatsword_core , "zanbatsword_core");

		GameRegistry.registerItem(kivahead , "kivahead");
		GameRegistry.registerItem(kivatroso , "kivatroso");
		GameRegistry.registerItem(kivalegs , "kivalegs");
	
		GameRegistry.registerItem(kivadriver_garulu , "kivadriver_garulu");
		GameRegistry.registerItem(kivadriver_basshaa , "kivadriver_basshaa");
		GameRegistry.registerItem(kivadriver_dogga , "kivadriver_dogga");
		GameRegistry.registerItem(kivadriver_emperor , "kivadriver_emperor");
		
		GameRegistry.registerItem(kivadriver , "kivadriver");
		GameRegistry.registerItem(ixa_belt , "ixa_belt");
		GameRegistry.registerItem(sagarc_belt , "sagarc_belt");
		GameRegistry.registerItem(darkkivadriver , "darkkivadriver");
		GameRegistry.registerItem(newkivadriver , "newkivadriver");
		
		GameRegistry.registerItem(arcdriver , "arcdriver");
		GameRegistry.registerItem(reydriver , "reydriver");

		GameRegistry.registerItem(wakeupfuestle , "wakeupfuestle");
		GameRegistry.registerItem(garulufuestle , "garulufuestle");
		GameRegistry.registerItem(basshaafuestle , "basshaafuestle");
		GameRegistry.registerItem(doggafuestle , "doggafuestle");
		GameRegistry.registerItem(knucklefuestle , "knucklefuestle");
		GameRegistry.registerItem(risingfuestle , "risingfuestle");
		GameRegistry.registerItem(sagafuestle , "sagafuestle");
		GameRegistry.registerItem(keyfuestle , "keyfuestle");
		GameRegistry.registerItem(tatsulot , "tatsulot");
		GameRegistry.registerItem(darkwakeupfuestle , "darkwakeupfuestle");
		GameRegistry.registerItem(newwakeupfuestle , "newwakeupfuestle");
		
		
		
		//decade
		GameRegistry.registerItem(ride_booker_gun , "ride_booker_gun");
		GameRegistry.registerItem(ride_booker , "ride_booker");
		GameRegistry.registerItem(diend_driver , "diend_driver");
		
		GameRegistry.registerItem(ongekibo_rekka_decade , "ongekibo_rekka_decade");
		GameRegistry.registerItem(ongekibo_rekka_diend , "ongekibo_rekka_diend");

		GameRegistry.registerItem(decadehead , "decadehead");
		GameRegistry.registerItem(decadetroso , "decadetroso");
		GameRegistry.registerItem(decadelegs , "decadelegs");

		GameRegistry.registerItem(decadedriver , "decadedriver");
		GameRegistry.registerItem(dienddriver , "dienddriver");

		GameRegistry.registerItem(dark_decadedriver , "dark_decadedriver");
		
		GameRegistry.registerItem(decadecard , "decadecard");
		GameRegistry.registerItem(k_touch , "k_touch");
		GameRegistry.registerItem(decadecard_violent_emotion , "decadecard_violent_emotion");
		GameRegistry.registerItem(kivacard , "kivacard");
		GameRegistry.registerItem(den_ocard , "den_ocard");
		GameRegistry.registerItem(kabutocard , "kabutocard");
		GameRegistry.registerItem(hibikicard , "hibikicard");
		GameRegistry.registerItem(bladecard_de , "bladecard_de");
		GameRegistry.registerItem(faizcard , "faizcard");
		GameRegistry.registerItem(ryukicard , "ryukicard");
		GameRegistry.registerItem(agitocard , "agitocard");
		GameRegistry.registerItem(kuugacard , "kuugacard");
		
		GameRegistry.registerItem(diendcard , "diendcard");
		GameRegistry.registerItem(k_touch_diend , "k_touch_diend");
		
		GameRegistry.registerItem(darkdecadecard , "darkdecadecard");
		
		GameRegistry.registerItem(garulu_kivacard , "garulu_kivacard");
		GameRegistry.registerItem(basshaa_kivacard , "basshaa_kivacard");
		GameRegistry.registerItem(dogga_kivacard , "dogga_kivacard");
	
		GameRegistry.registerItem(rod_den_ocard , "rod_den_ocard");
		GameRegistry.registerItem(axe_den_ocard , "axe_den_ocard");
		GameRegistry.registerItem(gun_den_ocard , "gun_den_ocard");
		GameRegistry.registerItem(wing_den_ocard , "wing_den_ocard");

		GameRegistry.registerItem(axel_faizcard, "axel_faizcard");
		
		GameRegistry.registerItem(flame_agitocard , "flame_agitocard");	
		GameRegistry.registerItem(storm_agitocard , "storm_agitocard");	
		
		GameRegistry.registerItem(dragon_kuugacard , "dragon_kuugacard");	
		GameRegistry.registerItem(pegasus_kuugacard , "pegasus_kuugacard");	
		GameRegistry.registerItem(titan_kuugacard , "titan_kuugacard");
		
		GameRegistry.registerItem(emperor_kivacard , "emperor_kivacard");
		GameRegistry.registerItem(liner_den_ocard , "liner_den_ocard");
		GameRegistry.registerItem(hyper_kabutocard , "hyper_kabutocard");
		GameRegistry.registerItem(armed_hibikicard , "armed_hibikicard");
		GameRegistry.registerItem(king_bladecard , "king_bladecard");
		GameRegistry.registerItem(blaster_faizcard , "blaster_faizcard");
		GameRegistry.registerItem(survive_ryukicard , "survive_ryukicard");
		GameRegistry.registerItem(shining_agitocard , "shining_agitocard");
		GameRegistry.registerItem(ultimate_kuugacard , "ultimate_kuugacard");
		
		GameRegistry.registerItem(g4card , "g4card");
		GameRegistry.registerItem(ryugacard , "ryugacard");
		GameRegistry.registerItem(orgacard , "orgacard");
		GameRegistry.registerItem(glaivecard , "glaivecard");
		GameRegistry.registerItem(kabukicard , "kabukicard");
		GameRegistry.registerItem(caucasuscard , "caucasuscard");
		GameRegistry.registerItem(arccard , "arccard");
		GameRegistry.registerItem(skullcard , "skullcard");
		
		//w
		GameRegistry.registerItem(trigger_magnum , "trigger_magnum");
		GameRegistry.registerItem(metal_shaft_l , "metal_shaft_l");
		GameRegistry.registerItem(metal_shaft , "metal_shaft");
		GameRegistry.registerItem(prism_bicker , "prism_bicker");
		GameRegistry.registerItem(prism_bicker_charge , "prism_bicker_charge");
		GameRegistry.registerItem(eternal_edge , "eternal_edge");
		GameRegistry.registerItem(skull_magnum , "skull_magnum");
		GameRegistry.registerItem(engine_blade , "engine_blade");

		GameRegistry.registerItem(Whead , "whead");
		GameRegistry.registerItem(Wtroso , "wtroso");
		GameRegistry.registerItem(Wlegs , "wlegs");

		GameRegistry.registerItem(Wdriver , "wdriver");
		GameRegistry.registerItem(lostdriver , "lostdriver");
		GameRegistry.registerItem(accel_driver , "accel_driver");
		
		GameRegistry.registerItem(wdriverc , "wdriverc");
		GameRegistry.registerItem(wdriverj , "wdriverj");
		GameRegistry.registerItem(wdriverh , "wdriverh");
		GameRegistry.registerItem(wdriverm , "wdriverm");
		GameRegistry.registerItem(wdriverl , "wdriverl");
		GameRegistry.registerItem(wdrivert , "wdrivert");
		GameRegistry.registerItem(wdriverf , "wdriverf");
		GameRegistry.registerItem(wdrivercc , "wdrivercc");
		GameRegistry.registerItem(wdriverjj , "wdriverjj");
		GameRegistry.registerItem(wdriverx , "wdriverx");
		GameRegistry.registerItem(wdriversh , "wdriversh");
		GameRegistry.registerItem(wdriverki , "wdriverki");
		
		GameRegistry.registerItem(accel_driverb , "accel_driverb");
		GameRegistry.registerItem(accel_drivert , "accel_drivert");
		
		GameRegistry.registerItem(lostdriverc , "lostdriverc");
		GameRegistry.registerItem(lostdrivere , "lostdrivere");
		GameRegistry.registerItem(lostdriverj , "lostdriverj");
		
		GameRegistry.registerItem(cyclone_memory , "cyclone_memory");
		GameRegistry.registerItem(heat_memory,"heat_memory");
		GameRegistry.registerItem(luna_memory,"luna_memory");
		GameRegistry.registerItem(fang_memory,"fang_memory");
		GameRegistry.registerItem(joker_memory,"joker_memory");
		GameRegistry.registerItem(metal_memory ,"metal_memory");
		GameRegistry.registerItem(trigger_memory,"trigger_memory");
		GameRegistry.registerItem(xtreme_memory,"xtreme_memory");
		GameRegistry.registerItem(xtreme_gold_memory,"xtreme_gold_memory");
		GameRegistry.registerItem(xtreme_accel_memory,"xtreme_accel_memory");
		GameRegistry.registerItem(cyclonecyclone_memory , "cyclonecyclone_memory");
		GameRegistry.registerItem(jokerjoker_memory , "jokerjoker_memory");
		GameRegistry.registerItem(prism_memory , "prism_memory");
		GameRegistry.registerItem(engine_memory , "engine_memory");

		GameRegistry.registerItem(joker_t2_memory,"joker_t2_memory");
		GameRegistry.registerItem(skull_memory,"skull_memory");
		GameRegistry.registerItem(eternal_memory,"eternal_memory");
		GameRegistry.registerItem(eternal_t2_memory , "eternal_t2_memory");


		GameRegistry.registerItem(accel_memory , "accel_memory");
		GameRegistry.registerItem(trial_memory , "trial_memory");
		GameRegistry.registerItem(accel_booster_memory , "accel_booster_memory");
		
		GameRegistry.registerItem(shippu_memory , "shippu_memory");
		GameRegistry.registerItem(kirifuda_memory , "kirifuda_memory");

		//OOO
		GameRegistry.registerItem(medajalibur , "medajalibur");
		GameRegistry.registerItem(medajalibur_charge , "medajalibur_charge");
		
		GameRegistry.registerItem(tajaspinner,"tajaspinner");
		GameRegistry.registerItem(medagaburyu,"medagaburyu");
		GameRegistry.registerItem(medagaburyu_gun,"medagaburyu_gun");
		GameRegistry.registerItem(birth_buster,"birth_buster");
		GameRegistry.registerItem(deepest_harpoon,"deepest_harpoon");

		GameRegistry.registerItem(OOOhead , "ooohead");
		GameRegistry.registerItem(OOOtroso , "oootroso");
		GameRegistry.registerItem(OOOlegs , "ooolegs");

		GameRegistry.registerItem(OOOdriver , "ooodriver");
		GameRegistry.registerItem(birth_driver , "birth_driver");
		GameRegistry.registerItem(birth_driver_prototype , "birth_driver_prototype");
		
		GameRegistry.registerItem(poseidon_driver , "poseidon_driver");
		GameRegistry.registerItem(aqua_driver , "aqua_driver");

		GameRegistry.registerItem(o_scanner , "o_scanner");

		GameRegistry.registerItem(taka , "taka");
		GameRegistry.registerItem(kuwagata,"kuwagata");
		GameRegistry.registerItem(lion,"lion");
		GameRegistry.registerItem(sai,"sai");
		GameRegistry.registerItem(shachi ,"shachi");
		GameRegistry.registerItem(ptera,"ptera");
		GameRegistry.registerItem(cobra,"cobra");
		GameRegistry.registerItem(super_taka , "super_taka");
		GameRegistry.registerItem(same , "same");
		GameRegistry.registerItem(shika , "shika");
		GameRegistry.registerItem(seiuchi , "seiuchi");
		GameRegistry.registerItem(mukade , "mukade");
		GameRegistry.registerItem(ebi_new , "ebi_new");
		GameRegistry.registerItem(love_core , "love_core");
		GameRegistry.registerItem(sasori , "sasori");

		GameRegistry.registerItem(tora,"tora");
		GameRegistry.registerItem(kamakiri,"kamakiri");
		GameRegistry.registerItem(gorilla,"gorilla");
		GameRegistry.registerItem(kujaku ,"kujaku");
		GameRegistry.registerItem(unagi,"unagi");
		GameRegistry.registerItem(tricera ,"tricera");
		GameRegistry.registerItem(kame,"kame");
		GameRegistry.registerItem(imagin,"imagin");
		GameRegistry.registerItem(panda,"panda");
		GameRegistry.registerItem(super_tora,"super_tora");
		GameRegistry.registerItem(kangaroo,"kangaroo");
		GameRegistry.registerItem(kujira,"kujira");
		GameRegistry.registerItem(gazelle,"gazelle");
		GameRegistry.registerItem(shirokuma,"shirokuma");
		GameRegistry.registerItem(hachi,"hachi");
		GameRegistry.registerItem(kani_new,"kani_new");
		GameRegistry.registerItem(love_core2,"love_core2");
		GameRegistry.registerItem(kani,"kani");
		GameRegistry.registerItem(yadokari,"yadokari");

		GameRegistry.registerItem(batta,"batta");
		GameRegistry.registerItem(cheetah ,"cheetah");
		GameRegistry.registerItem(zou,"zou");
		GameRegistry.registerItem(condor,"condor");
		GameRegistry.registerItem(tako,"tako");
		GameRegistry.registerItem(tyranno,"tyranno");
		GameRegistry.registerItem(wani,"wani");
		GameRegistry.registerItem(shocker,"shocker");
		GameRegistry.registerItem(super_batta,"super_batta");
		GameRegistry.registerItem(kangaroo2,"kangaroo2");
		GameRegistry.registerItem(ookamiuo,"ookamiuo");
		GameRegistry.registerItem(ushi,"ushi");
		GameRegistry.registerItem(penguin,"penguin");
		GameRegistry.registerItem(ari,"ari");
		GameRegistry.registerItem(sasori_new,"sasori_new");
		GameRegistry.registerItem(love_core3,"love_core3");
		GameRegistry.registerItem(ebi,"ebi");
		
		GameRegistry.registerItem(birth_core , "birth_core");
		GameRegistry.registerItem(proto_birth_core , "proto_birth_core");
		
//Fourze
		GameRegistry.registerItem(rocket , "rocket");
		GameRegistry.registerItem(billytherod , "billytherod");
		GameRegistry.registerItem(hee_hackgun , "hee_hackgun");
		GameRegistry.registerItem(barizun_sword , "barizun_sword");
		GameRegistry.registerItem(barizun_sword_charge, "barizun_sword_charge");
		GameRegistry.registerItem(meteor_nadeshiko_fusion_rocket , "meteor_nadeshiko_fusion_rocket");

		GameRegistry.registerItem(Fourzehead , "fourzehead");
		GameRegistry.registerItem(Fourzetroso , "fourzetroso");
		GameRegistry.registerItem(Fourzelegs , "fourzelegs");

		GameRegistry.registerItem(Fourzedriver , "fourzedriver");
		GameRegistry.registerItem(meteor_driver , "meteor_driver");
		GameRegistry.registerItem(nadeshikodriver , "nadeshikodriver");


		GameRegistry.registerItem(rocket_swich , "rocket_swich");
		GameRegistry.registerItem(launcher_switch , "launcher_switch");
		GameRegistry.registerItem(drill_switch , "drill_switch");
		GameRegistry.registerItem(radar_switch , "radar_switch");
		GameRegistry.registerItem(magic_hand_switch , "magic_hand_switch");
		GameRegistry.registerItem(camera_switch , "camera_switch");
		GameRegistry.registerItem(parachute_switch , "parachute_switch");
		GameRegistry.registerItem(chainsaw_switch , "chainsaw_switch");
		GameRegistry.registerItem(hopping_switch , "hopping_switch");
		
		GameRegistry.registerItem(elek_swich , "elek_swich");
		GameRegistry.registerItem(scissors_switch , "scissors_switch");
		GameRegistry.registerItem(beat_switch , "beat_switch");
		GameRegistry.registerItem(chain_array_switch , "chain_array_switch");
		GameRegistry.registerItem(smoke_switch , "smoke_switch");
		GameRegistry.registerItem(spike_switch , "spike_switch");
		GameRegistry.registerItem(winch_switch , "winch_switch");
		GameRegistry.registerItem(flash_switch , "flash_switch");
		GameRegistry.registerItem(shield_switch , "shield_switch");
		GameRegistry.registerItem(gatling_switch , "gatling_switch");

		GameRegistry.registerItem(fire_swich , "fire_swich");
		GameRegistry.registerItem(stealth_switch , "stealth_switch");
		GameRegistry.registerItem(hammer_switch , "hammer_switch");
		GameRegistry.registerItem(water_switch , "water_switch");
		GameRegistry.registerItem(medical_switch , "medical_switch");
		GameRegistry.registerItem(pen_switch , "pen_switch");
		GameRegistry.registerItem(wheel_switch , "wheel_switch");
		GameRegistry.registerItem(screw_switch , "screw_switch");
		GameRegistry.registerItem(hand_switch , "hand_switch");
		GameRegistry.registerItem(schop_switch , "schop_switch");
		
		GameRegistry.registerItem(magnet_swich_n , "magnet_swich_n");
		GameRegistry.registerItem(magnet_swich_s , "magnet_swich_s");
		GameRegistry.registerItem(freeze_switch , "freeze_switch");
		GameRegistry.registerItem(claw_switch , "claw_switch");
		GameRegistry.registerItem(board_switch , "board_switch");
		GameRegistry.registerItem(giantfoot_switch , "giantfoot_switch");
		GameRegistry.registerItem(aero_switch , "aero_switch");
		GameRegistry.registerItem(gyro_switch , "gyro_switch");
		GameRegistry.registerItem(net_switch , "net_switch");
		GameRegistry.registerItem(stamper_switch , "stamper_switch");
		
		GameRegistry.registerItem(cosmic_swich , "cosmic_swich");
		
		GameRegistry.registerItem(super_rocket_swich , "super_rocket_swich");
		GameRegistry.registerItem(super_drill_swich , "super_drill_swich");
		
		GameRegistry.registerItem(clear_drill_swich , "clear_drill_swich");
		GameRegistry.registerItem(fusion_swich , "fusion_swich");


		GameRegistry.registerItem(meteor_swich , "meteor_swich");
		GameRegistry.registerItem(meteor_storm_swich , "meteor_storm_swich");
		GameRegistry.registerItem(nadeshiko_switch , "nadeshiko_switch");
		
		GameRegistry.registerItem(solu_switch , "solu_switch");
		GameRegistry.registerItem(gate_switch , "gate_switch");
		GameRegistry.registerItem(core_switch , "core_switch");

//wizard
		GameRegistry.registerItem(wizarswordgun_gun, "wizarswordgun_gun");
		GameRegistry.registerItem(axcalibur_charge, "axcalibur_charge");
		GameRegistry.registerItem(wizarswordgun_mage_gun, "wizarswordgun_mage_gun");
		GameRegistry.registerItem(wizarswordgun, "wizarswordgun");
		GameRegistry.registerItem(axcalibur, "axcalibur");
		GameRegistry.registerItem(dice_saber, "dice_saber");
		GameRegistry.registerItem(mirage_magnum, "mirage_magnum");
		GameRegistry.registerItem(wizarswordgun_mage, "wizarswordgun_mage");
		GameRegistry.registerItem(hammelcane, "hammelcane");
		GameRegistry.registerItem(dis_halberd, "dis_halberd");

		GameRegistry.registerItem(wizardhead , "wizardhead");
		GameRegistry.registerItem(wizardtroso , "wizardtroso");
		GameRegistry.registerItem(wizardlegs , "wizardlegs");

		GameRegistry.registerItem(wizardriver , "wizardriver");
		GameRegistry.registerItem(beastdriver , "beastdriver");
		GameRegistry.registerItem(whitewizardriver , "whitewizardriver");
		GameRegistry.registerItem(magewizardriver , "magewizardriver");
		GameRegistry.registerItem(magewizardriver_b , "magewizardriver_b");
		GameRegistry.registerItem(magewizardriver_g , "magewizardriver_g");
		GameRegistry.registerItem(sorcererdriver , "sorcererdriver");
		GameRegistry.registerItem(whitewizardriverf , "whitewizardriverf");
		
		GameRegistry.registerItem(darkwizardriver , "darkwizardriver");
		GameRegistry.registerItem(blackwizardriver , "blackwizardriver");

		GameRegistry.registerItem(flame_ring , "flame_ring");
		GameRegistry.registerItem(water_ring , "water_ring");
		GameRegistry.registerItem(hurricane_ring , "hurricane_ring");
		GameRegistry.registerItem(land_ring , "land_ring");
		GameRegistry.registerItem(flame_ring_dragon , "flame_ring_dragon");
		GameRegistry.registerItem(water_ring_dragon , "water_ring_dragon");
		GameRegistry.registerItem(hurricane_ring_dragon , "hurricane_ring_dragon");
		GameRegistry.registerItem(land_ring_dragon , "land_ring_dragon");
		GameRegistry.registerItem(infinity_ring , "infinity_ring");

		GameRegistry.registerItem(drago_timer , "drago_timer");
		GameRegistry.registerItem(special_ring , "special_ring");
		GameRegistry.registerItem(finish_strike_ring , "finish_strike_ring");
		GameRegistry.registerItem(hope_ring , "hope_ring");
		GameRegistry.registerItem(special_rush_ring , "special_rush_ring");

		GameRegistry.registerItem(beast_ring , "beast_ring");
		GameRegistry.registerItem(falco_ring , "falco_ring");
		GameRegistry.registerItem(chameleo_ring , "chameleo_ring");
		GameRegistry.registerItem(buffa_ring , "buffa_ring");
		GameRegistry.registerItem(dolphi_ring , "dolphi_ring");
		GameRegistry.registerItem(hyper_ring , "hyper_ring");

		GameRegistry.registerItem(wiseman_ring , "wiseman_ring");
		GameRegistry.registerItem(mage_o_ring , "mage_o_ring");
		GameRegistry.registerItem(mage_b_ring , "mage_b_ring");
		GameRegistry.registerItem(mage_g_ring , "mage_g_ring");
		GameRegistry.registerItem(sorcerer_ring , "sorcerer_ring");
		GameRegistry.registerItem(black_ring , "black_ring");
		GameRegistry.registerItem(dark_ring , "dark_ring");
		
		GameRegistry.registerItem(light_ring , "light_ring");
		GameRegistry.registerItem(excite_ring , "excite_ring");
		GameRegistry.registerItem(defend_ring  , "defend_ring");
		GameRegistry.registerItem(thunder_ring , "thunder_ring");
		GameRegistry.registerItem(explosion_ring , "explosion_ring");
		GameRegistry.registerItem(sleep_ring , "sleep_ring");
		GameRegistry.registerItem(bind_ring , "bind_ring");
		GameRegistry.registerItem(teleport_ring , "teleport_ring");
		GameRegistry.registerItem(fall_ring , "fall_ring");
		GameRegistry.registerItem(connect_ring , "connect_ring");
		GameRegistry.registerItem(kick_strike_ring , "kick_strike_ring");
		GameRegistry.registerItem(eclipse_ring , "eclipse_ring");

		GameRegistry.registerItem(liquid_ring , "liquid_ring");
		
		GameRegistry.registerItem(engage_ring , "engage_ring");
		GameRegistry.registerItem(please_ring , "please_ring");
		GameRegistry.registerItem(small_ring , "small_ring");
		GameRegistry.registerItem(big_ring , "big_ring");
		
		GameRegistry.registerItem(copy_ring , "copy_ring");
		GameRegistry.registerItem(drill_ring , "drill_ring");
		GameRegistry.registerItem(smell_ring , "smell_ring");
		GameRegistry.registerItem(extend_ring , "extend_ring");		
		GameRegistry.registerItem(merry_christmas_ring , "merry_christmas_ring");
		GameRegistry.registerItem(dress_up_ring , "dress_up_ring");
		GameRegistry.registerItem(blizzard_ring , "blizzard_ring");
		GameRegistry.registerItem(gravity_ring , "gravity_ring");		
		GameRegistry.registerItem(time_ring , "time_ring");
		GameRegistry.registerItem(miracle_ring , "miracle_ring");
		GameRegistry.registerItem(flower_ring , "flower_ring");
		GameRegistry.registerItem(dance_ring , "dance_ring");
		
		GameRegistry.registerItem(musou_saber , "musou_saber");
		GameRegistry.registerItem(musou_saber_naginata , "musou_saber_naginata");
		GameRegistry.registerItem(musou_saber_kusarigama , "musou_saber_kusarigama");
		GameRegistry.registerItem(blood_musou_saber_naginata , "blood_musou_saber_naginata");
		GameRegistry.registerItem(dj_gun , "dj_gun");
		GameRegistry.registerItem(dj_gun_taiken_mode_big , "dj_gun_taiken_mode_big");
		GameRegistry.registerItem(dj_gun_taiken_mode , "dj_gun_taiken_mode");

		GameRegistry.registerItem(kagematsu_l , "kagematsu_l");
		GameRegistry.registerItem(kagematsu , "kagematsu");
		GameRegistry.registerItem(donkachi , "donkachi");
		GameRegistry.registerItem(melon_defender , "melon_defender");
		GameRegistry.registerItem(pine_iron , "pine_iron");
		GameRegistry.registerItem(ichigo_kunai , "ichigo_kunai");
		GameRegistry.registerItem(daidaimaru , "daidaimaru");
		GameRegistry.registerItem(banana_spear , "banana_spear");
		GameRegistry.registerItem(budou_ryuhou , "budou_ryuhou");
		GameRegistry.registerItem(mango_punisher , "mango_punisher");
		GameRegistry.registerItem(duri_noko , "duri_noko");
		GameRegistry.registerItem(kiwi_gekirin , "kiwi_gekirin");
		GameRegistry.registerItem(suika_sojinto_big , "suika_sojinto_big");
		GameRegistry.registerItem(suika_sojinto , "suika_sojinto");
		GameRegistry.registerItem(suika_sojinto_baron_ver_big , "suika_sojinto_baron_ver_big");
		GameRegistry.registerItem(suika_sojinto_baron_ver , "suika_sojinto_baron_ver");


		GameRegistry.registerItem(sonic_arrow , "sonic_arrow");
		GameRegistry.registerItem(kagematsu_shin_l , "kagematsu_shin_l");
		GameRegistry.registerItem(kagematsu_shin , "kagematsu_shin");

		GameRegistry.registerItem(blood_daidaimaru , "blood_daidaimaru");
		GameRegistry.registerItem(yomimaru , "yomimaru");
		GameRegistry.registerItem(sword_bringer , "sword_bringer");
		GameRegistry.registerItem(apple_reflecter , "apple_reflecter");
		GameRegistry.registerItem(souginjou_l , "souginjou_l");
		GameRegistry.registerItem(souginjou , "souginjou");
		GameRegistry.registerItem(dark_daidaimaru , "dark_daidaimaru");
		GameRegistry.registerItem(watermelon_defender , "watermelon_defender");
		GameRegistry.registerItem(savior_arrow , "savior_arrow");
		
		GameRegistry.registerItem(kabi_daidaimaru , "kabi_daidaimaru");
		GameRegistry.registerItem(maja_yomimaru , "maja_yomimaru");

		GameRegistry.registerItem(Gaimhead , "gaimhead");
		GameRegistry.registerItem(Gaimtroso , "gaimtroso");
		GameRegistry.registerItem(Gaimlegs , "gaimlegs");

		GameRegistry.registerItem(sengoku_driver_ryugen_yomi , "sengoku_driver_ryugen_yomi");
		GameRegistry.registerItem(sengoku_driver_zangetsu_watermelon , "sengoku_driver_zangetsu_watermelon");
		GameRegistry.registerItem(sengoku_driver_gaim , "sengoku_driver_gaim");
		GameRegistry.registerItem(sengoku_driver_baron , "sengoku_driver_baron");
		GameRegistry.registerItem(sengoku_driver_ryugen , "sengoku_driver_ryugen");
		GameRegistry.registerItem(sengoku_driver_zangetsu , "sengoku_driver_zangetsu");
		GameRegistry.registerItem(sengoku_driver_gridon , "sengoku_driver_gridon");
		GameRegistry.registerItem(sengoku_driver_kurokage , "sengoku_driver_kurokage");
		GameRegistry.registerItem(sengoku_driver_barvo , "sengoku_driver_barvo");
		GameRegistry.registerItem(sengoku_driver_knuckle , "sengoku_driver_knuckle");
		GameRegistry.registerItem(sengoku_driver_bujin_gaim , "sengoku_driver_bujin_gaim");
		GameRegistry.registerItem(sengoku_driver_fifteen , "sengoku_driver_fifteen");
		GameRegistry.registerItem(sengoku_driver_mars , "sengoku_driver_mars");
		GameRegistry.registerItem(sengoku_driver_kamuro , "sengoku_driver_kamuro");
		GameRegistry.registerItem(sengoku_driver_jam , "sengoku_driver_jam");
		GameRegistry.registerItem(sengoku_driver_kurokage_troopers , "sengoku_driver_kurokage_troopers");
		GameRegistry.registerItem(sengoku_driver_idunn , "sengoku_driver_idunn");
		GameRegistry.registerItem(sengoku_driver_duke , "sengoku_driver_duke");
		GameRegistry.registerItem(sengoku_driver_savior , "sengoku_driver_savior");
		GameRegistry.registerItem(sengoku_driver_baron_black , "sengoku_driver_baron_black");
		GameRegistry.registerItem(sengoku_driver_maja , "sengoku_driver_maja");
		GameRegistry.registerItem(sengoku_driver_gaim_natsumikan , "sengoku_driver_gaim_natsumikan");
		
		GameRegistry.registerItem(genesis_driver_zangetsu_shin , "genesis_driver_zangetsu_shin");
		GameRegistry.registerItem(genesis_driver_duke , "genesis_driver_duke");
		GameRegistry.registerItem(genesis_driver_sigurd , "genesis_driver_sigurd");
		GameRegistry.registerItem(genesis_driver_marika , "genesis_driver_marika");
		GameRegistry.registerItem(genesis_driver_baron , "genesis_driver_baron");
		GameRegistry.registerItem(genesis_driver_kurokage_shin , "genesis_driver_kurokage_shin");
		GameRegistry.registerItem(genesis_driver_tyrant , "genesis_driver_tyrant");

		GameRegistry.registerItem(sengoku_driver_matsubokkuri , "sengoku_driver_matsubokkuri");
		GameRegistry.registerItem(sengoku_driver_kurumi , "sengoku_driver_kurumi");
		GameRegistry.registerItem(sengoku_driver_donguri , "sengoku_driver_donguri");
		GameRegistry.registerItem(sengoku_driver_melon , "sengoku_driver_melon");
		GameRegistry.registerItem(sengoku_driver_pine , "sengoku_driver_pine");
		GameRegistry.registerItem(sengoku_driver_ichigo , "sengoku_driver_ichigo");
		GameRegistry.registerItem(sengoku_driver_orange , "sengoku_driver_orange");
		GameRegistry.registerItem(sengoku_driver_banana , "sengoku_driver_banana");
		GameRegistry.registerItem(sengoku_driver_budou , "sengoku_driver_budou");
		GameRegistry.registerItem(sengoku_driver_suika , "sengoku_driver_suika");
		GameRegistry.registerItem(sengoku_driver_mango , "sengoku_driver_mango");
		GameRegistry.registerItem(sengoku_driver_durian , "sengoku_driver_durian");
		GameRegistry.registerItem(sengoku_driver_kiwi , "sengoku_driver_kiwi");
		GameRegistry.registerItem(sengoku_driver_lemon , "sengoku_driver_lemon");
		
		GameRegistry.registerItem(sengoku_driver_lemon_energy , "sengoku_driver_lemon_energy");
		GameRegistry.registerItem(sengoku_driver_cherry_energy , "sengoku_driver_cherry_energy");
		GameRegistry.registerItem(sengoku_driver_peach_energy , "sengoku_driver_peach_energy");
		GameRegistry.registerItem(sengoku_driver_melon_energy , "sengoku_driver_melon_energy");
		GameRegistry.registerItem(sengoku_driver_jinba_lemon , "sengoku_driver_jinba_lemon");
		GameRegistry.registerItem(sengoku_driver_jinba_cherry , "sengoku_driver_jinba_cherry");
		GameRegistry.registerItem(sengoku_driver_jinba_peach, "sengoku_driver_jinba_peach");
		GameRegistry.registerItem(sengoku_driver_jinba_melon , "sengoku_driver_jinba_melon");
		GameRegistry.registerItem(sengoku_driver_jinba_dragon , "sengoku_driver_jinba_dragon");
		GameRegistry.registerItem(sengoku_driver_jinba_melon_melon , "sengoku_driver_jinba_melon_melon");
		GameRegistry.registerItem(sengoku_driver_jinba_melon_durian , "sengoku_driver_jinba_melon_durian");
		
		GameRegistry.registerItem(sengoku_driver_matsubokkuri_energy , "sengoku_driver_matsubokkuri_energy");
		GameRegistry.registerItem(sengoku_driver_dragon_fruits_energy , "sengoku_driver_dragon_fruits_energy");
		GameRegistry.registerItem(sengoku_driver_jinba_marron , "sengoku_driver_jinba_marron");

		GameRegistry.registerItem(sengoku_driver_kachidoki,"sengoku_driver_kachidoki");
		GameRegistry.registerItem(sengoku_driver_kiwami,"sengoku_driver_kiwami");
		GameRegistry.registerItem(sengoku_driver_yomotsu_heguri,"sengoku_driver_yomotsu_heguri");

		GameRegistry.registerItem(sengoku_driver_blood_orange , "sengoku_driver_blood_orange");
		GameRegistry.registerItem(sengoku_driver_fifteen_lock , "sengoku_driver_fifteen_lock");
		GameRegistry.registerItem(sengoku_driver_golden_ringo , "sengoku_driver_golden_ringo");
		GameRegistry.registerItem(sengoku_driver_silver_ringo , "sengoku_driver_silver_ringo");
		GameRegistry.registerItem(sengoku_driver_black_ringo , "sengoku_driver_black_ringo");
		GameRegistry.registerItem(sengoku_driver_watermelon , "sengoku_driver_watermelon");
		GameRegistry.registerItem(sengoku_driver_forbidden_ringo , "sengoku_driver_forbidden_ringo");
		GameRegistry.registerItem(sengoku_driver_blood_zakuro , "sengoku_driver_blood_zakuro");

		GameRegistry.registerItem(sengoku_driver_jinba_black , "sengoku_driver_jinba_black");
		
		GameRegistry.registerItem(sengoku_driver_black_baron , "sengoku_driver_black_baron");
		
		GameRegistry.registerItem(sengoku_driver_orange_fr , "sengoku_driver_orange_fr");
		GameRegistry.registerItem(sengoku_driver_natsumikan, "sengoku_driver_natsumikan");
		
		GameRegistry.registerItem(sengoku_driver_drive,"sengoku_driver_drive");
		GameRegistry.registerItem(sengoku_driver_wizard,"sengoku_driver_wizard");
		GameRegistry.registerItem(sengoku_driver_fourze,"sengoku_driver_fourze");
		GameRegistry.registerItem(sengoku_driver_ooo,"sengoku_driver_ooo");
		GameRegistry.registerItem(sengoku_driver_w,"sengoku_driver_w");
		GameRegistry.registerItem(sengoku_driver_decade,"sengoku_driver_decade");
		GameRegistry.registerItem(sengoku_driver_rider_ichigo,"sengoku_driver_rider_ichigo");
		
		GameRegistry.registerItem(sengoku_driver_gaim_lock,"sengoku_driver_gaim_lock");
		GameRegistry.registerItem(sengoku_driver_kiva,"sengoku_driver_kiva");
		GameRegistry.registerItem(sengoku_driver_den_o,"sengoku_driver_den_o");
		GameRegistry.registerItem(sengoku_driver_kaubuto,"sengoku_driver_kabuto");
		GameRegistry.registerItem(sengoku_driver_hibiki,"sengoku_driver_hibiki");
		GameRegistry.registerItem(sengoku_driver_blade,"sengoku_driver_blade");
		GameRegistry.registerItem(sengoku_driver_faiz,"sengoku_driver_faiz");
		GameRegistry.registerItem(sengoku_driver_ryuki,"sengoku_driver_ryuki");
		GameRegistry.registerItem(sengoku_driver_agito,"sengoku_driver_agito");
		GameRegistry.registerItem(sengoku_driver_kuuga,"sengoku_driver_kuuga");
	
		GameRegistry.registerItem(matsubokkuri_lockseed , "matsubokkuri_lockseed");
		GameRegistry.registerItem(kurumi_lockseed , "kurumi_lockseed");
		GameRegistry.registerItem(donguri_lockseed , "donguri_lockseed");
		GameRegistry.registerItem(melon_lockseed , "melon_lockseed");
		GameRegistry.registerItem(pine_lockseed , "pine_lockseed");
		GameRegistry.registerItem(ichigo_lockseed , "ichigo_lockseed");
		GameRegistry.registerItem(orange_lockseed , "orange_lockseed");
		GameRegistry.registerItem(banana_lockseed , "banana_lockseed");
		GameRegistry.registerItem(budou_lockseed , "budou_lockseed");
		GameRegistry.registerItem(suika_lockseed , "suika_lockseed");
		GameRegistry.registerItem(mango_lockseed , "mango_lockseed");
		GameRegistry.registerItem(durian_lockseed , "durian_lockseed");
		GameRegistry.registerItem(kiwi_lockseed , "kiwi_lockseed");
		GameRegistry.registerItem(lemon_lockseed , "lemon_lockseed");
		
		
		GameRegistry.registerItem(lemon_energy_lockseed , "lemon_energy_lockseed");
		GameRegistry.registerItem(cherry_energy_lockseed , "cherry_energy_lockseed");
		GameRegistry.registerItem(peach_energy_lockseed , "peach_energy_lockseed");
		GameRegistry.registerItem(melon_energy_lockseed , "melon_energy_lockseed");
		GameRegistry.registerItem(matsubokkuri_energy_lockseed , "matsubokkuri_energy_lockseed");
		GameRegistry.registerItem(dragon_fruits_energy_lockseed , "dragon_fruits_energy_lockseed");
		GameRegistry.registerItem(marron_energy_lockseed , "marron_energy_lockseed");

		GameRegistry.registerItem(kachidoki_lockseed,"kachidoki_lockseed");
		GameRegistry.registerItem(kiwami_lockseed,"kiwami_lockseed");
		GameRegistry.registerItem(yomotsu_heguri_lockseed,"yomotsu_heguri_lockseed");

		GameRegistry.registerItem(blood_orange_lockseed , "blood_orange_lockseed");
		GameRegistry.registerItem(fifteen_lockseed , "fifteen_lockseed");
		GameRegistry.registerItem(golden_ringo_lockseed , "golden_ringo_lockseed");
		GameRegistry.registerItem(silver_ringo_lockseed , "silver_ringo_lockseed");
		GameRegistry.registerItem(black_ringo_lockseed , "black_ringo_lockseed");
		GameRegistry.registerItem(watermelon_lockseed , "watermelon_lockseed");
		GameRegistry.registerItem(forbidden_ringo_lockseed , "forbidden_ringo_lockseed");
		GameRegistry.registerItem(zakuro_lockseed , "zakuro_lockseed");
		GameRegistry.registerItem(black_baron_lockseed,"black_baron_lockseed");

		GameRegistry.registerItem(dark_orange_lockseed , "dark_orange_lockseed");
		GameRegistry.registerItem(dark_lemon_energy_lockseed , "dark_lemon_energy_lockseed");
		
		GameRegistry.registerItem(fresh_orange_lockseed , "fresh_orange_lockseed");
		GameRegistry.registerItem(fresh_pine_lockseed , "fresh_pine_lockseed");

		GameRegistry.registerItem(natsumikan_lockseed , "natsumikan_lockseed");
		
		GameRegistry.registerItem(roulette_lockseed , "roulette_lockseed");
		GameRegistry.registerItem(christmas_lockseed , "christmas_lockseed");
		
		GameRegistry.registerItem(sakura_hurricane,"sakura_hurricane");
		GameRegistry.registerItem(rose_attacker,"rose_attacker");
		GameRegistry.registerItem(dandeliner,"dandeliner");
		GameRegistry.registerItem(tulip_hopper,"tulip_hopper");
		
		GameRegistry.registerItem(drive_lockseed,"drive_lockseed");
		GameRegistry.registerItem(gaim_lockseed,"gaim_lockseed");
		GameRegistry.registerItem(wizard_lockseed,"wizard_lockseed");
		GameRegistry.registerItem(fourze_lockseed,"fourze_lockseed");
		GameRegistry.registerItem(ooo_lockseed,"ooo_lockseed");
		GameRegistry.registerItem(w_lockseed,"w_lockseed");
		GameRegistry.registerItem(decade_lockseed,"decade_lockseed");
		GameRegistry.registerItem(kiva_lockseed,"kiva_lockseed");
		GameRegistry.registerItem(den_o_lockseed,"den_o_lockseed");
		GameRegistry.registerItem(kaubuto_lockseed,"kaubuto_lockseed");
		GameRegistry.registerItem(hibiki_lockseed,"hibiki_lockseed");
		GameRegistry.registerItem(blade_lockseed,"blade_lockseed");
		GameRegistry.registerItem(faiz_lockseed,"faiz_lockseed");
		GameRegistry.registerItem(ryuki_lockseed,"ryuki_lockseed");
		GameRegistry.registerItem(agito_lockseed,"agito_lockseed");
		GameRegistry.registerItem(kuuga_lockseed,"kuuga_lockseed");
		
		GameRegistry.registerItem(rider_ichigo_lockseed,"rider_ichigo_lockseed");
		
		GameRegistry.registerItem(sengoku_driver_kabi_orange,"sengoku_driver_kabi_orange");
		GameRegistry.registerItem(kabi_orange_lockseed,"kabi_orange_lockseed");
		
		GameRegistry.registerItem(sengoku_driver_maja_lock,"sengoku_driver_maja_lock");
		GameRegistry.registerItem(maja_lockseed,"maja_lockseed");
		
		GameRegistry.registerItem(sid_lockseed,"sid_lockseed");
		
		GameRegistry.registerItem(fake_donguri_lockseed , "fake_donguri_lockseed");
		
		
		
		GameRegistry.registerItem(handle_sword , "handle_sword");
		GameRegistry.registerItem(door_ju , "door_ju");
		GameRegistry.registerItem(trailer_hou , "trailer_hou");
		GameRegistry.registerItem(zenrin_shooter , "zenrin_shooter");
		GameRegistry.registerItem(break_gunner , "break_gunner");
		GameRegistry.registerItem(break_gunner_2 , "break_gunner_2");
		GameRegistry.registerItem(shingouax , "shingouax");
		GameRegistry.registerItem(lupin_gunner , "lupin_gunner");
		GameRegistry.registerItem(blade_gunner , "blade_gunner");
		
		GameRegistry.registerItem(drivehead , "drivehead");
		GameRegistry.registerItem(drivetroso , "drivetroso");
		GameRegistry.registerItem(drivelegs , "drivelegs");
		GameRegistry.registerItem(drivedriver , "drivedriver");
		
		GameRegistry.registerItem(mach_driver_honoh , "mach_driver_honoh");
		GameRegistry.registerItem(drivedrivergold , "drivedrivergold");
		GameRegistry.registerItem(metro_pd_driver_honoh , "metro_pd_driver_honoh");
		GameRegistry.registerItem(lupin_belt , "lupin_belt");
		
		GameRegistry.registerItem(speedshift,"speedshift");
		GameRegistry.registerItem(wildshift,"wildshift");
		GameRegistry.registerItem(techniqueshift,"techniqueshift");
		GameRegistry.registerItem(dead_heat,"dead_heat");
		GameRegistry.registerItem(formulashift,"formulashift");
		GameRegistry.registerItem(tridoronshift,"tridoronshift");
		
		GameRegistry.registerItem(proto_speedshift,"proto_speedshift");
		GameRegistry.registerItem(fruitsshift,"fruitsshift");
		GameRegistry.registerItem(highspeedshift,"highspeedshift");
		GameRegistry.registerItem(shift_next,"shift_next");
		GameRegistry.registerItem(shift_special,"shift_special");
		GameRegistry.registerItem(heartronshift,"heartronshift");
		GameRegistry.registerItem(speedwildtechnicshift,"speedwildtechnicshift");
		
		GameRegistry.registerItem(maxflare,"maxflare");
		GameRegistry.registerItem(funkyspike,"funkyspike");
		GameRegistry.registerItem(midnightshadow,"midnightshadow");
		GameRegistry.registerItem(justice_hunter,"justice_hunter");
		GameRegistry.registerItem(dream_vegas,"dream_vegas");
		GameRegistry.registerItem(dimension_cab,"dimension_cab");
		GameRegistry.registerItem(massive_monster,"massive_monster");
		GameRegistry.registerItem(spin_mixer,"spin_mixer");
		GameRegistry.registerItem(rumble_dump,"rumble_dump");
		GameRegistry.registerItem(mad_doctor,"mad_doctor");
		GameRegistry.registerItem(hooking_wrecker,"hooking_wrecker");
		GameRegistry.registerItem(fire_braver,"fire_braver");
		GameRegistry.registerItem(rolling_gravity,"rolling_gravity");
		GameRegistry.registerItem(road_winter,"road_winter");
		
		GameRegistry.registerItem(mantarn_f01,"mantarn_f01");
		GameRegistry.registerItem(jacky_f02,"jacky_f02");
		GameRegistry.registerItem(sparner_f03,"sparner_f03");
		
		GameRegistry.registerItem(mega_maxflare,"mega_maxflare");
		
		GameRegistry.registerItem(signal_mach,"signal_mach");
		GameRegistry.registerItem(signal_magarl,"signal_magarl");
		GameRegistry.registerItem(signal_kaksarn,"signal_kaksarn");
		GameRegistry.registerItem(signal_tomarle,"signal_tomarle");
		GameRegistry.registerItem(signal_kikern,"signal_kikern");
		GameRegistry.registerItem(signal_chaser,"signal_chaser");
		GameRegistry.registerItem(shift_ride_crosser ,"shift_ride_crosser");
		
		GameRegistry.registerItem(tridoron_key,"tridoron_key");
		
		GameRegistry.registerItem(rhino_super,"rhino_super");
		
		GameRegistry.registerItem(burning_solar,"burning_solar");
		GameRegistry.registerItem(colorful_commercial,"colorful_commercial");
		GameRegistry.registerItem(deco_traveller,"deco_traveller");
		GameRegistry.registerItem(amazing_circus,"amazing_circus");
		
		GameRegistry.registerItem(next_hunter,"next_hunter");
		GameRegistry.registerItem(next_builder,"next_builder");
		GameRegistry.registerItem(next_traveller,"next_traveller");
		GameRegistry.registerItem(tokujoka_key,"tokujoka_key");
		
		GameRegistry.registerItem(gan_gun_saber_blade,"gan_gun_saber_blade");
		GameRegistry.registerItem(gan_gun_saber_nitouryu,"gan_gun_saber_nitouryu");
		GameRegistry.registerItem(gan_gun_saber_nitouryu_2,"gan_gun_saber_nitouryu_2");
		GameRegistry.registerItem(gan_gun_saber_gun,"gan_gun_saber_gun");
		GameRegistry.registerItem(gan_gun_saber_naginata,"gan_gun_saber_naginata");
		GameRegistry.registerItem(gan_gun_saber_condor_denwor,"gan_gun_saber_condor_denwor");
		GameRegistry.registerItem(gan_gun_saber_rifle,"gan_gun_saber_rifle");
		GameRegistry.registerItem(gan_gun_saber_hammer,"gan_gun_saber_hammer");
		GameRegistry.registerItem(sunglasseslasher_sword,"sunglasseslasher_sword");
		GameRegistry.registerItem(sunglasseslasher_gun,"sunglasseslasher_gun");
		GameRegistry.registerItem(gan_gun_hand_rod,"gan_gun_hand_rod");
		GameRegistry.registerItem(gan_gun_hand_gun,"gan_gun_hand_gun");
		GameRegistry.registerItem(gan_gun_hand_kama,"gan_gun_hand_kama");
		GameRegistry.registerItem(deep_slasher_sword,"deep_slasher_sword");
		GameRegistry.registerItem(deep_slasher_blaster,"deep_slasher_blaster");
		GameRegistry.registerItem(gan_gun_catcher_rod,"gan_gun_catcher_rod");
		GameRegistry.registerItem(gan_gun_catcher_gun,"gan_gun_catcher_gun");
	

		GameRegistry.registerItem(ghosthead , "ghosthead");
		GameRegistry.registerItem(ghosttroso , "ghosttroso");
		GameRegistry.registerItem(ghostlegs , "ghostlegs");
		GameRegistry.registerItem(ghostdriver , "ghostdriver");
		GameRegistry.registerItem(specterdriver , "specterdriver");
		GameRegistry.registerItem(mega_ulorder , "mega_ulorder");

		GameRegistry.registerItem(unfinished_eyecon_driver_g , "unfinished_eyecon_driver_g");
		GameRegistry.registerItem(eyecon_driver_g , "eyecon_driver_g");
		
		GameRegistry.registerItem(dark_ghostdriver , "dark_ghostdriver");
		GameRegistry.registerItem(zero_specterdriver , "zero_specterdriver");
		GameRegistry.registerItem(proto_mega_ulorder_r , "proto_mega_ulorder_r");
		GameRegistry.registerItem(proto_mega_ulorder_b , "proto_mega_ulorder_b");
		GameRegistry.registerItem(proto_mega_ulorder_y , "proto_mega_ulorder_y");
		GameRegistry.registerItem(proto_mega_ulorder_p , "proto_mega_ulorder_p");

		GameRegistry.registerItem(extremer_driver , "extremer_driver");
		
		GameRegistry.registerItem(ore_ghost_icon , "ore_ghost_icon");
		GameRegistry.registerItem(toucon_boost_icon , "toucon_boost_icon");
		GameRegistry.registerItem(mugen_icon , "mugen_icon");
		GameRegistry.registerItem(specter_ghost_icon , "specter_ghost_icon");
		GameRegistry.registerItem(deep_specter_ghost_icon , "deep_specter_ghost_icon");
		GameRegistry.registerItem(sin_specter_icon , "sin_specter_icon");
		GameRegistry.registerItem(necrom_ghost_icon , "necrom_ghost_icon");
		GameRegistry.registerItem(yujou_burst_icon , "yujou_burst_icon");
		
		GameRegistry.registerItem(dark_ghost_icon , "dark_ghost_icon");
		GameRegistry.registerItem(zero_specter_ghost_icon , "zero_specter_ghost_icon");
		GameRegistry.registerItem(dark_necrom_red_ghost_icon , "dark_necrom_red_ghost_icon");
		GameRegistry.registerItem(dark_necrom_blue_ghost_icon , "dark_necrom_blue_ghost_icon");
		GameRegistry.registerItem(dark_necrom_yellow_ghost_icon , "dark_necrom_yellow_ghost_icon");
		GameRegistry.registerItem(dark_necrom_pink_ghost_icon , "dark_necrom_pink_ghost_icon");
		
		GameRegistry.registerItem(edison_ghost_icon , "edison_ghost_icon");
		GameRegistry.registerItem(newton_ghost_icon , "newton_ghost_icon");
		GameRegistry.registerItem(musashi_ghost_icon , "musashi_ghost_icon");
		GameRegistry.registerItem(robin_ghost_icon , "robin_ghost_icon");
		GameRegistry.registerItem(billy_the_kid_icon , "billy_the_kid_icon");
		GameRegistry.registerItem(beethoven_icon , "beethoven_icon");
		GameRegistry.registerItem(benkei_icon , "benkei_icon");
		GameRegistry.registerItem(goemon_icon , "goemon_icon");
		GameRegistry.registerItem(ryoma_icon , "ryoma_icon");
		GameRegistry.registerItem(himiko_ghost_icon , "himiko_ghost_icon");
		
		GameRegistry.registerItem(tutankhamun_icon , "tutankhamun_icon");
		GameRegistry.registerItem(nobunaga_icon , "nobunaga_icon");
		GameRegistry.registerItem(houdini_icon , "houdini_icon");
		
		GameRegistry.registerItem(grimm_icon , "grimm_icon");
		GameRegistry.registerItem(sanzo_icon , "sanzo_icon");
		
		
		GameRegistry.registerItem(napoleon_icon , "napoleon_icon");
		GameRegistry.registerItem(darwin_icon , "darwin_icon");	
		
		GameRegistry.registerItem(ikkyu_icon , "ikkyu_icon");
		GameRegistry.registerItem(pythagoras_icon , "pythagoras_icon");
		GameRegistry.registerItem(santa_icon , "santa_icon");
		GameRegistry.registerItem(kamehameha_icon , "kamehameha_icon");
		GameRegistry.registerItem(special_ore_icon , "special_ore_icon");
		GameRegistry.registerItem(ore_specter_ghost_icon , "ore_specter_ghost_icon");
		GameRegistry.registerItem(ishinomori_ghost_icon , "ishinomori_ghost_icon");
		
		GameRegistry.registerItem(columbus_icon , "columbus_icon");
		GameRegistry.registerItem(shakespeare_icon , "shakespeare_icon");
		GameRegistry.registerItem(nightingale_icon , "nightingale_icon");
		GameRegistry.registerItem(galileo_icon , "galileo_icon");
		GameRegistry.registerItem(da_vinci_ghost_icon , "da_vinci_ghost_icon");
		
		GameRegistry.registerItem(tenkatoitsu_icon , "tenkatoitsu_icon");
		GameRegistry.registerItem(shinsengumi_icon , "shinsengumi_icon");
		
		GameRegistry.registerItem(showa_ghost_icon , "showa_ghost_icon");
		GameRegistry.registerItem(kuuga_ghost_icon , "kuuga_ghost_icon");
		GameRegistry.registerItem(agito_ghost_icon , "agito_ghost_icon");
		GameRegistry.registerItem(ryuki_ghost_icon , "ryuki_ghost_icon");
		GameRegistry.registerItem(faiz_ghost_icon , "faiz_ghost_icon");
		GameRegistry.registerItem(blade_ghost_icon , "blade_ghost_icon");
		GameRegistry.registerItem(hibiki_ghost_icon , "hibiki_ghost_icon");
		GameRegistry.registerItem(kabuto_ghost_icon , "kabuto_ghost_icon");
		GameRegistry.registerItem(den_o_ghost_icon , "den_o_ghost_icon");
		GameRegistry.registerItem(kiva_ghost_icon , "kiva_ghost_icon");
		GameRegistry.registerItem(decade_ghost_icon , "decade_ghost_icon");
		GameRegistry.registerItem(double_ghost_icon , "double_ghost_icon");
		GameRegistry.registerItem(ooo_ghost_icon , "ooo_ghost_icon");
		GameRegistry.registerItem(fourze_ghost_icon , "fourze_ghost_icon");
		GameRegistry.registerItem(wizard_ghost_icon , "wizard_ghost_icon");
		GameRegistry.registerItem(gaim_ghost_icon , "gaim_ghost_icon");
		GameRegistry.registerItem(drive_ghost_icon , "drive_ghost_icon");
		GameRegistry.registerItem(ghost_ghost_icon , "ghost_ghost_icon");
		GameRegistry.registerItem(ex_aid_ghost_icon , "ex_aid_ghost_icon");
		
		GameRegistry.registerItem(unfinished_fourtyfive_heisei_ghost_icon , "unfinished_fourtyfive_heisei_ghost_icon");
		GameRegistry.registerItem(fourtyfive_heisei_ghost_icon , "fourtyfive_heisei_ghost_icon");
		GameRegistry.registerItem(fourtyfive_showa_ghost_icon , "fourtyfive_showa_ghost_icon");
	
		GameRegistry.registerItem(royalty_gamma_icon , "royalty_gamma_icon");
		GameRegistry.registerItem(transform_gamma_icon , "transform_gamma_icon");
		GameRegistry.registerItem(knife_gamma_icon , "knife_gamma_icon");
		
		GameRegistry.registerItem(yurusen_gamma_icon , "yurusen_gamma_icon");
		GameRegistry.registerItem(sister_gamma_icon , "sister_gamma_icon");
		
		GameRegistry.registerItem(gashacon_breaker, "gashacon_breaker");
		GameRegistry.registerItem(gashacon_breaker_ham, "gashacon_breaker_ham");
		GameRegistry.registerItem(gashacon_sword , "gashacon_sword");
		GameRegistry.registerItem(gashacon_sword_ice , "gashacon_sword_ice");
		GameRegistry.registerItem(gashacon_magnum_gun , "gashacon_magnum_gun");
		GameRegistry.registerItem(gashacon_sparrow_sickle_a , "gashacon_sparrow_sickle_a");
		GameRegistry.registerItem(gashacon_sparrow_sickle_b , "gashacon_sparrow_sickle_b");
		GameRegistry.registerItem(gashacon_sparrow_arrow , "gashacon_sparrow_arrow");
		GameRegistry.registerItem(gashacon_key_slasher , "gashacon_key_slasher");
		
		GameRegistry.registerItem(gashacon_bugvisor , "gashacon_bugvisor");
		GameRegistry.registerItem(gashacon_bugvisor_gun , "gashacon_bugvisor_gun");
		GameRegistry.registerItem(gashacon_bugvisor_ii , "gashacon_bugvisor_ii");
		GameRegistry.registerItem(gashacon_bugvisor_ii_gun , "gashacon_bugvisor_ii_gun");
		
		GameRegistry.registerItem(parabragun_axe , "parabragun_axe");
		GameRegistry.registerItem(parabragun_gun , "parabragun_gun");
		GameRegistry.registerItem(ride_weapon_gun , "ride_weapon_gun");
		GameRegistry.registerItem(ride_weapon , "ride_weapon");
		
		GameRegistry.registerItem(true_brave_sword , "true_brave_sword");
		GameRegistry.registerItem(fuuma_sword , "fuuma_sword");
		
		GameRegistry.registerItem(bugster_trident , "bugster_trident");
		GameRegistry.registerItem(bugster_trident_big , "bugster_trident_big");
		
		GameRegistry.registerItem(deus_rusher , "deus_rusher");
		GameRegistry.registerItem(deus_rusher_red , "deus_rusher_red");
		
		GameRegistry.registerItem(ex_aidhead , "ex_aidhead");
		GameRegistry.registerItem(ex_aidtroso , "ex_aidtroso");
		GameRegistry.registerItem(ex_aidlegs , "ex_aidlegs");
		
		GameRegistry.registerItem(gamer_driver_ex_aid , "gamer_driver_ex_aid");
		GameRegistry.registerItem(gamer_driver_brave, "gamer_driver_brave");
		GameRegistry.registerItem(gamer_driver_snipe, "gamer_driver_snipe");
		GameRegistry.registerItem(gamer_driver_lazer, "gamer_driver_lazer");
		GameRegistry.registerItem(gamer_driver_lazer_turbo, "gamer_driver_lazer_turbo");
		GameRegistry.registerItem(gamer_driver_genmu, "gamer_driver_genmu");
		GameRegistry.registerItem(gamer_driver_paradox, "gamer_driver_paradox");
		GameRegistry.registerItem(gamer_driver_chronos, "gamer_driver_chronos");
		
		
		GameRegistry.registerItem(gamer_driver_truebrave, "gamer_driver_truebrave");
		GameRegistry.registerItem(gamer_driver_fuuma, "gamer_driver_fuuma");
		GameRegistry.registerItem(gamer_driver_proto_brave, "gamer_driver_proto_brave");
		GameRegistry.registerItem(gamer_driver_proto_snipe, "gamer_driver_proto_snipe");
		GameRegistry.registerItem(gamer_driver_nico_snipe, "gamer_driver_nico_snipe");

		GameRegistry.registerItem(gamer_driver_anotherparadox, "gamer_driver_anotherparadox");
		GameRegistry.registerItem(gamer_driver_gamedeus_muteki, "gamer_driver_gamedeus_muteki");
		
		GameRegistry.registerItem(gashacon_bugvisor_genmu, "gashacon_bugvisor_genmu");
		GameRegistry.registerItem(gashacon_bugvisor_ii_poppy, "gashacon_bugvisor_ii_poppy");
		GameRegistry.registerItem(gashacon_bugvisor_ii_chronos, "gashacon_bugvisor_ii_chronos");
		GameRegistry.registerItem(gashacon_bugvisor_ii_chronos_gemdeus, "gashacon_bugvisor_ii_chronos_gemdeus");
		GameRegistry.registerItem(gashacon_bugvisor_ii_lazer, "gashacon_bugvisor_ii_lazer");
		GameRegistry.registerItem(gashacon_bugvisor_ii_chronicle_bugster, "gashacon_bugvisor_ii_chronicle_bugster");
		
		GameRegistry.registerItem(paradoxbelt, "paradoxbelt");
		GameRegistry.registerItem(rideplayerbelt, "rideplayerbelt");
		GameRegistry.registerItem(rideplayerbelt_nico, "rideplayerbelt_nico");
		GameRegistry.registerItem(ninjaplayerbelt, "ninjaplayerbelt");
		
		GameRegistry.registerItem(mighty_action_x_gashat, "mighty_action_x_gashat");
		GameRegistry.registerItem(taddle_quest_gashat, "taddle_quest_gashat");
		GameRegistry.registerItem(bang_bang_shooting_gashat, "bang_bang_shooting_gashat");
		GameRegistry.registerItem(bakusou_bike_gashat, "bakusou_bike_gashat");
		
		GameRegistry.registerItem(proto_mighty_action_x_gashat, "proto_mighty_action_x_gashat");
		GameRegistry.registerItem(proto_taddle_quest_gashat, "proto_taddle_quest_gashat");
		GameRegistry.registerItem(proto_bang_bang_shooting_gashat, "proto_bang_bang_shooting_gashat");
		GameRegistry.registerItem(proto_bakusou_bike_gashat, "proto_bakusou_bike_gashat");
		GameRegistry.registerItem(proto_mighty_action_x_gashat_origin, "proto_mighty_action_x_gashat_origin");
		
		GameRegistry.registerItem(dangerous_zombie_gashat, "dangerous_zombie_gashat");
		GameRegistry.registerItem(kamen_rider_chronicle_gashat, "kamen_rider_chronicle_gashat");
		GameRegistry.registerItem(toki_meki_crisis_gashat, "toki_meki_crisis_gashat");
		
		GameRegistry.registerItem(taddle_legacy_gashat, "taddle_legacy_gashat");
		GameRegistry.registerItem(hurricane_ninja_gashat, "hurricane_ninja_gashat");
		
		GameRegistry.registerItem(mighty_brothers_xx_gashat, "mighty_brothers_xx_gashat");
		GameRegistry.registerItem(maximum_mighty_x_gashat, "maximum_mighty_x_gashat");
		GameRegistry.registerItem(hyper_muteki_gashat, "hyper_muteki_gashat");
		GameRegistry.registerItem(mighty_creator_vrx_gashat, "mighty_creator_vrx_gashat");
		GameRegistry.registerItem(knock_out_fighter_2_gashat, "knock_out_fighter_2_gashat");
		
		GameRegistry.registerItem(gamedeus_hyper_muteki_gashat, "gamedeus_hyper_muteki_gashat");

		GameRegistry.registerItem(doctor_mighty_xx_gashat, "doctor_mighty_xx_gashat");
		
		GameRegistry.registerItem(kaigan_ghost_gashat, "kaigan_ghost_gashat");
		GameRegistry.registerItem(full_throttle_drive_gashat, "full_throttle_drive_gashat");
		GameRegistry.registerItem(toukenden_gaim_gashat, "toukenden_gaim_gashat");
		GameRegistry.registerItem(magic_the_wizard_gashat, "magic_the_wizard_gashat");
		GameRegistry.registerItem(space_galaxy_fourze_gashat, "space_galaxy_fourze_gashat");
		GameRegistry.registerItem(jungle_ooo_gashat, "jungle_ooo_gashat");
		GameRegistry.registerItem(detective_double_gashat, "detective_double_gashat");
		GameRegistry.registerItem(barcode_warrior_decade_gashat, "barcode_warrior_decade_gashat");
		GameRegistry.registerItem(dokidoki_makai_castle_kiva_gashat, "dokidoki_makai_castle_kiva_gashat");
		GameRegistry.registerItem(time_express_den_o_gashat, "time_express_den_o_gashat");
		GameRegistry.registerItem(insect_wars_kabuto_gashat, "insect_wars_kabuto_gashat");
		GameRegistry.registerItem(taiko_master_hibik_gashat, "taiko_master_hibik_gashat");
		GameRegistry.registerItem(king_of_poker_blade_gashat, "king_of_poker_blade_gashat");
		GameRegistry.registerItem(moshi_moshi_faiz_gashat, "moshi_moshi_faiz_gashat");
		GameRegistry.registerItem(mirror_labryinth_ryuki_gashat, "mirror_labryinth_ryuki_gashat");
		GameRegistry.registerItem(agito_of_the_sun_gashat, "agito_of_the_sun_gashat");
		GameRegistry.registerItem(adventure_guy_kuuga_gashat, "adventure_guy_kuuga_gashat");
		GameRegistry.registerItem(lets_go_ichigou_gashat, "lets_go_ichigou_gashat");
		GameRegistry.registerItem(kamen_rider_build_gashat, "kamen_rider_build_gashat");
		
		GameRegistry.registerItem(gekitotsu_robots_gashat, "gekitotsu_robots_gashat");
		GameRegistry.registerItem(proto_gekitotsu_robots_gashat, "proto_gekitotsu_robots_gashat");
		
		GameRegistry.registerItem(doremifa_beat_gashat, "doremifa_beat_gashat");
		GameRegistry.registerItem(proto_doremifa_beat_gashat, "proto_doremifa_beat_gashat");
		
		GameRegistry.registerItem(jet_combat_gashat, "jet_combat_gashat");
		GameRegistry.registerItem(proto_jet_combat_gashat, "proto_jet_combat_gashat");
		
		GameRegistry.registerItem(giri_giri_chambara_gashat, "giri_giri_chambara_gashat");
		GameRegistry.registerItem(proto_giri_giri_chambara_gashat, "proto_giri_giri_chambara_gashat");
		
		GameRegistry.registerItem(shakariki_sports_gashat, "shakariki_sports_gashat");
		GameRegistry.registerItem(proto_shakariki_sports_gashat, "proto_shakariki_sports_gashat");
		
		GameRegistry.registerItem(drago_knight_hunter_z_gashat, "drago_knight_hunter_z_gashat");
		GameRegistry.registerItem(proto_drago_knight_hunter_z_gashat, "proto_drago_knight_hunter_z_gashat");
		
		GameRegistry.registerItem(ju_ju_burger_gashat, "ju_ju_burger_gashat");
		GameRegistry.registerItem(night_of_safari_gashat, "night_of_safari_gashat");
		
		GameRegistry.registerItem(taddle_fantasy_gashat, "taddle_fantasy_gashat");
		GameRegistry.registerItem(bang_bang_simulation_gashat, "bang_bang_simulation_gashat");

		GameRegistry.registerItem(bang_bang_tank_gashat, "bang_bang_tank_gashat");
		
		GameRegistry.registerItem(perfect_puzzle_gashat, "perfect_puzzle_gashat");
		GameRegistry.registerItem(knock_out_fighter_gashat, "knock_out_fighter_gashat");
		GameRegistry.registerItem(gashat_gear_dual_another, "gashat_gear_dual_another");
		GameRegistry.registerItem(god_maximum_mighty_x_gashat, "god_maximum_mighty_x_gashat");
		
		GameRegistry.registerItem(proto_bakusou_bike_combi_fukkatsu_gashat, "proto_bakusou_bike_combi_fukkatsu_gashat");
		
		GameRegistry.registerItem(pac_adventure_gashat, "pac_adventure_gashat");
		GameRegistry.registerItem(xevious_gashat, "xevious_gashat");
		GameRegistry.registerItem(famitsa_gashat, "famitsa_gashat");
		GameRegistry.registerItem(galaxian_gashat, "galaxian_gashat");
		GameRegistry.registerItem(taiko_no_tatsujin_gashat, "taiko_no_tatsujin_gashat");
		GameRegistry.registerItem(gabarizing_gashat, "gabarizing_gashat");
		
		//Build
		GameRegistry.registerItem(smash_bottle , "smash_bottle");
		
		GameRegistry.registerItem(drill_crusher_gun, "drill_crusher_gun");
		GameRegistry.registerItem(drill_crusher, "drill_crusher");
		GameRegistry.registerItem(hawk_gatlinger, "hawk_gatlinger");
		GameRegistry.registerItem(koma_ninpoutou, "koma_ninpoutou");
		GameRegistry.registerItem(kaizoku_hassha, "kaizoku_hassha");
		GameRegistry.registerItem(twinbreaker, "twinbreaker");
		GameRegistry.registerItem(twinbreaker_sword, "twinbreaker_sword");
		GameRegistry.registerItem(beat_crosser, "beat_crosser");
		GameRegistry.registerItem(full_bottle_buster_gun, "full_bottle_buster_gun");
		GameRegistry.registerItem(full_bottle_buster, "full_bottle_buster");
		GameRegistry.registerItem(magma_knuckle, "magma_knuckle");
		GameRegistry.registerItem(blizzard_knuckle, "blizzard_knuckle");
		
		GameRegistry.registerItem(buildhead, "buildhead");
		GameRegistry.registerItem(buildtroso, "buildtroso");
		GameRegistry.registerItem(buildlegs, "buildlegs");
		
		GameRegistry.registerItem(build_driver, "build_driver");
		GameRegistry.registerItem(build_driver_cross_z, "build_driver_cross_z");
		GameRegistry.registerItem(build_driver_grease, "build_driver_grease");
		GameRegistry.registerItem(build_driver_rogue, "build_driver_rogue");
		GameRegistry.registerItem(build_driver_blood, "build_driver_blood");
		GameRegistry.registerItem(build_driver_killbas , "build_driver_killbas");
		
		GameRegistry.registerItem(sclash_driver_grease, "sclash_driver_grease");
		GameRegistry.registerItem(sclash_driver_cross_z_charge, "sclash_driver_cross_z_charge");
		GameRegistry.registerItem(sclash_driver_rogue, "sclash_driver_rogue");
		
		GameRegistry.registerItem(evol_driver_evol, "evol_driver_evol");
		GameRegistry.registerItem(evol_driver_mad_rogue, "evol_driver_mad_rogue");
		
		GameRegistry.registerItem(transteamgun, "transteamgun");
		GameRegistry.registerItem(transteamgun_2, "transteamgun_2");
		GameRegistry.registerItem(transteamgun_rifle, "transteamgun_rifle");
		
		GameRegistry.registerItem(steam_blade, "steam_blade");
		
		GameRegistry.registerItem(nebulasteamgun, "nebulasteamgun");
		GameRegistry.registerItem(nebulasteamgun_2, "nebulasteamgun_2");
		GameRegistry.registerItem(nebulasteamgun_rifle, "nebulasteamgun_rifle");
		
		GameRegistry.registerItem(rabbit_full_bottle, "rabbit_full_bottle");
		GameRegistry.registerItem(gorilla_full_bottle, "gorilla_full_bottle");
		GameRegistry.registerItem(taka_full_bottle, "taka_full_bottle");
		GameRegistry.registerItem(harinezumi_full_bottle, "harinezumi_full_bottle");
		GameRegistry.registerItem(ninjya_full_bottle, "ninjya_full_bottle");
		GameRegistry.registerItem(panda_full_bottle, "panda_full_bottle");
		GameRegistry.registerItem(lion_full_bottle, "lion_full_bottle");
		GameRegistry.registerItem(dragon_full_bottle, "dragon_full_bottle");
		GameRegistry.registerItem(kaizoku_full_bottle, "kaizoku_full_bottle");
		GameRegistry.registerItem(octopus_full_bottle, "octopus_full_bottle");
		GameRegistry.registerItem(phoenix_full_bottle, "phoenix_full_bottle");
		GameRegistry.registerItem(rose_full_bottle, "rose_full_bottle");
		GameRegistry.registerItem(tora_full_bottle, "tora_full_bottle");
		GameRegistry.registerItem(kujira_full_bottle, "kujira_full_bottle");
		GameRegistry.registerItem(kirin_full_bottle, "kirin_full_bottle");
		GameRegistry.registerItem(unicorn_full_bottle, "unicorn_full_bottle");
		GameRegistry.registerItem(turtle_full_bottle, "turtle_full_bottle");
		GameRegistry.registerItem(deer_full_bottle, "deer_full_bottle");
		GameRegistry.registerItem(penguin_full_bottle, "penguin_full_bottle");
		GameRegistry.registerItem(spider_full_bottle, "spider_full_bottle");
		GameRegistry.registerItem(rabbit_gold_full_bottle, "rabbit_gold_full_bottle");
		GameRegistry.registerItem(bat_full_bottle_2, "bat_full_bottle_2");
		GameRegistry.registerItem(same_full_bottle, "same_full_bottle");
		GameRegistry.registerItem(hachi_full_bottle, "hachi_full_bottle");
		GameRegistry.registerItem(sai_full_bottle, "sai_full_bottle");
		GameRegistry.registerItem(scorpion_full_bottle , "scorpion_full_bottle");
		
		GameRegistry.registerItem(dog_full_bottle, "dog_full_bottle");
		GameRegistry.registerItem(santa_full_bottle, "santa_full_bottle");
		GameRegistry.registerItem(kuma_full_bottle, "kuma_full_bottle");
		GameRegistry.registerItem(wolf_full_bottle, "wolf_full_bottle");
		GameRegistry.registerItem(beetle_full_bottle, "beetle_full_bottle");
		
		GameRegistry.registerItem(doctor_full_bottle, "doctor_full_bottle");
		GameRegistry.registerItem(orange_full_bottle, "orange_full_bottle");
		GameRegistry.registerItem(mahoutskai_full_bottle, "mahoutskai_full_bottle");
		GameRegistry.registerItem(tantei_full_bottle, "tantei_full_bottle");
		GameRegistry.registerItem(momotaros_full_bottle, "momotaros_full_bottle");
		GameRegistry.registerItem(yujou_full_bottle, "yujou_full_bottle");
		GameRegistry.registerItem(obake_full_bottle, "obake_full_bottle");
		GameRegistry.registerItem(card_full_bottle, "card_full_bottle");
		
		GameRegistry.registerItem(tank_full_bottle, "tank_full_bottle");
		GameRegistry.registerItem(diamond_full_bottle, "diamond_full_bottle");
		GameRegistry.registerItem(gatling_full_bottle, "gatling_full_bottle");
		GameRegistry.registerItem(soujiki_full_bottle, "soujiki_full_bottle");
		GameRegistry.registerItem(comic_full_bottle, "comic_full_bottle");
		GameRegistry.registerItem(rocket_full_bottle, "rocket_full_bottle");
		GameRegistry.registerItem(shoubousha_full_bottle, "shoubousha_full_bottle");
		GameRegistry.registerItem(lock_full_bottle, "lock_full_bottle");
		GameRegistry.registerItem(ressha_full_bottle, "ressha_full_bottle");
		GameRegistry.registerItem(light_full_bottle, "light_full_bottle");
		GameRegistry.registerItem(robo_full_bottle, "robo_full_bottle");
		GameRegistry.registerItem(helicopter_full_bottle, "helicopter_full_bottle");
		GameRegistry.registerItem(ufo_full_bottle, "ufo_full_bottle");
		GameRegistry.registerItem(jet_full_bottle, "jet_full_bottle");
		GameRegistry.registerItem(cyclone_full_bottle, "cyclone_full_bottle");
		GameRegistry.registerItem(eraser_full_bottle, "eraser_full_bottle");
		GameRegistry.registerItem(watch_full_bottle, "watch_full_bottle");
		GameRegistry.registerItem(pyramid_full_bottle, "pyramid_full_bottle");
		GameRegistry.registerItem(skateboard_full_bottle, "skateboard_full_bottle");
		GameRegistry.registerItem(fridge_full_bottle, "fridge_full_bottle");
		GameRegistry.registerItem(dragon_silver_full_bottle, "dragon_silver_full_bottle");
		GameRegistry.registerItem(engine_full_bottle, "engine_full_bottle");
		GameRegistry.registerItem(bike_full_bottle, "bike_full_bottle");
		GameRegistry.registerItem(magnet_full_bottle, "magnet_full_bottle");
		GameRegistry.registerItem(submarine_full_bottle, "submarine_full_bottle");
		GameRegistry.registerItem(dryer_full_bottle, "dryer_full_bottle");
		GameRegistry.registerItem(gold_full_bottle , "gold_full_bottle");
		
		GameRegistry.registerItem(mic_full_bottle, "mic_full_bottle");
		GameRegistry.registerItem(cake_full_bottle, "cake_full_bottle");
		GameRegistry.registerItem(televi_full_bottle, "televi_full_bottle");
		GameRegistry.registerItem(smartphone_full_bottle, "smartphone_full_bottle");
		GameRegistry.registerItem(camera_full_bottle, "camera_full_bottle");
			
		GameRegistry.registerItem(game_full_bottle, "game_full_bottle");
		GameRegistry.registerItem(medal_full_bottle, "medal_full_bottle");
		GameRegistry.registerItem(usb_memory_full_bottle, "usb_memory_full_bottle");
		GameRegistry.registerItem(parka_full_bottle, "parka_full_bottle");
		GameRegistry.registerItem(low_rabbit_full_bottle, "low_rabbit_full_bottle");
		
		GameRegistry.registerItem(rabbittank_sparkling_full_bottle, "rabbittank_sparkling_full_bottle");
		GameRegistry.registerItem(hazard_trigger, "hazard_trigger");
		GameRegistry.registerItem(fullfull_bottle_rabbit, "fullfull_bottle_rabbit");
		GameRegistry.registerItem(fullfull_bottle_tank, "fullfull_bottle_tank");
		GameRegistry.registerItem(genius_full_bottle, "genius_full_bottle");
		GameRegistry.registerItem(cross_z_build_can, "cross_z_build_can");
		
		GameRegistry.registerItem(dragon_magma_full_bottle, "dragon_magma_full_bottle");
		GameRegistry.registerItem(dragon_evol_bottle_gold, "dragon_evol_bottle_gold");
		GameRegistry.registerItem(muscle_galaxy_full_bottle, "muscle_galaxy_full_bottle");
		GameRegistry.registerItem(north_blizzard_full_bottle, "north_blizzard_full_bottle");
		GameRegistry.registerItem(prime_rogue_full_bottle, "prime_rogue_full_bottle");
		
		GameRegistry.registerItem(dragon_sclashjelly, "dragon_sclashjelly");
		GameRegistry.registerItem(robot_sclashjelly, "robot_sclashjelly");
		GameRegistry.registerItem(crocodile_crack_full_bottle, "crocodile_crack_full_bottle");
		
		GameRegistry.registerItem(cobra_evol_bottle, "cobra_evol_bottle");
		GameRegistry.registerItem(rider_system_evol_bottle, "rider_system_evol_bottle");
		GameRegistry.registerItem(dragon_evol_bottle, "dragon_evol_bottle");
		GameRegistry.registerItem(rabbit_evol_bottle, "rabbit_evol_bottle");
		GameRegistry.registerItem(evol_trigger, "evol_trigger");
		
		GameRegistry.registerItem(bat_full_bottle, "bat_full_bottle");
		GameRegistry.registerItem(cobra_full_bottle, "cobra_full_bottle");
		GameRegistry.registerItem(fukurou_full_bottle, "fukurou_full_bottle");
		GameRegistry.registerItem(kuwagata_full_bottle, "kuwagata_full_bottle");
		GameRegistry.registerItem(castle_full_bottle, "castle_full_bottle");
		
		GameRegistry.registerItem(gear_engine, "gear_engine");
		GameRegistry.registerItem(gear_remocon, "gear_remocon");
		GameRegistry.registerItem(gear_red, "gear_red");
		GameRegistry.registerItem(gear_blue, "gear_blue");

		GameRegistry.registerItem(lost_bat_full_bottle , "lost_bat_full_bottle");
		GameRegistry.registerItem(lost_cobra_full_bottle , "lost_cobra_full_bottle");
		GameRegistry.registerItem(lost_castle_full_bottle , "lost_castle_full_bottle");
		GameRegistry.registerItem(lost_kuwagata_full_bottle , "lost_kuwagata_full_bottle");
		GameRegistry.registerItem(lost_fukurou_full_bottle , "lost_fukurou_full_bottle");
		GameRegistry.registerItem(lost_hammer_full_bottle , "lost_hammer_full_bottle");
		GameRegistry.registerItem(lost_shimauma_full_bottle , "lost_shimauma_full_bottle");
		GameRegistry.registerItem(lost_spanner_full_bottle , "lost_spanner_full_bottle");
		GameRegistry.registerItem(lost_hasami_full_bottle , "lost_hasami_full_bottle");
		GameRegistry.registerItem(lost_cd_full_bottle , "lost_cd_full_bottle");
		
		GameRegistry.registerItem(build_driver_rabbit, "build_driver_rabbit");
		GameRegistry.registerItem(build_driver_gorilla, "build_driver_gorilla");
		GameRegistry.registerItem(build_driver_taka, "build_driver_taka");
		GameRegistry.registerItem(build_driver_harinezumi, "build_driver_harinezumi");
		GameRegistry.registerItem(build_driver_ninja, "build_driver_ninja");
		GameRegistry.registerItem(build_driver_panda, "build_driver_panda");
		GameRegistry.registerItem(build_driver_lion, "build_driver_lion");
		GameRegistry.registerItem(build_driver_dragon, "build_driver_dragon");
		GameRegistry.registerItem(build_driver_santa, "build_driver_santa");
		GameRegistry.registerItem(build_driver_orange, "build_driver_orange");
		GameRegistry.registerItem(build_driver_doctor, "build_driver_doctor");
		GameRegistry.registerItem(build_driver_dog, "build_driver_dog");
		GameRegistry.registerItem(build_driver_mahoutsukai, "build_driver_mahoutsukai");
		GameRegistry.registerItem(build_driver_tantei, "build_driver_tantei");
		GameRegistry.registerItem(build_driver_kaizoku, "build_driver_kaizoku");
		GameRegistry.registerItem(build_driver_octopus, "build_driver_octopus");
		GameRegistry.registerItem(build_driver_phoenix, "build_driver_phoenix");
		GameRegistry.registerItem(build_driver_kuma, "build_driver_kuma");
		GameRegistry.registerItem(build_driver_momotaros, "build_driver_momotaros");
		GameRegistry.registerItem(build_driver_yujou, "build_driver_yujou");
		GameRegistry.registerItem(build_driver_obake, "build_driver_obake");
		GameRegistry.registerItem(build_driver_wolf, "build_driver_wolf");
		GameRegistry.registerItem(build_driver_beetle, "build_driver_beetle");
		GameRegistry.registerItem(build_driver_card, "build_driver_card");
		GameRegistry.registerItem(build_driver_rose, "build_driver_rose");
		GameRegistry.registerItem(build_driver_tora, "build_driver_tora");
		GameRegistry.registerItem(build_driver_kujira, "build_driver_kujira");
		GameRegistry.registerItem(build_driver_kirin, "build_driver_kirin");
		GameRegistry.registerItem(build_driver_unicorn, "build_driver_unicorn");
		GameRegistry.registerItem(build_driver_turtle, "build_driver_turtle");
		GameRegistry.registerItem(build_driver_deer, "build_driver_deer");
		GameRegistry.registerItem(build_driver_penguin, "build_driver_penguin");
		GameRegistry.registerItem(build_driver_spider, "build_driver_spider");
		GameRegistry.registerItem(build_driver_rabbit_gold, "build_driver_rabbit_gold");
		GameRegistry.registerItem(build_driver_scorpion , "build_driver_scorpion");
		
		GameRegistry.registerItem(build_driver_tank, "build_driver_tank");			
		GameRegistry.registerItem(build_driver_diamond, "build_driver_diamond");
		GameRegistry.registerItem(build_driver_gatling, "build_driver_gatling");
		GameRegistry.registerItem(build_driver_soujiki, "build_driver_soujiki");
		GameRegistry.registerItem(build_driver_comic, "build_driver_comic");
		GameRegistry.registerItem(build_driver_rocket, "build_driver_rocket");
		GameRegistry.registerItem(build_driver_shoubousha, "build_driver_shoubousha");
		GameRegistry.registerItem(build_driver_lock, "build_driver_lock");
		GameRegistry.registerItem(build_driver_cake, "build_driver_cake");
		GameRegistry.registerItem(build_driver_medal, "build_driver_medal");
		GameRegistry.registerItem(build_driver_game, "build_driver_game");
		GameRegistry.registerItem(build_driver_mic, "build_driver_mic");
		GameRegistry.registerItem(build_driver_usb_memory, "build_driver_usb_memory");
		GameRegistry.registerItem(build_driver_densha, "build_driver_densha");
		GameRegistry.registerItem(build_driver_light, "build_driver_light");
		GameRegistry.registerItem(build_driver_robo, "build_driver_robo");
		GameRegistry.registerItem(build_driver_televi, "build_driver_televi");
		GameRegistry.registerItem(build_driver_parka, "build_driver_parka");
		GameRegistry.registerItem(build_driver_smartphone, "build_driver_smartphone");
		GameRegistry.registerItem(build_driver_camera, "build_driver_camera");
		GameRegistry.registerItem(build_driver_helicopter, "build_driver_helicopter");
		GameRegistry.registerItem(build_driver_ufo, "build_driver_ufo");
		GameRegistry.registerItem(build_driver_jet, "build_driver_jet");
		GameRegistry.registerItem(build_driver_cyclone, "build_driver_cyclone");
		GameRegistry.registerItem(build_driver_eraser, "build_driver_eraser");
		GameRegistry.registerItem(build_driver_watch, "build_driver_watch");
		GameRegistry.registerItem(build_driver_pyramid, "build_driver_pyramid");
		GameRegistry.registerItem(build_driver_skateboard, "build_driver_skateboard");
		GameRegistry.registerItem(build_driver_fridge, "build_driver_fridge");
		GameRegistry.registerItem(build_driver_dragon_silver, "build_driver_dragon_silver");
		GameRegistry.registerItem(build_driver_sai, "build_driver_sai");
		GameRegistry.registerItem(build_driver_gold , "build_driver_gold");

		GameRegistry.registerItem(build_driver_sp, "build_driver_sp");
		GameRegistry.registerItem(build_driver_hazard, "build_driver_hazard");
		GameRegistry.registerItem(build_driver_hazard_rabbit, "build_driver_hazard_rabbit");
		GameRegistry.registerItem(build_driver_hazard_tank, "build_driver_hazard_tank");
		GameRegistry.registerItem(build_driver_genius, "build_driver_genius");
		GameRegistry.registerItem(build_driver_cross_z_build, "build_driver_cross_z_build");
		
		GameRegistry.registerItem(evol_driver_cobra, "evol_driver_cobra");
		GameRegistry.registerItem(evol_driver_dragon, "evol_driver_dragon");
		GameRegistry.registerItem(evol_driver_rabbit, "evol_driver_rabbit");
		GameRegistry.registerItem(evol_driver_blackhole, "evol_driver_blackhole");
		
		GameRegistry.registerItem(build_driver_cross_z_dragon, "build_driver_cross_z_dragon");
		GameRegistry.registerItem(build_driver_magma, "build_driver_magma");
		GameRegistry.registerItem(build_driver_cross_z_great, "build_driver_cross_z_great");
		GameRegistry.registerItem(build_driver_galaxy, "build_driver_galaxy");
		
		GameRegistry.registerItem(hawk_gatling_wings , "hawk_gatling_wings");
		GameRegistry.registerItem(phoenix_robo_wings , "phoenix_robo_wings");
		
		GameRegistry.registerItem(zi_o_head, "zi_o_head");
		GameRegistry.registerItem(zi_o_torso, "zi_o_torso");
		GameRegistry.registerItem(zi_o_legs, "zi_o_legs");
		
		GameRegistry.registerItem(zikuu_driver_zi_o, "zikuu_driver_zi_o");
		GameRegistry.registerItem(zikuu_driver_geiz, "zikuu_driver_geiz");
		GameRegistry.registerItem(zikuu_driver_ghost, "zikuu_driver_ghost");
		
		GameRegistry.registerItem(zi_o_ridewatch, "zi_o_ridewatch");
		GameRegistry.registerItem(geiz_ridewatch, "geiz_ridewatch");
		
		GameRegistry.registerItem(build_ridewatch, "build_ridewatch");
		GameRegistry.registerItem(cross_z_ridewatch, "cross_z_ridewatch");
		GameRegistry.registerItem(exaid_ridewatch, "exaid_ridewatch");
		GameRegistry.registerItem(genm_ridewatch, "genm_ridewatch");
		GameRegistry.registerItem(ghost_ridewatch, "ghost_ridewatch");
		GameRegistry.registerItem(drive_ridewatch, "drive_ridewatch");
		// GameRegistry.registerItem(gaim_ridewatch, "gaim_ridewatch");
		GameRegistry.registerItem(wizard_ridewatch, "wizard_ridewatch");
		GameRegistry.registerItem(beast_ridewatch, "beast_ridewatch");
		GameRegistry.registerItem(fourze_ridewatch, "fourze_ridewatch");
		GameRegistry.registerItem(ooo_ridewatch, "ooo_ridewatch");
		// GameRegistry.registerItem(w_ridewatch, "w_ridewatch");
		// GameRegistry.registerItem(kiva_ridewatch, "kiva_ridewatch");
		GameRegistry.registerItem(deno_ridewatch, "deno_ridewatch");
		GameRegistry.registerItem(kabuto_ridewatch, "kabuto_ridewatch");
		GameRegistry.registerItem(hibiki_ridewatch, "hibiki_ridewatch");
		// GameRegistry.registerItem(blade_ridewatch, "blade_ridewatch");
		GameRegistry.registerItem(faiz_ridewatch, "faiz_ridewatch");
		GameRegistry.registerItem(ryuki_ridewatch, "ryuki_ridewatch");
		// GameRegistry.registerItem(agito_ridewatch, "agito_ridewatch");
		// GameRegistry.registerItem(kuuga_ridewatch, "kuuga_ridewatch");
		
		GameRegistry.registerItem(amazonshead, "amazonshead");
		GameRegistry.registerItem(amazonstroso, "amazonstroso");
		GameRegistry.registerItem(amazonslegs, "amazonslegs");
		
		GameRegistry.registerItem(amazons_driver_omega, "amazons_driver_omega");
		GameRegistry.registerItem(neo_amazons_driver_omega, "neo_amazons_driver_omega");
		GameRegistry.registerItem(amazons_driver_alpha, "amazons_driver_alpha");
		GameRegistry.registerItem(amazons_driver_blind_alpha, "amazons_driver_blind_alpha");
		GameRegistry.registerItem(neo_amazons_driver_neo_alpha, "neo_amazons_driver_neo_alpha");
		GameRegistry.registerItem(amazons_driver_sigma, "amazons_driver_sigma");
		GameRegistry.registerItem(neo_amazons_driver_neo, "neo_amazons_driver_neo");
		
		GameRegistry.registerItem(condorer_core_alpha, "condorer_core_alpha");
		GameRegistry.registerItem(condorer_core_omega, "condorer_core_omega");
		GameRegistry.registerItem(condorer_core_sigma, "condorer_core_sigma");
		GameRegistry.registerItem(condorer_core_blind_alpha, "condorer_core_blind_alpha");
		
		GameRegistry.registerItem(amazon_injector_neo, "amazon_injector_neo");
		GameRegistry.registerItem(amazon_injector_new_omega, "amazon_injector_new_omega");
		GameRegistry.registerItem(amazon_injector_neo_alpha, "amazon_injector_neo_alpha");

		GameRegistry.registerItem(blanknoitem , "blanknoitem");
		
	}
	public static void RegisterRenders(){
		
		RegisterRender(blanknoitem);
		
		RegisterRender(energy);
		
		RegisterRender(donut);
		RegisterRender(icepop1);
		RegisterRender(icepop2);
		RegisterRender(icepop3);
		
		RegisterRender(cellmedal);
		RegisterRenderb(cellmedalblock);
		
		RegisterRenderb(stone_kuuga);
		RegisterRenderb(stone_agito);
		RegisterRenderb(hellrock_agito);
		RegisterRenderb(advent_glass);
		RegisterRenderb(hell_advent_glass);
		RegisterRenderb(mission_memory_block);
		RegisterRenderb(bladecard_block);
		RegisterRenderb(bladecard_hellrock);
		RegisterRenderb(oni_ore_block);
		RegisterRenderb(oni_ore_hellrock);
		RegisterRenderb(zectblock);
		RegisterRenderb(neozecthellrock);
		RegisterRenderb(imaginsandblock);
		RegisterRenderb(hellimaginsandblock);
		RegisterRenderb(fuestleblock);
		RegisterRenderb(fuestlehellrock);
		RegisterRenderb(card_stone);
		RegisterRenderb(card_hellrock);
		RegisterRenderb(gaiamemoryblock);
		RegisterRenderb(gaiamemoryhellrock);
		RegisterRenderb(cellmedalblock);
		RegisterRenderb(ooo_hellrock);
		RegisterRenderb(astroswitchblock);
		RegisterRenderb(swichhellrock);
		RegisterRenderb(wizardgemblock);
		RegisterRenderb(hellwizardgemblock);
		RegisterRenderb(himawari_lockseedblock);
		RegisterRenderb(hellrock_lockseedblock);
		RegisterRenderb(drive_stone);
		RegisterRenderb(hellrock_drive);
		RegisterRenderb(ghost_Iconsblock);
		RegisterRenderb(ghost_Icons_hellrock);
		RegisterRenderb(bugsters_stone);
		RegisterRenderb(gemdeus_stone);
		RegisterRenderb(pandora_box);
		RegisterRenderb(pandora_box_hellrock);
		RegisterRenderb(pandora_box_hellrock_2);
		RegisterRenderb(watch_stone);
		RegisterRenderb(amazon_cell_block);
		
		RegisterRender(agito_of_seed);
		RegisterRender(g3core);
		RegisterRender(blank_mission_memory);
		RegisterRender(bladecard);
		RegisterRender(mini_zecter);
		RegisterRender(oni_ore);
		RegisterRender(oni_orehell);
		RegisterRender(unfinished_kabutick_zecter);
		RegisterRender(imaginsand);
		RegisterRender(fuestle);
		RegisterRender(fuestlefake);
		RegisterRender(blankcard);
		RegisterRender(gaiamemory);
		RegisterRender(t2gaiamemory);
		RegisterRender(cellmedal);
		RegisterRender(birth_core);
		RegisterRender(astroswitch);
		RegisterRender(wizardgem);
		RegisterRender(wizardgem2);
		RegisterRender(himawari_lockseed);
		RegisterRender(himawari_energy_lockseed);
		RegisterRender(ghost_Icons);
		RegisterRender(ghost_gammaIcons);
		RegisterRender(blank_gashat);
		RegisterRender(unfinished_kamen_rider_chronicle_gashat);
		RegisterRender(full_bottle);
		RegisterRender(sclashjelly);
		RegisterRender(unfinished_gear);
		RegisterRender(blank_watch);
		RegisterRender(rider_circuit);
		RegisterRender(amazon_cell_vial);
		
		//ichigo
		RegisterRender(ichigohead);
		RegisterRender(ichigotroso);
		RegisterRender(ichigolegs);
		
		RegisterRender(typhoon_ichigo);
		RegisterRender(typhoon_nigo);
		
		RegisterRender(typhoon_shocker_rider_1);
		RegisterRender(typhoon_shocker_rider_2);
		RegisterRender(typhoon_shocker_rider_3);
		RegisterRender(typhoon_shocker_rider_4);
		RegisterRender(typhoon_shocker_rider_5);
		RegisterRender(typhoon_shocker_rider_6);
		RegisterRender(typhoon_shocker_rider_7);
		RegisterRender(typhoon_shocker_rider_8);
		RegisterRender(typhoon_shocker_rider_9);
		RegisterRender(typhoon_shocker_rider_10);
		RegisterRender(typhoon_shocker_rider_11);
		RegisterRender(typhoon_shocker_rider_12);
		
		RegisterRender(double_typhoon);
		RegisterRender(riderman_belt);
		
		RegisterRender(ridol);
		RegisterRender(condorer);
		
		RegisterRender(ridol_stick_l);
		RegisterRender(ridol_stick);
		RegisterRender(revolcane);
		RegisterRender(vortech_shooter);
		RegisterRender(bio_blade);
		
		RegisterRender(electrer);
		RegisterRender(charge_up);
		
		RegisterRender(tornado);
		
		RegisterRender(cyclode);
		
		RegisterRender(zx_belt);
		
		RegisterRender(king_stone);
		
		RegisterRender(sunriser);
		RegisterRender(bio_rider);
		RegisterRender(robo_rider);
		
		RegisterRender(split_king_stone);
		
		RegisterRender(bio_rider_belt);
		RegisterRender(robo_rider_belt);
		
		RegisterRender(typhoon_sango);
		RegisterRender(typhoon_yongo);
		
		RegisterRender(typhoon_akarider);
		RegisterRender(typhoon_aorider);
		RegisterRender(typhoon_kirider);
		RegisterRender(typhoon_momorider);
		RegisterRender(typhoon_midorider);
		
		//kuuga
		RegisterRender(dragon_rod);
		RegisterRender(dragon_rod_l);
		RegisterRender(rising_dragon_rod_l);
		
		RegisterRender(pegasus_bowgun);
		RegisterRender(rising_pegasus_bowgun);
		
		RegisterRender(titan_sword);
		RegisterRender(rising_titan_sword);
		
				RegisterRender(kuugahead);
				RegisterRender(kuugatroso);
				RegisterRender(kuugalegs);

				RegisterRender(arcle);
				RegisterRender(arcle_b);
				RegisterRender(arcle_gr);
				RegisterRender(arcle_p);
				RegisterRender(arcle_u);
				RegisterRender(arcle_ru);
				
				RegisterRender(kuuga_growing);
				RegisterRender(kuuga_mighty);
				RegisterRender(kuuga_dragon);
				RegisterRender(kuuga_pegasus);
				RegisterRender(kuuga_titan);
				RegisterRender(kuuga_rising_mighty);
				RegisterRender(kuuga_rising_dragon);
				RegisterRender(kuuga_rising_pegasus);
				RegisterRender(kuuga_rising_titan);
				RegisterRender(kuuga_amazing_mighty);
				RegisterRender(kuuga_ultimate);
				RegisterRender(kuuga_rising_ultimate);
				RegisterRender(kuuga_super_rising_ultimate);

				RegisterRender(flame_saber_charge);
				RegisterRender(flame_saber);
				
				RegisterRender(storm_halberd);
				
				RegisterRender(shining_caliber_single_mode);
				RegisterRender(shining_caliber_summoned);
				RegisterRender(shining_caliber);
				
				RegisterRender(agitohead);
				RegisterRender(agitotroso);
				RegisterRender(agitolegs);

				RegisterRender(alter_ring);
				RegisterRender(alter_ring_fl);
				RegisterRender(alter_ring_st);
				RegisterRender(alter_ring_shining);
				
				RegisterRender(meta_factor);
				RegisterRender(meta_factor_exceed);
				
				RegisterRender(ank_point);
				
				RegisterRender(g3_belt);
				RegisterRender(g3_x_belt);
				RegisterRender(g3_mild_belt);
				RegisterRender(g4_belt);
				RegisterRender(g4_x_belt);
				
				RegisterRender(g1_belt);
				
				RegisterRender(alter_ring_miracle);
				RegisterRender(ank_point_burning);
				
				RegisterRender(agito_ground);
				RegisterRender(agito_storm);
				RegisterRender(agito_flame);
				RegisterRender(agito_trinity);
				RegisterRender(agito_burning);
				RegisterRender(agito_shining);
				
				RegisterRender(gills);
				RegisterRender(exceed_gills);
				
				RegisterRender(g1);
				RegisterRender(g3);
				RegisterRender(g3x);
				RegisterRender(g3mild);
				RegisterRender(g4);
				RegisterRender(g4x);
				
				RegisterRender(another_agito);
				RegisterRender(agito_miracle);
				RegisterRender(another_agito_burning_form);
				
				//ryuki
				RegisterRender( drag_visor);
				RegisterRender( ride_saber);
				RegisterRender( drag_saber);
				RegisterRender( drag_claw);
				RegisterRender( drag_visor_zwei_big);
				RegisterRender( drag_visor_zwei);
				RegisterRender( drag_shield);
				
				RegisterRender( dark_visor);
				RegisterRender( wing_lancer_big);
				RegisterRender( wing_lancer);
				RegisterRender( dark_blade);
				
				RegisterRender(scissors_visor);
				RegisterRender(scissors_pincer);
				RegisterRender(incisor_guard);
				
				RegisterRender( magna_visor);
				RegisterRender( torque_guard);
				
				RegisterRender( evil_visor);
				
				RegisterRender( metal_visor);
				RegisterRender( hetal_horn);
				
				RegisterRender( veno_visor);
				RegisterRender( veno_saber);
				
				RegisterRender( dest_visor);
				RegisterRender( dest_claws);
				
				RegisterRender( gazelle_visor);
				
				RegisterRender( gold_visor_big);
				RegisterRender( gold_visor);
				RegisterRender( gold_sabers);
				RegisterRender( gold_shield);
				
				RegisterRender( wing_slasher_big);
				RegisterRender( wing_slasher);
				RegisterRender( wing_shield);
				
				RegisterRender( dark_drag_visor);
				RegisterRender( drag_saber_ryuga);
				RegisterRender( ryuga_drag_claw);
				RegisterRender( ryuga_drag_shield);
				
				RegisterRender( bio_visor);
				
				RegisterRender( blanc_visor);
				
				RegisterRender( abyss_visor);
				RegisterRender( abyss_saber);
				RegisterRender( abyssmash);
				
				RegisterRender( slash_visor);
				RegisterRender( alternative_sword);
				
				RegisterRender( ryukihead);
				RegisterRender( ryukitroso);
				RegisterRender( ryukilegs);

				RegisterRender( v_buckle);
				RegisterRender( v_buckle_ryuki);
				RegisterRender( v_buckle_ryuki_survive);
				RegisterRender( v_buckle_knight);
				RegisterRender( v_buckle_knight_survive);
				RegisterRender( v_buckle_scissors);
				RegisterRender( v_buckle_zolda);
				RegisterRender( v_buckle_raia);
				RegisterRender( v_buckle_gai);
				RegisterRender( v_buckle_ouja);
				RegisterRender( v_buckle_tiger);
				RegisterRender( v_buckle_imperer);
				RegisterRender( v_buckle_odin);
				RegisterRender( v_buckle_femme);
				RegisterRender( v_buckle_verde);
				RegisterRender( v_buckle_abyss);
				RegisterRender( v_buckle_ryuga);
				RegisterRender( v_buckle_ryuga_survive);
				RegisterRender( alternativebelt);
				RegisterRender( alternativezerobelt);
				
				RegisterRender( contract_advent);
				RegisterRender( dragreder_advent);
				RegisterRender( darkwing_advent);
				RegisterRender( volcancer_advent);
				RegisterRender( magnugiga_advent);
				RegisterRender( evildiver_advent);
				RegisterRender( metalgelas_advent);
				RegisterRender( venosnaker_advent);
				RegisterRender( destwilder_advent);
				RegisterRender( gigazelle_advent);
				RegisterRender( biogreeza_advent);
				RegisterRender( blancwing_advent);
				RegisterRender( dragblacker_advent);
				RegisterRender( goldphoenix_advent);
				RegisterRender( abysslasher_advent);
				RegisterRender( psycorogue_advent);
				
				RegisterRender( survive_shippu_advent);
				RegisterRender( survive_mugen_advent);
				RegisterRender( survive_advent);
				
				RegisterRender( blank_sword_vent);
				RegisterRender( drag_saber_vent);
				RegisterRender( wing_lancer_vent);
				RegisterRender( veno_saber_vent);
				RegisterRender( wing_slasher_vent);
				RegisterRender( ryuga_drag_saber_vent);
				RegisterRender( gold_sabers_vent);
				RegisterRender( drag_visor_zwei_sword_mode_vent);
				RegisterRender( dark_blade_vent);
				RegisterRender( abyss_saber_vent);
				RegisterRender( alternative_sword_vent);
				
				RegisterRender(drag_claw_vent);
				RegisterRender(scissors_pincer_vent);
				RegisterRender(metal_horn_vent);
				RegisterRender(dest_claws_vent);
				RegisterRender(ryuga_drag_claw_vent);
				RegisterRender( abyssmash_vent);
				
				RegisterRender(drag_shield_vent);
				RegisterRender(shell_defense_vent);
				RegisterRender(giga_armor_vent);
				RegisterRender(wing_shield_vent);
				RegisterRender(ryuga_drag_shield_vent);
				RegisterRender(gold_shield_vent);
				
				//faiz
				RegisterRender(blank_mission_memory);
				RegisterRenderb(mission_memory_block);
				
				RegisterRender(faiz_edge);
				RegisterRender(faiz_blaster_gun);
				RegisterRender(faiz_blaster);
				RegisterRender(orga_stlanzer);
				RegisterRender(axel_ray_gun_gun);
				RegisterRender(axel_ray_gun);
				
				RegisterRender(kaixa_blaygun_gun);
				RegisterRender(kaixa_blaygun);
				RegisterRender(deltablaster);
				RegisterRender(psyga_tonfa_edge_big);
				RegisterRender(psyga_tonfa_edge);


				RegisterRender(faizhead);
				RegisterRender(faiztroso);
				RegisterRender(faizlegs);

				RegisterRender(faizdriver);
				RegisterRender(kaixadriver);
				RegisterRender(deltadriver);
				RegisterRender(psygadriver);
				RegisterRender(orgadriver);
				RegisterRender(smartbulke);


				RegisterRender(faiz_mission_memory);
				RegisterRender(faiz_axel_mission_memory);
				RegisterRender(faiz_blaster_mission_memory);
				
				RegisterRender(kaixa_mission_memory);
				RegisterRender(delta_mission_memory);
				RegisterRender(psyga_mission_memory);
				RegisterRender(orga_mission_memory);
				
				//blade
				RegisterRender( bladecard);
				RegisterRenderb( bladecard_block);
				
				RegisterRender( blayrouzer);
				RegisterRender( kingrouzer);
				RegisterRender( leanglerouzer_big);
				RegisterRender( leanglerouzer);
				RegisterRender( garrenrouzer);
				RegisterRender( chalice_arrow_big);
				RegisterRender( chalice_arrow);
				RegisterRender( wild_slasher);
				RegisterRender( wild_chalice_arrow_big);
				RegisterRender( wild_chalice_arrow);

				RegisterRender( bladehead);
				RegisterRender( bladetroso);
				RegisterRender( bladelegs);

				RegisterRender( bladedriver);
				RegisterRender( garrendriver);
				RegisterRender( leangle_belt);
				RegisterRender( chalicerouzer);
				RegisterRender( glaive_buckle);
				RegisterRender( larc_buckle);
				RegisterRender( lance_buckle);
				
				RegisterRender( rouze_absorber);
				RegisterRender( garren_absorber);
				
				RegisterRender( changebeetle);
				RegisterRender( change_stag);
				RegisterRender( change_spider);
				RegisterRender( change_mantis);
				RegisterRender( changekerberosglaive);
				RegisterRender( changekerberoslance);
				RegisterRender( changekerberoslarc);
				RegisterRender( fusion_eagle);
				RegisterRender( fusion_peacock);
				RegisterRender( absorb_capricorn);
				RegisterRender( absorb_serpent);
				RegisterRender( evolution_caucasus);
				RegisterRender( evolution_giraffa);
				RegisterRender( evolution_paradoxa);
				
				
				
				
				//hibiki
				RegisterRender( ongekibo_rekka);
				RegisterRender( unfinished_armed_saber);
				RegisterRender( armed_saber);
				RegisterRender(ongekibo_yamase);
				RegisterRender(ongekibo_rakurai);
				RegisterRender(ongekibo_shakubyoushi);
				RegisterRender(ongekibo_nachiguro);
				RegisterRender(ongekibo_rokushou);
				RegisterRender(ongekibo_gouriki);
				RegisterRender(ongekibo_ressui);		
				
				RegisterRender(ongekikan_reppuu);
				
				RegisterRender(ongeki_shingen_retsuzan);
				RegisterRender(ongekigen_enma);
				RegisterRender(ongekigen_retsurai);
				RegisterRender(ongekigen_togenkyo);
				
				RegisterRender(echo_sword_onsaken);
				RegisterRender(ongekikanabo_retto);
				RegisterRender(ongekisankaku_ressetsu);
				RegisterRender(ongeki_shincho_retsuban);
				
				RegisterRender( hibikihead);
				RegisterRender( hibikitroso);
				RegisterRender( hibikilegs);

				RegisterRender( hibikidriver);
				RegisterRender( ibukidriver);
				RegisterRender( kyosukedriver);
				RegisterRender( todorokidriver);
				RegisterRender( eikidriver);
				RegisterRender( zankidriver);
				RegisterRender( sabakidriver);
				RegisterRender( goukidriver);
				RegisterRender( tokidriver);
				RegisterRender( shoukidriver);
				RegisterRender( dankidriver);
				RegisterRender( shukidriver);
				RegisterRender( fubukidriver);
				RegisterRender( bankidriver);
				RegisterRender( amakidriver);
				RegisterRender( kabukidriver);
				RegisterRender( toukidriver);
				RegisterRender( nishikidriver);
				RegisterRender( habatakidriver);
				RegisterRender( kiramekidriver);

				RegisterRender( henshin_onsa);
				RegisterRender( henshin_onsa_kurenai);
				RegisterRender( henshin_onsa_danki);
				RegisterRender( henshin_onsa_eiki);
				RegisterRender( henshin_onsa_gouki);
				RegisterRender( henshin_onsa_kyoki);
				
				RegisterRender( henshin_onsa_kabuki);
				RegisterRender( henshin_onsa_habataki);
				RegisterRender( henshin_onsa_nishiki);
				RegisterRender( henshin_onsa_touki);
				RegisterRender( henshin_onsa_kirameki);
				
				RegisterRender( henshin_onibue_ibuki);
				RegisterRender( henshin_onibue_toki);
				RegisterRender( henshin_onibue_shouki);
				RegisterRender( henshin_onibue_amaki);
				RegisterRender( henshin_onibue_fubuki);
				
				RegisterRender( henshin_kigen_todoroki);
				RegisterRender( henshin_kigen_zanki);
				RegisterRender( henshin_kigen_shuki);
				RegisterRender( henshin_kigen_banki);
				RegisterRender( henshin_kigen_sabaki);
			
				//kabuto
				
				RegisterRender( kabuto_kunai_gun);
				RegisterRender( kabuto_kunai);
				RegisterRender( kabuto_kunai_kunai);
				RegisterRender( zect_mizer);
				RegisterRender( perfect_zecter);
				
				RegisterRender( drake_grip );
				RegisterRender(sasword_yaiver );
				
				RegisterRender( gatack_double_calibur);
				RegisterRender( gatack_double_calibur_twin);
				
				RegisterRender( zect_kunai_gun);
				RegisterRender( zect_kunai);
				RegisterRender( zect_kunai_kunai);
				
				RegisterRender( kabutohead);
				RegisterRender( kabutotroso);
				RegisterRender( kabutolegs);

				RegisterRender( kabuto_rider_belt_cast);
				RegisterRender( kabuto_rider_belt);
				
				RegisterRender( thebee_rider_belt_cast);
				RegisterRender( thebee_rider_belt);
				
				RegisterRender( drake_rider_belt_cast);
				RegisterRender( drake_rider_belt);

				RegisterRender( sasword_rider_belt_cast);
				RegisterRender( sasword_rider_belt);
				
				RegisterRender( gatack_rider_belt_cast);
				RegisterRender( gatack_rider_belt);
				
				RegisterRender( kickhopper_rider_belt_cast);
				RegisterRender( kickhopper_rider_belt);
				
				RegisterRender( puchhopper_rider_belt_cast);
				RegisterRender( puchhopper_rider_belt);
				
				RegisterRender( kabuto_zecter);
				RegisterRender( hyper_zecter);

				RegisterRender( thebee_zecter);
				RegisterRender( gatack_zecter);
				RegisterRender( drake_zecter);
				RegisterRender( sasword_zecter);
				RegisterRender(kickhopper_zecter);
				RegisterRender(punchhopper_zecter);
				
				RegisterRender( dark_kabuto_rider_belt_cast);
				RegisterRender( dark_kabuto_rider_belt);
				RegisterRender( dark_kabuto_zecter);
				
				RegisterRender( caucasus_rider_belt_cast);
				RegisterRender( caucasus_rider_belt);
				RegisterRender( caucasus_zecter);
				RegisterRender( hercus_rider_belt_cast);
				RegisterRender( hercus_rider_belt);
				RegisterRender( hercus_zecter);
				RegisterRender( ketaros_rider_belt_cast);
				RegisterRender( ketaros_rider_belt);
				RegisterRender( ketaros_zecter);
				
				RegisterRender( perfectthebee_zecter);
				RegisterRender( perfectsasword_zecter);
				RegisterRender( perfectdrake_zecter);
				
				RegisterRender( clock_up_pad);
				
				RegisterRender(den_denso);
				RegisterRender(den_denro);
				RegisterRender(den_denaxe);
				RegisterRender(den_dengu);
				RegisterRender(denkamen_sword);
				RegisterRender(den_denhijack);
				RegisterRender(den_denhandaxe);
				RegisterRender(momotaken);
				RegisterRender(uratazao);
				RegisterRender(den_denboomerang);
				RegisterRender(kintaono);
				RegisterRender(gden_denjutte);
				RegisterRender(gden_dengu);
				RegisterRender(macheteddy);
				
				RegisterRender(zerogasher_big);
				RegisterRender(zerogasher);

				RegisterRender(nega_den_gasher);
				RegisterRender(gaoh_gasher);
				RegisterRender(den_gasher_vega);

				RegisterRender(den_ohead);
				RegisterRender(den_otroso);
				RegisterRender(den_olegs);

				RegisterRender(den_odriver_bl);
				RegisterRender(den_odriverrod);
				RegisterRender(den_odriveraxe);
				RegisterRender(den_odrivergun);
				RegisterRender(den_odriverwing);
				RegisterRender(den_obeltclimax);
				
				RegisterRender(den_odriver);
				
				RegisterRender(zeronosbelt_p);
				RegisterRender(zeronosbelt_v);
				RegisterRender(zeronosbelt_z);
				
				RegisterRender(zeronosbelt);
				
				RegisterRender(rider_ticket_strike);
				RegisterRender(newden_obelt);
				RegisterRender(newden_obeltvega);
				RegisterRender(newden_obeltbl);
				
				RegisterRender(nega_den_odriver);
				RegisterRender(gaohbelt);
				RegisterRender(yuukibelt_skull);
				RegisterRender(yuukibelt_hijack);
				RegisterRender(gden_odriver);
				
				RegisterRender(den_oriderpass);
				RegisterRender(den_o_master_pass);
				RegisterRender(gden_oriderpass);

				RegisterRender(rider_ticket);
				RegisterRender(rider_ticket_sword);
				RegisterRender(rider_ticket_rod);
				RegisterRender(rider_ticket_ax);
				RegisterRender(rider_ticket_gun);
				RegisterRender(rider_ticket_wing);
				RegisterRender(rider_ticket_nega);
				RegisterRender(rider_ticket_yuuki);
				RegisterRender(rider_ticket_g);
				RegisterRender(rider_ticket_gaoh);
				RegisterRender(ktaros);
				
				RegisterRender(zeronos_plat_card);
				RegisterRender(zeronos_altair_card);
				RegisterRender(zeronos_vega_card);
				RegisterRender(zeronos_zero_card);
				
				RegisterRender( garulu_saber);
				RegisterRender( basshaamagnum);
				RegisterRender( dogga_hammer);
				RegisterRender( ixa_caliber_gun);
				RegisterRender( ixa_caliber);
				RegisterRender( ixariser);
				RegisterRender( jacorder_big);
				RegisterRender( jacorder);
				RegisterRender( zanbatsword_charge);
				RegisterRender( zanbatsword);
				RegisterRender( zanbatsword_core);

				RegisterRender( kivahead);
				RegisterRender( kivatroso);
				RegisterRender( kivalegs);

				RegisterRender(kivadriver_garulu);
				RegisterRender(kivadriver_basshaa);
				RegisterRender(kivadriver_dogga);
				RegisterRender(kivadriver_emperor);

				RegisterRender( kivadriver);
				RegisterRender( ixa_belt);
				RegisterRender( sagarc_belt);
				RegisterRender( darkkivadriver);
				RegisterRender( newkivadriver);
				
				RegisterRender( arcdriver);
				RegisterRender( reydriver);
				
				RegisterRender( wakeupfuestle);
				RegisterRender( garulufuestle);
				RegisterRender( basshaafuestle);
				RegisterRender( doggafuestle);
				
				RegisterRender( knucklefuestle);
				RegisterRender( risingfuestle);
				
				RegisterRender( sagafuestle);
				
				RegisterRender( keyfuestle);

				RegisterRender( tatsulot);
				
				RegisterRender( darkwakeupfuestle);
				RegisterRender( newwakeupfuestle);

	
				//decade
				RegisterRender( ride_booker_gun);
				RegisterRender( ride_booker);
				RegisterRender( diend_driver);
				
				RegisterRender( ongekibo_rekka_decade);
				RegisterRender( ongekibo_rekka_diend);

				RegisterRender( decadehead);
				RegisterRender( decadetroso);
				RegisterRender( decadelegs);

				RegisterRender( decadedriver);
				RegisterRender( dienddriver);
				RegisterRender( dark_decadedriver);
				
				RegisterRender( decadecard);
				RegisterRender( k_touch);
				RegisterRender( decadecard_violent_emotion);
				RegisterRender( kivacard);
				RegisterRender( den_ocard);
				RegisterRender( kabutocard);
				RegisterRender( hibikicard);
				RegisterRender( bladecard_de);
				RegisterRender( faizcard);
				RegisterRender( ryukicard);
				RegisterRender( agitocard);
				RegisterRender( kuugacard);
				
				RegisterRender( diendcard);
				RegisterRender( k_touch_diend);
				
				RegisterRender( darkdecadecard);
				
				RegisterRender( garulu_kivacard);
				RegisterRender( basshaa_kivacard);
				RegisterRender( dogga_kivacard);
			
				RegisterRender( rod_den_ocard);
				RegisterRender( axe_den_ocard);
				RegisterRender( gun_den_ocard);
				RegisterRender( wing_den_ocard);

				RegisterRender( axel_faizcard);
				
				RegisterRender( flame_agitocard);	
				RegisterRender( storm_agitocard);	
				
				RegisterRender( dragon_kuugacard);	
				RegisterRender( pegasus_kuugacard);	
				RegisterRender( titan_kuugacard);
				
				RegisterRender( emperor_kivacard);
				RegisterRender( liner_den_ocard);
				RegisterRender( hyper_kabutocard);
				RegisterRender( armed_hibikicard);
				RegisterRender( king_bladecard);
				RegisterRender( blaster_faizcard);
				RegisterRender( survive_ryukicard);
				RegisterRender( shining_agitocard);
				RegisterRender( ultimate_kuugacard);
				
				RegisterRender( g4card);
				RegisterRender( ryugacard);
				RegisterRender( orgacard);
				RegisterRender( glaivecard);
				RegisterRender( kabukicard);
				RegisterRender( caucasuscard);
				RegisterRender( arccard);
				RegisterRender( skullcard);
				
				//w
				RegisterRender(trigger_magnum);
				RegisterRender(metal_shaft_l);
				RegisterRender(metal_shaft);
				RegisterRender(prism_bicker_charge);
				RegisterRender(prism_bicker);
				RegisterRender(eternal_edge);
				RegisterRender(skull_magnum);
				RegisterRender(engine_blade);


				RegisterRender(Whead);
				RegisterRender(Wtroso);
				RegisterRender(Wlegs);

				RegisterRender(Wdriver);
				RegisterRender(lostdriver);
				RegisterRender(accel_driver);
				
				RegisterRender(wdriverj);
				RegisterRender(wdriverc);
				RegisterRender(wdriverh);
				RegisterRender(wdriverm);
				RegisterRender(wdriverl);
				RegisterRender(wdrivert);
				RegisterRender(wdriverf);
				RegisterRender(wdrivercc);
				RegisterRender(wdriverjj);
				RegisterRender(wdriverx);
				RegisterRender(wdriversh);
				RegisterRender(wdriverki);
				
				RegisterRender(accel_drivert);
				RegisterRender(accel_driverb);
				
				RegisterRender(lostdriverc);
				RegisterRender(lostdrivere);
				RegisterRender(lostdriverj);
				
				RegisterRender(cyclone_memory);
				RegisterRender(heat_memory);
				RegisterRender(luna_memory);
				RegisterRender(fang_memory);
				RegisterRender(joker_memory);
				RegisterRender(metal_memory);
				RegisterRender(trigger_memory);
				RegisterRender(xtreme_memory);
				RegisterRender(xtreme_gold_memory);
				RegisterRender(xtreme_accel_memory);
				RegisterRender(cyclonecyclone_memory);
				RegisterRender(jokerjoker_memory);
				RegisterRender(prism_memory);
				RegisterRender(engine_memory);

				RegisterRender(joker_t2_memory);
				RegisterRender(skull_memory);
				RegisterRender(eternal_memory);
				RegisterRender(eternal_t2_memory);


				RegisterRender(accel_memory);
				RegisterRender(trial_memory);
				RegisterRender(accel_booster_memory);
				
				RegisterRender(shippu_memory);
				RegisterRender(kirifuda_memory);

		//OOO		
		RegisterRender(medajalibur);
		RegisterRender(medajalibur_charge);
		
		RegisterRender(tajaspinner);
		RegisterRender(medagaburyu);
		RegisterRender(medagaburyu_gun);
		RegisterRender(birth_buster);
		RegisterRender(deepest_harpoon);

		RegisterRender(OOOhead);
		RegisterRender(OOOtroso);
		RegisterRender(OOOlegs);

		RegisterRender(OOOdriver);
		RegisterRender(birth_driver);
		RegisterRender(birth_driver_prototype);
		
		RegisterRender(poseidon_driver);
		RegisterRender(aqua_driver);
		
		RegisterRender(o_scanner);

		RegisterRender(taka);
		RegisterRender(kuwagata);
		RegisterRender(lion);
		RegisterRender(sai);
		RegisterRender(shachi);
		RegisterRender(ptera);
		RegisterRender(cobra);
		RegisterRender(super_taka);
		RegisterRender(same);
		RegisterRender(shika);
		RegisterRender(seiuchi);
		RegisterRender(mukade);
		RegisterRender(ebi_new);
		RegisterRender(love_core);
		RegisterRender(sasori);

		RegisterRender(tora);
		RegisterRender(kamakiri);
		RegisterRender(gorilla);
		RegisterRender(kujaku);
		RegisterRender(unagi);
		RegisterRender(tricera);
		RegisterRender(kame);
		RegisterRender(imagin);
		RegisterRender(panda);
		RegisterRender(super_tora);
		RegisterRender(kangaroo);
		RegisterRender(kujira);
		RegisterRender(gazelle);
		RegisterRender(shirokuma);
		RegisterRender(hachi);
		RegisterRender(kani_new);
		RegisterRender(love_core2);
		RegisterRender(kani);
		RegisterRender(yadokari);

		RegisterRender(batta);
		RegisterRender(cheetah);
		RegisterRender(zou);
		RegisterRender(condor);
		RegisterRender(tako);
		RegisterRender(tyranno);
		RegisterRender(wani);
		RegisterRender(shocker);
		RegisterRender(super_batta);
		RegisterRender(kangaroo2);
		RegisterRender(ookamiuo);
		RegisterRender(ushi);
		RegisterRender(penguin);
		RegisterRender(ari);
		RegisterRender(sasori_new);
		RegisterRender(love_core3);
		RegisterRender(ebi);
		
		RegisterRender(proto_birth_core);
		
		//Fourze
				RegisterRender(rocket);
				RegisterRender(billytherod);
				RegisterRender(hee_hackgun);
				RegisterRender(barizun_sword);
				RegisterRender(barizun_sword_charge);
				RegisterRender(meteor_nadeshiko_fusion_rocket);

				RegisterRender(Fourzehead);
				RegisterRender(Fourzetroso);
				RegisterRender(Fourzelegs);

				RegisterRender(Fourzedriver);
				RegisterRender(meteor_driver);
				RegisterRender(nadeshikodriver);

				RegisterRender(rocket_swich);
				RegisterRender(launcher_switch);
				RegisterRender(drill_switch);
				RegisterRender(radar_switch);
				RegisterRender(magic_hand_switch);
				RegisterRender(camera_switch);
				RegisterRender(parachute_switch);
				RegisterRender(chainsaw_switch);
				RegisterRender(hopping_switch);
				
				RegisterRender(elek_swich);
				RegisterRender(scissors_switch);
				RegisterRender(beat_switch);
				RegisterRender(chain_array_switch);
				RegisterRender(smoke_switch);
				RegisterRender(spike_switch);
				RegisterRender(winch_switch);
				RegisterRender(flash_switch);
				RegisterRender(shield_switch);
				RegisterRender(gatling_switch);
				
				RegisterRender(fire_swich);
				RegisterRender(stealth_switch);
				RegisterRender(hammer_switch);
				RegisterRender(water_switch);
				RegisterRender(medical_switch);
				RegisterRender(pen_switch);
				RegisterRender(wheel_switch);
				RegisterRender(screw_switch);
				RegisterRender(hand_switch);
				RegisterRender(schop_switch);
				
				RegisterRender(magnet_swich_n);
				RegisterRender(magnet_swich_s);
				RegisterRender(freeze_switch);
				RegisterRender(claw_switch);
				RegisterRender(board_switch);
				RegisterRender(giantfoot_switch);
				RegisterRender(aero_switch);
				RegisterRender(gyro_switch);
				RegisterRender(net_switch);
				RegisterRender(stamper_switch);
				
				RegisterRender(cosmic_swich);
				
				RegisterRender(super_rocket_swich);
				RegisterRender(super_drill_swich);
				
				RegisterRender(clear_drill_swich);
				RegisterRender(fusion_swich);

				RegisterRender(meteor_swich);
				RegisterRender(meteor_storm_swich);
				RegisterRender(nadeshiko_switch);
				
				RegisterRender(solu_switch);
				RegisterRender(gate_switch);
				RegisterRender(core_switch);
				
				//wizard
				RegisterRender(wizarswordgun_gun);
				RegisterRender(axcalibur_charge);
				RegisterRender(wizarswordgun_mage_gun);
			
				RegisterRender(wizarswordgun);
				RegisterRender(axcalibur);
				RegisterRender(dice_saber);
				RegisterRender(mirage_magnum);
				RegisterRender(wizarswordgun_mage);
				RegisterRender(hammelcane);
				RegisterRender(dis_halberd);

				RegisterRender(wizardhead);
				RegisterRender(wizardtroso);
				RegisterRender(wizardlegs);

				RegisterRender(wizardriver);
				RegisterRender(beastdriver);
				RegisterRender(whitewizardriver);
				RegisterRender(magewizardriver);
				RegisterRender(magewizardriver_b);
				RegisterRender(magewizardriver_g);
				RegisterRender(sorcererdriver);
				RegisterRender(darkwizardriver);
				RegisterRender(blackwizardriver);
				RegisterRender(whitewizardriverf);
				
				RegisterRender(flame_ring);
				RegisterRender(water_ring);
				RegisterRender(hurricane_ring);
				RegisterRender(land_ring);
				RegisterRender(flame_ring_dragon);
				RegisterRender(water_ring_dragon);
				RegisterRender(hurricane_ring_dragon);
				RegisterRender(land_ring_dragon);
				RegisterRender(infinity_ring);

				RegisterRender(drago_timer);
				RegisterRender(special_ring);
				RegisterRender(finish_strike_ring);
				RegisterRender(hope_ring);
				RegisterRender(special_rush_ring);

				RegisterRender(beast_ring);
				RegisterRender(falco_ring);
				RegisterRender(chameleo_ring);
				RegisterRender(buffa_ring);
				RegisterRender(dolphi_ring);
				RegisterRender(hyper_ring);

				RegisterRender(wiseman_ring);
				RegisterRender(mage_o_ring);
				RegisterRender(mage_b_ring);
				RegisterRender(mage_g_ring);
				RegisterRender(sorcerer_ring);
				RegisterRender(black_ring);
				RegisterRender(dark_ring);

				RegisterRender(light_ring);
				RegisterRender(excite_ring);
				RegisterRender(defend_ring);
				RegisterRender(thunder_ring);
				RegisterRender(explosion_ring);
				RegisterRender(sleep_ring);
				RegisterRender(bind_ring);
				RegisterRender(kick_strike_ring);
				RegisterRender(eclipse_ring);

				RegisterRender(fall_ring);

				RegisterRender(teleport_ring);
				RegisterRender(connect_ring);
				RegisterRender(liquid_ring);
				
				RegisterRender(engage_ring);
				RegisterRender(please_ring);
				RegisterRender(small_ring);
				RegisterRender(big_ring);
				
				RegisterRender(copy_ring);
				RegisterRender(drill_ring);
				RegisterRender(smell_ring);
				RegisterRender(extend_ring);
				RegisterRender(merry_christmas_ring);
				RegisterRender(dress_up_ring);
				RegisterRender(blizzard_ring);
				RegisterRender(gravity_ring);
				RegisterRender(time_ring);
				RegisterRender(miracle_ring);
				RegisterRender(flower_ring);
				RegisterRender(dance_ring);
				
				RegisterRender(musou_saber);
				RegisterRender(musou_saber_naginata);
				RegisterRender(blood_musou_saber_naginata);
				RegisterRender(musou_saber_kusarigama);
				RegisterRender(dj_gun);
				RegisterRender(dj_gun_taiken_mode_big);
				RegisterRender(dj_gun_taiken_mode);
				
				RegisterRender(kagematsu_l);
				RegisterRender(kagematsu);
				RegisterRender(donkachi);
				RegisterRender(melon_defender);
				RegisterRender(pine_iron);
				RegisterRender(ichigo_kunai);
				RegisterRender(daidaimaru);
				RegisterRender(banana_spear);
				RegisterRender(budou_ryuhou);
				RegisterRender(mango_punisher);
				RegisterRender(duri_noko);
				RegisterRender(kiwi_gekirin);
				RegisterRender(suika_sojinto_big);
				RegisterRender(suika_sojinto);
				RegisterRender(suika_sojinto_baron_ver_big);
				RegisterRender(suika_sojinto_baron_ver);

				RegisterRender(sonic_arrow);
				RegisterRender(kagematsu_shin_l);
				RegisterRender(kagematsu_shin);

				RegisterRender(blood_daidaimaru);
				RegisterRender(yomimaru);
				RegisterRender(sword_bringer);
				RegisterRender(apple_reflecter);
				RegisterRender(souginjou_l);
				RegisterRender(souginjou);
				RegisterRender(dark_daidaimaru);
				RegisterRender(watermelon_defender);
				RegisterRender(savior_arrow);
				
				RegisterRender(kabi_daidaimaru);
				RegisterRender(maja_yomimaru);

				RegisterRender(Gaimhead);
				RegisterRender(Gaimtroso);
				RegisterRender(Gaimlegs);

				
				RegisterRender(sengoku_driver_gaim);
				RegisterRender(sengoku_driver_baron);
				RegisterRender(sengoku_driver_ryugen);
				RegisterRender(sengoku_driver_zangetsu);
				RegisterRender(sengoku_driver_gridon);
				RegisterRender(sengoku_driver_kurokage);
				RegisterRender(sengoku_driver_barvo);
				RegisterRender(sengoku_driver_knuckle);
				RegisterRender(sengoku_driver_bujin_gaim);
				RegisterRender(sengoku_driver_fifteen);
				RegisterRender(sengoku_driver_mars);
				RegisterRender(sengoku_driver_kamuro);
				RegisterRender(sengoku_driver_jam);
				RegisterRender(sengoku_driver_kurokage_troopers);
				RegisterRender(sengoku_driver_idunn);
				RegisterRender(sengoku_driver_duke);
				RegisterRender(sengoku_driver_savior);
				RegisterRender(sengoku_driver_baron_black);
				RegisterRender(sengoku_driver_ryugen_yomi);
				RegisterRender(sengoku_driver_zangetsu_watermelon);
				RegisterRender(sengoku_driver_maja);
				RegisterRender(sengoku_driver_gaim_natsumikan);
				
				RegisterRender(genesis_driver_zangetsu_shin);
				RegisterRender(genesis_driver_duke);
				RegisterRender(genesis_driver_sigurd);
				RegisterRender(genesis_driver_marika);
				RegisterRender(genesis_driver_baron);
				RegisterRender(genesis_driver_kurokage_shin);
				RegisterRender(genesis_driver_tyrant);

				RegisterRender(sengoku_driver_matsubokkuri);
				RegisterRender(sengoku_driver_kurumi);
				RegisterRender(sengoku_driver_donguri);
				RegisterRender(sengoku_driver_melon);
				RegisterRender(sengoku_driver_pine);
				RegisterRender(sengoku_driver_ichigo);
				RegisterRender(sengoku_driver_orange);
				RegisterRender(sengoku_driver_banana);
				RegisterRender(sengoku_driver_budou);
				RegisterRender(sengoku_driver_suika);
				RegisterRender(sengoku_driver_mango);
				RegisterRender(sengoku_driver_durian);
				RegisterRender(sengoku_driver_kiwi);
				RegisterRender(sengoku_driver_lemon);
				
				RegisterRender(sengoku_driver_lemon_energy);
				RegisterRender(sengoku_driver_cherry_energy);
				RegisterRender(sengoku_driver_peach_energy);
				RegisterRender(sengoku_driver_melon_energy);
				RegisterRender(sengoku_driver_jinba_lemon);
				RegisterRender(sengoku_driver_jinba_cherry);
				RegisterRender(sengoku_driver_jinba_peach);
				RegisterRender(sengoku_driver_jinba_melon);
				RegisterRender(sengoku_driver_matsubokkuri_energy);
				RegisterRender(sengoku_driver_dragon_fruits_energy);
				RegisterRender(sengoku_driver_jinba_marron);
				RegisterRender(sengoku_driver_jinba_dragon);
				RegisterRender(sengoku_driver_jinba_melon_melon);
				RegisterRender(sengoku_driver_jinba_melon_durian);

				RegisterRender(sengoku_driver_kachidoki);
				RegisterRender(sengoku_driver_kiwami);
				RegisterRender(sengoku_driver_yomotsu_heguri);

				RegisterRender(sengoku_driver_blood_orange);
				RegisterRender(sengoku_driver_fifteen_lock);
				RegisterRender(sengoku_driver_golden_ringo);
				RegisterRender(sengoku_driver_silver_ringo);
				RegisterRender(sengoku_driver_black_ringo);
				RegisterRender(sengoku_driver_watermelon);
				RegisterRender(sengoku_driver_forbidden_ringo);
				RegisterRender(sengoku_driver_blood_zakuro);

				RegisterRender(sengoku_driver_jinba_black);
				
				RegisterRender(sengoku_driver_orange_fr);
				
				RegisterRender(sengoku_driver_natsumikan);

				RegisterRender(sengoku_driver_drive);
				RegisterRender(sengoku_driver_wizard);
				RegisterRender(sengoku_driver_fourze);
				RegisterRender(sengoku_driver_ooo);
				RegisterRender(sengoku_driver_w);
				RegisterRender(sengoku_driver_decade);
				RegisterRender(sengoku_driver_rider_ichigo);

				RegisterRender(matsubokkuri_lockseed);
				RegisterRender(kurumi_lockseed);
				RegisterRender(donguri_lockseed);
				RegisterRender(melon_lockseed);
				RegisterRender(pine_lockseed);
				RegisterRender(ichigo_lockseed);
				RegisterRender(orange_lockseed);
				RegisterRender(banana_lockseed);
				RegisterRender(budou_lockseed);
				RegisterRender(suika_lockseed);
				RegisterRender(mango_lockseed);
				RegisterRender(durian_lockseed);
				RegisterRender(kiwi_lockseed);
				RegisterRender(lemon_lockseed);
				
				RegisterRender(sakura_hurricane);
				RegisterRender(rose_attacker);
				RegisterRender(dandeliner);
				RegisterRender(tulip_hopper);
				
				RegisterRender(lemon_energy_lockseed);
				RegisterRender(cherry_energy_lockseed);
				RegisterRender(peach_energy_lockseed);
				RegisterRender(melon_energy_lockseed);
				RegisterRender(matsubokkuri_energy_lockseed);
				RegisterRender(dragon_fruits_energy_lockseed);
				RegisterRender(marron_energy_lockseed);

				RegisterRender(kachidoki_lockseed);
				RegisterRender(kiwami_lockseed);
				RegisterRender(yomotsu_heguri_lockseed);

				RegisterRender(blood_orange_lockseed);
				RegisterRender(fifteen_lockseed);
				RegisterRender(golden_ringo_lockseed);
				RegisterRender(silver_ringo_lockseed);
				RegisterRender(black_ringo_lockseed);
				RegisterRender(watermelon_lockseed);
				RegisterRender(forbidden_ringo_lockseed);
				RegisterRender(zakuro_lockseed);

				RegisterRender(dark_orange_lockseed);
				RegisterRender(dark_lemon_energy_lockseed);
				
				RegisterRender(fresh_orange_lockseed);
				RegisterRender(fresh_pine_lockseed);
				RegisterRender(natsumikan_lockseed);

				RegisterRender(roulette_lockseed);
				RegisterRender(christmas_lockseed);
				
				RegisterRender(black_baron_lockseed);
				RegisterRender(sengoku_driver_black_baron);
				
				RegisterRender(drive_lockseed);
				RegisterRender(wizard_lockseed);
				RegisterRender(fourze_lockseed);
				RegisterRender(ooo_lockseed);
				RegisterRender(w_lockseed);
				RegisterRender(decade_lockseed);
				RegisterRender(rider_ichigo_lockseed);
				
				RegisterRender(sengoku_driver_gaim_lock);
				RegisterRender(sengoku_driver_kiva);
				RegisterRender(sengoku_driver_den_o);
				RegisterRender(sengoku_driver_kaubuto);
				RegisterRender(sengoku_driver_hibiki);
				RegisterRender(sengoku_driver_blade);
				RegisterRender(sengoku_driver_faiz);
				RegisterRender(sengoku_driver_ryuki);
				RegisterRender(sengoku_driver_agito);
				RegisterRender(sengoku_driver_kuuga);
				
				RegisterRender(gaim_lockseed);
				RegisterRender(kiva_lockseed);
				RegisterRender(den_o_lockseed);
				RegisterRender(kaubuto_lockseed);
				RegisterRender(hibiki_lockseed);
				RegisterRender(blade_lockseed);
				RegisterRender(faiz_lockseed);
				RegisterRender(ryuki_lockseed);
				RegisterRender(agito_lockseed);
				RegisterRender(kuuga_lockseed);
				
				RegisterRender(sengoku_driver_kabi_orange);
				RegisterRender(kabi_orange_lockseed);
				
				RegisterRender(sengoku_driver_maja_lock);
				RegisterRender(maja_lockseed);
				
				RegisterRender(sid_lockseed);
				
				RegisterRender(fake_donguri_lockseed);
				
				RegisterRender(handle_sword );
				RegisterRender(door_ju);
				RegisterRender(trailer_hou);
				RegisterRender(zenrin_shooter);
				RegisterRender(break_gunner);
				RegisterRender(break_gunner_2);
				RegisterRender(shingouax);
				RegisterRender(lupin_gunner);
				RegisterRender(blade_gunner);
				
				RegisterRender(drivehead);
				RegisterRender(drivetroso);
				RegisterRender(drivelegs);
				RegisterRender(drivedriver);
				
				RegisterRender(mach_driver_honoh);
				RegisterRender(drivedrivergold);
				RegisterRender(metro_pd_driver_honoh);
				RegisterRender(lupin_belt);
				
				RegisterRender(speedshift);
				RegisterRender(wildshift);
				RegisterRender(techniqueshift);
				RegisterRender(dead_heat);
				RegisterRender(formulashift);
				RegisterRender(tridoronshift);
				
				RegisterRender(proto_speedshift);
				RegisterRender(fruitsshift);
				RegisterRender(highspeedshift);
				RegisterRender(shift_next);
				RegisterRender(shift_special);
				RegisterRender(heartronshift);
				RegisterRender(speedwildtechnicshift);
				
				RegisterRender(maxflare);
				RegisterRender(funkyspike);
				RegisterRender(midnightshadow);
				RegisterRender(justice_hunter);
				RegisterRender(dream_vegas);
				RegisterRender(dimension_cab);
				RegisterRender(massive_monster);
				RegisterRender(spin_mixer);
				RegisterRender(rumble_dump);
				RegisterRender(mad_doctor);
				RegisterRender(hooking_wrecker);
				RegisterRender(fire_braver);
				RegisterRender(rolling_gravity);
				RegisterRender(road_winter);
				
				RegisterRender(mantarn_f01);
				RegisterRender(jacky_f02);
				RegisterRender(sparner_f03);
				
				RegisterRender(mega_maxflare);
				
				RegisterRender(signal_mach);
				RegisterRender(signal_magarl);
				RegisterRender(signal_kaksarn);
				RegisterRender(signal_tomarle);
				RegisterRender(signal_kikern);
				RegisterRender(signal_chaser);
				RegisterRender(shift_ride_crosser);
				
				RegisterRender(tridoron_key);
				
				RegisterRender(rhino_super);
				
				RegisterRender(burning_solar);
				RegisterRender(colorful_commercial);
				RegisterRender(deco_traveller);
				RegisterRender(amazing_circus);
				
				RegisterRender(next_hunter);
				RegisterRender(next_builder);
				RegisterRender(next_traveller);
				RegisterRender(tokujoka_key);
				

				RegisterRender(gan_gun_saber_blade);
				RegisterRender(gan_gun_saber_nitouryu);
				RegisterRender(gan_gun_saber_nitouryu_2);
				RegisterRender(gan_gun_saber_gun);
				RegisterRender(gan_gun_saber_naginata);
				RegisterRender(gan_gun_saber_condor_denwor);
				RegisterRender(gan_gun_saber_rifle);
				RegisterRender(gan_gun_saber_hammer);
				RegisterRender(sunglasseslasher_sword);
				RegisterRender(sunglasseslasher_gun);
				RegisterRender(gan_gun_hand_rod);
				RegisterRender(gan_gun_hand_gun);
				RegisterRender(gan_gun_hand_kama);
				RegisterRender(deep_slasher_sword);
				RegisterRender(deep_slasher_blaster);
				RegisterRender(gan_gun_catcher_rod);
				RegisterRender(gan_gun_catcher_gun);
				
				RegisterRender(ghosthead);
				RegisterRender(ghosttroso);
				RegisterRender(ghostlegs);
				RegisterRender(ghostdriver);
				RegisterRender(specterdriver);
				RegisterRender(mega_ulorder);
				
				RegisterRender(unfinished_eyecon_driver_g);
				RegisterRender(eyecon_driver_g);
				
				RegisterRender(dark_ghostdriver);
				RegisterRender(zero_specterdriver);
				RegisterRender(proto_mega_ulorder_r);
				RegisterRender(proto_mega_ulorder_b);
				RegisterRender(proto_mega_ulorder_y);
				RegisterRender(proto_mega_ulorder_p);

				RegisterRender(extremer_driver);
				
				RegisterRender(ore_ghost_icon);
				RegisterRender(toucon_boost_icon);
				RegisterRender(mugen_icon);
				RegisterRender(specter_ghost_icon);
				RegisterRender(deep_specter_ghost_icon);
				RegisterRender(sin_specter_icon);
				RegisterRender(necrom_ghost_icon);
				RegisterRender(yujou_burst_icon);
				
				RegisterRender(dark_ghost_icon);
				RegisterRender(zero_specter_ghost_icon);
				RegisterRender(dark_necrom_red_ghost_icon);
				RegisterRender(dark_necrom_blue_ghost_icon);
				RegisterRender(dark_necrom_yellow_ghost_icon);
				RegisterRender(dark_necrom_pink_ghost_icon);
				
				RegisterRender(edison_ghost_icon);
				RegisterRender(newton_ghost_icon);
				RegisterRender(musashi_ghost_icon);
				RegisterRender(robin_ghost_icon );
				RegisterRender(billy_the_kid_icon);
				RegisterRender(beethoven_icon);
				RegisterRender(benkei_icon);
				RegisterRender(goemon_icon);
				RegisterRender(ryoma_icon);
				RegisterRender(himiko_ghost_icon);
				
				RegisterRender(tutankhamun_icon);
				RegisterRender(nobunaga_icon);
				RegisterRender(houdini_icon);
				
				RegisterRender(grimm_icon);
				RegisterRender(sanzo_icon);
				
				RegisterRender(napoleon_icon);
				RegisterRender(darwin_icon);
				RegisterRender(ikkyu_icon);
				RegisterRender(pythagoras_icon);
				
				RegisterRender(santa_icon);
				RegisterRender(kamehameha_icon);
				RegisterRender(special_ore_icon);
				RegisterRender(ore_specter_ghost_icon);
				RegisterRender(ishinomori_ghost_icon);
				
				RegisterRender(columbus_icon);
				RegisterRender(shakespeare_icon);
				RegisterRender(nightingale_icon);
				RegisterRender(galileo_icon);
				RegisterRender(da_vinci_ghost_icon);
				
				RegisterRender(tenkatoitsu_icon);
				RegisterRender(shinsengumi_icon);
				
				RegisterRender(showa_ghost_icon);
				RegisterRender(kuuga_ghost_icon);
				RegisterRender(agito_ghost_icon);
				RegisterRender(ryuki_ghost_icon);
				RegisterRender(faiz_ghost_icon);
				RegisterRender(blade_ghost_icon);
				RegisterRender(hibiki_ghost_icon);
				RegisterRender(kabuto_ghost_icon);
				RegisterRender(den_o_ghost_icon);
				RegisterRender(kiva_ghost_icon);
				RegisterRender(decade_ghost_icon);
				RegisterRender(double_ghost_icon);
				RegisterRender(ooo_ghost_icon);
				RegisterRender(fourze_ghost_icon);
				RegisterRender(wizard_ghost_icon);
				RegisterRender(gaim_ghost_icon);
				RegisterRender(drive_ghost_icon);
				RegisterRender(ghost_ghost_icon);
				RegisterRender(ex_aid_ghost_icon);
				
				RegisterRender(unfinished_fourtyfive_heisei_ghost_icon);
				RegisterRender(fourtyfive_heisei_ghost_icon);
				RegisterRender(fourtyfive_showa_ghost_icon);
				
				RegisterRender(royalty_gamma_icon);
				RegisterRender(transform_gamma_icon);
				RegisterRender(knife_gamma_icon);
				
				RegisterRender(yurusen_gamma_icon);
				RegisterRender(sister_gamma_icon);
				
				
				
				RegisterRender(gashacon_breaker);
				RegisterRender(gashacon_breaker_ham);
				RegisterRender(gashacon_sword);
				RegisterRender(gashacon_sword_ice);
				RegisterRender(gashacon_magnum_gun);
				RegisterRender(gashacon_sparrow_sickle_a);
				RegisterRender(gashacon_sparrow_sickle_b);
				RegisterRender(gashacon_sparrow_arrow);
				RegisterRender(gashacon_bugvisor);
				RegisterRender(gashacon_bugvisor_gun);
				RegisterRender(gashacon_bugvisor_ii);
				RegisterRender(gashacon_bugvisor_ii_gun);
				
				RegisterRender(gashacon_key_slasher);
				RegisterRender(parabragun_axe);
				RegisterRender(parabragun_gun);
				
				RegisterRender(ride_weapon_gun);
				RegisterRender(ride_weapon);
				RegisterRender(true_brave_sword);
				RegisterRender(fuuma_sword);
				
				RegisterRender(bugster_trident);
				RegisterRender(bugster_trident_big);
				
				RegisterRender(deus_rusher);
				RegisterRender(deus_rusher_red);

				RegisterRender(ex_aidhead);
				RegisterRender(ex_aidtroso);
				RegisterRender(ex_aidlegs);
				RegisterRender(gamer_driver_ex_aid);
				RegisterRender(gamer_driver_brave);
				RegisterRender(gamer_driver_snipe);
				RegisterRender(gamer_driver_lazer);
				RegisterRender(gamer_driver_genmu);
				RegisterRender(gamer_driver_paradox);
				RegisterRender(gamer_driver_truebrave);
				RegisterRender(gamer_driver_fuuma);
				RegisterRender(gamer_driver_proto_brave);
				RegisterRender(gamer_driver_proto_snipe);
				RegisterRender(gamer_driver_lazer_turbo);
				RegisterRender(gamer_driver_chronos);
				RegisterRender(gamer_driver_anotherparadox);
				RegisterRender(gamer_driver_gamedeus_muteki);
				RegisterRender(gamer_driver_nico_snipe);
				
				RegisterRender(gashacon_bugvisor_genmu);
				RegisterRender(gashacon_bugvisor_ii_poppy);
				RegisterRender(gashacon_bugvisor_ii_chronos);
				RegisterRender(gashacon_bugvisor_ii_chronos_gemdeus);
				RegisterRender(gashacon_bugvisor_ii_lazer);
				RegisterRender(gashacon_bugvisor_ii_chronicle_bugster);
				RegisterRender(paradoxbelt);
				RegisterRender(rideplayerbelt);
				RegisterRender(rideplayerbelt_nico);
				RegisterRender(ninjaplayerbelt);
				
				RegisterRender(mighty_action_x_gashat);
				RegisterRender(taddle_quest_gashat);
				RegisterRender(bang_bang_shooting_gashat);
				RegisterRender(bakusou_bike_gashat);
				RegisterRender(proto_mighty_action_x_gashat);
				RegisterRender(proto_taddle_quest_gashat);
				RegisterRender(proto_bang_bang_shooting_gashat);
				RegisterRender(proto_bakusou_bike_gashat);
				RegisterRender(proto_mighty_action_x_gashat_origin);
				RegisterRender(dangerous_zombie_gashat);
				RegisterRender(kamen_rider_chronicle_gashat);
				RegisterRender(toki_meki_crisis_gashat);
				
				RegisterRender(mighty_brothers_xx_gashat);
				RegisterRender(maximum_mighty_x_gashat);
				RegisterRender(hyper_muteki_gashat);
				RegisterRender(mighty_creator_vrx_gashat);
				RegisterRender(knock_out_fighter_2_gashat);
				RegisterRender(god_maximum_mighty_x_gashat);
				
				RegisterRender(gamedeus_hyper_muteki_gashat);

				RegisterRender(doctor_mighty_xx_gashat);
				
				RegisterRender(kaigan_ghost_gashat);
				RegisterRender(full_throttle_drive_gashat);
				RegisterRender(toukenden_gaim_gashat);
				RegisterRender(magic_the_wizard_gashat);
				RegisterRender(space_galaxy_fourze_gashat);
				RegisterRender(jungle_ooo_gashat);
				RegisterRender(detective_double_gashat);
				RegisterRender(barcode_warrior_decade_gashat);
				RegisterRender(dokidoki_makai_castle_kiva_gashat);
				RegisterRender(time_express_den_o_gashat);
				RegisterRender(insect_wars_kabuto_gashat);
				RegisterRender(taiko_master_hibik_gashat);
				RegisterRender(king_of_poker_blade_gashat);
				RegisterRender(moshi_moshi_faiz_gashat);
				RegisterRender(mirror_labryinth_ryuki_gashat);
				RegisterRender(agito_of_the_sun_gashat);
				RegisterRender(adventure_guy_kuuga_gashat);
				RegisterRender(lets_go_ichigou_gashat);

				RegisterRender(kamen_rider_build_gashat);
				
				RegisterRender(gekitotsu_robots_gashat);
				RegisterRender(proto_gekitotsu_robots_gashat);
				
				RegisterRender(doremifa_beat_gashat);
				RegisterRender(proto_doremifa_beat_gashat);
				
				RegisterRender(jet_combat_gashat);
				RegisterRender(proto_jet_combat_gashat);
				
				RegisterRender(giri_giri_chambara_gashat);
				RegisterRender(proto_giri_giri_chambara_gashat);
				
				RegisterRender(shakariki_sports_gashat);
				RegisterRender(proto_shakariki_sports_gashat);
				
				RegisterRender(drago_knight_hunter_z_gashat);
				RegisterRender(proto_drago_knight_hunter_z_gashat);
				
				RegisterRender(ju_ju_burger_gashat);
				RegisterRender(night_of_safari_gashat);
				
				RegisterRender(taddle_fantasy_gashat);
				RegisterRender(bang_bang_simulation_gashat);

				RegisterRender(bang_bang_tank_gashat);
				
				RegisterRender(perfect_puzzle_gashat);
				RegisterRender(knock_out_fighter_gashat);
				
				RegisterRender(taddle_legacy_gashat);
				RegisterRender(hurricane_ninja_gashat);
				RegisterRender(gashat_gear_dual_another);
				
				
				RegisterRender(proto_bakusou_bike_combi_fukkatsu_gashat);
				
				RegisterRender(pac_adventure_gashat);
				RegisterRender(xevious_gashat);
				RegisterRender(famitsa_gashat);
				RegisterRender(galaxian_gashat);
				RegisterRender(taiko_no_tatsujin_gashat);
				RegisterRender(gabarizing_gashat);
				
				RegisterRender(smash_bottle);
				
				RegisterRender(drill_crusher_gun);
				RegisterRender(drill_crusher);
				RegisterRender(hawk_gatlinger);
				RegisterRender(koma_ninpoutou);
				RegisterRender(kaizoku_hassha);
				RegisterRender(twinbreaker);
				RegisterRender(twinbreaker_sword);
				RegisterRender(beat_crosser);
				RegisterRender(full_bottle_buster_gun);
				RegisterRender(full_bottle_buster);
				RegisterRender(magma_knuckle);
				RegisterRender(blizzard_knuckle);
				
				RegisterRender(buildhead);
				RegisterRender(buildtroso);
				RegisterRender(buildlegs);
				
				RegisterRender(build_driver);
				RegisterRender(build_driver_cross_z);
				RegisterRender(build_driver_grease);
				RegisterRender(build_driver_rogue);
				RegisterRender(build_driver_blood);
				RegisterRender(build_driver_killbas);
				
				RegisterRender(sclash_driver_grease);
				RegisterRender(sclash_driver_cross_z_charge);
				RegisterRender(sclash_driver_rogue);
				
				RegisterRender(evol_driver_evol);
				RegisterRender(evol_driver_mad_rogue);
				
				RegisterRender(transteamgun);
				RegisterRender(transteamgun_2);
				RegisterRender(transteamgun_rifle);
				
				RegisterRender(steam_blade);
				
				RegisterRender(nebulasteamgun);
				RegisterRender(nebulasteamgun_2);
				RegisterRender(nebulasteamgun_rifle);
				
				RegisterRender(rabbit_full_bottle);
				RegisterRender(gorilla_full_bottle);
				RegisterRender(taka_full_bottle);
				RegisterRender(harinezumi_full_bottle);
				RegisterRender(ninjya_full_bottle);
				RegisterRender(panda_full_bottle);
				RegisterRender(lion_full_bottle);
				RegisterRender(dragon_full_bottle);
				RegisterRender(kaizoku_full_bottle);
				RegisterRender(octopus_full_bottle);
				RegisterRender(phoenix_full_bottle);
				RegisterRender(rose_full_bottle);
				RegisterRender(tora_full_bottle);
				RegisterRender(kujira_full_bottle);
				RegisterRender(kirin_full_bottle);
				RegisterRender(unicorn_full_bottle);
				RegisterRender(turtle_full_bottle);
				RegisterRender(deer_full_bottle);
				RegisterRender(penguin_full_bottle);
				RegisterRender(spider_full_bottle);
				RegisterRender(rabbit_gold_full_bottle);
				RegisterRender(bat_full_bottle_2);
				RegisterRender(same_full_bottle);
				RegisterRender(hachi_full_bottle);
				RegisterRender(sai_full_bottle);
				RegisterRender(scorpion_full_bottle);
				
				RegisterRender(dog_full_bottle);
				RegisterRender(santa_full_bottle);
				RegisterRender(kuma_full_bottle);
				RegisterRender(wolf_full_bottle);
				RegisterRender(beetle_full_bottle);
				
				RegisterRender(doctor_full_bottle);
				RegisterRender(orange_full_bottle);
				RegisterRender(mahoutskai_full_bottle);
				RegisterRender(tantei_full_bottle);
				RegisterRender(momotaros_full_bottle);
				RegisterRender(yujou_full_bottle);
				RegisterRender(obake_full_bottle);
				RegisterRender(card_full_bottle);
				
				RegisterRender(tank_full_bottle);
				RegisterRender(diamond_full_bottle);
				RegisterRender(gatling_full_bottle);
				RegisterRender(soujiki_full_bottle);
				RegisterRender(comic_full_bottle);
				RegisterRender(rocket_full_bottle);
				RegisterRender(shoubousha_full_bottle);
				RegisterRender(lock_full_bottle);
				RegisterRender(ressha_full_bottle);
				RegisterRender(light_full_bottle);
				RegisterRender(robo_full_bottle);
				RegisterRender(helicopter_full_bottle);
				RegisterRender(ufo_full_bottle);
				RegisterRender(jet_full_bottle);
				RegisterRender(cyclone_full_bottle);
				RegisterRender(eraser_full_bottle);
				RegisterRender(watch_full_bottle);
				RegisterRender(pyramid_full_bottle);
				RegisterRender(skateboard_full_bottle);
				RegisterRender(fridge_full_bottle);
				RegisterRender(dragon_silver_full_bottle);
				RegisterRender(engine_full_bottle);
				RegisterRender(bike_full_bottle);
				RegisterRender(magnet_full_bottle);
				RegisterRender(submarine_full_bottle);
				RegisterRender(dryer_full_bottle);
				RegisterRender(gold_full_bottle);
				
				RegisterRender(mic_full_bottle);
				RegisterRender(cake_full_bottle);
				RegisterRender(televi_full_bottle);
				RegisterRender(smartphone_full_bottle);
				RegisterRender(camera_full_bottle);
				
				RegisterRender(game_full_bottle);
				RegisterRender(medal_full_bottle);
				RegisterRender(usb_memory_full_bottle);
				RegisterRender(parka_full_bottle);
				RegisterRender(low_rabbit_full_bottle);
				
				RegisterRender(rabbittank_sparkling_full_bottle);
				RegisterRender(hazard_trigger);
				RegisterRender(fullfull_bottle_rabbit);
				RegisterRender(fullfull_bottle_tank);
				RegisterRender(genius_full_bottle);
				RegisterRender(cross_z_build_can);
				
				RegisterRender(dragon_magma_full_bottle);
				RegisterRender(dragon_evol_bottle_gold);
				RegisterRender(muscle_galaxy_full_bottle);
				RegisterRender(north_blizzard_full_bottle);
				RegisterRender(prime_rogue_full_bottle);
				
				RegisterRender(dragon_sclashjelly);
				RegisterRender(robot_sclashjelly);
				RegisterRender(crocodile_crack_full_bottle);
				
				RegisterRender(cobra_evol_bottle);
				RegisterRender(rider_system_evol_bottle);
				RegisterRender(dragon_evol_bottle);
				RegisterRender(rabbit_evol_bottle);
				RegisterRender(evol_trigger);
				
				RegisterRender(bat_full_bottle);
				RegisterRender(cobra_full_bottle);
				RegisterRender(fukurou_full_bottle);
				RegisterRender(kuwagata_full_bottle);
				RegisterRender(castle_full_bottle);
				
				RegisterRender(gear_engine);
				RegisterRender(gear_remocon);
				RegisterRender(gear_red);
				RegisterRender(gear_blue);

				RegisterRender(lost_bat_full_bottle);
				RegisterRender(lost_cobra_full_bottle);
				RegisterRender(lost_castle_full_bottle);
				RegisterRender(lost_kuwagata_full_bottle);
				RegisterRender(lost_fukurou_full_bottle);
				RegisterRender(lost_hammer_full_bottle);
				RegisterRender(lost_shimauma_full_bottle);
				RegisterRender(lost_spanner_full_bottle);
				RegisterRender(lost_hasami_full_bottle);
				RegisterRender(lost_cd_full_bottle);
				
				RegisterRender(build_driver_rabbit);
				RegisterRender(build_driver_gorilla);
				RegisterRender(build_driver_taka);
				RegisterRender(build_driver_harinezumi);
				RegisterRender(build_driver_ninja);
				RegisterRender(build_driver_panda);
				RegisterRender(build_driver_lion);
				RegisterRender(build_driver_dragon);
				RegisterRender(build_driver_santa);
				RegisterRender(build_driver_orange);
				RegisterRender(build_driver_doctor);
				RegisterRender(build_driver_dog);
				RegisterRender(build_driver_mahoutsukai);
				RegisterRender(build_driver_tantei);
				RegisterRender(build_driver_kaizoku);
				RegisterRender(build_driver_octopus);
				RegisterRender(build_driver_phoenix);
				RegisterRender(build_driver_kuma);
				RegisterRender(build_driver_momotaros);
				RegisterRender(build_driver_yujou);
				RegisterRender(build_driver_obake);
				RegisterRender(build_driver_wolf);
				RegisterRender(build_driver_beetle);
				RegisterRender(build_driver_card);
				RegisterRender(build_driver_rose);
				RegisterRender(build_driver_tora);
				RegisterRender(build_driver_kujira);
				RegisterRender(build_driver_kirin);
				RegisterRender(build_driver_unicorn);
				RegisterRender(build_driver_turtle);
				RegisterRender(build_driver_deer);
				RegisterRender(build_driver_penguin);
				RegisterRender(build_driver_spider);
				RegisterRender(build_driver_rabbit_gold);
				RegisterRender(build_driver_scorpion);
				
				RegisterRender(build_driver_tank);	
				RegisterRender(build_driver_diamond);
				RegisterRender(build_driver_gatling);
				RegisterRender(build_driver_soujiki);
				RegisterRender(build_driver_comic);
				RegisterRender(build_driver_rocket);
				RegisterRender(build_driver_shoubousha);
				RegisterRender(build_driver_lock);
				RegisterRender(build_driver_cake);
				RegisterRender(build_driver_medal);
				RegisterRender(build_driver_game);
				RegisterRender(build_driver_mic);
				RegisterRender(build_driver_usb_memory);
				RegisterRender(build_driver_densha);
				RegisterRender(build_driver_light);
				RegisterRender(build_driver_robo);
				RegisterRender(build_driver_televi);
				RegisterRender(build_driver_parka);
				RegisterRender(build_driver_smartphone);
				RegisterRender(build_driver_camera);
				RegisterRender(build_driver_helicopter);
				RegisterRender(build_driver_ufo);
				RegisterRender(build_driver_jet);
				RegisterRender(build_driver_cyclone);
				RegisterRender(build_driver_eraser);
				RegisterRender(build_driver_watch);
				RegisterRender(build_driver_pyramid);
				RegisterRender(build_driver_skateboard);
				RegisterRender(build_driver_fridge);
				RegisterRender(build_driver_dragon_silver);
				RegisterRender(build_driver_sai);
				RegisterRender(build_driver_gold);
				
				RegisterRender(build_driver_sp);
				RegisterRender(build_driver_hazard);
				RegisterRender(build_driver_hazard_rabbit);
				RegisterRender(build_driver_hazard_tank);
				RegisterRender(build_driver_genius);
				RegisterRender(build_driver_cross_z_build);
				
				RegisterRender(evol_driver_cobra);
				RegisterRender(evol_driver_dragon);
				RegisterRender(evol_driver_rabbit);
				RegisterRender(evol_driver_blackhole);
				
				RegisterRender(build_driver_cross_z_dragon);
				RegisterRender(build_driver_magma);
				RegisterRender(build_driver_cross_z_great);
				RegisterRender(build_driver_galaxy);
				
				RegisterRender(hawk_gatling_wings);
				RegisterRender(phoenix_robo_wings);
				
				RegisterRender(zi_o_head);
				RegisterRender(zi_o_torso);
				RegisterRender(zi_o_legs);
				
				RegisterRender(zikuu_driver_zi_o);
				RegisterRender(zikuu_driver_geiz);
				RegisterRender(zikuu_driver_ghost);
				
				RegisterRender(zi_o_ridewatch);
				RegisterRender(geiz_ridewatch);
				
				RegisterRender(build_ridewatch);
				RegisterRender(cross_z_ridewatch);
				RegisterRender(exaid_ridewatch);
				RegisterRender(genm_ridewatch);
				RegisterRender(ghost_ridewatch);
				RegisterRender(drive_ridewatch);
				// RegisterRender(gaim_ridewatch);
				RegisterRender(wizard_ridewatch);
				RegisterRender(beast_ridewatch);
				RegisterRender(fourze_ridewatch);
				RegisterRender(ooo_ridewatch);
				// RegisterRender(w_ridewatch);
				// RegisterRender(kiva_ridewatch);
				RegisterRender(deno_ridewatch);
				RegisterRender(kabuto_ridewatch);
				RegisterRender(hibiki_ridewatch);
				// RegisterRender(blade_ridewatch);
				RegisterRender(faiz_ridewatch);
				RegisterRender(ryuki_ridewatch);
				// RegisterRender(agito_ridewatch);
				// RegisterRender(kuuga_ridewatch);
				
				RegisterRender(amazonshead);
				RegisterRender(amazonstroso);
				RegisterRender(amazonslegs);
				
				RegisterRender(amazons_driver_omega);
				RegisterRender(neo_amazons_driver_omega);
				RegisterRender(amazons_driver_alpha);
				RegisterRender(amazons_driver_blind_alpha);
				RegisterRender(neo_amazons_driver_neo_alpha);
				RegisterRender(amazons_driver_sigma);
				RegisterRender(neo_amazons_driver_neo);
				
				RegisterRender(condorer_core_alpha);
				RegisterRender(condorer_core_omega);
				RegisterRender(condorer_core_sigma);
				RegisterRender(condorer_core_blind_alpha);
				
				RegisterRender(amazon_injector_neo);
				RegisterRender(amazon_injector_new_omega);
				RegisterRender(amazon_injector_neo_alpha);
				
	}
public static void RegisterRenderb(Block block){
		Item item = Item.getItemFromBlock(block);
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation("kamenridercraftv3"+":"+item.getUnlocalizedName().substring(5),"inventory"));
	}

	public static void RegisterRender(Item item){
		
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation("kamenridercraftv3"+":"+item.getUnlocalizedName().substring(5),"inventory"));
	}


	 
}
