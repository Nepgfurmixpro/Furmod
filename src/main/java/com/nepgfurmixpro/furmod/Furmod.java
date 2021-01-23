package com.nepgfurmixpro.furmod;

import com.nepgfurmixpro.furmod.registry.ModBlocks;
import com.nepgfurmixpro.furmod.registry.ModItems;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class Furmod implements ModInitializer {

	public static final String MOD_ID = "furmod";

	public static final ItemGroup FURMOD_TAB = FabricItemGroupBuilder.create(
			new Identifier(MOD_ID, "furmod_tab")).icon(() -> new ItemStack(ModItems.WHITE_FUR)).appendItems(stacks -> {
				stacks.add(new ItemStack(ModItems.WHITE_FUR));
				stacks.add(new ItemStack(ModItems.LIME_FUR));
				stacks.add(new ItemStack(ModItems.WHITE_FUR_BLOCK));
				stacks.add(new ItemStack(ModItems.LIME_FUR_BLOCK));
				stacks.add(new ItemStack(ModItems.COLD_PACK));
				stacks.add(new ItemStack(ModItems.WARM_PACK));
				stacks.add(new ItemStack(ModItems.HEAT_PACK));
		stacks.add(new ItemStack(ModItems.CINNABAR));
		stacks.add(new ItemStack(ModItems.CINNABAR_ORE));
		stacks.add(new ItemStack(ModItems.MERCURY));
		stacks.add(new ItemStack(ModItems.MERCURY_BOTTLE));
		stacks.add(new ItemStack(ModItems.FURMOD_STATS));
			}).build();

	@Override
	public void onInitialize() {
		System.out.println("Initializing Furmod");

		ModItems.registerItems();
		ModBlocks.registerBlocks();

		System.out.println("Initialized Furmod");
	}
}
