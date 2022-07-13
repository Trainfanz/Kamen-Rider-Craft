package Kamen_Rider_Craft_4TH.item.fourze;

import java.util.Random;

import javax.annotation.Nullable;

import org.lwjgl.opengl.GL11;

import Kamen_Rider_Craft_4TH.ReiwaRiderItems;
import Kamen_Rider_Craft_4TH.RiderItems;
import Kamen_Rider_Craft_4TH.ShowaRiderItems;
import Kamen_Rider_Craft_4TH.TokuCraft_core;
import Kamen_Rider_Craft_4TH.item.ooo.item_OOOdriver;
import Kamen_Rider_Craft_4TH.item.rider_armor_base.Item_form_change;
import Kamen_Rider_Craft_4TH.item.rider_armor_base.item_rider_driver;
import Kamen_Rider_Craft_4TH.item.zero_one.Item_progrise_keys;
import Kamen_Rider_Craft_4TH.item.zero_one.item_zero_onedriver;
import Kamen_Rider_Craft_4TH.model.Bipedswich;
import Kamen_Rider_Craft_4TH.potion.PotionCore;
import Kamen_Rider_Craft_4TH.util.IHasModel;
import Kamen_Rider_Craft_4TH.util.Refercence;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.boss.EntityDragon;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.init.MobEffects;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemArrow;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class item_Fourzedriver extends item_rider_driver
{
	public static final String[] CoreName= new String[] {"base","elek","fire","magnet","cosmic","rocket","rocket_drill","meteor_fusion_states","meteor_nadeshiko_fusion_states","launcher"};

	
	public static final String[] CircleModuleName= new String[] {"blank","rocket","magic_hand","elek","chain_array","flash","fire","schop","n_magnet","claw","cosmic","meteor","nadeshikorocket","rocketdrill","arm_launcher"
			,"riderman","stronger","ryuki","den_o","zx","black_rx",""};
	public static final String[] CrossModuleName= new String[] {"blank","launcher","chainsaw","beat","smoke","stealth","pen","hand","freeze","giantfoot","net","nadeshikoboard","launcher"
			,"rider_1","x","kuuga","faiz","blade","skyrider",""};
	public static final String[] TriangleModuleName= new String[] {"blank","drill","hopping","spike","gatling","water","wheel","screw","board","aero","stamper","nadeshikoboard","launcher"
			,"v3","agito","kabuto","kiva","decade","black",""};
	public static final String[] SquareModuleName= new String[] {"blank","radar","camera","parachute","scissors","winch","shield","hammer","medical","s_magnet","gyro","rocket","nadeshikorocket","arm_launcher"
			,"rider_2","amazon","hibiki","double","ooo","super_1",""};

	private static final int[] maxDamageArray = new int[] {11, 16, 15, 13};
	public String armorNamePrefix;
	public ArmorMaterial material;




	public item_Fourzedriver (String name,ArmorMaterial par2EnumArmorMaterial,String rider)
	{
		super(name,par2EnumArmorMaterial,4,rider,(Item_form_change) RiderItems.keyfuestle,RiderItems.Fourzehead, RiderItems.Fourzetroso, RiderItems.Fourzelegs);
		this.material = par2EnumArmorMaterial;
		par2EnumArmorMaterial.getDamageReductionAmount(EntityEquipmentSlot.FEET);
		this.setMaxDamage(par2EnumArmorMaterial.getDurability(EntityEquipmentSlot.FEET));
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
	public String getArmorTexture(ItemStack stack, Entity entity, EntityEquipmentSlot slot, String type)
	{
		return Refercence.MODID+":textures/armor/blank.png";
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
				Bipedswich armorModel = new Bipedswich();

				if(stack.getItem() == RiderItems.ikarosdriver) {
					armorModel.wings=new ItemStack(RiderItems.ikaros_wing);
				}else{
					armorModel.wings=new ItemStack(ShowaRiderItems.blanknoitem);
				}

				if (living.getItemStackFromSlot(EntityEquipmentSlot.HEAD)!=null&living.getItemStackFromSlot(EntityEquipmentSlot.CHEST)!=null&living.getItemStackFromSlot(EntityEquipmentSlot.LEGS)!=null){
					if (living.getItemStackFromSlot(EntityEquipmentSlot.HEAD).getItem() == RiderItems.Fourzehead&living.getItemStackFromSlot(EntityEquipmentSlot.LEGS).getItem() == RiderItems.Fourzelegs&living.getItemStackFromSlot(EntityEquipmentSlot.CHEST).getItem() == RiderItems.Fourzetroso ){
						armorModel.bipedRightArm2.showModel = slot == EntityEquipmentSlot.FEET;
						armorModel.bipedLeftArm2.showModel = slot == EntityEquipmentSlot.FEET;
						armorModel.bipedRightLeg2.showModel = slot == EntityEquipmentSlot.FEET;
						armorModel.bipedLeftLeg2.showModel = slot == EntityEquipmentSlot.FEET;
					}
					else{
						armorModel.bipedRightArm2.showModel = slot == EntityEquipmentSlot.CHEST;
						armorModel.bipedLeftArm2.showModel = slot == EntityEquipmentSlot.CHEST;
						armorModel.bipedRightLeg2.showModel = slot == EntityEquipmentSlot.CHEST;
						armorModel.bipedLeftLeg2.showModel = slot == EntityEquipmentSlot.CHEST;

					}
				}else{
					armorModel.bipedRightArm2.showModel = slot == EntityEquipmentSlot.CHEST;
					armorModel.bipedLeftArm2.showModel = slot == EntityEquipmentSlot.CHEST;
					armorModel.bipedRightLeg2.showModel = slot == EntityEquipmentSlot.CHEST;
					armorModel.bipedLeftLeg2.showModel = slot == EntityEquipmentSlot.CHEST;

				}
				if(stack.getItem() == RiderItems.ginga_oh_driver) {
					armorModel.belt=new ItemStack(ShowaRiderItems.blanknoitem);
				}else{
					armorModel.belt=stack;

				}

				armorModel.isSneak = living.isSneaking();
				armorModel.isRiding = living.isRiding();
				armorModel.isChild = living.isChild();
				return armorModel;

			}
		}

		return null;
	}

	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack armor) {

		if (player.getItemStackFromSlot(EntityEquipmentSlot.HEAD)!= null){
			if (player.getItemStackFromSlot(EntityEquipmentSlot.CHEST)!= null){
				if (player.getItemStackFromSlot(EntityEquipmentSlot.LEGS)!= null){
					if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET)!= null){
						if (player.getItemStackFromSlot(EntityEquipmentSlot.LEGS).getItem() == RiderItems.Fourzelegs){
							if (player.getItemStackFromSlot(EntityEquipmentSlot.CHEST).getItem() == RiderItems.Fourzetroso){
								if (player.getItemStackFromSlot(EntityEquipmentSlot.HEAD).getItem() == RiderItems.Fourzehead){
									if(item_OOOdriver.get_eftTime(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))<100){

										item_OOOdriver.set_eftTime(player.getItemStackFromSlot(EntityEquipmentSlot.FEET),item_OOOdriver.get_eftTime(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))+1);
									}


									if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.Fourzedriver){

										if(armor.hasTagCompound()){

											if (CircleModuleName[armor.getTagCompound().getInteger("corecircle")]=="rocket"){
												player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 1,true,false));
												player.fallDistance=0; 
												player.addPotionEffect(new PotionEffect(PotionCore.FLY_POTION, 5, 4,true,false));
											}else if (CircleModuleName[armor.getTagCompound().getInteger("corecircle")]=="chain_array"){
												if (player.getHeldItemMainhand().isEmpty())
												{
													player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 5,true,false));
												}

											}else if (CircleModuleName[armor.getTagCompound().getInteger("corecircle")]=="flash"){
												player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 250, 1,true,false));


											}else if (CircleModuleName[armor.getTagCompound().getInteger("corecircle")]=="claw"){
												if (player.getHeldItemMainhand().isEmpty())
												{
													player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 4,true,false));
												}

											}else if (CircleModuleName[armor.getTagCompound().getInteger("corecircle")]=="schop"){
												player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 4,true,false));
											}else if (CircleModuleName[armor.getTagCompound().getInteger("corecircle")]=="riderman"){
												player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 4,true,false));
											}else if (CircleModuleName[armor.getTagCompound().getInteger("corecircle")]=="stronger"){
												player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 2,true,false));
											}else if (CircleModuleName[armor.getTagCompound().getInteger("corecircle")]=="ryuki"){
												player.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE, 5, 0,true,false));
											}else if (CircleModuleName[armor.getTagCompound().getInteger("corecircle")]=="den_o"){
												player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 0,true,false));
												player.addPotionEffect(new PotionEffect(PotionCore.PUNCH_BOOST_POTION, 5, 4,true,false));
											}else if (CircleModuleName[armor.getTagCompound().getInteger("corecircle")]=="zx"){
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
											}else if (CircleModuleName[armor.getTagCompound().getInteger("corecircle")]=="black_rx"){
												player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 1,true,false));
												player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 1,true,false));
											}


											if (CrossModuleName[armor.getTagCompound().getInteger("corecross")]=="launcher"){
												/**
												if (player.isSneaking()){
													if (item_OOOdriver.get_eftTime(player.getItemStackFromSlot(EntityEquipmentSlot.FEET)) > 45){

														Vec3d look = player.getLookVec();
														EntityArrow fireball = new EntityArrow(world, player, 5);
														fireball.canBePickedUp=0;

														world.spawnEntityInWorld(fireball);
														item_OOOdriver.set_eftTime(player.getItemStackFromSlot(EntityEquipmentSlot.FEET),0);
													}	
												}
												 **/
											}else if (CrossModuleName[armor.getTagCompound().getInteger("corecross")]=="beat"){										
												if (player.isSneaking()){
													Random generator = new Random();
													int rand = generator.nextInt(6);
													//player.playSound("note.bass",  1F,  itemRand.nextFloat() * 0.1F + 0.2F*rand);
												}

											}else if (CrossModuleName[armor.getTagCompound().getInteger("corecross")]=="chainsaw"){	
												player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 2,true,false));
											}else if (CrossModuleName[armor.getTagCompound().getInteger("corecross")]=="smoke"){	
												player.world.spawnParticle(EnumParticleTypes.SMOKE_LARGE,player.posX,player.posY, player.posZ, 0.0D, 0.0D, 0.0D);
												player.world.spawnParticle(EnumParticleTypes.SMOKE_LARGE,player.posX,player.posY+1, player.posZ, 0.0D, 0.0D, 0.0D);
												player.world.spawnParticle(EnumParticleTypes.SMOKE_LARGE,player.posX,player.posY+0.5, player.posZ, 0.0D, 0.0D, 0.0D);
											}else if (CrossModuleName[armor.getTagCompound().getInteger("corecross")]=="stealth"){											
												player.addPotionEffect(new PotionEffect(MobEffects.INVISIBILITY, 5, 2,true,false));
											}else if (CrossModuleName[armor.getTagCompound().getInteger("corecross")]=="giantfoot"){		
												if (player.isSneaking()){
													player.fallDistance=0; 
													Vec3d look = player.getLookVec();	                                               
													player.motionY=-2;
												}
											}else if (CrossModuleName[armor.getTagCompound().getInteger("corecross")]=="rider_1"){											
												player.addPotionEffect(new PotionEffect(PotionCore.PUNCH_BOOST_POTION, 5, 6,true,false));
											}else if (CrossModuleName[armor.getTagCompound().getInteger("corecross")]=="x"){											
												player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 2,true,false));
											}else if (CrossModuleName[armor.getTagCompound().getInteger("corecross")]=="kuuga"){									
												player.addPotionEffect(new PotionEffect(PotionCore.PUNCH_BOOST_POTION, 5, 6,true,false));
											}else if (CrossModuleName[armor.getTagCompound().getInteger("corecross")]=="faiz"){													
												player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 5, 5,true,false));
											}else if (CrossModuleName[armor.getTagCompound().getInteger("corecross")]=="blade"){											
												player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 2,true,false));
											}else if (CrossModuleName[armor.getTagCompound().getInteger("corecross")]=="skyrider"){									
												player.addPotionEffect(new PotionEffect(PotionCore.FLY_POTION, 5, 0,true,false));
											}

											if (TriangleModuleName[armor.getTagCompound().getInteger("coretriangle")]=="drill"){
												player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 2,true,false));	
												if (!world.isRemote){ 
													if (player.isSneaking()){

														if (world.getBlockState(new BlockPos(player.posX,player.posY-1, player.posZ)).getBlock()==Blocks.STONE||world.getBlockState(new BlockPos(player.posX,player.posY-1, player.posZ)).getBlock()==Blocks.NETHERRACK){
															world.setBlockState(new BlockPos(player.posX,player.posY-1, player.posZ), Blocks.AIR.getDefaultState());
														}
													}
												}                                         

											}else if (TriangleModuleName[armor.getTagCompound().getInteger("coretriangle")]=="screw"){											
												if (player.isInWater()){
													if (player.isSneaking()){
														Vec3d look = player.getLookVec();
														player.motionX=look.x/2;
														player.motionY=look.y/2;
														player.motionZ=look.z/2;
													}
												}

											}else if (TriangleModuleName[armor.getTagCompound().getInteger("coretriangle")]=="hopping"){											
												player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 5, 3,true,false));
											}else if (TriangleModuleName[armor.getTagCompound().getInteger("coretriangle")]=="gatling"){	 

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

											}else if (TriangleModuleName[armor.getTagCompound().getInteger("coretriangle")]=="water"){	                                                                                     
												if (player.isSneaking()){
													Vec3d look = player.getLookVec();
													player.motionX=look.x/3;
													player.motionY=+0.5;
													player.motionZ=look.z/3;


													player.world.spawnParticle(EnumParticleTypes.DRIP_WATER,player.posX,player.posY, player.posZ, 0.0D, 0.0D, 0.0D);
													player.world.spawnParticle(EnumParticleTypes.DRIP_WATER,player.posX,player.posY+1, player.posZ, 0.0D, 0.0D, 0.0D);
													player.world.spawnParticle(EnumParticleTypes.DRIP_WATER,player.posX,player.posY+0.5, player.posZ, 0.0D, 0.0D, 0.0D);
												}


											}else if (TriangleModuleName[armor.getTagCompound().getInteger("coretriangle")]=="wheel"){	        											 
												if (player.isSneaking()){
													Vec3d look = player.getLookVec();
													player.motionX=look.x;												
													player.motionZ=look.z;
												}

											}else if (TriangleModuleName[armor.getTagCompound().getInteger("coretriangle")]=="v3"){											
												player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 5, 5,true,false));
											}else if (TriangleModuleName[armor.getTagCompound().getInteger("coretriangle")]=="agito"){											
												player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 2,true,false));
											}else if (TriangleModuleName[armor.getTagCompound().getInteger("coretriangle")]=="kabuto"){											
												player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 6,true,false));
											}else if (TriangleModuleName[armor.getTagCompound().getInteger("coretriangle")]=="kiva"){											
												player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 5, 6,true,false));
											}else if (TriangleModuleName[armor.getTagCompound().getInteger("coretriangle")]=="decade"){											
												player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 3,true,false));
											}else if (TriangleModuleName[armor.getTagCompound().getInteger("coretriangle")]=="black"){											
												player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 3,true,false));
											}



											if (SquareModuleName[armor.getTagCompound().getInteger("coresquare")]=="radar"){
												player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 250, 0,true,false));

											}else if (SquareModuleName[armor.getTagCompound().getInteger("coresquare")]=="camera"){
												if (player.isSneaking()){
													player.addPotionEffect(new PotionEffect(MobEffects.SLOWNESS, 5, 4,true,false));
												}

											}else if (SquareModuleName[armor.getTagCompound().getInteger("coresquare")]=="shield"){
												player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 2,true,false));

											}else if (SquareModuleName[armor.getTagCompound().getInteger("coresquare")]=="hammer"){
												player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 2,true,false));	

											}else if (SquareModuleName[armor.getTagCompound().getInteger("coresquare")]=="medical"){	
												player.addPotionEffect(new PotionEffect(MobEffects.REGENERATION, 5, 1,true,false));

											}else if (SquareModuleName[armor.getTagCompound().getInteger("coresquare")]=="gyro"){
												player.fallDistance=0; 
												if (player.isSneaking()){
													Vec3d look = player.getLookVec();	                                               
													player.motionY=+1;
												}
											} else if (SquareModuleName[armor.getTagCompound().getInteger("coresquare")]=="rider_2"){								
												player.addPotionEffect(new PotionEffect(PotionCore.PUNCH_BOOST_POTION, 5, 6,true,false));
											}else if (SquareModuleName[armor.getTagCompound().getInteger("coresquare")]=="amazon"){	
												player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 3,true,false));
											}else if (SquareModuleName[armor.getTagCompound().getInteger("coresquare")]=="hibiki"){	
												player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 2,true,false));
											}else if (SquareModuleName[armor.getTagCompound().getInteger("coresquare")]=="double"){	
												player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 2,true,false));
												player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 5, 3,true,false));
											}else if (SquareModuleName[armor.getTagCompound().getInteger("coresquare")]=="ooo"){	
												player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 250, 2,true,false));
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
											}else if (SquareModuleName[armor.getTagCompound().getInteger("coresquare")]=="super_1"){	
												player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 2,true,false));
												player.addPotionEffect(new PotionEffect(PotionCore.PUNCH_BOOST_POTION, 5, 5,true,false));
											}
										}


										if (this.get_core(armor)==0){
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 0,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 5, 1,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 0,true,false));
										}
										if (this.get_core(armor)==1){
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 0,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 5, 1,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 1,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 0,true,false));
										}
										if (this.get_core(armor)==2){
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 1,true,false));											
											player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 0,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE, 5, 0,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 1,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.SLOWNESS, 5, 0,true,false));
										}
										if (this.get_core(armor)==3){
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 2,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 1,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 0,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.SLOWNESS, 5, 1,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE, 5, 0,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 5, 1,true,false));
										}
										if (this.get_core(armor)==4){
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 3,true,false));	
											player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 1,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 1,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 1,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 5, 2,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.REGENERATION, 5, 1,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE, 5, 0,true,false));
											player.fallDistance=0; 
											player.addPotionEffect(new PotionEffect(PotionCore.FLY_POTION, 5, 4,true,false));

										}
										if (this.get_core(armor)==5){
											if (player.getHeldItemMainhand().isEmpty())
											{
												player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 2,true,false));
											}
											player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 2,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 2,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 5, 2,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.REGENERATION, 5, 0,true,false));
											player.fallDistance=0; 
											player.addPotionEffect(new PotionEffect(PotionCore.FLY_POTION, 5, 4,true,false));
										}
										if (this.get_core(armor)==6){
											if (player.getHeldItemMainhand().isEmpty())
											{
												player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 4,true,false));
											}
											player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 1,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 2,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 5, 2,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.REGENERATION, 5, 1,true,false));
										}
										if (this.get_core(armor)==7){
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 3,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 2,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 2,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 1,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.REGENERATION, 5, 2,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE, 5, 0,true,false));
											player.fallDistance=0; 
											player.addPotionEffect(new PotionEffect(PotionCore.FLY_POTION, 5, 4,true,false));

										}
										if (this.get_core(armor)==8){
											if (player.getHeldItemMainhand().isEmpty())
											{
												player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 4,true,false));
											}
											player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 2,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 3,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 2,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.REGENERATION, 5, 2,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE, 5, 0,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 5, 2,true,false));
											player.fallDistance=0; 
											player.addPotionEffect(new PotionEffect(PotionCore.FLY_POTION, 5, 4,true,false));
										}
									}
									if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.meteor_driver){
										if (this.get_core(armor)==0){
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 1,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 1,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 1,true,false));
										}
										if (this.get_core(armor)==1){
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 3,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 2,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 2,true,false));

										}
									}
									if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.nadeshikodriver){
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 1,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 5, 2,true,false));
									}
								}
							}
						}
					}
				}
			}
		}
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

	public static int get_core(ItemStack itemstack)
	{
		return itemstack.hasTagCompound() ? itemstack.getTagCompound().getInteger("core") : 0;
	}

	public static void set_core(ItemStack itemstack, int flag,String slot)
	{
		if (!itemstack.hasTagCompound())
		{
			itemstack.setTagCompound(new NBTTagCompound());
		}
		itemstack.getTagCompound().setInteger("core"+slot, flag);
	}


	public static String get_CircleModule(ItemStack itemstack)
	{
		return itemstack.hasTagCompound() ? CircleModuleName[itemstack.getTagCompound().getInteger("corecircle")]+"_module" : "blank";
	}

	public static String get_CrossModule(ItemStack itemstack)
	{
		return itemstack.hasTagCompound() ? CrossModuleName[itemstack.getTagCompound().getInteger("corecross")]+"_module" : "blank";
	}

	public static String get_TriangleModule(ItemStack itemstack)
	{
		return itemstack.hasTagCompound() ? TriangleModuleName[itemstack.getTagCompound().getInteger("coretriangle")]+"_module" : "blank";
	}

	public static String get_SquareModule(ItemStack itemstack)
	{
		return itemstack.hasTagCompound() ? SquareModuleName[itemstack.getTagCompound().getInteger("coresquare")]+"_module" : "blank";
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
						
							if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.Fourzedriver){

								return Refercence.MODID+":textures/armor/"+rider+"_"+ CoreName[item_Fourzedriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))] +ext;	
							}	else if(player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.meteor_driver){
										if (item_Fourzedriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))!=0){
										return Refercence.MODID+":textures/armor/"+"meteor_storm"+ext;	
									}else{
									return Refercence.MODID+":textures/armor/"+"meteor"+ext;
									}
							}else {

								return Refercence.MODID+":textures/armor/"+rider+ext;	
							}
							
					}else if (num==4||num==9||num==10||num==11||num==12||num==13||num==14){
						return Refercence.MODID+":textures/armor/blank"+ext;
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

	

	/**
	 * Returns the 'max damage' factor array for the armor, each piece of armor have a durability factor (that gets
	 * multiplied by armor material factor)
	 */
	static int[] getMaxDamageArray()
	{
		return maxDamageArray;
	}

	public boolean getIsRepairable(ItemStack toRepair, ItemStack repair) 
	{
		return RiderItems.astroswitch == repair.getItem() ? true : super.getIsRepairable(toRepair, repair);
	}

}