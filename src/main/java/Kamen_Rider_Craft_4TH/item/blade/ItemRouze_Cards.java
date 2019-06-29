package Kamen_Rider_Craft_4TH.item.blade;

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

public class ItemRouze_Cards extends Item implements IHasModel
{
	public int num;
	public String RIDER;
	public ItemRouze_Cards(String name,int NUM,String rider)
	{
		super();
		this.setMaxDamage(0);
		num=NUM;
		RIDER=rider;
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

			if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.bladedriver & RIDER == "blade"){


				if (num==1||num==2){
					if (playerIn.inventory.hasItemStack(new ItemStack(RiderItems.rouze_absorber))){
						item_bladedriver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET), num);
					}
				}else{

					item_bladedriver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET), num);
				}		



			}	if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.garrendriver & RIDER == "garren"){


				if (num==1||num==2){
					if (playerIn.inventory.hasItemStack(new ItemStack(RiderItems.garren_absorber))){
						item_bladedriver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET), num);
					}
				}else{

					item_bladedriver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET), num);
				}
				
			}	if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.leangle_belt & RIDER == "leangle"){


				if (num==1){
						item_bladedriver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET), num);
					}
				else{

					item_bladedriver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET), num);
				}	
    	}	
				if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET)!= null){

					if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.chalicerouzer & RIDER == "chalice"){


						if (num==3){							
								item_bladedriver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET), num);
							
						}else{

							item_bladedriver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET), num);
						}		

					}

				}
		}
        playerIn.setActiveHand(handIn);
        return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, playerIn.getHeldItem(handIn));
    }

}
