package Kamen_Rider_Craft_4TH;

import Kamen_Rider_Craft_4TH.gui.GuiHandler;
import com.jcraft.jorbis.Block;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.network.NetworkRegistry;

public class CommonProxyRider
{
	
    public void registerRenderThings() { }

	public void registerItemRender(Item item, int i, String string) { }

	public void registerblockRender(Block ore_block, int i, String string) { }

	public void preInit() {
		NetworkRegistry.INSTANCE.registerGuiHandler(TokuCraft_core.instance, new GuiHandler());
	}

	
}