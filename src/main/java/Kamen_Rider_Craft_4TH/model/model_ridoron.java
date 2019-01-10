
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

public class model_ridoron extends ModelBiped
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
	ModelRenderer Shape19;
	ModelRenderer Shape18;
	ModelRenderer Shape20;
	ModelRenderer Shape22;
	ModelRenderer Shape23;
	ModelRenderer Shape21;
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
	ModelRenderer Shape45;
	ModelRenderer Shape46;
	ModelRenderer Shape47;
	ModelRenderer Shape48;
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

	public model_ridoron()
	{
		textureWidth = 128;
		textureHeight = 256;

		Shape1 = new ModelRenderer(this, 0, 39);
		Shape1.addBox(-1F, 3F, -2F, 3, 2, 4);
		Shape1.setRotationPoint(-12.5F, 16.5F, 14F);
		Shape1.setTextureSize(128, 256);
		Shape1.mirror = true;
		setRotation(Shape1, -2.356194F, 0F, 0F);

		Shape2 = new ModelRenderer(this, 0, 39);
		Shape2.addBox(-1F, 3F, -2F, 3, 2, 4);
		Shape2.setRotationPoint(-12.5F, 16.5F, 14F);
		Shape2.setTextureSize(128, 256);
		Shape2.mirror = true;
		setRotation(Shape2, 3.141593F, 0F, 0F);

		Shape3 = new ModelRenderer(this, 0, 39);
		Shape3.addBox(-1F, 3F, -2F, 3, 2, 4);
		Shape3.setRotationPoint(-12.5F, 16.5F, 14F);
		Shape3.setTextureSize(128, 256);
		Shape3.mirror = true;
		setRotation(Shape3, -3.926991F, 0F, 0F);

		Shape4 = new ModelRenderer(this, 0, 39);
		Shape4.addBox(-1F, 3F, -2F, 3, 2, 4);
		Shape4.setRotationPoint(-12.5F, 16.5F, 14F);
		Shape4.setTextureSize(128, 256);
		Shape4.mirror = true;
		setRotation(Shape4, 1.570796F, 0F, 0F);

		Shape5 = new ModelRenderer(this, 0, 46);
		Shape5.addBox(-1F, -3.5F, -3.5F, 2, 7, 7);
		Shape5.setRotationPoint(-12F, 16.5F, 14F);
		Shape5.setTextureSize(128, 256);
		Shape5.mirror = true;
		setRotation(Shape5, 0F, 0F, 0F);

		Shape6 = new ModelRenderer(this, 0, 39);
		Shape6.addBox(-1F, 3F, -2F, 3, 2, 4);
		Shape6.setRotationPoint(-12.5F, 16.5F, 14F);
		Shape6.setTextureSize(128, 256);
		Shape6.mirror = true;
		setRotation(Shape6, 0.7853982F, 0F, 0F);

		Shape7 = new ModelRenderer(this, 0, 39);
		Shape7.addBox(-1F, 3F, -2F, 3, 2, 4);
		Shape7.setRotationPoint(-12.5F, 16.5F, 14F);
		Shape7.setTextureSize(128, 256);
		Shape7.mirror = true;
		setRotation(Shape7, 0F, 0F, 0F);

		Shape8 = new ModelRenderer(this, 0, 39);
		Shape8.addBox(-1F, 3F, -2F, 3, 2, 4);
		Shape8.setRotationPoint(-12.5F, 16.5F, 14F);
		Shape8.setTextureSize(128, 256);
		Shape8.mirror = true;
		setRotation(Shape8, -0.7853982F, 0F, 0F);

		Shape9 = new ModelRenderer(this, 0, 39);
		Shape9.addBox(-1F, 3F, -2F, 3, 2, 4);
		Shape9.setRotationPoint(-12.5F, 16.5F, 14F);
		Shape9.setTextureSize(128, 256);
		Shape9.mirror = true;
		setRotation(Shape9, -1.570796F, 0F, 0F);

		Shape10 = new ModelRenderer(this, 0, 46);
		Shape10.addBox(-1F, -3.5F, -3.5F, 2, 7, 7);
		Shape10.setRotationPoint(12F, 16.5F, 14F);
		Shape10.setTextureSize(128, 256);
		Shape10.mirror = true;
		setRotation(Shape10, 0F, 0F, 0F);

		Shape11 = new ModelRenderer(this, 0, 39);
		Shape11.addBox(-1F, 3F, -2F, 3, 2, 4);
		Shape11.setRotationPoint(11.5F, 16.5F, 14F);
		Shape11.setTextureSize(128, 256);
		Shape11.mirror = true;
		setRotation(Shape11, -2.356194F, 0F, 0F);

		Shape12 = new ModelRenderer(this, 0, 39);
		Shape12.addBox(-1F, 3F, -2F, 3, 2, 4);
		Shape12.setRotationPoint(11.5F, 16.5F, 14F);
		Shape12.setTextureSize(128, 256);
		Shape12.mirror = true;
		setRotation(Shape12, -0.7853982F, 0F, 0F);

		Shape13 = new ModelRenderer(this, 0, 39);
		Shape13.addBox(-1F, 3F, -2F, 3, 2, 4);
		Shape13.setRotationPoint(11.5F, 16.5F, 14F);
		Shape13.setTextureSize(128, 256);
		Shape13.mirror = true;
		setRotation(Shape13, -1.570796F, 0F, 0F);

		Shape14 = new ModelRenderer(this, 0, 39);
		Shape14.addBox(-1F, 3F, -2F, 3, 2, 4);
		Shape14.setRotationPoint(11.5F, 16.5F, 14F);
		Shape14.setTextureSize(128, 256);
		Shape14.mirror = true;
		setRotation(Shape14, 0F, 0F, 0F);

		Shape15 = new ModelRenderer(this, 0, 39);
		Shape15.addBox(-1F, 3F, -2F, 3, 2, 4);
		Shape15.setRotationPoint(11.5F, 16.5F, 14F);
		Shape15.setTextureSize(128, 256);
		Shape15.mirror = true;
		setRotation(Shape15, 0.7853982F, 0F, 0F);

		Shape16 = new ModelRenderer(this, 0, 39);
		Shape16.addBox(-1F, 3F, -2F, 3, 2, 4);
		Shape16.setRotationPoint(11.5F, 16.5F, 14F);
		Shape16.setTextureSize(128, 256);
		Shape16.mirror = true;
		setRotation(Shape16, 1.570796F, 0F, 0F);

		Shape17 = new ModelRenderer(this, 0, 39);
		Shape17.addBox(-1F, 3F, -2F, 3, 2, 4);
		Shape17.setRotationPoint(11.5F, 16.5F, 14F);
		Shape17.setTextureSize(128, 256);
		Shape17.mirror = true;
		setRotation(Shape17, -3.926991F, 0F, 0F);

		Shape19 = new ModelRenderer(this, 0, 39);
		Shape19.addBox(-1F, 3F, -2F, 3, 2, 4);
		Shape19.setRotationPoint(11.5F, 16.5F, 14F);
		Shape19.setTextureSize(128, 256);
		Shape19.mirror = true;
		setRotation(Shape19, 3.141593F, 0F, 0F);

		Shape18 = new ModelRenderer(this, 0, 46);
		Shape18.addBox(-1F, -3.5F, -3.5F, 2, 7, 7);
		Shape18.setRotationPoint(-12F, 16.5F, -14F);
		Shape18.setTextureSize(128, 256);
		Shape18.mirror = true;
		setRotation(Shape18, 0F, 0F, 0F);

		Shape20 = new ModelRenderer(this, 0, 39);
		Shape20.addBox(-1F, 3F, -2F, 3, 2, 4);
		Shape20.setRotationPoint(-12.5F, 16.5F, -14F);
		Shape20.setTextureSize(128, 256);
		Shape20.mirror = true;
		setRotation(Shape20, -2.356194F, 0F, 0F);

		Shape22 = new ModelRenderer(this, 0, 39);
		Shape22.addBox(-1F, 3F, -2F, 3, 2, 4);
		Shape22.setRotationPoint(-12.5F, 16.5F, -14F);
		Shape22.setTextureSize(128, 256);
		Shape22.mirror = true;
		setRotation(Shape22, -0.7853982F, 0F, 0F);

		Shape23 = new ModelRenderer(this, 0, 39);
		Shape23.addBox(-1F, 3F, -2F, 3, 2, 4);
		Shape23.setRotationPoint(-12.5F, 16.5F, -14F);
		Shape23.setTextureSize(128, 256);
		Shape23.mirror = true;
		setRotation(Shape23, -1.570796F, 0F, 0F);

		Shape21 = new ModelRenderer(this, 0, 39);
		Shape21.addBox(-1F, 3F, -2F, 3, 2, 4);
		Shape21.setRotationPoint(-12.5F, 16.5F, -14F);
		Shape21.setTextureSize(128, 256);
		Shape21.mirror = true;
		setRotation(Shape21, 0F, 0F, 0F);

		Shape24 = new ModelRenderer(this, 0, 39);
		Shape24.addBox(-1F, 3F, -2F, 3, 2, 4);
		Shape24.setRotationPoint(-12.5F, 16.5F, -14F);
		Shape24.setTextureSize(128, 256);
		Shape24.mirror = true;
		setRotation(Shape24, 0.7853982F, 0F, 0F);

		Shape25 = new ModelRenderer(this, 0, 39);
		Shape25.addBox(-1F, 3F, -2F, 3, 2, 4);
		Shape25.setRotationPoint(-12.5F, 16.5F, -14F);
		Shape25.setTextureSize(128, 256);
		Shape25.mirror = true;
		setRotation(Shape25, 1.570796F, 0F, 0F);

		Shape26 = new ModelRenderer(this, 0, 39);
		Shape26.addBox(-1F, 3F, -2F, 3, 2, 4);
		Shape26.setRotationPoint(-12.5F, 16.5F, -14F);
		Shape26.setTextureSize(128, 256);
		Shape26.mirror = true;
		setRotation(Shape26, -3.926991F, 0F, 0F);

		Shape27 = new ModelRenderer(this, 0, 39);
		Shape27.addBox(-1F, 3F, -2F, 3, 2, 4);
		Shape27.setRotationPoint(-12.5F, 16.5F, -14F);
		Shape27.setTextureSize(128, 256);
		Shape27.mirror = true;
		setRotation(Shape27, 3.141593F, 0F, 0F);

		Shape28 = new ModelRenderer(this, 0, 46);
		Shape28.addBox(-1F, -3.5F, -3.5F, 2, 7, 7);
		Shape28.setRotationPoint(12F, 16.5F, -14F);
		Shape28.setTextureSize(128, 256);
		Shape28.mirror = true;
		setRotation(Shape28, 0F, 0F, 0F);

		Shape29 = new ModelRenderer(this, 0, 39);
		Shape29.addBox(-1F, 3F, -2F, 3, 2, 4);
		Shape29.setRotationPoint(11.5F, 16.5F, -14F);
		Shape29.setTextureSize(128, 256);
		Shape29.mirror = true;
		setRotation(Shape29, 0F, 0F, 0F);

		Shape30 = new ModelRenderer(this, 0, 39);
		Shape30.addBox(-1F, 3F, -2F, 3, 2, 4);
		Shape30.setRotationPoint(11.5F, 16.5F, -14F);
		Shape30.setTextureSize(128, 256);
		Shape30.mirror = true;
		setRotation(Shape30, 0.7853982F, 0F, 0F);

		Shape31 = new ModelRenderer(this, 0, 39);
		Shape31.addBox(-1F, 3F, -2F, 3, 2, 4);
		Shape31.setRotationPoint(11.5F, 16.5F, -14F);
		Shape31.setTextureSize(128, 256);
		Shape31.mirror = true;
		setRotation(Shape31, 1.570796F, 0F, 0F);

		Shape32 = new ModelRenderer(this, 0, 39);
		Shape32.addBox(-1F, 3F, -2F, 3, 2, 4);
		Shape32.setRotationPoint(11.5F, 16.5F, -14F);
		Shape32.setTextureSize(128, 256);
		Shape32.mirror = true;
		setRotation(Shape32, -3.926991F, 0F, 0F);

		Shape33 = new ModelRenderer(this, 0, 39);
		Shape33.addBox(-1F, 3F, -2F, 3, 2, 4);
		Shape33.setRotationPoint(11.5F, 16.5F, -14F);
		Shape33.setTextureSize(128, 256);
		Shape33.mirror = true;
		setRotation(Shape33, 3.141593F, 0F, 0F);

		Shape34 = new ModelRenderer(this, 0, 39);
		Shape34.addBox(-1F, 3F, -2F, 3, 2, 4);
		Shape34.setRotationPoint(11.5F, 16.5F, -14F);
		Shape34.setTextureSize(128, 256);
		Shape34.mirror = true;
		setRotation(Shape34, -2.356194F, 0F, 0F);

		Shape35 = new ModelRenderer(this, 0, 39);
		Shape35.addBox(-1F, 3F, -2F, 3, 2, 4);
		Shape35.setRotationPoint(11.5F, 16.5F, -14F);
		Shape35.setTextureSize(128, 256);
		Shape35.mirror = true;
		setRotation(Shape35, -1.570796F, 0F, 0F);

		Shape36 = new ModelRenderer(this, 0, 39);
		Shape36.addBox(-1F, 3F, -2F, 3, 2, 4);
		Shape36.setRotationPoint(11.5F, 16.5F, -14F);
		Shape36.setTextureSize(128, 256);
		Shape36.mirror = true;
		setRotation(Shape36, -0.7853982F, 0F, 0F);

		Shape37 = new ModelRenderer(this, 0, 182);
		Shape37.addBox(-7F, 0F, 0F, 8, 2, 18);
		Shape37.setRotationPoint(13F, 17F, -9F);
		Shape37.setTextureSize(128, 256);
		Shape37.mirror = true;
		setRotation(Shape37, 0F, 0F, -0.2230705F);

		Shape38 = new ModelRenderer(this, 0, 108);
		Shape38.addBox(0F, 0F, 0F, 14, 2, 18);
		Shape38.setRotationPoint(-7F, 18.5F, -9F);
		Shape38.setTextureSize(128, 256);
		Shape38.mirror = true;
		setRotation(Shape38, 0F, 0F, 0F);

		Shape39 = new ModelRenderer(this, 75, 69);
		Shape39.addBox(0F, 0F, 0F, 1, 6, 24);
		Shape39.setRotationPoint(-12F, 11F, 27F);
		Shape39.setTextureSize(128, 256);
		Shape39.mirror = true;
		setRotation(Shape39, 0F, 1.570796F, 0F);

		Shape40 = new ModelRenderer(this, 38, 186);
		Shape40.mirror = true;
		Shape40.addBox(0F, 0F, 0F, 2, 6, 18);
		Shape40.setRotationPoint(-14F, 11.2F, -9F);
		Shape40.setTextureSize(128, 256);
		Shape40.mirror = true;
		setRotation(Shape40, 0F, 0F, 0F);

		Shape41 = new ModelRenderer(this, 0, 229);
		Shape41.addBox(0F, 0F, -0.1F, 24, 7, 7);
		Shape41.setRotationPoint(-12F, 5F, 7.5F);
		Shape41.setTextureSize(128, 256);
		Shape41.mirror = true;
		setRotation(Shape41, 0F, 0F, 0F);

		Shape42 = new ModelRenderer(this, 0, 0);
		Shape42.addBox(0F, 0F, 0F, 26, 2, 35);
		Shape42.setRotationPoint(-13F, 10.5F, -16.5F);
		Shape42.setTextureSize(128, 256);
		Shape42.mirror = true;
		setRotation(Shape42, 0F, 0F, 0F);

		Shape43 = new ModelRenderer(this, 74, 191);
		Shape43.addBox(0F, 0F, 0F, 26, 5, 1);
		Shape43.setRotationPoint(-13F, 13F, -23.4F);
		Shape43.setTextureSize(128, 256);
		Shape43.mirror = true;
		setRotation(Shape43, 0F, 0F, 0F);

		Shape44 = new ModelRenderer(this, 74, 236);
		Shape44.mirror = true;
		Shape44.addBox(0F, 0F, 0F, 4, 6, 7);
		Shape44.setRotationPoint(-14F, 13F, -25.4F);
		Shape44.setTextureSize(128, 256);
		Shape44.mirror = true;
		setRotation(Shape44, 0F, 0F, 0F);

		Shape45 = new ModelRenderer(this, 119, 199);
		Shape45.addBox(0F, 0F, 0F, 2, 6, 2);
		Shape45.setRotationPoint(-1F, 4F, 25.6F);
		Shape45.setTextureSize(128, 256);
		Shape45.mirror = true;
		setRotation(Shape45, -0.1487144F, 0F, 0F);

		Shape46 = new ModelRenderer(this, 0, 182);
		Shape46.mirror = true;
		Shape46.addBox(-1F, 0F, 0F, 8, 2, 18);
		Shape46.setRotationPoint(-13F, 17F, -9F);
		Shape46.setTextureSize(128, 256);
		Shape46.mirror = true;
		setRotation(Shape46, 0F, 0F, 0.2230717F);

		Shape47 = new ModelRenderer(this, 66, 124);
		Shape47.addBox(0F, 0F, 0F, 10, 2, 20);
		Shape47.setRotationPoint(-10F, 18F, -9F);
		Shape47.setTextureSize(128, 256);
		Shape47.mirror = true;
		setRotation(Shape47, 0F, 1.570796F, 0F);

		Shape48 = new ModelRenderer(this, 74, 236);
		Shape48.addBox(0F, 0F, 0F, 4, 6, 7);
		Shape48.setRotationPoint(10F, 13F, -25.4F);
		Shape48.setTextureSize(128, 256);
		Shape48.mirror = true;
		setRotation(Shape48, 0F, 0F, 0F);

		Shape49 = new ModelRenderer(this, 88, 148);
		Shape49.addBox(0F, 0F, 0F, 2, 6, 18);
		Shape49.setRotationPoint(12F, 11.2F, -9F);
		Shape49.setTextureSize(128, 256);
		Shape49.mirror = true;
		setRotation(Shape49, 0F, 0F, 0F);

		Shape50 = new ModelRenderer(this, 69, 159);
		Shape50.addBox(0F, 0F, 0F, 2, 5, 7);
		Shape50.setRotationPoint(-14F, 11.2F, 19F);
		Shape50.setTextureSize(128, 256);
		Shape50.mirror = true;
		setRotation(Shape50, 0.1858931F, 0F, 0F);

		Shape51 = new ModelRenderer(this, 69, 159);
		Shape51.addBox(0F, 0F, 0F, 2, 5, 7);
		Shape51.setRotationPoint(12F, 11.2F, 19F);
		Shape51.setTextureSize(128, 256);
		Shape51.mirror = true;
		setRotation(Shape51, 0.1858931F, 0F, 0F);

		Shape52 = new ModelRenderer(this, 58, 172);
		Shape52.addBox(0F, 0F, 0F, 26, 2, 9);
		Shape52.setRotationPoint(-13F, 13F, -25F);
		Shape52.setTextureSize(128, 256);
		Shape52.mirror = true;
		setRotation(Shape52, 0.2904402F, 0F, 0F);

		Shape53 = new ModelRenderer(this, 103, 208);
		Shape53.addBox(0F, 0F, 0F, 2, 4, 10);
		Shape53.setRotationPoint(12F, 11.2F, -19F);
		Shape53.setTextureSize(128, 256);
		Shape53.mirror = true;
		setRotation(Shape53, 0F, 0F, 0F);

		Shape54 = new ModelRenderer(this, 103, 208);
		Shape54.addBox(0F, 0F, 0F, 2, 4, 10);
		Shape54.setRotationPoint(-14F, 11.2F, -19F);
		Shape54.setTextureSize(128, 256);
		Shape54.mirror = true;
		setRotation(Shape54, 0F, 0F, 0F);

		Shape55 = new ModelRenderer(this, 70, 205);
		Shape55.addBox(0F, 0F, 0F, 2, 6, 11);
		Shape55.setRotationPoint(12F, 11.2F, 9F);
		Shape55.setTextureSize(128, 256);
		Shape55.mirror = true;
		setRotation(Shape55, 0F, 0F, 0F);

		Shape56 = new ModelRenderer(this, 70, 205);
		Shape56.addBox(0F, 0F, 0F, 2, 6, 11);
		Shape56.setRotationPoint(-14F, 11.2F, 9F);
		Shape56.setTextureSize(128, 256);
		Shape56.mirror = true;
		setRotation(Shape56, 0F, 0F, 0F);

		Shape57 = new ModelRenderer(this, 65, 100);
		Shape57.addBox(0F, 0F, 0F, 10, 2, 20);
		Shape57.setRotationPoint(-10F, 18F, 19F);
		Shape57.setTextureSize(128, 256);
		Shape57.mirror = true;
		setRotation(Shape57, 0F, 1.570796F, 0F);

		Shape58 = new ModelRenderer(this, 64, 183);
		Shape58.addBox(0F, 1F, -0.1F, 26, 2, 6);
		Shape58.setRotationPoint(-13F, 16F, -24F);
		Shape58.setTextureSize(128, 256);
		Shape58.mirror = true;
		setRotation(Shape58, -0.1858931F, 0F, 0F);

		Shape59 = new ModelRenderer(this, 0, 158);
		Shape59.addBox(0F, 1F, -0.1F, 26, 5, 8);
		Shape59.setRotationPoint(-13F, 14F, 18F);
		Shape59.setTextureSize(128, 256);
		Shape59.mirror = true;
		setRotation(Shape59, 0.185895F, 0F, 0F);

		Shape60 = new ModelRenderer(this, 109, 235);
		Shape60.addBox(0F, 0F, 0F, 2, 6, 7);
		Shape60.setRotationPoint(-1F, 15F, -27.4F);
		Shape60.setTextureSize(128, 256);
		Shape60.mirror = true;
		setRotation(Shape60, 0.7807508F, 0F, 0F);

		Shape61 = new ModelRenderer(this, 70, 197);
		Shape61.addBox(0F, 0F, 0F, 2, 4, 27);
		Shape61.setRotationPoint(-1F, 10F, -22.4F);
		Shape61.setTextureSize(128, 256);
		Shape61.mirror = true;
		setRotation(Shape61, 0.2602503F, 0F, 0F);

		Shape62 = new ModelRenderer(this, 75, 228);
		Shape62.addBox(0F, 0F, 0F, 2, 4, 24);
		Shape62.setRotationPoint(-1F, 3F, 3.6F);
		Shape62.setTextureSize(128, 256);
		Shape62.mirror = true;
		setRotation(Shape62, 0.1115358F, 0F, 0F);

		Shape63 = new ModelRenderer(this, 0, 147);
		Shape63.addBox(0F, 0F, -0.1F, 26, 2, 8);
		Shape63.setRotationPoint(-13F, 9F, 18.5F);
		Shape63.setTextureSize(128, 256);
		Shape63.mirror = true;
		setRotation(Shape63, -0.1487144F, 0F, 0F);

		Shape64 = new ModelRenderer(this, 0, 174);
		Shape64.addBox(0F, 0F, -0.1F, 20, 2, 3);
		Shape64.setRotationPoint(-10F, 10F, -1.5F);
		Shape64.setTextureSize(128, 256);
		Shape64.mirror = true;
		setRotation(Shape64, 0.5205006F, 0F, 0F);

		Shape65 = new ModelRenderer(this, 0, 215);
		Shape65.addBox(0F, 0F, -0.1F, 24, 7, 7);
		Shape65.setRotationPoint(-12F, 5F, 14.5F);
		Shape65.setTextureSize(128, 256);
		Shape65.mirror = true;
		setRotation(Shape65, -0.5948578F, 0F, 0F);

		Shape66 = new ModelRenderer(this, 0, 243);
		Shape66.addBox(0F, 0F, -0.1F, 24, 5, 8);
		Shape66.setRotationPoint(-12F, 8F, 0.5F);
		Shape66.setTextureSize(128, 256);
		Shape66.mirror = true;
		setRotation(Shape66, 0.4089647F, 0F, 0F);

		Shape67 = new ModelRenderer(this, 0, 0);
		Shape67.addBox(-1F, -9F, 0F, 1, 9, 1);
		Shape67.setRotationPoint(0F, 4F, 0F);
		Shape67.setTextureSize(128, 256);
		Shape67.mirror = true;
		setRotation(Shape67, -1.003826F, -0.5204921F, 0F);

		Shape68 = new ModelRenderer(this, 0, 0);
		Shape68.addBox(0F, -9F, 0F, 1, 9, 1);
		Shape68.setRotationPoint(0F, 4F, 0F);
		Shape68.setTextureSize(128, 256);
		Shape68.mirror = true;
		setRotation(Shape68, -1.003822F, 0.5205006F, 0F);

		Shape69 = new ModelRenderer(this, 0, 202);
		Shape69.addBox(0F, 0F, -0.1F, 12, 3, 10);
		Shape69.setRotationPoint(-6F, 10F, -8.5F);
		Shape69.setTextureSize(128, 256);
		Shape69.mirror = true;
		setRotation(Shape69, 0.2602503F, 0F, 0F);
	}

	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		GL11.glScalef(1.75F, 1.75F, 1.75F);
		GL11.glTranslatef(0f, -0.5f, -0.4f);
		
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
		Shape19.render(f5);
		Shape18.render(f5);
		Shape20.render(f5);
		Shape22.render(f5);
		Shape23.render(f5);
		Shape21.render(f5);
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
		Shape45.render(f5);
		Shape46.render(f5);
		Shape47.render(f5);
		Shape48.render(f5);
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
