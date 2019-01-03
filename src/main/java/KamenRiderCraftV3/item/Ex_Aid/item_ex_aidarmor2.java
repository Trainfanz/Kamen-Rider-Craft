package KamenRiderCraftV3.item.Ex_Aid;


import KamenRiderCraftV3.item.kuuga.item_kuugaarmor2;
import KamenRiderCraftV3.model.BipedLockseed;
import KamenRiderCraftV3.model.bigBiped;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.util.ResourceLocation;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.Entity;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

public class item_ex_aidarmor2 extends ItemArmor
{

	public static final String[] CoreName= new String[] {"","_bike","_xxr","_xxl","_lv1","_lvx","_maximum","_ghost_lv1","_ghost","_drive","_gaim","_wizard","_fourze","_ooo","_w","_decade","_kiva","_den_o","_kabuto","_hibiki","_blade","_faiz","_ryuki","_agito","_kuuga","_ichigou","_invincible","_vrx","_knock_out_fighter_2"};
	public static final String[] CoreNameparadox= new String[] {"","fighter_"};
	public static final String[] CoreNamegenm= new String[] {"","_0","_0zombie","","","","_maximum","","","_drive","_gaim","_wizard","_fourze","_ooo","_w","_decade","_kiva","_den_o","_kabuto","_hibiki","_blade","_faiz","_ryuki","_agito","_kuuga","_ichigou"};
	//public static final String[] CoreNamelazer= new String[] {"","_turbo"};
	private static final int[] maxDamageArray = new int[] {11, 16, 15, 13};
	public String armorNamePrefix;
	public ArmorMaterial material;

	public item_ex_aidarmor2 (ArmorMaterial par2EnumArmorMaterial, int par3, int par4)
	{
		super(par2EnumArmorMaterial, par3, par4);
		this.material = par2EnumArmorMaterial;
		par2EnumArmorMaterial.getDamageReductionAmount(par4);
		this.setMaxDamage(par2EnumArmorMaterial.getDurability(par4));
		this.maxStackSize = 1;
	}


	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
	{

		if (entity instanceof EntityLivingBase){
			EntityLivingBase player = ((EntityLivingBase)entity);


			if (player.getEquipmentInSlot(1)!= null){

				if (player.getEquipmentInSlot(1).getItem() instanceof item_ex_aiddriver){
					String rider = ((item_ex_aiddriver)player.getEquipmentInSlot(1).getItem()).Rider;
					if (item_ex_aiddriver.get_core(player.getEquipmentInSlot(1),"1")==0&rider == "lazer"&item_ex_aiddriver.get_lock(player.getEquipmentInSlot(1))=="blank"){

						return "KamenRiderCraftV3:textures/armor/blank.png";
					}
					else if (item_ex_aiddriver.get_core(player.getEquipmentInSlot(1),"1")==4){
						if ( slot == 2)
						{

							return "KamenRiderCraftV3:textures/armor/"+rider +"_lv1_2.png";

						}
						if (slot == 0||slot == 1 )
						{

							return "KamenRiderCraftV3:textures/armor/"+rider +"_lv1_1.png";

						}
					}else{


						if (rider == "paradox"||rider == "paradox99"){
							if ( slot == 2)
							{
								return "KamenRiderCraftV3:textures/armor/"+CoreNameparadox[item_ex_aiddriver.get_core(player.getEquipmentInSlot(1),"1")]+rider +"_2.png";
							}
							if (slot == 0||slot == 1 )
							{
								return "KamenRiderCraftV3:textures/armor/"+ CoreNameparadox[item_ex_aiddriver.get_core(player.getEquipmentInSlot(1),"1")]+rider +"_1.png";
							}
						}
						else  if (rider == "genmu"){
							if ( slot == 2)
							{
								return "KamenRiderCraftV3:textures/armor/"+"genmu"+CoreNamegenm[item_ex_aiddriver.get_core(player.getEquipmentInSlot(1),"1")] +"_2.png";
							}
							if (slot == 0||slot == 1 )
							{
								return "KamenRiderCraftV3:textures/armor/"+"genmu"+ CoreNamegenm[item_ex_aiddriver.get_core(player.getEquipmentInSlot(1),"1")] +"_1.png";
							}
						}
						else if (rider=="ex_aid"){
							if ( slot == 2)
							{
								return "KamenRiderCraftV3:textures/armor/"+"ex_aid"+CoreName[item_ex_aiddriver.get_core(player.getEquipmentInSlot(1),"1")] +"_2.png";
							}
							if (slot == 0||slot == 1 )
							{
								return "KamenRiderCraftV3:textures/armor/"+"ex_aid"+ CoreName[item_ex_aiddriver.get_core(player.getEquipmentInSlot(1),"1")] +"_1.png";
							}
						}else{
							if ( slot == 2)
							{

								return "KamenRiderCraftV3:textures/armor/"+rider +"_2.png";

							}
							if (slot == 0||slot == 1 )
							{
								if ((rider=="snipe" & item_ex_aiddriver.get_lock(player.getEquipmentInSlot(1))=="combatgamer"||rider=="snipe" & item_ex_aiddriver.get_lock(player.getEquipmentInSlot(1))=="protocombatgamer")){
									return "KamenRiderCraftV3:textures/armor/snipe_jet_1.png";
								}else if ((rider=="snipe" & item_ex_aiddriver.get_lock(player.getEquipmentInSlot(1))!="blank")){
									return "KamenRiderCraftV3:textures/armor/snipe_nocape_1.png";
								}else {
									return "KamenRiderCraftV3:textures/armor/"+rider +"_1.png";
								}
							}
						}
					}

				}
				return "KamenRiderCraftV3:textures/armor/blank.png";


			}
		}
		else
		{
			return "KamenRiderCraftV3:textures/armor/blank.png";



		}
		return "KamenRiderCraftV3:textures/armor/blank.png";

	}



