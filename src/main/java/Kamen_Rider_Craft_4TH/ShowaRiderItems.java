package Kamen_Rider_Craft_4TH;

import Kamen_Rider_Craft_4TH.item.ItemBaseShield;
import Kamen_Rider_Craft_4TH.item.ItemBaseSword;
import Kamen_Rider_Craft_4TH.item.Item_gun;
import Kamen_Rider_Craft_4TH.item.Item_ore;
import Kamen_Rider_Craft_4TH.item.Item_sword_gun;
import Kamen_Rider_Craft_4TH.item.item_bikes;
import Kamen_Rider_Craft_4TH.item.riderfood;
import Kamen_Rider_Craft_4TH.item.Ichigo.item_Ichigoarmor;
import Kamen_Rider_Craft_4TH.item.Ichigo.item_Ichigoarmor2;
import Kamen_Rider_Craft_4TH.item.Ichigo.item_Ichigodriver;
import Kamen_Rider_Craft_4TH.item.kuuga.item_kuugadriver;
import Kamen_Rider_Craft_4TH.item.revice.Item_Vistamps;
import Kamen_Rider_Craft_4TH.item.revice.item_revicearmor;
import Kamen_Rider_Craft_4TH.item.revice.item_revicearmor2;
import Kamen_Rider_Craft_4TH.item.revice.item_revicedriver;
import Kamen_Rider_Craft_4TH.item.rider_armor_base.Item_form_change;
import Kamen_Rider_Craft_4TH.item.rider_armor_base.item_rider_armor;
import Kamen_Rider_Craft_4TH.item.rider_armor_base.item_rider_driver;
import Kamen_Rider_Craft_4TH.item.saber.Item_haouken_xross_saber;
import Kamen_Rider_Craft_4TH.item.saber.Item_wonder_ride_book;
import Kamen_Rider_Craft_4TH.item.saber.item_book_gate_wonder_ride_book;
import Kamen_Rider_Craft_4TH.item.saber.item_book_of_ruin;
import Kamen_Rider_Craft_4TH.item.saber.item_diago_speedy;
import Kamen_Rider_Craft_4TH.item.saber.item_saberarmor_head;
import Kamen_Rider_Craft_4TH.item.saber.item_saberdriver;
import Kamen_Rider_Craft_4TH.item.zero_one.Item_progrise_keys;
import Kamen_Rider_Craft_4TH.item.zero_one.item_risephone;
import Kamen_Rider_Craft_4TH.item.zero_one.item_zero_onearmor;
import Kamen_Rider_Craft_4TH.item.zero_one.item_zero_onearmor2;
import Kamen_Rider_Craft_4TH.item.zero_one.item_zero_onedriver;
import Kamen_Rider_Craft_4TH.mobs.bikes.EntityAcrobatter;
import Kamen_Rider_Craft_4TH.mobs.bikes.Entity_ridoron;
import Kamen_Rider_Craft_4TH.potion.PotionCore;
import net.minecraft.init.MobEffects;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.potion.PotionEffect;

public class ShowaRiderItems {

	public static Item blanknoitem = new Item_ore("blanknoitem");
	public static Item blanknoform = new Item_form_change("blanknoform",item_kuugadriver.class,blanknoitem,"");
	public static Item rider_circuit = new Item_ore("rider_circuit").setCreativeTab(Tabs.tabmisc);
	
	//Kamen Rider
	public static Item ichigohead = new item_Ichigoarmor("ichigohead",ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.HEAD).setMaxStackSize(1).setCreativeTab(Tabs.tabIchigo);
	public static Item ichigotroso = new item_Ichigoarmor2("ichigotroso",ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.CHEST).setMaxStackSize(1).setCreativeTab(Tabs.tabIchigo);
	public static Item ichigolegs = new item_Ichigoarmor2("ichigolegs",ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.LEGS).setMaxStackSize(1).setCreativeTab(Tabs.tabIchigo);

	public static Item typhoon_ichigo = new item_Ichigodriver("typhoon_ichigo",ArmorMaterial.DIAMOND, 4,"ichigo").setMaxStackSize(1).setCreativeTab(Tabs.tabIchigo);
	public static Item typhoon_original_ichigo = new item_Ichigodriver("typhoon_original_ichigo",ArmorMaterial.DIAMOND, 4,"original_ichigo").setMaxStackSize(1).setCreativeTab(Tabs.tabIchigo);
	public static Item typhoon_sakurajima_ichigo = new item_Ichigodriver("typhoon_sakurajima_ichigo",ArmorMaterial.DIAMOND, 4,"sakurajima_ichigo").setMaxStackSize(1).setCreativeTab(Tabs.tabIchigo);

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

