package com.eccXX.MCModding.armors;

import com.eccXX.MCModding.materials.ModMaterials;

import cpw.mods.fml.common.registry.GameRegistry;

import net.minecraft.item.Item;

public class ModArmor {
    //Armor ID
    public static int tHelmID;
    public static int tChestID;
    public static int tLegsID;
    public static int tBootsID;
    
    //Armor
    public static Item TitaniumHelm = new TitaniumArmor(ModMaterials.titaniumArmor, tHelmID, 0).setUnlocalizedName("TitaniumHelm");
    public static Item TitaniumChest = new TitaniumArmor(ModMaterials.titaniumArmor, tChestID, 1).setUnlocalizedName("TitaniumChest");
    public static Item TitaniumLegs = new TitaniumArmor(ModMaterials.titaniumArmor, tLegsID, 2).setUnlocalizedName("TitaniumLegs");
    public static Item TitaniumBoots = new TitaniumArmor(ModMaterials.titaniumArmor, tBootsID, 3).setUnlocalizedName("TitaniumBoots");
	
	 public static final void init() {
		//Armor
	    	GameRegistry.registerItem(TitaniumHelm, "TitaniumHelm");
	    	GameRegistry.registerItem(TitaniumChest, "TitaniumChest");
	    	GameRegistry.registerItem(TitaniumLegs, "TitaniumLegs");
	    	GameRegistry.registerItem(TitaniumBoots, "TitaniumBoots");
	    	
	 }
}
