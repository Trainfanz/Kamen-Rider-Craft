package Kamen_Rider_Craft_4TH;

import Kamen_Rider_Craft_4TH.blocks.amazon_cell_extractor;
import Kamen_Rider_Craft_4TH.blocks.amazon_cell_mutator;
import Kamen_Rider_Craft_4TH.blocks.kaijin_stone_generator_block;
import Kamen_Rider_Craft_4TH.item.ItemBaseShield;
import Kamen_Rider_Craft_4TH.item.ItemBaseSword;
import Kamen_Rider_Craft_4TH.item.Item_gun;
import Kamen_Rider_Craft_4TH.item.Item_ore;
import Kamen_Rider_Craft_4TH.item.Item_sword_gun;
import Kamen_Rider_Craft_4TH.item.item_bikes;
import Kamen_Rider_Craft_4TH.item.riderfood;
import Kamen_Rider_Craft_4TH.item.amazons.item_amazonsdriver;
import Kamen_Rider_Craft_4TH.item.kabuto.Item_zecter;
import Kamen_Rider_Craft_4TH.item.revice.Item_Vistamps;
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
import Kamen_Rider_Craft_4TH.item.zero_one.item_zero_onedriver;
import Kamen_Rider_Craft_4TH.mobs.bikes.EntityAcrobatter;
import Kamen_Rider_Craft_4TH.mobs.bikes.Entity_ridoron;
import Kamen_Rider_Craft_4TH.potion.PotionCore;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.MobEffects;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.potion.PotionEffect;

public class ShowaRiderItems {

	
	
	public static Item blanknoitem = new Item_ore("blanknoitem");
	public static Item blanknoform = new Item_form_change("blanknoform",item_rider_driver.class,0,"","");
	public static Item rider_circuit = new Item_ore("rider_circuit").setCreativeTab(Tabs.tabmisc);
	
	//Kamen Rider
	
	public static Item typhoon_core = new Item_form_change("typhoon_core",item_rider_driver.class,0,"","ichigo"
			,new PotionEffect(MobEffects.STRENGTH, 20, 1,true,false),new PotionEffect(MobEffects.SPEED,20, 1,true,false),
			new PotionEffect(MobEffects.JUMP_BOOST,20, 2,true,false),new PotionEffect(PotionCore.PUNCH_BOOST_POTION, 20, 4,true,false)
			).setCreativeTab(Tabs.tabIchigo);


	public static Item original_typhoon_core = new Item_form_change("original_typhoon_core",item_rider_driver.class,0,"_original","ichigo"
			,new PotionEffect(MobEffects.STRENGTH, 20, 1,true,false),new PotionEffect(MobEffects.SPEED,20, 1,true,false),
			new PotionEffect(MobEffects.JUMP_BOOST,20, 2,true,false),new PotionEffect(PotionCore.PUNCH_BOOST_POTION, 20, 4,true,false)
			).setCreativeTab(Tabs.tabIchigo);

	public static Item sakurajima_typhoon_core = new Item_form_change("sakurajima_typhoon_core",item_rider_driver.class,0,"_sakurajima","ichigo"
			,new PotionEffect(MobEffects.STRENGTH, 20, 1,true,false),new PotionEffect(MobEffects.SPEED,20, 1,true,false),
			new PotionEffect(MobEffects.JUMP_BOOST,20, 2,true,false),new PotionEffect(PotionCore.PUNCH_BOOST_POTION, 20, 4,true,false)
			).setCreativeTab(Tabs.tabIchigo);

	public static Item rider3_vs_the_demon_of_general_black = new Item_form_change("rider3_vs_the_demon_of_general_black",item_rider_driver.class,0,"_manga","sango"
			,new PotionEffect(MobEffects.STRENGTH, 20, 1,true,false),new PotionEffect(MobEffects.SPEED,20, 1,true,false),
			new PotionEffect(MobEffects.JUMP_BOOST,20, 2,true,false),new PotionEffect(PotionCore.PUNCH_BOOST_POTION, 20, 4,true,false)
			).setCreativeTab(Tabs.tabIchigo);

	
	public static Item new_typhoon_core = new Item_form_change("new_typhoon_core",item_rider_driver.class,1,"_new","ichigo"
			,new PotionEffect(MobEffects.STRENGTH, 20, 1,true,false),new PotionEffect(MobEffects.SPEED,20, 1,true,false),
			new PotionEffect(MobEffects.JUMP_BOOST,20, 2,true,false),new PotionEffect(PotionCore.PUNCH_BOOST_POTION, 20, 4,true,false)
			).Rend2ndLyer("ichigo_new_up").setCreativeTab(Tabs.tabIchigo);

	
	public static Item ichigohead = new item_rider_armor("ichigohead",item_rider_driver.class,ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.HEAD, rider_circuit).setMaxStackSize(1).setCreativeTab(Tabs.tabIchigo);
	public static Item ichigotroso = new item_rider_armor("ichigotroso",item_rider_driver.class,ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.CHEST, rider_circuit).setMaxStackSize(1).setCreativeTab(Tabs.tabIchigo);
	public static Item ichigolegs = new item_rider_armor("ichigolegs",item_rider_driver.class,ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.LEGS, rider_circuit).setMaxStackSize(1).setCreativeTab(Tabs.tabIchigo);

	public static Item typhoon_ichigo = new item_rider_driver("typhoon_ichigo",ArmorMaterial.DIAMOND, 4,"ichigo", (Item_form_change) typhoon_core, ichigohead, ichigotroso, ichigolegs, rider_circuit).setMaxStackSize(1).setCreativeTab(Tabs.tabIchigo);
	
	public static Item typhoon_nigo = new item_rider_driver("typhoon_nigo",ArmorMaterial.DIAMOND, 4,"nigo", (Item_form_change) typhoon_core, ichigohead, ichigotroso, ichigolegs, rider_circuit).setMaxStackSize(1).setCreativeTab(Tabs.tabIchigo);
	
	public static Item typhoon_sango = new item_rider_driver("typhoon_sango",ArmorMaterial.DIAMOND, 4,"sango", (Item_form_change) typhoon_core, ichigohead, ichigotroso, ichigolegs, rider_circuit).setMaxStackSize(1).setCreativeTab(Tabs.tabIchigo);
	
