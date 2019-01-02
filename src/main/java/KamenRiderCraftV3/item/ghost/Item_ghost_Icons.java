package KamenRiderCraftV3.item.ghost;

import KamenRiderCraftV3.RiderItems;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class Item_ghost_Icons extends Item
{

	public int num;
	public int num2;
	public int num3;
	public static String[] ARMS= new String[] {"ore","edison","newton","musashi","robin","specter","billy_the_kid","beethoven","benkei","tutankhamun","nobunaga","ikkyu","santa","boost","goemon","ryoma","pythagoras","kamehameha","special_ore","necrom","himiko","houdini","grimm","sanzo","deep_specter","dark","dark_necrom_red","dark_necrom_blue","dark_necrom_yellow","dark_necrom_pink","zero_specter","shakespeare","nightingale","galileo","columbus","mugen","napoleon","darwin","sin","tenkatoitsu","shinsengumi","yujou_burst_necrom","da_vinci","showa","kuuga","agito","ryuki","faiz","blade","hibiki","kabuto","den_o","kiva","decade","double","ooo","fourze","wizard","gaim","drive","ex_aid","fourtyfiveshowa","ore_specter","fourtyfiveheisei"};


	
	public Item_ghost_Icons(int NUM ,int arms,int rider)
	{
		super();
		this.setHasSubtypes(true);
		this.setMaxDamage(0);
		
		num=NUM;
		
		num2=arms;
		
		num3=rider;
	
	}



	/**
	 * Called whenever this item is equipped and the right mouse button is pressed. Args: itemStack, world, entityPlayer
	 */
	public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
	{



		if (par3EntityPlayer.getEquipmentInSlot(1)!= null){

			if (par3EntityPlayer.getEquipmentInSlot(1).getItem() instanceof item_ghostdriver&par3EntityPlayer.getEquipmentInSlot(1).getItem()!=RiderItems.eyecon_driver_g&par3EntityPlayer.getEquipmentInSlot(1).getItem()!=RiderItems.extremer_driver){
				item_ghostdriver belt = (item_ghostdriver) par3EntityPlayer.getEquipmentInSlot(1).getItem();

				if (num == 0){
					if (num2== 0&belt == RiderItems.ghostdriver||num2== 5&belt == RiderItems.specterdriver||num2== 19&belt == RiderItems.mega_ulorder){
							item_ghostdriver.set_core(par3EntityPlayer.getEquipmentInSlot(1),0, "1");
					}
					item_ghostdriver.set_lock(par3EntityPlayer.getEquipmentInSlot(1),num2,num3);
				
				


				}else if (belt == RiderItems.ghostdriver&par1ItemStack.getItem()==RiderItems.toucon_boost_icon||belt == RiderItems.ghostdriver&par1ItemStack.getItem()==RiderItems.mugen_icon||belt == RiderItems.ghostdriver&par1ItemStack.getItem()==RiderItems.fourtyfive_heisei_ghost_icon){
					item_ghostdriver.set_core(par3EntityPlayer.getEquipmentInSlot(1),num, "1");
					item_ghostdriver.set_lock(par3EntityPlayer.getEquipmentInSlot(1),num2,num3);
				}else if (num  ==1& belt == RiderItems.specterdriver&par1ItemStack.getItem()==RiderItems.deep_specter_ghost_icon||num  ==2& belt == RiderItems.specterdriver&par1ItemStack.getItem()==RiderItems.sin_specter_icon){
					item_ghostdriver.set_core(par3EntityPlayer.getEquipmentInSlot(1),num, "1");
					item_ghostdriver.set_lock(par3EntityPlayer.getEquipmentInSlot(1),num2,num3);
				}else if (belt == RiderItems.mega_ulorder&par1ItemStack.getItem()==RiderItems.yujou_burst_icon){
					item_ghostdriver.set_core(par3EntityPlayer.getEquipmentInSlot(1),num, "1");
					item_ghostdriver.set_lock(par3EntityPlayer.getEquipmentInSlot(1),num2,num3);
				}
			}
		}






		return par1ItemStack;
	}


}
