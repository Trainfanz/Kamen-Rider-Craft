package KamenRiderCraftV3.item.gaim;


import org.lwjgl.opengl.GL11;

import KamenRiderCraftV3.RiderItems;
import KamenRiderCraftV3.model.BipedLockseed;
import KamenRiderCraftV3.model.BipedLockseed2;
import net.minecraft.block.BlockDispenser;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.MathHelper;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class item_Gaimarmor3 extends ItemArmor
{
	public static final String[] CoreName= new String[] {"gaim","gaim_jimbar"};


	private static final int[] maxDamageArray = new int[] {11, 20, 15, 13};
	public String armorNamePrefix;
	public ArmorMaterial material;

	public item_Gaimarmor3(ArmorMaterial par2EnumArmorMaterial, int par3, int par4)
	{
		super(par2EnumArmorMaterial, par3, par4);
		this.material = par2EnumArmorMaterial;
		par2EnumArmorMaterial.getDamageReductionAmount(par4);
		this.setMaxDamage(par2EnumArmorMaterial.getDurability(par4)+(par2EnumArmorMaterial.getDurability(par4)/2));
		this.maxStackSize = 1;



	}

	public static int get_core(ItemStack itemstack)
	{
		return itemstack.hasTagCompound() ? itemstack.getTagCompound().getInteger("core") : 0;
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
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
	{
		if (entity instanceof EntityLivingBase){

			EntityLivingBase player = (EntityLivingBase) entity;


			if (player.getEquipmentInSlot(1)!= null){

				if (player.getEquipmentInSlot(1).getItem()  instanceof item_Gaimdriver){



					if (player.getEquipmentInSlot(1).getItem()== RiderItems.sengoku_driver_kurokage_troopers&item_Gaimdriver.get_lock(player.getEquipmentInSlot(1))=="matsubokkuri_arms")
					{

						return "KamenRiderCraftv3:textures/armor/energy_matsubokkuri_arms.png";
					}
					else
					{
						return "KamenRiderCraftv3:textures/armor/"+ item_Gaimdriver.get_lock(player.getEquipmentInSlot(1)) +".png";
					}
				}
				else
				{
					return "KamenRiderCraftv3:textures/armor/blank.png";


				}
			}
			else
			{
				return "KamenRiderCraftv3:textures/armor/blank.png";


			}
		}
		else
		{
			return "KamenRiderCraftv3:textures/armor/blank.png";


		}



	}




	@Override
	@SideOnly(Side.CLIENT)
	public ModelBiped getArmorModel(EntityLivingBase entityLiving,ItemStack itemStack, int armorSlot) {
		BipedLockseed2 armorModel = new BipedLockseed2();
		if(itemStack != null){
			if(itemStack.getItem() instanceof item_Gaimarmor3){
				int type = ((ItemArmor)itemStack.getItem()).armorType;
			}
			if(armorModel != null){
				
				if (entityLiving.getEquipmentInSlot(1)!=null){

				if (entityLiving.getEquipmentInSlot(1).getItem()  instanceof item_Gaimdriver){

						if (item_Gaimdriver.get_lock(entityLiving.getEquipmentInSlot(1))!="energy_melon_arms" & item_Gaimdriver.get_lock(entityLiving.getEquipmentInSlot(1))!="energy_peach_arms" & item_Gaimdriver.get_lock(entityLiving.getEquipmentInSlot(1))!="energy_lemon_arms" )
						{
							armorModel.bipedLeftArm2.showModel = armorSlot == 4;
						}
						else {
							armorModel.bipedLeftArm2.showModel = armorSlot == 1;
						}

						if (item_Gaimdriver.get_lock(entityLiving.getEquipmentInSlot(1))!="energy_cherry_arms")

						{
							armorModel.bipedRightArm2.showModel = armorSlot == 4;
						}else {
							armorModel.bipedRightArm2.showModel = armorSlot == 1;
						}

				}}

				armorModel.bipedHead2.showModel = armorSlot == 4;
				armorModel.bipedHeadwear2.showModel = armorSlot == 4;
				armorModel.bipedBody2.showModel = armorSlot == 4;

				armorModel.bipedRightLeg2.showModel = armorSlot == 4;
				armorModel.bipedLeftLeg2.showModel = armorSlot == 4;


				armorModel.isSneak = entityLiving.isSneaking();
				armorModel.isRiding = entityLiving.isRiding();
				armorModel.isChild = entityLiving.isChild();
				armorModel.heldItemRight = entityLiving.getHeldItem() != null ? 1 :0;
				armorModel.swingProgress = entityLiving.swingProgress;


				return armorModel;
			}
		}

		return null;
	}



	/**
	 * Returns the 'max damage' factor array for the armor, each piece of armor have a durability factor (that gets
	 * multiplied by armor material factor)
	 */
	static int[] getMaxDamageArray()
	{
		return maxDamageArray;
	}

	
}