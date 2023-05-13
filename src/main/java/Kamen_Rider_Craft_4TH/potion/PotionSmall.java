package Kamen_Rider_Craft_4TH.potion;

import Kamen_Rider_Craft_4TH.util.Refercence;
import net.minecraft.client.Minecraft;
import net.minecraft.potion.Potion;
import net.minecraft.util.ResourceLocation;

public class PotionSmall extends Potion {

	public PotionSmall() {
		super(false, 0xc96161);
		setPotionName("effect.small");
		setIconIndex(4, 0);
		setRegistryName(new ResourceLocation(Refercence.MODID + ":" + "small"));
	}
	
	@Override
	public boolean hasStatusIcon() {
		Minecraft.getMinecraft().renderEngine.bindTexture(new ResourceLocation(Refercence.MODID, "textures/gui/custom_effects.png"));
		return true;
	} 
}