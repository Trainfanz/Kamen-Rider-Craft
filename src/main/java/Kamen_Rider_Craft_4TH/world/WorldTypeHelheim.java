
package Kamen_Rider_Craft_4TH.world;

import Kamen_Rider_Craft_4TH.world.gen.modDimensionWorldGen;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiCreateWorld;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;
import net.minecraft.world.WorldType;
import net.minecraft.world.biome.BiomeProvider;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.Random;

// TODO: Auto-generated Javadoc
public class WorldTypeHelheim extends WorldType {
    /**
     * Instantiates a new world type Helheim.
     */
    public WorldTypeHelheim() {
        super(modDimensionWorldGen.HELHEIM_NAME);

        // DEBUG
        System.out.println("Constructing WorldTypeHelheim");
    }

    /* (non-Javadoc)
     * @see net.minecraft.world.WorldType#getBiomeProvider(net.minecraft.world.World)
     */
    @Override
    public BiomeProvider getBiomeProvider(World world)
    {
        return new BiomeProviderHelheim();
    }

    /* (non-Javadoc)
     * @see net.minecraft.world.WorldType#handleSlimeSpawnReduction(java.util.Random, net.minecraft.world.World)
     */
    @Override
    public boolean handleSlimeSpawnReduction(Random random, World world)
    {
        return false;
    }

    /**
     * Called when 'Create New World' button is pressed before starting game.
     */
    @Override
    public void onGUICreateWorldPress() { }

    /**
     * Gets the spawn fuzz for players who join the world.
     * Useful for void world types.
     *
     * @param world the world
     * @param server the server
     * @return Fuzz for entity initial spawn in blocks.
     */
    @Override
    public int getSpawnFuzz(WorldServer world, net.minecraft.server.MinecraftServer server) {
        return Math.max(0, server.getSpawnRadius(world));
    }

    /**
     * Called when the 'Customize' button is pressed on world creation GUI.
     *
     * @param mc The Minecraft instance
     * @param guiCreateWorld the createworld GUI
     */
    @Override
    @SideOnly(Side.CLIENT)
    public void onCustomizeButton(Minecraft mc, GuiCreateWorld guiCreateWorld) {
    }

    /**
     * Should world creation GUI show 'Customize' button for this world type?.
     *
     * @return if this world type has customization parameters
     */
    @Override
    public boolean isCustomizable()
    {
        return false;
    }

    /**
     * returns true if selecting this worldtype from the customize menu should display the generator.[worldtype].info
     * message
     *
     * @return true, if successful
     */
    @Override
    @SideOnly(Side.CLIENT)
    public boolean hasInfoNotice()
    {
        return true;
    }
}