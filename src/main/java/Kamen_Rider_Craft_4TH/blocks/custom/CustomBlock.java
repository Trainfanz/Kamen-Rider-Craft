package Kamen_Rider_Craft_4TH.blocks.custom;

import Kamen_Rider_Craft_4TH.TokuCraft_core;
import Kamen_Rider_Craft_4TH.util.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

import java.util.HashMap;
import java.util.Map;

public class CustomBlock extends Block implements IHasModel {
    private CustomBlock(Material material, MapColor color) {
        super(material, color);
    }

    public static Builder builder() {
        return new Builder();
    }

    @Override
    public void registerModels() {
        TokuCraft_core.proxy.registerItemRender(Item.getItemFromBlock(this),0,"inventory");
    }

    public static class Builder {
        private String name = null;
        private Material material = Material.ROCK;
        private MapColor mapColor = null;
        private boolean isDirectional = false;
        private float lightLevel = 0;
        private int lightOpacity = 0;
        private Map<String, Integer> harvestLevels = new HashMap<>();
        private float hardness;
        private CreativeTabs tab;

        public Builder mapColor(MapColor mapColor) {
            this.mapColor = mapColor;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder material(Material material) {
            this.material = material;
            return this;
        }

        public Builder isDirectional(boolean isDirectional) {
            this.isDirectional = isDirectional;
            return this;
        }

        public Builder lightLevel(float lightLevel) {
            this.lightLevel = lightLevel;
            return this;
        }

        public Builder lightOpacity(int lightOpacity) {
            this.lightOpacity = lightOpacity;
            return this;
        }

        public Builder harvestLevel(String clazz, Integer level) {
            this.harvestLevels.put(clazz, level);
            return this;
        }

        public Builder hardness(float hardness) {
            this.hardness = hardness;
            return this;
        }

        public Block build() {
            Block block = isDirectional ? new CustomDirectionalBlock(material, mapColor != null ? mapColor : material.getMaterialMapColor()) : new CustomBlock(material, mapColor != null ? mapColor : material.getMaterialMapColor());

            //if(name == null) throw new Exception("Block name can't be null!");
            block.setUnlocalizedName(name);
            block.setRegistryName(name);
            block.setLightLevel(lightLevel);
            block.setLightOpacity(lightOpacity);
            harvestLevels.forEach(block::setHarvestLevel);
            block.setHardness(hardness);
            block.setCreativeTab(tab);

            TokuCraft_core.ITEMS.add(new ItemBlock(block).setRegistryName(block.getRegistryName()));
            TokuCraft_core.BLOCKS.add(block);

            return block;
        }

        public Builder setCreativeTabe(CreativeTabs tab) {
            this.tab = tab;
            return this;
        }
    }
}
