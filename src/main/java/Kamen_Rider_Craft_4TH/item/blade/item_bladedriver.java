package Kamen_Rider_Craft_4TH.item.blade;

import javax.annotation.Nullable;

import org.lwjgl.opengl.GL11;

import Kamen_Rider_Craft_4TH.RiderItems;
import Kamen_Rider_Craft_4TH.TokuCraft_core;
import Kamen_Rider_Craft_4TH.item.ooo.item_OOOdriver;
import Kamen_Rider_Craft_4TH.model.model_belt;
import Kamen_Rider_Craft_4TH.model.model_belt_plus;
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
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

public class item_bladedriver extends ItemArmor implements IHasModel
{

	private static final int[] maxDamageArray = new int[] {11, 16, 15, 13};
	public String armorNamePrefix;
	public ArmorMaterial material;

	public String Rider;

	public item_bladedriver (String name,ArmorMaterial par2EnumArmorMaterial, int par3, String rider)
	{
		super(par2EnumArmorMaterial, par3, EntityEquipmentSlot.FEET);
		this.material = par2EnumArmorMaterial;
		par2EnumArmorMaterial.getDamageReductionAmount(EntityEquipmentSlot.FEET);
		this.setMaxDamage(par2EnumArmorMaterial.getDurability(EntityEquipmentSlot.FEET));
		this.maxStackSize = 1;
		Rider=rider;
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
		return Refercence.MODID+":textures/armor/blank.png";

	}
	@SideOnly(Side.CLIENT)
	public boolean hasEffect(ItemStack par1ItemStack)
	{
			return !true;
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

				model_belt_plus armorModel = new model_belt_plus();


					armorModel.belt=stack;
			
				int form = this.get_core(stack);
				if(stack.getItem() == RiderItems.bladedriver)
				{
					if (form == 1){
						armorModel.wings=new ItemStack(RiderItems.blade_jack_wings);
					}else{
						armorModel.wings=new ItemStack(RiderItems.blanknoitem);
					}
				}
				else if(stack.getItem() == RiderItems.garrendriver)
				{
					if (form == 1){
						armorModel.wings=new ItemStack(RiderItems.garren_jack_wings);
					}else{
						armorModel.wings=new ItemStack(RiderItems.blanknoitem);
					}
				}
				

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

	
	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack armor) {


		if (player.getItemStackFromSlot(EntityEquipmentSlot.HEAD)!= null){
			if (player.getItemStackFromSlot(EntityEquipmentSlot.CHEST)!= null){
				if (player.getItemStackFromSlot(EntityEquipmentSlot.LEGS)!= null){
					if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET)!= null){
						if (player.getItemStackFromSlot(EntityEquipmentSlot.LEGS).getItem() == RiderItems.bladelegs){
							if (player.getItemStackFromSlot(EntityEquipmentSlot.CHEST).getItem() == RiderItems.bladetroso){
								if (player.getItemStackFromSlot(EntityEquipmentSlot.HEAD).getItem() == RiderItems.bladehead){				
									if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.bladedriver){

										if (this.get_core(armor)==0){
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 1,true,false));	
											player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 0,true,false));	
										}
										if (this.get_core(armor)==1){
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 2,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 0,true,false));	
											player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 1,true,false));	
											player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 0,true,false));	
											if (player.isSneaking()){
												player.fallDistance=0; 
												Vec3d look = player.getLookVec();
												player.motionX=look.x;
												player.motionY=look.y;
												player.motionZ=look.z;
											}
										}
										if (this.get_core(armor)==2){
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 4,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.SLOWNESS, 5, 0,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 3,true,false));	
											player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 5, 2,true,false));	
										}
									}
									
									if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.garrendriver){

										if (this.get_core(armor)==0){
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 0,true,false));	
											player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 1,true,false));
										}
										if (this.get_core(armor)==1){
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 1,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 0,true,false));	
											player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 2,true,false));	
											player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 0,true,false));
											if (player.isSneaking()){
												player.fallDistance=0; 
												Vec3d look = player.getLookVec();
												player.motionX=look.x;
												player.motionY=look.y;
												player.motionZ=look.z;
											}
										}
									}
									if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.leangle_belt){
										
										if (this.get_core(armor)==0){
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 1,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 1,true,false));
										}
									}
									if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.chalicerouzer){
										
										if (this.get_core(armor)==0){
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 2,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 1,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 1,true,false));
										}	
										if (this.get_core(armor)==3){
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 3,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 0,true,false));	
											player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 4,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 5, 0,true,false));	
										}
									}
									if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.glaive_buckle){
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 1,true,false));	
									}
									if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.lance_buckle){
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 1,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 5, 1,true,false));	
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 0,true,false));
									}
									if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.larc_buckle){
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 1,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 0,true,false));
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
	/**
	 * Returns the 'max damage' factor array for the armor, each piece of armor have a durability factor (that gets
	 * multiplied by armor material factor)
	 */
	static int[] getMaxDamageArray()
	{
		return maxDamageArray;
	}
}