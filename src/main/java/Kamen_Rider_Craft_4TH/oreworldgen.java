package Kamen_Rider_Craft_4TH;

import java.util.Random;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.state.pattern.BlockMatcher;
import net.minecraft.init.Blocks;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;


public class oreworldgen implements IWorldGenerator
{
	
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator,IChunkProvider chunkProvider) {

		switch (world.provider.getDimension())
		{
		case -1:
			generateNether(world, random, chunkX * 16, chunkZ * 16);
			break;

		case 0:
			generateSurface(world, random, chunkX * 16, chunkZ * 16);
			break;

		case 1:
			generateEnd();
			break;
		}
		
	}
	

	public void generateNether(World world, Random rand, int chunkX, int chunkZ)
	{

		

		for (int i = 0; i < 2; i++)
		{
			//16x16 area up to y = 64
					int randPosX = chunkX + rand.nextInt(16);
			int randPosY = rand.nextInt(128);
			int randPosZ = chunkZ + rand.nextInt(16);
			// 10 blocks per vein
			BlockPos position = new BlockPos(randPosX, randPosY, randPosZ);
			//(new WorldGenMinable(RiderItems.hellrock_lockseedblock.getDefaultState(), 1)).generate(world, rand,position);
				new WorldGenMinable(RiderItems.gemdeus_stone.getDefaultState(), 9, BlockMatcher.forBlock(Blocks.NETHERRACK)).generate(world, rand,position);
			}
		
			for (int i = 0; i < 2; i++)
			{
				//16x16 area up to y = 64
						int randPosX = chunkX + rand.nextInt(16);
				int randPosY = rand.nextInt(128);
				int randPosZ = chunkZ + rand.nextInt(16);
				// 10 blocks per vein
				BlockPos position = new BlockPos(randPosX, randPosY, randPosZ);
				//(new WorldGenMinable(RiderItems.hellrock_lockseedblock.getDefaultState(), 1)).generate(world, rand,position);
				new WorldGenMinable(RiderItems.neozecthellrock.getDefaultState(), 9, BlockMatcher.forBlock(Blocks.NETHERRACK)).generate(world, rand,position);		
			
		}

		for (int i = 0; i < 2; i++)
		{
			int randPosX = chunkX + rand.nextInt(16);
			int randPosY = rand.nextInt(128);
			int randPosZ = chunkZ + rand.nextInt(16);
			BlockPos position = new BlockPos(randPosX, randPosY, randPosZ);
			new WorldGenMinable(RiderItems.hellrock_drive.getDefaultState(), 9, BlockMatcher.forBlock(Blocks.NETHERRACK)).generate(world, rand,position);	
		}

		for (int i = 0; i < 2; i++)
		{
			//16x16 area up to y = 64
					int randPosX = chunkX + rand.nextInt(16);
			int randPosY = rand.nextInt(128);
			int randPosZ = chunkZ + rand.nextInt(16);
			// 10 blocks per vein
			BlockPos position = new BlockPos(randPosX, randPosY, randPosZ);
			//(new WorldGenMinable(RiderItems.hellrock_lockseedblock.getDefaultState(), 1)).generate(world, rand,position);
			new WorldGenMinable(RiderItems.hellrock_agito.getDefaultState(), 9, BlockMatcher.forBlock(Blocks.NETHERRACK)).generate(world, rand,position);		
		}
		for (int i = 0; i < 2; i++)
		{
			//16x16 area up to y = 64
					int randPosX = chunkX + rand.nextInt(16);
			int randPosY = rand.nextInt(128);
			int randPosZ = chunkZ + rand.nextInt(16);
			// 10 blocks per vein
			BlockPos position = new BlockPos(randPosX, randPosY, randPosZ);
			//(new WorldGenMinable(RiderItems.hellrock_lockseedblock.getDefaultState(), 1)).generate(world, rand,position);
			new WorldGenMinable(RiderItems.hellrock_lockseedblock.getDefaultState(), 9, BlockMatcher.forBlock(Blocks.NETHERRACK)).generate(world, rand,position);
		}
		
		for (int i = 0; i < 2; i++)
		{
			//16x16 area up to y = 64
					int randPosX = chunkX + rand.nextInt(16);
			int randPosY = rand.nextInt(128);
			int randPosZ = chunkZ + rand.nextInt(16);
			// 10 blocks per vein
			BlockPos position = new BlockPos(randPosX, randPosY, randPosZ);
			//(new WorldGenMinable(RiderItems.hellrock_lockseedblock.getDefaultState(), 1)).generate(world, rand,position);
			new WorldGenMinable(RiderItems.oni_ore_hellrock.getDefaultState(), 9, BlockMatcher.forBlock(Blocks.NETHERRACK)).generate(world, rand,position);
		}
		
		for (int i = 0; i < 2; i++)
		{
			//16x16 area up to y = 64
					int randPosX = chunkX + rand.nextInt(16);
			int randPosY = rand.nextInt(128);
			int randPosZ = chunkZ + rand.nextInt(16);
			// 10 blocks per vein
			BlockPos position = new BlockPos(randPosX, randPosY, randPosZ);
			//(new WorldGenMinable(RiderItems.hellrock_lockseedblock.getDefaultState(), 1)).generate(world, rand,position);
			new WorldGenMinable(RiderItems.hell_advent_glass.getDefaultState(), 9, BlockMatcher.forBlock(Blocks.NETHERRACK)).generate(world, rand,position);
		}
		for (int i = 0; i < 2; i++)
		{
			//16x16 area up to y = 64
					int randPosX = chunkX + rand.nextInt(16);
			int randPosY = rand.nextInt(128);
			int randPosZ = chunkZ + rand.nextInt(16);
			// 10 blocks per vein
			BlockPos position = new BlockPos(randPosX, randPosY, randPosZ);
			//(new WorldGenMinable(RiderItems.hellrock_lockseedblock.getDefaultState(), 1)).generate(world, rand,position);

			new WorldGenMinable(RiderItems.bladecard_hellrock.getDefaultState(), 9, BlockMatcher.forBlock(Blocks.NETHERRACK)).generate(world, rand,position);
			
		}
		for (int i = 0; i < 2; i++)
		{
			//16x16 area up to y = 64
					int randPosX = chunkX + rand.nextInt(16);
			int randPosY = rand.nextInt(128);
			int randPosZ = chunkZ + rand.nextInt(16);
			// 10 blocks per vein
			BlockPos position = new BlockPos(randPosX, randPosY, randPosZ);
			//(new WorldGenMinable(RiderItems.hellrock_lockseedblock.getDefaultState(), 1)).generate(world, rand,position);

			new WorldGenMinable(RiderItems.hellwizardgemblock.getDefaultState(), 9, BlockMatcher.forBlock(Blocks.NETHERRACK)).generate(world, rand,position);
			
		}
		for (int i = 0; i < 2; i++)
		{
			//16x16 area up to y = 64
					int randPosX = chunkX + rand.nextInt(16);
			int randPosY = rand.nextInt(128);
			int randPosZ = chunkZ + rand.nextInt(16);
			// 10 blocks per vein
			BlockPos position = new BlockPos(randPosX, randPosY, randPosZ);
			//(new WorldGenMinable(RiderItems.hellrock_lockseedblock.getDefaultState(), 1)).generate(world, rand,position);

			new WorldGenMinable(RiderItems.hellimaginsandblock.getDefaultState(), 9, BlockMatcher.forBlock(Blocks.NETHERRACK)).generate(world, rand,position);
			
		}
		for (int i = 0; i < 2; i++)
		{
			//16x16 area up to y = 64
					int randPosX = chunkX + rand.nextInt(16);
			int randPosY = rand.nextInt(128);
			int randPosZ = chunkZ + rand.nextInt(16);
			// 10 blocks per vein
			BlockPos position = new BlockPos(randPosX, randPosY, randPosZ);
			//(new WorldGenMinable(RiderItems.hellrock_lockseedblock.getDefaultState(), 1)).generate(world, rand,position);

			new WorldGenMinable(RiderItems.fuestlehellrock.getDefaultState(), 9, BlockMatcher.forBlock(Blocks.NETHERRACK)).generate(world, rand,position);
			
		}
		for (int i = 0; i < 2; i++)
		{
			//16x16 area up to y = 64
					int randPosX = chunkX + rand.nextInt(16);
			int randPosY = rand.nextInt(128);
			int randPosZ = chunkZ + rand.nextInt(16);
			// 10 blocks per vein
			BlockPos position = new BlockPos(randPosX, randPosY, randPosZ);
			//(new WorldGenMinable(RiderItems.hellrock_lockseedblock.getDefaultState(), 1)).generate(world, rand,position);

			new WorldGenMinable(RiderItems.ghost_icons_hellrock.getDefaultState(), 9, BlockMatcher.forBlock(Blocks.NETHERRACK)).generate(world, rand,position);
			
		}
		for (int i = 0; i < 2; i++)
		{
			//16x16 area up to y = 64
					int randPosX = chunkX + rand.nextInt(16);
			int randPosY = rand.nextInt(128);
			int randPosZ = chunkZ + rand.nextInt(16);
			// 10 blocks per vein
			BlockPos position = new BlockPos(randPosX, randPosY, randPosZ);
			//(new WorldGenMinable(RiderItems.hellrock_lockseedblock.getDefaultState(), 1)).generate(world, rand,position);

			new WorldGenMinable(RiderItems.gaiamemoryhellrock.getDefaultState(), 9, BlockMatcher.forBlock(Blocks.NETHERRACK)).generate(world, rand,position);
			
		}
		for (int i = 0; i < 2; i++)
		{
			//16x16 area up to y = 64
					int randPosX = chunkX + rand.nextInt(16);
			int randPosY = rand.nextInt(128);
			int randPosZ = chunkZ + rand.nextInt(16);
			// 10 blocks per vein
			BlockPos position = new BlockPos(randPosX, randPosY, randPosZ);
			//(new WorldGenMinable(RiderItems.hellrock_lockseedblock.getDefaultState(), 1)).generate(world, rand,position);


			new WorldGenMinable(RiderItems.swichhellrock.getDefaultState(), 9, BlockMatcher.forBlock(Blocks.NETHERRACK)).generate(world, rand,position);
	}
		for (int i = 0; i < 4; i++)
		{
			//16x16 area up to y = 64
					int randPosX = chunkX + rand.nextInt(16);
			int randPosY = rand.nextInt(128);
			int randPosZ = chunkZ + rand.nextInt(16);
			// 10 blocks per vein
			BlockPos position = new BlockPos(randPosX, randPosY, randPosZ);
			//(new WorldGenMinable(RiderItems.hellrock_lockseedblock.getDefaultState(), 1)).generate(world, rand,position);

			new WorldGenMinable(RiderItems.ooo_hellrock.getDefaultState(), 9, BlockMatcher.forBlock(Blocks.NETHERRACK)).generate(world, rand,position);
	}	
	/**	for (int i = 0; i < 2; i++)
		{
			//16x16 area up to y = 64
			int randPosX = chunkX + rand.nextInt(16);
			int randPosY = rand.nextInt(128);
			int randPosZ = chunkZ + rand.nextInt(16);
			// 10 blocks per vein
			BlockPos position = new BlockPos(randPosX, randPosY, randPosZ);
			//(new WorldGenMinable(RiderItems.hellrock_lockseedblock.getDefaultState(), 1)).generate(world, rand,position);

			new WorldGenMinable(RiderItems.pandora_box_hellrock.getDefaultState(), 9, BlockMatcher.forBlock(Blocks.NETHERRACK)).generate(world, rand,position);
}
		for (int i = 0; i < 2; i++)
		{
			//16x16 area up to y = 64
			int randPosX = chunkX + rand.nextInt(16);
			int randPosY = rand.nextInt(128);
			int randPosZ = chunkZ + rand.nextInt(16);
			// 10 blocks per vein
			BlockPos position = new BlockPos(randPosX, randPosY, randPosZ);
			//(new WorldGenMinable(RiderItems.hellrock_lockseedblock.getDefaultState(), 1)).generate(world, rand,position);

			new WorldGenMinable(RiderItems.pandora_box_hellrock_2.getDefaultState(), 9, BlockMatcher.forBlock(Blocks.NETHERRACK)).generate(world, rand,position);
}
	 **/
		for (int i = 0; i < 2; i++)
		{
			//16x16 area up to y = 64
					int randPosX = chunkX + rand.nextInt(16);
			int randPosY = rand.nextInt(128);
			int randPosZ = chunkZ + rand.nextInt(16);
			// 10 blocks per vein
			BlockPos position = new BlockPos(randPosX, randPosY, randPosZ);
			//(new WorldGenMinable(RiderItems.hellrock_lockseedblock.getDefaultState(), 1)).generate(world, rand,position);

			new WorldGenMinable(RiderItems.card_hellrock.getDefaultState(), 9, BlockMatcher.forBlock(Blocks.NETHERRACK)).generate(world, rand,position);
	}	
	
		}	

	public void generateSurface(World world, Random rand, int chunkX, int chunkZ)
	{

		for (int i = 0; i < 4; i++)
		{
			//16x16 area up to y = 64
			int randPosX = chunkX + rand.nextInt(16);
			int randPosY = rand.nextInt(60);
			int randPosZ = chunkZ + rand.nextInt(16);
			// 10 blocks per vein
			BlockPos position = new BlockPos(randPosX, randPosY, randPosZ);
			(new WorldGenMinable(RiderItems.cellmedalblock.getDefaultState(), 10)).generate(world, rand,position);
		}for (int i = 0; i < 4; i++)
		{
			//16x16 area up to y = 64
			int randPosX = chunkX + rand.nextInt(16);
			int randPosY = rand.nextInt(60);
			int randPosZ = chunkZ + rand.nextInt(16);
			// 10 blocks per vein
			BlockPos position = new BlockPos(randPosX, randPosY, randPosZ);
			(new WorldGenMinable(RiderItems.oni_ore_block.getDefaultState(), 10)).generate(world, rand,position);
		}	for (int i = 0; i < 4; i++)
		{
			//16x16 area up to y = 64
			int randPosX = chunkX + rand.nextInt(16);
			int randPosY = rand.nextInt(60);
			int randPosZ = chunkZ + rand.nextInt(16);
			// 10 blocks per vein
			BlockPos position = new BlockPos(randPosX, randPosY, randPosZ);
			(new WorldGenMinable(RiderItems.card_stone.getDefaultState(), 10)).generate(world, rand,position);
		}  for (int i = 0; i < 4; i++)
		{
			//16x16 area up to y = 64
			int randPosX = chunkX + rand.nextInt(16);
			int randPosY = rand.nextInt(60);
			int randPosZ = chunkZ + rand.nextInt(16);
			// 10 blocks per vein
			BlockPos position = new BlockPos(randPosX, randPosY, randPosZ);
			(new WorldGenMinable(RiderItems.stone_kuuga.getDefaultState(), 10)).generate(world, rand,position);
		}
	/**	for (int i = 0; i < 4; i++)
		{
			//16x16 area up to y = 64
			int randPosX = chunkX + rand.nextInt(16);
			int randPosY = rand.nextInt(60);
			int randPosZ = chunkZ + rand.nextInt(16);
			// 10 blocks per vein
			BlockPos position = new BlockPos(randPosX, randPosY, randPosZ);
			(new WorldGenMinable(RiderItems.pandora_box.getDefaultState(), 10)).generate(world, rand,position);
		}
		**/
		for (int i = 0; i < 4; i++)
		{
			//16x16 area up to y = 64
			int randPosX = chunkX + rand.nextInt(16);
			int randPosY = rand.nextInt(60);
			int randPosZ = chunkZ + rand.nextInt(16);
			// 10 blocks per vein
			BlockPos position = new BlockPos(randPosX, randPosY, randPosZ);
			(new WorldGenMinable(RiderItems.zectblock.getDefaultState(), 10)).generate(world, rand,position);
		}
		for (int i = 0; i < 4; i++)
		{
			//16x16 area up to y = 64
			int randPosX = chunkX + rand.nextInt(16);
			int randPosY = rand.nextInt(60);
			int randPosZ = chunkZ + rand.nextInt(16);
			// 10 blocks per vein
			BlockPos position = new BlockPos(randPosX, randPosY, randPosZ);
			(new WorldGenMinable(RiderItems.astroswitchblock.getDefaultState(), 10)).generate(world, rand,position);
		}for (int i = 0; i < 4; i++)
		{
			//16x16 area up to y = 64
			int randPosX = chunkX + rand.nextInt(16);
			int randPosY = rand.nextInt(60);
			int randPosZ = chunkZ + rand.nextInt(16);
			// 10 blocks per vein
			BlockPos position = new BlockPos(randPosX, randPosY, randPosZ);
			(new WorldGenMinable(RiderItems.stone_agito.getDefaultState(), 10)).generate(world, rand,position);
		}for (int i = 0; i < 4; i++)
		{
			//16x16 area up to y = 64
			int randPosX = chunkX + rand.nextInt(16);
			int randPosY = rand.nextInt(60);
			int randPosZ = chunkZ + rand.nextInt(16);
			// 10 blocks per vein
			BlockPos position = new BlockPos(randPosX, randPosY, randPosZ);
			(new WorldGenMinable(RiderItems.advent_glass.getDefaultState(), 10)).generate(world, rand,position);
		}
		for (int i = 0; i < 4; i++)
		{
			//16x16 area up to y = 64
			int randPosX = chunkX + rand.nextInt(16);
			int randPosY = rand.nextInt(60);
			int randPosZ = chunkZ + rand.nextInt(16);
			// 10 blocks per vein
			BlockPos position = new BlockPos(randPosX, randPosY, randPosZ);
			(new WorldGenMinable(RiderItems.wizardgemblock.getDefaultState(), 10)).generate(world, rand,position);
		} for (int i = 0; i < 4; i++)
		{
			//16x16 area up to y = 64
			int randPosX = chunkX + rand.nextInt(16);
			int randPosY = rand.nextInt(60);
			int randPosZ = chunkZ + rand.nextInt(16);
			// 10 blocks per vein
			BlockPos position = new BlockPos(randPosX, randPosY, randPosZ);
			(new WorldGenMinable(RiderItems.himawari_lockseedblock.getDefaultState(), 10)).generate(world, rand,position);
		}for (int i = 0; i < 4; i++)
		{
			//16x16 area up to y = 64
			int randPosX = chunkX + rand.nextInt(16);
			int randPosY = rand.nextInt(60);
			int randPosZ = chunkZ + rand.nextInt(16);
			// 10 blocks per vein
			BlockPos position = new BlockPos(randPosX, randPosY, randPosZ);
			(new WorldGenMinable(RiderItems.ghost_iconsblock.getDefaultState(), 10)).generate(world, rand,position);
		}for (int i = 0; i < 4; i++)
		{
			//16x16 area up to y = 64
			int randPosX = chunkX + rand.nextInt(16);
			int randPosY = rand.nextInt(60);
			int randPosZ = chunkZ + rand.nextInt(16);
			// 10 blocks per vein
			BlockPos position = new BlockPos(randPosX, randPosY, randPosZ);
			(new WorldGenMinable(RiderItems.bladecard_block.getDefaultState(), 10)).generate(world, rand,position);
		}for (int i = 0; i < 4; i++)
		{
			//16x16 area up to y = 64
			int randPosX = chunkX + rand.nextInt(16);
			int randPosY = rand.nextInt(60);
			int randPosZ = chunkZ + rand.nextInt(16);
			// 10 blocks per vein
			BlockPos position = new BlockPos(randPosX, randPosY, randPosZ);
			(new WorldGenMinable(RiderItems.fuestleblock.getDefaultState(), 10)).generate(world, rand,position);
		}for (int i = 0; i < 4; i++)
		{
			//16x16 area up to y = 64
			int randPosX = chunkX + rand.nextInt(16);
			int randPosY = rand.nextInt(60);
			int randPosZ = chunkZ + rand.nextInt(16);
			// 10 blocks per vein
			BlockPos position = new BlockPos(randPosX, randPosY, randPosZ);
			(new WorldGenMinable(RiderItems.gaiamemoryblock.getDefaultState(), 10)).generate(world, rand,position);
		}for (int i = 0; i < 4; i++)
		{
			//16x16 area up to y = 64
			int randPosX = chunkX + rand.nextInt(16);
			int randPosY = rand.nextInt(60);
			int randPosZ = chunkZ + rand.nextInt(16);
			// 10 blocks per vein
			BlockPos position = new BlockPos(randPosX, randPosY, randPosZ);
			(new WorldGenMinable(RiderItems.imaginsandblock.getDefaultState(), 10)).generate(world, rand,position);
		}for (int i = 0; i < 4; i++)
		{
			//16x16 area up to y = 64
			int randPosX = chunkX + rand.nextInt(16);
			int randPosY = rand.nextInt(60);
			int randPosZ = chunkZ + rand.nextInt(16);
			// 10 blocks per vein
			BlockPos position = new BlockPos(randPosX, randPosY, randPosZ);
			(new WorldGenMinable(RiderItems.mission_memory_block.getDefaultState(), 10)).generate(world, rand,position);
		}
		for (int i = 0; i < 4; i++)
		{
			//16x16 area up to y = 64
			int randPosX = chunkX + rand.nextInt(16);
			int randPosY = rand.nextInt(60);
			int randPosZ = chunkZ + rand.nextInt(16);
			// 10 blocks per vein
			BlockPos position = new BlockPos(randPosX, randPosY, randPosZ);
			(new WorldGenMinable(RiderItems.drive_stone.getDefaultState(), 10)).generate(world, rand,position);
		}
		for (int i = 0; i < 4; i++)
		{
			//16x16 area up to y = 64
			int randPosX = chunkX + rand.nextInt(16);
			int randPosY = rand.nextInt(60);
			int randPosZ = chunkZ + rand.nextInt(16);
			// 10 blocks per vein
			BlockPos position = new BlockPos(randPosX, randPosY, randPosZ);
			(new WorldGenMinable(RiderItems.bugsters_stone.getDefaultState(), 10)).generate(world, rand,position);
		}
		for (int i = 0; i < 4; i++)
		{
			//16x16 area up to y = 64
			int randPosX = chunkX + rand.nextInt(16);
			int randPosY = rand.nextInt(60);
			int randPosZ = chunkZ + rand.nextInt(16);
			// 10 blocks per vein
			BlockPos position = new BlockPos(randPosX, randPosY, randPosZ);
			(new WorldGenMinable(RiderItems.amazon_cell_block.getDefaultState(), 10)).generate(world, rand,position);
		}
		for (int i = 0; i < 4; i++)
		{
			//16x16 area up to y = 64
			int randPosX = chunkX + rand.nextInt(16);
			int randPosY = rand.nextInt(60);
			int randPosZ = chunkZ + rand.nextInt(16);
			// 10 blocks per vein
			BlockPos position = new BlockPos(randPosX, randPosY, randPosZ);
			(new WorldGenMinable(RiderItems.watch_stone.getDefaultState(), 10)).generate(world, rand,position);
		}

	}

	public void generateEnd()
	{
	}

	
}
