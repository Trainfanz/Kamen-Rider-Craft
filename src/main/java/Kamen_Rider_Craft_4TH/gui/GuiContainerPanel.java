package Kamen_Rider_Craft_4TH.gui;

import Kamen_Rider_Craft_4TH.TokuCraft_core;
import Kamen_Rider_Craft_4TH.item.item_panel;
import Kamen_Rider_Craft_4TH.util.Refercence;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.items.IItemHandler;
import org.lwjgl.opengl.GL11;

public class GuiContainerPanel extends GuiContainer {
    private item_panel.PanelColor color;
    public GuiContainerPanel(InventoryPlayer inventory, IItemHandler handler, item_panel.PanelColor color) {
        super(new ContainerPanel(inventory, handler));
        this.color = color;
    }

    @Override
    protected void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY) {
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        this.mc.getTextureManager().bindTexture(color.getResourceLocation());
        final int k = (this.width - this.xSize) / 2;
        final int l = (this.height - this.ySize) / 2;
        this.drawTexturedModalRect(k, l, 0, 0, this.xSize, this.ySize);
    }
}
