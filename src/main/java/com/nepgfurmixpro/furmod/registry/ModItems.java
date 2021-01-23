package com.nepgfurmixpro.furmod.registry;

import com.nepgfurmixpro.furmod.Furmod;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.*;
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

    public static final Item CINNABAR = new Item(new Item.Settings().group(ItemGroup.MISC));
    public static final BlockItem CINNABAR_ORE = new BlockItem(ModBlocks.CINNABAR_ORE, new Item.Settings().group(ItemGroup.MISC));
    public static final Item CINNABAR_DUST = new Item(new Item.Settings().group(ItemGroup.MISC));
    public static final Item MERCURY = new Item(new Item.Settings().group(ItemGroup.MISC).food(new FoodComponent.Builder().hunger(0).saturationModifier(1f).alwaysEdible().statusEffect(new StatusEffectInstance(StatusEffects.POISON, 20*12), 1).meat().build()));
    public static final PotionItem MERCURY_BOTTLE = new PotionItem(new Item.Settings().group(ItemGroup.MISC).food(new FoodComponent.Builder().hunger(0).saturationModifier(1f).alwaysEdible().statusEffect(new StatusEffectInstance(StatusEffects.POISON, 20*12), 1).meat().build()));
    public static final Item FURMOD_STATS = new Item(new Item.Settings().group(ItemGroup.MISC));


    public static void registerItems() {
        System.out.println("Registering Items");

        Registry.register(Registry.ITEM, new Identifier(Furmod.MOD_ID, "white_fur"), WHITE_FUR);
        Registry.register(Registry.ITEM, new Identifier(Furmod.MOD_ID, "white_fur_block"), WHITE_FUR_BLOCK);

        Registry.register(Registry.ITEM, new Identifier(Furmod.MOD_ID, "lime_fur"), LIME_FUR);
        Registry.register(Registry.ITEM, new Identifier(Furmod.MOD_ID, "lime_fur_block"), LIME_FUR_BLOCK);

        Registry.register(Registry.ITEM, new Identifier(Furmod.MOD_ID, "cold_pack"), COLD_PACK);
        Registry.register(Registry.ITEM, new Identifier(Furmod.MOD_ID, "warm_pack"), WARM_PACK);
        Registry.register(Registry.ITEM, new Identifier(Furmod.MOD_ID, "heat_pack"), HEAT_PACK);

        Registry.register(Registry.ITEM, new Identifier(Furmod.MOD_ID, "cinnabar"), CINNABAR);
        Registry.register(Registry.ITEM, new Identifier(Furmod.MOD_ID, "cinnabar_ore"), CINNABAR_ORE);
        Registry.register(Registry.ITEM, new Identifier(Furmod.MOD_ID, "cinnabar_dust"), CINNABAR_DUST);
        Registry.register(Registry.ITEM, new Identifier(Furmod.MOD_ID, "mercury"), MERCURY);
        Registry.register(Registry.ITEM, new Identifier(Furmod.MOD_ID, "mercury_bottle"), MERCURY_BOTTLE);
        Registry.register(Registry.ITEM, new Identifier(Furmod.MOD_ID, "furmod_stats"), FURMOD_STATS);

        System.out.println("Registered Items");

    }
}
