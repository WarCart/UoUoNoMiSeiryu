package net.warcar.uo_uo_no_mi.abilities;

import net.minecraft.entity.LivingEntity;
import net.warcar.uo_uo_no_mi.init.UoMorphs;
import net.warcar.uo_uo_no_mi.mixins.AbilityProjectileMixin;
import xyz.pixelatedw.mineminenomi.api.abilities.*;
import xyz.pixelatedw.mineminenomi.api.abilities.components.RequireMorphComponent;
import xyz.pixelatedw.mineminenomi.api.helpers.AbilityHelper;
import xyz.pixelatedw.mineminenomi.entities.projectiles.AbilityProjectileEntity;
import xyz.pixelatedw.mineminenomi.entities.projectiles.rokushiki.RankyakuProjectile;
import xyz.pixelatedw.mineminenomi.entities.projectiles.swordsman.YakkodoriProjectile;

public class KaifuAbility extends RepeaterAbility2 {
    public static final AbilityCore<KaifuAbility> INSTANCE =
            new AbilityCore.Builder<>("Kaifu", AbilityCategory.DEVIL_FRUITS, KaifuAbility::new)
                    .addDescriptionLine(AbilityDescriptionLine.NEW_LINE, RequireMorphComponent.getTooltip()).build();
    private final RequireMorphComponent morphComponent;
    public KaifuAbility(AbilityCore<KaifuAbility> core) {
        super(core);
        this.setCustomShootLogic(entity -> {
            for (int i = 0; i < 5; i++) {
                this.projectileComponent.shootWithSpread(entity, 2, 1, 3);
            }
        });
        this.morphComponent = new RequireMorphComponent(this, UoMorphs.SEIRYU_FLY.get());
        this.addCanUseCheck(this::beforeUse);
        this.addComponents(morphComponent);
    }

    public int getMaxTriggers() {
        return 20;
    }

    public int getTriggerInterval() {
        return 4;
    }

    public float getRepeaterCooldown() {
        return 300;
    }

    public AbilityProjectileEntity getProjectileFactory(LivingEntity livingEntity) {
        AbilityProjectileEntity entity;
        if (livingEntity.getRandom().nextBoolean() && !SeiryuHeavyPointAbility.isFullyDrunk(livingEntity)) {
            entity = new RankyakuProjectile(livingEntity.level, livingEntity);
        } else {
            entity = new YakkodoriProjectile(livingEntity.level, livingEntity);
        }
        entity.setMaxLife(100);
        entity.setDamage(65);
        ((AbilityProjectileMixin) entity).setParent(INSTANCE);
        entity.setBlocksAffectedLimit(20);
        return entity;
    }

    private AbilityUseResult beforeUse(LivingEntity entity, IAbility ability) {
        if (SeiryuHeavyPointAbility.isFullyDrunk(entity) && AbilityHelper.canUseSwordsmanAbilities(entity)) {
            this.projectileComponent.shoot(entity);
            this.cooldownComponent.startCooldown(entity, 450);
            return AbilityUseResult.fail(null);
        } else if (SeiryuHeavyPointAbility.isFullyDrunk(entity)) {
            return AbilityHelper.canUseSwordsmanAbilities(entity, ability);
        }
        return AbilityUseResult.success();
    }
}
