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
	
	private Item getBottleDrop(Item bottle) {
		Random generator = new Random();
		
		if (bottle == RiderItems.smash_bottle) {
		    int rand = generator.nextInt(420);

		    switch (rand){
                case 30 : return RiderItems.rabbit_full_bottle;
                case 40 : return RiderItems.tank_full_bottle;
                case 50 : return RiderItems.gorilla_full_bottle;
                case 60 : return RiderItems.diamond_full_bottle;
                case 70 : return RiderItems.taka_full_bottle;
                case 80 : return RiderItems.gatling_full_bottle;
                case 90 : return RiderItems.ninjya_full_bottle;
                case 100 : return RiderItems.comic_full_bottle;
                case 110 : return RiderItems.rocket_full_bottle;
                case 120 : return RiderItems.panda_full_bottle;
                case 130 : return RiderItems.harinezumi_full_bottle;
                case 140 : return RiderItems.shoubousha_full_bottle;
                case 150 : return RiderItems.lion_full_bottle;
                case 160 : return RiderItems.soujiki_full_bottle;
                case 170 : return RiderItems.lock_full_bottle;
                case 180 : return RiderItems.dragon_full_bottle;
                case 190 : return RiderItems.ressha_full_bottle;
                case 200 : return RiderItems.kaizoku_full_bottle;
                case 210 : return RiderItems.octopus_full_bottle;
                case 220 : return RiderItems.light_full_bottle;
                case 225 : return RiderItems.sai_full_bottle;
                case 230 : return RiderItems.dryer_full_bottle;
                case 235 : return RiderItems.kuma_full_bottle;
                case 240 : return RiderItems.televi_full_bottle;
                case 245 : return RiderItems.wolf_full_bottle;
                case 250 : return RiderItems.smartphone_full_bottle;
                case 255 : return RiderItems.phoenix_full_bottle;
                case 260 : return RiderItems.robo_full_bottle;
                case 265 : return RiderItems.cake_full_bottle;
                case 270 : return RiderItems.santa_full_bottle;
                case 275 : return RiderItems.dog_full_bottle;
                case 280 : return RiderItems.mic_full_bottle;
                case 285 : return RiderItems.beetle_full_bottle;
                case 290 : return RiderItems.camera_full_bottle;
                case 295 : return RiderItems.helicopter_full_bottle;
                case 300 : return RiderItems.rose_full_bottle;
                case 305 : return RiderItems.turtle_full_bottle;
                case 310 : return RiderItems.watch_full_bottle;
                case 315 : return RiderItems.unicorn_full_bottle;
                case 320 : return RiderItems.eraser_full_bottle;
                case 325 : return RiderItems.spider_full_bottle;
                case 330 : return RiderItems.fridge_full_bottle;
                case 335 : return RiderItems.tora_full_bottle;
                case 340 : return RiderItems.ufo_full_bottle;
                case 345 : return RiderItems.kujira_full_bottle;
                case 350 : return RiderItems.jet_full_bottle;
                case 355 : return RiderItems.kirin_full_bottle;
                case 360 : return RiderItems.cyclone_full_bottle;
                case 365 : return RiderItems.bat_full_bottle_2;
                case 370 : return RiderItems.engine_full_bottle;
                case 375 : return RiderItems.obake_full_bottle;
                case 380 : return RiderItems.same_full_bottle;
                case 385 : return RiderItems.bike_full_bottle;
                case 390 : return RiderItems.magnet_full_bottle;
                case 395 : return RiderItems.hachi_full_bottle;
                case 400 : return RiderItems.submarine_full_bottle;
                case 405 : return RiderItems.penguin_full_bottle;
                case 410 : return RiderItems.skateboard_full_bottle;
                case 415 : return RiderItems.deer_full_bottle;
                case 420 : return RiderItems.pyramid_full_bottle;
		        default: return bottle;

            }
		} else {
            return RiderItems.rabbit_full_bottle;
        }
	}

    public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer player, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
    	if (!worldIn.isRemote) {
    	    if (player.getHeldItem(hand).getItem() == RiderItems.smash_bottle) process(player, worldIn, pos, hand, getBottleDrop(player.getHeldItem(hand).getItem()));
    	    else if (player.getHeldItem(hand).getItem() == RiderItems.ex_aid_full_bottle) process(player, worldIn, pos, hand, RiderItems.doctor_full_bottle, RiderItems.game_full_bottle);

    	    return true;
	    }
    	
        return false;
    }
}