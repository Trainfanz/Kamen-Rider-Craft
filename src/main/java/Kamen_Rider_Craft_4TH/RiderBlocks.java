package Kamen_Rider_Craft_4TH;

import Kamen_Rider_Craft_4TH.blocks.AstroSwitchProgrammer;
import Kamen_Rider_Craft_4TH.blocks.BlockCustomDoor;
import Kamen_Rider_Craft_4TH.blocks.BlockCustomStaris;
import Kamen_Rider_Craft_4TH.blocks.GameCreatorBlock;
import Kamen_Rider_Craft_4TH.blocks.cell_medal_programer_block;
import Kamen_Rider_Craft_4TH.blocks.gaia_memory_refiner_block;
import Kamen_Rider_Craft_4TH.blocks.ganbarizing_block;
import Kamen_Rider_Craft_4TH.blocks.hiden_3d_printing;
import Kamen_Rider_Craft_4TH.blocks.mob_block;
import Kamen_Rider_Craft_4TH.blocks.pandora_box_block;
import Kamen_Rider_Craft_4TH.blocks.purifyer_block;
import Kamen_Rider_Craft_4TH.blocks.rider_glass_block;
import Kamen_Rider_Craft_4TH.blocks.solidifyer_block;
import Kamen_Rider_Craft_4TH.blocks.sword_of_logos_book_analyzer;
import Kamen_Rider_Craft_4TH.blocks.vistamp_bar;
import Kamen_Rider_Craft_4TH.blocks.zaia_3d_printing;
import Kamen_Rider_Craft_4TH.blocks.custom.BlockType;
import Kamen_Rider_Craft_4TH.blocks.custom.CustomBlock;
import Kamen_Rider_Craft_4TH.blocks.custom.Property;
import Kamen_Rider_Craft_4TH.blocks.wood.BlockHelheimPlant;
import Kamen_Rider_Craft_4TH.blocks.wood.BlockHelheimVine;
import Kamen_Rider_Craft_4TH.item.Item_custom_door;
import Kamen_Rider_Craft_4TH.item.Item_ore;
import Kamen_Rider_Craft_4TH.mobs.Boss.EntityChronos;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_Arc_zero;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_Durendal;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_HellBros;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_NightRogue;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_Sabela;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_Solomon;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_White_Woz;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_another_build;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_bikaiser;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_core;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_demushu;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_evolt;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_gaoh;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_horobi;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_ikazuchi;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_lord_baron;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_poseidon;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_power_up_core;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_redyue;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_roshuo;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_super_gingaoh;
import Kamen_Rider_Craft_4TH.mobs.Boss.entity_storious_rider;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPlanks;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;

public class RiderBlocks {

	public static Block HelheimVine = new BlockHelheimVine("helheim_vine");
	public static Block Helheim_plant = new BlockHelheimPlant("helheim_plant").setCreativeTab(Tabs.tabmisc);
	public static Block Helheim_plant_2 = new BlockHelheimPlant("helheim_plant_2").setCreativeTab(Tabs.tabmisc);
	public static Block Helheim_plant_3 = new BlockHelheimPlant("helheim_plant_3").setCreativeTab(Tabs.tabmisc);
	public static Block Helheim_plant_4 = new BlockHelheimPlant("helheim_plant_4").setCreativeTab(Tabs.tabmisc);
	
	public static Block counter_95do = CustomBlock.builder().material(Material.WOOD).hardness(1F).blockType(BlockType.DIRECTIONAL).name("counter_95do").setCreativeTabe(Tabs.tabdecor).build();
	
	public static Block planks_light_blue = CustomBlock.builder().material(Material.WOOD).hardness(1F).blockType(BlockType.BASIC).name("planks_light_blue").setCreativeTabe(Tabs.tabdecor).build();
	public static Block planks_dark_blue = CustomBlock.builder().material(Material.WOOD).hardness(1F).blockType(BlockType.BASIC).name("planks_dark_blue").setCreativeTabe(Tabs.tabdecor).build();
	public static Block planks_white = CustomBlock.builder().material(Material.WOOD).hardness(1F).blockType(BlockType.BASIC).name("planks_white").setCreativeTabe(Tabs.tabdecor).build();
	
