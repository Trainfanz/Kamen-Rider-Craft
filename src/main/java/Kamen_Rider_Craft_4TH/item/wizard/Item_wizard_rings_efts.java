package Kamen_Rider_Craft_4TH.item.wizard;

import java.util.List;

import Kamen_Rider_Craft_4TH.RiderItems;
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
import net.minecraft.init.MobEffects;
import net.minecraft.inventory.EntityEquipmentSlot;
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
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
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


	public Item_wizard_rings_efts(int NUM ,String NUM2,String name)
	{
		super(0, "0",name);
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

		par3.add( "Mana : "+ (get_ammo(par1)/2)+"%");
		if (num == 8){
			par3.add( "Sneak Right Click to Set");
			par3.add( "Right Click to Teleport");
			par3.add( "X:"+get_to(par1,"X"));
			par3.add( "Y:"+get_to(par1,"Y"));
			par3.add( "Z:"+get_to(par1,"Z"));


		}
		if (num == 10){
			/**
			par3.add( "Sneak Right Click to Set Chest");
			par3.add( "Right Click to Open Chest");
			par3.add( "X:"+get_to(par1,"X"));
			par3.add( "Y:"+get_to(par1,"Y"));
			par3.add( "Z:"+get_to(par1,"Z"));
**/

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

	public void onUpdate(ItemStack par1ItemStack, World worldIn, Entity par3Entity, int par4, boolean par5) {

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


	@Override
	 public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer player, EnumHand handIn)
  {
		if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET)!= null){
	ItemStack par1ItemStack= player.getHeldItem(handIn);
			//== RiderItems.wizardriver
			if (player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() instanceof item_wizarddriver & player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem()!= RiderItems.beastdriver){
				if ((this.get_ammo(par1ItemStack)==200)){
					if (num==1){
						player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 2400,0,true,false));
					}
					if (num==2){
						player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 800,0,true,false));
					}	if (num==3){
						Vec3d look = player.getLookVec();

						int par4 = (int) (player.posX + look.x * 3);
						int par5 = (int) ( player.posY);
						int par6 = (int) (player.posZ + look.z * 3);
						int Xice;
						int Yice;
						int Zice;


						net.minecraft.block.Block type = Blocks.STONE;
						int form = item_wizarddriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), "1");
						if(player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem()== RiderItems.wizardriver){
							if (form==0||form ==4){
								type =Blocks.LAVA;
							}else if (form==1||form ==5){
								type =Blocks.WATER;
							}else if (form==2||form ==6){
								type =Blocks.LEAVES;
							}else if (form==3||form ==7){
								type =Blocks.COBBLESTONE;
							}else{
								type =Blocks.STAINED_GLASS;
							}

						}
						if (!worldIn.isRemote){

							if (worldIn.isAirBlock(new BlockPos(par4, par5, par6))){
								worldIn.setBlockState(new BlockPos(par4, par5, par6), type.getDefaultState());
							}
							if (worldIn.isAirBlock(new BlockPos(par4, par5+1, par6))){
								worldIn.setBlockState(new BlockPos(par4, par5+1, par6), type.getDefaultState());
							}
						}

					}
					if (num==4){
						Vec3d look = player.getLookVec();
						worldIn.spawnEntity(new EntityLightningBolt(worldIn,  player.posX + look.x * 8,  -1 + player.posY + look.y * 5,  player.posZ + look.z * 8, true));

					}	if (num==5){
						Vec3d look = player.getLookVec();

						if (!worldIn.isRemote){
							worldIn.createExplosion(player, player.posX + look.x * 8,  -1 + player.posY + look.y * 5,  player.posZ + look.z * 8, 4, true);
						}
					}if (num==6){
						//player.sleepInBedAt(((int) player.posX) ,  ((int)player.posY) ,  ((int)player.posZ));
						worldIn.setWorldTime(6000);
					}if (num==7){
						Vec3d look = player.getLookVec();

						int par4 = (int) (player.posX + look.x* 3);
						int par5 = (int) ( player.posY);
						int par6 = (int) (player.posZ + look.z* 3);
						int Xice;
						int Yice;
						int Zice;
						net.minecraft.block.Block type = Blocks.WEB;

						if (!worldIn.isRemote){

							if (worldIn.isAirBlock(new BlockPos(par4, par5, par6))){
								worldIn.setBlockState(new BlockPos(par4, par5, par6), type.getDefaultState());
							}
							if (worldIn.isAirBlock(new BlockPos(par4, par5+1, par6))){
								worldIn.setBlockState(new BlockPos(par4, par5+1, par6), type.getDefaultState());
							}
						}
					}
					if (num==8){

						if (player.isSneaking()){
							set_to(par1ItemStack,"X",player.posX);
							set_to(par1ItemStack,"Y",player.posY+1);
							set_to(par1ItemStack,"Z",player.posZ);
							set_to(par1ItemStack,"Dim",player.dimension);
							set_HasCode(par1ItemStack, true);
						} else if (get_HasCode(par1ItemStack)){

							if (player.dimension == get_to(par1ItemStack,"Dim")){

								player.setPosition(get_to(par1ItemStack,"X"), get_to(par1ItemStack,"Y"), get_to(par1ItemStack,"Z"));

							}else {


							}

						}
					}if (num==9){

						Vec3d look = player.getLookVec();
						int par4 = (int) (player.posX + look.x * 3);
						int par5 = (int) ( player.posY);
						int par6 = (int) (player.posZ + look.z * 3);

						worldIn.setBlockState(new BlockPos(par4, par5, par6), Blocks.AIR.getDefaultState());
						worldIn.setBlockState(new BlockPos(par4, par5-1, par6), Blocks.AIR.getDefaultState());
						worldIn.setBlockState(new BlockPos(par4, par5-2, par6), Blocks.AIR.getDefaultState());
						worldIn.setBlockState(new BlockPos(par4, par5-3, par6), Blocks.AIR.getDefaultState());
						worldIn.setBlockState(new BlockPos(par4, par5-4, par6), Blocks.AIR.getDefaultState());
						worldIn.setBlockState(new BlockPos(par4, par5-5, par6), Blocks.AIR.getDefaultState());
						worldIn.setBlockState(new BlockPos(par4, par5-6, par6), Blocks.AIR.getDefaultState());
						worldIn.setBlockState(new BlockPos(par4, par5-7, par6), Blocks.AIR.getDefaultState());
						worldIn.setBlockState(new BlockPos(par4, par5-8, par6), Blocks.AIR.getDefaultState());
						worldIn.setBlockState(new BlockPos(par4, par5-9, par6), Blocks.AIR.getDefaultState());

					}else if (num==10){
/**
						if (player.isSneaking()){

						}else{
							
							
							Vec3d look = player.getLookVec();
							if (get_HasCode(par1ItemStack)){
								BlockPos pos = new BlockPos(get_to(par1ItemStack,"X"), get_to(par1ItemStack,"Y"), get_to(par1ItemStack,"Z"));
							
								if (worldIn.getBlockState(pos).getBlock()==Blocks.CHEST){
									
									
									
									 ILockableContainer ilockablecontainer = ((BlockChest)worldIn.getBlockState(pos).getBlock()).getLockableContainer(worldIn, pos);

							            if (ilockablecontainer != null)
							            {
							            	player.displayGUIChest(ilockablecontainer);

							                if (((BlockChest)worldIn.getBlockState(pos).getBlock()).chestType == 0)
							                {
							                	player.triggerAchievement(StatList.field_181723_aa);
							                }
							                else if (((BlockChest)worldIn.getBlockState(pos).getBlock()).chestType == 1)
							                {
							                	player.triggerAchievement(StatList.field_181737_U);
							                }
							            }

									
								}
							}	
									
						}**/
						}else if (num==11){
							player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 120,9,true,false));

							player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 120,1,true,false));
						}else if (num==12){
							worldIn.setWorldTime(18000);
							}else if (num==13){
								player.addPotionEffect(new PotionEffect(MobEffects.WATER_BREATHING, 1200,1,true,false));
							}else if (num==14){
								int form = item_wizarddriver.get_core(player.getItemStackFromSlot(EntityEquipmentSlot.FEET), "1");
								if(player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem()== RiderItems.wizardriver){
									if (form==0||form ==4||form==1||form ==5||form==2||form ==6||form ==8||form ==9||form ==10){
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 1200,1,true,false));								
									}else if (form==3||form ==7){
										player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 1200,3,true,false));
									
									}
								}
							}
					
				}
			
					
							this.set_ammo(par1ItemStack, 0);
						
						this.set_ammo(par1ItemStack, 0);
					}
		}
		player.setActiveHand(handIn);
		return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, player.getHeldItem(handIn));
	
}

		/**
		 * Called when a Block is right-clicked with this Item
		 
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
		*/

	}
