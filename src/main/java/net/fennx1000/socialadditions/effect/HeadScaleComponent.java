package net.fennx1000.socialadditions.effect;

import net.minecraft.entity.data.DataTracker;
import net.minecraft.entity.data.TrackedData;
import net.minecraft.entity.data.TrackedDataHandlerRegistry;
import net.minecraft.entity.player.PlayerEntity;

public class HeadScaleComponent {
    private static final TrackedData<Float> HEAD_SCALE;

    // Use static initializer block
    static {
        HEAD_SCALE = DataTracker.registerData(PlayerEntity.class, TrackedDataHandlerRegistry.FLOAT);
    }

    // No need for separate register() method
    public static void setHeadScale(PlayerEntity player, float scale) {
        player.getDataTracker().set(HEAD_SCALE, scale);
    }

    public static float getHeadScale(PlayerEntity player) {
        return player.getDataTracker().get(HEAD_SCALE);
    }
}
