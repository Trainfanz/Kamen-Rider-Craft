package com.kelco.kamenridercraft.Items.ooo;

import com.kelco.kamenridercraft.KamenRiderCraftCore;
import com.kelco.kamenridercraft.Items.Faiz_Rider_Items;
import com.kelco.kamenridercraft.Items.OOO_Rider_Items;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

public class Item_Purple_Medals extends Item  implements IHasModel
{



	public Item_Purple_Medals(String name)
	{
		super(null);
		
		}
		public void registerModels() {
			KamenRiderCraftCore.registerItemRender(this,0,"inventory");
		}

		@Override
	    public void onUpdate(ItemStack itemstack, World world, Entity entity, int i, boolean flag)
	    if (this.asItem()!=OOO_Rider_Items.PURPLE_MEDALS_OPENED.get()) {

    	
					
			{
				Random generator = new Random();
				
				int rand1 = generator.nextInt(3);
				int rand = generator.nextInt(3);
				int rand2 = generator.nextInt(4);
				
				Player playerIn = (Player);
				playerIn.sendSystemMessage(Component.translatable("<You released the purple medals!").withStyle(ChatFormatting.DARK_PURPLE));
				
				player.dropItem(OOO_Rider_Items.PURPLE_MEDALS_EMPTY, 1);
				player.dropItem(OOO_Rider_Items.PTERA_MEDAL, rand2);
				player.dropItem(OOO_Rider_Items.TRICERA_MEDAL, rand);
				player.dropItem(OOO_Rider_Items.TYRANNO_MEDAL, rand1);


				itemstack.shrink(1);	
					
				}
			}
		}
	

}
