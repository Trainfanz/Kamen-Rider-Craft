package KamenRiderCraftV3.item.Ex_Aid;


import KamenRiderCraftV3.item.kuuga.item_kuugaarmor2;
import KamenRiderCraftV3.model.BipedLockseed;
import KamenRiderCraftV3.model.BipedLockseed2;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class item_ex_aidarmor extends ItemArmor
{

	public static final String[] CoreName= new String[] {"","_bike"};
	
	public static final String[] paradoxCoreName= new String[] {"","_bike"};
	
	
	private static final int[] maxDamageArray = new int[] {11, 16, 15, 13};
	public String armorNamePrefix;
	public ArmorMaterial material;

	public item_ex_aidarmor (ArmorMaterial par2EnumArmorMaterial, int par3, int par4)
	{
		super(par2EnumArmorMaterial, par3, par4);
		this.material = par2EnumArmorMaterial;
		par2EnumArmorMaterial.getDamageReductionAmount(par4);
		this.setMaxDamage(par2EnumArmorMaterial.getDurability(par4));
		this.maxStackSize = 1;
	}


	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
	{

		if (entity instanceof EntityLivingBase){
			EntityLivingBase player = ((EntityLivingBase)entity);


			if (player.getEquipmentInSlot(1)!= null){

				if (player.getEquipmentInSlot(1).getItem() instanceof item_ex_aiddriver){

					String rider = ((item_ex_aiddriver)player.getEquipmentInSlot(1).getItem()).Rider;
				
					
						return "KamenRiderCraftV3:textures/armor/"+item_ex_aiddriver.get_lock(player.getEquipmentInSlot(1))+"_1.png";
					

				}
				return "KamenRiderCraftV3:textures/armor/blank.png";


			}
		}
		else
		{
			return "KamenRiderCraftV3:textures/armor/blank.png";



		}
		
		return "KamenRiderCraftV3:textures/armor/blank.png";

	}


	@Override
	@SideOnly(Side.CLIENT)
	public ModelBiped getArmorModel(EntityLivingBase entityLiving,ItemStack itemStack, int armorSlot) {
		BipedLockseed2 armorModel = new BipedLockseed2();
		if(itemStack != null){
			if(itemStack.getItem() instanceof item_ex_aidarmor){
				int type = ((ItemArmor)itemStack.getItem()).armorType;
			}
			if(armorModel != null){

					
					armorModel.bipedBody3.showModel = armorSlot == 4;
					armorModel.bipedRightArm2.showModel = armorSlot == 4;
					armorModel.bipedLeftLeg2.showModel = armorSlot == 4;
					armorModel.bipedBody2.showModel = armorSlot == 4;
					armorModel.bipedLeftArm2.showModel =armorSlot == 4;
					armorModel.bipedRightLeg2.showModel =armorSlot == 4;
					armorModel.bipedHead2.showModel= armorSlot == 4;
					armorModel.bipedHeadwear2.showModel= armorSlot == 4;

				armorModel.isSneak = entityLiving.isSneaking();
				armorModel.isRiding = entityLiving.isRiding();
				armorModel.isChild = entityLiving.isChild();
				armorModel.heldItemRight = entityLiving.getHeldItem() != null ? 1 :0;
				armorModel.swingProgress = entityLiving.swingProgress;
				
				return armorModel;
			}
		}

		return null;
	}

	
}