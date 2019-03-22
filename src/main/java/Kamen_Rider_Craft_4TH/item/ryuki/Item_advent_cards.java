package Kamen_Rider_Craft_4TH.item.ryuki;


import Kamen_Rider_Craft_4TH.RiderItems;
import Kamen_Rider_Craft_4TH.TokuCraft_core;
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
	public String num2;


	public Item_advent_cards(String name,int NUM ,String NUM2)
	{
		super();
		this.setHasSubtypes(true);
		this.setMaxDamage(0);

		num=NUM;
		num2=NUM2;
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
	    public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn)
	    {



		if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET)!= null){

			if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.v_buckle_ryuki){

				if (num2 == "1"){
					item_ryukidriver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET), num);
				}
			}else if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.v_buckle_ryuga){
				if (this==RiderItems.survive_advent){
					item_ryukidriver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET), num);
				}else if (num2 == "3"){
					item_ryukidriver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET), num);
				}
			}else if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.v_buckle_raia){
				if (this==RiderItems.survive_shippu_advent){
					item_ryukidriver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET), num);
				}else if (num2 == "4"){
					item_ryukidriver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET), num);
				}
			}

			

			
			else if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.v_buckle_knight){

			if (num2 == "2")
				item_ryukidriver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET), num);
		}

		}


        playerIn.setActiveHand(handIn);
        return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, playerIn.getHeldItem(handIn));
    }

}

