package Kamen_Rider_Craft_4TH.item.build;

import java.util.Random;

import javax.annotation.Nullable;

import org.lwjgl.opengl.GL11;

import Kamen_Rider_Craft_4TH.RiderItems;
import Kamen_Rider_Craft_4TH.RiderItems;
import Kamen_Rider_Craft_4TH.ShowaRiderItems;
import Kamen_Rider_Craft_4TH.TokuCraft_core;
import Kamen_Rider_Craft_4TH.miscellaneousRiderItems;
import Kamen_Rider_Craft_4TH.item.ooo.item_OOOdriver;
import Kamen_Rider_Craft_4TH.item.rider_armor_base.Item_form_change;
import Kamen_Rider_Craft_4TH.item.rider_armor_base.item_rider_driver;
import Kamen_Rider_Craft_4TH.model.model_belt_plus;
import Kamen_Rider_Craft_4TH.potion.PotionCore;
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
import net.minecraft.util.EnumHand;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import net.minecraftforge.client.event.sound.SoundEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class item_builddriver extends item_rider_driver
{
	public static final String[] CoreName= new String[] {"tank","diamond","gatling","soujiki","comic","rocket","shoubousha","key","cake","medal","game","mic","usb_memory","ressha","light","robo","televi","parka","smartphone","camera","helicopter","ufo","jet","cyclone","eraser","watch","pyramid","skateboard","fridge","dragon_silver","engine","bike","magnet","submarine","dryer","gold"};
	public static final String[] CoreName2= new String[] {"rabbit","gorilla","taka","harinezumi","ninnin","panda","lion","dragon","santa","orange","doctor","dog","mahoutskai","tantei","kaizoku","octopus","phoenix","kuma","momotaros","yujou","obake","wolf","beetle","card","rose","tora","kujira","kirin","unicorn","turtle","deer","penguin","spider","rabbit_gold","bat","same","hachi","sai","scorpion"};		

	public static final String[] CoreNamelegend= new String[] {"ex_aid","ghost","drive","gaim","wizard","fourze","ooo","w","decade","deno"};		

	public static final String[] formName= new String[] {"","_sparkling","_hazard","_rabbit","_tank","_genius","_cross_z"};

	public static final String[] steamName= new String[] {"night_rogue","blood_stalk"};

	public static final String[] gearName= new String[] {"engine_bros","remocon_bros","kaiser_red","kaiser_blue","hell_bros","bi_kaiser"};

	public static final String[] evolName= new String[] {"cobra","dragon","rabbit","blackhole","monster"};

	public static final String[] greaseName= new String[] {"_blizzard","_perfect_kingdom"};

	public static final String[] crosszName= new String[] {"","_magma","_great","_evol"};


	private static final int[] maxDamageArray = new int[] {11, 16, 15, 13};
	public String armorNamePrefix;
	public ArmorMaterial material;




	public item_builddriver (String name,ArmorMaterial par2EnumArmorMaterial, int par3, String rider)
	{
		super(name,par2EnumArmorMaterial,4,rider,(Item_form_change) RiderItems.keyfuestle,RiderItems.buildhead, RiderItems.buildtroso, RiderItems.buildlegs, RiderItems.full_bottle);
		this.material = par2EnumArmorMaterial;
		par2EnumArmorMaterial.getDamageReductionAmount(EntityEquipmentSlot.FEET);
		this.setMaxDamage(par2EnumArmorMaterial.getDurability(EntityEquipmentSlot.FEET));
		this.maxStackSize = 1;
	}

	@Override
	public void registerModels() {
		TokuCraft_core.proxy.registerItemRender(this,0,"inventory");
	}
	@SideOnly(Side.CLIENT)
	public boolean hasEffect(ItemStack par1ItemStack)
	{
		return !true;
	}
	@Override
	@SideOnly(Side.CLIENT)
	@Nullable
	public ModelBiped getArmorModel(EntityLivingBase living, ItemStack stack, EntityEquipmentSlot slot, ModelBiped defaultModel) {
		if(!stack.isEmpty()) {
			if(stack.getItem() instanceof ItemArmor) {
				model_belt_plus armorModel = new model_belt_plus();

				Item[] build_inorganic= new Item[] {miscellaneousRiderItems.build_driver_tank,miscellaneousRiderItems.build_driver_diamond,miscellaneousRiderItems.build_driver_gatling,miscellaneousRiderItems.build_driver_soujiki,miscellaneousRiderItems.build_driver_comic,miscellaneousRiderItems.build_driver_rocket,miscellaneousRiderItems.build_driver_shoubousha,miscellaneousRiderItems.build_driver_lock,miscellaneousRiderItems.build_driver_cake,miscellaneousRiderItems.build_driver_medal,miscellaneousRiderItems.build_driver_game,miscellaneousRiderItems.build_driver_mic,miscellaneousRiderItems.build_driver_usb_memory,miscellaneousRiderItems.build_driver_densha,miscellaneousRiderItems.build_driver_light,miscellaneousRiderItems.build_driver_robo,miscellaneousRiderItems.build_driver_televi,miscellaneousRiderItems.build_driver_parka,miscellaneousRiderItems.build_driver_smartphone,miscellaneousRiderItems.build_driver_camera,miscellaneousRiderItems.build_driver_helicopter,miscellaneousRiderItems.build_driver_ufo,miscellaneousRiderItems.build_driver_jet,miscellaneousRiderItems.build_driver_cyclone,miscellaneousRiderItems.build_driver_eraser,miscellaneousRiderItems.build_driver_watch,miscellaneousRiderItems.build_driver_pyramid,miscellaneousRiderItems.build_driver_skateboard,miscellaneousRiderItems.build_driver_fridge,miscellaneousRiderItems.build_driver_dragon_silver,miscellaneousRiderItems.build_driver_shoubousha,miscellaneousRiderItems.build_driver_shoubousha,miscellaneousRiderItems.build_driver_smartphone,miscellaneousRiderItems.build_driver_jet,miscellaneousRiderItems.build_driver_shoubousha,miscellaneousRiderItems.build_driver_gold};
				Item[] build_form= new Item[] {ShowaRiderItems.blanknoitem,miscellaneousRiderItems.build_driver_sp,miscellaneousRiderItems.build_driver_hazard,miscellaneousRiderItems.build_driver_hazard_rabbit,miscellaneousRiderItems.build_driver_hazard_tank,miscellaneousRiderItems.build_driver_genius,miscellaneousRiderItems.build_driver_cross_z_build};
				Item[] build_organic= new Item[] {miscellaneousRiderItems.build_driver_rabbit,miscellaneousRiderItems.build_driver_gorilla,miscellaneousRiderItems.build_driver_taka,miscellaneousRiderItems.build_driver_harinezumi,miscellaneousRiderItems.build_driver_ninja,miscellaneousRiderItems.build_driver_panda,miscellaneousRiderItems.build_driver_lion,miscellaneousRiderItems.build_driver_dragon,miscellaneousRiderItems.build_driver_santa,miscellaneousRiderItems.build_driver_orange,miscellaneousRiderItems.build_driver_doctor,miscellaneousRiderItems.build_driver_dog,miscellaneousRiderItems.build_driver_mahoutsukai,miscellaneousRiderItems.build_driver_tantei,miscellaneousRiderItems.build_driver_kaizoku,miscellaneousRiderItems.build_driver_octopus,miscellaneousRiderItems.build_driver_phoenix,miscellaneousRiderItems.build_driver_kuma,miscellaneousRiderItems.build_driver_momotaros,miscellaneousRiderItems.build_driver_yujou,miscellaneousRiderItems.build_driver_obake,miscellaneousRiderItems.build_driver_wolf,miscellaneousRiderItems.build_driver_beetle,miscellaneousRiderItems.build_driver_card,miscellaneousRiderItems.build_driver_rose,miscellaneousRiderItems.build_driver_tora,miscellaneousRiderItems.build_driver_kujira,miscellaneousRiderItems.build_driver_kirin,miscellaneousRiderItems.build_driver_unicorn,miscellaneousRiderItems.build_driver_turtle,miscellaneousRiderItems.build_driver_deer,miscellaneousRiderItems.build_driver_penguin,miscellaneousRiderItems.build_driver_spider,miscellaneousRiderItems.build_driver_rabbit_gold,miscellaneousRiderItems.build_driver_spider,miscellaneousRiderItems.build_driver_kujira,miscellaneousRiderItems.build_driver_kirin,miscellaneousRiderItems.build_driver_sai,miscellaneousRiderItems.build_driver_scorpion};				
				Item[] evol_form= new Item[] {miscellaneousRiderItems.evol_driver_cobra,miscellaneousRiderItems.evol_driver_dragon,miscellaneousRiderItems.evol_driver_rabbit,miscellaneousRiderItems.evol_driver_blackhole,miscellaneousRiderItems.evol_driver_blackhole};
				Item[] cross_form= new Item[] {miscellaneousRiderItems.build_driver_cross_z_dragon,miscellaneousRiderItems.build_driver_magma,miscellaneousRiderItems.build_driver_cross_z_great,miscellaneousRiderItems.build_driver_galaxy};
				Item[] grease_form= new Item[] {RiderItems.build_driver_grease,miscellaneousRiderItems.build_driver_grease_perfect_kingdom};

				armorModel.belt=stack;

				if(stack.getItem() == RiderItems.build_driver)
				{
					if (item_OOOdriver.get_core(stack,"1")==2&item_OOOdriver.get_core(stack,"3")==2) {
						armorModel.wings=new ItemStack(miscellaneousRiderItems.hawk_gatling_wings);
					} else if (item_OOOdriver.get_core(stack,"1")==15&item_OOOdriver.get_core(stack,"3")==16) {
						armorModel.wings=new ItemStack(miscellaneousRiderItems.phoenix_robo_wings);				
					} else {
						armorModel.wings=new ItemStack(ShowaRiderItems.blanknoitem);
					}

					armorModel.belt3=new ItemStack(build_form[item_OOOdriver.get_core(stack,"2")]);

					if (item_OOOdriver.get_core(stack,"2")!=1&item_OOOdriver.get_core(stack,"2")!=3&item_OOOdriver.get_core(stack,"2")!=4&item_OOOdriver.get_core(stack,"2")!=5&item_OOOdriver.get_core(stack,"2")!=6){
						armorModel.belt2=new ItemStack(build_inorganic[item_OOOdriver.get_core(stack,"1")]);						
						armorModel.belt4=new ItemStack(build_organic[item_OOOdriver.get_core(stack,"3")]);
					}
				} else if(stack.getItem() == RiderItems.sclash_driver_cross_z_charge) {
					if (living.getHeldItem(EnumHand.OFF_HAND).getItem()==RiderItems.taka_full_bottle){
						armorModel.wings=new ItemStack(miscellaneousRiderItems.hawk_gatling_wings);
					} else {
						armorModel.wings=new ItemStack(ShowaRiderItems.blanknoitem);
					}
				}
				if(stack.getItem() == RiderItems.transteamgun_2) {
					if(living.isSneaking() || (living instanceof EntityPlayer && (((EntityPlayer) living).capabilities.isFlying))){
						if (item_OOOdriver.get_core(stack,"1")==0) {
							armorModel.wings=new ItemStack(miscellaneousRiderItems.night_rogue_wings);
						} else {
							armorModel.wings=new ItemStack(ShowaRiderItems.blanknoitem);
						}
					}
				} else if(stack.getItem() == RiderItems.evol_driver_mad_rogue) {
					if(living.isSneaking() || (living instanceof EntityPlayer && (((EntityPlayer) living).capabilities.isFlying))){
						armorModel.wings=new ItemStack(miscellaneousRiderItems.mad_rogue_wings);
					}
				}

				if(stack.getItem() == RiderItems.evol_driver_evol) {
					armorModel.belt2=new ItemStack(evol_form[item_OOOdriver.get_core(stack,"1")]);						
				}

				if(stack.getItem() == RiderItems.build_driver_cross_z) {
					armorModel.belt2=new ItemStack(cross_form[item_OOOdriver.get_core(stack,"1")]);						
				}

				if(stack.getItem() == RiderItems.build_driver_grease) {
					armorModel.belt2=new ItemStack(grease_form[item_OOOdriver.get_core(stack,"1")]);						
				}

				if (stack.getItem()!= RiderItems.nebulasteamgun_2 & stack.getItem()!= RiderItems.transteamgun_2){
					armorModel.belt=stack;
				} else {
					armorModel.belt=new ItemStack( ShowaRiderItems.blanknoitem);
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


	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, EntityEquipmentSlot slot, String type)
	{
		return Refercence.MODID+":textures/armor/blank.png";

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

	public int getlegend(ItemStack stack)
	{
		int islegend =0;
		if (item_builddriver.get_core(stack,"1")==7&item_builddriver.get_core(stack,"3")==9){
			islegend = 4;
		}else if (item_builddriver.get_core(stack,"1")==9&item_builddriver.get_core(stack,"3")==2){
			islegend = 7;
		}else if (item_builddriver.get_core(stack,"1")==10&item_builddriver.get_core(stack,"3")==10){
			islegend = 1;
		}	else if (item_builddriver.get_core(stack,"1")==1&item_builddriver.get_core(stack,"3")==12){
			islegend = 5;
		}	else if (item_builddriver.get_core(stack,"1")==12&item_builddriver.get_core(stack,"3")==13){
			islegend = 8;
		}	else if (item_builddriver.get_core(stack,"1")==5&item_builddriver.get_core(stack,"3")==19){
			islegend = 6;
		}else if (item_builddriver.get_core(stack,"1")==13&item_builddriver.get_core(stack,"3")==18){
			islegend = 10;
		}else if (item_builddriver.get_core(stack,"1")==17&item_builddriver.get_core(stack,"3")==20){
			islegend = 2;
		}else if (item_builddriver.get_core(stack,"1")==19&item_builddriver.get_core(stack,"3")==23){
			islegend = 9;
		}

		return islegend;
	}
	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack armor) {


		if (player.getItemStackFromSlot(EntityEquipmentSlot.HEAD)!= null){
			if (player.getItemStackFromSlot(EntityEquipmentSlot.CHEST)!= null){
				if (player.getItemStackFromSlot(EntityEquipmentSlot.LEGS)!= null){
					if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET)!= null){
						if (player.getItemStackFromSlot(EntityEquipmentSlot.LEGS).getItem() == RiderItems.buildlegs){
							if (player.getItemStackFromSlot(EntityEquipmentSlot.CHEST).getItem() == RiderItems.buildtroso){
								if (player.getItemStackFromSlot(EntityEquipmentSlot.HEAD).getItem() == RiderItems.buildhead){		
									ItemStack ItemStack = player.getItemStackFromSlot(EntityEquipmentSlot.FEET);
									if(item_OOOdriver.get_eftTime(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))<100){

										item_OOOdriver.set_eftTime(player.getItemStackFromSlot(EntityEquipmentSlot.FEET),item_OOOdriver.get_eftTime(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))+1);
									}
									if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.build_driver){
										if (get_core(ItemStack,"3")==0){
											player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 5, 2,true,false));
											if (get_core(ItemStack,"1")==0){
												player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 0,true,false));
											}
										}else 	if (get_core(ItemStack,"3")==1){
											player.addPotionEffect(new PotionEffect(PotionCore.PUNCH_BOOST_POTION, 5, 5,true,false));
											if (get_core(ItemStack,"1")==1){
												player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 1,true,false));
												player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 1,true,false));
											}
										}else 	if (get_core(ItemStack,"3")==2){
											player.fallDistance=0;
											player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 5, 1,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 1,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 250,0,true,false));
											if (get_core(ItemStack,"1")==2){											
												player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 5, 2,true,false));
												player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 2,true,false));
												player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 1,true,false));
												player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 250,0,true,false));
												player.addPotionEffect(new PotionEffect(PotionCore.FLY_POTION, 5, 4,true,false));
											}
										}else 	if (get_core(ItemStack,"3")==3){
											player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 1,true,false));
											if (get_core(ItemStack,"1")==6){
												player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 1,true,false));											
											}
										}else 	if (get_core(ItemStack,"3")==4){
											player.addPotionEffect(new PotionEffect(MobEffects.INVISIBILITY, 5, 1,true,false));

											if (get_core(ItemStack,"1")==4){
												player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 5, 2,true,false));											
											}
										}else 	if (get_core(ItemStack,"3")==5){
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 0,true,false));	
											player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 1,true,false));	
											if (get_core(ItemStack,"1")==5){
												player.addPotionEffect(new PotionEffect(PotionCore.FLY_POTION, 5, 4,true,false));
											}
										}else 	if (get_core(ItemStack,"3")==8){
											player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 5, 1,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 1,true,false));
											if (get_core(ItemStack,"1")==8){
												player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 5, 2,true,false));
												player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 2,true,false));
												player.addPotionEffect(new PotionEffect(MobEffects.SATURATION, 5, 1,true,false));
											}
										}else 	if (get_core(ItemStack,"3")==6){
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 1,true,false));	
											player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 250,0,true,false));
											if (get_core(ItemStack,"1")==3){
												player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 3,true,false));
												player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 1,true,false));	

											}
										}else 	if (get_core(ItemStack,"3")==7){
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 2,true,false));	
											player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 2,true,false));		
											player.addPotionEffect(new PotionEffect(MobEffects.WITHER, 5, 0,true,false));	
											if (get_core(ItemStack,"1")==7){
												player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 3,true,false));
												player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 3,true,false));	
												player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 2,true,false));	

											}
										}else 	if (get_core(ItemStack,"3")==11){
											player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 1,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 2,true,false));	
											if (get_core(ItemStack,"1")==13){
												player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 2,true,false));
												player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 3,true,false));	
												player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 1,true,false));
											}
										}else 	if (get_core(ItemStack,"3")==14){
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 1,true,false));	
											player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 2,true,false));		
											if (get_core(ItemStack,"1")==13){
												player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 3,true,false));	
												player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 5,true,false));	

											}
										}else 	if (get_core(ItemStack,"3")==15){
											player.addPotionEffect(new PotionEffect(MobEffects.WATER_BREATHING, 5, 0,true,false));
											if (get_core(ItemStack,"1")==14){
												player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 1,true,false));

											}	
										}else 	if (get_core(ItemStack,"3")==16){
											player.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE, 5, 0,true,false));
											if (get_core(ItemStack,"1")==15){
												player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 1,true,false));
												player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 1,true,false));
											}

										}else 	if (get_core(ItemStack,"3")==17){
											player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 1,true,false));	
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 1,true,false));	
											if (get_core(ItemStack,"1")==16){
												player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 2,true,false));
												player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 2,true,false));	
											}
										}else 	if (get_core(ItemStack,"3")==21){
											player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 1,true,false));
											if (get_core(ItemStack,"1")==18){
												player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 1,true,false));
												player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 2,true,false));
											}
										}else 	if (get_core(ItemStack,"3")==22){
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 1,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 0,true,false));
											if (get_core(ItemStack,"1")==19){
												player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 2,true,false));
												player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 1,true,false));
												if (player.isSneaking()){
													player.addPotionEffect(new PotionEffect(MobEffects.SLOWNESS, 5, 4,true,false));
												}
											}
										}else 	if (get_core(ItemStack,"3")==24){
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 2,true,false));
											if (get_core(ItemStack,"1")==20){
												player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 2,true,false));
												player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 2,true,false));	
												player.addPotionEffect(new PotionEffect(PotionCore.FLY_POTION, 5, 4,true,false));
											}

										}else 	if (get_core(ItemStack,"3")==25){
											player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 1,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 1,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 250,0,true,false));
											if (get_core(ItemStack,"1")==21){
												player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 3,true,false));
												player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 2,true,false));
												player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 5, 2,true,false));
											}
										}else 	if (get_core(ItemStack,"3")==26){
											player.addPotionEffect(new PotionEffect(MobEffects.WATER_BREATHING, 5, 0,true,false));
											if (get_core(ItemStack,"1")==22){
												if (player.isInWater()){
													player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 250,0,true,false));
													player.addPotionEffect(new PotionEffect(PotionCore.FLY_POTION, 5, 4,true,false));										
												}
											}
										}else 	if (get_core(ItemStack,"3")==27){
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 1,true,false));
											if (get_core(ItemStack,"1")==23){
												player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 2,true,false));
												player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 2,true,false));
												player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 5, 2,true,false));	
											}
										}else 	if (get_core(ItemStack,"3")==28){
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 1,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 1,true,false));
											if (get_core(ItemStack,"1")==24){
												player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 2,true,false));
												player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 3,true,false));
												player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 3,true,false));
												player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 5, 2,true,false));
											}											

										}else 	if (get_core(ItemStack,"3")==29){
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 2,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.WATER_BREATHING, 5, 0,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.SLOWNESS, 5, 1,true,false));
											if (get_core(ItemStack,"1")==25){
												player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 3,true,false));											
												player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 3,true,false));
											}
										}else 	if (get_core(ItemStack,"3")==30){
											player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 1,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 5, 0,true,false));
											if (get_core(ItemStack,"1")==26){
												player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 2,true,false));
												player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 5, 1,true,false));
												player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 1,true,false));	
											}
										}else 	if (get_core(ItemStack,"3")==31){
											player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 1,true,false));
											if (get_core(ItemStack,"1")==27){
												player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 2,true,false));
												if (player.isInWater()){											
													if (player.isSneaking()){
														Vec3d look = player.getLookVec();
														player.motionX=look.x;
														player.motionY=look.y;
														player.motionZ=look.z;
													}	
												}		
											}
										}else 	if (get_core(ItemStack,"3")==32){
											player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 5, 0,true,false));
											if (get_core(ItemStack,"1")==28){
												player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 5, 1,true,false));
												player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 1,true,false));
												player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 1,true,false));
											}	
										}else 	if (get_core(ItemStack,"3")==33){
											player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 5, 2,true,false));
											if (get_core(ItemStack,"1")==29){
												player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 5, 3,true,false));
												player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 3,true,false));	
												player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 3,true,false));
											}											
										}else 	if (get_core(ItemStack,"3")==34){
											player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 0,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 5, 1,true,false));
											if (get_core(ItemStack,"1")==30){
												player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 1,true,false));
												player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 5, 2,true,false));
												player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 1,true,false));	
											}
										}else 	if (get_core(ItemStack,"3")==35){
											player.addPotionEffect(new PotionEffect(MobEffects.WATER_BREATHING, 5, 0,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 2,true,false));
											if (get_core(ItemStack,"1")==31){
												if (player.isInWater()){
													player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 250, 0,true,false));	
													if (player.isSneaking()){
														Vec3d look = player.getLookVec();
														player.motionX=look.x;
														player.motionY=look.y;
														player.motionZ=look.z;
													}											
												}
											}
										}else 	if (get_core(ItemStack,"3")==36){
											player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 1,true,false));
											if (get_core(ItemStack,"1")==33){
												player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 2,true,false));
												player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 5, 1,true,false));
												player.addPotionEffect(new PotionEffect(MobEffects.WATER_BREATHING, 5, 0,true,false));
											}
										}else 	if (get_core(ItemStack,"3")==37){
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 1,true,false));	
											if (get_core(ItemStack,"1")==34){
												player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 2,true,false));	
												player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 1,true,false));	
												player.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE, 5, 0,true,false));
											}
										}



										if (get_core(ItemStack,"2")==1){
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 1,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 1,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 5, 2,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 1,true,false));												


										}else if (get_core(ItemStack,"2")==2){
											if (get_core(ItemStack,"1")==0){
												player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 4,true,false));
												player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 2,true,false));
												player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 5, 2,true,false));
												player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 1,true,false));	
												player.addPotionEffect(new PotionEffect(MobEffects.HUNGER, 5, 1,true,false));
											}
											else if (get_core(ItemStack,"1")==18){
												player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 3,true,false));
												player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 1,true,false));
												player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 250, 0,true,false));
												player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 2,true,false));
												player.addPotionEffect(new PotionEffect(MobEffects.HUNGER, 5, 1,true,false));
											}
											else if (get_core(ItemStack,"1")==2){
												player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 3,true,false));	
												player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 3,true,false));
												player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 1,true,false));
												player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 3,true,false));
												player.addPotionEffect(new PotionEffect(MobEffects.HUNGER, 5, 1,true,false));
											}
											else if (get_core(ItemStack,"1")==13){
												player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 3,true,false));	
												player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 4,true,false));	
												player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 5,true,false));
												player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 1,true,false));
												player.addPotionEffect(new PotionEffect(MobEffects.HUNGER, 5, 1,true,false));
											}
										}else if (get_core(ItemStack,"2")==3){
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 2,true,false));			
											player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 3,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 5, 3,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 1,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.REGENERATION, 5, 1,true,false));

										}else if (get_core(ItemStack,"2")==4){
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 4,true,false));	
											player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 1,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 5, 0,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 3,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.REGENERATION, 5, 0,true,false));

										}else if (get_core(ItemStack,"2")==5){
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 3,true,false));	
											player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 3,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 3,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.REGENERATION, 5, 1,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 3,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 250, 0,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE, 5, 0,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.WATER_BREATHING, 5, 0,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.SATURATION, 5, 0,true,false));

										}else if (get_core(ItemStack,"2")==6){
											player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 3,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 2,true,false));	
											player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 1,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 1,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.REGENERATION, 5, 0,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 5, 1,true,false));
										}


										if (get_core(ItemStack,"1")==0){
											player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 0,true,false));
										}else if (get_core(ItemStack,"1")==1){
											player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 0,true,false));
										}else if (get_core(ItemStack,"1")==2){
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 0,true,false));
										}else if (get_core(ItemStack,"1")==6){
											player.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE, 5, 0,true,false));
										}else if (get_core(ItemStack,"1")==4){
											player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 3,true,false));	
										}else if (get_core(ItemStack,"1")==5){
											player.addPotionEffect(new PotionEffect(PotionCore.BOOST_POTION, 5, 0,true,false));
										}else if (get_core(ItemStack,"1")==3){
											player.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE, 5, 0,true,false));	
										}else if (get_core(ItemStack,"1")==11){
											if (player.isSneaking()){
												Random generator = new Random();
												int rand = generator.nextInt(6);
												//player.playSound("note.bass", 1F, itemRand.nextFloat() * 0.1F + 0.2F*rand);
											}
										}else if (get_core(ItemStack,"1")==13){
											player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 3,true,false));	
										}else if (get_core(ItemStack,"1")==14){
											player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 250, 0,true,false));
										}else if (get_core(ItemStack,"1")==8){
											player.addPotionEffect(new PotionEffect(MobEffects.SATURATION, 5, 0,true,false));
										}else if (get_core(ItemStack,"1")==15){
											player.addPotionEffect(new PotionEffect(PotionCore.PUNCH_BOOST_POTION, 5, 4,true,false));
										}else if (get_core(ItemStack,"1")==16){
											player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 250, 0,true,false));
										}else if (get_core(ItemStack,"1")==18){
											player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 250, 0,true,false));
										}else if (get_core(ItemStack,"1")==19){
											player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 250, 0,true,false));
											if (player.isSneaking()){
												player.addPotionEffect(new PotionEffect(MobEffects.SLOWNESS, 5, 2,true,false));
											}
										}else if (get_core(ItemStack,"1")==20){
											player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 1,true,false));	
											player.fallDistance=0; 
											if (player.isSneaking()){
												Vec3d look = player.getLookVec();	                                               
												player.motionY=+1;
											}

										}else if (get_core(ItemStack,"1")==21){
											player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 5, 1,true,false));																						

										}else if (get_core(ItemStack,"1")==22){
											player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 1,true,false));
											if (player.isSneaking()){
												player.fallDistance=0; 
												Vec3d look = player.getLookVec();
												player.motionX=look.x/2;
												player.motionY=look.y/2;
												player.motionZ=look.z/2;
											}
										}else if (get_core(ItemStack,"1")==23){
											player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 1,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 5, 0,true,false));	
										}else if (get_core(ItemStack,"1")==24){
											player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 1,true,false));	
										}else if (get_core(ItemStack,"1")==25){
											player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 2,true,false));
										}else if (get_core(ItemStack,"1")==26){
											player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 0,true,false));
										}else if (get_core(ItemStack,"1")==27){
											player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 1,true,false));
										}else if (get_core(ItemStack,"1")==28){
											player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 0,true,false));
										}else if (get_core(ItemStack,"1")==29){
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 2,true,false));	
											player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 2,true,false));	
										}else if (get_core(ItemStack,"1")==30){
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 0,true,false));	
										}else if (get_core(ItemStack,"1")==31){
											player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 1,true,false));
										}else if (get_core(ItemStack,"1")==33){
											player.addPotionEffect(new PotionEffect(MobEffects.WATER_BREATHING, 5, 0,true,false));
										}else if (get_core(ItemStack,"1")==34){
											player.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE, 5, 0,true,false));
										}
									}
									if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.build_driver_cross_z){
										if (get_core(ItemStack,"1")==0){
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 2,true,false));	
											player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 2,true,false));	
											player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 3,true,false));
										}else if (get_core(ItemStack,"1")==1){
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 3,true,false));	
											player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 2,true,false));	
											player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 1,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 1,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE, 5, 0,true,false));
										}else if (get_core(ItemStack,"1")==2){
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 4,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 2,true,false));	
											player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 3,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 3,true,false));
										}else if (get_core(ItemStack,"1")==3){
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 3,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 2,true,false));	
											player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 5, 2,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 1,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 250, 0,true,false));
										}
									}
									if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.sclash_driver_grease){
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 2,true,false));	
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 0,true,false));	
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 1,true,false));	
										player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 250, 0,true,false));
									}
									if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.sclash_driver_cross_z_charge){
										if (player.getHeldItem(EnumHand.OFF_HAND).getItem()==RiderItems.taka_full_bottle){
											player.addPotionEffect(new PotionEffect(PotionCore.FLY_POTION, 5, 4,true,false));	
										}
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 3,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 1,true,false));	
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 1,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 2,true,false));	
									}
									if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.sclash_driver_rogue){
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 3,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 2,true,false));	
										player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 250, 0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 1,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 3,true,false));	
									}
									if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.build_driver_rogue){
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 2,true,false));	
										player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 250, 0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 2,true,false));
									}
									if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.transteamgun_2){
										if (get_core(ItemStack,"1")==0){
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 1,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 0,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 1,true,false));	
											player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 250, 0,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 5, 1,true,false));
											player.addPotionEffect(new PotionEffect(PotionCore.FLY_POTION, 5, 4,true,false));	
										}
										else if (get_core(ItemStack,"1")==1){
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 0,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 1,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 2,true,false));	
											player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 0,true,false));
										}
									}
									if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.nebulasteamgun_2){
										if (get_core(ItemStack,"1")==0){
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 3,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 1,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 1,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 5, 2,true,false));
										}
										else if (get_core(ItemStack,"1")==1){
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 2,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 1,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 3,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 1,true,false));
										}
										else if (get_core(ItemStack,"1")==2){
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 4,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 2,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 3,true,false));									
											player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 250, 0,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE, 5, 0,true,false));
										}
										else if (get_core(ItemStack,"1")==3){
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 3,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 2,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 5,true,false));												
											player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 250, 0,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.WATER_BREATHING, 5, 0,true,false));
										}
										else if (get_core(ItemStack,"1")==4){
											player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 2,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 5, 3,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 3,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 2,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 2,true,false));																							
										}
										else if (get_core(ItemStack,"1")==5){
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 4,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 3,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 4,true,false));									
											player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 250, 0,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.WATER_BREATHING, 5, 0,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE, 5, 0,true,false));
											player.addPotionEffect(new PotionEffect(PotionCore.FIRE_PUNCH_POTION, 5, 4,true,false));	
										}
									}
									if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.evol_driver_evol){
										if (get_core(ItemStack,"1")==0){
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 3,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 2,true,false));	
											player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 5, 2,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 1,true,false));
										}
										else if (get_core(ItemStack,"1")==1){
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 4,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 1,true,false));	
											player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 5, 1,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 2,true,false));
										}
										else if (get_core(ItemStack,"1")==2){
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 2,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 3,true,false));	
											player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 5, 3,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 1,true,false));
										}		
										else if (get_core(ItemStack,"1")==3){
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 4,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 3,true,false));	
											player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 5, 2,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 2,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 2,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 250, 0,true,false));
											player.addPotionEffect(new PotionEffect(PotionCore.FLY_POTION, 5, 4,true,false));	
										}		
										else if (get_core(ItemStack,"1")==4){
											player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 4,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 3,true,false));	
											player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 5, 2,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 2,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 2,true,false));
											player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 250, 0,true,false));
											player.addPotionEffect(new PotionEffect(PotionCore.FLY_POTION, 5, 4,true,false));	
										}
									}
									if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.evol_driver_mad_rogue){
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 1,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 2,true,false));	
										player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 250, 0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 5, 2,true,false));
										player.addPotionEffect(new PotionEffect(PotionCore.FLY_POTION, 5, 4,true,false));	
									}
									if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.build_driver_grease){
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 3,true,false));	
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 1,true,false));	
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 1,true,false));	
										player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 250, 0,true,false));
										player.addPotionEffect(new PotionEffect(PotionCore.PUNCH_BOOST_POTION, 5, 4,true,false));	
										if (player.getLastAttackedEntity()!=null){
											player.getLastAttackedEntity().addPotionEffect(new PotionEffect(MobEffects.SLOWNESS, 250, 1));
										}
									}	if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.build_driver_blood){
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 4,true,false));	
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 1,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 1,true,false));	
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 2,true,false));	

									}
								}
							}
						}
					}
				}
			}
		}
	}

	
	public   String getTexture(Entity entity, int num,String ext)
	{
		if (entity instanceof EntityLivingBase){
			EntityLivingBase player = ((EntityLivingBase)entity);
			if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem()instanceof item_rider_driver){
				item_rider_driver belt =((item_rider_driver)player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem());

				if (num==8){
					if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.build_driver||player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.build_driver_cross_z||player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.sclash_driver_grease||player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.sclash_driver_cross_z_charge){
						if (getlegend(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))!=0){
							return Refercence.MODID+":textures/armor/"+"build_"+ CoreNamelegend[getlegend(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))-1] +"_2.png";

						}else{


							return Refercence.MODID+":textures/armor/"+"build_under.png";
						}
					}	
				}else if (num==2||num==13||num==12||num==6){


					if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.build_driver){

						if (getlegend(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))!=0){
							return Refercence.MODID+":textures/armor/"+"build_"+ CoreNamelegend[getlegend(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))-1] +ext;

						}else{
							return Refercence.MODID+":textures/armor/"+"build_"+ CoreName[item_builddriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET),"1")]+formName[item_builddriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET),"2")] +".png";

						}

					}else if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.build_driver_cross_z){

						return Refercence.MODID+":textures/armor/"+"cross_z"+crosszName[item_builddriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET),"1")] +ext;


					}else if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.transteamgun_2){

						return Refercence.MODID+":textures/armor/"+steamName[item_builddriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET),"1")] +ext;


					}else if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.evol_driver_evol){

						return Refercence.MODID+":textures/armor/"+"evol_"+evolName[item_builddriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET),"1")] +ext;

					}else if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.nebulasteamgun_2){

						return Refercence.MODID+":textures/armor/"+gearName[item_builddriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET),"1")]+ext;


					}else if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.build_driver_grease){
						return Refercence.MODID+":textures/armor/"+"grease"+greaseName[item_builddriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET),"1")]+ext;

					}	else
					{
						return Refercence.MODID+":textures/armor/"+Rider+ext;

					}
				}else  if (num==1||num==7||num==5||num==3||num==14){


					if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.build_driver){

						if (getlegend(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))!=0){
							return Refercence.MODID+":textures/armor/"+"build_"+ CoreNamelegend[getlegend(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))-1] +ext;

						}else{
							return Refercence.MODID+":textures/armor/"+"build_"+ CoreName2[item_builddriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET),"3")]+formName[item_builddriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET),"2")] +".png";

						}

					}else if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.build_driver_cross_z){

						return Refercence.MODID+":textures/armor/"+"cross_z"+crosszName[item_builddriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET),"1")] +ext;


					}else if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.transteamgun_2){

						return Refercence.MODID+":textures/armor/"+steamName[item_builddriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET),"1")] +ext;


					}else if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.evol_driver_evol){

						return Refercence.MODID+":textures/armor/"+"evol_"+evolName[item_builddriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET),"1")] +ext;

					}else if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.nebulasteamgun_2){

						return Refercence.MODID+":textures/armor/"+gearName[item_builddriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET),"1")]+ext;


					}else if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.build_driver_grease){
						return Refercence.MODID+":textures/armor/"+"grease"+greaseName[item_builddriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET),"1")]+ext;

					}	else
					{
						return Refercence.MODID+":textures/armor/"+Rider+ext;

					}
				} else{
					return "blank";

				}
			}else{
				return "blank";
			}
		}else{
			return "blank";


		}
		return "blank";


	}
}		







