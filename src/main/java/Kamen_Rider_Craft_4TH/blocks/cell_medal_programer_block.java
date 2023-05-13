package Kamen_Rider_Craft_4TH.blocks;

import Kamen_Rider_Craft_4TH.RiderBlocks;
import Kamen_Rider_Craft_4TH.RiderItems;
import Kamen_Rider_Craft_4TH.TokuCraft_core;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class cell_medal_programer_block extends machine_block  {

	public cell_medal_programer_block(String string, Material material, int lv) {
		super(string, material, lv);
		TokuCraft_core.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
		TokuCraft_core.BLOCKS.add(this);
	}

	@Override
	public void registerModels() {
		TokuCraft_core.proxy.registerItemRender(Item.getItemFromBlock(this),0,"inventory");
	}

	private Item get_birth_core_Drop() {
		Random generator = new Random();
			int rand = generator.nextInt(7);
			 Item[] birth_core = new Item[] {RiderItems.birth_core_breast_cannon,RiderItems.birth_core_catepillar_leg,RiderItems.birth_core_crane_arm,RiderItems.birth_core_cutter_wing
					 ,RiderItems.birth_core_drill_arm,RiderItems.birth_core_eyes,RiderItems.birth_core_shovel_arm};

			return birth_core[rand];
		
	}
	private Item get_core_Drop() {
		Random generator = new Random();
			int rand = generator.nextInt(3);
			 Item[] birth_core = new Item[] {RiderItems.seiuchi,RiderItems.shirokuma,RiderItems.penguin};

			return birth_core[rand];
		
	}
	public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer player, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
		if (!worldIn.isRemote) {
			 if (player.getHeldItem(hand).getItem() == RiderItems.cellmedal) process(player, worldIn, pos, hand, get_birth_core_Drop());
			 else  if (player.getHeldItem(hand).getItem() == new ItemStack(Blocks.PACKED_ICE).getItem()) process(player, worldIn, pos, hand, get_core_Drop());
				
		}

		return false;
	}
}