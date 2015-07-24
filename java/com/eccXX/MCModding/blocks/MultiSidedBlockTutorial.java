package com.eccXX.MCModding.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.util.IIcon;

import com.eccXX.MCModding.Main;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class MultiSidedBlockTutorial extends Block {

	@SideOnly(Side.CLIENT)
	private IIcon top;
	@SideOnly(Side.CLIENT)
	private IIcon front;
	@SideOnly(Side.CLIENT)
	private IIcon bottom;
	@SideOnly(Side.CLIENT)
	private IIcon back;
	@SideOnly(Side.CLIENT)
	private IIcon left;
	@SideOnly(Side.CLIENT)
	private IIcon right;
	
    protected MultiSidedBlockTutorial(String unlocalizedName, Material material) {
        super(material);
        this.setBlockName(unlocalizedName);
        this.setBlockTextureName(Main.MODID + ":" + unlocalizedName);
        this.setHardness(2.0F);
        this.setResistance(6.0F);
        this.setLightLevel(1.0F);
        this.setHarvestLevel("pickaxe", 3);
        this.setStepSound(soundTypeMetal);
        
    }
    
    @Override
    public Item getItemDropped(int p_149650_1_, Random parRand, int parFortune)
    {
        return Items.apple;
    }
    
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int side, int p_149691_2_)
    {
    return (side == 1 ? this.top : side == 2 ? this.front : side == 5 ? this.left : 
    	side == 3 ? this.back :side == 0 ? this.bottom : side == 4 ? this.right : this.blockIcon);
    }
    
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister p_149651_1_)
    {
    this.back = p_149651_1_.registerIcon(Main.MODID + ":" + "back");
    this.top = p_149651_1_.registerIcon(Main.MODID + ":" + "top");
    this.front = p_149651_1_.registerIcon(Main.MODID + ":" + "front");
    this.bottom= p_149651_1_.registerIcon(Main.MODID + ":" + "bottom");
    this.right= p_149651_1_.registerIcon(Main.MODID + ":" + "right");
    this.left= p_149651_1_.registerIcon(Main.MODID + ":" + "left");
    }
}