package Kamen_Rider_Craft_4TH.blocks;

import Kamen_Rider_Craft_4TH.ReiwaRiderItems;
import Kamen_Rider_Craft_4TH.TokuCraft_core;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class sword_of_logos_book_analyzer extends machine_block  {

	public sword_of_logos_book_analyzer(String string, Material material, int lv) {
		super(string, material, lv);
		TokuCraft_core.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
		TokuCraft_core.BLOCKS.add(this);
	}
	public static final List<Item> wonder_ride_books = new ArrayList<Item>();

	@Override
	public void registerModels() {
		TokuCraft_core.proxy.registerItemRender(Item.getItemFromBlock(this),0,"inventory");
	}

	
private Item getProgriseKeyDrop(EntityPlayer player) {
		
		List<Item> vistamp2 = new ArrayList<Item>();
		vistamp2.clear();
		 vistamp2.addAll(wonder_ride_books);
		 if (player.inventory.hasItemStack(new ItemStack(ReiwaRiderItems.tassel_dark_wonderride_book))){
				for (int i1 = 0; i1 < 2; ++i1)
				{
					vistamp2.add(ReiwaRiderItems.ultimate_bahamut_wonder_ride_book);
				}
		 }
		Random generator = new Random();
			int rand = generator.nextInt(vistamp2.size());
			return vistamp2.get(rand);
		
	}
	

	private Item get_wonder_world_storyDrop() {
		Random generator = new Random();
			int rand = generator.nextInt(11);
			 Item[] wonder_world_story_wonder_ride_books = new Item[] {ReiwaRiderItems.wonder_world_story_of_ankokuken_kurayami_wonderride_book,ReiwaRiderItems.wonder_world_story_of_dogouken_gekido_wonderride_book
					,ReiwaRiderItems.wonder_world_story_of_eneiken_noroshi_wonderride_book,ReiwaRiderItems.wonder_world_story_of_fuusouken_hayate_wonderride_book,ReiwaRiderItems.wonder_world_story_of_kaenken_rekka_wonderride_book
					,ReiwaRiderItems.wonder_world_story_of_kougouken_saikou_wonderride_book,ReiwaRiderItems.wonder_world_story_of_mumeiken_kyomu_wonderride_book,ReiwaRiderItems.wonder_world_story_of_onjuuken_suzune_wonderride_book
					,ReiwaRiderItems.wonder_world_story_of_raimeiken_ikazuchi_wonderride_book,ReiwaRiderItems.wonder_world_story_of_suiseiken_nagare_wonderride_book,ReiwaRiderItems.wonder_world_story_of_jikokuken_kaiji_wonderride_book};

			return wonder_world_story_wonder_ride_books[rand];
		
	}

	public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer player, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
		if (!worldIn.isRemote) {
			if (player.getHeldItem(hand).getItem() == ReiwaRiderItems.blank_wonder_ride_book) process(player, worldIn, pos, hand, getProgriseKeyDrop(player));
			
			else if (player.getHeldItem(hand).getItem() == ReiwaRiderItems.blank_wonder_world_story_wonder_ride_book) process(player, worldIn, pos, hand, get_wonder_world_storyDrop());
		}

		return false;
	}
}