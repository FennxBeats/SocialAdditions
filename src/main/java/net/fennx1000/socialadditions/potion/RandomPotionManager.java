package net.fennx1000.socialadditions.potion;

import net.fennx1000.socialadditions.effect.ModEffects;
import net.minecraft.entity.effect.StatusEffect;

import java.util.ArrayList;
import java.util.List;

public class RandomPotionManager {

    private static final List<StatusEffect> EFFECT_POOL = new ArrayList<>();

    static {
        EFFECT_POOL.add(ModEffects.BIG_HEAD);
    }

    public static StatusEffect getRandomEffect() {
        return EFFECT_POOL.get((int)(Math.random()*EFFECT_POOL.size()));
    }

}
