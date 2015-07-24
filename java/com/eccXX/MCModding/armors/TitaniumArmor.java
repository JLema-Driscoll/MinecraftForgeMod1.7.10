package com.eccXX.MCModding.armors;

import com.eccXX.MCModding.Main;
import com.eccXX.MCModding.enchantments.ModEnchantments;
import com.eccXX.MCModding.materials.ModMaterials;

import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class TitaniumArmor extends ItemArmor {

	public TitaniumArmor(ArmorMaterial titaniumArmor, int id, int placement) {
		super(titaniumArmor, id, placement);
		
		if (placement == 0) {
			this.setTextureName(Main.MODID + ":TitaniumIcoHelm");
		}
		else if (placement == 1) {
			this.setTextureName(Main.MODID + ":TitaniumIcoChest");
		}
		else if (placement == 2) {
			this.setTextureName(Main.MODID + ":TitaniumIcoLegs");
		}
		else if (placement == 3) {
			this.setTextureName(Main.MODID + ":TitaniumIcoBoots");
		}
		
	}
	
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
		if (stack.getItem() == ModArmor.TitaniumHelm || stack.getItem() == ModArmor.TitaniumChest || stack.getItem() == ModArmor.TitaniumBoots) {
			return Main.MODID + ":textures/items/TitaniumArmor1.png";
		}
		if (stack.getItem() == ModArmor.TitaniumLegs) {
			return Main.MODID + ":textures/items/TitaniumArmor2.png";
		} 
		else {
			
			return null;
		}
	}	
	
	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack stack){
		player.setVelocity(0, .05, 0);
		if(stack.getItem() == ModArmor.TitaniumBoots){
			int j = EnchantmentHelper.getEnchantmentLevel(ModEnchantments.speedBoost.effectId, stack);
			if(j > 0){
				player.addPotionEffect(new PotionEffect(Potion.moveSpeed.getId(), 50, j - 1));
			}
		}
		if(stack.getItem() == ModArmor.TitaniumChest){
			int j = EnchantmentHelper.getEnchantmentLevel(ModEnchantments.speedBoost.effectId, stack);
			if(j > 0){	
				player.addPotionEffect(new PotionEffect(Potion.damageBoost.getId(), 50, j-1));
			}
			
		}
	}
}
	
	
	

