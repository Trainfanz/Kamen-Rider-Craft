package KamenRiderCraftV3.item.deno;

import KamenRiderCraftV3.KamenRiderCraftV3_core;
import KamenRiderCraftV3.RiderItems;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;

public class item_den_oarmor extends ItemArmor
{

	public static final String[] CoreName= new String[] {"_plat","_sword","_rod","_ax","_gun","_wing","_climax","_super_climax","_liner"};
	public static final String[] CoreNamezeronos= new String[] {"_plat_","_altair_","_vega_","_zero_"};
	public static final String[] CoreNamenewdeno= new String[] {"_plat","_strike","_vega"};

	private static final int[] maxDamageArray = new int[] {11, 16, 15, 13};
	public String armorNamePrefix;
	public ArmorMaterial material;

	public item_den_oarmor (ArmorMaterial par2EnumArmorMaterial, int par3, int par4)
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

				if (player.getEquipmentInSlot(1).getItem() instanceof item_den_odriver){

					if(player.getEquipmentInSlot(1).getItem()==RiderItems.den_odriver){

						if ( slot == 2)
						{
							return "KamenRiderCraftV3:textures/armor/"+"deno"+CoreName[item_den_odriver.get_core(player.getEquipmentInSlot(1))] +"_form_2.png";
						}
						if (slot == 0||slot == 1 )
						{
							return "KamenRiderCraftV3:textures/armor/"+"deno"+ CoreName[item_den_odriver.get_core(player.getEquipmentInSlot(1))] +"_form_1.png";
						}

					}else if(player.getEquipmentInSlot(1).getItem()==RiderItems.zeronosbelt){

						if ( slot == 2)
						{
							return "KamenRiderCraftV3:textures/armor/"+"zeronos"+CoreNamezeronos[item_den_odriver.get_core(player.getEquipmentInSlot(1))] +"_form_2.png";
						}
						if (slot == 0||slot == 1 )
						{
							return "KamenRiderCraftV3:textures/armor/"+"zeronos"+ CoreNamezeronos[item_den_odriver.get_core(player.getEquipmentInSlot(1))] +"_form_1.png";
						}

					}else if(player.getEquipmentInSlot(1).getItem()==RiderItems.newden_obelt){

						if ( slot == 2)
						{
							return "KamenRiderCraftV3:textures/armor/"+"newdeno"+CoreNamenewdeno[item_den_odriver.get_core(player.getEquipmentInSlot(1))] +"_form_2.png";
						}
						if (slot == 0||slot == 1 )
						{
							return "KamenRiderCraftV3:textures/armor/"+"newdeno"+ CoreNamenewdeno[item_den_odriver.get_core(player.getEquipmentInSlot(1))] +"_form_1.png";
						}
					
					}else if(player.getEquipmentInSlot(1).getItem()==RiderItems.nega_den_odriver){

						if ( slot == 2)
						{
							return "KamenRiderCraftV3:textures/armor/"+"nega_deno_nega_form_2.png";
						}
						if (slot == 0||slot == 1 )
						{
							return "KamenRiderCraftV3:textures/armor/"+"nega_deno_nega_form_1.png";
						}

					}	


					else if(player.getEquipmentInSlot(1).getItem()==RiderItems.gaohbelt){

						if ( slot == 2)
						{
							return "KamenRiderCraftV3:textures/armor/"+"gaoh_2.png";
						}
						if (slot == 0||slot == 1 )
						{
							return "KamenRiderCraftV3:textures/armor/"+"gaoh_1.png";
						}
					}else if(player.getEquipmentInSlot(1).getItem()==RiderItems.yuukibelt_hijack){

						if ( slot == 2)
						{
							return "KamenRiderCraftV3:textures/armor/"+"yuuki-hijack_form_2.png";
						}
						if (slot == 0||slot == 1 )
						{
							return "KamenRiderCraftV3:textures/armor/"+"yuuki-hijack_form_1.png";
						}
					}else if(player.getEquipmentInSlot(1).getItem()==RiderItems.yuukibelt_skull){

						if ( slot == 2)
						{
							return "KamenRiderCraftV3:textures/armor/"+"yuuki-skull_form_2.png";
						}
						if (slot == 0||slot == 1 )
						{
							return "KamenRiderCraftV3:textures/armor/"+"yuuki-skull_form_1.png";
						}
					}else if(player.getEquipmentInSlot(1).getItem()==RiderItems.newden_obelt){

						if ( slot == 2)
						{
							return "KamenRiderCraftV3:textures/armor/"+"newdeno_strike_form_2.png";
						}
						if (slot == 0||slot == 1 )
						{
							return "KamenRiderCraftV3:textures/armor/"+"newdeno_strike_form_1.png";
						}
					}else if(player.getEquipmentInSlot(1).getItem()==RiderItems.gden_odriver){

						if ( slot == 2)
						{
							return "KamenRiderCraftV3:textures/armor/"+"gdeno_2.png";
						}
						if (slot == 0||slot == 1 )
						{
							return "KamenRiderCraftV3:textures/armor/"+"gdeno_1.png";
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


/**
 * Returns the 'max damage' factor array for the armor, each piece of armor have a durability factor (that gets
 * multiplied by armor material factor)
 */
static int[] getMaxDamageArray()
{
	return maxDamageArray;
}


}