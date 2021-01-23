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

    public static void registerItems() {
        Registry.register(Registry.ITEM, new Identifier(Furmod.MOD_ID, "white_fur"), WHITE_FUR);
        Registry.register(Registry.ITEM, new Identifier(Furmod.MOD_ID, "white_fur_block"), WHITE_FUR_BLOCK);
    }
}
