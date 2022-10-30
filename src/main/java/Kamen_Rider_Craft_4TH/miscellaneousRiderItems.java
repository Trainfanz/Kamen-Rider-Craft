package Kamen_Rider_Craft_4TH;

import Kamen_Rider_Craft_4TH.blocks.*;
import Kamen_Rider_Craft_4TH.blocks.portals.*;
import Kamen_Rider_Craft_4TH.blocks.custom.BlockType;
import Kamen_Rider_Craft_4TH.blocks.custom.CustomBlock;
import Kamen_Rider_Craft_4TH.item.*;
import Kamen_Rider_Craft_4TH.item.agito.item_agitodriver;
import Kamen_Rider_Craft_4TH.item.rider_armor_base.Item_form_change;
import Kamen_Rider_Craft_4TH.item.rider_armor_base.item_rider_armor;
import Kamen_Rider_Craft_4TH.item.rider_armor_base.item_rider_driver;
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

public class miscellaneousRiderItems {

	public static Item donut = new riderfood(4, true,"donut").setCreativeTab(Tabs.tabmisc);
	public static Item icepop1  = new riderfood(2, true,"icepop1").setCreativeTab(Tabs.tabmisc);
	public static Item icepop2  = new riderfood(2, true,"icepop2").setCreativeTab(Tabs.tabmisc);
	public static Item icepop3  = new riderfood(2, true,"icepop3").setCreativeTab(Tabs.tabmisc);

	public static Item base_sword = new Item_ore("base_sword").setCreativeTab(Tabs.tabmisc);
	public static Item base_bike = new Item_ore("base_bike").setCreativeTab(Tabs.tabmisc);

	public static Item shocker_emblem = new Item_ore("shocker_emblem").setCreativeTab(Tabs.tabmisc);
	//public static Item base_gun = new Item_ore("base_gun").setCreativeTab(Tabs.tabmisc);



	//Card Warrior Kamen Rider
	public static Item card_warrior_kamen_rider_manga  = new Item_ore("card_warrior_kamen_rider_manga").keep_item().setCreativeTab(Tabs.tabmisc);
	
	public static Item grand_gouram_rod = new ItemBaseSword("grand_gouram_rod",Tabs.den_denso, ShowaRiderItems.rider_circuit).setMaxStackSize(1).setCreativeTab(Tabs.tabmisc);
	
	public static Item herculespader_sword= new ItemBaseSword("herculespader_sword",Tabs.ridol_stick, ShowaRiderItems.rider_circuit).setMaxStackSize(1).setCreativeTab(Tabs.tabmisc);
	
	public static Item darkwing_sword = new ItemBaseSword("darkwing_sword",Tabs.denkamen_sword, ShowaRiderItems.rider_circuit).setMaxStackSize(1).setCreativeTab(Tabs.tabmisc);
	
	public static Item flaresalamander_sword = new ItemBaseSword("flaresalamander_sword",Tabs.ridol_stick, ShowaRiderItems.rider_circuit).setMaxStackSize(1).setCreativeTab(Tabs.tabmisc);
		
	public static Item ryuki_dragreder_wings = new Item_ore("ryuki_dragreder_wings");
	public static Item dragreder = new Item_form_change("dragreder",item_rider_driver.class,RiderItems.v_buckle_ryuki_survive,"_dragreder","ryuki"
			,new PotionEffect(MobEffects.SPEED, 5, 0,true,false),new PotionEffect(MobEffects.FIRE_RESISTANCE, 5, 0,true,false)
			,new PotionEffect(PotionCore.FLY_POTION, 5, 1,true,false)).addWing(ryuki_dragreder_wings).Rend2ndLyer("dragreder").setCreativeTab(Tabs.tabmisc);

