package KamenRiderCraftV3.item.agito;

import org.lwjgl.opengl.GL11;
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
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;


public class item_agitodriver extends ItemArmor
{

	private static final int[] maxDamageArray = new int[] {11, 16, 15, 13};
	public String armorNamePrefix;
	public ArmorMaterial material;

	public String Rider;



	public item_agitodriver (ArmorMaterial par2EnumArmorMaterial, int par3, int par4, String rider)
	{
		super(par2EnumArmorMaterial, par3, par4);
		this.material = par2EnumArmorMaterial;
		par2EnumArmorMaterial.getDamageReductionAmount(par4);
		this.setMaxDamage(par2EnumArmorMaterial.getDurability(par4));
		this.maxStackSize = 1;
		Rider=rider;
	}


	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
	{


		return "KamenRiderCraftV3:textures/armor/blank.png";

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
				GL11.glScaled(0.5, 0.5,0.5);

				GL11.glTranslatef((float) (0f+dri),-1.4f,0.4f);
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
		return itemstack.hasTagCompound() ? itemstack.getTagCompound().getInteger("core") :0;
	}

	public static void set_core(ItemStack itemstack, int flag)
	{
		if (!itemstack.hasTagCompound())
		{
			itemstack.setTagCompound(new NBTTagCompound());
		}
		itemstack.getTagCompound().setInteger("core", flag);
	}

	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack armor) {


		if (player.getEquipmentInSlot(1)!= null){
			if (player.getEquipmentInSlot(2)!= null){
				if (player.getEquipmentInSlot(3)!= null){
					if (player.getEquipmentInSlot(4)!= null){
						if (player.getEquipmentInSlot(2).getItem() == RiderItems.agitolegs){
							if (player.getEquipmentInSlot(3).getItem() == RiderItems.agitotroso){
								if (player.getEquipmentInSlot(4).getItem() == RiderItems.agitohead){
									
									if (player.getEquipmentInSlot(1).getItem() == RiderItems.alter_ring){

										if (this.get_core(armor)==0){
											player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 0));
											player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 0));
										}else if (this.get_core(armor)==1){
											player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 1));
											player.addPotionEffect(new PotionEffect(Potion.jump.id, 5, 0));
										}else if (this.get_core(armor)==2){
											player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 0));
											player.addPotionEffect(new PotionEffect(Potion.fireResistance.id, 5, 0));
										}else if (this.get_core(armor)==3){
											player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 1));
											player.addPotionEffect(new PotionEffect(Potion.fireResistance.id, 5, 0));
											player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 0));
											player.addPotionEffect(new PotionEffect(Potion.jump.id, 5, 0));
										}else if (this.get_core(armor)==4){
											player.addPotionEffect(new PotionEffect(Potion.moveSlowdown.id, 5, 1));
											player.addPotionEffect(new PotionEffect(Potion.fireResistance.id, 5, 0));
											player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 2));
											player.addPotionEffect(new PotionEffect(Potion.jump.id, 5, 2));
											player.addPotionEffect(new PotionEffect(Potion.resistance.id, 5, 2));
										}else if (this.get_core(armor)==5){
											player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 3));
											player.addPotionEffect(new PotionEffect(Potion.fireResistance.id, 5, 0));
											player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 4));
											player.addPotionEffect(new PotionEffect(Potion.jump.id, 5, 3));
											player.addPotionEffect(new PotionEffect(Potion.resistance.id, 5, 3));
										}

									}else if (player.getEquipmentInSlot(1).getItem() == RiderItems.meta_factor){
										if (this.get_core(armor)==0){
											player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 1));
											player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 0));
											player.addPotionEffect(new PotionEffect(Potion.jump.id, 5, 0));
										}else if (this.get_core(armor)==1){
											player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 3));
											player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 2));
											player.addPotionEffect(new PotionEffect(Potion.jump.id, 5, 3));
											player.addPotionEffect(new PotionEffect(Potion.resistance.id, 5, 1));
										}
									}else if (player.getEquipmentInSlot(1).getItem() == RiderItems.ank_point){
										player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 1));
										player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 1));
										player.addPotionEffect(new PotionEffect(Potion.jump.id, 5, 3));
									
									}else if (player.getEquipmentInSlot(1).getItem() == RiderItems.ank_point_burning){
										player.addPotionEffect(new PotionEffect(Potion.fireResistance.id, 5, 0));
										player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 4));
										player.addPotionEffect(new PotionEffect(Potion.jump.id, 5, 5));
										player.addPotionEffect(new PotionEffect(Potion.resistance.id, 5, 4));;
									
									}else if (player.getEquipmentInSlot(1).getItem() == RiderItems.alter_ring_miracle){

										player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 4));
										player.addPotionEffect(new PotionEffect(Potion.fireResistance.id, 5, 0));
										player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 4));
										player.addPotionEffect(new PotionEffect(Potion.jump.id, 5, 2));
										player.addPotionEffect(new PotionEffect(Potion.resistance.id, 5, 4));;
									
									}
								}
								if (player.getEquipmentInSlot(1).getItem() == RiderItems.g1_belt){

									if (this.get_core(armor)==0){
										player.addPotionEffect(new PotionEffect(Potion.weakness.id, 5, 0));
									}
								}
								if (player.getEquipmentInSlot(1).getItem() == RiderItems.g3_mild_belt){

									if (this.get_core(armor)==0){
										player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 0));
									}
								}
								if (player.getEquipmentInSlot(1).getItem() == RiderItems.g3_belt){

									if (this.get_core(armor)==0){
										player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 0));
										player.addPotionEffect(new PotionEffect(Potion.resistance.id, 5, 0));
										player.addPotionEffect(new PotionEffect(Potion.moveSlowdown.id, 5, 0));
									}
								}
								if (player.getEquipmentInSlot(1).getItem() == RiderItems.g3_x_belt){

									if (this.get_core(armor)==0){
										player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 1));
										player.addPotionEffect(new PotionEffect(Potion.resistance.id, 5, 2));
										player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 0));
									}
								}
								if (player.getEquipmentInSlot(1).getItem() == RiderItems.g4_belt){

									if (this.get_core(armor)==0){
										player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 2));
										player.addPotionEffect(new PotionEffect(Potion.resistance.id, 5, 1));
										player.addPotionEffect(new PotionEffect(Potion.poison.id, 5, 0));
									}
								}
								if (player.getEquipmentInSlot(1).getItem() == RiderItems.g4_x_belt){

									if (this.get_core(armor)==0){
										player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 1));
										player.addPotionEffect(new PotionEffect(Potion.resistance.id, 5, 2));
										player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 0));
									}
								}
							}	
						}
					}
				}	
			}
		}	
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
		ModelResourceLocation modelresourcelocation = new ModelResourceLocation("kamenridercraftv3"+":"+stack.getUnlocalizedName().substring(5),"inventory");
		ModelResourceLocation modelresourcelocation1 = new ModelResourceLocation("kamenridercraftv3:alter_ring_st","inventory");
		ModelResourceLocation modelresourcelocation2 = new ModelResourceLocation("kamenridercraftv3:alter_ring_fl","inventory");
		ModelResourceLocation modelresourcelocation3 = new ModelResourceLocation("kamenridercraftv3:alter_ring_shining","inventory");

		ModelResourceLocation modelresourcelocationGilEx = new ModelResourceLocation("kamenridercraftv3:meta_factor_exceed","inventory");

		if (this.Rider=="agito"){
			if (this.get_core(stack)==1){
				return modelresourcelocation1;
			}else if (this.get_core(stack)==2){
				return modelresourcelocation2;
			}else if (this.get_core(stack)==4||this.get_core(stack)==5){
				return modelresourcelocation3;
			}else{
				return modelresourcelocation;
			}
		}else if (this.Rider=="gills"){
			if (this.get_core(stack)==1){
				return modelresourcelocationGilEx;
			}else{
				return modelresourcelocation;
			}
		}


		return modelresourcelocation;
	}



}