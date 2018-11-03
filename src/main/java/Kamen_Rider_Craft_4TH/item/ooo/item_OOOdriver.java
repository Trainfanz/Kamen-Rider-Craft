package Kamen_Rider_Craft_4TH.item.ooo;

import javax.annotation.Nullable;

import org.lwjgl.opengl.GL11;

import Kamen_Rider_Craft_4TH.RiderItems;
import Kamen_Rider_Craft_4TH.TokuCraft_core;
import Kamen_Rider_Craft_4TH.model.model_belt_plus;
import Kamen_Rider_Craft_4TH.model.model_belt_w;
import Kamen_Rider_Craft_4TH.util.IHasModel;
import Kamen_Rider_Craft_4TH.util.Refercence;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.block.model.ItemCameraTransforms;
import net.minecraft.client.renderer.block.model.ItemCameraTransforms.TransformType;
import net.minecraft.client.renderer.color.IItemColor;
import net.minecraft.client.renderer.entity.RenderEntityItem;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.item.EntityItemFrame;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class item_OOOdriver extends ItemArmor implements IHasModel
{
	public static final int[] Corecol1= new int[] {0xff0000,0x7dff09,0xff9204,0xd2d2d2,0x1560c5,0xd919ea,0xe0ba5d,0xff0000};
	public static final int[] Corecol2= new int[] {0xfcff00,0x6cc43e,0x818181,0xff0000,0x2c41ff,0xd45ef3,0xd9bb64,0xff0000,0xffffff,0xfcff00,0xe8cc00};
	public static final int[] Corecol3= new int[] {0x0a6e03,0xfff725,0x2e2e2e,0xff0000,0x57b7ff,0x8819ea,0xe0ba5d,0xb79449,0x0a6e03,0xe8cc00};

	private static final int[] maxDamageArray = new int[] {11, 16, 15, 13};
	public String armorNamePrefix;
	public ArmorMaterial material;

	public item_OOOdriver (String name,ArmorMaterial par2EnumArmorMaterial, int par3)
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
						if (player.getItemStackFromSlot(EntityEquipmentSlot.LEGS).getItem() == RiderItems.OOOlegs){
							if (player.getItemStackFromSlot(EntityEquipmentSlot.CHEST).getItem() == RiderItems.OOOtroso){
								if (player.getItemStackFromSlot(EntityEquipmentSlot.HEAD).getItem() == RiderItems.OOOhead){
									if(item_OOOdriver.get_eftTime(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))<100){

										item_OOOdriver.set_eftTime(player.getItemStackFromSlot(EntityEquipmentSlot.FEET),item_OOOdriver.get_eftTime(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))+1);
									}
									if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.birth_driver){
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 0,true,false));
									}
									if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.birth_driver_prototype){
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 1,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 0,true,false));
									}
									if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.aqua_driver){
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 1,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.WATER_BREATHING, 5, 0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 0,true,false));
										if (player.isInWater()){
											if (player.isSneaking()){
												Vec3d look = player.getLookVec();
												player.motionX=look.x/2;
												player.motionY=look.y/2;
												player.motionZ=look.z/2;
											}
										}
									}
									if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.poseidon_driver){
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 3,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.WATER_BREATHING, 5, 0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE, 5, 0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.REGENERATION, 5, 1,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 0,true,false));
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

				model_belt_plus armorModel = new model_belt_plus();

				Item[] Medel_head= new Item[] {RiderItems.taka_OOOdriver,RiderItems.kuwagata_OOOdriver,RiderItems.lion_OOOdriver,RiderItems.sai_OOOdriver,RiderItems.shachi_OOOdriver,RiderItems.ptera_OOOdriver,RiderItems.cobra_OOOdriver,RiderItems.super_taka_OOOdriver,RiderItems.love_OOOdriver,RiderItems.same_OOOdriver,RiderItems.shika_OOOdriver,RiderItems.seiuchi_OOOdriver,RiderItems.mukade_OOOdriver,RiderItems.sasori_new_OOOdriver,RiderItems.taka_OOOdriver};
				Item[] Medel_chest= new Item[] {RiderItems.tora_OOOdriver,RiderItems.kamakiri_OOOdriver,RiderItems.gorilla_OOOdriver,RiderItems.kujaku_OOOdriver,RiderItems.unagi_OOOdriver,RiderItems.tricera_OOOdriver,RiderItems.kame_OOOdriver,RiderItems.imagin_OOOdriver,RiderItems.panda_OOOdriver,RiderItems.super_tora_OOOdriver,RiderItems.kangaroo_OOOdriver,RiderItems.love2_OOOdriver,RiderItems.kujira_OOOdriver,RiderItems.gazelle_OOOdriver,RiderItems.shirokuma_OOOdriver,RiderItems.hachi_OOOdriver,RiderItems.kani_new_OOOdriver,RiderItems.yadokari_OOOdriver,RiderItems.tora_OOOdriver};
				Item[] Medel_legs= new Item[] {RiderItems.batta_OOOdriver,RiderItems.cheetah_OOOdriver,RiderItems.zou_OOOdriver,RiderItems.condor_OOOdriver,RiderItems.tako_OOOdriver,RiderItems.tyranno_OOOdriver,RiderItems.wani_OOOdriver,RiderItems.shocker_OOOdriver,RiderItems.super_batta_OOOdriver,RiderItems.kangaroo2_OOOdriver,RiderItems.love3_OOOdriver,RiderItems.ookamiuo_OOOdriver,RiderItems.ushi_OOOdriver,RiderItems.penguin_OOOdriver,RiderItems.ari_OOOdriver,RiderItems.ebi_new_OOOdriver,RiderItems.batta_OOOdriver};
				
				armorModel.belt=stack;
					
				
				
					if(stack.getItem() == RiderItems.OOOdriver)
					{	
						if (item_OOOdriver.get_core(stack,"1")==0&item_OOOdriver.get_core(stack,"2")==3&item_OOOdriver.get_core(stack,"3")==3){
							armorModel.wings=new ItemStack(RiderItems.tajador_wings);
						}else{
							armorModel.wings=new ItemStack(RiderItems.blanknoitem);
						}	
					{
						armorModel.belt2=new ItemStack(Medel_head[item_OOOdriver.get_core(stack,"1")]);
						armorModel.belt3=new ItemStack(Medel_chest[item_OOOdriver.get_core(stack,"2")]);
						armorModel.belt4=new ItemStack(Medel_legs[item_OOOdriver.get_core(stack,"3")]);
						}
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




/**
 * Returns the 'max damage' factor array for the armor, each piece of armor have a durability factor (that gets
 * multiplied by armor material factor)
 */
static int[] getMaxDamageArray()
{
	return maxDamageArray;
}


public boolean hasOverlay(ItemStack stack)
{
    return stack.getItem()==RiderItems.OOOdriver || getColor(stack) != 0x00FFFFFF;
}
}