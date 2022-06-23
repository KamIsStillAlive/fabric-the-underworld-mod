package net.kam.theunderworld.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.kam.theunderworld.TheUnderworld;
import net.kam.theunderworld.item.custom.ModArmorMaterial;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Item;
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
                    new Item.Settings().group(ModItemGroup.THEUNDERWORLD)));

    public static final Item PLATINUM_CHESTPLATE = registerItem("platinum_chestplate",
            new ArmorItem(ModArmorMaterial.PLATINUM, EquipmentSlot.CHEST,
                    new Item.Settings().group(ModItemGroup.THEUNDERWORLD)));

    public static final Item PLATINUM_LEGGINGS = registerItem("platinum_leggings",
            new ArmorItem(ModArmorMaterial.PLATINUM, EquipmentSlot.LEGS,
                    new Item.Settings().group(ModItemGroup.THEUNDERWORLD)));

    public static final Item PLATINUM_BOOTS = registerItem("platinum_boots",
            new ArmorItem(ModArmorMaterial.PLATINUM, EquipmentSlot.FEET,
                    new Item.Settings().group(ModItemGroup.THEUNDERWORLD)));

    private static Item registerItem(String name, Item item) {
        return net.minecraft.util.registry.Registry.register(Registry.ITEM, new Identifier(TheUnderworld.MOD_ID, name), item);
    }

    public static void registerModItems(){
        TheUnderworld.LOGGER.info("Registering Mod Items for theunderworld" + TheUnderworld.MOD_ID);
    }

}