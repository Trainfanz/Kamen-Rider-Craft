package com.kelco.kamenridercraft.Blocks;


import java.util.List;

import net.minecraft.util.valueproviders.IntProvider;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DropExperienceBlock;
public class BaseBlockDropExperience extends DropExperienceBlock {

	   public BaseBlockDropExperience(Properties prop, IntProvider p_221084_) {
		      super(prop,p_221084_);
		   }
	
	public BaseBlockDropExperience AddToTabList(List<Block> TabList) {
		TabList.add(this);
		return this;
	}

}