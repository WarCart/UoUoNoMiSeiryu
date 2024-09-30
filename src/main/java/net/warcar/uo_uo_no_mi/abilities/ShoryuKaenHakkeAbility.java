package net.warcar.uo_uo_no_mi.abilities;

import net.minecraft.entity.LivingEntity;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.util.text.ITextComponent;
import net.warcar.uo_uo_no_mi.UoUoMod;
import net.warcar.uo_uo_no_mi.init.UoMorphs;
import org.apache.commons.lang3.tuple.ImmutablePair;
import xyz.pixelatedw.mineminenomi.api.abilities.*;
import xyz.pixelatedw.mineminenomi.api.abilities.components.*;
import xyz.pixelatedw.mineminenomi.api.helpers.AbilityHelper;
import xyz.pixelatedw.mineminenomi.init.ModAnimations;
import xyz.pixelatedw.mineminenomi.init.ModParticleEffects;
import xyz.pixelatedw.mineminenomi.particles.effects.ParticleEffect;
import xyz.pixelatedw.mineminenomi.wypi.WyHelper;

import java.util.Iterator;
import java.util.List;

public class ShoryuKaenHakkeAbility extends Ability {
    private static final ITextComponent[] DESCRIPTION = AbilityHelper.registerDescriptionText(UoUoMod.MOD_ID, "shoryu_kaen_hakke", ImmutablePair.of("Blazing Hot User flights towards enemy at great speeds, scorching all around", null));
    public static final AbilityCore<ShoryuKaenHakkeAbility> INSTANCE = new AbilityCore.Builder<>("Shoryu: Kaen Hakke", AbilityCategory.DEVIL_FRUITS, ShoryuKaenHakkeAbility::new)
            .addDescriptionLine(DESCRIPTION).addDescriptionLine(AbilityDescriptionLine.NEW_LINE, RequireMorphComponent.getTooltip()).build();
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
        Vector3d velocity = entity.getLookAngle().multiply(new Vector3d(2.5 * ((double)time / 10), 2.5  * ((double)time / 10), 2.5 * ((double)time / 10)));
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
