package net.kam.theunderworld.world.dimension;

import net.kam.theunderworld.world.dimension.feature.placed_features.UnderworldOrePlacedFeatures;
import net.kam.theunderworld.world.dimension.feature.placed_features.UnderworldTreePlacedFeatures;
import net.minecraft.world.biome.GenerationSettings;
import net.minecraft.world.gen.GenerationStep;

public class UnderworldBiomeFeatures {
    public UnderworldBiomeFeatures(){
    }

    public static void addDefaultOres(GenerationSettings.Builder builder) {
        addDefaultOres(builder, false);
    }

    public static void addDefaultOres(GenerationSettings.Builder builder, boolean largeCopperOreBlob) {
       builder.feature(GenerationStep.Feature.UNDERGROUND_ORES, UnderworldOrePlacedFeatures.ORE_FOSSIL);
    }

    public static void addDefaultVirulentSwampFeatures(GenerationSettings.Builder builder){
        builder.feature(GenerationStep.Feature.VEGETAL_DECORATION, UnderworldTreePlacedFeatures.VIRULENT_TREE);
    }
}
