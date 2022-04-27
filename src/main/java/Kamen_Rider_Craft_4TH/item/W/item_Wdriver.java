package Kamen_Rider_Craft_4TH.item.W;

import javax.annotation.Nullable;

import org.lwjgl.opengl.GL11;

import Kamen_Rider_Craft_4TH.RiderItems;
import Kamen_Rider_Craft_4TH.TokuCraft_core;
import Kamen_Rider_Craft_4TH.model.model_belt;
import Kamen_Rider_Craft_4TH.model.model_belt_w;
import Kamen_Rider_Craft_4TH.potion.PotionCore;
import Kamen_Rider_Craft_4TH.util.IHasModel;
import Kamen_Rider_Craft_4TH.util.Refercence;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class item_Wdriver extends ItemArmor implements IHasModel
{
	private static final int[] maxDamageArray = new int[] {11, 16, 15, 13};
	public String armorNamePrefix;
	public ArmorMaterial material;



	public item_Wdriver (String name,ArmorMaterial par2EnumArmorMaterial, int par3)
	{
		super(par2EnumArmorMaterial, par3, EntityEquipmentSlot.FEET);
		this.material = par2EnumArmorMaterial;
		par2EnumArmorMaterial.getDamageReductionAmount(EntityEquipmentSlot.FEET);
		this.setMaxDamage(par2EnumArmorMaterial.getDurability(EntityEquipmentSlot.FEET));
		this.maxStackSize = 1;
		setTranslationKey(name);
		setRegistryName(name);
		TokuCraft_core.ITEMS.add(this);
	}
	@SideOnly(Side.CLIENT)
	public boolean hasEffect(ItemStack par1ItemStack)
	{
		return !true;
	}
	@Override
	public void registerModels() {
		TokuCraft_core.proxy.registerItemRender(this,0,"inventory");
	}

	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, EntityEquipmentSlot slot, String type)
	{
		return Refercence.MODID+":textures/armor/blank.png";

	}

	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack armor) {


		if (player.getItemStackFromSlot(EntityEquipmentSlot.HEAD)!= null){
			if (player.getItemStackFromSlot(EntityEquipmentSlot.CHEST)!= null){
				if (player.getItemStackFromSlot(EntityEquipmentSlot.LEGS)!= null){
					if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET)!= null){
						if (player.getItemStackFromSlot(EntityEquipmentSlot.LEGS).getItem() == RiderItems.wlegs){
							if (player.getItemStackFromSlot(EntityEquipmentSlot.CHEST).getItem() == RiderItems.wtroso){
								if (player.getItemStackFromSlot(EntityEquipmentSlot.HEAD).getItem() == RiderItems.whead){
									ItemStack ItemStack = player.getItemStackFromSlot(EntityEquipmentSlot.FEET);


									if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.wdriver){
										if (get_core(ItemStack,"3")==0){
											player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 1,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 5, 0,true,false));


										}else 	if (get_core(ItemStack,"3")==1){
											player.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE, 5, 0,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 0,true,false));


										}else 	if (get_core(ItemStack,"3")==2){
											player.addPotionEffect(new PotionEffect(MobEffects.REGENERATION, 5, 0,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 5, 0,true,false));


										}else 	if (get_core(ItemStack,"3")==3){
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 4,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 2,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 1,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.WITHER, 5, 0,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.NAUSEA, 5, 0,true,false));

										}else 	if (get_core(ItemStack,"3")==4){
											player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 1,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 5, 1,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 2,true,false));

										}

										if (get_core(ItemStack,"1")==0){
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 1,true,false));
										}else if (get_core(ItemStack,"1")==1){
											player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 1,true,false));		
										}else if (get_core(ItemStack,"1")==2){
											player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 1,true,false));	
										}else if (get_core(ItemStack,"1")==3){
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 1,true,false));	
											player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 2,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 5, 1,true,false));
										}else if (get_core(ItemStack,"1")==6){
											player.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE, 5, 0,true,false));
										}else if (get_core(ItemStack,"1")==4){
											player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 3,true,false));	
										}

										if (get_core(ItemStack,"2")==1){
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 3,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 2,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 1,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 3,true,false));		
											player.addPotionEffect(new PotionEffect(MobEffects.REGENERATION, 5, 1,true,false));
											if (player.fallDistance>10){
												item_Wdriver.set_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), 2, "2");
											}


										}else if (get_core(ItemStack,"2")==2){
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 3,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 2,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 1,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 3,true,false));		
											player.addPotionEffect(new PotionEffect(MobEffects.REGENERATION, 5, 1,true,false));
											player.fallDistance=0; 
											player.addPotionEffect(new PotionEffect(PotionCore.FLY_POTION, 5, 0,true,false));
										}
										else if (get_core(ItemStack,"2")==3){
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 4,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 3,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 2,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 4,true,false));		
											player.addPotionEffect(new PotionEffect(MobEffects.REGENERATION, 5, 1,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 5, 1,true,false));
										}
									}	

									if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.accel_driver){
										if (get_core(ItemStack,"1")==0){
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 1,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 2,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 0,true,false));


										}else if (get_core(ItemStack,"1")==1){
											player.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE, 5, 0,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 0,true,false));	
											player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 4,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 5, 0,true,false));	


										}else if (get_core(ItemStack,"1")==2){
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 1,true,false));	
											player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 3,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 1,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE, 5, 0,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.REGENERATION, 5, 1,true,false));

										}
									}									

									if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.lostdriver){

										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 1,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 5, 0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 1,true,false));


									}		
									if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.lostdriver_skull){

										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 1,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 5, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 1,true,false));

									}if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.lostdriver_eternal){
										if (get_core(ItemStack,"1")==0){
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 2,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 1,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 0,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 1,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.REGENERATION, 5, 0,true,false));

										}else if (get_core(ItemStack,"1")==1){
											player.addPotionEffect(new PotionEffect(MobEffects.WEAKNESS, 5, 0,true,false));
										}	
									}
									if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.lostdriver_cyclone){
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 1,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 5, 2,true,false));

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

				model_belt_w armorModel = new model_belt_w();


				armorModel.belt=stack;

				//armorModel.bipedRightLeg.showModel = slot == EntityEquipmentSlot.FEET;
				//armorModel.bipedLeftLeg.showModel = slot == EntityEquipmentSlot.FEET;

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


	public static int get_core(ItemStack itemstack,String slot)
	{
		return itemstack.hasTagCompound() ? itemstack.getTagCompound().getInteger("core"+slot) : 0;
	}

	public static void set_core(ItemStack itemstack, int flag,String slot)
	{
		if (!itemstack.hasTagCompound())
		{
			itemstack.setTagCompound(new NBTTagCompound());
		}
		itemstack.getTagCompound().setInteger("core"+slot, flag);
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