	public static Item agito_stagtornador_wings = new Item_ore("agito_stagtornador_wings");
	public static Item stagtornador = new Item_form_change("stagtornador",item_agitodriver.class,RiderItems.alter_ring_gr,"","agito"
			,new PotionEffect(MobEffects.SPEED, 5, 0,true,false),new PotionEffect(MobEffects.STRENGTH, 5, 0,true,false)
			,new PotionEffect(PotionCore.FLY_POTION, 5, 1,true,false)).addWing(agito_stagtornador_wings).Rend2ndLyer("agito_stagtornador").setCreativeTab(Tabs.tabmisc);

	public static Item herculespader_wings = new Item_ore("herculespader_wings");
	public static Item herculespader = new Item_form_change("herculespader",item_rider_driver.class,ShowaRiderItems.blanknoitem,"","blade"
			,new PotionEffect(MobEffects.STRENGTH, 5, 2,true,false),new PotionEffect(MobEffects.HASTE, 5, 0,true,false),
			new PotionEffect(MobEffects.SPEED, 5, 2,true,false),new PotionEffect(MobEffects.RESISTANCE, 5, 0,true,false)
			,new PotionEffect(PotionCore.FLY_POTION, 5, 1,true,false)).addWing(herculespader_wings).Rend2ndLyer("herculespader").setCreativeTab(Tabs.tabmisc);

	public static Item knight_darkwing_wings = new Item_ore("knight_darkwing_wings");
	public static Item darkwing = new Item_form_change("darkwing",item_rider_driver.class,RiderItems.v_buckle_knight_survive,"_darkwing","knight"
			,new PotionEffect(MobEffects.SPEED, 5, 0,true,false),new PotionEffect(MobEffects.FIRE_RESISTANCE, 5, 0,true,false)
			,new PotionEffect(PotionCore.FLY_POTION, 5, 1,true,false)).addWing(knight_darkwing_wings).Rend2ndLyer("darkwing").setCreativeTab(Tabs.tabmisc);

	public static Item greywolch = new Item_form_change("greywolch",item_rider_driver.class,ShowaRiderItems.blanknoitem,"","faiz"
			,new PotionEffect(MobEffects.STRENGTH, 5, 2,true,false),new PotionEffect(MobEffects.HASTE, 5, 1,true,false)
			,new PotionEffect(MobEffects.RESISTANCE, 5, 1,true,false),new PotionEffect(MobEffects.NIGHT_VISION, 250, 0,true,false)
			,new PotionEffect(PotionCore.PUNCH_BOOST_POTION, 5, 1,true,false)).Rend2ndLyer("faiz_greywolch").setCreativeTab(Tabs.tabmisc);

	public static Item grand_gouram_wings = new Item_ore("grand_gouram_wings");
	public static Item grand_gouram = new Item_form_change("grand_gouram",item_rider_driver.class,ShowaRiderItems.blanknoitem,"_grand_gouram","kuuga"
			,new PotionEffect(MobEffects.RESISTANCE, 5, 2,true,false)
			,new PotionEffect(MobEffects.SPEED, 5, 2,true,false)
			,new PotionEffect(MobEffects.JUMP_BOOST, 5, 1,true,false)
			,new PotionEffect(MobEffects.STRENGTH, 5, 2,true,false)
			,new PotionEffect(PotionCore.PUNCH_BOOST_POTION, 5, 8,true,false)).Rend2ndLyer("grand_gouram").addWing(grand_gouram_wings).setCreativeTab(Tabs.tabmisc);

