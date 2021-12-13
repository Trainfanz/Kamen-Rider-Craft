package Kamen_Rider_Craft_4TH;

import Kamen_Rider_Craft_4TH.item.ItemBaseSword;
import Kamen_Rider_Craft_4TH.item.Item_gun;
import Kamen_Rider_Craft_4TH.item.Item_ore;
import Kamen_Rider_Craft_4TH.item.Item_sword_gun;
import Kamen_Rider_Craft_4TH.item.Ichigo.item_Ichigoarmor;
import Kamen_Rider_Craft_4TH.item.Ichigo.item_Ichigoarmor2;
import Kamen_Rider_Craft_4TH.item.revice.Item_Vistamps;
import Kamen_Rider_Craft_4TH.item.revice.item_revicearmor;
import Kamen_Rider_Craft_4TH.item.revice.item_revicearmor2;
import Kamen_Rider_Craft_4TH.item.revice.item_revicedriver;
import Kamen_Rider_Craft_4TH.item.rider_armor_base.Item_form_change;
import Kamen_Rider_Craft_4TH.item.rider_armor_base.item_rider_armor;
import Kamen_Rider_Craft_4TH.item.rider_armor_base.item_rider_armor2;
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
import Kamen_Rider_Craft_4TH.potion.PotionCore;
import net.minecraft.init.MobEffects;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.potion.PotionEffect;

public class ReiwaRiderItems {
	//Zero-one
	public static Item hiden_metal = new Item_ore("hiden_metal").setCreativeTab(Tabs.tabzero_one);
	public static Item realize_hopper_lines = new Item_ore("realize_hopper_lines");

	public static Item attache_calibur = new ItemBaseSword("attache_calibur",Tabs.gashacon_breaker, hiden_metal).setMaxStackSize(1).setCreativeTab(Tabs.tabzero_one);
	public static Item attache_shotgun = new Item_gun("attache_shotgun",Tabs.den_dengu, hiden_metal).setMaxStackSize(1).setCreativeTab(Tabs.tabzero_one);
	public static Item attache_arrow = new Item_gun("attache_arrow",Tabs.den_dengu, hiden_metal).setMaxStackSize(1).setCreativeTab(Tabs.tabzero_one);
	public static Item authorise_buster = new Item_sword_gun("authorise_buster",Tabs.parabragun_axe, hiden_metal).setMaxStackSize(1).setCreativeTab(Tabs.tabzero_one);
	public static Item progrise_hopper_blade = new ItemBaseSword("progrise_hopper_blade",Tabs.dj_gun, hiden_metal).setMaxStackSize(1).setCreativeTab(Tabs.tabzero_one);
	public static Item progrise_hopper_blade_naginata = new ItemBaseSword("progrise_hopper_blade_naginata",Tabs.dj_gun_taiken_mode, hiden_metal).setMaxStackSize(1).setCreativeTab(Tabs.tabzero_one);
	public static Item thousand_jacker = new ItemBaseSword("thousand_jacker",Tabs.souginjou, hiden_metal).setMaxStackSize(1).setCreativeTab(Tabs.tabzero_one);

	public static Item zero_onehead = new item_zero_onearmor("zero_onehead",ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.HEAD).setMaxStackSize(1).setCreativeTab(Tabs.tabzero_one);
	public static Item zero_onetroso = new item_zero_onearmor2("zero_onetroso",ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.CHEST).setMaxStackSize(1).setCreativeTab(Tabs.tabzero_one);
	public static Item zero_onelegs = new item_zero_onearmor2("zero_onelegs",ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.LEGS).setMaxStackSize(1).setCreativeTab(Tabs.tabzero_one);

	public static Item hiden_zero_one_driver = new item_zero_onedriver("hiden_zero_one_driver",ArmorMaterial.DIAMOND, 4, "zero_one",19).setMaxStackSize(1).setCreativeTab(Tabs.tabzero_one);
	public static Item zaia_thousandriver = new item_zero_onedriver("zaia_thousandriver",ArmorMaterial.DIAMOND, 4, "thouser",21).setMaxStackSize(1).setCreativeTab(Tabs.tabzero_one);
	public static Item zaia_thousandriver_zaia = new item_zero_onedriver("zaia_thousandriver_zaia",ArmorMaterial.DIAMOND, 4, "zaia",21).setMaxStackSize(1).setCreativeTab(Tabs.tabzero_one);

	public static Item shot_riser_vulcan = new item_zero_onedriver("shot_riser_vulcan",ArmorMaterial.DIAMOND, 4, "vulcan",3).setMaxStackSize(1).setCreativeTab(Tabs.tabzero_one);
	public static Item shot_riser_valkyrie = new item_zero_onedriver("shot_riser_valkyrie",ArmorMaterial.DIAMOND, 4, "valkyrie",7).setMaxStackSize(1).setCreativeTab(Tabs.tabzero_one);

	public static Item forceriser_jin = new item_zero_onedriver("forceriser_jin",ArmorMaterial.DIAMOND, 4, "jin",1).setMaxStackSize(1).setCreativeTab(Tabs.tabzero_one);
	public static Item forceriser_horobi = new item_zero_onedriver("forceriser_horobi",ArmorMaterial.DIAMOND, 4, "horobi",10).setMaxStackSize(1).setCreativeTab(Tabs.tabzero_one);
	public static Item forceriser_ikazuchi = new item_zero_onedriver("forceriser_ikazuchi",ArmorMaterial.DIAMOND, 4, "ikazuchi",20).setMaxStackSize(1).setCreativeTab(Tabs.tabzero_one);
	public static Item forceriser_naki = new item_zero_onedriver("forceriser_naki",ArmorMaterial.DIAMOND, 4, "naki",3).setMaxStackSize(1).setCreativeTab(Tabs.tabzero_one);
	public static Item forceriser_001 = new item_zero_onedriver("forceriser_001",ArmorMaterial.DIAMOND, 4, "zero_zero_one",19).setMaxStackSize(1).setCreativeTab(Tabs.tabzero_one);

	public static Item zetsumetsu_driver = new item_zero_onedriver("zetsumetsu_driver",ArmorMaterial.DIAMOND, 4, "horobi_ark",10).setMaxStackSize(1).setCreativeTab(Tabs.tabzero_one);
	public static Item metsuboujinrai_driver = new item_zero_onedriver("metsuboujinrai_driver",ArmorMaterial.DIAMOND, 4, "metsuboujinrai",10).setMaxStackSize(1).setCreativeTab(Tabs.tabzero_one);

	public static Item cycloneriser_ichigata = new item_zero_onedriver("cycloneriser_ichigata",ArmorMaterial.DIAMOND, 4, "ichigata",19).setMaxStackSize(1).setCreativeTab(Tabs.tabzero_one);

	public static Item zaia_slashriser_jin = new item_zero_onedriver("zaia_slashriser_jin",ArmorMaterial.DIAMOND, 4, "jin_burning",1).setMaxStackSize(1).setCreativeTab(Tabs.tabzero_one);

	public static Item ark_driver_zero = new item_zero_onedriver("ark_driver_zero",ArmorMaterial.DIAMOND, 4, "ark_zero",19).setMaxStackSize(1).setCreativeTab(Tabs.tabzero_one);

	public static Item hiden_zero_one_driver_azu = new item_zero_onedriver("hiden_zero_one_driver_azu",ArmorMaterial.DIAMOND, 4, "azu_zero_one",19).setMaxStackSize(1).setCreativeTab(Tabs.tabzero_one);

	public static Item eden_driver = new item_zero_onedriver("eden_driver",ArmorMaterial.DIAMOND, 4, "eden",19).setMaxStackSize(1).setCreativeTab(Tabs.tabzero_one);
	public static Item lucifer_driver = new item_zero_onedriver("lucifer_driver",ArmorMaterial.DIAMOND, 4, "lucifer",19).setMaxStackSize(1).setCreativeTab(Tabs.tabzero_one);

