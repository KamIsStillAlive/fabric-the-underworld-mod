package net.kam.theunderworld.world.dimension.feature.placed_features;

import net.kam.theunderworld.TheUnderworld;
import net.minecraft.block.Blocks;
import net.minecraft.fluid.Fluids;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.Vec3i;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.blockpredicate.BlockPredicate;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.placementmodifier.BlockFilterPlacementModifier;
import net.minecraft.world.gen.placementmodifier.PlacementModifier;

import java.util.List;

public class TheUnderworldPlacedFeatures {
    static final BlockPredicate IN_AIR = BlockPredicate.matchingBlocks(BlockPos.ORIGIN, Blocks.AIR);
    public static final BlockPredicate IN_OR_ON_GROUND = BlockPredicate.allOf(
            BlockPredicate.hasSturdyFace(Vec3i.ZERO.down(), Direction.UP),
            BlockPredicate.solid(Vec3i.ZERO.down()),
            BlockPredicate.matchingFluids(Vec3i.ZERO.down(), Fluids.EMPTY),
            BlockPredicate.matchingFluids(Fluids.EMPTY),
            BlockPredicate.matchingBlocks(Vec3i.ZERO.up(), Blocks.AIR)
    );

    public static final PlacementModifier ON_SOLID_GROUND = BlockFilterPlacementModifier.of(BlockPredicate.bothOf(IN_OR_ON_GROUND, IN_AIR));

    static RegistryEntry<PlacedFeature> register(String id, RegistryEntry<? extends ConfiguredFeature<?, ?>> feature, PlacementModifier... modifiers) {
        return BuiltinRegistries.add(BuiltinRegistries.PLACED_FEATURE, new Identifier(TheUnderworld.MOD_ID, id), new PlacedFeature(RegistryEntry.upcast(feature), List.of(modifiers)));
    }
    public static void init(){
        UnderworldOrePlacedFeatures.init();
        UnderworldTreePlacedFeatures.init();
    }
}
