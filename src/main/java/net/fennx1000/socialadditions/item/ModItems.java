package net.fennx1000.socialadditions.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fennx1000.socialadditions.SocialAdditions;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

public class ModItems {
    private static Item registerItem(String name, Item.Settings itemSettings) {
        Identifier id = Identifier.of(SocialAdditions.MOD_ID, name);
        RegistryKey<Item> key = RegistryKey.of(RegistryKeys.ITEM, id);
        Item.Settings settings = itemSettings.registryKey(key);

        return Registry.register(Registries.ITEM, key, new Item(settings));
    }

    public static final Item RANDOM_POTION = registerItem(
            "random_potion",
            new Item.Settings().maxCount(1)
    );


    public static void registerModItems() {
        SocialAdditions.LOGGER.info("Registering Mod Items for " + SocialAdditions.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(entries -> {
            entries.add(RANDOM_POTION);
        });
    }
}