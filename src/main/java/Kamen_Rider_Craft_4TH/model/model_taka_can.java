package Kamen_Rider_Craft_4TH.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.0.3
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class model_taka_can extends ModelBase {
	private final ModelRenderer head;
	private final ModelRenderer leftwing;
	private final ModelRenderer tinyleftwing;
	private final ModelRenderer rightwing;
	private final ModelRenderer tinyrightwing;
	private final ModelRenderer top;
	private final ModelRenderer tail;
	private final ModelRenderer righttail;
	private final ModelRenderer lefttail;

	public model_taka_can() {
		textureWidth = 32;
		textureHeight = 16;

		head = new ModelRenderer(this);
		head.setRotationPoint(-0.5F, 23.5F, -2.5F);
		head.cubeList.add(new ModelBox(head, 0, 4, -0.5F, -0.5F, -4.5F, 1, 1, 5, 0.0F, false));

		leftwing = new ModelRenderer(this);
		leftwing.setRotationPoint(1.5F, 23.5F, 0.0F);
		leftwing.cubeList.add(new ModelBox(leftwing, 10, 0, 0.5F, -1.5F, -2.0F, 8, 2, 3, 0.0F, false));
		leftwing.cubeList.add(new ModelBox(leftwing, 20, 5, 0.5F, -1.5F, -3.0F, 5, 1, 1, 0.0F, false));
		leftwing.cubeList.add(new ModelBox(leftwing, 0, 0, -0.5F, -0.5F, -1.0F, 1, 1, 1, 0.0F, false));

		tinyleftwing = new ModelRenderer(this);
		tinyleftwing.setRotationPoint(8.5F, -0.5F, -2.0F);
		leftwing.addChild(tinyleftwing);
		tinyleftwing.cubeList.add(new ModelBox(tinyleftwing, 18, 0, 0.0F, -1.0F, 0.0F, 1, 1, 2, 0.0F, false));
		tinyleftwing.cubeList.add(new ModelBox(tinyleftwing, 19, 1, 1.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));

		rightwing = new ModelRenderer(this);
		rightwing.setRotationPoint(-2.5F, 23.5F, 0.0F);
		rightwing.cubeList.add(new ModelBox(rightwing, 10, 0, -8.5F, -1.5F, -2.0F, 8, 2, 3, 0.0F, true));
		rightwing.cubeList.add(new ModelBox(rightwing, 20, 5, -5.5F, -1.5F, -3.0F, 5, 1, 1, 0.0F, true));
		rightwing.cubeList.add(new ModelBox(rightwing, 0, 0, -0.5F, -0.5F, -1.0F, 1, 1, 1, 0.0F, false));

		tinyrightwing = new ModelRenderer(this);
		tinyrightwing.setRotationPoint(-8.5F, -0.5F, -2.0F);
		rightwing.addChild(tinyrightwing);
		tinyrightwing.cubeList.add(new ModelBox(tinyrightwing, 19, 1, -2.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));
		tinyrightwing.cubeList.add(new ModelBox(tinyrightwing, 18, 0, -1.0F, -1.0F, 0.0F, 1, 1, 2, 0.0F, false));

		top = new ModelRenderer(this);
		top.setRotationPoint(0.0F, 24.0F, 0.0F);
		top.cubeList.add(new ModelBox(top, 1, 0, -2.0F, -1.0F, -2.0F, 3, 1, 3, 0.0F, false));
		top.cubeList.add(new ModelBox(top, 0, 0, -2.0F, -1.0F, 1.0F, 1, 1, 1, 0.0F, false));
		top.cubeList.add(new ModelBox(top, 0, 0, 0.0F, -1.0F, 1.0F, 1, 1, 1, 0.0F, false));
		top.cubeList.add(new ModelBox(top, 0, 0, -3.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));
		top.cubeList.add(new ModelBox(top, 0, 0, -3.0F, -1.0F, -2.0F, 1, 1, 1, 0.0F, false));
		top.cubeList.add(new ModelBox(top, 0, 0, -2.0F, -1.0F, -3.0F, 1, 1, 1, 0.0F, false));
		top.cubeList.add(new ModelBox(top, 0, 0, 0.0F, -1.0F, -3.0F, 1, 1, 1, 0.0F, false));
		top.cubeList.add(new ModelBox(top, 0, 0, 1.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));
		top.cubeList.add(new ModelBox(top, 0, 0, 1.0F, -1.0F, -2.0F, 1, 1, 1, 0.0F, false));

		tail = new ModelRenderer(this);
		tail.setRotationPoint(0.0F, 23.5F, 1.5F);
		setRotationAngle(tail, -1.5708F, 0.0F, 0.0F);
		tail.cubeList.add(new ModelBox(tail, 24, 7, -2.0F, -8.5F, -0.5F, 3, 8, 1, 0.0F, false));
		tail.cubeList.add(new ModelBox(tail, 12, 5, -1.0F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));
		tail.cubeList.add(new ModelBox(tail, 24, 7, -1.0F, -8.5F, -1.5F, 1, 8, 1, 0.0F, false));

		righttail = new ModelRenderer(this);
		righttail.setRotationPoint(-0.5F, 0.5F, -1.0F);
		tail.addChild(righttail);
		setRotationAngle(righttail, 0.0F, -1.5708F, 0.0F);
		righttail.cubeList.add(new ModelBox(righttail, 0, 0, -0.5F, -6.0F, -3.5F, 1, 1, 1, 0.0F, false));
		righttail.cubeList.add(new ModelBox(righttail, 16, 7, -0.5F, -9.0F, -3.5F, 2, 3, 1, 0.0F, false));
		righttail.cubeList.add(new ModelBox(righttail, 12, 7, -0.5F, -9.0F, -1.5F, 1, 6, 1, 0.0F, false));
		righttail.cubeList.add(new ModelBox(righttail, 12, 7, -0.5F, -9.0F, -2.5F, 1, 3, 1, 0.0F, false));

		lefttail = new ModelRenderer(this);
		lefttail.setRotationPoint(-0.5F, 0.5F, -1.0F);
		tail.addChild(lefttail);
		setRotationAngle(lefttail, 0.0F, -1.5708F, 0.0F);
		lefttail.cubeList.add(new ModelBox(lefttail, 0, 0, -0.5F, -6.0F, 2.5F, 1, 1, 1, 0.0F, false));
		lefttail.cubeList.add(new ModelBox(lefttail, 16, 7, -0.5F, -9.0F, 2.5F, 2, 3, 1, 0.0F, false));
		lefttail.cubeList.add(new ModelBox(lefttail, 12, 7, -0.5F, -9.0F, 0.5F, 1, 6, 1, 0.0F, false));
		lefttail.cubeList.add(new ModelBox(lefttail, 12, 7, -0.5F, -9.0F, 1.5F, 1, 3, 1, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		head.render(f5);
		leftwing.render(f5);
		rightwing.render(f5);
		top.render(f5);
		tail.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}