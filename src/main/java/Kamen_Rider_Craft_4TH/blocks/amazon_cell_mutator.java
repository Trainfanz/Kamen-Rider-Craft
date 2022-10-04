package Kamen_Rider_Craft_4TH.blocks;


import Kamen_Rider_Craft_4TH.ShowaRiderItems;
import Kamen_Rider_Craft_4TH.TokuCraft_core;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class amazon_cell_mutator extends machine_block  {

	public amazon_cell_mutator(String string, Material material, int lv) {
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
		 Item[] cells = new Item[] {ShowaRiderItems.alpha_amazon_cell_vial,ShowaRiderItems.omega_amazon_cell_vial,ShowaRiderItems.sigma_amazon_cell_vial,ShowaRiderItems.alpha_amazon_cell_vial,ShowaRiderItems.omega_amazon_cell_vial,ShowaRiderItems.sigma_amazon_cell_vial,
				 ShowaRiderItems.alpha_amazon_cell_vial,ShowaRiderItems.omega_amazon_cell_vial,ShowaRiderItems.alpha_amazon_cell_vial,ShowaRiderItems.omega_amazon_cell_vial,ShowaRiderItems.sigma_amazon_cell_vial,
				 ShowaRiderItems.alpha_amazon_cell_vial,ShowaRiderItems.omega_amazon_cell_vial,ShowaRiderItems.neo_amazon_cell_vial};

			int rand = generator.nextInt(cells.length);
			
			return cells[rand];
		
	}
	public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer player, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
		if (!worldIn.isRemote) {
			if (player.getHeldItem(hand).getItem() == ShowaRiderItems.amazon_cell_vial) process(player, worldIn, pos, hand,get_cell_mutation_Drop());
		}

		return false;
	}
}