package Kamen_Rider_Craft_4TH.item.decade;


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

public class Itemrider_cards extends Item implements IHasModel
{

	public int num;
	public int num2;

	public Itemrider_cards(int NUM,int NUM2,String name)
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

		if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.decadedriver&this==RiderItems.diendcard){
			item_decadedriver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET), 0,3);
			
		}else if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.decadedriver&this!=RiderItems.k_touch_diend&num<11||
				playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.dark_decadedriver&this!=RiderItems.k_touch_diend&this!=RiderItems.k_touch& this!=RiderItems.decadecard_violent_emotion &this!=RiderItems.diendcard||
				playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.new_decadriver&this!=RiderItems.k_touch_diend){
			
				item_decadedriver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET), num,num2);
									
			}else if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.dienddriver){
				if (this==RiderItems.k_touch_diend){
					item_decadedriver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET), 0,1);
				}else if (this==RiderItems.diendcard){
					item_decadedriver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET), 0,0);
				}

			}

		}
		  playerIn.setActiveHand(handIn);
	        return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, playerIn.getHeldItem(handIn));
	    }
}

