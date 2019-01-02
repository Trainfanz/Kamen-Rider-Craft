package KamenRiderCraftV3.item.ryuki;

import org.lwjgl.opengl.GL11;

import KamenRiderCraftV3.RiderItems;
import KamenRiderCraftV3.item.ooo.item_OOOdriver;
import KamenRiderCraftV3.model.Biped;
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

public class item_ryukidriver extends ItemArmor
{

	private static final int[] maxDamageArray = new int[] {11, 16, 15, 13};
	public String armorNamePrefix;
	public ArmorMaterial material;

	public String Rider;



	public item_ryukidriver (ArmorMaterial par2EnumArmorMaterial, int par3, int par4, String rider)
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
				GL11.glScaled(0.5, 0.5,0.5);

				GL11.glTranslatef((float) (0f+dri),-1.4f,0.4f);
				Minecraft.getMinecraft().getItemRenderer().renderItem(entityLiving, itemStack,null);

				GL11.glPopMatrix();

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
						if (player.getEquipmentInSlot(2).getItem() == RiderItems.ryukilegs){
							if (player.getEquipmentInSlot(3).getItem() == RiderItems.ryukitroso){
								if (player.getEquipmentInSlot(4).getItem() == RiderItems.ryukihead){
									if(item_OOOdriver.get_eftTime(player.getEquipmentInSlot(1))<100){

										item_OOOdriver.set_eftTime(player.getEquipmentInSlot(1),item_OOOdriver.get_eftTime(player.getEquipmentInSlot(1))+1);
									}
									if (player.getEquipmentInSlot(1).getItem() == RiderItems.v_buckle_ryuki){

										if (this.get_core(armor)==0){
											player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 0));
											player.addPotionEffect(new PotionEffect(Potion.fireResistance.id, 5, 0));
											player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 5, 0));
										}else if (this.get_core(armor)==1){
											player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 4));
											player.addPotionEffect(new PotionEffect(Potion.fireResistance.id, 5, 0));
											player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 5, 1));
											player.addPotionEffect(new PotionEffect(Potion.resistance.id, 5, 2));
											player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 1));
										}else if (this.get_core(armor)==2){
											player.addPotionEffect(new PotionEffect(Potion.weakness.id, 5, 0));
										}
									}else if (player.getEquipmentInSlot(1).getItem() == RiderItems.v_buckle_knight){

										if (this.get_core(armor)==0){
											player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 0));
											player.addPotionEffect(new PotionEffect(Potion.nightVision.id, 250, 0));
											player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 0));
										}else if (this.get_core(armor)==1){
											player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 5));
											player.addPotionEffect(new PotionEffect(Potion.nightVision.id, 250, 0));
											player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 5, 0));
											player.addPotionEffect(new PotionEffect(Potion.resistance.id, 5, 2));
											player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 1));
										}
									}else if (player.getEquipmentInSlot(1).getItem() == RiderItems.v_buckle_scissors){
										player.addPotionEffect(new PotionEffect(Potion.moveSlowdown.id, 5, 0));
										player.addPotionEffect(new PotionEffect(Potion.resistance.id, 5, 0));
										player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 1));

									}else if (player.getEquipmentInSlot(1).getItem() == RiderItems.v_buckle_zolda){
										player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 0));
										player.addPotionEffect(new PotionEffect(Potion.nightVision.id, 5, 0));
										player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 0));
										if (player.isSneaking()){
											player.addPotionEffect(new PotionEffect(Potion.moveSlowdown.id, 5, 2));	
										}

									}else if (player.getEquipmentInSlot(1).getItem() == RiderItems.v_buckle_raia){
										player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 2));
										player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 1));
										player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 5, 1));

									}else if (player.getEquipmentInSlot(1).getItem() == RiderItems.v_buckle_gai){
										player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 3));
										player.addPotionEffect(new PotionEffect(Potion.digSlowdown.id, 5, 0));

									}else if (player.getEquipmentInSlot(1).getItem() == RiderItems.v_buckle_ouja){
										player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 2));
										player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 0));

									}else if (player.getEquipmentInSlot(1).getItem() == RiderItems.v_buckle_tiger){
										player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 0));
										player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 1));
										player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 5, 1));

									}else if (player.getEquipmentInSlot(1).getItem() == RiderItems.v_buckle_imperer){
										player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 0));
										player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 1));
										player.addPotionEffect(new PotionEffect(Potion.jump.id, 5, 3));						

									}else if (player.getEquipmentInSlot(1).getItem() == RiderItems.v_buckle_odin){
										player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 5));
										player.addPotionEffect(new PotionEffect(Potion.jump.id, 250, 4));
										player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 5, 0));
										player.addPotionEffect(new PotionEffect(Potion.resistance.id, 5, 4));
										player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 2));			

									}else if (player.getEquipmentInSlot(1).getItem() == RiderItems.v_buckle_ryuga){
										if (this.get_core(armor)==0){
										player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 0));
										player.addPotionEffect(new PotionEffect(Potion.fireResistance.id, 5, 0));
										player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 5, 0));
									}else if (this.get_core(armor)==1){
										player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 4));										
										player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 5, 1));
										player.addPotionEffect(new PotionEffect(Potion.resistance.id, 5, 2));
										player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 1));
										player.addPotionEffect(new PotionEffect(Potion.fireResistance.id, 5, 0));
									}
									
									}else if (player.getEquipmentInSlot(1).getItem() == RiderItems.v_buckle_femme){
										player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 0));
										player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 1));
										player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 5, 1));
										player.addPotionEffect(new PotionEffect(Potion.jump.id, 5, 3));						

									}else if (player.getEquipmentInSlot(1).getItem() == RiderItems.v_buckle_verde){
										player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 1));
										player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 2));
										player.addPotionEffect(new PotionEffect(Potion.jump.id, 5, 5));						

									}else if (player.getEquipmentInSlot(1).getItem() == RiderItems.v_buckle_abyss){
										player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 1));
										player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 2));
										player.addPotionEffect(new PotionEffect(Potion.waterBreathing.id, 5, 0));	
										
									}else if (player.getEquipmentInSlot(1).getItem() == RiderItems.alternativebelt){
										player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 1));
										player.addPotionEffect(new PotionEffect(Potion.resistance.id, 5, 1));
										
									}else if (player.getEquipmentInSlot(1).getItem() == RiderItems.alternativezerobelt){
										player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 2));
										player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 0));
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
	


	@Override
	public ModelResourceLocation getModel(ItemStack stack, EntityPlayer playerIn, int useRemaining){

		ModelResourceLocation modelresourcelocation = new ModelResourceLocation("kamenridercraftv3"+":"+stack.getUnlocalizedName().substring(5),"inventory");
		ModelResourceLocation modelresourcelocation1 = new ModelResourceLocation("kamenridercraftv3:v_buckle","inventory");
		ModelResourceLocation modelresourcelocation2 = new ModelResourceLocation("kamenridercraftv3:v_buckle_ryuki_survive","inventory");
		ModelResourceLocation modelresourcelocation3 = new ModelResourceLocation("kamenridercraftv3:v_buckle_knight_survive","inventory");
		ModelResourceLocation modelresourcelocation4 = new ModelResourceLocation("kamenridercraftv3:v_buckle_ryuga_survive","inventory");


		if (stack.getItem()==RiderItems.v_buckle_ryuki&this.get_core(stack)==1){

			return modelresourcelocation2;


		}if (stack.getItem()==RiderItems.v_buckle_knight&this.get_core(stack)==1){

			return modelresourcelocation3;
			
		}if (stack.getItem()==RiderItems.v_buckle_ryuga&this.get_core(stack)==1){

			return modelresourcelocation4;


		}if (this.get_core(stack)==2){
			return modelresourcelocation1;
		}else{
			return modelresourcelocation;
		}


	}










}