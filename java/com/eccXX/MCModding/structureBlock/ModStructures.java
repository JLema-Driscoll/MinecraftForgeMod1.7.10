package com.eccXX.MCModding.structureBlock;

import com.eccXX.MCModding.Main;
import com.eccXX.MCModding.blocks.BasicBlock;
import com.eccXX.MCModding.blocks.ModBlocks;
import com.eccXX.MCModding.items.ModItems;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModStructures {
	
	public static Block instant;
	
	 public static final void init() {
		   GameRegistry.registerBlock(instant = new InstantBuildingTutorial("instant", 
	        		Material.glass), "instant").setCreativeTab(ModBlocks.tabModBlocks);
	 }
}
