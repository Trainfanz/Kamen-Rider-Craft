package KamenRiderCraftV3.item.fourze;

import KamenRiderCraftV3.RiderItems;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;

public class item_Fourzearmor extends ItemArmor
{
	public static final String[] CoreName= new String[] {"base","elek","fire","magnet","cosmic","rocket","rocket_drill","meteor_fusion_states","meteor_nadeshiko_fusion_states"};

	private static final int[] maxDamageArray = new int[] {11, 16, 15, 13};
	public String armorNamePrefix;
	public ArmorMaterial material;

	public item_Fourzearmor (ArmorMaterial par2EnumArmorMaterial, int par3, int par4)
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

				if (player.getEquipmentInSlot(1).getItem() == RiderItems.Fourzedriver){

					if ( slot == 2)
					{
						return "KamenRiderCraftv3:textures/armor/"+"fourze_"+ CoreName[item_Fourzedriver.get_core(player.getEquipmentInSlot(1))] +"_2.png";
					}
					if (slot == 0||slot == 1 )
					{
						return "KamenRiderCraftv3:textures/armor/"+"fourze_"+ CoreName[item_Fourzedriver.get_core(player.getEquipmentInSlot(1))] +"_1.png";
					}


				}else if(player.getEquipmentInSlot(1).getItem() == RiderItems.nadeshikodriver){
					if ( slot == 2)
					{
						return "KamenRiderCraftv3:textures/armor/"+"nadeshiko_2.png";
					}
					if (slot == 0||slot == 1 )
					{
						return "KamenRiderCraftv3:textures/armor/"+"nadeshiko_1.png";
					}
					
				}
				else if(player.getEquipmentInSlot(1).getItem() == RiderItems.meteor_driver){
					if ( slot == 2)
					{
						if (item_Fourzedriver.get_core(player.getEquipmentInSlot(1))!=0){
							return "KamenRiderCraftv3:textures/armor/"+"meteor_storm_2.png";
						}else{
						return "KamenRiderCraftv3:textures/armor/"+"meteor_2.png";
						}
					}
					if (slot == 0||slot == 1 )
					{
						if (item_Fourzedriver.get_core(player.getEquipmentInSlot(1))!=0){
							return "KamenRiderCraftv3:textures/armor/"+"meteor_storm_1.png";
						}else{
						return "KamenRiderCraftv3:textures/armor/"+"meteor_1.png";
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