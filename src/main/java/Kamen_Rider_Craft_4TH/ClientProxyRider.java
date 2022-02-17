package Kamen_Rider_Craft_4TH;


import javax.swing.text.html.parser.Entity;

import com.jcraft.jorbis.Block;

import Kamen_Rider_Craft_4TH.mobs.EntityAnkh;
import Kamen_Rider_Craft_4TH.mobs.EntityIS;
import Kamen_Rider_Craft_4TH.mobs.EntityKintaros;
import Kamen_Rider_Craft_4TH.mobs.EntityLazer;
import Kamen_Rider_Craft_4TH.mobs.EntityMomotaros;
import Kamen_Rider_Craft_4TH.mobs.EntityPoppy;
import Kamen_Rider_Craft_4TH.mobs.EntityRyutaros;
import Kamen_Rider_Craft_4TH.mobs.EntityUrataros;
import Kamen_Rider_Craft_4TH.mobs.EntityVice;
import Kamen_Rider_Craft_4TH.mobs.Entity_kodama_suika_arms;
import Kamen_Rider_Craft_4TH.mobs.Entity_ridevendor_vending;
import Kamen_Rider_Craft_4TH.mobs.Entityaccel;
import Kamen_Rider_Craft_4TH.mobs.RenderRiderMob;
import Kamen_Rider_Craft_4TH.mobs.RenderRiderMob2;
import Kamen_Rider_Craft_4TH.mobs.entity_batta_can;
import Kamen_Rider_Craft_4TH.mobs.entity_gorilla_can;
import Kamen_Rider_Craft_4TH.mobs.entity_kujaku_can;
import Kamen_Rider_Craft_4TH.mobs.entity_ptera_can;
import Kamen_Rider_Craft_4TH.mobs.entity_taka_can;
import Kamen_Rider_Craft_4TH.mobs.entity_tako_can;
import Kamen_Rider_Craft_4TH.mobs.entity_tora_can;
import Kamen_Rider_Craft_4TH.mobs.entity_tricera_can;
import Kamen_Rider_Craft_4TH.mobs.entity_unagi_can;
import Kamen_Rider_Craft_4TH.mobs.Boss.EntityChronos;
import Kamen_Rider_Craft_4TH.mobs.Henchmen.Entity_giger;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_Arc_zero;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_BloodStalk;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_Build_RT;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_Duke;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_Durendal;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_EngineBros;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_Eternal;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_Evil;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_Falchion;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_Ginga;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_HellBros;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_Kaiser;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_KaiserReverse;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_Marika;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_NightRogue;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_Para_dx;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_Red_Poppy;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_RemoconBros;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_Sabela;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_Sigurd;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_Solomon;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_White_Woz;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_ZangetsuShin;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_ankh_complete;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_ankh_lost;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_another_build;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_bikaiser;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_clay_doll_dopant;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_core;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_demushu;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_dodomagia;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_evolt;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_evolt_2;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_evolt_3;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_gamel;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_gaoh;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_genm;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_grease;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_horobi;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_ikazuchi;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_jin;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_kazari;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_legeiel;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_legeiel_forbidden;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_lord_baron;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_magia;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_mezool;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_muchiri;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_naki;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_nazca_dopant;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_orga;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_poseidon;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_power_up_core;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_red_nazca_dopant;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_redyue;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_roshuo;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_shocker_riders;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_storious;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_super_gingaoh;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_taboo_dopant;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_uva;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_zooous;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_zooous_predator;
import Kamen_Rider_Craft_4TH.mobs.Boss.entity_abaddon_high;
import Kamen_Rider_Craft_4TH.mobs.Boss.entity_blood;
import Kamen_Rider_Craft_4TH.mobs.Boss.entity_charybdis_hercules;
import Kamen_Rider_Craft_4TH.mobs.Boss.entity_desast;
import Kamen_Rider_Craft_4TH.mobs.Boss.entity_dire_wolf_sold_magia;
import Kamen_Rider_Craft_4TH.mobs.Boss.entity_eden;
import Kamen_Rider_Craft_4TH.mobs.Boss.entity_killbus;
import Kamen_Rider_Craft_4TH.mobs.Boss.entity_metal_build;
import Kamen_Rider_Craft_4TH.mobs.Boss.entity_raider;
import Kamen_Rider_Craft_4TH.mobs.Boss.entity_serval_tiger_sold_magia;
import Kamen_Rider_Craft_4TH.mobs.Boss.entity_storious_rider;
import Kamen_Rider_Craft_4TH.mobs.Boss.entity_zaia;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_Calibur;
import Kamen_Rider_Craft_4TH.mobs.Henchmen.EntityBugsterVirus;
import Kamen_Rider_Craft_4TH.mobs.Henchmen.EntityByakkoInves;
import Kamen_Rider_Craft_4TH.mobs.Henchmen.EntityElementaryInvesBlue;
import Kamen_Rider_Craft_4TH.mobs.Henchmen.EntityElementaryInvesGreen;
import Kamen_Rider_Craft_4TH.mobs.Henchmen.EntityElementaryInvesRed;
import Kamen_Rider_Craft_4TH.mobs.Henchmen.EntityHekijaInves;
import Kamen_Rider_Craft_4TH.mobs.Henchmen.EntityKurokageTroopers;
import Kamen_Rider_Craft_4TH.mobs.Henchmen.EntityMasquerade;
import Kamen_Rider_Craft_4TH.mobs.Henchmen.EntityNebulaBugsterVirus;
import Kamen_Rider_Craft_4TH.mobs.Henchmen.EntityRidePlayer;
import Kamen_Rider_Craft_4TH.mobs.Henchmen.EntityRiotrooper;
import Kamen_Rider_Craft_4TH.mobs.Henchmen.EntityShimi;
import Kamen_Rider_Craft_4TH.mobs.Henchmen.Entity_foundation_x_masquerade;
import Kamen_Rider_Craft_4TH.mobs.Henchmen.Entity_giff_junior;
import Kamen_Rider_Craft_4TH.mobs.Henchmen.Entity_hard_guardian;
import Kamen_Rider_Craft_4TH.mobs.Henchmen.Entity_knight_soldier;
import Kamen_Rider_Craft_4TH.mobs.Henchmen.Entity_magiadodo_chick;
import Kamen_Rider_Craft_4TH.mobs.Henchmen.Entity_needle_smash;
import Kamen_Rider_Craft_4TH.mobs.Henchmen.Entity_trilobite_magia;
import Kamen_Rider_Craft_4TH.mobs.Henchmen.Entity_yummy;
import Kamen_Rider_Craft_4TH.mobs.Henchmen.Entity_zu_gumun_ba;
import Kamen_Rider_Craft_4TH.mobs.Henchmen.Entitydestron_combatman;
import Kamen_Rider_Craft_4TH.mobs.Henchmen.Entitygamma_commando;
import Kamen_Rider_Craft_4TH.mobs.Henchmen.Entitygod_warfare_agent;
import Kamen_Rider_Craft_4TH.mobs.Henchmen.Entityguardian;
import Kamen_Rider_Craft_4TH.mobs.Henchmen.Entityguardian_hokuto;
import Kamen_Rider_Craft_4TH.mobs.Henchmen.Entityguardian_seito;
import Kamen_Rider_Craft_4TH.mobs.Henchmen.Entitynew_mole_imagin;
import Kamen_Rider_Craft_4TH.mobs.Henchmen.Entitynew_mole_imagin_sand;
import Kamen_Rider_Craft_4TH.mobs.Henchmen.Entityred_follower;
import Kamen_Rider_Craft_4TH.mobs.Henchmen.Entityshocker_combatman;
import Kamen_Rider_Craft_4TH.mobs.Henchmen.entity_abaddon_low;
import Kamen_Rider_Craft_4TH.mobs.Henchmen.entity_ari_commando;
import Kamen_Rider_Craft_4TH.mobs.Henchmen.entity_battle_raider;
import Kamen_Rider_Craft_4TH.mobs.Henchmen.entity_black_satan_soldier;
import Kamen_Rider_Craft_4TH.mobs.Henchmen.entity_chap;
import Kamen_Rider_Craft_4TH.mobs.Henchmen.entity_charybdis;
import Kamen_Rider_Craft_4TH.mobs.Henchmen.entity_combat_roid;
import Kamen_Rider_Craft_4TH.mobs.Henchmen.entity_dogma_fighter;
import Kamen_Rider_Craft_4TH.mobs.Henchmen.entity_guardian_downfall;
import Kamen_Rider_Craft_4TH.mobs.Henchmen.entity_phantom_crusher;
import Kamen_Rider_Craft_4TH.mobs.bikes.EntityAcrobatter;
import Kamen_Rider_Craft_4TH.mobs.bikes.EntityDiagoSpeedy;
import Kamen_Rider_Craft_4TH.mobs.bikes.EntityExaidBike;
import Kamen_Rider_Craft_4TH.mobs.bikes.EntityMachineBuilder;
import Kamen_Rider_Craft_4TH.mobs.bikes.EntityRidevendor;
import Kamen_Rider_Craft_4TH.mobs.bikes.EntityRiseHopperBike;
import Kamen_Rider_Craft_4TH.mobs.bikes.EntityRoseAttacker;
import Kamen_Rider_Craft_4TH.mobs.bikes.EntitySakuraHurricane;
import Kamen_Rider_Craft_4TH.mobs.bikes.EntityToridevendor;
import Kamen_Rider_Craft_4TH.mobs.bikes.Entity_machine_denbird;
import Kamen_Rider_Craft_4TH.mobs.bikes.Entity_ridoron;
import Kamen_Rider_Craft_4TH.mobs.bikes.Entityhardboilder;
import Kamen_Rider_Craft_4TH.mobs.bikes.Entitymachine_tornador;
import Kamen_Rider_Craft_4TH.mobs.bikes.Entityskullboilder;
import Kamen_Rider_Craft_4TH.model.ImaginSandModel;
import Kamen_Rider_Craft_4TH.model.MobWithBeltModel;
import Kamen_Rider_Craft_4TH.model.ModelAnkh;
import Kamen_Rider_Craft_4TH.model.ModelPoppy;
import Kamen_Rider_Craft_4TH.model.Model_Diago_Speedy;
import Kamen_Rider_Craft_4TH.model.Model_Sakura_Hurricane;
import Kamen_Rider_Craft_4TH.model.Model_accel_bike_form;
import Kamen_Rider_Craft_4TH.model.Model_elementary_inves;
import Kamen_Rider_Craft_4TH.model.Model_giger;
import Kamen_Rider_Craft_4TH.model.Model_hardboilder;
import Kamen_Rider_Craft_4TH.model.Model_kodama_suika_arms;
import Kamen_Rider_Craft_4TH.model.Model_lazer_bike;
import Kamen_Rider_Craft_4TH.model.Model_machine_builder;
import Kamen_Rider_Craft_4TH.model.Model_rose_attacker;
import Kamen_Rider_Craft_4TH.model.model_batta_can;
import Kamen_Rider_Craft_4TH.model.model_gorilla_can;
import Kamen_Rider_Craft_4TH.model.model_kujaku_can;
import Kamen_Rider_Craft_4TH.model.model_ptera_can;
import Kamen_Rider_Craft_4TH.model.model_ridevendor;
import Kamen_Rider_Craft_4TH.model.model_ridevendor_vending;
import Kamen_Rider_Craft_4TH.model.model_ridoron;
import Kamen_Rider_Craft_4TH.model.model_taka_can;
import Kamen_Rider_Craft_4TH.model.model_tako_can;
import Kamen_Rider_Craft_4TH.model.model_tora_can;
import Kamen_Rider_Craft_4TH.model.model_toridevendor;
import Kamen_Rider_Craft_4TH.model.model_tricera_can;
import Kamen_Rider_Craft_4TH.model.model_unagi_can;
import Kamen_Rider_Craft_4TH.model.tokuMobModel;
import Kamen_Rider_Craft_4TH.util.Refercence;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.MinecraftForgeClient;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class ClientProxyRider extends CommonProxyRider
{


	@Override
	public void registerRenderThings()
	{
		RenderingRegistry.registerEntityRenderingHandler(Entity_zu_gumun_ba.class, new RenderRiderMob2(new ModelBiped(), 0.5F,"textures/entities/zu_gumun_ba.png"));

		RenderingRegistry.registerEntityRenderingHandler(EntityRiotrooper.class, new RenderRiderMob2(new ModelBiped(), 0.5F,"textures/entities/riotrooper.png"));
		RenderingRegistry.registerEntityRenderingHandler(Entity_orga.class, new RenderRiderMob2(new ModelBiped(), 0.5F,"textures/entities/horse_orpnoch.png"));
		
		RenderingRegistry.registerEntityRenderingHandler(Entity_gaoh.class, new RenderRiderMob2(new ModelBiped(), 0.5F,"textures/entities/gaoh.png"));
		
		RenderingRegistry.registerEntityRenderingHandler(Entitynew_mole_imagin_sand.class, new RenderRiderMob2(new ImaginSandModel(), 0.5F,"textures/entities/new_mole_imagin_sand.png"));
		
		RenderingRegistry.registerEntityRenderingHandler(Entitynew_mole_imagin.class, new RenderRiderMob2(new ModelBiped(), 0.5F,"textures/entities/new_mole_imagin.png"));
		
		RenderingRegistry.registerEntityRenderingHandler(EntityMomotaros.class, new RenderRiderMob2(new ModelBiped(), 0.5F,"textures/entities/momotaros.png"));
		RenderingRegistry.registerEntityRenderingHandler(EntityUrataros.class, new RenderRiderMob2(new ModelBiped(), 0.5F,"textures/entities/urataros.png"));
		RenderingRegistry.registerEntityRenderingHandler(EntityKintaros.class, new RenderRiderMob2(new ModelBiped(), 0.5F,"textures/entities/kintaros.png"));
		RenderingRegistry.registerEntityRenderingHandler(EntityRyutaros.class, new RenderRiderMob2(new ModelBiped(), 0.5F,"textures/entities/ryutaros.png"));
		
		
		RenderingRegistry.registerEntityRenderingHandler(EntityMasquerade.class, new RenderRiderMob2( new ModelBiped(), 0.4F,"textures/entities/masquerade.png"));
		RenderingRegistry.registerEntityRenderingHandler(Entity_foundation_x_masquerade.class, new RenderRiderMob2( new ModelBiped(), 0.4F,"textures/entities/foundation_x_masquerade.png"));
		RenderingRegistry.registerEntityRenderingHandler(Entity_Eternal.class, new RenderRiderMob2( new ModelBiped(), 0.4F,"textures/entities/masquerade.png"));
		

		RenderingRegistry.registerEntityRenderingHandler(Entity_yummy.class, new RenderRiderMob2(new ModelBiped(), 0.5F,"textures/entities/yummy.png"));
		RenderingRegistry.registerEntityRenderingHandler(EntityAnkh.class, new RenderRiderMob(new ModelAnkh(0), 0.5F,"textures/entities/ankh.png"));
		RenderingRegistry.registerEntityRenderingHandler(Entity_uva.class, new RenderRiderMob2(new ModelBiped(), 0.5F,"textures/entities/yummy.png"));
		RenderingRegistry.registerEntityRenderingHandler(Entity_kazari.class, new RenderRiderMob2(new ModelBiped(), 0.5F,"textures/entities/yummy.png"));
		RenderingRegistry.registerEntityRenderingHandler(Entity_mezool.class, new RenderRiderMob2(new ModelBiped(), 0.5F,"textures/entities/yummy.png"));
		RenderingRegistry.registerEntityRenderingHandler(Entity_gamel.class, new RenderRiderMob2(new ModelBiped(), 0.5F,"textures/entities/yummy.png"));
		RenderingRegistry.registerEntityRenderingHandler(Entity_ankh_lost.class, new RenderRiderMob2(new ModelBiped(), 0.5F,"textures/entities/yummy.png"));
		RenderingRegistry.registerEntityRenderingHandler(Entity_core.class, new RenderRiderMob2(new ModelBiped(), 0.5F,"textures/entities/blank.png"));
		RenderingRegistry.registerEntityRenderingHandler(Entity_power_up_core.class, new RenderRiderMob2(new ModelBiped(), 0.5F,"textures/entities/blank.png"));
		RenderingRegistry.registerEntityRenderingHandler(Entity_poseidon.class, new RenderRiderMob2(new ModelBiped(), 0.5F,"textures/entities/yummy.png"));
		RenderingRegistry.registerEntityRenderingHandler(Entity_muchiri.class, new RenderRiderMob2(new ModelBiped(), 0.5F,"textures/entities/yummy.png"));
		RenderingRegistry.registerEntityRenderingHandler(Entity_ankh_complete.class, new RenderRiderMob2(new ModelBiped(), 0.5F,"textures/entities/yummy.png"));
		
		RenderingRegistry.registerEntityRenderingHandler(Entity_knight_soldier.class, new RenderRiderMob2(new ModelBiped(), 0.5F,"textures/entities/knight_soldier.png"));
		
		RenderingRegistry.registerEntityRenderingHandler(entity_taka_can.class, new RenderRiderMob(new model_taka_can(), 0.5F,"textures/entities/taka_can.png"));
		RenderingRegistry.registerEntityRenderingHandler(entity_tako_can.class, new RenderRiderMob(new model_tako_can(), 0.5F,"textures/entities/tako_can.png"));
		RenderingRegistry.registerEntityRenderingHandler(entity_batta_can.class, new RenderRiderMob(new model_batta_can(), 0.5F,"textures/entities/batta_can.png"));
		RenderingRegistry.registerEntityRenderingHandler(entity_tora_can.class, new RenderRiderMob(new model_tora_can(), 0.5F,"textures/entities/tora_can.png"));
		RenderingRegistry.registerEntityRenderingHandler(entity_unagi_can.class, new RenderRiderMob(new model_unagi_can(), 0.5F,"textures/entities/unagi_can.png"));
		RenderingRegistry.registerEntityRenderingHandler(entity_gorilla_can.class, new RenderRiderMob(new model_gorilla_can(), 0.5F,"textures/entities/gorilla_can.png"));
		RenderingRegistry.registerEntityRenderingHandler(entity_kujaku_can.class, new RenderRiderMob(new model_kujaku_can(), 0.5F,"textures/entities/kujaku_can.png"));
		RenderingRegistry.registerEntityRenderingHandler(entity_ptera_can.class, new RenderRiderMob(new model_ptera_can(), 0.5F,"textures/entities/ptera_can.png"));
		RenderingRegistry.registerEntityRenderingHandler(entity_tricera_can.class, new RenderRiderMob(new model_tricera_can(), 0.5F,"textures/entities/tricera_can.png"));
		
		RenderingRegistry.registerEntityRenderingHandler(Entity_super_gingaoh.class, new RenderRiderMob2(new ModelBiped(), 0.5F,"textures/entities/yummy.png"));
		
		
		RenderingRegistry.registerEntityRenderingHandler(EntityBugsterVirus.class, new RenderRiderMob2(new ModelBiped(), 0.5F,"textures/entities/bugster_virus.png"));
		
		RenderingRegistry.registerEntityRenderingHandler(EntityNebulaBugsterVirus.class, new RenderRiderMob2(new ModelBiped(), 0.5F,"textures/entities/nebula_bugster_virus.png"));
		
		RenderingRegistry.registerEntityRenderingHandler(Entitygamma_commando.class, new RenderRiderMob2(new ModelBiped(), 0.5F,"textures/entities/gamma_commandos.png"));
		
		RenderingRegistry.registerEntityRenderingHandler(Entityshocker_combatman.class, new RenderRiderMob2(new ModelBiped(), 0.5F,"textures/entities/shocker_combatman.png"));
		RenderingRegistry.registerEntityRenderingHandler(Entitydestron_combatman.class, new RenderRiderMob2(new ModelBiped(), 0.5F,"textures/entities/destron_combatman.png"));
		RenderingRegistry.registerEntityRenderingHandler(Entitygod_warfare_agent.class, new RenderRiderMob2(new ModelBiped(), 0.5F,"textures/entities/god_warfare_agent.png"));
		RenderingRegistry.registerEntityRenderingHandler(Entityred_follower.class, new RenderRiderMob2(new ModelBiped(), 0.5F,"textures/entities/red_follower.png"));
		RenderingRegistry.registerEntityRenderingHandler(entity_black_satan_soldier.class, new RenderRiderMob2(new ModelBiped(), 0.5F,"textures/entities/black_satan_soldier.png"));
		RenderingRegistry.registerEntityRenderingHandler(entity_ari_commando.class, new RenderRiderMob2(new ModelBiped(), 0.5F,"textures/entities/ari_commando.png"));
		RenderingRegistry.registerEntityRenderingHandler(entity_dogma_fighter.class, new RenderRiderMob2(new ModelBiped(), 0.5F,"textures/entities/dogma_fighter.png"));
		RenderingRegistry.registerEntityRenderingHandler(entity_combat_roid.class, new RenderRiderMob2(new ModelBiped(), 0.5F,"textures/entities/combat_roid.png"));
		RenderingRegistry.registerEntityRenderingHandler(entity_chap.class, new RenderRiderMob2(new ModelBiped(), 0.5F,"textures/entities/chap.png"));
		
		RenderingRegistry.registerEntityRenderingHandler(Entity_shocker_riders.class, new RenderRiderMob2(new ModelBiped(), 0.5F,"textures/entities/shocker_combatman.png"));
		
		RenderingRegistry.registerEntityRenderingHandler(Entityguardian.class, new RenderRiderMob2(new ModelBiped(), 0.5F,"textures/entities/guardian.png"));
		
		RenderingRegistry.registerEntityRenderingHandler(Entity_trilobite_magia.class, new RenderRiderMob2(new ModelBiped(), 0.5F,"textures/entities/trilobite_magia.png"));
		RenderingRegistry.registerEntityRenderingHandler(Entity_magia.class, new RenderRiderMob2(new ModelBiped(), 0.5F,"textures/entities/trilobite_magia.png"));
		RenderingRegistry.registerEntityRenderingHandler(Entity_dodomagia.class, new RenderRiderMob2(new ModelBiped(), 0.5F,"textures/entities/trilobite_magia.png"));
		RenderingRegistry.registerEntityRenderingHandler(Entity_magiadodo_chick.class, new RenderRiderMob2(new ModelBiped(), 0.5F,"textures/entities/magiadodo_chick.png"));
		RenderingRegistry.registerEntityRenderingHandler(entity_battle_raider.class, new RenderRiderMob2(new ModelBiped(), 0.5F,"textures/entities/trilobite_magia.png"));
		RenderingRegistry.registerEntityRenderingHandler(entity_raider.class, new RenderRiderMob2(new ModelBiped(), 0.5F,"textures/entities/trilobite_magia.png"));
		RenderingRegistry.registerEntityRenderingHandler(entity_abaddon_low.class, new RenderRiderMob2(new ModelBiped(), 0.5F,"textures/entities/trilobite_magia.png"));
		
		RenderingRegistry.registerEntityRenderingHandler(EntityIS.class, new RenderRiderMob2(new ModelPoppy(), 0.5F,"textures/entities/is.png"));
		
		RenderingRegistry.registerEntityRenderingHandler(Entity_horobi.class, new RenderRiderMob2(new ModelBiped(), 0.5F,"textures/entities/trilobite_magia.png"));
		RenderingRegistry.registerEntityRenderingHandler(Entity_jin.class, new RenderRiderMob2(new ModelBiped(), 0.5F,"textures/entities/trilobite_magia.png"));
		RenderingRegistry.registerEntityRenderingHandler(Entity_ikazuchi.class, new RenderRiderMob2(new ModelBiped(), 0.5F,"textures/entities/trilobite_magia.png"));
		RenderingRegistry.registerEntityRenderingHandler(Entity_naki.class, new RenderRiderMob2(new ModelBiped(), 0.5F,"textures/entities/trilobite_magia.png"));
		RenderingRegistry.registerEntityRenderingHandler(Entity_Arc_zero.class, new RenderRiderMob2(new ModelBiped(), 0.5F,"textures/entities/trilobite_magia.png"));

		RenderingRegistry.registerEntityRenderingHandler(entity_eden.class, new RenderRiderMob2(new ModelBiped(), 0.5F,"textures/entities/trilobite_magia.png"));
		RenderingRegistry.registerEntityRenderingHandler(entity_abaddon_high.class, new RenderRiderMob2(new ModelBiped(), 0.5F,"textures/entities/trilobite_magia.png"));
		RenderingRegistry.registerEntityRenderingHandler(entity_zaia.class, new RenderRiderMob2(new ModelBiped(), 0.5F,"textures/entities/trilobite_magia.png"));
		RenderingRegistry.registerEntityRenderingHandler(entity_dire_wolf_sold_magia.class, new RenderRiderMob2(new ModelBiped(), 0.5F,"textures/entities/dire_wolf_sold_magia.png"));
		RenderingRegistry.registerEntityRenderingHandler(entity_serval_tiger_sold_magia.class, new RenderRiderMob2(new ModelBiped(), 0.5F,"textures/entities/serval_tiger_sold_magia.png"));
		RenderingRegistry.registerEntityRenderingHandler(Entity_giger.class, new RenderRiderMob2(new Model_giger(), 0.5F,"textures/entities/giger.png"));
		
		RenderingRegistry.registerEntityRenderingHandler(EntityElementaryInvesGreen.class, new RenderRiderMob2(new Model_elementary_inves(), 0.5F,"textures/entities/elementary_inves_green.png"));
		RenderingRegistry.registerEntityRenderingHandler(EntityElementaryInvesRed.class, new RenderRiderMob2(new Model_elementary_inves(), 0.5F,"textures/entities/elementary_inves_red.png"));
		RenderingRegistry.registerEntityRenderingHandler(EntityElementaryInvesBlue.class, new RenderRiderMob2(new Model_elementary_inves(), 0.5F,"textures/entities/elementary_inves_blue.png"));
		
		RenderingRegistry.registerEntityRenderingHandler(EntityByakkoInves.class, new RenderRiderMob2(new ModelBiped(), 0.5F,"textures/entities/byakko_inves.png"));
		RenderingRegistry.registerEntityRenderingHandler(EntityHekijaInves.class, new RenderRiderMob2(new ModelBiped(), 0.5F,"textures/entities/hekija_inves.png"));
		
		RenderingRegistry.registerEntityRenderingHandler(EntityKurokageTroopers.class, new RenderRiderMob2(new ModelBiped(), 0.5F,"textures/entities/kurokagetroopers.png"));
		RenderingRegistry.registerEntityRenderingHandler(Entity_ZangetsuShin.class, new RenderRiderMob2(new ModelBiped(), 0.5F,"textures/entities/zangetsu_shin.png"));
		RenderingRegistry.registerEntityRenderingHandler(Entity_Marika.class, new RenderRiderMob2(new ModelBiped(), 0.5F,"textures/entities/marika.png"));
		RenderingRegistry.registerEntityRenderingHandler(Entity_Sigurd.class, new RenderRiderMob2(new ModelBiped(), 0.5F,"textures/entities/sigurd.png"));
		RenderingRegistry.registerEntityRenderingHandler(Entity_Duke.class, new RenderRiderMob2(new ModelBiped(), 0.5F,"textures/entities/duke.png"));
		
		RenderingRegistry.registerEntityRenderingHandler(Entity_roshuo.class, new RenderRiderMob2(new tokuMobModel("roshuo_2"), 0.5F,"textures/entities/roshuo_1.png"));
		RenderingRegistry.registerEntityRenderingHandler(Entity_demushu.class, new RenderRiderMob2(new tokuMobModel("demushu_2"), 0.5F,"textures/entities/demushu_1.png"));
		RenderingRegistry.registerEntityRenderingHandler(Entity_redyue.class, new RenderRiderMob2(new tokuMobModel("redyue_2"), 0.5F,"textures/entities/redyue_1.png"));
		RenderingRegistry.registerEntityRenderingHandler(Entity_lord_baron.class, new RenderRiderMob2(new tokuMobModel("lord_baron_2"), 0.5F,"textures/entities/lord_baron_1.png"));
		
		RenderingRegistry.registerEntityRenderingHandler(Entity_genm.class, new RenderRiderMob2(new ModelBiped(), 0.5F,"textures/entities/genm.png"));
		
		RenderingRegistry.registerEntityRenderingHandler(EntityChronos.class, new RenderRiderMob2(new ModelBiped(), 0.5F,"textures/entities/chronos.png"));
		RenderingRegistry.registerEntityRenderingHandler(Entity_Para_dx.class, new RenderRiderMob2(new ModelBiped(), 0.5F,"textures/entities/para_dx.png"));
		RenderingRegistry.registerEntityRenderingHandler(EntityRidePlayer.class, new RenderRiderMob2(new ModelBiped(), 0.5F,"textures/entities/ride_player.png"));
		RenderingRegistry.registerEntityRenderingHandler(Entity_Red_Poppy.class, new RenderRiderMob2(new ModelBiped(), 0.5F,"textures/entities/red_poppy.png"));
		
		RenderingRegistry.registerEntityRenderingHandler(EntityPoppy.class, new RenderRiderMob2(new ModelPoppy(), 0.5F,"textures/entities/poppy.png"));

		RenderingRegistry.registerEntityRenderingHandler(Entity_another_build.class, new RenderRiderMob2(new tokuMobModel("another_build2"), 0.5F,"textures/entities/another_build.png"));
		RenderingRegistry.registerEntityRenderingHandler(Entity_kodama_suika_arms.class, new RenderRiderMob2(new Model_kodama_suika_arms(), 0.5F,"textures/entities/kodama_suika_arms.png"));
		
		RenderingRegistry.registerEntityRenderingHandler(Entity_White_Woz.class, new RenderRiderMob2(new ModelBiped(), 0.5F,"textures/entities/woz.png"));
		RenderingRegistry.registerEntityRenderingHandler(Entity_Ginga.class, new RenderRiderMob2(new ModelBiped(), 0.5F,"textures/entities/ginga.png"));
		
		
		RenderingRegistry.registerEntityRenderingHandler(Entity_evolt.class, new RenderRiderMob2(new MobWithBeltModel(RiderItems.evol_driver_evol,"evol_2"), 0.5F,"textures/entities/evol_1.png"));
		RenderingRegistry.registerEntityRenderingHandler(Entity_evolt_2.class, new RenderRiderMob2(new MobWithBeltModel(RiderItems.evol_driver_evol,"evol_black2"), 0.5F,"textures/entities/evol_black.png"));
		RenderingRegistry.registerEntityRenderingHandler(Entity_evolt_3.class, new RenderRiderMob2(new MobWithBeltModel(RiderItems.evol_driver_evol,"evolto2"), 0.5F,"textures/entities/evolto.png"));
		
		
		RenderingRegistry.registerEntityRenderingHandler(Entity_BloodStalk.class, new RenderRiderMob2(new tokuMobModel("blood_stalk_2"), 0.5F,"textures/entities/blood_stalk_1.png"));
		RenderingRegistry.registerEntityRenderingHandler(Entity_NightRogue.class, new RenderRiderMob2(new tokuMobModel("night_rogue_2"), 0.5F,"textures/entities/night_rogue_1.png"));
		
		RenderingRegistry.registerEntityRenderingHandler(Entity_Kaiser.class, new RenderRiderMob2(new tokuMobModel("kaiser_blue_2"), 0.5F,"textures/entities/kaiser_blue_1.png"));
		RenderingRegistry.registerEntityRenderingHandler(Entity_KaiserReverse.class, new RenderRiderMob2(new tokuMobModel("kaiser_red_2"), 0.5F,"textures/entities/kaiser_red_1.png"));
		RenderingRegistry.registerEntityRenderingHandler(Entity_bikaiser.class, new RenderRiderMob2(new tokuMobModel("bi_kaiser_2"), 0.5F,"textures/entities/bi_kaiser_1.png"));
		RenderingRegistry.registerEntityRenderingHandler(Entity_RemoconBros.class, new RenderRiderMob2(new tokuMobModel("remocon_bros_2"), 0.5F,"textures/entities/remocon_bros_1.png"));
		RenderingRegistry.registerEntityRenderingHandler(Entity_EngineBros.class, new RenderRiderMob2(new tokuMobModel("engine_bros_2"), 0.5F,"textures/entities/engine_bros_1.png"));
		RenderingRegistry.registerEntityRenderingHandler(Entity_HellBros.class, new RenderRiderMob2(new tokuMobModel("hell_bros_2"), 0.5F,"textures/entities/hell_bros_1.png"));
		RenderingRegistry.registerEntityRenderingHandler(Entity_grease.class, new RenderRiderMob2(new MobWithBeltModel(RiderItems.sclash_driver_grease,"grease_2"), 0.5F,"textures/entities/grease_1.png"));
		RenderingRegistry.registerEntityRenderingHandler(Entity_Build_RT.class, new RenderRiderMob2(new MobWithBeltModel(RiderItems.build_driver,"build_2"), 0.5F,"textures/entities/build_1.png"));
		
		RenderingRegistry.registerEntityRenderingHandler(Entity_hard_guardian.class, new RenderRiderMob2( new ModelBiped(), 0.4F,"textures/entities/hard_guardian.png"));
		RenderingRegistry.registerEntityRenderingHandler(Entity_needle_smash.class, new RenderRiderMob2( new ModelBiped(), 0.4F,"textures/entities/needle_smash.png"));
		
		RenderingRegistry.registerEntityRenderingHandler(Entityguardian_hokuto.class, new RenderRiderMob2(new ModelBiped(), 0.5F,"textures/entities/guardian_hokuto.png"));
		
		RenderingRegistry.registerEntityRenderingHandler(Entityguardian_seito.class, new RenderRiderMob2(new ModelBiped(), 0.5F,"textures/entities/guardian_seito.png"));
		
		RenderingRegistry.registerEntityRenderingHandler(entity_guardian_downfall.class, new RenderRiderMob2( new ModelBiped(), 0.4F,"textures/entities/guardian_downfall.png"));
		RenderingRegistry.registerEntityRenderingHandler(entity_phantom_crusher.class, new RenderRiderMob2( new ModelBiped(), 0.4F,"textures/entities/phantom_crusher.png"));
		
		RenderingRegistry.registerEntityRenderingHandler(entity_blood.class, new RenderRiderMob2(new MobWithBeltModel(RiderItems.build_driver_blood,"blood_2"), 0.5F,"textures/entities/blood_1.png"));
		RenderingRegistry.registerEntityRenderingHandler(entity_killbus.class, new RenderRiderMob2(new MobWithBeltModel(RiderItems.build_driver_killbas,"killbas_2"), 0.5F,"textures/entities/killbas_1.png"));
		RenderingRegistry.registerEntityRenderingHandler(entity_metal_build.class, new RenderRiderMob2(new MobWithBeltModel(RiderItems.build_driver_build_metal,"metal_build_2"), 0.5F,"textures/entities/metal_build_1.png"));
		
		RenderingRegistry.registerEntityRenderingHandler(Entity_clay_doll_dopant.class, new RenderRiderMob2(new tokuMobModel("clay_doll_dopant_2"), 0.5F,"textures/entities/clay_doll_dopant_1.png"));
		RenderingRegistry.registerEntityRenderingHandler(Entity_nazca_dopant.class, new RenderRiderMob2(new tokuMobModel("nazca_dopant_2"), 0.5F,"textures/entities/nazca_dopant_1.png"));
		RenderingRegistry.registerEntityRenderingHandler(Entity_red_nazca_dopant.class, new RenderRiderMob2(new tokuMobModel("red_nazca_dopant_2"), 0.5F,"textures/entities/red_nazca_dopant_1.png"));
		RenderingRegistry.registerEntityRenderingHandler(Entity_taboo_dopant.class, new RenderRiderMob2(new tokuMobModel("taboo_dopant_2"), 0.5F,"textures/entities/taboo_dopant_1.png"));
		
		
		RenderingRegistry.registerEntityRenderingHandler(EntityShimi.class, new RenderRiderMob2(new ModelBiped(), 0.5F,"textures/entities/shimi.png"));
		RenderingRegistry.registerEntityRenderingHandler(Entity_Calibur.class, new RenderRiderMob2(new ModelBiped(), 0.5F,"textures/entities/calibur.png"));
		RenderingRegistry.registerEntityRenderingHandler(Entity_Falchion.class, new RenderRiderMob2(new ModelBiped(), 0.5F,"textures/entities/falchion.png"));
		RenderingRegistry.registerEntityRenderingHandler(Entity_Sabela.class, new RenderRiderMob2(new ModelBiped(), 0.5F,"textures/entities/sabela.png"));
		RenderingRegistry.registerEntityRenderingHandler(Entity_Durendal.class, new RenderRiderMob2(new ModelBiped(), 0.5F,"textures/entities/durendal.png"));
		RenderingRegistry.registerEntityRenderingHandler(Entity_legeiel.class, new RenderRiderMob2(new ModelBiped(), 0.5F,"textures/entities/legeiel.png"));
		RenderingRegistry.registerEntityRenderingHandler(Entity_legeiel_forbidden.class, new RenderRiderMob2(new ModelBiped(), 0.5F,"textures/entities/legeiel_forbidden.png"));
		RenderingRegistry.registerEntityRenderingHandler(Entity_storious.class, new RenderRiderMob2(new ModelBiped(), 0.5F,"textures/entities/storious.png"));
		RenderingRegistry.registerEntityRenderingHandler(Entity_zooous.class, new RenderRiderMob2(new ModelBiped(), 0.5F,"textures/entities/zooous.png"));
		RenderingRegistry.registerEntityRenderingHandler(Entity_zooous_predator.class, new RenderRiderMob2(new ModelBiped(), 0.5F,"textures/entities/zooous_predator.png"));
		RenderingRegistry.registerEntityRenderingHandler(Entity_Solomon.class, new RenderRiderMob2(new ModelBiped(), 0.5F,"textures/entities/solomon.png"));
		RenderingRegistry.registerEntityRenderingHandler(entity_desast.class, new RenderRiderMob2(new ModelBiped(), 0.5F,"textures/entities/desast.png"));
		RenderingRegistry.registerEntityRenderingHandler(entity_storious_rider.class, new RenderRiderMob2(new ModelBiped(), 0.5F,"textures/entities/storious.png"));
		RenderingRegistry.registerEntityRenderingHandler(entity_charybdis.class, new RenderRiderMob2(new tokuMobModel("charybdis_2"), 0.5F,"textures/entities/charybdis_1.png"));
		RenderingRegistry.registerEntityRenderingHandler(entity_charybdis_hercules.class, new RenderRiderMob2(new tokuMobModel("charybdis_hercules_2"), 0.5F,"textures/entities/charybdis_hercules_1.png"));
		
		RenderingRegistry.registerEntityRenderingHandler(EntityVice.class, new RenderRiderMob2(new ModelBiped(), 0.5F,"textures/entities/vice.png"));
		RenderingRegistry.registerEntityRenderingHandler(Entity_giff_junior.class, new RenderRiderMob2(new ModelBiped(), 0.5F,"textures/entities/giff_junior.png"));
		RenderingRegistry.registerEntityRenderingHandler(Entity_Evil.class, new RenderRiderMob2(new ModelBiped(), 0.5F,"textures/entities/giff_junior.png"));
		
		RenderingRegistry.registerEntityRenderingHandler(EntityAcrobatter.class, new RenderRiderMob2(new Model_machine_builder(), 0.5F,"textures/entities/acrobatter.png"));
		RenderingRegistry.registerEntityRenderingHandler(Entity_ridoron.class, new RenderRiderMob2(new model_ridoron(), 0.5F,"textures/entities/ridoron.png"));
		
		RenderingRegistry.registerEntityRenderingHandler(Entitymachine_tornador.class, new RenderRiderMob2(new Model_hardboilder(), 0.5F,"textures/entities/machine_tornador.png"));
		
		RenderingRegistry.registerEntityRenderingHandler(Entity_machine_denbird.class, new RenderRiderMob2(new Model_Sakura_Hurricane(), 0.5F,"textures/entities/machine_denbird.png"));
		
		RenderingRegistry.registerEntityRenderingHandler(Entityhardboilder.class, new RenderRiderMob2(new Model_hardboilder(), 0.5F,"textures/entities/hardboilder.png"));
		RenderingRegistry.registerEntityRenderingHandler(Entityskullboilder.class, new RenderRiderMob2(new Model_hardboilder(), 0.5F,"textures/entities/skullboilder.png"));
		RenderingRegistry.registerEntityRenderingHandler(Entityaccel.class, new RenderRiderMob2(new Model_accel_bike_form(), 0.5F,"textures/entities/accel_bike_form.png"));
		
		RenderingRegistry.registerEntityRenderingHandler(EntitySakuraHurricane.class, new RenderRiderMob2(new Model_Sakura_Hurricane(), 0.5F,"textures/entities/sakura_hurricane.png"));
		RenderingRegistry.registerEntityRenderingHandler(EntityRoseAttacker.class, new RenderRiderMob2(new Model_rose_attacker(), 0.5F,"textures/entities/rose_attacker.png"));
		
		RenderingRegistry.registerEntityRenderingHandler(EntityLazer.class, new RenderRiderMob2(new Model_lazer_bike(), 0.5F,"textures/entities/model_lazer.png"));
		
		RenderingRegistry.registerEntityRenderingHandler(EntityExaidBike.class, new RenderRiderMob2(new Model_lazer_bike(), 0.5F,"textures/entities/model_exaid_bike.png"));
		
		RenderingRegistry.registerEntityRenderingHandler(EntityMachineBuilder.class, new RenderRiderMob2(new Model_machine_builder(), 0.5F,"textures/entities/model_machine_builder.png"));

		RenderingRegistry.registerEntityRenderingHandler(EntityRiseHopperBike.class, new RenderRiderMob2(new Model_Sakura_Hurricane(), 0.5F,"textures/entities/rise_hopper_bike.png"));
		RenderingRegistry.registerEntityRenderingHandler(EntityRidevendor.class, new RenderRiderMob2(new model_ridevendor(), 0.5F,"textures/entities/ridevendor.png"));
		RenderingRegistry.registerEntityRenderingHandler(EntityToridevendor.class, new RenderRiderMob2(new model_toridevendor(), 0.5F,"textures/entities/toridevendor.png"));
		RenderingRegistry.registerEntityRenderingHandler(Entity_ridevendor_vending.class, new RenderRiderMob2(new model_ridevendor_vending(), 0.5F,"textures/entities/ridevendor_vending.png"));
		
		RenderingRegistry.registerEntityRenderingHandler(EntityDiagoSpeedy.class, new RenderRiderMob2(new Model_Diago_Speedy(), 0.5F,"textures/entities/diago_speedy.png"));
	}

	public void registerItemRender(Item item, int i, String string) {

		ModelLoader.setCustomModelResourceLocation(item, i,  new ModelResourceLocation(item.getRegistryName(),string));
	}

}
