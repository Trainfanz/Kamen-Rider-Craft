package com.kelco.kamenridercraft.Items;

import com.kelco.kamenridercraft.KamenRiderCraftCore;
import com.kelco.kamenridercraft.Blocks.MachineBlocks.GaiaMemoryRefinerBlock;
import com.kelco.kamenridercraft.Effect.Effect_core;
import com.kelco.kamenridercraft.Items.ooo.OOODriverItem;
import com.kelco.kamenridercraft.Items.rider_armor_base.BaseBlasterItem;
import com.kelco.kamenridercraft.Items.rider_armor_base.BaseItem;
import com.kelco.kamenridercraft.Items.rider_armor_base.BaseShieldItem;
import com.kelco.kamenridercraft.Items.rider_armor_base.BaseSwordItem;
import com.kelco.kamenridercraft.Items.rider_armor_base.RiderArmorItem;
import com.kelco.kamenridercraft.Items.rider_armor_base.RiderDriverItem;
import com.kelco.kamenridercraft.Items.rider_armor_base.RiderFormChangeItem;
import com.kelco.kamenridercraft.Items.w.MetalShaftItem;
import com.kelco.kamenridercraft.Items.w.WDriverItem;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterials;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ShieldItem;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tiers;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class OOO_Rider_Items {

	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, KamenRiderCraftCore.MODID);

	public static final RegistryObject<Item> CELL_MEDAL = ITEMS.register("cellmedal",
			() -> new BaseItem(new Item.Properties()).AddToTabList(RiderTabs.OOO_TAB_ITEM));

	
	public static final RegistryObject<Item> OOOHELMET = ITEMS.register("ooohead",
			() -> new RiderArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.HELMET, new Item.Properties()).AddToTabList(RiderTabs.OOO_TAB_ITEM).ChangeRepairItem(CELL_MEDAL.get()));
	public static final RegistryObject<Item> OOOCHESTPLATE = ITEMS.register("oootroso",
			() -> new RiderArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.CHESTPLATE, new Item.Properties()).AddToTabList(RiderTabs.OOO_TAB_ITEM).ChangeRepairItem(CELL_MEDAL.get()));
	public static final RegistryObject<Item> OOOLEGGINGS = ITEMS.register("ooolegs",
			() -> new RiderArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.LEGGINGS, new Item.Properties()).AddToTabList(RiderTabs.OOO_TAB_ITEM).ChangeRepairItem(CELL_MEDAL.get()));



	public static final RegistryObject<Item> TAKA_MEDAL = ITEMS.register("taka_medal",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_taka","ooo","ooodriver_belt",
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 1,true,false),
					new MobEffectInstance(MobEffects.JUMP, 40, 0,true,false))
			.AddToTabList(RiderTabs.OOO_TAB_ITEM));

	
	public static final RegistryObject<Item> TORA_MEDAL = ITEMS.register("tora_medal",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_tora","ooo","ooodriver_belt",
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 1,true,false),
					new MobEffectInstance(Effect_core.PUNCH.get(), 40, 0,true,false))
			.ChangeSlot(2).AddToTabList(RiderTabs.OOO_TAB_ITEM));

	public static final RegistryObject<Item> BATTA_MEDAL = ITEMS.register("batta_medal",
			() -> new RiderFormChangeItem(new Item.Properties(),0,"_batta","ooo","ooodriver_belt",
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 1,true,false),
					new MobEffectInstance(Effect_core.PUNCH.get(), 40, 0,true,false))
			.ChangeSlot(3).AddToTabList(RiderTabs.OOO_TAB_ITEM));


	public static final RegistryObject<Item> OOODRIVER = ITEMS.register("ooodriver",
			() -> new OOODriverItem(ArmorMaterials.DIAMOND,"ooo",TAKA_MEDAL ,OOOHELMET,OOOCHESTPLATE,OOOLEGGINGS , new Item.Properties())
			.Add_Extra_Base_Form_Items(TORA_MEDAL,BATTA_MEDAL).AddToTabList(RiderTabs.OOO_TAB_ITEM));



	

	public static void register(IEventBus eventBus) {
		ITEMS.register(eventBus);
	}

}