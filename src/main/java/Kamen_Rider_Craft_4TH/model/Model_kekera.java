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


public class Model_kekera extends model_belt_plus {
	private final ModelRenderer BodyBase;
	private final ModelRenderer BodyBase_r1;
	private final ModelRenderer BodyBase_r2;
	private final ModelRenderer BodyBase_r3;
	private final ModelRenderer BodyBase_r4;
	private final ModelRenderer BodyBase_r5;
	private final ModelRenderer bipedBody4_r1;
	private final ModelRenderer bone;
	private final ModelRenderer cube_r1;
	private final ModelRenderer bone2;
	private final ModelRenderer cube_r2;
	private final ModelRenderer Head;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;
	private final ModelRenderer cube_r7;
	private final ModelRenderer bipedBody4_r2_r1;
	private final ModelRenderer BackLegL;
	private final ModelRenderer cube_r8;
	private final ModelRenderer cube_r9;
	private final ModelRenderer cube_r10;
	private final ModelRenderer cube_r11;
	private final ModelRenderer cube_r12;
	private final ModelRenderer BackLegR;
	private final ModelRenderer cube_r13;
	private final ModelRenderer cube_r14;
	private final ModelRenderer cube_r15;
	private final ModelRenderer cube_r16;
	private final ModelRenderer cube_r17;
	private final ModelRenderer cube_r18;
	private final ModelRenderer cube_r19;
	private final ModelRenderer FrontLegL;
	private final ModelRenderer cube_r20;
	private final ModelRenderer cube_r21;
	private final ModelRenderer cube_r22;
	private final ModelRenderer cube_r23;
	private final ModelRenderer cube_r24;
	private final ModelRenderer cube_r25;
	private final ModelRenderer cube_r26;
	private final ModelRenderer cube_r27;
	private final ModelRenderer FrontLegR;
	private final ModelRenderer cube_r28;
	private final ModelRenderer cube_r29;
	private final ModelRenderer cube_r30;
	private final ModelRenderer cube_r31;
	private final ModelRenderer cube_r32;
	private final ModelRenderer cube_r33;
	private final ModelRenderer cube_r34;

