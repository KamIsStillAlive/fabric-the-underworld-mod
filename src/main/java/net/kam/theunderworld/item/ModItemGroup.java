package net.kam.theunderworld.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.kam.theunderworld.TheUnderworld;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {

    public static final ItemGroup THEUNDERWORLD = FabricItemGroupBuilder.build(new Identifier(TheUnderworld.MOD_ID, "theunderworld"),
            () -> new ItemStack(ModItems.PLATINUM_INGOT));

    public static final  ItemGroup THEUNDERWOLRDAARMOR = FabricItemGroupBuilder.build( new Identifier(TheUnderworld.MOD_ID, "theunderworld_armor"),
            () -> new ItemStack(ModItems.PLATINUM_AXE));

}
