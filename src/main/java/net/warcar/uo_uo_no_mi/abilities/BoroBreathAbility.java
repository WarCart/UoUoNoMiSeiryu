package net.warcar.uo_uo_no_mi.abilities;

import net.minecraft.entity.LivingEntity;
import net.warcar.uo_uo_no_mi.entities.projectiles.BoroBreathProjectile;
import net.warcar.uo_uo_no_mi.init.UoMorphs;
import xyz.pixelatedw.mineminenomi.api.abilities.Ability;
import xyz.pixelatedw.mineminenomi.api.abilities.AbilityCategory;
import xyz.pixelatedw.mineminenomi.api.abilities.AbilityCore;
import xyz.pixelatedw.mineminenomi.api.abilities.IAbility;
import xyz.pixelatedw.mineminenomi.api.abilities.components.ChargeComponent;
import xyz.pixelatedw.mineminenomi.api.abilities.components.ProjectileComponent;
import xyz.pixelatedw.mineminenomi.api.abilities.components.RequireMorphComponent;
import xyz.pixelatedw.mineminenomi.api.helpers.AbilityHelper;
import xyz.pixelatedw.mineminenomi.api.helpers.MorphHelper;
import xyz.pixelatedw.mineminenomi.entities.projectiles.AbilityProjectileEntity;

public class BoroBreathAbility extends Ability {
    public static final AbilityCore<BoroBreathAbility> INSTANCE = new AbilityCore.Builder<>("Boro Breath", AbilityCategory.DEVIL_FRUITS, BoroBreathAbility::new).build();

    private final ChargeComponent chargeComponent;
    private final ProjectileComponent projectileComponent;
    private final RequireMorphComponent morphComponent;

    public BoroBreathAbility(AbilityCore<BoroBreathAbility> core) {
        super(core);
        chargeComponent = new ChargeComponent(this);
        projectileComponent = new ProjectileComponent(this, this::factory);
        morphComponent = new RequireMorphComponent(this, UoMorphs.SEIRYU_FLY.get(), UoMorphs.SEIRYU_HEAVY.get());
        this.addComponents(chargeComponent, projectileComponent, morphComponent);
        this.addUseEvent(this::onUse);
        this.chargeComponent.addEndEvent(this::onEnd);
        this.isNew = true;
    }

    private void onUse(LivingEntity entity, IAbility ability) {
        this.chargeComponent.startCharging(entity, 20);
    }

    private void onEnd(LivingEntity entity, IAbility ability) {
        this.projectileComponent.shoot(entity, 4, 0);
        this.cooldownComponent.startCooldown(entity, 600);
    }

    private AbilityProjectileEntity factory(LivingEntity entity) {
        return new BoroBreathProjectile(entity.level, entity, BoroBreathAbility.INSTANCE, SeiryuFlyPointAbility.isActive(entity));
    }
}
