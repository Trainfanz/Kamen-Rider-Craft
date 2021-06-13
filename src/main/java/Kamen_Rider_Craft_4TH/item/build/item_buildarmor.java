package Kamen_Rider_Craft_4TH.item.build;

import javax.annotation.Nullable;

import Kamen_Rider_Craft_4TH.RiderItems;
import Kamen_Rider_Craft_4TH.TokuCraft_core;
import Kamen_Rider_Craft_4TH.item.Ex_Aid.item_ex_aidarmor2;
import Kamen_Rider_Craft_4TH.item.Ex_Aid.item_ex_aiddriver;
import Kamen_Rider_Craft_4TH.model.bigBiped;
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

public class item_buildarmor extends ItemArmor implements IHasModel
{


	public static final String[] CoreNamelegend= new String[] {"ex_aid","ghost","drive","gaim","wizard","fourze","ooo","w","decade","deno"};	

	private static final int[] maxDamageArray = new int[] {11, 16, 15, 13};
	public String armorNamePrefix;
	public ArmorMaterial material;

	public item_buildarmor (String name,ArmorMaterial par2EnumArmorMaterial, int par3, EntityEquipmentSlot par4)
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

	@Override
	@SideOnly(Side.CLIENT)
	@Nullable
	public ModelBiped getArmorModel(EntityLivingBase living, ItemStack stack, EntityEquipmentSlot slot, ModelBiped defaultModel)
	{
		if(!stack.isEmpty())
		{
			if(stack.getItem() instanceof item_buildarmor)
			{ 
				tokuArmorModel armorModel = new tokuArmorModel();
				if(armorModel != null){
					armorModel.bipedBody2.showModel = slot == EntityEquipmentSlot.CHEST;
					armorModel.bipedRightArm2.showModel = slot == EntityEquipmentSlot.CHEST;
					armorModel.bipedLeftArm2.showModel = slot == EntityEquipmentSlot.LEGS;
					armorModel.bipedLeftLeg2.showModel = slot == EntityEquipmentSlot.CHEST;
					armorModel.bipedRightLeg2.showModel = slot == EntityEquipmentSlot.LEGS;
					armorModel.bipedBody3.showModel = slot == EntityEquipmentSlot.LEGS;
					armorModel.bipedHead2.showModel = slot == EntityEquipmentSlot.CHEST;
					armorModel.bipedHeadwear2.showModel = slot == EntityEquipmentSlot.CHEST;
					armorModel.isSneak = living.isSneaking();
					armorModel.isRiding = living.isRiding();
					armorModel.isChild = living.isChild();
					armorModel.swingProgress = living.swingProgress;
					return armorModel;
				}
			}
			}
			return null;
	}

	public String getArmorTexture(ItemStack stack, Entity entity, EntityEquipmentSlot slot, String type)
	{

		if (entity instanceof EntityLivingBase){

			EntityLivingBase player = ((EntityLivingBase)entity);


			if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET)!= null){

				if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.build_driver||player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.build_driver_cross_z||player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.sclash_driver_grease||player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.sclash_driver_cross_z_charge){
					if (getlegend(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))!=0){
						return Refercence.MODID+":textures/armor/"+"build_"+ CoreNamelegend[getlegend(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))-1] +"_2.png";

					}else{


						return Refercence.MODID+":textures/armor/"+"build_under.png";
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


	public int getlegend(ItemStack stack)
	{
		int islegend =0;
		if (item_builddriver.get_core(stack,"1")==7&item_builddriver.get_core(stack,"3")==9){
			islegend = 4;
		}else if (item_builddriver.get_core(stack,"1")==9&item_builddriver.get_core(stack,"3")==2){
			islegend = 7;
		}else if (item_builddriver.get_core(stack,"1")==10&item_builddriver.get_core(stack,"3")==10){
			islegend = 1;
		}	else if (item_builddriver.get_core(stack,"1")==1&item_builddriver.get_core(stack,"3")==12){
			islegend = 5;
		}	else if (item_builddriver.get_core(stack,"1")==12&item_builddriver.get_core(stack,"3")==13){
			islegend = 8;
		}	else if (item_builddriver.get_core(stack,"1")==5&item_builddriver.get_core(stack,"3")==19){
			islegend = 6;
		}else if (item_builddriver.get_core(stack,"1")==13&item_builddriver.get_core(stack,"3")==18){
			islegend = 10;
		}else if (item_builddriver.get_core(stack,"1")==17&item_builddriver.get_core(stack,"3")==20){
			islegend = 2;
		}else if (item_builddriver.get_core(stack,"1")==19&item_builddriver.get_core(stack,"3")==23){
			islegend = 9;
		}

		return islegend;
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
    	return RiderItems.full_bottle == repair.getItem() ? true : super.getIsRepairable(toRepair, repair);
    }

}