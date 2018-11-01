package Kamen_Rider_Craft_4TH.item.agito;

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

public class Item_agito_power extends Item implements IHasModel
{
	public int num;

	public Item_agito_power(String name,int NUM)
	{
		super();
		this.setHasSubtypes(true);
		this.setMaxDamage(0);
		num=NUM;
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
    	if (playerIn.inventory.armorInventory.get(1)!= null){

			if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem()== RiderItems.alter_ring & num != -1){
		
		
				item_agitodriver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET), num);

			} else if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.meta_factor){

				if (this == RiderItems.exceed_gills){
					item_agitodriver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET), 1);
				}else if (this == RiderItems.gills){
					item_agitodriver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET), 0);
				}
			}

		}
        playerIn.setActiveHand(handIn);
        return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, playerIn.getHeldItem(handIn));
    }

}
