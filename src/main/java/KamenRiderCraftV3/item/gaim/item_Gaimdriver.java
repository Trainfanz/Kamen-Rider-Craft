package KamenRiderCraftV3.item.gaim;

import org.lwjgl.opengl.GL11;

import net.minecraft.item.Item;
import KamenRiderCraftV3.RiderItems;
import KamenRiderCraftV3.model.Biped;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class item_Gaimdriver extends ItemArmor
{


	public static final int[] Corecol1= new int[] {0xff0000,0x7dff09,0xff9204,0xd2d2d2,0x1560c5,0xd919ea,0xe0ba5d,0xff0000};
	public static final int[] Corecol2= new int[] {0xfcff00,0x6cc43e,0x818181,0xff0000,0x2c41ff,0xd45ef3,0xd9bb64,0xff0000,0xffffff,0xfcff00,0xe8cc00};
	public static final int[] Corecol3= new int[] {0x0a6e03,0xfff725,0x2e2e2e,0xff0000,0x57b7ff,0x8819ea,0xe0ba5d,0xb79449,0x0a6e03,0xe8cc00};

	private static final int[] maxDamageArray = new int[] {11, 16, 15, 13};
	public String armorNamePrefix;
	public ArmorMaterial material;
	public String RIDER;
	public String LOCK;
	public int DRIVER;
	public Item DIFLOCK;




	public item_Gaimdriver (ArmorMaterial par2EnumArmorMaterial, int par3, int par4, String rider, String lock, int driver,Item difLock)
	{
		super(par2EnumArmorMaterial, par3, par4);
		this.material = par2EnumArmorMaterial;
		par2EnumArmorMaterial.getDamageReductionAmount(par4);
		this.setMaxDamage(par2EnumArmorMaterial.getDurability(par4));
		this.maxStackSize = 1;
		RIDER = rider; 
		LOCK = lock;
		DRIVER = driver;
		DIFLOCK=difLock;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public ModelBiped getArmorModel(EntityLivingBase entityLiving,ItemStack itemStack, int armorSlot) {
		Biped armorModel = new Biped();
		if(itemStack != null){
			if(armorModel != null){
				Item[] LOCK= new Item[] {RiderItems.himawari_lockseed,RiderItems.sengoku_driver_matsubokkuri,RiderItems.sengoku_driver_kurumi,RiderItems.sengoku_driver_donguri,RiderItems.sengoku_driver_melon,RiderItems.sengoku_driver_pine, RiderItems.sengoku_driver_ichigo, RiderItems.sengoku_driver_orange, RiderItems.sengoku_driver_banana, RiderItems.sengoku_driver_budou, RiderItems.sengoku_driver_mango, RiderItems.sengoku_driver_durian, RiderItems.sengoku_driver_kiwi, RiderItems.sengoku_driver_lemon_energy, RiderItems.sengoku_driver_cherry_energy, RiderItems.sengoku_driver_peach_energy, RiderItems.sengoku_driver_melon_energy,RiderItems.sengoku_driver_jinba_lemon,RiderItems.sengoku_driver_jinba_cherry,RiderItems.sengoku_driver_jinba_peach,RiderItems.sengoku_driver_jinba_melon,RiderItems.sengoku_driver_matsubokkuri_energy,RiderItems.sengoku_driver_kachidoki,RiderItems.sengoku_driver_kiwami,RiderItems.sengoku_driver_yomotsu_heguri,RiderItems.sengoku_driver_blood_orange,RiderItems.sengoku_driver_fifteen_lock,RiderItems.sengoku_driver_golden_ringo,RiderItems.sengoku_driver_silver_ringo,RiderItems.sengoku_driver_black_ringo,RiderItems.sengoku_driver_watermelon,RiderItems.sengoku_driver_forbidden_ringo,RiderItems.sengoku_driver_forbidden_ringo,RiderItems.sengoku_driver_jinba_black,RiderItems.sengoku_driver_wizard,RiderItems.sengoku_driver_fourze,RiderItems.sengoku_driver_ooo,RiderItems.sengoku_driver_w,RiderItems.sengoku_driver_decade,RiderItems.sengoku_driver_rider_ichigo,RiderItems.sengoku_driver_suika,RiderItems.sengoku_driver_lemon,RiderItems.sengoku_driver_dragon_fruits_energy,RiderItems.sengoku_driver_dragon_fruits_energy,RiderItems.sengoku_driver_orange_fr,RiderItems.sengoku_driver_drive,RiderItems.sengoku_driver_jinba_marron,RiderItems.sengoku_driver_blood_zakuro,RiderItems.sengoku_driver_kuuga,RiderItems.sengoku_driver_agito,RiderItems.sengoku_driver_ryuki,RiderItems.sengoku_driver_faiz,RiderItems.sengoku_driver_blade,RiderItems.sengoku_driver_hibiki,RiderItems.sengoku_driver_kaubuto,RiderItems.sengoku_driver_den_o,RiderItems.sengoku_driver_kiva,RiderItems.sengoku_driver_gaim_lock,RiderItems.sengoku_driver_kabi_orange,RiderItems.sengoku_driver_maja_lock,RiderItems.sengoku_driver_jinba_dragon,RiderItems.sengoku_driver_jinba_melon_melon,RiderItems.sengoku_driver_jinba_melon_durian,RiderItems.sengoku_driver_natsumikan,RiderItems.sengoku_driver_black_baron};


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
					
					Minecraft.getMinecraft().getItemRenderer().renderItem(entityLiving,itemStack.hasTagCompound() ? new ItemStack(LOCK[itemStack.getTagCompound().getInteger("seed")]) : new ItemStack(((item_Gaimdriver) itemStack.getItem()).DIFLOCK ),null);
					
					GL11.glPopMatrix();
			
				
				return armorModel;
			}
		}

		return null;
	}
	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
	{


		return "KamenRiderCraftV3:textures/armor/blank.png";

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


	public static String get_lock(ItemStack itemstack)
	{	
		item_Gaimdriver belt = (item_Gaimdriver) itemstack.getItem();


	return itemstack.hasTagCompound() ? Item_lockseed.ARMS[itemstack.getTagCompound().getInteger("seed")] : belt.LOCK;
	}
	
	


	public static void set_lock(ItemStack itemstack,int flag)
	{
		if (!itemstack.hasTagCompound())
		{
			itemstack.setTagCompound(new NBTTagCompound());
		}
		itemstack.getTagCompound().setInteger("seed", flag);
	}


	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack armor) {

		
		if (player.getEquipmentInSlot(1)!= null){
			if (player.getEquipmentInSlot(2)!= null){
				if (player.getEquipmentInSlot(3)!= null){
					if (player.getEquipmentInSlot(4)!= null){
							if (player.getEquipmentInSlot(2).getItem() == RiderItems.Gaimlegs){
								if (player.getEquipmentInSlot(3).getItem() == RiderItems.Gaimtroso){
									if (player.getEquipmentInSlot(4).getItem() == RiderItems.Gaimhead){


		if (this.get_lock(armor)=="matsubokkuri_arms"){
			player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 5, 0));

		}
		else if (this.get_lock(armor)=="kurumi_arms"){

			if (player.getCurrentEquippedItem()==null)
			{
				player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 4));

			}


	}else if (this.get_lock(armor)=="donguri_arms"){

		player.addPotionEffect(new PotionEffect(Potion.resistance.id, 5, 0));

	}


		else if (this.get_lock(armor)=="melon_arms"){


			player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 0));
			player.addPotionEffect(new PotionEffect(Potion.resistance.id, 5, 0));
			
		}else if (this.get_lock(armor)=="pine_arms"){


			player.addPotionEffect(new PotionEffect(Potion.resistance.id, 5, 0));
			player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 0));
		}
	else if (this.get_lock(armor)=="ichigo_arms"){


		player.addPotionEffect(new PotionEffect(Potion.jump.id, 5, 0));
		player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 0));
		
		}else if (this.get_lock(armor)=="banana_arms"){
			player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 5, 0));
			player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 0));
		}else if (this.get_lock(armor)=="budou_arms"){

			player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 0));
			player.addPotionEffect(new PotionEffect(Potion.nightVision.id, 5, 0));
		}else if (this.get_lock(armor)=="mango_arms"){


			player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 1));
			player.addPotionEffect(new PotionEffect(Potion.resistance.id, 5, 0));
		}
	else if (this.get_lock(armor)=="durian_arms"){

		player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 1));
		player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 5, 0));
		}else if (this.get_lock(armor)=="kiwi_arms"){

			player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 0));
			player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 5, 1));
			
		}else if (this.get_lock(armor)=="jimbar_lemon_arms"||this.get_lock(armor)=="jimbar_black_arms"){

			player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 1));
			player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 5, 1));
			player.addPotionEffect(new PotionEffect(Potion.invisibility.id, 5, 1));
			player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 0));
		}else if (this.get_lock(armor)=="jimbar_cherry_arms"){

			player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 1));
			player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 5, 1));
			player.addPotionEffect(new PotionEffect(Potion.fireResistance.id, 5, 0));
			player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 0));
		}else if (this.get_lock(armor)=="jimbar_peach_arms"){
			player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 1));
			player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 5, 1));
			player.addPotionEffect(new PotionEffect(Potion.nightVision.id, 5, 0));
			player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 0));
		}else if (this.get_lock(armor)=="jimbar_dragon_arms"){
			player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 0));
			player.addPotionEffect(new PotionEffect(Potion.nightVision.id, 5, 0));
			player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 3));
			player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 5, 1));
			player.addPotionEffect(new PotionEffect(Potion.resistance.id, 5, 2));
		}else if (this.get_lock(armor)=="jimbar_marron_arms"){
			if (player.getCurrentEquippedItem()==null)
			{player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 6));
			}player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 1));
			player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 5, 1));
	}else if (this.get_lock(armor)=="watermelon_arms"){
		player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 1));
		player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 5, 1));
		player.addPotionEffect(new PotionEffect(Potion.nightVision.id, 5, 0));
		player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 1));
		player.addPotionEffect(new PotionEffect(Potion.resistance.id, 5, 3));
		player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 1));
	}else if (this.get_lock(armor)=="jimbar_melon_arms"||this.get_lock(armor)=="jimbar_melon_arms_zangetsu"||this.get_lock(armor)=="jimbar_melon_arms_barvo"){
			player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 1));
			player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 5, 1));
			player.addPotionEffect(new PotionEffect(Potion.nightVision.id, 5, 0));
			player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 0));
			player.addPotionEffect(new PotionEffect(Potion.resistance.id, 5, 0));
			player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 0));
		}else if (this.get_lock(armor)=="kachidoki_arms"){
			player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 0));
			player.addPotionEffect(new PotionEffect(Potion.resistance.id, 5, 2));
			player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 2));

		}else if (this.get_lock(armor)=="energy_lemon_arms"){

			player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 1));
			player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 5, 1));
			player.addPotionEffect(new PotionEffect(Potion.invisibility.id, 5, 1));
		}else if (this.get_lock(armor)=="lemon_arms"){

			player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 0));
			player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 5, 0));
			player.addPotionEffect(new PotionEffect(Potion.invisibility.id, 5, 1));
		}else if (this.get_lock(armor)=="energy_dragon_fruits_arms"||this.get_lock(armor)=="energy_prototype_dragon_fruits_arms"){

			player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 3));
			player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 5, 1));
			player.addPotionEffect(new PotionEffect(Potion.resistance.id, 5, 2));
		}else if (this.get_lock(armor)=="energy_cherry_arms"){

			player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 1));
			player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 5, 1));
			player.addPotionEffect(new PotionEffect(Potion.fireResistance.id, 5, 0));
		}else if (this.get_lock(armor)=="energy_peach_arms"){
			player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 1));
			player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 5, 1));
			player.addPotionEffect(new PotionEffect(Potion.nightVision.id, 5, 0));
		}else if (this.get_lock(armor)=="energy_melon_arms"){
			player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 1));
			player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 5, 1));
			player.addPotionEffect(new PotionEffect(Potion.nightVision.id, 5, 0));
			player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 0));
			player.addPotionEffect(new PotionEffect(Potion.resistance.id, 5, 0));
		}else if (this.get_lock(armor)=="energy_matsubokkuri_arms"){
			player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 1));
			player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 5, 1));
			player.addPotionEffect(new PotionEffect(Potion.nightVision.id, 5, 0));
			
			
		}
		else if (this.get_lock(armor)=="orange_arms"||this.get_lock(armor)=="natsumikan_arms"){

			player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 5, 0));
			player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 0));
			
		}else if (this.get_lock(armor)=="kabi_orange_arms"){

			player.addPotionEffect(new PotionEffect(Potion.weakness.id, 5, 0));
			player.addPotionEffect(new PotionEffect(Potion.digSlowdown.id, 5, 0));
			
		}else if (this.get_lock(armor)=="fresh_orange_arms"){

			player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 5, 1));
			player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 1));
			
		}else if (this.get_lock(armor)=="kiwami_arms"){

			player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 5, 3));
			player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 3));
			player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 2));
			player.addPotionEffect(new PotionEffect(Potion.resistance.id, 5, 3));
			player.addPotionEffect(new PotionEffect(Potion.fireResistance.id, 5, 0));
			player.addPotionEffect(new PotionEffect(Potion.waterBreathing.id, 5, 0));
			player.addPotionEffect(new PotionEffect(Potion.nightVision.id, 5, 0));
			player.addPotionEffect(new PotionEffect(Potion.regeneration.id, 5, 2));
		}else if (this.get_lock(armor)=="blood_orange_arms"){

			player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 5, 0));
			player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 0));
		}else if (this.get_lock(armor)=="yomotsu_heguri_arms"){

			player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 5, 3));
			player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 3));
			player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 3));
			player.addPotionEffect(new PotionEffect(Potion.waterBreathing.id, 5, 0));
			player.addPotionEffect(new PotionEffect(Potion.nightVision.id, 5, 0));
			player.addPotionEffect(new PotionEffect(Potion.wither.id, 5, 5));
		}else if (this.get_lock(armor)=="fifteen_arms"||this.get_lock(armor)=="maja_arms"){

			player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 5, 1));
			player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 1));
			player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 2));
			player.addPotionEffect(new PotionEffect(Potion.resistance.id, 5, 1));
		}else if (this.get_lock(armor)=="golden_arms"){

			player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 5, 0));
			player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 0));
			player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 2));
			player.addPotionEffect(new PotionEffect(Potion.regeneration.id, 5, 1));
		}else if (this.get_lock(armor)=="darkness_arms"){

			player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 5, 1));
			player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 2));
			player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 3));
			player.addPotionEffect(new PotionEffect(Potion.regeneration.id, 5, 2));
		}else if (this.get_lock(armor)=="ringo_arms"||this.get_lock(armor)=="baron_ringo_arms"){

			player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 5, 1));
			player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 2));
			player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 3));
			player.addPotionEffect(new PotionEffect(Potion.regeneration.id, 5, 1));
		}else if (this.get_lock(armor)=="silver_arms"){
			player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 5, 0));
			player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 0));
			player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 2));
			player.addPotionEffect(new PotionEffect(Potion.resistance.id, 5, 1));
		}else if (this.get_lock(armor)=="blood_zakuro_arms"){
			player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 5, 0));
			player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 0));
			player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 2));
			player.addPotionEffect(new PotionEffect(Potion.blindness.id, 5, 0));
		}else if (this.get_lock(armor)=="suika_arms"){
			player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 1));
			player.addPotionEffect(new PotionEffect(Potion.resistance.id, 5, 4));
			player.addPotionEffect(new PotionEffect(Potion.moveSlowdown.id, 5, 1));
			player.addPotionEffect(new PotionEffect(Potion.jump.id, 5, 3));
			
		}else if (this.get_lock(armor)=="black_baron_arms"){
			player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 5, 0));
			player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 0));
			
		}
		}}}}}}}}
	/**else if (this.get_lock(armor)=="wizard_arms"){


			return itemIconwizard;
		}else if (this.get_lock(armor)=="fourze_arms"){


			return itemIconfourze;
		}else if (this.get_lock(armor)=="ooo_arms"){


			return itemIconooo;
		}else if (this.get_lock(armor)=="w_arms"){


			return itemIcon_w;
		}else if (this.get_lock(armor)=="decade_arms"){


			return itemIcondecade;
		}else if (this.get_lock(armor)=="rider_ichigo_arms"){


			return itemIconrider_ichigo;
		}



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
public ModelResourceLocation getModel(ItemStack stack, EntityPlayer playerIn, int useRemaining){

	if (this.RIDER=="ryugen"&this.get_lock(stack)=="yomotsu_heguri_arms"){
		return new ModelResourceLocation("kamenridercraftv3"+":"+RiderItems.sengoku_driver_ryugen_yomi.getUnlocalizedName().substring(5),"inventory");
		
	}else if (this.RIDER=="zangetsu"&this.get_lock(stack)=="watermelon_arms"){
		return new ModelResourceLocation("kamenridercraftv3"+":"+RiderItems.sengoku_driver_zangetsu_watermelon.getUnlocalizedName().substring(5),"inventory");
		
	}else{
		return new ModelResourceLocation("kamenridercraftv3"+":"+stack.getUnlocalizedName().substring(5),"inventory");
	}
}
/**
@Override
public IIcon getIcon(ItemStack stack, int renderPass){



	if (renderPass==0){
		if ( DRIVER==0){

			if (this.RIDER=="ryugen"&this.get_lock(stack)=="yomotsu_heguri_arms"){
				return itemIconsengoku_driver_ryugen_yomi;
			}else if (this.RIDER=="zangetsu"&this.get_lock(stack)=="watermelon_arms"){
				return itemIconsengoku_driver_zangetsu_watermelon;
			}else{
				return itemIcon;
			}
		}else{
			return itemIcongenesis;
		}
	}else{
		if (this.get_lock(stack)=="matsubokkuri_arms"){


			return itemIconmatsubokkuri;
		}else if (this.get_lock(stack)=="watermelon_arms"){


			return itemIconwatermelon;
		}else if (this.get_lock(stack)=="kurumi_arms"){


			return itemIconkurumi;
		}else if (this.get_lock(stack)=="donguri_arms"){


			return itemIcondonguri;
		}else if (this.get_lock(stack)=="melon_arms"){


			return itemIconmelon;
		}else if (this.get_lock(stack)=="pine_arms"){


			return itemIconpine;
		}else if (this.get_lock(stack)=="ichigo_arms"){


			return itemIconichigo;
		}else if (this.get_lock(stack)=="banana_arms"){


			return itemIconbanana;
		}else if (this.get_lock(stack)=="budou_arms"){


			return itemIconbudou;
		}else if (this.get_lock(stack)=="mango_arms"){


			return itemIconmango;
		}else if (this.get_lock(stack)=="durian_arms"){


			return itemIcondurian;
		}else if (this.get_lock(stack)=="kiwi_arms"){


			return itemIconkiwi;
		}else if (this.get_lock(stack)=="jimbar_lemon_arms"){


			return itemIconjinba_lemon;
		}else if (this.get_lock(stack)=="jimbar_cherry_arms"){


			return itemIconjinba_cherry;
		}else if (this.get_lock(stack)=="jimbar_peach_arms"){


			return itemIconjinba_peach;
		}else if (this.get_lock(stack)=="jimbar_melon_arms"){
			return itemIconjinba_melon;
		}else if (this.get_lock(stack)=="jimbar_marron_arms"){
			return itemIconjinba_marron;
		}else if (this.get_lock(stack)=="jimbar_black_arms"){
			return itemIconjinba_dark;
		}else if (this.get_lock(stack)=="blood_zakuro_arms"){
			return itemIconblood_zakuro;
		}else if (this.get_lock(stack)=="kachidoki_arms"){
			return itemIconkachidoki;

		}else if (this.get_lock(stack)=="energy_lemon_arms"){


			return itemIcongenesis_lemon;
		}else if (this.get_lock(stack)=="energy_dragon_fruits_arms"||this.get_lock(stack)=="energy_prototype_dragon_fruits_arms"){

			
			return itemIcongenesis_dragon;
		}else if (this.get_lock(stack)=="energy_cherry_arms"){


			return itemIcongenesis_cherry;
		}else if (this.get_lock(stack)=="energy_peach_arms"){


			return itemIcongenesis_peach;
		}else if (this.get_lock(stack)=="energy_melon_arms"){
			return itemIcongenesis_melon;
		}else if (this.get_lock(stack)=="energy_matsubokkuri_arms"){
			return itemIcongenesis_matsubokkuri;
		}
		else if (this.get_lock(stack)=="orange_arms"){


			return itemIconorange;
		}else if (this.get_lock(stack)=="fresh_orange_arms"){


			return itemIconorangefr;
		}else if (this.get_lock(stack)=="kiwami_arms"){


			return itemIconKiwami;
		}else if (this.get_lock(stack)=="blood_orange_arms"){


			return itemIconblood_orange;
		}else if (this.get_lock(stack)=="yomotsu_heguri_arms"){


			return itemIconyomotsu_heguri;
		}else if (this.get_lock(stack)=="fifteen_arms"){


			return itemIconfifteen;
		}else if (this.get_lock(stack)=="golden_arms"){


			return itemIcongolden;
		}else if (this.get_lock(stack)=="silver_arms"){


			return itemIconsilver;
		}else if (this.get_lock(stack)=="darkness_arms"){


			return itemIcondarkness;
		}else if (this.get_lock(stack)=="baron_ringo_arms"||this.get_lock(stack)=="ringo_arms"){


			return itemIconringo;
		}else if (this.get_lock(stack)=="wizard_arms"){


			return itemIconwizard;
		}else if (this.get_lock(stack)=="fourze_arms"){


			return itemIconfourze;
		}else if (this.get_lock(stack)=="ooo_arms"){


			return itemIconooo;
		}else if (this.get_lock(stack)=="w_arms"){


			return itemIcon_w;
		}else if (this.get_lock(stack)=="decade_arms"){


			return itemIcondecade;
		}else if (this.get_lock(stack)=="drive_arms"){


			return itemIcondrive;
		}else if (this.get_lock(stack)=="rider_ichigo_arms"){


			return itemIconrider_ichigo;
		}else if (this.get_lock(stack)=="lemon_arms"){


			return itemIconlemon;
		}else if (this.get_lock(stack)=="suika_arms"){
		
			return itemIconsuika;
		}else if (this.get_lock(stack)=="black_baron_arms"){
		
			return itemIconblack_baron;

		

		else {
			if ( DRIVER==0){


				return itemIcon;
			}else{

				return itemIcongenesis;
			}


		}

	}

}
**/

}