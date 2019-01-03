package KamenRiderCraftV3.item.deno;

import org.lwjgl.opengl.GL11;

import KamenRiderCraftV3.KamenRiderCraftV3_core;
import KamenRiderCraftV3.RiderItems;
import KamenRiderCraftV3.item.ooo.item_OOOdriver;
import KamenRiderCraftV3.model.Biped;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class item_den_odriver extends ItemArmor
{



	private static final int[] maxDamageArray = new int[] {11, 16, 15, 13};
	public String armorNamePrefix;
	public ArmorMaterial material;




	public item_den_odriver (ArmorMaterial par2EnumArmorMaterial, int par3, int par4)
	{
		super(par2EnumArmorMaterial, par3, par4);
		this.material = par2EnumArmorMaterial;
		par2EnumArmorMaterial.getDamageReductionAmount(par4);
		this.setMaxDamage(par2EnumArmorMaterial.getDurability(par4));
		this.maxStackSize = 1;
	}

	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
	{


		return "KamenRiderCraftV3:textures/armor/blank.png";

	}
	
	
	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack armor) {


		if (player.getEquipmentInSlot(1)!= null){
			if (player.getEquipmentInSlot(2)!= null){
				if (player.getEquipmentInSlot(3)!= null){
					if (player.getEquipmentInSlot(4)!= null){
						if (player.getEquipmentInSlot(2).getItem() == RiderItems.den_olegs){
							if (player.getEquipmentInSlot(3).getItem() == RiderItems.den_otroso){
								if (player.getEquipmentInSlot(4).getItem() == RiderItems.den_ohead){
									if(item_OOOdriver.get_eftTime(player.getEquipmentInSlot(1))<100){

										item_OOOdriver.set_eftTime(player.getEquipmentInSlot(1),item_OOOdriver.get_eftTime(player.getEquipmentInSlot(1))+1);
									}
									if (player.getEquipmentInSlot(1).getItem() == RiderItems.den_odriver&player.inventory.hasItem(RiderItems.den_oriderpass)){

										if (this.get_core(armor)==0){
											player.addPotionEffect(new PotionEffect(Potion.weakness.id, 5, 0));
										}else if (this.get_core(armor)==1){
											player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 2));
											player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 5, 0));
										}else if (this.get_core(armor)==2){
											player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 0));
											player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 5, 2));

										}else if (this.get_core(armor)==3){
											player.addPotionEffect(new PotionEffect(Potion.resistance.id, 5, 2));
											player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 1));

										}else if (this.get_core(armor)==4){
											player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 1));
											player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 5, 0));
											player.addPotionEffect(new PotionEffect(Potion.jump.id, 5, 1));

										}else if (this.get_core(armor)==5){											
											player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 2));
											player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 5, 1));
											player.addPotionEffect(new PotionEffect(Potion.jump.id, 5, 2));
											player.addPotionEffect(new PotionEffect(Potion.weakness.id, 5, 0));
										}else if (this.get_core(armor)==6){
											player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 5, 2));
											player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 1));
											player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 3));
											player.addPotionEffect(new PotionEffect(Potion.jump.id, 5, 1));
											player.addPotionEffect(new PotionEffect(Potion.resistance.id, 5, 1));
										}else if (this.get_core(armor)==7){
											player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 5, 2));
											player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 2));
											player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 3));
											player.addPotionEffect(new PotionEffect(Potion.jump.id, 5, 2));
											player.addPotionEffect(new PotionEffect(Potion.resistance.id, 5, 1));

										}else if (this.get_core(armor)==8){																					
											player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 2));
											player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 5, 2));
											player.addPotionEffect(new PotionEffect(Potion.resistance.id, 5, 2));
											player.addPotionEffect(new PotionEffect(Potion.jump.id, 5, 2));
											player.addPotionEffect(new PotionEffect(Potion.fireResistance.id, 5, 0));
											player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 4));
										
										}
									}else if (player.getEquipmentInSlot(1).getItem() == RiderItems.zeronosbelt){
										if (this.get_core(armor)==0){
											player.addPotionEffect(new PotionEffect(Potion.weakness.id, 5, 0));											
										}else if (this.get_core(armor)==1){
											player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 2));
											player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 5, 0));
											player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 1));
											player.addPotionEffect(new PotionEffect(Potion.resistance.id, 5, 0));
										}else if (this.get_core(armor)==2){											
											player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 0));
											player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 2));
											player.addPotionEffect(new PotionEffect(Potion.resistance.id, 5, 1));
											player.addPotionEffect(new PotionEffect(Potion.fireResistance.id, 5, 0));
										}else if (this.get_core(armor)==3){
											player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 2));											
											player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 2));
											player.addPotionEffect(new PotionEffect(Potion.resistance.id, 5, 1));
											player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 5, 1));
											player.addPotionEffect(new PotionEffect(Potion.fireResistance.id, 5, 0));
											player.addPotionEffect(new PotionEffect(Potion.regeneration.id, 5, 1));

										}										
									}if (player.getEquipmentInSlot(1).getItem() == RiderItems.newden_obelt&player.inventory.hasItem(RiderItems.den_oriderpass)){
										if (this.get_core(armor)==1){
											player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 2));
											player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 1));
											player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 5, 1));
											player.addPotionEffect(new PotionEffect(Potion.resistance.id, 5, 2));
											player.addPotionEffect(new PotionEffect(Potion.regeneration.id, 5, 1));
										}else if (this.get_core(armor)==2){		
											player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 1));
											player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 2));
											player.addPotionEffect(new PotionEffect(Potion.resistance.id, 5, 2));
											player.addPotionEffect(new PotionEffect(Potion.regeneration.id, 5, 1));
											player.addPotionEffect(new PotionEffect(Potion.fireResistance.id, 5, 0));
											player.addPotionEffect(new PotionEffect(Potion.waterBreathing.id, 5, 0));
										
									}
								}if (player.getEquipmentInSlot(1).getItem() == RiderItems.nega_den_odriver&player.inventory.hasItem(RiderItems.den_oriderpass)){
									player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 2));
									player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 1));
									player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 5, 0));
									player.addPotionEffect(new PotionEffect(Potion.resistance.id, 5, 1));
								}
							}
							}if (player.getEquipmentInSlot(1).getItem() == RiderItems.yuukibelt_skull&player.inventory.hasItem(RiderItems.den_oriderpass)){
								player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 2));
								player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 1));
								player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 5, 0));
								player.addPotionEffect(new PotionEffect(Potion.resistance.id, 5, 1));
								player.addPotionEffect(new PotionEffect(Potion.regeneration.id, 5, 1));
								player.addPotionEffect(new PotionEffect(Potion.resistance.id, 5, 1));
							}
					}if (player.getEquipmentInSlot(1).getItem() == RiderItems.yuukibelt_hijack&player.inventory.hasItem(RiderItems.den_oriderpass)){
						player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 3));
						player.addPotionEffect(new PotionEffect(Potion.resistance.id, 5, 4));
						player.addPotionEffect(new PotionEffect(Potion.moveSlowdown.id, 5, 0));
						player.addPotionEffect(new PotionEffect(Potion.regeneration.id, 5, 2));
						player.addPotionEffect(new PotionEffect(Potion.fireResistance.id, 5, 0));
					}
				}
				}if (player.getEquipmentInSlot(1).getItem() == RiderItems.gden_odriver&player.inventory.hasItem(RiderItems.gden_oriderpass)){	
					player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5,0));
					player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 2));
					player.addPotionEffect(new PotionEffect(Potion.resistance.id, 5, 0));
					player.addPotionEffect(new PotionEffect(Potion.regeneration.id, 5, 0));
					player.addPotionEffect(new PotionEffect(Potion.nightVision.id, 5, 0));
			}
			}if (player.getEquipmentInSlot(1).getItem() == RiderItems.gaohbelt&player.inventory.hasItem(RiderItems.den_o_master_pass)){	
				player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 3));
				player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 5, 1));	
		}
	}
}
	
	@Override
	@SideOnly(Side.CLIENT)
	public ModelBiped getArmorModel(EntityLivingBase entityLiving,ItemStack itemStack, int armorSlot) {
		Biped armorModel = new Biped();
		if(itemStack != null){
			if(armorModel != null){

				armorModel.bipedHead.showModel = armorSlot == 0;
				armorModel.bipedHeadwear.showModel = armorSlot == 0;
				armorModel.bipedBody.showModel = armorSlot == 0;
				armorModel.bipedRightArm.showModel = armorSlot == 2;
				armorModel.bipedLeftArm.showModel = armorSlot == 2;
				armorModel.bipedRightLeg.showModel = armorSlot == 2;
				armorModel.bipedLeftLeg.showModel = armorSlot == 2;


				armorModel.isSneak = entityLiving.isSneaking();
				armorModel.isRiding = entityLiving.isRiding();
				armorModel.isChild = entityLiving.isChild();
				armorModel.heldItemRight = entityLiving.getHeldItem() != null ? 1 :0;


				GL11.glPushMatrix();

				EntityItem entItem = new EntityItem(Minecraft.getMinecraft().thePlayer.getEntityWorld(), 0D, 0D, 0D,entityLiving.getEquipmentInSlot(1));
				//Without the below line, the item will spazz out
				entItem.hoverStart = 1.0F;

				if(entityLiving.isSneaking()){
					GL11.glRotatef(20, 1, 0, 0);	
				}

				double dri = 0; 
				GL11.glRotatef(180, 0, 1, 0);

				GL11.glRotatef(180, 0, 0, 1);
				//EntityItem entItem= new EntityItemFrame(player.worldObj);
				//RenderEntityItem.doRender(entItem,4,-0.9,0.17,0,0);
				// Minecraft.getMinecraft().getRenderItem().renderItemModel(itemStack);
				GL11.glScaled(0.35, 0.35,0.35);

				GL11.glTranslatef((float) (0f+dri),-2f,0.6f);
				Minecraft.getMinecraft().getItemRenderer().renderItem(entityLiving, itemStack,null);

				GL11.glPopMatrix();

				return armorModel;
			}
		}

		return null;
	}






	public static int get_eftTime(ItemStack itemstack)
	{
		return itemstack.hasTagCompound() ? itemstack.getTagCompound().getInteger("eftTime") : 100;
	}

	public static void set_eftTime(ItemStack itemstack, int flag)
	{
		if (!itemstack.hasTagCompound())
		{
			itemstack.setTagCompound(new NBTTagCompound());
		}
		itemstack.getTagCompound().setInteger("eftTime", flag);
	}

	public static int  get_core(ItemStack itemstack)
	{
		return itemstack.hasTagCompound() ? itemstack.getTagCompound().getInteger("core") :1;
	}

	public static void set_core(ItemStack itemstack, int flag)
	{
		if (!itemstack.hasTagCompound())
		{
			itemstack.setTagCompound(new NBTTagCompound());
		}
		itemstack.getTagCompound().setInteger("core", flag);
	}





	/**
	 * Returns the 'max damage' factor array for the armor, each piece of armor have a durability factor (that gets
	 * multiplied by armor material factor)
	 */
	static int[] getMaxDamageArray()
	{
		return maxDamageArray;
	}



	@Override
	public ModelResourceLocation getModel(ItemStack stack, EntityPlayer playerIn, int useRemaining){
		
		ModelResourceLocation modelresourcelocation1 = new ModelResourceLocation("kamenridercraftv3:"+stack.getUnlocalizedName().substring(5),"inventory");
		ModelResourceLocation modelresourcelocation = new ModelResourceLocation("kamenridercraftv3:den_odriver_bl","inventory");

		ModelResourceLocation modelresourcelocation2 = new ModelResourceLocation("kamenridercraftv3:den_odriverrod","inventory");
		ModelResourceLocation modelresourcelocation3 = new ModelResourceLocation("kamenridercraftv3:den_odriveraxe","inventory");
		ModelResourceLocation modelresourcelocation4 = new ModelResourceLocation("kamenridercraftv3:den_odrivergun","inventory");
		ModelResourceLocation modelresourcelocation5 = new ModelResourceLocation("kamenridercraftv3:den_odriverwing","inventory");
		ModelResourceLocation modelresourcelocation6 = new ModelResourceLocation("kamenridercraftv3:den_obeltclimax","inventory");

		ModelResourceLocation modelresourcelocation7 = new ModelResourceLocation("kamenridercraftv3:zeronosbelt_p","inventory");
		ModelResourceLocation modelresourcelocation8 = new ModelResourceLocation("kamenridercraftv3:zeronosbelt_v","inventory");
		ModelResourceLocation modelresourcelocation9 = new ModelResourceLocation("kamenridercraftv3:zeronosbelt_z","inventory");
		
		ModelResourceLocation modelresourcelocation10 = new ModelResourceLocation("kamenridercraftv3:newden_obeltbl","inventory");
		ModelResourceLocation modelresourcelocation11 = new ModelResourceLocation("kamenridercraftv3:newden_obelt","inventory");
		ModelResourceLocation modelresourcelocation12 = new ModelResourceLocation("kamenridercraftv3:newden_obeltvega","inventory");


		int form = this.get_core(stack);

		if (stack.getItem()==RiderItems.den_odriver){
			if(form == 0){

				return modelresourcelocation;

			}else if(form == 1){

				return modelresourcelocation1;

			}else if(form == 2){

				return modelresourcelocation2;

			}else if(form == 3){

				return modelresourcelocation3;

			}else if(form == 4){

				return modelresourcelocation4;

			}else if(form == 5){

				return modelresourcelocation5;

			}else{
				return modelresourcelocation6;
			}

		}else if (stack.getItem()==RiderItems.zeronosbelt){
			if(form == 0){
				return modelresourcelocation7;
			}
			else if(form == 1){
				return modelresourcelocation1;
			}
			else if(form == 2){
				return modelresourcelocation8;
			}
			else if(form == 3){
				return modelresourcelocation9;
			}
			else{
			return modelresourcelocation6;
			}
			
		
		}else if (stack.getItem()==RiderItems.newden_obelt){
			if(form == 0){
				return modelresourcelocation10;
			}
			else if(form == 1){
				return modelresourcelocation11;
			}
			else if(form == 2){
				return modelresourcelocation12;
				
			}
		}
				
				

		return modelresourcelocation1;
	}




}