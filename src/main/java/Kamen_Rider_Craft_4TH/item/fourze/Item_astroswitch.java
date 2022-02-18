package Kamen_Rider_Craft_4TH.item.fourze;

import Kamen_Rider_Craft_4TH.RiderItems;
import Kamen_Rider_Craft_4TH.TokuCraft_core;
import Kamen_Rider_Craft_4TH.blocks.AstroSwitchProgrammer;
import Kamen_Rider_Craft_4TH.blocks.vistamp_bar;
import Kamen_Rider_Craft_4TH.item.revice.Item_Vistamps;
import Kamen_Rider_Craft_4TH.util.IHasModel;
import Kamen_Rider_Craft_4TH.util.Refercence;
import net.minecraft.advancements.Advancement;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.GameRegistry;


public class Item_astroswitch extends Item implements IHasModel
{

	public int num;
	public String num2;
	public String slot;
	public int numod;
	public Item_astroswitch(int NUM ,String NUM2,String SLOT,int NUMOD,String name)
	{
		super();
		
		this.setMaxDamage(0);

		num=NUM;
		num2=NUM2;
		slot=SLOT;
		numod=NUMOD;
        setTranslationKey(name);
        setRegistryName(name);
        TokuCraft_core.ITEMS.add(this);
	}
	@Override
	public void registerModels() {
		TokuCraft_core.proxy.registerItemRender(this,0,"inventory");
	}
	
	public Item_astroswitch AddLegendCrafting(Item Thing)
	{
		GameRegistry.addShapelessRecipe(new ResourceLocation(Refercence.MODID,"astroswitch_and_"+Thing.getRegistryName()),null,new ItemStack(this), new Ingredient[]{Ingredient.fromItem(RiderItems.astroswitch),Ingredient.fromItem(Thing)});			
		return this;
	}
	public Item_astroswitch AddToAstroSwitchProgrammer(int num)
	{
		for (int i1 = 0; i1 < num; ++i1)
		{
			AstroSwitchProgrammer.AstroSwitch.add(this);
		}
		return this;
	}
	@Override
	 public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer player, EnumHand handIn)
    {
		if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET)!= null){

			if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.nadeshikodriver){

				if ( slot=="circle"&num==0){

					if (player.isSneaking()){
						item_Fourzedriver.set_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET),0,"");
						item_Fourzedriver.set_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), 0,"circle");
					}else{
						item_Fourzedriver.set_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), numod,"circle");
						item_Fourzedriver.set_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET),0,"");
					}
				}
				else if ( slot=="square"){

					if (player.isSneaking()){

						item_Fourzedriver.set_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), 0,"square");
					}else{
						item_Fourzedriver.set_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), numod,"square");
					}
				}
			}

			else if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.Fourzedriver){

				//slot=="circle"&item_Fourzedriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))==num&item_Fourzedriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))==0

				if ( slot=="circle"){

					if (item_Fourzedriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))==3||item_Fourzedriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))==5){

						item_Fourzedriver.set_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), 0,"square");
					}else if (item_Fourzedriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))==8||item_Fourzedriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))==9){

						item_Fourzedriver.set_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), 0,"circle");
						item_Fourzedriver.set_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), 0,"triangle");
						item_Fourzedriver.set_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), 0,"cross");
						item_Fourzedriver.set_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), 0,"square");
					}
					if (player.isSneaking()){
						item_Fourzedriver.set_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET),0,"");
						item_Fourzedriver.set_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), 0,"circle");
						if (this== RiderItems.fusion_swich&player.inventory.hasItemStack(new ItemStack(RiderItems.meteor_swich))&player.inventory.hasItemStack(new ItemStack(RiderItems.nadeshiko_switch))){

							item_Fourzedriver.set_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), 12,"circle");
							item_Fourzedriver.set_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), 11,"triangle");
							item_Fourzedriver.set_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), 11,"cross");
							item_Fourzedriver.set_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), 12,"square");


						}
					}else{
						if (this== RiderItems.super_rocket_swich){
							item_Fourzedriver.set_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), 11,"square");
						}else if (this== RiderItems.super_launcher_swich){
							item_Fourzedriver.set_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), 12,"triangle");
							item_Fourzedriver.set_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), 1,"cross");
							item_Fourzedriver.set_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), 13,"square");
						}
						item_Fourzedriver.set_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), numod,"circle");
						item_Fourzedriver.set_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET),0,"");
					}
				}
				else if ( slot=="square"){
					
				if (item_Fourzedriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))==8||item_Fourzedriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))==9){

						item_Fourzedriver.set_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), 0,"circle");
						item_Fourzedriver.set_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), 0,"triangle");
						item_Fourzedriver.set_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), 0,"cross");
						item_Fourzedriver.set_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), 0,"square");
						item_Fourzedriver.set_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET),0,"");
					}

					if (item_Fourzedriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))!=3&item_Fourzedriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))!=7){
						if (player.isSneaking()){

							item_Fourzedriver.set_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), 0,"square");
						}else{
							item_Fourzedriver.set_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), numod,"square");
						}}
				}
				else if ( slot=="triangle"){
					if (item_Fourzedriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))==8||item_Fourzedriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))==9){

						item_Fourzedriver.set_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), 0,"circle");
						item_Fourzedriver.set_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), 0,"triangle");
						item_Fourzedriver.set_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), 0,"cross");
						item_Fourzedriver.set_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), 0,"square");
						item_Fourzedriver.set_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET),0,"");
					}
					if (item_Fourzedriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))!=6){
							
					if (player.isSneaking()){

						item_Fourzedriver.set_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), 0,"triangle");
					}else{
						item_Fourzedriver.set_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), numod,"triangle");
					}
					}
				}else if ( slot=="cross"){
					if (item_Fourzedriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))==8||item_Fourzedriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET))==9){

						item_Fourzedriver.set_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), 0,"circle");
						item_Fourzedriver.set_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), 0,"triangle");
						item_Fourzedriver.set_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), 0,"cross");
						item_Fourzedriver.set_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), 0,"square");
						item_Fourzedriver.set_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET),0,"");
					}

					if (player.isSneaking()){
						item_Fourzedriver.set_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), 0,"cross");
					}else{
						item_Fourzedriver.set_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), numod,"cross");
					}
				}
				if (num2=="1"){

					if (num == 3){
						if (player.inventory.hasItemStack(new ItemStack(RiderItems.magnet_swich_n))){
							if(player.inventory.hasItemStack(new ItemStack(RiderItems.magnet_swich_s))){
								item_Fourzedriver.set_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), 8,"circle");
								item_Fourzedriver.set_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), 9,"square");
								item_Fourzedriver.set_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), num,"");
							}
						}
					}else if (num == 7){
						if (player.inventory.hasItemStack(new ItemStack(RiderItems.meteor_swich))){
							if (player.inventory.hasItemStack(new ItemStack(RiderItems.nadeshiko_switch))&player.isSneaking()){
								item_Fourzedriver.set_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), 8,"");
							}else{
								item_Fourzedriver.set_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), num,"");
							}
						}
					}else{
						item_Fourzedriver.set_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), num,"");
						if (num!=0){
							item_Fourzedriver.set_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), numod,"circle");
						}
					}
				}
			}else if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.meteor_driver){
				if (num2=="2"){

					item_Fourzedriver.set_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), num,"");

				}
			}

		}
		player.setActiveHand(handIn);
		return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, player.getHeldItem(handIn));
	}
}
