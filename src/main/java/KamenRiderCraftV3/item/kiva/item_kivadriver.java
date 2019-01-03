package KamenRiderCraftV3.item.kiva;

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
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;


public class item_kivadriver extends ItemArmor
{

	private static final int[] maxDamageArray = new int[] {11, 16, 15, 13};
	public String armorNamePrefix;
	public ArmorMaterial material;

	

	public item_kivadriver (ArmorMaterial par2EnumArmorMaterial, int par3, int par4)
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
						if (player.getEquipmentInSlot(2).getItem() == RiderItems.kivalegs){
							if (player.getEquipmentInSlot(3).getItem() == RiderItems.kivatroso){
								if (player.getEquipmentInSlot(4).getItem() == RiderItems.kivahead){
									if(item_OOOdriver.get_eftTime(player.getEquipmentInSlot(1))<100){

										item_OOOdriver.set_eftTime(player.getEquipmentInSlot(1),item_OOOdriver.get_eftTime(player.getEquipmentInSlot(1))+1);
									}
									if (player.getEquipmentInSlot(1).getItem() == RiderItems.kivadriver){

										if (this.get_core(armor)==0){
											player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 0));
											player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 0));
											player.addPotionEffect(new PotionEffect(Potion.resistance.id, 5, 0));
										}
										if (this.get_core(armor)==1){
											player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 1));
											player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 0));
											player.addPotionEffect(new PotionEffect(Potion.jump.id, 5, 1));
										}
										if (this.get_core(armor)==2){
											player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 0));
											player.addPotionEffect(new PotionEffect(Potion.resistance.id, 5, 0));
											player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 5, 2));
										}
										if (this.get_core(armor)==3){
											player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 1));
											player.addPotionEffect(new PotionEffect(Potion.resistance.id, 5, 1));
											player.addPotionEffect(new PotionEffect(Potion.moveSlowdown.id, 5, 0));
										}
										if (this.get_core(armor)==4){
											player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 1));
											player.addPotionEffect(new PotionEffect(Potion.resistance.id, 5, 1));
											player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 5, 0));
											player.addPotionEffect(new PotionEffect(Potion.jump.id, 5, 0));
											player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 1));
											player.addPotionEffect(new PotionEffect(Potion.wither.id, 5, 0));
										}
										if (this.get_core(armor)==5){
											player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 2));
											player.addPotionEffect(new PotionEffect(Potion.resistance.id, 5, 2));
											player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 5, 1));
											player.addPotionEffect(new PotionEffect(Potion.jump.id, 5, 1));
											player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 2));
											player.addPotionEffect(new PotionEffect(Potion.regeneration.id, 5, 1));
										}
										if (this.get_core(armor)==6){
											player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 4));
											player.addPotionEffect(new PotionEffect(Potion.resistance.id, 5, 3));
											player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 5, 2));
											player.addPotionEffect(new PotionEffect(Potion.jump.id, 5, 1));
											player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 4));
											player.addPotionEffect(new PotionEffect(Potion.regeneration.id, 5, 0));
											player.addPotionEffect(new PotionEffect(Potion.wither.id, 5, 1));
											
										}
								}
								if (player.getEquipmentInSlot(1).getItem() == RiderItems.darkkivadriver){

									if (this.get_core(armor)==0){
										player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 3));
										player.addPotionEffect(new PotionEffect(Potion.resistance.id, 5, 2));
										player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 5, 0));
										player.addPotionEffect(new PotionEffect(Potion.jump.id, 5, 1));
											
											player.addPotionEffect(new PotionEffect(Potion.regeneration.id, 5, 2));
									}
								}
								if (player.getEquipmentInSlot(1).getItem() == RiderItems.newkivadriver){

									if (this.get_core(armor)==0){
										player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 1));
										player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 0));
										player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 5, 0));
										player.addPotionEffect(new PotionEffect(Potion.resistance.id, 5, 0));
										}
								}
								if (player.getEquipmentInSlot(1).getItem() == RiderItems.ixa_belt){

									if (this.get_core(armor)==0){
										player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 0));										
										player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 5, 0));
										player.addPotionEffect(new PotionEffect(Potion.resistance.id, 5, 0));
									}if (this.get_core(armor)==1){
										player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 1));	
										player.addPotionEffect(new PotionEffect(Potion.fireResistance.id, 5, 0));
										player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 5, 1));
										player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 0));
									}if (this.get_core(armor)==2){
										player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 2));	
										player.addPotionEffect(new PotionEffect(Potion.fireResistance.id, 5, 0));
										player.addPotionEffect(new PotionEffect(Potion.resistance.id, 5, 1));
										player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 1));
										player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 5, 0));
										}						
								}
								if (player.getEquipmentInSlot(1).getItem() == RiderItems.sagarc_belt){
										player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 1));	
										player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 1));
										player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 5, 0));
										player.addPotionEffect(new PotionEffect(Potion.jump.id, 5, 2));
								}
								if (player.getEquipmentInSlot(1).getItem() == RiderItems.arcdriver){
									player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 2));	
									player.addPotionEffect(new PotionEffect(Potion.resistance.id, 5, 3));
									player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 1));
									player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 5, 0));								
								}
								if (player.getEquipmentInSlot(1).getItem() == RiderItems.reydriver){
									player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 2));										
									player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 5, 2));	
								}
							}	
						}
					}
				}
			}
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





	/**
	 * Returns the 'max damage' factor array for the armor, each piece of armor have a durability factor (that gets
	 * multiplied by armor material factor)
	 */
	static int[] getMaxDamageArray()
	{
		return maxDamageArray;
	}

	@Override
	public ModelResourceLocation getModel(ItemStack item, EntityPlayer playerIn, int useRemaining){
		ModelResourceLocation modelresourcelocation1 = new ModelResourceLocation("kamenridercraftv3:kivadriver_garulu","inventory");
		ModelResourceLocation modelresourcelocation2 = new ModelResourceLocation("kamenridercraftv3:kivadriver_basshaa","inventory");
		ModelResourceLocation modelresourcelocation3 = new ModelResourceLocation("kamenridercraftv3:kivadriver_dogga","inventory");
		ModelResourceLocation modelresourcelocation4 = new ModelResourceLocation("kamenridercraftv3:kivadriver_emperor","inventory");
		ModelResourceLocation modelresourcelocation5 = new ModelResourceLocation("kamenridercraftv3:sagarc_belt","inventory");
		ModelResourceLocation modelresourcelocation6 = new ModelResourceLocation("kamenridercraftv3:arcdriver","inventory");
		ModelResourceLocation modelresourcelocation7 = new ModelResourceLocation("kamenridercraftv3:reydriver","inventory");

		ModelResourceLocation modelresourcelocation;
		if (item.getItem()==RiderItems.darkkivadriver){
			modelresourcelocation = new ModelResourceLocation("kamenridercraftv3:darkkivadriver","inventory");
		}else if (item.getItem()==RiderItems.newkivadriver){
			modelresourcelocation = new ModelResourceLocation("kamenridercraftv3:newkivadriver","inventory");
		}else if (item.getItem()==RiderItems.ixa_belt){
			modelresourcelocation = new ModelResourceLocation("kamenridercraftv3:ixa_belt","inventory");
		}else if (item.getItem()==RiderItems.sagarc_belt){
			modelresourcelocation = new ModelResourceLocation("kamenridercraftv3:sagarc_belt","inventory");
		}else if (item.getItem()==RiderItems.arcdriver){
			modelresourcelocation = new ModelResourceLocation("kamenridercraftv3:arcdriver","inventory");
		}else if (item.getItem()==RiderItems.reydriver){
			modelresourcelocation = new ModelResourceLocation("kamenridercraftv3:reydriver","inventory");
		}else{
			modelresourcelocation = new ModelResourceLocation("kamenridercraftv3:kivadriver","inventory");;
			
		}
		int form = this.get_core(item);

		if (item.getItem()==RiderItems.kivadriver){
			if(form == 0|| form == 4){
				return modelresourcelocation;
			}else if(form == 1){
				return modelresourcelocation1;
			}else if(form == 2){
				return modelresourcelocation2;
			}else if(form == 3){
				return modelresourcelocation3;
			}else{
				return modelresourcelocation4;
			}
		}


		return modelresourcelocation;
	}

	/**

	@Override
	public IIcon getIcon(ItemStack stack, int renderPass){

int form = this.get_core(stack);

		if(form == 0|| form == 4){

			return itemIcon;

		}else if(form == 1){

			return itemIcon1;

		}else if(form == 2){

			return itemIcon2;

		}else if(form == 3){

			return itemIcon3;

		}else{
			return itemIcon4;
		}


	}

	 **/

}