package Kamen_Rider_Craft_4TH;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import Kamen_Rider_Craft_4TH.blocks.custom.BlockType;
import Kamen_Rider_Craft_4TH.blocks.custom.CustomBlock;
import Kamen_Rider_Craft_4TH.blocks.custom.Property;
import Kamen_Rider_Craft_4TH.blocks.decor_block;
import Kamen_Rider_Craft_4TH.blocks.glass_ore_block;
import Kamen_Rider_Craft_4TH.blocks.mob_block;
import Kamen_Rider_Craft_4TH.blocks.ore_block;
import Kamen_Rider_Craft_4TH.blocks.pandora_box_block;
import Kamen_Rider_Craft_4TH.blocks.purifyer_block;
import Kamen_Rider_Craft_4TH.blocks.solidifyer_block;
import Kamen_Rider_Craft_4TH.item.*;
import Kamen_Rider_Craft_4TH.item.Ex_Aid.Item_gashat;
import Kamen_Rider_Craft_4TH.item.Ex_Aid.item_ex_aidarmor;
import Kamen_Rider_Craft_4TH.item.Ex_Aid.item_ex_aidarmor2;
import Kamen_Rider_Craft_4TH.item.Ex_Aid.item_ex_aiddriver;
import Kamen_Rider_Craft_4TH.item.Ichigo.Item_showa_change;
import Kamen_Rider_Craft_4TH.item.Ichigo.item_Ichigoarmor;
import Kamen_Rider_Craft_4TH.item.Ichigo.item_Ichigoarmor2;
import Kamen_Rider_Craft_4TH.item.Ichigo.item_Ichigodriver;
import Kamen_Rider_Craft_4TH.item.W.Item_memory;
import Kamen_Rider_Craft_4TH.item.W.Item_metal_shaft;
import Kamen_Rider_Craft_4TH.item.W.item_Warmor;
import Kamen_Rider_Craft_4TH.item.W.item_Wdriver;
import Kamen_Rider_Craft_4TH.item.W.item_warmor2;
import Kamen_Rider_Craft_4TH.item.agito.Item_agito_power;
import Kamen_Rider_Craft_4TH.item.agito.item_agitoarmor;
import Kamen_Rider_Craft_4TH.item.agito.item_agitoarmor2;
import Kamen_Rider_Craft_4TH.item.agito.item_agitodriver;
import Kamen_Rider_Craft_4TH.item.amazons.item_amazonsarmor;
import Kamen_Rider_Craft_4TH.item.amazons.item_amazonsarmor2;
import Kamen_Rider_Craft_4TH.item.amazons.item_amazonsdriver;
import Kamen_Rider_Craft_4TH.item.blade.ItemRouze_Cards;
import Kamen_Rider_Craft_4TH.item.blade.item_bladearmor;
import Kamen_Rider_Craft_4TH.item.blade.item_bladearmor2;
import Kamen_Rider_Craft_4TH.item.blade.item_bladedriver;
import Kamen_Rider_Craft_4TH.item.build.Item_full_bottle;
import Kamen_Rider_Craft_4TH.item.build.Item_nebulasteamgun;
import Kamen_Rider_Craft_4TH.item.build.Item_transteamgun;
import Kamen_Rider_Craft_4TH.item.build.item_buildarmor;
import Kamen_Rider_Craft_4TH.item.build.item_buildarmor2;
import Kamen_Rider_Craft_4TH.item.build.item_builddriver;
import Kamen_Rider_Craft_4TH.item.build.item_buildphone;
import Kamen_Rider_Craft_4TH.item.decade.Item_dienddriver;
import Kamen_Rider_Craft_4TH.item.decade.Itemrider_cards;
import Kamen_Rider_Craft_4TH.item.decade.item_decadearmor;
import Kamen_Rider_Craft_4TH.item.decade.item_decadearmor2;
import Kamen_Rider_Craft_4TH.item.decade.item_decadedriver;
import Kamen_Rider_Craft_4TH.item.deno.Itemdenkamen_sword;
import Kamen_Rider_Craft_4TH.item.deno.Itemrider_ticket;
import Kamen_Rider_Craft_4TH.item.deno.item_den_oarmor;
import Kamen_Rider_Craft_4TH.item.deno.item_den_oarmor2;
import Kamen_Rider_Craft_4TH.item.deno.item_den_odriver;
import Kamen_Rider_Craft_4TH.item.drive.Item_break_gunner;
import Kamen_Rider_Craft_4TH.item.drive.Item_lupin_gunner;
import Kamen_Rider_Craft_4TH.item.drive.Item_shift_car;
import Kamen_Rider_Craft_4TH.item.drive.item_drivearmor;
import Kamen_Rider_Craft_4TH.item.drive.item_drivearmor2;
import Kamen_Rider_Craft_4TH.item.drive.item_drivedriver;
import Kamen_Rider_Craft_4TH.item.faiz.Item_mission_memory;
import Kamen_Rider_Craft_4TH.item.faiz.item_faizarmor;
import Kamen_Rider_Craft_4TH.item.faiz.item_faizarmor2;
import Kamen_Rider_Craft_4TH.item.faiz.item_faizdriver;
import Kamen_Rider_Craft_4TH.item.fourze.Item_astroswitch;
import Kamen_Rider_Craft_4TH.item.fourze.item_Fourzearmor;
import Kamen_Rider_Craft_4TH.item.fourze.item_Fourzearmor2;
import Kamen_Rider_Craft_4TH.item.fourze.item_Fourzedriver;
import Kamen_Rider_Craft_4TH.item.gaim.Item_lockseed;
import Kamen_Rider_Craft_4TH.item.gaim.item_Gaimarmor;
import Kamen_Rider_Craft_4TH.item.gaim.item_Gaimarmor2;
import Kamen_Rider_Craft_4TH.item.gaim.item_Gaimarmor3;
import Kamen_Rider_Craft_4TH.item.gaim.item_Gaimdriver;
import Kamen_Rider_Craft_4TH.item.gaim.item_fake_donguri;
import Kamen_Rider_Craft_4TH.item.ghost.Item_ghost_Icons;
import Kamen_Rider_Craft_4TH.item.ghost.item_ghost_armor2;
import Kamen_Rider_Craft_4TH.item.ghost.item_ghost_armor3;
import Kamen_Rider_Craft_4TH.item.ghost.item_ghostarmor;
import Kamen_Rider_Craft_4TH.item.ghost.item_ghostdriver;
import Kamen_Rider_Craft_4TH.item.hibiki.Itemarmed_saber;
import Kamen_Rider_Craft_4TH.item.hibiki.Itemhibiki_stone;
import Kamen_Rider_Craft_4TH.item.hibiki.item_hibikiarmor;
import Kamen_Rider_Craft_4TH.item.hibiki.item_hibikiarmor2;
import Kamen_Rider_Craft_4TH.item.hibiki.item_hibikidriver;
import Kamen_Rider_Craft_4TH.item.kabuto.Item_clock_up_pad;
import Kamen_Rider_Craft_4TH.item.kabuto.Item_zecter;
import Kamen_Rider_Craft_4TH.item.kabuto.item_kabutoarmor;
import Kamen_Rider_Craft_4TH.item.kabuto.item_kabutoarmor2;
import Kamen_Rider_Craft_4TH.item.kabuto.item_kabutodriver;
import Kamen_Rider_Craft_4TH.item.kiva.Itemfuestle;
import Kamen_Rider_Craft_4TH.item.kiva.item_kivaarmor;
import Kamen_Rider_Craft_4TH.item.kiva.item_kivaarmor2;
import Kamen_Rider_Craft_4TH.item.kiva.item_kivadriver;
import Kamen_Rider_Craft_4TH.item.kuuga.Item_kuuga_mode_change_gun_im;
import Kamen_Rider_Craft_4TH.item.kuuga.Item_kuuga_mode_change_sword_im;
import Kamen_Rider_Craft_4TH.item.kuuga.Item_kuuga_power;
import Kamen_Rider_Craft_4TH.item.kuuga.item_kuugaarmor;
import Kamen_Rider_Craft_4TH.item.kuuga.item_kuugaarmor2;
import Kamen_Rider_Craft_4TH.item.kuuga.item_kuugadriver;
import Kamen_Rider_Craft_4TH.item.ooo.Itemmedal;
import Kamen_Rider_Craft_4TH.item.ooo.Itemo_scanner;
import Kamen_Rider_Craft_4TH.item.ooo.item_OOOarmor;
import Kamen_Rider_Craft_4TH.item.ooo.item_OOOarmor2;
import Kamen_Rider_Craft_4TH.item.ooo.item_OOOdriver;
import Kamen_Rider_Craft_4TH.item.ryuki.Item_advent_cards;
import Kamen_Rider_Craft_4TH.item.ryuki.Item_vent;
import Kamen_Rider_Craft_4TH.item.ryuki.item_ryukiarmor;
import Kamen_Rider_Craft_4TH.item.ryuki.item_ryukiarmor2;
import Kamen_Rider_Craft_4TH.item.ryuki.item_ryukidriver;
import Kamen_Rider_Craft_4TH.item.wizard.Item_wizard_ring;
import Kamen_Rider_Craft_4TH.item.wizard.Item_wizard_rings_efts;
import Kamen_Rider_Craft_4TH.item.wizard.item_wizardarmor;
import Kamen_Rider_Craft_4TH.item.wizard.item_wizardarmor2;
import Kamen_Rider_Craft_4TH.item.wizard.item_wizarddriver;
import Kamen_Rider_Craft_4TH.item.zi_o.Item_ridewatches;
import Kamen_Rider_Craft_4TH.item.zi_o.item_zi_oarmor;
import Kamen_Rider_Craft_4TH.item.zi_o.item_zi_oarmor2;
import Kamen_Rider_Craft_4TH.item.zi_o.item_zikudriver;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.ItemMeshDefinition;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraftforge.fml.common.registry.GameRegistry;

import static Kamen_Rider_Craft_4TH.blocks.custom.Property.TRANSPARENT;
import static Kamen_Rider_Craft_4TH.blocks.custom.Property.WALKTHROUGH;
import static Kamen_Rider_Craft_4TH.item.item_panel.PanelColor.*;
import static java.util.Objects.*;

public class RiderItems {

	public static Item blanknoitem = new Item_ore("blanknoitem");
	
	public static Item energy = new Item_ore("energy").setCreativeTab(Tabs.tabmisc);

	public static Item donut = new riderfood(4, true,"donut").setCreativeTab(Tabs.tabmisc);
	public static Item icepop1  = new riderfood(2, true,"icepop1").setCreativeTab(Tabs.tabmisc);
	public static Item icepop2  = new riderfood(2, true,"icepop2").setCreativeTab(Tabs.tabmisc);
	public static Item icepop3  = new riderfood(2, true,"icepop3").setCreativeTab(Tabs.tabmisc);
	
	public static Item base_sword = new Item_ore("base_sword").setCreativeTab(Tabs.tabmisc);
	//public static Item base_gun = new Item_ore("base_gun").setCreativeTab(Tabs.tabmisc);

	//ore blocks
	
	public static Item kuuga_growing = new Item_kuuga_power("kuuga_growing",0).setCreativeTab(Tabs.tabkuuga);
	public static Block stone_kuuga= new ore_block("stone_kuuga",Material.ROCK, kuuga_growing, 2).setHardness(9.9F).setCreativeTab(Tabs.tabkuuga);

	public static Item agito_of_seed = new Item_ore("agito_of_seed").setCreativeTab(Tabs.tabagito);
	public static Block stone_agito= new ore_block("stone_agito",Material.ROCK, agito_of_seed, 2).setHardness(9.9F).setCreativeTab(Tabs.tabagito);

	public static Item g3core = new Item_ore("g3core").setCreativeTab(Tabs.tabagito);
	public static Block hellrock_agito= new ore_block("hellrock_agito",Material.ROCK, g3core, 3).setHardness(9.9F).setCreativeTab(Tabs.tabagito);

	public static Item contract_advent = new Item_advent_cards("contract_advent",2,"1").setCreativeTab(Tabs.tabryuki);
	public static Block advent_glass= new glass_ore_block("advent_glass",Material.ROCK, contract_advent, 2).setHardness(9.9F).setCreativeTab(Tabs.tabryuki);

	public static Item dragblacker_advent = new Item_ore("dragblacker_advent").setCreativeTab(Tabs.tabryuki);
	public static Block hell_advent_glass= new glass_ore_block("hell_advent_glass",Material.ROCK, dragblacker_advent, 3).setHardness(9.9F).setCreativeTab(Tabs.tabryuki);

	public static Item blank_mission_memory = new Item_ore("blank_mission_memory").setCreativeTab(Tabs.tabfaiz);
	public static Block mission_memory_block = new ore_block("mission_memory_block",Material.ROCK, blank_mission_memory, 2).setHardness(9.9F).setCreativeTab(Tabs.tabfaiz);

	public static Item bladecard = new Item_ore("bladecard").setCreativeTab(Tabs.tabblade);
	public static Block bladecard_block = new ore_block("bladecard_block",Material.ROCK, bladecard, 2).setHardness(9.9F).setCreativeTab(Tabs.tabblade);

	public static Item changekerberosglaive = new Item_ore("changekerberosglaive").setCreativeTab(Tabs.tabblade);
	public static Block bladecard_hellrock = new ore_block("bladecard_hellrock",Material.ROCK, changekerberosglaive, 3).setHardness(9.9f).setCreativeTab(Tabs.tabblade);

	public static Item oni_ore = new Item_ore("oni_ore").setCreativeTab(Tabs.tabhibiki);
	public static Block oni_ore_block = new ore_block("oni_ore_block",Material.ROCK, oni_ore, 2).setHardness(9.9F).setCreativeTab(Tabs.tabhibiki);

	public static Item oni_orehell = new Item_ore("oni_orehell").setCreativeTab(Tabs.tabhibiki);
	public static Block oni_ore_hellrock = new ore_block("oni_ore_hellrock",Material.ROCK, oni_orehell, 3).setHardness(9.9F).setCreativeTab(Tabs.tabhibiki);

	public static Item mini_zecter = new Item_ore("mini_zecter").setCreativeTab(Tabs.tabkabuto);
	public static Block zectblock = new ore_block("zectblock",Material.ROCK, mini_zecter, 2).setHardness(9.9F).setCreativeTab(Tabs.tabkabuto);

	public static Item unfinished_kabutick_zecter = new Item_ore("unfinished_kabutick_zecter").setCreativeTab(Tabs.tabkabuto);
	public static Block neozecthellrock = new ore_block("neozecthellrock",Material.ROCK, unfinished_kabutick_zecter, 3).setHardness(9.9F).setCreativeTab(Tabs.tabkabuto);

	public static Item imaginsand = new Item_ore("imaginsand").setCreativeTab(Tabs.tabden_o);
	public static Block imaginsandblock = new ore_block("imaginsandblock",Material.ROCK, imaginsand, 2).setHardness(9.9F).setCreativeTab(Tabs.tabden_o);

	public static Item rider_ticket_strike = new Item_ore ("rider_ticket_strike").setCreativeTab(Tabs.tabden_o);
	public static Block hellimaginsandblock = new ore_block("hellimaginsandblock",Material.ROCK, rider_ticket_strike, 3).setHardness(9.9F).setCreativeTab(Tabs.tabden_o);

	public static Item fuestle = new Item_ore("fuestle").setCreativeTab(Tabs.tabkiva);
	public static Block fuestleblock = new ore_block("fuestleblock",Material.ROCK, fuestle, 2).setHardness(9.9F).setCreativeTab(Tabs.tabkiva);

	public static Item fuestlefake = new Item_ore("fuestlefake").setCreativeTab(Tabs.tabkiva);
	public static Block fuestlehellrock = new ore_block("fuestlehellrock",Material.ROCK, fuestlefake, 3).setHardness(9.9F).setCreativeTab(Tabs.tabkiva);

	public static Item blankcard = new Item_ore("blankcard").setCreativeTab(Tabs.tabdecade);
	public static Block card_stone = new ore_block("card_stone",Material.ROCK,blankcard, 2).setHardness(9.9F).setCreativeTab(Tabs.tabdecade);

	public static Item diendcard = new Itemrider_cards(0,0,"diendcard").setCreativeTab(Tabs.tabdecade);
	public static Block card_hellrock = new ore_block("card_hellrock",Material.ROCK,diendcard, 3).setHardness(9.9F).setCreativeTab(Tabs.tabdecade);

	public static Item gaiamemory = new Item_ore("gaiamemory").setCreativeTab(Tabs.tabW);
	public static Block gaiamemoryblock = new ore_block("gaiamemoryblock",Material.ROCK, gaiamemory, 2).setHardness(9.9F).setCreativeTab(Tabs.tabW);

	public static Item t2gaiamemory = new Item_ore("t2gaiamemory").setCreativeTab(Tabs.tabW);
	public static Block gaiamemoryhellrock = new ore_block("gaiamemoryhellrock",Material.ROCK, t2gaiamemory, 3).setHardness(9.9F).setLightLevel(0.1f).setCreativeTab(Tabs.tabW);

	public static Item cellmedal = new Item_ore("cellmedal").setCreativeTab(Tabs.tabOOO);
	public static Block cellmedalblock = new ore_block("cellmedalblock",Material.ROCK, cellmedal, 2).setHardness(9.9F).setLightLevel(0.1f).setCreativeTab(Tabs.tabOOO);

	public static Item birth_core= new Item_ore("birth_core").setCreativeTab(Tabs.tabOOO);
	public static Block ooo_hellrock = new ore_block("ooo_hellrock",Material.ROCK, birth_core, 3).setHardness(9.9F).setCreativeTab(Tabs.tabOOO);

	public static Item astroswitch = new Item_ore("astroswitch").setCreativeTab(Tabs.tabFourze);
	public static Block astroswitchblock = new ore_block("astroswitchblock",Material.ROCK, astroswitch, 2).setHardness(9.9F).setCreativeTab(Tabs.tabFourze);

	public static Item gate_switch = new Item_ore("gate_switch").setCreativeTab(Tabs.tabFourze);
	public static Block swichhellrock = new ore_block("swichhellrock",Material.ROCK, gate_switch, 3).setHardness(9.9F).setCreativeTab(Tabs.tabFourze);

	public static Item wizardgem = new Item_ore("wizardgem").setCreativeTab(Tabs.tabwizard);
	public static Block wizardgemblock = new ore_block("wizardgemblock",Material.ROCK, wizardgem, 2).setHardness(9.9F).setCreativeTab(Tabs.tabwizard);

	public static Item wizardgem2 = new Item_ore("wizardgem2").setCreativeTab(Tabs.tabwizard);
	public static Block hellwizardgemblock = new ore_block("hellwizardgemblock",Material.ROCK, wizardgem2, 3).setHardness(9.9F).setCreativeTab(Tabs.tabwizard);

	public static Item himawari_lockseed = new Item_ore("himawari_lockseed").setCreativeTab(Tabs.tabGaim);
	public static Block himawari_lockseedblock = new ore_block("himawari_lockseedblock",Material.ROCK, himawari_lockseed, 2).setHardness(9.9F).setLightLevel(0.1f).setCreativeTab(Tabs.tabGaim);

	public static Item himawari_energy_lockseed = new Item_ore("himawari_energy_lockseed").setCreativeTab(Tabs.tabGaim);
	public static Block hellrock_lockseedblock = new ore_block("hellrock_lockseedblock",Material.ROCK, himawari_energy_lockseed, 3).setHardness(9.9F).setCreativeTab(Tabs.tabGaim);

	public static Item proto_speedshift  = new Item_shift_car(1, 11,"proto_speedshift").setCreativeTab(Tabs.tabdrive);
	public static Block drive_stone = new ore_block("drive_stone",Material.ROCK, proto_speedshift, 2).setHardness(9.9F).setLightLevel(0.1f).setCreativeTab(Tabs.tabdrive);

	public static Item signal_chaser  = new Item_shift_car(3, 5,"signal_chaser").setCreativeTab(Tabs.tabdrive);
	public static Block hellrock_drive = new ore_block("hellrock_drive",Material.ROCK, signal_chaser, 3).setHardness(9.9F).setCreativeTab(Tabs.tabdrive);

	public static Item ghost_icons = new Item_ore("ghost_icons").setCreativeTab(Tabs.tabghost);
	public static Block ghost_iconsblock = new ore_block("ghost_iconsblock",Material.ROCK, ghost_icons, 2).setHardness(9.9F).setCreativeTab(Tabs.tabghost);

	public static Item ghost_gammaicons = new Item_ore("ghost_gammaicons").setCreativeTab(Tabs.tabghost);
	public static Block ghost_icons_hellrock = new ore_block("ghost_icons_hellrock",Material.ROCK, ghost_gammaicons, 3).setHardness(9.9F).setCreativeTab(Tabs.tabghost);

	public static Item blank_gashat = new Item_ore("blank_gashat").setCreativeTab(Tabs.tabex_aid);
	public static Block bugsters_stone = new ore_block("bugsters_stone",Material.ROCK, blank_gashat, 2).setHardness(9.9F).setCreativeTab(Tabs.tabex_aid);

	public static Item unfinished_kamen_rider_chronicle_gashat = new Item_ore("unfinished_kamen_rider_chronicle_gashat").setCreativeTab(Tabs.tabex_aid);
	public static Block gemdeus_stone = new ore_block("gemdeus_stone",Material.ROCK, unfinished_kamen_rider_chronicle_gashat, 3).setHardness(9.9F).setCreativeTab(Tabs.tabex_aid);

	public static Item full_bottle = new Item_ore("full_bottle").setCreativeTab(Tabs.tabbuild);
	public static Block pandora_box = new ore_block("pandora_box",Material.ROCK, full_bottle, 2).setHardness(9.9F).setCreativeTab(Tabs.tabbuild);

	public static Item sclashjelly = new Item_ore("sclashjelly").setCreativeTab(Tabs.tabbuild);
	public static Block pandora_box_hellrock = new ore_block("pandora_box_hellrock",Material.ROCK, sclashjelly, 3).setHardness(9.9F).setCreativeTab(Tabs.tabbuild);

	public static Item unfinished_gear = new Item_ore("unfinished_gear").setCreativeTab(Tabs.tabbuild);
	public static Block pandora_box_hellrock_2 = new ore_block("pandora_box_hellrock_2",Material.ROCK, unfinished_gear, 3).setHardness(9.9F).setLightLevel(0.1f).setCreativeTab(Tabs.tabbuild);
	
	public static Item blank_watch = new Item_ore("blank_watch").setCreativeTab(Tabs.tabzi_o);
	public static Block watch_stone = new ore_block("watch_stone",Material.ROCK, blank_watch, 2).setHardness(9.9F).setCreativeTab(Tabs.tabzi_o);

	public static Item amazon_cell_vial = new Item_ore("amazon_cell_vial").setCreativeTab(Tabs.tabamazons);
	public static Block amazon_cell_block = new ore_block("amazon_cell_block",Material.ROCK, amazon_cell_vial, 2).setHardness(9.9F).setLightLevel(0.1f).setCreativeTab(Tabs.tabamazons);
	
	//decor blocks
	
	public static Block monitor = CustomBlock.builder().material(Material.IRON).hardness(9.9F).lightLevel(0.1F).harvestLevel("pickaxe", 2).blockType(BlockType.DIRECTIONAL).name("monitor").setCreativeTabe(Tabs.tabdecor).build();
	public static Block pandorabox = new pandora_box_block("pandorabox",Material.ROCK, 2).setHardness(9.9F).setCreativeTab(Tabs.tabbuild);
	public static Block purifyer = new purifyer_block("purifyer",Material.ROCK, 2).setHardness(9.9F).setCreativeTab(Tabs.tabbuild);
	public static Block solidifyer = new solidifyer_block("solidifyer",Material.ROCK, 2).setHardness(9.9F).setCreativeTab(Tabs.tabbuild);
	
	public static Block mighty_block = CustomBlock.builder().material(Material.IRON).hardness(9.9F).harvestLevel("pickaxe", 2).name("mighty_block").setCreativeTabe(Tabs.tabdecor).build();
	public static Block fangire_glass = CustomBlock.builder().material(Material.IRON).hardness(9.9F).lightOpacity(1).harvestLevel("pickaxe", 2).name("fangire_glass").property(TRANSPARENT).setCreativeTabe(Tabs.tabdecor).build();
	public static Block wallplate = CustomBlock.builder().material(Material.IRON).hardness(9.9F).harvestLevel("pickaxe", 2).name("wallplate").setCreativeTabe(Tabs.tabdecor).build();
	
	//boss blocks
	
	public static Block evolt_block = new mob_block("evolt_block",Material.ROCK, "evolt", 2).setHardness(9.9F).setLightLevel(0.1f).setCreativeTab(Tabs.tabbuild);
	public static Block night_rogue_block = new mob_block("night_rogue_block",Material.ROCK, "night_rogue", 2).setHardness(9.9F).setLightLevel(0.1f).setCreativeTab(Tabs.tabbuild);
	public static Block hell_bros_block = new mob_block("hell_bros_block",Material.ROCK, "hell_bros", 2).setHardness(9.9F).setLightLevel(0.1f).setCreativeTab(Tabs.tabbuild);
	public static Block bi_kaiser_block = new mob_block("bi_kaiser_block",Material.ROCK, "bi_kaiser", 2).setHardness(9.9F).setLightLevel(0.1f).setCreativeTab(Tabs.tabbuild);
	public static Block another_build_block = new mob_block("another_build_block",Material.ROCK, "another_build", 2).setHardness(9.9F).setLightLevel(0.1f).setCreativeTab(Tabs.tabzi_o);
	
	public static Item rider_circuit = new Item_ore("rider_circuit").setCreativeTab(Tabs.tabIchigo);

