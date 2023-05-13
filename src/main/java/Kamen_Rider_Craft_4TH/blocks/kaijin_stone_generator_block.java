package Kamen_Rider_Craft_4TH.blocks;


import Kamen_Rider_Craft_4TH.RiderItems;
import Kamen_Rider_Craft_4TH.ShowaRiderItems;
import Kamen_Rider_Craft_4TH.TokuCraft_core;
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

public class kaijin_stone_generator_block extends machine_block  {

	public kaijin_stone_generator_block(String string, Material material, int lv) {
		super(string, material, lv);
		TokuCraft_core.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
		TokuCraft_core.BLOCKS.add(this);
	}
	
	@Override
	public void registerModels() {
		TokuCraft_core.proxy.registerItemRender(Item.getItemFromBlock(this),0,"inventory");
	}

	private Item get_cell_mutation_Drop() {
		Random generator = new Random();
			int rand = generator.nextInt(40);

			if (rand < 5) return ShowaRiderItems.king_stone_sun;
			if (rand < 7) return ShowaRiderItems.king_stone_moon;
			return ShowaRiderItems.kaijin_stone;
		
	}
	 public void process(EntityPlayer player, World world, BlockPos pos, EnumHand hand, Item... items) {
	        world.playSound((double)pos.getX() + 0.5D, (double)pos.getY(), (double)pos.getZ() + 0.5D, SoundEvents.BLOCK_NOTE_BELL, SoundCategory.BLOCKS, 1.0F, 1.0F, false);
	        for(Item item : items) player.dropItem(item, 1);
	        player.dropItem(ShowaRiderItems.empty_vial, 1);
	        player.getHeldItem(hand).shrink(1);
	    }
	
	public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer player, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
		if (!worldIn.isRemote) {
			if (player.getHeldItem(hand).getItem() == ShowaRiderItems.creation_king_extract_vial) process(player, worldIn, pos, hand,get_cell_mutation_Drop());
		}

		return false;
	}
}