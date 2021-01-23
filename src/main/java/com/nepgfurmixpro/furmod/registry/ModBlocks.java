package com.nepgfurmixpro.furmod.registry;

import com.nepgfurmixpro.furmod.Furmod;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.Item;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {

    public static final Block WHITE_FUR_BLOCK = new Block(FabricBlockSettings
            .of(Material.WOOL)
            .breakByTool(FabricToolTags.SHEARS)
            .sounds(BlockSoundGroup.WOOL)
            .strength(0.8f,	0.8f));

    public static void registerBlocks() {
        Registry.register(Registry.BLOCK, new Identifier(Furmod.MOD_ID, "white_fur_block"), WHITE_FUR_BLOCK);
    }
}
