package net.kam.theunderworld.util;

import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import net.kam.theunderworld.TheUnderworld;
import net.kam.theunderworld.block.ModBlocks;
import net.kam.theunderworld.item.ModItems;

public class ModRegistries {
    public static void registerModStuffs(){
        registerFuels();
        registerStrippables();
        registerFlammableBlock();

    }


    private static void registerFuels() {
        TheUnderworld.LOGGER.info("Registering Fuels for " + TheUnderworld.MOD_ID);
        FuelRegistry registry = FuelRegistry.INSTANCE;

        registry.add(ModItems.FORBIDDEN_FOSSIL, 200);
    }

    private static void registerFlammableBlock(){
        FlammableBlockRegistry instance = FlammableBlockRegistry.getDefaultInstance();

        instance.add(ModBlocks.VIRULENT_LOG, 5, 20);
        instance.add(ModBlocks.VIRULENT_WOOD, 5, 20);
        instance.add(ModBlocks.STRIPPED_VIRULENT_LOG, 5, 20);
        instance.add(ModBlocks.STRIPPED_VIRULENT_WOOD, 5, 20);
        instance.add(ModBlocks.VIRULENT_PLANKS, 5, 20);
    }

    private static void registerStrippables() {
        StrippableBlockRegistry.register(ModBlocks.VIRULENT_LOG, ModBlocks.STRIPPED_VIRULENT_LOG);
        StrippableBlockRegistry.register(ModBlocks.VIRULENT_WOOD, ModBlocks.STRIPPED_VIRULENT_WOOD);
    }

}
