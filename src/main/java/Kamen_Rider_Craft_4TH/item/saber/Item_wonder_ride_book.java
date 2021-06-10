package Kamen_Rider_Craft_4TH.item.saber;


import Kamen_Rider_Craft_4TH.RiderItems;
import Kamen_Rider_Craft_4TH.TokuCraft_core;
import Kamen_Rider_Craft_4TH.blocks.hiden_3d_printing;
import Kamen_Rider_Craft_4TH.blocks.sword_of_logos_book_analyzer;
import Kamen_Rider_Craft_4TH.blocks.zaia_3d_printing;
import Kamen_Rider_Craft_4TH.blocks.wood.BlockHelheimVine;
import Kamen_Rider_Craft_4TH.item.zero_one.Item_progrise_keys;
import Kamen_Rider_Craft_4TH.util.IHasModel;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;


public class Item_wonder_ride_book extends Item implements IHasModel
{

	public String num;
	public int num2;
	public int form=0;
	public String setBase = "thingy";

	public boolean Basic=false;
	public boolean Saber=false;
	public boolean Blades=false;
	public boolean Espada=false;
	public boolean Buster=false;
	public boolean Kenzan=false;
	public boolean Calibur=false;
	public boolean Slash=false;
	public boolean Saikou=false;
	public boolean XrossSaber=false;

	public Item_wonder_ride_book(String NUM ,int arms,String name)
	{
		super();
		this.setMaxDamage(0);
		num=NUM;
		num2=arms;
		setTranslationKey(name);
		setRegistryName(name);
		TokuCraft_core.ITEMS.add(this);

	}

	public Item_wonder_ride_book(String name)
	{
		super();
		this.setMaxDamage(0);
		setTranslationKey(name);
		setRegistryName(name);
		TokuCraft_core.ITEMS.add(this);
		num="thingy";
		num2=10;

	}

	public Item_wonder_ride_book ChangeForm(int num)
	{
		form = num;
		return this;
	}

	public Item_wonder_ride_book NotBasicBook()
	{
		Basic = true;
		return this;
	}

	public Item_wonder_ride_book SaberBook()
	{
		Saber = true;
		return this;
	}

	public Item_wonder_ride_book BladesBook()
	{
		Blades = true;
		return this;
	}

	public Item_wonder_ride_book EspadaBook()
	{
		Espada = true;
		return this;
	}

	public Item_wonder_ride_book BusterBook()
	{
		Buster = true;
		return this;
	}

	public Item_wonder_ride_book KenzanBook()
	{
		Kenzan = true;
		return this;
	}
	public Item_wonder_ride_book  CaliburBook()
	{
		Calibur = true;
		return this;
	}

	public Item_wonder_ride_book  SlashBook()
	{
		Slash = true;
		return this;
	}

	public Item_wonder_ride_book  SaikouBook()
	{
		Saikou = true;
		return this;
	}
	
	public Item_wonder_ride_book  XrossSaberBook()
	{
		XrossSaber = true;
		return this;
	}

	public Item_wonder_ride_book AddToSwordOfLogosBookAnalyzer(int num)
	{
		for (int i1 = 0; i1 < num; ++i1)
		{
			sword_of_logos_book_analyzer.wonder_ride_books.add(this);
		}
		return this;
	}

	@Override
	public void registerModels() {
		TokuCraft_core.proxy.registerItemRender(this,0,"inventory");
	}



	public Item_wonder_ride_book resetBook(String rider)
	{
		setBase=rider;
		return this;
	}
	/**
	 * Called when the equipped item is right clicked.
	 */
	public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn)
	{

		if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET)!= null){

			if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() instanceof item_saberdriver){
				item_saberdriver belt = (item_saberdriver) playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem();
				 boolean BasicForm=item_saberdriver.get_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET), "f") !="base";
				 boolean isXrossSaber =item_saberdriver.get_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET), "f") =="_xross";
				 
			
			
				 
				if (num!="thingy") {
					if (setBase==belt.Rider||BasicForm&form==0&!isXrossSaber) {
						item_saberdriver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),belt.BOOK_L, "l");
						item_saberdriver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),belt.BOOK_M, "m");
						item_saberdriver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),belt.BOOK_R, "r");
						item_saberdriver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),0, "f");
					}
					else if(belt.Rider=="buster"&Buster||belt.Rider=="kenzan"&Kenzan||belt.Rider=="slash"&Slash||belt.Rider=="calibur"&Calibur){
						item_saberdriver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num2, num);
						item_saberdriver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),form, "f");
					}else if (belt.Rider=="saikou_shadow"&Saikou){
						
						
						item_saberdriver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num2, num);
						

						if(item_saberdriver.get_core_for_forms(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),"f")==5){
							item_saberdriver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num2, num);
							item_saberdriver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),form+1, "f");
						}
						else if(item_saberdriver.get_core_for_forms(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),"f")==6){
							item_saberdriver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num2, num);
							item_saberdriver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),form+2, "f");
						}
						else{
							item_saberdriver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num2, num);
							item_saberdriver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),form, "f");
						}
						
					}
					else {
						if(belt.Rider=="saber"||belt.Rider=="blaze"||belt.Rider=="espada"){							
						if(!Basic||belt.Rider=="saber"&Saber||belt.Rider=="blaze"&Blades||belt.Rider=="espada"&Espada){
							String basebook="";
							if (belt.BOOK_L!=0){
								basebook="l";
							}else if (belt.BOOK_M!=0){
								basebook="m";
							}else if (belt.BOOK_R!=0){
								basebook="r";
							}
						
							
							if (form!=0&!isXrossSaber){
								if (this==RiderItems.elemental_dragon_wonder_ride_book&!playerIn.inventory.hasItemStack(new ItemStack(RiderItems.primitive_dragon_wonder_ride_book))){
									
								}else
								{
								item_saberdriver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),0, "m");
								item_saberdriver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),0, "r");
								item_saberdriver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),0, "l");
								item_saberdriver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),form, "f");
								}
							}else if (isXrossSaber&XrossSaber){
								item_saberdriver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num2, num);
							}else if (basebook != num & form==0){
								item_saberdriver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),num2, num);
								item_saberdriver.set_core(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),form, "f");
							}
						}	
						}		
					}
				}
			}
		}
		playerIn.setActiveHand(handIn);
		return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, playerIn.getHeldItem(handIn));
	}
}