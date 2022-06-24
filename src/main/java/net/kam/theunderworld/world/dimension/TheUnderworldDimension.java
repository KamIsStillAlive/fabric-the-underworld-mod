package net.kam.theunderworld.world.dimension;

import net.kam.theunderworld.TheUnderworld;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.World;
import net.minecraft.world.dimension.DimensionType;

public class TheUnderworldDimension {

    public static final RegistryKey<World> THE_UNDERWORLD_DIMENSION_KEY = RegistryKey.of(Registry.WORLD_KEY,
            new Identifier(TheUnderworld.MOD_ID, "the_underworld"));

    public static final RegistryKey<DimensionType> THE_UNDERWORLD_TYPE_KEY = RegistryKey.of(Registry.DIMENSION_TYPE_KEY,
            THE_UNDERWORLD_DIMENSION_KEY.getValue());

    public static void init(){

    }
}
