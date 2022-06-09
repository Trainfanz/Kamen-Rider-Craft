package Kamen_Rider_Craft_4TH.potion;

import Kamen_Rider_Craft_4TH.util.Refercence;
import net.minecraft.client.Minecraft;
import net.minecraft.potion.Potion;
import net.minecraft.util.ResourceLocation;

public class PotionBugsterVirus extends Potion {

	public PotionBugsterVirus() {
		super(false, 0xfc813e);
		setPotionName("effect.bugster_virus");
		setIconIndex(7, 0);
		setRegistryName(new ResourceLocation(Refercence.MODID + ":" + "bugster_virus"));
	}
	
	@Override
	public boolean hasStatusIcon() {
		Minecraft.getMinecraft().renderEngine.bindTexture(new ResourceLocation(Refercence.MODID, "textures/gui/custom_effects.png"));
		return true;
	} 
}