package Kamen_Rider_Craft_4TH.item.W;


import Kamen_Rider_Craft_4TH.RiderItems;
import Kamen_Rider_Craft_4TH.TokuCraft_core;
import Kamen_Rider_Craft_4TH.util.IHasModel;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;


public class Item_memory extends Item  implements IHasModel
{

	public int num;
	public String num2;

	public Item_memory(int NUM ,String NUM2,String name,int gen1,int gen2)
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
	
	public Item_memory(int NUM ,String NUM2,String name)
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
	
	public Item_memory(String name)
	{
		super();
		this.setHasSubtypes(true);
		this.setMaxDamage(0);
		num=0;
		num2="0";
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
		if (num2 == "0"){
			
		}else{
		if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET)!= null){

			if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.Wdriver){

				if (num != 3){
					item_Wdriver.set_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), num, num2);

				}else if (player.inventory.hasItemStack(new ItemStack(RiderItems.joker_memory))){
					item_Wdriver.set_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), num, num2);

					item_Wdriver.set_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), 0, "1");


				}
				if (num2 == "2"){

					item_Wdriver.set_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), 0, "1");
					item_Wdriver.set_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), 0, "3");	
				}

				item_Wdriver.set_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), num, num2);

				if (num2 != "1"){
					item_Wdriver.set_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), item_Wdriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), "1"), "1");

				}

				if (num2 != "2"){
					item_Wdriver.set_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), item_Wdriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), "1"), "1");
					item_Wdriver.set_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), 0, "2");

				}

				if (num2 != "3"){

					item_Wdriver.set_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), item_Wdriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), "3"), "3");

				}
			}
			if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.lostdriver){
				if (num2 == "4"){

					item_Wdriver.set_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), num, "1");
					item_Wdriver.set_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), num, "2");
					item_Wdriver.set_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), num, "3");
				}
				if (num2 == "1" & num ==0){
					item_Wdriver.set_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), 0, "1");
					item_Wdriver.set_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), 0, "2");
					item_Wdriver.set_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), 0, "3");

				}
				if (num2 == "3" & num ==0){
					item_Wdriver.set_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), 4, "1");
					item_Wdriver.set_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), 4, "2");
					item_Wdriver.set_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), 4, "3");

				}

			}
			if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.accel_driver){
				if (num2 == "5"){

					item_Wdriver.set_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), num, "1");
					item_Wdriver.set_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), num, "2");
					item_Wdriver.set_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), num, "3");
				}
				

			}
		}
		}
		player.setActiveHand(handIn);
		return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, player.getHeldItem(handIn));
	}
}