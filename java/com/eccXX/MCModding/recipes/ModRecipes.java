package com.eccXX.MCModding.recipes;

import com.eccXX.MCModding.blocks.ModBlocks;
import com.eccXX.MCModding.items.ModItems;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public final class ModRecipes {
	 public static final void init() {
		GameRegistry.addShapelessRecipe(new ItemStack(Items.baked_potato, 1), Blocks.diamond_block);
		
		GameRegistry.addShapelessRecipe(new ItemStack(Items.diamond_pickaxe,16), Blocks.dirt,Blocks.trapdoor);
		
		GameRegistry.addShapedRecipe(new ItemStack(Items.potato, 64),
				"XXX",
				"XYX",
				"ZZZ",
				'X', Items.apple,
				'Y', Items.arrow,
				'Z', Items.bread);
	
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.tomato, 1 ), Blocks.dirt);
	 }
}
