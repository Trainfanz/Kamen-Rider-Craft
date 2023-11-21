package com.kelco.kamenridercraft.client.renderer;
import com.kelco.kamenridercraft.KamenRiderCraftCore;
import com.kelco.kamenridercraft.Entities.Bikes.baseBikeEntity;
import com.kelco.kamenridercraft.client.models.BikeModel;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

public class BikeRenderer extends GeoEntityRenderer<baseBikeEntity> {
	


	public BikeRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new BikeModel());
    	this.scaleWidth = 1.1f;
		this.scaleHeight = 1.1f;

    }

	@Override
	public ResourceLocation getTextureLocation(baseBikeEntity animatable) {
		 return new ResourceLocation(KamenRiderCraftCore.MODID, "textures/entities/"+animatable.NAME+".png");
	}


	
    @Override
    public void render(baseBikeEntity entity, float entityYaw, float partialTick, PoseStack poseStack,
                       MultiBufferSource bufferSource, int packedLight) {
    	poseStack.translate(0, -0.15, 0);
        super.render(entity, entityYaw, partialTick, poseStack, bufferSource, packedLight);
    }
}