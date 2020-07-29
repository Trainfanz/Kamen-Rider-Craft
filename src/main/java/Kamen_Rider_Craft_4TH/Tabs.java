package Kamen_Rider_Craft_4TH;


import Kamen_Rider_Craft_4TH.util.TAB_MASKED_RIDER;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;

import java.util.function.BiFunction;

public class Tabs {
	/**
	private static BiFunction<String, Item, CreativeTabs> function = (name, item) -> new CreativeTabs(name) {
		@Override
		public ItemStack createIcon() {
			return new ItemStack(item);
		}
	};
**/
	public static ToolMaterial tokuToolMaterial = EnumHelper.addToolMaterial("tokuToolMaterial", 10, 3500, 12.0F, 5.0F, 22);

	public static ToolMaterial ridol_stick = EnumHelper.addToolMaterial("ridol_stick", 10, 6000, 12.0F, 3.0F, 22);
	
	public static ToolMaterial faiz_edge = EnumHelper.addToolMaterial("faiz_edge", 10, 4000, 12.0F, 5.0F, 22);
	public static ToolMaterial faiz_blaster = EnumHelper.addToolMaterial("faiz_blaster", 10, 4000, 12.0F, 9.0F, 22);
	public static ToolMaterial kaixa_blaygun = EnumHelper.addToolMaterial("kaixa_blaygun", 10, 4000, 12.0F, 6.0F, 22);
	public static ToolMaterial deltablaster = EnumHelper.addToolMaterial("deltablaster", 10, 2000, 12.0F, 0.0F, 22);
	public static ToolMaterial psyga_tonfa_edge = EnumHelper.addToolMaterial("psyga_tonfa_edge", 10, 4000, 12.0F, 6.0F, 22);
	public static ToolMaterial orga_stlanzer = EnumHelper.addToolMaterial("orga_stlanzer", 10, 4000, 7.0F, 7.0F, 22);
	public static ToolMaterial axel_ray_gun = EnumHelper.addToolMaterial("axel_ray_gun", 10, 4000, 12.0F, 5.0F, 22);
	
	public static ToolMaterial leanglerouzer = EnumHelper.addToolMaterial("leanglerouzer", 10, 6000, 12.0F, 3.0F, 22);
	public static ToolMaterial chalice_arrow = EnumHelper.addToolMaterial("chalice_arrow", 10, 2000, 12.0F, 1.0F, 22);
	
	public static ToolMaterial ongekibo = EnumHelper.addToolMaterial("ongekibo", 10, 4000, 12.0F, 4.0F, 22);
	public static ToolMaterial armedsaber = EnumHelper.addToolMaterial("armedsaber", 10, 4000, 12.0F, 9.0F, 22);
	
