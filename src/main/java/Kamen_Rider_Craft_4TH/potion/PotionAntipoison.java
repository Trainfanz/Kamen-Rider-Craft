package Kamen_Rider_Craft_4TH.potion;

import Kamen_Rider_Craft_4TH.util.Refercence;
import net.minecraft.client.Minecraft;
import net.minecraft.potion.Potion;
import net.minecraft.util.ResourceLocation;

public class PotionAntipoison extends Potion {

	public PotionAntipoison() {
		super(false, 0xe443ff);
		setPotionName("effect.antipoison");
		setIconIndex(5, 0);
		setRegistryName(new ResourceLocation(Refercence.MODID + ":" + "antipoison"));
	}
	
	@Override
	public boolean hasStatusIcon() {
		Minecraft.getMinecraft().renderEngine.bindTexture(new ResourceLocation(Refercence.MODID, "textures/gui/custom_effects.png"));
		return true;
	} 
}