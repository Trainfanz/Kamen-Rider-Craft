package KamenRiderCraftV3.item.W;


import KamenRiderCraftV3.RiderItems;
import KamenRiderCraftV3.item.ooo.item_OOOdriver;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;

public class Item_metal_shaft extends ItemSword
{
	private float weaponDamage;

	public float ENT;
	private final ToolMaterial toolMaterial;

	public Item_metal_shaft(ToolMaterial par2EnumToolMaterial)
	{

		super(par2EnumToolMaterial);
		this.toolMaterial = par2EnumToolMaterial;
		this.maxStackSize = 1;
		this.setMaxDamage(par2EnumToolMaterial.getMaxUses());
		this.setCreativeTab(CreativeTabs.tabCombat);
		this.weaponDamage = 4.0F + par2EnumToolMaterial.getDamageVsEntity();
	}

	@Override
	public boolean hitEntity(ItemStack par1ItemStack, EntityLivingBase par2EntityLivingBase, EntityLivingBase par3EntityLivingBase)
	{

		if (par3EntityLivingBase instanceof EntityPlayer){
			EntityPlayer Player = (EntityPlayer) par3EntityLivingBase;
			if (Player.getEquipmentInSlot(1)!= null){
				if (Player.getEquipmentInSlot(2)!= null){
					if (Player.getEquipmentInSlot(3)!= null){
						if (Player.getEquipmentInSlot(4)!= null){
							if (Player.getEquipmentInSlot(1).getItem() == RiderItems.Wdriver){
								if (Player.getEquipmentInSlot(2).getItem() == RiderItems.Wlegs){
									if (Player.getEquipmentInSlot(3).getItem() == RiderItems.Wtroso){
										if (Player.getEquipmentInSlot(4).getItem() == RiderItems.Whead){

											if (item_Wdriver.get_core(Player.getEquipmentInSlot(1), "1")==1){


												if (item_Wdriver.get_core(Player.getEquipmentInSlot(1), "3")==0){
													Vec3 look = par3EntityLivingBase.getLookVec();
													par2EntityLivingBase.motionX = look.xCoord*2 ;
													par2EntityLivingBase.motionZ = look.zCoord*2 ;
													par2EntityLivingBase.motionY = +1 ;
													par2EntityLivingBase.lastTickPosZ = look.xCoord;
													par2EntityLivingBase.lastTickPosX = look.zCoord;
												}else if(item_Wdriver.get_core(Player.getEquipmentInSlot(1), "3")==1){
													par2EntityLivingBase.setFire(2);
												}

											}}}}}}}}}}
		return true;

	}
	@Override
	public ModelResourceLocation getModel(ItemStack item, EntityPlayer playerIn, int useRemaining){

		return new ModelResourceLocation("kamenridercraftv3"+":"+item.getUnlocalizedName().substring(5)+"_l","inventory");
	}
}