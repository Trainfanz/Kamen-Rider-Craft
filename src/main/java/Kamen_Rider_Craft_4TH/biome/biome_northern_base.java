package Kamen_Rider_Craft_4TH.biome;

import Kamen_Rider_Craft_4TH.RiderBlocks;
import Kamen_Rider_Craft_4TH.RiderItems;
import Kamen_Rider_Craft_4TH.mobs.Henchmen.*;
import Kamen_Rider_Craft_4TH.world.gen.WorldGenCustomStructures;
import Kamen_Rider_Craft_4TH.world.gen.modDimensionWorldGen;
import Kamen_Rider_Craft_4TH.world.gen.generators.WorldGenblocks;
import Kamen_Rider_Craft_4TH.world.gen.trees.WorldGenHelheimTrees;
import net.minecraft.block.BlockBush;
import net.minecraft.block.BlockDoublePlant;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.feature.WorldGenAbstractTree;
import net.minecraft.world.gen.feature.WorldGenBirchTree;
import net.minecraft.world.gen.feature.WorldGenBush;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.Random;

public class biome_northern_base extends Biome {


	biome_northern_base() {
		super(new BiomeProperties(modDimensionWorldGen.NORTHERN_BASE_NAME).setBaseHeight(1.0F).setHeightVariation(-0.1F).setTemperature(0F));
	
		this.spawnableCreatureList.clear();
		this.spawnableMonsterList.clear();
		this.topBlock=Blocks.SNOW.getDefaultState();
		this.fillerBlock=Blocks.ICE.getDefaultState();
		
		this.spawnableCreatureList.clear();
		this.spawnableMonsterList.clear();
		
		
	}



	public void decorate(World worldIn, Random rand, BlockPos pos) {
		double d0 = GRASS_COLOR_NOISE.getValue((double)(pos.getX() + 8) / 200.0D, (double)(pos.getZ() + 8) / 200.0D);

			this.decorator.flowersPerChunk = 3;
			this.decorator.grassPerChunk = 0;
			this.flowers.clear();
			this.addFlower(Blocks.DEADBUSH.getDefaultState(),10);
			this.decorator.deadBushPerChunk=3;
			
		
		super.decorate(worldIn, rand, pos);
	}

	public Class <? extends Biome > getBiomeClass() {
		return biome_northern_base.class;
	}

	@SideOnly(Side.CLIENT)
	public int getGrassColorAtPos(BlockPos pos) {
		return 0xc2c593;
	}

	@SideOnly(Side.CLIENT)
	public int getFoliageColorAtPos(BlockPos pos) {
		return 0xc2c593;
	}

	/**
	 * takes temperature, returns color
	 */
	 @SideOnly(Side.CLIENT)
	 public int getSkyColorByTemp(float currentTemperature) {
		return 0x88a7d3;
	}
}