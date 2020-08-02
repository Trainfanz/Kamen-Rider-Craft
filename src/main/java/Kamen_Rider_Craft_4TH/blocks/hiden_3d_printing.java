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

public class hiden_3d_printing extends machine_block  {

	public hiden_3d_printing(String string, Material material, int lv) {
		super(string, material, lv);
		TokuCraft_core.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
		TokuCraft_core.BLOCKS.add(this);
	}
	public static final List<Item> hiden_progrise_keys = new ArrayList<Item>();
	public static final List<Item> Humagear_progrise_keys = new ArrayList<Item>();

	@Override
	public void registerModels() {
		TokuCraft_core.proxy.registerItemRender(Item.getItemFromBlock(this),0,"inventory");
	}

	private Item getProgriseKeyDrop(int num) {
		Random generator = new Random();
		if (num==0){
			int rand = generator.nextInt(hiden_progrise_keys.size());
			return hiden_progrise_keys.get(rand);
		} else {
			int rand = generator.nextInt(Humagear_progrise_keys.size());
			return Humagear_progrise_keys.get(rand);
		} 
	}

	public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer player, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
		if (!worldIn.isRemote) {
			if (player.getHeldItem(hand).getItem() == RiderItems.blank_progrise_key) process(player, worldIn, pos, hand, getProgriseKeyDrop(0));
			else if (player.getHeldItem(hand).getItem() == RiderItems.humagear_progrise_key) process(player, worldIn, pos, hand, getProgriseKeyDrop(1));
			return true;
		}

		return false;
	}
}