package Kamen_Rider_Craft_4TH.potion;

import Kamen_Rider_Craft_4TH.util.Refercence;
import net.minecraft.client.Minecraft;
import net.minecraft.potion.Potion;
import net.minecraft.util.ResourceLocation;

public class PotionBoost extends Potion {

	public PotionBoost() {
		super(false, 0xe443ff);
		setPotionName("effect.boost");
		setIconIndex(1, 1);
		setRegistryName(new ResourceLocation(Refercence.MODID + ":" + "boost"));
	}
	
	@Override
	public boolean hasStatusIcon() {
		Minecraft.getMinecraft().renderEngine.bindTexture(new ResourceLocation(Refercence.MODID, "textures/gui/custom_effects.png"));
		return true;
	} 
}