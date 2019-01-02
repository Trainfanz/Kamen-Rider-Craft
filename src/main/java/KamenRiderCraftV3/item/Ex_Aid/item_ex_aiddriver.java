package KamenRiderCraftV3.item.Ex_Aid;

import org.lwjgl.opengl.GL11;

import KamenRiderCraftV3.RiderItems;
import KamenRiderCraftV3.item.gaim.Item_lockseed;
import KamenRiderCraftV3.item.gaim.item_Gaimdriver;
import KamenRiderCraftV3.item.ooo.item_OOOdriver;
import KamenRiderCraftV3.model.Biped;
import KamenRiderCraftV3.model.Model_lazer;
import KamenRiderCraftV3.model.bigBiped;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.entity.projectile.EntityFireball;
import net.minecraft.entity.projectile.EntityLargeFireball;
import net.minecraft.entity.projectile.EntitySmallFireball;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

public class item_ex_aiddriver extends ItemArmor
{

	private static final int[] maxDamageArray = new int[] {11, 16, 15, 13};
	public String armorNamePrefix;
	public ArmorMaterial material;

	public String Rider;
	public int DRIVER;



	public item_ex_aiddriver (ArmorMaterial par2EnumArmorMaterial, int par3, int par4, String rider, int driver)
	{
		super(par2EnumArmorMaterial, par3, par4);
		this.material = par2EnumArmorMaterial;
		par2EnumArmorMaterial.getDamageReductionAmount(par4);
		this.setMaxDamage(par2EnumArmorMaterial.getDurability(par4));
		this.maxStackSize = 1;
		Rider=rider;
		DRIVER = driver;

	}



