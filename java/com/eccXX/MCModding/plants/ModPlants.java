package com.eccXX.MCModding.plants;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraftforge.fluids.FluidRegistry;

import com.eccXX.MCModding.Main;
import com.eccXX.MCModding.fluids.TutorialFluidBlock;

import cpw.mods.fml.common.registry.GameRegistry;

public class ModPlants {
	public final static Block blockBush = new BlockBush();
	public final static Item blockSeeds = new BlockRealSeed();
	public static final void init() {
		GameRegistry.registerBlock(blockBush, "blockBush");
		GameRegistry.registerItem(blockSeeds, "blockSeeds");
	}
}
