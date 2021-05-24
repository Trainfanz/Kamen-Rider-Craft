package Kamen_Rider_Craft_4TH.blocks;

import java.util.Random;

import Kamen_Rider_Craft_4TH.RiderBlocks;
import Kamen_Rider_Craft_4TH.TokuCraft_core;
import Kamen_Rider_Craft_4TH.item.Item_custom_door;
import Kamen_Rider_Craft_4TH.util.IHasModel;
import net.minecraft.block.BlockBush;
import net.minecraft.block.BlockDoor;
import net.minecraft.block.BlockFlower;
import net.minecraft.block.BlockStairs;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;

public class BlockCustomStaris extends BlockStairs implements IHasModel {
	
	
	public BlockCustomStaris(IBlockState modelState,String string) {
		super(modelState);
		setTranslationKey(string);
		setRegistryName(string);

	       TokuCraft_core.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	        TokuCraft_core.BLOCKS.add(this);
	}
	
	  @Override
			public Item getItemDropped(IBlockState state, Random rand, int fortune) 
			{
				return Item.getItemFromBlock(this);
			}
			
			@Override
			public ItemStack getPickBlock(IBlockState state, RayTraceResult target, World world, BlockPos pos, EntityPlayer player) 
			{
				return new ItemStack(this);
			}
			
	
	@Override
	public void registerModels() {
		TokuCraft_core.proxy.registerItemRender(Item.getItemFromBlock(this),0,"inventory");
	}

}