	public static Item typhoon_yongo = new item_rider_driver("typhoon_yongo",ArmorMaterial.DIAMOND, 4,"yongo", (Item_form_change) typhoon_core, ichigohead, ichigotroso, ichigolegs, rider_circuit).setMaxStackSize(1).setCreativeTab(Tabs.tabIchigo);

	public static Item typhoon_shocker_rider_1 = new item_rider_driver("typhoon_shocker_rider_1",ArmorMaterial.DIAMOND, 4,"shocker_rider_1", (Item_form_change) typhoon_core, ichigohead, ichigotroso, ichigolegs, rider_circuit).setMaxStackSize(1).setCreativeTab(Tabs.tabIchigo);
	public static Item typhoon_shocker_rider_2 = new item_rider_driver("typhoon_shocker_rider_2",ArmorMaterial.DIAMOND, 4,"shocker_rider_2", (Item_form_change) typhoon_core, ichigohead, ichigotroso, ichigolegs, rider_circuit).setMaxStackSize(1).setCreativeTab(Tabs.tabIchigo);
	public static Item typhoon_shocker_rider_3 = new item_rider_driver("typhoon_shocker_rider_3",ArmorMaterial.DIAMOND, 4,"shocker_rider_3", (Item_form_change) typhoon_core, ichigohead, ichigotroso, ichigolegs, rider_circuit).setMaxStackSize(1).setCreativeTab(Tabs.tabIchigo);
	public static Item typhoon_shocker_rider_4 = new item_rider_driver("typhoon_shocker_rider_4",ArmorMaterial.DIAMOND, 4,"shocker_rider_4", (Item_form_change) typhoon_core, ichigohead, ichigotroso, ichigolegs, rider_circuit).setMaxStackSize(1).setCreativeTab(Tabs.tabIchigo);
	public static Item typhoon_shocker_rider_5 = new item_rider_driver("typhoon_shocker_rider_5",ArmorMaterial.DIAMOND, 4,"shocker_rider_5", (Item_form_change) typhoon_core, ichigohead, ichigotroso, ichigolegs, rider_circuit).setMaxStackSize(1).setCreativeTab(Tabs.tabIchigo);
	public static Item typhoon_shocker_rider_6 = new item_rider_driver("typhoon_shocker_rider_6",ArmorMaterial.DIAMOND, 4,"shocker_rider_6", (Item_form_change) typhoon_core, ichigohead, ichigotroso, ichigolegs, rider_circuit).setMaxStackSize(1).setCreativeTab(Tabs.tabIchigo);
	public static Item typhoon_shocker_rider_7 = new item_rider_driver("typhoon_shocker_rider_7",ArmorMaterial.DIAMOND, 4,"shocker_rider_7", (Item_form_change) typhoon_core, ichigohead, ichigotroso, ichigolegs, rider_circuit).setMaxStackSize(1).setCreativeTab(Tabs.tabIchigo);
	public static Item typhoon_shocker_rider_8 = new item_rider_driver("typhoon_shocker_rider_8",ArmorMaterial.DIAMOND, 4,"shocker_rider_8", (Item_form_change) typhoon_core, ichigohead, ichigotroso, ichigolegs, rider_circuit).setMaxStackSize(1).setCreativeTab(Tabs.tabIchigo);
	public static Item typhoon_shocker_rider_9 = new item_rider_driver("typhoon_shocker_rider_9",ArmorMaterial.DIAMOND, 4,"shocker_rider_9", (Item_form_change) typhoon_core, ichigohead, ichigotroso, ichigolegs, rider_circuit).setMaxStackSize(1).setCreativeTab(Tabs.tabIchigo);
	public static Item typhoon_shocker_rider_10 = new item_rider_driver("typhoon_shocker_rider_10",ArmorMaterial.DIAMOND, 4,"shocker_rider_10", (Item_form_change) typhoon_core, ichigohead, ichigotroso, ichigolegs, rider_circuit).setMaxStackSize(1).setCreativeTab(Tabs.tabIchigo);
	public static Item typhoon_shocker_rider_11 = new item_rider_driver("typhoon_shocker_rider_11",ArmorMaterial.DIAMOND, 4,"shocker_rider_11", (Item_form_change) typhoon_core, ichigohead, ichigotroso, ichigolegs, rider_circuit).setMaxStackSize(1).setCreativeTab(Tabs.tabIchigo);
	public static Item typhoon_shocker_rider_12 = new item_rider_driver("typhoon_shocker_rider_12",ArmorMaterial.DIAMOND, 4,"shocker_rider_12", (Item_form_change) typhoon_core, ichigohead, ichigotroso, ichigolegs, rider_circuit).setMaxStackSize(1).setCreativeTab(Tabs.tabIchigo);
	
	
	public static Item nophoon_kamen_norider = new item_rider_driver("nophoon_kamen_norider",ArmorMaterial.DIAMOND, 4,"kamen_norider", (Item_form_change) typhoon_core, ichigohead, ichigotroso, ichigolegs, rider_circuit).setMaxStackSize(1).setCreativeTab(Tabs.tabIchigo);



	//V3
	public static Item double_typhoon_core = new Item_form_change("double_typhoon_core",item_rider_driver.class,0,"","v3"
			,new PotionEffect(MobEffects.STRENGTH,20, 1,true,false),new PotionEffect(MobEffects.RESISTANCE,20, 1,true,false)
			,new PotionEffect(MobEffects.SPEED,20, 1,true,false),new PotionEffect(MobEffects.JUMP_BOOST,20, 2,true,false)
			,new PotionEffect(PotionCore.PUNCH_BOOST_POTION, 5, 4,true,false)
			).setCreativeTab(Tabs.tabv3);
	

	public static Item riderman_belt_core = new Item_form_change("riderman_belt_core",item_rider_driver.class,0,"",""
			,new PotionEffect(MobEffects.STRENGTH,20, 1,true,false),new PotionEffect(MobEffects.REGENERATION,20, 0,true,false)
			,new PotionEffect(MobEffects.HASTE,20, 1,true,false),new PotionEffect(PotionCore.PUNCH_BOOST_POTION, 5, 3,true,false)
			).setCreativeTab(Tabs.tabv3);

