package Kamen_Rider_Craft_4TH.item.zi_o;

import javax.annotation.Nullable;

import Kamen_Rider_Craft_4TH.ReiwaRiderItems;
import Kamen_Rider_Craft_4TH.RiderItems;
import Kamen_Rider_Craft_4TH.ShowaRiderItems;
import Kamen_Rider_Craft_4TH.TokuCraft_core;
import Kamen_Rider_Craft_4TH.miscellaneousRiderItems;
import Kamen_Rider_Craft_4TH.item.ooo.item_OOOdriver;
import Kamen_Rider_Craft_4TH.item.revice.Item_Vistamps;
import Kamen_Rider_Craft_4TH.item.revice.item_revicedriver;
import Kamen_Rider_Craft_4TH.item.rider_armor_base.Item_form_change;
import Kamen_Rider_Craft_4TH.item.rider_armor_base.item_rider_driver;
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

public class item_zikudriver extends item_rider_driver
{

	public static final String[] CoreName= new String[] {"","_decade","_ii","_revive","_trinity","_grand","_bibiru","_ohma","_majesty","_woz"};

	private static final int[] maxDamageArray = new int[] {11, 16, 15, 13};
	public String armorNamePrefix;
	public ArmorMaterial material;

	public String Rider;
	public int DRIVER;



