package Kamen_Rider_Craft_4TH.item.wizard;

import javax.annotation.Nullable;

import Kamen_Rider_Craft_4TH.RiderItems;
import Kamen_Rider_Craft_4TH.TokuCraft_core;
import Kamen_Rider_Craft_4TH.item.fourze.item_Fourzearmor2;
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
import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class item_wizardarmor2 extends ItemArmor implements IHasModel
{
	public static final String[] CoreName= new String[] {"flame","water","hurricane","land","flame_dragon","water_dragon","hurricane_dragon","land_dragon","infinity","infinity_gold","falco_mantle_dragon","dressup"};
	public static final String[] CoreName2= new String[] {"","_falco","_chameleo","_buffa","_dolphi","_hyper","_land"};

	private static final int[] maxDamageArray = new int[] {11, 16, 15, 13};
	public String armorNamePrefix;
	public ArmorMaterial material;

	public item_wizardarmor2 (String name,ArmorMaterial par2EnumArmorMaterial, int par3, EntityEquipmentSlot par4)
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

				if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.wizardriver){

					if ( slot == EntityEquipmentSlot.LEGS)
					{
						return Refercence.MODID+":textures/armor/"+"wizard_"+ CoreName[item_wizarddriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET),"1")] +"_2.png";
					}
					if (slot == EntityEquipmentSlot.HEAD||slot == EntityEquipmentSlot.CHEST )
					{
						return Refercence.MODID+":textures/armor/"+"wizard_"+ CoreName[item_wizarddriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET),"1")] +"_1.png";
					}


				}else if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.beastdriver){

					if ( slot == EntityEquipmentSlot.LEGS)
						
					{	if (item_wizarddriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET),"1")==6){
						return Refercence.MODID+":textures/armor/"+"beast_land_2.png";
						}else if (item_wizarddriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET),"1")!=5){
						return Refercence.MODID+":textures/armor/"+"beast_2.png";
						}else{
							return Refercence.MODID+":textures/armor/"+"beast_hyper_2.png";
						}
					}
					if (slot == EntityEquipmentSlot.HEAD||slot == EntityEquipmentSlot.CHEST )
					{
						return Refercence.MODID+":textures/armor/"+"beast"+ CoreName2[item_wizarddriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET),"1")] +"_1.png";
					}


				}else if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.whitewizardriver){

					if ( slot == EntityEquipmentSlot.LEGS)
						
					{	return Refercence.MODID+":textures/armor/"+"wiseman_2.png";
						
					}
					if (slot == EntityEquipmentSlot.HEAD||slot == EntityEquipmentSlot.CHEST )
					{
						return Refercence.MODID+":textures/armor/"+"wiseman_1.png";
					}


				}else if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.whitewizardriverf){

					if ( slot == EntityEquipmentSlot.LEGS)
						
					{	return Refercence.MODID+":textures/armor/"+"wiseman_f_2.png";
						
					}
					if (slot == EntityEquipmentSlot.HEAD||slot == EntityEquipmentSlot.CHEST )
					{
						return Refercence.MODID+":textures/armor/"+"wiseman_f_1.png";
					}


				}else if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.darkwizardriver){

					if ( slot == EntityEquipmentSlot.LEGS)
						
					{	return Refercence.MODID+":textures/armor/"+"dark_wizard_2.png";
						
					}
					if (slot == EntityEquipmentSlot.HEAD||slot == EntityEquipmentSlot.CHEST )
					{
						return Refercence.MODID+":textures/armor/"+"dark_wizard_1.png";
					}


				}else if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.blackwizardriver){

					if ( slot == EntityEquipmentSlot.LEGS)
						
					{	return Refercence.MODID+":textures/armor/"+"black_wizard_2.png";
						
					}
					if (slot == EntityEquipmentSlot.HEAD||slot == EntityEquipmentSlot.CHEST )
					{
						return Refercence.MODID+":textures/armor/"+"black_wizard_1.png";
					}


				}else if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.magewizardriver){

					if ( slot == EntityEquipmentSlot.LEGS)
						
					{	return Refercence.MODID+":textures/armor/"+"mage_2.png";
						
					}
					if (slot == EntityEquipmentSlot.HEAD||slot == EntityEquipmentSlot.CHEST )
					{
						return Refercence.MODID+":textures/armor/"+"mage_1.png";
					}


				}else if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.magewizardriver_b){

					if ( slot == EntityEquipmentSlot.LEGS)
						
					{	return Refercence.MODID+":textures/armor/"+"mage_b_2.png";
						
					}
					if (slot == EntityEquipmentSlot.HEAD||slot == EntityEquipmentSlot.CHEST )
					{
						return Refercence.MODID+":textures/armor/"+"mage_b_1.png";
					}


				}else if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.magewizardriver_g){

					if ( slot == EntityEquipmentSlot.LEGS)
						
					{	return Refercence.MODID+":textures/armor/"+"mage_g_2.png";
						
					}
					if (slot == EntityEquipmentSlot.HEAD||slot == EntityEquipmentSlot.CHEST )
					{
						return Refercence.MODID+":textures/armor/"+"mage_g_1.png";
					}


				}else if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.sorcererdriver){

					if ( slot == EntityEquipmentSlot.LEGS)
						
					{	return Refercence.MODID+":textures/armor/"+"sorcerer_2.png";
						
					}
					if (slot == EntityEquipmentSlot.HEAD||slot == EntityEquipmentSlot.CHEST )
					{
						return Refercence.MODID+":textures/armor/"+"sorcerer_1.png";
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
			if(stack.getItem() instanceof item_wizardarmor2)
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

	}