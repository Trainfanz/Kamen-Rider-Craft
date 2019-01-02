package KamenRiderCraftV3.item.ooo;

import org.lwjgl.opengl.GL11;

import KamenRiderCraftV3.RiderItems;
import KamenRiderCraftV3.model.Biped;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.block.model.ItemCameraTransforms;
import net.minecraft.client.renderer.block.model.ItemCameraTransforms.TransformType;
import net.minecraft.client.renderer.entity.RenderEntityItem;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.tileentity.RenderItemFrame;
import net.minecraft.client.resources.model.IBakedModel;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.item.EntityItemFrame;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;

import net.minecraft.util.Vec3;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class item_OOOdriver extends ItemArmor
{


	public static final int[] Corecol1= new int[] {0xff0000,0x7dff09,0xff9204,0xd2d2d2,0x1560c5,0xd919ea,0xe0ba5d,0xff0000,0xF561B5,0x2461FF,0xC93200,0x5C3E30,0x9C47B3,0xE83000};
	public static final int[] Corecol2= new int[] {0xfcff00,0x6cc43e,0x818181,0xff0000,0x2c41ff,0xd45ef3,0xd9bb64,0xff0000,0xffffff,0xfcff00,0xe8cc00,0xF561B5,0x0011D3,0xCB1823,0xBABABA,0xFFD600,0xC3005D,0x38B4F0};
	public static final int[] Corecol3= new int[] {0x0a6e03,0xfff725,0x2e2e2e,0xff0000,0x57b7ff,0x8819ea,0xe0ba5d,0xb79449,0x0a6e03,0xe8cc00,0xF561B5,0xA90000,0xCFCFCF,0x0F41BF,0x525252,0xAE13D6};

	private static final int[] maxDamageArray = new int[] {11, 16, 15, 13};
	public String armorNamePrefix;
	public ArmorMaterial material;




	public item_OOOdriver (ArmorMaterial par2EnumArmorMaterial, int par3, int par4)
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
						if (player.getEquipmentInSlot(2).getItem() == RiderItems.OOOlegs){
							if (player.getEquipmentInSlot(3).getItem() == RiderItems.OOOtroso){
								if (player.getEquipmentInSlot(4).getItem() == RiderItems.OOOhead){
									if(item_OOOdriver.get_eftTime(player.getEquipmentInSlot(1))<100){

										item_OOOdriver.set_eftTime(player.getEquipmentInSlot(1),item_OOOdriver.get_eftTime(player.getEquipmentInSlot(1))+1);
									}
									if (player.getEquipmentInSlot(1).getItem() == RiderItems.birth_driver){
										player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 0));
										player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 5, 0));
									}
									if (player.getEquipmentInSlot(1).getItem() == RiderItems.birth_driver_prototype){
										player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 1));
										player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 5, 0));
										player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 0));
									}
									if (player.getEquipmentInSlot(1).getItem() == RiderItems.aqua_driver){
										player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 1));
										player.addPotionEffect(new PotionEffect(Potion.waterBreathing.id, 5, 0));
										player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 0));
										if (player.isInWater()){
											if (player.isSneaking()){
												Vec3 look = player.getLookVec();
												player.motionX=look.xCoord/2;
												player.motionY=look.yCoord/2;
												player.motionZ=look.zCoord/2;
											}
										}
									}
									if (player.getEquipmentInSlot(1).getItem() == RiderItems.poseidon_driver){
										player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 2));
										player.addPotionEffect(new PotionEffect(Potion.resistance.id, 5, 3));
										player.addPotionEffect(new PotionEffect(Potion.waterBreathing.id, 5, 0));
										player.addPotionEffect(new PotionEffect(Potion.fireResistance.id, 5, 0));
										player.addPotionEffect(new PotionEffect(Potion.regeneration.id, 5, 1));
										player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 5, 0));
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
			if(itemStack.getItem() instanceof item_OOOarmor2){
				int type = ((ItemArmor)itemStack.getItem()).armorType;
			}
			if(armorModel != null){

				armorModel.bipedHead.showModel = armorSlot == 4;
				armorModel.bipedHeadwear.showModel = armorSlot == 4;
				armorModel.bipedBody.showModel = armorSlot == 4;
				armorModel.bipedRightArm.showModel = armorSlot == 3;
				armorModel.bipedLeftArm.showModel = armorSlot == 2;
				armorModel.bipedRightLeg.showModel = armorSlot == 1;
				armorModel.bipedLeftLeg.showModel = armorSlot == 0;


				armorModel.isSneak = entityLiving.isSneaking();
				armorModel.isRiding = entityLiving.isRiding();
				armorModel.isChild = entityLiving.isChild();
				armorModel.heldItemRight = entityLiving.getHeldItem() != null ? 1 :0;
				GL11.glPushMatrix();

				//Without the below line, the item will spazz out
				//Add the below line (without //'s) to make the item lie flat on the block


				if(entityLiving.isSneaking()){
					GL11.glRotatef(20, 1, 0, 0);	
				}

				double dri = 0; 
				GL11.glRotatef(180, 0, 1, 0);
				if (itemStack.getItem()==RiderItems.OOOdriver)
				{					
					dri = 0.5; 
					GL11.glRotatef(160, 0, 0, 1);
				}else{

					GL11.glRotatef(180, 0, 0, 1);
				}

				//EntityItem entItem= new EntityItemFrame(player.worldObj);
				//RenderEntityItem.doRender(entItem,4,-0.9,0.17,0,0);
				// Minecraft.getMinecraft().getRenderItem().renderItemModel(itemStack);
				GL11.glScaled(0.5, 0.5,0.5);

				GL11.glTranslatef((float) (0f+dri),-1.3f,0.4f);
				Minecraft.getMinecraft().getItemRenderer().renderItem(entityLiving, itemStack,null);


				GL11.glPopMatrix();
			}
			return armorModel;
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

public static int get_core(ItemStack itemstack,String slot)
{
	return itemstack.hasTagCompound() ? itemstack.getTagCompound().getInteger("core"+slot) : 0;
}

public static void set_core(ItemStack itemstack, int flag,String slot)
{
	if (!itemstack.hasTagCompound())
	{
		itemstack.setTagCompound(new NBTTagCompound());
	}
	itemstack.getTagCompound().setInteger("core"+slot, flag);
}




/**
 * Returns the 'max damage' factor array for the armor, each piece of armor have a durability factor (that gets
 * multiplied by armor material factor)
 */
static int[] getMaxDamageArray()
{
	return maxDamageArray;
}





@SideOnly(Side.CLIENT)
public int getColorFromItemStack(ItemStack par1ItemStack, int renderPass)
{
	if (par1ItemStack.getItem()==RiderItems.birth_driver||par1ItemStack.getItem()==RiderItems.birth_driver_prototype){
		return 0xffffff;
	}
	if(renderPass == 0){

		return 0xffffff;

	}else if(renderPass == 1){

		return Corecol1[get_core(par1ItemStack, "1")];

	}else if(renderPass == 2){

		return Corecol3[get_core(par1ItemStack, "3")];

	}else{
		return Corecol2[get_core(par1ItemStack, "2")];
	}
}


}