	public static Item v3head = new item_rider_armor("v3head",item_rider_driver.class,ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.HEAD, rider_circuit).setMaxStackSize(1).setCreativeTab(Tabs.tabv3);
	public static Item v3troso = new item_rider_armor("v3troso",item_rider_driver.class,ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.CHEST, rider_circuit).setMaxStackSize(1).setCreativeTab(Tabs.tabv3);
	public static Item v3legs = new item_rider_armor("v3legs",item_rider_driver.class,ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.LEGS, rider_circuit).setMaxStackSize(1).setCreativeTab(Tabs.tabv3);

	public static Item double_typhoon = new item_rider_driver("double_typhoon",ArmorMaterial.DIAMOND, 4,"v3", (Item_form_change) double_typhoon_core, v3head, v3troso, v3legs, rider_circuit).setMaxStackSize(1).setCreativeTab(Tabs.tabv3);
	public static Item double_typhoon_blue = new item_rider_driver("double_typhoon_blue",ArmorMaterial.DIAMOND, 4,"blue_v3", (Item_form_change) double_typhoon_core, v3head, v3troso, v3legs, rider_circuit).setMaxStackSize(1).setCreativeTab(Tabs.tabv3);
	public static Item riderman_belt = new item_rider_driver("riderman_belt",ArmorMaterial.DIAMOND, 4,"riderman", (Item_form_change) riderman_belt_core, v3head, v3troso, v3legs, rider_circuit).setMaxStackSize(1).setCreativeTab(Tabs.tabv3);


	//X
	public static Item ridol_stick = new ItemBaseSword("ridol_stick",Tabs.ridol_stick, rider_circuit).setMaxStackSize(1).setCreativeTab(Tabs.tabx);

	public static Item ridol_core = new Item_form_change("ridol_core",item_rider_driver.class,0,"",""
			,new PotionEffect(MobEffects.STRENGTH,20, 1,true,false),new PotionEffect(MobEffects.REGENERATION,20, 1,true,false),
			new PotionEffect(MobEffects.JUMP_BOOST,20, 1,true,false),new PotionEffect(MobEffects.SPEED,20, 2,true,false),
			new PotionEffect(PotionCore.PUNCH_BOOST_POTION, 5, 4,true,false)).setCreativeTab(Tabs.tabx);

	public static Item xhead = new item_rider_armor("xhead",item_rider_driver.class,ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.HEAD, rider_circuit).setMaxStackSize(1).setCreativeTab(Tabs.tabx);
	public static Item xtroso = new item_rider_armor("xtroso",item_rider_driver.class,ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.CHEST, rider_circuit).setMaxStackSize(1).setCreativeTab(Tabs.tabx);
	public static Item xlegs = new item_rider_armor("xlegs",item_rider_driver.class,ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.LEGS, rider_circuit).setMaxStackSize(1).setCreativeTab(Tabs.tabx);

	public static Item ridol = new item_rider_driver("ridol",ArmorMaterial.DIAMOND, 4,"x", (Item_form_change) ridol_core, xhead, xtroso, xlegs, rider_circuit).setMaxStackSize(1).setCreativeTab(Tabs.tabx);


	//Amazon
	public static Item condorer_wheel = new Item_form_change("condorer_wheel",item_rider_driver.class,0,"",""
			,new PotionEffect(MobEffects.STRENGTH,20, 1,true,false),new PotionEffect(MobEffects.REGENERATION,20, 1,true,false),
			new PotionEffect(MobEffects.JUMP_BOOST,20, 1,true,false),new PotionEffect(MobEffects.SPEED,20, 2,true,false),
			new PotionEffect(PotionCore.PUNCH_BOOST_POTION, 5, 4,true,false)).setCreativeTab(Tabs.tabamazon);

	public static Item amazonhead = new item_rider_armor("amazonhead",item_rider_driver.class,ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.HEAD, rider_circuit).setMaxStackSize(1).setCreativeTab(Tabs.tabamazon);
	public static Item amazontroso = new item_rider_armor("amazontroso",item_rider_driver.class,ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.CHEST, rider_circuit).setMaxStackSize(1).setCreativeTab(Tabs.tabamazon);
	public static Item amazonlegs = new item_rider_armor("amazonlegs",item_rider_driver.class,ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.LEGS, rider_circuit).setMaxStackSize(1).setCreativeTab(Tabs.tabamazon);

	public static Item condorer = new item_rider_driver("condorer",ArmorMaterial.DIAMOND, 4,"amazon", (Item_form_change) condorer_wheel, amazonhead, amazontroso, amazonlegs, rider_circuit).setMaxStackSize(1).setCreativeTab(Tabs.tabamazon);

	public static Item gigi_armlet = new Item_ore("gigi_armlet").setCreativeTab(Tabs.tabamazon);
	public static Item gaga_armlet = new Item_ore("gaga_armlet").setCreativeTab(Tabs.tabamazon);

	//Stronger
	public static Item electrer_core = new Item_form_change("electrer_core",item_rider_driver.class,0,"","stronger"
			,new PotionEffect(MobEffects.STRENGTH,20, 1,true,false),new PotionEffect(MobEffects.FIRE_RESISTANCE,20, 1,true,false),
			new PotionEffect(MobEffects.JUMP_BOOST,20, 1,true,false),new PotionEffect(MobEffects.SPEED,20, 2,true,false),
			new PotionEffect(PotionCore.PUNCH_BOOST_POTION, 5, 4,true,false)).setCreativeTab(Tabs.tabstronger);

	public static Item charge_up = new Item_form_change("charge_up",item_rider_driver.class,0,"_charge_up","stronger"
			,new PotionEffect(MobEffects.STRENGTH,20, 3,true,false),new PotionEffect(MobEffects.FIRE_RESISTANCE,20, 1,true,false),
			new PotionEffect(MobEffects.JUMP_BOOST,20, 1,true,false),new PotionEffect(MobEffects.SPEED,20, 2,true,false),
			new PotionEffect(PotionCore.PUNCH_BOOST_POTION, 5, 8,true,false),new PotionEffect(MobEffects.RESISTANCE,20, 2,true,false)).setCreativeTab(Tabs.tabstronger);

