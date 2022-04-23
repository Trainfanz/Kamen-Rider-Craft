package Kamen_Rider_Craft_4TH.item.kuuga;



import javax.annotation.Nullable;

import Kamen_Rider_Craft_4TH.RiderItems;
import Kamen_Rider_Craft_4TH.TokuCraft_core;
import Kamen_Rider_Craft_4TH.item.rider_armor_base.item_rider_driver;
import Kamen_Rider_Craft_4TH.util.IHasModel;
import Kamen_Rider_Craft_4TH.util.Refercence;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
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
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class Item_kuuga_mode_change_sword_im extends ItemSword implements IHasModel
{
  
//private Item Imcharge;

    public Item_kuuga_mode_change_sword_im(String name,ToolMaterial par2EnumToolMaterial)
    {
    	
        super(par2EnumToolMaterial);
        this.maxStackSize = 1;
        this.setMaxDamage(par2EnumToolMaterial.getMaxUses());
      
       // Imcharge=charge; 
        setTranslationKey(name);
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

					if (entityIn.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() instanceof item_rider_driver){
						if (item_rider_driver.get_Form_Item_tex(entityIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),1).getBelt()==RiderItems.arcle_u||item_rider_driver.get_Form_Item_tex(entityIn.getItemStackFromSlot(EntityEquipmentSlot.FEET),1).getBelt()==RiderItems.arcle_ru)
							 return 1;
					}else{
						return 0;
					}
					return 0;
				}
				return 0;
            }
        });
    }

	@Override
	public void registerModels() {
		TokuCraft_core.proxy.registerItemRender(this,0,"inventory");
	}
	
	public boolean getIsRepairable(ItemStack toRepair, ItemStack repair) 
	{
		return RiderItems.kuuga_growing == repair.getItem() ? true : super.getIsRepairable(toRepair, repair);
	}

	
  
/**
	@Override
	public ModelResourceLocation getModel(ItemStack item, EntityPlayer playerIn, int useRemaining){

		return new ModelResourceLocation(Refercence.MODID+":"+Imcharge.getUnlocalizedName().substring(5),"inventory");
	}
	**/
}