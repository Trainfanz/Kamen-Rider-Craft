package com.kelco.kamenridercraft.client.renderer;

import com.kelco.kamenridercraft.KamenRiderCraftCore;
import com.kelco.kamenridercraft.Entities.ShockerCombatmanEntity;
import com.kelco.kamenridercraft.client.models.BasicMobModel;


import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.resources.ResourceLocation;


public class BasicEntityRenderer  extends  HumanoidMobRenderer<ShockerCombatmanEntity, BasicMobModel<ShockerCombatmanEntity>>  {

	private static final ResourceLocation TEXTURE = new ResourceLocation(KamenRiderCraftCore.MODID, "textures/entities/shocker_combatman.png");


	public BasicEntityRenderer(EntityRendererProvider.Context ctx) {
		this(ctx, ModelLayers.PLAYER);
	}

	
	public BasicEntityRenderer(EntityRendererProvider.Context ctx, ModelLayerLocation ModelLayer) {
		super(ctx, new BasicMobModel<>(ctx.bakeLayer(ModelLayer)),1);
	}



	@Override
	public ResourceLocation getTextureLocation(ShockerCombatmanEntity p_114482_) {
		// TODO Auto-generated method stub
		return TEXTURE;
	}
}