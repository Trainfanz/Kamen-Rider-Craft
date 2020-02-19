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

public class biomeSandOfTime extends Biome {


	biomeSandOfTime() {
		super(new BiomeProperties(modDimensionWorldGen.SANDSOFTIME_NAME).setBaseHeight(1.0F).setHeightVariation(0F).setRainDisabled().setTemperature(0.4F));
	
		this.spawnableCreatureList.clear();
		this.spawnableMonsterList.clear();
		this.topBlock=RiderItems.imaginsandblock.getDefaultState();
		this.fillerBlock=RiderItems.imaginsandblock.getDefaultState();
		
		this.spawnableCreatureList.clear();
		this.spawnableMonsterList.clear();
		
		this.spawnableMonsterList.add(new Biome.SpawnListEntry(Entitynew_mole_imagin_sand.class,  20, 4, 7));
        this.spawnableCreatureList.add(new Biome.SpawnListEntry(Entitynew_mole_imagin_sand.class,  10, 2, 4));
        
		
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
		return biomeSandOfTime.class;
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
		return 0xff3b3b;
	}
}