package Kamen_Rider_Craft_4TH.world.gen.generators;

import java.util.Random;

import Kamen_Rider_Craft_4TH.RiderItems;
import net.minecraft.block.Block;
import net.minecraft.block.BlockFalling;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.state.pattern.BlockPattern;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.Biomes;
import net.minecraft.init.Blocks;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.Teleporter;
import net.minecraft.world.World;
import net.minecraft.world.WorldEntitySpawner;
import net.minecraft.world.WorldServer;
import net.minecraft.world.WorldType;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.chunk.Chunk;
import net.minecraft.world.chunk.ChunkPrimer;
import net.minecraft.world.gen.ChunkGeneratorOverworld;
import net.minecraft.world.gen.ChunkGeneratorSettings;
import net.minecraft.world.gen.MapGenBase;
import net.minecraft.world.gen.MapGenCaves;
import net.minecraft.world.gen.MapGenRavine;
import net.minecraft.world.gen.NoiseGeneratorOctaves;
import net.minecraft.world.gen.NoiseGeneratorPerlin;
import net.minecraft.world.gen.ChunkGeneratorSettings.Factory;
import net.minecraft.world.gen.feature.WorldGenDungeons;
import net.minecraft.world.gen.feature.WorldGenLakes;
import net.minecraft.world.gen.structure.MapGenMineshaft;
import net.minecraft.world.gen.structure.MapGenScatteredFeature;
import net.minecraft.world.gen.structure.MapGenStronghold;
import net.minecraft.world.gen.structure.MapGenVillage;
import net.minecraft.world.gen.structure.StructureOceanMonument;
import net.minecraft.world.gen.structure.WoodlandMansion;
import net.minecraftforge.common.util.ITeleporter;

public class ChunkGeneratorRabbitHutch extends ChunkGeneratorOverworld {
	
	 protected static final IBlockState STONE = Blocks.STONE.getDefaultState();
	  private NoiseGeneratorOctaves minLimitPerlinNoise;
	    private NoiseGeneratorOctaves maxLimitPerlinNoise;
	    private NoiseGeneratorOctaves mainPerlinNoise;
	    private NoiseGeneratorPerlin surfaceNoise;
	    public NoiseGeneratorOctaves scaleNoise;
	    public NoiseGeneratorOctaves depthNoise;
	    public NoiseGeneratorOctaves forestNoise;

	    private final Random rand;
	    private final World world;
	    private ChunkGeneratorSettings settings;
	    private final boolean mapFeaturesEnabled;
	    private final WorldType terrainType;
	    private final double[] heightMap;
	    private IBlockState oceanBlock = Blocks.STONE.getDefaultState();
	    private double[] depthBuffer = new double[256];
	    private MapGenBase caveGenerator = new MapGenCaves();
	    private MapGenStronghold strongholdGenerator = new MapGenStronghold();
	    private MapGenVillage villageGenerator = new MapGenVillage();
	    private MapGenMineshaft mineshaftGenerator = new MapGenMineshaft();
	    private MapGenScatteredFeature scatteredFeatureGenerator = new MapGenScatteredFeature();
	    private MapGenBase ravineGenerator = new MapGenRavine();
	    private Biome[] biomesForGeneration;
	    double[] mainNoiseRegion;
	    double[] minLimitRegion;
	    double[] maxLimitRegion;
	    double[] depthRegion;
	    
