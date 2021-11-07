package Kamen_Rider_Craft_4TH.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.0.3
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class model_batta_can extends ModelBase {
	private final ModelRenderer antenna;
	private final ModelRenderer body;
	private final ModelRenderer frontlegs;
	private final ModelRenderer tail;
	private final ModelRenderer rightleg;
	private final ModelRenderer backleg1;
	private final ModelRenderer leftleg;
	private final ModelRenderer backleg2;

	public model_batta_can() {
		textureWidth = 32;
		textureHeight = 32;

		antenna = new ModelRenderer(this);
		antenna.setRotationPoint(0.0F, 24.0F, 0.0F);
		antenna.cubeList.add(new ModelBox(antenna, 0, 0, -1.0F, -6.0F, -5.0F, 1, 2, 1, 0.0F, false));

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 24.0F, 0.0F);
		body.cubeList.add(new ModelBox(body, 24, 0, -1.0F, -5.0F, 0.0F, 1, 5, 3, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 21, 0, -1.0F, -5.0F, 3.0F, 1, 1, 2, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 19, 0, -1.0F, -4.0F, 3.0F, 1, 1, 1, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 21, 0, -1.0F, -1.0F, 3.0F, 1, 1, 2, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 19, 0, -1.0F, -2.0F, 3.0F, 1, 1, 1, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 0, 0, -1.0F, -5.0F, -4.0F, 1, 3, 4, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 22, 0, -1.0F, -2.0F, -1.0F, 1, 1, 1, 0.0F, false));

		frontlegs = new ModelRenderer(this);
		frontlegs.setRotationPoint(-0.5F, 24.0F, -2.5F);
		setRotationAngle(frontlegs, -3.1416F, 0.0F, 3.1416F);
		frontlegs.cubeList.add(new ModelBox(frontlegs, 19, 0, -0.5F, -1.0F, 1.5F, 1, 1, 1, 0.0F, false));
		frontlegs.cubeList.add(new ModelBox(frontlegs, 16, 3, -0.5F, -2.0F, -1.5F, 1, 2, 3, 0.0F, false));

		tail = new ModelRenderer(this);
		tail.setRotationPoint(0.0F, 24.0F, 0.0F);
		tail.cubeList.add(new ModelBox(tail, 24, 0, -1.0F, -3.0F, 3.0F, 1, 1, 3, 0.0F, false));
		tail.cubeList.add(new ModelBox(tail, 19, 0, -1.0F, -4.0F, 4.0F, 1, 1, 1, 0.0F, false));

		rightleg = new ModelRenderer(this);
		rightleg.setRotationPoint(0.0F, 20.5F, 2.5F);
		setRotationAngle(rightleg, -2.4871F, 0.0F, 0.0F);
		rightleg.cubeList.add(new ModelBox(rightleg, 1, 4, -3.0F, -0.5F, -6.5F, 1, 3, 9, 0.0F, false));
		rightleg.cubeList.add(new ModelBox(rightleg, 1, 4, -2.0F, 0.5F, -6.5F, 1, 3, 9, 0.0F, false));
		rightleg.cubeList.add(new ModelBox(rightleg, 20, 11, -2.0F, -0.5F, -2.5F, 1, 1, 5, 0.0F, false));
		rightleg.cubeList.add(new ModelBox(rightleg, 17, 14, -2.0F, -1.5F, 1.5F, 1, 1, 1, 0.0F, false));

		backleg1 = new ModelRenderer(this);
		backleg1.setRotationPoint(0.0F, 0.0F, -6.0F);
		rightleg.addChild(backleg1);
		setRotationAngle(backleg1, 1.1345F, 0.0F, 0.0F);
		backleg1.cubeList.add(new ModelBox(backleg1, 0, 0, -2.0F, -1.5F, 3.5F, 1, 1, 4, 0.0F, false));
		backleg1.cubeList.add(new ModelBox(backleg1, 0, 7, -2.0F, -1.5F, -0.5F, 1, 2, 4, 0.0F, false));

		leftleg = new ModelRenderer(this);
		leftleg.setRotationPoint(0.0F, 20.5F, 2.5F);
		setRotationAngle(leftleg, -2.4871F, 0.0F, 0.0F);
		leftleg.cubeList.add(new ModelBox(leftleg, 12, 8, 1.0F, -0.5F, -6.5F, 1, 3, 9, 0.0F, true));
		leftleg.cubeList.add(new ModelBox(leftleg, 1, 4, 0.0F, 0.5F, -6.5F, 1, 3, 9, 0.0F, false));
		leftleg.cubeList.add(new ModelBox(leftleg, 20, 11, 0.0F, -0.5F, -2.5F, 1, 1, 5, 0.0F, false));
		leftleg.cubeList.add(new ModelBox(leftleg, 17, 14, 0.0F, -1.5F, 1.5F, 1, 1, 1, 0.0F, false));

		backleg2 = new ModelRenderer(this);
		backleg2.setRotationPoint(0.0F, 0.0F, -6.0F);
		leftleg.addChild(backleg2);
		setRotationAngle(backleg2, 1.1345F, 0.0F, 0.0F);
		backleg2.cubeList.add(new ModelBox(backleg2, 0, 0, 0.0F, -1.5F, 3.5F, 1, 1, 4, 0.0F, false));
		backleg2.cubeList.add(new ModelBox(backleg2, 0, 7, 0.0F, -1.5F, -0.5F, 1, 2, 4, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		antenna.render(f5);
		body.render(f5);
		frontlegs.render(f5);
		tail.render(f5);
		rightleg.render(f5);
		leftleg.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}