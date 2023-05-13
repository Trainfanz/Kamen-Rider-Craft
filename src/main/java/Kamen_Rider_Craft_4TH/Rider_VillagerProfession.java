package Kamen_Rider_Craft_4TH;

import java.util.Random;

import Kamen_Rider_Craft_4TH.util.Refercence;
import net.minecraft.entity.IMerchant;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.entity.passive.EntityVillager.ITradeList;
import net.minecraft.entity.passive.EntityVillager.PriceInfo;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.village.MerchantRecipe;
import net.minecraft.village.MerchantRecipeList;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;
import net.minecraftforge.fml.common.registry.VillagerRegistry.VillagerCareer;
import net.minecraftforge.fml.common.registry.VillagerRegistry.VillagerProfession;
import net.minecraftforge.registries.IForgeRegistry;

@ObjectHolder(Refercence.MODID)
public class Rider_VillagerProfession 
{
	public final static VillagerProfession shocker = null;
	public static VillagerCareer shocker_villager;
	
	public final static VillagerProfession humagear = null;
	public static VillagerCareer humagear_villager;
	
	@Mod.EventBusSubscriber(modid=Refercence.MODID)
	public static class RegistrationHandler
	{
		@SubscribeEvent
		public static void onEvent(final RegistryEvent.Register<VillagerProfession> event)
		{
			final IForgeRegistry<VillagerProfession> registry = event.getRegistry();
			
			System.out.println("Registering Villager Professions");
			
			registry.register(new VillagerProfession(Refercence.MODID + ":shocker",Refercence.MODID + ":textures/entities/shocker_villager.png", Refercence.MODID + ":textures/entities/zombie_shocker_villager.png"));
			registry.register(new VillagerProfession(Refercence.MODID + ":humagear",Refercence.MODID + ":textures/entities/humagear_villager.png", Refercence.MODID + ":textures/entities/zombie_humagear_villager.png"));
			
		}
	}
	
	public static void associateCareersAndTrades()
	{
		System.out.println("Associating Careers and Trades to Villager Professions");
		
		humagear_villager = new VillagerCareer(humagear, "humagear_villager")
				.addTrade(1, new TradeHumagearItems());
		
		shocker_villager = new VillagerCareer(shocker, "shocker_villager")
				.addTrade(1, new TradeShockerItems());
	}
	
	
	public static class TradeHumagearItems implements ITradeList
	{
			
		public TradeHumagearItems()
		{

				}
		
		@Override
		public void addMerchantRecipe(IMerchant merchant, MerchantRecipeList recipeList, Random random) 
		{
			recipeList.add(new MerchantRecipe(new ItemStack(Items.EMERALD,1+random.nextInt(2)),new ItemStack(ReiwaRiderItems.blank_progrise_key)));
			recipeList.add(new MerchantRecipe(new ItemStack(Items.EMERALD,2+random.nextInt(2)),new ItemStack(ReiwaRiderItems.humagear_progrise_key)));
			recipeList.add(new MerchantRecipe(new ItemStack(ReiwaRiderItems.hiden_metal,3+random.nextInt(2)),new ItemStack(Items.EMERALD)));
			
			System.out.println("Merchant recipe list = "+recipeList.getRecipiesAsTags());
		}
	}
	
	public static class TradeShockerItems implements ITradeList
	{
			
		public TradeShockerItems()
		{

				}
		
		@Override
		public void addMerchantRecipe(IMerchant merchant, MerchantRecipeList recipeList, Random random) 
		{
			recipeList.add(new MerchantRecipe(new ItemStack(Items.EMERALD,2+random.nextInt(2)),new ItemStack(ShowaRiderItems.goro_wine_bottle)));
			recipeList.add(new MerchantRecipe(new ItemStack(Items.EMERALD,2+random.nextInt(2)),new ItemStack(ShowaRiderItems.shin_stone)));
			recipeList.add(new MerchantRecipe(new ItemStack(Items.EMERALD,2+random.nextInt(2)),new ItemStack(ShowaRiderItems.j_stone)));
			recipeList.add(new MerchantRecipe(new ItemStack(Items.EMERALD,2+random.nextInt(2)),new ItemStack(ShowaRiderItems.zo_stone)));
			
			System.out.println("Merchant recipe list = "+recipeList.getRecipiesAsTags());
		}
	}
}