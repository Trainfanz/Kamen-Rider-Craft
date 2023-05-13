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


public class Model_Kyuun extends model_belt_plus {
	private final ModelRenderer BodyBase;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;
	private final ModelRenderer bipedBody4_r1;
	private final ModelRenderer Head;
	private final ModelRenderer cube_r7;
	private final ModelRenderer cube_r8;
	private final ModelRenderer cube_r9;
	private final ModelRenderer cube_r10;
	private final ModelRenderer cube_r11;
	private final ModelRenderer cube_r12;
	private final ModelRenderer cube_r13;
	private final ModelRenderer cube_r14;
	private final ModelRenderer cube_r15;
	private final ModelRenderer cube_r16;
	private final ModelRenderer cube_r17;
	private final ModelRenderer cube_r18;
	private final ModelRenderer cube_r19;
	private final ModelRenderer bipedBody4_r2_r1;
	private final ModelRenderer FrontLegL;
	private final ModelRenderer cube_r20;
	private final ModelRenderer cube_r21;
	private final ModelRenderer cube_r22;
	private final ModelRenderer cube_r23;
	private final ModelRenderer cube_r24;
	private final ModelRenderer BackLegL;
	private final ModelRenderer cube_r25;
	private final ModelRenderer cube_r26;
	private final ModelRenderer cube_r27;
	private final ModelRenderer cube_r28;
	private final ModelRenderer BackLegR;
	private final ModelRenderer cube_r29;
	private final ModelRenderer cube_r30;
	private final ModelRenderer cube_r31;
	private final ModelRenderer cube_r32;
	private final ModelRenderer FrontLegR;
	private final ModelRenderer cube_r33;
	private final ModelRenderer cube_r34;
	private final ModelRenderer cube_r35;
	private final ModelRenderer cube_r36;
	private final ModelRenderer cube_r37;
	private final ModelRenderer BodyBase2;
	private final ModelRenderer cube_r38;
	private final ModelRenderer cube_r39;
	private final ModelRenderer cube_r40;
	private final ModelRenderer cube_r41;
	private final ModelRenderer cube_r42;
	private final ModelRenderer cube_r43;
	private final ModelRenderer bipedBody4_r2;
	private final ModelRenderer Head2;
	private final ModelRenderer cube_r44;
	private final ModelRenderer cube_r45;
	private final ModelRenderer cube_r46;
	private final ModelRenderer cube_r47;
	private final ModelRenderer cube_r48;
	private final ModelRenderer cube_r49;
	private final ModelRenderer cube_r50;
	private final ModelRenderer cube_r51;
	private final ModelRenderer cube_r52;
	private final ModelRenderer cube_r53;
	private final ModelRenderer cube_r54;
	private final ModelRenderer cube_r55;
	private final ModelRenderer cube_r56;
	private final ModelRenderer bipedBody4_r2_r2;
	private final ModelRenderer FrontLegL2;
	private final ModelRenderer cube_r57;
	private final ModelRenderer cube_r58;
	private final ModelRenderer cube_r59;
	private final ModelRenderer cube_r60;
	private final ModelRenderer cube_r61;
	private final ModelRenderer BackLegL2;
	private final ModelRenderer cube_r62;
	private final ModelRenderer cube_r63;
	private final ModelRenderer cube_r64;
	private final ModelRenderer cube_r65;
	private final ModelRenderer BackLegR2;
	private final ModelRenderer cube_r66;
	private final ModelRenderer cube_r67;
	private final ModelRenderer cube_r68;
	private final ModelRenderer cube_r69;
	private final ModelRenderer FrontLegR2;
	private final ModelRenderer cube_r70;
	private final ModelRenderer cube_r71;
	private final ModelRenderer cube_r72;
	private final ModelRenderer cube_r73;
	private final ModelRenderer cube_r74;

	public Model_Kyuun() {
		textureWidth = 128;
		textureHeight = 128;

		BodyBase = new ModelRenderer(this);
		BodyBase.setRotationPoint(0.0F, 6.8F, 0.0F);
		BodyBase.cubeList.add(new ModelBox(BodyBase, 75, 12, -1.5F, 1.0F, 12.0F, 2, 1, 4, 0.0F, false));
		BodyBase.cubeList.add(new ModelBox(BodyBase, 20, 52, 3.0F, 5.0F, -6.0F, 1, 6, 9, 0.0F, false));
		BodyBase.cubeList.add(new ModelBox(BodyBase, 0, 52, -5.0F, 5.0F, -6.0F, 1, 6, 9, 0.0F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0F, 4.0F, 7.0F);
		BodyBase.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.6545F, 0.0F, 0.0F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 11, 52, -4.0F, -8.0F, -17.0F, 7, 6, 2, 0.0F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.0F, 4.0F, 7.0F);
		BodyBase.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.5672F, 0.0F, 0.0F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 52, 33, -3.0F, -8.0F, -17.0F, 5, 6, 6, 0.0F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-2.0F, 8.0F, 7.0F);
		BodyBase.addChild(cube_r3);
		setRotationAngle(cube_r3, -0.3927F, 0.0F, 0.0F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 74, 59, 0.5F, -1.0F, -14.0F, 2, 1, 4, 0.0F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(0.0F, 4.0F, 7.0F);
		BodyBase.addChild(cube_r4);
		setRotationAngle(cube_r4, -0.2182F, 0.0F, 0.0F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 49, 6, -4.0F, 2.0F, -13.0F, 7, 2, 5, 0.0F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(-2.0F, 6.0F, 7.0F);
		BodyBase.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.0436F, 0.0F, 0.0F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 31, 0, 0.5F, -3.0F, -10.0F, 2, 1, 14, 0.0F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 0, -2.0F, -2.0F, -13.0F, 7, 7, 17, 0.0F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(-2.0F, 4.0F, 3.0F);
		BodyBase.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.5236F, 0.0F, 0.0F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 79, 69, 0.5F, 2.0F, 6.0F, 2, 2, 3, 0.0F, false));

