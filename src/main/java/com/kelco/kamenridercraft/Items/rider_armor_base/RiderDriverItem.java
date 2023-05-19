package com.kelco.kamenridercraft.Items.rider_armor_base;

import java.util.function.Consumer;
import java.util.List;

import org.jetbrains.annotations.NotNull;

import com.kelco.kamenridercraft.Items.client.RiderArmorRenderer;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraftforge.client.extensions.common.IClientItemExtensions;
import net.minecraftforge.registries.RegistryObject;

public class RiderDriverItem extends RiderArmorItem{

	public String armorNamePrefix;
	private RiderFormChangeItem Base_Form_Item;
	public String Rider;
	public Item HEAD;
	public Item TORSO;
	public Item LEGS; 


	public RiderDriverItem (ArmorMaterial material, String rider,RegistryObject<Item> baseFormItem,RegistryObject<Item> head,RegistryObject<Item>torso,RegistryObject<Item> legs, Properties properties)
	{
		super(material, ArmorItem.Type.BOOTS, properties);

		Rider=rider;
		Base_Form_Item=((RiderFormChangeItem)baseFormItem.get());
		HEAD=head.get();
		TORSO=torso.get(); 
		LEGS=legs.get();

	}


	@Override
	public void onArmorTick(ItemStack stack, Level level, Player player)
	{

		//player.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED,20, 1,true,false));

		if (player.getItemBySlot(EquipmentSlot.LEGS).getItem() == LEGS){
			if (player.getItemBySlot(EquipmentSlot.CHEST).getItem() == TORSO){
				if (player.getItemBySlot(EquipmentSlot.HEAD).getItem() == HEAD){
					if (player.getItemBySlot(EquipmentSlot.FEET).getItem() == this){

						List<MobEffectInstance> potionEffectList = get_Form_Item(player.getItemBySlot(EquipmentSlot.FEET),1).getPotionEffectList();
						for (int i = 0; i < potionEffectList.size(); i++)
						{
							player.setInvisible(true);
							player.addEffect(new MobEffectInstance(potionEffectList.get(i).getEffect(),potionEffectList.get(i).getDuration(),potionEffectList.get(i).getAmplifier(),true,false));
						}

					}
				}
			}
		}

	}

	public RiderArmorItem AddToTabList(List<Item> TabList) {
		TabList.add(this);
		return this;
	}

	@Override
	public void initializeClient(Consumer<IClientItemExtensions> consumer) {
		consumer.accept(new IClientItemExtensions() {
			private RiderArmorRenderer renderer;

			@Override
			public @NotNull HumanoidModel<?> getHumanoidArmorModel(LivingEntity livingEntity, ItemStack itemStack,
					EquipmentSlot equipmentSlot, HumanoidModel<?> original) {
				this.renderer = new RiderArmorRenderer(livingEntity, equipmentSlot);

				this.renderer.prepForRender(livingEntity, itemStack, equipmentSlot, original);
				return this.renderer;
			}
		});
	}


	public static String GET_TEXT(ItemStack itemstack, EquipmentSlot equipmentSlot)
	{
		if (equipmentSlot == EquipmentSlot.FEET) {
			
			return "belts/"+get_Form_Item(itemstack,1).getBeltTex();
		}
		else return get_Form_Item(itemstack,1).getFormName();
	}


	public static void set_Form_Item(ItemStack itemstack, Item ITEM,int SLOT)
	{
		if (!itemstack.hasTag())
		{
			itemstack.setTag(new CompoundTag());
		}
		if (itemstack.getItem() instanceof RiderDriverItem) {
			itemstack.getTag().putInt("slot"+SLOT, Item.getId(ITEM));
		}
	}

	public static RiderFormChangeItem get_Form_Item(ItemStack itemstack,int SLOT)
	{
		if (!itemstack.hasTag())
		{
			return  ((RiderDriverItem)itemstack.getItem()).Base_Form_Item;
		}else if (Item.byId(itemstack.getTag().getInt("slot"+SLOT))instanceof RiderFormChangeItem){
			return (RiderFormChangeItem) Item.byId(itemstack.getTag().getInt("slot"+SLOT));
		}else{
			return ((RiderDriverItem)itemstack.getItem()).Base_Form_Item;
		}
	}

}