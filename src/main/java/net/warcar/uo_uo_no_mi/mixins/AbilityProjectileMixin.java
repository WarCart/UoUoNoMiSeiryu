package net.warcar.uo_uo_no_mi.mixins;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;
import xyz.pixelatedw.mineminenomi.api.abilities.AbilityCore;
import xyz.pixelatedw.mineminenomi.api.abilities.IAbility;
import xyz.pixelatedw.mineminenomi.entities.projectiles.AbilityProjectileEntity;

@Mixin(value = AbilityProjectileEntity.class, remap = false)
public interface AbilityProjectileMixin {
    @Accessor
    void setParent(AbilityCore<? extends IAbility> parent);
}
