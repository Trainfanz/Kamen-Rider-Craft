package Kamen_Rider_Craft_4TH.util.handlers;

import Kamen_Rider_Craft_4TH.RiderItems;
import Kamen_Rider_Craft_4TH.TokuCraft_core;
import Kamen_Rider_Craft_4TH.potion.PotionCore;
import Kamen_Rider_Craft_4TH.util.IHasModel;
import Kamen_Rider_Craft_4TH.util.Refercence;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.Items;
import net.minecraft.init.MobEffects;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSword;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.world.storage.loot.LootEntryItem;
import net.minecraft.world.storage.loot.LootPool;
import net.minecraft.world.storage.loot.LootTableList;
import net.minecraft.world.storage.loot.RandomValueRange;
import net.minecraft.world.storage.loot.conditions.LootCondition;
import net.minecraft.world.storage.loot.functions.LootFunction;
import net.minecraft.world.storage.loot.functions.SetDamage;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.event.RenderLivingEvent;
import net.minecraftforge.event.LootTableLoadEvent;
import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;


@EventBusSubscriber
public class RegistyHandler {

	@SubscribeEvent
	public static void onFly(TickEvent.PlayerTickEvent event) {
		boolean fly = false;
		if(event.player.isPotionActive(PotionCore.FLY_POTION)) fly = true;
		if(event.player.isPotionActive(Potion.getPotionFromResourceLocation("supersentaicraft"+ ":" + "fly"))) fly = true;
		
		if(fly || event.player.isCreative() || event.player.isSpectator()) {
			event.player.capabilities.allowFlying = true;
			event.player.fallDistance = 0.0f;
		} else {
			fly = false;
			event.player.capabilities.isFlying = false;
			event.player.capabilities.allowFlying = false;
		}
	}

	
	
	@SubscribeEvent
	public static void onLivingUpate(TickEvent.PlayerTickEvent event) {
		
		
		if(event.player.isPotionActive(PotionCore.ANTIPOISON_POTION)) {
			event.player.removeActivePotionEffect(MobEffects.POISON);
		}
		
		if(event.player.isPotionActive(PotionCore.PUNCH_BOOST_POTION)) {
			if(event.player.getHeldItemMainhand().isEmpty()) {
				event.player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH,event.player.getActivePotionEffect(PotionCore.PUNCH_BOOST_POTION).getAmplifier(), 4,true,false));
			}
		}
		
		if(event.player.isPotionActive(PotionCore.SLASH_POTION)) {
			if(event.player.getHeldItemMainhand().getItem() instanceof ItemSword) {
				event.player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH,event.player.getActivePotionEffect(PotionCore.SLASH_POTION).getAmplifier(), 4,true,false));
			}
		}
		
		
		
		if(event.player.isPotionActive(PotionCore.FIRE_PUNCH_POTION)) {
			if(event.player.getHeldItemMainhand().isEmpty()) {
				if (event.player.isSwingInProgress) {
					if (event.player.getLastAttackedEntity() != null) {
						if (event.player.getAttackingEntity() == event.player.getLastAttackedEntity()) {
							event.player.getLastAttackedEntity().setFire(10);
						}
					}
				}
			}	
		}
	}
	

	@SubscribeEvent
	public static void onItemRagister(Register<Item> event){
		event.getRegistry().registerAll(TokuCraft_core.ITEMS.toArray(new Item[0]));
	}

	
	
	
	
	@SubscribeEvent
	public static void onBlockRagister(Register<Block> event){
		event.getRegistry().registerAll(TokuCraft_core.BLOCKS.toArray(new Block[0]));
	}
	
	@SubscribeEvent
	public static void onLootTablesLoaded(LootTableLoadEvent event) {
	 
	    if (event.getName().equals(LootTableList.CHESTS_NETHER_BRIDGE)) {
	 
	        final LootPool pool2 = event.getTable().getPool("main");
	 
	        if (pool2 != null) {
	 
	            // pool2.addEntry(new LootEntryItem(ITEM, WEIGHT, QUALITY, FUNCTIONS, CONDITIONS, NAME));
	            pool2.addEntry(new LootEntryItem(RiderItems.purple_medals_sealed, 20, 0, new LootFunction[0], new LootCondition[0], Refercence.MODID+":purple_medals"));
	           }
	    }
	    
	    if (event.getName().equals(LootTableList.ENTITIES_CHICKEN)) {
	   	 
	        final LootPool pool2 = event.getTable().getPool("pool1");
	 
	        if (pool2 != null) {
	 
	            // pool2.addEntry(new LootEntryItem(ITEM, WEIGHT, QUALITY, FUNCTIONS, CONDITIONS, NAME));
	            pool2.addEntry(new LootEntryItem(RiderItems.egg_chicken_memory, 1, 0, new LootFunction[0], new LootCondition[0], Refercence.MODID+":egg_chicken_memory"));
	            pool2.addEntry(new LootEntryItem(Items.CHICKEN, 5, 0, new LootFunction[0], new LootCondition[0], Refercence.MODID+":chicken"));
		         
	           }
	    }
	}

	
	@SubscribeEvent
	public static void onModelRagister(ModelRegistryEvent event){
		for (Item item : TokuCraft_core.ITEMS){
			if (item instanceof IHasModel ){
				((IHasModel)item).registerModels();
			}
		}for (Block item : TokuCraft_core.BLOCKS){
			if (item instanceof IHasModel){
				((IHasModel)item).registerModels();
			}
		}
	}
}
