package KamenRiderCraftV3.item.wizard;

import org.lwjgl.opengl.GL11;

import KamenRiderCraftV3.RiderItems;
import KamenRiderCraftV3.item.ooo.item_OOOdriver;
import KamenRiderCraftV3.model.model_all_dragon;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityFireball;
import net.minecraft.entity.projectile.EntityLargeFireball;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class item_wizarddriver extends ItemArmor
{

	private static final int[] maxDamageArray = new int[] {11, 16, 15, 13};
	public String armorNamePrefix;
	public ArmorMaterial material;




	public item_wizarddriver (ArmorMaterial par2EnumArmorMaterial, int par3, int par4)
	{
		super(par2EnumArmorMaterial, par3, par4);
		this.material = par2EnumArmorMaterial;
		par2EnumArmorMaterial.getDamageReductionAmount(par4);
		this.setMaxDamage(par2EnumArmorMaterial.getDurability(par4));
		this.maxStackSize = 1;
	}



	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
	{
		if (this.get_core(stack, "2")==8){
			return "KamenRiderCraftv3:textures/armor/gold_dragon.png";
		}else if (this.get_core(stack, "2")==9){
			return "KamenRiderCraftv3:textures/armor/special_dragon.png";
		}else{

			return "KamenRiderCraftv3:textures/armor/all_dragon.png";
		}
	}

	@Override
	@SideOnly(Side.CLIENT)
	public ModelBiped getArmorModel(EntityLivingBase entityLiving,ItemStack itemStack, int armorSlot) {
		model_all_dragon armorModel = new model_all_dragon();
		if(itemStack != null){
			if(armorModel != null){

				armorModel.bipedHead.showModel = armorSlot == 0;
				armorModel.bipedHeadwear.showModel = armorSlot == 0;
				armorModel.bipedBody.showModel = armorSlot == 0;
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


	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack armor) {


		if (player.getEquipmentInSlot(1)!= null){
			if (player.getEquipmentInSlot(2)!= null){
				if (player.getEquipmentInSlot(3)!= null){
					if (player.getEquipmentInSlot(4)!= null){
						if (player.getEquipmentInSlot(2).getItem() == RiderItems.wizardlegs){
							if (player.getEquipmentInSlot(3).getItem() == RiderItems.wizardtroso){
								if (player.getEquipmentInSlot(4).getItem() == RiderItems.wizardhead){

									if(item_OOOdriver.get_eftTime(player.getEquipmentInSlot(1))<100){

										item_OOOdriver.set_eftTime(player.getEquipmentInSlot(1),item_OOOdriver.get_eftTime(player.getEquipmentInSlot(1))+1);
									}
									if (player.getEquipmentInSlot(1).getItem() == RiderItems.magewizardriver){
										player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 1));
										player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 1));
										player.addPotionEffect(new PotionEffect(Potion.jump.id, 5, 0));
									}else if (player.getEquipmentInSlot(1).getItem() == RiderItems.magewizardriver_b){
										player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 1));
										player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 1));
										player.addPotionEffect(new PotionEffect(Potion.jump.id, 5, 0));
									}else if (player.getEquipmentInSlot(1).getItem() == RiderItems.magewizardriver_g){
										player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 1));
										player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 1));
										player.addPotionEffect(new PotionEffect(Potion.jump.id, 5, 0));
									}else if (player.getEquipmentInSlot(1).getItem() == RiderItems.whitewizardriver||player.getEquipmentInSlot(1).getItem() == RiderItems.whitewizardriverf){
										player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 3));
										player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 5,1));
										player.addPotionEffect(new PotionEffect(Potion.fireResistance.id, 5, 0));
										player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 4));
										player.addPotionEffect(new PotionEffect(Potion.resistance.id, 5, 3));
									}else if (player.getEquipmentInSlot(1).getItem() == RiderItems.sorcererdriver){
										player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 2));
										player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 5,1));
										player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 3));
										player.addPotionEffect(new PotionEffect(Potion.resistance.id, 5, 4));
								
									}else if (player.getEquipmentInSlot(1).getItem() == RiderItems.blackwizardriver){
										player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 1));
										player.addPotionEffect(new PotionEffect(Potion.fireResistance.id, 5, 0));
										player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 2));
										player.addPotionEffect(new PotionEffect(Potion.resistance.id, 5, 1));
								
									}else if (player.getEquipmentInSlot(1).getItem() == RiderItems.darkwizardriver){
										player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 0));
										player.addPotionEffect(new PotionEffect(Potion.fireResistance.id, 5, 0));
									}else if (player.getEquipmentInSlot(1).getItem() == RiderItems.beastdriver){
										if (this.get_core(armor, "1")==0){
											player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 1));
											player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 5, 1));
											player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 0));
											player.addPotionEffect(new PotionEffect(Potion.resistance.id, 5, 0));
										}else if (this.get_core(armor, "1")==1){
											player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 1));
											player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 5, 1));
											player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 0));
											player.addPotionEffect(new PotionEffect(Potion.resistance.id, 5, 0));
											player.addPotionEffect(new PotionEffect(Potion.jump.id, 5, 5));
										}else if (this.get_core(armor, "1")==2){
											player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 1));
											player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 5, 1));
											player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 0));
											player.addPotionEffect(new PotionEffect(Potion.resistance.id, 5, 0));
											player.addPotionEffect(new PotionEffect(Potion.invisibility.id, 5, 0));
										}else if (this.get_core(armor, "1")==3){
											player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 1));
											player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 5, 1));
											player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 1));
											player.addPotionEffect(new PotionEffect(Potion.resistance.id, 5, 1));
										}else if (this.get_core(armor, "1")==4){
											player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 1));
											player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 5, 1));
											player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 0));
											player.addPotionEffect(new PotionEffect(Potion.resistance.id, 5, 0));
											player.addPotionEffect(new PotionEffect(Potion.waterBreathing.id, 5, 0));
											if (player.isSneaking()){
												if(player.isInWater()){
													Vec3 look = player.getLookVec();
													player.motionX=look.xCoord;
													player.motionY=look.yCoord;
													player.motionZ=look.zCoord;
												}}
										}else if (this.get_core(armor, "1")==5){
											player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 5));
											player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 5, 3));
											player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 3));
											player.addPotionEffect(new PotionEffect(Potion.resistance.id, 5, 2));
											player.addPotionEffect(new PotionEffect(Potion.jump.id, 5, 5));
										}else if (this.get_core(armor, "1")==6){
											if (player.getCurrentEquippedItem()==null)
											{
												player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 6));
											}
											player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 1));
											player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 5, 1));
											player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 1));
											player.addPotionEffect(new PotionEffect(Potion.resistance.id, 5, 2));
										}
									}
									
									else if (player.getEquipmentInSlot(1).getItem() == RiderItems.wizardriver){{
										if (this.get_core(armor, "1")==0){
											player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 0));
											player.addPotionEffect(new PotionEffect(Potion.fireResistance.id, 5, 0));

										}else if (this.get_core(armor, "1")==1){
											player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 0));
											player.addPotionEffect(new PotionEffect(Potion.waterBreathing.id, 5, 0));

										}else if (this.get_core(armor, "1")==2){
											player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 0));
											player.addPotionEffect(new PotionEffect(Potion.jump.id, 5, 5));

										}else if (this.get_core(armor, "1")==3){
											player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 0));
											player.addPotionEffect(new PotionEffect(Potion.resistance.id, 5, 0));

										}else if (this.get_core(armor, "1")==4){
											player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 1));
											player.addPotionEffect(new PotionEffect(Potion.fireResistance.id, 5, 0));
											player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 1));
											player.addPotionEffect(new PotionEffect(Potion.resistance.id, 5, 0));

										}else if (this.get_core(armor, "1")==5){
											player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 1));
											player.addPotionEffect(new PotionEffect(Potion.waterBreathing.id, 5, 0));
											player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 1));
											player.addPotionEffect(new PotionEffect(Potion.resistance.id, 5, 0));

										}else if (this.get_core(armor, "1")==6){
											player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 1));
											player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 1));
											player.addPotionEffect(new PotionEffect(Potion.resistance.id, 5, 0));
											player.addPotionEffect(new PotionEffect(Potion.jump.id, 5, 8));


										}else if (this.get_core(armor, "1")==7){
											player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 1));
											player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 1));
											player.addPotionEffect(new PotionEffect(Potion.resistance.id, 5, 2));

										}else if (this.get_core(armor, "1")==8){
											player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 3));
											player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 5,1));
											player.addPotionEffect(new PotionEffect(Potion.fireResistance.id, 5, 0));
											player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 4));
											player.addPotionEffect(new PotionEffect(Potion.resistance.id, 5, 5));
											player.addPotionEffect(new PotionEffect(Potion.jump.id, 5, 8));
											player.addPotionEffect(new PotionEffect(Potion.waterBreathing.id, 5, 0));

										}else if (this.get_core(armor, "1")==9){
											player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 3));
											player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 5,3));
											player.addPotionEffect(new PotionEffect(Potion.fireResistance.id, 5, 0));
											player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 6));
											player.addPotionEffect(new PotionEffect(Potion.resistance.id, 5, 6));
											player.addPotionEffect(new PotionEffect(Potion.jump.id, 5, 8));
											player.addPotionEffect(new PotionEffect(Potion.waterBreathing.id, 5, 0));

										}if (this.get_core(armor, "2")==6){
											player.fallDistance=0;
											if (player.isSneaking()){
												Vec3 look = player.getLookVec();
												player.motionX=look.xCoord/2;
												player.motionY=look.yCoord/2;
												player.motionZ=look.zCoord/2;
											}
										}else if (this.get_core(armor, "2")==5){
											if (player.isSneaking()){
												if(player.isInWater()){
													Vec3 look = player.getLookVec();
													player.motionX=look.xCoord;
													player.motionY=look.yCoord;
													player.motionZ=look.zCoord;
												}}
										}else if (this.get_core(armor, "2")==4){
											player.fallDistance=0;
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
										}else if (this.get_core(armor, "2")==7){
											if (player.getCurrentEquippedItem()==null)
											{
												player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 6));

											}
										}else if (this.get_core(armor, "2")==1||this.get_core(armor, "2")==9){
											player.fallDistance=0;
											if (player.isSneaking()){
												if(player.isInWater()){
													Vec3 look = player.getLookVec();
													player.motionX=look.xCoord;
													player.motionY=look.yCoord;
													player.motionZ=look.zCoord;
												}else {Vec3 look = player.getLookVec();
												player.motionX=look.xCoord/2;
												player.motionY=look.yCoord/2;
												player.motionZ=look.zCoord/2;
												}
											}
											if (player.getCurrentEquippedItem()==null)
											{
												player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 6));
											}
										}else if (this.get_core(armor, "2")==3||this.get_core(armor, "2")==8){
											player.fallDistance=0;
											if (player.isSneaking()){
												if(player.isInWater()){
													Vec3 look = player.getLookVec();
													player.motionX=look.xCoord;
													player.motionY=look.yCoord;
													player.motionZ=look.zCoord;
												}else {Vec3 look = player.getLookVec();
												player.motionX=look.xCoord;
												player.motionY=look.yCoord;
												player.motionZ=look.zCoord;
												}
											}
											if (player.getCurrentEquippedItem()==null)
											{
												player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 8));
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