package KamenRiderCraftV3.item.gaim;


import KamenRiderCraftV3.item.agito.item_agitoarmor2;
import KamenRiderCraftV3.model.BipedLockseed;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class item_Gaimarmor extends ItemArmor
{
	public static final String[] CoreName= new String[] {"gaim","gaim_jimbar","gaim_kachidoki","gaim_kiwami","gaim_yami", "gaim_fresh","gaim_drive"};

	private static final int[] maxDamageArray = new int[] {11, 16, 15, 13};
	public String armorNamePrefix;
	public ArmorMaterial material;

	public item_Gaimarmor (ArmorMaterial par2EnumArmorMaterial, int par3, int par4)
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

			EntityLivingBase player = (EntityLivingBase) entity;
			
			if (player.getEquipmentInSlot(1)!= null){

				if (player.getEquipmentInSlot(1).getItem() instanceof item_Gaimdriver){
					
					 
					item_Gaimdriver belt = (item_Gaimdriver) player.getEquipmentInSlot(1).getItem();
					if (belt.RIDER == "ryugen"){
						
						if (item_Gaimdriver.get_lock(player.getEquipmentInSlot(1))=="yomotsu_heguri_arms"){
						
							return "KamenRiderCraftv3:textures/armor/"+ "ryugen_yomi" +".png";
						}else if (item_Gaimdriver.get_lock(player.getEquipmentInSlot(1))=="jimbar_dragon_arms"){

							return "KamenRiderCraftv3:textures/armor/"+ "ryugen_jimber" +".png";
						}else
							return "KamenRiderCraftv3:textures/armor/"+ "ryugen" +".png";
						}else if (belt.RIDER == "barvo"){

							if (item_Gaimdriver.get_lock(player.getEquipmentInSlot(1))=="jimbar_melon_arms_barvo"){

								return "KamenRiderCraftv3:textures/armor/"+ "barvo_jimber" +".png";
							}else
								return "KamenRiderCraftv3:textures/armor/"+ "barvo" +".png";
						}else if (belt.RIDER == "zangetsu"){

							if (item_Gaimdriver.get_lock(player.getEquipmentInSlot(1))=="watermelon_arms"){

								return "KamenRiderCraftv3:textures/armor/"+ "zangetsu_watermelon" +".png";
							}else
								return "KamenRiderCraftv3:textures/armor/"+ "zangetsu" +".png";
						}else if (belt.RIDER == "duke"){

							if (item_Gaimdriver.get_lock(player.getEquipmentInSlot(1))=="energy_dragon_fruits_arms"){

								return "KamenRiderCraftv3:textures/armor/"+ "duke_hex" +".png";
							}else
								return "KamenRiderCraftv3:textures/armor/"+ "duke" +".png";
							
						}
					
					if (belt.RIDER == "gaim"){
					if (slot == 0)
					{
						return "KamenRiderCraftv3:textures/armor/"+ CoreName[item_Gaimdriver.get_core(player.getEquipmentInSlot(1),"1")] +".png";
					}
					if (slot == 1 )
					{
						return "KamenRiderCraftv3:textures/armor/"+ CoreName[item_Gaimdriver.get_core(player.getEquipmentInSlot(1),"1")] +".png";
					}

				  if (slot == 3)
					{
						return "KamenRiderCraftv3:textures/armor/"+ CoreName[item_Gaimdriver.get_core(player.getEquipmentInSlot(1),"1")] +".png";
					}
					else
					{
						return "KamenRiderCraftv3:textures/armor/blank.png";
					}
					}else{
						if (slot == 0)
						{
							return "KamenRiderCraftv3:textures/armor/"+ belt.RIDER +".png";
						}
						if (slot == 1 )
						{
							return "KamenRiderCraftv3:textures/armor/"+ belt.RIDER +".png";
						}

					  if (slot == 3)
						{
							return "KamenRiderCraftv3:textures/armor/"+ belt.RIDER +".png";
						}
						else
						{
							return "KamenRiderCraftv3:textures/armor/blank.png";
						}
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
			if(itemStack.getItem() instanceof item_Gaimarmor){
				int type = ((ItemArmor)itemStack.getItem()).armorType;
			}
			if(armorModel != null){

					
					armorModel.bipedBody3.showModel = armorSlot == 3;
					armorModel.bipedRightArm2.showModel = armorSlot == 1;
					armorModel.bipedLeftLeg2.showModel = armorSlot == 1;
					armorModel.bipedBody2.showModel = armorSlot == 1;
					armorModel.bipedLeftArm2.showModel =armorSlot == 1;
					armorModel.bipedRightLeg2.showModel =armorSlot == 1;
				
					armorModel.bipedHead2.showModel= armorSlot == 0;
					armorModel.bipedHeadwear2.showModel= armorSlot == 0;
					
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