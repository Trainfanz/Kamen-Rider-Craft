package KamenRiderCraftV3.item.kiva;

import KamenRiderCraftV3.KamenRiderCraftV3_core;
import KamenRiderCraftV3.RiderItems;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;

public class item_kivaarmor extends ItemArmor
{

	public static final String[] CoreName= new String[] {"","_garulu","_basshaa","_dogga","_dogabaki","_emperor","_dogabaki_emperor"};
	public static final String[] ixaCoreName= new String[] {"_save","_burst","_rising"};

	private static final int[] maxDamageArray = new int[] {11, 16, 15, 13};
	public String armorNamePrefix;
	public ArmorMaterial material;

	public item_kivaarmor (ArmorMaterial par2EnumArmorMaterial, int par3, int par4)
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

				if (player.getEquipmentInSlot(1).getItem() == RiderItems.kivadriver){

					if ( slot == 2)
					{
						return "KamenRiderCraftV3:textures/armor/"+"kiva"+CoreName[item_kivadriver.get_core(player.getEquipmentInSlot(1))] +"_2.png";
					}
					if (slot == 0||slot == 1 )
					{
						return "KamenRiderCraftV3:textures/armor/"+"kiva"+ CoreName[item_kivadriver.get_core(player.getEquipmentInSlot(1))] +"_1.png";
					}


				}else if (player.getEquipmentInSlot(1).getItem() == RiderItems.darkkivadriver){

					if ( slot == 2)
					{
						return "KamenRiderCraftV3:textures/armor/"+"dark_kiva" +"_2.png";
					}
					if (slot == 0||slot == 1 )
					{
						return "KamenRiderCraftV3:textures/armor/"+"dark_kiva" +"_1.png";
					}


				}else if (player.getEquipmentInSlot(1).getItem() == RiderItems.newkivadriver){

					if ( slot == 2)
					{
						return "KamenRiderCraftV3:textures/armor/"+"kiva" +"_2.png";
					}
					if (slot == 0||slot == 1 )
					{
						return "KamenRiderCraftV3:textures/armor/"+"kiva" +"_1.png";
					}
					return "KamenRiderCraftV3:textures/armor/blank.png";
					

				}else if (player.getEquipmentInSlot(1).getItem() == RiderItems.ixa_belt){

					if ( slot == 2)
					{
						return "KamenRiderCraftV3:textures/armor/"+"ixa"+ixaCoreName[item_kivadriver.get_core(player.getEquipmentInSlot(1))] +"_2.png";
					}
					if (slot == 0||slot == 1 )
					{
						return "KamenRiderCraftV3:textures/armor/"+"ixa"+ixaCoreName[item_kivadriver.get_core(player.getEquipmentInSlot(1))] +"_1.png";
					}
				}else if (player.getEquipmentInSlot(1).getItem() == RiderItems.sagarc_belt){

					if ( slot == 2)
					{
						return "KamenRiderCraftV3:textures/armor/"+"saga" +"_2.png";
					}
					if (slot == 0||slot == 1 )
					{
						return "KamenRiderCraftV3:textures/armor/"+"saga" +"_1.png";
					}
				}else if (player.getEquipmentInSlot(1).getItem() == RiderItems.arcdriver){

					if ( slot == 2)
					{
						return "KamenRiderCraftV3:textures/armor/"+"arc" +"_2.png";
					}
					if (slot == 0||slot == 1 )
					{
						return "KamenRiderCraftV3:textures/armor/"+"arc" +"_1.png";
					}
				}else if (player.getEquipmentInSlot(1).getItem() == RiderItems.reydriver){

					if ( slot == 2)
					{
						return "KamenRiderCraftV3:textures/armor/"+"rey" +"_2.png";
					}
					if (slot == 0||slot == 1 )
					{
						return "KamenRiderCraftV3:textures/armor/"+"rey" +"_1.png";
					}
					return "KamenRiderCraftV3:textures/armor/blank.png";


				}
			}
			else
			{
				return "KamenRiderCraftV3:textures/armor/blank.png";


			}
			}

		return "KamenRiderCraftV3:textures/armor/blank.png";

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