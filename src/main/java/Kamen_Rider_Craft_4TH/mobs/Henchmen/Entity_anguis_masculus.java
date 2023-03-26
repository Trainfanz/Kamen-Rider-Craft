package Kamen_Rider_Craft_4TH.mobs.Henchmen;

import Kamen_Rider_Craft_4TH.RiderItems;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class Entity_anguis_masculus extends Entity_base_henchmen
{
	public Entity_anguis_masculus(World par1World)
	{
		super(par1World);
	}

	public void onDeath(DamageSource cause)
	{
		if (!this.world.isRemote){   

			this.dropItem(RiderItems.agito_of_seed, 3);
			switch (this.rand.nextInt(5))
			{   		   	    		
			case 0:
				this.dropItem(RiderItems.gills, 1);
				break;

			case 1:
				this.dropItem(RiderItems.gills, 1);
				break;

			case 2:
				this.dropItem(RiderItems.gills, 1);
				break;

			case 3:
				this.dropItem(RiderItems.g3core, 2);
				break;


			}
		}
	}
}
