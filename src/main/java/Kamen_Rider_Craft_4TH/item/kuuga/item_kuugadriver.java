package Kamen_Rider_Craft_4TH.item.kuuga;

import javax.annotation.Nullable;

import org.lwjgl.opengl.GL11;

import Kamen_Rider_Craft_4TH.RiderItems;
import Kamen_Rider_Craft_4TH.TokuCraft_core;
import Kamen_Rider_Craft_4TH.model.model_belt;
import Kamen_Rider_Craft_4TH.util.IHasModel;
import Kamen_Rider_Craft_4TH.util.Refercence;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

public class item_kuugadriver extends ItemArmor implements IHasModel
{

	private static final int[] maxDamageArray = new int[] {11, 16, 15, 13};
	public String armorNamePrefix;
	public ArmorMaterial material;

	public String Rider;

	public item_kuugadriver (String name,ArmorMaterial par2EnumArmorMaterial, int par3, String rider)
	{
		super(par2EnumArmorMaterial, par3, EntityEquipmentSlot.FEET);
		this.material = par2EnumArmorMaterial;
		par2EnumArmorMaterial.getDamageReductionAmount(EntityEquipmentSlot.FEET);
		this.setMaxDamage(par2EnumArmorMaterial.getDurability(EntityEquipmentSlot.FEET));
		this.maxStackSize = 1;
		Rider=rider;
		setUnlocalizedName(name);
		setRegistryName(name);
		TokuCraft_core.ITEMS.add(this);
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
	public void onArmorTick(World world, EntityPlayer player, ItemStack armor) {


		if (player.getItemStackFromSlot(EntityEquipmentSlot.HEAD)!= null){
			if (player.getItemStackFromSlot(EntityEquipmentSlot.CHEST)!= null){
				if (player.getItemStackFromSlot(EntityEquipmentSlot.LEGS)!= null){
					if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET)!= null){
						if (player.getItemStackFromSlot(EntityEquipmentSlot.LEGS).getItem() == RiderItems.kuugalegs){
							if (player.getItemStackFromSlot(EntityEquipmentSlot.CHEST).getItem() == RiderItems.kuugatroso){
								if (player.getItemStackFromSlot(EntityEquipmentSlot.HEAD).getItem() == RiderItems.kuugahead){

									if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.arcle){

										if (this.get_core(armor)==0){
											player.addPotionEffect(new PotionEffect(MobEffects.WEAKNESS, 5, 2,true,false));
										}else if (this.get_core(armor)==1){
											if (player.getHeldItemMainhand().isEmpty())
											{
												player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 4,true,false));
											}
											if (player.getLastAttackedEntity()!=null){
											player.getLastAttackedEntity().setFire(100);
											}
										}else if (this.get_core(armor)==2){
											player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 0,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 0,true,false));

										}else if (this.get_core(armor)==3){
											player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 250, 0,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 5, 2,true,false));

										}else if (this.get_core(armor)==4){
											player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 0,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.SLOWNESS, 5, 0,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 0,true,false));

										}else if (this.get_core(armor)==5){
											if (player.getHeldItemMainhand().isEmpty())
											{
												player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 6,true,false));
											}
											player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 0,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 0,true,false));
										}else if (this.get_core(armor)==6){
											player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 2,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 1,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 0,true,false));

										}else if (this.get_core(armor)==7){
											player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 250, 0,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 5, 4,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 1,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 0,true,false));

										}else if (this.get_core(armor)==8){
											player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 2,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.SLOWNESS, 5, 0,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 2,true,false));

										}else if (this.get_core(armor)==9){
											if (player.getHeldItemMainhand().isEmpty())
											{
												player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 8,true,false));
											}
											player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 2,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 2,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 5, 1,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 2,true,false));
										}else if (this.get_core(armor)==10){
											if (player.getHeldItemMainhand().isEmpty())
											{
												player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 9,true,false));
											}
											player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 4,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 3,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 5, 3,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 4,true,false));
										}else if (this.get_core(armor)==11){
											if (player.getHeldItemMainhand().isEmpty())
											{
												player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 10,true,false));
											}
											player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 6,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 4,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 5, 4,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 5,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 250, 0,true,false));
										}else if (this.get_core(armor)==12){
											if (player.getHeldItemMainhand().isEmpty())
											{
												player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 12,true,false));
											}
											player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 8,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 5,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 5, 6,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 7,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 250, 0,true,false));
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
	@Nullable
	public ModelBiped getArmorModel(EntityLivingBase living, ItemStack stack, EntityEquipmentSlot slot, ModelBiped defaultModel)
	{
		if(!stack.isEmpty())
		{
			if(stack.getItem() instanceof ItemArmor)
			{
			
				model_belt armorModel = new model_belt();
				if (this.Rider=="kuuga"){
					if (this.get_core(stack)==2){
						armorModel.belt=new ItemStack(RiderItems.arcle_b);
					}else if (this.get_core(stack)==3){
						armorModel.belt=new ItemStack(RiderItems.arcle_gr);
					}else if (this.get_core(stack)==4){
						armorModel.belt=new ItemStack(RiderItems.arcle_p);
					}else if (this.get_core(stack)==11){
						armorModel.belt=new ItemStack(RiderItems.arcle_ru);
					}else if (this.get_core(stack)>4){
						armorModel.belt=new ItemStack(RiderItems.arcle_u);
					}else{
						armorModel.belt=stack;
					}
				}else {
					armorModel.belt=stack;
				}
				
				
				
				//armorModel.bipedRightLeg.showModel = slot == EntityEquipmentSlot.FEET;
				//armorModel.bipedLeftLeg.showModel = slot == EntityEquipmentSlot.FEET;
				
				armorModel.isSneak = defaultModel.isSneak;
				armorModel.isRiding = defaultModel.isRiding;
				armorModel.isChild = defaultModel.isChild;

				armorModel.rightArmPose = defaultModel.rightArmPose;
				armorModel.leftArmPose = defaultModel.leftArmPose;

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





	/**
	 * Returns the 'max damage' factor array for the armor, each piece of armor have a durability factor (that gets
	 * multiplied by armor material factor)
	 */
	static int[] getMaxDamageArray()
	{
		return maxDamageArray;
	}


}