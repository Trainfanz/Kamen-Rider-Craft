package Kamen_Rider_Craft_4TH.item.wizard;

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


public class Item_wizard_ring extends Item implements IHasModel
{

	public int num;
	public String num2;


	public Item_wizard_ring(int NUM ,String NUM2,String name)
	{
		super();
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
	@Override
	 public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer player, EnumHand handIn)
   {
		if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET)!= null){

			if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.wizardriver){


				if (num2=="3"){
					if (this == RiderItems.falco_ring&player.inventory.hasItemStack(new ItemStack(RiderItems.beastdriver))&player.inventory.hasItemStack(new ItemStack(RiderItems.buffa_ring))||this == RiderItems.buffa_ring&player.inventory.hasItemStack(new ItemStack(RiderItems.beastdriver))&player.inventory.hasItemStack(new ItemStack(RiderItems.falco_ring))){
						item_wizarddriver.set_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), 0, "2");
						item_wizarddriver.set_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), 10, "1");
					}
				}
			else if (num2=="1"){
					item_wizarddriver.set_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), item_wizarddriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), "1"), "1");
					item_wizarddriver.set_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), 0, "2");
					item_wizarddriver.set_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), num, num2);

				}else{
					if (num==2){
						item_wizarddriver.set_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), item_wizarddriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), "1"), num2);
					}else if (num==3){
						if (item_wizarddriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), "1")==8){
							if (player.inventory.hasItemStack(new ItemStack(RiderItems.hope_ring))){
								item_wizarddriver.set_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), 8, "2");
								item_wizarddriver.set_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), 9, "1");
							}else{
								item_wizarddriver.set_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), 3, "2");
							}
						}
					}else if (item_wizarddriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), "1")==4){
						item_wizarddriver.set_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), num, num2);
					}
				}
			}
			if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.beastdriver){
				
				if (this == RiderItems.land_ring_dragon&player.inventory.hasItemStack(new ItemStack(RiderItems.wizardriver))){
					item_wizarddriver.set_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), 6, "2");
					item_wizarddriver.set_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), 6, "1");
				}
				else if (num2=="3"){
					item_wizarddriver.set_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), item_wizarddriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), "1"), "1");
					item_wizarddriver.set_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), 0, "2");
					item_wizarddriver.set_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), num, "1");

				}
			}
		}
		player.setActiveHand(handIn);
		return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, player.getHeldItem(handIn));
	}
}
