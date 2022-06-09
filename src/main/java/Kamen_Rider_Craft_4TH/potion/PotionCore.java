package Kamen_Rider_Craft_4TH.potion;

import net.minecraft.client.Minecraft;
import net.minecraft.potion.Potion;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class PotionCore {

	public static final Potion FLY_POTION = new PotionFly();
	public static final Potion FIRE_PUNCH_POTION = new PotionFirePunch();
	public static final Potion PUNCH_BOOST_POTION = new PotionPunchBoost();
	public static final Potion BIG_POTION = new PotionBig();
	public static final Potion SMALL_POTION = new PotionSmall();
	

	public static final Potion BUGSTER_POTION = new PotionBugsterVirus();
	public static final Potion SLASH_POTION = new PotionSlash();
	public static final Potion ANTIPOISON_POTION = new PotionAntipoison();

		
	public static void init(FMLInitializationEvent event) {
		ForgeRegistries.POTIONS.register(FLY_POTION);
		ForgeRegistries.POTIONS.register(FIRE_PUNCH_POTION);
		ForgeRegistries.POTIONS.register(PUNCH_BOOST_POTION);
		ForgeRegistries.POTIONS.register(BIG_POTION);
		ForgeRegistries.POTIONS.register(SMALL_POTION);

		ForgeRegistries.POTIONS.register(BUGSTER_POTION);
		ForgeRegistries.POTIONS.register(SLASH_POTION);
		ForgeRegistries.POTIONS.register(ANTIPOISON_POTION);
	}
	
}