	public static Item slash_abaddo_riser_r = new item_zero_onedriver("slash_abaddo_riser_r",ArmorMaterial.DIAMOND, 4, "abaddon_r",19).setMaxStackSize(1).setCreativeTab(Tabs.tabzero_one);
	public static Item shot_abaddo_riser_g = new item_zero_onedriver("shot_abaddo_riser_g",ArmorMaterial.DIAMOND, 4, "abaddon_g",19).setMaxStackSize(1).setCreativeTab(Tabs.tabzero_one);
	public static Item shot_abaddo_riser_b = new item_zero_onedriver("shot_abaddo_riser_b",ArmorMaterial.DIAMOND, 4, "abaddon_b",19).setMaxStackSize(1).setCreativeTab(Tabs.tabzero_one);
	public static Item slash_abaddo_riser_o = new item_zero_onedriver("slash_abaddo_riser_o",ArmorMaterial.DIAMOND, 4, "abaddon_o",19).setMaxStackSize(1).setCreativeTab(Tabs.tabzero_one);
	public static Item shot_abaddo_riser = new item_zero_onedriver("shot_abaddo_riser",ArmorMaterial.DIAMOND, 4, "abaddon",19).setMaxStackSize(1).setCreativeTab(Tabs.tabzero_one);
	public static Item slash_abaddo_riser = new item_zero_onedriver("slash_abaddo_riser",ArmorMaterial.DIAMOND, 4, "abaddon",19).setMaxStackSize(1).setCreativeTab(Tabs.tabzero_one);

	public static Item hiden_zero_one_driver_vulcan = new item_zero_onedriver("hiden_zero_one_driver_vulcan",ArmorMaterial.DIAMOND, 4, "vulcan_lone",3).setMaxStackSize(1).setCreativeTab(Tabs.tabzero_one);

	public static Item zetsumeriser_berothra = new item_zero_onedriver("zetsumeriser_berothra",ArmorMaterial.DIAMOND, 4, "magia_berothra",0).setMaxStackSize(1).setCreativeTab(Tabs.tabzero_one);
	public static Item zetsumeriser_kuehne = new item_zero_onedriver("zetsumeriser_kuehne",ArmorMaterial.DIAMOND, 4, "magia_kuehne",0).setMaxStackSize(1).setCreativeTab(Tabs.tabzero_one);
	public static Item zetsumeriser_ekal = new item_zero_onedriver("zetsumeriser_ekal",ArmorMaterial.DIAMOND, 4, "magia_ekal",0).setMaxStackSize(1).setCreativeTab(Tabs.tabzero_one);
	public static Item zetsumeriser_neohi = new item_zero_onedriver("zetsumeriser_neohi",ArmorMaterial.DIAMOND, 4, "magia_neohi",0).setMaxStackSize(1).setCreativeTab(Tabs.tabzero_one);
	public static Item zetsumeriser_onycho = new item_zero_onedriver("zetsumeriser_onycho",ArmorMaterial.DIAMOND, 4, "magia_onycho",0).setMaxStackSize(1).setCreativeTab(Tabs.tabzero_one);
	public static Item zetsumeriser_vicarya = new item_zero_onedriver("zetsumeriser_vicarya",ArmorMaterial.DIAMOND, 4, "magia_vicarya",0).setMaxStackSize(1).setCreativeTab(Tabs.tabzero_one);
	public static Item zetsumeriser_gaeru = new item_zero_onedriver("zetsumeriser_gaeru",ArmorMaterial.DIAMOND, 4, "magia_gaeru",0).setMaxStackSize(1).setCreativeTab(Tabs.tabzero_one);
	public static Item zetsumeriser_mammoth = new item_zero_onedriver("zetsumeriser_mammoth",ArmorMaterial.DIAMOND, 4, "magia_mammoth",0).setMaxStackSize(1).setCreativeTab(Tabs.tabzero_one);

	public static Item zetsumeriser_dodo = new item_zero_onedriver("zetsumeriser_dodo",ArmorMaterial.DIAMOND, 4, "magia_dodo",0).setMaxStackSize(1).setCreativeTab(Tabs.tabzero_one);
	public static Item zetsumeriser_dodo_custom = new item_zero_onedriver("zetsumeriser_dodo_custom",ArmorMaterial.DIAMOND, 4, "magia_dodo_custom",0).setMaxStackSize(1).setCreativeTab(Tabs.tabzero_one);
	public static Item zetsumeriser_dodo_custom_v2 = new item_zero_onedriver("zetsumeriser_dodo_custom_v2",ArmorMaterial.DIAMOND, 4, "magia_dodo_custom_v2",0).setMaxStackSize(1).setCreativeTab(Tabs.tabzero_one);

	public static Item zetsumeriser_arsino = new item_zero_onedriver("zetsumeriser_arsino",ArmorMaterial.DIAMOND, 4, "magia_arsino",0).setMaxStackSize(1).setCreativeTab(Tabs.tabzero_one);

	public static Item raidriser_battle = new item_zero_onedriver("raidriser_battle",ArmorMaterial.DIAMOND, 4, "raider_battle",0).setMaxStackSize(1).setCreativeTab(Tabs.tabzero_one);
	public static Item raidriser_buffalo = new item_zero_onedriver("raidriser_buffalo",ArmorMaterial.DIAMOND, 4, "raider_buffalo",0).setMaxStackSize(1).setCreativeTab(Tabs.tabzero_one);
	public static Item raidriser_whale = new item_zero_onedriver("raidriser_whale",ArmorMaterial.DIAMOND, 4, "raider_whale",0).setMaxStackSize(1).setCreativeTab(Tabs.tabzero_one);
	public static Item raidriser_lion = new item_zero_onedriver("raidriser_lion",ArmorMaterial.DIAMOND, 4, "raider_lion",0).setMaxStackSize(1).setCreativeTab(Tabs.tabzero_one);
	public static Item raidriser_penguin = new item_zero_onedriver("raidriser_penguin",ArmorMaterial.DIAMOND, 4, "raider_penguin",0).setMaxStackSize(1).setCreativeTab(Tabs.tabzero_one);
	public static Item raidriser_panda = new item_zero_onedriver("raidriser_panda",ArmorMaterial.DIAMOND, 4, "raider_panda",0).setMaxStackSize(1).setCreativeTab(Tabs.tabzero_one);
	public static Item raidriser_jackal = new item_zero_onedriver("raidriser_jackal",ArmorMaterial.DIAMOND, 4, "raider_jackal",0).setMaxStackSize(1).setCreativeTab(Tabs.tabzero_one);

	public static Item hiden_zero_two_driver = new Item_ore("hiden_zero_two_driver");
	public static Item hiden_zero_one_driver_red = new Item_ore("hiden_zero_one_driver_red");
	public static Item shot_riser_belt = new Item_ore("shot_riser_belt");
	public static Item ark_driver_one = new Item_ore("ark_driver_one");
	public static Item zaia_slashriser_belt = new Item_ore("zaia_slashriser_belt");
	public static Item abaddo_riser_belt = new Item_ore("abaddo_riser_belt");

	public static Item shot_riser_gun = new Item_gun("shot_riser_gun",Tabs.den_dengu, hiden_metal).setMaxStackSize(1).setCreativeTab(Tabs.tabzero_one);
	public static Item zaia_slashriser_sword = new ItemBaseSword("zaia_slashriser_sword",Tabs.gashacon_breaker, hiden_metal).setMaxStackSize(1).setCreativeTab(Tabs.tabzero_one);
	public static Item shot_abaddo_gun = new Item_gun("shot_abaddo_gun",Tabs.den_dengu, hiden_metal).setMaxStackSize(1).setCreativeTab(Tabs.tabzero_one);
	public static Item slash_abaddo_sword = new ItemBaseSword("slash_abaddo_sword",Tabs.gashacon_breaker, hiden_metal).setMaxStackSize(1).setCreativeTab(Tabs.tabzero_one);

	public static Item hiden_risephone = new item_risephone("hiden_risephone").setCreativeTab(Tabs.tabzero_one);

	public static Item rising_hopper_progrise_key = new Item_progrise_keys(0, 19,"rising_hopper_progrise_key").AddToHiden3DPrinter(10).AddVulcanCanUse().setCreativeTab(Tabs.tabzero_one);
	public static Item shining_hopper_progrise_key = new Item_progrise_keys(0, 19,"shining_hopper_progrise_key").AddToHiden3DPrinter(2).AddChangeBase(1).setCreativeTab(Tabs.tabzero_one);
	public static Item shining_assault_hopper_progrise_key = new Item_progrise_keys(0, 19,"shining_assault_hopper_progrise_key").AddChangeBase(2).setCreativeTab(Tabs.tabzero_one);
	public static Item metalcluster_hopper_progrise_key = new Item_progrise_keys(0, 19,"metalcluster_hopper_progrise_key").AddChangeBase(3).setCreativeTab(Tabs.tabzero_one);
	public static Item zero_two_progrise_key = new Item_progrise_keys(0, 19,"zero_two_progrise_key").AddChangeBase(4).setCreativeTab(Tabs.tabzero_one);
	public static Item red_rising_hopper_progrise_key = new Item_progrise_keys(0, 19,"red_rising_hopper_progrise_key").AddToHiden3DPrinter(1).AddChangeBase(7).setCreativeTab(Tabs.tabzero_one);
	public static Item realize_rising_hopper_progrise_key = new Item_progrise_keys(0, 19,"realize_rising_hopper_progrise_key").AddChangeBase(9).setCreativeTab(Tabs.tabzero_one);
	public static Item hell_hopper_progrise_key = new Item_progrise_keys(0, 19,"hell_hopper_progrise_key").AddChangeBase(10).setCreativeTab(Tabs.tabzero_one);

