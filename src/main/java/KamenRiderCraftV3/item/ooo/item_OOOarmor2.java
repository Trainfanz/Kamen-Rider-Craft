package KamenRiderCraftV3.item.ooo;




import org.lwjgl.opengl.GL11;

import KamenRiderCraftV3.RiderItems;
import KamenRiderCraftV3.model.Biped;
import net.minecraft.block.BlockDispenser;
import net.minecraft.client.model.ModelBiped;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.MathHelper;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class item_OOOarmor2 extends ItemArmor
{
	public static final String[] CoreName= new String[] {"taka","kuwagata","lion","sai","shachi","ptera","cobra","super_taka","love_1","same","shika","seiuchi","mukade","ebi"};
	public static final String[] CoreName2= new String[] {"batta","cheetah","zou","condor","tako","tyranno","wani","super_batta","love_3","ookamiuo","ushi","penguin","ari","sasori"};		

	private static final int[] maxDamageArray = new int[] {11, 20, 15, 13};
	public String armorNamePrefix;
	public ArmorMaterial material;

	public item_OOOarmor2(ArmorMaterial par2EnumArmorMaterial, int par3, int par4)
	{
		super(par2EnumArmorMaterial, par3, par4);
		this.material = par2EnumArmorMaterial;
		par2EnumArmorMaterial.getDamageReductionAmount(par4);
		this.setMaxDamage(par2EnumArmorMaterial.getDurability(par4)+(par2EnumArmorMaterial.getDurability(par4)/2));
		this.maxStackSize = 1;



	}

	public static int get_core(ItemStack itemstack)
	{
		return itemstack.hasTagCompound() ? itemstack.getTagCompound().getInteger("core") : 0;
	}

	public static void set_core(ItemStack itemstack, int flag)
	{
		if (!itemstack.hasTagCompound())
		{
			itemstack.setTagCompound(new NBTTagCompound());
		}
		itemstack.getTagCompound().setInteger("core", flag);
	}

	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
	{
		if (entity instanceof EntityLivingBase){

			EntityLivingBase player = ((EntityLivingBase)entity);


			if (player.getEquipmentInSlot(1)!= null){

				if (player.getEquipmentInSlot(1).getItem() == RiderItems.OOOdriver){



					if (item_OOOdriver.get_core(player.getEquipmentInSlot(1),"1")==0 & item_OOOdriver.get_core(player.getEquipmentInSlot(1),"2")==3& item_OOOdriver.get_core(player.getEquipmentInSlot(1),"3")==3){
						return "KamenRiderCraftV3:textures/armor/"+"ooo_"+ "super_taka"+".png";

					}else{
					return "KamenRiderCraftV3:textures/armor/"+"ooo_"+ CoreName[item_OOOdriver.get_core(player.getEquipmentInSlot(1),"1")] +".png";
				}

			}else if (player.getEquipmentInSlot(1).getItem() == RiderItems.birth_driver){


				return "KamenRiderCraftV3:textures/armor/"+"birth_1" +".png";

			}else if (player.getEquipmentInSlot(1).getItem() == RiderItems.birth_driver_prototype){

				return "KamenRiderCraftV3:textures/armor/"+"birth_prototype_1" +".png";


			}else if (player.getEquipmentInSlot(1).getItem() == RiderItems.poseidon_driver){

				return "KamenRiderCraftV3:textures/armor/"+"poseidon_1" +".png";


			}else if (player.getEquipmentInSlot(1).getItem() == RiderItems.aqua_driver){

				return "KamenRiderCraftV3:textures/armor/"+"aqua_1" +".png";


			}




		}
	}

	return "KamenRiderCraftV3:textures/armor/blank.png";

}





	@Override
	@SideOnly(Side.CLIENT)
	public ModelBiped getArmorModel(EntityLivingBase entityLiving,ItemStack itemStack, int armorSlot) {
		 Biped armorModel = new Biped();
		if(itemStack != null){
			if(itemStack.getItem() instanceof item_OOOarmor2){
				int type = ((ItemArmor)itemStack.getItem()).armorType;
			}
			if(armorModel != null){
				armorModel.isSneak = entityLiving.isSneaking();
				armorModel.isRiding = entityLiving.isRiding();
				armorModel.isChild = entityLiving.isChild();
				
				armorModel.bipedHead.showModel = armorSlot == 0;
				armorModel.bipedHeadwear.showModel = armorSlot == 0;
				armorModel.bipedBody.showModel = armorSlot == 0;
				armorModel.bipedRightArm.showModel = armorSlot == 2;
				armorModel.bipedLeftArm.showModel = armorSlot == 2;
				armorModel.bipedRightLeg.showModel = armorSlot == 2;
				armorModel.bipedLeftLeg.showModel = armorSlot == 2;
		
				
				armorModel.heldItemRight = entityLiving.getHeldItem() != null ? 1 :0;
				
			
				
				return armorModel;
			}
		}
		return armorModel;

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