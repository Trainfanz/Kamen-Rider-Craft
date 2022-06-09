package Kamen_Rider_Craft_4TH.item.saber;

import javax.annotation.Nullable;

import org.lwjgl.opengl.GL11;

import Kamen_Rider_Craft_4TH.ReiwaRiderItems;
import Kamen_Rider_Craft_4TH.RiderItems;
import Kamen_Rider_Craft_4TH.ShowaRiderItems;
import Kamen_Rider_Craft_4TH.TokuCraft_core;
import Kamen_Rider_Craft_4TH.item.ooo.item_OOOdriver;
import Kamen_Rider_Craft_4TH.item.rider_armor_base.Item_form_change;
import Kamen_Rider_Craft_4TH.item.rider_armor_base.item_rider_driver;
import Kamen_Rider_Craft_4TH.item.zi_o.item_zikudriver;
import Kamen_Rider_Craft_4TH.model.model_belt;
import Kamen_Rider_Craft_4TH.model.model_belt_plus;
import Kamen_Rider_Craft_4TH.model.model_belt_w;
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
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class item_saberdriver extends item_rider_driver
{

	public int BOOK_L;
	public int BOOK_M;
	public int BOOK_R;

	public static String[] book_l= new String[] {"base_l","brave_dragon","genbu_shinwa","jaaku_dragon","tenkuu_no_pegasus","tri_cerberus","eternal_phoenix"
			,"","","","",""};

	public static String[] book_m= new String[] {"base_m","lion_senki","needle_hedgehog","storm_eagle","","","","","","",""};

	public static String[] book_r= new String[] {"base_r","peter","jackun","lamp_do_alngina","kobuta_3_kyouda","sarutobi_ninjaden","king_of_arthur",
			"kirin_no_ongaeshi","sarukani_wars","bakusou_usagi_to_kame","saiyuu_journey","hanselnuts_to_grete","bremen_no_rock_band","hoshin_kamen_engi",
			"tsuki_no_hime_kaguyan","osha_jizou_san","issun_bushi","saber_televi_kun","daishougun_momoichirou","daikengou_urashimajirou","daiyokozuna_kinzaburou"};

	public static String[] book_mode= new String[] {"","_jaou_dragon","_dragonic_knight","_emotional_dragon","_ghost","_x_swordman","_x_swordman_wonderful"
			,"_x_swordman_powerful","_king_lion","_primitive_dragon","_elemental_primitive_dragon","_tategami_hyoujuu_senki","_xross","_specter","_zenkaiger"
			,"","_amazing_siren","_arabiana_night","_ultimate_bahamut"};



	public item_saberdriver (String name,ArmorMaterial par2EnumArmorMaterial, int par3, String rider,int book_l,int book_m, int book_r)
	{
		
		super(name,par2EnumArmorMaterial,4,rider,(Item_form_change) RiderItems.keyfuestle,ReiwaRiderItems.saberhead, ReiwaRiderItems.sabertroso, ReiwaRiderItems.saberlegs);

		BOOK_L = book_l;
		BOOK_M = book_m;
		BOOK_R = book_r;
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



	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack armor) {


		if (player.getItemStackFromSlot(EntityEquipmentSlot.HEAD)!= null){
			if (player.getItemStackFromSlot(EntityEquipmentSlot.CHEST)!= null){
				if (player.getItemStackFromSlot(EntityEquipmentSlot.LEGS)!= null){
					if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET)!= null){
						if (player.getItemStackFromSlot(EntityEquipmentSlot.LEGS).getItem() == ReiwaRiderItems.saberlegs){
							if (player.getItemStackFromSlot(EntityEquipmentSlot.CHEST).getItem() == ReiwaRiderItems.sabertroso){
								if (player.getItemStackFromSlot(EntityEquipmentSlot.HEAD).getItem() == ReiwaRiderItems.saberhead){
									ItemStack ItemStack = player.getItemStackFromSlot(EntityEquipmentSlot.FEET);
									
									player.addPotionEffect(new PotionEffect(PotionCore.SLASH_POTION, 5, 0,true,false));
									
									if (Rider == "buster"){
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 1,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 0,true,false));
									}else if (Rider == "kenzan"){
										
										player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 5, 6,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 2,true,false));
									}else if (Rider == "slash"){
										player.addPotionEffect(new PotionEffect(MobEffects.SATURATION, 5, 0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 1,true,false));
									}else if (Rider == "falchion"){
										player.addPotionEffect(new PotionEffect(MobEffects.REGENERATION, 250, 0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 2,true,false));
										player.addPotionEffect(new PotionEffect(PotionCore.FLY_POTION, 5, 0,true,false));
									}else if (Rider == "saikou_shadow"){
										player.addPotionEffect(new PotionEffect(MobEffects.REGENERATION, 250, 0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.INVISIBILITY, 5, 0,true,false));
									}else if (Rider == "solomon"){
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 5,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 5,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 5,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 5, 5,true,false));
									}else if (Rider == "sabela"){
										if (player.isSneaking()){
											player.world.spawnParticle(EnumParticleTypes.SMOKE_LARGE,player.posX,player.posY, player.posZ, 0.0D, 0.0D, 0.0D);
											player.world.spawnParticle(EnumParticleTypes.SMOKE_LARGE,player.posX,player.posY+1, player.posZ, 0.0D, 0.0D, 0.0D);
											player.world.spawnParticle(EnumParticleTypes.SMOKE_LARGE,player.posX,player.posY+0.5, player.posZ, 0.0D, 0.0D, 0.0D);
											player.addPotionEffect(new PotionEffect(MobEffects.INVISIBILITY, 5, 0,true,false));
										}
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 2,true,false));
									}else if (Rider == "durendal"){
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 3,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 3,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 5, 3,true,false));
									}else if (Rider == "storious"){
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 6,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 6,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 3,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 6,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 5, 7,true,false));
									}

									if (get_core_for_forms(ItemStack,"l")==1){
										player.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE, 5, 0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 0,true,false));
									}else if (get_core_for_forms(ItemStack,"l")==2){
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 1,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 0,true,false));
									}else if (get_core_for_forms(ItemStack,"l")==3){
										player.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE, 5, 0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 0,true,false));
									}else if (get_core_for_forms(ItemStack,"l")==4){
										player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 5, 4,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 2,true,false));
									}else if (get_core_for_forms(ItemStack,"l")==5){
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 2,true,false));
									}else if (get_core_for_forms(ItemStack,"l")==6){
										player.addPotionEffect(new PotionEffect(MobEffects.REGENERATION, 250, 0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 0,true,false));
										player.addPotionEffect(new PotionEffect(PotionCore.FLY_POTION, 5, 0,true,false));
									}


									if (get_core_for_forms(ItemStack,"m")==1){
										player.addPotionEffect(new PotionEffect(MobEffects.WATER_BREATHING, 5, 0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 0,true,false));
									}else if (get_core_for_forms(ItemStack,"m")==2){
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 1,true,false));
									}else if (get_core_for_forms(ItemStack,"m")==3){
										player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 250, 0,true,false));
										player.addPotionEffect(new PotionEffect(PotionCore.FLY_POTION, 5, 0,true,false));
									}

									if (get_core_for_forms(ItemStack,"r")==1){
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 2,true,false));
									}else if (get_core_for_forms(ItemStack,"r")==2){
										player.addPotionEffect(new PotionEffect(MobEffects.SATURATION, 5, 0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 0,true,false));
									}else if (get_core_for_forms(ItemStack,"r")==3){
										player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 250, 0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 1,true,false));
									}else if (get_core_for_forms(ItemStack,"r")==4){
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 1,true,false));
									}else if (get_core_for_forms(ItemStack,"r")==5){
										player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 5, 6,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 2,true,false));
									}else if (get_core_for_forms(ItemStack,"r")==6){
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 1,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 2,true,false));
									}else if (get_core_for_forms(ItemStack,"r")==7){
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 2,true,false));
									}else if (get_core_for_forms(ItemStack,"r")==8){
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 1,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 1,true,false));
									}else if (get_core_for_forms(ItemStack,"r")==9){
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 5,true,false));
									}else if (get_core_for_forms(ItemStack,"r")==10){
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 1,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 5, 2,true,false));
									}else if (get_core_for_forms(ItemStack,"r")==11){
										player.addPotionEffect(new PotionEffect(MobEffects.SATURATION, 5, 0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 1,true,false));
									}else if (get_core_for_forms(ItemStack,"r")==12){
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 4,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 4,true,false));
									}else if (get_core_for_forms(ItemStack,"r")==13){
										player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 5, 3,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 1,true,false));
									}else if (get_core_for_forms(ItemStack,"r")==14){
										player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 250, 1,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 1,true,false));
									}else if (get_core_for_forms(ItemStack,"r")==15){
										player.addPotionEffect(new PotionEffect(MobEffects.SATURATION, 5, 1,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.LUCK, 5, 2,true,false));
									}else if (get_core_for_forms(ItemStack,"r")==16){
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 4,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 4,true,false));
									}else if (get_core_for_forms(ItemStack,"r")==17){
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 2,true,false));
									}else if (get_core_for_forms(ItemStack,"r")==18){
										player.addPotionEffect(new PotionEffect(MobEffects.SATURATION, 5, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 1,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 1,true,false));
									}else if (get_core_for_forms(ItemStack,"r")==19){
										player.addPotionEffect(new PotionEffect(MobEffects.SATURATION, 5, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 1,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 1,true,false));
									}else if (get_core_for_forms(ItemStack,"r")==20){
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 1,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 1,true,false));
									}

									if (get_core_for_forms(ItemStack,"f")==1){
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 5, 3,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 1,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE, 5, 0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 1,true,false));
									}else if (get_core_for_forms(ItemStack,"f")==2){
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 3,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 5, 4,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 1,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE, 5, 0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 1,true,false));
									}else if (get_core_for_forms(ItemStack,"f")==3){
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 3,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 5, 5,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE, 5, 0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 2,true,false));
									}else if (get_core_for_forms(ItemStack,"f")==4){
										player.addPotionEffect(new PotionEffect(MobEffects.INVISIBILITY, 5, 0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 5, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE, 5, 0,true,false));
									}else if (get_core_for_forms(ItemStack,"f")==5){
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 3,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 5, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 1,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 1,true,false));
									}else if (get_core_for_forms(ItemStack,"f")==6){
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 3,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 5, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 3,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 2,true,false));
									}else if (get_core_for_forms(ItemStack,"f")==7){
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 3,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 5, 4,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 1,true,false));
									}else if (get_core_for_forms(ItemStack,"f")==8){
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 3,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 5, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 3,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.WATER_BREATHING, 5, 0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 1,true,false));
									}else if (get_core_for_forms(ItemStack,"f")==9){
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 4,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 5, 4,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 2,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE, 5, 0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 2,true,false));
									}else if (get_core_for_forms(ItemStack,"f")==10){
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 4,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 5, 4,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 3,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE, 5, 0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 3,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.WATER_BREATHING, 5, 0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 3,true,false));
									}else if (get_core_for_forms(ItemStack,"f")==11){
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 4,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 5, 4,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 3,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 3,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.WATER_BREATHING, 5, 0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 3,true,false));
										player.addPotionEffect(new PotionEffect(PotionCore.FLY_POTION, 5, 0,true,false));
										if (player.isInWater()){
											if (player.isSneaking()){
											Vec3d look = player.getLookVec();
											player.motionX=look.x/2;
											player.motionY=look.y/2;
											player.motionZ=look.z/2;
										}}
									}else if (get_core_for_forms(ItemStack,"f")==12){
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 4,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 5, 4,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 5,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE, 5, 0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 3,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.WATER_BREATHING, 5, 0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 3,true,false));
									}else if (get_core_for_forms(ItemStack,"f")==13){
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.INVISIBILITY, 5, 0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 3,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 2,true,false));
									}else if (get_core_for_forms(ItemStack,"f")==14){
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 6,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 5, 6,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 5,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE, 5, 0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 3,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.WATER_BREATHING, 5, 0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 3,true,false));
									}else if (get_core_for_forms(ItemStack,"f")==15){
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 6,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 5, 6,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 6,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE, 5, 0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 5,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.WATER_BREATHING, 5, 0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 5,true,false));
										player.addPotionEffect(new PotionEffect(PotionCore.FLY_POTION, 5, 0,true,false));
									}else if (get_core_for_forms(ItemStack,"f")==16){
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 4,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 6,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 5, 6,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 2,true,false));
									}else if (get_core_for_forms(ItemStack,"f")==17){
										player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 5, 6,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 5, 6,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 6,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE, 5, 0,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 5, 5,true,false));
										player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 5, 5,true,false));
									}else if (get_core_for_forms(ItemStack,"f")==18){
										//"_ultimate_bahamut"
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
				
				armorModel.belt=stack;
				
				Item[] shinjuu= new Item[] {ShowaRiderItems.blanknoitem,ReiwaRiderItems.seiken_swordriver_dragon,ReiwaRiderItems.seiken_swordriver_genbu,
						ReiwaRiderItems.seiken_swordriver_jaaku_dragon,ReiwaRiderItems.seiken_swordriver_pegasus,ReiwaRiderItems.seiken_swordriver_cerberus,
						ReiwaRiderItems.seiken_swordriver_phoenix};
			
				Item[] seibutsu= new Item[] {ShowaRiderItems.blanknoitem,ReiwaRiderItems.seiken_swordriver_lion,ReiwaRiderItems.seiken_swordriver_hedgehog,
						ReiwaRiderItems.seiken_swordriver_eagle};
				
				Item[] monogatari= new Item[] {ShowaRiderItems.blanknoitem,ReiwaRiderItems.seiken_swordriver_peter,ReiwaRiderItems.seiken_swordriver_jackun,
						ReiwaRiderItems.seiken_swordriver_alangina,ReiwaRiderItems.seiken_swordriver_butasan,ReiwaRiderItems.seiken_swordriver_ninja,
						ReiwaRiderItems.seiken_swordriver_arthur,ReiwaRiderItems.seiken_swordriver_kirin,ReiwaRiderItems.seiken_swordriver_sarukani,
						ReiwaRiderItems.seiken_swordriver_usakame,ReiwaRiderItems.seiken_swordriver_saiyuu,ReiwaRiderItems.seiken_swordriver_hansel,
						ReiwaRiderItems.seiken_swordriver_bremen,ReiwaRiderItems.seiken_swordriver_houshin_engi,ReiwaRiderItems.seiken_swordriver_kaguyan,
						ReiwaRiderItems.seiken_swordriver_jizousan,ReiwaRiderItems.seiken_swordriver_issun,ReiwaRiderItems.seiken_swordriver_televikun,
						ReiwaRiderItems.seiken_swordriver_momoichirou,ReiwaRiderItems.seiken_swordriver_urashima_jirou,ReiwaRiderItems.seiken_swordriver_kinzaburou};
				
				Item[] others= new Item[] {ShowaRiderItems.blanknoitem,ReiwaRiderItems.jaken_caliburdriver_jaou,ReiwaRiderItems.seiken_swordriver_dragonic,
						ReiwaRiderItems.seiken_swordriver_emotional,ReiwaRiderItems.seiken_swordriver_ghost,ReiwaRiderItems.seiken_saikou_driver_x_swordman,
						ReiwaRiderItems.seiken_saikou_driver_x_swordman2,ReiwaRiderItems.seiken_saikou_driver_x_swordman1,ReiwaRiderItems.seiken_swordriver_king_lion,
						ReiwaRiderItems.seiken_swordriver_primitive,ReiwaRiderItems.seiken_swordriver_elemental,ReiwaRiderItems.seiken_swordriver_tategami,
						ShowaRiderItems.blanknoitem,ReiwaRiderItems.seiken_swordriver_specter,ReiwaRiderItems.seiken_swordriver_super_hero_senki,
						ReiwaRiderItems.seiken_swordriver_wonder,ReiwaRiderItems.seiken_swordriver_siren,ReiwaRiderItems.seiken_swordriver_arabiana,
						ReiwaRiderItems.seiken_swordriver_bahamut};

	
				
				if (stack.getItem()==ReiwaRiderItems.sword_of_logos_buckle_buster){
					if(living.getHeldItemMainhand().getItem()!= ReiwaRiderItems.dogouken_gekido&living.getHeldItemOffhand().getItem()!= ReiwaRiderItems.dogouken_gekido){
						armorModel.wings= new ItemStack(ReiwaRiderItems.dogouken_gekido_back);
					}
				}
				
				if (stack.getItem()==ReiwaRiderItems.seiken_swordriver_saber||stack.getItem()==ReiwaRiderItems.seiken_swordriver_blaze||stack.getItem()==ReiwaRiderItems.seiken_swordriver_espada){
					if (this.get_core_for_forms(stack,"f")==15){
					armorModel.wings= new ItemStack(ReiwaRiderItems.wonder_ride_books);
					}
					armorModel.belt=new ItemStack(ReiwaRiderItems.seiken_swordriver);
					armorModel.belt2=new ItemStack(shinjuu[this.get_core_for_forms(stack,"l")]);
				armorModel.belt3=new ItemStack(seibutsu[this.get_core_for_forms(stack,"m")]);
				armorModel.belt4=new ItemStack(monogatari[this.get_core_for_forms(stack,"r")]);
			}
			armorModel.belt5=new ItemStack(others[this.get_core_for_forms(stack,"f")]);
			
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

	public static int  get_core_for_forms(ItemStack itemstack,String slot)
	{
		int form = 0;

		if (slot == "f"){

			if (itemstack.hasTagCompound()) {
				if (itemstack.getTagCompound().getInteger("core"+"f")!=0){
					form = itemstack.getTagCompound().getInteger("core"+"f");
				}else{
					form = 0;
				}
			}
		}else if (slot == "l") {

			if (itemstack.hasTagCompound()) {
				form=itemstack.getTagCompound().getInteger("core"+slot);
			}else {
				form=((item_saberdriver)itemstack.getItem()).BOOK_L;
			}
		}else if (slot == "r"){
			if (itemstack.hasTagCompound()) {
				form=itemstack.getTagCompound().getInteger("core"+slot);
			}else {
				form=((item_saberdriver)itemstack.getItem()).BOOK_R;
			}
		}else {
			if (itemstack.hasTagCompound()) {
				form=itemstack.getTagCompound().getInteger("core"+slot);
			}else {
				form=((item_saberdriver)itemstack.getItem()).BOOK_M;
			}
		}

		return form;
	}



	public static String get_core(ItemStack itemstack,String slot)
	{
		String form = "base";
		String rider;
		String riderName=((item_saberdriver)itemstack.getItem()).Rider;
		boolean is_form = false;

		if (itemstack.hasTagCompound()) {
			rider=((item_saberdriver)itemstack.getItem()).Rider+book_mode[itemstack.getTagCompound().getInteger("core"+"f")];
			if (itemstack.getTagCompound().getInteger("core"+"f")!=0){
				is_form = true;
			}
		}else {
			rider=((item_saberdriver)itemstack.getItem()).Rider;
		}

		if (slot == "f"){


			if (itemstack.hasTagCompound()) {
				if (itemstack.getTagCompound().getInteger("core"+"f")!=0){
					form = book_mode[itemstack.getTagCompound().getInteger("core"+"f")];
				}else{
					form = "base";
				}
			}else{
				form = "base";
			}
		}else if (slot == "l") {

			if (itemstack.hasTagCompound()) {
				if (is_form){
					form=rider+"_"+book_l[itemstack.getTagCompound().getInteger("core"+slot)];
				}else{
					form=book_l[itemstack.getTagCompound().getInteger("core"+slot)];
				}
			}else {
				form=book_l[((item_saberdriver)itemstack.getItem()).BOOK_L];
			}
			if (form == "base_l") {
				form = rider+"_base_l";
			}
		}else if (slot == "r"){
			if (itemstack.hasTagCompound()) {
				if (riderName == "buster"||riderName=="kenzan"||riderName=="slash"){
					form=rider+"_"+book_r[itemstack.getTagCompound().getInteger("core"+slot)];
				}else{
					if (is_form){
						form=rider+"_"+book_r[itemstack.getTagCompound().getInteger("core"+slot)];
					}else{
					form=book_r[itemstack.getTagCompound().getInteger("core"+slot)];
					}
				}
			}else {
				form=book_r[((item_saberdriver)itemstack.getItem()).BOOK_R];
			}
			if (form == "base_r") {
				form = rider+"_base_r";
			}

		}else {
			if (itemstack.hasTagCompound()) {
				form=rider+"_"+book_m[itemstack.getTagCompound().getInteger("core"+slot)];
			}else {
				form=rider+"_"+book_m[((item_saberdriver)itemstack.getItem()).BOOK_M];
			}
		}

		return form;
	}

	public static void set_core(ItemStack itemstack, int flag,String slot)
	{
		if (!itemstack.hasTagCompound())
		{
			itemstack.setTagCompound(new NBTTagCompound());
			itemstack.getTagCompound().setInteger("corel", ((item_saberdriver)itemstack.getItem()).BOOK_L);
			itemstack.getTagCompound().setInteger("corem", ((item_saberdriver)itemstack.getItem()).BOOK_M);
			itemstack.getTagCompound().setInteger("corer", ((item_saberdriver)itemstack.getItem()).BOOK_R);
			itemstack.getTagCompound().setInteger("coref",0);

		}
		itemstack.getTagCompound().setInteger("core"+slot, flag);
	}

	public  boolean rendModle(Entity entity, int num)
	{
		if (num==2||num==5||num==7||num==1||num==3||num==6||num==8){
			return true;
		}else if (entity instanceof EntityLivingBase){
			EntityLivingBase player = ((EntityLivingBase)entity);
			if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET)!= null){
				if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem()instanceof item_rider_driver){
					item_rider_driver belt =((item_rider_driver)player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem());
					String rider = ((item_rider_driver)player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem()).Rider;

					 if (num==4||num==9||num==10||num==11||num==12||num==13||num==14||num==15||num==16||num==17){

						return true;
					} else{
						return false;

					}
				
				}else{
					return false;
				}
			}else{
				return false;
			}

		}
		return false;

	} 
	public   String getTexture(Entity entity, int num,String ext)
	{
		if (entity instanceof EntityLivingBase){
			EntityLivingBase player = ((EntityLivingBase)entity);
			if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem()instanceof item_rider_driver){
				item_rider_driver belt =((item_rider_driver)player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem());

				if (num==11||num==12||num==5||num==14){
//num==9||num==13||
					return Refercence.MODID+":textures/armor/"+get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET),"l")+".png";

				}else if (num==1||num==10||num==2||num==8){
//num==4||num==7||
					return Refercence.MODID+":textures/armor/"+get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET),"r")+".png";

				}else if (num==15||num==16||num==3||num==6||num==17){
//
					return Refercence.MODID+":textures/armor/"+get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET),"m")+".png";

				} else{
					return Refercence.MODID+":textures/armor/blank"+ext;

				}
			}else{
				return Refercence.MODID+":textures/armor/blank"+ext;
			}
		}else{
			return Refercence.MODID+":textures/armor/blank"+ext;


		}


	}

	
	public boolean getIsRepairable(ItemStack toRepair, ItemStack repair) 
	{
		return ReiwaRiderItems.blank_wonder_ride_book == repair.getItem() ? true : super.getIsRepairable(toRepair, repair);
	}
}