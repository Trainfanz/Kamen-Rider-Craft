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
import net.minecraft.block.BlockFlower;
import net.minecraft.block.BlockSand;
import net.minecraft.block.BlockStone;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeDecorator;
import net.minecraft.world.chunk.ChunkPrimer;
import net.minecraft.world.gen.ChunkGeneratorSettings;
import net.minecraft.world.gen.ChunkGeneratorSettings.Factory;
import net.minecraft.world.gen.feature.WorldGenAbstractTree;
import net.minecraft.world.gen.feature.WorldGenBirchTree;
import net.minecraft.world.gen.feature.WorldGenBush;
import net.minecraft.world.gen.feature.WorldGenDeadBush;
import net.minecraft.world.gen.feature.WorldGenLiquids;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenPumpkin;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.Random;

public class BiomeDecorator_rabbit_hutch extends BiomeDecorator {

	
	@Override
	 public void decorate(World worldIn, Random random, Biome biome, BlockPos pos)
	  { 

        if ( this.decorating)
        {
            throw new RuntimeException("Already decorating");
        }
        else
        	
        {
        	Factory chunkProviderSettings = ChunkGeneratorSettings.Factory.jsonToFactory(worldIn.getWorldInfo().getGeneratorOptions());
        	 this.chunkProviderSettings = chunkProviderSettings.build();
           
        	 this.chunkPos = pos;
            
          
            this.dirtGen = new WorldGenMinable(Blocks.DIRT.getDefaultState(),0);
            this.gravelOreGen = new WorldGenMinable(Blocks.GRAVEL.getDefaultState(),0);
            this.graniteGen = new WorldGenMinable(Blocks.STONE.getDefaultState().withProperty(BlockStone.VARIANT, BlockStone.EnumType.GRANITE), 0);
            this.dioriteGen = new WorldGenMinable(Blocks.STONE.getDefaultState().withProperty(BlockStone.VARIANT, BlockStone.EnumType.DIORITE), 0);
            this.andesiteGen = new WorldGenMinable(Blocks.STONE.getDefaultState().withProperty(BlockStone.VARIANT, BlockStone.EnumType.ANDESITE),0);
            this.coalGen = new WorldGenMinable(Blocks.COAL_ORE.getDefaultState(),0);
            this.ironGen = new WorldGenMinable(Blocks.IRON_ORE.getDefaultState(), 0);
            this.goldGen = new WorldGenMinable(Blocks.GOLD_ORE.getDefaultState(), 0);
            this.redstoneGen = new WorldGenMinable(Blocks.REDSTONE_ORE.getDefaultState(), 0);
            this.diamondGen = new WorldGenMinable(Blocks.DIAMOND_ORE.getDefaultState(), 0);
            this.lapisGen = new WorldGenMinable(Blocks.LAPIS_ORE.getDefaultState(), 0);
            this.decorating = false;
        }
    }
	
}
   