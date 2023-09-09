package com.kelco.kamenridercraft.Blocks;

import java.util.function.Supplier;

import javax.annotation.Nullable;

import com.kelco.kamenridercraft.Entities.footSoldiers.BaseHenchmenEntity;

import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.stats.Stats;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
public class BossBlock extends BaseBlock {

	private Component TEXT;
	private Supplier<? extends EntityType<? extends BaseHenchmenEntity>> BOSS;
	
	//Component.translatable("<Shocker Rider>Henshin!").withStyle(ChatFormatting.YELLOW)
	//MobsCore.SHOCKER_RIDER.get();
	
	public BossBlock(Properties prop,Supplier<? extends EntityType<? extends BaseHenchmenEntity>> boss,Component text) {
		super(prop);
		TEXT=text;
		BOSS =boss;
	}

	@Override
	public void playerDestroy(Level wolrd, Player player, BlockPos pos, BlockState state, @Nullable BlockEntity p_49831_, ItemStack stack) {
		player.awardStat(Stats.BLOCK_MINED.get(this));
		player.causeFoodExhaustion(0.005F);
		 dropResources(state, wolrd, pos, p_49831_, player, stack, true);
		 
		BaseHenchmenEntity boss = BOSS.get().create(wolrd);
		if (boss != null) {
			boss.moveTo(pos.getX(), pos.getY(), pos.getZ(), 0, 0.0F);
			wolrd.addFreshEntity(boss);

			player.sendSystemMessage(TEXT);
		
	}
	     
	}

}