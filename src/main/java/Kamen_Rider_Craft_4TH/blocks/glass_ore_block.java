package Kamen_Rider_Craft_4TH.blocks;

import java.util.Random;

import Kamen_Rider_Craft_4TH.RiderItems;
import Kamen_Rider_Craft_4TH.TokuCraft_core;
import Kamen_Rider_Craft_4TH.util.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.block.BlockFalling;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class glass_ore_block extends Block implements IHasModel
{

	public Item CRYSTAL;
	public glass_ore_block(String string,Material par3Material,Item ore,int lv)
	{
		super(par3Material);
		// TODO Auto-generated constructor stub
		this.setHarvestLevel("pickaxe", lv);
		setHardness(9.9F);
		setLightLevel(0.1f);
		setTranslationKey(string);
		setRegistryName(string);
		CRYSTAL = ore;

        TokuCraft_core.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
        TokuCraft_core.BLOCKS.add(this);
	}

	 
	 @SideOnly(Side.CLIENT)
	    public BlockRenderLayer getBlockLayer()
	    {
	        return BlockRenderLayer.TRANSLUCENT;
	    }
	   
	  public boolean isFullCube(IBlockState state)
	    {
	        return false;
	    }
	  /**
	     * Used to determine ambient occlusion and culling when rebuilding chunks for render
	     */
	    public boolean isOpaqueCube(IBlockState state)
	    {
	        return false;
	    }   	
	        
	    

	/**
	 * Returns the ID of the items to drop on destruction.
	 */
	 @Override
		public Item getItemDropped(IBlockState state, Random random, int fortune){

		Random generator = new Random();
		if (CRYSTAL==RiderItems.contract_advent){
			int rand = generator.nextInt(320);
			if (rand<30){
				return RiderItems.dragreder_advent;
			}else if (rand<40){
				return RiderItems.drag_claw_vent;
			}else if (rand<50){
				return RiderItems.drag_saber_vent;
			}else if (rand<60){
				return RiderItems.drag_shield_vent;
			}else if (rand<80){
				return RiderItems.darkwing_advent;
			}else if (rand<85){
				return RiderItems.wing_lancer_vent;
			}else if (rand<95){
				return RiderItems.volcancer_advent;
			}else if (rand<100){
				return RiderItems.shell_defense_vent;
			}else if (rand<105){
				return RiderItems.scissors_pincer_vent;
			}else if (rand<115){
				return RiderItems.magnugiga_advent;
			}else if (rand<120){
				return RiderItems.giga_armor_vent;
			}else if (rand<125){
				return RiderItems.evildiver_advent;
			}else if (rand<135){
				return RiderItems.metalgelas_advent;
			}else if (rand<140){
				return RiderItems.metal_horn_vent;
			}else if (rand<143){
				return RiderItems.survive_advent;
			}else if (rand<146){
				return RiderItems.survive_mugen_advent;
			}else if (rand<149){
				return RiderItems.survive_shippu_advent;
			}else if (rand<153){
				return RiderItems.drag_visor_zwei_sword_mode_vent;
			}else if (rand<157){
				return RiderItems.dark_blade_vent;
			}else if (rand<162){
				return RiderItems.blank_sword_vent;
			}{
				return CRYSTAL;
			}
		}if (CRYSTAL==RiderItems.dragblacker_advent){
			int rand = generator.nextInt(240);
			if (rand<70){
				return RiderItems.contract_advent;
			}if (rand<80){
				return RiderItems.abysslasher_advent;
			}else if (rand<90){
				return RiderItems.abyss_saber_vent;
			}else if (rand<95){
				return RiderItems.abyssmash_vent;
			}else if (rand<100){
				return RiderItems.venosnaker_advent;
			}else if (rand<125){
				return RiderItems.veno_saber_vent;
			}else if (rand<135){
				return RiderItems.destwilder_advent;
			}else if (rand<140){
				return RiderItems.dest_claws_vent;
			}else if (rand<150){
				return RiderItems.gigazelle_advent;
			}else if (rand<155){
				return RiderItems.goldphoenix_advent;
			}else if (rand<157){
				return RiderItems.gold_sabers_vent;
			}else if (rand<160){
				return RiderItems.gold_shield_vent;
			}else if (rand<170){
				return RiderItems.blancwing_advent;
			}else if (rand<175){
				return RiderItems.wing_shield_vent;
			}else if (rand<180){
				return RiderItems.wing_slasher_vent;
			}else if (rand<190){
				return RiderItems.biogreeza_advent;
			}else if (rand<200){
				return RiderItems.ryuga_drag_claw_vent;
			}else if (rand<210){
				return RiderItems.ryuga_drag_saber_vent;
			}else if (rand<220){
				return RiderItems.ryuga_drag_shield_vent;
			}else if (rand<225){
				return RiderItems.psycorogue_advent;
			}else if (rand<230){
				return RiderItems.alternative_sword_vent;
			}{
				return CRYSTAL;
			}
		}
		return CRYSTAL;

		
	}

	public int getExpDrop(IBlockAccess world, int metadata, int fortune)
	{
		return 5;
	}
	@Override
	public void registerModels() {
		TokuCraft_core.proxy.registerItemRender(Item.getItemFromBlock(this),0,"inventory");
	}



}