package com.kelco.kamenridercraft.Items.rider_armor_base;


import java.util.ArrayList;
import java.util.List;

import com.google.common.collect.Lists;
import com.kelco.kamenridercraft.Items.Modded_item_core;

import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;

public class RiderFormChangeItem extends BaseItem {

	private String FORM_NAME;
	private int Slot =1;
	private List<MobEffectInstance> potionEffectList;
	private int BELT;
	private List<Item> NEEDITEM = new ArrayList<Item>();
	protected String RIDER_NAME;
	private String BELT_TEX;
	private String UPDATED_BELT_MODEL;
	private String UPDATED_MODEL;
	private String FLYING_MODEL;
	private Boolean FLYING_TEXT = false;
	private Item STIFT_ITEM = Items.APPLE;
	private Item SWITCH_ITEM;

	private List<RiderFormChangeItem> alternative = new ArrayList<RiderFormChangeItem>();
	private RiderFormChangeItem alsoChange2ndSlot;
	public String[] compatibilityList= new String[] {""};
	private Boolean HAS_NEED_ITEM_LIST = false;
	public List<Item> needItemList;

	
	public RiderFormChangeItem( Properties properties,int belt,String formName,String ridername,String beltTex, MobEffectInstance... effects) {
		super( properties);

		potionEffectList = Lists.newArrayList(effects);
		FORM_NAME = formName;
		BELT_TEX = beltTex;
		BELT = belt;
		RIDER_NAME = ridername;
	}

	public List<MobEffectInstance> getPotionEffectList() {
		return potionEffectList;
	}

	public int getBelt() {
		return BELT;
	}

	public String getFormName(Boolean isFlaying) {
		if (isFlaying&FLYING_TEXT) return FORM_NAME+"_wing";
		else return FORM_NAME;
	}


	public String getBeltTex() {
		return BELT_TEX;
	}

	public String get_Belt_Model() {
		if (UPDATED_BELT_MODEL!=null) return UPDATED_BELT_MODEL;
		return "geo/riderbelt.geo.json";
	}
	
	public String get_Model() {
		if (UPDATED_MODEL!=null) return UPDATED_MODEL;
		return "geo/ichigo.geo.json";
	}

	public String get_FlyingModel() {
		return FLYING_MODEL;
	}
	public Boolean HasWingsIfFlying() {
		return FLYING_TEXT;
	}

	public RiderFormChangeItem alsoChange2ndSlot(Item item) {
		alsoChange2ndSlot=  (RiderFormChangeItem) item;
		return this;
	}

	public RiderFormChangeItem ChangeModel(String model) {
		UPDATED_MODEL=model;
		return this;
	}
	public RiderFormChangeItem ChangeBeltModel(String model) {
		UPDATED_BELT_MODEL=model;
		return this;
	}
	public RiderFormChangeItem ChangeSlot(int slot) {
		Slot=slot;
		return this;
	}

	public RiderFormChangeItem ifFlyingModelResource(String model) {
		FLYING_TEXT=true;
		FLYING_MODEL=model;
		return this;
	}

	public RiderFormChangeItem addAlternative( Item item) {
		alternative.add((RiderFormChangeItem) item);
		return this;
	}

	public RiderFormChangeItem addNeedItem( Item item) {
		NEEDITEM.add(item);
		return this;
	}
	
	public RiderFormChangeItem addShiftForm(Item item) {
		STIFT_ITEM=item;
		return this;
	}
	
	public RiderFormChangeItem addSwitchForm(Item item) {
		SWITCH_ITEM=item;
		return this;
	}

	public BaseItem AddNeedItemList(List<Item> nEED_ITEM_DOGABAKI) {
		needItemList=nEED_ITEM_DOGABAKI;
		HAS_NEED_ITEM_LIST=true;
		return this;
	}
	
	public BaseItem AddCompatibilityList(String[] List) {
		 compatibilityList=List;
		return this;
	}

	public Boolean iscompatible(String rider) {
		
		for (int i = 0; i < compatibilityList.length; i++)
		{
			if (compatibilityList[i]==rider){
				return true;
			}
		}
		
		return false;
	}
	
	
	public Boolean CanChange(Player player,RiderDriverItem belt) {

		if (this == Modded_item_core.BLANK_FORM.get()) {
			return true;
		}
		else if(belt.Rider!=RIDER_NAME&!iscompatible(belt.Rider)) {
			return false;
		}
		if ( !NEEDITEM.isEmpty()) {
			for (int i = 0; i < NEEDITEM.size(); i++)
			{
				if (player.getInventory().countItem(NEEDITEM.get(i))==0){
					return false;
				}
			}
		}
		if  (HAS_NEED_ITEM_LIST) {
			for (int i = 0; i < needItemList.size(); i++)
			{
				if (player.getInventory().countItem(needItemList.get(i))==0){
					return false;
				}
			}
		}
		return true;
	}

	public InteractionResultHolder<ItemStack> use(Level p_41128_, Player p_41129_, InteractionHand p_41130_) {

		ItemStack itemstack = p_41129_.getItemInHand(p_41130_);

		ItemStack BELT = p_41129_.getItemBySlot(EquipmentSlot.FEET);

		if (BELT.getItem() instanceof RiderDriverItem belt) {

			if (STIFT_ITEM instanceof RiderFormChangeItem& p_41129_.isShiftKeyDown()) {
				((RiderFormChangeItem)STIFT_ITEM).use(p_41128_, p_41129_, p_41130_);
			}
			else if (CanChange(p_41129_,belt)) {
				if (alsoChange2ndSlot !=null)RiderDriverItem.set_Form_Item(p_41129_.getItemBySlot(EquipmentSlot.FEET),alsoChange2ndSlot, 2);

				if (SWITCH_ITEM!=null&RiderDriverItem.get_Form_Item(p_41129_.getItemBySlot(EquipmentSlot.FEET), Slot)==this) RiderDriverItem.set_Form_Item(p_41129_.getItemBySlot(EquipmentSlot.FEET),SWITCH_ITEM, Slot);
					else RiderDriverItem.set_Form_Item(p_41129_.getItemBySlot(EquipmentSlot.FEET),this, Slot);
			
			}else if(!alternative.isEmpty()){

				for (int i = 0; i < alternative.size(); i++)
				{
					RiderFormChangeItem alternativeItem_form_change = alternative.get(i);
					alternativeItem_form_change.use(p_41128_, p_41129_, p_41130_);
				}
			}
		}
		return InteractionResultHolder.sidedSuccess(itemstack, p_41128_.isClientSide());

	}
}

/**
	public RiderFormChangeItem ShiftForm(Item ShiftItem) {
		STIFT_ITEM = ShiftItem;
		return this;
	}

 **/
