package net.warcar.uo_uo_no_mi.abilities;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntitySize;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.util.text.ITextComponent;
import net.warcar.uo_uo_no_mi.UoUoMod;
import net.warcar.uo_uo_no_mi.abilities.components.MultiBoxComponent;
import net.warcar.uo_uo_no_mi.entities.LivingPartEntity;
import net.warcar.uo_uo_no_mi.init.UoMorphs;
import org.apache.commons.lang3.tuple.ImmutablePair;
import xyz.pixelatedw.mineminenomi.api.abilities.*;
import xyz.pixelatedw.mineminenomi.api.helpers.AbilityHelper;
import xyz.pixelatedw.mineminenomi.api.helpers.AttributeHelper;
import xyz.pixelatedw.mineminenomi.api.morph.MorphInfo;
import xyz.pixelatedw.mineminenomi.data.entity.ability.AbilityDataCapability;
import xyz.pixelatedw.mineminenomi.init.ModAttributes;

import java.util.ArrayList;
import java.util.List;

public class SeiryuFlyPointAbility extends MorphAbility2 {
    private static final ITextComponent[] DESCRIPTION = AbilityHelper.registerDescriptionText(UoUoMod.MOD_ID, "seiryu_fly_point", ImmutablePair.of("User Transforms into flying dragon, giving him great resistance and damage boost", null));
    public static final AbilityCore<SeiryuFlyPointAbility> INSTANCE = new AbilityCore.Builder<>("Seiryu Fly Point", AbilityCategory.DEVIL_FRUITS, SeiryuFlyPointAbility::new)
            .addDescriptionLine(DESCRIPTION).build();
    private static final float[] SIZEMAP = {0, 18.0F, 18.0F, 26.0F, 39.0F, 26.0F, 40.0F, 39.0F, 27.0F, 37.0F, 28.0F, 39.0F, 37.0F, 27.0F, 40.0F, 40.0F, 40.0F, 40.0F, 40.0F, 40.0F, 40.0F, 40.0F, 40.0F, 40.0F, 40.0F, 40.0F, 40.0F, 40.0F, 40.0F, 40.0F, 40.0F, 40.0F, 40.0F, 40.0F, 40.0F, 40.0F, 40.0F, 40.0F, 40.0F, 40.0F, 40.0F, 40.0F, 40.0F, 40.0F, 40.0F, 40.0F, 40.0F, 40.0f, 40.0f, 40.0f, 40.0f, 40.0f, 40.0f, 40.0f, 40.0f, 38.253f, 33.747f, 33.0f, 32.0F, 12f};

    private final MultiBoxComponent boxComponent;

    public SeiryuFlyPointAbility(AbilityCore<SeiryuFlyPointAbility> core) {
        super(core);
        boxComponent = new MultiBoxComponent(this);
        this.addComponents(boxComponent);
        this.continuousComponent.addStartEvent(this::startContinuous);
        this.continuousComponent.addTickEvent(this::duringContinuous);
        this.continuousComponent.addEndEvent(this::endContinuous);
        this.statsComponent.addAttributeModifier(ModAttributes.TOUGHNESS, new AbilityAttributeModifier(AttributeHelper.MORPH_TOUGHNESS_UUID, INSTANCE, "Seiryu Fly Point Toughness Modifier", 3, AttributeModifier.Operation.ADDITION), entity -> this.isContinuous());
        this.statsComponent.addAttributeModifier(Attributes.ARMOR, new AbilityAttributeModifier(AttributeHelper.MORPH_ARMOR_UUID, INSTANCE, "Seiryu Fly Point Armor Modifier", 20, AttributeModifier.Operation.ADDITION), entity -> this.isContinuous());
        this.statsComponent.addAttributeModifier(Attributes.ATTACK_DAMAGE, new AbilityAttributeModifier(AttributeHelper.MORPH_STRENGTH_UUID, INSTANCE, "Seiryu Fly Point Damage Modifier", 5, AttributeModifier.Operation.MULTIPLY_TOTAL), entity -> this.isContinuous());
    }

    public MorphInfo getTransformation() {
        return UoMorphs.SEIRYU_FLY.get();
    }

    private void duringContinuous(LivingEntity entity, IAbility ability) {
        for (LivingPartEntity partEntity : boxComponent.getEntities()) {
            partEntity.yRot = 0;
            partEntity.xRot = 0;
        }

        double speed = entity.getDeltaMovement().multiply(1, 0, 1).length();
        if (speed > 0) {
            for (int i = 0; i < boxComponent.getEntities().length; i++) {
                double animPos = Math.toRadians(entity.tickCount) * 3;
                boxComponent.getEntities()[i].yRot = (float) Math.toDegrees(Math.cos(i - animPos) / 3);
                if (i > 0) {
                    boxComponent.getEntities()[i].yRot -= (float) Math.toDegrees(Math.cos(i - 1 - animPos) / 3);
                }
            }
        } else {
            for (int i = 0; i < 6; i++) {
                boxComponent.getEntities()[i].xRot = -90 + i * 15;
            }
            for (int i = 6; i < boxComponent.getEntities().length; i++) {
                boxComponent.getEntities()[i].yRot = 25 - (float) i / 3 + boxComponent.getEntities()[i - 1].yRot;
            }
        }
        for (int i = 0; i < this.boxComponent.getEntities().length; i++) {
            LivingPartEntity partEntity = this.boxComponent.getEntities()[i];
            Entity prev;
            if (i == 0) {
                prev = entity;
            } else {
                prev = this.boxComponent.getEntities()[i - 1];
            }
            partEntity.yRot += entity.yBodyRot;
            Vector3d pos = new Vector3d(Math.cos(Math.toRadians(prev.yRot + 90)), Math.cos(Math.toRadians(prev.xRot + 90)), Math.sin(Math.toRadians(prev.yRot + 90))).scale(-SIZEMAP[i] / 16 * 5).add(prev.position());
            partEntity.setPos(pos.x, pos.y, pos.z);
            partEntity.setPosAndOldPos(pos.x, pos.y, pos.z);
        }
    }

    private void endContinuous(LivingEntity entity, IAbility ability) {
        this.boxComponent.setDisabled(true);
        for (LivingPartEntity partEntity : this.boxComponent.getEntities()) {
            partEntity.remove();
        }
        this.boxComponent.setEntities();
    }

    private void startContinuous(LivingEntity entity, IAbility ability) {
        List<LivingPartEntity> parts = new ArrayList<>();
        for (int i = 0; i < 59; i++) {
            LivingPartEntity partEntity = new LivingPartEntity(entity, EntitySize.scalable(SIZEMAP[i + 1] / 4, 10));
            partEntity.setId(entity.getId() + i + 1);
            parts.add(partEntity);
        }
        this.boxComponent.setEntities(parts.toArray(new LivingPartEntity[0]));
        this.boxComponent.setDisabled(false);
    }

    public static boolean isActive(LivingEntity entity) {
        SeiryuFlyPointAbility ability = AbilityDataCapability.get(entity).getEquippedAbility(INSTANCE);
        return ability != null && ability.isContinuous();
    }
}
