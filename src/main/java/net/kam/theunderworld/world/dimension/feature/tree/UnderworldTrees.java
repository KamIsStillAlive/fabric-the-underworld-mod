package net.kam.theunderworld.world.dimension.feature.tree;

import com.mojang.serialization.Codec;
import net.kam.theunderworld.TheUnderworld;
import net.kam.theunderworld.world.dimension.feature.tree.trunk_placer.VirulentTrunkPlacer;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.gen.trunk.TrunkPlacer;
import net.minecraft.world.gen.trunk.TrunkPlacerType;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class UnderworldTrees {

    public static TrunkPlacerType<VirulentTrunkPlacer> VIRULENT_TRUNK;
    private static Constructor<TrunkPlacerType> trunkConstructor;

    static {
        try {
            trunkConstructor = TrunkPlacerType.class.getDeclaredConstructor(Codec.class);
            trunkConstructor.setAccessible(true);
        } catch (NoSuchMethodException ex) {
            ex.printStackTrace();
        }
    }

    public static <P extends TrunkPlacer> TrunkPlacerType<P> registerTrunk(String name, Codec<P> codec) throws InvocationTargetException, InstantiationException, IllegalAccessException {
        return Registry.register(Registry.TRUNK_PLACER_TYPE, new Identifier(TheUnderworld.MOD_ID, name), trunkConstructor.newInstance(codec));
    }

    public static void init() {
        try {
            VIRULENT_TRUNK = registerTrunk("virulent_trunk_placer", VirulentTrunkPlacer.CODEC);
            trunkConstructor.setAccessible(false);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
