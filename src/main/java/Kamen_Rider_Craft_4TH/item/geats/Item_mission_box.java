package Kamen_Rider_Craft_4TH.item.geats;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import Kamen_Rider_Craft_4TH.ReiwaRiderItems;
import Kamen_Rider_Craft_4TH.RiderItems;
import Kamen_Rider_Craft_4TH.TokuCraft_core;
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


public class Item_mission_box extends Item implements IHasModel
{


	public Item_mission_box(String name)
	{
		super();
		this.setMaxDamage(0);
		setTranslationKey(name);
		setRegistryName(name);
		TokuCraft_core.ITEMS.add(this);

	}

	public static final List<Item> core_id = new ArrayList<Item>();
	public static final List<Item> raise_buckle = new ArrayList<Item>();


	@Override
	public void registerModels() {
		TokuCraft_core.proxy.registerItemRender(this,0,"inventory");
	}
	
	public Item core_id(){
	
		List<Item> core_id2 = new ArrayList<Item>();
		core_id2.clear();
		 core_id2.addAll(core_id);
		
		Random generator = new Random();
			int rand = generator.nextInt(core_id2.size());
			return core_id2.get(rand);

	}

	public Item raise_buckle(){
		
		List<Item> raise_buckle2 = new ArrayList<Item>();
		raise_buckle2.clear();
		raise_buckle2.addAll(raise_buckle);
		
		Random generator = new Random();
			int rand = generator.nextInt(raise_buckle2.size());
			return raise_buckle2.get(rand);

	}

	/**
	 * Called when the equipped item is right clicked.
	 */
	public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer player, EnumHand handIn)
	{

		if (!worldIn.isRemote)
		{
			if(this==ReiwaRiderItems.bikkuri_mission_box){
				player.dropItem(core_id(), 1);
			}else{
				player.dropItem(raise_buckle(), 1);
			}
			

			if (!player.capabilities.isCreativeMode){

				if(handIn==EnumHand.MAIN_HAND){
					player.getHeldItemMainhand().shrink(1);			
				}else{
					player.getHeldItemOffhand().shrink(1);	
				}
			}
		}
		
		player.setActiveHand(handIn);
		return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, player.getHeldItem(handIn));
	}
}