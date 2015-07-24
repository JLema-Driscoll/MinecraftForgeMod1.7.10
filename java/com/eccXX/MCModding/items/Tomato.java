package com.eccXX.MCModding.items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntitySnowball;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import com.eccXX.MCModding.Main;
import com.eccXX.MCModding.itemsEntity.EntityTomato;

public class Tomato extends Item{
	
	 protected Tomato(String unlocalizedName) {
		 //always have these in the game
		 this.setUnlocalizedName(unlocalizedName);
		 this.setTextureName(Main.MODID + ":" + unlocalizedName);
		 this.setCreativeTab(ModItems.tabModItems);
	 }
		    /**
		     * Called whenever this item is equipped and the right mouse button is pressed. Args: itemStack, world, entityPlayer
		     */
		    public ItemStack onItemRightClick(ItemStack p_77659_1_, World p_77659_2_, EntityPlayer p_77659_3_)
		    {
		        if (!p_77659_3_.capabilities.isCreativeMode)
		        {
		            --p_77659_1_.stackSize;
		        }

		        p_77659_2_.playSoundAtEntity(p_77659_3_, "random.bow", 0.5F, 0.4F / (itemRand.nextFloat() * 0.4F + 0.8F));

		        if (!p_77659_2_.isRemote)
		        {
		            p_77659_2_.spawnEntityInWorld(new EntityTomato(p_77659_2_, p_77659_3_));
		        }

		        return p_77659_1_;
		    }
		}