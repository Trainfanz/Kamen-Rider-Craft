package Kamen_Rider_Craft_4TH.item.Ichigo;

import javax.annotation.Nullable;

import org.lwjgl.opengl.GL11;

import Kamen_Rider_Craft_4TH.RiderItems;
import Kamen_Rider_Craft_4TH.TokuCraft_core;
import Kamen_Rider_Craft_4TH.model.model_belt;
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
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

public class item_Ichigodriver extends ItemArmor implements IHasModel
{


	private static final int[] maxDamageArray = new int[] {11, 16, 15, 13};
	public String armorNamePrefix;
	public ArmorMaterial material;

	public String Rider;


	public item_Ichigodriver (String name,ArmorMaterial par2EnumArmorMaterial, int par3, String rider)
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
	@SideOnly(Side.CLIENT)
	@Nullable
	public ModelBiped getArmorModel(EntityLivingBase living, ItemStack stack, EntityEquipmentSlot slot, ModelBiped defaultModel)
	{
		if(!stack.isEmpty())
		{
			if(stack.getItem() instanceof ItemArmor)
			{
				model_belt armorModel = new model_belt();
				if (stack.getItem()==RiderItems.sunriser){
					if (this.get_core(stack)==1){
						armorModel.belt=new ItemStack(RiderItems.sunriser_rr);
					}else if (this.get_core(stack)==2){
						armorModel.belt=new ItemStack(RiderItems.sunriser_br);
					}else{
						armorModel.belt=stack;
					}
				}else{
					armorModel.belt=stack;
				}
				
				if (stack.getItem()!= RiderItems.zo_core & stack.getItem()!= RiderItems.grasshopper_dna & stack.getItem()!= RiderItems.j_spirit){
					armorModel.belt=stack;
					}else
					{
						armorModel.belt=new ItemStack( RiderItems.blanknoitem);
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
						if (player.getItemStackFromSlot(EntityEquipmentSlot.LEGS).getItem() == RiderItems.ichigolegs){
							if (player.getItemStackFromSlot(EntityEquipmentSlot.CHEST).getItem() == RiderItems.ichigotroso){
								if (player.getItemStackFromSlot(EntityEquipmentSlot.HEAD).getItem() == RiderItems.ichigohead){

									if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.typhoon_ichigo){

										if (this.get_core(armor)==0){
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 20, 1,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.SPEED,20, 1,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST,20, 2,true,false));
											player.addPotionEffect(new PotionEffect(PotionCore.PUNCH_BOOST_POTION, 20, 4,true,false));
										}
									}
									if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.typhoon_nigo){

										if (this.get_core(armor)==0){
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH,20, 1,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE,20, 1,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST,20, 2,true,false));
											player.addPotionEffect(new PotionEffect(PotionCore.PUNCH_BOOST_POTION, 5, 3,true,false));
										}
									}
									if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.new_typhoon){

										if (this.get_core(armor)==0){
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 20, 1,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.SPEED,20, 2,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST,20, 3,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE,20, 1,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE,20, 0,true,false));
											player.addPotionEffect(new PotionEffect(PotionCore.PUNCH_BOOST_POTION, 5, 4,true,false));
										}
									}
									if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.double_typhoon){

										if (this.get_core(armor)==0){

											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH,20, 1,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE,20, 1,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.SPEED,20, 1,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST,20, 2,true,false));	
											player.addPotionEffect(new PotionEffect(PotionCore.PUNCH_BOOST_POTION, 5, 4,true,false));
										}
									}
									if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.riderman_belt){

										if (this.get_core(armor)==0){
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH,20, 1,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.REGENERATION,20, 0,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.HASTE,20, 1,true,false));
											player.addPotionEffect(new PotionEffect(PotionCore.PUNCH_BOOST_POTION, 5, 3,true,false));
										}
									}
									if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.ridol){

										if (this.get_core(armor)==0){											
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH,20, 1,true,false));											
											player.addPotionEffect(new PotionEffect(MobEffects.WATER_BREATHING,20, 0,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE,20, 0,true,false));
										}
									}
									if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.condorer){

										if (this.get_core(armor)==0){	
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH,20, 1,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.SPEED,20, 2,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST,20, 1,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.REGENERATION,20, 1,true,false));
											player.addPotionEffect(new PotionEffect(PotionCore.PUNCH_BOOST_POTION, 5, 4,true,false));
										}
									}
									if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.electrer){

										if (this.get_core(armor)==0){	
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH,20, 1,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.SPEED,20, 0,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST,20, 0,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE,20, 0,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE,20, 0,true,false));
											player.addPotionEffect(new PotionEffect(PotionCore.PUNCH_BOOST_POTION, 5, 4,true,false));
										}								
									}
									if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.tornado){

										if (this.get_core(armor)==0){	
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH,20, 1,true,false));							
											player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE,20, 2,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.SPEED,20, 1,true,false));
											player.fallDistance=0;
											player.addPotionEffect(new PotionEffect(PotionCore.FLY_POTION, 5, 4,true,false));
											player.addPotionEffect(new PotionEffect(PotionCore.PUNCH_BOOST_POTION, 5, 4,true,false));
											}								
										}
									if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.cyclode){

										if (this.get_core(armor)==0){	
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH,20, 1,true,false));																						
											player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST,20, 1,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE,20, 0,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE,20, 1,true,false));
											player.addPotionEffect(new PotionEffect(PotionCore.PUNCH_BOOST_POTION, 5, 4,true,false));
										}								
									}									
								if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.zx_belt){
									if (this.get_core(armor)==0){	
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH,20, 1,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED,20, 0,true,false));											
										player.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE,20, 0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE,20, 0,true,false));
										player.addPotionEffect(new PotionEffect(PotionCore.PUNCH_BOOST_POTION, 5, 4,true,false));
									}								
								}
								if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.king_stone){

									if (this.get_core(armor)==0){	
										if (player.getHeldItemMainhand().isEmpty())
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH,20, 1,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE,20, 0,true,false));	
										player.addPotionEffect(new PotionEffect(PotionCore.PUNCH_BOOST_POTION, 5, 4,true,false));
									}								
								}
								if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.sunriser){

									if (this.get_core(armor)==0){	
										if (player.getHeldItemMainhand().isEmpty())
									
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH,20, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED,20, 0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE,20, 1,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE,20, 0,true,false));	
										player.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE,20, 0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION,20, 0,true,false));
									}								
								}
								if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.zo_core){

									if (this.get_core(armor)==0){

										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 20, 1,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED,20, 1,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST,20, 2,true,false));
										player.addPotionEffect(new PotionEffect(PotionCore.PUNCH_BOOST_POTION, 5, 4,true,false));
									}
								}
								if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.j_spirit){

									if (this.get_core(armor)==0){
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 20, 1,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED,20, 1,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST,20, 2,true,false));
										player.addPotionEffect(new PotionEffect(PotionCore.PUNCH_BOOST_POTION, 5, 4,true,false));
										player.addPotionEffect(new PotionEffect(PotionCore.BIG_POTION, 5, 4,true,false));
									}
								}
								if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.grasshopper_dna){

									if (this.get_core(armor)==0){
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 20, 1,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED,20, 1,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST,20, 2,true,false));
										player.addPotionEffect(new PotionEffect(PotionCore.PUNCH_BOOST_POTION, 5, 4,true,false));
									}
								}


								if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.typhoon_shocker_rider_1){

									if (this.get_core(armor)==0){
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH,20, 1,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE,20, 0,true,false));	
										player.addPotionEffect(new PotionEffect(PotionCore.PUNCH_BOOST_POTION, 5, 3,true,false));
									}
								}
								if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.typhoon_shocker_rider_2){

									if (this.get_core(armor)==0){
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH,20, 1,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE,20, 0,true,false));	
										player.addPotionEffect(new PotionEffect(PotionCore.PUNCH_BOOST_POTION, 5, 3,true,false));									
									}
								}
								if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.typhoon_shocker_rider_3){

									if (this.get_core(armor)==0){
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH,20, 1,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE,20, 0,true,false));	
										player.addPotionEffect(new PotionEffect(PotionCore.PUNCH_BOOST_POTION, 5, 3,true,false));								
									}
								}
								if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.typhoon_shocker_rider_4){

									if (this.get_core(armor)==0){
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH,20, 1,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE,20, 0,true,false));	
										player.addPotionEffect(new PotionEffect(PotionCore.PUNCH_BOOST_POTION, 5, 3,true,false));									
									}
								}
								if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.typhoon_shocker_rider_5){

									if (this.get_core(armor)==0){
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH,20, 1,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE,20, 0,true,false));	
										player.addPotionEffect(new PotionEffect(PotionCore.PUNCH_BOOST_POTION, 5, 3,true,false));
									}
								}	
								if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.typhoon_shocker_rider_6){

									if (this.get_core(armor)==0){
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH,20, 1,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE,20, 0,true,false));	
										player.addPotionEffect(new PotionEffect(PotionCore.PUNCH_BOOST_POTION, 5, 3,true,false));								
									}
								}
								if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.typhoon_shocker_rider_7){

									if (this.get_core(armor)==0){
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH,20, 1,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE,20, 0,true,false));	
										player.addPotionEffect(new PotionEffect(PotionCore.PUNCH_BOOST_POTION, 5, 3,true,false));									
									}
								}
								if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.typhoon_shocker_rider_8){

									if (this.get_core(armor)==0){
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH,20, 1,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE,20, 0,true,false));	
										player.addPotionEffect(new PotionEffect(PotionCore.PUNCH_BOOST_POTION, 5, 3,true,false));									
									}
								}
								if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.typhoon_shocker_rider_9){

									if (this.get_core(armor)==0){
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH,20, 1,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE,20, 0,true,false));	
										player.addPotionEffect(new PotionEffect(PotionCore.PUNCH_BOOST_POTION, 5, 3,true,false));										
									}
								}
								if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.typhoon_shocker_rider_10){

									if (this.get_core(armor)==0){
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH,20, 1,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE,20, 0,true,false));	
										player.addPotionEffect(new PotionEffect(PotionCore.PUNCH_BOOST_POTION, 5, 3,true,false));									
									}
								}
								if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.typhoon_shocker_rider_11){

									if (this.get_core(armor)==0){
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH,20, 1,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE,20, 0,true,false));	
										player.addPotionEffect(new PotionEffect(PotionCore.PUNCH_BOOST_POTION, 5, 3,true,false));									
									}
								}
								if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.typhoon_shocker_rider_12){

									if (this.get_core(armor)==0){
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH,20, 1,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE,20, 0,true,false));	
										player.addPotionEffect(new PotionEffect(PotionCore.PUNCH_BOOST_POTION, 5, 3,true,false));										
									}
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
	public void registerModels() {
		TokuCraft_core.proxy.registerItemRender(this,0,"inventory");
	}

	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, EntityEquipmentSlot slot, String type)
	{
		return Refercence.MODID+":textures/armor/blank.png";

	}
}