package Kamen_Rider_Craft_4TH.item.kabuto;


import Kamen_Rider_Craft_4TH.RiderItems;
import Kamen_Rider_Craft_4TH.TokuCraft_core;
import Kamen_Rider_Craft_4TH.item.Ichigo.item_Ichigodriver;
import Kamen_Rider_Craft_4TH.util.IHasModel;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;


public class Item_clock_up_pad extends Item implements IHasModel
{


	public Item_clock_up_pad(String name)
	{
		super();
		this.setHasSubtypes(true);
		this.setMaxDamage(0);

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


			if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.HEAD)!= null){
				if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.CHEST)!= null){
					if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.LEGS)!= null){
						if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET)!= null){
							if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.LEGS).getItem() == RiderItems.kabutolegs){
								if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.CHEST).getItem() == RiderItems.kabutotroso){
									if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.HEAD).getItem() == RiderItems.kabutohead){
										playerIn.addPotionEffect(new PotionEffect(MobEffects.SPEED, 250, 20,true,false));		
									}
								}
							}
						}
					}
				}
			}
		}
		playerIn.setActiveHand(handIn);
		return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, playerIn.getHeldItem(handIn));
	}
}
