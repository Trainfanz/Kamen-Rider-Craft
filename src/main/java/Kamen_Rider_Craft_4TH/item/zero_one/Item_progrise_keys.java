package Kamen_Rider_Craft_4TH.item.zero_one;


import Kamen_Rider_Craft_4TH.RiderItems;
import Kamen_Rider_Craft_4TH.TokuCraft_core;
import Kamen_Rider_Craft_4TH.blocks.hiden_3d_printing;
import Kamen_Rider_Craft_4TH.blocks.zaia_3d_printing;
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
	public boolean CanVulcanUse = false;
	
	public int setBase = 0;
	
	public static String[] ARMS= new String[] {"base","falcon","shark","wolf","cheetah",
			"kong","tiger","cheetah","bear","hornet","scorpion","giraffe","hercules",
			"hedgehog","kangaroo","buffalo","stag","spider","penguin","hopper","dodo",
			"caucasus","whale","mammoth","lion","panda","burning_falcon"};



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
	 public Item_progrise_keys AddToHiden3DPrinter(int num)
	    {
	    	for (int i1 = 0; i1 < num; ++i1)
			{
	    		hiden_3d_printing.hiden_progrise_keys.add(this);
			}
	        return this;
	    }
	 public Item_progrise_keys AddToZaia3DPrinter(int num)
	    {
	    	for (int i1 = 0; i1 < num; ++i1)
			{
	    		zaia_3d_printing.zaia_progrise_keys.add(this);
			}
	        return this;
	    }
	 
	
	 public Item_progrise_keys AddZeroOneCanUse()
	    {
		 CanZeroOneUse=true;
		 return this;
	    }
	 
	 public Item_progrise_keys AddVulcanCanUse()
	    {
		 CanVulcanUse=true;
		 return this;
	    }
	 public Item_progrise_keys AddChangeBase(int num)
	    {
		 setBase=num;
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
								item_zero_onedriver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),setBase, "1");			
									
						}		
					}else if (belt.Rider=="vulcan"){
						if (num == 1||CanVulcanUse){
								item_zero_onedriver.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num2);
								item_zero_onedriver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),setBase, "1");			
						}	
								
					}else if (belt.Rider=="ark_zero"){
						if (num == 6){
							item_zero_onedriver.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num2);
							
							if (item_zero_onedriver.get_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET), "1")!=setBase) {
							item_zero_onedriver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),setBase, "1");			
							}else {
								item_zero_onedriver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),0, "1");	
							}
					}	
							
				}else if (belt.Rider=="valkyrie"){
						if (num == 2){
							item_zero_onedriver.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num2);
							item_zero_onedriver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),setBase, "1");			
								
							
				}
				
				}
			}
		}
		playerIn.setActiveHand(handIn);
		return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, playerIn.getHeldItem(handIn));
	}
}