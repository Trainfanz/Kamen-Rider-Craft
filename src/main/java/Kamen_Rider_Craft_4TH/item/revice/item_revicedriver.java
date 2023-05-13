package Kamen_Rider_Craft_4TH.item.revice;

import javax.annotation.Nullable;

import Kamen_Rider_Craft_4TH.ReiwaRiderItems;
import Kamen_Rider_Craft_4TH.RiderBlocks;
import Kamen_Rider_Craft_4TH.RiderItems;
import Kamen_Rider_Craft_4TH.ShowaRiderItems;
import Kamen_Rider_Craft_4TH.Tabs;
import Kamen_Rider_Craft_4TH.TokuCraft_core;
import Kamen_Rider_Craft_4TH.item.ooo.item_OOOdriver;
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

public class item_revicedriver extends item_rider_driver
{

	public static final String[] CoreName= new String[] {"","_barid_rex","_volcano_rex","_jack_revice","_revice","_holy","_evilyty","_ultimate","_shin"};
	
	
	private static final int[] maxDamageArray = new int[] {11, 16, 15, 13};
	public String armorNamePrefix;
	public ArmorMaterial material;

	public String Rider;
	public int DRIVER;



	public item_revicedriver (String name,ArmorMaterial par2EnumArmorMaterial, int par3, String rider, int driver)
	{
		super(name,par2EnumArmorMaterial,4,rider,(Item_form_change) RiderItems.keyfuestle,ReiwaRiderItems.revicehead, ReiwaRiderItems.revicetroso, ReiwaRiderItems.revicelegs,ReiwaRiderItems.proto_vistamp);
		this.material = par2EnumArmorMaterial;
		par2EnumArmorMaterial.getDamageReductionAmount(EntityEquipmentSlot.FEET);
		this.setMaxDamage(par2EnumArmorMaterial.getDurability(EntityEquipmentSlot.FEET));
		this.maxStackSize = 1;
		Rider=rider;
		DRIVER = driver;
		
		
		  this.addPropertyOverride(new ResourceLocation("pull"), new IItemPropertyGetter()
	        {
	            @SideOnly(Side.CLIENT)
	            public float apply(ItemStack stack, @Nullable World worldIn, @Nullable EntityLivingBase entityIn)
	            {
	      		  if (stack.getItem()== ReiwaRiderItems.revice_driver||stack.getItem()== ReiwaRiderItems.libera_driver||stack.getItem()== ReiwaRiderItems.two_sidriver_evil||stack.getItem()== ReiwaRiderItems.two_sidriver_live){
	            	
	            	if (!stack.hasTagCompound())
	        		{
	            		return DRIVER;
	        		}else {
	            		return stack.getTagCompound().getInteger("seed");
					}
	      			
	            
	      		  }else{
	      			return 0;
	      		  }
	      		  }
	        });
		
        this.addPropertyOverride(new ResourceLocation("form"), new IItemPropertyGetter()
        {
            @SideOnly(Side.CLIENT)
            public float apply(ItemStack stack, @Nullable World worldIn, @Nullable EntityLivingBase entityIn)
            {
      		  if (stack.getItem()== ReiwaRiderItems.revice_driver||stack.getItem()== ReiwaRiderItems.vice_belt||stack.getItem()== ReiwaRiderItems.two_sidriver_live){
            	
            	if (!stack.hasTagCompound())
        		{
            		return 0;
        		}else {
            		return item_revicedriver.get_core(stack, "1");
				}
      			
            
      		  }else{
      			return 0;
      		  }
      		  }
        });
	
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

				
				if(living.getHeldItemMainhand()!=null)
				{
					if(living.getHeldItemMainhand().getItem()==ReiwaRiderItems.evil_blade)
					{
						if(this==ReiwaRiderItems.two_sidriver_evil)
						{
							armorModel.belt=new ItemStack(ReiwaRiderItems.two_sidriver);
						}
						else if(this==ReiwaRiderItems.two_sidriver_live&&item_revicedriver.get_core(stack, "1")==6)
						{
							armorModel.belt=new ItemStack(ReiwaRiderItems.two_sidriver);
						}
						else
						{
							armorModel.belt=stack;
						}
					}
					else if(living.getHeldItemMainhand().getItem()==ReiwaRiderItems.live_gun)
					{
						if(this==ReiwaRiderItems.two_sidriver_live)
						{
							armorModel.belt=new ItemStack(ReiwaRiderItems.two_sidriver);
						}
						else
						{
							armorModel.belt=stack;
						}
					}
					else
					{
						armorModel.belt=stack;
					}
				}
				
				String form = Item_Vistamps.ARMS[DRIVER];

				if (item_revicedriver.get_lockbase(stack)!="base") {
					form = item_revicedriver.get_lockbase(stack);
				}
				
				if (stack.getItem()==ReiwaRiderItems.over_demons_driver||stack.getItem()==ReiwaRiderItems.demons_driver){
					if(form=="condor"){
						armorModel.wings= new ItemStack(ReiwaRiderItems.demons_condor_wings);
					}if(form=="scorpion"){
						armorModel.wings= new ItemStack(ReiwaRiderItems.demons_scorpion_wings);
					}if(form=="full"){
						armorModel.wings= new ItemStack(ReiwaRiderItems.demons_condor_wings_scorpion);
					}
				}
				
				if (stack.getItem()==ReiwaRiderItems.vice_belt){
					if(form=="jackal"){
						armorModel.wings= new ItemStack(ReiwaRiderItems.vice_jackal_genome);
						armorModel.belt=new ItemStack(ShowaRiderItems.blanknoitem);
					}
				}
				
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

		return itemstack.hasTagCompound() ? itemstack.getTagCompound().getInteger("seed")!=0? Item_Vistamps.ARMS[itemstack.getTagCompound().getInteger("seed")]: "base" : "base";
	}


	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack armor) {


		if (player.getItemStackFromSlot(EntityEquipmentSlot.HEAD)!= null){
			if (player.getItemStackFromSlot(EntityEquipmentSlot.CHEST)!= null){
				if (player.getItemStackFromSlot(EntityEquipmentSlot.LEGS)!= null){
					if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET)!= null){
						if (player.getItemStackFromSlot(EntityEquipmentSlot.LEGS).getItem() == ReiwaRiderItems.revicelegs){
							if (player.getItemStackFromSlot(EntityEquipmentSlot.CHEST).getItem() == ReiwaRiderItems.revicetroso){
								if (player.getItemStackFromSlot(EntityEquipmentSlot.HEAD).getItem() == ReiwaRiderItems.revicehead){	

									String form = Item_Vistamps.ARMS[DRIVER];
									int base = item_revicedriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), "1");
									
									if (item_revicedriver.get_lockbase(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))!="base") {
										form = item_revicedriver.get_lockbase(player.getItemStackFromSlot(EntityEquipmentSlot.FEET));
									}
									
									if (form=="eagle"){
										player.addPotionEffect(new PotionEffect(PotionCore.FLY_POTION, 5, 0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 250,0,true,false));
									}else if (form=="mammoth"){
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5,1,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5,0,true,false));
									}else if (form=="megalodon"){
										if (player.isInWater()){
											if (player.isSneaking()){
											Vec3d look = player.getLookVec();
											player.motionX=look.x/2;
											player.motionY=look.y/2;
											player.motionZ=look.z/2;
										}}
										player.addPotionEffect(new PotionEffect(MobEffects.WATER_BREATHING, 5, 0,true,false));
									}else if (form=="ptera"){
										player.addPotionEffect(new PotionEffect(PotionCore.FLY_POTION, 5, 0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5,1,true,false));
									}else if (form=="lion"){
										player.addPotionEffect(new PotionEffect(PotionCore.PUNCH_BOOST_POTION, 5, 6,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 250,0,true,false));
									}else if (form=="jackal"){
										if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == ReiwaRiderItems.vice_belt){
											player.addPotionEffect(new PotionEffect(MobEffects.INVISIBILITY, 5, 0,false,false));
										}
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 1,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 2,true,false));
									}else if (form=="kong"){
										player.addPotionEffect(new PotionEffect(PotionCore.PUNCH_BOOST_POTION, 5, 5,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 25,0,true,false));
									}else if (form=="kamakiri"){
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 1,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 1,true,false));
									}else if (form=="brachio"){
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 1,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 1,true,false));
									}else if (form=="neo_batta"){
										player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 5, 6,true,false));
									}else if (form=="condor"){
										player.addPotionEffect(new PotionEffect(PotionCore.FLY_POTION, 5, 0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 250,0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5,2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 5,3,true,false));
									}else if (form=="kangaroo"){
										player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 5, 3,true,false));
										player.addPotionEffect(new PotionEffect(PotionCore.PUNCH_BOOST_POTION, 5, 6,true,false));
									}else if (form=="quetzalcoatlus"){
										player.addPotionEffect(new PotionEffect(PotionCore.FLY_POTION, 5, 0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5,2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5,2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 5,3,true,false));
									}else if (form=="white_leo"){
										player.addPotionEffect(new PotionEffect(PotionCore.PUNCH_BOOST_POTION, 5, 7,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 250,0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5,2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5,3,true,false));
									}else if (form=="50"){
										player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 5,6,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5,3,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5,3,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5,5,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE, 5,0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 250,0,true,false));
										player.addPotionEffect(new PotionEffect(PotionCore.FLY_POTION, 5,0,true,false));
										player.addPotionEffect(new PotionEffect(PotionCore.ANTIPOISON_POTION, 5,0,true,false));
										player.addPotionEffect(new PotionEffect(PotionCore.PUNCH_BOOST_POTION, 5, 5,true,false));
							
									}else if (form=="king_cobra"){
										player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 5,6,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5,3,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5,3,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5,5,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 250,0,true,false));
										player.addPotionEffect(new PotionEffect(PotionCore.ANTIPOISON_POTION, 5,0,true,false));
										player.addPotionEffect(new PotionEffect(PotionCore.PUNCH_BOOST_POTION, 5, 7,true,false));
							
									}else if (form=="full"){

										player.addPotionEffect(new PotionEffect(PotionCore.FLY_POTION, 5, 0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 250,0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5,2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 5, 6,true,false));
										
									}
									
									
									
									if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == ReiwaRiderItems.revice_driver){
										if (base==0){
										player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 5,0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5,0,true,false));
										}else if (base==1){
											player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 5,5,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5,1,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5,1,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5,1,true,false));
										}else if (base==2){
											player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 5,5,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5,1,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE, 5,0,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5,2,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5,3,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 250,0,true,false));
										}else if (base==3){
											player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 5,5,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5,2,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5,3,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5,4,true,false));
										}else if (base==4){
											player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 5,6,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5,3,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5,3,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5,5,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE, 5,0,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 250,0,true,false));
										}else if (base==7){
											player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 5,6,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5,4,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5,4,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5,5,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE, 5,0,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 250,0,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 25,3,true,false));
											player.addPotionEffect(new PotionEffect(PotionCore.PUNCH_BOOST_POTION, 25, 8,true,false));
										}
										
									}else if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == ReiwaRiderItems.vail_belt){
										player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 5,5,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5,2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5,3,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5,4,true,false));
									}else if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == ReiwaRiderItems.vice_belt){
										if (base==7){
											player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 5,6,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5,4,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5,4,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5,5,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE, 5,0,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 250,0,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 25,3,true,false));
											player.addPotionEffect(new PotionEffect(PotionCore.PUNCH_BOOST_POTION, 25, 8,true,false));
										}
									}else if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == ReiwaRiderItems.two_sidriver_evil){
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5,0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 0,true,false));
										
									}else if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == ReiwaRiderItems.two_sidriver_live){
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5,0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 0,true,false));
										
									 if (base==5){
											player.addPotionEffect(new PotionEffect(PotionCore.FLY_POTION, 5,0,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5,3,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5,3,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5,5,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 250,0,true,false));
										
										}else if (base==6){
											player.addPotionEffect(new PotionEffect(PotionCore.FLY_POTION, 5,0,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5,4,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5,5,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5,5,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 250,0,true,false));
										
										}
										
									}else if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == ReiwaRiderItems.demons_driver){
										player.addPotionEffect(new PotionEffect(MobEffects.POISON, 5, 0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 1,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5,2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 1,true,false));
										
									}else if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == ReiwaRiderItems.demons_driver_demons_trooper_a||player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == ReiwaRiderItems.demons_driver_demons_trooper_b){
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5,0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 0,true,false));
										
									}else if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == ReiwaRiderItems.vail_driver){
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 1,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5,2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 1,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 250,0,true,false));
										
									}else if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == ReiwaRiderItems.destream_driver){
										player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 5,6,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5,3,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5,3,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5,5,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE, 5,0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 250,0,true,false));
										
									}else if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == ReiwaRiderItems.chimera_driver){
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5,2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5,3,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5,5,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 250,0,true,false));
										
									}else if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == ReiwaRiderItems.chimera_driver_daimon){
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5,3,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5,4,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5,5,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 250,0,true,false));
										
									}else if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == ReiwaRiderItems.over_demons_driver){
										player.addPotionEffect(new PotionEffect(PotionCore.FLY_POTION, 5, 0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 1,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5,2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 1,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 250,0,true,false));
										
									}else if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == ReiwaRiderItems.libera_driver){
										player.addPotionEffect(new PotionEffect(PotionCore.PUNCH_BOOST_POTION, 5, 5,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 1,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 1,true,false));
										player.addPotionEffect(new PotionEffect(PotionCore.ANTIPOISON_POTION, 5,0,true,false));
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
					
					if (num==1){
						if(form=="jackal"&player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem()==ReiwaRiderItems.vice_belt){
							return Refercence.MODID+":textures/armor/vice_jackal_2.png";	
							
						}else{
						return Refercence.MODID+":textures/armor/"+rider+CoreName[item_revicedriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), "1")]+ext;
						}		
						

					}else if (num==2||num==5||num==7){
					
						if(form=="jackal"&player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem()==ReiwaRiderItems.vice_belt){
							return Refercence.MODID+":textures/armor/vice_jackal_2.png";	
							
						}else{
						return Refercence.MODID+":textures/armor/"+rider+CoreName[item_revicedriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), "1")]+ext;
						}	
						
					}else if (num==3||num==6||num==8){
						
						if(form=="jackal"&player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem()==ReiwaRiderItems.vice_belt){
							return Refercence.MODID+":textures/armor/vice_jackal_2.png";	
							
						}else{
						return Refercence.MODID+":textures/armor/"+rider+CoreName[item_revicedriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), "1")]+ext;
						}
						
					}else if (num==4||num==9||num==10||num==11||num==12||num==13||num==14){

						
							if (item_revicedriver.get_lockbase(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))!="base"){
								form = item_revicedriver.get_lockbase(player.getItemStackFromSlot(EntityEquipmentSlot.FEET));
							}else{
								form = Item_Vistamps.ARMS[((item_revicedriver)player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem()).DRIVER];
							}

								return Refercence.MODID+":textures/armor/"+rider+CoreName[item_revicedriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), "1")]+"_" +form+ext;
					
						
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

	

	public static int get_lock(ItemStack itemstack)
	{	
		return itemstack.hasTagCompound() ? itemstack.getTagCompound().getInteger("seed")!=0? itemstack.getTagCompound().getInteger("seed"): 0 : 0;
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








