package Kamen_Rider_Craft_4TH.item.kabuto;


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


public class Item_zecter extends Item implements IHasModel
{

	public String num;

	public Item_zecter(String name,String NUM)
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
    	
		if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET)!= null){

			if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() instanceof item_kabutodriver){

				if (num == ((item_kabutodriver)playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem()).Rider){
					if(item_kabutodriver.get_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET))==1){
						item_kabutodriver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),0);
					}else{
						item_kabutodriver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),1);
					}
				}else if(num =="hyper"&((item_kabutodriver)playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem()).Rider=="kabuto"||num =="hyper"&((item_kabutodriver)playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem()).Rider=="gatack"){
					if(item_kabutodriver.get_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET))==0){
						item_kabutodriver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),2);
					}else{
						item_kabutodriver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),0);
					}
				}
			}
		}
		  playerIn.setActiveHand(handIn);
	        return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, playerIn.getHeldItem(handIn));
	    }
}
