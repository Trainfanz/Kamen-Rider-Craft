	package Kamen_Rider_Craft_4TH.item.ooo;

	import javax.annotation.Nullable;

import Kamen_Rider_Craft_4TH.RiderItems;
	import Kamen_Rider_Craft_4TH.TokuCraft_core;
import Kamen_Rider_Craft_4TH.item.ryuki.item_ryukiarmor2;
import Kamen_Rider_Craft_4TH.model.tokuArmorModel;
import Kamen_Rider_Craft_4TH.util.IHasModel;
import Kamen_Rider_Craft_4TH.util.Refercence;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.entity.Entity;
	import net.minecraft.entity.EntityLivingBase;
	import net.minecraft.entity.player.EntityPlayer;
	import net.minecraft.inventory.EntityEquipmentSlot;
	import net.minecraft.item.ItemArmor;
	import net.minecraft.item.ItemStack;
	import net.minecraft.item.ItemArmor.ArmorMaterial;
	import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

	public class item_OOOarmor2 extends ItemArmor  implements IHasModel
	{
		
		private static final int[] maxDamageArray = new int[] {11, 16, 15, 13};
		public String armorNamePrefix;
		public ArmorMaterial material;

		public item_OOOarmor2 (String name,ArmorMaterial par2EnumArmorMaterial, int par3, EntityEquipmentSlot par4)
		{
			super(par2EnumArmorMaterial, par3, par4);
			this.material = par2EnumArmorMaterial;
			par2EnumArmorMaterial.getDamageReductionAmount(par4);
			this.setMaxDamage(par2EnumArmorMaterial.getDurability(par4));
			this.maxStackSize = 1;
			
	        setUnlocalizedName(name);
	        setRegistryName(name);
	        TokuCraft_core.ITEMS.add(this);
		}

		@Override
		public void registerModels() {
			TokuCraft_core.proxy.registerItemRender(this,0,"inventory");
		}
		
		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EntityEquipmentSlot slot, String type)
		{
			if (entity instanceof EntityLivingBase){
				EntityLivingBase player = ((EntityLivingBase)entity);


				if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET)!= null){

					if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.OOOdriver){

						

							if ( slot == EntityEquipmentSlot.HEAD & item_OOOdriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET),"2")==3& item_OOOdriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET),"3")==3)
							{
								return Refercence.MODID+":textures/armor/"+"ooo_"+ "super_taka"+".png";
							}else if ( slot == EntityEquipmentSlot.HEAD)
						{
							return Refercence.MODID+":textures/armor/"+"ooo_"+ Itemmedal.CoreName1[item_OOOdriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET),"1")] +".png";
						}
						if ( slot == EntityEquipmentSlot.CHEST)
						{
							return Refercence.MODID+":textures/armor/"+"ooo_"+ Itemmedal.CoreName1[item_OOOdriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET),"2")] +".png" ;
						}

						if ( slot == EntityEquipmentSlot.LEGS)
						{
							return Refercence.MODID+":textures/armor/"+"ooo_"+ Itemmedal.CoreName3[item_OOOdriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET),"3")] +".png";
						} 

					}	
					
					else if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.birth_driver){
						if ( slot == EntityEquipmentSlot.HEAD)
						{
							return Refercence.MODID+":textures/armor/"+"birth_1" +".png";
						}
						if ( slot == EntityEquipmentSlot.CHEST)
						{
							return Refercence.MODID+":textures/armor/"+"birth_2" +".png";
						}

						if ( slot == EntityEquipmentSlot.LEGS)
						{
							return Refercence.MODID+":textures/armor/"+"birth_3" +".png";
						}
						return Refercence.MODID+":textures/armor/blank.png";
					}else if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.birth_driver_prototype){
						if ( slot == EntityEquipmentSlot.HEAD)
						{
							return Refercence.MODID+":textures/armor/"+"birth_prototype_1" +".png";
						}
						if ( slot == EntityEquipmentSlot.CHEST)
						{
							return Refercence.MODID+":textures/armor/"+"birth_prototype_2" +".png";
						}

						if ( slot == EntityEquipmentSlot.LEGS)
						{
							return Refercence.MODID+":textures/armor/"+"birth_prototype_3" +".png";
						}
						return Refercence.MODID+":textures/armor/blank.png";
					}else if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.poseidon_driver){
						if ( slot == EntityEquipmentSlot.HEAD)
						{
							return Refercence.MODID+":textures/armor/"+"poseidon_1" +".png";
						}
						if ( slot == EntityEquipmentSlot.CHEST)
						{
							return Refercence.MODID+":textures/armor/"+"poseidon_2" +".png";
						}

						if ( slot == EntityEquipmentSlot.LEGS)
						{
							return Refercence.MODID+":textures/armor/"+"poseidon_3" +".png";
						}
						return Refercence.MODID+":textures/armor/blank.png";
					}else if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.aqua_driver){
						if ( slot == EntityEquipmentSlot.HEAD)
						{
							return Refercence.MODID+":textures/armor/"+"aqua_1" +".png";
						}
						if ( slot == EntityEquipmentSlot.CHEST)
						{
							return Refercence.MODID+":textures/armor/"+"aqua_2" +".png";
						}

						if ( slot == EntityEquipmentSlot.LEGS)
						{
							return Refercence.MODID+":textures/armor/"+"aqua_3" +".png";
						}
						return Refercence.MODID+":textures/armor/blank.png";
					}


				}
			}
			else
			{
				return Refercence.MODID+":textures/armor/blank.png";



			}
			return Refercence.MODID+":textures/armor/blank.png";

		}
		@Override
		@SideOnly(Side.CLIENT)
		@Nullable
		public ModelBiped getArmorModel(EntityLivingBase living, ItemStack stack, EntityEquipmentSlot slot, ModelBiped defaultModel)
		{
			if(!stack.isEmpty())
			{
				if(stack.getItem() instanceof item_OOOarmor2)
				{
					tokuArmorModel armorModel = new tokuArmorModel();

					
					armorModel.bipedBody2.showModel = slot == EntityEquipmentSlot.HEAD;
					armorModel.bipedRightArm2.showModel = slot == EntityEquipmentSlot.CHEST;
					armorModel.bipedLeftArm2.showModel = slot == EntityEquipmentSlot.LEGS;
					
					armorModel.bipedLeftLeg2.showModel = slot == EntityEquipmentSlot.CHEST;
					armorModel.bipedRightLeg2.showModel = slot == EntityEquipmentSlot.LEGS;
					
					armorModel.bipedBody3.showModel = slot == EntityEquipmentSlot.HEAD;
					
					armorModel.bipedHead2.showModel = slot == EntityEquipmentSlot.HEAD;
					armorModel.bipedHeadwear2.showModel = slot == EntityEquipmentSlot.HEAD;

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
		 * Returns the 'max damage' factor array for the armor, each piece of armor have a durability factor (that gets
		 * multiplied by armor material factor)
		 */
		static int[] getMaxDamageArray()
		{
			return maxDamageArray;
		}

	}