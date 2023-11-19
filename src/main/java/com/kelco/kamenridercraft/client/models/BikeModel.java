package com.kelco.kamenridercraft.client.models;


import com.kelco.kamenridercraft.KamenRiderCraftCore;
import com.kelco.kamenridercraft.Entities.AnkhEntity;
import com.kelco.kamenridercraft.Entities.Bikes.baseBikeEntity;

import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.core.animation.AnimationState;
import software.bernie.geckolib.model.GeoModel;

public class BikeModel extends GeoModel<baseBikeEntity> {
    @Override
    public ResourceLocation getModelResource(baseBikeEntity animatable) {
        return new ResourceLocation(KamenRiderCraftCore.MODID, "geo/"+animatable.NAME+".geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(baseBikeEntity animatable) {
        return new ResourceLocation(KamenRiderCraftCore.MODID, "textures/entity/"+animatable.NAME_MODEL+".png");
    }

    @Override
    public ResourceLocation getAnimationResource(baseBikeEntity animatable) {
        return new ResourceLocation(KamenRiderCraftCore.MODID, "animations/hardboilder.animation.json");
    }

    @Override
    public void setCustomAnimations(baseBikeEntity animatable, long instanceId, AnimationState<baseBikeEntity> animationState) {
  
    }


}