	public static Item typhoon_sango = new item_Ichigodriver("typhoon_sango",ArmorMaterial.DIAMOND, 4,"sango").setMaxStackSize(1).setCreativeTab(Tabs.tabIchigo);
	public static Item typhoon_yongo = new item_Ichigodriver("typhoon_yongo",ArmorMaterial.DIAMOND, 4,"yongo").setMaxStackSize(1).setCreativeTab(Tabs.tabIchigo);

	public static Item nophoon_kamen_norider = new item_Ichigodriver("nophoon_kamen_norider",ArmorMaterial.DIAMOND, 4,"kamen_norider").setMaxStackSize(1).setCreativeTab(Tabs.tabIchigo);


	public static Item typhoon_core = new Item_ore("typhoon_core").setCreativeTab(Tabs.tabIchigo);

	//V3
	public static Item double_typhoon_core = new Item_form_change("double_typhoon_core",item_rider_driver.class,blanknoitem,"","v3"
			,new PotionEffect(MobEffects.STRENGTH,20, 1,true,false),new PotionEffect(MobEffects.RESISTANCE,20, 1,true,false)
			,new PotionEffect(MobEffects.SPEED,20, 1,true,false),new PotionEffect(MobEffects.JUMP_BOOST,20, 2,true,false)
			,new PotionEffect(PotionCore.PUNCH_BOOST_POTION, 5, 4,true,false)
			).setCreativeTab(Tabs.tabv3);
	

	public static Item riderman_belt_core = new Item_form_change("riderman_belt_core",item_rider_driver.class,blanknoitem,"",""
			,new PotionEffect(MobEffects.STRENGTH,20, 1,true,false),new PotionEffect(MobEffects.REGENERATION,20, 0,true,false)
			,new PotionEffect(MobEffects.HASTE,20, 1,true,false),new PotionEffect(PotionCore.PUNCH_BOOST_POTION, 5, 3,true,false)
			).setCreativeTab(Tabs.tabv3);

	public static Item v3head = new item_rider_armor("v3head",item_rider_driver.class,ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.HEAD, rider_circuit).setMaxStackSize(1).setCreativeTab(Tabs.tabv3);
	public static Item v3troso = new item_rider_armor("v3troso",item_rider_driver.class,ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.CHEST, rider_circuit).setMaxStackSize(1).setCreativeTab(Tabs.tabv3);
	public static Item v3legs = new item_rider_armor("v3legs",item_rider_driver.class,ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.LEGS, rider_circuit).setMaxStackSize(1).setCreativeTab(Tabs.tabv3);

	public static Item double_typhoon = new item_rider_driver("double_typhoon",ArmorMaterial.DIAMOND, 4,"v3", (Item_form_change) double_typhoon_core, v3head, v3troso, v3legs).setMaxStackSize(1).setCreativeTab(Tabs.tabv3);
	public static Item double_typhoon_blue = new item_rider_driver("double_typhoon_blue",ArmorMaterial.DIAMOND, 4,"blue_v3", (Item_form_change) double_typhoon_core, v3head, v3troso, v3legs).setMaxStackSize(1).setCreativeTab(Tabs.tabv3);
	public static Item riderman_belt = new item_rider_driver("riderman_belt",ArmorMaterial.DIAMOND, 4,"riderman", (Item_form_change) riderman_belt_core, v3head, v3troso, v3legs).setMaxStackSize(1).setCreativeTab(Tabs.tabv3);


	//X
	public static Item ridol_stick = new ItemBaseSword("ridol_stick",Tabs.ridol_stick, rider_circuit).setMaxStackSize(1).setCreativeTab(Tabs.tabx);

	public static Item ridol_core = new Item_form_change("ridol_core",item_rider_driver.class,blanknoitem,"",""
			,new PotionEffect(MobEffects.STRENGTH,20, 1,true,false),new PotionEffect(MobEffects.REGENERATION,20, 1,true,false),
			new PotionEffect(MobEffects.JUMP_BOOST,20, 1,true,false),new PotionEffect(MobEffects.SPEED,20, 2,true,false),
			new PotionEffect(PotionCore.PUNCH_BOOST_POTION, 5, 4,true,false)).setCreativeTab(Tabs.tabx);

