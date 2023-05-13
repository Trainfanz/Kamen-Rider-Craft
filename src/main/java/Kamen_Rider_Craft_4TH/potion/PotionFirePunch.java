package Kamen_Rider_Craft_4TH.potion;

import net.minecraft.client.Minecraft;
import net.minecraft.potion.Potion;
import net.minecraft.util.ResourceLocation;
import Kamen_Rider_Craft_4TH.util.Refercence;

public class PotionFirePunch extends Potion {

	public PotionFirePunch() {
		super(false, 0xf7c208);
		setPotionName("effect.fire_punch");
		setIconIndex(2, 0);
		setRegistryName(new ResourceLocation(Refercence.MODID + ":" + "fire_punch"));
	}
	
	@Override
	public boolean hasStatusIcon() {
		Minecraft.getMinecraft().renderEngine.bindTexture(new ResourceLocation(Refercence.MODID, "textures/gui/custom_effects.png"));
		return true;
	} 
}