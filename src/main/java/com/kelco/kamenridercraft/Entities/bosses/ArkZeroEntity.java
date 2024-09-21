package com.kelco.kamenridercraft.Entities.bosses;

import com.kelco.kamenridercraft.Entities.footSoldiers.BaseHenchmenEntity;
import com.kelco.kamenridercraft.Items.Zero_One_Rider_Items;
import com.kelco.kamenridercraft.Items.rider_armor_base.RiderDriverItem;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.monster.Zombie;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class ArkZeroEntity extends BaseHenchmenEntity {
	

	
    public ArkZeroEntity(EntityType<? extends Zombie> type, Level level) {
        super(type, level);
        NAME="ark_zero";
        this.setItemSlot(EquipmentSlot.HEAD, new ItemStack(Zero_One_Rider_Items.ZERO_ONE_HELMET.get()));
        this.setItemSlot(EquipmentSlot.CHEST, new ItemStack(Zero_One_Rider_Items.ZERO_ONE_CHESTPLATE.get()));
        this.setItemSlot(EquipmentSlot.LEGS, new ItemStack(Zero_One_Rider_Items.ZERO_ONE_LEGGINGS.get()));
        this.setItemSlot(EquipmentSlot.FEET, new ItemStack(Zero_One_Rider_Items.ARK_DRIVER_ZERO.get()));
    }

    public void aiStep() {
    	if (this.getItemBySlot(EquipmentSlot.FEET).getItem()==Zero_One_Rider_Items.ARK_DRIVER_ZERO.get() && RiderDriverItem.get_Form_Item(this.getItemBySlot(EquipmentSlot.FEET),1)!=Zero_One_Rider_Items.ARK_ONE_PROGRISEKEY.get()) {
    		if (this.getHealth()<100) {
    			if(this.getLastAttacker() instanceof Player) {
    				Player playerIn = (Player) this.getLastAttacker();
					playerIn.sendSystemMessage(Component.translatable("Singurize!").withStyle(ChatFormatting.DARK_RED));
    				
    				this.getAttribute(Attributes.MOVEMENT_SPEED).setBaseValue(0.5);
    				this.getAttribute(Attributes.ATTACK_DAMAGE).setBaseValue(10.0D);
    				this.getAttribute(Attributes.FOLLOW_RANGE).setBaseValue(128.0D);
    			}
    	        RiderDriverItem.set_Form_Item(this.getItemBySlot(EquipmentSlot.FEET), Zero_One_Rider_Items.ARK_ONE_PROGRISEKEY.get(), 1);
    		}
    	}
       super.aiStep();
    }
    

    public static AttributeSupplier setAttributes() {

        return Monster.createMonsterAttributes()
        		.add(Attributes.FOLLOW_RANGE, 135.0D)
        		.add(Attributes.MOVEMENT_SPEED,(double)0.3F)
        		.add(Attributes.ATTACK_DAMAGE, 10.0D)
        		.add(Attributes.ARMOR, 3.0D)
        		.add(Attributes.MAX_HEALTH, 200.0D)
        		.add(Attributes.SPAWN_REINFORCEMENTS_CHANCE)
        		.build();
     }
    

}
