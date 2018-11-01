package Kamen_Rider_Craft_4TH.model;

import org.lwjgl.opengl.GL11;

import Kamen_Rider_Craft_4TH.RiderItems;
import Kamen_Rider_Craft_4TH.item.Ex_Aid.item_ex_aiddriver;
import Kamen_Rider_Craft_4TH.item.gaim.item_Gaimdriver;
import Kamen_Rider_Craft_4TH.item.ghost.item_ghostdriver;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;


public class bigBiped extends tokuArmorModel
{
	public bigBiped()
	{

		this.bipedHead2 = new ModelRenderer(this, 0, 0);
		this.bipedHead2.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8, 1);
		this.bipedHead2.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.bipedHeadwear2 = new ModelRenderer(this, 32, 0);
		this.bipedHeadwear2.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8, 1 + 0.5F);
		this.bipedHeadwear2.setRotationPoint(0.0F, 0.0F, 0.0F);

		this.bipedBody2 = new ModelRenderer(this, 16, 16);
		this.bipedBody2.addBox(-4.0F, 0.0F, -2.0F, 8, 12, 4, 1);
		this.bipedBody2.setRotationPoint(0.0F, 0.0F , 0.0F);

		this.bipedBody3 = new ModelRenderer(this, 16, 16);
		this.bipedBody3.addBox(-4.0F, 0.0F, -2.0F, 8, 12, 4, 1);
		this.bipedBody3.setRotationPoint(0.0F, 0.0F , 0.0F);


		this.bipedRightArm2 = new ModelRenderer(this, 40, 16);
		this.bipedRightArm2.addBox(-3.0F, -2.0F, -2.0F, 4, 12, 4, 1);
		this.bipedRightArm2.setRotationPoint(-5.0F, 2.0F , 0.0F);
		this.bipedLeftArm2= new ModelRenderer(this, 40, 16);
		this.bipedLeftArm2.mirror = true;
		this.bipedLeftArm2.addBox(-1.0F, -2.0F, -2.0F, 4, 12, 4, 1);
		this.bipedLeftArm2.setRotationPoint(5.0F, 2.0F , 0.0F);
		this.bipedRightLeg2 = new ModelRenderer(this, 0, 16);
		this.bipedRightLeg2.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4, 1);
		this.bipedRightLeg2.setRotationPoint(-1.9F, 12.0F , 0.0F);
		this.bipedLeftLeg2 = new ModelRenderer(this, 0, 16);
		this.bipedLeftLeg2.mirror = true;
		this.bipedLeftLeg2.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4, 1);
		this.bipedLeftLeg2.setRotationPoint(1.9F, 12.0F , 0.0F);
	}



	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		
		this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);

		GL11.glPushMatrix();
		GL11.glScalef(1.1F, 1.1F, 1.1F);



		if (entity.isSneaking()){
			GL11.glTranslatef(0, 0.2F, 0);

		}else {
			GL11.glTranslatef(0, -0.02F, 0);


		}
		this.bipedRightArm2.offsetX=-0.02f;
		this.bipedRightArm2.render(f5);
		GL11.glPopMatrix();


		GL11.glPushMatrix();
		GL11.glScalef(1.1F, 1F, 1.1F);


		if (entity.isSneaking()){
			GL11.glTranslatef(0, 0.3F, 0);

		}else {
			GL11.glTranslatef(0, 0.02F, 0);


		}


		this.bipedRightLeg2.offsetX=-0.045f;

		this.bipedRightLeg2.render(f5);



		GL11.glPopMatrix();
		GL11.glPushMatrix();
		GL11.glPushMatrix();

		if (entity instanceof  EntityLivingBase){


			if (((EntityLivingBase) entity).getItemStackFromSlot(EntityEquipmentSlot.FEET)!=null){

				 if (((EntityLivingBase) entity).getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() instanceof item_ex_aiddriver){
					if (item_ex_aiddriver.get_core(((EntityLivingBase) entity).getItemStackFromSlot(EntityEquipmentSlot.FEET),"1")==6){

						
						GL11.glScalef(1F, 1F, 1F);
						if(entity.isSneaking()){
							GL11.glTranslatef(0, 0.17F, -0.02f);
						}else{
							GL11.glTranslatef(0, -0F, 0);
						}

					}else {
						GL11.glScalef(1.2F, 1.2F, 1.2F);
						if(entity.isSneaking()){
							GL11.glTranslatef(0, 0.27F, -0.02f);
						}else{
							GL11.glTranslatef(0, 0.1F, 0);
						}
					}
				}
				
			}
			
			}


		this.bipedHead2.render(f5);
		this.bipedHeadwear2.render(f5);


	
		GL11.glPopMatrix();



		GL11.glPushMatrix();
		GL11.glScalef(1.2F, 1.2F, 1.2F);
		GL11.glTranslatef(0, 0.05F, 0);



		if (entity.isSneaking()){
			this.bipedBody3.offsetZ=0.0f;
			this.bipedBody3.offsetY=0.18f;

		}else {
			this.bipedBody3.offsetZ=0.00025f;


		}

		this.bipedBody3.render(f5);


		GL11.glPopMatrix();

		GL11.glPushMatrix();


		GL11.glScalef(1.1F, 1.1F, 1.1F);

		if(entity.isSneaking()){
			this.bipedBody2.offsetZ=-0.0f;
			this.bipedBody2.offsetY=0.25f;
		}else{
			this.bipedBody2.offsetZ=0.00025f;
			this.bipedBody2.offsetY=0.05f;
		}
		this.bipedBody2.render(f5);

		GL11.glPopMatrix();



		GL11.glPopMatrix();
		GL11.glPushMatrix();
		GL11.glScalef(1.1F, 1.1F, 1.1F);



		if (entity.isSneaking()){
			GL11.glTranslatef(0, 0.2F, 0);

		}else {
			GL11.glTranslatef(0, -0.02F, 0);


		}

		if (entity instanceof  EntityLivingBase){


			if (((EntityLivingBase) entity).getItemStackFromSlot(EntityEquipmentSlot.FEET)!=null){

			}else if (((EntityLivingBase) entity).getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() instanceof item_ex_aiddriver){


				Minecraft.getMinecraft().renderEngine.bindTexture(new ResourceLocation("KamenRiderCraftv3:textures/armor/"+item_ex_aiddriver.get_lock(((EntityLivingBase) entity).getItemStackFromSlot(EntityEquipmentSlot.FEET)) +"_2.png"));

			}
		}

		this.bipedLeftArm2.offsetX=0.02f;
		this.bipedLeftArm2.render(f5);



		GL11.glPopMatrix();
		GL11.glPushMatrix();
		GL11.glScalef(1.1F, 1F, 1.1F);


		if (entity.isSneaking()){
			GL11.glTranslatef(0, 0.3F, 0);

		}else {
			GL11.glTranslatef(0, 0.02F, 0);


		}

		this.bipedLeftLeg2.offsetX=0.045f;

		this.bipedLeftLeg2.render(f5);


		if (entity instanceof  EntityLivingBase){
			ItemStack stack  =   ((EntityLivingBase) entity).getItemStackFromSlot(EntityEquipmentSlot.FEET);

		}
		GL11.glPopMatrix();


	}

	public void setRotationAngles(float p_78087_1_, float p_78087_2_, float p_78087_3_, float p_78087_4_, float p_78087_5_, float p_78087_6_, Entity p_78087_7_)
	{
		super.setRotationAngles(p_78087_1_, p_78087_2_, p_78087_3_, p_78087_4_, p_78087_5_, p_78087_6_, p_78087_7_);
		copyModelAngles(this.bipedBody, this.bipedBody2);
		copyModelAngles(this.bipedBody, this.bipedBody3);

		copyModelAngles(this.bipedLeftArm, this.bipedLeftArm2);
		copyModelAngles(this.bipedLeftLeg, this.bipedLeftLeg2);
		copyModelAngles(this.bipedRightArm, this.bipedRightArm2);
		copyModelAngles(this.bipedRightLeg, this.bipedRightLeg2);

		copyModelAngles(this.bipedHead, this.bipedHead2);
		copyModelAngles(this.bipedHeadwear, this.bipedHeadwear2);

	}



}














