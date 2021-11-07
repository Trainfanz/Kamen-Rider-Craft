package Kamen_Rider_Craft_4TH.mobs.Henchmen;

import Kamen_Rider_Craft_4TH.RiderItems;
import Kamen_Rider_Craft_4TH.mobs.Boss.EntityBossBase;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_jin;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_magia;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_shocker_riders;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.DamageSource;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextFormatting;
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

			if (this.getAttackTarget()instanceof EntityPlayer){
				EntityPlayer playerIn=	(EntityPlayer) this.getAttackTarget();
				EntityBossBase entityboss  = new Entity_shocker_riders(world);
				EntityBossBase entity_jin  = new Entity_jin(world);
				switch (this.rand.nextInt(20))
				{
				case 0:
					entityboss.setLocationAndAngles(this.posX, this.posY, this.posZ, 0, 0.0F);
					world.spawnEntity(entityboss);
					break;
				case 1:
					entityboss.setLocationAndAngles(this.posX, this.posY, this.posZ, 0, 0.0F);
					world.spawnEntity(entityboss);
					break;
				case 2:
					entityboss.setLocationAndAngles(this.posX, this.posY, this.posZ, 0, 0.0F);
					world.spawnEntity(entityboss);
					break;
					/**
					case 3:
						playerIn.sendMessage( new TextComponentString(TextFormatting.LIGHT_PURPLE+"Forcerise! Flying Falcon! Break down."));
						entity_jin.setLocationAndAngles(this.posX, this.posY, this.posZ, 0, 0.0F);
						world.spawnEntity(entity_jin);
						break;
					 **/
				}
			}
			this.dropItem(RiderItems.rider_circuit,this.rand.nextInt(3));

			switch (this.rand.nextInt(5))
			{   		   	    		
			case 0:
				this.dropItem(RiderItems.typhoon_core, 1);
				break;
			}
		}
	}
}
