package Kamen_Rider_Craft_4TH.item;



import Kamen_Rider_Craft_4TH.TokuCraft_core;
import Kamen_Rider_Craft_4TH.util.IHasModel;
import net.minecraft.item.ItemFood;



public class riderfood extends ItemFood implements IHasModel
{

	public riderfood(int par2, boolean par3,String name) {
		super(par2, par3);
		setUnlocalizedName(name);
		setRegistryName(name);
		TokuCraft_core.ITEMS.add(this);
	}
	

	@Override
	public void registerModels() {
		TokuCraft_core.proxy.registerItemRender(this,0,"inventory");
	}

}
