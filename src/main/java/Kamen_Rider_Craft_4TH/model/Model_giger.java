package Kamen_Rider_Craft_4TH.model;

import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityArmorStand;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.util.ResourceLocation;
import net.minecraft.client.renderer.GlStateManager;
import org.lwjgl.opengl.GL11;

import Kamen_Rider_Craft_4TH.RiderItems;
import Kamen_Rider_Craft_4TH.item.Ex_Aid.item_ex_aiddriver;
import Kamen_Rider_Craft_4TH.item.zero_one.item_zero_onedriver;
import Kamen_Rider_Craft_4TH.potion.PotionCore;
import Kamen_Rider_Craft_4TH.util.Refercence;

/**
 * breaking_mammoth - kelco
 * Created using Tabula 7.0.0
 */
public class Model_giger extends ModelBiped {


	public ModelRenderer bipedLeftArmBase;
	public ModelRenderer bipedHeadBase;
	public ModelRenderer bipedBodyBase;
	public ModelRenderer bipedRightArmBase;
	
	public ModelRenderer armtopr;
	public ModelRenderer armbotr;
	public ModelRenderer armbotl2;
	public ModelRenderer armbotl;
	public ModelRenderer armtopl;
	public ModelRenderer armbotr2;
	public ModelRenderer bodylegbase;
	public ModelRenderer bipedBody3;
	public ModelRenderer bipedBody4;
	public ModelRenderer bipedBody9;
	public ModelRenderer bipedBody5;
	public ModelRenderer bipedBody6;
	public ModelRenderer bipedBody7;
	public ModelRenderer bipedBody8;
	public ModelRenderer bipedBody2;
	public ModelRenderer bipedBody11;
	public ModelRenderer bipedBody10;
	public ModelRenderer legtopr1;
	public ModelRenderer legtopr2;
	public ModelRenderer legtopr3;
	public ModelRenderer shape15;
	public ModelRenderer shape18;
	public ModelRenderer legbotr2;
	public ModelRenderer legbotr3;
	public ModelRenderer legbotr4;
	public ModelRenderer legbotr5;
	public ModelRenderer legbotr1;
	public ModelRenderer legtopl1;
	public ModelRenderer legtopl2;
	public ModelRenderer legtopl3;
	public ModelRenderer legtopl4;
	public ModelRenderer legbotl1;
	public ModelRenderer legbotl2;
	public ModelRenderer legbotl3;
	public ModelRenderer legbotl4;
	public ModelRenderer legbotl5;
	public ModelRenderer legbotl6;

