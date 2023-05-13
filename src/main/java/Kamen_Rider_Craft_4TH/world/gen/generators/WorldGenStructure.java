package Kamen_Rider_Craft_4TH.world.gen.generators;


import java.util.Random;

import Kamen_Rider_Craft_4TH.util.Refercence;
import Kamen_Rider_Craft_4TH.util.IStructure;
import net.minecraft.block.state.IBlockState;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraft.world.gen.structure.template.Template;
import net.minecraft.world.gen.structure.template.TemplateManager;

public class WorldGenStructure extends WorldGenerator implements IStructure
{
	private String structureName;
	
	public WorldGenStructure(String name) 
	{
		this.structureName = name;
	}
	
	@Override
	public boolean generate(World worldIn, Random rand, BlockPos position) {
		WorldGenStructure.generateStructure(worldIn, position, structureName);
		return true;
	}

	public static void generateStructure(World world, BlockPos pos, String name)
	{
		MinecraftServer mcServer = world.getMinecraftServer();
		TemplateManager manager = worldServer.getStructureTemplateManager();
		ResourceLocation location = new ResourceLocation(Refercence.MODID, name);
		Template template = manager.get(mcServer, location);
		
		if(template != null)
		{
			IBlockState state = world.getBlockState(pos);
			world.notifyBlockUpdate(pos, state, state, 3);
			template.addBlocksToWorldChunk(world, pos, settings);
			
		}else {System.out.println("Resource Location Err");}
	}
}
