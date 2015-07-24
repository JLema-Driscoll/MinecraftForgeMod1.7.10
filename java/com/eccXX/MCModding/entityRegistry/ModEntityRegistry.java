package com.eccXX.MCModding.entityRegistry;


import com.eccXX.MCModding.Main;
import com.eccXX.MCModding.blocksEntity.BoomEntity;
import com.eccXX.MCModding.itemsEntity.EntityTomato;

import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModEntityRegistry {
	public static final void init(Main main1) {
		 int modEntityID = 0;

         
         EntityRegistry.registerModEntity(EntityTomato.class, "tomato", modEntityID, main1, 60, 10, true);
         EntityRegistry.registerModEntity(BoomEntity.class, "boom", modEntityID++, main1, 60, 60, true);
         
    }
}
