package Kamen_Rider_Craft_4TH.blocks;

import Kamen_Rider_Craft_4TH.RiderItems;
import Kamen_Rider_Craft_4TH.TokuCraft_core;
import Kamen_Rider_Craft_4TH.util.IHasModel;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class solidifyer_block extends machine_block {
	public solidifyer_block(String string, Material material, int lv) {
		super(string, material, lv);
		TokuCraft_core.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
        TokuCraft_core.BLOCKS.add(this);
	}

	@Override
	public void registerModels() {
		TokuCraft_core.proxy.registerItemRender(Item.getItemFromBlock(this),0,"inventory");
	}
	

    /**
     * Called when the block is right clicked by a player.
     */
    public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
        if (!worldIn.isRemote) {
            if (playerIn.getHeldItem(hand).getItem() == RiderItems.full_bottle) process(playerIn, worldIn, pos, hand, RiderItems.sclashjelly);
            else if (playerIn.getHeldItem(hand).getItem() == RiderItems.dragon_full_bottle) process(playerIn, worldIn, pos, hand, RiderItems.dragon_sclashjelly);
            else if (playerIn.getHeldItem(hand).getItem() == RiderItems.robo_full_bottle) process(playerIn, worldIn, pos, hand, RiderItems.robot_sclashjelly);
            else if (playerIn.getHeldItem(hand).getItem() == RiderItems.bat_full_bottle) process(playerIn, worldIn, pos, hand, RiderItems.crocodile_crack_full_bottle);
            
            return true;
        }
    	
        return false;
    }
}