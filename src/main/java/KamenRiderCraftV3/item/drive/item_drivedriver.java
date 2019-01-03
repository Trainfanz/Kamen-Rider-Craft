package KamenRiderCraftV3.item.drive;

import java.util.Random;

import org.lwjgl.opengl.GL11;

import KamenRiderCraftV3.RiderItems;
import KamenRiderCraftV3.item.ooo.item_OOOdriver;
import KamenRiderCraftV3.model.type_tire;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.RenderItem;
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
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class item_drivedriver extends ItemArmor
{


	public static final String[] tireName= new String[] {"type_speed","wild","max_flare","funky_spike","midnight_shadow","justice_hunter","dream_vegas","dimension_cab","massive_monster","spin_mixer","type_high_speed","type_proto_speed","mega_maxflare","technique","rumble_dump","mad_doctor","hooking_wrecker","fire_braver","rolling_gravity","road_winter","fruits","dead_heat","dead_heat_burst","formula","tridoron","attack123","people_saver","kouji_genbar","gold","type_next","type_special","f01","f02","f03","tridoron_all","miracle","type_speed_wild_technic"};

	public static final String[] tireName2nd = new String[] {"kourin","kourin_magarl","kourin_kaksarn","kourin_tomarle","kourin_kikern","wheeler_dynamics","wheeler_dynamics","chaser_mach"};


	private static final int[] maxDamageArray = new int[] {11, 16, 15, 13};
	public String armorNamePrefix;
	public ArmorMaterial material;





	public item_drivedriver (ArmorMaterial par2EnumArmorMaterial, int par3, int par4)
	{
		super(par2EnumArmorMaterial, par3, par4);
		this.material = par2EnumArmorMaterial;
		par2EnumArmorMaterial.getDamageReductionAmount(par4);
		this.setMaxDamage(par2EnumArmorMaterial.getDurability(par4));
		this.maxStackSize = 1;


	}

	@Override
	@SideOnly(Side.CLIENT)
	public ModelBiped getArmorModel(EntityLivingBase entityLiving,ItemStack itemStack, int armorSlot) {
		type_tire armorModel = new type_tire();
		if(itemStack != null){
			if(itemStack.getItem() instanceof item_drivedriver){
				int type = ((ItemArmor)itemStack.getItem()).armorType;
			}
			if(armorModel != null){

				armorModel.bipedHead.showModel = armorSlot == 0||armorSlot == 2;
				armorModel.bipedHeadwear.showModel = armorSlot == 0||armorSlot == 2;
				armorModel.bipedBody.showModel = armorSlot == 0;
				armorModel.bipedRightArm.showModel = armorSlot == 0;
				armorModel.bipedLeftArm.showModel = armorSlot == 0;
				armorModel.bipedRightLeg.showModel = armorSlot == 1||armorSlot == 2;
				armorModel.bipedLeftLeg.showModel = armorSlot == 0||armorSlot == 2;


				armorModel.isSneak = entityLiving.isSneaking();
				armorModel.isRiding = entityLiving.isRiding();
				armorModel.isChild = entityLiving.isChild();
				armorModel.heldItemRight = entityLiving.getHeldItem() != null ? 1 :0;
				armorModel.swingProgress = entityLiving.swingProgress;




				return armorModel;
			}
		}

		return null;
	}

	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
	{
		if (entity instanceof EntityLivingBase){

			EntityLivingBase player = ((EntityLivingBase)entity);


			if (player.getEquipmentInSlot(1)!= null){

				if (player.getEquipmentInSlot(1).getItem() instanceof item_drivedriver){


					return "kamenRiderCraftv3:textures/armor/"+this.get_lock(stack)+"_tire.png";




				}	
			}

		}
		return "kamenRiderCraftv3:textures/armor/blank.png";


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


		if (player.getEquipmentInSlot(1)!= null){
			if (player.getEquipmentInSlot(2)!= null){
				if (player.getEquipmentInSlot(3)!= null){
					if (player.getEquipmentInSlot(4)!= null){
						if (player.getEquipmentInSlot(2).getItem() == RiderItems.drivelegs){
							if (player.getEquipmentInSlot(3).getItem() == RiderItems.drivetroso){
								if (player.getEquipmentInSlot(4).getItem() == RiderItems.drivehead){
									if(item_OOOdriver.get_eftTime(player.getEquipmentInSlot(1))<100){

										item_OOOdriver.set_eftTime(player.getEquipmentInSlot(1),item_OOOdriver.get_eftTime(player.getEquipmentInSlot(1))+1);
									}
									if (player.getEquipmentInSlot(1).getItem() == RiderItems.drivedrivergold){

										player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 2));
										player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 5, 1));
										player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 3));
										player.addPotionEffect(new PotionEffect(Potion.resistance.id, 5, 2));
									}else if (player.getEquipmentInSlot(1).getItem() == RiderItems.lupin_belt){

										player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 0));
										player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 5, 1));
										player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 0));
									}else if (player.getEquipmentInSlot(1).getItem() == RiderItems.break_gunner_2){

										if (this.get_core(armor)==0){
											player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 1));


										}else if (this.get_core(armor)==1){
											player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 0));
											player.addPotionEffect(new PotionEffect(Potion.resistance.id, 5, 2));
											player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 4));

										}
									}else if (player.getEquipmentInSlot(1).getItem() == RiderItems.metro_pd_driver_honoh){

										player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 0));
										player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 5, 0));

									}else if (player.getEquipmentInSlot(1).getItem() == RiderItems.mach_driver_honoh){

										if (this.get_lock(armor)=="kourin_magarl"){

											player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 5, 2));

										}else if (this.get_lock(armor)=="kourin_kaksarn"){

											player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 2));

										}else if (this.get_lock(armor)=="kourin_tomarle"){

											player.addPotionEffect(new PotionEffect(Potion.moveSlowdown.id, 5, 10));

										}
										
										if (this.get_core(armor)==0){
											player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 1));
											player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 5, 1));
											player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 0));


										}else if (this.get_core(armor)==1){
											player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 2));
											player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 5, 1));
											player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 3));
											player.addPotionEffect(new PotionEffect(Potion.confusion.id, 5, 1));


										}else if (this.get_core(armor)==2){
											player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 1));
											player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 5, 1));
											player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 0));


										}else if (this.get_core(armor)==3){
											player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 3));
											player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 5, 1));
											player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 3));
											player.addPotionEffect(new PotionEffect(Potion.resistance.id, 5, 2));

										}else if (this.get_core(armor)==4){
											player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 2));
											player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 5, 1));
											player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 3));
											player.addPotionEffect(new PotionEffect(Potion.confusion.id, 5, 1));


										}else if (this.get_core(armor)==5){
											player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 0));
											player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 5, 0));
											player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 5));

										}else if (this.get_core(armor)==6){
											player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 4));
											player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 5, 2));
											player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 4));
											player.addPotionEffect(new PotionEffect(Potion.resistance.id, 5, 3));
											player.addPotionEffect(new PotionEffect(Potion.regeneration.id, 5, 0));

										}else if (this.get_core(armor)==7){
											player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 5));
											player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 5, 2));
											player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 5));
											player.addPotionEffect(new PotionEffect(Potion.resistance.id, 5, 4));
											player.addPotionEffect(new PotionEffect(Potion.regeneration.id, 5, 1));
											

										}
									}
									else if (player.getEquipmentInSlot(1).getItem() == RiderItems.drivedriver){




										if (this.get_core(armor)==0){
											player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 1));
											player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 5, 0));

										}else if (this.get_core(armor)==1){
											player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 0));
											player.addPotionEffect(new PotionEffect(Potion.resistance.id, 5, 0));

										}else if (this.get_core(armor)==2){
											player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 1));
											player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 5, 0));

										}else if (this.get_core(armor)==3){
											player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 0));
											player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 5, 0));

										}else if (this.get_core(armor)==4){
											player.addPotionEffect(new PotionEffect(Potion.nightVision.id, 5, 0));
											player.addPotionEffect(new PotionEffect(Potion.resistance.id, 5, 1));

										}else if (this.get_core(armor)==5){
											player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 1));
											player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 5, 1));

										}else if (this.get_core(armor)==6){
											player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 2));
											player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 5, 1));
											player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 3));
											player.addPotionEffect(new PotionEffect(Potion.confusion.id, 5, 1));

										}else if (this.get_core(armor)==7){
											player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 5));
											player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 5, 3));
											player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 2));


										}else if (this.get_core(armor)==8){
											player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 2));
											player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 5, 3));
											player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 4));
											player.addPotionEffect(new PotionEffect(Potion.nightVision.id, 5, 0));
											player.addPotionEffect(new PotionEffect(Potion.resistance.id, 5, 3));

											if (item_OOOdriver.get_eftTime(player.getEquipmentInSlot(1)) > 45){
												if (player.isSneaking()){

													Vec3 look = player.getLookVec();
													player.motionX=look.xCoord*3;
													player.motionY=look.yCoord;
													player.motionZ=look.zCoord*3;
													item_OOOdriver.set_eftTime(player.getEquipmentInSlot(1),0);

												}}
										}else if (this.get_core(armor)==9){
											player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 1));
											player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 5, 1));
											player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 3));

										}else if (this.get_core(armor)==10){
											player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 2));
											player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 5, 2));
											player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 2));

										}else if (this.get_core(armor)==11){
											player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 0));
											player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 5, 0));

										}else if (this.get_core(armor)==12){
											player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 1));
											player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 5, 1));
											player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 5));
											player.addPotionEffect(new PotionEffect(Potion.nightVision.id, 5, 0));
											player.addPotionEffect(new PotionEffect(Potion.resistance.id, 5, 3));

											if (item_OOOdriver.get_eftTime(player.getEquipmentInSlot(1)) > 45){
												if (player.isSneaking()){

													Vec3 look = player.getLookVec();
													player.motionX=look.xCoord*3;
													player.motionY=look.yCoord;
													player.motionZ=look.zCoord*3;
													item_OOOdriver.set_eftTime(player.getEquipmentInSlot(1),0);

												}}
										}

										if (this.get_lock(armor)=="max_flare"){

											player.addPotionEffect(new PotionEffect(Potion.fireResistance.id, 5, 0));

										}else if (this.get_lock(armor)=="funky_spike"){
											player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 0));
											if (player.getLastAttacker() instanceof EntityLivingBase & player.getLastAttackerTime()<50 ){
												player.getLastAttacker().addPotionEffect(new PotionEffect(Potion.poison.id, 50, 0));
											}

										}else if (this.get_lock(armor)=="midnight_shadow"){
											if (player.isSneaking()){
												if (item_OOOdriver.get_eftTime(player.getEquipmentInSlot(1)) > 45){

													Vec3 look = player.getLookVec();
													EntityArrow fireball = new EntityArrow(world, player, 5);
													fireball.canBePickedUp=0;

													world.spawnEntityInWorld(fireball);
													item_OOOdriver.set_eftTime(player.getEquipmentInSlot(1),0);
												}
											}



										}	else if (this.get_lock(armor)=="justice_hunter"){

											player.addPotionEffect(new PotionEffect(Potion.resistance.id, 5, 0));

										} else if (this.get_lock(armor)=="dream_vegas"){

											if (player.isSneaking()){
												if (item_OOOdriver.get_eftTime(player.getEquipmentInSlot(1)) > 45){
													player.dropItem(Items.gold_nugget, 1); 
													item_OOOdriver.set_eftTime(player.getEquipmentInSlot(1),0);
												}

											}
										}else if (this.get_lock(armor)=="dimension_cab"){

											Random generator = new Random();
											int rand = generator.nextInt(6);
											if (player.isSneaking()){
												if (item_OOOdriver.get_eftTime(player.getEquipmentInSlot(1)) > 45){

													Vec3 look = player.getLookVec();
													player.motionX=look.xCoord+rand;
													//player.motionY=look.yCoord+rand;
													player.motionZ=look.zCoord+rand;
													item_OOOdriver.set_eftTime(player.getEquipmentInSlot(1),0);
													item_OOOdriver.set_eftTime(player.getEquipmentInSlot(1),0);
												}

											}
										} else if (this.get_lock(armor)=="massive_monster"){

											player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 0));

										}  else if (this.get_lock(armor)=="spin_mixer"){

											player.addPotionEffect(new PotionEffect(Potion.resistance.id, 5, 0));
											player.addPotionEffect(new PotionEffect(Potion.moveSlowdown.id, 5, 0));

										} else if (this.get_lock(armor)=="mega_maxflare"){

											player.addPotionEffect(new PotionEffect(Potion.fireResistance.id, 5, 0));

										} else if (this.get_lock(armor)=="rumble_dump"){
											Random generator = new Random();
											int rand = generator.nextInt(4);

											player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 1));
											player.addPotionEffect(new PotionEffect(Potion.moveSlowdown.id, 5, 0));
											if (item_OOOdriver.get_eftTime(player.getEquipmentInSlot(1)) > 45){
												if (this.get_core(armor)!=1){
													Vec3 look = player.getLookVec();
													player.motionX=look.xCoord+rand-2;
													player.motionY=rand-2;
													player.motionZ=look.zCoord+rand-2;
													item_OOOdriver.set_eftTime(player.getEquipmentInSlot(1),0);
													item_OOOdriver.set_eftTime(player.getEquipmentInSlot(1),0);
												}
											}
										}else if (this.get_lock(armor)=="mad_doctor"){

											player.addPotionEffect(new PotionEffect(Potion.regeneration.id, 25, 1));

										}else if (this.get_lock(armor)=="fire_braver"){

											player.addPotionEffect(new PotionEffect(Potion.fireResistance.id, 5, 1));
											player.addPotionEffect(new PotionEffect(Potion.waterBreathing.id, 5, 1));

										}else if (this.get_lock(armor)=="rolling_gravity"){

											player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 3));
											player.addPotionEffect(new PotionEffect(Potion.moveSlowdown.id, 5, 1));
											player.addPotionEffect(new PotionEffect(Potion.digSlowdown.id, 5, 1));
										}else if (this.get_lock(armor)=="f01"){

											player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 40));

										}else if (this.get_lock(armor)=="f02"){

											player.addPotionEffect(new PotionEffect(Potion.resistance.id, 5, 3));

										}else if (this.get_lock(armor)=="f03"){

											player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 4));

										}
										//"attack123","people_saver","kouji_genbar"
										else if (this.get_lock(armor)=="attack123"){

											player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 0));
											if (player.getLastAttacker() instanceof EntityLivingBase & player.getLastAttackerTime()<50 ){
												player.getLastAttacker().addPotionEffect(new PotionEffect(Potion.poison.id, 50, 0));
											}
											if (player.isSneaking()){
												if (item_OOOdriver.get_eftTime(player.getEquipmentInSlot(1)) > 5){

													Vec3 look = player.getLookVec();
													EntityArrow fireball = new EntityArrow(world, player, 5);
													fireball.canBePickedUp=0;

													world.spawnEntityInWorld(fireball);
													item_OOOdriver.set_eftTime(player.getEquipmentInSlot(1),0);
												}
											}
										}else if (this.get_lock(armor)=="people_saver"){

											player.addPotionEffect(new PotionEffect(Potion.regeneration.id, 5, 4));
											player.addPotionEffect(new PotionEffect(Potion.saturation.id, 5, 4));
											player.addPotionEffect(new PotionEffect(Potion.fireResistance.id, 5, 0));
											player.addPotionEffect(new PotionEffect(Potion.nightVision.id, 5, 0));
											player.addPotionEffect(new PotionEffect(Potion.waterBreathing.id, 5, 0));
									
										}else if (this.get_lock(armor)=="kouji_genbar"){

											player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 5));
											player.addPotionEffect(new PotionEffect(Potion.moveSlowdown.id, 5, 2));
											player.addPotionEffect(new PotionEffect(Potion.digSlowdown.id, 5, 2));
											player.addPotionEffect(new PotionEffect(Potion.resistance.id, 5, 4));
										}else if (this.get_lock(armor)=="tridoron_all"){

											player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 0));
											if (player.getLastAttacker() instanceof EntityLivingBase & player.getLastAttackerTime()<50 ){
												player.getLastAttacker().addPotionEffect(new PotionEffect(Potion.poison.id, 50, 0));
											}
											if (player.isSneaking()){
												if (item_OOOdriver.get_eftTime(player.getEquipmentInSlot(1)) > 5){

													Vec3 look = player.getLookVec();
													EntityArrow fireball = new EntityArrow(world, player, 5);
													fireball.canBePickedUp=0;

													world.spawnEntityInWorld(fireball);
													item_OOOdriver.set_eftTime(player.getEquipmentInSlot(1),0);
												}
											}
											player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 8));
											player.addPotionEffect(new PotionEffect(Potion.regeneration.id, 5, 4));
											player.addPotionEffect(new PotionEffect(Potion.saturation.id, 5, 4));
											player.addPotionEffect(new PotionEffect(Potion.fireResistance.id, 5, 0));
											player.addPotionEffect(new PotionEffect(Potion.nightVision.id, 5, 0));
											player.addPotionEffect(new PotionEffect(Potion.waterBreathing.id, 5, 0));
									
											player.addPotionEffect(new PotionEffect(Potion.resistance.id, 5, 5));
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