package KamenRiderCraftV3.item.zi_o;

import org.lwjgl.opengl.GL11;

import KamenRiderCraftV3.RiderItems;
import KamenRiderCraftV3.item.gaim.item_Gaimdriver;
import KamenRiderCraftV3.item.ooo.item_OOOdriver;
import KamenRiderCraftV3.model.Biped;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import net.minecraft.item.ItemArmor.ArmorMaterial;

public class item_zi_o_driver extends ItemArmor
{
	private static final int[] maxDamageArray = new int[] {11, 16, 15, 13};
	public String armorNamePrefix;
	public ArmorMaterial material;

	public String Rider;
	public int DRIVER;

	public item_zi_o_driver (ArmorMaterial par2EnumArmorMaterial, int par3, int par4, String rider, int driver)
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
	public ModelBiped getArmorModel(EntityLivingBase entityLiving,ItemStack itemStack, int armorSlot)
	{
		Biped armorModel = new Biped();
		
		if(itemStack != null)
		{
			if(armorModel != null)
			{
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
				
				Item[] LOCK = new Item[] {RiderItems.blanknoitem,RiderItems.blanknoitem,RiderItems.blanknoitem,RiderItems.zikuu_driver_ghost,RiderItems.blanknoitem,RiderItems.blanknoitem,RiderItems.blanknoitem,RiderItems.blanknoitem,RiderItems.blanknoitem,RiderItems.blanknoitem,RiderItems.blanknoitem,RiderItems.blanknoitem,RiderItems.blanknoitem,RiderItems.blanknoitem,RiderItems.blanknoitem,RiderItems.blanknoitem,RiderItems.blanknoitem,RiderItems.blanknoitem,RiderItems.blanknoitem,RiderItems.blanknoitem};
				
				Item watch= RiderItems.blanknoitem;
				
				if (itemStack.hasTagCompound())
				{
					if (itemStack.getItem() == RiderItems.zikuu_driver_zi_o || itemStack.getItem() == RiderItems.zikuu_driver_geiz)
					{
						watch = LOCK[itemStack.getTagCompound().getInteger("seed")];
					}
				}
				
				EntityItem entItem = new EntityItem(Minecraft.getMinecraft().thePlayer.getEntityWorld(), 0D, 0D, 0D,entityLiving.getEquipmentInSlot(1));
				//Without the below line, the item will spazz out
				entItem.hoverStart = 1.0F;

				if(entityLiving.isSneaking())
				{
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

				Minecraft.getMinecraft().getItemRenderer().renderItem(entityLiving, itemStack, null);

				Minecraft.getMinecraft().getItemRenderer().renderItem(entityLiving,itemStack.hasTagCompound() ? new ItemStack(watch) : new ItemStack(RiderItems.blanknoitem),null);

				GL11.glPopMatrix();

				return armorModel;
			}
		}
		return null;
	}

	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack armor)
	{
		if (player.getEquipmentInSlot(1)!= null)
		{
			if (player.getEquipmentInSlot(2)!= null)
			{
				if (player.getEquipmentInSlot(3)!= null)
				{
					if (player.getEquipmentInSlot(4)!= null)
					{
						if (player.getEquipmentInSlot(2).getItem() == RiderItems.zi_o_legs)
						{
							if (player.getEquipmentInSlot(3).getItem() == RiderItems.zi_o_torso)
							{
								if (player.getEquipmentInSlot(4).getItem() == RiderItems.zi_o_head)
								{
									if(item_OOOdriver.get_eftTime(player.getEquipmentInSlot(1))<100){

										item_OOOdriver.set_eftTime(player.getEquipmentInSlot(1),item_OOOdriver.get_eftTime(player.getEquipmentInSlot(1))+1);
									}
									
									if (player.getEquipmentInSlot(1).getItem() instanceof item_zi_o_driver)
									{
										if (this.get_lock(armor)=="build")
										{
											player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 1,true,false));											
											player.addPotionEffect(new PotionEffect(Potion.jump.id, 5, 2,true,false));	
										}
										else if (this.get_lock(armor)=="ex-aid")
										{
											player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 1,true,false));											
											player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 5, 1,true,false));
											
											if (player.getCurrentEquippedItem()==null)
											{
												player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 4,true,false));
											}
										}
										else if (this.get_lock(armor)=="ghost")
										{
											player.fallDistance=0; 																				
											player.addPotionEffect(new PotionEffect(Potion.jump.id, 5, 1,true,false));	
											player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 2,true,false));
										}
										else if (this.get_lock(armor)=="drive")
										{
											if (item_OOOdriver.get_eftTime(player.getEquipmentInSlot(1)) > 45)
											{
                                                if (player.isSneaking())
                                                {
                                                    Vec3 look = player.getLookVec();
                                                    player.motionX=look.xCoord*3;
                                                    player.motionY=look.yCoord;
                                                    player.motionZ=look.zCoord*3;
                                                    item_OOOdriver.set_eftTime(player.getEquipmentInSlot(1),0);
                                                }
                                            }
                                            player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 1,true,false));
                                            player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 5, 2,true,false));
                                            player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 3,true,false));
										}
										else if (this.get_lock(armor)=="fourze")
										{
											player.fallDistance=0; 
											if (player.isSneaking())
											{
												Vec3 look = player.getLookVec();
												player.motionX=look.xCoord/2;
												player.motionY=look.yCoord/2;
												player.motionZ=look.zCoord/2;
											}																															
											if (player.getCurrentEquippedItem()==null)
											{
												player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 4,true,false));
											}
											player.addPotionEffect(new PotionEffect(Potion.jump.id, 5, 2,true,false));
										}
										else if (this.get_lock(armor)=="faiz")
										{
											player.addPotionEffect(new PotionEffect(Potion.resistance.id, 5, 1,true,false));																						
											player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 2,true,false));
											player.addPotionEffect(new PotionEffect(Potion.nightVision.id, 5, 0,true,false));
										}
									}
									
									if (player.getEquipmentInSlot(1).getItem() == RiderItems.zikuu_driver_zi_o)
									{
										if (this.get_core(armor)==0)
										{
											player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 1,true,false));
											player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 5, 0,true,false));
											player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 0,true,false));	
										}
									}
									else if (player.getEquipmentInSlot(1).getItem() == RiderItems.zikuu_driver_geiz)
									{
										if (this.get_core(armor)==0)
										{
											player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 0,true,false));
											player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 5, 0,true,false));
											player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 1,true,false));	
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
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
	{
		return "KamenRiderCraftV3:textures/armor/blank.png";
	}
	
	public static String get_lock(ItemStack itemstack)
	{	
		item_zi_o_driver belt = (item_zi_o_driver) itemstack.getItem();
		
		return itemstack.hasTagCompound() ? item_ridewatch.ARMS[itemstack.getTagCompound().getInteger("seed")] : "base";
	}
	
	public static void set_lock(ItemStack itemstack,int flag)
	{
		if (!itemstack.hasTagCompound())
		{
			itemstack.setTagCompound(new NBTTagCompound());
		}
		itemstack.getTagCompound().setInteger("seed", flag);
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

	/**
	 * Returns the 'max damage' factor array for the armor, each piece of armor have a durability factor (that gets
	 * multiplied by armor material factor)
	 */
	static int[] getMaxDamageArray()
	{
		return maxDamageArray;
	}
}