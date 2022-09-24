package Kamen_Rider_Craft_4TH.item.ooo;

import javax.annotation.Nullable;

import org.lwjgl.opengl.GL11;
import Kamen_Rider_Craft_4TH.RiderItems;
import Kamen_Rider_Craft_4TH.ShowaRiderItems;
import Kamen_Rider_Craft_4TH.TokuCraft_core;
import Kamen_Rider_Craft_4TH.item.fourze.item_Fourzedriver;
import Kamen_Rider_Craft_4TH.item.rider_armor_base.Item_form_change;
import Kamen_Rider_Craft_4TH.item.rider_armor_base.item_rider_driver;
import Kamen_Rider_Craft_4TH.model.model_belt_plus;
import Kamen_Rider_Craft_4TH.model.model_belt_w;
import Kamen_Rider_Craft_4TH.potion.PotionCore;
import Kamen_Rider_Craft_4TH.util.IHasModel;
import Kamen_Rider_Craft_4TH.util.Refercence;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.block.model.ItemCameraTransforms;
import net.minecraft.client.renderer.block.model.ItemCameraTransforms.TransformType;
import net.minecraft.client.renderer.color.IItemColor;
import net.minecraft.client.renderer.entity.RenderEntityItem;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.item.EntityItemFrame;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityFireball;
import net.minecraft.entity.projectile.EntityLargeFireball;
import net.minecraft.init.MobEffects;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class item_OOOdriver extends item_rider_driver
{

	private static final int[] maxDamageArray = new int[] {11, 16, 15, 13};
	public String armorNamePrefix;
	public ArmorMaterial material;
	public String Rider;

	public item_OOOdriver (String name,ArmorMaterial par2EnumArmorMaterial, int par3, String rider)
	{
		super(name,par2EnumArmorMaterial,4,rider,(Item_form_change) RiderItems.keyfuestle,RiderItems.OOOhead, RiderItems.OOOtroso, RiderItems.OOOlegs, RiderItems.cellmedal);

		this.material = par2EnumArmorMaterial;
		par2EnumArmorMaterial.getDamageReductionAmount(EntityEquipmentSlot.FEET);
		this.setMaxDamage(par2EnumArmorMaterial.getDurability(EntityEquipmentSlot.FEET));

	}

	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack armor) {


		if (player.getItemStackFromSlot(EntityEquipmentSlot.HEAD)!= null){
			if (player.getItemStackFromSlot(EntityEquipmentSlot.CHEST)!= null){
				if (player.getItemStackFromSlot(EntityEquipmentSlot.LEGS)!= null){
					if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET)!= null){
						if (player.getItemStackFromSlot(EntityEquipmentSlot.LEGS).getItem() == RiderItems.OOOlegs){
							if (player.getItemStackFromSlot(EntityEquipmentSlot.CHEST).getItem() == RiderItems.OOOtroso){
								if (player.getItemStackFromSlot(EntityEquipmentSlot.HEAD).getItem() == RiderItems.OOOhead){
									if(item_OOOdriver.get_eftTime(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))<100){

										item_OOOdriver.set_eftTime(player.getItemStackFromSlot(EntityEquipmentSlot.FEET),item_OOOdriver.get_eftTime(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))+1);
									}
									if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.birth_driver||player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.birth_driver_prototype){
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 0,true,false));
										if (this.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), "birth1")==1){
											player.addPotionEffect(new PotionEffect(PotionCore.FLY_POTION, 5, 0,true,false));
										}
										if (this.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), "birth2")==1){
											player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 3,true,false));
										}	
										if (this.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), "birth3")==1){
											player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 2,true,false));
										}
										if (this.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), "birth4")==1){
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 2,true,false));
										}	
										if (this.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), "birth5")==1){
											player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 2,true,false));
										}	
										if (this.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), "birth6")==1){
											if (player.isSneaking()){
												if (item_OOOdriver.get_eftTime(player.getItemStackFromSlot(EntityEquipmentSlot.FEET)) > 99){

													Vec3d look = player.getLookVec();
													EntityFireball fireball = new EntityLargeFireball(world, player, 1, 1, 1);
													fireball.setPosition(
															player.posX + look.x * 1.6,
															player.posY + 1,
															player.posZ + look.z * 1.6);
													fireball.accelerationX = look.x * 0.1;
													fireball.accelerationY = look.y * 0.1;
													fireball.accelerationZ = look.z * 0.1;
													world.spawnEntity(fireball);
													item_OOOdriver.set_eftTime(player.getItemStackFromSlot(EntityEquipmentSlot.FEET),0);


												}
											}
										}	
										if (this.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), "birth7")==1){
											player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 250, 0,true,false));
										}
									}
									if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.birth_x_driver){
										player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 25,4,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 25,2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 25,6,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION,250, 0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 25,3,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 25,3,true,false));
									
									}
									if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.aqua_driver){
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 1,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.WATER_BREATHING, 5, 0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 0,true,false));
										if (player.isInWater()){
											if (player.isSneaking()){
												Vec3d look = player.getLookVec();
												player.motionX=look.x/2;
												player.motionY=look.y/2;
												player.motionZ=look.z/2;
											}
										}
									}
									if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.poseidon_driver){
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 3,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.WATER_BREATHING, 5, 0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE, 5, 0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.REGENERATION, 5, 1,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 0,true,false));
									}
									if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.core_driver){
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 1,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 3,true,false));
										player.addPotionEffect(new PotionEffect(PotionCore.FIRE_PUNCH_POTION, 5, 0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE, 5, 0,true,false));
										player.addPotionEffect(new PotionEffect(PotionCore.PUNCH_BOOST_POTION, 5, 4,true,false));
										player.addPotionEffect(new PotionEffect(PotionCore.BIG_POTION, 5, 0,true,false));
									}else if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.core_driver_power_up){
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 4,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 3,true,false));
										player.addPotionEffect(new PotionEffect(PotionCore.FIRE_PUNCH_POTION, 5, 0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE, 5, 0,true,false));
										player.addPotionEffect(new PotionEffect(PotionCore.PUNCH_BOOST_POTION, 5, 6,true,false));
										player.addPotionEffect(new PotionEffect(PotionCore.BIG_POTION, 5, 0,true,false));
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

				model_belt_plus armorModel = new model_belt_plus();

				Item[] Medel_head= new Item[] {RiderItems.taka_OOOdriver,RiderItems.kuwagata_OOOdriver,RiderItems.lion_OOOdriver,RiderItems.sai_OOOdriver,RiderItems.shachi_OOOdriver,RiderItems.ptera_OOOdriver,RiderItems.cobra_OOOdriver,RiderItems.super_taka_OOOdriver,RiderItems.love_OOOdriver,RiderItems.same_OOOdriver,RiderItems.shika_OOOdriver,RiderItems.seiuchi_OOOdriver,RiderItems.mukade_OOOdriver,RiderItems.sasori_new_OOOdriver,RiderItems.taka_OOOdriver,RiderItems.taka_OOOdriver,RiderItems.cobra_OOOdriver,RiderItems.taka_OOOdriver,RiderItems.taka_OOOdriver,RiderItems.taka_OOOdriver,RiderItems.mukade_OOOdriver};
				Item[] Medel_chest= new Item[] {RiderItems.tora_OOOdriver,RiderItems.kamakiri_OOOdriver,RiderItems.gorilla_OOOdriver,RiderItems.kujaku_OOOdriver,RiderItems.unagi_OOOdriver,RiderItems.tricera_OOOdriver,RiderItems.kame_OOOdriver,RiderItems.imagin_OOOdriver,RiderItems.panda_OOOdriver,RiderItems.super_tora_OOOdriver,RiderItems.kangaroo_OOOdriver,RiderItems.love2_OOOdriver,RiderItems.kujira_OOOdriver,RiderItems.gazelle_OOOdriver,RiderItems.shirokuma_OOOdriver,RiderItems.hachi_OOOdriver,RiderItems.kani_new_OOOdriver,RiderItems.yadokari_OOOdriver,RiderItems.tora_OOOdriver,RiderItems.gorilla_OOOdriver,RiderItems.kujaku_OOOdriver,RiderItems.tora_OOOdriver,RiderItems.tora_OOOdriver,RiderItems.hachi_OOOdriver};
				Item[] Medel_legs= new Item[] {RiderItems.batta_OOOdriver,RiderItems.cheetah_OOOdriver,RiderItems.zou_OOOdriver,RiderItems.condor_OOOdriver,RiderItems.tako_OOOdriver,RiderItems.tyranno_OOOdriver,RiderItems.wani_OOOdriver,RiderItems.shocker_OOOdriver,RiderItems.super_batta_OOOdriver,RiderItems.kangaroo2_OOOdriver,RiderItems.love3_OOOdriver,RiderItems.ookamiuo_OOOdriver,RiderItems.ushi_OOOdriver,RiderItems.penguin_OOOdriver,RiderItems.ari_OOOdriver,RiderItems.ebi_new_OOOdriver,RiderItems.batta_OOOdriver,RiderItems.ookamiuo_OOOdriver,RiderItems.condor_OOOdriver,RiderItems.batta_OOOdriver,RiderItems.batta_OOOdriver,RiderItems.ari_OOOdriver};

				armorModel.belt=stack;


				if(stack.getItem() == RiderItems.birth_driver)
				{	
					if (item_OOOdriver.get_core(stack,"birth1")==1){
						armorModel.wings=new ItemStack(RiderItems.cutter_wing);	
					}else{
						armorModel.wings=new ItemStack(ShowaRiderItems.blanknoitem);
					}	
				}
				if(stack.getItem() == RiderItems.OOOdriver)
				{	
					if (item_OOOdriver.get_core(stack,"1") == 0&item_OOOdriver.get_core(stack,"2") == 3&item_OOOdriver.get_core(stack,"3")==3){
						if(living.isSneaking() || (living instanceof EntityPlayer && (((EntityPlayer) living).capabilities.isFlying))){
							armorModel.wings=new ItemStack(RiderItems.tajador_wings);	
						}
					}if (item_OOOdriver.get_core(stack,"1") == 7&item_OOOdriver.get_core(stack,"2") == 9&item_OOOdriver.get_core(stack,"3")==8){
						if(living.isSneaking() || (living instanceof EntityPlayer && (((EntityPlayer) living).capabilities.isFlying))){
							armorModel.wings=new ItemStack(RiderItems.tajador_wings);	
						}
					}else if (item_OOOdriver.get_core(stack,"1") == 15&item_OOOdriver.get_core(stack,"2") == 3&item_OOOdriver.get_core(stack,"3")==3){
						if(living.isSneaking() || (living instanceof EntityPlayer && (((EntityPlayer) living).capabilities.isFlying))){
							armorModel.wings=new ItemStack(RiderItems.condor_wings);
						}else{
							armorModel.wings=new ItemStack(ShowaRiderItems.blanknoitem);
						}	

					}
					{
						armorModel.belt2=new ItemStack(Medel_head[item_OOOdriver.get_core(stack,"1")]);
						armorModel.belt3=new ItemStack(Medel_chest[item_OOOdriver.get_core(stack,"2")]);
						armorModel.belt4=new ItemStack(Medel_legs[item_OOOdriver.get_core(stack,"3")]);
					}
				}

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


	public static String get_claws_legs(ItemStack itemstack)
	{
		return itemstack.hasTagCompound() ? item_OOOdriver.get_core(itemstack,"birth2")==1 ? "birth_catepillar_leg" : "blank" : "blank";
	}

	public static String get_claws_l_arms(ItemStack itemstack)
	{
		return itemstack.hasTagCompound() ? item_OOOdriver.get_core(itemstack,"birth3")==1 ? item_OOOdriver.get_core(itemstack,"birth4")==1 ?"birth_crane_arm_drill_arm": "birth_crane_arm" : item_OOOdriver.get_core(itemstack,"birth4")==1 ?"birth_drill_arm": "blank" : "blank";
	}

	public static String get_claws_r_arms(ItemStack itemstack)
	{
		return itemstack.hasTagCompound() ? item_OOOdriver.get_core(itemstack,"birth5")==1 ? "birth_shovel_arm" : "blank" : "blank";
	}

	public static String get_claws_torso(ItemStack itemstack)
	{
		return itemstack.hasTagCompound() ? item_OOOdriver.get_core(itemstack,"birth6")==1 ? "birth_breast_cannon" : "blank" : "blank";
	}

	public static String get_claws_eyes(ItemStack itemstack)
	{
		return itemstack.hasTagCompound() ? item_OOOdriver.get_core(itemstack,"birth7")==1 ? "_eyes" : "_1" : "_1";
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

	public  boolean rendModle(Entity entity, int num)
	{
			return true;
	} 

	public  String getTexture(Entity entity, int num,String ext)
	{
		if (entity instanceof EntityLivingBase){
			EntityLivingBase player = ((EntityLivingBase)entity);
			if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET)!= null){
				if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem()instanceof item_rider_driver){
					item_rider_driver belt =((item_rider_driver)player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem());
					String rider = ((item_rider_driver)player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem()).Rider;

					if (num==1||num==13){

						if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.OOOdriver){
							if (   item_OOOdriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET),"1")==0&& item_OOOdriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET),"2")==3& item_OOOdriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET),"3")==3)
							{
								return Refercence.MODID+":textures/armor/"+"ooo_"+ "super_taka"+".png";
							}else {
								return Refercence.MODID+":textures/armor/"+"ooo_"+ Itemmedal.CoreName1[item_OOOdriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET),"1")] +".png";
							}
						}						
						else if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() instanceof item_OOOdriver){

							if (rider=="birth"||rider=="birth_prototype"){
								if(num==13){
									return Refercence.MODID+":textures/armor/"+item_OOOdriver.get_claws_torso(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))+".png";	

								}else{
									return Refercence.MODID+":textures/armor/"+rider+item_OOOdriver.get_claws_eyes(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))+".png";
								}
							}else{
								return Refercence.MODID+":textures/armor/"+rider+"_1.png";
							}
						}			

					}else if (num==2||num==5||num==7){
						if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.OOOdriver){
							return Refercence.MODID+":textures/armor/"+"ooo_"+ Itemmedal.CoreName2[item_OOOdriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET),"2")] +ext;
						}	
						else if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() instanceof item_OOOdriver){
							return Refercence.MODID+":textures/armor/"+rider+"_2" +".png";

						}

					}else if (num==3||num==6||num==8){
						if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.OOOdriver){
							return Refercence.MODID+":textures/armor/"+"ooo_"+ Itemmedal.CoreName3[item_OOOdriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET),"3")] +ext;
						}	
						else if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() instanceof item_OOOdriver){
							return Refercence.MODID+":textures/armor/"+rider+"_3" +".png";

						}

					}else if (num==10||num==11){
						if (rider=="birth"||rider=="birth_prototype"){
							return Refercence.MODID+":textures/armor/"+item_OOOdriver.get_claws_legs(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))+".png";
						}else{
							return Refercence.MODID+":textures/armor/blank"+ext;
						}
					}

					else if (num==9){
						if (rider=="birth"||rider=="birth_prototype"){
							return Refercence.MODID+":textures/armor/"+item_OOOdriver.get_claws_l_arms(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))+".png";	
						}else{
							return Refercence.MODID+":textures/armor/blank"+ext;
						}
					} else if (num==4){
						if (rider=="birth"||rider=="birth_prototype"){
							return Refercence.MODID+":textures/armor/"+item_OOOdriver.get_claws_r_arms(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))+".png";	
						}else{
							return Refercence.MODID+":textures/armor/blank"+ext;
						}
					}
					else{
						return Refercence.MODID+":textures/armor/blank"+ext;

					}
				}else{
					return Refercence.MODID+":textures/armor/blank"+ext;
				}
			}else{
				return Refercence.MODID+":textures/armor/blank"+ext;
			}

		}
		return Refercence.MODID+":textures/armor/blank"+ext;

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