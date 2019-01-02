package KamenRiderCraftV3.item.gaim;
import java.util.List;


import KamenRiderCraftV3.KamenRiderCraftV3_core;
import KamenRiderCraftV3.chunk.teleporterTo;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.ArrowNockEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class item_sid_lockseed extends Item
{
	public item_sid_lockseed()
	{
		super();
		this.setHasSubtypes(true);
		this.setMaxDamage(0);
		maxStackSize = 0;
	}

	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack par1, EntityPlayer par2, List par3, boolean bool){

		String place;

		if (par2.dimension != KamenRiderCraftV3_core.dimensionID_Helheim){
			place = "Helheim";
		}else{
			place = "Overwold";
		}


		par3.add(EnumChatFormatting.BLUE + "Go to : "+ place);


		par3.add(EnumChatFormatting.BLUE + "Charge : "+ get_ammo(par1)+"%");

	}

	public static int get_ammo(ItemStack itemstack)
	{
		return itemstack.hasTagCompound() ? itemstack.getTagCompound().getInteger("Ammo") : 0;
	}

	public static void set_ammo(ItemStack itemstack, int flag)
	{
		if (!itemstack.hasTagCompound())
		{
			itemstack.setTagCompound(new NBTTagCompound());
		}
		itemstack.getTagCompound().setInteger("Ammo", flag);
	}

	public static int get_to(ItemStack itemstack)
	{
		return itemstack.hasTagCompound() ? itemstack.getTagCompound().getInteger("to") : 1;
	}

	public static void set_to(ItemStack itemstack, int flag)
	{
		if (!itemstack.hasTagCompound())
		{
			itemstack.setTagCompound(new NBTTagCompound());
		}
		itemstack.getTagCompound().setInteger("to", flag);
	}

	public void onUpdate(ItemStack par1ItemStack, World par2World, Entity par3Entity, int par4, boolean par5) {

		if (this.get_ammo(par1ItemStack)<100){
			this.set_ammo(par1ItemStack, this.get_ammo(par1ItemStack)+1);
		}
	}

	@SideOnly(Side.CLIENT)
	public boolean hasEffect(ItemStack par1ItemStack)
	{
		if (this.get_ammo(par1ItemStack)==100){
			return true;
		}else{
			return !true;
		}
	}

	/**
	 * Called whenever this item is equipped and the right mouse button is pressed. Args: itemStack, world, entityPlayer
	 */
	public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
	{
		

		

		
			if (this.get_ammo(par1ItemStack)==100){
				if (par3EntityPlayer.ridingEntity == null && par3EntityPlayer.riddenByEntity == null && par3EntityPlayer instanceof EntityPlayerMP)
				{
					MinecraftServer server = MinecraftServer.getServer();
					EntityPlayerMP player = (EntityPlayerMP) par3EntityPlayer;
					this.set_ammo(par1ItemStack, 0); 
					if (par3EntityPlayer.dimension != KamenRiderCraftV3_core.dimensionID_Helheim){
						player.timeUntilPortal = 10;
						player.mcServer.getConfigurationManager().transferPlayerToDimension(player, KamenRiderCraftV3_core.dimensionID_Helheim,new teleporterTo(server.worldServerForDimension(KamenRiderCraftV3_core.dimensionID_Helheim)));        
					}else{
						player.timeUntilPortal = 10;
						player.mcServer.getConfigurationManager().transferPlayerToDimension(player, 0,new teleporterTo(server.worldServerForDimension(0)));        

					}
				}
			
		}

		return par1ItemStack;
	}

}