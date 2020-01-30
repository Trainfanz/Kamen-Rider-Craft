package Kamen_Rider_Craft_4TH.world.gen;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import Kamen_Rider_Craft_4TH.RiderItems;
import Kamen_Rider_Craft_4TH.biome.biomeHelheim;
import Kamen_Rider_Craft_4TH.biome.biomeSandOfTime;
import Kamen_Rider_Craft_4TH.world.gen.generators.WorldGenStructure;
import com.google.common.collect.Lists;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.WorldType;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeForest;
import net.minecraft.world.biome.BiomeHills;
import net.minecraft.world.biome.BiomeJungle;
import net.minecraft.world.biome.BiomeMesa;
import net.minecraft.world.biome.BiomePlains;
import net.minecraft.world.biome.BiomeSavanna;
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
	
	
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
		switch(world.provider.getDimension()) {
			case 1:
				break;
			case 0:
				generateStructure(ROGUE_BASE, world, random, chunkX, chunkZ,11, 1000, Blocks.DIRT, BiomePlains.class,BiomeSavanna.class,BiomeForest.class,BiomeHills.class);
				generateStructure(PANDORA_TOWER, world, random, chunkX, chunkZ,-1, 1500, Blocks.DIRT, BiomePlains.class,BiomeSavanna.class,BiomeForest.class,BiomeHills.class);
				generateStructure(HELHEIM_CRACK, world, random, chunkX, chunkZ,-1, 1000, Blocks.DIRT, BiomePlains.class,BiomeMesa.class,BiomeForest.class,BiomeJungle.class);
				
				break;
			case -1:
		}
		if (modDimensionWorldGen.HELHEIM_DIM_ID==world.provider.getDimension()){
			generateStructure(yggdrasill_base, world, random, chunkX, chunkZ,-1, 500, Blocks.DIRT,biomeHelheim.class);

			generateStructure(rosyuo_helheim_city, world, random, chunkX, chunkZ,-1, 1000, Blocks.DIRT,biomeHelheim.class);
			generateStructure(demushu_helheim_city, world, random, chunkX, chunkZ,7, 700, Blocks.DIRT,biomeHelheim.class);
			generateStructure(redyue_helheim_city, world, random, chunkX, chunkZ,0, 700, Blocks.DIRT,biomeHelheim.class);
			
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