	public static Item biting_shark_progrise_key = new Item_progrise_keys(0, 2,"biting_shark_progrise_key").AddToHiden3DPrinter(5).setCreativeTab(Tabs.tabzero_one);
	public static Item flaming_tiger_progrise_key = new Item_progrise_keys(0, 6,"flaming_tiger_progrise_key").AddToHiden3DPrinter(5).setCreativeTab(Tabs.tabzero_one);
	public static Item freezing_bear_progrise_key = new Item_progrise_keys(0, 8,"freezing_bear_progrise_key").AddToZaia3DPrinter(5).setCreativeTab(Tabs.tabzero_one);
	public static Item breaking_mammoth_progrise_key = new Item_progrise_keys(0, 23,"breaking_mammoth_progrise_key").AddToHiden3DPrinter(5).setCreativeTab(Tabs.tabzero_one);
	public static Item sparking_giraffe_progrise_key = new Item_progrise_keys(0, 11,"sparking_giraffe_progrise_key").AddToZaia3DPrinter(5).setCreativeTab(Tabs.tabzero_one);
	public static Item amazing_hercules_progrise_key = new Item_progrise_keys(0, 12,"amazing_hercules_progrise_key").AddToZaia3DPrinter(5).setCreativeTab(Tabs.tabzero_one);
	public static Item crushing_buffalo_progrise_key = new Item_progrise_keys(0, 15,"crushing_buffalo_progrise_key").setCreativeTab(Tabs.tabzero_one);
	public static Item exciting_stag_progrise_key = new Item_progrise_keys(0, 16,"exciting_stag_progrise_key").AddToZaia3DPrinter(5).setCreativeTab(Tabs.tabzero_one);
	public static Item gatling_hedgehog_progrise_key = new Item_progrise_keys(0, 13,"gatling_hedgehog_progrise_key").AddToZaia3DPrinter(5).setCreativeTab(Tabs.tabzero_one);
	public static Item trapping_spider_progrise_key = new Item_progrise_keys(0, 17,"trapping_spider_progrise_key").AddToZaia3DPrinter(5).setCreativeTab(Tabs.tabzero_one);
	public static Item storming_penguin_progrise_key = new Item_progrise_keys(0, 18,"storming_penguin_progrise_key").setCreativeTab(Tabs.tabzero_one);
	public static Item hopping_kangaroo_progrise_key = new Item_progrise_keys(0, 14,"hopping_kangaroo_progrise_key").AddToHiden3DPrinter(5).setCreativeTab(Tabs.tabzero_one);
	public static Item splashing_whale_progrise_key = new Item_progrise_keys(0, 22,"splashing_whale_progrise_key").setCreativeTab(Tabs.tabzero_one);
	public static Item dynamaiting_lion_progrise_key = new Item_progrise_keys(0, 24,"dynamaiting_lion_progrise_key").setCreativeTab(Tabs.tabzero_one);
	public static Item scouting_panda_progrise_key = new Item_progrise_keys(0, 25,"scouting_panda_progrise_key").setCreativeTab(Tabs.tabzero_one);
	public static Item invading_horseshoe_crab_progrise_key = new Item_progrise_keys(0, 27,"invading_horseshoe_crab_progrise_key").setCreativeTab(Tabs.tabzero_one);

	public static Item shooting_wolf_progrise_key = new Item_progrise_keys(1, 3,"shooting_wolf_progrise_key").AddZeroOneCanUse().setCreativeTab(Tabs.tabzero_one);
	public static Item assault_wolf_progrise_key = new Item_progrise_keys(1, 3,"assault_wolf_progrise_key").AddToZaia3DPrinter(2).AddChangeBase(2).setCreativeTab(Tabs.tabzero_one);
	public static Item rampage_gatling_progrise_key = new Item_progrise_keys(1, 3,"rampage_gatling_progrise_key").AddChangeBase(5).setCreativeTab(Tabs.tabzero_one);
	public static Item punching_kong_progrise_key = new Item_progrise_keys(1, 5,"punching_kong_progrise_key").AddToZaia3DPrinter(5).AddZeroOneCanUse().setCreativeTab(Tabs.tabzero_one);
	public static Item dire_wolf_zetsumerise_key = new Item_progrise_keys("dire_wolf_zetsumerise_key").setCreativeTab(Tabs.tabzero_one);

	public static Item rushing_cheetah_progrise_key = new Item_progrise_keys(2, 7,"rushing_cheetah_progrise_key").AddZeroOneCanUse().setCreativeTab(Tabs.tabzero_one);
	public static Item lightning_hornet_progrise_key = new Item_progrise_keys(2, 9,"lightning_hornet_progrise_key").AddToZaia3DPrinter(5).AddZeroOneCanUse().setCreativeTab(Tabs.tabzero_one);
	public static Item fighting_jackal_progrise_key = new Item_progrise_keys(0, 28,"fighting_jackal_progrise_key").setCreativeTab(Tabs.tabzero_one);
	public static Item serval_tiger_zetsumerisekey = new Item_progrise_keys(2, 29,"serval_tiger_zetsumerisekey").setCreativeTab(Tabs.tabzero_one);

	public static Item sting_scorpion_progrise_key = new Item_progrise_keys(3, 10,"sting_scorpion_progrise_key").AddToZaia3DPrinter(10).AddZeroOneCanUse().setCreativeTab(Tabs.tabzero_one);
	public static Item ark_scorpion_progrise_key = new Item_progrise_keys("ark_scorpion_progrise_key").setCreativeTab(Tabs.tabzero_one);

	public static Item flying_falcon_progrise_key = new Item_progrise_keys(4, 1,"flying_falcon_progrise_key").AddToHiden3DPrinter(5).AddZeroOneCanUse().setCreativeTab(Tabs.tabzero_one);
	public static Item burning_falcon_progrise_key = new Item_progrise_keys(4, 26,"burning_falcon_progrise_key").AddZeroOneCanUse().setCreativeTab(Tabs.tabzero_one);

	public static Item amazing_caucasus_progrise_key = new Item_progrise_keys(5, 21,"amazing_caucasus_progrise_key").AddToZaia3DPrinter(2).AddZeroOneCanUse().setCreativeTab(Tabs.tabzero_one);
	public static Item awaking_arsino_zetsumerise_key = new Item_progrise_keys("awaking_arsino_zetsumerise_key").AddToZaia3DPrinter(2).setCreativeTab(Tabs.tabzero_one);

	public static Item ark_one_progrise_key = new Item_progrise_keys(6, 19,"ark_one_progrise_key").AddChangeBase(6).setCreativeTab(Tabs.tabzero_one);
	public static Item ark_zero_one_progrise_key = new Item_progrise_keys("ark_zero_one_progrise_key").setCreativeTab(Tabs.tabzero_one);

	public static Item eden_zetsumerise_key = new Item_progrise_keys("eden_zetsumerise_key").setCreativeTab(Tabs.tabzero_one);
	public static Item crowding_hopper_progrise_key = new Item_progrise_keys("crowding_hopper_progrise_key").setCreativeTab(Tabs.tabzero_one);

	public static Item triceratops_zetsumerise_key = new Item_progrise_keys("triceratops_zetsumerise_key").setCreativeTab(Tabs.tabzero_one);
	public static Item carnotaurus_zetsumerise_key = new Item_progrise_keys("carnotaurus_zetsumerise_key").setCreativeTab(Tabs.tabzero_one);
	public static Item mass_brain_zetsumerise_key = new Item_progrise_keys("mass_brain_zetsumerise_key").setCreativeTab(Tabs.tabzero_one);