	public static Block kamiyama_wall = CustomBlock.builder().material(Material.WOOD).hardness(1F).blockType(BlockType.BASIC).name("kamiyama_wall").setCreativeTabe(Tabs.tabdecor).build();
	
	public static Block door_kamiyama = new BlockCustomDoor("door_kamiyama").setCreativeTab(Tabs.tabdecor);
	
	public static Block denliner_interior = CustomBlock.builder().material(Material.ROCK).hardness(1F).blockType(BlockType.BASIC).name("denliner_interior").setCreativeTabe(Tabs.tabdecor).build();
	public static Block denliner_interior_darker = CustomBlock.builder().material(Material.ROCK).hardness(1F).blockType(BlockType.BASIC).name("denliner_interior_darker").setCreativeTabe(Tabs.tabdecor).build();
	public static Block denliner_interior_with_line = CustomBlock.builder().material(Material.ROCK).hardness(1F).blockType(BlockType.BASIC).name("denliner_interior_with_line").setCreativeTabe(Tabs.tabdecor).build();
	public static Block denliner_interior_windo = CustomBlock.builder().property(Property.TRANSPARENT).hardness(1F).material(Material.ROCK).blockType(BlockType.DIRECTIONAL).name("denliner_interior_windo").setCreativeTabe(Tabs.tabdecor).build();
	public static Block denliner_side_with_line = CustomBlock.builder().material(Material.ROCK).hardness(1F).blockType(BlockType.BASIC).name("denliner_side_with_line").setCreativeTabe(Tabs.tabdecor).build();
	public static Block denliner_side_with_start_line = CustomBlock.builder().material(Material.ROCK).hardness(1F).blockType(BlockType.DIRECTIONAL).name("denliner_side_with_start_line").setCreativeTabe(Tabs.tabdecor).build();
	public static Block denliner_side_with_line_ikazuchi = CustomBlock.builder().material(Material.ROCK).hardness(1F).blockType(BlockType.BASIC).name("denliner_side_with_line_ikazuchi").setCreativeTabe(Tabs.tabdecor).build();
	public static Block denliner_side_with_line_rekkou = CustomBlock.builder().material(Material.ROCK).hardness(1F).blockType(BlockType.BASIC).name("denliner_side_with_line_rekkou").setCreativeTabe(Tabs.tabdecor).build();
	public static Block denliner_roof = CustomBlock.builder().material(Material.ROCK).hardness(1F).blockType(BlockType.BASIC).name("denliner_roof").setCreativeTabe(Tabs.tabdecor).build();
	
	public static Block denliner_logo_top = CustomBlock.builder().material(Material.ROCK).hardness(1F).blockType(BlockType.BASIC).name("denliner_logo_top").setCreativeTabe(Tabs.tabdecor).build();
	public static Block denliner_logo_bottom = CustomBlock.builder().material(Material.ROCK).hardness(1F).blockType(BlockType.BASIC).name("denliner_logo_bottom").setCreativeTabe(Tabs.tabdecor).build();
	public static Block denliner_logo_side = CustomBlock.builder().material(Material.ROCK).hardness(1F).blockType(BlockType.BASIC).name("denliner_logo_side").setCreativeTabe(Tabs.tabdecor).build();
	public static Block denliner_logo_sider = CustomBlock.builder().material(Material.ROCK).hardness(1F).blockType(BlockType.BASIC).name("denliner_logo_sider").setCreativeTabe(Tabs.tabdecor).build();

