package Kamen_Rider_Craft_4TH.gui;

import Kamen_Rider_Craft_4TH.RiderItems;
import Kamen_Rider_Craft_4TH.item.build.Item_full_bottle;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.SlotItemHandler;

import javax.annotation.Nonnull;

public class ContainerPanel extends Container {
    public ContainerPanel(InventoryPlayer inventory, IItemHandler handler) {
        addPanelSlot(handler, 0, 28,19);
        addPanelSlot(handler, 1, 54,19);
        addPanelSlot(handler, 2, 80,19);
        addPanelSlot(handler, 3, 106,19);
        addPanelSlot(handler, 4, 132,19);
        addPanelSlot(handler, 5, 28,45);
        addPanelSlot(handler, 6, 54,45);
        addPanelSlot(handler, 7, 80,45);
        addPanelSlot(handler, 8, 106,45);
        addPanelSlot(handler, 9, 132,45);

        bindPlayerInventory(inventory);
    }

    private void addPanelSlot(IItemHandler handler, int index, int x, int y) {
        addSlotToContainer(new SlotItemHandler(handler, index, x, y) {
            @Override
            public boolean isItemValid(@Nonnull ItemStack stack) {
                return (stack.getItem() instanceof Item_full_bottle&stack.getItem()!=RiderItems.evol_trigger&stack.getItem()!=RiderItems.hazard_trigger);
            }
        });
    }

    private void bindPlayerInventory(InventoryPlayer playerInventory) {
        for (int i = 0; i < 3; ++i) {
            for (int j = 0; j < 9; ++j) {
                this.addSlotToContainer(new Slot(playerInventory, j + i * 9 + 9, 8 + j * 18, 84 + i * 18));
            }
        }

        for (int k = 0; k < 9; ++k) {
            if(k == playerInventory.currentItem) {
                this.addSlotToContainer(new Slot(playerInventory, k, 8 + k * 18, 142) {
                    @Override
                    public boolean canTakeStack(EntityPlayer playerIn) {
                        return false;
                    }

                    @Override
                    public boolean isItemValid(ItemStack stack) {
                        return false;
                    }
                });
            } else {
                this.addSlotToContainer(new Slot(playerInventory, k, 8 + k * 18, 142));
            }
        }
    }

    @Override
    public boolean canInteractWith(EntityPlayer playerIn) {
        return true;
    }

    public ItemStack transferStackInSlot(EntityPlayer playerIn, int index) {
        ItemStack itemstack = ItemStack.EMPTY;
        Slot slot = this.inventorySlots.get(index);

        if (slot != null && slot.getHasStack()) {
            ItemStack itemstack1 = slot.getStack();
            itemstack = itemstack1.copy();

            if (index < 10) {
                if (!this.mergeItemStack(itemstack1, 10, 46, false))
                {
                    return ItemStack.EMPTY;
                }
            } else if (!this.mergeItemStack(itemstack1, 0, 10, false)) {
                return ItemStack.EMPTY;
            }

            if (itemstack1.isEmpty()) {
                slot.putStack(ItemStack.EMPTY);
            } else {
                slot.onSlotChanged();
            }
        }

        return itemstack;
    }
}
