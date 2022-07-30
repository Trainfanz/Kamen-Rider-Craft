package Kamen_Rider_Craft_4TH.item.ghost;

import javax.annotation.Nullable;

import org.lwjgl.opengl.GL11;

import Kamen_Rider_Craft_4TH.RiderItems;
import Kamen_Rider_Craft_4TH.ShowaRiderItems;
import Kamen_Rider_Craft_4TH.TokuCraft_core;
import Kamen_Rider_Craft_4TH.item.Ex_Aid.item_ex_aiddriver;
import Kamen_Rider_Craft_4TH.item.ooo.item_OOOdriver;
import Kamen_Rider_Craft_4TH.item.revice.item_revicedriver;
import Kamen_Rider_Craft_4TH.item.rider_armor_base.Item_form_change;
import Kamen_Rider_Craft_4TH.item.rider_armor_base.item_rider_driver;
import Kamen_Rider_Craft_4TH.model.model_belt_plus;
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
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class item_ghostdriver extends item_rider_driver
{

	private static final int[] maxDamageArray = new int[] {11, 16, 15, 13};
	public String armorNamePrefix;
	public ArmorMaterial material;
	public String RIDER;
	public String LOCK;
	public int DRIVER;

	public static final String[] CoreName= new String[] {"ghost","ghost_boost","ghost_mugen","ghost_fourtyfiveheisei"};
	public static final String[] CoreNamespecter= new String[] {"specter","deep_specter","specter_sin"};
	public static final String[] CoreNamenecrom= new String[] {"necrom","necrom_yujou_burst"};



	public item_ghostdriver (String name,ArmorMaterial par2EnumArmorMaterial, int par3, int par4, String rider, String lock, int driver)
	{
		super(name,par2EnumArmorMaterial,4,rider,(Item_form_change) RiderItems.keyfuestle,RiderItems.ghosthead, RiderItems.ghosttroso, RiderItems.ghostlegs, RiderItems.ghost_icons);
		this.material = par2EnumArmorMaterial;
		par2EnumArmorMaterial.getDamageReductionAmount(EntityEquipmentSlot.FEET);
		this.setMaxDamage(par2EnumArmorMaterial.getDurability(EntityEquipmentSlot.FEET));
		this.maxStackSize = 1;
		RIDER = rider; 
		LOCK = lock;
		DRIVER = driver;
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
	@SideOnly(Side.CLIENT)
	@Nullable
	public ModelBiped getArmorModel(EntityLivingBase living, ItemStack stack, EntityEquipmentSlot slot, ModelBiped defaultModel)
	{
		if(!stack.isEmpty())
		{
			if(stack.getItem() instanceof ItemArmor)
			{
				model_belt_plus armorModel = new model_belt_plus();

				if (RIDER!="necrom"&RIDER!="dark_necrom"){
					armorModel.belt=stack;
				}else
				{
					armorModel.belt=new ItemStack( ShowaRiderItems.blanknoitem);
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


	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, EntityEquipmentSlot slot, String type)
	{
		return Refercence.MODID+":textures/armor/blank.png";

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
		item_ghostdriver belt = (item_ghostdriver) itemstack.getItem();


		return itemstack.hasTagCompound() ? Item_ghost_Icons.ARMS[itemstack.getTagCompound().getInteger("icon")] : belt.LOCK;
	}

	public static String get_rider(ItemStack itemstack)
	{	
		item_ghostdriver belt = (item_ghostdriver) itemstack.getItem();
		String rider = "_"+belt.DRIVER; 

		return itemstack.hasTagCompound() ? belt.DRIVER !=itemstack.getTagCompound().getInteger("rider")? "_"+itemstack.getTagCompound().getInteger("rider") : "": "";
	}
	public static void set_lock(ItemStack itemstack,int flag,int rider)
	{
		if (!itemstack.hasTagCompound())
		{
			itemstack.setTagCompound(new NBTTagCompound());
		}
		itemstack.getTagCompound().setInteger("icon", flag);
		itemstack.getTagCompound().setInteger("rider", rider);
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

	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack armor) {


		if (player.getItemStackFromSlot(EntityEquipmentSlot.HEAD)!= null){
			if (player.getItemStackFromSlot(EntityEquipmentSlot.CHEST)!= null){
				if (player.getItemStackFromSlot(EntityEquipmentSlot.LEGS)!= null){
					if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET)!= null){
						if (player.getItemStackFromSlot(EntityEquipmentSlot.LEGS).getItem() == RiderItems.ghostlegs){
							if (player.getItemStackFromSlot(EntityEquipmentSlot.CHEST).getItem() == RiderItems.ghosttroso){
								if (player.getItemStackFromSlot(EntityEquipmentSlot.HEAD).getItem() == RiderItems.ghosthead){
									if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem()instanceof item_ghostdriver){
										
										if(item_OOOdriver.get_eftTime(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))<100){

											item_OOOdriver.set_eftTime(player.getItemStackFromSlot(EntityEquipmentSlot.FEET),item_OOOdriver.get_eftTime(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))+1);
										}

										if (this.get_lock(armor)==Item_ghost_Icons.ARMS[1]){
											if (player.isSneaking()){
												if(item_OOOdriver.get_eftTime(armor)==100){
													Vec3d look = player.getLookVec();
													world.spawnEntity(new EntityLightningBolt(world,  player.posX + look.x * 8,  -1 + player.posY + look.y * 5,  player.posZ + look.z * 8, false));

													armor.damageItem(2, player);
													item_OOOdriver.set_eftTime(armor,0);
												}

											}
										}else if (this.get_lock(armor)==Item_ghost_Icons.ARMS[2]){
											player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 5, 10,true,false));									
										}else if (this.get_lock(armor)==Item_ghost_Icons.ARMS[3]){
											player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 1,true,false));	
										}else if (this.get_lock(armor)==Item_ghost_Icons.ARMS[4]){
											player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 5, 0,true,false));	
											player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 250, 0,true,false));	
										}else if (this.get_lock(armor)==Item_ghost_Icons.ARMS[6]){
											player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 1,true,false));	
											player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 250, 0,true,false));	
										}else if (this.get_lock(armor)==Item_ghost_Icons.ARMS[8]){
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 1,true,false));	
										}else if (this.get_lock(armor)==Item_ghost_Icons.ARMS[7]){
											player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 1,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 0,true,false));
										}else if (this.get_lock(armor)==Item_ghost_Icons.ARMS[9]){
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 0,true,false));	
											player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 0,true,false));	
										}else if (this.get_lock(armor)==Item_ghost_Icons.ARMS[10]){
											player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 5, 0,true,false));	
											player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 250, 0,true,false));	
										}else if (this.get_lock(armor)==Item_ghost_Icons.ARMS[11]){
											player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 5, 1,true,false));	
											player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 1,true,false));	
										}else if (this.get_lock(armor)==Item_ghost_Icons.ARMS[12]){
											player.addPotionEffect(new PotionEffect(MobEffects.REGENERATION, 5, 1,true,false));	
											player.addPotionEffect(new PotionEffect(MobEffects.SATURATION, 5, 1,true,false));	
										}else if (this.get_lock(armor)==Item_ghost_Icons.ARMS[14]){
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 2,true,false));	
											player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 1,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 2,true,false));	
										}else if (this.get_lock(armor)==Item_ghost_Icons.ARMS[15]){
											player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 5, 0,true,false));	
											player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 250, 0,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 2,true,false));
										}else if (this.get_lock(armor)==Item_ghost_Icons.ARMS[16]){
											player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 0,true,false));	
											player.addPotionEffect(new PotionEffect(MobEffects.REGENERATION, 5, 1,true,false));
										}else if (this.get_lock(armor)==Item_ghost_Icons.ARMS[17]){
											player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 0,true,false));	
											player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 5, 1,true,false));
										}else if (this.get_lock(armor)==Item_ghost_Icons.ARMS[18]){
											player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 0,true,false));	
											player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 0,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.INVISIBILITY, 5, 0,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 5, 1,true,false));
										}else if (this.get_lock(armor)==Item_ghost_Icons.ARMS[20]){
											player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 0,true,false));	
											player.addPotionEffect(new PotionEffect(MobEffects.REGENERATION, 5, 3,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 2,true,false));
										}else if (this.get_lock(armor)==Item_ghost_Icons.ARMS[21]){
											player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 5, 5,true,false));	
											player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 2,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 1,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 1,true,false));
											player.fallDistance=0; 
											player.addPotionEffect(new PotionEffect(PotionCore.FLY_POTION, 5, 4,true,false));											
										}else if (this.get_lock(armor)==Item_ghost_Icons.ARMS[22]){
											player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 250, 0,true,false));	
											player.addPotionEffect(new PotionEffect(MobEffects.REGENERATION, 5, 2,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 1,true,false));
										}else if (this.get_lock(armor)==Item_ghost_Icons.ARMS[23]){
											player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 5, 5,true,false));	
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 2,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 1,true,false));
										}else if (this.get_lock(armor)==Item_ghost_Icons.ARMS[19]){
											player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 1,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.INVISIBILITY, 5, 0,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 1,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 0,true,false));
										}else if (this.get_lock(armor)==Item_ghost_Icons.ARMS[31]){
											player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 1,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.NAUSEA, 5, 1,true,false));
										}else if (this.get_lock(armor)==Item_ghost_Icons.ARMS[32]){
											player.addPotionEffect(new PotionEffect(MobEffects.REGENERATION, 5, 1,true,false));
										}else if (this.get_lock(armor)==Item_ghost_Icons.ARMS[33]){
											player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 1,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 250, 1,true,false));
										}else if (this.get_lock(armor)==Item_ghost_Icons.ARMS[34]){
											player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 250, 1,true,false));
										}else if (this.get_lock(armor)==Item_ghost_Icons.ARMS[36]){
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 2,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.WATER_BREATHING, 5, 1,true,false));
										}else if (this.get_lock(armor)==Item_ghost_Icons.ARMS[37]){
											player.addPotionEffect(new PotionEffect(MobEffects.REGENERATION, 5, 2,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 2,true,false));
										}else if (this.get_lock(armor)==Item_ghost_Icons.ARMS[39]){
											player.addPotionEffect(new PotionEffect(MobEffects.REGENERATION, 5, 2,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 3,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 3,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 250, 0,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 2,true,false));
										}else if (this.get_lock(armor)==Item_ghost_Icons.ARMS[40]){
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 3,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 4,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 2,true,false));
										}else if (this.get_lock(armor)==Item_ghost_Icons.ARMS[42]){
											player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 5, 2,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 0,true,false));
										}else if (this.get_lock(armor)==Item_ghost_Icons.ARMS[62]){
											player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 2,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 0,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 250, 0,true,false));


										}

										if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.ghostdriver){
											player.fallDistance=0; 
											if (this.get_core(armor, "1")==0){
												player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 0,true,false));
												player.addPotionEffect(new PotionEffect(MobEffects.INVISIBILITY, 5, 0,true,false));



											}else if (this.get_core(armor, "1")==1){
												player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 0,true,false));
												player.addPotionEffect(new PotionEffect(MobEffects.INVISIBILITY, 5, 0,true,false));
												player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 3,true,false));
												player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 2,true,false));

											}else if (this.get_core(armor, "1")==2){
												player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 3,true,false));
												player.addPotionEffect(new PotionEffect(MobEffects.INVISIBILITY, 5, 0,true,false));
												player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 5,true,false));
												player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 5,true,false));

											}else if (this.get_core(armor, "1")==3){
												player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 1,true,false));
												player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 1,true,false));
												player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 1,true,false));
												player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 250, 0,true,false));
												player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 1,true,false));
											}
										}else if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.specterdriver){
											player.fallDistance=0; 
											if (this.get_core(armor, "1")==0){
												player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 0,true,false));
												player.addPotionEffect(new PotionEffect(MobEffects.INVISIBILITY, 5, 0,true,false));



											}else if (this.get_core(armor, "1")==1){
												player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 0,true,false));
												player.addPotionEffect(new PotionEffect(MobEffects.INVISIBILITY, 5, 0,true,false));
												player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 3,true,false));
												player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 2,true,false));

											}else if (this.get_core(armor, "1")==2){
												player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 3,true,false));
												player.addPotionEffect(new PotionEffect(MobEffects.INVISIBILITY, 5, 0,true,false));
												player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 5,true,false));
												player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 5,true,false));

											}
										}else if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.dark_ghostdriver||player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.zero_specterdriver){
											player.fallDistance=0; 
											if (this.get_core(armor, "1")==0){
												player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 0,true,false));
												player.addPotionEffect(new PotionEffect(MobEffects.INVISIBILITY, 5, 0,true,false));
												player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 4,true,false));
												player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 3,true,false));


											}
										}else if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.proto_mega_ulorder_b||player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.proto_mega_ulorder_y||player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.proto_mega_ulorder_p||player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.proto_mega_ulorder_r){
											player.fallDistance=0; 
											if (this.get_core(armor, "1")==0){
												player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 1,true,false));
												player.addPotionEffect(new PotionEffect(MobEffects.INVISIBILITY, 5, 1,true,false));



											}
										}else if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.mega_ulorder){
											player.fallDistance=0; 
											if (this.get_core(armor, "1")==0){
												player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 1,true,false));
												player.addPotionEffect(new PotionEffect(MobEffects.INVISIBILITY, 5, 0,true,false));
												player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 1,true,false));
												player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 0,true,false));
											}else if (this.get_core(armor, "1")==1){
												player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 2,true,false));
												player.addPotionEffect(new PotionEffect(MobEffects.INVISIBILITY, 5, 0,true,false));
												player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 3,true,false));
												player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 2,true,false));

											}
										}else if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.eyecon_driver_g){
											player.fallDistance=0; 

											player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 1,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.INVISIBILITY, 5, 0,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 2,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 2,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.WATER_BREATHING, 5, 0,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE, 5, 0,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.REGENERATION, 5, 1,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 250, 1,true,false));

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

					
					 if (num==2||num==5||num==3||num==6||num==8||num==12){
						
							if (belt.Rider == "ghost"){
						
							
								return Refercence.MODID+":textures/armor/"+ CoreName[item_ghostdriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET),"1")] +get_rider(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))+".png";
							
						}else	if (belt.Rider == "specter"){
							
								return Refercence.MODID+":textures/armor/"+ CoreNamespecter[item_ghostdriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET),"1")]+".png";
							
						}else if (belt.Rider == "necrom"){
							
								return Refercence.MODID+":textures/armor/"+ CoreNamenecrom[item_ghostdriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET),"1")] +get_rider(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))+".png";
							
							
						}else{
							
								return Refercence.MODID+":textures/armor/"+ belt.Rider +".png";
							
						}

						
					}else if (num==9||num==1||num==13||num==11){

					
						return Refercence.MODID+":textures/armor/"+ item_ghostdriver.get_lock(player.getItemStackFromSlot(EntityEquipmentSlot.FEET)) +"_damashii.png";
						
					} else if (num==10||num==4){

						if (belt==RiderItems.eyecon_driver_g){

							return Refercence.MODID+":textures/armor/"+ item_ghostdriver.get_lock(player.getItemStackFromSlot(EntityEquipmentSlot.FEET)) +"_damashii_2.png";
							

						}
						return Refercence.MODID+":textures/armor/"+ item_ghostdriver.get_lock(player.getItemStackFromSlot(EntityEquipmentSlot.FEET)) +"_damashii.png";
						
					}else{
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

	static int[] getMaxDamageArray()
	{
		return maxDamageArray;
	}






}