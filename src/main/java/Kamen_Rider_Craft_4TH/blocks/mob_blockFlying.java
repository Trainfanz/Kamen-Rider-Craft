package Kamen_Rider_Craft_4TH.blocks;

import Kamen_Rider_Craft_4TH.TokuCraft_core;
import Kamen_Rider_Craft_4TH.util.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityFlying;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

import java.util.Random;
import java.util.function.Function;

public class mob_blockFlying extends Block implements IHasModel {
	private final Function<World, EntityFlying> mobFuntion;

	public mob_blockFlying(String string, Function<World, EntityFlying> mobFunction) {
		super(Material.ROCK);
		this.setHarvestLevel("pickaxe", 2);
		setHardness(9.9F);
		setLightLevel(0.1f);
		setTranslationKey(string);
		setRegistryName(string);
		this.mobFuntion = mobFunction;
        TokuCraft_core.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
        TokuCraft_core.BLOCKS.add(this);
	}

	/**
	 * Returns the ID of the items to drop on destruction.
	 */
	@Override
	public Item getItemDropped(IBlockState state, Random random, int fortune){
		return null;
	}

	@Override
	/**
     * Called after a player destroys this Block - the posiiton pos may no longer hold the state indicated.
     */
    public void onPlayerDestroy(World worldIn, BlockPos pos, IBlockState state) {
		if (!worldIn.isRemote) {
			EntityFlying entitychicken = mobFuntion.apply(worldIn);

            entitychicken.setLocationAndAngles(pos.getX(), pos.getY(), pos.getZ(), 0, 0.0F);
            worldIn.spawnEntity(entitychicken);
		}
    }

	@Override
	public int getExpDrop(IBlockState state, IBlockAccess world, BlockPos pos, int fortune) {
    	return 5;
	}

	@Override
	public void registerModels() {
		TokuCraft_core.proxy.registerItemRender(Item.getItemFromBlock(this),0,"inventory");
	}
}