	public item_zikudriver (String name,ArmorMaterial par2EnumArmorMaterial, int par3, String rider, int driver)
	{
		super(name,par2EnumArmorMaterial,4,rider,(Item_form_change) RiderItems.keyfuestle,RiderItems.zi_ohead, RiderItems.zi_otroso, RiderItems.zi_olegs, RiderItems.blank_watch);
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

				Item[] form_watch= new Item[] {ShowaRiderItems.blanknoitem,miscellaneousRiderItems.ziku_driver_decade,miscellaneousRiderItems.ziku_driver_zi_o_ii,ShowaRiderItems.blanknoitem,miscellaneousRiderItems.ziku_driver_zi_o_trinity,miscellaneousRiderItems.ziku_driver_zi_o_grand,miscellaneousRiderItems.ziku_driver_bibiru_geiz,miscellaneousRiderItems.ziku_driver_zio_ohma,miscellaneousRiderItems.ziku_driver_majesty,miscellaneousRiderItems.ziku_driver_woz};
				Item[] armor_watch= new Item[] {ShowaRiderItems.blanknoitem,miscellaneousRiderItems.ziku_driver_build,miscellaneousRiderItems.ziku_driver_exaid,miscellaneousRiderItems.ziku_driver_ghost,
						miscellaneousRiderItems.ziku_driver_drive,miscellaneousRiderItems.ziku_driver_gaim,miscellaneousRiderItems.ziku_driver_wizard,miscellaneousRiderItems.ziku_driver_fourze,miscellaneousRiderItems.ziku_driver_ooo
						,miscellaneousRiderItems.ziku_driver_w,ShowaRiderItems.blanknoitem,miscellaneousRiderItems.ziku_driver_deno,miscellaneousRiderItems.ziku_driver_kabuto,miscellaneousRiderItems.ziku_driver_hibiki,
						miscellaneousRiderItems.ziku_driver_blade,miscellaneousRiderItems.ziku_driver_faiz,miscellaneousRiderItems.ziku_driver_ryuki,miscellaneousRiderItems.ziku_driver_agito,miscellaneousRiderItems.ziku_driver_kuuga
						,miscellaneousRiderItems.ziku_driver_genm,ShowaRiderItems.blanknoitem,miscellaneousRiderItems.ziku_driver_exaid,ShowaRiderItems.blanknoitem,ShowaRiderItems.blanknoitem,
						ShowaRiderItems.blanknoitem,miscellaneousRiderItems.ziku_driver_geizrevive,miscellaneousRiderItems.ziku_driver_geizrevive,ShowaRiderItems.blanknoitem,ShowaRiderItems.blanknoitem
						,ShowaRiderItems.blanknoitem,miscellaneousRiderItems.ziku_driver_saber};
				
				
				armorModel.belt=stack;
				
				if (item_zikudriver.get_lockbase(stack)=="gaim"){
                    armorModel.wings=new ItemStack(RiderItems.gaim_armor_wings);
				}else if(stack.getItem() == RiderItems.oma_ziku_driver) {
					armorModel.wings=new ItemStack(miscellaneousRiderItems.oma_zi_o_cape);
                }else{
                	  armorModel.wings=new ItemStack(ShowaRiderItems.blanknoitem);
                }
					
						armorModel.belt=stack;
						armorModel.belt2=new ItemStack(form_watch[item_zikudriver.get_core(stack,"1")]);	
						armorModel.belt3=new ItemStack(armor_watch[item_zikudriver.get_locknum(stack)]);
					

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
	public static int get_locknum(ItemStack itemstack)
    {
        return itemstack.hasTagCompound() ? itemstack.getTagCompound().getInteger("seed") : 0;
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
	
	public static String get_lock(ItemStack itemstack)
	{	
		
		return itemstack.hasTagCompound() ? ((item_zikudriver)itemstack.getItem()).Rider+"_"+Item_ridewatches.ARMS[itemstack.getTagCompound().getInteger("seed")] : ((item_zikudriver)itemstack.getItem()).Rider+"_base";
	}
	public static String get_lockbase(ItemStack itemstack)
	{	
		
		return itemstack.hasTagCompound() ? Item_ridewatches.ARMS[itemstack.getTagCompound().getInteger("seed")] : "base";
	}
	

	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack armor) {


		if (player.getItemStackFromSlot(EntityEquipmentSlot.HEAD)!= null){
			if (player.getItemStackFromSlot(EntityEquipmentSlot.CHEST)!= null){
				if (player.getItemStackFromSlot(EntityEquipmentSlot.LEGS)!= null){
					if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET)!= null){
						if (player.getItemStackFromSlot(EntityEquipmentSlot.LEGS).getItem() == RiderItems.zi_olegs){
							if (player.getItemStackFromSlot(EntityEquipmentSlot.CHEST).getItem() == RiderItems.zi_otroso){
								if (player.getItemStackFromSlot(EntityEquipmentSlot.HEAD).getItem() == RiderItems.zi_ohead){		
									
									if(item_OOOdriver.get_eftTime(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))<100){

										item_OOOdriver.set_eftTime(player.getItemStackFromSlot(EntityEquipmentSlot.FEET),item_OOOdriver.get_eftTime(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))+1);
									}
									if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() instanceof item_zikudriver){

										if (item_zikudriver.get_core(armor, "1")==0){
											
										if (item_zikudriver.get_lockbase(armor)=="build"){
											player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 1,true,false));											
											player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 5, 2,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 2,true,false));
										}else  if (item_zikudriver.get_lockbase(armor)=="exaid"){
											player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 1,true,false));											
											player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 1,true,false));
											if (player.getHeldItemMainhand().isEmpty())
											{
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 4,true,false));
											}
										}else  if (item_zikudriver.get_lockbase(armor)=="ghost"){
											player.fallDistance=0; 																				
											player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 5, 1,true,false));	
											player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 2,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 2,true,false));
										}else  if (item_zikudriver.get_lockbase(armor)=="drive"){
											if (item_OOOdriver.get_eftTime(player.getItemStackFromSlot(EntityEquipmentSlot.FEET)) > 45){
												if (player.isSneaking()){

													Vec3d look = player.getLookVec();
													player.motionX=look.x*3;
													player.motionY=look.y;
													player.motionZ=look.z*3;
													item_OOOdriver.set_eftTime(player.getItemStackFromSlot(EntityEquipmentSlot.FEET),0);

												}}
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 1,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 2,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 3,true,false));
										}else  if (item_zikudriver.get_lockbase(armor)=="wizard"){											
											player.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE, 5, 0,true,false));	
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 2,true,false));																					
											player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 2,true,false));
										}else  if (item_zikudriver.get_lockbase(armor)=="fourze"){			
											player.addPotionEffect(new PotionEffect(PotionCore.BOOST_POTION, 5, 1,true,false));																											
											if (player.getHeldItemMainhand().isEmpty())
											{
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 4,true,false));
											}
											player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 5, 2,true,false));
										}else  if (item_zikudriver.get_lockbase(armor)=="ooo"){											
											player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 250, 0,true,false));	
											player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 5, 2,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 2,true,false));
										}else  if (item_zikudriver.get_lockbase(armor)=="faiz"){
											player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 1,true,false));																						
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 2,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 250, 0,true,false));		
										}else  if (item_zikudriver.get_lockbase(armor)=="ryuki"){
											player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 2,true,false));																						
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 2,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE, 5, 0,true,false));	
										}else  if (item_zikudriver.get_lockbase(armor)=="genm"){
											player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 2,true,false));											
											player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 1,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 1,true,false));
										}else  if (item_zikudriver.get_lockbase(armor)=="kabuto"){
											player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 3,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 3,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 1,true,false));	
											player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 1,true,false));	
										}else  if (item_zikudriver.get_lockbase(armor)=="hibiki"){
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 2,true,false));	
											player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 1,true,false));	
											player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 1,true,false));	
										}else  if (item_zikudriver.get_lockbase(armor)=="deno"){
											player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 2,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 1,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 5, 1,true,false));
										}else  if (item_zikudriver.get_lockbase(armor)=="kiva"){
											player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 250, 0,true,false));	
											player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 2,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 2,true,false));	
										}else  if (item_zikudriver.get_lockbase(armor)=="blade"){
											player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 1,true,false));	
											player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 1,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 1,true,false));	
										}else  if (item_zikudriver.get_lockbase(armor)=="gaim"){
											player.addPotionEffect(new PotionEffect(MobEffects.SATURATION, 5, 5,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 2,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 1,true,false));	
										}else  if (item_zikudriver.get_lockbase(armor)=="agito"){
											player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 1,true,false));	
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 1,true,false));	
											player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 2,true,false));	
										}else  if (item_zikudriver.get_lockbase(armor)=="kuuga"){
											if (player.getHeldItemMainhand().isEmpty())
											{
												player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 3,true,false));
											}
											player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 1,true,false));	
											player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 2,true,false));
										}else  if (item_zikudriver.get_lockbase(armor)=="w"){
											player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 5, 1,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 1,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 2,true,false));	
										}else  if (item_zikudriver.get_lockbase(armor)=="shinobi"){
											player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 5, 2,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 3,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 1,true,false));	
										
										}
										}else if (item_zikudriver.get_core(armor, "1")==1){
											if (item_zikudriver.get_lockbase(armor)=="build"){
												player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 2,true,false));
												player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 1,true,false));
												player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 2,true,false));
												player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 5, 2,true,false));
											}else if (item_zikudriver.get_lockbase(armor)=="exaid"){
												player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 3,true,false));
												player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 1,true,false));
												player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 2,true,false));
												player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 2,true,false));
											}else if (item_zikudriver.get_lockbase(armor)=="exaid_w"){
												player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 2,true,false));
												player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 2,true,false));
												player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 2,true,false));
												player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 2,true,false));
											}else if (item_zikudriver.get_lockbase(armor)=="ghost"){
												player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 1,true,false));
												player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 1,true,false));
												player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 3,true,false));
												player.addPotionEffect(new PotionEffect(MobEffects.INVISIBILITY, 5, 0,true,false));
											}else if (item_zikudriver.get_lockbase(armor)=="ooo"){
												player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 1,true,false));
												player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 1,true,false));
												player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 2,true,false));
												player.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE, 5, 0,true,false));
											}else if (item_zikudriver.get_lockbase(armor)=="faiz"){
												player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 1,true,false));
												player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 1,true,false));
												player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 4,true,false));
												player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 250, 0,true,false));		
											}else if (item_zikudriver.get_lockbase(armor)=="decade"){
												player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 2,true,false));
												player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 1,true,false));
												player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 2,true,false));
												player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 2,true,false));
											}
										}else if (item_zikudriver.get_core(armor, "1")==2){
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 3,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 1,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 3,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 2,true,false));

										}else if (item_zikudriver.get_core(armor, "1")==3){
										if (item_zikudriver.get_lockbase(armor)=="goretsu"){
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 3,true,false));	
											player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 1,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 0,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.HUNGER, 5, 1,true,false));		
										}else  if (item_zikudriver.get_lockbase(armor)=="shippu"){
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 0,true,false));	
											player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 0,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 4,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.HUNGER, 5, 1,true,false));	

											}
										}else if (item_zikudriver.get_core(armor, "1")==4){
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 4,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 2,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 2,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 2,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 250, 0,true,false));	
											
										}else if (item_zikudriver.get_core(armor, "1")==5){
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 3,true,false));	
											player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 3,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 3,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.REGENERATION, 5, 1,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 3,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 250, 0,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE, 5, 0,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.WATER_BREATHING, 5, 0,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.SATURATION, 5, 0,true,false));
											}
									}
										
									
									if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.ziku_driver_zi_o){
										
										if (item_zikudriver.get_core(armor, "1")==0){
											player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 1,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 0,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 0,true,false));										
										}
									}
									else if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.ziku_driver_geiz){
											
											if (item_zikudriver.get_core(armor, "1")==0){											
												player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 0,true,false));
												player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 0,true,false));
												player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 1,true,false));		
										}
									}else if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.oma_ziku_driver){
										
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 8,true,false));	
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 8,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 8,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.REGENERATION, 5, 3,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 5,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 250, 0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE, 5, 0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.WATER_BREATHING, 5, 0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.SATURATION, 5, 0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 5, 8,true,false));
										player.addPotionEffect(new PotionEffect(PotionCore.FLY_POTION, 5, 0,true,false));
										
									}
									else if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.beyondriver){
										
										if (item_zikudriver.get_core(armor, "1")==0){											
											player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 2,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 1,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 2,true,false));		
										}
									}
									else if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.shinobi_driver){
										
										if (item_zikudriver.get_core(armor, "1")==0){											
											player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 3,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 1,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 1,true,false));	
											if (item_OOOdriver.get_eftTime(player.getItemStackFromSlot(EntityEquipmentSlot.FEET)) > 45){
												if (player.isSneaking()){

													Vec3d look = player.getLookVec();
													player.motionX=look.x*3;
													player.motionY=look.y;
													player.motionZ=look.z*3;
													item_OOOdriver.set_eftTime(player.getItemStackFromSlot(EntityEquipmentSlot.FEET),0);

												}}
										}
									}
									else if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.quiz_driver){
										
										if (item_zikudriver.get_core(armor, "1")==0){											
											player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 1,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 1,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 2,true,false));		
										}
									}
									else if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.kikai_driver){
										
										if (item_zikudriver.get_core(armor, "1")==0){											
											player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 0,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 2,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 2,true,false));		
										}
									}
									else if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.ziku_driver_zi_o_mirror){
										
										if (item_zikudriver.get_core(armor, "1")==0){											
											player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 1,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 0,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 0,true,false));		
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

	
	public  String getTexture(Entity entity, int num,String ext)
	{
		if (entity instanceof EntityLivingBase){
			EntityLivingBase player = ((EntityLivingBase)entity);
			if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET)!= null){
				if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem()instanceof item_rider_driver){
					item_rider_driver belt =((item_rider_driver)player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem());
					String rider = ((item_rider_driver)player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem()).Rider;

					String form = item_revicedriver.get_lockbase(player.getItemStackFromSlot(EntityEquipmentSlot.FEET));
					
					 if (num==1||num==2||num==5||num==7||num==3||num==6||num==8){
						
					
						if (item_zikudriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), "1")==1){
							return Refercence.MODID+":textures/armor/"+rider+CoreName[item_zikudriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), "1")]+"_"+item_zikudriver.get_lockbase(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))+ext;
							}else{
								return Refercence.MODID+":textures/armor/"+rider+CoreName[item_zikudriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), "1")]+ext;	
							}
						
					}else if (num==4||num==9||num==10||num==11||num==12||num==13||num==14){


						if (item_zikudriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), "1")==1){

							return Refercence.MODID+":textures/armor/"+item_zikudriver.get_lock(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))+"_decade_ver"+ext;

						}else{

							return Refercence.MODID+":textures/armor/"+rider+CoreName[item_zikudriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), "1")]+"_" +item_zikudriver.get_lockbase(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))+ext;
						}
					} else{
						return "blank";

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
	
	public static void set_lock(ItemStack itemstack,int flag)
	{
		if (!itemstack.hasTagCompound())
		{
			itemstack.setTagCompound(new NBTTagCompound());
		}
		itemstack.getTagCompound().setInteger("seed", flag);
	}
}








