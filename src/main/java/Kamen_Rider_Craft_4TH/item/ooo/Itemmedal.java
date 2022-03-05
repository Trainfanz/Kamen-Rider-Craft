package Kamen_Rider_Craft_4TH.item.ooo;


import Kamen_Rider_Craft_4TH.RiderItems;
import Kamen_Rider_Craft_4TH.TokuCraft_core;
import Kamen_Rider_Craft_4TH.item.saber.Item_wonder_ride_book;
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


public class Itemmedal extends Item  implements IHasModel
{
	public static final String[] CoreName1= new String[] {"taka","kuwagata","lion","sai","shachi","ptera","cobra","super_taka","love_1","same","shika","seiuchi","mukade","ebi","habataki","taka_ankh","shocker_head","taka_eternity"};
	public static final String[] CoreName2= new String[] {"tora","kamakiri","gorilla","kujaku","unagi","tricera","kame","imagin","panda","super_tora","kangaroo","love_2","kujira","gazelle","shirokuma","hachi","kani","yadokari","taiga","gel_shocker","kujaku_eternity"};
	public static final String[] CoreName3= new String[] {"batta","cheetah","zou","condor","tako","tyranno","wani","shocker","super_batta","kangaroo2","love_3","ookamiuo","ushi","penguin","ari","sasori","ichigo","destron","condor_eternity"};

	public int num;
	public String num2;

	public boolean shift = false;
	public int shift_num;
	public String shift_num2;

	public Itemmedal(int NUM ,String NUM2,String name)
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

	public Itemmedal  Shift_form(int NUM ,String NUM2)
	{
		shift = true;
		shift_num=NUM;
		shift_num2=NUM2;
		return this;
	}
	@Override
	public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer player, EnumHand handIn)
	{
		if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET)!= null){
			if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.OOOdriver&num2!="birth"){

				if (this==RiderItems.taka_ankh){
					item_OOOdriver.set_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), num, num2);
				}else{
					if (shift == true&player.isSneaking()) {
						item_OOOdriver.set_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), shift_num, shift_num2);
					}else {
						item_OOOdriver.set_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), num, num2);
					}
				}
			}if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.birth_driver){
				if (num2=="birth"){
					int mode = 0;
					if (item_OOOdriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET),"birth"+num)==0){
						mode=1;
					}
					item_OOOdriver.set_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), mode, "birth"+num);
				}
			}else if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.birth_driver_prototype){
				if (this==RiderItems.birth_core_crane_arm||this==RiderItems.birth_core_breast_cannon||this==RiderItems.birth_core_eyes){
					int mode = 0;
					if (item_OOOdriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET),"birth"+num)==0){
						mode=1;
					}
					item_OOOdriver.set_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), mode, "birth"+num);
				}
			}
		}
		player.setActiveHand(handIn);
		return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, player.getHeldItem(handIn));
	}
}
