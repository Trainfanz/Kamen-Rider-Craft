package com.kelco.kamenridercraft.Entities.bosses;

import com.kelco.kamenridercraft.Entities.footSoldiers.BaseHenchmenEntity;
import com.kelco.kamenridercraft.Items.Agito_Rider_Items;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.monster.Zombie;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class AnotherAgitoEntity extends BaseHenchmenEntity {
	
    public AnotherAgitoEntity(EntityType<? extends Zombie> type, Level level) {
        super(type, level);
        NAME="";
        this.setItemSlot(EquipmentSlot.HEAD, new ItemStack(Agito_Rider_Items.AGITOHELMET.get()));
        this.setItemSlot(EquipmentSlot.CHEST, new ItemStack(Agito_Rider_Items.AGITOCHESTPLATE.get()));
        this.setItemSlot(EquipmentSlot.LEGS, new ItemStack(Agito_Rider_Items.AGITOLEGGINGS.get()));
        this.setItemSlot(EquipmentSlot.FEET, new ItemStack(Agito_Rider_Items.ANK_POINT.get()));
    }

 
    
    public static AttributeSupplier setAttributes() {

        return Monster.createMonsterAttributes()
        		.add(Attributes.FOLLOW_RANGE, 135.0D)
        		.add(Attributes.MOVEMENT_SPEED,(double)0.23F)
        		.add(Attributes.ATTACK_DAMAGE, 10.0D)
        		.add(Attributes.ARMOR, 3.0D)
        		.add(Attributes.MAX_HEALTH, 200.0D)
        		.add(Attributes.SPAWN_REINFORCEMENTS_CHANCE)
        		.build();
     }
    

}