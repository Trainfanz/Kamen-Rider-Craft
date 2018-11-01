package Kamen_Rider_Craft_4TH.model;

import org.lwjgl.opengl.GL11;

import Kamen_Rider_Craft_4TH.RiderItems;
import Kamen_Rider_Craft_4TH.item.drive.item_drivedriver;
import Kamen_Rider_Craft_4TH.util.Refercence;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;;



@SideOnly(Side.CLIENT)
public class type_tire extends ModelBiped
{
	
	public ItemStack belt;

	//fields
	public ModelRenderer Shape1;

	public ModelRenderer Shape2;

	public ModelRenderer leftarmt;
	public ModelRenderer rightarmt;
	public ModelRenderer body1;
	public ModelRenderer body2;
	public ModelRenderer body3;
	public ModelRenderer body4;
	public ModelRenderer body5;
	public ModelRenderer body6;
	public ModelRenderer body7;
	public ModelRenderer body8;
	public ModelRenderer body9;
	public ModelRenderer body10;

	public type_tire()
	{
		textureWidth = 64;
		textureHeight = 64;

		Shape1 = new ModelRenderer(this, 0, 34);
		Shape1.addBox(0F, -2F, -5F, 4, 10, 10);
		Shape1.setRotationPoint(0F, 0.5F, -2F);
		Shape1.setTextureSize(64, 64);
		Shape1.mirror = true;
		setRotation(Shape1, 0.7853982F, 0F, 0.7853982F);

		Shape2 = new ModelRenderer(this, 0, 34);
		Shape2.addBox(-5F, -6F, -4F, 4, 10, 10);
		Shape2.setRotationPoint(-5F, 2F, 0F);
		Shape2.setTextureSize(64, 64);
		Shape2.mirror = true;
		setRotation(Shape2, 0.7853982F, 0F, 0F);

		leftarmt = new ModelRenderer(this, 40, 54);
		leftarmt.addBox(-2F, 3F, -3F, 6, 3, 6);
		leftarmt.setRotationPoint(5F, 2F, 0F);
		leftarmt.setTextureSize(64, 64);
		leftarmt.mirror = true;
		setRotation(leftarmt, 0F, 0F, 0F);

		rightarmt = new ModelRenderer(this, 40, 44);
		rightarmt.addBox(-4F, 3F, -3F, 6, 3, 6);
		rightarmt.setRotationPoint(-5F, 2F, 0F);
		rightarmt.setTextureSize(64, 64);
		rightarmt.mirror = true;
		setRotation(rightarmt, 0F, 0F, 0F);

		body1 = new ModelRenderer(this, 20, 53);
		body1.addBox(-2F, 0F, -8F, 4, 5, 6);
		body1.setRotationPoint(0F, 0F, 0F);
		body1.setTextureSize(64, 64);
		body1.mirror = true;
		setRotation(body1, 0.125F, 0F, 0F);

		body2 = new ModelRenderer(this, 5, 42);
		body2.addBox(-4F, 0F, 5F, 8, 1, 4);
		body2.setRotationPoint(0F, 0F, 0F);
		body2.setTextureSize(64, 64);
		body2.mirror = true;
		setRotation(body2, 0.5F, 0F, 0F);


		body3 = new ModelRenderer(this, 0, 56);
		body3.addBox(4F, -6F, 5F, 1, 4, 4);
		body3.setRotationPoint(0F, 0F, 0F);
		body3.setTextureSize(64, 64);
		body3.mirror = true;
		setRotation(body3, 0F, 0F, 0F);
		body3.mirror = false;

		body4 = new ModelRenderer(this, 41, 35);
		body4.addBox(-0.5F, -6F, 5F, 1, 4, 4);
		body4.setRotationPoint(0F, 0F, 0F);
		body4.setTextureSize(64, 64);
		body4.mirror = true;
		setRotation(body4, 0F, 0F, 0F);

		body5 = new ModelRenderer(this, 52, 34);
		body5.addBox(1F, -2F, 2F, 1, 4, 5);
		body5.setRotationPoint(0F, 0F, 0F);
		body5.setTextureSize(64, 64);
		body5.mirror = true;
		setRotation(body5, 0F, 0F, 0F);

		body6 = new ModelRenderer(this, 52, 34);
		body6.addBox(-2F, -2F, 2F, 1, 4, 5);
		body6.setRotationPoint(0F, 0F, 0F);
		body6.setTextureSize(64, 64);
		body6.mirror = true;
		setRotation(body6, 0F, 0F, 0F);

		body7 = new ModelRenderer(this, 1, 48);
		body7.addBox(-6F, 0F, -8F, 12, 1, 4);
		body7.setRotationPoint(0F, 0F, 0F);
		body7.setTextureSize(64, 64);
		body7.mirror = true;
		setRotation(body7, 0.5F, 0F, 0F);

		body8 = new ModelRenderer(this, 10, 56);
		body8.addBox(6F, 1F, -7F, 1, 4, 4);
		body8.setRotationPoint(0F, 0F, 0F);
		body8.setTextureSize(64, 64);
		body8.mirror = true;
		setRotation(body8, 0F, 0F, 0F);

		body9 = new ModelRenderer(this, 10, 56);
		body9.addBox(-7F, 1F, -7F, 1, 4, 4);
		body9.setRotationPoint(0F, 0F, 0F);
		body9.setTextureSize(64, 64);
		body9.mirror = true;
		setRotation(body9, 0F, 0F, 0F);

		body10 = new ModelRenderer(this, 0, 56);
		body10.addBox(-5F, -6F, 5F, 1, 4, 4);
		body10.setRotationPoint(0F, 0F, 0F);
		body10.setTextureSize(64, 64);
		body10.mirror = true;
		setRotation(body10, 0F, 0F, 0F);
	}

