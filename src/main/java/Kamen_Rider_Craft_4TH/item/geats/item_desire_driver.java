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
import Kamen_Rider_Craft_4TH.model.Model_Beroba;
import Kamen_Rider_Craft_4TH.model.Model_Kyuun;
import Kamen_Rider_Craft_4TH.model.Model_breaking_mammoth;
import Kamen_Rider_Craft_4TH.model.Model_kekera;
import Kamen_Rider_Craft_4TH.model.Model_ziin;
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



	public static final String[] CoreName= new String[] {"entry","magnum","boost","hammer","water","arrow","shield","revice","zombie","demons","chain_array","claw","zero_one"
			,"live","jeanne","ninja","propeller","drill","monster","beat","jet","cannon","gigant_container","poweredbuilder","jyamato","ichigo","v3","black","kuuga","agito"
			,"ryuki","faiz","blade","hibiki","kabuto","den_o","kiva","decade","w","ooo","fourze","wizard","gaim","drive","ghost","ex_aid","build","zi_o","saber","boost_markii"
			,"laserboost","ouja"};

	public static final String[] FormName= new String[] {"","","_raising","_boost_markii","_laserboost","","","","","","","","",""};

	public static final String[] GmName= new String[] {"","gm","gm_chirami","","","","","","","","",""};



	public boolean CanFever = false;
	public boolean BaseBody = false;
	
	public String armorNamePrefix;
	public ArmorMaterial material;

	public String Rider;
	public int DRIVER;

	public String deform = "entry";


	public item_desire_driver (String name,ArmorMaterial par2EnumArmorMaterial, int par3, String rider, int driver)
	{
		super(name,par2EnumArmorMaterial,4,rider,(Item_form_change) RiderItems.keyfuestle,ReiwaRiderItems.geatshead, ReiwaRiderItems.geatstroso, ReiwaRiderItems.geatslegs,ReiwaRiderItems.blank_rider_core_id);
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

	public item_desire_driver SetDefaultForm(String form)
	{
		deform=form;
		return this;
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
				
				if (stack.getItem()==ReiwaRiderItems.raise_riser_belt_kekera){
					armorModel = new 	Model_kekera();
				}else if (stack.getItem()==ReiwaRiderItems.raise_riser_belt_beroba){
					armorModel = new 	Model_Beroba();
				}else if (stack.getItem()==ReiwaRiderItems.raise_riser_belt_kyuun){
					armorModel = new 	Model_Kyuun();
				}else if (stack.getItem()==ReiwaRiderItems.raise_riser_belt_ziin){
					armorModel = new 	Model_ziin();
				}else{
				}
				
				ItemStack belt=stack;
				
				
				
				if (belt.getItem()==ReiwaRiderItems.raise_riser_belt_beroba||belt.getItem()==ReiwaRiderItems.raise_riser_belt_kekera||belt.getItem()==ReiwaRiderItems.raise_riser_belt_kyuun){
					belt= new ItemStack(ShowaRiderItems.blanknoitem);
				}
				ItemStack belt2= new ItemStack(ReiwaRiderItems.desire_driver_parts);
				
				if (get_lock(stack, "l")==24&get_lock(stack, "r")==24){
					set_lock(belt2,"part",0);
				}else	if (get_lock(stack, "f")==2&get_lock(stack, "l")==0){
					set_lock(belt2,"part",20);
				}else	if (get_lock(stack, "f")==1){
					set_lock(belt2,"part",100);
				}else{
				set_lock(belt2,"part",get_lock(stack, "l"));
				}
				
				armorModel.belt2=belt2;
				
				ItemStack belt3= new ItemStack(ReiwaRiderItems.desire_driver_parts_r);
		
				if (get_lock(stack, "f2")==1){
					set_lock(belt3,"part",100);
				}else{
				set_lock(belt3,"part",get_lock(stack, "r"));
				}
				
				armorModel.belt3=belt3;
				
				armorModel.belt=belt;
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

	public item_desire_driver AddCanFever()
	{
		CanFever=true;
		return this;
	}
	
	public item_desire_driver AddBaseBody()
	{
		BaseBody=true;
		return this;
	}
	
	public boolean is_fever (ItemStack itemstack)
	{
		String forml = get_lockbase(itemstack, "l");
		String formr = get_lockbase(itemstack,"r");
		if (forml==formr&get_lock(itemstack,"f")==1){
			return true;
		}else{
		return false;
		}
	}
	
	public static String is_Cracked (ItemStack itemstack)
	{
		if (get_lock(itemstack,"c")==1){
			return "_jyamato";
		}else{
		return "";
		}
	}
	
	public static String is_Hacked (ItemStack itemstack)
	{
			return GmName[get_lock(itemstack,"h")];
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
		if (((item_desire_driver)itemstack.getItem()).DRIVER == 1){
			return((item_desire_driver)itemstack.getItem()).Rider;
		}
		
		return itemstack.hasTagCompound() ? itemstack.getTagCompound().getInteger("seed"+string)!=0? CoreName[itemstack.getTagCompound().getInteger("seed"+string)]: ((item_desire_driver)itemstack.getItem()).deform :  ((item_desire_driver)itemstack.getItem()).deform;
	}

	public static int get_lock(ItemStack itemstack,String string)
	{	
		return itemstack.hasTagCompound() ? itemstack.getTagCompound().getInteger("seed"+string)!=0? itemstack.getTagCompound().getInteger("seed"+string): 0 : 0;
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
									String formF = FormName[get_lock(player.getItemStackFromSlot(EntityEquipmentSlot.FEET),"f")];
									
									boolean fever = is_fever(player.getItemStackFromSlot(EntityEquipmentSlot.FEET));
									
									if (formF=="_raising"){
										player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 5,1,true,false));
										player.addPotionEffect(new PotionEffect(PotionCore.SLASH_POTION, 5, 3,true,false));
									}
									
									if (fever){	
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5,1,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5,1,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5,0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5,1,true,false));
									}
									
									if ( Rider == "geats"){	
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5,0,true,false));
									}else if ( Rider == "tycoon"){	
										player.addPotionEffect(new PotionEffect(MobEffects.LUCK, 5,0,true,false));
									}else if ( Rider == "na_go"){	
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5,0,true,false));
									}else if ( Rider == "buffa"){	
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5,0,true,false));
									}else if ( Rider == "shirowe"){	
										player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 250,0,true,false));
									}else if ( Rider == "da_paan"){	
										player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 250,0,true,false));
									}else if ( Rider == "mary"){	
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5,0,true,false));
									}else if ( Rider == "ginpen"){	
										player.addPotionEffect(new PotionEffect(MobEffects.WATER_BREATHING, 50,0,true,false));
									}else if ( Rider == "beroba"){	
										player.setInvisible(true);
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 25,2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 25,2,true,false));
										player.addPotionEffect(new PotionEffect(PotionCore.BIG_POTION, 1, 0,true,false));
								}else if ( Rider == "kekera"){	
									player.setInvisible(true);
									player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 25,2,true,false));
									player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 25,2,true,false));
							}else if ( Rider == "kyuun"){	
								player.setInvisible(true);
								player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 25,2,true,false));
								player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 25,2,true,false));
						}
									
									if ( formL=="magnum"||formR=="magnum"){	
										player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 250,0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5,0,true,false));

									}if ( formL=="boost"||formR=="boost"){	
										player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 5,2,true,false));
										player.addPotionEffect(new PotionEffect(PotionCore.BOOST_POTION, 5, 0,true,false));

									}if ( formL=="hammer"||formR=="hammer"){	
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5,0,true,false));
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
										player.addPotionEffect(new PotionEffect(PotionCore.ANTIPOISON_POTION, 25, 0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5,2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 1,true,false));

									}if ( formL=="demons"||formR=="demons"){	
										player.addPotionEffect(new PotionEffect(MobEffects.POISON, 5, 0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 1,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5,2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 1,true,false));

									}if ( formL=="chain_array"||formR=="chain_array"){	

									}
									if ( formL=="claw"||formR=="claw"){	

									}
									if ( formL=="zero_one"||formR=="zero_one"){	
										player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 25,3,true,false));
									}
									if ( formL=="live"||formR=="live"){	
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5,0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5,0,true,false));
									}
									if ( formL=="jeanne"||formR=="jeanne"){	
										player.addPotionEffect(new PotionEffect(PotionCore.PUNCH_BOOST_POTION, 5, 5,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 1,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 1,true,false));
										player.addPotionEffect(new PotionEffect(PotionCore.ANTIPOISON_POTION, 5,0,true,false));
									}
									if ( formL=="ninja"||formR=="ninja"){	
										player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 5,6,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 1,true,false));
									}
									if ( formL=="propeller"||formR=="propeller"){	
										if (player.inventory.hasItemStack(new ItemStack(ReiwaRiderItems.raise_propeller))){

											player.addPotionEffect(new PotionEffect(PotionCore.FLY_POTION, 5, 0,true,false));
										}

										player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 5,4,true,false));

									}
									if ( formL=="drill"||formR=="drill"){	
										player.addPotionEffect(new PotionEffect(PotionCore.PUNCH_BOOST_POTION, 5, 4,true,false));
									}
									if ( formL=="monster"||formR=="monster"){	
										player.addPotionEffect(new PotionEffect(PotionCore.PUNCH_BOOST_POTION, 5, 6,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 1,true,false));
									}
									if ( formL=="beat"||formR=="beat"){	
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 1,true,false));
									}
									if ( formL=="jet"||formR=="jet"){	
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 3,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 25,3,true,false));
										if ( formL=="jet"){
											player.addPotionEffect(new PotionEffect(PotionCore.FLY_POTION, 5,0,true,false));
										}
										if ( formL=="cannon"){
											player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 2,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5,2,true,false));
										}
									}
									
									if ( formL=="gigant_container"||formR=="gigant_container"){	
										player.addPotionEffect(new PotionEffect(PotionCore.SLASH_POTION, 5, 3,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 1,true,false));
									}
									if ( formL=="poweredbuilder"||formR=="poweredbuilder"){	
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 2,true,false));
									}
									if ( formL=="jyamato"||formR=="jyamato"){	
										player.addPotionEffect(new PotionEffect(MobEffects.WITHER, 5, 0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 3,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 3,true,false));
									}
									if ( formL=="ichigo"||formR=="ichigo"){	
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 20, 1,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED,20, 1,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST,20, 2,true,false));
										player.addPotionEffect(new PotionEffect(PotionCore.PUNCH_BOOST_POTION, 20, 4,true,false));
									}
									if ( formL=="v3"||formR=="v3"){	
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH,20, 1,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE,20, 1,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED,20, 1,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST,20, 2,true,false));
										player.addPotionEffect(new PotionEffect(PotionCore.PUNCH_BOOST_POTION, 5, 4,true,false));
										
									}
									if ( formL=="black"||formR=="black"){	
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 20, 1,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE,20, 1,true,false));
										player.addPotionEffect(new PotionEffect(PotionCore.PUNCH_BOOST_POTION, 20, 4,true,false));	
									}
									if ( formL=="kuuga"||formR=="kuuga"){	
										player.addPotionEffect(new PotionEffect(PotionCore.PUNCH_BOOST_POTION, 5, 4,true,false));
									}
									if ( formL=="agito"||formR=="agito"){	
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 0,true,false));	
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 0,true,false));
									}
									if ( formL=="ryuki"||formR=="ryuki"){	
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 0,true,false));	
										player.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE, 5, 0,true,false));	
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 0,true,false));	
									}
									if ( formL=="faiz"||formR=="faiz"){	
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 1,true,false));	
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 0,true,false));	
										player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 5, 0,true,false));	
									}
									if ( formL=="blade"||formR=="blade"){	
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 1,true,false));	
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 0,true,false));	
									}
									if ( formL=="hibiki"||formR=="hibiki"){	
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 1,true,false));	
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 0,true,false));	
									}
									if ( formL=="kabuto"||formR=="kabuto"){	
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 3,true,false));	
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 3,true,false));	
									}
									if ( formL=="den_o"||formR=="den_o"){	
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 1,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 0,true,false));
									}
									if ( formL=="kiva"||formR=="kiva"){	
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 0,true,false));	
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 0,true,false));	
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 0,true,false));	
									}
									if ( formL=="decade"||formR=="decade"){	
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 1,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 0,true,false));
									}
									if ( formL=="w"||formR=="w"){	
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 1,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 5, 0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 1,true,false));
									}
									if ( formL=="ooo"||formR=="ooo"){	
										player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 250,0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 25,1,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 25,2,true,false));
									}
									if ( formL=="fourze"||formR=="fourze"){	
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 5, 1,true,false));
										player.addPotionEffect(new PotionEffect(PotionCore.BOOST_POTION, 5, 0,true,false));
									}
									if ( formL=="wizard"||formR=="wizard"){	
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE, 5, 0,true,false));
									}
									if ( formL=="gaim"||formR=="gaim"){	
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 0,true,false));
									}
									if ( formL=="drive"||formR=="drive"){	
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 1,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 1,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 0,true,false));
									}
									if ( formL=="ghost"||formR=="ghost"){	
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.INVISIBILITY, 5, 0,true,false));
									}
									if ( formL=="ex_aid"||formR=="ex_aid"){	
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 0,true,false));
									}
									if ( formL=="build"||formR=="build"){	
										player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 5, 2,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 0,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 0,true,false));
									}
									if ( formL=="zi_o"||formR=="zi_o"){	
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 1,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 0,true,false));		
									}
									if ( formL=="saber"||formR=="saber"){	
										player.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE, 5, 0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 0,true,false));
									}
									if ( formL=="ouja"||formR=="ouja"){	
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 2,true,false));	
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 0,true,false));	
									}
									if ( formL=="boost_markii"||formR=="boost_markii"){	
									}
									if ( formL=="laserboost"||formR=="laserboost"){	
									}

								}
							}
						}
					}
				}
			}
		}
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

					if (belt==ReiwaRiderItems.raise_riser_belt_beroba||belt==ReiwaRiderItems.raise_riser_belt_kekera||belt==ReiwaRiderItems.raise_riser_belt_kyuun){
						return Refercence.MODID+":textures/armor/blank.png";
					}else{
					
					if (forml=="poweredbuilder"&rider=="seeker"){
						forml="poweredbuilder_seeker";
					}
					if (formr=="poweredbuilder"&rider=="seeker"){
						formr="poweredbuilder_seeker";
					}
					
					if (is_fever(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))&CanFever){
						rider=((item_rider_driver)player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem()).Rider+"_fever";
					}
					
					if (num==12||num==13){
						if (get_lock(player.getItemStackFromSlot(EntityEquipmentSlot.FEET),"h")!=0){
						return Refercence.MODID+":textures/armor/"+is_Hacked(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))+"_base_over.png";
						}
						else{
						return Refercence.MODID+":textures/armor/"+rider+is_Cracked(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))+FormName[get_lock(player.getItemStackFromSlot(EntityEquipmentSlot.FEET),"f")]+"_base_over.png";
						}
					}else 	if (num==2||num==5||num==3||num==6||num==8){
						if (BaseBody) {
							return Refercence.MODID+":textures/armor/geats_rider_base"+ext;
						} else {
							return Refercence.MODID+":textures/armor/"+rider+is_Cracked(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))+FormName[get_lock(player.getItemStackFromSlot(EntityEquipmentSlot.FEET),"f")]+"_rider_base"+ext;
						}
						
					}else 	if (num==1||num==4||num==9||num==7){
						return Refercence.MODID+":textures/armor/geats_rider_"+forml+ext;

					}else 	if (num==10||num==11){
						return Refercence.MODID+":textures/armor/geats_rider_"+formr+ext;

					}else if (num==7||num==14){


						return "blank";


					} else{

					}
					}
				}else{
					return "blank";
				}
			}else{
				return "blank";
			}

		}
		return "blank";

	}




}








