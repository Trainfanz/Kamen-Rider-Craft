package Kamen_Rider_Craft_4TH.blocks.custom;

import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;

import java.util.List;
import java.util.function.BiFunction;

public enum BlockType {
    BASIC(CustomBlock::new),
    DIRECTIONAL(CustomDirectionalBlock::new),
    STAIR(CustomBlock::new),
    SLAB(CustomBlock::new),
    DOOR(CustomBlock::new),
    PANE(CustomBlock::new);

    private final TriFunction<Material, MapColor, List<Property>, CustomBlock> block;

    BlockType(TriFunction<Material, MapColor, List<Property>, CustomBlock> block) {
        this.block = block;
    }

    public CustomBlock get(Material material, MapColor color, List<Property> properties) {
        return block.apply(material, color, properties);
    }
}
