package Kamen_Rider_Craft_4TH.model;

import org.lwjgl.opengl.GL11;

import Kamen_Rider_Craft_4TH.RiderItems;
import Kamen_Rider_Craft_4TH.item.wizard.item_wizarddriver;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class model_all_dragon extends ModelBiped
{
	public ItemStack belt;
	
	//fields
	ModelRenderer leftarm1;
	ModelRenderer leftarm2;
	ModelRenderer leftarm3;
	ModelRenderer leftarm4;
	ModelRenderer leftarm5;
	ModelRenderer leftarm6;
	ModelRenderer leftarm7;
	ModelRenderer leftarm8;

	ModelRenderer rightarm1;
	ModelRenderer rightarm2;
	ModelRenderer rightarm3;
	ModelRenderer rightarm4;
	ModelRenderer rightarm5;
	ModelRenderer rightarm6;
	ModelRenderer rightarm7;
	ModelRenderer rightarm8;

	ModelRenderer body1;
	ModelRenderer body2;
	ModelRenderer body3;
	ModelRenderer body4;
	ModelRenderer body5;
	ModelRenderer body6;
	ModelRenderer body7;
	ModelRenderer body8;
	ModelRenderer body9;
	ModelRenderer body10;
	ModelRenderer body11;
	ModelRenderer body12;
	ModelRenderer body13;
	ModelRenderer body14;
	ModelRenderer body15;
	ModelRenderer body16;
	ModelRenderer body17;
	ModelRenderer body18;
	ModelRenderer body19;
	ModelRenderer body20;


	public model_all_dragon()
	{
		textureWidth = 64;
		textureHeight = 128;

		leftarm1 = new ModelRenderer(this, 58, 35);
		leftarm1.addBox(-4F, 9F, 0.5F, 2, 6, 1);
		leftarm1.setRotationPoint(5F, 2F, 0F);
		leftarm1.setTextureSize(64, 128);
		leftarm1.mirror = true;
		setRotation(leftarm1, 0.0698132F, 3.141593F, -0.0743572F);

		leftarm2 = new ModelRenderer(this, 58, 43);
		leftarm2.addBox(-9.3F,11f, 0.5F, 2, 4, 1);
		leftarm2.setRotationPoint(5F, 2F, 0F);
		leftarm2.setTextureSize(64, 128);
		leftarm2.mirror = true;
		setRotation(leftarm2, 0F, 3.141593F, -0.4833219F);

		leftarm3 = new ModelRenderer(this, 58, 43);
		leftarm3.addBox( -9.3F,11f, -0.5F, 2, 4, 1);
		leftarm3.setRotationPoint(5F, 2F, 0F);
		leftarm3.setTextureSize(64, 128);
		leftarm3.mirror = true;
		setRotation(leftarm3, -0.0698132F, 3.141593F, -0.4833219F);

		leftarm4 = new ModelRenderer(this, 58, 35);
		leftarm4.addBox(-4F, 9F, -1.5F, 2, 6, 1);
		leftarm4.setRotationPoint(5F, 2F, 0F);
		leftarm4.setTextureSize(64, 128);
		leftarm4.mirror = true;
		setRotation(leftarm4, -0.0698132F, 3.141593F, -0.0743572F);

		leftarm5 = new ModelRenderer(this, 58, 43);
		leftarm5.addBox( -9.3F,11f, 0.5F,  2 , 4, 1);
		leftarm5.setRotationPoint(5F, 2F, 0F);
		leftarm5.setTextureSize(64, 128);
		leftarm5.mirror = true;
		setRotation(leftarm5, 0.0698132F, 3.141593F, -0.4833219F);

		leftarm6 = new ModelRenderer(this, 58, 35);
		leftarm6.addBox(-4F, 9F, -0.5F, 2, 6, 1);
		leftarm6.setRotationPoint(5F, 2F, 0F);
		leftarm6.setTextureSize(64, 128);
		leftarm6.mirror = true;
		setRotation(leftarm6, 0F, 3.141593F, -0.0743572F);

		leftarm7 = new ModelRenderer(this, 27, 35);
		leftarm7.addBox(-5F, 3.8F, -1.5F, 2, 5, 3);
		leftarm7.setRotationPoint(5F, 2F, 0F);
		leftarm7.setTextureSize(64, 128);
		leftarm7.mirror = true;
		setRotation(leftarm7, 0F, 3.141593F, 0F);

		leftarm8 = new ModelRenderer(this, 39, 35);
		leftarm8.addBox(-4F, 4F, -2.5F, 4, 7, 5);
		leftarm8.setRotationPoint(5F, 2F, 0F);
		leftarm8.setTextureSize(64, 128);
		leftarm8.mirror = true;
		setRotation(leftarm8, 0F, 3.141593F, 0F);

		rightarm1 = new ModelRenderer(this, 58, 43);
		rightarm1.addBox(-9.266666F, 11F, -1.5F, 2, 4, 1);
		rightarm1.setRotationPoint(-5F, 2F, 0F);
		rightarm1.setTextureSize(64, 128);
		rightarm1.mirror = true;
		setRotation(rightarm1, -0.0698132F, 0F, -0.4833219F);
		rightarm1.mirror = false;

		rightarm2 = new ModelRenderer(this, 39, 35);
		rightarm2.addBox(-4F, 4F, -2.5F, 4, 7, 5);
		rightarm2.setRotationPoint(-5F, 2F, 0F);
		rightarm2.setTextureSize(64, 128);
		rightarm2.mirror = true;
		setRotation(rightarm2, 0F, 0F, 0F);

		rightarm3 = new ModelRenderer(this, 58, 43);
		rightarm3.addBox(-9.266666F, 11F, -0.5F, 2, 4, 1);
		rightarm3.setRotationPoint(-5F, 2F, 0F);
		rightarm3.setTextureSize(64, 128);
		rightarm3.mirror = true;
		setRotation(rightarm3, 0F, 0F, -0.4833219F);
		rightarm3.mirror = false;

		rightarm4 = new ModelRenderer(this, 58, 35);
		rightarm4.addBox(-4F, 9F, -0.5F, 2, 6, 1);
		rightarm4.setRotationPoint(-5F, 2F, 0F);
		rightarm4.setTextureSize(64, 128);
		rightarm4.mirror = true;
		setRotation(rightarm4, 0F, 0F, -0.0743572F);
		rightarm4.mirror = false;

		rightarm5 = new ModelRenderer(this, 58, 35);
		rightarm5.addBox(-4F, 9F, -1.5F, 2, 6, 1);
		rightarm5.setRotationPoint(-5F, 2F, 0F);
		rightarm5.setTextureSize(64, 128);
		rightarm5.mirror = true;
		setRotation(rightarm5, -0.0698132F, 0F, -0.0743572F);
		rightarm5.mirror = false;

		rightarm6 = new ModelRenderer(this, 58, 35);
		rightarm6.addBox(-4F, 9F, 0.5F, 2, 6, 1);
		rightarm6.setRotationPoint(-5F, 2F, 0F);
		rightarm6.setTextureSize(64, 128);
		rightarm6.mirror = true;
		setRotation(rightarm6, 0.0698132F, 0F, -0.0743572F);

		rightarm7 = new ModelRenderer(this, 58, 43);
		rightarm7.addBox(-9.266666F, 11F, 0.5F, 2, 4, 1);
		rightarm7.setRotationPoint(-5F, 2F, 0F);
		rightarm7.setTextureSize(64, 128);
		rightarm7.mirror = true;
		setRotation(rightarm7, 0.0698132F, 0F, -0.4833219F);
		rightarm7.mirror = false;

		rightarm8 = new ModelRenderer(this, 27, 35);
		rightarm8.addBox(-5F, 3.8F, -1.5F, 2, 5, 3);
		rightarm8.setRotationPoint(-5F, 2F, 0F);
		rightarm8.setTextureSize(64, 128);
		rightarm8.mirror = true;
		setRotation(rightarm8, 0F, 0F, 0F);

		body1 = new ModelRenderer(this, 0, 35);
		body1.addBox(3F, 0F, -8F, 1, 6, 3);
		body1.setRotationPoint(0F, 0F, 1.5F);
		body1.setTextureSize(64, 128);
		body1.mirror = true;
		setRotation(body1, -0.5683164F, 0F, 0.1745329F);

		body2 = new ModelRenderer(this, 13, 44);
		body2.addBox(-2.5F, 0F, -14F, 5, 4, 7);
		body2.setRotationPoint(0F, 0F, 0F);
		body2.setTextureSize(64, 128);
		body2.mirror = true;
		setRotation(body2, 0.3717861F, 0F, 0F);

		body3 = new ModelRenderer(this, 13, 36);
		body3.addBox(-1.5F, -3.2F, -10.5F, 3, 3, 2);
		body3.setRotationPoint(0F, 0F, 0F);
		body3.setTextureSize(64, 128);
		setRotation(body3, 0.5205006F, 0F, 0F);

		body4 = new ModelRenderer(this, 21, 65);
		body4.addBox(-2.5F, 12.5F, 11.5F, 5, 4, 5);
		body4.setRotationPoint(0F, 0F, 0F);
		body4.setTextureSize(64, 128);
		body4.mirror = true;
		setRotation(body4, -0.1342251F, 0F, 0F);


		body5 = new ModelRenderer(this, 0, 35);
		body5.addBox(-4F, 0F, -8F, 1, 6, 3);
		body5.setRotationPoint(0F, 0F, 1.5F);
		body5.setTextureSize(64, 128);
		body5.mirror = true;
		setRotation(body5, -0.5683164F, 0F, -0.1745329F);
		body5.mirror = false;

		body6 = new ModelRenderer(this, 0, 45);
		body6.addBox(2F, 2F, -9F, 2, 6, 4);
		body6.setRotationPoint(0F, 0F, 1F);
		body6.setTextureSize(64, 128);
		body6.mirror = true;
		setRotation(body6, -0.122173F, 0F, 0.0872665F);

		body7 = new ModelRenderer(this, 0, 45);
		body7.addBox(-4F, 2F, -9F, 2, 6, 4);
		body7.setRotationPoint(0F, 0F, 1F);
		body7.setTextureSize(64, 128);
		body7.mirror = true;
		setRotation(body7, -0.122173F, 0F, -0.0872665F);

		body8 = new ModelRenderer(this, 0, 57);
		body8.addBox(-2.5F, 0F, -10F, 5, 4, 5);
		body8.setRotationPoint(0F, -2F, 0F);
		body8.setTextureSize(64, 128);
		body8.mirror = true;
		setRotation(body8, 0.3717861F, 0F, 0F);

		body9 = new ModelRenderer(this, 22, 57);
		body9.addBox(-2F, -1F, -15F, 4, 4, 2);
		body9.setRotationPoint(0F, 0F, 0F);
		body9.setTextureSize(64, 128);
		body9.mirror = true;
		setRotation(body9, 0.3717861F, 0F, 0F);

		body10 = new ModelRenderer(this, 38, 49);
		body10.addBox(-3F, 1F, -6F, 6, 6, 4);
		body10.setRotationPoint(0F, 0F, 0F);
		body10.setTextureSize(64, 128);
		body10.mirror = true;
		setRotation(body10, 0F, 0F, 0F);

		body11 = new ModelRenderer(this, 44, 61);
		body11.addBox(-3F, 6F, 3F, 6, 6, 4);
		body11.setRotationPoint(0F, 0F, 0F);
		body11.setTextureSize(64, 128);
		body11.mirror = true;
		setRotation(body11, -0.1858931F, 0F, 0F);

		body12 = new ModelRenderer(this, 21, 65);
		body12.addBox(-2.5F, 4F, 9F, 5, 4, 5);
		body12.setRotationPoint(0F, 0F, 0F);
		body12.setTextureSize(64, 128);
		body12.mirror = true;
		setRotation(body12, -0.5948578F, 0F, 0F);

		body13 = new ModelRenderer(this, 39, 75);
		body13.addBox(-3F, 19F, 4.5F, 6, 5, 6);
		body13.setRotationPoint(0F, -1F, 1F);
		body13.setTextureSize(64, 128);
		body13.mirror = true;
		setRotation(body13, 0.4978113F, 0F, 0F);

		body14 = new ModelRenderer(this, 21, 65);
		body14.addBox(-2.5F, -0.5F, 14.5F, 5, 4, 5);
		body14.setRotationPoint(0F, 0F, 0F);
		body14.setTextureSize(64, 128);
		body14.mirror = true;
		setRotation(body14, -0.914976F, 0F, 0F);

		body15 = new ModelRenderer(this, 2, 67);
		body15.addBox(-1.5F, 19F, 11.5F, 3, 4, 5);
		body15.setRotationPoint(0F, 0F, 0F);
		body15.setTextureSize(64, 128);
		body15.mirror = true;
		setRotation(body15, 0.4978113F, 0F, 0F);

		body16 = new ModelRenderer(this, 21, 65);
		body16.addBox(-2.5F, 19F, 3.5F, 5, 4, 5);
		body16.setRotationPoint(0F, 0F, 0F);
		body16.setTextureSize(64, 128);
		body16.mirror = true;
		setRotation(body16, 0.4978113F, 0F, 0F);

		body17 = new ModelRenderer(this, 0, 90);
		body17.addBox(1F, 0F, -3F, 18, 3, 2);
		body17.setRotationPoint(0F, 0F, 0F);
		body17.setTextureSize(64, 128);
		body17.mirror = true;
		setRotation(body17, 0F, -2.918522F, -0.37179F);

		body18 = new ModelRenderer(this, 0, 90);
		body18.addBox(1F, 0F, 1F, 18, 3, 2);
		body18.setRotationPoint(0F, 0F, 0F);
		body18.setTextureSize(64, 128);
		body18.mirror = true;
		setRotation(body18, 0F, -0.2230717F, -0.3717861F);

		body19 = new ModelRenderer(this, 0, 78);
		body19.addBox(2F, 2F, -2F, 17, 10, 0);
		body19.setRotationPoint(0F, 0F, 0F);
		body19.setTextureSize(64, 128);
		body19.mirror = true;
		setRotation(body19, 0F, -2.918522F, -0.37179F);

		body20 = new ModelRenderer(this, 0, 78);
		body20.addBox(2F, 2F, 2F, 17, 10, 0);
		body20.setRotationPoint(0F, 0F, 0F);
		body20.setTextureSize(64, 128);
		body20.mirror = true;
		setRotation(body20, 0F, -0.2230717F, -0.3717861F);

	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		if (entity instanceof EntityLivingBase){
			EntityLivingBase player = ((EntityLivingBase)entity);
			if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.beastdriver){
				if(item_wizarddriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), "1")==6){

					GL11.glPushMatrix();
					GL11.glScalef(1.3F, 1.3F, 1.3F);


					this.rightarm1.offsetY=-0.07f;
					this.rightarm1.offsetX=0.07f;
					this.rightarm2.offsetY=-0.07f;
					this.rightarm2.offsetX=0.07f;
					this.rightarm3.offsetY=-0.07f;
					this.rightarm3.offsetX=0.07f;
					this.rightarm4.offsetY=-0.07f;
					this.rightarm4.offsetX=0.07f;
					this.rightarm5.offsetY=-0.07f;
					this.rightarm5.offsetX=0.07f;
					this.rightarm6.offsetY=-0.07f;
					this.rightarm6.offsetX=0.07f;
					this.rightarm7.offsetY=-0.07f;
					this.rightarm7.offsetX=0.07f;
					this.rightarm8.offsetY=-0.07f;
					this.rightarm8.offsetX=0.07f;

					//this.rightarm1.render(f5);
					this.rightarm2.render(f5);
					//this.rightarm3.render(f5);
					this.rightarm4.render(f5);
					this.rightarm5.render(f5);
					this.rightarm6.render(f5);
					//this.rightarm7.render(f5);
					this.rightarm8.render(f5);
					GL11.glPopMatrix();
					GL11.glPushMatrix();
					GL11.glScalef(1.3F, 1.3F, 1.3F);

					this.leftarm1.offsetY=-0.05f;
					this.leftarm1.offsetX=-0.07f;
					this.leftarm2.offsetY=-0.05f;
					this.leftarm2.offsetX=-0.07f;
					this.leftarm3.offsetY=-0.05f;
					this.leftarm3.offsetX=-0.07f;
					this.leftarm4.offsetY=-0.05f;
					this.leftarm4.offsetX=-0.07f;
					this.leftarm5.offsetY=-0.05f;
					this.leftarm5.offsetX=-0.07f;
					this.leftarm6.offsetY=-0.05f;
					this.leftarm6.offsetX=-0.07f;
					this.leftarm7.offsetY=-0.05f;
					this.leftarm7.offsetX=-0.07f;
					this.leftarm8.offsetY=-0.05f;
					this.leftarm8.offsetX=-0.07f;

					this.leftarm1.render(f5);
					//this.leftarm2.render(f5);
					//this.leftarm3.render(f5);
					this.leftarm4.render(f5);
					//this.leftarm5.render(f5);
					this.leftarm6.render(f5);
					this.leftarm7.render(f5);
					this.leftarm8.render(f5);

					GL11.glPopMatrix();
				}
			}
			if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.wizardriver){
				if(item_wizarddriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), "2")==1||item_wizarddriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), "2")==4||item_wizarddriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), "2")==8||item_wizarddriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), "2")==9){
					this.body1.render(f5);
					this.body2.render(f5);
					this.body3.render(f5);
				
					this.body5.render(f5);
					this.body6.render(f5);
					this.body7.render(f5);
					this.body8.render(f5);
					this.body9.render(f5);
					this.body10.render(f5);
				}if(item_wizarddriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), "2")==1||item_wizarddriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), "2")==5||item_wizarddriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), "2")==3||item_wizarddriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), "2")==8||item_wizarddriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), "2")==9){
					
					this.body4.render(f5);
					this.body11.render(f5);
					this.body12.render(f5);
					this.body13.render(f5);
					this.body14.render(f5);
					this.body15.render(f5);
					this.body16.render(f5);
				
				}if(item_wizarddriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), "2")==1||item_wizarddriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), "2")==6||item_wizarddriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), "2")==3||item_wizarddriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), "2")==8||item_wizarddriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), "2")==9){

					GL11.glPushMatrix();
					GL11.glScalef(1.2F, 1.2F, 1.2F);
					this.body17.render(f5);
					this.body18.render(f5);
					this.body19.render(f5);
					this.body20.render(f5);
					GL11.glPopMatrix();
				}
				if(item_wizarddriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), "2")==1||item_wizarddriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), "2")==7||item_wizarddriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), "2")==3||item_wizarddriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), "2")==8||item_wizarddriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), "2")==9){

					GL11.glPushMatrix();
					GL11.glScalef(1.3F, 1.3F, 1.3F);


					this.rightarm1.offsetY=-0.07f;
					this.rightarm1.offsetX=0.07f;
					this.rightarm2.offsetY=-0.07f;
					this.rightarm2.offsetX=0.07f;
					this.rightarm3.offsetY=-0.07f;
					this.rightarm3.offsetX=0.07f;
					this.rightarm4.offsetY=-0.07f;
					this.rightarm4.offsetX=0.07f;
					this.rightarm5.offsetY=-0.07f;
					this.rightarm5.offsetX=0.07f;
					this.rightarm6.offsetY=-0.07f;
					this.rightarm6.offsetX=0.07f;
					this.rightarm7.offsetY=-0.07f;
					this.rightarm7.offsetX=0.07f;
					this.rightarm8.offsetY=-0.07f;
					this.rightarm8.offsetX=0.07f;

					//this.rightarm1.render(f5);
					this.rightarm2.render(f5);
					//this.rightarm3.render(f5);
					this.rightarm4.render(f5);
					this.rightarm5.render(f5);
					this.rightarm6.render(f5);
					//this.rightarm7.render(f5);
					this.rightarm8.render(f5);
					GL11.glPopMatrix();
					GL11.glPushMatrix();
					GL11.glScalef(1.3F, 1.3F, 1.3F);

					this.leftarm1.offsetY=-0.05f;
					this.leftarm1.offsetX=-0.07f;
					this.leftarm2.offsetY=-0.05f;
					this.leftarm2.offsetX=-0.07f;
					this.leftarm3.offsetY=-0.05f;
					this.leftarm3.offsetX=-0.07f;
					this.leftarm4.offsetY=-0.05f;
					this.leftarm4.offsetX=-0.07f;
					this.leftarm5.offsetY=-0.05f;
					this.leftarm5.offsetX=-0.07f;
					this.leftarm6.offsetY=-0.05f;
					this.leftarm6.offsetX=-0.07f;
					this.leftarm7.offsetY=-0.05f;
					this.leftarm7.offsetX=-0.07f;
					this.leftarm8.offsetY=-0.05f;
					this.leftarm8.offsetX=-0.07f;

					this.leftarm1.render(f5);
					//this.leftarm2.render(f5);
					//this.leftarm3.render(f5);
					this.leftarm4.render(f5);
					//this.leftarm5.render(f5);
					this.leftarm6.render(f5);
					this.leftarm7.render(f5);
					this.leftarm8.render(f5);

					GL11.glPopMatrix();
				}
			}

			GL11.glPushMatrix();
			EntityLivingBase living = ((EntityLivingBase)entity);
			ItemStack stack = living.getItemStackFromSlot(EntityEquipmentSlot.FEET);
			Item Belt = belt.getItem();
			
			EntityItem entItem = new EntityItem(Minecraft.getMinecraft().player.getEntityWorld(), 0D, 0D, 0D,living.getItemStackFromSlot(EntityEquipmentSlot.FEET));
			//Without the below line, the item will spazz out
			entItem.hoverStart = 1.0F;

			if(living.isSneaking()){
				GL11.glRotatef(20, 1, 0, 0);	
			}

			double dri = 0; 
			GL11.glRotatef(180, 0, 1, 0);

			GL11.glRotatef(180, 0, 0, 1);
			GL11.glScaled(0.35, 0.35,0.35);

			GL11.glTranslatef((float) (0f+dri),-2f,0.6f);


			Minecraft.getMinecraft().getItemRenderer().renderItem(living,belt,null);
			GL11.glPopMatrix();
		
	}

}




