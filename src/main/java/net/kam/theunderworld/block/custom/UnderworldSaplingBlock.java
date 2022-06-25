package net.kam.theunderworld.block.custom;

import net.kam.theunderworld.block.ModBlocks;
import net.minecraft.block.BlockState;
import net.minecraft.block.SaplingBlock;
import net.minecraft.block.sapling.SaplingGenerator;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;

public class UnderworldSaplingBlock extends SaplingBlock {

    public UnderworldSaplingBlock(SaplingGenerator generator, Settings settings) {
        super(generator, settings);
    }

    @Override
    protected boolean canPlantOnTop(BlockState floor, BlockView world, BlockPos pos) {
        return floor.isOf(ModBlocks.UNDERWORLD_GRASS_BLOCK) || floor.isOf(ModBlocks.UNDERWORLD_DIRT);
    }
}