	public static ToolMaterial den_denso = EnumHelper.addToolMaterial("den_denso", 10, 4000, 12.0F, 5.0F, 22);
	public static ToolMaterial den_denro = EnumHelper.addToolMaterial("den_denro", 10, 4000, 12.0F, 4.0F, 22);
	public static ToolMaterial den_denaxe = EnumHelper.addToolMaterial("den_denaxe", 10, 4000, 12.0F, 6.0F, 22);
	public static ToolMaterial den_dengu = EnumHelper.addToolMaterial("den_dengu", 10, 2000, 12.0F, 0.0F, 22);
	public static ToolMaterial denkamen_sword = EnumHelper.addToolMaterial("denkamen_sword", 10, 4000, 12.0F, 9.0F, 22);
	public static ToolMaterial gden_dengu = EnumHelper.addToolMaterial("gden_dengu", 10, 2000, 12.0F, 0.0F, 22);
	public static ToolMaterial nega_den_gasher = EnumHelper.addToolMaterial("nega_den_gasher", 10, 4000, 12.0F, 5.0F, 22);
	public static ToolMaterial gaoh_gasher = EnumHelper.addToolMaterial("gaoh_gasher", 10, 4000, 12.0F, 6.0F, 22);
	public static ToolMaterial den_gasher_vega = EnumHelper.addToolMaterial("den_gasher_vega", 10, 4000, 12.0F, 5.0F, 22);
	public static ToolMaterial momotaken = EnumHelper.addToolMaterial("momotaken", 10, 4000, 12.0F, 6.0F, 22);
	public static ToolMaterial uratazao = EnumHelper.addToolMaterial("uratazao", 10, 4000, 12.0F, 3.0F, 22);
	public static ToolMaterial kintaono = EnumHelper.addToolMaterial("kintaono", 10, 4000, 12.0F, 7.0F, 22);
	public static ToolMaterial macheteddy = EnumHelper.addToolMaterial("macheteddy", 10, 4000, 12.0F, 6.0F, 22);
	public static ToolMaterial den_denhandaxe = EnumHelper.addToolMaterial("den_denhandaxe", 10, 4000, 12.0F, 4.0F, 22);
	public static ToolMaterial den_denboomerang = EnumHelper.addToolMaterial("den_denboomeraing", 10, 4000, 12.0F, 3.0F, 22);
	public static ToolMaterial den_denhijack = EnumHelper.addToolMaterial("den_denhijack", 10, 4000, 12.0F, 6.0F, 22);
	public static ToolMaterial gden_denjutte = EnumHelper.addToolMaterial("gden_denjutte", 10, 4000, 12.0F, 5.0F, 22);
	public static ToolMaterial zerogasher = EnumHelper.addToolMaterial("zerogasher", 10, 4000, 12.0F, 5.0F, 22);
	
	public static ToolMaterial garulu_saber = EnumHelper.addToolMaterial("garulu_saber", 10, 4000, 12.0F, 6.0F, 22);
	public static ToolMaterial dogga_hammer = EnumHelper.addToolMaterial("dogga_hammer", 10, 4000, 12.0F, 4.0F, 22);
	public static ToolMaterial bashaamagnum = EnumHelper.addToolMaterial("bashaamagnum", 10, 2000, 12.0F, 0.0F, 22);
	public static ToolMaterial jacorder = EnumHelper.addToolMaterial("jacorder", 10, 4000, 12.0F, 6.0F, 22);
	public static ToolMaterial zanbatsword_core = EnumHelper.addToolMaterial("zanbatsword_core", 10, 4000, 12.0F, 6.0F, 22);
	public static ToolMaterial zanbatsword = EnumHelper.addToolMaterial("zanbatsword", 10, 4000, 12.0F, 9.0F, 22);
	
	public static ToolMaterial medajalibur = EnumHelper.addToolMaterial("medajalibur", 10, 3500, 12.0F, 5.0F, 22);
	public static ToolMaterial tajaspinner = EnumHelper.addToolMaterial("tajaspinner", 10, 3500, 12.0F, 7.0F, 40);
	public static ToolMaterial medagaburyu = EnumHelper.addToolMaterial("medagaburyu", 10, 3500, 12.0F, 16.0F, 20);
	public static ToolMaterial birth_buster = EnumHelper.addToolMaterial("birth_buster", 10, 3500, 12.0F, 2.0F, 20);
	
	public static ToolMaterial wizarswordgun = EnumHelper.addToolMaterial("wizarswordgun", 10, 4000, 12.0F, 5.0F, 22);
	public static ToolMaterial axcalibur = EnumHelper.addToolMaterial("axcalibur", 10, 4000, 12.0F, 9.0F, 22);
	public static ToolMaterial hammelcane = EnumHelper.addToolMaterial("hammelcane", 10, 4000, 12.0F, 8.0F, 22);
	public static ToolMaterial dis_halberd = EnumHelper.addToolMaterial("dis_halberd", 10, 4000, 12.0F, 6.0F, 22);
	
	public static ToolMaterial gashacon_breaker = EnumHelper.addToolMaterial("gashacon_breaker", 10, 3500, 12.0F, 5.0F, 22);
	public static ToolMaterial gashacon_breaker_ham = EnumHelper.addToolMaterial("gashacon_breaker_ham", 10, 5000, 12.0F, 4.0F, 22);
	
