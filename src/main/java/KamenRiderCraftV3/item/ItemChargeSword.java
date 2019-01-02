package KamenRiderCraftV3.item;



import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityWitherSkull;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.ArrowNockEvent;

public class ItemChargeSword extends ItemSword
{
	private float weaponDamage;

	public float ENT;
	private final ToolMaterial toolMaterial;

	private Item ORE;

	private Item Imcharge;



	public ItemChargeSword(ToolMaterial par2EnumToolMaterial,Item ore, Item charge)
	{

		super(par2EnumToolMaterial);
		this.toolMaterial = par2EnumToolMaterial;
		this.maxStackSize = 1;
		this.setMaxDamage(par2EnumToolMaterial.getMaxUses());
		this.setCreativeTab(CreativeTabs.tabCombat);
		this.weaponDamage = 4.0F + par2EnumToolMaterial.getDamageVsEntity();
		ORE=ore;
Imcharge=charge; 
	}

	public static int get_gun(ItemStack itemstack)
	{
		return itemstack.hasTagCompound() ? itemstack.getTagCompound().getInteger("gun") : 0;
	}



	public static void set_gun(ItemStack itemstack, int flag)
	{
		if (!itemstack.hasTagCompound())
		{
			itemstack.setTagCompound(new NBTTagCompound());
		}
		itemstack.getTagCompound().setInteger("gun", flag);
	}

	public String getUnlocalizedName(ItemStack stack)
	{
		if( get_gun(stack)>0){
			return  this.getUnlocalizedName()+"_charge";
		}
		return  this.getUnlocalizedName();
	}
	@Override
	public boolean hitEntity(ItemStack par1ItemStack, EntityLivingBase par2EntityLivingBase, EntityLivingBase par3EntityLivingBase)
	{
		if( get_gun(par1ItemStack)>0){

		}
		return true;

	}
	public void onUpdate(ItemStack par1ItemStack, World par2World, Entity par3Entity, int par4, boolean par5) {
		EntityPlayer Player = (EntityPlayer) par3Entity;
		ItemStack item = Player.getCurrentEquippedItem();

		if (par1ItemStack == item){

			if( get_gun(par1ItemStack)>0){



				Player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 25,2));


			}
		}

	}



	public void onPlayerStoppedUsing(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer, int par4)
	{set_gun(par1ItemStack, 10);
		if (!par3EntityPlayer.capabilities.isCreativeMode){
			par3EntityPlayer.inventory.consumeInventoryItem(ORE);
		}

	}

	/**
	 * Called whenever this item is equipped and the right mouse button is pressed. Args: itemStack, world, entityPlayer
	 */
	public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
	{

		if (par3EntityPlayer.isSneaking()){
			if ( par3EntityPlayer.capabilities.isCreativeMode ||par3EntityPlayer.inventory.hasItem(ORE)){
				set_gun(par1ItemStack, 1);
				ArrowNockEvent event = new ArrowNockEvent(par3EntityPlayer, par1ItemStack);
				MinecraftForge.EVENT_BUS.post(event);

				if (event.isCanceled())
				{

					set_gun(par1ItemStack, 0);
					return event.result;
				}

				par3EntityPlayer.setItemInUse(par1ItemStack, this.getMaxItemUseDuration(par1ItemStack));
			}
		}
		return par1ItemStack;
	}

	@Override
	public ModelResourceLocation getModel(ItemStack item, EntityPlayer playerIn, int useRemaining){


		ModelResourceLocation modelresourcelocation = new ModelResourceLocation("kamenridercraftv3"+":"+item.getUnlocalizedName().substring(5),"inventory");
		
		int is_OP = this.get_gun(item);
		
		if(is_OP==0){modelresourcelocation = new ModelResourceLocation("kamenridercraftv3"+":"+item.getUnlocalizedName().substring(5),"inventory");
		}
		else{modelresourcelocation = new ModelResourceLocation("kamenridercraftv3"+":"+Imcharge.getUnlocalizedName().substring(5),"inventory");
		
		}
	

		return modelresourcelocation;
	}


}