		bipedBody4_r1 = new ModelRenderer(this);
		bipedBody4_r1.setRotationPoint(5.0F, 7.2F, 5.0F);
		BodyBase.addChild(bipedBody4_r1);
		setRotationAngle(bipedBody4_r1, -1.5708F, -0.9163F, 1.5708F);
		bipedBody4_r1.cubeList.add(new ModelBox(bipedBody4_r1, 0, 24, -2.0115F, -9.8879F, 0.0F, 2, 17, 11, 0.0F, false));

		Head = new ModelRenderer(this);
		Head.setRotationPoint(-0.5F, 10.0F, -7.0F);
		Head.cubeList.add(new ModelBox(Head, 29, 24, -1.5F, 4.0F, -7.0F, 3, 2, 1, 0.0F, false));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(0.5F, 8.0F, 6.0F);
		Head.addChild(cube_r7);
		setRotationAngle(cube_r7, -0.3491F, -0.4363F, 0.0F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 22, 78, -2.5F, -7.5F, -13.5F, 2, 6, 2, 0.0F, false));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(0.5F, 8.0F, 6.0F);
		Head.addChild(cube_r8);
		setRotationAngle(cube_r8, -0.3491F, 0.4363F, 0.0F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 52, -0.5F, -7.5F, -13.7F, 2, 6, 2, 0.0F, false));

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(0.5F, 5.0F, 7.0F);
		Head.addChild(cube_r9);
		setRotationAngle(cube_r9, 0.0F, -0.4363F, 0.0F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 31, -4.5F, -3.5F, -13.7F, 3, 2, 2, 0.0F, false));

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(0.5F, 5.0F, 7.0F);
		Head.addChild(cube_r10);
		setRotationAngle(cube_r10, 0.0F, 0.4363F, 0.0F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 42, 53, 0.5F, -3.5F, -14.0F, 3, 2, 2, 0.0F, false));

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(0.5F, 5.0F, 7.0F);
		Head.addChild(cube_r11);
		setRotationAngle(cube_r11, 0.1309F, 0.0F, 0.0F);
		cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 0, 0.5F, -7.0F, -14.8F, 1, 2, 1, 0.0F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 9, -2.5F, -7.0F, -14.8F, 1, 2, 1, 0.0F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 11, 0, -1.5F, -8.0F, -15.0F, 2, 2, 1, 0.0F, false));

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(0.5F, 5.0F, 7.0F);
		Head.addChild(cube_r12);
		setRotationAngle(cube_r12, 0.6545F, 0.0F, 0.0F);
		cube_r12.cubeList.add(new ModelBox(cube_r12, 66, 78, -1.0F, -15.0F, -9.0F, 1, 1, 4, 0.0F, false));

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(0.5F, 5.0F, 7.0F);
		Head.addChild(cube_r13);
		setRotationAngle(cube_r13, 0.2182F, 0.0F, 0.0F);
		cube_r13.cubeList.add(new ModelBox(cube_r13, 59, 13, -3.5F, -9.0F, -14.0F, 6, 1, 4, 0.0F, false));

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(0.5F, 5.0F, 7.0F);
		Head.addChild(cube_r14);
		setRotationAngle(cube_r14, -0.6981F, 0.0F, 0.0F);
		cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 24, -2.0F, 3.0F, -13.0F, 3, 5, 2, 0.0F, false));

		cube_r15 = new ModelRenderer(this);
		cube_r15.setRotationPoint(0.5F, 5.0F, 7.0F);
		Head.addChild(cube_r15);
		setRotationAngle(cube_r15, -0.1309F, 0.0F, 0.0F);
		cube_r15.cubeList.add(new ModelBox(cube_r15, 14, 73, -3.0F, -2.0F, -14.0F, 5, 3, 2, 0.0F, false));

		cube_r16 = new ModelRenderer(this);
		cube_r16.setRotationPoint(0.5F, 5.0F, 7.0F);
		Head.addChild(cube_r16);
		setRotationAngle(cube_r16, 0.829F, 0.0F, 0.0F);
		cube_r16.cubeList.add(new ModelBox(cube_r16, 78, 74, -4.5F, -14.0F, -1.0F, 1, 1, 4, 0.0F, false));
		cube_r16.cubeList.add(new ModelBox(cube_r16, 79, 64, 2.5F, -14.0F, -1.0F, 1, 1, 4, 0.0F, false));

		cube_r17 = new ModelRenderer(this);
		cube_r17.setRotationPoint(0.5F, 5.0F, 7.0F);
		Head.addChild(cube_r17);
		setRotationAngle(cube_r17, 0.6981F, 0.0F, 0.0F);
		cube_r17.cubeList.add(new ModelBox(cube_r17, 28, 74, -2.0F, -15.0F, -8.0F, 3, 2, 3, 0.0F, false));

		cube_r18 = new ModelRenderer(this);
		cube_r18.setRotationPoint(0.5F, 5.0F, 7.0F);
		Head.addChild(cube_r18);
		setRotationAngle(cube_r18, 0.5672F, 0.0F, 0.0F);
		cube_r18.cubeList.add(new ModelBox(cube_r18, 15, 24, -2.5F, -15.0F, -7.0F, 4, 2, 6, 0.0F, false));

		cube_r19 = new ModelRenderer(this);
		cube_r19.setRotationPoint(0.5F, 5.0F, 7.0F);
		Head.addChild(cube_r19);
		setRotationAngle(cube_r19, -0.829F, 0.0F, 0.0F);
		cube_r19.cubeList.add(new ModelBox(cube_r19, 42, 18, -4.0F, -3.0F, -14.0F, 7, 9, 6, 0.0F, false));

		bipedBody4_r2_r1 = new ModelRenderer(this);
		bipedBody4_r2_r1.setRotationPoint(0.5F, 21.0F, 15.0F);
		Head.addChild(bipedBody4_r2_r1);
		setRotationAngle(bipedBody4_r2_r1, -1.5708F, -1.1345F, 1.5708F);
		bipedBody4_r2_r1.cubeList.add(new ModelBox(bipedBody4_r2_r1, 26, 24, -26.5F, -21.8F, -5.0F, 2, 17, 11, 0.0F, false));

		FrontLegL = new ModelRenderer(this);
		FrontLegL.setRotationPoint(4.0F, 14.0F, -7.0F);
		FrontLegL.cubeList.add(new ModelBox(FrontLegL, 77, 30, -2.0F, -1.0F, -1.0F, 4, 2, 2, 0.0F, false));
		FrontLegL.cubeList.add(new ModelBox(FrontLegL, 68, 24, 0.5F, 7.5F, -4.0F, 4, 2, 4, 0.0F, false));

		cube_r20 = new ModelRenderer(this);
		cube_r20.setRotationPoint(-4.0F, 0.0F, 2.0F);
		FrontLegL.addChild(cube_r20);
		setRotationAngle(cube_r20, 0.3491F, 0.0F, 0.0F);
		cube_r20.cubeList.add(new ModelBox(cube_r20, 74, 47, 4.0F, 6.0F, -5.0F, 5, 2, 2, 0.0F, false));

		cube_r21 = new ModelRenderer(this);
		cube_r21.setRotationPoint(-4.0F, 0.0F, 2.0F);
		FrontLegL.addChild(cube_r21);
		setRotationAngle(cube_r21, -0.2182F, 0.0F, 0.0F);
		cube_r21.cubeList.add(new ModelBox(cube_r21, 73, 6, 4.5F, 3.0F, -1.0F, 4, 3, 3, 0.0F, false));

		cube_r22 = new ModelRenderer(this);
		cube_r22.setRotationPoint(-4.0F, 0.0F, 2.0F);
		FrontLegL.addChild(cube_r22);
		setRotationAngle(cube_r22, -0.4363F, 0.0F, 0.0F);
		cube_r22.cubeList.add(new ModelBox(cube_r22, 38, 78, 5.0F, 5.0F, 0.0F, 3, 4, 2, 0.0F, false));

		cube_r23 = new ModelRenderer(this);
		cube_r23.setRotationPoint(-4.0F, 0.0F, 0.0F);
		FrontLegL.addChild(cube_r23);
		setRotationAngle(cube_r23, 0.2054F, 0.0741F, -0.3414F);
		cube_r23.cubeList.add(new ModelBox(cube_r23, 49, 0, 8.5F, -1.0F, -1.5F, 11, 1, 5, 0.0F, false));

		cube_r24 = new ModelRenderer(this);
		cube_r24.setRotationPoint(-4.0F, 0.0F, 0.0F);
		FrontLegL.addChild(cube_r24);
		setRotationAngle(cube_r24, 0.2182F, 0.0F, 0.0F);
		cube_r24.cubeList.add(new ModelBox(cube_r24, 68, 30, 6.5F, -5.0F, -2.5F, 2, 2, 5, 0.0F, false));
		cube_r24.cubeList.add(new ModelBox(cube_r24, 58, 57, 5.5F, -3.0F, -2.5F, 3, 4, 5, 0.0F, false));
		cube_r24.cubeList.add(new ModelBox(cube_r24, 0, 67, 5.0F, -2.0F, -2.0F, 3, 6, 4, 0.0F, false));

		BackLegL = new ModelRenderer(this);
		BackLegL.setRotationPoint(4.0F, 14.0F, 9.0F);
		BackLegL.cubeList.add(new ModelBox(BackLegL, 77, 30, -2.0F, -1.0F, -1.0F, 4, 2, 2, 0.0F, false));
		BackLegL.cubeList.add(new ModelBox(BackLegL, 68, 24, 0.5F, 7.5F, -4.0F, 4, 2, 4, 0.0F, false));
		BackLegL.cubeList.add(new ModelBox(BackLegL, 40, 72, 1.5F, -3.0F, -2.0F, 2, 2, 4, 0.0F, false));

		cube_r25 = new ModelRenderer(this);
		cube_r25.setRotationPoint(-4.0F, 0.0F, 2.0F);
		BackLegL.addChild(cube_r25);
		setRotationAngle(cube_r25, 0.3491F, 0.0F, 0.0F);
		cube_r25.cubeList.add(new ModelBox(cube_r25, 74, 47, 4.0F, 6.0F, -5.0F, 5, 2, 2, 0.0F, false));

		cube_r26 = new ModelRenderer(this);
		cube_r26.setRotationPoint(-4.0F, 0.0F, 2.0F);
		BackLegL.addChild(cube_r26);
		setRotationAngle(cube_r26, -0.2182F, 0.0F, 0.0F);
		cube_r26.cubeList.add(new ModelBox(cube_r26, 73, 6, 4.5F, 3.0F, -1.0F, 4, 3, 3, 0.0F, false));

		cube_r27 = new ModelRenderer(this);
		cube_r27.setRotationPoint(-4.0F, 0.0F, 2.0F);
		BackLegL.addChild(cube_r27);
		setRotationAngle(cube_r27, -0.4363F, 0.0F, 0.0F);
		cube_r27.cubeList.add(new ModelBox(cube_r27, 38, 78, 5.0F, 5.0F, 0.0F, 3, 4, 2, 0.0F, false));

		cube_r28 = new ModelRenderer(this);
		cube_r28.setRotationPoint(-4.0F, 0.0F, 0.0F);
		BackLegL.addChild(cube_r28);
		setRotationAngle(cube_r28, 0.2182F, 0.0F, 0.0F);
		cube_r28.cubeList.add(new ModelBox(cube_r28, 47, 53, 5.5F, -1.5F, -2.5F, 3, 4, 5, 0.0F, false));
		cube_r28.cubeList.add(new ModelBox(cube_r28, 0, 67, 5.0F, -2.0F, -2.0F, 3, 6, 4, 0.0F, false));

		BackLegR = new ModelRenderer(this);
		BackLegR.setRotationPoint(-5.0F, 14.0F, 9.0F);
		BackLegR.cubeList.add(new ModelBox(BackLegR, 77, 30, -1.0F, -1.0F, -1.0F, 4, 2, 2, 0.0F, false));
		BackLegR.cubeList.add(new ModelBox(BackLegR, 0, 9, -4.5F, 7.5F, -4.0F, 4, 2, 4, 0.0F, false));
		BackLegR.cubeList.add(new ModelBox(BackLegR, 40, 72, -3.5F, -3.0F, -2.0F, 2, 2, 4, 0.0F, false));

		cube_r29 = new ModelRenderer(this);
		cube_r29.setRotationPoint(-9.0F, 0.0F, 2.0F);
		BackLegR.addChild(cube_r29);
		setRotationAngle(cube_r29, 0.3491F, 0.0F, 0.0F);
		cube_r29.cubeList.add(new ModelBox(cube_r29, 31, 10, 4.0F, 6.0F, -5.0F, 5, 2, 2, 0.0F, false));

		cube_r30 = new ModelRenderer(this);
		cube_r30.setRotationPoint(-9.0F, 0.0F, 2.0F);
		BackLegR.addChild(cube_r30);
		setRotationAngle(cube_r30, -0.2182F, 0.0F, 0.0F);
		cube_r30.cubeList.add(new ModelBox(cube_r30, 68, 66, 4.5F, 3.0F, -1.0F, 4, 3, 3, 0.0F, false));

		cube_r31 = new ModelRenderer(this);
		cube_r31.setRotationPoint(-9.0F, 0.0F, 2.0F);
		BackLegR.addChild(cube_r31);
		setRotationAngle(cube_r31, -0.4363F, 0.0F, 0.0F);
		cube_r31.cubeList.add(new ModelBox(cube_r31, 50, 76, 5.0F, 5.0F, 0.0F, 3, 4, 2, 0.0F, false));

		cube_r32 = new ModelRenderer(this);
		cube_r32.setRotationPoint(-9.0F, 0.0F, 0.0F);
		BackLegR.addChild(cube_r32);
		setRotationAngle(cube_r32, 0.2182F, 0.0F, 0.0F);
		cube_r32.cubeList.add(new ModelBox(cube_r32, 31, 52, 4.5F, -1.5F, -2.5F, 3, 4, 5, 0.0F, false));
		cube_r32.cubeList.add(new ModelBox(cube_r32, 31, 0, 5.0F, -2.0F, -2.0F, 3, 6, 4, 0.0F, false));

		FrontLegR = new ModelRenderer(this);
		FrontLegR.setRotationPoint(-5.0F, 14.0F, -7.0F);
		FrontLegR.cubeList.add(new ModelBox(FrontLegR, 77, 30, -1.0F, -1.0F, -1.0F, 4, 2, 2, 0.0F, false));
		FrontLegR.cubeList.add(new ModelBox(FrontLegR, 0, 9, -4.5F, 7.5F, -4.0F, 4, 2, 4, 0.0F, false));

		cube_r33 = new ModelRenderer(this);
		cube_r33.setRotationPoint(-9.0F, 0.0F, 2.0F);
		FrontLegR.addChild(cube_r33);
		setRotationAngle(cube_r33, 0.3491F, 0.0F, 0.0F);
		cube_r33.cubeList.add(new ModelBox(cube_r33, 31, 10, 4.0F, 6.0F, -5.0F, 5, 2, 2, 0.0F, false));

		cube_r34 = new ModelRenderer(this);
		cube_r34.setRotationPoint(-9.0F, 0.0F, 2.0F);
		FrontLegR.addChild(cube_r34);
		setRotationAngle(cube_r34, -0.2182F, 0.0F, 0.0F);
		cube_r34.cubeList.add(new ModelBox(cube_r34, 68, 66, 4.5F, 3.0F, -1.0F, 4, 3, 3, 0.0F, false));

		cube_r35 = new ModelRenderer(this);
		cube_r35.setRotationPoint(-9.0F, 0.0F, 2.0F);
		FrontLegR.addChild(cube_r35);
		setRotationAngle(cube_r35, -0.4363F, 0.0F, 0.0F);
		cube_r35.cubeList.add(new ModelBox(cube_r35, 50, 76, 5.0F, 5.0F, 0.0F, 3, 4, 2, 0.0F, false));

		cube_r36 = new ModelRenderer(this);
		cube_r36.setRotationPoint(-9.0F, 0.0F, 0.0F);
		FrontLegR.addChild(cube_r36);
		setRotationAngle(cube_r36, 0.249F, -0.0741F, 0.3851F);
		cube_r36.cubeList.add(new ModelBox(cube_r36, 49, 0, -7.5F, -5.0F, -1.5F, 11, 1, 5, 0.0F, true));

		cube_r37 = new ModelRenderer(this);
		cube_r37.setRotationPoint(-9.0F, 0.0F, 0.0F);
		FrontLegR.addChild(cube_r37);
		setRotationAngle(cube_r37, 0.2182F, 0.0F, 0.0F);
		cube_r37.cubeList.add(new ModelBox(cube_r37, 30, 67, 4.5F, -5.0F, -2.5F, 2, 2, 5, 0.0F, false));
		cube_r37.cubeList.add(new ModelBox(cube_r37, 0, 0, 4.5F, -3.0F, -2.5F, 3, 4, 5, 0.0F, false));
		cube_r37.cubeList.add(new ModelBox(cube_r37, 31, 0, 5.0F, -2.0F, -2.0F, 3, 6, 4, 0.0F, false));

		BodyBase2 = new ModelRenderer(this);
		BodyBase2.setRotationPoint(0.0F, 6.8F, 0.0F);
		BodyBase2.cubeList.add(new ModelBox(BodyBase2, 75, 12, -1.5F, 1.0F, 12.0F, 2, 1, 4, 0.0F, false));
		BodyBase2.cubeList.add(new ModelBox(BodyBase2, 20, 52, 3.0F, 5.0F, -6.0F, 1, 6, 9, 0.0F, false));
		BodyBase2.cubeList.add(new ModelBox(BodyBase2, 0, 52, -5.0F, 5.0F, -6.0F, 1, 6, 9, 0.0F, false));

		cube_r38 = new ModelRenderer(this);
		cube_r38.setRotationPoint(0.0F, 4.0F, 7.0F);
		BodyBase2.addChild(cube_r38);
		setRotationAngle(cube_r38, 0.6545F, 0.0F, 0.0F);
		cube_r38.cubeList.add(new ModelBox(cube_r38, 11, 52, -4.0F, -8.0F, -17.0F, 7, 6, 2, 0.0F, false));

		cube_r39 = new ModelRenderer(this);
		cube_r39.setRotationPoint(0.0F, 4.0F, 7.0F);
		BodyBase2.addChild(cube_r39);
		setRotationAngle(cube_r39, 0.5672F, 0.0F, 0.0F);
		cube_r39.cubeList.add(new ModelBox(cube_r39, 52, 33, -3.0F, -8.0F, -17.0F, 5, 6, 6, 0.0F, false));

		cube_r40 = new ModelRenderer(this);
		cube_r40.setRotationPoint(-2.0F, 8.0F, 7.0F);
		BodyBase2.addChild(cube_r40);
		setRotationAngle(cube_r40, -0.3927F, 0.0F, 0.0F);
		cube_r40.cubeList.add(new ModelBox(cube_r40, 74, 59, 0.5F, -1.0F, -14.0F, 2, 1, 4, 0.0F, false));

		cube_r41 = new ModelRenderer(this);
		cube_r41.setRotationPoint(0.0F, 4.0F, 7.0F);
		BodyBase2.addChild(cube_r41);
		setRotationAngle(cube_r41, -0.2182F, 0.0F, 0.0F);
		cube_r41.cubeList.add(new ModelBox(cube_r41, 49, 6, -4.0F, 2.0F, -13.0F, 7, 2, 5, 0.0F, false));

		cube_r42 = new ModelRenderer(this);
		cube_r42.setRotationPoint(-2.0F, 6.0F, 7.0F);
		BodyBase2.addChild(cube_r42);
		setRotationAngle(cube_r42, 0.0436F, 0.0F, 0.0F);
		cube_r42.cubeList.add(new ModelBox(cube_r42, 31, 0, 0.5F, -3.0F, -10.0F, 2, 1, 14, 0.0F, false));
		cube_r42.cubeList.add(new ModelBox(cube_r42, 0, 0, -2.0F, -2.0F, -13.0F, 7, 7, 17, 0.0F, false));

		cube_r43 = new ModelRenderer(this);
		cube_r43.setRotationPoint(-2.0F, 4.0F, 3.0F);
		BodyBase2.addChild(cube_r43);
		setRotationAngle(cube_r43, 0.5236F, 0.0F, 0.0F);
		cube_r43.cubeList.add(new ModelBox(cube_r43, 79, 69, 0.5F, 2.0F, 6.0F, 2, 2, 3, 0.0F, false));

		bipedBody4_r2 = new ModelRenderer(this);
		bipedBody4_r2.setRotationPoint(5.0F, 7.2F, 5.0F);
		BodyBase2.addChild(bipedBody4_r2);
		setRotationAngle(bipedBody4_r2, -1.5708F, -0.9163F, 1.5708F);
		bipedBody4_r2.cubeList.add(new ModelBox(bipedBody4_r2, 0, 24, -2.0115F, -9.8879F, 0.0F, 2, 17, 11, 0.0F, false));

		Head2 = new ModelRenderer(this);
		Head2.setRotationPoint(-0.5F, 10.0F, -7.0F);
		Head2.cubeList.add(new ModelBox(Head2, 29, 24, -1.5F, 4.0F, -7.0F, 3, 2, 1, 0.0F, false));

		cube_r44 = new ModelRenderer(this);
		cube_r44.setRotationPoint(0.5F, 8.0F, 6.0F);
		Head2.addChild(cube_r44);
		setRotationAngle(cube_r44, -0.3491F, -0.4363F, 0.0F);
		cube_r44.cubeList.add(new ModelBox(cube_r44, 22, 78, -2.5F, -7.5F, -13.5F, 2, 6, 2, 0.0F, false));

		cube_r45 = new ModelRenderer(this);
		cube_r45.setRotationPoint(0.5F, 8.0F, 6.0F);
		Head2.addChild(cube_r45);
		setRotationAngle(cube_r45, -0.3491F, 0.4363F, 0.0F);
		cube_r45.cubeList.add(new ModelBox(cube_r45, 0, 52, -0.5F, -7.5F, -13.7F, 2, 6, 2, 0.0F, false));

		cube_r46 = new ModelRenderer(this);
		cube_r46.setRotationPoint(0.5F, 5.0F, 7.0F);
		Head2.addChild(cube_r46);
		setRotationAngle(cube_r46, 0.0F, -0.4363F, 0.0F);
		cube_r46.cubeList.add(new ModelBox(cube_r46, 0, 31, -4.5F, -3.5F, -13.7F, 3, 2, 2, 0.0F, false));

		cube_r47 = new ModelRenderer(this);
		cube_r47.setRotationPoint(0.5F, 5.0F, 7.0F);
		Head2.addChild(cube_r47);
		setRotationAngle(cube_r47, 0.0F, 0.4363F, 0.0F);
		cube_r47.cubeList.add(new ModelBox(cube_r47, 42, 53, 0.5F, -3.5F, -14.0F, 3, 2, 2, 0.0F, false));

		cube_r48 = new ModelRenderer(this);
		cube_r48.setRotationPoint(0.5F, 5.0F, 7.0F);
		Head2.addChild(cube_r48);
		setRotationAngle(cube_r48, 0.1309F, 0.0F, 0.0F);
		cube_r48.cubeList.add(new ModelBox(cube_r48, 0, 0, 0.5F, -7.0F, -14.8F, 1, 2, 1, 0.0F, false));
		cube_r48.cubeList.add(new ModelBox(cube_r48, 0, 9, -2.5F, -7.0F, -14.8F, 1, 2, 1, 0.0F, false));
		cube_r48.cubeList.add(new ModelBox(cube_r48, 11, 0, -1.5F, -8.0F, -15.0F, 2, 2, 1, 0.0F, false));

		cube_r49 = new ModelRenderer(this);
		cube_r49.setRotationPoint(0.5F, 5.0F, 7.0F);
		Head2.addChild(cube_r49);
		setRotationAngle(cube_r49, 0.6545F, 0.0F, 0.0F);
		cube_r49.cubeList.add(new ModelBox(cube_r49, 66, 78, -1.0F, -15.0F, -9.0F, 1, 1, 4, 0.0F, false));

		cube_r50 = new ModelRenderer(this);
		cube_r50.setRotationPoint(0.5F, 5.0F, 7.0F);
		Head2.addChild(cube_r50);
		setRotationAngle(cube_r50, 0.2182F, 0.0F, 0.0F);
		cube_r50.cubeList.add(new ModelBox(cube_r50, 59, 13, -3.5F, -9.0F, -14.0F, 6, 1, 4, 0.0F, false));

		cube_r51 = new ModelRenderer(this);
		cube_r51.setRotationPoint(0.5F, 5.0F, 7.0F);
		Head2.addChild(cube_r51);
		setRotationAngle(cube_r51, -0.6981F, 0.0F, 0.0F);
		cube_r51.cubeList.add(new ModelBox(cube_r51, 0, 24, -2.0F, 3.0F, -13.0F, 3, 5, 2, 0.0F, false));

		cube_r52 = new ModelRenderer(this);
		cube_r52.setRotationPoint(0.5F, 5.0F, 7.0F);
		Head2.addChild(cube_r52);
		setRotationAngle(cube_r52, -0.1309F, 0.0F, 0.0F);
		cube_r52.cubeList.add(new ModelBox(cube_r52, 14, 73, -3.0F, -2.0F, -14.0F, 5, 3, 2, 0.0F, false));

		cube_r53 = new ModelRenderer(this);
		cube_r53.setRotationPoint(0.5F, 5.0F, 7.0F);
		Head2.addChild(cube_r53);
		setRotationAngle(cube_r53, 0.829F, 0.0F, 0.0F);
		cube_r53.cubeList.add(new ModelBox(cube_r53, 78, 74, -4.5F, -14.0F, -1.0F, 1, 1, 4, 0.0F, false));
		cube_r53.cubeList.add(new ModelBox(cube_r53, 79, 64, 2.5F, -14.0F, -1.0F, 1, 1, 4, 0.0F, false));

		cube_r54 = new ModelRenderer(this);
		cube_r54.setRotationPoint(0.5F, 5.0F, 7.0F);
		Head2.addChild(cube_r54);
		setRotationAngle(cube_r54, 0.6981F, 0.0F, 0.0F);
		cube_r54.cubeList.add(new ModelBox(cube_r54, 28, 74, -2.0F, -15.0F, -8.0F, 3, 2, 3, 0.0F, false));

		cube_r55 = new ModelRenderer(this);
		cube_r55.setRotationPoint(0.5F, 5.0F, 7.0F);
		Head2.addChild(cube_r55);
		setRotationAngle(cube_r55, 0.5672F, 0.0F, 0.0F);
		cube_r55.cubeList.add(new ModelBox(cube_r55, 15, 24, -2.5F, -15.0F, -7.0F, 4, 2, 6, 0.0F, false));

		cube_r56 = new ModelRenderer(this);
		cube_r56.setRotationPoint(0.5F, 5.0F, 7.0F);
		Head2.addChild(cube_r56);
		setRotationAngle(cube_r56, -0.829F, 0.0F, 0.0F);
		cube_r56.cubeList.add(new ModelBox(cube_r56, 42, 18, -4.0F, -3.0F, -14.0F, 7, 9, 6, 0.0F, false));

		bipedBody4_r2_r2 = new ModelRenderer(this);
		bipedBody4_r2_r2.setRotationPoint(0.5F, 21.0F, 15.0F);
		Head2.addChild(bipedBody4_r2_r2);
		setRotationAngle(bipedBody4_r2_r2, -1.5708F, -1.1345F, 1.5708F);
		bipedBody4_r2_r2.cubeList.add(new ModelBox(bipedBody4_r2_r2, 26, 24, -26.5F, -21.8F, -5.0F, 2, 17, 11, 0.0F, false));

		FrontLegL2 = new ModelRenderer(this);
		FrontLegL2.setRotationPoint(4.0F, 14.0F, -7.0F);
		FrontLegL2.cubeList.add(new ModelBox(FrontLegL2, 77, 30, -2.0F, -1.0F, -1.0F, 4, 2, 2, 0.0F, false));
		FrontLegL2.cubeList.add(new ModelBox(FrontLegL2, 68, 24, 0.5F, 7.5F, -4.0F, 4, 2, 4, 0.0F, false));

		cube_r57 = new ModelRenderer(this);
		cube_r57.setRotationPoint(-4.0F, 0.0F, 2.0F);
		FrontLegL2.addChild(cube_r57);
		setRotationAngle(cube_r57, 0.3491F, 0.0F, 0.0F);
		cube_r57.cubeList.add(new ModelBox(cube_r57, 74, 47, 4.0F, 6.0F, -5.0F, 5, 2, 2, 0.0F, false));

		cube_r58 = new ModelRenderer(this);
		cube_r58.setRotationPoint(-4.0F, 0.0F, 2.0F);
		FrontLegL2.addChild(cube_r58);
		setRotationAngle(cube_r58, -0.2182F, 0.0F, 0.0F);
		cube_r58.cubeList.add(new ModelBox(cube_r58, 73, 6, 4.5F, 3.0F, -1.0F, 4, 3, 3, 0.0F, false));

		cube_r59 = new ModelRenderer(this);
		cube_r59.setRotationPoint(-4.0F, 0.0F, 2.0F);
		FrontLegL2.addChild(cube_r59);
		setRotationAngle(cube_r59, -0.4363F, 0.0F, 0.0F);
		cube_r59.cubeList.add(new ModelBox(cube_r59, 38, 78, 5.0F, 5.0F, 0.0F, 3, 4, 2, 0.0F, false));

		cube_r60 = new ModelRenderer(this);
		cube_r60.setRotationPoint(-4.0F, 0.0F, 0.0F);
		FrontLegL2.addChild(cube_r60);
		setRotationAngle(cube_r60, 0.2054F, 0.0741F, -0.3414F);
		cube_r60.cubeList.add(new ModelBox(cube_r60, 49, 0, 8.5F, -1.0F, -1.5F, 11, 1, 5, 0.0F, false));

		cube_r61 = new ModelRenderer(this);
		cube_r61.setRotationPoint(-4.0F, 0.0F, 0.0F);
		FrontLegL2.addChild(cube_r61);
		setRotationAngle(cube_r61, 0.2182F, 0.0F, 0.0F);
		cube_r61.cubeList.add(new ModelBox(cube_r61, 68, 30, 6.5F, -5.0F, -2.5F, 2, 2, 5, 0.0F, false));
		cube_r61.cubeList.add(new ModelBox(cube_r61, 58, 57, 5.5F, -3.0F, -2.5F, 3, 4, 5, 0.0F, false));
		cube_r61.cubeList.add(new ModelBox(cube_r61, 0, 67, 5.0F, -2.0F, -2.0F, 3, 6, 4, 0.0F, false));

		BackLegL2 = new ModelRenderer(this);
		BackLegL2.setRotationPoint(4.0F, 14.0F, 9.0F);
		BackLegL2.cubeList.add(new ModelBox(BackLegL2, 77, 30, -2.0F, -1.0F, -1.0F, 4, 2, 2, 0.0F, false));
		BackLegL2.cubeList.add(new ModelBox(BackLegL2, 68, 24, 0.5F, 7.5F, -4.0F, 4, 2, 4, 0.0F, false));
		BackLegL2.cubeList.add(new ModelBox(BackLegL2, 40, 72, 1.5F, -3.0F, -2.0F, 2, 2, 4, 0.0F, false));

		cube_r62 = new ModelRenderer(this);
		cube_r62.setRotationPoint(-4.0F, 0.0F, 2.0F);
		BackLegL2.addChild(cube_r62);
		setRotationAngle(cube_r62, 0.3491F, 0.0F, 0.0F);
		cube_r62.cubeList.add(new ModelBox(cube_r62, 74, 47, 4.0F, 6.0F, -5.0F, 5, 2, 2, 0.0F, false));

		cube_r63 = new ModelRenderer(this);
		cube_r63.setRotationPoint(-4.0F, 0.0F, 2.0F);
		BackLegL2.addChild(cube_r63);
		setRotationAngle(cube_r63, -0.2182F, 0.0F, 0.0F);
		cube_r63.cubeList.add(new ModelBox(cube_r63, 73, 6, 4.5F, 3.0F, -1.0F, 4, 3, 3, 0.0F, false));

		cube_r64 = new ModelRenderer(this);
		cube_r64.setRotationPoint(-4.0F, 0.0F, 2.0F);
		BackLegL2.addChild(cube_r64);
		setRotationAngle(cube_r64, -0.4363F, 0.0F, 0.0F);
		cube_r64.cubeList.add(new ModelBox(cube_r64, 38, 78, 5.0F, 5.0F, 0.0F, 3, 4, 2, 0.0F, false));

		cube_r65 = new ModelRenderer(this);
		cube_r65.setRotationPoint(-4.0F, 0.0F, 0.0F);
		BackLegL2.addChild(cube_r65);
		setRotationAngle(cube_r65, 0.2182F, 0.0F, 0.0F);
		cube_r65.cubeList.add(new ModelBox(cube_r65, 47, 53, 5.5F, -1.5F, -2.5F, 3, 4, 5, 0.0F, false));
		cube_r65.cubeList.add(new ModelBox(cube_r65, 0, 67, 5.0F, -2.0F, -2.0F, 3, 6, 4, 0.0F, false));

		BackLegR2 = new ModelRenderer(this);
		BackLegR2.setRotationPoint(-5.0F, 14.0F, 9.0F);
		BackLegR2.cubeList.add(new ModelBox(BackLegR2, 77, 30, -1.0F, -1.0F, -1.0F, 4, 2, 2, 0.0F, false));
		BackLegR2.cubeList.add(new ModelBox(BackLegR2, 0, 9, -4.5F, 7.5F, -4.0F, 4, 2, 4, 0.0F, false));
		BackLegR2.cubeList.add(new ModelBox(BackLegR2, 40, 72, -3.5F, -3.0F, -2.0F, 2, 2, 4, 0.0F, false));

		cube_r66 = new ModelRenderer(this);
		cube_r66.setRotationPoint(-9.0F, 0.0F, 2.0F);
		BackLegR2.addChild(cube_r66);
		setRotationAngle(cube_r66, 0.3491F, 0.0F, 0.0F);
		cube_r66.cubeList.add(new ModelBox(cube_r66, 31, 10, 4.0F, 6.0F, -5.0F, 5, 2, 2, 0.0F, false));

		cube_r67 = new ModelRenderer(this);
		cube_r67.setRotationPoint(-9.0F, 0.0F, 2.0F);
		BackLegR2.addChild(cube_r67);
		setRotationAngle(cube_r67, -0.2182F, 0.0F, 0.0F);
		cube_r67.cubeList.add(new ModelBox(cube_r67, 68, 66, 4.5F, 3.0F, -1.0F, 4, 3, 3, 0.0F, false));

		cube_r68 = new ModelRenderer(this);
		cube_r68.setRotationPoint(-9.0F, 0.0F, 2.0F);
		BackLegR2.addChild(cube_r68);
		setRotationAngle(cube_r68, -0.4363F, 0.0F, 0.0F);
		cube_r68.cubeList.add(new ModelBox(cube_r68, 50, 76, 5.0F, 5.0F, 0.0F, 3, 4, 2, 0.0F, false));

		cube_r69 = new ModelRenderer(this);
		cube_r69.setRotationPoint(-9.0F, 0.0F, 0.0F);
		BackLegR2.addChild(cube_r69);
		setRotationAngle(cube_r69, 0.2182F, 0.0F, 0.0F);
		cube_r69.cubeList.add(new ModelBox(cube_r69, 31, 52, 4.5F, -1.5F, -2.5F, 3, 4, 5, 0.0F, false));
		cube_r69.cubeList.add(new ModelBox(cube_r69, 31, 0, 5.0F, -2.0F, -2.0F, 3, 6, 4, 0.0F, false));

		FrontLegR2 = new ModelRenderer(this);
		FrontLegR2.setRotationPoint(-5.0F, 14.0F, -7.0F);
		FrontLegR2.cubeList.add(new ModelBox(FrontLegR2, 77, 30, -1.0F, -1.0F, -1.0F, 4, 2, 2, 0.0F, false));
		FrontLegR2.cubeList.add(new ModelBox(FrontLegR2, 0, 9, -4.5F, 7.5F, -4.0F, 4, 2, 4, 0.0F, false));

		cube_r70 = new ModelRenderer(this);
		cube_r70.setRotationPoint(-9.0F, 0.0F, 2.0F);
		FrontLegR2.addChild(cube_r70);
		setRotationAngle(cube_r70, 0.3491F, 0.0F, 0.0F);
		cube_r70.cubeList.add(new ModelBox(cube_r70, 31, 10, 4.0F, 6.0F, -5.0F, 5, 2, 2, 0.0F, false));

		cube_r71 = new ModelRenderer(this);
		cube_r71.setRotationPoint(-9.0F, 0.0F, 2.0F);
		FrontLegR2.addChild(cube_r71);
		setRotationAngle(cube_r71, -0.2182F, 0.0F, 0.0F);
		cube_r71.cubeList.add(new ModelBox(cube_r71, 68, 66, 4.5F, 3.0F, -1.0F, 4, 3, 3, 0.0F, false));

		cube_r72 = new ModelRenderer(this);
		cube_r72.setRotationPoint(-9.0F, 0.0F, 2.0F);
		FrontLegR2.addChild(cube_r72);
		setRotationAngle(cube_r72, -0.4363F, 0.0F, 0.0F);
		cube_r72.cubeList.add(new ModelBox(cube_r72, 50, 76, 5.0F, 5.0F, 0.0F, 3, 4, 2, 0.0F, false));

		cube_r73 = new ModelRenderer(this);
		cube_r73.setRotationPoint(-9.0F, 0.0F, 0.0F);
		FrontLegR2.addChild(cube_r73);
		setRotationAngle(cube_r73, 0.249F, -0.0741F, 0.3851F);
		cube_r73.cubeList.add(new ModelBox(cube_r73, 49, 0, -7.5F, -5.0F, -1.5F, 11, 1, 5, 0.0F, true));

		cube_r74 = new ModelRenderer(this);
		cube_r74.setRotationPoint(-9.0F, 0.0F, 0.0F);
		FrontLegR2.addChild(cube_r74);
		setRotationAngle(cube_r74, 0.2182F, 0.0F, 0.0F);
		cube_r74.cubeList.add(new ModelBox(cube_r74, 30, 67, 4.5F, -5.0F, -2.5F, 2, 2, 5, 0.0F, false));
		cube_r74.cubeList.add(new ModelBox(cube_r74, 0, 0, 4.5F, -3.0F, -2.5F, 3, 4, 5, 0.0F, false));
		cube_r74.cubeList.add(new ModelBox(cube_r74, 31, 0, 5.0F, -2.0F, -2.0F, 3, 6, 4, 0.0F, false));
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
										if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == ReiwaRiderItems.raise_riser_belt_kyuun){	
												double height=2;
		Minecraft.getMinecraft().renderEngine.bindTexture(new ResourceLocation(Refercence.MODID+":textures/armor/kyuun.png"));
													GlStateManager.pushMatrix();
												GlStateManager.translate(-0.05, -1.45, 1.4);
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