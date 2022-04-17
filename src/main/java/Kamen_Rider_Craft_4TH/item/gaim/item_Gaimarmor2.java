package Kamen_Rider_Craft_4TH.item.gaim;


import javax.annotation.Nullable;

import org.lwjgl.opengl.GL11;

import Kamen_Rider_Craft_4TH.RiderItems;
import Kamen_Rider_Craft_4TH.TokuCraft_core;
import Kamen_Rider_Craft_4TH.model.tokuArmorModel;
import Kamen_Rider_Craft_4TH.util.IHasModel;
import Kamen_Rider_Craft_4TH.util.Refercence;
import net.minecraft.block.BlockDispenser;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class item_Gaimarmor2 extends ItemArmor implements IHasModel
{
	public static final String[] CoreName= new String[] {"gaim","gaim_jimbar","gaim_kachidoki","gaim_kiwami","gaim_yami", "gaim_fresh","gaim_drive"};


	private static final int[] maxDamageArray = new int[] {11, 20, 15, 13};
	public String armorNamePrefix;
	public ArmorMaterial material;

	public item_Gaimarmor2 (String name,ArmorMaterial par2EnumArmorMaterial, int par3, EntityEquipmentSlot par4)
	{
		super(par2EnumArmorMaterial, par3, par4);
		par2EnumArmorMaterial.getDamageReductionAmount(par4);
		this.setMaxDamage(par2EnumArmorMaterial.getDurability(par4));
		this.maxStackSize = 1;

		setTranslationKey(name);
		setRegistryName(name);
		TokuCraft_core.ITEMS.add(this);
	}
	@Override
	public void registerModels() {
		TokuCraft_core.proxy.registerItemRender(this,0,"inventory");
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
	public String getArmorTexture(ItemStack stack, Entity entity, EntityEquipmentSlot slot, String type)
	{

		if (entity instanceof EntityLivingBase){
			EntityLivingBase player = ((EntityLivingBase)entity);


			if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET)!= null){

				if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() instanceof item_Gaimdriver){
	
					 
					item_Gaimdriver belt = (item_Gaimdriver) player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem();
					if (belt.RIDER == "ryugen"){
						
						if (item_Gaimdriver.get_lock(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))=="yomotsu_heguri_arms"){
						
							return Refercence.MODID+":textures/armor/"+ "ryugen_yomi" +".png";
						}else if (item_Gaimdriver.get_lock(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))=="jimbar_dragon_arms"){

							return Refercence.MODID+":textures/armor/"+ "ryugen_jimber" +".png";
						}else
							return Refercence.MODID+":textures/armor/"+ "ryugen" +".png";
						}else if (belt.RIDER == "barvo"){

							if (item_Gaimdriver.get_lock(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))=="jimbar_melon_arms_barvo"){
								return Refercence.MODID+":textures/armor/"+ "barvo_jimber" +".png";
							}else if (item_Gaimdriver.get_lock(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))=="king_durian_arms"){
								return Refercence.MODID+":textures/armor/"+ "barvo_king" +".png";
							}else
								return Refercence.MODID+":textures/armor/"+ "barvo" +".png";
						}else if (belt.RIDER == "zangetsu"){

							if (item_Gaimdriver.get_lock(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))=="watermelon_arms"){

								return Refercence.MODID+":textures/armor/"+ "zangetsu_watermelon" +".png";
							}else if (item_Gaimdriver.get_lock(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))=="zangetsu_kachidoki_arms"){

								return Refercence.MODID+":textures/armor/"+ "zangetsu_kachidoki" +".png";
							}else
								return Refercence.MODID+":textures/armor/"+ "zangetsu" +".png";
						}else if (belt.RIDER == "duke"){

							if (item_Gaimdriver.get_lock(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))=="energy_dragon_fruits_arms"){

								return Refercence.MODID+":textures/armor/"+ "duke_hex" +".png";
							}else
								return Refercence.MODID+":textures/armor/"+ "duke" +".png";
							
						}else if (belt.RIDER == "gridon"){

							if (item_Gaimdriver.get_lock(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))=="lychee_arms"){

								return Refercence.MODID+":textures/armor/"+ "gridon_lychee" +".png";
							}else
								return Refercence.MODID+":textures/armor/"+ "gridon" +".png";
							
						}
					
					if (belt.RIDER == "gaim"){
						if (slot != EntityEquipmentSlot.FEET)
					{
						return Refercence.MODID+":textures/armor/"+ CoreName[item_Gaimdriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET),"1")] +".png";
					}
					else
					{
						return Refercence.MODID+":textures/armor/blank.png";
					}
					}else{
						if ( slot != EntityEquipmentSlot.FEET)
						{
							return Refercence.MODID+":textures/armor/"+ belt.RIDER +".png";
						
						}
						else
						{
							return Refercence.MODID+":textures/armor/blank.png";
						}
					}
				}			
				else
				{
					return Refercence.MODID+":textures/armor/blank.png";


				}
			}
			else
			{
				return Refercence.MODID+":textures/armor/blank.png";


			}
		}
		else
		{
			return Refercence.MODID+":textures/armor/blank.png";


		}
	}


	@Override
	@SideOnly(Side.CLIENT)
	@Nullable
	public ModelBiped getArmorModel(EntityLivingBase living, ItemStack stack, EntityEquipmentSlot slot, ModelBiped defaultModel)
	{
		if(!stack.isEmpty())
		{
			if(stack.getItem() instanceof item_Gaimarmor2)
			{
				tokuArmorModel armorModel = new tokuArmorModel();

				
				armorModel.bipedBody2.showModel = slot == EntityEquipmentSlot.CHEST;
				armorModel.bipedRightArm2.showModel = slot == EntityEquipmentSlot.CHEST;
				armorModel.bipedLeftArm2.showModel = slot == EntityEquipmentSlot.CHEST;
				
				armorModel.bipedLeftLeg2.showModel = slot == EntityEquipmentSlot.LEGS;
				armorModel.bipedRightLeg2.showModel = slot == EntityEquipmentSlot.LEGS;
				
				armorModel.bipedBody3.showModel = slot == EntityEquipmentSlot.CHEST;
				
				armorModel.bipedHead2.showModel = slot == EntityEquipmentSlot.LEGS;
				armorModel.bipedHeadwear2.showModel = slot == EntityEquipmentSlot.LEGS;

				armorModel.isSneak = defaultModel.isSneak;
				armorModel.isRiding = defaultModel.isRiding;
				armorModel.isChild = defaultModel.isChild;
				armorModel.rightArmPose = defaultModel.rightArmPose;
				armorModel.leftArmPose = defaultModel.leftArmPose;

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
	
	public boolean getIsRepairable(ItemStack toRepair, ItemStack repair) 
	{
		return RiderItems.himawari_lockseed == repair.getItem() ? true : super.getIsRepairable(toRepair, repair);
	}

}