package net.warcar.uo_uo_no_mi.abilities;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.warcar.uo_uo_no_mi.init.UoMorphs;
import xyz.pixelatedw.mineminenomi.abilities.PropelledFlightAbility;
import xyz.pixelatedw.mineminenomi.api.IPlayerAbilities;
import xyz.pixelatedw.mineminenomi.api.abilities.AbilityCategory;
import xyz.pixelatedw.mineminenomi.api.abilities.AbilityCore;
import xyz.pixelatedw.mineminenomi.api.abilities.AbilityDescriptionLine;
import xyz.pixelatedw.mineminenomi.api.abilities.AbilityType;
import xyz.pixelatedw.mineminenomi.api.abilities.components.RequireMorphComponent;

public class SeiryuFlightAbility extends PropelledFlightAbility {
    public static final AbilityCore<SeiryuFlightAbility> INSTANCE = new AbilityCore.Builder<>("Seiryu Flight", AbilityCategory.DEVIL_FRUITS, AbilityType.PASSIVE, SeiryuFlightAbility::new)
            .addDescriptionLine(AbilityDescriptionLine.NEW_LINE, RequireMorphComponent.getTooltip()).build();
    private final RequireMorphComponent morphComponent;
    public SeiryuFlightAbility(AbilityCore<SeiryuFlightAbility> core) {
        super(core);
        morphComponent = new RequireMorphComponent(this, UoMorphs.SEIRYU_FLY.get());
        this.addComponents(morphComponent);
        this.addDuringPassiveEvent(this::onDuringPassive);
    }

    private void onDuringPassive(LivingEntity entity) {
        if (entity instanceof PlayerEntity) {
            PlayerEntity player = (PlayerEntity)entity;
            if (morphComponent.checkRequirements(entity)) {
                if (((IPlayerAbilities)player.abilities).hasCustomFlight() && !player.abilities.flying) {
                    player.abilities.flying = true;
                    player.onUpdateAbilities();
                }
            } else if (!((IPlayerAbilities)player.abilities).hasCustomFlight() && player.abilities.flying) {
                player.abilities.flying = false;
                player.onUpdateAbilities();
            }
        }
    }

    public float getMaxSpeed(LivingEntity livingEntity) {
        return 5;
    }

    protected float getAcceleration(LivingEntity livingEntity) {
        return 0.01f;
    }

    protected int getHeightDifference(LivingEntity livingEntity) {
        return 200;
    }
}