	public static Item exbeeter_wings = new Item_ore("exbeeter_wings");
	public static Item exbeeter = new Item_form_change("exbeeter",item_rider_driver.class,ShowaRiderItems.blanknoitem,"","kabuto"
			,new PotionEffect(MobEffects.HASTE, 5, 3,true,false),new PotionEffect(MobEffects.SPEED, 5, 4,true,false),
			new PotionEffect(MobEffects.STRENGTH, 5, 2,true,false),new PotionEffect(MobEffects.RESISTANCE, 5, 1,true,false)
			,new PotionEffect(MobEffects.JUMP_BOOST, 5, 4,true,false),new PotionEffect(PotionCore.FLY_POTION, 5, 1,true,false)
			,new PotionEffect(MobEffects.NIGHT_VISION, 500, 0,true,false)).Rend2ndLyer("exbeeter").addWing(exbeeter_wings).setCreativeTab(Tabs.tabmisc);

	
	public static Item chaosdile = new Item_form_change("chaosdile",item_rider_driver.class,ShowaRiderItems.blanknoitem,"","kaixa"
			,new PotionEffect(MobEffects.STRENGTH, 5, 2,true,false),new PotionEffect(MobEffects.HASTE, 5, 1,true,false)
			,new PotionEffect(MobEffects.RESISTANCE, 5, 1,true,false),new PotionEffect(MobEffects.NIGHT_VISION, 250, 0,true,false)
			,new PotionEffect(PotionCore.PUNCH_BOOST_POTION, 5, 1,true,false)).Rend2ndLyer("chaosdile").setCreativeTab(Tabs.tabmisc);

	public static Item leatheraider = new Item_form_change("leatheraider",item_agitodriver.class,ShowaRiderItems.blanknoitem,"_leatheraider","gills"
			,new PotionEffect(MobEffects.SPEED, 5, 4,true,false)
			,new PotionEffect(MobEffects.STRENGTH, 5, 1,true,false)
			,new PotionEffect(MobEffects.JUMP_BOOST, 5, 3,true,false)
			,new PotionEffect(MobEffects.RESISTANCE, 5, 1,true,false)).Rend2ndLyer("leatheraider").setCreativeTab(Tabs.tabmisc);
	
	public static Item v3_flaresalamander_wings = new Item_ore("v3_flaresalamander_wings");
	public static Item flaresalamander = new Item_form_change("flaresalamander",item_rider_driver.class,ShowaRiderItems.blanknoitem,"","v3"
			,new PotionEffect(MobEffects.STRENGTH,20, 3,true,false),new PotionEffect(MobEffects.RESISTANCE,20, 3,true,false)
			,new PotionEffect(MobEffects.SPEED,20, 3,true,false),new PotionEffect(MobEffects.JUMP_BOOST,20, 4,true,false)
			,new PotionEffect(PotionCore.PUNCH_BOOST_POTION, 5, 4,true,false),new PotionEffect(PotionCore.FLY_POTION, 5, 1,true,false)
			).addWing(v3_flaresalamander_wings).Rend2ndLyer("v3_flaresalamander").setCreativeTab(Tabs.tabmisc);

	public static Item ryuki_dragranzer_wings = new Item_ore("ryuki_dragranzer_wings");
	public static Item dragranzer = new Item_form_change("dragranzer",item_rider_driver.class,RiderItems.v_buckle_ryuki_survive,"_dragranzer","ryuki"
			,new PotionEffect(PotionCore.FLY_POTION, 5, 1,true,false),new PotionEffect(MobEffects.STRENGTH, 5, 4,true,false),new PotionEffect(MobEffects.FIRE_RESISTANCE, 5, 0,true,false)
			,new PotionEffect(MobEffects.HASTE, 5, 1,true,false),new PotionEffect(MobEffects.RESISTANCE, 5, 2,true,false),
			new PotionEffect(MobEffects.SPEED, 5, 1,true,false)).addWing(ryuki_dragranzer_wings).Rend2ndLyer("dragranzer").setCreativeTab(Tabs.tabmisc);

