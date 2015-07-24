package com.eccXX.MCModding.fluids;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;

import com.eccXX.MCModding.Main;
import com.eccXX.MCModding.blocks.BasicBlock;
import com.eccXX.MCModding.items.ModItems;

import cpw.mods.fml.common.registry.GameRegistry;

public class ModFluids {
	
	public static Fluid tutorialFluid = new Fluid("tutorialFluid");
	public static Block tutorialFluidBlock;
	
	  public static final void init() {
		  
		  FluidRegistry.registerFluid(tutorialFluid);
		  tutorialFluidBlock = new TutorialFluidBlock(tutorialFluid, Material.water).setBlockName("yourFluid");
		  GameRegistry.registerBlock(tutorialFluidBlock, Main.MODID + "_" + tutorialFluidBlock.getUnlocalizedName().substring(5));
		  tutorialFluid.setUnlocalizedName(tutorialFluidBlock.getUnlocalizedName());
	    }
}
