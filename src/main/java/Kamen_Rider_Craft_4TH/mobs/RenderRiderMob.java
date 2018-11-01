package Kamen_Rider_Craft_4TH.mobs;


import Kamen_Rider_Craft_4TH.util.Refercence;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

@SideOnly(Side.CLIENT)
public class RenderRiderMob extends RenderLiving
{
    private ResourceLocation texture;

    public RenderRiderMob(ModelBase par1ModelBase, float par2, String string)
    {
        super(Minecraft.getMinecraft().getRenderManager(), par1ModelBase, par2);
        texture = new ResourceLocation(Refercence.MODID, string);
    }

	@Override
	protected ResourceLocation getEntityTexture(Entity entity) {
		// TODO Auto-generated method stub
		return texture;
	}
}