package com.eccXX.MCModding.plants;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;

public class BlockRealSeed extends BlockSeeds 
{

    public BlockRealSeed() 
    {
        super(1, 0.3F, ModPlants.blockBush, Blocks.farmland);
        setUnlocalizedName("blueberry");
        setTextureName("recipeplus:blueberry");
        setCreativeTab(CreativeTabs.tabFood);
    }
}