	@Override
	@SideOnly(Side.CLIENT)
	public ModelBiped getArmorModel(EntityLivingBase entityLiving,ItemStack itemStack, int armorSlot) {

		BipedLockseed armorModel = new BipedLockseed();

		if ( entityLiving.getEquipmentInSlot(1)!=null){

			if (( entityLiving.getEquipmentInSlot(1).getItem() instanceof item_ex_aiddriver)){

				if (item_ex_aiddriver.get_core(entityLiving.getEquipmentInSlot(1),"1")==4||item_ex_aiddriver.get_core(entityLiving.getEquipmentInSlot(1),"1")==5||item_ex_aiddriver.get_core(entityLiving.getEquipmentInSlot(1),"1")==6||item_ex_aiddriver.get_core(entityLiving.getEquipmentInSlot(1),"1")==7){
					
				armorModel = new  bigBiped();
				}
			}
		}

		if(itemStack != null){
			if(itemStack.getItem() instanceof item_ex_aidarmor2){
				int type = ((ItemArmor)itemStack.getItem()).armorType;
			}
			if(armorModel != null){


				armorModel.bipedBody3.showModel = armorSlot == 3;
				armorModel.bipedRightArm2.showModel = armorSlot == 3;
				armorModel.bipedLeftLeg2.showModel = armorSlot == 3;
				armorModel.bipedBody2.showModel = armorSlot == 2;
				armorModel.bipedLeftArm2.showModel =armorSlot == 2;
				armorModel.bipedRightLeg2.showModel =armorSlot == 2;
				armorModel.bipedHead2.showModel= armorSlot == 3;
				armorModel.bipedHeadwear2.showModel= armorSlot == 3;

				armorModel.isSneak = entityLiving.isSneaking();
				armorModel.isRiding = entityLiving.isRiding();
				armorModel.isChild = entityLiving.isChild();
				armorModel.heldItemRight = entityLiving.getHeldItem() != null ? 1 :0;
				armorModel.swingProgress = entityLiving.swingProgress;

				return armorModel;
			}
		}

		return null;
	}



}
