package Kamen_Rider_Craft_4TH.item.rider_armor_base;


import javax.annotation.Nullable;

import Kamen_Rider_Craft_4TH.RiderItems;
import Kamen_Rider_Craft_4TH.TokuCraft_core;
import Kamen_Rider_Craft_4TH.item.Ichigo.item_Ichigoarmor;
import Kamen_Rider_Craft_4TH.model.tokuArmorModel;
import Kamen_Rider_Craft_4TH.model.tokuArmorModel2;
import Kamen_Rider_Craft_4TH.util.IHasModel;
import Kamen_Rider_Craft_4TH.util.Refercence;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class item_rider_armor extends ItemArmor  implements IHasModel
{
	private static final int[] maxDamageArray = new int[] {11, 16, 15, 13};
	public String armorNamePrefix;
	public ArmorMaterial material;
	public Class<? extends item_rider_driver> BELTCLASS;
	private final Item base;   

	public item_rider_armor (String name,Class<? extends item_rider_driver> beltClass,ArmorMaterial par2EnumArmorMaterial, int par3, EntityEquipmentSlot par4, Item item)
	{
		super(par2EnumArmorMaterial, par3, par4);
		this.material = par2EnumArmorMaterial;
		par2EnumArmorMaterial.getDamageReductionAmount(par4);
		this.setMaxDamage(par2EnumArmorMaterial.getDurability(par4));
		this.maxStackSize = 1;
		setTranslationKey(name);
		setRegistryName(name);
		TokuCraft_core.ITEMS.add(this);
		BELTCLASS=beltClass;
		base = item;
	}


	@Override
	@SideOnly(Side.CLIENT)
	@Nullable
	public ModelBiped getArmorModel(EntityLivingBase player, ItemStack stack, EntityEquipmentSlot slot, ModelBiped defaultModel)
	{
		if(!stack.isEmpty())
		{
			if(stack.getItem() instanceof item_rider_armor)
			{
				tokuArmorModel2 armorModel = new tokuArmorModel2();
			
					if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem()instanceof item_rider_driver){
						item_rider_driver belt =((item_rider_driver)player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem());

						if (stack.getItem()==belt.HEAD){
							armorModel.bipedHead2.showModel = slot == EntityEquipmentSlot.HEAD;
							armorModel.bipedHeadwear2.showModel = slot == EntityEquipmentSlot.HEAD;
							armorModel.bigBipedHead2.showModel = slot == EntityEquipmentSlot.HEAD;
							armorModel.bigBipedHeadwear2.showModel = slot == EntityEquipmentSlot.HEAD;

						}else{
							armorModel.bipedHead2.showModel = slot == EntityEquipmentSlot.FEET;
							armorModel.bipedHeadwear2.showModel = slot == EntityEquipmentSlot.FEET;
							armorModel.bigBipedHead2.showModel = slot == EntityEquipmentSlot.FEET;
							armorModel.bigBipedHeadwear2.showModel = slot == EntityEquipmentSlot.FEET;

						}

						if (stack.getItem()==belt.TORSO){
							armorModel.bipedRightArm2.showModel = slot == EntityEquipmentSlot.CHEST;
							armorModel.bipedLeftArm2.showModel = slot == EntityEquipmentSlot.CHEST;

							armorModel.bigBipedLeftArm2.showModel = slot == EntityEquipmentSlot.CHEST;
							armorModel.bigBipedRightArm2.showModel = slot == EntityEquipmentSlot.CHEST;

							armorModel.bipedBody3.showModel = slot == EntityEquipmentSlot.CHEST;
							armorModel.bigBipedBody3.showModel = slot == EntityEquipmentSlot.CHEST;


						}else{
							armorModel.bipedRightArm2.showModel = slot == EntityEquipmentSlot.FEET;
							armorModel.bipedLeftArm2.showModel = slot == EntityEquipmentSlot.FEET;

							armorModel.bigBipedLeftArm2.showModel = slot == EntityEquipmentSlot.FEET;
							armorModel.bigBipedRightArm2.showModel = slot == EntityEquipmentSlot.FEET;

							armorModel.bipedBody3.showModel = slot == EntityEquipmentSlot.FEET;
							armorModel.bigBipedBody3.showModel = slot == EntityEquipmentSlot.FEET;
						}

						if (stack.getItem()==belt.LEGS){
							armorModel.bipedBody2.showModel = slot == EntityEquipmentSlot.LEGS;
							armorModel.bigBipedBody2.showModel = slot == EntityEquipmentSlot.LEGS;
							armorModel.bigBipedLeftLeg2.showModel = slot == EntityEquipmentSlot.LEGS;
							armorModel.bigBipedRightLeg2.showModel = slot == EntityEquipmentSlot.LEGS;

							armorModel.bipedLeftLeg2.showModel = slot == EntityEquipmentSlot.LEGS;
							armorModel.bipedRightLeg2.showModel = slot == EntityEquipmentSlot.LEGS;

						}else{
							armorModel.bipedBody2.showModel = slot == EntityEquipmentSlot.FEET;
							armorModel.bigBipedBody2.showModel = slot == EntityEquipmentSlot.FEET;
							armorModel.bigBipedLeftLeg2.showModel = slot == EntityEquipmentSlot.FEET;
							armorModel.bigBipedRightLeg2.showModel = slot == EntityEquipmentSlot.FEET;

							armorModel.bipedLeftLeg2.showModel = slot == EntityEquipmentSlot.FEET;
							armorModel.bipedRightLeg2.showModel = slot == EntityEquipmentSlot.FEET;

						}
					}else{
						armorModel.bipedRightArm2.showModel = slot == EntityEquipmentSlot.FEET;
						armorModel.bipedLeftArm2.showModel = slot == EntityEquipmentSlot.FEET;

						armorModel.bigBipedLeftArm2.showModel = slot == EntityEquipmentSlot.FEET;
						armorModel.bigBipedRightArm2.showModel = slot == EntityEquipmentSlot.FEET;

						armorModel.bipedBody3.showModel = slot == EntityEquipmentSlot.FEET;
						armorModel.bigBipedBody3.showModel = slot == EntityEquipmentSlot.FEET;
							armorModel.bipedBody2.showModel = slot == EntityEquipmentSlot.FEET;
							armorModel.bigBipedBody2.showModel = slot == EntityEquipmentSlot.FEET;
							armorModel.bigBipedLeftLeg2.showModel = slot == EntityEquipmentSlot.FEET;
							armorModel.bigBipedRightLeg2.showModel = slot == EntityEquipmentSlot.FEET;

							armorModel.bipedLeftLeg2.showModel = slot == EntityEquipmentSlot.FEET;
							armorModel.bipedRightLeg2.showModel = slot == EntityEquipmentSlot.FEET;

						
					}
				
				

						armorModel.base = BELTCLASS;
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

			public boolean getIsRepairable(ItemStack toRepair, ItemStack repair) 
			{
				return RiderItems.rider_circuit == repair.getItem() ? true : super.getIsRepairable(toRepair, repair);
			}

			@Override
			public void registerModels() {
				TokuCraft_core.proxy.registerItemRender(this,0,"inventory");
			}
		}