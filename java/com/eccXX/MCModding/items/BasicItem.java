package com.eccXX.MCModding.items;

import com.eccXX.MCModding.Main;

import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class BasicItem extends Item{
	 protected BasicItem(String unlocalizedName) {
		 //always have these in the game
		 this.setUnlocalizedName(unlocalizedName);
		 this.setTextureName(Main.MODID + ":" + unlocalizedName);
		 this.setCreativeTab(ModItems.tabModItems);
	
	 }
}
