
package com.eccXX.MCModding.materials;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class ModMaterials {
    
    //Tool Material
    public static ToolMaterial titanium = EnumHelper.addToolMaterial("Titanium", 3, 20000, 15f, 10f, 50);
    public static ToolMaterial tomato= EnumHelper.addToolMaterial("tomato", 5, 9001, 100f, 10, 80);
    
    //Armor Material
    public static ArmorMaterial titaniumArmor = EnumHelper.addArmorMaterial("titaniumArmor", 80, new int[]{8,14,10,8}, 50);
	
	 public static final void init() {
		 
	 }
}