	public Model_giger() {
		this.textureWidth = 128;
		this.textureHeight = 64;
		this.bipedLeftArmBase = new ModelRenderer(this, 0, 0);
		this.bipedLeftArmBase.mirror = true;
		this.bipedLeftArmBase.setRotationPoint(7.0F, 2.0F, 0.0F);
		this.bipedLeftArmBase.addBox(-1.0F, -2.0F, -2.0F, 4, 4, 4, 0.0F);
		this.legbotr4 = new ModelRenderer(this, 88, 16);
		this.legbotr4.setRotationPoint(-2.8F, 3.2F, -2.9F);
		this.legbotr4.addBox(0.0F, 0.0F, 0.0F, 1, 3, 3, 0.0F);
		this.setRotateAngle(legbotr4, -0.5918411493512771F, 0.0F, 0.0F);
		this.bipedHeadBase = new ModelRenderer(this, 64, 0);
		this.bipedHeadBase.setRotationPoint(0.0F, 0.6F, 0.0F);
		this.bipedHeadBase.addBox(-4.0F, -7.4F, -4.0F, 8, 8, 8, 0.0F);
		this.bipedBody11 = new ModelRenderer(this, 85, 47);
		this.bipedBody11.setRotationPoint(-3.0F, 0.7F, 0.8F);
		this.bipedBody11.addBox(0.0F, 0.0F, 0.3F, 6, 11, 4, 0.0F);
		this.setRotateAngle(bipedBody11, -0.091106186954104F, 0.0F, 0.0F);
		this.legbotl6 = new ModelRenderer(this, 50, 32);
		this.legbotl6.setRotationPoint(0.2F, 0.0F, -2.1F);
		this.legbotl6.addBox(0.0F, 0.0F, 0.0F, 2, 4, 4, 0.0F);
		this.setRotateAngle(legbotl6, 0.0F, 0.0F, -0.091106186954104F);
		this.legbotl4 = new ModelRenderer(this, 88, 16);
		this.legbotl4.setRotationPoint(1.8F, 3.2F, -2.9F);
		this.legbotl4.addBox(0.0F, 0.0F, 0.0F, 1, 3, 3, 0.0F);
		this.setRotateAngle(legbotl4, -0.5918411493512771F, 0.0F, 0.0F);
		this.legbotr1 = new ModelRenderer(this, 50, 32);
		this.legbotr1.mirror = true;
		this.legbotr1.setRotationPoint(-2.3F, 0.0F, -2.1F);
		this.legbotr1.addBox(0.0F, 0.0F, 0.0F, 2, 4, 4, 0.0F);
		this.setRotateAngle(legbotr1, 0.0F, 0.0F, 0.091106186954104F);
		this.armtopr = new ModelRenderer(this, 12, 8);
		this.armtopr.mirror = true;
		this.armtopr.setRotationPoint(-2.2F, 1.3F, -1.5F);
		this.armtopr.addBox(-1.0F, 0.0F, 0.0F, 3, 4, 3, 0.0F);
		this.setRotateAngle(armtopr, 0.0F, 0.0F, 0.1993166005777524F);
		this.bipedBody3 = new ModelRenderer(this, 40, 10);
		this.bipedBody3.setRotationPoint(-3.0F, 9.6F, -1.6F);
		this.bipedBody3.addBox(-1.0F, 0.0F, 0.0F, 8, 2, 3, 0.0F);
		this.bodylegbase = new ModelRenderer(this, 30, 10);
		this.bodylegbase.setRotationPoint(0.0F, 11.6F, -1.5F);
		this.bodylegbase.addBox(-1.0F, 0.0F, 0.0F, 2, 3, 3, 0.0F);
		this.legbotr5 = new ModelRenderer(this, 59, 23);
		this.legbotr5.setRotationPoint(-2.8F, 2.5F, -2.8F);
		this.legbotr5.addBox(0.0F, 0.0F, 0.0F, 4, 4, 5, 0.0F);
		this.setRotateAngle(legbotr5, 0.0F, 0.0F, -0.04363323129985824F);
		this.legtopl4 = new ModelRenderer(this, 12, 0);
		this.legtopl4.setRotationPoint(0.0F, 2.6F, 0.1F);
		this.legtopl4.addBox(-0.9F, 0.0F, -3.9F, 2, 2, 2, 0.0F);
		this.setRotateAngle(legtopl4, 0.6874851923605664F, -0.1954768762233649F, 0.029670597283903602F);
		this.bipedBody7 = new ModelRenderer(this, 76, 16);
		this.bipedBody7.setRotationPoint(3.0F, 2.5F, -8.7F);
		this.bipedBody7.addBox(0.0F, 0.0F, 0.0F, 1, 8, 2, 0.0F);
		this.setRotateAngle(bipedBody7, 0.4553564018453205F, 0.0F, 0.0F);
		this.legtopr3 = new ModelRenderer(this, 110, 10);
		this.legtopr3.setRotationPoint(-2.7F, 1.2F, 0.1F);
		this.legtopr3.addBox(0.0F, 2.4F, -1.6F, 2, 2, 3, 0.0F);
		this.setRotateAngle(legtopr3, 0.0F, 0.0F, -0.1275835683207855F);
		this.bipedRightLeg = new ModelRenderer(this, 88, 0);
		this.bipedRightLeg.setRotationPoint(-1.9F, 12.0F, 0.0F);
		this.bipedRightLeg.addBox(-1.0F, 0.0F, -1.0F, 3, 2, 2, 0.0F);
		this.setRotateAngle(bipedRightLeg, 0.0F, 0.0F, 0.04363323129985824F);
	
		this.armbotl2 = new ModelRenderer(this, 96, 7);
		this.armbotl2.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.armbotl2.addBox(-3.3F, 0.0F, -2.4F, 3, 13, 8, 0.0F);
		this.legbotl5 = new ModelRenderer(this, 59, 23);
		this.legbotl5.mirror = true;
		this.legbotl5.setRotationPoint(-1.2F, 2.5F, -2.8F);
		this.legbotl5.addBox(0.0F, 0.0F, 0.0F, 4, 4, 5, 0.0F);
		this.setRotateAngle(legbotl5, 0.0F, 0.0F, 0.04363323129985824F);
		this.armbotl = new ModelRenderer(this, 0, 8);
		this.armbotl.setRotationPoint(1.5F, 4.0F, -1.1F);
		this.armbotl.addBox(-1.0F, 0.0F, 0.0F, 3, 7, 3, 0.0F);
		this.setRotateAngle(armbotl, -0.4553564018453205F, 0.18203784098300857F, -0.1993166005777524F);
		this.bipedBody2 = new ModelRenderer(this, 52, 16);
		this.bipedBody2.setRotationPoint(-0.5F, 6.0F, -1.5F);
		this.bipedBody2.addBox(-4.0F, 0.0F, 0.3F, 9, 4, 3, 0.0F);
		this.legtopr2 = new ModelRenderer(this, 100, 28);
		this.legtopr2.mirror = true;
		this.legtopr2.setRotationPoint(0.0F, 0.1F, 0.0F);
		this.legtopr2.addBox(-1.6F, 1.3F, -2.0F, 3, 4, 4, 0.0F);
		this.setRotateAngle(legtopr2, 0.0F, 0.0F, 0.04869468613064179F);
		this.shape18 = new ModelRenderer(this, 12, 0);
		this.shape18.setRotationPoint(0.0F, 2.6F, 0.1F);
		this.shape18.addBox(-0.9F, 0.0F, -3.9F, 2, 2, 2, 0.0F);
		this.setRotateAngle(shape18, 0.6874851923605664F, 0.1954768762233649F, 0.029670597283903602F);
		this.legbotl1 = new ModelRenderer(this, 9, 29);
		this.legbotl1.mirror = true;
		this.legbotl1.setRotationPoint(0.0F, 5.9F, 0.0F);
		this.legbotl1.addBox(-1.4F, -0.9F, -2.5F, 3, 4, 5, 0.0F);
		this.setRotateAngle(legbotl1, 0.0F, -0.12845623294678266F, 0.00767944870877505F);
		this.shape15 = new ModelRenderer(this, 90, 28);
		this.shape15.setRotationPoint(-2.0F, -0.1F, 0.0F);
		this.shape15.addBox(0.1F, -0.3F, -1.5F, 2, 4, 3, 0.0F);
		this.setRotateAngle(shape15, 0.0F, 0.0F, 0.13491395117916166F);
		this.legbotl2 = new ModelRenderer(this, 88, 16);
		this.legbotl2.setRotationPoint(0.3F, 3.2F, -3.0F);
		this.legbotl2.addBox(0.0F, 0.0F, 0.0F, 1, 3, 3, 0.0F);
		this.setRotateAngle(legbotl2, -0.5918411493512771F, 0.0F, 0.04363323129985824F);
		this.legtopl2 = new ModelRenderer(this, 100, 28);
		this.legtopl2.setRotationPoint(0.0F, 0.1F, 0.0F);
		this.legtopl2.addBox(-1.3F, 1.3F, -2.0F, 3, 4, 4, 0.0F);
		this.setRotateAngle(legtopl2, 0.0F, 0.0F, -0.04869468613064179F);
		this.bipedBody6 = new ModelRenderer(this, 96, 7);
		this.bipedBody6.setRotationPoint(-2.4F, 3.0F, -2.7F);
		this.bipedBody6.addBox(0.0F, 0.0F, 0.0F, 1, 6, 2, 0.0F);
		this.setRotateAngle(bipedBody6, -0.6373942428283291F, 0.0F, 0.31869712141416456F);
		this.legtopl1 = new ModelRenderer(this, 90, 28);
		this.legtopl1.mirror = true;
		this.legtopl1.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.legtopl1.addBox(0.0F, 0.0F, -1.5F, 2, 4, 3, 0.0F);
		this.setRotateAngle(legtopl1, 0.0F, 0.0F, -0.13491395117916166F);
		this.legtopl3 = new ModelRenderer(this, 110, 10);
		this.legtopl3.mirror = true;
		this.legtopl3.setRotationPoint(0.8F, 1.0F, 0.1F);
		this.legtopl3.addBox(0.0F, 2.4F, -1.6F, 2, 2, 3, 0.0F);
		this.setRotateAngle(legtopl3, 0.0F, 0.0F, 0.1275835683207855F);
		this.bipedBodyBase = new ModelRenderer(this, 32, 0);
		this.bipedBodyBase.setRotationPoint(0.0F, -0.2F, 0.0F);
		this.bipedBodyBase.addBox(-6.0F, 0.0F, -2.0F, 12, 6, 4, 0.0F);
		this.armbotr2 = new ModelRenderer(this, 16, 8);
		this.armbotr2.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.armbotr2.addBox(1.3F, 0.0F, -2.4F, 3, 13, 8, 0.0F);
		this.bipedBody10 = new ModelRenderer(this, 109, 47);
		this.bipedBody10.setRotationPoint(-1.5F, 11.5F, 2.1F);
		this.bipedBody10.addBox(0.0F, 0.0F, 0.3F, 3, 4, 2, 0.0F);
		this.setRotateAngle(bipedBody10, -0.091106186954104F, 0.0F, 0.0F);
		this.legbotr3 = new ModelRenderer(this, 88, 16);
		this.legbotr3.setRotationPoint(0.2F, 3.2F, -3.0F);
		this.legbotr3.addBox(0.0F, 0.0F, 0.0F, 1, 3, 3, 0.0F);
		this.setRotateAngle(legbotr3, -0.5918411493512771F, 0.0F, -0.08726646259971647F);
		this.bipedBody9 = new ModelRenderer(this, 54, 43);
		this.bipedBody9.setRotationPoint(0.0F, -5.3F, 0.8F);
		this.bipedBody9.addBox(0.0F, 0.0F, -0.5F, 8, 8, 6, 0.0F);
		this.setRotateAngle(bipedBody9, 0.0F, 0.0F, 0.7853981633974483F);
		this.bipedBody5 = new ModelRenderer(this, 96, 7);
		this.bipedBody5.setRotationPoint(1.4F, 3.0F, -2.7F);
		this.bipedBody5.addBox(0.0F, 0.0F, 0.0F, 1, 6, 2, 0.0F);
		this.setRotateAngle(bipedBody5, -0.6373942428283291F, 0.0F, -0.31869712141416456F);
		this.legbotr2 = new ModelRenderer(this, 88, 16);
		this.legbotr2.setRotationPoint(-1.4F, 3.2F, -3.0F);
		this.legbotr2.addBox(0.0F, 0.0F, 0.0F, 1, 3, 3, 0.0F);
		this.setRotateAngle(legbotr2, -0.5918411493512771F, 0.0F, -0.04363323129985824F);
		this.legbotl3 = new ModelRenderer(this, 88, 16);
		this.legbotl3.setRotationPoint(-1.2F, 3.2F, -3.0F);
		this.legbotl3.addBox(0.0F, 0.0F, 0.0F, 1, 3, 3, 0.0F);
		this.setRotateAngle(legbotl3, -0.5918411493512771F, 0.0F, 0.08726646259971647F);
		this.bipedRightArmBase = new ModelRenderer(this, 0, 0);
		this.bipedRightArmBase.setRotationPoint(-7.0F, 2.0F, 0.0F);
		this.bipedRightArmBase.addBox(-3.0F, -2.0F, -2.0F, 4, 4, 4, 0.0F);
		this.armbotr = new ModelRenderer(this, 110, 0);
		this.armbotr.mirror = true;
		this.armbotr.setRotationPoint(-2.7F, 4.0F, -1.1F);
		this.armbotr.addBox(-1.0F, 0.0F, 0.0F, 3, 7, 3, 0.0F);
		this.setRotateAngle(armbotr, -0.4553564018453205F, -0.18203784098300857F, 0.1993166005777524F);
		this.legtopr1 = new ModelRenderer(this, 9, 29);
		this.legtopr1.setRotationPoint(0.0F, 5.9F, 0.0F);
		this.legtopr1.addBox(-1.7F, -0.9F, -2.5F, 3, 4, 5, 0.0F);
		this.setRotateAngle(legtopr1, 0.0F, 0.12845623294678266F, -0.00767944870877505F);
		this.bipedBody8 = new ModelRenderer(this, 76, 16);
		this.bipedBody8.setRotationPoint(-4.2F, 2.5F, -8.7F);
		this.bipedBody8.addBox(0.0F, 0.0F, 0.0F, 1, 8, 2, 0.0F);
		this.setRotateAngle(bipedBody8, 0.4553564018453205F, 0.0F, 0.0F);
		this.bipedBody4 = new ModelRenderer(this, 38, 15);
		this.bipedBody4.setRotationPoint(0.0F, 2.4F, -3.7F);
		this.bipedBody4.addBox(-1.5F, 0.0F, 0.0F, 3, 7, 4, 0.0F);
		this.setRotateAngle(bipedBody4, 0.12897983172238095F, 0.0F, 0.0F);
		this.bipedLeftLeg = new ModelRenderer(this, 88, 0);
		this.bipedLeftLeg.setRotationPoint(1.9F, 12.0F, 0.0F);
		this.bipedLeftLeg.addBox(-2.0F, 0.0F, -1.0F, 3, 2, 2, 0.0F);
		this.setRotateAngle(bipedLeftLeg, 0.0F, 0.0F, -0.04363323129985824F);


		this.legtopr1.addChild(this.legbotr4);
		this.bipedBodyBase.addChild(this.bipedBody11);
		this.legbotl1.addChild(this.legbotl6);
		this.legbotl1.addChild(this.legbotl4);
		this.legtopr1.addChild(this.legbotr1);
		this.bipedRightArmBase.addChild(this.armtopr);
		this.bipedBodyBase.addChild(this.bipedBody3);
		this.bipedBodyBase.addChild(this.bodylegbase);
		this.legtopr1.addChild(this.legbotr5);
		this.bipedLeftLeg.addChild(this.legtopl4);
		this.bipedBodyBase.addChild(this.bipedBody7);
		this.bipedRightLeg.addChild(this.legtopr3);
		this.bipedLeftArmBase.addChild(this.armtopl);
		this.armbotr.addChild(this.armbotl2);
		this.legbotl1.addChild(this.legbotl5);
		this.bipedLeftArmBase.addChild(this.armbotl);
		this.bipedBodyBase.addChild(this.bipedBody2);
		this.bipedRightLeg.addChild(this.legtopr2);
		this.bipedRightLeg.addChild(this.shape18);
		this.bipedLeftLeg.addChild(this.legbotl1);
		this.bipedRightLeg.addChild(this.shape15);
		this.legbotl1.addChild(this.legbotl2);
		this.bipedLeftLeg.addChild(this.legtopl2);
		this.bipedBodyBase.addChild(this.bipedBody6);
		this.bipedLeftLeg.addChild(this.legtopl1);
		this.bipedLeftLeg.addChild(this.legtopl3);
		this.armbotl.addChild(this.armbotr2);
		this.bipedBodyBase.addChild(this.bipedBody10);
		this.legtopr1.addChild(this.legbotr3);
		this.bipedBodyBase.addChild(this.bipedBody9);
		this.bipedBodyBase.addChild(this.bipedBody5);
		this.legtopr1.addChild(this.legbotr2);
		this.legbotl1.addChild(this.legbotl3);
		this.bipedRightArmBase.addChild(this.armbotr);
		this.bipedRightLeg.addChild(this.legtopr1);
		this.bipedBodyBase.addChild(this.bipedBody8);
		this.bipedBodyBase.addChild(this.bipedBody4);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
				
												double height=2.5;

												GlStateManager.pushMatrix();
												GlStateManager.translate(0, -height+0.25, 0);
													GlStateManager.scale(0.7D*height, 0.7D*height, 0.7D*height);
											
												this.bipedHeadBase.render(f5);
												GlStateManager.popMatrix();
												GlStateManager.pushMatrix();
												GlStateManager.translate(0, -height+0.25, 0);
												GlStateManager.scale(height,height,height);
												this.bipedLeftArmBase.render(f5);
												this.bipedRightLeg.render(f5);
												this.bipedBodyBase.render(f5);
												this.bipedRightArmBase.render(f5);
												this.bipedLeftLeg.render(f5);
												GlStateManager.popMatrix();

	}
	
