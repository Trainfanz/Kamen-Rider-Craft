package Kamen_Rider_Craft_4TH.item.amazons;

import Kamen_Rider_Craft_4TH.RiderItems;
import Kamen_Rider_Craft_4TH.ShowaRiderItems;
import Kamen_Rider_Craft_4TH.TokuCraft_core;
import Kamen_Rider_Craft_4TH.item.ooo.item_OOOdriver;
import Kamen_Rider_Craft_4TH.model.model_belt;
import Kamen_Rider_Craft_4TH.util.IHasModel;
import Kamen_Rider_Craft_4TH.util.Refercence;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nullable;

public class item_amazonsdriver extends ItemArmor implements IHasModel
{

	private static final int[] maxDamageArray = new int[] {11, 16, 15, 13};
	public String armorNamePrefix;
	public ArmorMaterial material;

	public String Rider;

	public item_amazonsdriver (String name, ArmorMaterial par2EnumArmorMaterial, int par3, String rider)
	{
		super(par2EnumArmorMaterial, par3, EntityEquipmentSlot.FEET);
		this.material = par2EnumArmorMaterial;
		par2EnumArmorMaterial.getDamageReductionAmount(EntityEquipmentSlot.FEET);
		this.setMaxDamage(par2EnumArmorMaterial.getDurability(EntityEquipmentSlot.FEET));
		this.maxStackSize = 1;
		Rider = rider;
		setTranslationKey(name);
		setRegistryName(name);
		TokuCraft_core.ITEMS.add(this);
	}

	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, EntityEquipmentSlot slot, String type)
	{
		return Refercence.MODID + ":textures/armor/blank.png";

	}
	
	@Override
	public void registerModels() {
		TokuCraft_core.proxy.registerItemRender(this,0,"inventory");
	}
	@SideOnly(Side.CLIENT)
	public boolean hasEffect(ItemStack par1ItemStack)
	{
			return !true;
	}
	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack armor) {
		if (player.getItemStackFromSlot(EntityEquipmentSlot.HEAD)!= null){
			if (player.getItemStackFromSlot(EntityEquipmentSlot.CHEST)!= null){
				if (player.getItemStackFromSlot(EntityEquipmentSlot.LEGS)!= null){
					if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET)!= null){
						if (player.getItemStackFromSlot(EntityEquipmentSlot.LEGS).getItem() == ShowaRiderItems.amazonslegs){
							if (player.getItemStackFromSlot(EntityEquipmentSlot.CHEST).getItem() == ShowaRiderItems.amazonstroso){
								if (player.getItemStackFromSlot(EntityEquipmentSlot.HEAD).getItem() == ShowaRiderItems.amazonshead){

									if(item_OOOdriver.get_eftTime(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))<100){

										item_OOOdriver.set_eftTime(player.getItemStackFromSlot(EntityEquipmentSlot.FEET),item_OOOdriver.get_eftTime(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))+1);
									}
									if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == ShowaRiderItems.amazons_driver_alpha){
										
											if (player.getHeldItemMainhand().isEmpty())
											{
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 7,true,false));
											}
											player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 1,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 5, 1,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 2,true,false));
											
										}									
									if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == ShowaRiderItems.amazons_driver_blind_alpha){

											if (player.getHeldItemMainhand().isEmpty())
											{
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 9,true,false));
											}
											player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 0,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 5, 0,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 3,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.BLINDNESS, 5, 0,true,false));											
										
									}
									if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == ShowaRiderItems.amazons_driver_omega){

											if (player.getHeldItemMainhand().isEmpty())
											{
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 6,true,false));
											}
											player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 2,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 5, 2,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.REGENERATION, 5, 0,true,false));
										
									}
									if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == ShowaRiderItems.amazons_driver_sigma){

											if (player.getHeldItemMainhand().isEmpty())
											{
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 9,true,false));
											}
											player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 2,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 5, 2,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.REGENERATION, 5, 1,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 1,true,false));
										
									}
									if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == ShowaRiderItems.neo_amazons_driver_omega){

											if (player.getHeldItemMainhand().isEmpty())
											{
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 7,true,false));
											}
											player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 3,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 5, 3,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 0,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.REGENERATION, 5, 1,true,false));
										
									}
									if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == ShowaRiderItems.neo_amazons_driver_neo){

											if (player.getHeldItemMainhand().isEmpty())
											{
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 8,true,false));
											}
											player.addPotionEffect(new PotionEffect(MobEffects.REGENERATION, 5, 2,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 0,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 1,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 5, 0,true,false));
									}
								}
							}
						}	
					}
				}
			}
		}
	}

	

	@Override
	@SideOnly(Side.CLIENT)
	@Nullable
	public ModelBiped getArmorModel(EntityLivingBase living, ItemStack stack, EntityEquipmentSlot slot, ModelBiped defaultModel)
	{
		if(!stack.isEmpty())
		{
			if(stack.getItem() instanceof ItemArmor)
			{
				model_belt armorModel = new model_belt();
					armorModel.belt=stack;
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


	public static int get_eftTime(ItemStack itemstack)
	{
		return itemstack.hasTagCompound() ? itemstack.getTagCompound().getInteger("eftTime") : 100;
	}

	public static void set_eftTime(ItemStack itemstack, int flag)
	{
		if (!itemstack.hasTagCompound())
		{
			itemstack.setTagCompound(new NBTTagCompound());
		}
		itemstack.getTagCompound().setInteger("eftTime", flag);
	}

	public static int  get_core(ItemStack itemstack)
	{
		return itemstack.hasTagCompound() ? itemstack.getTagCompound().getInteger("core") :0;
	}

	public static void set_core(ItemStack itemstack, int flag)
	{
		if (!itemstack.hasTagCompound())
		{
			itemstack.setTagCompound(new NBTTagCompound());
		}
		itemstack.getTagCompound().setInteger("core", flag);
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
    	return ShowaRiderItems.amazon_cell_vial == repair.getItem() ? true : super.getIsRepairable(toRepair, repair);
    }


	
	
	

	

	




}