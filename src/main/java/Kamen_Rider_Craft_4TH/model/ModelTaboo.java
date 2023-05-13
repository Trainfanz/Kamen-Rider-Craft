package Kamen_Rider_Craft_4TH.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
 
/**
 * ModelTaboo - kelco
 * Created using Tabula 7.0.0
 */
public class ModelTaboo extends ModelBiped {
    public ModelRenderer bipedRightArm2;
    public ModelRenderer bipedRightLeg2;
    public ModelRenderer bipedLeftLeg2;
    public ModelRenderer bipedHeadwear2;
    public ModelRenderer bipedLeftArm2;
    public ModelRenderer bipedBody2;
    public ModelRenderer bipedHead2;

    public ModelTaboo() {
        this.textureWidth = 64;
        this.textureHeight = 128;
        
        this.bipedHead2 = new ModelRenderer(this, 0, 0);
        this.bipedHead2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.bipedHead2.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F);
        
        this.bipedRightLeg2 = new ModelRenderer(this, 0, 32);
        this.bipedRightLeg2.setRotationPoint(-1.9F, 11.0F, 0.4F);
        this.bipedRightLeg2.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F);
        this.setRotateAngle(bipedRightLeg2, -0.3839724354387525F, 0.0F, 0.0F);
        
        this.bipedRightArm2 = new ModelRenderer(this, 40, 16);
        this.bipedRightArm2.setRotationPoint(-5.0F, 2.0F, 0.0F);
        this.bipedRightArm2.addBox(-3.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F);
        this.setRotateAngle(bipedRightArm2, -2.1855012893472994F, -0.27314402793711257F, 0.091106186954104F);
        
        this.bipedHeadwear2 = new ModelRenderer(this, 32, 0);
        this.bipedHeadwear2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.bipedHeadwear2.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8, 0.5F);
        
        this.bipedLeftLeg2 = new ModelRenderer(this, 16, 32);
        this.bipedLeftLeg2.mirror = true;
        this.bipedLeftLeg2.setRotationPoint(1.9F, 11.0F, 0.4F);
        this.bipedLeftLeg2.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F);
        this.setRotateAngle(bipedLeftLeg2, -0.3839724354387525F, 0.0F, 0.0F);
        
        this.bipedLeftArm2 = new ModelRenderer(this, 0, 16);
        this.bipedLeftArm2.mirror = true;
        this.bipedLeftArm2.setRotationPoint(5.0F, 2.0F, 0.0F);
        this.bipedLeftArm2.addBox(-1.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F);
        this.setRotateAngle(bipedLeftArm2, -1.0616837839881506F, 1.2747884856566583F, -0.045553093477052F);
        
        this.bipedBody2 = new ModelRenderer(this, 16, 16);
        this.bipedBody2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.bipedBody2.addBox(-4.0F, 0.0F, -2.0F, 8, 12, 4, 0.0F);
    }

    public void render(Entity par1Entity, float par2, float par3, float par4, float par5, float par6, float par7)
    {
        this.setRotationAngles(par2, par3, par4, par5, par6, par7, par1Entity);

        {
            this.bipedBody2.render(par7);
            this.bipedHead2.render(par7);
            this.bipedHeadwear2.render(par7);
            this.bipedRightArm2.render(par7);
            this.bipedLeftArm2.render(par7);
            this.bipedRightLeg2.render(par7);
            this.bipedLeftLeg2.render(par7);
            
        }
    }
    /**
     * Sets the model's various rotation angles. For bipeds, par1 and par2 are used for animating the movement of arms
     * and legs, where par1 represents the time(so that arms and legs swing back and forth) and par2 represents how
     * "far" arms and legs can swing at most.
     */
    public void setRotationAngles(float par1, float par2, float par3, float par4, float par5, float par6, Entity par7Entity)
    {
        this.bipedHead2.rotateAngleY = par4 / (180F / (float)Math.PI);
        this.bipedHead2.rotateAngleX = par5 / (180F / (float)Math.PI);
        
        this.bipedHeadwear2.rotateAngleY = par4 / (180F / (float)Math.PI);
        this.bipedHeadwear2.rotateAngleX = par5 / (180F / (float)Math.PI);
      
    }
    
    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
