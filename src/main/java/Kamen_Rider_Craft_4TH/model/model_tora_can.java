package Kamen_Rider_Craft_4TH.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.0.3
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class model_tora_can extends ModelBase {
	private final ModelRenderer body;
	private final ModelRenderer cube_r1;
	private final ModelRenderer leg1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer leg2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer head;
	private final ModelRenderer cube_r4;

	public model_tora_can() {
		textureWidth = 32;
		textureHeight = 32;

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 22.0F, 0.0F);
		

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0F, -1.0F, 0.0F);
		body.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, -1.5708F, 0.0F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 18, 0, -2.0F, -2.0F, 2.0F, 1, 1, 2, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 18, 0, -2.0F, -2.0F, -5.0F, 1, 1, 2, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 20, 0, -2.0F, -2.0F, -2.0F, 1, 1, 1, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 20, 0, -2.0F, -2.0F, 0.0F, 1, 1, 1, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 16, 0, -1.0F, -1.0F, 0.0F, 3, 1, 1, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 16, 0, -1.0F, -1.0F, -2.0F, 3, 1, 1, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 5, -1.0F, -1.0F, 2.0F, 3, 1, 2, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 5, -1.0F, -1.0F, -5.0F, 3, 1, 2, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 16, 0, -1.0F, -4.0F, 0.0F, 3, 3, 1, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 16, 0, -1.0F, -4.0F, -2.0F, 3, 3, 1, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 0, -1.0F, -4.0F, -5.0F, 3, 3, 2, 0.0F, true));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 0, -1.0F, -4.0F, 2.0F, 3, 3, 2, 0.0F, true));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 22, 7, 2.0F, -4.0F, -5.0F, 1, 3, 4, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 22, 0, 2.0F, -4.0F, 0.0F, 1, 3, 4, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 10, 10, -2.0F, -4.0F, -5.0F, 1, 2, 4, 0.0F, true));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 10, -2.0F, -4.0F, 0.0F, 1, 2, 4, 0.0F, true));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 1, 0, -1.0F, -5.0F, -5.0F, 3, 1, 9, 0.0F, false));

		leg1 = new ModelRenderer(this);
		leg1.setRotationPoint(1.5F, 20.5F, 0.0F);
		

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-1.5F, -0.5F, 0.0F);
		leg1.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, -1.5708F, 0.0F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 16, 7, -2.0F, 0.0F, -3.0F, 3, 1, 1, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 17, 5, 0.0F, 2.0F, -3.0F, 1, 2, 1, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 17, 5, 1.0F, 0.0F, -3.0F, 1, 3, 1, 0.0F, false));

		leg2 = new ModelRenderer(this);
		leg2.setRotationPoint(-2.5F, 20.5F, 0.0F);
		

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-1.5F, 1.5F, 0.0F);
		leg2.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, -1.5708F, 0.0F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 16, 7, -2.0F, -2.0F, -3.0F, 3, 1, 1, 0.0F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 17, 5, 0.0F, 0.0F, -3.0F, 1, 2, 1, 0.0F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 17, 5, 1.0F, -2.0F, -3.0F, 1, 3, 1, 0.0F, false));

		head = new ModelRenderer(this);
		head.setRotationPoint(-0.5F, 20.5F, 0.0F);
		

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(0.5F, 3.5F, 0.0F);
		head.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, -1.5708F, 0.0F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 17, 5, 0.0F, -3.0F, -1.0F, 1, 3, 1, 0.0F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 20, 15, -3.0F, -1.0F, -1.0F, 1, 1, 1, 0.0F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 16, 11, -5.0F, -5.0F, -1.0F, 2, 2, 1, 0.0F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 20, 14, -4.0F, -3.0F, -1.0F, 1, 3, 1, 0.0F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 24, 14, -3.0F, -4.0F, -1.0F, 3, 3, 1, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		body.render(f5);
		leg1.render(f5);
		leg2.render(f5);
		head.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}