	public static Item berothamagia_zetsumerisekey = new Item_progrise_keys("berothamagia_zetsumerisekey").setCreativeTab(Tabs.tabzero_one);
	public static Item kuehnemagia_zetsumerisekey = new Item_progrise_keys("kuehnemagia_zetsumerisekey").setCreativeTab(Tabs.tabzero_one);
	public static Item ekalmagia_zetsumerisekey = new Item_progrise_keys("ekalmagia_zetsumerisekey").setCreativeTab(Tabs.tabzero_one);
	public static Item neohimagia_zetsumerisekey = new Item_progrise_keys("neohimagia_zetsumerisekey").setCreativeTab(Tabs.tabzero_one);
	public static Item onychomagia_zetsumerisekey = new Item_progrise_keys("onychomagia_zetsumerisekey").setCreativeTab(Tabs.tabzero_one);
	public static Item vicaryamagia_zetsumerisekey = new Item_progrise_keys("vicaryamagia_zetsumerisekey").setCreativeTab(Tabs.tabzero_one);
	public static Item gaerumagia_zetsumerisekey = new Item_progrise_keys("gaerumagia_zetsumerisekey").setCreativeTab(Tabs.tabzero_one);
	public static Item dodomagia_zetsumerisekey = new Item_progrise_keys("dodomagia_zetsumerisekey").setCreativeTab(Tabs.tabzero_one);
	public static Item mammothmagia_zetsumerisekey = new Item_progrise_keys("mammothmagia_zetsumerisekey").setCreativeTab(Tabs.tabzero_one);
	public static Item arsinomagia_zetsumerisekey = new Item_progrise_keys("arsinomagia_zetsumerisekey").setCreativeTab(Tabs.tabzero_one);
	public static Item unknown_zetsumerisekey = new Item_progrise_keys("unknown_zetsumerisekey").setCreativeTab(Tabs.tabzero_one);

	public static Item japanese_wolf_zetsumerisekey = new Item_progrise_keys(1, 3,"japanese_wolf_zetsumerisekey").AddChangeBase(8).setCreativeTab(Tabs.tabzero_one);
	public static Item rocking_hopper_zetsumerisekey = new Item_progrise_keys("rocking_hopper_zetsumerisekey").setCreativeTab(Tabs.tabzero_one);

	public static Item blank_progrise_key = new Item_ore("blank_progrise_key").setCreativeTab(Tabs.tabzero_one);
	public static Item humagear_progrise_key = new Item_ore("humagear_progrise_key").setCreativeTab(Tabs.tabzero_one);

	public static Item is_progrise_key = new Item_progrise_keys("is_progrise_key").AddToHumagearHiden3DPrinter(1).setCreativeTab(Tabs.tabzero_one);
	public static Item uchuyaro_subaru_progrise_key = new Item_progrise_keys("uchuyaro_subaru_progrise_key").AddToHumagearHiden3DPrinter(5).setCreativeTab(Tabs.tabzero_one);
	public static Item saikyo_takumi_oyakata_progrise_key = new Item_progrise_keys("saikyo_takumi_oyakata_progrise_key").AddToHumagearHiden3DPrinter(5).setCreativeTab(Tabs.tabzero_one);
	public static Item dr_omigoto_progrise_key = new Item_progrise_keys("dr_omigoto_progrise_key").AddToHumagearHiden3DPrinter(5).setCreativeTab(Tabs.tabzero_one);
	public static Item sumida_smile_progrise_key = new Item_progrise_keys("sumida_smile_progrise_key").AddToHumagearHiden3DPrinter(5).setCreativeTab(Tabs.tabzero_one);
	public static Item mamoru_progrise_key = new Item_progrise_keys("mamoru_progrise_key").AddToHumagearHiden3DPrinter(5).setCreativeTab(Tabs.tabzero_one);
	public static Item bengoshi_bingo_progrise_key = new Item_progrise_keys("bengoshi_bingo_progrise_key").AddToHumagearHiden3DPrinter(5).setCreativeTab(Tabs.tabzero_one);
	public static Item ikkan_nigiro_progrise_key = new Item_progrise_keys("ikkan_nigiro_progrise_key").AddToHumagearHiden3DPrinter(5).setCreativeTab(Tabs.tabzero_one);
	public static Item matsuda_enji_progrise_key = new Item_progrise_keys("matsuda_enji_progrise_key").AddToHumagearHiden3DPrinter(5).setCreativeTab(Tabs.tabzero_one);
	public static Item morifude_g_pen_progrise_key = new Item_progrise_keys("morifude_g_pen_progrise_key").AddToHumagearHiden3DPrinter(5).setCreativeTab(Tabs.tabzero_one);
	public static Item fukkinhoukai_taro_progrise_key = new Item_progrise_keys("fukkinhoukai_taro_progrise_key").AddToHumagearHiden3DPrinter(5).setCreativeTab(Tabs.tabzero_one);
	public static Item shesta_progrise_key = new Item_progrise_keys("shesta_progrise_key").AddToHumagearHiden3DPrinter(5).setCreativeTab(Tabs.tabzero_one);
	public static Item love_chan_progrise_key = new Item_progrise_keys("love_chan_progrise_key").AddToHumagearHiden3DPrinter(5).setCreativeTab(Tabs.tabzero_one);
	public static Item hakase_bot_progrise_key = new Item_progrise_keys("hakase_bot_progrise_key").AddToHumagearHiden3DPrinter(5).setCreativeTab(Tabs.tabzero_one);
	public static Item okureru_progrise_key = new Item_progrise_keys("okureru_progrise_key").AddToHumagearHiden3DPrinter(5).setCreativeTab(Tabs.tabzero_one);
	public static Item delmo_progrise_key = new Item_progrise_keys("delmo_progrise_key").AddToHumagearHiden3DPrinter(5).setCreativeTab(Tabs.tabzero_one);
	public static Item matsurida_z_progrise_key = new Item_progrise_keys("matsurida_z_progrise_key").setCreativeTab(Tabs.tabzero_one);

	public static Item horobi_progrise_key = new Item_progrise_keys("horobi_progrise_key").setCreativeTab(Tabs.tabzero_one);
	public static Item jin_progrise_key = new Item_progrise_keys("jin_progrise_key").setCreativeTab(Tabs.tabzero_one);
	public static Item ikazuchi_progrise_key = new Item_progrise_keys("ikazuchi_progrise_key").setCreativeTab(Tabs.tabzero_one);
	public static Item naki_progrise_key = new Item_progrise_keys("naki_progrise_key").setCreativeTab(Tabs.tabzero_one);	

	public static Item merry_hopper_progrise_key = new Item_progrise_keys("merry_hopper_progrise_key").AddToHiden3DPrinter(1).setCreativeTab(Tabs.tabzero_one);	

	//Saber
	public static Item blank_wonder_ride_book = new Item_ore("blank_wonder_ride_book").setCreativeTab(Tabs.tabsaber);
	
	public static Item kaenken_rekka = new ItemBaseSword("kaenken_rekka",Tabs.gashacon_breaker, blank_wonder_ride_book).setMaxStackSize(1).setCreativeTab(Tabs.tabsaber);
	public static Item kingexcalibur = new ItemBaseSword("kingexcalibur",Tabs.gashacon_sparrow_arrow,blank_wonder_ride_book).setMaxStackSize(1).setCreativeTab(Tabs.tabsaber);
	public static Item suiseiken_nagare = new ItemBaseSword("suiseiken_nagare",Tabs.gashacon_breaker, blank_wonder_ride_book).setMaxStackSize(1).setCreativeTab(Tabs.tabsaber);
	public static Item dogouken_gekido = new ItemBaseSword("dogouken_gekido",Tabs.gan_gun_saber_hammer, blank_wonder_ride_book).setMaxStackSize(1).setCreativeTab(Tabs.tabsaber);
	public static Item raimeiken_ikazuchi = new ItemBaseSword("raimeiken_ikazuchi",Tabs.gashacon_breaker, blank_wonder_ride_book).setMaxStackSize(1).setCreativeTab(Tabs.tabsaber);
	public static Item ankokuken_kurayami = new ItemBaseSword("ankokuken_kurayami",Tabs.dis_halberd, blank_wonder_ride_book).setMaxStackSize(1).setCreativeTab(Tabs.tabsaber);
	public static Item onjuuken_suzune = new Item_sword_gun("onjuuken_suzune",Tabs.gashacon_breaker, blank_wonder_ride_book).setMaxStackSize(1).setCreativeTab(Tabs.tabsaber);

	public static Item fuusouken_hayate_nitouryu = new ItemBaseSword("fuusouken_hayate_nitouryu",Tabs.gan_gun_saber_nitouryu, blank_wonder_ride_book).setMaxStackSize(1).setCreativeTab(Tabs.tabsaber);
	public static Item fuusouken_hayate_nitouryu2 = new ItemBaseSword("fuusouken_hayate_nitouryu2",Tabs.gan_gun_saber_nitouryu, blank_wonder_ride_book).setMaxStackSize(1).setCreativeTab(Tabs.tabsaber);
	public static Item fuusouken_hayate_ittouryu = new ItemBaseSword("fuusouken_hayate_ittouryu",Tabs.gan_gun_saber_nitouryu, blank_wonder_ride_book).keep_item(fuusouken_hayate_nitouryu2).setMaxStackSize(1).setCreativeTab(Tabs.tabsaber);
	public static Item fuusouken_hayate_shuriken  = new ItemBaseSword("fuusouken_hayate_shuriken",Tabs.gan_gun_saber_nitouryu, blank_wonder_ride_book).keep_item(fuusouken_hayate_nitouryu2).setMaxStackSize(1).setCreativeTab(Tabs.tabsaber);
	
