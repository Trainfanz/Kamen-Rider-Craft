package Kamen_Rider_Craft_4TH.blocks;

import Kamen_Rider_Craft_4TH.RiderBlocks;
import Kamen_Rider_Craft_4TH.RiderItems;
import Kamen_Rider_Craft_4TH.ShowaRiderItems;
import Kamen_Rider_Craft_4TH.TokuCraft_core;
import Kamen_Rider_Craft_4TH.util.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

import java.util.Random;

public class game_block extends Block implements IHasModel {

	public game_block(String string, Material par3Material,int lv)
	{
		super(par3Material);
		this.setHarvestLevel("pickaxe", lv);
		setHardness(9.9F);
		setLightLevel(0.1f);
		setTranslationKey(string);
		setRegistryName(string);

        TokuCraft_core.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
        TokuCraft_core.BLOCKS.add(this);
	}
	
	@Override
    public boolean isOpaqueCube(IBlockState state)
    {
        return false;
    }

    @Override
    public boolean isFullCube(IBlockState state)
    {
        return true;
    }

	/**
	 * Returns the ID of the items to drop on destruction.
	 */
	@Override
	public Item getItemDropped(IBlockState state, Random generator, int fortune){
		if (this == RiderBlocks.mighty_block){
			int rand = generator.nextInt(190);

			if (rand < 10) return RiderItems.bug_energy_item;
			if (rand < 20) return RiderItems.halt_energy_item;
			if (rand < 30) return RiderItems.dark_energy_item;
			if (rand < 70) return RiderItems.lucky_energy_item;
			if (rand < 110) return RiderItems.liquid_energy_item;
			if (rand < 150) return RiderItems.giant_energy_item;
			if (rand < 190) return RiderItems.muscle_energy_item;
		}
		if (this == RiderBlocks.bang_bang_drum){
			int rand = generator.nextInt(190);

			if (rand < 10) return RiderItems.bug_energy_item;
			if (rand < 20) return RiderItems.halt_energy_item;
			if (rand < 30) return RiderItems.shrink_energy_item;
			if (rand < 70) return RiderItems.emission_energy_item;
			if (rand < 110) return RiderItems.invisible_energy_item;
			if (rand < 150) return RiderItems.recover_energy_item;
			if (rand < 190) return RiderItems.iron_energy_item;
		}
		if (this == RiderBlocks.bakusou_trophy){
			int rand = generator.nextInt(160);

			if (rand < 10) return RiderItems.bug_energy_item;
			if (rand < 20) return RiderItems.halt_energy_item;
			if (rand < 30) return RiderItems.instigate_energy_item;
			if (rand < 40) return RiderItems.confusion_energy_item;
			if (rand < 80) return RiderItems.emission_energy_item;
			if (rand < 120) return RiderItems.jump_energy_item;
			if (rand < 160) return RiderItems.speed_energy_item;
		}
		return ShowaRiderItems.blanknoitem;
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