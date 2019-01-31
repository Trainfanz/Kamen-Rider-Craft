package Kamen_Rider_Craft_4TH.blocks;

import java.util.Random;

import Kamen_Rider_Craft_4TH.RiderItems;
import Kamen_Rider_Craft_4TH.TokuCraft_core;
import Kamen_Rider_Craft_4TH.util.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.block.BlockFalling;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ore_block extends Block implements IHasModel
{

	public Item CRYSTAL;
	public ore_block(String string, Material par3Material,Item ore,int lv)
	{
		super(par3Material);
		// TODO Auto-generated constructor stub
		this.setHarvestLevel("pickaxe", lv);
		setHardness(9.9F);
		setLightLevel(0.1f);
		setUnlocalizedName(string);
		setRegistryName(string);
		CRYSTAL = ore;

        TokuCraft_core.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
        TokuCraft_core.BLOCKS.add(this);
	}

	

	/**
	 * Returns the ID of the items to drop on destruction.
	 */
	@Override
	public Item getItemDropped(IBlockState state, Random random, int fortune){

		Random generator = new Random();
		if (CRYSTAL==RiderItems.blank_mission_memory){
			int rand = generator.nextInt(120);
			if (rand<30){
				return RiderItems.faiz_mission_memory;
			}else if (rand<40){
				return RiderItems.kaixa_mission_memory;
			}else if (rand<50){
				return RiderItems.faiz_axel_mission_memory;
			}else if (rand<54){
				return RiderItems.delta_mission_memory;
			}else if (rand<56){
				return RiderItems.psyga_mission_memory;
			}else if (rand<57){
				return RiderItems.orga_mission_memory;
			}else if (rand<60){
				return RiderItems.faiz_blaster_mission_memory;
			}{
				return CRYSTAL;
			}
		
		}if (CRYSTAL==RiderItems.oni_ore){
			int rand = generator.nextInt(200);
			if (rand<30){
				return RiderItems.henshin_onsa;
			}else if (rand<40){
				return RiderItems.henshin_onibue_ibuki;
			}else if (rand<50){
				return RiderItems.henshin_kigen_todoroki;
			}else if (rand<60){
				return RiderItems.henshin_kigen_zanki;
			}else if (rand<63){
				return RiderItems.henshin_kigen_shuki;
			}else if (rand<66){
				return RiderItems.henshin_onsa_danki;
			}else if (rand<69){
				return RiderItems.henshin_onsa_eiki;
			}else if (rand<71){
				return RiderItems.henshin_onibue_shouki;
			}else if (rand<73){
				return RiderItems.henshin_onibue_amaki;
			}else if (rand<74){
				return RiderItems.henshin_onsa_kyoki;
			}else if (rand<76){
				return RiderItems.henshin_onsa_kurenai;
			}else if (rand<77){
				return RiderItems.unfinished_armed_saber;
			}{
				return CRYSTAL;
			}
			

		}if (CRYSTAL==RiderItems.oni_orehell){
			int rand = generator.nextInt(150);
			if (rand<30){
				return RiderItems.henshin_kigen_banki;
			}else if (rand<40){
				return RiderItems.henshin_onibue_toki;
			}else if (rand<50){
				return RiderItems.henshin_onsa_gouki;
			}else if (rand<60){
				return RiderItems.henshin_kigen_sabaki;
			}else if (rand<63){
				return RiderItems.henshin_onsa_kabuki;
			}else if (rand<66){
				return RiderItems.henshin_onsa_touki;
			}else if (rand<69){
				return RiderItems.henshin_onsa_kirameki;
			}else if (rand<71){
				return RiderItems.henshin_onsa_nishiki;
			}else if (rand<73){
				return RiderItems.henshin_onibue_fubuki;
		
			}{
				return CRYSTAL;
			}
		
		}else if (CRYSTAL==RiderItems.mini_zecter){
			int rand = generator.nextInt(130);
			if (rand<30){
				return RiderItems.kabuto_zecter;
			}else if (rand<40){
				return RiderItems.thebee_zecter;
			}else if (rand<50){
				return RiderItems.drake_zecter;
			}else if (rand<60){
				return RiderItems.sasword_zecter;
			}else if (rand<62){
				return RiderItems.hyper_zecter;
			}else if (rand<63){
				return RiderItems.perfectthebee_zecter;
			}else if (rand<64){
				return RiderItems.perfectsasword_zecter;
			}else if (rand<65){
				return RiderItems.perfectdrake_zecter;
			}{
				return CRYSTAL;
			}
		
		}else if (CRYSTAL==RiderItems.unfinished_kabutick_zecter){
			int rand = generator.nextInt(160);
			if (rand<30){
				return RiderItems.gatack_zecter;
			}else if (rand<40){
				return RiderItems.kickhopper_zecter;
			}else if (rand<50){
				return RiderItems.punchhopper_zecter;
			}else if (rand<60){
				return RiderItems.dark_kabuto_zecter;
			}else if (rand<70){
				return RiderItems.caucasus_zecter;
			}else if (rand<80){
				return RiderItems.hercus_zecter;
			}else if (rand<90){
				return RiderItems.ketaros_zecter;
			}{
				return CRYSTAL;
			}
		
		}
		else if (CRYSTAL==RiderItems.blankcard){
			int rand = generator.nextInt(240);
			if (rand<30){
				return RiderItems.decadecard;
			}else if (rand<40){
				return RiderItems.kuugacard;
			}else if (rand<50){
				return RiderItems.agitocard;
			}else if (rand<60){
				return RiderItems.ryukicard;
			}else if (rand<70){
				return RiderItems.faizcard;
			}else if (rand<80){
				return RiderItems.bladecard_de;
			}else if (rand<90){
				return RiderItems.kabutocard;
			}else if (rand<100){
				return RiderItems.kivacard;
			}else if (rand<110){
				return RiderItems.hibikicard;
			}else if (rand<120){
				return RiderItems.den_ocard;
			}else if (rand<122){
				return RiderItems.decadecard_violent_emotion;
			}{
				return CRYSTAL;
			}
			
		}
		else if (CRYSTAL==RiderItems.diendcard){
			int rand = generator.nextInt(50);
			if (rand<30){
				return RiderItems.blankcard;	
			}else if (rand<35){
				return RiderItems.darkdecadecard;	
			}{
				return CRYSTAL;
			}
		
		}
		if (CRYSTAL==RiderItems.imaginsand){
			int rand = generator.nextInt(120);
			if (rand<30){
				return RiderItems.rider_ticket_sword;
			}else if (rand<40){
				return RiderItems.rider_ticket_rod;
			}else if (rand<50){
				return RiderItems.rider_ticket_ax;
			}else if (rand<54){
				return RiderItems.rider_ticket_gun;
			}else if (rand<56){
				return RiderItems.rider_ticket_wing;
			}else if (rand<57){
				return RiderItems.rider_ticket;
			}{
				return CRYSTAL;
			}
			
		}if (CRYSTAL==RiderItems.t2gaiamemory){
			int rand = generator.nextInt(200);
			if (rand<30){
				return RiderItems.accel_memory;
			}else if (rand<40){
				return RiderItems.trial_memory;
			}else if (rand<45){
				return RiderItems.accel_booster_memory;
			}else if (rand<55){
				return RiderItems.eternal_memory;
			}else if (rand<60){
				return RiderItems.eternal_t2_memory;
			}else if (rand<80){
				return RiderItems.joker_t2_memory;
			}else if (rand<85){
				return RiderItems.skull_memory;
			}else if (rand<100){
				return RiderItems.engine_memory;
			}else if (rand<101){
				return RiderItems.shippu_memory;
			}else if (rand<102){
				return RiderItems.kirifuda_memory;
			}else if (rand<103){
				return RiderItems.xtreme_gold_memory;
			}else if (rand<104){
				return RiderItems.xtreme_accel_memory;
			}else if (rand<107){
				return RiderItems.cyclonecyclone_memory;
			}else if (rand<110){
				return RiderItems.jokerjoker_memory;
			}{
				return CRYSTAL;
			}
			
		}
		if (CRYSTAL==RiderItems.rider_ticket_strike){
			int rand = generator.nextInt(220);
			if (rand<70){
				return RiderItems.imaginsand;
			}else if (rand<90){
				return RiderItems.rider_ticket_strike;
			}else if (rand<100){
				return RiderItems.rider_ticket_gaoh;
			}else if (rand<110){
				return RiderItems.zeronos_altair_card;
			}else if (rand<117){
				return RiderItems.zeronos_vega_card;
			}else if (rand<124){
				return RiderItems.zeronos_plat_card;
			}else if (rand<131){
				return RiderItems.rider_ticket_nega;	
			}else if (rand<138){
				return RiderItems.rider_ticket_yuuki;	
			}else if (rand<143){
				return RiderItems.rider_ticket_g;
			}else if (rand<148){
				return RiderItems.zeronos_zero_card;
			}{
				return CRYSTAL;
			}
			
		}if (CRYSTAL==RiderItems.kuuga_growing){
			int rand = generator.nextInt(100);
			if (rand<30){
				return RiderItems.kuuga_mighty;
			}else if (rand<40){
				return RiderItems.kuuga_dragon;
			}else if (rand<50){
				return RiderItems.kuuga_pegasus;
			}else if (rand<60){
				return RiderItems.kuuga_titan;
			}{
				return CRYSTAL;
			}
		}if (CRYSTAL==RiderItems.agito_of_seed){
			int rand = generator.nextInt(180);
			if (rand<30){
				return RiderItems.agito_ground;
			}else if (rand<40){
				return RiderItems.agito_flame;
			}else if (rand<50){
				return RiderItems.agito_storm;
			}else if (rand<55){
				return RiderItems.agito_trinity;
			}else if (rand<58){
				return RiderItems.agito_burning;
			}else if (rand<59){
				return RiderItems.agito_shining;
			}else if (rand<60){
				return RiderItems.agito_miracle;
			}else if (rand<70){
				return RiderItems.gills;
			}else if (rand<72){
				return RiderItems.exceed_gills;
			}else if (rand<77){
				return RiderItems.another_agito;
			}else if (rand<79){
				return RiderItems.another_agito_burning_form;
			}{
				return CRYSTAL;
			}
		}if (CRYSTAL==RiderItems.g3core){
			int rand = generator.nextInt(150);
			if (rand<30){
				return RiderItems.g3mild;
			}else if (rand<40){
				return RiderItems.g3;
			}else if (rand<45){
				return RiderItems.g3x;
			}else if (rand<50){
				return RiderItems.g4;
			}else if (rand<52){
				return RiderItems.g1;	
			}else if (rand<56){
				return RiderItems.g4x;
			}{
				return CRYSTAL;
			}
		}if (CRYSTAL==RiderItems.bladecard){
			int rand = generator.nextInt(200);
			if (rand<30){
				return RiderItems.changebeetle;
			}else if (rand<40){
				return RiderItems.fusion_eagle;
			}else if (rand<50){
				return RiderItems.absorb_capricorn;
			}else if (rand<54){
				return RiderItems.evolution_caucasus;
			}else if (rand<64){
				return RiderItems.change_stag;
			}else if (rand<74){
				return RiderItems.fusion_peacock;
			}else if (rand<78){
				return RiderItems.evolution_giraffa;
			}else if (rand<88){
				return RiderItems.change_spider;
			}else if (rand<98){
				return RiderItems.absorb_serpent;
			}else if (rand<108){
				return RiderItems.change_mantis;
			}else if (rand<112){
				return RiderItems.evolution_paradoxa;
			}{
				return CRYSTAL;
			}
		}if (CRYSTAL==RiderItems.changekerberosglaive){
			int rand = generator.nextInt(200);
			if (rand<30){
				return RiderItems.bladecard;
			}else if (rand<40){
				return RiderItems.changekerberoslance;
			}else if (rand<50){
				return RiderItems.changekerberoslarc;		
			}{
				return CRYSTAL;
			}
		}
		if (CRYSTAL==RiderItems.fuestle){
			int rand = generator.nextInt(120);
			if (rand<30){
				return RiderItems.wakeupfuestle;
			}else if (rand<40){
				return RiderItems.garulufuestle;
			}else if (rand<50){
				return RiderItems.basshaafuestle;
			}else if (rand<54){
				return RiderItems.doggafuestle;
			}else if (rand<56){
				return RiderItems.tatsulot;
			}{
				return CRYSTAL;
			}
			
		}
		if (CRYSTAL==RiderItems.fuestlefake){
			int rand = generator.nextInt(120);
			if (rand<30){
				return RiderItems.knucklefuestle;
			}else if (rand<40){
				return RiderItems.sagafuestle;
			}else if (rand<45){
				return RiderItems.darkwakeupfuestle;
			}else if (rand<50){
				return RiderItems.keyfuestle;	
			}else if (rand<55){
				return RiderItems.newwakeupfuestle;
			}else if (rand<57){
				return RiderItems.risingfuestle;
			}{
				return CRYSTAL;
			}
			
		}
		if (CRYSTAL==RiderItems.astroswitch){
			int rand = generator.nextInt(500);
			if (rand<30){
				return RiderItems.rocket_swich;
			}else if (rand<40){
				return RiderItems.elek_swich;
			}else if (rand<50){
				return RiderItems.fire_swich;
			}else if (rand<55){
				return RiderItems.magnet_swich_n;
			}else if (rand<60){
				return RiderItems.magnet_swich_s;
			}else if (rand<65){
				return RiderItems.cosmic_swich;
			}else if (rand<75){
				return RiderItems.drill_switch;
			}else if (rand<85){
				return RiderItems.launcher_switch;
			}else if (rand<95){
				return RiderItems.radar_switch;
			}else if (rand<105){
				return RiderItems.magic_hand_switch;
			}else if (rand<115){
				return RiderItems.camera_switch;
			}else if (rand<125){
				return RiderItems.parachute_switch;
			}else if (rand<135){
				return RiderItems.chainsaw_switch;
			}else if (rand<145){
				return RiderItems.hopping_switch;
			}else if (rand<150){
				return RiderItems.scissors_switch;
			}else if (rand<155){
				return RiderItems.beat_switch;
			}else if (rand<160){
				return RiderItems.chain_array_switch;
			}else if (rand<165){
				return RiderItems.smoke_switch;
			}else if (rand<170){
				return RiderItems.spike_switch;
			}else if (rand<175){
				return RiderItems.winch_switch;
			}else if (rand<180){
				return RiderItems.flash_switch;
			}else if (rand<185){
				return RiderItems.shield_switch;
			}else if (rand<190){
				return RiderItems.gatling_switch;
			}else if (rand<193){
				return RiderItems.stealth_switch;
			}else if (rand<196){
				return RiderItems.hammer_switch;
			}else if (rand<199){
				return RiderItems.water_switch;
			}else if (rand<202){
				return RiderItems.medical_switch;
			}else if (rand<205){
				return RiderItems.pen_switch;
			}else if (rand<208){
				return RiderItems.wheel_switch;
			}else if (rand<211){
				return RiderItems.screw_switch;
			}else if (rand<214){
				return RiderItems.hand_switch;
			}else if (rand<217){
				return RiderItems.schop_switch;
			}else if (rand<220){
				return RiderItems.freeze_switch;
			}else if (rand<222){
				return RiderItems.claw_switch;
			}else if (rand<224){
				return RiderItems.board_switch;
			}else if (rand<226){
				return RiderItems.giantfoot_switch;
			}else if (rand<228){
				return RiderItems.aero_switch;
			}else if (rand<230){
				return RiderItems.gyro_switch;
			}else if (rand<232){
				return RiderItems.net_switch;
			}else if (rand<234){
				return RiderItems.stamper_switch;
			}else if (rand<260){
				return RiderItems.rocket_swich;
			}{
				return CRYSTAL;
			}	
			
		}
		if (CRYSTAL==RiderItems.gate_switch){
			int rand = generator.nextInt(140);
			if (rand<30){
				return RiderItems.meteor_swich;
			}else if (rand<35){
				return RiderItems.clear_drill_swich;
			}else if (rand<40){
				return RiderItems.nadeshiko_switch;
			}else if (rand<43){
				return RiderItems.super_rocket_swich;
			}else if (rand<46){
				return RiderItems.super_drill_swich;
			}else if (rand<48){
				return RiderItems.meteor_storm_swich;
			}else if (rand<50){
				return RiderItems.solu_switch;
			}else if (rand<52){
				return RiderItems.fusion_swich;
			}else if (rand<53){
				return RiderItems.core_switch;
			}{
				return CRYSTAL;
			}

		}
		if (CRYSTAL==RiderItems.proto_speedshift){
			int rand = generator.nextInt(300);
			if (rand<15){
				return RiderItems.speedshift;
			}else if (rand<25){
				return RiderItems.maxflare;
			}else if (rand<35){
				return RiderItems.funkyspike;
			}else if (rand<45){
				return RiderItems.midnightshadow;
			}else if (rand<55){
				return RiderItems.dream_vegas;
			}else if (rand<65){
				return RiderItems.dimension_cab;
			}else if (rand<75){
				return RiderItems.spin_mixer;
			}else if (rand<85){
				return RiderItems.massive_monster;
			}else if (rand<90){
				return RiderItems.wildshift;
			}else if (rand<95){
				return RiderItems.rumble_dump;
			}else if (rand<100){
				return RiderItems.hooking_wrecker;
			}else if (rand<105){
				return RiderItems.mad_doctor;
			}else if (rand<110){
				return RiderItems.techniqueshift;
			}else if (rand<115){
				return RiderItems.fire_braver;
			}else if (rand<120){
				return RiderItems.road_winter;
			}else if (rand<125){
				return RiderItems.spin_mixer;
			}else if (rand<129){
				return RiderItems.dead_heat;
			}else if (rand<133){
				return RiderItems.formulashift;
			}else if (rand<135){
				return RiderItems.mantarn_f01;
			}else if (rand<137){
				return RiderItems.jacky_f02;
			}else if (rand<138){
				return RiderItems.sparner_f03;
			}else if (rand<139){
				return RiderItems.tridoronshift;
			}else if (rand<144){
				return RiderItems.justice_hunter;
			}else if (rand<149){
				return RiderItems.rolling_gravity;
			}{
				return CRYSTAL;
			}	

		}
		if (CRYSTAL==RiderItems.signal_chaser){
			int rand = generator.nextInt(250);
			if (rand<30){
				return RiderItems.signal_mach;
			}else if (rand<40){
				return RiderItems.signal_kaksarn;
			}else if (rand<50){
				return RiderItems.signal_kikern;
			}else if (rand<60){
				return RiderItems.signal_magarl;
			}else if (rand<70){
				return RiderItems.signal_tomarle;
			}else if (rand<75){
				return RiderItems.tridoron_key;
			}else if (rand<80){
				return RiderItems.burning_solar;
			}else if (rand<85){
				return RiderItems.colorful_commercial;
			}else if (rand<90){
				return RiderItems.deco_traveller;
			}else if (rand<95){
				return RiderItems.amazing_circus;
			}else if (rand<97){
				return RiderItems.shift_ride_crosser;
			}else if (rand<99){
				return RiderItems.heartronshift;
			}else if (rand<105){
				return RiderItems.fruitsshift;
			}else if (rand<110){
				return RiderItems.tokujoka_key;
			}else if (rand<115){
				return RiderItems.shift_next;
			}else if (rand<120){
				return RiderItems.shift_special;
			}else if (rand<125){
				return RiderItems.next_builder;
			}else if (rand<130){
				return RiderItems.next_hunter;
			}else if (rand<135){
				return RiderItems.next_traveller;
			}else if (rand<140){
				return RiderItems.mega_maxflare;
			}else if (rand<145){
				return RiderItems.highspeedshift;
			}else if (rand<150){
				return RiderItems.speedwildtechnicshift;
			}{
				return CRYSTAL;
			}	

		}
		if (CRYSTAL==RiderItems.full_bottle){
			int rand = generator.nextInt(300);
			if (rand<20){
				return RiderItems.rabbit_full_bottle;
			}else if (rand<40){
				return RiderItems.tank_full_bottle;
			}else if (rand<50){
				return RiderItems.gorilla_full_bottle;
			}else if (rand<60){
				return RiderItems.diamond_full_bottle;
			}else if (rand<70){
				return RiderItems.taka_full_bottle;
			}else if (rand<80){
				return RiderItems.gatling_full_bottle;
			}else if (rand<85){
				return RiderItems.ninjya_full_bottle;
			}else if (rand<90){
				return RiderItems.comic_full_bottle;
			}else if (rand<95){
				return RiderItems.rocket_full_bottle;
			}else if (rand<100){
				return RiderItems.panda_full_bottle;
			}else if (rand<110){
				return RiderItems.harinezumi_full_bottle;
			}else if (rand<115){
				return RiderItems.shoubousha_full_bottle;
			}else if (rand<120){
				return RiderItems.lion_full_bottle;
			}else if (rand<130){
				return RiderItems.soujiki_full_bottle;
			}else if (rand<135){
				return RiderItems.lock_full_bottle;
			}else if (rand<145){
				return RiderItems.dragon_full_bottle;
			}else if (rand<150){
				return RiderItems.ressha_full_bottle;
			}else if (rand<155){
				return RiderItems.kaizoku_full_bottle;
			}else if (rand<160){
				return RiderItems.octopus_full_bottle;
			}else if (rand<165){
				return RiderItems.light_full_bottle;
			}else if (rand<166){
				return RiderItems.rabbittank_sparkling_full_bottle;		
			}else if (rand<167){
				return RiderItems.hazard_trigger;		
			}else if (rand<168){
				return RiderItems.low_rabbit_full_bottle;	
			}else if (rand<169){
				return RiderItems.fullfull_bottle_rabbit;		
			}else if (rand<170){
				return RiderItems.genius_full_bottle;	
			}else if (rand<171){
				return RiderItems.rabbit_gold_full_bottle;	
			}else if (rand<172){
				return RiderItems.dragon_silver_full_bottle;	
			}else if (rand<173){
				return RiderItems.cross_z_build_can;
			}{
				return CRYSTAL;
			}
			
		}if (CRYSTAL==RiderItems.sclashjelly){
			int rand = generator.nextInt(300);
			if (rand<10){
				return RiderItems.dragon_sclashjelly;
			}else if (rand<20){
				return RiderItems.robot_sclashjelly;
			}else if (rand<25){
				return RiderItems.kuma_full_bottle;
			}else if (rand<30){
				return RiderItems.televi_full_bottle;
			}else if (rand<35){
				return RiderItems.wolf_full_bottle;
			}else if (rand<40){
				return RiderItems.smartphone_full_bottle;
			}else if (rand<45){
				return RiderItems.phoenix_full_bottle;
			}else if (rand<50){
				return RiderItems.robo_full_bottle;
			}else if (rand<55){
				return RiderItems.cake_full_bottle;
			}else if (rand<60){
				return RiderItems.santa_full_bottle;
			}else if (rand<75){
				return RiderItems.dog_full_bottle;
			}else if (rand<80){
				return RiderItems.mic_full_bottle;
			}else if (rand<85){
				return RiderItems.beetle_full_bottle;
			}else if (rand<90){
				return RiderItems.camera_full_bottle;
			}else if (rand<100){
				return RiderItems.bat_full_bottle;
			}else if (rand<110){
				return RiderItems.cobra_full_bottle;
			}else if (rand<113){
				return RiderItems.castle_full_bottle;
			}else if (rand<116){
				return RiderItems.kuwagata_full_bottle;
			}else if (rand<119){
				return RiderItems.fukurou_full_bottle;
			}else if (rand<124){
				return RiderItems.helicopter_full_bottle;
			}else if (rand<129){
				return RiderItems.rose_full_bottle;
			}else if (rand<134){
				return RiderItems.turtle_full_bottle;
			}else if (rand<139){
				return RiderItems.watch_full_bottle;
			}else if (rand<144){
				return RiderItems.unicorn_full_bottle;
			}else if (rand<149){
				return RiderItems.eraser_full_bottle;
			}else if (rand<154){
				return RiderItems.spider_full_bottle;
			}else if (rand<159){
				return RiderItems.fridge_full_bottle;
			}else if (rand<160){
				return RiderItems.north_blizzard_full_bottle;
			}{
				return CRYSTAL;
			}	
			
		}
		if (CRYSTAL==RiderItems.unfinished_gear){
			int rand = generator.nextInt(300);
			if (rand<10){
				return RiderItems.crocodile_crack_full_bottle;
			}else if (rand<15){
				return RiderItems.tora_full_bottle;
			}else if (rand<20){
				return RiderItems.ufo_full_bottle;
			}else if (rand<25){
				return RiderItems.kujira_full_bottle;
			}else if (rand<30){
				return RiderItems.jet_full_bottle;
			}else if (rand<35){
				return RiderItems.kirin_full_bottle;
			}else if (rand<40){
				return RiderItems.cyclone_full_bottle;		
			}else if (rand<43){
				return RiderItems.gear_engine;		
			}else if (rand<46){
				return RiderItems.gear_remocon;	
			}else if (rand<47){
				return RiderItems.gear_red;	
			}else if (rand<48){
				return RiderItems.gear_blue;	
			}else if (rand<49){
				return RiderItems.dragon_evol_bottle_gold;
			}else if (rand<54){
				return RiderItems.bat_full_bottle_2;
			}else if (rand<59){
				return RiderItems.engine_full_bottle;
			}else if (rand<64){
				return RiderItems.obake_full_bottle;
			}else if (rand<79){
				return RiderItems.same_full_bottle;
			}else if (rand<74){
				return RiderItems.bike_full_bottle;
			}else if (rand<79){
				return RiderItems.magnet_full_bottle;
			}else if (rand<84){
				return RiderItems.hachi_full_bottle;
			}else if (rand<89){
				return RiderItems.submarine_full_bottle;
			}else if (rand<94){
				return RiderItems.penguin_full_bottle;
			}else if (rand<99){
				return RiderItems.skateboard_full_bottle;
			}else if (rand<104){
				return RiderItems.deer_full_bottle;
			}else if (rand<109){
				return RiderItems.pyramid_full_bottle;
			}else if (rand<114){
				return RiderItems.sai_full_bottle;
			}else if (rand<119){
				return RiderItems.dryer_full_bottle;
			}else if (rand<120){
				return RiderItems.prime_rogue_full_bottle;
			}else if (rand<121){
				return RiderItems.muscle_galaxy_full_bottle;

			}{
				return CRYSTAL;
			}	
	
		}if (CRYSTAL==RiderItems.wizardgem){
			int rand = generator.nextInt(200);
			if (rand<10){
				return RiderItems.flame_ring;
			}else if (rand<20){
				return RiderItems.water_ring;
			}else if (rand<30){
				return RiderItems.hurricane_ring;
			}else if (rand<40){
				return RiderItems.land_ring;
			}else if (rand<45){
				return RiderItems.flame_ring_dragon;
			}else if (rand<50){
				return RiderItems.water_ring_dragon;
			}else if (rand<55){
				return RiderItems.hurricane_ring_dragon;
			}else if (rand<60){
				return RiderItems.land_ring_dragon;
			}else if (rand<62){
				return RiderItems.infinity_ring;			
			}else if (rand<64){
				return RiderItems.special_rush_ring;
			}else if (rand<65){
				return RiderItems.finish_strike_ring;
			}else if (rand<66){
				return RiderItems.hope_ring;
			}{
				return CRYSTAL;
			}	

		}if (CRYSTAL==RiderItems.wizardgem2){
			int rand = generator.nextInt(200);
			if (rand<30){
				return RiderItems.beast_ring;
			}else if (rand<40){
				return RiderItems.dolphi_ring;
			}else if (rand<50){
				return RiderItems.falco_ring;
			}else if (rand<60){
				return RiderItems.chameleo_ring;
			}else if (rand<70){
				return RiderItems.buffa_ring;
			}else if (rand<75){
				return RiderItems.hyper_ring;
			}else if (rand<80){
				return RiderItems.mage_b_ring;
			}else if (rand<85){
				return RiderItems.mage_g_ring;
			}else if (rand<90){
				return RiderItems.mage_o_ring;
			}else if (rand<92){
				return RiderItems.sorcerer_ring;
			}else if (rand<94){
				return RiderItems.wiseman_ring;
			}else if (rand<95){
				return RiderItems.black_ring;
			}else if (rand<97){
				return RiderItems.dark_ring;			
			}{
				return CRYSTAL;
			}	

		}
		if (CRYSTAL==RiderItems.himawari_lockseed){
			int rand = generator.nextInt(200);
			if (rand<10){
				return RiderItems.matsubokkuri_lockseed;
			}else if (rand<20){
				return RiderItems.kurumi_lockseed;
			}else if (rand<30){
				return RiderItems.donguri_lockseed;
			}else if (rand<40){
				return RiderItems.melon_lockseed;
			}else if (rand<45){
				return RiderItems.ichigo_lockseed;
			}else if (rand<50){
				return RiderItems.pine_lockseed;
			}else if (rand<55){
				return RiderItems.orange_lockseed;
			}else if (rand<60){
				return RiderItems.banana_lockseed;
			}else if (rand<65){
				return RiderItems.budou_lockseed;
			}else if (rand<67){
				return RiderItems.mango_lockseed;
			}else if (rand<70){
				return RiderItems.durian_lockseed;
			}else if (rand<72){
				return RiderItems.kiwi_lockseed;
			}else if (rand<74){
				return RiderItems.lemon_lockseed;
			}else if (rand<76){
				return RiderItems.watermelon_lockseed;
			}else if (rand<78){
				return RiderItems.forbidden_ringo_lockseed;
			}else if (rand<79){
				return RiderItems.sakura_hurricane;
			}else if (rand<80){
				return RiderItems.rose_attacker;
			}else if (rand<81){
				return RiderItems.suika_lockseed;
			}else if (rand<82){
				return RiderItems.kachidoki_lockseed;
			}else  if (rand<83){
				return RiderItems.kiwami_lockseed;
			}else if (rand<84){
				return RiderItems.fresh_orange_lockseed;
			}else if (rand<85){
				return RiderItems.fresh_pine_lockseed;
			}else if (rand<86){
				return RiderItems.fake_donguri_lockseed;
			}else {
				return CRYSTAL;
			}	

		}
		if (CRYSTAL==RiderItems.himawari_energy_lockseed){
			int rand = generator.nextInt(200);
			if (rand<10){
				return RiderItems.lemon_energy_lockseed;
			}else if (rand<20){
				return RiderItems.cherry_energy_lockseed;
			}else if (rand<30){
				return RiderItems.peach_energy_lockseed;
			}else if (rand<40){
				return RiderItems.melon_energy_lockseed;
			}else if (rand<45){
				return RiderItems.matsubokkuri_energy_lockseed;
			}else if (rand<50){
				return RiderItems.marron_energy_lockseed;
			}else if (rand<55){
				return RiderItems.fifteen_lockseed;
			}else if (rand<60){
				return RiderItems.blood_orange_lockseed;
			}else if (rand<65){
				return RiderItems.silver_ringo_lockseed;
			}else if (rand<67){
				return RiderItems.golden_ringo_lockseed;
			}else if (rand<68){
				return RiderItems.dandeliner;
			}else if (rand<69){
				return RiderItems.tulip_hopper;
			}else if (rand<70){
				return RiderItems.black_ringo_lockseed;
			}else if (rand<72){
				return RiderItems.dragon_fruits_energy_lockseed;
			}else if (rand<74){
				return RiderItems.sid_lockseed;
			}else if (rand<76){
				return RiderItems.zakuro_lockseed;
			}else if (rand<77){
				return RiderItems.black_baron_lockseed;
			}else if (rand<78){
				return RiderItems.dark_lemon_energy_lockseed;
			}else if (rand<80){
				return RiderItems.dark_orange_lockseed;
			}else  if (rand<81){
				return RiderItems.natsumikan_lockseed;
			}else  if (rand<82){
				return RiderItems.maja_lockseed;
			}else if (rand<84){
				return RiderItems.kabi_orange_lockseed;
			}else if (rand<85){
				return RiderItems.yomotsu_heguri_lockseed;
			}else if (rand<86){
				return RiderItems.christmas_lockseed;
			}else if (rand<87){
				return RiderItems.roulette_lockseed;
			}else if (rand<88){
				return RiderItems.xiaolongbao_lockseed;
			}else {
				return CRYSTAL;
			}	

		}
		if (CRYSTAL==RiderItems.ghost_icons){
			int rand = generator.nextInt(300);
			if (rand<30){
				return RiderItems.ore_ghost_icon;
			}else if (rand<40){
				return RiderItems.musashi_ghost_icon;
			}else if (rand<50){
				return RiderItems.edison_ghost_icon;
			}else if (rand<59){
				return RiderItems.robin_ghost_icon;
			}else if (rand<67){
				return RiderItems.newton_ghost_icon;
			}else if (rand<74){
				return RiderItems.billy_the_kid_icon;
			}else if (rand<82){
				return RiderItems.beethoven_icon;
			}else if (rand<88){
				return RiderItems.toucon_boost_icon;
			}else if (rand<94){
				return RiderItems.goemon_icon;
			}else if (rand<102){
				return RiderItems.ryoma_icon;
			}else if (rand<108){
				return RiderItems.specter_ghost_icon;
			}else if (rand<114){
				return RiderItems.tutankhamun_icon;
			}else if (rand<120){
				return RiderItems.nobunaga_icon;
			}else  if (rand<126){
				return RiderItems.benkei_icon;
			}else  if (rand<129){
				return RiderItems.himiko_ghost_icon;
			}else  if (rand<133){
				return RiderItems.houdini_icon;
			}else  if (rand<136){
				return RiderItems.sanzo_icon;
			}else  if (rand<139){
				return RiderItems.grimm_icon;
			}else  if (rand<141){
				return RiderItems.deep_specter_ghost_icon;
			}else  if (rand<142){
				return RiderItems.columbus_icon;
			}else  if (rand<144){
				return RiderItems.darwin_icon;
			}else  if (rand<146){
				return RiderItems.galileo_icon;
			}else  if (rand<148){
				return RiderItems.ikkyu_icon;
			}else  if (rand<150){
				return RiderItems.kamehameha_icon;
			}else  if (rand<152){
				return RiderItems.mugen_icon;
			}else  if (rand<155){
				return RiderItems.napoleon_icon;
			}else  if (rand<157){
				return RiderItems.nightingale_icon;
			}else if (rand<159){
				return RiderItems.pythagoras_icon;
			}else  if (rand<161){
				return RiderItems.shakespeare_icon;
			}else  if (rand<163){
				return RiderItems.da_vinci_ghost_icon;
			}else{
				return CRYSTAL;
			}
		}
		if (CRYSTAL==RiderItems.ghost_gammaicons){
			int rand = generator.nextInt(300);
			if (rand<30){
				return RiderItems.necrom_ghost_icon;
			}else if (rand<40){
				return RiderItems.dark_ghost_icon;
			}else if (rand<50){
				return RiderItems.dark_necrom_blue_ghost_icon;
			}else if (rand<60){
				return RiderItems.dark_necrom_pink_ghost_icon;
			}else if (rand<70){
				return RiderItems.dark_necrom_red_ghost_icon;
			}else if (rand<80){
				return RiderItems.dark_necrom_yellow_ghost_icon;
			}else if (rand<90){
				return RiderItems.zero_specter_ghost_icon;
			}else if (rand<92){
				return RiderItems.santa_icon;
			}else if (rand<94){
				return RiderItems.yujou_burst_icon;
			}else if (rand<102){
				return RiderItems.sin_specter_icon;
			}else if (rand<108){
				return RiderItems.shinsengumi_icon;
			}else if (rand<114){
				return RiderItems.tenkatoitsu_icon;
			}else if (rand<120){
				return RiderItems.special_ore_icon;
			}else if (rand<121){
				return RiderItems.transform_gamma_icon;
			}else if (rand<122){
				return RiderItems.sister_gamma_icon;
			}else if (rand<123){
				return RiderItems.yurusen_gamma_icon;
			}else if (rand<124){
				return RiderItems.knife_gamma_icon;
			}else if (rand<125){
				return RiderItems.royalty_gamma_icon;
			}else{
				return CRYSTAL;
			}
		}
		if (CRYSTAL==RiderItems.blank_gashat){
			int rand = generator.nextInt(300);
			if (rand<30){
				return RiderItems.mighty_action_x_gashat;
			}else if (rand<40){
				return RiderItems.taddle_quest_gashat;
			}else if (rand<50){
				return RiderItems.bang_bang_shooting_gashat;
			}else if (rand<60){
				return RiderItems.bakusou_bike_gashat;
			}else if (rand<67){
				return RiderItems.gekitotsu_robots_gashat;
			}else if (rand<74){
				return RiderItems.doremifa_beat_gashat;
			}else if (rand<81){
				return RiderItems.jet_combat_gashat;
			}else if (rand<88){
				return RiderItems.giri_giri_chambara_gashat;
			}else if (rand<95){
				return RiderItems.shakariki_sports_gashat;
			}else if (rand<100){
				return RiderItems.proto_mighty_action_x_gashat;
			}else if (rand<105){
				return RiderItems.proto_taddle_quest_gashat;
			}else if (rand<110){
				return RiderItems.proto_bang_bang_shooting_gashat;
			}else if (rand<115){
				return RiderItems.proto_bakusou_bike_gashat;
			}else  if (rand<119){
				return RiderItems.proto_gekitotsu_robots_gashat;
			}else  if (rand<123){
				return RiderItems.proto_doremifa_beat_gashat;
			}else  if (rand<127){
				return RiderItems.proto_jet_combat_gashat;
			}else  if (rand<131){
				return RiderItems.proto_giri_giri_chambara_gashat;
			}else  if (rand<135){
				return RiderItems.proto_shakariki_sports_gashat;
			}else  if (rand<137){
				return RiderItems.mighty_brothers_xx_gashat;
			}else  if (rand<140){
				return RiderItems.proto_bakusou_bike_combi_fukkatsu_gashat;
			}else  if (rand<142){
				return RiderItems.proto_mighty_action_x_gashat_origin;
			}else  if (rand<146){
				return RiderItems.ju_ju_burger_gashat;
			}else  if (rand<150){
				return RiderItems.night_of_safari_gashat;
			}else  if (rand<154){
				return RiderItems.drago_knight_hunter_z_gashat;
			}else  if (rand<156){
				return RiderItems.proto_drago_knight_hunter_z_gashat;
			}else  if (rand<158){
				return RiderItems.mighty_creator_vrx_gashat;
			}else  if (rand<159){
				return RiderItems.maximum_mighty_x_gashat;
			}else if (rand<160){
				return RiderItems.hyper_muteki_gashat;
			}else{
				return CRYSTAL;
			}
		}
		if (CRYSTAL==RiderItems.unfinished_kamen_rider_chronicle_gashat){
			int rand = generator.nextInt(260);
			if (rand<20){
				return RiderItems.dangerous_zombie_gashat;
			}else if (rand<30){
				return RiderItems.toki_meki_crisis_gashat;
			}else if (rand<40){
				return RiderItems.kamen_rider_chronicle_gashat;
			}else if (rand<42){
				return RiderItems.doctor_mighty_xx_gashat;
			}else if (rand<47){
				return RiderItems.xevious_gashat;
			}else if (rand<52){
				return RiderItems.pac_adventure_gashat;
			}else if (rand<57){
				return RiderItems.famitsa_gashat;
			}else if (rand<62){
				return RiderItems.galaxian_gashat;
			}else if (rand<67){
				return RiderItems.taiko_no_tatsujin_gashat;
			}else if (rand<87){
				return RiderItems.knock_out_fighter_gashat;
			}else if (rand<97){
				return RiderItems.perfect_puzzle_gashat;
			}else if (rand<100){
				return RiderItems.gabarizing_gashat;
			}else  if (rand<101){
				return RiderItems.bang_bang_tank_gashat;
			}else  if (rand<103){
				return RiderItems.taddle_legacy_gashat;
			}else  if (rand<108){
				return RiderItems.taddle_fantasy_gashat;
			}else  if (rand<113){
				return RiderItems.bang_bang_simulation_gashat;
			}else  if (rand<118){
				return RiderItems.hurricane_ninja_gashat;
			}else  if (rand<119){
				return RiderItems.god_maximum_mighty_x_gashat;
			}else  if (rand<121){
				return RiderItems.gashat_gear_dual_another;
			}else  if (rand<122){
				return RiderItems.gamedeus_hyper_muteki_gashat;
			}else{
				return CRYSTAL;
			}
		}

		if (CRYSTAL==RiderItems.cellmedal){
			int rand = generator.nextInt(180);
			if (rand<10){
				return RiderItems.taka;
			}else if (rand<20){
				return RiderItems.tora;
			}else if (rand<30){
				return RiderItems.batta;
			}else if (rand<35){
				return RiderItems.cheetah;
			}else if (rand<40){
				return RiderItems.kamakiri;
			}else if (rand<44){
				return RiderItems.lion;
			}else if (rand<48){
				return RiderItems.kuwagata;
			}else if (rand<53){
				return RiderItems.sai;
			}else if (rand<55){
				return RiderItems.gorilla;
			}else if (rand<59){
				return RiderItems.zou;
			}else if (rand<61){
				return RiderItems.condor;
			}else if (rand<63){
				return RiderItems.kujaku;
			}else if (rand<65){
				return RiderItems.shachi;
			}else if (rand<67){
				return RiderItems.unagi;
			}else if (rand<69){
				return RiderItems.tako;
			}else if (rand<70){
				return RiderItems.ptera;
			}else if (rand<71){
				return RiderItems.tricera;
			}else if (rand<72){
				return RiderItems.tyranno;
			}else {
				return CRYSTAL;
			}
		}if (CRYSTAL==RiderItems.birth_core){
			int rand = generator.nextInt(180);
			if (rand<30){
				return RiderItems.cellmedal;
			}else if (rand<35){
				return RiderItems.proto_birth_core;
			}else if (rand<40){
				return RiderItems.cobra;
			}else if (rand<45){
				return RiderItems.kame;
			}else if (rand<50){
				return RiderItems.wani;
			}else if (rand<55){
				return RiderItems.panda;
			}else if (rand<60){
				return RiderItems.kangaroo;
			}else if (rand<65){
				return RiderItems.kangaroo2;
			}else if (rand<68){
				return RiderItems.imagin;
			}else if (rand<71){
				return RiderItems.shocker;
			}else if (rand<74){
				return RiderItems.same;
			}else if (rand<77){
				return RiderItems.kujira;
			}else if (rand<80){
				return RiderItems.ookamiuo;
			}else if (rand<85){
				return RiderItems.sasori;
			}else if (rand<90){
				return RiderItems.kani;
			}else if (rand<95){
				return RiderItems.ebi;
			}else if (rand<97){
				return RiderItems.super_taka;
			}else if (rand<99){
				return RiderItems.super_tora;
			}else if (rand<101){
				return RiderItems.super_batta;
			}else if (rand<102){
				return RiderItems.love_core;
			}else if (rand<103){
				return RiderItems.love_core2;
			}else if (rand<104){
				return RiderItems.love_core3;
			}else if (rand<109){
				return RiderItems.shika;
			}else if (rand<114){
				return RiderItems.gazelle;
			}else if (rand<119){
				return RiderItems.ushi;
			}else if (rand<124){
				return RiderItems.seiuchi;
			}else if (rand<129){
				return RiderItems.shirokuma;
			}else if (rand<134){
				return RiderItems.penguin;
			}else if (rand<139){
				return RiderItems.mukade;
			}else if (rand<144){
				return RiderItems.hachi;
			}else if (rand<149){
				return RiderItems.ari;
			}else if (rand<154){
				return RiderItems.ebi_new;
			}else if (rand<159){
				return RiderItems.kani_new;
			}else if (rand<164){
				return RiderItems.sasori_new;
			}else if (rand<169){
				return RiderItems.yadokari;
				
			
			}{
				return CRYSTAL;
			}
		}if (CRYSTAL==RiderItems.blank_watch){
			int rand = generator.nextInt(200);
			if (rand<30){
				return RiderItems.zi_o_ridewatch;
			}else if (rand<35){
				return RiderItems.geiz_ridewatch;
			}else if (rand<40){
				return RiderItems.build_ridewatch;
			}else if (rand<45){
				return RiderItems.exaid_ridewatch;
			}else if (rand<50){
				return RiderItems.ghost_ridewatch;
			}else if (rand<55){
				return RiderItems.drive_ridewatch;
			}else if (rand<60){
				return RiderItems.faiz_ridewatch;
			}else if (rand<65){
				return RiderItems.fourze_ridewatch;
			}else if (rand<70){
				return RiderItems.ryuki_ridewatch;
			}else if (rand<75){
				return RiderItems.wizard_ridewatch;
			}else if (rand<80){
				return RiderItems.ooo_ridewatch;
			}else if (rand<85){
				return RiderItems.kabuto_ridewatch;
			}else if (rand<90){
				return RiderItems.hibiki_ridewatch;
			}else if (rand<95){
				return RiderItems.deno_ridewatch;
			}else if (rand<100){
				return RiderItems.kiva_ridewatch;
			}else if (rand<105){
				return RiderItems.gaim_ridewatch;
			}else if (rand<110){
				return RiderItems.blade_ridewatch;
			}else if (rand<115){
				return RiderItems.agito_ridewatch;
			}else if (rand<118){
				return RiderItems.genm_ridewatch;
			}else if (rand<121){
				return RiderItems.cross_z_ridewatch;
			}else if (rand<124){
				return RiderItems.beast_ridewatch;
			}else if (rand<127){
				return RiderItems.decade_ridewatch;
			}else if (rand<132){
				return RiderItems.w_ridewatch;
			}else if (rand<137){
				return RiderItems.kuuga_ridewatch;
			}else if (rand<139){
				return RiderItems.zi_o_ii_ridewatch;
				
			
			}{
				return CRYSTAL;
			}
		}
		if (CRYSTAL==RiderItems.blank_miridewatch){
			int rand = generator.nextInt(75);
			if (rand<30){
				return RiderItems.woz_miridewatch;
			}else if (rand<35){
				return RiderItems.shinobi_miridewatch;
			}else if (rand<40){
				return RiderItems.quiz_miridewatch;
			}else if (rand<45){
				return RiderItems.kikai_miridewatch;	
			}{
				return CRYSTAL;
			}
			
		}
		if (CRYSTAL==RiderItems.amazon_cell_vial){
			int rand = generator.nextInt(120);
			if (rand<34){
				return RiderItems.condorer_core_alpha;
			}else if (rand<38){
				return RiderItems.condorer_core_omega;
			}else if (rand<40){
				return RiderItems.condorer_core_sigma;
			}else if (rand<42){
				return RiderItems.amazon_injector_neo;
			}else if (rand<44){
				return RiderItems.amazon_injector_new_omega;
			}else if (rand<45){
				return RiderItems.condorer_core_blind_alpha;
			}else {
				return CRYSTAL;
			}	
		}	return CRYSTAL;

	}

	public int getExpDrop(IBlockAccess world, int metadata, int fortune)
	{
		return 5;
	}

	@Override
	public void registerModels() {
		TokuCraft_core.proxy.registerItemRender(Item.getItemFromBlock(this),0,"inventory");
	}

}