package Kamen_Rider_Craft_4TH;

import Kamen_Rider_Craft_4TH.gui.GuiHandler;
import Kamen_Rider_Craft_4TH.util.Refercence;
import Kamen_Rider_Craft_4TH.util.handlers.giantHandler;

import java.util.Collection;
import java.util.Random;

import com.jcraft.jorbis.Block;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.storage.loot.LootContext;
import net.minecraft.world.storage.loot.LootEntry;
import net.minecraft.world.storage.loot.LootEntryTable;
import net.minecraft.world.storage.loot.LootPool;
import net.minecraft.world.storage.loot.LootTableList;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.network.NetworkRegistry;

public class CommonProxyRider
{
	
    public void registerRenderThings() { }

	public void registerItemRender(Item item, int i, String string) { }

	public void registerblockRender(Block ore_block, int i, String string) { }

	public void preInit() {
		MinecraftForge.EVENT_BUS.register(new giantHandler());
		NetworkRegistry.INSTANCE.registerGuiHandler(TokuCraft_core.instance, new GuiHandler());
	}

	
}