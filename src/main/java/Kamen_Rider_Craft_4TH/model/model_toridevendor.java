
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

public class model_toridevendor extends model_belt_plus
{
	//fields
	ModelRenderer Shape1;
	ModelRenderer Shape2;
	ModelRenderer Shape3;
	ModelRenderer Shape4;
	ModelRenderer Shape5;
	ModelRenderer Shape6;
	ModelRenderer Shape7;
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
	ModelRenderer Shape35;
	ModelRenderer Shape34;
	ModelRenderer Shape36;
	ModelRenderer Shape37;
	ModelRenderer Shape32;
	ModelRenderer Shape33;
	ModelRenderer Shape38;
	ModelRenderer Shape39;
	ModelRenderer Shape40;
	ModelRenderer Shape41;
	ModelRenderer Shape42;
	ModelRenderer Shape43;
	ModelRenderer Shape44;
	ModelRenderer Shape45;
	ModelRenderer Shape46;
	ModelRenderer Shape47;
	ModelRenderer Shape49;
	ModelRenderer Shape50;
	ModelRenderer Shape51;
	ModelRenderer Shape52;
	ModelRenderer Shape53;
	ModelRenderer Shape54;
	ModelRenderer Shape55;
	ModelRenderer Shape56;
	ModelRenderer Shape57;
	ModelRenderer Shape58;
	ModelRenderer Shape59;
	ModelRenderer Shape60;
	ModelRenderer Shape61;
	ModelRenderer Shape62;
	ModelRenderer Shape63;
	ModelRenderer Shape64;
	ModelRenderer Shape65;
	ModelRenderer Shape66;
	ModelRenderer Shape67;
	ModelRenderer Shape68;
	ModelRenderer Shape69;
	ModelRenderer Shape70;
	ModelRenderer Shape71;
	ModelRenderer Shape72;
	ModelRenderer Shape73;
	ModelRenderer Shape74;
	ModelRenderer Shape75;
	ModelRenderer Shape76;
	ModelRenderer Shape77;
	ModelRenderer Shape78;
	ModelRenderer Shape79;
	ModelRenderer Shape80;
	ModelRenderer Shape81;
	ModelRenderer Shape82;
	ModelRenderer Shape83;
	ModelRenderer Shape84;
	ModelRenderer Shape85;
	ModelRenderer Shape86;
	ModelRenderer Shape87;
	ModelRenderer Shape88;
	ModelRenderer Shape89;
	ModelRenderer Shape90;
	ModelRenderer Shape91;
	ModelRenderer Shape92;
	ModelRenderer Shape93;
	ModelRenderer Shape94;