	@Override
	@SideOnly(Side.CLIENT)
	public ModelBiped getArmorModel(EntityLivingBase entityLiving,ItemStack itemStack, int armorSlot) {
		Model_lazer armorModel = new Model_lazer();
		if(itemStack != null){
			if(armorModel != null){

				armorModel.bipedHead.showModel = armorSlot == 2;
				armorModel.bipedHeadwear.showModel = armorSlot == 2;
				armorModel.bipedBody.showModel = armorSlot == 2;
				armorModel.bipedRightArm.showModel = armorSlot == 2;
				armorModel.bipedLeftArm.showModel = armorSlot == 2;
				armorModel.bipedRightLeg.showModel = armorSlot == 2;
				armorModel.bipedLeftLeg.showModel = armorSlot == 2;
				
				armorModel.isSneak = entityLiving.isSneaking();
				armorModel.isRiding = entityLiving.isRiding();
				armorModel.isChild = entityLiving.isChild();
				armorModel.heldItemRight = entityLiving.getHeldItem() != null ? 1 :0;


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


	public static String get_lock(ItemStack itemstack)
	{	
		String rider = ((item_ex_aiddriver)itemstack.getItem()).Rider;

		if (rider=="truebrave") {
			return "legacygamer";

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

	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack armor) {


		if (player.getEquipmentInSlot(1)!= null){
			if (player.getEquipmentInSlot(2)!= null){
				if (player.getEquipmentInSlot(3)!= null){
					if (player.getEquipmentInSlot(4)!= null){
						if (player.getEquipmentInSlot(2).getItem() == RiderItems.ex_aidlegs){
							if (player.getEquipmentInSlot(3).getItem() == RiderItems.ex_aidtroso){
								if (player.getEquipmentInSlot(4).getItem() == RiderItems.ex_aidhead){
									if(item_OOOdriver.get_eftTime(player.getEquipmentInSlot(1))<100){

										item_OOOdriver.set_eftTime(player.getEquipmentInSlot(1),item_OOOdriver.get_eftTime(player.getEquipmentInSlot(1))+1);
									}
									if (player.getEquipmentInSlot(1).getItem() == RiderItems.gamer_driver_ex_aid){

										if (this.get_core(armor, "1")==0){
											player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 0));
											player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 5, 0));

										}else if (this.get_core(armor, "1")==1){
											player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 2));
											player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 5, 1));
											player.addPotionEffect(new PotionEffect(Potion.resistance.id, 5, 0));
											player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 0));
										}else if (this.get_core(armor, "1")==2){
											player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 1));
											player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 5, 1));
											player.addPotionEffect(new PotionEffect(Potion.resistance.id, 5, 0));
											player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 3));
										}else if (this.get_core(armor, "1")==3){
											player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 1));
											player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 5, 1));
											player.addPotionEffect(new PotionEffect(Potion.resistance.id, 5, 0));
											player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 2));
											player.addPotionEffect(new PotionEffect(Potion.nightVision.id, 250, 0));
										}else if (this.get_core(armor, "1")==4){
											player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 1));
											player.addPotionEffect(new PotionEffect(Potion.jump.id, 5, 2));
										}else if (this.get_core(armor, "1")==5){
											player.addPotionEffect(new PotionEffect(Potion.jump.id, 5, 2));
											player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 1));
											player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 5, 1));
											player.addPotionEffect(new PotionEffect(Potion.resistance.id, 5, 0));
											player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 1));
										}else if (this.get_core(armor, "1")==6){
											player.addPotionEffect(new PotionEffect(Potion.moveSlowdown.id, 5, 1));
											player.addPotionEffect(new PotionEffect(Potion.digSlowdown.id, 5, 1));
											player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 4));
											player.addPotionEffect(new PotionEffect(Potion.resistance.id, 5, 4));
										}else if (this.get_core(armor, "1")==26){
											player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 3));
											player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 5, 4));
											player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 4));
											player.addPotionEffect(new PotionEffect(Potion.resistance.id, 5, 6));
											player.addPotionEffect(new PotionEffect(Potion.fireResistance.id, 5, 0));
											player.addPotionEffect(new PotionEffect(Potion.nightVision.id, 250, 0));
											player.addPotionEffect(new PotionEffect(Potion.regeneration.id, 5, 4));
											player.addPotionEffect(new PotionEffect(Potion.saturation.id, 5, 2));
										}else if (this.get_core(armor, "1")==27){
											player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 4));
											player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 5, 4));
											player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 2));
											player.addPotionEffect(new PotionEffect(Potion.resistance.id, 5, 3));
											player.addPotionEffect(new PotionEffect(Potion.nightVision.id, 250, 0));
										}
									}else if (player.getEquipmentInSlot(1).getItem() == RiderItems.gamer_driver_brave){

										if (this.get_core(armor, "1")==0){
											player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 0));
											player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 5, 0));
											player.addPotionEffect(new PotionEffect(Potion.resistance.id, 5, 0));

										}else if (this.get_core(armor, "1")==4){
											player.addPotionEffect(new PotionEffect(Potion.resistance.id, 5, 0));
											player.addPotionEffect(new PotionEffect(Potion.jump.id, 5, 2));
											player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 0));
										}
									}else if (player.getEquipmentInSlot(1).getItem() == RiderItems.gamer_driver_proto_brave){

										if (this.get_core(armor, "1")==0){
											player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 0));
											player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 5, 0));
											player.addPotionEffect(new PotionEffect(Potion.resistance.id, 5, 0));
											player.addPotionEffect(new PotionEffect(Potion.wither.id, 5, 0));


										}else if (this.get_core(armor, "1")==4){
											player.addPotionEffect(new PotionEffect(Potion.resistance.id, 5, 0));
											player.addPotionEffect(new PotionEffect(Potion.jump.id, 5, 2));
											player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 0));
											player.addPotionEffect(new PotionEffect(Potion.wither.id, 5, 0));
										}
									}else if (player.getEquipmentInSlot(1).getItem() == RiderItems.gamer_driver_snipe){

										if (this.get_core(armor, "1")==0){
											player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 0));
											player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 5, 0));
											player.addPotionEffect(new PotionEffect(Potion.nightVision.id, 250, 0));
											if (player.isSneaking()){
												player.addPotionEffect(new PotionEffect(Potion.moveSlowdown.id, 5, 4));
											}

										}else if (this.get_core(armor, "1")==4){
											player.addPotionEffect(new PotionEffect(Potion.resistance.id, 5, 0));
											player.addPotionEffect(new PotionEffect(Potion.jump.id, 5, 2));
											player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 0));
											player.addPotionEffect(new PotionEffect(Potion.nightVision.id, 250, 0));
										}
									}else if (player.getEquipmentInSlot(1).getItem() == RiderItems.gamer_driver_proto_snipe){

										if (this.get_core(armor, "1")==0){
											player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 0));
											player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 5, 0));
											player.addPotionEffect(new PotionEffect(Potion.nightVision.id, 250, 0));
											player.addPotionEffect(new PotionEffect(Potion.wither.id, 5, 0));
											if (player.isSneaking()){
												player.addPotionEffect(new PotionEffect(Potion.moveSlowdown.id, 5, 4));
											}

										}else if (this.get_core(armor, "1")==4){
											player.addPotionEffect(new PotionEffect(Potion.resistance.id, 5, 0));
											player.addPotionEffect(new PotionEffect(Potion.jump.id, 5, 2));
											player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 0));
											player.addPotionEffect(new PotionEffect(Potion.nightVision.id, 250, 0));
											player.addPotionEffect(new PotionEffect(Potion.wither.id, 5, 0));
										}
									}else if (player.getEquipmentInSlot(1).getItem() == RiderItems.gamer_driver_lazer){

										if (this.get_core(armor, "1")==0){
											if (this.get_lock(player.getEquipmentInSlot(1))=="blank"){

												player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 5));
												player.addPotionEffect(new PotionEffect(Potion.invisibility.id, 5, 1));
											}

											player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 1));
											player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 5, 1));

										}else if (this.get_core(armor, "1")==4){
											player.addPotionEffect(new PotionEffect(Potion.resistance.id, 5, 0));
											player.addPotionEffect(new PotionEffect(Potion.jump.id, 5, 2));
											player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 1));
										}
									}else if (player.getEquipmentInSlot(1).getItem() == RiderItems.gamer_driver_fuuma){

										player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 2));
										player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 5, 2));
										player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 3));
										player.addPotionEffect(new PotionEffect(Potion.resistance.id, 5, 2));

									}
									else if (player.getEquipmentInSlot(1).getItem() == RiderItems.gamer_driver_paradox){
										if (this.get_core(armor, "1")==0){

											player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 2));
											player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 5, 2));
											player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 3));
											player.addPotionEffect(new PotionEffect(Potion.resistance.id, 5, 2));
											player.addPotionEffect(new PotionEffect(Potion.nightVision.id, 250, 0));
										}else if (this.get_core(armor, "1")==2){


										}

									}	else if (player.getEquipmentInSlot(1).getItem() == RiderItems.gamer_driver_lazer_turbo){

										player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 3));
										player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 5, 2));
										player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 1));

									}else if (player.getEquipmentInSlot(1).getItem() == RiderItems.gamer_driver_truebrave){

										player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 1));
										player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 5, 1));
										player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 3));
										player.addPotionEffect(new PotionEffect(Potion.resistance.id, 5, 1));
									}else if (player.getEquipmentInSlot(1).getItem() == RiderItems.gashacon_bugvisor_genmu){
										player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 0));
										player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 5, 1));
										player.addPotionEffect(new PotionEffect(Potion.resistance.id, 5,1));
										player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 2));
										player.addPotionEffect(new PotionEffect(Potion.regeneration.id, 5, 3));

									}else if (player.getEquipmentInSlot(1).getItem() == RiderItems.gashacon_bugvisor_ii_poppy){
										player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 1));
										player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 5, 1));
										player.addPotionEffect(new PotionEffect(Potion.resistance.id, 5,1));
										player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 1));
										player.addPotionEffect(new PotionEffect(Potion.jump.id, 5, 2));

									}else if (player.getEquipmentInSlot(1).getItem() == RiderItems.gashacon_bugvisor_ii_chronos){
										player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 4));
										player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 5, 3));
										player.addPotionEffect(new PotionEffect(Potion.resistance.id, 5,3));
										player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 3));
										player.addPotionEffect(new PotionEffect(Potion.jump.id, 5, 3));

									}else if (player.getEquipmentInSlot(1).getItem() == RiderItems.gashacon_bugvisor_ii_chronos_gemdeus){
										player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 5));
										player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 5, 4));
										player.addPotionEffect(new PotionEffect(Potion.resistance.id, 5,4));
										player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 5));
										player.addPotionEffect(new PotionEffect(Potion.jump.id, 5, 5));

									}else if (player.getEquipmentInSlot(1).getItem() == RiderItems.gamer_driver_chronos){
										player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 4));
										player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 5, 3));
										player.addPotionEffect(new PotionEffect(Potion.resistance.id, 5,3));
										player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 3));
										player.addPotionEffect(new PotionEffect(Potion.jump.id, 5, 3));

									}else if (player.getEquipmentInSlot(1).getItem() == RiderItems.rideplayerbelt||player.getEquipmentInSlot(1).getItem() == RiderItems.rideplayerbelt_nico||player.getEquipmentInSlot(1).getItem() == RiderItems.ninjaplayerbelt){
										player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 0));
										player.addPotionEffect(new PotionEffect(Potion.jump.id, 5, 0));

									}else if (player.getEquipmentInSlot(1).getItem() == RiderItems.paradoxbelt){

										if (this.get_core(armor, "1")==0){
											player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 2));
											player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 5, 2));
											player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 0));
											player.addPotionEffect(new PotionEffect(Potion.resistance.id, 5, 0));
											player.addPotionEffect(new PotionEffect(Potion.nightVision.id, 250, 0));
										}else if (this.get_core(armor, "1")==1){
											player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 0));
											player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 5, 0));
											player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 3));
											player.addPotionEffect(new PotionEffect(Potion.resistance.id, 5, 1));
										}

									}else if (player.getEquipmentInSlot(1).getItem() == RiderItems.gamer_driver_genmu){

										if (this.get_core(armor, "1")==0){
											player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 0));
											player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 5, 0));
											player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 0));
											player.addPotionEffect(new PotionEffect(Potion.wither.id, 5, 0));

										}else if (this.get_core(armor, "1")==1){
											player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 0));
											player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 5, 1));
											player.addPotionEffect(new PotionEffect(Potion.resistance.id, 5, 0));
											player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 0));

										}else if (this.get_core(armor, "1")==2){
											player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 0));
											player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 5, 1));
											player.addPotionEffect(new PotionEffect(Potion.resistance.id, 5,1));
											player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 2));
											player.addPotionEffect(new PotionEffect(Potion.regeneration.id, 5, 3));
										}else if (this.get_core(armor, "1")==4){
											player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 1));
											player.addPotionEffect(new PotionEffect(Potion.jump.id, 5, 2));
										}
									}
									if (player.getEquipmentInSlot(1).getItem() instanceof item_ex_aiddriver){

										if (this.get_lock(armor)=="robotgamer"){
											player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 1));
										}else  if (this.get_lock(armor)=="protorobotgamer"){
											player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 2));
											player.addPotionEffect(new PotionEffect(Potion.wither.id, 5, 0));
										}else if (this.get_lock(armor)=="beatgamer"){
											player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 5, 2));
										}else  if (this.get_lock(armor)=="protobeatgamer"){
											player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 5, 3));
											player.addPotionEffect(new PotionEffect(Potion.wither.id, 5, 0));
										}else if (this.get_lock(armor)=="combatgamer"){
											player.fallDistance=0;
											if (player.isSneaking()){
												Vec3 look = player.getLookVec();
												player.motionX=look.xCoord/2;
												player.motionY=look.yCoord/2;
												player.motionZ=look.zCoord/2;

											}
										}else  if (this.get_lock(armor)=="protocombatgamer"){
											player.fallDistance=0;
											if (player.isSneaking()){
												Vec3 look = player.getLookVec();
												player.motionX=look.xCoord;
												player.motionY=look.yCoord;
												player.motionZ=look.zCoord;

											}
											player.addPotionEffect(new PotionEffect(Potion.wither.id, 5, 0));
										}else if (this.get_lock(armor)=="sportsgamer"){
											player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 1));
											player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 5, 1));
										}else  if (this.get_lock(armor)=="protosportsgamer"){
											player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 2));
											player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 5, 1));
											player.addPotionEffect(new PotionEffect(Potion.wither.id, 5, 0));
										}else  if (this.get_lock(armor)=="huntergamerfull"){
											player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 3));
											player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 5, 1));
											player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 2));
											player.addPotionEffect(new PotionEffect(Potion.confusion.id, 5, 0));
										}else  if (this.get_lock(armor)=="huntergamerfang"){
											player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 2));
										}else  if (this.get_lock(armor)=="huntergamerblade"){
											player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 1));
											player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 5, 1));
											player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 1));
										}else  if (this.get_lock(armor)=="huntergamergun"){
											player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 1));
											player.addPotionEffect(new PotionEffect(Potion.nightVision.id, 250, 1));
											player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 1));
										}else  if (this.get_lock(armor)=="huntergamerclaw"){
											player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 2));
											player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 2));
										}else  if (this.get_lock(armor)=="chambaragamer"){
											player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 1));
											player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 2));
										}else  if (this.get_lock(armor)=="protochambaragamer"){
											player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 2));
											player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 2));
											player.addPotionEffect(new PotionEffect(Potion.wither.id, 5, 0));
										}else  if (this.get_lock(armor)=="burgergamer"){

											player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 4));
										}else if (this.get_lock(armor)=="pacgamer"){
											player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 2));
										}else if (this.get_lock(armor)=="famistagamer"){
											player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 5, 2));
										}else if (this.get_lock(armor)=="xeviousgamer"){
											if (player.isSneaking()){
												Vec3 look = player.getLookVec();
												player.motionX=look.xCoord;
												player.motionY=look.yCoord;
												player.motionZ=look.zCoord;
												player.fallDistance=0;
											}
										}else  if (this.get_lock(armor)=="safarigamer"){
											player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 2));
											player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 5, 2));
											player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 1));
										}else  if (this.get_lock(armor)=="fantasygamer"){
											player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5,3));
											player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 5, 2));
											player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 1));
											player.addPotionEffect(new PotionEffect(Potion.resistance.id, 5, 2));
										}else  if (this.get_lock(armor)=="legacygamer"){
											player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5,5));
											player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 5, 2));
											player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 2));
											player.addPotionEffect(new PotionEffect(Potion.resistance.id, 5, 4));
										}else  if (this.get_lock(armor)=="simulationgamer"){
											player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5,1));
											player.addPotionEffect(new PotionEffect(Potion.moveSlowdown.id, 5, 1));
											player.addPotionEffect(new PotionEffect(Potion.resistance.id, 5, 3));
											if (player.isSneaking()){
												if (item_OOOdriver.get_eftTime(player.getEquipmentInSlot(1)) > 99){

													Vec3 look = player.getLookVec();
													EntityFireball fireball = new EntityLargeFireball(world, player, 1, 1, 1);
													fireball.setPosition(
															player.posX + look.xCoord * 1.6,
															player.posY + 1,
															player.posZ + look.zCoord * 1.6);
													fireball.accelerationX = look.xCoord * 0.1;
													fireball.accelerationY = look.yCoord * 0.1;
													fireball.accelerationZ = look.zCoord * 0.1;
													world.spawnEntityInWorld(fireball);
													item_OOOdriver.set_eftTime(player.getEquipmentInSlot(1),0);

												}
											}
										}else  if (this.get_lock(armor)=="galaxiangamer"){
											if (player.isSneaking()){
												if (item_OOOdriver.get_eftTime(player.getEquipmentInSlot(1)) > 99){

													Vec3 look = player.getLookVec();
													EntityFireball fireball = new EntitySmallFireball(world, player, 1, 1, 1);
													fireball.setPosition(
															player.posX + look.xCoord * 1.6,
															player.posY + 1,
															player.posZ + look.zCoord * 1.6);
													fireball.accelerationX = look.xCoord * 0.1;
													fireball.accelerationY = look.yCoord * 0.1;
													fireball.accelerationZ = look.zCoord * 0.1;
													world.spawnEntityInWorld(fireball);
													item_OOOdriver.set_eftTime(player.getEquipmentInSlot(1),0);

												}
											}
											player.addPotionEffect(new PotionEffect(Potion.resistance.id, 5, 2));
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

	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
	{

		return "KamenRiderCraftV3:textures/armor/blank.png";

	}



	@Override
	public ModelResourceLocation getModel(ItemStack stack, EntityPlayer playerIn, int useRemaining){

		ModelResourceLocation modelresourcelocation = new ModelResourceLocation("kamenridercraftv3"+":"+stack.getUnlocalizedName().substring(5),"inventory");
		ModelResourceLocation modelresourcelocation2 = new ModelResourceLocation("kamenridercraftv3"+":"+RiderItems.blanknoitem.getUnlocalizedName().substring(5),"inventory");

		if(playerIn.getHeldItem()!=null){
			if( playerIn.getHeldItem().getItem()==RiderItems.gashacon_bugvisor_ii){
				if( this==RiderItems.gashacon_bugvisor_ii_chronicle_bugster||this==RiderItems.gashacon_bugvisor_ii_chronos||this==RiderItems.gashacon_bugvisor_ii_chronos_gemdeus||this==RiderItems.gashacon_bugvisor_ii_poppy){
					return modelresourcelocation2;
				}else{
					return modelresourcelocation;

				}
			}else{
				return modelresourcelocation;

			}	
		}else{
			return modelresourcelocation;

		}	
	}
}