	public static Item xhead = new item_rider_armor("xhead",item_rider_driver.class,ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.HEAD, rider_circuit).setMaxStackSize(1).setCreativeTab(Tabs.tabx);
	public static Item xtroso = new item_rider_armor("xtroso",item_rider_driver.class,ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.CHEST, rider_circuit).setMaxStackSize(1).setCreativeTab(Tabs.tabx);
	public static Item xlegs = new item_rider_armor("xlegs",item_rider_driver.class,ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.LEGS, rider_circuit).setMaxStackSize(1).setCreativeTab(Tabs.tabx);

	public static Item ridol = new item_rider_driver("ridol",ArmorMaterial.DIAMOND, 4,"x", (Item_form_change) ridol_core, xhead, xtroso, xlegs).setMaxStackSize(1).setCreativeTab(Tabs.tabx);


	//Amazon
	public static Item condorer_wheel = new Item_form_change("condorer_wheel",item_rider_driver.class,blanknoitem,"",""
			,new PotionEffect(MobEffects.STRENGTH,20, 1,true,false),new PotionEffect(MobEffects.REGENERATION,20, 1,true,false),
			new PotionEffect(MobEffects.JUMP_BOOST,20, 1,true,false),new PotionEffect(MobEffects.SPEED,20, 2,true,false),
			new PotionEffect(PotionCore.PUNCH_BOOST_POTION, 5, 4,true,false)).setCreativeTab(Tabs.tabamazon);

	public static Item amazonhead = new item_rider_armor("amazonhead",item_rider_driver.class,ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.HEAD, rider_circuit).setMaxStackSize(1).setCreativeTab(Tabs.tabamazon);
	public static Item amazontroso = new item_rider_armor("amazontroso",item_rider_driver.class,ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.CHEST, rider_circuit).setMaxStackSize(1).setCreativeTab(Tabs.tabamazon);
	public static Item amazonlegs = new item_rider_armor("amazonlegs",item_rider_driver.class,ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.LEGS, rider_circuit).setMaxStackSize(1).setCreativeTab(Tabs.tabamazon);

	public static Item condorer = new item_rider_driver("condorer",ArmorMaterial.DIAMOND, 4,"amazon", (Item_form_change) condorer_wheel, amazonhead, amazontroso, amazonlegs).setMaxStackSize(1).setCreativeTab(Tabs.tabamazon);

	public static Item gigi_armlet = new Item_ore("gigi_armlet").setCreativeTab(Tabs.tabamazon);
	public static Item gaga_armlet = new Item_ore("gaga_armlet").setCreativeTab(Tabs.tabamazon);

	//Stronger
	public static Item electrer_core = new Item_form_change("electrer_core",item_rider_driver.class,blanknoitem,"","stronger"
			,new PotionEffect(MobEffects.STRENGTH,20, 1,true,false),new PotionEffect(MobEffects.FIRE_RESISTANCE,20, 1,true,false),
			new PotionEffect(MobEffects.JUMP_BOOST,20, 1,true,false),new PotionEffect(MobEffects.SPEED,20, 2,true,false),
			new PotionEffect(PotionCore.PUNCH_BOOST_POTION, 5, 4,true,false)).setCreativeTab(Tabs.tabstronger);

	public static Item charge_up = new Item_form_change("charge_up",item_rider_driver.class,blanknoitem,"_charge_up","stronger"
			,new PotionEffect(MobEffects.STRENGTH,20, 3,true,false),new PotionEffect(MobEffects.FIRE_RESISTANCE,20, 1,true,false),
			new PotionEffect(MobEffects.JUMP_BOOST,20, 1,true,false),new PotionEffect(MobEffects.SPEED,20, 2,true,false),
			new PotionEffect(PotionCore.PUNCH_BOOST_POTION, 5, 8,true,false),new PotionEffect(MobEffects.RESISTANCE,20, 2,true,false)).setCreativeTab(Tabs.tabstronger);

