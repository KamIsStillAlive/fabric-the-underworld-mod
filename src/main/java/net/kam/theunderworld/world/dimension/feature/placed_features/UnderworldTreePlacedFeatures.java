package net.kam.theunderworld.world.dimension.feature.placed_features;

import net.kam.theunderworld.block.ModBlocks;
import net.kam.theunderworld.world.dimension.feature.configured_features.TheUnderworldTreeConfiguredFeature;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.blockpredicate.BlockPredicate;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.feature.PlacedFeatures;
import net.minecraft.world.gen.placementmodifier.*;

public class UnderworldTreePlacedFeatures extends TheUnderworldPlacedFeatures{

    public static final RegistryEntry<PlacedFeature> VIRULENT_TREE = register("virulent_tree",
            TheUnderworldTreeConfiguredFeature.VIRULENT_TREE,
            new PlacementModifier[]{PlacedFeatures.createCountExtraModifier(2, 0.1F, 1),
                    SquarePlacementModifier.of(),
                    SurfaceWaterDepthFilterPlacementModifier.of(2),
                    PlacedFeatures.OCEAN_FLOOR_HEIGHTMAP,
                    BiomePlacementModifier.of(),
                    BlockFilterPlacementModifier.of(BlockPredicate.wouldSurvive(ModBlocks.VIRULENT_SAPLING.getDefaultState(),
                            BlockPos.ORIGIN))});

    public static void init(){}
}
