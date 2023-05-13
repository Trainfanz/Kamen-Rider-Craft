package Kamen_Rider_Craft_4TH.item;



import java.util.Vector;

import com.google.common.collect.Multimap;

import Kamen_Rider_Craft_4TH.RiderItems;
import Kamen_Rider_Craft_4TH.TokuCraft_core;
import Kamen_Rider_Craft_4TH.util.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.entity.projectile.EntitySmallFireball;
import net.minecraft.entity.projectile.EntityWitherSkull;
import net.minecraft.init.Blocks;
import net.minecraft.init.Enchantments;
import net.minecraft.init.Items;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArrow;
import net.minecraft.item.ItemBow;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.stats.StatList;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.ArrowNockEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class Item_gatling_gun extends ItemSword implements IHasModel
{
	 private final float attackDamage;
	    private final Item.ToolMaterial material;
		private final Item base;   

	
	public Item_gatling_gun(String name,ToolMaterial par2EnumToolMaterial, Item item)
	{
		super(par2EnumToolMaterial);
		this.material = par2EnumToolMaterial;
		 this.attackDamage = 3.0F + material.getAttackDamage();
		this.maxStackSize = 1;
		this.setMaxDamage(par2EnumToolMaterial.getMaxUses());
		setTranslationKey(name);
		setRegistryName(name);
		TokuCraft_core.ITEMS.add(this);
        base = item;
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
		ItemStack itemstack = playerIn.getHeldItem(handIn);
		
			if (!worldIn.isRemote)
			{
					Vec3d look =  playerIn.getLookVec();
					ItemArrow itemarrow = (ItemArrow) Items.ARROW;
					EntityArrow fireball = itemarrow.createArrow(worldIn, new ItemStack(Items.ARROW), playerIn);
					fireball.shoot(playerIn, playerIn.rotationPitch, playerIn.rotationYaw, 0.0F, 3.0F, 1.0F);
					fireball.motionX = look.x*3;
					fireball.motionY = look.y*3;
					fireball.motionZ = look.z*3;
					fireball.pickupStatus= EntityArrow.PickupStatus.DISALLOWED;
					fireball.hasNoGravity();
					
			
                    int j = EnchantmentHelper.getEnchantmentLevel(Enchantments.POWER, itemstack);

                    if (j > 0)
                    {
                    	fireball.setDamage(fireball.getDamage() + (double)j * 0.5D + 0.5D);
                    }

                    int k = EnchantmentHelper.getEnchantmentLevel(Enchantments.PUNCH, itemstack);

                    if (k > 0)
                    {
                    	fireball.setKnockbackStrength(k);
                    }

                    if (EnchantmentHelper.getEnchantmentLevel(Enchantments.FLAME, itemstack) > 0)
                    {
                    	fireball.setFire(100);
                    }

					int K = (int) this.attackDamage;
					fireball.setDamage(fireball.getDamage() + (double)K * 0.5D + 0.5D);
					fireball.setKnockbackStrength(K);
					
					worldIn.spawnEntity(fireball);
				
			}
			playerIn.setActiveHand(handIn);
			return new ActionResult<ItemStack>(EnumActionResult.PASS, itemstack);
		
	}

}