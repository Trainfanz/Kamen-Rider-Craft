package com.kelco.kamenridercraft.Effect.Effect_Handlers;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Cancelable;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.client.event.RenderPlayerEvent;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.level.GameType;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.player.PlayerRenderer;

import javax.annotation.Nullable;

import org.jetbrains.annotations.ApiStatus;

import com.kelco.kamenridercraft.Effect.Effect_core;
import com.mojang.blaze3d.vertex.PoseStack;

@Mod.EventBusSubscriber
public class FlyingHandler {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player);
		}
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;

		if (entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(Effect_core.FLYING.get()) : false) {
			if (entity instanceof Player _player) {
				_player.getAbilities().mayfly = (true);
				_player.onUpdateAbilities();
			}
		}	
		else if (!(entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(Effect_core.FLYING.get()) : false)) {
			if (entity instanceof Player _player) {
				_player.getAbilities().mayfly = (false);
				_player.onUpdateAbilities();
			}
		}


		if (new Object() {
			public boolean checkGamemode(Entity _ent) {
				if (_ent instanceof ServerPlayer _serverPlayer) {
					return _serverPlayer.gameMode.getGameModeForPlayer() == GameType.CREATIVE;
				} else if (_ent.level().isClientSide() && _ent instanceof Player _player) {
					return Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()) != null && Minecraft.getInstance()
							.getConnection().getPlayerInfo(_player.getGameProfile().getId()).getGameMode() == GameType.CREATIVE;
				}
				return false;
			}
		}.checkGamemode(entity)) {
			if (entity instanceof Player _player) {
				_player.getAbilities().mayfly = (true);
				_player.onUpdateAbilities();
			}
		}
		if (new Object() {
			public boolean checkGamemode(Entity _ent) {
				if (_ent instanceof ServerPlayer _serverPlayer) {
					return _serverPlayer.gameMode.getGameModeForPlayer() == GameType.SPECTATOR;
				} else if (_ent.level().isClientSide() && _ent instanceof Player _player) {
					return Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()) != null && Minecraft.getInstance()
							.getConnection().getPlayerInfo(_player.getGameProfile().getId()).getGameMode() == GameType.SPECTATOR;
				}
				return false;
			}
		}.checkGamemode(entity)) {
			if (entity instanceof Player _player) {
				_player.getAbilities().mayfly = (true);
				_player.onUpdateAbilities();
			}
		}
	}
}