	public static Item strongerhead = new item_rider_armor("strongerhead",item_rider_driver.class,ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.HEAD, rider_circuit).setMaxStackSize(1).setCreativeTab(Tabs.tabstronger);
	public static Item strongertroso = new item_rider_armor("strongertroso",item_rider_driver.class,ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.CHEST, rider_circuit).setMaxStackSize(1).setCreativeTab(Tabs.tabstronger);
	public static Item strongerlegs = new item_rider_armor("strongerlegs",item_rider_driver.class,ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.LEGS, rider_circuit).setMaxStackSize(1).setCreativeTab(Tabs.tabstronger);

	public static Item electrer = new item_rider_driver("electrer",ArmorMaterial.DIAMOND, 4,"stronger", (Item_form_change) electrer_core, strongerhead, strongertroso, strongerlegs, rider_circuit).setMaxStackSize(1).setCreativeTab(Tabs.tabstronger);


	//SkyRider
	public static Item tornado_core = new Item_form_change("tornado_core",item_rider_driver.class,0,"",""
			,new PotionEffect(MobEffects.STRENGTH,20, 1,true,false),new PotionEffect(PotionCore.PUNCH_BOOST_POTION,20, 4,true,false),
			new PotionEffect(MobEffects.JUMP_BOOST,20, 1,true,false),new PotionEffect(MobEffects.SPEED,20, 1,true,false),
			new PotionEffect(PotionCore.FLY_POTION, 5, 1,true,false)).setCreativeTab(Tabs.tabskyrider);

	public static Item skyriderhead = new item_rider_armor("skyriderhead",item_rider_driver.class,ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.HEAD, rider_circuit).setMaxStackSize(1).setCreativeTab(Tabs.tabskyrider);
	public static Item skyridertroso = new item_rider_armor("skyridertroso",item_rider_driver.class,ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.CHEST, rider_circuit).setMaxStackSize(1).setCreativeTab(Tabs.tabskyrider);
	public static Item skyriderlegs = new item_rider_armor("skyriderlegs",item_rider_driver.class,ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.LEGS, rider_circuit).setMaxStackSize(1).setCreativeTab(Tabs.tabskyrider);

	public static Item tornado = new item_rider_driver("tornado",ArmorMaterial.DIAMOND, 4,"skyrider", (Item_form_change) tornado_core, skyriderhead, skyridertroso, skyriderlegs, rider_circuit).setMaxStackSize(1).setCreativeTab(Tabs.tabskyrider);


	//Super 1
	public static Item cyclode_core = new Item_form_change("cyclode_core",item_rider_driver.class,0,"",""
			,new PotionEffect(MobEffects.STRENGTH,20, 1,true,false),new PotionEffect(MobEffects.FIRE_RESISTANCE,20, 1,true,false),
			new PotionEffect(MobEffects.JUMP_BOOST,20, 1,true,false),new PotionEffect(MobEffects.SPEED,20, 2,true,false),
			new PotionEffect(PotionCore.PUNCH_BOOST_POTION, 5, 4,true,false)).setCreativeTab(Tabs.tabsuper_1);

	public static Item super_1head = new item_rider_armor("super_1head",item_rider_driver.class,ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.HEAD, rider_circuit).setMaxStackSize(1).setCreativeTab(Tabs.tabsuper_1);
	public static Item super_1troso = new item_rider_armor("super_1troso",item_rider_driver.class,ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.CHEST, rider_circuit).setMaxStackSize(1).setCreativeTab(Tabs.tabsuper_1);
	public static Item super_1legs = new item_rider_armor("super_1legs",item_rider_driver.class,ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.LEGS, rider_circuit).setMaxStackSize(1).setCreativeTab(Tabs.tabsuper_1);

	public static Item cyclode = new item_rider_driver("cyclode",ArmorMaterial.DIAMOND, 4,"super1", (Item_form_change) cyclode_core, super_1head, super_1troso, super_1legs, rider_circuit).setMaxStackSize(1).setCreativeTab(Tabs.tabsuper_1);


	//ZX
	public static Item zx_belt_core = new Item_form_change("zx_belt_core",item_rider_driver.class,0,"",""
			,new PotionEffect(MobEffects.STRENGTH,20, 1,true,false),new PotionEffect(MobEffects.FIRE_RESISTANCE,20, 1,true,false),
			new PotionEffect(MobEffects.JUMP_BOOST,20, 1,true,false),new PotionEffect(MobEffects.SPEED,20, 2,true,false),
			new PotionEffect(PotionCore.PUNCH_BOOST_POTION, 5, 4,true,false)).setCreativeTab(Tabs.tabzx);
			
	public static Item zx_head = new item_rider_armor("zx_head",item_rider_driver.class,ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.HEAD, rider_circuit).setMaxStackSize(1).setCreativeTab(Tabs.tabzx);
	public static Item zx_troso = new item_rider_armor("zx_troso",item_rider_driver.class,ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.CHEST, rider_circuit).setMaxStackSize(1).setCreativeTab(Tabs.tabzx);
	public static Item zx_legs = new item_rider_armor("zx_legs",item_rider_driver.class,ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.LEGS, rider_circuit).setMaxStackSize(1).setCreativeTab(Tabs.tabzx);

	public static Item zx_belt = new item_rider_driver("zx_belt",ArmorMaterial.DIAMOND, 4,"zx", (Item_form_change) zx_belt_core, zx_head, zx_troso, zx_legs, rider_circuit).setMaxStackSize(1).setCreativeTab(Tabs.tabzx);
	public static Item susanoo_belt = new item_rider_driver("susanoo_belt",ArmorMaterial.DIAMOND, 4,"susanoo", (Item_form_change) zx_belt_core, zx_head, zx_troso, zx_legs, rider_circuit).setMaxStackSize(1).setCreativeTab(Tabs.tabzx);
	public static Item tsukuyomi_belt = new item_rider_driver("tsukuyomi_belt",ArmorMaterial.DIAMOND, 4,"tsukuyomi", (Item_form_change) zx_belt_core, zx_head, zx_troso, zx_legs, rider_circuit).setMaxStackSize(1).setCreativeTab(Tabs.tabzx);
	public static Item amaterasu_belt = new item_rider_driver("amaterasu_belt",ArmorMaterial.DIAMOND, 4,"amaterasu", (Item_form_change) zx_belt_core, zx_head, zx_troso, zx_legs, rider_circuit).setMaxStackSize(1).setCreativeTab(Tabs.tabzx);


