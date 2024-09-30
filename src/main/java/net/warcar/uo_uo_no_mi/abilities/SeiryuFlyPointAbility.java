package net.warcar.uo_uo_no_mi.abilities;

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

    private final MultiBoxComponent boxComponent;

    public SeiryuFlyPointAbility(AbilityCore<SeiryuFlyPointAbility> core) {
        super(core);
        boxComponent = new MultiBoxComponent(this);
        this.addComponents(boxComponent);
        this.continuousComponent.addStartEvent(this::startContinuous);
        this.continuousComponent.addTickEvent(this::duringContinuous);
        this.continuousComponent.addEndEvent(this::endContinuous);
        this.statsComponent.addAttributeModifier(ModAttributes.TOUGHNESS, new AbilityAttributeModifier(AttributeHelper.MORPH_TOUGHNESS_UUID, INSTANCE, "Seiryu Fly Point Toughness Modifier", 50, AttributeModifier.Operation.ADDITION), entity -> this.isContinuous());
        this.statsComponent.addAttributeModifier(Attributes.ARMOR, new AbilityAttributeModifier(AttributeHelper.MORPH_ARMOR_UUID, INSTANCE, "Seiryu Fly Point Armor Modifier", 20, AttributeModifier.Operation.ADDITION), entity -> this.isContinuous());
        this.statsComponent.addAttributeModifier(Attributes.ATTACK_DAMAGE, new AbilityAttributeModifier(AttributeHelper.MORPH_STRENGTH_UUID, INSTANCE, "Seiryu Fly Point Damage Modifier", 5, AttributeModifier.Operation.MULTIPLY_TOTAL), entity -> this.isContinuous());
    }

    public MorphInfo getTransformation() {
        return UoMorphs.SEIRYU_FLY.get();
    }

    private void duringContinuous(LivingEntity entity, IAbility ability) {
        float headRot = MathHelper.lerp(1.0F, entity.yHeadRot, entity.yBodyRot);
        float rot = headRot * 0.017453292F;
        float x = MathHelper.sin(rot);
        float z = MathHelper.cos(rot);
        for (int i = 0; i < this.boxComponent.getEntities().length; i++) {
            LivingPartEntity partEntity = this.boxComponent.getEntities()[i];
            double xOffset = 10 * (i + 1);
            double zOffset = (Math.sin((double) (i + 1) / 10 + (double) entity.tickCount / 20) - (Math.sin(Math.PI / 2) / Math.PI)) * (((double) i / 5) + 3);
            Vector3d pos = entity.position().add(zOffset * z + xOffset * x, 0, -xOffset * z + zOffset * x);
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
        for (int i = 0; i < 100; i++) {
            LivingPartEntity partEntity = new LivingPartEntity(entity, EntitySize.scalable(10, 10));
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
