package KamenRiderCraftV3.item.ghost;


import org.lwjgl.opengl.GL11;

import KamenRiderCraftV3.item.gaim.item_Gaimarmor2;
import KamenRiderCraftV3.model.BipedLockseed;
import net.minecraft.block.BlockDispenser;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.MathHelper;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class item_ghost_armor2 extends ItemArmor
{
	public static final String[] CoreName= new String[] {"ghost","ghost_boost","ghost_mugen","ghost_fourtyfiveheisei"};
	public static final String[] CoreNamespecter= new String[] {"specter","deep_specter","specter_sin"};
	public static final String[] CoreNamenecrom= new String[] {"necrom","necrom_yujou_burst"};
	
	private static final int[] maxDamageArray = new int[] {11, 20, 15, 13};
	public String armorNamePrefix;
	public ArmorMaterial material;

	public item_ghost_armor2(ArmorMaterial par2EnumArmorMaterial, int par3, int par4)
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

			EntityLivingBase player = (EntityLivingBase) entity;

			if (player.getEquipmentInSlot(1)!= null){

				if (player.getEquipmentInSlot(1).getItem() instanceof item_ghostdriver){


					item_ghostdriver belt = (item_ghostdriver) player.getEquipmentInSlot(1).getItem();
					String ghostmode="";
					if (player.getEquipmentInSlot(1).hasTagCompound()){
						if (item_ghostdriver.get_rider(player.getEquipmentInSlot(1))!="_0"&item_ghostdriver.get_lock(player.getEquipmentInSlot(1))!="deep_specter"&belt.RIDER == "specter"&item_ghostdriver.get_core(player.getEquipmentInSlot(1),"1")==1){
							ghostmode="_2";
						}else if(item_ghostdriver.get_lock(player.getEquipmentInSlot(1))=="deep_specter"){
							ghostmode="_4";
						}
							else if (player.getEquipmentInSlot(1).getTagCompound().getInteger("rider")==0){
						
							ghostmode="_0";
						}else if(item_ghostdriver.get_core(player.getEquipmentInSlot(1),"1")==1&belt.RIDER == "ghost"||belt.RIDER == "necrom"){
							ghostmode=item_ghostdriver.get_rider(player.getEquipmentInSlot(1));
						}
					}
					if (belt.RIDER == "ghost"){

						if (slot == 0)
						{
							return "KamenRiderCraftv3:textures/armor/"+ CoreName[item_ghostdriver.get_core(player.getEquipmentInSlot(1),"1")]+ghostmode +".png";
						}
						if (slot == 1 )
						{
							return "KamenRiderCraftv3:textures/armor/"+ CoreName[item_ghostdriver.get_core(player.getEquipmentInSlot(1),"1")]+ghostmode  +".png";
						}

						if (slot == 2)
						{
							return "KamenRiderCraftv3:textures/armor/"+ CoreName[item_ghostdriver.get_core(player.getEquipmentInSlot(1),"1")]+ghostmode  +".png";
						}
						
						if (slot == 3)
						{
							return "KamenRiderCraftv3:textures/armor/"+ CoreName[item_ghostdriver.get_core(player.getEquipmentInSlot(1),"1")]+ghostmode  +".png";
						}
						else
						{
							return "KamenRiderCraftv3:textures/armor/blank.png";
						}
					}else if (belt.RIDER == "specter"){
						if (slot == 0)
						{
							return "KamenRiderCraftv3:textures/armor/"+ CoreNamespecter[item_ghostdriver.get_core(player.getEquipmentInSlot(1),"1")]+ghostmode+".png";
						}
						if (slot == 1 )
						{
							return "KamenRiderCraftv3:textures/armor/"+ CoreNamespecter[item_ghostdriver.get_core(player.getEquipmentInSlot(1),"1")]+ghostmode+".png";
						}

						if (slot == 2)
						{
							return "KamenRiderCraftv3:textures/armor/"+ CoreNamespecter[item_ghostdriver.get_core(player.getEquipmentInSlot(1),"1")]+ghostmode+".png";
						}
						else
						{
							return "KamenRiderCraftv3:textures/armor/blank.png";
						}
					}else if (belt.RIDER == "necrom"){
						if (slot == 0)
						{
							return "KamenRiderCraftv3:textures/armor/"+ CoreNamenecrom[item_ghostdriver.get_core(player.getEquipmentInSlot(1),"1")]+ghostmode+".png";
						}
						if (slot == 1 )
						{
							return "KamenRiderCraftv3:textures/armor/"+ CoreNamenecrom[item_ghostdriver.get_core(player.getEquipmentInSlot(1),"1")]+ghostmode+".png";
						}

						if (slot == 2)
						{
							return "KamenRiderCraftv3:textures/armor/"+ CoreNamenecrom[item_ghostdriver.get_core(player.getEquipmentInSlot(1),"1")]+ghostmode+".png";
						}
						else
						{
							return "KamenRiderCraftv3:textures/armor/blank.png";
						}
					}else if (belt.RIDER == "ghost_grateful"){

						if (slot == 0)
						{
							return "KamenRiderCraftv3:textures/armor/"+ belt.RIDER+".png";
						}
						if (slot == 1 )
						{
							return "KamenRiderCraftv3:textures/armor/"+ belt.RIDER +".png";
						}

						if (slot == 2)
						{
							return "KamenRiderCraftv3:textures/armor/"+ belt.RIDER +".png";
						}
						else
						{
							return "KamenRiderCraftv3:textures/armor/blank.png";
						}
					}else{
						if (slot == 0)
						{
							return "KamenRiderCraftv3:textures/armor/"+ belt.RIDER+ghostmode  +".png";
						}
						if (slot == 1 )
						{
							return "KamenRiderCraftv3:textures/armor/"+ belt.RIDER +ghostmode +".png";
						}

						if (slot == 2)
						{
							return "KamenRiderCraftv3:textures/armor/"+ belt.RIDER +ghostmode +".png";
						}
						else
						{
							return "KamenRiderCraftv3:textures/armor/blank.png";
						}
					}
				}			else
				{
					return "KamenRiderCraftv3:textures/armor/blank.png";


				}
			}
			else
			{
				return "KamenRiderCraftv3:textures/armor/blank.png";


			}
		}
		else
		{
			return "KamenRiderCraftv3:textures/armor/blank.png";


		}
	}




	@Override
	@SideOnly(Side.CLIENT)
	public ModelBiped getArmorModel(EntityLivingBase entityLiving,ItemStack itemStack, int armorSlot) {
		BipedLockseed armorModel = new BipedLockseed();
		if(itemStack != null){
			if(itemStack.getItem() instanceof item_ghost_armor2){
				int type = ((ItemArmor)itemStack.getItem()).armorType;
			}
			if(armorModel != null){

				armorModel.bipedHead.showModel = armorSlot == 2;
				armorModel.bipedHeadwear.showModel = armorSlot == 2;
				armorModel.bipedBody.showModel = armorSlot == 0;
				armorModel.bipedRightArm.showModel = armorSlot == 0;
				armorModel.bipedLeftArm.showModel = armorSlot == 0;
				armorModel.bipedRightLeg.showModel = armorSlot == 2;
				armorModel.bipedLeftLeg.showModel = armorSlot == 2;


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