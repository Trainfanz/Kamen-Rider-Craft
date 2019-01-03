package KamenRiderCraftV3.item.zi_o;

import KamenRiderCraftV3.model.BipedLockseed;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import net.minecraft.item.ItemArmor.ArmorMaterial;
public class item_zi_o_armor_2 extends ItemArmor
{
	private static final int[] maxDamageArray = new int[] {11, 16, 15, 13};
	public String armorNamePrefix;
	public ArmorMaterial material;
	public String Show;
	
	//public static final String[] den_oCoreName= new String[] {"deno_plat_form","deno_sword_form","deno_rod_form","deno_ax_form","deno_gun_form","deno_wing_form","deno_climax_form","deno_super_climax_form","deno_liner_form"};
	
	public item_zi_o_armor_2 (ArmorMaterial par2EnumArmorMaterial, int par3, int par4)
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
		if (entity instanceof EntityLivingBase)
		{
			EntityLivingBase player = ((EntityLivingBase)entity);

			if (player.getEquipmentInSlot(1)!= null)
			{
				if (player.getEquipmentInSlot(1).getItem() instanceof item_zi_o_driver)
				{
					String rider = ((item_zi_o_driver)player.getEquipmentInSlot(1).getItem()).Rider;
					
					if ( slot == 2)
					{

						return "KamenRiderCraftV3:textures/armor/"+rider +"_2.png";

					}
					if (slot == 0||slot == 1 )
					{

						return "KamenRiderCraftV3:textures/armor/"+rider +"_1.png";

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

	@Override
	@SideOnly(Side.CLIENT)
	public ModelBiped getArmorModel(EntityLivingBase entityLiving,ItemStack itemStack, int armorSlot)
	{
		BipedLockseed armorModel = new BipedLockseed();
		
		if(itemStack != null)
		{
			if(itemStack.getItem() instanceof item_zi_o_armor_2)
			{
				int type = ((ItemArmor)itemStack.getItem()).armorType;
			}
			if(armorModel != null)
			{
				armorModel.bipedBody3.showModel = armorSlot == 3;
				armorModel.bipedRightArm2.showModel = armorSlot == 3;
				armorModel.bipedLeftLeg2.showModel = armorSlot == 3;
				armorModel.bipedBody2.showModel = armorSlot == 2;
				armorModel.bipedLeftArm2.showModel =armorSlot == 2;
				armorModel.bipedRightLeg2.showModel =armorSlot == 2;
				armorModel.bipedHead2.showModel= armorSlot == 3;
				armorModel.bipedHeadwear2.showModel= armorSlot == 3;

				armorModel.isSneak = entityLiving.isSneaking();
				armorModel.isRiding = entityLiving.isRiding();
				armorModel.isChild = entityLiving.isChild();
				armorModel.heldItemRight = entityLiving.getHeldItem() != null ? 1 :0;
				armorModel.swingProgress = entityLiving.swingProgress;

				return armorModel;
			}
		}
		return null;
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
