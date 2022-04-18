package Kamen_Rider_Craft_4TH.item.Ex_Aid;

import javax.annotation.Nullable;

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

public class item_ex_aidarmor2 extends ItemArmor implements IHasModel
{
	public static final String[] CoreName= new String[] {"","_bike","_xxr","_xxl","_lv1","_lvx","_maximum","_ghost_lv1","_ghost","_drive","_gaim","_wizard","_fourze","_ooo","_w","_decade","_kiva","_den_o","_kabuto","_hibiki","_blade","_faiz","_ryuki","_agito","_kuuga","_ichigou","_invincible","_vrx","_knock_out_fighter_2","_novel","_tank"};
	public static final String[] CoreNameparadox= new String[] {"","fighter_"};
	public static final String[] CoreNamegenm= new String[] {"","_0","_0zombie","","","","_maximum","","","_drive","_gaim","_wizard","_fourze","_ooo","_w","_decade","_kiva","_den_o","_kabuto","_hibiki","_blade","_faiz","_ryuki","_agito","_kuuga","_ichigou"};
	//public static final String[] CoreNamelazer= new String[] {"","_turbo"};
	private static final int[] maxDamageArray = new int[] {11, 16, 15, 13};
	public String armorNamePrefix;
	public ArmorMaterial material;

	public item_ex_aidarmor2 (String name,ArmorMaterial par2EnumArmorMaterial, int par3, EntityEquipmentSlot par4)
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

				if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() instanceof item_ex_aiddriver){
					String rider = ((item_ex_aiddriver)player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem()).Rider;
					if (item_ex_aiddriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET),"1")==0&rider == "lazer"&item_ex_aiddriver.get_lock(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))=="blank"){

						return Refercence.MODID+":textures/armor/blank.png";
					}
					else if (item_ex_aiddriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET),"1")==4){
						if ( slot == EntityEquipmentSlot.LEGS)
						{

							return Refercence.MODID+":textures/armor/"+rider +"_lv1_2.png";

						}
						if (slot == EntityEquipmentSlot.HEAD||slot == EntityEquipmentSlot.CHEST )
						{

							return Refercence.MODID+":textures/armor/"+rider +"_lv1_1.png";

						}
					}else{


						if (rider == "paradox"||rider == "paradox99"){
							if ( slot == EntityEquipmentSlot.LEGS)
							{
								return Refercence.MODID+":textures/armor/"+CoreNameparadox[item_ex_aiddriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET),"1")]+rider +"_2.png";
							}
							if (slot == EntityEquipmentSlot.HEAD||slot == EntityEquipmentSlot.CHEST )
							{
								return Refercence.MODID+":textures/armor/"+ CoreNameparadox[item_ex_aiddriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET),"1")]+rider +"_1.png";
							}
						}
						else  if (rider == "genmu"){
							if ( slot == EntityEquipmentSlot.LEGS)
							{
								return Refercence.MODID+":textures/armor/"+"genmu"+CoreNamegenm[item_ex_aiddriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET),"1")] +"_2.png";
							}
							if (slot == EntityEquipmentSlot.HEAD||slot == EntityEquipmentSlot.CHEST )
							{
								return Refercence.MODID+":textures/armor/"+"genmu"+ CoreNamegenm[item_ex_aiddriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET),"1")] +"_1.png";
							}
						}
						else if (rider=="ex_aid"){
							if ( slot == EntityEquipmentSlot.LEGS)
							{
								return Refercence.MODID+":textures/armor/"+"ex_aid"+CoreName[item_ex_aiddriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET),"1")] +"_2.png";
							}
							if (slot == EntityEquipmentSlot.HEAD||slot == EntityEquipmentSlot.CHEST )
							{
								return Refercence.MODID+":textures/armor/"+"ex_aid"+ CoreName[item_ex_aiddriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET),"1")] +"_1.png";
							}
						}else{
							if ( slot == EntityEquipmentSlot.LEGS)
							{

								return Refercence.MODID+":textures/armor/"+rider + CoreName[item_ex_aiddriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET),"1")] +"_2.png";

							}
							if (slot == EntityEquipmentSlot.HEAD||slot == EntityEquipmentSlot.CHEST )
							{
								if ((rider=="snipe" & item_ex_aiddriver.get_lock(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))=="combatgamer"||rider=="snipe" & item_ex_aiddriver.get_lock(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))=="protocombatgamer")){
									return Refercence.MODID+":textures/armor/snipe_jet_1.png";
								}else if ((rider=="snipe" & item_ex_aiddriver.get_lock(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))!="blank")){
									return Refercence.MODID+":textures/armor/snipe_nocape_1.png";
								}else {
									return Refercence.MODID+":textures/armor/"+rider+ CoreName[item_ex_aiddriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET),"1")] +"_1.png";
								}
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
			if(stack.getItem() instanceof item_ex_aidarmor2)
			{ tokuArmorModel armorModel = new tokuArmorModel();

			if ( living.getItemStackFromSlot(EntityEquipmentSlot.FEET)!=null){

				if (( living.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() instanceof item_ex_aiddriver)){

					if (living.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem()==RiderItems.gamer_driver_proto_lazer||item_ex_aiddriver.get_core(living.getItemStackFromSlot(EntityEquipmentSlot.FEET),"1")==4||item_ex_aiddriver.get_core(living.getItemStackFromSlot(EntityEquipmentSlot.FEET),"1")==5||item_ex_aiddriver.get_core(living.getItemStackFromSlot(EntityEquipmentSlot.FEET),"1")==6||item_ex_aiddriver.get_core(living.getItemStackFromSlot(EntityEquipmentSlot.FEET),"1")==7){

						armorModel = new  bigBiped();
					}
				}
			}


			if(armorModel != null){

				armorModel.bipedBody2.showModel = slot == EntityEquipmentSlot.LEGS;
				armorModel.bipedRightArm2.showModel = slot == EntityEquipmentSlot.CHEST;
				armorModel.bipedLeftArm2.showModel = slot == EntityEquipmentSlot.LEGS;

				armorModel.bipedLeftLeg2.showModel = slot == EntityEquipmentSlot.CHEST;
				armorModel.bipedRightLeg2.showModel = slot == EntityEquipmentSlot.LEGS;

				armorModel.bipedBody3.showModel = slot == EntityEquipmentSlot.CHEST;

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
	
	public boolean getIsRepairable(ItemStack toRepair, ItemStack repair) 
	{
		return RiderItems.blank_gashat == repair.getItem() ? true : super.getIsRepairable(toRepair, repair);
	}
}
