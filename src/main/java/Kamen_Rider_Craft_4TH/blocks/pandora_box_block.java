package Kamen_Rider_Craft_4TH.blocks;

import Kamen_Rider_Craft_4TH.RiderItems;
import Kamen_Rider_Craft_4TH.TokuCraft_core;
import Kamen_Rider_Craft_4TH.util.IHasModel;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class pandora_box_block extends machine_block  {

    public pandora_box_block(String string, Material material, int lv) {
		super(string, material, lv);
        TokuCraft_core.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
        TokuCraft_core.BLOCKS.add(this);
    }
    public static final List<Item> BOTTLE = new ArrayList<Item>();
    
	@Override
	public void registerModels() {
		TokuCraft_core.proxy.registerItemRender(Item.getItemFromBlock(this),0,"inventory");
	}

    public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer player, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
    	if (!worldIn.isRemote) {
    	     if (player.getHeldItem(hand).getItem() == RiderItems.full_bottle) process(player, worldIn, pos, hand, RiderItems.Pandora_bottle);
    	     if (player.getHeldItem(hand).getItem() == Items.DYE&player.getHeldItem(hand).getMetadata()==2) process(player, worldIn, pos, hand, RiderItems.pandora_panel_green);
    	     if (player.getHeldItem(hand).getItem() == Items.DYE&player.getHeldItem(hand).getMetadata()==4) process(player, worldIn, pos, hand, RiderItems.pandora_panel_blue);
    	     if (player.getHeldItem(hand).getItem() == Items.DYE&player.getHeldItem(hand).getMetadata()==1) process(player, worldIn, pos, hand, RiderItems.pandora_panel_red);
    	     if (player.getHeldItem(hand).getItem() == Items.DYE&player.getHeldItem(hand).getMetadata()==0) process(player, worldIn, pos, hand, RiderItems.pandora_panel_black);
    	     if (player.getHeldItem(hand).getItem() == RiderItems.hazard_trigger) process(player, worldIn, pos, hand, RiderItems.pandora_panel_white);
    	    return true;
	    }
        return false;
    }
}