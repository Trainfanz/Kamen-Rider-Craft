package Kamen_Rider_Craft_4TH.mobs.Henchmen;

import Kamen_Rider_Craft_4TH.RiderItems;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class Entity_zu_gumun_ba extends Entity_base_henchmen
{
	public Entity_zu_gumun_ba(World par1World)
	{
		super(par1World);
	}

	public void onDeath(DamageSource cause)
	{
		if (!this.world.isRemote){   

			this.dropItem(RiderItems.kuuga_growing, 1);
			switch (this.rand.nextInt(5))
			{   		   	    		
			case 0:
				this.dropItem(RiderItems.kuuga_mighty, 1);
				break;

			case 1:
				this.dropItem(RiderItems.kuuga_dragon, 1);
				break;

			case 2:
				this.dropItem(RiderItems.kuuga_pegasus, 1);
				break;

			case 3:
				this.dropItem(RiderItems.kuuga_titan, 1);
				break;


			}
		}
	}
}
