package Kamen_Rider_Craft_4TH.item.faiz;


import javax.annotation.Nullable;

import Kamen_Rider_Craft_4TH.TokuCraft_core;
import Kamen_Rider_Craft_4TH.item.agito.item_agitoarmor2;
import Kamen_Rider_Craft_4TH.item.agito.item_agitodriver;
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

public class item_faizarmor2 extends ItemArmor implements IHasModel
{
	public static final String[] CoreName= new String[] {"","_accel","_blaster"};
	
	public item_faizarmor2 (String name,ArmorMaterial par2EnumArmorMaterial, int par3, EntityEquipmentSlot par4)
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
	public String getArmorTexture(ItemStack stack, Entity entity, EntityEquipmentSlot slot, String type)
	{

		if (entity instanceof EntityLivingBase){
			EntityLivingBase player = ((EntityLivingBase)entity);


			if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET)!= null){

				if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() instanceof item_faizdriver){

					String rider = ((item_faizdriver)player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem()).Rider;
					
					if (rider=="faiz"){
						if ( slot == EntityEquipmentSlot.LEGS)
						{
						return Refercence.MODID+":textures/armor/"+"faiz"+CoreName[item_faizdriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))] +"_2.png";
					}
						if (slot == EntityEquipmentSlot.HEAD||slot == EntityEquipmentSlot.CHEST )
						{
						return Refercence.MODID+":textures/armor/"+"faiz"+ CoreName[item_faizdriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))] +"_1.png";
					}
					}else{
						if ( slot == EntityEquipmentSlot.LEGS){	
							return Refercence.MODID+":textures/armor/"+rider +"_2.png";
						}
						if (slot == EntityEquipmentSlot.HEAD||slot == EntityEquipmentSlot.CHEST )
						{	return Refercence.MODID+":textures/armor/"+rider +"_1.png";
						}
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

	@Override
	@SideOnly(Side.CLIENT)
	@Nullable
	public ModelBiped getArmorModel(EntityLivingBase living, ItemStack stack, EntityEquipmentSlot slot, ModelBiped defaultModel)
	{
		if(!stack.isEmpty())
		{
			if(stack.getItem() instanceof item_faizarmor2)
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

	
	@Override
	public void registerModels() {
		TokuCraft_core.proxy.registerItemRender(this,0,"inventory");
	}
}