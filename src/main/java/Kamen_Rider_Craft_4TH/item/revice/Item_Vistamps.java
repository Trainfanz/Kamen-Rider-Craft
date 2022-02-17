package Kamen_Rider_Craft_4TH.item.revice;


import javax.annotation.Nullable;

import Kamen_Rider_Craft_4TH.RiderItems;
import Kamen_Rider_Craft_4TH.TokuCraft_core;
import Kamen_Rider_Craft_4TH.blocks.hiden_3d_printing;
import Kamen_Rider_Craft_4TH.blocks.vistamp_bar;
import Kamen_Rider_Craft_4TH.blocks.zaia_3d_printing;
import Kamen_Rider_Craft_4TH.blocks.wood.BlockHelheimVine;
import Kamen_Rider_Craft_4TH.item.saber.Item_wonder_ride_book;
import Kamen_Rider_Craft_4TH.item.zero_one.Item_progrise_keys;
import Kamen_Rider_Craft_4TH.util.IHasModel;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.IItemPropertyGetter;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;


public class Item_Vistamps extends Item implements IHasModel
{


	public int num2;

	public int setBase = 0;

	public boolean CanReviUse = false;
	public boolean CanViceUse = false;
	public boolean CanLiveUse = false;
	public boolean CanEvilUse = false;	
	public boolean CanJeanneUse = false;
	public boolean CanDemonsUse = false;
	
	public static String[] ARMS= new String[] {"base","eagle","mammoth","megalodon","ptera","lion","jackal","kong","kamakiri","brachio","kajiki"
			,"bat","spider","batta","mogura","turtle","scorpion","condor","cobra","white_leo","quetzalcoatlus","neo_batta","kangaroo","","","","","","","",""
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

	
	public Item_Vistamps AddReviCanUse()
	{
		CanReviUse=true;
		return this;
	}
	
	public Item_Vistamps AddViceCanUse()
	{
		CanViceUse=true;
		return this;
	}
	
	public Item_Vistamps AddLiveCanUse()
	{
		CanLiveUse=true;
		return this;
	}
	
	public Item_Vistamps AddEvilCanUse()
	{
		CanEvilUse=true;
		return this;
	}
	
	public Item_Vistamps AddJeanneCanUse()
	{
		CanJeanneUse=true;
		return this;
	}
	
	public Item_Vistamps AddDemonsCanUse()
	{
		CanDemonsUse=true;
		return this;
	}
	public Item_Vistamps ChangeForm(int num)
	{
		setBase = num;
		return this;
	}

	public Item_Vistamps AddToVistampBar(int num)
	{
		for (int i1 = 0; i1 < num; ++i1)
		{
			vistamp_bar.vistamp.add(this);
		}
		return this;
	}
	
	/**
	 * Called when the equipped item is right clicked.
	 */
	public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn)
	{

		if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET)!= null){

			if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() instanceof item_revicedriver){
				item_revicedriver belt = (item_revicedriver) playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem();

			
					if (CanReviUse==true&belt.Rider=="revi"||CanViceUse==true&belt.Rider=="vice"
							||CanEvilUse==true&belt.Rider=="evil"||CanLiveUse==true&belt.Rider=="live"){

						item_revicedriver.set_lock(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num2);
						item_revicedriver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),setBase, "1");			
					}
			}
		}
		playerIn.setActiveHand(handIn);
		return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, playerIn.getHeldItem(handIn));
	}
}