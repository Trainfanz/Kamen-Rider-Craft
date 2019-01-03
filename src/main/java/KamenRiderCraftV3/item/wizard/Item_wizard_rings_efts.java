package KamenRiderCraftV3.item.wizard;

import java.util.List;

import KamenRiderCraftV3.RiderItems;
import net.minecraft.block.Block;
import net.minecraft.block.BlockChest;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.item.EntityTNTPrimed;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.init.Blocks;
import net.minecraft.inventory.InventoryEnderChest;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.server.MinecraftServer;
import net.minecraft.stats.StatList;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityEnderChest;
import net.minecraft.util.BlockPos;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.Vec3;
import net.minecraft.world.ILockableContainer;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.ArrowNockEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class Item_wizard_rings_efts extends Item_wizard_ring
{

	public int num;
	public String num2;


	public Item_wizard_rings_efts(int NUM ,String NUM2)
	{
		super(0, "0");
		this.setHasSubtypes(true);
		this.setMaxDamage(0);
		maxStackSize = 1;
		num=NUM;
		num2=NUM2;

	}

	@SideOnly(Side.CLIENT)
	public boolean hasEffect(ItemStack par1ItemStack)
	{
		if (this.get_ammo(par1ItemStack)==200){
			return true;
		}else{
			return !true;
		}
	}
	
	

	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack par1, EntityPlayer par2, List par3, boolean bool){

		par3.add(EnumChatFormatting.BLUE + "Mana : "+ (get_ammo(par1)/2)+"%");
		if (num == 8){
			par3.add(EnumChatFormatting.DARK_AQUA + "Sneak Right Click to Set");
			par3.add(EnumChatFormatting.DARK_AQUA + "Right Click to Teleport");
			par3.add(EnumChatFormatting.DARK_AQUA + "X:"+get_to(par1,"X"));
			par3.add(EnumChatFormatting.DARK_AQUA + "Y:"+get_to(par1,"Y"));
			par3.add(EnumChatFormatting.DARK_AQUA+ "Z:"+get_to(par1,"Z"));


		}
		if (num == 10){
			par3.add(EnumChatFormatting.DARK_AQUA + "Sneak Right Click to Set Chest");
			par3.add(EnumChatFormatting.DARK_AQUA + "Right Click to Open Chest");
			par3.add(EnumChatFormatting.DARK_AQUA + "X:"+get_to(par1,"X"));
			par3.add(EnumChatFormatting.DARK_AQUA + "Y:"+get_to(par1,"Y"));
			par3.add(EnumChatFormatting.DARK_AQUA+ "Z:"+get_to(par1,"Z"));


		}
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

	public static double get_to(ItemStack itemstack,String cor)
	{
		return itemstack.hasTagCompound() ? itemstack.getTagCompound().getDouble("to"+cor) : 1;
	}

	public static void set_to(ItemStack itemstack,String cor , double posX)
	{
		if (!itemstack.hasTagCompound())
		{
			itemstack.setTagCompound(new NBTTagCompound());
		}
		itemstack.getTagCompound().setDouble("to"+cor, posX);
	}

	public void onUpdate(ItemStack par1ItemStack, World par2World, Entity par3Entity, int par4, boolean par5) {

		if (this.get_ammo(par1ItemStack)<200){
			this.set_ammo(par1ItemStack, this.get_ammo(par1ItemStack)+1);
		}
	}

	public static boolean get_HasCode(ItemStack itemstack)
	{
		return itemstack.hasTagCompound() ? itemstack.getTagCompound().getBoolean("HasCode") : false;
	}
	public static void set_HasCode(ItemStack itemstack, boolean flag)
	{
		if (!itemstack.hasTagCompound())
		{
			itemstack.setTagCompound(new NBTTagCompound());
		}

		itemstack.getTagCompound().setBoolean("HasCode", flag);
	}
	/**
	 * Called whenever this item is equipped and the right mouse button is pressed. Args: itemStack, world, entityPlayer
	 */
	public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
	{


		if (par3EntityPlayer.getEquipmentInSlot(1)!= null){

			//== RiderItems.wizardriver
			if (par3EntityPlayer.getEquipmentInSlot(1).getItem() instanceof item_wizarddriver & par3EntityPlayer.getEquipmentInSlot(1).getItem()!= RiderItems.beastdriver){
				if ((this.get_ammo(par1ItemStack)==200)){
					if (num==1){
						par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.nightVision.id, 2400,0));
					}
					if (num==2){
						par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 800,0));
					}	if (num==3){
						Vec3 look = par3EntityPlayer.getLookVec();

						int par4 = (int) (par3EntityPlayer.posX + look.xCoord * 3);
						int par5 = (int) ( par3EntityPlayer.posY);
						int par6 = (int) (par3EntityPlayer.posZ + look.zCoord * 3);
						int Xice;
						int Yice;
						int Zice;


						net.minecraft.block.Block type = Blocks.stone;
						int form = item_wizarddriver.get_core(par3EntityPlayer.getEquipmentInSlot(1), "1");
						if(par3EntityPlayer.getEquipmentInSlot(1).getItem()== RiderItems.wizardriver){
							if (form==0||form ==4){
								type =Blocks.lava;
							}else if (form==1||form ==5){
								type =Blocks.water;
							}else if (form==2||form ==6){
								type =Blocks.leaves;
							}else if (form==3||form ==7){
								type =Blocks.cobblestone;
							}else{
								type =Blocks.stained_glass;
							}

						}
						if (!par2World.isRemote){

							if (par2World.isAirBlock(new BlockPos(par4, par5, par6))){
								par2World.setBlockState(new BlockPos(par4, par5, par6), type.getDefaultState());
							}
							if (par2World.isAirBlock(new BlockPos(par4, par5+1, par6))){
								par2World.setBlockState(new BlockPos(par4, par5+1, par6), type.getDefaultState());
							}
						}

					}
					if (num==4){
						Vec3 look = par3EntityPlayer.getLookVec();
						par2World.spawnEntityInWorld(new EntityLightningBolt(par2World,  par3EntityPlayer.posX + look.xCoord * 8,  -1 + par3EntityPlayer.posY + look.yCoord * 5,  par3EntityPlayer.posZ + look.zCoord * 8));

					}	if (num==5){
						Vec3 look = par3EntityPlayer.getLookVec();

						if (!par2World.isRemote){
							par2World.createExplosion(par3EntityPlayer, par3EntityPlayer.posX + look.xCoord * 8,  -1 + par3EntityPlayer.posY + look.yCoord * 5,  par3EntityPlayer.posZ + look.zCoord * 8, 4, true);
						}
					}if (num==6){
						//par3EntityPlayer.sleepInBedAt(((int) par3EntityPlayer.posX) ,  ((int)par3EntityPlayer.posY) ,  ((int)par3EntityPlayer.posZ));
						par2World.setWorldTime(6000);
					}if (num==7){
						Vec3 look = par3EntityPlayer.getLookVec();

						int par4 = (int) (par3EntityPlayer.posX + look.xCoord * 3);
						int par5 = (int) ( par3EntityPlayer.posY);
						int par6 = (int) (par3EntityPlayer.posZ + look.zCoord * 3);
						int Xice;
						int Yice;
						int Zice;


						net.minecraft.block.Block type = Blocks.web;


						if (!par2World.isRemote){

							if (par2World.isAirBlock(new BlockPos(par4, par5, par6))){
								par2World.setBlockState(new BlockPos(par4, par5, par6), type.getDefaultState());
							}
							if (par2World.isAirBlock(new BlockPos(par4, par5+1, par6))){
								par2World.setBlockState(new BlockPos(par4, par5+1, par6), type.getDefaultState());
							}
						}
					}
					if (num==8){

						if (par3EntityPlayer.isSneaking()){
							set_to(par1ItemStack,"X",par3EntityPlayer.posX);
							set_to(par1ItemStack,"Y",par3EntityPlayer.posY+1);
							set_to(par1ItemStack,"Z",par3EntityPlayer.posZ);
							set_to(par1ItemStack,"Dim",par3EntityPlayer.dimension);
							set_HasCode(par1ItemStack, true);
						} else if (get_HasCode(par1ItemStack)){

							if (par3EntityPlayer.dimension == get_to(par1ItemStack,"Dim")){

								par3EntityPlayer.setPosition(get_to(par1ItemStack,"X"), get_to(par1ItemStack,"Y"), get_to(par1ItemStack,"Z"));

							}else {


							}

						}
					}if (num==9){

						Vec3 look = par3EntityPlayer.getLookVec();
						int par4 = (int) (par3EntityPlayer.posX + look.xCoord * 3);
						int par5 = (int) ( par3EntityPlayer.posY);
						int par6 = (int) (par3EntityPlayer.posZ + look.zCoord * 3);

						par2World.setBlockState(new BlockPos(par4, par5, par6), Blocks.air.getDefaultState());
						par2World.setBlockState(new BlockPos(par4, par5-1, par6), Blocks.air.getDefaultState());
						par2World.setBlockState(new BlockPos(par4, par5-2, par6), Blocks.air.getDefaultState());
						par2World.setBlockState(new BlockPos(par4, par5-3, par6), Blocks.air.getDefaultState());
						par2World.setBlockState(new BlockPos(par4, par5-4, par6), Blocks.air.getDefaultState());
						par2World.setBlockState(new BlockPos(par4, par5-5, par6), Blocks.air.getDefaultState());
						par2World.setBlockState(new BlockPos(par4, par5-6, par6), Blocks.air.getDefaultState());
						par2World.setBlockState(new BlockPos(par4, par5-7, par6), Blocks.air.getDefaultState());
						par2World.setBlockState(new BlockPos(par4, par5-8, par6), Blocks.air.getDefaultState());
						par2World.setBlockState(new BlockPos(par4, par5-9, par6), Blocks.air.getDefaultState());

					}else if (num==10){

						if (par3EntityPlayer.isSneaking()){

						}else{
							
							
							Vec3 look = par3EntityPlayer.getLookVec();
							if (get_HasCode(par1ItemStack)){
								BlockPos pos = new BlockPos(get_to(par1ItemStack,"X"), get_to(par1ItemStack,"Y"), get_to(par1ItemStack,"Z"));
							
								if (par2World.getBlockState(pos).getBlock()==Blocks.chest){
									
									
									
									 ILockableContainer ilockablecontainer = ((BlockChest)par2World.getBlockState(pos).getBlock()).getLockableContainer(par2World, pos);

							            if (ilockablecontainer != null)
							            {
							            	par3EntityPlayer.displayGUIChest(ilockablecontainer);

							                if (((BlockChest)par2World.getBlockState(pos).getBlock()).chestType == 0)
							                {
							                	par3EntityPlayer.triggerAchievement(StatList.field_181723_aa);
							                }
							                else if (((BlockChest)par2World.getBlockState(pos).getBlock()).chestType == 1)
							                {
							                	par3EntityPlayer.triggerAchievement(StatList.field_181737_U);
							                }
							            }

									
								}
							}	
									
						}
						}else if (num==11){
							par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.jump.id, 120,9));

							par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 120,1));
						}else if (num==12){
							par2World.setWorldTime(18000);
							}else if (num==13){
								par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.waterBreathing.id, 1200,1));
							}else if (num==14){
								int form = item_wizarddriver.get_core(par3EntityPlayer.getEquipmentInSlot(1), "1");
								if(par3EntityPlayer.getEquipmentInSlot(1).getItem()== RiderItems.wizardriver){
									if (form==0||form ==4||form==1||form ==5||form==2||form ==6||form ==8||form ==9||form ==10){
										par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 1200,1));								
									}else if (form==3||form ==7){
										par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 1200,3));
									
									}
								}
							}
					
				}
			
					
							this.set_ammo(par1ItemStack, 0);
						
						this.set_ammo(par1ItemStack, 0);
					}
			}
			return par1ItemStack;
			
	}

		/**
		 * Called when a Block is right-clicked with this Item
		 */
		public boolean onItemUse(ItemStack stack, EntityPlayer playerIn, World worldIn, BlockPos pos, EnumFacing side, float hitX, float hitY, float hitZ)
		{if (num==10){
			if (playerIn.isSneaking()){

				if (worldIn.getBlockState(pos).getBlock()==Blocks.chest){
					set_to(stack,"X",pos.getX());
					set_to(stack,"Y",pos.getY());
					set_to(stack,"Z",pos.getZ());
					set_HasCode(stack, true);
					if (!worldIn.isRemote)
					{	
						playerIn.addChatComponentMessage(new ChatComponentText(EnumChatFormatting.RED +"Connecting To Ring"+ pos.getX()+"+"+ pos.getY()+"+"+ pos.getZ()));
					}
				}
			}
		}
		
		


		return true;
		}

	}
