package Kamen_Rider_Craft_4TH.item;

import Kamen_Rider_Craft_4TH.TokuCraft_core;
import Kamen_Rider_Craft_4TH.gui.GuiHandler;
import Kamen_Rider_Craft_4TH.util.IHasModel;
import Kamen_Rider_Craft_4TH.util.Refercence;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.ICapabilityProvider;
import net.minecraftforge.common.capabilities.ICapabilitySerializable;
import net.minecraftforge.fml.common.network.internal.FMLNetworkHandler;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.items.ItemStackHandler;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public class item_panel extends Item implements IHasModel {
    private final PanelColor color;

    public item_panel(String name, PanelColor color) {
        super();
        this.color = color;
        this.setHasSubtypes(true);
        this.setMaxDamage(0);
        maxStackSize = 1;
        setUnlocalizedName(name);
        setRegistryName(name);
        TokuCraft_core.ITEMS.add(this);
    }

    public PanelColor getColor() {
        return color;
    }

    @Nullable
    @Override
    public ICapabilityProvider initCapabilities(ItemStack stack, @Nullable NBTTagCompound nbt) {
        return new PanelInventory();
    }

    @Override
    public void registerModels() {
        TokuCraft_core.proxy.registerItemRender(this,0,"inventory");
    }

    public static class PanelInventory implements ICapabilityProvider, ICapabilitySerializable {

        private final ItemStackHandler inventory;

        public PanelInventory() {
            inventory = new ItemStackHandler( 10 );
        }

        @Override
        public NBTBase serializeNBT() {
            return inventory.serializeNBT();
        }

        @Override
        public void deserializeNBT(NBTBase nbt ) {
            if(nbt instanceof NBTTagCompound) inventory.deserializeNBT((NBTTagCompound) nbt);
        }

        @Override
        public <T> T getCapability( Capability<T> capability, EnumFacing facing ) {
            if( capability == CapabilityItemHandler.ITEM_HANDLER_CAPABILITY ) {
                return (T) inventory;
            }
            return null;
        }

        @Override
        public boolean hasCapability(@Nonnull Capability<?> capability, @Nullable EnumFacing facing) {
            return capability == CapabilityItemHandler.ITEM_HANDLER_CAPABILITY;
        }
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn) {
        FMLNetworkHandler.openGui(playerIn, TokuCraft_core.instance, GuiHandler.PANEL_GUI, worldIn, 0,0,0);
        return super.onItemRightClick(worldIn, playerIn, handIn);
    }

    public static enum PanelColor {
        White("white"),
        Red("red"),
        Blue("blue"),
        Green("green"),
        Black("black");

        private ResourceLocation location;

        public ResourceLocation getResourceLocation() {
            return location;
        }

        PanelColor(String color) {
            location = new ResourceLocation(Refercence.MODID,"textures/gui/panel_" + color+ "_gui.png");
        }
    }
}