	public static ToolMaterial gashacon_sword = EnumHelper.addToolMaterial("gashacon_sword", 10, 2500, 12.0F, 5.0F, 22);
	
	public static ToolMaterial gashacon_magnum_gun = EnumHelper.addToolMaterial("gashacon_magnum_gun", 10, 5000, 12.0F, 0.0F, 22);
	
	public static ToolMaterial gashacon_sparrow_sickle = EnumHelper.addToolMaterial("gashacon_sparrow_sickle", 10, 5000, 12.0F, 3.0F, 22);
	public static ToolMaterial gashacon_sparrow_arrow = EnumHelper.addToolMaterial("gashacon_sparrow_arrow", 10, 10000, 12.0F, 8.0F, 22);
	
	public static ToolMaterial parabragun_axe = EnumHelper.addToolMaterial("parabragun_axe", 10, 10000, 12.0F, 10.0F, 22);
	
	public static ToolMaterial true_brave_sword = EnumHelper.addToolMaterial("true_brave_sword", 10, 8000, 12.0F, 9.0F, 12);
	public static ToolMaterial fuuma_sword = EnumHelper.addToolMaterial("fuuma_sword", 10, 5000, 12.0F, 5.0F, 22);
	
	public static ToolMaterial gashacon_key_slasher = EnumHelper.addToolMaterial("gashacon_key_slasher", 10, 8000, 12.0F, 14.0F, 12);
	
	
	public static ToolMaterial musou_saber = EnumHelper.addToolMaterial("musou_saber", 10, 3500, 12.0F, 5.0F, 22);
	public static ToolMaterial musou_saber_naginata = EnumHelper.addToolMaterial("musou_saber_naginata", 10, 3500, 12.0F, 8.0F, 22);
	public static ToolMaterial musou_saber_kusarigama = EnumHelper.addToolMaterial("musou_saber_kusarigama", 10, 3500, 12.0F, 10.0F, 22);
	public static ToolMaterial dj_gun = EnumHelper.addToolMaterial("dj_gun", 10, 5000, 12.0F, 11.0F, 22);
	public static ToolMaterial dj_gun_taiken_mode = EnumHelper.addToolMaterial("dj_gun_taiken_mode", 10, 20000, 12.0F, 18.0F, 22);
	public static ToolMaterial kagematsu = EnumHelper.addToolMaterial("kagematsu", 10, 6000, 12.0F, 3.0F, 22);
	public static ToolMaterial donkachi = EnumHelper.addToolMaterial("donkachi", 10, 5000, 12.0F, 4.0F, 22);
	public static ToolMaterial melon_defender = EnumHelper.addToolMaterial("melon_defender", 10, 8000, 12.0F, 4.0F, 22);
	public static ToolMaterial pine_iron = EnumHelper.addToolMaterial("pine_iron", 10, 2500, 12.0F, 7.0F, 22);
	public static ToolMaterial ichigo_kunai = EnumHelper.addToolMaterial("ichigo_kunai", 10, 6000, 12.0F, 4.0F, 50);
	public static ToolMaterial daidaimaru = EnumHelper.addToolMaterial("daidaimaru", 10, 4000, 12.0F, 5.0F, 22);
	public static ToolMaterial banana_spear = EnumHelper.addToolMaterial("banana_spear", 10, 3500, 12.0F, 6.0F, 22);
	public static ToolMaterial budou_ryuhou = EnumHelper.addToolMaterial("budou_ryuhou", 10, 2000, 12.0F, 3.0F, 22);
	public static ToolMaterial mango_punisher = EnumHelper.addToolMaterial("mango_punisher", 10, 2500, 12.0F, 9.0F, 22);
	public static ToolMaterial duri_noko = EnumHelper.addToolMaterial("duri_noko", 10, 3000, 12.0F, 8.0F, 22);
	public static ToolMaterial kiwi_gekirin = EnumHelper.addToolMaterial("kiwi_gekirin", 10, 3500, 12.0F, 5.0F, 22);
	public static ToolMaterial sonic_arrow = EnumHelper.addToolMaterial("sonic_arrow", 10, 5000, 12.0F, 9.0F, 22);
	public static ToolMaterial kagematsu_shin = EnumHelper.addToolMaterial("kagematsu_shin", 10, 6500, 12.0F, 5.0F, 22);
	public static ToolMaterial yomimaru = EnumHelper.addToolMaterial("yomimaru", 10, 5000, 12.0F, 9.0F, 22);
	public static ToolMaterial sword_bringer = EnumHelper.addToolMaterial("sword_bringer", 10, 4000, 12.0F, 9.0F, 22);
	public static ToolMaterial apple_reflecter = EnumHelper.addToolMaterial("apple_reflecter", 10, 5000, 12.0F, 4.0F, 22);
	public static ToolMaterial souginjou = EnumHelper.addToolMaterial("souginjou", 10, 3500, 12.0F, 8.0F, 22);
	public static ToolMaterial watermelon_defender = EnumHelper.addToolMaterial("watermelon_defender", 10, 3500, 12.0F, 7.0F, 22);
	public static ToolMaterial savior_arrow = EnumHelper.addToolMaterial("savior_arrow", 10, 7000, 12.0F, 12.0F, 22);
	public static ToolMaterial suika_sojinto = EnumHelper.addToolMaterial("suika_sojinto", 10, 6000, 12.0F, 8.0F, 22);
	public static ToolMaterial suika_sojinto_baron_ver = EnumHelper.addToolMaterial("suika_sojinto", 10, 6000, 12.0F, 8.0F, 22);
	
