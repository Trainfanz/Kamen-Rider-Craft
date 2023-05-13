package Kamen_Rider_Craft_4TH.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.0.3
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class model_gorilla_can extends ModelBase {
	private final ModelRenderer body;
	private final ModelRenderer head;
	private final ModelRenderer leftarm;
	private final ModelRenderer leftarm1;
	private final ModelRenderer rightarm;
	private final ModelRenderer rightarm1;
	private final ModelRenderer legs;
	private final ModelRenderer legs2;

	public model_gorilla_can() {
		textureWidth = 32;
		textureHeight = 16;

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 21.5F, 0.5F);
		setRotationAngle(body, 0.3491F, 0.0F, 0.0F);
		body.cubeList.add(new ModelBox(body, 24, 0, -2.0F, -4.5F, 0.5F, 3, 2, 1, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 24, 4, -3.0F, -2.5F, -0.5F, 2, 3, 2, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 0, 0, -3.0F, -3.5F, 1.5F, 5, 3, 1, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 23, 2, -3.0F, -4.5F, -0.5F, 1, 2, 2, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 23, 2, 1.0F, -4.5F, -0.5F, 1, 2, 2, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 23, 2, -1.0F, -2.5F, -0.5F, 1, 2, 2, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 24, 4, 0.0F, -2.5F, -0.5F, 2, 3, 2, 0.0F, true));
		body.cubeList.add(new ModelBox(body, 26, 0, -1.0F, -0.5F, 0.5F, 1, 1, 1, 0.0F, false));

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, -4.0F, 0.0F);
		body.addChild(head);
		setRotationAngle(head, -0.3927F, 0.0F, 0.0F);
		head.cubeList.add(new ModelBox(head, 0, 4, -2.0F, -0.5F, -0.5F, 3, 2, 1, 0.0F, false));

		leftarm = new ModelRenderer(this);
		leftarm.setRotationPoint(0.0F, -2.0F, 0.0F);
		body.addChild(leftarm);
		setRotationAngle(leftarm, -0.1309F, 0.0F, 0.0F);
		leftarm.cubeList.add(new ModelBox(leftarm, 12, 0, 2.0F, -0.5F, -1.5F, 2, 1, 3, 0.0F, false));
		leftarm.cubeList.add(new ModelBox(leftarm, 12, 0, 2.0F, -2.5F, -1.5F, 2, 1, 3, 0.0F, false));
		leftarm.cubeList.add(new ModelBox(leftarm, 15, 0, 2.0F, -1.5F, 1.5F, 2, 3, 1, 0.0F, false));
		leftarm.cubeList.add(new ModelBox(leftarm, 11, 0, 2.0F, -1.5F, -2.5F, 2, 1, 4, 0.0F, false));
		leftarm.cubeList.add(new ModelBox(leftarm, 17, 0, 3.0F, 0.5F, -0.5F, 1, 1, 1, 0.0F, false));

		leftarm1 = new ModelRenderer(this);
		leftarm1.setRotationPoint(0.0F, 0.0F, -2.0F);
		leftarm.addChild(leftarm1);
		setRotationAngle(leftarm1, -1.5708F, 0.0F, 0.0F);
		leftarm1.cubeList.add(new ModelBox(leftarm1, 12, 0, 2.0F, 1.5F, 0.5F, 2, 1, 3, 0.0F, false));
		leftarm1.cubeList.add(new ModelBox(leftarm1, 13, 2, 2.0F, 0.5F, -0.5F, 2, 1, 2, 0.0F, false));
		leftarm1.cubeList.add(new ModelBox(leftarm1, 8, 5, 2.0F, 0.5F, 2.5F, 2, 1, 1, 0.0F, false));
		leftarm1.cubeList.add(new ModelBox(leftarm1, 15, 0, 2.0F, -0.5F, -0.5F, 2, 1, 1, 0.0F, false));

		rightarm = new ModelRenderer(this);
		rightarm.setRotationPoint(-7.0F, -2.0F, 0.0F);
		body.addChild(rightarm);
		setRotationAngle(rightarm, -0.1309F, 0.0F, 0.0F);
		rightarm.cubeList.add(new ModelBox(rightarm, 12, 0, 2.0F, -0.5F, -1.5F, 2, 1, 3, 0.0F, true));
		rightarm.cubeList.add(new ModelBox(rightarm, 12, 0, 2.0F, -2.5F, -1.5F, 2, 1, 3, 0.0F, true));
		rightarm.cubeList.add(new ModelBox(rightarm, 15, 0, 2.0F, -1.5F, 1.5F, 2, 3, 1, 0.0F, true));
		rightarm.cubeList.add(new ModelBox(rightarm, 11, 0, 2.0F, -1.5F, -2.5F, 2, 1, 4, 0.0F, true));
		rightarm.cubeList.add(new ModelBox(rightarm, 17, 0, 3.0F, 0.5F, -0.5F, 1, 1, 1, 0.0F, true));

		rightarm1 = new ModelRenderer(this);
		rightarm1.setRotationPoint(0.0F, 0.0F, -2.0F);
		rightarm.addChild(rightarm1);
		setRotationAngle(rightarm1, -1.5708F, 0.0F, 0.0F);
		rightarm1.cubeList.add(new ModelBox(rightarm1, 12, 0, 2.0F, 1.5F, 0.5F, 2, 1, 3, 0.0F, true));
		rightarm1.cubeList.add(new ModelBox(rightarm1, 13, 1, 2.0F, 0.5F, -0.5F, 2, 1, 2, 0.0F, true));
		rightarm1.cubeList.add(new ModelBox(rightarm1, 8, 5, 2.0F, 0.5F, 2.5F, 2, 1, 1, 0.0F, true));
		rightarm1.cubeList.add(new ModelBox(rightarm1, 15, 0, 2.0F, -0.5F, -0.5F, 2, 1, 1, 0.0F, true));

		legs = new ModelRenderer(this);
		legs.setRotationPoint(0.0F, 23.5F, 0.5F);
		setRotationAngle(legs, 1.5708F, 0.0F, 0.0F);
		legs.cubeList.add(new ModelBox(legs, 26, 0, -1.0F, -0.5F, 0.5F, 1, 1, 2, 0.0F, false));
		legs.cubeList.add(new ModelBox(legs, 28, 0, -1.0F, -1.5F, -0.5F, 1, 1, 1, 0.0F, false));

		legs2 = new ModelRenderer(this);
		legs2.setRotationPoint(0.0F, 0.0F, -1.0F);
		legs.addChild(legs2);
		setRotationAngle(legs2, 3.1416F, 0.0F, 0.0F);
		legs2.cubeList.add(new ModelBox(legs2, 0, 11, -3.0F, -3.5F, -1.5F, 5, 4, 1, 0.0F, false));
		legs2.cubeList.add(new ModelBox(legs2, 3, 14, 0.0F, 0.5F, -1.5F, 2, 1, 1, 0.0F, false));
		legs2.cubeList.add(new ModelBox(legs2, 0, 14, -3.0F, 0.5F, -1.5F, 2, 1, 1, 0.0F, false));
		legs2.cubeList.add(new ModelBox(legs2, 0, 14, -3.0F, -0.5F, -2.5F, 2, 1, 1, 0.0F, false));
		legs2.cubeList.add(new ModelBox(legs2, 3, 14, 0.0F, -0.5F, -2.5F, 2, 1, 1, 0.0F, false));
		legs2.cubeList.add(new ModelBox(legs2, 0, 11, -3.0F, -2.5F, -2.5F, 5, 2, 1, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		body.render(f5);
		legs.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}