	public static Block denliner_glass = CustomBlock.builder().material(Material.ROCK).hardness(1F).blockType(BlockType.BASIC).name("denliner_glass").setCreativeTabe(Tabs.tabdecor).build();
	public static Block denliner_glass2 = CustomBlock.builder().material(Material.ROCK).hardness(1F).blockType(BlockType.BASIC).name("denliner_glass2").setCreativeTabe(Tabs.tabdecor).build();
	public static Block denliner_glass3 = CustomBlock.builder().material(Material.ROCK).hardness(1F).blockType(BlockType.BASIC).name("denliner_glass3").setCreativeTabe(Tabs.tabdecor).build();
	public static Block denliner_glass_ikazuchi = CustomBlock.builder().material(Material.ROCK).hardness(1F).blockType(BlockType.BASIC).name("denliner_glass_ikazuchi").setCreativeTabe(Tabs.tabdecor).build();
	public static Block denliner_glass_rekkou = CustomBlock.builder().material(Material.ROCK).hardness(1F).blockType(BlockType.BASIC).name("denliner_glass_rekkou").setCreativeTabe(Tabs.tabdecor).build();
	public static Block nega_denliner_glass = CustomBlock.builder().material(Material.ROCK).hardness(1F).blockType(BlockType.BASIC).name("nega_denliner_glass").setCreativeTabe(Tabs.tabdecor).build();
	
	public static Block denliner_gold = CustomBlock.builder().material(Material.ROCK).hardness(1F).blockType(BlockType.BASIC).name("denliner_gold").setCreativeTabe(Tabs.tabdecor).build();
	public static Block denliner_matel = CustomBlock.builder().material(Material.ROCK).hardness(1F).blockType(BlockType.BASIC).name("denliner_matel").setCreativeTabe(Tabs.tabdecor).build();
	public static Block denliner_matel_top = CustomBlock.builder().material(Material.ROCK).hardness(1F).blockType(BlockType.BASIC).name("denliner_matel_top").setCreativeTabe(Tabs.tabdecor).build();
	public static Block denliner_matel_top2 = CustomBlock.builder().material(Material.ROCK).hardness(1F).blockType(BlockType.BASIC).name("denliner_matel_top2").setCreativeTabe(Tabs.tabdecor).build();
	public static Block denliner_matel_side = CustomBlock.builder().material(Material.ROCK).hardness(1F).blockType(BlockType.BASIC).name("denliner_matel_side").setCreativeTabe(Tabs.tabdecor).build();
	
	public static Block denliner_matel_dark = CustomBlock.builder().material(Material.ROCK).hardness(1F).blockType(BlockType.BASIC).name("denliner_matel_dark").setCreativeTabe(Tabs.tabdecor).build();
	public static Block denliner_matel_dark_line = CustomBlock.builder().material(Material.ROCK).hardness(1F).blockType(BlockType.DIRECTIONAL).name("denliner_matel_dark_line").setCreativeTabe(Tabs.tabdecor).build();
	
	public static Block new_denliner_interior = CustomBlock.builder().material(Material.ROCK).hardness(1F).blockType(BlockType.BASIC).name("new_denliner_interior").setCreativeTabe(Tabs.tabdecor).build();
	public static Block new_denliner_side_with_line = CustomBlock.builder().material(Material.ROCK).hardness(1F).blockType(BlockType.BASIC).name("new_denliner_side_with_line").setCreativeTabe(Tabs.tabdecor).build();
	public static Block new_denliner_side_with_start_line = CustomBlock.builder().material(Material.ROCK).hardness(1F).blockType(BlockType.DIRECTIONAL).name("new_denliner_side_with_start_line").setCreativeTabe(Tabs.tabdecor).build();
	public static Block new_denliner_logo_top = CustomBlock.builder().material(Material.ROCK).hardness(1F).blockType(BlockType.BASIC).name("new_denliner_logo_top").setCreativeTabe(Tabs.tabdecor).build();
	public static Block new_denliner_logo_bottom = CustomBlock.builder().material(Material.ROCK).hardness(1F).blockType(BlockType.BASIC).name("new_denliner_logo_bottom").setCreativeTabe(Tabs.tabdecor).build();
	public static Block new_denliner_matel_top = CustomBlock.builder().material(Material.ROCK).hardness(1F).blockType(BlockType.BASIC).name("new_denliner_matel_top").setCreativeTabe(Tabs.tabdecor).build();
	public static Block new_denliner_matel_top2 = CustomBlock.builder().material(Material.ROCK).hardness(1F).blockType(BlockType.BASIC).name("new_denliner_matel_top2").setCreativeTabe(Tabs.tabdecor).build();
	public static Block new_denliner_matel_side = CustomBlock.builder().material(Material.ROCK).hardness(1F).blockType(BlockType.BASIC).name("new_denliner_matel_side").setCreativeTabe(Tabs.tabdecor).build();
	
