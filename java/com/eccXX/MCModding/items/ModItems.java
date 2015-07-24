package com.eccXX.MCModding.items;

import com.eccXX.MCModding.Main;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public final class ModItems {

    public static Item tutorialItem;
    public static Item tutorialFood;
    public static Item bowThing;
    
    public static Item tomato;
    
    public static final void init() {
     	//register your items here	
        GameRegistry.registerItem(tutorialItem= new BasicItem("tutorialItem"), "tutorialItem");
      
        GameRegistry.registerItem(tomato= new Tomato("tomato"), "tomato");
  
        
        //register your item to the mod item tabs
       
        
        GameRegistry.registerItem(tutorialFood= new BlockFood(2, false, "tutorialFood"), "tutorialFood");
      
        
        
    }

    
    
    
    
    
    
    
    //this is your creative tab for items
    public static CreativeTabs tabModItems = new CreativeTabs("tabModItems") {
        @Override
        @SideOnly(Side.CLIENT)
        public Item getTabIconItem() {
            return Items.ender_eye;
        }
    };
}