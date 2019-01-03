package KamenRiderCraftV3;

import java.util.Random;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;

public class oreworldgen implements IWorldGenerator
{
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world,
			IChunkProvider chunkGenerator, IChunkProvider chunkProvider)
	{
		switch (world.provider.getDimensionId())
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


		for (int i = 0; i < 10; i++)
		{
			//16x16 area up to y = 64
					int randPosX = chunkX + rand.nextInt(16);
			int randPosY = rand.nextInt(60);
			int randPosZ = chunkZ + rand.nextInt(16);
			// 10 blocks per vein
			BlockPos position = new BlockPos(randPosX, randPosY, randPosZ);
			//(new WorldGenMinable(RiderItems.hellrock_lockseedblock.getDefaultState(), 1)).generate(world, rand,position);

			if (world.getBlockState(position).getBlock().getMaterial() != Material.air&world.getBlockState(position).getBlock().getMaterial() != Material.lava)
			{
				world.setBlockState(position, RiderItems.gemdeus_stone.getDefaultState(), 2);
		} 
			}
		
			for (int i = 0; i < 10; i++)
			{
				//16x16 area up to y = 64
						int randPosX = chunkX + rand.nextInt(16);
				int randPosY = rand.nextInt(60);
				int randPosZ = chunkZ + rand.nextInt(16);
				// 10 blocks per vein
				BlockPos position = new BlockPos(randPosX, randPosY, randPosZ);
				//(new WorldGenMinable(RiderItems.hellrock_lockseedblock.getDefaultState(), 1)).generate(world, rand,position);

				if (world.getBlockState(position).getBlock().getMaterial() != Material.air&world.getBlockState(position).getBlock().getMaterial() != Material.lava)
				{
					world.setBlockState(position, RiderItems.neozecthellrock.getDefaultState(), 2);
			}	
		}

		for (int i = 0; i < 10; i++)
		{
			//16x16 area up to y = 64
					int randPosX = chunkX + rand.nextInt(16);
			int randPosY = rand.nextInt(60);
			int randPosZ = chunkZ + rand.nextInt(16);
			// 10 blocks per vein
			BlockPos position = new BlockPos(randPosX, randPosY, randPosZ);
			//(new WorldGenMinable(RiderItems.hellrock_lockseedblock.getDefaultState(), 1)).generate(world, rand,position);

			if (world.getBlockState(position).getBlock().getMaterial() != Material.air&world.getBlockState(position).getBlock().getMaterial() != Material.lava)
			{
				world.setBlockState(position, RiderItems.hellrock_drive.getDefaultState(), 2);
		} 
		}

		for (int i = 0; i < 10; i++)
		{
			//16x16 area up to y = 64
					int randPosX = chunkX + rand.nextInt(16);
			int randPosY = rand.nextInt(60);
			int randPosZ = chunkZ + rand.nextInt(16);
			// 10 blocks per vein
			BlockPos position = new BlockPos(randPosX, randPosY, randPosZ);
			//(new WorldGenMinable(RiderItems.hellrock_lockseedblock.getDefaultState(), 1)).generate(world, rand,position);

			if (world.getBlockState(position).getBlock().getMaterial() != Material.air&world.getBlockState(position).getBlock().getMaterial() != Material.lava)
			{
				world.setBlockState(position, RiderItems.hellrock_agito.getDefaultState(), 2);
		} 
			
		}
		for (int i = 0; i < 10; i++)
		{
			//16x16 area up to y = 64
					int randPosX = chunkX + rand.nextInt(16);
			int randPosY = rand.nextInt(60);
			int randPosZ = chunkZ + rand.nextInt(16);
			// 10 blocks per vein
			BlockPos position = new BlockPos(randPosX, randPosY, randPosZ);
			//(new WorldGenMinable(RiderItems.hellrock_lockseedblock.getDefaultState(), 1)).generate(world, rand,position);

			if (world.getBlockState(position).getBlock().getMaterial() != Material.air&world.getBlockState(position).getBlock().getMaterial() != Material.lava)
			{
				world.setBlockState(position, RiderItems.hellrock_lockseedblock.getDefaultState(), 2);
		} 
			
		}
		for (int i = 0; i < 10; i++)
		{
			//16x16 area up to y = 64
					int randPosX = chunkX + rand.nextInt(16);
			int randPosY = rand.nextInt(60);
			int randPosZ = chunkZ + rand.nextInt(16);
			// 10 blocks per vein
			BlockPos position = new BlockPos(randPosX, randPosY, randPosZ);
			//(new WorldGenMinable(RiderItems.hellrock_lockseedblock.getDefaultState(), 1)).generate(world, rand,position);

			if (world.getBlockState(position).getBlock().getMaterial() != Material.air&world.getBlockState(position).getBlock().getMaterial() != Material.lava)
			{
				world.setBlockState(position, RiderItems.oni_ore_hellrock.getDefaultState(), 2);
		} 
			
		}
		for (int i = 0; i < 10; i++)
		{
			//16x16 area up to y = 64
					int randPosX = chunkX + rand.nextInt(16);
			int randPosY = rand.nextInt(60);
			int randPosZ = chunkZ + rand.nextInt(16);
			// 10 blocks per vein
			BlockPos position = new BlockPos(randPosX, randPosY, randPosZ);
			//(new WorldGenMinable(RiderItems.hellrock_lockseedblock.getDefaultState(), 1)).generate(world, rand,position);

			if (world.getBlockState(position).getBlock().getMaterial() != Material.air&world.getBlockState(position).getBlock().getMaterial() != Material.lava)
			{
				world.setBlockState(position, RiderItems.hell_advent_glass.getDefaultState(), 2);
		} 
			
		}
		for (int i = 0; i < 10; i++)
		{
			//16x16 area up to y = 64
					int randPosX = chunkX + rand.nextInt(16);
			int randPosY = rand.nextInt(60);
			int randPosZ = chunkZ + rand.nextInt(16);
			// 10 blocks per vein
			BlockPos position = new BlockPos(randPosX, randPosY, randPosZ);
			//(new WorldGenMinable(RiderItems.hellrock_lockseedblock.getDefaultState(), 1)).generate(world, rand,position);

			if (world.getBlockState(position).getBlock().getMaterial() != Material.air&world.getBlockState(position).getBlock().getMaterial() != Material.lava)
			{
				world.setBlockState(position, RiderItems.bladecard_hellrock.getDefaultState(), 2);
		} 
			
		}
		for (int i = 0; i < 10; i++)
		{
			//16x16 area up to y = 64
					int randPosX = chunkX + rand.nextInt(16);
			int randPosY = rand.nextInt(60);
			int randPosZ = chunkZ + rand.nextInt(16);
			// 10 blocks per vein
			BlockPos position = new BlockPos(randPosX, randPosY, randPosZ);
			//(new WorldGenMinable(RiderItems.hellrock_lockseedblock.getDefaultState(), 1)).generate(world, rand,position);

			if (world.getBlockState(position).getBlock().getMaterial() != Material.air&world.getBlockState(position).getBlock().getMaterial() != Material.lava)
			{
				world.setBlockState(position, RiderItems.hellwizardgemblock.getDefaultState(), 2);
		} 
			
		}
		for (int i = 0; i < 10; i++)
		{
			//16x16 area up to y = 64
					int randPosX = chunkX + rand.nextInt(16);
			int randPosY = rand.nextInt(60);
			int randPosZ = chunkZ + rand.nextInt(16);
			// 10 blocks per vein
			BlockPos position = new BlockPos(randPosX, randPosY, randPosZ);
			//(new WorldGenMinable(RiderItems.hellrock_lockseedblock.getDefaultState(), 1)).generate(world, rand,position);

			if (world.getBlockState(position).getBlock().getMaterial() != Material.air&world.getBlockState(position).getBlock().getMaterial() != Material.lava)
			{
				world.setBlockState(position, RiderItems.hellimaginsandblock.getDefaultState(), 2);
		} 
			
		}
		for (int i = 0; i < 10; i++)
		{
			//16x16 area up to y = 64
					int randPosX = chunkX + rand.nextInt(16);
			int randPosY = rand.nextInt(60);
			int randPosZ = chunkZ + rand.nextInt(16);
			// 10 blocks per vein
			BlockPos position = new BlockPos(randPosX, randPosY, randPosZ);
			//(new WorldGenMinable(RiderItems.hellrock_lockseedblock.getDefaultState(), 1)).generate(world, rand,position);

			if (world.getBlockState(position).getBlock().getMaterial() != Material.air&world.getBlockState(position).getBlock().getMaterial() != Material.lava)
			{
				world.setBlockState(position, RiderItems.fuestlehellrock.getDefaultState(), 2);
		}
			
		}
		for (int i = 0; i < 10; i++)
		{
			//16x16 area up to y = 64
					int randPosX = chunkX + rand.nextInt(16);
			int randPosY = rand.nextInt(60);
			int randPosZ = chunkZ + rand.nextInt(16);
			// 10 blocks per vein
			BlockPos position = new BlockPos(randPosX, randPosY, randPosZ);
			//(new WorldGenMinable(RiderItems.hellrock_lockseedblock.getDefaultState(), 1)).generate(world, rand,position);

			if (world.getBlockState(position).getBlock().getMaterial() != Material.air&world.getBlockState(position).getBlock().getMaterial() != Material.lava)
			{
				world.setBlockState(position, RiderItems.ghost_Icons_hellrock.getDefaultState(), 2);
		} 
			
		}
		for (int i = 0; i < 10; i++)
		{
			//16x16 area up to y = 64
					int randPosX = chunkX + rand.nextInt(16);
			int randPosY = rand.nextInt(60);
			int randPosZ = chunkZ + rand.nextInt(16);
			// 10 blocks per vein
			BlockPos position = new BlockPos(randPosX, randPosY, randPosZ);
			//(new WorldGenMinable(RiderItems.hellrock_lockseedblock.getDefaultState(), 1)).generate(world, rand,position);

			if (world.getBlockState(position).getBlock().getMaterial() != Material.air&world.getBlockState(position).getBlock().getMaterial() != Material.lava)
			{
				world.setBlockState(position, RiderItems.gaiamemoryhellrock.getDefaultState(), 2);
		} 
			
		}
		for (int i = 0; i < 10; i++)
		{
			//16x16 area up to y = 64
					int randPosX = chunkX + rand.nextInt(16);
			int randPosY = rand.nextInt(60);
			int randPosZ = chunkZ + rand.nextInt(16);
			// 10 blocks per vein
			BlockPos position = new BlockPos(randPosX, randPosY, randPosZ);
			//(new WorldGenMinable(RiderItems.hellrock_lockseedblock.getDefaultState(), 1)).generate(world, rand,position);

			if (world.getBlockState(position).getBlock().getMaterial() != Material.air&world.getBlockState(position).getBlock().getMaterial() != Material.lava)
			{
				world.setBlockState(position, RiderItems.swichhellrock.getDefaultState(), 2);
		}	
	}
		for (int i = 0; i < 10; i++)
		{
			//16x16 area up to y = 64
					int randPosX = chunkX + rand.nextInt(16);
			int randPosY = rand.nextInt(60);
			int randPosZ = chunkZ + rand.nextInt(16);
			// 10 blocks per vein
			BlockPos position = new BlockPos(randPosX, randPosY, randPosZ);
			//(new WorldGenMinable(RiderItems.hellrock_lockseedblock.getDefaultState(), 1)).generate(world, rand,position);

			if (world.getBlockState(position).getBlock().getMaterial() != Material.air&world.getBlockState(position).getBlock().getMaterial() != Material.lava)
			{
				world.setBlockState(position, RiderItems.ooo_hellrock.getDefaultState(), 2);
		}	
	}	
		for (int i = 0; i < 10; i++)
		{
			//16x16 area up to y = 64
			int randPosX = chunkX + rand.nextInt(16);
			int randPosY = rand.nextInt(60);
			int randPosZ = chunkZ + rand.nextInt(16);
			// 10 blocks per vein
			BlockPos position = new BlockPos(randPosX, randPosY, randPosZ);
			//(new WorldGenMinable(RiderItems.hellrock_lockseedblock.getDefaultState(), 1)).generate(world, rand,position);

			if (world.getBlockState(position).getBlock().getMaterial() != Material.air&world.getBlockState(position).getBlock().getMaterial() != Material.lava)
			{
				world.setBlockState(position, RiderItems.pandora_box_hellrock.getDefaultState(), 2);
	} 
}
		for (int i = 0; i < 10; i++)
		{
			//16x16 area up to y = 64
			int randPosX = chunkX + rand.nextInt(16);
			int randPosY = rand.nextInt(60);
			int randPosZ = chunkZ + rand.nextInt(16);
			// 10 blocks per vein
			BlockPos position = new BlockPos(randPosX, randPosY, randPosZ);
			//(new WorldGenMinable(RiderItems.hellrock_lockseedblock.getDefaultState(), 1)).generate(world, rand,position);

			if (world.getBlockState(position).getBlock().getMaterial() != Material.air&world.getBlockState(position).getBlock().getMaterial() != Material.lava)
			{
				world.setBlockState(position, RiderItems.pandora_box_hellrock_2.getDefaultState(), 2);
	} 
}
		for (int i = 0; i < 10; i++)
		{
			//16x16 area up to y = 64
					int randPosX = chunkX + rand.nextInt(16);
			int randPosY = rand.nextInt(60);
			int randPosZ = chunkZ + rand.nextInt(16);
			// 10 blocks per vein
			BlockPos position = new BlockPos(randPosX, randPosY, randPosZ);
			//(new WorldGenMinable(RiderItems.hellrock_lockseedblock.getDefaultState(), 1)).generate(world, rand,position);

			if (world.getBlockState(position).getBlock().getMaterial() != Material.air&world.getBlockState(position).getBlock().getMaterial() != Material.lava)
			{
				world.setBlockState(position, RiderItems.card_hellrock.getDefaultState(), 2);
		}	
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
		for (int i = 0; i < 4; i++)
		{
			//16x16 area up to y = 64
			int randPosX = chunkX + rand.nextInt(16);
			int randPosY = rand.nextInt(60);
			int randPosZ = chunkZ + rand.nextInt(16);
			// 10 blocks per vein
			BlockPos position = new BlockPos(randPosX, randPosY, randPosZ);
			(new WorldGenMinable(RiderItems.pandora_box.getDefaultState(), 10)).generate(world, rand,position);
		}
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
			(new WorldGenMinable(RiderItems.ghost_Iconsblock.getDefaultState(), 10)).generate(world, rand,position);
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

	}

	public void generateEnd()
	{
	}
}
