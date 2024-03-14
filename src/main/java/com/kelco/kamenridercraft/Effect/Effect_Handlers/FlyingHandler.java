package com.kelco.kamenridercraft.Effect.Effect_Handlers;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraft.world.level.GameType;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.client.Minecraft;

import com.kelco.kamenridercraft.Effect.Effect_core;

@Mod.EventBusSubscriber
public class FlyingHandler {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute( event.player);
		}
	}



	private static void execute(Entity entity) {
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
				
				boolean checkGamemode = false;
				
					if (_player instanceof ServerPlayer _serverPlayer) {
						checkGamemode = _serverPlayer.gameMode.getGameModeForPlayer() != GameType.CREATIVE&_serverPlayer.gameMode.getGameModeForPlayer() != GameType.SPECTATOR;
					} else if (entity.level().isClientSide()) {
						checkGamemode =  Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()) != null && Minecraft.getInstance()
								.getConnection().getPlayerInfo(_player.getGameProfile().getId()).getGameMode() != GameType.SPECTATOR && Minecraft.getInstance()
										.getConnection().getPlayerInfo(_player.getGameProfile().getId()).getGameMode() != GameType.CREATIVE;
					}
					
				_player.getAbilities().mayfly = (checkGamemode? false:true);
				_player.onUpdateAbilities();
			}
		}
	}
}