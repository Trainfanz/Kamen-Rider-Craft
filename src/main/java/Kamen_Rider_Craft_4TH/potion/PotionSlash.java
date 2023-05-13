package Kamen_Rider_Craft_4TH.potion;

import Kamen_Rider_Craft_4TH.util.Refercence;
import net.minecraft.client.Minecraft;
import net.minecraft.potion.Potion;
import net.minecraft.util.ResourceLocation;

public class PotionSlash extends Potion {

	public PotionSlash() {
		super(false, 0x43edff);
		setPotionName("effect.slash");
		setIconIndex(6, 0);
		setRegistryName(new ResourceLocation(Refercence.MODID + ":" + "slash"));
	}
	
	@Override
	public boolean hasStatusIcon() {
		Minecraft.getMinecraft().renderEngine.bindTexture(new ResourceLocation(Refercence.MODID, "textures/gui/custom_effects.png"));
		return true;
	} 
}