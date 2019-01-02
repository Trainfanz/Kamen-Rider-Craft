package KamenRiderCraftV3.item.drive;

import KamenRiderCraftV3.RiderItems;
import KamenRiderCraftV3.item.agito.item_agitoarmor2;
import KamenRiderCraftV3.model.BipedLockseed;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraft.entity.Entity;

public class item_drivearmor2 extends ItemArmor
{

	public static final String[] CoreName= new String[] {"","_wild","_high_speed","_proto","_technique","_fruits","_dead_heat","_formula","_tridoron","_next","_special","_zerodrive","_miracle","_type_speed_wild_technic"};
	public static final String[] CoreName2= new String[] {"mach","mach_dead_heat","chaser","mach_chaser","mach_dead_heat_drive","super_dead_heat","chaser_mach","super_deadheat_mach"};
	
	private static final int[] maxDamageArray = new int[] {11, 16, 15, 13};
	public String armorNamePrefix;
	public ArmorMaterial material;

	public item_drivearmor2 (ArmorMaterial par2EnumArmorMaterial, int par3, int par4)
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

				if (player.getEquipmentInSlot(1).getItem() instanceof item_drivedriver){

					if (player.getEquipmentInSlot(1).getItem() == RiderItems.drivedriver){
						
					if ( slot == 2)
					{
						return "kamenRiderCraftv3:textures/armor/"+"drive"+CoreName[item_drivedriver.get_core(player.getEquipmentInSlot(1))] +"_2.png";
					}
					if (slot == 0||slot == 1 )
					{
						return "kamenRiderCraftv3:textures/armor/"+"drive"+ CoreName[item_drivedriver.get_core(player.getEquipmentInSlot(1))] +"_1.png";
					}

					}else 	if (player.getEquipmentInSlot(1).getItem() == RiderItems.mach_driver_honoh){
						if ( slot == 2)
						{
							return "kamenRiderCraftv3:textures/armor/"+CoreName2[item_drivedriver.get_core(player.getEquipmentInSlot(1))] +"_2.png";
						}
						if (slot == 0||slot == 1 )
						{
							return "kamenRiderCraftv3:textures/armor/"+ CoreName2[item_drivedriver.get_core(player.getEquipmentInSlot(1))] +"_1.png";
						}
					}else 	if (player.getEquipmentInSlot(1).getItem() == RiderItems.drivedrivergold){
						
						
						if ( slot == 2)
						{
							return "kamenRiderCraftv3:textures/armor/drive_gold" +"_2.png";
						}
						if (slot == 0||slot == 1 )
						{
							return "kamenRiderCraftv3:textures/armor/drive_gold" +"_1.png";
						}
					}else 	if (player.getEquipmentInSlot(1).getItem() == RiderItems.metro_pd_driver_honoh){
						
						
						if ( slot == 2)
						{
							return "kamenRiderCraftv3:textures/armor/mach_metro-pd" +"_2.png";
						}
						if (slot == 0||slot == 1 )
						{
							return "kamenRiderCraftv3:textures/armor/mach_metro-pd" +"_1.png";
						}
					}else 	if (player.getEquipmentInSlot(1).getItem() == RiderItems.break_gunner_2){
						

						if ( slot == 2)
						{
							if (item_drivedriver.get_core(player.getEquipmentInSlot(1))==1){
								return "KamenRiderCraftv3:textures/armor/chou_mashin_chaser" +"_2.png";	
							}else{
								return "KamenRiderCraftv3:textures/armor/mashin_chaser" +"_2.png";
							}
						}
						if (slot == 0||slot == 1 )
						{
							if (item_drivedriver.get_core(player.getEquipmentInSlot(1))==1){
								return "KamenRiderCraftv3:textures/armor/chou_mashin_chaser" +"_1.png";	
							}else{
								return "KamenRiderCraftv3:textures/armor/mashin_chaser" +"_1.png";
							}
						}
					}else 	if (player.getEquipmentInSlot(1).getItem() == RiderItems.lupin_belt){
						
						
						if ( slot == 2)
						{
							return "KamenRiderCraftv3:textures/armor/lupin" +"_2.png";
						}
						if (slot == 0||slot == 1 )
						{
							return "KamenRiderCraftv3:textures/armor/lupin" +"_1.png";
						}
					}
						
				}
				return "kamenRiderCraftv3:textures/armor/blank.png";


			}
		}
		else
		{
			return "kamenRiderCraftv3:textures/armor/blank.png";



		}
		return "kamenRiderCraftv3:textures/armor/blank.png";

	}


	@Override
	@SideOnly(Side.CLIENT)
	public ModelBiped getArmorModel(EntityLivingBase entityLiving,ItemStack itemStack, int armorSlot) {
		BipedLockseed armorModel = new BipedLockseed();
		if(itemStack != null){
			if(itemStack.getItem() instanceof item_agitoarmor2){
				int type = ((ItemArmor)itemStack.getItem()).armorType;
			}
			if(armorModel != null){

					
					armorModel.bipedBody3.showModel = armorSlot == 3;
					armorModel.bipedRightArm2.showModel = armorSlot == 3;
					armorModel.bipedLeftLeg2.showModel = armorSlot == 3;
					armorModel.bipedBody2.showModel = armorSlot == 2;
					armorModel.bipedLeftArm2.showModel =armorSlot == 2;
					armorModel.bipedRightLeg2.showModel =armorSlot == 2;
				
					armorModel.bipedHead2.showModel= armorSlot == 4;
					armorModel.bipedHeadwear2.showModel= armorSlot == 4;
					
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


	/**
	 * Returns the 'max damage' factor array for the armor, each piece of armor have a durability factor (that gets
	 * multiplied by armor material factor)
	 */
	static int[] getMaxDamageArray()
	{
		return maxDamageArray;
	}

}
