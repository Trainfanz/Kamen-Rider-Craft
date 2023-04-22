package Kamen_Rider_Craft_4TH.item;


import java.util.List;

import javax.annotation.Nullable;

import Kamen_Rider_Craft_4TH.TokuCraft_core;
import Kamen_Rider_Craft_4TH.item.geats.item_desire_driver;
import Kamen_Rider_Craft_4TH.item.rider_armor_base.Item_form_change;
import Kamen_Rider_Craft_4TH.item.wizard.Item_wizard_ring;
import Kamen_Rider_Craft_4TH.util.IHasModel;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.IItemPropertyGetter;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;


public class Item_Beltpart extends Item implements IHasModel
{

    public Item_Beltpart(String name)
    {
        super();
        setTranslationKey(name);
        setRegistryName(name);
        TokuCraft_core.ITEMS.add(this);

        
        this.addPropertyOverride(new ResourceLocation("form"), new IItemPropertyGetter()
        {
            @SideOnly(Side.CLIENT)
            public float apply(ItemStack stack, @Nullable World worldIn, @Nullable EntityLivingBase entityIn)
            {
            	if (!stack.hasTagCompound())
        		{
            		return 0;
        		}else {
            		return get_num(stack, "part");
        		}
      		  }
        });

        
    }
    
	public static int get_num(ItemStack itemstack,String string)
	{	
		return itemstack.hasTagCompound() ? itemstack.getTagCompound().getInteger("seed"+string)!=0? itemstack.getTagCompound().getInteger("seed"+string): 0 : 0;
	}
	
	public static void set_num(ItemStack itemstack,String string,int flag)
	{
		if (!itemstack.hasTagCompound())
		{
			itemstack.setTagCompound(new NBTTagCompound());
		}
		itemstack.getTagCompound().setInteger("seed"+string, flag);
	}
    
	@Override
	public void registerModels() {
		TokuCraft_core.proxy.registerItemRender(this,0,"inventory");
	}

	}
