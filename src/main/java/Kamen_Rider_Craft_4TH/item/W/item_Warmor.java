package Kamen_Rider_Craft_4TH.item.W;

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

public class item_Warmor extends ItemArmor implements IHasModel
{
	public static final String[] CoreName= new String[] {"core","xtreme","gold_xtreme","xtreme"};
	public static final String[] CoreName3= new String[] {"eternal","eternal_red","cyclone"};
	public static final String[] CoreName4= new String[] {"accel","accel_trial","accel_booster"};
	
	//"joker","skull","eternal","eternal_red","cyclone"
	
	private static final int[] maxDamageArray = new int[] {11, 16, 15, 13};
	public String armorNamePrefix;
	public ArmorMaterial material;

	public item_Warmor (String name,ArmorMaterial par2EnumArmorMaterial, int par3, EntityEquipmentSlot par4)
	{
		super(par2EnumArmorMaterial, par3, par4);
		this.material = par2EnumArmorMaterial;
		par2EnumArmorMaterial.getDamageReductionAmount(par4);
		this.setMaxDamage(par2EnumArmorMaterial.getDurability(par4));
		this.maxStackSize = 1;
		
        setTranslationKey(name);
        setRegistryName(name);
        TokuCraft_core.ITEMS.add(this);
	}
	
	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, EntityEquipmentSlot slot, String type)
	{
		
		if (entity instanceof EntityLivingBase){

			EntityLivingBase player = ((EntityLivingBase)entity);

	
			if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET)!= null){

				if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.wdriver){

					if ( slot == EntityEquipmentSlot.HEAD)
					{
						return Refercence.MODID+":textures/armor/"+"w_"+ CoreName[item_Wdriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET),"1")] +".png";
					}
					if ( slot == EntityEquipmentSlot.CHEST)
					{
						return Refercence.MODID+":textures/armor/"+"w_"+ CoreName[item_Wdriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET),"2")] +".png";
					}

					if ( slot == EntityEquipmentSlot.LEGS)
					{
						return Refercence.MODID+":textures/armor/"+"w_"+ CoreName[item_Wdriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET),"3")] +".png";
					} 
					else
					{
						return null;
					}
				}else if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.lostdriver_eternal){

						if ( slot == EntityEquipmentSlot.HEAD)
						{
							return Refercence.MODID+":textures/armor/"+ CoreName3[item_Wdriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET),"1")]+"_l" +".png";
						}
						if ( slot == EntityEquipmentSlot.CHEST)
						{
							return Refercence.MODID+":textures/armor/"+ CoreName3[item_Wdriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET),"2")]+"_core" +".png";
						}

						if ( slot == EntityEquipmentSlot.LEGS)
						{
							return Refercence.MODID+":textures/armor/"+ CoreName3[item_Wdriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET),"3")]+"_r" +".png";
						}
						else
						{
							return null;
						}
					}else if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.lostdriver_cyclone){

						if ( slot == EntityEquipmentSlot.HEAD)
						{
							return Refercence.MODID+":textures/armor/cyclone_l" +".png";
						}
						if ( slot == EntityEquipmentSlot.CHEST)
						{
							return Refercence.MODID+":textures/armor/cyclone_core" +".png";
						}

						if ( slot == EntityEquipmentSlot.LEGS)
						{
							return Refercence.MODID+":textures/armor/cyclone_r" +".png";
						}
						else
						{
							return null;
						}
					}else if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.lostdriver_skull){

						if ( slot == EntityEquipmentSlot.HEAD)
						{
							return Refercence.MODID+":textures/armor/skull_l" +".png";
						}
						if ( slot == EntityEquipmentSlot.CHEST)
						{
							return Refercence.MODID+":textures/armor/skull_core" +".png";
						}

						if ( slot == EntityEquipmentSlot.LEGS)
						{
							return Refercence.MODID+":textures/armor/skull_r" +".png";
						}
						else
						{
							return null;
						}
					}else if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.lostdriver){

						if ( slot == EntityEquipmentSlot.HEAD)
						{
							return Refercence.MODID+":textures/armor/joker_l" +".png";
						}
						if ( slot == EntityEquipmentSlot.CHEST)
						{
							return Refercence.MODID+":textures/armor/joker_core" +".png";
						}

						if ( slot == EntityEquipmentSlot.LEGS)
						{
							return Refercence.MODID+":textures/armor/joker_r" +".png";
						}
						else
						{
							return null;
						}
					}else if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.accel_driver){

						if ( slot == EntityEquipmentSlot.HEAD)
						{
							return Refercence.MODID+":textures/armor/"+ CoreName4[item_Wdriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET),"1")]+"_l" +".png";
						}
						if ( slot == EntityEquipmentSlot.CHEST)
						{
							return Refercence.MODID+":textures/armor/"+ CoreName4[item_Wdriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET),"2")]+"_core" +".png";
						}

						if ( slot == EntityEquipmentSlot.LEGS)
						{
							return Refercence.MODID+":textures/armor/"+ CoreName4[item_Wdriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET),"3")]+"_r" +".png";
						}
						else
						{
							return null;
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

	@Override
	public void registerModels() {
		TokuCraft_core.proxy.registerItemRender(this,0,"inventory");
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
		return RiderItems.gaiamemory == repair.getItem() ? true : super.getIsRepairable(toRepair, repair);
	}

}