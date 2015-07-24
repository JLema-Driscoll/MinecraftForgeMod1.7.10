package com.eccXX.MCModding;

import com.eccXX.MCModding.armors.ModArmor;
import com.eccXX.MCModding.blocks.ModBlocks;
import com.eccXX.MCModding.fluids.ModFluids;
import com.eccXX.MCModding.items.ModItems;
import com.eccXX.MCModding.itemsEntity.EntityTomato;
import com.eccXX.MCModding.itemsRender.TomatoEntityRender;
import com.eccXX.MCModding.materials.ModMaterials;
import com.eccXX.MCModding.mob.ModMobs;
import com.eccXX.MCModding.plants.ModPlants;
import com.eccXX.MCModding.recipes.ModRecipes;
import com.eccXX.MCModding.structureBlock.ModStructures;
import com.eccXX.MCModding.tools.ModTools;
import com.eccXX.MCModding.world.OreSpawner;

import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

public class CommonProxy {

    public void preInit(FMLPreInitializationEvent e) {
        ModMaterials.init();
    	ModBlocks.init();
        ModItems.init();
        ModArmor.init();
        ModTools.init();
        ModFluids.init();
        ModPlants.init();
        ModStructures.init();
        ModMobs.init();
    }
    
    public void init(FMLInitializationEvent e) {
    	ModRecipes.init();
    	 GameRegistry.registerWorldGenerator(new OreSpawner(), 0);
    }

    public void postInit(FMLPostInitializationEvent e) {

    }

	public void registerRenderers() {
		// TODO Auto-generated method stub
		
	}
}
