package KamenRiderCraftV3.item.hibiki;

import org.lwjgl.opengl.GL11;

import KamenRiderCraftV3.KamenRiderCraftV3_core;
import KamenRiderCraftV3.RiderItems;
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

public class item_hibikidriver extends ItemArmor
{

	private static final int[] maxDamageArray = new int[] {11, 16, 15, 13};
	public String armorNamePrefix;
	public ArmorMaterial material;

	public String Rider;


	public item_hibikidriver (ArmorMaterial par2EnumArmorMaterial, int par3, int par4, String rider)
	{
		super(par2EnumArmorMaterial, par3, par4);
		this.material = par2EnumArmorMaterial;
		par2EnumArmorMaterial.getDamageReductionAmount(par4);
		this.setMaxDamage(par2EnumArmorMaterial.getDurability(par4));
		this.maxStackSize = 1;
		Rider=rider;
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
					GL11.glScaled(0.35, 0.35,0.35);

					GL11.glTranslatef((float) (0f+dri),-2f,0.6f);
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

	public static int  get_core(ItemStack itemstack)
	{
		return itemstack.hasTagCompound() ? itemstack.getTagCompound().getInteger("core") :0;
	}

	public static void set_core(ItemStack itemstack, int flag)
	{
		if (!itemstack.hasTagCompound())
		{
			itemstack.setTagCompound(new NBTTagCompound());
		}
		itemstack.getTagCompound().setInteger("core", flag);
	}

	
	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack armor) {


		if (player.getEquipmentInSlot(1)!= null){
			if (player.getEquipmentInSlot(2)!= null){
				if (player.getEquipmentInSlot(3)!= null){
					if (player.getEquipmentInSlot(4)!= null){
						if (player.getEquipmentInSlot(2).getItem() == RiderItems.hibikilegs){
							if (player.getEquipmentInSlot(3).getItem() == RiderItems.hibikitroso){
								if (player.getEquipmentInSlot(4).getItem() == RiderItems.hibikihead){
									
									if (player.getEquipmentInSlot(1).getItem() == RiderItems.hibikidriver){

										if (this.get_core(armor)==0){
											player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 0));	
											player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 5, 1));	
											player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 0));	
										}
										if (this.get_core(armor)==1){
											player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 1));
											player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 5, 3));	
											player.addPotionEffect(new PotionEffect(Potion.resistance.id, 5, 0));
											player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 1));										
										}
										if (this.get_core(armor)==2){
											player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 2));
											player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 5, 3));	
											player.addPotionEffect(new PotionEffect(Potion.resistance.id, 5, 2));
											player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 1));	
											player.addPotionEffect(new PotionEffect(Potion.regeneration.id, 5, 0));	
									}
								}else if (player.getEquipmentInSlot(1).getItem() == RiderItems.ibukidriver){
									player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 1));
									player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 1));	
									player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 5, 0));	
								
								}else if (player.getEquipmentInSlot(1).getItem() == RiderItems.todorokidriver){
									player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 2));										
									player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 5, 1));	
								
								}else if (player.getEquipmentInSlot(1).getItem() == RiderItems.zankidriver){
									player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 1));
									player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 0));
									player.addPotionEffect(new PotionEffect(Potion.resistance.id, 5, 1));
								
								}else if (player.getEquipmentInSlot(1).getItem() == RiderItems.eikidriver){
									player.addPotionEffect(new PotionEffect(Potion.waterBreathing.id, 5, 0));	
									player.addPotionEffect(new PotionEffect(Potion.fireResistance.id, 5, 0));	
									player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 1));	
								
								}else if (player.getEquipmentInSlot(1).getItem() == RiderItems.dankidriver){
									player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 5, 1));	
									player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 1));
								
								}else if (player.getEquipmentInSlot(1).getItem() == RiderItems.sabakidriver){
									player.addPotionEffect(new PotionEffect(Potion.weakness.id, 5, 0));	
									player.addPotionEffect(new PotionEffect(Potion.resistance.id, 5, 1));
									player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 0));
									
								}else if (player.getEquipmentInSlot(1).getItem() == RiderItems.shukidriver){
									player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 1));
									player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 1));
									player.addPotionEffect(new PotionEffect(Potion.resistance.id, 5, 0));
									player.addPotionEffect(new PotionEffect(Potion.fireResistance.id, 5, 0));	
									player.addPotionEffect(new PotionEffect(Potion.regeneration.id, 5, 0));
									
								}else if (player.getEquipmentInSlot(1).getItem() == RiderItems.goukidriver){
									player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 2));
									player.addPotionEffect(new PotionEffect(Potion.resistance.id, 5, 1));
									player.addPotionEffect(new PotionEffect(Potion.fireResistance.id, 5, 0));
									
								}else if (player.getEquipmentInSlot(1).getItem() == RiderItems.tokidriver){
									player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 1));
									player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 2));
									player.addPotionEffect(new PotionEffect(Potion.jump.id, 5, 1));
									
								}else if (player.getEquipmentInSlot(1).getItem() == RiderItems.shoukidriver){
									player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 5, 2));	
									player.addPotionEffect(new PotionEffect(Potion.nightVision.id, 5, 0));
									player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 0));
									player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 0));
									
								}else if (player.getEquipmentInSlot(1).getItem() == RiderItems.bankidriver){
									player.addPotionEffect(new PotionEffect(Potion.nightVision.id, 5, 0));
									player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 0));
									player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 5, 1));	
									player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 1));
									player.addPotionEffect(new PotionEffect(Potion.resistance.id, 5, 1));
									player.addPotionEffect(new PotionEffect(Potion.fireResistance.id, 5, 0));
									
								}else if (player.getEquipmentInSlot(1).getItem() == RiderItems.amakidriver){	
									player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 1));
									player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 1));
									player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 5, 1));	
									player.addPotionEffect(new PotionEffect(Potion.waterBreathing.id, 5, 0));
									
								}else if (player.getEquipmentInSlot(1).getItem() == RiderItems.kyosukedriver){
									player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 1));
									player.addPotionEffect(new PotionEffect(Potion.resistance.id, 5, 2));
									player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 5, 2));	
									player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 1));
									player.addPotionEffect(new PotionEffect(Potion.jump.id, 5, 1));
									player.addPotionEffect(new PotionEffect(Potion.waterBreathing.id, 5, 0));
									player.addPotionEffect(new PotionEffect(Potion.fireResistance.id, 5, 0));
									player.addPotionEffect(new PotionEffect(Potion.nightVision.id, 5, 0));
									
								}else if (player.getEquipmentInSlot(1).getItem() == RiderItems.kabukidriver){
									player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 3));
									player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 5, 1));	
									player.addPotionEffect(new PotionEffect(Potion.resistance.id, 5, 2));
									player.addPotionEffect(new PotionEffect(Potion.jump.id, 5, 1));
									player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 0));
									player.addPotionEffect(new PotionEffect(Potion.fireResistance.id, 5, 0));
									
								}else if (player.getEquipmentInSlot(1).getItem() == RiderItems.toukidriver){
									player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 2));
									player.addPotionEffect(new PotionEffect(Potion.resistance.id, 5, 2));
									player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 0));
									player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 5, 0));	
									player.addPotionEffect(new PotionEffect(Potion.nightVision.id, 5, 0));
								
								}else if (player.getEquipmentInSlot(1).getItem() == RiderItems.kiramekidriver){
									player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 1));
									player.addPotionEffect(new PotionEffect(Potion.resistance.id, 5, 1));
									player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 1));
									player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 5, 2));	
									player.addPotionEffect(new PotionEffect(Potion.nightVision.id, 5, 0));
								
								}else if (player.getEquipmentInSlot(1).getItem() == RiderItems.nishikidriver){
									player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 0));
									player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 5, 3));	
									player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 0));
									player.addPotionEffect(new PotionEffect(Potion.fireResistance.id, 5, 0));
									player.addPotionEffect(new PotionEffect(Potion.resistance.id, 5, 1));
									player.addPotionEffect(new PotionEffect(Potion.waterBreathing.id, 5, 0));
									
								}else if (player.getEquipmentInSlot(1).getItem() == RiderItems.habatakidriver){
									player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 1));
									player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 5, 0));	
									player.addPotionEffect(new PotionEffect(Potion.resistance.id, 5, 0));
									player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 2));
									player.addPotionEffect(new PotionEffect(Potion.fireResistance.id, 5, 0));
									player.addPotionEffect(new PotionEffect(Potion.nightVision.id, 5, 0));

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