package com.kelco.kamenridercraft.Items.ooo;

import java.util.Random;


import com.kelco.kamenridercraft.Items.OOO_Rider_Items;
import com.kelco.kamenridercraft.Items.rider_armor_base.BaseItem;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class Item_Purple_Medals extends BaseItem 
{



	public Item_Purple_Medals(Properties properties)
	{
		super(properties);

	}


	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int i, boolean flag) {
				Random generator = new Random();
				int rand1 = generator.nextInt(3);
				int rand = generator.nextInt(3);
				int rand2 = generator.nextInt(4);
				if (entity instanceof Player ) {
					Player playerIn = ((Player)entity);
					if(world.isClientSide) {
					playerIn.sendSystemMessage(Component.translatable("You released the purple medals!").withStyle(ChatFormatting.DARK_PURPLE));
					}
					playerIn.drop(new ItemStack(OOO_Rider_Items.PURPLE_MEDALS_EMPTY.get(), 1), true);
					playerIn.drop(new ItemStack(OOO_Rider_Items.PTERA_MEDAL.get(), rand2), true);
					playerIn.drop(new ItemStack(OOO_Rider_Items.TRICERA_MEDAL.get(), rand), true);
					playerIn.drop(new ItemStack(OOO_Rider_Items.TYRANNO_MEDAL.get(), rand1), true);
					itemstack.shrink(1);	
		}
	}
}
