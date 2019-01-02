package KamenRiderCraftV3.biome;

import java.awt.Color;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.util.MathHelper;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.gen.feature.WorldGenBigTree;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class helheim_Biome extends BiomeGenBase  {

	/** Color buffer for grass */
    private static int[] grassBuffer = new int[65536];

	public helheim_Biome(int par1) {
		super(par1);
		this.topBlock = Blocks.grass.getDefaultState();
		this.fillerBlock = Blocks.dirt.getDefaultState();
		   this.theBiomeDecorator.treesPerChunk = 10;
	        this.theBiomeDecorator.grassPerChunk = 10;
	        this.worldGeneratorBigTree = new WorldGenBigTree(true);
	}

	  @SideOnly(Side.CLIENT)
	    public int getBiomeGrassColor(int p_150558_1_, int p_150558_2_, int p_150558_3_)
	    {
		  
        return getModdedBiomeGrassColor(0xa9da9c);
   
    }
	
	    /**
	     * takes temperature, returns color
	     */
	    @SideOnly(Side.CLIENT)
	    public int getSkyColorByTemp(float p_76731_1_)
	    {
	        p_76731_1_ /= 3.0F;

	        if (p_76731_1_ < -1.0F)
	        {
	            p_76731_1_ = -1.0F;
	        }

	        if (p_76731_1_ > 1.0F)
	        {
	            p_76731_1_ = 1.0F;
	        }

	        return Color.getHSBColor(0.62222224F - p_76731_1_ * 0.05F, 0.5F + p_76731_1_ * 0.1F, 1.0F).getRGB();
	    }

	  
	  @SideOnly(Side.CLIENT)
	    public int getBiomeFoliageColor(int p_150571_1_, int p_150571_2_, int p_150571_3_)
	    {
		  
       return getModdedBiomeFoliageColor(0xa9da9c);
    }

	

}