	public static Item strongerhead = new item_rider_armor("strongerhead",item_rider_driver.class,ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.HEAD, rider_circuit).setMaxStackSize(1).setCreativeTab(Tabs.tabstronger);
	public static Item strongertroso = new item_rider_armor("strongertroso",item_rider_driver.class,ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.CHEST, rider_circuit).setMaxStackSize(1).setCreativeTab(Tabs.tabstronger);
	public static Item strongerlegs = new item_rider_armor("strongerlegs",item_rider_driver.class,ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.LEGS, rider_circuit).setMaxStackSize(1).setCreativeTab(Tabs.tabstronger);

	public static Item electrer = new item_rider_driver("electrer",ArmorMaterial.DIAMOND, 4,"stronger", (Item_form_change) electrer_core, strongerhead, strongertroso, strongerlegs).setMaxStackSize(1).setCreativeTab(Tabs.tabstronger);


	//SkyRider
	public static Item tornado_core = new Item_form_change("tornado_core",item_rider_driver.class,blanknoitem,"",""
			,new PotionEffect(MobEffects.STRENGTH,20, 1,true,false),new PotionEffect(PotionCore.PUNCH_BOOST_POTION,20, 4,true,false),
			new PotionEffect(MobEffects.JUMP_BOOST,20, 1,true,false),new PotionEffect(MobEffects.SPEED,20, 1,true,false),
			new PotionEffect(PotionCore.FLY_POTION, 5, 1,true,false)).setCreativeTab(Tabs.tabskyrider);

	public static Item skyriderhead = new item_rider_armor("skyriderhead",item_rider_driver.class,ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.HEAD, rider_circuit).setMaxStackSize(1).setCreativeTab(Tabs.tabskyrider);
	public static Item skyridertroso = new item_rider_armor("skyridertroso",item_rider_driver.class,ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.CHEST, rider_circuit).setMaxStackSize(1).setCreativeTab(Tabs.tabskyrider);
	public static Item skyriderlegs = new item_rider_armor("skyriderlegs",item_rider_driver.class,ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.LEGS, rider_circuit).setMaxStackSize(1).setCreativeTab(Tabs.tabskyrider);

	public static Item tornado = new item_rider_driver("tornado",ArmorMaterial.DIAMOND, 4,"skyrider", (Item_form_change) tornado_core, skyriderhead, skyridertroso, skyriderlegs).setMaxStackSize(1).setCreativeTab(Tabs.tabskyrider);


	//Super 1
	public static Item cyclode_core = new Item_form_change("cyclode_core",item_rider_driver.class,blanknoitem,"",""
			,new PotionEffect(MobEffects.STRENGTH,20, 1,true,false),new PotionEffect(MobEffects.FIRE_RESISTANCE,20, 1,true,false),
			new PotionEffect(MobEffects.JUMP_BOOST,20, 1,true,false),new PotionEffect(MobEffects.SPEED,20, 2,true,false),
			new PotionEffect(PotionCore.PUNCH_BOOST_POTION, 5, 4,true,false)).setCreativeTab(Tabs.tabsuper_1);

	public static Item super_1head = new item_rider_armor("super_1head",item_rider_driver.class,ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.HEAD, rider_circuit).setMaxStackSize(1).setCreativeTab(Tabs.tabsuper_1);
	public static Item super_1troso = new item_rider_armor("super_1troso",item_rider_driver.class,ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.CHEST, rider_circuit).setMaxStackSize(1).setCreativeTab(Tabs.tabsuper_1);
	public static Item super_1legs = new item_rider_armor("super_1legs",item_rider_driver.class,ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.LEGS, rider_circuit).setMaxStackSize(1).setCreativeTab(Tabs.tabsuper_1);

	public static Item cyclode = new item_rider_driver("cyclode",ArmorMaterial.DIAMOND, 4,"super1", (Item_form_change) cyclode_core, super_1head, super_1troso, super_1legs).setMaxStackSize(1).setCreativeTab(Tabs.tabsuper_1);


	//ZX
	public static Item zx_belt_core = new Item_form_change("zx_belt_core",item_rider_driver.class,blanknoitem,"",""
			,new PotionEffect(MobEffects.STRENGTH,20, 1,true,false),new PotionEffect(MobEffects.FIRE_RESISTANCE,20, 1,true,false),
			new PotionEffect(MobEffects.JUMP_BOOST,20, 1,true,false),new PotionEffect(MobEffects.SPEED,20, 2,true,false),
			new PotionEffect(PotionCore.PUNCH_BOOST_POTION, 5, 4,true,false)).setCreativeTab(Tabs.tabzx);
			
