package Kamen_Rider_Craft_4TH.item;

import Kamen_Rider_Craft_4TH.RiderItems;
import Kamen_Rider_Craft_4TH.TokuCraft_core;
import Kamen_Rider_Craft_4TH.util.IHasModel;
import Kamen_Rider_Craft_4TH.util.Refercence;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;

public class Item_driver extends ItemArmor implements IHasModel {
    private final Item head;
    private final Item chest;
    private final Item legs;

    public Item_driver(ArmorMaterial materialIn, int renderIndexIn, Item head, Item chest, Item legs) {
        super(materialIn, renderIndexIn, EntityEquipmentSlot.FEET);
        this.head = head;
        this.chest = chest;
        this.legs = legs;
    }

    public static int get_eftTime(ItemStack itemstack) {
        return itemstack.hasTagCompound() ? itemstack.getTagCompound().getInteger("eftTime") : 100;
    }

    public static void set_eftTime(ItemStack itemstack, int flag) {
        if (!itemstack.hasTagCompound()) {
            itemstack.setTagCompound(new NBTTagCompound());
        }
        itemstack.getTagCompound().setInteger("eftTime", flag);
    }

    public static int get_core(ItemStack itemstack) {
        return itemstack.hasTagCompound() ? itemstack.getTagCompound().getInteger("core") : 0;
    }

    public static void set_core(ItemStack itemstack, int flag) {
        if (!itemstack.hasTagCompound()) {
            itemstack.setTagCompound(new NBTTagCompound());
        }
        itemstack.getTagCompound().setInteger("core", flag);
    }

    @Override
    public String getArmorTexture(ItemStack stack, Entity entity, EntityEquipmentSlot slot, String type) {
        return Refercence.MODID +":textures/armor/blank.png";
    }

    @Override
    public void registerModels() {
        TokuCraft_core.proxy.registerItemRender(this,0,"inventory");
    }

    @Override
    public void onArmorTick(World world, EntityPlayer player, ItemStack armor) {
        if (!player.getItemStackFromSlot(EntityEquipmentSlot.HEAD).isEmpty()) {
            if (!player.getItemStackFromSlot(EntityEquipmentSlot.CHEST).isEmpty()) {
                if (!player.getItemStackFromSlot(EntityEquipmentSlot.LEGS).isEmpty()) {
                    if (!player.getItemStackFromSlot(EntityEquipmentSlot.FEET).isEmpty()) {
                        if (player.getItemStackFromSlot(EntityEquipmentSlot.LEGS).getItem() == legs) {
                            if (player.getItemStackFromSlot(EntityEquipmentSlot.CHEST).getItem() == chest) {
                                if (player.getItemStackFromSlot(EntityEquipmentSlot.HEAD).getItem() == head) {
                                    process(player, player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem(), get_core(armor));
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public void process(EntityPlayer player, Item feet, int core) {
    }
}
