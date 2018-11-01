package Kamen_Rider_Craft_4TH.item.gaim;


import javax.annotation.Nullable;

import org.lwjgl.opengl.GL11;

import Kamen_Rider_Craft_4TH.RiderItems;
import Kamen_Rider_Craft_4TH.TokuCraft_core;
import Kamen_Rider_Craft_4TH.model.BipedLockseed;
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

public class item_Gaimarmor3 extends ItemArmor implements IHasModel
{
	public static final String[] CoreName= new String[] {"gaim","gaim_jimbar"};


	private static final int[] maxDamageArray = new int[] {11, 20, 15, 13};
	public String armorNamePrefix;
	public ArmorMaterial material;

	public item_Gaimarmor3 (String name,ArmorMaterial par2EnumArmorMaterial, int par3, EntityEquipmentSlot par4)
	{
		super(par2EnumArmorMaterial, par3, par4);
		par2EnumArmorMaterial.getDamageReductionAmount(par4);
		this.setMaxDamage(par2EnumArmorMaterial.getDurability(par4));
		this.maxStackSize = 1;

		setUnlocalizedName(name);
		setRegistryName(name);
		TokuCraft_core.ITEMS.add(this);
	}
	
	@Override
	public void registerModels() {
		TokuCraft_core.proxy.registerItemRender(this,0,"inventory");
	}


	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, EntityEquipmentSlot slot, String type)
	{

		if (entity instanceof EntityLivingBase){
			EntityLivingBase player = ((EntityLivingBase)entity);


			if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET)!= null){

				if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem()  instanceof item_Gaimdriver){



					if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem()== RiderItems.sengoku_driver_kurokage_troopers&item_Gaimdriver.get_lock(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))=="matsubokkuri_arms")
					{

						return Refercence.MODID+":textures/armor/energy_matsubokkuri_arms.png";
					}
					else
					{
						return Refercence.MODID+":textures/armor/"+ item_Gaimdriver.get_lock(player.getItemStackFromSlot(EntityEquipmentSlot.FEET)) +".png";
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
			if(stack.getItem() instanceof item_Gaimarmor3)
			{
				BipedLockseed armorModel = new BipedLockseed();
				if (living.getItemStackFromSlot(EntityEquipmentSlot.FEET)!=null){

				if (living.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem()  instanceof item_Gaimdriver){

						if (item_Gaimdriver.get_lock(living.getItemStackFromSlot(EntityEquipmentSlot.FEET))!="energy_melon_arms" & item_Gaimdriver.get_lock(living.getItemStackFromSlot(EntityEquipmentSlot.FEET))!="energy_peach_arms" & item_Gaimdriver.get_lock(living.getItemStackFromSlot(EntityEquipmentSlot.FEET))!="energy_lemon_arms" )
						{
							armorModel.bipedLeftArm2.showModel = slot == EntityEquipmentSlot.HEAD;
						}
						else {
							armorModel.bipedLeftArm2.showModel = slot == EntityEquipmentSlot.LEGS;
						}

						if (item_Gaimdriver.get_lock(living.getItemStackFromSlot(EntityEquipmentSlot.FEET))!="energy_cherry_arms")

						{
							armorModel.bipedRightArm2.showModel = slot == EntityEquipmentSlot.HEAD;
							
						}else {
							armorModel.bipedRightArm2.showModel = slot == EntityEquipmentSlot.LEGS;
						}

				}}

				armorModel.bipedBody2.showModel = slot == EntityEquipmentSlot.HEAD;
				armorModel.bipedLeftLeg2.showModel = slot == EntityEquipmentSlot.HEAD;
				armorModel.bipedRightLeg2.showModel = slot == EntityEquipmentSlot.HEAD;
				
				armorModel.bipedBody3.showModel = slot == EntityEquipmentSlot.HEAD;
				
				armorModel.bipedHead2.showModel = slot == EntityEquipmentSlot.HEAD;
				armorModel.bipedHeadwear2.showModel = slot == EntityEquipmentSlot.HEAD;


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

	
}