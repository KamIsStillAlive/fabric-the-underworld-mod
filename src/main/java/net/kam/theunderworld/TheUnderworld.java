package net.kam.theunderworld;

import net.fabricmc.api.ModInitializer;
import net.kam.theunderworld.block.ModBlocks;
import net.kam.theunderworld.item.ModItems;
import net.kam.theunderworld.util.ModRegistries;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TheUnderworld implements ModInitializer {
	public static final String MOD_ID = "theunderworld";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		ModRegistries.registerModStuffs();


		LOGGER.info("Hello Fabric world!");
	}
}
