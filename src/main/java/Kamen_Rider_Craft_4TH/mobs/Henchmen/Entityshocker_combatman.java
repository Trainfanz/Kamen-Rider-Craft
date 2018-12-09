package Kamen_Rider_Craft_4TH.mobs.Henchmen;

import Kamen_Rider_Craft_4TH.RiderItems;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class Entityshocker_combatman extends Entity_base_henchmen
{
	public Entityshocker_combatman(World par1World)
	{
		super(par1World);
	}

	public void onDeath(DamageSource cause)
	{
		if (!this.world.isRemote){   

			this.dropItem(RiderItems.rider_circuit, 2);
			switch (this.rand.nextInt(15))
			{   		   	    		
			case 0:
				this.dropItem(RiderItems.typhoon_core, 1);
				break;

			case 1:
				this.dropItem(RiderItems.riderman_belt_core, 1);
				break;

			case 2:
				this.dropItem(RiderItems.ridol_core, 1);
				break;

			case 3:
				this.dropItem(RiderItems.condorer_wheel, 1);
				break;

			case 4:
				this.dropItem(RiderItems.electrer_core, 1);
				break;

			case 5:
				this.dropItem(RiderItems.tornado_core, 1);
				break;

			case 6:
				this.dropItem(RiderItems.cyclode_core, 1);
				break;

			case 7:
				this.dropItem(RiderItems.zx_belt_core, 1);
				break;

			case 8:
				this.dropItem(RiderItems.king_stone_core, 1);
				break;

			}
		}
	}
}
