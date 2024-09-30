package net.warcar.uo_uo_no_mi.abilities;

import net.minecraft.entity.LivingEntity;
import net.minecraft.util.text.ITextComponent;
import net.warcar.uo_uo_no_mi.UoUoMod;
import net.warcar.uo_uo_no_mi.init.UoMorphs;
import org.apache.commons.lang3.tuple.ImmutablePair;
import xyz.pixelatedw.mineminenomi.api.abilities.*;
import xyz.pixelatedw.mineminenomi.api.abilities.components.ChargeComponent;
import xyz.pixelatedw.mineminenomi.api.abilities.components.ContinuousComponent;
import xyz.pixelatedw.mineminenomi.api.abilities.components.MorphComponent;
import xyz.pixelatedw.mineminenomi.api.abilities.components.RequireMorphComponent;
import xyz.pixelatedw.mineminenomi.api.helpers.AbilityHelper;

public class KaenDaikoAbility extends Ability {
    private static final ITextComponent[] DESCRIPTION = AbilityHelper.registerDescriptionText(UoUoMod.MOD_ID, "kaen_daiko", ImmutablePair.of("User Coats himself with fire, dealing damage to everyone coming close", null));
    public static final AbilityCore<KaenDaikoAbility> INSTANCE = new AbilityCore.Builder<>("Kaen Daiko", AbilityCategory.DEVIL_FRUITS, KaenDaikoAbility::new)
            .addDescriptionLine(DESCRIPTION).addDescriptionLine(AbilityDescriptionLine.NEW_LINE, RequireMorphComponent.getTooltip()).build();

    private final RequireMorphComponent requireMorphComponent;
    private final MorphComponent morphComponent;
    private final ContinuousComponent continuousComponent;
    private final ChargeComponent chargeComponent;

    public KaenDaikoAbility(AbilityCore<KaenDaikoAbility> core) {
        super(core);
        this.isNew = true;
        requireMorphComponent = new RequireMorphComponent(this, UoMorphs.SEIRYU_FLY.get());
        morphComponent = new MorphComponent(this);
        continuousComponent = new ContinuousComponent(this, true);
        chargeComponent = new ChargeComponent(this);
        this.addComponents(requireMorphComponent, morphComponent, chargeComponent, continuousComponent);
        this.addUseEvent(this::onUse);
        this.chargeComponent.addEndEvent(this::onChargeStopped);
        this.continuousComponent.addEndEvent(this::onEnd);
    }

    private void onUse(LivingEntity entity, IAbility ability) {
        if (!chargeComponent.isCharging() && !continuousComponent.isContinuous()) {
            this.chargeComponent.startCharging(entity, 40);
        } else if (continuousComponent.isContinuous()) {
            continuousComponent.stopContinuity(entity);
        }
    }

    private void onChargeStopped(LivingEntity entity, IAbility ability) {
        morphComponent.startMorph(entity, UoMorphs.KAEN_DAIKO.get());
        continuousComponent.startContinuity(entity, -1);
    }

    private void onEnd(LivingEntity entity, IAbility ability) {
        morphComponent.stopMorph(entity);
        cooldownComponent.startCooldown(entity, continuousComponent.getContinueTime() * 2);
    }
}
