package Kamen_Rider_Craft_4TH.blocks;

import Kamen_Rider_Craft_4TH.RiderItems;
import Kamen_Rider_Craft_4TH.TokuCraft_core;
import Kamen_Rider_Craft_4TH.util.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

import java.util.Random;

public class ore_block extends Block implements IHasModel {
	private Item CRYSTAL;

	public ore_block(String string, Material par3Material,Item ore,int lv)
	{
		super(par3Material);
		this.setHarvestLevel("pickaxe", lv);
		setHardness(9.9F);
		setLightLevel(0.1f);
		setTranslationKey(string);
		setRegistryName(string);
		CRYSTAL = ore;

        TokuCraft_core.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
        TokuCraft_core.BLOCKS.add(this);
	}

	/**
	 * Returns the ID of the items to drop on destruction.
	 */
	@Override
	public Item getItemDropped(IBlockState state, Random generator, int fortune){
		if (CRYSTAL == RiderItems.blank_mission_memory){
			int rand = generator.nextInt(120);

			if (rand < 30) return RiderItems.faiz_mission_memory;
			if (rand < 40) return RiderItems.kaixa_mission_memory;
			if (rand < 50) return RiderItems.faiz_axel_mission_memory;
			if (rand < 54) return RiderItems.delta_mission_memory;
			if (rand < 56) return RiderItems.psyga_mission_memory;
			if (rand < 57) return RiderItems.orga_mission_memory;
			if (rand < 60) return RiderItems.faiz_blaster_mission_memory;
			return CRYSTAL;
		}

		if (CRYSTAL == RiderItems.oni_ore){
			int rand = generator.nextInt(200);

			if (rand < 30) return RiderItems.henshin_onsa;
			if (rand < 40) return RiderItems.henshin_onibue_ibuki;
			if (rand < 50) return RiderItems.henshin_kigen_todoroki;
			if (rand < 60) return RiderItems.henshin_kigen_zanki;
			if (rand < 63) return RiderItems.henshin_kigen_shuki;
			if (rand < 66) return RiderItems.henshin_onsa_danki;
			if (rand < 69) return RiderItems.henshin_onsa_eiki;
			if (rand < 71) return RiderItems.henshin_onibue_shouki;
			if (rand < 73) return RiderItems.henshin_onibue_amaki;
			if (rand < 74) return RiderItems.henshin_onsa_kyoki;
			if (rand < 76) return RiderItems.henshin_onsa_kurenai;
			if (rand < 77) return RiderItems.unfinished_armed_saber;
			return CRYSTAL;
		}

		if (CRYSTAL == RiderItems.oni_orehell){
			int rand = generator.nextInt(150);

			if (rand < 30) return RiderItems.henshin_kigen_banki;
			if (rand < 40) return RiderItems.henshin_onibue_toki;
			if (rand < 50) return RiderItems.henshin_onsa_gouki;
			if (rand < 60) return RiderItems.henshin_kigen_sabaki;
			if (rand < 63) return RiderItems.henshin_onsa_kabuki;
			if (rand < 66) return RiderItems.henshin_onsa_touki;
			if (rand < 69) return RiderItems.henshin_onsa_kirameki;
			if (rand < 71) return RiderItems.henshin_onsa_nishiki;
			if (rand < 73) return RiderItems.henshin_onibue_fubuki;
			return CRYSTAL;
		}
		
		if (CRYSTAL == RiderItems.mini_zecter) {
			int rand = generator.nextInt(130);

			if (rand < 30) return RiderItems.kabuto_zecter;
			if (rand < 40) return RiderItems.thebee_zecter;
			if (rand < 50) return RiderItems.drake_zecter;
			if (rand < 60) return RiderItems.sasword_zecter;
			if (rand < 62) return RiderItems.hyper_zecter;
			if (rand < 63) return RiderItems.perfectthebee_zecter;
			if (rand < 64) return RiderItems.perfectsasword_zecter;
			if (rand < 65) return RiderItems.perfectdrake_zecter;
			return CRYSTAL;
		}
		
		if (CRYSTAL == RiderItems.unfinished_kabutick_zecter) {
			int rand = generator.nextInt(160);

			if (rand < 30) return RiderItems.gatack_zecter;
			if (rand < 40) return RiderItems.kickhopper_zecter;
			if (rand < 50) return RiderItems.punchhopper_zecter;
			if (rand < 60) return RiderItems.dark_kabuto_zecter;
			if (rand < 70) return RiderItems.caucasus_zecter;
			if (rand < 80) return RiderItems.hercus_zecter;
			if (rand < 90) return RiderItems.ketaros_zecter;
			return CRYSTAL;
		}

		if (CRYSTAL == RiderItems.blankcard) {
			int rand = generator.nextInt(240);
			
			if (rand < 30) return RiderItems.decadecard;
			if (rand < 40) return RiderItems.kuugacard;
			if (rand < 50) return RiderItems.agitocard;
			if (rand < 60) return RiderItems.ryukicard;
			if (rand < 70) return RiderItems.faizcard;
			if (rand < 80) return RiderItems.bladecard_de;
			if (rand < 90) return RiderItems.kabutocard;
			if (rand < 100) return RiderItems.kivacard;
			if (rand < 110) return RiderItems.hibikicard;
			if (rand < 120) return RiderItems.den_ocard;
			if (rand < 122) return RiderItems.decadecard_violent_emotion;
			return CRYSTAL;

		}

		if (CRYSTAL == RiderItems.diendcard) {
			int rand = generator.nextInt(50);

			if (rand < 30) return RiderItems.blankcard;
			if (rand < 35) return RiderItems.darkdecadecard;
			return CRYSTAL;
		}

		
/**
		if (CRYSTAL == RiderItems.imaginsand){
			int rand = generator.nextInt(120);

			if (rand < 30) return RiderItems.rider_ticket_sword;
			if (rand < 40) return RiderItems.rider_ticket_rod;
			if (rand < 50) return RiderItems.rider_ticket_ax;
			if (rand < 54) return RiderItems.rider_ticket_gun;
			if (rand < 56) return RiderItems.rider_ticket_wing;
			if (rand < 57) return RiderItems.rider_ticket;
			return CRYSTAL;

		}
				if (CRYSTAL == RiderItems.rider_ticket_strike){
			int rand = generator.nextInt(220);

			if (rand < 70) return RiderItems.imaginsand;
			if (rand < 90) return RiderItems.rider_ticket_strike;
			if (rand < 100) return RiderItems.rider_ticket_gaoh;
			if (rand < 110) return RiderItems.zeronos_altair_card;
			if (rand < 117) return RiderItems.zeronos_vega_card;
			if (rand < 124) return RiderItems.zeronos_plat_card;
			if (rand < 131) return RiderItems.rider_ticket_nega;
			if (rand < 138) return RiderItems.rider_ticket_yuuki;
			if (rand < 143) return RiderItems.rider_ticket_g;
			if (rand < 148) return RiderItems.zeronos_zero_card;
			return CRYSTAL;
		}
**/
		


		if (CRYSTAL == RiderItems.kuuga_growing){
			int rand = generator.nextInt(100);

			if (rand < 30) return RiderItems.kuuga_mighty;
			if (rand < 40) return RiderItems.kuuga_dragon;
			if (rand < 50) return RiderItems.kuuga_pegasus;
			if (rand < 60) return RiderItems.kuuga_titan;
			return CRYSTAL;
		}

		if (CRYSTAL == RiderItems.agito_of_seed){
			int rand = generator.nextInt(180);

			if (rand < 30) return RiderItems.agito_ground;
			if (rand < 40) return RiderItems.agito_flame;
			if (rand < 50) return RiderItems.agito_storm;
			if (rand < 55) return RiderItems.agito_trinity;
			if (rand < 58) return RiderItems.agito_burning;
			if (rand < 59) return RiderItems.agito_shining;
			if (rand < 60) return RiderItems.agito_miracle;
			if (rand < 70) return RiderItems.gills;
			if (rand < 72) return RiderItems.exceed_gills;
			if (rand < 77) return RiderItems.another_agito;
			if (rand < 79) return RiderItems.another_agito_burning_form;
			return CRYSTAL;
		}

		if (CRYSTAL == RiderItems.g3core){
			int rand = generator.nextInt(150);

			if (rand < 30) return RiderItems.g3mild;
			if (rand < 40) return RiderItems.g3;
			if (rand < 45) return RiderItems.g3x;
			if (rand < 50) return RiderItems.g4;
			if (rand < 52) return RiderItems.g1;
			if (rand < 56) return RiderItems.g4x;
			return CRYSTAL;
		}

		if (CRYSTAL == RiderItems.bladecard){
			int rand = generator.nextInt(200);

			if (rand < 30) return RiderItems.changebeetle;
			if (rand < 40) return RiderItems.fusion_eagle;
			if (rand < 50) return RiderItems.absorb_capricorn;
			if (rand < 54) return RiderItems.evolution_caucasus;
			if (rand < 64) return RiderItems.change_stag;
			if (rand < 74) return RiderItems.fusion_peacock;
			if (rand < 78) return RiderItems.evolution_giraffa;
			if (rand < 88) return RiderItems.change_spider;
			if (rand < 98) return RiderItems.absorb_serpent;
			if (rand < 108) return RiderItems.change_mantis;
			if (rand < 112) return RiderItems.evolution_paradoxa;
			return CRYSTAL;
		}

		if (CRYSTAL==RiderItems.changekerberosglaive){
			int rand = generator.nextInt(200);

			if (rand < 30) return RiderItems.bladecard;
			if (rand < 40) return RiderItems.changekerberoslance;
			if (rand < 50) return RiderItems.changekerberoslarc;
			return CRYSTAL;
		}

		if (CRYSTAL==RiderItems.fuestle){
			int rand = generator.nextInt(120);
			if (rand < 30) return RiderItems.wakeupfuestle;
			if (rand < 40) return RiderItems.garulufuestle;
			if (rand < 50) return RiderItems.basshaafuestle;
			if (rand < 54) return RiderItems.doggafuestle;
			if (rand < 56) return RiderItems.tatsulot;
			return CRYSTAL;
		}

		if (CRYSTAL == RiderItems.fuestlefake){
			int rand = generator.nextInt(120);
			if (rand < 30) return RiderItems.knucklefuestle;
			if (rand < 40) return RiderItems.sagafuestle;
			if (rand < 45) return RiderItems.darkwakeupfuestle;
			if (rand < 50) return RiderItems.keyfuestle;
			if (rand < 55) return RiderItems.newwakeupfuestle;
			if (rand < 57) return RiderItems.risingfuestle;
			return CRYSTAL;
		}

		if (CRYSTAL == RiderItems.astroswitch){
			int rand = generator.nextInt(500);

			if (rand < 30) return RiderItems.rocket_swich;
			if (rand < 40) return RiderItems.elek_swich;
			if (rand < 50) return RiderItems.fire_swich;
			if (rand < 55) return RiderItems.magnet_swich_n;
			if (rand < 60) return RiderItems.magnet_swich_s;
			if (rand < 65) return RiderItems.cosmic_swich;
			if (rand < 75) return RiderItems.drill_switch;
			if (rand < 85) return RiderItems.launcher_switch;
			if (rand < 95) return RiderItems.radar_switch;
			if (rand < 105) return RiderItems.magic_hand_switch;
			if (rand < 115) return RiderItems.camera_switch;
			if (rand < 125) return RiderItems.parachute_switch;
			if (rand < 135) return RiderItems.chainsaw_switch;
			if (rand < 145) return RiderItems.hopping_switch;
			if (rand < 150) return RiderItems.scissors_switch;
			if (rand < 155) return RiderItems.beat_switch;
			if (rand < 160) return RiderItems.chain_array_switch;
			if (rand < 165) return RiderItems.smoke_switch;
			if (rand < 170) return RiderItems.spike_switch;
			if (rand < 175) return RiderItems.winch_switch;
			if (rand < 180) return RiderItems.flash_switch;
			if (rand < 185) return RiderItems.shield_switch;
			if (rand < 190) return RiderItems.gatling_switch;
			if (rand < 193) return RiderItems.stealth_switch;
			if (rand < 196) return RiderItems.hammer_switch;
			if (rand < 199) return RiderItems.water_switch;
			if (rand < 202) return RiderItems.medical_switch;
			if (rand < 205) return RiderItems.pen_switch;
			if (rand < 208) return RiderItems.wheel_switch;
			if (rand < 211) return RiderItems.screw_switch;
			if (rand < 214) return RiderItems.hand_switch;
			if (rand < 217) return RiderItems.schop_switch;
			if (rand < 220) return RiderItems.freeze_switch;
			if (rand < 222) return RiderItems.claw_switch;
			if (rand < 224) return RiderItems.board_switch;
			if (rand < 226) return RiderItems.giantfoot_switch;
			if (rand < 228) return RiderItems.aero_switch;
			if (rand < 230) return RiderItems.gyro_switch;
			if (rand < 232) return RiderItems.net_switch;
			if (rand < 234) return RiderItems.stamper_switch;
			if (rand < 260) return RiderItems.rocket_swich;
			return CRYSTAL;
		}

		if (CRYSTAL == RiderItems.gate_switch){
			int rand = generator.nextInt(140);

			if (rand < 30) return RiderItems.meteor_swich;
			if (rand < 35) return RiderItems.clear_drill_swich;
			if (rand < 40) return RiderItems.nadeshiko_switch;
			if (rand < 43) return RiderItems.super_rocket_swich;
			if (rand < 46) return RiderItems.super_drill_swich;
			if (rand < 48) return RiderItems.meteor_storm_swich;
			if (rand < 50) return RiderItems.solu_switch;
			if (rand < 52) return RiderItems.fusion_swich;
			if (rand < 53) return RiderItems.core_switch;
			return CRYSTAL;
		}

		if (CRYSTAL == RiderItems.proto_speedshift){
			int rand = generator.nextInt(300);

			if (rand < 15) return RiderItems.speedshift;
			if (rand < 25) return RiderItems.maxflare;
			if (rand < 35) return RiderItems.funkyspike;
			if (rand < 45) return RiderItems.midnightshadow;
			if (rand < 55) return RiderItems.dream_vegas;
			if (rand < 65) return RiderItems.dimension_cab;
			if (rand < 75) return RiderItems.spin_mixer;
			if (rand < 85) return RiderItems.massive_monster;
			if (rand < 90) return RiderItems.wildshift;
			if (rand < 95) return RiderItems.rumble_dump;
			if (rand < 100) return RiderItems.hooking_wrecker;
			if (rand < 105) return RiderItems.mad_doctor;
			if (rand < 110) return RiderItems.techniqueshift;
			if (rand < 115) return RiderItems.fire_braver;
			if (rand < 120) return RiderItems.road_winter;
			if (rand < 125) return RiderItems.spin_mixer;
			if (rand < 129) return RiderItems.dead_heat;
			if (rand < 133) return RiderItems.formulashift;
			if (rand < 135) return RiderItems.mantarn_f01;
			if (rand < 137) return RiderItems.jacky_f02;
			if (rand < 138) return RiderItems.sparner_f03;
			if (rand < 139) return RiderItems.tridoronshift;
			if (rand < 144) return RiderItems.justice_hunter;
			if (rand < 149) return RiderItems.rolling_gravity;
			return CRYSTAL;
		}

		if (CRYSTAL==RiderItems.signal_chaser){
			int rand = generator.nextInt(250);

			if (rand < 30) return RiderItems.signal_mach;
			if (rand < 40) return RiderItems.signal_kaksarn;
			if (rand < 50) return RiderItems.signal_kikern;
			if (rand < 60) return RiderItems.signal_magarl;
			if (rand < 70) return RiderItems.signal_tomarle;
			if (rand < 75) return RiderItems.tridoron_key;
			if (rand < 80) return RiderItems.burning_solar;
			if (rand < 85) return RiderItems.colorful_commercial;
			if (rand < 90) return RiderItems.deco_traveller;
			if (rand < 95) return RiderItems.amazing_circus;
			if (rand < 97) return RiderItems.shift_ride_crosser;
			if (rand < 99) return RiderItems.heartronshift;
			if (rand < 105) return RiderItems.fruitsshift;
			if (rand < 110) return RiderItems.tokujoka_key;
			if (rand < 115) return RiderItems.shift_next;
			if (rand < 120) return RiderItems.shift_special;
			if (rand < 125) return RiderItems.next_builder;
			if (rand < 130) return RiderItems.next_hunter;
			if (rand < 135) return RiderItems.next_traveller;
			if (rand < 140) return RiderItems.mega_maxflare;
			if (rand < 145) return RiderItems.highspeedshift;
			if (rand < 150) return RiderItems.speedwildtechnicshift;
			return CRYSTAL;
		}


		if (CRYSTAL == RiderItems.wizardgem){
			int rand = generator.nextInt(200);

			if (rand < 10) return RiderItems.flame_ring;
			if (rand < 20) return RiderItems.water_ring;
			if (rand < 30) return RiderItems.hurricane_ring;
			if (rand < 40) return RiderItems.land_ring;
			if (rand < 45) return RiderItems.flame_ring_dragon;
			if (rand < 50) return RiderItems.water_ring_dragon;
			if (rand < 55) return RiderItems.hurricane_ring_dragon;
			if (rand < 60) return RiderItems.land_ring_dragon;
			if (rand < 62) return RiderItems.infinity_ring;
			if (rand < 64) return RiderItems.special_rush_ring;
			if (rand < 65) return RiderItems.finish_strike_ring;
			if (rand < 66) return RiderItems.hope_ring;
			return CRYSTAL;
		}

		if (CRYSTAL == RiderItems.wizardgem2){
			int rand = generator.nextInt(200);

			if (rand < 30) return RiderItems.beast_ring;
			if (rand < 40) return RiderItems.dolphi_ring;
			if (rand < 50) return RiderItems.falco_ring;
			if (rand < 60) return RiderItems.chameleo_ring;
			if (rand < 70) return RiderItems.buffa_ring;
			if (rand < 75) return RiderItems.hyper_ring;
			if (rand < 80) return RiderItems.mage_b_ring;
			if (rand < 85) return RiderItems.mage_g_ring;
			if (rand < 90) return RiderItems.mage_o_ring;
			if (rand < 92) return RiderItems.sorcerer_ring;
			if (rand < 94) return RiderItems.wiseman_ring;
			if (rand < 95) return RiderItems.black_ring;
			if (rand < 97) return RiderItems.dark_ring;
			return CRYSTAL;
		}


		if (CRYSTAL == RiderItems.ghost_icons) {
			int rand = generator.nextInt(300);

			if (rand < 30) return RiderItems.ore_ghost_icon;
			if (rand < 40) return RiderItems.musashi_ghost_icon;
			if (rand < 50) return RiderItems.edison_ghost_icon;
			if (rand < 59) return RiderItems.robin_ghost_icon;
			if (rand < 67) return RiderItems.newton_ghost_icon;
			if (rand < 74) return RiderItems.billy_the_kid_icon;
			if (rand < 82) return RiderItems.beethoven_icon;
			if (rand < 88) return RiderItems.toucon_boost_icon;
			if (rand < 94) return RiderItems.goemon_icon;
			if (rand < 102) return RiderItems.ryoma_icon;
			if (rand < 108) return RiderItems.specter_ghost_icon;
			if (rand < 114) return RiderItems.tutankhamun_icon;
			if (rand < 120) return RiderItems.nobunaga_icon;
			if (rand < 126) return RiderItems.benkei_icon;
			if (rand < 129) return RiderItems.himiko_ghost_icon;
			if (rand < 133) return RiderItems.houdini_icon;
			if (rand < 136) return RiderItems.sanzo_icon;
			if (rand < 139) return RiderItems.grimm_icon;
			if (rand < 141) return RiderItems.deep_specter_ghost_icon;
			if (rand < 142) return RiderItems.columbus_icon;
			if (rand < 144) return RiderItems.darwin_icon;
			if (rand < 146) return RiderItems.galileo_icon;
			if (rand < 148) return RiderItems.ikkyu_icon;
			if (rand < 150) return RiderItems.kamehameha_icon;
			if (rand < 152) return RiderItems.mugen_icon;
			if (rand < 155) return RiderItems.napoleon_icon;
			if (rand < 157) return RiderItems.nightingale_icon;
			if (rand < 159) return RiderItems.pythagoras_icon;
			if (rand < 161) return RiderItems.shakespeare_icon;
			if (rand < 163) return RiderItems.da_vinci_ghost_icon;
			return CRYSTAL;
		}

		if (CRYSTAL == RiderItems.ghost_gammaicons){
			int rand = generator.nextInt(300);

			if (rand < 30) return RiderItems.necrom_ghost_icon;
			if (rand < 40) return RiderItems.dark_ghost_icon;
			if (rand < 50) return RiderItems.dark_necrom_blue_ghost_icon;
			if (rand < 60) return RiderItems.dark_necrom_pink_ghost_icon;
			if (rand < 70) return RiderItems.dark_necrom_red_ghost_icon;
			if (rand < 80) return RiderItems.dark_necrom_yellow_ghost_icon;
			if (rand < 90) return RiderItems.zero_specter_ghost_icon;
			if (rand < 92) return RiderItems.santa_icon;
			if (rand < 94) return RiderItems.yujou_burst_icon;
			if (rand < 102) return RiderItems.sin_specter_icon;
			if (rand < 108) return RiderItems.shinsengumi_icon;
			if (rand < 114) return RiderItems.tenkatoitsu_icon;
			if (rand < 120) return RiderItems.special_ore_icon;
			if (rand < 121) return RiderItems.transform_gamma_icon;
			if (rand < 122) return RiderItems.sister_gamma_icon;
			if (rand < 123) return RiderItems.yurusen_gamma_icon;
			if (rand < 124) return RiderItems.knife_gamma_icon;
			if (rand < 125) return RiderItems.royalty_gamma_icon;
			return CRYSTAL;
		}


		if (CRYSTAL == RiderItems.cellmedal){
			int rand = generator.nextInt(180);

			if (rand < 10) return RiderItems.taka;
			if (rand < 20) return RiderItems.tora;
			if (rand < 30) return RiderItems.batta;
			if (rand < 35) return RiderItems.cheetah;
			if (rand < 40) return RiderItems.kamakiri;
			if (rand < 44) return RiderItems.lion;
			if (rand < 48) return RiderItems.kuwagata;
			if (rand < 53) return RiderItems.sai;
			if (rand < 55) return RiderItems.gorilla;
			if (rand < 59) return RiderItems.zou;
			if (rand < 61) return RiderItems.condor;
			if (rand < 63) return RiderItems.kujaku;
			if (rand < 65) return RiderItems.shachi;
			if (rand < 67) return RiderItems.unagi;
			if (rand < 69) return RiderItems.tako;
			if (rand < 70) return RiderItems.ptera;
			if (rand < 71) return RiderItems.tricera;
			if (rand < 72) return RiderItems.tyranno;
			return CRYSTAL;
		}

		if (CRYSTAL == RiderItems.birth_core){
			int rand = generator.nextInt(180);

			if (rand < 30) return RiderItems.cellmedal;
			if (rand < 35) return RiderItems.proto_birth_core;
			if (rand < 40) return RiderItems.cobra;
			if (rand < 45) return RiderItems.kame;
			if (rand < 50) return RiderItems.wani;
			if (rand < 55) return RiderItems.panda;
			if (rand < 60) return RiderItems.kangaroo;
			if (rand < 65) return RiderItems.kangaroo2;
			if (rand < 68) return RiderItems.imagin;
			if (rand < 71) return RiderItems.shocker;
			if (rand < 74) return RiderItems.same;
			if (rand < 77) return RiderItems.kujira;
			if (rand < 80) return RiderItems.ookamiuo;
			if (rand < 85) return RiderItems.sasori;
			if (rand < 90) return RiderItems.kani;
			if (rand < 95) return RiderItems.ebi;
			if (rand < 97) return RiderItems.super_taka;
			if (rand < 99) return RiderItems.super_tora;
			if (rand < 101) return RiderItems.super_batta;
			if (rand < 102) return RiderItems.love_core;
			if (rand < 103) return RiderItems.love_core2;
			if (rand < 104) return RiderItems.love_core3;
			if (rand < 109) return RiderItems.shika;
			if (rand < 114) return RiderItems.gazelle;
			if (rand < 119) return RiderItems.ushi;
			if (rand < 124) return RiderItems.seiuchi;
			if (rand < 129) return RiderItems.shirokuma;
			if (rand < 134) return RiderItems.penguin;
			if (rand < 139) return RiderItems.mukade;
			if (rand < 144) return RiderItems.hachi;
			if (rand < 149) return RiderItems.ari;
			if (rand < 154) return RiderItems.ebi_new;
			if (rand < 159) return RiderItems.kani_new;
			if (rand < 164) return RiderItems.sasori_new;
			if (rand < 169) return RiderItems.yadokari;
			return CRYSTAL;
		}

		if (CRYSTAL == RiderItems.blank_watch){
			int rand = generator.nextInt(200);

			if (rand < 30) return RiderItems.zi_o_ridewatch;
			if (rand < 35) return RiderItems.geiz_ridewatch;
			if (rand < 40) return RiderItems.build_ridewatch;
			if (rand < 45) return RiderItems.exaid_ridewatch;
			if (rand < 50) return RiderItems.ghost_ridewatch;
			if (rand < 55) return RiderItems.drive_ridewatch;
			if (rand < 60) return RiderItems.faiz_ridewatch;
			if (rand < 65) return RiderItems.fourze_ridewatch;
			if (rand < 70) return RiderItems.ryuki_ridewatch;
			if (rand < 75) return RiderItems.wizard_ridewatch;
			if (rand < 80) return RiderItems.ooo_ridewatch;
			if (rand < 85) return RiderItems.kabuto_ridewatch;
			if (rand < 90) return RiderItems.hibiki_ridewatch;
			if (rand < 95) return RiderItems.deno_ridewatch;
			if (rand < 100) return RiderItems.kiva_ridewatch;
			if (rand < 105) return RiderItems.gaim_ridewatch;
			if (rand < 110) return RiderItems.blade_ridewatch;
			if (rand < 115) return RiderItems.agito_ridewatch;
			if (rand < 118) return RiderItems.genm_ridewatch;
			if (rand < 121) return RiderItems.cross_z_ridewatch;
			if (rand < 124) return RiderItems.beast_ridewatch;
			if (rand < 127) return RiderItems.decade_ridewatch;
			if (rand < 132) return RiderItems.w_ridewatch;
			if (rand < 137) return RiderItems.kuuga_ridewatch;
			if (rand < 139) return RiderItems.zi_o_ii_ridewatch;
			return CRYSTAL;
		}

		if (CRYSTAL == RiderItems.blank_miridewatch){
			int rand = generator.nextInt(120);

			if (rand < 30) return RiderItems.woz_miridewatch;
			if (rand < 35) return RiderItems.shinobi_miridewatch;
			if (rand < 40) return RiderItems.quiz_miridewatch;
			if (rand < 45) return RiderItems.kikai_miridewatch;
			if (rand < 48) return RiderItems.shuriken_starter;
			if (rand < 51) return RiderItems.shuriken_starter_hattari;
			if (rand < 54) return RiderItems.quiz_topper;
			if (rand < 57) return RiderItems.spannerder_screwder;
			if (rand < 60) return RiderItems.ginga_globe;
			return CRYSTAL;

		}

		if (CRYSTAL == RiderItems.amazon_cell_vial){
			int rand = generator.nextInt(120);

			if (rand < 34) return RiderItems.condorer_core_alpha;
			if (rand < 38) return RiderItems.condorer_core_omega;
			if (rand < 40) return RiderItems.condorer_core_sigma;
			if (rand < 42) return RiderItems.amazon_injector_neo;
			if (rand < 44) return RiderItems.amazon_injector_new_omega;
			if (rand < 45) return RiderItems.condorer_core_blind_alpha;
			return CRYSTAL;
		}

		return CRYSTAL;

	}

	@Override
	public int getExpDrop(IBlockState state, IBlockAccess world, BlockPos pos, int fortune) {
		return 5;
	}

	@Override
	public void registerModels() {
		TokuCraft_core.proxy.registerItemRender(Item.getItemFromBlock(this),0,"inventory");
	}

}