package com.nepgfurmixpro.furmod.registry;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.Item;
import net.minecraft.sound.BlockSoundGroup;

public class ModBlocks {

    public static final Block WHITE_FUR_BLOCK = new Block(FabricBlockSettings
            .of(Material.WOOL)
            .hardness(0)
            .breakByTool(FabricToolTags.SHEARS)
            .sounds(BlockSoundGroup.WOOL));
}
