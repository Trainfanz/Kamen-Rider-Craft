package com.kelco.kamenridercraft.Blocks;

import java.util.function.Supplier;

import com.kelco.kamenridercraft.KamenRiderCraftCore;
import com.kelco.kamenridercraft.Blocks.MachineBlocks.GaiaMemoryRefinerBlock;
import com.kelco.kamenridercraft.Items.Modded_item_core;
import com.kelco.kamenridercraft.Items.RiderTabs;

import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class Rider_Blocks {

	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, KamenRiderCraftCore.MODID);

	public static final RegistryObject<Block> SHOCKER_MONITOR = registerBlock("shocker_monitor",
			() -> new BaseFacingBlock(BlockBehaviour.Properties.of(Material.METAL)
					.lightLevel((glow) -> { return 15; }).strength(6f)).AddToTabList(RiderTabs.RIDER_BLOCK));


	public static final RegistryObject<Block> PURE_GAIA_MEMORY_BLOCK = registerBlock("pure_gaia_memory_block",
			() -> new BaseBlock(BlockBehaviour.Properties.of(Material.STONE)
					.lightLevel((glow) -> { return 15; }).strength(6f)).AddToTabList(RiderTabs.RIDER_BLOCK));

	public static final RegistryObject<Block> GAIA_MEMORY_ORE = registerBlock("gaiamemoryblock",
			() -> new BaseBlockDropExperience(BlockBehaviour.Properties.of(Material.STONE)
					.strength(6f).requiresCorrectToolForDrops().strength(4.5F, 3.0F), UniformInt.of(2, 6)).AddToTabList(RiderTabs.RIDER_BLOCK));

	public static final RegistryObject<Block> DEEPSLATE_GAIA_MEMORY_ORE = registerBlock("deepslate_gaiamemoryblock",
			() -> new BaseBlockDropExperience(BlockBehaviour.Properties.of(Material.STONE)
					.strength(6f).requiresCorrectToolForDrops().strength(4.5F, 3.0F).sound(SoundType.DEEPSLATE), UniformInt.of(2, 6)).AddToTabList(RiderTabs.RIDER_BLOCK));


	public static final RegistryObject<Block> GAIA_MEMORY_REFINER = registerBlock("gaia_memory_refiner",
			() -> new GaiaMemoryRefinerBlock(BlockBehaviour.Properties.of(Material.METAL)
					.strength(6f)).AddToTabList(RiderTabs.RIDER_BLOCK));

	
	private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
		RegistryObject<T> toReturn = BLOCKS.register(name, block);
		registerBlockItem(name, toReturn);
		return toReturn;
	}


	public static <T extends Block>RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block ){
		return  Modded_item_core.ITEMS.register(name, () -> new BlockItem(block.get(),new Item.Properties()));
	}


	public static void register(IEventBus eventBus) {
		BLOCKS.register(eventBus);
	}

}