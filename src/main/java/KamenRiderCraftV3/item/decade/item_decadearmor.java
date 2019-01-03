package KamenRiderCraftV3.item.decade;

import KamenRiderCraftV3.KamenRiderCraftV3_core;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;

public class item_decadearmor extends ItemArmor
{
	
	private static final int[] maxDamageArray = new int[] {11, 16, 15, 13};
	public String armorNamePrefix;
	public ArmorMaterial material;

	public item_decadearmor (ArmorMaterial par2EnumArmorMaterial, int par3, int par4)
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

				if (player.getEquipmentInSlot(1).getItem() instanceof item_decadedriver){

					if ( slot == 2)
					{
						return "KamenRiderCraftV3:textures/armor/"+item_decadedriver.get_core(player.getEquipmentInSlot(1)) +"_2.png";
					}
					if (slot == 0||slot == 1 )
					{
						return "KamenRiderCraftV3:textures/armor/"+ item_decadedriver.get_core(player.getEquipmentInSlot(1)) +"_1.png";
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



		/**
		 * Returns the 'max damage' factor array for the armor, each piece of armor have a durability factor (that gets
		 * multiplied by armor material factor)
		 */
		static int[] getMaxDamageArray()
		{
			return maxDamageArray;
		}

	}