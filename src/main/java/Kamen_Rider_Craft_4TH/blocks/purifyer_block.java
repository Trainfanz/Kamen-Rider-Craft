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

import java.util.Random;

public class purifyer_block extends machine_block  {

    public purifyer_block(String string, Material material, int lv) {
		super(string, material, lv);
        TokuCraft_core.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
        TokuCraft_core.BLOCKS.add(this);
    }
	
	@Override
	public void registerModels() {
		TokuCraft_core.proxy.registerItemRender(Item.getItemFromBlock(this),0,"inventory");
	}
	
	private Item getBottleDrop() {
		Random generator = new Random();

		int rand = generator.nextInt(60);

		switch (rand) {
		    case 0: return RiderItems.rabbit_full_bottle;
		    case 1: return RiderItems.tank_full_bottle;
		    case 2: return RiderItems.gorilla_full_bottle;
		    case 3: return RiderItems.diamond_full_bottle;
		    case 4: return RiderItems.taka_full_bottle;
		    case 5: return RiderItems.gatling_full_bottle;
		    case 6: return RiderItems.ninjya_full_bottle;
		    case 7: return RiderItems.comic_full_bottle;
		    case 8: return RiderItems.rocket_full_bottle;
		    case 9: return RiderItems.panda_full_bottle;
		    case 10: return RiderItems.harinezumi_full_bottle;
		    case 11: return RiderItems.shoubousha_full_bottle;
		    case 12: return RiderItems.lion_full_bottle;
		    case 13: return RiderItems.soujiki_full_bottle;
		    case 14: return RiderItems.lock_full_bottle;
		    case 15: return RiderItems.dragon_full_bottle;
		    case 16: return RiderItems.ressha_full_bottle;
		    case 17: return RiderItems.kaizoku_full_bottle;
		    case 18: return RiderItems.octopus_full_bottle;
		    case 19: return RiderItems.light_full_bottle;
		    case 20: return RiderItems.sai_full_bottle;
		    case 21: return RiderItems.dryer_full_bottle;
		    case 22: return RiderItems.kuma_full_bottle;
		    case 23: return RiderItems.televi_full_bottle;
		    case 24: return RiderItems.wolf_full_bottle;
		    case 25: return RiderItems.smartphone_full_bottle;
		    case 26: return RiderItems.phoenix_full_bottle;
		    case 27: return RiderItems.robo_full_bottle;
		    case 28: return RiderItems.cake_full_bottle;
		    case 29: return RiderItems.santa_full_bottle;
		    case 30: return RiderItems.dog_full_bottle;
		    case 31: return RiderItems.mic_full_bottle;
		    case 32: return RiderItems.beetle_full_bottle;
		    case 33: return RiderItems.camera_full_bottle;
		    case 34: return RiderItems.helicopter_full_bottle;
		    case 35: return RiderItems.rose_full_bottle;
		    case 36: return RiderItems.turtle_full_bottle;
		    case 37: return RiderItems.watch_full_bottle;
		    case 38: return RiderItems.unicorn_full_bottle;
		    case 39: return RiderItems.eraser_full_bottle;
		    case 40: return RiderItems.spider_full_bottle;
		    case 41: return RiderItems.fridge_full_bottle;
		    case 42: return RiderItems.tora_full_bottle;
		    case 43: return RiderItems.ufo_full_bottle;
		    case 44: return RiderItems.kujira_full_bottle;
		    case 45: return RiderItems.jet_full_bottle;
		    case 46: return RiderItems.kirin_full_bottle;
		    case 47: return RiderItems.cyclone_full_bottle;
		    case 48: return RiderItems.bat_full_bottle_2;
		    case 49: return RiderItems.engine_full_bottle;
		    case 50: return RiderItems.obake_full_bottle;
		    case 51: return RiderItems.same_full_bottle;
		    case 52: return RiderItems.bike_full_bottle;
		    case 53: return RiderItems.magnet_full_bottle;
		    case 54: return RiderItems.hachi_full_bottle;
		    case 55: return RiderItems.submarine_full_bottle;
		    case 56: return RiderItems.penguin_full_bottle;
		    case 57: return RiderItems.skateboard_full_bottle;
		    case 58: return RiderItems.deer_full_bottle;
		    case 59: return RiderItems.pyramid_full_bottle;
		    default: return RiderItems.smash_bottle;
		}
	}

    public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer player, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
    	if (!worldIn.isRemote) {
    	    if (player.getHeldItem(hand).getItem() == RiderItems.smash_bottle) process(player, worldIn, pos, hand, getBottleDrop());
    	    else if (player.getHeldItem(hand).getItem() == RiderItems.ex_aid_full_bottle) process(player, worldIn, pos, hand, RiderItems.doctor_full_bottle, RiderItems.game_full_bottle);

    	    return true;
	    }
    	
        return false;
    }
}