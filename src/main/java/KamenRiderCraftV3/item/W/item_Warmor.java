package KamenRiderCraftV3.item.W;


import KamenRiderCraftV3.RiderItems;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;

public class item_Warmor extends ItemArmor
{
	public static final String[] CoreName= new String[] {"core","xtreme","gold_xtreme","xtreme"};
	public static final String[] CoreName3= new String[] {"joker","skull","eternal","eternal_red","cyclone"};
	public static final String[] CoreName4= new String[] {"accel","accel_trial","accel_booster"};
	
	private static final int[] maxDamageArray = new int[] {11, 16, 15, 13};
	public String armorNamePrefix;
	public ArmorMaterial material;

	public item_Warmor (ArmorMaterial par2EnumArmorMaterial, int par3, int par4)
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

				if (player.getEquipmentInSlot(1).getItem() == RiderItems.Wdriver){

					if (slot == 0)
					{
						return "KamenRiderCraftv3:textures/armor/"+"w_"+ CoreName[item_Wdriver.get_core(player.getEquipmentInSlot(1),"1")] +".png";
					}
					if (slot == 1 )
					{
						return "KamenRiderCraftv3:textures/armor/"+"w_"+ CoreName[item_Wdriver.get_core(player.getEquipmentInSlot(1),"2")] +".png";
					}

					if (slot == 2)
					{
						return "KamenRiderCraftv3:textures/armor/"+"w_"+ CoreName[item_Wdriver.get_core(player.getEquipmentInSlot(1),"3")] +".png";
					}  if (slot == 3)
					{
						return "KamenRiderCraftv3:textures/armor/"+"w_"+ CoreName[item_Wdriver.get_core(player.getEquipmentInSlot(1),"1")] +".png";
					}
					else
					{
						return null;
					}
				}else
					if (player.getEquipmentInSlot(1).getItem() == RiderItems.lostdriver){

						if (slot == 0)
						{
							return "KamenRiderCraftv3:textures/armor/"+ CoreName3[item_Wdriver.get_core(player.getEquipmentInSlot(1),"1")]+"_l" +".png";
						}
						if (slot == 1 )
						{
							return "KamenRiderCraftv3:textures/armor/"+ CoreName3[item_Wdriver.get_core(player.getEquipmentInSlot(1),"2")]+"_core" +".png";
						}

						if (slot == 2)
						{
							return "KamenRiderCraftv3:textures/armor/"+ CoreName3[item_Wdriver.get_core(player.getEquipmentInSlot(1),"3")]+"_r" +".png";
						}  if (slot == 3)
						{
							return "KamenRiderCraftv3:textures/armor/"+ CoreName3[item_Wdriver.get_core(player.getEquipmentInSlot(1),"1")]+"_r" +".png";
						}
						else
						{
							return null;
						}
					}else if (player.getEquipmentInSlot(1).getItem() == RiderItems.accel_driver){

						if (slot == 0)
						{
							return "KamenRiderCraftv3:textures/armor/"+ CoreName4[item_Wdriver.get_core(player.getEquipmentInSlot(1),"1")]+"_l" +".png";
						}
						if (slot == 1 )
						{
							return "KamenRiderCraftv3:textures/armor/"+ CoreName4[item_Wdriver.get_core(player.getEquipmentInSlot(1),"2")]+"_core" +".png";
						}

						if (slot == 2)
						{
							return "KamenRiderCraftv3:textures/armor/"+ CoreName4[item_Wdriver.get_core(player.getEquipmentInSlot(1),"3")]+"_r" +".png";
						}  if (slot == 3)
						{
							return "KamenRiderCraftv3:textures/armor/"+ CoreName4[item_Wdriver.get_core(player.getEquipmentInSlot(1),"1")]+"_r" +".png";
						}
						else
						{
							return null;
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