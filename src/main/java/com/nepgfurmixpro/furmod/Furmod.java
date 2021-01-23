package com.nepgfurmixpro.furmod;

import com.nepgfurmixpro.furmod.registry.ModBlocks;
import com.nepgfurmixpro.furmod.registry.ModItems;
import net.fabricmc.api.ModInitializer;

public class Furmod implements ModInitializer {

	public static final String MOD_ID = "furmod";

	@Override
	public void onInitialize() {
		System.out.println("Initializing Furmod");

		ModItems.registerItems();
		ModBlocks.registerBlocks();

		System.out.println("Initialized Furmod");
	}
}