	public static Block king_liner_red = CustomBlock.builder().material(Material.ROCK).hardness(1F).blockType(BlockType.BASIC).name("king_liner_red").setCreativeTabe(Tabs.tabdecor).build();
	public static Block king_liner_logo_top = CustomBlock.builder().material(Material.ROCK).hardness(1F).blockType(BlockType.BASIC).name("king_liner_logo_top").setCreativeTabe(Tabs.tabdecor).build();
	public static Block king_liner_logo_bottom = CustomBlock.builder().material(Material.ROCK).hardness(1F).blockType(BlockType.BASIC).name("king_liner_logo_bottom").setCreativeTabe(Tabs.tabdecor).build();
	public static Block king_liner_logo_side = CustomBlock.builder().material(Material.ROCK).hardness(1F).blockType(BlockType.BASIC).name("king_liner_logo_side").setCreativeTabe(Tabs.tabdecor).build();
	public static Block king_liner_logo_sider = CustomBlock.builder().material(Material.ROCK).hardness(1F).blockType(BlockType.BASIC).name("king_liner_logo_sider").setCreativeTabe(Tabs.tabdecor).build();

	public static Block king_liner__windo = CustomBlock.builder().property(Property.TRANSPARENT).hardness(1F).material(Material.ROCK).blockType(BlockType.DIRECTIONAL).name("king_liner__windo").setCreativeTabe(Tabs.tabdecor).build();
	
	public static Block gaoh_liner_gold = CustomBlock.builder().material(Material.ROCK).hardness(1F).blockType(BlockType.BASIC).name("gaoh_liner_gold").setCreativeTabe(Tabs.tabdecor).build();
	public static Block gaoh_liner_green = CustomBlock.builder().material(Material.ROCK).hardness(1F).blockType(BlockType.BASIC).name("gaoh_liner_green").setCreativeTabe(Tabs.tabdecor).build();
	public static Block gaoh_liner_windo = CustomBlock.builder().property(Property.TRANSPARENT).material(Material.ROCK).hardness(1F).blockType(BlockType.DIRECTIONAL).name("gaoh_liner_windo").setCreativeTabe(Tabs.tabdecor).build();
	
	public static Block zero_liner_green = CustomBlock.builder().material(Material.ROCK).hardness(1F).blockType(BlockType.BASIC).name("zero_liner_green").setCreativeTabe(Tabs.tabdecor).build();
	
	public static Block white_wallplate = CustomBlock.builder().material(Material.IRON).hardness(9.9F).harvestLevel("pickaxe", 2).name("white_wallplate").setCreativeTabe(Tabs.tabdecor).build();

	public static Block ginga_meteor = CustomBlock.builder().material(Material.ROCK).hardness(1F).lightLevel(1f).blockType(BlockType.BASIC).name("ginga_meteor").setCreativeTabe(Tabs.tabdecor).build();
	