	public ChunkGeneratorRabbitHutch(World worldIn, long seed, boolean mapFeaturesEnabledIn, String generatorOptions) {
		super(worldIn, seed, mapFeaturesEnabledIn, generatorOptions);
		  {
	            caveGenerator = net.minecraftforge.event.terraingen.TerrainGen.getModdedMapGen(caveGenerator, net.minecraftforge.event.terraingen.InitMapGenEvent.EventType.CAVE);
	           scatteredFeatureGenerator = (MapGenScatteredFeature)net.minecraftforge.event.terraingen.TerrainGen.getModdedMapGen(scatteredFeatureGenerator, net.minecraftforge.event.terraingen.InitMapGenEvent.EventType.SCATTERED_FEATURE);
	            ravineGenerator = net.minecraftforge.event.terraingen.TerrainGen.getModdedMapGen(ravineGenerator, net.minecraftforge.event.terraingen.InitMapGenEvent.EventType.RAVINE);
	       }
	        this.world = worldIn;
	        this.mapFeaturesEnabled = mapFeaturesEnabledIn;
	        this.terrainType = worldIn.getWorldInfo().getTerrainType();
	        this.rand = new Random(seed);
	        this.minLimitPerlinNoise = new NoiseGeneratorOctaves(this.rand, 16);
	        this.maxLimitPerlinNoise = new NoiseGeneratorOctaves(this.rand, 16);
	        this.mainPerlinNoise = new NoiseGeneratorOctaves(this.rand, 8);
	        this.surfaceNoise = new NoiseGeneratorPerlin(this.rand, 4);
	        this.scaleNoise = new NoiseGeneratorOctaves(this.rand, 10);
	        this.depthNoise = new NoiseGeneratorOctaves(this.rand, 16);
	        this.forestNoise = new NoiseGeneratorOctaves(this.rand, 8);
	        this.heightMap = new double[825];
	    
	        if (generatorOptions != null)
	        {
	           Factory chunkProviderSettings = ChunkGeneratorSettings.Factory.jsonToFactory(worldIn.getWorldInfo().getGeneratorOptions());
	        	
	        	this.settings = chunkProviderSettings.build();
	 	          
	            this.oceanBlock = this.settings.useLavaOceans ? Blocks.LAVA.getDefaultState() : Blocks.WATER.getDefaultState();
	            worldIn.setSeaLevel(this.settings.seaLevel);
	        }

	        net.minecraftforge.event.terraingen.InitNoiseGensEvent.ContextOverworld ctx =
	                new net.minecraftforge.event.terraingen.InitNoiseGensEvent.ContextOverworld(minLimitPerlinNoise, maxLimitPerlinNoise, mainPerlinNoise, surfaceNoise, scaleNoise, depthNoise, forestNoise);
	        ctx = net.minecraftforge.event.terraingen.TerrainGen.getModdedNoiseGenerators(worldIn, this.rand, ctx);
	        this.minLimitPerlinNoise = ctx.getLPerlin1();
	        this.maxLimitPerlinNoise = ctx.getLPerlin2();
	        this.mainPerlinNoise = ctx.getPerlin();
	        this.surfaceNoise = ctx.getHeight();
	        this.scaleNoise = ctx.getScale();
	        this.depthNoise = ctx.getDepth();
	        this.forestNoise = ctx.getForest();
	}
	
	  /* Generates the chunk at the specified position, from scratch
	     */
	    public Chunk generateChunk(int x, int z)
	    {
	        this.rand.setSeed((long)x * 341873128712L + (long)z * 132897987541L);
	        ChunkPrimer chunkprimer = new ChunkPrimer();
	        this.setBlocksInChunk(x, z, chunkprimer);
	        this.biomesForGeneration = this.world.getBiomeProvider().getBiomes(this.biomesForGeneration, x * 16, z * 16, 16, 16);
	        this.replaceBiomeBlocks(x, z, chunkprimer, this.biomesForGeneration);

	        if (this.settings.useCaves)
	        {
	            this.caveGenerator.generate(this.world, x, z, chunkprimer);
	        }

	        if (this.settings.useRavines)
	        {
	            this.ravineGenerator.generate(this.world, x, z, chunkprimer);
	        }

	
	        

	        Chunk chunk = new Chunk(this.world, chunkprimer, x, z);
	        byte[] abyte = chunk.getBiomeArray();

	        for (int i = 0; i < abyte.length; ++i)
	        {
	            abyte[i] = (byte)Biome.getIdForBiome(this.biomesForGeneration[i]);
	        }

	        chunk.generateSkylightMap();
	        return chunk;
	    }

	    /**
	     * Generate initial structures in this chunk, e.g. mineshafts, temples, lakes, and dungeons
	     *  
	     * @param x Chunk x coordinate
	     * @param z Chunk z coordinate
	     */
	    public void populate(int x, int z)
	    {
	        BlockFalling.fallInstantly = true;
	        int i = x * 16;
	        int j = z * 16;
	        BlockPos blockpos = new BlockPos(i, 0, j);
	        Biome biome = this.world.getBiome(blockpos.add(16, 0, 16));
	        this.rand.setSeed(this.world.getSeed());
	        long k = this.rand.nextLong() / 2L * 2L + 1L;
	        long l = this.rand.nextLong() / 2L * 2L + 1L;
	        this.rand.setSeed((long)x * k + (long)z * l ^ this.world.getSeed());
	        boolean flag = false;
	        ChunkPos chunkpos = new ChunkPos(x, z);

	        net.minecraftforge.event.ForgeEventFactory.onChunkPopulate(true, this, this.world, this.rand, x, z, flag);

	        biome.decorate(this.world, this.rand, new BlockPos(i, 0, j));
	        if (net.minecraftforge.event.terraingen.TerrainGen.populate(this, this.world, this.rand, x, z, flag, net.minecraftforge.event.terraingen.PopulateChunkEvent.Populate.EventType.ANIMALS))
	        WorldEntitySpawner.performWorldGenSpawning(this.world, biome, i + 8, j + 8, 16, 16, this.rand);
	        blockpos = blockpos.add(8, 0, 8);

	        net.minecraftforge.event.ForgeEventFactory.onChunkPopulate(false, this, this.world, this.rand, x, z, flag);

	        BlockFalling.fallInstantly = false;
	    }

}