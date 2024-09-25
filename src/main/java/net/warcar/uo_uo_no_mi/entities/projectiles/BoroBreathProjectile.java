package net.warcar.uo_uo_no_mi.entities.projectiles;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.world.World;
import xyz.pixelatedw.mineminenomi.api.abilities.AbilityCore;
import xyz.pixelatedw.mineminenomi.api.abilities.ExplosionAbility;
import xyz.pixelatedw.mineminenomi.api.helpers.AbilityHelper;
import xyz.pixelatedw.mineminenomi.entities.projectiles.AbilityProjectileEntity;
import xyz.pixelatedw.mineminenomi.particles.effects.CommonExplosionParticleEffect;

import javax.annotation.Nullable;

public class BoroBreathProjectile extends AbilityProjectileEntity {
    private int collisions = 0;
    public BoroBreathProjectile(EntityType type, World world) {
        super(type, world);
    }

    public BoroBreathProjectile(World world, LivingEntity thrower, @Nullable AbilityCore parent) {
        this(world, thrower, parent, false);
    }

    public BoroBreathProjectile(World world, LivingEntity thrower, @Nullable AbilityCore parent, boolean large) {
        super(large ? UoProjectiles.BORO_BREATH_LARGE.get() : UoProjectiles.BORO_BREATH.get(), world, thrower, parent);
        this.setCanGetStuckInGround();
        this.setPassThroughEntities();
        this.setDamage(large ? 50 : 100);
        this.setLife(200);
        this.onBlockImpactEvent = pos -> {
            collisions++;
            ExplosionAbility explosion = AbilityHelper.newExplosion(thrower, world, pos.getX(), pos.getY(), pos.getZ(), large ? 30 : 10);
            explosion.setFireAfterExplosion(true);
            explosion.setSmokeParticles(new CommonExplosionParticleEffect());
            explosion.setStaticDamage(20);
            explosion.doExplosion();
            if (collisions >= 100) {
                this.remove();
            }
        };
    }
}