	public static Block rabbit_hutch_cyan = CustomBlock.builder().material(Material.ROCK).hardness(1F).blockType(BlockType.BASIC).name("rabbit_hutch_cyan").setCreativeTabe(Tabs.tabdecor).build();
	public static Block rabbit_hutch_cyan2 = CustomBlock.builder().material(Material.ROCK).hardness(1F).blockType(BlockType.BASIC).name("rabbit_hutch_cyan2").setCreativeTabe(Tabs.tabdecor).build();
	public static Block rabbit_hutch_cyan_light = CustomBlock.builder().material(Material.ROCK).hardness(1F).blockType(BlockType.BASIC).name("rabbit_hutch_cyan_light").lightLevel(1f).setCreativeTabe(Tabs.tabdecor).build();
	
	public static Block rabbit_hutch_light = CustomBlock.builder().material(Material.ROCK).hardness(1F).blockType(BlockType.BASIC).name("rabbit_hutch_light").lightLevel(1f).setCreativeTabe(Tabs.tabdecor).build();
	public static Block rabbit_hutch_computer_stairs = new BlockCustomStaris(Blocks.STONE.getDefaultState(), "rabbit_hutch_computer_stairs").setLightLevel(1f).setCreativeTab(Tabs.tabdecor);
	public static Block rabbit_hutch_computer_stairs2 = new BlockCustomStaris(Blocks.STONE.getDefaultState(), "rabbit_hutch_computer_stairs2").setLightLevel(1f).setCreativeTab(Tabs.tabdecor);
	
	
	public static Block sword_of_logos_stairs = new BlockCustomStaris(Blocks.ACACIA_STAIRS.getDefaultState(), "sword_of_logos_stairs").setCreativeTab(Tabs.tabdecor);
	public static Block sword_of_logos_bookshelf = CustomBlock.builder().material(Material.WOOD).hardness(1F).blockType(BlockType.BASIC).name("sword_of_logos_bookshelf").setCreativeTabe(Tabs.tabdecor).build();
	public static Block planks_big_oak_golden_trim = CustomBlock.builder().material(Material.WOOD).hardness(1F).blockType(BlockType.BASIC).name("planks_big_oak_golden_trim").setCreativeTabe(Tabs.tabdecor).build();
	public static Block spruce_flooring = CustomBlock.builder().material(Material.WOOD).hardness(1F).blockType(BlockType.BASIC).name("spruce_flooring").setCreativeTabe(Tabs.tabdecor).build();
	public static Block stone_flooring = CustomBlock.builder().material(Material.ROCK).hardness(1F).blockType(BlockType.BASIC).name("stone_flooring").setCreativeTabe(Tabs.tabdecor).build();
	public static Block sword_of_logos_brick = CustomBlock.builder().material(Material.ROCK).hardness(1F).blockType(BlockType.BASIC).name("sword_of_logos_brick").setCreativeTabe(Tabs.tabdecor).build();
	public static Block wooden_panel = CustomBlock.builder().material(Material.WOOD).hardness(1F).blockType(BlockType.BASIC).name("wooden_panel").setCreativeTabe(Tabs.tabdecor).build();
	public static Block sword_of_logos_wood = CustomBlock.builder().material(Material.WOOD).hardness(1F).blockType(BlockType.BASIC).name("sword_of_logos_wood").setCreativeTabe(Tabs.tabdecor).build();
	public static Block sword_of_logos_wood2 = CustomBlock.builder().material(Material.WOOD).hardness(1F).blockType(BlockType.BASIC).name("sword_of_logos_wood2").setCreativeTabe(Tabs.tabdecor).build();
	public static Block sword_of_logos_wood_stairs = new BlockCustomStaris(Blocks.ACACIA_STAIRS.getDefaultState(), "sword_of_logos_wood_stairs").setCreativeTab(Tabs.tabdecor);
	public static Block sword_of_logos_gold_stairs = new BlockCustomStaris(Blocks.STONE.getDefaultState(), "sword_of_logos_gold_stairs").setCreativeTab(Tabs.tabdecor);
	
