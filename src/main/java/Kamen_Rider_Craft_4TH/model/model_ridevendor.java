
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

public class model_ridevendor extends model_belt_plus
{
	//fields
	ModelRenderer Shape1;
	ModelRenderer Shape2;
	ModelRenderer Shape3;
	ModelRenderer Shape4;
	ModelRenderer Shape6;
	ModelRenderer Shape7;
	ModelRenderer Shape8;
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
	ModelRenderer Shape34;
	ModelRenderer Shape35;
	ModelRenderer Shape36;
	ModelRenderer Shape37;
	ModelRenderer Shape38;
	ModelRenderer Shape40;
	ModelRenderer Shape41;
	ModelRenderer Shape43;

  
  public model_ridevendor()
  {
    textureWidth = 64;
    textureHeight = 128;
    
      Shape1 = new ModelRenderer(this, 0, 126);
      Shape1.addBox(0F, 0F, -2F, 11, 1, 1);
      Shape1.setRotationPoint(-4F, 4.4F, -5.5F);
      Shape1.setTextureSize(64, 128);
      Shape1.mirror = true;
      setRotation(Shape1, 0F, 0F, 0F);
      
      Shape2 = new ModelRenderer(this, 0, 85);
      Shape2.addBox(0F, 0F, 0F, 7, 5, 8);
      Shape2.setRotationPoint(-2F, 5F, -8F);
      Shape2.setTextureSize(64, 128);
      Shape2.mirror = true;
      setRotation(Shape2, -0.2367038F, 0F, 0F);
      
      Shape6 = new ModelRenderer(this, 44, 73);
      Shape6.addBox(0F, -1F, -0.5F, 4, 9, 6);
      Shape6.setRotationPoint(-0.5F, 11.5F, -7F);
      Shape6.setTextureSize(64, 128);
      Shape6.mirror = true;
      setRotation(Shape6, 0.3374844F, 0F, 0F);
      
      Shape9 = new ModelRenderer(this, 0, 38);
      Shape9.mirror = true;
      Shape9.addBox(0F, -1F, 0F, 1, 4, 8);
      Shape9.setRotationPoint(3F, 14.73333F, -16F);
      Shape9.setTextureSize(64, 128);
      setRotation(Shape9, 0F, 0F, 0F);
      Shape9.mirror = false;
      
      Shape10 = new ModelRenderer(this, 0, 38);
      Shape10.addBox(0F, -1F, 0F, 1, 4, 8);
      Shape10.setRotationPoint(-1F, 15F, -16F);
      Shape10.setTextureSize(64, 128);
      Shape10.mirror = true;
      setRotation(Shape10, 0F, 0F, 0F);
      
      Shape11 = new ModelRenderer(this, 38, 101);
      Shape11.addBox(0F, 0F, 1F, 5, 5, 8);
      Shape11.setRotationPoint(-1F, 10F, -3F);
      Shape11.setTextureSize(64, 128);
      Shape11.mirror = true;
      setRotation(Shape11, 0.1115358F, 0F, 0F);
      
      Shape13 = new ModelRenderer(this, 23, 0);
      Shape13.addBox(0F, 0F, 0F, 3, 8, 7);
      Shape13.setRotationPoint(0F, 11F, -3F);
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
      Shape24.setRotationPoint(3.1F, 17F, -15F);
      Shape24.setTextureSize(64, 128);
      Shape24.mirror = true;
      setRotation(Shape24, 1.056684F, 0F, 0F);
      Shape24.mirror = false;
      
      Shape25 = new ModelRenderer(this, 0, 15);
      Shape25.addBox(0F, 0F, 0F, 3, 2, 2);
      Shape25.setRotationPoint(0F, 15.3F, -15F);
      Shape25.setTextureSize(64, 128);
      Shape25.mirror = true;
      setRotation(Shape25, 0F, 0F, 0F);
      Shape26 = new ModelRenderer(this, 34, 23);
      Shape26.addBox(0F, 0F, 0F, 1, 2, 14);
      Shape26.setRotationPoint(-1.1F, 17F, -15F);
      Shape26.setTextureSize(64, 128);
      Shape26.mirror = true;
      setRotation(Shape26, 1.056684F, 0F, 0F);
      
      Shape27 = new ModelRenderer(this, 50, 0);
      Shape27.addBox(-1F, 4F, -2.5F, 2, 2, 5);
      Shape27.setRotationPoint(1.5F, 16.5F, 10F);
      Shape27.setTextureSize(64, 128);
      Shape27.mirror = true;
      setRotation(Shape27, 1.570796F, 0F, 0F);
      
      Shape28 = new ModelRenderer(this, 50, 0);
      Shape28.addBox(-1F, 4F, -2.5F, 2, 2, 5);
      Shape28.setRotationPoint(1.5F, 16.5F, 10F);
      Shape28.setTextureSize(64, 128);
      Shape28.mirror = true;
      setRotation(Shape28, -3.926991F, 0F, 0F);
      
      Shape29 = new ModelRenderer(this, 0, 54);
      Shape29.addBox(-1F, -4F, -4F, 1, 8, 8);
      Shape29.setRotationPoint(2F, 16.5F, 10F);
      Shape29.setTextureSize(64, 128);
      Shape29.mirror = true;
      setRotation(Shape29, 0F, 0F, 0F);
      
      Shape30 = new ModelRenderer(this, 50, 0);
      Shape30.addBox(-1F, 4F, -2.5F, 2, 2, 5);
      Shape30.setRotationPoint(1.5F, 16.5F, 10F);
      Shape30.setTextureSize(64, 128);
      Shape30.mirror = true;
      setRotation(Shape30, 3.141593F, 0F, 0F);
      
      Shape31 = new ModelRenderer(this, 50, 0);
      Shape31.addBox(-1F, 4F, -2.5F, 2, 2, 5);
      Shape31.setRotationPoint(1.5F, 16.5F, 10F);
      Shape31.setTextureSize(64, 128);
      Shape31.mirror = true;
      setRotation(Shape31, -2.356194F, 0F, 0F);
      
      Shape32 = new ModelRenderer(this, 42, 0);
      Shape32.addBox(0F, 0F, 0F, 1, 3, 3);
      Shape32.setRotationPoint(2.5F, 14.83333F, 8.5F);
      Shape32.setTextureSize(64, 128);
      Shape32.mirror = true;
      setRotation(Shape32, 0F, 0F, 0F);
      
      Shape34 = new ModelRenderer(this, 50, 0);
      Shape34.addBox(-1F, 4F, -2.5F, 2, 2, 5);
      Shape34.setRotationPoint(1.5F, 16.5F, 10F);
      Shape34.setTextureSize(64, 128);
      Shape34.mirror = true;
      setRotation(Shape34, -0.7853982F, 0F, 0F);
      
      Shape35 = new ModelRenderer(this, 50, 0);
      Shape35.addBox(-1F, 4F, -2.5F, 2, 2, 5);
      Shape35.setRotationPoint(1.5F, 16.5F, 10F);
      Shape35.setTextureSize(64, 128);
      Shape35.mirror = true;
      setRotation(Shape35, -1.570796F, 0F, 0F);
      
      Shape36 = new ModelRenderer(this, 50, 0);
      Shape36.addBox(-1F, 4F, -2.5F, 2, 2, 5);
      Shape36.setRotationPoint(1.5F, 16.5F, 10F);
      Shape36.setTextureSize(64, 128);
      Shape36.mirror = true;
      setRotation(Shape36, 0F, 0F, 0F);
      
      Shape37 = new ModelRenderer(this, 50, 0);
      Shape37.addBox(-1F, 4F, -2.5F, 2, 2, 5);
      Shape37.setRotationPoint(1.5F, 16.5F, 10F);
      Shape37.setTextureSize(64, 128);
      Shape37.mirror = true;
      setRotation(Shape37, 0.7853982F, 0F, 0F);
      
      Shape38 = new ModelRenderer(this, 0, 15);
      Shape38.addBox(0F, 0F, 0F, 3, 2, 2);
      Shape38.setRotationPoint(0F, 15.3F, 9F);
      Shape38.setTextureSize(64, 128);
      Shape38.mirror = true;
      setRotation(Shape38, 0F, 0F, 0F);
      
      Shape40 = new ModelRenderer(this, 1, 108);
      Shape40.addBox(-1F, 0F, 0F, 5, 4, 10);
      Shape40.setRotationPoint(0F, 6.5F, 6F);
      Shape40.setTextureSize(64, 128);
      Shape40.mirror = true;
      setRotation(Shape40, -0.0356295F, 0F, 0F);
      
      Shape41 = new ModelRenderer(this, 40, 92);
      Shape41.addBox(0F, 0F, 0F, 4, 1, 8);
      Shape41.setRotationPoint(-0.5F, 9F, -2F);
      Shape41.setTextureSize(64, 128);
      Shape41.mirror = true;
      setRotation(Shape41, 0.1115358F, 0F, 0F);
      
      Shape43 = new ModelRenderer(this, 0, 74);
      Shape43.addBox(0F, -2F, -2F, 7, 7, 2);
      Shape43.setRotationPoint(-2F, 6.2F, -8F);
      Shape43.setTextureSize(64, 128);
      Shape43.mirror = true;
      setRotation(Shape43, -1.000001F, 0F, 0F);
      
      Shape7 = new ModelRenderer(this, 21, 63);
      Shape7.addBox(0F, -1F, -1.5F, 4, 6, 3);
      Shape7.setRotationPoint(-0.5F, 12.5F, -10F);
      Shape7.setTextureSize(64, 128);
      Shape7.mirror = true;
      setRotation(Shape7, 0.3374844F, 0F, 0F);
      
      Shape8 = new ModelRenderer(this, 21, 52);
      Shape8.addBox(0F, -1F, -0.5F, 4, 8, 3);
      Shape8.setRotationPoint(-0.5F, 12.5F, -16F);
      Shape8.setTextureSize(64, 128);
      Shape8.mirror = true;
      setRotation(Shape8, 1.5272F, 0F, 0F);
      
      Shape3 = new ModelRenderer(this, 0, 20);
      Shape3.addBox(0F, -1F, 0F, 2, 5, 11);
      Shape3.setRotationPoint(3F, 13F, 4F);
      Shape3.setTextureSize(64, 128);
      Shape3.mirror = true;
      setRotation(Shape3, 0F, 0F, 0F);
      
      Shape4 = new ModelRenderer(this, 0, 20);
      Shape4.mirror = true;
      Shape4.addBox(0F, -1F, 0F, 2, 5, 11);
      Shape4.setRotationPoint(-2F, 13F, 4F);
      Shape4.setTextureSize(64, 128);
      setRotation(Shape4, 0F, 0F, 0F);
      
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
		Shape6.render(f5);
		Shape7.render(f5);
		Shape8.render(f5);
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
		Shape34.render(f5);
		Shape35.render(f5);
		Shape36.render(f5);
		Shape37.render(f5);
		Shape38.render(f5);
		Shape40.render(f5);
		Shape41.render(f5);
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