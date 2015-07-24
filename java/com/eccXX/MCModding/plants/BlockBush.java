package com.eccXX.MCModding.plants;

import java.util.Random;

import com.eccXX.MCModding.Main;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.util.IIcon;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockBush extends BushModParent
{

    public BlockBush()
    {
        // Basic block setup
        setBlockName("BlockBush");
        setBlockTextureName(Main.MODID+":stage8");
    }

    /**
     * Returns the quantity of items to drop on block destruction.
     */
    @Override
    public int quantityDropped(int parMetadata, int parFortune, Random parRand)
    {
        return (parMetadata/2);
    }

    @Override
    public Item getItemDropped(int parMetadata, Random parRand, int parFortune)  
    {
     // DEBUG
     System.out.println("BlockBlueberry getItemDropped()");
        return (ModPlants.blockSeeds);
    }
    
    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister parIIconRegister)
    {
          iIcon = new IIcon[8];
          // seems that crops like to have 8 growth icons, but okay to repeat actual texture if you want
          iIcon[0] = parIIconRegister.registerIcon(Main.MODID+":stage1");
          iIcon[1] = parIIconRegister.registerIcon(Main.MODID+":stage2");
          iIcon[2] = parIIconRegister.registerIcon(Main.MODID+":stage3");
          iIcon[3] = parIIconRegister.registerIcon(Main.MODID+":stage4");
          iIcon[4] = parIIconRegister.registerIcon(Main.MODID+":stage5");
          iIcon[5] = parIIconRegister.registerIcon(Main.MODID+":stage6");
          iIcon[6] = parIIconRegister.registerIcon(Main.MODID+":stage7");
          iIcon[7] = parIIconRegister.registerIcon(Main.MODID+":stage8");
    }
}