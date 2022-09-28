
package Kamen_Rider_Craft_4TH.model;

import org.lwjgl.opengl.GL11;

import Kamen_Rider_Craft_4TH.RiderItems;
import Kamen_Rider_Craft_4TH.ShowaRiderItems;
import Kamen_Rider_Craft_4TH.item.fourze.item_Fourzedriver;
import Kamen_Rider_Craft_4TH.item.ooo.item_OOOdriver;
import Kamen_Rider_Craft_4TH.item.rider_armor_base.item_rider_driver;
import Kamen_Rider_Craft_4TH.potion.PotionCore;
import Kamen_Rider_Craft_4TH.util.Refercence;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityArmorStand;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;


public class tokuArmorModel2 extends ModelBiped
{
	public ModelRenderer bipedHead2;
	public ModelRenderer bipedHeadwear2;
	
		
	public ModelRenderer bipedBody2;
	public ModelRenderer bipedBody3;
	
	
	/** The Biped's Right Arm */
	public ModelRenderer bipedRightArm2;
	/** The Biped's Left Arm */
	public ModelRenderer bipedLeftArm2;
	/** The Biped's Right Leg */
	public ModelRenderer bipedRightLeg2;
	/** The Biped's Left Leg */
	public ModelRenderer bipedLeftLeg2;

	public ModelRenderer bigBipedHead2;
	public ModelRenderer bigBipedHeadwear2;
	
	
	public ModelRenderer bigBipedBody2;
	public ModelRenderer bigBipedBody3;
	
	public ModelRenderer big2BipedHead2;
	public ModelRenderer big2BipedHeadwear2;
	
	public ModelRenderer big2BipedBody2;
	public ModelRenderer big2BipedBody3;
	
	/** The Biped's Right Arm */
	public ModelRenderer bigBipedRightArm2;
	/** The Biped's Left Arm */
	public ModelRenderer bigBipedLeftArm2;
	/** The Biped's Right Leg */
	public ModelRenderer bigBipedRightLeg2;
	/** The Biped's Left Leg */
	public ModelRenderer bigBipedLeftLeg2;
	
	public Class<? extends item_rider_driver> base;  
	
	public tokuArmorModel2()
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
		
