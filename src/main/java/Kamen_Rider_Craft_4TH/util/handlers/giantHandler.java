package Kamen_Rider_Craft_4TH.util.handlers;

import Kamen_Rider_Craft_4TH.potion.PotionCore;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.ai.attributes.AbstractAttributeMap;
import net.minecraft.entity.passive.AbstractHorse;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.MathHelper;
import net.minecraftforge.client.event.RenderLivingEvent;
import net.minecraftforge.event.entity.EntityEvent;
import net.minecraftforge.event.entity.living.LivingEvent.LivingUpdateEvent;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class giantHandler
{
	
	@SideOnly(Side.CLIENT)
	@SubscribeEvent
	public void onEntityRenderPre(RenderLivingEvent.Pre event)
	{
		final EntityLivingBase entity = event.getEntity();
		
	
			if(entity.isPotionActive(PotionCore.BIG_POTION))
			{
				
				float scaleHeight = 3;
				float scaleWidth = 3;
				
				GlStateManager.pushMatrix();
				GlStateManager.scale(scaleWidth, scaleHeight, scaleWidth);
				GlStateManager.translate(event.getX() / scaleWidth - event.getX(),event.getY() / scaleHeight - event.getY(), event.getZ() / scaleWidth - event.getZ());
			}
		}
		
	@SideOnly(Side.CLIENT)
	@SubscribeEvent
	public void onLivingRenderPost(RenderLivingEvent.Post event)
	{
		final EntityLivingBase entity = event.getEntity();
		
		if(entity.isPotionActive(PotionCore.BIG_POTION))
		{
				GlStateManager.popMatrix();
		}
	}
	
	
}