	public static Item ichigohead = new item_Ichigoarmor("ichigohead",ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.HEAD).setMaxStackSize(1).setCreativeTab(Tabs.tabIchigo);
	public static Item ichigotroso = new item_Ichigoarmor2("ichigotroso",ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.CHEST).setMaxStackSize(1).setCreativeTab(Tabs.tabIchigo);
	public static Item ichigolegs = new item_Ichigoarmor2("ichigolegs",ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.LEGS).setMaxStackSize(1).setCreativeTab(Tabs.tabIchigo);

	public static Item typhoon_ichigo = new item_Ichigodriver("typhoon_ichigo",ArmorMaterial.DIAMOND, 4,"ichigo").setMaxStackSize(1).setCreativeTab(Tabs.tabIchigo);
	public static Item typhoon_nigo = new item_Ichigodriver("typhoon_nigo",ArmorMaterial.DIAMOND, 4,"nigo").setMaxStackSize(1).setCreativeTab(Tabs.tabIchigo);

	public static Item new_typhoon = new item_Ichigodriver("new_typhoon",ArmorMaterial.DIAMOND, 4,"new_ichigo").setMaxStackSize(1).setCreativeTab(Tabs.tabIchigo);
	
	public static Item typhoon_shocker_rider_1 = new item_Ichigodriver("typhoon_shocker_rider_1",ArmorMaterial.DIAMOND, 4,"shocker_rider_1").setMaxStackSize(1).setCreativeTab(Tabs.tabIchigo);
	public static Item typhoon_shocker_rider_2 = new item_Ichigodriver("typhoon_shocker_rider_2",ArmorMaterial.DIAMOND, 4,"shocker_rider_2").setMaxStackSize(1).setCreativeTab(Tabs.tabIchigo);
	public static Item typhoon_shocker_rider_3 = new item_Ichigodriver("typhoon_shocker_rider_3",ArmorMaterial.DIAMOND, 4,"shocker_rider_3").setMaxStackSize(1).setCreativeTab(Tabs.tabIchigo);
	public static Item typhoon_shocker_rider_4 = new item_Ichigodriver("typhoon_shocker_rider_4",ArmorMaterial.DIAMOND, 4,"shocker_rider_4").setMaxStackSize(1).setCreativeTab(Tabs.tabIchigo);
	public static Item typhoon_shocker_rider_5 = new item_Ichigodriver("typhoon_shocker_rider_5",ArmorMaterial.DIAMOND, 4,"shocker_rider_5").setMaxStackSize(1).setCreativeTab(Tabs.tabIchigo);
	public static Item typhoon_shocker_rider_6 = new item_Ichigodriver("typhoon_shocker_rider_6",ArmorMaterial.DIAMOND, 4,"shocker_rider_6").setMaxStackSize(1).setCreativeTab(Tabs.tabIchigo);

	public static Item typhoon_shocker_rider_7 = new item_Ichigodriver("typhoon_shocker_rider_7",ArmorMaterial.DIAMOND, 4,"shocker_rider_7").setMaxStackSize(1).setCreativeTab(Tabs.tabIchigo);
	public static Item typhoon_shocker_rider_8 = new item_Ichigodriver("typhoon_shocker_rider_8",ArmorMaterial.DIAMOND, 4,"shocker_rider_8").setMaxStackSize(1).setCreativeTab(Tabs.tabIchigo);
	public static Item typhoon_shocker_rider_9 = new item_Ichigodriver("typhoon_shocker_rider_9",ArmorMaterial.DIAMOND, 4,"shocker_rider_9").setMaxStackSize(1).setCreativeTab(Tabs.tabIchigo);
	public static Item typhoon_shocker_rider_10 = new item_Ichigodriver("typhoon_shocker_rider_10",ArmorMaterial.DIAMOND, 4,"shocker_rider_10").setMaxStackSize(1).setCreativeTab(Tabs.tabIchigo);
	public static Item typhoon_shocker_rider_11 = new item_Ichigodriver("typhoon_shocker_rider_11",ArmorMaterial.DIAMOND, 4,"shocker_rider_11").setMaxStackSize(1).setCreativeTab(Tabs.tabIchigo);
	public static Item typhoon_shocker_rider_12 = new item_Ichigodriver("typhoon_shocker_rider_12",ArmorMaterial.DIAMOND, 4,"shocker_rider_12").setMaxStackSize(1).setCreativeTab(Tabs.tabIchigo);

	public static Item double_typhoon = new item_Ichigodriver("double_typhoon",ArmorMaterial.DIAMOND, 4,"v3").setMaxStackSize(1).setCreativeTab(Tabs.tabIchigo);
	public static Item riderman_belt = new item_Ichigodriver("riderman_belt",ArmorMaterial.DIAMOND, 4,"riderman").setMaxStackSize(1).setCreativeTab(Tabs.tabIchigo);
	public static Item ridol = new item_Ichigodriver("ridol",ArmorMaterial.DIAMOND, 4,"x").setMaxStackSize(1).setCreativeTab(Tabs.tabIchigo);
	public static Item condorer = new item_Ichigodriver("condorer",ArmorMaterial.DIAMOND, 4,"amazon").setMaxStackSize(1).setCreativeTab(Tabs.tabIchigo);

	public static Item electrer = new item_Ichigodriver("electrer",ArmorMaterial.DIAMOND, 4,"stronger").setMaxStackSize(1).setCreativeTab(Tabs.tabIchigo);

	public static Item charge_up = new Item_showa_change("charge_up",1,electrer).setCreativeTab(Tabs.tabIchigo);

	public static Item tornado = new item_Ichigodriver("tornado",ArmorMaterial.DIAMOND, 4,"skyrider").setMaxStackSize(1).setCreativeTab(Tabs.tabIchigo);
	public static Item cyclode = new item_Ichigodriver("cyclode",ArmorMaterial.DIAMOND, 4,"super1").setMaxStackSize(1).setCreativeTab(Tabs.tabIchigo);	
	public static Item zx_belt = new item_Ichigodriver("zx_belt",ArmorMaterial.DIAMOND, 4,"zx").setMaxStackSize(1).setCreativeTab(Tabs.tabIchigo);
	public static Item king_stone = new item_Ichigodriver("king_stone",ArmorMaterial.DIAMOND, 4,"black").setMaxStackSize(1).setCreativeTab(Tabs.tabIchigo);
	public static Item king_stone_shadow_moon = new item_Ichigodriver("king_stone_shadow_moon",ArmorMaterial.DIAMOND, 4,"shadow_moon").setMaxStackSize(1).setCreativeTab(Tabs.tabIchigo);	

	public static Item sunriser_rr = new Item_ore("sunriser_rr");
	public static Item sunriser_br = new Item_ore("sunriser_br");
	public static Item sunriser = new item_Ichigodriver("sunriser",ArmorMaterial.DIAMOND, 4,"black_rx").setMaxStackSize(1).setCreativeTab(Tabs.tabIchigo);

	public static Item bio_rider = new Item_showa_change("bio_rider",1,sunriser).setCreativeTab(Tabs.tabIchigo);
	public static Item robo_rider = new Item_showa_change("robo_rider",2,sunriser).setCreativeTab(Tabs.tabIchigo);
	
	public static Item grasshopper_dna = new item_Ichigodriver("grasshopper_dna",ArmorMaterial.DIAMOND, 4,"shin").setMaxStackSize(1).setCreativeTab(Tabs.tabIchigo);
	public static Item zo_core = new item_Ichigodriver("zo_core",ArmorMaterial.DIAMOND, 4,"zo").setMaxStackSize(1).setCreativeTab(Tabs.tabIchigo);
	public static Item j_spirit = new item_Ichigodriver("j_spirit",ArmorMaterial.DIAMOND, 4,"j").setMaxStackSize(1).setCreativeTab(Tabs.tabIchigo);

	public static Item ridol_stick = new ItemBaseSword("ridol_stick",Tabs.ridol_stick).setMaxStackSize(1).setCreativeTab(Tabs.tabIchigo);

	public static Item revolcane = new ItemBaseSword("revolcane",ToolMaterial.DIAMOND).setMaxStackSize(1).setCreativeTab(Tabs.tabIchigo);
	public static Item vortech_shooter = new Item_gun("vortech_shooter",Tabs.den_dengu,RiderItems.energy).setCreativeTab(Tabs.tabIchigo);
	public static Item bio_blade = new ItemBaseSword("bio_blade",ToolMaterial.DIAMOND).setMaxStackSize(1).setCreativeTab(Tabs.tabIchigo);
	
	public static Item shadow_saber_short = new ItemBaseSword("shadow_saber_short",ToolMaterial.DIAMOND).setMaxStackSize(1).setCreativeTab(Tabs.tabIchigo);

	public static Item typhoon_sango = new item_Ichigodriver("typhoon_sango",ArmorMaterial.DIAMOND, 4,"sango").setMaxStackSize(1).setCreativeTab(Tabs.tabIchigo);
	public static Item typhoon_yongo = new item_Ichigodriver("typhoon_yongo",ArmorMaterial.DIAMOND, 4,"yongo").setMaxStackSize(1).setCreativeTab(Tabs.tabIchigo);

	public static Item typhoon_akarider = new item_Ichigodriver("typhoon_akarider",ArmorMaterial.DIAMOND, 4,"akarider").setMaxStackSize(1).setCreativeTab(Tabs.tabIchigo);
	public static Item typhoon_aorider = new item_Ichigodriver("typhoon_aorider",ArmorMaterial.DIAMOND, 4,"aorider").setMaxStackSize(1).setCreativeTab(Tabs.tabIchigo);
	public static Item typhoon_kirider = new item_Ichigodriver("typhoon_kirider",ArmorMaterial.DIAMOND, 4,"kirider").setMaxStackSize(1).setCreativeTab(Tabs.tabIchigo);
	public static Item typhoon_momorider = new item_Ichigodriver("typhoon_momorider",ArmorMaterial.DIAMOND, 4,"momorider").setMaxStackSize(1).setCreativeTab(Tabs.tabIchigo);
	public static Item typhoon_midorider = new item_Ichigodriver("typhoon_midorider",ArmorMaterial.DIAMOND, 4,"midorider").setMaxStackSize(1).setCreativeTab(Tabs.tabIchigo);
	
	public static Item moonriser = new item_Ichigodriver("moonriser",ArmorMaterial.DIAMOND, 4,"white_rx").setMaxStackSize(1).setCreativeTab(Tabs.tabIchigo);
	public static Item king_stone_red_shadow_moon = new item_Ichigodriver("king_stone_red_shadow_moon",ArmorMaterial.DIAMOND, 4,"red_shadow_moon").setMaxStackSize(1).setCreativeTab(Tabs.tabIchigo);	
	
	public static Item susanoo_belt = new item_Ichigodriver("susanoo_belt",ArmorMaterial.DIAMOND, 4,"susanoo").setMaxStackSize(1).setCreativeTab(Tabs.tabIchigo);
	public static Item tsukuyomi_belt = new item_Ichigodriver("tsukuyomi_belt",ArmorMaterial.DIAMOND, 4,"tsukuyomi").setMaxStackSize(1).setCreativeTab(Tabs.tabIchigo);
	public static Item amaterasu_belt = new item_Ichigodriver("amaterasu_belt",ArmorMaterial.DIAMOND, 4,"amaterasu").setMaxStackSize(1).setCreativeTab(Tabs.tabIchigo);

	public static Item typhoon_core = new Item_ore("typhoon_core").setCreativeTab(Tabs.tabIchigo);
	public static Item riderman_belt_core = new Item_ore("riderman_belt_core").setCreativeTab(Tabs.tabIchigo);
	public static Item ridol_core = new Item_ore("ridol_core").setCreativeTab(Tabs.tabIchigo);
	public static Item condorer_wheel = new Item_ore("condorer_wheel").setCreativeTab(Tabs.tabIchigo);
	public static Item electrer_core = new Item_ore("electrer_core").setCreativeTab(Tabs.tabIchigo);
	public static Item tornado_core = new Item_ore("tornado_core").setCreativeTab(Tabs.tabIchigo);
	public static Item cyclode_core = new Item_ore("cyclode_core").setCreativeTab(Tabs.tabIchigo);
	public static Item zx_belt_core = new Item_ore("zx_belt_core").setCreativeTab(Tabs.tabIchigo);
	public static Item king_stone_core = new Item_ore("king_stone_core").setCreativeTab(Tabs.tabIchigo);
	public static Item king_stone_split = new Item_ore("king_stone_split").setCreativeTab(Tabs.tabIchigo);

	
	//kuuga
	public static Item dragon_rod = new Item_kuuga_mode_change_sword_im ("dragon_rod",Tabs.medajalibur).setMaxStackSize(1).setCreativeTab(Tabs.tabkuuga);
	public static Item pegasus_bowgun = new Item_kuuga_mode_change_gun_im("pegasus_bowgun",Tabs.birth_buster,RiderItems.energy).setMaxStackSize(1).setCreativeTab(Tabs.tabkuuga);
	public static Item titan_sword = new Item_kuuga_mode_change_sword_im("titan_sword",Tabs.gashacon_sparrow_arrow).setMaxStackSize(1).setCreativeTab(Tabs.tabkuuga);


	public static Item kuugahead = new item_kuugaarmor("kuugahead",ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.HEAD).setMaxStackSize(1).setCreativeTab(Tabs.tabkuuga);
	public static Item kuugatroso = new item_kuugaarmor2("kuugatroso",ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.CHEST).setMaxStackSize(1).setCreativeTab(Tabs.tabkuuga);
	public static Item kuugalegs = new item_kuugaarmor2("kuugalegs",ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.LEGS).setMaxStackSize(1).setCreativeTab(Tabs.tabkuuga);

	public static Item arcle = new item_kuugadriver("arcle",ArmorMaterial.DIAMOND, 4,"kuuga").setMaxStackSize(1).setCreativeTab(Tabs.tabkuuga);
	public static Item arcle_b = new Item_ore("arcle_b");
	public static Item arcle_gr = new Item_ore("arcle_gr");
	public static Item arcle_p = new Item_ore("arcle_p");
	public static Item arcle_u = new Item_ore("arcle_u");
	public static Item arcle_ru = new Item_ore("arcle_ru");

	public static Item kuuga_mighty = new Item_kuuga_power("kuuga_mighty",1).setCreativeTab(Tabs.tabkuuga);
	public static Item kuuga_dragon = new Item_kuuga_power("kuuga_dragon",2).setCreativeTab(Tabs.tabkuuga);
	public static Item kuuga_pegasus = new Item_kuuga_power("kuuga_pegasus",3).setCreativeTab(Tabs.tabkuuga);
	public static Item kuuga_titan = new Item_kuuga_power("kuuga_titan",4).setCreativeTab(Tabs.tabkuuga);
	public static Item kuuga_rising_mighty = new Item_kuuga_power("kuuga_rising_mighty",5).setCreativeTab(Tabs.tabkuuga);
	public static Item kuuga_rising_dragon = new Item_kuuga_power("kuuga_rising_dragon",6).setCreativeTab(Tabs.tabkuuga);
	public static Item kuuga_rising_pegasus = new Item_kuuga_power("kuuga_rising_pegasus",7).setCreativeTab(Tabs.tabkuuga);
	public static Item kuuga_rising_titan = new Item_kuuga_power("kuuga_rising_titan",8).setCreativeTab(Tabs.tabkuuga);
	public static Item kuuga_amazing_mighty = new Item_kuuga_power("kuuga_amazing_mighty",9).setCreativeTab(Tabs.tabkuuga);
	public static Item kuuga_ultimate = new Item_kuuga_power("kuuga_ultimate",10).setCreativeTab(Tabs.tabkuuga);
	public static Item kuuga_rising_ultimate = new Item_kuuga_power("kuuga_rising_ultimate",11).setCreativeTab(Tabs.tabkuuga);
	public static Item kuuga_super_rising_ultimate = new Item_kuuga_power("kuuga_super_rising_ultimate",12).setCreativeTab(Tabs.tabkuuga);

	//agito
	public static Item flame_saber_charge = new Item_ore("flame_saber_charge");
	public static Item flame_saber = new ItemChargeSword("flame_saber",Tabs.medajalibur).setMaxStackSize(1).setCreativeTab(Tabs.tabagito);
	public static Item storm_halberd = new ItemBaseSword("storm_halberd",ToolMaterial.DIAMOND).setMaxStackSize(1).setCreativeTab(Tabs.tabagito);

	public static Item shining_caliber_summoned = new ItemBaseSword("shining_caliber_summoned",ToolMaterial.DIAMOND).setMaxStackSize(1).setCreativeTab(Tabs.tabagito);
	public static Item shining_caliber = new ItemBaseSword("shining_caliber",ToolMaterial.DIAMOND).setMaxStackSize(1).setCreativeTab(Tabs.tabagito);

	public static Item agitohead = new item_agitoarmor("agitohead",ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.HEAD).setMaxStackSize(1).setCreativeTab(Tabs.tabagito);
	public static Item agitotroso = new item_agitoarmor2("agitotroso",ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.CHEST).setMaxStackSize(1).setCreativeTab(Tabs.tabagito);
	public static Item agitolegs = new item_agitoarmor2("agitolegs",ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.LEGS).setMaxStackSize(1).setCreativeTab(Tabs.tabagito);


	public static Item alter_ring = new item_agitodriver("alter_ring",ArmorMaterial.DIAMOND, 4,"agito").setMaxStackSize(1).setCreativeTab(Tabs.tabagito);
	public static Item alter_ring_fl = new Item_ore("alter_ring_fl");
	public static Item alter_ring_st = new Item_ore("alter_ring_st");
	public static Item alter_ring_shining = new Item_ore("alter_ring_shining");

	public static Item meta_factor_exceed = new Item_ore("meta_factor_exceed");
	public static Item meta_factor = new item_agitodriver("meta_factor",ArmorMaterial.DIAMOND, 4,"gills").setMaxStackSize(1).setCreativeTab(Tabs.tabagito);

	public static Item ank_point = new item_agitodriver("ank_point",ArmorMaterial.DIAMOND, 4,"another_agito").setMaxStackSize(1).setCreativeTab(Tabs.tabagito);

	public static Item g3_belt = new item_agitodriver("g3_belt",ArmorMaterial.DIAMOND, 4,"g3").setMaxStackSize(1).setCreativeTab(Tabs.tabagito);
	public static Item g3_x_belt = new item_agitodriver("g3_x_belt",ArmorMaterial.DIAMOND, 4,"g3_x").setMaxStackSize(1).setCreativeTab(Tabs.tabagito);
	public static Item g3_mild_belt = new item_agitodriver("g3_mild_belt",ArmorMaterial.DIAMOND, 4,"g3_mild").setMaxStackSize(1).setCreativeTab(Tabs.tabagito);
	public static Item g4_belt = new item_agitodriver("g4_belt",ArmorMaterial.DIAMOND, 4,"g4").setMaxStackSize(1).setCreativeTab(Tabs.tabagito);

	public static Item g4_x_belt = new item_agitodriver("g4_x_belt",ArmorMaterial.DIAMOND, 4,"g4_x").setMaxStackSize(1).setCreativeTab(Tabs.tabagito);

	public static Item g1_belt = new item_agitodriver("g1_belt",ArmorMaterial.DIAMOND, 4,"g1").setMaxStackSize(1).setCreativeTab(Tabs.tabagito);


	public static Item alter_ring_miracle = new item_agitodriver("alter_ring_miracle",ArmorMaterial.DIAMOND, 4,"agito_miracle").setMaxStackSize(1).setCreativeTab(Tabs.tabagito);
	public static Item ank_point_burning = new item_agitodriver("ank_point_burning",ArmorMaterial.DIAMOND, 4,"another_agito_burning").setMaxStackSize(1).setCreativeTab(Tabs.tabagito);

	public static Item agito_ground = new Item_agito_power("agito_ground",0).setCreativeTab(Tabs.tabagito);
	public static Item agito_storm = new Item_agito_power("agito_storm",1).setCreativeTab(Tabs.tabagito);
	public static Item agito_flame = new Item_agito_power("agito_flame",2).setCreativeTab(Tabs.tabagito);
	public static Item agito_trinity = new Item_agito_power("agito_trinity",3).setCreativeTab(Tabs.tabagito);
	public static Item agito_burning = new Item_agito_power("agito_burning",4).setCreativeTab(Tabs.tabagito);
	public static Item agito_shining = new Item_agito_power("agito_shining",5).setCreativeTab(Tabs.tabagito);

	public static Item gills = new Item_agito_power("gills",-1).setCreativeTab(Tabs.tabagito);
	public static Item exceed_gills = new Item_agito_power("exceed_gills",-1).setCreativeTab(Tabs.tabagito);

	public static Item g1 = new Item_ore("g1").setCreativeTab(Tabs.tabagito);
	public static Item g3 = new Item_ore("g3").setCreativeTab(Tabs.tabagito);
	public static Item g3x = new Item_ore("g3x").setCreativeTab(Tabs.tabagito);
	public static Item g3mild = new Item_ore("g3mild").setCreativeTab(Tabs.tabagito);
	public static Item g4 = new Item_ore("g4").setCreativeTab(Tabs.tabagito);
	public static Item g4x = new Item_ore("g4x").setCreativeTab(Tabs.tabagito);

	public static Item another_agito = new Item_ore("another_agito").setCreativeTab(Tabs.tabagito);

	public static Item agito_miracle = new Item_ore("agito_miracle").setCreativeTab(Tabs.tabagito);
	public static Item another_agito_burning_form = new Item_ore("another_agito_burning_form").setCreativeTab(Tabs.tabagito);

	//ryuki
	public static Item drag_visor = new Item_ore("drag_visor").setCreativeTab(Tabs.tabryuki);
	public static Item ride_saber = new ItemBaseSword("ride_saber",Tabs.den_denso).setMaxStackSize(1).setCreativeTab(Tabs.tabryuki);
	public static Item drag_saber = new ItemBaseSword("drag_saber",Tabs.den_denso).setMaxStackSize(1).setUnlocalizedName("drag_saber").setCreativeTab(Tabs.tabryuki);
	public static Item drag_claw = new ItemBaseSword("drag_claw",Tabs.den_denro).setMaxStackSize(1).setUnlocalizedName("drag_claw").setCreativeTab(Tabs.tabryuki);

	public static Item drag_shield = new ItemBaseShield("drag_shield").setMaxStackSize(1).setCreativeTab(Tabs.tabryuki);

	public static Item drag_visor_zwei_big = new Item_ore("drag_visor_zwei_big");
	public static Item drag_visor_zwei = new ItemBaseSword("drag_visor_zwei",Tabs.denkamen_sword).setMaxStackSize(1).setCreativeTab(Tabs.tabryuki);

	public static Item dark_visor = new ItemBaseSword("dark_visor",Tabs.den_denso).setMaxStackSize(1).setCreativeTab(Tabs.tabryuki);
	public static Item wing_lancer_big = new Item_ore("wing_lancer_big");
	public static Item wing_lancer = new ItemBaseSword("wing_lancer",Tabs.den_denaxe).setMaxStackSize(1).setCreativeTab(Tabs.tabryuki);

	public static Item dark_blade = new ItemBaseSword("dark_blade",Tabs.denkamen_sword).setMaxStackSize(1).setCreativeTab(Tabs.tabryuki);

	public static Item scissors_visor = new Item_ore("scissors_visor").setCreativeTab(Tabs.tabryuki);
	public static Item scissors_pincer = new ItemBaseSword("scissors_pincer",Tabs.den_denro).setMaxStackSize(1).setCreativeTab(Tabs.tabryuki);
	public static Item incisor_guard = new ItemBaseShield("incisor_guard").setMaxStackSize(1).setCreativeTab(Tabs.tabryuki);

	public static Item magna_visor = new Item_gun("magna_visor",Tabs.den_dengu,RiderItems.energy).setCreativeTab(Tabs.tabryuki);
	public static Item torque_guard = new ItemBaseShield("torque_guard").setCreativeTab(Tabs.tabryuki);

	public static Item evil_visor = new Item_ore("evil_visor").setCreativeTab(Tabs.tabryuki);

	public static Item metal_visor = new ItemBaseSword("metal_visor",Tabs.den_denso).setMaxStackSize(1).setCreativeTab(Tabs.tabryuki);
	public static Item hetal_horn = new ItemBaseSword("hetal_horn",Tabs.den_denaxe).setMaxStackSize(1).setCreativeTab(Tabs.tabryuki);

	public static Item veno_visor = new ItemBaseSword("veno_visor",Tabs.den_denro).setCreativeTab(Tabs.tabryuki);
	public static Item veno_saber = new ItemBaseSword("veno_saber",Tabs.den_denso).setMaxStackSize(1).setCreativeTab(Tabs.tabryuki);

	public static Item dest_visor = new ItemBaseSword("dest_visor",Tabs.den_denaxe).setCreativeTab(Tabs.tabryuki);
	public static Item dest_claws = new ItemBaseSword("dest_claws",Tabs.den_denro).setMaxStackSize(1).setCreativeTab(Tabs.tabryuki);

	public static Item gazelle_visor = new Item_ore("gazelle_visor").setCreativeTab(Tabs.tabryuki);

	public static Item gold_visor = new ItemBaseSword("gold_visor",Tabs.den_denro).setCreativeTab(Tabs.tabryuki);
	public static Item gold_sabers = new ItemBaseSword("gold_sabers",Tabs.den_denso).setMaxStackSize(1).setCreativeTab(Tabs.tabryuki);
	public static Item gold_shield = new ItemBaseShield("gold_shield").setCreativeTab(Tabs.tabryuki);

	public static Item wing_slasher = new ItemBaseSword("wing_slasher",Tabs.den_denso).setMaxStackSize(1).setCreativeTab(Tabs.tabryuki);
	public static Item wing_shield = new ItemBaseShield("wing_shield").setCreativeTab(Tabs.tabryuki);

