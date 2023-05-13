package Kamen_Rider_Craft_4TH.potion;

import Kamen_Rider_Craft_4TH.util.Refercence;
import net.minecraft.client.Minecraft;
import net.minecraft.potion.Potion;
import net.minecraft.util.ResourceLocation;

public class PotionBig extends Potion {

	public PotionBig() {
		super(false, 0xc96161);
		setPotionName("effect.big");
		setIconIndex(3, 0);
		setRegistryName(new ResourceLocation(Refercence.MODID + ":" + "big"));
	}
	
	@Override
	public boolean hasStatusIcon() {
		Minecraft.getMinecraft().renderEngine.bindTexture(new ResourceLocation(Refercence.MODID, "textures/gui/custom_effects.png"));
		return true;
	} 
}