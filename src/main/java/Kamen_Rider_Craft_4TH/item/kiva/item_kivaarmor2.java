package Kamen_Rider_Craft_4TH.item.kiva;

import javax.annotation.Nullable;

import Kamen_Rider_Craft_4TH.RiderItems;
import Kamen_Rider_Craft_4TH.TokuCraft_core;
import Kamen_Rider_Craft_4TH.model.tokuArmorModel;
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

public class item_kivaarmor2 extends ItemArmor implements IHasModel
{

	public static final String[] CoreName= new String[] {"","_garulu","_basshaa","_dogga","_dogabaki","_emperor","_dogabaki_emperor"};
	public static final String[] ixaCoreName= new String[] {"_save","_burst","_rising"};

	private static final int[] maxDamageArray = new int[] {11, 16, 15, 13};
	public String armorNamePrefix;
	public ArmorMaterial material;

	public item_kivaarmor2 (String name,ArmorMaterial par2EnumArmorMaterial, int par3, EntityEquipmentSlot par4)
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

				if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.kivadriver){

					if ( slot == EntityEquipmentSlot.LEGS)
					{
						return Refercence.MODID+":textures/armor/"+"kiva"+CoreName[item_kivadriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))] +"_2.png";
					}
					if (slot == EntityEquipmentSlot.HEAD||slot == EntityEquipmentSlot.CHEST )
					{
						return Refercence.MODID+":textures/armor/"+"kiva"+ CoreName[item_kivadriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))] +"_1.png";
					}


				}else if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.darkkivadriver){

					if ( slot == EntityEquipmentSlot.LEGS)
					{
						return Refercence.MODID+":textures/armor/"+"dark_kiva" +"_2.png";
					}
					if (slot == EntityEquipmentSlot.HEAD||slot == EntityEquipmentSlot.CHEST )
					{
						return Refercence.MODID+":textures/armor/"+"dark_kiva" +"_1.png";
					}


				}else if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.newkivadriver){

					if ( slot == EntityEquipmentSlot.LEGS)
					{
						return Refercence.MODID+":textures/armor/"+"kiva" +"_2.png";
					}
					if (slot == EntityEquipmentSlot.HEAD||slot == EntityEquipmentSlot.CHEST )
					{
						return Refercence.MODID+":textures/armor/"+"kiva" +"_1.png";
					}
					return Refercence.MODID+":textures/armor/blank.png";


				}else if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.ixa_belt){

					if ( slot == EntityEquipmentSlot.LEGS)
					{
						return Refercence.MODID+":textures/armor/"+"ixa"+ixaCoreName[item_kivadriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))] +"_2.png";
					}
					if (slot == EntityEquipmentSlot.HEAD||slot == EntityEquipmentSlot.CHEST )
					{
						return Refercence.MODID+":textures/armor/"+"ixa"+ixaCoreName[item_kivadriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))] +"_1.png";
					}
				}else if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.sagarc_belt){

					if ( slot == EntityEquipmentSlot.LEGS)
					{
						return Refercence.MODID+":textures/armor/"+"saga" +"_2.png";
					}
					if (slot == EntityEquipmentSlot.HEAD||slot == EntityEquipmentSlot.CHEST )
					{
						return Refercence.MODID+":textures/armor/"+"saga" +"_1.png";
					}
				}else if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.kivaladriver){

					if ( slot == EntityEquipmentSlot.LEGS)
					{
						return Refercence.MODID+":textures/armor/"+"kivala" +"_2.png";
					}
					if (slot == EntityEquipmentSlot.HEAD||slot == EntityEquipmentSlot.CHEST )
					{
						return Refercence.MODID+":textures/armor/"+"kivala" +"_1.png";
					}
				}else if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.arcdriver){

					if ( slot == EntityEquipmentSlot.LEGS)
					{
						return Refercence.MODID+":textures/armor/"+"arc" +"_2.png";
					}
					if (slot == EntityEquipmentSlot.HEAD||slot == EntityEquipmentSlot.CHEST )
					{
						return Refercence.MODID+":textures/armor/"+"arc" +"_1.png";
					}
				}else  if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.reydriver){

					if ( slot == EntityEquipmentSlot.LEGS)
					{
						return Refercence.MODID+":textures/armor/"+"rey" +"_2.png";
					}
					if (slot == EntityEquipmentSlot.HEAD||slot == EntityEquipmentSlot.CHEST )
					{
						return Refercence.MODID+":textures/armor/"+"rey" +"_1.png";
					}
					return Refercence.MODID+":textures/armor/blank.png";


				}
			}
			else
			{
				return Refercence.MODID+":textures/armor/blank.png";


			}
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
			if(stack.getItem() instanceof item_kivaarmor2)
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
		return RiderItems.fuestle == repair.getItem() ? true : super.getIsRepairable(toRepair, repair);
	}


}