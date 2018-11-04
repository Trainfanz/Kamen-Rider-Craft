package Kamen_Rider_Craft_4TH.blocks;

import Kamen_Rider_Craft_4TH.RiderItems;
import Kamen_Rider_Craft_4TH.TokuCraft_core;
import Kamen_Rider_Craft_4TH.util.IHasModel;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class purifyer_block extends machine_block  {

    public purifyer_block(String string, Material material, int lv) {
		super(string, material, lv);
        TokuCraft_core.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
        TokuCraft_core.BLOCKS.add(this);
    }
    public static final List<Item> BOTTLE = new ArrayList<Item>();
    
	@Override
	public void registerModels() {
		TokuCraft_core.proxy.registerItemRender(Item.getItemFromBlock(this),0,"inventory");
	}
	
	private Item getBottleDrop() {
		Random generator = new Random();

		int rand = generator.nextInt(BOTTLE.size());
		return BOTTLE.get(rand);
	}

    public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer player, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
    	if (!worldIn.isRemote) {
    	    if (player.getHeldItem(hand).getItem() == RiderItems.smash_bottle) process(player, worldIn, pos, hand, getBottleDrop());
    	    else if (player.getHeldItem(hand).getItem() == RiderItems.ex_aid_full_bottle) process(player, worldIn, pos, hand, RiderItems.doctor_full_bottle, RiderItems.game_full_bottle);
    	    else if (player.getHeldItem(hand).getItem() == RiderItems.ghost_full_bottle) process(player, worldIn, pos, hand, RiderItems.parka_full_bottle);
    	    else if (player.getHeldItem(hand).getItem() == RiderItems.gaim_full_bottle) process(player, worldIn, pos, hand, RiderItems.orange_full_bottle);
    	    else if (player.getHeldItem(hand).getItem() == RiderItems.wizard_full_bottle) process(player, worldIn, pos, hand, RiderItems.mahoutskai_full_bottle);
    	    else if (player.getHeldItem(hand).getItem() == RiderItems.fourze_full_bottle) process(player, worldIn, pos, hand, RiderItems.yujou_full_bottle);

    	    return true;
	    }
    	
        return false;
    }
}