	public static Item kougouken_saikou = new ItemBaseSword("kougouken_saikou",Tabs.souginjou, blank_wonder_ride_book).setMaxStackSize(1).setCreativeTab(Tabs.tabsaber);

	public static Item mumeiken_kyomu = new ItemBaseSword("mumeiken_kyomu",Tabs.gashacon_breaker, blank_wonder_ride_book).setMaxStackSize(1).setCreativeTab(Tabs.tabsaber);
	public static Item eneiken_noroshi = new ItemBaseSword("eneiken_noroshi",Tabs.souginjou, blank_wonder_ride_book).setMaxStackSize(1).setCreativeTab(Tabs.tabsaber);
	public static Item jikokuken_kaiji = new ItemBaseSword("jikokuken_kaiji",Tabs.true_brave_sword, blank_wonder_ride_book).setMaxStackSize(1).setCreativeTab(Tabs.tabsaber);
	public static Item caladbolg = new ItemBaseSword("caladbolg",Tabs.gashacon_key_slasher, blank_wonder_ride_book).setMaxStackSize(1).setCreativeTab(Tabs.tabsaber);
	public static Item storious_sword = new ItemBaseSword("storious_sword",Tabs.gashacon_key_slasher, blank_wonder_ride_book).setMaxStackSize(1).setCreativeTab(Tabs.tabsaber);

	public static Item haouken_xross_saber = new  Item_haouken_xross_saber("haouken_xross_saber",Tabs.gashacon_key_slasher).setCreativeTab(Tabs.tabsaber);
	
	public static Item gekkou_raimeiken_ikazuchi = new ItemBaseSword("gekkou_raimeiken_ikazuchi",Tabs.gashacon_key_slasher, blank_wonder_ride_book).setMaxStackSize(1).setCreativeTab(Tabs.tabsaber);
	
	public static Item dogouken_gekido_back = new Item_ore("dogouken_gekido_back");

	public static Item shimi_lot = new ItemBaseSword("shimi_lot",Tabs.gashacon_breaker, blank_wonder_ride_book).setMaxStackSize(1).setCreativeTab(Tabs.tabsaber);

	public static Item saberhead = new item_saberarmor_head("saberhead",ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.HEAD).setMaxStackSize(1).setCreativeTab(Tabs.tabsaber);
	public static Item sabertroso = new item_saberarmor_head("sabertroso",ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.CHEST).setMaxStackSize(1).setCreativeTab(Tabs.tabsaber);
	public static Item saberlegs = new item_saberarmor_head("saberlegs",ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.LEGS).setMaxStackSize(1).setCreativeTab(Tabs.tabsaber);

	public static Item seiken_swordriver_saber = new item_saberdriver("seiken_swordriver_saber",ArmorMaterial.DIAMOND, 4,"saber",1,0,0).setMaxStackSize(1).setCreativeTab(Tabs.tabsaber);
	public static Item seiken_swordriver_blaze = new item_saberdriver("seiken_swordriver_blaze",ArmorMaterial.DIAMOND, 4,"blaze",0,1,0).setMaxStackSize(1).setCreativeTab(Tabs.tabsaber);
	public static Item seiken_swordriver_espada = new item_saberdriver("seiken_swordriver_espada",ArmorMaterial.DIAMOND, 4,"espada",0,0,3).setMaxStackSize(1).setCreativeTab(Tabs.tabsaber);

	public static Item sword_of_logos_buckle_buster = new item_saberdriver("sword_of_logos_buckle_buster",ArmorMaterial.DIAMOND, 4,"buster",0,0,0).setMaxStackSize(1).setCreativeTab(Tabs.tabsaber);
	public static Item sword_of_logos_buckle_kenzan = new item_saberdriver("sword_of_logos_buckle_kenzan",ArmorMaterial.DIAMOND, 4,"kenzan",0,0,0).setMaxStackSize(1).setCreativeTab(Tabs.tabsaber);
	public static Item sword_of_logos_buckle_slash = new item_saberdriver("sword_of_logos_buckle_slash",ArmorMaterial.DIAMOND, 4,"slash",0,0,0).setMaxStackSize(1).setCreativeTab(Tabs.tabsaber);

	public static Item jaken_caliburdriver = new item_saberdriver("jaken_caliburdriver",ArmorMaterial.DIAMOND, 4,"calibur",3,0,0).setMaxStackSize(1).setCreativeTab(Tabs.tabsaber);

	public static Item seiken_saikou_driver = new item_saberdriver("seiken_saikou_driver",ArmorMaterial.DIAMOND, 4,"saikou_shadow",0,0,0).setMaxStackSize(1).setCreativeTab(Tabs.tabsaber);
	public static Item solomon_driver = new item_saberdriver("solomon_driver",ArmorMaterial.DIAMOND, 4,"solomon",0,0,0).setMaxStackSize(1).setCreativeTab(Tabs.tabsaber);
	public static Item storious_driver = new item_saberdriver("storious_driver",ArmorMaterial.DIAMOND, 4,"storious",0,0,0).setMaxStackSize(1).setCreativeTab(Tabs.tabsaber);

	public static Item seiken_swordriver_falchion = new item_saberdriver("seiken_swordriver_falchion",ArmorMaterial.DIAMOND, 4,"falchion",0,0,0).setMaxStackSize(1).setCreativeTab(Tabs.tabsaber);
	public static Item sword_of_logos_buckle_sabela = new item_saberdriver("sword_of_logos_buckle_sabela",ArmorMaterial.DIAMOND, 4,"sabela",0,0,0).setMaxStackSize(1).setCreativeTab(Tabs.tabsaber);
	public static Item sword_of_logos_buckle_durendal = new item_saberdriver("sword_of_logos_buckle_durendal",ArmorMaterial.DIAMOND, 4,"durendal",0,0,0).setMaxStackSize(1).setCreativeTab(Tabs.tabsaber);

	public static Item seiken_swordriver_tassel = new item_saberdriver("seiken_swordriver_tassel",ArmorMaterial.DIAMOND, 4,"tassel",0,0,0).setMaxStackSize(1).setCreativeTab(Tabs.tabsaber);
	
	public static Item brave_dragon_wonderride_book = new Item_wonder_ride_book("l",1,"brave_dragon_wonderride_book").resetBook("saber").AddToSwordOfLogosBookAnalyzer(30).setCreativeTab(Tabs.tabsaber);
	public static Item storm_eagle_wonderride_book = new Item_wonder_ride_book("m",3,"storm_eagle_wonderride_book").XrossSaberBook().AddToSwordOfLogosBookAnalyzer(15).setCreativeTab(Tabs.tabsaber);
	public static Item saiyuu_journey_wonderride_book = new Item_wonder_ride_book("r",10,"saiyuu_journey_wonderride_book").XrossSaberBook().AddToSwordOfLogosBookAnalyzer(5).setCreativeTab(Tabs.tabsaber);

	public static Item dragonic_knight_wonder_ride_book = new Item_wonder_ride_book("l",0,"dragonic_knight_wonder_ride_book").ChangeForm(2).NotBasicBook().SaberBook().setCreativeTab(Tabs.tabsaber);
	public static Item emotional_dragon_wonder_ride_book = new Item_wonder_ride_book("l",0,"emotional_dragon_wonder_ride_book").ChangeForm(3).NotBasicBook().SaberBook().setCreativeTab(Tabs.tabsaber);
	public static Item primitive_dragon_wonder_ride_book = new Item_wonder_ride_book("l",0,"primitive_dragon_wonder_ride_book").ChangeForm(9).NotBasicBook().SaberBook().setCreativeTab(Tabs.tabsaber);
	public static Item elemental_dragon_wonder_ride_book = new Item_wonder_ride_book("l",0,"elemental_dragon_wonder_ride_book").ChangeForm(10).NotBasicBook().SaberBook().setCreativeTab(Tabs.tabsaber);
	public static Item wonder_almighty_wonder_ride_book = new Item_wonder_ride_book("l",1,"wonder_almighty_wonder_ride_book").ChangeForm(15).NotBasicBook().SaberBook().setCreativeTab(Tabs.tabsaber);

