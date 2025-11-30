package net.fennx1000.socialadditions.effect;

import net.fennx1000.socialadditions.SocialAdditions;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModEffects {

    public static final StatusEffect BIG_HEAD =
            registerEffect("big_head", new BigHeadEffect(StatusEffectCategory.BENEFICIAL, 0xFF77CC));

    public static StatusEffect registerEffect(String name, StatusEffect effect) {
        return Registry.register(Registries.STATUS_EFFECT, Identifier.of(SocialAdditions.MOD_ID, name), effect);
    }

    public static void registerEffects() {
        SocialAdditions.LOGGER.info("Registering Mod Effects for socialadditions");
    }

}
