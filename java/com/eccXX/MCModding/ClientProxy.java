package com.eccXX.MCModding;

import com.eccXX.MCModding.blocksEntity.BoomEntity;
import com.eccXX.MCModding.blocksRender.BoomRender;
import com.eccXX.MCModding.items.ModItems;
import com.eccXX.MCModding.itemsEntity.EntityTomato;
import com.eccXX.MCModding.itemsRender.TomatoEntityRender;
import com.eccXX.MCModding.render.ModRender;

import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.EntityRegistry;

public class ClientProxy extends CommonProxy {

    @Override
    public void preInit(FMLPreInitializationEvent e) {
        super.preInit(e);
    }

    @Override
    public void init(FMLInitializationEvent e) {
        super.init(e);
    }

    @Override
    public void postInit(FMLPostInitializationEvent e) {
        super.postInit(e);
    }
    
    @Override
    public void registerRenderers() {
    	ModRender.init();
    }
}