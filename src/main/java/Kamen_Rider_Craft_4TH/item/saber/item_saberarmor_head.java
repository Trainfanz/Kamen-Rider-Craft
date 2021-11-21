package Kamen_Rider_Craft_4TH.item.saber;

import javax.annotation.Nullable;

import Kamen_Rider_Craft_4TH.ReiwaRiderItems;
import Kamen_Rider_Craft_4TH.TokuCraft_core;
import Kamen_Rider_Craft_4TH.item.ryuki.item_ryukiarmor2;
import Kamen_Rider_Craft_4TH.model.tokuArmorModel;
import Kamen_Rider_Craft_4TH.model.tokuArmorModelSaber;
import Kamen_Rider_Craft_4TH.util.IHasModel;
import Kamen_Rider_Craft_4TH.util.Refercence;
import net.minecraft.client.model.ModelBiped;
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

public class item_saberarmor_head extends ItemArmor  implements IHasModel
{

	private static final int[] maxDamageArray = new int[] {11, 16, 15, 13};
	public String armorNamePrefix;
	public ArmorMaterial material;

	public item_saberarmor_head (String name,ArmorMaterial par2EnumArmorMaterial, int par3, EntityEquipmentSlot par4)
	{
		super(par2EnumArmorMaterial, par3, par4);
		this.material = par2EnumArmorMaterial;
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

	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, EntityEquipmentSlot slot, String type)
	{
		if (entity instanceof EntityLivingBase){
			EntityLivingBase player = ((EntityLivingBase)entity);


			if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET)!= null){

				if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem()instanceof item_saberdriver){
					String part= "m";
					if (slot == EntityEquipmentSlot.HEAD) {
						part= "l";
					}else if (slot == EntityEquipmentSlot.LEGS) {
						part= "r";
					}
					
					return Refercence.MODID+":textures/armor/"+item_saberdriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET),part)+".png";
				}
			}
		}
		else
		{
			return Refercence.MODID+":textures/armor/blank.png";



		}
		return Refercence.MODID+":textures/armor/blank.png";

	}

	@Override
	@SideOnly(Side.CLIENT)
	@Nullable
	public ModelBiped getArmorModel(EntityLivingBase living, ItemStack stack, EntityEquipmentSlot slot, ModelBiped defaultModel)
	{
		if(!stack.isEmpty())
		{
			if(stack.getItem() instanceof item_saberarmor_head)
			{
				tokuArmorModelSaber armorModel = new tokuArmorModelSaber();


				armorModel.bipedBody2.showModel = true;
				armorModel.bipedRightArm2.showModel = slot == EntityEquipmentSlot.HEAD;
				armorModel.bipedLeftArm2.showModel = slot != EntityEquipmentSlot.HEAD;

				armorModel.bipedLeftLeg2.showModel = slot == EntityEquipmentSlot.CHEST;
				armorModel.bipedRightLeg2.showModel = slot == EntityEquipmentSlot.CHEST;

				armorModel.bipedLeftLeg3.showModel = slot ==EntityEquipmentSlot.LEGS;
				armorModel.bipedRightLeg3.showModel = slot == EntityEquipmentSlot.HEAD;

				
				armorModel.bipedBody3.showModel = slot == EntityEquipmentSlot.CHEST;

				armorModel.bipedHead2.showModel = true;
				armorModel.bipedHeadwear2.showModel = true;

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
		return ReiwaRiderItems.blank_wonder_ride_book == repair.getItem() ? true : super.getIsRepairable(toRepair, repair);
	}

}