package Kamen_Rider_Craft_4TH.item.drive;

import java.util.Random;

import javax.annotation.Nullable;

import org.lwjgl.opengl.GL11;

import Kamen_Rider_Craft_4TH.RiderItems;
import Kamen_Rider_Craft_4TH.TokuCraft_core;
import Kamen_Rider_Craft_4TH.item.ooo.item_OOOdriver;
import Kamen_Rider_Craft_4TH.model.model_belt_w;
import Kamen_Rider_Craft_4TH.model.type_tire;
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
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.entity.projectile.EntityFireball;
import net.minecraft.entity.projectile.EntityLargeFireball;
import net.minecraft.init.Items;
import net.minecraft.init.MobEffects;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemArrow;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class item_drivedriver extends ItemArmor implements IHasModel
{


	public static final String[] tireName= new String[] {"type_speed","wild","max_flare","funky_spike","midnight_shadow","justice_hunter","dream_vegas","dimension_cab","massive_monster","spin_mixer","type_high_speed","type_proto_speed","mega_maxflare","technique","rumble_dump","mad_doctor","hooking_wrecker","fire_braver","rolling_gravity","road_winter","fruits","dead_heat","dead_heat_burst","formula","tridoron","attack123","people_saver","kouji_genbar","gold","type_next","type_special","f01","f02","f03","tridoron_all","miracle","type_speed_wild_technic"};

	public static final String[] tireName2nd = new String[] {"kourin","kourin_magarl","kourin_kaksarn","kourin_tomarle","kourin_kikern","wheeler_dynamics","wheeler_dynamics","chaser_mach"};


	private static final int[] maxDamageArray = new int[] {11, 16, 15, 13};
	public String armorNamePrefix;
	public ArmorMaterial material;





	public item_drivedriver (String name,ArmorMaterial par2EnumArmorMaterial, int par3)
	{
		super(par2EnumArmorMaterial, par3,EntityEquipmentSlot.FEET);
		this.material = par2EnumArmorMaterial;
		par2EnumArmorMaterial.getDamageReductionAmount(EntityEquipmentSlot.FEET);
		this.setMaxDamage(par2EnumArmorMaterial.getDurability(EntityEquipmentSlot.FEET));
		this.maxStackSize = 1;
		setTranslationKey(name);
		setRegistryName(name);
		TokuCraft_core.ITEMS.add(this);
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
				type_tire armorModel = new type_tire();

				if (stack.getItem()== RiderItems.break_gunner_2){
					armorModel.belt=new ItemStack( RiderItems.blanknoitem);
				}else{
					armorModel.belt=stack;
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
		if (entity instanceof EntityLivingBase){

			EntityLivingBase player = ((EntityLivingBase)entity);
			if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET)!= null){

				if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() instanceof item_drivedriver){
					return Refercence.MODID+":textures/armor/"+this.get_lock(stack)+"_tire.png";

				}	
			}

		}
		return Refercence.MODID+":textures/armor/blank.png";


	}




	public static int get_core(ItemStack itemstack)
	{
		return itemstack.hasTagCompound() ? itemstack.getTagCompound().getInteger("core") : 0;
	}

	public static void set_core(ItemStack itemstack, int flag)
	{
		if (!itemstack.hasTagCompound())
		{
			itemstack.setTagCompound(new NBTTagCompound());
		}
		itemstack.getTagCompound().setInteger("core", flag);
	}


	public static String get_lock(ItemStack itemstack)
	{	item_drivedriver belt = (item_drivedriver) itemstack.getItem();

	if (belt==RiderItems.drivedriver||item_drivedriver.get_core(itemstack)==1||item_drivedriver.get_core(itemstack)==4){
		return itemstack.hasTagCompound() ? tireName[itemstack.getTagCompound().getInteger("core2")] : "type_speed";

	}else if (belt==RiderItems.drivedrivergold){
		return itemstack.hasTagCompound() ? tireName[itemstack.getTagCompound().getInteger("core2")] : "gold";

	}else if (belt==RiderItems.drivedriverbrain){
		return itemstack.hasTagCompound() ? tireName[itemstack.getTagCompound().getInteger("core2")] : "brain";

	}else if (belt==RiderItems.metro_pd_driver_honoh||belt==RiderItems.lupin_belt){
		return itemstack.hasTagCompound() ? tireName[itemstack.getTagCompound().getInteger("core2")] : "type_proto_speed";

	}else{
		return itemstack.hasTagCompound() ? tireName2nd[itemstack.getTagCompound().getInteger("core2")] : "kourin";

	}


	}

	public static void set_lock(ItemStack itemstack,int flag)
	{
		if (!itemstack.hasTagCompound())
		{
			itemstack.setTagCompound(new NBTTagCompound());
		}
		itemstack.getTagCompound().setInteger("core2", flag);
	}

	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack armor) {


		if (player.getItemStackFromSlot(EntityEquipmentSlot.HEAD)!= null){
			if (player.getItemStackFromSlot(EntityEquipmentSlot.CHEST)!= null){
				if (player.getItemStackFromSlot(EntityEquipmentSlot.LEGS)!= null){
					if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET)!= null){
						if (player.getItemStackFromSlot(EntityEquipmentSlot.LEGS).getItem() == RiderItems.drivelegs){
							if (player.getItemStackFromSlot(EntityEquipmentSlot.CHEST).getItem() == RiderItems.drivetroso){
								if (player.getItemStackFromSlot(EntityEquipmentSlot.HEAD).getItem() == RiderItems.drivehead){
									if(item_OOOdriver.get_eftTime(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))<100){

										item_OOOdriver.set_eftTime(player.getItemStackFromSlot(EntityEquipmentSlot.FEET),item_OOOdriver.get_eftTime(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))+1);
									}
									if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.drivedrivergold){

										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 2));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 1,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 3,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 2,true,false));
									}else if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.lupin_belt){

										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 1,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 0,true,false));
									}else if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.break_gunner_2){

										if (this.get_core(armor)==0){
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 1,true,false));


										}else if (this.get_core(armor)==1){
											player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 0,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 2,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 4,true,false));

										}
									}else if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.metro_pd_driver_honoh){

										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 0,true,false));

									}else if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.mach_driver_honoh){

										if (this.get_lock(armor)=="kourin_magarl"){

											player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 2,true,false));

										}else if (this.get_lock(armor)=="kourin_kaksarn"){

											player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 2,true,false));

										}else if (this.get_lock(armor)=="kourin_tomarle"){

											player.addPotionEffect(new PotionEffect(MobEffects.SLOWNESS, 5, 10,true,false));

										}

										if (this.get_core(armor)==0){
											player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 1,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 1,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 0,true,false));


										}else if (this.get_core(armor)==1){
											player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 2,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 1,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 3,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.NAUSEA, 5, 1,true,false));


										}else if (this.get_core(armor)==2){
											player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 1,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 1,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 0,true,false));


										}else if (this.get_core(armor)==3){
											player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 3,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 1,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 3,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 2,true,false));

										}else if (this.get_core(armor)==4){
											player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 2,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 1,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 3,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.NAUSEA, 5, 1,true,false));


										}else if (this.get_core(armor)==5){
											player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 0,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 0,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 5,true,false));

										}else if (this.get_core(armor)==6){
											player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 4,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 2,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 4,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 3,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.REGENERATION, 5, 0,true,false));

										}else if (this.get_core(armor)==7){
											player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 5,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 2,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 5,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 4,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.REGENERATION, 5, 1,true,false));


										}
									}
									else if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.drivedriver){




										if (this.get_core(armor)==0){
											player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 1,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 0,true,false));

										}else if (this.get_core(armor)==1){
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 0,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 0,true,false));

										}else if (this.get_core(armor)==2){
											player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 1,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 0,true,false));

										}else if (this.get_core(armor)==3){
											player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 0,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 0,true,false));

										}else if (this.get_core(armor)==4){
											player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 5, 0,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 1,true,false));

										}else if (this.get_core(armor)==5){
											player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 1,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 1,true,false));

										}else if (this.get_core(armor)==6){
											player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 2,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 1,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 3,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.NAUSEA, 5, 1,true,false));

										}else if (this.get_core(armor)==7){
											player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 5,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 3,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 2,true,false));


										}else if (this.get_core(armor)==8){
											player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 2,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 3,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 4,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 5, 0,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 3,true,false));

											if (item_OOOdriver.get_eftTime(player.getItemStackFromSlot(EntityEquipmentSlot.FEET)) > 45){
												if (player.isSneaking()){

													Vec3d look = player.getLookVec();
													player.motionX=look.x*3;
													player.motionY=look.y;
													player.motionZ=look.z*3;
													item_OOOdriver.set_eftTime(player.getItemStackFromSlot(EntityEquipmentSlot.FEET),0);

												}}
										}else if (this.get_core(armor)==9){
											player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 1,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 1,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 3,true,false));

										}else if (this.get_core(armor)==10){
											player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 2,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 2,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 2,true,false));

										}else if (this.get_core(armor)==11){
											player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 0,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 0,true,false));

										}else if (this.get_core(armor)==12){
											player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 1,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 1,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 5,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 5, 0,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 3,true,false));

											if (item_OOOdriver.get_eftTime(player.getItemStackFromSlot(EntityEquipmentSlot.FEET)) > 45){
												if (player.isSneaking()){

													Vec3d look = player.getLookVec();
													player.motionX=look.x*3;
													player.motionY=look.y;
													player.motionZ=look.z*3;
													item_OOOdriver.set_eftTime(player.getItemStackFromSlot(EntityEquipmentSlot.FEET),0);

												}}
										}

										if (this.get_lock(armor)=="max_flare"){

											player.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE, 5, 0,true,false));

										}else if (this.get_lock(armor)=="funky_spike"){
											player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 0,true,false));
											if (player.getLastAttackedEntity() instanceof EntityLivingBase & player.getLastAttackedEntityTime()<50 ){
												player.getLastAttackedEntity().addPotionEffect(new PotionEffect(MobEffects.POISON, 50, 0,true,false));
											}

										}else if (this.get_lock(armor)=="midnight_shadow"){
											if (player.isSneaking()){

												if (item_OOOdriver.get_eftTime(player.getItemStackFromSlot(EntityEquipmentSlot.FEET)) > 2){

													Vec3d look = player.getLookVec();
													ItemArrow itemarrow = (ItemArrow) Items.ARROW;
													EntityArrow fireball = itemarrow.createArrow(world, new ItemStack(Items.ARROW), player);
													fireball.pickupStatus= EntityArrow.PickupStatus.DISALLOWED;
													fireball.motionX = look.x*3;
								                    fireball.motionY = look.y*3;
								                    fireball.motionZ = look.z*3;
													world.spawnEntity(fireball);
													item_OOOdriver.set_eftTime(player.getItemStackFromSlot(EntityEquipmentSlot.FEET),0);
												}	
											}
										}	else if (this.get_lock(armor)=="justice_hunter"){

											player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 0,true,false));

										} else if (this.get_lock(armor)=="dream_vegas"){

											if (player.isSneaking()){
												if (item_OOOdriver.get_eftTime(player.getItemStackFromSlot(EntityEquipmentSlot.FEET)) > 45){
													player.dropItem(Items.GOLD_NUGGET, 1); 
													item_OOOdriver.set_eftTime(player.getItemStackFromSlot(EntityEquipmentSlot.FEET),0);
												}

											}
										}else if (this.get_lock(armor)=="dimension_cab"){

											Random generator = new Random();
											int rand = generator.nextInt(6);
											if (player.isSneaking()){
												if (item_OOOdriver.get_eftTime(player.getItemStackFromSlot(EntityEquipmentSlot.FEET)) > 45){

													Vec3d look = player.getLookVec();
													player.motionX=look.x+rand;
													//player.motionY=look.yCoord+rand;
													player.motionZ=look.z+rand;
													item_OOOdriver.set_eftTime(player.getItemStackFromSlot(EntityEquipmentSlot.FEET),0);
													item_OOOdriver.set_eftTime(player.getItemStackFromSlot(EntityEquipmentSlot.FEET),0);
												}

											}
										} else if (this.get_lock(armor)=="massive_monster"){

											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 0,true,false));

										}  else if (this.get_lock(armor)=="spin_mixer"){

											player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 0,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.SLOWNESS, 5, 0,true,false));

										} else if (this.get_lock(armor)=="mega_maxflare"){

											player.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE, 5, 0,true,false));

										} else if (this.get_lock(armor)=="rumble_dump"){
											Random generator = new Random();
											int rand = generator.nextInt(4);

											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 1,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.SLOWNESS, 5, 0,true,false));
											if (item_OOOdriver.get_eftTime(player.getItemStackFromSlot(EntityEquipmentSlot.FEET)) > 45){
												if (this.get_core(armor)!=1){
													Vec3d look = player.getLookVec();
													player.motionX=look.x+rand-2;
													player.motionY=rand-2;
													player.motionZ=look.z+rand-2;
													item_OOOdriver.set_eftTime(player.getItemStackFromSlot(EntityEquipmentSlot.FEET),0);
													item_OOOdriver.set_eftTime(player.getItemStackFromSlot(EntityEquipmentSlot.FEET),0);
												}
											}
										}else if (this.get_lock(armor)=="mad_doctor"){

											player.addPotionEffect(new PotionEffect(MobEffects.REGENERATION, 25, 1,true,false));

										}else if (this.get_lock(armor)=="fire_braver"){

											player.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE, 5, 1,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.WATER_BREATHING, 5, 1,true,false));

										}else if (this.get_lock(armor)=="rolling_gravity"){

											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 3,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.SLOWNESS, 5, 1,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.MINING_FATIGUE, 5, 1,true,false));
										}else if (this.get_lock(armor)=="f01"){

											player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 40,true,false));

										}else if (this.get_lock(armor)=="f02"){

											player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 3,true,false));

										}else if (this.get_lock(armor)=="f03"){

											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 4,true,false));

										}
										//"attack123","people_saver","kouji_genbar"
										else if (this.get_lock(armor)=="attack123"){

											player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 0,true,false));
											if (player.getLastAttackedEntity() instanceof EntityLivingBase & player.getLastAttackedEntityTime()<50 ){
												player.getLastAttackedEntity().addPotionEffect(new PotionEffect(MobEffects.POISON, 50, 0,true,false));
											}
											if (player.isSneaking()){

												if (item_OOOdriver.get_eftTime(player.getItemStackFromSlot(EntityEquipmentSlot.FEET)) > 2){

													Vec3d look = player.getLookVec();
													ItemArrow itemarrow = (ItemArrow) Items.ARROW;
													EntityArrow fireball = itemarrow.createArrow(world, new ItemStack(Items.ARROW), player);
													fireball.pickupStatus= EntityArrow.PickupStatus.DISALLOWED;
													fireball.motionX = look.x*3;
								                    fireball.motionY = look.y*3;
								                    fireball.motionZ = look.z*3;
													world.spawnEntity(fireball);													
													item_OOOdriver.set_eftTime(player.getItemStackFromSlot(EntityEquipmentSlot.FEET),0);
												}	
											}
										}else if (this.get_lock(armor)=="people_saver"){

											player.addPotionEffect(new PotionEffect(MobEffects.REGENERATION, 5, 4,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.SATURATION, 5, 4,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE, 5, 0,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 5, 0,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.WATER_BREATHING, 5, 0,true,false));

										}else if (this.get_lock(armor)=="kouji_genbar"){

											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 5,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.SLOWNESS, 5, 2,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.MINING_FATIGUE, 5, 2,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 4,true,false));
										}else if (this.get_lock(armor)=="tridoron_all"){

											player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 0,true,false));
											if (player.getLastAttackedEntity() instanceof EntityLivingBase & player.getLastAttackedEntityTime()<50 ){
												player.getLastAttackedEntity().addPotionEffect(new PotionEffect(MobEffects.POISON, 50, 0,true,false));
											}
											if (player.isSneaking()){

												if (item_OOOdriver.get_eftTime(player.getItemStackFromSlot(EntityEquipmentSlot.FEET)) > 2){

													Vec3d look = player.getLookVec();
													ItemArrow itemarrow = (ItemArrow) Items.ARROW;
													EntityArrow fireball = itemarrow.createArrow(world, new ItemStack(Items.ARROW), player);
													fireball.pickupStatus= EntityArrow.PickupStatus.DISALLOWED;

													world.spawnEntity(fireball);
													item_OOOdriver.set_eftTime(player.getItemStackFromSlot(EntityEquipmentSlot.FEET),0);
												}	

											}
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 8,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.REGENERATION, 5, 4,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.SATURATION, 5, 4,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE, 5, 0,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 5, 0,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.WATER_BREATHING, 5, 0,true,false));

											player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 5,true,false));
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
	/**
	 * Returns the 'max damage' factor array for the armor, each piece of armor have a durability factor (that gets
	 * multiplied by armor material factor)
	 */
	static int[] getMaxDamageArray()
	{
		return maxDamageArray;
	}


}