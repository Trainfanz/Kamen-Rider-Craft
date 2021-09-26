package Kamen_Rider_Craft_4TH.mobs.Henchmen;

import Kamen_Rider_Craft_4TH.RiderItems;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class Entitygod_warfare_agent extends Entity_base_henchmen
{
	public Entitygod_warfare_agent(World par1World)
	{
		super(par1World);
	}

	public void onDeath(DamageSource cause)
	{
		if (!this.world.isRemote){   

			this.dropItem(RiderItems.rider_circuit, this.rand.nextInt(3));
			switch (this.rand.nextInt(5))
			{   		   	    		
			case 0:
				this.dropItem(RiderItems.ridol_core, 1);
				break;

			}
		}
	}
}
