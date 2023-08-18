package com.kelco.kamenridercraft.loot;

import org.jetbrains.annotations.NotNull;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraftforge.common.loot.IGlobalLootModifier;
import net.minecraftforge.common.loot.LootModifier;
import net.minecraftforge.registries.ForgeRegistries;

public class AddItemModifier extends LootModifier {
	    public static final Supplier<Codec<AddItemModifier>> CODEC = Suppliers.memoize(()
	            -> RecordCodecBuilder.create(inst -> codecStart(inst).and(ForgeRegistries.ITEMS.getCodec()
	            .fieldOf("item").forGetter(m -> m.item)).apply(inst, AddItemModifier::new)));
	    private final Item item;

	    protected AddItemModifier(LootItemCondition[] conditionsIn, Item item) {
	        super(conditionsIn);
	        this.item = item;
	    }

	    @Override
	    protected @NotNull ObjectArrayList<ItemStack> doApply(ObjectArrayList<ItemStack> generatedLoot, LootContext context) {
	        if(context.getRandom().nextFloat() >= 0.5f) {
	            generatedLoot.add(new ItemStack(item));
	        }

	        return generatedLoot;
	    }

	    @Override
	    public Codec<? extends IGlobalLootModifier> codec() {
	        return CODEC.get();
	    }
	}

