package com.eccXX.MCModding.render;

import com.eccXX.MCModding.CommonProxy;
import com.eccXX.MCModding.blocksEntity.BoomEntity;
import com.eccXX.MCModding.blocksRender.BoomRender;
import com.eccXX.MCModding.items.BasicItem;
import com.eccXX.MCModding.items.BlockFood;
import com.eccXX.MCModding.items.ModItems;
import com.eccXX.MCModding.items.Tomato;
import com.eccXX.MCModding.itemsEntity.EntityTomato;
import com.eccXX.MCModding.itemsRender.TomatoEntityRender;
import com.eccXX.MCModding.mob.HamburgerMonster;

import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModRender {
	
	public static final void init() {
		RenderingRegistry.registerEntityRenderingHandler(EntityTomato.class, new TomatoEntityRender(ModItems.tomato));
    	RenderingRegistry.registerEntityRenderingHandler(BoomEntity.class, new BoomRender(ModItems.tomato));
    	RenderingRegistry.registerEntityRenderingHandler(HamburgerMonster.class, new TomatoEntityRender(ModItems.tomato));
    }
}