	public static Item super_hero_senki_wonder_ride_book = new Item_wonder_ride_book("l",0,"super_hero_senki_wonder_ride_book").ChangeForm(14).NotBasicBook().SaberBook().setCreativeTab(Tabs.tabsaber);

	public static Item king_of_arthur_wonderride_book = new Item_wonder_ride_book("r",6,"king_of_arthur_wonderride_book").AddToSwordOfLogosBookAnalyzer(3).setCreativeTab(Tabs.tabsaber);
	public static Item televi_kun_wonderride_book = new Item_wonder_ride_book("r",17,"televi_kun_wonderride_book").AddToSwordOfLogosBookAnalyzer(1).setCreativeTab(Tabs.tabsaber);
	public static Item ultimate_bahamut_wonder_ride_book = new Item_wonder_ride_book("l",0,"ultimate_bahamut_wonder_ride_book").ChangeForm(18).NotBasicBook().SaberBook().setCreativeTab(Tabs.tabsaber);

	public static Item lion_senki_wonderride_book = new Item_wonder_ride_book("m",1,"lion_senki_wonderride_book").resetBook("blaze").XrossSaberBook().AddToSwordOfLogosBookAnalyzer(25).setCreativeTab(Tabs.tabsaber);
	public static Item peter_fantasista_wonderride_book = new Item_wonder_ride_book("r",1,"peter_fantasista_wonderride_book").AddToSwordOfLogosBookAnalyzer(15).setCreativeTab(Tabs.tabsaber);
	public static Item tenkuu_no_pegasus_wonderride_book = new Item_wonder_ride_book("l",4,"tenkuu_no_pegasus_wonderride_book").AddToSwordOfLogosBookAnalyzer(5).setCreativeTab(Tabs.tabsaber);

	public static Item king_lion_daisenki_wonderride_book = new Item_wonder_ride_book("m",0,"king_lion_daisenki_wonderride_book").ChangeForm(8).NotBasicBook().BladesBook().setCreativeTab(Tabs.tabsaber);
	public static Item tategami_hyoujuu_senki_wonderride_book = new Item_wonder_ride_book("m",0,"tategami_hyoujuu_senki_wonderride_book").ChangeForm(11).NotBasicBook().BladesBook().setCreativeTab(Tabs.tabsaber);

	public static Item lamp_do_alngina_wonderride_book = new Item_wonder_ride_book("r",3,"lamp_do_alngina_wonderride_book").resetBook("espada").XrossSaberBook().AddToSwordOfLogosBookAnalyzer(25).setCreativeTab(Tabs.tabsaber);
	public static Item needle_hedgehog_wonderride_book= new Item_wonder_ride_book("m",2,"needle_hedgehog_wonderride_book").AddToSwordOfLogosBookAnalyzer(15).setCreativeTab(Tabs.tabsaber);
	public static Item tri_cerberus_wonderride_book = new Item_wonder_ride_book("l",5,"tri_cerberus_wonderride_book").AddToSwordOfLogosBookAnalyzer(5).setCreativeTab(Tabs.tabsaber);

	public static Item arabiana_night_wonderride_book = new Item_wonder_ride_book("l",0,"arabiana_night_wonderride_book").NotBasicBook().ChangeForm(17).EspadaBook().setCreativeTab(Tabs.tabsaber);
	
	public static Item genbu_shinwa_wonderride_book = new Item_wonder_ride_book("l",2,"genbu_shinwa_wonderride_book").resetBook("buster").AddToSwordOfLogosBookAnalyzer(10).setCreativeTab(Tabs.tabsaber);
	public static Item jackun_to_domamenoki_wonderride_book = new Item_wonder_ride_book("r",2,"jackun_to_domamenoki_wonderride_book").BusterBook().KenzanBook().AddToSwordOfLogosBookAnalyzer(15).setCreativeTab(Tabs.tabsaber);

	public static Item sarutobi_ninjaden_wonderride_book = new Item_wonder_ride_book("r",5,"sarutobi_ninjaden_wonderride_book").resetBook("kenzan").AddToSwordOfLogosBookAnalyzer(10).setCreativeTab(Tabs.tabsaber);
	public static Item kobuta_3_kyouda_wonderride_book = new Item_wonder_ride_book("r",4,"kobuta_3_kyouda_wonderride_book").SlashBook().KenzanBook().AddToSwordOfLogosBookAnalyzer(15).setCreativeTab(Tabs.tabsaber);

	public static Item hanselnuts_to_gretel_wonderride_book = new Item_wonder_ride_book("r",11,"hanselnuts_to_gretel_wonderride_book").AddToSwordOfLogosBookAnalyzer(10).resetBook("slash").setCreativeTab(Tabs.tabsaber);
	public static Item bremen_no_rock_band_wonderride_book = new Item_wonder_ride_book("r",12,"bremen_no_rock_band_wonderride_book").SlashBook().BusterBook().AddToSwordOfLogosBookAnalyzer(15).setCreativeTab(Tabs.tabsaber);

	public static Item jaaku_dragon_wonder_ride_book = new Item_wonder_ride_book("l",3,"jaaku_dragon_wonder_ride_book").resetBook("calibur").setCreativeTab(Tabs.tabsaber);
	public static Item jaou_dragon_wonder_ride_book = new Item_wonder_ride_book("l",0,"jaou_dragon_wonder_ride_book").ChangeForm(1).NotBasicBook().CaliburBook().setCreativeTab(Tabs.tabsaber);

	public static Item kin_no_buki_gin_no_buki_wonderride_book = new Item_wonder_ride_book("l",0,"kin_no_buki_gin_no_buki_wonderride_book").AddToSwordOfLogosBookAnalyzer(3).SaikouBook().resetBook("saikou_shadow").ChangeForm(0).NotBasicBook().setCreativeTab(Tabs.tabsaber);
	public static Item x_swordman_wonderride_book= new Item_wonder_ride_book("l",0,"x_swordman_wonderride_book").SaikouBook().ChangeForm(5).NotBasicBook().setCreativeTab(Tabs.tabsaber);

	public static Item konchuu_daihyakka_wonderride_book = new Item_ore("konchuu_daihyakka_wonderride_book").setCreativeTab(Tabs.tabsaber);
	public static Item ocean_history_wonderride_book = new Item_ore("ocean_history_wonderride_book").setCreativeTab(Tabs.tabsaber);
	public static Item omni_force_wonderride_book = new Item_ore("omni_force_wonderride_book").setCreativeTab(Tabs.tabsaber);
	public static Item grimoire_wonderride_book = new Item_ore("grimoire_wonderride_book").setCreativeTab(Tabs.tabsaber);

	public static Item eternal_phoenix_wonderride_book = new Item_wonder_ride_book("l",6,"eternal_phoenix_wonderride_book").resetBook("falchion").setCreativeTab(Tabs.tabsaber);
	public static Item amazing_siren_wonderride_book = new Item_wonder_ride_book("l",0,"amazing_siren_wonderride_book").NotBasicBook().ChangeForm(16).FalchionBook().setCreativeTab(Tabs.tabsaber);

	public static Item kirin_no_ongaeshi_wonderride_book = new Item_wonder_ride_book("r",7,"kirin_no_ongaeshi_wonderride_book").AddToSwordOfLogosBookAnalyzer(5).setCreativeTab(Tabs.tabsaber);
	public static Item sarukani_wars_wonderride_book = new Item_wonder_ride_book("r",8,"sarukani_wars_wonderride_book").AddToSwordOfLogosBookAnalyzer(5).setCreativeTab(Tabs.tabsaber);
	public static Item bakusou_usagi_to_kame_wonderride_book = new Item_wonder_ride_book("r",9,"bakusou_usagi_to_kame_wonderride_book").AddToSwordOfLogosBookAnalyzer(5).setCreativeTab(Tabs.tabsaber);
	public static Item hoshin_kamen_engi_wonderride_book = new Item_wonder_ride_book("r",13,"hoshin_kamen_engi_wonderride_book").AddToSwordOfLogosBookAnalyzer(5).setCreativeTab(Tabs.tabsaber);
	public static Item tsuki_no_hime_kaguyan_wonderride_book = new Item_wonder_ride_book("r",14,"tsuki_no_hime_kaguyan_wonderride_book").AddToSwordOfLogosBookAnalyzer(5).setCreativeTab(Tabs.tabsaber);
	public static Item osha_jizou_san_wonderride_book = new Item_wonder_ride_book("r",15,"osha_jizou_san_wonderride_book").AddToSwordOfLogosBookAnalyzer(5).setCreativeTab(Tabs.tabsaber);
	public static Item issun_bushi_wonderride_book = new Item_wonder_ride_book("r",16,"issun_bushi_wonderride_book").AddToSwordOfLogosBookAnalyzer(5).setCreativeTab(Tabs.tabsaber);
	public static Item daishougun_momoichirou_wonderride_book = new Item_wonder_ride_book("r",18,"daishougun_momoichirou_wonderride_book").AddToSwordOfLogosBookAnalyzer(5).setCreativeTab(Tabs.tabsaber);
	public static Item daikengou_urashimajirou_wonderride_book = new Item_wonder_ride_book("r",19,"daikengou_urashimajirou_wonderride_book").AddToSwordOfLogosBookAnalyzer(5).setCreativeTab(Tabs.tabsaber);
	public static Item daiyokozuna_kinzaburou_wonderride_book = new Item_wonder_ride_book("r",20,"daiyokozuna_kinzaburou_wonderride_book").AddToSwordOfLogosBookAnalyzer(5).setCreativeTab(Tabs.tabsaber);

