package Kamen_Rider_Craft_4TH.item.build;

import javax.annotation.Nullable;

import Kamen_Rider_Craft_4TH.RiderItems;
import Kamen_Rider_Craft_4TH.TokuCraft_core;
import Kamen_Rider_Craft_4TH.model.tokuArmorModel;
import Kamen_Rider_Craft_4TH.util.IHasModel;
import Kamen_Rider_Craft_4TH.util.Refercence;
import net.minecraft.block.BlockDispenser;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.client.ForgeHooksClient;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class item_buildarmor2 extends ItemArmor implements IHasModel
{
	public static final String[] CoreName= new String[] {"tank","diamond","gatling","soujiki","comic","rocket","shoubousha","key","cake","medal","game","mic","usb_memory","ressha","light","robo","televi","parka","smartphone","camera","helicopter","ufo","jet","cyclone","eraser","watch","pyramid","skateboard","fridge","dragon_silver","engine","bike","magnet","submarine","dryer","gold"};
	public static final String[] CoreName2= new String[] {"rabbit","gorilla","taka","harinezumi","ninnin","panda","lion","dragon","santa","orange","doctor","dog","mahoutskai","tantei","kaizoku","octopus","phoenix","kuma","momotaros","yujou","obake","wolf","beetle","card","rose","tora","kujira","kirin","unicorn","turtle","deer","penguin","spider","rabbit_gold","bat","same","hachi","sai","scorpion"};		

	public static final String[] formName= new String[] {"","_sparkling","_hazard","_rabbit","_tank","_genius","_cross_z"};

	public static final String[] steamName= new String[] {"night_rogue","blood_stalk"};

	public static final String[] gearName= new String[] {"engine_bros","remocon_bros","kaiser_red","kaiser_blue","hell_bros","bi_kaiser"};

	public static final String[] CoreNamelegend= new String[] {"ex_aid","ghost","drive","gaim","wizard","fourze","ooo","w","decade","deno"};		
	
	public static final String[] evolName= new String[] {"cobra","dragon","rabbit","blackhole","monster"};
	
	public static final String[] greaseName= new String[] {"_blizzard","_perfect_kingdom"};

	public static final String[] crosszName= new String[] {"","_magma","_great","_evol"};
	
	private static final int[] maxDamageArray = new int[] {11, 20, 15, 13};

	public String armorNamePrefix;
	public ArmorMaterial material;

	public item_buildarmor2 (String name,ArmorMaterial par2EnumArmorMaterial, int par3, EntityEquipmentSlot par4)
	{
		super(par2EnumArmorMaterial, par3, par4);
		par2EnumArmorMaterial.getDamageReductionAmount(par4);
		this.setMaxDamage(par2EnumArmorMaterial.getDurability(par4));
		this.maxStackSize = 1;

		setTranslationKey(name);
		setRegistryName(name);
		TokuCraft_core.ITEMS.add(this);
	}
	@Override
	public void registerModels() {
		TokuCraft_core.proxy.registerItemRender(this,0,"inventory");
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

	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, EntityEquipmentSlot slot, String type)
	{
		if (entity instanceof EntityLivingBase){

			EntityLivingBase player = ((EntityLivingBase)entity);


			if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET)!= null){

				if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.build_driver){


					if (slot == EntityEquipmentSlot.HEAD)
					{
						if (getlegend(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))!=0){
							return Refercence.MODID+":textures/armor/"+"build_"+ CoreNamelegend[getlegend(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))-1] +"_1.png";

						}else{
							return Refercence.MODID+":textures/armor/"+"build_"+ CoreName[item_builddriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET),"1")]+formName[item_builddriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET),"2")] +".png";

						}


					}


					if (slot == EntityEquipmentSlot.LEGS)
					{
						if (getlegend(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))!=0){
							return Refercence.MODID+":textures/armor/"+"build_"+ CoreNamelegend[getlegend(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))-1] +"_2.png";

						}else{

							return Refercence.MODID+":textures/armor/"+"build_"+ CoreName2[item_builddriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET),"3")]+formName[item_builddriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET),"2")] +".png";
						}  }
					
					else
					{
						return null;
					}

				}	else if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.build_driver_cross_z){


					if (slot == EntityEquipmentSlot.HEAD)
					{

						return Refercence.MODID+":textures/armor/"+"cross_z"+crosszName[item_builddriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET),"1")] +"_1"+".png";
					}


					if (slot == EntityEquipmentSlot.CHEST)
					{

						return Refercence.MODID+":textures/armor/"+"cross_z"+crosszName[item_builddriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET),"1")] +"_2"+".png";
					}  
					if (slot == EntityEquipmentSlot.LEGS)
					{
						return Refercence.MODID+":textures/armor/"+"cross_z"+crosszName[item_builddriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET),"1")] +"_2"+".png";
					}
					else
					{
						return null;
					}


				}	else if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.sclash_driver_grease){


					if (slot == EntityEquipmentSlot.HEAD)
					{

						return Refercence.MODID+":textures/armor/"+"grease_1"+".png";
					}


					if (slot == EntityEquipmentSlot.CHEST)
					{

						return Refercence.MODID+":textures/armor/"+"grease_2"+".png";
					}  
					if (slot == EntityEquipmentSlot.LEGS)
					{
						return Refercence.MODID+":textures/armor/"+"grease_2"+".png";
					}
					else
					{
						return null;
					}
					
				}	else if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.build_driver_rogue){


					if (slot == EntityEquipmentSlot.HEAD)
					{

						return Refercence.MODID+":textures/armor/"+"prime_rogue_1"+".png";
					}


					if (slot == EntityEquipmentSlot.CHEST)
					{

						return Refercence.MODID+":textures/armor/"+"prime_rogue_2"+".png";
					}  
					if (slot == EntityEquipmentSlot.LEGS)
					{
						return Refercence.MODID+":textures/armor/"+"prime_rogue_2"+".png";
					}
					else
					{
						return null;
					}

				}else if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.transteamgun_2){


					if (slot == EntityEquipmentSlot.HEAD)
					{

						return Refercence.MODID+":textures/armor/"+steamName[item_builddriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET),"1")] +"_1"+".png";
					}


					if (slot == EntityEquipmentSlot.CHEST)
					{

						return Refercence.MODID+":textures/armor/"+steamName[item_builddriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET),"1")] +"_2"+".png";
					}  
					if (slot == EntityEquipmentSlot.LEGS)
					{
						return Refercence.MODID+":textures/armor/"+steamName[item_builddriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET),"1")] +"_2"+".png";
					}
					else
					{
						return null;
					}
					
				}else if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.evol_driver_evol){


					if (slot == EntityEquipmentSlot.HEAD)
					{

						return Refercence.MODID+":textures/armor/"+"evol_"+evolName[item_builddriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET),"1")] +"_1"+".png";
					}


					if (slot == EntityEquipmentSlot.CHEST)
					{

						return Refercence.MODID+":textures/armor/"+"evol_"+evolName[item_builddriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET),"1")] +"_2"+".png";
					}  
					if (slot == EntityEquipmentSlot.LEGS)
					{
						return Refercence.MODID+":textures/armor/"+"evol_"+evolName[item_builddriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET),"1")] +"_2"+".png";
					}
					else
					{
						return null;
					}

				}else if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.nebulasteamgun_2){


					if (slot == EntityEquipmentSlot.HEAD)
					{

						return Refercence.MODID+":textures/armor/"+gearName[item_builddriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET),"1")] +"_1"+".png";
					}


					if (slot == EntityEquipmentSlot.CHEST)
					{

						return Refercence.MODID+":textures/armor/"+gearName[item_builddriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET),"1")] +"_2"+".png";
					}  
					if (slot == EntityEquipmentSlot.LEGS)
					{
						return Refercence.MODID+":textures/armor/"+gearName[item_builddriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET),"1")] +"_2"+".png";
					}
					else
					{
						return null;
					}

				}	else if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.sclash_driver_cross_z_charge){


					if (slot == EntityEquipmentSlot.HEAD)
					{

						return Refercence.MODID+":textures/armor/"+"cross_z_charge"+".png";
					}


					if (slot == EntityEquipmentSlot.CHEST)
					{

						return Refercence.MODID+":textures/armor/"+"cross_z_charge_2"+".png";
					}  
					if (slot == EntityEquipmentSlot.LEGS)
					{
						return Refercence.MODID+":textures/armor/"+"cross_z_charge_2"+".png";
					}
					else
					{
						return null;
					}


				}else if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.sclash_driver_rogue){


					if (slot == EntityEquipmentSlot.HEAD)
					{

						return Refercence.MODID+":textures/armor/"+"rogue_1"+".png";
					}


					if (slot == EntityEquipmentSlot.CHEST)
					{

						return Refercence.MODID+":textures/armor/"+"rogue_2"+".png";
					}  
					if (slot == EntityEquipmentSlot.LEGS)
					{
						return Refercence.MODID+":textures/armor/"+"rogue_2"+".png";
					}
					else
					{
						return null;
					}
					
				}else if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.build_driver_blood){


					if (slot == EntityEquipmentSlot.HEAD)
					{

						return Refercence.MODID+":textures/armor/"+"blood_1"+".png";
					}


					if (slot == EntityEquipmentSlot.CHEST)
					{

						return Refercence.MODID+":textures/armor/"+"blood_2"+".png";
					}  
					if (slot == EntityEquipmentSlot.LEGS)
					{
						return Refercence.MODID+":textures/armor/"+"blood_2"+".png";
					}
					else
					{
						return null;
					}
					
				}else if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.evol_driver_mad_rogue){


					if (slot == EntityEquipmentSlot.HEAD)
					{

						return Refercence.MODID+":textures/armor/"+"mad_rogue_1"+".png";
					}


					if (slot == EntityEquipmentSlot.CHEST)
					{

						return Refercence.MODID+":textures/armor/"+"mad_rogue_2"+".png";
					}  
					if (slot == EntityEquipmentSlot.LEGS)
					{
						return Refercence.MODID+":textures/armor/"+"mad_rogue_2"+".png";
					}
					else
					{
						return null;
					}
					
				}else if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.build_driver_grease){


					if (slot == EntityEquipmentSlot.HEAD)
					{

						return Refercence.MODID+":textures/armor/"+"grease"+greaseName[item_builddriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET),"1")] +"_1"+".png";
					}


					if (slot == EntityEquipmentSlot.CHEST)
					{

						return Refercence.MODID+":textures/armor/"+"grease"+greaseName[item_builddriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET),"1")] +"_2"+".png";
					}  
					if (slot == EntityEquipmentSlot.LEGS)
					{
						return Refercence.MODID+":textures/armor/"+"grease"+greaseName[item_builddriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET),"1")] +"_2"+".png";
					}
					else
					{
						return null;
					}


				}	else if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.build_driver_build_metal){


					if (slot == EntityEquipmentSlot.HEAD)
					{

						return Refercence.MODID+":textures/armor/"+"build_metal_1"+".png";
					}


					if (slot == EntityEquipmentSlot.CHEST)
					{

						return Refercence.MODID+":textures/armor/"+"build_metal_2"+".png";
					}  
					if (slot == EntityEquipmentSlot.LEGS)
					{
						return Refercence.MODID+":textures/armor/"+"build_metal_2"+".png";
					}
					else
					{
						return null;
					}
					
				}	else if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.build_driver_killbas){


					if (slot == EntityEquipmentSlot.HEAD)
					{

						return Refercence.MODID+":textures/armor/"+"killbas_1"+".png";
					}


					if (slot == EntityEquipmentSlot.CHEST)
					{

						return Refercence.MODID+":textures/armor/"+"killbas_2"+".png";
					}  
					if (slot == EntityEquipmentSlot.LEGS)
					{
						return Refercence.MODID+":textures/armor/"+"killbas_2"+".png";
					}
					else
					{
						return null;
					}
				}	
			}
			return Refercence.MODID+":textures/armor/blank.png";


		}

		else
		{
			return Refercence.MODID+":textures/armor/blank.png";



		}


	}

	public int getlegend(ItemStack stack)
	{
		int islegend =0;
		if (item_builddriver.get_core(stack,"1")==7&item_builddriver.get_core(stack,"3")==9){
			islegend = 4;
		}else if (item_builddriver.get_core(stack,"1")==9&item_builddriver.get_core(stack,"3")==2){
			islegend = 7;
		}else if (item_builddriver.get_core(stack,"1")==10&item_builddriver.get_core(stack,"3")==10){
			islegend = 1;
		}else if (item_builddriver.get_core(stack,"1")==1&item_builddriver.get_core(stack,"3")==12){
			islegend = 5;
		}	else if (item_builddriver.get_core(stack,"1")==12&item_builddriver.get_core(stack,"3")==13){
			islegend = 8;
		}else if (item_builddriver.get_core(stack,"1")==13&item_builddriver.get_core(stack,"3")==18){
			islegend = 10;
		}	else if (item_builddriver.get_core(stack,"1")==5&item_builddriver.get_core(stack,"3")==19){
			islegend = 6;
		}else if (item_builddriver.get_core(stack,"1")==17&item_builddriver.get_core(stack,"3")==20){
			islegend = 2;
		}else if (item_builddriver.get_core(stack,"1")==19&item_builddriver.get_core(stack,"3")==23){
			islegend = 9;
		}

		return islegend;
	}



	@Override
	@SideOnly(Side.CLIENT)
	@Nullable
	public ModelBiped getArmorModel(EntityLivingBase living, ItemStack stack, EntityEquipmentSlot slot, ModelBiped defaultModel)
	{	tokuArmorModel armorModel = new tokuArmorModel();

	if(!stack.isEmpty())
	{
		if(stack.getItem() instanceof ItemArmor)
		{


			if(armorModel != null){
				armorModel.bipedBody3.showModel = slot == EntityEquipmentSlot.HEAD;
				armorModel.bipedRightArm2.showModel = slot == EntityEquipmentSlot.LEGS;
				armorModel.bipedLeftLeg2.showModel = slot == EntityEquipmentSlot.LEGS;
				armorModel.bipedBody2.showModel = slot == EntityEquipmentSlot.LEGS;
				armorModel.bipedLeftArm2.showModel = slot == EntityEquipmentSlot.HEAD;
				armorModel.bipedRightLeg2.showModel = slot == EntityEquipmentSlot.HEAD;

				//armorModel.bipedHead2.showModel= armorSlot == 4;
				//armorModel.bipedHeadwear2.showModel= armorSlot == 4;

				//armorModel.bipedHead2.showModel=armorslot == EntityEquipmentSlot.CHEST;
				//armorModel.bipedHeadwear2.showModel=armorslot == EntityEquipmentSlot.CHEST;

				armorModel.isSneak = living.isSneaking();
				armorModel.isRiding = living.isRiding();
				armorModel.isChild = living.isChild();
				armorModel.swingProgress = living.swingProgress;





				return armorModel;
			}
		}
	}
	return null;
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