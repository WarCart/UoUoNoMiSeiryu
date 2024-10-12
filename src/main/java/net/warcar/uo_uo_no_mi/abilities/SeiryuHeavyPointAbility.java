package net.warcar.uo_uo_no_mi.abilities;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.potion.EffectInstance;
import net.minecraft.util.text.ITextComponent;
import net.warcar.uo_uo_no_mi.UoUoMod;
import net.warcar.uo_uo_no_mi.init.UoMorphs;
import org.apache.commons.lang3.tuple.ImmutablePair;
import xyz.pixelatedw.mineminenomi.api.abilities.*;
import xyz.pixelatedw.mineminenomi.api.helpers.AbilityHelper;
import xyz.pixelatedw.mineminenomi.api.helpers.AttributeHelper;
import xyz.pixelatedw.mineminenomi.api.morph.MorphInfo;
import xyz.pixelatedw.mineminenomi.data.entity.ability.AbilityDataCapability;
import xyz.pixelatedw.mineminenomi.init.ModAttributes;
import xyz.pixelatedw.mineminenomi.init.ModEffects;

import java.util.UUID;

public class SeiryuHeavyPointAbility extends MorphAbility2 {
    private static final ITextComponent[] DESCRIPTION = AbilityHelper.registerDescriptionText(UoUoMod.MOD_ID, "seiryu_heavy_point", ImmutablePair.of("User Transforms into dragon-human Hybrid, giving him extreme resistance and damage boost", null));
    public static final AbilityCore<SeiryuHeavyPointAbility> INSTANCE = new AbilityCore.Builder<>("Seiryu Heavy Point", AbilityCategory.DEVIL_FRUITS, SeiryuHeavyPointAbility::new)
            .addDescriptionLine(DESCRIPTION).build();

    public SeiryuHeavyPointAbility(AbilityCore<SeiryuHeavyPointAbility> core) {
        super(core);
        this.continuousComponent.addStartEvent(this::onStart);
        this.statsComponent.addAttributeModifier(ModAttributes.TOUGHNESS, new AbilityAttributeModifier(AttributeHelper.MORPH_TOUGHNESS_UUID, INSTANCE, "Seiryu Heavy Point Toughness Modifier", 120, AttributeModifier.Operation.ADDITION), entity -> this.isContinuous());
        this.statsComponent.addAttributeModifier(Attributes.ARMOR, new AbilityAttributeModifier(AttributeHelper.MORPH_ARMOR_UUID, INSTANCE, "Seiryu Heavy Point Armor Modifier", 30, AttributeModifier.Operation.ADDITION), entity -> this.isContinuous());
    }

    private void onStart(LivingEntity livingEntity, IAbility ability) {
        if (isFullyDrunk(livingEntity)) {
            this.statsComponent.addAttributeModifier(Attributes.MAX_HEALTH, new AbilityAttributeModifier(UUID.fromString("c35bc0b9-16e5-4010-a3e0-eb41cd18b5a7"), INSTANCE, "Seiryu Heavy Point Health Modifier", 75, AttributeModifier.Operation.ADDITION), entity -> this.isContinuous());
            this.statsComponent.addAttributeModifier(Attributes.ATTACK_DAMAGE, new AbilityAttributeModifier(UUID.fromString("90d99ba5-e3f6-4873-8b19-697ff2ecdbf9"), INSTANCE, "Seiryu Heavy Point Damage Modifier", 15, AttributeModifier.Operation.MULTIPLY_TOTAL), entity -> this.isContinuous());
        } else {
            this.statsComponent.addAttributeModifier(Attributes.MAX_HEALTH, new AbilityAttributeModifier(AttributeHelper.MORPH_HEALTH_UUID, INSTANCE, "Seiryu Heavy Point Health Modifier", 50, AttributeModifier.Operation.ADDITION), entity -> this.isContinuous());
            this.statsComponent.addAttributeModifier(Attributes.ATTACK_DAMAGE, new AbilityAttributeModifier(AttributeHelper.MORPH_STRENGTH_UUID, INSTANCE, "Seiryu Heavy Point Damage Modifier", 10, AttributeModifier.Operation.MULTIPLY_TOTAL), entity -> this.isContinuous());
        }
    }

    public MorphInfo getTransformation() {
        return UoMorphs.SEIRYU_HEAVY.get();
    }

    public static boolean isFullyDrunk(LivingEntity entity) {
        EffectInstance instance = entity.getEffect(ModEffects.DRUNK.get());
        return isActive(entity) && instance != null && instance.getAmplifier() >= 4;
    }

    public static boolean isActive(LivingEntity entity) {
        SeiryuHeavyPointAbility ability = AbilityDataCapability.get(entity).getEquippedAbility(INSTANCE);
        return ability != null && ability.isContinuous();
    }
}
