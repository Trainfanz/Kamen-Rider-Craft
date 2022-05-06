package Kamen_Rider_Craft_4TH.item.Ex_Aid;

import javax.annotation.Nullable;

import org.lwjgl.opengl.GL11;

import Kamen_Rider_Craft_4TH.RiderItems;
import Kamen_Rider_Craft_4TH.ShowaRiderItems;
import Kamen_Rider_Craft_4TH.TokuCraft_core;
import Kamen_Rider_Craft_4TH.item.ooo.item_OOOdriver;
import Kamen_Rider_Craft_4TH.model.Model_lazer;
import Kamen_Rider_Craft_4TH.model.model_belt_plus;
import Kamen_Rider_Craft_4TH.potion.PotionCore;
import Kamen_Rider_Craft_4TH.util.IHasModel;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.entity.projectile.EntityFireball;
import net.minecraft.entity.projectile.EntityLargeFireball;
import net.minecraft.entity.projectile.EntitySmallFireball;
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

public class item_ex_aiddriver extends ItemArmor  implements IHasModel
{

	private static final int[] maxDamageArray = new int[] {11, 16, 15, 13};
	public String armorNamePrefix;
	public ArmorMaterial material;

	public String Rider;
	public int DRIVER;



	public item_ex_aiddriver (String name,ArmorMaterial par2EnumArmorMaterial, int par3, int par4, String rider, int driver)
	{
		super(par2EnumArmorMaterial, par3, EntityEquipmentSlot.FEET);
		this.material = par2EnumArmorMaterial;
		par2EnumArmorMaterial.getDamageReductionAmount(EntityEquipmentSlot.FEET);
		this.setMaxDamage(par2EnumArmorMaterial.getDurability(EntityEquipmentSlot.FEET));
		this.maxStackSize = 1;
		Rider=rider;
		DRIVER = driver;
		setTranslationKey(name);
		setRegistryName(name);
		TokuCraft_core.ITEMS.add(this);
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
				model_belt_plus armorModel = new Model_lazer();
				
				Item[] slot_one= new Item[] {stack.getItem(),stack.getItem(),RiderItems.gamer_driver_mightybros,RiderItems.gamer_driver_mightybros,RiderItems.gamer_driver_ex_aid_lv1,RiderItems.gamer_driver_mightybros,RiderItems.gamer_driver_maximum,RiderItems.gamer_driver_ghost,RiderItems.gamer_driver_ghost,RiderItems.gamer_driver_drive,RiderItems.gamer_driver_gaim,RiderItems.gamer_driver_wizard,RiderItems.gamer_driver_fourze,RiderItems.gamer_driver_ooo,RiderItems.gamer_driver_w,stack.getItem(),RiderItems.gamer_driver_kiva,RiderItems.gamer_driver_fourze,RiderItems.gamer_driver_drive,RiderItems.gamer_driver_hibiki,RiderItems.gamer_driver_blade,RiderItems.gamer_driver_faiz,RiderItems.gamer_driver_ryuki,RiderItems.gamer_driver_agito,RiderItems.gamer_driver_drive,RiderItems.gamer_driver_ichigo,RiderItems.gamer_driver_muteki,RiderItems.gamer_driver_creator,RiderItems.gamer_driver_knockout2,RiderItems.gamer_driver_truebrave,RiderItems.gamer_driver_xevious};
				Item[] slot_two= new Item[] {ShowaRiderItems.blanknoitem,RiderItems.gamer_driver_robots,RiderItems.gamer_driver_protorobots,RiderItems.gamer_driver_doremifa,RiderItems.gamer_driver_protodoremifa,RiderItems.gamer_driver_combat,RiderItems.gamer_driver_protocombat,RiderItems.gamer_driver_shakariki,RiderItems.gamer_driver_protoshakariki,RiderItems.gamer_driver_dragoknightfull,RiderItems.gamer_driver_dragoknightfang,RiderItems.gamer_driver_dragoknightblade,RiderItems.gamer_driver_dragoknightgun,RiderItems.gamer_driver_dragoknightclaw,RiderItems.gamer_driver_girigiri,RiderItems.gamer_driver_protogirigiri,RiderItems.gamer_driver_bikecombi,RiderItems.gamer_driver_burger,RiderItems.gamer_driver_pacman,RiderItems.gamer_driver_famista,RiderItems.gamer_driver_xevious,RiderItems.gamer_driver_safari,RiderItems.gamer_driver_fantasy,RiderItems.gamer_driver_legacy,RiderItems.gamer_driver_simulation,RiderItems.gamer_driver_zombie,RiderItems.gamer_driver_mightybros,RiderItems.gamer_driver_mightybros,RiderItems.gamer_driver_galaxian,RiderItems.gamer_driver_creator,RiderItems.gamer_driver_knockout2};

				if(stack.getItem() == RiderItems.gashacon_bugvisor_genmu_totema) {
					
							armorModel.wings=new ItemStack(RiderItems.totema_wings);
						
					
				}
				
				if(living.getHeldItemMainhand()!=null){
					if( living.getHeldItemMainhand().getItem()==RiderItems.gashacon_bugvisor_ii){
						if( this==RiderItems.gashacon_bugvisor_ii_chronicle_bugster||this==RiderItems.gashacon_bugvisor_ii_chronos||this==RiderItems.gashacon_bugvisor_ii_chronos_gemdeus||this==RiderItems.gashacon_bugvisor_ii_poppy_red||this==RiderItems.gashacon_bugvisor_ii_poppy){
							armorModel.belt=new ItemStack( RiderItems.bugster_buckle_ii);
						}else{
							armorModel.belt=stack;
						}						
					}else if( living.getHeldItemMainhand().getItem()==RiderItems.gashacon_bugvisor){
						if( this==RiderItems.gashacon_bugvisor_genmu){
							armorModel.belt=new ItemStack( RiderItems.bugster_buckle);
						}else{
								armorModel.belt=stack;
						}						
					}else{
						armorModel.belt=stack;
						if( this==RiderItems.gamer_driver_genmu&slot_one[this.get_core(stack,"1")]==RiderItems.gamer_driver_maximum){
							armorModel.belt2=new ItemStack(RiderItems.gamer_driver_godmaximum);
						}else if( this==RiderItems.gamer_driver_genmu&slot_one[this.get_core(stack,"1")]==RiderItems.gamer_driver_muteki){
							armorModel.belt2=new ItemStack(RiderItems.gamer_driver_godmaximum);
						}else if( this==RiderItems.gamer_driver_genmu&slot_one[this.get_core(stack,"1")]==RiderItems.gamer_driver_mightybros||this==RiderItems.gamer_driver_genmu&this.get_core(stack,"1")==1){
							armorModel.belt2=new ItemStack(RiderItems.gamer_driver_origin);
						}else if( this==RiderItems.gamer_driver_ex_aid&slot_one[this.get_core(stack,"1")]==RiderItems.gamer_driver_ex_aid_lv1){
							armorModel.belt=new ItemStack(RiderItems.gamer_driver_ex_aid_lv1);
						}else if( this==RiderItems.gamer_driver_brave&slot_one[this.get_core(stack,"1")]==RiderItems.gamer_driver_ex_aid_lv1){
							armorModel.belt=new ItemStack(RiderItems.gamer_driver_brave_lv1);
						}else if( this==RiderItems.gamer_driver_snipe&slot_one[this.get_core(stack,"1")]==RiderItems.gamer_driver_ex_aid_lv1){
							armorModel.belt=new ItemStack(RiderItems.gamer_driver_snipe_lv1);
						}else if( this==RiderItems.gamer_driver_lazer&slot_one[this.get_core(stack,"1")]==RiderItems.gamer_driver_ex_aid_lv1){
							armorModel.belt=new ItemStack(RiderItems.gamer_driver_lazer_lv1);
						}else if( this==RiderItems.gamer_driver_genmu&slot_one[this.get_core(stack,"1")]==RiderItems.gamer_driver_ex_aid_lv1){
							armorModel.belt=new ItemStack(RiderItems.gamer_driver_genm_lv1);
						}else if( this==RiderItems.gamer_driver_proto_brave||this==RiderItems.gamer_driver_proto_snipe&slot_one[this.get_core(stack,"1")]==RiderItems.gamer_driver_ex_aid_lv1){
							armorModel.belt=new ItemStack(RiderItems.gamer_driver_proto_lv1);
						}else{
						armorModel.belt2=new ItemStack(slot_one[this.get_core(stack,"1")]);
						}
						armorModel.belt3=new ItemStack(slot_two[this.get_locknum(stack)]);
					}	
				}else{
					armorModel.belt=stack;
					if( this==RiderItems.gamer_driver_genmu&slot_one[this.get_core(stack,"1")]==RiderItems.gamer_driver_maximum){
						armorModel.belt2=new ItemStack(RiderItems.gamer_driver_godmaximum);
					}else if( this==RiderItems.gamer_driver_genmu&slot_one[this.get_core(stack,"1")]==RiderItems.gamer_driver_mightybros){
						armorModel.belt2=new ItemStack(RiderItems.gamer_driver_origin);
					}else if( this==RiderItems.gamer_driver_ex_aid&slot_one[this.get_core(stack,"1")]==RiderItems.gamer_driver_ex_aid_lv1){
						armorModel.belt=new ItemStack(RiderItems.gamer_driver_ex_aid_lv1);
					}else if( this==RiderItems.gamer_driver_brave&slot_one[this.get_core(stack,"1")]==RiderItems.gamer_driver_ex_aid_lv1){
						armorModel.belt=new ItemStack(RiderItems.gamer_driver_brave_lv1);
					}else if( this==RiderItems.gamer_driver_snipe&slot_one[this.get_core(stack,"1")]==RiderItems.gamer_driver_ex_aid_lv1){
						armorModel.belt=new ItemStack(RiderItems.gamer_driver_snipe_lv1);
					}else if( this==RiderItems.gamer_driver_lazer&slot_one[this.get_core(stack,"1")]==RiderItems.gamer_driver_ex_aid_lv1){
						armorModel.belt=new ItemStack(RiderItems.gamer_driver_lazer_lv1);
					}else if( this==RiderItems.gamer_driver_genmu&slot_one[this.get_core(stack,"1")]==RiderItems.gamer_driver_ex_aid_lv1){
						armorModel.belt=new ItemStack(RiderItems.gamer_driver_genm_lv1);
					}else if( this==RiderItems.gamer_driver_proto_brave||this==RiderItems.gamer_driver_proto_snipe&slot_one[this.get_core(stack,"1")]==RiderItems.gamer_driver_ex_aid_lv1){
						armorModel.belt=new ItemStack(RiderItems.gamer_driver_proto_lv1);
					}else{
					armorModel.belt2=new ItemStack(slot_one[this.get_core(stack,"1")]);
					}
					armorModel.belt3=new ItemStack(slot_two[this.get_locknum(stack)]);
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
		String rider = ((item_ex_aiddriver)itemstack.getItem()).Rider;

		if (rider=="truebrave") {
			return "legacygamer";

		}else if (itemstack.getItem()==RiderItems.gashacon_bugvisor_genmu_totema) {
			return "totema_gamer";

		}else if (rider=="zombie_genmu") {
			return "zombie_gamer";

		}else if (rider=="chronos") {
			return "chroniclegamer";

		}else if (rider=="chronos_gemdeus") {
			return "gemdeuschroniclegamer";

		}else if (rider=="lazer_x") {
			return "chambaragamer_x";

		}
		return itemstack.hasTagCompound() ? Item_gashat.ARMS[itemstack.getTagCompound().getInteger("seed")] : "blank";
	}
	
	@SideOnly(Side.CLIENT)
	public boolean hasEffect(ItemStack par1ItemStack)
	{
			return !true;
	}

	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack armor) {


		if (player.getItemStackFromSlot(EntityEquipmentSlot.HEAD)!= null){
			if (player.getItemStackFromSlot(EntityEquipmentSlot.CHEST)!= null){
				if (player.getItemStackFromSlot(EntityEquipmentSlot.LEGS)!= null){
					if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET)!= null){
						if (player.getItemStackFromSlot(EntityEquipmentSlot.LEGS).getItem() == RiderItems.ex_aidlegs){
							if (player.getItemStackFromSlot(EntityEquipmentSlot.CHEST).getItem() == RiderItems.ex_aidtroso){
								if (player.getItemStackFromSlot(EntityEquipmentSlot.HEAD).getItem() == RiderItems.ex_aidhead){		
									
									if(item_OOOdriver.get_eftTime(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))<100){

										item_OOOdriver.set_eftTime(player.getItemStackFromSlot(EntityEquipmentSlot.FEET),item_OOOdriver.get_eftTime(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))+1);
									}
									if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.gamer_driver_ex_aid){

										if (this.get_core(armor, "1")==0){
											player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 0,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 0,true,false));

										}else if (this.get_core(armor, "1")==1){
											player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 2,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 1,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 0,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 0,true,false));
										}else if (this.get_core(armor, "1")==2){
											player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 1,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 1,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 0,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 3,true,false));
										}else if (this.get_core(armor, "1")==3){
											player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 1,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 1,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 0,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 2,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 250, 0,true,false));
										}else if (this.get_core(armor, "1")==4){
											player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 1,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 5, 2,true,false));
										}else if (this.get_core(armor, "1")==5){
											player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 5, 2,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 1,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 1,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 0,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 1,true,false));
										}else if (this.get_core(armor, "1")==6){
											player.addPotionEffect(new PotionEffect(MobEffects.SLOWNESS, 5, 1,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 1,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 4,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 4,true,false));
										}else if (this.get_core(armor, "1")==26){
											player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 3,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 4,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 4,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 6,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE, 5, 0,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 250, 0,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.REGENERATION, 5, 4,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.SATURATION, 5, 2,true,false));
										}else if (this.get_core(armor, "1")==27){
											player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 4,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 4,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 2,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 3,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 250, 0,true,false));
										}else if (this.get_core(armor, "1")==28){
											player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 2,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 3,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 1,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 1,true,false));
										}
									}else if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.gamer_driver_brave){

										if (this.get_core(armor, "1")==0){
											player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 0,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 0,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 0,true,false));

										}else if (this.get_core(armor, "1")==4){
											player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 0,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 5, 2,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 0,true,false));
										}
									}else if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.gamer_driver_proto_brave){

										if (this.get_core(armor, "1")==0){
											player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 0,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 0,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 0,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.WITHER, 5, 0,true,false));


										}else if (this.get_core(armor, "1")==4){
											player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 0,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 5, 2,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 0,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.WITHER, 5, 0,true,false));
										}
									}else if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.gamer_driver_snipe){

										if (this.get_core(armor, "1")==0){
											player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 0,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 0,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 250, 0,true,false));
											if (player.isSneaking()){
												player.addPotionEffect(new PotionEffect(MobEffects.SLOWNESS, 5, 4,true,false));
											}

										}else if (this.get_core(armor, "1")==4){
											player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 0,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 5, 2,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 0,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 250, 0,true,false));
										}
									}else if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.gamer_driver_proto_snipe){

										if (this.get_core(armor, "1")==0){
											player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 0,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 0,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 250, 0,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.WITHER, 5, 0,true,false));
											if (player.isSneaking()){
												player.addPotionEffect(new PotionEffect(MobEffects.SLOWNESS, 5, 4,true,false));
											}

										}else if (this.get_core(armor, "1")==4){
											player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 0,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 5, 2,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 0,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 250, 0,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.WITHER, 5, 0,true,false));
										}
									}else if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.gamer_driver_lazer){

										if (this.get_core(armor, "1")==0){
											if (this.get_lock(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))=="blank"){

												player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 5,true,false));
												player.addPotionEffect(new PotionEffect(MobEffects.INVISIBILITY, 5, 1,true,false));
											}

											player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 1,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 1,true,false));

										}else if (this.get_core(armor, "1")==4){
											player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 0,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 5, 2,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 1,true,false));
										}
									}else if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.gamer_driver_fuuma){

										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 3,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 2,true,false));

									}
									else if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.gamer_driver_paradox){
										if (this.get_core(armor, "1")==0){

											player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 2,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 2,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 3,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 2,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 250, 0,true,false));
										}else if (this.get_core(armor, "1")==2){


										}
									}
									else if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.gamer_driver_anotherparadox){
											player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 3,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 3,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 4,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 3,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 250, 0,true,false));										

									}	else if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.gamer_driver_lazer_turbo){
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 3,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 1,true,false));
										
									}	else if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.gamer_driver_gamedeus_muteki){
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 3,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 4,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 4,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 6,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE, 5, 0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 250, 0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.REGENERATION, 5, 4,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.SATURATION, 5, 2,true,false));										
										
									}else if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.gamer_driver_truebrave){
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 1,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 1,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 3,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 1,true,false));
										
									}else if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.gashacon_bugvisor_genmu){
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 1,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5,1,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.REGENERATION, 5, 3,true,false));

									}else if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.gashacon_bugvisor_ii_poppy){
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 1,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 1,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5,1,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 1,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 5, 2,true,false));

									}else if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.gashacon_bugvisor_ii_chronos){
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 4,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 3,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5,3,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 3,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 5, 3,true,false));

									}else if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.gashacon_bugvisor_ii_chronos_gemdeus){
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 5,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 4,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5,4,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 5,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 5, 5,true,false));
										
									}else if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.gashacon_bugvisor_ii_lazer){
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 3,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 1,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5,1,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 5, 1,true,false));
										
									}else if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.gamer_driver_chronos){
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 4,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 3,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5,3,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 3,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 5, 3,true,false));

									}else if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.rideplayerbelt||player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.rideplayerbelt_nico||player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.ninjaplayerbelt){
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 5, 0,true,false));

									}else if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.paradoxbelt){

										if (this.get_core(armor, "1")==0){
											player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 2,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 2,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 0,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 0,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 250, 0,true,false));
										}else if (this.get_core(armor, "1")==1){
											player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 0,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 0,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 3,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 1,true,false));
										}

									}else if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.gamer_driver_genmu){

										if (this.get_core(armor, "1")==0){
											player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 0,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 0,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 0,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.WITHER, 5, 0,true,false));

										}else if (this.get_core(armor, "1")==1){
											player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 0,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 1,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 0,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 0,true,false));

										}else if (this.get_core(armor, "1")==2){
											player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 0,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 1,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5,1,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 2,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.REGENERATION, 5, 3,true,false));
										}else if (this.get_core(armor, "1")==4){
											player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 1,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 5, 2,true,false));
										}else if (this.get_core(armor, "1")==6){
											player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 3,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 4,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 4,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 6,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 5, 3,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 250, 0,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.REGENERATION, 5, 4,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.SATURATION, 5, 2,true,false));
											
										}
									}
									if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() instanceof item_ex_aiddriver){

										if (this.get_lock(armor)=="robotgamer"){
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 1,true,false));
										}else  if (this.get_lock(armor)=="protorobotgamer"){
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 2,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.WITHER, 5, 0,true,false));
										}else if (this.get_lock(armor)=="beatgamer"){
											player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 2,true,false));
										}else  if (this.get_lock(armor)=="protobeatgamer"){
											player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 3,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.WITHER, 5, 0,true,false));
										}else if (this.get_lock(armor)=="combatgamer"){
											player.fallDistance=0; 
											player.addPotionEffect(new PotionEffect(PotionCore.FLY_POTION, 5, 4,true,false));											
										}else  if (this.get_lock(armor)=="protocombatgamer"){
											player.fallDistance=0; 
											player.addPotionEffect(new PotionEffect(PotionCore.FLY_POTION, 5, 4,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.WITHER, 5, 0,true,false));
										}else if (this.get_lock(armor)=="sportsgamer"){
											player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 1,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 1,true,false));
										}else  if (this.get_lock(armor)=="protosportsgamer"){
											player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 2,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 1,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.WITHER, 5, 0,true,false));
										}else  if (this.get_lock(armor)=="huntergamerfull"){
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 3,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 1,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 2,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.NAUSEA, 5, 0,true,false));
										}else  if (this.get_lock(armor)=="huntergamerfang"){
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 2,true,false));
										}else  if (this.get_lock(armor)=="huntergamerblade"){
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 1,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 1,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 1,true,false));
										}else  if (this.get_lock(armor)=="huntergamergun"){
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 1,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 250, 1,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 1,true,false));
										}else  if (this.get_lock(armor)=="huntergamerclaw"){
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 2,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 2,true,false));
										}else  if (this.get_lock(armor)=="chambaragamer"){
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 1,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 2,true,false));
										}else  if (this.get_lock(armor)=="protochambaragamer"){
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 2,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 2,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.WITHER, 5, 0,true,false));
										}else  if (this.get_lock(armor)=="burgergamer"){

											player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 4,true,false));
										}else if (this.get_lock(armor)=="pacgamer"){
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 2,true,false));
										}else if (this.get_lock(armor)=="famistagamer"){
											player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 2,true,false));
										}else if (this.get_lock(armor)=="xeviousgamer"){
											player.fallDistance=0;
											player.addPotionEffect(new PotionEffect(PotionCore.FLY_POTION, 5, 4,true,false));
										}else  if (this.get_lock(armor)=="safarigamer"){
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 2,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 2,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 1,true,false));
										}else  if (this.get_lock(armor)=="fantasygamer"){
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5,3,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 2,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 1,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 2,true,false));
										}else  if (this.get_lock(armor)=="legacygamer"){
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5,5,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 2,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 2,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 4,true,false));
										}else  if (this.get_lock(armor)=="simulationgamer"){
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5,1,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.SLOWNESS, 5, 1,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 3,true,false));
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
										}else  if (this.get_lock(armor)=="galaxiangamer"){
											if (player.isSneaking()){
												if (item_OOOdriver.get_eftTime(player.getItemStackFromSlot(EntityEquipmentSlot.FEET)) > 99){

													Vec3d look = player.getLookVec();
													EntityFireball fireball = new EntitySmallFireball(world, player, 1, 1, 1);
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
											player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 2));
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
		return RiderItems.blank_gashat == repair.getItem() ? true : super.getIsRepairable(toRepair, repair);
	}
}








