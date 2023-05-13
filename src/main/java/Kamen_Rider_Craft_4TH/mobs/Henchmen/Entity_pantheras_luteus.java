package Kamen_Rider_Craft_4TH.mobs.Henchmen;

import Kamen_Rider_Craft_4TH.RiderItems;
import Kamen_Rider_Craft_4TH.mobs.Boss.EntityBossBase;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_AnotherAgito;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_el_of_the_water;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.DamageSource;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextFormatting;
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

			if (this.getAttackTarget()instanceof EntityPlayer){
				EntityPlayer playerIn=	(EntityPlayer) this.getAttackTarget();
				 EntityBossBase entityboss  = new Entity_el_of_the_water(world);
			switch (this.rand.nextInt(10))
			{
			case 0:
				entityboss.setLocationAndAngles(this.posX, this.posY, this.posZ, 0, 0.0F);
				world.spawnEntity(entityboss);
				break;
			}
			}
			
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
