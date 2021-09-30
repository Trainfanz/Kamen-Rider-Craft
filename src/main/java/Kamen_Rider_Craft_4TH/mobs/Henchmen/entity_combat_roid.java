package Kamen_Rider_Craft_4TH.mobs.Henchmen;

import Kamen_Rider_Craft_4TH.RiderItems;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class entity_combat_roid extends Entity_base_henchmen
{
	public entity_combat_roid(World par1World)
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
				this.dropItem(RiderItems.zx_belt_core, 1);
				break;

			}
		}
	}
}