	public static ToolMaterial gan_gun_saber_blade = EnumHelper.addToolMaterial("gan_gun_saber_blade", 10, 3500, 12.0F, 5.0F, 22);
	public static ToolMaterial gan_gun_saber_nitouryu = EnumHelper.addToolMaterial("gan_gun_saber_nitouryu", 10, 5000, 12.0F, 4.0F, 22);
	public static ToolMaterial gan_gun_saber_nitouryu_2 = EnumHelper.addToolMaterial("gan_gun_saber_nitouryu_2", 10, 5000, 12.0F, 4.0F, 22);
	public static ToolMaterial gan_gun_saber_gun = EnumHelper.addToolMaterial("gan_gun_saber_gun", 10, 3500, 12.0F, 2.0F, 22);
	public static ToolMaterial gan_gun_saber_naginata = EnumHelper.addToolMaterial("gan_gun_saber_naginata", 10, 2500, 12.0F, 6.0F, 22);
	public static ToolMaterial gan_gun_saber_condor_denwor = EnumHelper.addToolMaterial("gan_gun_saber_condor_denwor", 10, 3500, 12.0F, 4.0F, 22);
	public static ToolMaterial gan_gun_saber_rifle = EnumHelper.addToolMaterial("gan_gun_saber_rifle", 10, 4000, 12.0F, 5.0F, 22);
	public static ToolMaterial gan_gun_saber_hammer = EnumHelper.addToolMaterial("gan_gun_saber_hammer", 10, 3000, 12.0F, 7.0F, 22);
	public static ToolMaterial sunglasseslasher_sword = EnumHelper.addToolMaterial("sunglasseslasher_sword", 10, 6000, 12.0F, 12.0F, 22);
	public static ToolMaterial gan_gun_hand_rod = EnumHelper.addToolMaterial("gan_gun_hand_rod", 10, 4500, 12.0F, 6.0F, 22);
	public static ToolMaterial gan_gun_hand_kama = EnumHelper.addToolMaterial("gan_gun_hand_kama", 10, 5500, 12.0F, 9.0F, 22);
	public static ToolMaterial deep_slasher_sword = EnumHelper.addToolMaterial("deep_slasher_sword", 10, 6500, 12.0F, 13.0F, 22);
	public static ToolMaterial gan_gun_catcher_rod = EnumHelper.addToolMaterial("gan_gun_catcher_rod", 10, 6000, 12.0F, 10.0F, 22);
	
