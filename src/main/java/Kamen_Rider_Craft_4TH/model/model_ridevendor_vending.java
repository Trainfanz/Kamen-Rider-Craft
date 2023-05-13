
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

public class model_ridevendor_vending extends model_belt_plus
{
  //fields
    ModelRenderer Shape8;
    ModelRenderer Shape9;
    ModelRenderer Shape10;
    ModelRenderer Shape11;
    ModelRenderer Shape12;
    ModelRenderer Shape13;
    ModelRenderer Shape14;
    ModelRenderer Shape15;
    ModelRenderer Shape16;
    ModelRenderer Shape17;
    ModelRenderer Shape18;
    ModelRenderer Shape19;
    ModelRenderer Shape43;
    ModelRenderer Shape38;
    ModelRenderer Shape29;
    ModelRenderer Shape35;
    ModelRenderer Shape31;
    ModelRenderer Shape30;
    ModelRenderer Shape28;
    ModelRenderer Shape27;
    ModelRenderer Shape37;
    ModelRenderer Shape36;
    ModelRenderer Shape34;
    ModelRenderer Shape1;
    ModelRenderer Shape2;
    ModelRenderer Shape3;
    ModelRenderer Shape4;
    ModelRenderer Shape5;
    ModelRenderer Shape6;
    ModelRenderer Shape7;
  