	public static Item wonder_world_story_of_kaenken_rekka_wonderride_book = new Item_ore("wonder_world_story_of_kaenken_rekka_wonderride_book").setCreativeTab(Tabs.tabsaber);
	public static Item wonder_world_story_of_suiseiken_nagare_wonderride_book = new Item_ore("wonder_world_story_of_suiseiken_nagare_wonderride_book").setCreativeTab(Tabs.tabsaber);
	public static Item wonder_world_story_of_raimeiken_ikazuchi_wonderride_book = new Item_ore("wonder_world_story_of_raimeiken_ikazuchi_wonderride_book").setCreativeTab(Tabs.tabsaber);
	public static Item wonder_world_story_of_ankokuken_kurayami_wonderride_book = new Item_ore("wonder_world_story_of_ankokuken_kurayami_wonderride_book").setCreativeTab(Tabs.tabsaber);
	public static Item wonder_world_story_of_dogouken_gekido_wonderride_book = new Item_ore("wonder_world_story_of_dogouken_gekido_wonderride_book").setCreativeTab(Tabs.tabsaber);
	public static Item wonder_world_story_of_fuusouken_hayate_wonderride_book = new Item_ore("wonder_world_story_of_fuusouken_hayate_wonderride_book").setCreativeTab(Tabs.tabsaber);
	public static Item wonder_world_story_of_onjuuken_suzune_wonderride_book = new Item_ore("wonder_world_story_of_onjuuken_suzune_wonderride_book").setCreativeTab(Tabs.tabsaber);
	public static Item wonder_world_story_of_kougouken_saikou_wonderride_book = new Item_ore("wonder_world_story_of_kougouken_saikou_wonderride_book").setCreativeTab(Tabs.tabsaber);
	public static Item wonder_world_story_of_mumeiken_kyomu_wonderride_book = new Item_ore("wonder_world_story_of_mumeiken_kyomu_wonderride_book").setCreativeTab(Tabs.tabsaber);
	public static Item wonder_world_story_of_eneiken_noroshi_wonderride_book = new Item_ore("wonder_world_story_of_eneiken_noroshi_wonderride_book").setCreativeTab(Tabs.tabsaber);
	public static Item wonder_world_story_of_jikokuken_kaiji_wonderride_book = new Item_ore("wonder_world_story_of_jikokuken_kaiji_wonderride_book").setCreativeTab(Tabs.tabsaber);

	public static Item happy_brave_dragon_wonder_ride_book = new Item_ore("happy_brave_dragon_wonder_ride_book").setCreativeTab(Tabs.tabsaber);

	public static Item diago_speedy_wonder_ride_book = new item_diago_speedy("diago_speedy_wonder_ride_book").setCreativeTab(Tabs.tabsaber);

	public static Item desast_alter_ride_book = new Item_ore("desast_alter_ride_book").setCreativeTab(Tabs.tabsaber);
	public static Item charybdis_alter_ride_book = new Item_ore("charybdis_alter_ride_book").setCreativeTab(Tabs.tabsaber);
	public static Item legeiel_alter_ride_book = new Item_ore("legeiel_alter_ride_book").setCreativeTab(Tabs.tabsaber);
	public static Item zooous_alter_ride_book = new Item_ore("zooous_alter_ride_book").setCreativeTab(Tabs.tabsaber);
	public static Item storious_alter_ride_book = new Item_ore("storious_alter_ride_book").setCreativeTab(Tabs.tabsaber);

	public static Item ghost_ijinroku_wonderride_book = new Item_wonder_ride_book("l",0,"ghost_ijinroku_wonderride_book").ChangeForm(4).NotBasicBook().SaberBook().setCreativeTab(Tabs.tabsaber);
	public static Item specter_gekikou_senki_wonderride_book = new Item_wonder_ride_book("l",0,"specter_gekikou_senki_wonderride_book").ChangeForm(13).NotBasicBook().BladesBook().setCreativeTab(Tabs.tabsaber);

	public static Item book_gate_wonder_ride_book = new item_book_gate_wonder_ride_book("book_gate_wonder_ride_book").setCreativeTab(Tabs.tabsaber);
	public static Item blank_wonder_world_story_wonder_ride_book = new Item_ore("blank_wonder_world_story_wonder_ride_book").setCreativeTab(Tabs.tabsaber);

	public static Item omni_force_wonderride_book_part = new Item_ore("omni_force_wonderride_book_part").setCreativeTab(Tabs.tabsaber);
	public static Item omni_force_wonderride_book_part2 = new Item_ore("omni_force_wonderride_book_part2").setCreativeTab(Tabs.tabsaber);

	public static Item book_of_ruin = new item_book_of_ruin("book_of_ruin").setCreativeTab(Tabs.tabsaber);
	public static Item forbidden_tome = new Item_ore("forbidden_tome").setCreativeTab(Tabs.tabsaber);
	public static Item great_book_fragment = new Item_ore("great_book_fragment").setCreativeTab(Tabs.tabsaber);

	public static Item seiken_swordriver = new Item_ore("seiken_swordriver");

	public static Item seiken_swordriver_dragon = new Item_ore("seiken_swordriver_dragon");
	public static Item seiken_swordriver_pegasus = new Item_ore("seiken_swordriver_pegasus");
	public static Item seiken_swordriver_cerberus = new Item_ore("seiken_swordriver_cerberus");
	public static Item seiken_swordriver_genbu = new Item_ore("seiken_swordriver_genbu");
	public static Item seiken_swordriver_jaaku_dragon = new Item_ore("seiken_swordriver_jaaku_dragon");
	public static Item seiken_swordriver_phoenix = new Item_ore("seiken_swordriver_phoenix");

	public static Item seiken_swordriver_eagle = new Item_ore("seiken_swordriver_eagle");
	public static Item seiken_swordriver_lion = new Item_ore("seiken_swordriver_lion");
	public static Item seiken_swordriver_hedgehog = new Item_ore("seiken_swordriver_hedgehog");

	public static Item seiken_swordriver_saiyuu = new Item_ore("seiken_swordriver_saiyuu");
	public static Item seiken_swordriver_peter = new Item_ore("seiken_swordriver_peter");
	public static Item seiken_swordriver_alangina = new Item_ore("seiken_swordriver_alangina");
	public static Item seiken_swordriver_jackun = new Item_ore("seiken_swordriver_jackun");
	public static Item seiken_swordriver_ninja = new Item_ore("seiken_swordriver_ninja");
	public static Item seiken_swordriver_butasan = new Item_ore("seiken_swordriver_butasan");
	public static Item seiken_swordriver_hansel = new Item_ore("seiken_swordriver_hansel");
	public static Item seiken_swordriver_bremen = new Item_ore("seiken_swordriver_bremen");
	public static Item seiken_swordriver_arthur = new Item_ore("seiken_swordriver_arthur");
	public static Item seiken_swordriver_kirin = new Item_ore("seiken_swordriver_kirin");
	public static Item seiken_swordriver_houshin_engi = new Item_ore("seiken_swordriver_houshin_engi");
	public static Item seiken_swordriver_jizousan = new Item_ore("seiken_swordriver_jizousan");
	public static Item seiken_swordriver_usakame = new Item_ore("seiken_swordriver_usakame");
	public static Item seiken_swordriver_kaguyan = new Item_ore("seiken_swordriver_kaguyan");
	public static Item seiken_swordriver_issun = new Item_ore("seiken_swordriver_issun");
	public static Item seiken_swordriver_sarukani = new Item_ore("seiken_swordriver_sarukani");
	public static Item seiken_swordriver_televikun = new Item_ore("seiken_swordriver_televikun");
	public static Item seiken_swordriver_momoichirou = new Item_ore("seiken_swordriver_momoichirou");
	public static Item seiken_swordriver_urashima_jirou = new Item_ore("seiken_swordriver_urashima_jirou");
	public static Item seiken_swordriver_kinzaburou = new Item_ore("seiken_swordriver_kinzaburou");

