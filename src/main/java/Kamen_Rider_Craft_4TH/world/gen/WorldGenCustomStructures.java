package Kamen_Rider_Craft_4TH.world.gen;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import Kamen_Rider_Craft_4TH.RiderItems;
import Kamen_Rider_Craft_4TH.biome.biomeHelheim;
import Kamen_Rider_Craft_4TH.biome.biomeSandOfTime;
import Kamen_Rider_Craft_4TH.biome.biome_northern_base;
import Kamen_Rider_Craft_4TH.biome.biome_rabbit_hutch;
import Kamen_Rider_Craft_4TH.world.gen.generators.WorldGenStructure;
import com.google.common.collect.Lists;
import net.minecraft.block.Block;
import net.minecraft.block.BlockFire;
import net.minecraft.init.Blocks;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.WorldType;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeDesert;
import net.minecraft.world.biome.BiomeForest;
import net.minecraft.world.biome.BiomeHell;
import net.minecraft.world.biome.BiomeHellDecorator;
import net.minecraft.world.biome.BiomeHills;
import net.minecraft.world.biome.BiomeJungle;
import net.minecraft.world.biome.BiomeMesa;
import net.minecraft.world.biome.BiomePlains;
import net.minecraft.world.biome.BiomeSavanna;
import net.minecraft.world.biome.BiomeSwamp;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;
import scala.actors.threadpool.Arrays;
import scala.collection.mutable.ArrayStack;

public class WorldGenCustomStructures implements IWorldGenerator
{

	public static final WorldGenStructure HELHEIM_CRACK = new WorldGenStructure("helheim_crack");
	
	public static final WorldGenStructure ROGUE_BASE = new WorldGenStructure("rogue_base");
	public static final WorldGenStructure PANDORA_TOWER = new WorldGenStructure("pandora_tower");
	public static final WorldGenStructure BUILD_WAREHOUSE = new WorldGenStructure("build_warehouse");
	
	public static final WorldGenStructure GINGA = new WorldGenStructure("ginga");
	
	public static final WorldGenStructure yggdrasill_base = new WorldGenStructure("yggdrasill_base");
	public static final WorldGenStructure rosyuo_helheim_city = new WorldGenStructure("rosyuo_helheim_city");
	public static final WorldGenStructure demushu_helheim_city = new WorldGenStructure("demushu_helheim_city");
	public static final WorldGenStructure redyue_helheim_city = new WorldGenStructure("redyue_helheim_city");
	
	public static final WorldGenStructure denliner = new WorldGenStructure("denliner");
	public static final WorldGenStructure denliner_ikazuchi = new WorldGenStructure("denliner_ikazuchi");
	public static final WorldGenStructure denliner_isurugi = new WorldGenStructure("denliner_isurugi");
	public static final WorldGenStructure denliner_rekkou = new WorldGenStructure("denliner_rekkou");
	public static final WorldGenStructure newdenliner = new WorldGenStructure("newdenliner");
	public static final WorldGenStructure nega_denliner = new WorldGenStructure("nega_denliner");

	public static final WorldGenStructure gaoh_liner = new WorldGenStructure("gaoh_liner");
	public static final WorldGenStructure kingliner = new WorldGenStructure("kingliner");
	public static final WorldGenStructure zeroliner = new WorldGenStructure("zeroliner");
	
	public static final WorldGenStructure day_brake_town = new WorldGenStructure("day_brake_town");
	
	public static final WorldGenStructure mighty_action_x = new WorldGenStructure("mighty_action_x");
	public static final WorldGenStructure taddle_quest = new WorldGenStructure("taddle_quest");
	public static final WorldGenStructure bang_bang_shooting = new WorldGenStructure("bang_bang_shooting");
	public static final WorldGenStructure bakusou_bike = new WorldGenStructure("bakusou_bike");
	
	public static final WorldGenStructure northern_base = new WorldGenStructure("northern_base");
	
	public static final WorldGenStructure rabbit_hutch = new WorldGenStructure("rabbit_hutch");

	public static final WorldGenStructure core_boss_structuer = new WorldGenStructure("core_boss_structuer");
	public static final WorldGenStructure BURAKAWANI = new WorldGenStructure("burakawani");
	

