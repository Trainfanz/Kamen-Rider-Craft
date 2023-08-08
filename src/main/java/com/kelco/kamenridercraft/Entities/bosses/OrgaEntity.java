package com.kelco.kamenridercraft.Entities.bosses;

import com.kelco.kamenridercraft.Entities.footSoldiers.BaseHenchmenEntity;
import com.kelco.kamenridercraft.Items.Faiz_Rider_Items;

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

public class OrgaEntity extends BaseHenchmenEntity {
	
		public OrgaEntity(EntityType<? extends Zombie> type, Level level) {
        super(type, level);
        NAME="horse_orpnoch";
        this.setItemSlot(EquipmentSlot.HEAD, new ItemStack(Faiz_Rider_Items.FAIZHELMET.get()));
        this.setItemSlot(EquipmentSlot.CHEST, new ItemStack(Faiz_Rider_Items.FAIZCHESTPLATE.get()));
        this.setItemSlot(EquipmentSlot.LEGS, new ItemStack(Faiz_Rider_Items.FAIZLEGGINGS.get()));
    }

    public void aiStep() {
    	if (this.getItemBySlot(EquipmentSlot.FEET).getItem()!=Faiz_Rider_Items.ORGA_DRIVER.get()) {
    		if (this.getHealth()<50) {
    			if(this.getLastAttacker() instanceof Player) {
    				Player playerIn = (Player) this.getLastAttacker();
					playerIn.sendSystemMessage(Component.translatable("<Kamen Rider Orga>Henshin!").withStyle(ChatFormatting.RED));
    				playerIn.sendSystemMessage(Component.translatable("Standing By! Complete!").withStyle(ChatFormatting.RED));
    				
    				this.getAttribute(Attributes.MOVEMENT_SPEED).setBaseValue(0.5);
    				this.getAttribute(Attributes.ATTACK_DAMAGE).setBaseValue(10.0D);
    				this.getAttribute(Attributes.FOLLOW_RANGE).setBaseValue(128.0D);
    			}
    	        this.setItemSlot(EquipmentSlot.MAINHAND, new ItemStack(Faiz_Rider_Items.ORGA_STLANZER.get()));
    	        this.setItemSlot(EquipmentSlot.FEET, new ItemStack(Faiz_Rider_Items.ORGA_DRIVER.get()));
    		}
    	}
       super.aiStep();
    }
 
    public static AttributeSupplier setAttributes() {

        return Monster.createMonsterAttributes()
        		.add(Attributes.FOLLOW_RANGE, 128.0D)
        		.add(Attributes.MOVEMENT_SPEED,(double)0.30F)
        		.add(Attributes.ATTACK_DAMAGE, 5.0D)
        		.add(Attributes.MAX_HEALTH, 100.0D)
        		.add(Attributes.SPAWN_REINFORCEMENTS_CHANCE)
        		.build();
     }
    

}