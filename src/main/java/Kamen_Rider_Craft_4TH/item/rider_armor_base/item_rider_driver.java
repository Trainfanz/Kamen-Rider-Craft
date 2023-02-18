package Kamen_Rider_Craft_4TH.item.rider_armor_base;

import java.util.List;

import javax.annotation.Nullable;

import org.lwjgl.opengl.GL11;

import Kamen_Rider_Craft_4TH.RiderItems;
import Kamen_Rider_Craft_4TH.ShowaRiderItems;
import Kamen_Rider_Craft_4TH.TokuCraft_core;
import Kamen_Rider_Craft_4TH.blocks.hiden_3d_printing;
import Kamen_Rider_Craft_4TH.item.revice.Item_Vistamps;
import Kamen_Rider_Craft_4TH.item.zero_one.Item_progrise_keys;
import Kamen_Rider_Craft_4TH.model.model_belt;
import Kamen_Rider_Craft_4TH.model.model_belt_plus;
import Kamen_Rider_Craft_4TH.model.tokuArmorModel;
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
import net.minecraft.item.IItemPropertyGetter;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ResourceLocation;
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
	private final Item base;   

	private boolean belt=false;

	public item_rider_driver (String name,ArmorMaterial par2EnumArmorMaterial, int par3, String rider,Item_form_change baseFormItem,Item head,Item torso,Item legs, Item item)
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
		base = item;
		
		  this.addPropertyOverride(new ResourceLocation("form"), new IItemPropertyGetter()
	        {
	            @SideOnly(Side.CLIENT)
	            public float apply(ItemStack stack, @Nullable World worldIn, @Nullable EntityLivingBase entityIn)
	            {
	      		  
	            	if (!stack.hasTagCompound())
	        		{
	            		return 0;
	        		}else {
	            		return get_Form_Item(stack, 1).getBelt();
					
	      		  }
	      		  }
	        });

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

	
	public  String getTexture(Entity entity, int num,String ext)
	{
		if (entity instanceof EntityLivingBase){
			EntityLivingBase player = ((EntityLivingBase)entity);
			if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET)!= null){
				if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem()instanceof item_rider_driver){
					item_rider_driver belt =((item_rider_driver)player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem());
					String rider = ((item_rider_driver)player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem()).Rider;

					if (num==1){
								return Refercence.MODID+":textures/armor/"+rider+item_rider_driver.get_Form_Item_tex(player.getItemStackFromSlot(EntityEquipmentSlot.FEET),1).getFormName()+ext;
				

					}else if (num==2||num==5||num==7){
					
							return Refercence.MODID+":textures/armor/"+rider+item_rider_driver.get_Form_Item_tex(player.getItemStackFromSlot(EntityEquipmentSlot.FEET),1).getFormName()+ext;
					
					}else if (num==3||num==6||num==8){
						
							return Refercence.MODID+":textures/armor/"+rider+item_rider_driver.get_Form_Item_tex(player.getItemStackFromSlot(EntityEquipmentSlot.FEET),1).getFormName()+ext;
			
					}else if (num==4||num==9||num==10||num==11||num==12||num==13||num==14){

						
						if (item_rider_driver.get_Form_Item_tex(player.getItemStackFromSlot(EntityEquipmentSlot.FEET),1).get2ndLyer()=="blank"){
							return "blank";
						}
						return Refercence.MODID+":textures/armor/"+item_rider_driver.get_Form_Item_tex(player.getItemStackFromSlot(EntityEquipmentSlot.FEET),1).get2ndLyer()+ext;

					} else{
						return "blank";

					}
				}else{
					return "blank";
				}
			}else{
				return "blank";
			}

		}
		return "blank";

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

				if(belt == true){
					armorModel.belt=new ItemStack(ShowaRiderItems.blanknoitem);
				}else{
					armorModel.belt=stack;
				}


				armorModel.wings=new ItemStack(get_Form_Item(stack,1).getWing());


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
			return  ((item_rider_driver)itemstack.getItem()).Base_Form_Item;
		}else if (Item.getItemById(itemstack.getTagCompound().getInteger("slot"+SLOT))instanceof Item_form_change){
			return (Item_form_change) Item.getItemById(itemstack.getTagCompound().getInteger("slot"+SLOT));
		}else{
			return  ((item_rider_driver)itemstack.getItem()).Base_Form_Item;
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



	public boolean getIsRepairable(ItemStack toRepair, ItemStack repair) 
	{
		return base == repair.getItem() ? true : super.getIsRepairable(toRepair, repair);
	}
}