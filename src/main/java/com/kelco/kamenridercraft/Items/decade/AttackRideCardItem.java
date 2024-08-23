package com.kelco.kamenridercraft.Items.decade;

import java.util.List;

import org.apache.commons.lang3.ArrayUtils;

import com.google.common.collect.Lists;
import com.kelco.kamenridercraft.Effect.Effect_core;
import com.kelco.kamenridercraft.Entities.MobsCore;
import com.kelco.kamenridercraft.Entities.summons.RiderSummonEntity;
import com.kelco.kamenridercraft.Items.Decade_Rider_Items;
import com.kelco.kamenridercraft.Items.rider_armor_base.BaseItem;
import com.kelco.kamenridercraft.Items.rider_armor_base.RiderDriverItem;

import net.minecraft.ChatFormatting;
import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.network.chat.Component;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.stats.Stats;
import net.minecraft.util.Mth;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.OwnableEntity;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.BowItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.server.ServerLifecycleHooks;
import net.minecraft.server.level.ServerLevel;


public class AttackRideCardItem extends BaseItem {

	public String[] FORMS = new String[] {""};
	private List<MobEffectInstance> EFFECTS;
	public Item ITEM;
	public int DAMAGE;
	public String SPECIAL;

	public AttackRideCardItem (Properties properties, String[] forms, MobEffectInstance... effects)
	{
		super(properties);
		
		FORMS = forms;
		EFFECTS = Lists.newArrayList(effects);
	}

	public AttackRideCardItem (Properties properties, String[] forms, Item item, int damage)
	{
		super(properties);
		
		FORMS = forms;
		ITEM = item;
		DAMAGE = damage;
	}

	public AttackRideCardItem (Properties properties, String[] forms, String special)
	{
		super(properties);
		
		FORMS = forms;
		SPECIAL = special;
	}