	//Black
	public static Item satan_sabre = new ItemBaseSword("satan_sabre",ToolMaterial.DIAMOND, rider_circuit).setMaxStackSize(1).setCreativeTab(Tabs.tabblack);
	public static Item shadow_saber_short = new ItemBaseSword("shadow_saber_short",ToolMaterial.DIAMOND, rider_circuit).setMaxStackSize(1).setCreativeTab(Tabs.tabblack);
	
	public static Item king_stone_core = new Item_form_change("king_stone_core",item_rider_driver.class,0,"",""
			,new PotionEffect(MobEffects.STRENGTH, 20, 1,true,false),new PotionEffect(MobEffects.HASTE,20, 1,true,false)
			,new PotionEffect(PotionCore.PUNCH_BOOST_POTION, 20, 4,true,false)
			).setCreativeTab(Tabs.tabblack);

	public static Item black_head = new item_rider_armor("black_head",item_rider_driver.class,ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.HEAD, rider_circuit).setMaxStackSize(1).setCreativeTab(Tabs.tabblack);
	public static Item black_troso = new item_rider_armor("black_troso",item_rider_driver.class,ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.CHEST, rider_circuit).setMaxStackSize(1).setCreativeTab(Tabs.tabblack);
	public static Item black_legs = new item_rider_armor("black_legs",item_rider_driver.class,ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.LEGS, rider_circuit).setMaxStackSize(1).setCreativeTab(Tabs.tabblack);

	public static Item king_stone = new item_rider_driver("king_stone",ArmorMaterial.DIAMOND, 4,"black", (Item_form_change) king_stone_core, black_head, black_troso, black_legs, rider_circuit).setMaxStackSize(1).setCreativeTab(Tabs.tabblack);
	public static Item king_stone_green = new item_rider_driver("king_stone_green",ArmorMaterial.DIAMOND, 4,"black_green", (Item_form_change)king_stone_core, black_head, black_troso, black_legs, rider_circuit).setMaxStackSize(1).setCreativeTab(Tabs.tabblack);
	public static Item king_stone_shadow_moon = new item_rider_driver("king_stone_shadow_moon",ArmorMaterial.DIAMOND, 4,"shadow_moon", (Item_form_change) king_stone_core, black_head, black_troso, black_legs, rider_circuit).setMaxStackSize(1).setCreativeTab(Tabs.tabblack);
	public static Item king_stone_red_shadow_moon = new item_rider_driver("king_stone_red_shadow_moon",ArmorMaterial.DIAMOND, 4,"red_shadow_moon", (Item_form_change)king_stone_core, black_head, black_troso, black_legs, rider_circuit).setMaxStackSize(1).setCreativeTab(Tabs.tabblack);

	//Black RX
	public static Item revolcane = new ItemBaseSword("revolcane",ToolMaterial.DIAMOND, rider_circuit).setMaxStackSize(1).setCreativeTab(Tabs.tabblack_rx);
	public static Item vortech_shooter = new Item_gun("vortech_shooter",Tabs.den_dengu, rider_circuit).setCreativeTab(Tabs.tabblack_rx);
	public static Item bio_blade = new ItemBaseSword("bio_blade",ToolMaterial.DIAMOND, rider_circuit).setMaxStackSize(1).setCreativeTab(Tabs.tabblack_rx);


	public static Item rx_rider = new Item_form_change("rx_rider",item_rider_driver.class,0,"","black_rx"
			,new PotionEffect(MobEffects.STRENGTH, 20, 1,true,false),new PotionEffect(MobEffects.SPEED,20, 1,true,false),
			new PotionEffect(MobEffects.JUMP_BOOST,20, 2,true,false),new PotionEffect(PotionCore.PUNCH_BOOST_POTION, 20, 4,true,false)
			).setCreativeTab(Tabs.tabblack_rx);

	public static Item robo_rider = new Item_form_change("robo_rider",item_rider_driver.class,1,"_robo_rider","black_rx"
			,new PotionEffect(MobEffects.STRENGTH, 20, 1,true,false),new PotionEffect(MobEffects.NIGHT_VISION,20, 1,true,false),
			new PotionEffect(MobEffects.RESISTANCE,20, 2,true,false)).setCreativeTab(Tabs.tabblack_rx);
	
	public static Item bio_rider = new Item_form_change("bio_rider",item_rider_driver.class,2,"_bio_rider","black_rx"
			,new PotionEffect(MobEffects.STRENGTH, 20, 1,true,false),new PotionEffect(MobEffects.NIGHT_VISION,20, 1,true,false),
			new PotionEffect(MobEffects.JUMP_BOOST,20, 2,true,false)).setCreativeTab(Tabs.tabblack_rx);

	public static Item black_rx_head = new item_rider_armor("black_rx_head",item_rider_driver.class,ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.HEAD, rider_circuit).setMaxStackSize(1).setCreativeTab(Tabs.tabblack_rx);
	public static Item black_rx_troso = new item_rider_armor("black_rx_troso",item_rider_driver.class,ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.CHEST, rider_circuit).setMaxStackSize(1).setCreativeTab(Tabs.tabblack_rx);
	public static Item black_rx_legs = new item_rider_armor("black_rx_legs",item_rider_driver.class,ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.LEGS, rider_circuit).setMaxStackSize(1).setCreativeTab(Tabs.tabblack_rx);

