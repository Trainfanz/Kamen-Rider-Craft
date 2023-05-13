
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

public class Model_machine_builder extends ModelBiped
{
  //fields
    ModelRenderer Shape1;
    ModelRenderer Shape2;
    ModelRenderer Shape3;
    ModelRenderer Shape6;
    ModelRenderer Shape9;
    ModelRenderer Shape10;
    ModelRenderer Shape11;
    ModelRenderer Shape13;
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
    ModelRenderer Shape24;
    ModelRenderer Shape25;
    ModelRenderer Shape26;
    ModelRenderer Shape27;
    ModelRenderer Shape28;
    ModelRenderer Shape29;
    ModelRenderer Shape30;
    ModelRenderer Shape31;
    ModelRenderer Shape32;
    ModelRenderer Shape33;
    ModelRenderer Shape34;
    ModelRenderer Shape35;
    ModelRenderer Shape36;
    ModelRenderer Shape37;
    ModelRenderer Shape38;
    ModelRenderer Shape39;
    ModelRenderer Shape40;
    ModelRenderer Shape41;
    ModelRenderer Shape42;
    ModelRenderer Shape43;
    ModelRenderer Shape44;
  
  public Model_machine_builder()
  {
    textureWidth = 64;
    textureHeight = 128;
    
      Shape1 = new ModelRenderer(this, 0, 126);
      Shape1.addBox(0F, 0F, -2F, 11, 1, 1);
      Shape1.setRotationPoint(-4F, 2.4F, -6.5F);
      Shape1.setTextureSize(64, 128);
      Shape1.mirror = true;
      setRotation(Shape1, 0F, 0F, 0F);
      
      Shape2 = new ModelRenderer(this, 36, 50);
      Shape2.addBox(0F, 0F, 0F, 7, 6, 7);
      Shape2.setRotationPoint(-2F, 5F, -8F);
      Shape2.setTextureSize(64, 128);
      Shape2.mirror = true;
      setRotation(Shape2, -0.4969541F, 0F, 0F);
      
      Shape3 = new ModelRenderer(this, 40, 63);
      Shape3.addBox(-1.5F, -4F, -12F, 4, 2, 8);
      Shape3.setRotationPoint(1F, 9.5F, -7F);
      Shape3.setTextureSize(64, 128);
      Shape3.mirror = true;
      setRotation(Shape3, 0.2609142F, 0F, 0F);
      
      Shape6 = new ModelRenderer(this, 44, 73);
      Shape6.addBox(0F, 0F, 0F, 4, 8, 6);
      Shape6.setRotationPoint(-0.5F, 11F, -8F);
      Shape6.setTextureSize(64, 128);
      Shape6.mirror = true;
      setRotation(Shape6, 0.4861989F, 0F, 0F);
      

      Shape9 = new ModelRenderer(this, 0, 20);
      Shape9.mirror = true;
      Shape9.addBox(0F, -1F, 0F, 1, 4, 7);
      Shape9.setRotationPoint(4F, 10F, 0F);
      Shape9.setTextureSize(64, 128);
      setRotation(Shape9, 0.3352714F, 0F, 0F);
     
      
      Shape10 = new ModelRenderer(this, 0, 20);
      Shape10.addBox(0F, -1F, 0F, 1, 4, 7);
      Shape10.setRotationPoint(-2F, 10F, 0F);
      Shape10.setTextureSize(64, 128);
      Shape10.mirror = true;
      setRotation(Shape10, 0.3352714F, 0F, 0F);
      
      Shape11 = new ModelRenderer(this, 38, 101);
      Shape11.addBox(0F, 0F, 0F, 5, 3, 8);
      Shape11.setRotationPoint(-1F, 8F, -4F);
      Shape11.setTextureSize(64, 128);
      Shape11.mirror = true;
      setRotation(Shape11, 0.1115358F, 0F, 0F);
      
      Shape13 = new ModelRenderer(this, 23, 0);
      Shape13.addBox(0F, 0F, 0F, 3, 8, 4);
      Shape13.setRotationPoint(0F, 8F, -1F);
      Shape13.setTextureSize(64, 128);
      Shape13.mirror = true;
      setRotation(Shape13, 0F, 0F, 0F);
      
      Shape14 = new ModelRenderer(this, 50, 0);
      Shape14.addBox(-1F, 4F, -2.5F, 2, 2, 5);
      Shape14.setRotationPoint(1.5F, 16.5F, -14F);
      Shape14.setTextureSize(64, 128);
      Shape14.mirror = true;
      setRotation(Shape14, -2.356194F, 0F, 0F);
      
      Shape15 = new ModelRenderer(this, 50, 0);
      Shape15.addBox(-1F, 4F, -2.5F, 2, 2, 5);
      Shape15.setRotationPoint(1.5F, 16.5F, -14F);
      Shape15.setTextureSize(64, 128);
      Shape15.mirror = true;
      setRotation(Shape15, 3.141593F, 0F, 0F);
      
      Shape16 = new ModelRenderer(this, 50, 0);
      Shape16.addBox(-1F, 4F, -2.5F, 2, 2, 5);
      Shape16.setRotationPoint(1.5F, 16.5F, -14F);
      Shape16.setTextureSize(64, 128);
      Shape16.mirror = true;
      setRotation(Shape16, -3.926991F, 0F, 0F);
      
      Shape17 = new ModelRenderer(this, 50, 0);
      Shape17.addBox(-1F, 4F, -2.5F, 2, 2, 5);
      Shape17.setRotationPoint(1.5F, 16.5F, -14F);
      Shape17.setTextureSize(64, 128);
      Shape17.mirror = true;
      setRotation(Shape17, 1.570796F, 0F, 0F);
      
      Shape18 = new ModelRenderer(this, 46, 7);
      Shape18.addBox(-1F, -4F, -4F, 1, 8, 8);
      Shape18.setRotationPoint(2F, 16.5F, -14F);
      Shape18.setTextureSize(64, 128);
      Shape18.mirror = true;
      setRotation(Shape18, 0F, 0F, 0F);
      
      Shape19 = new ModelRenderer(this, 42, 0);
      Shape19.addBox(0F, 0F, 0F, 1, 3, 3);
      Shape19.setRotationPoint(2.5F, 14.83333F, -15.5F);
      Shape19.setTextureSize(64, 128);
      Shape19.mirror = true;
      setRotation(Shape19, 0F, 0F, 0F);
      
      Shape20 = new ModelRenderer(this, 50, 0);
      Shape20.addBox(-1F, 4F, -2.5F, 2, 2, 5);
      Shape20.setRotationPoint(1.5F, 16.5F, -14F);
      Shape20.setTextureSize(64, 128);
      Shape20.mirror = true;
      setRotation(Shape20, 0.7853982F, 0F, 0F);
      
      Shape21 = new ModelRenderer(this, 50, 0);
      Shape21.addBox(-1F, 4F, -2.5F, 2, 2, 5);
      Shape21.setRotationPoint(1.5F, 16.5F, -14F);
      Shape21.setTextureSize(64, 128);
      Shape21.mirror = true;
      setRotation(Shape21, 0F, 0F, 0F);
      
      Shape22 = new ModelRenderer(this, 50, 0);
      Shape22.addBox(-1F, 4F, -2.5F, 2, 2, 5);
      Shape22.setRotationPoint(1.5F, 16.5F, -14F);
      Shape22.setTextureSize(64, 128);
      Shape22.mirror = true;
      setRotation(Shape22, -0.7853982F, 0F, 0F);
      
      Shape23 = new ModelRenderer(this, 50, 0);
      Shape23.addBox(-1F, 4F, -2.5F, 2, 2, 5);
      Shape23.setRotationPoint(1.5F, 16.5F, -14F);
      Shape23.setTextureSize(64, 128);
      Shape23.mirror = true;
      setRotation(Shape23, -1.570796F, 0F, 0F);
      
      Shape24 = new ModelRenderer(this, 34, 23);
      Shape24.addBox(0F, 0F, 0F, 1, 2, 14);
      Shape24.setRotationPoint(3F, 17F, -15F);
      Shape24.setTextureSize(64, 128);
      setRotation(Shape24, 1.205398F, 0F, 0F);
      Shape24.mirror = false;
      
      Shape25 = new ModelRenderer(this, 0, 15);
      Shape25.addBox(0F, 0F, 0F, 3, 2, 2);
      Shape25.setRotationPoint(0F, 15.3F, -15F);
      Shape25.setTextureSize(64, 128);
      Shape25.mirror = true;
      setRotation(Shape25, 0F, 0F, 0F);
      
      Shape26 = new ModelRenderer(this, 34, 23);
      Shape26.addBox(0F, 0F, 0F, 1, 2, 14);
      Shape26.setRotationPoint(-1F, 17F, -15F);
      Shape26.setTextureSize(64, 128);
      Shape26.mirror = true;
      setRotation(Shape26, 1.205398F, 0F, 0F);
      
      Shape27 = new ModelRenderer(this, 50, 0);
      Shape27.addBox(-1F, 4F, -2.5F, 2, 2, 5);
      Shape27.setRotationPoint(1.5F, 16.5F, 8F);
      Shape27.setTextureSize(64, 128);
      Shape27.mirror = true;
      setRotation(Shape27, 1.570796F, 0F, 0F);
      
      Shape28 = new ModelRenderer(this, 50, 0);
      Shape28.addBox(-1F, 4F, -2.5F, 2, 2, 5);
      Shape28.setRotationPoint(1.5F, 16.5F, 8F);
      Shape28.setTextureSize(64, 128);
      Shape28.mirror = true;
      setRotation(Shape28, -3.926991F, 0F, 0F);
      
      Shape29 = new ModelRenderer(this, 46, 7);
      Shape29.addBox(-1F, -4F, -4F, 1, 8, 8);
      Shape29.setRotationPoint(2F, 16.5F, 8F);
      Shape29.setTextureSize(64, 128);
      Shape29.mirror = true;
      setRotation(Shape29, 0F, 0F, 0F);
      
      Shape30 = new ModelRenderer(this, 50, 0);
      Shape30.addBox(-1F, 4F, -2.5F, 2, 2, 5);
      Shape30.setRotationPoint(1.5F, 16.5F, 8F);
      Shape30.setTextureSize(64, 128);
      Shape30.mirror = true;
      setRotation(Shape30, 3.141593F, 0F, 0F);
      
      Shape31 = new ModelRenderer(this, 50, 0);
      Shape31.addBox(-1F, 4F, -2.5F, 2, 2, 5);
      Shape31.setRotationPoint(1.5F, 16.5F, 8F);
      Shape31.setTextureSize(64, 128);
      Shape31.mirror = true;
      setRotation(Shape31, -2.356194F, 0F, 0F);
      
      Shape32 = new ModelRenderer(this, 42, 0);
      Shape32.addBox(0F, 0F, 0F, 1, 3, 3);
      Shape32.setRotationPoint(2.5F, 14.83333F, 6.5F);
      Shape32.setTextureSize(64, 128);
      Shape32.mirror = true;
      setRotation(Shape32, 0F, 0F, 0F);
      
      Shape33 = new ModelRenderer(this, 0, 35);
      Shape33.addBox(0F, 0F, 0F, 1, 2, 7);
      Shape33.setRotationPoint(3F, 14F, 2F);
      Shape33.setTextureSize(64, 128);
      Shape33.mirror = true;
      setRotation(Shape33, -0.2073888F, 0F, 0F);
      
      Shape34 = new ModelRenderer(this, 50, 0);
      Shape34.addBox(-1F, 4F, -2.5F, 2, 2, 5);
      Shape34.setRotationPoint(1.5F, 16.5F, 8F);
      Shape34.setTextureSize(64, 128);
      Shape34.mirror = true;
      setRotation(Shape34, -0.7853982F, 0F, 0F);
      
      Shape35 = new ModelRenderer(this, 50, 0);
      Shape35.addBox(-1F, 4F, -2.5F, 2, 2, 5);
      Shape35.setRotationPoint(1.5F, 16.5F, 8F);
      Shape35.setTextureSize(64, 128);
      Shape35.mirror = true;
      setRotation(Shape35, -1.570796F, 0F, 0F);
      
      Shape36 = new ModelRenderer(this, 50, 0);
      Shape36.addBox(-1F, 4F, -2.5F, 2, 2, 5);
      Shape36.setRotationPoint(1.5F, 16.5F, 8F);
      Shape36.setTextureSize(64, 128);
      Shape36.mirror = true;
      setRotation(Shape36, 0F, 0F, 0F);
      
      Shape37 = new ModelRenderer(this, 50, 0);
      Shape37.addBox(-1F, 4F, -2.5F, 2, 2, 5);
      Shape37.setRotationPoint(1.5F, 16.5F, 8F);
      Shape37.setTextureSize(64, 128);
      Shape37.mirror = true;
      setRotation(Shape37, 0.7853982F, 0F, 0F);
      
      Shape38 = new ModelRenderer(this, 0, 15);
      Shape38.addBox(0F, 0F, 0F, 3, 2, 2);
      Shape38.setRotationPoint(0F, 15.3F, 7F);
      Shape38.setTextureSize(64, 128);
      Shape38.mirror = true;
      setRotation(Shape38, 0F, 0F, 0F);
      
      Shape39 = new ModelRenderer(this, 0, 35);
      Shape39.addBox(0F, 0F, 0F, 1, 2, 7);
      Shape39.setRotationPoint(-1F, 14F, 2F);
      Shape39.setTextureSize(64, 128);
      Shape39.mirror = true;
      setRotation(Shape39, -0.2073888F, 0F, 0F);
      
      Shape40 = new ModelRenderer(this, 0, 107);
      Shape40.addBox(0F, 0F, 0F, 5, 5, 11);
      Shape40.setRotationPoint(-1F, 6.5F, 4F);
      Shape40.setTextureSize(64, 128);
      Shape40.mirror = true;
      setRotation(Shape40, 0.37245F, 0F, 0F);
      
      Shape41 = new ModelRenderer(this, 40, 92);
      Shape41.addBox(0F, 0F, 0F, 4, 1, 8);
      Shape41.setRotationPoint(-0.5F, 7F, -4F);
      Shape41.setTextureSize(64, 128);
      Shape41.mirror = true;
      setRotation(Shape41, 0F, 0F, 0F);
      
      Shape42 = new ModelRenderer(this, 19, 39);
      Shape42.addBox(0F, 0F, -2F, 2, 6, 6);
      Shape42.setRotationPoint(0.5F, 2.5F, -14F);
      Shape42.setTextureSize(64, 128);
      Shape42.mirror = true;
      setRotation(Shape42, 0.4089647F, 0F, 0F);
      
      Shape43 = new ModelRenderer(this, 40, 39);
      Shape43.addBox(0F, 0F, -2F, 7, 4, 4);
      Shape43.setRotationPoint(-2F, 3.2F, -11F);
      Shape43.setTextureSize(64, 128);
      Shape43.mirror = true;
      setRotation(Shape43, 0.4833219F, 0F, 0F);
      
      Shape44 = new ModelRenderer(this, 0, 0);
      Shape44.addBox(0.5F, 0F, 0.4F, 2, 2, 5);
      Shape44.setRotationPoint(0F, 6F, 3F);
      Shape44.setTextureSize(64, 128);
      Shape44.mirror = true;
      setRotation(Shape44, 0.3717861F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
	this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
	GL11.glScalef(1.1F, 1.1F, 1.1F);
	GL11.glTranslatef(-0.1f, 0f, 0f);
    Shape1.render(f5);
    Shape2.render(f5);
    Shape3.render(f5);
    Shape6.render(f5);
    Shape9.render(f5);
    Shape10.render(f5);
    Shape11.render(f5);
    Shape13.render(f5);
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
    Shape24.render(f5);
    Shape25.render(f5);
    Shape26.render(f5);
    Shape27.render(f5);
    Shape28.render(f5);
    Shape29.render(f5);
    Shape30.render(f5);
    Shape31.render(f5);
    Shape32.render(f5);
    Shape33.render(f5);
    Shape34.render(f5);
    Shape35.render(f5);
    Shape36.render(f5);
    Shape37.render(f5);
    Shape38.render(f5);
    Shape39.render(f5);
    Shape40.render(f5);
    Shape41.render(f5);
    Shape42.render(f5);
    Shape43.render(f5);
    Shape44.render(f5);
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