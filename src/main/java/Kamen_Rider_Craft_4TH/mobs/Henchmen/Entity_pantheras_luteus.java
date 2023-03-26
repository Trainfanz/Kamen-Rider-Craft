package Kamen_Rider_Craft_4TH.mobs.Henchmen;

import Kamen_Rider_Craft_4TH.RiderItems;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class Entity_pantheras_luteus extends Entity_base_henchmen
{
	public Entity_pantheras_luteus(World par1World)
	{
		super(par1World);
	}

	public void onDeath(DamageSource cause)
	{
		if (!this.world.isRemote){   

			this.dropItem(RiderItems.agito_of_seed, 2);
			switch (this.rand.nextInt(5))
			{   		   	    		
			case 0:
				this.dropItem(RiderItems.agito_ground, 1);
				break;

			case 1:
				this.dropItem(RiderItems.agito_flame, 1);
				break;

			case 2:
				this.dropItem(RiderItems.agito_storm, 1);
				break;

			case 3:
				this.dropItem(RiderItems.agito_ground, 1);
				break;


			}
		}
	}
}
