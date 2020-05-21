package Kamen_Rider_Craft_4TH.item.zi_o;


import java.util.Random;

import Kamen_Rider_Craft_4TH.RiderItems;
import Kamen_Rider_Craft_4TH.TokuCraft_core;
import Kamen_Rider_Craft_4TH.util.IHasModel;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;


public class Item_blank_ridewatches2 extends Item implements IHasModel
{


	public Item_blank_ridewatches2(String name)
	{
		super();
		this.setMaxDamage(0);
		setTranslationKey(name);
		setRegistryName(name);
		TokuCraft_core.ITEMS.add(this);

	}



	@Override
	public void registerModels() {
		TokuCraft_core.proxy.registerItemRender(this,0,"inventory");
	}
	
	public Item ridewatch(){
		Random generator = new Random();
		
int rand = generator.nextInt(60);

		if (rand < 30) return RiderItems.zi_o_ridewatch;
		if (rand < 50) return RiderItems.geiz_ridewatch;
		if (rand < 52) return RiderItems.tsukuyomi_ridewatch;
		return RiderItems.zi_o_ridewatch;

	}

	/**
	 * Called when the equipped item is right clicked.
	 */
	public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer player, EnumHand handIn)
	{

		if (!worldIn.isRemote)
		{
			player.dropItem(ridewatch(), 1);

			if (!player.capabilities.isCreativeMode){

				if(handIn==EnumHand.MAIN_HAND){
					player.getHeldItemMainhand().shrink(1);			
				}else{
					player.getHeldItemOffhand().shrink(1);	
				}
			}
		}
		
		player.setActiveHand(handIn);
		return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, player.getHeldItem(handIn));
	}
}