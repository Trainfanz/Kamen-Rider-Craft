package KamenRiderCraftV3.item.zi_o;

import java.util.List;

import KamenRiderCraftV3.RiderItems;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class item_ridewatch extends Item
{

	public int num;
	public int num2;
	public static String[] ARMS= new String[] {"base","build","exaid","ghost","drive","gaim","wizard","fourze","ooo","w","kiva","deno","kabuto","hibiki","blade","faiz","ryuki","agito","kuuga","genm"};

	public item_ridewatch(int NUM ,int arms)
	{
		super();
		this.setHasSubtypes(true);
		this.setMaxDamage(0);
		
		num=NUM;
		num2=arms;
	}

	/**
	 * Called whenever this item is equipped and the right mouse button is pressed. Args: itemStack, world, entityPlayer
	 */
	public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
	{
		if (par3EntityPlayer.getEquipmentInSlot(1)!= null)
		{
			if (par3EntityPlayer.getEquipmentInSlot(1).getItem()instanceof item_zi_o_driver)
			{
				item_zi_o_driver belt = (item_zi_o_driver) par3EntityPlayer.getEquipmentInSlot(1).getItem();
				
				if (belt.DRIVER==0)
				{
					if (num == 0)
					{
						if (belt.Rider=="zi-o")
						{
							if (this == RiderItems.zi_o_ridewatch)
							{
								item_zi_o_driver.set_lock(par3EntityPlayer.getEquipmentInSlot(1),num2);
								item_zi_o_driver.set_core(par3EntityPlayer.getEquipmentInSlot(1),0);
							}
						}
 					else if (belt.Rider=="geiz")
						{
							if (this == RiderItems.geiz_ridewatch)
							{
								item_zi_o_driver.set_lock(par3EntityPlayer.getEquipmentInSlot(1),num2);
								item_zi_o_driver.set_core(par3EntityPlayer.getEquipmentInSlot(1),0);									
							}		
						}
					}
					else if (num==1)
					{
						item_zi_o_driver.set_lock(par3EntityPlayer.getEquipmentInSlot(1),num2);
					}
				}
			}
		}

		return par1ItemStack;
	}
}