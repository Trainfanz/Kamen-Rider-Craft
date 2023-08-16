package com.kelco.kamenridercraft.Items.rider_armor_base;


import java.util.ArrayList;
import java.util.List;

import com.google.common.collect.Lists;

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
	//private List<Item> NEEDSITEM = new ArrayList<Item>();
	protected String RIDER_NAME;
	private String BELT_TEX;
	private String UPDATED_MODEL;
	private String FLYING_MODEL;
	private Boolean FLYING_TEXT = false;
	private Item STIFT_ITEM = Items.APPLE;
	private List<RiderFormChangeItem> alternative = new ArrayList<RiderFormChangeItem>();
	private RiderFormChangeItem alsoChange2ndSlot;


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

	public RiderFormChangeItem addShiftForm(Item item) {
		STIFT_ITEM=item;
		return this;
	}

	public InteractionResultHolder<ItemStack> use(Level p_41128_, Player p_41129_, InteractionHand p_41130_) {

		ItemStack itemstack = p_41129_.getItemInHand(p_41130_);

		ItemStack belt = p_41129_.getItemBySlot(EquipmentSlot.FEET);

		if (belt.getItem() instanceof RiderDriverItem) {

			if (STIFT_ITEM instanceof RiderFormChangeItem& p_41129_.isShiftKeyDown()) {
				((RiderFormChangeItem)STIFT_ITEM).use(p_41128_, p_41129_, p_41130_);
			}
			else if (((RiderDriverItem)belt.getItem()).Rider==RIDER_NAME) {
				if (alsoChange2ndSlot !=null)RiderDriverItem.set_Form_Item(p_41129_.getItemBySlot(EquipmentSlot.FEET),alsoChange2ndSlot, 2);

				RiderDriverItem.set_Form_Item(p_41129_.getItemBySlot(EquipmentSlot.FEET),this, Slot);

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
	public Item getWing() {
		return WINGS;
	}


	public boolean getNeedItem(Player  playerIn) {
		boolean NEED = true;
		if (NEEDSITEM.isEmpty()){
			NEED=true;
		}
		else {
			for (int i = 0; i < NEEDSITEM.size(); i++)
			{
				if (!playerIn.inventory.hasItemStack(new ItemStack(NEEDSITEM.get(i)))){
						(new ItemStack(NEEDSITEM.get(i)))){
					NEED=false;
				}
			}
		}
		return NEED;
	}


	public RiderFormChangeItem addWing(Item wings) {
		WINGS = wings;
		return this;
	}
	public RiderFormChangeItem ShiftForm(Item ShiftItem) {
		STIFT_ITEM = ShiftItem;
		return this;
	}

	public RiderFormChangeItem addAlternative(RiderFormChangeItem alternativeItem) {
		alternative.add(alternativeItem);
		return this;
	}
	public RiderFormChangeItem addNeedItem(Item needitem) {
		NEEDSITEM.add(needitem);
		return this;
	}



 **/
