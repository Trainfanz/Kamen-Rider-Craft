package Kamen_Rider_Craft_4TH.model;

import Kamen_Rider_Craft_4TH.ReiwaRiderItems;
import Kamen_Rider_Craft_4TH.item.zero_one.item_zero_onedriver;
import Kamen_Rider_Craft_4TH.util.Refercence;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityArmorStand;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.util.ResourceLocation;

public class Model_ziin extends model_belt_plus {
	private final ModelRenderer bipedHeadBase;
	private final ModelRenderer bone;
	private final ModelRenderer bipedBodyBase;
	private final ModelRenderer bone4;

	public Model_ziin() {
		textureWidth = 64;
		textureHeight = 32;

		bipedHeadBase = new ModelRenderer(this);
		bipedHeadBase.setRotationPoint(0.0F, 0.6F, 0.0F);
		

		bone = new ModelRenderer(this);
		bone.setRotationPoint(-1.0F, 0.0F, 0.0F);
		bipedHeadBase.addChild(bone);
		setRotationAngle(bone, 0.6981F, -0.6109F, -0.3927F);
		bone.cubeList.add(new ModelBox(bone, 0, 0, -3.5F, -3.0F, -5.0F, 12, 1, 10, 0.0F, false));

		bipedBodyBase = new ModelRenderer(this);
		bipedBodyBase.setRotationPoint(0.0F, -0.2F, 0.0F);
		

		bone4 = new ModelRenderer(this);
		bone4.setRotationPoint(2.0F, -3.0F, 1.0F);
		bipedBodyBase.addChild(bone4);
		setRotationAngle(bone4, -0.6545F, -0.3927F, 1.5708F);
		bone4.cubeList.add(new ModelBox(bone4, 37, 2, 2.5F, -7.6F, -5.7F, 2, 17, 11, 0.0F, false));
	}


	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);

		if (entity instanceof EntityLivingBase){
			EntityLivingBase player = ((EntityLivingBase)entity);
			if (player.getItemStackFromSlot(EntityEquipmentSlot.HEAD)!= null){
				if (player.getItemStackFromSlot(EntityEquipmentSlot.CHEST)!= null){
					if (player.getItemStackFromSlot(EntityEquipmentSlot.LEGS)!= null){
						if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET)!= null){
							if (player.getItemStackFromSlot(EntityEquipmentSlot.LEGS).getItem() == ReiwaRiderItems.geatslegs){
								if (player.getItemStackFromSlot(EntityEquipmentSlot.CHEST).getItem() == ReiwaRiderItems.geatstroso){
									if (player.getItemStackFromSlot(EntityEquipmentSlot.HEAD).getItem() == ReiwaRiderItems.geatshead){
										if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == ReiwaRiderItems.raise_riser_belt_ziin){	
												double height=1;

		Minecraft.getMinecraft().renderEngine.bindTexture(new ResourceLocation(Refercence.MODID+":textures/armor/ziin.png"));


												GlStateManager.pushMatrix();
												GlStateManager.scale(1.1D, 1.1, 1.1D);
												this.bipedHeadBase.render(f5);
												this.bipedBodyBase.render(f5);
												GlStateManager.popMatrix();
											}
										}
									}							
							}
						}
					}
				}
			}
			GlStateManager.pushMatrix();
			super.render(entity, f, f1, f2, f3, f4, f5);
			GlStateManager.popMatrix();
		}

	}
	public void setRotationAngles(float p_78087_1_, float p_78087_2_, float p_78087_3_, float p_78087_4_, float p_78087_5_, float p_78087_6_, Entity entityIn)
	{
		if (entityIn instanceof EntityArmorStand)
	    {
	        EntityArmorStand entityarmorstand = (EntityArmorStand)entityIn;
	        this.bipedHeadBase.rotateAngleX = 0.017453292F * entityarmorstand.getHeadRotation().getX();
	        this.bipedHeadBase.rotateAngleY = 0.017453292F * entityarmorstand.getHeadRotation().getY();
	        this.bipedHeadBase.rotateAngleZ = 0.017453292F * entityarmorstand.getHeadRotation().getZ();
	        this.bipedHeadBase.setRotationPoint(0.0F, 1.0F, 0.0F);
	        this.bipedBodyBase.rotateAngleX = 0.017453292F * entityarmorstand.getBodyRotation().getX();
	        this.bipedBodyBase.rotateAngleY = 0.017453292F * entityarmorstand.getBodyRotation().getY();
	        this.bipedBodyBase.rotateAngleZ = 0.017453292F * entityarmorstand.getBodyRotation().getZ();
	        copyModelAngles(this.bipedHead, this.bipedHeadwear);
	    }else{
	    	super.setRotationAngles(p_78087_1_, p_78087_2_, p_78087_3_, p_78087_4_, p_78087_5_, p_78087_6_, entityIn);
	    }
		
		this.bipedHeadBase.rotateAngleX=this.bipedHead.rotateAngleX;
		this.bipedHeadBase.rotateAngleY=this.bipedHead.rotateAngleY;
		this.bipedHeadBase.rotateAngleZ=this.bipedHead.rotateAngleZ;
		
		this.bipedBodyBase.rotateAngleX=this.bipedBody.rotateAngleX;
		this.bipedBodyBase.rotateAngleY=this.bipedBody.rotateAngleY;
		this.bipedBodyBase.rotateAngleZ=this.bipedBody.rotateAngleZ;
		
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}