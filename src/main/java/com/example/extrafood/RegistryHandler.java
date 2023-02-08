package com.example.extrafood;

import net.minecraft.item.Foods;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item.Properties;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {
	
	// Create DeferredRegister object
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ExtraFood.MODID);
	
	public static void init() {
		// Attach DeferredRegister to the event bus
		ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
	}
	
	// Tools
	// Register knife item
	public static final RegistryObject<Item> KNIFE = ITEMS.register("knife", () ->
		new Item(new Item.Properties().tab(ItemGroup.TAB_TOOLS))
	);
	
	// Register mortar and pestle item
	public static final RegistryObject<Item> MORTAR_PESTLE = ITEMS.register("mortar_pestle", () ->
		new Item(new Item.Properties().tab(ItemGroup.TAB_TOOLS))
	);
	
	
	// Misc
	// Register glass cup item
	public static final RegistryObject<Item> GLASS_CUP = ITEMS.register("glass_cup", () ->
		new Item(new Item.Properties().tab(ItemGroup.TAB_MISC))
	);
	
	
	// Food
	// Register bread slice item
	public static final RegistryObject<Item> BREAD_SLICE = ITEMS.register("bread_slice", () ->
		new Item(new Item.Properties().tab(ItemGroup.TAB_FOOD).food(Foods.MUTTON))
	);
	
	// Register toast item
	public static final RegistryObject<Item> TOAST = ITEMS.register("toast", () ->
		new Item(new Item.Properties().tab(ItemGroup.TAB_FOOD).food(Foods.COOKED_COD))
	);
	
	// Register ice cubes item
	public static final RegistryObject<Item> ICE_CUBES = ITEMS.register("ice_cubes", () ->
		new Item(new Item.Properties().tab(ItemGroup.TAB_MISC))
	);

	
	// Drinks
	public static final RegistryObject<Item> ICED_TEA = ITEMS.register("iced_tea", () ->
		new Item(new Item.Properties().tab(ItemGroup.TAB_FOOD).food(Foods.HONEY_BOTTLE))
	);
}
