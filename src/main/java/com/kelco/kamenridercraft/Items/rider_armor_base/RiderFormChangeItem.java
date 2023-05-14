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
import net.minecraft.world.level.Level;

public class RiderFormChangeItem extends Item {

	private String FORM_NAME;
	private List<MobEffectInstance> potionEffectList;
	private int BELT;
	private List<Item> NEEDSITEM = new ArrayList<Item>();
	protected String RIDER_NAME;
	private String BELT_TEX;
	//private Item WINGS = ShowaRiderItems.blanknoitem;
	//private Item STIFT_ITEM = ShowaRiderItems.blanknoitem;
	private List<RiderFormChangeItem> alternative = new ArrayList<RiderFormChangeItem>();



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

	public String getFormName() {
		return FORM_NAME;
	}
	
	public String getBeltTex() {
		return BELT_TEX;
	}

	public RiderFormChangeItem AddToTabList(List<Item> TabList) {
		TabList.add(this);
		return this;
	}

		 public InteractionResultHolder<ItemStack> use(Level p_41128_, Player p_41129_, InteractionHand p_41130_) {
			  
	    ItemStack itemstack = p_41129_.getItemInHand(p_41130_);

	    ItemStack belt = p_41129_.getItemBySlot(EquipmentSlot.FEET);
	    
	    if (belt.getItem() instanceof RiderDriverItem) {
	    
	    	if (((RiderDriverItem)belt.getItem()).Rider==RIDER_NAME)
			RiderDriverItem.set_Form_Item(p_41129_.getItemBySlot(EquipmentSlot.FEET),this, 1);
			
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





	public  RiderFormChangeItem keep_item()
	{
		this.setContainerItem(this);
		getContainerItem();
		return this;
	}


	public RiderFormChangeItem AddToList(List<Item> list,int num)
	{
		for (int i1 = 0; i1 < num; ++i1)
		{
			list.add(this);
		}
		return this;
	}


			 **/
	