	private void setRotation(ModelRenderer model, float x, float y, float z)
	{
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}


	public void render(Entity par1Entity, float par2, float par3, float par4, float par5, float par6, float par7)
	{
		//  super.render(par1Entity, par2,par3,par4,par5,par6,par7);
		this.setRotationAngles(par2,par3,par4,par5,par6,par7, par1Entity);


		if (par1Entity instanceof EntityLivingBase){
			EntityLivingBase player = ((EntityLivingBase)par1Entity);


			if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET)!=null){
				if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem()== RiderItems.break_gunner_2){
					
				}
				else if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.mach_driver_honoh){

					if (item_drivedriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))==1||item_drivedriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))==4){
						GL11.glPushMatrix();
						GL11.glScalef(1.2f, 1.2f, 1.2f);
						if (this.isSneak){
							this.Shape1.offsetY=0.1f;
						}
						this.Shape1.render(par7);
						GL11.glPopMatrix();
						GL11.glPushMatrix();
						GL11.glScalef(0.75f, 0.75f, 0.75f);
						if (this.isSneak){
							this.Shape2.offsetY=0.2f;
						}
						this.Shape2.rotateAngleY=Shape2.rotateAngleY-0.9F;
						GL11.glTranslatef(-0.25f, -0f, 0f);
						Minecraft.getMinecraft().renderEngine.bindTexture(new ResourceLocation(Refercence.MODID+":textures/armor/kourin_dead_heat_tire.png"));
						this.Shape2.render(par7);
						GL11.glPopMatrix();


					}else if (item_drivedriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))==2||item_drivedriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))==7){
						GL11.glPushMatrix();
						GL11.glScalef(0.75f, 0.75f, 0.75f);
						this.Shape2.rotateAngleY=Shape2.rotateAngleY+1.52F;
						if (player.isSneaking()){
							this.Shape2.rotateAngleZ=this.Shape2.rotateAngleZ-1.5f;
							this.Shape2.rotateAngleX=this.Shape2.rotateAngleX-1.5f;
							this.Shape2.offsetY=0.2f;
						}
						
						GL11.glTranslatef(+0.3f, 0.3f, 0.1f);
						this.Shape2.render(par7);
						GL11.glPopMatrix();
					}else if (item_drivedriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))==5){
						
					}else{
						GL11.glPushMatrix();
						GL11.glScalef(0.75f, 0.75f, 0.75f);
						if (this.isSneak){
							this.Shape2.offsetY=0.2f;
						}
						this.Shape2.rotateAngleY=Shape2.rotateAngleY-0.9F;
						
						GL11.glTranslatef(-0.25f, -0f, 0f);
						this.Shape2.render(par7);
						GL11.glPopMatrix();
					}
				}else if (item_drivedriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))==1){
					GL11.glPushMatrix();
					if (this.isSneak){
						this.Shape2.offsetY=0.2f;
					}
					this.Shape2.render(par7);
					GL11.glPopMatrix();
				}else if (item_drivedriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))==7){
					GL11.glPushMatrix();
					
					GL11.glScalef(1.3F, 1.3F, 1.3F);

					this.leftarmt.offsetY=-0.05f;
					this.leftarmt.offsetX=-0.07f;

					this.rightarmt.offsetY=-0.05f;
					this.rightarmt.offsetX=0.07f;


					if (this.isSneak){
						this.rightarmt.offsetZ=-0.01f;
						this.leftarmt.offsetZ=-0.01f;

					}
					if (this.isSneak){
						this.leftarmt.offsetY=0.1f;
						this.rightarmt.offsetY=0.1f;
					}

					leftarmt.render(par7);
					rightarmt.render(par7);
					GL11.glPopMatrix();
					GL11.glPushMatrix();
					if (this.isSneak){
						this.body1.offsetY=0.1f;
						this.body2.offsetY=0.1f;
						this.body3.offsetY=0.1f;
						this.body4.offsetY=0.1f;
						this.body5.offsetY=0.1f;
						this.body6.offsetY=0.1f;
						this.body7.offsetY=0.1f;
						this.body8.offsetY=0.1f;
						this.body9.offsetY=0.1f;
						this.body10.offsetY=0.1f;
						
						this.body1.offsetZ=-0.1f;
						this.body2.offsetZ=-0.1f;
						this.body3.offsetZ=-0.1f;
						this.body4.offsetZ=-0.1f;
						this.body5.offsetZ=-0.1f;
						this.body6.offsetZ=-0.1f;
						this.body7.offsetZ=-0.1f;
						this.body8.offsetZ=-0.1f;
						this.body9.offsetZ=-0.1f;
						this.body10.offsetZ=-0.1f;
					}
					body1.render(par7);
					body2.render(par7);
					body3.render(par7);
					body4.render(par7);
					body5.render(par7);
					body6.render(par7);
					body7.render(par7);
					body8.render(par7);
					body9.render(par7);
					body10.render(par7);
					GL11.glPopMatrix();
				}else if (item_drivedriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))==6){
					GL11.glPushMatrix();
					GL11.glScalef(1.2f, 1.2f, 1.2f);
					if (this.isSneak){
						this.Shape1.offsetY=0.1f;
					}
					this.Shape1.render(par7);
					GL11.glPopMatrix();
					GL11.glPushMatrix();
					if (this.isSneak){
						this.Shape2.offsetY=0.2f;
					}
					GL11.glScalef(0.75f, 0.75f, 0.75f);
					this.Shape2.rotateAngleY=Shape2.rotateAngleY-0.9F;
					GL11.glTranslatef(-0.25f, -0f, 0f);
					Minecraft.getMinecraft().renderEngine.bindTexture(new ResourceLocation(Refercence.MODID+":textures/armor/kourin_dead_heat_tire.png"));
					this.Shape2.render(par7);
					GL11.glPopMatrix();

				}else if (item_drivedriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))==4){
					GL11.glPushMatrix();
					GL11.glScalef(1f, 1f, 1f);
					GL11.glTranslatef(0.1f, -0f, 0f);
					this.Shape1.rotateAngleZ=Shape1.rotateAngleZ+0.7853982F;
					if (this.isSneak){
						this.Shape1.offsetY=0.2f;
					}
					this.Shape1.render(par7);
					
					GL11.glPopMatrix();
				}else if (item_drivedriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))==8||item_drivedriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))==12){
					GL11.glPushMatrix();
					GL11.glScalef(1f, 1f, 1f);
					GL11.glTranslatef(0.2f, -0f, 0f);
					this.Shape1.rotateAngleZ=Shape1.rotateAngleZ-0.4853982F;
					if (this.isSneak){
						this.Shape1.offsetY=0.2f;
					}
					this.Shape1.render(par7);
					GL11.glPopMatrix();
				}else{
					GL11.glPushMatrix();
					if (this.isSneak){
						this.Shape1.offsetY=0.1f;
					}
					GL11.glScalef(1.2f, 1.2f, 1.2f);
					this.Shape1.render(par7);
					GL11.glPopMatrix();

				}
				GL11.glPushMatrix();

				if(player.isSneaking()){
					GL11.glRotatef(20, 1, 0, 0);	
				}

				double dri = 0; 
				GL11.glRotatef(180, 0, 1, 0);

				GL11.glRotatef(180, 0, 0, 1);
				//EntityItem entItem= new EntityItemFrame(player.worldObj);
				//RenderEntityItem.doRender(entItem,4,-0.9,0.17,0,0);
				// Minecraft.getMinecraft().getRenderItem().renderItemModel(stack);
				GL11.glScaled(0.5, 0.5,0.6);

				GL11.glTranslatef((float) (0f+dri),-1.5f,0.3f);
				
				Minecraft.getMinecraft().getItemRenderer().renderItem(player,belt,null);
				
				GL11.glPopMatrix();
			}
		}
	}

	/**
	 * Sets the model's various rotation angles. For bipeds, par1 and par2 are used for animating the movement of arms
	 * and legs, where par1 represents the time(so that arms and legs swing back and forth) and par2 represents how
	 * "far" arms and legs can swing at most.
	 */  

	public void setRotationAngles(float par1, float par2, float par3, float par4, float par5, float par6, Entity par7Entity)
	{
		super.setRotationAngles(par1,par2,par3,par4,par5,par6, par7Entity);

		EntityLivingBase player = ((EntityLivingBase)par7Entity);
		body1.rotateAngleX=bipedBody.rotateAngleX+0.125F;
		body1.rotateAngleY=bipedBody.rotateAngleY;
		body1.rotateAngleZ=bipedBody.rotateAngleZ;
		
		body2.rotateAngleX=bipedBody.rotateAngleX+0.5f;
		body2.rotateAngleY=bipedBody.rotateAngleY;
		body2.rotateAngleZ=bipedBody.rotateAngleZ;
		
		body3.rotateAngleX=bipedBody.rotateAngleX;
		body3.rotateAngleY=bipedBody.rotateAngleY;
		body3.rotateAngleZ=bipedBody.rotateAngleZ;
		
		body4.rotateAngleX=bipedBody.rotateAngleX;
		body4.rotateAngleY=bipedBody.rotateAngleY;
		body4.rotateAngleZ=bipedBody.rotateAngleZ;
		
		body5.rotateAngleX=bipedBody.rotateAngleX;
		body5.rotateAngleY=bipedBody.rotateAngleY;
		body5.rotateAngleZ=bipedBody.rotateAngleZ;
		
		body6.rotateAngleX=bipedBody.rotateAngleX;
		body6.rotateAngleY=bipedBody.rotateAngleY;
		body6.rotateAngleZ=bipedBody.rotateAngleZ;
		
		body7.rotateAngleX=bipedBody.rotateAngleX+0.5f;
		body7.rotateAngleY=bipedBody.rotateAngleY;
		body7.rotateAngleZ=bipedBody.rotateAngleZ;
		
		body8.rotateAngleX=bipedBody.rotateAngleX;
		body8.rotateAngleY=bipedBody.rotateAngleY;
		body8.rotateAngleZ=bipedBody.rotateAngleZ;
		
		body9.rotateAngleX=bipedBody.rotateAngleX;
		body9.rotateAngleY=bipedBody.rotateAngleY;
		body9.rotateAngleZ=bipedBody.rotateAngleZ;
		
		body10.rotateAngleX=bipedBody.rotateAngleX;
		body10.rotateAngleY=bipedBody.rotateAngleY;
		body10.rotateAngleZ=bipedBody.rotateAngleZ;
		
		rightarmt.rotateAngleX=+bipedRightArm.rotateAngleX;
		rightarmt.rotateAngleY=+bipedRightArm.rotateAngleY;
		rightarmt.rotateAngleZ=+bipedRightArm.rotateAngleZ;

		leftarmt.rotateAngleX=+bipedLeftArm.rotateAngleX;
		leftarmt.rotateAngleY=+bipedLeftArm.rotateAngleY;
		leftarmt.rotateAngleZ=+bipedLeftArm.rotateAngleZ;

		
		if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET)!=null){

			if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.mach_driver_honoh){
				//Shape2.rotateAngleX=+bipedRightArm.rotateAngleZ;
				//Shape2.rotateAngleY=+bipedRightArm.rotateAngleY;
				//Shape2.rotateAngleZ=+bipedRightArm.rotateAngleX;

			}else if (item_drivedriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))!=6){
				
				Shape2.rotateAngleX=+bipedRightArm.rotateAngleX+0.7853982F;
				Shape2.rotateAngleY=+bipedRightArm.rotateAngleY;
				Shape2.rotateAngleZ=+bipedRightArm.rotateAngleZ;
				}
		}
	}

}