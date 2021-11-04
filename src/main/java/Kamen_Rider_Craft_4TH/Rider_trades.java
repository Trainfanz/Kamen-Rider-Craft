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
			recipeList.add(new MerchantRecipe(new ItemStack(Items.EMERALD,5+random.nextInt(5)),new ItemStack(RiderItems.goro_wine_bottle)));
			recipeList.add(new MerchantRecipe(new ItemStack(Items.EMERALD,5+random.nextInt(5)),new ItemStack(RiderItems.shin_stone)));
			recipeList.add(new MerchantRecipe(new ItemStack(Items.EMERALD,5+random.nextInt(5)),new ItemStack(RiderItems.j_stone)));
			recipeList.add(new MerchantRecipe(new ItemStack(Items.EMERALD,5+random.nextInt(5)),new ItemStack(RiderItems.zo_stone)));
			 System.out.println("Merchant recipe list = "+recipeList.getRecipiesAsTags());
		}
        
    }    