	public static Item sunriser = new item_rider_driver("sunriser",ArmorMaterial.DIAMOND, 4,"black_rx", (Item_form_change) rx_rider, black_rx_head, black_rx_troso, black_rx_legs, rider_circuit).setMaxStackSize(1).setCreativeTab(Tabs.tabblack_rx);
	public static Item moonriser = new item_rider_driver("moonriser",ArmorMaterial.DIAMOND, 4,"white_rx", (Item_form_change) rx_rider, black_rx_head, black_rx_troso, black_rx_legs, rider_circuit).setMaxStackSize(1).setCreativeTab(Tabs.tabblack_rx);

	public static Item king_stone_split = new Item_ore("king_stone_split").setCreativeTab(Tabs.tabblack_rx);

	public static Item acro_batter = new item_bikes("acro_batter",EntityAcrobatter::new).setMaxStackSize(1).setCreativeTab(Tabs.tabblack_rx);
	public static Item ridoron = new item_bikes("ridoron",Entity_ridoron::new).setMaxStackSize(1).setCreativeTab(Tabs.tabblack_rx);

	//shin

	public static Item shin_stone = new Item_form_change("shin_stone",item_rider_driver.class,0,"",""
			,new PotionEffect(MobEffects.STRENGTH, 20, 1,true,false),new PotionEffect(MobEffects.SPEED,20, 1,true,false),
	new PotionEffect(MobEffects.JUMP_BOOST,20, 2,true,false),new PotionEffect(PotionCore.PUNCH_BOOST_POTION, 5, 4,true,false)).keep_item().setCreativeTab(Tabs.tabshin);


	public static Item shinhead = new item_rider_armor("shinhead",item_rider_driver.class,ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.HEAD, rider_circuit).setMaxStackSize(1).setCreativeTab(Tabs.tabshin);
	public static Item shintroso = new item_rider_armor("shintroso",item_rider_driver.class,ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.CHEST, rider_circuit).setMaxStackSize(1).setCreativeTab(Tabs.tabshin);
	public static Item shinlegs = new item_rider_armor("shinlegs",item_rider_driver.class,ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.LEGS, rider_circuit).setMaxStackSize(1).setCreativeTab(Tabs.tabshin);

	public static Item grasshopper_dna = new item_rider_driver("grasshopper_dna",ArmorMaterial.DIAMOND, 4,"shin", (Item_form_change) shin_stone, shinhead, shintroso, shinlegs, rider_circuit).belt(true).setMaxStackSize(1).setCreativeTab(Tabs.tabshin);


	//ZO

	public static Item zo_stone = new Item_form_change("zo_stone",item_rider_driver.class,0,"",""
			,new PotionEffect(MobEffects.STRENGTH, 20, 1,true,false),new PotionEffect(MobEffects.SPEED,20, 1,true,false),new PotionEffect(MobEffects.JUMP_BOOST,20, 2,true,false)
			,new PotionEffect(PotionCore.PUNCH_BOOST_POTION, 5, 4,true,false)).keep_item().setCreativeTab(Tabs.tabzo);


	public static Item zohead = new item_rider_armor("zohead",item_rider_driver.class,ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.HEAD, rider_circuit).setMaxStackSize(1).setCreativeTab(Tabs.tabzo);
	public static Item zotroso = new item_rider_armor("zotroso",item_rider_driver.class,ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.CHEST, rider_circuit).setMaxStackSize(1).setCreativeTab(Tabs.tabzo);
	public static Item zolegs = new item_rider_armor("zolegs",item_rider_driver.class,ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.LEGS, rider_circuit).setMaxStackSize(1).setCreativeTab(Tabs.tabzo);

	public static Item zo_core = new item_rider_driver("zo_core",ArmorMaterial.DIAMOND, 4,"zo", (Item_form_change) zo_stone, zohead, zotroso, zolegs, rider_circuit).belt(true).setMaxStackSize(1).setCreativeTab(Tabs.tabzo);

	//J

	public static Item j_stone = new Item_form_change("j_stone",item_rider_driver.class,0,"",""
			,new PotionEffect(MobEffects.STRENGTH, 20, 1,true,false),new PotionEffect(MobEffects.SPEED,20, 1,true,false),new PotionEffect(MobEffects.JUMP_BOOST,20, 2,true,false)
			,new PotionEffect(PotionCore.PUNCH_BOOST_POTION, 5, 4,true,false),new PotionEffect(PotionCore.BIG_POTION, 5, 4,true,false)).keep_item().setCreativeTab(Tabs.tabj);

	public static Item jhead = new item_rider_armor("jhead",item_rider_driver.class,ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.HEAD, rider_circuit).setMaxStackSize(1).setCreativeTab(Tabs.tabj);
	public static Item jtroso = new item_rider_armor("jtroso",item_rider_driver.class,ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.CHEST, rider_circuit).setMaxStackSize(1).setCreativeTab(Tabs.tabj);
	public static Item jlegs = new item_rider_armor("jlegs",item_rider_driver.class,ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.LEGS, rider_circuit).setMaxStackSize(1).setCreativeTab(Tabs.tabj);

	public static Item j_spirit = new item_rider_driver("j_spirit",ArmorMaterial.DIAMOND, 4,"j", (Item_form_change) j_stone, jhead, jtroso, jlegs, rider_circuit).belt(true).setMaxStackSize(1).setCreativeTab(Tabs.tabj);

	//Amazons
	
	public static Block amazon_cell_extractor = new amazon_cell_extractor("amazon_cell_extractor",Material.ROCK, 2).setCreativeTab(Tabs.tabamazons);
	public static Block amazon_cell_mutator = new amazon_cell_mutator("amazon_cell_mutator",Material.ROCK, 2).setCreativeTab(Tabs.tabamazons);

	public static Item amazonshead = new item_rider_armor("amazonshead",item_amazonsdriver.class,ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.HEAD, rider_circuit).setMaxStackSize(1).setCreativeTab(Tabs.tabamazons);
	public static Item amazonstroso = new item_rider_armor("amazonstroso",item_amazonsdriver.class,ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.CHEST, rider_circuit).setMaxStackSize(1).setCreativeTab(Tabs.tabamazons);
	public static Item amazonslegs = new item_rider_armor("amazonslegs",item_amazonsdriver.class,ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.LEGS, rider_circuit).setMaxStackSize(1).setCreativeTab(Tabs.tabamazons);


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
	public static Item amazon_injector_neo_alpha = new Item_ore("amazon_injector_neo_alpha").setCreativeTab(Tabs.tabamazons);
	
