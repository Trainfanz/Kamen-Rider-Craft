package Kamen_Rider_Craft_4TH.mobs.Henchmen;

import Kamen_Rider_Craft_4TH.RiderItems;
import Kamen_Rider_Craft_4TH.ShowaRiderItems;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class entity_black_satan_soldier extends Entity_base_henchmen
{
	public entity_black_satan_soldier(World par1World)
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
				this.dropItem(ShowaRiderItems.electrer_core, 1);
				break;

			}
		}
	}
}