	public static Item seiken_swordriver_dragonic = new Item_ore("seiken_swordriver_dragonic");
	public static Item seiken_swordriver_primitive = new Item_ore("seiken_swordriver_primitive");
	public static Item seiken_swordriver_elemental = new Item_ore("seiken_swordriver_elemental");
	public static Item seiken_swordriver_emotional = new Item_ore("seiken_swordriver_emotional");
	public static Item seiken_swordriver_ghost = new Item_ore("seiken_swordriver_ghost");
	public static Item seiken_swordriver_super_hero_senki = new Item_ore("seiken_swordriver_super_hero_senki");
	public static Item seiken_swordriver_wonder = new Item_ore("seiken_swordriver_wonder");

	public static Item seiken_swordriver_king_lion = new Item_ore("seiken_swordriver_king_lion");
	public static Item seiken_swordriver_tategami = new Item_ore("seiken_swordriver_tategami");
	public static Item seiken_swordriver_specter = new Item_ore("seiken_swordriver_specter");

	public static Item seiken_swordriver_siren = new Item_ore("seiken_swordriver_siren");
	public static Item seiken_swordriver_arabiana = new Item_ore("seiken_swordriver_arabiana");
	
	public static Item seiken_swordriver_bahamut = new Item_ore("seiken_swordriver_bahamut");
	
	public static Item jaken_caliburdriver_jaou = new Item_ore("jaken_caliburdriver_jaou");

	public static Item seiken_saikou_driver_x_swordman = new Item_ore("seiken_saikou_driver_x_swordman");
	public static Item seiken_saikou_driver_x_swordman1 = new Item_ore("seiken_saikou_driver_x_swordman1");
	public static Item seiken_saikou_driver_x_swordman2 = new Item_ore("seiken_saikou_driver_x_swordman2");

	public static Item wonder_ride_books = new Item_ore("wonder_ride_books");
	
	//Revice
	
	public static Item revicehead = new item_revicearmor("revicehead",ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.HEAD).setMaxStackSize(1).setCreativeTab(Tabs.tabrevice);
	public static Item revicetroso = new item_revicearmor2("revicetroso",ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.CHEST).setMaxStackSize(1).setCreativeTab(Tabs.tabrevice);
	public static Item revicelegs = new item_revicearmor2("revicelegs",ArmorMaterial.DIAMOND, 4, EntityEquipmentSlot.LEGS).setMaxStackSize(1).setCreativeTab(Tabs.tabrevice);

	public static Item revice_driver = new item_revicedriver("revice_driver",ArmorMaterial.DIAMOND, 4, "revi",0).setMaxStackSize(1).setCreativeTab(Tabs.tabrevice);
	public static Item vice_belt = new item_revicedriver("vice_belt",ArmorMaterial.DIAMOND, 4, "vice",0).setMaxStackSize(1).setCreativeTab(Tabs.tabrevice);

	public static Item rex_vistamp = new Item_Vistamps(0,"rex_vistamp").AddReviCanUse().AddViceCanUse().setCreativeTab(Tabs.tabrevice);
	public static Item eagle_vistamp = new Item_Vistamps(1,"eagle_vistamp").AddReviCanUse().AddViceCanUse().setCreativeTab(Tabs.tabrevice);
	public static Item mammoth_vistamp = new Item_Vistamps(2,"mammoth_vistamp").AddReviCanUse().AddViceCanUse().setCreativeTab(Tabs.tabrevice);
	public static Item megalodon_vistamp = new Item_Vistamps(3,"megalodon_vistamp").AddReviCanUse().AddViceCanUse().setCreativeTab(Tabs.tabrevice);
	public static Item ptera_vistamp = new Item_Vistamps(4,"ptera_vistamp").AddReviCanUse().setCreativeTab(Tabs.tabrevice);
	public static Item lion_vistamp = new Item_Vistamps(5,"lion_vistamp").AddReviCanUse().AddViceCanUse().setCreativeTab(Tabs.tabrevice);
	public static Item jackal_vistamp = new Item_Vistamps(6,"jackal_vistamp").AddReviCanUse().AddEvilCanUse().AddLiveCanUse().setCreativeTab(Tabs.tabrevice);
	public static Item kong_vistamp = new Item_Vistamps(7,"kong_vistamp").AddReviCanUse().AddViceCanUse().setCreativeTab(Tabs.tabrevice);
	public static Item kamakiri_vistamp = new Item_Vistamps(8,"kamakiri_vistamp").AddReviCanUse().AddViceCanUse().setCreativeTab(Tabs.tabrevice);
	public static Item brachio_vistamp = new Item_Vistamps(9,"brachio_vistamp").AddReviCanUse().AddViceCanUse().setCreativeTab(Tabs.tabrevice);
	public static Item kajiki_vistamp = new Item_Vistamps(10,"kajiki_vistamp").AddReviCanUse().AddViceCanUse().setCreativeTab(Tabs.tabrevice);
	public static Item neo_batta_vistamp = new Item_Vistamps(21,"neo_batta_vistamp").AddReviCanUse().AddViceCanUse().setCreativeTab(Tabs.tabrevice);
	
	public static Item bat_vistamp = new Item_Vistamps(11,"bat_vistamp").AddEvilCanUse().AddLiveCanUse().setCreativeTab(Tabs.tabrevice);
	
	public static Item spider_vistamp = new Item_Vistamps(12,"spider_vistamp").AddDemonsCanUse().setCreativeTab(Tabs.tabrevice);
	public static Item batta_vistamp_vistamp = new Item_Vistamps(13,"batta_vistamp").AddDemonsCanUse().setCreativeTab(Tabs.tabrevice);
	public static Item mogura_vistamp_vistamp = new Item_Vistamps(14,"mogura_vistamp").AddDemonsCanUse().setCreativeTab(Tabs.tabrevice);
	public static Item turtle_vistamp_vistamp = new Item_Vistamps(15,"turtle_vistamp").setCreativeTab(Tabs.tabrevice);
	public static Item scorpion_vistamp_vistamp = new Item_Vistamps(16,"scorpion_vistamp").setCreativeTab(Tabs.tabrevice);
	
	public static Item condor_vistamp_vistamp = new Item_Vistamps(17,"condor_vistamp").AddReviCanUse().AddViceCanUse().AddDemonsCanUse().setCreativeTab(Tabs.tabrevice);
	public static Item white_leo_vistamp = new Item_Vistamps(19,"white_leo_vistamp").AddReviCanUse().AddViceCanUse().setCreativeTab(Tabs.tabrevice);
	public static Item quetzalcoatlus_vistamp = new Item_Vistamps(20,"quetzalcoatlus_vistamp").AddReviCanUse().setCreativeTab(Tabs.tabrevice);
	
	public static Item cobra_vistamp = new Item_Vistamps(18,"cobra_vistamp").AddJeanneCanUse().setCreativeTab(Tabs.tabrevice);
	
	public static Item kangaroo_vistamp = new Item_Vistamps("kangaroo_vistamp").setCreativeTab(Tabs.tabrevice);
	public static Item cheetah_vistamp = new Item_Vistamps("cheetah_vistamp").setCreativeTab(Tabs.tabrevice);
	public static Item planarian_vistamp = new Item_Vistamps("planarian_vistamp").setCreativeTab(Tabs.tabrevice);
	public static Item daiouika_vistamp = new Item_Vistamps("daiouika_vistamp").setCreativeTab(Tabs.tabrevice);
	public static Item wolf_vistamp = new Item_Vistamps("wolf_vistamp").setCreativeTab(Tabs.tabrevice);
	public static Item sabertiger_vistamp = new Item_Vistamps("sabertiger_vistamp").setCreativeTab(Tabs.tabrevice);
	
	public static Item rex_vistamp_metal = new Item_Vistamps("rex_vistamp_metal").setCreativeTab(Tabs.tabrevice);
	public static Item rex_vistamp_christmas = new Item_Vistamps("rex_vistamp_christmas").setCreativeTab(Tabs.tabrevice);
	public static Item rex_vistamp_theme = new Item_Vistamps("rex_vistamp_theme").setCreativeTab(Tabs.tabrevice);
	public static Item toysaurus_vistamp = new Item_Vistamps("toysaurus_vistamp").setCreativeTab(Tabs.tabrevice);
	public static Item mammoth_vistamp_china = new Item_Vistamps("mammoth_vistamp_china").setCreativeTab(Tabs.tabrevice);
	
	
	public static void init() {
	}

	//public static void init(){}
}