	public static Item scissorbeeter_wings = new Item_ore("scissorbeeter_wings");
	public static Item scissorbeeter = new Item_form_change("scissorbeeter",item_rider_driver.class,ShowaRiderItems.blanknoitem,"","gatack"
			,new PotionEffect(MobEffects.HASTE, 5, 3,true,false),new PotionEffect(MobEffects.SPEED, 5, 4,true,false),
			new PotionEffect(MobEffects.STRENGTH, 5, 2,true,false),new PotionEffect(MobEffects.RESISTANCE, 5, 1,true,false)
			,new PotionEffect(MobEffects.JUMP_BOOST, 5, 4,true,false),new PotionEffect(PotionCore.FLY_POTION, 5, 1,true,false)
			,new PotionEffect(MobEffects.NIGHT_VISION, 500, 0,true,false)).Rend2ndLyer("scissorbeeter").addWing(scissorbeeter_wings).setCreativeTab(Tabs.tabmisc);

	
	public static Item akanetaka_wings = new Item_ore("akanetaka_wings");
	public static Item akanetaka = new Item_form_change("akanetaka",item_rider_driver.class,ShowaRiderItems.blanknoitem,"","hibiki"
			,new PotionEffect(MobEffects.STRENGTH, 5, 1,true,false),new PotionEffect(MobEffects.HASTE, 5, 3,true,false),
			new PotionEffect(MobEffects.RESISTANCE, 5, 0,true,false),new PotionEffect(MobEffects.SPEED, 5, 1,true,false)
			,new PotionEffect(PotionCore.FLY_POTION, 5, 1,true,false)).addWing(akanetaka_wings).Rend2ndLyer("akanetaka").setCreativeTab(Tabs.tabmisc);

	public static Item shadowmantis_wings = new Item_ore("shadowmantis_wings");
	public static Item shadowmantis = new Item_form_change("shadowmantis",item_rider_driver.class,ShowaRiderItems.blanknoitem,"","chalice"
			,new PotionEffect(MobEffects.STRENGTH, 5, 3,true,false),new PotionEffect(MobEffects.HASTE, 5, 0,true,false),
			new PotionEffect(MobEffects.RESISTANCE, 5, 3,true,false),new PotionEffect(MobEffects.JUMP_BOOST, 5, 0,true,false)
			,new PotionEffect(PotionCore.FLY_POTION, 5, 1,true,false)).addWing(shadowmantis_wings).Rend2ndLyer("shadowmantis").setCreativeTab(Tabs.tabmisc);

	
	public static Item cyclonehopper_wings = new Item_ore("cyclonehopper_wings");
	public static Item cyclonehopper = new Item_form_change("cyclonehopper",item_rider_driver.class,ShowaRiderItems.blanknoitem,"_cyclonehopper","ichigo"
			,new PotionEffect(MobEffects.STRENGTH,20, 3,true,false),new PotionEffect(MobEffects.RESISTANCE,20, 3,true,false)
			,new PotionEffect(MobEffects.SPEED,20, 3,true,false),new PotionEffect(MobEffects.JUMP_BOOST,20, 4,true,false)
			,new PotionEffect(PotionCore.PUNCH_BOOST_POTION, 5, 4,true,false),new PotionEffect(PotionCore.FLY_POTION, 5, 1,true,false)
			).addWing(cyclonehopper_wings).Rend2ndLyer("cyclonehopper").setCreativeTab(Tabs.tabmisc);

	
	public static Item jinrai_no_senshi_wings = new Item_ore("jinrai_no_senshi_wings");
	
	
	public static Item kuuga_jinrai_no_senshi = new Item_form_change("kuuga_jinrai_no_senshi",item_rider_driver.class,ShowaRiderItems.blanknoitem,"_rising_mighty_jinrai_no_senshi","kuuga"
			,new PotionEffect(MobEffects.RESISTANCE, 5, 2,true,false),new PotionEffect(MobEffects.SPEED, 5, 2,true,false)
			,new PotionEffect(MobEffects.JUMP_BOOST, 5, 1,true,false),new PotionEffect(MobEffects.STRENGTH, 5, 2,true,false)
			,new PotionEffect(PotionCore.PUNCH_BOOST_POTION, 5, 8,true,false)).addWing(jinrai_no_senshi_wings).Rend2ndLyer("kuuga_jinrai_no_senshi");