	public static Item dark_drag_visor = new Item_ore("dark_drag_visor").setCreativeTab(Tabs.tabryuki);
	public static Item drag_saber_ryuga = new ItemBaseSword("drag_saber_ryuga",Tabs.den_denso).setMaxStackSize(1).setCreativeTab(Tabs.tabryuki);
	public static Item ryuga_drag_claw = new ItemBaseSword("ryuga_drag_claw",Tabs.den_denro).setMaxStackSize(1).setCreativeTab(Tabs.tabryuki);
	public static Item ryuga_drag_shield = new ItemBaseShield("ryuga_drag_shield").setCreativeTab(Tabs.tabryuki);

	public static Item blanc_visor = new ItemBaseSword("blanc_visor",ToolMaterial.DIAMOND).setMaxStackSize(1).setCreativeTab(Tabs.tabryuki);

	public static Item bio_visor = new Item_ore("bio_visor").setCreativeTab(Tabs.tabryuki);

	public static Item abyss_visor = new Item_ore("abyss_visor").setCreativeTab(Tabs.tabryuki);
	public static Item abyss_saber = new ItemBaseSword("abyss_saber",Tabs.den_denso).setMaxStackSize(1).setCreativeTab(Tabs.tabryuki);
	public static Item abyssmash = new ItemBaseSword("abyssmash",Tabs.den_denro).setMaxStackSize(1).setCreativeTab(Tabs.tabryuki);

	public static Item slash_visor = new Item_ore("slash_visor").setCreativeTab(Tabs.tabryuki);
	public static Item alternative_sword = new ItemBaseSword("alternative_sword",Tabs.den_denso).setMaxStackSize(1).setCreativeTab(Tabs.tabryuki);


	public static Item ryukihead = new item_ryukiarmor("ryukihead",ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.HEAD).setMaxStackSize(1).setCreativeTab(Tabs.tabryuki);
	public static Item ryukitroso = new item_ryukiarmor2("ryukitroso",ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.CHEST).setMaxStackSize(1).setCreativeTab(Tabs.tabryuki);
	public static Item ryukilegs = new item_ryukiarmor2("ryukilegs",ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.LEGS).setMaxStackSize(1).setCreativeTab(Tabs.tabryuki);

	public static Item v_buckle_ryuki = new item_ryukidriver("v_buckle_ryuki",ArmorMaterial.DIAMOND, 4, "ryuki").setMaxStackSize(1).setCreativeTab(Tabs.tabryuki);
	public static Item v_buckle = new Item_ore("v_buckle");
	public static Item v_buckle_ryuki_survive = new Item_ore("v_buckle_ryuki_survive");
	public static Item v_buckle_knight = new item_ryukidriver("v_buckle_knight",ArmorMaterial.DIAMOND, 4, "knight").setMaxStackSize(1).setCreativeTab(Tabs.tabryuki);
	public static Item v_buckle_knight_survive = new Item_ore("v_buckle_knight_survive");
	public static Item v_buckle_scissors = new item_ryukidriver("v_buckle_scissors",ArmorMaterial.DIAMOND, 4, "scissors").setMaxStackSize(1).setCreativeTab(Tabs.tabryuki);

	public static Item v_buckle_zolda = new item_ryukidriver("v_buckle_zolda",ArmorMaterial.DIAMOND, 4, "zolda").setMaxStackSize(1).setCreativeTab(Tabs.tabryuki);
	public static Item v_buckle_raia = new item_ryukidriver("v_buckle_raia",ArmorMaterial.DIAMOND, 4, "raia").setMaxStackSize(1).setCreativeTab(Tabs.tabryuki);
	public static Item v_buckle_gai = new item_ryukidriver("v_buckle_gai",ArmorMaterial.DIAMOND, 4, "gai").setMaxStackSize(1).setCreativeTab(Tabs.tabryuki);
	public static Item v_buckle_ouja = new item_ryukidriver("v_buckle_ouja",ArmorMaterial.DIAMOND, 4, "ouja").setMaxStackSize(1).setCreativeTab(Tabs.tabryuki);
	public static Item v_buckle_tiger = new item_ryukidriver("v_buckle_tiger",ArmorMaterial.DIAMOND, 4, "tiger").setMaxStackSize(1).setCreativeTab(Tabs.tabryuki);
	public static Item v_buckle_imperer = new item_ryukidriver("v_buckle_imperer",ArmorMaterial.DIAMOND, 4, "imperer").setMaxStackSize(1).setCreativeTab(Tabs.tabryuki);
	public static Item v_buckle_odin = new item_ryukidriver("v_buckle_odin",ArmorMaterial.DIAMOND, 4, "odin").setMaxStackSize(1).setCreativeTab(Tabs.tabryuki);
	public static Item v_buckle_femme = new item_ryukidriver("v_buckle_femme",ArmorMaterial.DIAMOND, 4, "femme").setMaxStackSize(1).setCreativeTab(Tabs.tabryuki);
	public static Item v_buckle_verde = new item_ryukidriver("v_buckle_verde",ArmorMaterial.DIAMOND, 4, "verde").setMaxStackSize(1).setCreativeTab(Tabs.tabryuki);

	public static Item v_buckle_ryuga_survive = new Item_ore("v_buckle_ryuga_survive");
	public static Item v_buckle_ryuga = new item_ryukidriver("v_buckle_ryuga",ArmorMaterial.DIAMOND, 4, "ryuga").setMaxStackSize(1).setCreativeTab(Tabs.tabryuki);
	public static Item v_buckle_abyss = new item_ryukidriver("v_buckle_abyss",ArmorMaterial.DIAMOND, 4,"abyss").setMaxStackSize(1).setCreativeTab(Tabs.tabryuki);

	public static Item alternativebelt = new item_ryukidriver("alternativebelt",ArmorMaterial.DIAMOND, 4, "alternative").setMaxStackSize(1).setCreativeTab(Tabs.tabryuki);
	public static Item alternativezerobelt = new item_ryukidriver("alternativezerobelt",ArmorMaterial.DIAMOND, 4, "alternativezero").setMaxStackSize(1).setCreativeTab(Tabs.tabryuki);


	public static Item dragreder_advent = new Item_advent_cards("dragreder_advent",0,"1").setCreativeTab(Tabs.tabryuki);
	public static Item darkwing_advent = new Item_advent_cards("darkwing_advent",0,"2").setCreativeTab(Tabs.tabryuki);
	public static Item volcancer_advent = new Item_ore("volcancer_advent").setCreativeTab(Tabs.tabryuki);
	public static Item magnugiga_advent = new Item_ore("magnugiga_advent").setCreativeTab(Tabs.tabryuki);
	public static Item evildiver_advent = new Item_ore("evildiver_advent").setCreativeTab(Tabs.tabryuki);
	public static Item metalgelas_advent = new Item_ore("metalgelas_advent").setCreativeTab(Tabs.tabryuki);
	public static Item venosnaker_advent = new Item_ore("venosnaker_advent").setCreativeTab(Tabs.tabryuki);
	public static Item destwilder_advent = new Item_ore("destwilder_advent").setCreativeTab(Tabs.tabryuki);
	public static Item gigazelle_advent = new Item_ore("gigazelle_advent").setCreativeTab(Tabs.tabryuki);
	public static Item biogreeza_advent = new Item_ore("biogreeza_advent").setCreativeTab(Tabs.tabryuki);
	public static Item blancwing_advent = new Item_ore("blancwing_advent").setCreativeTab(Tabs.tabryuki);

	public static Item goldphoenix_advent = new Item_ore("goldphoenix_advent").setCreativeTab(Tabs.tabryuki);
	public static Item abysslasher_advent = new Item_ore("abysslasher_advent").setCreativeTab(Tabs.tabryuki);
	public static Item psycorogue_advent = new Item_ore("psycorogue_advent").setCreativeTab(Tabs.tabryuki);

	public static Item survive_shippu_advent= new Item_advent_cards("survive_shippu_advent",1,"2").setCreativeTab(Tabs.tabryuki);
	public static Item survive_mugen_advent = new Item_ore("survive_mugen_advent").setCreativeTab(Tabs.tabryuki);
	public static Item survive_advent = new Item_advent_cards("survive_advent",1,"1").setCreativeTab(Tabs.tabryuki);


	public static Item blank_sword_vent = new Item_vent("blank_sword_vent","ryuki",ride_saber,2,drag_visor).setCreativeTab(Tabs.tabryuki);
	public static Item drag_saber_vent = new Item_vent("drag_saber_vent","ryuki",drag_saber,0,drag_visor).setCreativeTab(Tabs.tabryuki);
	public static Item wing_lancer_vent = new Item_vent("wing_lancer_vent","knight",wing_lancer,0,dark_visor).setCreativeTab(Tabs.tabryuki);
	public static Item veno_saber_vent = new Item_vent("veno_saber_vent","ouja",veno_saber,0,veno_visor).setCreativeTab(Tabs.tabryuki);
	public static Item wing_slasher_vent = new Item_vent("wing_slasher_vent","femme",wing_slasher,0,blanc_visor).setCreativeTab(Tabs.tabryuki);
	public static Item ryuga_drag_saber_vent = new Item_vent("ryuga_drag_saber_vent","ryuga",drag_saber_ryuga,0,dark_drag_visor).setCreativeTab(Tabs.tabryuki);
	public static Item gold_sabers_vent = new Item_vent("gold_sabers_vent","odin",gold_sabers,0,gold_visor).setCreativeTab(Tabs.tabryuki);
	public static Item drag_visor_zwei_sword_mode_vent = new Item_vent("drag_visor_zwei_sword_mode_vent","ryuki",drag_visor_zwei,1,drag_visor_zwei).setCreativeTab(Tabs.tabryuki);
	public static Item dark_blade_vent = new Item_vent("dark_blade_vent","knight",dark_blade,1,dark_visor).setCreativeTab(Tabs.tabryuki);

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

	//faiz
	public static Item faiz_edge = new ItemBaseSword("faiz_edge",Tabs.faiz_edge).setMaxStackSize(1).setCreativeTab(Tabs.tabfaiz);

	public static Item faiz_blaster = new Item_sword_gun("faiz_blaster",Tabs.faiz_blaster,RiderItems.energy).setMaxStackSize(1).setCreativeTab(Tabs.tabfaiz);		
	public static Item orga_stlanzer = new ItemBaseSword("orga_stlanzer",Tabs.orga_stlanzer).setMaxStackSize(1).setCreativeTab(Tabs.tabfaiz);
	public static Item axel_ray_gun = new Item_sword_gun("axel_ray_gun",Tabs.axel_ray_gun,RiderItems.energy).setMaxStackSize(1).setCreativeTab(Tabs.tabfaiz);

	public static Item kaixa_blaygun = new Item_sword_gun("kaixa_blaygun",Tabs.kaixa_blaygun,RiderItems.energy).setMaxStackSize(1).setCreativeTab(Tabs.tabfaiz);

	public static Item deltablaster = new Item_gun("deltablaster",Tabs.deltablaster,RiderItems.energy).setMaxStackSize(1).setCreativeTab(Tabs.tabfaiz);

	public static Item psyga_tonfa_edge = new ItemBaseSword("psyga_tonfa_edge",Tabs.psyga_tonfa_edge).setMaxStackSize(1).setCreativeTab(Tabs.tabfaiz);

	public static Item faizhead = new item_faizarmor("faizhead",ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.HEAD).setMaxStackSize(1).setCreativeTab(Tabs.tabfaiz);
	public static Item faiztroso = new item_faizarmor2("faiztroso",ArmorMaterial.DIAMOND, 4,  EntityEquipmentSlot.CHEST).setMaxStackSize(1).setCreativeTab(Tabs.tabfaiz);
	public static Item faizlegs = new item_faizarmor2("faizlegs",ArmorMaterial.DIAMOND, 4,  EntityEquipmentSlot.LEGS).setMaxStackSize(1).setCreativeTab(Tabs.tabfaiz);

	public static Item faizdriver = new item_faizdriver("faizdriver",ArmorMaterial.DIAMOND, 4,"faiz").setMaxStackSize(1).setCreativeTab(Tabs.tabfaiz);
	public static Item kaixadriver = new item_faizdriver("kaixadriver",ArmorMaterial.DIAMOND, 4,"kaixa").setMaxStackSize(1).setCreativeTab(Tabs.tabfaiz);
	public static Item deltadriver = new item_faizdriver("deltadriver",ArmorMaterial.DIAMOND, 4,"delta").setMaxStackSize(1).setCreativeTab(Tabs.tabfaiz);
	public static Item psygadriver = new item_faizdriver("psygadriver",ArmorMaterial.DIAMOND, 4, "psyga").setMaxStackSize(1).setCreativeTab(Tabs.tabfaiz);
	public static Item orgadriver = new item_faizdriver("orgadriver",ArmorMaterial.DIAMOND, 4, "orga").setMaxStackSize(1).setCreativeTab(Tabs.tabfaiz);
	public static Item smartbulke = new item_faizdriver("smartbulke",ArmorMaterial.DIAMOND, 4, "riotrooper").setMaxStackSize(1).setCreativeTab(Tabs.tabfaiz);


	public static Item faiz_mission_memory = new Item_mission_memory("faiz_mission_memory",0).setCreativeTab(Tabs.tabfaiz);
	public static Item faiz_axel_mission_memory = new Item_mission_memory("faiz_axel_mission_memory",1).setCreativeTab(Tabs.tabfaiz);
	public static Item faiz_blaster_mission_memory = new Item_mission_memory("faiz_blaster_mission_memory",2).setCreativeTab(Tabs.tabfaiz);

	public static Item kaixa_mission_memory = new Item_ore("kaixa_mission_memory").setCreativeTab(Tabs.tabfaiz);
	public static Item delta_mission_memory = new Item_ore("delta_mission_memory").setCreativeTab(Tabs.tabfaiz);
	public static Item psyga_mission_memory = new Item_ore("psyga_mission_memory").setCreativeTab(Tabs.tabfaiz);
	public static Item orga_mission_memory = new Item_ore("orga_mission_memory").setCreativeTab(Tabs.tabfaiz);

	//blade
	public static Item blayrouzer = new ItemBaseSword("blayrouzer",ToolMaterial.DIAMOND).setMaxStackSize(1).setCreativeTab(Tabs.tabblade);
	public static Item kingrouzer = new ItemBaseSword("kingrouzer",ToolMaterial.DIAMOND).setMaxStackSize(1).setCreativeTab(Tabs.tabblade);

	
	public static Item leanglerouzer = new ItemBaseSword("leanglerouzer",Tabs.leanglerouzer).setMaxStackSize(1).setCreativeTab(Tabs.tabblade);
	public static Item garrenrouzer = new Item_gun("garrenrouzer",Tabs.den_dengu, RiderItems.energy).setMaxStackSize(1).setCreativeTab(Tabs.tabblade);

	public static Item chalice_arrow = new Item_gun("chalice_arrow",ToolMaterial.DIAMOND,RiderItems.energy).setMaxStackSize(1).setCreativeTab(Tabs.tabblade);
	public static Item wild_slasher = new ItemBaseSword("wild_slasher",ToolMaterial.DIAMOND).setMaxStackSize(1).setCreativeTab(Tabs.tabblade);
	public static Item wild_chalice_arrow = new Item_gun("wild_chalice_arrow",ToolMaterial.DIAMOND,RiderItems.energy).setMaxStackSize(1).setCreativeTab(Tabs.tabblade);

	public static Item bladehead = new item_bladearmor("bladehead",ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.HEAD).setMaxStackSize(1).setCreativeTab(Tabs.tabblade);
	public static Item bladetroso = new item_bladearmor2("bladetroso",ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.CHEST).setMaxStackSize(1).setCreativeTab(Tabs.tabblade);
	public static Item bladelegs = new item_bladearmor2("bladelegs",ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.LEGS).setMaxStackSize(1).setCreativeTab(Tabs.tabblade);

	public static Item bladedriver = new item_bladedriver("bladedriver",ArmorMaterial.DIAMOND, 4,"blade").setMaxStackSize(1).setCreativeTab(Tabs.tabblade);
	public static Item garrendriver = new item_bladedriver("garrendriver",ArmorMaterial.DIAMOND, 4,"garren").setMaxStackSize(1).setCreativeTab(Tabs.tabblade);
	public static Item leangle_belt = new item_bladedriver("leangle_belt",ArmorMaterial.DIAMOND, 4,"leangle").setMaxStackSize(1).setCreativeTab(Tabs.tabblade);
	public static Item chalicerouzer = new item_bladedriver("chalicerouzer",ArmorMaterial.DIAMOND, 4,"chalice").setMaxStackSize(1).setCreativeTab(Tabs.tabblade);
	public static Item glaive_buckle = new item_bladedriver("glaive_buckle",ArmorMaterial.DIAMOND, 4,"glaive").setMaxStackSize(1).setCreativeTab(Tabs.tabblade);
	public static Item larc_buckle = new item_bladedriver("larc_buckle",ArmorMaterial.DIAMOND, 4,"larc").setMaxStackSize(1).setCreativeTab(Tabs.tabblade);
	public static Item lance_buckle = new item_bladedriver("lance_buckle",ArmorMaterial.DIAMOND, 4,"lance").setMaxStackSize(1).setCreativeTab(Tabs.tabblade);

	public static Item rouze_absorber = new Item_ore("rouze_absorber").setCreativeTab(Tabs.tabblade);
	public static Item garren_absorber = new Item_ore("garren_absorber").setCreativeTab(Tabs.tabblade);

	public static Item blade_jack_wings = new Item_ore("blade_jack_wings");
	public static Item garren_jack_wings = new Item_ore("garren_jack_wings");

	public static Item changebeetle = new ItemRouze_Cards("changebeetle",0,"blade").setCreativeTab(Tabs.tabblade);
	public static Item change_stag = new ItemRouze_Cards("change_stag",0,"garren").setCreativeTab(Tabs.tabblade);
	public static Item change_spider = new ItemRouze_Cards("change_spider",0,"leangle").setCreativeTab(Tabs.tabblade);
	public static Item change_mantis = new ItemRouze_Cards("change_mantis",0,"chalice").setCreativeTab(Tabs.tabblade);	
	public static Item changekerberoslance = new Item_ore("changekerberoslance").setCreativeTab(Tabs.tabblade);
	public static Item changekerberoslarc = new Item_ore("changekerberoslarc").setCreativeTab(Tabs.tabblade);
	public static Item fusion_eagle = new ItemRouze_Cards("fusion_eagle",1,"blade").setCreativeTab(Tabs.tabblade);
	public static Item fusion_peacock = new ItemRouze_Cards("fusion_peacock",1,"garren").setCreativeTab(Tabs.tabblade);
	public static Item fusion_elephant = new ItemRouze_Cards("fusion_elephant",1,"leangle").setCreativeTab(Tabs.tabblade);
	public static Item absorb_capricorn = new Item_ore("absorb_capricorn").setCreativeTab(Tabs.tabblade);
	public static Item absorb_serpent = new Item_ore("absorb_serpent").setCreativeTab(Tabs.tabblade);
	public static Item absorb_tiger = new Item_ore("absorb_tiger").setCreativeTab(Tabs.tabblade);
	public static Item evolution_caucasus = new ItemRouze_Cards("evolution_caucasus",2,"blade").setCreativeTab(Tabs.tabblade);
	public static Item evolution_giraffa = new ItemRouze_Cards("evolution_giraffa",2,"garren").setCreativeTab(Tabs.tabblade);
	public static Item evolution_paradoxa = new ItemRouze_Cards("evolution_paradoxa",3,"chalice").setCreativeTab(Tabs.tabblade);

	//hibiki
	public static Item ongekibo_rekka = new ItemBaseSword("ongekibo_rekka",Tabs.ongekibo).setMaxStackSize(1).setCreativeTab(Tabs.tabhibiki);

	public static Item unfinished_armed_saber = new Item_ore("unfinished_armed_saber").setCreativeTab(Tabs.tabhibiki);
	public static Item armed_saber = new Itemarmed_saber("armed_saber",Tabs.armedsaber).setMaxStackSize(1).setCreativeTab(Tabs.tabhibiki);
	public static Item ongekibo_yamase = new ItemBaseSword("ongekibo_yamase",Tabs.ongekibo).setMaxStackSize(1).setCreativeTab(Tabs.tabhibiki);
	public static Item ongekibo_rakurai = new ItemBaseSword("ongekibo_rakurai",Tabs.ongekibo).setMaxStackSize(1).setCreativeTab(Tabs.tabhibiki);
	public static Item ongekibo_shakubyoushi = new ItemBaseSword("ongekibo_shakubyoushi",Tabs.ongekibo).setMaxStackSize(1).setCreativeTab(Tabs.tabhibiki);
	public static Item ongekibo_nachiguro = new ItemBaseSword("ongekibo_nachiguro",Tabs.ongekibo).setMaxStackSize(1).setCreativeTab(Tabs.tabhibiki);
	public static Item ongekibo_rokushou = new ItemBaseSword("ongekibo_rokushou",Tabs.ongekibo).setMaxStackSize(1).setCreativeTab(Tabs.tabhibiki);
	public static Item ongekibo_gouriki = new ItemBaseSword("ongekibo_gouriki",Tabs.ongekibo).setMaxStackSize(1).setCreativeTab(Tabs.tabhibiki);
	public static Item ongekibo_ressui = new ItemBaseSword("ongekibo_ressui",Tabs.ongekibo).setMaxStackSize(1).setCreativeTab(Tabs.tabhibiki);

	public static Item ongekikan_reppuu = new Item_gun("ongekikan_reppuu",Tabs.den_dengu,RiderItems.energy).setMaxStackSize(1).setCreativeTab(Tabs.tabhibiki);

	public static Item ongekigen_retsurai = new ItemBaseSword("ongekigen_retsurai",Tabs.den_denaxe).setMaxStackSize(1).setCreativeTab(Tabs.tabhibiki);
	public static Item ongeki_shingen_retsuzan = new ItemBaseSword("ongeki_shingen_retsuzan",Tabs.den_denaxe).setMaxStackSize(1).setCreativeTab(Tabs.tabhibiki);
	public static Item ongekigen_enma = new ItemBaseSword("ongekigen_enma",Tabs.den_denaxe).setMaxStackSize(1).setCreativeTab(Tabs.tabhibiki);
	public static Item ongekigen_togenkyo = new ItemBaseSword("ongekigen_togenkyo",Tabs.den_denaxe).setMaxStackSize(1).setCreativeTab(Tabs.tabhibiki);

	public static Item echo_sword_onsaken = new ItemBaseSword("echo_sword_onsaken",Tabs.den_denso).setMaxStackSize(1).setCreativeTab(Tabs.tabhibiki);
	public static Item ongekikanabo_retto = new ItemBaseSword("ongekikanabo_retto",Tabs.den_denaxe).setMaxStackSize(1).setCreativeTab(Tabs.tabhibiki);
	public static Item ongekisankaku_ressetsu = new ItemBaseSword("ongekisankaku_ressetsu",Tabs.den_denro).setMaxStackSize(1).setCreativeTab(Tabs.tabhibiki);
	public static Item ongeki_shincho_retsuban = new ItemBaseSword("ongeki_shincho_retsuban",Tabs.den_denro).setMaxStackSize(1).setCreativeTab(Tabs.tabhibiki);

	public static Item hibikihead = new item_hibikiarmor("hibikihead",ArmorMaterial.DIAMOND, 4,EntityEquipmentSlot.HEAD).setMaxStackSize(1).setCreativeTab(Tabs.tabhibiki);
	public static Item hibikitroso = new item_hibikiarmor2("hibikitroso",ArmorMaterial.DIAMOND, 4,EntityEquipmentSlot.CHEST).setMaxStackSize(1).setCreativeTab(Tabs.tabhibiki);
	public static Item hibikilegs = new item_hibikiarmor2("hibikilegs",ArmorMaterial.DIAMOND, 4,EntityEquipmentSlot.LEGS).setMaxStackSize(1).setCreativeTab(Tabs.tabhibiki);

	public static Item hibikidriver = new item_hibikidriver("hibikidriver",ArmorMaterial.DIAMOND, 4,"hibiki").setMaxStackSize(1).setCreativeTab(Tabs.tabhibiki);	
	public static Item ibukidriver = new item_hibikidriver("ibukidriver",ArmorMaterial.DIAMOND, 4,"ibuki").setMaxStackSize(1).setCreativeTab(Tabs.tabhibiki);
	public static Item todorokidriver = new item_hibikidriver("todorokidriver",ArmorMaterial.DIAMOND, 4,"todoroki").setMaxStackSize(1).setCreativeTab(Tabs.tabhibiki);
	public static Item zankidriver = new item_hibikidriver("zankidriver",ArmorMaterial.DIAMOND, 4,"zanki").setMaxStackSize(1).setCreativeTab(Tabs.tabhibiki);
	public static Item eikidriver = new item_hibikidriver("eikidriver",ArmorMaterial.DIAMOND, 4,"eiki").setMaxStackSize(1).setCreativeTab(Tabs.tabhibiki);
	public static Item dankidriver = new item_hibikidriver("dankidriver",ArmorMaterial.DIAMOND, 4,"danki").setMaxStackSize(1).setCreativeTab(Tabs.tabhibiki);
	public static Item sabakidriver = new item_hibikidriver("sabakidriver",ArmorMaterial.DIAMOND, 4,"sabaki").setMaxStackSize(1).setCreativeTab(Tabs.tabhibiki);	
	public static Item shukidriver = new item_hibikidriver("shukidriver",ArmorMaterial.DIAMOND, 4,"shuki").setMaxStackSize(1).setCreativeTab(Tabs.tabhibiki);	
	public static Item goukidriver = new item_hibikidriver("goukidriver",ArmorMaterial.DIAMOND, 4,"gouki").setMaxStackSize(1).setCreativeTab(Tabs.tabhibiki);	
	public static Item tokidriver = new item_hibikidriver("tokidriver",ArmorMaterial.DIAMOND, 4,"toki").setMaxStackSize(1).setCreativeTab(Tabs.tabhibiki);	
	public static Item shoukidriver = new item_hibikidriver("shoukidriver",ArmorMaterial.DIAMOND, 4,"shouki").setMaxStackSize(1).setCreativeTab(Tabs.tabhibiki);	
	public static Item bankidriver = new item_hibikidriver("bankidriver",ArmorMaterial.DIAMOND, 4,"banki").setMaxStackSize(1).setCreativeTab(Tabs.tabhibiki);
	public static Item amakidriver = new item_hibikidriver("amakidriver",ArmorMaterial.DIAMOND, 4,"amaki").setMaxStackSize(1).setCreativeTab(Tabs.tabhibiki);	
	public static Item kyosukedriver = new item_hibikidriver("kyosukedriver",ArmorMaterial.DIAMOND, 4,"kyosuke").setMaxStackSize(1).setCreativeTab(Tabs.tabhibiki);
	public static Item kabukidriver = new item_hibikidriver("kabukidriver",ArmorMaterial.DIAMOND, 4,"kabuki").setMaxStackSize(1).setCreativeTab(Tabs.tabhibiki);
	public static Item toukidriver = new item_hibikidriver("toukidriver",ArmorMaterial.DIAMOND, 4,"touki").setMaxStackSize(1).setCreativeTab(Tabs.tabhibiki);
	public static Item kiramekidriver = new item_hibikidriver("kiramekidriver",ArmorMaterial.DIAMOND, 4,"kirameki").setMaxStackSize(1).setCreativeTab(Tabs.tabhibiki);
	public static Item nishikidriver = new item_hibikidriver("nishikidriver",ArmorMaterial.DIAMOND, 4,"nishiki").setMaxStackSize(1).setCreativeTab(Tabs.tabhibiki);
	public static Item habatakidriver = new item_hibikidriver("habatakidriver",ArmorMaterial.DIAMOND, 4,"habataki").setMaxStackSize(1).setCreativeTab(Tabs.tabhibiki);
	public static Item fubukidriver = new item_hibikidriver("fubukidriver",ArmorMaterial.DIAMOND, 4,"fubuki").setMaxStackSize(1).setCreativeTab(Tabs.tabhibiki);