	public static ToolMaterial kaizoku_hassha = EnumHelper.addToolMaterial("kaizoku_hassha", 10, 5000, 12.0F, 4.0F, 22);
	
	
	/**
	public static CreativeTabs tabIchigo = function.apply("tabIichigo", RiderItems.ichigohead);
	
	public static CreativeTabs tabkuuga = function.apply("tabkuuga", RiderItems.kuugahead);

	public static CreativeTabs tabagito = function.apply("tabagito", RiderItems.agitohead);

	public  static CreativeTabs tabryuki = function.apply("tabryuki", RiderItems.ryukihead);

	public static CreativeTabs tabfaiz = function.apply("tabfaiz", RiderItems.faizhead);

	public static CreativeTabs tabblade = function.apply("tabblade", RiderItems.bladehead);

	public static CreativeTabs tabhibiki = function.apply("tabhibiki", RiderItems.hibikihead);

	public static CreativeTabs tabkabuto = function.apply("tabkabuto", RiderItems.kabutohead);

	public static CreativeTabs tabden_o = function.apply("tabden_o", RiderItems.den_ohead);

	public static CreativeTabs tabkiva = function.apply("tabkiva", RiderItems.kivahead);

	public  static CreativeTabs tabdecade = function.apply("tabdecade", RiderItems.decadehead);

	public static CreativeTabs tabW = function.apply("tabW", RiderItems.Whead);

	public static CreativeTabs tabOOO = function.apply("tabOOO", RiderItems.OOOhead);

	public static CreativeTabs tabFourze = function.apply("tabFourze", RiderItems.Fourzehead);

	public static CreativeTabs tabwizard = function.apply("tabwizard", RiderItems.wizardhead);

	public static CreativeTabs tabGaim = function.apply("tabGaim", RiderItems.Gaimhead);

	public static CreativeTabs tabdrive = function.apply("tabdrive", RiderItems.drivehead);

	public static CreativeTabs tabghost = function.apply("tabghost", RiderItems.ghosthead);

	public static CreativeTabs tabex_aid = function.apply("tabex_aid", RiderItems.ex_aidhead);

	public static CreativeTabs tabbuild = function.apply("tabbuild", RiderItems.buildhead);

	public static CreativeTabs tabzi_o = function.apply("tabzi_o", RiderItems.zi_ohead);

	public static CreativeTabs tabamazons = function.apply("tabamazons", RiderItems.amazonshead);

	public static CreativeTabs tabdecor = function.apply("tabdecor", Item.getItemFromBlock(RiderItems.monitor));

	public static CreativeTabs tabmisc = function.apply("tabmisc", RiderItems.icepop1);
**/
	public static CreativeTabs tabIchigo= new CreativeTabs("tabIichigo")
	{
		@Override
		public ItemStack createIcon() {
			return new ItemStack(RiderItems.ichigohead);
		}
	};

	public static CreativeTabs tabkuuga = new CreativeTabs("tabkuuga")
	{@Override
		public ItemStack createIcon() {
		return new ItemStack(RiderItems.kuugahead);
	}
	};
	
