package Kamen_Rider_Craft_4TH.mobs.Henchmen;

import Kamen_Rider_Craft_4TH.ReiwaRiderItems;
import Kamen_Rider_Craft_4TH.RiderItems;
import Kamen_Rider_Craft_4TH.mobs.Boss.EntityBossBase;
import Kamen_Rider_Craft_4TH.mobs.Boss.Entity_AnotherAgito;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;

public class Entity_anguis_masculus extends Entity_base_henchmen
{
	public Entity_anguis_masculus(World par1World)
	{
		super(par1World);
	}

	/**
	 * Returns the item that this EntityLiving is holding, if any.
	 */
	@Override
	public ItemStack getHeldItemMainhand()
	{
		return new ItemStack(RiderItems.judgment_staff);
	}
	
	public void onDeath(DamageSource cause)
	{
		if (!this.world.isRemote){   

			if (this.getAttackTarget()instanceof EntityPlayer){
				EntityPlayer playerIn=	(EntityPlayer) this.getAttackTarget();
				 EntityBossBase entityboss  = new Entity_AnotherAgito(world);
			switch (this.rand.nextInt(10))
			{
			case 0:
				playerIn.sendMessage( new TextComponentString(TextFormatting.DARK_GREEN+"henshin"));
				entityboss.setLocationAndAngles(this.posX, this.posY, this.posZ, 0, 0.0F);
				world.spawnEntity(entityboss);
				break;
			}
			}
			
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
