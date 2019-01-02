package KamenRiderCraftV3.item.fourze;

import java.util.Random;

import org.lwjgl.opengl.GL11;

import KamenRiderCraftV3.RiderItems;
import KamenRiderCraftV3.item.ooo.item_OOOdriver;
import KamenRiderCraftV3.model.Biped;
import KamenRiderCraftV3.model.Bipedswich;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.boss.EntityDragon;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.BlockPos;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class item_Fourzedriver extends ItemArmor
{
	public static final String[] CircleModuleName= new String[] {"blank","rocket","magic_hand","elek","chain_array","flash","fire","schop","n_magnet","claw","cosmic","meteor","nadeshikorocket","rocketdrill"};
	public static final String[] CrossModuleName= new String[] {"blank","launcher","chainsaw","beat","smoke","stealth","pen","hand","freeze","giantfoot","net","nadeshikoboard"};
	public static final String[] TriangleModuleName= new String[] {"blank","drill","hopping","spike","gatling","water","wheel","screw","board","aero","stamper","nadeshikoboard"};
	public static final String[] SquareModuleName= new String[] {"blank","radar","camera","parachute","scissors","winch","shield","hammer","medical","s_magnet","gyro","rocket","nadeshikorocket"};

	private static final int[] maxDamageArray = new int[] {11, 16, 15, 13};
	public String armorNamePrefix;
	public ArmorMaterial material;




	public item_Fourzedriver (ArmorMaterial par2EnumArmorMaterial, int par3, int par4)
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
		Bipedswich armorModel = new Bipedswich();
		if(itemStack != null){
			if(armorModel != null){
				if (entityLiving.getEquipmentInSlot(2)!=null&entityLiving.getEquipmentInSlot(4)!=null&entityLiving.getEquipmentInSlot(3)!=null){
					if (entityLiving.getEquipmentInSlot(4).getItem() == RiderItems.Fourzehead&entityLiving.getEquipmentInSlot(2).getItem() == RiderItems.Fourzelegs&entityLiving.getEquipmentInSlot(3).getItem() == RiderItems.Fourzetroso ){
						armorModel.bipedRightArm2.showModel = armorSlot == 1;
						armorModel.bipedLeftArm2.showModel = armorSlot == 1;
						armorModel.bipedRightLeg2.showModel = armorSlot == 1;
						armorModel.bipedLeftLeg2.showModel = armorSlot == 1;
					}
					else{
						armorModel.bipedRightArm2.showModel = armorSlot == 2;
						armorModel.bipedLeftArm2.showModel = armorSlot == 2;
						armorModel.bipedRightLeg2.showModel = armorSlot == 2;
						armorModel.bipedLeftLeg2.showModel = armorSlot == 2;

					}
				}else{
					armorModel.bipedRightArm2.showModel = armorSlot == 2;
					armorModel.bipedLeftArm2.showModel = armorSlot == 2;
					armorModel.bipedRightLeg2.showModel = armorSlot == 2;
					armorModel.bipedLeftLeg2.showModel = armorSlot == 2;

				}


				armorModel.isSneak = entityLiving.isSneaking();
				armorModel.isRiding = entityLiving.isRiding();
				armorModel.isChild = entityLiving.isChild();
				armorModel.heldItemRight = entityLiving.getHeldItem() != null ? 1 :0;

				GL11.glPushMatrix();

				EntityItem entItem = new EntityItem(Minecraft.getMinecraft().thePlayer.getEntityWorld(), 0D, 0D, 0D,entityLiving.getEquipmentInSlot(1));
				//Without the below line, the item will spazz out
				entItem.hoverStart = 1.0F;

				if(entityLiving.isSneaking()){
					GL11.glRotatef(20, 1, 0, 0);	
				}

				double dri = 0; 
				GL11.glRotatef(180, 0, 1, 0);

				GL11.glRotatef(180, 0, 0, 1);
				//EntityItem entItem= new EntityItemFrame(player.worldObj);
				//RenderEntityItem.doRender(entItem,4,-0.9,0.17,0,0);
				// Minecraft.getMinecraft().getRenderItem().renderItemModel(itemStack);
				GL11.glScaled(0.5, 0.5,0.5);

				GL11.glTranslatef((float) (0f+dri),-1.4f,0.4f);
				Minecraft.getMinecraft().getItemRenderer().renderItem(entityLiving, itemStack,null);

				GL11.glPopMatrix();

				return armorModel;

			}
		}

		return null;
	}



	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
	{


		return "KamenRiderCraftV3:textures/armor/blank.png";

	}


	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack armor) {


		if (player.getEquipmentInSlot(1)!= null){
			if (player.getEquipmentInSlot(2)!= null){
				if (player.getEquipmentInSlot(3)!= null){
					if (player.getEquipmentInSlot(4)!= null){
						if (player.getEquipmentInSlot(2).getItem() == RiderItems.Fourzelegs){
							if (player.getEquipmentInSlot(3).getItem() == RiderItems.Fourzetroso){
								if (player.getEquipmentInSlot(4).getItem() == RiderItems.Fourzehead){
									if(item_OOOdriver.get_eftTime(player.getEquipmentInSlot(1))<100){

										item_OOOdriver.set_eftTime(player.getEquipmentInSlot(1),item_OOOdriver.get_eftTime(player.getEquipmentInSlot(1))+1);
									}


									if (player.getEquipmentInSlot(1).getItem() == RiderItems.Fourzedriver){

										if(armor.hasTagCompound()){

											if (CircleModuleName[armor.getTagCompound().getInteger("corecircle")]=="rocket"){
												player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 1));
												player.fallDistance=0; 
												if (player.isSneaking()){
													Vec3 look = player.getLookVec();
													player.motionX=look.xCoord/2;
													player.motionY=look.yCoord/2;
													player.motionZ=look.zCoord/2;
												}	
											}else if (CircleModuleName[armor.getTagCompound().getInteger("corecircle")]=="chain_array"){
												if (player.getCurrentEquippedItem()==null)
												{
													player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 5));
												}

											}else if (CircleModuleName[armor.getTagCompound().getInteger("corecircle")]=="flash"){
												player.addPotionEffect(new PotionEffect(Potion.nightVision.id, 5, 1));


											}else if (CircleModuleName[armor.getTagCompound().getInteger("corecircle")]=="claw"){
												if (player.getCurrentEquippedItem()==null)
												{
													player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 4));
												}

											}else if (CircleModuleName[armor.getTagCompound().getInteger("corecircle")]=="schop"){
												player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 5, 4));
											}

											if (CrossModuleName[armor.getTagCompound().getInteger("corecross")]=="launcher"){
												if (player.isSneaking()){
													if (item_OOOdriver.get_eftTime(player.getEquipmentInSlot(1)) > 45){

														Vec3 look = player.getLookVec();
														EntityArrow fireball = new EntityArrow(world, player, 5);
														fireball.canBePickedUp=0;

														world.spawnEntityInWorld(fireball);
														item_OOOdriver.set_eftTime(player.getEquipmentInSlot(1),0);
													}	
												}

											}else if (CrossModuleName[armor.getTagCompound().getInteger("corecross")]=="beat"){										
												if (player.isSneaking()){
													Random generator = new Random();
													int rand = generator.nextInt(6);
													player.playSound("note.bass",  1F,  itemRand.nextFloat() * 0.1F + 0.2F*rand);
												}

											}else if (CrossModuleName[armor.getTagCompound().getInteger("corecross")]=="chainsaw"){	
												player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 2));

											}else if (CrossModuleName[armor.getTagCompound().getInteger("corecross")]=="smoke"){	
												
										            player.worldObj.spawnParticle(EnumParticleTypes.SMOKE_LARGE,player.posX,player.posY, player.posZ, 0.0D, 0.0D, 0.0D);
										            player.worldObj.spawnParticle(EnumParticleTypes.SMOKE_LARGE,player.posX,player.posY+1, player.posZ, 0.0D, 0.0D, 0.0D);
										            player.worldObj.spawnParticle(EnumParticleTypes.SMOKE_LARGE,player.posX,player.posY+0.5, player.posZ, 0.0D, 0.0D, 0.0D);
													 

											}else if (CrossModuleName[armor.getTagCompound().getInteger("corecross")]=="stealth"){											
												player.addPotionEffect(new PotionEffect(Potion.invisibility.id, 5, 2));
												
											}else if (CrossModuleName[armor.getTagCompound().getInteger("corecross")]=="giantfoot"){		
												player.fallDistance=0; 
												if (player.isSneaking()){
													Vec3 look = player.getLookVec();	                                               
													player.motionY=-2;
												}

											}if (TriangleModuleName[armor.getTagCompound().getInteger("coretriangle")]=="drill"){
												player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 5, 2));	
												if (!world.isRemote){ 
													if (player.isSneaking()){

														if (world.getBlockState(new BlockPos(player.posX,player.posY-1, player.posZ)).getBlock()==Blocks.stone||world.getBlockState(new BlockPos(player.posX,player.posY-1, player.posZ)).getBlock()==Blocks.netherrack){
															world.setBlockState(new BlockPos(player.posX,player.posY-1, player.posZ), Blocks.air.getDefaultState());
														}
													}
												}                                         

											}else if (TriangleModuleName[armor.getTagCompound().getInteger("coretriangle")]=="screw"){											
												if (player.isInWater()){
													if (player.isSneaking()){
														Vec3 look = player.getLookVec();
														player.motionX=look.xCoord/2;
														player.motionY=look.yCoord/2;
														player.motionZ=look.zCoord/2;
													}
												}

											}else if (TriangleModuleName[armor.getTagCompound().getInteger("coretriangle")]=="hopping"){											
												player.addPotionEffect(new PotionEffect(Potion.jump.id, 5, 3));
											}else if (TriangleModuleName[armor.getTagCompound().getInteger("coretriangle")]=="gatling"){	 
												
												if (player.isSneaking()){
													if (item_OOOdriver.get_eftTime(player.getEquipmentInSlot(1)) > 2){

														Vec3 look = player.getLookVec();
														EntityArrow fireball = new EntityArrow(world, player, 5);
														fireball.canBePickedUp=0;

														world.spawnEntityInWorld(fireball);
														item_OOOdriver.set_eftTime(player.getEquipmentInSlot(1),0);
													}	
												}
											}else if (TriangleModuleName[armor.getTagCompound().getInteger("coretriangle")]=="water"){	                                                                                     
												if (player.isSneaking()){
													Vec3 look = player.getLookVec();
													player.motionX=look.xCoord/3;
													player.motionY=+0.5;
													player.motionZ=look.zCoord/3;
													if (!world.isRemote){
														if (world.isAirBlock(new BlockPos(player.posX,player.posY, player.posZ))){
															world.setBlockState(new BlockPos(player.posX,player.posY, player.posZ), Blocks.flowing_water.getDefaultState());
														}
													}
												}	                                        

											}else if (TriangleModuleName[armor.getTagCompound().getInteger("coretriangle")]=="wheel"){	        											 
												if (player.isSneaking()){
													Vec3 look = player.getLookVec();
													player.motionX=look.xCoord;												
													player.motionZ=look.zCoord;
												}

											}if (SquareModuleName[armor.getTagCompound().getInteger("coresquare")]=="radar"){
												player.addPotionEffect(new PotionEffect(Potion.nightVision.id, 5, 0));

											}else if (SquareModuleName[armor.getTagCompound().getInteger("coresquare")]=="camera"){
												if (player.isSneaking()){
													player.addPotionEffect(new PotionEffect(Potion.moveSlowdown.id, 5, 4));
												}

											}else if (SquareModuleName[armor.getTagCompound().getInteger("coresquare")]=="shield"){
												player.addPotionEffect(new PotionEffect(Potion.resistance.id, 5, 2));

											}else if (SquareModuleName[armor.getTagCompound().getInteger("coresquare")]=="hammer"){
												player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 2));	

											}else if (SquareModuleName[armor.getTagCompound().getInteger("coresquare")]=="medical"){	
												player.addPotionEffect(new PotionEffect(Potion.regeneration.id, 5, 1));

											}else if (SquareModuleName[armor.getTagCompound().getInteger("coresquare")]=="gyro"){
												player.fallDistance=0; 
												if (player.isSneaking()){
													Vec3 look = player.getLookVec();	                                               
													player.motionY=+1;
												}
											} 
										}
									

									if (this.get_core(armor)==0){
										player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 0));
										player.addPotionEffect(new PotionEffect(Potion.jump.id, 5, 1));
										player.addPotionEffect(new PotionEffect(Potion.resistance.id, 5, 0));
									}
									if (this.get_core(armor)==1){
										player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 0));
										player.addPotionEffect(new PotionEffect(Potion.jump.id, 5, 1));
										player.addPotionEffect(new PotionEffect(Potion.resistance.id, 5, 1));
										player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 5, 0));
									}
									if (this.get_core(armor)==2){
										player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 1));											
										player.addPotionEffect(new PotionEffect(Potion.resistance.id, 5, 0));
										player.addPotionEffect(new PotionEffect(Potion.fireResistance.id, 5, 0));
										player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 5, 1));
										player.addPotionEffect(new PotionEffect(Potion.moveSlowdown.id, 5, 0));
									}
									if (this.get_core(armor)==3){
										player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 2));
										player.addPotionEffect(new PotionEffect(Potion.resistance.id, 5, 1));
										player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 5, 0));
										player.addPotionEffect(new PotionEffect(Potion.moveSlowdown.id, 5, 1));
										player.addPotionEffect(new PotionEffect(Potion.fireResistance.id, 5, 0));
										player.addPotionEffect(new PotionEffect(Potion.jump.id, 5, 1));
									}
									if (this.get_core(armor)==4){
										player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 3));	
										player.addPotionEffect(new PotionEffect(Potion.resistance.id, 5, 1));
										player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 5, 1));
										player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 1));
										player.addPotionEffect(new PotionEffect(Potion.jump.id, 5, 2));
										player.addPotionEffect(new PotionEffect(Potion.regeneration.id, 5, 1));
										player.addPotionEffect(new PotionEffect(Potion.fireResistance.id, 5, 0));
										if (player.isSneaking()){
											Vec3 look = player.getLookVec();
											player.motionX=look.xCoord;
											player.motionY=look.yCoord;
											player.motionZ=look.zCoord;
										}
									}
									if (this.get_core(armor)==5){
										if (player.getCurrentEquippedItem()==null)
										{
											player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 2));
										}
										player.addPotionEffect(new PotionEffect(Potion.resistance.id, 5, 2));
										player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 5, 2));
										player.addPotionEffect(new PotionEffect(Potion.jump.id, 5, 2));
										player.addPotionEffect(new PotionEffect(Potion.regeneration.id, 5, 0));
										if (player.isSneaking()){
											Vec3 look = player.getLookVec();
											player.motionX=look.xCoord;
											player.motionY=look.yCoord;
											player.motionZ=look.zCoord;
										}
									}
									if (this.get_core(armor)==6){
										if (player.getCurrentEquippedItem()==null)
										{
											player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 4));
										}
										player.addPotionEffect(new PotionEffect(Potion.resistance.id, 5, 1));
										player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 5, 2));
										player.addPotionEffect(new PotionEffect(Potion.jump.id, 5, 2));
										player.addPotionEffect(new PotionEffect(Potion.regeneration.id, 5, 1));
									}
									if (this.get_core(armor)==7){
										player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 3));
										player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 5, 2));
										player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 2));
										player.addPotionEffect(new PotionEffect(Potion.resistance.id, 5, 1));
										player.addPotionEffect(new PotionEffect(Potion.regeneration.id, 5, 2));
										player.addPotionEffect(new PotionEffect(Potion.fireResistance.id, 5, 0));
										if (player.isSneaking()){
											Vec3 look = player.getLookVec();
											player.motionX=look.xCoord;
											player.motionY=look.yCoord;
											player.motionZ=look.zCoord;
										}
									}
									if (this.get_core(armor)==8){
										if (player.getCurrentEquippedItem()==null)
										{
											player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 4));
										}
										player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 5, 2));
										player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 3));
										player.addPotionEffect(new PotionEffect(Potion.resistance.id, 5, 2));
										player.addPotionEffect(new PotionEffect(Potion.regeneration.id, 5, 2));
										player.addPotionEffect(new PotionEffect(Potion.fireResistance.id, 5, 0));
										player.addPotionEffect(new PotionEffect(Potion.jump.id, 5, 2));
										if (player.isSneaking()){
											Vec3 look = player.getLookVec();
											player.motionX=look.xCoord;
											player.motionY=look.yCoord;
											player.motionZ=look.zCoord;
										}
									}
								}
								if (player.getEquipmentInSlot(1).getItem() == RiderItems.meteor_driver){
									if (this.get_core(armor)==0){
										player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 1));
										player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 5, 1));
										player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 1));
									}
									if (this.get_core(armor)==1){
										player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 3));
										player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 5, 2));
										player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 2));

									}
								}
								if (player.getEquipmentInSlot(1).getItem() == RiderItems.nadeshikodriver){
									player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 1));
									player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 2));
									player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 5, 0));
									player.addPotionEffect(new PotionEffect(Potion.jump.id, 5, 2));
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



/**
 * Returns the 'max damage' factor array for the armor, each piece of armor have a durability factor (that gets
 * multiplied by armor material factor)
 */
static int[] getMaxDamageArray()
{
	return maxDamageArray;
}

}