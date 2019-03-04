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

public class GameCreatorBlock extends machine_block  {

	public GameCreatorBlock(String string, Material material, int lv) {
		super(string, material, lv);
		TokuCraft_core.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
		TokuCraft_core.BLOCKS.add(this);
	}
	public static final List<Item> gashat = new ArrayList<Item>();
	public static final List<Item> gashatBugvisor = new ArrayList<Item>();
	public static final List<Item> gashatMaximum = new ArrayList<Item>();
	public static final List<Item> gashatDual = new ArrayList<Item>();
	public static final List<Item> gashatHyper = new ArrayList<Item>();
	
	@Override
	public void registerModels() {
		TokuCraft_core.proxy.registerItemRender(Item.getItemFromBlock(this),0,"inventory");
	}

	private Item getGameDrop(int num) {
		Random generator = new Random();
		if (num ==1){
			int rand = generator.nextInt(gashatBugvisor.size());
			return gashatBugvisor.get(rand);
		}else if (num ==2){
			int rand = generator.nextInt(gashatMaximum.size());
			return gashatMaximum.get(rand);
		}else if (num ==3){
			int rand = generator.nextInt(gashatDual.size());
			return gashatDual.get(rand);
		}else if (num ==4){
			int rand = generator.nextInt(gashatHyper.size());
			return gashatHyper.get(rand);
		}else{
			int rand = generator.nextInt(gashat.size());
			return gashat.get(rand);
		}

	}

	public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer player, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
		if (!worldIn.isRemote) {
			if (player.getHeldItem(hand).getItem() == RiderItems.blank_gashat) process(player, worldIn, pos, hand, getGameDrop(0));
			else if (player.getHeldItem(hand).getItem() == RiderItems.unfinished_kamen_rider_chronicle_gashat) process(player, worldIn, pos, hand, getGameDrop(1));
			else if (player.getHeldItem(hand).getItem() == RiderItems.unfinished_maximum_mighty_x_gashat) process(player, worldIn, pos, hand, getGameDrop(2));
			else if (player.getHeldItem(hand).getItem() == RiderItems.mighty_brothers_xx_unfinished_gashat) process(player, worldIn, pos, hand, getGameDrop(3));
			else if (player.getHeldItem(hand).getItem() == RiderItems.unfinished_hyper_muteki_gashat) process(player, worldIn, pos, hand, getGameDrop(4));
			return true;
		}

		return false;
	}
}