package KamenRiderCraftV3.item.fourze;

import KamenRiderCraftV3.RiderItems;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;


public class Item_astroswitch extends Item
{

	public int num;
	public String num2;
	public String slot;
	public int numod;
	public Item_astroswitch(int NUM ,String NUM2,String SLOT,int NUMOD)
	{
		super();
		this.setHasSubtypes(true);
		this.setMaxDamage(0);

		num=NUM;
		num2=NUM2;
		slot=SLOT;
		numod=NUMOD;
	}



	/**
	 * Called whenever this item is equipped and the right mouse button is pressed. Args: itemStack, world, entityPlayer
	 */
	public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
	{



		if (par3EntityPlayer.getEquipmentInSlot(1)!= null){

			if (par3EntityPlayer.getEquipmentInSlot(1).getItem() == RiderItems.nadeshikodriver){

				if ( slot=="circle"&num==0){

					if (par3EntityPlayer.isSneaking()){
						item_Fourzedriver.set_core(par3EntityPlayer.getEquipmentInSlot(1),0,"");
						item_Fourzedriver.set_core(par3EntityPlayer.getEquipmentInSlot(1), 0,"circle");
					}else{
						item_Fourzedriver.set_core(par3EntityPlayer.getEquipmentInSlot(1), numod,"circle");
						item_Fourzedriver.set_core(par3EntityPlayer.getEquipmentInSlot(1),0,"");
					}
				}
				else if ( slot=="square"){

					if (par3EntityPlayer.isSneaking()){

						item_Fourzedriver.set_core(par3EntityPlayer.getEquipmentInSlot(1), 0,"square");
					}else{
						item_Fourzedriver.set_core(par3EntityPlayer.getEquipmentInSlot(1), numod,"square");
					}
				}
			}

			else if (par3EntityPlayer.getEquipmentInSlot(1).getItem() == RiderItems.Fourzedriver){

				//slot=="circle"&item_Fourzedriver.get_core(par3EntityPlayer.getEquipmentInSlot(1))==num&item_Fourzedriver.get_core(par3EntityPlayer.getEquipmentInSlot(1))==0

				if ( slot=="circle"){

					if (item_Fourzedriver.get_core(par3EntityPlayer.getEquipmentInSlot(1))==3||item_Fourzedriver.get_core(par3EntityPlayer.getEquipmentInSlot(1))==5){

						item_Fourzedriver.set_core(par3EntityPlayer.getEquipmentInSlot(1), 0,"square");
					}else if (item_Fourzedriver.get_core(par3EntityPlayer.getEquipmentInSlot(1))==8){

						item_Fourzedriver.set_core(par3EntityPlayer.getEquipmentInSlot(1), 0,"circle");
						item_Fourzedriver.set_core(par3EntityPlayer.getEquipmentInSlot(1), 0,"triangle");
						item_Fourzedriver.set_core(par3EntityPlayer.getEquipmentInSlot(1), 0,"cross");
						item_Fourzedriver.set_core(par3EntityPlayer.getEquipmentInSlot(1), 0,"square");
					}
					if (par3EntityPlayer.isSneaking()){
						item_Fourzedriver.set_core(par3EntityPlayer.getEquipmentInSlot(1),0,"");
						item_Fourzedriver.set_core(par3EntityPlayer.getEquipmentInSlot(1), 0,"circle");
						if (this== RiderItems.fusion_swich&par3EntityPlayer.inventory.hasItem(RiderItems.meteor_swich)&par3EntityPlayer.inventory.hasItem(RiderItems.nadeshiko_switch)){

							item_Fourzedriver.set_core(par3EntityPlayer.getEquipmentInSlot(1), 12,"circle");
							item_Fourzedriver.set_core(par3EntityPlayer.getEquipmentInSlot(1), 11,"triangle");
							item_Fourzedriver.set_core(par3EntityPlayer.getEquipmentInSlot(1), 11,"cross");
							item_Fourzedriver.set_core(par3EntityPlayer.getEquipmentInSlot(1), 12,"square");


						}
					}else{
						if (this== RiderItems.super_rocket_swich){
							item_Fourzedriver.set_core(par3EntityPlayer.getEquipmentInSlot(1), 11,"square");
						}
						item_Fourzedriver.set_core(par3EntityPlayer.getEquipmentInSlot(1), numod,"circle");
						item_Fourzedriver.set_core(par3EntityPlayer.getEquipmentInSlot(1),0,"");
					}
				}
				else if ( slot=="square"){
					
				if (item_Fourzedriver.get_core(par3EntityPlayer.getEquipmentInSlot(1))==8){

						item_Fourzedriver.set_core(par3EntityPlayer.getEquipmentInSlot(1), 0,"circle");
						item_Fourzedriver.set_core(par3EntityPlayer.getEquipmentInSlot(1), 0,"triangle");
						item_Fourzedriver.set_core(par3EntityPlayer.getEquipmentInSlot(1), 0,"cross");
						item_Fourzedriver.set_core(par3EntityPlayer.getEquipmentInSlot(1), 0,"square");
						item_Fourzedriver.set_core(par3EntityPlayer.getEquipmentInSlot(1),0,"");
					}

					if (item_Fourzedriver.get_core(par3EntityPlayer.getEquipmentInSlot(1))!=3&item_Fourzedriver.get_core(par3EntityPlayer.getEquipmentInSlot(1))!=7){
						if (par3EntityPlayer.isSneaking()){

							item_Fourzedriver.set_core(par3EntityPlayer.getEquipmentInSlot(1), 0,"square");
						}else{
							item_Fourzedriver.set_core(par3EntityPlayer.getEquipmentInSlot(1), numod,"square");
						}}
				}
				else if ( slot=="triangle"){
					if (item_Fourzedriver.get_core(par3EntityPlayer.getEquipmentInSlot(1))==8){

						item_Fourzedriver.set_core(par3EntityPlayer.getEquipmentInSlot(1), 0,"circle");
						item_Fourzedriver.set_core(par3EntityPlayer.getEquipmentInSlot(1), 0,"triangle");
						item_Fourzedriver.set_core(par3EntityPlayer.getEquipmentInSlot(1), 0,"cross");
						item_Fourzedriver.set_core(par3EntityPlayer.getEquipmentInSlot(1), 0,"square");
						item_Fourzedriver.set_core(par3EntityPlayer.getEquipmentInSlot(1),0,"");
					}
					if (item_Fourzedriver.get_core(par3EntityPlayer.getEquipmentInSlot(1))!=6){
							
					if (par3EntityPlayer.isSneaking()){

						item_Fourzedriver.set_core(par3EntityPlayer.getEquipmentInSlot(1), 0,"triangle");
					}else{
						item_Fourzedriver.set_core(par3EntityPlayer.getEquipmentInSlot(1), numod,"triangle");
					}
					}
				}else if ( slot=="cross"){
					if (item_Fourzedriver.get_core(par3EntityPlayer.getEquipmentInSlot(1))==8){

						item_Fourzedriver.set_core(par3EntityPlayer.getEquipmentInSlot(1), 0,"circle");
						item_Fourzedriver.set_core(par3EntityPlayer.getEquipmentInSlot(1), 0,"triangle");
						item_Fourzedriver.set_core(par3EntityPlayer.getEquipmentInSlot(1), 0,"cross");
						item_Fourzedriver.set_core(par3EntityPlayer.getEquipmentInSlot(1), 0,"square");
						item_Fourzedriver.set_core(par3EntityPlayer.getEquipmentInSlot(1),0,"");
					}

					if (par3EntityPlayer.isSneaking()){

						item_Fourzedriver.set_core(par3EntityPlayer.getEquipmentInSlot(1), 0,"cross");
					}else{
						item_Fourzedriver.set_core(par3EntityPlayer.getEquipmentInSlot(1), numod,"cross");
					}
				}
				if (num2=="1"){

					if (num == 3){
						if (par3EntityPlayer.inventory.hasItem(RiderItems.magnet_swich_n)){
							if(par3EntityPlayer.inventory.hasItem(RiderItems.magnet_swich_s)){
								item_Fourzedriver.set_core(par3EntityPlayer.getEquipmentInSlot(1), 8,"circle");
								item_Fourzedriver.set_core(par3EntityPlayer.getEquipmentInSlot(1), 9,"square");
								item_Fourzedriver.set_core(par3EntityPlayer.getEquipmentInSlot(1), num,"");
							}
						}
					}else if (num == 7){
						if (par3EntityPlayer.inventory.hasItem(RiderItems.meteor_swich)){
							if (par3EntityPlayer.inventory.hasItem(RiderItems.nadeshiko_switch)&par3EntityPlayer.isSneaking()){
								item_Fourzedriver.set_core(par3EntityPlayer.getEquipmentInSlot(1), 8,"");
							}else{
								item_Fourzedriver.set_core(par3EntityPlayer.getEquipmentInSlot(1), num,"");
							}
						}
					}else{
						item_Fourzedriver.set_core(par3EntityPlayer.getEquipmentInSlot(1), num,"");
						if (num!=0){
							item_Fourzedriver.set_core(par3EntityPlayer.getEquipmentInSlot(1), numod,"circle");
						}
					}
				}
			}else if (par3EntityPlayer.getEquipmentInSlot(1).getItem() == RiderItems.meteor_driver){
				if (num2=="2"){

					item_Fourzedriver.set_core(par3EntityPlayer.getEquipmentInSlot(1), num,"");

				}
			}

		}



		return par1ItemStack;
	}




}
