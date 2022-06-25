package net.kam.theunderworld.world.dimension.feature.configured_features;

import net.kam.theunderworld.block.ModBlocks;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.TreeFeatureConfig;
import net.minecraft.world.gen.feature.size.ThreeLayersFeatureSize;
import net.minecraft.world.gen.foliage.DarkOakFoliagePlacer;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.trunk.DarkOakTrunkPlacer;
import java.util.OptionalInt;

import static net.kam.theunderworld.block.ModBlocks.*;

public class TheUnderworldTreeConfiguredFeature extends TheUnderworldConfiguredFeatures{

    public static final RegistryEntry<ConfiguredFeature<TreeFeatureConfig, ?>> VIRULENT_TREE = register(
            "virulent_tree", Feature.TREE, (new TreeFeatureConfig.Builder(
                    BlockStateProvider.of(VIRULENT_LOG),
                    new DarkOakTrunkPlacer(6, 2, 1),
                    BlockStateProvider.of(VIRULENT_LEAVES),
                    new DarkOakFoliagePlacer(ConstantIntProvider.create(0), ConstantIntProvider.create(0)),
                    new ThreeLayersFeatureSize(1, 1, 0, 1, 2, OptionalInt.empty()
                    )).dirtProvider(BlockStateProvider.of(UNDERWORLD_DIRT)).build()));

    public static void init(){}
}
