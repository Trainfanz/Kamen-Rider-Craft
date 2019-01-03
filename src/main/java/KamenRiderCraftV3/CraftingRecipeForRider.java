package KamenRiderCraftV3;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CraftingRecipeForRider {
	public static void Crafrting(){
		
		GameRegistry.addRecipe(new ItemStack(RiderItems.energy,5), " a ","aba"," a ", 'a', new ItemStack(Items.dye,0,4), 'b', Items.redstone);
		
		GameRegistry.addShapelessRecipe(new ItemStack(RiderItems.typhoon_shocker_rider_2,1), RiderItems.typhoon_shocker_rider_1, new ItemStack(Items.dye,0,15));
		GameRegistry.addShapelessRecipe(new ItemStack(RiderItems.typhoon_shocker_rider_3,1), RiderItems.typhoon_shocker_rider_1, new ItemStack(Items.dye,0,2));
		GameRegistry.addShapelessRecipe(new ItemStack(RiderItems.typhoon_shocker_rider_4,1), RiderItems.typhoon_shocker_rider_1, new ItemStack(Items.dye,0,4));
		GameRegistry.addShapelessRecipe(new ItemStack(RiderItems.typhoon_shocker_rider_5,1), RiderItems.typhoon_shocker_rider_1, new ItemStack(Items.dye,0,5));
		GameRegistry.addShapelessRecipe(new ItemStack(RiderItems.typhoon_shocker_rider_6,1), RiderItems.typhoon_shocker_rider_1, new ItemStack(Items.dye,0,9));
		GameRegistry.addShapelessRecipe(new ItemStack(RiderItems.typhoon_shocker_rider_7,1), RiderItems.typhoon_shocker_rider_1, new ItemStack(Items.dye,0,14));
		GameRegistry.addShapelessRecipe(new ItemStack(RiderItems.typhoon_shocker_rider_8,1), RiderItems.typhoon_shocker_rider_1, new ItemStack(Items.dye,0,8));
		GameRegistry.addShapelessRecipe(new ItemStack(RiderItems.typhoon_shocker_rider_9,1), RiderItems.typhoon_shocker_rider_1, new ItemStack(Items.dye,0,0));
		GameRegistry.addShapelessRecipe(new ItemStack(RiderItems.typhoon_shocker_rider_10,1), RiderItems.typhoon_shocker_rider_1, new ItemStack(Items.dye,0,7));
		GameRegistry.addShapelessRecipe(new ItemStack(RiderItems.typhoon_shocker_rider_11,1), RiderItems.typhoon_shocker_rider_1, new ItemStack(Items.dye,0,11));
		GameRegistry.addShapelessRecipe(new ItemStack(RiderItems.typhoon_shocker_rider_12,1), RiderItems.typhoon_shocker_rider_1, new ItemStack(Items.dye,0,1));
		
		GameRegistry.addRecipe(new ItemStack(RiderItems.ridol_stick,1), "ama","aba","aaa", 'a', RiderItems.rider_circuit, 'b', Items.diamond_sword, 'm',  RiderItems.ridol);
		GameRegistry.addRecipe(new ItemStack(RiderItems.revolcane,1), "ama","aba","aaa", 'a', RiderItems.rider_circuit, 'b', Items.diamond_sword, 'm',  RiderItems.sunriser);
		
		GameRegistry.addRecipe(new ItemStack(RiderItems.ichigohead,1), "aaa","a a", 'a', RiderItems.rider_circuit, 'b', Items.diamond_helmet);
		GameRegistry.addRecipe(new ItemStack(RiderItems.ichigotroso,1), "a a","aaa","aaa", 'a', RiderItems.rider_circuit);
		GameRegistry.addRecipe(new ItemStack(RiderItems.ichigolegs,1), "aaa","a a","a a", 'a', RiderItems.rider_circuit);
		
		GameRegistry.addRecipe(new ItemStack(RiderItems.icepop1,2), " b "," b "," s ", 's', Items.stick, 'b', Items.snowball);
		GameRegistry.addRecipe(new ItemStack(RiderItems.icepop2,2), "b  ","b  ","s  ", 's', Items.stick, 'b', Items.snowball);
		GameRegistry.addRecipe(new ItemStack(RiderItems.icepop3,2), "b  "," b ","  s",'s', Items.stick, 'b', Items.snowball);	  
		GameRegistry.addRecipe(new ItemStack(RiderItems.donut, 4), " W ", "S S", " S ",'S', Items.wheat , 'W', Items.sugar);
		
		GameRegistry.addRecipe(new ItemStack(RiderItems.kuugahead,1), "aaa","a a", 'a', RiderItems.kuuga_growing, 'b', Items.diamond_helmet);
		GameRegistry.addRecipe(new ItemStack(RiderItems.kuugatroso,1), "a a","aaa","aaa", 'a', RiderItems.kuuga_growing);
		GameRegistry.addRecipe(new ItemStack(RiderItems.kuugalegs,1), "aaa","a a","a a", 'a', RiderItems.kuuga_growing);
		GameRegistry.addRecipe(new ItemStack(RiderItems.arcle,1), "aaa","aca","aaa", 'a', RiderItems.kuuga_growing, 'c', RiderItems.kuuga_mighty);

		GameRegistry.addRecipe(new ItemStack(RiderItems.dragon_rod,1), "ama","aba","aaa", 'a', RiderItems.kuuga_growing, 'b', Items.diamond_sword, 'm', RiderItems.kuuga_dragon);
		GameRegistry.addRecipe(new ItemStack(RiderItems.pegasus_bowgun,1), "ama","aba","aaa", 'a', RiderItems.kuuga_growing, 'b', Items.diamond_sword, 'm', RiderItems.kuuga_pegasus);
		GameRegistry.addRecipe(new ItemStack(RiderItems.titan_sword,1), "ama","aba","aaa", 'a', RiderItems.kuuga_growing, 'b', Items.diamond_sword, 'm', RiderItems.kuuga_titan);
		
		GameRegistry.addRecipe(new ItemStack(RiderItems.agitohead,1), "aaa","a a", 'a', RiderItems.agito_of_seed, 'b', Items.diamond_helmet);
		GameRegistry.addRecipe(new ItemStack(RiderItems.agitotroso,1), "a a","aaa","aaa", 'a', RiderItems.agito_of_seed);
		GameRegistry.addRecipe(new ItemStack(RiderItems.agitolegs,1), "aaa","a a","a a", 'a', RiderItems.agito_of_seed);
		
		GameRegistry.addRecipe(new ItemStack(RiderItems.alter_ring,1), "aaa","aca","aaa", 'a', RiderItems.agito_of_seed, 'c', RiderItems.agito_ground);
		GameRegistry.addRecipe(new ItemStack(RiderItems.alter_ring_miracle,1), "aaa","aca","aaa", 'a', RiderItems.agito_of_seed, 'c', RiderItems.agito_miracle);

		GameRegistry.addRecipe(new ItemStack(RiderItems.meta_factor,1), "aaa","aca","aaa", 'a', RiderItems.agito_of_seed, 'c', RiderItems.gills);
		GameRegistry.addRecipe(new ItemStack(RiderItems.ank_point,1), "aaa","aca","aaa", 'a', RiderItems.agito_of_seed, 'c', RiderItems.another_agito);
		GameRegistry.addRecipe(new ItemStack(RiderItems.ank_point_burning,1), "aaa","aca","aaa", 'a', RiderItems.agito_of_seed, 'c', RiderItems.another_agito_burning_form);
		
		GameRegistry.addRecipe(new ItemStack(RiderItems.g1_belt,1), "aaa","aca","aaa", 'a', RiderItems.g3core, 'c', RiderItems.g1);
		GameRegistry.addRecipe(new ItemStack(RiderItems.g3_belt,1), "aaa","aca","aaa", 'a', RiderItems.g3core, 'c', RiderItems.g3);
		GameRegistry.addRecipe(new ItemStack(RiderItems.g3_x_belt,1), "aaa","aca","aaa", 'a', RiderItems.g3core, 'c', RiderItems.g3x);
		GameRegistry.addRecipe(new ItemStack(RiderItems.g3_mild_belt,1), "aaa","aca","aaa", 'a', RiderItems.g3core, 'c', RiderItems.g3mild);
		GameRegistry.addRecipe(new ItemStack(RiderItems.g4_belt,1), "aaa","aca","aaa", 'a', RiderItems.g3core, 'c', RiderItems.g4);
		GameRegistry.addRecipe(new ItemStack(RiderItems.g4_x_belt,1), "aaa","aca","aaa", 'a', RiderItems.g3core, 'c', RiderItems.g4x);

		
		GameRegistry.addRecipe(new ItemStack(RiderItems.flame_saber,1), "ama","aba","aaa", 'a', RiderItems.agito_of_seed, 'b', Items.diamond_sword, 'm', RiderItems.agito_flame);
		GameRegistry.addRecipe(new ItemStack(RiderItems.storm_halberd,1), "ama","aba","aaa", 'a', RiderItems.agito_of_seed, 'b', Items.diamond_sword, 'm', RiderItems.agito_storm);
		GameRegistry.addRecipe(new ItemStack(RiderItems.shining_caliber_summoned,1), "ama","aba","aaa", 'a', RiderItems.agito_of_seed, 'b', Items.diamond_sword, 'm', RiderItems.agito_burning);
		GameRegistry.addRecipe(new ItemStack(RiderItems.shining_caliber,1), "ama","aba","aaa", 'a', RiderItems.agito_of_seed, 'b', Items.diamond_sword, 'm', RiderItems.agito_shining);
		
		GameRegistry.addRecipe(new ItemStack(RiderItems.ryukihead,1), "aaa","a a", 'a', RiderItems.contract_advent, 'b', Items.diamond_helmet);
		GameRegistry.addRecipe(new ItemStack(RiderItems.ryukitroso,1), "a a","aaa","aaa", 'a', RiderItems.contract_advent);
		GameRegistry.addRecipe(new ItemStack(RiderItems.ryukilegs,1), "aaa","a a","a a", 'a', RiderItems.contract_advent);
		
		GameRegistry.addRecipe(new ItemStack(RiderItems.v_buckle_ryuki,1), "aaa","aca","aaa", 'a', RiderItems.contract_advent, 'c', RiderItems.dragreder_advent);
		GameRegistry.addRecipe(new ItemStack(RiderItems.v_buckle_knight,1), "aaa","aca","aaa", 'a', RiderItems.contract_advent, 'c', RiderItems.darkwing_advent);
		GameRegistry.addRecipe(new ItemStack(RiderItems.v_buckle_scissors,1), "aaa","aca","aaa", 'a', RiderItems.contract_advent, 'c', RiderItems.volcancer_advent);
		GameRegistry.addRecipe(new ItemStack(RiderItems.v_buckle_zolda,1), "aaa","aca","aaa", 'a', RiderItems.contract_advent, 'c', RiderItems.magnugiga_advent);
		GameRegistry.addRecipe(new ItemStack(RiderItems.v_buckle_gai,1), "aaa","aca","aaa", 'a', RiderItems.contract_advent, 'c', RiderItems.metalgelas_advent);
		GameRegistry.addRecipe(new ItemStack(RiderItems.v_buckle_raia,1), "aaa","aca","aaa", 'a', RiderItems.contract_advent, 'c', RiderItems.evildiver_advent);
		GameRegistry.addRecipe(new ItemStack(RiderItems.v_buckle_ouja,1), "aaa","aca","aaa", 'a', RiderItems.contract_advent, 'c', RiderItems.venosnaker_advent);
		GameRegistry.addRecipe(new ItemStack(RiderItems.v_buckle_tiger,1), "aaa","aca","aaa", 'a', RiderItems.contract_advent, 'c', RiderItems.destwilder_advent);
		GameRegistry.addRecipe(new ItemStack(RiderItems.v_buckle_imperer,1), "aaa","aca","aaa", 'a', RiderItems.contract_advent, 'c', RiderItems.gigazelle_advent);
		GameRegistry.addRecipe(new ItemStack(RiderItems.v_buckle_odin,1), "aaa","aca","aaa", 'a', RiderItems.contract_advent, 'c', RiderItems.goldphoenix_advent);
		GameRegistry.addRecipe(new ItemStack(RiderItems.v_buckle_femme,1), "aaa","aca","aaa", 'a', RiderItems.contract_advent, 'c', RiderItems.blancwing_advent);
		GameRegistry.addRecipe(new ItemStack(RiderItems.v_buckle_verde,1), "aaa","aca","aaa", 'a', RiderItems.contract_advent, 'c', RiderItems.biogreeza_advent);
		GameRegistry.addRecipe(new ItemStack(RiderItems.v_buckle_ryuga,1), "aaa","aca","aaa", 'a', RiderItems.contract_advent, 'c', RiderItems.dragblacker_advent);
		GameRegistry.addRecipe(new ItemStack(RiderItems.v_buckle_abyss,1), "aaa","aca","aaa", 'a', RiderItems.contract_advent, 'c', RiderItems.abysslasher_advent);
		GameRegistry.addRecipe(new ItemStack(RiderItems.alternativebelt,1), "aca","aaa","aaa", 'a', RiderItems.contract_advent, 'c', RiderItems.psycorogue_advent);
		GameRegistry.addRecipe(new ItemStack(RiderItems.alternativezerobelt,1), "aaa","aaa","aca", 'a', RiderItems.contract_advent, 'c', RiderItems.psycorogue_advent);
		
		GameRegistry.addRecipe(new ItemStack(RiderItems.drag_visor,1), "aca","aba","aaa", 'a', RiderItems.contract_advent, 'b', RiderItems.dragreder_advent, 'c', Items.diamond_sword);
		GameRegistry.addRecipe(new ItemStack(RiderItems.dark_visor,1), "aca","aba","aaa", 'a', RiderItems.contract_advent, 'b', RiderItems.darkwing_advent, 'c', Items.diamond_sword);
		GameRegistry.addRecipe(new ItemStack(RiderItems.scissors_visor,1), "aca","aba","aaa", 'a', RiderItems.contract_advent, 'b', RiderItems.volcancer_advent, 'c', Items.diamond_sword);
		GameRegistry.addRecipe(new ItemStack(RiderItems.magna_visor,1), "aca","aba","aaa", 'a', RiderItems.contract_advent, 'b', RiderItems.magnugiga_advent, 'c', Items.diamond_sword);
		GameRegistry.addRecipe(new ItemStack(RiderItems.metal_visor,1), "aca","aba","aaa", 'a', RiderItems.contract_advent, 'b', RiderItems.metalgelas_advent, 'c', Items.diamond_sword);
		GameRegistry.addRecipe(new ItemStack(RiderItems.evil_visor,1), "aca","aba","aaa", 'a', RiderItems.contract_advent, 'b', RiderItems.evildiver_advent, 'c', Items.diamond_sword);
		GameRegistry.addRecipe(new ItemStack(RiderItems.veno_visor,1), "aca","aba","aaa", 'a', RiderItems.contract_advent, 'b', RiderItems.venosnaker_advent, 'c', Items.diamond_sword);
		GameRegistry.addRecipe(new ItemStack(RiderItems.dest_visor,1), "aca","aba","aaa", 'a', RiderItems.contract_advent, 'b', RiderItems.destwilder_advent, 'c', Items.diamond_sword);
		GameRegistry.addRecipe(new ItemStack(RiderItems.gazelle_visor,1), "aca","aba","aaa", 'a', RiderItems.contract_advent, 'b', RiderItems.gigazelle_advent, 'c', Items.diamond_sword);
		GameRegistry.addRecipe(new ItemStack(RiderItems.gold_visor,1), "aca","aba","aaa", 'a', RiderItems.contract_advent, 'b', RiderItems.goldphoenix_advent, 'c', Items.diamond_sword);
		GameRegistry.addRecipe(new ItemStack(RiderItems.blanc_visor,1), "aca","aba","aaa", 'a', RiderItems.contract_advent, 'b', RiderItems.blancwing_advent, 'c', Items.diamond_sword);
		GameRegistry.addRecipe(new ItemStack(RiderItems.bio_visor,1), "aca","aba","aaa", 'a', RiderItems.contract_advent, 'b', RiderItems.biogreeza_advent, 'c', Items.diamond_sword);
		GameRegistry.addRecipe(new ItemStack(RiderItems.dark_drag_visor,1), "aca","aba","aaa", 'a', RiderItems.contract_advent, 'b', RiderItems.dragblacker_advent, 'c', Items.diamond_sword);
		GameRegistry.addRecipe(new ItemStack(RiderItems.abyss_visor,1), "aca","aba","aaa", 'a', RiderItems.contract_advent, 'b', RiderItems.abysslasher_advent, 'c', Items.diamond_sword);
		
		
		
		GameRegistry.addRecipe(new ItemStack(RiderItems.bladehead,1), "aaa","a a", 'a', RiderItems.bladecard, 'b', Items.diamond_helmet);
		GameRegistry.addRecipe(new ItemStack(RiderItems.bladetroso,1), "a a","aaa","aaa", 'a', RiderItems.bladecard, 'b', Items.diamond_chestplate);
		GameRegistry.addRecipe(new ItemStack(RiderItems.bladelegs,1), "aaa","a a","a a", 'a', RiderItems.bladecard, 'b', Items.diamond_leggings);
		
		GameRegistry.addRecipe(new ItemStack(RiderItems.bladedriver,1), "aaa","aca","aaa", 'a', RiderItems.bladecard, 'b', Items.diamond_boots, 'c', RiderItems.changebeetle, 'e', RiderItems.joker_memory);
		GameRegistry.addRecipe(new ItemStack(RiderItems.garrendriver,1), "aaa","aca","aaa", 'a', RiderItems.bladecard, 'b', Items.diamond_boots, 'c', RiderItems.change_stag, 'e', RiderItems.joker_memory);
		GameRegistry.addRecipe(new ItemStack(RiderItems.leangle_belt,1), "aaa","aca","aaa", 'a', RiderItems.bladecard, 'b', Items.diamond_boots, 'c', RiderItems.change_spider, 'e', RiderItems.joker_memory);
		GameRegistry.addRecipe(new ItemStack(RiderItems.chalicerouzer,1), "aaa","aca","aaa", 'a', RiderItems.bladecard, 'b', Items.diamond_boots, 'c', RiderItems.change_mantis, 'e', RiderItems.joker_memory);
		GameRegistry.addRecipe(new ItemStack(RiderItems.glaive_buckle,1), "aaa","aca","aaa", 'a', RiderItems.bladecard, 'b', Items.diamond_boots, 'c', RiderItems.changekerberosglaive, 'e', RiderItems.joker_memory);
		GameRegistry.addRecipe(new ItemStack(RiderItems.lance_buckle,1), "aaa","aca","aaa", 'a', RiderItems.bladecard, 'b', Items.diamond_boots, 'c', RiderItems.changekerberoslance, 'e', RiderItems.joker_memory);
		GameRegistry.addRecipe(new ItemStack(RiderItems.larc_buckle,1), "aaa","aca","aaa", 'a', RiderItems.bladecard, 'b', Items.diamond_boots, 'c', RiderItems.changekerberoslarc, 'e', RiderItems.joker_memory);
		
		GameRegistry.addRecipe(new ItemStack(RiderItems.rouze_absorber,1), "aaa","aca","aaa", 'a', RiderItems.bladecard, 'b', Items.diamond_boots, 'c', RiderItems.fusion_eagle);
		GameRegistry.addRecipe(new ItemStack(RiderItems.garren_absorber,1), "aaa","aca","aaa", 'a', RiderItems.bladecard, 'b', Items.diamond_boots, 'c', RiderItems.fusion_peacock);
		
		GameRegistry.addRecipe(new ItemStack(RiderItems.blayrouzer,1), "ama","aba","aaa", 'a', RiderItems.bladecard, 'b', Items.diamond_sword, 'm', RiderItems.changebeetle);
		GameRegistry.addRecipe(new ItemStack(RiderItems.garrenrouzer,1), "ama","aba","aaa", 'a', RiderItems.bladecard, 'b', Items.diamond_sword, 'm', RiderItems.change_stag);
		GameRegistry.addRecipe(new ItemStack(RiderItems.leanglerouzer,1), "ama","aba","aaa", 'a', RiderItems.bladecard, 'b', Items.diamond_sword, 'm', RiderItems.change_spider);
		GameRegistry.addRecipe(new ItemStack(RiderItems.kingrouzer,1), "ama","aba","aaa", 'a', RiderItems.bladecard, 'b', Items.diamond_sword, 'm', RiderItems.evolution_caucasus);
		GameRegistry.addRecipe(new ItemStack(RiderItems.chalice_arrow,1), "ama","aba","aaa", 'a', RiderItems.bladecard, 'b', Items.diamond_sword, 'm', RiderItems.change_mantis);
		GameRegistry.addRecipe(new ItemStack(RiderItems.wild_slasher,1), "ama","aba","aaa", 'a', RiderItems.bladecard, 'b', Items.diamond_sword, 'm', RiderItems.evolution_paradoxa);

		GameRegistry.addShapelessRecipe(new ItemStack(RiderItems.wild_chalice_arrow,1), RiderItems.chalice_arrow,RiderItems.wild_slasher,RiderItems.wild_slasher);
		
		GameRegistry.addRecipe(new ItemStack(RiderItems.faizhead,1), "aaa","a a", 'a', RiderItems.blank_mission_memory, 'b', Items.diamond_helmet);
		GameRegistry.addRecipe(new ItemStack(RiderItems.faiztroso,1), "a a","aaa","aaa", 'a', RiderItems.blank_mission_memory, 'b', Items.diamond_chestplate);
		GameRegistry.addRecipe(new ItemStack(RiderItems.faizlegs,1), "aaa","a a","a a", 'a', RiderItems.blank_mission_memory, 'b', Items.diamond_leggings);
		GameRegistry.addRecipe(new ItemStack(RiderItems.faizdriver,1), "aaa","aca","aaa", 'a', RiderItems.blank_mission_memory, 'b', Items.diamond_boots, 'c', RiderItems.faiz_mission_memory, 'e', RiderItems.joker_memory);

		GameRegistry.addRecipe(new ItemStack(RiderItems.kaixadriver,1), "aaa","aca","aaa", 'a', RiderItems.blank_mission_memory, 'b', Items.diamond_boots, 'c', RiderItems.kaixa_mission_memory, 'e', RiderItems.joker_memory);
		GameRegistry.addRecipe(new ItemStack(RiderItems.deltadriver,1), "aaa","aca","aaa", 'a', RiderItems.blank_mission_memory, 'b', Items.diamond_boots, 'c', RiderItems.delta_mission_memory, 'e', RiderItems.joker_memory);
		GameRegistry.addRecipe(new ItemStack(RiderItems.psygadriver,1), "aaa","aca","aaa", 'a', RiderItems.blank_mission_memory, 'b', Items.diamond_boots, 'c', RiderItems.psyga_mission_memory, 'e', RiderItems.joker_memory);
		GameRegistry.addRecipe(new ItemStack(RiderItems.orgadriver,1), "aaa","aca","aaa", 'a', RiderItems.blank_mission_memory, 'b', Items.diamond_boots, 'c', RiderItems.orga_mission_memory, 'e', RiderItems.joker_memory);

		GameRegistry.addRecipe(new ItemStack(RiderItems.kabuto_kunai,1), "ama","aba","aaa", 'a', RiderItems.mini_zecter, 'b', Items.diamond_sword, 'm', RiderItems.kabuto_zecter);
		GameRegistry.addShapelessRecipe(new ItemStack(RiderItems.kabuto_kunai_kunai,1), RiderItems.kabuto_kunai);
		GameRegistry.addShapelessRecipe(new ItemStack(RiderItems.kabuto_kunai,1), RiderItems.kabuto_kunai_kunai);
		
		GameRegistry.addRecipe(new ItemStack(RiderItems.gatack_double_calibur,1), "ama","aba","aaa", 'a', RiderItems.mini_zecter, 'b', Items.diamond_sword, 'm', RiderItems.gatack_zecter);
		GameRegistry.addShapelessRecipe(new ItemStack(RiderItems.gatack_double_calibur_twin,1), RiderItems.gatack_double_calibur,RiderItems.gatack_double_calibur);
		GameRegistry.addRecipe(new ItemStack(RiderItems.sasword_yaiver,1), "ama","aba","aaa", 'a', RiderItems.mini_zecter, 'b', Items.diamond_sword, 'm', RiderItems.sasword_zecter);
		GameRegistry.addRecipe(new ItemStack(RiderItems.drake_grip,1), "ama","aba","aaa", 'a', RiderItems.mini_zecter, 'b', Items.diamond_sword, 'm', RiderItems.drake_zecter);

		GameRegistry.addRecipe(new ItemStack(RiderItems.drake_grip,1), "ama","aba","aaa", 'a', RiderItems.mini_zecter, 'b', Items.diamond_sword, 'm', RiderItems.drake_zecter);
		GameRegistry.addRecipe(new ItemStack(RiderItems.zect_kunai,1), "ama","aba","aaa", 'a', RiderItems.mini_zecter, 'b', Items.diamond_sword, 'm', RiderItems.dark_kabuto_zecter);
		GameRegistry.addShapelessRecipe(new ItemStack(RiderItems.zect_kunai_kunai,1), RiderItems.zect_kunai);
		GameRegistry.addShapelessRecipe(new ItemStack(RiderItems.zect_kunai,1), RiderItems.zect_kunai_kunai);
		GameRegistry.addRecipe(new ItemStack(RiderItems.clock_up_pad,1), "aaa","aba","aaa", 'a', RiderItems.mini_zecter, 'b', Blocks.iron_block, 'm', RiderItems.mini_zecter);
		GameRegistry.addRecipe(new ItemStack(RiderItems.zect_mizer,1), "aaa","aba","aaa", 'a', RiderItems.mini_zecter, 'b', Items.diamond_sword);
		
		GameRegistry.addRecipe(new ItemStack(RiderItems.perfect_zecter,1), "ama","cba","ada", 'a', RiderItems.mini_zecter, 'b', Items.diamond_sword, 'm', RiderItems.perfectdrake_zecter, 'c', RiderItems.perfectthebee_zecter, 'd', RiderItems.perfectsasword_zecter);
		
		GameRegistry.addRecipe(new ItemStack(RiderItems.kabutohead,1), "aaa","a a", 'a', RiderItems.mini_zecter, 'b', Items.diamond_helmet);
		GameRegistry.addRecipe(new ItemStack(RiderItems.kabutotroso,1), "a a","aaa","aaa", 'a', RiderItems.mini_zecter, 'b', Items.diamond_chestplate);
		GameRegistry.addRecipe(new ItemStack(RiderItems.kabutolegs,1), "aaa","a a","a a", 'a', RiderItems.mini_zecter, 'b', Items.diamond_leggings);
		GameRegistry.addRecipe(new ItemStack(RiderItems.kabuto_rider_belt,1), "aaa","aca","aaa", 'a', RiderItems.mini_zecter, 'b', Items.diamond_boots, 'c', RiderItems.kabuto_zecter);
		
		GameRegistry.addRecipe(new ItemStack(RiderItems.thebee_rider_belt,1), "aaa","aca","aaa", 'a', RiderItems.mini_zecter, 'b', Items.diamond_boots, 'c', RiderItems.thebee_zecter);
		GameRegistry.addRecipe(new ItemStack(RiderItems.drake_rider_belt,1), "aaa","aca","aaa", 'a', RiderItems.mini_zecter, 'b', Items.diamond_boots, 'c', RiderItems.drake_zecter);
		GameRegistry.addRecipe(new ItemStack(RiderItems.sasword_rider_belt,1), "aaa","aca","aaa", 'a', RiderItems.mini_zecter, 'b', Items.diamond_boots, 'c', RiderItems.sasword_zecter);
		
		GameRegistry.addRecipe(new ItemStack(RiderItems.gatack_rider_belt,1), "aaa","aca","aaa", 'a', RiderItems.mini_zecter, 'b', Items.diamond_boots, 'c', RiderItems.gatack_zecter);
		GameRegistry.addRecipe(new ItemStack(RiderItems.kickhopper_rider_belt,1), "aaa","aca","aaa", 'a', RiderItems.mini_zecter, 'b', Items.diamond_boots, 'c', RiderItems.kickhopper_zecter);
		GameRegistry.addRecipe(new ItemStack(RiderItems.puchhopper_rider_belt,1), "aaa","aca","aaa", 'a', RiderItems.mini_zecter, 'b', Items.diamond_boots, 'c', RiderItems.punchhopper_zecter);
		GameRegistry.addRecipe(new ItemStack(RiderItems.dark_kabuto_rider_belt,1), "aaa","aca","aaa", 'a', RiderItems.mini_zecter, 'b', Items.diamond_boots, 'c', RiderItems.dark_kabuto_zecter);

		GameRegistry.addRecipe(new ItemStack(RiderItems.hercus_rider_belt,1), "aaa","aca","aaa", 'a', RiderItems.unfinished_kabutick_zecter, 'b', Items.diamond_boots, 'c', RiderItems.hercus_zecter);
		GameRegistry.addRecipe(new ItemStack(RiderItems.ketaros_rider_belt,1), "aaa","aca","aaa", 'a', RiderItems.unfinished_kabutick_zecter, 'b', Items.diamond_boots, 'c', RiderItems.ketaros_zecter);
		GameRegistry.addRecipe(new ItemStack(RiderItems.caucasus_rider_belt,1), "aaa","aca","aaa", 'a', RiderItems.unfinished_kabutick_zecter, 'b', Items.diamond_boots, 'c', RiderItems.caucasus_zecter);

		
		GameRegistry.addRecipe(new ItemStack(RiderItems.den_ohead,1), "aaa","a a", 'a', RiderItems.imaginsand, 'b', Items.diamond_helmet);
		GameRegistry.addRecipe(new ItemStack(RiderItems.den_otroso,1), "a a","aaa","aaa", 'a', RiderItems.imaginsand, 'b', Items.diamond_chestplate);
		GameRegistry.addRecipe(new ItemStack(RiderItems.den_olegs,1), "aaa","a a","a a", 'a', RiderItems.imaginsand, 'b', Items.diamond_leggings);
		GameRegistry.addRecipe(new ItemStack(RiderItems.den_odriver,1), "aaa","aca","aaa", 'a', RiderItems.imaginsand, 'b', Items.diamond_boots, 'c', RiderItems.rider_ticket_sword, 'e', RiderItems.joker_memory);
		GameRegistry.addRecipe(new ItemStack(RiderItems.den_oriderpass,1), "aaa","aba","aaa", 'a', RiderItems.imaginsand, 'b', Items.ender_pearl);
		GameRegistry.addRecipe(new ItemStack(RiderItems.gden_oriderpass,1), "aca","aba","aaa", 'a', RiderItems.imaginsand, 'b', Items.ender_pearl, 'c', RiderItems.rider_ticket_g);
		GameRegistry.addRecipe(new ItemStack(RiderItems.den_o_master_pass,1), "aca","aba","aaa", 'a', RiderItems.imaginsand, 'b', Items.ender_pearl, 'c', RiderItems.rider_ticket_gaoh);
		
		GameRegistry.addRecipe(new ItemStack(RiderItems.newden_obelt,1), "aaa","aca","aaa", 'a', RiderItems.imaginsand, 'b', Items.diamond_boots, 'c', RiderItems.rider_ticket_strike, 'e', RiderItems.joker_memory);
		GameRegistry.addRecipe(new ItemStack(RiderItems.zeronosbelt,1), "aaa","aca","aaa", 'a', RiderItems.imaginsand, 'b', Items.diamond_boots, 'c', RiderItems.zeronos_altair_card, 'e', RiderItems.joker_memory);
		GameRegistry.addRecipe(new ItemStack(RiderItems.nega_den_odriver,1), "aaa","aca","aaa", 'a', RiderItems.imaginsand, 'b', Items.diamond_boots, 'c', RiderItems.rider_ticket_nega, 'e', RiderItems.joker_memory);
		GameRegistry.addRecipe(new ItemStack(RiderItems.yuukibelt_skull,1), "aca","aaa","aaa", 'a', RiderItems.imaginsand, 'b', Items.diamond_boots, 'c', RiderItems.rider_ticket_yuuki, 'e', RiderItems.joker_memory);
		GameRegistry.addRecipe(new ItemStack(RiderItems.yuukibelt_hijack,1), "aaa","aaa","aca", 'a', RiderItems.imaginsand, 'b', Items.diamond_boots, 'c', RiderItems.rider_ticket_yuuki, 'e', RiderItems.joker_memory);
		GameRegistry.addRecipe(new ItemStack(RiderItems.gden_odriver,1), "aaa","aca","aaa", 'a', RiderItems.imaginsand, 'b', Items.diamond_boots, 'c', RiderItems.rider_ticket_g, 'e', RiderItems.joker_memory);
		GameRegistry.addRecipe(new ItemStack(RiderItems.gaohbelt,1), "aaa","aca","aaa", 'a', RiderItems.imaginsand, 'b', Items.diamond_boots, 'c', RiderItems.rider_ticket_gaoh, 'e', RiderItems.joker_memory);
		
		GameRegistry.addRecipe(new ItemStack(RiderItems.kivahead,1), "aaa","a a", 'a', RiderItems.fuestle, 'b', Items.diamond_helmet);
		GameRegistry.addRecipe(new ItemStack(RiderItems.kivatroso,1), "a a","aaa","aaa", 'a', RiderItems.fuestle, 'b', Items.diamond_chestplate);
		GameRegistry.addRecipe(new ItemStack(RiderItems.kivalegs,1), "aaa","a a","a a", 'a', RiderItems.fuestle, 'b', Items.diamond_leggings);
		GameRegistry.addRecipe(new ItemStack(RiderItems.kivadriver,1), "aaa","aca","aaa", 'a', RiderItems.fuestle, 'b', Items.diamond_boots, 'c', RiderItems.wakeupfuestle, 'e', RiderItems.joker_memory);
		GameRegistry.addRecipe(new ItemStack(RiderItems.ixa_belt,1), "aaa","aca","aaa", 'a', RiderItems.fuestlefake, 'b', Items.diamond_boots, 'c', RiderItems.knucklefuestle, 'e', RiderItems.joker_memory);
		GameRegistry.addRecipe(new ItemStack(RiderItems.sagarc_belt,1), "aaa","aca","aaa", 'a', RiderItems.fuestle, 'b', Items.diamond_boots, 'c', RiderItems.sagafuestle, 'e', RiderItems.joker_memory);
		GameRegistry.addRecipe(new ItemStack(RiderItems.arcdriver,1), "aca","aaa","aaa", 'a', RiderItems.fuestlefake, 'b', Items.diamond_boots, 'c', RiderItems.keyfuestle, 'e', RiderItems.joker_memory);
		GameRegistry.addRecipe(new ItemStack(RiderItems.reydriver,1), "aaa","aaa","aca", 'a', RiderItems.fuestlefake, 'b', Items.diamond_boots, 'c', RiderItems.keyfuestle, 'e', RiderItems.joker_memory);
		GameRegistry.addRecipe(new ItemStack(RiderItems.darkkivadriver,1), "aaa","aca","aaa", 'a', RiderItems.fuestle, 'b', Items.diamond_boots, 'c', RiderItems.darkwakeupfuestle, 'e', RiderItems.joker_memory);
		GameRegistry.addRecipe(new ItemStack(RiderItems.newkivadriver,1), "aaa","aca","aaa", 'a', RiderItems.fuestle, 'b', Items.diamond_boots, 'c', RiderItems.newwakeupfuestle, 'e', RiderItems.joker_memory);
		
		GameRegistry.addRecipe(new ItemStack(RiderItems.garulu_saber,1), "ama","aba","aaa", 'a', RiderItems.fuestle, 'b', Items.diamond_sword, 'm', RiderItems.garulufuestle);
		GameRegistry.addRecipe(new ItemStack(RiderItems.basshaamagnum,1), "ama","aba","aaa", 'a', RiderItems.fuestle, 'b', Items.diamond_sword, 'm', RiderItems.basshaafuestle);
		GameRegistry.addRecipe(new ItemStack(RiderItems.dogga_hammer,1), "ama","aba","aaa", 'a', RiderItems.fuestle, 'b', Items.diamond_sword, 'm', RiderItems.doggafuestle);
		GameRegistry.addRecipe(new ItemStack(RiderItems.zanbatsword_core,1), "ama","aba","aaa", 'a', RiderItems.fuestle, 'b', Items.diamond_sword, 'm', RiderItems.fuestle);
		GameRegistry.addRecipe(new ItemStack(RiderItems.zanbatsword,1), "ama","aba","aaa", 'a', RiderItems.fuestle, 'b', RiderItems.zanbatsword_core, 'm', RiderItems.tatsulot);
		GameRegistry.addRecipe(new ItemStack(RiderItems.ixa_caliber,1), "ama","aba","aaa", 'a', RiderItems.fuestle, 'b', Items.diamond_sword, 'm', RiderItems.knucklefuestle);
		GameRegistry.addRecipe(new ItemStack(RiderItems.ixariser,1), "ama","aba","aaa", 'a', RiderItems.fuestle, 'b', Items.diamond_sword, 'm', RiderItems.risingfuestle);
		GameRegistry.addRecipe(new ItemStack(RiderItems.jacorder,1), "ama","aba","aaa", 'a', RiderItems.fuestle, 'b', Items.diamond_sword, 'm', RiderItems.sagafuestle);
		
		GameRegistry.addRecipe(new ItemStack(RiderItems.decadehead,1), "aaa","a a", 'a', RiderItems.blankcard);
		GameRegistry.addRecipe(new ItemStack(RiderItems.decadetroso,1), "a a","aaa","aaa", 'a', RiderItems.blankcard);
		GameRegistry.addRecipe(new ItemStack(RiderItems.decadelegs,1), "aaa","a a","a a", 'a', RiderItems.blankcard);
		GameRegistry.addRecipe(new ItemStack(RiderItems.decadedriver,1), "aaa","aca","aaa", 'a', RiderItems.blankcard, 'c', RiderItems.decadecard);
		GameRegistry.addRecipe(new ItemStack(RiderItems.ride_booker,1), "ama","aba","aaa", 'a', RiderItems.blankcard, 'b', Items.diamond_sword, 'm', RiderItems.decadecard);
		GameRegistry.addRecipe(new ItemStack(RiderItems.diend_driver,1), "ama","aba","aaa", 'a', RiderItems.blankcard, 'b', Items.diamond_sword, 'm', RiderItems.diendcard);
		GameRegistry.addRecipe(new ItemStack(RiderItems.dienddriver,1), "aaa","aca","aaa", 'a', RiderItems.blankcard, 'c', RiderItems.diendcard);
		GameRegistry.addRecipe(new ItemStack(RiderItems.dark_decadedriver,1), "aaa","aca","aaa", 'a', RiderItems.blankcard, 'c', RiderItems.darkdecadecard);
		GameRegistry.addShapelessRecipe(new ItemStack(RiderItems.ongekibo_rekka_decade,1), RiderItems.decadecard,RiderItems.ongekibo_rekka);
		GameRegistry.addShapelessRecipe(new ItemStack(RiderItems.ongekibo_rekka_diend,1), RiderItems.diendcard,RiderItems.ongekibo_rekka);
		
		GameRegistry.addShapelessRecipe(new ItemStack(RiderItems.dragon_kuugacard,1), RiderItems.kuugacard,RiderItems.kuuga_dragon);
		GameRegistry.addShapelessRecipe(new ItemStack(RiderItems.pegasus_kuugacard,1), RiderItems.kuugacard,RiderItems.kuuga_pegasus);
		GameRegistry.addShapelessRecipe(new ItemStack(RiderItems.titan_kuugacard,1), RiderItems.kuugacard,RiderItems.kuuga_titan);

		GameRegistry.addShapelessRecipe(new ItemStack(RiderItems.storm_agitocard,1), RiderItems.agitocard,RiderItems.agito_storm);
		GameRegistry.addShapelessRecipe(new ItemStack(RiderItems.flame_agitocard,1), RiderItems.agitocard,RiderItems.agito_flame);
		
		GameRegistry.addShapelessRecipe(new ItemStack(RiderItems.axel_faizcard,1), RiderItems.faizcard,RiderItems.faiz_axel_mission_memory);
		
		GameRegistry.addShapelessRecipe(new ItemStack(RiderItems.rod_den_ocard,1), RiderItems.den_ocard,RiderItems.rider_ticket_rod);
		GameRegistry.addShapelessRecipe(new ItemStack(RiderItems.axe_den_ocard,1), RiderItems.den_ocard,RiderItems.rider_ticket_ax);
		GameRegistry.addShapelessRecipe(new ItemStack(RiderItems.gun_den_ocard,1), RiderItems.den_ocard,RiderItems.rider_ticket_gun);
		GameRegistry.addShapelessRecipe(new ItemStack(RiderItems.wing_den_ocard,1), RiderItems.den_ocard,RiderItems.rider_ticket_wing);
		
		GameRegistry.addShapelessRecipe(new ItemStack(RiderItems.garulu_kivacard,1), RiderItems.kivacard,RiderItems.garulufuestle);
		GameRegistry.addShapelessRecipe(new ItemStack(RiderItems.basshaa_kivacard,1), RiderItems.kivacard,RiderItems.basshaafuestle);
		GameRegistry.addShapelessRecipe(new ItemStack(RiderItems.dogga_kivacard,1), RiderItems.kivacard,RiderItems.doggafuestle);
		
		GameRegistry.addShapelessRecipe(new ItemStack(RiderItems.ultimate_kuugacard,1), RiderItems.kuugacard,RiderItems.kuuga_ultimate);
		GameRegistry.addShapelessRecipe(new ItemStack(RiderItems.shining_agitocard,1), RiderItems.agitocard,RiderItems.agito_shining);
		GameRegistry.addShapelessRecipe(new ItemStack(RiderItems.survive_ryukicard,1), RiderItems.ryukicard,RiderItems.survive_advent);
		GameRegistry.addShapelessRecipe(new ItemStack(RiderItems.blaster_faizcard,1), RiderItems.faizcard,RiderItems.faiz_blaster_mission_memory);
		GameRegistry.addShapelessRecipe(new ItemStack(RiderItems.king_bladecard,1), RiderItems.bladecard_de,RiderItems.evolution_caucasus);
		GameRegistry.addShapelessRecipe(new ItemStack(RiderItems.armed_hibikicard,1), RiderItems.hibikicard,RiderItems.armed_saber);
		GameRegistry.addShapelessRecipe(new ItemStack(RiderItems.hyper_kabutocard,1), RiderItems.kabutocard,RiderItems.hyper_zecter);
		GameRegistry.addShapelessRecipe(new ItemStack(RiderItems.liner_den_ocard,1), RiderItems.den_ocard,RiderItems.rider_ticket);
		GameRegistry.addShapelessRecipe(new ItemStack(RiderItems.emperor_kivacard,1), RiderItems.kivacard,RiderItems.tatsulot);
		GameRegistry.addShapelessRecipe(new ItemStack(RiderItems.k_touch,1), RiderItems.ultimate_kuugacard,RiderItems.shining_agitocard,RiderItems.survive_ryukicard,RiderItems.blaster_faizcard,RiderItems.king_bladecard,RiderItems.armed_hibikicard,RiderItems.hyper_kabutocard,RiderItems.liner_den_ocard,RiderItems.emperor_kivacard);
		GameRegistry.addShapelessRecipe(new ItemStack(RiderItems.g4card,1), RiderItems.blankcard,RiderItems.g4);
		GameRegistry.addShapelessRecipe(new ItemStack(RiderItems.ryugacard,1), RiderItems.blankcard,RiderItems.dragblacker_advent);
		GameRegistry.addShapelessRecipe(new ItemStack(RiderItems.orgacard,1), RiderItems.blankcard,RiderItems.orga_mission_memory);
		GameRegistry.addShapelessRecipe(new ItemStack(RiderItems.glaivecard,1), RiderItems.blankcard,RiderItems.changekerberosglaive);
		GameRegistry.addShapelessRecipe(new ItemStack(RiderItems.kabukicard,1), RiderItems.blankcard,RiderItems.henshin_onsa_kabuki);
		GameRegistry.addShapelessRecipe(new ItemStack(RiderItems.caucasuscard,1), RiderItems.blankcard,RiderItems.caucasus_zecter);
		GameRegistry.addShapelessRecipe(new ItemStack(RiderItems.arccard,1), RiderItems.blankcard,RiderItems.keyfuestle);
		GameRegistry.addShapelessRecipe(new ItemStack(RiderItems.skullcard,1), RiderItems.blankcard,RiderItems.skull_memory);
		GameRegistry.addShapelessRecipe(new ItemStack(RiderItems.k_touch_diend,1), RiderItems.g4card,RiderItems.ryugacard,RiderItems.orgacard,RiderItems.glaivecard,RiderItems.kabukicard,RiderItems.caucasuscard,RiderItems.arccard,RiderItems.skullcard);
		
		GameRegistry.addRecipe(new ItemStack(RiderItems.OOOhead,1), "aaa","a a", 'a', RiderItems.cellmedal, 'b', Items.diamond_helmet);
		GameRegistry.addRecipe(new ItemStack(RiderItems.OOOtroso,1), "a a","aaa","aaa", 'a', RiderItems.cellmedal, 'b', Items.diamond_chestplate);
		GameRegistry.addRecipe(new ItemStack(RiderItems.OOOlegs,1), "aaa","a a","a a", 'a', RiderItems.cellmedal, 'b', Items.diamond_leggings);
		GameRegistry.addRecipe(new ItemStack(RiderItems.OOOdriver,1), "aaa","cde","aaa", 'a', RiderItems.cellmedal, 'b', Items.diamond_boots, 'c', RiderItems.taka, 'd', RiderItems.tora, 'e', RiderItems.batta);
		GameRegistry.addRecipe(new ItemStack(RiderItems.aqua_driver,1), "aaa","ada","aaa", 'a', RiderItems.cellmedal, 'd', Items.water_bucket);
		GameRegistry.addRecipe(new ItemStack(RiderItems.poseidon_driver,1), "cae","aaa","ada", 'a', RiderItems.cellmedal, 'b', Items.diamond_boots, 'c', RiderItems.same, 'd', RiderItems.ookamiuo, 'e', RiderItems.kujira);
		GameRegistry.addRecipe(new ItemStack(RiderItems.o_scanner,1), "aaa","aba","aaa", 'a', RiderItems.cellmedal, 'b', Items.ender_pearl);
		
		GameRegistry.addRecipe(new ItemStack(RiderItems.birth_driver,1), "aaa","aca","aaa", 'a', RiderItems.cellmedal, 'b', Items.diamond_boots, 'c', RiderItems.birth_core);
		GameRegistry.addRecipe(new ItemStack(RiderItems.birth_driver_prototype,1), "aaa","aca","aaa", 'a', RiderItems.cellmedal, 'b', Items.diamond_boots, 'c', RiderItems.proto_birth_core);
		GameRegistry.addRecipe(new ItemStack(RiderItems.birth_driver,1), "aaa","aca","aaa", 'a', RiderItems.cellmedal, 'b', Items.diamond_boots, 'c', RiderItems.birth_core);
		
		GameRegistry.addRecipe(new ItemStack(RiderItems.birth_buster,1), "ama","aba","aaa", 'a', RiderItems.cellmedal, 'b', Items.diamond_sword, 'm', RiderItems.birth_core);
		GameRegistry.addRecipe(new ItemStack(RiderItems.birth_buster,1), "ama","aba","aaa", 'a', RiderItems.cellmedal, 'b', Items.diamond_sword, 'm', RiderItems.proto_birth_core);
		
		GameRegistry.addRecipe(new ItemStack(RiderItems.deepest_harpoon,1), "cad","aba","aea", 'a', RiderItems.cellmedal, 'b', Items.diamond_sword, 'c', RiderItems.same, 'd', RiderItems.kujira, 'e', RiderItems.ookamiuo);

		GameRegistry.addRecipe(new ItemStack(RiderItems.Whead,1), "aaa","a a", 'a', RiderItems.gaiamemory, 'b', Items.diamond_helmet);
		GameRegistry.addRecipe(new ItemStack(RiderItems.Wtroso,1), "a a","aaa","aaa", 'a', RiderItems.gaiamemory, 'b', Items.diamond_chestplate);
		GameRegistry.addRecipe(new ItemStack(RiderItems.Wlegs,1), "aaa","a a","a a", 'a', RiderItems.gaiamemory, 'b', Items.diamond_leggings);
		GameRegistry.addRecipe(new ItemStack(RiderItems.Wdriver,1), "aaa","cae","aaa", 'a', RiderItems.gaiamemory, 'b', Items.diamond_boots, 'c', RiderItems.cyclone_memory, 'e', RiderItems.joker_memory);
		GameRegistry.addRecipe(new ItemStack(RiderItems.lostdriver,1), "aaa","aca","aaa", 'a', RiderItems.t2gaiamemory, 'b', Items.diamond_boots, 'c', RiderItems.joker_t2_memory);
		GameRegistry.addRecipe(new ItemStack(RiderItems.accel_driver,1), "aaa","aca","aaa", 'a', RiderItems.gaiamemory, 'b', Items.diamond_boots, 'c', RiderItems.accel_memory);

		GameRegistry.addRecipe(new ItemStack(RiderItems.Fourzehead,1), "aaa","a a", 'a', RiderItems.astroswitch, 'b', Items.diamond_helmet);
		GameRegistry.addRecipe(new ItemStack(RiderItems.Fourzetroso,1), "a a","aaa","aaa", 'a', RiderItems.astroswitch, 'b', Items.diamond_chestplate);
		GameRegistry.addRecipe(new ItemStack(RiderItems.Fourzelegs,1), "aaa","a a","a a", 'a', RiderItems.astroswitch, 'b', Items.diamond_leggings);
		GameRegistry.addRecipe(new ItemStack(RiderItems.Fourzedriver,1), "aaa","aca","aaa", 'a', RiderItems.astroswitch, 'b', Items.diamond_boots, 'c', RiderItems.rocket_swich);
		
		GameRegistry.addRecipe(new ItemStack(RiderItems.meteor_driver,1), "aaa","aca","aaa", 'a', RiderItems.gate_switch, 'b', Items.diamond_boots, 'c', RiderItems.meteor_swich);
		GameRegistry.addRecipe(new ItemStack(RiderItems.nadeshikodriver,1), "aaa","aca","aaa", 'a', RiderItems.gate_switch, 'b', Items.diamond_boots, 'c', RiderItems.solu_switch);

		GameRegistry.addRecipe(new ItemStack(RiderItems.wizardhead,1), "aaa","a a", 'a', RiderItems.wizardgem, 'b', Items.diamond_helmet);
		GameRegistry.addRecipe(new ItemStack(RiderItems.wizardtroso,1), "a a","aaa","aaa", 'a', RiderItems.wizardgem, 'b', Items.diamond_chestplate);
		GameRegistry.addRecipe(new ItemStack(RiderItems.wizardlegs,1), "aaa","a a","a a", 'a', RiderItems.wizardgem, 'b', Items.diamond_leggings);
		GameRegistry.addRecipe(new ItemStack(RiderItems.wizardriver,1), "afa","law","aha", 'a', RiderItems.wizardgem, 'b', Items.diamond_boots, 'f', RiderItems.flame_ring,'w', RiderItems.water_ring,'l', RiderItems.land_ring,'h', RiderItems.hurricane_ring);

		GameRegistry.addRecipe(new ItemStack(RiderItems.whitewizardriver,1), "aaa","afa","aaa", 'a', RiderItems.wizardgem2, 'b', Items.diamond_boots, 'f', RiderItems.wiseman_ring);
		GameRegistry.addRecipe(new ItemStack(RiderItems.whitewizardriverf,1), "aaa","afa","aaa", 'a', RiderItems.wizardgem2, 'b', Items.diamond_boots, 'f', RiderItems.hope_ring);
		GameRegistry.addRecipe(new ItemStack(RiderItems.magewizardriver,1), "aaa","afa","aaa", 'a', RiderItems.wizardgem2, 'b', Items.diamond_boots, 'f', RiderItems.mage_o_ring);
		GameRegistry.addRecipe(new ItemStack(RiderItems.magewizardriver_b,1),"aaa","afa","aaa", 'a', RiderItems.wizardgem2, 'b', Items.diamond_boots, 'f', RiderItems.mage_b_ring);
		GameRegistry.addRecipe(new ItemStack(RiderItems.magewizardriver_g,1), "aaa","afa","aaa", 'a', RiderItems.wizardgem2, 'b', Items.diamond_boots, 'f', RiderItems.mage_g_ring);
		GameRegistry.addRecipe(new ItemStack(RiderItems.sorcererdriver,1), "aaa","afa","aaa", 'a', RiderItems.wizardgem2, 'b', Items.diamond_boots, 'f', RiderItems.sorcerer_ring);
		GameRegistry.addRecipe(new ItemStack(RiderItems.blackwizardriver,1), "aaa","afa","aaa", 'a', RiderItems.wizardgem2, 'b', Items.diamond_boots, 'f', RiderItems.black_ring);
		GameRegistry.addRecipe(new ItemStack(RiderItems.darkwizardriver,1), "aaa","afa","aaa", 'a', RiderItems.wizardgem2, 'b', Items.diamond_boots, 'f', RiderItems.dark_ring);
		
		GameRegistry.addRecipe(new ItemStack(RiderItems.drago_timer,1), "aca","fad","aea", 'a', RiderItems.wizardgem, 'c', RiderItems.flame_ring_dragon, 'd', RiderItems.water_ring_dragon, 'e', RiderItems.hurricane_ring_dragon, 'f', RiderItems.land_ring_dragon);
		
		GameRegistry.addRecipe(new ItemStack(RiderItems.beastdriver,1), "aaa","afa","aaa", 'a', RiderItems.wizardgem2, 'b', Items.diamond_boots, 'f', RiderItems.beast_ring);
		
		GameRegistry.addRecipe(new ItemStack(RiderItems.light_ring,1), "aaa","afa","aaa", 'a', RiderItems.wizardgem, 'f', Blocks.torch);
		GameRegistry.addRecipe(new ItemStack(RiderItems.explosion_ring,1), "aaa","afa","aaa", 'a', RiderItems.wizardgem, 'f', Blocks.tnt);
		GameRegistry.addRecipe(new ItemStack(RiderItems.bind_ring,1), "aaa","afa","aaa", 'a', RiderItems.wizardgem, 'f', Items.string);
		GameRegistry.addRecipe(new ItemStack(RiderItems.teleport_ring,1), "aaa","afa","aaa", 'a', RiderItems.wizardgem, 'f', Items.ender_pearl);
		GameRegistry.addRecipe(new ItemStack(RiderItems.liquid_ring,1), "aaa","afa","aaa", 'a', RiderItems.wizardgem, 'f', Items.water_bucket);
		GameRegistry.addRecipe(new ItemStack(RiderItems.drill_ring,1), "aaa","afa","aaa", 'a', RiderItems.wizardgem, 'f', Items.golden_pickaxe);
		GameRegistry.addRecipe(new ItemStack(RiderItems.fall_ring,1), "aaa","afa","aaa", 'a', RiderItems.wizardgem, 'f', Items.golden_shovel);
		GameRegistry.addRecipe(new ItemStack(RiderItems.kick_strike_ring,1), "aaa","afa","aaa", 'a', RiderItems.wizardgem, 'f', Items.golden_boots);
		GameRegistry.addRecipe(new ItemStack(RiderItems.sleep_ring,1), "aaa","afa","aaa", 'a', RiderItems.wizardgem, 'f', Blocks.bed);
		GameRegistry.addRecipe(new ItemStack(RiderItems.defend_ring,1), "aaa","afa","aaa", 'a', RiderItems.wizardgem, 'f', Blocks.cobblestone_wall);
		GameRegistry.addRecipe(new ItemStack(RiderItems.eclipse_ring,1), "aaa","afa","aaa", 'a', RiderItems.wizardgem, 'f', Blocks.redstone_torch);		
		GameRegistry.addRecipe(new ItemStack(RiderItems.thunder_ring,1), "aaa","afa","aaa", 'a', RiderItems.wizardgem, 'f', Items.iron_ingot);
		GameRegistry.addRecipe(new ItemStack(RiderItems.excite_ring,1), "aaa","afa","aaa", 'a', RiderItems.wizardgem, 'f', Items.sugar);
		
		
		GameRegistry.addRecipe(new ItemStack(RiderItems.Gaimhead,1), "aaa","a a", 'a', RiderItems.himawari_lockseed, 'b', Items.diamond_helmet);
		GameRegistry.addRecipe(new ItemStack(RiderItems.Gaimtroso,1), "a a","aaa","aaa", 'a', RiderItems.himawari_lockseed, 'b', Items.diamond_chestplate);
		GameRegistry.addRecipe(new ItemStack(RiderItems.Gaimlegs,1), "aaa","a a","a a", 'a', RiderItems.himawari_lockseed, 'b', Items.diamond_leggings);

		GameRegistry.addRecipe(new ItemStack(RiderItems.sengoku_driver_gaim,1), "aaa","aca","aaa", 'a', RiderItems.himawari_lockseed, 'b', Items.diamond_boots, 'c', RiderItems.orange_lockseed);
		GameRegistry.addRecipe(new ItemStack(RiderItems.sengoku_driver_baron,1), "aaa","aca","aaa", 'a', RiderItems.himawari_lockseed, 'b', Items.diamond_boots, 'c', RiderItems.banana_lockseed);
		GameRegistry.addRecipe(new ItemStack(RiderItems.sengoku_driver_bujin_gaim,1), "aaa","aca","aaa", 'a', RiderItems.himawari_lockseed, 'b', Items.diamond_boots, 'c', RiderItems.blood_orange_lockseed);
		GameRegistry.addRecipe(new ItemStack(RiderItems.sengoku_driver_fifteen,1), "aaa","aca","aaa", 'a', RiderItems.himawari_lockseed, 'b', Items.diamond_boots, 'c', RiderItems.fifteen_lockseed);
		GameRegistry.addRecipe(new ItemStack(RiderItems.sengoku_driver_gridon,1), "aaa","aca","aaa", 'a', RiderItems.himawari_lockseed, 'b', Items.diamond_boots, 'c', RiderItems.donguri_lockseed);
		GameRegistry.addRecipe(new ItemStack(RiderItems.sengoku_driver_knuckle,1), "aaa","aca","aaa", 'a', RiderItems.himawari_lockseed, 'b', Items.diamond_boots, 'c', RiderItems.kurumi_lockseed);
		GameRegistry.addRecipe(new ItemStack(RiderItems.sengoku_driver_kurokage,1), "aaa","aca","aaa", 'a', RiderItems.himawari_lockseed, 'b', Items.diamond_boots, 'c', RiderItems.matsubokkuri_lockseed);
		GameRegistry.addRecipe(new ItemStack(RiderItems.sengoku_driver_ryugen,1), "aaa","aca","aaa", 'a', RiderItems.himawari_lockseed, 'b', Items.diamond_boots, 'c', RiderItems.budou_lockseed);
		GameRegistry.addRecipe(new ItemStack(RiderItems.sengoku_driver_zangetsu,1), "aaa","aca","aaa", 'a', RiderItems.himawari_lockseed, 'b', Items.diamond_boots, 'c', RiderItems.melon_lockseed);

		GameRegistry.addRecipe(new ItemStack(RiderItems.sengoku_driver_duke,1), "aaa","aca","aaa", 'a', RiderItems.himawari_lockseed, 'b', Items.diamond_boots, 'c', RiderItems.lemon_lockseed);
		GameRegistry.addRecipe(new ItemStack(RiderItems.sengoku_driver_idunn,1), "aaa","aca","aaa", 'a', RiderItems.himawari_lockseed, 'b', Items.diamond_boots, 'c', RiderItems.forbidden_ringo_lockseed);
		GameRegistry.addRecipe(new ItemStack(RiderItems.sengoku_driver_jam,1), "aaa","aca","aaa", 'a', RiderItems.himawari_lockseed, 'b', Items.diamond_boots, 'c', RiderItems.black_ringo_lockseed);
		GameRegistry.addRecipe(new ItemStack(RiderItems.sengoku_driver_barvo,1), "aaa","aca","aaa", 'a', RiderItems.himawari_lockseed, 'b', Items.diamond_boots, 'c', RiderItems.durian_lockseed);
		GameRegistry.addRecipe(new ItemStack(RiderItems.sengoku_driver_kamuro,1), "aaa","aca","aaa", 'a', RiderItems.himawari_lockseed, 'b', Items.diamond_boots, 'c', RiderItems.silver_ringo_lockseed);
		GameRegistry.addRecipe(new ItemStack(RiderItems.sengoku_driver_mars,1), "aaa","aca","aaa", 'a', RiderItems.himawari_lockseed, 'b', Items.diamond_boots, 'c', RiderItems.golden_ringo_lockseed);
		GameRegistry.addRecipe(new ItemStack(RiderItems.sengoku_driver_savior,1), "aaa","acb","aaa", 'a', RiderItems.himawari_lockseed, 'b', Items.diamond_boots, 'c', RiderItems.zakuro_lockseed, 'b', RiderItems.blood_orange_lockseed);
		GameRegistry.addRecipe(new ItemStack(RiderItems.sengoku_driver_maja,1), "aaa","aca","aaa", 'a', RiderItems.himawari_lockseed, 'b', Items.diamond_boots, 'c', RiderItems.maja_lockseed);
		GameRegistry.addRecipe(new ItemStack(RiderItems.sengoku_driver_baron_black,1), "aaa","aca","aaa", 'a', RiderItems.himawari_lockseed, 'b', Items.diamond_boots, 'c', RiderItems.black_baron_lockseed);
		GameRegistry.addRecipe(new ItemStack(RiderItems.sengoku_driver_gaim_natsumikan,1), "aaa","aca","aaa", 'a', RiderItems.himawari_lockseed, 'b', Items.diamond_boots, 'c', RiderItems.natsumikan_lockseed);
		
		GameRegistry.addRecipe(new ItemStack(RiderItems.genesis_driver_duke,1), "aaa","aca","aaa", 'a', RiderItems.himawari_energy_lockseed, 'b', Items.diamond_boots, 'c', RiderItems.lemon_energy_lockseed);
		GameRegistry.addRecipe(new ItemStack(RiderItems.genesis_driver_sigurd,1), "aaa","aca","aaa", 'a', RiderItems.himawari_energy_lockseed, 'b', Items.diamond_boots, 'c', RiderItems.cherry_energy_lockseed);
		GameRegistry.addRecipe(new ItemStack(RiderItems.genesis_driver_marika,1), "aaa","aca","aaa", 'a', RiderItems.himawari_energy_lockseed, 'b', Items.diamond_boots, 'c', RiderItems.peach_energy_lockseed);
		GameRegistry.addRecipe(new ItemStack(RiderItems.genesis_driver_zangetsu_shin,1), "aaa","aca","aaa", 'a', RiderItems.himawari_energy_lockseed, 'b', Items.diamond_boots, 'c', RiderItems.melon_energy_lockseed);
		GameRegistry.addRecipe(new ItemStack(RiderItems.genesis_driver_kurokage_shin,1), "aaa","aca","aaa", 'a', RiderItems.himawari_energy_lockseed, 'b', Items.diamond_boots, 'c', RiderItems.matsubokkuri_energy_lockseed);
		GameRegistry.addRecipe(new ItemStack(RiderItems.genesis_driver_baron,1), "aaa","aca","aba", 'a', RiderItems.himawari_energy_lockseed, 'b', RiderItems.banana_lockseed, 'c', RiderItems.lemon_energy_lockseed);
		GameRegistry.addRecipe(new ItemStack(RiderItems.genesis_driver_tyrant,1), "aaa","aca","aaa", 'a', RiderItems.himawari_energy_lockseed, 'b', Items.diamond_boots, 'c', RiderItems.dragon_fruits_energy_lockseed);
		
		GameRegistry.addRecipe(new ItemStack(RiderItems.rider_ichigo_lockseed,1), "aaa","aba","aaa", 'a', RiderItems.himawari_lockseed, 'b', RiderItems.rider_circuit);
		GameRegistry.addRecipe(new ItemStack(RiderItems.kuuga_lockseed,1), "aaa","aba","aaa", 'a', RiderItems.himawari_lockseed, 'b', RiderItems.kuuga_mighty);
		GameRegistry.addRecipe(new ItemStack(RiderItems.agito_lockseed,1), "aaa","aba","aaa", 'a', RiderItems.himawari_lockseed, 'b', RiderItems.agito_ground);
		GameRegistry.addRecipe(new ItemStack(RiderItems.ryuki_lockseed,1), "aaa","aba","aaa", 'a', RiderItems.himawari_lockseed, 'b', RiderItems.dragreder_advent);
		GameRegistry.addRecipe(new ItemStack(RiderItems.faiz_lockseed,1), "aaa","aba","aaa", 'a', RiderItems.himawari_lockseed, 'b', RiderItems.faiz_mission_memory);
		GameRegistry.addRecipe(new ItemStack(RiderItems.blade_lockseed,1), "aaa","aba","aaa", 'a', RiderItems.himawari_lockseed, 'b', RiderItems.changebeetle);
		GameRegistry.addRecipe(new ItemStack(RiderItems.hibiki_lockseed,1), "aaa","aba","aaa", 'a', RiderItems.himawari_lockseed, 'b', RiderItems.henshin_onsa);
		GameRegistry.addRecipe(new ItemStack(RiderItems.kaubuto_lockseed,1), "aaa","aba","aaa", 'a', RiderItems.himawari_lockseed, 'b', RiderItems.kabuto_zecter);
		GameRegistry.addRecipe(new ItemStack(RiderItems.den_o_lockseed,1), "aaa","aba","aaa", 'a', RiderItems.himawari_lockseed, 'b', RiderItems.rider_ticket_sword);
		GameRegistry.addRecipe(new ItemStack(RiderItems.kiva_lockseed,1), "aaa","aba","aaa", 'a', RiderItems.himawari_lockseed, 'b', RiderItems.wakeupfuestle);
		GameRegistry.addRecipe(new ItemStack(RiderItems.decade_lockseed,1), "aaa","aba","aaa", 'a', RiderItems.himawari_lockseed, 'b', RiderItems.decadecard);
		GameRegistry.addRecipe(new ItemStack(RiderItems.w_lockseed,1), "aaa","aba","aaa", 'a', RiderItems.himawari_lockseed, 'b', RiderItems.joker_memory);
		GameRegistry.addRecipe(new ItemStack(RiderItems.ooo_lockseed,1), "aaa","aba","aaa", 'a', RiderItems.himawari_lockseed, 'b', RiderItems.taka);
		GameRegistry.addRecipe(new ItemStack(RiderItems.fourze_lockseed,1), "aaa","aba","aaa", 'a', RiderItems.himawari_lockseed, 'b', RiderItems.rocket_swich);
		GameRegistry.addRecipe(new ItemStack(RiderItems.wizard_lockseed,1), "aaa","aba","aaa", 'a', RiderItems.himawari_lockseed, 'b', RiderItems.flame_ring);
		GameRegistry.addRecipe(new ItemStack(RiderItems.gaim_lockseed,1), "aaa","aba","aaa", 'a', RiderItems.orange_lockseed, 'b', RiderItems.himawari_lockseed);
		GameRegistry.addRecipe(new ItemStack(RiderItems.drive_lockseed,1), "aaa","aba","aaa", 'a', RiderItems.himawari_lockseed, 'b', RiderItems.speedshift);
		
		GameRegistry.addRecipe(new ItemStack(RiderItems.metal_shaft,1), "ama","aba","aaa", 'a', RiderItems.gaiamemory, 'b', Items.diamond_sword, 'm', RiderItems.metal_memory);
		GameRegistry.addRecipe(new ItemStack(RiderItems.medajalibur,1), "aaa","aba","aaa", 'a', RiderItems.cellmedal, 'b', Items.diamond_sword);
		GameRegistry.addRecipe(new ItemStack(RiderItems.tajaspinner,1), "pat","pbt","aaa", 'a', RiderItems.taka, 'b', Items.diamond_sword, 'p', RiderItems.condor, 't', RiderItems.kujaku);
		GameRegistry.addRecipe(new ItemStack(RiderItems.medagaburyu,1), "ptr","aba","aaa", 'a', RiderItems.cellmedal, 'b', Items.diamond_sword, 'p', RiderItems.ptera, 't', RiderItems.tricera, 'r', RiderItems.tyranno);
		GameRegistry.addRecipe(new ItemStack(RiderItems.rocket,1), "ama","aba","aaa", 'a', RiderItems.astroswitch, 'b', Items.diamond_sword, 'm', RiderItems.rocket_swich);
		GameRegistry.addRecipe(new ItemStack(RiderItems.billytherod,1), "ama","aba","aaa", 'a', RiderItems.astroswitch, 'b', Items.diamond_sword, 'm', RiderItems.elek_swich);
		GameRegistry.addRecipe(new ItemStack(RiderItems.hee_hackgun,1), "ama","aba","aaa", 'a', RiderItems.astroswitch, 'b', Items.diamond_sword, 'm', RiderItems.fire_swich);
		GameRegistry.addRecipe(new ItemStack(RiderItems.barizun_sword,1), "ama","aba","aaa", 'a', RiderItems.astroswitch, 'b', Items.diamond_sword, 'm', RiderItems.cosmic_swich);
		GameRegistry.addRecipe(new ItemStack(RiderItems.wizarswordgun,1), "aaa","aba","aaa", 'a', RiderItems.wizardgem, 'b', Items.diamond_sword);
		GameRegistry.addRecipe(new ItemStack(RiderItems.axcalibur,1), "ama","aba","aaa", 'a', RiderItems.wizardgem, 'b', Items.diamond_sword, 'm', RiderItems.infinity_ring);
		GameRegistry.addRecipe(new ItemStack(RiderItems.dice_saber,1), "ama","aba","aaa", 'a', RiderItems.wizardgem, 'b', Items.diamond_sword, 'm', RiderItems.beast_ring);
		GameRegistry.addRecipe(new ItemStack(RiderItems.mirage_magnum,1), "ama","aba","aaa", 'a', RiderItems.wizardgem, 'b', Items.diamond_sword, 'm', RiderItems.hyper_ring);
		GameRegistry.addRecipe(new ItemStack(RiderItems.dis_halberd,1), "ama","aba","aaa", 'a', RiderItems.wizardgem, 'b', Items.diamond_sword, 'm', RiderItems.sorcerer_ring);
		GameRegistry.addRecipe(new ItemStack(RiderItems.hammelcane,1), "ama","aba","aaa", 'a', RiderItems.wizardgem, 'b', Items.diamond_sword, 'm', RiderItems.wiseman_ring);
		GameRegistry.addRecipe(new ItemStack(RiderItems.wizarswordgun_mage,1), "ama","aba","aaa", 'a', RiderItems.wizardgem, 'b', Items.diamond_sword, 'm', RiderItems.mage_b_ring);
		GameRegistry.addRecipe(new ItemStack(RiderItems.wizarswordgun_mage,1), "ama","aba","aaa", 'a', RiderItems.wizardgem, 'b', Items.diamond_sword, 'm', RiderItems.mage_o_ring);
		GameRegistry.addRecipe(new ItemStack(RiderItems.wizarswordgun_mage,1), "ama","aba","aaa", 'a', RiderItems.wizardgem, 'b', Items.diamond_sword, 'm', RiderItems.mage_g_ring);
		GameRegistry.addRecipe(new ItemStack(RiderItems.trigger_magnum,1), "ama","aba","aaa", 'a', RiderItems.gaiamemory, 'b', Items.diamond_sword, 'm', RiderItems.trigger_memory);
		GameRegistry.addRecipe(new ItemStack(RiderItems.prism_bicker,1), "ama","aba","aaa", 'a', RiderItems.gaiamemory, 'b', Items.diamond_sword, 'm', RiderItems.prism_memory);
		GameRegistry.addRecipe(new ItemStack(RiderItems.eternal_edge,1), "ama","aba","aaa", 'a', RiderItems.gaiamemory, 'b', Items.diamond_sword, 'm', RiderItems.eternal_t2_memory);
		GameRegistry.addRecipe(new ItemStack(RiderItems.skull_magnum,1), "ama","aba","aaa", 'a', RiderItems.gaiamemory, 'b', Items.diamond_sword, 'm', RiderItems.skull_memory);
		GameRegistry.addRecipe(new ItemStack(RiderItems.engine_blade,1), "ama","aba","aaa", 'a', RiderItems.gaiamemory, 'b', Items.diamond_sword, 'm', RiderItems.engine_memory);
		
		GameRegistry.addRecipe(new ItemStack(RiderItems.faiz_edge,1), "ama","aba","aaa", 'a', RiderItems.blank_mission_memory, 'b', Items.diamond_sword, 'm', RiderItems.faiz_mission_memory);
		GameRegistry.addRecipe(new ItemStack(RiderItems.axel_ray_gun,1), "aaa","aba","aaa", 'a', RiderItems.blank_mission_memory, 'b', Items.diamond_sword);
		GameRegistry.addRecipe(new ItemStack(RiderItems.faiz_blaster,1), "ama","aba","aaa", 'a', RiderItems.blank_mission_memory, 'b', Items.diamond_sword, 'm', RiderItems.faiz_blaster_mission_memory);
		
		GameRegistry.addRecipe(new ItemStack(RiderItems.kaixa_blaygun,1), "ama","aba","aaa", 'a', RiderItems.blank_mission_memory, 'b', Items.diamond_sword, 'm', RiderItems.kaixa_mission_memory);
		GameRegistry.addRecipe(new ItemStack(RiderItems.deltablaster,1), "ama","aba","aaa", 'a', RiderItems.blank_mission_memory, 'b', Items.diamond_sword, 'm', RiderItems.delta_mission_memory);
		GameRegistry.addRecipe(new ItemStack(RiderItems.psyga_tonfa_edge,1), "ama","aba","aaa", 'a', RiderItems.blank_mission_memory, 'b', Items.diamond_sword, 'm', RiderItems.psyga_mission_memory);
		
		GameRegistry.addRecipe(new ItemStack(RiderItems.orga_stlanzer,1), "ama","aba","aaa", 'a', RiderItems.blank_mission_memory, 'b', Items.diamond_sword, 'm', RiderItems.orga_mission_memory);

		GameRegistry.addRecipe(new ItemStack(RiderItems.blayrouzer,1), "ama","aba","aaa", 'a', RiderItems.bladecard, 'b', Items.diamond_sword, 'm', RiderItems.changebeetle);
		GameRegistry.addRecipe(new ItemStack(RiderItems.kingrouzer,1), "ama","aba","aaa", 'a', RiderItems.bladecard, 'b', Items.diamond_sword, 'm', RiderItems.evolution_caucasus);
		
		GameRegistry.addRecipe(new ItemStack(RiderItems.den_denso,1), "ama","aba","aaa", 'a', RiderItems.imaginsand, 'b', Items.diamond_sword, 'm', RiderItems.rider_ticket_sword);
		GameRegistry.addRecipe(new ItemStack(RiderItems.den_denaxe,1), "ama","aba","aaa", 'a', RiderItems.imaginsand, 'b', Items.diamond_sword, 'm', RiderItems.rider_ticket_ax);
		GameRegistry.addRecipe(new ItemStack(RiderItems.den_denro,1), "ama","aba","aaa", 'a', RiderItems.imaginsand, 'b', Items.diamond_sword, 'm', RiderItems.rider_ticket_rod);
		GameRegistry.addRecipe(new ItemStack(RiderItems.den_dengu,1), "ama","aba","aaa", 'a', RiderItems.imaginsand, 'b', Items.diamond_sword, 'm', RiderItems.rider_ticket_gun);
		GameRegistry.addRecipe(new ItemStack(RiderItems.denkamen_sword,1), "ama","aba","aaa", 'a', RiderItems.imaginsand, 'b', Items.diamond_sword, 'm', RiderItems.rider_ticket);
		GameRegistry.addRecipe(new ItemStack(RiderItems.gaoh_gasher,1), "ama","aba","aaa", 'a', RiderItems.imaginsand, 'b', Items.diamond_sword, 'm', RiderItems.rider_ticket_gaoh);
		GameRegistry.addRecipe(new ItemStack(RiderItems.den_gasher_vega,1), "ama","aba","aaa", 'a', RiderItems.imaginsand, 'b', Items.diamond_sword, 'm', RiderItems.zeronos_vega_card);
		GameRegistry.addRecipe(new ItemStack(RiderItems.den_denhandaxe,1), "ama","aba","aaa", 'a', RiderItems.imaginsand, 'b', Items.diamond_sword, 'm', RiderItems.rider_ticket_wing);
		GameRegistry.addRecipe(new ItemStack(RiderItems.den_denboomerang,1), "aaa","aba","ama", 'a', RiderItems.imaginsand, 'b', Items.diamond_sword, 'm', RiderItems.rider_ticket_wing);
		GameRegistry.addRecipe(new ItemStack(RiderItems.momotaken,1), "aaa","aba","aaa", 'a', RiderItems.rider_ticket_sword, 'b', Items.diamond_sword);
		GameRegistry.addRecipe(new ItemStack(RiderItems.uratazao,1), "aaa","aba","aaa", 'a', RiderItems.rider_ticket_rod, 'b', Items.diamond_sword);
		GameRegistry.addRecipe(new ItemStack(RiderItems.kintaono,1), "aaa","aba","aaa", 'a', RiderItems.rider_ticket_ax, 'b', Items.diamond_sword);
		GameRegistry.addRecipe(new ItemStack(RiderItems.den_denhijack,1), "aaa","aba","ama", 'a', RiderItems.imaginsand, 'b', Items.diamond_sword, 'm', RiderItems.rider_ticket_yuuki);
		GameRegistry.addRecipe(new ItemStack(RiderItems.gden_denjutte,1), "ama","aba","aaa", 'a', RiderItems.imaginsand, 'b', Items.diamond_sword, 'm', RiderItems.rider_ticket_g);
		GameRegistry.addRecipe(new ItemStack(RiderItems.macheteddy,1), "ama","aba","aaa", 'a', RiderItems.imaginsand, 'b', Items.diamond_sword, 'm', RiderItems.rider_ticket_strike);
		GameRegistry.addRecipe(new ItemStack(RiderItems.gden_dengu,1), "aaa","aba","ama", 'a', RiderItems.imaginsand, 'b', Items.diamond_sword, 'm', RiderItems.rider_ticket_g);
		GameRegistry.addRecipe(new ItemStack(RiderItems.nega_den_gasher,1), "ama","aba","aaa", 'a', RiderItems.imaginsand, 'b', Items.diamond_sword, 'm', RiderItems.rider_ticket_nega);
		
		GameRegistry.addRecipe(new ItemStack(RiderItems.zerogasher,1), "ama","aba","aaa", 'a', RiderItems.imaginsand, 'b', Items.diamond_sword, 'm', RiderItems.zeronos_altair_card);
		
		GameRegistry.addRecipe(new ItemStack(RiderItems.ktaros,1), "asa","rax","aga", 'a', RiderItems.imaginsand, 'r', RiderItems.rider_ticket_rod, 'g', RiderItems.rider_ticket_gun, 'x', RiderItems.rider_ticket_ax, 's', RiderItems.rider_ticket_sword);


		GameRegistry.addRecipe(new ItemStack(RiderItems.dj_gun,1), "ama","aba","aaa", 'a', RiderItems.himawari_lockseed, 'b', Items.diamond_sword, 'm', RiderItems.kachidoki_lockseed);
		GameRegistry.addShapelessRecipe(new ItemStack(RiderItems.musou_saber_naginata),RiderItems.musou_saber,RiderItems.daidaimaru);
		GameRegistry.addShapelessRecipe(new ItemStack(RiderItems.musou_saber_kusarigama),RiderItems.musou_saber,RiderItems.pine_iron);
		GameRegistry.addShapelessRecipe(new ItemStack(RiderItems.blood_musou_saber_naginata),RiderItems.musou_saber,RiderItems.blood_daidaimaru);
		GameRegistry.addShapelessRecipe(new ItemStack(RiderItems.dj_gun_taiken_mode),RiderItems.musou_saber,RiderItems.dj_gun);
		
		GameRegistry.addRecipe(new ItemStack(RiderItems.musou_saber,1), "aaa","aba","aaa", 'a', RiderItems.himawari_lockseed, 'b', Items.diamond_sword);
		GameRegistry.addRecipe(new ItemStack(RiderItems.kagematsu,1), "ama","aba","aaa", 'a', RiderItems.himawari_lockseed, 'b', Items.diamond_sword, 'm', RiderItems.matsubokkuri_lockseed);
		GameRegistry.addRecipe(new ItemStack(RiderItems.donkachi,1), "ama","aba","aaa", 'a', RiderItems.himawari_lockseed, 'b', Items.diamond_sword, 'm', RiderItems.donguri_lockseed);
		GameRegistry.addRecipe(new ItemStack(RiderItems.melon_defender,1), "ama","aba","aaa", 'a', RiderItems.himawari_lockseed, 'b', Items.diamond_sword, 'm', RiderItems.melon_lockseed);
		GameRegistry.addRecipe(new ItemStack(RiderItems.pine_iron,1), "ama","aba","aaa", 'a', RiderItems.himawari_lockseed, 'b', Items.diamond_sword, 'm', RiderItems.pine_lockseed);
		GameRegistry.addRecipe(new ItemStack(RiderItems.ichigo_kunai,1), "ama","aba","aaa", 'a', RiderItems.himawari_lockseed, 'b', Items.diamond_sword, 'm', RiderItems.ichigo_lockseed);
		GameRegistry.addRecipe(new ItemStack(RiderItems.daidaimaru,1), "ama","aba","aaa", 'a', RiderItems.himawari_lockseed, 'b', Items.diamond_sword, 'm', RiderItems.orange_lockseed);
		GameRegistry.addRecipe(new ItemStack(RiderItems.banana_spear,1), "ama","aba","aaa", 'a', RiderItems.himawari_lockseed, 'b', Items.diamond_sword, 'm', RiderItems.banana_lockseed);
		GameRegistry.addRecipe(new ItemStack(RiderItems.budou_ryuhou,1), "ama","aba","aaa", 'a', RiderItems.himawari_lockseed, 'b', Items.diamond_sword, 'm', RiderItems.budou_lockseed);
		GameRegistry.addRecipe(new ItemStack(RiderItems.mango_punisher,1), "ama","aba","aaa", 'a', RiderItems.himawari_lockseed, 'b', Items.diamond_sword, 'm', RiderItems.mango_lockseed);
		GameRegistry.addRecipe(new ItemStack(RiderItems.duri_noko,1), "ama","aba","aaa", 'a', RiderItems.himawari_lockseed, 'b', Items.diamond_sword, 'm', RiderItems.durian_lockseed);
		GameRegistry.addRecipe(new ItemStack(RiderItems.kiwi_gekirin,1), "ama","aba","aaa", 'a', RiderItems.himawari_lockseed, 'b', Items.diamond_sword, 'm', RiderItems.kiwi_lockseed);

		GameRegistry.addRecipe(new ItemStack(RiderItems.blood_daidaimaru,1), "ama","aba","aaa", 'a', RiderItems.himawari_lockseed, 'b', Items.diamond_sword, 'm', RiderItems.blood_orange_lockseed);
		GameRegistry.addRecipe(new ItemStack(RiderItems.dark_daidaimaru,1), "ama","aba","aaa", 'a', RiderItems.himawari_lockseed, 'b', Items.diamond_sword, 'm', RiderItems.black_ringo_lockseed);
		GameRegistry.addRecipe(new ItemStack(RiderItems.kagematsu_shin,1), "ama","aba","aaa", 'a', RiderItems.himawari_lockseed, 'b', Items.diamond_sword, 'm', RiderItems.matsubokkuri_energy_lockseed);
		GameRegistry.addRecipe(new ItemStack(RiderItems.yomimaru,1), "ama","aba","aaa", 'a', RiderItems.himawari_lockseed, 'b', Items.diamond_sword, 'm', RiderItems.fifteen_lockseed);
		GameRegistry.addRecipe(new ItemStack(RiderItems.apple_reflecter,1), "ama","aba","aaa", 'a', RiderItems.himawari_lockseed, 'b', Items.diamond_sword, 'm', RiderItems.forbidden_ringo_lockseed);
		GameRegistry.addRecipe(new ItemStack(RiderItems.sword_bringer,1), "ama","aba","aaa", 'a', RiderItems.himawari_lockseed, 'b', Items.diamond_sword, 'm', RiderItems.golden_ringo_lockseed);
		GameRegistry.addRecipe(new ItemStack(RiderItems.souginjou,1), "ama","aba","aaa", 'a', RiderItems.himawari_lockseed, 'b', Items.diamond_sword, 'm', RiderItems.silver_ringo_lockseed);
		GameRegistry.addRecipe(new ItemStack(RiderItems.watermelon_defender,1), "ama","aba","aaa", 'a', RiderItems.himawari_lockseed, 'b', Items.diamond_sword, 'm', RiderItems.watermelon_lockseed);
		GameRegistry.addRecipe(new ItemStack(RiderItems.sonic_arrow,1), "ama","aba","aaa", 'a', RiderItems.himawari_lockseed, 'b', Items.diamond_sword, 'm', RiderItems.lemon_energy_lockseed);
		GameRegistry.addRecipe(new ItemStack(RiderItems.sonic_arrow,1), "ama","aba","aaa", 'a', RiderItems.himawari_lockseed, 'b', Items.diamond_sword, 'm', RiderItems.peach_energy_lockseed);
		GameRegistry.addRecipe(new ItemStack(RiderItems.sonic_arrow,1), "ama","aba","aaa", 'a', RiderItems.himawari_lockseed, 'b', Items.diamond_sword, 'm', RiderItems.cherry_energy_lockseed);
		GameRegistry.addRecipe(new ItemStack(RiderItems.sonic_arrow,1), "ama","aba","aaa", 'a', RiderItems.himawari_lockseed, 'b', Items.diamond_sword, 'm', RiderItems.melon_energy_lockseed);
		GameRegistry.addRecipe(new ItemStack(RiderItems.suika_sojinto,1), "ama","aba","aaa", 'a', RiderItems.himawari_lockseed, 'b', Items.diamond_sword, 'm', RiderItems.suika_lockseed);
		GameRegistry.addRecipe(new ItemStack(RiderItems.suika_sojinto_baron_ver,1), "aba","aca","ada", 'a', RiderItems.himawari_lockseed, 'b', RiderItems.suika_lockseed, 'c', Items.diamond_sword, 'd', RiderItems.banana_lockseed);
		GameRegistry.addRecipe(new ItemStack(RiderItems.savior_arrow,1), "ama","aba","aaa", 'a', RiderItems.himawari_lockseed, 'b', Items.diamond_sword, 'm', RiderItems.zakuro_lockseed);
		GameRegistry.addRecipe(new ItemStack(RiderItems.kabi_daidaimaru,1), "ama","aba","aaa", 'a', RiderItems.himawari_lockseed, 'b', Items.diamond_sword, 'm', RiderItems.kabi_orange_lockseed);
		GameRegistry.addRecipe(new ItemStack(RiderItems.maja_yomimaru,1), "ama","aba","aaa", 'a', RiderItems.himawari_lockseed, 'b', Items.diamond_sword, 'm', RiderItems.maja_lockseed);
		
		GameRegistry.addRecipe(new ItemStack(RiderItems.ghosthead,1), "aaa","a a", 'a', RiderItems.ghost_Icons, 'b', Items.diamond_helmet);
		GameRegistry.addRecipe(new ItemStack(RiderItems.ghosttroso,1), "a a","aaa","aaa", 'a',RiderItems.ghost_Icons,'b', Items.diamond_chestplate);
		GameRegistry.addRecipe(new ItemStack(RiderItems.ghostlegs,1), "aaa","a a","a a", 'a', RiderItems.ghost_Icons, 'b', Items.diamond_leggings);
		GameRegistry.addRecipe(new ItemStack(RiderItems.ghostdriver,1), "aaa","aca","aaa", 'a', RiderItems.ghost_Icons, 'b', Items.diamond_boots, 'c', RiderItems.ore_ghost_icon);

		GameRegistry.addRecipe(new ItemStack(RiderItems.specterdriver,1), "aaa","aca","aaa", 'a', RiderItems.ghost_Icons, 'b', Items.diamond_boots, 'c', RiderItems.specter_ghost_icon);
		GameRegistry.addRecipe(new ItemStack(RiderItems.dark_ghostdriver,1), "aaa","aca","aaa", 'a', RiderItems.ghost_Icons, 'b', Items.diamond_boots, 'c', RiderItems.dark_ghost_icon);
		
		GameRegistry.addRecipe(new ItemStack(RiderItems.mega_ulorder,1), "aaa","aca","aaa", 'a', RiderItems.ghost_gammaIcons, 'b', Items.diamond_boots, 'c', RiderItems.necrom_ghost_icon);
		GameRegistry.addRecipe(new ItemStack(RiderItems.proto_mega_ulorder_b,1), "aaa","aca","aaa", 'a', RiderItems.ghost_gammaIcons, 'b', Items.diamond_boots, 'c', RiderItems.dark_necrom_blue_ghost_icon);
		GameRegistry.addRecipe(new ItemStack(RiderItems.proto_mega_ulorder_r,1), "aaa","aca","aaa", 'a', RiderItems.ghost_gammaIcons, 'b', Items.diamond_boots, 'c', RiderItems.dark_necrom_red_ghost_icon);
		GameRegistry.addRecipe(new ItemStack(RiderItems.proto_mega_ulorder_y,1), "aaa","aca","aaa", 'a', RiderItems.ghost_gammaIcons, 'b', Items.diamond_boots, 'c', RiderItems.dark_necrom_yellow_ghost_icon);
		GameRegistry.addRecipe(new ItemStack(RiderItems.proto_mega_ulorder_p,1), "aaa","aca","aaa", 'a', RiderItems.ghost_gammaIcons, 'b', Items.diamond_boots, 'c', RiderItems.dark_necrom_pink_ghost_icon);
		
		GameRegistry.addShapelessRecipe(new ItemStack(RiderItems.unfinished_eyecon_driver_g,1), RiderItems.musashi_ghost_icon,RiderItems.edison_ghost_icon,RiderItems.robin_ghost_icon,RiderItems.newton_ghost_icon,RiderItems.billy_the_kid_icon,RiderItems.beethoven_icon,RiderItems.benkei_icon,RiderItems.ryoma_icon,RiderItems.goemon_icon);
		GameRegistry.addShapelessRecipe(new ItemStack(RiderItems.eyecon_driver_g,1), RiderItems.unfinished_eyecon_driver_g,RiderItems.himiko_ghost_icon,RiderItems.nobunaga_icon,RiderItems.tutankhamun_icon,RiderItems.houdini_icon,RiderItems.sanzo_icon,RiderItems.grimm_icon);
		
		GameRegistry.addRecipe(new ItemStack(RiderItems.ore_specter_ghost_icon,1), "aaa","cab","aaa", 'a', RiderItems.ghost_Icons, 'b', RiderItems.specter_ghost_icon, 'c', RiderItems.ore_ghost_icon);
		
		GameRegistry.addRecipe(new ItemStack(RiderItems.showa_ghost_icon,1), "aaa","aba","aaa", 'a', RiderItems.ghost_Icons, 'b', RiderItems.rider_circuit);
		GameRegistry.addRecipe(new ItemStack(RiderItems.kuuga_ghost_icon,1), "aaa","aba","aaa", 'a', RiderItems.ghost_Icons, 'b', RiderItems.kuuga_mighty);
		GameRegistry.addRecipe(new ItemStack(RiderItems.agito_ghost_icon,1), "aaa","aba","aaa", 'a', RiderItems.ghost_Icons, 'b', RiderItems.agito_ground);
		GameRegistry.addRecipe(new ItemStack(RiderItems.ryuki_ghost_icon,1), "aaa","aba","aaa", 'a', RiderItems.ghost_Icons, 'b', RiderItems.dragreder_advent);
		GameRegistry.addRecipe(new ItemStack(RiderItems.faiz_ghost_icon,1), "aaa","aba","aaa", 'a', RiderItems.ghost_Icons, 'b', RiderItems.faiz_mission_memory);
		GameRegistry.addRecipe(new ItemStack(RiderItems.blade_ghost_icon,1), "aaa","aba","aaa", 'a', RiderItems.ghost_Icons, 'b', RiderItems.changebeetle);
		GameRegistry.addRecipe(new ItemStack(RiderItems.hibiki_ghost_icon,1), "aaa","aba","aaa", 'a', RiderItems.ghost_Icons, 'b', RiderItems.henshin_onsa);
		GameRegistry.addRecipe(new ItemStack(RiderItems.kabuto_ghost_icon,1), "aaa","aba","aaa", 'a', RiderItems.ghost_Icons, 'b', RiderItems.kabuto_zecter);
		GameRegistry.addRecipe(new ItemStack(RiderItems.den_o_ghost_icon,1), "aaa","aba","aaa", 'a', RiderItems.ghost_Icons, 'b', RiderItems.rider_ticket_sword);
		GameRegistry.addRecipe(new ItemStack(RiderItems.kiva_ghost_icon,1), "aaa","aba","aaa", 'a', RiderItems.ghost_Icons, 'b', RiderItems.wakeupfuestle);
		GameRegistry.addRecipe(new ItemStack(RiderItems.decade_ghost_icon,1), "aaa","aba","aaa", 'a', RiderItems.ghost_Icons, 'b', RiderItems.decadecard);
		GameRegistry.addRecipe(new ItemStack(RiderItems.double_ghost_icon,1), "aaa","aba","aaa", 'a', RiderItems.ghost_Icons, 'b', RiderItems.joker_memory);
		GameRegistry.addRecipe(new ItemStack(RiderItems.ooo_ghost_icon,1), "aaa","aba","aaa", 'a', RiderItems.ghost_Icons, 'b', RiderItems.taka);
		GameRegistry.addRecipe(new ItemStack(RiderItems.fourze_ghost_icon,1), "aaa","aba","aaa", 'a', RiderItems.ghost_Icons, 'b', RiderItems.rocket_swich);
		GameRegistry.addRecipe(new ItemStack(RiderItems.wizard_ghost_icon,1), "aaa","aba","aaa", 'a', RiderItems.ghost_Icons, 'b', RiderItems.flame_ring);
		GameRegistry.addRecipe(new ItemStack(RiderItems.gaim_ghost_icon,1), "aaa","aba","aaa", 'a', RiderItems.ghost_Icons, 'b', RiderItems.orange_lockseed);
		GameRegistry.addRecipe(new ItemStack(RiderItems.drive_ghost_icon,1), "aaa","aba","aaa", 'a', RiderItems.ghost_Icons, 'b', RiderItems.speedshift);
		GameRegistry.addRecipe(new ItemStack(RiderItems.ghost_ghost_icon,1), "aaa","aba","aaa", 'a', RiderItems.ore_ghost_icon, 'b', RiderItems.ghost_Icons);
		GameRegistry.addRecipe(new ItemStack(RiderItems.ex_aid_ghost_icon,1), "aaa","aba","aaa", 'a', RiderItems.ghost_Icons, 'b', RiderItems.mighty_action_x_gashat);
		
		GameRegistry.addShapelessRecipe(new ItemStack(RiderItems.unfinished_fourtyfive_heisei_ghost_icon),RiderItems.kuuga_ghost_icon,RiderItems.agito_ghost_icon,RiderItems.ryuki_ghost_icon,RiderItems.faiz_ghost_icon,RiderItems.blade_ghost_icon,RiderItems.hibiki_ghost_icon,RiderItems.kabuto_ghost_icon,RiderItems.den_o_ghost_icon,RiderItems.kiva_ghost_icon);
		GameRegistry.addShapelessRecipe(new ItemStack(RiderItems.fourtyfive_heisei_ghost_icon),RiderItems.unfinished_fourtyfive_heisei_ghost_icon,RiderItems.decade_ghost_icon,RiderItems.double_ghost_icon,RiderItems.ooo_ghost_icon,RiderItems.fourze_ghost_icon,RiderItems.wizard_ghost_icon,RiderItems.gaim_ghost_icon,RiderItems.drive_ghost_icon,RiderItems.ghost_ghost_icon);
		GameRegistry.addShapelessRecipe(new ItemStack(RiderItems.fourtyfive_showa_ghost_icon),RiderItems.fourtyfive_heisei_ghost_icon);
		GameRegistry.addShapelessRecipe(new ItemStack(RiderItems.fourtyfive_heisei_ghost_icon),RiderItems.fourtyfive_showa_ghost_icon);
		
		GameRegistry.addRecipe(new ItemStack(RiderItems.drivehead,1), "aaa","a a", 'a', RiderItems.proto_speedshift, 'b', Items.diamond_helmet);
		GameRegistry.addRecipe(new ItemStack(RiderItems.drivetroso,1), "a a","aaa","aaa", 'a',RiderItems.proto_speedshift,'b', Items.diamond_chestplate);
		GameRegistry.addRecipe(new ItemStack(RiderItems.drivelegs,1), "aaa","a a","a a", 'a', RiderItems.proto_speedshift, 'b', Items.diamond_leggings);
		
		GameRegistry.addRecipe(new ItemStack(RiderItems.drivedriver,1), "aaa","aca","aaa", 'a', RiderItems.proto_speedshift, 'c', RiderItems.speedshift);

		GameRegistry.addRecipe(new ItemStack(RiderItems.mach_driver_honoh,1), "aaa","aca","aaa", 'a', RiderItems.signal_chaser, 'c', RiderItems.signal_mach);
		GameRegistry.addRecipe(new ItemStack(RiderItems.metro_pd_driver_honoh,1), "aaa","aca","aaa", 'a', RiderItems.signal_chaser, 'c', RiderItems.tokujoka_key);
		GameRegistry.addRecipe(new ItemStack(RiderItems.lupin_belt,1), "aaa","aca","aaa", 'a', RiderItems.proto_speedshift, 'c', Blocks.gold_block);

		GameRegistry.addRecipe(new ItemStack(RiderItems.handle_sword,1), "ama","aba","aaa", 'a', RiderItems.proto_speedshift, 'b', Items.diamond_sword, 'm',  RiderItems.wildshift);
		GameRegistry.addRecipe(new ItemStack(RiderItems.door_ju,1), "ama","aba","aaa", 'a', RiderItems.proto_speedshift, 'b', Items.diamond_sword, 'm',  RiderItems.techniqueshift);
		GameRegistry.addRecipe(new ItemStack(RiderItems.trailer_hou,1), "ama","aba","aaa", 'a', RiderItems.proto_speedshift, 'b', Items.diamond_sword, 'm',  RiderItems.formulashift);
		GameRegistry.addRecipe(new ItemStack(RiderItems.zenrin_shooter,1), "ama","aba","aaa", 'a', RiderItems.proto_speedshift, 'b', Items.diamond_sword, 'm',  RiderItems.signal_mach);
		GameRegistry.addRecipe(new ItemStack(RiderItems.blade_gunner,1), "ama","aba","aaa", 'a', RiderItems.proto_speedshift, 'b', Items.diamond_sword, 'm',  RiderItems.shift_next);
		GameRegistry.addRecipe(new ItemStack(RiderItems.break_gunner,1), "ama","aba","aaa", 'a', RiderItems.proto_speedshift, 'b', Items.diamond_sword, 'm',  RiderItems.proto_speedshift);
		GameRegistry.addRecipe(new ItemStack(RiderItems.lupin_gunner,1), "ama","aba","aaa", 'a', RiderItems.proto_speedshift, 'b', Items.diamond_sword, 'm',  Blocks.gold_block);
		GameRegistry.addRecipe(new ItemStack(RiderItems.shingouax,1), "ama","aba","aaa", 'a', RiderItems.proto_speedshift, 'b', Items.diamond_sword, 'm',  RiderItems.signal_chaser);
		
		
		GameRegistry.addRecipe(new ItemStack(RiderItems.gan_gun_saber_blade,1), "ama","aba","aaa", 'a', RiderItems.ghost_Icons, 'b', Items.diamond_sword, 'm',  RiderItems.ore_ghost_icon);
		
		GameRegistry.addRecipe(new ItemStack(RiderItems.gan_gun_saber_gun,1), "ama","aba","aaa", 'a', RiderItems.ghost_Icons, 'b', Items.diamond_sword, 'm',  RiderItems.edison_ghost_icon);
		GameRegistry.addRecipe(new ItemStack(RiderItems.gan_gun_saber_nitouryu,1), "ama","aba","aaa", 'a', RiderItems.ghost_Icons, 'b', Items.diamond_sword, 'm',  RiderItems.musashi_ghost_icon);
		GameRegistry.addRecipe(new ItemStack(RiderItems.gan_gun_saber_condor_denwor,1), "ama","aba","aaa", 'a', RiderItems.ghost_Icons, 'b', Items.diamond_sword, 'm',  RiderItems.robin_ghost_icon);
		GameRegistry.addRecipe(new ItemStack(RiderItems.gan_gun_saber_naginata,1), "ama","aba","aaa", 'a', RiderItems.ghost_Icons, 'b', Items.diamond_sword, 'm',  RiderItems.newton_ghost_icon);
		GameRegistry.addRecipe(new ItemStack(RiderItems.gan_gun_saber_rifle,1), "ama","aba","aaa", 'a', RiderItems.ghost_Icons, 'b', Items.diamond_sword, 'm',  RiderItems.billy_the_kid_icon);
		GameRegistry.addRecipe(new ItemStack(RiderItems.gan_gun_saber_hammer,1), "ama","aba","aaa", 'a', RiderItems.ghost_Icons, 'b', Items.diamond_sword, 'm',  RiderItems.benkei_icon);
		GameRegistry.addRecipe(new ItemStack(RiderItems.gan_gun_saber_nitouryu_2,1), "ama","aba","aaa", 'a', RiderItems.ghost_Icons, 'b', Items.diamond_sword, 'm',  RiderItems.beethoven_icon);
		GameRegistry.addRecipe(new ItemStack(RiderItems.sunglasseslasher_sword,1), "ama","aba","aaa", 'a', RiderItems.ghost_Icons, 'b', Items.diamond_sword, 'm',  RiderItems.toucon_boost_icon);
		GameRegistry.addRecipe(new ItemStack(RiderItems.gan_gun_hand_rod,1), "ama","aba","aaa", 'a', RiderItems.ghost_Icons, 'b', Items.diamond_sword, 'm',  RiderItems.specter_ghost_icon);
		GameRegistry.addRecipe(new ItemStack(RiderItems.gan_gun_hand_kama,1), "ama","aba","aaa", 'a', RiderItems.ghost_Icons, 'b', Items.diamond_sword, 'm',  RiderItems.tutankhamun_icon);
		GameRegistry.addRecipe(new ItemStack(RiderItems.deep_slasher_sword,1), "ama","aba","aaa", 'a', RiderItems.ghost_Icons, 'b', Items.diamond_sword, 'm',  RiderItems.deep_specter_ghost_icon);
		GameRegistry.addRecipe(new ItemStack(RiderItems.gan_gun_catcher_rod,1), "ama","aba","aaa", 'a', RiderItems.ghost_Icons, 'b', Items.diamond_sword, 'm',  RiderItems.necrom_ghost_icon);
		
		GameRegistry.addRecipe(new ItemStack(RiderItems.ex_aidhead,1), "aaa","a a", 'a', RiderItems.blank_gashat, 'b', Items.diamond_helmet);
		GameRegistry.addRecipe(new ItemStack(RiderItems.ex_aidtroso,1), "a a","aaa","aaa", 'a', RiderItems.blank_gashat, 'b', Items.diamond_chestplate);
		GameRegistry.addRecipe(new ItemStack(RiderItems.ex_aidlegs,1), "aaa","a a","a a", 'a', RiderItems.blank_gashat, 'b', Items.diamond_leggings);
		
		GameRegistry.addRecipe(new ItemStack(RiderItems.gamer_driver_ex_aid,1), "aaa","aca","aaa", 'a', RiderItems.blank_gashat, 'b', Items.diamond_boots, 'c', RiderItems.mighty_action_x_gashat);
		GameRegistry.addRecipe(new ItemStack(RiderItems.gamer_driver_brave,1), "aaa","aca","aaa", 'a', RiderItems.blank_gashat, 'b', Items.diamond_boots, 'c', RiderItems.taddle_quest_gashat);
		GameRegistry.addRecipe(new ItemStack(RiderItems.gamer_driver_snipe,1), "aaa","aca","aaa", 'a', RiderItems.blank_gashat, 'b', Items.diamond_boots, 'c', RiderItems.bang_bang_shooting_gashat);
		GameRegistry.addRecipe(new ItemStack(RiderItems.gamer_driver_lazer,1), "aaa","aca","aaa", 'a', RiderItems.blank_gashat, 'b', Items.diamond_boots, 'c', RiderItems.bakusou_bike_gashat);
		GameRegistry.addRecipe(new ItemStack(RiderItems.gamer_driver_genmu,1), "aaa","aca","aaa", 'a', RiderItems.blank_gashat, 'b', Items.diamond_boots, 'c', RiderItems.proto_mighty_action_x_gashat);
		GameRegistry.addRecipe(new ItemStack(RiderItems.gamer_driver_lazer_turbo,1), "aaa","aca","aaa", 'a', RiderItems.blank_gashat, 'b', Items.diamond_boots, 'c', RiderItems.proto_bakusou_bike_gashat);
		GameRegistry.addRecipe(new ItemStack(RiderItems.gamer_driver_paradox,1), "aaa","cab","aaa", 'a', RiderItems.blank_gashat, 'b', RiderItems.knock_out_fighter_gashat, 'c', RiderItems.perfect_puzzle_gashat);
		GameRegistry.addRecipe(new ItemStack(RiderItems.gamer_driver_proto_brave,1), "aaa","aca","aaa", 'a', RiderItems.blank_gashat, 'b', Items.diamond_boots, 'c', RiderItems.proto_taddle_quest_gashat);
		GameRegistry.addRecipe(new ItemStack(RiderItems.gamer_driver_proto_snipe,1), "aaa","aca","aaa", 'a', RiderItems.blank_gashat, 'b', Items.diamond_boots, 'c', RiderItems.proto_bang_bang_shooting_gashat);
		GameRegistry.addRecipe(new ItemStack(RiderItems.gamer_driver_truebrave,1), "aaa","aca","aaa", 'a', RiderItems.blank_gashat, 'b', Items.diamond_boots, 'c', RiderItems.taddle_legacy_gashat);
		GameRegistry.addRecipe(new ItemStack(RiderItems.gamer_driver_fuuma,1), "aaa","aca","aaa", 'a', RiderItems.blank_gashat, 'b', Items.diamond_boots, 'c', RiderItems.hurricane_ninja_gashat);
		GameRegistry.addRecipe(new ItemStack(RiderItems.gamer_driver_anotherparadox,1), "aaa","aca","aaa", 'a', RiderItems.blank_gashat, 'b', Items.diamond_boots, 'c', RiderItems.gashat_gear_dual_another);

		GameRegistry.addRecipe(new ItemStack(RiderItems.gashacon_bugvisor_genmu,1), "aaa","aca","aaa", 'a', RiderItems.unfinished_kamen_rider_chronicle_gashat, 'b', Items.diamond_boots, 'c', RiderItems.dangerous_zombie_gashat);
		GameRegistry.addRecipe(new ItemStack(RiderItems.gashacon_bugvisor_ii_chronos,1), "aaa","aca","aaa", 'a', RiderItems.unfinished_kamen_rider_chronicle_gashat, 'b', Items.diamond_boots, 'c', RiderItems.kamen_rider_chronicle_gashat);
		GameRegistry.addRecipe(new ItemStack(RiderItems.gashacon_bugvisor_ii_poppy,1), "aaa","aca","aaa", 'a', RiderItems.unfinished_kamen_rider_chronicle_gashat, 'b', Items.diamond_boots, 'c', RiderItems.toki_meki_crisis_gashat);
		GameRegistry.addRecipe(new ItemStack(RiderItems.gashacon_bugvisor_ii_lazer,1), "aaa","aca","aaa", 'a', RiderItems.unfinished_kamen_rider_chronicle_gashat, 'b', Items.diamond_boots, 'c', RiderItems.giri_giri_chambara_gashat);

		GameRegistry.addShapelessRecipe(new ItemStack(RiderItems.paradoxbelt),RiderItems.knock_out_fighter_gashat);
		GameRegistry.addShapelessRecipe(new ItemStack(RiderItems.paradoxbelt),RiderItems.perfect_puzzle_gashat);
		GameRegistry.addShapelessRecipe(new ItemStack(RiderItems.rideplayerbelt),RiderItems.kamen_rider_chronicle_gashat);
		GameRegistry.addShapelessRecipe(new ItemStack(RiderItems.rideplayerbelt_nico),RiderItems.kamen_rider_chronicle_gashat,RiderItems.bang_bang_shooting_gashat);
		GameRegistry.addShapelessRecipe(new ItemStack(RiderItems.ninjaplayerbelt),RiderItems.hurricane_ninja_gashat);
		
		GameRegistry.addRecipe(new ItemStack(RiderItems.gashacon_bugvisor,1), "ama","aba","aaa", 'a', RiderItems.blank_gashat, 'b', Items.diamond_sword, 'm',  RiderItems.dangerous_zombie_gashat);
		GameRegistry.addRecipe(new ItemStack(RiderItems.gashacon_bugvisor_ii,1), "ama","aba","aaa", 'a', RiderItems.blank_gashat, 'b', Items.diamond_sword, 'm',  RiderItems.kamen_rider_chronicle_gashat);
		GameRegistry.addRecipe(new ItemStack(RiderItems.gashacon_bugvisor_ii,1), "ama","aba","aaa", 'a', RiderItems.blank_gashat, 'b', Items.diamond_sword, 'm',  RiderItems.toki_meki_crisis_gashat);
		
		GameRegistry.addRecipe(new ItemStack(RiderItems.ride_weapon,1), "aaa","aba","ama", 'a', RiderItems.blank_gashat, 'b', Items.diamond_sword, 'm',  RiderItems.kamen_rider_chronicle_gashat);
		
		GameRegistry.addRecipe(new ItemStack(RiderItems.gashacon_breaker,1), "ama","aba","aaa", 'a', RiderItems.blank_gashat, 'b', Items.diamond_sword, 'm',  RiderItems.mighty_action_x_gashat);
		GameRegistry.addRecipe(new ItemStack(RiderItems.gashacon_breaker_ham,1), "aaa","aba","ama", 'a', RiderItems.blank_gashat, 'b', Items.diamond_sword, 'm',  RiderItems.mighty_action_x_gashat);
		GameRegistry.addRecipe(new ItemStack(RiderItems.gashacon_key_slasher,1), "ama","aba","aaa", 'a', RiderItems.blank_gashat, 'b', Items.diamond_sword, 'm',  RiderItems.mighty_brothers_xx_gashat);
		GameRegistry.addRecipe(new ItemStack(RiderItems.gashacon_sword,1), "aaa","aba","ama", 'a', RiderItems.blank_gashat, 'b', Items.diamond_sword, 'm',  RiderItems.taddle_quest_gashat);
		GameRegistry.addRecipe(new ItemStack(RiderItems.gashacon_sword_ice,1), "ama","aba","aaa", 'a', RiderItems.blank_gashat, 'b', Items.diamond_sword, 'm',  RiderItems.taddle_quest_gashat);
		GameRegistry.addRecipe(new ItemStack(RiderItems.gashacon_magnum_gun,1), "ama","aba","aaa", 'a', RiderItems.blank_gashat, 'b', Items.diamond_sword, 'm',  RiderItems.bang_bang_shooting_gashat);
		GameRegistry.addRecipe(new ItemStack(RiderItems.gashacon_sparrow_sickle_a,1), "ama","aba","aaa", 'a', RiderItems.blank_gashat, 'b', Items.diamond_sword, 'm',  RiderItems.bakusou_bike_gashat);
		GameRegistry.addRecipe(new ItemStack(RiderItems.gashacon_sparrow_sickle_b,1), "ama","aba","aaa", 'a', RiderItems.blank_gashat, 'b', Items.diamond_sword, 'm',  RiderItems.giri_giri_chambara_gashat);
		GameRegistry.addShapelessRecipe(new ItemStack(RiderItems.gashacon_sparrow_arrow,1), RiderItems.gashacon_sparrow_sickle_a,RiderItems.gashacon_sparrow_sickle_b);
		
		GameRegistry.addRecipe(new ItemStack(RiderItems.parabragun_axe,1), "ama","aba","aaa", 'a', RiderItems.blank_gashat, 'b', Items.diamond_sword, 'm',  RiderItems.knock_out_fighter_gashat);
		GameRegistry.addRecipe(new ItemStack(RiderItems.parabragun_axe,1), "ama","aba","aaa", 'a', RiderItems.blank_gashat, 'b', Items.diamond_sword, 'm',  RiderItems.perfect_puzzle_gashat);
		
		GameRegistry.addRecipe(new ItemStack(RiderItems.true_brave_sword,1), "ama","aba","aaa", 'a', RiderItems.blank_gashat, 'b', Items.diamond_sword, 'm',  RiderItems.taddle_legacy_gashat);
		GameRegistry.addRecipe(new ItemStack(RiderItems.fuuma_sword,1), "ama","aba","aaa", 'a', RiderItems.blank_gashat, 'b', Items.diamond_sword, 'm',  RiderItems.hurricane_ninja_gashat);
		
		GameRegistry.addRecipe(new ItemStack(RiderItems.lets_go_ichigou_gashat,1), "aaa","aba","aaa", 'a', RiderItems.blank_gashat, 'b', RiderItems.rider_circuit);
		GameRegistry.addRecipe(new ItemStack(RiderItems.adventure_guy_kuuga_gashat,1), "aaa","aba","aaa", 'a', RiderItems.blank_gashat, 'b', RiderItems.kuuga_mighty);
		GameRegistry.addRecipe(new ItemStack(RiderItems.agito_of_the_sun_gashat,1), "aaa","aba","aaa", 'a', RiderItems.blank_gashat, 'b', RiderItems.agito_ground);
		GameRegistry.addRecipe(new ItemStack(RiderItems.mirror_labryinth_ryuki_gashat,1), "aaa","aba","aaa", 'a', RiderItems.blank_gashat, 'b', RiderItems.dragreder_advent);
		GameRegistry.addRecipe(new ItemStack(RiderItems.moshi_moshi_faiz_gashat,1), "aaa","aba","aaa", 'a', RiderItems.blank_gashat, 'b', RiderItems.faiz_mission_memory);
		GameRegistry.addRecipe(new ItemStack(RiderItems.king_of_poker_blade_gashat,1), "aaa","aba","aaa", 'a', RiderItems.blank_gashat, 'b', RiderItems.changebeetle);
		GameRegistry.addRecipe(new ItemStack(RiderItems.taiko_master_hibik_gashat,1), "aaa","aba","aaa", 'a', RiderItems.blank_gashat, 'b', RiderItems.henshin_onsa);
		GameRegistry.addRecipe(new ItemStack(RiderItems.insect_wars_kabuto_gashat,1), "aaa","aba","aaa", 'a', RiderItems.blank_gashat, 'b', RiderItems.kabuto_zecter);
		GameRegistry.addRecipe(new ItemStack(RiderItems.time_express_den_o_gashat,1), "aaa","aba","aaa", 'a', RiderItems.blank_gashat, 'b', RiderItems.rider_ticket_sword);
		GameRegistry.addRecipe(new ItemStack(RiderItems.dokidoki_makai_castle_kiva_gashat,1), "aaa","aba","aaa", 'a', RiderItems.blank_gashat, 'b', RiderItems.wakeupfuestle);
		GameRegistry.addRecipe(new ItemStack(RiderItems.barcode_warrior_decade_gashat,1), "aaa","aba","aaa", 'a', RiderItems.blank_gashat, 'b', RiderItems.decadecard);
		GameRegistry.addRecipe(new ItemStack(RiderItems.detective_double_gashat,1), "aaa","aba","aaa", 'a', RiderItems.blank_gashat, 'b', RiderItems.joker_memory);
		GameRegistry.addRecipe(new ItemStack(RiderItems.jungle_ooo_gashat,1), "aaa","aba","aaa", 'a', RiderItems.blank_gashat, 'b', RiderItems.taka);
		GameRegistry.addRecipe(new ItemStack(RiderItems.space_galaxy_fourze_gashat,1), "aaa","aba","aaa", 'a', RiderItems.blank_gashat, 'b', RiderItems.rocket_swich);
		GameRegistry.addRecipe(new ItemStack(RiderItems.magic_the_wizard_gashat,1), "aaa","aba","aaa", 'a', RiderItems.blank_gashat, 'b', RiderItems.flame_ring);
		GameRegistry.addRecipe(new ItemStack(RiderItems.toukenden_gaim_gashat,1), "aaa","aba","aaa", 'a', RiderItems.blank_gashat, 'b', RiderItems.orange_lockseed);
		GameRegistry.addRecipe(new ItemStack(RiderItems.full_throttle_drive_gashat,1), "aaa","aba","aaa", 'a', RiderItems.blank_gashat, 'b', RiderItems.speedshift);
		GameRegistry.addRecipe(new ItemStack(RiderItems.kaigan_ghost_gashat,1), "aaa","aba","aaa", 'a', RiderItems.blank_gashat, 'b', RiderItems.ore_ghost_icon);
		
		GameRegistry.addRecipe(new ItemStack(RiderItems.drill_crusher,1), "aaa","rbt","aaa", 'a', RiderItems.full_bottle, 'b', Items.diamond_sword,'t', RiderItems.tank_full_bottle, 'r',  RiderItems.rabbit_full_bottle);
		GameRegistry.addRecipe(new ItemStack(RiderItems.hawk_gatlinger,1), "aaa","rbt","aaa", 'a', RiderItems.full_bottle, 'b', Items.diamond_sword,'t', RiderItems.gatling_full_bottle, 'r',  RiderItems.taka_full_bottle);
		GameRegistry.addRecipe(new ItemStack(RiderItems.koma_ninpoutou,1), "aaa","rbt","aaa", 'a', RiderItems.full_bottle, 'b', Items.diamond_sword,'t', RiderItems.comic_full_bottle, 'r',  RiderItems.ninjya_full_bottle);
		GameRegistry.addRecipe(new ItemStack(RiderItems.kaizoku_hassha,1), "aaa","rbt","aaa", 'a', RiderItems.full_bottle, 'b', Items.diamond_sword,'t', RiderItems.ressha_full_bottle, 'r',  RiderItems.kaizoku_full_bottle);
		GameRegistry.addRecipe(new ItemStack(RiderItems.beat_crosser,1), "ama","aba","aaa", 'a', RiderItems.full_bottle, 'b', Items.diamond_sword, 'm',  RiderItems.dragon_full_bottle);
		GameRegistry.addRecipe(new ItemStack(RiderItems.twinbreaker_sword,1), "ama","aba","aaa", 'a', RiderItems.sclashjelly, 'b', Items.diamond_sword, 'm',  RiderItems.dragon_sclashjelly);
		GameRegistry.addRecipe(new ItemStack(RiderItems.twinbreaker_sword,1), "ama","aba","aaa", 'a', RiderItems.sclashjelly, 'b', Items.diamond_sword, 'm',  RiderItems.robot_sclashjelly);
		GameRegistry.addRecipe(new ItemStack(RiderItems.full_bottle_buster,1), "aca","aba","aaa", 'a', RiderItems.full_bottle, 'b', Items.diamond_sword,'c', RiderItems.fullfull_bottle_rabbit);
		GameRegistry.addRecipe(new ItemStack(RiderItems.full_bottle_buster,1), "aca","aba","aaa", 'a', RiderItems.full_bottle, 'b', Items.diamond_sword,'c', RiderItems.fullfull_bottle_tank);
		GameRegistry.addRecipe(new ItemStack(RiderItems.magma_knuckle,1), "ama","aba","aaa", 'a', RiderItems.full_bottle, 'b', Items.diamond_sword, 'm',  RiderItems.dragon_magma_full_bottle);		
		GameRegistry.addRecipe(new ItemStack(RiderItems.blizzard_knuckle,1), "ama","aba","aaa", 'a', RiderItems.full_bottle, 'b', Items.diamond_sword, 'm',  RiderItems.north_blizzard_full_bottle);		

		GameRegistry.addRecipe(new ItemStack(RiderItems.buildhead,1), "aaa","a a", 'a', RiderItems.full_bottle, 'b', Items.diamond_helmet);
		GameRegistry.addRecipe(new ItemStack(RiderItems.buildtroso,1), "a a","aaa","aaa", 'a', RiderItems.full_bottle, 'b', Items.diamond_chestplate);
		GameRegistry.addRecipe(new ItemStack(RiderItems.buildlegs,1), "aaa","a a","a a", 'a', RiderItems.full_bottle, 'b', Items.diamond_leggings);
		
		GameRegistry.addRecipe(new ItemStack(RiderItems.build_driver,1), "aaa","cab","aaa", 'a', RiderItems.full_bottle, 'b', RiderItems.tank_full_bottle, 'c', RiderItems.rabbit_full_bottle);
		GameRegistry.addRecipe(new ItemStack(RiderItems.build_driver_cross_z,1), "aaa","aca","aaa", 'a', RiderItems.full_bottle, 'b', RiderItems.tank_full_bottle, 'c', RiderItems.dragon_full_bottle);
		GameRegistry.addRecipe(new ItemStack(RiderItems.build_driver_grease,1), "aaa","aca","aaa", 'a', RiderItems.full_bottle, 'c', RiderItems.north_blizzard_full_bottle);
		GameRegistry.addRecipe(new ItemStack(RiderItems.build_driver_rogue,1), "aaa","aca","aaa", 'a', RiderItems.full_bottle, 'c', RiderItems.prime_rogue_full_bottle);
		GameRegistry.addRecipe(new ItemStack(RiderItems.sclash_driver_grease,1), "aaa","aba","aaa", 'a', RiderItems.sclashjelly, 'b', RiderItems.robot_sclashjelly);
		GameRegistry.addRecipe(new ItemStack(RiderItems.sclash_driver_cross_z_charge,1), "aaa","aba","aaa", 'a', RiderItems.sclashjelly, 'b', RiderItems.dragon_sclashjelly);
		GameRegistry.addRecipe(new ItemStack(RiderItems.sclash_driver_rogue,1), "aaa","aba","aaa", 'a', RiderItems.sclashjelly, 'b', RiderItems.crocodile_crack_full_bottle);
		GameRegistry.addRecipe(new ItemStack(RiderItems.evol_driver_evol,1), "aaa","cab","aaa", 'a', RiderItems.full_bottle, 'b', RiderItems.rider_system_evol_bottle, 'c', RiderItems.cobra_evol_bottle);
		GameRegistry.addRecipe(new ItemStack(RiderItems.evol_driver_mad_rogue,1), "aaa","cab","aaa", 'a', RiderItems.full_bottle, 'b', RiderItems.engine_full_bottle, 'c', RiderItems.bat_full_bottle_2);

		GameRegistry.addShapelessRecipe(new ItemStack(RiderItems.fullfull_bottle_tank),RiderItems.fullfull_bottle_rabbit);	
		GameRegistry.addShapelessRecipe(new ItemStack(RiderItems.fullfull_bottle_rabbit),RiderItems.fullfull_bottle_tank);	
		
		GameRegistry.addRecipe(new ItemStack(RiderItems.transteamgun,1), "aaa","aba","aaa", 'a', RiderItems.full_bottle, 'b', RiderItems.bat_full_bottle);
		GameRegistry.addRecipe(new ItemStack(RiderItems.steam_blade,1), "aaa","aba","aaa", 'a', RiderItems.full_bottle, 'b', RiderItems.cobra_full_bottle);
		GameRegistry.addRecipe(new ItemStack(RiderItems.nebulasteamgun,1), "aaa","aba","aaa", 'a', RiderItems.unfinished_gear, 'b', RiderItems.gear_engine);
		
		GameRegistry.addShapelessRecipe(new ItemStack(RiderItems.transteamgun_rifle),RiderItems.transteamgun,RiderItems.steam_blade);
		GameRegistry.addShapelessRecipe(new ItemStack(RiderItems.nebulasteamgun_rifle),RiderItems.nebulasteamgun,RiderItems.steam_blade);
		
		GameRegistry.addSmelting(new ItemStack(RiderItems.dragon_sclashjelly),new ItemStack(RiderItems.dragon_magma_full_bottle), 1);
		
		GameRegistry.addRecipe(new ItemStack(RiderItems.hibikihead,1), "aaa","a a", 'a', RiderItems.oni_ore, 'b', Items.diamond_helmet);
		GameRegistry.addRecipe(new ItemStack(RiderItems.hibikitroso,1), "a a","aaa","aaa", 'a', RiderItems.oni_ore, 'b', Items.diamond_chestplate);
		GameRegistry.addRecipe(new ItemStack(RiderItems.hibikilegs,1), "aaa","a a","a a", 'a', RiderItems.oni_ore, 'b', Items.diamond_leggings);
		
		GameRegistry.addRecipe(new ItemStack(RiderItems.ongekibo_rekka,1), "ata","aba","aaa", 'a', RiderItems.oni_ore, 'b', Items.diamond_sword,'t', RiderItems.henshin_onsa);
		GameRegistry.addRecipe(new ItemStack(RiderItems.armed_saber,1), "ata","aba","aaa", 'a', RiderItems.oni_ore, 'b', Items.diamond_sword,'t', RiderItems.unfinished_armed_saber);
		GameRegistry.addRecipe(new ItemStack(RiderItems.ongekibo_yamase,1), "aaa","aba","ata", 'a', RiderItems.oni_ore, 'b', Items.diamond_sword,'t', RiderItems.henshin_onibue_ibuki);
		GameRegistry.addRecipe(new ItemStack(RiderItems.ongekibo_rakurai,1), "aaa","aba","ata", 'a', RiderItems.oni_ore, 'b', Items.diamond_sword,'t', RiderItems.henshin_kigen_todoroki);
		GameRegistry.addRecipe(new ItemStack(RiderItems.ongekibo_shakubyoushi,1), "ata","aba","aaa", 'a', RiderItems.oni_ore, 'b', Items.diamond_sword,'t', RiderItems.henshin_kigen_shuki);
		GameRegistry.addRecipe(new ItemStack(RiderItems.ongekibo_nachiguro,1), "ata","aba","aaa", 'a', RiderItems.oni_ore, 'b', Items.diamond_sword,'t', RiderItems.henshin_onsa_danki);
		GameRegistry.addRecipe(new ItemStack(RiderItems.ongekibo_rokushou,1), "ata","aba","aaa", 'a', RiderItems.oni_ore, 'b', Items.diamond_sword,'t', RiderItems.henshin_onsa_eiki);
		GameRegistry.addRecipe(new ItemStack(RiderItems.ongekibo_gouriki,1), "ata","aba","aaa", 'a', RiderItems.oni_ore, 'b', Items.diamond_sword,'t', RiderItems.henshin_onsa_gouki);
		GameRegistry.addRecipe(new ItemStack(RiderItems.ongekibo_ressui,1), "ata","aba","aaa", 'a', RiderItems.oni_ore, 'b', Items.diamond_sword,'t', RiderItems.henshin_onsa_kabuki);
		
		GameRegistry.addRecipe(new ItemStack(RiderItems.ongekikan_reppuu,1), "ata","aba","aaa", 'a', RiderItems.oni_ore, 'b', Items.diamond_sword,'t', RiderItems.henshin_onibue_ibuki);
		
		GameRegistry.addRecipe(new ItemStack(RiderItems.ongekigen_retsurai,1), "ata","aba","aaa", 'a', RiderItems.oni_ore, 'b', Items.diamond_sword,'t', RiderItems.henshin_kigen_todoroki);
		GameRegistry.addRecipe(new ItemStack(RiderItems.ongeki_shingen_retsuzan,1), "ata","aba","aaa", 'a', RiderItems.oni_ore, 'b', Items.diamond_sword,'t', RiderItems.henshin_kigen_zanki);
		GameRegistry.addRecipe(new ItemStack(RiderItems.ongekigen_enma,1), "ata","aba","aaa", 'a', RiderItems.oni_ore, 'b', Items.diamond_sword,'t', RiderItems.henshin_kigen_sabaki);
		GameRegistry.addRecipe(new ItemStack(RiderItems.ongekigen_togenkyo,1), "ata","aba","aaa", 'a', RiderItems.oni_ore, 'b', Items.diamond_sword,'t', RiderItems.henshin_kigen_banki);
		
		GameRegistry.addRecipe(new ItemStack(RiderItems.echo_sword_onsaken,1), "aaa","aba","ata", 'a', RiderItems.oni_ore, 'b', Items.diamond_sword,'t', RiderItems.henshin_onsa_kabuki);
		GameRegistry.addRecipe(new ItemStack(RiderItems.ongekisankaku_ressetsu,1), "ata","aba","aaa", 'a', RiderItems.oni_ore, 'b', Items.diamond_sword,'t', RiderItems.henshin_onsa_nishiki);
		GameRegistry.addRecipe(new ItemStack(RiderItems.ongekikanabo_retto,1), "ata","aba","aaa", 'a', RiderItems.oni_ore, 'b', Items.diamond_sword,'t', RiderItems.henshin_onsa_touki);
		GameRegistry.addRecipe(new ItemStack(RiderItems.ongeki_shincho_retsuban,1), "aaa","aba","ata", 'a', RiderItems.oni_ore, 'b', Items.diamond_sword,'t', RiderItems.henshin_onsa_kirameki);
		
		GameRegistry.addRecipe(new ItemStack(RiderItems.hibikidriver,1), "aaa","aba","aaa", 'a', RiderItems.oni_ore, 'b', RiderItems.henshin_onsa, 'c', RiderItems.rabbit_full_bottle);
		GameRegistry.addRecipe(new ItemStack(RiderItems.kabukidriver,1), "aaa","aba","aaa", 'a', RiderItems.oni_orehell, 'b', RiderItems.henshin_onsa_kabuki, 'c', RiderItems.rabbit_full_bottle);
		GameRegistry.addRecipe(new ItemStack(RiderItems.toukidriver,1), "aaa","aba","aaa", 'a', RiderItems.oni_orehell, 'b', RiderItems.henshin_onsa_touki, 'c', RiderItems.rabbit_full_bottle);
		GameRegistry.addRecipe(new ItemStack(RiderItems.kiramekidriver,1), "aaa","aba","aaa", 'a', RiderItems.oni_orehell, 'b', RiderItems.henshin_onsa_kirameki, 'c', RiderItems.rabbit_full_bottle);
		GameRegistry.addRecipe(new ItemStack(RiderItems.habatakidriver,1), "aaa","aba","aaa", 'a', RiderItems.oni_orehell, 'b', RiderItems.henshin_onsa_habataki, 'c', RiderItems.rabbit_full_bottle);
		GameRegistry.addRecipe(new ItemStack(RiderItems.nishikidriver,1), "aaa","aba","aaa", 'a', RiderItems.oni_orehell, 'b', RiderItems.henshin_onsa_nishiki, 'c', RiderItems.rabbit_full_bottle);
		GameRegistry.addRecipe(new ItemStack(RiderItems.kyosukedriver,1), "aaa","aba","aaa", 'a', RiderItems.oni_ore, 'b', RiderItems.henshin_onsa_kyoki, 'c', RiderItems.rabbit_full_bottle);
		GameRegistry.addRecipe(new ItemStack(RiderItems.dankidriver,1), "aaa","aba","aaa", 'a', RiderItems.oni_ore, 'b', RiderItems.henshin_onsa_danki, 'c', RiderItems.rabbit_full_bottle);
		GameRegistry.addRecipe(new ItemStack(RiderItems.eikidriver,1), "aaa","aba","aaa", 'a', RiderItems.oni_ore, 'b', RiderItems.henshin_onsa_eiki, 'c', RiderItems.rabbit_full_bottle);
		GameRegistry.addRecipe(new ItemStack(RiderItems.goukidriver,1), "aaa","aba","aaa", 'a', RiderItems.oni_orehell, 'b', RiderItems.henshin_onsa_gouki, 'c', RiderItems.rabbit_full_bottle);
		
		GameRegistry.addRecipe(new ItemStack(RiderItems.ibukidriver,1), "aaa","aba","aaa", 'a', RiderItems.oni_ore, 'b', RiderItems.henshin_onibue_ibuki, 'c', RiderItems.rabbit_full_bottle);
		GameRegistry.addRecipe(new ItemStack(RiderItems.tokidriver,1), "aaa","aba","aaa", 'a', RiderItems.oni_orehell, 'b', RiderItems.henshin_onibue_toki, 'c', RiderItems.rabbit_full_bottle);
		GameRegistry.addRecipe(new ItemStack(RiderItems.shoukidriver,1), "aaa","aba","aaa", 'a', RiderItems.oni_ore, 'b', RiderItems.henshin_onibue_shouki, 'c', RiderItems.rabbit_full_bottle);
		GameRegistry.addRecipe(new ItemStack(RiderItems.amakidriver,1), "aaa","aba","aaa", 'a', RiderItems.oni_ore, 'b', RiderItems.henshin_onibue_amaki, 'c', RiderItems.rabbit_full_bottle);
		GameRegistry.addRecipe(new ItemStack(RiderItems.fubukidriver,1), "aaa","aba","aaa", 'a', RiderItems.oni_orehell, 'b', RiderItems.henshin_onibue_fubuki, 'c', RiderItems.rabbit_full_bottle);
		
		GameRegistry.addRecipe(new ItemStack(RiderItems.todorokidriver,1), "aaa","aba","aaa", 'a', RiderItems.oni_ore, 'b', RiderItems.henshin_kigen_todoroki, 'c', RiderItems.rabbit_full_bottle);
		GameRegistry.addRecipe(new ItemStack(RiderItems.zankidriver,1), "aaa","aba","aaa", 'a', RiderItems.oni_ore, 'b', RiderItems.henshin_kigen_zanki, 'c', RiderItems.rabbit_full_bottle);
		GameRegistry.addRecipe(new ItemStack(RiderItems.shukidriver,1), "aaa","aba","aaa", 'a', RiderItems.oni_ore, 'b', RiderItems.henshin_kigen_shuki, 'c', RiderItems.rabbit_full_bottle);
		GameRegistry.addRecipe(new ItemStack(RiderItems.bankidriver,1), "aaa","aba","aaa", 'a', RiderItems.oni_orehell, 'b', RiderItems.henshin_kigen_banki, 'c', RiderItems.rabbit_full_bottle);
		GameRegistry.addRecipe(new ItemStack(RiderItems.sabakidriver,1), "aaa","aba","aaa", 'a', RiderItems.oni_orehell, 'b', RiderItems.henshin_kigen_sabaki, 'c', RiderItems.rabbit_full_bottle);
		
		GameRegistry.addRecipe(new ItemStack(RiderItems.amazonshead,1), "aaa","a a", 'a', RiderItems.amazon_cell_vial, 'b', Items.diamond_helmet);
		GameRegistry.addRecipe(new ItemStack(RiderItems.amazonstroso,1), "a a","aaa","aaa", 'a', RiderItems.amazon_cell_vial, 'b', Items.diamond_chestplate);
		GameRegistry.addRecipe(new ItemStack(RiderItems.amazonslegs,1), "aaa","a a","a a", 'a', RiderItems.amazon_cell_vial, 'b', Items.diamond_leggings);
		
		GameRegistry.addRecipe(new ItemStack(RiderItems.amazons_driver_alpha,1), "aaa","aba","aaa", 'a', RiderItems.amazon_cell_vial, 'b', RiderItems.condorer_core_alpha, 'c', RiderItems.rabbit_full_bottle);
		GameRegistry.addRecipe(new ItemStack(RiderItems.amazons_driver_omega,1), "aaa","aba","aaa", 'a', RiderItems.amazon_cell_vial, 'b', RiderItems.condorer_core_omega, 'c', RiderItems.rabbit_full_bottle);
		GameRegistry.addRecipe(new ItemStack(RiderItems.amazons_driver_sigma,1), "aaa","aba","aaa", 'a', RiderItems.amazon_cell_vial, 'b', RiderItems.condorer_core_sigma, 'c', RiderItems.rabbit_full_bottle);
		GameRegistry.addRecipe(new ItemStack(RiderItems.amazons_driver_blind_alpha,1), "aaa","aba","aaa", 'a', RiderItems.amazon_cell_vial, 'b', RiderItems.condorer_core_blind_alpha, 'c', RiderItems.rabbit_full_bottle);
		
		GameRegistry.addRecipe(new ItemStack(RiderItems.neo_amazons_driver_neo,1), "aaa","aba","aaa", 'a', RiderItems.amazon_cell_vial, 'b', RiderItems.amazon_injector_neo, 'c', RiderItems.rabbit_full_bottle);
		GameRegistry.addRecipe(new ItemStack(RiderItems.neo_amazons_driver_omega,1), "aaa","aba","aaa", 'a', RiderItems.amazon_cell_vial, 'b', RiderItems.amazon_injector_new_omega, 'c', RiderItems.rabbit_full_bottle);
		
		GameRegistry.addRecipe(new ItemStack(RiderItems.zi_o_head,1), "aaa","a a", 'a', RiderItems.blank_watch);
		GameRegistry.addRecipe(new ItemStack(RiderItems.zi_o_torso,1), "a a","aaa","aaa", 'a', RiderItems.blank_watch);
		GameRegistry.addRecipe(new ItemStack(RiderItems.zi_o_legs,1), "aaa","a a","a a", 'a', RiderItems.blank_watch);
		
		GameRegistry.addRecipe(new ItemStack(RiderItems.zikuu_driver_zi_o,1), "aaa","aba","aaa", 'a', RiderItems.blank_watch, 'b', RiderItems.zi_o_ridewatch);
		GameRegistry.addRecipe(new ItemStack(RiderItems.zikuu_driver_geiz,1), "aaa","aba","aaa", 'a', RiderItems.blank_watch, 'b', RiderItems.geiz_ridewatch);
	}

}