	public static Item zx_head = new item_rider_armor("zx_head",item_rider_driver.class,ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.HEAD, rider_circuit).setMaxStackSize(1).setCreativeTab(Tabs.tabzx);
	public static Item zx_troso = new item_rider_armor("zx_troso",item_rider_driver.class,ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.CHEST, rider_circuit).setMaxStackSize(1).setCreativeTab(Tabs.tabzx);
	public static Item zx_legs = new item_rider_armor("zx_legs",item_rider_driver.class,ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.LEGS, rider_circuit).setMaxStackSize(1).setCreativeTab(Tabs.tabzx);

	public static Item zx_belt = new item_rider_driver("zx_belt",ArmorMaterial.DIAMOND, 4,"zx", (Item_form_change) zx_belt_core, zx_head, zx_troso, zx_legs).setMaxStackSize(1).setCreativeTab(Tabs.tabzx);
	public static Item susanoo_belt = new item_rider_driver("susanoo_belt",ArmorMaterial.DIAMOND, 4,"susanoo", (Item_form_change) zx_belt_core, zx_head, zx_troso, zx_legs).setMaxStackSize(1).setCreativeTab(Tabs.tabzx);
	public static Item tsukuyomi_belt = new item_rider_driver("tsukuyomi_belt",ArmorMaterial.DIAMOND, 4,"tsukuyomi", (Item_form_change) zx_belt_core, zx_head, zx_troso, zx_legs).setMaxStackSize(1).setCreativeTab(Tabs.tabzx);
	public static Item amaterasu_belt = new item_rider_driver("amaterasu_belt",ArmorMaterial.DIAMOND, 4,"amaterasu", (Item_form_change) zx_belt_core, zx_head, zx_troso, zx_legs).setMaxStackSize(1).setCreativeTab(Tabs.tabzx);


	//Black
	public static Item satan_sabre = new ItemBaseSword("satan_sabre",ToolMaterial.DIAMOND, rider_circuit).setMaxStackSize(1).setCreativeTab(Tabs.tabblack);
	public static Item shadow_saber_short = new ItemBaseSword("shadow_saber_short",ToolMaterial.DIAMOND, rider_circuit).setMaxStackSize(1).setCreativeTab(Tabs.tabblack);
	
	public static Item king_stone_core = new Item_form_change("king_stone_core",item_rider_driver.class,blanknoitem,"",""
			,new PotionEffect(MobEffects.STRENGTH, 20, 1,true,false),new PotionEffect(MobEffects.HASTE,20, 1,true,false)
			,new PotionEffect(PotionCore.PUNCH_BOOST_POTION, 20, 4,true,false)
			).setCreativeTab(Tabs.tabblack);

	public static Item black_head = new item_rider_armor("black_head",item_rider_driver.class,ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.HEAD, rider_circuit).setMaxStackSize(1).setCreativeTab(Tabs.tabblack);
	public static Item black_troso = new item_rider_armor("black_troso",item_rider_driver.class,ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.CHEST, rider_circuit).setMaxStackSize(1).setCreativeTab(Tabs.tabblack);
	public static Item black_legs = new item_rider_armor("black_legs",item_rider_driver.class,ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.LEGS, rider_circuit).setMaxStackSize(1).setCreativeTab(Tabs.tabblack);

	public static Item king_stone = new item_rider_driver("king_stone",ArmorMaterial.DIAMOND, 4,"black", (Item_form_change) king_stone_core, black_head, black_troso, black_legs).setMaxStackSize(1).setCreativeTab(Tabs.tabblack);
	public static Item king_stone_green = new item_rider_driver("king_stone_green",ArmorMaterial.DIAMOND, 4,"black_green", (Item_form_change)king_stone_core, black_head, black_troso, black_legs).setMaxStackSize(1).setCreativeTab(Tabs.tabblack);
	public static Item king_stone_shadow_moon = new item_rider_driver("king_stone_shadow_moon",ArmorMaterial.DIAMOND, 4,"shadow_moon", (Item_form_change) king_stone_core, black_head, black_troso, black_legs).setMaxStackSize(1).setCreativeTab(Tabs.tabblack);
	public static Item king_stone_red_shadow_moon = new item_rider_driver("king_stone_red_shadow_moon",ArmorMaterial.DIAMOND, 4,"red_shadow_moon", (Item_form_change)king_stone_core, black_head, black_troso, black_legs).setMaxStackSize(1).setCreativeTab(Tabs.tabblack);

