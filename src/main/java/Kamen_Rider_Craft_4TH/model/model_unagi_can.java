package Kamen_Rider_Craft_4TH.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.0.3
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class model_unagi_can extends ModelBase {
	private final ModelRenderer head;
	private final ModelRenderer body1;
	private final ModelRenderer body2;
	private final ModelRenderer body3;
	private final ModelRenderer body4;

	public model_unagi_can() {
		textureWidth = 32;
		textureHeight = 16;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 21.0F, -3.0F);
		head.cubeList.add(new ModelBox(head, 0, 0, -1.0F, 0.0F, -2.0F, 3, 3, 2, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 10, 2, -1.0F, 1.0F, -3.0F, 3, 2, 1, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 8, 0, -1.0F, 2.0F, 0.0F, 3, 1, 1, 0.0F, false));

		body1 = new ModelRenderer(this);
		body1.setRotationPoint(0.0F, 24.0F, 0.0F);
		body1.cubeList.add(new ModelBox(body1, 20, 0, -1.0F, -5.0F, -2.0F, 3, 5, 3, 0.0F, false));
		body1.cubeList.add(new ModelBox(body1, 28, 4, -1.0F, -4.0F, 1.0F, 1, 3, 1, 0.0F, false));
		body1.cubeList.add(new ModelBox(body1, 22, 4, -1.0F, -4.0F, -3.0F, 3, 3, 1, 0.0F, false));
		body1.cubeList.add(new ModelBox(body1, 17, 0, 2.0F, -3.0F, -1.0F, 1, 1, 2, 0.0F, false));
		body1.cubeList.add(new ModelBox(body1, 17, 0, -2.0F, -3.0F, -1.0F, 1, 1, 2, 0.0F, false));
		body1.cubeList.add(new ModelBox(body1, 9, 0, 0.0F, -2.0F, 1.0F, 2, 1, 1, 0.0F, false));
		body1.cubeList.add(new ModelBox(body1, 25, 2, 0.0F, -4.0F, 1.0F, 2, 1, 1, 0.0F, false));
		body1.cubeList.add(new ModelBox(body1, 15, 2, 0.0F, -3.0F, 1.0F, 1, 1, 3, 0.0F, false));

		body2 = new ModelRenderer(this);
		body2.setRotationPoint(0.0F, 24.0F, 0.0F);
		body2.cubeList.add(new ModelBox(body2, 0, 5, -0.5F, -1.0F, 4.0F, 2, 1, 3, 0.0F, false));
		body2.cubeList.add(new ModelBox(body2, 0, 5, -0.5F, -5.0F, 4.0F, 2, 1, 3, 0.0F, false));
		body2.cubeList.add(new ModelBox(body2, 0, 5, -0.5F, -3.0F, 4.0F, 2, 1, 3, 0.0F, false));
		body2.cubeList.add(new ModelBox(body2, 18, 10, -0.5F, -2.0F, 3.0F, 2, 1, 5, 0.0F, false));
		body2.cubeList.add(new ModelBox(body2, 18, 9, -0.5F, -4.0F, 3.0F, 2, 1, 5, 0.0F, false));
		body2.cubeList.add(new ModelBox(body2, 15, 2, 0.0F, -3.0F, 7.0F, 1, 1, 3, 0.0F, false));

		body3 = new ModelRenderer(this);
		body3.setRotationPoint(0.0F, 24.0F, 0.0F);
		body3.cubeList.add(new ModelBox(body3, 0, 5, -0.5F, -1.0F, 10.0F, 2, 1, 3, 0.0F, false));
		body3.cubeList.add(new ModelBox(body3, 0, 5, -0.5F, -5.0F, 10.0F, 2, 1, 3, 0.0F, false));
		body3.cubeList.add(new ModelBox(body3, 0, 5, -0.5F, -3.0F, 10.0F, 2, 1, 3, 0.0F, false));
		body3.cubeList.add(new ModelBox(body3, 18, 10, -0.5F, -2.0F, 9.0F, 2, 1, 5, 0.0F, false));
		body3.cubeList.add(new ModelBox(body3, 18, 9, -0.5F, -4.0F, 9.0F, 2, 1, 5, 0.0F, false));
		body3.cubeList.add(new ModelBox(body3, 15, 2, 0.0F, -3.0F, 13.0F, 1, 1, 3, 0.0F, false));

		body4 = new ModelRenderer(this);
		body4.setRotationPoint(0.0F, 24.0F, 6.0F);
		body4.cubeList.add(new ModelBox(body4, 0, 5, -0.5F, -1.0F, 10.0F, 2, 1, 3, 0.0F, false));
		body4.cubeList.add(new ModelBox(body4, 0, 5, -0.5F, -5.0F, 10.0F, 2, 1, 3, 0.0F, false));
		body4.cubeList.add(new ModelBox(body4, 0, 5, -0.5F, -3.0F, 10.0F, 2, 1, 3, 0.0F, false));
		body4.cubeList.add(new ModelBox(body4, 18, 10, -0.5F, -2.0F, 9.0F, 2, 1, 5, 0.0F, false));
		body4.cubeList.add(new ModelBox(body4, 18, 9, -0.5F, -4.0F, 9.0F, 2, 1, 5, 0.0F, false));
		body4.cubeList.add(new ModelBox(body4, 9, 0, 0.0F, -3.0F, 13.0F, 1, 1, 9, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		head.render(f5);
		body1.render(f5);
		body2.render(f5);
		body3.render(f5);
		body4.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}