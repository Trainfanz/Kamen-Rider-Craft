package KamenRiderCraftV3.item.drive;

import KamenRiderCraftV3.RiderItems;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;

public class item_drivearmor extends ItemArmor
{
	public static final String[] CoreName= new String[] {"","_wild","_high_speed","_proto","_technique","_fruits","_dead_heat","_formula","_tridoron","_next","_special","_zerodrive","_miracle","_type_speed_wild_technic"};
	public static final String[] CoreName2= new String[] {"mach","mach_dead_heat","chaser","mach_chaser","mach_dead_heat_drive","super_dead_heat","chaser_mach","super_deadheat_mach"};

	private static final int[] maxDamageArray = new int[] {11, 16, 15, 13};
	public String armorNamePrefix;
	public ArmorMaterial material;

	public item_drivearmor (ArmorMaterial par2EnumArmorMaterial, int par3, int par4)
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
							return "KamenRiderCraftv3:textures/armor/"+"drive"+CoreName[item_drivedriver.get_core(player.getEquipmentInSlot(1))] +"_2.png";
						}
						if (slot == 0||slot == 1 )
						{
							return "KamenRiderCraftv3:textures/armor/"+"drive"+ CoreName[item_drivedriver.get_core(player.getEquipmentInSlot(1))] +"_1.png";
						}

					}else 	if (player.getEquipmentInSlot(1).getItem() == RiderItems.mach_driver_honoh){


						if ( slot == 2)
						{
							return "KamenRiderCraftv3:textures/armor/"+CoreName2[item_drivedriver.get_core(player.getEquipmentInSlot(1))] +"_2.png";
						}
						if (slot == 0||slot == 1 )
						{
							return "KamenRiderCraftv3:textures/armor/"+ CoreName2[item_drivedriver.get_core(player.getEquipmentInSlot(1))] +"_1.png";
						}
					}else 	if (player.getEquipmentInSlot(1).getItem() == RiderItems.drivedrivergold){


						if ( slot == 2)
						{
							return "KamenRiderCraftv3:textures/armor/drive_gold" +"_2.png";
						}
						if (slot == 0||slot == 1 )
						{
							return "KamenRiderCraftv3:textures/armor/drive_gold" +"_1.png";
						}
					}else 	if (player.getEquipmentInSlot(1).getItem() == RiderItems.metro_pd_driver_honoh){


						if ( slot == 2)
						{
							return "KamenRiderCraftv3:textures/armor/mach_metro-pd" +"_2.png";
						}
						if (slot == 0||slot == 1 )
						{
							return "KamenRiderCraftv3:textures/armor/mach_metro-pd" +"_1.png";
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
				return "KamenRiderCraftv3:textures/armor/blank.png";


			}
		}
		else
		{
			return "KamenRiderCraftv3:textures/armor/blank.png";



		}
		return "KamenRiderCraftv3:textures/armor/blank.png";

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