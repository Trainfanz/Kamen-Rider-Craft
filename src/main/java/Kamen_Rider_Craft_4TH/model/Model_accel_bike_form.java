
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

public class Model_accel_bike_form extends ModelBiped
{
  //fields
    ModelRenderer Shape14;
    ModelRenderer Shape15;
    ModelRenderer Shape16;
    ModelRenderer Shape17;
    ModelRenderer Shape18;
    ModelRenderer Shape19;
    ModelRenderer Shape20;
    ModelRenderer Shape21;
    ModelRenderer Shape22;
    ModelRenderer Shape23;
    ModelRenderer Shape27;
    ModelRenderer Shape28;
    ModelRenderer Shape29;
    ModelRenderer Shape30;
    ModelRenderer Shape31;
    ModelRenderer Shape34;
    ModelRenderer Shape35;
    ModelRenderer Shape36;
    ModelRenderer Shape37;
    ModelRenderer Shape38;
    ModelRenderer Shape1;
    ModelRenderer Shape2;
    ModelRenderer Shape3;
    ModelRenderer Shape4;
    ModelRenderer Shape5;
    ModelRenderer Shape6;
    ModelRenderer Shape7;
  
  public Model_accel_bike_form()
  {
    textureWidth = 64;
    textureHeight = 128;
    
      Shape14 = new ModelRenderer(this, 50, 0);
      Shape14.addBox(-1F, 4F, -2.5F, 2, 2, 5);
      Shape14.setRotationPoint(1.5F, 16.5F, -16F);
      Shape14.setTextureSize(64, 128);
      Shape14.mirror = true;
      setRotation(Shape14, -2.356194F, 0F, 0F);
      
      Shape15 = new ModelRenderer(this, 50, 0);
      Shape15.addBox(-1F, 4F, -2.5F, 2, 2, 5);
      Shape15.setRotationPoint(1.5F, 16.5F, -16F);
      Shape15.setTextureSize(64, 128);
      Shape15.mirror = true;
      setRotation(Shape15, 3.141593F, 0F, 0F);
      
      Shape16 = new ModelRenderer(this, 50, 0);
      Shape16.addBox(-1F, 4F, -2.5F, 2, 2, 5);
      Shape16.setRotationPoint(1.5F, 16.5F, -16F);
      Shape16.setTextureSize(64, 128);
      Shape16.mirror = true;
      setRotation(Shape16, -3.926991F, 0F, 0F);
      
      Shape17 = new ModelRenderer(this, 50, 0);
      Shape17.addBox(-1F, 4F, -2.5F, 2, 2, 5);
      Shape17.setRotationPoint(1.5F, 16.5F, -16F);
      Shape17.setTextureSize(64, 128);
      Shape17.mirror = true;
      setRotation(Shape17, 1.570796F, 0F, 0F);
      
      Shape18 = new ModelRenderer(this, 46, 7);
      Shape18.addBox(-1F, -4F, -4F, 1, 8, 8);
      Shape18.setRotationPoint(2F, 16.5F, -16F);
      Shape18.setTextureSize(64, 128);
      Shape18.mirror = true;
      setRotation(Shape18, 0F, 0F, 0F);
      
      Shape19 = new ModelRenderer(this, 24, 19);
      Shape19.addBox(0F, 0F, 0F, 5, 3, 4);
      Shape19.setRotationPoint(-1F, 14.83333F, -17.5F);
      Shape19.setTextureSize(64, 128);
      Shape19.mirror = true;
      setRotation(Shape19, 0.3595998F, 0F, 0F);
      
      Shape20 = new ModelRenderer(this, 50, 0);
      Shape20.addBox(-1F, 4F, -2.5F, 2, 2, 5);
      Shape20.setRotationPoint(1.5F, 16.5F, -16F);
      Shape20.setTextureSize(64, 128);
      Shape20.mirror = true;
      setRotation(Shape20, 0.7853982F, 0F, 0F);
      
      Shape21 = new ModelRenderer(this, 50, 0);
      Shape21.addBox(-1F, 4F, -2.5F, 2, 2, 5);
      Shape21.setRotationPoint(1.5F, 16.5F, -16F);
      Shape21.setTextureSize(64, 128);
      Shape21.mirror = true;
      setRotation(Shape21, 0F, 0F, 0F);
      
      Shape22 = new ModelRenderer(this, 50, 0);
      Shape22.addBox(-1F, 4F, -2.5F, 2, 2, 5);
      Shape22.setRotationPoint(1.5F, 16.5F, -16F);
      Shape22.setTextureSize(64, 128);
      Shape22.mirror = true;
      setRotation(Shape22, -0.7853982F, 0F, 0F);
      
      Shape23 = new ModelRenderer(this, 50, 0);
      Shape23.addBox(-1F, 4F, -2.5F, 2, 2, 5);
      Shape23.setRotationPoint(1.5F, 16.5F, -16F);
      Shape23.setTextureSize(64, 128);
      Shape23.mirror = true;
      setRotation(Shape23, -1.570796F, 0F, 0F);
      
      Shape27 = new ModelRenderer(this, 50, 0);
      Shape27.addBox(-1F, 4F, -2.5F, 2, 2, 5);
      Shape27.setRotationPoint(1.5F, 16.5F, 12F);
      Shape27.setTextureSize(64, 128);
      Shape27.mirror = true;
      setRotation(Shape27, 1.570796F, 0F, 0F);
      
      Shape28 = new ModelRenderer(this, 50, 0);
      Shape28.addBox(-1F, 4F, -2.5F, 2, 2, 5);
      Shape28.setRotationPoint(1.5F, 16.5F, 12F);
      Shape28.setTextureSize(64, 128);
      Shape28.mirror = true;
      setRotation(Shape28, -3.926991F, 0F, 0F);
      
      Shape29 = new ModelRenderer(this, 46, 7);
      Shape29.addBox(-1F, -4F, -4F, 1, 8, 8);
      Shape29.setRotationPoint(2F, 16.5F, 12F);
      Shape29.setTextureSize(64, 128);
      Shape29.mirror = true;
      setRotation(Shape29, 0F, 0F, 0F);
      
      Shape30 = new ModelRenderer(this, 50, 0);
      Shape30.addBox(-1F, 4F, -2.5F, 2, 2, 5);
      Shape30.setRotationPoint(1.5F, 16.5F, 12F);
      Shape30.setTextureSize(64, 128);
      Shape30.mirror = true;
      setRotation(Shape30, 3.141593F, 0F, 0F);
      
      Shape31 = new ModelRenderer(this, 50, 0);
      Shape31.addBox(-1F, 4F, -2.5F, 2, 2, 5);
      Shape31.setRotationPoint(1.5F, 16.5F, 12F);
      Shape31.setTextureSize(64, 128);
      Shape31.mirror = true;
      setRotation(Shape31, -2.356194F, 0F, 0F);
      
      Shape34 = new ModelRenderer(this, 50, 0);
      Shape34.addBox(-1F, 4F, -2.5F, 2, 2, 5);
      Shape34.setRotationPoint(1.5F, 16.5F, 12F);
      Shape34.setTextureSize(64, 128);
      Shape34.mirror = true;
      setRotation(Shape34, -0.7853982F, 0F, 0F);
      
      Shape35 = new ModelRenderer(this, 50, 0);
      Shape35.addBox(-1F, 4F, -2.5F, 2, 2, 5);
      Shape35.setRotationPoint(1.5F, 16.5F, 12F);
      Shape35.setTextureSize(64, 128);
      Shape35.mirror = true;
      setRotation(Shape35, -1.570796F, 0F, 0F);
      
      Shape36 = new ModelRenderer(this, 50, 0);
      Shape36.addBox(-1F, 4F, -2.5F, 2, 2, 5);
      Shape36.setRotationPoint(1.5F, 16.5F, 12F);
      Shape36.setTextureSize(64, 128);
      Shape36.mirror = true;
      setRotation(Shape36, 0F, 0F, 0F);
      
      Shape37 = new ModelRenderer(this, 50, 0);
      Shape37.addBox(-1F, 4F, -2.5F, 2, 2, 5);
      Shape37.setRotationPoint(1.5F, 16.5F, 12F);
      Shape37.setTextureSize(64, 128);
      Shape37.mirror = true;
      setRotation(Shape37, 0.7853982F, 0F, 0F);
      
      Shape38 = new ModelRenderer(this, 0, 15);
      Shape38.addBox(0F, 0F, 0F, 4, 2, 2);
      Shape38.setRotationPoint(-0.6F, 15.3F, 11F);
      Shape38.setTextureSize(64, 128);
      Shape38.mirror = true;
      setRotation(Shape38, 0F, 0F, 0F);
      
      Shape1 = new ModelRenderer(this, 23, 0);
      Shape1.addBox(0F, 0F, 0F, 4, 12, 4);
      Shape1.setRotationPoint(-3.5F, 18F, 2F);
      Shape1.setTextureSize(64, 128);
      Shape1.mirror = true;
      setRotation(Shape1, 1.594136F, 0F, 0F);
      
      Shape2 = new ModelRenderer(this, 45, 59);
      Shape2.addBox(0F, 0F, 0F, 6, 12, 3);
      Shape2.setRotationPoint(-1.5F, 13F, 7F);
      Shape2.setTextureSize(64, 128);
      Shape2.mirror = true;
      setRotation(Shape2, 1.979761F, 0F, 0F);
      
      
      Shape3 = new ModelRenderer(this, 23, 0);
      Shape3.mirror = true;
      Shape3.addBox(0F, 0F, 0F, 4, 12, 4);
      Shape3.setRotationPoint(2.5F, 18F, 2F);
      Shape3.setTextureSize(64, 128);
      setRotation(Shape3, 1.594136F, 0F, 0F);

      Shape4 = new ModelRenderer(this, 31, 42);
      Shape4.addBox(0F, 0F, 0F, 8, 8, 8);
      Shape4.setRotationPoint(-2.5F, 5F, -10F);
      Shape4.setTextureSize(64, 128);
      Shape4.mirror = true;
      setRotation(Shape4, 0F, 0F, 0F);
      
      Shape5 = new ModelRenderer(this, 47, 25);
      Shape5.addBox(0F, 0F, 0F, 4, 12, 4);
      Shape5.setRotationPoint(3.5F, 10F, -4F);
      Shape5.setTextureSize(64, 128);
      Shape5.mirror = true;
      setRotation(Shape5, -1.231439F, 0F, 0F);
      
      Shape6 = new ModelRenderer(this, 47, 25);
      Shape6.addBox(0F, 0F, 0F, 4, 12, 4);
      Shape6.setRotationPoint(-4.5F, 10F, -4F);
      Shape6.setTextureSize(64, 128);
      Shape6.mirror = true;
      setRotation(Shape6, -1.231438F, 0F, 0F);
      
      Shape7 = new ModelRenderer(this, 40, 76);
      Shape7.addBox(0F, 0F, 0F, 8, 12, 4);
      Shape7.setRotationPoint(-2.5F, 14F, -4F);
      Shape7.setTextureSize(64, 128);
      Shape7.mirror = true;
      setRotation(Shape7, 1.570796F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
		this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		GL11.glScalef(1.1F, 1.1F, 1.1F);
		GL11.glTranslatef(-0.1f, 0f, 0f);
    Shape14.render(f5);
    Shape15.render(f5);
    Shape16.render(f5);
    Shape17.render(f5);
    Shape18.render(f5);
    Shape19.render(f5);
    Shape20.render(f5);
    Shape21.render(f5);
    Shape22.render(f5);
    Shape23.render(f5);
    Shape27.render(f5);
    Shape28.render(f5);
    Shape29.render(f5);
    Shape30.render(f5);
    Shape31.render(f5);
    Shape34.render(f5);
    Shape35.render(f5);
    Shape36.render(f5);
    Shape37.render(f5);
    Shape38.render(f5);
    Shape1.render(f5);
    Shape2.render(f5);
    Shape3.render(f5);
    Shape4.render(f5);
    Shape5.render(f5);
    Shape6.render(f5);
    Shape7.render(f5);
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
