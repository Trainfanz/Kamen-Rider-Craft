package com.kelco.kamenridercraft.Items.ex_aid;

import java.util.List;

import com.google.common.collect.Lists;
import com.kelco.kamenridercraft.Items.rider_armor_base.BaseItem;


import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;


public class ExAidEnergyItem extends BaseItem{

	private List<MobEffectInstance> potionEffectList;

	public ExAidEnergyItem (Properties properties, MobEffectInstance... effects)
	{
		super(properties);
		potionEffectList = Lists.newArrayList(effects);
	}



	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int num, boolean flag) {
		if (entity instanceof Player ) {
			Player playerIn = ((Player)entity);
			for (int i = 0; i < potionEffectList.size(); i++)
			{
				//player.setInvisible(true);
				playerIn.addEffect(new MobEffectInstance(potionEffectList.get(i).getEffect(),potionEffectList.get(i).getDuration(),potionEffectList.get(i).getAmplifier(),true,false));
			}
			itemstack.shrink(1);	
		}
	}

}