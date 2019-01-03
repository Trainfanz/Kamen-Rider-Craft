package KamenRiderCraftV3.item.Ichigo;


import KamenRiderCraftV3.RiderItems;
import KamenRiderCraftV3.item.kuuga.item_kuugaarmor2;
import KamenRiderCraftV3.model.BipedLockseed;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.Entity;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

public class item_Ichigoarmor2 extends ItemArmor
{
	public static final String[] CoreName= new String[] {"","_robo_rider","_bio_rider"};
	public static final String[] CoreNameStr= new String[] {"","_charge_up"};
	
	
	private static final int[] maxDamageArray = new int[] {11, 16, 15, 13};
	public String armorNamePrefix;
	public ArmorMaterial material;

	public item_Ichigoarmor2 (ArmorMaterial par2EnumArmorMaterial, int par3, int par4)
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

				if ((player.getEquipmentInSlot(1)).getItem() instanceof item_Ichigodriver){

	String rider = ((item_Ichigodriver)player.getEquipmentInSlot(1).getItem()).Rider;
	
					if ((item_Ichigodriver)player.getEquipmentInSlot(1).getItem() == RiderItems.sunriser ){
						
						if ( slot == 2)
						{
							return "KamenRiderCraftV3:textures/armor/"+rider +CoreName[item_Ichigodriver.get_core(player.getEquipmentInSlot(1))]+"_2.png";
						}
						if (slot == 0||slot == 1 )
						{
							return "KamenRiderCraftV3:textures/armor/"+rider +CoreName[item_Ichigodriver.get_core(player.getEquipmentInSlot(1))]+"_1.png";
						
					}
						
					}else if ((item_Ichigodriver)player.getEquipmentInSlot(1).getItem() == RiderItems.electrer ){
						
						if ( slot == 2)
						{
							return "KamenRiderCraftV3:textures/armor/"+rider +CoreNameStr[item_Ichigodriver.get_core(player.getEquipmentInSlot(1))]+"_2.png";
						}
						if (slot == 0||slot == 1 )
						{
							return "KamenRiderCraftV3:textures/armor/"+rider +CoreNameStr[item_Ichigodriver.get_core(player.getEquipmentInSlot(1))]+"_1.png";
						
					}
						
					}else{
					
						if ( slot == 2)
						{
							return "KamenRiderCraftV3:textures/armor/"+rider +"_2.png";
						}
						if (slot == 0||slot == 1 )
						{
							return "KamenRiderCraftV3:textures/armor/"+rider +"_1.png";
						
					}
					}

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
		BipedLockseed armorModel = new BipedLockseed();
		if(itemStack != null){
			if(itemStack.getItem() instanceof item_kuugaarmor2){
				int type = ((ItemArmor)itemStack.getItem()).armorType;
			}
			if(armorModel != null){

					
					armorModel.bipedBody3.showModel = armorSlot == 3;
					armorModel.bipedRightArm2.showModel = armorSlot == 3;
					armorModel.bipedLeftLeg2.showModel = armorSlot == 3;
					armorModel.bipedBody2.showModel = armorSlot == 2;
					armorModel.bipedLeftArm2.showModel =armorSlot == 2;
					armorModel.bipedRightLeg2.showModel =armorSlot == 2;
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


	/**
	 * Returns the 'max damage' factor array for the armor, each piece of armor have a durability factor (that gets
	 * multiplied by armor material factor)
	 */
	static int[] getMaxDamageArray()
	{
		return maxDamageArray;
	}

	
}
