package Kamen_Rider_Craft_4TH.blocks;

import Kamen_Rider_Craft_4TH.ReiwaRiderItems;
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

public class zaia_3d_printing extends machine_block  {

	public zaia_3d_printing(String string, Material material, int lv) {
		super(string, material, lv);
		TokuCraft_core.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
		TokuCraft_core.BLOCKS.add(this);
	}
	public static final List<Item> zaia_progrise_keys = new ArrayList<Item>();

	@Override
	public void registerModels() {
		TokuCraft_core.proxy.registerItemRender(Item.getItemFromBlock(this),0,"inventory");
	}

	private Item getProgriseKeyDrop() {
		Random generator = new Random();
			int rand = generator.nextInt(zaia_progrise_keys.size());
			return zaia_progrise_keys.get(rand);
		
	}

	public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer player, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
		if (!worldIn.isRemote) {
			if (player.getHeldItem(hand).getItem() == ReiwaRiderItems.blank_progrise_key) process(player, worldIn, pos, hand, getProgriseKeyDrop());
		}

		return false;
	}
}