package KamenRiderCraftV3.item.deno;


import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityFireball;
import net.minecraft.entity.projectile.EntityLargeFireball;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;
import KamenRiderCraftV3.RiderItems;


public class Item_den_oriderpass extends Item
{



	public Item_den_oriderpass()
	{
		super();
		setHasSubtypes(true);
		setMaxDamage(0);
		maxStackSize = 1;


	}

	public void onUpdate(ItemStack par1ItemStack, World par2World, Entity par3Entity, int par4, boolean par5) {



		if (par3Entity instanceof EntityPlayer){
			EntityPlayer Player = (EntityPlayer) par3Entity;
			if (Player.getEquipmentInSlot(1)!= null){
				if (Player.getEquipmentInSlot(2)!= null){
					if (Player.getEquipmentInSlot(3)!= null){
						if (Player.getEquipmentInSlot(4)!= null){
							if (Player.getEquipmentInSlot(1).getItem() == RiderItems.den_odriver){
								if (Player.getEquipmentInSlot(2).getItem() == RiderItems.den_olegs){
									if (Player.getEquipmentInSlot(3).getItem() == RiderItems.den_otroso){
										if (Player.getEquipmentInSlot(4).getItem() == RiderItems.den_ohead){


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
