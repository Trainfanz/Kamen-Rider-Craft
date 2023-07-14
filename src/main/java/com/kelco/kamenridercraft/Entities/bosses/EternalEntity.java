package com.kelco.kamenridercraft.Entities.bosses;

import java.util.Random;

import com.kelco.kamenridercraft.Entities.footSoldiers.BaseHenchmenEntity;
import com.kelco.kamenridercraft.Items.W_Rider_Items;
import com.kelco.kamenridercraft.Items.rider_armor_base.RiderDriverItem;
import com.kelco.kamenridercraft.Items.rider_armor_base.RiderFormChangeItem;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.monster.Zombie;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class EternalEntity extends BaseHenchmenEntity {
	
	public static final Item[] belt = new Item[] {W_Rider_Items.ETERNAL_MEMORY.get(),W_Rider_Items.ETERNAL_T2_MEMORY.get()};

	
    public EternalEntity(EntityType<? extends Zombie> type, Level level) {
        super(type, level);
        NAME="";
        this.setItemSlot(EquipmentSlot.HEAD, new ItemStack(W_Rider_Items.WHELMET.get()));
        this.setItemSlot(EquipmentSlot.CHEST, new ItemStack(W_Rider_Items.WCHESTPLATE.get()));
        this.setItemSlot(EquipmentSlot.LEGS, new ItemStack(W_Rider_Items.WLEGGINGS.get()));
        this.setItemSlot(EquipmentSlot.MAINHAND, new ItemStack(W_Rider_Items.ETERNAL_EDGE.get()));
        Random generator = new Random();
		int rand = generator.nextInt(belt.length);
		
		RiderFormChangeItem Gimmick = ((RiderFormChangeItem)belt[rand]);
				
		ItemStack LOST_DRIVER = new ItemStack(W_Rider_Items.LOSTDRIVER_ETERNAL.get());
		
		RiderDriverItem.set_Form_Item(LOST_DRIVER,Gimmick, 1);
		
        this.setItemSlot(EquipmentSlot.FEET, LOST_DRIVER );
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