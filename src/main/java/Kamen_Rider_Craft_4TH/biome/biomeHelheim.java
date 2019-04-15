package Kamen_Rider_Craft_4TH.biome;

import java.util.Random;

import Kamen_Rider_Craft_4TH.RiderBlocks;
import Kamen_Rider_Craft_4TH.RiderItems;
import Kamen_Rider_Craft_4TH.mobs.Henchmen.EntityKurokageTroopers;
import Kamen_Rider_Craft_4TH.world.gen.modDimensionWorldGen;
import Kamen_Rider_Craft_4TH.world.gen.trees.WorldGenHelheimTrees;
import net.minecraft.block.BlockBush;
import net.minecraft.block.BlockDoublePlant;
import net.minecraft.block.BlockFlower;
import net.minecraft.block.state.pattern.BlockMatcher;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.entity.monster.EntityEnderman;
import net.minecraft.entity.monster.EntitySkeleton;
import net.minecraft.entity.monster.EntitySlime;
import net.minecraft.entity.monster.EntitySpider;
import net.minecraft.entity.monster.EntityWitch;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.monster.EntityZombieVillager;
import net.minecraft.entity.passive.EntityBat;
import net.minecraft.entity.passive.EntityChicken;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.entity.passive.EntityRabbit;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.entity.passive.EntitySquid;
import net.minecraft.entity.passive.EntityWolf;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.ColorizerFoliage;
import net.minecraft.world.ColorizerGrass;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.feature.WorldGenAbstractTree;
import net.minecraft.world.gen.feature.WorldGenBigMushroom;
import net.minecraft.world.gen.feature.WorldGenBigTree;
import net.minecraft.world.gen.feature.WorldGenBirchTree;
import net.minecraft.world.gen.feature.WorldGenBush;
import net.minecraft.world.gen.feature.WorldGenCanopyTree;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class biomeHelheim extends Biome
{
	protected static final WorldGenBirchTree SUPER_BIRCH_TREE = new WorldGenBirchTree(false, true);
	protected static final WorldGenBirchTree BIRCH_TREE = new WorldGenBirchTree(false, false);
	protected static final WorldGenCanopyTree ROOF_TREE = new WorldGenCanopyTree(false);

	protected static final WorldGenHelheimTrees HELHEIM_TREE_FEATURE = new WorldGenHelheimTrees(false);

	public biomeHelheim()
	{
		super(new BiomeProperties(modDimensionWorldGen.HELHEIM_NAME) .setBaseHeight(1.0F)
				.setHeightVariation(0.1F)
				.setRainDisabled()
				.setTemperature(0.6F)
				);
		this.addFlower(RiderBlocks.Helheim_plant.getDefaultState(),10);
		this.addFlower(RiderBlocks.Helheim_plant_2.getDefaultState(),10);
		this.addFlower(RiderBlocks.Helheim_plant_3.getDefaultState(),5);
		this.addFlower(RiderBlocks.Helheim_plant_4.getDefaultState(),2);
		this.decorator.treesPerChunk = 10;
		this.decorator.grassPerChunk = 10;
		this.decorator.flowersPerChunk = 5;
		
		this.spawnableCreatureList.clear();
		this.spawnableMonsterList.clear();
        this.spawnableMonsterList.add(new Biome.SpawnListEntry(EntityKurokageTroopers.class,  20, 4, 6));
        this.spawnableCreatureList.add(new Biome.SpawnListEntry(EntityKurokageTroopers.class,  10, 2, 4));
        

	}


	public WorldGenAbstractTree getRandomTreeFeature(Random rand)
	{
		return (WorldGenAbstractTree)(rand.nextInt(3) == 0 ? BIG_TREE_FEATURE : HELHEIM_TREE_FEATURE );
	}




	public void addMushrooms(World p_185379_1_, Random p_185379_2_, BlockPos p_185379_3_)
	{
	}

	public void decorate(World worldIn, Random rand, BlockPos pos)
	{
		double d0 = GRASS_COLOR_NOISE.getValue((double)(pos.getX() + 8) / 200.0D, (double)(pos.getZ() + 8) / 200.0D);

		if (d0 < -0.8D)
		{
			this.decorator.flowersPerChunk = 15;
			this.decorator.grassPerChunk = 5;
		}
		else
		{
			this.decorator.flowersPerChunk = 4;
			this.decorator.grassPerChunk = 10;
			DOUBLE_PLANT_GENERATOR.setPlantType(BlockDoublePlant.EnumPlantType.GRASS);

			if(net.minecraftforge.event.terraingen.TerrainGen.decorate(worldIn, rand, pos, net.minecraftforge.event.terraingen.DecorateBiomeEvent.Decorate.EventType.GRASS))
				for (int i = 0; i < 7; ++i)
				{
					int j = rand.nextInt(16) + 8;
					int k = rand.nextInt(16) + 8;
					int l = rand.nextInt(worldIn.getHeight(pos.add(j, 0, k)).getY() + 32);
					DOUBLE_PLANT_GENERATOR.generate(worldIn, rand, pos.add(j, l, k));
				}
			
				
			
		}

		for (int i = 0; i < 3; ++i)
		{
			int j = rand.nextInt(16) + 8;
			int k = rand.nextInt(16) + 8;
			int l = rand.nextInt(worldIn.getHeight(pos.add(j, 0, k)).getY() + 32);
			new WorldGenBush((BlockBush) RiderBlocks.Helheim_plant).generate(worldIn, rand,pos.add(j, l, k));	

		}
		for (int i = 0; i < 3; ++i)
		{
			int j = rand.nextInt(16) + 8;
			int k = rand.nextInt(16) + 8;
			int l = rand.nextInt(worldIn.getHeight(pos.add(j, 0, k)).getY() + 32);
			new WorldGenBush((BlockBush) RiderBlocks.Helheim_plant_2).generate(worldIn, rand,pos.add(j, l, k));	

		}for (int i = 0; i < 3; ++i)
		{
			int j = rand.nextInt(16) + 8;
			int k = rand.nextInt(16) + 8;
			int l = rand.nextInt(worldIn.getHeight(pos.add(j, 0, k)).getY() + 32);
			new WorldGenBush((BlockBush) RiderBlocks.Helheim_plant_3).generate(worldIn, rand,pos.add(j, l, k));	

		}for (int i = 0; i < 3; ++i)
		{
			int j = rand.nextInt(16) + 8;
			int k = rand.nextInt(16) + 8;
			int l = rand.nextInt(worldIn.getHeight(pos.add(j, 0, k)).getY() + 32);
			new WorldGenBush((BlockBush) RiderBlocks.Helheim_plant_4).generate(worldIn, rand,pos.add(j, l, k));	

		}

		super.decorate(worldIn, rand, pos);
	}

	public Class <? extends Biome > getBiomeClass()
	{
		return biomeHelheim.class;
	}

	@SideOnly(Side.CLIENT)
	public int getGrassColorAtPos(BlockPos pos)
	{
		return 0x257a4f;
	}

	@SideOnly(Side.CLIENT)
	public int getFoliageColorAtPos(BlockPos pos)
	{ 
		return 0x50a540;
	}

	/**
	 * takes temperature, returns color
	 */
	 @SideOnly(Side.CLIENT)
	public int getSkyColorByTemp(float currentTemperature)
	{

		return 0x51f2f4;
	}

	public static enum Type
	{
		NORMAL,
		FLOWER,
		BIRCH,
		ROOFED;
	}
}