	public model_toridevendor()
	{
		textureWidth = 64;
		textureHeight = 128;

		Shape1 = new ModelRenderer(this, 40, 57);
		Shape1.addBox(0F, 0F, -2F, 11, 1, 1);
		Shape1.setRotationPoint(-4F, 4.4F, -5.5F);
		Shape1.setTextureSize(64, 128);
		Shape1.mirror = true;
		setRotation(Shape1, 0F, 0F, 0F);

		Shape2 = new ModelRenderer(this, 16, 17);
		Shape2.addBox(0F, 0F, 0F, 7, 5, 8);
		Shape2.setRotationPoint(-2F, 5F, -8F);
		Shape2.setTextureSize(64, 128);
		Shape2.mirror = true;
		setRotation(Shape2, -0.2367038F, 0F, 0F);

		Shape3 = new ModelRenderer(this, 0, 0);
		Shape3.addBox(0F, -1F, -0.5F, 4, 9, 6);
		Shape3.setRotationPoint(-0.5F, 11.5F, -7F);
		Shape3.setTextureSize(64, 128);
		Shape3.mirror = true;
		setRotation(Shape3, 0.3374844F, 0F, 0F);


		Shape4 = new ModelRenderer(this, 0, 38);
		Shape4.mirror = true;
		Shape4.addBox(0F, -1F, 0F, 1, 4, 8);
		Shape4.setRotationPoint(6F, 15F, 9F);
		Shape4.setTextureSize(64, 128);
		setRotation(Shape4, 0F, 3.141593F, 0F);

		Shape5 = new ModelRenderer(this, 38, 69);
		Shape5.addBox(0F, 0F, 1F, 5, 5, 8);
		Shape5.setRotationPoint(-1F, 10F, -3F);
		Shape5.setTextureSize(64, 128);
		Shape5.mirror = true;
		setRotation(Shape5, 0.1115358F, 0F, 0F);

		Shape6 = new ModelRenderer(this, 23, 0);
		Shape6.addBox(0F, 0F, 0F, 3, 8, 7);
		Shape6.setRotationPoint(0F, 11F, -3F);
		Shape6.setTextureSize(64, 128);
		Shape6.mirror = true;
		setRotation(Shape6, 0F, 0F, 0F);


		Shape7 = new ModelRenderer(this, 34, 23);
		Shape7.mirror = true;
		Shape7.addBox(0F, 0F, 0F, 1, 2, 14);
		Shape7.setRotationPoint(3.5F, 17F, -15F);
		Shape7.setTextureSize(64, 128);
		Shape7.mirror = true;
		setRotation(Shape7, 1.056684F, 0F, 0F);

		Shape8 = new ModelRenderer(this, 34, 23);
		Shape8.addBox(0F, 0F, 0F, 1, 2, 14);
		Shape8.setRotationPoint(-1.5F, 17F, -15F);
		Shape8.setTextureSize(64, 128);
		Shape8.mirror = true;
		setRotation(Shape8, 1.056684F, 0F, 0F);

		Shape9 = new ModelRenderer(this, 24, 83);
		Shape9.mirror = true;
		Shape9.addBox(0F, 4F, -2.5F, 5, 2, 5);
		Shape9.setRotationPoint(-3.5F, 16.5F, -13.5F);
		Shape9.setTextureSize(64, 128);
		setRotation(Shape9, 1.570796F, 0F, 0F);

		Shape10 = new ModelRenderer(this, 24, 83);
		Shape10.mirror = true;
		Shape10.addBox(0F, 4F, -2.5F, 5, 2, 5);
		Shape10.setRotationPoint(-3.5F, 16.5F, -13.5F);
		Shape10.setTextureSize(64, 128);
		setRotation(Shape10, -3.926991F, 0F, 0F);

		Shape11 = new ModelRenderer(this, 46, 7);
		Shape11.addBox(-1F, -4F, -4F, 1, 8, 8);
		Shape11.setRotationPoint(-3F, 16.5F, 10F);
		Shape11.setTextureSize(64, 128);
		Shape11.mirror = true;
		setRotation(Shape11, 0F, 0F, 0F);

		Shape12 = new ModelRenderer(this, 27, 30);
		Shape12.mirror = true;
		Shape12.addBox(0F, 4F, -2.4F, 3, 2, 5);
		Shape12.setRotationPoint(-3.5F, 16.5F, -13.5F);
		Shape12.setTextureSize(64, 128);
		setRotation(Shape12, 3.141593F, 0F, 0F);

		Shape13 = new ModelRenderer(this, 19, 121);
		Shape13.addBox(0F, 4F, -2.5F, 3, 2, 5);
		Shape13.setRotationPoint(6.5F, 16.5F, -21.5F);
		Shape13.setTextureSize(64, 128);
		Shape13.mirror = true;
		setRotation(Shape13, -0.0882992F, 0F, 0F);

		Shape14 = new ModelRenderer(this, 42, 0);
		Shape14.addBox(0F, 0F, 0F, 1, 3, 3);
		Shape14.setRotationPoint(2.5F, 14.83333F, 8.5F);
		Shape14.setTextureSize(64, 128);
		Shape14.mirror = true;
		setRotation(Shape14, 0F, 0F, 0F);

		Shape15 = new ModelRenderer(this, 24, 83);
		Shape15.mirror = true;
		Shape15.addBox(0F, 4F, -2.5F, 5, 2, 5);
		Shape15.setRotationPoint(-3.5F, 16.5F, -13.5F);
		Shape15.setTextureSize(64, 128);
		setRotation(Shape15, -0.7853982F, 0F, 0F);

		Shape16 = new ModelRenderer(this, 19, 121);
		Shape16.addBox(0F, 4F, -2.5F, 3, 2, 5);
		Shape16.setRotationPoint(6.5F, 16.5F, -21.5F);
		Shape16.setTextureSize(64, 128);
		Shape16.mirror = true;
		setRotation(Shape16, 0.697099F, 0F, 0F);

		Shape17 = new ModelRenderer(this, 24, 83);
		Shape17.mirror = true;
		Shape17.addBox(0F, 4F, -2.5F, 5, 2, 5);
		Shape17.setRotationPoint(-3.5F, 16.5F, -13.5F);
		Shape17.setTextureSize(64, 128);
		setRotation(Shape17, 0F, 0F, 0F);

		Shape18 = new ModelRenderer(this, 24, 83);
		Shape18.mirror = true;
		Shape18.addBox(0F, 4F, -2.5F, 5, 2, 5);
		Shape18.setRotationPoint(-3.5F, 16.5F, -13.5F);
		Shape18.setTextureSize(64, 128);
		setRotation(Shape18, 0.7853982F, 0F, 0F);

		Shape19 = new ModelRenderer(this, 0, 15);
		Shape19.addBox(0F, 0F, 0F, 3, 2, 2);
		Shape19.setRotationPoint(-5F, 15.3F, 9F);
		Shape19.setTextureSize(64, 128);
		Shape19.mirror = true;
		setRotation(Shape19, 0F, 0F, 0F);

		Shape20 = new ModelRenderer(this, 34, 40);
		Shape20.addBox(-1F, 0F, 0F, 5, 4, 10);
		Shape20.setRotationPoint(0F, 6.5F, 6F);
		Shape20.setTextureSize(64, 128);
		Shape20.mirror = true;
		setRotation(Shape20, -0.0356295F, 0F, 0F);

		Shape21 = new ModelRenderer(this, 40, 60);
		Shape21.addBox(0F, 0F, 0F, 4, 1, 8);
		Shape21.setRotationPoint(-0.5F, 9F, -2F);
		Shape21.setTextureSize(64, 128);
		Shape21.mirror = true;
		setRotation(Shape21, 0.1115358F, 0F, 0F);

		Shape22 = new ModelRenderer(this, 0, 51);
		Shape22.mirror = true;
		Shape22.addBox(0F, -2F, -2F, 3, 7, 2);
		Shape22.setRotationPoint(3F, 6.2F, -8F);
		Shape22.setTextureSize(64, 128);
		setRotation(Shape22, -1.000001F, 0F, 0F);

		Shape23 = new ModelRenderer(this, 21, 63);
		Shape23.mirror = true;
		Shape23.addBox(0F, -1F, -1.5F, 3, 6, 3);
		Shape23.setRotationPoint(8F, 11F, 5F);
		Shape23.setTextureSize(64, 128);
		setRotation(Shape23, 0.3374844F, 3.141593F, 0F);

		Shape24 = new ModelRenderer(this, 20, 40);
		Shape24.mirror = true;
		Shape24.addBox(0F, -1F, -0.5F, 3, 8, 3);
		Shape24.setRotationPoint(8F, 12F, 11F);
		Shape24.setTextureSize(64, 128);
		setRotation(Shape24, 1.570668F, 3.141593F, 0F);

		Shape25 = new ModelRenderer(this, 0, 20);
		Shape25.addBox(0F, -1F, 0F, 2, 5, 11);
		Shape25.setRotationPoint(3F, 13F, 4F);
		Shape25.setTextureSize(64, 128);
		Shape25.mirror = true;
		setRotation(Shape25, 0F, 0F, 0F);

		Shape26 = new ModelRenderer(this, 0, 20);
		Shape26.mirror = true;
		Shape26.addBox(0F, -1F, 0F, 2, 5, 11);
		Shape26.setRotationPoint(-2F, 13F, 4F);
		Shape26.setTextureSize(64, 128);
		setRotation(Shape26, 0F, 0F, 0F);

		Shape27 = new ModelRenderer(this, 0, 51);
		Shape27.addBox(0F, -2F, -2F, 3, 7, 2);
		Shape27.setRotationPoint(-3F, 6.2F, -8F);
		Shape27.setTextureSize(64, 128);
		Shape27.mirror = true;
		setRotation(Shape27, -1.000001F, 0F, 0F);

		Shape28 = new ModelRenderer(this, 0, 38);
		Shape28.addBox(0F, -1F, 0F, 1, 4, 8);
		Shape28.setRotationPoint(-2F, 15F, 9F);
		Shape28.setTextureSize(64, 128);
		Shape28.mirror = true;
		setRotation(Shape28, 0F, 3.141593F, 0F);

		Shape29 = new ModelRenderer(this, 20, 40);
		Shape29.addBox(0F, -1F, -0.5F, 3, 8, 3);
		Shape29.setRotationPoint(-2F, 12F, 11F);
		Shape29.setTextureSize(64, 128);
		Shape29.mirror = true;
		setRotation(Shape29, 1.570668F, 3.141593F, 0F);

		Shape30 = new ModelRenderer(this, 21, 63);
		Shape30.addBox(0F, -1F, -1.5F, 3, 6, 3);
		Shape30.setRotationPoint(-2F, 11F, 5F);
		Shape30.setTextureSize(64, 128);
		Shape30.mirror = true;
		setRotation(Shape30, 0.3374844F, 3.141593F, 0F);

		Shape31 = new ModelRenderer(this, 0, 78);
		Shape31.addBox(0F, -4F, -4F, 3, 8, 8);
		Shape31.setRotationPoint(-3.4F, 16.5F, -13.5F);
		Shape31.setTextureSize(64, 128);
		Shape31.mirror = true;
		setRotation(Shape31, 0F, 0F, 0F);

		Shape35 = new ModelRenderer(this, 50, 0);
		Shape35.addBox(-1F, 4F, -2.5F, 2, 2, 5);
		Shape35.setRotationPoint(1.5F, 16.5F, 10F);
		Shape35.setTextureSize(64, 128);
		Shape35.mirror = true;
		setRotation(Shape35, -1.570796F, 0F, 0F);

		Shape34 = new ModelRenderer(this, 51, 7);
		Shape34.mirror = true;
		Shape34.addBox(0F, 4F, -2.5F, 1, 2, 5);
		Shape34.setRotationPoint(-7.51F, 16.5F, -13.5F);
		Shape34.setTextureSize(64, 128);
		setRotation(Shape34, -0.7853982F, 0F, 0F);

		Shape36 = new ModelRenderer(this, 18, 52);
		Shape36.mirror = true;
		Shape36.addBox(0F, 4F, -2.5F, 4, 2, 5);
		Shape36.setRotationPoint(-7.5F, 16.5F, -13.5F);
		Shape36.setTextureSize(64, 128);
		setRotation(Shape36, 0F, 0F, 0F);

		Shape37 = new ModelRenderer(this, 50, 0);
		Shape37.addBox(-1F, 4F, -2.5F, 2, 2, 5);
		Shape37.setRotationPoint(1.5F, 16.5F, 10F);
		Shape37.setTextureSize(64, 128);
		Shape37.mirror = true;
		setRotation(Shape37, 0.7853982F, 0F, 0F);

		Shape32 = new ModelRenderer(this, 50, 0);
		Shape32.addBox(-1F, 4F, -2.5F, 2, 2, 5);
		Shape32.setRotationPoint(1.5F, 16.5F, 10F);
		Shape32.setTextureSize(64, 128);
		Shape32.mirror = true;
		setRotation(Shape32, -2.356194F, 0F, 0F);

		Shape33 = new ModelRenderer(this, 51, 7);
		Shape33.mirror = true;
		Shape33.addBox(0F, 4F, -2.4F, 1, 2, 5);
		Shape33.setRotationPoint(-7.51F, 16.5F, -13.5F);
		Shape33.setTextureSize(64, 128);
		setRotation(Shape33, 3.141593F, 0F, 0F);

		Shape38 = new ModelRenderer(this, 50, 0);
		Shape38.addBox(-1F, 4F, -2.5F, 2, 2, 5);
		Shape38.setRotationPoint(1.5F, 16.5F, 10F);
		Shape38.setTextureSize(64, 128);
		Shape38.mirror = true;
		setRotation(Shape38, -3.926991F, 0F, 0F);

		Shape39 = new ModelRenderer(this, 50, 0);
		Shape39.addBox(-1F, 4F, -2.5F, 2, 2, 5);
		Shape39.setRotationPoint(1.5F, 16.5F, 10F);
		Shape39.setTextureSize(64, 128);
		Shape39.mirror = true;
		setRotation(Shape39, 1.570796F, 0F, 0F);

		Shape40 = new ModelRenderer(this, 0, 15);
		Shape40.addBox(0F, 0F, 0F, 3, 2, 2);
		Shape40.setRotationPoint(5F, 15.3F, 9F);
		Shape40.setTextureSize(64, 128);
		Shape40.mirror = true;
		setRotation(Shape40, 0F, 0F, 0F);

		Shape41 = new ModelRenderer(this, 46, 7);
		Shape41.addBox(-1F, -4F, -4F, 1, 8, 8);
		Shape41.setRotationPoint(2F, 16.5F, 10F);
		Shape41.setTextureSize(64, 128);
		Shape41.mirror = true;
		setRotation(Shape41, 0F, 0F, 0F);

		Shape42 = new ModelRenderer(this, 51, 7);
		Shape42.mirror = true;
		Shape42.addBox(0F, 4F, -2.5F, 1, 2, 5);
		Shape42.setRotationPoint(-7.51F, 16.5F, -13.5F);
		Shape42.setTextureSize(64, 128);
		setRotation(Shape42, -1.570796F, 0F, 0F);
		Shape42.mirror = false;

		Shape43 = new ModelRenderer(this, 50, 0);
		Shape43.addBox(-1F, 4F, -2.5F, 2, 2, 5);
		Shape43.setRotationPoint(1.5F, 16.5F, 10F);
		Shape43.setTextureSize(64, 128);
		Shape43.mirror = true;
		setRotation(Shape43, -0.7853982F, 0F, 0F);

		Shape44 = new ModelRenderer(this, 50, 0);
		Shape44.addBox(-1F, 4F, -2.5F, 2, 2, 5);
		Shape44.setRotationPoint(1.5F, 16.5F, 10F);
		Shape44.setTextureSize(64, 128);
		Shape44.mirror = true;
		setRotation(Shape44, 0F, 0F, 0F);

		Shape45 = new ModelRenderer(this, 18, 52);
		Shape45.mirror = true;
		Shape45.addBox(0F, 4F, -2.5F, 4, 2, 5);
		Shape45.setRotationPoint(-7.49F, 16.5F, -13.5F);
		Shape45.setTextureSize(64, 128);
		setRotation(Shape45, 0.7853982F, 0F, 0F);
		Shape45.mirror = false;

		Shape46 = new ModelRenderer(this, 51, 7);
		Shape46.mirror = true;
		Shape46.addBox(0F, 4F, -2.5F, 1, 2, 5);
		Shape46.setRotationPoint(-7.51F, 16.5F, -13.5F);
		Shape46.setTextureSize(64, 128);
		setRotation(Shape46, -2.356194F, 0F, 0F);

		Shape47 = new ModelRenderer(this, 50, 0);
		Shape47.addBox(-1F, 4F, -2.5F, 2, 2, 5);
		Shape47.setRotationPoint(1.5F, 16.5F, 10F);
		Shape47.setTextureSize(64, 128);
		Shape47.mirror = true;
		setRotation(Shape47, 3.141593F, 0F, 0F);

		Shape49 = new ModelRenderer(this, 18, 52);

		Shape49.mirror = true;
		Shape49.addBox(0F, 4F, -2.5F, 4, 2, 5);
		Shape49.setRotationPoint(-7.49F, 16.5F, -13.5F);
		Shape49.setTextureSize(64, 128);
		setRotation(Shape49, -3.926991F, 0F, 0F);

		Shape50 = new ModelRenderer(this, 18, 75);
		Shape50.mirror = true;
		Shape50.addBox(0F, 4F, -2.5F, 4, 2, 5);
		Shape50.setRotationPoint(-7.5F, 16.5F, -13.5F);
		Shape50.setTextureSize(64, 128);
		setRotation(Shape50, 1.570796F, 0F, 0F);
		Shape50.mirror = false;

		Shape51 = new ModelRenderer(this, 0, 15);
		Shape51.addBox(0F, 0F, 0F, 3, 2, 2);
		Shape51.setRotationPoint(0F, 15.3F, 9F);
		Shape51.setTextureSize(64, 128);
		Shape51.mirror = true;
		setRotation(Shape51, 0F, 0F, 0F);

		Shape52 = new ModelRenderer(this, 0, 113);
		Shape52.addBox(-1F, 0F, -5F, 3, 2, 4);
		Shape52.setRotationPoint(1F, 7F, -10F);
		Shape52.setTextureSize(64, 128);
		Shape52.mirror = true;
		setRotation(Shape52, 0.669215F, 0F, 0F);

		Shape53 = new ModelRenderer(this, 0, 119);
		Shape53.addBox(-1F, 0F, -5F, 3, 3, 6);
		Shape53.setRotationPoint(1F, 5F, -11F);
		Shape53.setTextureSize(64, 128);
		Shape53.mirror = true;
		setRotation(Shape53, 0.2602503F, 0F, 0F);

		Shape54 = new ModelRenderer(this, 50, 0);
		Shape54.addBox(5F, 4F, -2.5F, 2, 2, 5);
		Shape54.setRotationPoint(0.5F, 16.5F, 10F);
		Shape54.setTextureSize(64, 128);
		Shape54.mirror = true;
		setRotation(Shape54, -2.356194F, 0F, 0F);

		Shape55 = new ModelRenderer(this, 50, 0);
		Shape55.addBox(5F, 4F, -2.5F, 2, 2, 5);
		Shape55.setRotationPoint(0.5F, 16.5F, 10F);
		Shape55.setTextureSize(64, 128);
		Shape55.mirror = true;
		setRotation(Shape55, 3.141593F, 0F, 0F);

		Shape56 = new ModelRenderer(this, 50, 0);
		Shape56.addBox(5F, 4F, -2.5F, 2, 2, 5);
		Shape56.setRotationPoint(0.5F, 16.5F, 10F);
		Shape56.setTextureSize(64, 128);
		Shape56.mirror = true;
		setRotation(Shape56, -3.926991F, 0F, 0F);

		Shape57 = new ModelRenderer(this, 50, 0);
		Shape57.addBox(5F, 4F, -2.5F, 2, 2, 5);
		Shape57.setRotationPoint(0.5F, 16.5F, 10F);
		Shape57.setTextureSize(64, 128);
		Shape57.mirror = true;
		setRotation(Shape57, 1.570796F, 0F, 0F);

		Shape58 = new ModelRenderer(this, 50, 0);
		Shape58.addBox(5F, 4F, -2.5F, 2, 2, 5);
		Shape58.setRotationPoint(0.5F, 16.5F, 10F);
		Shape58.setTextureSize(64, 128);
		Shape58.mirror = true;
		setRotation(Shape58, 0.7853982F, 0F, 0F);

		Shape59 = new ModelRenderer(this, 50, 0);
		Shape59.addBox(5F, 4F, -2.5F, 2, 2, 5);
		Shape59.setRotationPoint(0.5F, 16.5F, 10F);
		Shape59.setTextureSize(64, 128);
		Shape59.mirror = true;
		setRotation(Shape59, 0F, 0F, 0F);

		Shape60 = new ModelRenderer(this, 50, 0);
		Shape60.addBox(5F, 4F, -2.5F, 2, 2, 5);
		Shape60.setRotationPoint(0.5F, 16.5F, 10F);
		Shape60.setTextureSize(64, 128);
		Shape60.mirror = true;
		setRotation(Shape60, -0.7853982F, 0F, 0F);

		Shape61 = new ModelRenderer(this, 50, 0);
		Shape61.addBox(5F, 4F, -2.5F, 2, 2, 5);
		Shape61.setRotationPoint(0.5F, 16.5F, 10F);
		Shape61.setTextureSize(64, 128);
		Shape61.mirror = true;
		setRotation(Shape61, -1.570796F, 0F, 0F);

		Shape62 = new ModelRenderer(this, 50, 0);
		Shape62.addBox(-1F, 4F, -2.5F, 2, 2, 5);
		Shape62.setRotationPoint(-3.5F, 16.5F, 10F);
		Shape62.setTextureSize(64, 128);
		Shape62.mirror = true;
		setRotation(Shape62, 3.141593F, 0F, 0F);

		Shape63 = new ModelRenderer(this, 50, 0);
		Shape63.addBox(-1F, 4F, -2.5F, 2, 2, 5);
		Shape63.setRotationPoint(-3.5F, 16.5F, 10F);
		Shape63.setTextureSize(64, 128);
		Shape63.mirror = true;
		setRotation(Shape63, -3.926991F, 0F, 0F);

		Shape64 = new ModelRenderer(this, 50, 0);
		Shape64.addBox(-1F, 4F, -2.5F, 2, 2, 5);
		Shape64.setRotationPoint(-3.5F, 16.5F, 10F);
		Shape64.setTextureSize(64, 128);
		Shape64.mirror = true;
		setRotation(Shape64, 1.570796F, 0F, 0F);

		Shape65 = new ModelRenderer(this, 50, 0);
		Shape65.addBox(-1F, 4F, -2.5F, 2, 2, 5);
		Shape65.setRotationPoint(-3.5F, 16.5F, 10F);
		Shape65.setTextureSize(64, 128);
		Shape65.mirror = true;
		setRotation(Shape65, 0.7853982F, 0F, 0F);

		Shape66 = new ModelRenderer(this, 50, 0);
		Shape66.addBox(-1F, 4F, -2.5F, 2, 2, 5);
		Shape66.setRotationPoint(-3.5F, 16.5F, 10F);
		Shape66.setTextureSize(64, 128);
		Shape66.mirror = true;
		setRotation(Shape66, 0F, 0F, 0F);

		Shape67 = new ModelRenderer(this, 50, 0);
		Shape67.addBox(-1F, 4F, -2.5F, 2, 2, 5);
		Shape67.setRotationPoint(-3.5F, 16.5F, 10F);
		Shape67.setTextureSize(64, 128);
		Shape67.mirror = true;
		setRotation(Shape67, -0.7853982F, 0F, 0F);

		Shape68 = new ModelRenderer(this, 50, 0);
		Shape68.addBox(-1F, 4F, -2.5F, 2, 2, 5);
		Shape68.setRotationPoint(-3.5F, 16.5F, 10F);
		Shape68.setTextureSize(64, 128);
		Shape68.mirror = true;
		setRotation(Shape68, -1.570796F, 0F, 0F);

		Shape69 = new ModelRenderer(this, 50, 0);
		Shape69.addBox(-1F, 4F, -2.5F, 2, 2, 5);
		Shape69.setRotationPoint(-3.5F, 16.5F, 10F);
		Shape69.setTextureSize(64, 128);
		Shape69.mirror = true;
		setRotation(Shape69, -2.356194F, 0F, 0F);

		Shape70 = new ModelRenderer(this, 24, 83);
		Shape70.addBox(3F, 4F, -2.5F, 5, 2, 5);
		Shape70.setRotationPoint(-1.5F, 16.5F, -13.5F);
		Shape70.setTextureSize(64, 128);
		Shape70.mirror = true;
		setRotation(Shape70, -3.926991F, 0F, 0F);

		Shape71 = new ModelRenderer(this, 24, 83);
		Shape71.addBox(3F, 4F, -2.5F, 5, 2, 5);
		Shape71.setRotationPoint(-1.5F, 16.5F, -13.5F);
		Shape71.setTextureSize(64, 128);
		Shape71.mirror = true;
		setRotation(Shape71, 1.570796F, 0F, 0F);

		Shape72 = new ModelRenderer(this, 24, 83);
		Shape72.addBox(3F, 4F, -2.5F, 5, 2, 5);
		Shape72.setRotationPoint(-1.5F, 16.5F, -13.5F);
		Shape72.setTextureSize(64, 128);
		Shape72.mirror = true;
		setRotation(Shape72, 0.7853982F, 0F, 0F);

		Shape73 = new ModelRenderer(this, 24, 83);
		Shape73.addBox(3F, 4F, -2.5F, 5, 2, 5);
		Shape73.setRotationPoint(-1.5F, 16.5F, -13.5F);
		Shape73.setTextureSize(64, 128);
		Shape73.mirror = true;
		setRotation(Shape73, 0F, 0F, 0F);

		Shape74 = new ModelRenderer(this, 24, 83);
		Shape74.addBox(3F, 4F, -2.5F, 5, 2, 5);
		Shape74.setRotationPoint(-1.5F, 16.5F, -13.5F);
		Shape74.setTextureSize(64, 128);
		Shape74.mirror = true;
		setRotation(Shape74, -0.7853982F, 0F, 0F);

		Shape75 = new ModelRenderer(this, 27, 30);
		Shape75.addBox(3F, 4F, -2.4F, 3, 2, 5);
		Shape75.setRotationPoint(0.5F, 16.5F, -13.5F);
		Shape75.setTextureSize(64, 128);
		Shape75.mirror = true;
		setRotation(Shape75, 3.141593F, 0F, 0F);

		Shape76 = new ModelRenderer(this, 27, 30);
		Shape76.addBox(3F, 4F, -2.5F, 3, 2, 5);
		Shape76.setRotationPoint(0.51F, 16.5F, -13.5F);
		Shape76.setTextureSize(64, 128);
		Shape76.mirror = true;
		setRotation(Shape76, -2.356194F, 0F, 0F);

		Shape77 = new ModelRenderer(this, 27, 30);
		Shape77.addBox(3F, 4F, -2.5F, 3, 2, 5);
		Shape77.setRotationPoint(0.5F, 16.5F, -13.5F);
		Shape77.setTextureSize(64, 128);
		Shape77.mirror = true;
		setRotation(Shape77, -1.570796F, 0F, 0F);

		Shape78 = new ModelRenderer(this, 46, 83);
		Shape78.addBox(0F, 0F, 0F, 4, 2, 5);
		Shape78.setRotationPoint(-9F, 18.5F, -19.6F);
		Shape78.setTextureSize(64, 128);
		Shape78.mirror = true;
		setRotation(Shape78, 0F, 0F, -1.570796F);

		Shape79 = new ModelRenderer(this, 18, 75);
		Shape79.addBox(3F, 4F, -2.5F, 4, 2, 5);
		Shape79.setRotationPoint(3.5F, 16.5F, -13.5F);
		Shape79.setTextureSize(64, 128);
		Shape79.mirror = true;
		setRotation(Shape79, 1.570796F, 0F, 0F);

		Shape80 = new ModelRenderer(this, 18, 52);
		Shape80.addBox(3F, 4F, -2.5F, 4, 2, 5);
		Shape80.setRotationPoint(3.49F, 16.5F, -13.5F);
		Shape80.setTextureSize(64, 128);
		Shape80.mirror = true;
		setRotation(Shape80, 0.7853982F, 0F, 0F);

		Shape81 = new ModelRenderer(this, 18, 52);
		Shape81.addBox(3F, 4F, -2.5F, 4, 2, 5);
		Shape81.setRotationPoint(3.5F, 16.5F, -13.5F);
		Shape81.setTextureSize(64, 128);
		Shape81.mirror = true;
		setRotation(Shape81, 0F, 0F, 0F);

		Shape82 = new ModelRenderer(this, 51, 7);
		Shape82.addBox(3F, 4F, -2.5F, 1, 2, 5);
		Shape82.setRotationPoint(6.51F, 16.5F, -13.5F);
		Shape82.setTextureSize(64, 128);
		Shape82.mirror = true;
		setRotation(Shape82, -0.7853982F, 0F, 0F);

		Shape83 = new ModelRenderer(this, 51, 7);
		Shape83.addBox(3F, 4F, -2.4F, 1, 2, 5);
		Shape83.setRotationPoint(6.51F, 16.5F, -13.5F);
		Shape83.setTextureSize(64, 128);
		Shape83.mirror = true;
		setRotation(Shape83, 3.141593F, 0F, 0F);

		Shape84 = new ModelRenderer(this, 51, 7);
		Shape84.addBox(3F, 4F, -2.5F, 1, 2, 5);
		Shape84.setRotationPoint(6.51F, 16.5F, -13.5F);
		Shape84.setTextureSize(64, 128);
		Shape84.mirror = true;
		setRotation(Shape84, -2.356194F, 0F, 0F);

		Shape85 = new ModelRenderer(this, 51, 7);
		Shape85.addBox(3F, 4F, -2.5F, 1, 2, 5);
		Shape85.setRotationPoint(6.51F, 16.5F, -13.5F);
		Shape85.setTextureSize(64, 128);
		Shape85.mirror = true;
		setRotation(Shape85, -1.570796F, 0F, 0F);

		Shape86 = new ModelRenderer(this, 46, 7);
		Shape86.addBox(5F, -4F, -4F, 1, 8, 8);
		Shape86.setRotationPoint(1F, 16.5F, 10F);
		Shape86.setTextureSize(64, 128);
		Shape86.mirror = true;
		setRotation(Shape86, 0F, 0F, 0F);

		Shape87 = new ModelRenderer(this, 0, 78);
		Shape87.addBox(5F, -4F, -4F, 3, 8, 8);
		Shape87.setRotationPoint(-1.6F, 16.5F, -13.5F);
		Shape87.setTextureSize(64, 128);
		Shape87.mirror = true;
		setRotation(Shape87, 0F, 0F, 0F);

		Shape88 = new ModelRenderer(this, 0, 61);
		Shape88.addBox(5F, -4F, -4F, 1, 8, 8);
		Shape88.setRotationPoint(4.6F, 16.5F, -13.5F);
		Shape88.setTextureSize(64, 128);
		Shape88.mirror = true;
		setRotation(Shape88, 0F, 0F, 0F);

		Shape89 = new ModelRenderer(this, 0, 61);
		Shape89.mirror = true;
		Shape89.addBox(0F, -4F, -4F, 1, 8, 8);
		Shape89.setRotationPoint(-7.6F, 16.5F, -13.5F);
		Shape89.setTextureSize(64, 128);
		setRotation(Shape89, 0F, 0F, 0F);

		Shape90 = new ModelRenderer(this, 27, 30);
		Shape90.mirror = true;
		Shape90.addBox(0F, 4F, -2.5F, 3, 2, 5);
		Shape90.setRotationPoint(-3.51F, 16.5F, -13.5F);
		Shape90.setTextureSize(64, 128);
		setRotation(Shape90, -2.356194F, 0F, 0F);

		Shape91 = new ModelRenderer(this, 27, 30);
		Shape91.mirror = true;
		Shape91.addBox(0F, 4F, -2.5F, 3, 2, 5);
		Shape91.setRotationPoint(-3.5F, 16.5F, -13.5F);
		Shape91.setTextureSize(64, 128);
		Shape91.mirror = true;
		setRotation(Shape91, -1.570796F, 0F, 0F);

		Shape92 = new ModelRenderer(this, 19, 121);
		Shape92.addBox(0F, 4F, -2.5F, 3, 2, 5);
		Shape92.setRotationPoint(-6.5F, 16.5F, -21.5F);
		Shape92.setTextureSize(64, 128);
		Shape92.mirror = true;
		setRotation(Shape92, 0.697099F, 0F, 0F);

		Shape93 = new ModelRenderer(this, 19, 121);
		Shape93.addBox(0F, 4F, -2.5F, 3, 2, 5);
		Shape93.setRotationPoint(-6.5F, 16.5F, -21.5F);
		Shape93.setTextureSize(64, 128);
		Shape93.mirror = true;
		setRotation(Shape93, -0.0882992F, 0F, 0F);

		Shape94 = new ModelRenderer(this, 18, 52);
		Shape94.addBox(3F, 4F, -2.5F, 4, 2, 5);
		Shape94.setRotationPoint(3.49F, 16.5F, -13.5F);
		Shape94.setTextureSize(64, 128);
		Shape94.mirror = true;
		setRotation(Shape94, -3.926991F, 0F, 0F);
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
		Shape35.render(f5);
		Shape34.render(f5);
		Shape36.render(f5);
		Shape37.render(f5);
		Shape32.render(f5);
		Shape33.render(f5);
		Shape38.render(f5);
		Shape39.render(f5);
		Shape40.render(f5);
		Shape41.render(f5);
		Shape42.render(f5);
		Shape43.render(f5);
		Shape44.render(f5);
		Shape45.render(f5);
		Shape46.render(f5);
		Shape47.render(f5);
		Shape49.render(f5);
		Shape50.render(f5);
		Shape51.render(f5);
		Shape52.render(f5);
		Shape53.render(f5);
		Shape54.render(f5);
		Shape55.render(f5);
		Shape56.render(f5);
		Shape57.render(f5);
		Shape58.render(f5);
		Shape59.render(f5);
		Shape60.render(f5);
		Shape61.render(f5);
		Shape62.render(f5);
		Shape63.render(f5);
		Shape64.render(f5);
		Shape65.render(f5);
		Shape66.render(f5);
		Shape67.render(f5);
		Shape68.render(f5);
		Shape69.render(f5);
		Shape70.render(f5);
		Shape71.render(f5);
		Shape72.render(f5);
		Shape73.render(f5);
		Shape74.render(f5);
		Shape75.render(f5);
		Shape76.render(f5);
		Shape77.render(f5);
		Shape78.render(f5);
		Shape79.render(f5);
		Shape80.render(f5);
		Shape81.render(f5);
		Shape82.render(f5);
		Shape83.render(f5);
		Shape84.render(f5);
		Shape85.render(f5);
		Shape86.render(f5);
		Shape87.render(f5);
		Shape88.render(f5);
		Shape89.render(f5);
		Shape90.render(f5);
		Shape91.render(f5);
		Shape92.render(f5);
		Shape93.render(f5);
		Shape94.render(f5);
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
