package KamenRiderCraftV3.item.decade;

import org.lwjgl.opengl.GL11;

import KamenRiderCraftV3.RiderItems;
import KamenRiderCraftV3.model.Biped;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class item_decadedriver extends ItemArmor
{

	private static final int[] maxDamageArray = new int[] {11, 16, 15, 13};
	public String armorNamePrefix;
	public ArmorMaterial material;


	public static final String[] den_oCoreName= new String[] {"deno_plat_form","deno_sword_form","deno_rod_form","deno_ax_form","deno_gun_form","deno_wing_form","deno_climax_form","deno_super_climax_form","deno_liner_form"};
	public static final String[] kivaCoreName= new String[] {"kiva","kiva_garulu","kiva_basshaa","kiva_dogga","kiva_dogabaki","kiva_emperor","kiva_dogabaki_emperor"};
	public static final String[] faizCoreName= new String[] {"faiz","faiz_accel","faiz_blaster"};
	public static final String[] kuugaCoreName= new String[] {"kuuga_growing","kuuga_mighty","kuuga_dragon","kuuga_pegasus","kuuga_titan","kuuga_rising_mighty","kuuga_rising_dragon","kuuga_rising_pegasus","kuuga_rising_titan","kuuga_amazing_mighty","kuuga_ultimate","kuuga_rising_ultimate"};
	public static final String[] agitoCoreName= new String[] {"agito","agito_storm","agito_flame","agito_trinity","agito_burning","agito_shining"};
	public static final String[] ryukiCoreName= new String[] {"ryuki","ryuki_survive","ryuki_blank"};
	public static final String[] kabutoCoreName= new String[] {"kabuto","kabuto_mask","kabuto_hyper"};
	public static final String[] hibikiCoreName= new String[] {"hibiki","hibiki_kurenai","hibiki_armed"};

	public static final String[] bladeCoreName= new String[] {"blade","blade_jack","blade_king"};

	public static final String[] decadeCoreName= new String[] {"decade","decade_complete","decade_violent_emotion","decade_cyan"};
	public static final String[] diendCoreName= new String[] {"diend","diend_complete"};
	public static final String[] dark_decadeCoreName= new String[] {"dark_decade","dark_decade_complete"};

	public item_decadedriver (ArmorMaterial par2EnumArmorMaterial, int par3, int par4)
	{
		super(par2EnumArmorMaterial, par3, par4);
		this.material = par2EnumArmorMaterial;
		par2EnumArmorMaterial.getDamageReductionAmount(par4);
		this.setMaxDamage(par2EnumArmorMaterial.getDurability(par4));
		this.maxStackSize = 1;
	}


	@Override
	@SideOnly(Side.CLIENT)
	public ModelBiped getArmorModel(EntityLivingBase entityLiving,ItemStack itemStack, int armorSlot) {
		Biped armorModel = new Biped();
		if(itemStack != null){
			if(armorModel != null){

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

				EntityItem entItem = new EntityItem(Minecraft.getMinecraft().thePlayer.getEntityWorld(), 0D, 0D, 0D,entityLiving.getEquipmentInSlot(1));
				//Without the below line, the item will spazz out
				entItem.hoverStart = 1.0F;
				double dri = 0; 
				GL11.glRotatef(180, 0, 1, 0);

				GL11.glRotatef(180, 0, 0, 1);
				GL11.glScaled(0.35, 0.35,0.35);

				if(entityLiving.isSneaking()){
					GL11.glRotatef(15, 1, 0, 0);	
					GL11.glTranslatef( (float) (0f+dri),-2.2f,0.6f);
				}else{

					GL11.glTranslatef((float) (0f+dri),-1.8f,0.6f);

				}

				Minecraft.getMinecraft().getItemRenderer().renderItem(entityLiving, itemStack,null);

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



	public static String  get_core(ItemStack itemstack)
	{
		if (itemstack.hasTagCompound()){
			if (itemstack.getItem() == RiderItems.dienddriver){
				return diendCoreName[itemstack.getTagCompound().getInteger("core2")];
			}else{
				if (itemstack.getTagCompound().getInteger("core")==2){
					return den_oCoreName[itemstack.getTagCompound().getInteger("core2")];
				}else if (itemstack.getTagCompound().getInteger("core")==1){
					return kivaCoreName[itemstack.getTagCompound().getInteger("core2")];
				}else if (itemstack.getTagCompound().getInteger("core")==8){
					return agitoCoreName[itemstack.getTagCompound().getInteger("core2")];
				}else if (itemstack.getTagCompound().getInteger("core")==7){
					return ryukiCoreName[itemstack.getTagCompound().getInteger("core2")];
				}else if (itemstack.getTagCompound().getInteger("core")==9){
					return kuugaCoreName[itemstack.getTagCompound().getInteger("core2")];
				}else if (itemstack.getTagCompound().getInteger("core")==3){
					return kabutoCoreName[itemstack.getTagCompound().getInteger("core2")];
				}else if (itemstack.getTagCompound().getInteger("core")==4){
					return hibikiCoreName[itemstack.getTagCompound().getInteger("core2")];
				}else if (itemstack.getTagCompound().getInteger("core")==5){
					return bladeCoreName[itemstack.getTagCompound().getInteger("core2")];
				}else if (itemstack.getTagCompound().getInteger("core")==6){
					return faizCoreName[itemstack.getTagCompound().getInteger("core2")];
				}else
				{if (itemstack.getItem() == RiderItems.dark_decadedriver){
					return dark_decadeCoreName[itemstack.getTagCompound().getInteger("core2")];
				}else{
					return decadeCoreName[itemstack.getTagCompound().getInteger("core2")];
				}}
			}
		}
		if (itemstack.getItem() == RiderItems.dienddriver){
			return  "diend";

		}else if (itemstack.getItem() == RiderItems.dark_decadedriver){
			return  "dark_decade";

		}else{
			return  "decade";
		}}
	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack armor) {

	if (player.getEquipmentInSlot(1)!= null){
		if (player.getEquipmentInSlot(2)!= null){
			if (player.getEquipmentInSlot(3)!= null){
				if (player.getEquipmentInSlot(4)!= null){
					if (player.getEquipmentInSlot(2).getItem() == RiderItems.decadelegs){
						if (player.getEquipmentInSlot(3).getItem() == RiderItems.decadetroso){
							if (player.getEquipmentInSlot(4).getItem() == RiderItems.decadehead){


								if (this.get_core(armor)=="decade"){
									player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 1));
									player.addPotionEffect(new PotionEffect(Potion.resistance.id, 5, 0));
									player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 5, 0));
								}else if (this.get_core(armor)=="decade_complete"){
									player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 4));
									player.addPotionEffect(new PotionEffect(Potion.resistance.id, 5, 2));
									player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 2));
									player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 5, 2));
									player.addPotionEffect(new PotionEffect(Potion.jump.id, 5, 2));
									player.addPotionEffect(new PotionEffect(Potion.nightVision.id, 5, 0));
									player.addPotionEffect(new PotionEffect(Potion.fireResistance.id, 5, 0));
								}else if (this.get_core(armor)=="decade_violent_emotion"){
									player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 3));
									player.addPotionEffect(new PotionEffect(Potion.resistance.id, 5, 2));
									player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 3));
									player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 5, 2));
									player.addPotionEffect(new PotionEffect(Potion.jump.id, 5, 3));
									player.addPotionEffect(new PotionEffect(Potion.hunger.id, 5, 0));
								}else if (this.get_core(armor)=="decade_cyan"){
									player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 1));
									player.addPotionEffect(new PotionEffect(Potion.resistance.id, 5, 0));
									player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 5, 0));
								}else if (this.get_core(armor)=="diend"){
									player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 0));
									player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 1));
									player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 5, 1));
									player.addPotionEffect(new PotionEffect(Potion.resistance.id, 5, 1));
								}else if (this.get_core(armor)=="diend_complete"){
									player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 3));
									player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 2));
									player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 5, 2));
									player.addPotionEffect(new PotionEffect(Potion.resistance.id, 5, 1));
									player.addPotionEffect(new PotionEffect(Potion.nightVision.id, 5, 0));
								}else if (this.get_core(armor)=="dark_decade"){
									player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 1));
									player.addPotionEffect(new PotionEffect(Potion.resistance.id, 5, 0));
									player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 5, 0));
								}else if (this.get_core(armor)=="deno_sword_form"){
									player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 2));
									player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 5, 0));
								}else if (this.get_core(armor)=="deno_rod_form"){
									player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 0));
									player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 5, 2));
								}else if (this.get_core(armor)=="deno_ax_form"){
									player.addPotionEffect(new PotionEffect(Potion.resistance.id, 5, 2));
									player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 1));
								}else if (this.get_core(armor)=="deno_gun_form"){
									player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 1));
									player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 5, 0));
									player.addPotionEffect(new PotionEffect(Potion.jump.id, 5, 1));
								}else if (this.get_core(armor)=="deno_wing_form"){
									player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 2));
									player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 5, 1));
									player.addPotionEffect(new PotionEffect(Potion.jump.id, 5, 2));
									player.addPotionEffect(new PotionEffect(Potion.weakness.id, 5, 0));
								}else if (this.get_core(armor)=="deno_climax_form"){
									player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 5, 2));
									player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 1));
									player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 3));
									player.addPotionEffect(new PotionEffect(Potion.jump.id, 5, 1));
									player.addPotionEffect(new PotionEffect(Potion.resistance.id, 5, 1));
								}else if (this.get_core(armor)=="deno_super_climax_form"){
									player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 5, 2));
									player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 2));
									player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 3));
									player.addPotionEffect(new PotionEffect(Potion.jump.id, 5, 2));
									player.addPotionEffect(new PotionEffect(Potion.resistance.id, 5, 1));
								}else if (this.get_core(armor)=="deno_liner_form"){
									player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 2));
									player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 5, 2));
									player.addPotionEffect(new PotionEffect(Potion.resistance.id, 5, 2));
									player.addPotionEffect(new PotionEffect(Potion.jump.id, 5, 2));
									player.addPotionEffect(new PotionEffect(Potion.fireResistance.id, 5, 0));
									player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 4));
								}else if (this.get_core(armor)=="kiva"){
									player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 0));
									player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 0));
									player.addPotionEffect(new PotionEffect(Potion.resistance.id, 5, 0));
								}else if (this.get_core(armor)=="kiva_garulu"){
									player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 1));
									player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 0));
									player.addPotionEffect(new PotionEffect(Potion.jump.id, 5, 1));
								}else if (this.get_core(armor)=="kiva_basshaa"){
									player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 0));
									player.addPotionEffect(new PotionEffect(Potion.resistance.id, 5, 0));
									player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 5, 2));
								}else if (this.get_core(armor)=="kiva_dogga"){
									player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 1));
									player.addPotionEffect(new PotionEffect(Potion.resistance.id, 5, 1));
									player.addPotionEffect(new PotionEffect(Potion.moveSlowdown.id, 5, 0));
								}else if (this.get_core(armor)=="kiva_dogabaki"){
									player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 1));
									player.addPotionEffect(new PotionEffect(Potion.resistance.id, 5, 1));
									player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 5, 0));
									player.addPotionEffect(new PotionEffect(Potion.jump.id, 5, 0));
									player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 1));
									player.addPotionEffect(new PotionEffect(Potion.wither.id, 5, 0));
								}else if (this.get_core(armor)=="kiva_emperor"){
									player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 2));
									player.addPotionEffect(new PotionEffect(Potion.resistance.id, 5, 2));
									player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 5, 1));
									player.addPotionEffect(new PotionEffect(Potion.jump.id, 5, 1));
									player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 2));
									player.addPotionEffect(new PotionEffect(Potion.regeneration.id, 5, 1));
								}else if (this.get_core(armor)=="kiva_dogabaki_emperor"){
									player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 4));
									player.addPotionEffect(new PotionEffect(Potion.resistance.id, 5, 3));
									player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 5, 2));
									player.addPotionEffect(new PotionEffect(Potion.jump.id, 5, 1));
									player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 4));
									player.addPotionEffect(new PotionEffect(Potion.regeneration.id, 5, 0));
									player.addPotionEffect(new PotionEffect(Potion.wither.id, 5, 1));
								}else if (this.get_core(armor)=="faiz"){
									player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 1));
									player.addPotionEffect(new PotionEffect(Potion.resistance.id, 5, 0));
								}else if (this.get_core(armor)=="faiz_accel"){
									player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 2));
									player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 0));
									player.addPotionEffect(new PotionEffect(Potion.resistance.id, 5, 1));
								}else if (this.get_core(armor)=="faiz_blaster"){
									player.fallDistance=0; 
									player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 2));
									player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 3));
									player.addPotionEffect(new PotionEffect(Potion.resistance.id, 5, 0));
									if (player.isSneaking()){
										Vec3 look = player.getLookVec();
										player.motionX=look.xCoord/2;
										player.motionY=look.yCoord/2;
										player.motionZ=look.zCoord/2;
									}
								}else if (this.get_core(armor)=="kuuga_mighty"){
									if (player.getCurrentEquippedItem()==null)
									{
										player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 4));
									}
								}else if (this.get_core(armor)=="kuuga_dragon"){
									player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 5, 0));
									player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 0));
								}else if (this.get_core(armor)=="kuuga_pegasus"){
									player.addPotionEffect(new PotionEffect(Potion.nightVision.id, 250, 0));
									player.addPotionEffect(new PotionEffect(Potion.jump.id, 5, 2));
								}else if (this.get_core(armor)=="kuuga_titan"){
									player.addPotionEffect(new PotionEffect(Potion.resistance.id, 5, 0));
									player.addPotionEffect(new PotionEffect(Potion.moveSlowdown.id, 5, 0));
									player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 0));
								}else if (this.get_core(armor)=="kuuga_rising_mighty"){
									if (player.getCurrentEquippedItem()==null)
									{
										player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 6));
									}
									player.addPotionEffect(new PotionEffect(Potion.resistance.id, 5, 0));
									player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 0));
								}else if (this.get_core(armor)=="kuuga_rising_pegasus"){
									player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 5, 2));
									player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 1));
									player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 0));
								}else if (this.get_core(armor)=="kuuga_rising_dragon"){
									player.addPotionEffect(new PotionEffect(Potion.nightVision.id, 250, 0));
									player.addPotionEffect(new PotionEffect(Potion.jump.id, 5, 4));
									player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 1));
									player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 0));
								}else if (this.get_core(armor)=="kuuga_rising_titan"){
									player.addPotionEffect(new PotionEffect(Potion.resistance.id, 5, 2));
									player.addPotionEffect(new PotionEffect(Potion.moveSlowdown.id, 5, 0));
									player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 2));
								}else if (this.get_core(armor)=="kuuga_amazing_mighty"){
									if (player.getCurrentEquippedItem()==null)
									{
										player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 8));
									}
									player.addPotionEffect(new PotionEffect(Potion.resistance.id, 5, 2));
									player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 2));
									player.addPotionEffect(new PotionEffect(Potion.jump.id, 5, 1));
									player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 2));
								}else if (this.get_core(armor)=="kuuga_ultimate"){
									if (player.getCurrentEquippedItem()==null)
									{
										player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 9));
									}
									player.addPotionEffect(new PotionEffect(Potion.resistance.id, 5, 4));
									player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 3));
									player.addPotionEffect(new PotionEffect(Potion.jump.id, 5, 3));
									player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 4));
								}else if (this.get_core(armor)=="kuuga_rising_ultimate"){
									if (player.getCurrentEquippedItem()==null)
									{
										player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 10));
									}
									player.addPotionEffect(new PotionEffect(Potion.resistance.id, 5, 6));
									player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 4));
									player.addPotionEffect(new PotionEffect(Potion.jump.id, 5, 4));
									player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 5));
									player.addPotionEffect(new PotionEffect(Potion.nightVision.id, 250, 0));
								}else if (this.get_core(armor)=="agito"){
									player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 0));
									player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 0));
								}else if (this.get_core(armor)=="agito_storm"){
									player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 1));
									player.addPotionEffect(new PotionEffect(Potion.jump.id, 5, 0));
								}else if (this.get_core(armor)=="agito_flame"){
									player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 0));
									player.addPotionEffect(new PotionEffect(Potion.fireResistance.id, 5, 0));
								}else if (this.get_core(armor)=="agito_trinity"){
									player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 1));
									player.addPotionEffect(new PotionEffect(Potion.fireResistance.id, 5, 0));
									player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 0));
									player.addPotionEffect(new PotionEffect(Potion.jump.id, 5, 0));
								}else if (this.get_core(armor)=="agito_burning"){
									player.addPotionEffect(new PotionEffect(Potion.moveSlowdown.id, 5, 1));
									player.addPotionEffect(new PotionEffect(Potion.fireResistance.id, 5, 0));
									player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 2));
									player.addPotionEffect(new PotionEffect(Potion.jump.id, 5, 2));
									player.addPotionEffect(new PotionEffect(Potion.resistance.id, 5, 2));
								}else if (this.get_core(armor)=="agito_shining"){
									player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 3));
									player.addPotionEffect(new PotionEffect(Potion.fireResistance.id, 5, 0));
									player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 4));
									player.addPotionEffect(new PotionEffect(Potion.jump.id, 5, 3));
									player.addPotionEffect(new PotionEffect(Potion.resistance.id, 5, 3));
								}else if (this.get_core(armor)=="ryuki"){
									player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 0));
									player.addPotionEffect(new PotionEffect(Potion.fireResistance.id, 5, 0));
									player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 5, 0));
								}else if (this.get_core(armor)=="ryuki_survive"){
									player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 4));
									player.addPotionEffect(new PotionEffect(Potion.fireResistance.id, 5, 0));
									player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 5, 1));
									player.addPotionEffect(new PotionEffect(Potion.resistance.id, 5, 2));
									player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 1));
								}else if (this.get_core(armor)=="kabuto"){
									player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 3));
									player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 5, 3));
								}else if (this.get_core(armor)=="kabuto_mask"){
									player.addPotionEffect(new PotionEffect(Potion.resistance.id, 5, 1));
									player.addPotionEffect(new PotionEffect(Potion.moveSlowdown.id, 5, 0));
								}else if (this.get_core(armor)=="kabuto_hyper"){
									player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 5, 3));
									player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 7));
									player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 4));
									player.addPotionEffect(new PotionEffect(Potion.resistance.id, 5, 4));
									player.addPotionEffect(new PotionEffect(Potion.jump.id, 5, 4));
									player.addPotionEffect(new PotionEffect(Potion.nightVision.id, 500, 0));
								}else if (this.get_core(armor)=="hibiki"){
									player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 0));	
									player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 5, 1));	
									player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 0));
								}else if (this.get_core(armor)=="hibiki_kurenai"){
									player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 1));
									player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 5, 3));	
									player.addPotionEffect(new PotionEffect(Potion.resistance.id, 5, 0));
									player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 1));
								}else if (this.get_core(armor)=="hibiki_armed"){
									player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 2));
									player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 5, 3));	
									player.addPotionEffect(new PotionEffect(Potion.resistance.id, 5, 2));
									player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 1));	
									player.addPotionEffect(new PotionEffect(Potion.regeneration.id, 5, 0));	
								}else if (this.get_core(armor)=="blade"){
									player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 1));	
									player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 5, 0));	
								}else if (this.get_core(armor)=="blade_jack"){
									player.fallDistance=0; 
									player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 2));
									player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 5, 0));	
									player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 1));	
									player.addPotionEffect(new PotionEffect(Potion.resistance.id, 5, 0));	
									if (player.isSneaking()){
										Vec3 look = player.getLookVec();
										player.motionX=look.xCoord;
										player.motionY=look.yCoord;
										player.motionZ=look.zCoord;
									}
								}else if (this.get_core(armor)=="blade_king"){
									player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 4));
									player.addPotionEffect(new PotionEffect(Potion.moveSlowdown.id, 5, 0));
									player.addPotionEffect(new PotionEffect(Potion.resistance.id, 5, 3));	
									player.addPotionEffect(new PotionEffect(Potion.jump.id, 5, 1));
								}
							}
						}
					}
				}
			}
		}
	}
	}
	public static void set_core(ItemStack itemstack, Integer flag, Integer flag2)
	{
		if (!itemstack.hasTagCompound())
		{
			itemstack.setTagCompound(new NBTTagCompound());
		}
		itemstack.getTagCompound().setInteger("core", flag);
		itemstack.getTagCompound().setInteger("core2", flag2);
	}


	@Override
	public ModelResourceLocation getModel(ItemStack stack, EntityPlayer playerIn, int useRemaining){

		ModelResourceLocation modelresourcelocation = new ModelResourceLocation("kamenridercraftv3"+":"+stack.getUnlocalizedName().substring(5),"inventory");
		ModelResourceLocation modelresourcelocation2 = new ModelResourceLocation("kamenridercraftv3"+":"+RiderItems.k_touch.getUnlocalizedName().substring(5),"inventory");
		ModelResourceLocation modelresourcelocation3 = new ModelResourceLocation("kamenridercraftv3"+":"+RiderItems.k_touch_diend.getUnlocalizedName().substring(5),"inventory");
		if (this.get_core(stack)=="decade_complete"){
			return modelresourcelocation2;
		}else if (this.get_core(stack)=="diend_complete"){
			return modelresourcelocation3;
		}else{
			return modelresourcelocation;
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




}