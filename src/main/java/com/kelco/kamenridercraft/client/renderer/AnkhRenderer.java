package com.kelco.kamenridercraft.client.renderer;

import com.kelco.kamenridercraft.KamenRiderCraftCore;
import com.kelco.kamenridercraft.Entities.AnkhEntity;
import com.kelco.kamenridercraft.client.models.AnkhModel;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

public class AnkhRenderer extends GeoEntityRenderer<AnkhEntity> {
    public AnkhRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new AnkhModel());
    }

    @Override
    public ResourceLocation getTextureLocation(AnkhEntity animatable) {
        return new ResourceLocation(KamenRiderCraftCore.MODID, "textures/entity/ankh.png");
    }

    @Override
    public void render(AnkhEntity entity, float entityYaw, float partialTick, PoseStack poseStack,
                       MultiBufferSource bufferSource, int packedLight) {
        super.render(entity, entityYaw, partialTick, poseStack, bufferSource, packedLight);
    }
}