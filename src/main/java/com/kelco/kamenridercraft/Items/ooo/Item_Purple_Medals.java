package com.kelco.kamenridercraft.Items.ooo;

import com.kelco.kamenridercraft.KamenRiderCraftCore;
import com.kelco.kamenridercraft.Items.OOO_Rider_Items;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;

public class Item_Purple_Medals extends Item  implements IHasModel
{



	public Item_Purple_Medals(String name)
	{
		super();
		
		setMaxDamage(0);
		maxStackSize = 1;
	       setTranslationKey(name);
	        setRegistryName(name);
	        KamenRiderCraftCore.ITEMS.add(this);
		}
		@Override
		public void registerModels() {
			KamenRiderCraftCore.proxy.registerItemRender(this,0,"inventory");
		}

	public void onUpdate(ItemStack par1ItemStack, World par2World, Entity par3Entity, int par4, boolean par5) {



		if (par3Entity instanceof EntityPlayer){
			EntityPlayer player = (EntityPlayer) par3Entity;
	
			if (! par2World.isRemote)
			{
				Random generator = new Random();
				
				int rand1 = generator.nextInt(3);
				int rand = generator.nextInt(3);
				int rand2 = generator.nextInt(4);
				
				Player playerIn = (Player)
				playerIn.sendSystemMessage(Component.translatable("<You released the purple medals!").withStyle(ChatFormatting.DARK_PURPLE));
				
				player.dropItem(OOO_Rider_Items.PURPLE_MEDALS_EMPTY, 1);
				player.dropItem(OOO_Rider_Items.PTERA_MEDAL, rand2);
				player.dropItem(OOO_Rider_Items.TRICERA_MEDAL, rand);
				player.dropItem(OOO_Rider_Items.TYRANNO_MEDAL, rand1);


				par1ItemStack.shrink(1);	
					
				}
			}
		}
	

}
