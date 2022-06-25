package net.kam.theunderworld.world.dimension.feature.placement_modifiers;

import com.mojang.serialization.Codec;
import net.kam.theunderworld.TheUnderworld;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.gen.placementmodifier.PlacementModifier;
import net.minecraft.world.gen.placementmodifier.PlacementModifierType;

public class TheUnderworldPlacementModifiers {

    private static <P extends PlacementModifier> PlacementModifierType<P> register(String id, Codec<P> codec) {
        return Registry.register(Registry.PLACEMENT_MODIFIER_TYPE, new Identifier(TheUnderworld.MOD_ID, id), ()->codec);
    }

    public static void init(){}
}
