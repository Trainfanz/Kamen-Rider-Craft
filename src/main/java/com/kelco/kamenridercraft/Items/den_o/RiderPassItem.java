package com.kelco.kamenridercraft.Items.den_o;

import java.util.HashSet;
import java.util.List;

import com.kelco.kamenridercraft.Items.rider_armor_base.BaseItem;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.Mth;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraftforge.server.ServerLifecycleHooks;


public class RiderPassItem extends BaseItem {

	public RiderPassItem (Properties properties)
	{
		super(properties);
	}

	public static void teleportToDimension(ServerLevel otherDim, LivingEntity entity) {
		if (entity.isPassenger()) entity.stopRiding();
		entity.teleportTo(otherDim, entity.getX(), Mth.clamp(entity.getY(), (double)otherDim.getMinBuildHeight(), (double)(otherDim.getMinBuildHeight() + ((ServerLevel)otherDim).getLogicalHeight() - 1)), entity.getZ(), new HashSet<>(), 0, 0);
		while (!otherDim.noCollision(entity) || otherDim.containsAnyLiquid(entity.getBoundingBox())) entity.teleportRelative(0.0, 2.0, 0.0);
		entity.randomTeleport(entity.getX(), entity.getY(), entity.getZ(), false);
	}

	public InteractionResultHolder<ItemStack> use(Level p_41128_, Player p_41129_, InteractionHand p_41130_) {
		ItemStack itemstack = p_41129_.getItemInHand(p_41130_);

		ResourceKey<Level> SANDS_OF_TIME = ResourceKey.create(Registries.DIMENSION, new ResourceLocation("kamenridercraft:sands_of_time"));
		MinecraftServer Server = ServerLifecycleHooks.getCurrentServer();  

		if (!p_41128_.isClientSide()) {
			List<TamableAnimal> nearbyAllies = p_41128_.getEntitiesOfClass(TamableAnimal.class, p_41129_.getBoundingBox().inflate(30), entity ->
															(entity.getOwner() == p_41129_ && !entity.isOrderedToSit()));
			if (p_41128_.dimension() == SANDS_OF_TIME) {
				for (LivingEntity ally : nearbyAllies) teleportToDimension(Server.overworld(), ally);
				teleportToDimension(Server.overworld(), p_41129_);
			} else {
				for (LivingEntity ally : nearbyAllies) teleportToDimension(Server.getLevel(SANDS_OF_TIME), ally);
				teleportToDimension(Server.getLevel(SANDS_OF_TIME), p_41129_);
			}
			if (itemstack.isDamageableItem()) itemstack.hurtAndBreak(1, p_41129_, player -> player.broadcastBreakEvent(player.getUsedItemHand()));
			p_41129_.getCooldowns().addCooldown(this, 500);
		}
		
		return InteractionResultHolder.sidedSuccess(itemstack, p_41128_.isClientSide());
	}
}