	public static Item empty_vial = new Item_ore("empty_vial").setCreativeTab(Tabs.tabmisc);
	public static Item amazon_cell_vial = new Item_ore("amazon_cell_vial").keep_item(empty_vial).setCreativeTab(Tabs.tabamazons);
	
	public static Item omega_amazon_cell_vial = new Item_ore("omega_amazon_cell_vial").keep_item(empty_vial).setCreativeTab(Tabs.tabamazons);
	public static Item alpha_amazon_cell_vial = new Item_ore("alpha_amazon_cell_vial").keep_item(empty_vial).setCreativeTab(Tabs.tabamazons);
	public static Item sigma_amazon_cell_vial = new Item_ore("sigma_amazon_cell_vial").keep_item(empty_vial).setCreativeTab(Tabs.tabamazons);
	public static Item neo_amazon_cell_vial = new Item_ore("neo_amazon_cell_vial").keep_item(empty_vial).setCreativeTab(Tabs.tabamazons);
	
	
	//Black Sun

	public static Block kaijin_stone_generator = new kaijin_stone_generator_block("kaijin_stone_generator",Material.ROCK, 2).setCreativeTab(Tabs.tabblack_sun);
	
	public static Item century_king_black_blade = new ItemBaseSword("century_king_black_blade",ToolMaterial.DIAMOND, rider_circuit).setMaxStackSize(1).setCreativeTab(Tabs.tabblack_sun);
	public static Item century_king_shadow_blade = new ItemBaseSword("century_king_shadow_blade",ToolMaterial.DIAMOND, rider_circuit).setMaxStackSize(1).setCreativeTab(Tabs.tabblack_sun);
	public static Item satansabre = new ItemBaseSword("satansabre",ToolMaterial.DIAMOND, rider_circuit).setMaxStackSize(1).setCreativeTab(Tabs.tabblack_sun);

	
	public static Item  glowing_king_stone_sun = new Item_form_change("glowing_king_stone_sun",item_rider_driver.class,0,"_revived","black_sun"
			,new PotionEffect(MobEffects.STRENGTH, 20, 2,true,false),new PotionEffect(MobEffects.HASTE,20, 1,true,false)
			,new PotionEffect(MobEffects.JUMP_BOOST,20, 3,true,false),new PotionEffect(PotionCore.PUNCH_BOOST_POTION, 20, 4,true,false)
			);

	public static Item  king_stone_sun = new Item_zecter(glowing_king_stone_sun,"king_stone_sun",item_rider_driver.class,0,"","black_sun"
			,new PotionEffect(MobEffects.STRENGTH, 20, 2,true,false),new PotionEffect(MobEffects.HASTE,20, 1,true,false)
			,new PotionEffect(MobEffects.JUMP_BOOST,20, 3,true,false),new PotionEffect(PotionCore.PUNCH_BOOST_POTION, 20, 4,true,false)
			).setCreativeTab(Tabs.tabblack_sun);

	public static Item  glowing_king_stone_moon = new Item_form_change("glowing_king_stone_moon",item_rider_driver.class,0,"_revived","shadowmoon"
			,new PotionEffect(MobEffects.STRENGTH, 20, 2,true,false),new PotionEffect(MobEffects.HASTE,20, 1,true,false)
			,new PotionEffect(MobEffects.JUMP_BOOST,20, 3,true,false),new PotionEffect(PotionCore.PUNCH_BOOST_POTION, 20, 4,true,false)
			);
	
	public static Item  king_stone_moon = new Item_zecter(glowing_king_stone_moon,"king_stone_moon",item_rider_driver.class,0,"","shadowmoon"
			,new PotionEffect(MobEffects.STRENGTH, 20, 2,true,false),new PotionEffect(MobEffects.HASTE,20, 1,true,false)
			,new PotionEffect(MobEffects.JUMP_BOOST,20, 3,true,false),new PotionEffect(PotionCore.PUNCH_BOOST_POTION, 20, 4,true,false)
			).setCreativeTab(Tabs.tabblack_sun);

	
	public static Item black_sun_head = new item_rider_armor("black_sun_head",item_rider_driver.class,ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.HEAD, rider_circuit).setMaxStackSize(1).setCreativeTab(Tabs.tabblack_sun);
	public static Item black_sun_troso = new item_rider_armor("black_sun_troso",item_rider_driver.class,ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.CHEST, rider_circuit).setMaxStackSize(1).setCreativeTab(Tabs.tabblack_sun);
	public static Item black_sun_legs = new item_rider_armor("black_sun_legs",item_rider_driver.class,ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.LEGS, rider_circuit).setMaxStackSize(1).setCreativeTab(Tabs.tabblack_sun);

	public static Item century_king_sun_driver = new item_rider_driver("century_king_sun_driver",ArmorMaterial.DIAMOND, 4,"black_sun", (Item_form_change) king_stone_sun, black_sun_head, black_sun_troso, black_sun_legs, rider_circuit).setMaxStackSize(1).setCreativeTab(Tabs.tabblack_sun);

	public static Item century_king_moon_driver = new item_rider_driver("century_king_moon_driver",ArmorMaterial.DIAMOND, 4,"shadowmoon", (Item_form_change) king_stone_moon, black_sun_head, black_sun_troso, black_sun_legs, rider_circuit).setMaxStackSize(1).setCreativeTab(Tabs.tabblack_sun);

	
	public static Item kaijin_stone = new Item_ore("kaijin_stone").setCreativeTab(Tabs.tabblack_sun);
	public static Item creation_king_extract_vial = new Item_ore("creation_king_extract_vial").keep_item(empty_vial).setCreativeTab(Tabs.tabblack_sun);
	
