package Kamen_Rider_Craft_4TH.blocks;

import java.util.Random;

import Kamen_Rider_Craft_4TH.RiderBlocks;
import Kamen_Rider_Craft_4TH.TokuCraft_core;
import Kamen_Rider_Craft_4TH.item.Item_custom_door;
import Kamen_Rider_Craft_4TH.util.IHasModel;
import net.minecraft.block.BlockBush;
import net.minecraft.block.BlockDoor;
import net.minecraft.block.BlockFlower;
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

public class BlockCustomDoor extends BlockDoor implements IHasModel {
	public BlockCustomDoor(String string) {
		super(Material.WOOD);
		setTranslationKey(string);
		setRegistryName(string);

		TokuCraft_core.ITEMS.add(new Item_custom_door(this).setRegistryName(this.getRegistryName()));
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