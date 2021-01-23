package com.nepgfurmixpro.furmod.registry;

import com.nepgfurmixpro.furmod.Furmod;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item WHITE_FUR = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
    public static final BlockItem WHITE_FUR_BLOCK = new BlockItem(ModBlocks.WHITE_FUR_BLOCK, new Item.Settings().group(ItemGroup.MATERIALS));

    public static final Item LIME_FUR = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
    public static final BlockItem LIME_FUR_BLOCK = new BlockItem(ModBlocks.LIME_FUR_BLOCK, new Item.Settings().group(ItemGroup.MATERIALS));

    public static final Item COLD_PACK = new Item(new Item.Settings().group(ItemGroup.MISC));
    public static final Item WARM_PACK = new Item(new Item.Settings().group(ItemGroup.MISC));
    public static final Item HEAT_PACK = new Item(new Item.Settings().group(ItemGroup.MISC));

    public static void registerItems() {
        Registry.register(Registry.ITEM, new Identifier(Furmod.MOD_ID, "white_fur"), WHITE_FUR);
        Registry.register(Registry.ITEM, new Identifier(Furmod.MOD_ID, "white_fur_block"), WHITE_FUR_BLOCK);

        Registry.register(Registry.ITEM, new Identifier(Furmod.MOD_ID, "lime_fur"), LIME_FUR);
        Registry.register(Registry.ITEM, new Identifier(Furmod.MOD_ID, "lime_fur_block"), LIME_FUR_BLOCK);

        Registry.register(Registry.ITEM, new Identifier(Furmod.MOD_ID, "cold_pack"), COLD_PACK);
        Registry.register(Registry.ITEM, new Identifier(Furmod.MOD_ID, "warm_pack"), WARM_PACK);
        Registry.register(Registry.ITEM, new Identifier(Furmod.MOD_ID, "heat_pack"), HEAT_PACK);
    }
}
