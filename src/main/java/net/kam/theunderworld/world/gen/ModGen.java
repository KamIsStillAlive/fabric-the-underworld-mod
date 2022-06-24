package net.kam.theunderworld.world.gen;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.kam.theunderworld.world.features.ModPlacedFeature;
import net.minecraft.world.gen.GenerationStep;

public class ModGen {
    public static void  generateOres(){
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeature.PLATINUM_ORE_PLACED.getKey().get());
    }

}