	public static CreativeTabs tabagito = new CreativeTabs("tabagito")
	{
		@Override
		public ItemStack createIcon() {
			return new ItemStack(RiderItems.agitohead);
		}
	};
	public  static CreativeTabs tabryuki = new CreativeTabs("tabryuki")
	{
		@Override
		public ItemStack createIcon() {
			return new ItemStack(RiderItems.ryukihead);
		}
	};
	public static CreativeTabs tabfaiz = new CreativeTabs("tabfaiz")
	{
		@Override
		public ItemStack createIcon() {
			return new ItemStack(RiderItems.faizhead);
		}
	};
	public static CreativeTabs tabblade = new CreativeTabs("tabblade")
	{
		@Override
		public ItemStack createIcon() {
			return new ItemStack(RiderItems.bladehead);
		}
	};
	public static CreativeTabs tabhibiki = new CreativeTabs("tabhibiki")
	{
		@Override
		public ItemStack createIcon() {
			return new ItemStack(RiderItems.hibikihead);
		}
	};
	public static CreativeTabs tabkabuto = new CreativeTabs("tabkabuto")
	{
		@Override
		public ItemStack createIcon() {
			return new ItemStack(RiderItems.kabutohead);
		}
	};
	public static CreativeTabs tabden_o = new CreativeTabs("tabden_o")
	{
		@Override
		public ItemStack createIcon() {
			return new ItemStack(RiderItems.den_ohead);
		}
	};
	public static CreativeTabs tabkiva = new CreativeTabs("tabkiva")
	{
		@Override
		public ItemStack createIcon() {
			return new ItemStack(RiderItems.kivahead);
		}
	};
	public  static CreativeTabs tabdecade = new CreativeTabs("tabdecade")
	{
		@Override
		public ItemStack createIcon() {
			return new ItemStack(RiderItems.decadehead);
		}
	};
	public static CreativeTabs tabW = new CreativeTabs("tabW")
	{
		@Override
		public ItemStack createIcon() {
			return new ItemStack(RiderItems.Whead);
		}
	};
	public static CreativeTabs tabOOO = new CreativeTabs("tabOOO")
	{
		@Override
		public ItemStack createIcon() {
			return new ItemStack(RiderItems.OOOhead);
		}
	};
	public static CreativeTabs tabFourze = new CreativeTabs("tabFourze")
	{
		@Override
		public ItemStack createIcon() {
			return new ItemStack(RiderItems.Fourzehead);
		}
	};
	public static CreativeTabs tabwizard = new CreativeTabs("tabwizard")
	{
		@Override
		public ItemStack createIcon() {
			return new ItemStack(RiderItems.wizardhead);
		}
	};
	public static CreativeTabs tabGaim = new CreativeTabs("tabGaim")
	{
		@Override
		public ItemStack createIcon() {
			return new ItemStack(RiderItems.Gaimhead);
		}
	};
	public static CreativeTabs tabdrive = new CreativeTabs("tabdrive")
	{
		@Override
		public ItemStack createIcon() {
			return new ItemStack(RiderItems.drivehead);
		}
	};
	public static CreativeTabs tabghost = new CreativeTabs("tabghost")
	{
		@Override
		public ItemStack createIcon() {
			return new ItemStack(RiderItems.ghosthead);
		}
	};
	public static CreativeTabs tabex_aid = new CreativeTabs("tabex_aid")
	{
		@Override
		public ItemStack createIcon() {
		return new ItemStack(RiderItems.ex_aidhead);
		}
	};
	public static CreativeTabs tabbuild = new CreativeTabs("tabbuild")
	{
		@Override
		public ItemStack createIcon() {
			return new ItemStack(RiderItems.buildhead);
		}
	};
	public static CreativeTabs tabzi_o = new CreativeTabs("tabzi_o")
	{
		@Override
		public ItemStack createIcon() {
			return new ItemStack(RiderItems.zi_ohead);
		}
	};
	public static CreativeTabs tabzero_one = new CreativeTabs("tabzero_one")
	{
		@Override
		public ItemStack createIcon() {
			return new ItemStack(RiderItems.zero_onehead);
		}
	};
	public static CreativeTabs tabsaber = new CreativeTabs("tabsaber")
	{
		@Override
		public ItemStack createIcon() {
			return new ItemStack(RiderItems.saberhead);
		}
	};
	public static CreativeTabs tabamazons = new CreativeTabs("tabamazons")
	{
		@Override
		public ItemStack createIcon() {
			return new ItemStack(RiderItems.amazonshead);
		}
	};
	public static CreativeTabs tabdecor = new CreativeTabs("tabdecor")
	{
		@Override
		public ItemStack createIcon() {
			return new ItemStack(RiderItems.monitor);
		}
	};
	public static CreativeTabs tabmisc = new CreativeTabs("tabmisc")
	{
		@Override
		public ItemStack createIcon() {
			return new ItemStack(RiderItems.icepop1);
		}
	};
	/**
	public static TAB_MASKED_RIDER tab_masked_rider= new TAB_MASKED_RIDER("tab_masked_rider", RiderItems.masked_rider_head);
	**/
}
