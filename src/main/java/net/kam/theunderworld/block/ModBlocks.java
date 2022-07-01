package net.kam.theunderworld.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.kam.theunderworld.TheUnderworld;
import net.kam.theunderworld.block.custom.UnderworldSaplingBlock;
import net.kam.theunderworld.item.ModItemGroup;
import net.kam.theunderworld.world.dimension.feature.tree.generator.VirulentSaplingGenerator;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {

    public static final Block PLATINUM_BLOCK = registerBlock("platinum_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(2f).requiresTool()), ModItemGroup.THEUNDERWORLD);

    public static final Block PLATINUM_ORE = registerBlock("stone_platinum_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(2f).requiresTool()), ModItemGroup.THEUNDERWORLD);

    public static final Block CORE_OOZE = registerBlock("core_ooze",
            new Block(FabricBlockSettings.of(Material.ORGANIC_PRODUCT).strength(0.05f).luminance(15)), ModItemGroup.THEUNDERWORLD);

    // Virulent wood
    public static final Block VIRULENT_LOG = registerBlock("virulent_log",
            new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_LOG).strength(2f)), ModItemGroup.THEUNDERWORLD);
    public static final Block VIRULENT_WOOD = registerBlock("virulent_wood",
            new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_WOOD).strength(2f)), ModItemGroup.THEUNDERWORLD);
    public static final Block STRIPPED_VIRULENT_LOG = registerBlock("stripped_virulent_log",
            new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_LOG).strength(2f)), ModItemGroup.THEUNDERWORLD);
    public static final Block STRIPPED_VIRULENT_WOOD = registerBlock("stripped_virulent_wood",
            new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_LOG).strength(2f)), ModItemGroup.THEUNDERWORLD);
    public static final Block VIRULENT_PLANKS = registerBlock("virulent_planks",
            new Block(FabricBlockSettings.copy(Blocks.OAK_PLANKS).strength(2f)), ModItemGroup.THEUNDERWORLD);
    public static final Block VIRULENT_STAIRS = registerBlock("virulent_stairs",
            new StairsBlock(VIRULENT_PLANKS.getDefaultState(), AbstractBlock.Settings.copy(VIRULENT_PLANKS)), ModItemGroup.THEUNDERWORLD);
    public static final Block VIRULENT_SLAB = registerBlock("virulent_slab",
            new SlabBlock(AbstractBlock.Settings.copy(VIRULENT_PLANKS)), ModItemGroup.THEUNDERWORLD);
    public static final Block VIRULENT_FENCE = registerBlock("virulent_fence",
            new FenceBlock(AbstractBlock.Settings.copy(VIRULENT_PLANKS)), ModItemGroup.THEUNDERWORLD);
    public static final Block VIRULENT_FENCE_GATE = registerBlock("virulent_fence_gate",
            new FenceGateBlock(AbstractBlock.Settings.copy(VIRULENT_PLANKS)), ModItemGroup.THEUNDERWORLD);
    public static final Block VIRULENT_LEAVES = registerBlock("virulent_leaves",
            new LeavesBlock(FabricBlockSettings.copy(Blocks.OAK_LEAVES).nonOpaque()), ModItemGroup.THEUNDERWORLD);
    public static final Block VIRULENT_SAPLING = registerBlock("virulent_sapling",
            new UnderworldSaplingBlock(new VirulentSaplingGenerator(),
                    FabricBlockSettings.copy(Blocks.OAK_SAPLING)), ModItemGroup.THEUNDERWORLD);

    // Underworld Blocks
    public static final Block UNDERWORLD_GRASS_BLOCK = registerBlock("underworld_grass_block",
            new GrassBlock(FabricBlockSettings.copy(Blocks.GRASS_BLOCK)), ModItemGroup.THEUNDERWORLD);

    public static final Block UNDERWORLD_DIRT = registerBlock("underworld_dirt",
            new Block(FabricBlockSettings.copy(Blocks.DIRT)), ModItemGroup.THEUNDERWORLD);

    public static final  Block TSUMERATE = registerBlock("tsumerate",
            new Block(FabricBlockSettings.copy(Blocks.STONE)), ModItemGroup.THEUNDERWORLD);

    public static final Block FOSSIL_ORE = registerBlock("fossil_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(1.5f).requiresTool()), ModItemGroup.THEUNDERWORLD);


    private static Block registerBlock(String name, Block block, ItemGroup group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registry.BLOCK, new Identifier(TheUnderworld.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup group) {
        return Registry.register(Registry.ITEM, new Identifier(TheUnderworld.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(group)));
    }

    public static void registerModBlocks() {
        TheUnderworld.LOGGER.info("Registering ModBlocks for " + TheUnderworld.MOD_ID);
    }

}