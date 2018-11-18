package Kamen_Rider_Craft_4TH.blocks.custom;

import Kamen_Rider_Craft_4TH.TokuCraft_core;
import Kamen_Rider_Craft_4TH.util.IHasModel;
import com.google.common.collect.Lists;
import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.BlockFaceShape;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nullable;
import java.util.*;

public class CustomBlock extends Block implements IHasModel {
    private final boolean isTransparent;
    private final boolean isWalkThrough;

    protected CustomBlock(Material material, MapColor color, List<Property> properties) {
        super(material, color);
        isTransparent = properties.contains(Property.TRANSPARENT);
        isWalkThrough = properties.contains(Property.WALKTHROUGH);
    }

    @SideOnly(Side.CLIENT)
    public BlockRenderLayer getBlockLayer() {
        return isTransparent ? BlockRenderLayer.TRANSLUCENT : BlockRenderLayer.SOLID;
    }

    public boolean isFullCube(IBlockState state) {
        return !isWalkThrough;
    }

    public boolean isOpaqueCube(IBlockState state)
    {
        return isTransparent;
    }

    @Nullable
    public AxisAlignedBB getCollisionBoundingBox(IBlockState blockState, IBlockAccess worldIn, BlockPos pos) {
        return isWalkThrough ? NULL_AABB : super.getCollisionBoundingBox(blockState, worldIn, pos);
    }

    public BlockFaceShape getBlockFaceShape(IBlockAccess worldIn, IBlockState state, BlockPos pos, EnumFacing face) {
        return isWalkThrough ? BlockFaceShape.UNDEFINED : super.getBlockFaceShape(worldIn, state, pos, face);
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
        private float lightLevel = 0;
        private int lightOpacity = 0;
        private Map<String, Integer> harvestLevels = new HashMap<>();
        private float hardness = 0;
        private CreativeTabs tab = CreativeTabs.MISC;
        private BlockType type = BlockType.BASIC;
        private List<Property> properties = new ArrayList<>();

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

        public Builder blockType(BlockType type) {
            this.type = type;
            return this;
        }

        public Builder property(Property property) {
            this.properties = Lists.newArrayList(property);
            return this;
        }

        public Builder property(Property... properties) {
            this.properties = Arrays.asList(properties);
            return this;
        }

        public Block build() {
            CustomBlock block = type.get(material, mapColor != null ? mapColor : material.getMaterialMapColor(), properties);

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
