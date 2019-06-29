package Kamen_Rider_Craft_4TH.item.rider_armor_base;


import Kamen_Rider_Craft_4TH.TokuCraft_core;
import Kamen_Rider_Craft_4TH.util.IHasModel;
import com.google.common.collect.Lists;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;

import java.util.List;


public class Item_form_change extends Item implements IHasModel
{

	private String FORM_NAME;
	private List<PotionEffect> potionEffectList;
	private Item BELT;
	private  Class<? extends item_rider_driver> BELTCLASS;
	private String RIDER_NAME;
	public Item_form_change(String name, Class<? extends item_rider_driver> beltClass, Item belt, String formName, PotionEffect... effects) {
		super();
		this.setMaxDamage(0);
        setTranslationKey(name);
        setRegistryName(name);
        TokuCraft_core.ITEMS.add(this);
        potionEffectList = Lists.newArrayList(effects);
        FORM_NAME = formName;
        BELT = belt;
        BELTCLASS = beltClass;
        RIDER_NAME = "Blank";
	}
	public Item_form_change(String name,Class<? extends item_rider_driver> beltClass,Item belt,String formName,String ridername,PotionEffect... effects)
	{
		super();
		this.setMaxDamage(0);
        setTranslationKey(name);
        setRegistryName(name);
        TokuCraft_core.ITEMS.add(this);
        potionEffectList = Lists.newArrayList(effects);
        FORM_NAME = formName;
        BELT = belt;
        BELTCLASS = beltClass;
        RIDER_NAME = ridername;
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
    public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn) {
    	if (!playerIn.inventory.armorInventory.get(1).isEmpty()) {
			if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem().getClass()==BELTCLASS) {
				if (RIDER_NAME.equals("Blank")) {
					item_rider_driver.set_Form_Item(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),this, 1);
				} else if(((item_rider_driver) playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem()).Rider.equals(RIDER_NAME)){
					item_rider_driver.set_Form_Item(playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),this, 1);
				}
			}

    	}
        playerIn.setActiveHand(handIn);

    	return new ActionResult<>(EnumActionResult.SUCCESS, playerIn.getHeldItem(handIn));
    }
}