package net.kam.theunderworld.world.dimension.feature;

import net.kam.theunderworld.TheUnderworld;
import net.kam.theunderworld.world.dimension.feature.configured_features.TheUnderworldConfiguredFeatures;
import net.kam.theunderworld.world.dimension.feature.placed_features.TheUnderworldPlacedFeatures;
import net.kam.theunderworld.world.dimension.feature.placement_modifiers.TheUnderworldPlacementModifiers;
import net.kam.theunderworld.world.dimension.feature.tree.UnderworldTrees;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.FeatureConfig;

public class TheUnderworldFeatures {
    public static <C extends FeatureConfig, F extends Feature<C>> F register(String id, F feature) {
        return Registry.register(Registry.FEATURE, new Identifier(TheUnderworld.MOD_ID, id), feature);
    }

    public static void Init(){
        TheUnderworldConfiguredFeatures.init();
        TheUnderworldPlacementModifiers.init();
        TheUnderworldPlacedFeatures.init();
        UnderworldTrees.init();
    }
}
