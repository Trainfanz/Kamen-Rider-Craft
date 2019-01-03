package KamenRiderCraftV3.item.ooo;


import KamenRiderCraftV3.RiderItems;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;

public class item_OOOarmor extends ItemArmor
{
	public static final String[] CoreName= new String[] {"tora","kamakiri","gorilla","kujaku","unagi","tricera","kame","imagin","panda","super_tora","kangaroo","love_2","kujira","gazelle","shirokuma","hachi","kani","yadokari"};
	public static final String[] CoreName2= new String[] {"batta","cheetah","zou","condor","tako","tyranno","wani","shocker","super_batta","kangaroo2","love_3","ookamiuo","ushi","penguin","ari","sasori"};

	private static final int[] maxDamageArray = new int[] {11, 16, 15, 13};
	public String armorNamePrefix;
	public ArmorMaterial material;

	public item_OOOarmor (ArmorMaterial par2EnumArmorMaterial, int par3, int par4)
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

				if (player.getEquipmentInSlot(1).getItem() == RiderItems.OOOdriver){

					if (slot == 0)
					{
						return "KamenRiderCraftV3:textures/armor/"+"ooo_"+ CoreName[item_OOOdriver.get_core(player.getEquipmentInSlot(1),"1")] +".png";
					}
					if (slot == 1 )
					{
						return "KamenRiderCraftV3:textures/armor/"+"ooo_"+ CoreName[item_OOOdriver.get_core(player.getEquipmentInSlot(1),"2")] +".png" ;
					}

					if (slot == 2)
					{
						return "KamenRiderCraftV3:textures/armor/"+"ooo_"+ CoreName2[item_OOOdriver.get_core(player.getEquipmentInSlot(1),"3")] +".png";
					}  if (slot == 3)
					{
						return "KamenRiderCraftV3:textures/armor/"+"ooo_"+ CoreName[item_OOOdriver.get_core(player.getEquipmentInSlot(1),"1")] +".png";
					}

				}	
				
				else if (player.getEquipmentInSlot(1).getItem() == RiderItems.birth_driver){
					if (slot == 0)
					{
						return "KamenRiderCraftV3:textures/armor/"+"birth_1" +".png";
					}
					if (slot == 1 )
					{
						return "KamenRiderCraftV3:textures/armor/"+"birth_2" +".png";
					}

					if (slot == 2)
					{
						return "KamenRiderCraftV3:textures/armor/"+"birth_3" +".png";
					}
					return "KamenRiderCraftV3:textures/armor/blank.png";
				}else if (player.getEquipmentInSlot(1).getItem() == RiderItems.birth_driver_prototype){
					if (slot == 0)
					{
						return "KamenRiderCraftV3:textures/armor/"+"birth_prototype_1" +".png";
					}
					if (slot == 1 )
					{
						return "KamenRiderCraftV3:textures/armor/"+"birth_prototype_2" +".png";
					}

					if (slot == 2)
					{
						return "KamenRiderCraftV3:textures/armor/"+"birth_prototype_3" +".png";
					}
					return "KamenRiderCraftV3:textures/armor/blank.png";
				}else if (player.getEquipmentInSlot(1).getItem() == RiderItems.poseidon_driver){
					if (slot == 0)
					{
						return "KamenRiderCraftV3:textures/armor/"+"poseidon_1" +".png";
					}
					if (slot == 1 )
					{
						return "KamenRiderCraftV3:textures/armor/"+"poseidon_2" +".png";
					}

					if (slot == 2)
					{
						return "KamenRiderCraftV3:textures/armor/"+"poseidon_3" +".png";
					}
					return "KamenRiderCraftV3:textures/armor/blank.png";
				}else if (player.getEquipmentInSlot(1).getItem() == RiderItems.aqua_driver){
					if (slot == 0)
					{
						return "KamenRiderCraftV3:textures/armor/"+"aqua_1" +".png";
					}
					if (slot == 1 )
					{
						return "KamenRiderCraftV3:textures/armor/"+"aqua_2" +".png";
					}

					if (slot == 2)
					{
						return "KamenRiderCraftV3:textures/armor/"+"aqua_3" +".png";
					}
					return "KamenRiderCraftV3:textures/armor/blank.png";
				}


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