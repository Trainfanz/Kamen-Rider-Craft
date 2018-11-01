package Kamen_Rider_Craft_4TH.item;

import javax.annotation.Nullable;
import Kamen_Rider_Craft_4TH.TokuCraft_core;
import Kamen_Rider_Craft_4TH.item.kuuga.item_kuugadriver;
import Kamen_Rider_Craft_4TH.util.IHasModel;
import Kamen_Rider_Craft_4TH.util.Refercence;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.EnumAction;
import net.minecraft.item.IItemPropertyGetter;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemChargeSword extends ItemSword implements IHasModel
{

	public ItemChargeSword(String name,ToolMaterial par2EnumToolMaterial)
	{

		super(par2EnumToolMaterial);
		this.maxStackSize = 1;
		this.setMaxDamage(par2EnumToolMaterial.getMaxUses());

		// Imcharge=charge; 
		setUnlocalizedName(name);
		setRegistryName(name);
		TokuCraft_core.ITEMS.add(this);


		this.addPropertyOverride(new ResourceLocation("pull"), new IItemPropertyGetter()
		{
			@SideOnly(Side.CLIENT)
			public float apply(ItemStack stack, @Nullable World worldIn, @Nullable EntityLivingBase entityIn)
			{
				
					if (entityIn == null)
					{
						return 0.0F;
					}else if (entityIn.getItemStackFromSlot(EntityEquipmentSlot.FEET)!= null){
						if (entityIn instanceof EntityPlayer){
							EntityPlayer player = (EntityPlayer) entityIn;
						if (get_core(stack)==50){
								return 1;
						
							
						}
						return 0;
					}
					return 0;
				}	return 0;
			}
		});
	}

	
     /**
      * Current implementations of this method in child classes do not use the entry argument beside ev. They just raise
      * the damage on the stack.
      */
	@Override
     public boolean hitEntity(ItemStack stack, EntityLivingBase target, EntityLivingBase attacker)
     {
		if (get_core(stack)<50){
    		set_core(stack, get_core(stack)+1);
    	}
       
         stack.damageItem(1, attacker);
         return true;
     }

    	
    
    public static int  get_core(ItemStack itemstack)
	{
		return itemstack.hasTagCompound() ? itemstack.getTagCompound().getInteger("sword_hit") :0;
	}

	public static void set_core(ItemStack itemstack, int flag)
	{
		if (!itemstack.hasTagCompound())
		{
			itemstack.setTagCompound(new NBTTagCompound());
		}
		itemstack.getTagCompound().setInteger("sword_hit", flag);
	}
	
	@Override
	public void registerModels() {
		TokuCraft_core.proxy.registerItemRender(this,0,"inventory");
	}

}