package Kamen_Rider_Craft_4TH.item.rider_armor_base;


import javax.annotation.Nullable;

import Kamen_Rider_Craft_4TH.RiderItems;
import Kamen_Rider_Craft_4TH.TokuCraft_core;
import Kamen_Rider_Craft_4TH.item.Ichigo.item_Ichigoarmor;
import Kamen_Rider_Craft_4TH.model.tokuArmorModel;
import Kamen_Rider_Craft_4TH.util.IHasModel;
import Kamen_Rider_Craft_4TH.util.Refercence;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class item_rider_armor extends ItemArmor  implements IHasModel
{
	private static final int[] maxDamageArray = new int[] {11, 16, 15, 13};
	public String armorNamePrefix;
	public ArmorMaterial material;
	public Class<? extends item_rider_driver> BELTCLASS;
	private final Item base;   
	
	public item_rider_armor (String name,Class<? extends item_rider_driver> beltClass,ArmorMaterial par2EnumArmorMaterial, int par3, EntityEquipmentSlot par4, Item item)
	{
		super(par2EnumArmorMaterial, par3, par4);
		this.material = par2EnumArmorMaterial;
		par2EnumArmorMaterial.getDamageReductionAmount(par4);
		this.setMaxDamage(par2EnumArmorMaterial.getDurability(par4));
		this.maxStackSize = 1;
        setTranslationKey(name);
        setRegistryName(name);
        TokuCraft_core.ITEMS.add(this);
        BELTCLASS=beltClass;
        base = item;
	}


	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, EntityEquipmentSlot slot, String type)
	{

		if (entity instanceof EntityLivingBase){
			EntityLivingBase player = ((EntityLivingBase)entity);


			if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET)!= null){

				if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem().getClass()==BELTCLASS){

					
					String rider = ((item_rider_driver)player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem()).Rider;
				
					if ( slot == EntityEquipmentSlot.LEGS& ((item_rider_driver)player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem()).LEGS==this)
					{
						return Refercence.MODID+":textures/armor/"+rider+item_rider_driver.get_Form_Item_tex(player.getItemStackFromSlot(EntityEquipmentSlot.FEET),1).getFormName() +"_2.png";
					}
					if (slot == EntityEquipmentSlot.HEAD&((item_rider_driver)player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem()).HEAD==this||slot == EntityEquipmentSlot.CHEST&((item_rider_driver)player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem()).TORSO==this )
					{
						return Refercence.MODID+":textures/armor/"+rider+item_rider_driver.get_Form_Item_tex(player.getItemStackFromSlot(EntityEquipmentSlot.FEET),1).getFormName() +"_1.png";
					}
					}
				return Refercence.MODID+":textures/armor/blank.png";
			}
		}
		else
		{
			return Refercence.MODID+":textures/armor/blank.png";
		}
		return Refercence.MODID+":textures/armor/blank.png";
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
	public void registerModels() {
		TokuCraft_core.proxy.registerItemRender(this,0,"inventory");
	}
	@Override
	@SideOnly(Side.CLIENT)
	@Nullable
	public ModelBiped getArmorModel(EntityLivingBase living, ItemStack stack, EntityEquipmentSlot slot, ModelBiped defaultModel)
	{
		if(!stack.isEmpty())
		{
			if(stack.getItem() instanceof  item_rider_armor)
			{
				tokuArmorModel armorModel = new tokuArmorModel();

				
				armorModel.bipedBody2.showModel = slot == EntityEquipmentSlot.LEGS;
				armorModel.bipedRightArm2.showModel = slot == EntityEquipmentSlot.CHEST;
				armorModel.bipedLeftArm2.showModel = slot == EntityEquipmentSlot.LEGS;
				
				armorModel.bipedLeftLeg2.showModel = slot == EntityEquipmentSlot.CHEST;
				armorModel.bipedRightLeg2.showModel = slot == EntityEquipmentSlot.LEGS;
				
				armorModel.bipedBody3.showModel = slot == EntityEquipmentSlot.CHEST;
				
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
	
	public boolean getIsRepairable(ItemStack toRepair, ItemStack repair) 
	{
		return RiderItems.rider_circuit == repair.getItem() ? true : super.getIsRepairable(toRepair, repair);
	}
}