	public static Item henshin_onsa = new Itemhibiki_stone("henshin_onsa",0).setCreativeTab(Tabs.tabhibiki);
	public static Item henshin_onsa_kurenai = new Itemhibiki_stone("henshin_onsa_kurenai",1).setCreativeTab(Tabs.tabhibiki);

	public static Item henshin_onsa_danki = new Item_ore("henshin_onsa_danki").setCreativeTab(Tabs.tabhibiki);
	public static Item henshin_onsa_eiki = new Item_ore("henshin_onsa_eiki").setCreativeTab(Tabs.tabhibiki);
	public static Item henshin_onsa_gouki = new Item_ore("henshin_onsa_gouki").setCreativeTab(Tabs.tabhibiki);
	public static Item henshin_onsa_kyoki = new Item_ore("henshin_onsa_kyoki").setCreativeTab(Tabs.tabhibiki);

	public static Item henshin_onsa_kabuki = new Item_ore("henshin_onsa_kabuki").setCreativeTab(Tabs.tabhibiki);
	public static Item henshin_onsa_touki = new Item_ore("henshin_onsa_touki").setCreativeTab(Tabs.tabhibiki);
	public static Item henshin_onsa_habataki = new Item_ore("henshin_onsa_habataki").setCreativeTab(Tabs.tabhibiki);
	public static Item henshin_onsa_kirameki = new Item_ore("henshin_onsa_kirameki").setCreativeTab(Tabs.tabhibiki);
	public static Item henshin_onsa_nishiki = new Item_ore("henshin_onsa_nishiki").setCreativeTab(Tabs.tabhibiki);

	public static Item henshin_onibue_ibuki = new Item_ore("henshin_onibue_ibuki").setCreativeTab(Tabs.tabhibiki);
	public static Item henshin_onibue_toki = new Item_ore("henshin_onibue_toki").setCreativeTab(Tabs.tabhibiki);
	public static Item henshin_onibue_shouki = new Item_ore("henshin_onibue_shouki").setCreativeTab(Tabs.tabhibiki);
	public static Item henshin_onibue_amaki = new Item_ore("henshin_onibue_amaki").setCreativeTab(Tabs.tabhibiki);
	public static Item henshin_onibue_fubuki = new Item_ore("henshin_onibue_fubuki").setCreativeTab(Tabs.tabhibiki);

	public static Item henshin_kigen_todoroki = new Item_ore("henshin_kigen_todoroki").setCreativeTab(Tabs.tabhibiki);
	public static Item henshin_kigen_zanki = new Item_ore("henshin_kigen_zanki").setCreativeTab(Tabs.tabhibiki);
	public static Item henshin_kigen_shuki = new Item_ore("henshin_kigen_shuki").setCreativeTab(Tabs.tabhibiki);
	public static Item henshin_kigen_banki = new Item_ore("henshin_kigen_banki").setCreativeTab(Tabs.tabhibiki);
	public static Item henshin_kigen_sabaki = new Item_ore("henshin_kigen_sabaki").setCreativeTab(Tabs.tabhibiki);

	//kabuto
	public static Item kabuto_kunai = new Item_sword_gun("kabuto_kunai",Tabs.den_denaxe,RiderItems.energy).setMaxStackSize(1).setCreativeTab(Tabs.tabkabuto);
	public static Item kabuto_kunai_kunai = new ItemBaseSword("kabuto_kunai_kunai",Tabs.den_denso).setMaxStackSize(1).setCreativeTab(Tabs.tabkabuto);
	public static Item zect_mizer = new Item_fireball_gun("zect_mizer",ToolMaterial.WOOD,RiderItems.energy).setMaxStackSize(1).setCreativeTab(Tabs.tabkabuto);
	public static Item perfect_zecter = new ItemBaseSword("perfect_zecter",Tabs.denkamen_sword).setMaxStackSize(1).setCreativeTab(Tabs.tabkabuto);

	public static Item drake_grip = new Item_gun("drake_grip",Tabs.den_dengu,RiderItems.energy).setMaxStackSize(1).setCreativeTab(Tabs.tabkabuto);

	public static Item sasword_yaiver = new ItemBaseSword("sasword_yaiver",Tabs.den_denso).setMaxStackSize(1).setCreativeTab(Tabs.tabkabuto);

	public static Item gatack_double_calibur = new ItemBaseSword("gatack_double_calibur",Tabs.den_denso).setMaxStackSize(1).setCreativeTab(Tabs.tabkabuto);
	public static Item gatack_double_calibur_minus = new ItemBaseSword("gatack_double_calibur_minus",Tabs.den_denso).setMaxStackSize(1).setCreativeTab(Tabs.tabkabuto);
	public static Item gatack_double_calibur_twin = new ItemBaseSword("gatack_double_calibur_twin",Tabs.den_denaxe).setMaxStackSize(1).setCreativeTab(Tabs.tabkabuto);

	public static Item zect_kunai = new Item_sword_gun("zect_kunai",Tabs.den_denaxe,RiderItems.energy).setMaxStackSize(1).setCreativeTab(Tabs.tabkabuto);
	public static Item zect_kunai_kunai = new ItemBaseSword("zect_kunai_kunai",Tabs.den_denso).setMaxStackSize(1).setCreativeTab(Tabs.tabkabuto);


	public static Item kabutohead = new item_kabutoarmor("kabutohead",ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.HEAD).setMaxStackSize(1).setCreativeTab(Tabs.tabkabuto);
	public static Item kabutotroso = new item_kabutoarmor2("kabutotroso",ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.CHEST).setMaxStackSize(1).setCreativeTab(Tabs.tabkabuto);
	public static Item kabutolegs = new item_kabutoarmor2("kabutolegs",ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.LEGS).setMaxStackSize(1).setCreativeTab(Tabs.tabkabuto);

	public static Item kabuto_rider_belt_cast = new Item_ore("kabuto_rider_belt_cast");
	public static Item kabuto_rider_belt = new item_kabutodriver("kabuto_rider_belt",ArmorMaterial.DIAMOND, 4, "kabuto",kabuto_rider_belt_cast).setMaxStackSize(1).setCreativeTab(Tabs.tabkabuto);

	public static Item gatack_rider_belt_cast = new Item_ore("gatack_rider_belt_cast");
	public static Item gatack_rider_belt = new item_kabutodriver("gatack_rider_belt",ArmorMaterial.DIAMOND, 4,"gatack",gatack_rider_belt_cast).setMaxStackSize(1).setCreativeTab(Tabs.tabkabuto);

	public static Item thebee_rider_belt_cast = new Item_ore("thebee_rider_belt_cast");
	public static Item thebee_rider_belt = new item_kabutodriver("thebee_rider_belt",ArmorMaterial.DIAMOND, 4, "thebee",thebee_rider_belt_cast).setMaxStackSize(1).setUnlocalizedName("thebee_rider_belt").setCreativeTab(Tabs.tabkabuto);

	public static Item drake_rider_belt_cast = new Item_ore("drake_rider_belt_cast");
	public static Item drake_rider_belt = new item_kabutodriver("drake_rider_belt",ArmorMaterial.DIAMOND, 4, "drake",drake_rider_belt_cast).setMaxStackSize(1).setCreativeTab(Tabs.tabkabuto);

	public static Item sasword_rider_belt_cast = new Item_ore("sasword_rider_belt_cast");
	public static Item sasword_rider_belt = new item_kabutodriver("sasword_rider_belt",ArmorMaterial.DIAMOND, 4, "sasword",sasword_rider_belt_cast).setMaxStackSize(1).setCreativeTab(Tabs.tabkabuto);

	public static Item kickhopper_rider_belt_cast = new Item_ore("kickhopper_rider_belt_cast");
	public static Item kickhopper_rider_belt = new item_kabutodriver("kickhopper_rider_belt",ArmorMaterial.DIAMOND, 4, "kickhopper",kickhopper_rider_belt_cast).setMaxStackSize(1).setCreativeTab(Tabs.tabkabuto);

	public static Item puchhopper_rider_belt_cast = new Item_ore("puchhopper_rider_belt_cast");
	public static Item puchhopper_rider_belt = new item_kabutodriver("puchhopper_rider_belt",ArmorMaterial.DIAMOND, 4,"puchhopper",puchhopper_rider_belt_cast).setMaxStackSize(1).setCreativeTab(Tabs.tabkabuto);

	public static Item dark_kabuto_rider_belt_cast = new Item_ore("dark_kabuto_rider_belt_cast");
	public static Item dark_kabuto_rider_belt = new item_kabutodriver("dark_kabuto_rider_belt",ArmorMaterial.DIAMOND, 4, "dark_kabuto",dark_kabuto_rider_belt_cast).setMaxStackSize(1).setCreativeTab(Tabs.tabkabuto);

	public static Item caucasus_rider_belt_cast = new Item_ore("caucasus_rider_belt_cast");
	public static Item caucasus_rider_belt = new item_kabutodriver("caucasus_rider_belt",ArmorMaterial.DIAMOND, 4, "caucasus",caucasus_rider_belt_cast).setMaxStackSize(1).setCreativeTab(Tabs.tabkabuto);

	public static Item hercus_rider_belt_cast = new Item_ore("hercus_rider_belt_cast");
	public static Item hercus_rider_belt = new item_kabutodriver("hercus_rider_belt",ArmorMaterial.DIAMOND, 4, "hercus",hercus_rider_belt_cast).setMaxStackSize(1).setCreativeTab(Tabs.tabkabuto);

	public static Item ketaros_rider_belt_cast = new Item_ore("ketaros_belt_cast");
	public static Item ketaros_rider_belt = new item_kabutodriver("ketaros_rider_belt",ArmorMaterial.DIAMOND, 4, "ketaros",ketaros_rider_belt_cast).setMaxStackSize(1).setCreativeTab(Tabs.tabkabuto);


	public static Item kabuto_zecter = new Item_zecter("kabuto_zecter","kabuto").setCreativeTab(Tabs.tabkabuto);
	public static Item hyper_zecter = new Item_zecter("hyper_zecter","hyper").setCreativeTab(Tabs.tabkabuto);

	public static Item thebee_zecter = new Item_zecter("thebee_zecter","thebee").setCreativeTab(Tabs.tabkabuto);		
	public static Item drake_zecter = new Item_zecter("drake_zecter","drake").setCreativeTab(Tabs.tabkabuto);		
	public static Item sasword_zecter = new Item_zecter("sasword_zecter","sasword").setCreativeTab(Tabs.tabkabuto);		
	public static Item gatack_zecter = new Item_zecter("gatack_zecter","gatack").setCreativeTab(Tabs.tabkabuto);
	public static Item kickhopper_zecter = new Item_ore("kickhopper_zecter").setCreativeTab(Tabs.tabkabuto);
	public static Item punchhopper_zecter = new Item_ore("punchhopper_zecter").setCreativeTab(Tabs.tabkabuto);
	public static Item dark_kabuto_zecter = new Item_zecter("dark_kabuto_zecter","dark_kabuto").setCreativeTab(Tabs.tabkabuto);
	public static Item caucasus_zecter = new Item_ore("caucasus_zecter").setCreativeTab(Tabs.tabkabuto);
	public static Item hercus_zecter = new Item_ore("hercus_zecter").setCreativeTab(Tabs.tabkabuto);
	public static Item ketaros_zecter = new Item_ore("ketaros_zecter").setCreativeTab(Tabs.tabkabuto);

	public static Item perfectthebee_zecter = new Item_ore("perfectthebee_zecter").setCreativeTab(Tabs.tabkabuto);
	public static Item perfectdrake_zecter = new Item_ore("perfectdrake_zecter").setCreativeTab(Tabs.tabkabuto);
	public static Item perfectsasword_zecter = new Item_ore("perfectsasword_zecter").setCreativeTab(Tabs.tabkabuto);

	public static Item clock_up_pad = new Item_clock_up_pad("clock_up_pad").setCreativeTab(Tabs.tabkabuto);

	//den_o
	public static Item den_denso = new ItemBaseSword("den_denso",Tabs.den_denso).setMaxStackSize(1).setCreativeTab(Tabs.tabden_o);
	public static Item den_denro = new ItemBaseSword("den_denro",Tabs.den_denro).setMaxStackSize(1).setCreativeTab(Tabs.tabden_o);
	public static Item den_denaxe = new ItemBaseSword("den_denaxe",Tabs.den_denaxe).setMaxStackSize(1).setCreativeTab(Tabs.tabden_o);
	public static Item den_dengu = new Item_gun("den_dengu",Tabs.den_dengu,RiderItems.energy).setMaxStackSize(1).setCreativeTab(Tabs.tabden_o);
	public static Item denkamen_sword = new Itemdenkamen_sword("denkamen_sword",Tabs.denkamen_sword).setMaxStackSize(1).setCreativeTab(Tabs.tabden_o);
	public static Item den_denhandaxe = new ItemBaseSword("den_denhandaxe",Tabs.den_denhandaxe).setMaxStackSize(1).setCreativeTab(Tabs.tabden_o);
	public static Item den_denboomerang = new ItemBaseSword("den_denboomerang",Tabs.den_denboomerang).setMaxStackSize(1).setCreativeTab(Tabs.tabden_o);
	public static Item den_denhijack = new ItemBaseSword("den_denhijack",Tabs.den_denhijack).setMaxStackSize(1).setCreativeTab(Tabs.tabden_o);
	public static Item momotaken = new ItemBaseSword("momotaken",Tabs.momotaken).setMaxStackSize(1).setCreativeTab(Tabs.tabden_o);
	public static Item uratazao = new ItemBaseSword("uratazao",Tabs.uratazao).setMaxStackSize(1).setCreativeTab(Tabs.tabden_o);
	public static Item kintaono = new ItemBaseSword("kintaono",Tabs.kintaono).setMaxStackSize(1).setCreativeTab(Tabs.tabden_o);
	public static Item gden_denjutte = new ItemBaseSword("gden_denjutte",Tabs.gden_denjutte).setMaxStackSize(1).setCreativeTab(Tabs.tabden_o);
	public static Item macheteddy = new ItemBaseSword("macheteddy",Tabs.macheteddy).setMaxStackSize(1).setCreativeTab(Tabs.tabden_o);
	public static Item gden_dengu = new Item_gun("gden_dengu",Tabs.gden_dengu,imaginsand).setMaxStackSize(1).setCreativeTab(Tabs.tabden_o);

	public static Item nega_den_gasher = new ItemBaseSword("nega_den_gasher",Tabs.nega_den_gasher).setMaxStackSize(1).setCreativeTab(Tabs.tabden_o);
	public static Item gaoh_gasher = new ItemBaseSword("gaoh_gasher",Tabs.gaoh_gasher).setMaxStackSize(1).setCreativeTab(Tabs.tabden_o);
	public static Item den_gasher_vega = new ItemBaseSword("den_gasher_vega",Tabs.den_gasher_vega).setMaxStackSize(1).setCreativeTab(Tabs.tabden_o);

	public static Item zerogasher = new ItemBaseSword("zerogasher",Tabs.zerogasher).setMaxStackSize(1).setCreativeTab(Tabs.tabden_o);

	public static Item den_ohead = new item_den_oarmor("den_ohead",ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.HEAD).setMaxStackSize(1).setCreativeTab(Tabs.tabden_o);
	public static Item den_otroso = new item_den_oarmor2("den_otroso",ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.CHEST).setMaxStackSize(1).setCreativeTab(Tabs.tabden_o);
	public static Item den_olegs = new item_den_oarmor2("den_olegs",ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.LEGS).setMaxStackSize(1).setCreativeTab(Tabs.tabden_o);

	public static Item den_odriver_bl = new Item_ore("den_odriver_bl");	
	public static Item den_odriverrod = new Item_ore("den_odriverrod");
	public static Item den_odriveraxe = new Item_ore("den_odriveraxe");
	public static Item den_odrivergun = new Item_ore("den_odrivergun");
	public static Item den_odriverwing = new Item_ore("den_odriverwing");
	public static Item den_obeltclimax = new Item_ore("den_obeltclimax");

	public static Item den_odriver = new item_den_odriver("den_odriver",ArmorMaterial.DIAMOND, 4).setMaxStackSize(1).setCreativeTab(Tabs.tabden_o);


	public static Item zeronosbelt_p = new Item_ore("zeronosbelt_p");	
	public static Item zeronosbelt_v = new Item_ore("zeronosbelt_v");
	public static Item zeronosbelt_z = new Item_ore("zeronosbelt_z");

	public static Item zeronosbelt = new item_den_odriver("zeronosbelt",ArmorMaterial.DIAMOND, 4).setMaxStackSize(1).setCreativeTab(Tabs.tabden_o);

	public static Item newden_obelt = new item_den_odriver("newden_obelt",ArmorMaterial.DIAMOND, 4).setMaxStackSize(1).setCreativeTab(Tabs.tabden_o);
	public static Item newden_obeltvega = new Item_ore("newden_obeltvega");
	public static Item newden_obeltbl = new Item_ore("newden_obeltbl");

	public static Item nega_den_odriver = new item_den_odriver("nega_den_odriver",ArmorMaterial.DIAMOND, 4).setMaxStackSize(1).setCreativeTab(Tabs.tabden_o);
	public static Item gaohbelt = new item_den_odriver("gaohbelt",ArmorMaterial.DIAMOND, 4).setMaxStackSize(1).setCreativeTab(Tabs.tabden_o);
	public static Item yuukibelt_skull = new item_den_odriver("yuukibelt_skull",ArmorMaterial.DIAMOND, 4).setMaxStackSize(1).setCreativeTab(Tabs.tabden_o);
	public static Item yuukibelt_hijack = new item_den_odriver("yuukibelt_hijack",ArmorMaterial.DIAMOND, 4).setMaxStackSize(1).setCreativeTab(Tabs.tabden_o);

	public static Item gden_odriver = new item_den_odriver("gden_odriver",ArmorMaterial.DIAMOND, 4).setMaxStackSize(1).setCreativeTab(Tabs.tabden_o);

	public static Item den_oriderpass = new Item_ore("den_oriderpass").setMaxStackSize(1).setCreativeTab(Tabs.tabden_o);
	public static Item den_o_master_pass = new Item_ore("den_o_master_pass").setMaxStackSize(1).setCreativeTab(Tabs.tabden_o);
	public static Item gden_oriderpass = new Item_ore("gden_oriderpass").setMaxStackSize(1).setCreativeTab(Tabs.tabden_o);

	public static Item rider_ticket = new Itemrider_ticket(0,0,"rider_ticket").setCreativeTab(Tabs.tabden_o);
	public static Item rider_ticket_sword = new Itemrider_ticket(1,0,"rider_ticket_sword").setCreativeTab(Tabs.tabden_o);
	public static Item rider_ticket_rod = new Itemrider_ticket(2,0,"rider_ticket_rod").setCreativeTab(Tabs.tabden_o);
	public static Item rider_ticket_ax = new Itemrider_ticket(3,0,"rider_ticket_ax").setCreativeTab(Tabs.tabden_o);
	public static Item rider_ticket_gun = new Itemrider_ticket(4,0,"rider_ticket_gun").setCreativeTab(Tabs.tabden_o);
	public static Item rider_ticket_wing = new Itemrider_ticket(5,0,"rider_ticket_wing").setCreativeTab(Tabs.tabden_o);
	public static Item rider_ticket_nega = new Itemrider_ticket(5,0,"rider_ticket_nega").setCreativeTab(Tabs.tabden_o);
	public static Item rider_ticket_yuuki = new Itemrider_ticket(5,0,"rider_ticket_yuuki").setCreativeTab(Tabs.tabden_o);
	public static Item rider_ticket_g = new Itemrider_ticket(5,0,"rider_ticket_g").setCreativeTab(Tabs.tabden_o);
	public static Item rider_ticket_gaoh = new Itemrider_ticket(5,0,"rider_ticket_gaoh").setCreativeTab(Tabs.tabden_o);
	public static Item ktaros = new Itemrider_ticket(6,0,"ktaros").setCreativeTab(Tabs.tabden_o);

	public static Item zeronos_plat_card = new Itemrider_ticket(0,1,"zeronos_plat_card").setCreativeTab(Tabs.tabden_o);
	public static Item zeronos_altair_card = new Itemrider_ticket(1,1,"zeronos_altair_card").setCreativeTab(Tabs.tabden_o);
	public static Item zeronos_vega_card = new Itemrider_ticket(2,1,"zeronos_vega_card").setCreativeTab(Tabs.tabden_o);
	public static Item zeronos_zero_card = new Itemrider_ticket(3,1,"zeronos_zero_card").setCreativeTab(Tabs.tabden_o);

	//kiva	
	public static Item garulu_saber = new ItemBaseSword("garulu_saber",Tabs.garulu_saber).setMaxStackSize(1).setCreativeTab(Tabs.tabkiva);
	public static Item basshaamagnum = new Item_gun("basshaamagnum",Tabs.bashaamagnum,RiderItems.energy).setMaxStackSize(1).setCreativeTab(Tabs.tabkiva);
	public static Item dogga_hammer = new ItemBaseSword("dogga_hammer",Tabs.dogga_hammer).setMaxStackSize(1).setCreativeTab(Tabs.tabkiva);

	
	public static Item ixa_caliber = new Item_sword_gun("ixa_caliber",Tabs.garulu_saber,RiderItems.energy).setMaxStackSize(1).setCreativeTab(Tabs.tabkiva);

	public static Item ixariser = new Item_gun("ixariser",Tabs.bashaamagnum,RiderItems.energy).setMaxStackSize(1).setCreativeTab(Tabs.tabkiva);

	public static Item jacorder = new ItemBaseSword("jacorder",Tabs.jacorder).setMaxStackSize(1).setCreativeTab(Tabs.tabkiva);

	public static Item zanbatsword_charge = new Item_ore("zanbatsword_charge");	
	public static Item zanbatsword = new ItemBaseSword("zanbatsword",Tabs.zanbatsword).setMaxStackSize(1).setCreativeTab(Tabs.tabkiva);
	public static Item zanbatsword_core = new ItemBaseSword("zanbatsword_core",Tabs.zanbatsword_core).setMaxStackSize(1).setCreativeTab(Tabs.tabkiva);

	public static Item kivahead = new item_kivaarmor("kivahead",ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.HEAD).setMaxStackSize(1).setCreativeTab(Tabs.tabkiva);
	public static Item kivatroso = new item_kivaarmor2("kivatroso",ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.CHEST).setMaxStackSize(1).setCreativeTab(Tabs.tabkiva);
	public static Item kivalegs = new item_kivaarmor2("kivalegs",ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.LEGS).setMaxStackSize(1).setCreativeTab(Tabs.tabkiva);

	public static Item kivadriver_garulu = new Item_ore("kivadriver_garulu");
	public static Item kivadriver_basshaa = new Item_ore("kivadriver_basshaa");
	public static Item kivadriver_dogga = new Item_ore("kivadriver_dogga");
	public static Item kivadriver_emperor = new Item_ore("kivadriver_emperor");
	public static Item kivadriver = new item_kivadriver("kivadriver",ArmorMaterial.DIAMOND, 4).setMaxStackSize(1).setCreativeTab(Tabs.tabkiva);
	public static Item ixa_belt = new item_kivadriver("ixa_belt",ArmorMaterial.DIAMOND, 4).setMaxStackSize(1).setCreativeTab(Tabs.tabkiva);
	public static Item sagarc_belt = new item_kivadriver("sagarc_belt",ArmorMaterial.DIAMOND, 4).setMaxStackSize(1).setCreativeTab(Tabs.tabkiva);
	public static Item darkkivadriver = new item_kivadriver("darkkivadriver",ArmorMaterial.DIAMOND, 4).setMaxStackSize(1).setCreativeTab(Tabs.tabkiva);
	public static Item newkivadriver = new item_kivadriver("newkivadriver",ArmorMaterial.DIAMOND, 4).setMaxStackSize(1).setCreativeTab(Tabs.tabkiva);

