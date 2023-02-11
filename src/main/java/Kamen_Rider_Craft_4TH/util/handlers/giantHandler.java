package Kamen_Rider_Craft_4TH.util.handlers;

import Kamen_Rider_Craft_4TH.potion.PotionCore;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.ai.attributes.AbstractAttributeMap;
import net.minecraft.entity.passive.AbstractHorse;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.potion.Potion;
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
	
	@SubscribeEvent
	public void onPlayerTick(TickEvent.PlayerTickEvent event)
	{
		boolean big = false;
		boolean small = false;
		final EntityLivingBase entity = event.player;
		if(event.player.isPotionActive(PotionCore.BIG_POTION)) big = true;
		if(event.player.isPotionActive(Potion.getPotionFromResourceLocation("supersentaicraft"+ ":" + "big"))) big = true;
		if(event.player.isPotionActive(Potion.getPotionFromResourceLocation("ultracraft"+ ":" + "big"))) big = true;
		
		if(event.player.isPotionActive(PotionCore.SMALL_POTION)) small = true;
		if(event.player.isPotionActive(Potion.getPotionFromResourceLocation("supersentaicraft"+ ":" + "small"))) small = true;
		if(event.player.isPotionActive(Potion.getPotionFromResourceLocation("ultracraft"+ ":" + "small"))) small = true;
		if(big&!small){
				event.player.width= 0.6F* 4.0F;
				event.player.height=1.8F* 3.0F;
				event.player.eyeHeight=event.player.getDefaultEyeHeight()* 3.0F;
				
				final double d0 = (0.6F* 4.0) / 2.0D;
				final AxisAlignedBB aabb = entity.getEntityBoundingBox();
				entity.setEntityBoundingBox(new AxisAlignedBB(entity.posX - d0, aabb.minY, entity.posZ - d0,
						entity.posX + d0, aabb.minY + entity.height, entity.posZ + d0));
		} else if(small&!big){
			event.player.width = 0.8F;
			event.player.height =0.9F;
			event.player.eyeHeight = 0.5f;
			
			final double d0 = 0.8 / 2.0D;
			final AxisAlignedBB aabb = entity.getEntityBoundingBox();
			entity.setEntityBoundingBox(new AxisAlignedBB(entity.posX - d0, aabb.minY, entity.posZ - d0,
					entity.posX + d0, aabb.minY + entity.height, entity.posZ + d0));
		}else{
			event.player.width = 0.6F;
			event.player.height=1.8F;
			event.player.eyeHeight=event.player.getDefaultEyeHeight();
			final double d0 = 0.6 / 2.0D;
			final AxisAlignedBB aabb = entity.getEntityBoundingBox();
			entity.setEntityBoundingBox(new AxisAlignedBB(entity.posX - d0, aabb.minY, entity.posZ - d0,
					entity.posX + d0, aabb.minY + 1.8F, entity.posZ + d0));
		}
	}
	
	@SideOnly(Side.CLIENT)
	@SubscribeEvent
	public void onEntityRenderPre(RenderLivingEvent.Pre event)
	{
		final EntityLivingBase entity = event.getEntity();
		boolean big = false;
		boolean small = false;
	
		if(entity.isPotionActive(PotionCore.BIG_POTION)) big = true;
		
		if(entity.isPotionActive(PotionCore.SMALL_POTION)) small = true;
		
		
			if(big&!small)
			{
				
				float scaleHeight = 3;
				float scaleWidth = 3;
				
				GlStateManager.pushMatrix();
				GlStateManager.scale(scaleWidth, scaleHeight, scaleWidth);
				GlStateManager.translate(event.getX() / scaleWidth - event.getX(),event.getY() / scaleHeight - event.getY(), event.getZ() / scaleWidth - event.getZ());
			}else if(small&!big)
			{
				
				float scaleHeight = 0.4f;
				float scaleWidth = 0.4f;
				
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
		
		if(entity.isPotionActive(PotionCore.BIG_POTION)||entity.isPotionActive(PotionCore.SMALL_POTION))
		{
				GlStateManager.popMatrix();
		}
	}
	
	
}