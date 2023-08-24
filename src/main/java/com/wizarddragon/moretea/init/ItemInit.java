package com.wizarddragon.moretea.init;

import com.wizarddragon.moretea.MoreTea;
import com.wizarddragon.moretea.items.*;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import net.minecraft.world.food.Foods;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;


public class ItemInit {
	
	// Create DeferredRegister object
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MoreTea.MOD_ID);
	
	public static void init() {
		// Attach DeferredRegister to the event bus
		ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
	}

	//Show custom tab in Creative menu
	public static class CreativeTab extends CreativeModeTab {
		private CreativeTab(int index, String label) {
			super(index, label);
		}

		@Override
		public ItemStack makeIcon() {
			return new ItemStack(ICED_TEA.get());
		}

		//Create creative tab
		public static final CreativeTab instance = new CreativeTab(CreativeModeTab.TABS.length, "More Tea");
	}

	// Tools
	// Register ice cube tray
	public static final RegistryObject<Item> EMPTY_TRAY = ITEMS.register("empty_tray", () ->
			new Item(new Item.Properties().tab(CreativeTab.instance))
	);

	// Misc
	// Register glass cup item
	public static final RegistryObject<Item> GLASS_CUP = ITEMS.register("glass_cup", () ->
			new Item(new Item.Properties().tab(CreativeTab.instance))
	);

	// Register ice cubes item
	public static final RegistryObject<Item> ICE_CUBES = ITEMS.register("ice_cubes", () ->
			new Item(new Item.Properties().tab(CreativeTab.instance))
	);

	// Register filled ice cube tray
	public static final RegistryObject<Item> FILLED_TRAY = ITEMS.register("filled_tray", () ->
			new Item(new Item.Properties().tab(CreativeTab.instance))
	);

	// Drinks
	public static final RegistryObject<Item> ICED_TEA = ITEMS.register("iced_tea", () ->
			new Drinks(new Item.Properties().tab(CreativeTab.instance).food(Foods.HONEY_BOTTLE))
	);
}