	public static Item arcdriver = new item_kivadriver("arcdriver",ArmorMaterial.DIAMOND, 4).setMaxStackSize(1).setCreativeTab(Tabs.tabkiva);
	public static Item reydriver = new item_kivadriver("reydriver",ArmorMaterial.DIAMOND, 4).setMaxStackSize(1).setCreativeTab(Tabs.tabkiva);

	public static Item wakeupfuestle = new Itemfuestle(0,0,"wakeupfuestle").setCreativeTab(Tabs.tabkiva);
	public static Item garulufuestle = new Itemfuestle(0,1,"garulufuestle").setCreativeTab(Tabs.tabkiva);
	public static Item basshaafuestle = new Itemfuestle(0,2,"basshaafuestle").setCreativeTab(Tabs.tabkiva);
	public static Item doggafuestle = new Itemfuestle(0,3,"doggafuestle").setCreativeTab(Tabs.tabkiva);

	public static Item knucklefuestle = new Itemfuestle(1,1,"knucklefuestle").setCreativeTab(Tabs.tabkiva);
	public static Item risingfuestle = new Itemfuestle(1,2,"risingfuestle").setCreativeTab(Tabs.tabkiva);

	public static Item sagafuestle = new Item_ore("sagafuestle").setCreativeTab(Tabs.tabkiva);

	public static Item keyfuestle = new Item_ore("keyfuestle").setCreativeTab(Tabs.tabkiva);

	public static Item darkwakeupfuestle = new Item_ore("darkwakeupfuestle").setCreativeTab(Tabs.tabkiva);
	public static Item newwakeupfuestle = new Item_ore("newwakeupfuestle").setCreativeTab(Tabs.tabkiva);

	public static Item tatsulot = new Itemfuestle(0,5,"tatsulot").setCreativeTab(Tabs.tabkiva);


	//decade
	public static Item ride_booker = new Item_sword_gun("ride_booker",ToolMaterial.DIAMOND,RiderItems.energy).setMaxStackSize(1).setCreativeTab(Tabs.tabdecade);
	public static Item diend_driver = new Item_dienddriver("diend_driver",Tabs.den_dengu,RiderItems.energy).setMaxStackSize(1).setCreativeTab(Tabs.tabdecade);

	public static Item ongekibo_rekka_decade = new ItemBaseSword("ongekibo_rekka_decade",Tabs.ongekibo).setMaxStackSize(1).setCreativeTab(Tabs.tabdecade);
	public static Item ongekibo_rekka_diend = new ItemBaseSword("ongekibo_rekka_diend",Tabs.ongekibo).setMaxStackSize(1).setCreativeTab(Tabs.tabdecade);

	public static Item decadehead = new item_decadearmor("decadehead",ArmorMaterial.DIAMOND, 4,EntityEquipmentSlot.HEAD).setMaxStackSize(1).setCreativeTab(Tabs.tabdecade);
	public static Item decadetroso = new item_decadearmor2("decadetroso",ArmorMaterial.DIAMOND, 4,EntityEquipmentSlot.CHEST).setMaxStackSize(1).setCreativeTab(Tabs.tabdecade);
	public static Item decadelegs = new item_decadearmor2("decadelegs",ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.LEGS).setMaxStackSize(1).setCreativeTab(Tabs.tabdecade);

	public static Item decadedriver = new item_decadedriver("decadedriver",ArmorMaterial.DIAMOND, 4).setMaxStackSize(1).setCreativeTab(Tabs.tabdecade);
	public static Item dienddriver = new item_decadedriver("dienddriver",ArmorMaterial.DIAMOND, 4).setMaxStackSize(1).setCreativeTab(Tabs.tabdecade);
	public static Item dark_decadedriver = new item_decadedriver("dark_decadedriver",ArmorMaterial.DIAMOND, 4).setMaxStackSize(1).setCreativeTab(Tabs.tabdecade);
	public static Item new_decadriver = new item_decadedriver("new_decadriver",ArmorMaterial.DIAMOND, 4).setMaxStackSize(1).setCreativeTab(Tabs.tabdecade);

	public static Item decadecard = new Itemrider_cards(0,0,"decadecard").setCreativeTab(Tabs.tabdecade);
	public static Item k_touch = new Itemrider_cards(0,1,"k_touch").setCreativeTab(Tabs.tabdecade);
	public static Item decadecard_violent_emotion = new Itemrider_cards(0,2,"decadecard_violent_emotion").setCreativeTab(Tabs.tabdecade);

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

	//W
	public static Item trigger_magnum = new Item_gun("trigger_magnum",Tabs.den_dengu,RiderItems.energy).setMaxStackSize(1).setCreativeTab(Tabs.tabW);	
	public static Item metal_shaft = new Item_metal_shaft("metal_shaft",Tabs.den_denro).setMaxStackSize(1).setCreativeTab(Tabs.tabW);
	public static Item prism_bicker = new ItemChargeSword("prism_bicker",Tabs.denkamen_sword).setMaxStackSize(1).setCreativeTab(Tabs.tabW);
	public static Item shield_prism_bicker = new ItemBaseShield("shield_prism_bicker").setMaxStackSize(1).setCreativeTab(Tabs.tabW);
	
	public static Item eternal_edge = new ItemBaseSword("eternal_edge",Tabs.den_denso).setMaxStackSize(1).setCreativeTab(Tabs.tabW);
	public static Item skull_magnum = new Item_gun("skull_magnum",Tabs.den_dengu,RiderItems.energy).setMaxStackSize(1).setCreativeTab(Tabs.tabW);
	public static Item engine_blade = new ItemBaseSword("engine_blade",Tabs.den_denso).setMaxStackSize(1).setCreativeTab(Tabs.tabW);

	public static Item Whead = new item_warmor2("whead",ArmorMaterial.DIAMOND, 4 ,EntityEquipmentSlot.HEAD).setMaxStackSize(1).setCreativeTab(Tabs.tabW);
	public static Item Wtroso = new item_warmor2("wtroso",ArmorMaterial.DIAMOND, 4,EntityEquipmentSlot.CHEST).setMaxStackSize(1).setCreativeTab(Tabs.tabW);
	public static Item Wlegs = new item_warmor2("wlegs",ArmorMaterial.DIAMOND, 4,EntityEquipmentSlot.LEGS).setMaxStackSize(1).setCreativeTab(Tabs.tabW);

	public static Item Wdriver = new item_Wdriver("wdriver",ArmorMaterial.DIAMOND, 4).setMaxStackSize(1).setCreativeTab(Tabs.tabW);

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


	public static Item lostdriver = new item_Wdriver("lostdriver",ArmorMaterial.DIAMOND, 4).setMaxStackSize(1).setCreativeTab(Tabs.tabW);

	public static Item accel_driver = new item_Wdriver("accel_driver",ArmorMaterial.DIAMOND, 4).setMaxStackSize(1).setCreativeTab(Tabs.tabW);

	public static Item cyclone_memory = new Item_memory(0, "3","cyclone_memory").setCreativeTab(Tabs.tabW);
	public static Item heat_memory = new Item_memory(1, "3","heat_memory").setCreativeTab(Tabs.tabW);
	public static Item luna_memory = new Item_memory(2, "3","luna_memory").setCreativeTab(Tabs.tabW);
	public static Item fang_memory = new Item_memory(3, "3","fang_memory").setCreativeTab(Tabs.tabW);

	public static Item joker_memory = new Item_memory(0, "1","joker_memory").setCreativeTab(Tabs.tabW);
	public static Item metal_memory = new Item_memory(1, "1","metal_memory").setCreativeTab(Tabs.tabW);
	public static Item trigger_memory = new Item_memory(2, "1","trigger_memory").setCreativeTab(Tabs.tabW);

	public static Item xtreme_memory = new Item_memory(1, "2","xtreme_memory").setCreativeTab(Tabs.tabW);
	public static Item xtreme_gold_memory = new Item_memory(2, "2","xtreme_gold_memory").setCreativeTab(Tabs.tabW);
	public static Item xtreme_accel_memory = new Item_memory(3, "2","xtreme_accel_memory").setCreativeTab(Tabs.tabW);

	public static Item cyclonecyclone_memory = new Item_memory(3, "1","cyclonecyclone_memory").setCreativeTab(Tabs.tabW);
	public static Item jokerjoker_memory = new Item_memory(4, "3","jokerjoker_memory").setCreativeTab(Tabs.tabW);

	public static Item joker_t2_memory = new Item_memory(0, "4","joker_t2_memory").setCreativeTab(Tabs.tabW);
	public static Item skull_memory = new Item_memory(1, "4","skull_memory").setCreativeTab(Tabs.tabW);
	public static Item eternal_t2_memory = new Item_memory(2, "4","eternal_t2_memory").setCreativeTab(Tabs.tabW);
	public static Item eternal_memory = new Item_memory(3, "4","eternal_memory").setCreativeTab(Tabs.tabW);

	public static Item accel_memory = new Item_memory(0, "5","accel_memory").setCreativeTab(Tabs.tabW);
	public static Item trial_memory = new Item_memory(1, "5","trial_memory").setCreativeTab(Tabs.tabW);
	public static Item accel_booster_memory = new Item_memory(2, "5","accel_booster_memory").setCreativeTab(Tabs.tabW);

	public static Item prism_memory = new Item_ore("prism_memory").setCreativeTab(Tabs.tabW);
	public static Item engine_memory = new Item_ore("engine_memory").setCreativeTab(Tabs.tabW);

	public static Item shippu_memory = new Item_memory(0, "3","shippu_memory").setCreativeTab(Tabs.tabW);
	public static Item kirifuda_memory = new Item_memory(0, "1","kirifuda_memory").setCreativeTab(Tabs.tabW);


	//OOO
	public static Item medajalibur = new ItemChargeSword("medajalibur",Tabs.medajalibur).setMaxStackSize(1).setCreativeTab(Tabs.tabOOO);

	public static Item tajaspinner = new Item_fireball_gun("tajaspinner",Tabs.tajaspinner,RiderItems.energy).setMaxStackSize(1).setCreativeTab(Tabs.tabOOO);

	public static Item medagaburyu = new Item_sword_gun("medagaburyu",Tabs.medagaburyu,RiderItems.energy).setMaxStackSize(1).setCreativeTab(Tabs.tabOOO);


	public static Item birth_buster = new Item_gun("birth_buster",Tabs.birth_buster, RiderItems.energy).setMaxStackSize(1).setCreativeTab(Tabs.tabOOO);
	public static Item deepest_harpoon = new ItemBaseSword("deepest_harpoon",Tabs.medagaburyu).setMaxStackSize(1).setCreativeTab(Tabs.tabOOO);

	public static Item OOOhead = new item_OOOarmor2("ooohead",ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.HEAD).setMaxStackSize(1).setCreativeTab(Tabs.tabOOO);
	public static Item OOOtroso = new item_OOOarmor("oootroso",ArmorMaterial.DIAMOND, 4,EntityEquipmentSlot.CHEST).setMaxStackSize(1).setCreativeTab(Tabs.tabOOO);
	public static Item OOOlegs = new item_OOOarmor("ooolegs",ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.LEGS).setMaxStackSize(1).setCreativeTab(Tabs.tabOOO);

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
		
	public static Item OOOdriver = new item_OOOdriver("ooodriver",ArmorMaterial.DIAMOND, 4).setMaxStackSize(1).setCreativeTab(Tabs.tabOOO);
	public static Item birth_driver = new item_OOOdriver("birth_driver",ArmorMaterial.DIAMOND, 4).setMaxStackSize(1).setCreativeTab(Tabs.tabOOO);
	public static Item birth_driver_prototype = new item_OOOdriver("birth_driver_prototype",ArmorMaterial.DIAMOND, 4).setMaxStackSize(1).setCreativeTab(Tabs.tabOOO);
	public static Item poseidon_driver = new item_OOOdriver("poseidon_driver",ArmorMaterial.DIAMOND, 4).setMaxStackSize(1).setCreativeTab(Tabs.tabOOO);
	public static Item aqua_driver = new item_OOOdriver("aqua_driver",ArmorMaterial.DIAMOND, 4).setMaxStackSize(1).setCreativeTab(Tabs.tabOOO);

		
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
	public static Item kangaroo = new Itemmedal(10, "2","kangaroo").setCreativeTab(Tabs.tabOOO);
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
	public static Item shocker = new Itemmedal(7, "3","shocker").setCreativeTab(Tabs.tabOOO);
	public static Item super_batta = new Itemmedal(8, "3","super_batta").setCreativeTab(Tabs.tabOOO);
	public static Item kangaroo2 = new Itemmedal(9, "3","kangaroo2").setCreativeTab(Tabs.tabOOO);
	public static Item ookamiuo = new Itemmedal(11, "3","ookamiuo").setCreativeTab(Tabs.tabOOO);
	public static Item ushi = new Itemmedal(12, "3","ushi").setCreativeTab(Tabs.tabOOO);
	public static Item penguin = new Itemmedal(13, "3","penguin").setCreativeTab(Tabs.tabOOO);
	public static Item ari = new Itemmedal(14, "3","ari").setCreativeTab(Tabs.tabOOO);
	public static Item sasori_new = new Itemmedal(15, "3","sasori_new").setCreativeTab(Tabs.tabOOO);
	public static Item ichigo = new Itemmedal(16, "3","ichigo").setCreativeTab(Tabs.tabOOO);

	public static Item love_core = new Itemmedal(8, "1","love_core").setCreativeTab(Tabs.tabOOO);
	public static Item love_core2 = new Itemmedal(11, "2","love_core2").setCreativeTab(Tabs.tabOOO);
	public static Item love_core3 = new Itemmedal(10, "3","love_core3").setCreativeTab(Tabs.tabOOO);
		

	public static Item sasori = new Item_ore("sasori").setCreativeTab(Tabs.tabOOO);
	public static Item kani = new Item_ore("kani").setCreativeTab(Tabs.tabOOO);
	public static Item ebi = new Item_ore("ebi").setCreativeTab(Tabs.tabOOO);

	public static Item proto_birth_core = new Item_ore("proto_birth_core").setCreativeTab(Tabs.tabOOO);
		
	public static Item o_scanner = new Itemo_scanner("o_scanner").setCreativeTab(Tabs.tabOOO);

		
	//Fourze
	public static Item billytherod = new ItemBaseSword("billytherod",ToolMaterial.DIAMOND).setMaxStackSize(1).setCreativeTab(Tabs.tabFourze);
	public static Item hee_hackgun = new Item_fireball_gun("hee_hackgun", ToolMaterial.DIAMOND, RiderItems.energy).setMaxStackSize(1).setCreativeTab(Tabs.tabFourze);
	public static Item barizun_sword = new ItemChargeSword("barizun_sword",ToolMaterial.DIAMOND).setMaxStackSize(1).setCreativeTab(Tabs.tabFourze);


	public static Item Fourzehead = new item_Fourzearmor("fourzehead",ArmorMaterial.DIAMOND, 4,EntityEquipmentSlot.HEAD ).setMaxStackSize(1).setCreativeTab(Tabs.tabFourze);
	public static Item Fourzetroso = new item_Fourzearmor2("fourzetroso",ArmorMaterial.DIAMOND, 4,EntityEquipmentSlot.CHEST).setMaxStackSize(1).setCreativeTab(Tabs.tabFourze);
	public static Item Fourzelegs = new item_Fourzearmor2("fourzelegs",ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.LEGS).setMaxStackSize(1).setCreativeTab(Tabs.tabFourze);

	public static Item Fourzedriver = new item_Fourzedriver("fourzedriver",ArmorMaterial.DIAMOND, 4).setMaxStackSize(1).setCreativeTab(Tabs.tabFourze);
	public static Item meteor_driver = new item_Fourzedriver("meteor_driver",ArmorMaterial.DIAMOND, 4).setMaxStackSize(1).setCreativeTab(Tabs.tabFourze);
	public static Item nadeshikodriver = new item_Fourzedriver("nadeshikodriver",ArmorMaterial.DIAMOND, 4).setMaxStackSize(1).setCreativeTab(Tabs.tabFourze);


	public static Item rocket_swich = new Item_astroswitch(0, "1","circle",1,"rocket_swich").setCreativeTab(Tabs.tabFourze);
	public static Item launcher_switch = new Item_astroswitch(0,"0","cross",1,"launcher_switch").setCreativeTab(Tabs.tabFourze);
	public static Item drill_switch = new Item_astroswitch(0, "0","triangle",1,"drill_switch").setCreativeTab(Tabs.tabFourze);
	public static Item radar_switch = new Item_astroswitch(0, "0","square",1,"radar_switch").setCreativeTab(Tabs.tabFourze);
	public static Item magic_hand_switch = new Item_astroswitch(0, "0","circle",2,"magic_hand_switch").setCreativeTab(Tabs.tabFourze);
	public static Item camera_switch = new Item_astroswitch(0, "0","square",2,"camera_switch").setCreativeTab(Tabs.tabFourze);
	public static Item parachute_switch = new Item_astroswitch(0, "0","square",3,"parachute_switch").setCreativeTab(Tabs.tabFourze);
	public static Item chainsaw_switch = new Item_astroswitch(0,"0","cross",2,"chainsaw_switch").setCreativeTab(Tabs.tabFourze);
	public static Item hopping_switch = new Item_astroswitch(0, "0","triangle",2,"hopping_switch").setCreativeTab(Tabs.tabFourze);

	public static Item elek_swich = new Item_astroswitch(1, "1","circle",3,"elek_swich").setCreativeTab(Tabs.tabFourze);
	public static Item scissors_switch = new Item_astroswitch(0, "0","square",4,"scissors_switch").setCreativeTab(Tabs.tabFourze);
	public static Item beat_switch = new Item_astroswitch(0,"0","cross",3,"beat_switch").setCreativeTab(Tabs.tabFourze);
	public static Item chain_array_switch = new Item_astroswitch(0, "0","circle",4,"chain_array_switch").setCreativeTab(Tabs.tabFourze);
	public static Item smoke_switch = new Item_astroswitch(0,"0","cross",4,"smoke_switch").setCreativeTab(Tabs.tabFourze);
	public static Item spike_switch = new Item_astroswitch(0, "0","triangle",3,"spike_switch").setCreativeTab(Tabs.tabFourze);
	public static Item winch_switch = new Item_astroswitch(0, "0","square",5,"winch_switch").setCreativeTab(Tabs.tabFourze);
	public static Item flash_switch = new Item_astroswitch(0, "0","circle",5,"flash_switch").setCreativeTab(Tabs.tabFourze);
	public static Item shield_switch = new Item_astroswitch(0, "0","square",6,"shield_switch").setCreativeTab(Tabs.tabFourze);
	public static Item gatling_switch = new Item_astroswitch(0, "0","triangle",4,"gatling_switch").setCreativeTab(Tabs.tabFourze);

	public static Item fire_swich = new Item_astroswitch(2, "1","circle",6,"fire_swich").setCreativeTab(Tabs.tabFourze);
	public static Item stealth_switch = new Item_astroswitch(0,"0","cross",5,"stealth_switch").setCreativeTab(Tabs.tabFourze);
	public static Item hammer_switch = new Item_astroswitch(0, "0","square",7,"hammer_switch").setCreativeTab(Tabs.tabFourze);
	public static Item water_switch = new Item_astroswitch(0, "0","triangle",5,"water_switch").setCreativeTab(Tabs.tabFourze);
	public static Item medical_switch = new Item_astroswitch(0, "0","square",8,"medical_switch").setCreativeTab(Tabs.tabFourze);
	public static Item pen_switch = new Item_astroswitch(0,"0","cross",6,"pen_switch").setCreativeTab(Tabs.tabFourze);
	public static Item wheel_switch = new Item_astroswitch(0, "0","triangle",6,"wheel_switch").setCreativeTab(Tabs.tabFourze);
	public static Item screw_switch = new Item_astroswitch(0, "0","triangle",7,"screw_switch").setCreativeTab(Tabs.tabFourze);
	public static Item hand_switch = new Item_astroswitch(0,"0","cross",7,"hand_switch").setCreativeTab(Tabs.tabFourze);
	public static Item schop_switch = new Item_astroswitch(0, "0","circle",7,"schop_switch").setCreativeTab(Tabs.tabFourze);

	public static Item magnet_swich_n = new Item_astroswitch(3, "1","circle",8,"magnet_swich_n").setCreativeTab(Tabs.tabFourze);
	public static Item magnet_swich_s = new Item_astroswitch(3, "1","square",0,"magnet_swich_s").setCreativeTab(Tabs.tabFourze);
	public static Item freeze_switch = new Item_astroswitch(0,"0","cross",8,"freeze_switch").setCreativeTab(Tabs.tabFourze);
	public static Item claw_switch = new Item_astroswitch(0, "0","circle",9,"claw_switch").setCreativeTab(Tabs.tabFourze);
	public static Item board_switch = new Item_astroswitch(0, "0","triangle",8,"board_switch").setCreativeTab(Tabs.tabFourze);
	public static Item giantfoot_switch = new Item_astroswitch(0,"0","cross",9,"giantfoot_switch").setCreativeTab(Tabs.tabFourze);
	public static Item aero_switch = new Item_astroswitch(0, "0","triangle",9,"aero_switch").setCreativeTab(Tabs.tabFourze);
	public static Item gyro_switch = new Item_astroswitch(0, "0","square",10,"gyro_switch").setCreativeTab(Tabs.tabFourze);
	public static Item net_switch = new Item_astroswitch(0,"0","cross",10,"net_switch").setCreativeTab(Tabs.tabFourze);
	public static Item stamper_switch = new Item_astroswitch(0, "0","triangle",10,"stamper_switch").setCreativeTab(Tabs.tabFourze);

	public static Item cosmic_swich = new Item_astroswitch(4, "1","circle",10,"cosmic_swich").setCreativeTab(Tabs.tabFourze);

	public static Item super_rocket_swich = new Item_astroswitch(5, "1","circle",1,"super_rocket_swich").setCreativeTab(Tabs.tabFourze);
	public static Item super_drill_swich = new Item_ore("super_drill_swich").setCreativeTab(Tabs.tabFourze);

	public static Item clear_drill_swich = new Item_astroswitch(6, "1","circle",13,"clear_drill_swich").setCreativeTab(Tabs.tabFourze);
	public static Item fusion_swich = new Item_astroswitch(7, "1","circle",11,"fusion_swich").setCreativeTab(Tabs.tabFourze);

	public static Item meteor_swich = new Item_astroswitch(0, "2","meteor",0,"meteor_swich").setCreativeTab(Tabs.tabFourze);
	public static Item meteor_storm_swich = new Item_astroswitch(1, "2","meteor",0,"meteor_storm_swich").setCreativeTab(Tabs.tabFourze);

	public static Item nadeshiko_switch = new Item_ore("nadeshiko_switch").setCreativeTab(Tabs.tabFourze);

	public static Item solu_switch = new Item_ore("solu_switch").setCreativeTab(Tabs.tabFourze);
	public static Item core_switch = new Item_ore("core_switch").setCreativeTab(Tabs.tabFourze);

			
	// Wizard
	public static Item wizarswordgun = new Item_sword_gun("wizarswordgun",Tabs.wizarswordgun,RiderItems.energy).setMaxStackSize(1).setCreativeTab(Tabs.tabwizard);
	public static Item axcalibur = new ItemChargeSword("axcalibur",Tabs.axcalibur).setMaxStackSize(1).setCreativeTab(Tabs.tabwizard);
	public static Item wizarswordgun_mage = new Item_sword_gun("wizarswordgun_mage",Tabs.wizarswordgun,RiderItems.energy).setMaxStackSize(1).setCreativeTab(Tabs.tabwizard);
	public static Item hammelcane = new ItemBaseSword("hammelcane",Tabs.hammelcane).setMaxStackSize(1).setCreativeTab(Tabs.tabwizard);
	public static Item dis_halberd = new ItemBaseSword("dis_halberd",Tabs.dis_halberd).setMaxStackSize(1).setCreativeTab(Tabs.tabwizard);
	public static Item mirage_magnum = new Item_gun("mirage_magnum",Tabs.den_dengu,RiderItems.energy).setMaxStackSize(1).setCreativeTab(Tabs.tabwizard);
	public static Item dice_saber = new ItemBaseSword("dice_saber",Tabs.den_denso).setMaxStackSize(1).setCreativeTab(Tabs.tabwizard);

	public static Item wizardhead = new item_wizardarmor("wizardhead",ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.HEAD).setMaxStackSize(1).setCreativeTab(Tabs.tabwizard);
	public static Item wizardtroso = new item_wizardarmor2("wizardtroso",ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.CHEST).setMaxStackSize(1).setCreativeTab(Tabs.tabwizard);
	public static Item wizardlegs = new item_wizardarmor2("wizardlegs",ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.LEGS).setMaxStackSize(1).setCreativeTab(Tabs.tabwizard);

	public static Item wizardriver = new item_wizarddriver("wizardriver",ArmorMaterial.DIAMOND, 4).setMaxStackSize(1).setCreativeTab(Tabs.tabwizard);
	public static Item beastdriver = new item_wizarddriver("beastdriver",ArmorMaterial.DIAMOND, 4).setMaxStackSize(1).setCreativeTab(Tabs.tabwizard);
	public static Item whitewizardriver = new item_wizarddriver("whitewizardriver",ArmorMaterial.DIAMOND, 4).setMaxStackSize(1).setCreativeTab(Tabs.tabwizard);
	public static Item magewizardriver = new item_wizarddriver("magewizardriver",ArmorMaterial.DIAMOND, 4).setMaxStackSize(1).setCreativeTab(Tabs.tabwizard);
	public static Item magewizardriver_b = new item_wizarddriver("magewizardriver_b",ArmorMaterial.DIAMOND, 4).setMaxStackSize(1).setCreativeTab(Tabs.tabwizard);
			public static Item magewizardriver_g = new item_wizarddriver("magewizardriver_g",ArmorMaterial.DIAMOND, 4).setMaxStackSize(1).setCreativeTab(Tabs.tabwizard);
			public static Item sorcererdriver = new item_wizarddriver("sorcererdriver",ArmorMaterial.DIAMOND, 4).setMaxStackSize(1).setCreativeTab(Tabs.tabwizard);
			public static Item whitewizardriverf = new item_wizarddriver("whitewizardriverf",ArmorMaterial.DIAMOND, 4).setMaxStackSize(1).setCreativeTab(Tabs.tabwizard);

