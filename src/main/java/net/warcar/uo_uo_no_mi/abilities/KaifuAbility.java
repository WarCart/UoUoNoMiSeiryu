package net.warcar.uo_uo_no_mi.abilities;

import net.minecraft.entity.LivingEntity;
import net.warcar.uo_uo_no_mi.init.UoMorphs;
import net.warcar.uo_uo_no_mi.mixins.AbilityProjectileMixin;
import xyz.pixelatedw.mineminenomi.api.abilities.AbilityCategory;
import xyz.pixelatedw.mineminenomi.api.abilities.AbilityCore;
import xyz.pixelatedw.mineminenomi.api.abilities.ExplosionAbility;
import xyz.pixelatedw.mineminenomi.api.abilities.RepeaterAbility2;
import xyz.pixelatedw.mineminenomi.api.abilities.components.RequireMorphComponent;
import xyz.pixelatedw.mineminenomi.api.helpers.AbilityHelper;
import xyz.pixelatedw.mineminenomi.entities.projectiles.AbilityProjectileEntity;
import xyz.pixelatedw.mineminenomi.entities.projectiles.rokushiki.RankyakuProjectile;
import xyz.pixelatedw.mineminenomi.entities.projectiles.swordsman.YakkodoriProjectile;

public class KaifuAbility extends RepeaterAbility2 {
    public static final AbilityCore<KaifuAbility> INSTANCE = new AbilityCore.Builder<>("Kaifu", AbilityCategory.DEVIL_FRUITS, KaifuAbility::new).build();
    private final RequireMorphComponent morphComponent;
    public KaifuAbility(AbilityCore<KaifuAbility> core) {
        super(core);
        this.setCustomShootLogic(entity -> {
            for (int i = 0; i < 5; i++) {
                this.projectileComponent.shootWithSpread(entity, 2, 1, 3);
            }
        });
        this.morphComponent = new RequireMorphComponent(this, UoMorphs.SEIRYU_FLY.get(), UoMorphs.SEIRYU_HEAVY.get());
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
        if (livingEntity.getRandom().nextBoolean()) {
            entity = new RankyakuProjectile(livingEntity.level, livingEntity);
        } else {
            entity = new YakkodoriProjectile(livingEntity.level, livingEntity);
        }
        entity.setMaxLife(100);
        entity.setDamage(65);
        ((AbilityProjectileMixin) entity).setParent(INSTANCE);
        entity.onBlockImpactEvent = hit -> {
            ExplosionAbility explosion = AbilityHelper.newExplosion(livingEntity, livingEntity.level, hit.getX(), hit.getY(), hit.getZ(), 3);
            explosion.setStaticDamage(5);
            explosion.doExplosion();
            entity.remove();
        };
        return entity;
    }
}
