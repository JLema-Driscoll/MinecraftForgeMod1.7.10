package com.eccXX.MCModding.items;

import com.eccXX.MCModding.Main;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class BlockFood extends ItemFood {

	public BlockFood(int hunger, boolean wolfFood, String unlocalizedName) {
		super(hunger, wolfFood);
		// TODO Auto-generated constructor stub
		 this.setUnlocalizedName(unlocalizedName);
		this.setTextureName(Main.MODID + ":" + unlocalizedName);
		this.setCreativeTab(ModItems.tabModItems);
		
	}
	 

	public ItemStack onEaten(ItemStack item, World world, EntityPlayer player ){
		player.addExperience(4);
		player.addPotionEffect(new PotionEffect(Potion.hunger.id, 100));
		
		item.stackSize++;
		player.heal(10);
		
		
		player.setAbsorptionAmount(20);
		player.getFoodStats().setFoodLevel(player.getFoodStats().getFoodLevel()+4);
	
		player.setVelocity(0, 10, 0);
		
		
		return item;	
	}
	
	
	public boolean onDroppedByPlayer(ItemStack item, EntityPlayer player){
		player.setPositionAndUpdate(player.posX, player.posY+100, player.posZ);
		player.addExperience(4);
		player.addVelocity(0, 10, 0);
	
		return true;
	
			
	}

}