	public void setRotationAngles(float p_78087_1_, float p_78087_2_, float p_78087_3_, float p_78087_4_, float p_78087_5_, float p_78087_6_, Entity entityIn)
	{
		
	    	super.setRotationAngles(p_78087_1_, p_78087_2_, p_78087_3_, p_78087_4_, p_78087_5_, p_78087_6_, entityIn);
	    
		this.bipedLeftArmBase.rotateAngleX=this.bipedLeftArm.rotateAngleX;
		this.bipedLeftArmBase.rotateAngleY=this.bipedLeftArm.rotateAngleY;
		this.bipedLeftArmBase.rotateAngleZ=this.bipedLeftArm.rotateAngleZ;
		
		this.bipedHeadBase.rotateAngleX=this.bipedHead.rotateAngleX;
		this.bipedHeadBase.rotateAngleY=this.bipedHead.rotateAngleY;
		this.bipedHeadBase.rotateAngleZ=this.bipedHead.rotateAngleZ;
		
		this.bipedBodyBase.rotateAngleX=this.bipedBody.rotateAngleX;
		this.bipedBodyBase.rotateAngleY=this.bipedBody.rotateAngleY;
		this.bipedBodyBase.rotateAngleZ=this.bipedBody.rotateAngleZ;

		this.bipedRightArmBase.rotateAngleX=this.bipedRightArm.rotateAngleX;
		this.bipedRightArmBase.rotateAngleY=this.bipedRightArm.rotateAngleY;
		this.bipedRightArmBase.rotateAngleZ=this.bipedRightArm.rotateAngleZ;
		
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
