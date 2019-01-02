package KamenRiderCraftV3.item.agito;


import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;

public class item_agitoarmor extends ItemArmor
{

	public static final String[] CoreName= new String[] {"","_storm","_flame","_trinity","_burning","_shining"};
	public static final String[] CoreNamegills= new String[] {"","_exceed"};
	
	private static final int[] maxDamageArray = new int[] {11, 16, 15, 13};
	public String armorNamePrefix;
	public ArmorMaterial material;

	public item_agitoarmor (ArmorMaterial par2EnumArmorMaterial, int par3, int par4)
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

				if (player.getEquipmentInSlot(1).getItem() instanceof item_agitodriver){

					String rider = ((item_agitodriver)player.getEquipmentInSlot(1).getItem()).Rider;
					
					if (rider=="agito"){
					if ( slot == 2)
					{
						return "KamenRiderCraftV3:textures/armor/"+"agito"+CoreName[item_agitodriver.get_core(player.getEquipmentInSlot(1))] +"_2.png";
					}
					if (slot == 0||slot == 1 )
					{
						return "KamenRiderCraftV3:textures/armor/"+"agito"+ CoreName[item_agitodriver.get_core(player.getEquipmentInSlot(1))] +"_1.png";
					}
					}else if (rider=="gills"){
						if ( slot == 2)
						{
							return "KamenRiderCraftV3:textures/armor/"+"gills"+CoreNamegills[item_agitodriver.get_core(player.getEquipmentInSlot(1))] +"_2.png";
						}
						if (slot == 0||slot == 1 )
						{
							return "KamenRiderCraftV3:textures/armor/"+"gills"+ CoreNamegills[item_agitodriver.get_core(player.getEquipmentInSlot(1))] +"_1.png";
						}
						}else{
						if ( slot == 2)
						{
							return "KamenRiderCraftV3:textures/armor/"+rider +"_2.png";
						}
						if (slot == 0||slot == 1 )
						{
							return "KamenRiderCraftV3:textures/armor/"+rider +"_1.png";
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