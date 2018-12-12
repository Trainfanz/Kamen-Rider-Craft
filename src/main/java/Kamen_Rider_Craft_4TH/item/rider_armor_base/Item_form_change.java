package Kamen_Rider_Craft_4TH.item.rider_armor_base;


import java.util.List;

import com.google.common.collect.Lists;

import Kamen_Rider_Craft_4TH.RiderItems;
import Kamen_Rider_Craft_4TH.TokuCraft_core;
import Kamen_Rider_Craft_4TH.item.Ichigo.item_Ichigodriver;
import Kamen_Rider_Craft_4TH.util.IHasModel;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;


public class Item_form_change extends Item implements IHasModel
{

	private String FORM_NAME;
	private List<PotionEffect> potionEffectList;
	private int SLOT;
	private Item BELT;
	private  Class<? extends item_rider_driver> BELTCLASS;
	
	public Item_form_change(String name,Class<? extends item_rider_driver> beltClass,Item belt,String formName,PotionEffect... effects)
	{
		super();
		this.setMaxDamage(0);
        setUnlocalizedName(name);
        setRegistryName(name);
        TokuCraft_core.ITEMS.add(this);
        potionEffectList = Lists.newArrayList(effects);
        FORM_NAME=formName;
        BELT=belt;
        SLOT=1;
        BELTCLASS=beltClass;
	}
	public Item_form_change(String name,Class<? extends item_rider_driver> beltClass,int slot,Item belt,String formName,PotionEffect... effects)
	{
		super();
		this.setMaxDamage(0);
        setUnlocalizedName(name);
        setRegistryName(name);
        TokuCraft_core.ITEMS.add(this);
        potionEffectList = Lists.newArrayList(effects);
        FORM_NAME=formName;
        BELT=belt;
        SLOT=slot;
        BELTCLASS=beltClass;
	}
	
	@Override
	public void registerModels() {
		TokuCraft_core.proxy.registerItemRender(this,0,"inventory");
	}

	public List<PotionEffect> getPotionEffectList() {
		return potionEffectList;
	}

	public Item getBelt() {
		return BELT;
	}
	public String getFormName() {
		return FORM_NAME;
	}
	
	   /**
     * Called when the equipped item is right clicked.
     */
    public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn)
    {
    	if (playerIn.inventory.armorInventory.get(1)!= null){
			if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem().getClass()==BELTCLASS){
				
				item_rider_driver.set_Form_Item(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),this, 1);
				}
			}
        playerIn.setActiveHand(handIn);
        return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, playerIn.getHeldItem(handIn));
    }
}