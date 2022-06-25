package net.kam.theunderworld.world.dimension.feature.configured_features;

import net.kam.theunderworld.block.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.structure.rule.BlockMatchRuleTest;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;

import java.util.List;

import static net.kam.theunderworld.block.ModBlocks.FOSSIL_ORE;

public class UnderworldOreConfiguredFeatures extends TheUnderworldConfiguredFeatures {

    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> ORE_FOSSIL = register("ore_fossil",
            Feature.ORE, ore(FOSSIL_ORE, 14));

    private static OreFeatureConfig ore(Block ore, int size){
        return new OreFeatureConfig(List.of(OreFeatureConfig.createTarget(new BlockMatchRuleTest(ModBlocks.TSUMERATE), ore.getDefaultState())), size);
    }

    public static void init(){}
}
