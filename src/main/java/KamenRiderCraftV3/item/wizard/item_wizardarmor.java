package KamenRiderCraftV3.item.wizard;

import KamenRiderCraftV3.RiderItems;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;

public class item_wizardarmor extends ItemArmor
{
	public static final String[] CoreName= new String[] {"flame","water","hurricane","land","flame_dragon","water_dragon","hurricane_dragon","land_dragon","infinity","infinity_gold","falco_mantle_dragon"};
	public static final String[] CoreName2= new String[] {"","_falco","_chameleo","_buffa","_dolphi","_hyper","_land"};

	private static final int[] maxDamageArray = new int[] {11, 16, 15, 13};
	public String armorNamePrefix;
	public ArmorMaterial material;

	public item_wizardarmor (ArmorMaterial par2EnumArmorMaterial, int par3, int par4)
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

				if (player.getEquipmentInSlot(1).getItem() == RiderItems.wizardriver){

					if ( slot == 2)
					{
						return "KamenRiderCraftv3:textures/armor/"+"wizard_"+ CoreName[item_wizarddriver.get_core(player.getEquipmentInSlot(1),"1")] +"_2.png";
					}
					if (slot == 0||slot == 1 )
					{
						return "KamenRiderCraftv3:textures/armor/"+"wizard_"+ CoreName[item_wizarddriver.get_core(player.getEquipmentInSlot(1),"1")] +"_1.png";
					}


				}else if (player.getEquipmentInSlot(1).getItem() == RiderItems.beastdriver){

					if ( slot == 2)
						
					{	if (item_wizarddriver.get_core(player.getEquipmentInSlot(1),"1")==6){
						return "KamenRiderCraftv3:textures/armor/"+"beast_land_2.png";
						}else if (item_wizarddriver.get_core(player.getEquipmentInSlot(1),"1")!=5){
						return "KamenRiderCraftv3:textures/armor/"+"beast_2.png";
						}else{
							return "KamenRiderCraftv3:textures/armor/"+"beast_hyper_2.png";
						}
					}
					if (slot == 0||slot == 1 )
					{
						return "KamenRiderCraftv3:textures/armor/"+"beast"+ CoreName2[item_wizarddriver.get_core(player.getEquipmentInSlot(1),"1")] +"_1.png";
					}


				}else if (player.getEquipmentInSlot(1).getItem() == RiderItems.whitewizardriver){

					if ( slot == 2)
						
					{	return "KamenRiderCraftv3:textures/armor/"+"wiseman_2.png";
						
					}
					if (slot == 0||slot == 1 )
					{
						return "KamenRiderCraftv3:textures/armor/"+"wiseman_1.png";
					}


				}else if (player.getEquipmentInSlot(1).getItem() == RiderItems.whitewizardriverf){

					if ( slot == 2)
						
					{	return "KamenRiderCraftv3:textures/armor/"+"wiseman_f_2.png";
						
					}
					if (slot == 0||slot == 1 )
					{
						return "KamenRiderCraftv3:textures/armor/"+"wiseman_f_1.png";
					}


				}else if (player.getEquipmentInSlot(1).getItem() == RiderItems.darkwizardriver){

					if ( slot == 2)
						
					{	return "KamenRiderCraftv3:textures/armor/"+"dark_wizard_2.png";
						
					}
					if (slot == 0||slot == 1 )
					{
						return "KamenRiderCraftv3:textures/armor/"+"dark_wizard_1.png";
					}


				}else if (player.getEquipmentInSlot(1).getItem() == RiderItems.blackwizardriver){

					if ( slot == 2)
						
					{	return "KamenRiderCraftv3:textures/armor/"+"black_wizard_2.png";
						
					}
					if (slot == 0||slot == 1 )
					{
						return "KamenRiderCraftv3:textures/armor/"+"black_wizard_1.png";
					}


				}else if (player.getEquipmentInSlot(1).getItem() == RiderItems.magewizardriver){

					if ( slot == 2)
						
					{	return "KamenRiderCraftv3:textures/armor/"+"mage_2.png";
						
					}
					if (slot == 0||slot == 1 )
					{
						return "KamenRiderCraftv3:textures/armor/"+"mage_1.png";
					}


				}else if (player.getEquipmentInSlot(1).getItem() == RiderItems.magewizardriver_b){

					if ( slot == 2)
						
					{	return "KamenRiderCraftv3:textures/armor/"+"mage_b_2.png";
						
					}
					if (slot == 0||slot == 1 )
					{
						return "KamenRiderCraftv3:textures/armor/"+"mage_b_1.png";
					}


				}else if (player.getEquipmentInSlot(1).getItem() == RiderItems.magewizardriver_g){

					if ( slot == 2)
						
					{	return "KamenRiderCraftv3:textures/armor/"+"mage_g_2.png";
						
					}
					if (slot == 0||slot == 1 )
					{
						return "KamenRiderCraftv3:textures/armor/"+"mage_g_1.png";
					}


				}else if (player.getEquipmentInSlot(1).getItem() == RiderItems.sorcererdriver){

					if ( slot == 2)
						
					{	return "KamenRiderCraftv3:textures/armor/"+"sorcerer_2.png";
						
					}
					if (slot == 0||slot == 1 )
					{
						return "KamenRiderCraftv3:textures/armor/"+"sorcerer_1.png";
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