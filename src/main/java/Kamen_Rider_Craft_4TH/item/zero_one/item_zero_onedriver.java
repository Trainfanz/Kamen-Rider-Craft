package Kamen_Rider_Craft_4TH.item.zero_one;

import javax.annotation.Nullable;

import Kamen_Rider_Craft_4TH.RiderBlocks;
import Kamen_Rider_Craft_4TH.RiderItems;
import Kamen_Rider_Craft_4TH.ShowaRiderItems;
import Kamen_Rider_Craft_4TH.ReiwaRiderItems;
import Kamen_Rider_Craft_4TH.Tabs;
import Kamen_Rider_Craft_4TH.TokuCraft_core;
import Kamen_Rider_Craft_4TH.item.ooo.item_OOOdriver;
import Kamen_Rider_Craft_4TH.item.rider_armor_base.Item_form_change;
import Kamen_Rider_Craft_4TH.item.rider_armor_base.item_rider_driver;
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
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class item_zero_onedriver extends item_rider_driver
{
	public static final String[] CoreName= new String[] {"","_shining","_assault","_metalcluster","_zero_two","_rampage","_one","_red","_japanese","","_hell"};

	private static final int[] maxDamageArray = new int[] {11, 16, 15, 13};
	public String armorNamePrefix;
	public ArmorMaterial material;

	public String Rider;
	public int DRIVER;



	public item_zero_onedriver (String name,ArmorMaterial par2EnumArmorMaterial, int par3, String rider, int driver)
	{
		super(name,par2EnumArmorMaterial,4,rider,(Item_form_change) RiderItems.keyfuestle,ReiwaRiderItems.zero_onehead, ReiwaRiderItems.zero_onetroso, ReiwaRiderItems.zero_onelegs);
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

				model_belt_plus armorModel = new Model_breaking_mammoth();

				if( this==ReiwaRiderItems.hiden_zero_one_driver){
					if (this.get_core(stack, "1")==4){
						armorModel.belt=new ItemStack( ReiwaRiderItems.hiden_zero_two_driver);
					}else if (this.get_core(stack, "1")==7){
						armorModel.belt=new ItemStack( ReiwaRiderItems.hiden_zero_one_driver_red);
					}else{
						armorModel.belt=stack;
					}

				}


				else if( this==ReiwaRiderItems.ark_driver_zero){
					if (this.get_core(stack, "1")==6){
						armorModel.belt=new ItemStack( ReiwaRiderItems.ark_driver_one);
					}else{
						armorModel.belt=stack;
					}
				}

				else if(living.getHeldItemMainhand()!=null){
					if( living.getHeldItemMainhand().getItem()==ReiwaRiderItems.shot_riser_gun){
						if( this==ReiwaRiderItems.shot_riser_vulcan||this==ReiwaRiderItems.shot_riser_valkyrie){
							armorModel.belt=new ItemStack( ReiwaRiderItems.shot_riser_belt);
						}else{
							armorModel.belt=stack;
						}
					}
					else if( living.getHeldItemMainhand().getItem()==ReiwaRiderItems.zaia_slashriser_sword){
						if( this==ReiwaRiderItems.zaia_slashriser_jin){
							armorModel.belt=new ItemStack( ReiwaRiderItems.zaia_slashriser_belt);
						}else{
							armorModel.belt=stack;
						}
					}
					else if( living.getHeldItemMainhand().getItem()==ReiwaRiderItems.shot_abaddo_gun){
						if( this==ReiwaRiderItems.shot_abaddo_riser||this==ReiwaRiderItems.shot_abaddo_riser_b||this==ReiwaRiderItems.shot_abaddo_riser_g){
							armorModel.belt=new ItemStack( ReiwaRiderItems.abaddo_riser_belt);
						}else{
							armorModel.belt=stack;
						}
					}
					else if( living.getHeldItemMainhand().getItem()==ReiwaRiderItems.slash_abaddo_sword){
						if( this==ReiwaRiderItems.slash_abaddo_riser||this==ReiwaRiderItems.slash_abaddo_riser_o||this==ReiwaRiderItems.slash_abaddo_riser_r){
							armorModel.belt=new ItemStack( ReiwaRiderItems.abaddo_riser_belt);
						}else{
							armorModel.belt=stack;
						}
					}
					else{
						armorModel.belt=stack;
					}
				}	

				if (this==ReiwaRiderItems.hiden_zero_one_driver&this.get_core(stack, "1")==9){
					armorModel.wings=new ItemStack( ReiwaRiderItems.realize_hopper_lines);
				}else{
					armorModel.wings=new ItemStack( ShowaRiderItems.blanknoitem);
				}
				//armorModel.belt2=new ItemStack(form_watch[item_zero_onedriver.get_core(stack,"1")]);	
				//armorModel.belt3=new ItemStack(armor_watch[item_zero_onedriver.get_locknum(stack)]);


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


	public static String get_lockbase(ItemStack itemstack)
	{	

		return itemstack.hasTagCompound() ? itemstack.getTagCompound().getInteger("seed")!=0? Item_progrise_keys.ARMS[itemstack.getTagCompound().getInteger("seed")]: "base" : "base";
	}


	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack armor) {


		if (player.getItemStackFromSlot(EntityEquipmentSlot.HEAD)!= null){
			if (player.getItemStackFromSlot(EntityEquipmentSlot.CHEST)!= null){
				if (player.getItemStackFromSlot(EntityEquipmentSlot.LEGS)!= null){
					if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET)!= null){
						if (player.getItemStackFromSlot(EntityEquipmentSlot.LEGS).getItem() == ReiwaRiderItems.zero_onelegs){
							if (player.getItemStackFromSlot(EntityEquipmentSlot.CHEST).getItem() == ReiwaRiderItems.zero_onetroso){
								if (player.getItemStackFromSlot(EntityEquipmentSlot.HEAD).getItem() == ReiwaRiderItems.zero_onehead){	


									if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == ReiwaRiderItems.ark_driver_zero){
										player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 25,1,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 25,1,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 25,2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 25,4,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 250,0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 25,0,true,false));
									}
									else if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == ReiwaRiderItems.zaia_slashriser_jin){
										player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 25,3,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 25,2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 25,2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 25,2,true,false));
										player.addPotionEffect(new PotionEffect(PotionCore.FLY_POTION, 5, 0,true,false));
									}
									else if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == ReiwaRiderItems.forceriser_naki){
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 25,1,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 25,2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 25,3,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 25,2,true,false));
									}
									else if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == ReiwaRiderItems.hiden_zero_one_driver_azu || player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == ReiwaRiderItems.zetsumetsu_driver)
									{
										player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 25,4,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 25,4,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 25,4,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 25,4,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 25,3,true,false));
									}
									else if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == ReiwaRiderItems.eden_driver){
										player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 25,3,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 25,2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 25,3,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 25,4,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 250,0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 25,2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.REGENERATION, 25,2,true,false));
									}
									else if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == ReiwaRiderItems.lucifer_driver){
										player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 25,3,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 25,3,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 25,4,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 25,4,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 250,0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 25,2,true,false));
									}
									else if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == ReiwaRiderItems.metsuboujinrai_driver)
									{
										player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 25,4,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 25,5,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 25,5,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 25,4,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 25,4,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 250,0,true,false));
										player.addPotionEffect(new PotionEffect(PotionCore.ANTIPOISON_POTION, 25, 0,true,false));
									}
									else if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == ReiwaRiderItems.shot_abaddo_riser||player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == ReiwaRiderItems.slash_abaddo_riser)
									{
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 25, 0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 25,2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 25,1,true,false));
									}
									else if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == ReiwaRiderItems.shot_abaddo_riser_g||player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == ReiwaRiderItems.shot_abaddo_riser_b||player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == ReiwaRiderItems.slash_abaddo_riser_r||player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == ReiwaRiderItems.slash_abaddo_riser_o)
									{
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 25, 1,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 25,3,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 25,2,true,false));
									}
									else if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == ReiwaRiderItems.raidriser_battle){
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 25,4,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 25,2,true,false));
									}
									else if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == ReiwaRiderItems.raidriser_buffalo){
										if (player.isSneaking()){
											Vec3d look = player.getLookVec();
											player.motionX=look.x/2;
											player.motionZ=look.z/2;
										}
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 25,1,true,false));
									}
									else if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == ReiwaRiderItems.raidriser_jackal){
										player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 25,3,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 25,2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 25,2,true,false));
									}
									else if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == ReiwaRiderItems.raidriser_lion){
										player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 25,1,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 25,2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 25,2,true,false));
									}
									else if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == ReiwaRiderItems.raidriser_panda){
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 25,2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 250,0,true,false));
									}
									else if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == ReiwaRiderItems.raidriser_penguin){
										player.addPotionEffect(new PotionEffect(MobEffects.WATER_BREATHING, 5, 0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 25,1,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 25,1,true,false));
									}
									else if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == ReiwaRiderItems.raidriser_whale){
										if (player.isInWater()){
											if (player.isSneaking()){
												Vec3d look = player.getLookVec();
												player.motionX=look.x/4;
												player.motionY=look.y/4;
												player.motionZ=look.z/4;
											}}
										player.addPotionEffect(new PotionEffect(MobEffects.WATER_BREATHING, 5, 0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 25,1,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 25,1,true,false));
									}

									String form = Item_progrise_keys.ARMS[DRIVER];
									int base = item_zero_onedriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), "1");

									if (item_zero_onedriver.get_lockbase(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))!="base") {
										form = item_zero_onedriver.get_lockbase(player.getItemStackFromSlot(EntityEquipmentSlot.FEET));
									}

									if (base==1){
										player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 25,5,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 25,1,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 25,1,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 25,1,true,false));

									}else if (base==2){
										player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 25,6,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 25,1,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 25,2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 25,4,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 250,0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 25,0,true,false));

									}else if (base==3){
										player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 25,6,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 25,2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 25,3,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 25,4,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 250,0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 25,2,true,false));

									}else if (base==4){
										player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 25,6,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 25,4,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 25,4,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 25,4,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 250,0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 25,3,true,false));
										player.addPotionEffect(new PotionEffect(PotionCore.PUNCH_BOOST_POTION, 25, 8,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE, 25,0,true,false));

									}else if (base==5){
										player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 25,4,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 25,4,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 25,4,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 25,4,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 250,0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 25,2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE, 25,0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.WATER_BREATHING, 25,0,true,false));

									}else if (base==6){
										player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 25,4,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 25,4,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 25,4,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 25,4,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 25,3,true,false));

									}else if (base==8){
										player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 25,6,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 25,2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 25,3,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 25,4,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 250,0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 25,3,true,false));

									}else if (base==9){
										player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 25,4,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 25,4,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 25,4,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 25,4,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 250,0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 25,2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE, 25,0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.WATER_BREATHING, 25,0,true,false));

									}else if (base==10){
										player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 25,5,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 25,4,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 25,4,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 25,4,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 250,0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 25,2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE, 25,0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.WATER_BREATHING, 25,0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.REGENERATION, 25,2,true,false));
									}

									if (form=="falcon"){
										player.addPotionEffect(new PotionEffect(PotionCore.FLY_POTION, 5, 0,true,false));

									}else if (form=="shark"){
										if (player.isInWater()){
											if (player.isSneaking()){
												Vec3d look = player.getLookVec();
												player.motionX=look.x/2;
												player.motionY=look.y/2;
												player.motionZ=look.z/2;
											}}
										player.addPotionEffect(new PotionEffect(MobEffects.WATER_BREATHING, 5, 0,true,false));
									}
									else if (form=="wolf"){
										player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 250,0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 25,0,true,false));
									}
									else if (form=="cheetah"){
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 25,2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 25,0,true,false));
									}
									else if (form=="kong"){
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 25,1,true,false));
										player.addPotionEffect(new PotionEffect(PotionCore.PUNCH_BOOST_POTION, 25, 4,true,false));
									}
									else if (form=="tiger"){
										player.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE, 25,0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 25,0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 25,0,true,false));
									}
									else if (form=="bear"){
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 25,1,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 25,0,true,false));
									}
									else if (form=="hornet"){
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 25,2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 25,0,true,false));
										player.addPotionEffect(new PotionEffect(PotionCore.FLY_POTION, 5, 0,true,false));
									}
									else if (form=="scorpion"){	
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 25,1,true,false));
										player.addPotionEffect(new PotionEffect(PotionCore.ANTIPOISON_POTION, 25, 0,true,false));
									}
									else if (form=="giraffe"){	
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 25,1,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 250,0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 25,1,true,false));

									}
									else if (form=="hercules"){	
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 25,1,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 25,1,true,false));

									}
									else if (form=="hedgehog"){	
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 25,2,true,false));

									}
									else if (form=="kangaroo"){	
										player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 25,3,true,false));
										player.addPotionEffect(new PotionEffect(PotionCore.PUNCH_BOOST_POTION, 25, 6,true,false));
									}
									else if (form=="buffalo"){	
										if (player.isSneaking()){
											Vec3d look = player.getLookVec();
											player.motionX=look.x/2;
											player.motionZ=look.z/2;
										}
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 25,1,true,false));
									}
									else if (form=="stag"){	
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 25,1,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 25,1,true,false));

									}
									else if (form=="spider"){	
										player.addPotionEffect(new PotionEffect(PotionCore.ANTIPOISON_POTION, 25, 0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 25,2,true,false));
									}
									else if (form=="penguin"){	
										player.addPotionEffect(new PotionEffect(MobEffects.WATER_BREATHING, 5, 0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 25,1,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 25,1,true,false));
									}
									else if (form=="hopper"){	
										player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 25,3,true,false));
									}
									else if (form=="dodo"){	
										player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 25,3,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 25,1,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 25,2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 25,1,true,false));

									}
									else if (form=="caucasus"){	
										player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 25,1,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 25,1,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 25,2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 25,1,true,false));

									}
									else if (form=="whale"){	
										if (player.isInWater()){
											if (player.isSneaking()){
												Vec3d look = player.getLookVec();
												player.motionX=look.x/4;
												player.motionY=look.y/4;
												player.motionZ=look.z/4;
											}}
										player.addPotionEffect(new PotionEffect(MobEffects.WATER_BREATHING, 5, 0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 25,1,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 25,1,true,false));

									}
									else if (form=="mammoth"){

										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 25,2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 25,2,true,false));
										player.addPotionEffect(new PotionEffect(PotionCore.BIG_POTION, 1, 0,true,false));
									}
									else if (form=="caucasus"){	
										player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 25,1,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 25,1,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 25,2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 25,1,true,false));

									}
									else if (form=="lion"){	
										player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 25,1,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 25,2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 25,2,true,false));

									}	
									else if (form=="panda"){	
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 25,2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 250,0,true,false));

									}	
									else if (form=="burning_falcon"){	
										player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 25,3,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 25,2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 25,2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 25,2,true,false));
										player.addPotionEffect(new PotionEffect(PotionCore.FLY_POTION, 5, 0,true,false));

									}	
									else if (form=="horseshoe_crab"){	
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 25,4,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 25,2,true,false));

									}
									else if (form=="jackal"){	
										player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 25,3,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 25,2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 25,2,true,false));
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

					if (num==1||num==2||num==5||num==7||num==3||num==6||num==8){
						if (item_zero_onedriver.get_lockbase(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))=="mammoth"){
							return Refercence.MODID+":textures/armor/blank.png";
						}else{
							return Refercence.MODID+":textures/armor/"+rider+CoreName[item_zero_onedriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), "1")]+ext;	
						}	
					}else if (num==4||num==9||num==10||num==11||num==12||num==13||num==14){

						String form;
						if (item_zero_onedriver.get_lockbase(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))!="base"){
							form = item_zero_onedriver.get_lockbase(player.getItemStackFromSlot(EntityEquipmentSlot.FEET));
						}else{
							form = Item_progrise_keys.ARMS[((item_zero_onedriver)player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem()).DRIVER];
						}

						return Refercence.MODID+":textures/armor/"+rider+CoreName[item_zero_onedriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), "1")]+"_" +form+ext;


					} else{
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

	public static void set_lock(ItemStack itemstack,int flag)
	{
		if (!itemstack.hasTagCompound())
		{
			itemstack.setTagCompound(new NBTTagCompound());
		}
		itemstack.getTagCompound().setInteger("seed", flag);
	}

	public boolean getIsRepairable(ItemStack toRepair, ItemStack repair) 
	{
		return ReiwaRiderItems.hiden_metal == repair.getItem() ? true : super.getIsRepairable(toRepair, repair);
	}
}








