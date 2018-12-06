package Kamen_Rider_Craft_4TH.model;

import org.lwjgl.opengl.GL11;

import Kamen_Rider_Craft_4TH.item.fourze.item_Fourzedriver;
import Kamen_Rider_Craft_4TH.util.Refercence;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;


public class Model_kodama_suika_arms extends ModelBiped
{
  //fields
    ModelRenderer Shape1;
    ModelRenderer Shape2;
    ModelRenderer arml;
    ModelRenderer Shape3;
    ModelRenderer Shape4;
    ModelRenderer legr;
    ModelRenderer legl;
    ModelRenderer armr;
    ModelRenderer Shape5;
    ModelRenderer Shape6;
  
  public Model_kodama_suika_arms()
  {
    textureWidth = 32;
    textureHeight = 32;
    
      Shape1 = new ModelRenderer(this, 18, 0);
      Shape1.addBox(-2F, 0F, 0F, 1, 2, 1);
      Shape1.setRotationPoint(0.5F, 20F, -0.5F);
      Shape1.setTextureSize(32, 32);
      Shape1.mirror = true;
      setRotation(Shape1, 0F, 0F, 0F);
      
      Shape2 = new ModelRenderer(this, 24, 0);
      Shape2.addBox(0F, 0F, 0F, 2, 2, 2);
      Shape2.setRotationPoint(-1F, 20F, 0F);
      Shape2.setTextureSize(32, 32);
      Shape2.mirror = true;
      setRotation(Shape2, 0F, 0F, 0F);
      
      arml = new ModelRenderer(this, 11, 0);
      arml.addBox(-1F, 0F, 0F, 1, 2, 1);
      arml.setRotationPoint(-1F, 20F, 0F);
      arml.setTextureSize(32, 32);
      arml.mirror = true;
      setRotation(arml, -0.2230705F, 0.260246F, 0.260246F);
      
      Shape3 = new ModelRenderer(this, 6, 8);
      Shape3.addBox(0F, 0F, 0F, 2, 2, 1);
      Shape3.setRotationPoint(-1F, 18.7F, 0.1F);
      Shape3.setTextureSize(32, 32);
      Shape3.mirror = true;
      setRotation(Shape3, 0F, 0F, 0F);
      
      Shape4 = new ModelRenderer(this, 18, 4);
      Shape4.addBox(0F, 0F, 0F, 1, 2, 1);
      Shape4.setRotationPoint(0.5F, 20F, -0.5F);
      Shape4.setTextureSize(32, 32);
      Shape4.mirror = true;
      setRotation(Shape4, 0F, 0F, 0F);
      
      legr = new ModelRenderer(this, 6, 4);
      legr.addBox(0F, 0F, 0F, 1, 2, 1);
      legr.setRotationPoint(0F, 22F, 0F);
      legr.setTextureSize(32, 32);
      legr.mirror = true;
      setRotation(legr, 0F, 0F, 0F);
      
      legl = new ModelRenderer(this, 1, 4);
      legl.addBox(-1F, 0F, 0F, 1, 2, 1);
      legl.setRotationPoint(0F, 22F, 0F);
      legl.setTextureSize(32, 32);
      legl.mirror = true;
      setRotation(legl, 0F, 0F, 0F);
      
      armr = new ModelRenderer(this, 0, 0);
      armr.addBox(0F, 0F, 0F, 1, 2, 1);
      armr.setRotationPoint(1F, 20F, 0F);
      armr.setTextureSize(32, 32);
      armr.mirror = true;
      setRotation(armr, -0.2230717F, -0.2602503F, -0.2602503F);
      
      Shape5 = new ModelRenderer(this, 1, 8);
      Shape5.addBox(0F, 0F, 0F, 1, 1, 1);
      Shape5.setRotationPoint(-0.5F, 19.4F, -0.1F);
      Shape5.setTextureSize(32, 32);
      Shape5.mirror = true;
      setRotation(Shape5, 0.1570796F, 0F, 0F);
      
      Shape6 = new ModelRenderer(this, 6, 0);
      Shape6.addBox(0F, 0F, 0F, 1, 1, 1);
      Shape6.setRotationPoint(-0.5F, 19F, 0F);
      Shape6.setTextureSize(32, 32);
      Shape6.mirror = true;
      setRotation(Shape6, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    //super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    Shape1.render(f5);
    Shape2.render(f5);
    arml.render(f5);
    Shape3.render(f5);
    Shape4.render(f5);
    legr.render(f5);
    legl.render(f5);
    armr.render(f5);
    Shape5.render(f5);
    Shape6.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float p_78087_1_, float p_78087_2_, float p_78087_3_, float p_78087_4_, float p_78087_5_, float p_78087_6_, Entity p_78087_7_)
	{
		super.setRotationAngles(p_78087_1_, p_78087_2_, p_78087_3_, p_78087_4_, p_78087_5_, p_78087_6_, p_78087_7_);

		//copyModelAngles(this.bipedLeftArm, this.arml);
		//copyModelAngles(this.bipedLeftLeg, this.legl);
		//copyModelAngles(this.bipedRightArm, this.armr);
		//copyModelAngles(this.bipedRightLeg, this.legr);

	}

}
