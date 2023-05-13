package Kamen_Rider_Craft_4TH.item.kiva;


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

public class Itemfuestle extends Item implements IHasModel
{

	public int num;
	public int num2;


	public Itemfuestle(int NUM,int NUM2,String name)
	{
		super();
		
		this.setMaxDamage(0);
		num=NUM;
		num2=NUM2;
		setTranslationKey(name);
		setRegistryName(name);
		TokuCraft_core.ITEMS.add(this);

	}

	@Override
	public void registerModels() {
		TokuCraft_core.proxy.registerItemRender(this,0,"inventory");
	}


	/**
	   /**
     * Called when the equipped item is right clicked.
     */
    public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer player, EnumHand handIn)
    {
		if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET)!= null){
			if (num==0){
				if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.kivadriver){
					if (player.isSneaking()){
						if (num2 == 1||num2 == 2||num2 == 3 ){
							if (player.inventory.hasItemStack(new ItemStack(RiderItems.wakeupfuestle))&player.inventory.hasItemStack(new ItemStack(RiderItems.garulufuestle))&player.inventory.hasItemStack(new ItemStack(RiderItems.basshaafuestle))&player.inventory.hasItemStack(new ItemStack(RiderItems.doggafuestle))){

								if (item_kivadriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))==5){
									item_kivadriver.set_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), 6);	
								}else{

									item_kivadriver.set_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), 4);
								}

							}else{
								item_kivadriver.set_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), num2);
							}
						}else{
							item_kivadriver.set_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), num2);
						}

					}else{
						item_kivadriver.set_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), num2);
					}
				}
			}
		}if (num==1){
			if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.ixa_belt){
				if (num2==1){
					if (item_kivadriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))==1){
						item_kivadriver.set_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), 0);
					}else {
						item_kivadriver.set_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), 1);
					}
				}else{
					item_kivadriver.set_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), num2);
				}
			}
		}
		player.setActiveHand(handIn);
		return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, player.getHeldItem(handIn));
	}
}