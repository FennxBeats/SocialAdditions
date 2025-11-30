package net.fennx1000.socialadditions.potion;

import net.fennx1000.socialadditions.SocialAdditions;
import net.minecraft.potion.Potion;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;

public class ModPotions {

    private static RegistryEntry<Potion> registerPotion(String name, Potion potion) {
        return Registry.registerReference(Registries.POTION, Identifier.of(SocialAdditions.MOD_ID, name), potion);
    }

    public static void registerPotions() {
        SocialAdditions.LOGGER.info("Registering Potions for socialadditions");
    }

}
