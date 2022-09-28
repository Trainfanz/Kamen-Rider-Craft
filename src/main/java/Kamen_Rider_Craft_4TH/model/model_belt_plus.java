
package Kamen_Rider_Craft_4TH.model;

import org.lwjgl.opengl.GL11;

import Kamen_Rider_Craft_4TH.ReiwaRiderItems;
import Kamen_Rider_Craft_4TH.RiderItems;
import Kamen_Rider_Craft_4TH.ShowaRiderItems;
import Kamen_Rider_Craft_4TH.item.Ex_Aid.item_ex_aiddriver;
import Kamen_Rider_Craft_4TH.item.gaim.item_Gaimdriver;
import Kamen_Rider_Craft_4TH.item.rider_armor_base.item_rider_driver;
import Kamen_Rider_Craft_4TH.item.zero_one.item_zero_onedriver;
import Kamen_Rider_Craft_4TH.item.zi_o.item_zikudriver;
import Kamen_Rider_Craft_4TH.potion.PotionCore;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class model_belt_plus extends ModelBiped
{
	//fields
	

	public ItemStack belt;
	public ItemStack belt2=new ItemStack(ShowaRiderItems.blanknoitem);
	public ItemStack belt3=new ItemStack(ShowaRiderItems.blanknoitem);
	public ItemStack belt4=new ItemStack(ShowaRiderItems.blanknoitem);
	public ItemStack belt5=new ItemStack(ShowaRiderItems.blanknoitem);
	public ItemStack wings=new ItemStack(ShowaRiderItems.blanknoitem);

	public model_belt_plus()
	{
		textureWidth = 64;
		textureHeight = 128;


	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		
		
		float height=-2f;
		float height2=0f;
		float height4=-1.3f;



		
		this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		if (entity instanceof EntityLivingBase){
			EntityLivingBase living = ((EntityLivingBase)entity);
			ItemStack stack = living.getItemStackFromSlot(EntityEquipmentSlot.FEET);
			
			GL11.glPushMatrix();
			if (wings.getItem()!=ShowaRiderItems.blanknoitem){
			GL11.glPushMatrix();

			if(living.isSneaking()){
				GL11.glRotatef(20, 1, 0, 0);	
			}
			GL11.glRotatef(180, 0, 1, 0);
			GL11.glRotatef(180, 0, 0, 1);
			GL11.glScaled(3,3,1);
			GL11.glTranslatef((float) (0f),-0.05f,-0.2f);
			
			Minecraft.getMinecraft().getItemRenderer().renderItem(living,wings,null);
			GL11.glPopMatrix();
			}
			GL11.glPushMatrix();
		
			if(living.isSneaking()){
				GL11.glRotatef(20, 1, 0, 0);	
			}

			double dri = 0; 
			GL11.glRotatef(180, 0, 1, 0);

			if (living.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem()==RiderItems.OOOdriver)
			{					
				dri = 0.5; 
				GL11.glRotatef(160, 0, 0, 1);
			}else if (living.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem()==ReiwaRiderItems.raidriser_battle
					||living.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem()==ReiwaRiderItems.raidriser_buffalo
					||living.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem()==ReiwaRiderItems.raidriser_whale
					||living.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem()==ReiwaRiderItems.raidriser_lion
					||living.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem()==ReiwaRiderItems.raidriser_penguin
					||living.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem()==ReiwaRiderItems.raidriser_panda
					||living.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem()==ReiwaRiderItems.raidriser_jackal)
			{				
				dri = 0.5; 
				GL11.glTranslated(-0.275,0.1,0.0);
				GL11.glRotatef(135, 0, 0, 1);
			}else {

				GL11.glRotatef(180, 0, 0, 1);
			}

			
		

				GL11.glScaled(0.5, 0.5,0.5);
				GL11.glTranslatef((float) (0f+dri),height4,0.4f);
			
			
			if (living.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem()instanceof item_ex_aiddriver)
			{
			if (living.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem()==RiderItems.gamer_driver_proto_lazer
					||item_ex_aiddriver.get_core(living.getItemStackFromSlot(EntityEquipmentSlot.FEET),"1")==4
					||item_ex_aiddriver.get_core(living.getItemStackFromSlot(EntityEquipmentSlot.FEET),"1")==5
					||item_ex_aiddriver.get_core(living.getItemStackFromSlot(EntityEquipmentSlot.FEET),"1")==6){

				GL11.glTranslated(0, 0, 0.05);
			}
			}

			Minecraft.getMinecraft().getItemRenderer().renderItem(living,belt,null);
			GL11.glPopMatrix();
			GL11.glPushMatrix();

			if(living.isSneaking()){
				GL11.glRotatef(20, 1, 0, 0);	
			}
			GL11.glRotatef(180, 0, 1, 0);
			if (living.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem()==RiderItems.OOOdriver)
			{					
				dri = 0.5; 
				GL11.glRotatef(160, 0, 0, 1);
			}else if (living.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem()==ReiwaRiderItems.raidriser_battle
					||living.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem()==ReiwaRiderItems.raidriser_buffalo
					||living.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem()==ReiwaRiderItems.raidriser_whale
					||living.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem()==ReiwaRiderItems.raidriser_lion
					||living.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem()==ReiwaRiderItems.raidriser_penguin
					||living.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem()==ReiwaRiderItems.raidriser_panda
					||living.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem()==ReiwaRiderItems.raidriser_jackal)
			{					
				dri = 0.5; 
				GL11.glTranslated(-0.275,0.1,0);
				GL11.glRotatef(135, 0, 0, 1);
			}else{

				GL11.glRotatef(180, 0, 0, 1);
			}

	

				GL11.glScaled(0.5001, 0.5001,0.5001);
				GL11.glTranslatef((float) (0f+dri),height4,0.4f);
		
			if (living.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem()instanceof item_ex_aiddriver)
			{
			if (item_ex_aiddriver.get_core(living.getItemStackFromSlot(EntityEquipmentSlot.FEET),"1")==4
					||item_ex_aiddriver.get_core(living.getItemStackFromSlot(EntityEquipmentSlot.FEET),"1")==5
					||item_ex_aiddriver.get_core(living.getItemStackFromSlot(EntityEquipmentSlot.FEET),"1")==6){

				GL11.glTranslated(0, 0, 0.05);
			}
			}
			
			if (living.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem()instanceof item_zikudriver)
			{
			if (item_zikudriver.get_core(living.getItemStackFromSlot(EntityEquipmentSlot.FEET), "1")==1
					||item_zikudriver.get_core(living.getItemStackFromSlot(EntityEquipmentSlot.FEET), "1")==5
					||item_zikudriver.get_core(living.getItemStackFromSlot(EntityEquipmentSlot.FEET), "1")==8){

				GL11.glTranslated(0.25,0,0.001);
			}
			}
			
			Minecraft.getMinecraft().getItemRenderer().renderItem(living,belt2,null);
			
			if (belt3.getItem()!=ShowaRiderItems.blanknoitem){
			Minecraft.getMinecraft().getItemRenderer().renderItem(living,belt3,null);
			}if (belt4.getItem()!=ShowaRiderItems.blanknoitem){
			Minecraft.getMinecraft().getItemRenderer().renderItem(living,belt4,null);
			}if (belt5.getItem()!=ShowaRiderItems.blanknoitem){
			Minecraft.getMinecraft().getItemRenderer().renderItem(living,belt5,null);
			}
			GL11.glPopMatrix();
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

}

}
