package com.kelco.kamenridercraft.client.renderer;

import com.kelco.kamenridercraft.KamenRiderCraftCore;
import com.kelco.kamenridercraft.Entities.BaseHenchmenEntity;
import com.kelco.kamenridercraft.client.models.BasicMobModel;


import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.resources.ResourceLocation;


public class BasicEntityRenderer  extends  HumanoidMobRenderer<BaseHenchmenEntity, BasicMobModel<BaseHenchmenEntity>>  {


	public BasicEntityRenderer(EntityRendererProvider.Context ctx) {
		this(ctx, ModelLayers.PLAYER);
	}

	
	public BasicEntityRenderer(EntityRendererProvider.Context ctx, ModelLayerLocation ModelLayer) {
		super(ctx, new BasicMobModel<>(ctx.bakeLayer(ModelLayer)),1);
	}



	@Override
	public ResourceLocation getTextureLocation(BaseHenchmenEntity p_114482_) {
		
		return new ResourceLocation(KamenRiderCraftCore.MODID, "textures/entities/"+p_114482_.NAME+".png");
	}
}