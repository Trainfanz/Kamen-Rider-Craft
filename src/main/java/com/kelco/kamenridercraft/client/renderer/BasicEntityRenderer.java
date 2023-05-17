package com.kelco.kamenridercraft.client.renderer;

import com.kelco.kamenridercraft.KamenRiderCraftCore;
import com.kelco.kamenridercraft.Entities.ShockerCombatmanEntity;
import net.minecraft.client.model.ZombieModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.renderer.entity.AbstractZombieRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;


public class BasicEntityRenderer  extends  AbstractZombieRenderer<ShockerCombatmanEntity, ZombieModel<ShockerCombatmanEntity>>  {

	private static final ResourceLocation TEXTURE = new ResourceLocation(KamenRiderCraftCore.MODID, "textures/entities/shocker_combatman.png");


	public BasicEntityRenderer(EntityRendererProvider.Context ctx) {
		this(ctx, ModelLayers.ZOMBIE, ModelLayers.ZOMBIE_INNER_ARMOR, ModelLayers.ZOMBIE_OUTER_ARMOR);
	}

	public BasicEntityRenderer(EntityRendererProvider.Context ctx, ModelLayerLocation ModelLayer, ModelLayerLocation INNER_ARMOR, ModelLayerLocation OUTER_ARMO) {
		super(ctx, new ZombieModel<>(ctx.bakeLayer(ModelLayer)), new ZombieModel<>(ctx.bakeLayer(INNER_ARMOR)), new ZombieModel<>(ctx.bakeLayer(OUTER_ARMO)));
	}



	@Override
	public ResourceLocation getTextureLocation(ShockerCombatmanEntity p_114482_) {
		// TODO Auto-generated method stub
		return TEXTURE;
	}
}