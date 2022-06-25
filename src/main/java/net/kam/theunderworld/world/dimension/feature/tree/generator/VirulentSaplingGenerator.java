package net.kam.theunderworld.world.dimension.feature.tree.generator;

import net.kam.theunderworld.world.dimension.feature.configured_features.TheUnderworldTreeConfiguredFeature;
import net.minecraft.block.sapling.SaplingGenerator;
import net.minecraft.util.math.random.Random;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import org.jetbrains.annotations.Nullable;

public class VirulentSaplingGenerator extends SaplingGenerator {
    @Nullable
    @Override
    protected RegistryEntry<? extends ConfiguredFeature<?, ?>> getTreeFeature(Random random, boolean bees) {
        return TheUnderworldTreeConfiguredFeature.VIRULENT_TREE;
    }
}
