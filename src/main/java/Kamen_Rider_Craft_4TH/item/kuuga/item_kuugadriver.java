package Kamen_Rider_Craft_4TH.item.kuuga;

import javax.annotation.Nullable;

import org.lwjgl.opengl.GL11;

import Kamen_Rider_Craft_4TH.RiderItems;
import Kamen_Rider_Craft_4TH.TokuCraft_core;
import Kamen_Rider_Craft_4TH.item.rider_armor_base.Item_form_change;
import Kamen_Rider_Craft_4TH.item.rider_armor_base.item_rider_driver;
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

public class item_kuugadriver extends item_rider_driver implements IHasModel
{

	private static final int[] maxDamageArray = new int[] {11, 16, 15, 13};
	public String armorNamePrefix;
	public ArmorMaterial material;

	public String Rider;

	public item_kuugadriver (String name,ArmorMaterial par2EnumArmorMaterial, int par3, String rider,Item_form_change baseFormItem)
	{
		super(name,par2EnumArmorMaterial,par3,rider,baseFormItem,RiderItems.kuugahead,RiderItems.kuugatroso,RiderItems.kuugalegs);
	}

/**
	@Override
	public void extraPotionEffects(World world,EntityPlayer player,ItemStack armor,Item_form_change form) {

		if (form== RiderItems.kuuga_mighty){
			if (player.getHeldItemMainhand().isEmpty())
			{
				player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 4,true,false));
			}
		}else if (form== RiderItems.kuuga_rising_mighty){
			if (player.getHeldItemMainhand().isEmpty())
			{
				player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 6,true,false));
			}
		}else if (form== RiderItems.kuuga_amazing_mighty){
			if (player.getHeldItemMainhand().isEmpty())
			{
				player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 8,true,false));
			}
		}else if (form== RiderItems.kuuga_ultimate){
			if (player.getHeldItemMainhand().isEmpty())
			{
				player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 9,true,false));
			}
		}else if (form== RiderItems.kuuga_rising_ultimate){
			if (player.getHeldItemMainhand().isEmpty())
			{
				player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 10,true,false));
			}
		}else if (form== RiderItems.kuuga_super_rising_ultimate){
			if (player.getHeldItemMainhand().isEmpty())
			{
				player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 5, 12,true,false));
			}
		}
	}**/
}