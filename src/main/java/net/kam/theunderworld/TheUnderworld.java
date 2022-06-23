package net.kam.theunderworld;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.kam.theunderworld.block.ModBlocks;
import net.kam.theunderworld.item.ModItems;
import net.kam.theunderworld.util.ModRegistries;
import net.kam.theunderworld.world.gen.ModWorldGen;
import net.minecraft.client.render.RenderLayer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TheUnderworld implements ModInitializer, ClientModInitializer {
	public static final String MOD_ID = "theunderworld";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModWorldGen.Init();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		ModRegistries.registerModStuffs();


		LOGGER.info("Hello Fabric world!");
	}

	@Override
	public void onInitializeClient() {
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.VIRULENT_SAPLING, RenderLayer.getCutout());
	}
}
