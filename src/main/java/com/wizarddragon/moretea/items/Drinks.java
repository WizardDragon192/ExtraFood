package com.wizarddragon.moretea.items;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.BowlFoodItem;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.level.Level;

import net.minecraft.world.item.Item.Properties;

public class Drinks extends BowlFoodItem {
    public Drinks(Properties properties) {
        super(properties);
    }

    @Override
    public UseAnim getUseAnimation(ItemStack stack) {
        return UseAnim.DRINK;
    }

    @Override
    public ItemStack finishUsingItem(ItemStack stack, Level worldIn, LivingEntity entityLiving) {
        ItemStack itemstack = super.finishUsingItem(stack, worldIn, entityLiving);
        return entityLiving instanceof Player && ((Player) entityLiving).getAbilities().invulnerable ? itemstack : new ItemStack(Items.GLASS_BOTTLE); //replace with glass cup
    }
}