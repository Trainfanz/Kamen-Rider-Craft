package Kamen_Rider_Craft_4TH.potion;

import net.minecraft.client.Minecraft;
import net.minecraft.potion.Potion;
import net.minecraft.util.ResourceLocation;
import Kamen_Rider_Craft_4TH.util.Refercence;

public class PotionFly extends Potion {

	public PotionFly() {
		super(false, 0xacf8ff);
		setPotionName("effect.fly");
		setIconIndex(0, 0);
		//setRegistryName(new ResourceLocation(Refercence.MODID + ":" + "fly"));

		setRegistryName(new ResourceLocation("tokuPotions:" + "fly"));
	}
	
	@Override
	public boolean hasStatusIcon() {
		Minecraft.getMinecraft().renderEngine.bindTexture(new ResourceLocation(Refercence.MODID, "textures/gui/custom_effects.png"));
		return true;
	} 
}