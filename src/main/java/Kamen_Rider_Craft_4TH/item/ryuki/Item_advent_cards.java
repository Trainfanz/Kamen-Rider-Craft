package Kamen_Rider_Craft_4TH.item.ryuki;


import Kamen_Rider_Craft_4TH.RiderItems;
import Kamen_Rider_Craft_4TH.TokuCraft_core;
import Kamen_Rider_Craft_4TH.item.rider_armor_base.Item_form_change;
import Kamen_Rider_Craft_4TH.util.IHasModel;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;


public class Item_advent_cards extends Item implements IHasModel
{

	public int num;


	public Item_advent_cards(String name,int NUM)
	{
		super();
		this.setMaxDamage(0);

		num=NUM;
		setTranslationKey(name);
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
	public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn)
	{



		if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET)!= null){

			if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.v_buckle_ryuki){
				if (num == 1){
					((Item_form_change)RiderItems.survive_ryuki_advent).onItemRightClick(worldIn, playerIn, handIn);
				}else if(num == 3){
					((Item_form_change)RiderItems.blank_ryuki_advent).onItemRightClick(worldIn, playerIn, handIn);
				}

			}else if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.v_buckle_ryuga){
				if (num == 1){
					((Item_form_change)RiderItems.survive_ryuga_advent).onItemRightClick(worldIn, playerIn, handIn);
				}
			}else if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.v_buckle_raia){
				if (num == 2){
					((Item_form_change)RiderItems.survive_raia_advent).onItemRightClick(worldIn, playerIn, handIn);
				}
			}else if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.v_buckle_knight){
				if (num == 2){
					((Item_form_change)RiderItems.survive_knight_advent).onItemRightClick(worldIn, playerIn, handIn);
				}else if(num == 3){
					((Item_form_change)RiderItems.blank_knight_advent).onItemRightClick(worldIn, playerIn, handIn);
				}

			}else if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.v_buckle_ouja){
				if (num == 3){
					((Item_form_change)RiderItems.blank_ouja_advent).onItemRightClick(worldIn, playerIn, handIn);
				}
			}

		}


		playerIn.setActiveHand(handIn);
		return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, playerIn.getHeldItem(handIn));
	}

}