			public static Item darkwizardriver = new item_wizarddriver("darkwizardriver",ArmorMaterial.DIAMOND, 4).setMaxStackSize(1).setCreativeTab(Tabs.tabwizard);
			public static Item blackwizardriver = new item_wizarddriver("blackwizardriver",ArmorMaterial.DIAMOND, 4).setMaxStackSize(1).setCreativeTab(Tabs.tabwizard);

			
			public static Item flame_ring = new Item_wizard_ring(0, "1","flame_ring").setCreativeTab(Tabs.tabwizard);
			public static Item water_ring = new Item_wizard_ring(1, "1","water_ring").setCreativeTab(Tabs.tabwizard);
			public static Item hurricane_ring = new Item_wizard_ring(2, "1","hurricane_ring").setCreativeTab(Tabs.tabwizard);
			public static Item land_ring = new Item_wizard_ring(3, "1","land_ring").setCreativeTab(Tabs.tabwizard);
			public static Item flame_ring_dragon = new Item_wizard_ring(4, "1","flame_ring_dragon").setCreativeTab(Tabs.tabwizard);
			public static Item water_ring_dragon = new Item_wizard_ring(5, "1","water_ring_dragon").setCreativeTab(Tabs.tabwizard);
			public static Item hurricane_ring_dragon = new Item_wizard_ring(6, "1","hurricane_ring_dragon").setCreativeTab(Tabs.tabwizard);
			public static Item land_ring_dragon = new Item_wizard_ring(7, "1","land_ring_dragon").setCreativeTab(Tabs.tabwizard);
			public static Item infinity_ring = new Item_wizard_ring(8, "1","infinity_ring").setCreativeTab(Tabs.tabwizard);

			public static Item drago_timer = new Item_wizard_ring(1, "2","drago_timer").setCreativeTab(Tabs.tabwizard);
			public static Item special_ring = new Item_wizard_ring(2, "2","special_ring").setCreativeTab(Tabs.tabwizard);
			public static Item finish_strike_ring = new Item_wizard_ring(3 , "2","finish_strike_ring").setCreativeTab(Tabs.tabwizard);
			public static Item hope_ring = new Item_ore("hope_ring").setCreativeTab(Tabs.tabwizard);
			public static Item special_rush_ring = new Item_wizard_ring(9 , "2","special_rush_ring").setCreativeTab(Tabs.tabwizard);
			public static Item dress_up_ring = new Item_wizard_ring(11, "1","dress_up_ring").setCreativeTab(Tabs.tabwizard);

			public static Item beast_ring = new Item_wizard_ring(0, "3","beast_ring").setCreativeTab(Tabs.tabwizard);
			public static Item falco_ring = new Item_wizard_ring(1, "3","falco_ring").setCreativeTab(Tabs.tabwizard);
			public static Item chameleo_ring = new Item_wizard_ring(2, "3","chameleo_ring").setCreativeTab(Tabs.tabwizard);
			public static Item buffa_ring = new Item_wizard_ring(3, "3","buffa_ring").setCreativeTab(Tabs.tabwizard);
			public static Item dolphi_ring = new Item_wizard_ring(4, "3","dolphi_ring").setCreativeTab(Tabs.tabwizard);
			public static Item hyper_ring = new Item_wizard_ring(5, "3","hyper_ring").setCreativeTab(Tabs.tabwizard);

			public static Item wiseman_ring = new Item_ore("wiseman_ring").setCreativeTab(Tabs.tabwizard);
			public static Item mage_o_ring = new Item_ore("mage_o_ring").setCreativeTab(Tabs.tabwizard);
			public static Item mage_b_ring = new Item_ore("mage_b_ring").setCreativeTab(Tabs.tabwizard);
			public static Item mage_g_ring = new Item_ore("mage_g_ring").setCreativeTab(Tabs.tabwizard);
			public static Item sorcerer_ring = new Item_ore("sorcerer_ring").setCreativeTab(Tabs.tabwizard);
			public static Item black_ring = new Item_ore("black_ring").setCreativeTab(Tabs.tabwizard);
			public static Item dark_ring = new Item_ore("dark_ring").setCreativeTab(Tabs.tabwizard);

			public static Item light_ring = new Item_wizard_rings_efts(1 , "0","light_ring").setMaxStackSize(1).setCreativeTab(Tabs.tabwizard);
			public static Item excite_ring = new Item_wizard_rings_efts(2 , "0","excite_ring").setMaxStackSize(1).setCreativeTab(Tabs.tabwizard);
			public static Item defend_ring = new Item_wizard_rings_efts(3 , "0","defend_ring").setMaxStackSize(1).setCreativeTab(Tabs.tabwizard);
			public static Item thunder_ring = new Item_wizard_rings_efts(4 , "0","thunder_ring").setMaxStackSize(1).setCreativeTab(Tabs.tabwizard);
			public static Item explosion_ring = new Item_wizard_rings_efts(5 , "0","explosion_ring").setMaxStackSize(1).setCreativeTab(Tabs.tabwizard);
			public static Item sleep_ring = new Item_wizard_rings_efts(6 , "0","sleep_ring").setMaxStackSize(1).setCreativeTab(Tabs.tabwizard);
			public static Item bind_ring = new Item_wizard_rings_efts(7 , "0","bind_ring").setMaxStackSize(1).setCreativeTab(Tabs.tabwizard);
			public static Item teleport_ring = new Item_wizard_rings_efts(8 , "0","teleport_ring").setMaxStackSize(1).setCreativeTab(Tabs.tabwizard);
			public static Item fall_ring = new Item_wizard_rings_efts(9 , "0","fall_ring").setMaxStackSize(1).setCreativeTab(Tabs.tabwizard);
			public static Item connect_ring = new Item_wizard_rings_efts(10 , "0","connect_ring").setMaxStackSize(1).setCreativeTab(Tabs.tabwizard);
			public static Item kick_strike_ring = new Item_wizard_rings_efts(11 , "0","kick_strike_ring").setMaxStackSize(1).setCreativeTab(Tabs.tabwizard);
			public static Item eclipse_ring = new Item_wizard_rings_efts(12 , "0","eclipse_ring").setMaxStackSize(1).setCreativeTab(Tabs.tabwizard);
			public static Item liquid_ring = new Item_wizard_rings_efts(13 , "0","liquid_ring").setMaxStackSize(1).setCreativeTab(Tabs.tabwizard);
			public static Item drill_ring = new Item_wizard_rings_efts(14 , "0","drill_ring").setMaxStackSize(1).setCreativeTab(Tabs.tabwizard);



			public static Item engage_ring = new Item_ore("engage_ring").setMaxStackSize(1).setCreativeTab(Tabs.tabwizard);
			public static Item please_ring = new Item_ore("please_ring").setMaxStackSize(1).setCreativeTab(Tabs.tabwizard);
			public static Item small_ring = new Item_ore("small_ring").setMaxStackSize(1).setCreativeTab(Tabs.tabwizard);
			public static Item big_ring = new Item_ore("big_ring").setMaxStackSize(1).setCreativeTab(Tabs.tabwizard);

