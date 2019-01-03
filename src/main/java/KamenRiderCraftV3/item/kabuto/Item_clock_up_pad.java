package KamenRiderCraftV3.item.kabuto;



import KamenRiderCraftV3.KamenRiderCraftV3_core;
import KamenRiderCraftV3.RiderItems;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;


public class Item_clock_up_pad extends Item
{



	public Item_clock_up_pad()
	{
		super();
		this.setHasSubtypes(true);
		this.setMaxDamage(0);
		maxStackSize = 64;


	}
	public void onUpdate(ItemStack par1ItemStack, World par2World, Entity par3Entity, int par4, boolean par5) {


		if (par3Entity instanceof EntityPlayer){
			EntityPlayer player = (EntityPlayer) par3Entity;
			ItemStack item = player.getCurrentEquippedItem();

			if (par1ItemStack == item){

				if (player.getEquipmentInSlot(1)!= null){
					if (player.getEquipmentInSlot(2)!= null){
						if (player.getEquipmentInSlot(3)!= null){
							if (player.getEquipmentInSlot(4)!= null){
								if (player.getEquipmentInSlot(2).getItem() == RiderItems.kabutolegs){
									if (player.getEquipmentInSlot(3).getItem() == RiderItems.kabutotroso){
										if (player.getEquipmentInSlot(4).getItem() == RiderItems.kabutohead){
											if (player.getEquipmentInSlot(1).getItem()instanceof item_kabutodriver){
											player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5,20));		
										}
									}
								}
							}
						}
					}
				}
					}
			}
		}
	}

}