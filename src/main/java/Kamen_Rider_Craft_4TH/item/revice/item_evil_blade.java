package Kamen_Rider_Craft_4TH.item.revice;



import javax.annotation.Nullable;

import Kamen_Rider_Craft_4TH.ReiwaRiderItems;
import Kamen_Rider_Craft_4TH.TokuCraft_core;
import Kamen_Rider_Craft_4TH.item.rider_armor_base.Item_form_change;
import Kamen_Rider_Craft_4TH.util.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.EnumAction;
import net.minecraft.item.IItemPropertyGetter;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class item_evil_blade extends ItemSword implements IHasModel
{
    private float weaponDamage;

    public float ENT;
    private final ToolMaterial toolMaterial;
	private final Item base;   

    public item_evil_blade(String name,ToolMaterial par2EnumToolMaterial, Item item)
    {
    	
        super(par2EnumToolMaterial);
        this.toolMaterial = par2EnumToolMaterial;
        this.maxStackSize = 1;
        this.setMaxDamage(par2EnumToolMaterial.getMaxUses());

        setTranslationKey(name);
        setRegistryName(name);
        TokuCraft_core.ITEMS.add(this);
        base = item;
        
        this.addPropertyOverride(new ResourceLocation("pull"), new IItemPropertyGetter()
	    {
			@SideOnly(Side.CLIENT)
	           public float apply(ItemStack stack, @Nullable World worldIn, @Nullable EntityLivingBase entityIn)
	           {
					if (stack.getItem() == ReiwaRiderItems.evil_blade)
					{
						if (entityIn == null)
		                {
		                    return 0.0F;
		                }
						else if (entityIn.getItemStackFromSlot(EntityEquipmentSlot.FEET)!= null)
						{
							if (entityIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == ReiwaRiderItems.two_sidriver_evil)
							{
								if (item_revicedriver.get_lock(entityIn.getItemStackFromSlot(EntityEquipmentSlot.FEET))==6)
								{
									return 1;
								}
							}
							if (entityIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == ReiwaRiderItems.two_sidriver_live)
							{
								if (item_revicedriver.get_core(entityIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),"1")==6)
								{
									return 2;
								}
							}
							else
							{
								return 0;
							}
							
							return 0;
						}
						
						return 0;
					}
					return 0;
			}
		});
    }
    
	public  item_evil_blade keep_item(Item item)
	{
		this.setContainerItem(item);
		getContainerItem();
		return this;
	}
	

    
	@Override
	public void registerModels() {
		TokuCraft_core.proxy.registerItemRender(this,0,"inventory");
	}
	
	public boolean getIsRepairable(ItemStack toRepair, ItemStack repair) 
	{
		return base == repair.getItem() ? true : super.getIsRepairable(toRepair, repair);
	}
    
}