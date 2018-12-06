package Kamen_Rider_Craft_4TH;


import com.jcraft.jorbis.Block;

import Kamen_Rider_Craft_4TH.mobs.EntityAnkh;
import Kamen_Rider_Craft_4TH.mobs.EntityChronos;
import Kamen_Rider_Craft_4TH.mobs.EntityLazer;
import Kamen_Rider_Craft_4TH.mobs.EntityPoppy;
import Kamen_Rider_Craft_4TH.mobs.Entity_kodama_suika_arms;
import Kamen_Rider_Craft_4TH.mobs.RenderRiderMob;
import Kamen_Rider_Craft_4TH.mobs.RenderRiderMob2;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_BloodStalk;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_Build_RT;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_EngineBros;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_HellBros;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_Kaiser;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_KaiserReverse;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_NightRogue;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_RemoconBros;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_another_build;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_bikaiser;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_evolt;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_grease;
import Kamen_Rider_Craft_4TH.mobs.Henchmen.EntityBugsterVirus;
import Kamen_Rider_Craft_4TH.mobs.Henchmen.EntityMasquerade;
import Kamen_Rider_Craft_4TH.mobs.Henchmen.EntityNebulaBugsterVirus;
import Kamen_Rider_Craft_4TH.mobs.Henchmen.Entity_hard_guardian;
import Kamen_Rider_Craft_4TH.mobs.Henchmen.Entity_needle_smash;
import Kamen_Rider_Craft_4TH.mobs.Henchmen.Entitygamma_commando;
import Kamen_Rider_Craft_4TH.mobs.Henchmen.Entityguardian;
import Kamen_Rider_Craft_4TH.mobs.Henchmen.Entityguardian_hokuto;
import Kamen_Rider_Craft_4TH.mobs.Henchmen.Entityguardian_seito;
import Kamen_Rider_Craft_4TH.mobs.Henchmen.Entityshocker_combatman;
import Kamen_Rider_Craft_4TH.mobs.bikes.EntityExaidBike;
import Kamen_Rider_Craft_4TH.mobs.bikes.EntityMachineBuilder;
import Kamen_Rider_Craft_4TH.model.MobWithBeltModel;
import Kamen_Rider_Craft_4TH.model.ModelAnkh;
import Kamen_Rider_Craft_4TH.model.ModelPoppy;
import Kamen_Rider_Craft_4TH.model.Model_kodama_suika_arms;
import Kamen_Rider_Craft_4TH.model.Model_lazer_bike;
import Kamen_Rider_Craft_4TH.model.Model_machine_builder;
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
		RenderingRegistry.registerEntityRenderingHandler(EntityMasquerade.class, new RenderRiderMob2( new ModelBiped(), 0.4F,"textures/entities/masquerade.png"));
		
		RenderingRegistry.registerEntityRenderingHandler(EntityAnkh.class, new RenderRiderMob(new ModelAnkh(0), 0.5F,"textures/entities/ankh.png"));
		
		RenderingRegistry.registerEntityRenderingHandler(EntityBugsterVirus.class, new RenderRiderMob2(new ModelBiped(), 0.5F,"textures/entities/bugster_virus.png"));
		
		RenderingRegistry.registerEntityRenderingHandler(EntityNebulaBugsterVirus.class, new RenderRiderMob2(new ModelBiped(), 0.5F,"textures/entities/nebula_bugster_virus.png"));
		
		RenderingRegistry.registerEntityRenderingHandler(Entitygamma_commando.class, new RenderRiderMob2(new ModelBiped(), 0.5F,"textures/entities/gamma_commandos.png"));
		
		RenderingRegistry.registerEntityRenderingHandler(Entityshocker_combatman.class, new RenderRiderMob2(new ModelBiped(), 0.5F,"textures/entities/shocker_combatman.png"));
		
		RenderingRegistry.registerEntityRenderingHandler(Entityguardian.class, new RenderRiderMob2(new ModelBiped(), 0.5F,"textures/entities/guardian.png"));
		
		RenderingRegistry.registerEntityRenderingHandler(EntityChronos.class, new RenderRiderMob2(new ModelBiped(), 0.5F,"textures/entities/chronos.png"));
		
		RenderingRegistry.registerEntityRenderingHandler(EntityPoppy.class, new RenderRiderMob2(new ModelPoppy(), 0.5F,"textures/entities/poppy.png"));

		RenderingRegistry.registerEntityRenderingHandler(Entity_another_build.class, new RenderRiderMob2(new tokuMobModel("another_build2"), 0.5F,"textures/entities/another_build.png"));
		RenderingRegistry.registerEntityRenderingHandler(Entity_kodama_suika_arms.class, new RenderRiderMob2(new Model_kodama_suika_arms(), 0.5F,"textures/entities/kodama_suika_arms.png"));
		
		RenderingRegistry.registerEntityRenderingHandler(Entity_evolt.class, new RenderRiderMob2(new MobWithBeltModel(RiderItems.evol_driver_evol,"evolto2"), 0.5F,"textures/entities/evolto.png"));
		RenderingRegistry.registerEntityRenderingHandler(Entity_BloodStalk.class, new RenderRiderMob2(new tokuMobModel("blood_stalk_2"), 0.5F,"textures/entities/blood_stalk_1.png"));
		RenderingRegistry.registerEntityRenderingHandler(Entity_NightRogue.class, new RenderRiderMob2(new tokuMobModel("night_rogue_2"), 0.5F,"textures/entities/night_rogue_1.png"));
		
		RenderingRegistry.registerEntityRenderingHandler(Entity_Kaiser.class, new RenderRiderMob2(new tokuMobModel("kaiser_red_2"), 0.5F,"textures/entities/kaiser_red_1.png"));
		RenderingRegistry.registerEntityRenderingHandler(Entity_KaiserReverse.class, new RenderRiderMob2(new tokuMobModel("kaiser_blue_2"), 0.5F,"textures/entities/kaiser_blue_1.png"));
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
		
		RenderingRegistry.registerEntityRenderingHandler(EntityLazer.class, new RenderRiderMob2(new Model_lazer_bike(), 0.5F,"textures/entities/model_lazer.png"));
		
		RenderingRegistry.registerEntityRenderingHandler(EntityExaidBike.class, new RenderRiderMob2(new Model_lazer_bike(), 0.5F,"textures/entities/model_exaid_bike.png"));
		
		RenderingRegistry.registerEntityRenderingHandler(EntityMachineBuilder.class, new RenderRiderMob2(new Model_machine_builder(), 0.5F,"textures/entities/model_machine_builder.png"));
		
	}

	public void registerItemRender(Item item, int i, String string) {

		ModelLoader.setCustomModelResourceLocation(item, i,  new ModelResourceLocation(item.getRegistryName(),string));
	}

}