	public static Block sword_of_logos_tabel = new BlockCustomStaris(Blocks.ACACIA_STAIRS.getDefaultState(), "sword_of_logos_tabel").setCreativeTab(Tabs.tabdecor);
	public static Block sword_of_logos_tabel_top = CustomBlock.builder().material(Material.WOOD).hardness(1F).blockType(BlockType.DIRECTIONAL).lightLevel(1).name("sword_of_logos_tabel_top").setCreativeTabe(Tabs.tabdecor).build();
	
	public static Block wooden_panel2 = CustomBlock.builder().material(Material.WOOD).hardness(1F).blockType(BlockType.DIRECTIONAL).name("wooden_panel2").setCreativeTabe(Tabs.tabdecor).build();
	public static Block quartz_block_gold_trim = CustomBlock.builder().material(Material.ROCK).hardness(1F).blockType(BlockType.BASIC).name("quartz_block_gold_trim").setCreativeTabe(Tabs.tabdecor).build();
	public static Block sword_of_logos_gold_trim = CustomBlock.builder().material(Material.ROCK).hardness(1F).blockType(BlockType.BASIC).name("sword_of_logos_gold_trim").setCreativeTabe(Tabs.tabdecor).build();
	public static Block sword_of_logos_gold_block = CustomBlock.builder().material(Material.ROCK).hardness(1F).blockType(BlockType.BASIC).name("sword_of_logos_gold_block").setCreativeTabe(Tabs.tabdecor).build();
	public static Block sword_of_logos_logo = CustomBlock.builder().material(Material.IRON).hardness(1F).blockType(BlockType.DIRECTIONAL).name("sword_of_logos_logo").setCreativeTabe(Tabs.tabdecor).build();
	
	public static Block sword_of_logos_sword_blade = CustomBlock.builder().material(Material.IRON).hardness(1F).blockType(BlockType.DIRECTIONAL).name("sword_of_logos_sword_blade").setCreativeTabe(Tabs.tabdecor).build();
	public static Block sword_of_logos_arch = CustomBlock.builder().material(Material.WOOD).hardness(1F).blockType(BlockType.DIRECTIONAL).name("sword_of_logos_arch").setCreativeTabe(Tabs.tabdecor).build();
	public static Block sword_of_logos_wood_trim = CustomBlock.builder().material(Material.WOOD).hardness(1F).blockType(BlockType.DIRECTIONAL).name("sword_of_logos_wood_trim").setCreativeTabe(Tabs.tabdecor).build();
	public static Block planks_brown = CustomBlock.builder().material(Material.WOOD).blockType(BlockType.BASIC).hardness(1F).name("planks_brown").setCreativeTabe(Tabs.tabdecor).build();
	
	public static Block pure_gaia_memory_block = new rider_glass_block("pure_gaia_memory_block",Material.GLASS).setHardness(1F).setLightLevel(0.75f).setCreativeTab(Tabs.tabdecor);
	
	public static Block monitor = CustomBlock.builder().material(Material.IRON).hardness(9.9F).lightLevel(0.1F).harvestLevel("pickaxe", 2).blockType(BlockType.DIRECTIONAL).name("monitor").setCreativeTabe(Tabs.tabdecor).build();
	public static Block mighty_block = CustomBlock.builder().material(Material.IRON).hardness(9.9F).harvestLevel("pickaxe", 2).name("mighty_block").setCreativeTabe(Tabs.tabdecor).build();
	public static Block fangire_glass = new rider_glass_block("fangire_glass",Material.GLASS).setCreativeTab(Tabs.tabdecor);
	public static Block wallplate = CustomBlock.builder().material(Material.IRON).hardness(9.9F).harvestLevel("pickaxe", 2).name("wallplate").setCreativeTabe(Tabs.tabdecor).build();

