package Kamen_Rider_Craft_4TH.item;



import java.util.ArrayList;
import java.util.List;

import com.google.common.collect.Lists;

import Kamen_Rider_Craft_4TH.TokuCraft_core;
import Kamen_Rider_Craft_4TH.item.rider_armor_base.Item_form_change;
import Kamen_Rider_Craft_4TH.util.IHasModel;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class riderfoodWithEft extends ItemFood implements IHasModel
{
	private List<PotionEffect> potionEffectList;


	public riderfoodWithEft(int par2, boolean par3,String name,PotionEffect... effects) {
		super(par2, par3);
		setTranslationKey(name);
		setRegistryName(name);
		TokuCraft_core.ITEMS.add(this);
		potionEffectList = Lists.newArrayList(effects);
	}
	
	 protected void onFoodEaten(ItemStack stack, World worldIn, EntityPlayer player)
	    {
			for (int i = 0; i < potionEffectList.size(); i++)
			{
				player.addPotionEffect(new PotionEffect(potionEffectList.get(i).getPotion(),potionEffectList.get(i).getDuration(),potionEffectList.get(i).getAmplifier(),true,false));
			}
	    }

	@Override
	public void registerModels() {
		TokuCraft_core.proxy.registerItemRender(this,0,"inventory");
	}

}
