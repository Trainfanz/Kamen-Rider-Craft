
package Kamen_Rider_Craft_4TH.model;

import org.lwjgl.opengl.GL11;

import Kamen_Rider_Craft_4TH.RiderItems;
import Kamen_Rider_Craft_4TH.item.Ex_Aid.item_ex_aiddriver;
import Kamen_Rider_Craft_4TH.util.Refercence;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class Model_elementary_inves extends ModelBiped
{
  //fields
    ModelRenderer head;
    ModelRenderer body3;
    ModelRenderer body2;
    
  
  public Model_elementary_inves()
  {
    textureWidth = 64;
    textureHeight = 64;
    
      head = new ModelRenderer(this, 0, 0);
      head.addBox(-4F, -6F, -6F, 8, 8, 8);
      head.setRotationPoint(0F, 0F, 0F);
      head.setTextureSize(64, 64);
      head.mirror = true;
      setRotation(head, 0F, 0F, 0F);
      
      body3 = new ModelRenderer(this, 0, 32);
      body3.addBox(-9F, -5F, -2F, 18, 9, 8);
      body3.setRotationPoint(0F, 0F, 0F);
      body3.setTextureSize(64, 64);
      body3.mirror = true;
      setRotation(body3, 0.3717861F, 0F, 0F);
      
      body2 = new ModelRenderer(this, 0, 49);
      body2.addBox(-5F, 0F, 3F, 10, 11, 3);
      body2.setRotationPoint(0F, 0F, 0F);
      body2.setTextureSize(64, 64);
      body2.mirror = true;
      setRotation(body2, -0.2602503F, 0F, 0F);
      
      bipedRightArm.setTextureSize(64, 32);
      bipedLeftArm.setTextureSize(64, 32);
      bipedRightLeg.setTextureSize(64, 32);
      bipedLeftLeg.setTextureSize(64, 32);
      
      bipedRightArm = new ModelRenderer(this, 40, 16);
      bipedRightArm.addBox(-3F, -2F, -2F, 4, 12, 4);
      bipedRightArm.setRotationPoint(-5F, 2F, 0F);
      bipedRightArm.setTextureSize(64, 64);
      setRotation(bipedRightArm, 0F, 0F, 0F);
      

      bipedLeftArm = new ModelRenderer(this, 40, 16);
      bipedLeftArm.mirror = true;
      bipedLeftArm.addBox(-1F, -2F, -2F, 4, 12, 4);
      bipedLeftArm.setRotationPoint(5F, 2F, 0F);
      bipedLeftArm.setTextureSize(64, 64);
      setRotation(bipedLeftArm, 0F, 0F, 0F);

      bipedRightLeg = new ModelRenderer(this, 0, 16);
      bipedRightLeg.addBox(-2F, 0F, -2F, 4, 12, 4);
      bipedRightLeg.setRotationPoint(-2F, 12F, 0F);
      bipedRightLeg.setTextureSize(64, 64);
      setRotation(bipedRightLeg, 0F, 0F, 0F);

      
      bipedLeftLeg = new ModelRenderer(this, 0, 16);
      bipedLeftLeg.mirror = true;
      bipedLeftLeg.addBox(-2F, 0F, -2F, 4, 12, 4);
      bipedLeftLeg.setRotationPoint(2F, 12F, 0F);
      bipedLeftLeg.setTextureSize(64, 64);
      setRotation(bipedLeftLeg, 0F, 0F, 0F);
      
      bipedBody = new ModelRenderer(this, 16, 16);
      bipedBody.addBox(-4F, 0F, -2F, 8, 12, 4);
      bipedBody.setRotationPoint(0F, 0F, 0F);
      bipedBody.setTextureSize(64, 64);
      setRotation(bipedBody, 0F, 0F, 0F);
      
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    head.render(f5);
    body3.render(f5);
    bipedRightArm.render(f5);
    bipedLeftArm.render(f5);
    bipedRightLeg.render(f5);
    bipedLeftLeg.render(f5);
    body2.render(f5);
    bipedBody.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
  }

}