	public static Block taddle_wall = CustomBlock.builder().material(Material.ROCK).hardness(1F).blockType(BlockType.BASIC).name("taddle_wall").setCreativeTabe(Tabs.tabdecor).build();
	public static Block taddle_brick = CustomBlock.builder().material(Material.ROCK).hardness(1F).blockType(BlockType.BASIC).name("taddle_brick").setCreativeTabe(Tabs.tabdecor).build();
	
	public static Block bang_bang_drum = CustomBlock.builder().material(Material.ROCK).hardness(9.9F).harvestLevel("pickaxe", 2).name("bang_bang_drum").setCreativeTabe(Tabs.tabdecor).build();
	
	public static Block bakusou_trophy = CustomBlock.builder().material(Material.ROCK).hardness(9.9F).harvestLevel("pickaxe", 2).name("bakusou_trophy").setCreativeTabe(Tabs.tabdecor).build();
	
	public static Block gaia_memory_refiner = new gaia_memory_refiner_block("gaia_memory_refiner",Material.ROCK, 2).setHardness(9.9F).setCreativeTab(Tabs.tabW);
	
	public static Block cell_medal_programer = new cell_medal_programer_block("cell_medal_programer",Material.ROCK, 2).setHardness(9.9F).setCreativeTab(Tabs.tabOOO);
	public static Block astro_switch_programer = new AstroSwitchProgrammer("astro_switch_programer",Material.ROCK, 2).setHardness(9.9F).setCreativeTab(Tabs.tabFourze);
	
	public static Block gamecreator = new GameCreatorBlock("gamecreator",Material.ROCK, 2).setHardness(9.9F).setCreativeTab(Tabs.tabex_aid);
	public static Block ganbarizing = new ganbarizing_block("ganbarizing",Material.ROCK, 2).setHardness(9.9F).setCreativeTab(Tabs.tabex_aid);
	
	public static Block pandorabox = new pandora_box_block("pandorabox",Material.ROCK, 2).setHardness(9.9F).setCreativeTab(Tabs.tabbuild);
	public static Block purifyer = new purifyer_block("purifyer",Material.ROCK, 2).setHardness(9.9F).setCreativeTab(Tabs.tabbuild);
	public static Block solidifyer = new solidifyer_block("solidifyer",Material.ROCK, 2).setHardness(9.9F).setCreativeTab(Tabs.tabbuild);

	public static Block hiden_3d_printing = new hiden_3d_printing("hiden_3d_printing",Material.ROCK, 2).setCreativeTab(Tabs.tabzero_one);
	public static Block zaia_3d_printing = new zaia_3d_printing("zaia_3d_printing",Material.ROCK, 2).setCreativeTab(Tabs.tabzero_one);

	public static Block sword_of_logos_book_analyzer = new sword_of_logos_book_analyzer("sword_of_logos_book_analyzer",Material.ROCK, 2).setCreativeTab(Tabs.tabsaber);

	public static Block vistamp_bar = new vistamp_bar("vistamp_bar",Material.ROCK, 2).setHardness(9.9f).setCreativeTab(Tabs.tabrevice);
	
	//boss blocks
	public static Block evolt_block = new mob_block("evolt_block", Entity_evolt::new).setHardness(9.9F).setLightLevel(0.1f).setCreativeTab(Tabs.tabbuild);
	public static Block night_rogue_block = new mob_block("night_rogue_block", Entity_NightRogue::new).setHardness(9.9F).setLightLevel(0.1f).setCreativeTab(Tabs.tabbuild);
	public static Block hell_bros_block = new mob_block("hell_bros_block", Entity_HellBros::new).setHardness(9.9F).setLightLevel(0.1f).setCreativeTab(Tabs.tabbuild);
	public static Block bi_kaiser_block = new mob_block("bi_kaiser_block", Entity_bikaiser::new).setHardness(9.9F).setLightLevel(0.1f).setCreativeTab(Tabs.tabbuild);
	public static Block cronus_block = new mob_block("cronus_block", EntityChronos::new).setHardness(9.9F).setLightLevel(0.1f).setCreativeTab(Tabs.tabex_aid);

