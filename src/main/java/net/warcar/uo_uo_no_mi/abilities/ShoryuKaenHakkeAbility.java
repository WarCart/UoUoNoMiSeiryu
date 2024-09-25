package net.warcar.uo_uo_no_mi.abilities;

import net.minecraft.entity.LivingEntity;
import net.minecraft.util.math.vector.Vector3d;
import net.warcar.uo_uo_no_mi.init.UoMorphs;
import xyz.pixelatedw.mineminenomi.api.abilities.Ability;
import xyz.pixelatedw.mineminenomi.api.abilities.AbilityCategory;
import xyz.pixelatedw.mineminenomi.api.abilities.AbilityCore;
import xyz.pixelatedw.mineminenomi.api.abilities.IAbility;
import xyz.pixelatedw.mineminenomi.api.abilities.components.*;
import xyz.pixelatedw.mineminenomi.init.ModAnimations;
import xyz.pixelatedw.mineminenomi.init.ModParticleEffects;
import xyz.pixelatedw.mineminenomi.particles.effects.ParticleEffect;
import xyz.pixelatedw.mineminenomi.wypi.WyHelper;

import java.util.Iterator;
import java.util.List;

public class ShoryuKaenHakkeAbility extends Ability {
    public static final AbilityCore<ShoryuKaenHakkeAbility> INSTANCE = new AbilityCore.Builder<>("Shoryu: Kaen Hakke", AbilityCategory.DEVIL_FRUITS, ShoryuKaenHakkeAbility::new).build();
    private final RequireMorphComponent requireMorphComponent;
    private final ContinuousComponent continuousComponent;
    private final RangeComponent rangeComponent;
    private final DealDamageComponent dealDamageComponent;
    private final HitTrackerComponent hitTrackerComponent;
    public ShoryuKaenHakkeAbility(AbilityCore<ShoryuKaenHakkeAbility> core) {
        super(core);
        this.requireMorphComponent = new RequireMorphComponent(this, UoMorphs.KAEN_DAIKO.get());
        this.continuousComponent = (new ContinuousComponent(this)).addStartEvent(this::startContinuityEvent).addTickEvent(this::duringContinuityEvent).addEndEvent(this::endContinuityEvent);
        this.rangeComponent = new RangeComponent(this);
        this.dealDamageComponent = new DealDamageComponent(this);
        this.hitTrackerComponent = new HitTrackerComponent(this);
        this.isNew = true;
        this.addComponents(this.requireMorphComponent, this.continuousComponent, this.rangeComponent, this.dealDamageComponent, this.hitTrackerComponent);
        this.addUseEvent(this::useEvent);
    }

    private void useEvent(LivingEntity entity, IAbility ability) {
        continuousComponent.triggerContinuity(entity, 50);
    }

    private void startContinuityEvent(LivingEntity entity, IAbility ability) {
        this.hitTrackerComponent.clearHits();
    }

    private void duringContinuityEvent(LivingEntity entity, IAbility ability) {
        float time = this.continuousComponent.getContinueTime();
        Vector3d velocity = entity.getLookAngle().multiply(new Vector3d(5 * ((double)time / 10), 5, 5 * ((double)time / 10)));
        entity.setDeltaMovement(velocity);
        List<LivingEntity> targets = this.rangeComponent.getTargetsInArea(entity, 20);
        for (LivingEntity target : targets) {
            if (this.hitTrackerComponent.canHit(target)) {
                this.dealDamageComponent.hurtTarget(entity, target, 500);
            }
        }
    }

    private void endContinuityEvent(LivingEntity entity, IAbility ability) {
        this.cooldownComponent.startCooldown(entity, 4000);
    }
}