	//Black RX
	public static Item revolcane = new ItemBaseSword("revolcane",ToolMaterial.DIAMOND, rider_circuit).setMaxStackSize(1).setCreativeTab(Tabs.tabblack_rx);
	public static Item vortech_shooter = new Item_gun("vortech_shooter",Tabs.den_dengu, rider_circuit).setCreativeTab(Tabs.tabblack_rx);
	public static Item bio_blade = new ItemBaseSword("bio_blade",ToolMaterial.DIAMOND, rider_circuit).setMaxStackSize(1).setCreativeTab(Tabs.tabblack_rx);

	
	public static Item sunriser_rr = new Item_ore("sunriser_rr");
	public static Item sunriser_br = new Item_ore("sunriser_br");

	public static Item rx_rider = new Item_form_change("rx_rider",item_rider_driver.class,blanknoitem,"","black_rx"
			,new PotionEffect(MobEffects.STRENGTH, 20, 1,true,false),new PotionEffect(MobEffects.SPEED,20, 1,true,false),
			new PotionEffect(MobEffects.JUMP_BOOST,20, 2,true,false),new PotionEffect(PotionCore.PUNCH_BOOST_POTION, 20, 4,true,false)
			).setCreativeTab(Tabs.tabblack_rx);

	public static Item bio_rider = new Item_form_change("bio_rider",item_rider_driver.class,sunriser_rr,"_bio_rider","black_rx"
			,new PotionEffect(MobEffects.STRENGTH, 20, 1,true,false),new PotionEffect(MobEffects.NIGHT_VISION,20, 1,true,false),
			new PotionEffect(MobEffects.JUMP_BOOST,20, 2,true,false)).setCreativeTab(Tabs.tabblack_rx);

	public static Item robo_rider = new Item_form_change("robo_rider",item_rider_driver.class,sunriser_br,"_robo_rider","black_rx"
			,new PotionEffect(MobEffects.STRENGTH, 20, 1,true,false),new PotionEffect(MobEffects.NIGHT_VISION,20, 1,true,false),
			new PotionEffect(MobEffects.RESISTANCE,20, 2,true,false)).setCreativeTab(Tabs.tabblack_rx);

	public static Item black_rx_head = new item_rider_armor("black_rx_head",item_rider_driver.class,ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.HEAD, rider_circuit).setMaxStackSize(1).setCreativeTab(Tabs.tabblack_rx);
	public static Item black_rx_troso = new item_rider_armor("black_rx_troso",item_rider_driver.class,ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.CHEST, rider_circuit).setMaxStackSize(1).setCreativeTab(Tabs.tabblack_rx);
	public static Item black_rx_legs = new item_rider_armor("black_rx_legs",item_rider_driver.class,ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.LEGS, rider_circuit).setMaxStackSize(1).setCreativeTab(Tabs.tabblack_rx);

	public static Item sunriser = new item_rider_driver("sunriser",ArmorMaterial.DIAMOND, 4,"black_rx", (Item_form_change) rx_rider, black_rx_head, black_rx_troso, black_rx_legs).setMaxStackSize(1).setCreativeTab(Tabs.tabblack_rx);
	public static Item moonriser = new item_rider_driver("moonriser",ArmorMaterial.DIAMOND, 4,"white_rx", (Item_form_change) rx_rider, black_rx_head, black_rx_troso, black_rx_legs).setMaxStackSize(1).setCreativeTab(Tabs.tabblack_rx);

	public static Item king_stone_split = new Item_ore("king_stone_split").setCreativeTab(Tabs.tabblack_rx);

	public static Item acro_batter = new item_bikes("acro_batter",EntityAcrobatter::new).setMaxStackSize(1).setCreativeTab(Tabs.tabblack_rx);
	public static Item ridoron = new item_bikes("ridoron",Entity_ridoron::new).setMaxStackSize(1).setCreativeTab(Tabs.tabblack_rx);

	//shin

