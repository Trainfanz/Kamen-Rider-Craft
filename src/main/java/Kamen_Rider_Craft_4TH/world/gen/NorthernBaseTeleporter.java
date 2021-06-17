package Kamen_Rider_Craft_4TH.world.gen;

import Kamen_Rider_Craft_4TH.RiderItems;
import net.minecraft.block.Block;
import net.minecraft.block.state.pattern.BlockPattern;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.Blocks;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.Teleporter;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;
import net.minecraftforge.common.util.ITeleporter;

public class NorthernBaseTeleporter implements ITeleporter {

	int POSX;
	int POSY;
	int POSZ;

	/**
	 * Finds a portal near the entity's current coordinates and places the entity there, creating it if necessary.
	 */
	public void placeInPortal(Entity entityIn, float rotationYaw, World world)
	{
		this.placeInExistingPortal(entityIn, rotationYaw,world);

	}


	public ITeleporter setXYZ(int get_pos, int get_pos2, int get_pos3) {
		POSX=get_pos;
		POSY=get_pos2;
		POSZ=get_pos3;
		return this;
	}
	
	public boolean placeInExistingPortal(Entity entityIn, float rotationYaw, World world)
	{
		int i = 128;
		double d0 = -1.0D;
		boolean flag = true;

		if (d0 >= 0.0D)
		{


			double d5 = POSX;
			double d7 = POSZ;
			double d6 = POSY;

			double d3 = entityIn.motionX;
			double d4 = entityIn.motionZ;
			entityIn.rotationYaw = rotationYaw;

			if (entityIn instanceof EntityPlayerMP)
			{
				((EntityPlayerMP)entityIn).connection.setPlayerLocation(d5, d6+2, d7, entityIn.rotationYaw, entityIn.rotationPitch);
				return true;
			}
			else
			{
				entityIn.setLocationAndAngles(d5,d6+2 , d7, entityIn.rotationYaw, entityIn.rotationPitch);
				return true;
			}
		}
		else
		{
			return false;
		}
	}





	@Override
	public void placeEntity(World world, Entity entity, float yaw) {
		placeInPortal(entity, yaw,world);
	}







}
