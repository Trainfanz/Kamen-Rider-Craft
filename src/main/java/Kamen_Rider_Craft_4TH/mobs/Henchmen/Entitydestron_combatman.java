package Kamen_Rider_Craft_4TH.mobs.Henchmen;

import Kamen_Rider_Craft_4TH.RiderItems;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class Entitydestron_combatman extends Entity_base_henchmen
{
	public Entitydestron_combatman(World par1World)
	{
		super(par1World);
	}

	public void onDeath(DamageSource cause)
	{
		if (!this.world.isRemote){   

			this.dropItem(RiderItems.rider_circuit, this.rand.nextInt(3));
			switch (this.rand.nextInt(20))
			{   		   	    		
			case 0:
				this.dropItem(RiderItems.double_typhoon_core, 1);
				break;

			case 1:
				this.dropItem(RiderItems.riderman_belt_core, 1);
				break;

			case 2:
				this.dropItem(RiderItems.double_typhoon_core, 1);
				break;
				
			case 3:
				this.dropItem(RiderItems.double_typhoon_core, 1);
				break;


			}
		}
	}
}
