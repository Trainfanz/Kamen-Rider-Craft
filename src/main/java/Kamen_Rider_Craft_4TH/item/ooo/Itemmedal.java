package Kamen_Rider_Craft_4TH.item.ooo;


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


public class Itemmedal extends Item  implements IHasModel
{
	public static final String[] CoreName1= new String[] {"taka","kuwagata","lion","sai","shachi","ptera","cobra","super_taka","love_1","same","shika","seiuchi","mukade","ebi","habataki","taka_ankh"};
	public static final String[] CoreName2= new String[] {"tora","kamakiri","gorilla","kujaku","unagi","tricera","kame","imagin","panda","super_tora","kangaroo","love_2","kujira","gazelle","shirokuma","hachi","kani","yadokari","taiga"};
	public static final String[] CoreName3= new String[] {"batta","cheetah","zou","condor","tako","tyranno","wani","shocker","super_batta","kangaroo2","love_3","ookamiuo","ushi","penguin","ari","sasori","ichigo"};

	public int num;
	public String num2;


	public Itemmedal(int NUM ,String NUM2,String name)
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
	@Override
	public void registerModels() {
		TokuCraft_core.proxy.registerItemRender(this,0,"inventory");
	}

	@Override
	public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer player, EnumHand handIn)
	{
		if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET)!= null){
			if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.OOOdriver){

				if (this==RiderItems.taka_ankh){
					item_OOOdriver.set_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), num, num2);
				}else{
				item_OOOdriver.set_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), num, num2);
				}
			}
		}
		player.setActiveHand(handIn);
		return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, player.getHeldItem(handIn));
	}
}
