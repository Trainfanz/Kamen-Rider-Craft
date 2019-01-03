package KamenRiderCraftV3.item.W;

import org.lwjgl.opengl.GL11;

import KamenRiderCraftV3.RiderItems;
import KamenRiderCraftV3.item.gaim.item_Gaimdriver;
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

public class item_Wdriver extends ItemArmor
{


	public static final int[] Corecol1= new int[] {0xff0000,0x7dff09,0xff9204,0xd2d2d2,0x1560c5,0xd919ea,0xe0ba5d,0xff0000};
	public static final int[] Corecol2= new int[] {0xfcff00,0x6cc43e,0x818181,0xff0000,0x2c41ff,0xd45ef3,0xd9bb64,0xff0000,0xffffff,0xfcff00,0xe8cc00};
	public static final int[] Corecol3= new int[] {0x0a6e03,0xfff725,0x2e2e2e,0xff0000,0x57b7ff,0x8819ea,0xe0ba5d,0xb79449,0x0a6e03,0xe8cc00};

	private static final int[] maxDamageArray = new int[] {11, 16, 15, 13};
	public String armorNamePrefix;
	public ArmorMaterial material;




	public item_Wdriver (ArmorMaterial par2EnumArmorMaterial, int par3, int par4)
	{
		super(par2EnumArmorMaterial, par3, par4);
		this.material = par2EnumArmorMaterial;
		par2EnumArmorMaterial.getDamageReductionAmount(par4);
		this.setMaxDamage(par2EnumArmorMaterial.getDurability(par4));
		this.maxStackSize = 1;
	}
	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack armor) {


		if (player.getEquipmentInSlot(1)!= null){
			if (player.getEquipmentInSlot(2)!= null){
				if (player.getEquipmentInSlot(3)!= null){
					if (player.getEquipmentInSlot(4)!= null){
						if (player.getEquipmentInSlot(2).getItem() == RiderItems.Wlegs){
							if (player.getEquipmentInSlot(3).getItem() == RiderItems.Wtroso){
								if (player.getEquipmentInSlot(4).getItem() == RiderItems.Whead){
									ItemStack ItemStack = player.getEquipmentInSlot(1);
									if(item_OOOdriver.get_eftTime(player.getEquipmentInSlot(1))<100){

										item_OOOdriver.set_eftTime(player.getEquipmentInSlot(1),item_OOOdriver.get_eftTime(player.getEquipmentInSlot(1))+1);
									}
									if (player.getEquipmentInSlot(1).getItem() == RiderItems.Wdriver){
										if (get_core(ItemStack,"3")==0){
											player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 1));
											player.addPotionEffect(new PotionEffect(Potion.jump.id, 5, 0));


										}else 	if (get_core(ItemStack,"3")==1){
											player.addPotionEffect(new PotionEffect(Potion.fireResistance.id, 5, 0));
											player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 0));


										}else 	if (get_core(ItemStack,"3")==2){
											player.addPotionEffect(new PotionEffect(Potion.regeneration.id, 5, 0));
											player.addPotionEffect(new PotionEffect(Potion.nightVision.id, 5, 0));


										}else 	if (get_core(ItemStack,"3")==3){
											player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 4));
											player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 2));
											player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 5, 1));
											player.addPotionEffect(new PotionEffect(Potion.wither.id, 5, 0));
											player.addPotionEffect(new PotionEffect(Potion.confusion.id, 5, 0));
											
										}else 	if (get_core(ItemStack,"3")==4){
											player.addPotionEffect(new PotionEffect(Potion.resistance.id, 5, 1));
											player.addPotionEffect(new PotionEffect(Potion.jump.id, 5, 1));
											player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 2));

										}

										if (get_core(ItemStack,"1")==0){
											player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 1));
										}else if (get_core(ItemStack,"1")==1){
											player.addPotionEffect(new PotionEffect(Potion.resistance.id, 5, 1));		
										}else if (get_core(ItemStack,"1")==2){
											player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 5, 1));	
										}else if (get_core(ItemStack,"1")==3){
											player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 1));	
											player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 2));
											player.addPotionEffect(new PotionEffect(Potion.jump.id, 5, 1));
										}else if (get_core(ItemStack,"1")==6){
											player.addPotionEffect(new PotionEffect(Potion.fireResistance.id, 5, 0));
										}else if (get_core(ItemStack,"1")==4){
											player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 3));	
										}

										if (get_core(ItemStack,"2")==1){
											player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 3));
											player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 2));
											player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 5, 1));
											player.addPotionEffect(new PotionEffect(Potion.resistance.id, 5, 3));		
											player.addPotionEffect(new PotionEffect(Potion.regeneration.id, 5, 1));
											player.fallDistance=0;

										}else if (get_core(ItemStack,"2")==2){
											player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 3));
											player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 2));
											player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 5, 1));
											player.addPotionEffect(new PotionEffect(Potion.resistance.id, 5, 3));		
											player.addPotionEffect(new PotionEffect(Potion.regeneration.id, 5, 1));
											player.fallDistance=0;

											if (player.isSneaking()){
												Vec3 look = player.getLookVec();
												player.motionX=look.xCoord/2;
												player.motionY=look.yCoord/2;
												player.motionZ=look.zCoord/2;
											}
										}
										else if (get_core(ItemStack,"2")==3){
											player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 4));
											player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 3));
											player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 5, 2));
											player.addPotionEffect(new PotionEffect(Potion.resistance.id, 5, 4));		
											player.addPotionEffect(new PotionEffect(Potion.regeneration.id, 5, 1));
											player.addPotionEffect(new PotionEffect(Potion.jump.id, 5, 1));
									}
									}	
								
									if (player.getEquipmentInSlot(1).getItem() == RiderItems.accel_driver){
										if (get_core(ItemStack,"1")==0){
											player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 1));
											player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 2));
											player.addPotionEffect(new PotionEffect(Potion.resistance.id, 5, 0));
										
										
										}else if (get_core(ItemStack,"1")==1){
											player.addPotionEffect(new PotionEffect(Potion.fireResistance.id, 5, 0));
											player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 0));	
											player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 4));
											player.addPotionEffect(new PotionEffect(Potion.jump.id, 5, 0));	
											
										
										}else if (get_core(ItemStack,"1")==2){
											player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 1));	
											player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 3));
											player.addPotionEffect(new PotionEffect(Potion.resistance.id, 5, 1));
											player.addPotionEffect(new PotionEffect(Potion.fireResistance.id, 5, 0));
											player.addPotionEffect(new PotionEffect(Potion.regeneration.id, 5, 1));
											player.fallDistance=0;

											if (player.isSneaking()){
												Vec3 look = player.getLookVec();
												player.motionX=look.xCoord/2;
												player.motionY=look.yCoord/2;
												player.motionZ=look.zCoord/2;
											}

										}
									}									
								
									
								if (player.getEquipmentInSlot(1).getItem() == RiderItems.lostdriver){
										if (get_core(ItemStack,"1")==0){
											player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 1));
											player.addPotionEffect(new PotionEffect(Potion.jump.id, 5, 0));
											player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 1));
											
										
										}else if (get_core(ItemStack,"1")==1){
											player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 1));
											player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 0));
											player.addPotionEffect(new PotionEffect(Potion.jump.id, 5, 2));
											player.addPotionEffect(new PotionEffect(Potion.resistance.id, 5, 1));
									
										}else if (get_core(ItemStack,"1")==2){
											player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 2));
											player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 1));
											player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 5, 0));
											player.addPotionEffect(new PotionEffect(Potion.resistance.id, 5, 1));
											player.addPotionEffect(new PotionEffect(Potion.regeneration.id, 5, 0));
											
										}else if (get_core(ItemStack,"1")==3){
											player.addPotionEffect(new PotionEffect(Potion.weakness.id, 5, 0));
											
										}else if (get_core(ItemStack,"1")==4){
											player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 0));
											player.addPotionEffect(new PotionEffect(Potion.resistance.id, 5, 1));
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
				GL11.glPushMatrix();

				Item[] LOCK= new Item[] {RiderItems.wdriverj,RiderItems.wdriverm,RiderItems.wdrivert,RiderItems.wdrivercc,RiderItems.wdriverx,RiderItems.wdriverx,RiderItems.wdriverx};
				Item[] LOCK2= new Item[] {RiderItems.wdriverc,RiderItems.wdriverh,RiderItems.wdriverl,RiderItems.wdriverf,RiderItems.wdriverjj,RiderItems.wdriverx,RiderItems.wdriverx};

				Item[] LOCKa= new Item[] {RiderItems.blanknoitem,RiderItems.accel_drivert,RiderItems.accel_driverb};
				Item[] LOCKl= new Item[] {RiderItems.blanknoitem,RiderItems.lostdriverj,RiderItems.lostdrivere,RiderItems.lostdrivere,RiderItems.lostdriverc,RiderItems.lostdriverj};

				Item sidea= RiderItems.blanknoitem;
				Item sideb= RiderItems.blanknoitem;
				Item sideex= RiderItems.blanknoitem;
			
				if (itemStack.hasTagCompound()){
					if(itemStack.getItem() ==RiderItems.Wdriver){
						sidea= LOCK[itemStack.getTagCompound().getInteger("core1")];
						sideb= LOCK2[itemStack.getTagCompound().getInteger("core3")];
						if (itemStack.getTagCompound().getInteger("core2")>0){
							sideex= RiderItems.wdriverx;
						}
					}else if(itemStack.getItem() ==RiderItems.accel_driver){
						sidea= LOCKa[itemStack.getTagCompound().getInteger("core1")];
					}else if(itemStack.getItem() ==RiderItems.lostdriver){
						sidea= LOCKl[itemStack.getTagCompound().getInteger("core1")];
					}	
				}

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
				
				Minecraft.getMinecraft().getItemRenderer().renderItem(entityLiving,itemStack.hasTagCompound() ? new ItemStack(sidea) : new ItemStack(RiderItems.blanknoitem),null);
				Minecraft.getMinecraft().getItemRenderer().renderItem(entityLiving,itemStack.hasTagCompound() ? new ItemStack(sideb) : new ItemStack(RiderItems.blanknoitem),null);
				Minecraft.getMinecraft().getItemRenderer().renderItem(entityLiving, new ItemStack(sideex),null);

				GL11.glPopMatrix();
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




	/**
	 * Returns the 'max damage' factor array for the armor, each piece of armor have a durability factor (that gets
	 * multiplied by armor material factor)
	 */
	static int[] getMaxDamageArray()
	{
		return maxDamageArray;
	}



	/**
	@Override
	public IIcon getIcon(ItemStack stack, int renderPass){

		Item item = stack.getItem(); 

		if(renderPass == 0){

			return itemIcon;

		}else if(renderPass == 1){
			if (item==KamenRiderCraft2_core.Wdriver){
				if(get_core(stack, "2")>0){
					return itemIconx;
				}
				if (get_core(stack, "3")== 1) {
					return itemIconh;
				}else if (get_core(stack, "3")== 2) {
					return itemIconl;
				}else if (get_core(stack, "3")== 3) {
					return itemIconf;
				}else if (get_core(stack, "3")== 4) {
					return itemIconjj;
				}else{
					return itemIconc;
				}
			}else{
				return itemIcon;
			}

		}else{
			if (item==KamenRiderCraft2_core.Wdriver){

				if(get_core(stack, "2")>0){

					return itemIconx;
				}
				if (get_core(stack, "1")== 1) {
					return itemIconm;
				}else if (get_core(stack, "1")== 2) {
					return itemIcont;
				}else if (get_core(stack, "1")== 3) {
					return itemIconcc;
				}else{
					return itemIconj;
				}
			}else{
				return itemIcon;
			}

		}


	}
	 **/


}