			public static Item copy_ring = new Item_ore("copy_ring").setMaxStackSize(1).setCreativeTab(Tabs.tabwizard);
			public static Item smell_ring = new Item_ore("smell_ring").setMaxStackSize(1).setCreativeTab(Tabs.tabwizard);
			public static Item extend_ring = new Item_ore("extend_ring").setMaxStackSize(1).setCreativeTab(Tabs.tabwizard);
			public static Item merry_christmas_ring = new Item_ore("merry_christmas_ring").setMaxStackSize(1).setCreativeTab(Tabs.tabwizard);			
			public static Item blizzard_ring = new Item_ore("blizzard_ring").setMaxStackSize(1).setCreativeTab(Tabs.tabwizard);
			public static Item gravity_ring = new Item_ore("gravity_ring").setMaxStackSize(1).setCreativeTab(Tabs.tabwizard);
			public static Item miracle_ring = new Item_ore("miracle_ring").setMaxStackSize(1).setCreativeTab(Tabs.tabwizard);
			public static Item flower_ring = new Item_ore("flower_ring").setMaxStackSize(1).setCreativeTab(Tabs.tabwizard);
			public static Item dance_ring = new Item_ore("dance_ring").setMaxStackSize(1).setCreativeTab(Tabs.tabwizard);
			public static Item time_ring = new Item_ore("time_ring").setMaxStackSize(1).setCreativeTab(Tabs.tabwizard);
			
			
			//Gaim
			public static Item musou_saber = new ItemBaseSword("musou_saber",Tabs.musou_saber).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
			public static Item musou_saber_naginata = new ItemBaseSword("musou_saber_naginata",Tabs.musou_saber_naginata).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
			public static Item blood_musou_saber_naginata = new ItemBaseSword("blood_musou_saber_naginata",Tabs.musou_saber_naginata).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
			public static Item musou_saber_kusarigama = new ItemBaseSword("musou_saber_kusarigama",Tabs.musou_saber_kusarigama).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
			public static Item dj_gun = new Item_gun("dj_gun",Tabs.dj_gun,RiderItems.energy).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);

			public static Item dj_gun_taiken_mode_big  = new Item_ore("dj_gun_taiken_mode_big");
			public static Item dj_gun_taiken_mode = new ItemBaseSword("dj_gun_taiken_mode",Tabs.dj_gun_taiken_mode).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);

			public static Item kagematsu_l  = new Item_ore("kagematsu_l");
			public static Item kagematsu = new ItemBaseSword("kagematsu",Tabs.kagematsu).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
			public static Item donkachi= new ItemBaseSword("donkachi",Tabs.donkachi).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
			public static Item melon_defender = new ItemBaseShield("melon_defender").setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
			public static Item pine_iron = new ItemBaseSword("pine_iron",Tabs.pine_iron).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
			public static Item ichigo_kunai = new ItemBaseSword("ichigo_kunai",Tabs.ichigo_kunai).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
			public static Item daidaimaru = new ItemBaseSword("daidaimaru",Tabs.daidaimaru).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
			public static Item banana_spear= new ItemBaseSword("banana_spear",Tabs.banana_spear).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
			public static Item budou_ryuhou = new Item_gun("budou_ryuhou",Tabs.budou_ryuhou,RiderItems.energy).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
			public static Item mango_punisher = new ItemBaseSword("mango_punisher",Tabs.mango_punisher).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
			public static Item duri_noko = new ItemBaseSword("duri_noko",Tabs.duri_noko).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
			public static Item kiwi_gekirin = new ItemBaseSword("kiwi_gekirin",Tabs.kiwi_gekirin).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
			public static Item sonic_arrow = new Item_gun("sonic_arrow",Tabs.sonic_arrow,RiderItems.energy).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
			public static Item kagematsu_shin = new ItemBaseSword("kagematsu_shin",Tabs.kagematsu_shin).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
			public static Item suika_sojinto = new ItemBaseSword("suika_sojinto",Tabs.suika_sojinto).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
			public static Item suika_sojinto_baron_ver = new ItemBaseSword("suika_sojinto_baron_ver",Tabs.suika_sojinto_baron_ver).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
			public static Item suika_sojinto_knuckle_ver = new ItemBaseSword("suika_sojinto_knuckle_ver",Tabs.suika_sojinto_baron_ver).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);

			public static Item blood_daidaimaru = new ItemBaseSword("blood_daidaimaru",Tabs.daidaimaru).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
			public static Item yomimaru = new ItemBaseSword("yomimaru",Tabs.yomimaru).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
			public static Item sword_bringer = new ItemBaseSword("sword_bringer",Tabs.sword_bringer).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
			public static Item apple_reflecter = new ItemBaseShield("apple_reflecter").setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
			
			public static Item souginjou = new ItemBaseSword("souginjou",Tabs.souginjou).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
			public static Item dark_daidaimaru = new ItemBaseSword("dark_daidaimaru",Tabs.daidaimaru).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
			public static Item watermelon_defender = new ItemBaseShield("watermelon_defender").setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
			public static Item savior_arrow = new Item_gun("savior_arrow",Tabs.savior_arrow,RiderItems.energy).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);

			public static Item kabi_daidaimaru = new ItemBaseSword("kabi_daidaimaru",ToolMaterial.WOOD).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
			public static Item maja_yomimaru = new ItemBaseSword("maja_yomimaru",Tabs.yomimaru).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);


			public static Item Gaimhead = new item_Gaimarmor3("gaimhead",ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.HEAD).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
			public static Item Gaimtroso = new item_Gaimarmor("gaimtroso",ArmorMaterial.DIAMOND, 4,EntityEquipmentSlot.CHEST).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
			public static Item Gaimlegs = new item_Gaimarmor2("gaimlegs",ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.LEGS).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);

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
			public static Item kabi_orange_lockseed  = new Item_lockseed(4,58,"kabi_orange_lockseed").setCreativeTab(Tabs.tabGaim);

			public static Item sengoku_driver_maja_lock  = new Item_ore("sengoku_driver_maja_lock");
			public static Item maja_lockseed  = new Item_lockseed(4,59,"maja_lockseed").setCreativeTab(Tabs.tabGaim);


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

			public static Item sengoku_driver_gaim_natsumikan = new item_Gaimdriver("sengoku_driver_gaim_natsumikan",ArmorMaterial.DIAMOND, 4, 3,"gaim_natsumikan","natsumikan_arms",0,sengoku_driver_natsumikan).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);

			public static Item genesis_driver_zangetsu_shin = new item_Gaimdriver("genesis_driver_zangetsu_shin",ArmorMaterial.DIAMOND, 4, 3,"zangetsu_shin","energy_melon_arms",1,sengoku_driver_melon_energy).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
			public static Item genesis_driver_duke = new item_Gaimdriver("genesis_driver_duke",ArmorMaterial.DIAMOND, 4, 3,"duke","energy_lemon_arms",1,sengoku_driver_lemon_energy).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
			public static Item genesis_driver_sigurd = new item_Gaimdriver("genesis_driver_sigurd",ArmorMaterial.DIAMOND, 4, 3,"sigurd","energy_cherry_arms",1,sengoku_driver_cherry_energy).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
			public static Item genesis_driver_marika = new item_Gaimdriver("genesis_driver_marika",ArmorMaterial.DIAMOND, 4, 3,"marika","energy_peach_arms",1,sengoku_driver_peach_energy).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
			public static Item genesis_driver_baron = new item_Gaimdriver("genesis_driver_baron",ArmorMaterial.DIAMOND, 4, 3,"baron_shin","energy_lemon_arms",1,sengoku_driver_lemon_energy).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
			public static Item genesis_driver_kurokage_shin = new item_Gaimdriver("genesis_driver_kurokage_shin",ArmorMaterial.DIAMOND, 4, 3,"kurokage_shin","energy_matsubokkuri_arms",1,sengoku_driver_matsubokkuri_energy).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);
			public static Item genesis_driver_tyrant = new item_Gaimdriver("genesis_driver_tyrant",ArmorMaterial.DIAMOND, 4, 3,"tyrant","energy_prototype_dragon_fruits_arms",1,sengoku_driver_dragon_fruits_energy).setMaxStackSize(1).setCreativeTab(Tabs.tabGaim);

			public static Item matsubokkuri_lockseed = new Item_lockseed(1,1,"matsubokkuri_lockseed").setCreativeTab(Tabs.tabGaim);
			public static Item kurumi_lockseed = new Item_lockseed(1,2,"kurumi_lockseed").setCreativeTab(Tabs.tabGaim);
			public static Item donguri_lockseed = new Item_lockseed(1,3,"donguri_lockseed").setCreativeTab(Tabs.tabGaim);
			public static Item melon_lockseed = new Item_lockseed(1,4,"melon_lockseed").setCreativeTab(Tabs.tabGaim);
			public static Item pine_lockseed = new Item_lockseed(1,5,"pine_lockseed").setCreativeTab(Tabs.tabGaim);
			public static Item ichigo_lockseed = new Item_lockseed(1,6,"ichigo_lockseed").setCreativeTab(Tabs.tabGaim);
			public static Item orange_lockseed = new Item_lockseed(1,7,"orange_lockseed").setCreativeTab(Tabs.tabGaim);
			public static Item banana_lockseed = new Item_lockseed(1,8,"banana_lockseed").setCreativeTab(Tabs.tabGaim);
			public static Item budou_lockseed = new Item_lockseed(1,9,"budou_lockseed").setCreativeTab(Tabs.tabGaim);
			public static Item suika_lockseed = new Item_lockseed(1,40,"suika_lockseed").setCreativeTab(Tabs.tabGaim);
			public static Item mango_lockseed = new Item_lockseed(1,10,"mango_lockseed").setCreativeTab(Tabs.tabGaim);
			public static Item durian_lockseed = new Item_lockseed(1,11,"durian_lockseed").setCreativeTab(Tabs.tabGaim);
			public static Item kiwi_lockseed = new Item_lockseed(1,12,"kiwi_lockseed").setCreativeTab(Tabs.tabGaim);
			public static Item lemon_lockseed = new Item_lockseed(1,41,"lemon_lockseed").setCreativeTab(Tabs.tabGaim);

			public static Item sakura_hurricane = new Item_ore("sakura_hurricane").setCreativeTab(Tabs.tabGaim);
			public static Item rose_attacker = new Item_ore("rose_attacker").setCreativeTab(Tabs.tabGaim);
			public static Item dandeliner = new Item_ore("dandeliner").setCreativeTab(Tabs.tabGaim);
			public static Item tulip_hopper = new Item_ore("tulip_hopper").setCreativeTab(Tabs.tabGaim);

			public static Item christmas_lockseed = new Item_ore("christmas_lockseed").setCreativeTab(Tabs.tabGaim);
			public static Item roulette_lockseed = new Item_ore("roulette_lockseed").setCreativeTab(Tabs.tabGaim);

			public static Item fake_donguri_lockseed = new item_fake_donguri("fake_donguri_lockseed").setCreativeTab(Tabs.tabGaim);
			
			public static Item sid_lockseed = new Item_ore("sid_lockseed").setCreativeTab(Tabs.tabGaim);

			public static Item xiaolongbao_lockseed = new Item_ore("xiaolongbao_lockseed").setCreativeTab(Tabs.tabGaim);
			public static Item hsiao_lung_pao_lockseed = new Item_ore("hsiao_lung_pao_lockseed").setCreativeTab(Tabs.tabGaim);
			public static Item tom_yum_kung_lockseed = new Item_ore("tom_yum_kung_lockseed").setCreativeTab(Tabs.tabGaim);
			public static Item yummy_lockseed = new Item_ore("yummy_lockseed").setCreativeTab(Tabs.tabGaim);	
			public static Item hero_lockseed = new Item_ore("hero_lockseed").setCreativeTab(Tabs.tabGaim);
			
			public static Item drained_suika_lockseed = new Item_ore("drained_suika_lockseed").setCreativeTab(Tabs.tabGaim);


			//public static Item sid_lockseed = new item_sid_lockseed().setMaxStackSize(1).setUnlocalizedName("sid_lockseed").setCreativeTab(Tabs.tabGaim);

			//public static Item fake_donguri_lockseed = new fake_donguri(Tabs.apple_reflecter).setUnlocalizedName("fake_donguri_lockseed").setCreativeTab(Tabs.tabGaim);


			//drive
			public static Item handle_sword = new ItemBaseSword("handle_sword",ToolMaterial.DIAMOND).setMaxStackSize(1).setCreativeTab(Tabs.tabdrive);
			public static Item door_ju = new Item_gun("door_ju",ToolMaterial.DIAMOND,RiderItems.energy).setMaxStackSize(1).setCreativeTab(Tabs.tabdrive);
			public static Item trailer_hou = new Item_gun("trailer_hou",ToolMaterial.DIAMOND,RiderItems.energy).setMaxStackSize(1).setCreativeTab(Tabs.tabdrive);

			public static Item zenrin_shooter = new Item_gun("zenrin_shooter",ToolMaterial.DIAMOND,RiderItems.energy).setMaxStackSize(1).setCreativeTab(Tabs.tabdrive);

			public static Item break_gunner = new Item_break_gunner("break_gunner",ToolMaterial.DIAMOND,RiderItems.energy).setMaxStackSize(1).setCreativeTab(Tabs.tabdrive);
			public static Item shingouax = new ItemBaseSword("shingouax",ToolMaterial.DIAMOND).setMaxStackSize(1).setCreativeTab(Tabs.tabdrive);

			public static Item lupin_gunner = new Item_lupin_gunner("lupin_gunner",ToolMaterial.DIAMOND,RiderItems.energy).setMaxStackSize(1).setCreativeTab(Tabs.tabdrive);
			public static Item blade_gunner = new ItemBaseSword("blade_gunner",ToolMaterial.DIAMOND).setMaxStackSize(1).setCreativeTab(Tabs.tabdrive);

			public static Item drivehead = new item_drivearmor("drivehead",ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.HEAD).setMaxStackSize(1).setCreativeTab(Tabs.tabdrive);
			public static Item drivetroso = new item_drivearmor2("drivetroso",ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.CHEST).setMaxStackSize(1).setCreativeTab(Tabs.tabdrive);
			public static Item drivelegs = new item_drivearmor2("drivelegs",ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.LEGS).setMaxStackSize(1).setCreativeTab(Tabs.tabdrive);

			public static Item drivedriver = new item_drivedriver("drivedriver",ArmorMaterial.DIAMOND, 4).setMaxStackSize(1).setCreativeTab(Tabs.tabdrive);
			public static Item mach_driver_honoh = new item_drivedriver("mach_driver_honoh",ArmorMaterial.DIAMOND, 4).setMaxStackSize(1).setCreativeTab(Tabs.tabdrive);
			public static Item drivedrivergold = new item_drivedriver("drivedrivergold",ArmorMaterial.DIAMOND, 4).setMaxStackSize(1).setCreativeTab(Tabs.tabdrive);
			public static Item metro_pd_driver_honoh = new item_drivedriver("metro_pd_driver_honoh",ArmorMaterial.DIAMOND, 4).setMaxStackSize(1).setCreativeTab(Tabs.tabdrive);
			public static Item break_gunner_2 = new item_drivedriver("break_gunner_2",ArmorMaterial.DIAMOND, 4).setMaxStackSize(1).setCreativeTab(Tabs.tabdrive);
			public static Item lupin_belt = new item_drivedriver("lupin_belt",ArmorMaterial.DIAMOND, 4).setMaxStackSize(1).setCreativeTab(Tabs.tabdrive);
			
			
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

			public static Item tridoron_key  = new Item_shift_car(3, 6,"tridoron_key").setCreativeTab(Tabs.tabdrive);

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

			public static Item gan_gun_saber_blade  = new ItemBaseSword("gan_gun_saber_blade",Tabs.gan_gun_saber_blade).setMaxStackSize(1).setCreativeTab(Tabs.tabghost);
			public static Item gan_gun_saber_nitouryu = new ItemBaseSword("gan_gun_saber_nitouryu",Tabs.gan_gun_saber_nitouryu).setMaxStackSize(1).setCreativeTab(Tabs.tabghost);
			public static Item gan_gun_saber_nitouryu_2 = new ItemBaseSword("gan_gun_saber_nitouryu_2",Tabs.gan_gun_saber_nitouryu).setMaxStackSize(1).setCreativeTab(Tabs.tabghost);
			public static Item gan_gun_saber_gun = new Item_gun("gan_gun_saber_gun",Tabs.gan_gun_saber_gun,RiderItems.energy).setMaxStackSize(1).setCreativeTab(Tabs.tabghost);
			public static Item gan_gun_saber_naginata  = new ItemBaseSword("gan_gun_saber_naginata",Tabs.gan_gun_saber_naginata).setMaxStackSize(1).setCreativeTab(Tabs.tabghost);
			public static Item gan_gun_saber_condor_denwor = new Item_gun("gan_gun_saber_condor_denwor",Tabs.gan_gun_saber_condor_denwor,RiderItems.energy).setMaxStackSize(1).setCreativeTab(Tabs.tabghost);
			public static Item gan_gun_saber_rifle = new Item_gun("gan_gun_saber_rifle",Tabs.gan_gun_saber_rifle,RiderItems.energy).setMaxStackSize(1).setCreativeTab(Tabs.tabghost);
			public static Item gan_gun_saber_hammer  = new ItemBaseSword("gan_gun_saber_hammer",Tabs.gan_gun_saber_hammer).setMaxStackSize(1).setCreativeTab(Tabs.tabghost);
	
			public static Item sunglasseslasher_sword = new Item_sword_gun("sunglasseslasher_sword",Tabs.sunglasseslasher_sword,RiderItems.energy).setMaxStackSize(1).setCreativeTab(Tabs.tabghost);

			
			public static Item gan_gun_hand_rod = new Item_sword_gun("gan_gun_hand_rod",Tabs.gan_gun_hand_rod,RiderItems.energy).setMaxStackSize(1).setCreativeTab(Tabs.tabghost);

			public static Item gan_gun_hand_kama = new ItemBaseSword("gan_gun_hand_kama",Tabs.gan_gun_hand_kama).setMaxStackSize(1).setCreativeTab(Tabs.tabghost);

			public static Item deep_slasher_sword = new Item_sword_gun("deep_slasher_sword",Tabs.deep_slasher_sword,RiderItems.energy).setMaxStackSize(1).setCreativeTab(Tabs.tabghost);

			public static Item gan_gun_catcher_rod = new Item_sword_gun("gan_gun_catcher_rod",Tabs.gan_gun_catcher_rod,RiderItems.energy).setMaxStackSize(1).setCreativeTab(Tabs.tabghost);

			public static Item ghosthead = new item_ghost_armor3("ghosthead",ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.HEAD).setMaxStackSize(1).setCreativeTab(Tabs.tabghost);
			public static Item ghosttroso = new item_ghostarmor("ghosttroso",ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.CHEST).setMaxStackSize(1).setCreativeTab(Tabs.tabghost);
			public static Item ghostlegs = new item_ghost_armor2("ghostlegs",ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.LEGS).setMaxStackSize(1).setCreativeTab(Tabs.tabghost);

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

			

			public static Item ore_ghost_icon  = new Item_ghost_Icons(0, 0,1,"ore_ghost_icon").setCreativeTab(Tabs.tabghost);
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
			public static Item gashacon_breaker = new ItemBaseSword("gashacon_breaker",Tabs.gashacon_breaker).setMaxStackSize(1).setCreativeTab(Tabs.tabex_aid);
			public static Item gashacon_breaker_ham = new ItemBaseSword("gashacon_breaker_ham",Tabs.gashacon_breaker_ham).setMaxStackSize(1).setCreativeTab(Tabs.tabex_aid);

			public static Item gashacon_key_slasher = new ItemBaseSword("gashacon_key_slasher",Tabs.gashacon_key_slasher).setMaxStackSize(1).setCreativeTab(Tabs.tabex_aid);

			public static Item gashacon_sword = new ItemBaseSword("gashacon_sword",Tabs.gashacon_sword).setMaxStackSize(1).setCreativeTab(Tabs.tabex_aid);
			public static Item gashacon_sword_ice = new ItemBaseSword("gashacon_sword_ice",Tabs.gashacon_sword).setMaxStackSize(1).setCreativeTab(Tabs.tabex_aid);

			public static Item gashacon_magnum_gun = new Item_gun("gashacon_magnum_gun",Tabs.gashacon_magnum_gun,RiderItems.energy).setMaxStackSize(1).setCreativeTab(Tabs.tabex_aid);

			public static Item gashacon_sparrow_sickle_a = new ItemBaseSword("gashacon_sparrow_sickle_a",Tabs.gashacon_sparrow_sickle).setMaxStackSize(1).setCreativeTab(Tabs.tabex_aid);
			public static Item gashacon_sparrow_sickle_b = new ItemBaseSword("gashacon_sparrow_sickle_b",Tabs.gashacon_sparrow_sickle).setMaxStackSize(1).setCreativeTab(Tabs.tabex_aid);
			public static Item gashacon_sparrow_arrow = new Item_gun("gashacon_sparrow_arrow",Tabs.gashacon_sparrow_arrow,RiderItems.energy).setMaxStackSize(1).setCreativeTab(Tabs.tabex_aid);

			public static Item gashacon_bugvisor = new Item_sword_gun("gashacon_bugvisor",Tabs.parabragun_axe,RiderItems.energy).setMaxStackSize(1).setCreativeTab(Tabs.tabex_aid);

			public static Item gashacon_bugvisor_ii = new Item_sword_gun("gashacon_bugvisor_ii",Tabs.parabragun_axe,RiderItems.energy).setMaxStackSize(1).setCreativeTab(Tabs.tabex_aid);

			public static Item gashacon_bugvisor_g = new Item_sword_gun("gashacon_bugvisor_g",Tabs.parabragun_axe,RiderItems.energy).setMaxStackSize(1).setCreativeTab(Tabs.tabex_aid);

			
			public static Item parabragun_axe = new Item_sword_gun("parabragun_axe",Tabs.parabragun_axe,RiderItems.energy).setMaxStackSize(1).setCreativeTab(Tabs.tabex_aid);

			public static Item ride_weapon = new Item_sword_gun("ride_weapon",ToolMaterial.DIAMOND,RiderItems.energy).setMaxStackSize(1).setCreativeTab(Tabs.tabex_aid);

			public static Item true_brave_sword = new ItemBaseSword("true_brave_sword",Tabs.true_brave_sword).setMaxStackSize(1).setCreativeTab(Tabs.tabex_aid);
			public static Item fuuma_sword = new ItemBaseSword("fuuma_sword",Tabs.fuuma_sword).setMaxStackSize(1).setCreativeTab(Tabs.tabex_aid);

			public static Item bugster_trident = new ItemBaseSword("bugster_trident",ToolMaterial.DIAMOND).setMaxStackSize(1).setCreativeTab(Tabs.tabex_aid);

			public static Item deus_rusher = new ItemBaseSword("deus_rusher",Tabs.gashacon_key_slasher).setMaxStackSize(1).setCreativeTab(Tabs.tabex_aid);
			public static Item deus_rusher_red = new ItemBaseSword("deus_rusher_red",Tabs.gashacon_key_slasher).setMaxStackSize(1).setCreativeTab(Tabs.tabex_aid);

			public static Item ex_aidhead = new item_ex_aidarmor("ex_aidhead",ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.HEAD).setMaxStackSize(1).setCreativeTab(Tabs.tabex_aid);
			public static Item ex_aidtroso = new item_ex_aidarmor2("ex_aidtroso",ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.CHEST).setMaxStackSize(1).setCreativeTab(Tabs.tabex_aid);
			public static Item ex_aidlegs = new item_ex_aidarmor2("ex_aidlegs",ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.LEGS).setMaxStackSize(1).setCreativeTab(Tabs.tabex_aid);

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
	public static Item gamer_driver_anotherparadox = new item_ex_aiddriver("gamer_driver_anotherparadox",ArmorMaterial.DIAMOND, 4, 3,"anotherparadox",2).setMaxStackSize(1).setCreativeTab(Tabs.tabex_aid);
	public static Item gamer_driver_gamedeus_muteki = new item_ex_aiddriver("gamer_driver_gamedeus_muteki",ArmorMaterial.DIAMOND, 4, 3,"gamedeus_muteki",2).setMaxStackSize(1).setCreativeTab(Tabs.tabex_aid);
	public static Item gamer_driver_nico_snipe = new item_ex_aiddriver("gamer_driver_nico_snipe",ArmorMaterial.DIAMOND, 4, 3,"nico_snipe",0).setMaxStackSize(1).setCreativeTab(Tabs.tabex_aid);

	public static Item gamer_driver_genmu = new item_ex_aiddriver("gamer_driver_genmu",ArmorMaterial.DIAMOND, 4, 3,"genmu",0).setMaxStackSize(1).setCreativeTab(Tabs.tabex_aid);
	public static Item gashacon_bugvisor_genmu = new item_ex_aiddriver("gashacon_bugvisor_genmu",ArmorMaterial.DIAMOND, 4, 3,"zombie_genmu",2).setMaxStackSize(1).setCreativeTab(Tabs.tabex_aid);
	public static Item gashacon_bugvisor_ii_poppy = new item_ex_aiddriver("gashacon_bugvisor_ii_poppy",ArmorMaterial.DIAMOND, 4, 3,"poppy",2).setCreativeTab(Tabs.tabex_aid);
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


	public static Item mighty_action_x_gashat = new Item_gashat(0, 0,"mighty_action_x_gashat").setCreativeTab(Tabs.tabex_aid);
	public static Item taddle_quest_gashat = new Item_gashat(0, 0,"taddle_quest_gashat").setCreativeTab(Tabs.tabex_aid);
	public static Item bang_bang_shooting_gashat = new Item_gashat(0, 0,"bang_bang_shooting_gashat").setCreativeTab(Tabs.tabex_aid);
	public static Item bakusou_bike_gashat = new Item_gashat(0, 0,"bakusou_bike_gashat").setCreativeTab(Tabs.tabex_aid);
	public static Item proto_mighty_action_x_gashat = new Item_gashat(0, 0,"proto_mighty_action_x_gashat").setCreativeTab(Tabs.tabex_aid);
	public static Item proto_taddle_quest_gashat = new Item_gashat(0, 0,"proto_taddle_quest_gashat").setCreativeTab(Tabs.tabex_aid);
	public static Item proto_bang_bang_shooting_gashat = new Item_gashat(0, 0,"proto_bang_bang_shooting_gashat").setCreativeTab(Tabs.tabex_aid);
	public static Item proto_bakusou_bike_gashat = new Item_gashat(4, 0,"proto_bakusou_bike_gashat").setCreativeTab(Tabs.tabex_aid);

	public static Item proto_mighty_action_x_gashat_origin = new Item_gashat(0, 0,"proto_mighty_action_x_gashat_origin").setCreativeTab(Tabs.tabex_aid);
	public static Item dangerous_zombie_gashat = new Item_gashat(0, 25,"dangerous_zombie_gashat").setCreativeTab(Tabs.tabex_aid);
	public static Item kamen_rider_chronicle_gashat = new Item_gashat(4, 0,"kamen_rider_chronicle_gashat").setCreativeTab(Tabs.tabex_aid);
	public static Item toki_meki_crisis_gashat = new Item_gashat(4, 0,"toki_meki_crisis_gashat").setCreativeTab(Tabs.tabex_aid);

	public static Item mighty_brothers_xx_gashat = new Item_gashat(0, 26,"mighty_brothers_xx_gashat").setCreativeTab(Tabs.tabex_aid);
	public static Item maximum_mighty_x_gashat = new Item_gashat(0, 0,"maximum_mighty_x_gashat").setCreativeTab(Tabs.tabex_aid);
	public static Item hyper_muteki_gashat = new Item_gashat(0, 0,"hyper_muteki_gashat").setCreativeTab(Tabs.tabex_aid);
	public static Item mighty_creator_vrx_gashat = new Item_gashat(0, 29,"mighty_creator_vrx_gashat").setCreativeTab(Tabs.tabex_aid);

	public static Item knock_out_fighter_2_gashat = new Item_gashat(0, 30,"knock_out_fighter_2_gashat").setCreativeTab(Tabs.tabex_aid);
	public static Item gashat_gear_dual_another = new Item_gashat(4, 0,"gashat_gear_dual_another").setCreativeTab(Tabs.tabex_aid);

	public static Item gamedeus_hyper_muteki_gashat = new Item_ore("gamedeus_hyper_muteki_gashat").setCreativeTab(Tabs.tabex_aid);

	public static Item kamen_rider_build_gashat = new Item_gashat(4, 0,"kamen_rider_build_gashat").setCreativeTab(Tabs.tabex_aid);
	public static Item kaigan_ghost_gashat = new Item_gashat(0, 0,"kaigan_ghost_gashat").setCreativeTab(Tabs.tabex_aid);
	public static Item full_throttle_drive_gashat = new Item_gashat(0, 0,"full_throttle_drive_gashat").setCreativeTab(Tabs.tabex_aid);
	public static Item toukenden_gaim_gashat = new Item_gashat(0, 0,"toukenden_gaim_gashat").setCreativeTab(Tabs.tabex_aid);
	public static Item magic_the_wizard_gashat = new Item_gashat(0, 0,"magic_the_wizard_gashat").setCreativeTab(Tabs.tabex_aid);
	public static Item space_galaxy_fourze_gashat = new Item_gashat(0, 0,"space_galaxy_fourze_gashat").setCreativeTab(Tabs.tabex_aid);
	public static Item jungle_ooo_gashat = new Item_gashat(0, 0,"jungle_ooo_gashat").setCreativeTab(Tabs.tabex_aid);
	public static Item detective_double_gashat = new Item_gashat(0, 0,"detective_double_gashat").setCreativeTab(Tabs.tabex_aid);
	public static Item barcode_warrior_decade_gashat = new Item_gashat(0, 0,"barcode_warrior_decade_gashat").setCreativeTab(Tabs.tabex_aid);
	public static Item dokidoki_makai_castle_kiva_gashat = new Item_gashat(0, 0,"dokidoki_makai_castle_kiva_gashat").setCreativeTab(Tabs.tabex_aid);
	public static Item time_express_den_o_gashat = new Item_gashat(0, 0,"time_express_den_o_gashat").setCreativeTab(Tabs.tabex_aid);
	public static Item insect_wars_kabuto_gashat = new Item_gashat(0, 0,"insect_wars_kabuto_gashat").setCreativeTab(Tabs.tabex_aid);
	public static Item taiko_master_hibik_gashat = new Item_gashat(0, 0,"taiko_master_hibik_gashat").setCreativeTab(Tabs.tabex_aid);
	public static Item king_of_poker_blade_gashat = new Item_gashat(0, 0,"king_of_poker_blade_gashat").setCreativeTab(Tabs.tabex_aid);
	public static Item moshi_moshi_faiz_gashat = new Item_gashat(0, 0,"moshi_moshi_faiz_gashat").setCreativeTab(Tabs.tabex_aid);
	public static Item mirror_labryinth_ryuki_gashat = new Item_gashat(0, 0,"mirror_labryinth_ryuki_gashat").setCreativeTab(Tabs.tabex_aid);
	public static Item agito_of_the_sun_gashat = new Item_gashat(0, 0,"agito_of_the_sun_gashat").setCreativeTab(Tabs.tabex_aid);
	public static Item adventure_guy_kuuga_gashat = new Item_gashat(0, 0,"adventure_guy_kuuga_gashat").setCreativeTab(Tabs.tabex_aid);
	public static Item lets_go_ichigou_gashat = new Item_gashat(0, 0,"lets_go_ichigou_gashat").setCreativeTab(Tabs.tabex_aid);
			

	public static Item gekitotsu_robots_gashat = new Item_gashat(1, 1,"gekitotsu_robots_gashat").setCreativeTab(Tabs.tabex_aid);
	public static Item proto_gekitotsu_robots_gashat = new Item_gashat(1, 2,"proto_gekitotsu_robots_gashat").setCreativeTab(Tabs.tabex_aid);

	public static Item doremifa_beat_gashat = new Item_gashat(1, 3,"doremifa_beat_gashat").setCreativeTab(Tabs.tabex_aid);
	public static Item proto_doremifa_beat_gashat = new Item_gashat(1, 4,"proto_doremifa_beat_gashat").setCreativeTab(Tabs.tabex_aid);

	public static Item jet_combat_gashat = new Item_gashat(1, 5,"jet_combat_gashat").setCreativeTab(Tabs.tabex_aid);
	public static Item proto_jet_combat_gashat = new Item_gashat(1, 6,"proto_jet_combat_gashat").setCreativeTab(Tabs.tabex_aid);

	public static Item giri_giri_chambara_gashat = new Item_gashat(0, 14,"giri_giri_chambara_gashat").setCreativeTab(Tabs.tabex_aid);
	public static Item proto_giri_giri_chambara_gashat = new Item_gashat(0, 15,"proto_giri_giri_chambara_gashat").setCreativeTab(Tabs.tabex_aid);

	public static Item shakariki_sports_gashat = new Item_gashat(1, 7,"shakariki_sports_gashat").setCreativeTab(Tabs.tabex_aid);
	public static Item proto_shakariki_sports_gashat = new Item_gashat(1, 8,"proto_shakariki_sports_gashat").setCreativeTab(Tabs.tabex_aid);



	public static Item drago_knight_hunter_z_gashat = new Item_gashat(1, 9,"drago_knight_hunter_z_gashat").setCreativeTab(Tabs.tabex_aid);
	public static Item proto_drago_knight_hunter_z_gashat = new Item_gashat(4, 0,"proto_drago_knight_hunter_z_gashat").setCreativeTab(Tabs.tabex_aid);

	public static Item ju_ju_burger_gashat = new Item_gashat(1, 17,"ju_ju_burger_gashat").setCreativeTab(Tabs.tabex_aid);
	public static Item night_of_safari_gashat = new Item_gashat(1, 21,"night_of_safari_gashat").setCreativeTab(Tabs.tabex_aid);

	public static Item taddle_fantasy_gashat = new Item_gashat(1, 22,"taddle_fantasy_gashat").setCreativeTab(Tabs.tabex_aid);
	public static Item bang_bang_simulation_gashat = new Item_gashat(1, 24,"bang_bang_simulation_gashat").setCreativeTab(Tabs.tabex_aid);

	public static Item perfect_puzzle_gashat = new Item_gashat(0, 0,"perfect_puzzle_gashat").setCreativeTab(Tabs.tabex_aid);
	public static Item knock_out_fighter_gashat = new Item_gashat(0, 1,"knock_out_fighter_gashat").setCreativeTab(Tabs.tabex_aid);


	public static Item taddle_legacy_gashat = new Item_gashat(1, 23,"taddle_legacy_gashat").setCreativeTab(Tabs.tabex_aid);
	public static Item hurricane_ninja_gashat = new Item_gashat(4, 0,"hurricane_ninja_gashat").setCreativeTab(Tabs.tabex_aid);

	public static Item bang_bang_tank_gashat = new Item_gashat(4, 0,"bang_bang_tank_gashat").setCreativeTab(Tabs.tabex_aid);
	public static Item doctor_mighty_xx_gashat = new Item_gashat(4, 0,"doctor_mighty_xx_gashat").setCreativeTab(Tabs.tabex_aid);
	public static Item god_maximum_mighty_x_gashat = new Item_gashat(0, 0,"god_maximum_mighty_x_gashat").setCreativeTab(Tabs.tabex_aid);

	public static Item proto_bakusou_bike_combi_fukkatsu_gashat = new Item_gashat(0, 16,"proto_bakusou_bike_combi_fukkatsu_gashat").setCreativeTab(Tabs.tabex_aid);


	public static Item pac_adventure_gashat = new Item_gashat(1, 18,"pac_adventure_gashat").setCreativeTab(Tabs.tabex_aid);
	public static Item famitsa_gashat = new Item_gashat(1, 19,"famitsa_gashat").setCreativeTab(Tabs.tabex_aid);
	public static Item xevious_gashat = new Item_gashat(1, 20,"xevious_gashat").setCreativeTab(Tabs.tabex_aid);
	public static Item galaxian_gashat = new Item_gashat(1, 28,"galaxian_gashat").setCreativeTab(Tabs.tabex_aid);
	public static Item taiko_no_tatsujin_gashat = new Item_gashat(4, 0,"taiko_no_tatsujin_gashat").setCreativeTab(Tabs.tabex_aid);
	public static Item gabarizing_gashat = new Item_gashat(4, 0,"gabarizing_gashat").setCreativeTab(Tabs.tabex_aid);

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
			
	public static Item gamer_driver_ex_aid_lv1 = new Item_ore("gamer_driver_ex_aid_lv1");
	public static Item gamer_driver_brave_lv1 = new Item_ore("gamer_driver_brave_lv1");
	public static Item gamer_driver_snipe_lv1 = new Item_ore("gamer_driver_snipe_lv1");
	public static Item gamer_driver_lazer_lv1 = new Item_ore("gamer_driver_lazer_lv1");
	public static Item gamer_driver_genm_lv1 = new Item_ore("gamer_driver_genm_lv1");
	public static Item gamer_driver_proto_lv1 = new Item_ore("gamer_driver_proto_lv1");
		
	public static Item gamer_driver_ghost = new Item_ore("gamer_driver_ghost");
	public static Item gamer_driver_drive = new Item_ore("gamer_driver_drive");
	public static Item gamer_driver_gaim = new Item_ore("gamer_driver_gaim");
	public static Item gamer_driver_wizard = new Item_ore("gamer_driver_wizard");
	public static Item gamer_driver_fourze = new Item_ore("gamer_driver_fourze");
	public static Item gamer_driver_ooo = new Item_ore("gamer_driver_ooo");
	public static Item gamer_driver_w = new Item_ore("gamer_driver_w");
	//no need to add decade
	public static Item gamer_driver_kiva = new Item_ore("gamer_driver_kiva");
	//used Fourze for Den-O
	//used Drive for Kabuto
	public static Item gamer_driver_hibiki = new Item_ore("gamer_driver_hibiki");
	public static Item gamer_driver_blade = new Item_ore("gamer_driver_blade");
	public static Item gamer_driver_faiz = new Item_ore("gamer_driver_faiz");
	public static Item gamer_driver_ryuki = new Item_ore("gamer_driver_ryuki");
	public static Item gamer_driver_agito = new Item_ore("gamer_driver_agito");
	//used Drive for kuuga
	public static Item gamer_driver_ichigo = new Item_ore("gamer_driver_ichigo");
			
			
	//public static Item gamer_driver_ = new Item_ore("gamer_driver_");
			
			
	//build
			
	public static Item smash_bottle = new Item_ore("smash_bottle").setCreativeTab(Tabs.tabbuild);
			
	public static Item drill_crusher = new Item_sword_gun("drill_crusher",Tabs.musou_saber,RiderItems.energy).setMaxStackSize(1).setCreativeTab(Tabs.tabbuild);
	public static Item hawk_gatlinger = new Item_gun("hawk_gatlinger",Tabs.gashacon_magnum_gun,RiderItems.energy).setMaxStackSize(1).setCreativeTab(Tabs.tabbuild);
	public static Item koma_ninpoutou = new ItemBaseSword("koma_ninpoutou",Tabs.gashacon_breaker).setMaxStackSize(1).setCreativeTab(Tabs.tabbuild);
	public static Item kaizoku_hassha = new Item_gun("kaizoku_hassha",Tabs.kaizoku_hassha,RiderItems.energy).setMaxStackSize(1).setCreativeTab(Tabs.tabbuild);
	public static Item twinbreaker_sword = new Item_sword_gun("twinbreaker_sword",Tabs.musou_saber,RiderItems.energy).setMaxStackSize(1).setCreativeTab(Tabs.tabbuild);
	public static Item beat_crosser = new ItemBaseSword("beat_crosser",Tabs.gashacon_breaker).setMaxStackSize(1).setCreativeTab(Tabs.tabbuild);
	public static Item full_bottle_buster = new Item_sword_gun("full_bottle_buster",Tabs.faiz_blaster,RiderItems.energy).setMaxStackSize(1).setCreativeTab(Tabs.tabbuild);
	public static Item magma_knuckle = new ItemBaseSword("magma_knuckle",Tabs.dogga_hammer).setMaxStackSize(1).setCreativeTab(Tabs.tabbuild);
	public static Item blizzard_knuckle = new ItemBaseSword("blizzard_knuckle",Tabs.dogga_hammer).setMaxStackSize(1).setCreativeTab(Tabs.tabbuild);
	
	public static Item pandora_panel_green = new item_panel("pandora_panel_green", Green).setCreativeTab(Tabs.tabbuild);
	public static Item pandora_panel_red = new item_panel("pandora_panel_red", Red).setCreativeTab(Tabs.tabbuild);
	public static Item pandora_panel_blue = new item_panel("pandora_panel_blue", Blue).setCreativeTab(Tabs.tabbuild);
	public static Item pandora_panel_black = new item_panel("pandora_panel_black", Black).setCreativeTab(Tabs.tabbuild);
	public static Item pandora_panel_white = new item_panel("pandora_panel_white", White).setCreativeTab(Tabs.tabbuild);

	public static Item buildhead = new item_buildarmor2("buildhead",ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.HEAD).setMaxStackSize(1).setCreativeTab(Tabs.tabbuild);
	public static Item buildtroso = new item_buildarmor("buildtroso",ArmorMaterial.DIAMOND, 4,EntityEquipmentSlot.CHEST).setMaxStackSize(1).setCreativeTab(Tabs.tabbuild);
	public static Item buildlegs = new item_buildarmor2("buildlegs",ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.LEGS).setMaxStackSize(1).setCreativeTab(Tabs.tabbuild);

	public static Item build_driver = new item_builddriver("build_driver",ArmorMaterial.DIAMOND, 4).setMaxStackSize(1).setCreativeTab(Tabs.tabbuild);
	public static Item build_driver_cross_z = new item_builddriver("build_driver_cross_z",ArmorMaterial.DIAMOND, 4).setMaxStackSize(1).setCreativeTab(Tabs.tabbuild);
	public static Item build_driver_grease = new item_builddriver("build_driver_grease",ArmorMaterial.DIAMOND, 4).setMaxStackSize(1).setCreativeTab(Tabs.tabbuild);
	public static Item build_driver_rogue = new item_builddriver("build_driver_rogue",ArmorMaterial.DIAMOND, 4).setMaxStackSize(1).setCreativeTab(Tabs.tabbuild);
	public static Item build_driver_blood = new item_builddriver("build_driver_blood",ArmorMaterial.DIAMOND, 4).setMaxStackSize(1).setCreativeTab(Tabs.tabbuild);
	public static Item build_driver_killbas = new item_builddriver("build_driver_killbas",ArmorMaterial.DIAMOND, 4).setMaxStackSize(1).setCreativeTab(Tabs.tabbuild);
			
	public static Item sclash_driver_grease = new item_builddriver("sclash_driver_grease",ArmorMaterial.DIAMOND, 4).setMaxStackSize(1).setCreativeTab(Tabs.tabbuild);
	public static Item sclash_driver_cross_z_charge = new item_builddriver("sclash_driver_cross_z_charge",ArmorMaterial.DIAMOND, 4).setMaxStackSize(1).setCreativeTab(Tabs.tabbuild);
	public static Item sclash_driver_rogue = new item_builddriver("sclash_driver_rogue",ArmorMaterial.DIAMOND, 4).setMaxStackSize(1).setCreativeTab(Tabs.tabbuild);

	public static Item evol_driver_evol = new item_builddriver("evol_driver_evol",ArmorMaterial.DIAMOND, 4).setMaxStackSize(1).setCreativeTab(Tabs.tabbuild);
	public static Item evol_driver_mad_rogue = new item_builddriver("evol_driver_mad_rogue",ArmorMaterial.DIAMOND, 4).setMaxStackSize(1).setCreativeTab(Tabs.tabbuild);


	public static Item transteamgun = new Item_transteamgun("transteamgun",Tabs.den_dengu,RiderItems.energy).setMaxStackSize(1).setCreativeTab(Tabs.tabbuild);
	public static Item transteamgun_2 = new item_builddriver("transteamgun_2",ArmorMaterial.DIAMOND, 4).setMaxStackSize(1);
	public static Item transteamgun_rifle = new Item_gun("transteamgun_rifle",Tabs.den_dengu,RiderItems.energy).setMaxStackSize(1).setCreativeTab(Tabs.tabbuild);

	public static Item steam_blade = new ItemBaseSword("steam_blade",Tabs.den_denso).setMaxStackSize(1).setCreativeTab(Tabs.tabbuild);

	public static Item nebulasteamgun = new Item_nebulasteamgun("nebulasteamgun",Tabs.den_dengu,RiderItems.energy).setMaxStackSize(1).setCreativeTab(Tabs.tabbuild);
	public static Item nebulasteamgun_2 = new item_builddriver("nebulasteamgun_2",ArmorMaterial.DIAMOND, 4).setMaxStackSize(1);
	public static Item nebulasteamgun_rifle = new Item_gun("nebulasteamgun_rifle",Tabs.den_dengu,RiderItems.energy).setMaxStackSize(1).setCreativeTab(Tabs.tabbuild);

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
	public static Item rabbit_gold_full_bottle = new Item_full_bottle(33, "3","rabbit_gold_full_bottle",0).setCreativeTab(Tabs.tabbuild);
	public static Item bat_full_bottle_2 = new Item_full_bottle(34, "3","bat_full_bottle_2",2).setCreativeTab(Tabs.tabbuild);
	public static Item same_full_bottle = new Item_full_bottle(35, "3","same_full_bottle",2).setCreativeTab(Tabs.tabbuild);
	public static Item hachi_full_bottle = new Item_full_bottle(36, "3","hachi_full_bottle",2).setCreativeTab(Tabs.tabbuild);
	public static Item sai_full_bottle = new Item_full_bottle(37, "3","sai_full_bottle",2).setCreativeTab(Tabs.tabbuild);
	public static Item scorpion_full_bottle = new Item_full_bottle(38, "3","scorpion_full_bottle",0).setCreativeTab(Tabs.tabbuild);

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
	public static Item obake_full_bottle = new Item_full_bottle(20, "3","obake_full_bottle",0).setCreativeTab(Tabs.tabbuild);
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
	public static Item dragon_silver_full_bottle = new Item_full_bottle(29, "1","dragon_silver_full_bottle",0).setCreativeTab(Tabs.tabbuild);
	public static Item engine_full_bottle = new Item_full_bottle(30, "1","engine_full_bottle",2).setCreativeTab(Tabs.tabbuild);
	public static Item bike_full_bottle = new Item_full_bottle(31, "1","bike_full_bottle",2).setCreativeTab(Tabs.tabbuild);
	public static Item magnet_full_bottle = new Item_full_bottle(32, "1","magnet_full_bottle",2).setCreativeTab(Tabs.tabbuild);
	public static Item submarine_full_bottle = new Item_full_bottle(33, "1","submarine_full_bottle",2).setCreativeTab(Tabs.tabbuild);
	public static Item dryer_full_bottle = new Item_full_bottle(34, "1","dryer_full_bottle",2).setCreativeTab(Tabs.tabbuild);
	public static Item gold_full_bottle = new Item_full_bottle(35, "1","gold_full_bottle",0).setCreativeTab(Tabs.tabbuild);

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
	public static Item low_rabbit_full_bottle = new Item_ore("low_rabbit_full_bottle").setCreativeTab(Tabs.tabbuild);
			
	public static Item ex_aid_full_bottle = new Item_ore("ex_aid_full_bottle").setCreativeTab(Tabs.tabbuild);
	public static Item ghost_full_bottle = new Item_ore("ghost_full_bottle").setCreativeTab(Tabs.tabbuild);
	public static Item drive_full_bottle = new Item_ore("drive_full_bottle").setCreativeTab(Tabs.tabbuild);
	public static Item gaim_full_bottle = new Item_ore("gaim_full_bottle").setCreativeTab(Tabs.tabbuild);
	public static Item wizard_full_bottle = new Item_ore("wizard_full_bottle").setCreativeTab(Tabs.tabbuild);
	public static Item fourze_full_bottle = new Item_ore("fourze_full_bottle").setCreativeTab(Tabs.tabbuild);

	public static Item dragon_sclashjelly = new Item_ore("dragon_sclashjelly").setCreativeTab(Tabs.tabbuild);
	public static Item robot_sclashjelly = new Item_ore("robot_sclashjelly").setCreativeTab(Tabs.tabbuild);
	public static Item crocodile_crack_full_bottle = new Item_ore("crocodile_crack_full_bottle").setCreativeTab(Tabs.tabbuild);

	public static Item bat_full_bottle = new Item_full_bottle(0, "4","bat_full_bottle",0).setCreativeTab(Tabs.tabbuild);
	public static Item cobra_full_bottle = new Item_full_bottle(1, "4","cobra_full_bottle",0).setCreativeTab(Tabs.tabbuild);
	public static Item fukurou_full_bottle = new Item_ore("fukurou_full_bottle").setCreativeTab(Tabs.tabbuild);
	public static Item kuwagata_full_bottle = new Item_ore("kuwagata_full_bottle").setCreativeTab(Tabs.tabbuild);
	public static Item castle_full_bottle = new Item_ore("castle_full_bottle").setCreativeTab(Tabs.tabbuild);

	public static Item gear_engine = new Item_full_bottle(0, "5","gear_engine",0).setCreativeTab(Tabs.tabbuild);
	public static Item gear_remocon = new Item_full_bottle(1, "5","gear_remocon",0).setCreativeTab(Tabs.tabbuild);
	public static Item gear_red = new Item_full_bottle(2, "5","gear_red",0).setCreativeTab(Tabs.tabbuild);
	public static Item gear_blue = new Item_full_bottle(3, "5","gear_blue",0).setCreativeTab(Tabs.tabbuild);
			
	public static Item cobra_evol_bottle = new Item_full_bottle(0, "6","cobra_evol_bottle",0).setCreativeTab(Tabs.tabbuild);
	public static Item rider_system_evol_bottle = new Item_ore("rider_system_evol_bottle").setCreativeTab(Tabs.tabbuild);
	public static Item dragon_evol_bottle = new Item_full_bottle(1, "6","dragon_evol_bottle",0).setCreativeTab(Tabs.tabbuild);
	public static Item rabbit_evol_bottle = new Item_full_bottle(2, "6","rabbit_evol_bottle",0).setCreativeTab(Tabs.tabbuild);

	public static Item dragon_magma_full_bottle = new Item_full_bottle(1, "7","dragon_magma_full_bottle",0).setCreativeTab(Tabs.tabbuild);
	public static Item dragon_evol_bottle_gold = new Item_full_bottle(2, "7","dragon_evol_bottle_gold",0).setCreativeTab(Tabs.tabbuild);
	public static Item muscle_galaxy_full_bottle = new Item_full_bottle(3, "7","muscle_galaxy_full_bottle",0).setCreativeTab(Tabs.tabbuild);
	public static Item north_blizzard_full_bottle = new Item_ore("north_blizzard_full_bottle").setCreativeTab(Tabs.tabbuild);
	public static Item prime_rogue_full_bottle = new Item_ore("prime_rogue_full_bottle").setCreativeTab(Tabs.tabbuild);
			
	public static Item evol_trigger = new Item_full_bottle(3, "6","evol_trigger",0).setCreativeTab(Tabs.tabbuild);
			
	public static Item lost_bat_full_bottle = new Item_ore("lost_bat_full_bottle").setCreativeTab(Tabs.tabbuild);
	public static Item lost_cobra_full_bottle = new Item_ore("lost_cobra_full_bottle").setCreativeTab(Tabs.tabbuild);
	public static Item lost_castle_full_bottle = new Item_ore("lost_castle_full_bottle").setCreativeTab(Tabs.tabbuild);
	public static Item lost_kuwagata_full_bottle = new Item_ore("lost_kuwagata_full_bottle").setCreativeTab(Tabs.tabbuild);
	public static Item lost_fukurou_full_bottle = new Item_ore("lost_fukurou_full_bottle").setCreativeTab(Tabs.tabbuild);
	public static Item lost_hammer_full_bottle = new Item_ore("lost_hammer_full_bottle").setCreativeTab(Tabs.tabbuild);
	public static Item lost_shimauma_full_bottle = new Item_ore("lost_shimauma_full_bottle").setCreativeTab(Tabs.tabbuild);
	public static Item lost_spanner_full_bottle = new Item_ore("lost_spanner_full_bottle").setCreativeTab(Tabs.tabbuild);
	public static Item lost_hasami_full_bottle = new Item_ore("lost_hasami_full_bottle").setCreativeTab(Tabs.tabbuild);
	public static Item lost_cd_full_bottle = new Item_ore("lost_cd_full_bottle").setCreativeTab(Tabs.tabbuild);
	
	public static Item golden_bangle = new Item_ore("golden_bangle").setCreativeTab(Tabs.tabbuild);
	public static Item Pandora_bottle = new Item_ore("pandora_bottle").setCreativeTab(Tabs.tabbuild);
	public static Item nebula_gas_sample = new Item_ore("nebula_gas_sample").setCreativeTab(Tabs.tabbuild);
	public static Item genius_full_bottle_blank = new Item_ore("genius_full_bottle_blank").setCreativeTab(Tabs.tabbuild);
			
	public static Item build_driver_rabbit = new Item_ore("build_driver_rabbit");
	public static Item build_driver_gorilla = new Item_ore("build_driver_gorilla");
	public static Item build_driver_taka = new Item_ore("build_driver_taka");
	public static Item build_driver_harinezumi = new Item_ore("build_driver_harinezumi");
	public static Item build_driver_ninja = new Item_ore("build_driver_ninja");
	public static Item build_driver_panda = new Item_ore("build_driver_panda");
	public static Item build_driver_lion = new Item_ore("build_driver_lion");
	public static Item build_driver_dragon = new Item_ore("build_driver_dragon");
	public static Item build_driver_santa = new Item_ore("build_driver_santa");
	public static Item build_driver_orange = new Item_ore("build_driver_orange");
	public static Item build_driver_doctor = new Item_ore("build_driver_doctor");
	public static Item build_driver_dog = new Item_ore("build_driver_dog");
	public static Item build_driver_mahoutsukai = new Item_ore("build_driver_mahoutsukai");
	public static Item build_driver_tantei = new Item_ore("build_driver_tantei");
	public static Item build_driver_kaizoku = new Item_ore("build_driver_kaizoku");
	public static Item build_driver_octopus = new Item_ore("build_driver_octopus");
	public static Item build_driver_phoenix = new Item_ore("build_driver_phoenix");
	public static Item build_driver_kuma = new Item_ore("build_driver_kuma");
	public static Item build_driver_momotaros = new Item_ore("build_driver_momotaros");
	public static Item build_driver_yujou = new Item_ore("build_driver_yujou");
	public static Item build_driver_obake = new Item_ore("build_driver_obake");
	public static Item build_driver_wolf = new Item_ore("build_driver_wolf");
	public static Item build_driver_beetle = new Item_ore("build_driver_beetle");
	public static Item build_driver_card = new Item_ore("build_driver_card");
	public static Item build_driver_rose = new Item_ore("build_driver_rose");
	public static Item build_driver_tora = new Item_ore("build_driver_tora");
	public static Item build_driver_kujira = new Item_ore("build_driver_kujira");
	public static Item build_driver_kirin = new Item_ore("build_driver_kirin");
	public static Item build_driver_unicorn = new Item_ore("build_driver_unicorn");
	public static Item build_driver_turtle = new Item_ore("build_driver_turtle");
	public static Item build_driver_deer = new Item_ore("build_driver_deer");
	public static Item build_driver_penguin = new Item_ore("build_driver_penguin");
	public static Item build_driver_spider = new Item_ore("build_driver_spider");
	public static Item build_driver_rabbit_gold = new Item_ore("build_driver_rabbit_gold");
	public static Item build_driver_scorpion = new Item_ore("build_driver_scorpion");
	public static Item build_driver_sai = new Item_ore("build_driver_sai");
			
	public static Item build_driver_tank = new Item_ore("build_driver_tank");
	public static Item build_driver_diamond = new Item_ore("build_driver_diamond");
	public static Item build_driver_gatling = new Item_ore("build_driver_gatling");
	public static Item build_driver_soujiki = new Item_ore("build_driver_soujiki");
	public static Item build_driver_comic = new Item_ore("build_driver_comic");
	public static Item build_driver_rocket = new Item_ore("build_driver_rocket");
	public static Item build_driver_shoubousha = new Item_ore("build_driver_shoubousha");
	public static Item build_driver_lock = new Item_ore("build_driver_lock");
	public static Item build_driver_cake = new Item_ore("build_driver_cake");
	public static Item build_driver_medal = new Item_ore("build_driver_medal");
	public static Item build_driver_game = new Item_ore("build_driver_game");
	public static Item build_driver_mic = new Item_ore("build_driver_mic");
	public static Item build_driver_usb_memory = new Item_ore("build_driver_usb_memory");
	public static Item build_driver_densha = new Item_ore("build_driver_densha");
	public static Item build_driver_light = new Item_ore("build_driver_light");
	public static Item build_driver_robo = new Item_ore("build_driver_robo");
	public static Item build_driver_televi = new Item_ore("build_driver_televi");
	public static Item build_driver_parka = new Item_ore("build_driver_parka");
	public static Item build_driver_smartphone = new Item_ore("build_driver_smartphone");
	public static Item build_driver_camera = new Item_ore("build_driver_camera");
	public static Item build_driver_helicopter = new Item_ore("build_driver_helicopter");
	public static Item build_driver_ufo = new Item_ore("build_driver_ufo");
	public static Item build_driver_jet = new Item_ore("build_driver_jet");
	public static Item build_driver_cyclone = new Item_ore("build_driver_cyclone");
	public static Item build_driver_eraser = new Item_ore("build_driver_eraser");
	public static Item build_driver_watch = new Item_ore("build_driver_watch");
	public static Item build_driver_pyramid = new Item_ore("build_driver_pyramid");
	public static Item build_driver_skateboard = new Item_ore("build_driver_skateboard");
	public static Item build_driver_fridge = new Item_ore("build_driver_fridge");
	public static Item build_driver_dragon_silver = new Item_ore("build_driver_dragon_silver");
	public static Item build_driver_gold = new Item_ore("build_driver_gold");
			
			
	public static Item build_driver_sp = new Item_ore("build_driver_sp");
	public static Item build_driver_hazard = new Item_ore("build_driver_hazard");
	public static Item build_driver_hazard_rabbit = new Item_ore("build_driver_hazard_rabbit");
	public static Item build_driver_hazard_tank = new Item_ore("build_driver_hazard_tank");
	public static Item build_driver_genius = new Item_ore("build_driver_genius");
	public static Item build_driver_cross_z_build = new Item_ore("build_driver_cross_z_build");
			
	public static Item hawk_gatling_wings = new Item_ore("hawk_gatling_wings");
	public static Item phoenix_robo_wings = new Item_ore("phoenix_robo_wings");	
	public static Item night_rogue_wings = new Item_ore("night_rogue_wings");
	public static Item mad_rogue_wings = new Item_ore("mad_rogue_wings");
			
	public static Item evol_driver_cobra = new Item_ore("evol_driver_cobra");
	public static Item evol_driver_dragon = new Item_ore("evol_driver_dragon");
	public static Item evol_driver_rabbit = new Item_ore("evol_driver_rabbit");
	public static Item evol_driver_blackhole = new Item_ore("evol_driver_blackhole");

	public static Item build_driver_cross_z_dragon = new Item_ore("build_driver_cross_z_dragon");
	public static Item build_driver_magma = new Item_ore("build_driver_magma");
	public static Item build_driver_cross_z_great = new Item_ore("build_driver_cross_z_great");
	public static Item build_driver_galaxy = new Item_ore("build_driver_galaxy");

			
	//public static Item build_driver_ = new Item_ore("build_driver_");

	//Zi-O


	public static Item gaim_armor_wings = new Item_ore("gaim_armor_wings");
	
	public static Item zi_ohead = new item_zi_oarmor("zi_ohead",ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.HEAD).setMaxStackSize(1).setCreativeTab(Tabs.tabzi_o);
	public static Item zi_otroso = new item_zi_oarmor2("zi_otroso",ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.CHEST).setMaxStackSize(1).setCreativeTab(Tabs.tabzi_o);
	public static Item zi_olegs = new item_zi_oarmor2("zi_olegs",ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.LEGS).setMaxStackSize(1).setCreativeTab(Tabs.tabzi_o);

	public static Item ziku_driver_zi_o = new item_zikudriver("ziku_driver_zi_o",ArmorMaterial.DIAMOND, 4, "zi_o",0).setMaxStackSize(1).setCreativeTab(Tabs.tabzi_o);
	public static Item ziku_driver_geiz = new item_zikudriver("ziku_driver_geiz",ArmorMaterial.DIAMOND, 4, "geiz",0).setMaxStackSize(1).setCreativeTab(Tabs.tabzi_o);
	public static Item oma_ziku_driver = new item_zikudriver("oma_ziku_driver",ArmorMaterial.DIAMOND, 4, "oma_zi_o",0).setMaxStackSize(1).setCreativeTab(Tabs.tabzi_o);

	public static Item zikan_grade = new Item_sword_gun("zikan_grade",Tabs.musou_saber,RiderItems.energy).setMaxStackSize(1).setCreativeTab(Tabs.tabzi_o);
	public static Item zikan_zax = new Item_sword_gun("zikan_zax",Tabs.musou_saber,RiderItems.energy).setMaxStackSize(1).setCreativeTab(Tabs.tabzi_o);
	public static Item drill_crusher_crusher = new ItemBaseSword("drill_crusher_crusher",Tabs.den_denaxe).setMaxStackSize(1).setCreativeTab(Tabs.tabzi_o);
	public static Item faiz_phone_x = new Item_gun("faiz_phone_x",Tabs.den_dengu,RiderItems.energy).setMaxStackSize(1).setCreativeTab(Tabs.tabzi_o);
            
	public static Item zi_o_ridewatch = new Item_ridewatches(0, 0,"zi_o_ridewatch").setCreativeTab(Tabs.tabzi_o);
	public static Item geiz_ridewatch = new Item_ridewatches(0, 0,"geiz_ridewatch").setCreativeTab(Tabs.tabzi_o);

	public static Item build_ridewatch = new Item_ridewatches(1, 1,"build_ridewatch").setCreativeTab(Tabs.tabzi_o);
	public static Item cross_z_ridewatch = new Item_ore("cross_z_ridewatch").setCreativeTab(Tabs.tabzi_o);
	public static Item exaid_ridewatch = new Item_ridewatches(1, 2,"exaid_ridewatch").setCreativeTab(Tabs.tabzi_o);
	public static Item genm_ridewatch = new Item_ridewatches(1, 19,"genm_ridewatch").setCreativeTab(Tabs.tabzi_o);
	public static Item ghost_ridewatch = new Item_ridewatches(1, 3,"ghost_ridewatch").setCreativeTab(Tabs.tabzi_o);
	public static Item drive_ridewatch = new Item_ridewatches(1, 4,"drive_ridewatch").setCreativeTab(Tabs.tabzi_o);
	public static Item gaim_ridewatch = new Item_ridewatches(1, 5,"gaim_ridewatch").setCreativeTab(Tabs.tabzi_o);
	public static Item wizard_ridewatch = new Item_ridewatches(1, 6,"wizard_ridewatch").setCreativeTab(Tabs.tabzi_o);
	public static Item beast_ridewatch = new Item_ore("beast_ridewatch").setCreativeTab(Tabs.tabzi_o);
	public static Item fourze_ridewatch = new Item_ridewatches(1, 7,"fourze_ridewatch").setCreativeTab(Tabs.tabzi_o);
	public static Item ooo_ridewatch = new Item_ridewatches(1, 8,"ooo_ridewatch").setCreativeTab(Tabs.tabzi_o);
	public static Item w_ridewatch = new Item_ridewatches(1, 9,"w_ridewatch").setCreativeTab(Tabs.tabzi_o);
	public static Item kiva_ridewatch = new Item_ridewatches(1, 10,"kiva_ridewatch").setCreativeTab(Tabs.tabzi_o);
	public static Item deno_ridewatch = new Item_ridewatches(1, 11,"deno_ridewatch").setCreativeTab(Tabs.tabzi_o);
	public static Item kabuto_ridewatch = new Item_ridewatches(1, 12,"kabuto_ridewatch").setCreativeTab(Tabs.tabzi_o);
	public static Item hibiki_ridewatch = new Item_ridewatches(1, 13,"hibiki_ridewatch").setCreativeTab(Tabs.tabzi_o);
	public static Item blade_ridewatch = new Item_ridewatches(1, 14,"blade_ridewatch").setCreativeTab(Tabs.tabzi_o);
	public static Item faiz_ridewatch = new Item_ridewatches(1, 15,"faiz_ridewatch").setCreativeTab(Tabs.tabzi_o);
	public static Item ryuki_ridewatch = new Item_ridewatches(1, 16,"ryuki_ridewatch").setCreativeTab(Tabs.tabzi_o);
	public static Item agito_ridewatch = new Item_ridewatches(1, 17,"agito_ridewatch").setCreativeTab(Tabs.tabzi_o);
	public static Item kuuga_ridewatch = new Item_ridewatches(1, 18,"kuuga_ridewatch").setCreativeTab(Tabs.tabzi_o);
            
	public static Item another_build_ridewatch = new Item_ore("another_build_ridewatch").setCreativeTab(Tabs.tabzi_o);
      
            

	public static Item ziku_driver_build = new Item_ore("ziku_driver_build");
	public static Item ziku_driver_exaid = new Item_ore("ziku_driver_exaid");
	public static Item ziku_driver_ghost = new Item_ore("ziku_driver_ghost");
	public static Item ziku_driver_drive = new Item_ore("ziku_driver_drive");
	public static Item ziku_driver_gaim = new Item_ore("ziku_driver_gaim");
	public static Item ziku_driver_wizard = new Item_ore("ziku_driver_wizard");
	public static Item ziku_driver_fourze = new Item_ore("ziku_driver_fourze");
	public static Item ziku_driver_ooo = new Item_ore("ziku_driver_ooo");
	public static Item ziku_driver_w = new Item_ore("ziku_driver_w");
	public static Item ziku_driver_kiva = new Item_ore("ziku_driver_kiva");
	public static Item ziku_driver_deno = new Item_ore("ziku_driver_deno");
	public static Item ziku_driver_kabuto = new Item_ore("ziku_driver_kabuto");
	public static Item ziku_driver_hibiki = new Item_ore("ziku_driver_hibiki");
	public static Item ziku_driver_blade = new Item_ore("ziku_driver_blade");
	public static Item ziku_driver_faiz = new Item_ore("ziku_driver_faiz");
	public static Item ziku_driver_ryuki = new Item_ore("ziku_driver_ryuki");
	public static Item ziku_driver_agito = new Item_ore("ziku_driver_agito");
	public static Item ziku_driver_kuuga = new Item_ore("ziku_driver_kuuga");
            
	public static Item ziku_driver_genm = new Item_ore("ziku_driver_genm");
	
	public static Item oma_zi_o_cape = new Item_ore("oma_zi_o_cape");
            
	public static Item amazonshead = new item_amazonsarmor("amazonshead",ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.HEAD).setMaxStackSize(1).setCreativeTab(Tabs.tabamazons);
	public static Item amazonstroso = new item_amazonsarmor2("amazonstroso",ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.CHEST).setMaxStackSize(1).setCreativeTab(Tabs.tabamazons);
	public static Item amazonslegs = new item_amazonsarmor2("amazonslegs",ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.LEGS).setMaxStackSize(1).setCreativeTab(Tabs.tabamazons);

	public static Item amazons_driver_omega = new item_amazonsdriver("amazons_driver_omega",ArmorMaterial.DIAMOND, 4, "amazon_omega").setMaxStackSize(1).setCreativeTab(Tabs.tabamazons);
	public static Item neo_amazons_driver_omega = new item_amazonsdriver("neo_amazons_driver_omega",ArmorMaterial.DIAMOND, 4, "amazon_new_omega").setMaxStackSize(1).setCreativeTab(Tabs.tabamazons);
	public static Item amazons_driver_alpha = new item_amazonsdriver("amazons_driver_alpha",ArmorMaterial.DIAMOND, 4, "amazon_alpha").setMaxStackSize(1).setCreativeTab(Tabs.tabamazons);
	public static Item amazons_driver_blind_alpha = new item_amazonsdriver("amazons_driver_blind_alpha",ArmorMaterial.DIAMOND, 4, "amazon_alpha_blind").setMaxStackSize(1).setCreativeTab(Tabs.tabamazons);
	public static Item amazons_driver_sigma = new item_amazonsdriver("amazons_driver_sigma",ArmorMaterial.DIAMOND, 4, "amazon_sigma").setMaxStackSize(1).setCreativeTab(Tabs.tabamazons);
	public static Item neo_amazons_driver_neo = new item_amazonsdriver("neo_amazons_driver_neo",ArmorMaterial.DIAMOND, 4, "amazon_neo").setMaxStackSize(1).setCreativeTab(Tabs.tabamazons);
	public static Item neo_amazons_driver_neo_alpha = new item_amazonsdriver("neo_amazons_driver_neo_alpha",ArmorMaterial.DIAMOND, 4, "amazon_neo_alpha").setMaxStackSize(1).setCreativeTab(Tabs.tabamazons);
			
	public static Item condorer_core_alpha = new Item_ore("condorer_core_alpha").setCreativeTab(Tabs.tabamazons);
	public static Item condorer_core_omega = new Item_ore("condorer_core_omega").setCreativeTab(Tabs.tabamazons);
	public static Item condorer_core_sigma = new Item_ore("condorer_core_sigma").setCreativeTab(Tabs.tabamazons);
	public static Item condorer_core_blind_alpha = new Item_ore("condorer_core_blind_alpha").setCreativeTab(Tabs.tabamazons);

	public static Item amazon_injector_neo = new Item_ore("amazon_injector_neo").setCreativeTab(Tabs.tabamazons);
	public static Item amazon_injector_new_omega = new Item_ore("amazon_injector_new_omega").setCreativeTab(Tabs.tabamazons);

    public static void init() {
    }

    //public static void init(){}
}



