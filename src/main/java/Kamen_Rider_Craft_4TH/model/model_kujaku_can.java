package Kamen_Rider_Craft_4TH.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.0.3
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class model_kujaku_can extends ModelBase {
	private final ModelRenderer tail;
	private final ModelRenderer tail2;
	private final ModelRenderer tail3;
	private final ModelRenderer tail4;
	private final ModelRenderer tail5;
	private final ModelRenderer body;
	private final ModelRenderer head;
	private final ModelRenderer head1;

	public model_kujaku_can() {
		textureWidth = 32;
		textureHeight = 16;

		tail = new ModelRenderer(this);
		tail.setRotationPoint(0.5F, 17.5F, 0.0F);
		setRotationAngle(tail, 0.0F, 0.0F, -3.1416F);
		tail.cubeList.add(new ModelBox(tail, 0, 0, -2.5F, -2.5F, 0.0F, 5, 5, 1, 0.0F, false));
		tail.cubeList.add(new ModelBox(tail, 12, 0, -2.5F, 2.5F, 0.0F, 1, 3, 1, 0.0F, false));
		tail.cubeList.add(new ModelBox(tail, 12, 0, 1.5F, 2.5F, 0.0F, 1, 3, 1, 0.0F, false));
		tail.cubeList.add(new ModelBox(tail, 12, 1, 0.5F, 2.5F, 0.0F, 1, 2, 1, 0.0F, false));
		tail.cubeList.add(new ModelBox(tail, 12, 1, -1.5F, 2.5F, 0.0F, 1, 2, 1, 0.0F, false));
		tail.cubeList.add(new ModelBox(tail, 12, 0, -0.5F, 2.5F, 0.0F, 1, 1, 1, 0.0F, false));

		tail2 = new ModelRenderer(this);
		tail2.setRotationPoint(0.5F, 17.5F, 0.0F);
		setRotationAngle(tail2, 0.0F, 0.0F, -2.0508F);
		tail2.cubeList.add(new ModelBox(tail2, 1, 1, -2.5F, -2.5F, 0.0F, 5, 5, 0, 0.0F, false));
		tail2.cubeList.add(new ModelBox(tail2, 15, 1, -2.5F, 2.5F, 0.0F, 1, 3, 0, 0.0F, false));
		tail2.cubeList.add(new ModelBox(tail2, 15, 1, 1.5F, 2.5F, 0.0F, 1, 3, 0, 0.0F, false));
		tail2.cubeList.add(new ModelBox(tail2, 15, 2, 0.5F, 2.5F, 0.0F, 1, 2, 0, 0.0F, false));
		tail2.cubeList.add(new ModelBox(tail2, 15, 2, -1.5F, 2.5F, 0.0F, 1, 2, 0, 0.0F, false));
		tail2.cubeList.add(new ModelBox(tail2, 13, 0, -0.5F, 2.5F, 0.0F, 1, 1, 0, 0.0F, false));

		tail3 = new ModelRenderer(this);
		tail3.setRotationPoint(0.5F, 17.5F, 0.0F);
		setRotationAngle(tail3, 0.0F, 0.0F, -0.829F);
		tail3.cubeList.add(new ModelBox(tail3, 1, 1, -2.5F, -2.5F, 0.0F, 5, 5, 0, 0.0F, false));
		tail3.cubeList.add(new ModelBox(tail3, 15, 1, -2.5F, 2.5F, 0.0F, 1, 3, 0, 0.0F, false));
		tail3.cubeList.add(new ModelBox(tail3, 15, 1, 1.5F, 2.5F, 0.0F, 1, 3, 0, 0.0F, false));
		tail3.cubeList.add(new ModelBox(tail3, 15, 2, 0.5F, 2.5F, 0.0F, 1, 2, 0, 0.0F, false));
		tail3.cubeList.add(new ModelBox(tail3, 15, 2, -1.5F, 2.5F, 0.0F, 1, 2, 0, 0.0F, false));
		tail3.cubeList.add(new ModelBox(tail3, 13, 0, -0.5F, 2.5F, 0.0F, 1, 1, 0, 0.0F, false));

		tail4 = new ModelRenderer(this);
		tail4.setRotationPoint(0.5F, 17.5F, 0.0F);
		setRotationAngle(tail4, 0.0F, 0.0F, 0.829F);
		tail4.cubeList.add(new ModelBox(tail4, 1, 1, -2.5F, -2.5F, 0.0F, 5, 5, 0, 0.0F, false));
		tail4.cubeList.add(new ModelBox(tail4, 15, 1, -2.5F, 2.5F, 0.0F, 1, 3, 0, 0.0F, false));
		tail4.cubeList.add(new ModelBox(tail4, 15, 1, 1.5F, 2.5F, 0.0F, 1, 3, 0, 0.0F, false));
		tail4.cubeList.add(new ModelBox(tail4, 15, 2, 0.5F, 2.5F, 0.0F, 1, 2, 0, 0.0F, false));
		tail4.cubeList.add(new ModelBox(tail4, 15, 2, -1.5F, 2.5F, 0.0F, 1, 2, 0, 0.0F, false));
		tail4.cubeList.add(new ModelBox(tail4, 13, 0, -0.5F, 2.5F, 0.0F, 1, 1, 0, 0.0F, false));

		tail5 = new ModelRenderer(this);
		tail5.setRotationPoint(0.5F, 17.5F, -1.0F);
		setRotationAngle(tail5, 0.0F, 0.0F, 2.0508F);
		tail5.cubeList.add(new ModelBox(tail5, 1, 1, -2.5F, -2.5F, 1.0F, 5, 5, 0, 0.0F, false));
		tail5.cubeList.add(new ModelBox(tail5, 15, 1, -2.5F, 2.5F, 1.0F, 1, 3, 0, 0.0F, false));
		tail5.cubeList.add(new ModelBox(tail5, 15, 1, 1.5F, 2.5F, 1.0F, 1, 3, 0, 0.0F, false));
		tail5.cubeList.add(new ModelBox(tail5, 15, 2, 0.5F, 2.5F, 1.0F, 1, 2, 0, 0.0F, false));
		tail5.cubeList.add(new ModelBox(tail5, 15, 2, -1.5F, 2.5F, 1.0F, 1, 2, 0, 0.0F, false));
		tail5.cubeList.add(new ModelBox(tail5, 13, 0, -0.5F, 2.5F, 1.0F, 1, 1, 0, 0.0F, false));

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 24.0F, 0.0F);
		body.cubeList.add(new ModelBox(body, 28, 0, 2.0F, -5.0F, -2.0F, 1, 2, 1, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 28, 0, 1.0F, -5.0F, -3.0F, 1, 2, 1, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 28, 0, -1.0F, -5.0F, -3.0F, 1, 2, 1, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 0, 6, -1.0F, -9.0F, 1.0F, 3, 9, 1, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 8, 6, -2.0F, -9.0F, -1.0F, 5, 9, 1, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 0, 0, -2.0F, -1.0F, 0.0F, 5, 1, 1, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 22, 0, 0.0F, -10.0F, 1.0F, 1, 1, 2, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 28, 10, -1.0F, -5.0F, -2.0F, 1, 5, 1, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 28, 10, 1.0F, -5.0F, -2.0F, 1, 5, 1, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 8, 6, -2.0F, -9.0F, -2.0F, 5, 4, 1, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 28, 0, -2.0F, -5.0F, -2.0F, 1, 2, 1, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 12, 11, -1.0F, -9.0F, -3.0F, 3, 4, 1, 0.0F, false));

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 19.5F, -2.5F);
		head.cubeList.add(new ModelBox(head, 28, 0, 0.0F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

		head1 = new ModelRenderer(this);
		head1.setRotationPoint(0.0F, -0.5F, -0.5F);
		head.addChild(head1);
		head1.cubeList.add(new ModelBox(head1, 28, 0, -1.0F, -4.0F, -1.0F, 1, 3, 1, 0.0F, false));
		head1.cubeList.add(new ModelBox(head1, 28, 0, 1.0F, -4.0F, -1.0F, 1, 3, 1, 0.0F, false));
		head1.cubeList.add(new ModelBox(head1, 28, 0, 2.0F, -4.0F, -2.0F, 1, 3, 1, 0.0F, false));
		head1.cubeList.add(new ModelBox(head1, 28, 0, -2.0F, -4.0F, -2.0F, 1, 3, 1, 0.0F, false));
		head1.cubeList.add(new ModelBox(head1, 0, 0, 0.0F, -4.0F, -1.0F, 1, 4, 1, 0.0F, false));
		head1.cubeList.add(new ModelBox(head1, 17, 0, 0.0F, -4.0F, -2.0F, 1, 2, 1, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		tail.render(f5);
		tail2.render(f5);
		tail3.render(f5);
		tail4.render(f5);
		tail5.render(f5);
		body.render(f5);
		head.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}