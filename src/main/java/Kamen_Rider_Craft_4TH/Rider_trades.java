package Kamen_Rider_Craft_4TH;

import java.util.Random;

import net.minecraft.entity.IMerchant;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.entity.passive.EntityVillager.ITradeList;
import net.minecraft.entity.passive.EntityVillager.PriceInfo;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.village.MerchantRecipe;
import net.minecraft.village.MerchantRecipeList;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.common.registry.VillagerRegistry;

public class Rider_trades implements ITradeList
    {
	


		@Override
		public void addMerchantRecipe(IMerchant merchant, MerchantRecipeList recipeList, Random random) {
			recipeList.add(new MerchantRecipe(new ItemStack(Items.EMERALD,2+random.nextInt(3)),new ItemStack(miscellaneousRiderItems.card_warrior_kamen_rider_manga)));

			recipeList.add(new MerchantRecipe(new ItemStack(Items.EMERALD,2+random.nextInt(3)),new ItemStack(ShowaRiderItems.rider3_vs_the_demon_of_general_black)));
			 System.out.println("Merchant recipe list = "+recipeList.getRecipiesAsTags());
		}
        
    }    

