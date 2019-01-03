package KamenRiderCraftV3.item.ghost;

import org.lwjgl.opengl.GL11;

import KamenRiderCraftV3.RiderItems;
import KamenRiderCraftV3.item.ooo.item_OOOdriver;
import KamenRiderCraftV3.model.Biped;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class item_ghostdriver extends ItemArmor
{

	private static final int[] maxDamageArray = new int[] {11, 16, 15, 13};
	public String armorNamePrefix;
	public ArmorMaterial material;
	public String RIDER;
	public String LOCK;
	public int DRIVER;




	public item_ghostdriver (ArmorMaterial par2EnumArmorMaterial, int par3, int par4, String rider, String lock, int driver)
	{
		super(par2EnumArmorMaterial, par3, par4);
		this.material = par2EnumArmorMaterial;
		par2EnumArmorMaterial.getDamageReductionAmount(par4);
		this.setMaxDamage(par2EnumArmorMaterial.getDurability(par4));
		this.maxStackSize = 1;
		RIDER = rider; 
		LOCK = lock;
		DRIVER = driver;
	}

	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
	{
		return "KamenRiderCraftV3:textures/armor/blank.png";
	}

	@Override
	@SideOnly(Side.CLIENT)
	public ModelBiped getArmorModel(EntityLivingBase entityLiving,ItemStack itemStack, int armorSlot) {
		Biped armorModel = new Biped();
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
				if (RIDER!="necrom"&RIDER!="dark_necrom"){
					GL11.glTranslatef((float) (0f+dri),-1.4f,0.4f);
					Minecraft.getMinecraft().getItemRenderer().renderItem(entityLiving, itemStack,null);
				}
				GL11.glPopMatrix();

				return armorModel;
			}
		}

		return null;
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

		return itemstack.hasTagCompound() ? "_"+itemstack.getTagCompound().getInteger("rider") : rider;
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

	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack armor) {


		if (player.getEquipmentInSlot(1)!= null){
			if (player.getEquipmentInSlot(2)!= null){
				if (player.getEquipmentInSlot(3)!= null){
					if (player.getEquipmentInSlot(4)!= null){
						if (player.getEquipmentInSlot(2).getItem() == RiderItems.ghostlegs){
							if (player.getEquipmentInSlot(3).getItem() == RiderItems.ghosttroso){
								if (player.getEquipmentInSlot(4).getItem() == RiderItems.ghosthead){
									if (player.getEquipmentInSlot(1).getItem()instanceof item_ghostdriver){
										if(item_OOOdriver.get_eftTime(player.getEquipmentInSlot(1))<100){

											item_OOOdriver.set_eftTime(player.getEquipmentInSlot(1),item_OOOdriver.get_eftTime(player.getEquipmentInSlot(1))+1);
										}}
									if (this.get_lock(armor)==Item_ghost_Icons.ARMS[1]){
										if (player.isSneaking()){
											if(item_OOOdriver.get_eftTime(armor)==100){
												Vec3 look = player.getLookVec();
												world.spawnEntityInWorld(new EntityLightningBolt(world,  player.posX + look.xCoord * 8,  -1 + player.posY + look.yCoord * 5,  player.posZ + look.zCoord * 8));

												armor.damageItem(2, player);
												item_OOOdriver.set_eftTime(armor,0);
											}

										}
									}else if (this.get_lock(armor)==Item_ghost_Icons.ARMS[2]){
										player.addPotionEffect(new PotionEffect(Potion.jump.id, 5, 10));									
									}else if (this.get_lock(armor)==Item_ghost_Icons.ARMS[3]){
										player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 5, 1));	
									}else if (this.get_lock(armor)==Item_ghost_Icons.ARMS[4]){
										player.addPotionEffect(new PotionEffect(Potion.jump.id, 5, 0));	
										player.addPotionEffect(new PotionEffect(Potion.nightVision.id, 300, 0));	
									}else if (this.get_lock(armor)==Item_ghost_Icons.ARMS[6]){
										player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 5, 1));	
										player.addPotionEffect(new PotionEffect(Potion.nightVision.id, 300, 0));	
									}else if (this.get_lock(armor)==Item_ghost_Icons.ARMS[8]){
										player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 1));	
									}else if (this.get_lock(armor)==Item_ghost_Icons.ARMS[7]){
										player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 1));
										player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 5, 0));
									}else if (this.get_lock(armor)==Item_ghost_Icons.ARMS[9]){
										player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 0));	
										player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 0));	
									}else if (this.get_lock(armor)==Item_ghost_Icons.ARMS[10]){
										player.addPotionEffect(new PotionEffect(Potion.jump.id, 5, 0));	
										player.addPotionEffect(new PotionEffect(Potion.nightVision.id, 300, 0));	
									}else if (this.get_lock(armor)==Item_ghost_Icons.ARMS[11]){
										player.addPotionEffect(new PotionEffect(Potion.jump.id, 5, 1));	
										player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 5, 1));	
									}else if (this.get_lock(armor)==Item_ghost_Icons.ARMS[12]){
										player.addPotionEffect(new PotionEffect(Potion.heal.id, 5, 1));	
										player.addPotionEffect(new PotionEffect(Potion.saturation.id, 5, 1));	
									}else if (this.get_lock(armor)==Item_ghost_Icons.ARMS[14]){
										player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 2));	
										player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 5, 1));
										player.addPotionEffect(new PotionEffect(Potion.resistance.id, 5, 2));	
									}else if (this.get_lock(armor)==Item_ghost_Icons.ARMS[15]){
										player.addPotionEffect(new PotionEffect(Potion.jump.id, 5, 0));	
										player.addPotionEffect(new PotionEffect(Potion.nightVision.id, 300, 0));
										player.addPotionEffect(new PotionEffect(Potion.resistance.id, 5, 2));
									}else if (this.get_lock(armor)==Item_ghost_Icons.ARMS[16]){
										player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 0));	
										player.addPotionEffect(new PotionEffect(Potion.regeneration.id, 5, 1));
									}else if (this.get_lock(armor)==Item_ghost_Icons.ARMS[17]){
										player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 0));	
										player.addPotionEffect(new PotionEffect(Potion.jump.id, 5, 1));
									}else if (this.get_lock(armor)==Item_ghost_Icons.ARMS[18]){
										player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 0));	
										player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 0));
										player.addPotionEffect(new PotionEffect(Potion.invisibility.id, 5, 0));
										
										player.addPotionEffect(new PotionEffect(Potion.jump.id, 5, 1));
									}else if (this.get_lock(armor)==Item_ghost_Icons.ARMS[20]){

										player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 0));	
										player.addPotionEffect(new PotionEffect(Potion.regeneration.id, 5, 3));
										player.addPotionEffect(new PotionEffect(Potion.resistance.id, 5, 2));
									}else if (this.get_lock(armor)==Item_ghost_Icons.ARMS[21]){
										player.addPotionEffect(new PotionEffect(Potion.jump.id, 5, 5));	
										player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 2));
										player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 1));
										player.addPotionEffect(new PotionEffect(Potion.resistance.id, 5, 1));
										if (player.isSneaking()){
											Vec3 look = player.getLookVec();
											player.motionX=look.xCoord/2;
											player.motionY=look.yCoord/2;
											player.motionZ=look.zCoord/2;
										}	
										
										player.addPotionEffect(new PotionEffect(Potion.jump.id, 5, 1));
									}else if (this.get_lock(armor)==Item_ghost_Icons.ARMS[22]){

										player.addPotionEffect(new PotionEffect(Potion.nightVision.id, 300, 0));	
										player.addPotionEffect(new PotionEffect(Potion.regeneration.id, 5, 2));
										player.addPotionEffect(new PotionEffect(Potion.resistance.id, 5, 1));
									}else if (this.get_lock(armor)==Item_ghost_Icons.ARMS[23]){

										player.addPotionEffect(new PotionEffect(Potion.jump.id, 5, 5));	
										player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 2));
										player.addPotionEffect(new PotionEffect(Potion.resistance.id, 5, 1));
									}else if (this.get_lock(armor)==Item_ghost_Icons.ARMS[19]){

										player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 1));
										player.addPotionEffect(new PotionEffect(Potion.invisibility.id, 5, 0));
										player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 1));
										player.addPotionEffect(new PotionEffect(Potion.resistance.id, 5, 0));
									}else if (this.get_lock(armor)==Item_ghost_Icons.ARMS[31]){
										player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 1));
										player.addPotionEffect(new PotionEffect(Potion.confusion.id, 5, 1));
									}else if (this.get_lock(armor)==Item_ghost_Icons.ARMS[32]){
										player.addPotionEffect(new PotionEffect(Potion.regeneration.id, 5, 1));
									}else if (this.get_lock(armor)==Item_ghost_Icons.ARMS[33]){
										player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 5, 1));
										player.addPotionEffect(new PotionEffect(Potion.nightVision.id, 300, 1));
									}else if (this.get_lock(armor)==Item_ghost_Icons.ARMS[34]){
										player.addPotionEffect(new PotionEffect(Potion.nightVision.id, 300, 1));
									}else if (this.get_lock(armor)==Item_ghost_Icons.ARMS[36]){
										player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 2));
										player.addPotionEffect(new PotionEffect(Potion.waterBreathing.id, 5, 1));
									}else if (this.get_lock(armor)==Item_ghost_Icons.ARMS[37]){
										player.addPotionEffect(new PotionEffect(Potion.regeneration.id, 5, 2));
										player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 2));
									}else if (this.get_lock(armor)==Item_ghost_Icons.ARMS[39]){
										player.addPotionEffect(new PotionEffect(Potion.regeneration.id, 5, 2));
										player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 3));
										player.addPotionEffect(new PotionEffect(Potion.resistance.id, 5, 3));
										player.addPotionEffect(new PotionEffect(Potion.nightVision.id, 300, 0));
										player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 5, 2));
									}else if (this.get_lock(armor)==Item_ghost_Icons.ARMS[40]){
										player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 3));
										player.addPotionEffect(new PotionEffect(Potion.resistance.id, 5, 4));
										player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 5, 2));
									}else if (this.get_lock(armor)==Item_ghost_Icons.ARMS[42]){
										player.addPotionEffect(new PotionEffect(Potion.jump.id, 5, 2));
										player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 0));
									}else if (this.get_lock(armor)==Item_ghost_Icons.ARMS[62]){
										player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 2));
										player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 0));
										player.addPotionEffect(new PotionEffect(Potion.nightVision.id, 5, 0));
								
										
									}
									if (player.getEquipmentInSlot(1).getItem() == RiderItems.ghostdriver){
										player.fallDistance=0; 
										if (this.get_core(armor, "1")==0){
											player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 0));
											player.addPotionEffect(new PotionEffect(Potion.invisibility.id, 5, 0));
										


										}else if (this.get_core(armor, "1")==1){
											player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 0));
											player.addPotionEffect(new PotionEffect(Potion.invisibility.id, 5, 0));
											player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 3));
											player.addPotionEffect(new PotionEffect(Potion.resistance.id, 5, 2));

										}else if (this.get_core(armor, "1")==2){
											player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 3));
											player.addPotionEffect(new PotionEffect(Potion.invisibility.id, 5, 0));
											player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 5));
											player.addPotionEffect(new PotionEffect(Potion.resistance.id, 5, 5));

										}else if (this.get_core(armor, "1")==3){
											player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 1));
											player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 1));
											player.addPotionEffect(new PotionEffect(Potion.resistance.id, 5, 1));
											player.addPotionEffect(new PotionEffect(Potion.nightVision.id, 5, 0));
											player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 5, 1));
										}
									}else if (player.getEquipmentInSlot(1).getItem() == RiderItems.specterdriver){
										player.fallDistance=0; 
										if (this.get_core(armor, "1")==0){
											player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 0));
											player.addPotionEffect(new PotionEffect(Potion.invisibility.id, 5, 0));
											


										}else if (this.get_core(armor, "1")==1){
											player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 0));
											player.addPotionEffect(new PotionEffect(Potion.invisibility.id, 5, 0));
											player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 3));
											player.addPotionEffect(new PotionEffect(Potion.resistance.id, 5, 2));

										}else if (this.get_core(armor, "1")==2){
											player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 3));
											player.addPotionEffect(new PotionEffect(Potion.invisibility.id, 5, 0));
											player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 5));
											player.addPotionEffect(new PotionEffect(Potion.resistance.id, 5, 5));

										}
									}else if (player.getEquipmentInSlot(1).getItem() == RiderItems.dark_ghostdriver||player.getEquipmentInSlot(1).getItem() == RiderItems.zero_specterdriver){
										player.fallDistance=0; 
										if (this.get_core(armor, "1")==0){
											player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 0));
											player.addPotionEffect(new PotionEffect(Potion.invisibility.id, 5, 0));
											player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 4));
											player.addPotionEffect(new PotionEffect(Potion.resistance.id, 5, 3));
											

										}
									}else if (player.getEquipmentInSlot(1).getItem() == RiderItems.proto_mega_ulorder_b||player.getEquipmentInSlot(1).getItem() == RiderItems.proto_mega_ulorder_y||player.getEquipmentInSlot(1).getItem() == RiderItems.proto_mega_ulorder_p||player.getEquipmentInSlot(1).getItem() == RiderItems.proto_mega_ulorder_r){
										player.fallDistance=0; 
										if (this.get_core(armor, "1")==0){
											player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 1));
											player.addPotionEffect(new PotionEffect(Potion.invisibility.id, 5, 1));

											

										}
									}else if (player.getEquipmentInSlot(1).getItem() == RiderItems.mega_ulorder){
										player.fallDistance=0; 
										if (this.get_core(armor, "1")==0){
											player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 1));
											player.addPotionEffect(new PotionEffect(Potion.invisibility.id, 5, 0));
											player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 1));
											player.addPotionEffect(new PotionEffect(Potion.resistance.id, 5, 0));
										}else if (this.get_core(armor, "1")==1){
											player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 2));
											player.addPotionEffect(new PotionEffect(Potion.invisibility.id, 5, 0));
											player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 3));
											player.addPotionEffect(new PotionEffect(Potion.resistance.id, 5, 2));

										}
									}else if (player.getEquipmentInSlot(1).getItem() == RiderItems.eyecon_driver_g){
										player.fallDistance=0; 
									
											player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 1));
											player.addPotionEffect(new PotionEffect(Potion.invisibility.id, 5, 0));
											player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 2));
											player.addPotionEffect(new PotionEffect(Potion.resistance.id, 5, 2));
											player.addPotionEffect(new PotionEffect(Potion.waterBreathing.id, 5, 0));
											player.addPotionEffect(new PotionEffect(Potion.fireResistance.id, 5, 0));
											player.addPotionEffect(new PotionEffect(Potion.regeneration.id, 5, 1));
											player.addPotionEffect(new PotionEffect(Potion.nightVision.id, 300, 1));
										
									}
								}
							}
						}
					}
				}
			}
		}
	}


	static int[] getMaxDamageArray()
	{
		return maxDamageArray;
	}






}