	public static final WorldGenStructure M_BUS = new WorldGenStructure("m_bus");
	
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
		switch(world.provider.getDimension()) {
			case 1:
				break;
			case 0:
				generateStructure(ROGUE_BASE, world, random, chunkX, chunkZ,11, 1000, Blocks.DIRT, BiomePlains.class,BiomeSavanna.class,BiomeForest.class,BiomeHills.class);
				generateStructure(PANDORA_TOWER, world, random, chunkX, chunkZ,-1, 1500, Blocks.DIRT, BiomePlains.class,BiomeSavanna.class,BiomeForest.class,BiomeHills.class);
				generateStructure(HELHEIM_CRACK, world, random, chunkX, chunkZ,-1, 500, Blocks.DIRT, BiomePlains.class,BiomeMesa.class,BiomeForest.class,BiomeJungle.class);
				generateStructure(day_brake_town, world, random, chunkX, chunkZ,5, 1000, Blocks.DIRT, BiomePlains.class,BiomeSavanna.class,BiomeForest.class,BiomeSwamp.class);
				generateStructure(mighty_action_x, world, random, chunkX, chunkZ,-1, 1000, Blocks.SAND, BiomeDesert.class);
				generateStructure(taddle_quest, world, random, chunkX, chunkZ,-1, 1000, Blocks.DIRT, BiomeSavanna.class);
				generateStructure(bang_bang_shooting, world, random, chunkX, chunkZ,-1, 1000, Blocks.DIRT, BiomeForest.class);
				generateStructure(bakusou_bike, world, random, chunkX, chunkZ,-1, 1000, Blocks.DIRT, BiomePlains.class);
				
				generateStructureFlames(GINGA, world, random, chunkX, chunkZ,1, 800, Blocks.STONE, BiomeHills.class);
				
				generateStructure(BURAKAWANI, world, random, chunkX, chunkZ,-1, 800, Blocks.DIRT, BiomeForest.class, BiomePlains.class);
				
				
				break;
			case -1:
				generateStructure(core_boss_structuer, world, random, chunkX, chunkZ, random.nextInt(15)+60, 190, Blocks.NETHERRACK, BiomeHell.class);
				generateStructure(BUILD_WAREHOUSE, world, random, chunkX, chunkZ, 88, 250, Blocks.NETHERRACK, BiomeHell.class);
				
		}
		if (modDimensionWorldGen.HELHEIM_DIM_ID==world.provider.getDimension()){
			generateStructure(yggdrasill_base, world, random, chunkX, chunkZ,-1, 500, Blocks.DIRT,biomeHelheim.class);

			generateStructure(rosyuo_helheim_city, world, random, chunkX, chunkZ,-1, 1000, Blocks.DIRT,biomeHelheim.class);
			generateStructure(demushu_helheim_city, world, random, chunkX, chunkZ,7, 700, Blocks.DIRT,biomeHelheim.class);
			generateStructure(redyue_helheim_city, world, random, chunkX, chunkZ,0, 700, Blocks.DIRT,biomeHelheim.class);
			
		}else 	if (modDimensionWorldGen.NORTHERN_BASE_DIM_ID==world.provider.getDimension()){

			
			if (world.getChunk(new BlockPos(world.getSpawnPoint().getX(),world.getSpawnPoint().getY(),world.getSpawnPoint().getZ()))==world.getChunk(chunkX, chunkZ)){
			MustGenerateStructure(northern_base, world, random, chunkX, chunkZ,-2, 700, Blocks.ICE,biome_northern_base.class);
			}
		}else 	if (modDimensionWorldGen.RABBIT_HUTCH_DIM_ID==world.provider.getDimension()){

			if (world.getChunk(new BlockPos(world.getSpawnPoint().getX(),world.getSpawnPoint().getY(),world.getSpawnPoint().getZ()))==world.getChunk(chunkX, chunkZ)){
			MustGenerateStructure(rabbit_hutch, world, random, chunkX, chunkZ,-2, 700, Blocks.STONE,biome_rabbit_hutch.class);
			}
			
			generateStructure(M_BUS, world, random, chunkX, chunkZ,-35, 350, Blocks.STONE,biome_rabbit_hutch.class);
			
			
		}else if (modDimensionWorldGen.SANDSOFTIME_DIM_ID==world.provider.getDimension()){
			generateStructureWM(denliner, world, random, chunkX, chunkZ,0, 300, RiderItems.imaginsandblock,biomeSandOfTime.class);
			
			generateStructureWM(denliner_ikazuchi, world, random, chunkX, chunkZ,0, 700, RiderItems.imaginsandblock,biomeSandOfTime.class);
			generateStructureWM(denliner_isurugi, world, random, chunkX, chunkZ,0, 700, RiderItems.imaginsandblock,biomeSandOfTime.class);
			generateStructure(denliner_rekkou, world, random, chunkX, chunkZ,0, 700, RiderItems.imaginsandblock,biomeSandOfTime.class);

			generateStructureWM(newdenliner, world, random, chunkX, chunkZ,0, 3500, RiderItems.imaginsandblock,biomeSandOfTime.class);
			generateStructureWM(nega_denliner, world, random, chunkX, chunkZ,0, 5000, RiderItems.imaginsandblock,biomeSandOfTime.class);
			
			generateStructureWM(gaoh_liner, world, random, chunkX, chunkZ,0, 2000, RiderItems.imaginsandblock,biomeSandOfTime.class);
			generateStructureWM(kingliner, world, random, chunkX, chunkZ,0, 3500, RiderItems.imaginsandblock,biomeSandOfTime.class);

			generateStructureWM(zeroliner, world, random, chunkX, chunkZ,0, 1000, RiderItems.imaginsandblock,biomeSandOfTime.class);
			}
			
	}
	
	
	public static void generateStructureFlames(WorldGenerator generator, World world, Random random, int chunkX, int chunkZ, int PosY, int chance, Block topBlock,Class<? extends Biome>... classes) {
		List<Class<? extends Biome>> classesList = Lists.newArrayList(classes);
		int x = (chunkX * 16+ random.nextInt(15));
		int z = (chunkZ * 16+ random.nextInt(15));
		int y = calculateGenerationHeight(world, x, z, topBlock);
		BlockPos pos = new BlockPos (x,y - PosY ,z);
		
		Class<? extends Biome> biome = world.provider.getBiomeForCoords(pos).getClass();
		
		if(world.getWorldType() != WorldType.FLAT) {
			if(classesList.contains(biome)) {

				if(random.nextInt(chance) == 0) {

					generator.generate(world, random, pos);
					
					for (int x2 = 0; x2 < 9; x2++)
					{for (int z2 = 0; z2 < 9; z2++)
					{
						addFire(world, x-4+x2, z-4+z2);
					}
					}
				}
			}
		}
	}
	

	
	public static void generateStructure(WorldGenerator generator, World world, Random random, int chunkX, int chunkZ, int PosY, int chance, Block topBlock,Class<? extends Biome>... classes) {
		List<Class<? extends Biome>> classesList = Lists.newArrayList(classes);
		int x = (chunkX * 16+ random.nextInt(15));
		int z = (chunkZ * 16+ random.nextInt(15));
		int y = calculateGenerationHeight(world, x, z, topBlock);
		BlockPos pos = new BlockPos (x,y - PosY ,z);
		
		Class<? extends Biome> biome = world.provider.getBiomeForCoords(pos).getClass();
		
		if(world.getWorldType() != WorldType.FLAT) {
			if(classesList.contains(biome)) {
				if(random.nextInt(chance) == 0) {
					generator.generate(world, random, pos);
				}
			}
		}
	}
	
	public static void MustGenerateStructure(WorldGenerator generator, World world, Random random, int chunkX, int chunkZ, int PosY, int chance, Block topBlock,Class<? extends Biome>... classes) {
		List<Class<? extends Biome>> classesList = Lists.newArrayList(classes);
		int x = (chunkX * 16);
		int z = (chunkZ * 16);
		int y = calculateGenerationHeight(world, x, z, topBlock);
		BlockPos pos = new BlockPos (x,80 ,z);
		
		Class<? extends Biome> biome = world.provider.getBiomeForCoords(pos).getClass();
		
		if(world.getWorldType() != WorldType.FLAT) {
			if(classesList.contains(biome)) {
					generator.generate(world, random, pos);
			}
		}
	}
	
	public static void generateStructureWM(WorldGenerator generator, World world, Random random, int chunkX, int chunkZ, int PosY, int chance, Block topBlock,Class<? extends Biome>... classes) {
		List<Class<? extends Biome>> classesList = Lists.newArrayList(classes);
		int x = (chunkX * 16);
		int z = (chunkZ * 16);
		int y = calculateGenerationHeight(world, x, z, topBlock);
		BlockPos pos = new BlockPos (x,y - PosY ,z);
		
		Class<? extends Biome> biome = world.provider.getBiomeForCoords(pos).getClass();
		
		if(world.getWorldType() != WorldType.FLAT) {
			if(classesList.contains(biome)) {
				if(random.nextInt(chance) == 0) {
					generator.generate(world, random, pos);
				}
			}
		}
	}
		
	private static  void addFire(World world, int x, int z) {
		int y = world.getHeight();
		boolean foundGround = false;
			
		while(!foundGround && y-- >= 0) {
			Block block = world.getBlockState(new BlockPos(x,y,z)).getBlock();
			
			foundGround = block != Blocks.AIR;
		}


		world.setBlockState(new BlockPos(x, y+1, z), Blocks.FIRE.getDefaultState());
	}
	
	private static int calculateGenerationHeight(World world, int x, int z, Block topBlock) {
		int y = world.getHeight();
		boolean foundGround = false;
			
		while(!foundGround && y-- >= 0) {
			Block block = world.getBlockState(new BlockPos(x,y,z)).getBlock();
			
			foundGround = block == topBlock;
		}

		return y;
	}
}

