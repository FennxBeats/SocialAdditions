package net.fennx1000.socialadditions.mixin;

import net.fennx1000.socialadditions.effect.HeadScaleComponent;
import net.fennx1000.socialadditions.effect.ModEffects;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.player.PlayerEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(LivingEntityMixin.class)
public class LivingEntityMixin {

    @Inject(method = "onStatusEffectRemoved", at = @At("HEAD"))
    private void onStatusEffectRemoved(StatusEffectInstance statusEffectInstance, CallbackInfo ci){
        LivingEntity entity = (LivingEntity) (Object) this;
        if (entity instanceof PlayerEntity player && statusEffectInstance.getEffectType() == ModEffects.BIG_HEAD) {

            HeadScaleComponent.setHeadScale(player, 1.0f);

        }
    }

}