	public static Item shin_stone = new Item_form_change("shin_stone",item_rider_driver.class,blanknoitem,"",""
			,new PotionEffect(MobEffects.STRENGTH, 20, 1,true,false),new PotionEffect(MobEffects.SPEED,20, 1,true,false),
	new PotionEffect(MobEffects.JUMP_BOOST,20, 2,true,false),new PotionEffect(PotionCore.PUNCH_BOOST_POTION, 5, 4,true,false)).keep_item().setCreativeTab(Tabs.tabshin);


	public static Item shinhead = new item_rider_armor("shinhead",item_rider_driver.class,ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.HEAD, rider_circuit).setMaxStackSize(1).setCreativeTab(Tabs.tabshin);
	public static Item shintroso = new item_rider_armor("shintroso",item_rider_driver.class,ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.CHEST, rider_circuit).setMaxStackSize(1).setCreativeTab(Tabs.tabshin);
	public static Item shinlegs = new item_rider_armor("shinlegs",item_rider_driver.class,ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.LEGS, rider_circuit).setMaxStackSize(1).setCreativeTab(Tabs.tabshin);

	public static Item grasshopper_dna = new item_rider_driver("grasshopper_dna",ArmorMaterial.DIAMOND, 4,"shin", (Item_form_change) shin_stone, shinhead, shintroso, shinlegs).belt(true).setMaxStackSize(1).setCreativeTab(Tabs.tabshin);


	//ZO

	public static Item zo_stone = new Item_form_change("zo_stone",item_rider_driver.class,blanknoitem,"",""
			,new PotionEffect(MobEffects.STRENGTH, 20, 1,true,false),new PotionEffect(MobEffects.SPEED,20, 1,true,false),new PotionEffect(MobEffects.JUMP_BOOST,20, 2,true,false)
			,new PotionEffect(PotionCore.PUNCH_BOOST_POTION, 5, 4,true,false)).keep_item().setCreativeTab(Tabs.tabzo);


	public static Item zohead = new item_rider_armor("zohead",item_rider_driver.class,ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.HEAD, rider_circuit).setMaxStackSize(1).setCreativeTab(Tabs.tabzo);
	public static Item zotroso = new item_rider_armor("zotroso",item_rider_driver.class,ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.CHEST, rider_circuit).setMaxStackSize(1).setCreativeTab(Tabs.tabzo);
	public static Item zolegs = new item_rider_armor("zolegs",item_rider_driver.class,ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.LEGS, rider_circuit).setMaxStackSize(1).setCreativeTab(Tabs.tabzo);

	public static Item zo_core = new item_rider_driver("zo_core",ArmorMaterial.DIAMOND, 4,"zo", (Item_form_change) zo_stone, zohead, zotroso, zolegs).belt(true).setMaxStackSize(1).setCreativeTab(Tabs.tabzo);



	//J

	public static Item j_stone = new Item_form_change("j_stone",item_rider_driver.class,blanknoitem,"",""
			,new PotionEffect(MobEffects.STRENGTH, 20, 1,true,false),new PotionEffect(MobEffects.SPEED,20, 1,true,false),new PotionEffect(MobEffects.JUMP_BOOST,20, 2,true,false)
			,new PotionEffect(PotionCore.PUNCH_BOOST_POTION, 5, 4,true,false),new PotionEffect(PotionCore.BIG_POTION, 5, 4,true,false)).keep_item().setCreativeTab(Tabs.tabj);

	public static Item jhead = new item_rider_armor("jhead",item_rider_driver.class,ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.HEAD, rider_circuit).setMaxStackSize(1).setCreativeTab(Tabs.tabj);
	public static Item jtroso = new item_rider_armor("jtroso",item_rider_driver.class,ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.CHEST, rider_circuit).setMaxStackSize(1).setCreativeTab(Tabs.tabj);
	public static Item jlegs = new item_rider_armor("jlegs",item_rider_driver.class,ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.LEGS, rider_circuit).setMaxStackSize(1).setCreativeTab(Tabs.tabj);

	public static Item j_spirit = new item_rider_driver("j_spirit",ArmorMaterial.DIAMOND, 4,"j", (Item_form_change) j_stone, jhead, jtroso, jlegs).belt(true).setMaxStackSize(1).setCreativeTab(Tabs.tabj);


	
	public static void init() {
	}

	//public static void init(){}
}