	public static Item blade_jinrai_no_senshi = new Item_form_change("blade_jinrai_no_senshi",item_rider_driver.class,ShowaRiderItems.blanknoitem,"_jack","blade"
			,new PotionEffect(MobEffects.STRENGTH,20, 3,true,false),new PotionEffect(MobEffects.RESISTANCE,20, 3,true,false)
			,new PotionEffect(MobEffects.SPEED,20, 3,true,false),new PotionEffect(MobEffects.JUMP_BOOST,20, 4,true,false)
			,new PotionEffect(PotionCore.PUNCH_BOOST_POTION, 5, 4,true,false),new PotionEffect(PotionCore.FLY_POTION, 5, 1,true,false)
			).Rend2ndLyer("blade_jinrai_no_senshi").addWing(jinrai_no_senshi_wings);

	public static Item dark_kabuto_jinrai_no_senshi = new Item_form_change("dark_kabuto_jinrai_no_senshi",item_rider_driver.class,ShowaRiderItems.blanknoitem,"","dark_kabuto"
			,new PotionEffect(MobEffects.STRENGTH,20, 3,true,false),new PotionEffect(MobEffects.RESISTANCE,20, 3,true,false)
			,new PotionEffect(MobEffects.SPEED,20, 3,true,false),new PotionEffect(MobEffects.JUMP_BOOST,20, 4,true,false)
			,new PotionEffect(PotionCore.PUNCH_BOOST_POTION, 5, 4,true,false),new PotionEffect(PotionCore.FLY_POTION, 5, 1,true,false)
			).Rend2ndLyer("dark_kabuto_jinrai_no_senshi").addWing(jinrai_no_senshi_wings)
			.addAlternative((Item_form_change) blade_jinrai_no_senshi).addAlternative((Item_form_change) kuuga_jinrai_no_senshi).setCreativeTab(Tabs.tabmisc);

	public static Item bakuen_no_senshi_wings = new Item_ore("bakuen_no_senshi_wings");
	public static Item bakuen_no_senshi_hibiki_wings = new Item_ore("bakuen_no_senshi_hibiki_wings");
	
	public static Item bakuen_no_senshi_ryuga = new Item_form_change("bakuen_no_senshi_ryuga",item_rider_driver.class,ShowaRiderItems.blanknoitem,"_bakuen_no_senshi","ryuga"
			,new PotionEffect(MobEffects.STRENGTH, 5, 5,true,false),new PotionEffect(MobEffects.NIGHT_VISION, 250, 0,true,false),
			new PotionEffect(MobEffects.HASTE, 5, 0,true,false),new PotionEffect(MobEffects.RESISTANCE, 5, 2,true,false),
			new PotionEffect(MobEffects.SPEED, 5, 1,true,false)).Rend2ndLyer("bakuen_no_senshi_ryuga").addWing(bakuen_no_senshi_wings);

	public static Item bakuen_no_senshi_faiz = new Item_form_change("bakuen_no_senshi_faiz",item_rider_driver.class,ShowaRiderItems.blanknoitem,"_blaster","faiz"
			,new PotionEffect(MobEffects.STRENGTH, 5, 4,true,false),new PotionEffect(MobEffects.SPEED, 5, 3,true,false),
			new PotionEffect(MobEffects.HASTE, 5, 3,true,false),new PotionEffect(MobEffects.JUMP_BOOST, 5, 3,true,false),
			new PotionEffect(MobEffects.RESISTANCE, 5, 2,true,false),new PotionEffect(MobEffects.NIGHT_VISION, 5, 0,true,false)
			,new PotionEffect(PotionCore.FLY_POTION, 5, 1,true,false)).Rend2ndLyer("bakuen_no_senshi_faiz").addWing(bakuen_no_senshi_hibiki_wings);

