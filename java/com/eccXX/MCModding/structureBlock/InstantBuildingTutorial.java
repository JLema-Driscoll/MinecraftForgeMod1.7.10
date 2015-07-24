package com.eccXX.MCModding.structureBlock;

import java.util.Random;

import com.eccXX.MCModding.Main;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class InstantBuildingTutorial extends Block {
	Blocks b;
	

	public InstantBuildingTutorial(String unlocalizedName, Material material) {
		super(material);
		this.setBlockName(unlocalizedName);
        this.setBlockTextureName(Main.MODID + ":" + unlocalizedName);

	}

	@Override
	public void onBlockPlacedBy(World world, int x, int y,
			int z, EntityLivingBase entity, ItemStack itemstack) {
		// Super
		super.onBlockPlacedBy(world, x, y, z, entity, itemstack);
		
		for(int i=0;i<10;i++){
		// Sets the block to air on the x, y, and z coords from where you placed
		// the block
		world.setBlockToAir(x+i, y, z);

		// Sets the block on the x, y, and z coords starting from where you
		// placed the block
		world.setBlock(x+i, y, z, b.cobblestone);

		// Sets the block(with set metadata) on the x, y, and z coords from
		// where you placed the block
		world.setBlock(x+i, y+1, z, b.planks, 2, 2); // This is for birch planks, if
													// you want other planks,
													// search 'Minecraft Block
													// Metadata' in google or
													// find it on the
		}	// MinecraftWiki
		
	}
}