package Kamen_Rider_Craft_4TH.item.zero_one;


import Kamen_Rider_Craft_4TH.RiderItems;
import Kamen_Rider_Craft_4TH.TokuCraft_core;
import Kamen_Rider_Craft_4TH.blocks.wood.BlockHelheimVine;
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


public class Item_progrise_keys extends Item implements IHasModel
{

	public int num;
	public int num2;
	public boolean CanZeroOneUse = false;
	
	public static String[] ARMS= new String[] {"hopper","falcon","shark","wolf","cheetah","kong","tiger","cheetah","bear","hornet","scorpion","giraffe","hercules","hedgehog"};



	public Item_progrise_keys(int NUM ,int arms,String name)
	{
		super();
		this.setMaxDamage(0);
		num=NUM;
		num2=arms;
		setTranslationKey(name);
		setRegistryName(name);
		TokuCraft_core.ITEMS.add(this);

	}

	

	@Override
	public void registerModels() {
		TokuCraft_core.proxy.registerItemRender(this,0,"inventory");
	}

	 public Item AddZeroOneCanUse()
	    {
		 CanZeroOneUse=true;
		 return this;
	    }
	 
	/**
	 * Called when the equipped item is right clicked.
	 */
	public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn)
	{

		if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET)!= null){

			if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() instanceof item_zero_onedriver){
				item_zero_onedriver belt = (item_zero_onedriver) playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem();

				
					
						if (belt.Rider=="zero_one"){
							if (num == 0||CanZeroOneUse==true){

								item_zero_onedriver.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num2);
								item_zero_onedriver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),0, "1");			
									
						}		
					}else if (belt.Rider=="vulcan"){
						if (num == 1){
								item_zero_onedriver.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num2);
								item_zero_onedriver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),0, "1");			
						}	
								
					}else if (belt.Rider=="valkyrie"){
						if (num == 2){
							item_zero_onedriver.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num2);
							item_zero_onedriver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),0, "1");			
								
							
				}
				
				}
			}
		}
		playerIn.setActiveHand(handIn);
		return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, playerIn.getHeldItem(handIn));
	}
}