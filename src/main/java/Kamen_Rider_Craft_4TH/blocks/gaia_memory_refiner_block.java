package Kamen_Rider_Craft_4TH.blocks;

import Kamen_Rider_Craft_4TH.RiderItems;
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

public class gaia_memory_refiner_block extends machine_block  {

	public gaia_memory_refiner_block(String string, Material material, int lv) {
		super(string, material, lv);
		TokuCraft_core.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
		TokuCraft_core.BLOCKS.add(this);
	}
	public static final List<Item> gaia_memory_g = new ArrayList<Item>();
	public static final List<Item> gaia_memory_s = new ArrayList<Item>();
	public static final List<Item> gaia_memory_t2 = new ArrayList<Item>();

	@Override
	public void registerModels() {
		TokuCraft_core.proxy.registerItemRender(Item.getItemFromBlock(this),0,"inventory");
	}

	private Item getmemoryDrop(int num) {
		Random generator = new Random();
		if (num==1){
			int rand = generator.nextInt(gaia_memory_s.size());
			return gaia_memory_s.get(rand);
		} else if (num==2){
			int rand = generator.nextInt(gaia_memory_t2.size());
			return gaia_memory_t2.get(rand);
		} else{
			int rand = generator.nextInt(gaia_memory_g.size());
			return gaia_memory_g.get(rand);
		}
	}

	public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer player, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
		if (!worldIn.isRemote) {
			if (player.getHeldItem(hand).getItem() == RiderItems.unrefined_memory_g) process(player, worldIn, pos, hand, getmemoryDrop(0));
			else if (player.getHeldItem(hand).getItem() == RiderItems.unrefined_memory_s) process(player, worldIn, pos, hand, getmemoryDrop(1));
			else if (player.getHeldItem(hand).getItem() == RiderItems.unrefined_memory_t2) process(player, worldIn, pos, hand, getmemoryDrop(2));
			return true;
		}

		return false;
	}
}