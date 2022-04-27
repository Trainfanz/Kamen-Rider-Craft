package Kamen_Rider_Craft_4TH.item.W;

import Kamen_Rider_Craft_4TH.RiderItems;
import Kamen_Rider_Craft_4TH.TokuCraft_core;
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
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.util.math.Vec3d;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.world.World;

public class Item_metal_shaft extends ItemSword implements IHasModel
{
    private float weaponDamage;

    public float ENT;
    private final ToolMaterial toolMaterial;

    public Item_metal_shaft(String name,ToolMaterial par2EnumToolMaterial)
    {
    	
        super(par2EnumToolMaterial);
        this.toolMaterial = par2EnumToolMaterial;
        this.maxStackSize = 1;
        this.setMaxDamage(par2EnumToolMaterial.getMaxUses());

        setTranslationKey(name);
        setRegistryName(name);
        TokuCraft_core.ITEMS.add(this);
    }
    
	@Override
	public void registerModels() {
		TokuCraft_core.proxy.registerItemRender(this,0,"inventory");
	}
    

	@Override
	public boolean hitEntity(ItemStack par1ItemStack, EntityLivingBase par2EntityLivingBase, EntityLivingBase par3EntityLivingBase)
	{

		if (par3EntityLivingBase instanceof EntityPlayer){
			EntityPlayer player = (EntityPlayer) par3EntityLivingBase;
			if (player.getItemStackFromSlot(EntityEquipmentSlot.HEAD)!= null){
				if (player.getItemStackFromSlot(EntityEquipmentSlot.CHEST)!= null){
					if (player.getItemStackFromSlot(EntityEquipmentSlot.LEGS)!= null){
						if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET)!= null){
							if (player.getItemStackFromSlot(EntityEquipmentSlot.LEGS).getItem() == RiderItems.wlegs){
								if (player.getItemStackFromSlot(EntityEquipmentSlot.CHEST).getItem() == RiderItems.wtroso){
									if (player.getItemStackFromSlot(EntityEquipmentSlot.HEAD).getItem() == RiderItems.whead){
										if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == RiderItems.Wdriver){
											if (item_Wdriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), "1")==1){


												if (item_Wdriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), "3")==0){
													Vec3d look = par3EntityLivingBase.getLookVec();
													par2EntityLivingBase.motionX = look.x*2 ;
													par2EntityLivingBase.motionZ = look.z*2 ;
													par2EntityLivingBase.motionY = +1 ;
													par2EntityLivingBase.lastTickPosZ = look.x;
													par2EntityLivingBase.lastTickPosX = look.z;
												}else if(item_Wdriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), "3")==1){
													par2EntityLivingBase.setFire(2);
												}

											}}}}}}}}}}
		return true;

	}
	
	public boolean getIsRepairable(ItemStack toRepair, ItemStack repair) 
	{
		return RiderItems.gaiamemory == repair.getItem() ? true : super.getIsRepairable(toRepair, repair);
	}
	
}