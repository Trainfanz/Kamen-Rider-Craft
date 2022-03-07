package Kamen_Rider_Craft_4TH.item.rider_armor_base;

import java.util.List;

import javax.annotation.Nullable;

import org.lwjgl.opengl.GL11;

import Kamen_Rider_Craft_4TH.RiderItems;
import Kamen_Rider_Craft_4TH.TokuCraft_core;
import Kamen_Rider_Craft_4TH.blocks.hiden_3d_printing;
import Kamen_Rider_Craft_4TH.item.revice.Item_Vistamps;
import Kamen_Rider_Craft_4TH.item.zero_one.Item_progrise_keys;
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
import net.minecraft.init.Items;
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

public class item_rider_driver extends ItemArmor implements IHasModel
{

	private static final int[] maxDamageArray = new int[] {11, 16, 15, 13};
	public String armorNamePrefix;
	public ArmorMaterial material;
	private Item_form_change Base_Form_Item;
	public String Rider;
	public Item HEAD;
	public Item TORSO;
	public Item LEGS;

	//HeadUpTexA,HeadUpTexB,HeadUpTexC,HeadLowTexA,HeadLowTexB,HeadLowTexC,TorsoUpTexA,TorsoUpTexB,TorsoUpTexC,TorsoLowTexA,TorsoLowTexB,TorsoLowTexC
	//,ArmLUpTex,ArmLLowTex,ArmRUpTex,ArmRLowTex,LegLUpTex,LegLLowTex,LegRUpTex,LegRLowTex

	public static int[] Text= new int[] {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1};



	private boolean belt=false;

	public item_rider_driver (String name,ArmorMaterial par2EnumArmorMaterial, int par3, String rider,Item_form_change baseFormItem,Item head,Item torso,Item legs)
	{
		super(par2EnumArmorMaterial, par3, EntityEquipmentSlot.FEET);
		this.material = par2EnumArmorMaterial;
		par2EnumArmorMaterial.getDamageReductionAmount(EntityEquipmentSlot.FEET);
		this.setMaxDamage(par2EnumArmorMaterial.getDurability(EntityEquipmentSlot.FEET));
		this.maxStackSize = 1;
		Rider=rider;
		setTranslationKey(name);
		setRegistryName(name);
		TokuCraft_core.ITEMS.add(this);
		Base_Form_Item=baseFormItem;
		HEAD=head;
		TORSO=torso;
		LEGS=legs;

	}

	public item_rider_driver ChangeRender(int par1,int par2,int par3,int par4,int par5,int par6,int par7,int par8,int par9,int par10,int par11,int par12,int par13,int par14,int par15,int par16,int par17,int par18,int par19,int par20)
	{
		Text[0]=par1;
		Text[1]=par2;
		Text[2]=par3;
		Text[3]=par4;
		Text[4]=par5;
		Text[5]=par6;
		Text[6]=par7;
		Text[7]=par8;
		Text[8]=par9;
		Text[9]=par10;
		Text[10]=par11;
		Text[11]=par12;
		Text[12]=par13;	
		Text[13]=par14;
		Text[14]=par15;	
		Text[15]=par16;
		Text[16]=par17;	
		Text[17]=par18;
		Text[18]=par19;	
		Text[19]=par20;

		return this;
	}

	public item_rider_driver belt(boolean num)
	{
		belt=num;
		return this;
	}

	@SideOnly(Side.CLIENT)
	public boolean hasEffect(ItemStack par1ItemStack)
	{
		return !true;
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


	public void extraPotionEffects(World world,EntityPlayer player,ItemStack armor,Item_form_change form) {

	}

	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack armor) {

		if (player.getItemStackFromSlot(EntityEquipmentSlot.LEGS).getItem() == LEGS){
			if (player.getItemStackFromSlot(EntityEquipmentSlot.CHEST).getItem() == TORSO){
				if (player.getItemStackFromSlot(EntityEquipmentSlot.HEAD).getItem() == HEAD){
					if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == this){

						List<PotionEffect> potionEffectList = get_Form_Item(player.getItemStackFromSlot(EntityEquipmentSlot.FEET),1).getPotionEffectList();
						for (int i = 0; i < potionEffectList.size(); i++)
						{
							player.addPotionEffect(new PotionEffect(potionEffectList.get(i).getPotion(),potionEffectList.get(i).getDuration(),potionEffectList.get(i).getAmplifier(),true,false));
						}
						extraPotionEffects(world,player,armor,get_Form_Item(player.getItemStackFromSlot(EntityEquipmentSlot.FEET),1));
					}
				}
			}
		}
	}

	public String getTexture(ItemStack stack, Entity entity)
	{
		if (entity instanceof EntityLivingBase){
			EntityLivingBase player = ((EntityLivingBase)entity);
			if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET)!= null){
				String rider = ((item_rider_driver)player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem()).Rider;
				return Refercence.MODID+":textures/armor/"+rider+item_rider_driver.get_Form_Item_tex(player.getItemStackFromSlot(EntityEquipmentSlot.FEET),1).getFormName();
			}
		}
		else
		{
			return Refercence.MODID+":textures/armor/blank.png";
		}
		return Refercence.MODID+":textures/armor/blank.png";
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

				if(belt == true){
					armorModel.belt=new ItemStack(RiderItems.blanknoitem);
				}else if (get_Form_Item(stack,1).getBelt()==RiderItems.blanknoitem ){
					armorModel.belt=stack;
				}else 
				{
					armorModel.belt=new ItemStack(get_Form_Item(stack,1).getBelt());
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

	public Item_form_change get_Form_Item(ItemStack itemstack,int SLOT)
	{
		if (!itemstack.hasTagCompound())
		{
			return Base_Form_Item;
		}else if (Item.getItemById(itemstack.getTagCompound().getInteger("slot"+SLOT))instanceof Item_form_change){
			return (Item_form_change) Item.getItemById(itemstack.getTagCompound().getInteger("slot"+SLOT));
		}else{
			return Base_Form_Item;
		}
	}

	public static Item_form_change get_Form_Item_tex(ItemStack itemstack,int SLOT)
	{
		if (!itemstack.hasTagCompound())
		{
			return (Item_form_change) RiderItems.blanknoform;
		}else if (Item.getItemById(itemstack.getTagCompound().getInteger("slot"+SLOT))instanceof Item_form_change){
			return (Item_form_change) Item.getItemById(itemstack.getTagCompound().getInteger("slot"+SLOT));
		}else{
			return (Item_form_change) RiderItems.blanknoform;
		}
	}
	public static void set_Form_Item(ItemStack itemstack, Item ITEM,int SLOT)
	{
		if (!itemstack.hasTagCompound())
		{
			itemstack.setTagCompound(new NBTTagCompound());
		}
		itemstack.getTagCompound().setInteger("slot"+SLOT, Item.getIdFromItem(ITEM));

	}

	public static String get_text(ItemStack itemstack, int num,String extra){
		item_rider_driver belt =(item_rider_driver)itemstack.getItem();
		String rider = belt.Rider;
		return Refercence.MODID+":textures/armor/"+rider+item_rider_driver.get_Form_Item_tex(itemstack,Text[num]).getFormName() +extra;
	}


	public boolean getIsRepairable(ItemStack toRepair, ItemStack repair) 
	{
		return RiderItems.blanknoitem == repair.getItem() ? true : super.getIsRepairable(toRepair, repair);
	}
}