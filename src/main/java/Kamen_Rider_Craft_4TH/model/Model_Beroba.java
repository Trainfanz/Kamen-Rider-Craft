package Kamen_Rider_Craft_4TH.model;

import Kamen_Rider_Craft_4TH.ReiwaRiderItems;
import Kamen_Rider_Craft_4TH.item.zero_one.item_zero_onedriver;
import Kamen_Rider_Craft_4TH.util.Refercence;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityArmorStand;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.util.ResourceLocation;

// Made with Blockbench 4.6.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class Model_Beroba extends model_belt_plus {
	
	private final ModelRenderer bipedLeftArmBase;
	private final ModelRenderer armtopl;
	private final ModelRenderer armbotl;
	private final ModelRenderer bipedHeadBase;
	private final ModelRenderer cube7_r1;
	private final ModelRenderer cube6_r1;
	private final ModelRenderer cube1_r1;
	private final ModelRenderer bipedBodyBase;
	private final ModelRenderer bipedBody4_r1;
	private final ModelRenderer bipedRightArmBase;
	private final ModelRenderer armtopr;
	private final ModelRenderer armbotr;
	private final ModelRenderer armbotl2;
	private final ModelRenderer bipedRightLegBase;
	private final ModelRenderer legtopr3;
	private final ModelRenderer legtopr2;
	private final ModelRenderer shape18;
	private final ModelRenderer shape15;
	private final ModelRenderer legtopr1;
	private final ModelRenderer legbotr4;
	private final ModelRenderer legbotr1;
	private final ModelRenderer legbotr5;
	private final ModelRenderer legbotr3;
	private final ModelRenderer legbotr2;
	private final ModelRenderer bipedLeftLegBase;
	private final ModelRenderer legtopl4;
	private final ModelRenderer legbotl1;
	private final ModelRenderer legbotl6;
	private final ModelRenderer legbotl4;
	private final ModelRenderer legbotl5;
	private final ModelRenderer legbotl2;
	private final ModelRenderer legbotl3;
	private final ModelRenderer legtopl2;
	private final ModelRenderer legtopl1;
	private final ModelRenderer legtopl3;

	public Model_Beroba() {
		textureWidth = 128;
		textureHeight = 64;

		bipedLeftArmBase = new ModelRenderer(this);
		bipedLeftArmBase.setRotationPoint(7.0F, 2.0F, 0.0F);
		bipedLeftArmBase.cubeList.add(new ModelBox(bipedLeftArmBase, 27, 30, -1.0F, -2.0F, -2.0F, 4, 4, 4, 0.0F, true));

		armtopl = new ModelRenderer(this);
		armtopl.setRotationPoint(1.1F, 1.3F, -1.5F);
		bipedLeftArmBase.addChild(armtopl);
		setRotationAngle(armtopl, 0.0F, 0.0F, -0.1993F);
		armtopl.cubeList.add(new ModelBox(armtopl, 12, 8, -1.0F, 0.0F, 0.0F, 3, 4, 3, 0.0F, false));

		armbotl = new ModelRenderer(this);
		armbotl.setRotationPoint(1.5F, 4.0F, -1.1F);
		bipedLeftArmBase.addChild(armbotl);
		setRotationAngle(armbotl, -0.4554F, 0.182F, -0.1993F);
		armbotl.cubeList.add(new ModelBox(armbotl, 0, 8, -1.0F, 0.0F, 0.0F, 3, 7, 3, 0.0F, false));
		armbotl.cubeList.add(new ModelBox(armbotl, 0, 19, 0.0F, 0.0F, -0.5F, 3, 6, 4, 0.0F, false));

		bipedHeadBase = new ModelRenderer(this);
		bipedHeadBase.setRotationPoint(0.0F, 0.6F, 0.0F);
		bipedHeadBase.cubeList.add(new ModelBox(bipedHeadBase, 64, 0, -4.0F, -7.4F, -4.0F, 8, 8, 8, 0.0F, false));
		bipedHeadBase.cubeList.add(new ModelBox(bipedHeadBase, 110, 16, 4.0F, -6.0F, -1.0F, 1, 2, 2, 0.0F, false));
		bipedHeadBase.cubeList.add(new ModelBox(bipedHeadBase, 110, 16, -5.0F, -6.0F, -1.0F, 1, 2, 2, 0.0F, false));
		bipedHeadBase.cubeList.add(new ModelBox(bipedHeadBase, 100, 17, -7.0F, -8.0F, -1.0F, 2, 3, 2, 0.0F, false));
		bipedHeadBase.cubeList.add(new ModelBox(bipedHeadBase, 100, 17, 5.0F, -8.0F, -1.0F, 2, 3, 2, 0.0F, false));

		cube7_r1 = new ModelRenderer(this);
		cube7_r1.setRotationPoint(0.0F, -2.0F, 0.0F);
		bipedHeadBase.addChild(cube7_r1);
		setRotationAngle(cube7_r1, 0.0F, 0.0F, 0.1745F);
		cube7_r1.cubeList.add(new ModelBox(cube7_r1, 103, 10, -7.0F, -7.9F, -1.0F, 1, 3, 2, 0.0F, false));

		cube6_r1 = new ModelRenderer(this);
		cube6_r1.setRotationPoint(0.0F, -2.0F, 0.0F);
		bipedHeadBase.addChild(cube6_r1);
		setRotationAngle(cube6_r1, 0.0F, 0.0F, -0.1745F);
		cube6_r1.cubeList.add(new ModelBox(cube6_r1, 103, 10, 6.0F, -7.9F, -1.0F, 1, 3, 2, 0.0F, false));

		cube1_r1 = new ModelRenderer(this);
		cube1_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		bipedHeadBase.addChild(cube1_r1);
		setRotationAngle(cube1_r1, 0.0F, 0.0F, -0.829F);
		cube1_r1.cubeList.add(new ModelBox(cube1_r1, 0, 53, -3.5F, -3.0F, -5.0F, 12, 1, 10, 0.0F, false));

		bipedBodyBase = new ModelRenderer(this);
		bipedBodyBase.setRotationPoint(0.0F, -0.2F, 0.0F);
		bipedBodyBase.cubeList.add(new ModelBox(bipedBodyBase, 32, 0, -6.0F, 0.0F, -2.0F, 12, 6, 4, 0.0F, false));
		bipedBodyBase.cubeList.add(new ModelBox(bipedBodyBase, 85, 47, -3.0F, 0.7F, 1.1F, 6, 11, 4, 0.0F, false));
		bipedBodyBase.cubeList.add(new ModelBox(bipedBodyBase, 40, 10, -4.0F, 9.6F, -1.6F, 8, 2, 3, 0.0F, false));
		bipedBodyBase.cubeList.add(new ModelBox(bipedBodyBase, 30, 10, -1.0F, 11.6F, -1.5F, 2, 3, 3, 0.0F, false));
		bipedBodyBase.cubeList.add(new ModelBox(bipedBodyBase, 52, 16, -4.5F, 6.0F, -1.2F, 9, 4, 3, 0.0F, false));
		bipedBodyBase.cubeList.add(new ModelBox(bipedBodyBase, 116, 19, -1.5F, 11.5F, 2.4F, 3, 4, 2, 0.0F, false));

		bipedBody4_r1 = new ModelRenderer(this);
		bipedBody4_r1.setRotationPoint(0.0F, 24.2F, 0.0F);
		bipedBodyBase.addChild(bipedBody4_r1);
		setRotationAngle(bipedBody4_r1, 0.0F, 0.0F, 0.9163F);
		bipedBody4_r1.cubeList.add(new ModelBox(bipedBody4_r1, 57, 33, -16.5F, -20.8F, -4.7F, 2, 17, 11, 0.0F, false));

		bipedRightArmBase = new ModelRenderer(this);
		bipedRightArmBase.setRotationPoint(-7.0F, 2.0F, 0.0F);
		bipedRightArmBase.cubeList.add(new ModelBox(bipedRightArmBase, 0, 0, -3.0F, -2.0F, -2.0F, 4, 4, 4, 0.0F, false));

		armtopr = new ModelRenderer(this);
		armtopr.setRotationPoint(-2.2F, 1.3F, -1.5F);
		bipedRightArmBase.addChild(armtopr);
		setRotationAngle(armtopr, 0.0F, 0.0F, 0.1993F);
		armtopr.cubeList.add(new ModelBox(armtopr, 12, 8, -1.0F, 0.0F, 0.0F, 3, 4, 3, 0.0F, true));

		armbotr = new ModelRenderer(this);
		armbotr.setRotationPoint(-2.7F, 4.0F, -1.1F);
		bipedRightArmBase.addChild(armbotr);
		setRotationAngle(armbotr, -0.4554F, -0.182F, 0.1993F);
		armbotr.cubeList.add(new ModelBox(armbotr, 110, 0, -1.0F, 0.0F, 0.0F, 3, 7, 3, 0.0F, true));
		armbotr.cubeList.add(new ModelBox(armbotr, 19, 18, -2.0F, 0.0F, -0.5F, 3, 6, 4, 0.0F, true));

		armbotl2 = new ModelRenderer(this);
		armbotl2.setRotationPoint(7.0F, -2.0F, 0.0F);
		armbotr.addChild(armbotl2);
		

		bipedRightLegBase = new ModelRenderer(this);
		bipedRightLegBase.setRotationPoint(-1.9F, 12.0F, 0.0F);
		setRotationAngle(bipedRightLegBase, 0.0F, 0.0F, 0.0436F);
		bipedRightLegBase.cubeList.add(new ModelBox(bipedRightLegBase, 88, 0, -1.0F, 0.0F, -1.0F, 3, 2, 2, 0.0F, false));

		legtopr3 = new ModelRenderer(this);
		legtopr3.setRotationPoint(-2.7F, 1.2F, 0.1F);
		bipedRightLegBase.addChild(legtopr3);
		setRotationAngle(legtopr3, 0.0F, 0.0F, -0.1276F);
		legtopr3.cubeList.add(new ModelBox(legtopr3, 116, 26, 0.0F, 2.4F, -1.6F, 2, 2, 3, 0.0F, false));

		legtopr2 = new ModelRenderer(this);
		legtopr2.setRotationPoint(0.0F, 0.1F, 0.0F);
		bipedRightLegBase.addChild(legtopr2);
		setRotationAngle(legtopr2, 0.0F, 0.0F, 0.0487F);
		legtopr2.cubeList.add(new ModelBox(legtopr2, 105, 37, -1.6F, 1.3F, -2.0F, 3, 4, 4, 0.0F, true));

		shape18 = new ModelRenderer(this);
		shape18.setRotationPoint(0.0F, 2.6F, 0.1F);
		bipedRightLegBase.addChild(shape18);
		setRotationAngle(shape18, 0.6875F, 0.1955F, 0.0297F);
		shape18.cubeList.add(new ModelBox(shape18, 12, 0, -0.9F, 0.0F, -3.9F, 2, 2, 2, 0.0F, false));

		shape15 = new ModelRenderer(this);
		shape15.setRotationPoint(-2.0F, -0.1F, 0.0F);
		bipedRightLegBase.addChild(shape15);
		setRotationAngle(shape15, 0.0F, 0.0F, 0.1349F);
		shape15.cubeList.add(new ModelBox(shape15, 82, 23, 0.1F, -0.3F, -1.5F, 2, 4, 3, 0.0F, false));

		legtopr1 = new ModelRenderer(this);
		legtopr1.setRotationPoint(0.0F, 5.9F, 0.0F);
		bipedRightLegBase.addChild(legtopr1);
		setRotationAngle(legtopr1, 0.0F, 0.1285F, -0.0077F);
		legtopr1.cubeList.add(new ModelBox(legtopr1, 9, 39, -1.7F, -0.9F, -2.5F, 3, 4, 5, 0.0F, false));

		legbotr4 = new ModelRenderer(this);
		legbotr4.setRotationPoint(-0.9F, -8.8F, -2.9F);
		legtopr1.addChild(legbotr4);
		setRotationAngle(legbotr4, -0.5918F, 0.0F, 0.0F);
		
		legbotr1 = new ModelRenderer(this);
		legbotr1.setRotationPoint(0.0F, 24.2F, 0.0F);
		bipedBodyBase.addChild(legbotr1);
		setRotationAngle(legbotr1, 0.0F, 0.0F, 0.1745F);
		legbotr1.cubeList.add(new ModelBox(legbotr1, 50, 32, -5.3F, -18.1F, -2.1F, 2, 4, 4, 0.0F, true));

		legbotr5 = new ModelRenderer(this);
		legbotr5.setRotationPoint(-0.9F, -9.5F, -2.8F);
		legtopr1.addChild(legbotr5);
		setRotationAngle(legbotr5, 0.0F, 0.0F, -0.0436F);
		legbotr5.cubeList.add(new ModelBox(legbotr5, 59, 23, -2.0F, 11.6F, 0.0F, 4, 4, 5, 0.0F, false));

		legbotr3 = new ModelRenderer(this);
		legbotr3.setRotationPoint(2.1F, -8.8F, -3.0F);
		legtopr1.addChild(legbotr3);
		setRotationAngle(legbotr3, -0.5918F, 0.0F, -0.0873F);
		

		legbotr2 = new ModelRenderer(this);
		legbotr2.setRotationPoint(0.5F, -8.8F, -3.0F);
		legtopr1.addChild(legbotr2);
		setRotationAngle(legbotr2, -0.5918F, 0.0F, -0.0436F);
		

		bipedLeftLegBase = new ModelRenderer(this);
		bipedLeftLegBase.setRotationPoint(1.9F, 12.0F, 0.0F);
		setRotationAngle(bipedLeftLegBase, 0.0F, 0.0F, -0.0436F);
		bipedLeftLegBase.cubeList.add(new ModelBox(bipedLeftLegBase, 88, 0, -2.0F, 0.0F, -1.0F, 3, 2, 2, 0.0F, false));

		legtopl4 = new ModelRenderer(this);
		legtopl4.setRotationPoint(0.0F, 2.6F, 0.1F);
		bipedLeftLegBase.addChild(legtopl4);
		setRotationAngle(legtopl4, 0.6875F, -0.1955F, 0.0297F);
		legtopl4.cubeList.add(new ModelBox(legtopl4, 13, 16, -0.9F, 0.0F, -3.9F, 2, 2, 2, 0.0F, false));

		legbotl1 = new ModelRenderer(this);
		legbotl1.setRotationPoint(0.0F, 5.9F, 0.0F);
		bipedLeftLegBase.addChild(legbotl1);
		setRotationAngle(legbotl1, 0.0F, -0.1285F, 0.0077F);
		legbotl1.cubeList.add(new ModelBox(legbotl1, 9, 29, -1.4F, -0.9F, -2.5F, 3, 4, 5, 0.0F, true));

	
		legbotl6 = new ModelRenderer(this);
		legbotl6.setRotationPoint(0.0F, 24.2F, 0.0F);
		bipedBodyBase.addChild(legbotl6);
		setRotationAngle(legbotl6, 0.0F, 0.0F, -0.1745F);
		legbotl6.cubeList.add(new ModelBox(legbotl6, 41, 26, 3.2F, -18.1F, -2.1F, 2, 4, 4, 0.0F, false));

		
		legbotl4 = new ModelRenderer(this);
		legbotl4.setRotationPoint(-0.1F, -8.8F, -2.9F);
		legbotl1.addChild(legbotl4);
		setRotationAngle(legbotl4, -0.5918F, 0.0F, 0.0F);
		

		legbotl5 = new ModelRenderer(this);
		legbotl5.setRotationPoint(-3.1F, -9.5F, -2.8F);
		legbotl1.addChild(legbotl5);
		setRotationAngle(legbotl5, 0.0F, 0.0F, 0.0436F);
		legbotl5.cubeList.add(new ModelBox(legbotl5, 86, 37, 2.0F, 11.6F, 0.0F, 4, 4, 5, 0.0F, true));

		legbotl2 = new ModelRenderer(this);
		legbotl2.setRotationPoint(0.3F, 3.2F, -3.0F);
		legbotl1.addChild(legbotl2);
		setRotationAngle(legbotl2, -0.5918F, 0.0F, 0.0436F);
		

		legbotl3 = new ModelRenderer(this);
		legbotl3.setRotationPoint(-1.2F, 3.2F, -3.0F);
		legbotl1.addChild(legbotl3);
		setRotationAngle(legbotl3, -0.5918F, 0.0F, 0.0873F);
		

		legtopl2 = new ModelRenderer(this);
		legtopl2.setRotationPoint(0.0F, 0.1F, 0.0F);
		bipedLeftLegBase.addChild(legtopl2);
		setRotationAngle(legtopl2, 0.0F, 0.0F, -0.0487F);
		legtopl2.cubeList.add(new ModelBox(legtopl2, 100, 28, -1.3F, 1.3F, -2.0F, 3, 4, 4, 0.0F, false));

		legtopl1 = new ModelRenderer(this);
		legtopl1.setRotationPoint(0.0F, 0.0F, 0.0F);
		bipedLeftLegBase.addChild(legtopl1);
		setRotationAngle(legtopl1, 0.0F, 0.0F, -0.1349F);
		legtopl1.cubeList.add(new ModelBox(legtopl1, 90, 28, 0.0F, 0.0F, -1.5F, 2, 4, 3, 0.0F, true));

		legtopl3 = new ModelRenderer(this);
		legtopl3.setRotationPoint(0.8F, 1.0F, 0.1F);
		bipedLeftLegBase.addChild(legtopl3);
		setRotationAngle(legtopl3, 0.0F, 0.0F, 0.1276F);
		legtopl3.cubeList.add(new ModelBox(legtopl3, 110, 10, 0.0F, 2.4F, -1.6F, 2, 2, 3, 0.0F, true));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);

		if (entity instanceof EntityLivingBase){
			EntityLivingBase player = ((EntityLivingBase)entity);
			if (player.getItemStackFromSlot(EntityEquipmentSlot.HEAD)!= null){
				if (player.getItemStackFromSlot(EntityEquipmentSlot.CHEST)!= null){
					if (player.getItemStackFromSlot(EntityEquipmentSlot.LEGS)!= null){
						if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET)!= null){
							if (player.getItemStackFromSlot(EntityEquipmentSlot.LEGS).getItem() == ReiwaRiderItems.geatslegs){
								if (player.getItemStackFromSlot(EntityEquipmentSlot.CHEST).getItem() == ReiwaRiderItems.geatstroso){
									if (player.getItemStackFromSlot(EntityEquipmentSlot.HEAD).getItem() == ReiwaRiderItems.geatshead){
										if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == ReiwaRiderItems.raise_riser_belt_beroba){	
												double height=1;
														
											
												
												
		Minecraft.getMinecraft().renderEngine.bindTexture(new ResourceLocation(Refercence.MODID+":textures/armor/beroba.png"));

												GlStateManager.pushMatrix();
												GlStateManager.translate(0, 0, 0);
													GlStateManager.scale(0.7D*height, 0.7D*height, 0.7D*height);
											
												this.bipedHeadBase.render(f5);
												GlStateManager.popMatrix();
												GlStateManager.pushMatrix();
												GlStateManager.translate(0, 0, 0);
												GlStateManager.scale(height,height,height);
												this.bipedLeftArmBase.render(f5);
												this.bipedRightLegBase.render(f5);
												this.bipedBodyBase.render(f5);
												this.bipedRightArmBase.render(f5);
												this.bipedLeftLegBase.render(f5);
												GlStateManager.popMatrix();
											}
										}
									}
								
							}
						}
					}
				}
			}
			GlStateManager.pushMatrix();
			super.render(entity, f, f1, f2, f3, f4, f5);


			GlStateManager.popMatrix();


		}

	}
	public void setRotationAngles(float p_78087_1_, float p_78087_2_, float p_78087_3_, float p_78087_4_, float p_78087_5_, float p_78087_6_, Entity entityIn)
	{
		if (entityIn instanceof EntityArmorStand)
	    {
	        EntityArmorStand entityarmorstand = (EntityArmorStand)entityIn;
	        this.bipedHeadBase.rotateAngleX = 0.017453292F * entityarmorstand.getHeadRotation().getX();
	        this.bipedHeadBase.rotateAngleY = 0.017453292F * entityarmorstand.getHeadRotation().getY();
	        this.bipedHeadBase.rotateAngleZ = 0.017453292F * entityarmorstand.getHeadRotation().getZ();
	        this.bipedHeadBase.setRotationPoint(0.0F, 1.0F, 0.0F);
	        this.bipedBodyBase.rotateAngleX = 0.017453292F * entityarmorstand.getBodyRotation().getX();
	        this.bipedBodyBase.rotateAngleY = 0.017453292F * entityarmorstand.getBodyRotation().getY();
	        this.bipedBodyBase.rotateAngleZ = 0.017453292F * entityarmorstand.getBodyRotation().getZ();
	        this.bipedLeftArmBase.rotateAngleX = 0.017453292F * entityarmorstand.getLeftArmRotation().getX();
	        this.bipedLeftArmBase.rotateAngleY = 0.017453292F * entityarmorstand.getLeftArmRotation().getY();
	        this.bipedLeftArmBase.rotateAngleZ = 0.017453292F * entityarmorstand.getLeftArmRotation().getZ();
	        this.bipedRightArmBase.rotateAngleX = 0.017453292F * entityarmorstand.getRightArmRotation().getX();
	        this.bipedRightArmBase.rotateAngleY = 0.017453292F * entityarmorstand.getRightArmRotation().getY();
	        this.bipedRightArmBase.rotateAngleZ = 0.017453292F * entityarmorstand.getRightArmRotation().getZ();
	        this.bipedLeftLegBase.rotateAngleX = 0.017453292F * entityarmorstand.getLeftLegRotation().getX();
	        this.bipedLeftLegBase.rotateAngleY = 0.017453292F * entityarmorstand.getLeftLegRotation().getY();
	        this.bipedLeftLegBase.rotateAngleZ = 0.017453292F * entityarmorstand.getLeftLegRotation().getZ();
	        this.bipedLeftLeg.setRotationPoint(1.9F, 11.0F, 0.0F);
	        this.bipedRightLegBase.rotateAngleX = 0.017453292F * entityarmorstand.getRightLegRotation().getX();
	        this.bipedRightLegBase.rotateAngleY = 0.017453292F * entityarmorstand.getRightLegRotation().getY();
	        this.bipedRightLegBase.rotateAngleZ = 0.017453292F * entityarmorstand.getRightLegRotation().getZ();
	        this.bipedRightLegBase.setRotationPoint(-1.9F, 11.0F, 0.0F);
	        copyModelAngles(this.bipedHead, this.bipedHeadwear);
	    }else{
	    	super.setRotationAngles(p_78087_1_, p_78087_2_, p_78087_3_, p_78087_4_, p_78087_5_, p_78087_6_, entityIn);
	    }
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
		
		this.bipedLeftLegBase.rotateAngleX=this.bipedLeftLeg.rotateAngleX;
		this.bipedLeftLegBase.rotateAngleY=this.bipedLeftLeg.rotateAngleY;
		this.bipedLeftLegBase.rotateAngleZ=this.bipedLeftLeg.rotateAngleZ;
		
		this.bipedRightLegBase.rotateAngleX=this.bipedRightLeg.rotateAngleX;
		this.bipedRightLegBase.rotateAngleY=this.bipedRightLeg.rotateAngleY;
		this.bipedRightLegBase.rotateAngleZ=this.bipedRightLeg.rotateAngleZ;
		
		
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}