		 this.bigBipedHead2 = new ModelRenderer(this, 0, 0);
	        this.bigBipedHead2.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8, 1);
	        this.bigBipedHead2.setRotationPoint(0.0F, 0.0F, 0.0F);
	        
	        this.bigBipedHeadwear2 = new ModelRenderer(this, 32, 0);
	        this.bigBipedHeadwear2.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8, 1 + 0.5F);
	        this.bigBipedHeadwear2.setRotationPoint(0.0F, 0.0F, 0.0F);
	  
		this.bigBipedBody2 = new ModelRenderer(this, 16, 16);
		this.bigBipedBody2.addBox(-4.0F, 0.0F, -2.0F, 8, 12, 4, 1);
		this.bigBipedBody2.setRotationPoint(0.0F, 0.0F , 0.0F);

		this.bigBipedBody3 = new ModelRenderer(this, 16, 16);
		this.bigBipedBody3.addBox(-4.0F, 0.0F, -2.0F, 8, 12, 4, 1);
		this.bigBipedBody3.setRotationPoint(0.0F, 0.0F , 0.0F);
		
		this.bigBipedLeftArm2= new ModelRenderer(this, 40, 16);
		this.bigBipedLeftArm2.mirror = true;
		this.bigBipedLeftArm2.addBox(-1.0F, -2.0F, -2.0F, 4, 12, 4, 1);
		this.bigBipedLeftArm2.setRotationPoint(5.0F, 2.0F , 0.0F);
	
		this.bigBipedRightArm2 = new ModelRenderer(this, 40, 16);
		this.bigBipedRightArm2.addBox(-3.0F, -2.0F, -2.0F, 4, 12, 4, 1);
		this.bigBipedRightArm2.setRotationPoint(-5.0F, 2.0F , 0.0F);
		
		this.bigBipedRightLeg2 = new ModelRenderer(this, 0, 16);
		this.bigBipedRightLeg2.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4, 1);
		this.bigBipedRightLeg2.setRotationPoint(-1.9F, 12.0F , 0.0F);
		
		this.bigBipedLeftLeg2 = new ModelRenderer(this, 0, 16);
		this.bigBipedLeftLeg2.mirror = true;
		this.bigBipedLeftLeg2.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4, 1);
		this.bigBipedLeftLeg2.setRotationPoint(1.9F, 12.0F , 0.0F);

		this.big2BipedBody2 = new ModelRenderer(this, 16, 16);
		this.big2BipedBody2.addBox(-4.0F, 0.0F, -2.0F, 8, 12, 4, 1);
		this.big2BipedBody2.setRotationPoint(0.0F, 0.0F , 0.0F);

		this.big2BipedBody3 = new ModelRenderer(this, 16, 16);
		this.big2BipedBody3.addBox(-4.0F, 0.0F, -2.0F, 8, 12, 4, 1);
		this.big2BipedBody3.setRotationPoint(0.0F, 0.0F , 0.0F);

		 this.big2BipedHead2 = new ModelRenderer(this, 0, 0);
	        this.big2BipedHead2.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8, 1);
	        this.big2BipedHead2.setRotationPoint(0.0F, 0.0F, 0.0F);
	        
	        this.big2BipedHeadwear2 = new ModelRenderer(this, 32, 0);
	        this.big2BipedHeadwear2.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8, 1 + 0.5F);
	        this.big2BipedHeadwear2.setRotationPoint(0.0F, 0.0F, 0.0F);
	
	}
	
	
	
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{

		this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);

		float height=1;
		float height2=0;
		item_rider_driver belt = (item_rider_driver)ShowaRiderItems.typhoon_ichigo;
		int[] Text= new int[] {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1};

		if (entity instanceof EntityLivingBase){
			EntityLivingBase player =((EntityLivingBase) entity);
			if (  player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() instanceof item_rider_driver){
			belt = (item_rider_driver) player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem();
			}
		}	
		
		if (belt.getTexture(entity,2,"")!="blank"){
			GL11.glPushMatrix();
		GL11.glScalef(1F*height, 1F*height, 1F*height);

		if (entity.isSneaking()){
			GL11.glTranslatef(0, 0.2F, 0);

		}else {
			GL11.glTranslatef(0, -0.02F+(height/25), 0);
		}
		GL11.glTranslatef(0,height2,0);
		Minecraft.getMinecraft().renderEngine.bindTexture(new ResourceLocation(belt.getTexture(entity,2,"_2.png")));

		this.bipedLeftArm2.offsetX=0.02f;
		this.bipedLeftArm2.render(f5);

		GL11.glPopMatrix();
	}
		if (belt.getTexture(entity,5,"")!="blank"){
			GL11.glPushMatrix();
		GL11.glScalef(1F*height, 1F*height, 1F*height);

		if (entity.isSneaking()){
			GL11.glTranslatef(0, 0.2F, 0);

		}else {
			GL11.glTranslatef(0, -0.02F+(height/25), 0);
		}
		GL11.glTranslatef(0,height2,0);
		Minecraft.getMinecraft().renderEngine.bindTexture(new ResourceLocation(belt.getTexture(entity,5,"_1.png")));

		this.bipedRightArm2.offsetX=-0.02f;
		this.bipedRightArm2.render(f5);
		GL11.glPopMatrix();
	}
		if (belt.getTexture(entity,3,"")!="blank"){
		GL11.glPushMatrix();
		GL11.glScalef(0.9F*height, 0.9F*height, 0.9F*height);


		if (entity.isSneaking()){
			GL11.glTranslatef(0, 0.3F, 0);

		}else {
			GL11.glTranslatef(0, 0.12F, 0);


		}
		GL11.glTranslatef(0,height2,0);
		Minecraft.getMinecraft().renderEngine.bindTexture(new ResourceLocation(belt.getTexture(entity,3,"_1.png")));
		this.bipedLeftLeg2.offsetX=0.045f;
		this.bipedLeftLeg2.render(f5);



		GL11.glPopMatrix();
	}
		if (belt.getTexture(entity,6,"")!="blank"){
		GL11.glPushMatrix();
		GL11.glScalef(0.9F*height, 0.9F*height, 0.9F*height);

		if (entity.isSneaking()){
			GL11.glTranslatef(0, 0.3F, 0);

		}else {
			GL11.glTranslatef(0, 0.12F, 0);

		}
		
		GL11.glTranslatef(0,height2,0);
		Minecraft.getMinecraft().renderEngine.bindTexture(new ResourceLocation(belt.getTexture(entity,6,"_2.png")));
		this.bipedRightLeg2.offsetX=-0.045f;
		this.bipedRightLeg2.render(f5);
		GL11.glPopMatrix();
		}
		GL11.glPushMatrix();
		
		if (belt.getTexture(entity,1,"")!="blank"){
		GL11.glPushMatrix();
		GL11.glScalef(1F*height, 1F*height, 1F*height);
		if(entity.isSneaking()){
			GL11.glTranslatef(0, 0.17F, -0.02f);
		}else{
			GL11.glTranslatef(0, -0F, 0);
		}
		GL11.glTranslatef(0,height2-(height2/10),0);
		Minecraft.getMinecraft().renderEngine.bindTexture(new ResourceLocation(belt.getTexture(entity,1,"_1.png")));
		
		this.bipedHead2.render(f5);
		this.bipedHeadwear2.render(f5);

			GL11.glPopMatrix();
		}
		if (belt.getTexture(entity,7,"")!="blank"){
		GL11.glPushMatrix();
		GL11.glTranslatef(0, 0.05F, 0);

		GL11.glScalef(1F*height, 1F*height, 1F*height);

		if (entity.isSneaking()){
			this.bipedBody3.offsetZ=0.0f;
			this.bipedBody3.offsetY=0.18f;

		}else {
			this.bipedBody3.offsetZ=0.00025f;
		}
		GL11.glTranslatef(0,height2,0);
		Minecraft.getMinecraft().renderEngine.bindTexture(new ResourceLocation(belt.getTexture(entity,7,"_1.png")));
		this.bipedBody3.render(f5);


		GL11.glPopMatrix();
		}
		if (belt.getTexture(entity,8,"")!="blank"){
		GL11.glPushMatrix();


		GL11.glScalef(0.9F*height, 0.9F*height, 0.9F*height);

		if(entity.isSneaking()){
			this.bipedBody2.offsetZ=-0.0f;
			this.bipedBody2.offsetY=0.25f;
		}else{
			this.bipedBody2.offsetZ=0.00025f;
			this.bipedBody2.offsetY=0.05f;
		}
		GL11.glTranslatef(0,height2,0);
		Minecraft.getMinecraft().renderEngine.bindTexture(new ResourceLocation(belt.getTexture(entity,8,"_2.png")));
		this.bipedBody2.render(f5);
		GL11.glPopMatrix();
		}
		if (belt.getTexture(entity,4,"")!="blank"){
		//line x2
		GL11.glPushMatrix();
		GL11.glScalef(1.1F*height, 1.1F*height, 1.1F*height);

		if (entity.isSneaking()){
			GL11.glTranslatef(0, 0.15F, 0f);

		}else {
			GL11.glTranslatef(0, -0.02F+(height/25), 0);
		}
		GL11.glTranslatef(0,height2,0);
		Minecraft.getMinecraft().renderEngine.bindTexture(new ResourceLocation(belt.getTexture(entity,4,"_2.png")));

		this.bigBipedLeftArm2.render(f5);

		GL11.glPopMatrix();
		}
		if (belt.getTexture(entity,9,"")!="blank"){
		GL11.glPushMatrix();
		GL11.glScalef(1.1F*height, 1.1F*height, 1.1F*height);

		if (entity.isSneaking()){
			GL11.glTranslatef(0, 0.15F, 0);

		}else {
			GL11.glTranslatef(0, -0.02F+(height/25), 0);

		}
		GL11.glTranslatef(0,height2,0);
		Minecraft.getMinecraft().renderEngine.bindTexture(new ResourceLocation(belt.getTexture(entity,9,"_1.png")));

		
		this.bigBipedRightArm2.render(f5);
		GL11.glPopMatrix();
		}
		if (belt.getTexture(entity,10,"")!="blank"){
		GL11.glPushMatrix();
		GL11.glScalef(1F*height, 1F*height, 1F*height);

		if (entity.isSneaking()){
			GL11.glTranslatef(0, 0.2F, -0.02f);

		}else {
			GL11.glTranslatef(0, 0.0F, 0);
		}

		GL11.glTranslatef(0,height2,0);
		Minecraft.getMinecraft().renderEngine.bindTexture(new ResourceLocation(belt.getTexture(entity,10,"_1.png")));
		this.bigBipedLeftLeg2.offsetX=0.045f;
		this.bigBipedLeftLeg2.render(f5);

		GL11.glPopMatrix();
		}
		if (belt.getTexture(entity,11,"")!="blank"){
		GL11.glPushMatrix();
		GL11.glScalef(1F*height, 1F*height, 1F*height);


		if (entity.isSneaking()){
			GL11.glTranslatef(0, 0.2F, -0.02f);

		}else {
			GL11.glTranslatef(0, 0F, 0);
		}
		GL11.glTranslatef(0,height2,0);
		Minecraft.getMinecraft().renderEngine.bindTexture(new ResourceLocation(belt.getTexture(entity,11,"_2.png")));
		this.bigBipedRightLeg2.offsetX=-0.045f;
		this.bigBipedRightLeg2.render(f5);
		GL11.glPopMatrix();
		}
		if (belt.getTexture(entity,12,"")!="blank"){
			
		GL11.glPushMatrix();
		GL11.glScalef(1.001F*height, 1.001F*height, 1.001F*height);
		if(entity.isSneaking()){
			GL11.glTranslatef(0, 0.17F, -0.02f);
		}else{
			GL11.glTranslatef(0, -0F, 0);
		}
		GL11.glTranslatef(0,height2-(height2/10),0);
		Minecraft.getMinecraft().renderEngine.bindTexture(new ResourceLocation(belt.getTexture(entity,12,"_1.png")));
		
		this.bigBipedHead2.render(f5);
		this.bigBipedHeadwear2.render(f5);

			GL11.glPopMatrix();
		}
		if (belt.getTexture(entity,13,"")!="blank"){
		GL11.glPushMatrix();
		GL11.glTranslatef(0, 0.05F, 0);

		GL11.glScalef(1.000000001F*height, 1.000000001F*height, 1.000000001F*height);

		if (entity.isSneaking()){
			this.bigBipedBody3.offsetZ=0.0f;
			this.bigBipedBody3.offsetY=0.18f;

		}else {
			this.bigBipedBody3.offsetZ=0.00025f;
		}
		GL11.glTranslatef(0,height2,0);
		Minecraft.getMinecraft().renderEngine.bindTexture(new ResourceLocation(belt.getTexture(entity,13,"_1.png")));
		this.bigBipedBody3.render(f5);


		GL11.glPopMatrix();
		}
		if (belt.getTexture(entity,14,"")!="blank"){
			GL11.glPushMatrix();


		GL11.glScalef(0.901F*height, 0.901F*height, 0.901F*height);

		if(entity.isSneaking()){
			this.bigBipedBody2.offsetZ=-0.0f;
			this.bigBipedBody2.offsetY=0.25f;
		}else{
			this.bigBipedBody2.offsetZ=0.00025f;
			this.bigBipedBody2.offsetY=0.05f;
		}
		GL11.glTranslatef(0,height2,0);
		Minecraft.getMinecraft().renderEngine.bindTexture(new ResourceLocation(belt.getTexture(entity,14,"_2.png")));
		this.bigBipedBody2.render(f5);
		GL11.glPopMatrix();
		}
		if (belt.getTexture(entity,15,"")!="blank"){
			GL11.glPushMatrix();
		GL11.glTranslatef(0, 0.05F, 0);

		GL11.glScalef(1.000000002F*height, 1.000000002F*height, 1.000000002F*height);

		if (entity.isSneaking()){
			this.big2BipedBody3.offsetZ=0.0f;
			this.big2BipedBody3.offsetY=0.18f;

		}else {
			this.big2BipedBody3.offsetZ=0.00025f;
		}
		GL11.glTranslatef(0,height2,0);
		Minecraft.getMinecraft().renderEngine.bindTexture(new ResourceLocation(belt.getTexture(entity,15,"_1.png")));
		this.big2BipedBody3.render(f5);


		GL11.glPopMatrix();
		}
		if (belt.getTexture(entity,17,"")!="blank"){
		GL11.glPushMatrix();
		GL11.glScalef(1.002F*height, 1.002F*height, 1.002F*height);
		if(entity.isSneaking()){
			GL11.glTranslatef(0, 0.17F, -0.02f);
		}else{
			GL11.glTranslatef(0, -0F, 0);
		}
		GL11.glTranslatef(0,height2-(height2/10),0);
		Minecraft.getMinecraft().renderEngine.bindTexture(new ResourceLocation(belt.getTexture(entity,17,"_1.png")));
		
		this.big2BipedHead2.render(f5);
		this.big2BipedHeadwear2.render(f5);

			GL11.glPopMatrix();
		}
		
		if (belt.getTexture(entity,16,"")!="blank"){
		GL11.glPushMatrix();
		GL11.glScalef(0.902F*height, 0.902F*height, 0.902F*height);

		if(entity.isSneaking()){
			this.big2BipedBody2.offsetZ=-0.0f;
			this.big2BipedBody2.offsetY=0.25f;
		}else{
			this.big2BipedBody2.offsetZ=0.00025f;
			this.big2BipedBody2.offsetY=0.05f;
		}
		GL11.glTranslatef(0,height2,0);
		Minecraft.getMinecraft().renderEngine.bindTexture(new ResourceLocation(belt.getTexture(entity,16,"_2.png")));
		this.big2BipedBody2.render(f5);
		GL11.glPopMatrix();
		}
		
		GL11.glPopMatrix();
	}

	public void setRotationAngles(float p_78087_1_, float p_78087_2_, float p_78087_3_, float p_78087_4_, float p_78087_5_, float p_78087_6_, Entity entityIn)
	{
		if (entityIn instanceof EntityArmorStand)
        {
            EntityArmorStand entityarmorstand = (EntityArmorStand)entityIn;
            this.bipedHead.rotateAngleX = 0.017453292F * entityarmorstand.getHeadRotation().getX();
            this.bipedHead.rotateAngleY = 0.017453292F * entityarmorstand.getHeadRotation().getY();
            this.bipedHead.rotateAngleZ = 0.017453292F * entityarmorstand.getHeadRotation().getZ();
            this.bipedHead.setRotationPoint(0.0F, 1.0F, 0.0F);
            this.bipedBody.rotateAngleX = 0.017453292F * entityarmorstand.getBodyRotation().getX();
            this.bipedBody.rotateAngleY = 0.017453292F * entityarmorstand.getBodyRotation().getY();
            this.bipedBody.rotateAngleZ = 0.017453292F * entityarmorstand.getBodyRotation().getZ();
            this.bipedLeftArm.rotateAngleX = 0.017453292F * entityarmorstand.getLeftArmRotation().getX();
            this.bipedLeftArm.rotateAngleY = 0.017453292F * entityarmorstand.getLeftArmRotation().getY();
            this.bipedLeftArm.rotateAngleZ = 0.017453292F * entityarmorstand.getLeftArmRotation().getZ();
            this.bipedRightArm.rotateAngleX = 0.017453292F * entityarmorstand.getRightArmRotation().getX();
            this.bipedRightArm.rotateAngleY = 0.017453292F * entityarmorstand.getRightArmRotation().getY();
            this.bipedRightArm.rotateAngleZ = 0.017453292F * entityarmorstand.getRightArmRotation().getZ();
            this.bipedLeftLeg.rotateAngleX = 0.017453292F * entityarmorstand.getLeftLegRotation().getX();
            this.bipedLeftLeg.rotateAngleY = 0.017453292F * entityarmorstand.getLeftLegRotation().getY();
            this.bipedLeftLeg.rotateAngleZ = 0.017453292F * entityarmorstand.getLeftLegRotation().getZ();
            this.bipedLeftLeg.setRotationPoint(1.9F, 11.0F, 0.0F);
            this.bipedRightLeg.rotateAngleX = 0.017453292F * entityarmorstand.getRightLegRotation().getX();
            this.bipedRightLeg.rotateAngleY = 0.017453292F * entityarmorstand.getRightLegRotation().getY();
            this.bipedRightLeg.rotateAngleZ = 0.017453292F * entityarmorstand.getRightLegRotation().getZ();
            this.bipedRightLeg.setRotationPoint(-1.9F, 11.0F, 0.0F);
            copyModelAngles(this.bipedHead, this.bipedHeadwear);
        }else{
        	super.setRotationAngles(p_78087_1_, p_78087_2_, p_78087_3_, p_78087_4_, p_78087_5_, p_78087_6_, entityIn);
        }
		copyModelAngles(this.bipedBody, this.bipedBody2);
		copyModelAngles(this.bipedBody, this.bipedBody3);
		
		copyModelAngles(this.bipedLeftArm, this.bipedLeftArm2);
		copyModelAngles(this.bipedLeftLeg, this.bipedLeftLeg2);
		copyModelAngles(this.bipedRightArm, this.bipedRightArm2);
		copyModelAngles(this.bipedRightLeg, this.bipedRightLeg2);
		
		copyModelAngles(this.bipedHead, this.bipedHead2);
		copyModelAngles(this.bipedHeadwear, this.bipedHeadwear2);

		copyModelAngles(this.bipedBody, this.bigBipedBody2);
		copyModelAngles(this.bipedBody, this.bigBipedBody3);


		copyModelAngles(this.bipedBody, this.big2BipedBody2);
		copyModelAngles(this.bipedBody, this.big2BipedBody3);
		
		copyModelAngles(this.bipedLeftArm, this.bigBipedLeftArm2);
		copyModelAngles(this.bipedLeftLeg, this.bigBipedLeftLeg2);
		copyModelAngles(this.bipedRightArm, this.bigBipedRightArm2);
		copyModelAngles(this.bipedRightLeg, this.bigBipedRightLeg2);
		
		copyModelAngles(this.bipedHead, this.bigBipedHead2);
		copyModelAngles(this.bipedHeadwear, this.bigBipedHeadwear2);
		
		copyModelAngles(this.bipedHead, this.big2BipedHead2);
		copyModelAngles(this.bipedHeadwear, this.big2BipedHeadwear2);

	}
}

