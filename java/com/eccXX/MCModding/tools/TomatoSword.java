package com.eccXX.MCModding.tools;

import ibxm.Player;

import com.eccXX.MCModding.Main;
import com.eccXX.MCModding.itemsEntity.EntityTomato;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityEgg;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class TomatoSword extends ItemSword{
	public TomatoSword(ToolMaterial tomato, String unlocalizedName) {
		super(tomato);
		this.setTextureName(Main.MODID+":"+unlocalizedName);
		this.setUnlocalizedName(unlocalizedName);
		this.setCreativeTab(CreativeTabs.tabTools);
		this.setPotionEffect(Potion.blindness.toString());
	
	}
	@Override
	public boolean onLeftClickEntity(ItemStack stack,EntityPlayer player,Entity entity){
		entity.setFire(9000);
		entity.attackEntityFrom(DamageSource.generic, 1112);
		return true;
	}
	@Override
	public ItemStack onItemRightClick(ItemStack stack,World world,EntityPlayer player){
		
		world.spawnEntityInWorld(new EntityTomato(world, player));
		return stack;
	}
}
