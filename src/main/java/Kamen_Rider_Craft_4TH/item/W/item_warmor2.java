package Kamen_Rider_Craft_4TH.item.W;


import javax.annotation.Nullable;

import Kamen_Rider_Craft_4TH.RiderItems;
import Kamen_Rider_Craft_4TH.TokuCraft_core;
import Kamen_Rider_Craft_4TH.model.tokuArmorModel;
import Kamen_Rider_Craft_4TH.util.IHasModel;
import Kamen_Rider_Craft_4TH.util.Refercence;
import net.minecraft.block.BlockDispenser;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.client.ForgeHooksClient;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class item_warmor2 extends ItemArmor implements IHasModel
{
	public static final String[] CoreNameb= new String[] {"core","xtreme","gold_xtreme","xtreme"};
	public static final String[] CoreName= new String[] {"joker","metal","trigger","cyclonecyclone","joker_xtreme","joker_gold_xtreme","accel_xtreme"};
	public static final String[] CoreName2= new String[] {"cyclone","heat","luna","fang","jokerjoker","cyclone_xtreme","cyclone_gold_xtreme","cyclone_xtreme_accel"};		
	public static final String[] CoreName3= new String[] {"eternal","eternal_red"};
	public static final String[] CoreName4= new String[] {"accel","accel_trial","accel_booster"};


	private static final int[] maxDamageArray = new int[] {11, 20, 15, 13};

	public String armorNamePrefix;
	public ArmorMaterial material;

	public item_warmor2 (String name,ArmorMaterial par2EnumArmorMaterial, int par3, EntityEquipmentSlot par4)
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
	public void registerModels() {
		TokuCraft_core.proxy.registerItemRender(this,0,"inventory");
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
	public String getArmorTexture(ItemStack stack, Entity entity, EntityEquipmentSlot slot, String type)
	{
		if (entity instanceof EntityLivingBase){

			EntityLivingBase player = ((EntityLivingBase)entity);


			if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET)!= null){

				if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.wdriver){


					if ( slot == EntityEquipmentSlot.HEAD)
					{
						if (item_Wdriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET),"2")>0){
							return Refercence.MODID+":textures/armor/"+"w_"+ CoreName[item_Wdriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET),"2")+3] +".png";
						}
						if (item_Wdriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET),"3")==3){
							return Refercence.MODID+":textures/armor/"+"w_"+ "fang_"+CoreName[item_Wdriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET),"1")]+".png";

						}
						return Refercence.MODID+":textures/armor/"+"w_"+ CoreName[item_Wdriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET),"1")] +".png";
					}
					if ( slot == EntityEquipmentSlot.CHEST)
					{
						return Refercence.MODID+":textures/armor/"+"w_"+ CoreNameb[item_Wdriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET),"2")] +".png";
					}

					if ( slot == EntityEquipmentSlot.LEGS)
					{
						if (item_Wdriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET),"2")>0){
							return Refercence.MODID+":textures/armor/"+"w_"+ CoreName2[item_Wdriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET),"2")+4] +".png";
						}
						return Refercence.MODID+":textures/armor/"+"w_"+ CoreName2[item_Wdriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET),"3")] +".png";
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
				}	}
			return Refercence.MODID+":textures/armor/blank.png";


		}
	
	else
	{
		return Refercence.MODID+":textures/armor/blank.png";



	}
	

}

	@Override
	@SideOnly(Side.CLIENT)
	@Nullable
	public ModelBiped getArmorModel(EntityLivingBase living, ItemStack stack, EntityEquipmentSlot slot, ModelBiped defaultModel)
	{
		if(!stack.isEmpty())
		{
			if(stack.getItem() instanceof item_warmor2)
			{
				tokuArmorModel armorModel = new tokuArmorModel();

				armorModel.bipedHeadwear.showModel = slot == EntityEquipmentSlot.LEGS|| slot == EntityEquipmentSlot.HEAD;
				armorModel.bipedBody2.showModel = slot == EntityEquipmentSlot.LEGS|| slot == EntityEquipmentSlot.HEAD||slot == EntityEquipmentSlot.CHEST;
				armorModel.bipedRightArm2.showModel = slot == EntityEquipmentSlot.LEGS;
				armorModel.bipedLeftArm2.showModel = slot == EntityEquipmentSlot.HEAD;
				
				armorModel.bipedLeftLeg2.showModel = slot == EntityEquipmentSlot.HEAD;
				armorModel.bipedRightLeg2.showModel = slot == EntityEquipmentSlot.LEGS;

				armorModel.bipedBody3.showModel = slot == EntityEquipmentSlot.LEGS|| slot == EntityEquipmentSlot.HEAD||slot == EntityEquipmentSlot.CHEST;
				
				armorModel.bipedHead2.showModel = slot == EntityEquipmentSlot.LEGS|| slot == EntityEquipmentSlot.HEAD;
				armorModel.bipedHeadwear2.showModel = slot == EntityEquipmentSlot.LEGS|| slot == EntityEquipmentSlot.HEAD;

				armorModel.isSneak = defaultModel.isSneak;
				armorModel.isRiding = defaultModel.isRiding;
				armorModel.isChild = defaultModel.isChild;
				armorModel.rightArmPose = defaultModel.rightArmPose;
				armorModel.leftArmPose = defaultModel.leftArmPose;

				return armorModel;
			}
		}
		return null;
	}

	/**

	@Override
	@SideOnly(Side.CLIENT)
	public ModelBiped getArmorModel(EntityLivingBase entityLiving,ItemStack itemStack, int armorSlot) {
		BipedLockseed armorModel = new BipedLockseed();

		if(itemStack != null){
			if(itemStack.getItem() instanceof item_warmor2){
				int type = ((ItemArmor)itemStack.getItem()).armorType;
			}
			if(armorModel != null){

				armorModel.bipedHead.showModel = armorSlot == 1|| armorSlot == 2|| armorSlot == 4||armorSlot == 3;
				armorModel.bipedHeadwear.showModel = armorSlot == 1||armorSlot == 3;
				armorModel.bipedBody2.showModel = armorSlot == 1||armorSlot == 3;
				armorModel.bipedRightArm2.showModel = armorSlot == 3;
				armorModel.bipedLeftArm2.showModel = armorSlot == 1;
				armorModel.bipedRightLeg2.showModel = armorSlot == 3;
				armorModel.bipedLeftLeg2.showModel = armorSlot == 1;

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
**/


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