package net.kam.theunderworld.world.dimension.feature.placed_features;

import net.kam.theunderworld.world.dimension.feature.configured_features.UnderworldOreConfiguredFeatures;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.placementmodifier.BiomePlacementModifier;
import net.minecraft.world.gen.placementmodifier.CountPlacementModifier;
import net.minecraft.world.gen.placementmodifier.HeightRangePlacementModifier;
import net.minecraft.world.gen.placementmodifier.SquarePlacementModifier;

public class UnderworldOrePlacedFeatures extends TheUnderworldPlacedFeatures {

    public static final RegistryEntry<PlacedFeature> ORE_FOSSIL = register("ore_fossil",
            UnderworldOreConfiguredFeatures.ORE_FOSSIL,
            CountPlacementModifier.of(20),
            SquarePlacementModifier.of(),
            HeightRangePlacementModifier.trapezoid(YOffset.aboveBottom(0),
                    YOffset.aboveBottom(127)),
                    BiomePlacementModifier.of());

    public static void init(){}
}