	public InteractionResultHolder<ItemStack> use(Level p_41128_, Player p_41129_, InteractionHand p_41130_) {
		
		ItemStack itemstack = p_41129_.getItemInHand(p_41130_);
		
		if (!p_41128_.isClientSide()
		&&p_41129_.getItemBySlot(EquipmentSlot.LEGS).getItem() == Decade_Rider_Items.DECADELEGGINGS.get()
		&&p_41129_.getItemBySlot(EquipmentSlot.CHEST).getItem() == Decade_Rider_Items.DECADECHESTPLATE.get()
		&&p_41129_.getItemBySlot(EquipmentSlot.HEAD).getItem() == Decade_Rider_Items.DECADEHELMET.get()){
			if (p_41129_.getItemBySlot(EquipmentSlot.FEET).getItem() == Decade_Rider_Items.DECADRIVER.get() || p_41129_.getItemBySlot(EquipmentSlot.FEET).getItem() == Decade_Rider_Items.DIEND_BELT.get() || p_41129_.getItemBySlot(EquipmentSlot.FEET).getItem() == Decade_Rider_Items.DARK_DECADRIVER.get()){
				ItemStack belt = p_41129_.getItemBySlot(EquipmentSlot.FEET);

				if (ArrayUtils.contains(FORMS, ((RiderDriverItem) belt.getItem()).GET_TEXT(belt, null, p_41129_, ((RiderDriverItem) belt.getItem()).Rider)) && !p_41128_.isClientSide()) {
					if (EFFECTS != null) {
						for (int i = 0; i < EFFECTS.size(); i++)
						{
							p_41129_.addEffect(new MobEffectInstance(EFFECTS.get(i).getEffect(),EFFECTS.get(i).getDuration(),EFFECTS.get(i).getAmplifier(),true,false));
						}
					} else if (ITEM != null) {
						ItemStack item = new ItemStack(ITEM, 1);
						if (item != null) {
							if (DAMAGE > 0) {
								item.setDamageValue(DAMAGE);
								item.setRepairCost(Integer.MAX_VALUE); // No cheating with anvils, sorry not sorry
							}

							ItemEntity entity = new ItemEntity(p_41128_, p_41129_.getX(), p_41129_.getY(), p_41129_.getZ(), item, 0, 0, 0);
							entity.setPickUpDelay(0);
							p_41128_.addFreshEntity(entity);
						}
					} else {
						switch (SPECIAL) {
							case "illusion":
								for (int i = 0; i < 2; i++) {
									RiderSummonEntity illusion = MobsCore.RIDER_SUMMON.get().create(p_41128_);
									if (illusion != null) {
										illusion.moveTo(p_41129_.getX(), p_41129_.getY()+1, p_41129_.getZ(), p_41129_.getYRot(), p_41129_.getXRot());
										illusion.bindToPlayer(p_41129_);
										illusion.setMeleeOnly(true);
										illusion.NAME = "decade_illusion";
										illusion.setItemSlot(EquipmentSlot.HEAD, new ItemStack(Decade_Rider_Items.DECADEHELMET.get()));
										illusion.setItemSlot(EquipmentSlot.CHEST, new ItemStack(Decade_Rider_Items.DECADECHESTPLATE.get()));
										illusion.setItemSlot(EquipmentSlot.LEGS, new ItemStack(Decade_Rider_Items.DECADELEGGINGS.get()));
										illusion.setItemSlot(EquipmentSlot.MAINHAND, new ItemStack(Decade_Rider_Items.RIDE_BOOKER.get()));

										if (p_41129_.getItemBySlot(EquipmentSlot.FEET).getItem()==Decade_Rider_Items.DARK_DECADRIVER.get()) {
											illusion.setItemSlot(EquipmentSlot.FEET, new ItemStack(Decade_Rider_Items.DARK_DECADRIVER.get()));
										} else {
											illusion.setItemSlot(EquipmentSlot.FEET, new ItemStack(Decade_Rider_Items.DECADRIVER.get()));
											RiderDriverItem.set_Form_Item(illusion.getItemBySlot(EquipmentSlot.FEET), RiderDriverItem.get_Form_Item(p_41129_.getItemBySlot(EquipmentSlot.FEET),1), 1);
										}
										
										p_41128_.addFreshEntity(illusion);
									}
								}
								break;
							case "diend_illusion":
								for (int i = 0; i < 2; i++)	{
									RiderSummonEntity illusion = MobsCore.RIDER_SUMMON.get().create(p_41128_);
									if (illusion != null) {
										illusion.moveTo(p_41129_.getX(), p_41129_.getY()+1, p_41129_.getZ(), p_41129_.getYRot(), p_41129_.getXRot());
										illusion.bindToPlayer(p_41129_);
										illusion.NAME = "diend_illusion";
										illusion.setItemSlot(EquipmentSlot.HEAD, new ItemStack(Decade_Rider_Items.DECADEHELMET.get()));
										illusion.setItemSlot(EquipmentSlot.CHEST, new ItemStack(Decade_Rider_Items.DECADECHESTPLATE.get()));
										illusion.setItemSlot(EquipmentSlot.LEGS, new ItemStack(Decade_Rider_Items.DECADELEGGINGS.get()));
										illusion.setItemSlot(EquipmentSlot.FEET, new ItemStack(Decade_Rider_Items.DIEND_BELT.get()));
										illusion.setItemSlot(EquipmentSlot.MAINHAND, new ItemStack(Decade_Rider_Items.DIENDRIVER.get()));
										RiderDriverItem.set_Form_Item(illusion.getItemBySlot(EquipmentSlot.FEET), RiderDriverItem.get_Form_Item(p_41129_.getItemBySlot(EquipmentSlot.FEET),1), 1);
										p_41128_.addFreshEntity(illusion);
									}
								}
								break;
							case "crossattack":
								List<LivingEntity> nearbyAllies = p_41128_.getEntitiesOfClass(LivingEntity.class, p_41129_.getBoundingBox().inflate(10), entity ->
																				(entity instanceof Player && entity != p_41129_)
																				|| (entity instanceof OwnableEntity owned && owned.getOwner() == p_41129_));
								for (LivingEntity ally : nearbyAllies) {
									if (ally.getMainHandItem().getItem() instanceof BowItem) {
										ally.addEffect(new MobEffectInstance(Effect_core.SHOT_BOOST.get(), 250, 3,true,true));
									} else {
										ally.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 250, 3,true,true));
									}
								}
								break;
							case "barrier":
        						int placeX = Mth.floor(p_41129_.getX() + (-Math.sin(Math.toRadians(p_41129_.getYRot())) * Math.cos(Math.toRadians(p_41129_.getXRot())) * 2));
        						int placeZ = Mth.floor(p_41129_.getZ() + (Math.cos(Math.toRadians(p_41129_.getYRot())) * Math.cos(Math.toRadians(p_41129_.getXRot())) * 2));
        						BlockPos placePos = new BlockPos(placeX, (int) p_41129_.getY(), placeZ);
								
								for (int i = 0; i < 2; i++)	{
									if (p_41128_.isEmptyBlock(placePos)) p_41128_.setBlock(placePos, Blocks.LIGHT_BLUE_STAINED_GLASS.defaultBlockState(), 3);
									placePos = placePos.above(1);
								}
								break;
							case "onibi":
								ServerLevel level = ServerLifecycleHooks.getCurrentServer().getLevel(p_41128_.dimension());
        						Vec3 look = p_41129_.getViewVector(1.0f);
        						Vec3 playerPos = p_41129_.getEyePosition(1.0f);
        						Vec3 endPos = playerPos.add(look.x * 5.0, look.y * 5.0, look.z * 5.0);

								List<LivingEntity> nearbyTargets = p_41128_.getEntitiesOfClass(LivingEntity.class, new AABB(playerPos.x, playerPos.y, playerPos.z, endPos.x, endPos.y, endPos.z).inflate(0.65), entity ->
																				  entity != p_41129_ && !(entity instanceof OwnableEntity owned && owned.getOwner() == p_41129_));
								for (Entity toIgnite : nearbyTargets) toIgnite.setSecondsOnFire(10);
								
								for (double distX = 0; distX < 8; distX += 0.5) {
									double distY = -(Math.pow(distX, 2) / 50) - 0.3;
									level.sendParticles(ParticleTypes.FLAME, playerPos.x + (look.x * distX), (playerPos.y + distY) + (look.y * distX), playerPos.z + (look.z * distX), 3, 0.0, 0.0, 0.0, 0.01);
								}
								p_41128_.playSound((Player)null, new BlockPos((int) p_41129_.getX(), (int) p_41129_.getY(), (int) p_41129_.getZ()), SoundEvents.FIRECHARGE_USE, SoundSource.PLAYERS, 1.0F, (p_41128_.getRandom().nextFloat() - p_41128_.getRandom().nextFloat()) * 0.2F + 1.0F);
								break;
							case "ore_sanjou":
								Decade_Rider_Items.DEN_O_SWORD_CRAD.get().use(p_41128_, p_41129_, p_41130_);
								p_41129_.sendSystemMessage(Component.translatable("I... have arrived!").withStyle(ChatFormatting.RED));
								break;
							case "bokuni_tsurarete_miru":
								Decade_Rider_Items.DEN_O_ROD_CRAD.get().use(p_41128_, p_41129_, p_41130_);
								p_41129_.sendSystemMessage(Component.translatable("Mind if I reel you in?").withStyle(ChatFormatting.BLUE));
								break;
							case "nakerude":
								Decade_Rider_Items.DEN_O_AX_CRAD.get().use(p_41128_, p_41129_, p_41130_);
								p_41129_.sendSystemMessage(Component.translatable("You cried!").withStyle(ChatFormatting.YELLOW));
								break;
							case "kotaewa_kiite_nai":
								Decade_Rider_Items.DEN_O_GUN_CRAD.get().use(p_41128_, p_41129_, p_41130_);
								p_41129_.sendSystemMessage(Component.translatable("I can't hear your answer!").withStyle(ChatFormatting.DARK_PURPLE));
								break;
							default:
								break;
						}
					}

					if (!p_41129_.isCreative()) {
						itemstack.shrink(1);
						p_41129_.getCooldowns().addCooldown(this, 500);
					}
					p_41129_.awardStat(Stats.ITEM_USED.get(this));
				}
			}
		}
		
		return InteractionResultHolder.sidedSuccess(itemstack, p_41128_.isClientSide());
	}
}