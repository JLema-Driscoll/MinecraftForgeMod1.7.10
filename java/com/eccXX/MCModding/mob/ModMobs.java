package com.eccXX.MCModding.mob;

import com.eccXX.MCModding.Main;


import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class ModMobs {
	public static final void init() {
		 //Register mob
	    EntityRegistry.registerGlobalEntityID(HamburgerMonster.class,"RedDragon",EntityRegistry.findGlobalUniqueEntityId(), 20,40);

	    //Localize mob name
	    LanguageRegistry.instance().addStringLocalization("entity.RedDragon.name", "en_US", "Thingy");

   }
}
