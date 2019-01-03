package KamenRiderCraftV3.item.W;


import KamenRiderCraftV3.RiderItems;
import KamenRiderCraftV3.model.Biped;
import KamenRiderCraftV3.model.BipedLockseed;
import net.minecraft.block.BlockDispenser;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.MathHelper;
import net.minecraftforge.client.ForgeHooksClient;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class item_warmor2 extends ItemArmor
{
	public static final String[] CoreName= new String[] {"joker","metal","trigger","cyclonecyclone","joker_xtreme","joker_gold_xtreme","accel_xtreme"};
	public static final String[] CoreName2= new String[] {"cyclone","heat","luna","fang","jokerjoker","cyclone_xtreme","cyclone_gold_xtreme","cyclone_xtreme_accel"};		
	public static final String[] CoreName3= new String[] {"joker","skull","eternal","eternal_red","cyclone"};
	public static final String[] CoreName4= new String[] {"accel","accel_trial","accel_booster"};


	private static final int[] maxDamageArray = new int[] {11, 20, 15, 13};

	public String armorNamePrefix;
	public ArmorMaterial material;

	public item_warmor2(ArmorMaterial par2EnumArmorMaterial, int par3, int par4)
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

				if (player.getEquipmentInSlot(1).getItem() == RiderItems.Wdriver){


					if (slot == 1)
					{
						if (item_Wdriver.get_core(player.getEquipmentInSlot(1),"2")>0){
							return "KamenRiderCraftv3:textures/armor/"+"w_"+ CoreName[item_Wdriver.get_core(player.getEquipmentInSlot(1),"2")+3] +".png";
						}
						if (item_Wdriver.get_core(player.getEquipmentInSlot(1),"1")==0 & item_Wdriver.get_core(player.getEquipmentInSlot(1),"1")==0& item_Wdriver.get_core(player.getEquipmentInSlot(1),"3")==3){
							return "KamenRiderCraftv3:textures/armor/"+"w_"+ "fang_joker"+".png";

						}
						return "KamenRiderCraftv3:textures/armor/"+"w_"+ CoreName[item_Wdriver.get_core(player.getEquipmentInSlot(1),"1")] +".png";
					}
					if (slot == 1 )
					{
						return "KamenRiderCraftv3:textures/armor/"+"w_"+ CoreName[item_Wdriver.get_core(player.getEquipmentInSlot(1),"2")] +".png";
					}

					if (slot == 2)
					{
						if (item_Wdriver.get_core(player.getEquipmentInSlot(1),"2")>0){
							return "KamenRiderCraftv3:textures/armor/"+"w_"+ CoreName2[item_Wdriver.get_core(player.getEquipmentInSlot(1),"2")+4] +".png";
						}
						return "KamenRiderCraftv3:textures/armor/"+"w_"+ CoreName2[item_Wdriver.get_core(player.getEquipmentInSlot(1),"3")] +".png";
					}  
					if (slot == 3)
					{
						return "KamenRiderCraftv3:textures/armor/"+"w_"+ CoreName[item_Wdriver.get_core(player.getEquipmentInSlot(1),"1")] +".png";
					}
					else
					{
						return null;
					}
				}else if (player.getEquipmentInSlot(1).getItem() == RiderItems.lostdriver){

					if (slot == 0)
					{
						return "KamenRiderCraftv3:textures/armor/"+ CoreName3[item_Wdriver.get_core(player.getEquipmentInSlot(1),"1")]+"_l" +".png";
					}
					if (slot == 1 )
					{
						return "KamenRiderCraftv3:textures/armor/"+ CoreName3[item_Wdriver.get_core(player.getEquipmentInSlot(1),"2")]+"_l" +".png";
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
						return "KamenRiderCraftv3:textures/armor/"+ CoreName4[item_Wdriver.get_core(player.getEquipmentInSlot(1),"2")]+"_l" +".png";
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
				}	}
			return "KamenRiderCraftv3:textures/armor/blank.png";


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
			if(itemStack.getItem() instanceof item_warmor2){
				int type = ((ItemArmor)itemStack.getItem()).armorType;
			}
			if(armorModel != null){

				/**
				armorModel.bipedHead.showModel = armorSlot == 1|| armorSlot == 2|| armorSlot == 4||armorSlot == 3;
				armorModel.bipedHeadwear.showModel = armorSlot == 1||armorSlot == 3;
				armorModel.bipedBody2.showModel = armorSlot == 1||armorSlot == 3;
				armorModel.bipedRightArm2.showModel = armorSlot == 3;
				armorModel.bipedLeftArm2.showModel = armorSlot == 1;
				armorModel.bipedRightLeg2.showModel = armorSlot == 3;
				armorModel.bipedLeftLeg2.showModel = armorSlot == 1;
**/
				armorModel.bipedBody3.showModel = armorSlot == 4;
				armorModel.bipedRightArm2.showModel = armorSlot == 2;
				armorModel.bipedLeftLeg2.showModel = armorSlot == 4;
				armorModel.bipedBody2.showModel = armorSlot == 2;
				armorModel.bipedLeftArm2.showModel =armorSlot == 4;
				armorModel.bipedRightLeg2.showModel =armorSlot == 2;
				
				//armorModel.bipedHead2.showModel= armorSlot == 4;
				//armorModel.bipedHeadwear2.showModel= armorSlot == 4;
				
				//armorModel.bipedHead2.showModel=armorSlot == 2;
				//armorModel.bipedHeadwear2.showModel=armorSlot == 2;
				
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