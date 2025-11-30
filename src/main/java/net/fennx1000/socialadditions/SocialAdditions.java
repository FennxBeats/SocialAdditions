package net.fennx1000.socialadditions;

import net.fabricmc.api.ModInitializer;

import net.fennx1000.socialadditions.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SocialAdditions implements ModInitializer {
	public static final String MOD_ID = "socialadditions";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
        ModItems.registerModItems();
	}
}