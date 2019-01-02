package KamenRiderCraftV3.item.ooo;


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


public class Itemo_scanner extends Item
{



	public Itemo_scanner()
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
							if (Player.getEquipmentInSlot(1).getItem() == RiderItems.OOOdriver){
								if (Player.getEquipmentInSlot(2).getItem() == RiderItems.OOOlegs){
									if (Player.getEquipmentInSlot(3).getItem() == RiderItems.OOOtroso){
										if (Player.getEquipmentInSlot(4).getItem() == RiderItems.OOOhead){



											if(item_OOOdriver.get_eftTime(Player.getEquipmentInSlot(1))<100){

												item_OOOdriver.set_eftTime(Player.getEquipmentInSlot(1),item_OOOdriver.get_eftTime(Player.getEquipmentInSlot(1))+1);
											}


											if (item_OOOdriver.get_core(Player.getEquipmentInSlot(1), "1")==0){
												Player.addPotionEffect(new PotionEffect(Potion.nightVision.id, 25,0));
											}

											if (item_OOOdriver.get_core(Player.getEquipmentInSlot(1), "2")==0){
												Player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 25,1));
											}
											if (item_OOOdriver.get_core(Player.getEquipmentInSlot(1), "3")==0){
												Player.addPotionEffect(new PotionEffect(Potion.jump.id, 25,2));
											}

											if (item_OOOdriver.get_core(Player.getEquipmentInSlot(1), "1")==1){

												if (item_OOOdriver.get_core(Player.getEquipmentInSlot(1), "3")==0){

													if (item_OOOdriver.get_core(Player.getEquipmentInSlot(1), "2")==1){

														if (item_OOOdriver.get_eftTime(Player.getEquipmentInSlot(1)) > 99){

															if (Player.isSneaking()){
																par2World.spawnEntityInWorld(new EntityLightningBolt(par2World,  par3Entity.posX-3,   par3Entity.posY-1,  par3Entity.posZ+3));
																par2World.spawnEntityInWorld(new EntityLightningBolt(par2World,  par3Entity.posX+3,   par3Entity.posY-1,  par3Entity.posZ+3));
																par2World.spawnEntityInWorld(new EntityLightningBolt(par2World,  par3Entity.posX-3,   par3Entity.posY-1,  par3Entity.posZ-3));
																par2World.spawnEntityInWorld(new EntityLightningBolt(par2World,  par3Entity.posX+3,   par3Entity.posY-1,  par3Entity.posZ-3));
																item_OOOdriver.set_eftTime(Player.getEquipmentInSlot(1),0);
															}
														}
													}

												}
											}

											if (item_OOOdriver.get_core(Player.getEquipmentInSlot(1), "2")==1){
												Player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 25,0));
											}
											if (item_OOOdriver.get_core(Player.getEquipmentInSlot(1), "3")==1){
												Player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 25,1));

											}
											if (item_OOOdriver.get_core(Player.getEquipmentInSlot(1), "1")==2){
												if (item_OOOdriver.get_core(Player.getEquipmentInSlot(1), "3")==1){
													if (item_OOOdriver.get_core(Player.getEquipmentInSlot(1), "2")==0){
														Player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 25,3));
													}}
											}

											if (item_OOOdriver.get_core(Player.getEquipmentInSlot(1), "2")==2){
												Player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 25,0));
												Player.addPotionEffect(new PotionEffect(Potion.moveSlowdown.id, 25,1));
											}
											if (item_OOOdriver.get_core(Player.getEquipmentInSlot(1), "3")==2){
												Player.addPotionEffect(new PotionEffect(Potion.resistance.id, 25,0));
												Player.addPotionEffect(new PotionEffect(Potion.moveSlowdown.id, 25,1));
											}
											if (item_OOOdriver.get_core(Player.getEquipmentInSlot(1), "1")==3){
												if (item_OOOdriver.get_core(Player.getEquipmentInSlot(1), "3")==2){
													if (item_OOOdriver.get_core(Player.getEquipmentInSlot(1), "2")==2){
														Player.addPotionEffect(new PotionEffect(Potion.resistance.id, 25,2));
													}}
												Player.addPotionEffect(new PotionEffect(Potion.moveSlowdown.id, 25,1));
											}

											if (item_OOOdriver.get_core(Player.getEquipmentInSlot(1), "2")==3){
												Player.addPotionEffect(new PotionEffect(Potion.fireResistance.id, 25,0));
												Player.fallDistance=0;
											}
											if (item_OOOdriver.get_core(Player.getEquipmentInSlot(1), "3")==3){
												if (item_OOOdriver.get_core(Player.getEquipmentInSlot(1), "2")==3){
													if (item_OOOdriver.get_core(Player.getEquipmentInSlot(1), "1")==0){
														Player.addPotionEffect(new PotionEffect(Potion.regeneration.id, 25,0));
														if (Player.isSneaking()){
															Vec3 look = par3Entity.getLookVec();
															Player.motionX=look.xCoord/2;
															Player.motionY=look.yCoord/2;
															Player.motionZ=look.zCoord/2;
														}
													}}

											}


											if (item_OOOdriver.get_core(Player.getEquipmentInSlot(1), "1")==4){
												Player.addPotionEffect(new PotionEffect(Potion.waterBreathing.id, 25,0));
												if (Player.isInWater()){
													Player.addPotionEffect(new PotionEffect(Potion.nightVision.id, 25,0));
												}
											}
											if (item_OOOdriver.get_core(Player.getEquipmentInSlot(1), "2")==4){
												if (Player.isInWater()){
													Player.addPotionEffect(new PotionEffect(Potion.regeneration.id, 25,0));
												}
											}
											if (item_OOOdriver.get_core(Player.getEquipmentInSlot(1), "3")==4){
												if (Player.isInWater()){
													Player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 25,3));
												}
											}


											if (item_OOOdriver.get_core(Player.getEquipmentInSlot(1), "1")==5){
												Player.addPotionEffect(new PotionEffect(Potion.jump.id, 25,2));

											}
											if (item_OOOdriver.get_core(Player.getEquipmentInSlot(1), "2")==5){


												Player.addPotionEffect(new PotionEffect(Potion.resistance.id, 25,3));


											}
											if (item_OOOdriver.get_core(Player.getEquipmentInSlot(1), "3")==5){

												if(item_OOOdriver.get_eftTime(Player.getEquipmentInSlot(1))>49){

													if (Player.isSneaking()){
														Vec3 look = par3Entity.getLookVec();
														Player.motionX=look.xCoord*4;
														Player.motionZ=look.zCoord*4;
														item_OOOdriver.set_eftTime(Player.getEquipmentInSlot(1),0);

													}
													if (item_OOOdriver.get_core(Player.getEquipmentInSlot(1), "2")==5){
														if (item_OOOdriver.get_core(Player.getEquipmentInSlot(1), "1")==5){
															Player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 25,2));
														}
													}

												}
											}
												if (item_OOOdriver.get_core(Player.getEquipmentInSlot(1), "1")==6){
													Player.addPotionEffect(new PotionEffect(Potion.regeneration.id, 25,0));
												}
												if (item_OOOdriver.get_core(Player.getEquipmentInSlot(1), "2")==6){
													Player.addPotionEffect(new PotionEffect(Potion.resistance.id, 25,2));

												}
												if (item_OOOdriver.get_core(Player.getEquipmentInSlot(1), "3")==6){
													Player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 25,0));
													
													if (item_OOOdriver.get_core(Player.getEquipmentInSlot(1), "1")==6){
													if (item_OOOdriver.get_core(Player.getEquipmentInSlot(1), "2")==6){
														
														Player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 25,1));

													
													}}
												}
												
												if (item_OOOdriver.get_core(Player.getEquipmentInSlot(1), "2")==7){
													Player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 25,1));
													Player.addPotionEffect(new PotionEffect(Potion.fireResistance.id, 25,0));

												}
												if (item_OOOdriver.get_core(Player.getEquipmentInSlot(1), "3")==7){
													Player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 25,1));
													
													if (item_OOOdriver.get_core(Player.getEquipmentInSlot(1), "1")==0){
													if (item_OOOdriver.get_core(Player.getEquipmentInSlot(1), "2")==7){
													
														if (!par2World.isRemote)
													    {
															if (Player.isSneaking()){
																if (item_OOOdriver.get_eftTime(Player.getEquipmentInSlot(1)) > 99){

													                    Vec3 look = Player.getLookVec();
													                    EntityFireball fireball = new EntityLargeFireball(par2World, Player, 1, 1, 1);
													                    fireball.setPosition(
													                    Player.posX + look.xCoord * 1.6,
													                    Player.posY + 1,
													                    Player.posZ + look.zCoord * 1.6);
													                    fireball.accelerationX = look.xCoord * 0.1;
													                    fireball.accelerationY = look.yCoord * 0.1;
													                    fireball.accelerationZ = look.zCoord * 0.1;
													                    par2World.spawnEntityInWorld(fireball);
													                    item_OOOdriver.set_eftTime(Player.getEquipmentInSlot(1),0);
													                    
													    
													    }}}}}
												}
												if (item_OOOdriver.get_core(Player.getEquipmentInSlot(1), "2")==8){
													Player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 25,1));
												}

												if (item_OOOdriver.get_core(Player.getEquipmentInSlot(1), "1")==7){
													Player.addPotionEffect(new PotionEffect(Potion.nightVision.id, 25,0));
													Player.addPotionEffect(new PotionEffect(Potion.fireResistance.id, 25,0));
													Player.addPotionEffect(new PotionEffect(Potion.regeneration.id, 25,3));
													Player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 25,4));
													
												}

												if (item_OOOdriver.get_core(Player.getEquipmentInSlot(1), "2")==9){
													Player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 25,3));
													Player.addPotionEffect(new PotionEffect(Potion.resistance.id, 25,3));
													Player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 25,5));
												}
												if (item_OOOdriver.get_core(Player.getEquipmentInSlot(1), "3")==8){
													Player.addPotionEffect(new PotionEffect(Potion.jump.id, 25,4));
													Player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 25,2));
													Player.fallDistance=0;
													Player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 25,4));
													if (item_OOOdriver.get_core(Player.getEquipmentInSlot(1), "2")==9){
														if (item_OOOdriver.get_core(Player.getEquipmentInSlot(1), "1")==7){
															Player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 25,10));
															if (Player.isSneaking()){
																Vec3 look = par3Entity.getLookVec();
																Player.motionX=look.xCoord;
																Player.motionY=look.yCoord;
																Player.motionZ=look.zCoord;
															}
														}}
												}
												if (item_OOOdriver.get_core(Player.getEquipmentInSlot(1), "2")==10){
													Player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 25,1));
												}
												if (item_OOOdriver.get_core(Player.getEquipmentInSlot(1), "3")==9){
													Player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 25,1));
													}
												if (item_OOOdriver.get_core(Player.getEquipmentInSlot(1), "1")==8){
													Player.addPotionEffect(new PotionEffect(Potion.regeneration.id, 25,1));
													}
												if (item_OOOdriver.get_core(Player.getEquipmentInSlot(1), "2")==11){
													Player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 25,1));
													}
												if (item_OOOdriver.get_core(Player.getEquipmentInSlot(1), "3")==10){
													Player.addPotionEffect(new PotionEffect(Potion.saturation.id, 25,1));
													if (item_OOOdriver.get_core(Player.getEquipmentInSlot(1), "2")==11){
														if (item_OOOdriver.get_core(Player.getEquipmentInSlot(1), "1")==8){
															Player.addPotionEffect(new PotionEffect(Potion.regeneration.id, 25,2));
															Player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 25,2));
															Player.addPotionEffect(new PotionEffect(Potion.saturation.id, 25,2));
															}
														}
													}
												if (item_OOOdriver.get_core(Player.getEquipmentInSlot(1), "1")==9){
													Player.addPotionEffect(new PotionEffect(Potion.waterBreathing.id, 25,0));
													}
												if (item_OOOdriver.get_core(Player.getEquipmentInSlot(1), "2")==12){
													Player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5,1));
													}
												if (item_OOOdriver.get_core(Player.getEquipmentInSlot(1), "3")==11){
													Player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 25,2));
													if (item_OOOdriver.get_core(Player.getEquipmentInSlot(1), "2")==12){
														if (item_OOOdriver.get_core(Player.getEquipmentInSlot(1), "1")==9){
															Player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5,2));
															Player.addPotionEffect(new PotionEffect(Potion.waterBreathing.id, 25,0));
															Player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 25,3));
															}
														}
													}
												if (item_OOOdriver.get_core(Player.getEquipmentInSlot(1), "1")==10){
													Player.addPotionEffect(new PotionEffect(Potion.nightVision.id, 25,0));
													}
												if (item_OOOdriver.get_core(Player.getEquipmentInSlot(1), "2")==13){
													Player.addPotionEffect(new PotionEffect(Potion.resistance.id, 25,1));
													}
												if (item_OOOdriver.get_core(Player.getEquipmentInSlot(1), "3")==12){
													Player.addPotionEffect(new PotionEffect(Potion.saturation.id, 25,1));
													if (item_OOOdriver.get_core(Player.getEquipmentInSlot(1), "2")==13){
														if (item_OOOdriver.get_core(Player.getEquipmentInSlot(1), "1")==10){
															Player.addPotionEffect(new PotionEffect(Potion.nightVision.id, 25,0));
															Player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 25,2));
															Player.addPotionEffect(new PotionEffect(Potion.resistance.id, 25,2));
															}
														}
													}
												if (item_OOOdriver.get_core(Player.getEquipmentInSlot(1), "1")==11){
													Player.addPotionEffect(new PotionEffect(Potion.saturation.id, 25,1));
													}
												if (item_OOOdriver.get_core(Player.getEquipmentInSlot(1), "2")==14){
													Player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5,1));
													}
												if (item_OOOdriver.get_core(Player.getEquipmentInSlot(1), "3")==13){
													Player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 25,2));
													if (item_OOOdriver.get_core(Player.getEquipmentInSlot(1), "2")==14){
														if (item_OOOdriver.get_core(Player.getEquipmentInSlot(1), "1")==11){
															Player.addPotionEffect(new PotionEffect(Potion.saturation.id, 25,2));
															Player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5,2));
															Player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 25,3));
															}
														}
													}
												if (item_OOOdriver.get_core(Player.getEquipmentInSlot(1), "1")==13){
													Player.addPotionEffect(new PotionEffect(Potion.resistance.id, 25,0));
													}	
												if (item_OOOdriver.get_core(Player.getEquipmentInSlot(1), "2")==16){
													Player.addPotionEffect(new PotionEffect(Potion.jump.id, 25,2));
													}	
												if (item_OOOdriver.get_core(Player.getEquipmentInSlot(1), "3")==15){
													Player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 25,1));
													if (item_OOOdriver.get_core(Player.getEquipmentInSlot(1), "2")==16){
														if (item_OOOdriver.get_core(Player.getEquipmentInSlot(1), "1")==13){
															Player.addPotionEffect(new PotionEffect(Potion.resistance.id, 25,2));
															Player.addPotionEffect(new PotionEffect(Potion.jump.id, 25,3));
															Player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 25,2));
															}
														}
													}
												if (item_OOOdriver.get_core(Player.getEquipmentInSlot(1), "1")==13){
													Player.addPotionEffect(new PotionEffect(Potion.waterBreathing.id, 25,0));
													}
												if (item_OOOdriver.get_core(Player.getEquipmentInSlot(1), "2")==16){
													Player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5,1));
													}
												if (item_OOOdriver.get_core(Player.getEquipmentInSlot(1), "3")==15){
													Player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 25,1));
													if (item_OOOdriver.get_core(Player.getEquipmentInSlot(1), "2")==13){
														if (item_OOOdriver.get_core(Player.getEquipmentInSlot(1), "1")==11){
															Player.addPotionEffect(new PotionEffect(Potion.waterBreathing.id, 25,0));
															Player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5,2));
															Player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 25,2));
															}
														}
													}
												if (item_OOOdriver.get_core(Player.getEquipmentInSlot(1), "2")==17){
													Player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5,2));
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