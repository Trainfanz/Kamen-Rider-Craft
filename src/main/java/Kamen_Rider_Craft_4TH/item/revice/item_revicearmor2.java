package Kamen_Rider_Craft_4TH.item.revice;

import javax.annotation.Nullable;

import Kamen_Rider_Craft_4TH.ReiwaRiderItems;
import Kamen_Rider_Craft_4TH.RiderItems;
import Kamen_Rider_Craft_4TH.TokuCraft_core;
import Kamen_Rider_Craft_4TH.item.ghost.item_ghost_armor3;
import Kamen_Rider_Craft_4TH.model.bigBiped;
import Kamen_Rider_Craft_4TH.model.tokuArmorModel;
import Kamen_Rider_Craft_4TH.util.IHasModel;
import Kamen_Rider_Craft_4TH.util.Refercence;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.util.ResourceLocation;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.Entity;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

public class item_revicearmor2 extends ItemArmor implements IHasModel
{
	public static final String[] CoreName= new String[] {"","_barid_rex","_volcano_rex",""};
	
	private static final int[] maxDamageArray = new int[] {11, 16, 15, 13};
	public String armorNamePrefix;
	public ArmorMaterial material;

	public item_revicearmor2 (String name,ArmorMaterial par2EnumArmorMaterial, int par3, EntityEquipmentSlot par4)
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
	public String getArmorTexture(ItemStack stack, Entity entity, EntityEquipmentSlot slot, String type)
	{
		if (entity instanceof EntityLivingBase){
			EntityLivingBase player = ((EntityLivingBase)entity);


			if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET)!= null){

				if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() instanceof item_revicedriver){
					String rider = ((item_revicedriver)player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem()).Rider;


					{
						String form = item_revicedriver.get_lockbase(player.getItemStackFromSlot(EntityEquipmentSlot.FEET));
						
						if ( slot == EntityEquipmentSlot.LEGS)
						{
								if(form=="jackal"&player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem()==ReiwaRiderItems.vice_belt){
									return Refercence.MODID+":textures/armor/vice_jackal_2.png";	
									
								}else{
								return Refercence.MODID+":textures/armor/"+rider+CoreName[item_revicedriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), "1")]+"_2.png";	
								}			
						}
						if (slot == EntityEquipmentSlot.HEAD||slot == EntityEquipmentSlot.CHEST )
						{
							if(form=="jackal"&player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem()==ReiwaRiderItems.vice_belt){
								return Refercence.MODID+":textures/armor/vice_jackal_1.png";	
								
							}else{
							return Refercence.MODID+":textures/armor/"+rider+CoreName[item_revicedriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), "1")]+"_1.png";	
							}
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
			if(stack.getItem() instanceof item_revicearmor2)
			{ tokuArmorModel armorModel = new tokuArmorModel();
			if(armorModel != null){

				armorModel.bipedBody2.showModel = slot == EntityEquipmentSlot.LEGS;
				armorModel.bipedRightArm2.showModel = slot == EntityEquipmentSlot.CHEST;
				armorModel.bipedLeftArm2.showModel = slot == EntityEquipmentSlot.LEGS;

				armorModel.bipedLeftLeg2.showModel = slot == EntityEquipmentSlot.CHEST;
				armorModel.bipedRightLeg2.showModel = slot == EntityEquipmentSlot.LEGS;

				armorModel.bipedBody3.showModel = slot == EntityEquipmentSlot.CHEST;

				armorModel.bipedHead2.showModel = slot == EntityEquipmentSlot.HEAD;
				armorModel.bipedHeadwear2.showModel = slot == EntityEquipmentSlot.HEAD;


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
	
	public boolean getIsRepairable(ItemStack toRepair, ItemStack repair) 
	{
		return ReiwaRiderItems.hiden_metal == repair.getItem() ? true : super.getIsRepairable(toRepair, repair);
	}
}
