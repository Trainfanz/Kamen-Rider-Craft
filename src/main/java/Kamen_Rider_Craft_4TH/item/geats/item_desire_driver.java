package Kamen_Rider_Craft_4TH.item.geats;

import javax.annotation.Nullable;

import Kamen_Rider_Craft_4TH.ReiwaRiderItems;
import Kamen_Rider_Craft_4TH.RiderBlocks;
import Kamen_Rider_Craft_4TH.RiderItems;
import Kamen_Rider_Craft_4TH.ShowaRiderItems;
import Kamen_Rider_Craft_4TH.Tabs;
import Kamen_Rider_Craft_4TH.TokuCraft_core;
import Kamen_Rider_Craft_4TH.item.ooo.item_OOOdriver;
import Kamen_Rider_Craft_4TH.item.revice.Item_Vistamps;
import Kamen_Rider_Craft_4TH.item.revice.item_revicedriver;
import Kamen_Rider_Craft_4TH.item.rider_armor_base.Item_form_change;
import Kamen_Rider_Craft_4TH.item.rider_armor_base.item_rider_driver;
import Kamen_Rider_Craft_4TH.item.zero_one.Item_progrise_keys;
import Kamen_Rider_Craft_4TH.item.zero_one.item_zero_onedriver;
import Kamen_Rider_Craft_4TH.model.Model_breaking_mammoth;
import Kamen_Rider_Craft_4TH.model.model_belt_plus;
import Kamen_Rider_Craft_4TH.potion.PotionCore;
import Kamen_Rider_Craft_4TH.util.IHasModel;
import Kamen_Rider_Craft_4TH.util.Refercence;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.IItemPropertyGetter;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class item_desire_driver extends item_rider_driver
{

	
	
	public static final String[] CoreName= new String[] {"entry","magnum","boost","hammer","water","arrow","shield","revice","zombie","demons","",""};
	
	
	private static final int[] maxDamageArray = new int[] {11, 16, 15, 13};
	public String armorNamePrefix;
	public ArmorMaterial material;

	public String Rider;
	public int DRIVER;



	public item_desire_driver (String name,ArmorMaterial par2EnumArmorMaterial, int par3, String rider, int driver)
	{
		super(name,par2EnumArmorMaterial,4,rider,(Item_form_change) RiderItems.keyfuestle,ReiwaRiderItems.geatshead, ReiwaRiderItems.geatstroso, ReiwaRiderItems.geatslegs,ReiwaRiderItems.proto_vistamp);
		this.material = par2EnumArmorMaterial;
		par2EnumArmorMaterial.getDamageReductionAmount(EntityEquipmentSlot.FEET);
		this.setMaxDamage(par2EnumArmorMaterial.getDurability(EntityEquipmentSlot.FEET));
		this.maxStackSize = 1;
		Rider=rider;
		DRIVER = driver;
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
				
				armorModel.isSneak = defaultModel.isSneak;
				armorModel.isRiding = defaultModel.isRiding;
				armorModel.isChild = defaultModel.isChild;

				armorModel.swingProgress = living.swingProgress;
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
	
	public static String get_lockbase(ItemStack itemstack,String string)
	{	

		return itemstack.hasTagCompound() ? itemstack.getTagCompound().getInteger("seed"+string)!=0? CoreName[itemstack.getTagCompound().getInteger("seed"+string)]: "entry" : "entry";
	}

	public static int get_lock(ItemStack itemstack)
	{	
		return itemstack.hasTagCompound() ? itemstack.getTagCompound().getInteger("seed")!=0? itemstack.getTagCompound().getInteger("seed"): 0 : 0;
	}
	
	public static void set_lock(ItemStack itemstack,String string,int flag)
	{
		if (!itemstack.hasTagCompound())
		{
			itemstack.setTagCompound(new NBTTagCompound());
		}
		itemstack.getTagCompound().setInteger("seed"+string, flag);
	}

	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack armor) {


		if (player.getItemStackFromSlot(EntityEquipmentSlot.HEAD)!= null){
			if (player.getItemStackFromSlot(EntityEquipmentSlot.CHEST)!= null){
				if (player.getItemStackFromSlot(EntityEquipmentSlot.LEGS)!= null){
					if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET)!= null){
						if (player.getItemStackFromSlot(EntityEquipmentSlot.LEGS).getItem() == ReiwaRiderItems.geatslegs){
							if (player.getItemStackFromSlot(EntityEquipmentSlot.CHEST).getItem() == ReiwaRiderItems.geatstroso){
								if (player.getItemStackFromSlot(EntityEquipmentSlot.HEAD).getItem() == ReiwaRiderItems.geatshead){	

									String formL = get_lockbase(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), "l");
									String formR = get_lockbase(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), "r");
									
									if ( Rider == "geats"){	
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 250,0,true,false));
									}else if ( Rider == "tycoon"){	
										player.addPotionEffect(new PotionEffect(MobEffects.LUCK, 5,0,true,false));
									}else if ( Rider == "na_go"){	
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 250,0,true,false));
									}else if ( Rider == "buffa"){	
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 250,0,true,false));
									}else if ( Rider == "shirowe"){	
										player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 250,0,true,false));
									}else if ( Rider == "da_paan"){	
										player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 250,0,true,false));
									}else if ( Rider == "mary"){	
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 250,0,true,false));
									}else if ( Rider == "ginpen"){	
										player.addPotionEffect(new PotionEffect(MobEffects.WATER_BREATHING, 250,0,true,false));
									}
										
									if ( formL=="magnum"||formR=="magnum"){	
										player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 250,0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 250,0,true,false));
										
									}if ( formL=="boost"||formR=="boost"){	
										player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 250,2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 250,0,true,false));
										
									}if ( formL=="hammer"||formR=="hammer"){	
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 250,0,true,false));
									}if ( formL=="water"||formR=="water"){	
										player.addPotionEffect(new PotionEffect(MobEffects.WATER_BREATHING, 250,0,true,false));
									}if ( formL=="arrow"||formR=="arrow"){	
										player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 250,0,true,false));
									}if ( formL=="shield"||formR=="shield"){	
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 1,true,false));
										
									}if ( formL=="revice"||formR=="revice"){	
										player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 5,0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5,0,true,false));
										
									}if ( formL=="zombie"||formR=="zombie"){	
										player.addPotionEffect(new PotionEffect(PotionCore.ANTIPOISON_POTION, 25, 8,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5,2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 1,true,false));
								
									}if ( formL=="demons"||formR=="demons"){	
										player.addPotionEffect(new PotionEffect(MobEffects.POISON, 5, 0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 1,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5,2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 1,true,false));
								
									}
								}
							}
						}
					}
				}
			}
		}
	}

	public  boolean rendModle(Entity entity, int num)
	{
		if (num==2||num==5||num==7||num==1||num==3||num==6||num==8){
			return true;
		}else if (entity instanceof EntityLivingBase){
			EntityLivingBase player = ((EntityLivingBase)entity);
			if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET)!= null){
				if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem()instanceof item_rider_driver){
					item_rider_driver belt =((item_rider_driver)player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem());
					String rider = ((item_rider_driver)player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem()).Rider;

					 if (num==4||num==9||num==10||num==11||num==12||num==13||num==14){

						return true;
					} else{
						return false;

					}
				
				}else{
					return false;
				}
			}else{
				return false;
			}

		}
		return false;

	}
	
	
	public  String getTexture(Entity entity, int num,String ext)
	{
		if (entity instanceof EntityLivingBase){
			EntityLivingBase player = ((EntityLivingBase)entity);
			if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET)!= null){
				if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem()instanceof item_rider_driver){
					item_rider_driver belt =((item_rider_driver)player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem());
					String rider = ((item_rider_driver)player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem()).Rider;

					String forml = get_lockbase(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), "l");
					String formr = get_lockbase(player.getItemStackFromSlot(EntityEquipmentSlot.FEET),"r");
					
					if (num==12||num==13){
						return Refercence.MODID+":textures/armor/"+rider+"_base_over.png";
					}else 	if (num==2||num==5||num==3||num==6||num==8){
						return Refercence.MODID+":textures/armor/"+rider+"_rider_base"+ext;
					}else 	if (num==1||num==4||num==9||num==7){
						return Refercence.MODID+":textures/armor/geats_rider_"+forml+ext;
		
					}else 	if (num==10||num==11){
						return Refercence.MODID+":textures/armor/geats_rider_"+formr+ext;
						
					}else if (num==7||num==14){
	

						return Refercence.MODID+":textures/armor/blank"+ext;
					
						
					} else{
					

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

	


}








