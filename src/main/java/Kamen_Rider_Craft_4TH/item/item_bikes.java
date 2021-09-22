package Kamen_Rider_Craft_4TH.item;

import java.util.function.Function;

import Kamen_Rider_Craft_4TH.RiderItems;
import Kamen_Rider_Craft_4TH.TokuCraft_core;
import Kamen_Rider_Craft_4TH.mobs.bikes.EntityDiagoSpeedy;
import Kamen_Rider_Craft_4TH.mobs.bikes.EntityMachineBuilder;
import Kamen_Rider_Craft_4TH.mobs.bikes.EntityRiseHopperBike;
import Kamen_Rider_Craft_4TH.util.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.entity.projectile.EntitySmallFireball;
import net.minecraft.entity.projectile.EntityWitherSkull;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBow;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.ArrowNockEvent;

public class item_bikes extends Item implements IHasModel
{
	private final Function<World, EntityAnimal> mobFuntion;

    public item_bikes(String name, Function<World, EntityAnimal> mobFunction)
    {
        super();
        this.maxStackSize = 1;
        setTranslationKey(name);
        setRegistryName(name);
		this.mobFuntion = mobFunction;
        TokuCraft_core.ITEMS.add(this);
    }
    
    /**
     * returns the action that specifies what animation to play when the items is being used
     */
    public EnumAction getItemUseAction(ItemStack par1ItemStack)
    {
        return EnumAction.BOW;
    }

	@Override
	public void registerModels() {
		TokuCraft_core.proxy.registerItemRender(this,0,"inventory");
	}

	/**
	 * Called when the equipped item is right clicked.
	 */
	public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn)
	{
		if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.FEET)!= null)
		{
			if (!worldIn.isRemote)
			{
				EntityAnimal entitychicken = mobFuntion.apply(worldIn);

	            entitychicken.setLocationAndAngles(playerIn.posX, playerIn.posY, playerIn.posZ, 0, 0.0F);
	            worldIn.spawnEntity(entitychicken);
	            
	            if (!playerIn.capabilities.isCreativeMode)
	            {
	            	playerIn.getHeldItem(handIn).shrink(1);
	            }
			}
        }  
		playerIn.setActiveHand(handIn);
		return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, playerIn.getHeldItem(handIn));
	}
}