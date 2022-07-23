package net.kam.theunderworld.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.kam.theunderworld.TheUnderworld;
import net.kam.theunderworld.item.custom.*;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    public static final Item PLATINUM_INGOT = registerItem("platinum_ingot",
            new Item(new FabricItemSettings().group(ModItemGroup.THEUNDERWORLD)));

    public static final Item RAW_PLATINUM = registerItem("raw_platinum",
            new Item(new FabricItemSettings().group(ModItemGroup.THEUNDERWORLD)));

    public static final Item FORBIDDEN_FOSSIL = registerItem("forbidden_fossil",
            new Item(new FabricItemSettings().group(ModItemGroup.THEUNDERWORLD)));

    //Armor
    public static final Item PLATINUM_HELMET = registerItem("platinum_helmet",
            new ArmorItem(ModArmorMaterial.PLATINUM, EquipmentSlot.HEAD,
                    new Item.Settings().group(ModItemGroup.THEUNDERWOLRDAARMOR)));

    public static final Item PLATINUM_CHESTPLATE = registerItem("platinum_chestplate",
            new ArmorItem(ModArmorMaterial.PLATINUM, EquipmentSlot.CHEST,
                    new Item.Settings().group(ModItemGroup.THEUNDERWOLRDAARMOR)));

    public static final Item PLATINUM_LEGGINGS = registerItem("platinum_leggings",
            new ArmorItem(ModArmorMaterial.PLATINUM, EquipmentSlot.LEGS,
                    new Item.Settings().group(ModItemGroup.THEUNDERWOLRDAARMOR)));

    public static final Item PLATINUM_BOOTS = registerItem("platinum_boots",
            new ArmorItem(ModArmorMaterial.PLATINUM, EquipmentSlot.FEET,
                    new Item.Settings().group(ModItemGroup.THEUNDERWOLRDAARMOR)));

    // Tools

    public static final Item PLATINUM_SWORD = registerItem("platinum_sword",
            new SwordItem(ModToolMaterial.PLATINUM, 3, 3f,
                    new Item.Settings().group(ModItemGroup.THEUNDERWOLRDAARMOR)));

    public static final Item PLATINUM_PICKAXE = registerItem("platinum_pickaxe",
            new ModPickaxeItem(ModToolMaterial.PLATINUM, 1, 2f,
                    new FabricItemSettings().group(ModItemGroup.THEUNDERWOLRDAARMOR)));

    public static final Item PLATINUM_AXE = registerItem("platinum_axe",
            new ModAxeItem(ModToolMaterial.PLATINUM, 5, 1f,
                    new FabricItemSettings().group(ModItemGroup.THEUNDERWOLRDAARMOR)));

    public static final Item PLATINUM_HOE = registerItem("platinum_hoe",
            new ModHoeItem(ModToolMaterial.PLATINUM, 0, 0f,
                    new FabricItemSettings().group(ModItemGroup.THEUNDERWOLRDAARMOR)));

    public static final Item PLATINUM_SHOVEL = registerItem("platinum_shovel",
            new ShovelItem(ModToolMaterial.PLATINUM, 1, 2f,
                    new FabricItemSettings().group(ModItemGroup.THEUNDERWOLRDAARMOR)));

    // Weapons

    public static final Item SONIC_BOOM_ITEM = registerItem("sonic_boom_item",
            new SonicBoomItem(new FabricItemSettings().group(ModItemGroup.THEUNDERWORLD)));

    // Registering

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(TheUnderworld.MOD_ID, name), item);
    }

    public static void registerModItems(){
        TheUnderworld.LOGGER.info("Registering Mod Items for theunderworld" + TheUnderworld.MOD_ID);
    }

}