  public model_ridevendor_vending()
  {
    textureWidth = 64;
    textureHeight = 128;
    

      Shape8 = new ModelRenderer(this, 35, 0);
      Shape8.addBox(0F, 0F, 0F, 1, 2, 6);
      Shape8.setRotationPoint(1.6F, -8.4F, -1F);
      Shape8.setTextureSize(64, 128);
      setRotation(Shape8, -0.765068F, 0F, 0F);
      
      Shape9 = new ModelRenderer(this, 35, 0);
      Shape9.addBox(0F, 0F, 0F, 1, 2, 6);
      Shape9.setRotationPoint(-2.6F, -8.4F, -1F);
      Shape9.setTextureSize(64, 128);
      setRotation(Shape9, -0.765068F, 0F, 0F);
      
      Shape10 = new ModelRenderer(this, 50, 0);
      Shape10.addBox(-1F, 4F, -2.5F, 2, 2, 5);
      Shape10.setRotationPoint(-5.5F, 16.5F, 2F);
      Shape10.setTextureSize(64, 128);
      setRotation(Shape10, 1.570796F, 0F, 0F);
      
      Shape11 = new ModelRenderer(this, 50, 0);
      Shape11.addBox(-1F, 4F, -2.5F, 2, 2, 5);
      Shape11.setRotationPoint(-5.5F, 16.5F, 2F);
      Shape11.setTextureSize(64, 128);
      setRotation(Shape11, -3.926991F, 0F, 0F);
      
      Shape12 = new ModelRenderer(this, 46, 7);
      Shape12.addBox(-1F, -4F, -4F, 1, 8, 8);
      Shape12.setRotationPoint(-5F, 16.5F, 2F);
      Shape12.setTextureSize(64, 128);
      setRotation(Shape12, 0F, 0F, 0F);
      
      Shape13 = new ModelRenderer(this, 50, 0);
      Shape13.addBox(-1F, 4F, -2.5F, 2, 2, 5);
      Shape13.setRotationPoint(-5.5F, 16.5F, 2F);
      Shape13.setTextureSize(64, 128);
      setRotation(Shape13, 3.141593F, 0F, 0F);
      
      Shape14 = new ModelRenderer(this, 50, 0);
      Shape14.addBox(-1F, 4F, -2.5F, 2, 2, 5);
      Shape14.setRotationPoint(-5.5F, 16.5F, 2F);
      Shape14.setTextureSize(64, 128);
      setRotation(Shape14, -2.356194F, 0F, 0F);
      
      Shape15 = new ModelRenderer(this, 50, 0);
      Shape15.addBox(-1F, 4F, -2.5F, 2, 2, 5);
      Shape15.setRotationPoint(-5.5F, 16.5F, 2F);
      Shape15.setTextureSize(64, 128);
      setRotation(Shape15, -0.7853982F, 0F, 0F);
      
      Shape16 = new ModelRenderer(this, 50, 0);
      Shape16.addBox(-1F, 4F, -2.5F, 2, 2, 5);
      Shape16.setRotationPoint(-5.5F, 16.5F, 2F);
      Shape16.setTextureSize(64, 128);
      setRotation(Shape16, -1.570796F, 0F, 0F);
      
      Shape17 = new ModelRenderer(this, 50, 0);
      Shape17.addBox(-1F, 4F, -2.5F, 2, 2, 5);
      Shape17.setRotationPoint(-5.5F, 16.5F, 2F);
      Shape17.setTextureSize(64, 128);
      setRotation(Shape17, 0F, 0F, 0F);
      
      Shape18 = new ModelRenderer(this, 50, 0);
      Shape18.addBox(-1F, 4F, -2.5F, 2, 2, 5);
      Shape18.setRotationPoint(-5.5F, 16.5F, 2F);
      Shape18.setTextureSize(64, 128);
      setRotation(Shape18, 0.7853982F, 0F, 0F);
      
      Shape19 = new ModelRenderer(this, 0, 15);
      Shape19.addBox(0F, 0F, 0F, 3, 2, 2);
      Shape19.setRotationPoint(-7F, 15.3F, 1F);
      Shape19.setTextureSize(64, 128);
      setRotation(Shape19, 0F, 0F, 0F);
      
      Shape43 = new ModelRenderer(this, 0, 0);
      Shape43.addBox(0F, -2F, -2F, 7, 7, 2);
      Shape43.setRotationPoint(-3.5F, -5.2F, 2F);
      Shape43.setTextureSize(64, 128);
      setRotation(Shape43, -2.338431F, 0F, 0F);
      
      Shape38 = new ModelRenderer(this, 0, 15);
      Shape38.addBox(0F, 0F, 0F, 3, 2, 2);
      Shape38.setRotationPoint(4F, 15.3F, 1F);
      Shape38.setTextureSize(64, 128);
      setRotation(Shape38, 0F, 0F, 0F);
      
      Shape29 = new ModelRenderer(this, 46, 7);
      Shape29.addBox(-1F, -4F, -4F, 1, 8, 8);
      Shape29.setRotationPoint(6F, 16.5F, 2F);
      Shape29.setTextureSize(64, 128);
      setRotation(Shape29, 0F, 0F, 0F);
      
      Shape35 = new ModelRenderer(this, 50, 0);
      Shape35.addBox(-1F, 4F, -2.5F, 2, 2, 5);
      Shape35.setRotationPoint(5.5F, 16.5F, 2F);
      Shape35.setTextureSize(64, 128);
      setRotation(Shape35, -1.570796F, 0F, 0F);
      
      Shape31 = new ModelRenderer(this, 50, 0);
      Shape31.addBox(-1F, 4F, -2.5F, 2, 2, 5);
      Shape31.setRotationPoint(5.5F, 16.5F, 2F);
      Shape31.setTextureSize(64, 128);
      setRotation(Shape31, -2.356194F, 0F, 0F);
      
      Shape30 = new ModelRenderer(this, 50, 0);
      Shape30.addBox(-1F, 4F, -2.5F, 2, 2, 5);
      Shape30.setRotationPoint(5.5F, 16.5F, 2F);
      Shape30.setTextureSize(64, 128);
      setRotation(Shape30, 3.141593F, 0F, 0F);
      
      Shape28 = new ModelRenderer(this, 50, 0);
      Shape28.addBox(-1F, 4F, -2.5F, 2, 2, 5);
      Shape28.setRotationPoint(5.5F, 16.5F, 2F);
      Shape28.setTextureSize(64, 128);
      setRotation(Shape28, -3.926991F, 0F, 0F);
      
      Shape27 = new ModelRenderer(this, 50, 0);
      Shape27.addBox(-1F, 4F, -2.5F, 2, 2, 5);
      Shape27.setRotationPoint(5.5F, 16.5F, 2F);
      Shape27.setTextureSize(64, 128);
      setRotation(Shape27, 1.570796F, 0F, 0F);
      
      Shape37 = new ModelRenderer(this, 50, 0);
      Shape37.addBox(-1F, 4F, -2.5F, 2, 2, 5);
      Shape37.setRotationPoint(5.5F, 16.5F, 2F);
      Shape37.setTextureSize(64, 128);
      setRotation(Shape37, 0.7853982F, 0F, 0F);
      
      Shape36 = new ModelRenderer(this, 50, 0);
      Shape36.addBox(-1F, 4F, -2.5F, 2, 2, 5);
      Shape36.setRotationPoint(5.5F, 16.5F, 2F);
      Shape36.setTextureSize(64, 128);
      setRotation(Shape36, 0F, 0F, 0F);
      
      Shape34 = new ModelRenderer(this, 50, 0);
      Shape34.addBox(-1F, 4F, -2.5F, 2, 2, 5);
      Shape34.setRotationPoint(5.5F, 16.5F, 2F);
      Shape34.setTextureSize(64, 128);
      setRotation(Shape34, -0.7853982F, 0F, 0F);
      
      Shape1 = new ModelRenderer(this, 0, 25);
      Shape1.addBox(0F, 0F, 0F, 8, 28, 12);
      Shape1.setRotationPoint(-4F, -5F, -5F);
      Shape1.setTextureSize(64, 128);
      setRotation(Shape1, 0F, 0F, 0F);
      
      Shape2 = new ModelRenderer(this, 32, 66);
      Shape2.addBox(0F, 0F, 0F, 3, 16, 12);
      Shape2.setRotationPoint(4F, -5F, -5F);
      Shape2.setTextureSize(64, 128);
      setRotation(Shape2, 0F, 0F, 0F);
      
      Shape3 = new ModelRenderer(this, 0, 66);
      Shape3.addBox(0F, 0F, 0F, 3, 16, 12);
      Shape3.setRotationPoint(-7F, -5F, -5F);
      Shape3.setTextureSize(64, 128);
      setRotation(Shape3, 0F, 0F, 0F);
      
      Shape4 = new ModelRenderer(this, 24, 0);
      Shape4.addBox(0.5F, -5F, 0F, 1, 3, 1);
      Shape4.setRotationPoint(-5F, 13F, -6F);
      Shape4.setTextureSize(64, 128);
      setRotation(Shape4, 0F, 0F, 0F);
      
      Shape5 = new ModelRenderer(this, 24, 0);
      Shape5.addBox(0.5F, -5F, 0F, 1, 3, 1);
      Shape5.setRotationPoint(3F, 13F, -6F);
      Shape5.setTextureSize(64, 128);
      setRotation(Shape5, 0F, 0F, 0F);
      
      Shape6 = new ModelRenderer(this, 19, 0);
      Shape6.addBox(0.5F, -5F, 0F, 1, 3, 1);
      Shape6.setRotationPoint(-5F, 0F, -6F);
      Shape6.setTextureSize(64, 128);
      setRotation(Shape6, 0F, 0F, 0F);
      
      Shape7 = new ModelRenderer(this, 19, 0);
      Shape7.addBox(0.5F, -5F, 0F, 1, 3, 1);
      Shape7.setRotationPoint(3F, 0F, -6F);
      Shape7.setTextureSize(64, 128);
      setRotation(Shape7, 0F, 0F, 0F);
  }
  
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		GL11.glScalef(1.3F, 1.3F, 1.3F);
		GL11.glTranslatef(-0.1f, -0.2f, 0f);
		Shape1.render(f5);
		Shape2.render(f5);
		Shape3.render(f5);
		Shape4.render(f5);
		Shape5.render(f5);
		Shape6.render(f5);
		Shape7.render(f5);
		Shape8.render(f5);
		Shape9.render(f5);
		Shape10.render(f5);
		Shape11.render(f5);
		Shape12.render(f5);
		Shape13.render(f5);
		Shape14.render(f5);
		Shape15.render(f5);
		Shape16.render(f5);
		Shape17.render(f5);
		Shape18.render(f5);
		Shape19.render(f5);
		Shape27.render(f5);
		Shape28.render(f5);
		Shape29.render(f5);
		Shape30.render(f5);
		Shape31.render(f5);
		Shape35.render(f5);
		Shape34.render(f5);
		Shape36.render(f5);
		Shape37.render(f5);
		Shape38.render(f5);
		Shape43.render(f5);
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
