package Kamen_Rider_Craft_4TH.item.revice;


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


public class Item_Vistamps extends Item implements IHasModel
{


	public int num2;

	public int setBase = 0;

	public static String[] ARMS= new String[] {"base","eagle","mammoth","megalodon","ptera","lion","jackal","kong","kamakiri","brachio","kajiki"
			,"bat","spider","batta","mogura","turtle","scorpion","condor","cobra","white_leo","quetzalcoatlus","neo_batta","","","","","","","","","",""
			,"","","","","","","","","","","","","","","","","","","","","","","","","",""};



	public Item_Vistamps(int arms,String name)
	{
		super();
		this.setMaxDamage(0);
		num2=arms;
		setTranslationKey(name);
		setRegistryName(name);
		TokuCraft_core.ITEMS.add(this);

	}

	public Item_Vistamps(String name)
	{
		super();
		this.setMaxDamage(0);
		setTranslationKey(name);
		setRegistryName(name);
		TokuCraft_core.ITEMS.add(this);
		num2=10;

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

			if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() instanceof item_revicedriver){
				item_revicedriver belt = (item_revicedriver) playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem();

						item_revicedriver.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num2);
						item_revicedriver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),setBase, "1");			

			}
		}
		playerIn.setActiveHand(handIn);
		return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, playerIn.getHeldItem(handIn));
	}
}