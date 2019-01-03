package KamenRiderCraftV3.chunk;


import KamenRiderCraftV3.KamenRiderCraftV3_core;
import net.minecraft.util.MathHelper;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.biome.WorldChunkManagerHell;
import net.minecraft.world.chunk.Chunk;
import net.minecraft.world.chunk.IChunkProvider;


public class World_Provide_Helheim extends WorldProvider
{
	
	    
	  
	
	public void registerWorldChunkManager(){
		this.worldChunkMgr = new WorldChunkManagerHell(KamenRiderCraftV3_core.Helheim, 1);
		this.dimensionId = KamenRiderCraftV3_core.dimensionID_Helheim;
	
	}
	
	
	public String getDimensionName() {
		return "Helheim";
	}
	
    
    /**
     * True if the player can respawn in this dimension (true = overworld, false = nether).
     */
    public boolean canRespawnHere()
    {
        return false;
    }
    
    public boolean doesXZShowFog(int par1, int par2)
    {
        return false;
    }
    
   

    public void toggleRain()
    {
        worldObj.getWorldInfo().setRainTime(10);
    }

    public boolean canBlockFreeze(int x, int y, int z, boolean byWater)
    {
        return false;
    }


    public boolean canDoLightning(Chunk chunk)
    {
        return false;
    }
    /**
     * Returns 'true' if in the "main surface world", but 'false' if in the Nether or End dimensions.
     */
    public boolean isSurfaceWorld()
    {
        return false;
    }

    /**
     * Will check if the x, z position specified is alright to be set as the map spawn point
     */
    public boolean canCoordinateBeSpawn(int x, int z)
    {
        return false;
    }

	@Override
	public String getInternalNameSuffix() {
		// TODO Auto-generated method stub
		return "_helheim";
	}

}
