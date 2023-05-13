package Kamen_Rider_Craft_4TH.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.0.3
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class model_tricera_can extends ModelBase {
	private final ModelRenderer legs;
	private final ModelRenderer tail;
	private final ModelRenderer left;
	private final ModelRenderer right;
	private final ModelRenderer top;
	private final ModelRenderer cube_r1;
	private final ModelRenderer head;

	public model_tricera_can() {
		textureWidth = 32;
		textureHeight = 16;

		legs = new ModelRenderer(this);
		legs.setRotationPoint(0.0F, 24.0F, 0.0F);
		legs.cubeList.add(new ModelBox(legs, 12, 0, -2.0F, -3.0F, -4.0F, 3, 1, 7, 0.0F, false));
		legs.cubeList.add(new ModelBox(legs, 26, 3, -2.0F, -2.0F, 1.0F, 1, 2, 2, 0.0F, false));
		legs.cubeList.add(new ModelBox(legs, 26, 3, 0.0F, -2.0F, 1.0F, 1, 2, 2, 0.0F, false));
		legs.cubeList.add(new ModelBox(legs, 26, 3, 0.0F, -2.0F, -2.0F, 1, 2, 2, 0.0F, false));
		legs.cubeList.add(new ModelBox(legs, 26, 3, -2.0F, -2.0F, -2.0F, 1, 2, 2, 0.0F, false));
		legs.cubeList.add(new ModelBox(legs, 18, 6, -2.0F, -3.0F, 3.0F, 1, 1, 1, 0.0F, false));
		legs.cubeList.add(new ModelBox(legs, 18, 6, 0.0F, -3.0F, 3.0F, 1, 1, 1, 0.0F, false));
		legs.cubeList.add(new ModelBox(legs, 18, 6, -1.0F, -3.0F, -5.0F, 1, 1, 1, 0.0F, false));

		tail = new ModelRenderer(this);
		tail.setRotationPoint(0.0F, 21.5F, 3.5F);
		tail.cubeList.add(new ModelBox(tail, 0, 12, -1.0F, -1.5F, 1.5F, 1, 1, 3, 0.0F, false));
		tail.cubeList.add(new ModelBox(tail, 0, 12, -2.0F, -3.5F, -0.5F, 3, 3, 1, 0.0F, false));
		tail.cubeList.add(new ModelBox(tail, 2, 12, -1.0F, -3.5F, 0.5F, 1, 3, 1, 0.0F, false));
		tail.cubeList.add(new ModelBox(tail, 2, 14, -1.0F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));
		tail.cubeList.add(new ModelBox(tail, 1, 13, -1.0F, -2.5F, 1.5F, 1, 1, 2, 0.0F, false));

		left = new ModelRenderer(this);
		left.setRotationPoint(0.0F, 24.0F, 0.0F);
		left.cubeList.add(new ModelBox(left, 2, 14, 1.0F, -5.0F, -5.0F, 1, 1, 1, 0.0F, false));
		left.cubeList.add(new ModelBox(left, 0, 0, 1.0F, -6.0F, -4.0F, 1, 3, 8, 0.0F, false));

		right = new ModelRenderer(this);
		right.setRotationPoint(-4.0F, 24.0F, 0.0F);
		right.cubeList.add(new ModelBox(right, 2, 14, 1.0F, -5.0F, -5.0F, 1, 1, 1, 0.0F, false));
		right.cubeList.add(new ModelBox(right, 0, 0, 1.0F, -6.0F, -4.0F, 1, 3, 8, 0.0F, true));

		top = new ModelRenderer(this);
		top.setRotationPoint(0.0F, 24.0F, 0.0F);
		top.cubeList.add(new ModelBox(top, 10, 7, -2.0F, -7.0F, -4.0F, 3, 1, 8, 0.0F, false));
		top.cubeList.add(new ModelBox(top, 0, 13, -2.0F, -8.0F, 0.0F, 3, 1, 2, 0.0F, false));
		top.cubeList.add(new ModelBox(top, 18, 6, -1.0F, -7.0F, -5.0F, 1, 1, 1, 0.0F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0F, -6.5F, 4.5F);
		top.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.8727F, 0.0F, 0.0F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 7, 3, -1.0F, -3.5F, -0.5F, 1, 4, 1, 0.0F, false));

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 24.0F, 0.0F);
		head.cubeList.add(new ModelBox(head, 0, 12, -2.0F, -6.0F, -5.0F, 3, 3, 1, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 0, 12, 0.0F, -3.0F, -5.0F, 1, 1, 1, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 1, 12, 1.0F, -4.0F, -5.0F, 1, 1, 1, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 2, 12, 1.0F, -6.0F, -5.0F, 1, 1, 1, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 3, 12, 0.0F, -7.0F, -5.0F, 1, 1, 1, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 3, 12, -2.0F, -7.0F, -5.0F, 1, 1, 1, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 4, 12, -3.0F, -6.0F, -5.0F, 1, 1, 1, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 0, 13, -3.0F, -4.0F, -5.0F, 1, 1, 1, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 1, 13, -2.0F, -3.0F, -5.0F, 1, 1, 1, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 24, 11, -1.0F, -4.0F, -8.0F, 1, 1, 3, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 12, 12, -1.0F, -5.0F, -7.0F, 1, 1, 2, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 18, 8, -1.0F, -6.0F, -6.0F, 1, 1, 1, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 18, 6, -1.0F, -5.0F, -8.0F, 1, 1, 1, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 15, 3, 0.0F, -6.0F, -9.0F, 1, 1, 4, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 15, 4, -2.0F, -6.0F, -9.0F, 1, 1, 4, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		legs.render(f5);
		tail.render(f5);
		left.render(f5);
		right.render(f5);
		top.render(f5);
		head.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}