package com.kelco.kamenridercraft.Items.rider_armor_base;


import net.minecraft.client.model.HumanoidModel;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.decoration.ArmorStand;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.client.extensions.common.IClientItemExtensions;
import org.jetbrains.annotations.NotNull;

import com.kelco.kamenridercraft.Entities.Bikes.baseBikeEntity;
import com.kelco.kamenridercraft.Items.Modded_item_core;
import com.kelco.kamenridercraft.Items.client.RiderArmorRenderer;
import com.mojang.datafixers.FunctionType.Instance;

import software.bernie.geckolib.animatable.GeoItem;
import software.bernie.geckolib.constant.DataTickets;
import software.bernie.geckolib.core.animatable.instance.AnimatableInstanceCache;
import software.bernie.geckolib.core.animatable.instance.SingletonAnimatableInstanceCache;
import software.bernie.geckolib.core.animation.*;
import software.bernie.geckolib.core.object.PlayState;

import java.util.List;
import java.util.function.Consumer;

public class RiderArmorItem extends ArmorItem implements GeoItem {
	private AnimatableInstanceCache cache = new SingletonAnimatableInstanceCache(this);
	private Item RepairItem = Modded_item_core.RIDER_CIRCUIT.get();
	
	public RiderArmorItem(ArmorMaterial material, Type type, Properties properties) {
		super(material, type, properties);
	
	}

	@Override
	public void initializeClient(Consumer<IClientItemExtensions> consumer) {
		consumer.accept(new IClientItemExtensions() {
			private RiderArmorRenderer renderer;
			
			@Override
			public @NotNull HumanoidModel<?> getHumanoidArmorModel(LivingEntity livingEntity, ItemStack itemStack,
					EquipmentSlot equipmentSlot, HumanoidModel<?> original) {
					this.renderer = new RiderArmorRenderer(livingEntity, equipmentSlot);

				this.renderer.prepForRender(livingEntity, itemStack, equipmentSlot, original);
				return this.renderer;
			}
		});
	}

	public RiderArmorItem AddToTabList(List<Item> TabList) {
		TabList.add(this);
		return this;
	}

	
	@Override
	public void registerControllers(AnimatableManager.ControllerRegistrar controllerRegistrar) {
		RawAnimation IDLE = RawAnimation.begin().thenLoop("idle");
		RawAnimation WALK = RawAnimation.begin().thenLoop("walk");
		RawAnimation SNEAK = RawAnimation.begin().thenLoop("sneak");

		controllerRegistrar.add(new AnimationController<RiderArmorItem>(this, "Walk/Idle", 20, state -> {
			  Entity entity = state.getData(DataTickets.ENTITY);
			  
			  Boolean IsWaking = false;
			  if (entity instanceof Player player) {

				 
				  
				  if(player.getDeltaMovement().x!=0||player.getDeltaMovement().z!=0)IsWaking=true;
			}
			  
			state.setAndContinue(IsWaking ? WALK:IDLE);
			
			 state.setAndContinue(entity.isShiftKeyDown() ? SNEAK:IsWaking ? WALK:IDLE);
		return PlayState.CONTINUE;
	    }));

	}

	public RiderArmorItem ChangeRepairItem(Item item) {
		RepairItem = item;
		return this;
	}
	
	public boolean isValidRepairItem(ItemStack p_40392_, ItemStack p_40393_) {
		return p_40393_.getItem()== RepairItem;
	}
	

	
	@Override
	public AnimatableInstanceCache getAnimatableInstanceCache() {
		return cache;
	}
}