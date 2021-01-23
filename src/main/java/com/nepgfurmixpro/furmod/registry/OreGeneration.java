package com.nepgfurmixpro.furmod.registry;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.fabricmc.fabric.impl.biome.modification.BiomeModificationContextImpl;
import net.fabricmc.fabric.impl.biome.modification.BiomeModificationTracker;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.decorator.Decorator;
import net.minecraft.world.gen.decorator.RangeDecoratorConfig;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;

public class OreGeneration {
    private static ConfiguredFeature<?, ?> CINNABAR_ORE_OVERWOLD = Feature.ORE
            .configure(new OreFeatureConfig(
                    OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
                    ModBlocks.CINNABAR_ORE.getDefaultState(),
                    9))
            .decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(
                    0,
                    0,
                    54)))
            .spreadHorizontally()
            .repeat(6);

    public static void registerOreGen() {
        System.out.println("Registering Ore Generation");

        RegistryKey<ConfiguredFeature<?, ?>> cinnabarOreOverwold = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN,
                new Identifier("furmod", "cinnabar_ore_overwold"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, cinnabarOreOverwold.getValue(), CINNABAR_ORE_OVERWOLD);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, cinnabarOreOverwold);
        System.out.println("Registered Ore Generation");
    }
}