	public static Item heat_heaven = new riderfood(4, true,"heat_heaven").setCreativeTab(Tabs.tabblack_sun);
	
	
	//G
	public static Item goro_wine_bottle = new Item_form_change("goro_wine_bottle",item_rider_driver.class,0,"",""
			,new PotionEffect(MobEffects.STRENGTH, 20, 1,true,false),new PotionEffect(MobEffects.SPEED,20, 1,true,false),
			new PotionEffect(MobEffects.JUMP_BOOST,20, 2,true,false),new PotionEffect(PotionCore.PUNCH_BOOST_POTION, 20, 4,true,false)
			).keep_item().setCreativeTab(Tabs.tabG);


	public static Item ghead = new item_rider_armor("ghead",item_rider_driver.class,ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.HEAD, rider_circuit).setMaxStackSize(1).setCreativeTab(Tabs.tabG);
	public static Item gtroso = new item_rider_armor("gtroso",item_rider_driver.class,ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.CHEST, rider_circuit).setMaxStackSize(1).setCreativeTab(Tabs.tabG);
	public static Item glegs = new item_rider_armor("glegs",item_rider_driver.class,ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.LEGS, rider_circuit).setMaxStackSize(1).setCreativeTab(Tabs.tabG);

	public static Item g_belt = new item_rider_driver("g_belt",ArmorMaterial.DIAMOND, 4,"kamen_rider_g", (Item_form_change) goro_wine_bottle, ghead, gtroso, glegs, rider_circuit).setMaxStackSize(1).setCreativeTab(Tabs.tabG);


	//GoRider
	public static Item akarider_card = new Item_form_change("akarider_card",item_rider_driver.class,0,"",""
			,new PotionEffect(MobEffects.STRENGTH, 20, 1,true,false),new PotionEffect(MobEffects.SPEED,20, 1,true,false),
			new PotionEffect(MobEffects.JUMP_BOOST,20, 2,true,false),new PotionEffect(PotionCore.PUNCH_BOOST_POTION, 20, 4,true,false)
			).setCreativeTab(Tabs.tabGoRider);

	public static Item aorider_card = new Item_form_change("aorider_card",item_rider_driver.class,0,"",""
			,new PotionEffect(MobEffects.STRENGTH, 20, 1,true,false),new PotionEffect(MobEffects.SPEED,20, 1,true,false),
			new PotionEffect(MobEffects.JUMP_BOOST,20, 2,true,false),new PotionEffect(PotionCore.PUNCH_BOOST_POTION, 20, 4,true,false)
			).setCreativeTab(Tabs.tabGoRider);

	public static Item kirider_card = new Item_form_change("kirider_card",item_rider_driver.class,0,"",""
			,new PotionEffect(MobEffects.STRENGTH, 20, 1,true,false),new PotionEffect(MobEffects.SPEED,20, 1,true,false),
			new PotionEffect(MobEffects.JUMP_BOOST,20, 2,true,false),new PotionEffect(PotionCore.PUNCH_BOOST_POTION, 20, 4,true,false)
			).setCreativeTab(Tabs.tabGoRider);

	public static Item momorider_card = new Item_form_change("momorider_card",item_rider_driver.class,0,"",""
			,new PotionEffect(MobEffects.STRENGTH, 20, 1,true,false),new PotionEffect(MobEffects.SPEED,20, 1,true,false),
			new PotionEffect(MobEffects.JUMP_BOOST,20, 2,true,false),new PotionEffect(PotionCore.PUNCH_BOOST_POTION, 20, 4,true,false)
			).setCreativeTab(Tabs.tabGoRider);

	public static Item midorider_card = new Item_form_change("midorider_card",item_rider_driver.class,0,"",""
			,new PotionEffect(MobEffects.STRENGTH, 20, 1,true,false),new PotionEffect(MobEffects.SPEED,20, 1,true,false),
			new PotionEffect(MobEffects.JUMP_BOOST,20, 2,true,false),new PotionEffect(PotionCore.PUNCH_BOOST_POTION, 20, 4,true,false)
			).setCreativeTab(Tabs.tabGoRider);

	
	public static Item akariderhead = new item_rider_armor("akariderhead",item_rider_driver.class,ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.HEAD, rider_circuit).setMaxStackSize(1).setCreativeTab(Tabs.tabGoRider);
	public static Item akaridertroso = new item_rider_armor("akaridertroso",item_rider_driver.class,ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.CHEST, rider_circuit).setMaxStackSize(1).setCreativeTab(Tabs.tabGoRider);
	public static Item akariderlegs = new item_rider_armor("akariderlegs",item_rider_driver.class,ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.LEGS, rider_circuit).setMaxStackSize(1).setCreativeTab(Tabs.tabGoRider);

	public static Item typhoon_akarider = new item_rider_driver("typhoon_akarider",ArmorMaterial.DIAMOND, 4,"akarider",(Item_form_change) akarider_card, akariderhead, gtroso, akariderlegs, rider_circuit).setMaxStackSize(1).setCreativeTab(Tabs.tabGoRider);
	public static Item typhoon_aorider = new item_rider_driver("typhoon_aorider",ArmorMaterial.DIAMOND, 4,"aorider",(Item_form_change) aorider_card, akariderhead, gtroso, akariderlegs, rider_circuit).setMaxStackSize(1).setCreativeTab(Tabs.tabGoRider);
	public static Item typhoon_kirider = new item_rider_driver("typhoon_kirider",ArmorMaterial.DIAMOND, 4,"kirider",(Item_form_change) kirider_card, akariderhead, gtroso, akariderlegs, rider_circuit).setMaxStackSize(1).setCreativeTab(Tabs.tabGoRider);
	public static Item typhoon_momorider = new item_rider_driver("typhoon_momorider",ArmorMaterial.DIAMOND, 4,"momorider",(Item_form_change) momorider_card, akariderhead, gtroso, akariderlegs, rider_circuit).setMaxStackSize(1).setCreativeTab(Tabs.tabGoRider);
	public static Item typhoon_midorider = new item_rider_driver("typhoon_midorider",ArmorMaterial.DIAMOND, 4,"midorider",(Item_form_change) midorider_card, akariderhead, gtroso, akariderlegs, rider_circuit).setMaxStackSize(1).setCreativeTab(Tabs.tabGoRider);


	public static void init() {
	}
}



