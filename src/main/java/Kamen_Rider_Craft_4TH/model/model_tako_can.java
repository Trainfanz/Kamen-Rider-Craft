package Kamen_Rider_Craft_4TH.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.0.3
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class model_tako_can extends ModelBase {
	private final ModelRenderer bottom;
	private final ModelRenderer leg1;
	private final ModelRenderer leg2;
	private final ModelRenderer leg3;
	private final ModelRenderer leg4;
	private final ModelRenderer leg5;
	private final ModelRenderer leg6;
	private final ModelRenderer leg7;
	private final ModelRenderer leg8;
	private final ModelRenderer head;

	public model_tako_can() {
		textureWidth = 32;
		textureHeight = 16;

		bottom = new ModelRenderer(this);
		bottom.setRotationPoint(0.0F, 24.0F, 0.0F);
		bottom.cubeList.add(new ModelBox(bottom, 1, 0, -1.0F, -1.0F, -2.0F, 3, 1, 3, 0.0F, false));
		bottom.cubeList.add(new ModelBox(bottom, 28, 0, -2.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));
		bottom.cubeList.add(new ModelBox(bottom, 28, 0, -2.0F, -1.0F, -2.0F, 1, 1, 1, 0.0F, false));
		bottom.cubeList.add(new ModelBox(bottom, 28, 0, -1.0F, -1.0F, -3.0F, 1, 1, 1, 0.0F, false));
		bottom.cubeList.add(new ModelBox(bottom, 28, 0, 1.0F, -1.0F, -3.0F, 1, 1, 1, 0.0F, false));
		bottom.cubeList.add(new ModelBox(bottom, 28, 0, 2.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));
		bottom.cubeList.add(new ModelBox(bottom, 28, 0, 2.0F, -1.0F, -2.0F, 1, 1, 1, 0.0F, false));
		bottom.cubeList.add(new ModelBox(bottom, 28, 0, -1.0F, -1.0F, 1.0F, 1, 1, 1, 0.0F, false));
		bottom.cubeList.add(new ModelBox(bottom, 28, 0, 1.0F, -1.0F, 1.0F, 1, 1, 1, 0.0F, false));

		leg1 = new ModelRenderer(this);
		leg1.setRotationPoint(-1.5F, 23.5F, -0.5F);
		leg1.cubeList.add(new ModelBox(leg1, 12, 0, -8.5F, -0.5F, -0.5F, 9, 1, 1, 0.0F, false));
		leg1.cubeList.add(new ModelBox(leg1, 28, 0, -8.5F, -1.5F, -0.5F, 1, 1, 1, 0.0F, false));

		leg2 = new ModelRenderer(this);
		leg2.setRotationPoint(0.5F, 23.5F, -2.5F);
		setRotationAngle(leg2, 0.0F, -1.5708F, 0.0F);
		leg2.cubeList.add(new ModelBox(leg2, 12, 0, -8.5F, -0.5F, -0.5F, 9, 1, 1, 0.0F, false));
		leg2.cubeList.add(new ModelBox(leg2, 28, 0, -8.5F, -1.5F, -0.5F, 1, 1, 1, 0.0F, false));

		leg3 = new ModelRenderer(this);
		leg3.setRotationPoint(2.5F, 23.5F, -0.5F);
		setRotationAngle(leg3, -3.1416F, 0.0F, 3.1416F);
		leg3.cubeList.add(new ModelBox(leg3, 12, 0, -8.5F, -0.5F, -0.5F, 9, 1, 1, 0.0F, false));
		leg3.cubeList.add(new ModelBox(leg3, 28, 0, -8.5F, -1.5F, -0.5F, 1, 1, 1, 0.0F, false));

		leg4 = new ModelRenderer(this);
		leg4.setRotationPoint(0.5F, 23.5F, 1.5F);
		setRotationAngle(leg4, 0.0F, 1.5708F, 0.0F);
		leg4.cubeList.add(new ModelBox(leg4, 12, 2, -8.5F, -0.5F, -0.5F, 9, 1, 1, 0.0F, false));
		leg4.cubeList.add(new ModelBox(leg4, 28, 0, -8.5F, -1.5F, -0.5F, 1, 1, 1, 0.0F, false));
		leg4.cubeList.add(new ModelBox(leg4, 0, 4, -8.5F, 0.5F, -0.5F, 4, 1, 1, 0.0F, false));
		leg4.cubeList.add(new ModelBox(leg4, 0, 0, -6.5F, 0.5F, -1.5F, 1, 1, 1, 0.0F, false));
		leg4.cubeList.add(new ModelBox(leg4, 0, 0, -6.5F, 0.5F, 0.5F, 1, 1, 1, 0.0F, false));

		leg5 = new ModelRenderer(this);
		leg5.setRotationPoint(2.5F, 23.5F, 1.5F);
		setRotationAngle(leg5, 0.0F, 2.3562F, 0.0F);
		leg5.cubeList.add(new ModelBox(leg5, 12, 0, -8.5F, -0.5F, -0.5F, 9, 1, 1, 0.0F, false));
		leg5.cubeList.add(new ModelBox(leg5, 28, 0, -8.5F, -1.5F, -0.5F, 1, 1, 1, 0.0F, false));

		leg6 = new ModelRenderer(this);
		leg6.setRotationPoint(2.5F, 23.5F, -2.5F);
		setRotationAngle(leg6, 3.1416F, -0.7854F, 3.1416F);
		leg6.cubeList.add(new ModelBox(leg6, 12, 0, -8.5F, -0.5F, -0.5F, 9, 1, 1, 0.0F, false));
		leg6.cubeList.add(new ModelBox(leg6, 28, 0, -8.5F, -1.5F, -0.5F, 1, 1, 1, 0.0F, false));

		leg7 = new ModelRenderer(this);
		leg7.setRotationPoint(-1.5F, 23.5F, -2.5F);
		setRotationAngle(leg7, 0.0F, -0.7854F, 0.0F);
		leg7.cubeList.add(new ModelBox(leg7, 12, 0, -8.5F, -0.5F, -0.5F, 9, 1, 1, 0.0F, false));
		leg7.cubeList.add(new ModelBox(leg7, 28, 0, -8.5F, -1.5F, -0.5F, 1, 1, 1, 0.0F, false));

		leg8 = new ModelRenderer(this);
		leg8.setRotationPoint(-1.5F, 23.5F, 1.5F);
		setRotationAngle(leg8, 0.0F, 0.7854F, 0.0F);
		leg8.cubeList.add(new ModelBox(leg8, 12, 0, -8.5F, -0.5F, -0.5F, 9, 1, 1, 0.0F, false));
		leg8.cubeList.add(new ModelBox(leg8, 28, 0, -8.5F, -1.5F, -0.5F, 1, 1, 1, 0.0F, false));

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 24.0F, 0.0F);
		head.cubeList.add(new ModelBox(head, 20, 4, -1.0F, -6.0F, -2.0F, 3, 5, 3, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		bottom.render(f5);
		leg1.render(f5);
		leg2.render(f5);
		leg3.render(f5);
		leg4.render(f5);
		leg5.render(f5);
		leg6.render(f5);
		leg7.render(f5);
		leg8.render(f5);
		head.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}