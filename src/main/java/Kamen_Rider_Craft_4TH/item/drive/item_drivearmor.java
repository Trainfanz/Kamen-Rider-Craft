package Kamen_Rider_Craft_4TH.item.drive;


import Kamen_Rider_Craft_4TH.RiderItems;
import Kamen_Rider_Craft_4TH.TokuCraft_core;
import Kamen_Rider_Craft_4TH.util.IHasModel;
import Kamen_Rider_Craft_4TH.util.Refercence;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.nbt.NBTTagCompound;

public class item_drivearmor extends ItemArmor implements IHasModel
{
	public static final String[] CoreName= new String[] {"","_wild","_high_speed","_proto","_technique","_fruits","_dead_heat","_formula","_tridoron","_next","_special","_zerodrive","_miracle","_type_speed_wild_technic"};
	public static final String[] CoreName2= new String[] {"mach","mach_dead_heat","chaser","mach_chaser","mach_dead_heat_drive","super_dead_heat","chaser_mach","super_deadheat_mach"};

	private static final int[] maxDamageArray = new int[] {11, 16, 15, 13};
	public String armorNamePrefix;
	public ArmorMaterial material;

	public item_drivearmor (String name,ArmorMaterial par2EnumArmorMaterial, int par3, EntityEquipmentSlot par4)
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

				if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() instanceof item_drivedriver){

					if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.drivedriver){

						if ( slot == EntityEquipmentSlot.LEGS)
						{
							return Refercence.MODID+":textures/armor/"+"drive"+CoreName[item_drivedriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))] +"_2.png";
						}
						if (slot == EntityEquipmentSlot.HEAD||slot == EntityEquipmentSlot.CHEST )
						{
							return Refercence.MODID+":textures/armor/"+"drive"+ CoreName[item_drivedriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))] +"_1.png";
						}

					}else 	if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.mach_driver_honoh){


						if ( slot == EntityEquipmentSlot.LEGS)
						{
							return Refercence.MODID+":textures/armor/"+CoreName2[item_drivedriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))] +"_2.png";
						}
						if (slot == EntityEquipmentSlot.HEAD||slot == EntityEquipmentSlot.CHEST )
						{
							return Refercence.MODID+":textures/armor/"+ CoreName2[item_drivedriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))] +"_1.png";
						}
					}else 	if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.drivedrivergold){


						if ( slot == EntityEquipmentSlot.LEGS)
						{
							return Refercence.MODID+":textures/armor/drive_gold" +"_2.png";
						}
						if (slot == EntityEquipmentSlot.HEAD||slot == EntityEquipmentSlot.CHEST )
						{
							return Refercence.MODID+":textures/armor/drive_gold" +"_1.png";
						}
					}else 	if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.drivedriverbrain){


						if ( slot == EntityEquipmentSlot.LEGS)
						{
							return Refercence.MODID+":textures/armor/brain" +"_2.png";
						}
						if (slot == EntityEquipmentSlot.HEAD||slot == EntityEquipmentSlot.CHEST )
						{
							return Refercence.MODID+":textures/armor/brain" +"_1.png";
						}
					}else 	if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.metro_pd_driver_honoh){


						if ( slot == EntityEquipmentSlot.LEGS)
						{
							return Refercence.MODID+":textures/armor/mach_metro-pd" +"_2.png";
						}
						if (slot == EntityEquipmentSlot.HEAD||slot == EntityEquipmentSlot.CHEST )
						{
							return Refercence.MODID+":textures/armor/mach_metro-pd" +"_1.png";
						}
					}else 	if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.break_gunner_2){


						if ( slot == EntityEquipmentSlot.LEGS)
						{
							if (item_drivedriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))==1){
								return Refercence.MODID+":textures/armor/chou_mashin_chaser" +"_2.png";	
							}else{
								return Refercence.MODID+":textures/armor/mashin_chaser" +"_2.png";
							}
						}
						if (slot == EntityEquipmentSlot.HEAD||slot == EntityEquipmentSlot.CHEST )
						{
							if (item_drivedriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))==1){
								return Refercence.MODID+":textures/armor/chou_mashin_chaser" +"_1.png";	
							}else{
								return Refercence.MODID+":textures/armor/mashin_chaser" +"_1.png";
							}
						}
					}else 	if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.lupin_belt){


						if ( slot == EntityEquipmentSlot.LEGS)
						{
							return Refercence.MODID+":textures/armor/lupin" +"_2.png";
						}
						if (slot == EntityEquipmentSlot.HEAD||slot == EntityEquipmentSlot.CHEST )
						{
							return Refercence.MODID+":textures/armor/lupin" +"_1.png";
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
		return RiderItems.proto_speedshift == repair.getItem() ? true : super.getIsRepairable(toRepair, repair);
	}

}