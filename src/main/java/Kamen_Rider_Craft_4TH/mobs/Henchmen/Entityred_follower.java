package Kamen_Rider_Craft_4TH.mobs.Henchmen;

import Kamen_Rider_Craft_4TH.RiderItems;
import Kamen_Rider_Craft_4TH.ShowaRiderItems;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class Entityred_follower extends Entity_base_henchmen
{
	public Entityred_follower(World par1World)
	{
		super(par1World);
	}

	public void onDeath(DamageSource cause)
	{
		if (!this.world.isRemote){   

			this.dropItem(ShowaRiderItems.rider_circuit, this.rand.nextInt(3));
			switch (this.rand.nextInt(5))
			{   		   	    		
			case 0:
				this.dropItem(ShowaRiderItems.condorer_wheel, 1);
				break;

			}
			switch (this.rand.nextInt(25))
			{   		   	    		
			case 0:
				this.dropItem(RiderItems.clear_drill_swich, 1);
				break;

			}
		}
	}
}