	public static Block rosyuo_boss_block = new mob_block("rosyuo_boss_block", Entity_roshuo::new).setHardness(9.9F).setLightLevel(0.1f).setCreativeTab(Tabs.tabGaim);
	public static Block demushu_boss_block = new mob_block("demushu_boss_block", Entity_demushu::new).setHardness(9.9F).setLightLevel(0.1f).setCreativeTab(Tabs.tabGaim);
	public static Block redyue_boss_block = new mob_block("redyue_boss_block", Entity_redyue::new).setHardness(9.9F).setLightLevel(0.1f).setCreativeTab(Tabs.tabGaim);
	public static Block lord_baron_boss_block = new mob_block("lord_baron_boss_block", Entity_lord_baron::new).setHardness(9.9F).setLightLevel(0.1f).setCreativeTab(Tabs.tabGaim);

	public static Block gaoh_boss_block = new mob_block("gaoh_boss_block", Entity_gaoh::new).setHardness(9.9F).setLightLevel(0.1f).setCreativeTab(Tabs.tabden_o);
	
	public static Block core_boss_block = new mob_block("core_boss_block", Entity_core::new).setHardness(9.9F).setLightLevel(0.1f).setCreativeTab(Tabs.tabOOO);
	public static Block power_up_core_boss_block = new mob_block("power_up_core_boss_block", Entity_power_up_core::new).setHardness(9.9F).setLightLevel(0.1f).setCreativeTab(Tabs.tabOOO);
	public static Block poseidon_boss_block = new mob_block("poseidon_boss_block", Entity_poseidon::new).setHardness(9.9F).setLightLevel(0.1f).setCreativeTab(Tabs.tabOOO);
	
	public static Block super_ginga_oh_boss_block = new mob_block("super_ginga_oh_boss_block", Entity_super_gingaoh::new).setHardness(9.9F).setLightLevel(0.1f).setCreativeTab(Tabs.tabFourze);
	
	public static Block another_build_block = new mob_block("another_build_block", Entity_another_build::new).setHardness(9.9F).setLightLevel(0.1f).setCreativeTab(Tabs.tabzi_o);
	public static Block woz_boss_block = new mob_block("woz_boss_block", Entity_White_Woz::new).setHardness(9.9F).setLightLevel(0.1f).setCreativeTab(Tabs.tabzi_o);

	public static Block horobi_boss_block = new mob_block("horobi_boss_block", Entity_horobi::new).setHardness(9.9F).setLightLevel(0.1f).setCreativeTab(Tabs.tabzero_one);
	public static Block ikazuchi_boss_block = new mob_block("ikazuchi_boss_block", Entity_ikazuchi::new).setHardness(9.9F).setLightLevel(0.1f).setCreativeTab(Tabs.tabzero_one);
	public static Block ark_one_boss_block = new mob_block("ark_one_boss_block", Entity_Arc_zero::new).setHardness(9.9F).setLightLevel(0.1f).setCreativeTab(Tabs.tabzero_one);

	public static Block sabela_boss_block = new mob_block("sabela_boss_block", Entity_Sabela::new).setHardness(9.9F).setLightLevel(0.1f).setCreativeTab(Tabs.tabsaber);
	public static Block durendal_boss_block = new mob_block("durendal_boss_block", Entity_Durendal::new).setHardness(9.9F).setLightLevel(0.1f).setCreativeTab(Tabs.tabsaber);
	public static Block solomon_boss_block = new mob_block("solomon_boss_block", Entity_Solomon::new).setHardness(9.9F).setLightLevel(0.1f).setCreativeTab(Tabs.tabsaber);
	public static Block storious_boss_block = new mob_block("storious_boss_block", entity_storious_rider::new).setHardness(9.9F).setLightLevel(0.1f).setCreativeTab(Tabs.tabsaber);

public static void init() {
	
}

}