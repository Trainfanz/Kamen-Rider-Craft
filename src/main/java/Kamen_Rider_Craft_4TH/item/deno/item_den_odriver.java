package Kamen_Rider_Craft_4TH.item.deno;

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
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class item_den_odriver extends ItemArmor implements IHasModel
{



	private static final int[] maxDamageArray = new int[] {11, 16, 15, 13};
	public String armorNamePrefix;
	public ArmorMaterial material;




	public item_den_odriver (String name,ArmorMaterial par2EnumArmorMaterial, int par3)
	{
		super(par2EnumArmorMaterial, par3, EntityEquipmentSlot.FEET);
		this.material = par2EnumArmorMaterial;
		par2EnumArmorMaterial.getDamageReductionAmount(EntityEquipmentSlot.FEET);
		this.setMaxDamage(par2EnumArmorMaterial.getDurability(EntityEquipmentSlot.FEET));
		this.maxStackSize = 1;
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
						if (player.getItemStackFromSlot(EntityEquipmentSlot.LEGS).getItem() == RiderItems.den_olegs){
							if (player.getItemStackFromSlot(EntityEquipmentSlot.CHEST).getItem() == RiderItems.den_otroso){
								if (player.getItemStackFromSlot(EntityEquipmentSlot.HEAD).getItem() == RiderItems.den_ohead){

									
									if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.den_odriver&player.inventory.hasItemStack(new ItemStack (RiderItems.den_oriderpass))){

										if (this.get_core(armor)==0){
											player.addPotionEffect(new PotionEffect(MobEffects.WEAKNESS, 5, 0,true,false));
										}else if (this.get_core(armor)==1){
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 2,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 0,true,false));
										}else if (this.get_core(armor)==2){
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 0,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 2,true,false));

										}else if (this.get_core(armor)==3){
											player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 2,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 1,true,false));

										}else if (this.get_core(armor)==4){
											player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 1,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 0,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 5, 1,true,false));

										}else if (this.get_core(armor)==5){											
											player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 2,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 1,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 5, 2,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.WEAKNESS, 5, 0,true,false));
										}else if (this.get_core(armor)==6){
											player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 2,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 1,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 3,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 5, 1,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 1,true,false));
										}else if (this.get_core(armor)==7){
											player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 2,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 2,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 3,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 5, 2,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 1,true,false));

										}else if (this.get_core(armor)==8){																					
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 2,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 2,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 2,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 5, 2,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE, 5, 0,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 4,true,false));
										
										}
									}else if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.zeronosbelt){
										if (this.get_core(armor)==0){
											player.addPotionEffect(new PotionEffect(MobEffects.WEAKNESS, 5, 0,true,false));											
										}else if (this.get_core(armor)==1){
											player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 2,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 0,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 1,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 0,true,false));
										}else if (this.get_core(armor)==2){											
											player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 0,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 2,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 1,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE, 5, 0,true,false));
										}else if (this.get_core(armor)==3){
											player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 2,true,false));											
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 2,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 1,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 1,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE, 5, 0,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.REGENERATION, 5, 1,true,false));

										}										
									}if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.newden_obelt&player.inventory.hasItemStack(new ItemStack (RiderItems.den_oriderpass))){
										if (this.get_core(armor)==1){
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 2,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 1,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 1,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 2,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.REGENERATION, 5, 1,true,false));
										}else if (this.get_core(armor)==2){		
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 1,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 2,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 2,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.REGENERATION, 5, 1,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE, 5, 0,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.WATER_BREATHING, 5, 0,true,false));
										
									}
								}if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.nega_den_odriver&player.inventory.hasItemStack(new ItemStack (RiderItems.den_oriderpass))){
									player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 2,true,false));
									player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 1,true,false));
									player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 0,true,false));
									player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 1,true,false));
								}
							}
							}if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.yuukibelt_skull&player.inventory.hasItemStack(new ItemStack (RiderItems.den_oriderpass))){
								player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 2,true,false));
								player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 1,true,false));
								player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 0,true,false));
								player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 1,true,false));
								player.addPotionEffect(new PotionEffect(MobEffects.REGENERATION, 5, 1,true,false));
								player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 1,true,false));
							}
					}if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.yuukibelt_hijack&player.inventory.hasItemStack(new ItemStack (RiderItems.den_oriderpass))){
						player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 3,true,false));
						player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 4,true,false));
						player.addPotionEffect(new PotionEffect(MobEffects.SLOWNESS, 5, 0,true,false));
						player.addPotionEffect(new PotionEffect(MobEffects.REGENERATION, 5, 2,true,false));
						player.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE, 5, 0,true,false));
					}
				}
				}if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.gden_odriver&player.inventory.hasItemStack(new ItemStack (RiderItems.gden_oriderpass))){	
					player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5,0,true,false));
					player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 2,true,false));
					player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 0,true,false));
					player.addPotionEffect(new PotionEffect(MobEffects.REGENERATION, 5, 0,true,false));
					player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 5, 0,true,false));
			}
			}if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.gaohbelt&player.inventory.hasItemStack(new ItemStack (RiderItems.den_o_master_pass))){	
				player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 3,true,false));
				player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 1,true,false));	
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

	public static int  get_core(ItemStack itemstack)
	{
		return itemstack.hasTagCompound() ? itemstack.getTagCompound().getInteger("core") :1;
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

	@Override
	@SideOnly(Side.CLIENT)
	@Nullable
	public ModelBiped getArmorModel(EntityLivingBase living, ItemStack stack, EntityEquipmentSlot slot, ModelBiped defaultModel)
	{
		if(!stack.isEmpty())
		{
			if(stack.getItem() instanceof item_den_odriver)
			{

				model_belt armorModel = new model_belt();

				int form = this.get_core(stack);
				if (stack.getItem()==RiderItems.den_odriver){
					if(form == 0){
						armorModel.belt=new ItemStack(RiderItems.den_odriver_bl);
					}else if(form == 1){
						armorModel.belt=stack;
					}else if(form == 2){
						armorModel.belt=new ItemStack(RiderItems.den_odriverrod);
					}else if(form == 4){
						armorModel.belt=new ItemStack(RiderItems.den_odrivergun);
					}else if(form == 5){
						armorModel.belt=new ItemStack(RiderItems.den_odriverwing);
					}else if(form == 3){
						armorModel.belt=new ItemStack(RiderItems.den_odriveraxe);
					}else{
						armorModel.belt=new ItemStack(RiderItems.den_obeltclimax);
					}

				}else if (stack.getItem()==RiderItems.zeronosbelt){
					if(form == 0){
						armorModel.belt=new ItemStack(RiderItems.zeronosbelt_p);
					}
					else if(form == 1){
						armorModel.belt=stack;
					}
					else if(form == 2){
						armorModel.belt=new ItemStack(RiderItems.zeronosbelt_v);
					}
					else if(form == 3){
						armorModel.belt=new ItemStack(RiderItems.zeronosbelt_z);
					}
					else{
						armorModel.belt=stack;
					}
					
				}else if (stack.getItem()==RiderItems.newden_obelt){
					if(form == 0){
						armorModel.belt=new ItemStack(RiderItems.newden_obeltbl);
					}
					else if(form == 1){
						armorModel.belt=stack;
					}
					else if(form == 2){
						armorModel.belt=new ItemStack(RiderItems.newden_obeltvega);
						
					}else{
						armorModel.belt=stack;
					}
				}else{
					armorModel.belt=stack;
				}
				
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
}