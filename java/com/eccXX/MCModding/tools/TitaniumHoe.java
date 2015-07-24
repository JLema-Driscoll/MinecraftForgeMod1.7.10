package com.eccXX.MCModding.tools;

import com.eccXX.MCModding.Main;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class TitaniumHoe extends ItemHoe {

	public TitaniumHoe(ToolMaterial titanium, String unlocalizedName) {
		super(titanium);
		this.setTextureName(Main.MODID+":"+unlocalizedName);
		this.setUnlocalizedName(unlocalizedName);
		this.setCreativeTab(CreativeTabs.tabTools);
		
	
	}
	
	@Override
	public ItemStack onItemRightClick(ItemStack item, World world, EntityPlayer player){
	
		player.addExperience(10);
		double flyX=1;
		double flyY=1;
		double flyZ=1;
		if(player.getLookVec().xCoord<0){
			flyX=flyX*-1;
		}
		if(player.getLookVec().yCoord<0){
			flyY=flyY*-1;
		}
		if(player.getLookVec().zCoord<0){
			flyZ=flyZ*-1;
		}
		player.addVelocity(flyX, 1, flyZ);
		return item;
	}
}
