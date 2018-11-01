package Kamen_Rider_Craft_4TH.model;


import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModelPoppy extends ModelBiped
{

//fields
public ModelRenderer rightchest;
public ModelRenderer head;
public ModelRenderer body;
public ModelRenderer leftchest;
public ModelRenderer rightleg;
public ModelRenderer leftleg;

/**
 * Records whether the model should be rendered holding an item in the left hand, and if that item is a block.
 */
public int heldItemLeft;

/**
 * Records whether the model should be rendered holding an item in the right hand, and if that item is a block.
 */
public int heldItemRight;
public boolean isSneak;


  public ModelPoppy()
  {
    textureWidth = 64;
    textureHeight = 32;
    
      rightchest = new ModelRenderer(this, 12, 17);
      rightchest.addBox(-3.5F, 0F, 0F, 4, 4, 4);
      rightchest.setRotationPoint(-1F, 0.5F, -3F);
      rightchest.setTextureSize(64, 32);
      rightchest.mirror = true;
      setRotation(rightchest, 0.1889913F, 0.1396263F, 0.0523599F);
      
      head = new ModelRenderer(this, 0, 0);
      head.addBox(-4F, -8F, -4F, 8, 8, 8);
      head.setRotationPoint(-0.5F, 0F, 0F);
      head.setTextureSize(64, 32);
      head.mirror = true;
      setRotation(head, 0F, 0F, 0F);

      
      body = new ModelRenderer(this, 12, 16);
      body.addBox(-4F, 0F, -2F, 7, 12, 4);
      body.setRotationPoint(0F, 0F, 0F);
      body.setTextureSize(64, 32);
      body.mirror = true;
      setRotation(body, 0F, 0F, 0F);
      
      leftchest = new ModelRenderer(this, 15, 17);
      leftchest.addBox(-0.5F, 0F, 0F, 4, 4, 4);
      leftchest.setRotationPoint(0F, 0.5F, -3F);
      leftchest.setTextureSize(64, 32);
      leftchest.mirror = true;
      setRotation(leftchest, 0.1889913F, -0.1396263F, -0.0523599F);
      

      this.bipedRightArm = new ModelRenderer(this, 35, 17);
      this.bipedRightArm.addBox(-1.5F, -2F, -1.5F, 3, 12, 3);
      this.bipedRightArm.setRotationPoint(-3.5F, 2F, 0F);
      setRotation(bipedRightArm, 0F, 0F, 0.0872665F);
      
      this.bipedLeftArm = new ModelRenderer(this, 35, 17);
      this.bipedLeftArm.addBox(-2.5F, -2F, -1.5F, 3, 12, 3);  
      this.bipedLeftArm.setRotationPoint(3.5F, 2F, 0F);
      this.bipedLeftArm.setTextureSize(64, 32);
      setRotation(bipedLeftArm, 0F, 0F, -0.0872665F);
      
      
      rightleg = new ModelRenderer(this, 0, 16);
      rightleg.addBox(-1.5F, 0F, -1.5F, 3, 12, 3);
      rightleg.setRotationPoint(-2F, 12F, 0F);
      rightleg.setTextureSize(64, 32);
      rightleg.mirror = false;
      setRotation(rightleg, 0F, 0F, 0F);
      
      leftleg = new ModelRenderer(this, 0, 16);
      leftleg.addBox(-1.5F, 0F, -1.5F, 3, 12, 3);
      leftleg.setRotationPoint(1F, 12F, 0F);
      leftleg.setTextureSize(64, 32);
      leftleg.mirror = true;
      setRotation(leftleg, 0F, 0F, 0F);

  }

public void render(Entity par1Entity, float par2, float par3, float par4, float par5, float par6, float par7)
{
    this.setRotationAngles(par2, par3, par4, par5, par6, par7, par1Entity);

    {
        this.body.render(par7);
        this.bipedHead.render(par7);
        this.bipedHeadwear.render(par7);
        this.bipedRightArm.render(par7);
        this.bipedLeftArm.render(par7);
        this.rightleg.render(par7);
        this.leftleg.render(par7);
        //this.rightchest.render(par7);
        //this.leftchest.render(par7);

        
    }
}

/**
 * Sets the model's various rotation angles. For bipeds, par1 and par2 are used for animating the movement of arms
 * and legs, where par1 represents the time(so that arms and legs swing back and forth) and par2 represents how
 * "far" arms and legs can swing at most.
 */
public void setRotationAngles(float par1, float par2, float par3, float par4, float par5, float par6, Entity par7Entity)
{
	//super.setRotationAngles(par1, par2, par3, par4, par5, par6, par7Entity);
    this.bipedHead.rotateAngleY = par4 / (180F / (float)Math.PI);
    this.bipedHead.rotateAngleX = par5 / (180F / (float)Math.PI);
    
    this.bipedHeadwear.rotateAngleY = par4 / (180F / (float)Math.PI);
    this.bipedHeadwear.rotateAngleX = par5 / (180F / (float)Math.PI);
  
    this.bipedRightArm.rotateAngleX = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 2.0F * par2 * 0.5F;
    this.bipedLeftArm.rotateAngleX = MathHelper.cos(par1 * 0.6662F) * 2.0F * par2 * 0.5F;
    this.bipedRightArm.rotateAngleZ = 0.0F+0.0872665F;
    this.bipedLeftArm.rotateAngleZ = 0.0F;
    this.rightleg.rotateAngleX = MathHelper.cos(par1 * 0.6662F) * 1.4F * par2;
    this.leftleg.rotateAngleX = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 1.4F * par2;
    this.rightleg.rotateAngleY = 0.0F;
    this.leftleg.rotateAngleY = 0.0F;
    this.bipedRightArm.offsetX=(float) -0.1;
    this.bipedLeftArm.offsetX=(float) 0.1;
    
    if (this.isRiding)
    {
        this.bipedRightArm.rotateAngleX += -((float)Math.PI / 5F);
        this.bipedLeftArm.rotateAngleX += -((float)Math.PI / 5F);
        this.rightleg.rotateAngleX = -((float)Math.PI * 2F / 5F);
        this.leftleg.rotateAngleX = -((float)Math.PI * 2F / 5F);
        this.rightleg.rotateAngleY = ((float)Math.PI / 10F);
        this.leftleg.rotateAngleY = -((float)Math.PI / 10F);
    }
    if (this.heldItemLeft != 0)
    {
        this.bipedLeftArm.rotateAngleX = this.bipedLeftArm.rotateAngleX * 0.5F - ((float)Math.PI / 10F) * (float)this.heldItemLeft;
    }

    if (this.heldItemRight != 0)
    {
        this.bipedRightArm.rotateAngleX = this.bipedRightArm.rotateAngleX * 0.5F - ((float)Math.PI / 10F) * (float)this.heldItemRight;
    }

    this.bipedRightArm.rotateAngleY = 0.0F;
    this.bipedLeftArm.rotateAngleY = 0.0F;
    float f6;
    float f7;

   


   
        this.body.rotateAngleX = 0.0F;
        this.rightleg.rotationPointZ = 0.1F;
        this.leftleg.rotationPointZ = 0.1F;
        this.rightleg.rotationPointY = 12.0F;
        this.leftleg.rotationPointY = 12.0F;
        this.head.rotationPointY = 0.0F;
   

    this.bipedRightArm.rotateAngleZ += MathHelper.cos(par3 * 0.09F) * 0.05F + 0.05F;
    this.bipedLeftArm.rotateAngleZ -= MathHelper.cos(par3 * 0.09F) * 0.05F + 0.05F;
    this.bipedRightArm.rotateAngleX += MathHelper.sin(par3 * 0.067F) * 0.05F;
    this.bipedLeftArm.rotateAngleX -= MathHelper.sin(par3 * 0.067F) * 0.05F;


}
private void setRotation(ModelRenderer model, float x, float y, float z)
{
  model.rotateAngleX = x;
  model.rotateAngleY = y;
  model.rotateAngleZ = z;
}

}
