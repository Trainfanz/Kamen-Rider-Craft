package Kamen_Rider_Craft_4TH.mobs;


import Kamen_Rider_Craft_4TH.util.Refercence;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.RenderBiped;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.RenderZombie;
import net.minecraft.entity.Entity;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

@SideOnly(Side.CLIENT)
public class RenderRiderMob2 extends RenderBiped
{
    private ResourceLocation texture;

    public RenderRiderMob2(ModelBiped par1ModelBase, float par2, String string)
    {
        super(Minecraft.getMinecraft().getRenderManager(), par1ModelBase, 0);
        texture = new ResourceLocation( Refercence.MODID, string);
    }


	protected ResourceLocation getEntityTexture(Entity entity) {
		// TODO Auto-generated method stub
		return texture;
	}
	
}