private void setRotation(ModelRenderer model, float x, float y, float z)
{
	model.rotateAngleX = x;
	model.rotateAngleY = y;
	model.rotateAngleZ = z;
}




public void setRotationAngles(float par1, float par2, float par3, float par4, float par5, float par6, Entity par7Entity)
{
	super.setRotationAngles( par1, par2, par3, par4, par5,par6, par7Entity);

	this.leftarm1.rotateAngleX=-this.bipedLeftArm.rotateAngleX+0.0698132F;
	this.leftarm1.rotateAngleY=this.bipedLeftArm.rotateAngleY-3.141593F;
	this.leftarm1.rotateAngleZ=this.bipedLeftArm.rotateAngleZ+0.0743572F;

	this.leftarm2.rotateAngleX=-this.bipedLeftArm.rotateAngleX;
	this.leftarm2.rotateAngleY=this.bipedLeftArm.rotateAngleY-3.141593F;
	this.leftarm2.rotateAngleZ=this.bipedLeftArm.rotateAngleZ+0.4833219F;

	this.leftarm3.rotateAngleX=-this.bipedLeftArm.rotateAngleX -0.0698132F;
	this.leftarm3.rotateAngleY=this.bipedLeftArm.rotateAngleY +3.141593F;
	this.leftarm3.rotateAngleZ=this.bipedLeftArm.rotateAngleZ +0.4833219F;

	this.leftarm4.rotateAngleX=-this.bipedLeftArm.rotateAngleX-0.0698132F;
	this.leftarm4.rotateAngleY=this.bipedLeftArm.rotateAngleY- 3.141593F;
	this.leftarm4.rotateAngleZ=this.bipedLeftArm.rotateAngleZ+0.0743572F;

	this.leftarm5.rotateAngleX=-this.bipedLeftArm.rotateAngleX+0.0698132F;
	this.leftarm5.rotateAngleY=this.bipedLeftArm.rotateAngleY+3.141593F;
	this.leftarm5.rotateAngleZ=this.bipedLeftArm.rotateAngleZ+0.4833219F;

	this.leftarm6.rotateAngleX=-this.bipedLeftArm.rotateAngleX;
	this.leftarm6.rotateAngleY=this.bipedLeftArm.rotateAngleY-3.141593F;
	this.leftarm6.rotateAngleZ=this.bipedLeftArm.rotateAngleZ+0.0743572F;

	this.leftarm7.rotateAngleX=-this.bipedLeftArm.rotateAngleX;
	this.leftarm7.rotateAngleY=this.bipedLeftArm.rotateAngleY+3.141593F;
	this.leftarm7.rotateAngleZ=this.bipedLeftArm.rotateAngleZ;

	this.leftarm8.rotateAngleX=-this.bipedLeftArm.rotateAngleX;
	this.leftarm8.rotateAngleY=this.bipedLeftArm.rotateAngleY+3.141593F;
	this.leftarm8.rotateAngleZ=this.bipedLeftArm.rotateAngleZ;


	this.rightarm1.rotateAngleX=this.bipedRightArm.rotateAngleX -0.0698132F;
	this.rightarm1.rotateAngleY=this.bipedRightArm.rotateAngleY;
	this.rightarm1.rotateAngleZ=this.bipedRightArm.rotateAngleZ -0.4833219F;

	this.rightarm2.rotateAngleX=this.bipedRightArm.rotateAngleX;
	this.rightarm2.rotateAngleY=this.bipedRightArm.rotateAngleY;
	this.rightarm2.rotateAngleZ=this.bipedRightArm.rotateAngleZ;

	this.rightarm3.rotateAngleX=this.bipedRightArm.rotateAngleX;
	this.rightarm3.rotateAngleY=this.bipedRightArm.rotateAngleY;
	this.rightarm3.rotateAngleZ=this.bipedRightArm.rotateAngleZ-0.4833219F;

	this.rightarm4.rotateAngleX=this.bipedRightArm.rotateAngleX;
	this.rightarm4.rotateAngleY=this.bipedRightArm.rotateAngleY;
	this.rightarm4.rotateAngleZ=this.bipedRightArm.rotateAngleZ-0.0743572F;

	this.rightarm5.rotateAngleX=this.bipedRightArm.rotateAngleX-0.0698132F;
	this.rightarm5.rotateAngleY=this.bipedRightArm.rotateAngleY;
	this.rightarm5.rotateAngleZ=this.bipedRightArm.rotateAngleZ-0.0743572F;

	this.rightarm6.rotateAngleX=this.bipedRightArm.rotateAngleX+0.0698132F;
	this.rightarm6.rotateAngleY=this.bipedRightArm.rotateAngleY;
	this.rightarm6.rotateAngleZ=this.bipedRightArm.rotateAngleZ-0.0743572F;

	this.rightarm7.rotateAngleX=this.bipedRightArm.rotateAngleX+0.0698132F;
	this.rightarm7.rotateAngleY=this.bipedRightArm.rotateAngleY;
	this.rightarm7.rotateAngleZ=this.bipedRightArm.rotateAngleZ-0.4833219F;

	this.rightarm8.rotateAngleX=this.bipedRightArm.rotateAngleX;
	this.rightarm8.rotateAngleY=this.bipedRightArm.rotateAngleY;
	this.rightarm8.rotateAngleZ=this.bipedRightArm.rotateAngleZ;


	this.body1.rotateAngleX=this.bipedBody.rotateAngleX-0.5683164F;
	this.body1.rotateAngleY=this.bipedBody.rotateAngleY;
	this.body1.rotateAngleZ=-this.bipedBody.rotateAngleZ+0.1745329F;

	this.body2.rotateAngleX=this.bipedBody.rotateAngleX+0.3717861F;
	this.body2.rotateAngleY=this.bipedBody.rotateAngleY;
	this.body2.rotateAngleZ=-this.bipedBody.rotateAngleZ;

	this.body3.rotateAngleX=this.bipedBody.rotateAngleX+0.5205006F;
	this.body3.rotateAngleY=this.bipedBody.rotateAngleY;
	this.body3.rotateAngleZ=-this.bipedBody.rotateAngleZ;

	this.body4.rotateAngleX=this.bipedBody.rotateAngleX-0.1342251F;
	this.body4.rotateAngleY=this.bipedBody.rotateAngleY;
	this.body4.rotateAngleZ=this.bipedBody.rotateAngleZ;

	this.body5.rotateAngleX=this.bipedBody.rotateAngleX-0.5683164F;
	this.body5.rotateAngleY=this.bipedBody.rotateAngleY;
	this.body5.rotateAngleZ=-this.bipedBody.rotateAngleZ-0.1745329F;

	this.body6.rotateAngleX=this.bipedBody.rotateAngleX-0.122173F;
	this.body6.rotateAngleY=this.bipedBody.rotateAngleY;
	this.body6.rotateAngleZ=-this.bipedBody.rotateAngleZ+0.0872665f;

	this.body7.rotateAngleX=this.bipedBody.rotateAngleX-0.122173F;
	this.body7.rotateAngleY=this.bipedBody.rotateAngleY;
	this.body7.rotateAngleZ=-this.bipedBody.rotateAngleZ-0.0872665F;

	this.body8.rotateAngleX=this.bipedBody.rotateAngleX+0.3717861F;
	this.body8.rotateAngleY=this.bipedBody.rotateAngleY;
	this.body8.rotateAngleZ=-this.bipedBody.rotateAngleZ;

	this.body9.rotateAngleX=this.bipedBody.rotateAngleX+0.3717861F;
	this.body9.rotateAngleY=this.bipedBody.rotateAngleY;
	this.body9.rotateAngleZ=-this.bipedBody.rotateAngleZ;

	this.body10.rotateAngleX=this.bipedBody.rotateAngleX;
	this.body10.rotateAngleY=this.bipedBody.rotateAngleY;
	this.body10.rotateAngleZ=-this.bipedBody.rotateAngleZ;

	this.body11.rotateAngleX=this.bipedBody.rotateAngleX-0.1858931F;
	this.body11.rotateAngleY=this.bipedBody.rotateAngleY;
	this.body11.rotateAngleZ=this.bipedBody.rotateAngleZ;

	this.body12.rotateAngleX=this.bipedBody.rotateAngleX-0.5948578F;
	this.body12.rotateAngleY=this.bipedBody.rotateAngleY;
	this.body12.rotateAngleZ=this.bipedBody.rotateAngleZ;

	this.body13.rotateAngleX=this.bipedBody.rotateAngleX+0.4978113F;
	this.body13.rotateAngleY=this.bipedBody.rotateAngleY;
	this.body13.rotateAngleZ=this.bipedBody.rotateAngleZ;

	this.body14.rotateAngleX=this.bipedBody.rotateAngleX-0.914976F;
	this.body14.rotateAngleY=this.bipedBody.rotateAngleY;
	this.body14.rotateAngleZ=this.bipedBody.rotateAngleZ;

	this.body15.rotateAngleX=this.bipedBody.rotateAngleX+0.4978113F;
	this.body15.rotateAngleY=this.bipedBody.rotateAngleY;
	this.body15.rotateAngleZ=this.bipedBody.rotateAngleZ;

	this.body16.rotateAngleX=this.bipedBody.rotateAngleX+0.4978113F;
	this.body16.rotateAngleY=this.bipedBody.rotateAngleY;
	this.body16.rotateAngleZ=this.bipedBody.rotateAngleZ;

	this.body17.rotateAngleX=-this.bipedBody.rotateAngleX;
	this.body17.rotateAngleY=this.bipedBody.rotateAngleY-2.918522F;
	this.body17.rotateAngleZ=this.bipedBody.rotateAngleZ+0.37179F;

	this.body18.rotateAngleX=this.bipedBody.rotateAngleX;
	this.body18.rotateAngleY=this.bipedBody.rotateAngleY-0.2230717F;
	this.body18.rotateAngleZ=this.bipedBody.rotateAngleZ-0.3717861F;

	this.body19.rotateAngleX=-this.bipedBody.rotateAngleX;
	this.body19.rotateAngleY=this.bipedBody.rotateAngleY-2.918522F;
	this.body19.rotateAngleZ=this.bipedBody.rotateAngleZ+0.37179F;

	this.body20.rotateAngleX=this.bipedBody.rotateAngleX;
	this.body20.rotateAngleY=this.bipedBody.rotateAngleY-0.2230717F;
	this.body20.rotateAngleZ=this.bipedBody.rotateAngleZ-0.3717861F;


}

}