	public Model_kekera() {
		textureWidth = 128;
		textureHeight = 128;
		
		BodyBase = new ModelRenderer(this);
		BodyBase.setRotationPoint(0.0F, -0.2F, 0.0F);
		BodyBase.cubeList.add(new ModelBox(BodyBase, 0, 14, -4.0F, 13.0F, -7.0F, 8, 5, 13, 0.0F, false));
		BodyBase.cubeList.add(new ModelBox(BodyBase, 48, 68, 3.0F, 10.0F, -8.0F, 2, 2, 4, 0.0F, false));
		BodyBase.cubeList.add(new ModelBox(BodyBase, 0, 67, -5.0F, 10.0F, -8.0F, 2, 2, 4, 0.0F, false));
		BodyBase.cubeList.add(new ModelBox(BodyBase, 0, 0, -7.0F, 12.0F, -7.0F, 14, 1, 13, 0.0F, false));

		BodyBase_r1 = new ModelRenderer(this);
		BodyBase_r1.setRotationPoint(1.0F, 43.2F, 0.0F);
		BodyBase.addChild(BodyBase_r1);
		setRotationAngle(BodyBase_r1, -0.3054F, -1.5708F, 0.0436F);
		BodyBase_r1.cubeList.add(new ModelBox(BodyBase_r1, 50, 62, -4.0F, -26.2F, -13.0F, 2, 2, 4, 0.0F, false));

		BodyBase_r2 = new ModelRenderer(this);
		BodyBase_r2.setRotationPoint(-1.0F, 43.2F, 0.0F);
		BodyBase.addChild(BodyBase_r2);
		setRotationAngle(BodyBase_r2, -0.3054F, 1.5708F, -0.0436F);
		BodyBase_r2.cubeList.add(new ModelBox(BodyBase_r2, 61, 8, 2.0F, -26.2F, -13.0F, 2, 2, 4, 0.0F, false));

		BodyBase_r3 = new ModelRenderer(this);
		BodyBase_r3.setRotationPoint(1.0F, 29.2F, 0.0F);
		BodyBase.addChild(BodyBase_r3);
		setRotationAngle(BodyBase_r3, -0.3054F, 0.8727F, 0.0436F);
		BodyBase_r3.cubeList.add(new ModelBox(BodyBase_r3, 40, 66, 4.0F, -18.2F, -7.0F, 2, 2, 4, 0.0F, false));

		BodyBase_r4 = new ModelRenderer(this);
		BodyBase_r4.setRotationPoint(-1.0F, 29.2F, 0.0F);
		BodyBase.addChild(BodyBase_r4);
		setRotationAngle(BodyBase_r4, -0.3054F, -0.8727F, -0.0436F);
		BodyBase_r4.cubeList.add(new ModelBox(BodyBase_r4, 28, 66, -6.0F, -18.2F, -7.0F, 2, 2, 4, 0.0F, false));

		BodyBase_r5 = new ModelRenderer(this);
		BodyBase_r5.setRotationPoint(-1.0F, 29.2F, 0.0F);
		BodyBase.addChild(BodyBase_r5);
		setRotationAngle(BodyBase_r5, -1.5708F, 0.0F, 0.0F);
		BodyBase_r5.cubeList.add(new ModelBox(BodyBase_r5, 16, 66, -7.0F, 1.8F, -18.0F, 2, 2, 4, 0.0F, false));
		BodyBase_r5.cubeList.add(new ModelBox(BodyBase_r5, 62, 62, 7.0F, 1.8F, -18.0F, 2, 2, 4, 0.0F, false));

		bipedBody4_r1 = new ModelRenderer(this);
		bipedBody4_r1.setRotationPoint(0.0F, 24.2F, 5.0F);
		BodyBase.addChild(bipedBody4_r1);
		setRotationAngle(bipedBody4_r1, 0.0F, -1.0472F, 1.5708F);
		bipedBody4_r1.cubeList.add(new ModelBox(bipedBody4_r1, 46, 3, -10.5F, -8.8F, -0.1641F, 2, 17, 11, 0.0F, false));

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 20.2F, -8.0F);
		BodyBase.addChild(bone);
		setRotationAngle(bone, -0.5236F, 0.0F, 0.0F);
		bone.cubeList.add(new ModelBox(bone, 54, 44, -3.5F, -13.5359F, 8.0F, 7, 3, 5, 0.0F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone.addChild(cube_r1);
		setRotationAngle(cube_r1, -0.0436F, 0.0F, 0.0F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 51, -3.0F, -13.6264F, 8.1492F, 6, 3, 6, 0.0F, false));

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(0.0F, 24.2F, 0.0F);
		BodyBase.addChild(bone2);
		

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.0F, 4.0F, 0.0F);
		bone2.addChild(cube_r2);
		setRotationAngle(cube_r2, -0.1309F, 0.0F, 0.0F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 35, -2.5F, -17.0F, -9.0F, 5, 2, 14, 0.0F, false));

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, 12.0F, -8.0F);
		

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(0.0F, 4.0F, 0.0F);
		Head.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.5236F, 0.0F, 0.0F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 40, -2.0F, -6.0F, -6.0F, 4, 3, 3, 0.0F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(0.0F, 3.0F, 1.0F);
		Head.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.4363F, 0.0F, -0.3054F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 29, 14, -3.5F, -3.0F, -4.0F, 1, 3, 5, 0.0F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(0.0F, 3.0F, 1.0F);
		Head.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.4363F, 0.0F, 0.3054F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 32, 2.5F, -3.0F, -4.0F, 1, 3, 5, 0.0F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(0.0F, 4.0F, 1.0F);
		Head.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.1309F, 0.0F, 0.0F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 56, 55, -3.0F, -1.0F, -5.0F, 6, 2, 5, 0.0F, false));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(0.0F, 4.0F, 0.0F);
		Head.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.2182F, 0.0F, 0.0F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 60, -2.0F, -6.0F, -4.0F, 4, 1, 6, 0.0F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 31, 49, -4.0F, -5.0F, -5.0F, 8, 4, 7, 0.0F, false));

		bipedBody4_r2_r1 = new ModelRenderer(this);
		bipedBody4_r2_r1.setRotationPoint(0.0F, 16.0F, 8.0F);
		Head.addChild(bipedBody4_r2_r1);
		setRotationAngle(bipedBody4_r2_r1, 0.0F, -0.3927F, 1.5708F);
		bipedBody4_r2_r1.cubeList.add(new ModelBox(bipedBody4_r2_r1, 31, 21, -17.5F, -8.8F, -10.7F, 2, 17, 11, 0.0F, false));

		BackLegL = new ModelRenderer(this);
		BackLegL.setRotationPoint(4.0F, 12.0F, 5.0F);
		

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(0.0F, 4.0F, 0.0F);
		BackLegL.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.0F, -1.4835F, 0.0F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 8, 46, -1.0F, 6.0F, -5.0F, 2, 1, 1, 0.0F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 54, 52, -2.0F, 7.0F, -5.0F, 3, 1, 1, 0.0F, false));

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(0.0F, 4.0F, 0.0F);
		BackLegL.addChild(cube_r9);
		setRotationAngle(cube_r9, 0.0F, -2.2253F, 0.0F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 24, 46, -5.0F, 6.0F, -6.0F, 2, 1, 1, 0.0F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 18, 55, -6.0F, 7.0F, -6.0F, 3, 1, 1, 0.0F, false));

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(0.0F, 5.0F, 0.0F);
		BackLegL.addChild(cube_r10);
		setRotationAngle(cube_r10, 0.0F, -1.8326F, 0.0F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 61, 53, -4.0F, 6.0F, -6.0F, 3, 1, 1, 0.0F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 51, -3.0F, 5.0F, -6.0F, 2, 1, 1, 0.0F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 22, 0.0F, 4.0F, -7.0F, 3, 2, 3, 0.0F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 61, 4, -1.0F, 6.0F, -7.0F, 4, 1, 3, 0.0F, false));

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(0.0F, 4.0F, 0.0F);
		BackLegL.addChild(cube_r11);
		setRotationAngle(cube_r11, -1.3963F, -1.0472F, 1.3963F);
		cube_r11.cubeList.add(new ModelBox(cube_r11, 57, 37, -1.0F, 0.0F, -6.0F, 8, 3, 3, 0.0F, false));

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(0.0F, 4.0F, 0.0F);
		BackLegL.addChild(cube_r12);
		setRotationAngle(cube_r12, 0.0F, 0.2182F, 0.3491F);
		cube_r12.cubeList.add(new ModelBox(cube_r12, 34, 60, -1.0F, -2.0F, -2.0F, 7, 3, 3, 0.0F, false));

		BackLegR = new ModelRenderer(this);
		BackLegR.setRotationPoint(-18.0F, 12.0F, 5.0F);
		

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(3.0F, 4.0F, 2.0F);
		BackLegR.addChild(cube_r13);
		setRotationAngle(cube_r13, 0.0F, -1.0036F, 0.0F);
		cube_r13.cubeList.add(new ModelBox(cube_r13, 24, 40, -1.0F, 6.0F, -5.0F, 2, 1, 1, 0.0F, false));
		cube_r13.cubeList.add(new ModelBox(cube_r13, 36, 16, -2.0F, 7.0F, -5.0F, 3, 1, 1, 0.0F, false));

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(3.0F, 4.0F, 2.0F);
		BackLegR.addChild(cube_r14);
		setRotationAngle(cube_r14, -3.1416F, -1.3963F, 3.1416F);
		cube_r14.cubeList.add(new ModelBox(cube_r14, 24, 42, -5.0F, 6.0F, -6.0F, 2, 1, 1, 0.0F, false));

		cube_r15 = new ModelRenderer(this);
		cube_r15.setRotationPoint(3.0F, 5.0F, 2.0F);
		BackLegR.addChild(cube_r15);
		setRotationAngle(cube_r15, -3.1416F, -1.3963F, 3.1416F);
		cube_r15.cubeList.add(new ModelBox(cube_r15, 0, 46, -6.0F, 6.0F, -6.0F, 3, 1, 1, 0.0F, false));

		cube_r16 = new ModelRenderer(this);
		cube_r16.setRotationPoint(3.0F, 5.0F, 2.0F);
		BackLegR.addChild(cube_r16);
		setRotationAngle(cube_r16, 0.0F, -1.3526F, 0.0F);
		cube_r16.cubeList.add(new ModelBox(cube_r16, 52, 0, -4.0F, 6.0F, -6.0F, 3, 1, 1, 0.0F, false));
		cube_r16.cubeList.add(new ModelBox(cube_r16, 0, 8, 0.0F, 4.0F, -7.0F, 3, 2, 3, 0.0F, false));
		cube_r16.cubeList.add(new ModelBox(cube_r16, 41, 8, -1.0F, 6.0F, -7.0F, 4, 1, 3, 0.0F, false));

		cube_r17 = new ModelRenderer(this);
		cube_r17.setRotationPoint(3.0F, 3.0F, 2.0F);
		BackLegR.addChild(cube_r17);
		setRotationAngle(cube_r17, 0.0F, -1.3526F, 0.0F);
		cube_r17.cubeList.add(new ModelBox(cube_r17, 24, 44, -3.0F, 7.0F, -6.0F, 2, 1, 1, 0.0F, false));

		cube_r18 = new ModelRenderer(this);
		cube_r18.setRotationPoint(18.0F, 4.0F, 1.0F);
		BackLegR.addChild(cube_r18);
		setRotationAngle(cube_r18, -2.1633F, -0.8787F, 1.968F);
		cube_r18.cubeList.add(new ModelBox(cube_r18, 57, 31, -1.0F, -2.0F, 7.0F, 8, 3, 3, 0.0F, false));

		cube_r19 = new ModelRenderer(this);
		cube_r19.setRotationPoint(0.0F, 4.0F, 0.0F);
		BackLegR.addChild(cube_r19);
		setRotationAngle(cube_r19, -0.0436F, 2.7053F, -0.3491F);
		cube_r19.cubeList.add(new ModelBox(cube_r19, 14, 60, -13.0F, 2.0F, 5.0F, 7, 3, 3, 0.0F, false));

		FrontLegL = new ModelRenderer(this);
		FrontLegL.setRotationPoint(4.0F, 17.0F, -6.0F);
		

		cube_r20 = new ModelRenderer(this);
		cube_r20.setRotationPoint(-2.0F, -1.0F, 1.0F);
		FrontLegL.addChild(cube_r20);
		setRotationAngle(cube_r20, 0.1254F, 0.4476F, 0.6603F);
		cube_r20.cubeList.add(new ModelBox(cube_r20, 18, 51, -1.0F, -1.0F, -1.0F, 7, 2, 2, 0.0F, false));

		cube_r21 = new ModelRenderer(this);
		cube_r21.setRotationPoint(-2.0F, 0.0F, -4.0F);
		FrontLegL.addChild(cube_r21);
		setRotationAngle(cube_r21, -2.4333F, -1.2316F, 2.4621F);
		cube_r21.cubeList.add(new ModelBox(cube_r21, 0, 0, 0.0F, 1.0F, -7.0F, 3, 5, 3, 0.0F, false));

		cube_r22 = new ModelRenderer(this);
		cube_r22.setRotationPoint(-2.0F, 0.0F, -5.0F);
		FrontLegL.addChild(cube_r22);
		setRotationAngle(cube_r22, 2.9745F, -1.3055F, -2.9802F);
		cube_r22.cubeList.add(new ModelBox(cube_r22, 41, 0, -1.0F, 6.0F, -7.0F, 4, 1, 3, 0.0F, false));
		cube_r22.cubeList.add(new ModelBox(cube_r22, 29, 22, -4.0F, 6.0F, -6.0F, 3, 1, 1, 0.0F, false));

		cube_r23 = new ModelRenderer(this);
		cube_r23.setRotationPoint(-2.0F, -1.0F, -5.0F);
		FrontLegL.addChild(cube_r23);
		setRotationAngle(cube_r23, 3.07F, -0.9151F, -3.0848F);
		cube_r23.cubeList.add(new ModelBox(cube_r23, 24, 34, -5.0F, 6.0F, -6.0F, 2, 1, 1, 0.0F, false));

		cube_r24 = new ModelRenderer(this);
		cube_r24.setRotationPoint(-2.0F, 0.0F, -5.0F);
		FrontLegL.addChild(cube_r24);
		setRotationAngle(cube_r24, 3.07F, -0.9151F, -3.0848F);
		cube_r24.cubeList.add(new ModelBox(cube_r24, 29, 24, -6.0F, 6.0F, -6.0F, 3, 1, 1, 0.0F, false));

		cube_r25 = new ModelRenderer(this);
		cube_r25.setRotationPoint(-2.0F, -2.0F, -5.0F);
		FrontLegL.addChild(cube_r25);
		setRotationAngle(cube_r25, 2.9745F, -1.3055F, -2.9802F);
		cube_r25.cubeList.add(new ModelBox(cube_r25, 7, 34, -3.0F, 7.0F, -6.0F, 2, 1, 1, 0.0F, false));

		cube_r26 = new ModelRenderer(this);
		cube_r26.setRotationPoint(-2.0F, -1.0F, -5.0F);
		FrontLegL.addChild(cube_r26);
		setRotationAngle(cube_r26, 0.4644F, -1.4733F, -0.4625F);
		cube_r26.cubeList.add(new ModelBox(cube_r26, 36, 23, -1.0F, 6.0F, -5.0F, 2, 1, 1, 0.0F, false));

		cube_r27 = new ModelRenderer(this);
		cube_r27.setRotationPoint(-2.0F, 0.0F, -5.0F);
		FrontLegL.addChild(cube_r27);
		setRotationAngle(cube_r27, 0.4644F, -1.4733F, -0.4625F);
		cube_r27.cubeList.add(new ModelBox(cube_r27, 7, 32, -2.0F, 6.0F, -5.0F, 3, 1, 1, 0.0F, false));

		FrontLegR = new ModelRenderer(this);
		FrontLegR.setRotationPoint(-5.0F, 17.0F, -6.0F);
		

		cube_r28 = new ModelRenderer(this);
		cube_r28.setRotationPoint(-7.0F, 0.0F, -2.0F);
		FrontLegR.addChild(cube_r28);
		setRotationAngle(cube_r28, -0.8913F, -1.2316F, 0.8625F);
		cube_r28.cubeList.add(new ModelBox(cube_r28, 0, 14, 0.0F, 1.0F, -7.0F, 3, 5, 3, 0.0F, false));

		cube_r29 = new ModelRenderer(this);
		cube_r29.setRotationPoint(-7.0F, 0.0F, -3.0F);
		FrontLegR.addChild(cube_r29);
		setRotationAngle(cube_r29, 0.0F, -1.3526F, 0.0F);
		cube_r29.cubeList.add(new ModelBox(cube_r29, 41, 4, -1.0F, 6.0F, -7.0F, 4, 1, 3, 0.0F, false));
		cube_r29.cubeList.add(new ModelBox(cube_r29, 15, 32, -4.0F, 6.0F, -6.0F, 3, 1, 1, 0.0F, false));

		cube_r30 = new ModelRenderer(this);
		cube_r30.setRotationPoint(-7.0F, 0.0F, -3.0F);
		FrontLegR.addChild(cube_r30);
		setRotationAngle(cube_r30, -3.1416F, -1.3963F, 3.1416F);
		cube_r30.cubeList.add(new ModelBox(cube_r30, 23, 32, -6.0F, 6.0F, -6.0F, 3, 1, 1, 0.0F, false));

		cube_r31 = new ModelRenderer(this);
		cube_r31.setRotationPoint(-7.0F, 0.0F, -3.0F);
		FrontLegR.addChild(cube_r31);
		setRotationAngle(cube_r31, 0.0F, -1.0036F, 0.0F);
		cube_r31.cubeList.add(new ModelBox(cube_r31, 36, 14, -2.0F, 6.0F, -5.0F, 3, 1, 1, 0.0F, false));
		cube_r31.cubeList.add(new ModelBox(cube_r31, 24, 38, -1.0F, 5.0F, -5.0F, 2, 1, 1, 0.0F, false));

		cube_r32 = new ModelRenderer(this);
		cube_r32.setRotationPoint(-7.0F, -2.0F, -3.0F);
		FrontLegR.addChild(cube_r32);
		setRotationAngle(cube_r32, 0.0F, -1.3526F, 0.0F);
		cube_r32.cubeList.add(new ModelBox(cube_r32, 24, 36, -3.0F, 7.0F, -6.0F, 2, 1, 1, 0.0F, false));

		cube_r33 = new ModelRenderer(this);
		cube_r33.setRotationPoint(-7.0F, -1.0F, -3.0F);
		FrontLegR.addChild(cube_r33);
		setRotationAngle(cube_r33, -3.1416F, -1.3963F, 3.1416F);
		cube_r33.cubeList.add(new ModelBox(cube_r33, 36, 25, -5.0F, 6.0F, -6.0F, 2, 1, 1, 0.0F, false));

		cube_r34 = new ModelRenderer(this);
		cube_r34.setRotationPoint(0.0F, -1.0F, 1.0F);
		FrontLegR.addChild(cube_r34);
		setRotationAngle(cube_r34, 2.8643F, 0.6708F, 2.233F);
		cube_r34.cubeList.add(new ModelBox(cube_r34, 61, 0, -3.0F, 0.0F, 0.0F, 7, 2, 2, 0.0F, false));
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
										if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == ReiwaRiderItems.raise_riser_belt_kekera){	
												double height=2;
														
											
												
												
		Minecraft.getMinecraft().renderEngine.bindTexture(new ResourceLocation(Refercence.MODID+":textures/armor/kekera.png"));

													GlStateManager.pushMatrix();
												GlStateManager.translate(0, -1.45, 1.4);
												GlStateManager.scale(height,height,height);
												this.Head.render(f5);
												this.FrontLegL.render(f5);
												this.BackLegR.render(f5);
												this.BodyBase.render(f5);
												this.FrontLegR.render(f5);
												this.BackLegL.render(f5);
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
	        this.Head.rotateAngleX = 0.017453292F * entityarmorstand.getHeadRotation().getX();
	        this.Head.rotateAngleY = 0.017453292F * entityarmorstand.getHeadRotation().getY();
	        this.Head.rotateAngleZ = 0.017453292F * entityarmorstand.getHeadRotation().getZ();
	        this.BodyBase.rotateAngleX = 0.017453292F * entityarmorstand.getBodyRotation().getX();
	        this.BodyBase.rotateAngleY = 0.017453292F * entityarmorstand.getBodyRotation().getY();
	        this.BodyBase.rotateAngleZ = 0.017453292F * entityarmorstand.getBodyRotation().getZ();
	        this.FrontLegL.rotateAngleX = 0.017453292F * entityarmorstand.getRightLegRotation().getX();
	        this.FrontLegL.rotateAngleY = 0.017453292F * entityarmorstand.getRightLegRotation().getY();
	        this.FrontLegL.rotateAngleZ = 0.017453292F * entityarmorstand.getRightLegRotation().getZ();
	        this.FrontLegR.rotateAngleX = 0.017453292F * entityarmorstand.getRightArmRotation().getX();
	        this.FrontLegR.rotateAngleY = 0.017453292F * entityarmorstand.getRightArmRotation().getY();
	        this.FrontLegR.rotateAngleZ = 0.017453292F * entityarmorstand.getRightArmRotation().getZ();
	        this.BackLegL.rotateAngleX = 0.017453292F * entityarmorstand.getLeftLegRotation().getX();
	        this.BackLegL.rotateAngleY = 0.017453292F * entityarmorstand.getLeftLegRotation().getY();
	        this.BackLegL.rotateAngleZ = 0.017453292F * entityarmorstand.getLeftLegRotation().getZ();
	        this.BackLegR.rotateAngleX = 0.017453292F * entityarmorstand.getRightLegRotation().getX();
	        this.BackLegR.rotateAngleY = 0.017453292F * entityarmorstand.getRightLegRotation().getY();
	        this.BackLegR.rotateAngleZ = 0.017453292F * entityarmorstand.getRightLegRotation().getZ();
	        this.BackLegR.setRotationPoint(-1.9F, 11.0F, 0.0F);
	        copyModelAngles(this.bipedHead, this.bipedHeadwear);
	    }else{
	    	super.setRotationAngles(p_78087_1_, p_78087_2_, p_78087_3_, p_78087_4_, p_78087_5_, p_78087_6_, entityIn);
	    }
		this.FrontLegL.rotateAngleX=this.bipedRightLeg.rotateAngleX;
		this.FrontLegL.rotateAngleY=this.bipedRightLeg.rotateAngleY;
		this.FrontLegL.rotateAngleZ=this.bipedRightLeg.rotateAngleZ;
		
		this.Head.rotateAngleX=this.bipedHead.rotateAngleX;
		this.Head.rotateAngleY=this.bipedHead.rotateAngleY;
		this.Head.rotateAngleZ=this.bipedHead.rotateAngleZ;
		
		this.BodyBase.rotateAngleX=this.bipedBody.rotateAngleX;
		this.BodyBase.rotateAngleY=this.bipedBody.rotateAngleY;
		this.BodyBase.rotateAngleZ=this.bipedBody.rotateAngleZ;

		this.FrontLegR.rotateAngleX=this.bipedRightArm.rotateAngleX;
		this.FrontLegR.rotateAngleY=this.bipedRightArm.rotateAngleY;
		this.FrontLegR.rotateAngleZ=this.bipedRightArm.rotateAngleZ;
		
		this.BackLegL.rotateAngleX=this.bipedLeftLeg.rotateAngleX;
		this.BackLegL.rotateAngleY=this.bipedLeftLeg.rotateAngleY;
		this.BackLegL.rotateAngleZ=this.bipedLeftLeg.rotateAngleZ;
		
		this.BackLegR.rotateAngleX=this.bipedRightLeg.rotateAngleX;
		this.BackLegR.rotateAngleY=this.bipedRightLeg.rotateAngleY;
		this.BackLegR.rotateAngleZ=this.bipedRightLeg.rotateAngleZ;
		
		
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}