	public static Item bakuen_no_senshi_hibiki = new Item_form_change("bakuen_no_senshi_hibiki",item_rider_driver.class,ShowaRiderItems.blanknoitem,"_kurenai","hibiki"
			,new PotionEffect(MobEffects.STRENGTH, 5, 2,true,false),new PotionEffect(MobEffects.HASTE, 5, 3,true,false),
			new PotionEffect(MobEffects.RESISTANCE, 5, 2,true,false),new PotionEffect(MobEffects.SPEED, 5, 1,true,false)
			,new PotionEffect(MobEffects.REGENERATION, 5, 0,true,false)).Rend2ndLyer("bakuen_no_senshi_hibiki").addWing(bakuen_no_senshi_wings)
			.addAlternative((Item_form_change) bakuen_no_senshi_faiz).addAlternative((Item_form_change) bakuen_no_senshi_ryuga).setCreativeTab(Tabs.tabmisc);	

	
	
	
	public static Item build_driver_grease_perfect_kingdom = new Item_ore("build_driver_grease_perfect_kingdom");

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


	public static Item ziku_driver_build = new Item_ore("ziku_driver_build");
	public static Item ziku_driver_exaid = new Item_ore("ziku_driver_exaid");
	public static Item ziku_driver_ghost = new Item_ore("ziku_driver_ghost");
	public static Item ziku_driver_drive = new Item_ore("ziku_driver_drive");
	public static Item ziku_driver_gaim = new Item_ore("ziku_driver_gaim");
	public static Item ziku_driver_wizard = new Item_ore("ziku_driver_wizard");
	public static Item ziku_driver_fourze = new Item_ore("ziku_driver_fourze");
	public static Item ziku_driver_ooo = new Item_ore("ziku_driver_ooo");
	public static Item ziku_driver_w = new Item_ore("ziku_driver_w");
	public static Item ziku_driver_decade = new Item_ore("ziku_driver_decade");
	public static Item ziku_driver_kiva = new Item_ore("ziku_driver_kiva");
	public static Item ziku_driver_deno = new Item_ore("ziku_driver_deno");
	public static Item ziku_driver_kabuto = new Item_ore("ziku_driver_kabuto");
	public static Item ziku_driver_hibiki = new Item_ore("ziku_driver_hibiki");
	public static Item ziku_driver_blade = new Item_ore("ziku_driver_blade");
	public static Item ziku_driver_faiz = new Item_ore("ziku_driver_faiz");
	public static Item ziku_driver_ryuki = new Item_ore("ziku_driver_ryuki");
	public static Item ziku_driver_agito = new Item_ore("ziku_driver_agito");
	public static Item ziku_driver_kuuga = new Item_ore("ziku_driver_kuuga");

	public static Item ziku_driver_saber = new Item_ore("ziku_driver_saber");

	public static Item ziku_driver_zi_o_ii = new Item_ore("ziku_driver_zi_o_ii");
	public static Item ziku_driver_zi_o_trinity = new Item_ore("ziku_driver_zi_o_trinity");
	public static Item ziku_driver_zi_o_grand = new Item_ore("ziku_driver_zi_o_grand");
	public static Item ziku_driver_zio_ohma = new Item_ore("ziku_driver_zio_ohma");
	public static Item ziku_driver_woz = new Item_ore("ziku_driver_woz");
	public static Item ziku_driver_geizrevive = new Item_ore("ziku_driver_geizrevive");
	public static Item ziku_driver_bibiru_geiz = new Item_ore("ziku_driver_bibiru_geiz");
	public static Item ziku_driver_majesty = new Item_ore("ziku_driver_majesty");

	public static Item ziku_driver_genm = new Item_ore("ziku_driver_genm");

	public static Item oma_zi_o_cape = new Item_ore("oma_zi_o_cape");
	
	public static void init() {
		
	}
}



