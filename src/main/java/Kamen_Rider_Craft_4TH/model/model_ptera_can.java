package Kamen_Rider_Craft_4TH.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.0.3
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class model_ptera_can extends ModelBase {
	private final ModelRenderer body;
	private final ModelRenderer rightwing;
	private final ModelRenderer arms1;
	private final ModelRenderer tinyarms1;
	private final ModelRenderer leftwing;
	private final ModelRenderer arms2;
	private final ModelRenderer tinyarms2;
	private final ModelRenderer tail;
	private final ModelRenderer head;

	public model_ptera_can() {
		textureWidth = 32;
		textureHeight = 16;

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 24.0F, 0.0F);
		body.cubeList.add(new ModelBox(body, 0, 0, 0.0F, -1.0F, 2.0F, 1, 1, 1, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 0, 0, -2.0F, -1.0F, -1.0F, 3, 1, 3, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 0, 0, 1.0F, -1.0F, 1.0F, 1, 1, 1, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 0, 0, 1.0F, -1.0F, -1.0F, 1, 1, 1, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 0, 0, -2.0F, -1.0F, -2.0F, 3, 1, 1, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 0, 0, -3.0F, -1.0F, -1.0F, 1, 1, 1, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 0, 0, -3.0F, -1.0F, 1.0F, 1, 1, 1, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 0, 0, -2.0F, -1.0F, 2.0F, 1, 1, 1, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 0, 0, -1.0F, -4.0F, -1.0F, 1, 3, 2, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 0, 0, -1.0F, -3.0F, 1.0F, 1, 2, 1, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 0, 0, -2.0F, -3.0F, 0.0F, 1, 2, 1, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 0, 0, 0.0F, -3.0F, 0.0F, 1, 2, 1, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 0, 0, -2.0F, -2.0F, -2.0F, 1, 1, 2, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 0, 0, 0.0F, -2.0F, -2.0F, 1, 1, 2, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 0, 0, -2.0F, -2.0F, 1.0F, 1, 1, 1, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 0, 0, -1.0F, -2.0F, 1.0F, 1, 1, 1, 0.0F, false));

		rightwing = new ModelRenderer(this);
		rightwing.setRotationPoint(0.0F, 24.0F, 0.0F);
		rightwing.cubeList.add(new ModelBox(rightwing, 0, 0, 1.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));
		rightwing.cubeList.add(new ModelBox(rightwing, 14, 0, 2.0F, -2.0F, 2.0F, 8, 1, 1, 0.0F, false));
		rightwing.cubeList.add(new ModelBox(rightwing, 16, 0, 2.0F, -1.0F, 1.0F, 6, 1, 1, 0.0F, false));
		rightwing.cubeList.add(new ModelBox(rightwing, 22, 2, 2.0F, -1.0F, 0.0F, 4, 1, 1, 0.0F, false));
		rightwing.cubeList.add(new ModelBox(rightwing, 16, 2, 2.0F, -1.0F, -1.0F, 2, 1, 1, 0.0F, false));

		arms1 = new ModelRenderer(this);
		arms1.setRotationPoint(8.0F, -0.5F, 1.0F);
		rightwing.addChild(arms1);
		setRotationAngle(arms1, 0.0F, 0.9163F, -3.1416F);
		arms1.cubeList.add(new ModelBox(arms1, 14, 4, -6.0F, -1.5F, -3.0F, 8, 1, 1, 0.0F, false));
		arms1.cubeList.add(new ModelBox(arms1, 18, 6, -4.0F, -0.5F, -2.0F, 6, 1, 1, 0.0F, false));
		arms1.cubeList.add(new ModelBox(arms1, 22, 8, -2.0F, -0.5F, -1.0F, 4, 1, 1, 0.0F, false));
		arms1.cubeList.add(new ModelBox(arms1, 26, 10, 0.0F, -0.5F, 0.0F, 2, 1, 1, 0.0F, false));
		arms1.cubeList.add(new ModelBox(arms1, 24, 0, 1.0F, -1.5F, -2.0F, 1, 1, 3, 0.0F, false));

		tinyarms1 = new ModelRenderer(this);
		tinyarms1.setRotationPoint(2.0F, 0.5F, -1.5F);
		arms1.addChild(tinyarms1);
		setRotationAngle(tinyarms1, 0.0F, 0.6545F, 0.0F);
		tinyarms1.cubeList.add(new ModelBox(tinyarms1, 26, 0, 0.0F, -2.0F, -0.5F, 2, 1, 1, 0.0F, false));

		leftwing = new ModelRenderer(this);
		leftwing.setRotationPoint(0.0F, 24.0F, 0.0F);
		leftwing.cubeList.add(new ModelBox(leftwing, 0, 0, -3.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));
		leftwing.cubeList.add(new ModelBox(leftwing, 14, 0, -11.0F, -2.0F, 2.0F, 8, 1, 1, 0.0F, true));
		leftwing.cubeList.add(new ModelBox(leftwing, 16, 0, -9.0F, -1.0F, 1.0F, 6, 1, 1, 0.0F, true));
		leftwing.cubeList.add(new ModelBox(leftwing, 22, 2, -7.0F, -1.0F, 0.0F, 4, 1, 1, 0.0F, false));
		leftwing.cubeList.add(new ModelBox(leftwing, 16, 2, -5.0F, -1.0F, -1.0F, 2, 1, 1, 0.0F, true));

		arms2 = new ModelRenderer(this);
		arms2.setRotationPoint(-9.0F, -0.5F, 1.0F);
		leftwing.addChild(arms2);
		setRotationAngle(arms2, 0.0F, -0.9163F, -3.1416F);
		arms2.cubeList.add(new ModelBox(arms2, 14, 4, -2.0F, -1.5F, -3.0F, 8, 1, 1, 0.0F, true));
		arms2.cubeList.add(new ModelBox(arms2, 18, 12, -2.0F, -0.5F, -2.0F, 6, 1, 1, 0.0F, true));
		arms2.cubeList.add(new ModelBox(arms2, 22, 14, -2.0F, -0.5F, -1.0F, 4, 1, 1, 0.0F, true));
		arms2.cubeList.add(new ModelBox(arms2, 26, 10, -2.0F, -0.5F, 0.0F, 2, 1, 1, 0.0F, true));
		arms2.cubeList.add(new ModelBox(arms2, 24, 0, -2.0F, -1.5F, -2.0F, 1, 1, 3, 0.0F, false));

		tinyarms2 = new ModelRenderer(this);
		tinyarms2.setRotationPoint(-2.0F, -0.5F, -1.5F);
		arms2.addChild(tinyarms2);
		setRotationAngle(tinyarms2, 0.0F, -0.6545F, 0.0F);
		tinyarms2.cubeList.add(new ModelBox(tinyarms2, 26, 0, -1.9564F, -1.0F, -0.501F, 2, 1, 1, 0.0F, false));

		tail = new ModelRenderer(this);
		tail.setRotationPoint(0.0F, 24.0F, 0.0F);
		tail.cubeList.add(new ModelBox(tail, 0, 0, -1.0F, -2.0F, 10.0F, 1, 1, 1, 0.0F, false));
		tail.cubeList.add(new ModelBox(tail, 0, 0, -1.0F, -1.0F, 2.0F, 1, 1, 9, 0.0F, false));

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 24.0F, 0.0F);
		head.cubeList.add(new ModelBox(head, 1, 7, -1.0F, -2.0F, -9.0F, 1, 1, 8, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 1, 11, -1.0F, -3.0F, -8.0F, 1, 1, 3, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 0, 0, -1.0F, -4.0F, -6.0F, 1, 1, 2, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 0, 0, -1.0F, -5.0F, -5.0F, 1, 1, 2, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		body.render(f5);
		rightwing.render(f5);
		leftwing.render(f5);
		tail.render(f5);
		head.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}