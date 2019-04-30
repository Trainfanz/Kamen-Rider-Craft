package Kamen_Rider_Craft_4TH.item.ryuki;

import Kamen_Rider_Craft_4TH.RiderItems;
import Kamen_Rider_Craft_4TH.TokuCraft_core;
import Kamen_Rider_Craft_4TH.item.Ichigo.item_Ichigodriver;
import Kamen_Rider_Craft_4TH.util.IHasModel;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;

public class Item_vent extends Item implements IHasModel
{

	public String RIDER;
	public Item WEP;
	public int FORM;
	public Item WEP2;

	public Item_vent(String name,String rider ,Item wepon, int num,Item visors)
	{
		super();
		this.setMaxDamage(0);

		RIDER=rider;
		WEP=wepon;
		FORM=num;
		WEP2=visors;
		setUnlocalizedName(name);
		setRegistryName(name);
		TokuCraft_core.ITEMS.add(this);
	}

	@Override
	public void registerModels() {
		TokuCraft_core.proxy.registerItemRender(this,0,"inventory");
	}



	/**
	 * Called when the equipped item is right clicked.
	 */
	public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer player, EnumHand handIn)
	{

		if (player.inventory.hasItemStack(new ItemStack (WEP2))){

			if (player.getItemStackFromSlot(EntityEquipmentSlot.HEAD)!= null){
				if (player.getItemStackFromSlot(EntityEquipmentSlot.CHEST)!= null){
					if (player.getItemStackFromSlot(EntityEquipmentSlot.LEGS)!= null){
						if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET)!= null){
							if (player.getItemStackFromSlot(EntityEquipmentSlot.LEGS).getItem() == RiderItems.ryukilegs){
								if (player.getItemStackFromSlot(EntityEquipmentSlot.CHEST).getItem() == RiderItems.ryukitroso){
									if (player.getItemStackFromSlot(EntityEquipmentSlot.HEAD).getItem() == RiderItems.ryukihead){
										if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() instanceof item_ryukidriver){
											if (RIDER == ((item_ryukidriver)player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem()).Rider){
												if (!worldIn.isRemote)
												{
													player.dropItem(WEP, 1);

													if (!player.capabilities.isCreativeMode){

														if(handIn==EnumHand.MAIN_HAND){
															player.getHeldItemMainhand().shrink(1);			
														}else{
															player.getHeldItemOffhand().shrink(1);	
														}
													}
												}

											}
										}
									}
								}
							}
						}
					}
				}
			}
		}

		player.setActiveHand(handIn);
		return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, player.getHeldItem(handIn));
	}

}

